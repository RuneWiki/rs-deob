import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class203 extends class70 {

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public int field3609 = 0;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    private int field3613 = -1;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    private int field3611 = 0;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public int field3614 = -1;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IIIIII)V", line = 5)
    public final void method1499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class97.method814();
        GL var7 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(2);
        int var8 = arg0 - (this.field1383 << 4);
        int var9 = arg1 - (this.field1385 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class97.field1809 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3613);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V", line = 23)
    private final void method1500() {
        float var1 = (float) this.field1377 / (float) this.field3615;
        float var2 = (float) this.field1375 / (float) this.field3612;
        GL var3 = class97.field1801;
        if (this.field3613 == -1) {
            this.field3613 = var3.glGenLists(1);
            this.field3610 = class308.field5469;
        }
        var3.glNewList(this.field3613, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1377, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1375));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1377, (float) (-this.field1375));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)V", line = 48)
    public final void method573(int arg0, int arg1) {
        class97.method814();
        int var3 = this.field1383 + arg0;
        int var4 = this.field1385 + arg1;
        GL var5 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        var5.glTranslatef((float) var3, (float) (class97.field1809 - var4), 0.0F);
        float var6 = (float) this.field1377 / (float) this.field3615;
        float var7 = (float) this.field1375 / (float) this.field3612;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field1377, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field1375));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field1377, (float) (-this.field1375));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([I)V", line = 74)
    public void method1501(int[] arg0) {
        this.field3615 = class189.method1440(1, this.field1377);
        this.field3612 = class189.method1440(1, this.field1375);
        byte[] var2 = new byte[this.field3615 * this.field3612 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3615 - this.field1377) * 4;
        for (int var6 = 0; var6 < this.field1375; var6++) {
            for (int var7 = 0; var7 < this.field1377; var7++) {
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
        GL var10 = class97.field1801;
        if (this.field3614 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3614 = var11[0];
            this.field3610 = class308.field5469;
        }
        class97.method803(this.field3614);
        var10.glTexImage2D(3553, 0, 6408, this.field3615, this.field3612, 0, 6408, 5121, var9);
        class308.field5473 += var9.limit() - this.field3609;
        this.field3609 = var9.limit();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIILah;)V", line = 132)
    public final void method1502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class203 arg8) {
        if (arg8 == null) {
            return;
        }
        class97.method814();
        class97.method803(arg8.field3614);
        arg8.method1503(1);
        GL var10 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field3614);
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
        float var27 = (float) arg8.field1377 / (float) arg8.field3615;
        float var28 = (float) arg8.field1375 / (float) arg8.field3612;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field3615 * 65536.0F;
        float var30 = (float) (this.field3612 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class97.field1809 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class97.field1809 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class97.field1809 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class97.field1809 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 206)
    private final void method1503(int arg0) {
        if (this.field3611 == arg0) {
            return;
        }
        this.field3611 = arg0;
        GL var2 = class97.field1801;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V", line = 226)
    public final void method584(int arg0, int arg1) {
        class97.method814();
        int var3 = this.field1383 + arg0;
        int var4 = this.field1385 + arg1;
        GL var5 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        var5.glTranslatef((float) var3, (float) (class97.field1809 - var4), 0.0F);
        var5.glCallList(this.field3613);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILah;)V", line = 239)
    public final void method1504(int arg0, int arg1, class203 arg2) {
        if (arg2 == null) {
            return;
        }
        class97.method814();
        class97.method803(arg2.field3614);
        arg2.method1503(1);
        GL var4 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field3614);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class256.field4555) / (float) arg2.field3615;
        float var6 = (float) (arg1 - class256.field4557) / (float) arg2.field3612;
        float var7 = (float) (this.field1377 + arg0 - class256.field4555) / (float) arg2.field3615;
        float var8 = (float) (this.field1375 + arg1 - class256.field4557) / (float) arg2.field3612;
        int var9 = this.field1383 + arg0;
        int var10 = this.field1385 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1377 / (float) this.field3615;
        float var12 = (float) this.field1375 / (float) this.field3612;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1377 + var9), (float) (class97.field1809 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class97.field1809 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class97.field1809 - (this.field1375 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1377 + var9), (float) (class97.field1809 - (this.field1375 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(IIIII)V", line = 289)
    public final void method1505(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class97.method807();
        GL var6 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        float var7 = (float) this.field1377 / (float) this.field3615;
        float var8 = (float) this.field1375 / (float) this.field3612;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1383 + arg0;
        int var12 = this.field1377 * arg3 + var11;
        int var13 = class97.field1809 - arg1 - this.field1385;
        int var14 = var13 - this.field1375 * arg4;
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

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V", line = 325)
    public final void method582(int arg0, int arg1, int arg2) {
        class97.method807();
        int var4 = this.field1383 + arg0;
        int var5 = this.field1385 + arg1;
        GL var6 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class97.field1809 - var5), 0.0F);
        var6.glCallList(this.field3613);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)V", line = 339)
    public final void method581(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class97.method814();
        int var5 = this.field1377;
        int var6 = this.field1375;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1386;
        int var10 = this.field1381;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1383 > 0) {
            int var13 = ((this.field1383 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1383 << 16);
        }
        if (this.field1385 > 0) {
            int var14 = ((this.field1385 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1385 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class97.field1809 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1377 / (float) this.field3615;
        float var21 = (float) this.field1375 / (float) this.field3612;
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

    @OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V", line = 409)
    protected final void finalize() throws Throwable {
        if (this.field3614 != -1) {
            class308.method2198(this.field3614, this.field3609, this.field3610);
            this.field3614 = -1;
            this.field3609 = 0;
        }
        if (this.field3613 != -1) {
            class308.method2195(this.field3613, this.field3610);
            this.field3613 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V", line = 425)
    public final void method567(int arg0, int arg1) {
        class97.method814();
        int var3 = this.field1383 + arg0;
        int var4 = this.field1385 + arg1;
        GL var5 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        var5.glTranslatef((float) var3, (float) (class97.field1809 - var4), 0.0F);
        var5.glCallList(this.field3613);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIII[I)V", line = 572)
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1386 = arg0;
        this.field1381 = arg1;
        this.field1383 = arg2;
        this.field1385 = arg3;
        this.field1377 = arg4;
        this.field1375 = arg5;
        this.method1501(arg6);
        this.method1500();
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lbn;)V", line = 582)
    public class203(class66 arg0) {
        this.field1386 = arg0.field1386;
        this.field1381 = arg0.field1381;
        this.field1383 = arg0.field1383;
        this.field1385 = arg0.field1385;
        this.field1377 = arg0.field1377;
        this.field1375 = arg0.field1375;
        this.method1501(arg0.field1323);
        this.method1500();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V", line = 441)
    public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class97.method814();
        GL var7 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        int var8 = arg0 - (this.field1383 << 4);
        int var9 = arg1 - (this.field1385 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class97.field1809 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3613);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IIII)V", line = 458)
    public final void method1506(int arg0, int arg1, int arg2, int arg3) {
        class97.method814();
        GL var5 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        float var6 = (float) this.field1377 / (float) this.field3615;
        float var7 = (float) this.field1375 / (float) this.field3612;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1383 + arg0;
        int var11 = this.field1377 * arg2 + var10;
        int var12 = class97.field1809 - arg1 - this.field1385;
        int var13 = var12 - this.field1375 * arg3;
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

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IIIII)V", line = 496)
    public final void method574(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class97.method807();
        int var6 = this.field1377;
        int var7 = this.field1375;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1386;
        int var11 = this.field1381;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1383 > 0) {
            int var14 = ((this.field1383 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1383 << 16);
        }
        if (this.field1385 > 0) {
            int var15 = ((this.field1385 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1385 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class97.field1801;
        class97.method803(this.field3614);
        this.method1503(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class97.field1809 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1377 / (float) this.field3615;
        float var22 = (float) this.field1375 / (float) this.field3612;
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
}
