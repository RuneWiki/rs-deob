import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class258 extends class284 {

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public int field4380 = -1;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    private int field4382 = 0;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    private int field4381 = -1;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public int field4383 = 0;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    private int field4379;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V", line = 5)
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class90.method620();
        int var6 = this.field4801;
        int var7 = this.field4808;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4817;
        int var11 = this.field4804;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4807 > 0) {
            int var14 = ((this.field4807 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4807 << 16);
        }
        if (this.field4805 > 0) {
            int var15 = ((this.field4805 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4805 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class90.field1379 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field4801 / (float) this.field4384;
        float var22 = (float) this.field4808 / (float) this.field4385;
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

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIIIII)V", line = 78)
    public final void method1770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class90.method610();
        GL var7 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(2);
        int var8 = arg0 - (this.field4807 << 4);
        int var9 = arg1 - (this.field4805 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class90.field1379 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4381);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 95)
    private final void method1771(int arg0) {
        if (this.field4382 == arg0) {
            return;
        }
        this.field4382 = arg0;
        GL var2 = class90.field1390;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)V", line = 114)
    public final void method262(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method151(arg0, arg1);
            return;
        }
        class90.method630();
        int var5 = this.field4807 + arg0;
        int var6 = this.field4805 + arg1;
        GL var7 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, (float) arg2 / 256.0F }, 0);
        var7.glTranslatef((float) var5, (float) (class90.field1379 - var6), 0.0F);
        var7.glCallList(this.field4381);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()V", line = 135)
    private final void method1772() {
        float var1 = (float) this.field4801 / (float) this.field4384;
        float var2 = (float) this.field4808 / (float) this.field4385;
        GL var3 = class90.field1390;
        if (this.field4381 == -1) {
            this.field4381 = var3.glGenLists(1);
            this.field4379 = class7.field91;
        }
        var3.glNewList(this.field4381, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4801, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4808));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4801, (float) (-this.field4808));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(IIII)V", line = 160)
    public final void method1773(int arg0, int arg1, int arg2, int arg3) {
        class90.method610();
        GL var5 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        float var6 = (float) this.field4801 / (float) this.field4384;
        float var7 = (float) this.field4808 / (float) this.field4385;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field4807 + arg0;
        int var11 = this.field4801 * arg2 + var10;
        int var12 = class90.field1379 - arg1 - this.field4805;
        int var13 = var12 - this.field4808 * arg3;
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIII)V", line = 191)
    public final void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class90.method610();
        GL var7 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        int var8 = arg0 - (this.field4807 << 4);
        int var9 = arg1 - (this.field4805 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class90.field1379 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4381);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(IIIII)V", line = 209)
    public final void method1774(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class90.method620();
        GL var6 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        float var7 = (float) this.field4801 / (float) this.field4384;
        float var8 = (float) this.field4808 / (float) this.field4385;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field4807 + arg0;
        int var12 = this.field4801 * arg3 + var11;
        int var13 = class90.field1379 - arg1 - this.field4805;
        int var14 = var13 - this.field4808 * arg4;
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILsf;)V", line = 243)
    public final void method1775(int arg0, int arg1, class258 arg2) {
        if (arg2 == null) {
            return;
        }
        class90.method610();
        class90.method617(arg2.field4380);
        arg2.method1771(1);
        GL var4 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field4380);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class228.field3692) / (float) arg2.field4384;
        float var6 = (float) (arg1 - class228.field3693) / (float) arg2.field4385;
        float var7 = (float) (this.field4801 + arg0 - class228.field3692) / (float) arg2.field4384;
        float var8 = (float) (this.field4808 + arg1 - class228.field3693) / (float) arg2.field4385;
        int var9 = this.field4807 + arg0;
        int var10 = this.field4805 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field4801 / (float) this.field4384;
        float var12 = (float) this.field4808 / (float) this.field4385;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field4801 + var9), (float) (class90.field1379 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class90.field1379 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class90.field1379 - (this.field4808 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field4801 + var9), (float) (class90.field1379 - (this.field4808 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V", line = 293)
    public final void method152(int arg0, int arg1) {
        class90.method610();
        int var3 = this.field4807 + arg0;
        int var4 = this.field4805 + arg1;
        GL var5 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        var5.glTranslatef((float) var3, (float) (class90.field1379 - var4), 0.0F);
        var5.glCallList(this.field4381);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIII)V", line = 306)
    public final void method265(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class90.method610();
        int var5 = this.field4801;
        int var6 = this.field4808;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4817;
        int var10 = this.field4804;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4807 > 0) {
            int var13 = ((this.field4807 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4807 << 16);
        }
        if (this.field4805 > 0) {
            int var14 = ((this.field4805 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4805 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class90.field1379 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field4801 / (float) this.field4384;
        float var21 = (float) this.field4808 / (float) this.field4385;
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 376)
    public final void method151(int arg0, int arg1) {
        class90.method610();
        int var3 = this.field4807 + arg0;
        int var4 = this.field4805 + arg1;
        GL var5 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        var5.glTranslatef((float) var3, (float) (class90.field1379 - var4), 0.0F);
        var5.glCallList(this.field4381);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([I)V", line = 390)
    public void method375(int[] arg0) {
        this.field4384 = class180.method1294(true, this.field4801);
        this.field4385 = class180.method1294(true, this.field4808);
        byte[] var2 = new byte[this.field4385 * this.field4384 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4384 - this.field4801) * 4;
        for (int var6 = 0; var6 < this.field4808; var6++) {
            for (int var7 = 0; var7 < this.field4801; var7++) {
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
        GL var10 = class90.field1390;
        if (this.field4380 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4380 = var11[0];
            this.field4379 = class7.field91;
        }
        class90.method617(this.field4380);
        var10.glTexImage2D(3553, 0, 6408, this.field4384, this.field4385, 0, 6408, 5121, var9);
        class7.field90 += var9.limit() - this.field4383;
        this.field4383 = var9.limit();
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIII[I)V", line = 566)
    public class258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field4817 = arg0;
        this.field4804 = arg1;
        this.field4807 = arg2;
        this.field4805 = arg3;
        this.field4801 = arg4;
        this.field4808 = arg5;
        this.method375(arg6);
        this.method1772();
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lha;)V", line = 576)
    public class258(class49 arg0) {
        this.field4817 = arg0.field4817;
        this.field4804 = arg0.field4804;
        this.field4807 = arg0.field4807;
        this.field4805 = arg0.field4805;
        this.field4801 = arg0.field4801;
        this.field4808 = arg0.field4808;
        this.method375(arg0.field598);
        this.method1772();
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)V", line = 452)
    public final void method268(int arg0, int arg1, int arg2) {
        class90.method620();
        int var4 = this.field4807 + arg0;
        int var5 = this.field4805 + arg1;
        GL var6 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class90.field1379 - var5), 0.0F);
        var6.glCallList(this.field4381);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sf", name = "finalize", descriptor = "()V", line = 465)
    protected final void finalize() throws Throwable {
        if (this.field4380 != -1) {
            class7.method31(this.field4380, this.field4383, this.field4379);
            this.field4380 = -1;
            this.field4383 = 0;
        }
        if (this.field4381 != -1) {
            class7.method29(this.field4381, this.field4379);
            this.field4381 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIILsf;)V", line = 484)
    public final void method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class258 arg8) {
        if (arg8 == null) {
            return;
        }
        class90.method610();
        class90.method617(arg8.field4380);
        arg8.method1771(1);
        GL var10 = class90.field1390;
        class90.method617(this.field4380);
        this.method1771(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field4380);
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
        float var27 = (float) arg8.field4801 / (float) arg8.field4384;
        float var28 = (float) arg8.field4808 / (float) arg8.field4385;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field4384 * 65536.0F;
        float var30 = (float) (this.field4385 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class90.field1379 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class90.field1379 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class90.field1379 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class90.field1379 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }
}
