import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class193 {

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "Z")
    private boolean field2745 = false;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    private int field2757 = -1;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    private int field2747 = -1;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    private int field2765 = -32768;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "Z")
    private boolean field2761 = false;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "I")
    private int field2767;

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "I")
    private int field2772;

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "B")
    private byte field2773;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "B")
    private byte field2748;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "Z")
    private boolean field2781;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field2752 = 0;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    private int field2760;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "I")
    private int field2774;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "Lc;")
    private class121 field2769;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "Lvc;")
    public class206 field2779;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "Lj;")
    private class378 field2770;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Lqp;")
    private class467 field2755;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "[Z")
    private boolean[] field2778;

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lqa;Lpk;IIIIIIZI)V", line = 915)
    public class193(class162 arg0, class132 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field2764 = arg3;
        this.field2780 = arg1.field1866;
        this.field2761 = arg8;
        this.field2759 = arg2;
        this.field2767 = arg7;
        this.field2772 = arg6;
        this.field2773 = (byte) arg5;
        this.field2748 = (byte) arg4;
        this.field2781 = arg0.method485() && arg1.field1891 && !this.field2761;
        if (arg9 != -1) {
            this.field2745 = true;
        }
        this.method1179(arg9, (byte) 68);
    }

    @OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() {
        if (this.field2779 != null) {
            this.field2779.method1248();
        }
        field2768++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1169(int arg0) {
        field2776++;
        class306.field4201.method1270((byte) -117);
        class528.field7770.method2977(1);
        class201.field2873.method1347(4376);
        class82.field1154.method2122((byte) 15);
        class398.field5549.method2810(false);
        class75.field1097.method819((byte) 127);
        class275.field3740.method1490(true);
        class492.field7279.method2225(arg0 + 11573);
        class389.field5456.method1881(1);
        class468.field6847.method1307(arg0 + 40714);
        class20.field211.method2558(25781);
        class414.field6075.method1562(64);
        class436.field6349.method855((byte) -17);
        class169.field2401.method2166(true);
        if (arg0 != -11544) {
            return;
        }
        class284.field3819.method1090(false);
        class56.field771.method1634((byte) -58);
        class504.field7416.method1378(arg0 - 15441);
        class269.field3686.method1507(0);
        class504.field7419.method934(33);
        class94.field1258.method571(false);
        class85.method599((byte) 101);
        class517.method3033(0);
        class215.method1284(arg0 + 8373);
        if (class528.field7773 != class175.field2498) {
            for (int var1 = 0; var1 < class418.field6114.length; var1++) {
                class418.field6114[var1] = null;
            }
            class179.field2530 = 0;
        }
        class266.method1532(-126);
        class292.method1673(false);
        class87.method611(false);
        class123.method814(arg0 ^ 0x2D46);
        class264.method1525(29939);
        class475.field6951.method67(-94);
        class418.field6109.method433();
        class411.field6022.method1323(0);
        class411.method2445(-1);
        class254.field3528.method1420(2);
        class464.field6747.method1420(2);
        class249.field3463.method1420(2);
        class300.field4126.method1420(arg0 ^ 0xFFFFD2EA);
        class266.field3645.method1420(2);
        class241.field3334.method1420(2);
        class252.field3511.method1420(arg0 + 11546);
        class86.field1188.method1420(2);
        class192.field2735.method1420(2);
        class148.field2095.method1420(2);
        class364.field5047.method1420(arg0 + 11546);
        client.field2802.method1420(2);
        class348.field4773.method1420(2);
        class103.field1412.method1420(2);
        class63.field872.method1420(2);
        class528.field7767.method1420(2);
        class370.field5195.method1420(2);
        class288.field3883.method1420(2);
        class430.field6268.method1420(2);
        class435.field6343.method1420(2);
        class204.field2893.method1420(arg0 + 11546);
        class1.field16.method1420(arg0 + 11546);
        class156.field2225.method1420(2);
        class87.field1193.method1420(2);
        class274.field3727.method1420(2);
        class418.field6120.method1420(2);
        class322.field4448.method1420(2);
        class104.field1415.method1420(2);
        class261.field3593.method1420(2);
        class91.field1226.method1420(2);
        class131.field1810.method67(-112);
        class119.field1622.method67(-103);
        class183.field2559.method67(arg0 ^ 0x2D60);
        class140.field1992.method67(arg0 ^ 0x2D6D);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZ)V", line = 138)
    public final void method1170(int arg0, boolean arg1) {
        this.field2745 = arg1;
        field2743++;
        this.method1179(arg0, (byte) 68);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZI)Z", line = 147)
    public static final boolean method1171(int arg0, boolean arg1, int arg2) {
        field2771++;
        if (arg1) {
            return true;
        } else {
            return (arg2 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)I", line = 158)
    public final int method1172(int arg0) {
        if (arg0 != 0) {
            field2754 = 78;
        }
        field2775++;
        return this.field2765;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILqa;Lc;ZIII)V", line = 171)
    public final void method1173(int arg0, int arg1, class162 arg2, class121 arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 22869) {
            this.field2759 = 78;
        }
        field2751++;
        class304[] var9 = arg3.method770();
        class456[] var10 = arg3.method789();
        if ((this.field2779 == null || this.field2779.field2913) && (var9 != null || var10 != null)) {
            class132 var11 = class82.field1154.method2121(this.field2780, true);
            if (var11.field1814 != null) {
                var11 = var11.method870(0, class453.field6623);
            }
            if (var11 != null) {
                this.field2779 = new class206(class393.field5484);
            }
        }
        if (this.field2779 == null) {
            return;
        }
        if (arg4) {
            this.field2779.method1249(arg2, (long) class393.field5484, var9, var10, false);
        } else {
            this.field2779.method1257((long) class393.field5484);
        }
        this.field2779.method1255(this.field2748, arg5, arg1, arg6, arg7);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(CB)C", line = 221)
    public static final char method1174(char arg0, byte arg1) {
        field2744++;
        if (arg1 != 28) {
            return '\r';
        } else if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZIIILqa;Z)Lc;", line = 619)
    public final class121 method1175(int arg0, boolean arg1, int arg2, int arg3, int arg4, class162 arg5, boolean arg6) {
        field2762++;
        class132 var8 = class82.field1154.method2121(this.field2780, true);
        if (var8.field1814 != null) {
            var8 = var8.method870(0, class453.field6623);
        }
        if (var8 == null) {
            this.method1177(arg5, -29962);
            this.field2757 = -1;
            this.field2747 = this.field2760;
            return null;
        }
        if (!this.field2745 && this.field2757 != var8.field1866) {
            this.field2769 = null;
            this.method1179(-1, (byte) 68);
        }
        this.method1181(arg4, arg2, 384);
        boolean var9 = arg1 & this.field2781 & class437.field6374.method1765(class278.field3761, (byte) -101) != 0;
        boolean var10 = var9 & (this.field2757 != var8.field1866 || (this.field2760 != this.field2747 || this.field2755 != null && (this.field2755.field6830 || class239.field3287) && this.field2774 != this.field2760) && class437.field6374.method1765(class278.field3761, (byte) -101) >= 2);
        if (arg6 && !var10) {
            this.field2757 = var8.field1866;
            this.field2747 = this.field2760;
            return null;
        }
        if (var10) {
            class174.method1075(this.field2770, this.field2773, this.field2772, this.field2767, this.field2778);
        }
        if (arg0 <= 41) {
            this.method1170(48, false);
        }
        class35 var11 = class383.field5391[this.field2773];
        class35 var12;
        if (this.field2761) {
            var12 = class19.field195[0];
        } else {
            var12 = this.field2773 < 3 ? class383.field5391[this.field2773 + 1] : null;
        }
        class121 var13 = null;
        if (this.field2755 != null) {
            if (var10) {
                arg3 |= 0x40000;
            }
            var13 = var8.method871(this.field2755, 92, var11.method232(this.field2772, this.field2767), arg3, arg5, this.field2772, this.field2760, this.field2759 == 11 ? 10 : this.field2759, var11, this.field2756, var12, this.field2767, this.field2759 == 11 ? this.field2764 + 4 : this.field2764, this.field2774);
            if (var13 == null) {
                this.field2770 = null;
                this.field2778 = null;
                this.field2765 = 0;
            } else {
                if (var10) {
                    if (this.field2778 == null) {
                        this.field2778 = new boolean[4];
                    }
                    this.field2770 = var13.method785(this.field2770);
                    class114.method731(this.field2770, this.field2773, arg2, arg4, this.field2778);
                }
                this.field2765 = var13.method771();
            }
            this.field2769 = null;
        } else if (this.field2769 != null && (this.field2769.method775() & arg3) == arg3 && this.field2757 == var8.field1866) {
            var13 = this.field2769;
        } else {
            if (this.field2769 != null) {
                arg3 |= this.field2769.method775();
            }
            class60 var14 = var8.method860(this.field2772, var11, var11.method232(this.field2772, this.field2767), this.field2759 == 11 ? 10 : this.field2759, arg5, this.field2759 == 11 ? this.field2764 + 4 : this.field2764, 7, var10, this.field2767, var12, arg3);
            if (var14 == null) {
                this.field2778 = null;
                this.field2769 = null;
                this.field2770 = null;
                this.field2765 = 0;
            } else {
                var13 = var14.field803;
                this.field2769 = var14.field803;
                if (var10) {
                    this.field2770 = var14.field801;
                    this.field2778 = null;
                    class114.method731(this.field2770, this.field2773, arg2, arg4, null);
                }
                this.field2765 = var13.method771();
            }
        }
        this.field2747 = this.field2760;
        this.field2767 = arg4;
        this.field2757 = var8.field1866;
        this.field2772 = arg2;
        return var13;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILqa;)V", line = 745)
    public final void method1176(int arg0, class162 arg1) {
        field2749++;
        this.method1175(42, true, this.field2772, arg0, this.field2767, arg1, true);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lqa;I)V", line = 754)
    public final void method1177(class162 arg0, int arg1) {
        if (this.field2770 != null) {
            class174.method1075(this.field2770, this.field2773, this.field2772, this.field2767, this.field2778);
            this.field2770 = null;
            this.field2778 = null;
        }
        if (arg1 != -29962) {
            this.field2758 = 57;
        }
        field2746++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 775)
    public static final void method1178(String arg0, int arg1) {
        System.out.println("Error: " + class418.method2508(false, "%0a", arg0, "\n"));
        if (arg1 != 98) {
            field2754 = 121;
        }
        field2777++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)V", line = 792)
    private final void method1179(int arg0, byte arg1) {
        if (arg1 != 68) {
            this.field2778 = null;
        }
        field2763++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class132 var5 = class82.field1154.method2121(this.field2780, true);
            class132 var6 = var5;
            if (var5.field1814 != null) {
                var5 = var5.method870(arg1 - 68, class453.field6623);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1820 != null) {
                if (this.field2755 != null && var5.method875(this.field2755.field6819, arg1 ^ 0xFFFFFFBB)) {
                    return;
                }
                var3 = var5.method861(arg1 ^ 0xFFFFFFBB);
                if (this.field2757 != var5.field1866) {
                    var4 = var5.field1849;
                }
            } else if (var5.field1819 == -1) {
                if (var6 != null && var6.field1820 != null) {
                    if (this.field2755 != null && var6.method875(this.field2755.field6819, arg1 - 69)) {
                        return;
                    }
                    var3 = var6.method861(-1);
                    if (this.field2757 != var6.field1866) {
                        var4 = var6.field1849;
                    }
                } else if (var6 != null && var6.field1819 != -1 && this.field2757 != var6.field1866) {
                    var3 = var6.field1819;
                    var4 = var6.field1849;
                }
            } else if (this.field2757 != var5.field1866) {
                var3 = var5.field1819;
                var4 = var5.field1849;
            }
        }
        if (var3 == -1) {
            this.field2755 = null;
            return;
        }
        this.field2769 = null;
        if (this.field2755 == null || this.field2755.field6819 != var3) {
            this.field2755 = class275.field3740.method1484(0, var3);
        } else if (this.field2755.field6826 == 0) {
            return;
        }
        if (this.field2755.field6806 == null) {
            this.field2755 = null;
            return;
        }
        if (var4) {
            this.field2760 = (int) ((double) this.field2755.field6806.length * Math.random());
            this.field2756 = (int) (Math.random() * (double) this.field2755.field6829[this.field2760]) + 1;
        } else {
            this.field2760 = 0;
            this.field2756 = 1;
        }
        this.field2774 = this.field2760 + 1;
        if (this.field2774 < 0 || this.field2755.field6806.length <= this.field2774) {
            this.field2774 = -1;
        }
        this.field2758 = class393.field5484 - this.field2756;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z", line = 936)
    public final boolean method1180(boolean arg0) {
        field2753++;
        if (!arg0) {
            this.field2759 = 28;
        }
        return this.field2781;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V", line = 947)
    private final void method1181(int arg0, int arg1, int arg2) {
        if (arg2 != 384) {
            return;
        }
        field2766++;
        label92: while (true) {
            if (this.field2755 == null) {
                if (this.field2745) {
                    return;
                }
                this.method1179(-1, (byte) 68);
                if (this.field2755 == null) {
                    return;
                }
            }
            int var4 = class393.field5484 - this.field2758;
            if (var4 > 100 && this.field2755.field6821 > 0) {
                int var5 = this.field2755.field6806.length - this.field2755.field6821;
                while (this.field2760 < var5 && var4 > this.field2755.field6829[this.field2760]) {
                    var4 -= this.field2755.field6829[this.field2760];
                    this.field2760++;
                }
                if (this.field2760 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2755.field6806.length; var7++) {
                        var6 += this.field2755.field6829[var7];
                    }
                    var4 %= var6;
                }
                this.field2774 = this.field2760 + 1;
                if (this.field2755.field6806.length <= this.field2774) {
                    this.field2774 -= this.field2755.field6821;
                    if (this.field2774 < 0 || this.field2774 >= this.field2755.field6806.length) {
                        this.field2774 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field2755.field6829[this.field2760]) {
                            this.field2758 = class393.field5484 - var4;
                            this.field2756 = var4;
                            return;
                        }
                        class284.method1624(arg0, false, arg1, this.field2755, this.field2760, arg2 - 467, this.field2748);
                        var4 -= this.field2755.field6829[this.field2760];
                        this.field2760++;
                        if (this.field2760 >= this.field2755.field6806.length) {
                            this.field2760 -= this.field2755.field6821;
                            if (this.field2760 < 0 || this.field2755.field6806.length <= this.field2760) {
                                this.field2755 = null;
                                continue label92;
                            }
                        }
                        this.field2774 = this.field2760 + 1;
                    } while (this.field2774 < this.field2755.field6806.length);
                    this.field2774 -= this.field2755.field6821;
                } while (this.field2774 >= 0 && this.field2755.field6806.length > this.field2774);
                this.field2774 = -1;
            }
        }
    }
}
