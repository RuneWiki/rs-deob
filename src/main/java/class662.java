import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class662 extends class474 {

    @OriginalMember(owner = "client!lw", name = "V", descriptor = "I")
    private int field9234 = 0;

    @OriginalMember(owner = "client!lw", name = "ob", descriptor = "Z")
    private boolean field9253 = false;

    @OriginalMember(owner = "client!lw", name = "Ib", descriptor = "Z")
    private boolean field9273 = false;

    @OriginalMember(owner = "client!lw", name = "wb", descriptor = "I")
    private int field9261 = 0;

    @OriginalMember(owner = "client!lw", name = "Q", descriptor = "I")
    private int field9229 = 0;

    @OriginalMember(owner = "client!lw", name = "ac", descriptor = "I")
    private int field9291 = 0;

    @OriginalMember(owner = "client!lw", name = "vc", descriptor = "Z")
    private boolean field9312 = true;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    private int field9207 = 0;

    @OriginalMember(owner = "client!lw", name = "Lc", descriptor = "Z")
    private boolean field9328 = false;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "Lbi;")
    private class483 field9222;

    @OriginalMember(owner = "client!lw", name = "hb", descriptor = "Luo;")
    private class578 field9246;

    @OriginalMember(owner = "client!lw", name = "Fb", descriptor = "Luo;")
    private class578 field9270;

    @OriginalMember(owner = "client!lw", name = "Ic", descriptor = "Luo;")
    private class578 field9325;

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "Luo;")
    private class578 field9202;

    @OriginalMember(owner = "client!lw", name = "Ec", descriptor = "Lbb;")
    private class336 field9321;

    @OriginalMember(owner = "client!lw", name = "ic", descriptor = "I")
    private int field9299;

    @OriginalMember(owner = "client!lw", name = "db", descriptor = "I")
    private int field9242;

    @OriginalMember(owner = "client!lw", name = "Jb", descriptor = "[I")
    private int[] field9274;

    @OriginalMember(owner = "client!lw", name = "Tb", descriptor = "[I")
    private int[] field9284;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "[I")
    private int[] field9204;

    @OriginalMember(owner = "client!lw", name = "X", descriptor = "[I")
    private int[] field9236;

    @OriginalMember(owner = "client!lw", name = "Hc", descriptor = "[S")
    private short[] field9324;

    @OriginalMember(owner = "client!lw", name = "Cc", descriptor = "[Lqi;")
    private class569[] field9319;

    @OriginalMember(owner = "client!lw", name = "xc", descriptor = "[Lhv;")
    private class521[] field9314;

    @OriginalMember(owner = "client!lw", name = "W", descriptor = "I")
    private int field9235;

    @OriginalMember(owner = "client!lw", name = "mc", descriptor = "[Laf;")
    private class438[] field9303;

    @OriginalMember(owner = "client!lw", name = "Yb", descriptor = "[Lik;")
    private class212[] field9289;

    @OriginalMember(owner = "client!lw", name = "rb", descriptor = "[S")
    private short[] field9256;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "[S")
    private short[] field9210;

    @OriginalMember(owner = "client!lw", name = "gc", descriptor = "[S")
    private short[] field9297;

    @OriginalMember(owner = "client!lw", name = "Gb", descriptor = "[S")
    private short[] field9271;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "[B")
    private byte[] field9223;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "S")
    private short field9209;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "[F")
    private float[] field9219;

    @OriginalMember(owner = "client!lw", name = "Ab", descriptor = "[B")
    private byte[] field9265;

    @OriginalMember(owner = "client!lw", name = "tb", descriptor = "[F")
    private float[] field9258;

    @OriginalMember(owner = "client!lw", name = "nb", descriptor = "[S")
    private short[] field9252;

    @OriginalMember(owner = "client!lw", name = "S", descriptor = "S")
    private short field9231;

    @OriginalMember(owner = "client!lw", name = "Db", descriptor = "[S")
    private short[] field9268;

    @OriginalMember(owner = "client!lw", name = "Rb", descriptor = "[S")
    private short[] field9282;

    @OriginalMember(owner = "client!lw", name = "Ob", descriptor = "[S")
    private short[] field9279;

    @OriginalMember(owner = "client!lw", name = "Eb", descriptor = "[S")
    private short[] field9269;

    @OriginalMember(owner = "client!lw", name = "xb", descriptor = "[S")
    private short[] field9262;

    @OriginalMember(owner = "client!lw", name = "dc", descriptor = "[I")
    private int[] field9294;

    @OriginalMember(owner = "client!lw", name = "ib", descriptor = "[[I")
    private int[][] field9247;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "[[I")
    private int[][] field9221;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "[[I")
    private int[][] field9225;

    @OriginalMember(owner = "client!lw", name = "Mb", descriptor = "J")
    public static long field9277 = 0L;

    @OriginalMember(owner = "client!lw", name = "Qb", descriptor = "Ljv;")
    public static class81 field9281 = new class81();

    @OriginalMember(owner = "client!lw", name = "zc", descriptor = "[Lic;")
    public static class701[] field9316 = new class701[14];

    @OriginalMember(owner = "client!lw", name = "Jc", descriptor = "I")
    public static int field9326 = 999999;

    @OriginalMember(owner = "client!lw", name = "Vb", descriptor = "B")
    private byte field9286;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!lw", name = "A", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!lw", name = "D", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!lw", name = "O", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!lw", name = "R", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!lw", name = "T", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!lw", name = "Y", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!lw", name = "Z", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!lw", name = "ab", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!lw", name = "bb", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!lw", name = "eb", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!lw", name = "fb", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!lw", name = "gb", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!lw", name = "jb", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!lw", name = "kb", descriptor = "I")
    public static int field9249;

    @OriginalMember(owner = "client!lw", name = "lb", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!lw", name = "mb", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!lw", name = "qb", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!lw", name = "sb", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!lw", name = "ub", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!lw", name = "yb", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!lw", name = "zb", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!lw", name = "Bb", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!lw", name = "Hb", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!lw", name = "Kb", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!lw", name = "Lb", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!lw", name = "Nb", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!lw", name = "Pb", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!lw", name = "Sb", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!lw", name = "Wb", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!lw", name = "Xb", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!lw", name = "bc", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!lw", name = "cc", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!lw", name = "hc", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!lw", name = "jc", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!lw", name = "kc", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!lw", name = "lc", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!lw", name = "nc", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!lw", name = "oc", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!lw", name = "pc", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!lw", name = "qc", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!lw", name = "rc", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!lw", name = "sc", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!lw", name = "tc", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!lw", name = "uc", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!lw", name = "wc", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!lw", name = "yc", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!lw", name = "Ac", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!lw", name = "Bc", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!lw", name = "Dc", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!lw", name = "Fc", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!lw", name = "Kc", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!lw", name = "Mc", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!lw", name = "ec", descriptor = "Lju;")
    private class128 field9295;

    @OriginalMember(owner = "client!lw", name = "fc", descriptor = "Lg;")
    private class158 field9296;

    @OriginalMember(owner = "client!lw", name = "U", descriptor = "Lsha;")
    private class730 field9233;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "S")
    private short field9213;

    @OriginalMember(owner = "client!lw", name = "cb", descriptor = "S")
    private short field9241;

    @OriginalMember(owner = "client!lw", name = "pb", descriptor = "S")
    private short field9254;

    @OriginalMember(owner = "client!lw", name = "vb", descriptor = "S")
    private short field9260;

    @OriginalMember(owner = "client!lw", name = "Cb", descriptor = "S")
    private short field9267;

    @OriginalMember(owner = "client!lw", name = "Ub", descriptor = "S")
    private short field9285;

    @OriginalMember(owner = "client!lw", name = "Zb", descriptor = "S")
    private short field9290;

    @OriginalMember(owner = "client!lw", name = "Gc", descriptor = "S")
    private short field9323;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V", line = 3)
    public static final void method3720(int arg0) {
        field9212++;
        class218.field2938 = new class288[class659.field9178.method3155((byte) -44)][];
        class416.field5300 = new class288[class659.field9178.method3155((byte) -79)][];
        class214.field2818 = new boolean[class659.field9178.method3155((byte) -43)];
        if (arg0 > -47) {
            method3720(51);
        }
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "()[Lqi;", line = 16)
    public final class569[] method268() {
        field9311++;
        return this.field9319;
    }

    @OriginalMember(owner = "client!lw", name = "aa", descriptor = "(SS)V", line = 31)
    public final void method293(short arg0, short arg1) {
        field9206++;
        class153 var3 = this.field9222.field830;
        for (int var4 = 0; var4 < this.field9234; var4++) {
            if (this.field9252[var4] == arg0) {
                this.field9252[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class537 var7 = var3.method1072(arg0 & 0xFFFF, true);
            var5 = var7.field7438;
            var6 = var7.field7437;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class537 var10 = var3.method1072(arg1 & 0xFFFF, true);
            var8 = var10.field7438;
            var9 = var10.field7437;
            if (var10.field7441 != 0 || var10.field7444 != 0) {
                this.field9328 = true;
            }
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field9303 != null) {
            for (int var11 = 0; var11 < this.field9235; var11++) {
                class438 var12 = this.field9303[var11];
                class212 var13 = this.field9289[var11];
                var13.field2795 = class267.field3365[this.field9279[var12.field5842] & 0xFFFF] & 0xFFFFFF | var13.field2795 & 0xFF000000;
            }
        }
        if (this.field9202 != null) {
            this.field9202.field8106 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZI)V", line = 119)
    private final void method3721(boolean arg0, int arg1) {
        if ((this.field9229 * 6) <= this.field9222.field6845.field6180.length) {
            this.field9222.field6845.field6193 = 0;
        } else {
            this.field9222.field6845 = new class736(this.field9229 * 6 + 600);
        }
        field9248++;
        class736 var3 = this.field9222.field6845;
        if (this.field9222.field6903) {
            for (int var5 = 0; var5 < this.field9229; var5++) {
                var3.method2620(this.field9268[var5], false);
                var3.method2620(this.field9297[var5], false);
                var3.method2620(this.field9269[var5], false);
            }
        } else {
            for (int var4 = 0; var4 < this.field9229; var4++) {
                var3.method2619(this.field9268[var4], -1);
                var3.method2619(this.field9297[var4], -1);
                var3.method2619(this.field9269[var4], -1);
            }
        }
        if (var3.field6193 == arg1) {
            return;
        }
        if (arg0) {
            if (this.field9296 == null) {
                this.field9296 = this.field9222.method2774(arg1 ^ 0xFFFFFFAB, var3.field6193, true, var3.field6180, 5123);
            } else {
                this.field9296.method1107(5123, var3.field6180, 21189, var3.field6193);
            }
            this.field9321.field4260 = this.field9296;
        } else {
            this.field9321.field4260 = this.field9222.method2774(-48, var3.field6193, false, var3.field6180, 5123);
        }
        if (!arg0) {
            this.field9312 = true;
        }
    }

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "()Z", line = 181)
    public final boolean method244() {
        field9278++;
        return this.field9328;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "()Z", line = 191)
    public final boolean method249() {
        field9318++;
        if (this.field9252 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field9252.length; var1++) {
            if (this.field9252[var1] != -1 && !this.field9222.field830.method1071((byte) 121, this.field9252[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "(I)V", line = 214)
    public final void method246(int arg0) {
        field9300++;
        int var2 = class16.field320[arg0];
        int var3 = class16.field322[arg0];
        for (int var4 = 0; var4 < this.field9291; var4++) {
            int var7 = this.field9284[var4] * var2 + (this.field9204[var4] * var3) >> 14;
            this.field9284[var4] = this.field9284[var4] * var3 - (this.field9204[var4] * var2) >> 14;
            this.field9204[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field9261; var5++) {
            int var6 = this.field9271[var5] * var2 + this.field9210[var5] * var3 >> 14;
            this.field9271[var5] = (short) (this.field9271[var5] * var3 - (this.field9210[var5] * var2) >> 14);
            this.field9210[var5] = (short) var6;
        }
        if (this.field9325 == null && this.field9202 != null) {
            this.field9202.field8106 = null;
        }
        if (this.field9325 != null) {
            this.field9325.field8106 = null;
        }
        this.field9273 = false;
        if (this.field9246 != null) {
            this.field9246.field8106 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "()V", line = 265)
    public final void method245() {
        for (int var1 = 0; var1 < this.field9291; var1++) {
            this.field9284[var1] = -this.field9284[var1];
        }
        field9322++;
        for (int var2 = 0; var2 < this.field9261; var2++) {
            this.field9271[var2] = (short) (-this.field9271[var2]);
        }
        for (int var3 = 0; var3 < this.field9234; var3++) {
            short var4 = this.field9268[var3];
            this.field9268[var3] = this.field9269[var3];
            this.field9269[var3] = var4;
        }
        if (this.field9325 == null && this.field9202 != null) {
            this.field9202.field8106 = null;
        }
        if (this.field9325 != null) {
            this.field9325.field8106 = null;
        }
        if (this.field9246 != null) {
            this.field9246.field8106 = null;
        }
        this.field9273 = false;
        if (this.field9321 != null) {
            this.field9321.field4260 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ISIIB)I", line = 317)
    private final int method3722(int arg0, short arg1, int arg2, int arg3, byte arg4) {
        field9215++;
        if (arg0 != -26162) {
            method3724(-7);
        }
        int var6 = class267.field3365[class238.method1493(false, arg3, arg2)];
        if (arg1 != -1) {
            class537 var7 = this.field9222.field830.method1072(arg1 & 0xFFFF, true);
            int var8 = var7.field7438 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg2 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field7437 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = ((var13 & 0x5800FF00) << 8) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg4 & 0xFF);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 394)
    public final void method270(int arg0) {
        field9257++;
        int var2 = class16.field320[arg0];
        int var3 = class16.field322[arg0];
        for (int var4 = 0; var4 < this.field9291; var4++) {
            int var5 = this.field9284[var4] * var2 + this.field9204[var4] * var3 >> 14;
            this.field9284[var4] = this.field9284[var4] * var3 - (this.field9204[var4] * var2) >> 14;
            this.field9204[var4] = var5;
        }
        this.field9273 = false;
        if (this.field9246 != null) {
            this.field9246.field8106 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "RA", descriptor = "()I", line = 424)
    public final int method285() {
        field9301++;
        if (!this.field9273) {
            this.method3729(8192);
        }
        return this.field9241;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V", line = 443)
    private final void method3723(int arg0, boolean arg1) {
        if (arg0 != -6961) {
            this.method248();
        }
        field9320++;
        boolean var3 = this.field9202 != null && this.field9202.field8106 == null;
        boolean var4 = this.field9325 != null && this.field9325.field8106 == null;
        boolean var5 = this.field9246 != null && this.field9246.field8106 == null;
        boolean var6 = this.field9270 != null && this.field9270.field8106 == null;
        if (arg1) {
            var3 &= (this.field9286 & 0x2) != 0;
            var4 &= (this.field9286 & 0x4) != 0;
            var6 &= (this.field9286 & 0x8) != 0;
            var5 &= (this.field9286 & 0x1) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field9261 * var7 <= this.field9222.field6845.field6180.length) {
            this.field9222.field6845.field6193 = 0;
        } else {
            this.field9222.field6845 = new class736((this.field9261 + 100) * var7);
        }
        class736 var12 = this.field9222.field6845;
        if (var5) {
            if (this.field9222.field6903) {
                for (int var21 = 0; var21 < this.field9291; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field9204[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field9236[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field9284[var21]);
                    int var25 = this.field9274[var21];
                    int var26 = this.field9274[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field9262[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field6193 = var7 * var28;
                        var12.method2568(var22, -535701016);
                        var12.method2568(var23, -535701016);
                        var12.method2568(var24, -535701016);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field9291; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field9204[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field9236[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field9284[var13]);
                    int var17 = this.field9274[var13];
                    int var18 = this.field9274[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field9262[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field6193 = var7 * var20;
                        var12.method2616(var14, -2050445096);
                        var12.method2616(var15, -2050445096);
                        var12.method2616(var16, -2050445096);
                    }
                }
            }
        }
        if (var3) {
            if (this.field9325 == null) {
                short[] var29;
                short[] var30;
                byte[] var31;
                short[] var32;
                if (this.field9233 == null) {
                    var29 = this.field9271;
                    var30 = this.field9210;
                    var31 = this.field9265;
                    var32 = this.field9256;
                } else {
                    var32 = this.field9233.field10161;
                    var30 = this.field9233.field10157;
                    var29 = this.field9233.field10155;
                    var31 = this.field9233.field10162;
                }
                float var33 = this.field9222.field6871[0];
                float var34 = this.field9222.field6871[1];
                float var35 = this.field9222.field6871[2];
                float var36 = this.field9222.field6835;
                float var37 = this.field9222.field6919 * 768.0F / (float) this.field9231;
                float var38 = this.field9222.field6848 * 768.0F / (float) this.field9231;
                for (int var39 = 0; var39 < this.field9234; var39++) {
                    int var40 = this.method3722(-26162, this.field9252[var39], this.field9209, this.field9279[var39], this.field9223[var39]);
                    float var41 = (float) (var40 >>> 24) * this.field9222.field6892;
                    float var42 = (float) ((var40 & 0xFF37) >> 8) * this.field9222.field6816;
                    short var43 = this.field9268[var39];
                    float var44 = (float) (var40 >> 16 & 0xFF) * this.field9222.field6899;
                    short var45 = (short) var31[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var29[var43] * var35 + (float) var30[var43] * var33 + (float) var32[var43] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var29[var43] * var35 + (float) var30[var43] * var33 + (float) var32[var43] * var34) / (float) (var45 * 256);
                    }
                    float var47 = (var46 < 0.0F ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var41 * var47);
                    int var49 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var42 * var47);
                    var12.field6193 = var7 * var43 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method2578(var48, -1221492240);
                    var12.method2578(var49, -1221492240);
                    var12.method2578(var50, -1221492240);
                    var12.method2578(255 - (this.field9223[var39] & 0xFF), -1221492240);
                    short var51 = this.field9297[var39];
                    short var52 = (short) var31[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var33 + (float) var32[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var33 + (float) var32[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = ((var53 < 0.0F) ? var38 : var37) * var53 + var36;
                    int var55 = (int) (var41 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var44 * var54);
                    int var57 = (int) (var42 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field6193 = var7 * var51 + var9;
                    var12.method2578(var55, arg0 ^ 0x48CE653F);
                    var12.method2578(var56, arg0 ^ 0x48CE653F);
                    var12.method2578(var57, -1221492240);
                    var12.method2578(255 - (this.field9223[var39] & 0xFF), -1221492240);
                    short var58 = this.field9269[var39];
                    short var59 = (short) var31[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var33 + (float) var32[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var33 + (float) var32[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = var60 * (var60 < 0.0F ? var38 : var37) + var36;
                    int var62 = (int) (var41 * var61);
                    int var63 = (int) (var44 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var42 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field6193 = var9 + (var7 * var58);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method2578(var62, -1221492240);
                    var12.method2578(var63, arg0 - 1221485279);
                    var12.method2578(var64, -1221492240);
                    var12.method2578(255 - (this.field9223[var39] & 0xFF), arg0 ^ 0x48CE653F);
                }
            } else {
                for (int var65 = 0; var65 < this.field9234; var65++) {
                    int var66 = this.method3722(-26162, this.field9252[var65], this.field9209, this.field9279[var65], this.field9223[var65]);
                    var12.field6193 = this.field9268[var65] * var7 + var9;
                    var12.method2568(var66, arg0 - 535694055);
                    var12.field6193 = this.field9297[var65] * var7 + var9;
                    var12.method2568(var66, -535701016);
                    var12.field6193 = this.field9269[var65] * var7 + var9;
                    var12.method2568(var66, arg0 ^ 0x1FEE3D27);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field9233 == null) {
                var69 = this.field9210;
                var67 = this.field9256;
                var68 = this.field9271;
                var70 = this.field9265;
            } else {
                var67 = this.field9233.field10161;
                var68 = this.field9233.field10155;
                var69 = this.field9233.field10157;
                var70 = this.field9233.field10162;
            }
            float var71 = 3.0F / (float) this.field9231;
            float var72 = 3.0F / (float) (this.field9231 / 2 + this.field9231);
            var12.field6193 = var10;
            if (this.field9222.field6903) {
                for (int var76 = 0; var76 < this.field9261; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method4102((float) var69[var76] * var72, (byte) -56);
                        var12.method4102((float) var67[var76] * var72, (byte) -56);
                        var12.method4102((float) var68[var76] * var72, (byte) -56);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method4102((float) var69[var76] * var78, (byte) -56);
                        var12.method4102((float) var67[var76] * var78, (byte) -56);
                        var12.method4102((float) var68[var76] * var78, (byte) -56);
                    }
                    var12.field6193 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field9261; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method4104(1482486504, (float) var69[var73] * var72);
                        var12.method4104(1482486504, (float) var67[var73] * var72);
                        var12.method4104(arg0 + 1482493465, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method4104(1482486504, (float) var69[var73] * var75);
                        var12.method4104(arg0 + 1482493465, (float) var67[var73] * var75);
                        var12.method4104(1482486504, (float) var68[var73] * var75);
                    }
                    var12.field6193 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field6193 = var11;
            if (this.field9222.field6903) {
                for (int var79 = 0; var79 < this.field9261; var79++) {
                    var12.method4102(this.field9258[var79], (byte) -56);
                    var12.method4102(this.field9219[var79], (byte) -56);
                    var12.field6193 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field9261; var80++) {
                    var12.method4104(1482486504, this.field9258[var80]);
                    var12.method4104(arg0 ^ 0xA7A31627, this.field9219[var80]);
                    var12.field6193 += var7 - 8;
                }
            }
        }
        var12.field6193 = this.field9261 * var7;
        class128 var81;
        if (arg1) {
            if (this.field9295 == null) {
                this.field9295 = this.field9222.method2814(arg0 + 7068, var12.field6180, true, var12.field6193, var7);
            } else {
                this.field9295.method958(var7, var12.field6193, var12.field6180, (byte) -96);
            }
            this.field9286 = 0;
            var81 = this.field9295;
        } else {
            var81 = this.field9222.method2814(78, var12.field6180, false, var12.field6193, var7);
            this.field9312 = true;
        }
        if (var5) {
            this.field9246.field8106 = var81;
            this.field9246.field8102 = var8;
        }
        if (var6) {
            this.field9270.field8106 = var81;
            this.field9270.field8102 = var11;
        }
        if (var3) {
            this.field9202.field8102 = var9;
            this.field9202.field8106 = var81;
        }
        if (var4) {
            this.field9325.field8102 = var10;
            this.field9325.field8106 = var81;
        }
    }

    @OriginalMember(owner = "client!lw", name = "na", descriptor = "()I", line = 970)
    public final int method288() {
        field9251++;
        if (!this.field9273) {
            this.method3729(8192);
        }
        return this.field9254;
    }

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "(IILs;Ls;III)V", line = 982)
    public final void method277(int arg0, int arg1, class282 arg2, class282 arg3, int arg4, int arg5, int arg6) {
        field9216++;
        if (!this.field9273) {
            this.method3729(8192);
        }
        int var8 = this.field9260 + arg4;
        int var9 = arg4 + this.field9241;
        int var10 = this.field9290 + arg6;
        int var11 = this.field9323 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3557 + var9 >> arg2.field3550 >= arg2.field3561 || var10 < 0 || arg2.field3557 + var11 >> arg2.field3550 >= arg2.field3555) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3561 <= arg3.field3557 + var9 >> arg3.field3550 || var10 < 0 || (arg3.field3557 + var11 >> arg3.field3550) >= arg3.field3555) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3550;
            int var13 = arg2.field3557 + var9 - 1 >> arg2.field3550;
            int var14 = var10 >> arg2.field3550;
            int var15 = arg2.field3557 + var11 - 1 >> arg2.field3550;
            if (arg2.method1677(var14, (byte) 98, var12) == arg5 && arg2.method1677(var14, (byte) 95, var13) == arg5 && arg5 == arg2.method1677(var15, (byte) 102, var12) && arg2.method1677(var15, (byte) 86, var13) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field9291; var32++) {
                this.field9236[var32] = (this.field9236[var32] + arg2.method1676(this.field9204[var32] + arg4, true, this.field9284[var32] + arg6)) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field9267;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field9291; var30++) {
                int var31 = (this.field9236[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field9236[var30] -= -((arg1 - var31) * (arg2.method1676(this.field9204[var30] + arg4, true, this.field9284[var30] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var25 = (arg1 & 0xFF) * 4;
            int var26 = ((arg1 & 0xFFE5) >> 8) * 4;
            int var27 = arg1 >> 16 & 0xFF << 6;
            int var28 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var25 >> 1) < 0 || arg2.field3561 << arg2.field3550 <= (var25 >> 1) + arg4 + arg2.field3557 || (arg6 - (var26 >> 1)) < 0 || (arg2.field3555 << arg2.field3550) <= ((var26 >> 1) + arg6 + arg2.field3557)) {
                return;
            }
            this.method2709(arg2, arg4, var28, var26, var25, var27, arg6, arg5, 16);
        } else if (arg0 == 4) {
            int var23 = this.field9213 - this.field9267;
            for (int var24 = 0; var24 < this.field9291; var24++) {
                this.field9236[var24] = this.field9236[var24] + arg3.method1676(this.field9204[var24] + arg4, true, this.field9284[var24] + arg6) - (-var23 + arg5);
            }
        } else if (arg0 == 5) {
            int var16 = this.field9213 - this.field9267;
            for (int var17 = 0; var17 < this.field9291; var17++) {
                int var18 = this.field9204[var17] + arg4;
                int var19 = this.field9284[var17] + arg6;
                int var20 = arg2.method1676(var18, true, var19);
                int var21 = arg3.method1676(var18, true, var19);
                int var22 = var20 - var21 - arg1;
                this.field9236[var17] = ((this.field9236[var17] << 8) / var16 * var22 >> 8) - (arg5 - var20);
            }
        }
        if (this.field9246 != null) {
            this.field9246.field8106 = null;
        }
        this.field9273 = false;
    }

    @OriginalMember(owner = "client!lw", name = "ua", descriptor = "()I", line = 1131)
    public final int method272() {
        field9218++;
        return this.field9242;
    }

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "()I", line = 1142)
    public final int method242() {
        if (!this.field9273) {
            this.method3729(8192);
        }
        field9307++;
        return this.field9323;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lpda;Lwt;II)V", line = 1154)
    public final void method255(class631 arg0, class314 arg1, int arg2, int arg3) {
        field9259++;
        if (this.field9261 == 0) {
            return;
        }
        class65 var5 = this.field9222.field6806;
        if (!this.field9273) {
            this.method3729(8192);
        }
        class65 var6 = (class65) arg0;
        class331.field4225 = var5.field913 * var6.field935 + var5.field935 * var6.field925 + var5.field905 * var6.field936;
        class723.field10055 = var5.field913 * var6.field927 + var5.field935 * var6.field921 + var5.field905 * var6.field914 + var5.field927;
        float var7 = (float) this.field9267 * class331.field4225 + class723.field10055;
        float var8 = (float) this.field9213 * class331.field4225 + class723.field10055;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = (float) this.field9254 + var7;
            var9 = var8 - (float) this.field9254;
        } else {
            var9 = var7 - (float) this.field9254;
            var10 = (float) this.field9254 + var8;
        }
        if ((this.field9222.field6853 <= var9) || (var10 <= (float) this.field9222.field6855)) {
            return;
        }
        class737.field10235 = var5.field916 * var6.field927 + var5.field936 * var6.field921 + var5.field915 * var6.field914 + var5.field914;
        class686.field9557 = var5.field916 * var6.field935 + var5.field936 * var6.field925 + var5.field915 * var6.field936;
        float var11 = (float) this.field9267 * class686.field9557 + class737.field10235;
        float var12 = (float) this.field9213 * class686.field9557 + class737.field10235;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field9254 + var11) * (float) this.field9222.field6820;
            var14 = (var12 - (float) this.field9254) * (float) this.field9222.field6820;
        } else {
            var13 = ((float) this.field9254 + var12) * (float) this.field9222.field6820;
            var14 = ((float) (-this.field9254) + var11) * (float) this.field9222.field6820;
        }
        if ((this.field9222.field6905 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field9222.field6907)) {
            return;
        }
        class658.field9163 = var5.field906 * var6.field927 + var5.field937 * var6.field914 + var5.field925 * var6.field921 + var5.field921;
        class61.field866 = var5.field906 * var6.field935 + var5.field937 * var6.field936 + var5.field925 * var6.field925;
        float var15 = (float) this.field9267 * class61.field866 + class658.field9163;
        float var16 = (float) this.field9213 * class61.field866 + class658.field9163;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var17 = ((float) this.field9254 + var15) * (float) this.field9222.field6857;
            var18 = (var16 - (float) this.field9254) * (float) this.field9222.field6857;
        } else {
            var17 = ((float) this.field9254 + var16) * (float) this.field9222.field6857;
            var18 = ((float) (-this.field9254) + var15) * (float) this.field9222.field6857;
        }
        if ((var18 / (float) arg2 >= this.field9222.field6916) || (this.field9222.field6824 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field9303 != null) {
            class209.field2765 = var5.field906 * var6.field913 + var5.field937 * var6.field916 + var5.field925 * var6.field906;
            class125.field1795 = var5.field913 * var6.field905 + var5.field935 * var6.field937 + var5.field905 * var6.field915;
            class619.field8536 = var5.field913 * var6.field913 + var5.field935 * var6.field906 + var5.field905 * var6.field916;
            class122.field1763 = var5.field906 * var6.field905 + var5.field937 * var6.field915 + var5.field925 * var6.field937;
            class171.field2367 = var5.field916 * var6.field905 + var5.field936 * var6.field937 + var5.field915 * var6.field915;
            class694.field9648 = var5.field916 * var6.field913 + var5.field936 * var6.field906 + var5.field915 * var6.field916;
        }
        if (arg1 != null) {
            int var19 = this.field9260 + this.field9241 >> 1;
            int var20 = this.field9323 + this.field9290 >> 1;
            int var21 = (int) ((float) var20 * class694.field9648 + (float) this.field9267 * class686.field9557 + (float) var19 * class171.field2367 + class737.field10235);
            int var22 = (int) ((float) var20 * class209.field2765 + (float) this.field9267 * class61.field866 + (float) var19 * class122.field1763 + class658.field9163);
            int var23 = (int) ((float) var20 * class619.field8536 + (float) this.field9267 * class331.field4225 + (float) var19 * class125.field1795 + class723.field10055);
            int var24 = (int) ((float) var20 * class694.field9648 + (float) this.field9213 * class686.field9557 + (float) var19 * class171.field2367 + class737.field10235);
            int var25 = (int) ((float) var20 * class209.field2765 + (float) this.field9213 * class61.field866 + (float) var19 * class122.field1763 + class658.field9163);
            arg1.field4101 = this.field9222.field6820 * var24 / arg2 + this.field9222.field6921;
            arg1.field4100 = this.field9222.field6877 + (this.field9222.field6857 * var25 / arg2);
            arg1.field4098 = this.field9222.field6877 + (this.field9222.field6857 * var22 / arg2);
            arg1.field4102 = this.field9222.field6820 * var21 / arg2 + this.field9222.field6921;
            int var26 = (int) ((float) var20 * class619.field8536 + (float) this.field9213 * class331.field4225 + (float) var19 * class125.field1795 + class723.field10055);
            if (this.field9222.field6855 <= var23 || var26 >= this.field9222.field6855) {
                arg1.field4099 = true;
                arg1.field4103 = (this.field9254 + var21) * this.field9222.field6820 / arg2 + this.field9222.field6921 - arg1.field4102;
            }
        }
        this.field9222.method2808((float) arg2, (byte) 9);
        this.field9222.method2797((byte) -27);
        this.field9222.method2826(false, var6);
        this.method3734((byte) -55);
        this.field9222.method2839(-20411);
        this.method3736(-65);
    }

    @OriginalMember(owner = "client!lw", name = "V", descriptor = "()I", line = 1304)
    public final int method263() {
        field9240++;
        if (!this.field9273) {
            this.method3729(8192);
        }
        return this.field9260;
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)I", line = 1316)
    public static final int method3724(int arg0) {
        field9255++;
        if ((double) class73.field1028 == 3.0D) {
            return 37;
        } else if ((double) class73.field1028 == 4.0D) {
            return 50;
        } else {
            if (arg0 != -1) {
                method3724(48);
            }
            if ((double) class73.field1028 == 6.0D) {
                return 75;
            } else if ((double) class73.field1028 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lpda;Lwt;I)V", line = 1342)
    public final void method250(class631 arg0, class314 arg1, int arg2) {
        field9327++;
        if (this.field9261 == 0) {
            return;
        }
        class65 var4 = this.field9222.field6806;
        class65 var5 = (class65) arg0;
        if (!this.field9273) {
            this.method3729(8192);
        }
        class331.field4225 = var4.field913 * var5.field935 + var4.field935 * var5.field925 + var4.field905 * var5.field936;
        class723.field10055 = var4.field913 * var5.field927 + var4.field935 * var5.field921 + var4.field905 * var5.field914 + var4.field927;
        float var6 = (float) this.field9267 * class331.field4225 + class723.field10055;
        float var7 = (float) this.field9213 * class331.field4225 + class723.field10055;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) (-this.field9254) + var7;
            var9 = (float) this.field9254 + var6;
        } else {
            var9 = (float) this.field9254 + var7;
            var8 = var6 - (float) this.field9254;
        }
        if ((var8 >= this.field9222.field6920) || (var9 <= (float) this.field9222.field6855)) {
            return;
        }
        class737.field10235 = var4.field916 * var5.field927 + var4.field936 * var5.field921 + var4.field915 * var5.field914 + var4.field914;
        class686.field9557 = var4.field916 * var5.field935 + var4.field936 * var5.field925 + var4.field915 * var5.field936;
        float var10 = (float) this.field9267 * class686.field9557 + class737.field10235;
        float var11 = (float) this.field9213 * class686.field9557 + class737.field10235;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = ((float) this.field9254 + var10) * (float) this.field9222.field6820;
            var12 = ((float) (-this.field9254) + var11) * (float) this.field9222.field6820;
        } else {
            var12 = ((float) (-this.field9254) + var10) * (float) this.field9222.field6820;
            var13 = ((float) this.field9254 + var11) * (float) this.field9222.field6820;
        }
        if ((this.field9222.field6905 <= var12 / var9) || (var13 / var9 <= this.field9222.field6907)) {
            return;
        }
        class61.field866 = var4.field906 * var5.field935 + var4.field937 * var5.field936 + var4.field925 * var5.field925;
        class658.field9163 = var4.field906 * var5.field927 + var4.field937 * var5.field914 + var4.field925 * var5.field921 + var4.field921;
        float var14 = (float) this.field9267 * class61.field866 + class658.field9163;
        float var15 = (float) this.field9213 * class61.field866 + class658.field9163;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) this.field9254 + var14) * (float) this.field9222.field6857;
            var16 = ((float) (-this.field9254) + var15) * (float) this.field9222.field6857;
        } else {
            var16 = (var14 - (float) this.field9254) * (float) this.field9222.field6857;
            var17 = ((float) this.field9254 + var15) * (float) this.field9222.field6857;
        }
        if ((var16 / var9 >= this.field9222.field6916) || (this.field9222.field6824 >= var17 / var9)) {
            return;
        }
        if (arg1 != null || this.field9303 != null) {
            class209.field2765 = var4.field906 * var5.field913 + var4.field937 * var5.field916 + var4.field925 * var5.field906;
            class125.field1795 = var4.field913 * var5.field905 + var4.field935 * var5.field937 + var4.field905 * var5.field915;
            class694.field9648 = var4.field916 * var5.field913 + var4.field936 * var5.field906 + var4.field915 * var5.field916;
            class619.field8536 = var4.field913 * var5.field913 + var4.field935 * var5.field906 + var4.field905 * var5.field916;
            class171.field2367 = var4.field916 * var5.field905 + var4.field936 * var5.field937 + var4.field915 * var5.field915;
            class122.field1763 = var4.field906 * var5.field905 + var4.field937 * var5.field915 + var4.field925 * var5.field937;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field9260 + this.field9241 >> 1;
            int var21 = this.field9290 + this.field9323 >> 1;
            int var22 = (int) ((float) var21 * class694.field9648 + (float) this.field9267 * class686.field9557 + (float) var20 * class171.field2367 + class737.field10235);
            int var23 = (int) ((float) var21 * class209.field2765 + (float) this.field9267 * class61.field866 + (float) var20 * class122.field1763 + class658.field9163);
            int var24 = (int) ((float) var21 * class619.field8536 + (float) this.field9267 * class331.field4225 + (float) var20 * class125.field1795 + class723.field10055);
            if (this.field9222.field6855 > var24) {
                var18 = true;
            } else {
                arg1.field4098 = this.field9222.field6857 * var23 / var24 + this.field9222.field6877;
                arg1.field4102 = this.field9222.field6820 * var22 / var24 + this.field9222.field6921;
            }
            int var25 = (int) ((float) var21 * class694.field9648 + (float) this.field9213 * class686.field9557 + (float) var20 * class171.field2367 + class737.field10235);
            int var26 = (int) ((float) var21 * class209.field2765 + (float) this.field9213 * class61.field866 + (float) var20 * class122.field1763 + class658.field9163);
            int var27 = (int) ((float) var21 * class619.field8536 + (float) this.field9213 * class331.field4225 + (float) var20 * class125.field1795 + class723.field10055);
            if (var27 < this.field9222.field6855) {
                var18 = true;
            } else {
                arg1.field4101 = this.field9222.field6921 + (this.field9222.field6820 * var25 / var27);
                arg1.field4100 = this.field9222.field6857 * var26 / var27 + this.field9222.field6877;
            }
            if (var18) {
                if (var24 < this.field9222.field6855 && var27 < this.field9222.field6855) {
                    var19 = false;
                } else if (var24 < this.field9222.field6855) {
                    int var28 = (var27 - this.field9222.field6855 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    arg1.field4102 = this.field9222.field6921 + (this.field9222.field6820 * var29 / this.field9222.field6855);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field4098 = this.field9222.field6857 * var30 / this.field9222.field6855 + this.field9222.field6877;
                } else if (var27 < this.field9222.field6855) {
                    int var31 = (var24 - this.field9222.field6855 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field4102 = this.field9222.field6921 + (this.field9222.field6820 * var32 / this.field9222.field6855);
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field4098 = this.field9222.field6877 + (this.field9222.field6857 * var33 / this.field9222.field6855);
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field4103 = (this.field9254 + var22) * this.field9222.field6820 / var24 + this.field9222.field6921 - arg1.field4102;
                } else {
                    arg1.field4103 = (var25 + this.field9254) * this.field9222.field6820 / var27 + this.field9222.field6921 - arg1.field4101;
                }
                arg1.field4099 = true;
            }
        }
        this.field9222.method2784(-9);
        this.field9222.method2826(false, var5);
        this.method3734((byte) -85);
        this.field9222.method2839(-20411);
        this.method3736(-68);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I[IIIIIZ)V", line = 1545)
    public final void method292(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field9315++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            class525.field7332 = 0;
            class331.field4228 = 0;
            class754.field10528 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field9247.length > var14) {
                    int[] var15 = this.field9247[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class754.field10528 += this.field9204[var17];
                        class331.field4228 += this.field9236[var17];
                        var12++;
                        class525.field7332 += this.field9284[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class525.field7332 = var11;
                class331.field4228 = var9;
                class754.field10528 = var10;
            } else {
                class754.field10528 = class754.field10528 / var12 + var10;
                class331.field4228 = class331.field4228 / var12 + var9;
                class525.field7332 = class525.field7332 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field9247.length) {
                    int[] var23 = this.field9247[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field9204[var25] += var20;
                        this.field9236[var25] += var18;
                        this.field9284[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field9247.length > var45) {
                    int[] var46 = this.field9247[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field9204[var48] -= class754.field10528;
                            this.field9236[var48] -= class331.field4228;
                            this.field9284[var48] -= class525.field7332;
                            if (arg4 != 0) {
                                int var49 = class16.field320[arg4];
                                int var50 = class16.field322[arg4];
                                int var51 = this.field9236[var48] * var49 + this.field9204[var48] * var50 + 16383 >> 14;
                                this.field9236[var48] = this.field9236[var48] * var50 + 16383 - this.field9204[var48] * var49 >> 14;
                                this.field9204[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class16.field320[arg2];
                                int var53 = class16.field322[arg2];
                                int var54 = this.field9236[var48] * var53 - (this.field9284[var48] * var52 - 16383) >> 14;
                                this.field9284[var48] = this.field9236[var48] * var52 + (this.field9284[var48] * var53) + 16383 >> 14;
                                this.field9236[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class16.field320[arg3];
                                int var56 = class16.field322[arg3];
                                int var57 = this.field9284[var48] * var55 + this.field9204[var48] * var56 + 16383 >> 14;
                                this.field9284[var48] = this.field9284[var48] * var56 + 16383 - (this.field9204[var48] * var55) >> 14;
                                this.field9204[var48] = var57;
                            }
                            this.field9204[var48] += class754.field10528;
                            this.field9236[var48] += class331.field4228;
                            this.field9284[var48] += class525.field7332;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field9204[var59] -= class754.field10528;
                            this.field9236[var59] -= class331.field4228;
                            this.field9284[var59] -= class525.field7332;
                            if (arg2 != 0) {
                                int var60 = class16.field320[arg2];
                                int var61 = class16.field322[arg2];
                                int var62 = this.field9236[var59] * var61 + 16383 - (this.field9284[var59] * var60) >> 14;
                                this.field9284[var59] = this.field9236[var59] * var60 + (this.field9284[var59] * var61) + 16383 >> 14;
                                this.field9236[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class16.field320[arg4];
                                int var64 = class16.field322[arg4];
                                int var65 = this.field9236[var59] * var63 + this.field9204[var59] * var64 + 16383 >> 14;
                                this.field9236[var59] = this.field9236[var59] * var64 + 16383 - (this.field9204[var59] * var63) >> 14;
                                this.field9204[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class16.field320[arg3];
                                int var67 = class16.field322[arg3];
                                int var68 = this.field9284[var59] * var66 + this.field9204[var59] * var67 + 16383 >> 14;
                                this.field9284[var59] = this.field9284[var59] * var67 + 16383 - (this.field9204[var59] * var66) >> 14;
                                this.field9204[var59] = var68;
                            }
                            this.field9204[var59] += class754.field10528;
                            this.field9236[var59] += class331.field4228;
                            this.field9284[var59] += class525.field7332;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field9247.length > var28) {
                        int[] var29 = this.field9247[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field9274[var31];
                            int var33 = this.field9274[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field9262[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class16.field320[arg4];
                                    int var37 = class16.field322[arg4];
                                    int var38 = this.field9256[var35] * var36 + (this.field9210[var35] * var37) + 16383 >> 14;
                                    this.field9256[var35] = (short) (this.field9256[var35] * var37 + 16383 - (this.field9210[var35] * var36) >> 14);
                                    this.field9210[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class16.field320[arg2];
                                    int var40 = class16.field322[arg2];
                                    int var41 = this.field9256[var35] * var40 + 16383 - (this.field9271[var35] * var39) >> 14;
                                    this.field9271[var35] = (short) (this.field9271[var35] * var40 + this.field9256[var35] * var39 + 16383 >> 14);
                                    this.field9256[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class16.field320[arg3];
                                    int var43 = class16.field322[arg3];
                                    int var44 = this.field9271[var35] * var42 + (this.field9210[var35] * var43) + 16383 >> 14;
                                    this.field9271[var35] = (short) (this.field9271[var35] * var43 + (16383 - (this.field9210[var35] * var42)) >> 14);
                                    this.field9210[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field9325 == null && this.field9202 != null) {
                    this.field9202.field8106 = null;
                }
                if (this.field9325 != null) {
                    this.field9325.field8106 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field9247.length > var70) {
                    int[] var71 = this.field9247[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field9204[var73] -= class754.field10528;
                        this.field9236[var73] -= class331.field4228;
                        this.field9284[var73] -= class525.field7332;
                        this.field9204[var73] = this.field9204[var73] * arg2 >> 7;
                        this.field9236[var73] = this.field9236[var73] * arg3 >> 7;
                        this.field9284[var73] = this.field9284[var73] * arg4 >> 7;
                        this.field9204[var73] += class754.field10528;
                        this.field9236[var73] += class331.field4228;
                        this.field9284[var73] += class525.field7332;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9225 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field9225.length > var78) {
                        int[] var79 = this.field9225[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field9223[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field9223[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field9202 != null) {
                            this.field9202.field8106 = null;
                        }
                    }
                }
                if (this.field9303 != null) {
                    for (int var75 = 0; var75 < this.field9235; var75++) {
                        class438 var76 = this.field9303[var75];
                        class212 var77 = this.field9289[var75];
                        var77.field2795 = 255 - (this.field9223[var76.field5842] & 0xFF) << 24 | var77.field2795 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field9225 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field9225.length > var87) {
                        int[] var88 = this.field9225[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field9279[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3DC) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = arg2 + var92 & 0x3F;
                            int var97 = arg4 + var94;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field9279[var90] = (short) class683.method3840(class683.method3840(var96 << 10, var95 << 7), var97);
                        }
                        if (var88.length > 0 && this.field9202 != null) {
                            this.field9202.field8106 = null;
                        }
                    }
                }
                if (this.field9303 != null) {
                    for (int var84 = 0; var84 < this.field9235; var84++) {
                        class438 var85 = this.field9303[var84];
                        class212 var86 = this.field9289[var84];
                        var86.field2795 = class267.field3365[this.field9279[var85.field5842] & 0xFFFF] & 0xFFFFFF | var86.field2795 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field9221 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field9221.length > var99) {
                        int[] var100 = this.field9221[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class212 var102 = this.field9289[var100[var101]];
                            var102.field2798 += arg2;
                            var102.field2806 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9221 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field9221.length) {
                        int[] var105 = this.field9221[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class212 var107 = this.field9289[var105[var106]];
                            var107.field2801 = var107.field2801 * arg2 >> 7;
                            var107.field2796 = var107.field2796 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9221 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field9221.length) {
                    int[] var110 = this.field9221[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class212 var112 = this.field9289[var110[var111]];
                        var112.field2802 = var112.field2802 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "()Z", line = 2199)
    public final boolean method287() {
        field9304++;
        return this.field9253;
    }

    @OriginalMember(owner = "client!lw", name = "da", descriptor = "()I", line = 2210)
    public final int method279() {
        field9329++;
        return this.field9231;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IJLlga;IFZFIII)S", line = 2220)
    private final short method3725(int arg0, long arg1, class714 arg2, int arg3, float arg4, boolean arg5, float arg6, int arg7, int arg8, int arg9) {
        field9226++;
        int var12 = this.field9274[arg9];
        int var13 = this.field9274[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field9262[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class471.field6316[var15] == arg1) {
                return (short) (var16 - 1);
            }
        }
        this.field9262[var14] = (short) (this.field9261 + 1);
        if (!arg5) {
            return -95;
        }
        class471.field6316[var14] = arg1;
        this.field9210[this.field9261] = (short) arg8;
        this.field9256[this.field9261] = (short) arg3;
        this.field9271[this.field9261] = (short) arg7;
        this.field9265[this.field9261] = (byte) arg0;
        this.field9258[this.field9261] = arg6;
        this.field9219[this.field9261] = arg4;
        return (short) (this.field9261++);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BIZ)Lka;", line = 2264)
    public final class474 method273(byte arg0, int arg1, boolean arg2) {
        field9288++;
        class662 var4;
        class662 var5;
        if (arg0 == 1) {
            var4 = this.field9222.field6912;
            var5 = this.field9222.field6897;
        } else if (arg0 == 2) {
            var4 = this.field9222.field6839;
            var5 = this.field9222.field6869;
        } else if (arg0 == 3) {
            var4 = this.field9222.field6887;
            var5 = this.field9222.field6913;
        } else if (arg0 == 4) {
            var4 = this.field9222.field6817;
            var5 = this.field9222.field6865;
        } else if (arg0 == 5) {
            var4 = this.field9222.field6891;
            var5 = this.field9222.field6900;
        } else {
            var4 = var5 = new class662(this.field9222);
        }
        return this.method3737(var4, var5, arg0 != 0, arg1, 86, arg2);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lka;IIIZ)V", line = 2312)
    public final void method241(class474 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9272++;
        class662 var6 = (class662) arg0;
        if (this.field9234 == 0 || var6.field9234 == 0) {
            return;
        }
        int var7 = var6.field9291;
        int[] var8 = var6.field9204;
        int[] var9 = var6.field9236;
        int[] var10 = var6.field9284;
        short[] var11 = var6.field9210;
        short[] var12 = var6.field9256;
        short[] var13 = var6.field9271;
        byte[] var14 = var6.field9265;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field9233 == null) {
            var16 = null;
            var17 = null;
            var18 = null;
            var15 = null;
        } else {
            var15 = this.field9233.field10161;
            var16 = this.field9233.field10155;
            var17 = this.field9233.field10157;
            var18 = this.field9233.field10162;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field9233 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field9233.field10157;
            var22 = var6.field9233.field10161;
            var21 = var6.field9233.field10162;
            var20 = var6.field9233.field10155;
        }
        int[] var23 = var6.field9274;
        short[] var24 = var6.field9262;
        if (!var6.field9273) {
            var6.method3729(8192);
        }
        short var25 = var6.field9267;
        short var26 = var6.field9213;
        short var27 = var6.field9260;
        short var28 = var6.field9241;
        short var29 = var6.field9290;
        short var30 = var6.field9323;
        for (int var31 = 0; var31 < this.field9291; var31++) {
            int var32 = this.field9236[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field9204[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field9284[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field9274[var31];
                        int var37 = this.field9274[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field9262[var38] - 1;
                            if (var35 == -1 || this.field9265[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39 + 1];
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var41; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var17 == null) {
                                            this.field9233 = new class730();
                                            var17 = this.field9233.field10157 = class306.method1842(0, this.field9210);
                                            var15 = this.field9233.field10161 = class306.method1842(0, this.field9256);
                                            var16 = this.field9233.field10155 = class306.method1842(0, this.field9271);
                                            var18 = this.field9233.field10162 = class70.method632(115, this.field9265);
                                        }
                                        if (var19 == null) {
                                            class730 var44 = var6.field9233 = new class730();
                                            var19 = var44.field10157 = class306.method1842(0, var11);
                                            var22 = var44.field10161 = class306.method1842(0, var12);
                                            var20 = var44.field10155 = class306.method1842(0, var13);
                                            var21 = var44.field10162 = class70.method632(-70, var14);
                                        }
                                        short var45 = this.field9210[var35];
                                        short var46 = this.field9256[var35];
                                        short var47 = this.field9271[var35];
                                        byte var48 = this.field9265[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field9274[var31 + 1];
                                        byte var54 = var14[var40];
                                        int var55 = this.field9274[var31];
                                        short var56 = var12[var40];
                                        short var57 = var13[var40];
                                        short var58 = var11[var40];
                                        for (int var59 = var55; var59 < var53; var59++) {
                                            int var60 = this.field9262[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var17[var60] += var58;
                                                var15[var60] += var56;
                                                var16[var60] += var57;
                                                var18[var60] += var54;
                                            }
                                        }
                                        if (this.field9325 == null && this.field9202 != null) {
                                            this.field9202.field8106 = null;
                                        }
                                        if (this.field9325 != null) {
                                            this.field9325.field8106 = null;
                                        }
                                        if (var6.field9325 == null && var6.field9202 != null) {
                                            var6.field9202.field8106 = null;
                                        }
                                        if (var6.field9325 != null) {
                                            var6.field9325.field8106 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "(III)V", line = 2579)
    public final void method281(int arg0, int arg1, int arg2) {
        field9302++;
        for (int var4 = 0; var4 < this.field9291; var4++) {
            if (arg0 != 0) {
                this.field9204[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field9236[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field9284[var4] += arg2;
            }
        }
        this.field9273 = false;
        if (this.field9246 != null) {
            this.field9246.field8106 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V", line = 2611)
    public static void method3726(byte arg0) {
        field9316 = null;
        field9281 = null;
        if (arg0 >= -93) {
            field9317 = 45;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lpda;IZ)V", line = 2622)
    public final void method254(class631 arg0, int arg1, boolean arg2) {
        field9230++;
        if (this.field9324 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field9291; var5++) {
            if ((this.field9324[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method599(this.field9204[var5], this.field9236[var5], this.field9284[var5], var4);
                } else {
                    arg0.method606(this.field9204[var5], this.field9236[var5], this.field9284[var5], var4);
                }
                this.field9204[var5] = var4[0];
                this.field9236[var5] = var4[1];
                this.field9284[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "WA", descriptor = "()I", line = 2657)
    public final int method284() {
        field9249++;
        return this.field9209;
    }

    @OriginalMember(owner = "client!lw", name = "LA", descriptor = "(I)V", line = 2665)
    public final void method265(int arg0) {
        if (this.field9202 != null) {
            this.field9202.field8106 = null;
        }
        field9228++;
        this.field9231 = (short) arg0;
        if (this.field9325 != null) {
            this.field9325.field8106 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "FA", descriptor = "(I)V", line = 2685)
    public final void method257(int arg0) {
        field9264++;
        int var2 = class16.field320[arg0];
        int var3 = class16.field322[arg0];
        for (int var4 = 0; var4 < this.field9291; var4++) {
            int var5 = this.field9236[var4] * var3 - (this.field9284[var4] * var2) >> 14;
            this.field9284[var4] = this.field9284[var4] * var3 + this.field9236[var4] * var2 >> 14;
            this.field9236[var4] = var5;
        }
        if (this.field9246 != null) {
            this.field9246.field8106 = null;
        }
        this.field9273 = false;
    }

    @OriginalMember(owner = "client!lw", name = "fa", descriptor = "()I", line = 2719)
    public final int method286() {
        if (!this.field9273) {
            this.method3729(8192);
        }
        field9214++;
        return this.field9267;
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "()V", line = 2731)
    public final void method247() {
        field9283++;
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)V", line = 2740)
    private final void method3727(byte arg0) {
        field9211++;
        if (!this.field9312) {
            return;
        }
        this.field9312 = false;
        if (this.field9319 == null && this.field9314 == null && this.field9303 == null) {
            if (this.field9204 != null && !class410.method2291((byte) 53, this.field9299, this.field9242)) {
                if (this.field9246 != null && this.field9246.field8106 == null) {
                    this.field9312 = true;
                } else {
                    if (!this.field9273) {
                        this.method3729(8192);
                    }
                    this.field9204 = null;
                }
            }
            if (this.field9236 != null && !class61.method556(this.field9299, arg0 + 56, this.field9242)) {
                if (this.field9246 != null && this.field9246.field8106 == null) {
                    this.field9312 = true;
                } else {
                    if (!this.field9273) {
                        this.method3729(8192);
                    }
                    this.field9236 = null;
                }
            }
            if (this.field9284 != null && !class270.method1604(this.field9242, (byte) 119, this.field9299)) {
                if (this.field9246 != null && this.field9246.field8106 == null) {
                    this.field9312 = true;
                } else {
                    if (!this.field9273) {
                        this.method3729(8192);
                    }
                    this.field9284 = null;
                }
            }
        }
        if (arg0 != 65) {
            this.field9289 = null;
        }
        if (this.field9262 != null && this.field9204 == null && this.field9236 == null && this.field9284 == null) {
            this.field9274 = null;
            this.field9262 = null;
        }
        if (this.field9265 != null && !class222.method1441((byte) -126, this.field9242, this.field9299)) {
            if (this.field9325 == null) {
                if (this.field9202 != null && this.field9202.field8106 == null) {
                    this.field9312 = true;
                } else {
                    this.field9210 = this.field9256 = this.field9271 = null;
                    this.field9265 = null;
                }
            } else if (this.field9325.field8106 == null) {
                this.field9312 = true;
            } else {
                this.field9210 = this.field9256 = this.field9271 = null;
                this.field9265 = null;
            }
        }
        if (this.field9279 != null && !class86.method711(this.field9242, -30379, this.field9299)) {
            if (this.field9202 != null && this.field9202.field8106 == null) {
                this.field9312 = true;
            } else {
                this.field9279 = null;
            }
        }
        if (this.field9223 != null && !class742.method4135(this.field9242, (byte) -122, this.field9299)) {
            if (this.field9202 != null && this.field9202.field8106 == null) {
                this.field9312 = true;
            } else {
                this.field9223 = null;
            }
        }
        if (this.field9258 != null && !class594.method3369(this.field9242, 8, this.field9299)) {
            if (this.field9270 != null && this.field9270.field8106 == null) {
                this.field9312 = true;
            } else {
                this.field9258 = this.field9219 = null;
            }
        }
        if (this.field9252 != null && !class269.method1602(this.field9299, (byte) 121, this.field9242)) {
            if (this.field9202 != null && this.field9202.field8106 == null) {
                this.field9312 = true;
            } else {
                this.field9252 = null;
            }
        }
        if (this.field9268 != null && !class425.method2442(arg0 + 3439, this.field9299, this.field9242)) {
            if ((this.field9321 == null || this.field9321.field4260 != null) && (this.field9202 == null || this.field9202.field8106 != null)) {
                this.field9268 = this.field9297 = this.field9269 = null;
            } else {
                this.field9312 = true;
            }
        }
        if (this.field9225 != null && !class405.method2266(arg0 ^ 0x331, this.field9299, this.field9242)) {
            this.field9225 = null;
            this.field9282 = null;
        }
        if (this.field9247 != null && !class4.method24((byte) 18, this.field9299, this.field9242)) {
            this.field9324 = null;
            this.field9247 = null;
        }
        if (this.field9221 != null && !class223.method1444(this.field9299, arg0 ^ 0x58, this.field9242)) {
            this.field9221 = null;
        }
        if (this.field9294 != null && (this.field9242 & 0x800) == 0 && (this.field9242 & 0x40000) == 0) {
            this.field9294 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "ia", descriptor = "(SS)V", line = 2919)
    public final void method251(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field9234; var3++) {
            if (this.field9279[var3] == arg0) {
                this.field9279[var3] = arg1;
            }
        }
        field9224++;
        if (this.field9303 != null) {
            for (int var4 = 0; var4 < this.field9235; var4++) {
                class438 var5 = this.field9303[var4];
                class212 var6 = this.field9289[var4];
                var6.field2795 = class267.field3365[this.field9279[var5.field5842] & 0xFFFF] & 0xFFFFFF | var6.field2795 & 0xFF000000;
            }
        }
        if (this.field9202 != null) {
            this.field9202.field8106 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "ma", descriptor = "()I", line = 2960)
    public final int method248() {
        field9243++;
        if (!this.field9273) {
            this.method3729(8192);
        }
        return this.field9285;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZLuu;)V", line = 2973)
    private final void method3728(boolean arg0, class289 arg1) {
        if (this.field9261 > this.field9222.field6925.length) {
            this.field9222.field6927 = new int[this.field9261];
            this.field9222.field6925 = new int[this.field9261];
        }
        field9237++;
        if (!arg0) {
            this.method279();
        }
        int[] var3 = this.field9222.field6925;
        int[] var4 = this.field9222.field6927;
        for (int var5 = 0; var5 < this.field9291; var5++) {
            int var16 = (this.field9204[var5] - (this.field9236[var5] * this.field9222.field6886 >> 8) >> this.field9222.field6775) - arg1.field3792;
            int var17 = (this.field9284[var5] - (this.field9236[var5] * this.field9222.field6834 >> 8) >> this.field9222.field6775) - arg1.field3790;
            int var18 = this.field9274[var5];
            int var19 = this.field9274[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field9262[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field9229; var6++) {
            if (this.field9223 == null || this.field9223[var6] <= 128) {
                short var7 = this.field9268[var6];
                short var8 = this.field9297[var6];
                short var9 = this.field9269[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method1730(var11, var12, var14, false, var15, var10, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "ba", descriptor = "(Lr;)Lr;", line = 3062)
    public final class185 method289(class185 arg0) {
        field9298++;
        if (this.field9261 == 0) {
            return null;
        }
        if (!this.field9273) {
            this.method3729(8192);
        }
        int var2;
        int var3;
        if (this.field9222.field6886 <= 0) {
            var2 = this.field9260 - (this.field9222.field6886 * this.field9267 >> 8) >> this.field9222.field6775;
            var3 = this.field9241 - (this.field9222.field6886 * this.field9213 >> 8) >> this.field9222.field6775;
        } else {
            var2 = this.field9260 - (this.field9222.field6886 * this.field9213 >> 8) >> this.field9222.field6775;
            var3 = this.field9241 - (this.field9222.field6886 * this.field9267 >> 8) >> this.field9222.field6775;
        }
        int var4;
        int var5;
        if (this.field9222.field6834 > 0) {
            var4 = this.field9290 - (this.field9222.field6834 * this.field9213 >> 8) >> this.field9222.field6775;
            var5 = this.field9323 - (this.field9222.field6834 * this.field9267 >> 8) >> this.field9222.field6775;
        } else {
            var4 = this.field9290 - (this.field9222.field6834 * this.field9267 >> 8) >> this.field9222.field6775;
            var5 = this.field9323 - (this.field9222.field6834 * this.field9213 >> 8) >> this.field9222.field6775;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class289 var8 = (class289) arg0;
        class289 var9;
        if (var8 != null && var8.method1733(var6, -2679, var7)) {
            var9 = var8;
            var8.method1731((byte) 107);
        } else {
            var9 = new class289(this.field9222, var6, var7);
        }
        var9.method1734(17655, var3, var4, var2, var5);
        this.method3728(true, var9);
        return var9;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lbi;)V", line = 5951)
    public class662(class483 arg0) {
        this.field9222 = arg0;
        this.field9246 = new class578(null, 5126, 3, 0);
        this.field9270 = new class578(null, 5126, 2, 0);
        this.field9325 = new class578(null, 5126, 3, 0);
        this.field9202 = new class578(null, 5121, 4, 0);
        this.field9321 = new class336();
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lbi;Llga;IIII)V", line = 5963)
    public class662(class483 arg0, class714 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9299 = arg5;
        this.field9242 = arg2;
        this.field9222 = arg0;
        if (class597.method3383(arg5, 7, arg2)) {
            this.field9246 = new class578(null, 5126, 3, 0);
        }
        if (class257.method1561(arg2, arg5, -82)) {
            this.field9270 = new class578(null, 5126, 2, 0);
        }
        if (class212.method1360(6410, arg2, arg5)) {
            this.field9325 = new class578(null, 5126, 3, 0);
        }
        if (class278.method1640(arg2, arg5, -2933)) {
            this.field9202 = new class578(null, 5121, 4, 0);
        }
        if (class323.method1893(true, arg5, arg2)) {
            this.field9321 = new class336();
        }
        class153 var7 = arg0.field830;
        this.field9274 = new int[arg1.field9935 + 1];
        int[] var8 = new int[arg1.field9925];
        for (int var9 = 0; var9 < arg1.field9925; var9++) {
            if (arg1.field9911 == null || arg1.field9911[var9] != 2) {
                if (arg1.field9909 != null && arg1.field9909[var9] != -1) {
                    class537 var173 = var7.method1072(arg1.field9909[var9] & 0xFFFF, true);
                    if (((this.field9299 & 0x40) == 0 || !var173.field7456) && var173.field7457) {
                        continue;
                    }
                }
                var8[this.field9234++] = var9;
                this.field9274[arg1.field9919[var9]]++;
                this.field9274[arg1.field9945[var9]]++;
                this.field9274[arg1.field9932[var9]]++;
            }
        }
        this.field9229 = this.field9234;
        long[] var10 = new long[this.field9234];
        boolean var11 = (this.field9242 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field9234; var12++) {
            int var156 = var8[var12];
            class537 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field9913 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field9913.length; var163++) {
                    class104 var164 = arg1.field9913[var163];
                    if (var164.field1428 == var156) {
                        class25 var165 = class124.method942(10698, var164.field1430);
                        if (var165.field457) {
                            var162 = true;
                        }
                        if (var165.field454 != -1) {
                            class537 var166 = var7.method1072(var165.field454, true);
                            if (var166.field7450 == 2) {
                                this.field9253 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field9229--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field9909 != null) {
                var167 = arg1.field9909[var156];
                if (var167 != -1) {
                    var157 = var7.method1072(var167 & 0xFFFF, true);
                    if ((this.field9299 & 0x40) != 0 && var157.field7456) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        var160 = var157.field7443;
                        var161 = var157.field7449;
                        if (var157.field7441 != 0 || var157.field7444 != 0) {
                            this.field9328 = true;
                        }
                    }
                }
            }
            boolean var168 = arg1.field9955 != null && arg1.field9955[var156] != 0 || var157 != null && var157.field7450 != 0;
            if ((var11 || var168) && arg1.field9937 != null) {
                var158 += arg1.field9937[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + (long) var172;
            this.field9328 |= var157 != null && (var157.field7441 != 0 || var157.field7444 != 0);
            this.field9253 |= var168;
        }
        class638.method3579(var10, var8, (byte) -59);
        this.field9284 = arg1.field9917;
        this.field9204 = arg1.field9923;
        this.field9291 = arg1.field9935;
        this.field9236 = arg1.field9950;
        this.field9207 = arg1.field9948;
        this.field9324 = arg1.field9922;
        this.field9319 = arg1.field9941;
        class538[] var13 = new class538[this.field9291];
        this.field9314 = arg1.field9943;
        if (arg1.field9913 != null) {
            this.field9235 = arg1.field9913.length;
            this.field9303 = new class438[this.field9235];
            this.field9289 = new class212[this.field9235];
            for (int var14 = 0; var14 < this.field9235; var14++) {
                class104 var15 = arg1.field9913[var14];
                class25 var16 = class124.method942(10698, var15.field1430);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field9234; var18++) {
                    if (var8[var18] == var15.field1428) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class267.field3365[arg1.field9939[var15.field1428] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field9955 == null ? 0 : arg1.field9955[var15.field1428]) << 24;
                this.field9303[var14] = new class438(var17, arg1.field9919[var15.field1428], arg1.field9945[var15.field1428], arg1.field9932[var15.field1428], var16.field460, var16.field465, var16.field454, var16.field452, var16.field455, var16.field457, var16.field450, var15.field1424);
                this.field9289[var14] = new class212(var20);
            }
        }
        int var21 = this.field9234 * 3;
        this.field9256 = new short[var21];
        this.field9210 = new short[var21];
        this.field9297 = new short[this.field9234];
        this.field9271 = new short[var21];
        this.field9223 = new byte[this.field9234];
        this.field9209 = (short) arg3;
        this.field9219 = new float[var21];
        this.field9265 = new byte[var21];
        this.field9258 = new float[var21];
        this.field9252 = new short[this.field9234];
        this.field9231 = (short) arg4;
        this.field9268 = new short[this.field9234];
        if (arg1.field9934 != null) {
            this.field9282 = new short[this.field9234];
        }
        this.field9279 = new short[this.field9234];
        class471.field6316 = new long[var21];
        this.field9269 = new short[this.field9234];
        this.field9262 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field9935; var23++) {
            int var155 = this.field9274[var23];
            this.field9274[var23] = var22;
            var22 += var155;
            var13[var23] = new class538();
        }
        this.field9274[arg1.field9935] = var22;
        class555 var24 = class653.method3661(-3, this.field9234, var8, arg1);
        class448[] var25 = new class448[arg1.field9925];
        for (int var26 = 0; var26 < arg1.field9925; var26++) {
            short var134 = arg1.field9919[var26];
            short var135 = arg1.field9945[var26];
            short var136 = arg1.field9932[var26];
            int var137 = this.field9204[var135] - this.field9204[var134];
            int var138 = this.field9236[var135] - this.field9236[var134];
            int var139 = this.field9284[var135] - this.field9284[var134];
            int var140 = this.field9204[var136] - this.field9204[var134];
            int var141 = this.field9236[var136] - this.field9236[var134];
            int var142 = this.field9284[var136] - this.field9284[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - var138 * var140;
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var145 >>= 0x1;
                var143 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var145 * var145 + var143 * var143 + var144 * var144));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var145 * 256 / var146;
            int var149 = var143 * 256 / var146;
            byte var150 = arg1.field9911 == null ? 0 : arg1.field9911[var26];
            if (var150 == 0) {
                class538 var151 = var13[var134];
                var151.field7467 += var148;
                var151.field7465 += var147;
                var151.field7463 += var149;
                var151.field7469++;
                class538 var152 = var13[var135];
                var152.field7467 += var148;
                var152.field7465 += var147;
                var152.field7463 += var149;
                var152.field7469++;
                class538 var153 = var13[var136];
                var153.field7469++;
                var153.field7465 += var147;
                var153.field7463 += var149;
                var153.field7467 += var148;
            } else if (var150 == 1) {
                class448 var154 = var25[var26] = new class448();
                var154.field5943 = var149;
                var154.field5939 = var147;
                var154.field5941 = var148;
            }
        }
        for (int var27 = 0; var27 < this.field9234; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field9939[var43] & 0xFFFF;
            int var45;
            if (arg1.field9951 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field9951[var43];
            }
            int var46;
            if (arg1.field9955 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field9955[var43] & 0xFF;
            }
            short var47 = arg1.field9909 == null ? -1 : arg1.field9909[var43];
            if (var47 != -1 && (this.field9299 & 0x40) != 0) {
                class537 var48 = var7.method1072(var47 & 0xFFFF, true);
                if (var48.field7456) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var52 = 1.0F;
                    var51 = 1.0F;
                    var49 = 0.0F;
                    var50 = 1.0F;
                    var54 = 0.0F;
                    var55 = 1;
                    var53 = 0.0F;
                    var56 = 2;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field9936[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field9919[var43];
                        short var88 = arg1.field9945[var43];
                        short var89 = arg1.field9932[var43];
                        short var90 = arg1.field9947[var45];
                        short var91 = arg1.field9915[var45];
                        short var92 = arg1.field9938[var45];
                        float var93 = (float) arg1.field9923[var90];
                        float var94 = (float) arg1.field9950[var90];
                        float var95 = (float) arg1.field9917[var90];
                        float var96 = (float) arg1.field9923[var91] - var93;
                        float var97 = (float) arg1.field9950[var91] - var94;
                        float var98 = (float) arg1.field9917[var91] - var95;
                        float var99 = (float) arg1.field9923[var92] - var93;
                        float var100 = (float) arg1.field9950[var92] - var94;
                        float var101 = (float) arg1.field9917[var92] - var95;
                        float var102 = (float) arg1.field9923[var87] - var93;
                        float var103 = (float) arg1.field9950[var87] - var94;
                        float var104 = (float) arg1.field9917[var87] - var95;
                        float var105 = (float) arg1.field9923[var88] - var93;
                        float var106 = (float) arg1.field9950[var88] - var94;
                        float var107 = (float) arg1.field9917[var88] - var95;
                        float var108 = (float) arg1.field9923[var89] - var93;
                        float var109 = (float) arg1.field9950[var89] - var94;
                        float var110 = (float) arg1.field9917[var89] - var95;
                        float var111 = var97 * var101 - var98 * var100;
                        float var112 = var98 * var99 - (var96 * var101);
                        float var113 = var96 * var100 - (var97 * var99);
                        float var114 = var100 * var113 - (var101 * var112);
                        float var115 = var101 * var111 - var99 * var113;
                        float var116 = var99 * var112 - (var100 * var111);
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        float var118 = var98 * var111 - var96 * var113;
                        float var119 = var96 * var112 - var97 * var111;
                        float var120 = var97 * var113 - var98 * var112;
                        float var121 = 1.0F / (var101 * var119 + var99 * var120 + var100 * var118);
                        var52 = (var107 * var119 + var105 * var120 + var106 * var118) * var121;
                        var50 = (var104 * var119 + var102 * var120 + var103 * var118) * var121;
                        var54 = (var110 * var119 + var108 * var120 + var109 * var118) * var121;
                    } else {
                        short var59 = arg1.field9919[var43];
                        short var60 = arg1.field9945[var43];
                        short var61 = arg1.field9932[var43];
                        int var62 = var24.field7721[var45];
                        int var63 = var24.field7727[var45];
                        int var64 = var24.field7722[var45];
                        float[] var65 = var24.field7723[var45];
                        byte var66 = arg1.field9928[var45];
                        float var67 = (float) arg1.field9942[var45] / 256.0F;
                        if (var58 == 1) {
                            float var85 = (float) arg1.field9926[var45] / 1024.0F;
                            class347.method2025(96, var63, var85, var65, class257.field3267, arg1.field9923[var59], arg1.field9950[var59], var64, var62, arg1.field9917[var59], var66, var67);
                            var50 = class257.field3267[1];
                            var49 = class257.field3267[0];
                            class347.method2025(93, var63, var85, var65, class257.field3267, arg1.field9923[var60], arg1.field9950[var60], var64, var62, arg1.field9917[var60], var66, var67);
                            var52 = class257.field3267[1];
                            var51 = class257.field3267[0];
                            class347.method2025(69, var63, var85, var65, class257.field3267, arg1.field9923[var61], arg1.field9950[var61], var64, var62, arg1.field9917[var61], var66, var67);
                            var53 = class257.field3267[0];
                            var54 = class257.field3267[1];
                            float var86 = var85 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if (var86 < var51 - var49) {
                                    var55 = 1;
                                    var51 -= var85;
                                } else if (var86 < var49 - var51) {
                                    var55 = 2;
                                    var51 += var85;
                                }
                                if ((var86 < var53 - var49)) {
                                    var53 -= var85;
                                    var56 = 1;
                                } else if (var49 - var53 > var86) {
                                    var56 = 2;
                                    var53 += var85;
                                }
                            } else {
                                if ((var86 < var52 - var50)) {
                                    var55 = 1;
                                    var52 -= var85;
                                } else if (var50 - var52 > var86) {
                                    var52 += var85;
                                    var55 = 2;
                                }
                                if (var86 < var54 - var50) {
                                    var54 -= var85;
                                    var56 = 1;
                                } else if (var86 < var50 - var54) {
                                    var56 = 2;
                                    var54 += var85;
                                }
                            }
                        } else if (var58 == 2) {
                            float var68 = (float) arg1.field9956[var45] / 256.0F;
                            float var69 = (float) arg1.field9933[var45] / 256.0F;
                            int var70 = arg1.field9923[var60] - arg1.field9923[var59];
                            int var71 = arg1.field9950[var60] - arg1.field9950[var59];
                            int var72 = arg1.field9917[var60] - arg1.field9917[var59];
                            int var73 = arg1.field9923[var61] - arg1.field9923[var59];
                            int var74 = arg1.field9950[var61] - arg1.field9950[var59];
                            int var75 = arg1.field9917[var61] - arg1.field9917[var59];
                            int var76 = var71 * var75 - var72 * var74;
                            int var77 = var72 * var73 - var70 * var75;
                            int var78 = var70 * var74 - var71 * var73;
                            float var79 = 64.0F / (float) arg1.field9949[var45];
                            float var80 = 64.0F / (float) arg1.field9959[var45];
                            float var81 = 64.0F / (float) arg1.field9926[var45];
                            float var82 = (var65[2] * (float) var78 + var65[1] * (float) var77 + var65[0] * (float) var76) / var79;
                            float var83 = (var65[5] * (float) var78 + var65[3] * (float) var76 + var65[4] * (float) var77) / var80;
                            float var84 = (var65[8] * (float) var78 + var65[7] * (float) var77 + var65[6] * (float) var76) / var81;
                            var57 = class381.method2172((byte) 88, var84, var83, var82);
                            class755.method4198(var62, var63, var67, var66, arg1.field9917[var59], arg1.field9923[var59], var68, (byte) -111, var64, var65, arg1.field9950[var59], var69, var57, class257.field3267);
                            var49 = class257.field3267[0];
                            var50 = class257.field3267[1];
                            class755.method4198(var62, var63, var67, var66, arg1.field9917[var60], arg1.field9923[var60], var68, (byte) -114, var64, var65, arg1.field9950[var60], var69, var57, class257.field3267);
                            var52 = class257.field3267[1];
                            var51 = class257.field3267[0];
                            class755.method4198(var62, var63, var67, var66, arg1.field9917[var61], arg1.field9923[var61], var68, (byte) -106, var64, var65, arg1.field9950[var61], var69, var57, class257.field3267);
                            var53 = class257.field3267[0];
                            var54 = class257.field3267[1];
                        } else if (var58 == 3) {
                            class55.method409(arg1.field9917[var59], var66, var65, arg1.field9950[var59], 1, var64, var67, class257.field3267, arg1.field9923[var59], var63, var62);
                            var50 = class257.field3267[1];
                            var49 = class257.field3267[0];
                            class55.method409(arg1.field9917[var60], var66, var65, arg1.field9950[var60], 1, var64, var67, class257.field3267, arg1.field9923[var60], var63, var62);
                            var52 = class257.field3267[1];
                            var51 = class257.field3267[0];
                            class55.method409(arg1.field9917[var61], var66, var65, arg1.field9950[var61], 1, var64, var67, class257.field3267, arg1.field9923[var61], var63, var62);
                            var53 = class257.field3267[0];
                            var54 = class257.field3267[1];
                            if ((var66 & 0x1) == 0) {
                                if (var53 - var49 > 0.5F) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                                if ((var51 - var49 > 0.5F)) {
                                    var51--;
                                    var55 = 1;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                                if ((var52 - var50 > 0.5F)) {
                                    var52--;
                                    var55 = 1;
                                } else if (var50 - var52 > 0.5F) {
                                    var55 = 2;
                                    var52++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field9911 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field9911[var43];
            }
            if (var122 == 0) {
                long var126 = ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32) + (long) (var45 << 2);
                short var128 = arg1.field9919[var43];
                short var129 = arg1.field9945[var43];
                short var130 = arg1.field9932[var43];
                class538 var131 = var13[var128];
                this.field9268[var27] = this.method3725(var131.field7469, var126, arg1, var131.field7465, var50, true, var49, var131.field7467, var131.field7463, var128);
                class538 var132 = var13[var129];
                this.field9297[var27] = this.method3725(var132.field7469, (long) var55 + var126, arg1, var132.field7465, var52, true, var51, var132.field7467, var132.field7463, var129);
                class538 var133 = var13[var130];
                this.field9269[var27] = this.method3725(var133.field7469, (long) var56 + var126, arg1, var133.field7465, var54, true, var53, var133.field7467, var133.field7463, var130);
            } else if (var122 == 1) {
                class448 var123 = var25[var43];
                long var124 = ((long) (var57 << 24) + (long) var46 + ((long) (var44 << 8)) << 32) + (long) ((var123.field5941 + 256 << 22) + (var123.field5939 + 256 << 12) + (var123.field5943 <= 0 ? 2048 : 1024) + (var45 << 2));
                this.field9268[var27] = this.method3725(0, var124, arg1, var123.field5939, var50, true, var49, var123.field5941, var123.field5943, arg1.field9919[var43]);
                this.field9297[var27] = this.method3725(0, (long) var55 + var124, arg1, var123.field5939, var52, true, var51, var123.field5941, var123.field5943, arg1.field9945[var43]);
                this.field9269[var27] = this.method3725(0, (long) var56 + var124, arg1, var123.field5939, var54, true, var53, var123.field5941, var123.field5943, arg1.field9932[var43]);
            }
            if (arg1.field9955 != null) {
                this.field9223[var27] = arg1.field9955[var43];
            }
            if (arg1.field9934 != null) {
                this.field9282[var27] = arg1.field9934[var43];
            }
            this.field9279[var27] = arg1.field9939[var43];
            this.field9252[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field9229; var30++) {
            short var42 = this.field9252[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field9294 = new int[var28 + 1];
        short var31 = -10000;
        int var32 = 0;
        for (int var33 = 0; var33 < this.field9229; var33++) {
            short var41 = this.field9252[var33];
            if (var31 != var41) {
                this.field9294[var32++] = var33;
                var31 = var41;
            }
        }
        this.field9294[var32] = this.field9229;
        class471.field6316 = null;
        this.field9210 = class299.method1790(this.field9210, (byte) 119, this.field9261);
        this.field9256 = class299.method1790(this.field9256, (byte) 94, this.field9261);
        this.field9271 = class299.method1790(this.field9271, (byte) 96, this.field9261);
        this.field9265 = class732.method4084((byte) -101, this.field9261, this.field9265);
        this.field9258 = class142.method1031(this.field9258, this.field9261, 0);
        this.field9219 = class142.method1031(this.field9219, this.field9261, 0);
        if (arg1.field9918 != null && class4.method24((byte) 23, this.field9299, arg2)) {
            this.field9247 = arg1.method3996(false, -90);
        }
        if (arg1.field9913 != null && class223.method1444(this.field9299, 25, arg2)) {
            this.field9221 = arg1.method3993(26582);
        }
        if (arg1.field9958 != null && class405.method2266(880, this.field9299, arg2)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field9234; var36++) {
                int var40 = arg1.field9958[var8[var36]];
                if (var40 >= 0) {
                    if (var34 < var40) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field9225 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field9225[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field9234; var38++) {
                int var39 = arg1.field9958[var8[var38]];
                if (var39 >= 0) {
                    this.field9225[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "(I)V", line = 3133)
    public final void method262(int arg0) {
        field9203++;
        this.field9209 = (short) arg0;
        if (this.field9202 != null) {
            this.field9202.field8106 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "(IIII)V", line = 3147)
    public final void method267(int arg0, int arg1, int arg2, int arg3) {
        field9313++;
        if (arg0 == 0) {
            class754.field10528 = 0;
            class525.field7332 = 0;
            class331.field4228 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field9291; var6++) {
                class754.field10528 += this.field9204[var6];
                class331.field4228 += this.field9236[var6];
                class525.field7332 += this.field9284[var6];
                var5++;
            }
            if (var5 <= 0) {
                class525.field7332 = arg3;
                class754.field10528 = arg1;
                class331.field4228 = arg2;
            } else {
                class331.field4228 = class331.field4228 / var5 + arg2;
                class754.field10528 = class754.field10528 / var5 + arg1;
                class525.field7332 = class525.field7332 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field9291; var7++) {
                this.field9204[var7] += arg1;
                this.field9236[var7] += arg2;
                this.field9284[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field9291; var8++) {
                this.field9204[var8] -= class754.field10528;
                this.field9236[var8] -= class331.field4228;
                this.field9284[var8] -= class525.field7332;
                if (arg3 != 0) {
                    int var9 = class16.field320[arg3];
                    int var10 = class16.field322[arg3];
                    int var11 = this.field9236[var8] * var9 + this.field9204[var8] * var10 + 16383 >> 14;
                    this.field9236[var8] = this.field9236[var8] * var10 + 16383 - (this.field9204[var8] * var9) >> 14;
                    this.field9204[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class16.field320[arg1];
                    int var13 = class16.field322[arg1];
                    int var14 = this.field9236[var8] * var13 + 16383 - this.field9284[var8] * var12 >> 14;
                    this.field9284[var8] = this.field9284[var8] * var13 + this.field9236[var8] * var12 + 16383 >> 14;
                    this.field9236[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class16.field320[arg2];
                    int var16 = class16.field322[arg2];
                    int var17 = this.field9284[var8] * var15 + this.field9204[var8] * var16 + 16383 >> 14;
                    this.field9284[var8] = this.field9284[var8] * var16 + 16383 - (this.field9204[var8] * var15) >> 14;
                    this.field9204[var8] = var17;
                }
                this.field9204[var8] += class754.field10528;
                this.field9236[var8] += class331.field4228;
                this.field9284[var8] += class525.field7332;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field9291; var18++) {
                this.field9204[var18] -= class754.field10528;
                this.field9236[var18] -= class331.field4228;
                this.field9284[var18] -= class525.field7332;
                this.field9204[var18] = this.field9204[var18] * arg1 / 128;
                this.field9236[var18] = this.field9236[var18] * arg2 / 128;
                this.field9284[var18] = this.field9284[var18] * arg3 / 128;
                this.field9204[var18] += class754.field10528;
                this.field9236[var18] += class331.field4228;
                this.field9284[var18] += class525.field7332;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field9234; var19++) {
                int var23 = (this.field9223[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field9223[var19] = (byte) var23;
            }
            if (this.field9202 != null) {
                this.field9202.field8106 = null;
            }
            if (this.field9303 != null) {
                for (int var20 = 0; var20 < this.field9235; var20++) {
                    class438 var21 = this.field9303[var20];
                    class212 var22 = this.field9289[var20];
                    var22.field2795 = var22.field2795 & 0xFFFFFF | 255 - (this.field9223[var21.field5842] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field9234; var24++) {
                int var28 = this.field9279[var24] & 0xFFFF;
                int var29 = (var28 & 0xFCD0) >> 10;
                int var30 = (var28 & 0x3A4) >> 7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field9279[var24] = (short) class683.method3840(var34, class683.method3840(var33 << 7, var31 << 10));
            }
            if (this.field9202 != null) {
                this.field9202.field8106 = null;
            }
            if (this.field9303 != null) {
                for (int var25 = 0; var25 < this.field9235; var25++) {
                    class438 var26 = this.field9303[var25];
                    class212 var27 = this.field9289[var25];
                    var27.field2795 = var27.field2795 & 0xFF000000 | class267.field3365[this.field9279[var26.field5842] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field9235; var35++) {
                class212 var36 = this.field9289[var35];
                var36.field2798 += arg1;
                var36.field2806 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field9235; var37++) {
                class212 var38 = this.field9289[var37];
                var38.field2801 = var38.field2801 * arg1 >> 7;
                var38.field2796 = var38.field2796 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field9235; var39++) {
                class212 var40 = this.field9289[var39];
                var40.field2802 = var40.field2802 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "(I[IIIIZI[I)V", line = 3461)
    public final void method290(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field9205++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class525.field7332 = 0;
            class331.field4228 = 0;
            class754.field10528 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field9247.length > var15) {
                    int[] var16 = this.field9247[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field9324 == null || (arg6 & this.field9324[var18]) != 0) {
                            class754.field10528 += this.field9204[var18];
                            class331.field4228 += this.field9236[var18];
                            var13++;
                            class525.field7332 += this.field9284[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class754.field10528 = class754.field10528 / var13 + var11;
                class331.field4228 = class331.field4228 / var13 + var10;
                class268.field3376 = true;
                class525.field7332 = class525.field7332 / var13 + var12;
            } else {
                class754.field10528 = var11;
                class331.field4228 = var10;
                class525.field7332 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + (arg7[2] * arg4) + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[7] * arg3 + (arg7[6] * arg2 + (arg7[8] * arg4)) + 8192 >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field9247.length > var26) {
                    int[] var27 = this.field9247[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field9324 == null || (arg6 & this.field9324[var29]) != 0) {
                            this.field9204[var29] += var24;
                            this.field9236[var29] += var23;
                            this.field9284[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field9247.length > var109) {
                        int[] var110 = this.field9247[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field9324 == null || (this.field9324[var112] & arg6) != 0) {
                                this.field9204[var112] -= class754.field10528;
                                this.field9236[var112] -= class331.field4228;
                                this.field9284[var112] -= class525.field7332;
                                if (arg4 != 0) {
                                    int var113 = class16.field320[arg4];
                                    int var114 = class16.field322[arg4];
                                    int var115 = this.field9236[var112] * var113 + this.field9204[var112] * var114 + 16383 >> 14;
                                    this.field9236[var112] = this.field9236[var112] * var114 + 16383 - (this.field9204[var112] * var113) >> 14;
                                    this.field9204[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class16.field320[arg2];
                                    int var117 = class16.field322[arg2];
                                    int var118 = this.field9236[var112] * var117 + 16383 - (this.field9284[var112] * var116) >> 14;
                                    this.field9284[var112] = this.field9284[var112] * var117 + this.field9236[var112] * var116 + 16383 >> 14;
                                    this.field9236[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class16.field320[arg3];
                                    int var120 = class16.field322[arg3];
                                    int var121 = this.field9284[var112] * var119 + this.field9204[var112] * var120 + 16383 >> 14;
                                    this.field9284[var112] = this.field9284[var112] * var120 + 16383 - (this.field9204[var112] * var119) >> 14;
                                    this.field9204[var112] = var121;
                                }
                                this.field9204[var112] += class754.field10528;
                                this.field9236[var112] += class331.field4228;
                                this.field9284[var112] += class525.field7332;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field9247.length > var92) {
                            int[] var93 = this.field9247[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field9324 == null || (arg6 & this.field9324[var95]) != 0) {
                                    int var96 = this.field9274[var95];
                                    int var97 = this.field9274[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field9262[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class16.field320[arg4];
                                            int var101 = class16.field322[arg4];
                                            int var102 = this.field9256[var99] * var100 + (this.field9210[var99] * var101) + 16383 >> 14;
                                            this.field9256[var99] = (short) (this.field9256[var99] * var101 + 16383 - (this.field9210[var99] * var100) >> 14);
                                            this.field9210[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class16.field320[arg2];
                                            int var104 = class16.field322[arg2];
                                            int var105 = this.field9256[var99] * var104 + 16383 - (this.field9271[var99] * var103) >> 14;
                                            this.field9271[var99] = (short) (this.field9271[var99] * var104 + this.field9256[var99] * var103 + 16383 >> 14);
                                            this.field9256[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class16.field320[arg3];
                                            int var107 = class16.field322[arg3];
                                            int var108 = this.field9271[var99] * var106 + this.field9210[var99] * var107 + 16383 >> 14;
                                            this.field9271[var99] = (short) (this.field9271[var99] * var107 + 16383 - (this.field9210[var99] * var106) >> 14);
                                            this.field9210[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field9325 == null && this.field9202 != null) {
                        this.field9202.field8106 = null;
                    }
                    if (this.field9325 != null) {
                        this.field9325.field8106 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class268.field3376) {
                    int var36 = arg7[0] * class754.field10528 + (arg7[3] * class331.field4228) + (arg7[6] * class525.field7332 - -8192) >> 14;
                    int var37 = arg7[7] * class525.field7332 + arg7[1] * class754.field10528 + arg7[4] * class331.field4228 + 8192 >> 14;
                    int var38 = var33 + var36;
                    int var39 = arg7[8] * class525.field7332 + arg7[5] * class331.field4228 + arg7[2] * class754.field10528 + 8192 >> 14;
                    int var40 = var34 + var37;
                    class754.field10528 = var38;
                    int var41 = var35 + var39;
                    class331.field4228 = var40;
                    class525.field7332 = var41;
                    class268.field3376 = false;
                }
                int[] var42 = new int[9];
                int var43 = class16.field322[arg2];
                int var44 = class16.field320[arg2];
                int var45 = class16.field322[arg3];
                int var46 = class16.field320[arg3];
                int var47 = class16.field322[arg4];
                int var48 = class16.field320[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[7] = var46 * var48 + var45 * var49 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[5] = -var44;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                int var51 = var42[2] * -class525.field7332 + var42[1] * -class331.field4228 + var42[0] * -class754.field10528 + 8192 >> 14;
                int var52 = var42[5] * -class525.field7332 + var42[3] * -class754.field10528 + var42[4] * -class331.field4228 + 8192 >> 14;
                int var53 = var42[6] * -class754.field10528 + var42[7] * -class331.field4228 + var42[8] * -class525.field7332 + 8192 >> 14;
                int var54 = class754.field10528 + var51;
                int var55 = var52 + class331.field4228;
                int var56 = class525.field7332 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[0] * var33 + (var42[2] * var35) + var42[1] * var34 + 8192 >> 14;
                int var60 = var42[3] * var33 + var42[4] * var34 + var42[5] * var35 + 8192 >> 14;
                int var61 = var55 + var60;
                int var62 = var54 + var59;
                int var63 = var42[8] * var35 + (var42[6] * var33 + (var42[7] * var34)) + 8192 >> 14;
                int var64 = var56 + var63;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += var57[var84 + (var86 * 3)] * arg7[var66 * 3 + var86];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[1] * var61 + (arg7[2] * var64) + arg7[0] * var62 + 8192 >> 14;
                int var68 = arg7[3] * var62 - (-(arg7[4] * var61) - (arg7[5] * var64) - 8192) >> 14;
                int var69 = var31 + var68;
                int var70 = arg7[6] * var62 + arg7[8] * var64 + arg7[7] * var61 + 8192 >> 14;
                int var71 = var30 + var67;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field9247.length > var74) {
                        int[] var75 = this.field9247[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field9324 == null || (this.field9324[var77] & arg6) != 0) {
                                int var78 = this.field9204[var77] * var65[0] + this.field9284[var77] * var65[2] + this.field9236[var77] * var65[1] + 8192 >> 14;
                                int var79 = this.field9284[var77] * var65[5] + this.field9236[var77] * var65[4] + this.field9204[var77] * var65[3] + 8192 >> 14;
                                int var80 = var69 + var79;
                                int var81 = var71 + var78;
                                int var82 = this.field9204[var77] * var65[6] + this.field9284[var77] * var65[8] + this.field9236[var77] * var65[7] + 8192 >> 14;
                                this.field9204[var77] = var81;
                                int var83 = var72 + var82;
                                this.field9236[var77] = var80;
                                this.field9284[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field9247.length) {
                        int[] var124 = this.field9247[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field9324 == null || (this.field9324[var126] & arg6) != 0) {
                                this.field9204[var126] -= class754.field10528;
                                this.field9236[var126] -= class331.field4228;
                                this.field9284[var126] -= class525.field7332;
                                this.field9204[var126] = this.field9204[var126] * arg2 >> 7;
                                this.field9236[var126] = this.field9236[var126] * arg3 >> 7;
                                this.field9284[var126] = this.field9284[var126] * arg4 >> 7;
                                this.field9204[var126] += class754.field10528;
                                this.field9236[var126] += class331.field4228;
                                this.field9284[var126] += class525.field7332;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class268.field3376) {
                    int var133 = arg7[0] * class754.field10528 + (arg7[3] * class331.field4228) + (arg7[6] * class525.field7332) + 8192 >> 14;
                    int var134 = arg7[4] * class331.field4228 + arg7[1] * class754.field10528 + (arg7[7] * class525.field7332) + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[2] * class754.field10528 + (arg7[5] * class331.field4228 - (-(arg7[8] * class525.field7332) - 8192)) >> 14;
                    int var137 = var131 + var134;
                    int var138 = var132 + var136;
                    class754.field10528 = var135;
                    class331.field4228 = var137;
                    class525.field7332 = var138;
                    class268.field3376 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class754.field10528 * var139 + 8192 >> 14;
                int var143 = -class331.field4228 * var140 + 8192 >> 14;
                int var144 = -class525.field7332 * var141 + 8192 >> 14;
                int var145 = class754.field10528 + var142;
                int var146 = var143 + class331.field4228;
                int var147 = class525.field7332 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var132 * var141 + 8192 >> 14;
                int var153 = var145 + var149;
                int var154 = var147 + var152;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[0] * var153 + (arg7[1] * var151) + (arg7[2] * var154) + 8192 >> 14;
                int var158 = arg7[5] * var154 + arg7[3] * var153 + arg7[4] * var151 + 8192 >> 14;
                int var159 = var128 + var158;
                int var160 = var127 + var157;
                int var161 = arg7[8] * var154 + (arg7[6] * var153 + (arg7[7] * var151) + 8192) >> 14;
                int var162 = var129 + var161;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field9247.length) {
                        int[] var165 = this.field9247[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field9324 == null || (this.field9324[var167] & arg6) != 0) {
                                int var168 = this.field9236[var167] * var155[1] + (this.field9204[var167] * var155[0] - (-(this.field9284[var167] * var155[2]) - 8192)) >> 14;
                                int var169 = this.field9284[var167] * var155[5] + this.field9236[var167] * var155[4] + this.field9204[var167] * var155[3] + 8192 >> 14;
                                int var170 = this.field9204[var167] * var155[6] + 8192 - (-(this.field9236[var167] * var155[7]) - this.field9284[var167] * var155[8]) >> 14;
                                int var171 = var160 + var168;
                                int var172 = var159 + var169;
                                int var173 = var162 + var170;
                                this.field9204[var167] = var171;
                                this.field9236[var167] = var172;
                                this.field9284[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9225 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field9225.length > var181) {
                        int[] var182 = this.field9225[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field9282 == null || (arg6 & this.field9282[var184]) != 0) {
                                int var185 = (this.field9223[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field9223[var184] = (byte) var185;
                                if (this.field9202 != null) {
                                    this.field9202.field8106 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field9303 != null) {
                    for (int var178 = 0; var178 < this.field9235; var178++) {
                        class438 var179 = this.field9303[var178];
                        class212 var180 = this.field9289[var178];
                        var180.field2795 = 255 - (this.field9223[var179.field5842] & 0xFF) << 24 | var180.field2795 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field9225 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field9225.length > var190) {
                        int[] var191 = this.field9225[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field9282 == null || (this.field9282[var193] & arg6) != 0) {
                                int var194 = this.field9279[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFDE3) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var195 + arg2 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field9279[var193] = (short) class683.method3840(class683.method3840(var198 << 7, var197 << 10), var200);
                                if (this.field9202 != null) {
                                    this.field9202.field8106 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field9303 != null) {
                    for (int var187 = 0; var187 < this.field9235; var187++) {
                        class438 var188 = this.field9303[var187];
                        class212 var189 = this.field9289[var187];
                        var189.field2795 = var189.field2795 & 0xFF000000 | class267.field3365[this.field9279[var188.field5842] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field9221 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field9221.length) {
                        int[] var203 = this.field9221[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class212 var205 = this.field9289[var203[var204]];
                            var205.field2806 += arg3;
                            var205.field2798 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9221 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field9221.length > var207) {
                        int[] var208 = this.field9221[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class212 var210 = this.field9289[var208[var209]];
                            var210.field2796 = var210.field2796 * arg3 >> 7;
                            var210.field2801 = var210.field2801 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9221 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field9221.length) {
                    int[] var213 = this.field9221[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class212 var215 = this.field9289[var213[var214]];
                        var215.field2802 = var215.field2802 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "()[Lhv;", line = 4446)
    public final class521[] method253() {
        field9309++;
        return this.field9314;
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(I)V", line = 4454)
    private final void method3729(int arg0) {
        field9308++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        if (arg0 != 8192) {
            this.method3723(91, true);
        }
        for (int var10 = 0; var10 < this.field9291; var10++) {
            int var11 = this.field9204[var10];
            int var12 = this.field9236[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field9284[var10];
            if (var7 < var13) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field9267 = (short) var3;
        this.field9213 = (short) var6;
        this.field9323 = (short) var7;
        this.field9260 = (short) var2;
        this.field9290 = (short) var4;
        this.field9241 = (short) var5;
        this.field9254 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field9285 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field9273 = true;
    }

    @OriginalMember(owner = "client!lw", name = "EA", descriptor = "()I", line = 4537)
    public final int method280() {
        if (!this.field9273) {
            this.method3729(8192);
        }
        field9208++;
        return this.field9213;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILsl;)Lih;", line = 4550)
    public static final class702 method3730(int arg0, class461 arg1) {
        field9250++;
        if (arg0 != -1437) {
            method3732(-95, 36);
        }
        class452 var2 = class649.method3640(arg1, 1);
        int var3 = arg1.method2622(-539564808);
        int var4 = arg1.method2622(-539564808);
        return new class702(var2.field5981, var2.field5979, var2.field5983, var2.field5985, var2.field5988, var2.field5978, var2.field5987, var2.field5980, var2.field5976, var3, var4);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBI)V", line = 4573)
    public static final void method3731(int arg0, byte arg1, int arg2) {
        if (class73.field1021 < class73.field1028) {
            class73.field1021 = (float) ((double) class73.field1021 / 30.0D + (double) class73.field1021);
            if (class73.field1021 > class73.field1028) {
                class73.field1021 = class73.field1028;
            }
            class358.method2080(-128);
            class73.field1027 = (int) class73.field1021 >> 1;
            class73.field1024 = class312.method1863(class73.field1027, (byte) -1);
        } else if (class73.field1028 < class73.field1021) {
            class73.field1021 = (float) ((double) class73.field1021 - (double) class73.field1021 / 30.0D);
            if (class73.field1028 > class73.field1021) {
                class73.field1021 = class73.field1028;
            }
            class358.method2080(-120);
            class73.field1027 = (int) class73.field1021 >> 1;
            class73.field1024 = class312.method1863(class73.field1027, (byte) -1);
        }
        field9306++;
        if (class108.field1561 != -1 && class557.field7751 != -1) {
            int var3 = class108.field1561 - class756.field10543;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class557.field7751 - class687.field9571;
            class756.field10543 -= -var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (var3 == 0 && var4 == 0) {
                class557.field7751 = -1;
                class108.field1561 = -1;
            }
            class687.field9571 += var4;
            class358.method2080(-114);
        }
        if (arg1 < 21) {
            method3732(66, 62);
        }
        if (class35.field563 > 0) {
            class601.field8362--;
            if (class601.field8362 == 0) {
                class601.field8362 = 100;
                class35.field563--;
            }
        } else {
            class389.field4973 = -1;
            class136.field1950 = -1;
        }
        if (!class184.field2557 || class537.field7459 == null) {
            return;
        }
        for (class586 var5 = (class586) class537.field7459.method3672(-1); var5 != null; var5 = (class586) class537.field7459.method3662(-1)) {
            class278 var6 = class73.field1015.method3085((byte) -122, var5.field8189.field4349);
            if (var5.method3332(arg2, (byte) -128, arg0)) {
                if (var6.field3524 != null) {
                    if (var6.field3524[4] != null) {
                        class92.method740((long) var5.field8189.field4349, (long) var5.field8189.field4349, false, true, var6.field3537, -1, -1, 1004, 0, var6.field3524[4], false, var6.field3503, false);
                    }
                    if (var6.field3524[3] != null) {
                        class92.method740((long) var5.field8189.field4349, (long) var5.field8189.field4349, false, true, var6.field3537, -1, -1, 1010, 0, var6.field3524[3], false, var6.field3503, false);
                    }
                    if (var6.field3524[2] != null) {
                        class92.method740((long) var5.field8189.field4349, (long) var5.field8189.field4349, false, true, var6.field3537, -1, -1, 1006, 0, var6.field3524[2], false, var6.field3503, false);
                    }
                    if (var6.field3524[1] != null) {
                        class92.method740((long) var5.field8189.field4349, (long) var5.field8189.field4349, false, true, var6.field3537, -1, -1, 1012, 0, var6.field3524[1], false, var6.field3503, false);
                    }
                    if (var6.field3524[0] != null) {
                        class92.method740((long) var5.field8189.field4349, (long) var5.field8189.field4349, false, true, var6.field3537, -1, -1, 1011, 0, var6.field3524[0], false, var6.field3503, false);
                    }
                }
                if (!var5.field8189.field4344) {
                    var5.field8189.field4344 = true;
                    class188.method1273(class400.field5092, var5.field8189.field4349, var6.field3503);
                }
                if (var5.field8189.field4344) {
                    class188.method1273(class99.field1372, var5.field8189.field4349, var6.field3503);
                }
            } else if (var5.field8189.field4344) {
                var5.field8189.field4344 = false;
                class188.method1273(class68.field966, var5.field8189.field4349, var6.field3503);
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "()V", line = 4713)
    public final void method243() {
        field9227++;
        if (this.field9261 <= 0 || this.field9229 <= 0) {
            return;
        }
        this.method3723(-6961, false);
        if ((this.field9286 & 0x10) == 0 && this.field9321.field4260 == null) {
            this.method3721(false, 0);
        }
        this.method3727((byte) 65);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lpda;)V", line = 4736)
    public final void method271(class631 arg0) {
        field9244++;
        class65 var2 = (class65) arg0;
        if (this.field9319 != null) {
            for (int var3 = 0; var3 < this.field9319.length; var3++) {
                class569 var4 = this.field9319[var3];
                class569 var5 = var4;
                if (var4.field8008 != null) {
                    var5 = var4.field8008;
                }
                var5.field8014 = (int) ((float) this.field9284[var4.field8009] * var2.field916 + (float) this.field9236[var4.field8009] * var2.field936 + (float) this.field9204[var4.field8009] * var2.field915 + var2.field914);
                var5.field8013 = (int) ((float) this.field9284[var4.field8009] * var2.field906 + (float) this.field9236[var4.field8009] * var2.field925 + (float) this.field9204[var4.field8009] * var2.field937 + var2.field921);
                var5.field8012 = (int) ((float) this.field9284[var4.field8009] * var2.field913 + (float) this.field9236[var4.field8009] * var2.field935 + (float) this.field9204[var4.field8009] * var2.field905 + var2.field927);
                var5.field8020 = (int) ((float) this.field9284[var4.field8017] * var2.field916 + (float) this.field9236[var4.field8017] * var2.field936 + (float) this.field9204[var4.field8017] * var2.field915 + var2.field914);
                var5.field8015 = (int) ((float) this.field9284[var4.field8017] * var2.field906 + (float) this.field9236[var4.field8017] * var2.field925 + (float) this.field9204[var4.field8017] * var2.field937 + var2.field921);
                var5.field8003 = (int) ((float) this.field9284[var4.field8017] * var2.field913 + (float) this.field9236[var4.field8017] * var2.field935 + (float) this.field9204[var4.field8017] * var2.field905 + var2.field927);
                var5.field8018 = (int) ((float) this.field9284[var4.field8006] * var2.field916 + (float) this.field9236[var4.field8006] * var2.field936 + (float) this.field9204[var4.field8006] * var2.field915 + var2.field914);
                var5.field8019 = (int) ((float) this.field9284[var4.field8006] * var2.field906 + (float) this.field9236[var4.field8006] * var2.field925 + (float) this.field9204[var4.field8006] * var2.field937 + var2.field921);
                var5.field8007 = (int) ((float) this.field9284[var4.field8006] * var2.field913 + (float) this.field9236[var4.field8006] * var2.field935 + (float) this.field9204[var4.field8006] * var2.field905 + var2.field927);
            }
        }
        if (this.field9314 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field9314.length; var6++) {
            class521 var7 = this.field9314[var6];
            class521 var8 = var7;
            if (var7.field7310 != null) {
                var8 = var7.field7310;
            }
            if (var7.field7300 == null) {
                var7.field7300 = var2.method611();
            } else {
                var7.field7300.method604(var2);
            }
            var8.field7305 = (int) ((float) this.field9284[var7.field7303] * var2.field916 + (float) this.field9236[var7.field7303] * var2.field936 + (float) this.field9204[var7.field7303] * var2.field915 + var2.field914);
            var8.field7306 = (int) ((float) this.field9284[var7.field7303] * var2.field906 + (float) this.field9236[var7.field7303] * var2.field925 + (float) this.field9204[var7.field7303] * var2.field937 + var2.field921);
            var8.field7299 = (int) ((float) this.field9284[var7.field7303] * var2.field913 + (float) this.field9236[var7.field7303] * var2.field935 + (float) this.field9204[var7.field7303] * var2.field905 + var2.field927);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V", line = 4802)
    public final void method260(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field9234; var5++) {
            int var9 = this.field9279[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field9279[var5] = (short) class683.method3840(var12, class683.method3840(var11 << 7, var10 << 10));
        }
        field9220++;
        if (this.field9303 != null) {
            for (int var6 = 0; var6 < this.field9235; var6++) {
                class438 var7 = this.field9303[var6];
                class212 var8 = this.field9289[var6];
                var8.field2795 = class267.field3365[this.field9279[var7.field5842] & 0xFFFF] & 0xFFFFFF | var8.field2795 & 0xFF000000;
            }
        }
        if (this.field9202 != null) {
            this.field9202.field8106 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILpda;ZI)Z", line = 4860)
    public final boolean method258(int arg0, int arg1, class631 arg2, boolean arg3, int arg4) {
        field9263++;
        return this.method3733((byte) -62, arg3, arg4, -1, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Z", line = 4870)
    public static final boolean method3732(int arg0, int arg1) {
        field9293++;
        if (arg1 == 15110) {
            return arg0 == 0 || arg0 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BZIILpda;II)Z", line = 4881)
    private final boolean method3733(byte arg0, boolean arg1, int arg2, int arg3, class631 arg4, int arg5, int arg6) {
        field9266++;
        class65 var8 = (class65) arg4;
        class65 var9 = this.field9222.field6806;
        float var10 = var8.field927 * var9.field916 + var8.field921 * var9.field936 + var8.field914 * var9.field915 + var9.field914;
        float var11 = var8.field927 * var9.field906 + var8.field921 * var9.field925 + var8.field914 * var9.field937 + var9.field921;
        class619.field8536 = var8.field913 * var9.field913 + var8.field916 * var9.field905 + var8.field906 * var9.field935;
        class331.field4225 = var8.field935 * var9.field913 + var8.field936 * var9.field905 + var8.field925 * var9.field935;
        class694.field9648 = var8.field913 * var9.field916 + var8.field916 * var9.field915 + var8.field906 * var9.field936;
        class125.field1795 = var8.field905 * var9.field913 + var8.field937 * var9.field935 + var8.field915 * var9.field905;
        class171.field2367 = var8.field905 * var9.field916 + var8.field937 * var9.field936 + var8.field915 * var9.field915;
        class686.field9557 = var8.field935 * var9.field916 + var8.field936 * var9.field915 + var8.field925 * var9.field936;
        float var12 = var8.field927 * var9.field913 + var8.field921 * var9.field935 + var8.field914 * var9.field905 + var9.field927;
        class61.field866 = var8.field935 * var9.field906 + var8.field936 * var9.field937 + var8.field925 * var9.field925;
        class122.field1763 = var8.field905 * var9.field906 + var8.field937 * var9.field925 + var8.field915 * var9.field937;
        class209.field2765 = var8.field913 * var9.field906 + var8.field916 * var9.field937 + var8.field906 * var9.field925;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field9222.field6820;
        int var19 = this.field9222.field6857;
        if (!this.field9273) {
            this.method3729(8192);
        }
        int var20 = this.field9241 - this.field9260 >> 1;
        int var21 = this.field9213 - this.field9267 >> 1;
        if (arg0 >= -11) {
            return false;
        }
        int var22 = this.field9323 - this.field9290 >> 1;
        int var23 = this.field9260 + var20;
        int var24 = this.field9267 + var21;
        int var25 = this.field9290 + var22;
        int var26 = var23 - (var20 << arg2);
        int var27 = var24 - (var21 << arg2);
        int var28 = var25 - (var22 << arg2);
        int var29 = var23 + (var20 << arg2);
        int var30 = (var21 << arg2) + var24;
        class320.field4131[0] = var26;
        int var31 = (var22 << arg2) + var25;
        class349.field4505[0] = var27;
        class320.field4131[1] = var29;
        class659.field9184[0] = var28;
        class349.field4505[1] = var27;
        class320.field4131[2] = var26;
        class659.field9184[1] = var28;
        class349.field4505[2] = var30;
        class659.field9184[2] = var28;
        class320.field4131[3] = var29;
        class349.field4505[3] = var30;
        class320.field4131[4] = var26;
        class659.field9184[3] = var28;
        class349.field4505[4] = var27;
        class320.field4131[5] = var29;
        class659.field9184[4] = var31;
        class349.field4505[5] = var27;
        class659.field9184[5] = var31;
        class320.field4131[6] = var26;
        class349.field4505[6] = var30;
        class320.field4131[7] = var29;
        class659.field9184[6] = var31;
        class349.field4505[7] = var30;
        class659.field9184[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class320.field4131[var32];
            float var54 = (float) class659.field9184[var32];
            float var55 = (float) class349.field4505[var32];
            float var56 = class619.field8536 * var54 + class331.field4225 * var55 + class125.field1795 * var53 + var12;
            float var57 = class209.field2765 * var54 + class61.field866 * var55 + class122.field1763 * var53 + var11;
            float var58 = class694.field9648 * var54 + class686.field9557 * var55 + class171.field2367 * var53 + var10;
            if (var56 >= (float) this.field9222.field6855) {
                if (arg3 > 0) {
                    var56 = arg3;
                }
                float var59 = (float) var18 * var58 / var56 + (float) this.field9222.field6921;
                if (var14 > var59) {
                    var14 = var59;
                }
                if (var15 < var59) {
                    var15 = var59;
                }
                float var60 = (float) var19 * var57 / var56 + (float) this.field9222.field6877;
                if (var60 < var16) {
                    var16 = var60;
                }
                var13 = true;
                if (var60 > var17) {
                    var17 = var60;
                }
            }
        }
        if (var13 && (float) arg5 > var14 && var15 > (float) arg5 && var16 < (float) arg6 && var17 > (float) arg6) {
            if (arg1) {
                return true;
            }
            if (this.field9261 > this.field9222.field6925.length) {
                this.field9222.field6927 = new int[this.field9261];
                this.field9222.field6925 = new int[this.field9261];
            }
            int[] var33 = this.field9222.field6925;
            int[] var34 = this.field9222.field6927;
            for (int var35 = 0; var35 < this.field9291; var35++) {
                float var37 = (float) this.field9236[var35];
                float var38 = (float) this.field9204[var35];
                float var39 = (float) this.field9284[var35];
                float var40 = class209.field2765 * var39 + class61.field866 * var37 + class122.field1763 * var38 + var11;
                float var41 = class619.field8536 * var39 + class331.field4225 * var37 + class125.field1795 * var38 + var12;
                float var42 = class694.field9648 * var39 + class686.field9557 * var37 + class171.field2367 * var38 + var10;
                if ((var41 >= (float) this.field9222.field6855)) {
                    if (arg3 > 0) {
                        var41 = arg3;
                    }
                    int var47 = (int) ((float) var18 * var42 / var41 + (float) this.field9222.field6921);
                    int var48 = (int) ((float) var19 * var40 / var41 + (float) this.field9222.field6877);
                    int var49 = this.field9274[var35];
                    int var50 = this.field9274[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field9262[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field9274[var35];
                    int var44 = this.field9274[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field9262[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field9262[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field9234; var36++) {
                if (var33[this.field9268[var36]] != -999999 && var33[this.field9297[var36]] != -999999 && var33[this.field9269[var36]] != -999999 && this.method3735(88, var34[this.field9297[var36]], var34[this.field9269[var36]], arg6, arg5, var34[this.field9268[var36]], var33[this.field9269[var36]], var33[this.field9268[var36]], var33[this.field9297[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILpda;ZII)Z", line = 5131)
    public final boolean method275(int arg0, int arg1, class631 arg2, boolean arg3, int arg4, int arg5) {
        field9305++;
        return this.method3733((byte) -64, arg3, arg4, arg5, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!lw", name = "wa", descriptor = "()V", line = 5140)
    public final void method252() {
        for (int var1 = 0; var1 < this.field9207; var1++) {
            this.field9204[var1] = this.field9204[var1] + 7 >> 4;
            this.field9236[var1] = this.field9236[var1] + 7 >> 4;
            this.field9284[var1] = this.field9284[var1] + 7 >> 4;
        }
        field9245++;
        this.field9273 = false;
        if (this.field9246 != null) {
            this.field9246.field8106 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V", line = 5172)
    private final void method3734(byte arg0) {
        if (arg0 > -23) {
            this.method271(null);
        }
        field9217++;
        if (this.field9229 == 0) {
            return;
        }
        if (this.field9286 != 0) {
            this.method3723(-6961, true);
        }
        this.method3723(-6961, false);
        if (this.field9321 != null) {
            if (this.field9321.field4260 == null) {
                this.method3721((this.field9286 & 0x10) != 0, 0);
            }
            if (this.field9321.field4260 != null) {
                this.field9222.method2776(1, this.field9325 != null);
                this.field9222.method2821((byte) -48, this.field9325, this.field9246, this.field9202, this.field9270);
                int var2 = this.field9294.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field9294[var3];
                    int var5 = this.field9294[var3 + 1];
                    int var6 = this.field9252[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field9222.method2812(var6, false, this.field9325 != null);
                    this.field9222.method2854(4, var4 * 3, (var5 - var4) * 3, this.field9321.field4260, (byte) -57);
                }
            }
        }
        this.method3727((byte) 65);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIIIIII)Z", line = 5229)
    private final boolean method3735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9275++;
        if (arg3 < arg5 && arg1 > arg3 && arg3 < arg2) {
            return false;
        } else if (arg5 < arg3 && arg1 < arg3 && arg3 > arg2) {
            return false;
        } else if (arg4 < arg7 && arg4 < arg8 && arg6 > arg4) {
            return false;
        } else if (arg4 > arg7 && arg8 < arg4 && arg6 < arg4) {
            return false;
        } else {
            int var10 = 105 / ((arg0 - 16) / 34);
            return true;
        }
    }

    @OriginalMember(owner = "client!lw", name = "VA", descriptor = "(I)V", line = 5258)
    public final void method276(int arg0) {
        field9239++;
        int var2 = class16.field320[arg0];
        int var3 = class16.field322[arg0];
        for (int var4 = 0; var4 < this.field9291; var4++) {
            int var5 = this.field9236[var4] * var2 + this.field9204[var4] * var3 >> 14;
            this.field9236[var4] = this.field9236[var4] * var3 - (this.field9204[var4] * var2) >> 14;
            this.field9204[var4] = var5;
        }
        if (this.field9246 != null) {
            this.field9246.field8106 = null;
        }
        this.field9273 = false;
    }

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "(I)V", line = 5293)
    public final void method266(int arg0) {
        field9276++;
        this.field9242 = arg0;
        this.field9312 = true;
        if (this.field9233 != null && (this.field9242 & 0x10000) == 0) {
            this.field9210 = this.field9233.field10157;
            this.field9256 = this.field9233.field10161;
            this.field9271 = this.field9233.field10155;
            this.field9265 = this.field9233.field10162;
            this.field9233 = null;
        }
        this.method3727((byte) 65);
    }

    @OriginalMember(owner = "client!lw", name = "NA", descriptor = "()Z", line = 5315)
    public final boolean method278() {
        field9238++;
        if (this.field9247 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field9207; var1++) {
            this.field9204[var1] <<= 0x4;
            this.field9236[var1] <<= 0x4;
            this.field9284[var1] <<= 0x4;
        }
        class754.field10528 = 0;
        class331.field4228 = 0;
        class525.field7332 = 0;
        return true;
    }

    @OriginalMember(owner = "client!lw", name = "HA", descriptor = "()I", line = 5345)
    public final int method269() {
        if (!this.field9273) {
            this.method3729(8192);
        }
        field9310++;
        return this.field9290;
    }

    @OriginalMember(owner = "client!lw", name = "O", descriptor = "(III)V", line = 5357)
    public final void method259(int arg0, int arg1, int arg2) {
        field9232++;
        for (int var4 = 0; var4 < this.field9291; var4++) {
            if (arg0 != 128) {
                this.field9204[var4] = this.field9204[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field9236[var4] = this.field9236[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field9284[var4] = this.field9284[var4] * arg2 >> 7;
            }
        }
        this.field9273 = false;
        if (this.field9246 != null) {
            this.field9246.field8106 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "(I)V", line = 5388)
    private final void method3736(int arg0) {
        int var2 = -2 % ((-arg0 - 25) / 32);
        field9280++;
        if (this.field9303 == null) {
            return;
        }
        class65 var3 = this.field9222.field6773;
        this.field9222.method2819(-95);
        this.field9222.method504(!this.field9253);
        this.field9222.method2776(1, false);
        this.field9222.method2821((byte) -48, null, this.field9222.field6822, null, this.field9222.field6854);
        for (int var4 = 0; var4 < this.field9235; var4++) {
            class438 var5 = this.field9303[var4];
            class212 var6 = this.field9289[var4];
            if (!var5.field5832 || !this.field9222.method442()) {
                float var7 = (float) (this.field9204[var5.field5840] - (-this.field9204[var5.field5841] - this.field9204[var5.field5839])) * 0.3333333F;
                float var8 = (float) (this.field9236[var5.field5840] - (-this.field9236[var5.field5841] - this.field9236[var5.field5839])) * 0.3333333F;
                float var9 = (float) (this.field9284[var5.field5841] + this.field9284[var5.field5840] + this.field9284[var5.field5839]) * 0.3333333F;
                float var10 = class694.field9648 * var9 + class686.field9557 * var8 + class171.field2367 * var7 + class737.field10235;
                float var11 = class209.field2765 * var9 + class61.field866 * var8 + class122.field1763 * var7 + class658.field9163;
                float var12 = class619.field8536 * var9 + class331.field4225 * var8 + class125.field1795 * var7 + class723.field10055;
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var10 * var10 + var11 * var11))) * (float) var5.field5838;
                var3.method591(var12 * var13 - var12, var6.field2802, var11 * var13 + ((float) var6.field2806 - var11), var5.field5830 * var6.field2801 >> 7, var5.field5829 * var6.field2796 >> 7, 16383, (float) var6.field2798 + var10 - var10 * var13);
                this.field9222.method2824(var3, 104);
                int var14 = var6.field2795;
                OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                this.field9222.method2777(var5.field5831, 1);
                this.field9222.method2844(111, var5.field5837);
                this.field9222.method2843(4, 7, (byte) -66, 0);
            }
        }
        this.field9222.method504(true);
        this.field9222.method2839(-20411);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Llw;Llw;ZIIZ)Lka;", line = 5448)
    private final class474 method3737(class662 arg0, class662 arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        arg0.field9234 = this.field9234;
        arg0.field9235 = this.field9235;
        if ((arg3 & 0x100) == 0) {
            arg0.field9253 = this.field9253;
        } else {
            arg0.field9253 = true;
        }
        field9287++;
        arg0.field9207 = this.field9207;
        arg0.field9231 = this.field9231;
        arg0.field9242 = arg3;
        arg0.field9286 = 0;
        arg0.field9229 = this.field9229;
        arg0.field9209 = this.field9209;
        arg0.field9261 = this.field9261;
        arg0.field9328 = this.field9328;
        arg0.field9299 = this.field9299;
        arg0.field9291 = this.field9291;
        boolean var7 = class216.method1407(20308, arg3, this.field9299);
        int var8 = 126 / ((arg4 - 40) / 39);
        boolean var9 = class356.method2068(arg3, (byte) 120, this.field9299);
        boolean var10 = class210.method1352(arg3, this.field9299, (byte) 105);
        boolean var11 = var10 | var9 | var7;
        if (var11) {
            if (!var7) {
                arg0.field9204 = this.field9204;
            } else if (arg1.field9204 == null || arg1.field9204.length < this.field9207) {
                arg0.field9204 = arg1.field9204 = new int[this.field9207];
            } else {
                arg0.field9204 = arg1.field9204;
            }
            if (!var9) {
                arg0.field9236 = this.field9236;
            } else if (arg1.field9236 == null || arg1.field9236.length < this.field9207) {
                arg0.field9236 = arg1.field9236 = new int[this.field9207];
            } else {
                arg0.field9236 = arg1.field9236;
            }
            if (!var10) {
                arg0.field9284 = this.field9284;
            } else if (arg1.field9284 == null || arg1.field9284.length < this.field9207) {
                arg0.field9284 = arg1.field9284 = new int[this.field9207];
            } else {
                arg0.field9284 = arg1.field9284;
            }
            for (int var12 = 0; var12 < this.field9207; var12++) {
                if (var7) {
                    arg0.field9204[var12] = this.field9204[var12];
                }
                if (var9) {
                    arg0.field9236[var12] = this.field9236[var12];
                }
                if (var10) {
                    arg0.field9284[var12] = this.field9284[var12];
                }
            }
        } else {
            arg0.field9236 = this.field9236;
            arg0.field9284 = this.field9284;
            arg0.field9204 = this.field9204;
        }
        if (class92.method736(-126, arg3, this.field9299)) {
            if (arg2) {
                arg0.field9286 = (byte) (arg0.field9286 | 0x1);
            }
            arg0.field9246 = arg1.field9246;
            arg0.field9246.field8106 = this.field9246.field8106;
            arg0.field9246.field8102 = this.field9246.field8102;
        } else if (class597.method3383(this.field9299, 7, arg3)) {
            arg0.field9246 = this.field9246;
        } else {
            arg0.field9246 = null;
        }
        if (class517.method3004(arg3, this.field9299, 9)) {
            if (arg1.field9279 == null || this.field9234 > arg1.field9279.length) {
                arg0.field9279 = arg1.field9279 = new short[this.field9234];
            } else {
                arg0.field9279 = arg1.field9279;
            }
            for (int var13 = 0; var13 < this.field9234; var13++) {
                arg0.field9279[var13] = this.field9279[var13];
            }
        } else {
            arg0.field9279 = this.field9279;
        }
        if (class730.method4072(true, this.field9299, arg3)) {
            if (arg1.field9223 == null || this.field9234 > arg1.field9223.length) {
                arg0.field9223 = arg1.field9223 = new byte[this.field9234];
            } else {
                arg0.field9223 = arg1.field9223;
            }
            for (int var14 = 0; var14 < this.field9234; var14++) {
                arg0.field9223[var14] = this.field9223[var14];
            }
        } else {
            arg0.field9223 = this.field9223;
        }
        if (class688.method3867(arg3, 0, this.field9299)) {
            if (arg2) {
                arg0.field9286 = (byte) (arg0.field9286 | 0x2);
            }
            arg0.field9202 = arg1.field9202;
            arg0.field9202.field8106 = this.field9202.field8106;
            arg0.field9202.field8102 = this.field9202.field8102;
        } else if (class278.method1640(arg3, this.field9299, -2933)) {
            arg0.field9202 = this.field9202;
        } else {
            arg0.field9202 = null;
        }
        if (class374.method2149(1, arg3, this.field9299)) {
            if (arg1.field9210 == null || this.field9261 > arg1.field9210.length) {
                int var15 = this.field9261;
                arg0.field9256 = arg1.field9256 = new short[var15];
                arg0.field9271 = arg1.field9271 = new short[var15];
                arg0.field9210 = arg1.field9210 = new short[var15];
            } else {
                arg0.field9271 = arg1.field9271;
                arg0.field9256 = arg1.field9256;
                arg0.field9210 = arg1.field9210;
            }
            if (this.field9233 == null) {
                for (int var19 = 0; var19 < this.field9261; var19++) {
                    arg0.field9210[var19] = this.field9210[var19];
                    arg0.field9256[var19] = this.field9256[var19];
                    arg0.field9271[var19] = this.field9271[var19];
                }
            } else {
                if (arg1.field9233 == null) {
                    arg1.field9233 = new class730();
                }
                class730 var16 = arg0.field9233 = arg1.field9233;
                if (var16.field10157 == null || this.field9261 > var16.field10157.length) {
                    int var17 = this.field9261;
                    var16.field10155 = new short[var17];
                    var16.field10161 = new short[var17];
                    var16.field10157 = new short[var17];
                    var16.field10162 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field9261; var18++) {
                    arg0.field9210[var18] = this.field9210[var18];
                    arg0.field9256[var18] = this.field9256[var18];
                    arg0.field9271[var18] = this.field9271[var18];
                    var16.field10157[var18] = this.field9233.field10157[var18];
                    var16.field10161[var18] = this.field9233.field10161[var18];
                    var16.field10155[var18] = this.field9233.field10155[var18];
                    var16.field10162[var18] = this.field9233.field10162[var18];
                }
            }
            arg0.field9265 = this.field9265;
        } else {
            arg0.field9265 = this.field9265;
            arg0.field9233 = this.field9233;
            arg0.field9256 = this.field9256;
            arg0.field9271 = this.field9271;
            arg0.field9210 = this.field9210;
        }
        if (class461.method2623(this.field9299, arg3, false)) {
            arg0.field9325 = arg1.field9325;
            if (arg2) {
                arg0.field9286 = (byte) (arg0.field9286 | 0x4);
            }
            arg0.field9325.field8102 = this.field9325.field8102;
            arg0.field9325.field8106 = this.field9325.field8106;
        } else if (class212.method1360(6410, arg3, this.field9299)) {
            arg0.field9325 = this.field9325;
        } else {
            arg0.field9325 = null;
        }
        if (class539.method3093(arg3, 51, this.field9299)) {
            if (arg1.field9258 == null || this.field9234 > arg1.field9258.length) {
                int var20 = this.field9261;
                arg0.field9219 = arg1.field9219 = new float[var20];
                arg0.field9258 = arg1.field9258 = new float[var20];
            } else {
                arg0.field9219 = arg1.field9219;
                arg0.field9258 = arg1.field9258;
            }
            for (int var21 = 0; var21 < this.field9261; var21++) {
                arg0.field9258[var21] = this.field9258[var21];
                arg0.field9219[var21] = this.field9219[var21];
            }
        } else {
            arg0.field9258 = this.field9258;
            arg0.field9219 = this.field9219;
        }
        if (class63.method579(-23611, this.field9299, arg3)) {
            if (arg2) {
                arg0.field9286 = (byte) (arg0.field9286 | 0x8);
            }
            arg0.field9270 = arg1.field9270;
            arg0.field9270.field8106 = this.field9270.field8106;
            arg0.field9270.field8102 = this.field9270.field8102;
        } else if (class257.method1561(arg3, this.field9299, -51)) {
            arg0.field9270 = this.field9270;
        } else {
            arg0.field9270 = null;
        }
        if (class309.method1857(arg3, -29742, this.field9299)) {
            if (arg1.field9268 == null || this.field9234 > arg1.field9268.length) {
                int var22 = this.field9234;
                arg0.field9297 = arg1.field9297 = new short[var22];
                arg0.field9268 = arg1.field9268 = new short[var22];
                arg0.field9269 = arg1.field9269 = new short[var22];
            } else {
                arg0.field9268 = arg1.field9268;
                arg0.field9269 = arg1.field9269;
                arg0.field9297 = arg1.field9297;
            }
            for (int var23 = 0; var23 < this.field9234; var23++) {
                arg0.field9268[var23] = this.field9268[var23];
                arg0.field9297[var23] = this.field9297[var23];
                arg0.field9269[var23] = this.field9269[var23];
            }
        } else {
            arg0.field9297 = this.field9297;
            arg0.field9268 = this.field9268;
            arg0.field9269 = this.field9269;
        }
        if (class319.method1880(arg3, (byte) 80, this.field9299)) {
            arg0.field9321 = arg1.field9321;
            if (arg2) {
                arg0.field9286 = (byte) (arg0.field9286 | 0x10);
            }
            arg0.field9321.field4260 = this.field9321.field4260;
        } else if (class323.method1893(true, this.field9299, arg3)) {
            arg0.field9321 = this.field9321;
        } else {
            arg0.field9321 = null;
        }
        if (class143.method1034(this.field9299, arg3, 82)) {
            if (arg1.field9252 == null || arg1.field9252.length < this.field9234) {
                int var24 = this.field9234;
                arg0.field9252 = arg1.field9252 = new short[var24];
            } else {
                arg0.field9252 = arg1.field9252;
            }
            for (int var25 = 0; var25 < this.field9234; var25++) {
                arg0.field9252[var25] = this.field9252[var25];
            }
        } else {
            arg0.field9252 = this.field9252;
        }
        if (!class345.method1976(arg3, this.field9299, 0)) {
            arg0.field9289 = this.field9289;
        } else if (arg1.field9289 == null || this.field9235 > arg1.field9289.length) {
            int var27 = this.field9235;
            arg0.field9289 = arg1.field9289 = new class212[var27];
            for (int var28 = 0; var28 < this.field9235; var28++) {
                arg0.field9289[var28] = this.field9289[var28].method1366(-6410);
            }
        } else {
            arg0.field9289 = arg1.field9289;
            for (int var26 = 0; var26 < this.field9235; var26++) {
                arg0.field9289[var26].method1363(-31558, this.field9289[var26]);
            }
        }
        if (this.field9273) {
            arg0.field9241 = this.field9241;
            arg0.field9213 = this.field9213;
            arg0.field9290 = this.field9290;
            arg0.field9285 = this.field9285;
            arg0.field9273 = true;
            arg0.field9267 = this.field9267;
            arg0.field9254 = this.field9254;
            arg0.field9260 = this.field9260;
            arg0.field9323 = this.field9323;
        } else {
            arg0.field9273 = false;
        }
        arg0.field9221 = this.field9221;
        arg0.field9247 = this.field9247;
        arg0.field9282 = this.field9282;
        arg0.field9314 = this.field9314;
        arg0.field9262 = this.field9262;
        arg0.field9294 = this.field9294;
        arg0.field9319 = this.field9319;
        arg0.field9274 = this.field9274;
        arg0.field9225 = this.field9225;
        arg0.field9303 = this.field9303;
        arg0.field9324 = this.field9324;
        return arg0;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "()V", line = 5933)
    public final void method282() {
        field9292++;
    }
}
