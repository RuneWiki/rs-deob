import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class299 extends class167 {

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    private int field4803 = 0;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lrb;")
    private class143 field4806 = new class143(16);

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    private int field4830 = 0;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "Lie;")
    private class2 field4834 = new class2();

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "J")
    private long field4836 = 0L;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lea;")
    private class224 field4811;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    private int field4804;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Z")
    private boolean field4828;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "Lie;")
    private class2 field4832;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Llm;")
    private class202 field4818;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lea;")
    private class224 field4801;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    private int field4824;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "Z")
    private boolean field4835;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Lck;")
    private class267 field4820;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    private int field4808;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lvh;")
    private class145 field4800;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4810 = "wave2:";

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "Lpi;")
    public static class201 field4823 = new class201(50);

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lnd;")
    private class223 field4799;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "Z")
    public static boolean field4829;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Z")
    private boolean field4831;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[B")
    private byte[] field4815;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[I")
    public static int[] field4825;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method2035(int arg0) {
        field4817++;
        if (this.field4832 == null || this.method1196(50) == null) {
            return;
        }
        for (class259 var2 = this.field4834.method8(-128); var2 != null; var2 = this.field4834.method12((byte) 69)) {
            int var3 = (int) var2.field4008;
            if (var3 < 0 || this.field4799.field3281 <= var3 || this.field4799.field3265[var3] == 0) {
                var2.method1781(5250);
            } else {
                if (this.field4815[var3] == 0) {
                    this.method2038((byte) 40, var3, 1);
                }
                if (this.field4815[var3] == -1) {
                    this.method2038((byte) 40, var3, 2);
                }
                if (this.field4815[var3] == 1) {
                    var2.method1781(arg0 + 17806);
                }
            }
        }
        if (arg0 != -12556) {
            this.field4799 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILlc;Z)Lbc;")
    public static final class148 method2036(int arg0, class270 arg1, boolean arg2) {
        field4822++;
        if (class248.method1706((byte) 114, arg0, arg1)) {
            return arg2 ? null : class269.method1857(27511);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
    public final void method2037(byte arg0) {
        field4807++;
        if (arg0 != 1) {
            return;
        }
        if (this.field4832 != null) {
            if (this.method1196(50) == null) {
                return;
            }
            if (this.field4828) {
                boolean var6 = true;
                for (class259 var7 = this.field4832.method8(-122); var7 != null; var7 = this.field4832.method12((byte) 69)) {
                    int var9 = (int) var7.field4008;
                    if (this.field4815[var9] == 0) {
                        this.method2038((byte) 40, var9, 1);
                    }
                    if (this.field4815[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1781(5250);
                    }
                }
                while (this.field4830 < this.field4799.field3265.length) {
                    if (this.field4799.field3265[this.field4830] == 0) {
                        this.field4830++;
                    } else {
                        if (this.field4818.field2981 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4815[this.field4830] == 0) {
                            this.method2038((byte) 40, this.field4830, 1);
                        }
                        if (this.field4815[this.field4830] == 0) {
                            class259 var8 = new class259();
                            var8.field4008 = (long) this.field4830;
                            this.field4832.method13(32, var8);
                            var6 = false;
                        }
                        this.field4830++;
                    }
                }
                if (var6) {
                    this.field4830 = 0;
                    this.field4828 = false;
                }
            } else if (this.field4831) {
                boolean var2 = true;
                for (class259 var3 = this.field4832.method8(-111); var3 != null; var3 = this.field4832.method12((byte) 69)) {
                    int var5 = (int) var3.field4008;
                    if (this.field4815[var5] != 1) {
                        this.method2038((byte) 40, var5, 2);
                    }
                    if (this.field4815[var5] == 1) {
                        var3.method1781(5250);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4799.field3265.length > this.field4830) {
                    if (this.field4799.field3265[this.field4830] == 0) {
                        this.field4830++;
                    } else {
                        if (this.field4820.method1844(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4815[this.field4830] != 1) {
                            this.method2038((byte) 40, this.field4830, 2);
                        }
                        if (this.field4815[this.field4830] != 1) {
                            class259 var4 = new class259();
                            var4.field4008 = (long) this.field4830;
                            var2 = false;
                            this.field4832.method13(arg0 ^ 0x21, var4);
                        }
                        this.field4830++;
                    }
                }
                if (var2) {
                    this.field4830 = 0;
                    this.field4831 = false;
                }
            } else {
                this.field4832 = null;
            }
        }
        if (!this.field4835 || class3.method14(29853) < this.field4836) {
            return;
        }
        for (class145 var10 = (class145) this.field4806.method1071(arg0 - 126); var10 != null; var10 = (class145) this.field4806.method1069(-123)) {
            if (!var10.field2341) {
                if (var10.field2345) {
                    if (!var10.field2342) {
                        throw new RuntimeException();
                    }
                    var10.method1781(5250);
                } else {
                    var10.field2345 = true;
                }
            }
        }
        this.field4836 = class3.method14(29853) + 1000L;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)Lvh;")
    private final class145 method2038(byte arg0, int arg1, int arg2) {
        field4798++;
        class145 var4 = (class145) this.field4806.method1073(arg0 ^ 0xFFFFFFD7, (long) arg1);
        if (arg0 != 40) {
            this.field4801 = null;
        }
        if (var4 != null && arg2 == 0 && !var4.field2342 && var4.field2341) {
            var4.method1781(5250);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field4811 == null || this.field4815[arg1] == -1) {
                    if (this.field4820.method1832((byte) -15)) {
                        return null;
                    }
                    var4 = this.field4820.method1830(this.field4804, (byte) 2, arg1, arg0 + 75, true);
                } else {
                    var4 = this.field4818.method1428(this.field4811, (byte) -112, arg1);
                }
            } else if (arg2 == 1) {
                if (this.field4811 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4818.method1426((byte) -23, this.field4811, arg1);
            } else if (arg2 == 2) {
                if (this.field4811 == null) {
                    throw new RuntimeException();
                }
                if (this.field4815[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4820.method1844(true)) {
                    return null;
                }
                var4 = this.field4820.method1830(this.field4804, (byte) 2, arg1, arg0 + 78, false);
            } else {
                throw new RuntimeException();
            }
            this.field4806.method1074((byte) 39, var4, (long) arg1);
        }
        if (var4.field2341) {
            return null;
        }
        byte[] var5 = var4.method222((byte) 113);
        if (!var4 instanceof class35) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class9.field101.reset();
                class9.field101.update(var5, 0, var5.length - 2);
                int var9 = (int) class9.field101.getValue();
                if (this.field4799.field3275[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field4820.field4293 = 0;
                this.field4820.field4294 = 0;
            } catch (RuntimeException var12) {
                this.field4820.method1838(false);
                var4.method1781(arg0 ^ 0x14AA);
                if (var4.field2342 && !this.field4820.method1832((byte) -15)) {
                    class302 var10 = this.field4820.method1830(this.field4804, (byte) 2, arg1, 108, true);
                    this.field4806.method1074((byte) 39, var10, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4799.field3284[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field4799.field3284[arg1];
            if (this.field4811 != null) {
                this.field4818.method1431((byte) 124, var5, this.field4811, arg1);
                if (this.field4815[arg1] != 1) {
                    this.field4803++;
                    this.field4815[arg1] = 1;
                }
            }
            if (!var4.field2342) {
                var4.method1781(5250);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class9.field101.reset();
            class9.field101.update(var5, 0, var5.length - 2);
            int var6 = (int) class9.field101.getValue();
            if (this.field4799.field3275[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4799.field3284[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4815[arg1] != 1) {
                this.field4803++;
                this.field4815[arg1] = 1;
            }
            if (!var4.field2342) {
                var4.method1781(arg0 + 5210);
            }
            return var4;
        } catch (Exception var11) {
            this.field4815[arg1] = -1;
            var4.method1781(arg0 + 5210);
            if (var4.field2342 && !this.field4820.method1832((byte) -15)) {
                class302 var8 = this.field4820.method1830(this.field4804, (byte) 2, arg1, 118, true);
                this.field4806.method1074((byte) 39, var8, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public final void method2039(byte arg0) {
        field4805++;
        if (this.field4811 != null && arg0 <= -52) {
            this.field4831 = true;
            if (this.field4832 == null) {
                this.field4832 = new class2();
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public static void method2040(int arg0) {
        if (arg0 != 100) {
            field4823 = null;
        }
        field4825 = null;
        field4823 = null;
        field4810 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Lnd;")
    public final class223 method1196(int arg0) {
        field4809++;
        if (this.field4799 != null) {
            return this.field4799;
        }
        if (this.field4800 == null) {
            if (this.field4820.method1832((byte) -15)) {
                return null;
            }
            this.field4800 = this.field4820.method1830(255, (byte) 0, this.field4804, 110, true);
        }
        if (this.field4800.field2341) {
            return null;
        }
        if (arg0 != 50) {
            field4829 = false;
        }
        byte[] var2 = this.field4800.method222((byte) 65);
        if (this.field4800 instanceof class35) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4799 = new class223(var2, this.field4808);
                if (this.field4799.field3278 != this.field4824) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4799 = null;
                if (this.field4820.method1832((byte) -15)) {
                    this.field4800 = null;
                } else {
                    this.field4800 = this.field4820.method1830(255, (byte) 0, this.field4804, 113, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4799 = new class223(var2, this.field4808);
            } catch (RuntimeException var4) {
                this.field4820.method1838(false);
                this.field4799 = null;
                if (this.field4820.method1832((byte) -15)) {
                    this.field4800 = null;
                } else {
                    this.field4800 = this.field4820.method1830(255, (byte) 0, this.field4804, arg0 ^ 0x4B, true);
                }
                return null;
            }
            if (this.field4801 != null) {
                this.field4818.method1431((byte) 124, var2, this.field4801, this.field4804);
            }
        }
        this.field4800 = null;
        if (this.field4811 != null) {
            this.field4803 = 0;
            this.field4815 = new byte[this.field4799.field3281];
        }
        return this.field4799;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
    public final void method1192(int arg0, int arg1) {
        field4812++;
        if (arg1 != -2) {
            this.method1196(-105);
        }
        if (this.field4811 == null) {
            return;
        }
        for (class259 var3 = this.field4834.method8(-96); var3 != null; var3 = this.field4834.method12((byte) 69)) {
            if (((long) arg0) == var3.field4008) {
                return;
            }
        }
        class259 var4 = new class259();
        var4.field4008 = (long) arg0;
        this.field4834.method13(32, var4);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I")
    public final int method2041(int arg0) {
        field4813++;
        if (this.field4799 == null) {
            return 0;
        } else if (this.field4828) {
            class259 var2 = this.field4832.method8(-93);
            if (var2 == null) {
                return 0;
            } else {
                if (arg0 > -108) {
                    field4823 = null;
                }
                return (int) var2.field4008;
            }
        } else {
            return this.field4799.field3273;
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)I")
    public final int method2042(int arg0) {
        field4819++;
        if (arg0 == 0) {
            return this.field4799 == null ? 0 : this.field4799.field3273;
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Llc;B)V")
    public static final void method2043(class270 arg0, byte arg1) {
        class222.field3261 = arg0.method1884("p11_full", (byte) 119);
        int var2 = 11 % ((-arg1 - 15) / 39);
        field4797++;
        class9.field102 = arg0.method1884("p12_full", (byte) 118);
        class291.field4634 = arg0.method1884("b12_full", (byte) 120);
        class214.field3148 = arg0.method1884("hitmarks", (byte) 125);
        class272.field4404 = arg0.method1884("hitbar_default", (byte) 120);
        class282.field4543 = arg0.method1884("headicons_pk", (byte) 124);
        class86.field1370 = arg0.method1884("headicons_prayer", (byte) 119);
        class289.field4621 = arg0.method1884("hint_headicons", (byte) -7);
        class238.field3479 = arg0.method1884("hint_mapmarkers", (byte) -2);
        class29.field307 = arg0.method1884("mapflag", (byte) -90);
        class1.field2 = arg0.method1884("cross", (byte) 125);
        class108.field1830 = arg0.method1884("mapdots", (byte) 120);
        class212.field3128 = arg0.method1884("scrollbar", (byte) 119);
        class57.field836 = arg0.method1884("name_icons", (byte) 119);
        class51.field703 = arg0.method1884("floorshadows", (byte) 11);
        class126.field2125 = arg0.method1884("compass", (byte) -1);
        class163.field2528 = arg0.method1884("hint_mapedge", (byte) 12);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)I")
    public final int method1195(int arg0, int arg1) {
        field4802++;
        class145 var3 = (class145) this.field4806.method1073(-1, (long) arg1);
        if (arg0 == 25046) {
            return var3 == null ? 0 : var3.method223(arg0 ^ 0x61B2);
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)I")
    public final int method2044(boolean arg0) {
        field4821++;
        if (!arg0) {
            this.method2041(24);
        }
        if (this.method1196(50) == null) {
            return this.field4800 == null ? 0 : this.field4800.method223(100);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)[B")
    public final byte[] method1194(boolean arg0, int arg1) {
        field4814++;
        class145 var3 = this.method2038((byte) 40, arg1, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method222((byte) -70);
        if (arg0) {
            return null;
        } else {
            var3.method1781(5250);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)I")
    public final int method2045(int arg0) {
        field4816++;
        return arg0 <= 36 ? -32 : this.field4803;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILea;Lea;Lck;Llm;IIZ)V")
    public class299(int arg0, class224 arg1, class224 arg2, class267 arg3, class202 arg4, int arg5, int arg6, boolean arg7) {
        this.field4811 = arg1;
        this.field4804 = arg0;
        if (this.field4811 == null) {
            this.field4828 = false;
        } else {
            this.field4828 = true;
            this.field4832 = new class2();
        }
        this.field4818 = arg4;
        this.field4801 = arg2;
        this.field4824 = arg6;
        this.field4835 = arg7;
        this.field4820 = arg3;
        this.field4808 = arg5;
        if (this.field4801 != null) {
            this.field4800 = this.field4818.method1428(this.field4801, (byte) 55, this.field4804);
        }
    }
}
