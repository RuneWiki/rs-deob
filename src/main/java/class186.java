import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class186 extends class245 {

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    private int field2835 = -1;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    private int field2836 = 0;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public int field2834 = -1;

    @OriginalMember(owner = "client!rn", name = "R", descriptor = "I")
    public int field2840 = 0;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    public int field2838;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "I")
    private int field2839;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIIIILrn;)V", line = 5)
    public final void method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class186 arg8) {
        if (arg8 == null) {
            return;
        }
        class333.method2310();
        class333.method2282(arg8.field2834);
        arg8.method1276(1);
        GL var10 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field2834);
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
        float var27 = (float) arg8.field3847 / (float) arg8.field2837;
        float var28 = (float) arg8.field3844 / (float) arg8.field2838;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field2837 * 65536.0F;
        float var30 = (float) (this.field2838 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class333.field5182 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class333.field5182 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class333.field5182 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class333.field5182 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILrn;)V", line = 80)
    public final void method1274(int arg0, int arg1, class186 arg2) {
        if (arg2 == null) {
            return;
        }
        class333.method2310();
        class333.method2282(arg2.field2834);
        arg2.method1276(1);
        GL var4 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field2834);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class238.field3808) / (float) arg2.field2837;
        float var6 = (float) (arg1 - class238.field3805) / (float) arg2.field2838;
        float var7 = (float) (this.field3847 + arg0 - class238.field3808) / (float) arg2.field2837;
        float var8 = (float) (this.field3844 + arg1 - class238.field3805) / (float) arg2.field2838;
        int var9 = this.field3846 + arg0;
        int var10 = this.field3841 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field3847 / (float) this.field2837;
        float var12 = (float) this.field3844 / (float) this.field2838;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field3847 + var9), (float) (class333.field5182 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class333.field5182 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class333.field5182 - (this.field3844 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field3847 + var9), (float) (class333.field5182 - (this.field3844 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(IIIII)V", line = 130)
    public final void method1275(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class333.method2281();
        GL var6 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        float var7 = (float) this.field3847 / (float) this.field2837;
        float var8 = (float) this.field3844 / (float) this.field2838;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field3846 + arg0;
        int var12 = this.field3847 * arg3 + var11;
        int var13 = class333.field5182 - arg1 - this.field3841;
        int var14 = var13 - this.field3844 * arg4;
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

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIII)V", line = 165)
    public final void method912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class333.method2310();
        GL var7 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        int var8 = arg0 - (this.field3846 << 4);
        int var9 = arg1 - (this.field3841 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class333.field5182 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2835);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rn", name = "finalize", descriptor = "()V", line = 182)
    protected final void finalize() throws Throwable {
        if (this.field2834 != -1) {
            class301.method1979(this.field2834, this.field2840, this.field2839);
            this.field2834 = -1;
            this.field2840 = 0;
        }
        if (this.field2835 != -1) {
            class301.method1978(this.field2835, this.field2839);
            this.field2835 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V", line = 198)
    private final void method1276(int arg0) {
        if (this.field2836 == arg0) {
            return;
        }
        this.field2836 = arg0;
        GL var2 = class333.field5160;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIIII)V", line = 219)
    public final void method925(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class333.method2281();
        int var6 = this.field3847;
        int var7 = this.field3844;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field3849;
        int var11 = this.field3842;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field3846 > 0) {
            int var14 = ((this.field3846 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field3846 << 16);
        }
        if (this.field3841 > 0) {
            int var15 = ((this.field3841 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field3841 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class333.field5182 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field3847 / (float) this.field2837;
        float var22 = (float) this.field3844 / (float) this.field2838;
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

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIII[I)V", line = 560)
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field3849 = arg0;
        this.field3842 = arg1;
        this.field3846 = arg2;
        this.field3841 = arg3;
        this.field3847 = arg4;
        this.field3844 = arg5;
        this.method122(arg6);
        this.method1279();
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ln;)V", line = 582)
    public class186(class178 arg0) {
        this.field3849 = arg0.field3849;
        this.field3842 = arg0.field3842;
        this.field3846 = arg0.field3846;
        this.field3841 = arg0.field3841;
        this.field3847 = arg0.field3847;
        this.field3844 = arg0.field3844;
        this.method122(arg0.field2734);
        this.method1279();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([I)V", line = 297)
    public void method122(int[] arg0) {
        this.field2837 = class47.method330((byte) 98, this.field3847);
        this.field2838 = class47.method330((byte) 56, this.field3844);
        byte[] var2 = new byte[this.field2838 * this.field2837 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2837 - this.field3847) * 4;
        for (int var6 = 0; var6 < this.field3844; var6++) {
            for (int var7 = 0; var7 < this.field3847; var7++) {
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
        GL var10 = class333.field5160;
        if (this.field2834 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2834 = var11[0];
            this.field2839 = class301.field4649;
        }
        class333.method2282(this.field2834);
        var10.glTexImage2D(3553, 0, 6408, this.field2837, this.field2838, 0, 6408, 5121, var9);
        class301.field4647 += var9.limit() - this.field2840;
        this.field2840 = var9.limit();
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(III)V", line = 358)
    public final void method913(int arg0, int arg1, int arg2) {
        class333.method2281();
        int var4 = this.field3846 + arg0;
        int var5 = this.field3841 + arg1;
        GL var6 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class333.field5182 - var5), 0.0F);
        var6.glCallList(this.field2835);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIIIII)V", line = 371)
    public final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class333.method2310();
        GL var7 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(2);
        int var8 = arg0 - (this.field3846 << 4);
        int var9 = arg1 - (this.field3841 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class333.field5182 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2835);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIII)V", line = 394)
    public final void method1278(int arg0, int arg1, int arg2, int arg3) {
        class333.method2310();
        GL var5 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        float var6 = (float) this.field3847 / (float) this.field2837;
        float var7 = (float) this.field3844 / (float) this.field2838;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field3846 + arg0;
        int var11 = this.field3847 * arg2 + var10;
        int var12 = class333.field5182 - arg1 - this.field3841;
        int var13 = var12 - this.field3844 * arg3;
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

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)V", line = 425)
    public final void method921(int arg0, int arg1) {
        class333.method2310();
        int var3 = this.field3846 + arg0;
        int var4 = this.field3841 + arg1;
        GL var5 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        var5.glTranslatef((float) var3, (float) (class333.field5182 - var4), 0.0F);
        var5.glCallList(this.field2835);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(II)V", line = 437)
    public final void method920(int arg0, int arg1) {
        class333.method2310();
        int var3 = this.field3846 + arg0;
        int var4 = this.field3841 + arg1;
        GL var5 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        var5.glTranslatef((float) var3, (float) (class333.field5182 - var4), 0.0F);
        float var6 = (float) this.field3847 / (float) this.field2837;
        float var7 = (float) this.field3844 / (float) this.field2838;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field3847, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field3844));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field3847, (float) (-this.field3844));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)V", line = 465)
    public final void method919(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class333.method2310();
        int var5 = this.field3847;
        int var6 = this.field3844;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3849;
        int var10 = this.field3842;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3846 > 0) {
            int var13 = ((this.field3846 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3846 << 16);
        }
        if (this.field3841 > 0) {
            int var14 = ((this.field3841 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3841 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class333.field5182 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field3847 / (float) this.field2837;
        float var21 = (float) this.field3844 / (float) this.field2838;
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

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()V", line = 536)
    private final void method1279() {
        float var1 = (float) this.field3847 / (float) this.field2837;
        float var2 = (float) this.field3844 / (float) this.field2838;
        GL var3 = class333.field5160;
        if (this.field2835 == -1) {
            this.field2835 = var3.glGenLists(1);
            this.field2839 = class301.field4649;
        }
        var3.glNewList(this.field2835, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3847, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3844));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3847, (float) (-this.field3844));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V", line = 571)
    public final void method917(int arg0, int arg1) {
        class333.method2310();
        int var3 = this.field3846 + arg0;
        int var4 = this.field3841 + arg1;
        GL var5 = class333.field5160;
        class333.method2282(this.field2834);
        this.method1276(1);
        var5.glTranslatef((float) var3, (float) (class333.field5182 - var4), 0.0F);
        var5.glCallList(this.field2835);
        var5.glLoadIdentity();
    }
}
