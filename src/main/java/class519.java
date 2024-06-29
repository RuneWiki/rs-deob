import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class519 extends class497 {

    @OriginalMember(owner = "client!jb", name = "Yb", descriptor = "Z")
    private boolean field7530 = false;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    private int field7533 = 0;

    @OriginalMember(owner = "client!jb", name = "rb", descriptor = "Z")
    private boolean field7521 = false;

    @OriginalMember(owner = "client!jb", name = "lb", descriptor = "Z")
    private boolean field7512 = true;

    @OriginalMember(owner = "client!jb", name = "wb", descriptor = "I")
    private int field7538 = 0;

    @OriginalMember(owner = "client!jb", name = "ec", descriptor = "Z")
    private boolean field7577 = false;

    @OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
    private int field7536 = 0;

    @OriginalMember(owner = "client!jb", name = "Eb", descriptor = "I")
    private int field7582 = 0;

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "I")
    private int field7499 = 0;

    @OriginalMember(owner = "client!jb", name = "nb", descriptor = "Lffa;")
    private class197 field7559;

    @OriginalMember(owner = "client!jb", name = "Ab", descriptor = "Luo;")
    private class602 field7587;

    @OriginalMember(owner = "client!jb", name = "Cb", descriptor = "Luo;")
    private class602 field7571;

    @OriginalMember(owner = "client!jb", name = "Tb", descriptor = "Luo;")
    private class602 field7522;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "Luo;")
    private class602 field7498;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "Lfa;")
    private class246 field7585;

    @OriginalMember(owner = "client!jb", name = "Sb", descriptor = "I")
    private int field7534;

    @OriginalMember(owner = "client!jb", name = "sb", descriptor = "I")
    private int field7506;

    @OriginalMember(owner = "client!jb", name = "qb", descriptor = "[I")
    private int[] field7519;

    @OriginalMember(owner = "client!jb", name = "uc", descriptor = "[I")
    private int[] field7540;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "[S")
    private short[] field7584;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "[I")
    private int[] field7581;

    @OriginalMember(owner = "client!jb", name = "Lb", descriptor = "[I")
    private int[] field7497;

    @OriginalMember(owner = "client!jb", name = "Nb", descriptor = "[Lhja;")
    private class426[] field7532;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "[Ljk;")
    private class659[] field7557;

    @OriginalMember(owner = "client!jb", name = "Bb", descriptor = "I")
    private int field7515;

    @OriginalMember(owner = "client!jb", name = "nc", descriptor = "[Lsw;")
    private class786[] field7595;

    @OriginalMember(owner = "client!jb", name = "Db", descriptor = "[Lmha;")
    private class435[] field7508;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[S")
    private short[] field7611;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "[B")
    private byte[] field7572;

    @OriginalMember(owner = "client!jb", name = "Ac", descriptor = "[F")
    private float[] field7586;

    @OriginalMember(owner = "client!jb", name = "Fb", descriptor = "S")
    private short field7553;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "[S")
    private short[] field7566;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "[S")
    private short[] field7500;

    @OriginalMember(owner = "client!jb", name = "sc", descriptor = "[S")
    private short[] field7495;

    @OriginalMember(owner = "client!jb", name = "tb", descriptor = "[S")
    private short[] field7526;

    @OriginalMember(owner = "client!jb", name = "mb", descriptor = "[S")
    private short[] field7573;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "S")
    private short field7602;

    @OriginalMember(owner = "client!jb", name = "Ec", descriptor = "[S")
    private short[] field7590;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[F")
    private float[] field7529;

    @OriginalMember(owner = "client!jb", name = "vc", descriptor = "[B")
    private byte[] field7574;

    @OriginalMember(owner = "client!jb", name = "ic", descriptor = "[S")
    private short[] field7589;

    @OriginalMember(owner = "client!jb", name = "xc", descriptor = "[S")
    private short[] field7569;

    @OriginalMember(owner = "client!jb", name = "ac", descriptor = "[S")
    private short[] field7554;

    @OriginalMember(owner = "client!jb", name = "Kb", descriptor = "[I")
    private int[] field7513;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "[[I")
    private int[][] field7593;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[[I")
    private int[][] field7535;

    @OriginalMember(owner = "client!jb", name = "Jb", descriptor = "[[I")
    private int[][] field7594;

    @OriginalMember(owner = "client!jb", name = "Gc", descriptor = "[Ljava/lang/String;")
    private static final String[] field7616 = new String[] { method3953(method3952("-z\u007fQ\u000b")), method3953(method3952("8!=\u0013")), method3953(method3952("<6\u007f54~")), method3953(method3952("<6\u007f\u001e^")), method3953(method3952("<6\u007f9^")), method3953(method3952("<6\u007fC\u001f8=%A^")), method3953(method3952("<6\u007f(7~")), method3953(method3952("<6\u007f\u001e\u0017~")), method3953(method3952("<6\u007f\u0012\u0017~")), method3953(method3952("<6\u007f=4~")), method3953(method3952("<6\u007f:^")), method3953(method3952("<6\u007f\r^")), method3953(method3952("<6\u007f:7~")), method3953(method3952("<6\u007f,^")), method3953(method3952("<6\u007f\u000f^")), method3953(method3952("<6\u007f;7~")), method3953(method3952("<6\u007f64~")), method3953(method3952("<6\u007f2^")), method3953(method3952("<6\u007f37~")), method3953(method3952("<6\u007f\u0014^")), method3953(method3952("<6\u007f5^")), method3953(method3952("<6\u007f04~")), method3953(method3952("<6\u007f\u001b\u0017~")), method3953(method3952("<6\u007f\f^")), method3953(method3952("<6\u007f)7~")), method3953(method3952("<6\u007f=7~")), method3953(method3952("<6\u007f<7~")), method3953(method3952("<6\u007f77~")), method3953(method3952("<6\u007f<^")), method3953(method3952("<6\u007f=^")), method3953(method3952("<6\u007f>7~")), method3953(method3952("<6\u007f.^")), method3953(method3952("<6\u007f/4~")), method3953(method3952("<6\u007f\t^")), method3953(method3952("<6\u007f>4~")), method3953(method3952("<6\u007f;^")), method3953(method3952("<6\u007f*4~")), method3953(method3952("<6\u007f\n\u0017~")), method3953(method3952("<6\u007f7^")), method3953(method3952("<6\u007f0^")), method3953(method3952("<6\u007f6^")), method3953(method3952("<6\u007f1^")), method3953(method3952("<6\u007f\b\u0017~")), method3953(method3952("<6\u007f87~")), method3953(method3952("<6\u007f\u0011\u0017~")), method3953(method3952("<6\u007f\u0019\u0017~")), method3953(method3952("<6\u007f-7~")), method3953(method3952("<6\u007f-^")), method3953(method3952("<6\u007f\u0016\u0017~")), method3953(method3952("<6\u007f3^")), method3953(method3952("<6\u007f74~")), method3953(method3952("<6\u007f(^")), method3953(method3952("<6\u007f17~")), method3953(method3952("<6\u007f/^")), method3953(method3952("<6\u007f97~")), method3953(method3952("<6\u007f8^")), method3953(method3952("<6\u007f>^")), method3953(method3952("<6\u007f84~")), method3953(method3952("<6\u007f4^")), method3953(method3952("<6\u007f<4~")), method3953(method3952("<6\u007f\u0005\u0017~")), method3953(method3952("<6\u007f\u001d\u0017~")), method3953(method3952("<6\u007f)^")), method3953(method3952("<6\u007f+^")) };

    @OriginalMember(owner = "client!jb", name = "cc", descriptor = "Lwia;")
    public static class790 field7609 = new class790(5, 4);

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Lel;")
    public static class573 field7613 = new class573(61, -2);

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "B")
    private byte field7608;

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!jb", name = "Dc", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!jb", name = "yb", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!jb", name = "Fc", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!jb", name = "Zb", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!jb", name = "mc", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!jb", name = "Mb", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!jb", name = "lc", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!jb", name = "Vb", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!jb", name = "qc", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!jb", name = "zc", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!jb", name = "Cc", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!jb", name = "yc", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!jb", name = "Ob", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!jb", name = "ob", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!jb", name = "Pb", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!jb", name = "pb", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!jb", name = "wc", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!jb", name = "oc", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!jb", name = "Wb", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!jb", name = "pc", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!jb", name = "tc", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!jb", name = "zb", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!jb", name = "hc", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!jb", name = "Ib", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!jb", name = "rc", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!jb", name = "Xb", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!jb", name = "kc", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!jb", name = "Gb", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!jb", name = "Qb", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!jb", name = "dc", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!jb", name = "vb", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!jb", name = "Rb", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!jb", name = "ub", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!jb", name = "Hb", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!jb", name = "jc", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Lml;")
    private class407 field7575;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "Ltv;")
    private class586 field7558;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Lraa;")
    private class633 field7514;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "S")
    private short field7542;

    @OriginalMember(owner = "client!jb", name = "xb", descriptor = "S")
    private short field7544;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "S")
    private short field7547;

    @OriginalMember(owner = "client!jb", name = "Bc", descriptor = "S")
    private short field7548;

    @OriginalMember(owner = "client!jb", name = "Ub", descriptor = "S")
    private short field7552;

    @OriginalMember(owner = "client!jb", name = "fc", descriptor = "S")
    private short field7576;

    @OriginalMember(owner = "client!jb", name = "bc", descriptor = "S")
    private short field7578;

    @OriginalMember(owner = "client!jb", name = "gc", descriptor = "S")
    private short field7597;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "(I)V")
    public final void method347(int arg0) {
        try {
            field7561++;
            this.field7534 = arg0;
            this.field7512 = true;
            if (this.field7558 != null && (this.field7534 & 0x10000) == 0) {
                this.field7611 = this.field7558.field8630;
                this.field7569 = this.field7558.field8631;
                this.field7574 = this.field7558.field8636;
                this.field7589 = this.field7558.field8635;
                this.field7558 = null;
            }
            this.method3941(-1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7616[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "fa", descriptor = "()I")
    public final int method305() {
        try {
            field7541++;
            if (!this.field7521) {
                this.method3946((byte) -127);
            }
            return this.field7552;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[45] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "wa", descriptor = "()V")
    public final void method337() {
        try {
            for (int var1 = 0; var1 < this.field7533; var1++) {
                this.field7540[var1] = this.field7540[var1] + 7 >> 4;
                this.field7581[var1] = this.field7581[var1] + 7 >> 4;
                this.field7497[var1] = this.field7497[var1] + 7 >> 4;
            }
            field7504++;
            if (this.field7587 != null) {
                this.field7587.field8831 = null;
            }
            this.field7521 = false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7616[42] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method3937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field7563++;
            if (arg5 < arg0 && arg1 > arg5 && arg6 > arg5) {
                return false;
            } else if (arg5 > arg0 && arg5 > arg1 && arg5 > arg6) {
                return false;
            } else if (arg8 < arg7 && arg8 < arg3 && arg4 > arg8) {
                return false;
            } else {
                if (arg2 < 46) {
                    this.method339(40);
                }
                return arg8 <= arg7 || arg3 >= arg8 || arg8 <= arg4;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field7616[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "ba", descriptor = "(Lr;)Lr;")
    public final class194 method301(class194 arg0) {
        try {
            field7592++;
            if (this.field7582 == 0) {
                return null;
            }
            if (!this.field7521) {
                this.method3946((byte) 54);
            }
            int var2;
            int var3;
            if (this.field7559.field2913 <= 0) {
                var2 = this.field7578 - (this.field7559.field2913 * this.field7552 >> 8) >> this.field7559.field2852;
                var3 = this.field7548 - (this.field7559.field2913 * this.field7542 >> 8) >> this.field7559.field2852;
            } else {
                var2 = this.field7578 - (this.field7559.field2913 * this.field7542 >> 8) >> this.field7559.field2852;
                var3 = this.field7548 - (this.field7559.field2913 * this.field7552 >> 8) >> this.field7559.field2852;
            }
            int var4;
            int var5;
            if (this.field7559.field2995 <= 0) {
                var4 = this.field7544 - (this.field7559.field2995 * this.field7552 >> 8) >> this.field7559.field2852;
                var5 = this.field7576 - (this.field7559.field2995 * this.field7542 >> 8) >> this.field7559.field2852;
            } else {
                var4 = this.field7544 - (this.field7559.field2995 * this.field7542 >> 8) >> this.field7559.field2852;
                var5 = this.field7576 - (this.field7559.field2995 * this.field7552 >> 8) >> this.field7559.field2852;
            }
            int var6 = var3 + 1 - var2;
            int var7 = var5 + 1 - var4;
            class582 var8 = (class582) arg0;
            class582 var9;
            if (var8 != null && var8.method4358((byte) 26, var6, var7)) {
                var9 = var8;
                var8.method4356((byte) 124);
            } else {
                var9 = new class582(this.field7559, var6, var7);
            }
            var9.method4353(var5, var2, var3, 120, var4);
            this.method3947((byte) 97, var9);
            return var9;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field7616[61] + (arg0 == null ? field7616[1] : field7616[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ISBII)I")
    private final int method3938(int arg0, short arg1, byte arg2, int arg3, int arg4) {
        try {
            field7610++;
            int var6 = class172.field2403[class167.method1485(arg4, arg3, (byte) 12)];
            if (arg1 != -1) {
                class439 var7 = this.field7559.field679.method1366((byte) -90, arg1 & 0xFFFF);
                int var8 = var7.field6476 & 0xFF;
                if (var8 != 0) {
                    int var9;
                    if (arg4 < 0) {
                        var9 = 0;
                    } else if (arg4 <= 127) {
                        var9 = arg4 * 131586;
                    } else {
                        var9 = 16777215;
                    }
                    if (var8 == 256) {
                        var6 = var9;
                    } else {
                        int var11 = 256 - var8;
                        var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                    }
                }
                int var12 = var7.field6480 & 0xFF;
                if (var12 != 0) {
                    var12 += 256;
                    int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                    if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = (var6 >> 8 & 0xFF) * var12;
                    if (var14 > 65535) {
                        var14 = 65535;
                    }
                    int var15 = (var6 & 0xFF) * var12;
                    if (var15 > 65535) {
                        var15 = 65535;
                    }
                    var6 = ((var13 & 0x7700FF00) << 8) - (-(var15 >> 8) - (var14 & 0xFF00));
                }
            }
            if (arg0 != 15146) {
                this.field7602 = 23;
            }
            return (var6 << 8) + 255 - (arg2 & 0xFF);
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field7616[47] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "na", descriptor = "()I")
    public final int method313() {
        try {
            if (!this.field7521) {
                this.method3946((byte) 52);
            }
            field7583++;
            return this.field7547;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[44] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZ)V")
    private final void method3939(boolean arg0, boolean arg1) {
        try {
            field7556++;
            boolean var3 = this.field7498 != null && this.field7498.field8831 == null;
            boolean var4 = this.field7522 != null && this.field7522.field8831 == null;
            boolean var5 = this.field7587 != null && this.field7587.field8831 == null;
            boolean var6 = this.field7571 != null && this.field7571.field8831 == null;
            if (arg1) {
                var3 &= (this.field7608 & 0x2) != 0;
                var5 &= (this.field7608 & 0x1) != 0;
                var6 &= (this.field7608 & 0x8) != 0;
                var4 &= (this.field7608 & 0x4) != 0;
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
            if (arg0) {
                this.method342();
            }
            if (var6) {
                var11 = var7;
                var7 = (byte) (var7 + 8);
            }
            if (var7 != 0) {
                if (this.field7582 * var7 > this.field7559.field2994.field2209.length) {
                    this.field7559.field2994 = new class353((this.field7582 + 100) * var7);
                } else {
                    this.field7559.field2994.field2201 = 0;
                }
                class353 var12 = this.field7559.field2994;
                if (var5) {
                    if (this.field7559.field2922) {
                        for (int var13 = 0; var13 < this.field7499; var13++) {
                            int var14 = Stream.floatToRawIntBits((float) this.field7540[var13]);
                            int var15 = Stream.floatToRawIntBits((float) this.field7581[var13]);
                            int var16 = Stream.floatToRawIntBits((float) this.field7497[var13]);
                            int var17 = this.field7519[var13];
                            int var18 = this.field7519[var13 + 1];
                            for (int var19 = var17; var19 < var18; var19++) {
                                int var20 = this.field7526[var19] - 1;
                                if (var20 == -1) {
                                    break;
                                }
                                var12.field2201 = var7 * var20;
                                var12.method1412(!arg0, var14);
                                var12.method1412(!arg0, var15);
                                var12.method1412(true, var16);
                            }
                        }
                    } else {
                        for (int var21 = 0; var21 < this.field7499; var21++) {
                            int var22 = Stream.floatToRawIntBits((float) this.field7540[var21]);
                            int var23 = Stream.floatToRawIntBits((float) this.field7581[var21]);
                            int var24 = Stream.floatToRawIntBits((float) this.field7497[var21]);
                            int var25 = this.field7519[var21];
                            int var26 = this.field7519[var21 + 1];
                            for (int var27 = var25; var27 < var26; var27++) {
                                int var28 = this.field7526[var27] - 1;
                                if (var28 == -1) {
                                    break;
                                }
                                var12.field2201 = var7 * var28;
                                var12.method1452(1992228296, var22);
                                var12.method1452(1992228296, var23);
                                var12.method1452(1992228296, var24);
                            }
                        }
                    }
                }
                if (var3) {
                    if (this.field7522 == null) {
                        short[] var29;
                        short[] var30;
                        byte[] var31;
                        short[] var32;
                        if (this.field7558 == null) {
                            var29 = this.field7569;
                            var30 = this.field7611;
                            var31 = this.field7574;
                            var32 = this.field7589;
                        } else {
                            var31 = this.field7558.field8636;
                            var32 = this.field7558.field8635;
                            var29 = this.field7558.field8631;
                            var30 = this.field7558.field8630;
                        }
                        float var33 = this.field7559.field2888[0];
                        float var34 = this.field7559.field2888[1];
                        float var35 = this.field7559.field2888[2];
                        float var36 = this.field7559.field2965;
                        float var37 = this.field7559.field2955 * 768.0F / (float) this.field7602;
                        float var38 = this.field7559.field2921 * 768.0F / (float) this.field7602;
                        for (int var39 = 0; var39 < this.field7536; var39++) {
                            int var40 = this.method3938(15146, this.field7573[var39], this.field7572[var39], this.field7590[var39], this.field7553);
                            short var41 = this.field7554[var39];
                            float var42 = (float) ((var40 & 0xFF64D9) >> 16) * this.field7559.field2936;
                            float var43 = (float) (var40 >> 8 & 0xFF) * this.field7559.field2987;
                            float var44 = (float) (var40 >>> 24) * this.field7559.field2930;
                            short var45 = (short) var31[var41];
                            float var46;
                            if (var45 == 0) {
                                var46 = ((float) var32[var41] * var35 + (float) var29[var41] * var34 + (float) var30[var41] * var33) * 0.0026041667F;
                            } else {
                                var46 = ((float) var32[var41] * var35 + (float) var29[var41] * var34 + (float) var30[var41] * var33) / (float) (var45 * 256);
                            }
                            float var47 = var36 + var46 * (var46 < 0.0F ? var38 : var37);
                            int var48 = (int) (var44 * var47);
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 > 255) {
                                var48 = 255;
                            }
                            int var49 = (int) (var42 * var47);
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 > 255) {
                                var49 = 255;
                            }
                            int var50 = (int) (var43 * var47);
                            var12.field2201 = var9 + (var7 * var41);
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                            var12.method1428((byte) -24, var48);
                            var12.method1428((byte) -24, var49);
                            var12.method1428((byte) -24, var50);
                            var12.method1428((byte) -24, 255 - (this.field7572[var39] & 0xFF));
                            short var51 = this.field7566[var39];
                            short var52 = (short) var31[var51];
                            float var53;
                            if (var52 == 0) {
                                var53 = ((float) var32[var51] * var35 + (float) var29[var51] * var34 + (float) var30[var51] * var33) * 0.0026041667F;
                            } else {
                                var53 = ((float) var32[var51] * var35 + (float) var29[var51] * var34 + (float) var30[var51] * var33) / (float) (var52 * 256);
                            }
                            float var54 = var36 + ((var53 < 0.0F) ? var38 : var37) * var53;
                            int var55 = (int) (var44 * var54);
                            int var56 = (int) (var42 * var54);
                            if (var55 < 0) {
                                var55 = 0;
                            } else if (var55 > 255) {
                                var55 = 255;
                            }
                            if (var56 < 0) {
                                var56 = 0;
                            } else if (var56 > 255) {
                                var56 = 255;
                            }
                            int var57 = (int) (var43 * var54);
                            var12.field2201 = var7 * var51 + var9;
                            if (var57 < 0) {
                                var57 = 0;
                            } else if (var57 > 255) {
                                var57 = 255;
                            }
                            var12.method1428((byte) -24, var55);
                            var12.method1428((byte) -24, var56);
                            var12.method1428((byte) -24, var57);
                            var12.method1428((byte) -24, 255 - (this.field7572[var39] & 0xFF));
                            short var58 = this.field7500[var39];
                            short var59 = (short) var31[var58];
                            float var60;
                            if (var59 == 0) {
                                var60 = ((float) var32[var58] * var35 + (float) var29[var58] * var34 + (float) var30[var58] * var33) * 0.0026041667F;
                            } else {
                                var60 = ((float) var32[var58] * var35 + (float) var29[var58] * var34 + (float) var30[var58] * var33) / (float) (var59 * 256);
                            }
                            float var61 = var36 + (var60 < 0.0F ? var38 : var37) * var60;
                            int var62 = (int) (var44 * var61);
                            if (var62 < 0) {
                                var62 = 0;
                            } else if (var62 > 255) {
                                var62 = 255;
                            }
                            int var63 = (int) (var42 * var61);
                            int var64 = (int) (var43 * var61);
                            if (var63 < 0) {
                                var63 = 0;
                            } else if (var63 > 255) {
                                var63 = 255;
                            }
                            var12.field2201 = var7 * var58 + var9;
                            if (var64 < 0) {
                                var64 = 0;
                            } else if (var64 > 255) {
                                var64 = 255;
                            }
                            var12.method1428((byte) -24, var62);
                            var12.method1428((byte) -24, var63);
                            var12.method1428((byte) -24, var64);
                            var12.method1428((byte) -24, 255 - (this.field7572[var39] & 0xFF));
                        }
                    } else {
                        for (int var65 = 0; var65 < this.field7536; var65++) {
                            int var66 = this.method3938(15146, this.field7573[var65], this.field7572[var65], this.field7590[var65], this.field7553);
                            var12.field2201 = this.field7554[var65] * var7 + var9;
                            var12.method1412(true, var66);
                            var12.field2201 = this.field7566[var65] * var7 + var9;
                            var12.method1412(true, var66);
                            var12.field2201 = this.field7500[var65] * var7 + var9;
                            var12.method1412(true, var66);
                        }
                    }
                }
                if (var4) {
                    short[] var67;
                    byte[] var68;
                    short[] var69;
                    short[] var70;
                    if (this.field7558 == null) {
                        var67 = this.field7611;
                        var68 = this.field7574;
                        var69 = this.field7589;
                        var70 = this.field7569;
                    } else {
                        var68 = this.field7558.field8636;
                        var69 = this.field7558.field8635;
                        var70 = this.field7558.field8631;
                        var67 = this.field7558.field8630;
                    }
                    float var71 = 3.0F / (float) this.field7602;
                    var12.field2201 = var10;
                    float var72 = 3.0F / (float) (this.field7602 + (this.field7602 / 2));
                    if (this.field7559.field2922) {
                        for (int var73 = 0; var73 < this.field7582; var73++) {
                            int var74 = var68[var73] & 0xFF;
                            if (var74 == 0) {
                                var12.method2890((float) var67[var73] * var72, (byte) 113);
                                var12.method2890((float) var70[var73] * var72, (byte) -117);
                                var12.method2890((float) var69[var73] * var72, (byte) -116);
                            } else {
                                float var75 = var71 / (float) var74;
                                var12.method2890((float) var67[var73] * var75, (byte) -101);
                                var12.method2890((float) var70[var73] * var75, (byte) 20);
                                var12.method2890((float) var69[var73] * var75, (byte) -108);
                            }
                            var12.field2201 += var7 - 12;
                        }
                    } else {
                        for (int var76 = 0; var76 < this.field7582; var76++) {
                            int var77 = var68[var76] & 0xFF;
                            if (var77 == 0) {
                                var12.method2892(-1335387932, (float) var67[var76] * var72);
                                var12.method2892(-1335387932, (float) var70[var76] * var72);
                                var12.method2892(-1335387932, (float) var69[var76] * var72);
                            } else {
                                float var78 = var71 / (float) var77;
                                var12.method2892(-1335387932, (float) var67[var76] * var78);
                                var12.method2892(-1335387932, (float) var70[var76] * var78);
                                var12.method2892(-1335387932, (float) var69[var76] * var78);
                            }
                            var12.field2201 += var7 - 12;
                        }
                    }
                }
                if (var6) {
                    var12.field2201 = var11;
                    if (this.field7559.field2922) {
                        for (int var80 = 0; var80 < this.field7582; var80++) {
                            var12.method2890(this.field7529[var80], (byte) 126);
                            var12.method2890(this.field7586[var80], (byte) -106);
                            var12.field2201 += var7 - 8;
                        }
                    } else {
                        for (int var79 = 0; var79 < this.field7582; var79++) {
                            var12.method2892(-1335387932, this.field7529[var79]);
                            var12.method2892(-1335387932, this.field7586[var79]);
                            var12.field2201 += var7 - 8;
                        }
                    }
                }
                var12.field2201 = this.field7582 * var7;
                class407 var81;
                if (arg1) {
                    if (this.field7575 == null) {
                        this.field7575 = this.field7559.method1682((byte) -38, var12.field2201, true, var7, var12.field2209);
                    } else {
                        this.field7575.method3186((byte) -82, var7, var12.field2209, var12.field2201);
                    }
                    var81 = this.field7575;
                    this.field7608 = 0;
                } else {
                    var81 = this.field7559.method1682((byte) -38, var12.field2201, false, var7, var12.field2209);
                    this.field7512 = true;
                }
                if (var5) {
                    this.field7587.field8831 = var81;
                    this.field7587.field8827 = var8;
                }
                if (var6) {
                    this.field7571.field8827 = var11;
                    this.field7571.field8831 = var81;
                }
                if (var3) {
                    this.field7498.field8827 = var9;
                    this.field7498.field8831 = var81;
                }
                if (var4) {
                    this.field7522.field8827 = var10;
                    this.field7522.field8831 = var81;
                }
            }
        } catch (RuntimeException var83) {
            throw class759.method5498(var83, field7616[51] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILju;IJIFIBFI)S")
    private final short method3940(int arg0, class137 arg1, int arg2, long arg3, int arg4, float arg5, int arg6, byte arg7, float arg8, int arg9) {
        try {
            field7546++;
            int var12 = this.field7519[arg9];
            int var13 = this.field7519[arg9 + 1];
            int var14 = 0;
            for (int var15 = var12; var15 < var13; var15++) {
                short var16 = this.field7526[var15];
                if (var16 == 0) {
                    var14 = var15;
                    break;
                }
                if (class544.field8134[var15] == arg3) {
                    return (short) (var16 - 1);
                }
            }
            this.field7526[var14] = (short) (this.field7582 + 1);
            class544.field8134[var14] = arg3;
            this.field7611[this.field7582] = (short) arg4;
            if (arg7 != 124) {
                return 102;
            }
            this.field7569[this.field7582] = (short) arg2;
            this.field7589[this.field7582] = (short) arg0;
            this.field7574[this.field7582] = (byte) arg6;
            this.field7529[this.field7582] = arg8;
            this.field7586[this.field7582] = arg5;
            return (short) (this.field7582++);
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field7616[20] + arg0 + ',' + (arg1 == null ? field7616[1] : field7616[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    private final void method3941(int arg0) {
        try {
            field7507++;
            if (this.field7512) {
                this.field7512 = false;
                if (this.field7557 == null && this.field7532 == null && this.field7595 == null && !class225.method1947(this.field7506, 55, this.field7534)) {
                    boolean var2 = false;
                    boolean var3 = false;
                    if (this.field7540 != null && !class447.method3441(this.field7534, (byte) -124, this.field7506)) {
                        if (this.field7587 != null && this.field7587.field8831 == null) {
                            this.field7512 = true;
                        } else {
                            var2 = true;
                            if (!this.field7521) {
                                this.method3946((byte) -111);
                            }
                        }
                    }
                    boolean var4 = false;
                    if (this.field7581 != null && !class281.method2303(92, this.field7534, this.field7506)) {
                        if (this.field7587 != null && this.field7587.field8831 == null) {
                            this.field7512 = true;
                        } else {
                            var3 = true;
                            if (!this.field7521) {
                                this.method3946((byte) -6);
                            }
                        }
                    }
                    if (this.field7497 != null && !class555.method4177(this.field7506, this.field7534, (byte) 37)) {
                        if (this.field7587 != null && this.field7587.field8831 == null) {
                            this.field7512 = true;
                        } else {
                            if (!this.field7521) {
                                this.method3946((byte) -109);
                            }
                            var4 = true;
                        }
                    }
                    if (var2) {
                        this.field7540 = null;
                    }
                    if (var4) {
                        this.field7497 = null;
                    }
                    if (var3) {
                        this.field7581 = null;
                    }
                }
                if (this.field7526 != null && this.field7540 == null && this.field7581 == null && this.field7497 == null) {
                    this.field7519 = null;
                    this.field7526 = null;
                }
                if (this.field7574 != null && !class648.method4765(this.field7534, this.field7506, 25416)) {
                    if (this.field7522 == null) {
                        if (this.field7498 != null && this.field7498.field8831 == null) {
                            this.field7512 = true;
                        } else {
                            this.field7574 = null;
                            this.field7611 = this.field7569 = this.field7589 = null;
                        }
                    } else if (this.field7522.field8831 == null) {
                        this.field7512 = true;
                    } else {
                        this.field7611 = this.field7569 = this.field7589 = null;
                        this.field7574 = null;
                    }
                }
                if (this.field7590 != null && !class604.method4478(this.field7506, true, this.field7534)) {
                    if (this.field7498 != null && this.field7498.field8831 == null) {
                        this.field7512 = true;
                    } else {
                        this.field7590 = null;
                    }
                }
                if (this.field7572 != null && !class289.method2349(this.field7534, this.field7506, (byte) 124)) {
                    if (this.field7498 != null && this.field7498.field8831 == null) {
                        this.field7512 = true;
                    } else {
                        this.field7572 = null;
                    }
                }
                if (arg0 == -1) {
                    if (this.field7529 != null && !class120.method1043(this.field7534, arg0 + 89, this.field7506)) {
                        if (this.field7571 != null && this.field7571.field8831 == null) {
                            this.field7512 = true;
                        } else {
                            this.field7529 = this.field7586 = null;
                        }
                    }
                    if (this.field7573 != null && !class659.method4833(this.field7534, -1, this.field7506)) {
                        if (this.field7498 != null && this.field7498.field8831 == null) {
                            this.field7512 = true;
                        } else {
                            this.field7573 = null;
                        }
                    }
                    if (this.field7554 != null && !class374.method3016(this.field7506, (byte) 127, this.field7534)) {
                        if ((this.field7585 == null || this.field7585.field3755 != null) && (this.field7498 == null || this.field7498.field8831 != null)) {
                            this.field7554 = this.field7566 = this.field7500 = null;
                        } else {
                            this.field7512 = true;
                        }
                    }
                    if (this.field7594 != null && !class36.method238(this.field7534, -1532432668, this.field7506)) {
                        this.field7495 = null;
                        this.field7594 = null;
                    }
                    if (this.field7593 != null && !class56.method417(this.field7506, 1, this.field7534)) {
                        this.field7593 = null;
                        this.field7584 = null;
                    }
                    if (this.field7535 != null && !class425.method3279(true, this.field7506, this.field7534)) {
                        this.field7535 = null;
                    }
                    if (this.field7513 != null && (this.field7534 & 0x800) == 0 && (this.field7534 & 0x40000) == 0) {
                        this.field7513 = null;
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7616[35] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "ia", descriptor = "(SS)V")
    public final void method311(short arg0, short arg1) {
        try {
            field7555++;
            for (int var3 = 0; var3 < this.field7536; var3++) {
                if (this.field7590[var3] == arg0) {
                    this.field7590[var3] = arg1;
                }
            }
            if (this.field7595 != null) {
                for (int var4 = 0; var4 < this.field7515; var4++) {
                    class786 var5 = this.field7595[var4];
                    class435 var6 = this.field7508[var4];
                    var6.field6380 = class172.field2403[this.field7590[var5.field11480] & 0xFFFF] & 0xFFFFFF | var6.field6380 & 0xFF000000;
                }
            }
            if (this.field7498 != null) {
                this.field7498.field8831 = null;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field7616[48] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lqq;Lng;II)V")
    public final void method323(class501 arg0, class359 arg1, int arg2, int arg3) {
        try {
            field7496++;
            if (this.field7582 != 0) {
                class768 var5 = this.field7559.field2882;
                if (!this.field7521) {
                    this.method3946((byte) 76);
                }
                class768 var6 = (class768) arg0;
                class248.field3872 = var5.field11095 * var6.field11128 + var5.field11125 * var6.field11118 + var5.field11105 * var6.field11106 + var5.field11128;
                class157.field1957 = var5.field11095 * var6.field11125 + var5.field11125 * var6.field11110 + var5.field11105 * var6.field11098;
                float var7 = (float) this.field7552 * class157.field1957 + class248.field3872;
                float var8 = (float) this.field7542 * class157.field1957 + class248.field3872;
                float var9;
                float var10;
                if ((var8 < var7)) {
                    var9 = (float) this.field7547 + var7;
                    var10 = var8 - (float) this.field7547;
                } else {
                    var9 = (float) this.field7547 + var8;
                    var10 = var7 - (float) this.field7547;
                }
                if (!(var10 >= this.field7559.field2934) && !((float) this.field7559.field2963 >= var9)) {
                    class203.field3155 = var5.field11114 * var6.field11128 + var5.field11098 * var6.field11118 + var5.field11090 * var6.field11106 + var5.field11106;
                    class573.field8469 = var5.field11114 * var6.field11125 + var5.field11098 * var6.field11110 + var5.field11090 * var6.field11098;
                    float var11 = (float) this.field7552 * class573.field8469 + class203.field3155;
                    float var12 = (float) this.field7542 * class573.field8469 + class203.field3155;
                    float var13;
                    float var14;
                    if (var11 > var12) {
                        var13 = (var12 - (float) this.field7547) * (float) this.field7559.field2941;
                        var14 = ((float) this.field7547 + var11) * (float) this.field7559.field2941;
                    } else {
                        var13 = (var11 - (float) this.field7547) * (float) this.field7559.field2941;
                        var14 = ((float) this.field7547 + var12) * (float) this.field7559.field2941;
                    }
                    if (!(var13 / (float) arg2 >= this.field7559.field2916) && !(this.field7559.field2992 >= var14 / (float) arg2)) {
                        class753.field10961 = var5.field11092 * var6.field11128 + var5.field11110 * var6.field11118 + var5.field11097 * var6.field11106 + var5.field11118;
                        class614.field8968 = var5.field11092 * var6.field11125 + var5.field11110 * var6.field11110 + var5.field11097 * var6.field11098;
                        float var15 = (float) this.field7552 * class614.field8968 + class753.field10961;
                        float var16 = (float) this.field7542 * class614.field8968 + class753.field10961;
                        float var17;
                        float var18;
                        if ((var15 > var16)) {
                            var17 = ((float) this.field7547 + var15) * (float) this.field7559.field2949;
                            var18 = ((float) (-this.field7547) + var16) * (float) this.field7559.field2949;
                        } else {
                            var17 = ((float) this.field7547 + var16) * (float) this.field7559.field2949;
                            var18 = ((float) (-this.field7547) + var15) * (float) this.field7559.field2949;
                        }
                        if (!(this.field7559.field2970 <= var18 / (float) arg2) && !(var17 / (float) arg2 <= this.field7559.field2920)) {
                            if (arg1 != null || this.field7595 != null) {
                                class779.field11340 = var5.field11114 * var6.field11105 + var5.field11098 * var6.field11097 + var5.field11090 * var6.field11090;
                                class575.field8499 = var5.field11092 * var6.field11105 + var5.field11110 * var6.field11097 + var5.field11097 * var6.field11090;
                                class659.field9502 = var5.field11095 * var6.field11095 + var5.field11125 * var6.field11092 + var5.field11105 * var6.field11114;
                                class408.field6044 = var5.field11095 * var6.field11105 + var5.field11125 * var6.field11097 + var5.field11105 * var6.field11090;
                                class208.field3187 = var5.field11114 * var6.field11095 + var5.field11098 * var6.field11092 + var5.field11090 * var6.field11114;
                                class423.field6228 = var5.field11092 * var6.field11095 + var5.field11110 * var6.field11092 + var5.field11097 * var6.field11114;
                            }
                            if (arg1 != null) {
                                int var19 = this.field7578 + this.field7548 >> 1;
                                int var20 = this.field7576 + this.field7544 >> 1;
                                int var21 = (int) ((float) var20 * class208.field3187 + (float) this.field7552 * class573.field8469 + (float) var19 * class779.field11340 + class203.field3155);
                                int var22 = (int) ((float) var20 * class423.field6228 + (float) this.field7552 * class614.field8968 + (float) var19 * class575.field8499 + class753.field10961);
                                int var23 = (int) ((float) var20 * class659.field9502 + (float) this.field7552 * class157.field1957 + (float) var19 * class408.field6044 + class248.field3872);
                                int var24 = (int) ((float) var20 * class208.field3187 + (float) this.field7542 * class573.field8469 + (float) var19 * class779.field11340 + class203.field3155);
                                int var25 = (int) ((float) var20 * class423.field6228 + (float) this.field7542 * class614.field8968 + (float) var19 * class575.field8499 + class753.field10961);
                                arg1.field5496 = this.field7559.field2941 * var24 / arg2 + this.field7559.field2951;
                                arg1.field5493 = this.field7559.field2949 * var22 / arg2 + this.field7559.field2950;
                                int var26 = (int) ((float) var20 * class659.field9502 + (float) this.field7542 * class157.field1957 + (float) var19 * class408.field6044 + class248.field3872);
                                arg1.field5497 = this.field7559.field2950 + (this.field7559.field2949 * var25 / arg2);
                                arg1.field5494 = this.field7559.field2941 * var21 / arg2 + this.field7559.field2951;
                                if (this.field7559.field2963 <= var23 || var26 >= this.field7559.field2963) {
                                    arg1.field5495 = (this.field7547 + var21) * this.field7559.field2941 / arg2 + this.field7559.field2951 - arg1.field5494;
                                    arg1.field5492 = true;
                                }
                            }
                            this.field7559.method1754((byte) -112, (float) arg2);
                            this.field7559.method1697(false);
                            this.field7559.method1689(34166, var6);
                            this.method3951(-67);
                            this.field7559.method1731(-25384);
                            this.method3948(780434311);
                        }
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class759.method5498(var28, field7616[16] + (arg0 == null ? field7616[1] : field7616[0]) + ',' + (arg1 == null ? field7616[1] : field7616[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "ma", descriptor = "()I")
    public final int method327() {
        try {
            if (!this.field7521) {
                this.method3946((byte) 92);
            }
            field7607++;
            return this.field7597;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[8] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "(III)V")
    public final void method338(int arg0, int arg1, int arg2) {
        try {
            for (int var4 = 0; var4 < this.field7499; var4++) {
                if (arg0 != 128) {
                    this.field7540[var4] = this.field7540[var4] * arg0 >> 7;
                }
                if (arg1 != 128) {
                    this.field7581[var4] = this.field7581[var4] * arg1 >> 7;
                }
                if (arg2 != 128) {
                    this.field7497[var4] = this.field7497[var4] * arg2 >> 7;
                }
            }
            field7543++;
            if (this.field7587 != null) {
                this.field7587.field8831 = null;
            }
            this.field7521 = false;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7616[39] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3) {
        try {
            field7564++;
            for (int var5 = 0; var5 < this.field7536; var5++) {
                int var6 = this.field7590[var5] & 0xFFFF;
                int var7 = var6 >> 10 & 0x3F;
                int var8 = (var6 & 0x39A) >> 7;
                int var9 = var6 & 0x7F;
                if (arg1 != -1) {
                    var8 += (arg1 - var8) * arg3 >> 7;
                }
                if (arg0 != -1) {
                    var7 += (arg0 - var7) * arg3 >> 7;
                }
                if (arg2 != -1) {
                    var9 += (arg2 - var9) * arg3 >> 7;
                }
                this.field7590[var5] = (short) class544.method4107(class544.method4107(var8 << 7, var7 << 10), var9);
            }
            if (this.field7595 != null) {
                for (int var10 = 0; var10 < this.field7515; var10++) {
                    class786 var11 = this.field7595[var10];
                    class435 var12 = this.field7508[var10];
                    var12.field6380 = var12.field6380 & 0xFF000000 | class172.field2403[this.field7590[var11.field11480] & 0xFFFF] & 0xFFFFFF;
                }
            }
            if (this.field7498 != null) {
                this.field7498.field8831 = null;
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field7616[57] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()[Ljk;")
    public final class659[] method324() {
        try {
            field7494++;
            return this.field7557;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[43] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIIILqq;II)Z")
    private final boolean method3942(boolean arg0, int arg1, int arg2, int arg3, class501 arg4, int arg5, int arg6) {
        try {
            field7527++;
            class768 var8 = (class768) arg4;
            class768 var9 = this.field7559.field2882;
            float var10 = var8.field11128 * var9.field11114 + var8.field11118 * var9.field11098 + var8.field11106 * var9.field11090 + var9.field11106;
            float var11 = var8.field11128 * var9.field11092 + var8.field11118 * var9.field11110 + var8.field11106 * var9.field11097 + var9.field11118;
            class573.field8469 = var8.field11125 * var9.field11114 + var8.field11110 * var9.field11098 + var8.field11098 * var9.field11090;
            class157.field1957 = var8.field11125 * var9.field11095 + var8.field11110 * var9.field11125 + var8.field11098 * var9.field11105;
            if (arg1 > -32) {
                return true;
            }
            float var12 = var8.field11128 * var9.field11095 + var8.field11118 * var9.field11125 + var8.field11106 * var9.field11105 + var9.field11128;
            class423.field6228 = var8.field11095 * var9.field11092 + var8.field11114 * var9.field11097 + var8.field11092 * var9.field11110;
            class575.field8499 = var8.field11105 * var9.field11092 + var8.field11097 * var9.field11110 + var8.field11090 * var9.field11097;
            class208.field3187 = var8.field11095 * var9.field11114 + var8.field11114 * var9.field11090 + var8.field11092 * var9.field11098;
            class408.field6044 = var8.field11105 * var9.field11095 + var8.field11097 * var9.field11125 + var8.field11090 * var9.field11105;
            class614.field8968 = var8.field11125 * var9.field11092 + var8.field11110 * var9.field11110 + var8.field11098 * var9.field11097;
            class659.field9502 = var8.field11095 * var9.field11095 + var8.field11114 * var9.field11105 + var8.field11092 * var9.field11125;
            class779.field11340 = var8.field11105 * var9.field11114 + var8.field11097 * var9.field11098 + var8.field11090 * var9.field11090;
            boolean var13 = false;
            float var14 = Float.MAX_VALUE;
            float var15 = -3.4028235E38F;
            float var16 = Float.MAX_VALUE;
            float var17 = -3.4028235E38F;
            int var18 = this.field7559.field2941;
            int var19 = this.field7559.field2949;
            if (!this.field7521) {
                this.method3946((byte) -112);
            }
            int var20 = this.field7548 - this.field7578 >> 1;
            int var21 = this.field7542 - this.field7552 >> 1;
            int var22 = this.field7576 - this.field7544 >> 1;
            int var23 = this.field7578 + var20;
            int var24 = this.field7552 + var21;
            int var25 = this.field7544 + var22;
            int var26 = var23 - (var20 << arg5);
            int var27 = var24 - (var21 << arg5);
            int var28 = var25 - (var22 << arg5);
            int var29 = (var20 << arg5) + var23;
            int var30 = (var21 << arg5) + var24;
            int var31 = var25 + (var22 << arg5);
            class121.field1428[0] = var26;
            class515.field7450[0] = var27;
            class121.field1428[1] = var29;
            class264.field4046[0] = var28;
            class515.field7450[1] = var27;
            class264.field4046[1] = var28;
            class121.field1428[2] = var26;
            class515.field7450[2] = var30;
            class264.field4046[2] = var28;
            class121.field1428[3] = var29;
            class515.field7450[3] = var30;
            class121.field1428[4] = var26;
            class264.field4046[3] = var28;
            class515.field7450[4] = var27;
            class121.field1428[5] = var29;
            class264.field4046[4] = var31;
            class515.field7450[5] = var27;
            class121.field1428[6] = var26;
            class264.field4046[5] = var31;
            class515.field7450[6] = var30;
            class121.field1428[7] = var29;
            class264.field4046[6] = var31;
            class515.field7450[7] = var30;
            class264.field4046[7] = var31;
            for (int var32 = 0; var32 < 8; var32++) {
                float var33 = (float) class264.field4046[var32];
                float var34 = (float) class515.field7450[var32];
                float var35 = (float) class121.field1428[var32];
                float var36 = class208.field3187 * var33 + class779.field11340 * var35 + class573.field8469 * var34 + var10;
                float var37 = class423.field6228 * var33 + class614.field8968 * var34 + class575.field8499 * var35 + var11;
                float var38 = class659.field9502 * var33 + class408.field6044 * var35 + class157.field1957 * var34 + var12;
                if (var38 >= (float) this.field7559.field2963) {
                    if (arg2 > 0) {
                        var38 = arg2;
                    }
                    float var39 = (float) var18 * var36 / var38 + (float) this.field7559.field2951;
                    float var40 = (float) var19 * var37 / var38 + (float) this.field7559.field2950;
                    if (var15 < var39) {
                        var15 = var39;
                    }
                    if (var39 < var14) {
                        var14 = var39;
                    }
                    if (var16 > var40) {
                        var16 = var40;
                    }
                    var13 = true;
                    if (var40 > var17) {
                        var17 = var40;
                    }
                }
            }
            if (var13 && var14 < (float) arg6 && var15 > (float) arg6 && var16 < (float) arg3 && (float) arg3 < var17) {
                if (arg0) {
                    return true;
                }
                if (this.field7582 > this.field7559.field2998.length) {
                    this.field7559.field2998 = new int[this.field7582];
                    this.field7559.field3000 = new int[this.field7582];
                }
                int[] var41 = this.field7559.field2998;
                int[] var42 = this.field7559.field3000;
                for (int var43 = 0; var43 < this.field7499; var43++) {
                    float var44 = (float) this.field7540[var43];
                    float var45 = (float) this.field7581[var43];
                    float var46 = (float) this.field7497[var43];
                    float var47 = class423.field6228 * var46 + class614.field8968 * var45 + class575.field8499 * var44 + var11;
                    float var48 = class208.field3187 * var46 + class779.field11340 * var44 + class573.field8469 * var45 + var10;
                    float var49 = class659.field9502 * var46 + class408.field6044 * var44 + class157.field1957 * var45 + var12;
                    if ((float) this.field7559.field2963 <= var49) {
                        if (arg2 > 0) {
                            var49 = arg2;
                        }
                        int var50 = (int) ((float) var18 * var48 / var49 + (float) this.field7559.field2951);
                        int var51 = (int) ((float) var19 * var47 / var49 + (float) this.field7559.field2950);
                        int var52 = this.field7519[var43];
                        int var53 = this.field7519[var43 + 1];
                        for (int var54 = var52; var54 < var53; var54++) {
                            int var55 = this.field7526[var54] - 1;
                            if (var55 == -1) {
                                break;
                            }
                            var41[var55] = var50;
                            var42[var55] = var51;
                        }
                    } else {
                        int var56 = this.field7519[var43];
                        int var57 = this.field7519[var43 + 1];
                        for (int var58 = var56; var58 < var57; var58++) {
                            int var59 = this.field7526[var58] - 1;
                            if (var59 == -1) {
                                break;
                            }
                            var41[this.field7526[var58] - 1] = -999999;
                        }
                    }
                }
                for (int var60 = 0; var60 < this.field7536; var60++) {
                    if (var41[this.field7554[var60]] != -999999 && var41[this.field7566[var60]] != -999999 && var41[this.field7500[var60]] != -999999 && this.method3937(var42[this.field7554[var60]], var42[this.field7566[var60]], 73, var41[this.field7566[var60]], var41[this.field7500[var60]], arg3, var42[this.field7500[var60]], var41[this.field7554[var60]], arg6)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var62) {
            throw class759.method5498(var62, field7616[29] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field7616[1] : field7616[0]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method3943(byte arg0) {
        try {
            field7609 = null;
            if (arg0 != -30) {
                method3943((byte) 116);
            }
            field7613 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[63] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljb;ZZLjb;II)Lka;")
    private final class497 method3944(class519 arg0, boolean arg1, boolean arg2, class519 arg3, int arg4, int arg5) {
        try {
            arg3.field7530 = this.field7530;
            field7528++;
            arg3.field7499 = this.field7499;
            arg3.field7602 = this.field7602;
            arg3.field7506 = this.field7506;
            arg3.field7538 = this.field7538;
            arg3.field7533 = this.field7533;
            arg3.field7608 = 0;
            arg3.field7536 = this.field7536;
            arg3.field7582 = this.field7582;
            arg3.field7515 = this.field7515;
            arg3.field7534 = arg4;
            if (~(arg4 & 0x100) == arg5) {
                arg3.field7577 = this.field7577;
            } else {
                arg3.field7577 = true;
            }
            arg3.field7553 = this.field7553;
            boolean var7 = class561.method4191(this.field7506, true, arg4);
            boolean var8 = class578.method4318(81, this.field7506, arg4);
            boolean var9 = class199.method1787(this.field7506, arg4, true);
            boolean var10 = var9 | var7 | var8;
            if (var10) {
                if (!var7) {
                    arg3.field7540 = this.field7540;
                } else if (arg0.field7540 == null || this.field7533 > arg0.field7540.length) {
                    arg3.field7540 = arg0.field7540 = new int[this.field7533];
                } else {
                    arg3.field7540 = arg0.field7540;
                }
                if (!var8) {
                    arg3.field7581 = this.field7581;
                } else if (arg0.field7581 == null || arg0.field7581.length < this.field7533) {
                    arg3.field7581 = arg0.field7581 = new int[this.field7533];
                } else {
                    arg3.field7581 = arg0.field7581;
                }
                if (!var9) {
                    arg3.field7497 = this.field7497;
                } else if (arg0.field7497 == null || arg0.field7497.length < this.field7533) {
                    arg3.field7497 = arg0.field7497 = new int[this.field7533];
                } else {
                    arg3.field7497 = arg0.field7497;
                }
                for (int var11 = 0; var11 < this.field7533; var11++) {
                    if (var7) {
                        arg3.field7540[var11] = this.field7540[var11];
                    }
                    if (var8) {
                        arg3.field7581[var11] = this.field7581[var11];
                    }
                    if (var9) {
                        arg3.field7497[var11] = this.field7497[var11];
                    }
                }
            } else {
                arg3.field7581 = this.field7581;
                arg3.field7497 = this.field7497;
                arg3.field7540 = this.field7540;
            }
            if (class318.method2690((byte) 79, arg4, this.field7506)) {
                arg3.field7587 = arg0.field7587;
                if (arg2) {
                    arg3.field7608 = (byte) (arg3.field7608 | 0x1);
                }
                arg3.field7587.field8827 = this.field7587.field8827;
                arg3.field7587.field8831 = this.field7587.field8831;
            } else if (class598.method4450((byte) -126, arg4, this.field7506)) {
                arg3.field7587 = this.field7587;
            } else {
                arg3.field7587 = null;
            }
            if (class118.method1037(arg4, (byte) 29, this.field7506)) {
                if (arg0.field7590 == null || this.field7536 > arg0.field7590.length) {
                    arg3.field7590 = arg0.field7590 = new short[this.field7536];
                } else {
                    arg3.field7590 = arg0.field7590;
                }
                for (int var12 = 0; var12 < this.field7536; var12++) {
                    arg3.field7590[var12] = this.field7590[var12];
                }
            } else {
                arg3.field7590 = this.field7590;
            }
            if (class551.method4147((byte) 101, this.field7506, arg4)) {
                if (arg0.field7572 == null || arg0.field7572.length < this.field7536) {
                    arg3.field7572 = arg0.field7572 = new byte[this.field7536];
                } else {
                    arg3.field7572 = arg0.field7572;
                }
                for (int var13 = 0; var13 < this.field7536; var13++) {
                    arg3.field7572[var13] = this.field7572[var13];
                }
            } else {
                arg3.field7572 = this.field7572;
            }
            if (class547.method4125(arg4, this.field7506, (byte) 122)) {
                arg3.field7498 = arg0.field7498;
                if (arg2) {
                    arg3.field7608 = (byte) (arg3.field7608 | 0x2);
                }
                arg3.field7498.field8827 = this.field7498.field8827;
                arg3.field7498.field8831 = this.field7498.field8831;
            } else if (class434.method3319(arg4, this.field7506, 86)) {
                arg3.field7498 = this.field7498;
            } else {
                arg3.field7498 = null;
            }
            if (class487.method3700(this.field7506, (byte) 77, arg4)) {
                if (arg0.field7611 == null || this.field7582 > arg0.field7611.length) {
                    int var14 = this.field7582;
                    arg3.field7611 = arg0.field7611 = new short[var14];
                    arg3.field7569 = arg0.field7569 = new short[var14];
                    arg3.field7589 = arg0.field7589 = new short[var14];
                } else {
                    arg3.field7589 = arg0.field7589;
                    arg3.field7611 = arg0.field7611;
                    arg3.field7569 = arg0.field7569;
                }
                if (this.field7558 == null) {
                    for (int var18 = 0; var18 < this.field7582; var18++) {
                        arg3.field7611[var18] = this.field7611[var18];
                        arg3.field7569[var18] = this.field7569[var18];
                        arg3.field7589[var18] = this.field7589[var18];
                    }
                } else {
                    if (arg0.field7558 == null) {
                        arg0.field7558 = new class586();
                    }
                    class586 var15 = arg3.field7558 = arg0.field7558;
                    if (var15.field8630 == null || this.field7582 > var15.field8630.length) {
                        int var16 = this.field7582;
                        var15.field8636 = new byte[var16];
                        var15.field8635 = new short[var16];
                        var15.field8631 = new short[var16];
                        var15.field8630 = new short[var16];
                    }
                    for (int var17 = 0; var17 < this.field7582; var17++) {
                        arg3.field7611[var17] = this.field7611[var17];
                        arg3.field7569[var17] = this.field7569[var17];
                        arg3.field7589[var17] = this.field7589[var17];
                        var15.field8630[var17] = this.field7558.field8630[var17];
                        var15.field8631[var17] = this.field7558.field8631[var17];
                        var15.field8635[var17] = this.field7558.field8635[var17];
                        var15.field8636[var17] = this.field7558.field8636[var17];
                    }
                }
                arg3.field7574 = this.field7574;
            } else {
                arg3.field7611 = this.field7611;
                arg3.field7558 = this.field7558;
                arg3.field7589 = this.field7589;
                arg3.field7574 = this.field7574;
                arg3.field7569 = this.field7569;
            }
            if (class559.method4183(8192, this.field7506, arg4)) {
                if (arg2) {
                    arg3.field7608 = (byte) (arg3.field7608 | 0x4);
                }
                arg3.field7522 = arg0.field7522;
                arg3.field7522.field8831 = this.field7522.field8831;
                arg3.field7522.field8827 = this.field7522.field8827;
            } else if (class686.method5030(arg4, -2, this.field7506)) {
                arg3.field7522 = this.field7522;
            } else {
                arg3.field7522 = null;
            }
            if (class431.method3304(arg4, -13984, this.field7506)) {
                if (arg0.field7529 == null || this.field7536 > arg0.field7529.length) {
                    int var19 = this.field7582;
                    arg3.field7586 = arg0.field7586 = new float[var19];
                    arg3.field7529 = arg0.field7529 = new float[var19];
                } else {
                    arg3.field7586 = arg0.field7586;
                    arg3.field7529 = arg0.field7529;
                }
                for (int var20 = 0; var20 < this.field7582; var20++) {
                    arg3.field7529[var20] = this.field7529[var20];
                    arg3.field7586[var20] = this.field7586[var20];
                }
            } else {
                arg3.field7586 = this.field7586;
                arg3.field7529 = this.field7529;
            }
            if (class304.method2583(this.field7506, arg5 - 839, arg4)) {
                if (arg2) {
                    arg3.field7608 = (byte) (arg3.field7608 | 0x8);
                }
                arg3.field7571 = arg0.field7571;
                arg3.field7571.field8827 = this.field7571.field8827;
                arg3.field7571.field8831 = this.field7571.field8831;
            } else if (class373.method3008(0, arg4, this.field7506)) {
                arg3.field7571 = this.field7571;
            } else {
                arg3.field7571 = null;
            }
            if (class414.method3211(false, arg4, this.field7506)) {
                if (arg0.field7554 == null || arg0.field7554.length < this.field7536) {
                    int var21 = this.field7536;
                    arg3.field7500 = arg0.field7500 = new short[var21];
                    arg3.field7566 = arg0.field7566 = new short[var21];
                    arg3.field7554 = arg0.field7554 = new short[var21];
                } else {
                    arg3.field7554 = arg0.field7554;
                    arg3.field7500 = arg0.field7500;
                    arg3.field7566 = arg0.field7566;
                }
                for (int var22 = 0; var22 < this.field7536; var22++) {
                    arg3.field7554[var22] = this.field7554[var22];
                    arg3.field7566[var22] = this.field7566[var22];
                    arg3.field7500[var22] = this.field7500[var22];
                }
            } else {
                arg3.field7554 = this.field7554;
                arg3.field7566 = this.field7566;
                arg3.field7500 = this.field7500;
            }
            if (class744.method5422(-70, arg4, this.field7506)) {
                arg3.field7585 = arg0.field7585;
                if (arg2) {
                    arg3.field7608 = (byte) (arg3.field7608 | 0x10);
                }
                arg3.field7585.field3755 = this.field7585.field3755;
            } else if (class66.method529(-1, this.field7506, arg4)) {
                arg3.field7585 = this.field7585;
            } else {
                arg3.field7585 = null;
            }
            if (class231.method1979(arg4, (byte) -127, this.field7506)) {
                if (arg0.field7573 == null || this.field7536 > arg0.field7573.length) {
                    int var23 = this.field7536;
                    arg3.field7573 = arg0.field7573 = new short[var23];
                } else {
                    arg3.field7573 = arg0.field7573;
                }
                for (int var24 = 0; var24 < this.field7536; var24++) {
                    arg3.field7573[var24] = this.field7573[var24];
                }
            } else {
                arg3.field7573 = this.field7573;
            }
            if (!class761.method5510(arg4, this.field7506, (byte) 122)) {
                arg3.field7508 = this.field7508;
            } else if (arg0.field7508 == null || arg0.field7508.length < this.field7515) {
                int var25 = this.field7515;
                arg3.field7508 = arg0.field7508 = new class435[var25];
                for (int var26 = 0; var26 < this.field7515; var26++) {
                    arg3.field7508[var26] = this.field7508[var26].method3325(4);
                }
            } else {
                arg3.field7508 = arg0.field7508;
                for (int var27 = 0; var27 < this.field7515; var27++) {
                    arg3.field7508[var27].method3327(arg5 ^ 0xFFFFFF9B, this.field7508[var27]);
                }
            }
            arg3.field7557 = this.field7557;
            arg3.field7495 = this.field7495;
            arg3.field7526 = this.field7526;
            if (this.field7521) {
                arg3.field7548 = this.field7548;
                arg3.field7576 = this.field7576;
                arg3.field7547 = this.field7547;
                arg3.field7542 = this.field7542;
                arg3.field7597 = this.field7597;
                arg3.field7521 = true;
                arg3.field7544 = this.field7544;
                arg3.field7578 = this.field7578;
                arg3.field7552 = this.field7552;
            } else {
                arg3.field7521 = false;
            }
            arg3.field7594 = this.field7594;
            arg3.field7519 = this.field7519;
            arg3.field7593 = this.field7593;
            arg3.field7513 = this.field7513;
            arg3.field7584 = this.field7584;
            arg3.field7535 = this.field7535;
            arg3.field7595 = this.field7595;
            arg3.field7532 = this.field7532;
            return arg3;
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field7616[58] + (arg0 == null ? field7616[1] : field7616[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7616[1] : field7616[0]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "()Z")
    public final boolean method307() {
        try {
            field7596++;
            return this.field7577;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[4] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lsb;Lha;Lco;I)V")
    public static final void method3945(class306 arg0, class66 arg1, class131 arg2, int arg3) {
        try {
            field7550++;
            class581 var4 = arg0.method2594(arg1, arg3 ^ 0xFFFF8438);
            if (var4 != null) {
                int var5 = var4.method991();
                if (var4.method986() > var5) {
                    var5 = var4.method986();
                }
                byte var6 = 10;
                int var7 = arg2.field1531;
                int var8 = arg2.field1535;
                int var9 = 0;
                int var10 = 0;
                int var11 = arg3;
                if (arg0.field4803 != null) {
                    var9 = class493.field7083.method4321(arg0.field4803, null, (byte) -18, class199.field3107, null);
                    for (int var12 = 0; var12 < var9; var12++) {
                        String var13 = class199.field3107[var12];
                        if (var9 - 1 > var12) {
                            var13 = var13.substring(0, var13.length() - 4);
                        }
                        int var14 = class628.field9194.method5235(var13);
                        if (var10 < var14) {
                            var10 = var14;
                        }
                    }
                    var11 = var9 * class628.field9194.method5233() + class628.field9194.method5238() / 2;
                }
                int var15 = var5 / 2 + arg2.field1531;
                int var16 = arg2.field1535;
                if (class161.field2166 + var5 > var7) {
                    var15 = var5 / 2 + (class161.field2166 + var6) + var10 / 2 + 5;
                    var7 = class161.field2166;
                } else if (var7 > (class161.field2179 - var5)) {
                    var15 = class161.field2179 - (var5 / 2) - (var10 / 2) - var6 - 5;
                    var7 = class161.field2179 - var5;
                }
                if (var8 < (class161.field2165 + var5)) {
                    var16 = var5 / 2 + var6 + class161.field2165;
                    var8 = class161.field2165;
                } else if (var8 > class161.field2183 - var5) {
                    var16 = class161.field2183 - (var5 / 2 + var6 + var11);
                    var8 = class161.field2183 - var5;
                }
                int var17 = (int) (Math.atan2((double) (var7 - arg2.field1531), (double) (var8 - arg2.field1535)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
                var4.method4342((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
                int var18 = -2;
                int var19 = -2;
                int var20 = -2;
                int var21 = -2;
                if (arg0.field4803 != null) {
                    var19 = var16;
                    var18 = var15 - var10 / 2 - 5;
                    var20 = var18 + var10 + 10;
                    var21 = var16 + (class628.field9194.method5233() * var9 + 3);
                    if (arg0.field4811 != 0) {
                        arg1.method593(arg0.field4811, var18, (byte) -82, var21 - var16, -var18 + var20, var16);
                    }
                    if (arg0.field4817 != 0) {
                        arg1.method580(var18, var21 - var16, arg0.field4817, var20 - var18, var16, 1);
                    }
                    for (int var22 = 0; var22 < var9; var22++) {
                        String var23 = class199.field3107[var22];
                        if (var9 - 1 > var22) {
                            var23 = var23.substring(0, var23.length() - 4);
                        }
                        class628.field9194.method5236(arg1, var23, var15, var16, arg0.field4806, true);
                        var16 += class628.field9194.method5233();
                    }
                }
                if (arg0.field4818 != -1 || arg0.field4803 != null) {
                    int var24 = var5 >> 1;
                    class238 var25 = new class238(arg2);
                    var25.field3618 = var19;
                    var25.field3606 = var8 + var24;
                    var25.field3607 = var8 - var24;
                    var25.field3609 = var20;
                    var25.field3616 = var21;
                    var25.field3615 = var7 + var24;
                    var25.field3610 = var18;
                    var25.field3614 = var7 - var24;
                    class728.field10550.method3868(-74, var25);
                }
            }
        } catch (RuntimeException var27) {
            throw class759.method5498(var27, field7616[10] + (arg0 == null ? field7616[1] : field7616[0]) + ',' + (arg1 == null ? field7616[1] : field7616[0]) + ',' + (arg2 == null ? field7616[1] : field7616[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "()V")
    public final void method342() {
        try {
            for (int var1 = 0; var1 < this.field7499; var1++) {
                this.field7497[var1] = -this.field7497[var1];
            }
            field7599++;
            for (int var2 = 0; var2 < this.field7582; var2++) {
                this.field7589[var2] = (short) (-this.field7589[var2]);
            }
            for (int var3 = 0; var3 < this.field7536; var3++) {
                short var4 = this.field7554[var3];
                this.field7554[var3] = this.field7500[var3];
                this.field7500[var3] = var4;
            }
            if (this.field7522 == null && this.field7498 != null) {
                this.field7498.field8831 = null;
            }
            if (this.field7522 != null) {
                this.field7522.field8831 = null;
            }
            if (this.field7585 != null) {
                this.field7585.field3755 = null;
            }
            this.field7521 = false;
            if (this.field7587 != null) {
                this.field7587.field8831 = null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7616[33] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "EA", descriptor = "()I")
    public final int method306() {
        try {
            field7562++;
            if (!this.field7521) {
                this.method3946((byte) 25);
            }
            return this.field7542;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[12] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "(IIII)V")
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        try {
            field7531++;
            if (arg0 == 0) {
                class88.field1002 = 0;
                int var5 = 0;
                class476.field6924 = 0;
                class335.field5232 = 0;
                for (int var6 = 0; var6 < this.field7499; var6++) {
                    class88.field1002 += this.field7540[var6];
                    class335.field5232 += this.field7581[var6];
                    var5++;
                    class476.field6924 += this.field7497[var6];
                }
                if (var5 > 0) {
                    class476.field6924 = class476.field6924 / var5 + arg3;
                    class335.field5232 = class335.field5232 / var5 + arg2;
                    class88.field1002 = class88.field1002 / var5 + arg1;
                } else {
                    class88.field1002 = arg1;
                    class335.field5232 = arg2;
                    class476.field6924 = arg3;
                }
            } else if (arg0 == 1) {
                for (int var7 = 0; var7 < this.field7499; var7++) {
                    this.field7540[var7] += arg1;
                    this.field7581[var7] += arg2;
                    this.field7497[var7] += arg3;
                }
            } else if (arg0 == 2) {
                for (int var8 = 0; var8 < this.field7499; var8++) {
                    this.field7540[var8] -= class88.field1002;
                    this.field7581[var8] -= class335.field5232;
                    this.field7497[var8] -= class476.field6924;
                    if (arg3 != 0) {
                        int var9 = class298.field4704[arg3];
                        int var10 = class298.field4703[arg3];
                        int var11 = this.field7581[var8] * var9 + this.field7540[var8] * var10 + 16383 >> 14;
                        this.field7581[var8] = this.field7581[var8] * var10 + 16383 - (this.field7540[var8] * var9) >> 14;
                        this.field7540[var8] = var11;
                    }
                    if (arg1 != 0) {
                        int var12 = class298.field4704[arg1];
                        int var13 = class298.field4703[arg1];
                        int var14 = this.field7581[var8] * var13 + 16383 - (this.field7497[var8] * var12) >> 14;
                        this.field7497[var8] = this.field7497[var8] * var13 + (this.field7581[var8] * var12 + 16383) >> 14;
                        this.field7581[var8] = var14;
                    }
                    if (arg2 != 0) {
                        int var15 = class298.field4704[arg2];
                        int var16 = class298.field4703[arg2];
                        int var17 = this.field7497[var8] * var15 + (this.field7540[var8] * var16) + 16383 >> 14;
                        this.field7497[var8] = this.field7497[var8] * var16 - (this.field7540[var8] * var15 - 16383) >> 14;
                        this.field7540[var8] = var17;
                    }
                    this.field7540[var8] += class88.field1002;
                    this.field7581[var8] += class335.field5232;
                    this.field7497[var8] += class476.field6924;
                }
            } else if (arg0 == 3) {
                for (int var18 = 0; var18 < this.field7499; var18++) {
                    this.field7540[var18] -= class88.field1002;
                    this.field7581[var18] -= class335.field5232;
                    this.field7497[var18] -= class476.field6924;
                    this.field7540[var18] = this.field7540[var18] * arg1 / 128;
                    this.field7581[var18] = this.field7581[var18] * arg2 / 128;
                    this.field7497[var18] = this.field7497[var18] * arg3 / 128;
                    this.field7540[var18] += class88.field1002;
                    this.field7581[var18] += class335.field5232;
                    this.field7497[var18] += class476.field6924;
                }
            } else if (arg0 == 5) {
                for (int var19 = 0; var19 < this.field7536; var19++) {
                    int var20 = (this.field7572[var19] & 0xFF) + arg1 * 8;
                    if (var20 < 0) {
                        var20 = 0;
                    } else if (var20 > 255) {
                        var20 = 255;
                    }
                    this.field7572[var19] = (byte) var20;
                }
                if (this.field7498 != null) {
                    this.field7498.field8831 = null;
                }
                if (this.field7595 != null) {
                    for (int var21 = 0; var21 < this.field7515; var21++) {
                        class786 var22 = this.field7595[var21];
                        class435 var23 = this.field7508[var21];
                        var23.field6380 = var23.field6380 & 0xFFFFFF | 255 - (this.field7572[var22.field11480] & 0xFF) << 24;
                    }
                }
            } else if (arg0 == 7) {
                for (int var24 = 0; var24 < this.field7536; var24++) {
                    int var25 = this.field7590[var24] & 0xFFFF;
                    int var26 = (var25 & 0xFFE2) >> 10;
                    int var27 = (var25 & 0x3C3) >> 7;
                    int var28 = arg1 + var26 & 0x3F;
                    int var29 = arg2 / 4 + var27;
                    int var30 = var25 & 0x7F;
                    int var31 = arg3 + var30;
                    if (var29 < 0) {
                        var29 = 0;
                    } else if (var29 > 7) {
                        var29 = 7;
                    }
                    if (var31 < 0) {
                        var31 = 0;
                    } else if (var31 > 127) {
                        var31 = 127;
                    }
                    this.field7590[var24] = (short) class544.method4107(class544.method4107(var29 << 7, var28 << 10), var31);
                }
                if (this.field7498 != null) {
                    this.field7498.field8831 = null;
                }
                if (this.field7595 != null) {
                    for (int var32 = 0; var32 < this.field7515; var32++) {
                        class786 var33 = this.field7595[var32];
                        class435 var34 = this.field7508[var32];
                        var34.field6380 = class172.field2403[this.field7590[var33.field11480] & 0xFFFF] & 0xFFFFFF | var34.field6380 & 0xFF000000;
                    }
                }
            } else if (arg0 == 8) {
                for (int var35 = 0; var35 < this.field7515; var35++) {
                    class435 var36 = this.field7508[var35];
                    var36.field6377 += arg1;
                    var36.field6382 += arg2;
                }
            } else if (arg0 == 10) {
                for (int var37 = 0; var37 < this.field7515; var37++) {
                    class435 var38 = this.field7508[var37];
                    var38.field6384 = var38.field6384 * arg2 >> 7;
                    var38.field6381 = var38.field6381 * arg1 >> 7;
                }
            } else if (arg0 == 9) {
                for (int var39 = 0; var39 < this.field7515; var39++) {
                    class435 var40 = this.field7508[var39];
                    var40.field6378 = var40.field6378 + arg1 & 0x3FFF;
                }
            }
        } catch (RuntimeException var42) {
            throw class759.method5498(var42, field7616[53] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lqq;IZ)V")
    public final void method304(class501 arg0, int arg1, boolean arg2) {
        try {
            field7509++;
            if (this.field7584 != null) {
                int[] var4 = new int[3];
                for (int var5 = 0; var5 < this.field7499; var5++) {
                    if ((this.field7584[var5] & arg1) != 0) {
                        if (arg2) {
                            arg0.method2380(this.field7540[var5], this.field7581[var5], this.field7497[var5], var4);
                        } else {
                            arg0.method2392(this.field7540[var5], this.field7581[var5], this.field7497[var5], var4);
                        }
                        this.field7540[var5] = var4[0];
                        this.field7581[var5] = var4[1];
                        this.field7497[var5] = var4[2];
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7616[60] + (arg0 == null ? field7616[1] : field7616[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "RA", descriptor = "()I")
    public final int method341() {
        try {
            field7493++;
            if (!this.field7521) {
                this.method3946((byte) 14);
            }
            return this.field7548;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[46] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "(III)V")
    public final void method298(int arg0, int arg1, int arg2) {
        try {
            for (int var4 = 0; var4 < this.field7499; var4++) {
                if (arg0 != 0) {
                    this.field7540[var4] += arg0;
                }
                if (arg1 != 0) {
                    this.field7581[var4] += arg1;
                }
                if (arg2 != 0) {
                    this.field7497[var4] += arg2;
                }
            }
            field7565++;
            if (this.field7587 != null) {
                this.field7587.field8831 = null;
            }
            this.field7521 = false;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7616[38] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "()I")
    public final int method336() {
        try {
            field7524++;
            if (!this.field7521) {
                this.method3946((byte) -114);
            }
            return this.field7576;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[55] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "LA", descriptor = "(I)V")
    public final void method348(int arg0) {
        try {
            this.field7602 = (short) arg0;
            field7570++;
            if (this.field7498 != null) {
                this.field7498.field8831 = null;
            }
            if (this.field7522 != null) {
                this.field7522.field8831 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7616[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lqq;Lng;I)V")
    public final void method333(class501 arg0, class359 arg1, int arg2) {
        try {
            field7606++;
            if (this.field7582 != 0) {
                class768 var4 = this.field7559.field2882;
                class768 var5 = (class768) arg0;
                if (!this.field7521) {
                    this.method3946((byte) -86);
                }
                class248.field3872 = var4.field11095 * var5.field11128 + var4.field11125 * var5.field11118 + var4.field11105 * var5.field11106 + var4.field11128;
                class157.field1957 = var4.field11095 * var5.field11125 + var4.field11125 * var5.field11110 + var4.field11105 * var5.field11098;
                float var6 = (float) this.field7552 * class157.field1957 + class248.field3872;
                float var7 = (float) this.field7542 * class157.field1957 + class248.field3872;
                float var8;
                float var9;
                if (var7 < var6) {
                    var8 = (float) this.field7547 + var6;
                    var9 = (float) (-this.field7547) + var7;
                } else {
                    var9 = var6 - (float) this.field7547;
                    var8 = (float) this.field7547 + var7;
                }
                if (!(this.field7559.field2973 <= var9) && !((float) this.field7559.field2963 >= var8)) {
                    class573.field8469 = var4.field11114 * var5.field11125 + var4.field11098 * var5.field11110 + var4.field11090 * var5.field11098;
                    class203.field3155 = var4.field11114 * var5.field11128 + var4.field11098 * var5.field11118 + var4.field11090 * var5.field11106 + var4.field11106;
                    float var10 = (float) this.field7552 * class573.field8469 + class203.field3155;
                    float var11 = (float) this.field7542 * class573.field8469 + class203.field3155;
                    float var12;
                    float var13;
                    if ((var11 < var10)) {
                        var13 = ((float) (-this.field7547) + var11) * (float) this.field7559.field2941;
                        var12 = ((float) this.field7547 + var10) * (float) this.field7559.field2941;
                    } else {
                        var12 = ((float) this.field7547 + var11) * (float) this.field7559.field2941;
                        var13 = ((float) (-this.field7547) + var10) * (float) this.field7559.field2941;
                    }
                    if (!(this.field7559.field2916 <= var13 / var8) && !(var12 / var8 <= this.field7559.field2992)) {
                        class614.field8968 = var4.field11092 * var5.field11125 + var4.field11110 * var5.field11110 + var4.field11097 * var5.field11098;
                        class753.field10961 = var4.field11092 * var5.field11128 + var4.field11110 * var5.field11118 + var4.field11097 * var5.field11106 + var4.field11118;
                        float var14 = (float) this.field7552 * class614.field8968 + class753.field10961;
                        float var15 = (float) this.field7542 * class614.field8968 + class753.field10961;
                        float var16;
                        float var17;
                        if (var14 > var15) {
                            var16 = (var15 - (float) this.field7547) * (float) this.field7559.field2949;
                            var17 = ((float) this.field7547 + var14) * (float) this.field7559.field2949;
                        } else {
                            var17 = ((float) this.field7547 + var15) * (float) this.field7559.field2949;
                            var16 = (var14 - (float) this.field7547) * (float) this.field7559.field2949;
                        }
                        if (!(this.field7559.field2970 <= var16 / var8) && !(var17 / var8 <= this.field7559.field2920)) {
                            if (arg1 != null || this.field7595 != null) {
                                class659.field9502 = var4.field11095 * var5.field11095 + var4.field11125 * var5.field11092 + var4.field11105 * var5.field11114;
                                class575.field8499 = var4.field11092 * var5.field11105 + var4.field11110 * var5.field11097 + var4.field11097 * var5.field11090;
                                class779.field11340 = var4.field11114 * var5.field11105 + var4.field11098 * var5.field11097 + var4.field11090 * var5.field11090;
                                class423.field6228 = var4.field11092 * var5.field11095 + var4.field11110 * var5.field11092 + var4.field11097 * var5.field11114;
                                class208.field3187 = var4.field11114 * var5.field11095 + var4.field11098 * var5.field11092 + var4.field11090 * var5.field11114;
                                class408.field6044 = var4.field11095 * var5.field11105 + var4.field11125 * var5.field11097 + var4.field11105 * var5.field11090;
                            }
                            if (arg1 != null) {
                                boolean var18 = false;
                                boolean var19 = true;
                                int var20 = this.field7578 + this.field7548 >> 1;
                                int var21 = this.field7576 + this.field7544 >> 1;
                                int var22 = (int) ((float) var21 * class208.field3187 + (float) this.field7552 * class573.field8469 + (float) var20 * class779.field11340 + class203.field3155);
                                int var23 = (int) ((float) var21 * class423.field6228 + (float) this.field7552 * class614.field8968 + (float) var20 * class575.field8499 + class753.field10961);
                                int var24 = (int) ((float) var21 * class659.field9502 + (float) this.field7552 * class157.field1957 + (float) var20 * class408.field6044 + class248.field3872);
                                if (var24 < this.field7559.field2963) {
                                    var18 = true;
                                } else {
                                    arg1.field5494 = this.field7559.field2941 * var22 / var24 + this.field7559.field2951;
                                    arg1.field5493 = this.field7559.field2949 * var23 / var24 + this.field7559.field2950;
                                }
                                int var25 = (int) ((float) var21 * class208.field3187 + (float) this.field7542 * class573.field8469 + (float) var20 * class779.field11340 + class203.field3155);
                                int var26 = (int) ((float) var21 * class423.field6228 + (float) this.field7542 * class614.field8968 + (float) var20 * class575.field8499 + class753.field10961);
                                int var27 = (int) ((float) var21 * class659.field9502 + (float) this.field7542 * class157.field1957 + (float) var20 * class408.field6044 + class248.field3872);
                                if (var27 >= this.field7559.field2963) {
                                    arg1.field5497 = this.field7559.field2949 * var26 / var27 + this.field7559.field2950;
                                    arg1.field5496 = this.field7559.field2941 * var25 / var27 + this.field7559.field2951;
                                } else {
                                    var18 = true;
                                }
                                if (var18) {
                                    if (this.field7559.field2963 > var24 && var27 < this.field7559.field2963) {
                                        var19 = false;
                                    } else if (this.field7559.field2963 > var24) {
                                        int var31 = (var27 - this.field7559.field2963 << 16) / (var27 - var24);
                                        int var32 = ((var25 - var22) * var31 >> 16) + var25;
                                        arg1.field5494 = this.field7559.field2951 + (this.field7559.field2941 * var32 / this.field7559.field2963);
                                        int var33 = var26 + ((var26 - var23) * var31 >> 16);
                                        arg1.field5493 = this.field7559.field2949 * var33 / this.field7559.field2963 + this.field7559.field2950;
                                    } else if (var27 < this.field7559.field2963) {
                                        int var28 = (var24 - this.field7559.field2963 << 16) / (var24 - var27);
                                        int var29 = var22 + ((var22 - var25) * var28 >> 16);
                                        int var30 = var23 + ((var23 - var26) * var28 >> 16);
                                        arg1.field5494 = this.field7559.field2951 + (this.field7559.field2941 * var29 / this.field7559.field2963);
                                        arg1.field5493 = this.field7559.field2949 * var30 / this.field7559.field2963 + this.field7559.field2950;
                                    }
                                }
                                if (var19) {
                                    if (var24 <= var27) {
                                        arg1.field5495 = (this.field7547 + var25) * this.field7559.field2941 / var27 + this.field7559.field2951 - arg1.field5496;
                                    } else {
                                        arg1.field5495 = (this.field7547 + var22) * this.field7559.field2941 / var24 + this.field7559.field2951 - arg1.field5494;
                                    }
                                    arg1.field5492 = true;
                                }
                            }
                            this.field7559.method1704((byte) -104);
                            this.field7559.method1689(34166, var5);
                            this.method3951(-56);
                            this.field7559.method1731(-25384);
                            this.method3948(780434311);
                        }
                    }
                }
            }
        } catch (RuntimeException var35) {
            throw class759.method5498(var35, field7616[34] + (arg0 == null ? field7616[1] : field7616[0]) + ',' + (arg1 == null ? field7616[1] : field7616[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "FA", descriptor = "(I)V")
    public final void method325(int arg0) {
        try {
            field7598++;
            int var2 = class298.field4704[arg0];
            int var3 = class298.field4703[arg0];
            for (int var4 = 0; var4 < this.field7499; var4++) {
                int var5 = this.field7581[var4] * var3 - (this.field7497[var4] * var2) >> 14;
                this.field7497[var4] = this.field7581[var4] * var2 + this.field7497[var4] * var3 >> 14;
                this.field7581[var4] = var5;
            }
            this.field7521 = false;
            if (this.field7587 != null) {
                this.field7587.field8831 = null;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7616[54] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    private final void method3946(byte arg0) {
        try {
            field7601++;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = 32767;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = -32768;
            int var8 = 0;
            int var9 = 0;
            for (int var10 = 0; var10 < this.field7499; var10++) {
                int var11 = this.field7540[var10];
                int var12 = this.field7581[var10];
                if (var12 > var6) {
                    var6 = var12;
                }
                if (var11 < var2) {
                    var2 = var11;
                }
                if (var12 < var3) {
                    var3 = var12;
                }
                if (var11 > var5) {
                    var5 = var11;
                }
                int var13 = this.field7497[var10];
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
                int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
                if (var15 > var9) {
                    var9 = var15;
                }
            }
            this.field7548 = (short) var5;
            this.field7578 = (short) var2;
            this.field7576 = (short) var7;
            this.field7544 = (short) var4;
            this.field7542 = (short) var6;
            this.field7552 = (short) var3;
            this.field7547 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
            int var16 = 25 % ((arg0 + 52) / 33);
            this.field7597 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
            this.field7521 = true;
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field7616[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "da", descriptor = "()I")
    public final int method310() {
        try {
            field7510++;
            return this.field7602;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[22] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "WA", descriptor = "()I")
    public final int method326() {
        try {
            field7560++;
            return this.field7553;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[6] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLfi;)V")
    private final void method3947(byte arg0, class582 arg1) {
        try {
            if (this.field7582 > this.field7559.field2998.length) {
                this.field7559.field2998 = new int[this.field7582];
                this.field7559.field3000 = new int[this.field7582];
            }
            field7505++;
            int[] var3 = this.field7559.field2998;
            int[] var4 = this.field7559.field3000;
            for (int var5 = 0; var5 < this.field7499; var5++) {
                int var6 = (this.field7540[var5] - (this.field7581[var5] * this.field7559.field2913 >> 8) >> this.field7559.field2852) - arg1.field8607;
                int var7 = (this.field7497[var5] - (this.field7581[var5] * this.field7559.field2995 >> 8) >> this.field7559.field2852) - arg1.field8613;
                int var8 = this.field7519[var5];
                int var9 = this.field7519[var5 + 1];
                for (int var10 = var8; var10 < var9; var10++) {
                    int var11 = this.field7526[var10] - 1;
                    if (var11 == -1) {
                        break;
                    }
                    var3[var11] = var6;
                    var4[var11] = var7;
                }
            }
            if (arg0 >= 77) {
                for (int var12 = 0; var12 < this.field7538; var12++) {
                    if (this.field7572 == null || this.field7572[var12] <= 128) {
                        short var13 = this.field7554[var12];
                        short var14 = this.field7566[var12];
                        short var15 = this.field7500[var12];
                        int var16 = var3[var13];
                        int var17 = var3[var14];
                        int var18 = var3[var15];
                        int var19 = var4[var13];
                        int var20 = var4[var14];
                        int var21 = var4[var15];
                        if (((var16 - var17) * (var20 - var21) - ((var20 - var19) * (var18 - var17))) > 0) {
                            arg1.method4354(var20, var18, var21, var19, (byte) -92, var16, var17);
                        }
                    }
                }
            }
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field7616[49] + arg0 + ',' + (arg1 == null ? field7616[1] : field7616[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILqq;ZII)Z")
    public final boolean method314(int arg0, int arg1, class501 arg2, boolean arg3, int arg4, int arg5) {
        try {
            field7579++;
            return this.method3942(arg3, -72, arg5, arg1, arg2, arg4, arg0);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field7616[21] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7616[1] : field7616[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method300(class497 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            field7545++;
            class519 var6 = (class519) arg0;
            if (this.field7536 != 0 && var6.field7536 != 0) {
                int var7 = var6.field7499;
                int[] var8 = var6.field7540;
                int[] var9 = var6.field7581;
                int[] var10 = var6.field7497;
                short[] var11 = var6.field7611;
                short[] var12 = var6.field7569;
                short[] var13 = var6.field7589;
                byte[] var14 = var6.field7574;
                byte[] var15;
                short[] var16;
                short[] var17;
                short[] var18;
                if (this.field7558 == null) {
                    var15 = null;
                    var16 = null;
                    var17 = null;
                    var18 = null;
                } else {
                    var16 = this.field7558.field8630;
                    var17 = this.field7558.field8631;
                    var15 = this.field7558.field8636;
                    var18 = this.field7558.field8635;
                }
                short[] var19;
                short[] var20;
                short[] var21;
                byte[] var22;
                if (var6.field7558 == null) {
                    var19 = null;
                    var20 = null;
                    var21 = null;
                    var22 = null;
                } else {
                    var20 = var6.field7558.field8631;
                    var22 = var6.field7558.field8636;
                    var19 = var6.field7558.field8635;
                    var21 = var6.field7558.field8630;
                }
                int[] var23 = var6.field7519;
                short[] var24 = var6.field7526;
                if (!var6.field7521) {
                    var6.method3946((byte) -89);
                }
                short var25 = var6.field7552;
                short var26 = var6.field7542;
                short var27 = var6.field7578;
                short var28 = var6.field7548;
                short var29 = var6.field7544;
                short var30 = var6.field7576;
                for (int var31 = 0; var31 < this.field7499; var31++) {
                    int var32 = this.field7581[var31] - arg2;
                    if (var32 >= var25 && var32 <= var26) {
                        int var33 = this.field7540[var31] - arg1;
                        if (var27 <= var33 && var28 >= var33) {
                            int var34 = this.field7497[var31] - arg3;
                            if (var29 <= var34 && var34 <= var30) {
                                int var35 = -1;
                                int var36 = this.field7519[var31];
                                int var37 = this.field7519[var31 + 1];
                                for (int var38 = var36; var38 < var37; var38++) {
                                    var35 = this.field7526[var38] - 1;
                                    if (var35 == -1 || this.field7574[var35] != 0) {
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
                                                if (var16 == null) {
                                                    this.field7558 = new class586();
                                                    var16 = this.field7558.field8630 = class550.method4144(-127, this.field7611);
                                                    var17 = this.field7558.field8631 = class550.method4144(80, this.field7569);
                                                    var18 = this.field7558.field8635 = class550.method4144(14, this.field7589);
                                                    var15 = this.field7558.field8636 = class768.method5540(0, this.field7574);
                                                }
                                                if (var21 == null) {
                                                    class586 var44 = var6.field7558 = new class586();
                                                    var21 = var44.field8630 = class550.method4144(-127, var11);
                                                    var20 = var44.field8631 = class550.method4144(-126, var12);
                                                    var19 = var44.field8635 = class550.method4144(13, var13);
                                                    var22 = var44.field8636 = class768.method5540(0, var14);
                                                }
                                                short var45 = this.field7611[var35];
                                                short var46 = this.field7569[var35];
                                                short var47 = this.field7589[var35];
                                                int var48 = var23[var39];
                                                byte var49 = this.field7574[var35];
                                                int var50 = var23[var39 + 1];
                                                for (int var51 = var48; var51 < var50; var51++) {
                                                    int var52 = var24[var51] - 1;
                                                    if (var52 == -1) {
                                                        break;
                                                    }
                                                    if (var22[var52] != 0) {
                                                        var21[var52] += var45;
                                                        var20[var52] += var46;
                                                        var19[var52] += var47;
                                                        var22[var52] += var49;
                                                    }
                                                }
                                                short var53 = var11[var41];
                                                int var54 = this.field7519[var31 + 1];
                                                short var55 = var13[var41];
                                                short var56 = var12[var41];
                                                byte var57 = var14[var41];
                                                int var58 = this.field7519[var31];
                                                for (int var59 = var58; var59 < var54; var59++) {
                                                    int var60 = this.field7526[var59] - 1;
                                                    if (var60 == -1) {
                                                        break;
                                                    }
                                                    if (var15[var60] != 0) {
                                                        var16[var60] += var53;
                                                        var17[var60] += var56;
                                                        var18[var60] += var55;
                                                        var15[var60] += var57;
                                                    }
                                                }
                                                if (this.field7522 == null && this.field7498 != null) {
                                                    this.field7498.field8831 = null;
                                                }
                                                if (this.field7522 != null) {
                                                    this.field7522.field8831 = null;
                                                }
                                                if (var6.field7522 == null && var6.field7498 != null) {
                                                    var6.field7498.field8831 = null;
                                                }
                                                if (var6.field7522 != null) {
                                                    var6.field7522.field8831 = null;
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
        } catch (RuntimeException var62) {
            throw class759.method5498(var62, field7616[31] + (arg0 == null ? field7616[1] : field7616[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "()[Lhja;")
    public final class426[] method345() {
        try {
            field7501++;
            return this.field7532;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[9] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method319(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        try {
            field7516++;
            int var9 = arg1.length;
            if (arg0 == 0) {
                arg4 <<= 0x4;
                arg3 <<= 0x4;
                arg2 <<= 0x4;
                int var10 = 0;
                class476.field6924 = 0;
                class88.field1002 = 0;
                class335.field5232 = 0;
                for (int var11 = 0; var11 < var9; var11++) {
                    int var12 = arg1[var11];
                    if (var12 < this.field7593.length) {
                        int[] var13 = this.field7593[var12];
                        for (int var14 = 0; var14 < var13.length; var14++) {
                            int var15 = var13[var14];
                            if (this.field7584 == null || (this.field7584[var15] & arg6) != 0) {
                                class88.field1002 += this.field7540[var15];
                                class335.field5232 += this.field7581[var15];
                                class476.field6924 += this.field7497[var15];
                                var10++;
                            }
                        }
                    }
                }
                if (var10 <= 0) {
                    class476.field6924 = arg4;
                    class88.field1002 = arg2;
                    class335.field5232 = arg3;
                } else {
                    class476.field6924 = class476.field6924 / var10 + arg4;
                    class568.field8402 = true;
                    class335.field5232 = class335.field5232 / var10 + arg3;
                    class88.field1002 = class88.field1002 / var10 + arg2;
                }
            } else if (arg0 == 1) {
                if (arg7 != null) {
                    int var16 = arg7[0] * arg2 + (arg7[2] * arg4) + arg7[1] * arg3 + 8192 >> 14;
                    int var17 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                    int var18 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                    arg4 = var18;
                    arg3 = var17;
                    arg2 = var16;
                }
                arg4 <<= 0x4;
                arg3 <<= 0x4;
                arg2 <<= 0x4;
                for (int var19 = 0; var19 < var9; var19++) {
                    int var20 = arg1[var19];
                    if (var20 < this.field7593.length) {
                        int[] var21 = this.field7593[var20];
                        for (int var22 = 0; var22 < var21.length; var22++) {
                            int var23 = var21[var22];
                            if (this.field7584 == null || (this.field7584[var23] & arg6) != 0) {
                                this.field7540[var23] += arg2;
                                this.field7581[var23] += arg3;
                                this.field7497[var23] += arg4;
                            }
                        }
                    }
                }
            } else if (arg0 == 2) {
                if (arg7 == null) {
                    for (int var84 = 0; var84 < var9; var84++) {
                        int var85 = arg1[var84];
                        if (this.field7593.length > var85) {
                            int[] var86 = this.field7593[var85];
                            for (int var87 = 0; var87 < var86.length; var87++) {
                                int var88 = var86[var87];
                                if (this.field7584 == null || (this.field7584[var88] & arg6) != 0) {
                                    this.field7540[var88] -= class88.field1002;
                                    this.field7581[var88] -= class335.field5232;
                                    this.field7497[var88] -= class476.field6924;
                                    if (arg4 != 0) {
                                        int var89 = class298.field4704[arg4];
                                        int var90 = class298.field4703[arg4];
                                        int var91 = this.field7581[var88] * var89 + this.field7540[var88] * var90 + 16383 >> 14;
                                        this.field7581[var88] = this.field7581[var88] * var90 + 16383 - this.field7540[var88] * var89 >> 14;
                                        this.field7540[var88] = var91;
                                    }
                                    if (arg2 != 0) {
                                        int var92 = class298.field4704[arg2];
                                        int var93 = class298.field4703[arg2];
                                        int var94 = this.field7581[var88] * var93 + 16383 - (this.field7497[var88] * var92) >> 14;
                                        this.field7497[var88] = this.field7581[var88] * var92 + this.field7497[var88] * var93 + 16383 >> 14;
                                        this.field7581[var88] = var94;
                                    }
                                    if (arg3 != 0) {
                                        int var95 = class298.field4704[arg3];
                                        int var96 = class298.field4703[arg3];
                                        int var97 = this.field7540[var88] * var96 + this.field7497[var88] * var95 + 16383 >> 14;
                                        this.field7497[var88] = this.field7497[var88] * var96 + 16383 - (this.field7540[var88] * var95) >> 14;
                                        this.field7540[var88] = var97;
                                    }
                                    this.field7540[var88] += class88.field1002;
                                    this.field7581[var88] += class335.field5232;
                                    this.field7497[var88] += class476.field6924;
                                }
                            }
                        }
                    }
                    if (arg5) {
                        for (int var98 = 0; var98 < var9; var98++) {
                            int var99 = arg1[var98];
                            if (var99 < this.field7593.length) {
                                int[] var100 = this.field7593[var99];
                                for (int var101 = 0; var101 < var100.length; var101++) {
                                    int var102 = var100[var101];
                                    if (this.field7584 == null || (arg6 & this.field7584[var102]) != 0) {
                                        int var103 = this.field7519[var102];
                                        int var104 = this.field7519[var102 + 1];
                                        for (int var105 = var103; var105 < var104; var105++) {
                                            int var106 = this.field7526[var105] - 1;
                                            if (var106 == -1) {
                                                break;
                                            }
                                            if (arg4 != 0) {
                                                int var107 = class298.field4704[arg4];
                                                int var108 = class298.field4703[arg4];
                                                int var109 = this.field7611[var106] * var108 + this.field7569[var106] * var107 + 16383 >> 14;
                                                this.field7569[var106] = (short) (this.field7569[var106] * var108 + 16383 - (this.field7611[var106] * var107) >> 14);
                                                this.field7611[var106] = (short) var109;
                                            }
                                            if (arg2 != 0) {
                                                int var110 = class298.field4704[arg2];
                                                int var111 = class298.field4703[arg2];
                                                int var112 = this.field7569[var106] * var111 + 16383 - (this.field7589[var106] * var110) >> 14;
                                                this.field7589[var106] = (short) (this.field7589[var106] * var111 + this.field7569[var106] * var110 + 16383 >> 14);
                                                this.field7569[var106] = (short) var112;
                                            }
                                            if (arg3 != 0) {
                                                int var113 = class298.field4704[arg3];
                                                int var114 = class298.field4703[arg3];
                                                int var115 = this.field7611[var106] * var114 + this.field7589[var106] * var113 + 16383 >> 14;
                                                this.field7589[var106] = (short) (this.field7589[var106] * var114 + 16383 - (this.field7611[var106] * var113) >> 14);
                                                this.field7611[var106] = (short) var115;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (this.field7522 == null && this.field7498 != null) {
                            this.field7498.field8831 = null;
                        }
                        if (this.field7522 != null) {
                            this.field7522.field8831 = null;
                        }
                    }
                } else {
                    int var24 = arg7[9] << 4;
                    int var25 = arg7[10] << 4;
                    int var26 = arg7[11] << 4;
                    int var27 = arg7[12] << 4;
                    int var28 = arg7[13] << 4;
                    int var29 = arg7[14] << 4;
                    if (class568.field8402) {
                        int var30 = arg7[6] * class476.field6924 + arg7[0] * class88.field1002 + arg7[3] * class335.field5232 + 8192 >> 14;
                        int var31 = arg7[4] * class335.field5232 + arg7[1] * class88.field1002 + arg7[7] * class476.field6924 + 8192 >> 14;
                        int var32 = var27 + var30;
                        int var33 = var28 + var31;
                        int var34 = arg7[2] * class88.field1002 + (arg7[5] * class335.field5232) - (-(arg7[8] * class476.field6924) + -8192) >> 14;
                        class88.field1002 = var32;
                        int var35 = var29 + var34;
                        class335.field5232 = var33;
                        class476.field6924 = var35;
                        class568.field8402 = false;
                    }
                    int[] var36 = new int[9];
                    int var37 = class298.field4703[arg2];
                    int var38 = class298.field4704[arg2];
                    int var39 = class298.field4703[arg3];
                    int var40 = class298.field4704[arg3];
                    int var41 = class298.field4703[arg4];
                    int var42 = class298.field4704[arg4];
                    int var43 = var38 * var41 + 8192 >> 14;
                    int var44 = var38 * var42 + 8192 >> 14;
                    var36[8] = var37 * var39 + 8192 >> 14;
                    var36[0] = var39 * var41 + var40 * var44 + 8192 >> 14;
                    var36[3] = var37 * var42 + 8192 >> 14;
                    var36[2] = var37 * var40 + 8192 >> 14;
                    var36[6] = -var40 * var41 + var39 * var44 + 8192 >> 14;
                    var36[7] = var39 * var43 + var40 * var42 + 8192 >> 14;
                    var36[1] = -var39 * var42 + (var40 * var43) + 8192 >> 14;
                    var36[4] = var37 * var41 + 8192 >> 14;
                    var36[5] = -var38;
                    int var45 = var36[0] * -class88.field1002 + var36[1] * -class335.field5232 + var36[2] * -class476.field6924 + 8192 >> 14;
                    int var46 = var36[3] * -class88.field1002 + var36[5] * -class476.field6924 + var36[4] * -class335.field5232 + 8192 >> 14;
                    int var47 = var36[8] * -class476.field6924 + var36[6] * -class88.field1002 + var36[7] * -class335.field5232 + 8192 >> 14;
                    int var48 = class88.field1002 + var45;
                    int var49 = class335.field5232 + var46;
                    int var50 = class476.field6924 + var47;
                    int[] var51 = new int[9];
                    for (int var52 = 0; var52 < 3; var52++) {
                        for (int var53 = 0; var53 < 3; var53++) {
                            int var54 = 0;
                            for (int var55 = 0; var55 < 3; var55++) {
                                var54 += arg7[var53 * 3 + var55] * var36[var52 * 3 + var55];
                            }
                            var51[var52 * 3 + var53] = var54 + 8192 >> 14;
                        }
                    }
                    int var56 = var36[2] * var29 + var36[1] * var28 + var36[0] * var27 + 8192 >> 14;
                    int var57 = var36[4] * var28 + var36[3] * var27 + var36[5] * var29 + 8192 >> 14;
                    int var58 = var48 + var56;
                    int var59 = var36[8] * var29 + var36[7] * var28 + var36[6] * var27 + 8192 >> 14;
                    int var60 = var49 + var57;
                    int var61 = var50 + var59;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 3; var63++) {
                        for (int var64 = 0; var64 < 3; var64++) {
                            int var65 = 0;
                            for (int var66 = 0; var66 < 3; var66++) {
                                var65 += arg7[var63 * 3 + var66] * var51[var66 * 3 + var64];
                            }
                            var62[var63 * 3 + var64] = var65 + 8192 >> 14;
                        }
                    }
                    int var67 = arg7[1] * var60 + arg7[0] * var58 + (arg7[2] * var61 - -8192) >> 14;
                    int var68 = arg7[5] * var61 + arg7[4] * var60 + arg7[3] * var58 + 8192 >> 14;
                    int var69 = var24 + var67;
                    int var70 = arg7[8] * var61 + arg7[7] * var60 + arg7[6] * var58 + 8192 >> 14;
                    int var71 = var25 + var68;
                    int var72 = var26 + var70;
                    for (int var73 = 0; var73 < var9; var73++) {
                        int var74 = arg1[var73];
                        if (this.field7593.length > var74) {
                            int[] var75 = this.field7593[var74];
                            for (int var76 = 0; var76 < var75.length; var76++) {
                                int var77 = var75[var76];
                                if (this.field7584 == null || (this.field7584[var77] & arg6) != 0) {
                                    int var78 = this.field7497[var77] * var62[2] + this.field7581[var77] * var62[1] + this.field7540[var77] * var62[0] + 8192 >> 14;
                                    int var79 = this.field7581[var77] * var62[4] + this.field7540[var77] * var62[3] + this.field7497[var77] * var62[5] + 8192 >> 14;
                                    int var80 = this.field7540[var77] * var62[6] + this.field7581[var77] * var62[7] + this.field7497[var77] * var62[8] + 8192 >> 14;
                                    int var81 = var71 + var79;
                                    int var82 = var69 + var78;
                                    this.field7540[var77] = var82;
                                    int var83 = var72 + var80;
                                    this.field7581[var77] = var81;
                                    this.field7497[var77] = var83;
                                }
                            }
                        }
                    }
                }
            } else if (arg0 == 3) {
                if (arg7 == null) {
                    for (int var166 = 0; var166 < var9; var166++) {
                        int var167 = arg1[var166];
                        if (this.field7593.length > var167) {
                            int[] var168 = this.field7593[var167];
                            for (int var169 = 0; var169 < var168.length; var169++) {
                                int var170 = var168[var169];
                                if (this.field7584 == null || (this.field7584[var170] & arg6) != 0) {
                                    this.field7540[var170] -= class88.field1002;
                                    this.field7581[var170] -= class335.field5232;
                                    this.field7497[var170] -= class476.field6924;
                                    this.field7540[var170] = this.field7540[var170] * arg2 >> 7;
                                    this.field7581[var170] = this.field7581[var170] * arg3 >> 7;
                                    this.field7497[var170] = this.field7497[var170] * arg4 >> 7;
                                    this.field7540[var170] += class88.field1002;
                                    this.field7581[var170] += class335.field5232;
                                    this.field7497[var170] += class476.field6924;
                                }
                            }
                        }
                    }
                } else {
                    int var116 = arg7[9] << 4;
                    int var117 = arg7[10] << 4;
                    int var118 = arg7[11] << 4;
                    int var119 = arg7[12] << 4;
                    int var120 = arg7[13] << 4;
                    int var121 = arg7[14] << 4;
                    if (class568.field8402) {
                        int var122 = arg7[0] * class88.field1002 + 8192 - (-(arg7[3] * class335.field5232) + -(arg7[6] * class476.field6924)) >> 14;
                        int var123 = arg7[7] * class476.field6924 + arg7[1] * class88.field1002 + (arg7[4] * class335.field5232) + 8192 >> 14;
                        int var124 = var119 + var122;
                        int var125 = var120 + var123;
                        int var126 = arg7[5] * class335.field5232 + arg7[2] * class88.field1002 + (arg7[8] * class476.field6924) + 8192 >> 14;
                        class335.field5232 = var125;
                        class88.field1002 = var124;
                        int var127 = var121 + var126;
                        class476.field6924 = var127;
                        class568.field8402 = false;
                    }
                    int var128 = arg2 << 15 >> 7;
                    int var129 = arg3 << 15 >> 7;
                    int var130 = arg4 << 15 >> 7;
                    int var131 = -class88.field1002 * var128 + 8192 >> 14;
                    int var132 = -class335.field5232 * var129 + 8192 >> 14;
                    int var133 = -class476.field6924 * var130 + 8192 >> 14;
                    int var134 = class88.field1002 + var131;
                    int var135 = class335.field5232 + var132;
                    int var136 = class476.field6924 + var133;
                    int[] var137 = new int[] { arg7[0] * var128 + 8192 >> 14, arg7[3] * var128 + 8192 >> 14, arg7[6] * var128 + 8192 >> 14, arg7[1] * var129 + 8192 >> 14, arg7[4] * var129 + 8192 >> 14, arg7[7] * var129 + 8192 >> 14, arg7[2] * var130 + 8192 >> 14, arg7[5] * var130 + 8192 >> 14, arg7[8] * var130 + 8192 >> 14 };
                    int var138 = var119 * var128 + 8192 >> 14;
                    int var139 = var120 * var129 + 8192 >> 14;
                    int var140 = var134 + var138;
                    int var141 = var121 * var130 + 8192 >> 14;
                    int var142 = var135 + var139;
                    int var143 = var136 + var141;
                    int[] var144 = new int[9];
                    for (int var145 = 0; var145 < 3; var145++) {
                        for (int var146 = 0; var146 < 3; var146++) {
                            int var147 = 0;
                            for (int var148 = 0; var148 < 3; var148++) {
                                var147 += arg7[var145 * 3 + var148] * var137[var146 + (var148 * 3)];
                            }
                            var144[var145 * 3 + var146] = var147 + 8192 >> 14;
                        }
                    }
                    int var149 = arg7[2] * var143 + arg7[0] * var140 + arg7[1] * var142 + 8192 >> 14;
                    int var150 = arg7[5] * var143 + arg7[4] * var142 + arg7[3] * var140 + 8192 >> 14;
                    int var151 = arg7[6] * var140 + arg7[7] * var142 + arg7[8] * var143 + 8192 >> 14;
                    int var152 = var116 + var149;
                    int var153 = var117 + var150;
                    int var154 = var118 + var151;
                    for (int var155 = 0; var155 < var9; var155++) {
                        int var156 = arg1[var155];
                        if (this.field7593.length > var156) {
                            int[] var157 = this.field7593[var156];
                            for (int var158 = 0; var158 < var157.length; var158++) {
                                int var159 = var157[var158];
                                if (this.field7584 == null || (this.field7584[var159] & arg6) != 0) {
                                    int var160 = this.field7540[var159] * var144[0] + this.field7581[var159] * var144[1] + this.field7497[var159] * var144[2] + 8192 >> 14;
                                    int var161 = this.field7581[var159] * var144[4] + this.field7540[var159] * var144[3] - (-(this.field7497[var159] * var144[5]) - 8192) >> 14;
                                    int var162 = this.field7581[var159] * var144[7] + this.field7540[var159] * var144[6] + this.field7497[var159] * var144[8] + 8192 >> 14;
                                    int var163 = var152 + var160;
                                    int var164 = var153 + var161;
                                    this.field7540[var159] = var163;
                                    int var165 = var154 + var162;
                                    this.field7581[var159] = var164;
                                    this.field7497[var159] = var165;
                                }
                            }
                        }
                    }
                }
            } else if (arg0 == 5) {
                if (this.field7594 != null) {
                    for (int var171 = 0; var171 < var9; var171++) {
                        int var172 = arg1[var171];
                        if (this.field7594.length > var172) {
                            int[] var173 = this.field7594[var172];
                            for (int var174 = 0; var174 < var173.length; var174++) {
                                int var175 = var173[var174];
                                if (this.field7495 == null || (arg6 & this.field7495[var175]) != 0) {
                                    int var176 = (this.field7572[var175] & 0xFF) + arg2 * 8;
                                    if (var176 < 0) {
                                        var176 = 0;
                                    } else if (var176 > 255) {
                                        var176 = 255;
                                    }
                                    this.field7572[var175] = (byte) var176;
                                    if (this.field7498 != null) {
                                        this.field7498.field8831 = null;
                                    }
                                }
                            }
                        }
                    }
                    if (this.field7595 != null) {
                        for (int var177 = 0; var177 < this.field7515; var177++) {
                            class786 var178 = this.field7595[var177];
                            class435 var179 = this.field7508[var177];
                            var179.field6380 = var179.field6380 & 0xFFFFFF | 255 - (this.field7572[var178.field11480] & 0xFF) << 24;
                        }
                    }
                }
            } else if (arg0 == 7) {
                if (this.field7594 != null) {
                    for (int var180 = 0; var180 < var9; var180++) {
                        int var181 = arg1[var180];
                        if (this.field7594.length > var181) {
                            int[] var182 = this.field7594[var181];
                            for (int var183 = 0; var183 < var182.length; var183++) {
                                int var184 = var182[var183];
                                if (this.field7495 == null || (arg6 & this.field7495[var184]) != 0) {
                                    int var185 = this.field7590[var184] & 0xFFFF;
                                    int var186 = (var185 & 0xFD66) >> 10;
                                    int var187 = var185 >> 7 & 0x7;
                                    int var188 = var185 & 0x7F;
                                    int var189 = arg3 / 4 + var187;
                                    int var190 = arg2 + var186 & 0x3F;
                                    int var191 = arg4 + var188;
                                    if (var189 < 0) {
                                        var189 = 0;
                                    } else if (var189 > 7) {
                                        var189 = 7;
                                    }
                                    if (var191 < 0) {
                                        var191 = 0;
                                    } else if (var191 > 127) {
                                        var191 = 127;
                                    }
                                    this.field7590[var184] = (short) class544.method4107(var191, class544.method4107(var189 << 7, var190 << 10));
                                    if (this.field7498 != null) {
                                        this.field7498.field8831 = null;
                                    }
                                }
                            }
                        }
                    }
                    if (this.field7595 != null) {
                        for (int var192 = 0; var192 < this.field7515; var192++) {
                            class786 var193 = this.field7595[var192];
                            class435 var194 = this.field7508[var192];
                            var194.field6380 = class172.field2403[this.field7590[var193.field11480] & 0xFFFF] & 0xFFFFFF | var194.field6380 & 0xFF000000;
                        }
                    }
                }
            } else if (arg0 == 8) {
                if (this.field7535 != null) {
                    for (int var195 = 0; var195 < var9; var195++) {
                        int var196 = arg1[var195];
                        if (this.field7535.length > var196) {
                            int[] var197 = this.field7535[var196];
                            for (int var198 = 0; var198 < var197.length; var198++) {
                                class435 var199 = this.field7508[var197[var198]];
                                var199.field6377 += arg2;
                                var199.field6382 += arg3;
                            }
                        }
                    }
                }
            } else if (arg0 == 10) {
                if (this.field7535 != null) {
                    for (int var200 = 0; var200 < var9; var200++) {
                        int var201 = arg1[var200];
                        if (this.field7535.length > var201) {
                            int[] var202 = this.field7535[var201];
                            for (int var203 = 0; var203 < var202.length; var203++) {
                                class435 var204 = this.field7508[var202[var203]];
                                var204.field6384 = var204.field6384 * arg3 >> 7;
                                var204.field6381 = var204.field6381 * arg2 >> 7;
                            }
                        }
                    }
                }
            } else if (arg0 == 9 && this.field7535 != null) {
                for (int var205 = 0; var205 < var9; var205++) {
                    int var206 = arg1[var205];
                    if (var206 < this.field7535.length) {
                        int[] var207 = this.field7535[var206];
                        for (int var208 = 0; var208 < var207.length; var208++) {
                            class435 var209 = this.field7508[var207[var208]];
                            var209.field6378 = var209.field6378 + arg2 & 0x3FFF;
                        }
                    }
                }
            }
        } catch (RuntimeException var211) {
            throw class759.method5498(var211, field7616[40] + arg0 + ',' + (arg1 == null ? field7616[1] : field7616[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field7616[1] : field7616[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "()V")
    public final void method316() {
        try {
            field7603++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[59] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lqq;)V")
    public final void method349(class501 arg0) {
        try {
            field7591++;
            class768 var2 = (class768) arg0;
            if (this.field7557 != null) {
                for (int var3 = 0; var3 < this.field7557.length; var3++) {
                    class659 var4 = this.field7557[var3];
                    class659 var5 = var4;
                    if (var4.field9503 != null) {
                        var5 = var4.field9503;
                    }
                    var5.field9514 = (int) ((float) this.field7497[var4.field9511] * var2.field11114 + (float) this.field7581[var4.field9511] * var2.field11098 + (float) this.field7540[var4.field9511] * var2.field11090 + var2.field11106);
                    var5.field9499 = (int) ((float) this.field7497[var4.field9511] * var2.field11092 + (float) this.field7581[var4.field9511] * var2.field11110 + (float) this.field7540[var4.field9511] * var2.field11097 + var2.field11118);
                    var5.field9519 = (int) ((float) this.field7497[var4.field9511] * var2.field11095 + (float) this.field7581[var4.field9511] * var2.field11125 + (float) this.field7540[var4.field9511] * var2.field11105 + var2.field11128);
                    var5.field9516 = (int) ((float) this.field7497[var4.field9501] * var2.field11114 + (float) this.field7581[var4.field9501] * var2.field11098 + (float) this.field7540[var4.field9501] * var2.field11090 + var2.field11106);
                    var5.field9520 = (int) ((float) this.field7497[var4.field9501] * var2.field11092 + (float) this.field7581[var4.field9501] * var2.field11110 + (float) this.field7540[var4.field9501] * var2.field11097 + var2.field11118);
                    var5.field9507 = (int) ((float) this.field7497[var4.field9501] * var2.field11095 + (float) this.field7581[var4.field9501] * var2.field11125 + (float) this.field7540[var4.field9501] * var2.field11105 + var2.field11128);
                    var5.field9515 = (int) ((float) this.field7497[var4.field9521] * var2.field11114 + (float) this.field7581[var4.field9521] * var2.field11098 + (float) this.field7540[var4.field9521] * var2.field11090 + var2.field11106);
                    var5.field9505 = (int) ((float) this.field7497[var4.field9521] * var2.field11092 + (float) this.field7581[var4.field9521] * var2.field11110 + (float) this.field7540[var4.field9521] * var2.field11097 + var2.field11118);
                    var5.field9518 = (int) ((float) this.field7497[var4.field9521] * var2.field11095 + (float) this.field7581[var4.field9521] * var2.field11125 + (float) this.field7540[var4.field9521] * var2.field11105 + var2.field11128);
                }
            }
            if (this.field7532 != null) {
                for (int var6 = 0; var6 < this.field7532.length; var6++) {
                    class426 var7 = this.field7532[var6];
                    class426 var8 = var7;
                    if (var7.field6284 != null) {
                        var8 = var7.field6284;
                    }
                    if (var7.field6276 == null) {
                        var7.field6276 = var2.method2379();
                    } else {
                        var7.field6276.method2377(var2);
                    }
                    var8.field6280 = (int) ((float) this.field7497[var7.field6279] * var2.field11114 + (float) this.field7581[var7.field6279] * var2.field11098 + (float) this.field7540[var7.field6279] * var2.field11090 + var2.field11106);
                    var8.field6272 = (int) ((float) this.field7497[var7.field6279] * var2.field11092 + (float) this.field7581[var7.field6279] * var2.field11110 + (float) this.field7540[var7.field6279] * var2.field11097 + var2.field11118);
                    var8.field6277 = (int) ((float) this.field7497[var7.field6279] * var2.field11095 + (float) this.field7581[var7.field6279] * var2.field11125 + (float) this.field7540[var7.field6279] * var2.field11105 + var2.field11128);
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field7616[2] + (arg0 == null ? field7616[1] : field7616[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    private final void method3948(int arg0) {
        try {
            if (arg0 != 780434311) {
                this.field7575 = null;
            }
            if (this.field7595 != null) {
                class768 var2 = this.field7559.field2847;
                this.field7559.method1756(20537);
                this.field7559.method488(!this.field7577);
                this.field7559.method1706(arg0 ^ 0x2E847B90, false);
                this.field7559.method1724(null, this.field7559.field2925, 2916, null, this.field7559.field2886);
                for (int var3 = 0; var3 < this.field7515; var3++) {
                    class786 var4 = this.field7595[var3];
                    class435 var5 = this.field7508[var3];
                    if (!var4.field11470 || !this.field7559.method566()) {
                        float var6 = (float) (this.field7540[var4.field11473] + this.field7540[var4.field11468] + this.field7540[var4.field11471]) * 0.3333333F;
                        float var7 = (float) (this.field7581[var4.field11471] + this.field7581[var4.field11468] + this.field7581[var4.field11473]) * 0.3333333F;
                        float var8 = (float) (this.field7497[var4.field11471] + this.field7497[var4.field11468] + this.field7497[var4.field11473]) * 0.3333333F;
                        float var9 = class208.field3187 * var8 + class779.field11340 * var6 + class573.field8469 * var7 + class203.field3155;
                        float var10 = class423.field6228 * var8 + class614.field8968 * var7 + class575.field8499 * var6 + class753.field10961;
                        float var11 = class659.field9502 * var8 + class408.field6044 * var6 + class157.field1957 * var7 + class248.field3872;
                        float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field11474;
                        var2.method5536(var11 * var12 - var11, var10 * var12 + (float) var5.field6382 + -var10, (float) var5.field6377 + var9 - (var9 * var12), 16383, var5.field6378, var4.field11475 * var5.field6384 >> 7, var4.field11477 * var5.field6381 >> 7);
                        this.field7559.method1745(20820, var2);
                        int var13 = var5.field6380;
                        OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                        this.field7559.method1729((byte) -101, var4.field11469);
                        this.field7559.method1743(arg0 ^ 0xD17B841E, var4.field11472);
                        this.field7559.method1678(0, 4, (byte) 124, 7);
                    }
                }
                this.field7559.method488(true);
                this.field7559.method1731(-25384);
            }
            field7568++;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field7616[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "(I)V")
    public final void method339(int arg0) {
        try {
            field7614++;
            int var2 = class298.field4704[arg0];
            int var3 = class298.field4703[arg0];
            for (int var4 = 0; var4 < this.field7499; var4++) {
                int var5 = this.field7540[var4] * var3 + this.field7497[var4] * var2 >> 14;
                this.field7497[var4] = this.field7497[var4] * var3 - this.field7540[var4] * var2 >> 14;
                this.field7540[var4] = var5;
            }
            for (int var6 = 0; var6 < this.field7582; var6++) {
                int var7 = this.field7589[var6] * var2 + this.field7611[var6] * var3 >> 14;
                this.field7589[var6] = (short) (this.field7589[var6] * var3 - (this.field7611[var6] * var2) >> 14);
                this.field7611[var6] = (short) var7;
            }
            if (this.field7522 == null && this.field7498 != null) {
                this.field7498.field8831 = null;
            }
            if (this.field7522 != null) {
                this.field7522.field8831 = null;
            }
            if (this.field7587 != null) {
                this.field7587.field8831 = null;
            }
            this.field7521 = false;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7616[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILqq;ZI)Z")
    public final boolean method297(int arg0, int arg1, class501 arg2, boolean arg3, int arg4) {
        try {
            field7580++;
            return this.method3942(arg3, -66, -1, arg1, arg2, arg4, arg0);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7616[30] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7616[1] : field7616[0]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "ua", descriptor = "()I")
    public final int method330() {
        try {
            field7588++;
            return this.field7534;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[37] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "()I")
    public final int method335() {
        try {
            if (!this.field7521) {
                this.method3946((byte) -125);
            }
            field7511++;
            return this.field7578;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[62] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "VA", descriptor = "(I)V")
    public final void method344(int arg0) {
        try {
            field7567++;
            int var2 = class298.field4704[arg0];
            int var3 = class298.field4703[arg0];
            for (int var4 = 0; var4 < this.field7499; var4++) {
                int var5 = this.field7581[var4] * var2 + this.field7540[var4] * var3 >> 14;
                this.field7581[var4] = this.field7581[var4] * var3 - (this.field7540[var4] * var2) >> 14;
                this.field7540[var4] = var5;
            }
            this.field7521 = false;
            if (this.field7587 != null) {
                this.field7587.field8831 = null;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7616[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
    public static final void method3949(int arg0, int arg1) {
        class194 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class294 var4 = class184.field2541[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class216.field3296; var5++) {
                    for (int var6 = 0; var6 < class132.field1543; var6++) {
                        var2 = var4.method1504(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class602.field8828;
                            int var8 = var5 << class602.field8828;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class294 var10 = class184.field2541[var9];
                                if (var10 != null) {
                                    int var11 = var4.method2407(var5, var6, 40) - var10.method2407(var5, var6, -97);
                                    int var12 = var4.method2407(var5, var6 + 1, 122) - var10.method2407(var5, var6 + 1, -98);
                                    int var13 = var4.method2407(var5 + 1, var6 + 1, -90) - var10.method2407(var5 + 1, var6 + 1, 73);
                                    int var14 = var4.method2407(var5 + 1, var6, 36) - var10.method2407(var5 + 1, var6, 104);
                                    var10.method1507(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method302(int arg0, int arg1, class294 arg2, class294 arg3, int arg4, int arg5, int arg6) {
        try {
            field7537++;
            if (!this.field7521) {
                this.method3946((byte) -9);
            }
            int var8 = this.field7578 + arg4;
            int var9 = this.field7548 + arg4;
            int var10 = this.field7544 + arg6;
            int var11 = this.field7576 + arg6;
            if (arg0 != 1 && arg0 != 2 && arg0 != 3 && arg0 != 5 || var8 >= 0 && arg2.field4337 > arg2.field4340 + var9 >> arg2.field4341 && var10 >= 0 && arg2.field4336 > (var11 + arg2.field4340 >> arg2.field4341)) {
                if (arg0 == 4 || arg0 == 5) {
                    if (arg3 == null) {
                        return;
                    }
                    if (var8 < 0 || arg3.field4337 <= arg3.field4340 + var9 >> arg3.field4341 || var10 < 0 || arg3.field4340 + var11 >> arg3.field4341 >= arg3.field4336) {
                        return;
                    }
                } else {
                    int var12 = var8 >> arg2.field4341;
                    int var13 = arg2.field4340 + var9 - 1 >> arg2.field4341;
                    int var14 = var10 >> arg2.field4341;
                    int var15 = arg2.field4340 + var11 - 1 >> arg2.field4341;
                    if (arg2.method2407(var14, var12, 59) == arg5 && arg5 == arg2.method2407(var14, var13, -106) && arg5 == arg2.method2407(var15, var12, -110) && arg2.method2407(var15, var13, -119) == arg5) {
                        return;
                    }
                }
                if (arg0 == 1) {
                    for (int var16 = 0; var16 < this.field7499; var16++) {
                        this.field7581[var16] = this.field7581[var16] + arg2.method2404((byte) 103, this.field7540[var16] + arg4, this.field7497[var16] + arg6) - arg5;
                    }
                } else if (arg0 == 2) {
                    short var30 = this.field7552;
                    if (var30 == 0) {
                        return;
                    }
                    for (int var31 = 0; var31 < this.field7499; var31++) {
                        int var32 = (this.field7581[var31] << 16) / var30;
                        if (var32 < arg1) {
                            this.field7581[var31] -= -((arg2.method2404((byte) 102, this.field7540[var31] + arg4, this.field7497[var31] + arg6) - arg5) * (arg1 - var32) / arg1);
                        }
                    }
                } else if (arg0 == 3) {
                    int var26 = (arg1 & 0xFF) * 4;
                    int var27 = (arg1 >> 8 & 0xFF) * 4;
                    int var28 = arg1 >> 16 & 0xFF << 6;
                    int var29 = arg1 >> 24 & 0xFF << 6;
                    if (arg4 - (var26 >> 1) < 0 || (arg4 + (var26 >> 1) + arg2.field4340) >= (arg2.field4337 << arg2.field4341) || arg6 - (var27 >> 1) < 0 || arg2.field4336 << arg2.field4341 <= arg2.field4340 + arg6 + (var27 >> 1)) {
                        return;
                    }
                    this.method3762(var27, (byte) 62, var28, var29, arg6, arg5, var26, arg2, arg4);
                } else if (arg0 == 4) {
                    int var17 = this.field7542 - this.field7552;
                    for (int var18 = 0; var18 < this.field7499; var18++) {
                        this.field7581[var18] = this.field7581[var18] + arg3.method2404((byte) 114, this.field7540[var18] + arg4, this.field7497[var18] + arg6) + var17 - arg5;
                    }
                } else if (arg0 == 5) {
                    int var19 = this.field7542 - this.field7552;
                    for (int var20 = 0; var20 < this.field7499; var20++) {
                        int var21 = this.field7540[var20] + arg4;
                        int var22 = this.field7497[var20] + arg6;
                        int var23 = arg2.method2404((byte) 123, var21, var22);
                        int var24 = arg3.method2404((byte) 121, var21, var22);
                        int var25 = var23 - var24 - arg1;
                        this.field7581[var20] = ((this.field7581[var20] << 8) / var19 * var25 >> 8) + var23 - arg5;
                    }
                }
                if (this.field7587 != null) {
                    this.field7587.field8831 = null;
                }
                this.field7521 = false;
            }
        } catch (RuntimeException var34) {
            throw class759.method5498(var34, field7616[14] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7616[1] : field7616[0]) + ',' + (arg3 == null ? field7616[1] : field7616[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "(I)V")
    public final void method331(int arg0) {
        try {
            field7604++;
            if (this.field7498 != null) {
                this.field7498.field8831 = null;
            }
            this.field7553 = (short) arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7616[28] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIZ)Lka;")
    public final class497 method332(byte arg0, int arg1, boolean arg2) {
        try {
            field7502++;
            class519 var4;
            class519 var5;
            if (arg0 == 1) {
                var5 = this.field7559.field2917;
                var4 = this.field7559.field2980;
            } else if (arg0 == 2) {
                var4 = this.field7559.field2940;
                var5 = this.field7559.field2926;
            } else if (arg0 == 3) {
                var4 = this.field7559.field2957;
                var5 = this.field7559.field2907;
            } else if (arg0 == 4) {
                var5 = this.field7559.field2960;
                var4 = this.field7559.field2918;
            } else if (arg0 == 5) {
                var5 = this.field7559.field2891;
                var4 = this.field7559.field2902;
            } else {
                var5 = var4 = new class519(this.field7559);
            }
            return this.method3944(var4, arg2, arg0 != 0, var5, arg1, -1);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7616[36] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method320(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        try {
            field7517++;
            int var8 = arg1.length;
            int var109;
            int var110;
            int var111;
            if (arg0 == 0) {
                var110 = arg3 << 4;
                var111 = arg4 << 4;
                var109 = arg2 << 4;
                int var9 = 0;
                class476.field6924 = 0;
                class88.field1002 = 0;
                class335.field5232 = 0;
                for (int var10 = 0; var10 < var8; var10++) {
                    int var11 = arg1[var10];
                    if (var11 < this.field7593.length) {
                        int[] var12 = this.field7593[var11];
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            int var14 = var12[var13];
                            class88.field1002 += this.field7540[var14];
                            class335.field5232 += this.field7581[var14];
                            var9++;
                            class476.field6924 += this.field7497[var14];
                        }
                    }
                }
                if (var9 <= 0) {
                    class476.field6924 = var111;
                    class335.field5232 = var110;
                    class88.field1002 = var109;
                } else {
                    class335.field5232 = class335.field5232 / var9 + var110;
                    class476.field6924 = class476.field6924 / var9 + var111;
                    class88.field1002 = class88.field1002 / var9 + var109;
                }
            } else if (arg0 == 1) {
                var111 = arg4 << 4;
                var109 = arg2 << 4;
                var110 = arg3 << 4;
                for (int var15 = 0; var15 < var8; var15++) {
                    int var16 = arg1[var15];
                    if (var16 < this.field7593.length) {
                        int[] var17 = this.field7593[var16];
                        for (int var18 = 0; var18 < var17.length; var18++) {
                            int var19 = var17[var18];
                            this.field7540[var19] += var109;
                            this.field7581[var19] += var110;
                            this.field7497[var19] += var111;
                        }
                    }
                }
            } else if (arg0 == 2) {
                for (int var20 = 0; var20 < var8; var20++) {
                    int var21 = arg1[var20];
                    if (var21 < this.field7593.length) {
                        int[] var22 = this.field7593[var21];
                        if ((arg5 & 0x1) == 0) {
                            for (int var23 = 0; var23 < var22.length; var23++) {
                                int var24 = var22[var23];
                                this.field7540[var24] -= class88.field1002;
                                this.field7581[var24] -= class335.field5232;
                                this.field7497[var24] -= class476.field6924;
                                if (arg4 != 0) {
                                    int var25 = class298.field4704[arg4];
                                    int var26 = class298.field4703[arg4];
                                    int var27 = this.field7540[var24] * var26 + this.field7581[var24] * var25 + 16383 >> 14;
                                    this.field7581[var24] = this.field7581[var24] * var26 + 16383 - (this.field7540[var24] * var25) >> 14;
                                    this.field7540[var24] = var27;
                                }
                                if (arg2 != 0) {
                                    int var28 = class298.field4704[arg2];
                                    int var29 = class298.field4703[arg2];
                                    int var30 = this.field7581[var24] * var29 + 16383 - this.field7497[var24] * var28 >> 14;
                                    this.field7497[var24] = this.field7581[var24] * var28 + this.field7497[var24] * var29 + 16383 >> 14;
                                    this.field7581[var24] = var30;
                                }
                                if (arg3 != 0) {
                                    int var31 = class298.field4704[arg3];
                                    int var32 = class298.field4703[arg3];
                                    int var33 = this.field7540[var24] * var32 + this.field7497[var24] * var31 + 16383 >> 14;
                                    this.field7497[var24] = this.field7497[var24] * var32 + 16383 - (this.field7540[var24] * var31) >> 14;
                                    this.field7540[var24] = var33;
                                }
                                this.field7540[var24] += class88.field1002;
                                this.field7581[var24] += class335.field5232;
                                this.field7497[var24] += class476.field6924;
                            }
                        } else {
                            for (int var34 = 0; var34 < var22.length; var34++) {
                                int var35 = var22[var34];
                                this.field7540[var35] -= class88.field1002;
                                this.field7581[var35] -= class335.field5232;
                                this.field7497[var35] -= class476.field6924;
                                if (arg2 != 0) {
                                    int var36 = class298.field4704[arg2];
                                    int var37 = class298.field4703[arg2];
                                    int var38 = this.field7581[var35] * var37 + 16383 - (this.field7497[var35] * var36) >> 14;
                                    this.field7497[var35] = this.field7581[var35] * var36 + this.field7497[var35] * var37 + 16383 >> 14;
                                    this.field7581[var35] = var38;
                                }
                                if (arg4 != 0) {
                                    int var39 = class298.field4704[arg4];
                                    int var40 = class298.field4703[arg4];
                                    int var41 = this.field7581[var35] * var39 + this.field7540[var35] * var40 + 16383 >> 14;
                                    this.field7581[var35] = this.field7581[var35] * var40 + 16383 - (this.field7540[var35] * var39) >> 14;
                                    this.field7540[var35] = var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class298.field4704[arg3];
                                    int var43 = class298.field4703[arg3];
                                    int var44 = this.field7540[var35] * var43 + this.field7497[var35] * var42 + 16383 >> 14;
                                    this.field7497[var35] = this.field7497[var35] * var43 + 16383 - (this.field7540[var35] * var42) >> 14;
                                    this.field7540[var35] = var44;
                                }
                                this.field7540[var35] += class88.field1002;
                                this.field7581[var35] += class335.field5232;
                                this.field7497[var35] += class476.field6924;
                            }
                        }
                    }
                }
                if (arg6) {
                    for (int var45 = 0; var45 < var8; var45++) {
                        int var46 = arg1[var45];
                        if (this.field7593.length > var46) {
                            int[] var47 = this.field7593[var46];
                            for (int var48 = 0; var48 < var47.length; var48++) {
                                int var49 = var47[var48];
                                int var50 = this.field7519[var49];
                                int var51 = this.field7519[var49 + 1];
                                for (int var52 = var50; var52 < var51; var52++) {
                                    int var53 = this.field7526[var52] - 1;
                                    if (var53 == -1) {
                                        break;
                                    }
                                    if (arg4 != 0) {
                                        int var54 = class298.field4704[arg4];
                                        int var55 = class298.field4703[arg4];
                                        int var56 = this.field7611[var53] * var55 + this.field7569[var53] * var54 + 16383 >> 14;
                                        this.field7569[var53] = (short) (this.field7569[var53] * var55 + 16383 - (this.field7611[var53] * var54) >> 14);
                                        this.field7611[var53] = (short) var56;
                                    }
                                    if (arg2 != 0) {
                                        int var57 = class298.field4704[arg2];
                                        int var58 = class298.field4703[arg2];
                                        int var59 = this.field7569[var53] * var58 - (this.field7589[var53] * var57 - 16383) >> 14;
                                        this.field7589[var53] = (short) (this.field7589[var53] * var58 + (this.field7569[var53] * var57 + 16383) >> 14);
                                        this.field7569[var53] = (short) var59;
                                    }
                                    if (arg3 != 0) {
                                        int var60 = class298.field4704[arg3];
                                        int var61 = class298.field4703[arg3];
                                        int var62 = this.field7589[var53] * var60 + this.field7611[var53] * var61 + 16383 >> 14;
                                        this.field7589[var53] = (short) (this.field7589[var53] * var61 + 16383 - (this.field7611[var53] * var60) >> 14);
                                        this.field7611[var53] = (short) var62;
                                    }
                                }
                            }
                        }
                    }
                    if (this.field7522 == null && this.field7498 != null) {
                        this.field7498.field8831 = null;
                    }
                    if (this.field7522 != null) {
                        this.field7522.field8831 = null;
                    }
                }
            } else if (arg0 == 3) {
                for (int var63 = 0; var63 < var8; var63++) {
                    int var64 = arg1[var63];
                    if (var64 < this.field7593.length) {
                        int[] var65 = this.field7593[var64];
                        for (int var66 = 0; var66 < var65.length; var66++) {
                            int var67 = var65[var66];
                            this.field7540[var67] -= class88.field1002;
                            this.field7581[var67] -= class335.field5232;
                            this.field7497[var67] -= class476.field6924;
                            this.field7540[var67] = this.field7540[var67] * arg2 >> 7;
                            this.field7581[var67] = this.field7581[var67] * arg3 >> 7;
                            this.field7497[var67] = this.field7497[var67] * arg4 >> 7;
                            this.field7540[var67] += class88.field1002;
                            this.field7581[var67] += class335.field5232;
                            this.field7497[var67] += class476.field6924;
                        }
                    }
                }
            } else if (arg0 == 5) {
                if (this.field7594 != null) {
                    for (int var68 = 0; var68 < var8; var68++) {
                        int var69 = arg1[var68];
                        if (var69 < this.field7594.length) {
                            int[] var70 = this.field7594[var69];
                            for (int var71 = 0; var71 < var70.length; var71++) {
                                int var72 = var70[var71];
                                int var73 = (this.field7572[var72] & 0xFF) + arg2 * 8;
                                if (var73 < 0) {
                                    var73 = 0;
                                } else if (var73 > 255) {
                                    var73 = 255;
                                }
                                this.field7572[var72] = (byte) var73;
                            }
                            if (var70.length > 0 && this.field7498 != null) {
                                this.field7498.field8831 = null;
                            }
                        }
                    }
                    if (this.field7595 != null) {
                        for (int var74 = 0; var74 < this.field7515; var74++) {
                            class786 var75 = this.field7595[var74];
                            class435 var76 = this.field7508[var74];
                            var76.field6380 = var76.field6380 & 0xFFFFFF | 255 - (this.field7572[var75.field11480] & 0xFF) << 24;
                        }
                    }
                }
            } else if (arg0 == 7) {
                if (this.field7594 != null) {
                    for (int var77 = 0; var77 < var8; var77++) {
                        int var78 = arg1[var77];
                        if (this.field7594.length > var78) {
                            int[] var79 = this.field7594[var78];
                            for (int var80 = 0; var80 < var79.length; var80++) {
                                int var81 = var79[var80];
                                int var82 = this.field7590[var81] & 0xFFFF;
                                int var83 = var82 >> 10 & 0x3F;
                                int var84 = var82 >> 7 & 0x7;
                                int var85 = arg3 / 4 + var84;
                                int var86 = var82 & 0x7F;
                                int var87 = arg2 + var83 & 0x3F;
                                int var88 = arg4 + var86;
                                if (var85 < 0) {
                                    var85 = 0;
                                } else if (var85 > 7) {
                                    var85 = 7;
                                }
                                if (var88 < 0) {
                                    var88 = 0;
                                } else if (var88 > 127) {
                                    var88 = 127;
                                }
                                this.field7590[var81] = (short) class544.method4107(var88, class544.method4107(var87 << 10, var85 << 7));
                            }
                            if (var79.length > 0 && this.field7498 != null) {
                                this.field7498.field8831 = null;
                            }
                        }
                    }
                    if (this.field7595 != null) {
                        for (int var89 = 0; var89 < this.field7515; var89++) {
                            class786 var90 = this.field7595[var89];
                            class435 var91 = this.field7508[var89];
                            var91.field6380 = var91.field6380 & 0xFF000000 | class172.field2403[this.field7590[var90.field11480] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                }
            } else if (arg0 == 8) {
                if (this.field7535 != null) {
                    for (int var92 = 0; var92 < var8; var92++) {
                        int var93 = arg1[var92];
                        if (this.field7535.length > var93) {
                            int[] var94 = this.field7535[var93];
                            for (int var95 = 0; var95 < var94.length; var95++) {
                                class435 var96 = this.field7508[var94[var95]];
                                var96.field6377 += arg2;
                                var96.field6382 += arg3;
                            }
                        }
                    }
                }
            } else if (arg0 == 10) {
                if (this.field7535 != null) {
                    for (int var97 = 0; var97 < var8; var97++) {
                        int var98 = arg1[var97];
                        if (this.field7535.length > var98) {
                            int[] var99 = this.field7535[var98];
                            for (int var100 = 0; var100 < var99.length; var100++) {
                                class435 var101 = this.field7508[var99[var100]];
                                var101.field6381 = var101.field6381 * arg2 >> 7;
                                var101.field6384 = var101.field6384 * arg3 >> 7;
                            }
                        }
                    }
                }
            } else if (arg0 == 9 && this.field7535 != null) {
                for (int var102 = 0; var102 < var8; var102++) {
                    int var103 = arg1[var102];
                    if (var103 < this.field7535.length) {
                        int[] var104 = this.field7535[var103];
                        for (int var105 = 0; var105 < var104.length; var105++) {
                            class435 var106 = this.field7508[var104[var105]];
                            var106.field6378 = var106.field6378 + arg2 & 0x3FFF;
                        }
                    }
                }
            }
        } catch (RuntimeException var108) {
            throw class759.method5498(var108, field7616[50] + arg0 + ',' + (arg1 == null ? field7616[1] : field7616[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "HA", descriptor = "()I")
    public final int method340() {
        try {
            field7600++;
            if (!this.field7521) {
                this.method3946((byte) 1);
            }
            return this.field7544;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[27] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "()Z")
    public final boolean method343() {
        try {
            field7518++;
            if (this.field7573 == null) {
                return true;
            }
            for (int var1 = 0; var1 < this.field7573.length; var1++) {
                if (this.field7573[var1] != -1 && !this.field7559.field679.method1363(this.field7573[var1], (byte) 119)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7616[32] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public final void method312(int arg0) {
        try {
            field7520++;
            int var2 = class298.field4704[arg0];
            int var3 = class298.field4703[arg0];
            for (int var4 = 0; var4 < this.field7499; var4++) {
                int var5 = this.field7540[var4] * var3 + this.field7497[var4] * var2 >> 14;
                this.field7497[var4] = this.field7497[var4] * var3 - (this.field7540[var4] * var2) >> 14;
                this.field7540[var4] = var5;
            }
            if (this.field7587 != null) {
                this.field7587.field8831 = null;
            }
            this.field7521 = false;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7616[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()V")
    public final void method322() {
        try {
            field7503++;
            if (this.field7582 > 0 && this.field7538 > 0) {
                this.method3939(false, false);
                if ((this.field7608 & 0x10) == 0 && this.field7585.field3755 == null) {
                    this.method3950(false, 4);
                }
                this.method3941(-1);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[17] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
    private final void method3950(boolean arg0, int arg1) {
        try {
            if (this.field7538 * 6 > this.field7559.field2994.field2209.length) {
                this.field7559.field2994 = new class353(this.field7538 * 6 + 600);
            } else {
                this.field7559.field2994.field2201 = 0;
            }
            if (arg1 != 4) {
                this.field7552 = 67;
            }
            field7549++;
            class353 var3 = this.field7559.field2994;
            if (this.field7559.field2922) {
                for (int var5 = 0; var5 < this.field7538; var5++) {
                    var3.method1406(this.field7554[var5], 380332136);
                    var3.method1406(this.field7566[var5], arg1 ^ 0x16AB686C);
                    var3.method1406(this.field7500[var5], 380332136);
                }
            } else {
                for (int var4 = 0; var4 < this.field7538; var4++) {
                    var3.method1465(this.field7554[var4], (byte) -89);
                    var3.method1465(this.field7566[var4], (byte) -110);
                    var3.method1465(this.field7500[var4], (byte) -115);
                }
            }
            if (var3.field2201 != 0) {
                if (arg0) {
                    if (this.field7514 == null) {
                        this.field7514 = this.field7559.method1727(var3.field2201, (byte) -101, var3.field2209, 5123, true);
                    } else {
                        this.field7514.method452(5123, (byte) 32, var3.field2209, var3.field2201);
                    }
                    this.field7585.field3755 = this.field7514;
                } else {
                    this.field7585.field3755 = this.field7559.method1727(var3.field2201, (byte) -126, var3.field2209, 5123, false);
                }
                if (!arg0) {
                    this.field7512 = true;
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7616[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    private final void method3951(int arg0) {
        try {
            field7605++;
            if (this.field7538 != 0) {
                if (this.field7608 != 0) {
                    this.method3939(false, true);
                }
                this.method3939(false, false);
                if (this.field7585 != null) {
                    if (this.field7585.field3755 == null) {
                        this.method3950((this.field7608 & 0x10) != 0, 4);
                    }
                    if (this.field7585.field3755 != null) {
                        this.field7559.method1706(37, this.field7522 != null);
                        this.field7559.method1724(this.field7522, this.field7587, 2916, this.field7498, this.field7571);
                        int var2 = this.field7513.length - 1;
                        for (int var3 = 0; var3 < var2; var3++) {
                            int var4 = this.field7513[var3];
                            int var5 = this.field7513[var3 + 1];
                            int var6 = this.field7573[var4] & 0xFFFF;
                            if (var6 == 65535) {
                                var6 = -1;
                            }
                            this.field7559.method1700(this.field7522 != null, var6, (byte) 45);
                            this.field7559.method1694(this.field7585.field3755, 4, (var5 - var4) * 3, 6056, var4 * 3);
                        }
                    }
                }
                if (arg0 <= -49) {
                    this.method3941(-1);
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field7616[56] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "aa", descriptor = "(SS)V")
    public final void method329(short arg0, short arg1) {
        try {
            field7539++;
            class160 var3 = this.field7559.field679;
            for (int var4 = 0; var4 < this.field7536; var4++) {
                if (this.field7573[var4] == arg0) {
                    this.field7573[var4] = arg1;
                }
            }
            byte var5 = 0;
            byte var6 = 0;
            if (arg0 != -1) {
                class439 var7 = var3.method1366((byte) -106, arg0 & 0xFFFF);
                var6 = var7.field6480;
                var5 = var7.field6476;
            }
            byte var8 = 0;
            byte var9 = 0;
            if (arg1 != -1) {
                class439 var10 = var3.method1366((byte) -119, arg1 & 0xFFFF);
                var8 = var10.field6476;
                if (var10.field6475 != 0 || var10.field6466 != 0) {
                    this.field7530 = true;
                }
                var9 = var10.field6480;
            }
            if (var6 != var9 | var5 != var8) {
                if (this.field7595 != null) {
                    for (int var11 = 0; var11 < this.field7515; var11++) {
                        class786 var12 = this.field7595[var11];
                        class435 var13 = this.field7508[var11];
                        var13.field6380 = var13.field6380 & 0xFF000000 | class172.field2403[this.field7590[var12.field11480] & 0xFFFF] & 0xFFFFFF;
                    }
                }
                if (this.field7498 != null) {
                    this.field7498.field8831 = null;
                    return;
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field7616[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "NA", descriptor = "()Z")
    public final boolean method334() {
        try {
            field7523++;
            if (this.field7593 == null) {
                return false;
            }
            for (int var1 = 0; var1 < this.field7533; var1++) {
                this.field7540[var1] <<= 0x4;
                this.field7581[var1] <<= 0x4;
                this.field7497[var1] <<= 0x4;
            }
            class88.field1002 = 0;
            class335.field5232 = 0;
            class476.field6924 = 0;
            return true;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7616[52] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "()Z")
    public final boolean method321() {
        try {
            field7551++;
            return this.field7530;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[11] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()V")
    public final void method315() {
        try {
            field7525++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7616[41] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lffa;)V")
    public class519(class197 arg0) {
        try {
            this.field7559 = arg0;
            this.field7587 = new class602(null, 5126, 3, 0);
            this.field7571 = new class602(null, 5126, 2, 0);
            this.field7522 = new class602(null, 5126, 3, 0);
            this.field7498 = new class602(null, 5121, 4, 0);
            this.field7585 = new class246();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7616[5] + (arg0 == null ? field7616[1] : field7616[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lffa;Lju;IIII)V")
    public class519(class197 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field7534 = arg2;
            this.field7559 = arg0;
            this.field7506 = arg5;
            if (class598.method4450((byte) -126, arg2, arg5)) {
                this.field7587 = new class602(null, 5126, 3, 0);
            }
            if (class373.method3008(0, arg2, arg5)) {
                this.field7571 = new class602(null, 5126, 2, 0);
            }
            if (class686.method5030(arg2, -2, arg5)) {
                this.field7522 = new class602(null, 5126, 3, 0);
            }
            if (class434.method3319(arg2, arg5, 95)) {
                this.field7498 = new class602(null, 5121, 4, 0);
            }
            if (class66.method529(-1, arg5, arg2)) {
                this.field7585 = new class246();
            }
            class160 var7 = arg0.field679;
            this.field7519 = new int[arg1.field1600 + 1];
            int[] var8 = new int[arg1.field1624];
            for (int var9 = 0; var9 < arg1.field1624; var9++) {
                if (arg1.field1617 == null || arg1.field1617[var9] != 2) {
                    if (arg1.field1618 != null && arg1.field1618[var9] != -1) {
                        class439 var10 = var7.method1366((byte) -119, arg1.field1618[var9] & 0xFFFF);
                        if (((this.field7506 & 0x40) == 0 || !var10.field6474) && var10.field6471) {
                            continue;
                        }
                    }
                    var8[this.field7536++] = var9;
                    this.field7519[arg1.field1605[var9]]++;
                    this.field7519[arg1.field1628[var9]]++;
                    this.field7519[arg1.field1589[var9]]++;
                }
            }
            this.field7538 = this.field7536;
            long[] var11 = new long[this.field7536];
            boolean var12 = (this.field7534 & 0x100) != 0;
            for (int var13 = 0; var13 < this.field7536; var13++) {
                int var14 = var8[var13];
                class439 var15 = null;
                int var16 = 0;
                byte var17 = 0;
                byte var18 = 0;
                byte var19 = 0;
                if (arg1.field1581 != null) {
                    boolean var20 = false;
                    for (int var21 = 0; var21 < arg1.field1581.length; var21++) {
                        class254 var22 = arg1.field1581[var21];
                        if (var22.field3938 == var14) {
                            class577 var23 = class138.method1182(var22.field3937, -100);
                            if (var23.field8563) {
                                var20 = true;
                            }
                            if (var23.field8559 != -1) {
                                class439 var24 = var7.method1366((byte) -120, var23.field8559);
                                if (var24.field6478 == 2) {
                                    this.field7577 = true;
                                }
                            }
                        }
                    }
                    if (var20) {
                        var11[var13] = Long.MAX_VALUE;
                        this.field7538--;
                        continue;
                    }
                }
                short var25 = -1;
                if (arg1.field1618 != null) {
                    var25 = arg1.field1618[var14];
                    if (var25 != -1) {
                        var15 = var7.method1366((byte) -62, var25 & 0xFFFF);
                        if ((this.field7506 & 0x40) != 0 && var15.field6474) {
                            var15 = null;
                            var25 = -1;
                        } else {
                            var19 = var15.field6461;
                            if (var15.field6475 != 0 || var15.field6466 != 0) {
                                this.field7530 = true;
                            }
                            var18 = var15.field6467;
                        }
                    }
                }
                boolean var26 = arg1.field1591 != null && arg1.field1591[var14] != 0 || var15 != null && var15.field6478 != 0;
                if ((var12 || var26) && arg1.field1621 != null) {
                    var16 += arg1.field1621[var14] << 17;
                }
                if (var26) {
                    var16 += 65536;
                }
                int var27 = (var18 & 0xFF << 8) + var16;
                int var28 = (var19 & 0xFF) + var27;
                int var29 = ((var25 & 0xFFFF) << 16) + var17;
                int var30 = (var13 & 0xFFFF) + var29;
                var11[var13] = ((long) var28 << 32) + ((long) var30);
                this.field7530 |= var15 != null && (var15.field6475 != 0 || var15.field6466 != 0);
                this.field7577 |= var26;
            }
            class117.method1034(var11, -113, var8);
            this.field7533 = arg1.field1619;
            this.field7540 = arg1.field1592;
            this.field7584 = arg1.field1632;
            this.field7581 = arg1.field1595;
            this.field7499 = arg1.field1600;
            this.field7497 = arg1.field1597;
            this.field7532 = arg1.field1601;
            this.field7557 = arg1.field1614;
            class109[] var31 = new class109[this.field7499];
            if (arg1.field1581 != null) {
                this.field7515 = arg1.field1581.length;
                this.field7595 = new class786[this.field7515];
                this.field7508 = new class435[this.field7515];
                for (int var32 = 0; var32 < this.field7515; var32++) {
                    class254 var33 = arg1.field1581[var32];
                    class577 var34 = class138.method1182(var33.field3937, -127);
                    int var35 = -1;
                    for (int var36 = 0; var36 < this.field7536; var36++) {
                        if (var8[var36] == var33.field3938) {
                            var35 = var36;
                            break;
                        }
                    }
                    if (var35 == -1) {
                        throw new RuntimeException();
                    }
                    int var37 = class172.field2403[arg1.field1625[var33.field3938] & 0xFFFF] & 0xFFFFFF;
                    int var38 = var37 | 255 - (arg1.field1591 == null ? 0 : arg1.field1591[var33.field3938]) << 24;
                    this.field7595[var32] = new class786(var35, arg1.field1605[var33.field3938], arg1.field1628[var33.field3938], arg1.field1589[var33.field3938], var34.field8566, var34.field8561, var34.field8559, var34.field8557, var34.field8560, var34.field8563, var34.field8565, var33.field3946);
                    this.field7508[var32] = new class435(var38);
                }
            }
            int var39 = this.field7536 * 3;
            this.field7611 = new short[var39];
            this.field7572 = new byte[this.field7536];
            class544.field8134 = new long[var39];
            this.field7586 = new float[var39];
            this.field7553 = (short) arg3;
            this.field7566 = new short[this.field7536];
            this.field7500 = new short[this.field7536];
            if (arg1.field1593 != null) {
                this.field7495 = new short[this.field7536];
            }
            this.field7526 = new short[var39];
            this.field7573 = new short[this.field7536];
            this.field7602 = (short) arg4;
            this.field7590 = new short[this.field7536];
            this.field7529 = new float[var39];
            this.field7574 = new byte[var39];
            this.field7589 = new short[var39];
            this.field7569 = new short[var39];
            this.field7554 = new short[this.field7536];
            int var40 = 0;
            for (int var41 = 0; var41 < arg1.field1600; var41++) {
                int var42 = this.field7519[var41];
                this.field7519[var41] = var40;
                var40 += var42;
                var31[var41] = new class109();
            }
            this.field7519[arg1.field1600] = var40;
            class428 var43 = class580.method4337(var8, -8812, this.field7536, arg1);
            class605[] var44 = new class605[arg1.field1624];
            for (int var45 = 0; var45 < arg1.field1624; var45++) {
                short var46 = arg1.field1605[var45];
                short var47 = arg1.field1628[var45];
                short var48 = arg1.field1589[var45];
                int var49 = this.field7540[var47] - this.field7540[var46];
                int var50 = this.field7581[var47] - this.field7581[var46];
                int var51 = this.field7497[var47] - this.field7497[var46];
                int var52 = this.field7540[var48] - this.field7540[var46];
                int var53 = this.field7581[var48] - this.field7581[var46];
                int var54 = this.field7497[var48] - this.field7497[var46];
                int var55 = var50 * var54 - (var51 * var53);
                int var56 = var51 * var52 - (var49 * var54);
                int var57 = var49 * var53 - (var50 * var52);
                while (var55 > 8192 || var56 > 8192 || var57 > 8192 || var55 < -8192 || var56 < -8192 || var57 < -8192) {
                    var55 >>= 0x1;
                    var57 >>= 0x1;
                    var56 >>= 0x1;
                }
                int var58 = (int) Math.sqrt((double) (var57 * var57 + var55 * var55 + var56 * var56));
                if (var58 <= 0) {
                    var58 = 1;
                }
                int var59 = var55 * 256 / var58;
                int var60 = var57 * 256 / var58;
                int var61 = var56 * 256 / var58;
                byte var62 = arg1.field1617 == null ? 0 : arg1.field1617[var45];
                if (var62 == 0) {
                    class109 var64 = var31[var46];
                    var64.field1267 += var60;
                    var64.field1265 += var61;
                    var64.field1264++;
                    var64.field1266 += var59;
                    class109 var65 = var31[var47];
                    var65.field1267 += var60;
                    var65.field1265 += var61;
                    var65.field1264++;
                    var65.field1266 += var59;
                    class109 var66 = var31[var48];
                    var66.field1265 += var61;
                    var66.field1267 += var60;
                    var66.field1266 += var59;
                    var66.field1264++;
                } else if (var62 == 1) {
                    class605 var63 = var44[var45] = new class605();
                    var63.field8866 = var60;
                    var63.field8869 = var61;
                    var63.field8867 = var59;
                }
            }
            for (int var67 = 0; var67 < this.field7536; var67++) {
                int var68 = var8[var67];
                int var69 = arg1.field1625[var68] & 0xFFFF;
                int var70;
                if (arg1.field1620 == null) {
                    var70 = -1;
                } else {
                    var70 = arg1.field1620[var68];
                }
                int var71;
                if (arg1.field1591 == null) {
                    var71 = 0;
                } else {
                    var71 = arg1.field1591[var68] & 0xFF;
                }
                short var72 = arg1.field1618 == null ? -1 : arg1.field1618[var68];
                if (var72 != -1 && (this.field7506 & 0x40) != 0) {
                    class439 var73 = var7.method1366((byte) -66, var72 & 0xFFFF);
                    if (var73.field6474) {
                        var72 = -1;
                    }
                }
                float var74 = 0.0F;
                float var75 = 0.0F;
                float var76 = 0.0F;
                float var77 = 0.0F;
                float var78 = 0.0F;
                float var79 = 0.0F;
                byte var80 = 0;
                byte var81 = 0;
                int var82 = 0;
                if (var72 != -1) {
                    if (var70 == -1) {
                        var77 = 1.0F;
                        var78 = 0.0F;
                        var79 = 0.0F;
                        var75 = 1.0F;
                        var81 = 2;
                        var80 = 1;
                        var76 = 1.0F;
                        var74 = 0.0F;
                    } else {
                        var70 &= 0xFF;
                        byte var83 = arg1.field1633[var70];
                        if (var83 == 0) {
                            short var84 = arg1.field1605[var68];
                            short var85 = arg1.field1628[var68];
                            short var86 = arg1.field1589[var68];
                            short var87 = arg1.field1622[var70];
                            short var88 = arg1.field1590[var70];
                            short var89 = arg1.field1607[var70];
                            float var90 = (float) arg1.field1592[var87];
                            float var91 = (float) arg1.field1595[var87];
                            float var92 = (float) arg1.field1597[var87];
                            float var93 = (float) arg1.field1592[var88] - var90;
                            float var94 = (float) arg1.field1595[var88] - var91;
                            float var95 = (float) arg1.field1597[var88] - var92;
                            float var96 = (float) arg1.field1592[var89] - var90;
                            float var97 = (float) arg1.field1595[var89] - var91;
                            float var98 = (float) arg1.field1597[var89] - var92;
                            float var99 = (float) arg1.field1592[var84] - var90;
                            float var100 = (float) arg1.field1595[var84] - var91;
                            float var101 = (float) arg1.field1597[var84] - var92;
                            float var102 = (float) arg1.field1592[var85] - var90;
                            float var103 = (float) arg1.field1595[var85] - var91;
                            float var104 = (float) arg1.field1597[var85] - var92;
                            float var105 = (float) arg1.field1592[var86] - var90;
                            float var106 = (float) arg1.field1595[var86] - var91;
                            float var107 = (float) arg1.field1597[var86] - var92;
                            float var108 = var94 * var98 - var95 * var97;
                            float var109 = var95 * var96 - (var93 * var98);
                            float var110 = var93 * var97 - var94 * var96;
                            float var111 = var97 * var110 - var98 * var109;
                            float var112 = var98 * var108 - (var96 * var110);
                            float var113 = var96 * var109 - var97 * var108;
                            float var114 = 1.0F / (var95 * var113 + var93 * var111 + var94 * var112);
                            var78 = (var107 * var113 + var105 * var111 + var106 * var112) * var114;
                            var74 = (var101 * var113 + var99 * var111 + var100 * var112) * var114;
                            var76 = (var104 * var113 + var102 * var111 + var103 * var112) * var114;
                            float var115 = var93 * var109 - var94 * var108;
                            float var116 = var94 * var110 - (var95 * var109);
                            float var117 = var95 * var108 - (var93 * var110);
                            float var118 = 1.0F / (var98 * var115 + var96 * var116 + var97 * var117);
                            var77 = (var104 * var115 + var102 * var116 + var103 * var117) * var118;
                            var79 = (var107 * var115 + var105 * var116 + var106 * var117) * var118;
                            var75 = (var101 * var115 + var99 * var116 + var100 * var117) * var118;
                        } else {
                            short var119 = arg1.field1605[var68];
                            short var120 = arg1.field1628[var68];
                            short var121 = arg1.field1589[var68];
                            int var122 = var43.field6287[var70];
                            int var123 = var43.field6292[var70];
                            int var124 = var43.field6288[var70];
                            float[] var125 = var43.field6291[var70];
                            byte var126 = arg1.field1608[var70];
                            float var127 = (float) arg1.field1612[var70] / 256.0F;
                            if (var83 == 1) {
                                float var128 = (float) arg1.field1588[var70] / 1024.0F;
                                class315.method2650(arg1.field1595[var119], var126, var127, var124, var123, arg1.field1592[var119], var128, arg1.field1597[var119], (byte) 127, var122, var125, class355.field5470);
                                var74 = class355.field5470[0];
                                var75 = class355.field5470[1];
                                class315.method2650(arg1.field1595[var120], var126, var127, var124, var123, arg1.field1592[var120], var128, arg1.field1597[var120], (byte) 124, var122, var125, class355.field5470);
                                var76 = class355.field5470[0];
                                var77 = class355.field5470[1];
                                class315.method2650(arg1.field1595[var121], var126, var127, var124, var123, arg1.field1592[var121], var128, arg1.field1597[var121], (byte) 127, var122, var125, class355.field5470);
                                var79 = class355.field5470[1];
                                var78 = class355.field5470[0];
                                float var129 = var128 / 2.0F;
                                if ((var126 & 0x1) == 0) {
                                    if ((var129 < var76 - var74)) {
                                        var80 = 1;
                                        var76 -= var128;
                                    } else if (var74 - var76 > var129) {
                                        var80 = 2;
                                        var76 += var128;
                                    }
                                    if (var129 < var78 - var74) {
                                        var81 = 1;
                                        var78 -= var128;
                                    } else if (var129 < var74 - var78) {
                                        var78 += var128;
                                        var81 = 2;
                                    }
                                } else {
                                    if (var77 - var75 > var129) {
                                        var80 = 1;
                                        var77 -= var128;
                                    } else if (var129 < var75 - var77) {
                                        var80 = 2;
                                        var77 += var128;
                                    }
                                    if ((var79 - var75 > var129)) {
                                        var81 = 1;
                                        var79 -= var128;
                                    } else if (var75 - var79 > var129) {
                                        var81 = 2;
                                        var79 += var128;
                                    }
                                }
                            } else if (var83 == 2) {
                                float var130 = (float) arg1.field1599[var70] / 256.0F;
                                float var131 = (float) arg1.field1629[var70] / 256.0F;
                                int var132 = arg1.field1592[var120] - arg1.field1592[var119];
                                int var133 = arg1.field1595[var120] - arg1.field1595[var119];
                                int var134 = arg1.field1597[var120] - arg1.field1597[var119];
                                int var135 = arg1.field1592[var121] - arg1.field1592[var119];
                                int var136 = arg1.field1595[var121] - arg1.field1595[var119];
                                int var137 = arg1.field1597[var121] - arg1.field1597[var119];
                                int var138 = var133 * var137 - (var134 * var136);
                                int var139 = var134 * var135 - var132 * var137;
                                int var140 = var132 * var136 - (var133 * var135);
                                float var141 = 64.0F / (float) arg1.field1594[var70];
                                float var142 = 64.0F / (float) arg1.field1603[var70];
                                float var143 = 64.0F / (float) arg1.field1588[var70];
                                float var144 = (var125[2] * (float) var140 + var125[1] * (float) var139 + var125[0] * (float) var138) / var141;
                                float var145 = (var125[5] * (float) var140 + var125[3] * (float) var138 + var125[4] * (float) var139) / var142;
                                float var146 = (var125[8] * (float) var140 + var125[7] * (float) var139 + var125[6] * (float) var138) / var143;
                                var82 = class306.method2600(var145, var146, var144, 105);
                                class116.method1022(var122, arg1.field1595[var119], (byte) 31, var126, class355.field5470, var82, var130, arg1.field1597[var119], var127, var125, var124, var123, var131, arg1.field1592[var119]);
                                var75 = class355.field5470[1];
                                var74 = class355.field5470[0];
                                class116.method1022(var122, arg1.field1595[var120], (byte) 90, var126, class355.field5470, var82, var130, arg1.field1597[var120], var127, var125, var124, var123, var131, arg1.field1592[var120]);
                                var77 = class355.field5470[1];
                                var76 = class355.field5470[0];
                                class116.method1022(var122, arg1.field1595[var121], (byte) 79, var126, class355.field5470, var82, var130, arg1.field1597[var121], var127, var125, var124, var123, var131, arg1.field1592[var121]);
                                var79 = class355.field5470[1];
                                var78 = class355.field5470[0];
                            } else if (var83 == 3) {
                                class733.method5344(var125, var122, var123, class355.field5470, arg1.field1597[var119], var124, (byte) 109, var127, arg1.field1595[var119], var126, arg1.field1592[var119]);
                                var75 = class355.field5470[1];
                                var74 = class355.field5470[0];
                                class733.method5344(var125, var122, var123, class355.field5470, arg1.field1597[var120], var124, (byte) 109, var127, arg1.field1595[var120], var126, arg1.field1592[var120]);
                                var76 = class355.field5470[0];
                                var77 = class355.field5470[1];
                                class733.method5344(var125, var122, var123, class355.field5470, arg1.field1597[var121], var124, (byte) 109, var127, arg1.field1595[var121], var126, arg1.field1592[var121]);
                                var79 = class355.field5470[1];
                                var78 = class355.field5470[0];
                                if ((var126 & 0x1) == 0) {
                                    if ((var78 - var74 > 0.5F)) {
                                        var81 = 1;
                                        var78--;
                                    } else if (var74 - var78 > 0.5F) {
                                        var81 = 2;
                                        var78++;
                                    }
                                    if ((var76 - var74 > 0.5F)) {
                                        var76--;
                                        var80 = 1;
                                    } else if (var74 - var76 > 0.5F) {
                                        var80 = 2;
                                        var76++;
                                    }
                                } else {
                                    if (var77 - var75 > 0.5F) {
                                        var77--;
                                        var80 = 1;
                                    } else if (var75 - var77 > 0.5F) {
                                        var77++;
                                        var80 = 2;
                                    }
                                    if (var79 - var75 > 0.5F) {
                                        var79--;
                                        var81 = 1;
                                    } else if (var75 - var79 > 0.5F) {
                                        var79++;
                                        var81 = 2;
                                    }
                                }
                            }
                        }
                    }
                }
                byte var147;
                if (arg1.field1617 == null) {
                    var147 = 0;
                } else {
                    var147 = arg1.field1617[var68];
                }
                if (var147 == 0) {
                    long var148 = ((long) (var69 << 8) + (long) (var82 << 24) + ((long) var71) << 32) + (long) (var70 << 2);
                    short var150 = arg1.field1605[var68];
                    short var151 = arg1.field1628[var68];
                    short var152 = arg1.field1589[var68];
                    class109 var153 = var31[var150];
                    this.field7554[var67] = this.method3940(var153.field1267, arg1, var153.field1265, var148, var153.field1266, var75, var153.field1264, (byte) 124, var74, var150);
                    class109 var154 = var31[var151];
                    this.field7566[var67] = this.method3940(var154.field1267, arg1, var154.field1265, (long) var80 + var148, var154.field1266, var77, var154.field1264, (byte) 124, var76, var151);
                    class109 var155 = var31[var152];
                    this.field7500[var67] = this.method3940(var155.field1267, arg1, var155.field1265, (long) var81 + var148, var155.field1266, var79, var155.field1264, (byte) 124, var78, var152);
                } else if (var147 == 1) {
                    class605 var156 = var44[var68];
                    long var157 = (long) ((var156.field8866 + 256 << 22) + (var70 << 2) - (-(var156.field8867 <= 0 ? 2048 : 1024) - (var156.field8869 + 256 << 12))) + ((long) (var82 << 24) - (-((long) (var69 << 8)) - (long) var71) << 32);
                    this.field7554[var67] = this.method3940(var156.field8866, arg1, var156.field8869, var157, var156.field8867, var75, 0, (byte) 124, var74, arg1.field1605[var68]);
                    this.field7566[var67] = this.method3940(var156.field8866, arg1, var156.field8869, (long) var80 + var157, var156.field8867, var77, 0, (byte) 124, var76, arg1.field1628[var68]);
                    this.field7500[var67] = this.method3940(var156.field8866, arg1, var156.field8869, (long) var81 + var157, var156.field8867, var79, 0, (byte) 124, var78, arg1.field1589[var68]);
                }
                if (arg1.field1591 != null) {
                    this.field7572[var67] = arg1.field1591[var68];
                }
                if (arg1.field1593 != null) {
                    this.field7495[var67] = arg1.field1593[var68];
                }
                this.field7590[var67] = arg1.field1625[var68];
                this.field7573[var67] = var72;
            }
            int var159 = 0;
            short var160 = -10000;
            for (int var161 = 0; var161 < this.field7538; var161++) {
                short var162 = this.field7573[var161];
                if (var160 != var162) {
                    var159++;
                    var160 = var162;
                }
            }
            this.field7513 = new int[var159 + 1];
            int var163 = 0;
            short var164 = -10000;
            for (int var165 = 0; var165 < this.field7538; var165++) {
                short var166 = this.field7573[var165];
                if (var164 != var166) {
                    var164 = var166;
                    this.field7513[var163++] = var165;
                }
            }
            this.field7513[var163] = this.field7538;
            class544.field8134 = null;
            this.field7611 = class39.method261(this.field7582, 0, this.field7611);
            this.field7569 = class39.method261(this.field7582, 0, this.field7569);
            this.field7589 = class39.method261(this.field7582, 0, this.field7589);
            this.field7574 = class580.method4336(this.field7574, this.field7582, (byte) -94);
            this.field7529 = class130.method1130(5049, this.field7529, this.field7582);
            this.field7586 = class130.method1130(5049, this.field7586, this.field7582);
            if (arg1.field1586 != null && class56.method417(this.field7506, 1, arg2)) {
                this.field7593 = arg1.method1173(false, 17106);
            }
            if (arg1.field1581 != null && class425.method3279(true, this.field7506, arg2)) {
                this.field7535 = arg1.method1167((byte) -83);
            }
            if (arg1.field1610 != null && class36.method238(arg2, -1532432668, this.field7506)) {
                int var167 = 0;
                int[] var168 = new int[256];
                for (int var169 = 0; var169 < this.field7536; var169++) {
                    int var170 = arg1.field1610[var8[var169]];
                    if (var170 >= 0) {
                        int var10002 = var168[var170]++;
                        if (var170 > var167) {
                            var167 = var170;
                        }
                    }
                }
                this.field7594 = new int[var167 + 1][];
                for (int var171 = 0; var171 <= var167; var171++) {
                    this.field7594[var171] = new int[var168[var171]];
                    var168[var171] = 0;
                }
                for (int var172 = 0; var172 < this.field7536; var172++) {
                    int var173 = arg1.field1610[var8[var172]];
                    if (var173 >= 0) {
                        this.field7594[var173][var168[var173]++] = var172;
                    }
                }
            }
        } catch (RuntimeException var175) {
            throw class759.method5498(var175, field7616[5] + (arg0 == null ? field7616[1] : field7616[0]) + ',' + (arg1 == null ? field7616[1] : field7616[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3952(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3953(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
