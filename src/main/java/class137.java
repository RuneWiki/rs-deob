import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class137 extends class283 {

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public int field2292 = -1;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    private int field2293 = 0;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    private int field2291 = -1;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public int field2297 = 0;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    private int field2295;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V", line = 6)
    public final void method892(int arg0, int arg1) {
        class249.method1679();
        int var3 = this.field4379 + arg0;
        int var4 = this.field4382 + arg1;
        GL var5 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        var5.glTranslatef((float) var3, (float) (class249.field3888 - var4), 0.0F);
        var5.glCallList(this.field2291);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIII)V", line = 18)
    public final void method893(int arg0, int arg1, int arg2, int arg3) {
        class249.method1679();
        GL var5 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        float var6 = (float) this.field4377 / (float) this.field2296;
        float var7 = (float) this.field4383 / (float) this.field2294;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field4379 + arg0;
        int var11 = this.field4377 * arg2 + var10;
        int var12 = class249.field3888 - arg1 - this.field4382;
        int var13 = var12 - this.field4383 * arg3;
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

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(IIIII)V", line = 50)
    public final void method894(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class249.method1684();
        GL var6 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        float var7 = (float) this.field4377 / (float) this.field2296;
        float var8 = (float) this.field4383 / (float) this.field2294;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field4379 + arg0;
        int var12 = this.field4377 * arg3 + var11;
        int var13 = class249.field3888 - arg1 - this.field4382;
        int var14 = var13 - this.field4383 * arg4;
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

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field4375 = arg0;
        this.field4373 = arg1;
        this.field4379 = arg2;
        this.field4382 = arg3;
        this.field4377 = arg4;
        this.field4383 = arg5;
        this.method645(arg6);
        this.method900();
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lfd;)V", line = 582)
    public class137(class206 arg0) {
        this.field4375 = arg0.field4375;
        this.field4373 = arg0.field4373;
        this.field4379 = arg0.field4379;
        this.field4382 = arg0.field4382;
        this.field4377 = arg0.field4377;
        this.field4383 = arg0.field4383;
        this.method645(arg0.field3353);
        this.method900();
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIIIII)V", line = 87)
    public final void method895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249.method1679();
        GL var7 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(2);
        int var8 = arg0 - (this.field4379 << 4);
        int var9 = arg1 - (this.field4382 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class249.field3888 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2291);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V", line = 104)
    protected final void finalize() throws Throwable {
        if (this.field2292 != -1) {
            class258.method1730(this.field2292, this.field2297, this.field2295);
            this.field2292 = -1;
            this.field2297 = 0;
        }
        if (this.field2291 != -1) {
            class258.method1728(this.field2291, this.field2295);
            this.field2291 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)V", line = 120)
    public final void method896(int arg0, int arg1) {
        class249.method1679();
        int var3 = this.field4379 + arg0;
        int var4 = this.field4382 + arg1;
        GL var5 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        var5.glTranslatef((float) var3, (float) (class249.field3888 - var4), 0.0F);
        float var6 = (float) this.field4377 / (float) this.field2296;
        float var7 = (float) this.field4383 / (float) this.field2294;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field4377, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field4383));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field4377, (float) (-this.field4383));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIILdh;)V", line = 146)
    public final void method897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8) {
        if (arg8 == null) {
            return;
        }
        class249.method1679();
        class249.method1689(arg8.field2292);
        arg8.method898(1);
        GL var10 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field2292);
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
        float var27 = (float) arg8.field4377 / (float) arg8.field2296;
        float var28 = (float) arg8.field4383 / (float) arg8.field2294;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field2296 * 65536.0F;
        float var30 = (float) (this.field2294 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class249.field3888 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class249.field3888 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class249.field3888 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class249.field3888 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V", line = 224)
    private final void method898(int arg0) {
        if (this.field2293 == arg0) {
            return;
        }
        this.field2293 = arg0;
        GL var2 = class249.field3898;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILdh;)V", line = 243)
    public final void method899(int arg0, int arg1, class137 arg2) {
        if (arg2 == null) {
            return;
        }
        class249.method1679();
        class249.method1689(arg2.field2292);
        arg2.method898(1);
        GL var4 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field2292);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class115.field2030) / (float) arg2.field2296;
        float var6 = (float) (arg1 - class115.field2033) / (float) arg2.field2294;
        float var7 = (float) (this.field4377 + arg0 - class115.field2030) / (float) arg2.field2296;
        float var8 = (float) (this.field4383 + arg1 - class115.field2033) / (float) arg2.field2294;
        int var9 = this.field4379 + arg0;
        int var10 = this.field4382 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field4377 / (float) this.field2296;
        float var12 = (float) this.field4383 / (float) this.field2294;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field4377 + var9), (float) (class249.field3888 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class249.field3888 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class249.field3888 - (this.field4383 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field4377 + var9), (float) (class249.field3888 - (this.field4383 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()V", line = 294)
    private final void method900() {
        float var1 = (float) this.field4377 / (float) this.field2296;
        float var2 = (float) this.field4383 / (float) this.field2294;
        GL var3 = class249.field3898;
        if (this.field2291 == -1) {
            this.field2291 = var3.glGenLists(1);
            this.field2295 = class258.field4013;
        }
        var3.glNewList(this.field2291, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4377, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4383));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4377, (float) (-this.field4383));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V", line = 320)
    public final void method901(int arg0, int arg1) {
        class249.method1679();
        int var3 = this.field4379 + arg0;
        int var4 = this.field4382 + arg1;
        GL var5 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        var5.glTranslatef((float) var3, (float) (class249.field3888 - var4), 0.0F);
        var5.glCallList(this.field2291);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII)V", line = 332)
    public final void method902(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249.method1679();
        GL var7 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        int var8 = arg0 - (this.field4379 << 4);
        int var9 = arg1 - (this.field4382 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class249.field3888 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2291);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V", line = 349)
    public final void method903(int arg0, int arg1, int arg2) {
        class249.method1684();
        int var4 = this.field4379 + arg0;
        int var5 = this.field4382 + arg1;
        GL var6 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class249.field3888 - var5), 0.0F);
        var6.glCallList(this.field2291);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([I)V", line = 362)
    public void method645(int[] arg0) {
        this.field2296 = class226.method1510(27147, this.field4377);
        this.field2294 = class226.method1510(27147, this.field4383);
        byte[] var2 = new byte[this.field2296 * this.field2294 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2296 - this.field4377) * 4;
        for (int var6 = 0; var6 < this.field4383; var6++) {
            for (int var7 = 0; var7 < this.field4377; var7++) {
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
        GL var10 = class249.field3898;
        if (this.field2292 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2292 = var11[0];
            this.field2295 = class258.field4013;
        }
        class249.method1689(this.field2292);
        var10.glTexImage2D(3553, 0, 6408, this.field2296, this.field2294, 0, 6408, 5121, var9);
        class258.field4011 += var9.limit() - this.field2297;
        this.field2297 = var9.limit();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V", line = 420)
    public final void method904(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class249.method1684();
        int var6 = this.field4377;
        int var7 = this.field4383;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4375;
        int var11 = this.field4373;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4379 > 0) {
            int var14 = ((this.field4379 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4379 << 16);
        }
        if (this.field4382 > 0) {
            int var15 = ((this.field4382 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4382 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class249.field3888 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field4377 / (float) this.field2296;
        float var22 = (float) this.field4383 / (float) this.field2294;
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

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V", line = 493)
    public final void method905(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class249.method1679();
        int var5 = this.field4377;
        int var6 = this.field4383;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4375;
        int var10 = this.field4373;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4379 > 0) {
            int var13 = ((this.field4379 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4379 << 16);
        }
        if (this.field4382 > 0) {
            int var14 = ((this.field4382 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4382 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class249.field3898;
        class249.method1689(this.field2292);
        this.method898(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class249.field3888 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field4377 / (float) this.field2296;
        float var21 = (float) this.field4383 / (float) this.field2294;
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
}
