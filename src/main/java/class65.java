import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class65 extends class198 {

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    private int field969 = 1;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    private int field960 = 1;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
    public static final void method416(boolean arg0) {
        ++field965;
        class100.method648(false);
        class209.method1483(0);
        class259.method1799((byte) 45);
        class123.method811((byte) -90);
        class131.method877(1);
        class131.method879(0);
        class265.method1832(83);
        class15.method102((byte) 113);
        class292.method2040(0);
        class43.method275((byte) -109);
        class142.method945(33554432);
        class250.method1739(-99);
        class245.method1711(2047);
        class69.method432(true);
        class130.method866(0);
        class124.method820(-2);
        class243.method1708((byte) -72);
        class259.method1800((byte) -62);
        class147.method980((byte) -59);
        class176.method1182((byte) -107);
        class139.method929(arg0);
        class11.field150.method144(0);
        class37.field480.method144(0);
        class1.field4.method144(0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        int var4 = -57 / ((60 - arg0) / 61);
        ++field963;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field3139 = arg1.method1420((byte) 0) == 1;
                }
            } else {
                this.field960 = arg1.method1420((byte) 0);
            }
        } else {
            this.field969 = arg1.method1420((byte) 0);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field962;
        if (arg1 != -2) {
            return null;
        } else {
            int[][] var3 = super.field3150.method642(arg0, 1);
            if (super.field3150.field1498) {
                int var4 = this.field960 - (-this.field960 + -1);
                int var5 = 65536 / var4;
                int[][][] var6 = new int[var4][][];
                int var7 = this.field969 + this.field969 + 1;
                int var8 = 65536 / var7;
                for (int var9 = -this.field960 + arg0; var9 <= this.field960 + arg0; ++var9) {
                    int[][] var19 = this.method1372(0, class52.field704 & var9, (byte) -59);
                    int var20 = 0;
                    int[][] var21 = new int[3][class42.field590];
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field969; ~this.field969 <= ~var27; ++var27) {
                        int var37 = class227.field3594 & var27;
                        var22 += var24[var37];
                        var23 += var26[var37];
                        var20 += var25[var37];
                    }
                    int[] var28 = var21[0];
                    int[] var29 = var21[1];
                    int[] var30 = var21[2];
                    int var31 = 0;
                    while (var31 < class42.field590) {
                        var28[var31] = var8 * var22 >> 16;
                        var29[var31] = var8 * var20 >> 16;
                        var30[var31] = var8 * var23 >> 16;
                        int var32 = class227.field3594 & -this.field969 + var31;
                        int var33 = var22 - var24[var32];
                        int var34 = var23 - var26[var32];
                        ++var31;
                        int var35 = var20 - var25[var32];
                        int var36 = class227.field3594 & this.field969 + var31;
                        var23 = var26[var36] + var34;
                        var22 = var24[var36] + var33;
                        var20 = var25[var36] + var35;
                    }
                    var6[-arg0 + var9 - -this.field960] = var21;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class42.field590 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var6[var17];
                        var16 += var18[2][var13];
                        var15 += var18[1][var13];
                        var14 += var18[0][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILfa;)V")
    public static final void method417(int arg0, class273 arg1) {
        class51.field688 = class101.method661(arg1, -1, class207.field3308);
        class271.field4439 = new int[256];
        for (int var2 = 0; var2 < 3; ++var2) {
            float var5 = (float) (255 & class209.field3353[var2] >> 16);
            int var6 = 255 & class209.field3353[var2 + 1] >> 16;
            float var7 = ((float) var6 + -var5) / 64.0F;
            float var8 = (float) (class209.field3353[var2] >> 8 & 255);
            int var9 = (65280 & class209.field3353[var2 + 1]) >> 8;
            float var10 = ((float) var9 - var8) / 64.0F;
            float var11 = (float) (class209.field3353[var2] & 255);
            int var12 = 255 & class209.field3353[var2 - -1];
            float var13 = ((float) var12 + -var11) / 64.0F;
            for (int var14 = 0; var14 < 64; ++var14) {
                class271.field4439[var2 * 64 + var14] = class82.method554((int) var11, class82.method554((int) var5 << 16, (int) var8 << 8));
                var11 += var13;
                var8 += var10;
                var5 += var7;
            }
        }
        ++field971;
        for (int var3 = 192; ~var3 > -256; ++var3) {
            class271.field4439[var3] = class209.field3353[3];
        }
        class258.field4248 = new int[32768];
        class10.field126 = new int[32768];
        class53.method319(false, (class5) null);
        class159.field2503 = new int[32768];
        class25.field325 = new int[32768];
        class103.field1550 = new class38(128, 254);
        int var4 = 87 % ((arg0 - -29) / 59);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)[B")
    public static final byte[] method418(int arg0, byte arg1) {
        if (arg1 >= -41) {
            method419((byte) 44);
        }
        class301 var2 = (class301) class217.field3459.method1343(113, (long) arg0);
        ++field970;
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = 255 - var6;
                int var8 = class79.method524(var7, 102, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class301(var3);
            class217.field3459.method1337(var2, (long) arg0, -1);
        }
        return var2.field4939;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)V")
    public static final void method419(byte arg0) {
        int var1 = 0;
        ++field968;
        if (arg0 == -32) {
            for (int var2 = 0; var2 < 104; ++var2) {
                for (int var3 = 0; ~var3 > -105; ++var3) {
                    if (class249.method1735((byte) -62, var2, var1, var3, class27.field346, true)) {
                        ++var1;
                    }
                    if (~var1 <= -513) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class65() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field964;
            int[] var3 = super.field3134.method36(arg1, 30672);
            if (super.field3134.field69) {
                int var4 = this.field960 + 1 - -this.field960;
                int var5 = this.field969 - -this.field969 - -1;
                int var6 = 65536 / var4;
                int var7 = 65536 / var5;
                int[][] var8 = new int[var4][];
                for (int var9 = arg1 - this.field960; var9 <= this.field960 + arg1; ++var9) {
                    int[] var13 = this.method1367((byte) -79, 0, var9 & class52.field704);
                    int var14 = 0;
                    int[] var15 = new int[class42.field590];
                    for (int var16 = -this.field969; var16 <= this.field969; ++var16) {
                        var14 += var13[class227.field3594 & var16];
                    }
                    int var17 = 0;
                    while (var17 < class42.field590) {
                        var15[var17] = var7 * var14 >> 16;
                        int var18 = var14 - var13[-this.field969 + var17 & class227.field3594];
                        ++var17;
                        var14 = var13[this.field969 + var17 & class227.field3594] + var18;
                    }
                    var8[this.field960 + var9 - arg1] = var15;
                }
                for (int var10 = 0; ~class42.field590 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var4 > var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var6 * var11 >> 16;
                }
            }
            return var3;
        }
    }
}
