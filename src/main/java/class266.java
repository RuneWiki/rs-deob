import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class266 extends class107 {

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
    private int field4506 = -1;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
    public int field4508 = -1;

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "I")
    private int field4510 = 0;

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "I")
    public int field4509 = 0;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
    private int field4512;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)V", line = 6)
    public final void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class167.method1054();
        GL var7 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        int var8 = arg0 - (this.field1830 << 4);
        int var9 = arg1 - (this.field1826 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class167.field2808 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4506);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()V", line = 24)
    private final void method1792() {
        float var1 = (float) this.field1828 / (float) this.field4511;
        float var2 = (float) this.field1821 / (float) this.field4507;
        GL var3 = class167.field2806;
        if (this.field4506 == -1) {
            this.field4506 = var3.glGenLists(1);
            this.field4512 = class101.field1723;
        }
        var3.glNewList(this.field4506, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1828, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1821));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1828, (float) (-this.field1821));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIII[I)V", line = 550)
    public class266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1820 = arg0;
        this.field1829 = arg1;
        this.field1830 = arg2;
        this.field1826 = arg3;
        this.field1828 = arg4;
        this.field1821 = arg5;
        this.method525(arg6);
        this.method1792();
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lgi;)V", line = 560)
    public class266(class204 arg0) {
        this.field1820 = arg0.field1820;
        this.field1829 = arg0.field1829;
        this.field1830 = arg0.field1830;
        this.field1826 = arg0.field1826;
        this.field1828 = arg0.field1828;
        this.field1821 = arg0.field1821;
        this.method525(arg0.field3484);
        this.method1792();
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIIIII)V", line = 52)
    public final void method1793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class167.method1054();
        GL var7 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(2);
        int var8 = arg0 - (this.field1830 << 4);
        int var9 = arg1 - (this.field1826 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class167.field2808 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field4506);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIII)V", line = 70)
    public final void method719(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class167.method1054();
        int var5 = this.field1828;
        int var6 = this.field1821;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1820;
        int var10 = this.field1829;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1830 > 0) {
            int var13 = ((this.field1830 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1830 << 16);
        }
        if (this.field1826 > 0) {
            int var14 = ((this.field1826 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1826 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class167.field2808 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1828 / (float) this.field4511;
        float var21 = (float) this.field1821 / (float) this.field4507;
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

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(IIII)V", line = 140)
    public final void method1794(int arg0, int arg1, int arg2, int arg3) {
        class167.method1054();
        GL var5 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        float var6 = (float) this.field1828 / (float) this.field4511;
        float var7 = (float) this.field1821 / (float) this.field4507;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1830 + arg0;
        int var11 = this.field1828 * arg2 + var10;
        int var12 = class167.field2808 - arg1 - this.field1826;
        int var13 = var12 - this.field1821 * arg3;
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

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIIII)V", line = 173)
    public final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class167.method1027();
        GL var6 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        float var7 = (float) this.field1828 / (float) this.field4511;
        float var8 = (float) this.field1821 / (float) this.field4507;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1830 + arg0;
        int var12 = this.field1828 * arg3 + var11;
        int var13 = class167.field2808 - arg1 - this.field1826;
        int var14 = var13 - this.field1821 * arg4;
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

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V", line = 207)
    public final void method708(int arg0, int arg1) {
        class167.method1054();
        int var3 = this.field1830 + arg0;
        int var4 = this.field1826 + arg1;
        GL var5 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        var5.glTranslatef((float) var3, (float) (class167.field2808 - var4), 0.0F);
        var5.glCallList(this.field4506);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)V", line = 219)
    public final void method720(int arg0, int arg1, int arg2) {
        class167.method1027();
        int var4 = this.field1830 + arg0;
        int var5 = this.field1826 + arg1;
        GL var6 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class167.field2808 - var5), 0.0F);
        var6.glCallList(this.field4506);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(IIII)V", line = 236)
    public final void method721(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method711(arg0, arg1);
            return;
        }
        class167.method1025();
        int var5 = this.field1830 + arg0;
        int var6 = this.field1826 + arg1;
        GL var7 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, (float) arg2 / 256.0F }, 0);
        var7.glTranslatef((float) var5, (float) (class167.field2808 - var6), 0.0F);
        var7.glCallList(this.field4506);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V", line = 256)
    public final void method711(int arg0, int arg1) {
        class167.method1054();
        int var3 = this.field1830 + arg0;
        int var4 = this.field1826 + arg1;
        GL var5 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        var5.glTranslatef((float) var3, (float) (class167.field2808 - var4), 0.0F);
        var5.glCallList(this.field4506);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILud;)V", line = 269)
    public final void method1796(int arg0, int arg1, class266 arg2) {
        if (arg2 == null) {
            return;
        }
        class167.method1054();
        class167.method1033(arg2.field4508);
        arg2.method1797(1);
        GL var4 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field4508);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class311.field5300) / (float) arg2.field4511;
        float var6 = (float) (arg1 - class311.field5302) / (float) arg2.field4507;
        float var7 = (float) (this.field1828 + arg0 - class311.field5300) / (float) arg2.field4511;
        float var8 = (float) (this.field1821 + arg1 - class311.field5302) / (float) arg2.field4507;
        int var9 = this.field1830 + arg0;
        int var10 = this.field1826 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1828 / (float) this.field4511;
        float var12 = (float) this.field1821 / (float) this.field4507;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1828 + var9), (float) (class167.field2808 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class167.field2808 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class167.field2808 - (this.field1821 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1828 + var9), (float) (class167.field2808 - (this.field1821 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([I)V", line = 319)
    public void method525(int[] arg0) {
        this.field4511 = class53.method336(-1753429918, this.field1828);
        this.field4507 = class53.method336(-1753429918, this.field1821);
        byte[] var2 = new byte[this.field4511 * this.field4507 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field4511 - this.field1828) * 4;
        for (int var6 = 0; var6 < this.field1821; var6++) {
            for (int var7 = 0; var7 < this.field1828; var7++) {
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
        GL var10 = class167.field2806;
        if (this.field4508 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field4508 = var11[0];
            this.field4512 = class101.field1723;
        }
        class167.method1033(this.field4508);
        var10.glTexImage2D(3553, 0, 6408, this.field4511, this.field4507, 0, 6408, 5121, var9);
        class101.field1722 += var9.limit() - this.field4509;
        this.field4509 = var9.limit();
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)V", line = 377)
    private final void method1797(int arg0) {
        if (this.field4510 == arg0) {
            return;
        }
        this.field4510 = arg0;
        GL var2 = class167.field2806;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V", line = 399)
    public final void method718(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class167.method1027();
        int var6 = this.field1828;
        int var7 = this.field1821;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1820;
        int var11 = this.field1829;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1830 > 0) {
            int var14 = ((this.field1830 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1830 << 16);
        }
        if (this.field1826 > 0) {
            int var15 = ((this.field1826 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1826 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class167.field2808 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1828 / (float) this.field4511;
        float var22 = (float) this.field1821 / (float) this.field4507;
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

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIILud;)V", line = 472)
    public final void method1798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class266 arg8) {
        if (arg8 == null) {
            return;
        }
        class167.method1054();
        class167.method1033(arg8.field4508);
        arg8.method1797(1);
        GL var10 = class167.field2806;
        class167.method1033(this.field4508);
        this.method1797(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field4508);
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
        float var27 = (float) arg8.field1828 / (float) arg8.field4511;
        float var28 = (float) arg8.field1821 / (float) arg8.field4507;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field4511 * 65536.0F;
        float var30 = (float) (this.field4507 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class167.field2808 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class167.field2808 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class167.field2808 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class167.field2808 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V", line = 571)
    protected final void finalize() throws Throwable {
        if (this.field4508 != -1) {
            class101.method671(this.field4508, this.field4509, this.field4512);
            this.field4508 = -1;
            this.field4509 = 0;
        }
        if (this.field4506 != -1) {
            class101.method670(this.field4506, this.field4512);
            this.field4506 = -1;
        }
        super.finalize();
    }
}
