import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class310 {

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    private int field4714 = 0;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Ltd;")
    private class192 field4717;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lfe;")
    public static class248 field4716 = new class248(128);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lqa;")
    private class101 field4713;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2141(int arg0) {
        field4715++;
        if (arg0 > 118) {
            class56.field704.method2176((byte) -28);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Lqa;", line = 22)
    public final class101 method2142(int arg0) {
        field4711++;
        if (this.field4714 > 0 && this.field4717.field2872[this.field4714 - 1] != this.field4713) {
            class101 var2 = this.field4713;
            this.field4713 = var2.field1595;
            return var2;
        } else if (arg0 == 1) {
            class101 var3;
            do {
                if (this.field4714 >= this.field4717.field2869) {
                    return null;
                }
                var3 = this.field4717.field2872[this.field4714++].field1595;
            } while (this.field4717.field2872[this.field4714 - 1] == var3);
            this.field4713 = var3.field1595;
            return var3;
        } else {
            return (class101) null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Z", line = 58)
    public static final boolean method2143(int arg0, int arg1, int arg2) {
        int var3 = class3.field18[arg0][arg1][arg2];
        if (-class170.field2557 == var3) {
            return false;
        } else if (class170.field2557 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class3.method7(var4 + 1, class294.field4502[arg0][arg1][arg2], var5 + 1) && class3.method7(var4 + 128 - 1, class294.field4502[arg0][arg1 + 1][arg2], var5 + 1) && class3.method7(var4 + 128 - 1, class294.field4502[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class3.method7(var4 + 1, class294.field4502[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class3.field18[arg0][arg1][arg2] = class170.field2557;
                return true;
            } else {
                class3.field18[arg0][arg1][arg2] = -class170.field2557;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I", line = 90)
    public static final int method2144(int arg0, int arg1) {
        class168 var2 = class274.method1934(120, arg1);
        int var3 = var2.field2523;
        int var4 = var2.field2515;
        int var5 = var2.field2524;
        if (arg0 != 1) {
            field4716 = (class248) null;
        }
        int var6 = class87.field1286[var3 - var5];
        field4712++;
        return var6 & class185.field2763[var4] >> var5;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)Lpc;", line = 107)
    public static final class295 method2145(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class295 var4 = var3.field3357;
            var3.field3357 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 119)
    public static void method2146(byte arg0) {
        if (arg0 == 45) {
            field4716 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)I", line = 129)
    public static final int method2147(int arg0) {
        field4710++;
        if (arg0 <= 4) {
            field4716 = (class248) null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIII)V", line = 144)
    public static final void method2148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 0) {
            method2144(104, -87);
        }
        field4718++;
        if (arg3 < 1 || arg7 < 1 || arg3 > 102 || arg7 > 102) {
            return;
        }
        if (!class80.method540(118) && (class179.field2645[0][arg3][arg7] & 0x2) == 0) {
            int var8 = arg0;
            if ((class179.field2645[arg0][arg3][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class54.field675 != var8) {
                return;
            }
        }
        int var9 = arg0;
        if (arg0 < 3 && (class179.field2645[1][arg3][arg7] & 0x2) == 2) {
            var9 = arg0 + 1;
        }
        class265.method1857(arg6, arg0, arg3, class325.field4896[arg0], var9, arg7, (byte) -74);
        if (arg2 >= 0) {
            boolean var10 = class170.field2549;
            class170.field2549 = true;
            class241.method1635(arg2, arg4, arg0, 31325, arg3, class325.field4896[arg0], false, false, arg1, arg7, var9);
            class170.field2549 = var10;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Ltd;)V", line = 209)
    public class310(class192 arg0) {
        this.field4717 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)Lqa;", line = 195)
    public final class101 method2149(int arg0) {
        if (arg0 != -8041) {
            this.field4717 = (class192) null;
        }
        field4709++;
        this.field4714 = 0;
        return this.method2142(1);
    }
}
