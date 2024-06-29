import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class643 extends class157 {

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "[I")
    private int[] field9268;

    @OriginalMember(owner = "client!rw", name = "uc", descriptor = "I")
    private int field9375;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
    private int field9267;

    @OriginalMember(owner = "client!rw", name = "Sb", descriptor = "I")
    private int field9347;

    @OriginalMember(owner = "client!rw", name = "bb", descriptor = "I")
    private int field9304;

    @OriginalMember(owner = "client!rw", name = "J", descriptor = "[I")
    private int[] field9286;

    @OriginalMember(owner = "client!rw", name = "wc", descriptor = "[I")
    private int[] field9377;

    @OriginalMember(owner = "client!rw", name = "Lb", descriptor = "[S")
    private short[] field9340;

    @OriginalMember(owner = "client!rw", name = "db", descriptor = "[I")
    private int[] field9306;

    @OriginalMember(owner = "client!rw", name = "Cc", descriptor = "I")
    private int field9383;

    @OriginalMember(owner = "client!rw", name = "O", descriptor = "[Lfr;")
    private class348[] field9291;

    @OriginalMember(owner = "client!rw", name = "vb", descriptor = "[Ldl;")
    private class55[] field9324;

    @OriginalMember(owner = "client!rw", name = "fc", descriptor = "I")
    private int field9360;

    @OriginalMember(owner = "client!rw", name = "K", descriptor = "[Lve;")
    private class426[] field9287;

    @OriginalMember(owner = "client!rw", name = "A", descriptor = "[Lce;")
    private class257[] field9277;

    @OriginalMember(owner = "client!rw", name = "Wb", descriptor = "[S")
    private short[] field9351;

    @OriginalMember(owner = "client!rw", name = "Kb", descriptor = "[S")
    private short[] field9339;

    @OriginalMember(owner = "client!rw", name = "cb", descriptor = "[S")
    private short[] field9305;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "S")
    private short field9284;

    @OriginalMember(owner = "client!rw", name = "gc", descriptor = "[S")
    private short[] field9361;

    @OriginalMember(owner = "client!rw", name = "L", descriptor = "[S")
    private short[] field9288;

    @OriginalMember(owner = "client!rw", name = "B", descriptor = "[B")
    private byte[] field9278;

    @OriginalMember(owner = "client!rw", name = "zc", descriptor = "[F")
    private float[] field9380;

    @OriginalMember(owner = "client!rw", name = "Hb", descriptor = "[S")
    private short[] field9336;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "S")
    private short field9271;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "[S")
    private short[] field9273;

    @OriginalMember(owner = "client!rw", name = "T", descriptor = "[S")
    private short[] field9296;

    @OriginalMember(owner = "client!rw", name = "fb", descriptor = "[S")
    private short[] field9308;

    @OriginalMember(owner = "client!rw", name = "ob", descriptor = "[S")
    private short[] field9317;

    @OriginalMember(owner = "client!rw", name = "ic", descriptor = "[S")
    private short[] field9363;

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "[S")
    private short[] field9285;

    @OriginalMember(owner = "client!rw", name = "rb", descriptor = "[F")
    private float[] field9320;

    @OriginalMember(owner = "client!rw", name = "oc", descriptor = "[B")
    private byte[] field9369;

    @OriginalMember(owner = "client!rw", name = "Qb", descriptor = "[I")
    private int[] field9345;

    @OriginalMember(owner = "client!rw", name = "Eb", descriptor = "[I")
    private int[] field9333;

    @OriginalMember(owner = "client!rw", name = "Ub", descriptor = "[I")
    private int[] field9349;

    @OriginalMember(owner = "client!rw", name = "F", descriptor = "I")
    private int field9282;

    @OriginalMember(owner = "client!rw", name = "Rb", descriptor = "I")
    private int field9346;

    @OriginalMember(owner = "client!rw", name = "Vb", descriptor = "[[I")
    private int[][] field9350;

    @OriginalMember(owner = "client!rw", name = "Cb", descriptor = "[[I")
    private int[][] field9331;

    @OriginalMember(owner = "client!rw", name = "Nb", descriptor = "[[I")
    private int[][] field9342;

    @OriginalMember(owner = "client!rw", name = "C", descriptor = "Z")
    private boolean field9279;

    @OriginalMember(owner = "client!rw", name = "lb", descriptor = "Z")
    private boolean field9314;

    @OriginalMember(owner = "client!rw", name = "wb", descriptor = "Z")
    private boolean field9325;

    @OriginalMember(owner = "client!rw", name = "yc", descriptor = "Lbda;")
    private class428 field9379;

    @OriginalMember(owner = "client!rw", name = "pc", descriptor = "Lnr;")
    private class51 field9370;

    @OriginalMember(owner = "client!rw", name = "V", descriptor = "Lnr;")
    private class51 field9298;

    @OriginalMember(owner = "client!rw", name = "ib", descriptor = "Lnr;")
    private class51 field9311;

    @OriginalMember(owner = "client!rw", name = "mc", descriptor = "Lnr;")
    private class51 field9367;

    @OriginalMember(owner = "client!rw", name = "Tb", descriptor = "Lhl;")
    private class449 field9348;

    @OriginalMember(owner = "client!rw", name = "kb", descriptor = "[I")
    public static int[] field9313 = new int[1000];

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
    private int field9276;

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    private int field9283;

    @OriginalMember(owner = "client!rw", name = "M", descriptor = "I")
    public static int field9289;

    @OriginalMember(owner = "client!rw", name = "N", descriptor = "I")
    private int field9290;

    @OriginalMember(owner = "client!rw", name = "P", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!rw", name = "Q", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!rw", name = "R", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!rw", name = "S", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!rw", name = "U", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!rw", name = "W", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!rw", name = "X", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!rw", name = "Y", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!rw", name = "Z", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!rw", name = "ab", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!rw", name = "eb", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!rw", name = "gb", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!rw", name = "hb", descriptor = "I")
    private int field9310;

    @OriginalMember(owner = "client!rw", name = "jb", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!rw", name = "mb", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!rw", name = "nb", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!rw", name = "pb", descriptor = "I")
    private int field9318;

    @OriginalMember(owner = "client!rw", name = "qb", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!rw", name = "sb", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!rw", name = "tb", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!rw", name = "ub", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!rw", name = "xb", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!rw", name = "yb", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!rw", name = "zb", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!rw", name = "Ab", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!rw", name = "Bb", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!rw", name = "Db", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!rw", name = "Fb", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!rw", name = "Gb", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!rw", name = "Ib", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!rw", name = "Jb", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!rw", name = "Mb", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!rw", name = "Ob", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!rw", name = "Pb", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!rw", name = "Xb", descriptor = "I")
    private int field9352;

    @OriginalMember(owner = "client!rw", name = "Yb", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!rw", name = "Zb", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!rw", name = "ac", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!rw", name = "bc", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!rw", name = "cc", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!rw", name = "dc", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!rw", name = "ec", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!rw", name = "jc", descriptor = "I")
    private int field9364;

    @OriginalMember(owner = "client!rw", name = "kc", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!rw", name = "nc", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!rw", name = "qc", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!rw", name = "rc", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!rw", name = "sc", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!rw", name = "tc", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!rw", name = "vc", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!rw", name = "xc", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!rw", name = "Ac", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!rw", name = "Bc", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!rw", name = "hc", descriptor = "Ltca;")
    public static class148 field9362;

    @OriginalMember(owner = "client!rw", name = "lc", descriptor = "Ltl;")
    private class527 field9366;

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "(I)V", line = 6)
    public final void method85(int arg0) {
        field9301++;
        int var2 = class442.field6100[arg0];
        int var3 = class442.field6101[arg0];
        for (int var4 = 0; var4 < this.field9383; var4++) {
            int var5 = this.field9306[var4] * var3 - (this.field9286[var4] * var2) >> 15;
            this.field9286[var4] = this.field9306[var4] * var2 + (this.field9286[var4] * var3) >> 15;
            this.field9306[var4] = var5;
        }
        this.method3713((byte) -99);
        this.field9314 = false;
    }

    @OriginalMember(owner = "client!rw", name = "pa", descriptor = "(SS)V", line = 34)
    public final void method70(short arg0, short arg1) {
        field9323++;
        for (int var3 = 0; var3 < this.field9375; var3++) {
            if (this.field9351[var3] == arg0) {
                this.field9351[var3] = arg1;
            }
        }
        if (this.field9277 != null) {
            for (int var4 = 0; var4 < this.field9360; var4++) {
                class257 var5 = this.field9277[var4];
                class426 var6 = this.field9287[var4];
                var6.field5482 = class103.field1259[this.field9351[var5.field3311] & 0xFFFF] & 0xFFFFFF | var6.field5482 & 0xFF000000;
            }
        }
        this.method3716(16384);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "()[Lfr;", line = 74)
    public final class348[] method78() {
        field9354++;
        return this.field9291;
    }

    @OriginalMember(owner = "client!rw", name = "MA", descriptor = "()V", line = 86)
    public final void method66() {
        field9356++;
        for (int var1 = 0; var1 < this.field9304; var1++) {
            this.field9377[var1] = this.field9377[var1] + 7 >> 4;
            this.field9306[var1] = this.field9306[var1] + 7 >> 4;
            this.field9286[var1] = this.field9286[var1] + 7 >> 4;
        }
        this.method3713((byte) 88);
        this.field9314 = false;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V", line = 110)
    private final void method3699(int arg0) {
        field9274++;
        if (!this.field9279) {
            return;
        }
        this.field9279 = false;
        if (this.field9324 == null && this.field9291 == null && this.field9277 == null) {
            if (this.field9377 != null && !class9.method50(this.field9347, this.field9346, 32370)) {
                if (this.field9370 == null || this.field9370.method282(-111)) {
                    if (!this.field9314) {
                        this.method3710(-32768);
                    }
                    this.field9377 = null;
                } else {
                    this.field9279 = true;
                }
            }
            if (this.field9306 != null && !class343.method1916(0, this.field9347, this.field9346)) {
                if (this.field9370 == null || this.field9370.method282(arg0 ^ 0x48DA)) {
                    if (!this.field9314) {
                        this.method3710(-32768);
                    }
                    this.field9306 = null;
                } else {
                    this.field9279 = true;
                }
            }
            if (this.field9286 != null && !class445.method2601(arg0 ^ 0x51D4, this.field9347, this.field9346)) {
                if (this.field9370 == null || this.field9370.method282(-128)) {
                    if (!this.field9314) {
                        this.method3710(-32768);
                    }
                    this.field9286 = null;
                } else {
                    this.field9279 = true;
                }
            }
        }
        if (arg0 != 18578) {
            this.field9340 = null;
        }
        if (this.field9305 != null && this.field9377 == null && this.field9306 == null && this.field9286 == null) {
            this.field9268 = null;
            this.field9305 = null;
        }
        if (this.field9278 != null && !class400.method2292(24791, this.field9347, this.field9346)) {
            label202: {
                label201: {
                    boolean var10000;
                    if ((this.field9346 & 0x37) == 0) {
                        if (this.field9311 == null || this.field9311.method282(85)) {
                            break label201;
                        }
                        var10000 = false;
                    } else {
                        if (this.field9367 == null || this.field9367.method282(-71)) {
                            break label201;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field9279 = true;
                        break label202;
                    }
                }
                this.field9336 = this.field9273 = this.field9361 = null;
                this.field9278 = null;
            }
        }
        if (this.field9351 != null && !class265.method1481(0, this.field9346, this.field9347)) {
            if (this.field9311 == null || this.field9311.method282(arg0 ^ 0xFFFFB73D)) {
                this.field9351 = null;
            } else {
                this.field9279 = true;
            }
        }
        if (this.field9369 != null && !class431.method2496(262144, this.field9347, this.field9346)) {
            if (this.field9311 == null || this.field9311.method282(113)) {
                this.field9369 = null;
            } else {
                this.field9279 = true;
            }
        }
        if (this.field9380 != null && !class93.method566(this.field9346, this.field9347, -7)) {
            if (this.field9298 == null || this.field9298.method282(arg0 ^ 0x48DE)) {
                this.field9380 = this.field9320 = null;
            } else {
                this.field9279 = true;
            }
        }
        if (this.field9339 != null && !class265.method1483((byte) 94, this.field9346, this.field9347)) {
            if (this.field9311 == null || this.field9311.method282(-96)) {
                this.field9339 = null;
            } else {
                this.field9279 = true;
            }
        }
        if (this.field9317 != null && !class171.method954(this.field9346, this.field9347, 0)) {
            if ((this.field9348 == null || this.field9348.method2626(25)) && (this.field9311 == null || this.field9311.method282(arg0 ^ 0xFFFFB700))) {
                this.field9317 = this.field9363 = this.field9296 = null;
            } else {
                this.field9279 = true;
            }
        }
        if (this.field9308 != null) {
            if (this.field9370 == null || this.field9370.method282(arg0 ^ 0xFFFFB73B)) {
                this.field9308 = null;
            } else {
                this.field9279 = true;
            }
        }
        if (this.field9288 != null) {
            if (this.field9311 == null || this.field9311.method282(95)) {
                this.field9288 = null;
            } else {
                this.field9279 = true;
            }
        }
        if (this.field9342 != null && !class307.method1701(this.field9347, false, this.field9346)) {
            this.field9285 = null;
            this.field9342 = null;
        }
        if (this.field9350 != null && !class543.method3174(this.field9346, this.field9347, (byte) -46)) {
            this.field9350 = null;
            this.field9340 = null;
        }
        if (this.field9331 != null && !class113.method668(-89, this.field9346, this.field9347)) {
            this.field9331 = null;
        }
        if (this.field9349 != null && (this.field9347 & 0x800) == 0 && (this.field9347 & 0x40000) == 0) {
            this.field9333 = null;
            this.field9345 = null;
            this.field9349 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)V", line = 290)
    private final void method3700(int arg0) {
        int var2 = -55 / ((34 - arg0) / 36);
        field9330++;
        if (this.field9277 == null) {
            return;
        }
        float var3 = this.field9379.method1186();
        float var4 = this.field9379.method1167();
        this.field9379.method1181(false);
        this.field9379.method2452(false, (byte) -94);
        this.field9379.method2435(1, 100, class264.field3445);
        this.field9379.method2465(class264.field3445, -14787, 1);
        for (int var5 = 0; var5 < this.field9360; var5++) {
            class257 var6 = this.field9277[var5];
            class426 var7 = this.field9287[var5];
            if (!var6.field3303 || !this.field9379.method1143()) {
                float var8 = (float) (this.field9377[var6.field3307] + this.field9377[var6.field3297] + this.field9377[var6.field3296]) * 0.3333333F;
                float var9 = (float) (this.field9306[var6.field3307] + this.field9306[var6.field3296] + this.field9306[var6.field3297]) * 0.3333333F;
                float var10 = (float) (this.field9286[var6.field3307] + this.field9286[var6.field3297] + this.field9286[var6.field3296]) * 0.3333333F;
                float var11 = class540.field7899 * var10 + class396.field5229 * var8 + class133.field1639 * var9 + class152.field1828;
                float var12 = class592.field8603 * var10 + class536.field7521 * var9 + class319.field4070 * var8 + class434.field5885;
                float var13 = class614.field8890 * var10 + class621.field8962 * var9 + class504.field6992 * var8 + class510.field7222;
                class335 var14 = this.field9379.method2471((byte) 126);
                var14.method1875(var7.field5489, var6.field3302 * var7.field5485 >> 7, (float) var7.field5492 + var12, 1, var13, (float) var7.field5491 + var11, var6.field3300 * var7.field5487 >> 7);
                var14.method1885(this.field9379.field5693, (byte) -6);
                this.field9379.method2457((byte) 113);
                this.field9379.method1106(var4, var3 - (float) var6.field3306 * 1.5F);
                int var15 = var7.field5482;
                this.field9379.method2439(var6.field3301, false, false, (byte) 117);
                this.field9379.method2405(var6.field3309, -18001);
                this.field9379.method2437(var6.field3305, -3);
                this.field9379.method2434(127, var15);
                this.field9379.method2427((byte) -90);
            }
        }
        this.field9379.method2465(class99.field1226, -14787, 1);
        this.field9379.method2435(1, 97, class99.field1226);
        this.field9379.method1106(var4, var3);
        this.field9379.method1181(true);
    }

    @OriginalMember(owner = "client!rw", name = "wa", descriptor = "()I", line = 357)
    public final int method90() {
        if (!this.field9314) {
            this.method3710(-32768);
        }
        field9368++;
        return this.field9352;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lbe;I)V", line = 370)
    private final void method3701(class34 arg0, int arg1) {
        if (this.field9282 > class103.field1261.length) {
            class170.field2077 = new int[this.field9282];
            class103.field1261 = new int[this.field9282];
        }
        field9372++;
        for (int var3 = 0; var3 < this.field9383; var3++) {
            int var14 = (this.field9377[var3] - (this.field9306[var3] * this.field9379.field5727 >> 8) >> this.field9379.field5699) - arg0.field264;
            int var15 = (this.field9286[var3] - (this.field9306[var3] * this.field9379.field5760 >> 8) >> this.field9379.field5699) - arg0.field268;
            int var16 = this.field9268[var3];
            int var17 = this.field9268[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field9305[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class103.field1261[var19] = var14;
                class170.field2077[var19] = var15;
            }
        }
        for (int var4 = arg1; var4 < this.field9267; var4++) {
            if (this.field9369 == null || this.field9369[var4] <= 128) {
                short var5 = this.field9317[var4];
                short var6 = this.field9363[var4];
                short var7 = this.field9296[var4];
                int var8 = class103.field1261[var5];
                int var9 = class103.field1261[var6];
                int var10 = class103.field1261[var7];
                int var11 = class170.field2077[var5];
                int var12 = class170.field2077[var6];
                int var13 = class170.field2077[var7];
                if (((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11))) > 0) {
                    arg0.method195(var11, var9, var13, var10, var12, 410484688, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "BA", descriptor = "(I[IIIIZI[I)V", line = 449)
    public final void method84(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field9381++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            class535.field7511 = 0;
            int var13 = 0;
            class406.field5332 = 0;
            class64.field634 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field9350.length > var15) {
                    int[] var16 = this.field9350[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field9340 == null || (this.field9340[var18] & arg6) != 0) {
                            class535.field7511 += this.field9377[var18];
                            class64.field634 += this.field9306[var18];
                            var13++;
                            class406.field5332 += this.field9286[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class530.field7451 = true;
                class535.field7511 = class535.field7511 / var13 + var12;
                class406.field5332 = class406.field5332 / var13 + var11;
                class64.field634 = class64.field634 / var13 + var10;
            } else {
                class64.field634 = var10;
                class406.field5332 = var11;
                class535.field7511 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + (arg7[3] * arg2 - -16384) >> 15;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 16384 >> 15;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field9350.length > var26) {
                    int[] var27 = this.field9350[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field9340 == null || (this.field9340[var29] & arg6) != 0) {
                            this.field9377[var29] += var24;
                            this.field9306[var29] += var23;
                            this.field9286[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field9350.length) {
                        int[] var110 = this.field9350[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field9340 == null || (arg6 & this.field9340[var112]) != 0) {
                                this.field9377[var112] -= class535.field7511;
                                this.field9306[var112] -= class64.field634;
                                this.field9286[var112] -= class406.field5332;
                                if (arg4 != 0) {
                                    int var113 = class442.field6100[arg4];
                                    int var114 = class442.field6101[arg4];
                                    int var115 = this.field9306[var112] * var113 + this.field9377[var112] * var114 + 32767 >> 15;
                                    this.field9306[var112] = this.field9306[var112] * var114 + 32767 - (this.field9377[var112] * var113) >> 15;
                                    this.field9377[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class442.field6100[arg2];
                                    int var117 = class442.field6101[arg2];
                                    int var118 = this.field9306[var112] * var117 + 32767 - (this.field9286[var112] * var116) >> 15;
                                    this.field9286[var112] = this.field9306[var112] * var116 + this.field9286[var112] * var117 + 32767 >> 15;
                                    this.field9306[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class442.field6100[arg3];
                                    int var120 = class442.field6101[arg3];
                                    int var121 = this.field9377[var112] * var120 + this.field9286[var112] * var119 + 32767 >> 15;
                                    this.field9286[var112] = this.field9286[var112] * var120 + 32767 - (this.field9377[var112] * var119) >> 15;
                                    this.field9377[var112] = var121;
                                }
                                this.field9377[var112] += class535.field7511;
                                this.field9306[var112] += class64.field634;
                                this.field9286[var112] += class406.field5332;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field9350.length) {
                            int[] var93 = this.field9350[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field9340 == null || (this.field9340[var95] & arg6) != 0) {
                                    int var96 = this.field9268[var95];
                                    int var97 = this.field9268[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field9305[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class442.field6100[arg4];
                                            int var101 = class442.field6101[arg4];
                                            int var102 = this.field9273[var99] * var100 + (this.field9336[var99] * var101) + 32767 >> 15;
                                            this.field9273[var99] = (short) (this.field9273[var99] * var101 + 32767 - (this.field9336[var99] * var100) >> 15);
                                            this.field9336[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class442.field6100[arg2];
                                            int var104 = class442.field6101[arg2];
                                            int var105 = this.field9273[var99] * var104 + 32767 - this.field9361[var99] * var103 >> 15;
                                            this.field9361[var99] = (short) (this.field9361[var99] * var104 + this.field9273[var99] * var103 + 32767 >> 15);
                                            this.field9273[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class442.field6100[arg3];
                                            int var107 = class442.field6101[arg3];
                                            int var108 = this.field9361[var99] * var106 + this.field9336[var99] * var107 + 32767 >> 15;
                                            this.field9361[var99] = (short) (this.field9361[var99] * var107 + 32767 - (this.field9336[var99] * var106) >> 15);
                                            this.field9336[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method3702(true);
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class530.field7451) {
                    int var36 = arg7[6] * class406.field5332 + arg7[3] * class64.field634 + arg7[0] * class535.field7511 + 16384 >> 15;
                    int var37 = arg7[1] * class535.field7511 + arg7[4] * class64.field634 + arg7[7] * class406.field5332 + 16384 >> 15;
                    int var38 = var33 + var36;
                    int var39 = var34 + var37;
                    int var40 = arg7[8] * class406.field5332 + arg7[5] * class64.field634 + arg7[2] * class535.field7511 + 16384 >> 15;
                    class64.field634 = var39;
                    int var41 = var35 + var40;
                    class535.field7511 = var38;
                    class406.field5332 = var41;
                    class530.field7451 = false;
                }
                int[] var42 = new int[9];
                int var43 = class442.field6101[arg2];
                int var44 = class442.field6100[arg2];
                int var45 = class442.field6101[arg3];
                int var46 = class442.field6100[arg3];
                int var47 = class442.field6101[arg4];
                int var48 = class442.field6100[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[6] = -var46 * var47 + (var45 * var50) + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[7] = var46 * var48 + var45 * var49 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[5] = -var44;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[1] * -class64.field634 + (var42[2] * -class406.field5332) + var42[0] * -class535.field7511 + 16384 >> 15;
                int var52 = var42[3] * -class535.field7511 + var42[4] * -class64.field634 + var42[5] * -class406.field5332 + 16384 >> 15;
                int var53 = var42[7] * -class64.field634 + var42[8] * -class406.field5332 + var42[6] * -class535.field7511 + 16384 >> 15;
                int var54 = class535.field7511 + var51;
                int var55 = class64.field634 + var52;
                int var56 = class406.field5332 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[0] * var33 + var42[2] * var35 + var42[1] * var34 + 16384 >> 15;
                int var60 = var42[5] * var35 + var42[4] * var34 + var42[3] * var33 + 16384 >> 15;
                int var61 = var42[6] * var33 + var42[7] * var34 + var42[8] * var35 + 16384 >> 15;
                int var62 = var55 + var60;
                int var63 = var54 + var59;
                int var64 = var56 + var61;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[0] * var63 + arg7[2] * var64 + arg7[1] * var62 + 16384 >> 15;
                int var68 = arg7[3] * var63 + arg7[4] * var62 + (arg7[5] * var64) + 16384 >> 15;
                int var69 = arg7[8] * var64 + arg7[6] * var63 + arg7[7] * var62 + 16384 >> 15;
                int var70 = var30 + var67;
                int var71 = var31 + var68;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field9350.length > var74) {
                        int[] var75 = this.field9350[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field9340 == null || (arg6 & this.field9340[var77]) != 0) {
                                int var78 = this.field9377[var77] * var65[0] + this.field9306[var77] * var65[1] + this.field9286[var77] * var65[2] + 16384 >> 15;
                                int var79 = this.field9286[var77] * var65[5] + this.field9377[var77] * var65[3] + this.field9306[var77] * var65[4] + 16384 >> 15;
                                int var80 = var71 + var79;
                                int var81 = var70 + var78;
                                int var82 = this.field9306[var77] * var65[7] + this.field9377[var77] * var65[6] + this.field9286[var77] * var65[8] + 16384 >> 15;
                                int var83 = var72 + var82;
                                this.field9377[var77] = var81;
                                this.field9306[var77] = var80;
                                this.field9286[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field9350.length) {
                        int[] var174 = this.field9350[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field9340 == null || (this.field9340[var176] & arg6) != 0) {
                                this.field9377[var176] -= class535.field7511;
                                this.field9306[var176] -= class64.field634;
                                this.field9286[var176] -= class406.field5332;
                                this.field9377[var176] = this.field9377[var176] * arg2 >> 7;
                                this.field9306[var176] = this.field9306[var176] * arg3 >> 7;
                                this.field9286[var176] = this.field9286[var176] * arg4 >> 7;
                                this.field9377[var176] += class535.field7511;
                                this.field9306[var176] += class64.field634;
                                this.field9286[var176] += class406.field5332;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class530.field7451) {
                    int var128 = arg7[6] * class406.field5332 + arg7[3] * class64.field634 + arg7[0] * class535.field7511 + 16384 >> 15;
                    int var129 = arg7[1] * class535.field7511 + 16384 - (-(arg7[4] * class64.field634) - arg7[7] * class406.field5332) >> 15;
                    int var130 = var126 + var129;
                    int var131 = var125 + var128;
                    int var132 = arg7[2] * class535.field7511 + arg7[8] * class406.field5332 + arg7[5] * class64.field634 + 16384 >> 15;
                    class535.field7511 = var131;
                    class64.field634 = var130;
                    int var133 = var127 + var132;
                    class406.field5332 = var133;
                    class530.field7451 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class535.field7511 * var134 + 16384 >> 15;
                int var138 = -class64.field634 * var135 + 16384 >> 15;
                int var139 = -class406.field5332 * var136 + 16384 >> 15;
                int var140 = var137 + class535.field7511;
                int var141 = class64.field634 + var138;
                int var142 = var139 + class406.field5332;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var141 + var145;
                int var147 = var127 * var136 + 16384 >> 15;
                int var148 = var140 + var144;
                int var149 = var142 + var147;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 16384 >> 15;
                    }
                }
                int var152 = arg7[0] * var148 + arg7[1] * var146 + arg7[2] * var149 + 16384 >> 15;
                int var153 = arg7[5] * var149 + arg7[3] * var148 + arg7[4] * var146 + 16384 >> 15;
                int var154 = arg7[8] * var149 + arg7[7] * var146 + arg7[6] * var148 + 16384 >> 15;
                int var155 = var122 + var152;
                int var156 = var123 + var153;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field9350.length) {
                        int[] var160 = this.field9350[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field9340 == null || (arg6 & this.field9340[var162]) != 0) {
                                int var163 = this.field9377[var162] * var150[0] + (this.field9306[var162] * var150[1] + (this.field9286[var162] * var150[2])) + 16384 >> 15;
                                int var164 = this.field9306[var162] * var150[4] + this.field9377[var162] * var150[3] + (this.field9286[var162] * var150[5]) + 16384 >> 15;
                                int var165 = var156 + var164;
                                int var166 = var155 + var163;
                                int var167 = this.field9306[var162] * var150[7] + this.field9377[var162] * var150[6] + this.field9286[var162] * var150[8] + 16384 >> 15;
                                this.field9377[var162] = var166;
                                int var168 = var157 + var167;
                                this.field9306[var162] = var165;
                                this.field9286[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9342 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (this.field9342.length > var182) {
                        int[] var183 = this.field9342[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field9285 == null || (this.field9285[var185] & arg6) != 0) {
                                int var186 = (this.field9369[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field9369[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field9277 != null) {
                        for (int var179 = 0; var179 < this.field9360; var179++) {
                            class257 var180 = this.field9277[var179];
                            class426 var181 = this.field9287[var179];
                            var181.field5482 = var181.field5482 & 0xFFFFFF | 255 - (this.field9369[var180.field3311] & 0xFF) << 24;
                        }
                    }
                    this.method3716(16384);
                }
            }
        } else if (arg0 == 7) {
            if (this.field9342 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (this.field9342.length > var192) {
                        int[] var193 = this.field9342[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field9285 == null || (this.field9285[var195] & arg6) != 0) {
                                int var196 = this.field9351[var195] & 0xFFFF;
                                int var197 = (var196 & 0xFF61) >> 10;
                                int var198 = (var196 & 0x3AD) >> 7;
                                int var199 = var196 & 0x7F;
                                int var200 = arg3 / 4 + var198;
                                int var201 = arg2 + var197 & 0x3F;
                                int var202 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 7) {
                                    var200 = 7;
                                }
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field9351[var195] = (short) class42.method223(var202, class42.method223(var200 << 7, var201 << 10));
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field9277 != null) {
                        for (int var189 = 0; var189 < this.field9360; var189++) {
                            class257 var190 = this.field9277[var189];
                            class426 var191 = this.field9287[var189];
                            var191.field5482 = var191.field5482 & 0xFF000000 | class103.field1259[this.field9351[var190.field3311] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method3716(16384);
                }
            }
        } else if (arg0 == 8) {
            if (this.field9331 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field9331.length) {
                        int[] var205 = this.field9331[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class426 var207 = this.field9287[var205[var206]];
                            var207.field5491 += arg2;
                            var207.field5492 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9331 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (var209 < this.field9331.length) {
                        int[] var210 = this.field9331[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class426 var212 = this.field9287[var210[var211]];
                            var212.field5487 = var212.field5487 * arg3 >> 7;
                            var212.field5485 = var212.field5485 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9331 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (this.field9331.length > var214) {
                    int[] var215 = this.field9331[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class426 var217 = this.field9287[var215[var216]];
                        var217.field5489 = var217.field5489 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(Z)V", line = 1436)
    private final void method3702(boolean arg0) {
        field9374++;
        if ((this.field9346 & 0x37) == 0) {
            if (this.field9311 != null) {
                this.field9311.field436 = false;
            }
        } else if (this.field9367 != null) {
            this.field9367.field436 = false;
        }
        if (!arg0) {
            this.method3709((byte) 125);
        }
    }

    @OriginalMember(owner = "client!rw", name = "RA", descriptor = "(IILsa;Lsa;III)V", line = 1460)
    public final void method87(int arg0, int arg1, class174 arg2, class174 arg3, int arg4, int arg5, int arg6) {
        field9322++;
        if (!this.field9314) {
            this.method3710(-32768);
        }
        int var8 = arg4 + this.field9352;
        int var9 = this.field9276 + arg4;
        int var10 = this.field9283 + arg6;
        int var11 = this.field9364 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field2116 <= (arg2.field2115 + var9 >> arg2.field2111) || var10 < 0 || var11 + arg2.field2115 >> arg2.field2111 >= arg2.field2114) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (var9 + arg3.field2115 >> arg3.field2111) >= arg3.field2116 || var10 < 0 || (arg3.field2115 + var11 >> arg3.field2111) >= arg3.field2114) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2111;
            int var13 = var9 + arg2.field2115 - 1 >> arg2.field2111;
            int var14 = var10 >> arg2.field2111;
            int var15 = arg2.field2115 + var11 - 1 >> arg2.field2111;
            if (arg5 == arg2.method855(var12, var14) && arg5 == arg2.method855(var13, var14) && arg5 == arg2.method855(var12, var15) && arg2.method855(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field9383; var16++) {
                this.field9306[var16] -= arg5 - arg2.method847(this.field9377[var16] + arg4, this.field9286[var16] + arg6);
            }
        } else if (arg0 == 2) {
            int var17 = this.field9310;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field9383; var18++) {
                int var19 = (this.field9306[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field9306[var18] += (arg1 - var19) * (arg2.method847(this.field9377[var18] + arg4, this.field9286[var18] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = ((arg1 & 0xFF94) >> 8) * 4;
            int var31 = arg1 >> 16 & 0xFF << 6;
            int var32 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var29 >> 1)) < 0 || (arg2.field2116 << arg2.field2111) <= ((var29 >> 1) + arg4 + arg2.field2115) || arg6 - (var30 >> 1) < 0 || ((var30 >> 1) + arg2.field2115 + arg6) >= (arg2.field2114 << arg2.field2111)) {
                return;
            }
            this.method864(var32, -15794, var31, arg6, var30, arg4, arg2, var29, arg5);
        } else if (arg0 == 4) {
            int var27 = this.field9318 - this.field9310;
            for (int var28 = 0; var28 < this.field9383; var28++) {
                this.field9306[var28] = this.field9306[var28] + (arg3.method847(this.field9377[var28] + arg4, this.field9286[var28] + arg6) - arg5) + var27;
            }
        } else if (arg0 == 5) {
            int var20 = this.field9318 - this.field9310;
            for (int var21 = 0; var21 < this.field9383; var21++) {
                int var22 = this.field9377[var21] + arg4;
                int var23 = this.field9286[var21] + arg6;
                int var24 = arg2.method847(var22, var23);
                int var25 = arg3.method847(var22, var23);
                int var26 = var24 - var25;
                this.field9306[var21] = ((this.field9306[var21] << 8) / var20 * var26 >> 8) + var24 - arg5;
            }
        }
        this.method3713((byte) -107);
        this.field9314 = false;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lbda;IIZZ)V", line = 6318)
    public class643(class428 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field9267 = 0;
        this.field9279 = true;
        this.field9314 = false;
        this.field9304 = 0;
        this.field9325 = false;
        this.field9375 = 0;
        this.field9282 = 0;
        this.field9383 = 0;
        this.field9379 = arg0;
        this.field9347 = arg1;
        this.field9346 = arg2;
        this.field9325 = arg4;
        if (arg3 || class114.method678(this.field9346, -20042, this.field9347)) {
            this.field9370 = new class51(class383.method2215(this.field9347, 64, this.field9346));
        }
        if (arg3 || class70.method386((byte) 52, this.field9347, this.field9346)) {
            this.field9298 = new class51(class13.method101(this.field9346, (byte) 27, this.field9347));
        }
        if (arg3 || class187.method1024(3, this.field9347, this.field9346)) {
            this.field9311 = new class51(class337.method1896(this.field9346, (byte) 107, this.field9347));
        }
        if (arg3 || class205.method1096(false, this.field9346, this.field9347)) {
            this.field9367 = new class51(class402.method2299(this.field9346, 8192, this.field9347));
        }
        if (arg3 || class358.method2012(1, this.field9346, this.field9347)) {
            this.field9348 = new class449(class140.method780((byte) -80, this.field9347, this.field9346));
        }
    }

    @OriginalMember(owner = "client!rw", name = "TA", descriptor = "()I", line = 1615)
    public final int method74() {
        if (!this.field9314) {
            this.method3710(-32768);
        }
        field9289++;
        return this.field9310;
    }

    @OriginalMember(owner = "client!rw", name = "M", descriptor = "()I", line = 1627)
    public final int method95() {
        field9309++;
        return this.field9284;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lpq;Ljava/awt/Frame;B)V", line = 1638)
    public static final void method3703(class165 arg0, Frame arg1, byte arg2) {
        while (true) {
            class506 var3 = arg0.method904(arg1, -118);
            while (var3.field7031 == 0) {
                class462.method2688(10L, (byte) 110);
            }
            if (var3.field7031 == 1) {
                field9275++;
                if (arg2 != 98) {
                    method3703(null, null, (byte) 59);
                }
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class462.method2688(100L, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!rw", name = "ea", descriptor = "(I[IIIIIZ)V", line = 1663)
    public final void method65(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field9373++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            class535.field7511 = 0;
            int var12 = 0;
            class64.field634 = 0;
            class406.field5332 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field9350.length) {
                    int[] var15 = this.field9350[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class535.field7511 += this.field9377[var17];
                        class64.field634 += this.field9306[var17];
                        var12++;
                        class406.field5332 += this.field9286[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class406.field5332 = var9;
                class64.field634 = var10;
                class535.field7511 = var11;
            } else {
                class535.field7511 = class535.field7511 / var12 + var11;
                class406.field5332 = class406.field5332 / var12 + var9;
                class64.field634 = class64.field634 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field9350.length) {
                    int[] var23 = this.field9350[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field9377[var25] += var20;
                        this.field9306[var25] += var19;
                        this.field9286[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field9350.length) {
                    int[] var46 = this.field9350[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field9377[var48] -= class535.field7511;
                            this.field9306[var48] -= class64.field634;
                            this.field9286[var48] -= class406.field5332;
                            if (arg4 != 0) {
                                int var49 = class442.field6100[arg4];
                                int var50 = class442.field6101[arg4];
                                int var51 = this.field9377[var48] * var50 + this.field9306[var48] * var49 + 32767 >> 15;
                                this.field9306[var48] = this.field9306[var48] * var50 + 32767 - this.field9377[var48] * var49 >> 15;
                                this.field9377[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class442.field6100[arg2];
                                int var53 = class442.field6101[arg2];
                                int var54 = this.field9306[var48] * var53 + 32767 - (this.field9286[var48] * var52) >> 15;
                                this.field9286[var48] = this.field9306[var48] * var52 + this.field9286[var48] * var53 + 32767 >> 15;
                                this.field9306[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class442.field6100[arg3];
                                int var56 = class442.field6101[arg3];
                                int var57 = this.field9377[var48] * var56 + this.field9286[var48] * var55 + 32767 >> 15;
                                this.field9286[var48] = this.field9286[var48] * var56 + 32767 - (this.field9377[var48] * var55) >> 15;
                                this.field9377[var48] = var57;
                            }
                            this.field9377[var48] += class535.field7511;
                            this.field9306[var48] += class64.field634;
                            this.field9286[var48] += class406.field5332;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field9377[var59] -= class535.field7511;
                            this.field9306[var59] -= class64.field634;
                            this.field9286[var59] -= class406.field5332;
                            if (arg2 != 0) {
                                int var60 = class442.field6100[arg2];
                                int var61 = class442.field6101[arg2];
                                int var62 = this.field9306[var59] * var61 + 32767 - this.field9286[var59] * var60 >> 15;
                                this.field9286[var59] = this.field9306[var59] * var60 + this.field9286[var59] * var61 + 32767 >> 15;
                                this.field9306[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class442.field6100[arg4];
                                int var64 = class442.field6101[arg4];
                                int var65 = this.field9306[var59] * var63 + (this.field9377[var59] * var64 + 32767) >> 15;
                                this.field9306[var59] = this.field9306[var59] * var64 - (this.field9377[var59] * var63 - 32767) >> 15;
                                this.field9377[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class442.field6100[arg3];
                                int var67 = class442.field6101[arg3];
                                int var68 = this.field9377[var59] * var67 + this.field9286[var59] * var66 + 32767 >> 15;
                                this.field9286[var59] = this.field9286[var59] * var67 - (this.field9377[var59] * var66 - 32767) >> 15;
                                this.field9377[var59] = var68;
                            }
                            this.field9377[var59] += class535.field7511;
                            this.field9306[var59] += class64.field634;
                            this.field9286[var59] += class406.field5332;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field9350.length > var28) {
                        int[] var29 = this.field9350[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field9268[var31];
                            int var33 = this.field9268[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field9305[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class442.field6100[arg4];
                                    int var37 = class442.field6101[arg4];
                                    int var38 = this.field9273[var35] * var36 + this.field9336[var35] * var37 + 32767 >> 15;
                                    this.field9273[var35] = (short) (this.field9273[var35] * var37 + 32767 - (this.field9336[var35] * var36) >> 15);
                                    this.field9336[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class442.field6100[arg2];
                                    int var40 = class442.field6101[arg2];
                                    int var41 = this.field9273[var35] * var40 + 32767 - (this.field9361[var35] * var39) >> 15;
                                    this.field9361[var35] = (short) (this.field9361[var35] * var40 + (this.field9273[var35] * var39 + 32767) >> 15);
                                    this.field9273[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class442.field6100[arg3];
                                    int var43 = class442.field6101[arg3];
                                    int var44 = this.field9361[var35] * var42 + this.field9336[var35] * var43 + 32767 >> 15;
                                    this.field9361[var35] = (short) (this.field9361[var35] * var43 + 32767 - (this.field9336[var35] * var42) >> 15);
                                    this.field9336[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method3702(true);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field9350.length) {
                    int[] var71 = this.field9350[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field9377[var73] -= class535.field7511;
                        this.field9306[var73] -= class64.field634;
                        this.field9286[var73] -= class406.field5332;
                        this.field9377[var73] = this.field9377[var73] * arg2 >> 7;
                        this.field9306[var73] = this.field9306[var73] * arg3 >> 7;
                        this.field9286[var73] = this.field9286[var73] * arg4 >> 7;
                        this.field9377[var73] += class535.field7511;
                        this.field9306[var73] += class64.field634;
                        this.field9286[var73] += class406.field5332;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9342 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (this.field9342.length > var79) {
                        int[] var80 = this.field9342[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field9369[var82] & 0xFF) + arg2 * 8;
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field9369[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field9277 != null) {
                        for (int var76 = 0; var76 < this.field9360; var76++) {
                            class257 var77 = this.field9277[var76];
                            class426 var78 = this.field9287[var76];
                            var78.field5482 = 255 - (this.field9369[var77.field3311] & 0xFF) << 24 | var78.field5482 & 0xFFFFFF;
                        }
                    }
                    this.method3716(16384);
                }
            }
        } else if (arg0 == 7) {
            if (this.field9342 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (var89 < this.field9342.length) {
                        int[] var90 = this.field9342[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field9351[var92] & 0xFFFF;
                            int var94 = (var93 & 0xFFDE) >> 10;
                            int var95 = (var93 & 0x3ED) >> 7;
                            int var96 = arg2 + var94 & 0x3F;
                            int var97 = arg3 / 4 + var95;
                            int var98 = var93 & 0x7F;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 7) {
                                var97 = 7;
                            }
                            int var99 = arg4 + var98;
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field9351[var92] = (short) class42.method223(var99, class42.method223(var97 << 7, var96 << 10));
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field9277 != null) {
                        for (int var86 = 0; var86 < this.field9360; var86++) {
                            class257 var87 = this.field9277[var86];
                            class426 var88 = this.field9287[var86];
                            var88.field5482 = var88.field5482 & 0xFF000000 | class103.field1259[this.field9351[var87.field3311] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method3716(16384);
                }
            }
        } else if (arg0 == 8) {
            if (this.field9331 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (this.field9331.length > var101) {
                        int[] var102 = this.field9331[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class426 var104 = this.field9287[var102[var103]];
                            var104.field5492 += arg3;
                            var104.field5491 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9331 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (this.field9331.length > var106) {
                        int[] var107 = this.field9331[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class426 var109 = this.field9287[var107[var108]];
                            var109.field5485 = var109.field5485 * arg2 >> 7;
                            var109.field5487 = var109.field5487 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9331 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (this.field9331.length > var111) {
                    int[] var112 = this.field9331[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class426 var114 = this.field9287[var112[var113]];
                        var114.field5489 = var114.field5489 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lr;IIIZ)V", line = 2324)
    public final void method67(class157 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9316++;
        class643 var6 = (class643) arg0;
        if (this.field9375 == 0 || var6.field9375 == 0) {
            return;
        }
        int var7 = var6.field9383;
        int[] var8 = var6.field9377;
        int[] var9 = var6.field9306;
        int[] var10 = var6.field9286;
        short[] var11 = var6.field9336;
        short[] var12 = var6.field9273;
        short[] var13 = var6.field9361;
        byte[] var14 = var6.field9278;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field9366 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field9366.field7381;
            var16 = this.field9366.field7386;
            var17 = this.field9366.field7387;
            var18 = this.field9366.field7385;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field9366 == null) {
            var21 = null;
            var22 = null;
            var19 = null;
            var20 = null;
        } else {
            var19 = var6.field9366.field7381;
            var20 = var6.field9366.field7385;
            var21 = var6.field9366.field7387;
            var22 = var6.field9366.field7386;
        }
        int[] var23 = var6.field9268;
        short[] var24 = var6.field9305;
        if (!var6.field9314) {
            var6.method3710(-32768);
        }
        int var25 = var6.field9310;
        int var26 = var6.field9318;
        int var27 = var6.field9352;
        int var28 = var6.field9276;
        int var29 = var6.field9283;
        int var30 = var6.field9364;
        for (int var31 = 0; var31 < this.field9383; var31++) {
            int var32 = this.field9306[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field9377[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field9286[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field9268[var31];
                        int var37 = this.field9268[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field9305[var38] - 1;
                            if (var35 == -1 || this.field9278[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var15 == null) {
                                            this.field9366 = new class527();
                                            var15 = this.field9366.field7381 = class209.method1205((byte) -11, this.field9336);
                                            var17 = this.field9366.field7387 = class209.method1205((byte) -11, this.field9273);
                                            var16 = this.field9366.field7386 = class209.method1205((byte) -11, this.field9361);
                                            var18 = this.field9366.field7385 = class86.method504(0, this.field9278);
                                        }
                                        if (var19 == null) {
                                            class527 var44 = var6.field9366 = new class527();
                                            var19 = var44.field7381 = class209.method1205((byte) -11, var11);
                                            var21 = var44.field7387 = class209.method1205((byte) -11, var12);
                                            var22 = var44.field7386 = class209.method1205((byte) -11, var13);
                                            var20 = var44.field7385 = class86.method504(0, var14);
                                        }
                                        short var45 = this.field9336[var35];
                                        short var46 = this.field9273[var35];
                                        short var47 = this.field9361[var35];
                                        byte var48 = this.field9278[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var19[var52] += var45;
                                                var21[var52] += var46;
                                                var22[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var41];
                                        short var54 = var13[var41];
                                        short var55 = var12[var41];
                                        int var56 = this.field9268[var31];
                                        byte var57 = var14[var41];
                                        int var58 = this.field9268[var31 + 1];
                                        for (int var59 = var56; var59 < var58; var59++) {
                                            int var60 = this.field9305[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var17[var60] += var55;
                                                var16[var60] += var54;
                                                var18[var60] += var57;
                                            }
                                        }
                                        var6.method3702(true);
                                        this.method3702(true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "()Z", line = 2586)
    public final boolean method75() {
        field9302++;
        if (this.field9339 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field9339.length; var1++) {
            if (this.field9339[var1] != -1 && !this.field9379.field2481.method118(this.field9339[var1], (byte) 46)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rw", name = "X", descriptor = "()V", line = 2608)
    public final void method86() {
        field9280++;
        for (int var1 = 0; var1 < this.field9383; var1++) {
            this.field9286[var1] = -this.field9286[var1];
        }
        for (int var2 = 0; var2 < this.field9282; var2++) {
            this.field9361[var2] = (short) (-this.field9361[var2]);
        }
        for (int var3 = 0; var3 < this.field9375; var3++) {
            short var4 = this.field9317[var3];
            this.field9317[var3] = this.field9296[var3];
            this.field9296[var3] = var4;
        }
        this.method3713((byte) -117);
        this.method3702(true);
        this.method3715(false);
        this.field9314 = false;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "()V", line = 2652)
    public final void method97() {
        field9334++;
        if (this.field9282 > 0 && this.field9267 > 0) {
            this.method3711(false);
            this.method3704(0);
            this.method3699(18578);
        }
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "()[Ldl;", line = 2666)
    public final class55[] method59() {
        field9332++;
        return this.field9324;
    }

    @OriginalMember(owner = "client!rw", name = "ba", descriptor = "()I", line = 2684)
    public final int method77() {
        field9299++;
        return this.field9347;
    }

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "()I", line = 2693)
    public final int method73() {
        if (!this.field9314) {
            this.method3710(-32768);
        }
        field9292++;
        return this.field9318;
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(I)Z", line = 2707)
    private final boolean method3704(int arg0) {
        field9321++;
        if (this.field9348.field6221) {
            return true;
        }
        if (this.field9348.field6220 == null) {
            this.field9348.field6220 = this.field9379.method1795(this.field9325, (byte) -59);
        }
        class419 var2 = this.field9348.field6220;
        var2.method644(62, this.field9267 * 6);
        Buffer var3 = var2.method440(-124, true);
        if (arg0 != 0) {
            this.field9290 = 42;
        }
        if (var3 != null) {
            Stream var4 = this.field9379.method2426(var3, (byte) 11);
            if (Stream.method3340()) {
                for (int var5 = 0; var5 < this.field9267; var5++) {
                    var4.method3339(this.field9317[var5]);
                    var4.method3339(this.field9363[var5]);
                    var4.method3339(this.field9296[var5]);
                }
            } else {
                for (int var6 = 0; var6 < this.field9267; var6++) {
                    var4.method3341(this.field9317[var6]);
                    var4.method3341(this.field9363[var6]);
                    var4.method3341(this.field9296[var6]);
                }
            }
            var4.method3342();
            if (var2.method442(-105)) {
                this.field9348.field6218 = var2;
                this.field9279 = true;
                this.field9348.field6221 = true;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "(I)V", line = 2776)
    public final void method94(int arg0) {
        field9343++;
        this.field9271 = (short) arg0;
        this.method3713((byte) 64);
        this.method3702(true);
    }

    @OriginalMember(owner = "client!rw", name = "OA", descriptor = "(I)V", line = 2788)
    public final void method92(int arg0) {
        field9376++;
        int var2 = class442.field6100[arg0];
        int var3 = class442.field6101[arg0];
        for (int var4 = 0; var4 < this.field9383; var4++) {
            int var5 = this.field9377[var4] * var3 + this.field9286[var4] * var2 >> 15;
            this.field9286[var4] = this.field9286[var4] * var3 - (this.field9377[var4] * var2) >> 15;
            this.field9377[var4] = var5;
        }
        this.method3713((byte) -90);
        this.field9314 = false;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V", line = 2815)
    public final void method3705(byte arg0) {
        if (arg0 <= 69) {
            return;
        }
        field9300++;
        if (this.field9370 != null) {
            this.field9370.method281(4);
        }
        if (this.field9298 != null) {
            this.field9298.method281(4);
        }
        if (this.field9311 != null) {
            this.field9311.method281(4);
        }
        if (this.field9367 != null) {
            this.field9367.method281(4);
        }
        if (this.field9348 != null) {
            this.field9348.method2629((byte) -2);
        }
    }

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "(I)V", line = 2861)
    public final void method72(int arg0) {
        field9382++;
        if (this.field9370 != null) {
            this.field9370.field431 = class383.method2215(arg0, 64, this.field9346);
        }
        if (this.field9298 != null) {
            this.field9298.field431 = class13.method101(this.field9346, (byte) 107, arg0);
        }
        if (this.field9311 != null) {
            this.field9311.field431 = class337.method1896(this.field9346, (byte) -115, arg0);
        }
        if (this.field9367 != null) {
            this.field9367.field431 = class402.method2299(this.field9346, 8192, arg0);
        }
        this.field9347 = arg0;
        this.field9279 = true;
        if (this.field9366 != null && (this.field9347 & 0x10000) == 0) {
            this.field9278 = this.field9366.field7385;
            this.field9336 = this.field9366.field7381;
            this.field9361 = this.field9366.field7386;
            this.field9273 = this.field9366.field7387;
            this.field9366 = null;
        }
        this.method3699(18578);
    }

    @OriginalMember(owner = "client!rw", name = "Q", descriptor = "()I", line = 2900)
    public final int method96() {
        field9335++;
        if (!this.field9314) {
            this.method3710(-32768);
        }
        return this.field9283;
    }

    @OriginalMember(owner = "client!rw", name = "ca", descriptor = "(III)V", line = 2921)
    public final void method98(int arg0, int arg1, int arg2) {
        field9294++;
        for (int var4 = 0; var4 < this.field9383; var4++) {
            if (arg0 != 0) {
                this.field9377[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field9306[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field9286[var4] += arg2;
            }
        }
        this.method3713((byte) -110);
        this.field9314 = false;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lm;Lcf;II)V", line = 2957)
    public final void method63(class163 arg0, class517 arg1, int arg2, int arg3) {
        field9358++;
        if (this.field9282 == 0) {
            return;
        }
        class335 var5 = this.field9379.field5692;
        if (!this.field9314) {
            this.method3710(-32768);
        }
        class335 var6 = (class335) arg0;
        class510.field7222 = var5.field4344 * var6.field4337 + var5.field4364 * var6.field4354 + var5.field4345 * var6.field4339 + var5.field4337;
        class621.field8962 = var5.field4344 * var6.field4345 + var5.field4364 * var6.field4361 + var5.field4345 * var6.field4366;
        float var7 = (float) this.field9310 * class621.field8962 + class510.field7222;
        float var8 = (float) this.field9318 * class621.field8962 + class510.field7222;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = (float) this.field9290 + var7;
            var9 = var8 - (float) this.field9290;
        } else {
            var9 = var7 - (float) this.field9290;
            var10 = (float) this.field9290 + var8;
        }
        if ((this.field9379.field5719 <= var9) || ((float) this.field9379.field5782 >= var10)) {
            return;
        }
        class133.field1639 = var5.field4343 * var6.field4345 + var5.field4377 * var6.field4361 + var5.field4361 * var6.field4366;
        class152.field1828 = var5.field4343 * var6.field4337 + var5.field4377 * var6.field4354 + var5.field4361 * var6.field4339 + var5.field4354;
        float var11 = (float) this.field9310 * class133.field1639 + class152.field1828;
        float var12 = (float) this.field9318 * class133.field1639 + class152.field1828;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = (var12 - (float) this.field9290) * (float) this.field9379.field5795;
            var14 = ((float) this.field9290 + var11) * (float) this.field9379.field5795;
        } else {
            var14 = ((float) this.field9290 + var12) * (float) this.field9379.field5795;
            var13 = (var11 - (float) this.field9290) * (float) this.field9379.field5795;
        }
        if ((var13 / (float) arg2 >= this.field9379.field5748) || (var14 / (float) arg2 <= this.field9379.field5797)) {
            return;
        }
        class434.field5885 = var5.field4371 * var6.field4337 + var5.field4368 * var6.field4354 + var5.field4366 * var6.field4339 + var5.field4339;
        class536.field7521 = var5.field4371 * var6.field4345 + var5.field4368 * var6.field4361 + var5.field4366 * var6.field4366;
        float var15 = (float) this.field9310 * class536.field7521 + class434.field5885;
        float var16 = (float) this.field9318 * class536.field7521 + class434.field5885;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = (var16 - (float) this.field9290) * (float) this.field9379.field5724;
            var18 = ((float) this.field9290 + var15) * (float) this.field9379.field5724;
        } else {
            var18 = ((float) this.field9290 + var16) * (float) this.field9379.field5724;
            var17 = ((float) (-this.field9290) + var15) * (float) this.field9379.field5724;
        }
        if ((this.field9379.field5704 <= var17 / (float) arg2) || (this.field9379.field5710 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field9277 != null) {
            class614.field8890 = var5.field4344 * var6.field4344 + var5.field4364 * var6.field4343 + var5.field4345 * var6.field4371;
            class592.field8603 = var5.field4371 * var6.field4344 + var5.field4368 * var6.field4343 + var5.field4366 * var6.field4371;
            class319.field4070 = var5.field4371 * var6.field4364 + var5.field4368 * var6.field4377 + var5.field4366 * var6.field4368;
            class396.field5229 = var5.field4343 * var6.field4364 + var5.field4377 * var6.field4377 + var5.field4361 * var6.field4368;
            class540.field7899 = var5.field4343 * var6.field4344 + var5.field4377 * var6.field4343 + var5.field4361 * var6.field4371;
            class504.field6992 = var5.field4344 * var6.field4364 + var5.field4364 * var6.field4377 + var5.field4345 * var6.field4368;
        }
        if (arg1 != null) {
            int var19 = this.field9352 + this.field9276 >> 1;
            int var20 = this.field9364 + this.field9283 >> 1;
            int var21 = (int) ((float) var20 * class540.field7899 + (float) this.field9310 * class133.field1639 + (float) var19 * class396.field5229 + class152.field1828);
            int var22 = (int) ((float) var20 * class592.field8603 + (float) this.field9310 * class536.field7521 + (float) var19 * class319.field4070 + class434.field5885);
            int var23 = (int) ((float) var20 * class614.field8890 + (float) this.field9310 * class621.field8962 + (float) var19 * class504.field6992 + class510.field7222);
            int var24 = (int) ((float) var20 * class540.field7899 + (float) this.field9318 * class133.field1639 + (float) var19 * class396.field5229 + class152.field1828);
            int var25 = (int) ((float) var20 * class592.field8603 + (float) this.field9318 * class536.field7521 + (float) var19 * class319.field4070 + class434.field5885);
            arg1.field7291 = this.field9379.field5781 + (this.field9379.field5724 * var25 / arg2);
            arg1.field7290 = this.field9379.field5795 * var21 / arg2 + this.field9379.field5735;
            int var26 = (int) ((float) var20 * class614.field8890 + (float) this.field9318 * class621.field8962 + (float) var19 * class504.field6992 + class510.field7222);
            arg1.field7292 = this.field9379.field5781 + (this.field9379.field5724 * var22 / arg2);
            arg1.field7294 = this.field9379.field5735 + (this.field9379.field5795 * var24 / arg2);
            if (var23 < this.field9379.field5782 && var26 < this.field9379.field5782) {
                arg1.field7289 = true;
                arg1.field7293 = (this.field9290 + var21) * this.field9379.field5795 / arg2 + this.field9379.field5735 - arg1.field7290;
            }
        }
        this.field9379.method2474((byte) 116, (float) arg2);
        this.field9379.method2436(-81);
        this.field9379.method2453(15, var6);
        this.method3709((byte) 72);
        this.method3700(-35);
    }

    @OriginalMember(owner = "client!rw", name = "ga", descriptor = "()I", line = 3104)
    public final int method83() {
        field9326++;
        return this.field9271;
    }

    @OriginalMember(owner = "client!rw", name = "U", descriptor = "()I", line = 3114)
    public final int method71() {
        field9319++;
        if (!this.field9314) {
            this.method3710(-32768);
        }
        return this.field9364;
    }

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "(IIII)V", line = 3125)
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
        field9378++;
        if (arg0 == 0) {
            int var5 = 0;
            class406.field5332 = 0;
            class64.field634 = 0;
            class535.field7511 = 0;
            for (int var6 = 0; var6 < this.field9383; var6++) {
                class535.field7511 += this.field9377[var6];
                class64.field634 += this.field9306[var6];
                var5++;
                class406.field5332 += this.field9286[var6];
            }
            if (var5 <= 0) {
                class406.field5332 = arg3;
                class535.field7511 = arg1;
                class64.field634 = arg2;
            } else {
                class406.field5332 = class406.field5332 / var5 + arg3;
                class535.field7511 = class535.field7511 / var5 + arg1;
                class64.field634 = class64.field634 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field9383; var7++) {
                this.field9377[var7] += arg1;
                this.field9306[var7] += arg2;
                this.field9286[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field9383; var8++) {
                this.field9377[var8] -= class535.field7511;
                this.field9306[var8] -= class64.field634;
                this.field9286[var8] -= class406.field5332;
                if (arg3 != 0) {
                    int var9 = class442.field6100[arg3];
                    int var10 = class442.field6101[arg3];
                    int var11 = this.field9377[var8] * var10 + (this.field9306[var8] * var9 + 32767) >> 15;
                    this.field9306[var8] = this.field9306[var8] * var10 + 32767 - this.field9377[var8] * var9 >> 15;
                    this.field9377[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class442.field6100[arg1];
                    int var13 = class442.field6101[arg1];
                    int var14 = this.field9306[var8] * var13 + 32767 - (this.field9286[var8] * var12) >> 15;
                    this.field9286[var8] = this.field9306[var8] * var12 + (this.field9286[var8] * var13) + 32767 >> 15;
                    this.field9306[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class442.field6100[arg2];
                    int var16 = class442.field6101[arg2];
                    int var17 = this.field9377[var8] * var16 + this.field9286[var8] * var15 + 32767 >> 15;
                    this.field9286[var8] = this.field9286[var8] * var16 + 32767 - this.field9377[var8] * var15 >> 15;
                    this.field9377[var8] = var17;
                }
                this.field9377[var8] += class535.field7511;
                this.field9306[var8] += class64.field634;
                this.field9286[var8] += class406.field5332;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field9383; var18++) {
                this.field9377[var18] -= class535.field7511;
                this.field9306[var18] -= class64.field634;
                this.field9286[var18] -= class406.field5332;
                this.field9377[var18] = this.field9377[var18] * arg1 / 128;
                this.field9306[var18] = this.field9306[var18] * arg2 / 128;
                this.field9286[var18] = this.field9286[var18] * arg3 / 128;
                this.field9377[var18] += class535.field7511;
                this.field9306[var18] += class64.field634;
                this.field9286[var18] += class406.field5332;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field9375; var19++) {
                int var23 = (this.field9369[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field9369[var19] = (byte) var23;
            }
            if (this.field9277 != null) {
                for (int var20 = 0; var20 < this.field9360; var20++) {
                    class257 var21 = this.field9277[var20];
                    class426 var22 = this.field9287[var20];
                    var22.field5482 = var22.field5482 & 0xFFFFFF | 255 - (this.field9369[var21.field3311] & 0xFF) << 24;
                }
            }
            this.method3716(16384);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field9375; var24++) {
                int var28 = this.field9351[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3F8) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = var28 & 0x7F;
                int var34 = arg3 + var33;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field9351[var24] = (short) class42.method223(class42.method223(var32 << 10, var31 << 7), var34);
            }
            if (this.field9277 != null) {
                for (int var25 = 0; var25 < this.field9360; var25++) {
                    class257 var26 = this.field9277[var25];
                    class426 var27 = this.field9287[var25];
                    var27.field5482 = var27.field5482 & 0xFF000000 | class103.field1259[this.field9351[var26.field3311] & 0xFFFF] & 0xFFFFFF;
                }
            }
            this.method3716(16384);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field9360; var35++) {
                class426 var36 = this.field9287[var35];
                var36.field5492 += arg2;
                var36.field5491 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field9360; var37++) {
                class426 var38 = this.field9287[var37];
                var38.field5487 = var38.field5487 * arg2 >> 7;
                var38.field5485 = var38.field5485 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field9360; var39++) {
                class426 var40 = this.field9287[var39];
                var40.field5489 = var40.field5489 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "L", descriptor = "(SS)V", line = 3430)
    public final void method93(short arg0, short arg1) {
        field9315++;
        class17 var3 = this.field9379.field2481;
        for (int var4 = 0; var4 < this.field9375; var4++) {
            if (this.field9339[var4] == arg0) {
                this.field9339[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class217 var7 = var3.method119(-114, arg0 & 0xFFFF);
            var5 = var7.field2656;
            var6 = var7.field2644;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class217 var10 = var3.method119(-123, arg1 & 0xFFFF);
            var8 = var10.field2656;
            var9 = var10.field2644;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field9277 != null) {
            for (int var11 = 0; var11 < this.field9360; var11++) {
                class257 var12 = this.field9277[var11];
                class426 var13 = this.field9287[var11];
                var13.field5482 = var13.field5482 & 0xFF000000 | class103.field1259[this.field9351[var12.field3311] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method3716(16384);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIZIII)Z", line = 3502)
    private final boolean method3706(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field9281++;
        if (!arg5) {
            this.field9363 = null;
        }
        if (arg2 > arg4 && arg7 > arg4 && arg3 > arg4) {
            return false;
        } else if (arg2 < arg4 && arg7 < arg4 && arg4 > arg3) {
            return false;
        } else if (arg6 < arg0 && arg8 > arg6 && arg1 > arg6) {
            return false;
        } else {
            return arg0 >= arg6 || arg6 <= arg8 || arg1 >= arg6;
        }
    }

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "(I)V", line = 3528)
    public final void method57(int arg0) {
        field9297++;
        int var2 = class442.field6100[arg0];
        int var3 = class442.field6101[arg0];
        for (int var4 = 0; var4 < this.field9383; var4++) {
            int var7 = this.field9377[var4] * var3 + this.field9286[var4] * var2 >> 15;
            this.field9286[var4] = this.field9286[var4] * var3 - this.field9377[var4] * var2 >> 15;
            this.field9377[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field9282; var5++) {
            int var6 = this.field9361[var5] * var2 + this.field9336[var5] * var3 >> 15;
            this.field9361[var5] = (short) (this.field9361[var5] * var3 - (this.field9336[var5] * var2) >> 15);
            this.field9336[var5] = (short) var6;
        }
        this.method3713((byte) 89);
        this.method3702(true);
        this.field9314 = false;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lbda;Lei;IIII)V", line = 3568)
    public class643(class428 arg0, class152 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class17 var7 = arg0.field2481;
        int[] var8 = new int[arg1.field1817];
        this.field9268 = new int[arg1.field1820 + 1];
        for (int var9 = 0; var9 < arg1.field1817; var9++) {
            if ((arg1.field1857 == null || arg1.field1857[var9] != 2) && (arg1.field1835 == null || arg1.field1835[var9] == -1 || !var7.method119(-105, arg1.field1835[var9] & 0xFFFF).field2652)) {
                var8[this.field9375++] = var9;
                this.field9268[arg1.field1821[var9]]++;
                this.field9268[arg1.field1847[var9]]++;
                this.field9268[arg1.field1831[var9]]++;
            }
        }
        this.field9267 = this.field9375;
        long[] var10 = new long[this.field9375];
        boolean var11 = (this.field9347 & 0x100) != 0;
        label500: for (int var12 = 0; var12 < this.field9375; var12++) {
            int var185 = var8[var12];
            class217 var186 = null;
            int var187 = 0;
            byte var188 = 0;
            byte var189 = 0;
            byte var190 = 0;
            if (arg1.field1851 != null) {
                for (int var191 = 0; var191 < arg1.field1851.length; var191++) {
                    class347 var192 = arg1.field1851[var191];
                    if (var192.field4472 == var185) {
                        class620 var193 = class337.method1898(1370, var192.field4473);
                        if (var193.field8953) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field9267--;
                            continue label500;
                        }
                    }
                }
            }
            short var194 = -1;
            if (arg1.field1835 != null) {
                var194 = arg1.field1835[var185];
                if (var194 != -1) {
                    var186 = var7.method119(-107, var194 & 0xFFFF);
                    var189 = var186.field2657;
                    var190 = var186.field2648;
                }
            }
            boolean var195 = arg1.field1816 != null && arg1.field1816[var185] != 0 || var186 != null && !var186.field2650;
            if ((var11 || var195) && arg1.field1856 != null) {
                var187 += arg1.field1856[var185] << 17;
            }
            if (var195) {
                var187 += 65536;
            }
            int var196 = (var189 & 0xFF << 8) + var187;
            int var197 = (var194 & 0xFFFF << 16) + var188;
            int var198 = (var190 & 0xFF) + var196;
            int var199 = (var12 & 0xFFFF) + var197;
            var10[var12] = ((long) var198 << 32) + (long) var199;
        }
        class315.method1746((byte) -75, var10, var8);
        this.field9304 = arg1.field1854;
        this.field9286 = arg1.field1830;
        this.field9377 = arg1.field1853;
        this.field9340 = arg1.field1845;
        this.field9306 = arg1.field1810;
        this.field9383 = arg1.field1820;
        this.field9291 = arg1.field1819;
        this.field9324 = arg1.field1840;
        class164[] var13 = new class164[this.field9383];
        if (arg1.field1851 != null) {
            this.field9360 = arg1.field1851.length;
            this.field9287 = new class426[this.field9360];
            this.field9277 = new class257[this.field9360];
            for (int var14 = 0; var14 < this.field9360; var14++) {
                class347 var15 = arg1.field1851[var14];
                class620 var16 = class337.method1898(1370, var15.field4473);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field9375; var18++) {
                    if (var8[var18] == var15.field4472) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class103.field1259[arg1.field1833[var15.field4472] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1816 == null ? 0 : arg1.field1816[var15.field4472]) << 24;
                this.field9277[var14] = new class257(var17, arg1.field1821[var15.field4472], arg1.field1847[var15.field4472], arg1.field1831[var15.field4472], var16.field8949, var16.field8950, var16.field8954, var16.field8955, var16.field8958, var16.field8953, var16.field8951, var15.field4470);
                this.field9287[var14] = new class426(var20);
            }
        }
        int var21 = this.field9375 * 3;
        this.field9351 = new short[this.field9375];
        this.field9339 = new short[this.field9375];
        class632.field9112 = new long[var21];
        this.field9305 = new short[var21];
        this.field9284 = (short) arg3;
        this.field9361 = new short[var21];
        this.field9288 = new short[var21];
        this.field9278 = new byte[var21];
        this.field9380 = new float[var21];
        this.field9336 = new short[var21];
        this.field9271 = (short) arg4;
        this.field9273 = new short[var21];
        this.field9296 = new short[this.field9375];
        this.field9308 = new short[var21];
        this.field9317 = new short[this.field9375];
        this.field9363 = new short[this.field9375];
        if (arg1.field1848 != null) {
            this.field9285 = new short[this.field9375];
        }
        this.field9320 = new float[var21];
        this.field9369 = new byte[this.field9375];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1820; var23++) {
            int var184 = this.field9268[var23];
            this.field9268[var23] = var22;
            var13[var23] = new class164();
            var22 += var184;
        }
        this.field9268[arg1.field1820] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field1849 != null) {
            int var28 = arg1.field1844;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var36 = 0; var36 < this.field9375; var36++) {
                int var43 = var8[var36];
                if (arg1.field1849[var43] != -1) {
                    int var44 = arg1.field1849[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field1821[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field1847[var43];
                        } else {
                            var46 = arg1.field1831[var43];
                        }
                        int var47 = arg1.field1853[var46];
                        int var48 = arg1.field1810[var46];
                        int var49 = arg1.field1830[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field1826[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field1818[var37];
                        var40 = 64.0F / (float) arg1.field1823[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 <= 0) {
                            var41 = 1.0F;
                            var42 = (float) (-var39) / 1024.0F;
                        } else {
                            var42 = 1.0F;
                            var41 = (float) var39 / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field1834[var37];
                        var40 = 64.0F / (float) arg1.field1823[var37];
                        var42 = 64.0F / (float) arg1.field1818[var37];
                    } else {
                        var42 = (float) arg1.field1818[var37] / 1024.0F;
                        var41 = (float) arg1.field1834[var37] / 1024.0F;
                        var40 = (float) arg1.field1823[var37] / 1024.0F;
                    }
                    var27[var37] = class137.method764((byte) -87, var40, var41, class288.method1624(255, arg1.field1813[var37]), arg1.field1829[var37], var42, arg1.field1864[var37], arg1.field1850[var37]);
                }
            }
        }
        class69[] var50 = new class69[arg1.field1817];
        for (int var51 = 0; var51 < arg1.field1817; var51++) {
            short var163 = arg1.field1821[var51];
            short var164 = arg1.field1847[var51];
            short var165 = arg1.field1831[var51];
            int var166 = this.field9377[var164] - this.field9377[var163];
            int var167 = this.field9306[var164] - this.field9306[var163];
            int var168 = this.field9286[var164] - this.field9286[var163];
            int var169 = this.field9377[var165] - this.field9377[var163];
            int var170 = this.field9306[var165] - this.field9306[var163];
            int var171 = this.field9286[var165] - this.field9286[var163];
            int var172 = var167 * var171 - (var168 * var170);
            int var173 = var168 * var169 - (var166 * var171);
            int var174 = var166 * var170 - (var167 * var169);
            while (var172 > 8192 || var173 > 8192 || var174 > 8192 || var172 < -8192 || var173 < -8192 || var174 < -8192) {
                var173 >>= 0x1;
                var174 >>= 0x1;
                var172 >>= 0x1;
            }
            int var175 = (int) Math.sqrt((double) (var174 * var174 + (var172 * var172 + (var173 * var173))));
            if (var175 <= 0) {
                var175 = 1;
            }
            int var176 = var172 * 256 / var175;
            int var177 = var173 * 256 / var175;
            int var178 = var174 * 256 / var175;
            byte var179 = arg1.field1857 == null ? 0 : arg1.field1857[var51];
            if (var179 == 0) {
                class164 var180 = var13[var163];
                var180.field2004++;
                var180.field2002 += var178;
                var180.field1999 += var176;
                var180.field2005 += var177;
                class164 var181 = var13[var164];
                var181.field2005 += var177;
                var181.field2002 += var178;
                var181.field2004++;
                var181.field1999 += var176;
                class164 var182 = var13[var165];
                var182.field2002 += var178;
                var182.field2005 += var177;
                var182.field1999 += var176;
                var182.field2004++;
            } else if (var179 == 1) {
                class69 var183 = var50[var51] = new class69();
                var183.field664 = var176;
                var183.field662 = var178;
                var183.field663 = var177;
            }
        }
        for (int var52 = 0; var52 < this.field9375; var52++) {
            int var73 = var8[var52];
            int var74 = arg1.field1833[var73] & 0xFFFF;
            short var75;
            if (arg1.field1835 == null) {
                var75 = -1;
            } else {
                var75 = arg1.field1835[var73];
            }
            int var76;
            if (arg1.field1849 == null) {
                var76 = -1;
            } else {
                var76 = arg1.field1849[var73];
            }
            int var77;
            if (arg1.field1816 == null) {
                var77 = 0;
            } else {
                var77 = arg1.field1816[var73] & 0xFF;
            }
            float var78 = 0.0F;
            float var79 = 0.0F;
            float var80 = 0.0F;
            float var81 = 0.0F;
            float var82 = 0.0F;
            float var83 = 0.0F;
            byte var84 = 0;
            byte var85 = 0;
            int var86 = 0;
            if (var75 != -1) {
                if (var76 == -1) {
                    var83 = 0.0F;
                    var79 = 1.0F;
                    var84 = 1;
                    var82 = 0.0F;
                    var85 = 2;
                    var81 = 1.0F;
                    var78 = 0.0F;
                    var80 = 1.0F;
                } else {
                    var76 &= 0xFF;
                    byte var87 = arg1.field1826[var76];
                    if (var87 == 0) {
                        short var88 = arg1.field1821[var73];
                        short var89 = arg1.field1847[var73];
                        short var90 = arg1.field1831[var73];
                        short var91 = arg1.field1864[var76];
                        short var92 = arg1.field1829[var76];
                        short var93 = arg1.field1850[var76];
                        float var94 = (float) arg1.field1853[var91];
                        float var95 = (float) arg1.field1810[var91];
                        float var96 = (float) arg1.field1830[var91];
                        float var97 = (float) arg1.field1853[var92] - var94;
                        float var98 = (float) arg1.field1810[var92] - var95;
                        float var99 = (float) arg1.field1830[var92] - var96;
                        float var100 = (float) arg1.field1853[var93] - var94;
                        float var101 = (float) arg1.field1810[var93] - var95;
                        float var102 = (float) arg1.field1830[var93] - var96;
                        float var103 = (float) arg1.field1853[var88] - var94;
                        float var104 = (float) arg1.field1810[var88] - var95;
                        float var105 = (float) arg1.field1830[var88] - var96;
                        float var106 = (float) arg1.field1853[var89] - var94;
                        float var107 = (float) arg1.field1810[var89] - var95;
                        float var108 = (float) arg1.field1830[var89] - var96;
                        float var109 = (float) arg1.field1853[var90] - var94;
                        float var110 = (float) arg1.field1810[var90] - var95;
                        float var111 = (float) arg1.field1830[var90] - var96;
                        float var112 = var98 * var102 - var99 * var101;
                        float var113 = var99 * var100 - (var97 * var102);
                        float var114 = var97 * var101 - (var98 * var100);
                        float var115 = var101 * var114 - var102 * var113;
                        float var116 = var102 * var112 - var100 * var114;
                        float var117 = var100 * var113 - var101 * var112;
                        float var118 = 1.0F / (var99 * var117 + var97 * var115 + var98 * var116);
                        var80 = (var108 * var117 + var106 * var115 + var107 * var116) * var118;
                        var78 = (var105 * var117 + var103 * var115 + var104 * var116) * var118;
                        var82 = (var111 * var117 + var109 * var115 + var110 * var116) * var118;
                        float var119 = var99 * var112 - (var97 * var114);
                        float var120 = var98 * var114 - var99 * var113;
                        float var121 = var97 * var113 - (var98 * var112);
                        float var122 = 1.0F / (var102 * var121 + var100 * var120 + var101 * var119);
                        var81 = (var108 * var121 + var106 * var120 + var107 * var119) * var122;
                        var79 = (var105 * var121 + var103 * var120 + var104 * var119) * var122;
                        var83 = (var111 * var121 + var109 * var120 + var110 * var119) * var122;
                    } else {
                        short var123 = arg1.field1821[var73];
                        short var124 = arg1.field1847[var73];
                        short var125 = arg1.field1831[var73];
                        int var126 = var24[var76];
                        int var127 = var25[var76];
                        int var128 = var26[var76];
                        float[] var129 = var27[var76];
                        byte var130 = arg1.field1863[var76];
                        float var131 = (float) arg1.field1825[var76] / 256.0F;
                        if (var87 == 1) {
                            float var149 = (float) arg1.field1834[var76] / 1024.0F;
                            class433.method2504(var126, var130, var129, var131, var128, arg1.field1810[var123], var149, arg1.field1830[var123], (byte) -109, arg1.field1853[var123], var127);
                            var78 = class359.field4727;
                            var79 = class137.field1676;
                            class433.method2504(var126, var130, var129, var131, var128, arg1.field1810[var124], var149, arg1.field1830[var124], (byte) -109, arg1.field1853[var124], var127);
                            var81 = class137.field1676;
                            var80 = class359.field4727;
                            class433.method2504(var126, var130, var129, var131, var128, arg1.field1810[var125], var149, arg1.field1830[var125], (byte) -109, arg1.field1853[var125], var127);
                            var82 = class359.field4727;
                            var83 = class137.field1676;
                            float var150 = var149 / 2.0F;
                            if ((var130 & 0x1) == 0) {
                                if ((var82 - var78 > var150)) {
                                    var82 -= var149;
                                    var85 = 1;
                                } else if (var78 - var82 > var150) {
                                    var82 += var149;
                                    var85 = 2;
                                }
                                if ((var150 < var80 - var78)) {
                                    var80 -= var149;
                                    var84 = 1;
                                } else if (var150 < var78 - var80) {
                                    var80 += var149;
                                    var84 = 2;
                                }
                            } else {
                                if (var83 - var79 > var150) {
                                    var83 -= var149;
                                    var85 = 1;
                                } else if (var150 < var79 - var83) {
                                    var83 += var149;
                                    var85 = 2;
                                }
                                if (var81 - var79 > var150) {
                                    var84 = 1;
                                    var81 -= var149;
                                } else if (var150 < var79 - var81) {
                                    var81 += var149;
                                    var84 = 2;
                                }
                            }
                        } else if (var87 == 2) {
                            float var132 = (float) arg1.field1860[var76] / 256.0F;
                            float var133 = (float) arg1.field1822[var76] / 256.0F;
                            int var134 = arg1.field1853[var124] - arg1.field1853[var123];
                            int var135 = arg1.field1810[var124] - arg1.field1810[var123];
                            int var136 = arg1.field1830[var124] - arg1.field1830[var123];
                            int var137 = arg1.field1853[var125] - arg1.field1853[var123];
                            int var138 = arg1.field1810[var125] - arg1.field1810[var123];
                            int var139 = arg1.field1830[var125] - arg1.field1830[var123];
                            int var140 = var135 * var139 - var136 * var138;
                            int var141 = var136 * var137 - (var134 * var139);
                            int var142 = var134 * var138 - (var135 * var137);
                            float var143 = 64.0F / (float) arg1.field1818[var76];
                            float var144 = 64.0F / (float) arg1.field1823[var76];
                            float var145 = 64.0F / (float) arg1.field1834[var76];
                            float var146 = (var129[2] * (float) var142 + var129[1] * (float) var141 + var129[0] * (float) var140) / var143;
                            float var147 = (var129[5] * (float) var142 + var129[4] * (float) var141 + var129[3] * (float) var140) / var144;
                            float var148 = (var129[8] * (float) var142 + var129[7] * (float) var141 + var129[6] * (float) var140) / var145;
                            var86 = class348.method1944(var146, var147, 0, var148);
                            class403.method2300(arg1.field1810[var123], var126, var131, arg1.field1853[var123], var133, var130, (byte) -111, var127, var129, var132, var86, arg1.field1830[var123], var128);
                            var78 = class244.field3142;
                            var79 = class160.field1939;
                            class403.method2300(arg1.field1810[var124], var126, var131, arg1.field1853[var124], var133, var130, (byte) -111, var127, var129, var132, var86, arg1.field1830[var124], var128);
                            var81 = class160.field1939;
                            var80 = class244.field3142;
                            class403.method2300(arg1.field1810[var125], var126, var131, arg1.field1853[var125], var133, var130, (byte) -111, var127, var129, var132, var86, arg1.field1830[var125], var128);
                            var82 = class244.field3142;
                            var83 = class160.field1939;
                        } else if (var87 == 3) {
                            class611.method3516(arg1.field1830[var123], var129, var131, var127, arg1.field1810[var123], var130, arg1.field1853[var123], var126, var128, -108);
                            var79 = class459.field6324;
                            var78 = class362.field4768;
                            class611.method3516(arg1.field1830[var124], var129, var131, var127, arg1.field1810[var124], var130, arg1.field1853[var124], var126, var128, 116);
                            var80 = class362.field4768;
                            var81 = class459.field6324;
                            class611.method3516(arg1.field1830[var125], var129, var131, var127, arg1.field1810[var125], var130, arg1.field1853[var125], var126, var128, -33);
                            var82 = class362.field4768;
                            var83 = class459.field6324;
                            if ((var130 & 0x1) == 0) {
                                if ((var80 - var78 > 0.5F)) {
                                    var80--;
                                    var84 = 1;
                                } else if (var78 - var80 > 0.5F) {
                                    var80++;
                                    var84 = 2;
                                }
                                if ((var82 - var78 > 0.5F)) {
                                    var85 = 1;
                                    var82--;
                                } else if (var78 - var82 > 0.5F) {
                                    var82++;
                                    var85 = 2;
                                }
                            } else {
                                if (var81 - var79 > 0.5F) {
                                    var84 = 1;
                                    var81--;
                                } else if (var79 - var81 > 0.5F) {
                                    var84 = 2;
                                    var81++;
                                }
                                if (var83 - var79 > 0.5F) {
                                    var83--;
                                    var85 = 1;
                                } else if (var79 - var83 > 0.5F) {
                                    var85 = 2;
                                    var83++;
                                }
                            }
                        }
                    }
                }
            }
            byte var151;
            if (arg1.field1857 == null) {
                var151 = 0;
            } else {
                var151 = arg1.field1857[var73];
            }
            if (var151 == 0) {
                long var155 = ((long) (var86 << 24) + ((long) (var74 << 8)) + (long) var77 << 32) + (long) (var76 << 2);
                short var157 = arg1.field1821[var73];
                short var158 = arg1.field1847[var73];
                short var159 = arg1.field1831[var73];
                class164 var160 = var13[var157];
                this.field9317[var52] = this.method3714(var160.field2005, var155, var160.field1999, var78, var52, var160.field2004, var79, arg1, var157, var160.field2002, (byte) -117);
                class164 var161 = var13[var158];
                this.field9363[var52] = this.method3714(var161.field2005, (long) var84 + var155, var161.field1999, var80, var52, var161.field2004, var81, arg1, var158, var161.field2002, (byte) -118);
                class164 var162 = var13[var159];
                this.field9296[var52] = this.method3714(var162.field2005, (long) var85 + var155, var162.field1999, var82, var52, var162.field2004, var83, arg1, var159, var162.field2002, (byte) 49);
            } else if (var151 == 1) {
                class69 var152 = var50[var73];
                long var153 = ((long) (var74 << 8) + (long) var77 + (long) (var86 << 24) << 32) + (long) ((var152.field663 + 256 << 12) + (var76 << 2) + (var152.field664 > 0 ? 1024 : 2048) + (var152.field662 + 256 << 22));
                this.field9317[var52] = this.method3714(var152.field663, var153, var152.field664, var78, var52, 0, var79, arg1, arg1.field1821[var73], var152.field662, (byte) 22);
                this.field9363[var52] = this.method3714(var152.field663, (long) var84 + var153, var152.field664, var80, var52, 0, var81, arg1, arg1.field1847[var73], var152.field662, (byte) -127);
                this.field9296[var52] = this.method3714(var152.field663, (long) var85 + var153, var152.field664, var82, var52, 0, var83, arg1, arg1.field1831[var73], var152.field662, (byte) 118);
            }
            if (arg1.field1835 == null) {
                this.field9339[var52] = -1;
            } else {
                this.field9339[var52] = arg1.field1835[var73];
            }
            if (arg1.field1816 != null) {
                this.field9369[var52] = arg1.field1816[var73];
            }
            if (arg1.field1848 != null) {
                this.field9285[var52] = arg1.field1848[var73];
            }
            this.field9351[var52] = arg1.field1833[var73];
        }
        if (this.field9267 > 0) {
            int var53 = 1;
            short var54 = this.field9339[0];
            for (int var55 = 0; var55 < this.field9267; var55++) {
                short var65 = this.field9339[var55];
                if (var54 != var65) {
                    var54 = var65;
                    var53++;
                }
            }
            this.field9345 = new int[var53];
            this.field9333 = new int[var53];
            this.field9349 = new int[var53 + 1];
            this.field9349[0] = 0;
            int var56 = this.field9282;
            int var57 = 0;
            short var58 = 0;
            short var59 = this.field9339[0];
            for (int var60 = 0; var60 < this.field9267; var60++) {
                short var61 = this.field9339[var60];
                if (var59 != var61) {
                    this.field9345[var57] = var56;
                    this.field9333[var57] = var58 + 1 - var56;
                    var57++;
                    this.field9349[var57] = var60;
                    var59 = var61;
                    var56 = this.field9282;
                    var58 = 0;
                }
                short var62 = this.field9317[var60];
                if (var62 > var58) {
                    var58 = var62;
                }
                if (var62 < var56) {
                    var56 = var62;
                }
                short var63 = this.field9363[var60];
                if (var63 < var56) {
                    var56 = var63;
                }
                if (var58 < var63) {
                    var58 = var63;
                }
                short var64 = this.field9296[var60];
                if (var64 > var58) {
                    var58 = var64;
                }
                if (var64 < var56) {
                    var56 = var64;
                }
            }
            this.field9345[var57] = var56;
            this.field9333[var57] = var58 + 1 - var56;
            var57++;
            this.field9349[var57] = this.field9267;
        }
        class632.field9112 = null;
        this.field9308 = class412.method2354(-8131, this.field9308, this.field9282);
        this.field9288 = class412.method2354(-8131, this.field9288, this.field9282);
        this.field9336 = class412.method2354(-8131, this.field9336, this.field9282);
        this.field9273 = class412.method2354(-8131, this.field9273, this.field9282);
        this.field9361 = class412.method2354(-8131, this.field9361, this.field9282);
        this.field9278 = class556.method3255(this.field9278, false, this.field9282);
        this.field9380 = class511.method2939((byte) -9, this.field9380, this.field9282);
        this.field9320 = class511.method2939((byte) -9, this.field9320, this.field9282);
        if (arg1.field1837 != null && class543.method3174(this.field9346, arg2, (byte) -46)) {
            this.field9350 = arg1.method829((byte) -126, false);
        }
        if (arg1.field1851 != null && class113.method668(-106, this.field9346, arg2)) {
            this.field9331 = arg1.method836(11);
        }
        if (arg1.field1852 != null && class307.method1701(arg2, false, this.field9346)) {
            int var66 = 0;
            int[] var67 = new int[256];
            for (int var68 = 0; var68 < this.field9375; var68++) {
                int var72 = arg1.field1852[var8[var68]];
                if (var72 >= 0) {
                    int var10002 = var67[var72]++;
                    if (var66 < var72) {
                        var66 = var72;
                    }
                }
            }
            this.field9342 = new int[var66 + 1][];
            for (int var69 = 0; var69 <= var66; var69++) {
                this.field9342[var69] = new int[var67[var69]];
                var67[var69] = 0;
            }
            for (int var70 = 0; var70 < this.field9375; var70++) {
                int var71 = arg1.field1852[var8[var70]];
                if (var71 >= 0) {
                    this.field9342[var71][var67[var71]++] = var70;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IILm;Z)Z", line = 4599)
    public final boolean method91(int arg0, int arg1, class163 arg2, boolean arg3) {
        field9303++;
        class335 var5 = (class335) arg2;
        class335 var6 = this.field9379.field5692;
        float var7 = var5.field4337 * var6.field4343 + var5.field4354 * var6.field4377 + var5.field4339 * var6.field4361 + var6.field4354;
        float var8 = var5.field4337 * var6.field4371 + var5.field4354 * var6.field4368 + var5.field4339 * var6.field4366 + var6.field4339;
        class319.field4070 = var5.field4364 * var6.field4371 + var5.field4377 * var6.field4368 + var5.field4368 * var6.field4366;
        float var9 = var5.field4337 * var6.field4344 + var5.field4354 * var6.field4364 + var5.field4339 * var6.field4345 + var6.field4337;
        class133.field1639 = var5.field4345 * var6.field4343 + var5.field4366 * var6.field4361 + var5.field4361 * var6.field4377;
        class504.field6992 = var5.field4364 * var6.field4344 + var5.field4377 * var6.field4364 + var5.field4368 * var6.field4345;
        class621.field8962 = var5.field4345 * var6.field4344 + var5.field4366 * var6.field4345 + var5.field4361 * var6.field4364;
        class396.field5229 = var5.field4364 * var6.field4343 + var5.field4377 * var6.field4377 + var5.field4368 * var6.field4361;
        class592.field8603 = var5.field4344 * var6.field4371 + var5.field4371 * var6.field4366 + var5.field4343 * var6.field4368;
        class536.field7521 = var5.field4345 * var6.field4371 + var5.field4366 * var6.field4366 + var5.field4361 * var6.field4368;
        class540.field7899 = var5.field4344 * var6.field4343 + var5.field4371 * var6.field4361 + var5.field4343 * var6.field4377;
        class614.field8890 = var5.field4344 * var6.field4344 + var5.field4371 * var6.field4345 + var5.field4343 * var6.field4364;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field9379.field5795;
        int var16 = this.field9379.field5724;
        if (!this.field9314) {
            this.method3710(-32768);
        }
        class456.field6285[0] = this.field9352;
        class116.field1458[0] = this.field9310;
        class456.field6285[1] = this.field9276;
        class530.field7447[0] = this.field9283;
        class116.field1458[1] = this.field9310;
        class530.field7447[1] = this.field9283;
        class456.field6285[2] = this.field9352;
        class116.field1458[2] = this.field9318;
        class530.field7447[2] = this.field9283;
        class456.field6285[3] = this.field9276;
        class116.field1458[3] = this.field9318;
        class456.field6285[4] = this.field9352;
        class530.field7447[3] = this.field9283;
        class116.field1458[4] = this.field9310;
        class456.field6285[5] = this.field9276;
        class530.field7447[4] = this.field9364;
        class116.field1458[5] = this.field9310;
        class530.field7447[5] = this.field9364;
        class456.field6285[6] = this.field9352;
        class116.field1458[6] = this.field9318;
        class456.field6285[7] = this.field9276;
        class530.field7447[6] = this.field9364;
        class116.field1458[7] = this.field9318;
        class530.field7447[7] = this.field9364;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class456.field6285[var17];
            float var37 = (float) class530.field7447[var17];
            float var38 = (float) class116.field1458[var17];
            float var39 = class592.field8603 * var37 + class536.field7521 * var38 + class319.field4070 * var36 + var8;
            float var40 = class614.field8890 * var37 + class621.field8962 * var38 + class504.field6992 * var36 + var9;
            float var41 = class540.field7899 * var37 + class396.field5229 * var36 + class133.field1639 * var38 + var7;
            if ((float) this.field9379.field5782 <= var40) {
                float var42 = (float) var15 * var41 / var40 + (float) this.field9379.field5735;
                if (var12 < var42) {
                    var12 = var42;
                }
                if (var42 < var11) {
                    var11 = var42;
                }
                float var43 = (float) var16 * var39 / var40 + (float) this.field9379.field5781;
                if (var43 > var14) {
                    var14 = var43;
                }
                if (var13 > var43) {
                    var13 = var43;
                }
                var10 = true;
            }
        }
        if (var10 && var11 < (float) arg0 && var12 > (float) arg0 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field9282 > class103.field1261.length) {
                class103.field1261 = new int[this.field9282];
                class170.field2077 = new int[this.field9282];
            }
            for (int var18 = 0; var18 < this.field9383; var18++) {
                float var20 = (float) this.field9306[var18];
                float var21 = (float) this.field9377[var18];
                float var22 = (float) this.field9286[var18];
                float var23 = class614.field8890 * var22 + class621.field8962 * var20 + class504.field6992 * var21 + var9;
                float var24 = class592.field8603 * var22 + class536.field7521 * var20 + class319.field4070 * var21 + var8;
                float var25 = class540.field7899 * var22 + class396.field5229 * var21 + class133.field1639 * var20 + var7;
                if ((float) this.field9379.field5782 <= var23) {
                    int var26 = (int) ((float) var15 * var25 / var23 + (float) this.field9379.field5735);
                    int var27 = (int) ((float) var16 * var24 / var23 + (float) this.field9379.field5781);
                    int var28 = this.field9268[var18];
                    int var29 = this.field9268[var18 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field9305[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class103.field1261[var31] = var26;
                        class170.field2077[var31] = var27;
                    }
                } else {
                    int var32 = this.field9268[var18];
                    int var33 = this.field9268[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field9305[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class103.field1261[this.field9305[var34] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field9375; var19++) {
                if (class103.field1261[this.field9317[var19]] != -999999 && class103.field1261[this.field9363[var19]] != -999999 && class103.field1261[this.field9296[var19]] != -999999 && this.method3706(class103.field1261[this.field9317[var19]], class103.field1261[this.field9296[var19]], class170.field2077[this.field9317[var19]], class170.field2077[this.field9296[var19]], arg1, true, arg0, class170.field2077[this.field9363[var19]], class103.field1261[this.field9363[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lm;Lcf;I)V", line = 4805)
    public final void method69(class163 arg0, class517 arg1, int arg2) {
        field9371++;
        if (this.field9282 == 0) {
            return;
        }
        class335 var4 = this.field9379.field5692;
        class335 var5 = (class335) arg0;
        if (!this.field9314) {
            this.method3710(-32768);
        }
        this.method3712(var5, (byte) -121);
        class510.field7222 = var4.field4344 * var5.field4337 + var4.field4364 * var5.field4354 + var4.field4345 * var5.field4339 + var4.field4337;
        class621.field8962 = var4.field4344 * var5.field4345 + var4.field4364 * var5.field4361 + var4.field4345 * var5.field4366;
        float var6 = (float) this.field9310 * class621.field8962 + class510.field7222;
        float var7 = (float) this.field9318 * class621.field8962 + class510.field7222;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field9290 + var6;
            var9 = (float) (-this.field9290) + var7;
        } else {
            var9 = (float) (-this.field9290) + var6;
            var8 = (float) this.field9290 + var7;
        }
        if ((this.field9379.field5792 <= var9) || ((float) this.field9379.field5782 >= var8)) {
            return;
        }
        class152.field1828 = var4.field4343 * var5.field4337 + var4.field4377 * var5.field4354 + var4.field4361 * var5.field4339 + var4.field4354;
        class133.field1639 = var4.field4343 * var5.field4345 + var4.field4377 * var5.field4361 + var4.field4361 * var5.field4366;
        float var10 = (float) this.field9310 * class133.field1639 + class152.field1828;
        float var11 = (float) this.field9318 * class133.field1639 + class152.field1828;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var13 = ((float) this.field9290 + var10) * (float) this.field9379.field5795;
            var12 = ((float) (-this.field9290) + var11) * (float) this.field9379.field5795;
        } else {
            var12 = (var10 - (float) this.field9290) * (float) this.field9379.field5795;
            var13 = ((float) this.field9290 + var11) * (float) this.field9379.field5795;
        }
        if ((var12 / var8 >= this.field9379.field5748) || (this.field9379.field5797 >= var13 / var8)) {
            return;
        }
        class434.field5885 = var4.field4371 * var5.field4337 + var4.field4368 * var5.field4354 + var4.field4366 * var5.field4339 + var4.field4339;
        class536.field7521 = var4.field4371 * var5.field4345 + var4.field4368 * var5.field4361 + var4.field4366 * var5.field4366;
        float var14 = (float) this.field9310 * class536.field7521 + class434.field5885;
        float var15 = (float) this.field9318 * class536.field7521 + class434.field5885;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field9290 + var14) * (float) this.field9379.field5724;
            var17 = (var15 - (float) this.field9290) * (float) this.field9379.field5724;
        } else {
            var16 = ((float) this.field9290 + var15) * (float) this.field9379.field5724;
            var17 = (var14 - (float) this.field9290) * (float) this.field9379.field5724;
        }
        if ((var17 / var8 >= this.field9379.field5704) || (this.field9379.field5710 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field9277 != null) {
            class540.field7899 = var4.field4343 * var5.field4344 + var4.field4377 * var5.field4343 + var4.field4361 * var5.field4371;
            class319.field4070 = var4.field4371 * var5.field4364 + var4.field4368 * var5.field4377 + var4.field4366 * var5.field4368;
            class396.field5229 = var4.field4343 * var5.field4364 + var4.field4377 * var5.field4377 + var4.field4361 * var5.field4368;
            class614.field8890 = var4.field4344 * var5.field4344 + var4.field4364 * var5.field4343 + var4.field4345 * var5.field4371;
            class592.field8603 = var4.field4371 * var5.field4344 + var4.field4368 * var5.field4343 + var4.field4366 * var5.field4371;
            class504.field6992 = var4.field4344 * var5.field4364 + var4.field4364 * var5.field4377 + var4.field4345 * var5.field4368;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field9352 + this.field9276 >> 1;
            int var21 = this.field9364 + this.field9283 >> 1;
            int var22 = (int) ((float) var21 * class540.field7899 + (float) this.field9310 * class133.field1639 + (float) var20 * class396.field5229 + class152.field1828);
            int var23 = (int) ((float) var21 * class592.field8603 + (float) this.field9310 * class536.field7521 + (float) var20 * class319.field4070 + class434.field5885);
            int var24 = (int) ((float) var21 * class614.field8890 + (float) this.field9310 * class621.field8962 + (float) var20 * class504.field6992 + class510.field7222);
            if (var24 < this.field9379.field5782) {
                var18 = true;
            } else {
                arg1.field7292 = this.field9379.field5724 * var23 / var24 + this.field9379.field5781;
                arg1.field7290 = this.field9379.field5795 * var22 / var24 + this.field9379.field5735;
            }
            int var25 = (int) ((float) var21 * class540.field7899 + (float) this.field9318 * class133.field1639 + (float) var20 * class396.field5229 + class152.field1828);
            int var26 = (int) ((float) var21 * class592.field8603 + (float) this.field9318 * class536.field7521 + (float) var20 * class319.field4070 + class434.field5885);
            int var27 = (int) ((float) var21 * class614.field8890 + (float) this.field9318 * class621.field8962 + (float) var20 * class504.field6992 + class510.field7222);
            if (var27 < this.field9379.field5782) {
                var18 = true;
            } else {
                arg1.field7291 = this.field9379.field5724 * var26 / var27 + this.field9379.field5781;
                arg1.field7294 = this.field9379.field5735 + (this.field9379.field5795 * var25 / var27);
            }
            if (var18) {
                if (this.field9379.field5782 > var24 && this.field9379.field5782 > var27) {
                    var19 = false;
                } else if (this.field9379.field5782 > var24) {
                    int var28 = (var27 - this.field9379.field5782 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field7290 = this.field9379.field5735 + (this.field9379.field5795 * var29 / this.field9379.field5782);
                    arg1.field7292 = this.field9379.field5724 * var30 / this.field9379.field5782 + this.field9379.field5781;
                } else if (this.field9379.field5782 > var27) {
                    int var31 = (var24 - this.field9379.field5782 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field7290 = this.field9379.field5795 * var32 / this.field9379.field5782 + this.field9379.field5735;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field7292 = this.field9379.field5781 + (this.field9379.field5724 * var33 / this.field9379.field5782);
                }
            }
            if (var19) {
                if (var24 <= var27) {
                    arg1.field7293 = (this.field9290 + var25) * this.field9379.field5795 / var27 + this.field9379.field5735 - arg1.field7294;
                } else {
                    arg1.field7293 = (this.field9290 + var22) * this.field9379.field5795 / var24 + this.field9379.field5735 - arg1.field7290;
                }
                arg1.field7289 = true;
            }
        }
        this.field9379.method2411(-90);
        this.field9379.method2453(15, var5);
        this.method3709((byte) 111);
        this.method3700(-65);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IBZLrw;ZLrw;)Lr;", line = 5003)
    private final class157 method3707(int arg0, byte arg1, boolean arg2, class643 arg3, boolean arg4, class643 arg5) {
        arg3.field9360 = this.field9360;
        arg3.field9347 = arg0;
        field9328++;
        arg3.field9383 = this.field9383;
        arg3.field9267 = this.field9267;
        arg3.field9346 = this.field9346;
        arg3.field9304 = this.field9304;
        arg3.field9271 = this.field9271;
        arg3.field9375 = this.field9375;
        arg3.field9282 = this.field9282;
        arg3.field9284 = this.field9284;
        boolean var7 = class213.method1216(arg0, this.field9346, 0);
        boolean var8 = class307.method1698((byte) -128, this.field9346, arg0);
        boolean var9 = class594.method3446(0, arg0, this.field9346);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg3.field9377 = this.field9377;
            } else if (arg5.field9377 == null || arg5.field9377.length < this.field9304) {
                arg3.field9377 = arg5.field9377 = new int[this.field9304];
            } else {
                arg3.field9377 = arg5.field9377;
            }
            if (!var8) {
                arg3.field9306 = this.field9306;
            } else if (arg5.field9306 == null || arg5.field9306.length < this.field9304) {
                arg3.field9306 = arg5.field9306 = new int[this.field9304];
            } else {
                arg3.field9306 = arg5.field9306;
            }
            if (!var9) {
                arg3.field9286 = this.field9286;
            } else if (arg5.field9286 == null || this.field9304 > arg5.field9286.length) {
                arg3.field9286 = arg5.field9286 = new int[this.field9304];
            } else {
                arg3.field9286 = arg5.field9286;
            }
            for (int var11 = 0; var11 < this.field9304; var11++) {
                if (var7) {
                    arg3.field9377[var11] = this.field9377[var11];
                }
                if (var8) {
                    arg3.field9306[var11] = this.field9306[var11];
                }
                if (var9) {
                    arg3.field9286[var11] = this.field9286[var11];
                }
            }
        } else {
            arg3.field9286 = this.field9286;
            arg3.field9306 = this.field9306;
            arg3.field9377 = this.field9377;
        }
        if (class383.method2215(arg0, 64, this.field9346)) {
            arg3.field9370 = arg5.field9370;
            arg3.field9370.field436 = this.field9370.field436;
            arg3.field9370.field431 = true;
            arg3.field9370.field439 = this.field9370.field439;
        } else if (class114.method678(this.field9346, -20042, arg0)) {
            arg3.field9370 = this.field9370;
        } else {
            arg3.field9370 = null;
        }
        if (class448.method2623(this.field9346, arg0, 27)) {
            if (arg5.field9351 == null || arg5.field9351.length < this.field9375) {
                arg3.field9351 = arg5.field9351 = new short[this.field9375];
            } else {
                arg3.field9351 = arg5.field9351;
            }
            for (int var12 = 0; var12 < this.field9375; var12++) {
                arg3.field9351[var12] = this.field9351[var12];
            }
        } else {
            arg3.field9351 = this.field9351;
        }
        if (class521.method2968(arg0, this.field9346, (byte) 122)) {
            if (arg5.field9369 == null || arg5.field9369.length < this.field9375) {
                arg3.field9369 = arg5.field9369 = new byte[this.field9375];
            } else {
                arg3.field9369 = arg5.field9369;
            }
            for (int var13 = 0; var13 < this.field9375; var13++) {
                arg3.field9369[var13] = this.field9369[var13];
            }
        } else {
            arg3.field9369 = this.field9369;
        }
        if (class337.method1896(this.field9346, (byte) -78, arg0)) {
            arg3.field9311 = arg5.field9311;
            arg3.field9311.field436 = this.field9311.field436;
            arg3.field9311.field439 = this.field9311.field439;
            arg3.field9311.field431 = true;
        } else if (class187.method1024(3, arg0, this.field9346)) {
            arg3.field9311 = this.field9311;
        } else {
            arg3.field9311 = null;
        }
        if (arg1 > -105) {
            return null;
        }
        if (class342.method1908(arg0, false, this.field9346)) {
            if (arg5.field9336 == null || arg5.field9336.length < this.field9282) {
                int var14 = this.field9282;
                arg3.field9336 = arg5.field9336 = new short[var14];
                arg3.field9361 = arg5.field9361 = new short[var14];
                arg3.field9273 = arg5.field9273 = new short[var14];
            } else {
                arg3.field9361 = arg5.field9361;
                arg3.field9336 = arg5.field9336;
                arg3.field9273 = arg5.field9273;
            }
            if (this.field9366 == null) {
                arg3.field9366 = null;
                for (int var15 = 0; var15 < this.field9282; var15++) {
                    arg3.field9336[var15] = this.field9336[var15];
                    arg3.field9273[var15] = this.field9273[var15];
                    arg3.field9361[var15] = this.field9361[var15];
                }
            } else {
                if (arg5.field9366 == null) {
                    arg5.field9366 = new class527();
                }
                class527 var16 = arg3.field9366 = arg5.field9366;
                if (var16.field7381 == null || var16.field7381.length < this.field9282) {
                    int var17 = this.field9282;
                    var16.field7386 = new short[var17];
                    var16.field7381 = new short[var17];
                    var16.field7387 = new short[var17];
                    var16.field7385 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field9282; var18++) {
                    arg3.field9336[var18] = this.field9336[var18];
                    arg3.field9273[var18] = this.field9273[var18];
                    arg3.field9361[var18] = this.field9361[var18];
                    var16.field7381[var18] = this.field9366.field7381[var18];
                    var16.field7387[var18] = this.field9366.field7387[var18];
                    var16.field7386[var18] = this.field9366.field7386[var18];
                    var16.field7385[var18] = this.field9366.field7385[var18];
                }
            }
            arg3.field9278 = this.field9278;
        } else {
            arg3.field9361 = this.field9361;
            arg3.field9278 = this.field9278;
            arg3.field9336 = this.field9336;
            arg3.field9273 = this.field9273;
            arg3.field9366 = this.field9366;
        }
        if (class402.method2299(this.field9346, 8192, arg0)) {
            arg3.field9367 = arg5.field9367;
            arg3.field9367.field436 = this.field9367.field436;
            arg3.field9367.field431 = true;
            arg3.field9367.field439 = this.field9367.field439;
        } else if (class205.method1096(false, this.field9346, arg0)) {
            arg3.field9367 = this.field9367;
        } else {
            arg3.field9367 = null;
        }
        if (class418.method2377(arg0, this.field9346, -19751)) {
            if (arg5.field9380 == null || this.field9375 > arg5.field9380.length) {
                int var19 = this.field9282;
                arg3.field9320 = arg5.field9320 = new float[var19];
                arg3.field9380 = arg5.field9380 = new float[var19];
            } else {
                arg3.field9320 = arg5.field9320;
                arg3.field9380 = arg5.field9380;
            }
            for (int var20 = 0; var20 < this.field9282; var20++) {
                arg3.field9380[var20] = this.field9380[var20];
                arg3.field9320[var20] = this.field9320[var20];
            }
        } else {
            arg3.field9380 = this.field9380;
            arg3.field9320 = this.field9320;
        }
        if (class13.method101(this.field9346, (byte) 115, arg0)) {
            arg3.field9298 = arg5.field9298;
            arg3.field9298.field431 = true;
            arg3.field9298.field436 = this.field9298.field436;
            arg3.field9298.field439 = this.field9298.field439;
        } else if (class70.method386((byte) 52, arg0, this.field9346)) {
            arg3.field9298 = this.field9298;
        } else {
            arg3.field9298 = null;
        }
        if (class199.method1073(this.field9346, false, arg0)) {
            if (arg5.field9317 == null || this.field9375 > arg5.field9317.length) {
                int var21 = this.field9375;
                arg3.field9296 = arg5.field9296 = new short[var21];
                arg3.field9317 = arg5.field9317 = new short[var21];
                arg3.field9363 = arg5.field9363 = new short[var21];
            } else {
                arg3.field9317 = arg5.field9317;
                arg3.field9363 = arg5.field9363;
                arg3.field9296 = arg5.field9296;
            }
            for (int var22 = 0; var22 < this.field9375; var22++) {
                arg3.field9317[var22] = this.field9317[var22];
                arg3.field9363[var22] = this.field9363[var22];
                arg3.field9296[var22] = this.field9296[var22];
            }
        } else {
            arg3.field9363 = this.field9363;
            arg3.field9296 = this.field9296;
            arg3.field9317 = this.field9317;
        }
        if (class140.method780((byte) -99, arg0, this.field9346)) {
            arg3.field9348 = arg5.field9348;
            arg3.field9348.field6221 = this.field9348.field6221;
            arg3.field9348.field6226 = true;
            arg3.field9348.field6218 = this.field9348.field6218;
        } else if (class358.method2012(1, this.field9346, arg0)) {
            arg3.field9348 = this.field9348;
        } else {
            arg3.field9348 = null;
        }
        if (class557.method3261(arg0, 32768, this.field9346)) {
            if (arg5.field9339 == null || this.field9375 > arg5.field9339.length) {
                int var23 = this.field9375;
                arg3.field9339 = arg5.field9339 = new short[var23];
            } else {
                arg3.field9339 = arg5.field9339;
            }
            for (int var24 = 0; var24 < this.field9375; var24++) {
                arg3.field9339[var24] = this.field9339[var24];
            }
        } else {
            arg3.field9339 = this.field9339;
        }
        if (!class169.method949(arg0, (byte) 9, this.field9346)) {
            arg3.field9287 = this.field9287;
        } else if (arg5.field9287 == null || this.field9360 > arg5.field9287.length) {
            int var26 = this.field9360;
            arg3.field9287 = arg5.field9287 = new class426[var26];
            for (int var27 = 0; var27 < this.field9360; var27++) {
                arg3.field9287[var27] = this.field9287[var27].method2399(115);
            }
        } else {
            arg3.field9287 = arg5.field9287;
            for (int var25 = 0; var25 < this.field9360; var25++) {
                arg3.field9287[var25].method2396(this.field9287[var25], (byte) -123);
            }
        }
        arg3.field9342 = this.field9342;
        arg3.field9331 = this.field9331;
        arg3.field9324 = this.field9324;
        arg3.field9340 = this.field9340;
        arg3.field9285 = this.field9285;
        if (this.field9314) {
            arg3.field9314 = true;
            arg3.field9364 = this.field9364;
            arg3.field9283 = this.field9283;
            arg3.field9290 = this.field9290;
            arg3.field9276 = this.field9276;
            arg3.field9310 = this.field9310;
            arg3.field9352 = this.field9352;
            arg3.field9318 = this.field9318;
        } else {
            arg3.field9314 = false;
        }
        arg3.field9345 = this.field9345;
        arg3.field9308 = this.field9308;
        arg3.field9305 = this.field9305;
        arg3.field9333 = this.field9333;
        arg3.field9288 = this.field9288;
        arg3.field9350 = this.field9350;
        arg3.field9277 = this.field9277;
        arg3.field9268 = this.field9268;
        arg3.field9349 = this.field9349;
        arg3.field9291 = this.field9291;
        return arg3;
    }

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "(I)V", line = 5461)
    public static void method3708(int arg0) {
        field9362 = null;
        if (arg0 != 0) {
            method3708(43);
        }
        field9313 = null;
    }

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "(I)V", line = 5473)
    public final void method58(int arg0) {
        this.field9284 = (short) arg0;
        field9355++;
        this.method3716(16384);
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V", line = 5484)
    private final void method3709(byte arg0) {
        field9353++;
        if (arg0 <= 62 || this.field9267 == 0) {
            return;
        }
        if (this.method3711(false) && this.method3704(0)) {
            this.field9379.method1792(this.field9370.field439, 0, (byte) 89);
            this.field9379.method1792(this.field9311.field439, 1, (byte) 89);
            this.field9379.method1792(this.field9298.field439, 2, (byte) 89);
            boolean var2;
            if ((this.field9346 & 0x37) == 0) {
                this.field9379.method2452(false, (byte) -94);
                var2 = false;
                this.field9379.method1837(this.field9379.field5815, 9);
            } else {
                var2 = true;
                this.field9379.method2452(true, (byte) -94);
                this.field9379.method1837(this.field9379.field5818, 9);
                this.field9379.method1792(this.field9367.field439, 3, (byte) 89);
            }
            for (int var3 = 0; var3 < this.field9345.length; var3++) {
                int var4 = this.field9349[var3];
                int var5 = this.field9349[var3 + 1];
                int var6 = this.field9339[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field9379.method2439(var6, true, var2, (byte) 122);
                this.field9379.method1801(this.field9345[var3], this.field9333[var3], 1440, class384.field5077, this.field9348.field6218, var5 - var4, var4 * 3);
            }
        }
        this.method3699(18578);
    }

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)V", line = 5543)
    private final void method3710(int arg0) {
        field9269++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = arg0;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field9383; var10++) {
            int var11 = this.field9377[var10];
            int var12 = this.field9306[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field9286[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field9283 = var4;
        this.field9364 = var7;
        this.field9276 = var5;
        this.field9310 = var3;
        this.field9318 = var6;
        this.field9352 = var2;
        this.field9290 = (int) (Math.sqrt((double) var8) + 0.99D);
        Math.sqrt((double) var9);
        this.field9314 = true;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V", line = 5623)
    public final void method79(int arg0) {
        field9293++;
        int var2 = class442.field6100[arg0];
        int var3 = class442.field6101[arg0];
        for (int var4 = 0; var4 < this.field9383; var4++) {
            int var5 = this.field9377[var4] * var3 + this.field9306[var4] * var2 >> 15;
            this.field9306[var4] = this.field9306[var4] * var3 - (this.field9377[var4] * var2) >> 15;
            this.field9377[var4] = var5;
        }
        this.method3713((byte) 38);
        this.field9314 = false;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BIZ)Lr;", line = 5650)
    public final class157 method64(byte arg0, int arg1, boolean arg2) {
        field9341++;
        class643 var4;
        class643 var5;
        if (arg0 == 1) {
            var4 = this.field9379.field5813;
            var5 = this.field9379.field5809;
        } else if (arg0 == 2) {
            var4 = this.field9379.field5799;
            var5 = this.field9379.field5807;
        } else if (arg0 == 3) {
            var5 = this.field9379.field5810;
            var4 = this.field9379.field5801;
        } else if (arg0 == 4) {
            var5 = this.field9379.field5817;
            var4 = this.field9379.field5816;
        } else if (arg0 == 5) {
            var4 = this.field9379.field5800;
            var5 = this.field9379.field5804;
        } else {
            var5 = var4 = new class643(this.field9379, 0, 0, true, false);
        }
        return this.method3707(arg1, (byte) -106, arg0 != 0, var5, arg2, var4);
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(Z)Z", line = 5714)
    private final boolean method3711(boolean arg0) {
        field9307++;
        boolean var2 = !this.field9311.field436;
        boolean var3 = (this.field9346 & 0x37) != 0 && !this.field9367.field436;
        boolean var4 = !this.field9370.field436;
        boolean var5 = !this.field9298.field436;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        if (arg0) {
            method3703(null, null, (byte) 94);
        }
        boolean var6 = true;
        if (var4) {
            if (this.field9370.field437 == null) {
                this.field9370.field437 = this.field9379.method1823(116, this.field9325);
            }
            class293 var7 = this.field9370.field437;
            var7.method444(false, this.field9282 * 12, 12);
            Buffer var8 = var7.method440(-99, true);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field9379.field5506.copyPositions(this.field9377, this.field9306, this.field9286, this.field9308, 0, 12, this.field9282, var8.getAddress());
                if (var7.method442(-80)) {
                    this.field9370.field439 = var7;
                    this.field9370.field436 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field9311.field437 == null) {
                this.field9311.field437 = this.field9379.method1823(112, this.field9325);
            }
            class293 var9 = this.field9311.field437;
            var9.method444(arg0, this.field9282 * 4, 4);
            Buffer var10 = var9.method440(-103, true);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field9346 & 0x37) == 0) {
                    short[] var11;
                    short[] var12;
                    short[] var13;
                    byte[] var14;
                    if (this.field9366 == null) {
                        var12 = this.field9336;
                        var14 = this.field9278;
                        var13 = this.field9273;
                        var11 = this.field9361;
                    } else {
                        var11 = this.field9366.field7386;
                        var12 = this.field9366.field7381;
                        var13 = this.field9366.field7387;
                        var14 = this.field9366.field7385;
                    }
                    this.field9379.field5506.copyLighting(this.field9351, this.field9369, this.field9339, var12, var13, var11, var14, this.field9284, this.field9271, this.field9288, 0, 4, this.field9282, var10.getAddress());
                } else {
                    this.field9379.field5506.copyColours(this.field9351, this.field9369, this.field9339, this.field9284, this.field9288, 0, 4, this.field9282, var10.getAddress());
                }
                if (var9.method442(113)) {
                    this.field9311.field439 = var9;
                    this.field9311.field436 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field9367.field437 == null) {
                this.field9367.field437 = this.field9379.method1823(123, this.field9325);
            }
            class293 var15 = this.field9367.field437;
            var15.method444(false, this.field9282 * 12, 12);
            Buffer var16 = var15.method440(-103, true);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                byte[] var18;
                short[] var19;
                short[] var20;
                if (this.field9366 == null) {
                    var17 = this.field9273;
                    var18 = this.field9278;
                    var19 = this.field9361;
                    var20 = this.field9336;
                } else {
                    var18 = this.field9366.field7385;
                    var17 = this.field9366.field7387;
                    var20 = this.field9366.field7381;
                    var19 = this.field9366.field7386;
                }
                this.field9379.field5506.copyNormals(var20, var17, var19, var18, 3.0F / (float) this.field9271, 3.0F / (float) (this.field9271 / 2 + this.field9271), 0, 12, this.field9282, var16.getAddress());
                if (var15.method442(109)) {
                    this.field9367.field439 = var15;
                    this.field9367.field436 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field9298.field437 == null) {
                this.field9298.field437 = this.field9379.method1823(114, this.field9325);
            }
            class293 var21 = this.field9298.field437;
            var21.method444(false, this.field9282 * 8, 8);
            Buffer var22 = var21.method440(-111, true);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field9379.field5506.copyTexCoords(this.field9380, this.field9320, 0, 8, this.field9282, var22.getAddress());
                if (var21.method442(68)) {
                    this.field9298.field436 = true;
                    this.field9298.field439 = var21;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rw", name = "V", descriptor = "(III)V", line = 5910)
    public final void method100(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field9383; var4++) {
            if (arg0 != 128) {
                this.field9377[var4] = this.field9377[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field9306[var4] = this.field9306[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field9286[var4] = this.field9286[var4] * arg2 >> 7;
            }
        }
        field9327++;
        this.method3713((byte) 73);
        this.field9314 = false;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lsg;B)V", line = 5942)
    private final void method3712(class335 arg0, byte arg1) {
        field9295++;
        if (this.field9324 != null) {
            for (int var3 = 0; var3 < this.field9324.length; var3++) {
                class55 var4 = this.field9324[var3];
                class55 var5 = var4;
                if (var4.field468 != null) {
                    var5 = var4.field468;
                }
                var5.field478 = (int) ((float) this.field9286[var4.field462] * arg0.field4343 + (float) this.field9377[var4.field462] * arg0.field4377 + (float) this.field9306[var4.field462] * arg0.field4361 + arg0.field4354);
                var5.field471 = (int) ((float) this.field9286[var4.field462] * arg0.field4371 + (float) this.field9377[var4.field462] * arg0.field4368 + (float) this.field9306[var4.field462] * arg0.field4366 + arg0.field4339);
                var5.field464 = (int) ((float) this.field9286[var4.field462] * arg0.field4344 + (float) this.field9377[var4.field462] * arg0.field4364 + (float) this.field9306[var4.field462] * arg0.field4345 + arg0.field4337);
                var5.field470 = (int) ((float) this.field9286[var4.field476] * arg0.field4343 + (float) this.field9377[var4.field476] * arg0.field4377 + (float) this.field9306[var4.field476] * arg0.field4361 + arg0.field4354);
                var5.field463 = (int) ((float) this.field9286[var4.field476] * arg0.field4371 + (float) this.field9377[var4.field476] * arg0.field4368 + (float) this.field9306[var4.field476] * arg0.field4366 + arg0.field4339);
                var5.field475 = (int) ((float) this.field9286[var4.field476] * arg0.field4344 + (float) this.field9377[var4.field476] * arg0.field4364 + (float) this.field9306[var4.field476] * arg0.field4345 + arg0.field4337);
                var5.field472 = (int) ((float) this.field9286[var4.field469] * arg0.field4343 + (float) this.field9377[var4.field469] * arg0.field4377 + (float) this.field9306[var4.field469] * arg0.field4361 + arg0.field4354);
                var5.field480 = (int) ((float) this.field9286[var4.field469] * arg0.field4371 + (float) this.field9377[var4.field469] * arg0.field4368 + (float) this.field9306[var4.field469] * arg0.field4366 + arg0.field4339);
                var5.field466 = (int) ((float) this.field9286[var4.field469] * arg0.field4344 + (float) this.field9377[var4.field469] * arg0.field4364 + (float) this.field9306[var4.field469] * arg0.field4345 + arg0.field4337);
            }
        }
        if (this.field9291 != null) {
            for (int var6 = 0; var6 < this.field9291.length; var6++) {
                class348 var7 = this.field9291[var6];
                class348 var8 = var7;
                if (var7.field4485 != null) {
                    var8 = var7.field4485;
                }
                if (var7.field4483 == null) {
                    var7.field4483 = arg0.method675();
                } else {
                    var7.field4483.method676(arg0);
                }
                var8.field4475 = (int) ((float) this.field9286[var7.field4487] * arg0.field4343 + (float) this.field9377[var7.field4487] * arg0.field4377 + (float) this.field9306[var7.field4487] * arg0.field4361 + arg0.field4354);
                var8.field4476 = (int) ((float) this.field9286[var7.field4487] * arg0.field4371 + (float) this.field9377[var7.field4487] * arg0.field4368 + (float) this.field9306[var7.field4487] * arg0.field4366 + arg0.field4339);
                var8.field4486 = (int) ((float) this.field9286[var7.field4487] * arg0.field4344 + (float) this.field9377[var7.field4487] * arg0.field4364 + (float) this.field9306[var7.field4487] * arg0.field4345 + arg0.field4337);
            }
        }
        if (arg1 != -121) {
            this.field9285 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(B)V", line = 6009)
    private final void method3713(byte arg0) {
        if (this.field9370 != null) {
            this.field9370.field436 = false;
        }
        int var2 = 85 / ((-arg0 - 26) / 57);
        field9272++;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IJIFIIFLei;IIB)S", line = 6022)
    private final short method3714(int arg0, long arg1, int arg2, float arg3, int arg4, int arg5, float arg6, class152 arg7, int arg8, int arg9, byte arg10) {
        field9329++;
        int var13 = this.field9268[arg8];
        int var14 = this.field9268[arg8 + 1];
        int var15 = 0;
        int var16 = 18 % ((arg10 + 56) / 59);
        for (int var17 = var13; var17 < var14; var17++) {
            short var18 = this.field9305[var17];
            if (var18 == 0) {
                var15 = var17;
                break;
            }
            if (class632.field9112[var17] == arg1) {
                return (short) (var18 - 1);
            }
        }
        this.field9305[var15] = (short) (this.field9282 + 1);
        class632.field9112[var15] = arg1;
        this.field9288[this.field9282] = (short) arg4;
        this.field9308[this.field9282] = (short) arg8;
        this.field9336[this.field9282] = (short) arg2;
        this.field9273[this.field9282] = (short) arg0;
        this.field9361[this.field9282] = (short) arg9;
        this.field9278[this.field9282] = (byte) arg5;
        this.field9380[this.field9282] = arg3;
        this.field9320[this.field9282] = arg6;
        return (short) (this.field9282++);
    }

    @OriginalMember(owner = "client!rw", name = "sa", descriptor = "()Z", line = 6072)
    public final boolean method62() {
        field9359++;
        if (this.field9350 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field9304; var1++) {
            this.field9377[var1] <<= 0x4;
            this.field9306[var1] <<= 0x4;
            this.field9286[var1] <<= 0x4;
        }
        class64.field634 = 0;
        class535.field7511 = 0;
        class406.field5332 = 0;
        return true;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIII)V", line = 6103)
    public final void method76(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field9375; var5++) {
            int var9 = this.field9351[var5] & 0xFFFF;
            int var10 = (var9 & 0xFC56) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field9351[var5] = (short) class42.method223(var12, class42.method223(var11 << 7, var10 << 10));
        }
        field9337++;
        if (this.field9277 != null) {
            for (int var6 = 0; var6 < this.field9360; var6++) {
                class257 var7 = this.field9277[var6];
                class426 var8 = this.field9287[var6];
                var8.field5482 = class103.field1259[this.field9351[var7.field3311] & 0xFFFF] & 0xFFFFFF | var8.field5482 & 0xFF000000;
            }
        }
        this.method3716(16384);
    }

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "()I", line = 6157)
    public final int method60() {
        field9365++;
        if (!this.field9314) {
            this.method3710(-32768);
        }
        return this.field9290;
    }

    @OriginalMember(owner = "client!rw", name = "EA", descriptor = "(Lk;)Lk;", line = 6172)
    public final class483 method81(class483 arg0) {
        field9312++;
        if (this.field9282 == 0) {
            return null;
        }
        if (!this.field9314) {
            this.method3710(-32768);
        }
        int var2;
        int var3;
        if (this.field9379.field5727 > 0) {
            var2 = this.field9352 - (this.field9379.field5727 * this.field9318 >> 8) >> this.field9379.field5699;
            var3 = this.field9276 - (this.field9379.field5727 * this.field9310 >> 8) >> this.field9379.field5699;
        } else {
            var2 = this.field9352 - (this.field9379.field5727 * this.field9310 >> 8) >> this.field9379.field5699;
            var3 = this.field9276 - (this.field9379.field5727 * this.field9318 >> 8) >> this.field9379.field5699;
        }
        int var4;
        int var5;
        if (this.field9379.field5760 > 0) {
            var4 = this.field9283 - (this.field9379.field5760 * this.field9318 >> 8) >> this.field9379.field5699;
            var5 = this.field9364 - (this.field9379.field5760 * this.field9310 >> 8) >> this.field9379.field5699;
        } else {
            var4 = this.field9283 - (this.field9379.field5760 * this.field9310 >> 8) >> this.field9379.field5699;
            var5 = this.field9364 - (this.field9379.field5760 * this.field9318 >> 8) >> this.field9379.field5699;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class34 var8 = (class34) arg0;
        class34 var9;
        if (var8 != null && var8.method192(var6, var7, (byte) -113)) {
            var9 = var8;
            var8.method196(-3071);
        } else {
            var9 = new class34(this.field9379, var6, var7);
        }
        var9.method194(var2, var3, var4, var5, (byte) 33);
        this.method3701(var9, 0);
        return var9;
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(Z)V", line = 6235)
    private final void method3715(boolean arg0) {
        field9338++;
        if (this.field9348 != null) {
            this.field9348.field6221 = false;
        }
        if (arg0) {
            this.field9366 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "(I)V", line = 6252)
    private final void method3716(int arg0) {
        if (this.field9311 != null) {
            this.field9311.field436 = false;
        }
        if (arg0 == 16384) {
            field9270++;
        }
    }

    @OriginalMember(owner = "client!rw", name = "va", descriptor = "()I", line = 6265)
    public final int method82() {
        field9344++;
        if (!this.field9314) {
            this.method3710(-32768);
        }
        return this.field9276;
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(B)V", line = 6277)
    public static final void method3717(byte arg0) {
        if (class70.method384(class137.field1671, 0) || class362.method2032(24, class137.field1671)) {
            class370.method2075(-8100, 5000, class39.field303 >> 10, class286.field3729 >> 10);
        } else {
            int var1 = class103.field1265.field6483[0] >> 3;
            int var2 = class103.field1265.field6491[0] >> 3;
            if (var1 >= 0 && (class106.field1289 >> 3) > var1 && var2 >= 0 && (class422.field5452 >> 3) > var2) {
                class370.method2075(-8100, 5000, var2, var1);
            } else {
                class370.method2075(-8100, 0, class422.field5452 >> 4, class106.field1289 >> 4);
            }
        }
        field9357++;
        class253.method1437(105);
        if (arg0 > -1) {
            field9313 = null;
        }
        class404.method2304(117);
        class59.method343(11463);
        class5.method32(1);
    }
}
