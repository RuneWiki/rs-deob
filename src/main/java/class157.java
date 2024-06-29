import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class157 extends class171 {

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public int field2778 = -1;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    private int field2777 = 0;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    private int field2781 = -1;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public int field2782 = 0;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    private int field2780;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IIII)V", line = 6)
    public final void method1247(int arg0, int arg1, int arg2, int arg3) {
        class43.method391();
        GL var5 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        float var6 = (float) this.field2967 / (float) this.field2783;
        float var7 = (float) this.field2965 / (float) this.field2779;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field2964 + arg0;
        int var11 = this.field2967 * arg2 + var10;
        int var12 = class43.field665 - arg1 - this.field2958;
        int var13 = var12 - this.field2965 * arg3;
        var5.glBegin(6);
        var5.glTexCoord2f(var8, 0.0F);
        var5.glVertex2f((float) var11, (float) var12);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) var10, (float) var12);
        var5.glTexCoord2f(0.0F, var9);
        var5.glVertex2f((float) var10, (float) var13);
        var5.glTexCoord2f(var8, var9);
        var5.glVertex2f((float) var11, (float) var13);
        var5.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(II)V", line = 37)
    public final void method1248(int arg0, int arg1) {
        class43.method391();
        int var3 = this.field2964 + arg0;
        int var4 = this.field2958 + arg1;
        GL var5 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        var5.glTranslatef((float) var3, (float) (class43.field665 - var4), 0.0F);
        var5.glCallList(this.field2781);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(II)V", line = 49)
    public final void method1249(int arg0, int arg1) {
        class43.method391();
        int var3 = this.field2964 + arg0;
        int var4 = this.field2958 + arg1;
        GL var5 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        var5.glTranslatef((float) var3, (float) (class43.field665 - var4), 0.0F);
        var5.glCallList(this.field2781);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!d", name = "finalize", descriptor = "()V", line = 63)
    protected final void finalize() throws Throwable {
        if (this.field2778 != -1) {
            class151.method1186(this.field2778, this.field2782, this.field2780);
            this.field2778 = -1;
            this.field2782 = 0;
        }
        if (this.field2781 != -1) {
            class151.method1192(this.field2781, this.field2780);
            this.field2781 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIILd;)V", line = 79)
    public final void method1250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class157 arg8) {
        if (arg8 == null) {
            return;
        }
        class43.method391();
        class43.method390(arg8.field2778);
        arg8.method1261(1);
        GL var10 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field2778);
        var10.glTexEnvi(8960, 34161, 7681);
        var10.glTexEnvi(8960, 34176, 34168);
        int var11 = -arg2 / 2;
        int var12 = -arg3 / 2;
        int var13 = -var11;
        int var14 = -var12;
        int var15 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
        int var16 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
        int var17 = arg7 * var15 >> 8;
        int var18 = arg7 * var16 >> 8;
        int var19 = (arg4 << 16) + var11 * var18 + var12 * var17;
        int var20 = (arg5 << 16) + (var12 * var18 - var11 * var17);
        int var21 = (arg4 << 16) + var12 * var17 + var13 * var18;
        int var22 = (arg5 << 16) + (var12 * var18 - var13 * var17);
        int var23 = (arg4 << 16) + var11 * var18 + var14 * var17;
        int var24 = (arg5 << 16) + (var14 * var18 - var11 * var17);
        int var25 = (arg4 << 16) + var13 * var18 + var14 * var17;
        int var26 = (arg5 << 16) + (var14 * var18 - var13 * var17);
        float var27 = (float) arg8.field2967 / (float) arg8.field2783;
        float var28 = (float) arg8.field2965 / (float) arg8.field2779;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field2783 * 65536.0F;
        float var30 = (float) (this.field2779 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class43.field665 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class43.field665 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class43.field665 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class43.field665 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIII)V", line = 154)
    public final void method1251(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class43.method391();
        int var5 = this.field2967;
        int var6 = this.field2965;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2957;
        int var10 = this.field2969;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2964 > 0) {
            int var13 = ((this.field2964 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2964 << 16);
        }
        if (this.field2958 > 0) {
            int var14 = ((this.field2958 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2958 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class43.field665 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field2967 / (float) this.field2783;
        float var21 = (float) this.field2965 / (float) this.field2779;
        var15.glBegin(6);
        var15.glTexCoord2f(var20, 0.0F);
        var15.glVertex2f(var17, var18);
        var15.glTexCoord2f(0.0F, 0.0F);
        var15.glVertex2f(var16, var18);
        var15.glTexCoord2f(0.0F, var21);
        var15.glVertex2f(var16, var19);
        var15.glTexCoord2f(var20, var21);
        var15.glVertex2f(var17, var19);
        var15.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIIII)V", line = 224)
    public final void method1252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class43.method391();
        GL var7 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(2);
        int var8 = arg0 - (this.field2964 << 4);
        int var9 = arg1 - (this.field2958 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class43.field665 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2781);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILd;)V", line = 241)
    public final void method1253(int arg0, int arg1, class157 arg2) {
        if (arg2 == null) {
            return;
        }
        class43.method391();
        class43.method390(arg2.field2778);
        arg2.method1261(1);
        GL var4 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field2778);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class169.field2939) / (float) arg2.field2783;
        float var6 = (float) (arg1 - class169.field2940) / (float) arg2.field2779;
        float var7 = (float) (this.field2967 + arg0 - class169.field2939) / (float) arg2.field2783;
        float var8 = (float) (this.field2965 + arg1 - class169.field2940) / (float) arg2.field2779;
        int var9 = this.field2964 + arg0;
        int var10 = this.field2958 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2967 / (float) this.field2783;
        float var12 = (float) this.field2965 / (float) this.field2779;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2967 + var9), (float) (class43.field665 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class43.field665 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class43.field665 - (this.field2965 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2967 + var9), (float) (class43.field665 - (this.field2965 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(II)V", line = 292)
    public final void method1254(int arg0, int arg1) {
        class43.method391();
        int var3 = this.field2964 + arg0;
        int var4 = this.field2958 + arg1;
        GL var5 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        var5.glTranslatef((float) var3, (float) (class43.field665 - var4), 0.0F);
        float var6 = (float) this.field2967 / (float) this.field2783;
        float var7 = (float) this.field2965 / (float) this.field2779;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field2967, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field2965));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field2967, (float) (-this.field2965));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([I)V", line = 317)
    public void method1255(int[] arg0) {
        this.field2783 = class168.method1318(this.field2967, false);
        this.field2779 = class168.method1318(this.field2965, false);
        byte[] var2 = new byte[this.field2783 * this.field2779 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2783 - this.field2967) * 4;
        for (int var6 = 0; var6 < this.field2965; var6++) {
            for (int var7 = 0; var7 < this.field2967; var7++) {
                int var8 = arg0[var4++];
                if (var8 == 0) {
                    var3 += 4;
                } else {
                    var2[var3++] = (byte) (var8 >> 16);
                    var2[var3++] = (byte) (var8 >> 8);
                    var2[var3++] = (byte) var8;
                    var2[var3++] = -1;
                }
            }
            var3 += var5;
        }
        ByteBuffer var9 = ByteBuffer.wrap(var2);
        GL var10 = class43.field651;
        if (this.field2778 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2778 = var11[0];
            this.field2780 = class151.field2669;
        }
        class43.method390(this.field2778);
        var10.glTexImage2D(3553, 0, 6408, this.field2783, this.field2779, 0, 6408, 5121, var9);
        class151.field2667 += var9.limit() - this.field2782;
        this.field2782 = var9.limit();
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIII)V", line = 375)
    public final void method1256(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class43.method384();
        GL var6 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        float var7 = (float) this.field2967 / (float) this.field2783;
        float var8 = (float) this.field2965 / (float) this.field2779;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field2964 + arg0;
        int var12 = this.field2967 * arg3 + var11;
        int var13 = class43.field665 - arg1 - this.field2958;
        int var14 = var13 - this.field2965 * arg4;
        float var15 = (float) arg2 / 256.0F;
        var6.glBegin(6);
        var6.glColor4f(1.0F, 1.0F, 1.0F, var15);
        var6.glTexCoord2f(var9, 0.0F);
        var6.glVertex2f((float) var12, (float) var13);
        var6.glTexCoord2f(0.0F, 0.0F);
        var6.glVertex2f((float) var11, (float) var13);
        var6.glTexCoord2f(0.0F, var10);
        var6.glVertex2f((float) var11, (float) var14);
        var6.glTexCoord2f(var9, var10);
        var6.glVertex2f((float) var12, (float) var14);
        var6.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field2957 = arg0;
        this.field2969 = arg1;
        this.field2964 = arg2;
        this.field2958 = arg3;
        this.field2967 = arg4;
        this.field2965 = arg5;
        this.method1255(arg6);
        this.method1258();
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ln;)V", line = 582)
    public class157(class309 arg0) {
        this.field2957 = arg0.field2957;
        this.field2969 = arg0.field2969;
        this.field2964 = arg0.field2964;
        this.field2958 = arg0.field2958;
        this.field2967 = arg0.field2967;
        this.field2965 = arg0.field2965;
        this.method1255(arg0.field4907);
        this.method1258();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII)V", line = 412)
    public final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class43.method391();
        GL var7 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        int var8 = arg0 - (this.field2964 << 4);
        int var9 = arg1 - (this.field2958 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class43.field665 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2781);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V", line = 430)
    private final void method1258() {
        float var1 = (float) this.field2967 / (float) this.field2783;
        float var2 = (float) this.field2965 / (float) this.field2779;
        GL var3 = class43.field651;
        if (this.field2781 == -1) {
            this.field2781 = var3.glGenLists(1);
            this.field2780 = class151.field2669;
        }
        var3.glNewList(this.field2781, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2967, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2965));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2967, (float) (-this.field2965));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V", line = 464)
    public final void method1259(int arg0, int arg1, int arg2) {
        class43.method384();
        int var4 = this.field2964 + arg0;
        int var5 = this.field2958 + arg1;
        GL var6 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class43.field665 - var5), 0.0F);
        var6.glCallList(this.field2781);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V", line = 477)
    public final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class43.method384();
        int var6 = this.field2967;
        int var7 = this.field2965;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field2957;
        int var11 = this.field2969;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field2964 > 0) {
            int var14 = ((this.field2964 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field2964 << 16);
        }
        if (this.field2958 > 0) {
            int var15 = ((this.field2958 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field2958 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class43.field651;
        class43.method390(this.field2778);
        this.method1261(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class43.field665 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field2967 / (float) this.field2783;
        float var22 = (float) this.field2965 / (float) this.field2779;
        float var23 = (float) arg4 / 256.0F;
        var16.glBegin(6);
        var16.glColor4f(1.0F, 1.0F, 1.0F, var23);
        var16.glTexCoord2f(var21, 0.0F);
        var16.glVertex2f(var18, var19);
        var16.glTexCoord2f(0.0F, 0.0F);
        var16.glVertex2f(var17, var19);
        var16.glTexCoord2f(0.0F, var22);
        var16.glVertex2f(var17, var20);
        var16.glTexCoord2f(var21, var22);
        var16.glVertex2f(var18, var20);
        var16.glEnd();
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V", line = 551)
    private final void method1261(int arg0) {
        if (this.field2777 == arg0) {
            return;
        }
        this.field2777 = arg0;
        GL var2 = class43.field651;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}
