import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class109 extends class237 {

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    private int field1621 = -1;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public int field1623 = 0;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "I")
    public int field1622 = -1;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    private int field1627 = 0;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V", line = 6)
    private final void method719() {
        float var1 = (float) this.field3918 / (float) this.field1624;
        float var2 = (float) this.field3914 / (float) this.field1626;
        GL var3 = class45.field688;
        if (this.field1621 == -1) {
            this.field1621 = var3.glGenLists(1);
            this.field1625 = class36.field576;
        }
        var3.glNewList(this.field1621, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3918, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3914));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3918, (float) (-this.field3914));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIII)V", line = 31)
    public final void method720(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class45.method308();
        GL var6 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        float var7 = (float) this.field3918 / (float) this.field1624;
        float var8 = (float) this.field3914 / (float) this.field1626;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field3921 + arg0;
        int var12 = this.field3918 * arg3 + var11;
        int var13 = class45.field667 - arg1 - this.field3925;
        int var14 = var13 - this.field3914 * arg4;
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

    @OriginalMember(owner = "client!gf", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() throws Throwable {
        if (this.field1622 != -1) {
            class36.method259(this.field1622, this.field1623, this.field1625);
            this.field1622 = -1;
            this.field1623 = 0;
        }
        if (this.field1621 != -1) {
            class36.method261(this.field1621, this.field1625);
            this.field1621 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIII)V", line = 81)
    public final void method721(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class45.method331();
        int var5 = this.field3918;
        int var6 = this.field3914;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3926;
        int var10 = this.field3913;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3921 > 0) {
            int var13 = ((this.field3921 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3921 << 16);
        }
        if (this.field3925 > 0) {
            int var14 = ((this.field3925 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3925 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class45.field688;
        class45.method321(this.field1622);
        this.method725(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class45.field667 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field3918 / (float) this.field1624;
        float var21 = (float) this.field3914 / (float) this.field1626;
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

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([I)V", line = 151)
    public void method722(int[] arg0) {
        this.field1624 = class275.method1871(this.field3918, 1110164296);
        this.field1626 = class275.method1871(this.field3914, 1110164296);
        byte[] var2 = new byte[this.field1626 * this.field1624 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field1624 - this.field3918) * 4;
        for (int var6 = 0; var6 < this.field3914; var6++) {
            for (int var7 = 0; var7 < this.field3918; var7++) {
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
        GL var10 = class45.field688;
        if (this.field1622 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field1622 = var11[0];
            this.field1625 = class36.field576;
        }
        class45.method321(this.field1622);
        var10.glTexImage2D(3553, 0, 6408, this.field1624, this.field1626, 0, 6408, 5121, var9);
        class36.field573 += var9.limit() - this.field1623;
        this.field1623 = var9.limit();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILgf;)V", line = 210)
    public final void method723(int arg0, int arg1, class109 arg2) {
        if (arg2 == null) {
            return;
        }
        class45.method331();
        class45.method321(arg2.field1622);
        arg2.method725(1);
        GL var4 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field1622);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class124.field1870) / (float) arg2.field1624;
        float var6 = (float) (arg1 - class124.field1874) / (float) arg2.field1626;
        float var7 = (float) (this.field3918 + arg0 - class124.field1870) / (float) arg2.field1624;
        float var8 = (float) (this.field3914 + arg1 - class124.field1874) / (float) arg2.field1626;
        int var9 = this.field3921 + arg0;
        int var10 = this.field3925 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field3918 / (float) this.field1624;
        float var12 = (float) this.field3914 / (float) this.field1626;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field3918 + var9), (float) (class45.field667 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class45.field667 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class45.field667 - (this.field3914 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field3918 + var9), (float) (class45.field667 - (this.field3914 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)V", line = 261)
    public final void method724(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method213(arg0, arg1);
            return;
        }
        class45.method328();
        int var5 = this.field3921 + arg0;
        int var6 = this.field3925 + arg1;
        GL var7 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, (float) arg2 / 256.0F }, 0);
        var7.glTranslatef((float) var5, (float) (class45.field667 - var6), 0.0F);
        var7.glCallList(this.field1621);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V", line = 281)
    private final void method725(int arg0) {
        if (this.field1627 == arg0) {
            return;
        }
        this.field1627 = arg0;
        GL var2 = class45.field688;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)V", line = 300)
    public final void method213(int arg0, int arg1) {
        class45.method331();
        int var3 = this.field3921 + arg0;
        int var4 = this.field3925 + arg1;
        GL var5 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        var5.glTranslatef((float) var3, (float) (class45.field667 - var4), 0.0F);
        var5.glCallList(this.field1621);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)V", line = 312)
    public final void method726(int arg0, int arg1, int arg2) {
        class45.method308();
        int var4 = this.field3921 + arg0;
        int var5 = this.field3925 + arg1;
        GL var6 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class45.field667 - var5), 0.0F);
        var6.glCallList(this.field1621);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIIII)V", line = 325)
    public final void method727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class45.method331();
        GL var7 = class45.field688;
        class45.method321(this.field1622);
        this.method725(2);
        int var8 = arg0 - (this.field3921 << 4);
        int var9 = arg1 - (this.field3925 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class45.field667 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1621);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIILgf;)V", line = 342)
    public final void method728(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class109 arg8) {
        if (arg8 == null) {
            return;
        }
        class45.method331();
        class45.method321(arg8.field1622);
        arg8.method725(1);
        GL var10 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field1622);
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
        float var27 = (float) arg8.field3918 / (float) arg8.field1624;
        float var28 = (float) arg8.field3914 / (float) arg8.field1626;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field1624 * 65536.0F;
        float var30 = (float) (this.field1626 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class45.field667 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class45.field667 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class45.field667 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class45.field667 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V", line = 416)
    public final void method214(int arg0, int arg1) {
        class45.method331();
        int var3 = this.field3921 + arg0;
        int var4 = this.field3925 + arg1;
        GL var5 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        var5.glTranslatef((float) var3, (float) (class45.field667 - var4), 0.0F);
        var5.glCallList(this.field1621);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(IIII)V", line = 428)
    public final void method729(int arg0, int arg1, int arg2, int arg3) {
        class45.method331();
        GL var5 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        float var6 = (float) this.field3918 / (float) this.field1624;
        float var7 = (float) this.field3914 / (float) this.field1626;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field3921 + arg0;
        int var11 = this.field3918 * arg2 + var10;
        int var12 = class45.field667 - arg1 - this.field3925;
        int var13 = var12 - this.field3914 * arg3;
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

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIII[I)V", line = 566)
    public class109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field3926 = arg0;
        this.field3913 = arg1;
        this.field3921 = arg2;
        this.field3925 = arg3;
        this.field3918 = arg4;
        this.field3914 = arg5;
        this.method722(arg6);
        this.method719();
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lfi;)V", line = 576)
    public class109(class222 arg0) {
        this.field3926 = arg0.field3926;
        this.field3913 = arg0.field3913;
        this.field3921 = arg0.field3921;
        this.field3925 = arg0.field3925;
        this.field3918 = arg0.field3918;
        this.field3914 = arg0.field3914;
        this.method722(arg0.field3652);
        this.method719();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V", line = 468)
    public final void method730(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class45.method308();
        int var6 = this.field3918;
        int var7 = this.field3914;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field3926;
        int var11 = this.field3913;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field3921 > 0) {
            int var14 = ((this.field3921 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field3921 << 16);
        }
        if (this.field3925 > 0) {
            int var15 = ((this.field3925 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field3925 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class45.field667 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field3918 / (float) this.field1624;
        float var22 = (float) this.field3914 / (float) this.field1626;
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

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V", line = 545)
    public final void method731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class45.method331();
        GL var7 = class45.field688;
        class45.method321(this.field1622);
        this.method725(1);
        int var8 = arg0 - (this.field3921 << 4);
        int var9 = arg1 - (this.field3925 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class45.field667 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field1621);
        var7.glLoadIdentity();
    }
}
