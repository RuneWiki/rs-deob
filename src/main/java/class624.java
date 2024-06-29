import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class624 extends class472 {

    @OriginalMember(owner = "client!paa", name = "y", descriptor = "I")
    private int field8484 = 0;

    @OriginalMember(owner = "client!paa", name = "Q", descriptor = "Z")
    private boolean field8502 = true;

    @OriginalMember(owner = "client!paa", name = "Eb", descriptor = "Z")
    private boolean field8542 = false;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "Z")
    private boolean field8474 = false;

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
    private int field8476 = 0;

    @OriginalMember(owner = "client!paa", name = "pc", descriptor = "I")
    private int field8579 = 0;

    @OriginalMember(owner = "client!paa", name = "S", descriptor = "I")
    private int field8504 = 0;

    @OriginalMember(owner = "client!paa", name = "zc", descriptor = "I")
    private int field8589 = 0;

    @OriginalMember(owner = "client!paa", name = "vc", descriptor = "Z")
    private boolean field8585 = false;

    @OriginalMember(owner = "client!paa", name = "Hb", descriptor = "Lqo;")
    private class22 field8545;

    @OriginalMember(owner = "client!paa", name = "Ob", descriptor = "Lnh;")
    private class744 field8552;

    @OriginalMember(owner = "client!paa", name = "dc", descriptor = "Lnh;")
    private class744 field8567;

    @OriginalMember(owner = "client!paa", name = "Y", descriptor = "Lnh;")
    private class744 field8510;

    @OriginalMember(owner = "client!paa", name = "Tb", descriptor = "Lnh;")
    private class744 field8557;

    @OriginalMember(owner = "client!paa", name = "kb", descriptor = "Lus;")
    private class1 field8522;

    @OriginalMember(owner = "client!paa", name = "R", descriptor = "I")
    private int field8503;

    @OriginalMember(owner = "client!paa", name = "Fc", descriptor = "I")
    private int field8595;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "[I")
    private int[] field8475;

    @OriginalMember(owner = "client!paa", name = "Bc", descriptor = "[I")
    private int[] field8591;

    @OriginalMember(owner = "client!paa", name = "Cb", descriptor = "[I")
    private int[] field8540;

    @OriginalMember(owner = "client!paa", name = "E", descriptor = "[I")
    private int[] field8490;

    @OriginalMember(owner = "client!paa", name = "Rb", descriptor = "[S")
    private short[] field8555;

    @OriginalMember(owner = "client!paa", name = "C", descriptor = "[Leca;")
    private class755[] field8488;

    @OriginalMember(owner = "client!paa", name = "xc", descriptor = "[Lnn;")
    private class417[] field8587;

    @OriginalMember(owner = "client!paa", name = "x", descriptor = "I")
    private int field8483;

    @OriginalMember(owner = "client!paa", name = "Fb", descriptor = "[Liq;")
    private class606[] field8543;

    @OriginalMember(owner = "client!paa", name = "ec", descriptor = "[Lnea;")
    private class712[] field8568;

    @OriginalMember(owner = "client!paa", name = "Gc", descriptor = "[S")
    private short[] field8596;

    @OriginalMember(owner = "client!paa", name = "Kb", descriptor = "[S")
    private short[] field8548;

    @OriginalMember(owner = "client!paa", name = "gb", descriptor = "[F")
    private float[] field8518;

    @OriginalMember(owner = "client!paa", name = "Z", descriptor = "[S")
    private short[] field8511;

    @OriginalMember(owner = "client!paa", name = "lb", descriptor = "[S")
    private short[] field8523;

    @OriginalMember(owner = "client!paa", name = "Db", descriptor = "[B")
    private byte[] field8541;

    @OriginalMember(owner = "client!paa", name = "sb", descriptor = "[S")
    private short[] field8530;

    @OriginalMember(owner = "client!paa", name = "ib", descriptor = "[S")
    private short[] field8520;

    @OriginalMember(owner = "client!paa", name = "F", descriptor = "S")
    private short field8491;

    @OriginalMember(owner = "client!paa", name = "pb", descriptor = "[S")
    private short[] field8527;

    @OriginalMember(owner = "client!paa", name = "ob", descriptor = "[S")
    private short[] field8526;

    @OriginalMember(owner = "client!paa", name = "Bb", descriptor = "[S")
    private short[] field8539;

    @OriginalMember(owner = "client!paa", name = "Cc", descriptor = "S")
    private short field8592;

    @OriginalMember(owner = "client!paa", name = "D", descriptor = "[B")
    private byte[] field8489;

    @OriginalMember(owner = "client!paa", name = "N", descriptor = "[F")
    private float[] field8499;

    @OriginalMember(owner = "client!paa", name = "bb", descriptor = "[S")
    private short[] field8513;

    @OriginalMember(owner = "client!paa", name = "jc", descriptor = "[I")
    private int[] field8573;

    @OriginalMember(owner = "client!paa", name = "A", descriptor = "[[I")
    private int[][] field8486;

    @OriginalMember(owner = "client!paa", name = "kc", descriptor = "[[I")
    private int[][] field8574;

    @OriginalMember(owner = "client!paa", name = "O", descriptor = "[[I")
    private int[][] field8500;

    @OriginalMember(owner = "client!paa", name = "Jb", descriptor = "Ljava/lang/String;")
    public static String field8547 = "";

    @OriginalMember(owner = "client!paa", name = "qb", descriptor = "B")
    private byte field8528;

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!paa", name = "G", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!paa", name = "H", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!paa", name = "I", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!paa", name = "J", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!paa", name = "K", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!paa", name = "L", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!paa", name = "M", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!paa", name = "V", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!paa", name = "W", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!paa", name = "X", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!paa", name = "ab", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!paa", name = "cb", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!paa", name = "db", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!paa", name = "eb", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!paa", name = "fb", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!paa", name = "jb", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!paa", name = "mb", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!paa", name = "nb", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!paa", name = "rb", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!paa", name = "tb", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!paa", name = "ub", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!paa", name = "wb", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!paa", name = "xb", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!paa", name = "yb", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!paa", name = "zb", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!paa", name = "Gb", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!paa", name = "Ib", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!paa", name = "Lb", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!paa", name = "Mb", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!paa", name = "Nb", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!paa", name = "Pb", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!paa", name = "Qb", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!paa", name = "Ub", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!paa", name = "Vb", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!paa", name = "Wb", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!paa", name = "Xb", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!paa", name = "Yb", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!paa", name = "Zb", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!paa", name = "bc", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!paa", name = "cc", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!paa", name = "fc", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!paa", name = "gc", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!paa", name = "hc", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!paa", name = "ic", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!paa", name = "lc", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!paa", name = "nc", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!paa", name = "oc", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!paa", name = "qc", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!paa", name = "sc", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!paa", name = "tc", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!paa", name = "uc", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!paa", name = "wc", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!paa", name = "yc", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!paa", name = "Ac", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!paa", name = "Hc", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!paa", name = "Ic", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!paa", name = "T", descriptor = "Luga;")
    public static class210 field8505;

    @OriginalMember(owner = "client!paa", name = "hb", descriptor = "Loba;")
    private class263 field8519;

    @OriginalMember(owner = "client!paa", name = "P", descriptor = "Lhca;")
    private class490 field8501;

    @OriginalMember(owner = "client!paa", name = "Ec", descriptor = "Lni;")
    private class522 field8594;

    @OriginalMember(owner = "client!paa", name = "B", descriptor = "S")
    private short field8487;

    @OriginalMember(owner = "client!paa", name = "U", descriptor = "S")
    private short field8506;

    @OriginalMember(owner = "client!paa", name = "vb", descriptor = "S")
    private short field8533;

    @OriginalMember(owner = "client!paa", name = "Ab", descriptor = "S")
    private short field8538;

    @OriginalMember(owner = "client!paa", name = "ac", descriptor = "S")
    private short field8564;

    @OriginalMember(owner = "client!paa", name = "mc", descriptor = "S")
    private short field8576;

    @OriginalMember(owner = "client!paa", name = "rc", descriptor = "S")
    private short field8581;

    @OriginalMember(owner = "client!paa", name = "Dc", descriptor = "S")
    private short field8593;

    @OriginalMember(owner = "client!paa", name = "Sb", descriptor = "Z")
    public static boolean field8556;

    @OriginalMember(owner = "client!paa", name = "FA", descriptor = "(I)V")
    public final void method515(int arg0) {
        field8597++;
        int var2 = class255.field3698[arg0];
        int var3 = class255.field3695[arg0];
        for (int var4 = 0; var4 < this.field8504; var4++) {
            int var5 = this.field8540[var4] * var3 - (this.field8591[var4] * var2) >> 14;
            this.field8591[var4] = this.field8540[var4] * var2 + (this.field8591[var4] * var3) >> 14;
            this.field8540[var4] = var5;
        }
        if (this.field8552 != null) {
            this.field8552.field9994 = null;
        }
        this.field8474 = false;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BIZ)Lka;")
    public final class472 method504(byte arg0, int arg1, boolean arg2) {
        field8562++;
        class624 var4;
        class624 var5;
        if (arg0 == 1) {
            var4 = this.field8545.field686;
            var5 = this.field8545.field602;
        } else if (arg0 == 2) {
            var5 = this.field8545.field624;
            var4 = this.field8545.field660;
        } else if (arg0 == 3) {
            var4 = this.field8545.field625;
            var5 = this.field8545.field643;
        } else if (arg0 == 4) {
            var4 = this.field8545.field656;
            var5 = this.field8545.field666;
        } else if (arg0 == 5) {
            var4 = this.field8545.field662;
            var5 = this.field8545.field607;
        } else {
            var4 = var5 = new class624(this.field8545);
        }
        return this.method3557(var4, arg1, 0, arg2, var5, arg0 != 0);
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V")
    private final void method3548(byte arg0) {
        field8566++;
        if (this.field8484 == 0 || arg0 <= 125) {
            return;
        }
        if (this.field8528 != 0) {
            this.method3559(5, true);
        }
        this.method3559(5, false);
        if (this.field8522 != null) {
            if (this.field8522.field1 == null) {
                this.method3549((this.field8528 & 0x10) != 0, (byte) 27);
            }
            if (this.field8522.field1 != null) {
                this.field8545.method173(this.field8510 != null, 118);
                this.field8545.method317(this.field8552, this.field8557, -26411, this.field8567, this.field8510);
                int var2 = this.field8573.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field8573[var3];
                    int var5 = this.field8573[var3 + 1];
                    int var6 = this.field8548[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field8545.method342(this.field8510 != null, var6, 125);
                    this.field8545.method232((var5 - var4) * 3, -128, 4, this.field8522.field1, var4 * 3);
                }
            }
        }
        this.method3562((byte) 110);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZB)V")
    private final void method3549(boolean arg0, byte arg1) {
        if (this.field8484 * 6 > this.field8545.field620.field3066.length) {
            this.field8545.field620 = new class548((this.field8484 + 100) * 6);
        } else {
            this.field8545.field620.field3109 = 0;
        }
        field8577++;
        if (arg1 != 27) {
            this.method518();
        }
        class548 var3 = this.field8545.field620;
        if (this.field8545.field597) {
            for (int var4 = 0; var4 < this.field8484; var4++) {
                var3.method1485((byte) 107, this.field8539[var4]);
                var3.method1485((byte) 107, this.field8526[var4]);
                var3.method1485((byte) 107, this.field8513[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field8484; var5++) {
                var3.method1545(122, this.field8539[var5]);
                var3.method1545(67, this.field8526[var5]);
                var3.method1545(31, this.field8513[var5]);
            }
        }
        if (var3.field3109 == 0) {
            return;
        }
        if (arg0) {
            if (this.field8594 == null) {
                this.field8594 = this.field8545.method181(5123, -39, var3.field3109, var3.field3066, true);
            } else {
                this.field8594.method448(var3.field3066, 5123, arg1 ^ 0x23, var3.field3109);
            }
            this.field8522.field1 = this.field8594;
        } else {
            this.field8522.field1 = this.field8545.method181(5123, arg1 - 65, var3.field3109, var3.field3066, false);
        }
        if (!arg0) {
            this.field8502 = true;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILbca;ZI)Z")
    public final boolean method503(int arg0, int arg1, class661 arg2, boolean arg3, int arg4) {
        field8480++;
        return this.method3555(arg3, 1566382404, -1, arg1, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method3550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8598++;
        if (arg5 > arg0 && arg0 < arg3 && arg0 < arg8) {
            return false;
        } else if (arg0 > arg5 && arg3 < arg0 && arg8 < arg0) {
            return false;
        } else if (arg4 > arg7 && arg1 > arg7 && arg7 < arg2) {
            return false;
        } else {
            int var10 = -65 / ((arg6 - 57) / 62);
            return arg4 >= arg7 || arg7 <= arg1 || arg7 <= arg2;
        }
    }

    @OriginalMember(owner = "client!paa", name = "VA", descriptor = "(I)V")
    public final void method502(int arg0) {
        field8508++;
        int var2 = class255.field3698[arg0];
        int var3 = class255.field3695[arg0];
        for (int var4 = 0; var4 < this.field8504; var4++) {
            int var5 = this.field8540[var4] * var2 + this.field8490[var4] * var3 >> 14;
            this.field8540[var4] = this.field8540[var4] * var3 - (this.field8490[var4] * var2) >> 14;
            this.field8490[var4] = var5;
        }
        if (this.field8552 != null) {
            this.field8552.field9994 = null;
        }
        this.field8474 = false;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIBSI)I")
    private final int method3551(int arg0, int arg1, byte arg2, short arg3, int arg4) {
        if (arg0 != 19995) {
            return -13;
        }
        field8529++;
        int var6 = class456.field6424[class129.method1068(arg4, arg0 ^ 0x54B313BC, arg1)];
        if (arg3 != -1) {
            class739 var7 = this.field8545.field1170.method1180(arg3 & 0xFFFF, -6662);
            int var8 = var7.field9943 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg1 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field9958 & 0xFF;
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
                var6 = (var15 >> 8) + (((var13 & 0xA400FF00) << 8) + (var14 & 0xFF00));
            }
        }
        return (var6 << 8) + 255 - (arg2 & 0xFF);
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "()Z")
    public final boolean method500() {
        field8498++;
        if (this.field8548 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8548.length; var1++) {
            if (this.field8548[var1] != -1 && !this.field8545.field1170.method1181(-7953, this.field8548[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method490(class472 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8536++;
        class624 var6 = (class624) arg0;
        if (this.field8579 == 0 || var6.field8579 == 0) {
            return;
        }
        int var7 = var6.field8504;
        int[] var8 = var6.field8490;
        int[] var9 = var6.field8540;
        int[] var10 = var6.field8591;
        short[] var11 = var6.field8511;
        short[] var12 = var6.field8530;
        short[] var13 = var6.field8523;
        byte[] var14 = var6.field8541;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field8519 == null) {
            var18 = null;
            var17 = null;
            var16 = null;
            var15 = null;
        } else {
            var15 = this.field8519.field3763;
            var16 = this.field8519.field3757;
            var17 = this.field8519.field3760;
            var18 = this.field8519.field3762;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field8519 == null) {
            var20 = null;
            var22 = null;
            var21 = null;
            var19 = null;
        } else {
            var19 = var6.field8519.field3762;
            var20 = var6.field8519.field3757;
            var21 = var6.field8519.field3763;
            var22 = var6.field8519.field3760;
        }
        int[] var23 = var6.field8475;
        short[] var24 = var6.field8596;
        if (!var6.field8474) {
            var6.method3563((byte) -123);
        }
        short var25 = var6.field8538;
        short var26 = var6.field8576;
        short var27 = var6.field8487;
        short var28 = var6.field8533;
        short var29 = var6.field8564;
        short var30 = var6.field8593;
        for (int var31 = 0; var31 < this.field8504; var31++) {
            int var32 = this.field8540[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field8490[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field8591[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field8475[var31];
                        int var37 = this.field8475[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8596[var38] - 1;
                            if (var35 == -1 || this.field8541[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = -1;
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var40; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var15 == null) {
                                            this.field8519 = new class263();
                                            var15 = this.field8519.field3763 = class142.method1132(this.field8511, (byte) -120);
                                            var17 = this.field8519.field3760 = class142.method1132(this.field8530, (byte) -109);
                                            var18 = this.field8519.field3762 = class142.method1132(this.field8523, (byte) -107);
                                            var16 = this.field8519.field3757 = class604.method3438(-37, this.field8541);
                                        }
                                        if (var21 == null) {
                                            class263 var44 = var6.field8519 = new class263();
                                            var21 = var44.field3763 = class142.method1132(var11, (byte) -127);
                                            var22 = var44.field3760 = class142.method1132(var12, (byte) -111);
                                            var19 = var44.field3762 = class142.method1132(var13, (byte) -120);
                                            var20 = var44.field3757 = class604.method3438(-91, var14);
                                        }
                                        short var45 = this.field8511[var35];
                                        short var46 = this.field8530[var35];
                                        short var47 = this.field8523[var35];
                                        byte var48 = this.field8541[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var21[var52] += var45;
                                                var22[var52] += var46;
                                                var19[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        short var53 = var12[var41];
                                        short var54 = var13[var41];
                                        byte var55 = var14[var41];
                                        int var56 = this.field8475[var31];
                                        int var57 = this.field8475[var31 + 1];
                                        short var58 = var11[var41];
                                        for (int var59 = var56; var59 < var57; var59++) {
                                            int var60 = this.field8596[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var15[var60] += var58;
                                                var17[var60] += var53;
                                                var18[var60] += var54;
                                                var16[var60] += var55;
                                            }
                                        }
                                        if (this.field8510 == null && this.field8557 != null) {
                                            this.field8557.field9994 = null;
                                        }
                                        if (this.field8510 != null) {
                                            this.field8510.field9994 = null;
                                        }
                                        if (var6.field8510 == null && var6.field8557 != null) {
                                            var6.field8557.field9994 = null;
                                        }
                                        if (var6.field8510 != null) {
                                            var6.field8510.field9994 = null;
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

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILbca;ZII)Z")
    public final boolean method492(int arg0, int arg1, class661 arg2, boolean arg3, int arg4, int arg5) {
        field8580++;
        return this.method3555(arg3, 1566382404, arg5, arg1, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V")
    public static void method3552(int arg0) {
        field8505 = null;
        if (arg0 <= 75) {
            field8547 = null;
        }
        field8547 = null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)V")
    private final void method3553(boolean arg0) {
        if (this.field8568 != null) {
            class495 var2 = this.field8545.field551;
            this.field8545.method300(-18516);
            this.field8545.method306(!this.field8542);
            this.field8545.method173(false, 35);
            this.field8545.method317(this.field8545.field671, null, -26411, this.field8545.field655, null);
            for (int var3 = 0; var3 < this.field8483; var3++) {
                class712 var4 = this.field8568[var3];
                class606 var5 = this.field8543[var3];
                if (!var4.field9651 || !this.field8545.method328()) {
                    float var6 = (float) (this.field8490[var4.field9648] + this.field8490[var4.field9641] + this.field8490[var4.field9642]) * 0.3333333F;
                    float var7 = (float) (this.field8540[var4.field9642] + this.field8540[var4.field9641] + this.field8540[var4.field9648]) * 0.3333333F;
                    float var8 = (float) (this.field8591[var4.field9648] + this.field8591[var4.field9641] + this.field8591[var4.field9642]) * 0.3333333F;
                    float var9 = class464.field6514 * var8 + class698.field9439 * var7 + class534.field7351 * var6 + class387.field5624;
                    float var10 = class653.field8959 * var8 + class451.field6371 * var6 + class350.field4885 * var7 + class444.field6310;
                    float var11 = class365.field5229 * var8 + class722.field9804 * var7 + class692.field9362 * var6 + class647.field8899;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field9644;
                    var2.method2911(var11 * var12 - var11, var4.field9645 * var5.field8318 >> 7, (float) var5.field8316 + var9 - (var9 * var12), var4.field9650 * var5.field8319 >> 7, var5.field8315, 90, var10 * var12 + (float) var5.field8309 - var10);
                    this.field8545.method243((byte) 55, var2);
                    int var13 = var5.field8320;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field8545.method229(var4.field9647, -77);
                    this.field8545.method222(var4.field9649, 1);
                    this.field8545.method225(4, 7, 0, 93);
                }
            }
            this.field8545.method306(true);
            this.field8545.method182(true);
        }
        if (!arg0) {
            this.field8487 = 69;
        }
        field8496++;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIJILbh;IFIIF)S")
    private final short method3554(int arg0, int arg1, long arg2, int arg3, class37 arg4, int arg5, float arg6, int arg7, int arg8, float arg9) {
        field8546++;
        int var12 = this.field8475[arg8];
        int var13 = this.field8475[arg8 + 1];
        int var14 = arg7;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field8596[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class429.field6147[var15] == arg2) {
                return (short) (var16 - 1);
            }
        }
        this.field8596[var14] = (short) (this.field8476 + 1);
        class429.field6147[var14] = arg2;
        this.field8511[this.field8476] = (short) arg3;
        this.field8530[this.field8476] = (short) arg0;
        this.field8523[this.field8476] = (short) arg1;
        this.field8541[this.field8476] = (byte) arg5;
        this.field8499[this.field8476] = arg6;
        this.field8518[this.field8476] = arg9;
        return (short) (this.field8476++);
    }

    @OriginalMember(owner = "client!paa", name = "EA", descriptor = "()I")
    public final int method493() {
        field8584++;
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        return this.field8576;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZIIIIILbca;)Z")
    private final boolean method3555(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class661 arg6) {
        field8588++;
        class495 var8 = (class495) arg6;
        class495 var9 = this.field8545.field582;
        float var10 = var8.field6850 * var9.field6880 + var8.field6871 * var9.field6849 + var8.field6846 * var9.field6869 + var9.field6846;
        float var11 = var8.field6850 * var9.field6861 + var8.field6871 * var9.field6868 + var8.field6846 * var9.field6860 + var9.field6871;
        class698.field9439 = var8.field6853 * var9.field6880 + var8.field6868 * var9.field6849 + var8.field6849 * var9.field6869;
        class653.field8959 = var8.field6883 * var9.field6861 + var8.field6880 * var9.field6860 + var8.field6861 * var9.field6868;
        class692.field9362 = var8.field6855 * var9.field6883 + var8.field6869 * var9.field6855 + var8.field6860 * var9.field6853;
        class365.field5229 = var8.field6883 * var9.field6883 + var8.field6880 * var9.field6855 + var8.field6861 * var9.field6853;
        float var12 = var8.field6850 * var9.field6883 + var8.field6871 * var9.field6853 + var8.field6846 * var9.field6855 + var9.field6850;
        class350.field4885 = var8.field6853 * var9.field6861 + var8.field6868 * var9.field6868 + var8.field6849 * var9.field6860;
        class451.field6371 = var8.field6855 * var9.field6861 + var8.field6869 * var9.field6860 + var8.field6860 * var9.field6868;
        class464.field6514 = var8.field6883 * var9.field6880 + var8.field6880 * var9.field6869 + var8.field6861 * var9.field6849;
        class534.field7351 = var8.field6855 * var9.field6880 + var8.field6869 * var9.field6869 + var8.field6860 * var9.field6849;
        class722.field9804 = var8.field6853 * var9.field6883 + var8.field6868 * var9.field6853 + var8.field6849 * var9.field6855;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field8545.field593;
        int var19 = this.field8545.field616;
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        int var20 = this.field8533 - this.field8487 >> 1;
        int var21 = this.field8576 - this.field8538 >> 1;
        int var22 = this.field8593 - this.field8564 >> 1;
        int var23 = this.field8487 + var20;
        int var24 = this.field8538 + var21;
        int var25 = this.field8564 + var22;
        int var26 = var23 - (var20 << arg4);
        int var27 = var24 - (var21 << arg4);
        int var28 = var25 - (var22 << arg4);
        int var29 = (var20 << arg4) + var23;
        int var30 = (var21 << arg4) + var24;
        int var31 = (var22 << arg4) + var25;
        class42.field970[0] = var26;
        class82.field1491[0] = var27;
        class42.field970[1] = var29;
        class638.field8775[0] = var28;
        class82.field1491[1] = var27;
        class42.field970[2] = var26;
        if (arg1 != 1566382404) {
            this.method501();
        }
        class638.field8775[1] = var28;
        class82.field1491[2] = var30;
        class638.field8775[2] = var28;
        class42.field970[3] = var29;
        class82.field1491[3] = var30;
        class42.field970[4] = var26;
        class638.field8775[3] = var28;
        class82.field1491[4] = var27;
        class638.field8775[4] = var31;
        class42.field970[5] = var29;
        class82.field1491[5] = var27;
        class638.field8775[5] = var31;
        class42.field970[6] = var26;
        class82.field1491[6] = var30;
        class42.field970[7] = var29;
        class638.field8775[6] = var31;
        class82.field1491[7] = var30;
        class638.field8775[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class638.field8775[var32];
            float var54 = (float) class82.field1491[var32];
            float var55 = (float) class42.field970[var32];
            float var56 = class365.field5229 * var53 + class722.field9804 * var54 + class692.field9362 * var55 + var12;
            float var57 = class653.field8959 * var53 + class451.field6371 * var55 + class350.field4885 * var54 + var11;
            float var58 = class464.field6514 * var53 + class698.field9439 * var54 + class534.field7351 * var55 + var10;
            if ((float) this.field8545.field648 <= var56) {
                if (arg2 > 0) {
                    var56 = arg2;
                }
                float var59 = (float) var18 * var58 / var56 + (float) this.field8545.field675;
                if (var59 < var14) {
                    var14 = var59;
                }
                if (var59 > var15) {
                    var15 = var59;
                }
                float var60 = (float) var19 * var57 / var56 + (float) this.field8545.field632;
                if (var60 > var17) {
                    var17 = var60;
                }
                var13 = true;
                if (var60 < var16) {
                    var16 = var60;
                }
            }
        }
        if (var13 && (float) arg5 > var14 && (float) arg5 < var15 && (float) arg3 > var16 && (float) arg3 < var17) {
            if (arg0) {
                return true;
            }
            if (this.field8545.field702.length < this.field8476) {
                this.field8545.field705 = new int[this.field8476];
                this.field8545.field702 = new int[this.field8476];
            }
            int[] var33 = this.field8545.field702;
            int[] var34 = this.field8545.field705;
            for (int var35 = 0; var35 < this.field8504; var35++) {
                float var37 = (float) this.field8490[var35];
                float var38 = (float) this.field8591[var35];
                float var39 = (float) this.field8540[var35];
                float var40 = class365.field5229 * var38 + class722.field9804 * var39 + class692.field9362 * var37 + var12;
                float var41 = class464.field6514 * var38 + class698.field9439 * var39 + class534.field7351 * var37 + var10;
                float var42 = class653.field8959 * var38 + class451.field6371 * var37 + class350.field4885 * var39 + var11;
                if ((var40 >= (float) this.field8545.field648)) {
                    if (arg2 > 0) {
                        var40 = arg2;
                    }
                    int var47 = (int) ((float) var18 * var41 / var40 + (float) this.field8545.field675);
                    int var48 = (int) ((float) var19 * var42 / var40 + (float) this.field8545.field632);
                    int var49 = this.field8475[var35];
                    int var50 = this.field8475[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field8596[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field8475[var35];
                    int var44 = this.field8475[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field8596[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field8596[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field8579; var36++) {
                if (var33[this.field8539[var36]] != -999999 && var33[this.field8526[var36]] != -999999 && var33[this.field8513[var36]] != -999999 && this.method3550(arg3, var33[this.field8526[var36]], var33[this.field8513[var36]], var34[this.field8526[var36]], var33[this.field8539[var36]], var34[this.field8539[var36]], 125, arg5, var34[this.field8513[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!paa", name = "O", descriptor = "(III)V")
    public final void method483(int arg0, int arg1, int arg2) {
        field8565++;
        for (int var4 = 0; var4 < this.field8504; var4++) {
            if (arg0 != 128) {
                this.field8490[var4] = this.field8490[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8540[var4] = this.field8540[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8591[var4] = this.field8591[var4] * arg2 >> 7;
            }
        }
        if (this.field8552 != null) {
            this.field8552.field9994 = null;
        }
        this.field8474 = false;
    }

    @OriginalMember(owner = "client!paa", name = "ba", descriptor = "(Lr;)Lr;")
    public final class184 method530(class184 arg0) {
        field8509++;
        if (this.field8476 == 0) {
            return null;
        }
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        int var2;
        int var3;
        if (this.field8545.field594 > 0) {
            var2 = this.field8487 - (this.field8545.field594 * this.field8576 >> 8) >> this.field8545.field553;
            var3 = this.field8533 - (this.field8545.field594 * this.field8538 >> 8) >> this.field8545.field553;
        } else {
            var2 = this.field8487 - (this.field8545.field594 * this.field8538 >> 8) >> this.field8545.field553;
            var3 = this.field8533 - (this.field8545.field594 * this.field8576 >> 8) >> this.field8545.field553;
        }
        int var4;
        int var5;
        if (this.field8545.field599 > 0) {
            var4 = this.field8564 - (this.field8545.field599 * this.field8576 >> 8) >> this.field8545.field553;
            var5 = this.field8593 - (this.field8545.field599 * this.field8538 >> 8) >> this.field8545.field553;
        } else {
            var4 = this.field8564 - (this.field8545.field599 * this.field8538 >> 8) >> this.field8545.field553;
            var5 = this.field8593 - (this.field8545.field599 * this.field8576 >> 8) >> this.field8545.field553;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class28 var8 = (class28) arg0;
        class28 var9;
        if (var8 != null && var8.method397((byte) -47, var7, var6)) {
            var9 = var8;
            var8.method394((byte) 0);
        } else {
            var9 = new class28(this.field8545, var6, var7);
        }
        var9.method393(var5, var3, var4, 25053, var2);
        this.method3556((byte) 118, var9);
        return var9;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "()V")
    public final void method507() {
        field8507++;
        if (this.field8476 <= 0 || this.field8484 <= 0) {
            return;
        }
        this.method3559(5, false);
        if ((this.field8528 & 0x10) == 0 && this.field8522.field1 == null) {
            this.method3549(false, (byte) 27);
        }
        this.method3562((byte) 124);
    }

    @OriginalMember(owner = "client!paa", name = "na", descriptor = "()I")
    public final int method505() {
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        field8525++;
        return this.field8581;
    }

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "(I)V")
    public final void method482(int arg0) {
        field8569++;
        int var2 = class255.field3698[arg0];
        int var3 = class255.field3695[arg0];
        for (int var4 = 0; var4 < this.field8504; var4++) {
            int var7 = this.field8591[var4] * var2 + this.field8490[var4] * var3 >> 14;
            this.field8591[var4] = this.field8591[var4] * var3 - (this.field8490[var4] * var2) >> 14;
            this.field8490[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8476; var5++) {
            int var6 = this.field8523[var5] * var2 + this.field8511[var5] * var3 >> 14;
            this.field8523[var5] = (short) (this.field8523[var5] * var3 - (this.field8511[var5] * var2) >> 14);
            this.field8511[var5] = (short) var6;
        }
        if (this.field8510 == null && this.field8557 != null) {
            this.field8557.field9994 = null;
        }
        if (this.field8510 != null) {
            this.field8510.field9994 = null;
        }
        if (this.field8552 != null) {
            this.field8552.field9994 = null;
        }
        this.field8474 = false;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLuc;)V")
    private final void method3556(byte arg0, class28 arg1) {
        if (this.field8476 > this.field8545.field702.length) {
            this.field8545.field705 = new int[this.field8476];
            this.field8545.field702 = new int[this.field8476];
        }
        field8477++;
        int[] var3 = this.field8545.field702;
        if (arg0 < 91) {
            this.method494();
        }
        int[] var4 = this.field8545.field705;
        for (int var5 = 0; var5 < this.field8504; var5++) {
            int var16 = (this.field8490[var5] - (this.field8540[var5] * this.field8545.field594 >> 8) >> this.field8545.field553) - arg1.field754;
            int var17 = (this.field8591[var5] - (this.field8540[var5] * this.field8545.field599 >> 8) >> this.field8545.field553) - arg1.field749;
            int var18 = this.field8475[var5];
            int var19 = this.field8475[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field8596[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field8484; var6++) {
            if (this.field8489 == null || this.field8489[var6] <= 128) {
                short var7 = this.field8539[var6];
                short var8 = this.field8526[var6];
                short var9 = this.field8513[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13) > 0) {
                    arg1.method395(var12, var10, var13, 28, var11, var15, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        field8481++;
        for (int var5 = 0; var5 < this.field8579; var5++) {
            int var9 = this.field8527[var5] & 0xFFFF;
            int var10 = (var9 & 0xFD9E) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field8527[var5] = (short) class418.method2577(class418.method2577(var11 << 7, var10 << 10), var12);
        }
        if (this.field8568 != null) {
            for (int var6 = 0; var6 < this.field8483; var6++) {
                class712 var7 = this.field8568[var6];
                class606 var8 = this.field8543[var6];
                var8.field8320 = class456.field6424[this.field8527[var7.field9643] & 0xFFFF] & 0xFFFFFF | var8.field8320 & 0xFF000000;
            }
        }
        if (this.field8557 != null) {
            this.field8557.field9994 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "H", descriptor = "(III)V")
    public final void method528(int arg0, int arg1, int arg2) {
        field8494++;
        for (int var4 = 0; var4 < this.field8504; var4++) {
            if (arg0 != 0) {
                this.field8490[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8540[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8591[var4] += arg2;
            }
        }
        this.field8474 = false;
        if (this.field8552 != null) {
            this.field8552.field9994 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public final void method524(int arg0) {
        field8485++;
        int var2 = class255.field3698[arg0];
        int var3 = class255.field3695[arg0];
        for (int var4 = 0; var4 < this.field8504; var4++) {
            int var5 = this.field8591[var4] * var2 + this.field8490[var4] * var3 >> 14;
            this.field8591[var4] = this.field8591[var4] * var3 - (this.field8490[var4] * var2) >> 14;
            this.field8490[var4] = var5;
        }
        this.field8474 = false;
        if (this.field8552 != null) {
            this.field8552.field9994 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "F", descriptor = "()Z")
    public final boolean method488() {
        field8559++;
        return this.field8542;
    }

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "()V")
    public final void method520() {
        field8560++;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lpaa;IIZLpaa;Z)Lka;")
    private final class472 method3557(class624 arg0, int arg1, int arg2, boolean arg3, class624 arg4, boolean arg5) {
        field8575++;
        arg0.field8589 = this.field8589;
        arg0.field8503 = this.field8503;
        arg0.field8483 = this.field8483;
        arg0.field8528 = 0;
        arg0.field8491 = this.field8491;
        arg0.field8476 = this.field8476;
        arg0.field8585 = this.field8585;
        arg0.field8595 = arg1;
        arg0.field8592 = this.field8592;
        arg0.field8579 = this.field8579;
        arg0.field8484 = this.field8484;
        arg0.field8504 = this.field8504;
        if ((arg1 & 0x100) == 0) {
            arg0.field8542 = this.field8542;
        } else {
            arg0.field8542 = true;
        }
        boolean var7 = class362.method2308(this.field8503, arg1, -1);
        boolean var8 = class426.method2606(false, this.field8503, arg1);
        boolean var9 = class3.method12(arg2, this.field8503, arg1);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg0.field8490 = this.field8490;
            } else if (arg4.field8490 == null || arg4.field8490.length < this.field8589) {
                arg0.field8490 = arg4.field8490 = new int[this.field8589];
            } else {
                arg0.field8490 = arg4.field8490;
            }
            if (!var8) {
                arg0.field8540 = this.field8540;
            } else if (arg4.field8540 == null || this.field8589 > arg4.field8540.length) {
                arg0.field8540 = arg4.field8540 = new int[this.field8589];
            } else {
                arg0.field8540 = arg4.field8540;
            }
            if (!var9) {
                arg0.field8591 = this.field8591;
            } else if (arg4.field8591 == null || this.field8589 > arg4.field8591.length) {
                arg0.field8591 = arg4.field8591 = new int[this.field8589];
            } else {
                arg0.field8591 = arg4.field8591;
            }
            for (int var11 = 0; var11 < this.field8589; var11++) {
                if (var7) {
                    arg0.field8490[var11] = this.field8490[var11];
                }
                if (var8) {
                    arg0.field8540[var11] = this.field8540[var11];
                }
                if (var9) {
                    arg0.field8591[var11] = this.field8591[var11];
                }
            }
        } else {
            arg0.field8591 = this.field8591;
            arg0.field8540 = this.field8540;
            arg0.field8490 = this.field8490;
        }
        if (class138.method1119(arg1, -79, this.field8503)) {
            arg0.field8552 = arg4.field8552;
            if (arg5) {
                arg0.field8528 = (byte) (arg0.field8528 | 0x1);
            }
            arg0.field8552.field9994 = this.field8552.field9994;
            arg0.field8552.field9995 = this.field8552.field9995;
        } else if (class472.method2783(arg2 + 2, arg1, this.field8503)) {
            arg0.field8552 = this.field8552;
        } else {
            arg0.field8552 = null;
        }
        if (class514.method3007(12644, this.field8503, arg1)) {
            if (arg4.field8527 == null || this.field8579 > arg4.field8527.length) {
                arg0.field8527 = arg4.field8527 = new short[this.field8579];
            } else {
                arg0.field8527 = arg4.field8527;
            }
            for (int var12 = 0; var12 < this.field8579; var12++) {
                arg0.field8527[var12] = this.field8527[var12];
            }
        } else {
            arg0.field8527 = this.field8527;
        }
        if (class183.method1337(arg1, -128, this.field8503)) {
            if (arg4.field8489 == null || this.field8579 > arg4.field8489.length) {
                arg0.field8489 = arg4.field8489 = new byte[this.field8579];
            } else {
                arg0.field8489 = arg4.field8489;
            }
            for (int var13 = 0; var13 < this.field8579; var13++) {
                arg0.field8489[var13] = this.field8489[var13];
            }
        } else {
            arg0.field8489 = this.field8489;
        }
        if (class418.method2576(arg1, 108, this.field8503)) {
            arg0.field8557 = arg4.field8557;
            if (arg5) {
                arg0.field8528 = (byte) (arg0.field8528 | 0x2);
            }
            arg0.field8557.field9994 = this.field8557.field9994;
            arg0.field8557.field9995 = this.field8557.field9995;
        } else if (class499.method2945(this.field8503, arg1, true)) {
            arg0.field8557 = this.field8557;
        } else {
            arg0.field8557 = null;
        }
        if (class444.method2671(this.field8503, arg1, -119)) {
            if (arg4.field8511 == null || arg4.field8511.length < this.field8476) {
                int var14 = this.field8476;
                arg0.field8530 = arg4.field8530 = new short[var14];
                arg0.field8511 = arg4.field8511 = new short[var14];
                arg0.field8523 = arg4.field8523 = new short[var14];
            } else {
                arg0.field8511 = arg4.field8511;
                arg0.field8530 = arg4.field8530;
                arg0.field8523 = arg4.field8523;
            }
            if (this.field8519 == null) {
                for (int var15 = 0; var15 < this.field8476; var15++) {
                    arg0.field8511[var15] = this.field8511[var15];
                    arg0.field8530[var15] = this.field8530[var15];
                    arg0.field8523[var15] = this.field8523[var15];
                }
            } else {
                if (arg4.field8519 == null) {
                    arg4.field8519 = new class263();
                }
                class263 var16 = arg0.field8519 = arg4.field8519;
                if (var16.field3763 == null || this.field8476 > var16.field3763.length) {
                    int var17 = this.field8476;
                    var16.field3760 = new short[var17];
                    var16.field3762 = new short[var17];
                    var16.field3763 = new short[var17];
                    var16.field3757 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field8476; var18++) {
                    arg0.field8511[var18] = this.field8511[var18];
                    arg0.field8530[var18] = this.field8530[var18];
                    arg0.field8523[var18] = this.field8523[var18];
                    var16.field3763[var18] = this.field8519.field3763[var18];
                    var16.field3760[var18] = this.field8519.field3760[var18];
                    var16.field3762[var18] = this.field8519.field3762[var18];
                    var16.field3757[var18] = this.field8519.field3757[var18];
                }
            }
            arg0.field8541 = this.field8541;
        } else {
            arg0.field8511 = this.field8511;
            arg0.field8530 = this.field8530;
            arg0.field8519 = this.field8519;
            arg0.field8541 = this.field8541;
            arg0.field8523 = this.field8523;
        }
        if (class564.method3272(arg1, this.field8503, true)) {
            if (arg5) {
                arg0.field8528 = (byte) (arg0.field8528 | 0x4);
            }
            arg0.field8510 = arg4.field8510;
            arg0.field8510.field9994 = this.field8510.field9994;
            arg0.field8510.field9995 = this.field8510.field9995;
        } else if (class301.method1959((byte) 108, this.field8503, arg1)) {
            arg0.field8510 = this.field8510;
        } else {
            arg0.field8510 = null;
        }
        if (class144.method1133((byte) 121, arg1, this.field8503)) {
            if (arg4.field8499 == null || this.field8579 > arg4.field8499.length) {
                int var19 = this.field8476;
                arg0.field8518 = arg4.field8518 = new float[var19];
                arg0.field8499 = arg4.field8499 = new float[var19];
            } else {
                arg0.field8518 = arg4.field8518;
                arg0.field8499 = arg4.field8499;
            }
            for (int var20 = 0; var20 < this.field8476; var20++) {
                arg0.field8499[var20] = this.field8499[var20];
                arg0.field8518[var20] = this.field8518[var20];
            }
        } else {
            arg0.field8518 = this.field8518;
            arg0.field8499 = this.field8499;
        }
        if (class601.method3424((byte) -96, this.field8503, arg1)) {
            arg0.field8567 = arg4.field8567;
            if (arg5) {
                arg0.field8528 = (byte) (arg0.field8528 | 0x8);
            }
            arg0.field8567.field9994 = this.field8567.field9994;
            arg0.field8567.field9995 = this.field8567.field9995;
        } else if (class586.method3349(this.field8503, (byte) -60, arg1)) {
            arg0.field8567 = this.field8567;
        } else {
            arg0.field8567 = null;
        }
        if (class32.method438(-19, this.field8503, arg1)) {
            if (arg4.field8539 == null || arg4.field8539.length < this.field8579) {
                int var21 = this.field8579;
                arg0.field8513 = arg4.field8513 = new short[var21];
                arg0.field8539 = arg4.field8539 = new short[var21];
                arg0.field8526 = arg4.field8526 = new short[var21];
            } else {
                arg0.field8526 = arg4.field8526;
                arg0.field8539 = arg4.field8539;
                arg0.field8513 = arg4.field8513;
            }
            for (int var22 = 0; var22 < this.field8579; var22++) {
                arg0.field8539[var22] = this.field8539[var22];
                arg0.field8526[var22] = this.field8526[var22];
                arg0.field8513[var22] = this.field8513[var22];
            }
        } else {
            arg0.field8513 = this.field8513;
            arg0.field8526 = this.field8526;
            arg0.field8539 = this.field8539;
        }
        if (class239.method1664(arg1, this.field8503, (byte) -70)) {
            if (arg5) {
                arg0.field8528 = (byte) (arg0.field8528 | 0x10);
            }
            arg0.field8522 = arg4.field8522;
            arg0.field8522.field1 = this.field8522.field1;
        } else if (class444.method2668(arg1, this.field8503, -93)) {
            arg0.field8522 = this.field8522;
        } else {
            arg0.field8522 = null;
        }
        if (class460.method2727(this.field8503, 32768, arg1)) {
            if (arg4.field8548 == null || arg4.field8548.length < this.field8579) {
                int var23 = this.field8579;
                arg0.field8548 = arg4.field8548 = new short[var23];
            } else {
                arg0.field8548 = arg4.field8548;
            }
            for (int var24 = 0; var24 < this.field8579; var24++) {
                arg0.field8548[var24] = this.field8548[var24];
            }
        } else {
            arg0.field8548 = this.field8548;
        }
        if (!class293.method1917((byte) -113, arg1, this.field8503)) {
            arg0.field8543 = this.field8543;
        } else if (arg4.field8543 == null || this.field8483 > arg4.field8543.length) {
            int var26 = this.field8483;
            arg0.field8543 = arg4.field8543 = new class606[var26];
            for (int var27 = 0; var27 < this.field8483; var27++) {
                arg0.field8543[var27] = this.field8543[var27].method3449(true);
            }
        } else {
            arg0.field8543 = arg4.field8543;
            for (int var25 = 0; var25 < this.field8483; var25++) {
                arg0.field8543[var25].method3448(this.field8543[var25], (byte) -110);
            }
        }
        arg0.field8475 = this.field8475;
        arg0.field8488 = this.field8488;
        arg0.field8573 = this.field8573;
        if (this.field8474) {
            arg0.field8487 = this.field8487;
            arg0.field8506 = this.field8506;
            arg0.field8564 = this.field8564;
            arg0.field8533 = this.field8533;
            arg0.field8576 = this.field8576;
            arg0.field8538 = this.field8538;
            arg0.field8474 = true;
            arg0.field8581 = this.field8581;
            arg0.field8593 = this.field8593;
        } else {
            arg0.field8474 = false;
        }
        arg0.field8568 = this.field8568;
        arg0.field8555 = this.field8555;
        arg0.field8486 = this.field8486;
        arg0.field8596 = this.field8596;
        arg0.field8500 = this.field8500;
        arg0.field8520 = this.field8520;
        arg0.field8574 = this.field8574;
        arg0.field8587 = this.field8587;
        return arg0;
    }

    @OriginalMember(owner = "client!paa", name = "LA", descriptor = "(I)V")
    public final void method485(int arg0) {
        if (this.field8557 != null) {
            this.field8557.field9994 = null;
        }
        field8570++;
        this.field8592 = (short) arg0;
        if (this.field8510 != null) {
            this.field8510.field9994 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "wa", descriptor = "()V")
    public final void method495() {
        for (int var1 = 0; var1 < this.field8589; var1++) {
            this.field8490[var1] = this.field8490[var1] + 7 >> 4;
            this.field8540[var1] = this.field8540[var1] + 7 >> 4;
            this.field8591[var1] = this.field8591[var1] + 7 >> 4;
        }
        field8532++;
        if (this.field8552 != null) {
            this.field8552.field9994 = null;
        }
        this.field8474 = false;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lbca;Liw;II)V")
    public final void method497(class661 arg0, class317 arg1, int arg2, int arg3) {
        field8586++;
        if (this.field8476 == 0) {
            return;
        }
        class495 var5 = this.field8545.field582;
        class495 var6 = (class495) arg0;
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        class722.field9804 = var5.field6883 * var6.field6853 + var5.field6855 * var6.field6849 + var5.field6853 * var6.field6868;
        class647.field8899 = var5.field6883 * var6.field6850 + var5.field6855 * var6.field6846 + var5.field6853 * var6.field6871 + var5.field6850;
        float var7 = (float) this.field8538 * class722.field9804 + class647.field8899;
        float var8 = (float) this.field8576 * class722.field9804 + class647.field8899;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = (float) this.field8581 + var7;
            var10 = (float) (-this.field8581) + var8;
        } else {
            var9 = (float) this.field8581 + var8;
            var10 = var7 - (float) this.field8581;
        }
        if ((var10 >= this.field8545.field697) || ((float) this.field8545.field648 >= var9)) {
            return;
        }
        class698.field9439 = var5.field6880 * var6.field6853 + var5.field6869 * var6.field6849 + var5.field6849 * var6.field6868;
        class387.field5624 = var5.field6880 * var6.field6850 + var5.field6869 * var6.field6846 + var5.field6849 * var6.field6871 + var5.field6846;
        float var11 = (float) this.field8538 * class698.field9439 + class387.field5624;
        float var12 = (float) this.field8576 * class698.field9439 + class387.field5624;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = ((float) this.field8581 + var11) * (float) this.field8545.field593;
            var13 = (var12 - (float) this.field8581) * (float) this.field8545.field593;
        } else {
            var13 = ((float) (-this.field8581) + var11) * (float) this.field8545.field593;
            var14 = ((float) this.field8581 + var12) * (float) this.field8545.field593;
        }
        if ((this.field8545.field657 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field8545.field694)) {
            return;
        }
        class350.field4885 = var5.field6861 * var6.field6853 + var5.field6868 * var6.field6868 + var5.field6860 * var6.field6849;
        class444.field6310 = var5.field6861 * var6.field6850 + var5.field6868 * var6.field6871 + var5.field6860 * var6.field6846 + var5.field6871;
        float var15 = (float) this.field8538 * class350.field4885 + class444.field6310;
        float var16 = (float) this.field8576 * class350.field4885 + class444.field6310;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) (-this.field8581) + var16) * (float) this.field8545.field616;
            var18 = ((float) this.field8581 + var15) * (float) this.field8545.field616;
        } else {
            var18 = ((float) this.field8581 + var16) * (float) this.field8545.field616;
            var17 = (var15 - (float) this.field8581) * (float) this.field8545.field616;
        }
        if ((var17 / (float) arg2 >= this.field8545.field652) || (this.field8545.field658 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field8568 != null) {
            class451.field6371 = var5.field6861 * var6.field6855 + var5.field6868 * var6.field6860 + var5.field6860 * var6.field6869;
            class464.field6514 = var5.field6880 * var6.field6883 + var5.field6869 * var6.field6880 + var5.field6849 * var6.field6861;
            class692.field9362 = var5.field6883 * var6.field6855 + var5.field6855 * var6.field6869 + var5.field6853 * var6.field6860;
            class653.field8959 = var5.field6861 * var6.field6883 + var5.field6868 * var6.field6861 + var5.field6860 * var6.field6880;
            class365.field5229 = var5.field6883 * var6.field6883 + var5.field6855 * var6.field6880 + var5.field6853 * var6.field6861;
            class534.field7351 = var5.field6880 * var6.field6855 + var5.field6869 * var6.field6869 + var5.field6849 * var6.field6860;
        }
        if (arg1 != null) {
            int var19 = this.field8533 + this.field8487 >> 1;
            int var20 = this.field8593 + this.field8564 >> 1;
            int var21 = (int) ((float) var20 * class464.field6514 + (float) this.field8538 * class698.field9439 + (float) var19 * class534.field7351 + class387.field5624);
            int var22 = (int) ((float) var20 * class653.field8959 + (float) this.field8538 * class350.field4885 + (float) var19 * class451.field6371 + class444.field6310);
            int var23 = (int) ((float) var20 * class365.field5229 + (float) this.field8538 * class722.field9804 + (float) var19 * class692.field9362 + class647.field8899);
            int var24 = (int) ((float) var20 * class464.field6514 + (float) this.field8576 * class698.field9439 + (float) var19 * class534.field7351 + class387.field5624);
            int var25 = (int) ((float) var20 * class653.field8959 + (float) this.field8576 * class350.field4885 + (float) var19 * class451.field6371 + class444.field6310);
            arg1.field4383 = this.field8545.field675 + (this.field8545.field593 * var21 / arg2);
            arg1.field4380 = this.field8545.field616 * var22 / arg2 + this.field8545.field632;
            arg1.field4382 = this.field8545.field616 * var25 / arg2 + this.field8545.field632;
            int var26 = (int) ((float) var20 * class365.field5229 + (float) this.field8576 * class722.field9804 + (float) var19 * class692.field9362 + class647.field8899);
            arg1.field4384 = this.field8545.field593 * var24 / arg2 + this.field8545.field675;
            if (this.field8545.field648 <= var23 || var26 >= this.field8545.field648) {
                arg1.field4379 = true;
                arg1.field4381 = (this.field8581 + var21) * this.field8545.field593 / arg2 + this.field8545.field675 - arg1.field4383;
            }
        }
        this.field8545.method304((byte) -122, (float) arg2);
        this.field8545.method236(1);
        this.field8545.method230(false, var6);
        this.method3548((byte) 127);
        this.field8545.method182(true);
        this.method3553(true);
    }

    @OriginalMember(owner = "client!paa", name = "da", descriptor = "()I")
    public final int method510() {
        field8583++;
        return this.field8592;
    }

    @OriginalMember(owner = "client!paa", name = "NA", descriptor = "()Z")
    public final boolean method487() {
        field8590++;
        if (this.field8486 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field8589; var1++) {
            this.field8490[var1] <<= 0x4;
            this.field8540[var1] <<= 0x4;
            this.field8591[var1] <<= 0x4;
        }
        class95.field1661 = 0;
        class415.field6007 = 0;
        class226.field3240 = 0;
        return true;
    }

    @OriginalMember(owner = "client!paa", name = "RA", descriptor = "()I")
    public final int method532() {
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        field8534++;
        return this.field8533;
    }

    @OriginalMember(owner = "client!paa", name = "G", descriptor = "()I")
    public final int method512() {
        field8578++;
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        return this.field8593;
    }

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method508(int arg0, int arg1, class281 arg2, class281 arg3, int arg4, int arg5, int arg6) {
        field8479++;
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        int var8 = this.field8487 + arg4;
        int var9 = arg4 + this.field8533;
        int var10 = arg6 + this.field8564;
        int var11 = this.field8593 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3937 <= arg2.field3942 + var9 >> arg2.field3938 || var10 < 0 || arg2.field3940 <= var11 + arg2.field3942 >> arg2.field3938) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3937 <= (var9 + arg3.field3942 >> arg3.field3938) || var10 < 0 || arg3.field3940 <= arg3.field3942 + var11 >> arg3.field3938) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3938;
            int var13 = var9 + arg2.field3942 - 1 >> arg2.field3938;
            int var14 = var10 >> arg2.field3938;
            int var15 = arg2.field3942 + var11 - 1 >> arg2.field3938;
            if (arg2.method1851((byte) -86, var14, var12) == arg5 && arg2.method1851((byte) -86, var14, var13) == arg5 && arg5 == arg2.method1851((byte) -86, var15, var12) && arg5 == arg2.method1851((byte) -86, var15, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field8504; var16++) {
                this.field8540[var16] = this.field8540[var16] + arg2.method1853(this.field8490[var16] + arg4, this.field8591[var16] + arg6, (byte) -93) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field8538;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field8504; var31++) {
                int var32 = (this.field8540[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field8540[var31] -= -((arg2.method1853(this.field8490[var31] + arg4, this.field8591[var31] + arg6, (byte) -94) - arg5) * (arg1 - var32) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = ((arg1 & 0xFF0E) >> 8) * 4;
            int var19 = arg1 >> 16 & 0xFF << 6;
            int var20 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var17 >> 1) < 0 || (var17 >> 1) + (arg4 + arg2.field3942) >= arg2.field3937 << arg2.field3938 || arg6 - (var18 >> 1) < 0 || ((var18 >> 1) + arg6 + arg2.field3942) >= (arg2.field3940 << arg2.field3938)) {
                return;
            }
            this.method2786(var17, 10947, var20, arg4, var18, arg5, var19, arg2, arg6);
        } else if (arg0 == 4) {
            int var28 = this.field8576 - this.field8538;
            for (int var29 = 0; var29 < this.field8504; var29++) {
                this.field8540[var29] -= arg5 - arg3.method1853(this.field8490[var29] + arg4, this.field8591[var29] + arg6, (byte) 71) - var28;
            }
        } else if (arg0 == 5) {
            int var21 = this.field8576 - this.field8538;
            for (int var22 = 0; var22 < this.field8504; var22++) {
                int var23 = this.field8490[var22] + arg4;
                int var24 = this.field8591[var22] + arg6;
                int var25 = arg2.method1853(var23, var24, (byte) -100);
                int var26 = arg3.method1853(var23, var24, (byte) 93);
                int var27 = var25 - arg1 - var26;
                this.field8540[var22] = ((this.field8540[var22] << 8) / var21 * var27 >> 8) + var25 - arg5;
            }
        }
        this.field8474 = false;
        if (this.field8552 != null) {
            this.field8552.field9994 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BI)V")
    public static final void method3558(byte arg0, int arg1) {
        int var2 = 113 / ((-arg0 - 63) / 53);
        field8517++;
        class594 var3 = class692.method3869(arg1, (byte) 105, 5);
        var3.method3383(-16058);
    }

    @OriginalMember(owner = "client!paa", name = "aa", descriptor = "(SS)V")
    public final void method491(short arg0, short arg1) {
        field8537++;
        class152 var3 = this.field8545.field1170;
        for (int var4 = 0; var4 < this.field8579; var4++) {
            if (this.field8548[var4] == arg0) {
                this.field8548[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class739 var7 = var3.method1180(arg0 & 0xFFFF, -6662);
            var6 = var7.field9958;
            var5 = var7.field9943;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class739 var10 = var3.method1180(arg1 & 0xFFFF, -6662);
            if (var10.field9940 != 0 || var10.field9953 != 0) {
                this.field8585 = true;
            }
            var8 = var10.field9943;
            var9 = var10.field9958;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field8568 != null) {
            for (int var11 = 0; var11 < this.field8483; var11++) {
                class712 var12 = this.field8568[var11];
                class606 var13 = this.field8543[var11];
                var13.field8320 = class456.field6424[this.field8527[var12.field9643] & 0xFFFF] & 0xFFFFFF | var13.field8320 & 0xFF000000;
            }
        }
        if (this.field8557 != null) {
            this.field8557.field9994 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZ)V")
    private final void method3559(int arg0, boolean arg1) {
        field8535++;
        boolean var3 = this.field8557 != null && this.field8557.field9994 == null;
        boolean var4 = this.field8510 != null && this.field8510.field9994 == null;
        boolean var5 = this.field8552 != null && this.field8552.field9994 == null;
        boolean var6 = this.field8567 != null && this.field8567.field9994 == null;
        if (arg1) {
            var6 &= (this.field8528 & 0x8) != 0;
            var4 &= (this.field8528 & 0x4) != 0;
            var3 &= (this.field8528 & 0x2) != 0;
            var5 &= (this.field8528 & 0x1) != 0;
        }
        byte var7 = 0;
        if (arg0 != 5) {
            return;
        }
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
        if (this.field8545.field620.field3066.length < (this.field8476 * var7)) {
            this.field8545.field620 = new class548((this.field8476 + 100) * var7);
        } else {
            this.field8545.field620.field3109 = 0;
        }
        class548 var12 = this.field8545.field620;
        if (var5) {
            if (this.field8545.field597) {
                for (int var13 = 0; var13 < this.field8504; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field8490[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field8540[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field8591[var13]);
                    int var17 = this.field8475[var13];
                    int var18 = this.field8475[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field8596[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field3109 = var7 * var20;
                        var12.method1539((byte) 111, var14);
                        var12.method1539((byte) 109, var15);
                        var12.method1539((byte) 116, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field8504; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field8490[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field8540[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field8591[var21]);
                    int var25 = this.field8475[var21];
                    int var26 = this.field8475[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field8596[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field3109 = var7 * var28;
                        var12.method1542(-23892, var22);
                        var12.method1542(arg0 - 23897, var23);
                        var12.method1542(-23892, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field8510 == null) {
                short[] var29;
                short[] var30;
                short[] var31;
                byte[] var32;
                if (this.field8519 == null) {
                    var30 = this.field8523;
                    var32 = this.field8541;
                    var31 = this.field8530;
                    var29 = this.field8511;
                } else {
                    var29 = this.field8519.field3763;
                    var30 = this.field8519.field3762;
                    var31 = this.field8519.field3760;
                    var32 = this.field8519.field3757;
                }
                float var33 = this.field8545.field647[0];
                float var34 = this.field8545.field647[1];
                float var35 = this.field8545.field647[2];
                float var36 = this.field8545.field590;
                float var37 = this.field8545.field654 * 768.0F / (float) this.field8592;
                float var38 = this.field8545.field693 * 768.0F / (float) this.field8592;
                for (int var39 = 0; var39 < this.field8579; var39++) {
                    int var40 = this.method3551(19995, this.field8491, this.field8489[var39], this.field8548[var39], this.field8527[var39]);
                    float var41 = (float) (var40 >>> 24) * this.field8545.field603;
                    float var42 = (float) (var40 >> 8 & 0xFF) * this.field8545.field645;
                    float var43 = (float) ((var40 & 0xFF88E4) >> 16) * this.field8545.field638;
                    short var44 = this.field8539[var39];
                    short var45 = (short) var32[var44];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var30[var44] * var35 + (float) var29[var44] * var33 + (float) var31[var44] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var30[var44] * var35 + (float) var29[var44] * var33 + (float) var31[var44] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var36 + var46 * ((var46 < 0.0F) ? var38 : var37);
                    int var48 = (int) (var41 * var47);
                    int var49 = (int) (var43 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var50 = (int) (var42 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    var12.field3109 = var7 * var44 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method1526(false, var48);
                    var12.method1526(false, var49);
                    var12.method1526(false, var50);
                    var12.method1526(false, 255 - (this.field8489[var39] & 0xFF));
                    short var51 = this.field8526[var39];
                    short var52 = (short) var32[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var30[var51] * var35 + (float) var29[var51] * var33 + (float) var31[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var30[var51] * var35 + (float) var29[var51] * var33 + (float) var31[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = var36 + var53 * (var53 < 0.0F ? var38 : var37);
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var43 * var54);
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
                    int var57 = (int) (var42 * var54);
                    var12.field3109 = var9 + (var7 * var51);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method1526(false, var55);
                    var12.method1526(false, var56);
                    var12.method1526(false, var57);
                    var12.method1526(false, 255 - (this.field8489[var39] & 0xFF));
                    short var58 = this.field8513[var39];
                    short var59 = (short) var32[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var30[var58] * var35 + (float) var29[var58] * var33 + (float) var31[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var30[var58] * var35 + (float) var29[var58] * var33 + (float) var31[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = var36 + ((var60 < 0.0F) ? var38 : var37) * var60;
                    int var62 = (int) (var41 * var61);
                    int var63 = (int) (var43 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var64 = (int) (var42 * var61);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field3109 = var7 * var58 + var9;
                    var12.method1526(false, var62);
                    var12.method1526(false, var63);
                    var12.method1526(false, var64);
                    var12.method1526(false, 255 - (this.field8489[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field8579; var65++) {
                    int var66 = this.method3551(arg0 + 19990, this.field8491, this.field8489[var65], this.field8548[var65], this.field8527[var65]);
                    var12.field3109 = this.field8539[var65] * var7 + var9;
                    var12.method1539((byte) 105, var66);
                    var12.field3109 = var9 + (this.field8526[var65] * var7);
                    var12.method1539((byte) 87, var66);
                    var12.field3109 = var9 + (this.field8513[var65] * var7);
                    var12.method1539((byte) 120, var66);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field8519 == null) {
                var67 = this.field8511;
                var68 = this.field8530;
                var69 = this.field8541;
                var70 = this.field8523;
            } else {
                var69 = this.field8519.field3757;
                var68 = this.field8519.field3760;
                var70 = this.field8519.field3762;
                var67 = this.field8519.field3763;
            }
            float var71 = 3.0F / (float) this.field8592;
            var12.field3109 = var10;
            float var72 = 3.0F / (float) (this.field8592 / 2 + this.field8592);
            if (this.field8545.field597) {
                for (int var76 = 0; var76 < this.field8476; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3157((float) var67[var76] * var72, (byte) -96);
                        var12.method3157((float) var68[var76] * var72, (byte) -101);
                        var12.method3157((float) var70[var76] * var72, (byte) -95);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3157((float) var67[var76] * var78, (byte) -102);
                        var12.method3157((float) var68[var76] * var78, (byte) -127);
                        var12.method3157((float) var70[var76] * var78, (byte) -84);
                    }
                    var12.field3109 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field8476; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3156(18291, (float) var67[var73] * var72);
                        var12.method3156(18291, (float) var68[var73] * var72);
                        var12.method3156(arg0 + 18286, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3156(arg0 ^ 0x4776, (float) var67[var73] * var75);
                        var12.method3156(18291, (float) var68[var73] * var75);
                        var12.method3156(18291, (float) var70[var73] * var75);
                    }
                    var12.field3109 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field3109 = var11;
            if (this.field8545.field597) {
                for (int var79 = 0; var79 < this.field8476; var79++) {
                    var12.method3157(this.field8499[var79], (byte) -127);
                    var12.method3157(this.field8518[var79], (byte) -126);
                    var12.field3109 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field8476; var80++) {
                    var12.method3156(arg0 ^ 0x4776, this.field8499[var80]);
                    var12.method3156(18291, this.field8518[var80]);
                    var12.field3109 += var7 - 8;
                }
            }
        }
        var12.field3109 = this.field8476 * var7;
        class490 var81;
        if (arg1) {
            if (this.field8501 == null) {
                this.field8501 = this.field8545.method178(2, true, var7, var12.field3066, var12.field3109);
            } else {
                this.field8501.method960(var7, var12.field3109, var12.field3066, -9894);
            }
            var81 = this.field8501;
            this.field8528 = 0;
        } else {
            var81 = this.field8545.method178(2, false, var7, var12.field3066, var12.field3109);
            this.field8502 = true;
        }
        if (var5) {
            this.field8552.field9995 = var8;
            this.field8552.field9994 = var81;
        }
        if (var6) {
            this.field8567.field9995 = var11;
            this.field8567.field9994 = var81;
        }
        if (var3) {
            this.field8557.field9995 = var9;
            this.field8557.field9994 = var81;
        }
        if (var4) {
            this.field8510.field9995 = var10;
            this.field8510.field9994 = var81;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lbca;Liw;I)V")
    public final void method521(class661 arg0, class317 arg1, int arg2) {
        field8558++;
        if (this.field8476 == 0) {
            return;
        }
        class495 var4 = this.field8545.field582;
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        class495 var5 = (class495) arg0;
        class722.field9804 = var4.field6883 * var5.field6853 + var4.field6855 * var5.field6849 + var4.field6853 * var5.field6868;
        class647.field8899 = var4.field6883 * var5.field6850 + var4.field6855 * var5.field6846 + var4.field6853 * var5.field6871 + var4.field6850;
        float var6 = (float) this.field8538 * class722.field9804 + class647.field8899;
        float var7 = (float) this.field8576 * class722.field9804 + class647.field8899;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = var7 - (float) this.field8581;
            var9 = (float) this.field8581 + var6;
        } else {
            var8 = (float) (-this.field8581) + var6;
            var9 = (float) this.field8581 + var7;
        }
        if ((this.field8545.field696 <= var8) || ((float) this.field8545.field648 >= var9)) {
            return;
        }
        class698.field9439 = var4.field6880 * var5.field6853 + var4.field6869 * var5.field6849 + var4.field6849 * var5.field6868;
        class387.field5624 = var4.field6880 * var5.field6850 + var4.field6869 * var5.field6846 + var4.field6849 * var5.field6871 + var4.field6846;
        float var10 = (float) this.field8538 * class698.field9439 + class387.field5624;
        float var11 = (float) this.field8576 * class698.field9439 + class387.field5624;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var13 = ((float) (-this.field8581) + var11) * (float) this.field8545.field593;
            var12 = ((float) this.field8581 + var10) * (float) this.field8545.field593;
        } else {
            var12 = ((float) this.field8581 + var11) * (float) this.field8545.field593;
            var13 = ((float) (-this.field8581) + var10) * (float) this.field8545.field593;
        }
        if ((this.field8545.field657 <= var13 / var9) || (var12 / var9 <= this.field8545.field694)) {
            return;
        }
        class444.field6310 = var4.field6861 * var5.field6850 + var4.field6868 * var5.field6871 + var4.field6860 * var5.field6846 + var4.field6871;
        class350.field4885 = var4.field6861 * var5.field6853 + var4.field6868 * var5.field6868 + var4.field6860 * var5.field6849;
        float var14 = (float) this.field8538 * class350.field4885 + class444.field6310;
        float var15 = (float) this.field8576 * class350.field4885 + class444.field6310;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = ((float) this.field8581 + var14) * (float) this.field8545.field616;
            var17 = (var15 - (float) this.field8581) * (float) this.field8545.field616;
        } else {
            var16 = ((float) this.field8581 + var15) * (float) this.field8545.field616;
            var17 = (var14 - (float) this.field8581) * (float) this.field8545.field616;
        }
        if ((var17 / var9 >= this.field8545.field652) || (this.field8545.field658 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field8568 != null) {
            class365.field5229 = var4.field6883 * var5.field6883 + var4.field6855 * var5.field6880 + var4.field6853 * var5.field6861;
            class692.field9362 = var4.field6883 * var5.field6855 + var4.field6855 * var5.field6869 + var4.field6853 * var5.field6860;
            class464.field6514 = var4.field6880 * var5.field6883 + var4.field6869 * var5.field6880 + var4.field6849 * var5.field6861;
            class451.field6371 = var4.field6861 * var5.field6855 + var4.field6868 * var5.field6860 + var4.field6860 * var5.field6869;
            class534.field7351 = var4.field6880 * var5.field6855 + var4.field6869 * var5.field6869 + var4.field6849 * var5.field6860;
            class653.field8959 = var4.field6861 * var5.field6883 + var4.field6868 * var5.field6861 + var4.field6860 * var5.field6880;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8487 + this.field8533 >> 1;
            int var21 = this.field8564 + this.field8593 >> 1;
            int var22 = (int) ((float) var21 * class464.field6514 + (float) this.field8538 * class698.field9439 + (float) var20 * class534.field7351 + class387.field5624);
            int var23 = (int) ((float) var21 * class653.field8959 + (float) this.field8538 * class350.field4885 + (float) var20 * class451.field6371 + class444.field6310);
            int var24 = (int) ((float) var21 * class365.field5229 + (float) this.field8538 * class722.field9804 + (float) var20 * class692.field9362 + class647.field8899);
            if (var24 >= this.field8545.field648) {
                arg1.field4383 = this.field8545.field593 * var22 / var24 + this.field8545.field675;
                arg1.field4380 = this.field8545.field616 * var23 / var24 + this.field8545.field632;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class464.field6514 + (float) this.field8576 * class698.field9439 + (float) var20 * class534.field7351 + class387.field5624);
            int var26 = (int) ((float) var21 * class653.field8959 + (float) this.field8576 * class350.field4885 + (float) var20 * class451.field6371 + class444.field6310);
            int var27 = (int) ((float) var21 * class365.field5229 + (float) this.field8576 * class722.field9804 + (float) var20 * class692.field9362 + class647.field8899);
            if (var27 >= this.field8545.field648) {
                arg1.field4384 = this.field8545.field593 * var25 / var27 + this.field8545.field675;
                arg1.field4382 = this.field8545.field616 * var26 / var27 + this.field8545.field632;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field8545.field648 > var24 && var27 < this.field8545.field648) {
                    var19 = false;
                } else if (this.field8545.field648 > var24) {
                    int var28 = (var27 - this.field8545.field648 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field4383 = this.field8545.field675 + (this.field8545.field593 * var29 / this.field8545.field648);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field4380 = this.field8545.field616 * var30 / this.field8545.field648 + this.field8545.field632;
                } else if (this.field8545.field648 > var27) {
                    int var31 = (var24 - this.field8545.field648 << 16) / (var24 - var27);
                    int var32 = var22 + ((var22 - var25) * var31 >> 16);
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field4383 = this.field8545.field593 * var32 / this.field8545.field648 + this.field8545.field675;
                    arg1.field4380 = this.field8545.field616 * var33 / this.field8545.field648 + this.field8545.field632;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field4381 = (var22 + this.field8581) * this.field8545.field593 / var24 + this.field8545.field675 - arg1.field4383;
                } else {
                    arg1.field4381 = this.field8545.field675 + ((this.field8581 + var25) * this.field8545.field593 / var27) - arg1.field4384;
                }
                arg1.field4379 = true;
            }
        }
        this.field8545.method293((byte) -62);
        this.field8545.method230(false, var5);
        this.method3548((byte) 127);
        this.field8545.method182(true);
        this.method3553(true);
    }

    @OriginalMember(owner = "client!paa", name = "WA", descriptor = "()I")
    public final int method518() {
        field8492++;
        return this.field8491;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(BI)V")
    public static final void method3560(byte arg0, int arg1) {
        class606.field8321 = -1;
        class638.field8761 = -1;
        if (arg0 != -59) {
            field8531 = 77;
        }
        field8524++;
        class33.field850 = arg1;
        class7.method27(false);
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(BI)V")
    public static final void method3561(byte arg0, int arg1) {
        field8512++;
        class7 var2 = (class7) class581.field7954.method1465((long) arg1, -6008);
        int var3 = -8 % ((arg0 + 49) / 44);
        if (var2 != null) {
            var2.field47.method1902(1);
            class181.method1329(var2.field55, (byte) -114, var2.field52);
            var2.method2314((byte) 52);
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(B)V")
    private final void method3562(byte arg0) {
        field8478++;
        if (!this.field8502) {
            return;
        }
        this.field8502 = false;
        if (this.field8587 == null && this.field8488 == null && this.field8568 == null) {
            if (this.field8490 != null && !class716.method3987((byte) 123, this.field8595, this.field8503)) {
                if (this.field8552 != null && this.field8552.field9994 == null) {
                    this.field8502 = true;
                } else {
                    if (!this.field8474) {
                        this.method3563((byte) -123);
                    }
                    this.field8490 = null;
                }
            }
            if (this.field8540 != null && !class704.method3925(this.field8503, this.field8595, 458752)) {
                if (this.field8552 != null && this.field8552.field9994 == null) {
                    this.field8502 = true;
                } else {
                    if (!this.field8474) {
                        this.method3563((byte) -123);
                    }
                    this.field8540 = null;
                }
            }
            if (this.field8591 != null && !class337.method2132(-3157, this.field8595, this.field8503)) {
                if (this.field8552 != null && this.field8552.field9994 == null) {
                    this.field8502 = true;
                } else {
                    if (!this.field8474) {
                        this.method3563((byte) -123);
                    }
                    this.field8591 = null;
                }
            }
        }
        if (this.field8596 != null && this.field8490 == null && this.field8540 == null && this.field8591 == null) {
            this.field8596 = null;
            this.field8475 = null;
        }
        if (this.field8541 != null && !class232.method1624(this.field8595, -385, this.field8503)) {
            if (this.field8510 == null) {
                if (this.field8557 != null && this.field8557.field9994 == null) {
                    this.field8502 = true;
                } else {
                    this.field8541 = null;
                    this.field8511 = this.field8530 = this.field8523 = null;
                }
            } else if (this.field8510.field9994 == null) {
                this.field8502 = true;
            } else {
                this.field8541 = null;
                this.field8511 = this.field8530 = this.field8523 = null;
            }
        }
        if (this.field8527 != null && !class613.method3476(-116, this.field8595, this.field8503)) {
            if (this.field8557 != null && this.field8557.field9994 == null) {
                this.field8502 = true;
            } else {
                this.field8527 = null;
            }
        }
        if (this.field8489 != null && !class555.method3196(this.field8503, this.field8595, 74)) {
            if (this.field8557 != null && this.field8557.field9994 == null) {
                this.field8502 = true;
            } else {
                this.field8489 = null;
            }
        }
        if (this.field8499 != null && !class266.method1766(this.field8595, this.field8503, (byte) -127)) {
            if (this.field8567 != null && this.field8567.field9994 == null) {
                this.field8502 = true;
            } else {
                this.field8499 = this.field8518 = null;
            }
        }
        int var2 = -117 / ((69 - arg0) / 41);
        if (this.field8548 != null && !class98.method917(this.field8503, false, this.field8595)) {
            if (this.field8557 != null && this.field8557.field9994 == null) {
                this.field8502 = true;
            } else {
                this.field8548 = null;
            }
        }
        if (this.field8539 != null && !class239.method1665(this.field8595, this.field8503, 393216)) {
            if ((this.field8522 == null || this.field8522.field1 != null) && (this.field8557 == null || this.field8557.field9994 != null)) {
                this.field8539 = this.field8526 = this.field8513 = null;
            } else {
                this.field8502 = true;
            }
        }
        if (this.field8500 != null && !class246.method1693(this.field8595, 256, this.field8503)) {
            this.field8520 = null;
            this.field8500 = null;
        }
        if (this.field8486 != null && !class482.method2829(this.field8503, (byte) 124, this.field8595)) {
            this.field8486 = null;
            this.field8555 = null;
        }
        if (this.field8574 != null && !class732.method4045(false, this.field8595, this.field8503)) {
            this.field8574 = null;
        }
        if (this.field8573 != null && (this.field8595 & 0x800) == 0 && (this.field8595 & 0x40000) == 0) {
            this.field8573 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "()V")
    public final void method501() {
        field8553++;
    }

    @OriginalMember(owner = "client!paa", name = "ia", descriptor = "(SS)V")
    public final void method517(short arg0, short arg1) {
        field8550++;
        for (int var3 = 0; var3 < this.field8579; var3++) {
            if (this.field8527[var3] == arg0) {
                this.field8527[var3] = arg1;
            }
        }
        if (this.field8568 != null) {
            for (int var4 = 0; var4 < this.field8483; var4++) {
                class712 var5 = this.field8568[var4];
                class606 var6 = this.field8543[var4];
                var6.field8320 = class456.field6424[this.field8527[var5.field9643] & 0xFFFF] & 0xFFFFFF | var6.field8320 & 0xFF000000;
            }
        }
        if (this.field8557 != null) {
            this.field8557.field9994 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "()[Lnn;")
    public final class417[] method494() {
        field8572++;
        return this.field8587;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "()[Leca;")
    public final class755[] method525() {
        field8516++;
        return this.field8488;
    }

    @OriginalMember(owner = "client!paa", name = "V", descriptor = "()I")
    public final int method509() {
        field8554++;
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        return this.field8487;
    }

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "()Z")
    public final boolean method522() {
        field8571++;
        return this.field8585;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lbca;)V")
    public final void method523(class661 arg0) {
        field8495++;
        class495 var2 = (class495) arg0;
        if (this.field8587 != null) {
            for (int var3 = 0; var3 < this.field8587.length; var3++) {
                class417 var4 = this.field8587[var3];
                class417 var5 = var4;
                if (var4.field6045 != null) {
                    var5 = var4.field6045;
                }
                var5.field6039 = (int) ((float) this.field8591[var4.field6038] * var2.field6880 + (float) this.field8540[var4.field6038] * var2.field6849 + (float) this.field8490[var4.field6038] * var2.field6869 + var2.field6846);
                var5.field6048 = (int) ((float) this.field8591[var4.field6038] * var2.field6861 + (float) this.field8540[var4.field6038] * var2.field6868 + (float) this.field8490[var4.field6038] * var2.field6860 + var2.field6871);
                var5.field6046 = (int) ((float) this.field8591[var4.field6038] * var2.field6883 + (float) this.field8540[var4.field6038] * var2.field6853 + (float) this.field8490[var4.field6038] * var2.field6855 + var2.field6850);
                var5.field6040 = (int) ((float) this.field8591[var4.field6034] * var2.field6880 + (float) this.field8540[var4.field6034] * var2.field6849 + (float) this.field8490[var4.field6034] * var2.field6869 + var2.field6846);
                var5.field6047 = (int) ((float) this.field8591[var4.field6034] * var2.field6861 + (float) this.field8540[var4.field6034] * var2.field6868 + (float) this.field8490[var4.field6034] * var2.field6860 + var2.field6871);
                var5.field6037 = (int) ((float) this.field8591[var4.field6034] * var2.field6883 + (float) this.field8540[var4.field6034] * var2.field6853 + (float) this.field8490[var4.field6034] * var2.field6855 + var2.field6850);
                var5.field6033 = (int) ((float) this.field8591[var4.field6049] * var2.field6880 + (float) this.field8540[var4.field6049] * var2.field6849 + (float) this.field8490[var4.field6049] * var2.field6869 + var2.field6846);
                var5.field6031 = (int) ((float) this.field8591[var4.field6049] * var2.field6861 + (float) this.field8540[var4.field6049] * var2.field6868 + (float) this.field8490[var4.field6049] * var2.field6860 + var2.field6871);
                var5.field6041 = (int) ((float) this.field8591[var4.field6049] * var2.field6883 + (float) this.field8540[var4.field6049] * var2.field6853 + (float) this.field8490[var4.field6049] * var2.field6855 + var2.field6850);
            }
        }
        if (this.field8488 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field8488.length; var6++) {
            class755 var7 = this.field8488[var6];
            class755 var8 = var7;
            if (var7.field10545 != null) {
                var8 = var7.field10545;
            }
            if (var7.field10549 == null) {
                var7.field10549 = var2.method763();
            } else {
                var7.field10549.method778(var2);
            }
            var8.field10535 = (int) ((float) this.field8591[var7.field10541] * var2.field6880 + (float) this.field8540[var7.field10541] * var2.field6849 + (float) this.field8490[var7.field10541] * var2.field6869 + var2.field6846);
            var8.field10536 = (int) ((float) this.field8591[var7.field10541] * var2.field6861 + (float) this.field8540[var7.field10541] * var2.field6868 + (float) this.field8490[var7.field10541] * var2.field6860 + var2.field6871);
            var8.field10537 = (int) ((float) this.field8591[var7.field10541] * var2.field6883 + (float) this.field8540[var7.field10541] * var2.field6853 + (float) this.field8490[var7.field10541] * var2.field6855 + var2.field6850);
        }
    }

    @OriginalMember(owner = "client!paa", name = "ma", descriptor = "()I")
    public final int method513() {
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        field8493++;
        return this.field8506;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method511(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8561++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            class226.field3240 = 0;
            int var12 = 0;
            class95.field1661 = 0;
            class415.field6007 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field8486.length) {
                    int[] var15 = this.field8486[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class415.field6007 += this.field8490[var17];
                        class95.field1661 += this.field8540[var17];
                        var12++;
                        class226.field3240 += this.field8591[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class95.field1661 = var10;
                class226.field3240 = var9;
                class415.field6007 = var11;
            } else {
                class95.field1661 = class95.field1661 / var12 + var10;
                class415.field6007 = class415.field6007 / var12 + var11;
                class226.field3240 = class226.field3240 / var12 + var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field8486.length) {
                    int[] var23 = this.field8486[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8490[var25] += var18;
                        this.field8540[var25] += var19;
                        this.field8591[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field8486.length > var45) {
                    int[] var46 = this.field8486[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8490[var59] -= class415.field6007;
                            this.field8540[var59] -= class95.field1661;
                            this.field8591[var59] -= class226.field3240;
                            if (arg4 != 0) {
                                int var60 = class255.field3698[arg4];
                                int var61 = class255.field3695[arg4];
                                int var62 = this.field8540[var59] * var60 + this.field8490[var59] * var61 + 16383 >> 14;
                                this.field8540[var59] = this.field8540[var59] * var61 + 16383 - (this.field8490[var59] * var60) >> 14;
                                this.field8490[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class255.field3698[arg2];
                                int var64 = class255.field3695[arg2];
                                int var65 = this.field8540[var59] * var64 + 16383 - (this.field8591[var59] * var63) >> 14;
                                this.field8591[var59] = this.field8540[var59] * var63 + this.field8591[var59] * var64 + 16383 >> 14;
                                this.field8540[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class255.field3698[arg3];
                                int var67 = class255.field3695[arg3];
                                int var68 = this.field8591[var59] * var66 + (this.field8490[var59] * var67) + 16383 >> 14;
                                this.field8591[var59] = this.field8591[var59] * var67 + 16383 - this.field8490[var59] * var66 >> 14;
                                this.field8490[var59] = var68;
                            }
                            this.field8490[var59] += class415.field6007;
                            this.field8540[var59] += class95.field1661;
                            this.field8591[var59] += class226.field3240;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8490[var48] -= class415.field6007;
                            this.field8540[var48] -= class95.field1661;
                            this.field8591[var48] -= class226.field3240;
                            if (arg2 != 0) {
                                int var49 = class255.field3698[arg2];
                                int var50 = class255.field3695[arg2];
                                int var51 = this.field8540[var48] * var50 + 16383 - (this.field8591[var48] * var49) >> 14;
                                this.field8591[var48] = this.field8540[var48] * var49 + (this.field8591[var48] * var50) + 16383 >> 14;
                                this.field8540[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class255.field3698[arg4];
                                int var53 = class255.field3695[arg4];
                                int var54 = this.field8540[var48] * var52 + this.field8490[var48] * var53 + 16383 >> 14;
                                this.field8540[var48] = this.field8540[var48] * var53 + 16383 - (this.field8490[var48] * var52) >> 14;
                                this.field8490[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class255.field3698[arg3];
                                int var56 = class255.field3695[arg3];
                                int var57 = this.field8591[var48] * var55 - (-(this.field8490[var48] * var56) - 16383) >> 14;
                                this.field8591[var48] = this.field8591[var48] * var56 + (16383 - (this.field8490[var48] * var55)) >> 14;
                                this.field8490[var48] = var57;
                            }
                            this.field8490[var48] += class415.field6007;
                            this.field8540[var48] += class95.field1661;
                            this.field8591[var48] += class226.field3240;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field8486.length) {
                        int[] var29 = this.field8486[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field8475[var31];
                            int var33 = this.field8475[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8596[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class255.field3698[arg4];
                                    int var37 = class255.field3695[arg4];
                                    int var38 = this.field8530[var35] * var36 + this.field8511[var35] * var37 + 16383 >> 14;
                                    this.field8530[var35] = (short) (this.field8530[var35] * var37 + 16383 - (this.field8511[var35] * var36) >> 14);
                                    this.field8511[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class255.field3698[arg2];
                                    int var40 = class255.field3695[arg2];
                                    int var41 = this.field8530[var35] * var40 - (this.field8523[var35] * var39 - 16383) >> 14;
                                    this.field8523[var35] = (short) (this.field8530[var35] * var39 + this.field8523[var35] * var40 + 16383 >> 14);
                                    this.field8530[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class255.field3698[arg3];
                                    int var43 = class255.field3695[arg3];
                                    int var44 = this.field8511[var35] * var43 + this.field8523[var35] * var42 + 16383 >> 14;
                                    this.field8523[var35] = (short) (this.field8523[var35] * var43 + 16383 - (this.field8511[var35] * var42) >> 14);
                                    this.field8511[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field8510 == null && this.field8557 != null) {
                    this.field8557.field9994 = null;
                }
                if (this.field8510 != null) {
                    this.field8510.field9994 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field8486.length > var70) {
                    int[] var71 = this.field8486[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8490[var73] -= class415.field6007;
                        this.field8540[var73] -= class95.field1661;
                        this.field8591[var73] -= class226.field3240;
                        this.field8490[var73] = this.field8490[var73] * arg2 >> 7;
                        this.field8540[var73] = this.field8540[var73] * arg3 >> 7;
                        this.field8591[var73] = this.field8591[var73] * arg4 >> 7;
                        this.field8490[var73] += class415.field6007;
                        this.field8540[var73] += class95.field1661;
                        this.field8591[var73] += class226.field3240;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8500 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field8500.length > var78) {
                        int[] var79 = this.field8500[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field8489[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field8489[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field8557 != null) {
                            this.field8557.field9994 = null;
                        }
                    }
                }
                if (this.field8568 != null) {
                    for (int var75 = 0; var75 < this.field8483; var75++) {
                        class712 var76 = this.field8568[var75];
                        class606 var77 = this.field8543[var75];
                        var77.field8320 = 255 - (this.field8489[var76.field9643] & 0xFF) << 24 | var77.field8320 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8500 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field8500.length) {
                        int[] var88 = this.field8500[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field8527[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFC8A) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field8527[var90] = (short) class418.method2577(class418.method2577(var94 << 7, var95 << 10), var97);
                        }
                        if (var88.length > 0 && this.field8557 != null) {
                            this.field8557.field9994 = null;
                        }
                    }
                }
                if (this.field8568 != null) {
                    for (int var84 = 0; var84 < this.field8483; var84++) {
                        class712 var85 = this.field8568[var84];
                        class606 var86 = this.field8543[var84];
                        var86.field8320 = class456.field6424[this.field8527[var85.field9643] & 0xFFFF] & 0xFFFFFF | var86.field8320 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8574 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field8574.length > var99) {
                        int[] var100 = this.field8574[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class606 var102 = this.field8543[var100[var101]];
                            var102.field8316 += arg2;
                            var102.field8309 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8574 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field8574.length) {
                        int[] var105 = this.field8574[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class606 var107 = this.field8543[var105[var106]];
                            var107.field8318 = var107.field8318 * arg2 >> 7;
                            var107.field8319 = var107.field8319 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8574 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field8574.length) {
                    int[] var110 = this.field8574[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class606 var112 = this.field8543[var110[var111]];
                        var112.field8315 = var112.field8315 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "HA", descriptor = "()I")
    public final int method506() {
        field8521++;
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        return this.field8564;
    }

    @OriginalMember(owner = "client!paa", name = "ua", descriptor = "()I")
    public final int method527() {
        field8563++;
        return this.field8595;
    }

    @OriginalMember(owner = "client!paa", name = "P", descriptor = "(IIII)V")
    public final void method496(int arg0, int arg1, int arg2, int arg3) {
        field8514++;
        if (arg0 == 0) {
            class415.field6007 = 0;
            class226.field3240 = 0;
            class95.field1661 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field8504; var6++) {
                class415.field6007 += this.field8490[var6];
                class95.field1661 += this.field8540[var6];
                var5++;
                class226.field3240 += this.field8591[var6];
            }
            if (var5 <= 0) {
                class95.field1661 = arg2;
                class226.field3240 = arg3;
                class415.field6007 = arg1;
            } else {
                class95.field1661 = class95.field1661 / var5 + arg2;
                class415.field6007 = class415.field6007 / var5 + arg1;
                class226.field3240 = class226.field3240 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8504; var7++) {
                this.field8490[var7] += arg1;
                this.field8540[var7] += arg2;
                this.field8591[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8504; var8++) {
                this.field8490[var8] -= class415.field6007;
                this.field8540[var8] -= class95.field1661;
                this.field8591[var8] -= class226.field3240;
                if (arg3 != 0) {
                    int var9 = class255.field3698[arg3];
                    int var10 = class255.field3695[arg3];
                    int var11 = this.field8540[var8] * var9 + this.field8490[var8] * var10 + 16383 >> 14;
                    this.field8540[var8] = this.field8540[var8] * var10 + 16383 - (this.field8490[var8] * var9) >> 14;
                    this.field8490[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class255.field3698[arg1];
                    int var13 = class255.field3695[arg1];
                    int var14 = this.field8540[var8] * var13 + 16383 - (this.field8591[var8] * var12) >> 14;
                    this.field8591[var8] = this.field8540[var8] * var12 - (-(this.field8591[var8] * var13) - 16383) >> 14;
                    this.field8540[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class255.field3698[arg2];
                    int var16 = class255.field3695[arg2];
                    int var17 = this.field8591[var8] * var15 + (this.field8490[var8] * var16) + 16383 >> 14;
                    this.field8591[var8] = this.field8591[var8] * var16 + 16383 - (this.field8490[var8] * var15) >> 14;
                    this.field8490[var8] = var17;
                }
                this.field8490[var8] += class415.field6007;
                this.field8540[var8] += class95.field1661;
                this.field8591[var8] += class226.field3240;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8504; var18++) {
                this.field8490[var18] -= class415.field6007;
                this.field8540[var18] -= class95.field1661;
                this.field8591[var18] -= class226.field3240;
                this.field8490[var18] = this.field8490[var18] * arg1 / 128;
                this.field8540[var18] = this.field8540[var18] * arg2 / 128;
                this.field8591[var18] = this.field8591[var18] * arg3 / 128;
                this.field8490[var18] += class415.field6007;
                this.field8540[var18] += class95.field1661;
                this.field8591[var18] += class226.field3240;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8579; var19++) {
                int var23 = (this.field8489[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8489[var19] = (byte) var23;
            }
            if (this.field8557 != null) {
                this.field8557.field9994 = null;
            }
            if (this.field8568 != null) {
                for (int var20 = 0; var20 < this.field8483; var20++) {
                    class712 var21 = this.field8568[var20];
                    class606 var22 = this.field8543[var20];
                    var22.field8320 = var22.field8320 & 0xFFFFFF | 255 - (this.field8489[var21.field9643] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8579; var24++) {
                int var28 = this.field8527[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3BA) >> 7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var32;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field8527[var24] = (short) class418.method2577(var34, class418.method2577(var33 << 7, var31 << 10));
            }
            if (this.field8557 != null) {
                this.field8557.field9994 = null;
            }
            if (this.field8568 != null) {
                for (int var25 = 0; var25 < this.field8483; var25++) {
                    class712 var26 = this.field8568[var25];
                    class606 var27 = this.field8543[var25];
                    var27.field8320 = class456.field6424[this.field8527[var26.field9643] & 0xFFFF] & 0xFFFFFF | var27.field8320 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8483; var35++) {
                class606 var36 = this.field8543[var35];
                var36.field8309 += arg2;
                var36.field8316 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8483; var37++) {
                class606 var38 = this.field8543[var37];
                var38.field8318 = var38.field8318 * arg1 >> 7;
                var38.field8319 = var38.field8319 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8483; var39++) {
                class606 var40 = this.field8543[var39];
                var40.field8315 = var40.field8315 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "(I)V")
    public final void method484(int arg0) {
        this.field8595 = arg0;
        field8544++;
        if (this.field8519 != null && (this.field8595 & 0x10000) == 0) {
            this.field8523 = this.field8519.field3762;
            this.field8541 = this.field8519.field3757;
            this.field8511 = this.field8519.field3763;
            this.field8530 = this.field8519.field3760;
            this.field8519 = null;
        }
        this.field8502 = true;
        this.method3562((byte) -62);
    }

    @OriginalMember(owner = "client!paa", name = "C", descriptor = "(I)V")
    public final void method481(int arg0) {
        field8549++;
        this.field8491 = (short) arg0;
        if (this.field8557 != null) {
            this.field8557.field9994 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "()V")
    public final void method498() {
        field8482++;
        for (int var1 = 0; var1 < this.field8504; var1++) {
            this.field8591[var1] = -this.field8591[var1];
        }
        for (int var2 = 0; var2 < this.field8476; var2++) {
            this.field8523[var2] = (short) (-this.field8523[var2]);
        }
        for (int var3 = 0; var3 < this.field8579; var3++) {
            short var4 = this.field8539[var3];
            this.field8539[var3] = this.field8513[var3];
            this.field8513[var3] = var4;
        }
        if (this.field8510 == null && this.field8557 != null) {
            this.field8557.field9994 = null;
        }
        if (this.field8510 != null) {
            this.field8510.field9994 = null;
        }
        this.field8474 = false;
        if (this.field8522 != null) {
            this.field8522.field1 = null;
        }
        if (this.field8552 != null) {
            this.field8552.field9994 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lbca;IZ)V")
    public final void method519(class661 arg0, int arg1, boolean arg2) {
        field8497++;
        if (this.field8555 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field8504; var5++) {
            if ((arg1 & this.field8555[var5]) != 0) {
                if (arg2) {
                    arg0.method750(this.field8490[var5], this.field8540[var5], this.field8591[var5], var4);
                } else {
                    arg0.method770(this.field8490[var5], this.field8540[var5], this.field8591[var5], var4);
                }
                this.field8490[var5] = var4[0];
                this.field8540[var5] = var4[1];
                this.field8591[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method533(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8551++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            int var13 = 0;
            class415.field6007 = 0;
            class95.field1661 = 0;
            class226.field3240 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field8486.length) {
                    int[] var16 = this.field8486[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8555 == null || (arg6 & this.field8555[var18]) != 0) {
                            class415.field6007 += this.field8490[var18];
                            class95.field1661 += this.field8540[var18];
                            var13++;
                            class226.field3240 += this.field8591[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class415.field6007 = var12;
                class226.field3240 = var11;
                class95.field1661 = var10;
            } else {
                class415.field6007 = class415.field6007 / var13 + var12;
                class95.field1661 = class95.field1661 / var13 + var10;
                class226.field3240 = class226.field3240 / var13 + var11;
                class421.field6078 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + (arg7[5] * arg4) + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field8486.length) {
                    int[] var27 = this.field8486[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8555 == null || (this.field8555[var29] & arg6) != 0) {
                            this.field8490[var29] += var22;
                            this.field8540[var29] += var24;
                            this.field8591[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field8486.length) {
                        int[] var50 = this.field8486[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field8555 == null || (arg6 & this.field8555[var52]) != 0) {
                                this.field8490[var52] -= class415.field6007;
                                this.field8540[var52] -= class95.field1661;
                                this.field8591[var52] -= class226.field3240;
                                if (arg4 != 0) {
                                    int var53 = class255.field3698[arg4];
                                    int var54 = class255.field3695[arg4];
                                    int var55 = this.field8540[var52] * var53 - (-(this.field8490[var52] * var54) - 16383) >> 14;
                                    this.field8540[var52] = this.field8540[var52] * var54 + 16383 - (this.field8490[var52] * var53) >> 14;
                                    this.field8490[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class255.field3698[arg2];
                                    int var57 = class255.field3695[arg2];
                                    int var58 = this.field8540[var52] * var57 + 16383 - (this.field8591[var52] * var56) >> 14;
                                    this.field8591[var52] = this.field8591[var52] * var57 + this.field8540[var52] * var56 + 16383 >> 14;
                                    this.field8540[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class255.field3698[arg3];
                                    int var60 = class255.field3695[arg3];
                                    int var61 = this.field8591[var52] * var59 + (this.field8490[var52] * var60 + 16383) >> 14;
                                    this.field8591[var52] = this.field8591[var52] * var60 + 16383 - (this.field8490[var52] * var59) >> 14;
                                    this.field8490[var52] = var61;
                                }
                                this.field8490[var52] += class415.field6007;
                                this.field8540[var52] += class95.field1661;
                                this.field8591[var52] += class226.field3240;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field8486.length > var32) {
                            int[] var33 = this.field8486[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field8555 == null || (this.field8555[var35] & arg6) != 0) {
                                    int var36 = this.field8475[var35];
                                    int var37 = this.field8475[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field8596[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class255.field3698[arg4];
                                            int var41 = class255.field3695[arg4];
                                            int var42 = this.field8530[var39] * var40 + this.field8511[var39] * var41 + 16383 >> 14;
                                            this.field8530[var39] = (short) (this.field8530[var39] * var41 + 16383 - (this.field8511[var39] * var40) >> 14);
                                            this.field8511[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class255.field3698[arg2];
                                            int var44 = class255.field3695[arg2];
                                            int var45 = this.field8530[var39] * var44 + 16383 - (this.field8523[var39] * var43) >> 14;
                                            this.field8523[var39] = (short) (this.field8530[var39] * var43 + this.field8523[var39] * var44 + 16383 >> 14);
                                            this.field8530[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class255.field3698[arg3];
                                            int var47 = class255.field3695[arg3];
                                            int var48 = this.field8523[var39] * var46 + this.field8511[var39] * var47 + 16383 >> 14;
                                            this.field8523[var39] = (short) (this.field8523[var39] * var47 + 16383 - (this.field8511[var39] * var46) >> 14);
                                            this.field8511[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field8510 == null && this.field8557 != null) {
                        this.field8557.field9994 = null;
                    }
                    if (this.field8510 != null) {
                        this.field8510.field9994 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class421.field6078) {
                    int var68 = arg7[0] * class415.field6007 + (arg7[3] * class95.field1661) + (arg7[6] * class226.field3240) + 8192 >> 14;
                    int var69 = arg7[1] * class415.field6007 + (arg7[4] * class95.field1661) - (-(arg7[7] * class226.field3240) - 8192) >> 14;
                    int var70 = var65 + var68;
                    int var71 = var66 + var69;
                    int var72 = arg7[5] * class95.field1661 + arg7[8] * class226.field3240 + arg7[2] * class415.field6007 + 8192 >> 14;
                    int var73 = var67 + var72;
                    class415.field6007 = var70;
                    class95.field1661 = var71;
                    class226.field3240 = var73;
                    class421.field6078 = false;
                }
                int[] var74 = new int[9];
                int var75 = class255.field3695[arg2];
                int var76 = class255.field3698[arg2];
                int var77 = class255.field3695[arg3];
                int var78 = class255.field3698[arg3];
                int var79 = class255.field3695[arg4];
                int var80 = class255.field3698[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[1] = -var77 * var80 + (var78 * var81) + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[5] = -var76;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[7] = var78 * var80 + var77 * var81 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                int var83 = var74[1] * -class95.field1661 + var74[0] * -class415.field6007 - (-(var74[2] * -class226.field3240) + -8192) >> 14;
                int var84 = var74[3] * -class415.field6007 + var74[4] * -class95.field1661 + (var74[5] * -class226.field3240) + 8192 >> 14;
                int var85 = var74[8] * -class226.field3240 + (var74[6] * -class415.field6007 + (var74[7] * -class95.field1661)) + 8192 >> 14;
                int var86 = var83 + class415.field6007;
                int var87 = var84 + class95.field1661;
                int var88 = class226.field3240 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[2] * var67 + var74[0] * var65 + var74[1] * var66 + 8192 >> 14;
                int var92 = var74[5] * var67 + var74[4] * var66 + var74[3] * var65 + 8192 >> 14;
                int var93 = var74[6] * var65 + var74[8] * var67 + var74[7] * var66 + 8192 >> 14;
                int var94 = var87 + var92;
                int var95 = var86 + var91;
                int var96 = var88 + var93;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[1] * var94 + arg7[0] * var95 + 8192 >> 14;
                int var100 = arg7[3] * var95 + (arg7[4] * var94) + (arg7[5] * var96) + 8192 >> 14;
                int var101 = var63 + var100;
                int var102 = arg7[8] * var96 + arg7[7] * var94 + arg7[6] * var95 + 8192 >> 14;
                int var103 = var62 + var99;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field8486.length) {
                        int[] var107 = this.field8486[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field8555 == null || (this.field8555[var109] & arg6) != 0) {
                                int var110 = this.field8591[var109] * var97[2] + this.field8540[var109] * var97[1] + this.field8490[var109] * var97[0] + 8192 >> 14;
                                int var111 = this.field8591[var109] * var97[5] + this.field8540[var109] * var97[4] + this.field8490[var109] * var97[3] + 8192 >> 14;
                                int var112 = var103 + var110;
                                int var113 = var101 + var111;
                                int var114 = this.field8591[var109] * var97[8] + this.field8540[var109] * var97[7] + this.field8490[var109] * var97[6] + 8192 >> 14;
                                int var115 = var104 + var114;
                                this.field8490[var109] = var112;
                                this.field8540[var109] = var113;
                                this.field8591[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field8486.length > var173) {
                        int[] var174 = this.field8486[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field8555 == null || (arg6 & this.field8555[var176]) != 0) {
                                this.field8490[var176] -= class415.field6007;
                                this.field8540[var176] -= class95.field1661;
                                this.field8591[var176] -= class226.field3240;
                                this.field8490[var176] = this.field8490[var176] * arg2 >> 7;
                                this.field8540[var176] = this.field8540[var176] * arg3 >> 7;
                                this.field8591[var176] = this.field8591[var176] * arg4 >> 7;
                                this.field8490[var176] += class415.field6007;
                                this.field8540[var176] += class95.field1661;
                                this.field8591[var176] += class226.field3240;
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
                if (class421.field6078) {
                    int var128 = arg7[0] * class415.field6007 + (arg7[3] * class95.field1661) + (arg7[6] * class226.field3240) + 8192 >> 14;
                    int var129 = arg7[7] * class226.field3240 + arg7[4] * class95.field1661 + arg7[1] * class415.field6007 + 8192 >> 14;
                    int var130 = var126 + var129;
                    int var131 = arg7[8] * class226.field3240 + arg7[5] * class95.field1661 + arg7[2] * class415.field6007 + 8192 >> 14;
                    int var132 = var125 + var128;
                    class95.field1661 = var130;
                    int var133 = var127 + var131;
                    class415.field6007 = var132;
                    class421.field6078 = false;
                    class226.field3240 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class415.field6007 * var134 + 8192 >> 14;
                int var138 = -class95.field1661 * var135 + 8192 >> 14;
                int var139 = -class226.field3240 * var136 + 8192 >> 14;
                int var140 = class415.field6007 + var137;
                int var141 = var138 + class95.field1661;
                int var142 = class226.field3240 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var141 + var145;
                int var147 = var127 * var136 + 8192 >> 14;
                int var148 = var140 + var144;
                int var149 = var142 + var147;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[1] * var146 + arg7[0] * var148 + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[3] * var148 + (arg7[4] * var146) + 8192 >> 14;
                int var154 = arg7[6] * var148 + (arg7[7] * var146 - (-(arg7[8] * var149) - 8192)) >> 14;
                int var155 = var122 + var152;
                int var156 = var123 + var153;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field8486.length) {
                        int[] var160 = this.field8486[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field8555 == null || (this.field8555[var162] & arg6) != 0) {
                                int var163 = this.field8591[var162] * var150[2] + this.field8490[var162] * var150[0] + this.field8540[var162] * var150[1] + 8192 >> 14;
                                int var164 = this.field8540[var162] * var150[4] + this.field8490[var162] * var150[3] - (-(this.field8591[var162] * var150[5]) - 8192) >> 14;
                                int var165 = var155 + var163;
                                int var166 = var156 + var164;
                                int var167 = this.field8540[var162] * var150[7] + this.field8490[var162] * var150[6] + (this.field8591[var162] * var150[8]) + 8192 >> 14;
                                this.field8490[var162] = var165;
                                int var168 = var157 + var167;
                                this.field8540[var162] = var166;
                                this.field8591[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8500 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field8500.length) {
                        int[] var182 = this.field8500[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field8520 == null || (this.field8520[var184] & arg6) != 0) {
                                int var185 = (this.field8489[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field8489[var184] = (byte) var185;
                                if (this.field8557 != null) {
                                    this.field8557.field9994 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8568 != null) {
                    for (int var178 = 0; var178 < this.field8483; var178++) {
                        class712 var179 = this.field8568[var178];
                        class606 var180 = this.field8543[var178];
                        var180.field8320 = 255 - (this.field8489[var179.field9643] & 0xFF) << 24 | var180.field8320 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8500 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field8500.length > var190) {
                        int[] var191 = this.field8500[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field8520 == null || (this.field8520[var193] & arg6) != 0) {
                                int var194 = this.field8527[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFC7E) >> 10;
                                int var196 = (var194 & 0x3ED) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = arg2 + var195 & 0x3F;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field8527[var193] = (short) class418.method2577(var200, class418.method2577(var199 << 10, var197 << 7));
                                if (this.field8557 != null) {
                                    this.field8557.field9994 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8568 != null) {
                    for (int var187 = 0; var187 < this.field8483; var187++) {
                        class712 var188 = this.field8568[var187];
                        class606 var189 = this.field8543[var187];
                        var189.field8320 = class456.field6424[this.field8527[var188.field9643] & 0xFFFF] & 0xFFFFFF | var189.field8320 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8574 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field8574.length) {
                        int[] var203 = this.field8574[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class606 var205 = this.field8543[var203[var204]];
                            var205.field8309 += arg3;
                            var205.field8316 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8574 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field8574.length) {
                        int[] var208 = this.field8574[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class606 var210 = this.field8543[var208[var209]];
                            var210.field8319 = var210.field8319 * arg3 >> 7;
                            var210.field8318 = var210.field8318 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8574 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field8574.length > var212) {
                    int[] var213 = this.field8574[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class606 var215 = this.field8543[var213[var214]];
                        var215.field8315 = var215.field8315 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(B)V")
    private final void method3563(byte arg0) {
        field8515++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field8504; var10++) {
            int var11 = this.field8490[var10];
            int var12 = this.field8540[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            int var13 = this.field8591[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field8538 = (short) var3;
        this.field8564 = (short) var4;
        if (arg0 != -123) {
            this.method500();
        }
        this.field8593 = (short) var7;
        this.field8487 = (short) var2;
        this.field8576 = (short) var6;
        this.field8533 = (short) var5;
        this.field8581 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field8506 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field8474 = true;
    }

    @OriginalMember(owner = "client!paa", name = "fa", descriptor = "()I")
    public final int method486() {
        field8582++;
        if (!this.field8474) {
            this.method3563((byte) -123);
        }
        return this.field8538;
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lqo;)V")
    public class624(class22 arg0) {
        this.field8545 = arg0;
        this.field8552 = new class744(null, 5126, 3, 0);
        this.field8567 = new class744(null, 5126, 2, 0);
        this.field8510 = new class744(null, 5126, 3, 0);
        this.field8557 = new class744(null, 5121, 4, 0);
        this.field8522 = new class1();
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lqo;Lbh;IIII)V")
    public class624(class22 arg0, class37 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8503 = arg5;
        this.field8595 = arg2;
        this.field8545 = arg0;
        if (class472.method2783(2, arg2, arg5)) {
            this.field8552 = new class744(null, 5126, 3, 0);
        }
        if (class586.method3349(arg5, (byte) 78, arg2)) {
            this.field8567 = new class744(null, 5126, 2, 0);
        }
        if (class301.method1959((byte) 69, arg5, arg2)) {
            this.field8510 = new class744(null, 5126, 3, 0);
        }
        if (class499.method2945(arg5, arg2, true)) {
            this.field8557 = new class744(null, 5121, 4, 0);
        }
        if (class444.method2668(arg2, arg5, -31)) {
            this.field8522 = new class1();
        }
        class152 var7 = arg0.field1170;
        this.field8475 = new int[arg1.field888 + 1];
        int[] var8 = new int[arg1.field884];
        for (int var9 = 0; var9 < arg1.field884; var9++) {
            if (arg1.field910 == null || arg1.field910[var9] != 2) {
                if (arg1.field889 != null && arg1.field889[var9] != -1) {
                    class739 var173 = var7.method1180(arg1.field889[var9] & 0xFFFF, -6662);
                    if (((this.field8503 & 0x40) == 0 || !var173.field9951) && var173.field9946) {
                        continue;
                    }
                }
                var8[this.field8579++] = var9;
                this.field8475[arg1.field930[var9]]++;
                this.field8475[arg1.field902[var9]]++;
                this.field8475[arg1.field922[var9]]++;
            }
        }
        this.field8484 = this.field8579;
        long[] var10 = new long[this.field8579];
        boolean var11 = (this.field8595 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field8579; var12++) {
            int var156 = var8[var12];
            class739 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field899 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field899.length; var163++) {
                    class259 var164 = arg1.field899[var163];
                    if (var164.field3719 == var156) {
                        class510 var165 = class192.method1376(104, var164.field3717);
                        if (var165.field7101) {
                            var162 = true;
                        }
                        if (var165.field7095 != -1) {
                            class739 var166 = var7.method1180(var165.field7095, -6662);
                            if (var166.field9942 == 2) {
                                this.field8542 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field8484--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field889 != null) {
                var167 = arg1.field889[var156];
                if (var167 != -1) {
                    var157 = var7.method1180(var167 & 0xFFFF, -6662);
                    if ((this.field8503 & 0x40) != 0 && var157.field9951) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        var161 = var157.field9944;
                        if (var157.field9940 != 0 || var157.field9953 != 0) {
                            this.field8585 = true;
                        }
                        var160 = var157.field9955;
                    }
                }
            }
            boolean var168 = arg1.field901 != null && arg1.field901[var156] != 0 || var157 != null && var157.field9942 != 0;
            if ((var11 || var168) && arg1.field906 != null) {
                var158 += arg1.field906[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + ((long) var172);
            this.field8585 |= var157 != null && (var157.field9940 != 0 || var157.field9953 != 0);
            this.field8542 |= var168;
        }
        class30.method410(var8, var10, 0);
        this.field8591 = arg1.field919;
        this.field8540 = arg1.field914;
        this.field8589 = arg1.field903;
        this.field8490 = arg1.field908;
        this.field8555 = arg1.field909;
        this.field8504 = arg1.field888;
        this.field8488 = arg1.field933;
        class436[] var13 = new class436[this.field8504];
        this.field8587 = arg1.field913;
        if (arg1.field899 != null) {
            this.field8483 = arg1.field899.length;
            this.field8543 = new class606[this.field8483];
            this.field8568 = new class712[this.field8483];
            for (int var14 = 0; var14 < this.field8483; var14++) {
                class259 var15 = arg1.field899[var14];
                class510 var16 = class192.method1376(104, var15.field3717);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8579; var18++) {
                    if (var8[var18] == var15.field3719) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class456.field6424[arg1.field929[var15.field3719] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field901 == null ? 0 : arg1.field901[var15.field3719]) << 24;
                this.field8568[var14] = new class712(var17, arg1.field930[var15.field3719], arg1.field902[var15.field3719], arg1.field922[var15.field3719], var16.field7096, var16.field7100, var16.field7095, var16.field7103, var16.field7104, var16.field7101, var16.field7092, var15.field3722);
                this.field8543[var14] = new class606(var20);
            }
        }
        int var21 = this.field8579 * 3;
        this.field8596 = new short[var21];
        class429.field6147 = new long[var21];
        this.field8548 = new short[this.field8579];
        this.field8518 = new float[var21];
        this.field8511 = new short[var21];
        this.field8523 = new short[var21];
        this.field8541 = new byte[var21];
        this.field8530 = new short[var21];
        if (arg1.field923 != null) {
            this.field8520 = new short[this.field8579];
        }
        this.field8491 = (short) arg3;
        this.field8527 = new short[this.field8579];
        this.field8526 = new short[this.field8579];
        this.field8539 = new short[this.field8579];
        this.field8592 = (short) arg4;
        this.field8489 = new byte[this.field8579];
        this.field8499 = new float[var21];
        this.field8513 = new short[this.field8579];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field888; var23++) {
            int var155 = this.field8475[var23];
            this.field8475[var23] = var22;
            var13[var23] = new class436();
            var22 += var155;
        }
        this.field8475[arg1.field888] = var22;
        class493 var24 = class78.method720(255, this.field8579, arg1, var8);
        class109[] var25 = new class109[arg1.field884];
        for (int var26 = 0; var26 < arg1.field884; var26++) {
            short var134 = arg1.field930[var26];
            short var135 = arg1.field902[var26];
            short var136 = arg1.field922[var26];
            int var137 = this.field8490[var135] - this.field8490[var134];
            int var138 = this.field8540[var135] - this.field8540[var134];
            int var139 = this.field8591[var135] - this.field8591[var134];
            int var140 = this.field8490[var136] - this.field8490[var134];
            int var141 = this.field8540[var136] - this.field8540[var134];
            int var142 = this.field8591[var136] - this.field8591[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var143 >>= 0x1;
                var145 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var143 * var143 + var144 * var144 + var145 * var145));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var145 * 256 / var146;
            int var148 = var143 * 256 / var146;
            int var149 = var144 * 256 / var146;
            byte var150 = arg1.field910 == null ? 0 : arg1.field910[var26];
            if (var150 == 0) {
                class436 var151 = var13[var134];
                var151.field6231 += var149;
                var151.field6228 += var147;
                var151.field6229++;
                var151.field6230 += var148;
                class436 var152 = var13[var135];
                var152.field6230 += var148;
                var152.field6231 += var149;
                var152.field6229++;
                var152.field6228 += var147;
                class436 var153 = var13[var136];
                var153.field6229++;
                var153.field6228 += var147;
                var153.field6231 += var149;
                var153.field6230 += var148;
            } else if (var150 == 1) {
                class109 var154 = var25[var26] = new class109();
                var154.field1902 = var147;
                var154.field1898 = var149;
                var154.field1901 = var148;
            }
        }
        for (int var27 = 0; var27 < this.field8579; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field929[var43] & 0xFFFF;
            int var45;
            if (arg1.field887 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field887[var43];
            }
            int var46;
            if (arg1.field901 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field901[var43] & 0xFF;
            }
            short var47 = arg1.field889 == null ? -1 : arg1.field889[var43];
            if (var47 != -1 && (this.field8503 & 0x40) != 0) {
                class739 var48 = var7.method1180(var47 & 0xFFFF, -6662);
                if (var48.field9951) {
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
                    var56 = 2;
                    var54 = 0.0F;
                    var55 = 1;
                    var50 = 1.0F;
                    var49 = 0.0F;
                    var53 = 0.0F;
                    var51 = 1.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field890[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field930[var43];
                        short var60 = arg1.field902[var43];
                        short var61 = arg1.field922[var43];
                        short var62 = arg1.field896[var45];
                        short var63 = arg1.field916[var45];
                        short var64 = arg1.field892[var45];
                        float var65 = (float) arg1.field908[var62];
                        float var66 = (float) arg1.field914[var62];
                        float var67 = (float) arg1.field919[var62];
                        float var68 = (float) arg1.field908[var63] - var65;
                        float var69 = (float) arg1.field914[var63] - var66;
                        float var70 = (float) arg1.field919[var63] - var67;
                        float var71 = (float) arg1.field908[var64] - var65;
                        float var72 = (float) arg1.field914[var64] - var66;
                        float var73 = (float) arg1.field919[var64] - var67;
                        float var74 = (float) arg1.field908[var59] - var65;
                        float var75 = (float) arg1.field914[var59] - var66;
                        float var76 = (float) arg1.field919[var59] - var67;
                        float var77 = (float) arg1.field908[var60] - var65;
                        float var78 = (float) arg1.field914[var60] - var66;
                        float var79 = (float) arg1.field919[var60] - var67;
                        float var80 = (float) arg1.field908[var61] - var65;
                        float var81 = (float) arg1.field914[var61] - var66;
                        float var82 = (float) arg1.field919[var61] - var67;
                        float var83 = var69 * var73 - (var70 * var72);
                        float var84 = var70 * var71 - (var68 * var73);
                        float var85 = var68 * var72 - var69 * var71;
                        float var86 = var72 * var85 - (var73 * var84);
                        float var87 = var73 * var83 - (var71 * var85);
                        float var88 = var71 * var84 - var72 * var83;
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        float var90 = var68 * var84 - (var69 * var83);
                        float var91 = var69 * var85 - var70 * var84;
                        float var92 = var70 * var83 - var68 * var85;
                        float var93 = 1.0F / (var73 * var90 + var71 * var91 + var72 * var92);
                        var52 = (var79 * var90 + var77 * var91 + var78 * var92) * var93;
                        var50 = (var76 * var90 + var74 * var91 + var75 * var92) * var93;
                        var54 = (var82 * var90 + var80 * var91 + var81 * var92) * var93;
                    } else {
                        short var94 = arg1.field930[var43];
                        short var95 = arg1.field902[var43];
                        short var96 = arg1.field922[var43];
                        int var97 = var24.field6824[var45];
                        int var98 = var24.field6823[var45];
                        int var99 = var24.field6822[var45];
                        float[] var100 = var24.field6820[var45];
                        byte var101 = arg1.field920[var45];
                        float var102 = (float) arg1.field934[var45] / 256.0F;
                        if (var58 == 1) {
                            float var120 = (float) arg1.field911[var45] / 1024.0F;
                            class308.method2004(var99, arg1.field919[var94], var101, 8, arg1.field908[var94], class286.field3994, arg1.field914[var94], var102, var98, var97, var120, var100);
                            var49 = class286.field3994[0];
                            var50 = class286.field3994[1];
                            class308.method2004(var99, arg1.field919[var95], var101, 8, arg1.field908[var95], class286.field3994, arg1.field914[var95], var102, var98, var97, var120, var100);
                            var51 = class286.field3994[0];
                            var52 = class286.field3994[1];
                            class308.method2004(var99, arg1.field919[var96], var101, 8, arg1.field908[var96], class286.field3994, arg1.field914[var96], var102, var98, var97, var120, var100);
                            var53 = class286.field3994[0];
                            var54 = class286.field3994[1];
                            float var121 = var120 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if ((var121 < var53 - var49)) {
                                    var53 -= var120;
                                    var56 = 1;
                                } else if (var121 < var49 - var53) {
                                    var53 += var120;
                                    var56 = 2;
                                }
                                if ((var51 - var49 > var121)) {
                                    var55 = 1;
                                    var51 -= var120;
                                } else if (var49 - var51 > var121) {
                                    var55 = 2;
                                    var51 += var120;
                                }
                            } else {
                                if ((var52 - var50 > var121)) {
                                    var52 -= var120;
                                    var55 = 1;
                                } else if (var50 - var52 > var121) {
                                    var55 = 2;
                                    var52 += var120;
                                }
                                if ((var121 < var54 - var50)) {
                                    var56 = 1;
                                    var54 -= var120;
                                } else if (var50 - var54 > var121) {
                                    var56 = 2;
                                    var54 += var120;
                                }
                            }
                        } else if (var58 == 2) {
                            float var103 = (float) arg1.field924[var45] / 256.0F;
                            float var104 = (float) arg1.field932[var45] / 256.0F;
                            int var105 = arg1.field908[var95] - arg1.field908[var94];
                            int var106 = arg1.field914[var95] - arg1.field914[var94];
                            int var107 = arg1.field919[var95] - arg1.field919[var94];
                            int var108 = arg1.field908[var96] - arg1.field908[var94];
                            int var109 = arg1.field914[var96] - arg1.field914[var94];
                            int var110 = arg1.field919[var96] - arg1.field919[var94];
                            int var111 = var106 * var110 - (var107 * var109);
                            int var112 = var107 * var108 - (var105 * var110);
                            int var113 = var105 * var109 - (var106 * var108);
                            float var114 = 64.0F / (float) arg1.field926[var45];
                            float var115 = 64.0F / (float) arg1.field883[var45];
                            float var116 = 64.0F / (float) arg1.field911[var45];
                            float var117 = (var100[2] * (float) var113 + var100[1] * (float) var112 + var100[0] * (float) var111) / var114;
                            float var118 = (var100[5] * (float) var113 + var100[4] * (float) var112 + var100[3] * (float) var111) / var115;
                            float var119 = (var100[8] * (float) var113 + var100[7] * (float) var112 + var100[6] * (float) var111) / var116;
                            var57 = class234.method1631(var118, false, var119, var117);
                            class168.method1265(var104, var102, var100, arg1.field919[var94], var99, false, var101, var97, arg1.field908[var94], arg1.field914[var94], var103, class286.field3994, var98, var57);
                            var50 = class286.field3994[1];
                            var49 = class286.field3994[0];
                            class168.method1265(var104, var102, var100, arg1.field919[var95], var99, false, var101, var97, arg1.field908[var95], arg1.field914[var95], var103, class286.field3994, var98, var57);
                            var52 = class286.field3994[1];
                            var51 = class286.field3994[0];
                            class168.method1265(var104, var102, var100, arg1.field919[var96], var99, false, var101, var97, arg1.field908[var96], arg1.field914[var96], var103, class286.field3994, var98, var57);
                            var53 = class286.field3994[0];
                            var54 = class286.field3994[1];
                        } else if (var58 == 3) {
                            class226.method1589(var99, var101, var102, arg1.field908[var94], class286.field3994, arg1.field919[var94], var97, arg1.field914[var94], var98, -4, var100);
                            var50 = class286.field3994[1];
                            var49 = class286.field3994[0];
                            class226.method1589(var99, var101, var102, arg1.field908[var95], class286.field3994, arg1.field919[var95], var97, arg1.field914[var95], var98, -4, var100);
                            var51 = class286.field3994[0];
                            var52 = class286.field3994[1];
                            class226.method1589(var99, var101, var102, arg1.field908[var96], class286.field3994, arg1.field919[var96], var97, arg1.field914[var96], var98, -4, var100);
                            var54 = class286.field3994[1];
                            var53 = class286.field3994[0];
                            if ((var101 & 0x1) == 0) {
                                if ((var53 - var49 > 0.5F)) {
                                    var56 = 1;
                                    var53--;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                                if ((var51 - var49 > 0.5F)) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                            } else {
                                if (var52 - var50 > 0.5F) {
                                    var55 = 1;
                                    var52--;
                                } else if (var50 - var52 > 0.5F) {
                                    var52++;
                                    var55 = 2;
                                }
                                if ((var54 - var50 > 0.5F)) {
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field910 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field910[var43];
            }
            if (var122 == 0) {
                long var126 = ((long) (var57 << 24) + (long) var46 + (long) (var44 << 8) << 32) + (long) (var45 << 2);
                short var128 = arg1.field930[var43];
                short var129 = arg1.field902[var43];
                short var130 = arg1.field922[var43];
                class436 var131 = var13[var128];
                this.field8539[var27] = this.method3554(var131.field6231, var131.field6228, var126, var131.field6230, arg1, var131.field6229, var49, 0, var128, var50);
                class436 var132 = var13[var129];
                this.field8526[var27] = this.method3554(var132.field6231, var132.field6228, (long) var55 + var126, var132.field6230, arg1, var132.field6229, var51, 0, var129, var52);
                class436 var133 = var13[var130];
                this.field8513[var27] = this.method3554(var133.field6231, var133.field6228, (long) var56 + var126, var133.field6230, arg1, var133.field6229, var53, 0, var130, var54);
            } else if (var122 == 1) {
                class109 var123 = var25[var43];
                long var124 = ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32) + (long) ((var123.field1901 > 0 ? 1024 : 2048) + (var45 << 2) + (var123.field1898 + 256 << 12) + (var123.field1902 + 256 << 22));
                this.field8539[var27] = this.method3554(var123.field1898, var123.field1902, var124, var123.field1901, arg1, 0, var49, 0, arg1.field930[var43], var50);
                this.field8526[var27] = this.method3554(var123.field1898, var123.field1902, (long) var55 + var124, var123.field1901, arg1, 0, var51, 0, arg1.field902[var43], var52);
                this.field8513[var27] = this.method3554(var123.field1898, var123.field1902, (long) var56 + var124, var123.field1901, arg1, 0, var53, 0, arg1.field922[var43], var54);
            }
            if (arg1.field901 != null) {
                this.field8489[var27] = arg1.field901[var43];
            }
            if (arg1.field923 != null) {
                this.field8520[var27] = arg1.field923[var43];
            }
            this.field8527[var27] = arg1.field929[var43];
            this.field8548[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field8484; var30++) {
            short var42 = this.field8548[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field8573 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field8484; var33++) {
            short var41 = this.field8548[var33];
            if (var32 != var41) {
                this.field8573[var31++] = var33;
                var32 = var41;
            }
        }
        this.field8573[var31] = this.field8484;
        class429.field6147 = null;
        this.field8511 = class35.method443(this.field8511, this.field8476, 114);
        this.field8530 = class35.method443(this.field8530, this.field8476, 126);
        this.field8523 = class35.method443(this.field8523, this.field8476, 100);
        this.field8541 = class675.method3807(this.field8476, (byte) 113, this.field8541);
        this.field8499 = class623.method3543(this.field8476, this.field8499, -1);
        this.field8518 = class623.method3543(this.field8476, this.field8518, -1);
        if (arg1.field935 != null && class482.method2829(this.field8503, (byte) 125, arg2)) {
            this.field8486 = arg1.method466(false, -42);
        }
        if (arg1.field899 != null && class732.method4045(false, arg2, this.field8503)) {
            this.field8574 = arg1.method459((byte) -69);
        }
        if (arg1.field891 != null && class246.method1693(arg2, 256, this.field8503)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field8579; var36++) {
                int var40 = arg1.field891[var8[var36]];
                if (var40 >= 0) {
                    if (var40 > var34) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field8500 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field8500[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field8579; var38++) {
                int var39 = arg1.field891[var8[var38]];
                if (var39 >= 0) {
                    this.field8500[var39][var35[var39]++] = var38;
                }
            }
        }
    }
}
