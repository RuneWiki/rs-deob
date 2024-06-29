import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class56 extends class397 {

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    private int field746 = 0;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    private int field748 = 0;

    @OriginalMember(owner = "client!qb", name = "Lb", descriptor = "I")
    private int field793 = 0;

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "Z")
    private boolean field770 = true;

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
    private int field763 = 0;

    @OriginalMember(owner = "client!qb", name = "xc", descriptor = "Z")
    private boolean field831 = false;

    @OriginalMember(owner = "client!qb", name = "fc", descriptor = "I")
    private int field813 = 0;

    @OriginalMember(owner = "client!qb", name = "ec", descriptor = "Z")
    private boolean field812 = false;

    @OriginalMember(owner = "client!qb", name = "ic", descriptor = "Lkfa;")
    private class382 field816;

    @OriginalMember(owner = "client!qb", name = "xb", descriptor = "Lmba;")
    private class70 field779;

    @OriginalMember(owner = "client!qb", name = "Tb", descriptor = "Lmba;")
    private class70 field801;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Lmba;")
    private class70 field735;

    @OriginalMember(owner = "client!qb", name = "tb", descriptor = "Lmba;")
    private class70 field775;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "Lio;")
    private class688 field732;

    @OriginalMember(owner = "client!qb", name = "Rb", descriptor = "I")
    private int field799;

    @OriginalMember(owner = "client!qb", name = "Hb", descriptor = "I")
    private int field789;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "[I")
    private int[] field734;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "[I")
    private int[] field743;

    @OriginalMember(owner = "client!qb", name = "pc", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "client!qb", name = "yb", descriptor = "[S")
    private short[] field780;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "[I")
    private int[] field762;

    @OriginalMember(owner = "client!qb", name = "Qb", descriptor = "[Lkw;")
    private class7[] field798;

    @OriginalMember(owner = "client!qb", name = "qb", descriptor = "[Lcea;")
    private class94[] field772;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!qb", name = "nc", descriptor = "[Lgv;")
    private class39[] field821;

    @OriginalMember(owner = "client!qb", name = "Cc", descriptor = "[Let;")
    private class665[] field836;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "[S")
    private short[] field720;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "[S")
    private short[] field749;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "[S")
    private short[] field741;

    @OriginalMember(owner = "client!qb", name = "cc", descriptor = "S")
    private short field810;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "[S")
    private short[] field750;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "[S")
    private short[] field723;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[B")
    private byte[] field729;

    @OriginalMember(owner = "client!qb", name = "Sb", descriptor = "[F")
    private float[] field800;

    @OriginalMember(owner = "client!qb", name = "Gb", descriptor = "[S")
    private short[] field788;

    @OriginalMember(owner = "client!qb", name = "Pb", descriptor = "[S")
    private short[] field797;

    @OriginalMember(owner = "client!qb", name = "Wb", descriptor = "S")
    private short field804;

    @OriginalMember(owner = "client!qb", name = "wb", descriptor = "[B")
    private byte[] field778;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "[S")
    private short[] field744;

    @OriginalMember(owner = "client!qb", name = "Ec", descriptor = "[S")
    private short[] field838;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "[S")
    private short[] field740;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "[F")
    private float[] field731;

    @OriginalMember(owner = "client!qb", name = "uc", descriptor = "[I")
    private int[] field828;

    @OriginalMember(owner = "client!qb", name = "vc", descriptor = "[[I")
    private int[][] field829;

    @OriginalMember(owner = "client!qb", name = "rb", descriptor = "[[I")
    private int[][] field773;

    @OriginalMember(owner = "client!qb", name = "mc", descriptor = "[[I")
    private int[][] field820;

    @OriginalMember(owner = "client!qb", name = "yc", descriptor = "B")
    private byte field832;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!qb", name = "lb", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!qb", name = "mb", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!qb", name = "sb", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!qb", name = "ub", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!qb", name = "vb", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!qb", name = "Bb", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!qb", name = "Cb", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!qb", name = "Db", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!qb", name = "Eb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!qb", name = "Fb", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!qb", name = "Ib", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!qb", name = "Jb", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!qb", name = "Nb", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!qb", name = "Ob", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!qb", name = "Ub", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!qb", name = "Vb", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!qb", name = "Xb", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!qb", name = "Yb", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!qb", name = "Zb", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!qb", name = "ac", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!qb", name = "bc", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!qb", name = "dc", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!qb", name = "gc", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!qb", name = "hc", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!qb", name = "jc", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!qb", name = "lc", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!qb", name = "qc", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!qb", name = "rc", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!qb", name = "sc", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!qb", name = "tc", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!qb", name = "wc", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!qb", name = "zc", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!qb", name = "Ac", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!qb", name = "Bc", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!qb", name = "Dc", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!qb", name = "kc", descriptor = "Lmn;")
    private class212 field818;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Lnu;")
    private class411 field739;

    @OriginalMember(owner = "client!qb", name = "zb", descriptor = "Lcs;")
    public static class563 field781;

    @OriginalMember(owner = "client!qb", name = "oc", descriptor = "Lrp;")
    private class607 field822;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "S")
    private short field717;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "S")
    private short field737;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "S")
    private short field745;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "S")
    private short field755;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "S")
    private short field761;

    @OriginalMember(owner = "client!qb", name = "Ab", descriptor = "S")
    private short field782;

    @OriginalMember(owner = "client!qb", name = "Kb", descriptor = "S")
    private short field792;

    @OriginalMember(owner = "client!qb", name = "Mb", descriptor = "S")
    private short field794;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "(III)V")
    public final void method426(int arg0, int arg1, int arg2) {
        field825++;
        for (int var4 = 0; var4 < this.field763; var4++) {
            if (arg0 != 128) {
                this.field823[var4] = this.field823[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field762[var4] = this.field762[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field743[var4] = this.field743[var4] * arg2 >> 7;
            }
        }
        this.field831 = false;
        if (this.field779 != null) {
            this.field779.field1100 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
    public final void method427() {
        field764++;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
    private final void method428(boolean arg0) {
        field787++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field763; var10++) {
            int var11 = this.field823[var10];
            int var12 = this.field762[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            int var13 = this.field743[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var11 < var2) {
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
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field794 = (short) var5;
        this.field737 = (short) var7;
        this.field761 = (short) var6;
        this.field755 = (short) var2;
        this.field717 = (short) var4;
        this.field782 = (short) var3;
        this.field745 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field792 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field831 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIBIS)I")
    private final int method429(int arg0, int arg1, byte arg2, int arg3, short arg4) {
        field805++;
        int var6 = class531.field7839[class638.method3598(arg0, 65408, arg3)];
        if (arg4 != -1) {
            class377 var7 = this.field816.field1459.method2359(-124, arg4 & 0xFFFF);
            int var8 = var7.field5227 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 <= 127) {
                    var9 = arg3 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field5233 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
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
                var6 = (var15 >> 8) + ((var13 & 0xD600FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return arg1 == 127 ? -(arg2 & 0xFF) - (-(var6 << 8) - 255) : 37;
    }

    @OriginalMember(owner = "client!qb", name = "TA", descriptor = "()I")
    public final int method430() {
        field759++;
        return this.field804;
    }

    @OriginalMember(owner = "client!qb", name = "za", descriptor = "()I")
    public final int method431() {
        if (!this.field831) {
            this.method428(true);
        }
        field784++;
        return this.field737;
    }

    @OriginalMember(owner = "client!qb", name = "KA", descriptor = "()I")
    public final int method432() {
        if (!this.field831) {
            this.method428(true);
        }
        field727++;
        return this.field755;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method433(int arg0) {
        if (arg0 == -1) {
            field781 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "RA", descriptor = "()I")
    public final int method434() {
        if (!this.field831) {
            this.method428(true);
        }
        field736++;
        return this.field792;
    }

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "()V")
    public final void method435() {
        for (int var1 = 0; var1 < this.field748; var1++) {
            this.field823[var1] = this.field823[var1] + 7 >> 4;
            this.field762[var1] = this.field762[var1] + 7 >> 4;
            this.field743[var1] = this.field743[var1] + 7 >> 4;
        }
        field756++;
        if (this.field779 != null) {
            this.field779.field1100 = null;
        }
        this.field831 = false;
    }

    @OriginalMember(owner = "client!qb", name = "MA", descriptor = "(I)V")
    public final void method436(int arg0) {
        field815++;
        int var2 = class302.field4241[arg0];
        int var3 = class302.field4242[arg0];
        for (int var4 = 0; var4 < this.field763; var4++) {
            int var5 = this.field762[var4] * var3 - (this.field743[var4] * var2) >> 14;
            this.field743[var4] = this.field762[var4] * var2 + this.field743[var4] * var3 >> 14;
            this.field762[var4] = var5;
        }
        this.field831 = false;
        if (this.field779 != null) {
            this.field779.field1100 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Z")
    public static final boolean method437(byte arg0, int arg1) {
        if (arg0 != 61) {
            return true;
        }
        field728++;
        if (class529.field7803[arg1]) {
            return true;
        } else if (class515.field7631.method2101((byte) -59, arg1)) {
            int var2 = class515.field7631.method2098(0, arg1);
            if (var2 == 0) {
                class529.field7803[arg1] = true;
                return true;
            }
            if (class265.field3806[arg1] == null) {
                class265.field3806[arg1] = new class101[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class265.field3806[arg1][var3] == null) {
                    byte[] var4 = class515.field7631.method2081(arg0 - 189, var3, arg1);
                    if (var4 != null) {
                        class101 var5 = class265.field3806[arg1][var3] = new class101();
                        var5.field1577 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method851(arg0 - 19231, new class465(var4));
                    }
                }
            }
            class529.field7803[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "SA", descriptor = "(I)V")
    public final void method438(int arg0) {
        this.field789 = arg0;
        field757++;
        if (this.field822 != null && (this.field789 & 0x10000) == 0) {
            this.field744 = this.field822.field8730;
            this.field723 = this.field822.field8734;
            this.field778 = this.field822.field8729;
            this.field749 = this.field822.field8731;
            this.field822 = null;
        }
        this.field770 = true;
        this.method457((byte) 98);
    }

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final void method439(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field724++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class88.field1302 = 0;
            class43.field578 = 0;
            int var13 = 0;
            class84.field1273 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field829.length) {
                    int[] var16 = this.field829[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field780 == null || (arg6 & this.field780[var18]) != 0) {
                            class43.field578 += this.field823[var18];
                            class84.field1273 += this.field762[var18];
                            var13++;
                            class88.field1302 += this.field743[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class43.field578 = class43.field578 / var13 + var12;
                class84.field1273 = class84.field1273 / var13 + var11;
                class448.field6465 = true;
                class88.field1302 = class88.field1302 / var13 + var10;
            } else {
                class43.field578 = var12;
                class88.field1302 = var10;
                class84.field1273 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + 8192 - (-(arg7[1] * arg3) - (arg7[2] * arg4)) >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + (arg7[3] * arg2 - -8192) >> 14;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 8192 >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field829.length) {
                    int[] var27 = this.field829[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field780 == null || (arg6 & this.field780[var29]) != 0) {
                            this.field823[var29] += var22;
                            this.field762[var29] += var24;
                            this.field743[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field829.length > var109) {
                        int[] var110 = this.field829[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field780 == null || (this.field780[var112] & arg6) != 0) {
                                this.field823[var112] -= class43.field578;
                                this.field762[var112] -= class84.field1273;
                                this.field743[var112] -= class88.field1302;
                                if (arg4 != 0) {
                                    int var113 = class302.field4241[arg4];
                                    int var114 = class302.field4242[arg4];
                                    int var115 = this.field823[var112] * var114 + this.field762[var112] * var113 + 16383 >> 14;
                                    this.field762[var112] = this.field762[var112] * var114 + 16383 - (this.field823[var112] * var113) >> 14;
                                    this.field823[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class302.field4241[arg2];
                                    int var117 = class302.field4242[arg2];
                                    int var118 = this.field762[var112] * var117 + 16383 - this.field743[var112] * var116 >> 14;
                                    this.field743[var112] = this.field762[var112] * var116 + this.field743[var112] * var117 + 16383 >> 14;
                                    this.field762[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class302.field4241[arg3];
                                    int var120 = class302.field4242[arg3];
                                    int var121 = this.field823[var112] * var120 + this.field743[var112] * var119 + 16383 >> 14;
                                    this.field743[var112] = this.field743[var112] * var120 + 16383 - (this.field823[var112] * var119) >> 14;
                                    this.field823[var112] = var121;
                                }
                                this.field823[var112] += class43.field578;
                                this.field762[var112] += class84.field1273;
                                this.field743[var112] += class88.field1302;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field829.length) {
                            int[] var93 = this.field829[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field780 == null || (this.field780[var95] & arg6) != 0) {
                                    int var96 = this.field734[var95];
                                    int var97 = this.field734[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field740[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class302.field4241[arg4];
                                            int var101 = class302.field4242[arg4];
                                            int var102 = this.field749[var99] * var101 + this.field723[var99] * var100 + 16383 >> 14;
                                            this.field723[var99] = (short) (this.field723[var99] * var101 + 16383 - (this.field749[var99] * var100) >> 14);
                                            this.field749[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class302.field4241[arg2];
                                            int var104 = class302.field4242[arg2];
                                            int var105 = this.field723[var99] * var104 + 16383 - (this.field744[var99] * var103) >> 14;
                                            this.field744[var99] = (short) (this.field744[var99] * var104 + this.field723[var99] * var103 + 16383 >> 14);
                                            this.field723[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class302.field4241[arg3];
                                            int var107 = class302.field4242[arg3];
                                            int var108 = this.field744[var99] * var106 + this.field749[var99] * var107 + 16383 >> 14;
                                            this.field744[var99] = (short) (this.field744[var99] * var107 + 16383 - (this.field749[var99] * var106) >> 14);
                                            this.field749[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field735 == null && this.field775 != null) {
                        this.field775.field1100 = null;
                    }
                    if (this.field735 != null) {
                        this.field735.field1100 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class448.field6465) {
                    int var36 = arg7[0] * class43.field578 + arg7[3] * class84.field1273 + (arg7[6] * class88.field1302) + 8192 >> 14;
                    int var37 = arg7[7] * class88.field1302 + arg7[4] * class84.field1273 + arg7[1] * class43.field578 + 8192 >> 14;
                    int var38 = var33 + var36;
                    int var39 = arg7[2] * class43.field578 + arg7[5] * class84.field1273 + (arg7[8] * class88.field1302) + 8192 >> 14;
                    int var40 = var34 + var37;
                    int var41 = var35 + var39;
                    class43.field578 = var38;
                    class84.field1273 = var40;
                    class88.field1302 = var41;
                    class448.field6465 = false;
                }
                int[] var42 = new int[9];
                int var43 = class302.field4242[arg2];
                int var44 = class302.field4241[arg2];
                int var45 = class302.field4242[arg3];
                int var46 = class302.field4241[arg3];
                int var47 = class302.field4242[arg4];
                int var48 = class302.field4241[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[1] = var46 * var49 + -var45 * var48 + 8192 >> 14;
                var42[0] = var45 * var47 + (var46 * var50) + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[7] = var46 * var48 + (var45 * var49) + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                int var51 = var42[2] * -class88.field1302 + var42[1] * -class84.field1273 + var42[0] * -class43.field578 + 8192 >> 14;
                int var52 = var42[5] * -class88.field1302 + var42[4] * -class84.field1273 + var42[3] * -class43.field578 + 8192 >> 14;
                int var53 = var42[6] * -class43.field578 + 8192 - (-(var42[7] * -class84.field1273) + -(var42[8] * -class88.field1302)) >> 14;
                int var54 = var51 + class43.field578;
                int var55 = class84.field1273 + var52;
                int var56 = class88.field1302 + var53;
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
                int var59 = var42[1] * var34 + (var42[0] * var33 - (-(var42[2] * var35) - 8192)) >> 14;
                int var60 = var42[5] * var35 + var42[4] * var34 + var42[3] * var33 + 8192 >> 14;
                int var61 = var42[6] * var33 + var42[7] * var34 + var42[8] * var35 + 8192 >> 14;
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
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[1] * var62 + arg7[0] * var63 + 8192 >> 14;
                int var68 = arg7[5] * var64 + arg7[4] * var62 + arg7[3] * var63 + 8192 >> 14;
                int var69 = arg7[8] * var64 + arg7[6] * var63 + arg7[7] * var62 + 8192 >> 14;
                int var70 = var31 + var68;
                int var71 = var30 + var67;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field829.length) {
                        int[] var75 = this.field829[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field780 == null || (this.field780[var77] & arg6) != 0) {
                                int var78 = this.field743[var77] * var65[2] + this.field823[var77] * var65[0] + this.field762[var77] * var65[1] + 8192 >> 14;
                                int var79 = this.field823[var77] * var65[3] + this.field762[var77] * var65[4] + this.field743[var77] * var65[5] + 8192 >> 14;
                                int var80 = var70 + var79;
                                int var81 = var71 + var78;
                                int var82 = this.field743[var77] * var65[8] + this.field823[var77] * var65[6] + this.field762[var77] * var65[7] + 8192 >> 14;
                                int var83 = var72 + var82;
                                this.field823[var77] = var81;
                                this.field762[var77] = var80;
                                this.field743[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field829.length) {
                        int[] var124 = this.field829[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field780 == null || (arg6 & this.field780[var126]) != 0) {
                                this.field823[var126] -= class43.field578;
                                this.field762[var126] -= class84.field1273;
                                this.field743[var126] -= class88.field1302;
                                this.field823[var126] = this.field823[var126] * arg2 >> 7;
                                this.field762[var126] = this.field762[var126] * arg3 >> 7;
                                this.field743[var126] = this.field743[var126] * arg4 >> 7;
                                this.field823[var126] += class43.field578;
                                this.field762[var126] += class84.field1273;
                                this.field743[var126] += class88.field1302;
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
                if (class448.field6465) {
                    int var133 = arg7[6] * class88.field1302 + arg7[3] * class84.field1273 + arg7[0] * class43.field578 + 8192 >> 14;
                    int var134 = arg7[1] * class43.field578 + arg7[7] * class88.field1302 + arg7[4] * class84.field1273 + 8192 >> 14;
                    int var135 = var131 + var134;
                    int var136 = var130 + var133;
                    int var137 = arg7[8] * class88.field1302 + arg7[5] * class84.field1273 + arg7[2] * class43.field578 + 8192 >> 14;
                    int var138 = var132 + var137;
                    class84.field1273 = var135;
                    class43.field578 = var136;
                    class88.field1302 = var138;
                    class448.field6465 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class43.field578 * var139 + 8192 >> 14;
                int var143 = -class84.field1273 * var140 + 8192 >> 14;
                int var144 = -class88.field1302 * var141 + 8192 >> 14;
                int var145 = class43.field578 + var142;
                int var146 = class84.field1273 + var143;
                int var147 = class88.field1302 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var145 + var149;
                int var153 = var132 * var141 + 8192 >> 14;
                int var154 = var147 + var153;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += var148[var174 + (var176 * 3)] * arg7[var156 * 3 + var176];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[1] * var151 + arg7[0] * var152 - (-(arg7[2] * var154) - 8192) >> 14;
                int var158 = arg7[3] * var152 + arg7[4] * var151 + arg7[5] * var154 + 8192 >> 14;
                int var159 = var128 + var158;
                int var160 = arg7[8] * var154 + arg7[7] * var151 + arg7[6] * var152 + 8192 >> 14;
                int var161 = var127 + var157;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field829.length > var164) {
                        int[] var165 = this.field829[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field780 == null || (this.field780[var167] & arg6) != 0) {
                                int var168 = this.field743[var167] * var155[2] + (this.field823[var167] * var155[0] + this.field762[var167] * var155[1] + 8192) >> 14;
                                int var169 = this.field743[var167] * var155[5] + this.field762[var167] * var155[4] + (this.field823[var167] * var155[3] - -8192) >> 14;
                                int var170 = var161 + var168;
                                int var171 = this.field823[var167] * var155[6] + this.field762[var167] * var155[7] - (-(this.field743[var167] * var155[8]) + -8192) >> 14;
                                int var172 = var159 + var169;
                                this.field823[var167] = var170;
                                int var173 = var162 + var171;
                                this.field762[var167] = var172;
                                this.field743[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field820 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field820.length > var181) {
                        int[] var182 = this.field820[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field741 == null || (arg6 & this.field741[var184]) != 0) {
                                int var185 = (this.field729[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field729[var184] = (byte) var185;
                                if (this.field775 != null) {
                                    this.field775.field1100 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field836 != null) {
                    for (int var178 = 0; var178 < this.field752; var178++) {
                        class665 var179 = this.field836[var178];
                        class39 var180 = this.field821[var178];
                        var180.field530 = var180.field530 & 0xFFFFFF | 255 - (this.field729[var179.field9354] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field820 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field820.length) {
                        int[] var191 = this.field820[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field741 == null || (arg6 & this.field741[var193]) != 0) {
                                int var194 = this.field788[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x3A6) >> 7;
                                int var197 = var195 + arg2 & 0x3F;
                                int var198 = var194 & 0x7F;
                                int var199 = arg3 / 4 + var196;
                                int var200 = arg4 + var198;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field788[var193] = (short) class460.method2676(var200, class460.method2676(var197 << 10, var199 << 7));
                                if (this.field775 != null) {
                                    this.field775.field1100 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field836 != null) {
                    for (int var187 = 0; var187 < this.field752; var187++) {
                        class665 var188 = this.field836[var187];
                        class39 var189 = this.field821[var187];
                        var189.field530 = class531.field7839[this.field788[var188.field9354] & 0xFFFF] & 0xFFFFFF | var189.field530 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field773 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field773.length > var202) {
                        int[] var203 = this.field773[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class39 var205 = this.field821[var203[var204]];
                            var205.field531 += arg3;
                            var205.field537 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field773 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field773.length > var207) {
                        int[] var208 = this.field773[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class39 var210 = this.field821[var208[var209]];
                            var210.field535 = var210.field535 * arg2 >> 7;
                            var210.field539 = var210.field539 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field773 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field773.length > var212) {
                    int[] var213 = this.field773[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class39 var215 = this.field821[var213[var214]];
                        var215.field529 = var215.field529 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method440(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field796++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            class84.field1273 = 0;
            class88.field1302 = 0;
            class43.field578 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field829.length) {
                    int[] var15 = this.field829[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class43.field578 += this.field823[var17];
                        class84.field1273 += this.field762[var17];
                        class88.field1302 += this.field743[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class43.field578 = class43.field578 / var12 + var9;
                class88.field1302 = class88.field1302 / var12 + var11;
                class84.field1273 = class84.field1273 / var12 + var10;
            } else {
                class84.field1273 = var10;
                class43.field578 = var9;
                class88.field1302 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field829.length) {
                    int[] var23 = this.field829[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field823[var25] += var18;
                        this.field762[var25] += var19;
                        this.field743[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field829.length) {
                    int[] var46 = this.field829[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field823[var59] -= class43.field578;
                            this.field762[var59] -= class84.field1273;
                            this.field743[var59] -= class88.field1302;
                            if (arg4 != 0) {
                                int var60 = class302.field4241[arg4];
                                int var61 = class302.field4242[arg4];
                                int var62 = this.field762[var59] * var60 + this.field823[var59] * var61 + 16383 >> 14;
                                this.field762[var59] = this.field762[var59] * var61 + 16383 - (this.field823[var59] * var60) >> 14;
                                this.field823[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class302.field4241[arg2];
                                int var64 = class302.field4242[arg2];
                                int var65 = this.field762[var59] * var64 - (this.field743[var59] * var63 - 16383) >> 14;
                                this.field743[var59] = this.field743[var59] * var64 + this.field762[var59] * var63 + 16383 >> 14;
                                this.field762[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class302.field4241[arg3];
                                int var67 = class302.field4242[arg3];
                                int var68 = this.field743[var59] * var66 - (-(this.field823[var59] * var67) - 16383) >> 14;
                                this.field743[var59] = this.field743[var59] * var67 + 16383 - (this.field823[var59] * var66) >> 14;
                                this.field823[var59] = var68;
                            }
                            this.field823[var59] += class43.field578;
                            this.field762[var59] += class84.field1273;
                            this.field743[var59] += class88.field1302;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field823[var48] -= class43.field578;
                            this.field762[var48] -= class84.field1273;
                            this.field743[var48] -= class88.field1302;
                            if (arg2 != 0) {
                                int var49 = class302.field4241[arg2];
                                int var50 = class302.field4242[arg2];
                                int var51 = this.field762[var48] * var50 + 16383 - this.field743[var48] * var49 >> 14;
                                this.field743[var48] = this.field762[var48] * var49 + this.field743[var48] * var50 + 16383 >> 14;
                                this.field762[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class302.field4241[arg4];
                                int var53 = class302.field4242[arg4];
                                int var54 = this.field823[var48] * var53 + this.field762[var48] * var52 + 16383 >> 14;
                                this.field762[var48] = this.field762[var48] * var53 + 16383 - (this.field823[var48] * var52) >> 14;
                                this.field823[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class302.field4241[arg3];
                                int var56 = class302.field4242[arg3];
                                int var57 = this.field823[var48] * var56 + this.field743[var48] * var55 + 16383 >> 14;
                                this.field743[var48] = this.field743[var48] * var56 + 16383 - (this.field823[var48] * var55) >> 14;
                                this.field823[var48] = var57;
                            }
                            this.field823[var48] += class43.field578;
                            this.field762[var48] += class84.field1273;
                            this.field743[var48] += class88.field1302;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field829.length > var28) {
                        int[] var29 = this.field829[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field734[var31];
                            int var33 = this.field734[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field740[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class302.field4241[arg4];
                                    int var37 = class302.field4242[arg4];
                                    int var38 = this.field723[var35] * var36 + (this.field749[var35] * var37) + 16383 >> 14;
                                    this.field723[var35] = (short) (this.field723[var35] * var37 + 16383 - (this.field749[var35] * var36) >> 14);
                                    this.field749[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class302.field4241[arg2];
                                    int var40 = class302.field4242[arg2];
                                    int var41 = this.field723[var35] * var40 + 16383 - (this.field744[var35] * var39) >> 14;
                                    this.field744[var35] = (short) (this.field723[var35] * var39 + this.field744[var35] * var40 + 16383 >> 14);
                                    this.field723[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class302.field4241[arg3];
                                    int var43 = class302.field4242[arg3];
                                    int var44 = this.field744[var35] * var42 - (-(this.field749[var35] * var43) - 16383) >> 14;
                                    this.field744[var35] = (short) (this.field744[var35] * var43 + 16383 - (this.field749[var35] * var42) >> 14);
                                    this.field749[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field735 == null && this.field775 != null) {
                    this.field775.field1100 = null;
                }
                if (this.field735 != null) {
                    this.field735.field1100 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field829.length) {
                    int[] var71 = this.field829[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field823[var73] -= class43.field578;
                        this.field762[var73] -= class84.field1273;
                        this.field743[var73] -= class88.field1302;
                        this.field823[var73] = this.field823[var73] * arg2 >> 7;
                        this.field762[var73] = this.field762[var73] * arg3 >> 7;
                        this.field743[var73] = this.field743[var73] * arg4 >> 7;
                        this.field823[var73] += class43.field578;
                        this.field762[var73] += class84.field1273;
                        this.field743[var73] += class88.field1302;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field820 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field820.length > var78) {
                        int[] var79 = this.field820[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field729[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field729[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field775 != null) {
                            this.field775.field1100 = null;
                        }
                    }
                }
                if (this.field836 != null) {
                    for (int var75 = 0; var75 < this.field752; var75++) {
                        class665 var76 = this.field836[var75];
                        class39 var77 = this.field821[var75];
                        var77.field530 = 255 - (this.field729[var76.field9354] & 0xFF) << 24 | var77.field530 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field820 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field820.length > var87) {
                        int[] var88 = this.field820[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field788[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFC6C) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var92 + arg2 & 0x3F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field788[var90] = (short) class460.method2676(var97, class460.method2676(var96 << 10, var95 << 7));
                        }
                        if (var88.length > 0 && this.field775 != null) {
                            this.field775.field1100 = null;
                        }
                    }
                }
                if (this.field836 != null) {
                    for (int var84 = 0; var84 < this.field752; var84++) {
                        class665 var85 = this.field836[var84];
                        class39 var86 = this.field821[var84];
                        var86.field530 = var86.field530 & 0xFF000000 | class531.field7839[this.field788[var85.field9354] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field773 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field773.length > var99) {
                        int[] var100 = this.field773[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class39 var102 = this.field821[var100[var101]];
                            var102.field537 += arg2;
                            var102.field531 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field773 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field773.length) {
                        int[] var105 = this.field773[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class39 var107 = this.field821[var105[var106]];
                            var107.field539 = var107.field539 * arg3 >> 7;
                            var107.field535 = var107.field535 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field773 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field773.length) {
                    int[] var110 = this.field773[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class39 var112 = this.field821[var110[var111]];
                        var112.field529 = var112.field529 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    private final void method441(int arg0) {
        field830++;
        if (arg0 != 0) {
            this.field772 = null;
        }
        if (this.field836 == null) {
            return;
        }
        class286 var2 = this.field816.field5453;
        this.field816.method2285((byte) -126);
        this.field816.method770(!this.field812);
        this.field816.method2272(false, (byte) -9);
        this.field816.method2336((byte) -126, null, this.field816.field5544, null, this.field816.field5536);
        for (int var3 = 0; var3 < this.field752; var3++) {
            class665 var4 = this.field836[var3];
            class39 var5 = this.field821[var3];
            if (!var4.field9343 || !this.field816.method95()) {
                float var6 = (float) (this.field823[var4.field9344] - (-this.field823[var4.field9347] - this.field823[var4.field9345])) * 0.3333333F;
                float var7 = (float) (this.field762[var4.field9347] + this.field762[var4.field9344] + this.field762[var4.field9345]) * 0.3333333F;
                float var8 = (float) (this.field743[var4.field9344] + this.field743[var4.field9347] + this.field743[var4.field9345]) * 0.3333333F;
                float var9 = class7.field72 * var8 + class421.field6018 * var7 + class125.field2056 * var6 + class390.field5679;
                float var10 = class618.field8826 * var8 + class353.field4952 * var7 + class111.field1776 * var6 + class366.field5076;
                float var11 = class5.field44 * var8 + class290.field4071 * var7 + class202.field3108 * var6 + class286.field4032;
                var2.method1759(var5.field529, var4.field9356 * var5.field535 >> 7, var4.field9350 * var5.field539 >> 7, (byte) -105, (float) var5.field537 + var9, (float) var5.field531 - var10, (float) var4.field9342 - var11);
                this.field816.method2304((byte) -61, var2);
                int var12 = var5.field530;
                OpenGL.glColor4ub((byte) (var12 >> 16), (byte) (var12 >> 8), (byte) var12, (byte) (var12 >> 24));
                this.field816.method2321(-1111, var4.field9355);
                this.field816.method2325(var4.field9348, (byte) 45);
                this.field816.method2286(39, 7, 4, 0);
            }
        }
        this.field816.method770(true);
        this.field816.method2307(-85);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3) {
        field766++;
        for (int var5 = 0; var5 < this.field793; var5++) {
            int var9 = this.field788[var5] & 0xFFFF;
            int var10 = (var9 & 0xFCAA) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field788[var5] = (short) class460.method2676(var12, class460.method2676(var11 << 7, var10 << 10));
        }
        if (this.field836 != null) {
            for (int var6 = 0; var6 < this.field752; var6++) {
                class665 var7 = this.field836[var6];
                class39 var8 = this.field821[var6];
                var8.field530 = var8.field530 & 0xFF000000 | class531.field7839[this.field788[var7.field9354] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field775 != null) {
            this.field775.field1100 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
    public static final boolean method443(int arg0, int arg1, int arg2) {
        if (arg0 != 65535) {
            method473(89, (byte) 112, 90);
        }
        field835++;
        return (arg1 & 0x60000) != 0 | class172.method1271(arg2, (byte) 60, arg1) || class460.method2674(true, arg1, arg2);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()V")
    public final void method444() {
        field814++;
        if (this.field813 <= 0 || this.field746 <= 0) {
            return;
        }
        this.method467((byte) 75, false);
        if ((this.field832 & 0x10) == 0 && this.field732.field9761 == null) {
            this.method454(false, 5123);
        }
        this.method457((byte) 98);
    }

    @OriginalMember(owner = "client!qb", name = "FA", descriptor = "()V")
    public final void method445() {
        field726++;
        for (int var1 = 0; var1 < this.field763; var1++) {
            this.field743[var1] = -this.field743[var1];
        }
        for (int var2 = 0; var2 < this.field813; var2++) {
            this.field744[var2] = (short) (-this.field744[var2]);
        }
        for (int var3 = 0; var3 < this.field793; var3++) {
            short var4 = this.field797[var3];
            this.field797[var3] = this.field838[var3];
            this.field838[var3] = var4;
        }
        if (this.field735 == null && this.field775 != null) {
            this.field775.field1100 = null;
        }
        if (this.field735 != null) {
            this.field735.field1100 = null;
        }
        if (this.field732 != null) {
            this.field732.field9761 = null;
        }
        if (this.field779 != null) {
            this.field779.field1100 = null;
        }
        this.field831 = false;
    }

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "()I")
    public final int method446() {
        field758++;
        if (!this.field831) {
            this.method428(true);
        }
        return this.field761;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIIIIIIII)Z")
    private final boolean method447(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != 18) {
            this.method485();
        }
        field811++;
        if (arg3 > arg8 && arg8 < arg5 && arg6 > arg8) {
            return false;
        } else if (arg8 > arg3 && arg8 > arg5 && arg8 > arg6) {
            return false;
        } else if (arg7 > arg1 && arg4 > arg1 && arg2 > arg1) {
            return false;
        } else {
            return arg7 >= arg1 || arg4 >= arg1 || arg1 <= arg2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lq;Lj;II)V")
    public final void method448(class152 arg0, class299 arg1, int arg2, int arg3) {
        field837++;
        if (this.field813 == 0) {
            return;
        }
        class286 var5 = this.field816.field5491;
        class286 var6 = (class286) arg0;
        if (!this.field831) {
            this.method428(true);
        }
        class286.field4032 = var5.field4003 * var6.field4029 + var5.field4000 * var6.field4005 + var5.field3996 * var6.field4004 + var5.field4029;
        class290.field4071 = var5.field4003 * var6.field4000 + var5.field4000 * var6.field4024 + var5.field3996 * var6.field4031;
        float var7 = (float) this.field782 * class290.field4071 + class286.field4032;
        float var8 = (float) this.field761 * class290.field4071 + class286.field4032;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) (-this.field745) + var8;
            var9 = (float) this.field745 + var7;
        } else {
            var9 = (float) this.field745 + var8;
            var10 = var7 - (float) this.field745;
        }
        if ((var10 >= this.field816.field5549) || ((float) this.field816.field5540 >= var9)) {
            return;
        }
        class421.field6018 = var5.field4015 * var6.field4000 + var5.field4031 * var6.field4024 + var5.field4030 * var6.field4031;
        class390.field5679 = var5.field4015 * var6.field4029 + var5.field4031 * var6.field4005 + var5.field4030 * var6.field4004 + var5.field4004;
        float var11 = (float) this.field782 * class421.field6018 + class390.field5679;
        float var12 = (float) this.field761 * class421.field6018 + class390.field5679;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field745 + var11) * (float) this.field816.field5552;
            var14 = (var12 - (float) this.field745) * (float) this.field816.field5552;
        } else {
            var13 = ((float) this.field745 + var12) * (float) this.field816.field5552;
            var14 = (var11 - (float) this.field745) * (float) this.field816.field5552;
        }
        if ((this.field816.field5505 <= var14 / (float) arg2) || (this.field816.field5533 >= var13 / (float) arg2)) {
            return;
        }
        class366.field5076 = var5.field4011 * var6.field4029 + var5.field4024 * var6.field4005 + var5.field4008 * var6.field4004 + var5.field4005;
        class353.field4952 = var5.field4011 * var6.field4000 + var5.field4024 * var6.field4024 + var5.field4008 * var6.field4031;
        float var15 = (float) this.field782 * class353.field4952 + class366.field5076;
        float var16 = (float) this.field761 * class353.field4952 + class366.field5076;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) (-this.field745) + var16) * (float) this.field816.field5604;
            var17 = ((float) this.field745 + var15) * (float) this.field816.field5604;
        } else {
            var17 = ((float) this.field745 + var16) * (float) this.field816.field5604;
            var18 = ((float) (-this.field745) + var15) * (float) this.field816.field5604;
        }
        if ((var18 / (float) arg2 >= this.field816.field5572) || (this.field816.field5592 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field836 != null) {
            class125.field2056 = var5.field4015 * var6.field3996 + var5.field4031 * var6.field4008 + var5.field4030 * var6.field4030;
            class5.field44 = var5.field4003 * var6.field4003 + var5.field4000 * var6.field4011 + var5.field3996 * var6.field4015;
            class202.field3108 = var5.field4003 * var6.field3996 + var5.field4000 * var6.field4008 + var5.field3996 * var6.field4030;
            class111.field1776 = var5.field4011 * var6.field3996 + var5.field4024 * var6.field4008 + var5.field4008 * var6.field4030;
            class7.field72 = var5.field4015 * var6.field4003 + var5.field4031 * var6.field4011 + var5.field4030 * var6.field4015;
            class618.field8826 = var5.field4011 * var6.field4003 + var5.field4024 * var6.field4011 + var5.field4008 * var6.field4015;
        }
        if (arg1 != null) {
            int var19 = this.field755 + this.field794 >> 1;
            int var20 = this.field737 + this.field717 >> 1;
            int var21 = (int) ((float) var20 * class7.field72 + (float) this.field782 * class421.field6018 + (float) var19 * class125.field2056 + class390.field5679);
            int var22 = (int) ((float) var20 * class618.field8826 + (float) this.field782 * class353.field4952 + (float) var19 * class111.field1776 + class366.field5076);
            int var23 = (int) ((float) var20 * class5.field44 + (float) this.field782 * class290.field4071 + (float) var19 * class202.field3108 + class286.field4032);
            int var24 = (int) ((float) var20 * class7.field72 + (float) this.field761 * class421.field6018 + (float) var19 * class125.field2056 + class390.field5679);
            int var25 = (int) ((float) var20 * class618.field8826 + (float) this.field761 * class353.field4952 + (float) var19 * class111.field1776 + class366.field5076);
            arg1.field4205 = this.field816.field5552 * var24 / arg2 + this.field816.field5531;
            arg1.field4204 = this.field816.field5562 + (this.field816.field5604 * var25 / arg2);
            arg1.field4206 = this.field816.field5562 + (this.field816.field5604 * var22 / arg2);
            arg1.field4208 = this.field816.field5552 * var21 / arg2 + this.field816.field5531;
            int var26 = (int) ((float) var20 * class5.field44 + (float) this.field761 * class290.field4071 + (float) var19 * class202.field3108 + class286.field4032);
            if (this.field816.field5540 <= var23 || var26 >= this.field816.field5540) {
                arg1.field4207 = (this.field745 + var21) * this.field816.field5552 / arg2 + this.field816.field5531 - arg1.field4208;
                arg1.field4209 = true;
            }
        }
        this.field816.method2259(9801, (float) arg2);
        this.field816.method2269(16);
        this.field816.method2276(0, var6);
        this.method463(-65536);
        this.field816.method2307(-36);
        this.method441(0);
    }

    @OriginalMember(owner = "client!qb", name = "LA", descriptor = "()Z")
    public final boolean method449() {
        field751++;
        return this.field812;
    }

    @OriginalMember(owner = "client!qb", name = "OA", descriptor = "()I")
    public final int method450() {
        field722++;
        if (!this.field831) {
            this.method428(true);
        }
        return this.field717;
    }

    @OriginalMember(owner = "client!qb", name = "ga", descriptor = "(I)V")
    public final void method451(int arg0) {
        this.field810 = (short) arg0;
        if (this.field775 != null) {
            this.field775.field1100 = null;
        }
        field747++;
        if (this.field735 != null) {
            this.field735.field1100 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "()I")
    public final int method452() {
        field786++;
        if (!this.field831) {
            this.method428(true);
        }
        return this.field794;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([[[BIIILr;IIIBIIII)V")
    public static final void method453(byte[][][] arg0, int arg1, int arg2, int arg3, class98 arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
        field771++;
        if (arg3 == 0 || arg6 == 0 || arg8 != 66) {
            return;
        }
        if (arg3 == 9) {
            arg3 = 1;
            arg12 = arg12 + 1 & 0x3;
        }
        if (arg3 == 10) {
            arg3 = 1;
            arg12 = arg12 + 3 & 0x3;
        }
        if (arg3 == 11) {
            arg12 = arg12 + 3 & 0x3;
            arg3 = 8;
        }
        arg4.method789(arg2, arg5, arg7, arg10, arg9, arg1, arg0[arg3 - 1][arg12], arg6, arg11);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
    private final void method454(boolean arg0, int arg1) {
        field808++;
        if (this.field816.field5537.field6719.length >= (this.field746 * 6)) {
            this.field816.field5537.field6710 = 0;
        } else {
            this.field816.field5537 = new class351(this.field746 * 6 + 600);
        }
        class351 var3 = this.field816.field5537;
        if (this.field816.field5558) {
            for (int var5 = 0; var5 < this.field746; var5++) {
                var3.method2739((byte) -86, this.field797[var5]);
                var3.method2739((byte) -86, this.field750[var5]);
                var3.method2739((byte) -86, this.field838[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field746; var4++) {
                var3.method2742(this.field797[var4], -1557853240);
                var3.method2742(this.field750[var4], arg1 - 1557858363);
                var3.method2742(this.field838[var4], -1557853240);
            }
        }
        if (var3.field6710 == 0) {
            return;
        }
        if (arg0) {
            if (this.field818 == null) {
                this.field818 = this.field816.method2296(var3.field6710, 5123, true, (byte) 97, var3.field6719);
            } else {
                this.field818.method1449(var3.field6719, var3.field6710, 5123, -17605);
            }
            this.field732.field9761 = this.field818;
        } else {
            this.field732.field9761 = this.field816.method2296(var3.field6710, 5123, false, (byte) 102, var3.field6719);
        }
        if (arg1 != 5123) {
            this.method482(120, 113, null, true, 126);
        }
        if (!arg0) {
            this.field770 = true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "oa", descriptor = "(III)V")
    public final void method455(int arg0, int arg1, int arg2) {
        field767++;
        for (int var4 = 0; var4 < this.field763; var4++) {
            if (arg0 != 0) {
                this.field823[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field762[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field743[var4] += arg2;
            }
        }
        if (this.field779 != null) {
            this.field779.field1100 = null;
        }
        this.field831 = false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lq;IZ)V")
    public final void method456(class152 arg0, int arg1, boolean arg2) {
        field730++;
        if (this.field780 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field763; var5++) {
            if ((this.field780[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method178(this.field823[var5], this.field762[var5], this.field743[var5], var4);
                } else {
                    arg0.method169(this.field823[var5], this.field762[var5], this.field743[var5], var4);
                }
                this.field823[var5] = var4[0];
                this.field762[var5] = var4[1];
                this.field743[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    private final void method457(byte arg0) {
        field795++;
        if (!this.field770) {
            return;
        }
        this.field770 = false;
        if (this.field798 == null && this.field772 == null && this.field836 == null) {
            if (this.field823 != null && !class137.method1044(this.field799, this.field789, (byte) -23)) {
                if (this.field779 != null && this.field779.field1100 == null) {
                    this.field770 = true;
                } else {
                    if (!this.field831) {
                        this.method428(true);
                    }
                    this.field823 = null;
                }
            }
            if (this.field762 != null && !class163.method1246((byte) -11, this.field789, this.field799)) {
                if (this.field779 != null && this.field779.field1100 == null) {
                    this.field770 = true;
                } else {
                    if (!this.field831) {
                        this.method428(true);
                    }
                    this.field762 = null;
                }
            }
            if (this.field743 != null && !class638.method3596((byte) 113, this.field799, this.field789)) {
                if (this.field779 != null && this.field779.field1100 == null) {
                    this.field770 = true;
                } else {
                    if (!this.field831) {
                        this.method428(true);
                    }
                    this.field743 = null;
                }
            }
        }
        if (this.field740 != null && this.field823 == null && this.field762 == null && this.field743 == null) {
            this.field734 = null;
            this.field740 = null;
        }
        if (this.field778 != null && !class313.method1893((byte) 66, this.field799, this.field789)) {
            if (this.field735 == null) {
                if (this.field775 != null && this.field775.field1100 == null) {
                    this.field770 = true;
                } else {
                    this.field749 = this.field723 = this.field744 = null;
                    this.field778 = null;
                }
            } else if (this.field735.field1100 == null) {
                this.field770 = true;
            } else {
                this.field749 = this.field723 = this.field744 = null;
                this.field778 = null;
            }
        }
        if (this.field788 != null && !class188.method1332(this.field799, 3543, this.field789)) {
            if (this.field775 != null && this.field775.field1100 == null) {
                this.field770 = true;
            } else {
                this.field788 = null;
            }
        }
        if (this.field729 != null && !class473.method2778(68, this.field799, this.field789)) {
            if (this.field775 != null && this.field775.field1100 == null) {
                this.field770 = true;
            } else {
                this.field729 = null;
            }
        }
        if (this.field800 != null && !class697.method3924(34962, this.field799, this.field789)) {
            if (this.field801 != null && this.field801.field1100 == null) {
                this.field770 = true;
            } else {
                this.field800 = this.field731 = null;
            }
        }
        if (this.field720 != null && !class531.method3127(this.field799, true, this.field789)) {
            if (this.field775 != null && this.field775.field1100 == null) {
                this.field770 = true;
            } else {
                this.field720 = null;
            }
        }
        if (arg0 != 98) {
            this.method427();
        }
        if (this.field797 != null && !class596.method3413(this.field789, this.field799, (byte) -32)) {
            if ((this.field732 == null || this.field732.field9761 != null) && (this.field775 == null || this.field775.field1100 != null)) {
                this.field797 = this.field750 = this.field838 = null;
            } else {
                this.field770 = true;
            }
        }
        if (this.field820 != null && !class520.method3068((byte) 114, this.field789, this.field799)) {
            this.field820 = null;
            this.field741 = null;
        }
        if (this.field829 != null && !class352.method2134(this.field789, (byte) -127, this.field799)) {
            this.field780 = null;
            this.field829 = null;
        }
        if (this.field773 != null && !class79.method614(this.field799, arg0 - 141, this.field789)) {
            this.field773 = null;
        }
        if (this.field828 != null && (this.field789 & 0x800) == 0 && (this.field789 & 0x40000) == 0) {
            this.field828 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "(I)V")
    public final void method458(int arg0) {
        field777++;
        int var2 = class302.field4241[arg0];
        int var3 = class302.field4242[arg0];
        for (int var4 = 0; var4 < this.field763; var4++) {
            int var5 = this.field823[var4] * var3 + this.field762[var4] * var2 >> 14;
            this.field762[var4] = this.field762[var4] * var3 - (this.field823[var4] * var2) >> 14;
            this.field823[var4] = var5;
        }
        if (this.field779 != null) {
            this.field779.field1100 = null;
        }
        this.field831 = false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lq;IIZZI)Z")
    private final boolean method459(class152 arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field774++;
        class286 var7 = (class286) arg0;
        class286 var8 = this.field816.field5491;
        float var9 = var7.field4029 * var8.field4015 + var7.field4005 * var8.field4031 + var7.field4004 * var8.field4030 + var8.field4004;
        float var10 = var7.field4029 * var8.field4011 + var7.field4005 * var8.field4024 + var7.field4004 * var8.field4008 + var8.field4005;
        class125.field2056 = var7.field3996 * var8.field4015 + var7.field4030 * var8.field4030 + var7.field4008 * var8.field4031;
        class290.field4071 = var7.field4000 * var8.field4003 + var7.field4031 * var8.field3996 + var7.field4024 * var8.field4000;
        class111.field1776 = var7.field3996 * var8.field4011 + var7.field4030 * var8.field4008 + var7.field4008 * var8.field4024;
        float var11 = var7.field4029 * var8.field4003 + var7.field4005 * var8.field4000 + var7.field4004 * var8.field3996 + var8.field4029;
        class202.field3108 = var7.field3996 * var8.field4003 + var7.field4030 * var8.field3996 + var7.field4008 * var8.field4000;
        class353.field4952 = var7.field4000 * var8.field4011 + var7.field4031 * var8.field4008 + var7.field4024 * var8.field4024;
        class421.field6018 = var7.field4000 * var8.field4015 + var7.field4031 * var8.field4030 + var7.field4024 * var8.field4031;
        class618.field8826 = var7.field4003 * var8.field4011 + var7.field4015 * var8.field4008 + var7.field4011 * var8.field4024;
        class5.field44 = var7.field4003 * var8.field4003 + var7.field4015 * var8.field3996 + var7.field4011 * var8.field4000;
        class7.field72 = var7.field4003 * var8.field4015 + var7.field4015 * var8.field4030 + var7.field4011 * var8.field4031;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        if (!arg4) {
            this.field832 = 98;
        }
        int var17 = this.field816.field5552;
        int var18 = this.field816.field5604;
        if (!this.field831) {
            this.method428(true);
        }
        class311.field4317[0] = this.field755;
        class379.field5240[0] = this.field782;
        class112.field1803[0] = this.field717;
        class311.field4317[1] = this.field794;
        class379.field5240[1] = this.field782;
        class112.field1803[1] = this.field717;
        class311.field4317[2] = this.field755;
        class379.field5240[2] = this.field761;
        class311.field4317[3] = this.field794;
        class112.field1803[2] = this.field717;
        class379.field5240[3] = this.field761;
        class311.field4317[4] = this.field755;
        class112.field1803[3] = this.field717;
        class379.field5240[4] = this.field782;
        class112.field1803[4] = this.field737;
        class311.field4317[5] = this.field794;
        class379.field5240[5] = this.field782;
        class112.field1803[5] = this.field737;
        class311.field4317[6] = this.field755;
        class379.field5240[6] = this.field761;
        class112.field1803[6] = this.field737;
        class311.field4317[7] = this.field794;
        class379.field5240[7] = this.field761;
        class112.field1803[7] = this.field737;
        for (int var19 = 0; var19 < 8; var19++) {
            float var40 = (float) class379.field5240[var19];
            float var41 = (float) class311.field4317[var19];
            float var42 = (float) class112.field1803[var19];
            float var43 = class7.field72 * var42 + class421.field6018 * var40 + class125.field2056 * var41 + var9;
            float var44 = class5.field44 * var42 + class290.field4071 * var40 + class202.field3108 * var41 + var11;
            float var45 = class618.field8826 * var42 + class353.field4952 * var40 + class111.field1776 * var41 + var10;
            if ((float) this.field816.field5540 <= var44) {
                if (arg2 > 0) {
                    var44 = arg2;
                }
                float var46 = (float) var17 * var43 / var44 + (float) this.field816.field5531;
                if (var13 > var46) {
                    var13 = var46;
                }
                if (var14 < var46) {
                    var14 = var46;
                }
                float var47 = (float) var18 * var45 / var44 + (float) this.field816.field5562;
                if (var47 < var15) {
                    var15 = var47;
                }
                var12 = true;
                if (var16 < var47) {
                    var16 = var47;
                }
            }
        }
        if (var12 && var13 < (float) arg5 && (float) arg5 < var14 && (float) arg1 > var15 && var16 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field813 > this.field816.field5608.length) {
                this.field816.field5608 = new int[this.field813];
                this.field816.field5606 = new int[this.field813];
            }
            int[] var20 = this.field816.field5608;
            int[] var21 = this.field816.field5606;
            for (int var22 = 0; var22 < this.field763; var22++) {
                float var24 = (float) this.field762[var22];
                float var25 = (float) this.field743[var22];
                float var26 = (float) this.field823[var22];
                float var27 = class7.field72 * var25 + class421.field6018 * var24 + class125.field2056 * var26 + var9;
                float var28 = class5.field44 * var25 + class290.field4071 * var24 + class202.field3108 * var26 + var11;
                float var29 = class618.field8826 * var25 + class353.field4952 * var24 + class111.field1776 * var26 + var10;
                if (((float) this.field816.field5540 <= var28)) {
                    if (arg2 > 0) {
                        var28 = arg2;
                    }
                    int var34 = (int) ((float) var17 * var27 / var28 + (float) this.field816.field5531);
                    int var35 = (int) ((float) var18 * var29 / var28 + (float) this.field816.field5562);
                    int var36 = this.field734[var22];
                    int var37 = this.field734[var22 + 1];
                    for (int var38 = var36; var38 < var37; var38++) {
                        int var39 = this.field740[var38] - 1;
                        if (var39 == -1) {
                            break;
                        }
                        var20[var39] = var34;
                        var21[var39] = var35;
                    }
                } else {
                    int var30 = this.field734[var22];
                    int var31 = this.field734[var22 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field740[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var20[this.field740[var32] - 1] = -999999;
                    }
                }
            }
            for (int var23 = 0; var23 < this.field793; var23++) {
                if (var20[this.field797[var23]] != -999999 && var20[this.field750[var23]] != -999999 && var20[this.field838[var23]] != -999999 && this.method447((byte) 18, arg5, var20[this.field838[var23]], var21[this.field797[var23]], var20[this.field750[var23]], var21[this.field750[var23]], var21[this.field838[var23]], var20[this.field797[var23]], arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lq;Lj;I)V")
    public final void method460(class152 arg0, class299 arg1, int arg2) {
        field803++;
        if (this.field813 == 0) {
            return;
        }
        class286 var4 = this.field816.field5491;
        if (!this.field831) {
            this.method428(true);
        }
        class286 var5 = (class286) arg0;
        class286.field4032 = var4.field4003 * var5.field4029 + var4.field4000 * var5.field4005 + var4.field3996 * var5.field4004 + var4.field4029;
        class290.field4071 = var4.field4003 * var5.field4000 + var4.field4000 * var5.field4024 + var4.field3996 * var5.field4031;
        float var6 = (float) this.field782 * class290.field4071 + class286.field4032;
        float var7 = (float) this.field761 * class290.field4071 + class286.field4032;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = var7 - (float) this.field745;
            var9 = (float) this.field745 + var6;
        } else {
            var8 = var6 - (float) this.field745;
            var9 = (float) this.field745 + var7;
        }
        if ((var8 >= this.field816.field5534) || (var9 <= (float) this.field816.field5540)) {
            return;
        }
        class390.field5679 = var4.field4015 * var5.field4029 + var4.field4031 * var5.field4005 + var4.field4030 * var5.field4004 + var4.field4004;
        class421.field6018 = var4.field4015 * var5.field4000 + var4.field4031 * var5.field4024 + var4.field4030 * var5.field4031;
        float var10 = (float) this.field782 * class421.field6018 + class390.field5679;
        float var11 = (float) this.field761 * class421.field6018 + class390.field5679;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = (var11 - (float) this.field745) * (float) this.field816.field5552;
            var13 = ((float) this.field745 + var10) * (float) this.field816.field5552;
        } else {
            var12 = ((float) (-this.field745) + var10) * (float) this.field816.field5552;
            var13 = ((float) this.field745 + var11) * (float) this.field816.field5552;
        }
        if ((this.field816.field5505 <= var12 / var9) || (var13 / var9 <= this.field816.field5533)) {
            return;
        }
        class366.field5076 = var4.field4011 * var5.field4029 + var4.field4024 * var5.field4005 + var4.field4008 * var5.field4004 + var4.field4005;
        class353.field4952 = var4.field4011 * var5.field4000 + var4.field4024 * var5.field4024 + var4.field4008 * var5.field4031;
        float var14 = (float) this.field782 * class353.field4952 + class366.field5076;
        float var15 = (float) this.field761 * class353.field4952 + class366.field5076;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) (-this.field745) + var15) * (float) this.field816.field5604;
            var17 = ((float) this.field745 + var14) * (float) this.field816.field5604;
        } else {
            var17 = ((float) this.field745 + var15) * (float) this.field816.field5604;
            var16 = (var14 - (float) this.field745) * (float) this.field816.field5604;
        }
        if ((this.field816.field5572 <= var16 / var9) || (this.field816.field5592 >= var17 / var9)) {
            return;
        }
        if (arg1 != null || this.field836 != null) {
            class202.field3108 = var4.field4003 * var5.field3996 + var4.field4000 * var5.field4008 + var4.field3996 * var5.field4030;
            class111.field1776 = var4.field4011 * var5.field3996 + var4.field4024 * var5.field4008 + var4.field4008 * var5.field4030;
            class125.field2056 = var4.field4015 * var5.field3996 + var4.field4031 * var5.field4008 + var4.field4030 * var5.field4030;
            class7.field72 = var4.field4015 * var5.field4003 + var4.field4031 * var5.field4011 + var4.field4030 * var5.field4015;
            class618.field8826 = var4.field4011 * var5.field4003 + var4.field4024 * var5.field4011 + var4.field4008 * var5.field4015;
            class5.field44 = var4.field4003 * var5.field4003 + var4.field4000 * var5.field4011 + var4.field3996 * var5.field4015;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field794 + this.field755 >> 1;
            int var21 = this.field737 + this.field717 >> 1;
            int var22 = (int) ((float) var21 * class7.field72 + (float) this.field782 * class421.field6018 + (float) var20 * class125.field2056 + class390.field5679);
            int var23 = (int) ((float) var21 * class618.field8826 + (float) this.field782 * class353.field4952 + (float) var20 * class111.field1776 + class366.field5076);
            int var24 = (int) ((float) var21 * class5.field44 + (float) this.field782 * class290.field4071 + (float) var20 * class202.field3108 + class286.field4032);
            if (this.field816.field5540 > var24) {
                var18 = true;
            } else {
                arg1.field4206 = this.field816.field5604 * var23 / var24 + this.field816.field5562;
                arg1.field4208 = this.field816.field5531 + (this.field816.field5552 * var22 / var24);
            }
            int var25 = (int) ((float) var21 * class7.field72 + (float) this.field761 * class421.field6018 + (float) var20 * class125.field2056 + class390.field5679);
            int var26 = (int) ((float) var21 * class618.field8826 + (float) this.field761 * class353.field4952 + (float) var20 * class111.field1776 + class366.field5076);
            int var27 = (int) ((float) var21 * class5.field44 + (float) this.field761 * class290.field4071 + (float) var20 * class202.field3108 + class286.field4032);
            if (var27 >= this.field816.field5540) {
                arg1.field4205 = this.field816.field5552 * var25 / var27 + this.field816.field5531;
                arg1.field4204 = this.field816.field5604 * var26 / var27 + this.field816.field5562;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field816.field5540 > var24 && var27 < this.field816.field5540) {
                    var19 = false;
                } else if (this.field816.field5540 > var24) {
                    int var28 = (var27 - this.field816.field5540 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field4208 = this.field816.field5552 * var29 / this.field816.field5540 + this.field816.field5531;
                    arg1.field4206 = this.field816.field5604 * var30 / this.field816.field5540 + this.field816.field5562;
                } else if (this.field816.field5540 > var27) {
                    int var31 = (var24 - this.field816.field5540 << 16) / (var24 - var27);
                    int var32 = var22 + ((var22 - var25) * var31 >> 16);
                    arg1.field4208 = this.field816.field5531 + (this.field816.field5552 * var32 / this.field816.field5540);
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field4206 = this.field816.field5604 * var33 / this.field816.field5540 + this.field816.field5562;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field4207 = this.field816.field5531 + ((var22 + this.field745) * this.field816.field5552 / var24) - arg1.field4208;
                } else {
                    arg1.field4207 = this.field816.field5531 + ((this.field745 + var25) * this.field816.field5552 / var27) - arg1.field4205;
                }
                arg1.field4209 = true;
            }
        }
        this.field816.method2311(true);
        this.field816.method2276(0, var5);
        this.method463(-65536);
        this.field816.method2307(-83);
        this.method441(0);
    }

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "()I")
    public final int method461() {
        field765++;
        if (!this.field831) {
            this.method428(true);
        }
        return this.field745;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
    public final void method462() {
        field738++;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    private final void method463(int arg0) {
        if (arg0 != -65536) {
            this.method466(null, -32, 11, 37, true);
        }
        field742++;
        if (this.field746 == 0) {
            return;
        }
        if (this.field832 != 0) {
            this.method467((byte) 75, true);
        }
        this.method467((byte) 75, false);
        if (this.field732 != null) {
            if (this.field732.field9761 == null) {
                this.method454((this.field832 & 0x10) != 0, 5123);
            }
            if (this.field732.field9761 != null) {
                this.field816.method2272(this.field735 != null, (byte) -9);
                this.field816.method2336((byte) -112, this.field735, this.field779, this.field775, this.field801);
                int var2 = this.field828.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field828[var3];
                    int var5 = this.field828[var3 + 1];
                    int var6 = this.field720[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field816.method2280(var6, this.field735 != null, (byte) -91);
                    this.field816.method2320(4, false, var4 * 3, (var5 - var4) * 3, this.field732.field9761);
                }
            }
        }
        this.method457((byte) 98);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(SS)V")
    public final void method464(short arg0, short arg1) {
        field807++;
        for (int var3 = 0; var3 < this.field793; var3++) {
            if (this.field788[var3] == arg0) {
                this.field788[var3] = arg1;
            }
        }
        if (this.field836 != null) {
            for (int var4 = 0; var4 < this.field752; var4++) {
                class665 var5 = this.field836[var4];
                class39 var6 = this.field821[var4];
                var6.field530 = var6.field530 & 0xFF000000 | class531.field7839[this.field788[var5.field9354] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field775 != null) {
            this.field775.field1100 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "WA", descriptor = "(IIII)V")
    public final void method465(int arg0, int arg1, int arg2, int arg3) {
        field776++;
        if (arg0 == 0) {
            class88.field1302 = 0;
            class43.field578 = 0;
            int var5 = 0;
            class84.field1273 = 0;
            for (int var6 = 0; var6 < this.field763; var6++) {
                class43.field578 += this.field823[var6];
                class84.field1273 += this.field762[var6];
                var5++;
                class88.field1302 += this.field743[var6];
            }
            if (var5 > 0) {
                class43.field578 = class43.field578 / var5 + arg1;
                class84.field1273 = class84.field1273 / var5 + arg2;
                class88.field1302 = class88.field1302 / var5 + arg3;
            } else {
                class88.field1302 = arg3;
                class43.field578 = arg1;
                class84.field1273 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field763; var7++) {
                this.field823[var7] += arg1;
                this.field762[var7] += arg2;
                this.field743[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field763; var8++) {
                this.field823[var8] -= class43.field578;
                this.field762[var8] -= class84.field1273;
                this.field743[var8] -= class88.field1302;
                if (arg3 != 0) {
                    int var9 = class302.field4241[arg3];
                    int var10 = class302.field4242[arg3];
                    int var11 = this.field823[var8] * var10 + this.field762[var8] * var9 + 16383 >> 14;
                    this.field762[var8] = this.field762[var8] * var10 + 16383 - this.field823[var8] * var9 >> 14;
                    this.field823[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class302.field4241[arg1];
                    int var13 = class302.field4242[arg1];
                    int var14 = this.field762[var8] * var13 + 16383 - (this.field743[var8] * var12) >> 14;
                    this.field743[var8] = this.field762[var8] * var12 - (-(this.field743[var8] * var13) - 16383) >> 14;
                    this.field762[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class302.field4241[arg2];
                    int var16 = class302.field4242[arg2];
                    int var17 = this.field823[var8] * var16 + this.field743[var8] * var15 + 16383 >> 14;
                    this.field743[var8] = this.field743[var8] * var16 + 16383 - this.field823[var8] * var15 >> 14;
                    this.field823[var8] = var17;
                }
                this.field823[var8] += class43.field578;
                this.field762[var8] += class84.field1273;
                this.field743[var8] += class88.field1302;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field763; var18++) {
                this.field823[var18] -= class43.field578;
                this.field762[var18] -= class84.field1273;
                this.field743[var18] -= class88.field1302;
                this.field823[var18] = this.field823[var18] * arg1 / 128;
                this.field762[var18] = this.field762[var18] * arg2 / 128;
                this.field743[var18] = this.field743[var18] * arg3 / 128;
                this.field823[var18] += class43.field578;
                this.field762[var18] += class84.field1273;
                this.field743[var18] += class88.field1302;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field793; var19++) {
                int var23 = (this.field729[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field729[var19] = (byte) var23;
            }
            if (this.field775 != null) {
                this.field775.field1100 = null;
            }
            if (this.field836 != null) {
                for (int var20 = 0; var20 < this.field752; var20++) {
                    class665 var21 = this.field836[var20];
                    class39 var22 = this.field821[var20];
                    var22.field530 = var22.field530 & 0xFFFFFF | 255 - (this.field729[var21.field9354] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field793; var24++) {
                int var28 = this.field788[var24] & 0xFFFF;
                int var29 = (var28 & 0xFE71) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var29 + arg1 & 0x3F;
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
                this.field788[var24] = (short) class460.method2676(class460.method2676(var31 << 10, var33 << 7), var34);
            }
            if (this.field775 != null) {
                this.field775.field1100 = null;
            }
            if (this.field836 != null) {
                for (int var25 = 0; var25 < this.field752; var25++) {
                    class665 var26 = this.field836[var25];
                    class39 var27 = this.field821[var25];
                    var27.field530 = class531.field7839[this.field788[var26.field9354] & 0xFFFF] & 0xFFFFFF | var27.field530 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field752; var35++) {
                class39 var36 = this.field821[var35];
                var36.field537 += arg1;
                var36.field531 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field752; var37++) {
                class39 var38 = this.field821[var37];
                var38.field539 = var38.field539 * arg2 >> 7;
                var38.field535 = var38.field535 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field752; var39++) {
                class39 var40 = this.field821[var39];
                var40.field529 = var40.field529 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method466(class397 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field733++;
        class56 var6 = (class56) arg0;
        if (this.field793 == 0 || var6.field793 == 0) {
            return;
        }
        int var7 = var6.field763;
        int[] var8 = var6.field823;
        int[] var9 = var6.field762;
        int[] var10 = var6.field743;
        short[] var11 = var6.field749;
        short[] var12 = var6.field723;
        short[] var13 = var6.field744;
        byte[] var14 = var6.field778;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field822 == null) {
            var17 = null;
            var16 = null;
            var18 = null;
            var15 = null;
        } else {
            var15 = this.field822.field8731;
            var16 = this.field822.field8734;
            var17 = this.field822.field8730;
            var18 = this.field822.field8729;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field822 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field822.field8734;
            var22 = var6.field822.field8730;
            var19 = var6.field822.field8731;
            var21 = var6.field822.field8729;
        }
        int[] var23 = var6.field734;
        short[] var24 = var6.field740;
        if (!var6.field831) {
            var6.method428(true);
        }
        short var25 = var6.field782;
        short var26 = var6.field761;
        short var27 = var6.field755;
        short var28 = var6.field794;
        short var29 = var6.field717;
        short var30 = var6.field737;
        for (int var31 = 0; var31 < this.field763; var31++) {
            int var32 = this.field762[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field823[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field743[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field734[var31];
                        int var37 = this.field734[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field740[var38] - 1;
                            if (var35 == -1 || this.field778[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = var23[var39 + 1];
                                    int var42 = -1;
                                    for (int var43 = var40; var43 < var41; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var15 == null) {
                                            this.field822 = new class607();
                                            var15 = this.field822.field8731 = class371.method2218(this.field749, (byte) 127);
                                            var16 = this.field822.field8734 = class371.method2218(this.field723, (byte) 120);
                                            var17 = this.field822.field8730 = class371.method2218(this.field744, (byte) 113);
                                            var18 = this.field822.field8729 = class342.method2054(this.field778, (byte) -115);
                                        }
                                        if (var19 == null) {
                                            class607 var44 = var6.field822 = new class607();
                                            var19 = var44.field8731 = class371.method2218(var11, (byte) 126);
                                            var20 = var44.field8734 = class371.method2218(var12, (byte) 116);
                                            var22 = var44.field8730 = class371.method2218(var13, (byte) 121);
                                            var21 = var44.field8729 = class342.method2054(var14, (byte) -115);
                                        }
                                        short var45 = this.field749[var35];
                                        short var46 = this.field723[var35];
                                        short var47 = this.field744[var35];
                                        int var48 = var23[var39 + 1];
                                        int var49 = var23[var39];
                                        byte var50 = this.field778[var35];
                                        for (int var51 = var49; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var50;
                                            }
                                        }
                                        short var53 = var12[var42];
                                        byte var54 = var14[var42];
                                        int var55 = this.field734[var31 + 1];
                                        short var56 = var13[var42];
                                        int var57 = this.field734[var31];
                                        short var58 = var11[var42];
                                        for (int var59 = var57; var59 < var55; var59++) {
                                            int var60 = this.field740[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var58;
                                                var16[var60] += var53;
                                                var17[var60] += var56;
                                                var18[var60] += var54;
                                            }
                                        }
                                        if (this.field735 == null && this.field775 != null) {
                                            this.field775.field1100 = null;
                                        }
                                        if (this.field735 != null) {
                                            this.field735.field1100 = null;
                                        }
                                        if (var6.field735 == null && var6.field775 != null) {
                                            var6.field775.field1100 = null;
                                        }
                                        if (var6.field735 != null) {
                                            var6.field735.field1100 = null;
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BZ)V")
    private final void method467(byte arg0, boolean arg1) {
        if (arg0 != 75) {
            this.method446();
        }
        field753++;
        boolean var3 = this.field775 != null && this.field775.field1100 == null;
        boolean var4 = this.field735 != null && this.field735.field1100 == null;
        boolean var5 = this.field779 != null && this.field779.field1100 == null;
        boolean var6 = this.field801 != null && this.field801.field1100 == null;
        if (arg1) {
            var6 &= (this.field832 & 0x8) != 0;
            var4 &= (this.field832 & 0x4) != 0;
            var3 &= (this.field832 & 0x2) != 0;
            var5 &= (this.field832 & 0x1) != 0;
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
        if (this.field816.field5537.field6719.length < this.field813 * var7) {
            this.field816.field5537 = new class351((this.field813 + 100) * var7);
        } else {
            this.field816.field5537.field6710 = 0;
        }
        class351 var12 = this.field816.field5537;
        if (var5) {
            if (this.field816.field5558) {
                for (int var21 = 0; var21 < this.field763; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field823[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field762[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field743[var21]);
                    int var25 = this.field734[var21];
                    int var26 = this.field734[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field740[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field6710 = var7 * var28;
                        var12.method2733(false, var22);
                        var12.method2733(false, var23);
                        var12.method2733(false, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field763; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field823[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field762[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field743[var13]);
                    int var17 = this.field734[var13];
                    int var18 = this.field734[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field740[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field6710 = var7 * var20;
                        var12.method2729(var14, (byte) -119);
                        var12.method2729(var15, (byte) 122);
                        var12.method2729(var16, (byte) 48);
                    }
                }
            }
        }
        if (var3) {
            if (this.field735 == null) {
                short[] var31;
                byte[] var32;
                short[] var33;
                short[] var34;
                if (this.field822 == null) {
                    var32 = this.field778;
                    var33 = this.field749;
                    var31 = this.field723;
                    var34 = this.field744;
                } else {
                    var31 = this.field822.field8734;
                    var32 = this.field822.field8729;
                    var33 = this.field822.field8731;
                    var34 = this.field822.field8730;
                }
                float var35 = this.field816.field5596[0];
                float var36 = this.field816.field5596[1];
                float var37 = this.field816.field5596[2];
                float var38 = this.field816.field5499;
                float var39 = this.field816.field5580 * 768.0F / (float) this.field810;
                float var40 = this.field816.field5566 * 768.0F / (float) this.field810;
                for (int var41 = 0; var41 < this.field793; var41++) {
                    int var42 = this.method429(this.field788[var41], 127, this.field729[var41], this.field804, this.field720[var41]);
                    float var43 = (float) ((var42 & 0xFF5A86) >> 16) * this.field816.field5547;
                    float var44 = (float) (var42 >>> 24) * this.field816.field5588;
                    short var45 = this.field797[var41];
                    float var46 = (float) ((var42 & 0xFFF4) >> 8) * this.field816.field5504;
                    short var47 = (short) var32[var45];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var34[var45] * var37 + (float) var31[var45] * var36 + (float) var33[var45] * var35) * 0.0026041667F;
                    } else {
                        var48 = ((float) var34[var45] * var37 + (float) var31[var45] * var36 + (float) var33[var45] * var35) / (float) (var47 * 256);
                    }
                    float var49 = var38 + var48 * (var48 < 0.0F ? var40 : var39);
                    int var50 = (int) (var44 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var43 * var49);
                    int var52 = (int) (var46 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    var12.field6710 = var7 * var45 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method2753((byte) 87, var50);
                    var12.method2753((byte) 74, var51);
                    var12.method2753((byte) 111, var52);
                    var12.method2753((byte) 120, 255 - (this.field729[var41] & 0xFF));
                    short var53 = this.field750[var41];
                    short var54 = (short) var32[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var33[var53] * var35) * 0.0026041667F;
                    } else {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var33[var53] * var35) / (float) (var54 * 256);
                    }
                    float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                    int var57 = (int) (var44 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var43 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var46 * var56);
                    var12.field6710 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method2753((byte) 113, var57);
                    var12.method2753((byte) 104, var58);
                    var12.method2753((byte) 51, var59);
                    var12.method2753((byte) 64, 255 - (this.field729[var41] & 0xFF));
                    short var60 = this.field838[var41];
                    short var61 = (short) var32[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var33[var60] * var35) * 0.0026041667F;
                    } else {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var33[var60] * var35) / (float) (var61 * 256);
                    }
                    float var63 = var62 * ((var62 < 0.0F) ? var40 : var39) + var38;
                    int var64 = (int) (var44 * var63);
                    int var65 = (int) (var43 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var46 * var63);
                    var12.field6710 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method2753((byte) 63, var64);
                    var12.method2753((byte) 114, var65);
                    var12.method2753((byte) 125, var66);
                    var12.method2753((byte) 89, 255 - (this.field729[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field793; var29++) {
                    int var30 = this.method429(this.field788[var29], 127, this.field729[var29], this.field804, this.field720[var29]);
                    var12.field6710 = this.field797[var29] * var7 + var9;
                    var12.method2733(false, var30);
                    var12.field6710 = this.field750[var29] * var7 + var9;
                    var12.method2733(false, var30);
                    var12.field6710 = this.field838[var29] * var7 + var9;
                    var12.method2733(false, var30);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field822 == null) {
                var67 = this.field723;
                var68 = this.field744;
                var69 = this.field749;
                var70 = this.field778;
            } else {
                var69 = this.field822.field8731;
                var67 = this.field822.field8734;
                var68 = this.field822.field8730;
                var70 = this.field822.field8729;
            }
            float var71 = 3.0F / (float) this.field810;
            var12.field6710 = var10;
            float var72 = 3.0F / (float) (this.field810 / 2 + this.field810);
            if (this.field816.field5558) {
                for (int var73 = 0; var73 < this.field813; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2130((float) var69[var73] * var72, false);
                        var12.method2130((float) var67[var73] * var72, false);
                        var12.method2130((float) var68[var73] * var72, false);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2130((float) var69[var73] * var75, false);
                        var12.method2130((float) var67[var73] * var75, false);
                        var12.method2130((float) var68[var73] * var75, false);
                    }
                    var12.field6710 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field813; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2129(false, (float) var69[var76] * var72);
                        var12.method2129(false, (float) var67[var76] * var72);
                        var12.method2129(false, (float) var68[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2129(false, (float) var69[var76] * var78);
                        var12.method2129(false, (float) var67[var76] * var78);
                        var12.method2129(false, (float) var68[var76] * var78);
                    }
                    var12.field6710 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field6710 = var11;
            if (this.field816.field5558) {
                for (int var79 = 0; var79 < this.field813; var79++) {
                    var12.method2130(this.field800[var79], false);
                    var12.method2130(this.field731[var79], false);
                    var12.field6710 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field813; var80++) {
                    var12.method2129(false, this.field800[var80]);
                    var12.method2129(false, this.field731[var80]);
                    var12.field6710 += var7 - 8;
                }
            }
        }
        var12.field6710 = this.field813 * var7;
        class411 var81;
        if (arg1) {
            if (this.field739 == null) {
                this.field739 = this.field816.method2283((byte) 73, var12.field6719, var7, true, var12.field6710);
            } else {
                this.field739.method2453(var12.field6719, var7, 12500, var12.field6710);
            }
            this.field832 = 0;
            var81 = this.field739;
        } else {
            var81 = this.field816.method2283((byte) 73, var12.field6719, var7, false, var12.field6710);
            this.field770 = true;
        }
        if (var5) {
            this.field779.field1100 = var81;
            this.field779.field1101 = var8;
        }
        if (var6) {
            this.field801.field1100 = var81;
            this.field801.field1101 = var11;
        }
        if (var3) {
            this.field775.field1101 = var9;
            this.field775.field1100 = var81;
        }
        if (var4) {
            this.field735.field1101 = var10;
            this.field735.field1100 = var81;
        }
    }

    @OriginalMember(owner = "client!qb", name = "PA", descriptor = "()I")
    public final int method468() {
        field760++;
        return this.field789;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method469(int arg0, int arg1, class152 arg2, boolean arg3) {
        field790++;
        return this.method459(arg2, arg1, -1, arg3, true, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
    public static final void method470(int arg0, int arg1, int arg2) {
        field806++;
        if (arg1 != -12685) {
            field781 = null;
        }
        class449 var3 = class611.method3463(arg2, (byte) -122, 5);
        var3.method2615((byte) -84);
        var3.field6472 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lq;)V")
    public final void method471(class152 arg0) {
        field721++;
        class286 var2 = (class286) arg0;
        if (this.field798 != null) {
            for (int var3 = 0; var3 < this.field798.length; var3++) {
                class7 var4 = this.field798[var3];
                class7 var5 = var4;
                if (var4.field63 != null) {
                    var5 = var4.field63;
                }
                var5.field71 = (int) ((float) this.field743[var4.field58] * var2.field4015 + (float) this.field823[var4.field58] * var2.field4030 + (float) this.field762[var4.field58] * var2.field4031 + var2.field4004);
                var5.field59 = (int) ((float) this.field743[var4.field58] * var2.field4011 + (float) this.field823[var4.field58] * var2.field4008 + (float) this.field762[var4.field58] * var2.field4024 + var2.field4005);
                var5.field56 = (int) ((float) this.field743[var4.field58] * var2.field4003 + (float) this.field823[var4.field58] * var2.field3996 + (float) this.field762[var4.field58] * var2.field4000 + var2.field4029);
                var5.field57 = (int) ((float) this.field743[var4.field65] * var2.field4015 + (float) this.field823[var4.field65] * var2.field4030 + (float) this.field762[var4.field65] * var2.field4031 + var2.field4004);
                var5.field68 = (int) ((float) this.field743[var4.field65] * var2.field4011 + (float) this.field823[var4.field65] * var2.field4008 + (float) this.field762[var4.field65] * var2.field4024 + var2.field4005);
                var5.field54 = (int) ((float) this.field743[var4.field65] * var2.field4003 + (float) this.field823[var4.field65] * var2.field3996 + (float) this.field762[var4.field65] * var2.field4000 + var2.field4029);
                var5.field60 = (int) ((float) this.field743[var4.field55] * var2.field4015 + (float) this.field823[var4.field55] * var2.field4030 + (float) this.field762[var4.field55] * var2.field4031 + var2.field4004);
                var5.field73 = (int) ((float) this.field743[var4.field55] * var2.field4011 + (float) this.field823[var4.field55] * var2.field4008 + (float) this.field762[var4.field55] * var2.field4024 + var2.field4005);
                var5.field53 = (int) ((float) this.field743[var4.field55] * var2.field4003 + (float) this.field823[var4.field55] * var2.field3996 + (float) this.field762[var4.field55] * var2.field4000 + var2.field4029);
            }
        }
        if (this.field772 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field772.length; var6++) {
            class94 var7 = this.field772[var6];
            class94 var8 = var7;
            if (var7.field1390 != null) {
                var8 = var7.field1390;
            }
            if (var7.field1394 == null) {
                var7.field1394 = var2.method180();
            } else {
                var7.field1394.method163(var2);
            }
            var8.field1396 = (int) ((float) this.field743[var7.field1397] * var2.field4015 + (float) this.field823[var7.field1397] * var2.field4030 + (float) this.field762[var7.field1397] * var2.field4031 + var2.field4004);
            var8.field1389 = (int) ((float) this.field743[var7.field1397] * var2.field4011 + (float) this.field823[var7.field1397] * var2.field4008 + (float) this.field762[var7.field1397] * var2.field4024 + var2.field4005);
            var8.field1391 = (int) ((float) this.field743[var7.field1397] * var2.field4003 + (float) this.field823[var7.field1397] * var2.field3996 + (float) this.field762[var7.field1397] * var2.field4000 + var2.field4029);
        }
    }

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "()Z")
    public final boolean method472() {
        field791++;
        if (this.field829 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field748; var1++) {
            this.field823[var1] <<= 0x4;
            this.field762[var1] <<= 0x4;
            this.field743[var1] <<= 0x4;
        }
        class43.field578 = 0;
        class84.field1273 = 0;
        class88.field1302 = 0;
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)I")
    public static final int method473(int arg0, byte arg1, int arg2) {
        field819++;
        int var3 = class357.method2158(arg0 - 1, arg1 ^ 0x29, arg2 - 1) + class357.method2158(arg0 + 1, -79, arg2 - 1) - (-class357.method2158(arg0 - 1, -104, arg2 + 1) + -class357.method2158(arg0 + 1, -79, arg2 + 1));
        int var4 = class357.method2158(arg0 - 1, -100, arg2) - (-class357.method2158(arg0 + 1, -116, arg2) - class357.method2158(arg0, -67, arg2 - 1) - class357.method2158(arg0, -94, arg2 + 1));
        int var5 = class357.method2158(arg0, -100, arg2);
        return arg1 == -108 ? var5 / 4 + var3 / 16 + var4 / 8 : 91;
    }

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "(I)V")
    public final void method474(int arg0) {
        field809++;
        int var2 = class302.field4241[arg0];
        int var3 = class302.field4242[arg0];
        for (int var4 = 0; var4 < this.field763; var4++) {
            int var5 = this.field823[var4] * var3 + this.field743[var4] * var2 >> 14;
            this.field743[var4] = this.field743[var4] * var3 - this.field823[var4] * var2 >> 14;
            this.field823[var4] = var5;
        }
        if (this.field779 != null) {
            this.field779.field1100 = null;
        }
        this.field831 = false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIZ)Lda;")
    public final class397 method475(byte arg0, int arg1, boolean arg2) {
        field834++;
        class56 var4;
        class56 var5;
        if (arg0 == 1) {
            var4 = this.field816.field5498;
            var5 = this.field816.field5503;
        } else if (arg0 == 2) {
            var5 = this.field816.field5568;
            var4 = this.field816.field5575;
        } else if (arg0 == 3) {
            var5 = this.field816.field5597;
            var4 = this.field816.field5521;
        } else if (arg0 == 4) {
            var5 = this.field816.field5518;
            var4 = this.field816.field5567;
        } else if (arg0 == 5) {
            var4 = this.field816.field5530;
            var5 = this.field816.field5573;
        } else {
            var4 = var5 = new class56(this.field816);
        }
        return this.method481(arg1, (byte) -54, arg2, var4, arg0 != 0, var5);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JIIFFLcr;IIII)S")
    private final short method476(long arg0, int arg1, int arg2, float arg3, float arg4, class163 arg5, int arg6, int arg7, int arg8, int arg9) {
        field817++;
        int var12 = this.field734[arg7];
        int var13 = this.field734[arg7 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field740[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class121.field1979[var15] == arg0) {
                return (short) (var16 - 1);
            }
        }
        this.field740[var14] = (short) (this.field813 + 1);
        class121.field1979[var14] = arg0;
        if (arg9 > -110) {
            this.method483(null);
        }
        this.field749[this.field813] = (short) arg1;
        this.field723[this.field813] = (short) arg8;
        this.field744[this.field813] = (short) arg6;
        this.field778[this.field813] = (byte) arg2;
        this.field800[this.field813] = arg4;
        this.field731[this.field813] = arg3;
        return (short) (this.field813++);
    }

    @OriginalMember(owner = "client!qb", name = "na", descriptor = "()I")
    public final int method477() {
        field768++;
        return this.field810;
    }

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "()I")
    public final int method478() {
        field783++;
        if (!this.field831) {
            this.method428(true);
        }
        return this.field782;
    }

    @OriginalMember(owner = "client!qb", name = "DA", descriptor = "(SS)V")
    public final void method479(short arg0, short arg1) {
        field718++;
        class615 var3 = this.field816.field1459;
        for (int var4 = 0; var4 < this.field793; var4++) {
            if (this.field720[var4] == arg0) {
                this.field720[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class377 var7 = var3.method2359(-124, arg0 & 0xFFFF);
            var5 = var7.field5227;
            var6 = var7.field5233;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class377 var10 = var3.method2359(-128, arg1 & 0xFFFF);
            var8 = var10.field5227;
            var9 = var10.field5233;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field836 != null) {
            for (int var11 = 0; var11 < this.field752; var11++) {
                class665 var12 = this.field836[var11];
                class39 var13 = this.field821[var11];
                var13.field530 = var13.field530 & 0xFF000000 | class531.field7839[this.field788[var12.field9354] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field775 != null) {
            this.field775.field1100 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()[Lkw;")
    public final class7[] method480() {
        field833++;
        return this.field798;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBZLqb;ZLqb;)Lda;")
    private final class397 method481(int arg0, byte arg1, boolean arg2, class56 arg3, boolean arg4, class56 arg5) {
        if ((arg0 & 0x100) == 0) {
            arg3.field812 = this.field812;
        } else {
            arg3.field812 = true;
        }
        arg3.field793 = this.field793;
        arg3.field799 = this.field799;
        arg3.field804 = this.field804;
        arg3.field748 = this.field748;
        field785++;
        arg3.field832 = 0;
        arg3.field813 = this.field813;
        arg3.field763 = this.field763;
        arg3.field752 = this.field752;
        arg3.field746 = this.field746;
        arg3.field810 = this.field810;
        arg3.field789 = arg0;
        boolean var7 = class582.method3369(-11610, arg0, this.field799);
        boolean var8 = class374.method2232(this.field799, arg0, true);
        boolean var9 = class383.method2341(-97, this.field799, arg0);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg3.field823 = this.field823;
            } else if (arg5.field823 == null || this.field748 > arg5.field823.length) {
                arg3.field823 = arg5.field823 = new int[this.field748];
            } else {
                arg3.field823 = arg5.field823;
            }
            if (!var8) {
                arg3.field762 = this.field762;
            } else if (arg5.field762 == null || arg5.field762.length < this.field748) {
                arg3.field762 = arg5.field762 = new int[this.field748];
            } else {
                arg3.field762 = arg5.field762;
            }
            if (!var9) {
                arg3.field743 = this.field743;
            } else if (arg5.field743 == null || this.field748 > arg5.field743.length) {
                arg3.field743 = arg5.field743 = new int[this.field748];
            } else {
                arg3.field743 = arg5.field743;
            }
            for (int var11 = 0; var11 < this.field748; var11++) {
                if (var7) {
                    arg3.field823[var11] = this.field823[var11];
                }
                if (var8) {
                    arg3.field762[var11] = this.field762[var11];
                }
                if (var9) {
                    arg3.field743[var11] = this.field743[var11];
                }
            }
        } else {
            arg3.field762 = this.field762;
            arg3.field743 = this.field743;
            arg3.field823 = this.field823;
        }
        if (class250.method1597(this.field799, arg0, 26127)) {
            if (arg4) {
                arg3.field832 = (byte) (arg3.field832 | 0x1);
            }
            arg3.field779 = arg5.field779;
            arg3.field779.field1101 = this.field779.field1101;
            arg3.field779.field1100 = this.field779.field1100;
        } else if (class439.method2565(this.field799, arg0, 28362)) {
            arg3.field779 = this.field779;
        } else {
            arg3.field779 = null;
        }
        if (class156.method1176(this.field799, -1, arg0)) {
            if (arg5.field788 == null || this.field793 > arg5.field788.length) {
                arg3.field788 = arg5.field788 = new short[this.field793];
            } else {
                arg3.field788 = arg5.field788;
            }
            for (int var12 = 0; var12 < this.field793; var12++) {
                arg3.field788[var12] = this.field788[var12];
            }
        } else {
            arg3.field788 = this.field788;
        }
        if (class184.method1323(false, arg0, this.field799)) {
            if (arg5.field729 == null || arg5.field729.length < this.field793) {
                arg3.field729 = arg5.field729 = new byte[this.field793];
            } else {
                arg3.field729 = arg5.field729;
            }
            for (int var13 = 0; var13 < this.field793; var13++) {
                arg3.field729[var13] = this.field729[var13];
            }
        } else {
            arg3.field729 = this.field729;
        }
        if (class229.method1499(this.field799, arg0, 24314)) {
            if (arg4) {
                arg3.field832 = (byte) (arg3.field832 | 0x2);
            }
            arg3.field775 = arg5.field775;
            arg3.field775.field1100 = this.field775.field1100;
            arg3.field775.field1101 = this.field775.field1101;
        } else if (class365.method2189(this.field799, (byte) -27, arg0)) {
            arg3.field775 = this.field775;
        } else {
            arg3.field775 = null;
        }
        if (class425.method2499(arg0, this.field799, (byte) 93)) {
            if (arg5.field749 == null || this.field813 > arg5.field749.length) {
                int var14 = this.field813;
                arg3.field744 = arg5.field744 = new short[var14];
                arg3.field749 = arg5.field749 = new short[var14];
                arg3.field723 = arg5.field723 = new short[var14];
            } else {
                arg3.field744 = arg5.field744;
                arg3.field749 = arg5.field749;
                arg3.field723 = arg5.field723;
            }
            if (this.field822 == null) {
                for (int var15 = 0; var15 < this.field813; var15++) {
                    arg3.field749[var15] = this.field749[var15];
                    arg3.field723[var15] = this.field723[var15];
                    arg3.field744[var15] = this.field744[var15];
                }
            } else {
                if (arg5.field822 == null) {
                    arg5.field822 = new class607();
                }
                class607 var16 = arg3.field822 = arg5.field822;
                if (var16.field8731 == null || this.field813 > var16.field8731.length) {
                    int var17 = this.field813;
                    var16.field8730 = new short[var17];
                    var16.field8734 = new short[var17];
                    var16.field8731 = new short[var17];
                    var16.field8729 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field813; var18++) {
                    arg3.field749[var18] = this.field749[var18];
                    arg3.field723[var18] = this.field723[var18];
                    arg3.field744[var18] = this.field744[var18];
                    var16.field8731[var18] = this.field822.field8731[var18];
                    var16.field8734[var18] = this.field822.field8734[var18];
                    var16.field8730[var18] = this.field822.field8730[var18];
                    var16.field8729[var18] = this.field822.field8729[var18];
                }
            }
            arg3.field778 = this.field778;
        } else {
            arg3.field749 = this.field749;
            arg3.field723 = this.field723;
            arg3.field744 = this.field744;
            arg3.field778 = this.field778;
            arg3.field822 = this.field822;
        }
        if (arg1 >= -44) {
            this.field823 = null;
        }
        if (class662.method3722(arg0, 11322, this.field799)) {
            arg3.field735 = arg5.field735;
            if (arg4) {
                arg3.field832 = (byte) (arg3.field832 | 0x4);
            }
            arg3.field735.field1101 = this.field735.field1101;
            arg3.field735.field1100 = this.field735.field1100;
        } else if (class460.method2675(this.field799, arg0, 0)) {
            arg3.field735 = this.field735;
        } else {
            arg3.field735 = null;
        }
        if (class91.method675(arg0, this.field799, false)) {
            if (arg5.field800 == null || this.field793 > arg5.field800.length) {
                int var19 = this.field813;
                arg3.field800 = arg5.field800 = new float[var19];
                arg3.field731 = arg5.field731 = new float[var19];
            } else {
                arg3.field800 = arg5.field800;
                arg3.field731 = arg5.field731;
            }
            for (int var20 = 0; var20 < this.field813; var20++) {
                arg3.field800[var20] = this.field800[var20];
                arg3.field731[var20] = this.field731[var20];
            }
        } else {
            arg3.field800 = this.field800;
            arg3.field731 = this.field731;
        }
        if (class18.method199(arg0, 27137, this.field799)) {
            if (arg4) {
                arg3.field832 = (byte) (arg3.field832 | 0x8);
            }
            arg3.field801 = arg5.field801;
            arg3.field801.field1101 = this.field801.field1101;
            arg3.field801.field1100 = this.field801.field1100;
        } else if (class679.method3843(this.field799, -1, arg0)) {
            arg3.field801 = this.field801;
        } else {
            arg3.field801 = null;
        }
        if (class491.method2880(-74, arg0, this.field799)) {
            if (arg5.field797 == null || this.field793 > arg5.field797.length) {
                int var21 = this.field793;
                arg3.field750 = arg5.field750 = new short[var21];
                arg3.field838 = arg5.field838 = new short[var21];
                arg3.field797 = arg5.field797 = new short[var21];
            } else {
                arg3.field797 = arg5.field797;
                arg3.field838 = arg5.field838;
                arg3.field750 = arg5.field750;
            }
            for (int var22 = 0; var22 < this.field793; var22++) {
                arg3.field797[var22] = this.field797[var22];
                arg3.field750[var22] = this.field750[var22];
                arg3.field838[var22] = this.field838[var22];
            }
        } else {
            arg3.field797 = this.field797;
            arg3.field838 = this.field838;
            arg3.field750 = this.field750;
        }
        if (class70.method574(false, this.field799, arg0)) {
            arg3.field732 = arg5.field732;
            if (arg4) {
                arg3.field832 = (byte) (arg3.field832 | 0x10);
            }
            arg3.field732.field9761 = this.field732.field9761;
        } else if (class577.method3342((byte) -83, arg0, this.field799)) {
            arg3.field732 = this.field732;
        } else {
            arg3.field732 = null;
        }
        if (class562.method3288((byte) -85, arg0, this.field799)) {
            if (arg5.field720 == null || this.field793 > arg5.field720.length) {
                int var23 = this.field793;
                arg3.field720 = arg5.field720 = new short[var23];
            } else {
                arg3.field720 = arg5.field720;
            }
            for (int var24 = 0; var24 < this.field793; var24++) {
                arg3.field720[var24] = this.field720[var24];
            }
        } else {
            arg3.field720 = this.field720;
        }
        if (!class76.method603(126, arg0, this.field799)) {
            arg3.field821 = this.field821;
        } else if (arg5.field821 == null || arg5.field821.length < this.field752) {
            int var26 = this.field752;
            arg3.field821 = arg5.field821 = new class39[var26];
            for (int var27 = 0; var27 < this.field752; var27++) {
                arg3.field821[var27] = this.field821[var27].method328((byte) 98);
            }
        } else {
            arg3.field821 = arg5.field821;
            for (int var25 = 0; var25 < this.field752; var25++) {
                arg3.field821[var25].method326(this.field821[var25], 1);
            }
        }
        arg3.field740 = this.field740;
        arg3.field734 = this.field734;
        arg3.field798 = this.field798;
        arg3.field772 = this.field772;
        arg3.field828 = this.field828;
        arg3.field829 = this.field829;
        if (this.field831) {
            arg3.field792 = this.field792;
            arg3.field831 = true;
            arg3.field717 = this.field717;
            arg3.field737 = this.field737;
            arg3.field782 = this.field782;
            arg3.field761 = this.field761;
            arg3.field745 = this.field745;
            arg3.field755 = this.field755;
            arg3.field794 = this.field794;
        } else {
            arg3.field831 = false;
        }
        arg3.field773 = this.field773;
        arg3.field780 = this.field780;
        arg3.field820 = this.field820;
        arg3.field836 = this.field836;
        arg3.field741 = this.field741;
        return arg3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method482(int arg0, int arg1, class152 arg2, boolean arg3, int arg4) {
        field725++;
        return this.method459(arg2, arg1, arg4, arg3, true, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "(Lha;)Lha;")
    public final class427 method483(class427 arg0) {
        field824++;
        if (this.field813 == 0) {
            return null;
        }
        if (!this.field831) {
            this.method428(true);
        }
        int var2;
        int var3;
        if (this.field816.field5578 > 0) {
            var2 = this.field755 - (this.field816.field5578 * this.field761 >> 8) >> this.field816.field5457;
            var3 = this.field794 - (this.field816.field5578 * this.field782 >> 8) >> this.field816.field5457;
        } else {
            var2 = this.field755 - (this.field816.field5578 * this.field782 >> 8) >> this.field816.field5457;
            var3 = this.field794 - (this.field816.field5578 * this.field761 >> 8) >> this.field816.field5457;
        }
        int var4;
        int var5;
        if (this.field816.field5594 > 0) {
            var4 = this.field717 - (this.field816.field5594 * this.field761 >> 8) >> this.field816.field5457;
            var5 = this.field737 - (this.field816.field5594 * this.field782 >> 8) >> this.field816.field5457;
        } else {
            var4 = this.field717 - (this.field816.field5594 * this.field782 >> 8) >> this.field816.field5457;
            var5 = this.field737 - (this.field816.field5594 * this.field761 >> 8) >> this.field816.field5457;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class134 var8 = (class134) arg0;
        class134 var9;
        if (var8 != null && var8.method1029(-128, var6, var7)) {
            var9 = var8;
            var8.method1032(false);
        } else {
            var9 = new class134(this.field816, var6, var7);
        }
        var9.method1033(var5, var4, var2, 118, var3);
        this.method489(true, var9);
        return var9;
    }

    @OriginalMember(owner = "client!qb", name = "ba", descriptor = "(IILi;Li;III)V")
    public final void method484(int arg0, int arg1, class682 arg2, class682 arg3, int arg4, int arg5, int arg6) {
        field802++;
        if (!this.field831) {
            this.method428(true);
        }
        int var8 = this.field755 + arg4;
        int var9 = this.field794 + arg4;
        int var10 = this.field717 + arg6;
        int var11 = this.field737 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field9709 + var9 >> arg2.field9707 >= arg2.field9706 || var10 < 0 || arg2.field9709 + var11 >> arg2.field9707 >= arg2.field9703) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field9706 <= (arg3.field9709 + var9 >> arg3.field9707) || var10 < 0 || arg3.field9709 + var11 >> arg3.field9707 >= arg3.field9703) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field9707;
            int var13 = arg2.field9709 - (1 - var9) >> arg2.field9707;
            int var14 = var10 >> arg2.field9707;
            int var15 = arg2.field9709 + var11 - 1 >> arg2.field9707;
            if (arg5 == arg2.method3858(var14, var12, (byte) 100) && arg2.method3858(var14, var13, (byte) 48) == arg5 && arg5 == arg2.method3858(var15, var12, (byte) 114) && arg2.method3858(var15, var13, (byte) 43) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field763; var32++) {
                this.field762[var32] -= arg5 - arg2.method3861((byte) 83, this.field823[var32] + arg4, this.field743[var32] + arg6);
            }
        } else if (arg0 == 2) {
            short var16 = this.field782;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field763; var17++) {
                int var18 = (this.field762[var17] << 16) / var16;
                if (var18 < arg1) {
                    this.field762[var17] += (arg1 - var18) * (arg2.method3861((byte) 89, this.field823[var17] + arg4, this.field743[var17] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var19 = (arg1 & 0xFF) * 4;
            int var20 = (arg1 >> 8 & 0xFF) * 4;
            int var21 = (arg1 >> 16 & 0xFF) << 6;
            int var22 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var19 >> 1) < 0 || arg2.field9706 << arg2.field9707 <= (var19 >> 1) + (arg4 + arg2.field9709) || (arg6 - (var20 >> 1)) < 0 || (var20 >> 1) + arg6 + arg2.field9709 >= arg2.field9703 << arg2.field9707) {
                return;
            }
            this.method2413(-1, arg2, var20, arg5, var22, var19, arg4, var21, arg6);
        } else if (arg0 == 4) {
            int var30 = this.field761 - this.field782;
            for (int var31 = 0; var31 < this.field763; var31++) {
                this.field762[var31] = var30 + this.field762[var31] + arg3.method3861((byte) -44, this.field823[var31] + arg4, this.field743[var31] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var23 = this.field761 - this.field782;
            for (int var24 = 0; var24 < this.field763; var24++) {
                int var25 = this.field823[var24] + arg4;
                int var26 = this.field743[var24] + arg6;
                int var27 = arg2.method3861((byte) -24, var25, var26);
                int var28 = arg3.method3861((byte) 92, var25, var26);
                int var29 = var27 - var28 - arg1;
                this.field762[var24] = ((this.field762[var24] << 8) / var23 * var29 >> 8) + var27 - arg5;
            }
        }
        if (this.field779 != null) {
            this.field779.field1100 = null;
        }
        this.field831 = false;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()Z")
    public final boolean method485() {
        field826++;
        if (this.field720 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field720.length; var1++) {
            if (this.field720[var1] != -1 && !this.field816.field1459.method2363((byte) -120, this.field720[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "()[Lcea;")
    public final class94[] method486() {
        field754++;
        return this.field772;
    }

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "(I)V")
    public final void method487(int arg0) {
        field719++;
        this.field804 = (short) arg0;
        if (this.field775 != null) {
            this.field775.field1100 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lkfa;)V")
    public class56(class382 arg0) {
        this.field816 = arg0;
        this.field779 = new class70(null, 5126, 3, 0);
        this.field801 = new class70(null, 5126, 2, 0);
        this.field735 = new class70(null, 5126, 3, 0);
        this.field775 = new class70(null, 5121, 4, 0);
        this.field732 = new class688();
    }

    @OriginalMember(owner = "client!qb", name = "fa", descriptor = "(I)V")
    public final void method488(int arg0) {
        field769++;
        int var2 = class302.field4241[arg0];
        int var3 = class302.field4242[arg0];
        for (int var4 = 0; var4 < this.field763; var4++) {
            int var7 = this.field823[var4] * var3 + this.field743[var4] * var2 >> 14;
            this.field743[var4] = this.field743[var4] * var3 - this.field823[var4] * var2 >> 14;
            this.field823[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field813; var5++) {
            int var6 = this.field749[var5] * var3 + this.field744[var5] * var2 >> 14;
            this.field744[var5] = (short) (this.field744[var5] * var3 - (this.field749[var5] * var2) >> 14);
            this.field749[var5] = (short) var6;
        }
        if (this.field735 == null && this.field775 != null) {
            this.field775.field1100 = null;
        }
        if (this.field735 != null) {
            this.field735.field1100 = null;
        }
        if (this.field779 != null) {
            this.field779.field1100 = null;
        }
        this.field831 = false;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lkfa;Lcr;IIII)V")
    public class56(class382 arg0, class163 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field816 = arg0;
        this.field799 = arg5;
        this.field789 = arg2;
        if (class439.method2565(arg5, arg2, 28362)) {
            this.field779 = new class70(null, 5126, 3, 0);
        }
        if (class679.method3843(arg5, -1, arg2)) {
            this.field801 = new class70(null, 5126, 2, 0);
        }
        if (class460.method2675(arg5, arg2, 0)) {
            this.field735 = new class70(null, 5126, 3, 0);
        }
        if (class365.method2189(arg5, (byte) -27, arg2)) {
            this.field775 = new class70(null, 5121, 4, 0);
        }
        if (class577.method3342((byte) -116, arg2, arg5)) {
            this.field732 = new class688();
        }
        class615 var7 = arg0.field1459;
        int[] var8 = new int[arg1.field2709];
        this.field734 = new int[arg1.field2691 + 1];
        for (int var9 = 0; var9 < arg1.field2709; var9++) {
            if ((arg1.field2676 == null || arg1.field2676[var9] != 2) && (arg1.field2667 == null || arg1.field2667[var9] == -1 || !var7.method2359(-127, arg1.field2667[var9] & 0xFFFF).field5218)) {
                var8[this.field793++] = var9;
                this.field734[arg1.field2710[var9]]++;
                this.field734[arg1.field2704[var9]]++;
                this.field734[arg1.field2684[var9]]++;
            }
        }
        this.field746 = this.field793;
        long[] var10 = new long[this.field793];
        boolean var11 = (this.field789 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field793; var12++) {
            int var180 = var8[var12];
            class377 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field2712 != null) {
                boolean var186 = false;
                for (int var187 = 0; var187 < arg1.field2712.length; var187++) {
                    class331 var188 = arg1.field2712[var187];
                    if (var188.field4579 == var180) {
                        class456 var189 = class289.method1780(var188.field4578, (byte) 119);
                        if (var189.field6556) {
                            var186 = true;
                        }
                        if (var189.field6552 != -1) {
                            class377 var190 = var7.method2359(-125, var189.field6552);
                            if (var190.field5225) {
                                this.field812 = true;
                            }
                        }
                    }
                }
                if (var186) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field746--;
                    continue;
                }
            }
            short var191 = -1;
            if (arg1.field2667 != null) {
                var191 = arg1.field2667[var180];
                if (var191 != -1) {
                    var181 = var7.method2359(-128, var191 & 0xFFFF);
                    var184 = var181.field5217;
                    var185 = var181.field5229;
                }
            }
            boolean var192 = arg1.field2701 != null && arg1.field2701[var180] != 0 || var181 != null && !var181.field5219 | var181.field5225;
            if ((var11 || var192) && arg1.field2668 != null) {
                var182 += arg1.field2668[var180] << 17;
            }
            if (var192) {
                var182 += 65536;
            }
            int var193 = (var184 & 0xFF << 8) + var182;
            int var194 = (var185 & 0xFF) + var193;
            int var195 = (var191 & 0xFFFF << 16) + var183;
            int var196 = (var12 & 0xFFFF) + var195;
            var10[var12] = ((long) var194 << 32) + (long) var196;
            this.field812 |= var192;
        }
        class37.method308(var8, var10, -1);
        this.field743 = arg1.field2700;
        this.field823 = arg1.field2666;
        this.field763 = arg1.field2691;
        this.field748 = arg1.field2694;
        this.field780 = arg1.field2685;
        this.field762 = arg1.field2657;
        this.field798 = arg1.field2686;
        this.field772 = arg1.field2682;
        class577[] var13 = new class577[this.field763];
        if (arg1.field2712 != null) {
            this.field752 = arg1.field2712.length;
            this.field821 = new class39[this.field752];
            this.field836 = new class665[this.field752];
            for (int var14 = 0; var14 < this.field752; var14++) {
                class331 var15 = arg1.field2712[var14];
                class456 var16 = class289.method1780(var15.field4578, (byte) -16);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field793; var18++) {
                    if (var8[var18] == var15.field4579) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class531.field7839[arg1.field2680[var15.field4579] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field2701 == null ? 0 : arg1.field2701[var15.field4579]) << 24;
                this.field836[var14] = new class665(var17, arg1.field2710[var15.field4579], arg1.field2704[var15.field4579], arg1.field2684[var15.field4579], var16.field6560, var16.field6559, var16.field6552, var16.field6551, var16.field6555, var16.field6556, var16.field6558, var15.field4585);
                this.field821[var14] = new class39(var20);
            }
        }
        int var21 = this.field793 * 3;
        this.field720 = new short[this.field793];
        this.field749 = new short[var21];
        if (arg1.field2660 != null) {
            this.field741 = new short[this.field793];
        }
        this.field810 = (short) arg4;
        this.field750 = new short[this.field793];
        this.field723 = new short[var21];
        this.field729 = new byte[this.field793];
        this.field800 = new float[var21];
        this.field788 = new short[this.field793];
        this.field797 = new short[this.field793];
        this.field804 = (short) arg3;
        this.field778 = new byte[var21];
        this.field744 = new short[var21];
        this.field838 = new short[this.field793];
        class121.field1979 = new long[var21];
        this.field740 = new short[var21];
        this.field731 = new float[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field2691; var23++) {
            int var179 = this.field734[var23];
            this.field734[var23] = var22;
            var22 += var179;
            var13[var23] = new class577();
        }
        this.field734[arg1.field2691] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field2703 != null) {
            int var28 = arg1.field2688;
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
            for (int var36 = 0; var36 < this.field793; var36++) {
                int var43 = var8[var36];
                if (arg1.field2703[var43] != -1) {
                    int var44 = arg1.field2703[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field2710[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field2704[var43];
                        } else {
                            var46 = arg1.field2684[var43];
                        }
                        int var47 = arg1.field2666[var46];
                        int var48 = arg1.field2657[var46];
                        int var49 = arg1.field2700[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var26 = new int[var28];
            var24 = new int[var28];
            var27 = new float[var28][];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field2671[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field2697[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 <= 0) {
                            var41 = (float) (-var39) / 1024.0F;
                            var40 = 1.0F;
                        } else {
                            var40 = (float) var39 / 1024.0F;
                            var41 = 1.0F;
                        }
                        var42 = 64.0F / (float) arg1.field2669[var37];
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field2697[var37];
                        var40 = 64.0F / (float) arg1.field2707[var37];
                        var42 = 64.0F / (float) arg1.field2669[var37];
                    } else {
                        var42 = (float) arg1.field2669[var37] / 1024.0F;
                        var40 = (float) arg1.field2707[var37] / 1024.0F;
                        var41 = (float) arg1.field2697[var37] / 1024.0F;
                    }
                    var27[var37] = class468.method2764(arg1.field2673[var37], var42, 31233, var41, var40, class248.method1593(255, arg1.field2683[var37]), arg1.field2670[var37], arg1.field2692[var37]);
                }
            }
        }
        class275[] var50 = new class275[arg1.field2709];
        for (int var51 = 0; var51 < arg1.field2709; var51++) {
            short var158 = arg1.field2710[var51];
            short var159 = arg1.field2704[var51];
            short var160 = arg1.field2684[var51];
            int var161 = this.field823[var159] - this.field823[var158];
            int var162 = this.field762[var159] - this.field762[var158];
            int var163 = this.field743[var159] - this.field743[var158];
            int var164 = this.field823[var160] - this.field823[var158];
            int var165 = this.field762[var160] - this.field762[var158];
            int var166 = this.field743[var160] - this.field743[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field2676 == null ? 0 : arg1.field2676[var51];
            if (var174 == 0) {
                class577 var175 = var13[var158];
                var175.field8452 += var171;
                var175.field8453 += var172;
                var175.field8447++;
                var175.field8450 += var173;
                class577 var176 = var13[var159];
                var176.field8453 += var172;
                var176.field8447++;
                var176.field8450 += var173;
                var176.field8452 += var171;
                class577 var177 = var13[var160];
                var177.field8450 += var173;
                var177.field8453 += var172;
                var177.field8447++;
                var177.field8452 += var171;
            } else if (var174 == 1) {
                class275 var178 = var50[var51] = new class275();
                var178.field3912 = var173;
                var178.field3911 = var172;
                var178.field3913 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field793; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field2680[var68] & 0xFFFF;
            short var70;
            if (arg1.field2667 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field2667[var68];
            }
            int var71;
            if (arg1.field2703 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field2703[var68];
            }
            int var72;
            if (arg1.field2701 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field2701[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var78 = 0.0F;
                    var73 = 0.0F;
                    var80 = 2;
                    var77 = 0.0F;
                    var75 = 1.0F;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var79 = 1;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field2671[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field2710[var68];
                        short var84 = arg1.field2704[var68];
                        short var85 = arg1.field2684[var68];
                        short var86 = arg1.field2673[var71];
                        short var87 = arg1.field2670[var71];
                        short var88 = arg1.field2692[var71];
                        float var89 = (float) arg1.field2666[var86];
                        float var90 = (float) arg1.field2657[var86];
                        float var91 = (float) arg1.field2700[var86];
                        float var92 = (float) arg1.field2666[var87] - var89;
                        float var93 = (float) arg1.field2657[var87] - var90;
                        float var94 = (float) arg1.field2700[var87] - var91;
                        float var95 = (float) arg1.field2666[var88] - var89;
                        float var96 = (float) arg1.field2657[var88] - var90;
                        float var97 = (float) arg1.field2700[var88] - var91;
                        float var98 = (float) arg1.field2666[var83] - var89;
                        float var99 = (float) arg1.field2657[var83] - var90;
                        float var100 = (float) arg1.field2700[var83] - var91;
                        float var101 = (float) arg1.field2666[var84] - var89;
                        float var102 = (float) arg1.field2657[var84] - var90;
                        float var103 = (float) arg1.field2700[var84] - var91;
                        float var104 = (float) arg1.field2666[var85] - var89;
                        float var105 = (float) arg1.field2657[var85] - var90;
                        float var106 = (float) arg1.field2700[var85] - var91;
                        float var107 = var93 * var97 - var94 * var96;
                        float var108 = var94 * var95 - (var92 * var97);
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        float var114 = var94 * var107 - (var92 * var109);
                        float var115 = var92 * var108 - var93 * var107;
                        float var116 = var93 * var109 - var94 * var108;
                        float var117 = 1.0F / (var97 * var115 + var95 * var116 + var96 * var114);
                        var74 = (var100 * var115 + var98 * var116 + var99 * var114) * var117;
                        var76 = (var103 * var115 + var101 * var116 + var102 * var114) * var117;
                        var78 = (var106 * var115 + var104 * var116 + var105 * var114) * var117;
                    } else {
                        short var118 = arg1.field2710[var68];
                        short var119 = arg1.field2704[var68];
                        short var120 = arg1.field2684[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field2662[var71];
                        float var126 = (float) arg1.field2674[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field2707[var71] / 1024.0F;
                            class318.method1912(arg1.field2666[var118], var122, var125, var127, arg1.field2700[var118], var126, -17668, var121, arg1.field2657[var118], var123, var124);
                            var73 = class352.field4942;
                            var74 = class656.field9265;
                            class318.method1912(arg1.field2666[var119], var122, var125, var127, arg1.field2700[var119], var126, -17668, var121, arg1.field2657[var119], var123, var124);
                            var75 = class352.field4942;
                            var76 = class656.field9265;
                            class318.method1912(arg1.field2666[var120], var122, var125, var127, arg1.field2700[var120], var126, -17668, var121, arg1.field2657[var120], var123, var124);
                            var77 = class352.field4942;
                            var78 = class656.field9265;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var128 < var75 - var73) {
                                    var79 = 1;
                                    var75 -= var127;
                                } else if (var128 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var127;
                                }
                                if (var77 - var73 > var128) {
                                    var77 -= var127;
                                    var80 = 1;
                                } else if (var73 - var77 > var128) {
                                    var77 += var127;
                                    var80 = 2;
                                }
                            } else {
                                if ((var128 < var76 - var74)) {
                                    var79 = 1;
                                    var76 -= var127;
                                } else if (var74 - var76 > var128) {
                                    var76 += var127;
                                    var79 = 2;
                                }
                                if (var78 - var74 > var128) {
                                    var78 -= var127;
                                    var80 = 1;
                                } else if (var128 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var127;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field2659[var71] / 256.0F;
                            float var130 = (float) arg1.field2699[var71] / 256.0F;
                            int var131 = arg1.field2666[var119] - arg1.field2666[var118];
                            int var132 = arg1.field2657[var119] - arg1.field2657[var118];
                            int var133 = arg1.field2700[var119] - arg1.field2700[var118];
                            int var134 = arg1.field2666[var120] - arg1.field2666[var118];
                            int var135 = arg1.field2657[var120] - arg1.field2657[var118];
                            int var136 = arg1.field2700[var120] - arg1.field2700[var118];
                            int var137 = var132 * var136 - (var133 * var135);
                            int var138 = var133 * var134 - (var131 * var136);
                            int var139 = var131 * var135 - var132 * var134;
                            float var140 = 64.0F / (float) arg1.field2697[var71];
                            float var141 = 64.0F / (float) arg1.field2669[var71];
                            float var142 = 64.0F / (float) arg1.field2707[var71];
                            float var143 = (var124[2] * (float) var139 + var124[1] * (float) var138 + var124[0] * (float) var137) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[4] * (float) var138 + var124[3] * (float) var137) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[6] * (float) var137 + var124[7] * (float) var138) / var142;
                            var81 = class527.method3100(true, var144, var143, var145);
                            class691.method3887(arg1.field2666[var118], var121, var124, var130, var81, var123, arg1.field2700[var118], var122, arg1.field2657[var118], var126, var125, true, var129);
                            var74 = class425.field6072;
                            var73 = class597.field8634;
                            class691.method3887(arg1.field2666[var119], var121, var124, var130, var81, var123, arg1.field2700[var119], var122, arg1.field2657[var119], var126, var125, true, var129);
                            var76 = class425.field6072;
                            var75 = class597.field8634;
                            class691.method3887(arg1.field2666[var120], var121, var124, var130, var81, var123, arg1.field2700[var120], var122, arg1.field2657[var120], var126, var125, true, var129);
                            var78 = class425.field6072;
                            var77 = class597.field8634;
                        } else if (var82 == 3) {
                            class624.method3518(arg1.field2657[var118], var124, 80, var123, arg1.field2700[var118], var121, var126, var122, arg1.field2666[var118], var125);
                            var74 = class624.field8904;
                            var73 = class276.field3918;
                            class624.method3518(arg1.field2657[var119], var124, 93, var123, arg1.field2700[var119], var121, var126, var122, arg1.field2666[var119], var125);
                            var76 = class624.field8904;
                            var75 = class276.field3918;
                            class624.method3518(arg1.field2657[var120], var124, 76, var123, arg1.field2700[var120], var121, var126, var122, arg1.field2666[var120], var125);
                            var77 = class276.field3918;
                            var78 = class624.field8904;
                            if ((var125 & 0x1) == 0) {
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                                if ((var75 - var73 > 0.5F)) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field2676 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field2676[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) + ((long) var72) + (long) (var69 << 8) << 32) + (long) (var71 << 2);
                short var152 = arg1.field2710[var68];
                short var153 = arg1.field2704[var68];
                short var154 = arg1.field2684[var68];
                class577 var155 = var13[var152];
                this.field797[var52] = this.method476(var150, var155.field8453, var155.field8447, var74, var73, arg1, var155.field8452, var152, var155.field8450, -119);
                class577 var156 = var13[var153];
                this.field750[var52] = this.method476((long) var79 + var150, var156.field8453, var156.field8447, var76, var75, arg1, var156.field8452, var153, var156.field8450, -113);
                class577 var157 = var13[var154];
                this.field838[var52] = this.method476((long) var80 + var150, var157.field8453, var157.field8447, var78, var77, arg1, var157.field8452, var154, var157.field8450, -111);
            } else if (var146 == 1) {
                class275 var147 = var50[var68];
                long var148 = (long) ((var147.field3912 + 256 << 12) + ((var71 << 2) - (-(var147.field3911 > 0 ? 1024 : 2048) - (var147.field3913 + 256 << 22)))) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                this.field797[var52] = this.method476(var148, var147.field3911, 0, var74, var73, arg1, var147.field3913, arg1.field2710[var68], var147.field3912, -113);
                this.field750[var52] = this.method476((long) var79 + var148, var147.field3911, 0, var76, var75, arg1, var147.field3913, arg1.field2704[var68], var147.field3912, -123);
                this.field838[var52] = this.method476((long) var80 + var148, var147.field3911, 0, var78, var77, arg1, var147.field3913, arg1.field2684[var68], var147.field3912, -128);
            }
            if (arg1.field2667 == null) {
                this.field720[var52] = -1;
            } else {
                this.field720[var52] = arg1.field2667[var68];
            }
            if (arg1.field2701 != null) {
                this.field729[var52] = arg1.field2701[var68];
            }
            if (arg1.field2660 != null) {
                this.field741[var52] = arg1.field2660[var68];
            }
            this.field788[var52] = arg1.field2680[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field746; var55++) {
            short var67 = this.field720[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field828 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field746; var58++) {
            short var66 = this.field720[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field828[var57++] = var58;
            }
        }
        this.field828[var57] = this.field746;
        class121.field1979 = null;
        this.field749 = class242.method1565(this.field813, this.field749, (byte) -114);
        this.field723 = class242.method1565(this.field813, this.field723, (byte) -114);
        this.field744 = class242.method1565(this.field813, this.field744, (byte) -114);
        this.field778 = class391.method2379(this.field778, this.field813, 125);
        this.field800 = class366.method2198(this.field813, -30895, this.field800);
        this.field731 = class366.method2198(this.field813, -30895, this.field731);
        if (arg1.field2658 != null && class352.method2134(arg2, (byte) -120, this.field799)) {
            this.field829 = arg1.method1237(0, false);
        }
        if (arg1.field2712 != null && class79.method614(this.field799, -43, arg2)) {
            this.field773 = arg1.method1232(0);
        }
        if (arg1.field2672 != null && class520.method3068((byte) -121, arg2, this.field799)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field793; var61++) {
                int var65 = arg1.field2672[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field820 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field820[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field793; var63++) {
                int var64 = arg1.field2672[var8[var63]];
                if (var64 >= 0) {
                    this.field820[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLhk;)V")
    private final void method489(boolean arg0, class134 arg1) {
        field827++;
        if (this.field813 > this.field816.field5608.length) {
            this.field816.field5606 = new int[this.field813];
            this.field816.field5608 = new int[this.field813];
        }
        int[] var3 = this.field816.field5608;
        int[] var4 = this.field816.field5606;
        if (!arg0) {
            return;
        }
        for (int var5 = 0; var5 < this.field763; var5++) {
            int var16 = (this.field823[var5] - (this.field762[var5] * this.field816.field5578 >> 8) >> this.field816.field5457) - arg1.field2161;
            int var17 = (this.field743[var5] - (this.field762[var5] * this.field816.field5594 >> 8) >> this.field816.field5457) - arg1.field2159;
            int var18 = this.field734[var5];
            int var19 = this.field734[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field740[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field746; var6++) {
            if (this.field729 == null || this.field729[var6] <= 128) {
                short var7 = this.field797[var6];
                short var8 = this.field750[var6];
                short var9 = this.field838[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method1030(var14, var15, var10, 1832564272, var13, var12, var11);
                }
            }
        }
    }
}
