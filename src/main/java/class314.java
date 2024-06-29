import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class314 extends class58 {

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    private int field4866 = 0;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    private int field4869 = -1;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public int field4865 = 0;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public int field4868 = -1;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    private int field4864;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public int field4867;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    public int field4870;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILoh;)V", line = 5)
    public final void method2205(int arg0, int arg1, class314 arg2) {
        if (arg2 == null) {
            return;
        }
        class232.method1652();
        class232.method1662(arg2.field4868);
        arg2.method2210(1);
        GL var4 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field4868);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class75.field1056) / (float) arg2.field4870;
        float var6 = (float) (arg1 - class75.field1054) / (float) arg2.field4867;
        float var7 = (float) (this.field825 + arg0 - class75.field1056) / (float) arg2.field4870;
        float var8 = (float) (this.field816 + arg1 - class75.field1054) / (float) arg2.field4867;
        int var9 = this.field821 + arg0;
        int var10 = this.field822 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field825 / (float) this.field4870;
        float var12 = (float) this.field816 / (float) this.field4867;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field825 + var9), (float) (class232.field3731 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class232.field3731 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class232.field3731 - (this.field816 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field825 + var9), (float) (class232.field3731 - (this.field816 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([I)V", line = 55)
    public void method619(int[] arg0) {
        this.field4870 = class120.method843(5, this.field825);
        this.field4867 = class120.method843(-113, this.field816);
        byte[] var2 = new byte[this.field4870 * this.field4867 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4870 - this.field825) * 4;
        for (int var6 = 0; var6 < this.field816; var6++) {
            for (int var7 = 0; var7 < this.field825; var7++) {
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
        GL var10 = class232.field3716;
        if (this.field4868 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4868 = var11[0];
            this.field4864 = class230.field3658;
        }
        class232.method1662(this.field4868);
        var10.glTexImage2D(3553, 0, 6408, this.field4870, this.field4867, 0, 6408, 5121, var9);
        class230.field3662 += var9.limit() - this.field4865;
        this.field4865 = var9.limit();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IIII)V", line = 113)
    public final void method2206(int arg0, int arg1, int arg2, int arg3) {
        class232.method1652();
        GL var5 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        float var6 = (float) this.field825 / (float) this.field4870;
        float var7 = (float) this.field816 / (float) this.field4867;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field821 + arg0;
        int var11 = this.field825 * arg2 + var10;
        int var12 = class232.field3731 - arg1 - this.field822;
        int var13 = var12 - this.field816 * arg3;
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

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 144)
    public final void method373(int arg0, int arg1) {
        class232.method1652();
        int var3 = this.field821 + arg0;
        int var4 = this.field822 + arg1;
        GL var5 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        var5.glTranslatef((float) var3, (float) (class232.field3731 - var4), 0.0F);
        float var6 = (float) this.field825 / (float) this.field4870;
        float var7 = (float) this.field816 / (float) this.field4867;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field825, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field816));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field825, (float) (-this.field816));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIILoh;)V", line = 170)
    public final void method2207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class314 arg8) {
        if (arg8 == null) {
            return;
        }
        class232.method1652();
        class232.method1662(arg8.field4868);
        arg8.method2210(1);
        GL var10 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field4868);
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
        float var27 = (float) arg8.field825 / (float) arg8.field4870;
        float var28 = (float) arg8.field816 / (float) arg8.field4867;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field4870 * 65536.0F;
        float var30 = (float) (this.field4867 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class232.field3731 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class232.field3731 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class232.field3731 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class232.field3731 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V", line = 244)
    public final void method368(int arg0, int arg1, int arg2) {
        class232.method1678();
        int var4 = this.field821 + arg0;
        int var5 = this.field822 + arg1;
        GL var6 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class232.field3731 - var5), 0.0F);
        var6.glCallList(this.field4869);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IIIIII)V", line = 257)
    public final void method2208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class232.method1652();
        GL var7 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(2);
        int var8 = arg0 - (this.field821 << 4);
        int var9 = arg1 - (this.field822 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class232.field3731 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4869);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V", line = 274)
    public final void method375(int arg0, int arg1) {
        class232.method1652();
        int var3 = this.field821 + arg0;
        int var4 = this.field822 + arg1;
        GL var5 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        var5.glTranslatef((float) var3, (float) (class232.field3731 - var4), 0.0F);
        var5.glCallList(this.field4869);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V", line = 287)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class232.method1678();
        int var6 = this.field825;
        int var7 = this.field816;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field813;
        int var11 = this.field817;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field821 > 0) {
            int var14 = ((this.field821 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field821 << 16);
        }
        if (this.field822 > 0) {
            int var15 = ((this.field822 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field822 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class232.field3731 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field825 / (float) this.field4870;
        float var22 = (float) this.field816 / (float) this.field4867;
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

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V", line = 360)
    public final void method376(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class232.method1652();
        int var5 = this.field825;
        int var6 = this.field816;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field813;
        int var10 = this.field817;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field821 > 0) {
            int var13 = ((this.field821 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field821 << 16);
        }
        if (this.field822 > 0) {
            int var14 = ((this.field822 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field822 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class232.field3731 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field825 / (float) this.field4870;
        float var21 = (float) this.field816 / (float) this.field4867;
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

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IIIII)V", line = 430)
    public final void method2209(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class232.method1678();
        GL var6 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        float var7 = (float) this.field825 / (float) this.field4870;
        float var8 = (float) this.field816 / (float) this.field4867;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field821 + arg0;
        int var12 = this.field825 * arg3 + var11;
        int var13 = class232.field3731 - arg1 - this.field822;
        int var14 = var13 - this.field816 * arg4;
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

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)V", line = 464)
    public final void method379(int arg0, int arg1) {
        class232.method1652();
        int var3 = this.field821 + arg0;
        int var4 = this.field822 + arg1;
        GL var5 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        var5.glTranslatef((float) var3, (float) (class232.field3731 - var4), 0.0F);
        var5.glCallList(this.field4869);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V", line = 476)
    private final void method2210(int arg0) {
        if (this.field4866 == arg0) {
            return;
        }
        this.field4866 = arg0;
        GL var2 = class232.field3716;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V", line = 496)
    protected final void finalize() throws Throwable {
        if (this.field4868 != -1) {
            class230.method1627(this.field4868, this.field4865, this.field4864);
            this.field4868 = -1;
            this.field4865 = 0;
        }
        if (this.field4869 != -1) {
            class230.method1635(this.field4869, this.field4864);
            this.field4869 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V", line = 517)
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class232.method1652();
        GL var7 = class232.field3716;
        class232.method1662(this.field4868);
        this.method2210(1);
        int var8 = arg0 - (this.field821 << 4);
        int var9 = arg1 - (this.field822 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class232.field3731 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4869);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field813 = arg0;
        this.field817 = arg1;
        this.field821 = arg2;
        this.field822 = arg3;
        this.field825 = arg4;
        this.field816 = arg5;
        this.method619(arg6);
        this.method2211();
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lek;)V", line = 582)
    public class314(class220 arg0) {
        this.field813 = arg0.field813;
        this.field817 = arg0.field817;
        this.field821 = arg0.field821;
        this.field822 = arg0.field822;
        this.field825 = arg0.field825;
        this.field816 = arg0.field816;
        this.method619(arg0.field3545);
        this.method2211();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()V", line = 545)
    private final void method2211() {
        float var1 = (float) this.field825 / (float) this.field4870;
        float var2 = (float) this.field816 / (float) this.field4867;
        GL var3 = class232.field3716;
        if (this.field4869 == -1) {
            this.field4869 = var3.glGenLists(1);
            this.field4864 = class230.field3658;
        }
        var3.glNewList(this.field4869, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field825, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field816));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field825, (float) (-this.field816));
        var3.glEnd();
        var3.glEndList();
    }
}
