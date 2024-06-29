import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class148 extends class70 {

    @OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
    private int field3222 = 0;

    @OriginalMember(owner = "client!vb", name = "zb", descriptor = "Z")
    private boolean field3228 = false;

    @OriginalMember(owner = "client!vb", name = "qb", descriptor = "I")
    private int field3219 = 0;

    @OriginalMember(owner = "client!vb", name = "Cb", descriptor = "I")
    private int field3231;

    @OriginalMember(owner = "client!vb", name = "Rb", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!vb", name = "Vb", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!vb", name = "Gb", descriptor = "I")
    private int field3235;

    @OriginalMember(owner = "client!vb", name = "Tb", descriptor = "I")
    private int field3248;

    @OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!vb", name = "pb", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "I")
    private int field3213;

    @OriginalMember(owner = "client!vb", name = "Qb", descriptor = "I")
    private int field3245;

    @OriginalMember(owner = "client!vb", name = "Ib", descriptor = "Ldc;")
    private class25 field3237;

    @OriginalMember(owner = "client!vb", name = "rb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3220 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!vb", name = "Hb", descriptor = "Lic;")
    public static class59 field3236 = class59.method433(0, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!vb", name = "Fb", descriptor = "Z")
    public static volatile boolean field3234 = false;

    @OriginalMember(owner = "client!vb", name = "Ob", descriptor = "Lic;")
    private static class59 field3243 = class59.method433(0, "Unable to connect)3");

    @OriginalMember(owner = "client!vb", name = "Pb", descriptor = "Lic;")
    public static class59 field3244 = field3243;

    @OriginalMember(owner = "client!vb", name = "Nb", descriptor = "Lic;")
    public static class59 field3242 = field3243;

    @OriginalMember(owner = "client!vb", name = "gb", descriptor = "D")
    private double field3209;

    @OriginalMember(owner = "client!vb", name = "ob", descriptor = "D")
    private double field3217;

    @OriginalMember(owner = "client!vb", name = "sb", descriptor = "D")
    private double field3221;

    @OriginalMember(owner = "client!vb", name = "ub", descriptor = "D")
    public double field3223;

    @OriginalMember(owner = "client!vb", name = "yb", descriptor = "D")
    public double field3227;

    @OriginalMember(owner = "client!vb", name = "Ab", descriptor = "D")
    private double field3229;

    @OriginalMember(owner = "client!vb", name = "Eb", descriptor = "D")
    public double field3233;

    @OriginalMember(owner = "client!vb", name = "Kb", descriptor = "D")
    private double field3239;

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!vb", name = "lb", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!vb", name = "mb", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
    private int field3216;

    @OriginalMember(owner = "client!vb", name = "vb", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!vb", name = "Bb", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!vb", name = "Db", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!vb", name = "Lb", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!vb", name = "Mb", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!vb", name = "Sb", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!vb", name = "Ub", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!vb", name = "Wb", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!vb", name = "Xb", descriptor = "Z")
    public static boolean field3252;

    @OriginalMember(owner = "client!vb", name = "Jb", descriptor = "[I")
    public static int[] field3238;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lwf;B)Z")
    public static final boolean method1096(class159 arg0, byte arg1) {
        field3247++;
        int var2 = arg0.field3610;
        if (var2 == 205) {
            class33.field895 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class159.field3618.method740(var3, var4 == 1, (byte) 100);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class159.field3618.method742(-83, ~var6 == -2, var5);
        }
        if (var2 == 324) {
            class159.field3618.method728(false, (byte) -65);
        }
        if (var2 == 325) {
            class159.field3618.method728(true, (byte) -119);
        }
        if (var2 == 326) {
            class145.field3164++;
            class125.field2842.method1072(177, -1);
            class159.field3618.method731(75, class125.field2842);
            return true;
        } else {
            if (arg1 >= -19) {
                method1103(23, -108);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(B)V")
    public static void method1097(byte arg0) {
        field3244 = null;
        int var1 = 98 / ((65 - arg0) / 54);
        field3238 = null;
        field3236 = null;
        field3242 = null;
        field3220 = null;
        field3243 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
    public final void method1098(int arg0, int arg1) {
        this.field3228 = true;
        this.field3233 += (double) arg0 * this.field3217;
        field3241++;
        this.field3223 += this.field3239 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3209;
        this.field3209 += (double) arg0 * this.field3239;
        this.field3227 += (double) arg0 * this.field3221;
        this.field3214 = (int) (Math.atan2(this.field3221, this.field3217) * 325.949D) + 1024 & 0x7FF;
        this.field3216 = (int) (Math.atan2(this.field3209, this.field3229) * 325.949D) & 0x7FF;
        if (arg1 <= 86 || this.field3237 == null) {
            return;
        }
        this.field3219 += arg0;
        while (true) {
            do {
                do {
                    if (this.field3237.field610[this.field3222] >= this.field3219) {
                        return;
                    }
                    this.field3219 -= this.field3237.field610[this.field3222];
                    this.field3222++;
                } while (this.field3237.field625.length > this.field3222);
                this.field3222 -= this.field3237.field639;
            } while (this.field3222 >= 0 && this.field3222 < this.field3237.field625.length);
            this.field3222 = 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
    public static final void method1099(int arg0) {
        if (arg0 < 124) {
            field3252 = true;
        }
        while (class10.field213.method1071(class34.field914, true) >= 11) {
            int var1 = class10.field213.method1064(11, -7284);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class91.field2323[var1] == null) {
                var2 = true;
                class91.field2323[var1] = new class49();
                if (class46.field1176[var1] != null) {
                    class91.field2323[var1].method384(class46.field1176[var1], 112);
                }
            }
            class31.field842[class43.field1092++] = var1;
            class49 var3 = class91.field2323[var1];
            var3.field1749 = class23.field561;
            int var4 = class10.field213.method1064(1, -7284);
            if (var4 == 1) {
                class3.field62[class106.field2526++] = var1;
            }
            int var5 = class10.field213.method1064(1, -7284);
            int var6 = class10.field213.method1064(5, -7284);
            int var7 = class142.field3121[class10.field213.method1064(3, -7284)];
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var2) {
                var3.field1702 = var3.field1724 = var7;
            }
            int var8 = class10.field213.method1064(5, -7284);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method549((byte) -24, var5 == 1, class159.field3650.field1704[0] + var8, class159.field3650.field1719[0] + var6);
        }
        class10.field213.method1070(-16777217);
        field3230++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BB)V")
    public static final void method1100(byte[] arg0, byte arg1) {
        field3215++;
        class157 var2 = new class157(arg0);
        var2.field3457 = arg0.length - 2;
        class61.field1565 = var2.method1161((byte) 60);
        class15.field298 = new int[class61.field1565];
        class136.field3037 = new byte[class61.field1565][];
        class44.field1120 = new int[class61.field1565];
        client.field488 = new int[class61.field1565];
        class100.field2471 = new int[class61.field1565];
        var2.field3457 = arg0.length - class61.field1565 * 8 - 7;
        class100.field2478 = var2.method1161((byte) 60);
        class5.field105 = var2.method1161((byte) 60);
        int var3 = (var2.method1194(false) & 0xFF) + 1;
        if (arg1 != 19) {
            method1102(null, 5, -78, -115, null, (byte) -121, -75);
        }
        for (int var4 = 0; var4 < class61.field1565; var4++) {
            class100.field2471[var4] = var2.method1161((byte) 60);
        }
        for (int var5 = 0; var5 < class61.field1565; var5++) {
            class15.field298[var5] = var2.method1161((byte) 60);
        }
        for (int var6 = 0; var6 < class61.field1565; var6++) {
            class44.field1120[var6] = var2.method1161((byte) 60);
        }
        for (int var7 = 0; var7 < class61.field1565; var7++) {
            client.field488[var7] = var2.method1161((byte) 60);
        }
        var2.field3457 = arg0.length - (var3 - 1) * 3 - class61.field1565 * 8 - 7;
        class34.field918 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class34.field918[var8] = var2.method1207((byte) 124);
            if (class34.field918[var8] == 0) {
                class34.field918[var8] = 1;
            }
        }
        var2.field3457 = 0;
        for (int var9 = 0; var9 < class61.field1565; var9++) {
            int var10 = client.field488[var9];
            int var11 = class44.field1120[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class136.field3037[var9] = var13;
            int var14 = var2.method1194(false);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1169((byte) -96);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var15 + var11 * var16] = var2.method1169((byte) 110);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3232++;
        class47.field1195[arg5].method111(arg3, arg0);
        int var6 = (arg4 - 32) * arg4 / arg1;
        class47.field1195[1].method111(arg3, arg0 + arg4 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg2 / (arg1 - arg4);
        class129.method988(arg3, arg0 + 16, 16, arg4 - 32, class56.field1381);
        class129.method988(arg3, var7 + arg0 + 16, 16, var6, class149.field3268);
        class129.method987(arg3, arg0 + var7 + 16, var6, class158.field3498);
        class129.method987(arg3 + 1, arg0 - -var7 + 16, var6, class158.field3498);
        class129.method996(arg3, arg0 + var7 + 16, 16, class158.field3498);
        class129.method996(arg3, arg0 + var7 + 17, 16, class158.field3498);
        class129.method987(arg3 + 15, arg0 - -var7 + 16, var6, class143.field3133);
        class129.method987(arg3 + 14, arg0 - -var7 + 17, var6 - 1, class143.field3133);
        class129.method996(arg3, arg0 + var7 + var6 + 15, 16, class143.field3133);
        class129.method996(arg3 + 1, var6 + var7 + arg0 + 14, 15, class143.field3133);
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Lnb;")
    public final class92 method43(byte arg0) {
        field3224++;
        if (arg0 < 21) {
            return null;
        }
        class23 var2 = class16.method87(16, this.field3231);
        class92 var3 = var2.method142(-30, this.field3222);
        if (var3 == null) {
            return null;
        } else {
            var3.method758(this.field3216);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIII[Lkd;BI)V")
    public static final void method1102(byte[] arg0, int arg1, int arg2, int arg3, class73[] arg4, byte arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg2 + var12 > 0 && arg2 + var12 < 103 && arg3 + var13 > 0 && arg3 + var13 < 103) {
                        arg4[var7].field1829[arg2 + var12][arg3 + var13] = class24.method156(arg4[var7].field1829[arg2 + var12][arg3 + var13], -16777217);
                    }
                }
            }
        }
        if (arg5 > -9) {
            field3234 = true;
        }
        field3251++;
        class157 var8 = new class157(arg0);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class149.method1105(var8, var9, arg3 + var11, arg1, arg6, arg2 + var10, (byte) 99, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
    public static final void method1103(int arg0, int arg1) {
        field3240++;
        class149 var2 = (class149) class68.field1699.method35((long) arg0, 105);
        if (var2 == null) {
            return;
        }
        int var3 = 47 / ((arg1 + 46) / 58);
        for (int var4 = 0; var4 < var2.field3261.length; var4++) {
            var2.field3261[var4] = -1;
            var2.field3256[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIII)V")
    public final void method1104(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field3228) {
            double var6 = (double) (arg3 - this.field3245);
            double var8 = (double) (arg1 - this.field3248);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3227 = (double) this.field3213 * var8 / var10 + (double) this.field3248;
            this.field3223 = this.field3235;
            this.field3233 = (double) this.field3213 * var6 / var10 + (double) this.field3245;
        }
        field3249++;
        if (arg0 <= 44) {
            method1103(-6, 122);
        }
        double var12 = (double) (this.field3218 + 1 - arg4);
        this.field3217 = ((double) arg3 - this.field3233) / var12;
        this.field3221 = ((double) arg1 - this.field3227) / var12;
        this.field3229 = Math.sqrt(this.field3221 * this.field3221 + this.field3217 * this.field3217);
        if (!this.field3228) {
            this.field3209 = -this.field3229 * Math.tan((double) this.field3250 * 0.02454369D);
        }
        this.field3239 = ((double) arg2 - this.field3223 - this.field3209 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3231 = arg0;
        this.field3246 = arg9;
        this.field3250 = arg7;
        this.field3235 = arg4;
        this.field3248 = arg2;
        this.field3210 = arg5;
        this.field3228 = false;
        this.field3218 = arg6;
        this.field3211 = arg1;
        this.field3225 = arg10;
        this.field3213 = arg8;
        this.field3245 = arg3;
        int var12 = class16.method87(16, this.field3231).field534;
        if (var12 == -1) {
            this.field3237 = null;
        } else {
            this.field3237 = class49.method381(var12, (byte) 110);
        }
    }
}
