import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class208 {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field2804 = -1;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Z")
    public boolean field2803 = false;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Z")
    public boolean field2811 = false;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field2806 = 2;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public int field2814 = 99;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public int field2824 = -1;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Z")
    public boolean field2820 = false;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public int field2825 = -1;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public int field2829 = -1;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Z")
    public boolean field2822 = false;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public int field2819 = 5;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public int field2828 = -1;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static volatile int field2809 = 0;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lph;")
    public static class114 field2807 = new class114(4);

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "[C")
    public static char[] field2830 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2832 = "Walk here";

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "S")
    public static short field2833 = 1;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field2835 = 0;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "[[S")
    public static short[][] field2831 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field2834 = new String[100];

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "[I")
    public static int[] field2836 = new int[50];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
    private int[] field2805;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "[I")
    public int[] field2818;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
    public int[] field2823;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "[Z")
    public boolean[] field2827;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "[[I")
    public int[][] field2826;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lam;III)Lpe;", line = 5)
    public static final class390 method1122(class286 arg0, int arg1, int arg2, int arg3) {
        field2812++;
        if (arg2 >= -65) {
            field2832 = null;
        }
        byte[] var4 = arg0.method1687(arg1, arg3, 255);
        return var4 == null ? null : new class390(var4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILtq;)V", line = 21)
    private final void method1123(int arg0, int arg1, class250 arg2) {
        if (arg1 == 1) {
            int var4 = arg2.method1374(-2);
            this.field2818 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2818[var5] = arg2.method1374(-2);
            }
            this.field2823 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2823[var6] = arg2.method1374(-2);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2823[var7] += arg2.method1374(-2) << 16;
            }
        } else if (arg1 == 2) {
            this.field2828 = arg2.method1374(-2);
        } else if (arg1 == 3) {
            this.field2827 = new boolean[256];
            int var15 = arg2.method1350(31351);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field2827[arg2.method1350(31351)] = true;
            }
        } else if (arg1 == 4) {
            this.field2822 = true;
        } else if (arg1 == 5) {
            this.field2819 = arg2.method1350(31351);
        } else if (arg1 == 6) {
            this.field2825 = arg2.method1374(-2);
        } else if (arg1 == 7) {
            this.field2824 = arg2.method1374(-2);
        } else if (arg1 == 8) {
            this.field2814 = arg2.method1350(31351);
        } else if (arg1 == 9) {
            this.field2829 = arg2.method1350(31351);
        } else if (arg1 == 10) {
            this.field2804 = arg2.method1350(31351);
        } else if (arg1 == 11) {
            this.field2806 = arg2.method1350(31351);
        } else if (arg1 == 12) {
            int var12 = arg2.method1350(31351);
            this.field2805 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2805[var13] = arg2.method1374(-2);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field2805[var14] += arg2.method1374(-2) << 16;
            }
        } else if (arg1 == 13) {
            int var8 = arg2.method1374(-2);
            this.field2826 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method1350(31351);
                if (var10 > 0) {
                    this.field2826[var9] = new int[var10];
                    this.field2826[var9][0] = arg2.method1372(-2);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field2826[var9][var11] = arg2.method1374(-2);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2811 = true;
        } else if (arg1 == 15) {
            this.field2803 = true;
        } else if (arg1 == 16) {
            this.field2820 = true;
        }
        field2815++;
        int var17 = -92 % ((-arg0 - 48) / 35);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljn;IIIII)Ljn;", line = 180)
    public final class396 method1124(class396 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2810++;
        int var7 = this.field2818[arg4];
        int var8 = this.field2823[arg4];
        class127 var9 = class451.method2800(var8 >> 16, arg2 ^ arg2);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method2297((byte) 1, arg1, true);
        }
        class127 var11 = null;
        if ((this.field2803 || class83.field926) && arg3 != -1 && this.field2823.length > arg3) {
            int var12 = this.field2823[arg3];
            var11 = class451.method2800(var12 >> 16, arg2 ^ 0xEEA6B250);
            arg3 = var12 & 0xFFFF;
        }
        class127 var13 = null;
        class127 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2805 != null) {
            if (arg4 < this.field2805.length) {
                var15 = this.field2805[arg4];
                if (var15 != 65535) {
                    var13 = class451.method2800(var15 >> 16, 0);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2803 || class83.field926) && arg3 != -1 && arg3 < this.field2805.length) {
                var16 = this.field2805[arg3];
                if (var16 != 65535) {
                    var14 = class451.method2800(var16 >> 16, 0);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2811) {
            arg1 |= 0x200;
        }
        if (var9.method685(var10, -1)) {
            arg1 |= 0x80;
        }
        if (var9.method686(var10, true)) {
            arg1 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method685(var15, arg2 + 291065263)) {
                arg1 |= 0x80;
            }
            if (var13.method686(var15, true)) {
                arg1 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method685(arg3, -1)) {
                arg1 |= 0x80;
            }
            if (var11.method686(arg3, true)) {
                arg1 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method685(var16, arg2 + 291065263)) {
                arg1 |= 0x80;
            }
            if (var14.method686(var16, true)) {
                arg1 |= 0x100;
            }
        }
        int var17 = arg1 | 0x20;
        class396 var18 = arg0.method2297((byte) 1, var17, true);
        var18.method2474(var11, arg5 - 1, var9, 0, 65535, this.field2811, var10, var7, arg3);
        if (var13 != null) {
            var18.method2474(var14, arg5 - 1, var13, 0, 65535, this.field2811, var15, var7, var16);
        }
        return var18;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIII)V", line = 306)
    public static final void method1125(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 4) {
            method1131(9);
        }
        if (class101.field1182 == 0) {
            method1127(false, -120);
        } else {
            class232.field3205 = class101.field1182;
            class429.method2657(0, arg3 ^ 0x24BF4B64);
        }
        field2808++;
        class449.field6529 = arg1;
        class370.field5180 = arg2;
        class98.field1156 = arg4;
        class443.method2733(arg0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZB)I", line = 334)
    public final int method1126(int arg0, int arg1, boolean arg2, byte arg3) {
        field2821++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2823[arg0];
        class127 var8 = null;
        class127 var9 = class451.method2800(var7 >> 16, arg3 + 36);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2803 || class83.field926) && arg1 != -1 && arg1 < this.field2823.length) {
            int var11 = this.field2823[arg1];
            var8 = class451.method2800(var11 >> 16, 0);
            var6 = var11 & 0xFFFF;
        }
        if (arg3 != -36) {
            return -93;
        }
        if (this.field2811) {
            var5 |= 0x200;
        }
        if (var9.method685(var10, -1)) {
            var5 |= 0x80;
        }
        if (var9.method686(var10, true)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method685(var6, -1)) {
                var5 |= 0x80;
            }
            if (var8.method686(var6, true)) {
                var5 |= 0x100;
            }
        }
        if (this.field2805 != null && arg2) {
            if (arg0 < this.field2805.length) {
                int var12 = this.field2805[arg0];
                if (var12 != 65535) {
                    class127 var13 = class451.method2800(var12 >> 16, 0);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method685(var14, -1)) {
                            var5 |= 0x80;
                        }
                        if (var13.method686(var14, true)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field2803 || class83.field926) && arg1 != -1 && arg1 < this.field2805.length) {
                int var15 = this.field2805[arg1];
                if (var15 != 65535) {
                    class127 var16 = class451.method2800(var15 >> 16, 0);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method685(var17, -1)) {
                            var5 |= 0x80;
                        }
                        if (var16.method686(var17, true)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V", line = 452)
    public static final void method1127(boolean arg0, int arg1) {
        field2813++;
        if (arg0 && class443.field6447 != null) {
            class6.field46 = class443.field6447.field2266;
        } else {
            class6.field46 = -1;
        }
        class337.field4497 = 0;
        class338.field4512 = null;
        class443.field6447 = null;
        class271.field3671 = null;
        class443.method2745();
        class443.field6455.method829(false);
        class443.field6458 = null;
        class72.field804 = null;
        class216.field2909 = null;
        class428.field6284 = -1;
        class116.field1442 = null;
        class53.field547 = null;
        class359.field5072 = null;
        class68.field715 = -1;
        class244.field3321 = null;
        class191.field2402 = null;
        class370.field5174 = null;
        class185.field2353 = null;
        class220.method1193(100);
        class61.field626 = null;
        class260.method1458(128, 11904, 64);
        class305.method1790(64, 59, 64);
        if (arg1 >= -73) {
            method1132((class286) null, 126);
        }
        class132.method713(64, true);
        class233.method1265(64, 1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILtq;)V", line = 515)
    public final void method1128(int arg0, class250 arg1) {
        if (arg0 != -14775) {
            this.field2811 = false;
        }
        while (true) {
            int var3 = arg1.method1350(arg0 + 46126);
            if (var3 == 0) {
                field2802++;
                return;
            }
            this.method1123(arg0 ^ 0xFFFFC64B, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 541)
    public final void method1129(int arg0) {
        if (this.field2804 == -1) {
            if (this.field2827 == null) {
                this.field2804 = 0;
            } else {
                this.field2804 = 2;
            }
        }
        if (arg0 <= 42) {
            method1125(-124, false, 13, -113, 68);
        }
        field2838++;
        if (this.field2829 != -1) {
            return;
        }
        if (this.field2827 == null) {
            this.field2829 = 0;
        } else {
            this.field2829 = 2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIIILjn;IB)Ljn;", line = 586)
    public final class396 method1130(int arg0, boolean arg1, int arg2, int arg3, int arg4, class396 arg5, int arg6, byte arg7) {
        field2817++;
        int var9 = this.field2818[arg4];
        if (arg1) {
            method1122((class286) null, 109, 79, 57);
        }
        int var10 = this.field2823[arg4];
        class127 var11 = class451.method2800(var10 >> 16, 0);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method2297((byte) 1, arg3, true);
        }
        class127 var13 = null;
        if ((this.field2803 || class83.field926) && arg6 != -1 && this.field2823.length > arg6) {
            int var14 = this.field2823[arg6];
            var13 = class451.method2800(var14 >> 16, 0);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field2811) {
            arg3 |= 0x200;
        }
        if (var11.method685(var12, -1)) {
            arg3 |= 0x80;
        }
        if (var11.method686(var12, true)) {
            arg3 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method685(arg6, -1)) {
                arg3 |= 0x80;
            }
            if (var13.method686(arg6, true)) {
                arg3 |= 0x100;
            }
        }
        int var15 = arg3 | 0x20;
        class396 var16 = arg5.method2297(arg7, var15, true);
        var16.method2474(var13, arg0 - 1, var11, arg2, 65535, this.field2811, var12, var9, arg6);
        return var16;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 659)
    public static void method1131(int arg0) {
        field2834 = null;
        if (arg0 != -11) {
            method1132((class286) null, 54);
        }
        field2807 = null;
        field2830 = null;
        field2831 = null;
        field2836 = null;
        field2832 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lam;I)V", line = 674)
    public static final void method1132(class286 arg0, int arg1) {
        field2816++;
        if (arg1 != 65535) {
            field2809 = -78;
        }
        class139.field1787 = arg0;
        class412.field5952 = class139.field1787.method1691(19, 0);
    }
}
