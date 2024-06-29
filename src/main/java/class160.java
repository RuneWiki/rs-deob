import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class160 extends class88 {

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
    public int field2544 = -1;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "I")
    public int field2541 = 0;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    private int field2542 = -1;

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
    private int field2546 = 0;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
    public int field2540;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(II)V", line = 5)
    public final void method139(int arg0, int arg1) {
        class264.method1716();
        int var3 = this.field1340 + arg0;
        int var4 = this.field1334 + arg1;
        GL var5 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        var5.glTranslatef((float) var3, (float) (class264.field4290 - var4), 0.0F);
        var5.glCallList(this.field2542);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V", line = 18)
    private final void method1020() {
        float var1 = (float) this.field1347 / (float) this.field2540;
        float var2 = (float) this.field1345 / (float) this.field2545;
        GL var3 = class264.field4313;
        if (this.field2542 == -1) {
            this.field2542 = var3.glGenLists(1);
            this.field2543 = class143.field2280;
        }
        var3.glNewList(this.field2542, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1347, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1345));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1347, (float) (-this.field1345));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIII)V", line = 43)
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264.method1716();
        GL var7 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        int var8 = arg0 - (this.field1340 << 4);
        int var9 = arg1 - (this.field1334 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class264.field4290 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2542);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(IIII)V", line = 60)
    public final void method1021(int arg0, int arg1, int arg2, int arg3) {
        class264.method1716();
        GL var5 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        float var6 = (float) this.field1347 / (float) this.field2540;
        float var7 = (float) this.field1345 / (float) this.field2545;
        float var8 = (float) arg2 * var6;
        float var9 = (float) arg3 * var7;
        int var10 = this.field1340 + arg0;
        int var11 = this.field1347 * arg2 + var10;
        int var12 = class264.field4290 - arg1 - this.field1334;
        int var13 = var12 - this.field1345 * arg3;
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

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IIIIII)V", line = 91)
    public final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264.method1716();
        GL var7 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(2);
        int var8 = arg0 - (this.field1340 << 4);
        int var9 = arg1 - (this.field1334 << 4);
        var7.glTranslatef((float) arg2 / 16.0F, (float) class264.field4290 - (float) arg3 / 16.0F, 0.0F);
        var7.glRotatef((float) (-arg4) * 0.005493164F, 0.0F, 0.0F, 1.0F);
        if (arg5 != 4096) {
            var7.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
        }
        var7.glTranslatef((float) (-var8) / 16.0F, (float) var9 / 16.0F, 0.0F);
        var7.glCallList(this.field2542);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V", line = 109)
    public final void method143(int arg0, int arg1) {
        class264.method1716();
        int var3 = this.field1340 + arg0;
        int var4 = this.field1334 + arg1;
        GL var5 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        var5.glTranslatef((float) var3, (float) (class264.field4290 - var4), 0.0F);
        var5.glCallList(this.field2542);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V", line = 123)
    public final void method145(int arg0, int arg1, int arg2) {
        class264.method1738();
        int var4 = this.field1340 + arg0;
        int var5 = this.field1334 + arg1;
        GL var6 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class264.field4290 - var5), 0.0F);
        var6.glCallList(this.field2542);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V", line = 136)
    public final void method338(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method139(arg0, arg1);
            return;
        }
        class264.method1732();
        int var5 = this.field1340 + arg0;
        int var6 = this.field1334 + arg1;
        GL var7 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        var7.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
        var7.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, (float) arg2 / 256.0F }, 0);
        var7.glTranslatef((float) var5, (float) (class264.field4290 - var6), 0.0F);
        var7.glCallList(this.field2542);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V", line = 156)
    private final void method1023(int arg0) {
        if (this.field2546 == arg0) {
            return;
        }
        this.field2546 = arg0;
        GL var2 = class264.field4313;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V", line = 176)
    protected final void finalize() throws Throwable {
        if (this.field2544 != -1) {
            class143.method939(this.field2544, this.field2541, this.field2543);
            this.field2544 = -1;
            this.field2541 = 0;
        }
        if (this.field2542 != -1) {
            class143.method938(this.field2542, this.field2543);
            this.field2542 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIII[I)V", line = 566)
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this.field1346 = arg0;
        this.field1344 = arg1;
        this.field1340 = arg2;
        this.field1334 = arg3;
        this.field1347 = arg4;
        this.field1345 = arg5;
        this.method347(arg6);
        this.method1020();
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lra;)V", line = 576)
    public class160(class43 arg0) {
        this.field1346 = arg0.field1346;
        this.field1344 = arg0.field1344;
        this.field1340 = arg0.field1340;
        this.field1334 = arg0.field1334;
        this.field1347 = arg0.field1347;
        this.field1345 = arg0.field1345;
        this.method347(arg0.field652);
        this.method1020();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIILme;)V", line = 196)
    public final void method1024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class160 arg8) {
        if (arg8 == null) {
            return;
        }
        class264.method1716();
        class264.method1722(arg8.field2544);
        arg8.method1023(1);
        GL var10 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        var10.glActiveTexture(33985);
        var10.glEnable(3553);
        var10.glBindTexture(3553, arg8.field2544);
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
        float var27 = (float) arg8.field1347 / (float) arg8.field2540;
        float var28 = (float) arg8.field1345 / (float) arg8.field2545;
        var10.glBegin(6);
        var10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var29 = (float) this.field2540 * 65536.0F;
        float var30 = (float) (this.field2545 * 65536);
        var10.glMultiTexCoord2f(33985, var27, 0.0F);
        var10.glTexCoord2f((float) var21 / var29, (float) var22 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class264.field4290 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        var10.glTexCoord2f((float) var19 / var29, (float) var20 / var30);
        var10.glVertex2f((float) arg0, (float) (class264.field4290 - arg1));
        var10.glMultiTexCoord2f(33985, 0.0F, var28);
        var10.glTexCoord2f((float) var23 / var29, (float) var24 / var30);
        var10.glVertex2f((float) arg0, (float) (class264.field4290 - (arg1 + arg3)));
        var10.glMultiTexCoord2f(33985, var27, var28);
        var10.glTexCoord2f((float) var25 / var29, (float) var26 / var30);
        var10.glVertex2f((float) (arg0 + arg2), (float) (class264.field4290 - (arg1 + arg3)));
        var10.glEnd();
        var10.glTexEnvi(8960, 34161, 8448);
        var10.glTexEnvi(8960, 34176, 5890);
        var10.glDisable(3553);
        var10.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V", line = 271)
    public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class264.method1738();
        int var6 = this.field1347;
        int var7 = this.field1345;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field1346;
        int var11 = this.field1344;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field1340 > 0) {
            int var14 = ((this.field1340 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field1340 << 16);
        }
        if (this.field1334 > 0) {
            int var15 = ((this.field1334 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field1334 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        GL var16 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        float var17 = (float) arg0;
        float var18 = (float) arg2 + var17;
        float var19 = (float) (class264.field4290 - arg1);
        float var20 = var19 - (float) arg3;
        float var21 = (float) this.field1347 / (float) this.field2540;
        float var22 = (float) this.field1345 / (float) this.field2545;
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

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IIII)V", line = 347)
    public final void method332(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        class264.method1716();
        int var5 = this.field1347;
        int var6 = this.field1345;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field1346;
        int var10 = this.field1344;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field1340 > 0) {
            int var13 = ((this.field1340 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field1340 << 16);
        }
        if (this.field1334 > 0) {
            int var14 = ((this.field1334 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field1334 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        GL var15 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(2);
        float var16 = (float) arg0;
        float var17 = (float) arg2 + var16;
        float var18 = (float) (class264.field4290 - arg1);
        float var19 = var18 - (float) arg3;
        float var20 = (float) this.field1347 / (float) this.field2540;
        float var21 = (float) this.field1345 / (float) this.field2545;
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

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([I)V", line = 421)
    public void method347(int[] arg0) {
        this.field2540 = class140.method925(this.field1347, (byte) 108);
        this.field2545 = class140.method925(this.field1345, (byte) 127);
        byte[] var2 = new byte[this.field2545 * this.field2540 * 4];
        int var3 = 0;
        int var4 = 0;
        int var5 = (this.field2540 - this.field1347) * 4;
        for (int var6 = 0; var6 < this.field1345; var6++) {
            for (int var7 = 0; var7 < this.field1347; var7++) {
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
        GL var10 = class264.field4313;
        if (this.field2544 == -1) {
            int[] var11 = new int[1];
            var10.glGenTextures(1, var11, 0);
            this.field2544 = var11[0];
            this.field2543 = class143.field2280;
        }
        class264.method1722(this.field2544);
        var10.glTexImage2D(3553, 0, 6408, this.field2540, this.field2545, 0, 6408, 5121, var9);
        class143.field2277 += var9.limit() - this.field2541;
        this.field2541 = var9.limit();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILme;)V", line = 479)
    public final void method1025(int arg0, int arg1, class160 arg2) {
        if (arg2 == null) {
            return;
        }
        class264.method1716();
        class264.method1722(arg2.field2544);
        arg2.method1023(1);
        GL var4 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        var4.glActiveTexture(33985);
        var4.glEnable(3553);
        var4.glBindTexture(3553, arg2.field2544);
        var4.glTexEnvi(8960, 34161, 7681);
        var4.glTexEnvi(8960, 34176, 34168);
        float var5 = (float) (arg0 - class121.field1896) / (float) arg2.field2540;
        float var6 = (float) (arg1 - class121.field1897) / (float) arg2.field2545;
        float var7 = (float) (this.field1347 + arg0 - class121.field1896) / (float) arg2.field2540;
        float var8 = (float) (this.field1345 + arg1 - class121.field1897) / (float) arg2.field2545;
        int var9 = this.field1340 + arg0;
        int var10 = this.field1334 + arg1;
        var4.glBegin(6);
        var4.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11 = (float) this.field1347 / (float) this.field2540;
        float var12 = (float) this.field1345 / (float) this.field2545;
        var4.glMultiTexCoord2f(33985, var7, var6);
        var4.glTexCoord2f(var11, 0.0F);
        var4.glVertex2f((float) (this.field1347 + var9), (float) (class264.field4290 - var10));
        var4.glMultiTexCoord2f(33985, var5, var6);
        var4.glTexCoord2f(0.0F, 0.0F);
        var4.glVertex2f((float) var9, (float) (class264.field4290 - var10));
        var4.glMultiTexCoord2f(33985, var5, var8);
        var4.glTexCoord2f(0.0F, var12);
        var4.glVertex2f((float) var9, (float) (class264.field4290 - (this.field1345 + var10)));
        var4.glMultiTexCoord2f(33985, var7, var8);
        var4.glTexCoord2f(var11, var12);
        var4.glVertex2f((float) (this.field1347 + var9), (float) (class264.field4290 - (this.field1345 + var10)));
        var4.glEnd();
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IIIII)V", line = 529)
    public final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class264.method1738();
        GL var6 = class264.field4313;
        class264.method1722(this.field2544);
        this.method1023(1);
        float var7 = (float) this.field1347 / (float) this.field2540;
        float var8 = (float) this.field1345 / (float) this.field2545;
        float var9 = (float) arg3 * var7;
        float var10 = (float) arg4 * var8;
        int var11 = this.field1340 + arg0;
        int var12 = this.field1347 * arg3 + var11;
        int var13 = class264.field4290 - arg1 - this.field1334;
        int var14 = var13 - this.field1345 * arg4;
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
}
