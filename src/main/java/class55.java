import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class55 {

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "Luj;")
    private class259 field955 = new class259();

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "Lan;")
    private class20 field959;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "Liv;")
    public static class64 field962 = new class64(54, -2);

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "Lrn;")
    public static class174 field963 = new class174(69, 2);

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "Lug;")
    public static class392 field964 = new class392();

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
    public static int field965 = 0;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BJ)V", line = 5)
    private final void method481(byte arg0, long arg1) {
        field956++;
        if (arg0 != 87) {
            field964 = null;
        }
        class403 var4 = (class403) this.field959.method171((byte) 38, arg1);
        this.method489((byte) -59, var4);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BLli;)[Lkr;", line = 21)
    public static final class524[] method482(byte arg0, class293 arg1) {
        field953++;
        if (!arg1.method1855(false)) {
            return new class524[0];
        }
        class324 var2 = arg1.method1871(5);
        while (var2.field4940 == 0) {
            class71.method583(10L, -106);
        }
        if (var2.field4940 == 2) {
            return new class524[0];
        }
        int[] var3 = (int[]) var2.field4939;
        class524[] var4 = new class524[var3.length >> 2];
        int var5 = 0;
        int var6 = 58 % ((arg0 - 43) / 62);
        while (var4.length > var5) {
            class524 var7 = new class524();
            var4[var5] = var7;
            var7.field7774 = var3[var5 << 2];
            var7.field7770 = var3[(var5 << 2) + 1];
            var7.field7773 = var3[(var5 << 2) + 2];
            var7.field7769 = var3[(var5 << 2) + 3];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 63)
    public static void method483(int arg0) {
        field963 = null;
        field962 = null;
        if (arg0 != 69) {
            field962 = null;
        }
        field964 = null;
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V", line = 75)
    public final void method484(int arg0) {
        field943++;
        for (class403 var2 = (class403) this.field955.method1679(255); var2 != null; var2 = (class403) this.field955.method1671(-10033)) {
            if (var2.method432(28015)) {
                var2.method2090(-1);
                var2.method1382(7218);
                this.field946 += var2.field6058;
            }
        }
        int var3 = 119 % ((arg0 + 13) / 47);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(JBLjava/lang/Object;)V", line = 101)
    public final void method485(long arg0, byte arg1, Object arg2) {
        field944++;
        this.method486((byte) 127, 1, arg0, arg2);
        if (arg1 != -125) {
            this.method486((byte) 15, -79, 41L, null);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BIJLjava/lang/Object;)V", line = 113)
    private final void method486(byte arg0, int arg1, long arg2, Object arg3) {
        field958++;
        if (this.field949 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method481((byte) 87, arg2);
        this.field946 -= arg1;
        while (this.field946 < 0) {
            class403 var8 = (class403) this.field955.method1674((byte) -106);
            this.method489((byte) -59, var8);
        }
        class337 var6 = new class337(arg3, arg1);
        this.field959.method166(var6, arg2, -102);
        this.field955.method1673(var6, 4304);
        var6.field2927 = 0L;
        int var7 = 123 / ((arg0 - 63) / 62);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)I", line = 143)
    public final int method487(boolean arg0) {
        field947++;
        if (arg0) {
            this.field949 = 26;
        }
        return this.field949;
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V", line = 157)
    public final void method488(int arg0) {
        field948++;
        this.field955.method1677(489772293);
        this.field959.method159(0);
        if (arg0 != -3) {
            this.method489((byte) 96, null);
        }
        this.field946 = this.field949;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BLcr;)V", line = 172)
    private final void method489(byte arg0, class403 arg1) {
        if (arg1 != null) {
            arg1.method2090(-1);
            arg1.method1382(arg0 ^ 0xFFFFE3F7);
            this.field946 += arg1.field6058;
        }
        field945++;
        if (arg0 != -59) {
            this.method481((byte) 2, -30L);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)I", line = 191)
    public final int method490(boolean arg0) {
        if (arg0) {
            field957++;
            return this.field946;
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 203)
    public final Object method491(byte arg0) {
        field952++;
        class403 var2 = (class403) this.field959.method160((byte) -20);
        while (var2 != null) {
            Object var3 = var2.method431((byte) -34);
            if (var3 != null) {
                return var3;
            }
            class403 var4 = var2;
            var2 = (class403) this.field959.method163(124);
            var4.method2090(-1);
            var4.method1382(7218);
            this.field946 += var2.field6058;
        }
        return arg0 <= 122 ? null : null;
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 235)
    public final Object method492(int arg0) {
        if (arg0 != -1) {
            this.method486((byte) -58, 73, -100L, null);
        }
        field961++;
        class403 var2 = (class403) this.field959.method163(122);
        while (var2 != null) {
            Object var3 = var2.method431((byte) -34);
            if (var3 != null) {
                return var3;
            }
            class403 var4 = var2;
            var2 = (class403) this.field959.method163(arg0 ^ 0xFFFFFF80);
            var4.method2090(arg0);
            var4.method1382(7218);
            this.field946 += var2.field6058;
        }
        return null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)V", line = 270)
    public final void method493(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        field950++;
        if (class171.field2646 == null) {
            return;
        }
        for (class403 var3 = (class403) this.field955.method1679(255); var3 != null; var3 = (class403) this.field955.method1671(-10033)) {
            if (var3.method432(28015)) {
                if (var3.method431((byte) -34) == null) {
                    var3.method2090(-1);
                    var3.method1382(7218);
                    this.field946++;
                }
            } else if ((long) arg1 < ++var3.field2927) {
                class403 var4 = class171.field2646.method646((byte) 21, var3);
                this.field959.method166(var4, var3.field4904, 114);
                class377.method2347(var3, var4, 70);
                var3.method2090(-1);
                var3.method1382(7218);
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 318)
    public final Object method494(int arg0, long arg1) {
        if (arg0 != 0) {
            return null;
        }
        field960++;
        class403 var4 = (class403) this.field959.method171((byte) -119, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method431((byte) -34);
        if (var5 == null) {
            var4.method2090(arg0 - 1);
            var4.method1382(7218);
            this.field946 += var4.field6058;
            return null;
        }
        if (var4.method432(arg0 ^ 0x6D6F)) {
            class337 var6 = new class337(var5, var4.field6058);
            this.field959.method166(var6, var4.field4904, -126);
            this.field955.method1673(var6, 4304);
            var6.field2927 = 0L;
            var4.method2090(-1);
            var4.method1382(7218);
        } else {
            this.field955.method1673(var4, 4304);
            var4.field2927 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I)V", line = 388)
    public class55(int arg0) {
        this.field946 = arg0;
        this.field949 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field959 = new class20(var2);
    }

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)I", line = 367)
    public final int method495(int arg0) {
        field951++;
        int var2 = arg0;
        for (class403 var3 = (class403) this.field955.method1679(255); var3 != null; var3 = (class403) this.field955.method1671(-10033)) {
            if (!var3.method432(28015)) {
                var2++;
            }
        }
        return var2;
    }
}
