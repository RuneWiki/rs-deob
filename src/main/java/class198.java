import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class198 extends class273 {

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    private int field3383 = 0;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
    public int field3381 = -1;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public int field3382 = 0;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    private int field3387 = -1;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    private int field3384;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIIII)V", line = 5)
    public final void method1399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class56.method364();
        GL var7 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(2);
        int var8 = arg0 - (this.field4593 << 4);
        int var9 = arg1 - (this.field4590 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class56.field870 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3387);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIII)V", line = 22)
    public final void method1316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class56.method383();
        int var6 = this.field4595;
        int var7 = this.field4601;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4600;
        int var11 = this.field4597;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4593 > 0) {
            int var14 = ((this.field4593 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4593 << 16);
        }
        if (this.field4590 > 0) {
            int var15 = ((this.field4590 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4590 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class56.field870 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field4595 / (float) this.field3385;
        float var22 = (float) this.field4601 / (float) this.field3386;
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

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I)V", line = 95)
    public void method34(int[] arg0) {
        this.field3385 = class301.method2026(this.field4595, false);
        this.field3386 = class301.method2026(this.field4601, false);
        byte[] var2 = new byte[this.field3386 * this.field3385 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field3385 - this.field4595) * 4;
        for (int var6 = 0; var6 < this.field4601; var6++) {
            for (int var7 = 0; var7 < this.field4595; var7++) {
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
        GL var10 = class56.field848;
        if (this.field3381 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field3381 = var11[0];
            this.field3384 = class121.field2023;
        }
        class56.method354(this.field3381);
        var10.glTexImage2D(3553, 0, 6408, this.field3385, this.field3386, 0, 6408, 5121, var9);
        class121.field2022 += var9.limit() - this.field3382;
        this.field3382 = var9.limit();
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V", line = 154)
    private final void method1400(int arg0) {
        if (this.field3383 == arg0) {
            return;
        }
        this.field3383 = arg0;
        GL var2 = class56.field848;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIII)V", line = 174)
    public final void method1401(int arg0, int arg1, int arg2, int arg3) {
        class56.method364();
        GL var5 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        float var6 = (float) this.field4595 / (float) this.field3385;
        float var7 = (float) this.field4601 / (float) this.field3386;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field4593 + arg0;
        int var11 = this.field4595 * arg2 + var10;
        int var12 = class56.field870 - arg1 - this.field4590;
        int var13 = var12 - this.field4601 * arg3;
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

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V", line = 205)
    public final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class56.method364();
        GL var7 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        int var8 = arg0 - (this.field4593 << 4);
        int var9 = arg1 - (this.field4590 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class56.field870 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field3387);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIII[I)V", line = 571)
    public class198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field4600 = arg0;
        this.field4597 = arg1;
        this.field4593 = arg2;
        this.field4590 = arg3;
        this.field4595 = arg4;
        this.field4601 = arg5;
        this.method34(arg6);
        this.method1405();
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lvj;)V", line = 582)
    public class198(class184 arg0) {
        this.field4600 = arg0.field4600;
        this.field4597 = arg0.field4597;
        this.field4593 = arg0.field4593;
        this.field4590 = arg0.field4590;
        this.field4595 = arg0.field4595;
        this.field4601 = arg0.field4601;
        this.method34(arg0.field3196);
        this.method1405();
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V", line = 226)
    public final void method1333(int arg0, int arg1) {
        class56.method364();
        int var3 = this.field4593 + arg0;
        int var4 = this.field4590 + arg1;
        GL var5 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        var5.glTranslatef((float) var3, (float) (class56.field870 - var4), 0.0F);
        var5.glCallList(this.field3387);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(II)V", line = 241)
    public final void method1332(int arg0, int arg1) {
        class56.method364();
        int var3 = this.field4593 + arg0;
        int var4 = this.field4590 + arg1;
        GL var5 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        var5.glTranslatef((float) var3, (float) (class56.field870 - var4), 0.0F);
        var5.glCallList(this.field3387);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIILka;)V", line = 260)
    public final void method1402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class198 arg8) {
        if (arg8 == null) {
            return;
        }
        class56.method364();
        class56.method354(arg8.field3381);
        arg8.method1400(1);
        GL var10 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field3381);
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
        float var27 = (float) arg8.field4595 / (float) arg8.field3385;
        float var28 = (float) arg8.field4601 / (float) arg8.field3386;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field3385 * 65536.0F;
        float var30 = (float) (this.field3386 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class56.field870 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class56.field870 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class56.field870 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class56.field870 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILka;)V", line = 334)
    public final void method1403(int arg0, int arg1, class198 arg2) {
        if (arg2 == null) {
            return;
        }
        class56.method364();
        class56.method354(arg2.field3381);
        arg2.method1400(1);
        GL var4 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field3381);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class101.field1627) / (float) arg2.field3385;
        float var6 = (float) (arg1 - class101.field1629) / (float) arg2.field3386;
        float var7 = (float) (this.field4595 + arg0 - class101.field1627) / (float) arg2.field3385;
        float var8 = (float) (this.field4601 + arg1 - class101.field1629) / (float) arg2.field3386;
        int var9 = this.field4593 + arg0;
        int var10 = this.field4590 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field4595 / (float) this.field3385;
        float var12 = (float) this.field4601 / (float) this.field3386;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field4595 + var9), (float) (class56.field870 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class56.field870 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class56.field870 - (this.field4601 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field4595 + var9), (float) (class56.field870 - (this.field4601 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(IIIII)V", line = 384)
    public final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class56.method383();
        GL var6 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        float var7 = (float) this.field4595 / (float) this.field3385;
        float var8 = (float) this.field4601 / (float) this.field3386;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field4593 + arg0;
        int var12 = this.field4595 * arg3 + var11;
        int var13 = class56.field870 - arg1 - this.field4590;
        int var14 = var13 - this.field4601 * arg4;
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

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(II)V", line = 418)
    public final void method1313(int arg0, int arg1) {
        class56.method364();
        int var3 = this.field4593 + arg0;
        int var4 = this.field4590 + arg1;
        GL var5 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        var5.glTranslatef((float) var3, (float) (class56.field870 - var4), 0.0F);
        float var6 = (float) this.field4595 / (float) this.field3385;
        float var7 = (float) this.field4601 / (float) this.field3386;
        var5.glBegin(6);
        var5.glTexCoord2f(0.0F, 0.0F);
        var5.glVertex2f((float) this.field4595, 0.0F);
        var5.glTexCoord2f(var6, 0.0F);
        var5.glVertex2f(0.0F, 0.0F);
        var5.glTexCoord2f(var6, var7);
        var5.glVertex2f(0.0F, (float) (-this.field4601));
        var5.glTexCoord2f(0.0F, var7);
        var5.glVertex2f((float) this.field4595, (float) (-this.field4601));
        var5.glEnd();
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V", line = 443)
    public final void method1331(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class56.method364();
        int var5 = this.field4595;
        int var6 = this.field4601;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4600;
        int var10 = this.field4597;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4593 > 0) {
            int var13 = ((this.field4593 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4593 << 16);
        }
        if (this.field4590 > 0) {
            int var14 = ((this.field4590 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4590 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class56.field870 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field4595 / (float) this.field3385;
        float var21 = (float) this.field4601 / (float) this.field3386;
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

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V", line = 515)
    private final void method1405() {
        float var1 = (float) this.field4595 / (float) this.field3385;
        float var2 = (float) this.field4601 / (float) this.field3386;
        GL var3 = class56.field848;
        if (this.field3387 == -1) {
            this.field3387 = var3.glGenLists(1);
            this.field3384 = class121.field2023;
        }
        var3.glNewList(this.field3387, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4595, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4601));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4595, (float) (-this.field4601));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V", line = 540)
    public final void method1318(int arg0, int arg1, int arg2) {
        class56.method383();
        int var4 = this.field4593 + arg0;
        int var5 = this.field4590 + arg1;
        GL var6 = class56.field848;
        class56.method354(this.field3381);
        this.method1400(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class56.field870 - var5), 0.0F);
        var6.glCallList(this.field3387);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V", line = 556)
    protected final void finalize() throws Throwable {
        if (this.field3381 != -1) {
            class121.method793(this.field3381, this.field3382, this.field3384);
            this.field3381 = -1;
            this.field3382 = 0;
        }
        if (this.field3387 != -1) {
            class121.method791(this.field3387, this.field3384);
            this.field3387 = -1;
        }
        super.finalize();
    }
}
