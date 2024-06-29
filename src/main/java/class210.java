import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class210 extends class86 {

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public int field3692 = 0;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public int field3693 = -1;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    private int field3694 = -1;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    private int field3689 = 0;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public int field3690;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(II)V", line = 5)
    public final void method606(int arg0, int arg1) {
        class147.method1015();
        int var3 = this.field1540 + arg0;
        int var4 = this.field1535 + arg1;
        GL var5 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(1);
        var5.glTranslatef((float) var3, (float) (class147.field2495 - var4), 0.0F);
        var5.glCallList(this.field3694);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V", line = 17)
    public final void method602(int arg0, int arg1, int arg2) {
        class147.method1021();
        int var4 = this.field1540 + arg0;
        int var5 = this.field1535 + arg1;
        GL var6 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class147.field2495 - var5), 0.0F);
        var6.glCallList(this.field3694);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILpi;)V", line = 30)
    public final void method1509(int arg0, int arg1, class210 arg2) {
        if (arg2 == null) {
            return;
        }
        class147.method1015();
        class147.method1002(arg2.field3693);
        arg2.method1510(1);
        GL var4 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field3693);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class116.field2053) / (float) arg2.field3688;
        float var6 = (float) (arg1 - class116.field2051) / (float) arg2.field3690;
        float var7 = (float) (this.field1543 + arg0 - class116.field2053) / (float) arg2.field3688;
        float var8 = (float) (this.field1533 + arg1 - class116.field2051) / (float) arg2.field3690;
        int var9 = this.field1540 + arg0;
        int var10 = this.field1535 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1543 / (float) this.field3688;
        float var12 = (float) this.field1533 / (float) this.field3690;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1543 + var9), (float) (class147.field2495 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class147.field2495 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class147.field2495 - (this.field1533 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1543 + var9), (float) (class147.field2495 - (this.field1533 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V", line = 80)
    private final void method1510(int arg0) {
        if (this.field3689 == arg0) {
            return;
        }
        this.field3689 = arg0;
        GL var2 = class147.field2479;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(IIIII)V", line = 101)
    public final void method1511(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class147.method1021();
        GL var6 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(1);
        float var7 = (float) this.field1543 / (float) this.field3688;
        float var8 = (float) this.field1533 / (float) this.field3690;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1540 + arg0;
        int var12 = this.field1543 * arg3 + var11;
        int var13 = class147.field2495 - arg1 - this.field1535;
        int var14 = var13 - this.field1533 * arg4;
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

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIII)V", line = 135)
    public final void method605(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class147.method1021();
        int var6 = this.field1543;
        int var7 = this.field1533;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1544;
        int var11 = this.field1538;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1540 > 0) {
            int var14 = ((this.field1540 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1540 << 16);
        }
        if (this.field1535 > 0) {
            int var15 = ((this.field1535 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1535 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class147.field2495 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1543 / (float) this.field3688;
        float var22 = (float) this.field1533 / (float) this.field3690;
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

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V", line = 210)
    protected final void finalize() throws Throwable {
        if (this.field3693 != -1) {
            class6.method36(this.field3693, this.field3692, this.field3691);
            this.field3693 = -1;
            this.field3692 = 0;
        }
        if (this.field3694 != -1) {
            class6.method40(this.field3694, this.field3691);
            this.field3694 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIII)V", line = 227)
    public final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class147.method1015();
        GL var7 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(1);
        int var8 = arg0 - (this.field1540 << 4);
        int var9 = arg1 - (this.field1535 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class147.field2495 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3694);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIILpi;)V", line = 244)
    public final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class210 arg8) {
        if (arg8 == null) {
            return;
        }
        class147.method1015();
        class147.method1002(arg8.field3693);
        arg8.method1510(1);
        GL var10 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field3693);
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
        float var27 = (float) arg8.field1543 / (float) arg8.field3688;
        float var28 = (float) arg8.field1533 / (float) arg8.field3690;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field3688 * 65536.0F;
        float var30 = (float) (this.field3690 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class147.field2495 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class147.field2495 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class147.field2495 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class147.field2495 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)V", line = 318)
    public final void method600(int arg0, int arg1) {
        class147.method1015();
        int var3 = this.field1540 + arg0;
        int var4 = this.field1535 + arg1;
        GL var5 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(1);
        var5.glTranslatef((float) var3, (float) (class147.field2495 - var4), 0.0F);
        var5.glCallList(this.field3694);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIII[I)V", line = 547)
    public class210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1544 = arg0;
        this.field1538 = arg1;
        this.field1540 = arg2;
        this.field1535 = arg3;
        this.field1543 = arg4;
        this.field1533 = arg5;
        this.method1514(arg6);
        this.method1513();
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljm;)V", line = 557)
    public class210(class303 arg0) {
        this.field1544 = arg0.field1544;
        this.field1538 = arg0.field1538;
        this.field1540 = arg0.field1540;
        this.field1535 = arg0.field1535;
        this.field1543 = arg0.field1543;
        this.field1533 = arg0.field1533;
        this.method1514(arg0.field5160);
        this.method1513();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 335)
    private final void method1513() {
        float var1 = (float) this.field1543 / (float) this.field3688;
        float var2 = (float) this.field1533 / (float) this.field3690;
        GL var3 = class147.field2479;
        if (this.field3694 == -1) {
            this.field3694 = var3.glGenLists(1);
            this.field3691 = class6.field47;
        }
        var3.glNewList(this.field3694, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1543, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1533));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1543, (float) (-this.field1533));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([I)V", line = 365)
    public void method1514(int[] arg0) {
        this.field3688 = class135.method922(21793, this.field1543);
        this.field3690 = class135.method922(21793, this.field1533);
        byte[] var2 = new byte[this.field3690 * this.field3688 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3688 - this.field1543) * 4;
        for (int var6 = 0; var6 < this.field1533; var6++) {
            for (int var7 = 0; var7 < this.field1543; var7++) {
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
        GL var10 = class147.field2479;
        if (this.field3693 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3693 = var11[0];
            this.field3691 = class6.field47;
        }
        class147.method1002(this.field3693);
        var10.glTexImage2D(3553, 0, 6408, this.field3688, this.field3690, 0, 6408, 5121, var9);
        class6.field48 += var9.limit() - this.field3692;
        this.field3692 = var9.limit();
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIII)V", line = 426)
    public final void method1515(int arg0, int arg1, int arg2, int arg3) {
        class147.method1015();
        GL var5 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(1);
        float var6 = (float) this.field1543 / (float) this.field3688;
        float var7 = (float) this.field1533 / (float) this.field3690;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1540 + arg0;
        int var11 = this.field1543 * arg2 + var10;
        int var12 = class147.field2495 - arg1 - this.field1535;
        int var13 = var12 - this.field1533 * arg3;
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

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIIII)V", line = 457)
    public final void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class147.method1015();
        GL var7 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(2);
        int var8 = arg0 - (this.field1540 << 4);
        int var9 = arg1 - (this.field1535 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class147.field2495 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3694);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)V", line = 475)
    public final void method604(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class147.method1015();
        int var5 = this.field1543;
        int var6 = this.field1533;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1544;
        int var10 = this.field1538;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1540 > 0) {
            int var13 = ((this.field1540 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1540 << 16);
        }
        if (this.field1535 > 0) {
            int var14 = ((this.field1535 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1535 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class147.field2479;
        class147.method1002(this.field3693);
        this.method1510(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class147.field2495 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1543 / (float) this.field3688;
        float var21 = (float) this.field1533 / (float) this.field3690;
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
