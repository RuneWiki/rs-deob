import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 extends class118 {

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public int field2734 = 0;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    private int field2745 = 128;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    private int field2744 = -1;

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
    private int field2753 = -1;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    private int field2743 = -1;

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "I")
    public int field2756 = 0;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "[Lfc;")
    public class39[] field2748 = new class39[] { null, null, class25.field730, null, null };

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "I")
    private int field2754 = -1;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
    public int field2760 = 2000;

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "I")
    private int field2763 = -1;

    @OriginalMember(owner = "client!pe", name = "ub", descriptor = "I")
    private int field2765 = 128;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    private int field2750 = 128;

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "[Lfc;")
    public class39[] field2764 = new class39[] { null, null, null, null, class26.field748 };

    @OriginalMember(owner = "client!pe", name = "Db", descriptor = "I")
    public int field2774 = 1;

    @OriginalMember(owner = "client!pe", name = "Bb", descriptor = "I")
    public int field2772 = -1;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "I")
    private int field2758 = -1;

    @OriginalMember(owner = "client!pe", name = "Fb", descriptor = "I")
    public int field2776 = 0;

    @OriginalMember(owner = "client!pe", name = "Jb", descriptor = "I")
    private int field2780 = -1;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "Z")
    public boolean field2739 = false;

    @OriginalMember(owner = "client!pe", name = "Nb", descriptor = "I")
    public int field2784 = 0;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    private int field2742 = -1;

    @OriginalMember(owner = "client!pe", name = "zb", descriptor = "I")
    private int field2770 = 0;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public int field2749 = 0;

    @OriginalMember(owner = "client!pe", name = "yb", descriptor = "I")
    public int field2769 = -1;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public int field2737 = 0;

    @OriginalMember(owner = "client!pe", name = "Ib", descriptor = "I")
    private int field2779 = -1;

    @OriginalMember(owner = "client!pe", name = "Qb", descriptor = "Lfc;")
    public class39 field2787 = class100.field2473;

    @OriginalMember(owner = "client!pe", name = "Gb", descriptor = "I")
    public int field2777 = 0;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    private int field2746 = -1;

    @OriginalMember(owner = "client!pe", name = "Rb", descriptor = "I")
    public int field2788 = 0;

    @OriginalMember(owner = "client!pe", name = "ec", descriptor = "I")
    private int field2801 = 0;

    @OriginalMember(owner = "client!pe", name = "Hb", descriptor = "I")
    public int field2778 = 0;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "Lp;")
    public static class104 field2733 = new class104(100);

    @OriginalMember(owner = "client!pe", name = "Sb", descriptor = "Lfc;")
    private static class39 field2789 = class90.method774("Please enter your username)3", -90);

    @OriginalMember(owner = "client!pe", name = "Vb", descriptor = "Lfc;")
    private static class39 field2792 = class90.method774("Loaded title screen", -123);

    @OriginalMember(owner = "client!pe", name = "Yb", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!pe", name = "Ub", descriptor = "Lfc;")
    public static class39 field2791 = class90.method774("<col=ff0000>", -104);

    @OriginalMember(owner = "client!pe", name = "Xb", descriptor = "Lfc;")
    public static class39 field2794 = class90.method774("Ladevorgang )2 bitte warten Sie)3", -100);

    @OriginalMember(owner = "client!pe", name = "ac", descriptor = "Lfc;")
    public static class39 field2797 = field2789;

    @OriginalMember(owner = "client!pe", name = "gc", descriptor = "Lfc;")
    public static class39 field2803 = class90.method774("<col=ff3000>", -94);

    @OriginalMember(owner = "client!pe", name = "ic", descriptor = "[I")
    public static int[] field2805 = new int[500];

    @OriginalMember(owner = "client!pe", name = "Zb", descriptor = "Lfc;")
    public static class39 field2796 = class90.method774("mn", -125);

    @OriginalMember(owner = "client!pe", name = "hc", descriptor = "Lfc;")
    public static class39 field2804 = class90.method774("huffman", -109);

    @OriginalMember(owner = "client!pe", name = "jc", descriptor = "Lfc;")
    private static class39 field2806 = class90.method774("flash3:", -114);

    @OriginalMember(owner = "client!pe", name = "Wb", descriptor = "Lfc;")
    public static class39 field2793 = field2806;

    @OriginalMember(owner = "client!pe", name = "cc", descriptor = "Lfc;")
    public static class39 field2799 = class90.method774("oder ung-Ultiges Passwort)3", -95);

    @OriginalMember(owner = "client!pe", name = "kc", descriptor = "Lfc;")
    public static class39 field2807 = field2806;

    @OriginalMember(owner = "client!pe", name = "dc", descriptor = "Lfc;")
    public static class39 field2800 = field2792;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!pe", name = "vb", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!pe", name = "wb", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!pe", name = "xb", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!pe", name = "Ab", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!pe", name = "Cb", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!pe", name = "Kb", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!pe", name = "Lb", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!pe", name = "Mb", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!pe", name = "Ob", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!pe", name = "Pb", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!pe", name = "Tb", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!pe", name = "bc", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!pe", name = "fc", descriptor = "Lrb;")
    public static class120 field2802;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "[I")
    public int[] field2731;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "[I")
    public int[] field2732;

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "[S")
    private short[] field2752;

    @OriginalMember(owner = "client!pe", name = "Eb", descriptor = "[S")
    private short[] field2775;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z", line = 7)
    public final boolean method950(int arg0, boolean arg1) {
        field2738++;
        int var3 = this.field2746;
        int var4 = this.field2753;
        if (arg1) {
            var3 = this.field2780;
            var4 = this.field2758;
        }
        if (var4 == -1) {
            return true;
        } else if (arg0 == 11777) {
            boolean var5 = true;
            if (!class38.field1032.method835((byte) 85, var4, 0)) {
                var5 = false;
            }
            if (var3 != -1 && !class38.field1032.method835((byte) -123, var3, 0)) {
                var5 = false;
            }
            return var5;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)Z", line = 46)
    public static final boolean method951(int arg0, int arg1, byte arg2) {
        field2767++;
        if (arg1 == 0 && class57.field1417 == arg0) {
            return true;
        } else if (arg1 == 1 && class9.field246 == arg0) {
            return true;
        } else if ((arg1 == 2 || arg1 == 3) && class62.field1527 == arg0) {
            return true;
        } else {
            return arg2 != -2;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V", line = 80)
    public static void method952(boolean arg0) {
        if (arg0) {
            field2805 = null;
        }
        field2793 = null;
        field2797 = null;
        field2804 = null;
        field2806 = null;
        field2800 = null;
        field2807 = null;
        field2791 = null;
        field2803 = null;
        field2796 = null;
        field2799 = null;
        field2802 = null;
        field2789 = null;
        field2733 = null;
        field2805 = null;
        field2792 = null;
        field2794 = null;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 105)
    public static final void method953(int arg0) {
        class39.field1065.method390((byte) 108);
        int var1 = class39.field1065.method396(8, (byte) 100);
        field2768++;
        if (var1 < class15.field416) {
            for (int var2 = var1; var2 < class15.field416; var2++) {
                class31.field871[class28.field801++] = class121.field3176[var2];
            }
        }
        if (var1 > class15.field416) {
            throw new RuntimeException("gnpov1");
        }
        class15.field416 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class121.field3176[var3];
            class121 var5 = class118.field3092[var4];
            int var6 = class39.field1065.method396(1, (byte) 119);
            if (var6 == 0) {
                class121.field3176[class15.field416++] = var4;
                var5.field2868 = class70.field1654;
            } else {
                int var7 = class39.field1065.method396(2, (byte) 103);
                if (var7 == 0) {
                    class121.field3176[class15.field416++] = var4;
                    var5.field2868 = class70.field1654;
                    class98.field2328[class68.field1626++] = var4;
                } else if (var7 == 1) {
                    class121.field3176[class15.field416++] = var4;
                    var5.field2868 = class70.field1654;
                    int var8 = class39.field1065.method396(3, (byte) 126);
                    var5.method973((byte) 108, false, var8);
                    int var9 = class39.field1065.method396(1, (byte) 127);
                    if (var9 == 1) {
                        class98.field2328[class68.field1626++] = var4;
                    }
                } else if (var7 == 2) {
                    class121.field3176[class15.field416++] = var4;
                    var5.field2868 = class70.field1654;
                    int var10 = class39.field1065.method396(3, (byte) 105);
                    var5.method973((byte) 123, true, var10);
                    int var11 = class39.field1065.method396(3, (byte) 110);
                    var5.method973((byte) 113, true, var11);
                    int var12 = class39.field1065.method396(1, (byte) 116);
                    if (var12 == 1) {
                        class98.field2328[class68.field1626++] = var4;
                    }
                } else if (var7 == 3) {
                    class31.field871[class28.field801++] = var4;
                }
            }
        }
        if (arg0 != -858993460) {
            field2794 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB)Z", line = 204)
    public final boolean method954(boolean arg0, byte arg1) {
        field2785++;
        int var3 = this.field2779;
        int var4 = this.field2743;
        int var5 = this.field2754;
        if (arg0) {
            var4 = this.field2744;
            var5 = this.field2742;
            var3 = this.field2763;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!class38.field1032.method835((byte) -122, var3, 0)) {
            var6 = false;
        }
        if (var4 != -1 && !class38.field1032.method835((byte) -123, var4, 0)) {
            var6 = false;
        }
        if (var5 != -1 && !class38.field1032.method835((byte) 28, var5, 0)) {
            var6 = false;
        }
        return arg1 > -68 ? true : var6;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I", line = 255)
    public static final int method955(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = arg0 & (var3 >>> 4) + var3;
        field2736++;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILpe;Lpe;)V", line = 278)
    public final void method956(int arg0, class109 arg1, class109 arg2) {
        this.field2751 = arg2.field2751;
        this.field2760 = arg2.field2760;
        this.field2739 = arg1.field2739;
        this.field2752 = arg2.field2752;
        field2747++;
        this.field2788 = arg2.field2788;
        this.field2734 = arg2.field2734;
        this.field2787 = arg1.field2787;
        if (arg0 != 3) {
            return;
        }
        this.field2776 = arg2.field2776;
        this.field2774 = arg1.field2774;
        this.field2749 = arg2.field2749;
        this.field2775 = arg2.field2775;
        this.field2777 = arg2.field2777;
        this.field2778 = 1;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IZ)Lub;", line = 308)
    public final class138 method957(int arg0, boolean arg1) {
        field2766++;
        int var3 = this.field2754;
        int var4 = this.field2779;
        int var5 = this.field2743;
        if (arg1) {
            var3 = this.field2742;
            var4 = this.field2763;
            var5 = this.field2744;
        }
        if (var4 == -1) {
            return null;
        }
        class138 var6 = class138.method1122(class38.field1032, var4, arg0);
        if (var5 != -1) {
            class138 var7 = class138.method1122(class38.field1032, var5, 0);
            if (var3 == -1) {
                class138[] var10 = new class138[] { var6, var7 };
                var6 = new class138(var10, 2);
            } else {
                class138 var8 = class138.method1122(class38.field1032, var3, 0);
                class138[] var9 = new class138[] { var6, var7, var8 };
                var6 = new class138(var9, 3);
            }
        }
        if (!arg1 && this.field2770 != 0) {
            var6.method1132(0, this.field2770, 0);
        }
        if (arg1 && this.field2801 != 0) {
            var6.method1132(0, this.field2801, 0);
        }
        if (this.field2752 != null) {
            for (int var11 = 0; var11 < this.field2752.length; var11++) {
                var6.method1124(this.field2752[var11], this.field2775[var11]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILdc;)V", line = 388)
    private final void method958(int arg0, int arg1, class25 arg2) {
        if (arg0 == 1) {
            this.field2751 = arg2.method301(-4853);
        } else if (arg0 == 2) {
            this.field2787 = arg2.method304(-126);
        } else if (arg0 == 4) {
            this.field2760 = arg2.method301(-4853);
        } else if (arg0 == 5) {
            this.field2777 = arg2.method301(-4853);
        } else if (arg0 == 6) {
            this.field2734 = arg2.method301(-4853);
        } else if (arg0 == 7) {
            this.field2776 = arg2.method301(-4853);
            if (this.field2776 > 32767) {
                this.field2776 -= 65536;
            }
        } else if (arg0 == 8) {
            this.field2749 = arg2.method301(-4853);
            if (this.field2749 > 32767) {
                this.field2749 -= 65536;
            }
        } else if (arg0 == 11) {
            this.field2778 = 1;
        } else if (arg0 == 12) {
            this.field2774 = arg2.method313((byte) 13);
        } else if (arg0 == 16) {
            this.field2739 = true;
        } else if (arg0 == 23) {
            this.field2779 = arg2.method301(-4853);
            this.field2770 = arg2.method322((byte) -50);
        } else if (arg0 == 24) {
            this.field2743 = arg2.method301(-4853);
        } else if (arg0 == 25) {
            this.field2763 = arg2.method301(-4853);
            this.field2801 = arg2.method322((byte) -50);
        } else if (arg0 == 26) {
            this.field2744 = arg2.method301(-4853);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field2748[arg0 - 30] = arg2.method304(-128);
            if (this.field2748[arg0 - 30].method461(class90.field2102, (byte) 82)) {
                this.field2748[arg0 - 30] = null;
            }
        } else if (arg0 >= 35 && arg0 < 40) {
            this.field2764[arg0 - 35] = arg2.method304(-127);
        } else if (arg0 == 40) {
            int var4 = arg2.method322((byte) -50);
            this.field2752 = new short[var4];
            this.field2775 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2752[var5] = (short) arg2.method301(-4853);
                this.field2775[var5] = (short) arg2.method301(-4853);
            }
        } else if (arg0 == 78) {
            this.field2754 = arg2.method301(-4853);
        } else if (arg0 == 79) {
            this.field2742 = arg2.method301(-4853);
        } else if (arg0 == 90) {
            this.field2753 = arg2.method301(-4853);
        } else if (arg0 == 91) {
            this.field2758 = arg2.method301(-4853);
        } else if (arg0 == 92) {
            this.field2746 = arg2.method301(-4853);
        } else if (arg0 == 93) {
            this.field2780 = arg2.method301(-4853);
        } else if (arg0 == 95) {
            this.field2788 = arg2.method301(-4853);
        } else if (arg0 == 97) {
            this.field2769 = arg2.method301(-4853);
        } else if (arg0 == 98) {
            this.field2772 = arg2.method301(-4853);
        } else if (arg0 >= 100 && arg0 < 110) {
            if (this.field2732 == null) {
                this.field2732 = new int[10];
                this.field2731 = new int[10];
            }
            this.field2732[arg0 - 100] = arg2.method301(-4853);
            this.field2731[arg0 - 100] = arg2.method301(-4853);
        } else if (arg0 == 110) {
            this.field2765 = arg2.method301(-4853);
        } else if (arg0 == 111) {
            this.field2750 = arg2.method301(-4853);
        } else if (arg0 == 112) {
            this.field2745 = arg2.method301(-4853);
        } else if (arg0 == 113) {
            this.field2784 = arg2.method293(-111);
        } else if (arg0 == 114) {
            this.field2737 = arg2.method293(-112) * 5;
        } else if (arg0 == 115) {
            this.field2756 = arg2.method322((byte) -50);
        }
        field2759++;
        int var6 = -67 % ((-arg1 - 72) / 32);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 578)
    public final void method959(int arg0) {
        field2757++;
        if (arg0 != 65536) {
            field2790 = 117;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Lub;", line = 596)
    public final class138 method960(byte arg0, int arg1) {
        field2762++;
        if (this.field2732 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (this.field2731[var4] <= arg1 && this.field2731[var4] != 0) {
                    var3 = this.field2732[var4];
                }
            }
            if (var3 != -1) {
                return class37.method421(true, var3).method960((byte) 73, 1);
            }
        }
        class138 var5 = class138.method1122(class38.field1032, this.field2751, 0);
        int var6 = -61 / ((-arg0 - 6) / 60);
        if (var5 == null) {
            return null;
        }
        if (this.field2765 != 128 || this.field2750 != 128 || this.field2745 != 128) {
            var5.method1133(this.field2765, this.field2750, this.field2745);
        }
        if (this.field2752 != null) {
            for (int var7 = 0; var7 < this.field2752.length; var7++) {
                var5.method1124(this.field2752[var7], this.field2775[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V", line = 664)
    public static final void method961(int arg0) {
        field2786++;
        try {
            if (class92.field2152 == 0) {
                if (class115.field3015 != null) {
                    class115.field3015.method1145(5073);
                    class115.field3015 = null;
                }
                class38.field1025 = 0;
                class108.field2715 = null;
                class92.field2152 = 1;
                class28.field804 = false;
            }
            if (class92.field2152 == 1) {
                if (class108.field2715 == null) {
                    class108.field2715 = class83.field1850.method1083(class117.field3078, class60.field1456, 86);
                }
                if (class108.field2715.field1816 == 2) {
                    throw new IOException();
                }
                if (class108.field2715.field1816 == 1) {
                    class115.field3015 = new class139((Socket) class108.field2715.field1820, class83.field1850);
                    class108.field2715 = null;
                    class92.field2152 = 2;
                }
            }
            int var1 = 62 % ((arg0 + 66) / 37);
            if (class92.field2152 == 2) {
                long var2 = class43.field1181 = class93.field2180.method445((byte) 69);
                class79.field1794.field710 = 0;
                class79.field1794.method326(14, (byte) -127);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class79.field1794.method326(var4, (byte) -109);
                class115.field3015.method1140(true, 2, 0, class79.field1794.field711);
                class92.field2152 = 3;
                class39.field1065.field710 = 0;
            }
            if (class92.field2152 == 3) {
                if (client.field570 != null) {
                    client.field570.method1184((byte) -123);
                }
                if (class104.field2630 != null) {
                    class104.field2630.method1184((byte) -120);
                }
                int var5 = class115.field3015.method1143(-125);
                if (client.field570 != null) {
                    client.field570.method1184((byte) 37);
                }
                if (class104.field2630 != null) {
                    class104.field2630.method1184((byte) -114);
                }
                if (var5 != 0) {
                    class55.method576(23292, var5);
                    return;
                }
                class92.field2152 = 4;
                class39.field1065.field710 = 0;
            }
            if (class92.field2152 == 4) {
                if (class39.field1065.field710 < 8) {
                    int var6 = class115.field3015.method1138((byte) -47);
                    if (var6 > 8 - class39.field1065.field710) {
                        var6 = 8 - class39.field1065.field710;
                    }
                    if (var6 > 0) {
                        class115.field3015.method1141(true, class39.field1065.field710, class39.field1065.field711, var6);
                        class39.field1065.field710 += var6;
                    }
                }
                if (class39.field1065.field710 == 8) {
                    class39.field1065.field710 = 0;
                    class42.field1153 = class39.field1065.method319((byte) -81);
                    class92.field2152 = 5;
                }
            }
            if (class92.field2152 == 5) {
                class79.field1794.field710 = 0;
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class42.field1153 >> 32), (int) class42.field1153 };
                class79.field1794.method326(10, (byte) -40);
                class79.field1794.method283(true, var7[0]);
                class79.field1794.method283(true, var7[1]);
                class79.field1794.method283(true, var7[2]);
                class79.field1794.method283(true, var7[3]);
                class79.field1794.method283(true, class83.field1850.field3360);
                class79.field1794.method290(class93.field2180.method445((byte) 69), (byte) -43);
                class79.field1794.method287(class93.field2174, false);
                class79.field1794.method323(class139.field3509, class12.field318, -81);
                class94.field2193.field710 = 0;
                if (class56.field1409 == 40) {
                    class94.field2193.method326(18, (byte) -23);
                } else {
                    class94.field2193.method326(16, (byte) -49);
                }
                class94.field2193.method326(class79.field1794.field710 + 69, (byte) -35);
                class94.field2193.method283(true, 458);
                class94.field2193.method326(class74.field1705 ? 1 : 0, (byte) -30);
                class94.field2193.method283(true, class43.field1182.field2491);
                class94.field2193.method283(true, class78.field1779.field2491);
                class94.field2193.method283(true, class57.field1416.field2491);
                class94.field2193.method283(true, class83.field1844.field2491);
                class94.field2193.method283(true, class53.field1333.field2491);
                class94.field2193.method283(true, client.field557.field2491);
                class94.field2193.method283(true, class57.field1418.field2491);
                class94.field2193.method283(true, class111.field2879.field2491);
                class94.field2193.method283(true, class128.field3272.field2491);
                class94.field2193.method283(true, class53.field1337.field2491);
                class94.field2193.method283(true, class1.field10.field2491);
                class94.field2193.method283(true, class142.field3580.field2491);
                class94.field2193.method283(true, class28.field818.field2491);
                class94.field2193.method283(true, class131.field3318.field2491);
                class94.field2193.method283(true, class28.field811.field2491);
                class94.field2193.method283(true, class56.field1407.field2491);
                class94.field2193.method312(class79.field1794.field710, 0, -2, class79.field1794.field711);
                class115.field3015.method1140(true, class94.field2193.field710, 0, class94.field2193.field711);
                class79.field1794.method388(var7, 2937);
                for (int var8 = 0; var8 < 4; var8++) {
                    var7[var8] += 50;
                }
                class39.field1065.method388(var7, 2937);
                class92.field2152 = 6;
            }
            if (class92.field2152 == 6 && class115.field3015.method1138((byte) -47) > 0) {
                int var9 = class115.field3015.method1143(-119);
                if (var9 == 21 && class56.field1409 == 20) {
                    class92.field2152 = 7;
                } else if (var9 == 2) {
                    class92.field2152 = 9;
                } else if (var9 == 15 && class56.field1409 == 40) {
                    class87.method740(-17192);
                    return;
                } else if (var9 == 23 && class143.field3601 < 1) {
                    class143.field3601++;
                    class92.field2152 = 0;
                } else {
                    class55.method576(23292, var9);
                    return;
                }
            }
            if (class92.field2152 == 7 && class115.field3015.method1138((byte) -47) > 0) {
                class92.field2156 = class115.field3015.method1143(-127) * 60 + 180;
                class92.field2152 = 8;
            }
            if (class92.field2152 == 8) {
                class38.field1025 = 0;
                class134.method1088(class137.method1111(new class39[] { class86.method734(class92.field2156 / 60, 2218), class88.field2044 }, (byte) 112), class92.field2166, class35.field968, 0);
                if (--class92.field2156 <= 0) {
                    class92.field2152 = 0;
                }
            } else {
                if (class92.field2152 == 9 && class115.field3015.method1138((byte) -47) >= 8) {
                    class5.field178 = class115.field3015.method1143(-117);
                    class100.field2497 = class115.field3015.method1143(-123) == 1;
                    class53.field1323 = class115.field3015.method1143(-127);
                    class53.field1323 <<= 0x8;
                    class53.field1323 += class115.field3015.method1143(-119);
                    class127.field3213 = class115.field3015.method1143(-120);
                    class115.field3015.method1141(true, 0, class39.field1065.field711, 1);
                    class39.field1065.field710 = 0;
                    class43.field1172 = class39.field1065.method394((byte) -122);
                    class115.field3015.method1141(true, 0, class39.field1065.field711, 2);
                    class39.field1065.field710 = 0;
                    class128.field3275 = class39.field1065.method301(-4853);
                    class92.field2152 = 10;
                }
                if (class92.field2152 != 10) {
                    class38.field1025++;
                    if (class38.field1025 > 2000) {
                        if (class143.field3601 < 1) {
                            if (class80.field1812 == class117.field3078) {
                                class117.field3078 = class63.field1543;
                            } else {
                                class117.field3078 = class80.field1812;
                            }
                            class92.field2152 = 0;
                            class143.field3601++;
                        } else {
                            class55.method576(23292, -3);
                        }
                    }
                } else if (class115.field3015.method1138((byte) -47) >= class128.field3275) {
                    class39.field1065.field710 = 0;
                    class115.field3015.method1141(true, 0, class39.field1065.field711, class128.field3275);
                    class82.method692((byte) -49);
                    class68.field1618 = -1;
                    class89.method760(false, -2);
                    class43.field1172 = -1;
                }
            }
        } catch (IOException var10) {
            if (class143.field3601 < 1) {
                if (class80.field1812 == class117.field3078) {
                    class117.field3078 = class63.field1543;
                } else {
                    class117.field3078 = class80.field1812;
                }
                class92.field2152 = 0;
                class143.field3601++;
            } else {
                class55.method576(23292, -2);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)Lpe;", line = 1006)
    public final class109 method962(boolean arg0, int arg1) {
        field2782++;
        if (this.field2732 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (this.field2731[var4] <= arg1 && this.field2731[var4] != 0) {
                    var3 = this.field2732[var4];
                }
            }
            if (var3 != -1) {
                return class37.method421(true, var3);
            }
        }
        return arg0 ? this : null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JI)V", line = 1038)
    public static final void method963(long arg0, int arg1) {
        field2783++;
        if (arg0 == 0L) {
            return;
        }
        if (class57.field1414 >= 100) {
            class28.method346(0, (byte) 95, class115.field3025, class107.field2693);
            return;
        }
        class39 var3 = class27.method345((byte) -54, arg0).method447(-98);
        for (int var4 = 0; var4 < class57.field1414; var4++) {
            if (class79.field1795[var4] == arg0) {
                class28.method346(0, (byte) 116, class137.method1111(new class39[] { var3, class119.field3111 }, (byte) 112), class107.field2693);
                return;
            }
        }
        if (arg1 != 8) {
            field2805 = null;
        }
        for (int var5 = 0; var5 < class92.field2165; var5++) {
            if (class153.field3766[var5] == arg0) {
                class28.method346(0, (byte) 66, class137.method1111(new class39[] { class108.field2722, var3, class99.field2344 }, (byte) -113), class107.field2693);
                return;
            }
        }
        if (var3.method462(-126, class94.field2197.field3575)) {
            return;
        }
        class79.field1795[class57.field1414++] = arg0;
        class104.field2638 = true;
        class79.field1794.method393((byte) -14, 209);
        class88.field2038++;
        class79.field1794.method290(arg0, (byte) -43);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z", line = 1146)
    public static final boolean method964(int arg0, int arg1) {
        field2755++;
        if (arg1 < 32) {
            return false;
        } else if (~arg1 == arg0) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLdc;)V", line = 1168)
    public final void method965(byte arg0, class25 arg1) {
        while (true) {
            int var3 = arg1.method322((byte) -50);
            if (var3 == 0) {
                if (arg0 > -34) {
                    field2790 = -37;
                }
                field2740++;
                return;
            }
            this.method958(var3, -111, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V", line = 1190)
    public static final void method966(int arg0) {
        class4.field121 = true;
        class74.field1705 = true;
        field2773++;
        if (arg0 >= -23) {
            method955(-46, -29);
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)Lda;", line = 1216)
    public final class23 method967(int arg0, int arg1) {
        field2761++;
        if (this.field2732 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field2731[var4] && this.field2731[var4] != 0) {
                    var3 = this.field2732[var4];
                }
            }
            if (var3 != -1) {
                return class37.method421(true, var3).method967(1, 0);
            }
        }
        class23 var5 = (class23) class67.field1605.method931(false, (long) this.field2781);
        if (var5 != null) {
            return var5;
        }
        class138 var6 = class138.method1122(class38.field1032, this.field2751, 0);
        if (var6 == null) {
            return null;
        }
        if (this.field2765 != 128 || this.field2750 != 128 || this.field2745 != 128) {
            var6.method1133(this.field2765, this.field2750, this.field2745);
        }
        if (this.field2752 != null) {
            for (int var7 = 0; var7 < this.field2752.length; var7++) {
                var6.method1124(this.field2752[var7], this.field2775[var7]);
            }
        }
        class23 var8 = var6.method1129(this.field2784 + 64, this.field2737 + 768, -50, -10, -50);
        var8.field606 = true;
        class67.field1605.method934(arg1 + arg1, var8, (long) this.field2781);
        return var8;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZ)Lub;", line = 1278)
    public final class138 method968(boolean arg0, boolean arg1) {
        field2741++;
        int var3 = this.field2753;
        int var4 = this.field2746;
        if (arg1) {
            var4 = this.field2780;
            var3 = this.field2758;
        }
        if (var3 == -1) {
            return null;
        }
        class138 var5 = class138.method1122(class38.field1032, var3, 0);
        if (var4 != -1) {
            class138 var6 = class138.method1122(class38.field1032, var4, 0);
            class138[] var7 = new class138[] { var5, var6 };
            var5 = new class138(var7, 2);
        }
        if (this.field2752 != null) {
            for (int var8 = 0; var8 < this.field2752.length; var8++) {
                var5.method1124(this.field2752[var8], this.field2775[var8]);
            }
        }
        if (!arg0) {
            this.field2742 = 20;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)I", line = 1346)
    public static final int method969(byte arg0, int arg1) {
        field2771++;
        if (arg0 <= 13) {
            field2794 = null;
        }
        return arg1 >> 17 & 0x7;
    }
}
