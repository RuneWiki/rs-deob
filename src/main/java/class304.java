import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class304 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    private int field4803 = -32768;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    private int field4830 = -1;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Z")
    private boolean field4813 = false;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    private int field4829 = -1;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "Z")
    private boolean field4836 = false;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public int field4834;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    private int field4828;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "B")
    private byte field4817;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "B")
    private byte field4802;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    private int field4810;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "Z")
    private boolean field4832;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[I")
    public static int[] field4807 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    private int field4821;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    private int field4825;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    private int field4837;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Lid;")
    private class348 field4820;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "Lgn;")
    private class417 field4831;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Lpj;")
    public class78 field4819;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Las;")
    private class84 field4822;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[Z")
    private boolean[] field4811;

    @OriginalMember(owner = "client!ni", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4814++;
        if (this.field4819 != null) {
            this.field4819.method497();
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZIIIZILe;)Lid;")
    public final class348 method2038(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class312 arg6) {
        field4804++;
        class127 var8 = class137.method1003(this.field4834, arg2 ^ 0xFFFF87B5);
        if (var8.field1984 != null) {
            var8 = var8.method948((byte) -59);
        }
        if (var8 == null) {
            this.method2049(arg6, (byte) -115);
            this.field4829 = this.field4818;
            this.field4830 = -1;
            return null;
        }
        if (!this.field4813 && this.field4830 != var8.field2016) {
            this.field4820 = null;
            this.method2041(-1, (byte) 90);
        }
        this.method2050(arg5, 0, arg1);
        boolean var9 = arg0 & class299.field4755 != 0 & this.field4832;
        if (arg2 != 1) {
            this.field4817 = 55;
        }
        boolean var10 = var9 & (this.field4830 != var8.field2016 || (this.field4829 != this.field4818 || this.field4831 != null && (this.field4831.field6184 || class191.field3120) && this.field4837 != this.field4818) && class299.field4755 >= 2);
        if (arg4 && !var10) {
            this.field4829 = this.field4818;
            this.field4830 = var8.field2016;
            return null;
        }
        if (var10) {
            class120.method866(this.field4822, this.field4802, this.field4810, this.field4828, this.field4811);
        }
        class129 var11 = class275.field4396[this.field4802];
        class129 var12;
        if (this.field4836) {
            var12 = class181.field2961[0];
        } else {
            var12 = this.field4802 < 3 ? class275.field4396[this.field4802 + 1] : null;
        }
        class348 var13 = null;
        if (this.field4831 != null) {
            if (var10) {
                arg3 |= 0x20000;
            }
            var13 = var8.method944(this.field4808 == 11 ? 10 : this.field4808, this.field4828, this.field4818, 126, var11.method771(this.field4810, this.field4828), var11, this.field4810, var12, arg6, this.field4808 == 11 ? this.field4805 + 4 : this.field4805, arg3, this.field4825, this.field4831, this.field4837);
            if (var13 == null) {
                this.field4822 = null;
                this.field4811 = null;
                this.field4803 = 0;
            } else {
                if (var10) {
                    if (this.field4811 == null) {
                        this.field4811 = new boolean[4];
                    }
                    this.field4822 = var13.method27(this.field4822);
                    class98.method740(this.field4822, this.field4802, arg5, arg1, this.field4811);
                }
                this.field4803 = var13.method57();
            }
            this.field4820 = null;
        } else if (this.field4820 != null && (arg3 & this.field4820.method44()) == arg3 && this.field4830 == var8.field2016) {
            var13 = this.field4820;
        } else {
            if (this.field4820 != null) {
                arg3 |= this.field4820.method44();
            }
            class230 var14 = var8.method949(var11, var10, this.field4808 == 11 ? this.field4805 + 4 : this.field4805, arg6, var12, this.field4808 == 11 ? 10 : this.field4808, 42, this.field4828, this.field4810, var11.method771(this.field4810, this.field4828), arg3);
            if (var14 == null) {
                this.field4803 = 0;
                this.field4820 = null;
                this.field4822 = null;
                this.field4811 = null;
            } else {
                var13 = var14.field3831;
                this.field4820 = var14.field3831;
                if (var10) {
                    this.field4822 = var14.field3834;
                    this.field4811 = null;
                    class98.method740(this.field4822, this.field4802, arg5, arg1, (boolean[]) null);
                }
                this.field4803 = var13.method57();
            }
        }
        this.field4829 = this.field4818;
        this.field4810 = arg5;
        this.field4830 = var8.field2016;
        this.field4828 = arg1;
        return var13;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
    public static final void method2039(int arg0, byte arg1) {
        field4824++;
        if (arg1 >= -13) {
            method2042(-122);
        }
        class211 var2 = class281.method1921(11, arg0, (byte) -117);
        var2.method1489((byte) -100);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public final void method2040(int arg0, int arg1) {
        if (arg1 != -17647) {
            this.method2050(-45, 10, 110);
        }
        field4815++;
        this.field4813 = true;
        this.method2041(arg0, (byte) 90);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IB)V")
    private final void method2041(int arg0, byte arg1) {
        if (arg1 != 90) {
            this.field4831 = null;
        }
        field4826++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class127 var5 = class137.method1003(this.field4834, -30796);
            class127 var6 = var5;
            if (var5.field1984 != null) {
                var5 = var5.method948((byte) -118);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1973 != null) {
                if (this.field4831 != null && var5.method945((byte) 96, this.field4831.field6153)) {
                    return;
                }
                var3 = var5.method942(false);
                if (this.field4830 != var5.field2016) {
                    var4 = var5.field2013;
                }
            } else if (var5.field2022 == -1) {
                if (var6 != null && var6.field1973 != null) {
                    if (this.field4831 != null && var6.method945((byte) 48, this.field4831.field6153)) {
                        return;
                    }
                    var3 = var6.method942(false);
                    if (this.field4830 != var6.field2016) {
                        var4 = var6.field2013;
                    }
                } else if (var6 != null && var6.field2022 != -1 && this.field4830 != var6.field2016) {
                    var4 = var6.field2013;
                    var3 = var6.field2022;
                }
            } else if (this.field4830 != var5.field2016) {
                var3 = var5.field2022;
                var4 = var5.field2013;
            }
        }
        if (var3 == -1) {
            this.field4831 = null;
            return;
        }
        this.field4820 = null;
        if (this.field4831 == null || this.field4831.field6153 != var3) {
            this.field4831 = class156.method1099(var3, 64);
        } else if (this.field4831.field6172 == 0) {
            return;
        }
        if (this.field4831.field6177 == null) {
            this.field4831 = null;
            return;
        }
        if (var4) {
            this.field4818 = (int) (Math.random() * (double) this.field4831.field6177.length);
            this.field4825 = (int) ((double) this.field4831.field6171[this.field4818] * Math.random()) + 1;
        } else {
            this.field4818 = 0;
            this.field4825 = 1;
        }
        this.field4837 = this.field4818 + 1;
        if (this.field4837 < 0 || this.field4837 >= this.field4831.field6177.length) {
            this.field4837 = -1;
        }
        this.field4821 = class183.field2987 - this.field4825;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method2042(int arg0) {
        if (arg0 == 10) {
            field4807 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)Z")
    public final boolean method2043(byte arg0) {
        field4812++;
        return arg0 == -83 ? this.field4832 : true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2044(String arg0, int arg1) {
        field4838++;
        if (arg0 == null) {
            return;
        }
        String var2 = class428.method2652(arg0, false);
        if (var2 == null || arg1 != 1) {
            return;
        }
        for (int var3 = 0; var3 < class418.field6190; var3++) {
            String var4 = class428.method2652(class269.field4317[var3], false);
            if (var4 != null && var4.equals(var2)) {
                class418.field6190--;
                for (int var5 = var3; var5 < class418.field6190; var5++) {
                    class269.field4317[var5] = class269.field4317[var5 + 1];
                    class315.field4955[var5] = class315.field4955[var5 + 1];
                    class285.field4576[var5] = class285.field4576[var5 + 1];
                    class21.field282[var5] = class21.field282[var5 + 1];
                    class396.field5927[var5] = class396.field5927[var5 + 1];
                }
                class238.field3958++;
                class179.field2921 = class223.field3724;
                class11.field139.method2224(124, (byte) 0);
                class11.field139.method1312(class317.method2110(true, arg0), -72);
                class11.field139.method1301(arg0, arg1 ^ 0x7D);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)I")
    public final int method2045(byte arg0) {
        if (arg0 != 2) {
            this.field4805 = 127;
        }
        field4806++;
        return this.field4803;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLe;IIIIILid;)V")
    public final void method2046(boolean arg0, class312 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class348 arg7) {
        field4827++;
        class11[] var9 = arg7.method7();
        class252[] var10 = arg7.method43();
        if ((this.field4819 == null || this.field4819.field973) && (var9 != null || var10 != null)) {
            class127 var11 = class137.method1003(this.field4834, -30796);
            if (var11.field1984 != null) {
                var11 = var11.method948((byte) -89);
            }
            if (var11 != null) {
                this.field4819 = new class78(class183.field2987);
            }
        }
        if (this.field4819 != null) {
            if (arg0) {
                this.field4819.method488(arg1, (long) class183.field2987, var9, var10, false);
            } else {
                this.field4819.method494((long) class183.field2987);
            }
            this.field4819.method492(this.field4817, arg2, arg5, arg4, arg3);
        }
        if (arg6 != 2) {
            this.method2040(37, 19);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZI)V")
    public static final void method2047(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field4807 = null;
        }
        field4833++;
        class42 var3 = class395.method2490(arg0, (byte) -117);
        int var4 = var3.field524;
        int var5 = var3.field526;
        int var6 = var3.field530;
        int var7 = class348.field5350[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class107.method809(var4, (byte) -109, class391.field5869[var4] & ~var8 | var8 & arg2 << var5);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static final void method2048(int arg0) {
        field4835++;
        for (class58 var1 = (class58) class245.field4023.method253((byte) -6); var1 != null; var1 = (class58) class245.field4023.method247((byte) 9)) {
            if (var1.field751) {
                var1.method385(40);
            }
        }
        if (arg0 != 4) {
            method2048(-56);
        }
        for (class58 var2 = (class58) class3.field81.method253((byte) -6); var2 != null; var2 = (class58) class3.field81.method247((byte) -117)) {
            if (var2.field751) {
                var2.method385(arg0 ^ 0x5E);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Le;B)V")
    public final void method2049(class312 arg0, byte arg1) {
        if (arg1 != -115) {
            return;
        }
        if (this.field4822 != null) {
            class120.method866(this.field4822, this.field4802, this.field4810, this.field4828, this.field4811);
            this.field4811 = null;
            this.field4822 = null;
        }
        field4809++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
    private final void method2050(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return;
        }
        field4816++;
        label92: while (true) {
            if (this.field4831 == null) {
                if (this.field4813) {
                    return;
                }
                this.method2041(-1, (byte) 90);
                if (this.field4831 == null) {
                    return;
                }
            }
            int var4 = class183.field2987 - this.field4821;
            if (var4 > 100 && this.field4831.field6162 > 0) {
                int var5 = this.field4831.field6177.length - this.field4831.field6162;
                while (this.field4818 < var5 && var4 > this.field4831.field6171[this.field4818]) {
                    var4 -= this.field4831.field6171[this.field4818];
                    this.field4818++;
                }
                if (this.field4818 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4831.field6177.length; var7++) {
                        var6 += this.field4831.field6171[var7];
                    }
                    var4 %= var6;
                }
                this.field4837 = this.field4818 + 1;
                if (this.field4837 >= this.field4831.field6177.length) {
                    this.field4837 -= this.field4831.field6162;
                    if (this.field4837 < 0 || this.field4837 >= this.field4831.field6177.length) {
                        this.field4837 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field4831.field6171[this.field4818] >= var4) {
                            this.field4825 = var4;
                            this.field4821 = class183.field2987 - var4;
                            return;
                        }
                        class196.method1374(arg2, (byte) -104, this.field4818, arg0, false, this.field4831);
                        var4 -= this.field4831.field6171[this.field4818];
                        this.field4818++;
                        if (this.field4818 >= this.field4831.field6177.length) {
                            this.field4818 -= this.field4831.field6162;
                            if (this.field4818 < 0 || this.field4818 >= this.field4831.field6177.length) {
                                this.field4831 = null;
                                continue label92;
                            }
                        }
                        this.field4837 = this.field4818 + 1;
                    } while (this.field4831.field6177.length > this.field4837);
                    this.field4837 -= this.field4831.field6162;
                } while (this.field4837 >= 0 && this.field4837 < this.field4831.field6177.length);
                this.field4837 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLe;)V")
    public final void method2051(byte arg0, class312 arg1) {
        if (arg0 < 123) {
            this.field4832 = true;
        }
        field4823++;
        this.method2038(true, this.field4828, 1, 131072, true, this.field4810, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public static final void method2052(int arg0) {
        class198.field3193 = arg0;
        for (int var1 = 0; var1 < class156.field2449; var1++) {
            for (int var2 = 0; var2 < class361.field5513; var2++) {
                if (class423.field6252[arg0][var1][var2] == null) {
                    class423.field6252[arg0][var1][var2] = new class232(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Le;Lfa;IIIIIIZI)V")
    public class304(class312 arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field4834 = arg1.field2016;
        this.field4836 = arg8;
        this.field4828 = arg7;
        this.field4817 = (byte) arg4;
        this.field4802 = (byte) arg5;
        this.field4808 = arg2;
        this.field4805 = arg3;
        this.field4810 = arg6;
        this.field4832 = arg0.method565() && arg1.field1991 && !this.field4836;
        if (arg9 != -1) {
            this.field4813 = true;
        }
        this.method2041(arg9, (byte) 90);
    }
}
