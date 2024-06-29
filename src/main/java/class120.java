import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class120 {

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    private int field2036 = 0;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[Lqh;")
    public class287[] field2029;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljc;")
    public static class285 field2019 = new class285();

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2023 = 0;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lmh;")
    public static class128 field2024 = null;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lmh;")
    public static class128 field2025 = class22.method156(122, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
    public static int[] field2037 = new int[100];

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "J")
    private long field2017;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lqh;")
    private class287 field2020;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lqh;")
    private class287 field2035;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([Lqh;I)I", line = 4)
    public final int method724(class287[] arg0, int arg1) {
        field2022++;
        int var3 = 0;
        if (arg1 != -1) {
            return -74;
        }
        for (int var4 = 0; var4 < this.field2032; var4++) {
            class287 var5 = this.field2029[var4];
            for (class287 var6 = var5.field4902; var6 != var5; var6 = var6.field4902) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lmh;I)V", line = 41)
    public static final void method725(class128 arg0, int arg1) {
        field2027++;
        class221.field3890 = arg0;
        if (class288.field4925.field4677 == null) {
            return;
        }
        try {
            class128 var2 = class151.field2605.method866((byte) -113, class288.field4925.field4677);
            class128 var3 = class187.field3250.method866((byte) -117, class288.field4925.field4677);
            class128 var4 = class28.method177((byte) -58, new class128[] { var2, class107.field1821, arg0, class70.field1308, var3 });
            class128 var5;
            if (arg0.method865((byte) 117) == arg1) {
                var5 = class28.method177((byte) -81, new class128[] { var4, class30.field673 });
            } else {
                var5 = class28.method177((byte) -108, new class128[] { var4, class283.field4866, class196.method1362(84, class71.method470(true) + 94608000000L), class113.field1903, class90.method571((byte) -71, 94608000L) });
            }
            class28.method177((byte) -125, new class128[] { class190.field3296, var5, class275.field4767 }).method834(class288.field4925.field4677, false);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 72)
    public static void method726(int arg0) {
        field2019 = null;
        field2037 = null;
        field2024 = null;
        field2025 = null;
        if (arg0 != 1) {
            method725((class128) null, -70);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I", line = 85)
    public final int method727(byte arg0) {
        field2034++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2032; var3++) {
            class287 var4 = this.field2029[var3];
            class287 var5 = var4.field4902;
            while (var4 != var5) {
                var5 = var5.field4902;
                var2++;
            }
        }
        if (arg0 != 40) {
            this.method734(95);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZJ)Lqh;", line = 118)
    public final class287 method728(boolean arg0, long arg1) {
        field2021++;
        this.field2017 = arg1;
        class287 var4 = this.field2029[(int) (arg1 & (long) (this.field2032 - 1))];
        this.field2020 = var4.field4902;
        if (arg0) {
            return (class287) null;
        }
        while (this.field2020 != var4) {
            if (this.field2020.field4915 == arg1) {
                class287 var5 = this.field2020;
                this.field2020 = this.field2020.field4902;
                return var5;
            }
            this.field2020 = this.field2020.field4902;
        }
        this.field2020 = null;
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lqh;", line = 150)
    public final class287 method729(int arg0) {
        this.field2036 = 0;
        if (arg0 >= -74) {
            method726(122);
        }
        field2018++;
        return this.method732(1);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lqh;JB)V", line = 163)
    public final void method730(class287 arg0, long arg1, byte arg2) {
        if (arg0.field4914 != null) {
            arg0.method1978((byte) 88);
        }
        field2033++;
        class287 var5 = this.field2029[(int) (arg1 & (long) (this.field2032 - 1))];
        arg0.field4914 = var5.field4914;
        arg0.field4915 = arg1;
        arg0.field4902 = var5;
        int var6 = 108 % ((arg2 - 60) / 56);
        arg0.field4914.field4902 = arg0;
        arg0.field4902.field4914 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ldj;BI)Llm;", line = 193)
    public static final class45 method731(class314 arg0, byte arg1, int arg2) {
        byte[] var3 = arg0.method2162(arg2, -2);
        field2038++;
        if (var3 == null) {
            return null;
        } else {
            int var4 = -44 % ((arg1 - 29) / 57);
            return new class45(var3);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lqh;", line = 212)
    public final class287 method732(int arg0) {
        field2031++;
        if (this.field2036 > 0 && this.field2029[this.field2036 - 1] != this.field2035) {
            class287 var2 = this.field2035;
            this.field2035 = var2.field4902;
            return var2;
        }
        class287 var3;
        do {
            if (this.field2032 <= this.field2036) {
                if (arg0 != 1) {
                    return (class287) null;
                }
                return null;
            }
            var3 = this.field2029[this.field2036++].field4902;
        } while (this.field2029[this.field2036 - 1] == var3);
        this.field2035 = var3.field4902;
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V", line = 246)
    public final void method733(byte arg0) {
        int var2 = 71 / ((51 - arg0) / 50);
        field2028++;
        for (int var3 = 0; var3 < this.field2032; var3++) {
            class287 var4 = this.field2029[var3];
            while (true) {
                class287 var5 = var4.field4902;
                if (var4 == var5) {
                    break;
                }
                var5.method1978((byte) -120);
            }
        }
        this.field2035 = null;
        this.field2020 = null;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Lqh;", line = 277)
    public final class287 method734(int arg0) {
        if (arg0 != 3069) {
            this.field2036 = 44;
        }
        field2026++;
        if (this.field2020 == null) {
            return null;
        }
        class287 var2 = this.field2029[(int) (this.field2017 & (long) (this.field2032 - 1))];
        while (this.field2020 != var2) {
            if (this.field2020.field4915 == this.field2017) {
                class287 var3 = this.field2020;
                this.field2020 = this.field2020.field4902;
                return var3;
            }
            this.field2020 = this.field2020.field4902;
        }
        this.field2020 = null;
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)I", line = 322)
    public final int method735(int arg0) {
        if (arg0 != 0) {
            field2019 = (class285) null;
        }
        field2016++;
        return this.field2032;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V", line = 341)
    public class120(int arg0) {
        this.field2029 = new class287[arg0];
        this.field2032 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class287 var3 = this.field2029[var2] = new class287();
            var3.field4914 = var3;
            var3.field4902 = var3;
        }
    }
}
