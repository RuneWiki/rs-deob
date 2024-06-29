import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class203 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
    private boolean field3305 = true;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    private int field3315 = -1;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    private int field3323 = -1;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    private int field3317;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    private int field3326;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
    private boolean field3307;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private int field3303;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    private int field3304;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    private int field3314;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private static int field3306 = -1;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    private static int field3310 = -1;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "[I")
    private static int[] field3320 = new int[4];

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field3311;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    private int field3318;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lle;")
    private static class259 field3321;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Ln;")
    private class298 field3308;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3313;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3322;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "[B")
    private static byte[] field3324;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lvc;)V", line = 10)
    private final void method1478(class203 arg0) {
        method1482();
        method1485();
        this.field3308 = new class82(this.field3325, this.field3325);
        class216.method1574(field3320);
        this.field3308.method2082();
        class25.method166();
        class216.method1573(0, 0, this.field3325, this.field3325, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field3307) {
                var2 = -arg0.field3317;
                var3 = -arg0.field3309;
                var4 = -arg0.field3326;
            } else {
                var2 = this.field3317 - arg0.field3317;
                var3 = this.field3309 - arg0.field3309;
                var4 = this.field3326 - arg0.field3326;
            }
        }
        if (this.field3312 != 0) {
            int var5 = class25.field355[this.field3312];
            int var6 = class25.field359[this.field3312];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field3318 != 0) {
            int var8 = this.field3318 - 1024 & 0x7FF;
            int var9 = class25.field355[var8];
            int var10 = class25.field359[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class213.method1553(field3321.field4134, 0, field3321.field4133, (short) class25.field365.method376((byte) -124, this.field3303));
        class76 var12 = field3321.method1844(64, 512, -var2, -var3, -var4);
        int var13 = var12.method535() - var12.method525();
        int var14 = var12.method521() - var12.method152();
        if (var13 > var14) {
            int var15 = this.field3304 == 0 ? (var13 << 9) / this.field3325 : (var13 * 16 << 9) / (this.field3325 * 13);
            var12.method563(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field3304 == 0 ? (var14 << 9) / this.field3325 : (var14 * 16 << 9) / (this.field3325 * 13);
            var12.method563(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field3304 == 0) {
            for (int var17 = 0; var17 < class216.field3480.length; var17++) {
                if (class216.field3480[var17] != 0) {
                    class216.field3480[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1479();
            this.method1483();
        }
        class289.field4563.method2054(-25);
        class216.method1586(field3320);
        class25.method166();
    }

    @OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V", line = 112)
    protected final void finalize() throws Throwable {
        this.method1486();
        super.finalize();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V", line = 117)
    private final void method1479() {
        int var1 = this.field3325 * 3 / 32;
        int var3 = this.field3325 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class216.field3482 * var1 + var1;
        int var8 = class216.field3482 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class216.field3479) {
            var4 = var3 - (var1 + var3 - class216.field3479);
        }
        if (var1 < class216.field3485) {
            int var11 = class216.field3485 - var1;
            var4 -= var11;
            var7 += class216.field3482 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class216.field3486) {
            int var12 = var1 + var3 - class216.field3486;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class216.field3483) {
            int var13 = class216.field3483 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1495(class216.field3480, 0, this.field3304, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V", line = 176)
    public final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field3312 - arg4 & 0x7FF;
        int var8 = this.field3318 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field3311) / 2 + var9;
        int var12 = (arg2 - this.field3311) / 2 + var10;
        if (var11 >= arg3 || this.field3311 + var11 <= 0 || var12 >= arg2 || this.field3311 + var12 <= 0) {
            return;
        }
        if (this.field3316 == 0) {
            class25.field365.method385(this.field3325, this.field3303, 27314);
        } else if (this.field3323 == -1) {
            return;
        } else {
            class186.method1288(this.field3323);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field3311 + var14;
        int var16 = this.field3311 + var13;
        GL var17 = class186.field2990;
        var17.glBegin(7);
        var17.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var17.glTexCoord2f(0.0F, 0.0F);
        var17.glVertex2i(var14, var13);
        var17.glTexCoord2f(0.0F, 1.0F);
        var17.glVertex2i(var14, var16);
        var17.glTexCoord2f(1.0F, 1.0F);
        var17.glVertex2i(var15, var16);
        var17.glTexCoord2f(1.0F, 0.0F);
        var17.glVertex2i(var15, var13);
        var17.glEnd();
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()V", line = 225)
    private static final void method1481() {
        method1485();
        if (field3310 == -1 || class275.field4359 != field3306) {
            field3310 = class96.method688(class96.field1471, 128, 128, field3324);
            field3306 = class275.field4359;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()V", line = 236)
    private static final void method1482() {
        if (field3321 != null) {
            return;
        }
        class259 var0 = field3321 = new class259(260, 480, 0);
        int[] var1 = var0.field4107;
        int[] var2 = var0.field4094;
        int[] var3 = var0.field4131;
        int[] var4 = var0.field4136;
        int[] var5 = var0.field4130;
        int[] var6 = var0.field4126;
        var0.field4090 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class25.field355[var8] >> 1;
            int var10 = class25.field359[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class25.field359[var12] >> 9;
                int var14 = (class25.field355[var12] >> 1) * var9 >> 23;
                int var15 = (class25.field355[var12] >> 1) * var10 >> 23;
                var1[var0.field4090] = var15;
                var2[var0.field4090] = var13;
                var3[var0.field4090] = -var14;
                var0.field4090++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field4133] = 0;
                var5[var0.field4133] = var17;
                var6[var0.field4133] = var16;
                var0.field4133++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field4133] = var17;
                    var5[var0.field4133] = var19;
                    var6[var0.field4133] = var16;
                    var0.field4133++;
                    var4[var0.field4133] = var19;
                    var5[var0.field4133] = var20;
                    var6[var0.field4133] = var16;
                    var0.field4133++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field4133] = var16;
                var5[var0.field4133] = var17;
                var6[var0.field4133] = 1;
                var0.field4133++;
            }
        }
        var0.field4124 = var0.field4090;
        var0.field4100 = null;
        var0.field4121 = null;
        var0.field4135 = null;
        var0.field4138 = null;
        var0.field4095 = null;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()V", line = 349)
    private final void method1483() {
        int var1 = this.field3325;
        int var2 = this.field3325;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class216.field3482 - var1;
        if (var2 > class216.field3479) {
            var2 -= var2 - class216.field3479;
        }
        if (class216.field3485 > 0) {
            int var9 = class216.field3485;
            var2 -= var9;
            var7 += class216.field3482 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class216.field3486) {
            int var10 = var1 - class216.field3486;
            var1 -= var10;
            var8 += var10;
        }
        if (class216.field3483 > 0) {
            int var11 = class216.field3483;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1489(class216.field3480, this.field3304, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lvc;)V", line = 405)
    private final void method1484(class203 arg0) {
        method1493();
        method1481();
        GL var2 = class186.field2990;
        class344.method2369(field3320);
        class344.method2372();
        var2.glClearColor((float) ((this.field3304 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field3304 & 0xFF00) >> 8) / 255.0F, (float) (this.field3304 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3307) {
                var3 = -arg0.field3317;
                var4 = -arg0.field3309;
                var5 = -arg0.field3326;
            } else {
                var3 = this.field3317 - arg0.field3317;
                var4 = this.field3309 - arg0.field3309;
                var5 = this.field3326 - arg0.field3326;
            }
        }
        class345.method2392(-1.0F, 1.0F, -1.0F, 1.0F, this.field3325, this.field3325);
        if (this.field3312 != 0) {
            int var6 = class25.field355[this.field3312];
            int var7 = class25.field359[this.field3312];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3318 != 0) {
            int var9 = this.field3318 - 1024 & 0x7FF;
            int var10 = class25.field355[var9];
            int var11 = class25.field359[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class109.method748((float) (-var3), (float) (-var4), (float) var5);
        class109.method755(16777215, 0.5F, 0.5F, 1.0F);
        class109.method753();
        if (this.field3304 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class25.field365.method385(this.field3325, this.field3303, 27314);
        class186.method1316(true);
        if (class186.field3027) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field3322.position(0));
        var2.glVertexPointer(2, 5126, 20, field3322.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field3322.position(12));
        var2.glDrawElements(5, field3313.limit() / 2, 5123, field3313.position(0));
        var2.glEnableClientState(32886);
        class186.method1316(false);
        if (this.field3304 != 0) {
            class188.method1328(0, 0, (byte) 115);
            class186.method1281(1);
            class186.method1299(0);
            class186.method1288(field3310);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3304 >> 16), (byte) (this.field3304 >> 8), (byte) this.field3304, (byte) 127);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glTexEnvi(8960, 34200, 770);
            var2.glLoadIdentity();
            var2.glColorMask(true, true, true, true);
            var2.glBlendFunc(773, 772);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3304 >> 16), (byte) (this.field3304 >> 8), (byte) this.field3304, (byte) -1);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glBlendFunc(770, 771);
            var2.glTexEnvi(8960, 34176, 5890);
        }
        class345.method2391();
        class186.method1288(this.field3323);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3325, this.field3325, 0);
        class344.method2370(field3320);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3317 = arg2;
        this.field3309 = arg3;
        this.field3326 = arg4;
        this.field3307 = arg7;
        this.field3303 = arg1;
        this.field3304 = arg6;
        this.field3314 = arg5;
        this.field3316 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "()V", line = 533)
    private static final void method1485() {
        if (field3324 != null) {
            return;
        }
        field3324 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field3324[var4 + var6] = field3324[var4 + var9] = field3324[var5 + var6] = field3324[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "()V", line = 585)
    private final void method1486() {
        if (this.field3323 != -1) {
            class275.method1957(this.field3323, 0, this.field3315);
        }
        this.field3305 = true;
        this.field3323 = -1;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(Lvc;)V", line = 597)
    public final void method1487(class203 arg0) {
        if (this.field3316 == 0) {
            return;
        }
        boolean var2 = this.field3323 == -1 || class275.field4359 != this.field3315;
        if (!this.field3305 && !var2) {
            return;
        }
        if (var2) {
            this.field3315 = class275.field4359;
            this.field3323 = class96.method689(class96.field1465, this.field3325, this.field3325);
        } else {
            class186.method1288(this.field3323);
            class96.method683(class96.field1465, this.field3325, this.field3325);
        }
        if (this.field3316 == 1) {
            this.method1484(arg0);
            this.field3305 = false;
        } else if (this.field3316 == 2) {
            this.field3305 = !this.method1494(arg0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "()V", line = 636)
    public static void method1488() {
        field3322 = null;
        field3313 = null;
        field3321 = null;
        field3324 = null;
        field3320 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIIIIIIIII)V", line = 646)
    private final void method1489(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field3324[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(Lvc;)Z", line = 681)
    private final boolean method1490(class203 arg0) {
        if (this.field3308 == null) {
            if (this.field3316 == 0) {
                this.field3308 = class25.field365.method372(true, this.field3325, class25.field372, this.field3303, 123);
            } else if (this.field3316 == 2) {
                this.method1492(arg0);
            } else if (this.field3316 == 1) {
                this.method1478(arg0);
            }
        }
        return this.field3308 != null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)Z", line = 714)
    public final boolean method1491(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3307) {
            this.field3319 = 1073741823;
            var8 = this.field3317;
            var9 = this.field3309;
            var10 = this.field3326;
        } else {
            int var5 = this.field3317 - arg0;
            int var6 = this.field3309 - arg1;
            int var7 = this.field3326 - arg2;
            this.field3319 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3319 == 0) {
                this.field3319 = 1;
            }
            var8 = (var5 << 8) / this.field3319;
            var9 = (var6 << 8) / this.field3319;
            var10 = (var7 << 8) / this.field3319;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3311 = this.field3314 * arg3 / (this.field3307 ? 1024 : this.field3319);
        } else {
            this.field3311 = 0;
        }
        if (this.field3311 < 8) {
            this.method1486();
            this.field3308 = null;
            return false;
        }
        int var12 = class45.method306(this.field3311, -502316351);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3325 != var12) {
            this.field3325 = var12;
        }
        this.field3312 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field3318 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field3305 = true;
        this.field3308 = null;
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(Lvc;)V", line = 774)
    private final void method1492(class203 arg0) {
        class259 var2 = class259.method1835(class268.field4237, this.field3303, 0);
        if (var2 == null) {
            return;
        }
        this.field3308 = new class298(this.field3325, this.field3325);
        class216.method1574(field3320);
        this.field3308.method2082();
        class25.method166();
        class216.method1573(0, 0, this.field3325, this.field3325, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3307) {
                var3 = -arg0.field3317;
                var4 = -arg0.field3309;
                var5 = -arg0.field3326;
            } else {
                var3 = this.field3317 - arg0.field3317;
                var4 = this.field3309 - arg0.field3309;
                var5 = this.field3326 - arg0.field3326;
            }
        }
        if (this.field3312 != 0) {
            int var6 = class25.field355[this.field3312];
            int var7 = class25.field359[this.field3312];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3318 != 0) {
            int var9 = this.field3318 - 1024 & 0x7FF;
            int var10 = class25.field355[var9];
            int var11 = class25.field359[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class76 var13 = var2.method1844(64, 768, -var3, -var4, -var5);
        int var14 = var13.method535() - var13.method525();
        int var15 = var13.method521() - var13.method152();
        int var16 = var13.method525() + var14 / 2;
        int var17 = var13.method152() + var15 / 2;
        if (var14 > var15) {
            var13.method563(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field3325);
        } else {
            var13.method563(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field3325);
        }
        class289.field4563.method2054(-25);
        class216.method1586(field3320);
        class25.method166();
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "()V", line = 865)
    private static final void method1493() {
        if (field3322 != null) {
            return;
        }
        class192 var0 = new class192(1088);
        class192 var1 = new class192(5140);
        if (class186.field3014) {
            var1.method1345(31252, 0.0F);
            var1.method1345(31252, 1.0F);
            var1.method1345(31252, 0.0F);
            var1.method1345(31252, 0.5F);
            var1.method1345(31252, 1.0F);
            var1.method1345(31252, 0.0F);
            var1.method1345(31252, -1.0F);
            var1.method1345(31252, 0.0F);
            var1.method1345(31252, 0.5F);
            var1.method1345(31252, 0.0F);
        } else {
            var1.method1373(100, 0.0F);
            var1.method1373(101, 1.0F);
            var1.method1373(77, 0.0F);
            var1.method1373(51, 0.5F);
            var1.method1373(68, 1.0F);
            var1.method1373(117, 0.0F);
            var1.method1373(66, -1.0F);
            var1.method1373(123, 0.0F);
            var1.method1373(124, 0.5F);
            var1.method1373(87, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class25.field355[var5] / 65535.0F;
            float var7 = (float) class25.field359[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class25.field359[var9] / 65535.0F;
                float var11 = (float) class25.field355[var9] * var6 / 65535.0F;
                float var12 = (float) class25.field355[var9] * var7 / 65535.0F;
                if (class186.field3014) {
                    var1.method1345(31252, var12);
                    var1.method1345(31252, var10);
                    var1.method1345(31252, var11);
                    var1.method1345(31252, var2);
                    var1.method1345(31252, var3);
                } else {
                    var1.method1373(84, var12);
                    var1.method1373(58, var10);
                    var1.method1373(77, var11);
                    var1.method1373(109, var2);
                    var1.method1373(81, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class186.field3014) {
                    var0.method1368(0, 4796);
                    var0.method1368(0, 4796);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method1368(var14++, 4796);
                        var0.method1368(var13++, 4796);
                    }
                    var0.method1368(1, 4796);
                    var0.method1368(1, 4796);
                } else {
                    var0.method1353(0, (byte) -62);
                    var0.method1353(0, (byte) -62);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method1353(var14++, (byte) -62);
                        var0.method1353(var13++, (byte) -62);
                    }
                    var0.method1353(1, (byte) -62);
                    var0.method1353(1, (byte) -62);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field3322 = ByteBuffer.allocateDirect(var1.field3129);
        field3322.put(var1.field3128, 0, var1.field3129);
        field3322.flip();
        field3313 = ByteBuffer.allocateDirect(var0.field3129);
        field3313.put(var0.field3128, 0, var0.field3129);
        field3313.flip();
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(Lvc;)Z", line = 1016)
    private final boolean method1494(class203 arg0) {
        class259 var2 = class259.method1835(class268.field4237, this.field3303, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class186.field2990;
        class344.method2369(field3320);
        class344.method2372();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field3307) {
                var4 = -arg0.field3317;
                var5 = -arg0.field3309;
                var6 = -arg0.field3326;
            } else {
                var4 = this.field3317 - arg0.field3317;
                var5 = this.field3309 - arg0.field3309;
                var6 = this.field3326 - arg0.field3326;
            }
        }
        var2.method1831();
        class134 var7 = var2.method1855(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method535() - var7.method525()) / 2;
        int var9 = (var7.method521() - var7.method152()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class345.method2396((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field3325, this.field3325);
        if (this.field3312 != 0) {
            int var11 = class25.field355[this.field3312];
            int var12 = class25.field359[this.field3312];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field3318 != 0) {
            int var14 = this.field3318 - 1024 & 0x7FF;
            int var15 = class25.field355[var14];
            int var16 = class25.field359[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class109.method748((float) (-var4), (float) var5, (float) (-var6));
        class109.method755(16777215, 0.5F, 0.5F, 0.5F);
        class109.method753();
        class186.method1289();
        class186.method1274(true);
        class186.method1316(true);
        var7.method499(0, 0, 0, 0, -var8 - var7.method525(), -var9 - var7.method152(), 0, -1L);
        class186.method1316(false);
        class186.method1274(false);
        class186.method1284();
        class345.method2391();
        class186.method1288(this.field3323);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3325, this.field3325, 0);
        class344.method2370(field3320);
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 1103)
    private final void method1495(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field3324[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "()V", line = 1143)
    public static final void method1496() {
        if (field3310 != -1) {
            class275.method1957(field3310, 0, field3306);
        }
        field3310 = -1;
        field3306 = -1;
        field3322 = null;
        field3313 = null;
        field3321 = null;
        field3324 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIILvc;)V", line = 1156)
    public final void method1497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class203 arg6) {
        int var8 = this.field3312 - arg4 & 0x7FF;
        int var9 = this.field3318 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field3311) / 2 + var10;
        int var13 = (arg2 - this.field3311) / 2 + var11;
        if (var12 < arg3 && this.field3311 + var12 > 0 && var13 < arg2 && this.field3311 + var13 > 0 && this.method1490(arg6)) {
            this.field3308.method88(arg0 + var13, arg1 + var12, this.field3311, this.field3311);
        }
    }
}
