import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class361 extends class158 {

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    private int field5641 = 0;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    private int field5643 = -1;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public int field5644 = 0;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public int field5639 = -1;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    private int field5640;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 5)
    public final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.method353();
        GL var7 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        int var8 = arg0 - (this.field2248 << 4);
        int var9 = arg1 - (this.field2246 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class47.field621 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field5643);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V", line = 22)
    public final void method2506(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class47.method382();
        GL var6 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        float var7 = (float) this.field2252 / (float) this.field5642;
        float var8 = (float) this.field2250 / (float) this.field5645;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field2248 + arg0;
        int var12 = this.field2252 * arg3 + var11;
        int var13 = class47.field621 - arg1 - this.field2246;
        int var14 = var13 - this.field2250 * arg4;
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

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V", line = 56)
    public final void method84(int arg0, int arg1) {
        class47.method353();
        int var3 = this.field2248 + arg0;
        int var4 = this.field2246 + arg1;
        GL var5 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        var5.glTranslatef((float) var3, (float) (class47.field621 - var4), 0.0F);
        var5.glCallList(this.field5643);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 68)
    public final void method68(int arg0, int arg1, int arg2) {
        class47.method382();
        int var4 = this.field2248 + arg0;
        int var5 = this.field2246 + arg1;
        GL var6 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class47.field621 - var5), 0.0F);
        var6.glCallList(this.field5643);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 83)
    protected final void finalize() throws Throwable {
        if (this.field5639 != -1) {
            class298.method2039(this.field5639, this.field5644, this.field5640);
            this.field5639 = -1;
            this.field5644 = 0;
        }
        if (this.field5643 != -1) {
            class298.method2034(this.field5643, this.field5640);
            this.field5643 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 101)
    public void method872(int[] arg0) {
        this.field5642 = class262.method1805(this.field2252, (byte) 90);
        this.field5645 = class262.method1805(this.field2250, (byte) 112);
        byte[] var2 = new byte[this.field5645 * this.field5642 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field5642 - this.field2252) * 4;
        for (int var6 = 0; var6 < this.field2250; var6++) {
            for (int var7 = 0; var7 < this.field2252; var7++) {
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
        GL var10 = class47.field592;
        if (this.field5639 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field5639 = var11[0];
            this.field5640 = class298.field4320;
        }
        class47.method357(this.field5639);
        var10.glTexImage2D(3553, 0, 6408, this.field5642, this.field5645, 0, 6408, 5121, var9);
        class298.field4323 += var9.limit() - this.field5644;
        this.field5644 = var9.limit();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 161)
    private final void method2507() {
        float var1 = (float) this.field2252 / (float) this.field5642;
        float var2 = (float) this.field2250 / (float) this.field5645;
        GL var3 = class47.field592;
        if (this.field5643 == -1) {
            this.field5643 = var3.glGenLists(1);
            this.field5640 = class298.field4320;
        }
        var3.glNewList(this.field5643, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2252, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2250));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2252, (float) (-this.field2250));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILoa;)V", line = 187)
    public final void method2508(int arg0, int arg1, class361 arg2) {
        if (arg2 == null) {
            return;
        }
        class47.method353();
        class47.method357(arg2.field5639);
        arg2.method2512(1);
        GL var4 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field5639);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class129.field1763) / (float) arg2.field5642;
        float var6 = (float) (arg1 - class129.field1766) / (float) arg2.field5645;
        float var7 = (float) (this.field2252 + arg0 - class129.field1763) / (float) arg2.field5642;
        float var8 = (float) (this.field2250 + arg1 - class129.field1766) / (float) arg2.field5645;
        int var9 = this.field2248 + arg0;
        int var10 = this.field2246 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field2252 / (float) this.field5642;
        float var12 = (float) this.field2250 / (float) this.field5645;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field2252 + var9), (float) (class47.field621 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class47.field621 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class47.field621 - (this.field2250 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field2252 + var9), (float) (class47.field621 - (this.field2250 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIII)V", line = 237)
    public final void method2509(int arg0, int arg1, int arg2, int arg3) {
        class47.method353();
        GL var5 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        float var6 = (float) this.field2252 / (float) this.field5642;
        float var7 = (float) this.field2250 / (float) this.field5645;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field2248 + arg0;
        int var11 = this.field2252 * arg2 + var10;
        int var12 = class47.field621 - arg1 - this.field2246;
        int var13 = var12 - this.field2250 * arg3;
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

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIILoa;)V", line = 269)
    public final void method2510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class361 arg8) {
        if (arg8 == null) {
            return;
        }
        class47.method353();
        class47.method357(arg8.field5639);
        arg8.method2512(1);
        GL var10 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field5639);
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
        float var27 = (float) arg8.field2252 / (float) arg8.field5642;
        float var28 = (float) arg8.field2250 / (float) arg8.field5645;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field5642 * 65536.0F;
        float var30 = (float) (this.field5645 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class47.field621 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class47.field621 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class47.field621 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class47.field621 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V", line = 343)
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class47.method382();
        int var6 = this.field2252;
        int var7 = this.field2250;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field2244;
        int var11 = this.field2255;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field2248 > 0) {
            int var14 = ((this.field2248 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field2248 << 16);
        }
        if (this.field2246 > 0) {
            int var15 = ((this.field2246 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field2246 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class47.field621 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field2252 / (float) this.field5642;
        float var22 = (float) this.field2250 / (float) this.field5645;
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

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIII[I)V", line = 483)
    public class361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field2244 = arg0;
        this.field2255 = arg1;
        this.field2248 = arg2;
        this.field2246 = arg3;
        this.field2252 = arg4;
        this.field2250 = arg5;
        this.method872(arg6);
        this.method2507();
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lvn;)V", line = 493)
    public class361(class11 arg0) {
        this.field2244 = arg0.field2244;
        this.field2255 = arg0.field2255;
        this.field2248 = arg0.field2248;
        this.field2246 = arg0.field2246;
        this.field2252 = arg0.field2252;
        this.field2250 = arg0.field2250;
        this.method872(arg0.field124);
        this.method2507();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V", line = 423)
    public final void method85(int arg0, int arg1) {
        class47.method353();
        int var3 = this.field2248 + arg0;
        int var4 = this.field2246 + arg1;
        GL var5 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        var5.glTranslatef((float) var3, (float) (class47.field621 - var4), 0.0F);
        var5.glCallList(this.field5643);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V", line = 441)
    public final void method2511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.method353();
        GL var7 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(2);
        int var8 = arg0 - (this.field2248 << 4);
        int var9 = arg1 - (this.field2246 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class47.field621 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field5643);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V", line = 458)
    public final void method87(int arg0, int arg1) {
        class47.method353();
        int var3 = this.field2248 + arg0;
        int var4 = this.field2246 + arg1;
        GL var5 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(1);
        var5.glTranslatef((float) var3, (float) (class47.field621 - var4), 0.0F);
        float var6 = (float) this.field2252 / (float) this.field5642;
        float var7 = (float) this.field2250 / (float) this.field5645;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field2252, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field2250));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field2252, (float) (-this.field2250));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 504)
    public final void method70(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class47.method353();
        int var5 = this.field2252;
        int var6 = this.field2250;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2244;
        int var10 = this.field2255;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2248 > 0) {
            int var13 = ((this.field2248 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2248 << 16);
        }
        if (this.field2246 > 0) {
            int var14 = ((this.field2246 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2246 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class47.field592;
        class47.method357(this.field5639);
        this.method2512(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class47.field621 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field2252 / (float) this.field5642;
        float var21 = (float) this.field2250 / (float) this.field5645;
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

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 574)
    public final void method2512(int arg0) {
        if (this.field5641 == arg0) {
            return;
        }
        this.field5641 = arg0;
        GL var2 = class47.field592;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}
