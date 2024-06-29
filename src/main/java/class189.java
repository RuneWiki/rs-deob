import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class189 {

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
    private int field2579 = 0;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "[Lqs;")
    public class359[] field2565;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2569 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "[J")
    public static long[] field2567 = new long[256];

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2576;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field2574;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "J")
    private long field2568;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "Ljf;")
    public static class119 field2571;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "Lqs;")
    private class359 field2557;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "Lqs;")
    private class359 field2573;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2567[var0] = var1;
        }
        field2576 = "Loading...";
        field2574 = new String[8];
        field2578 = 0;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([Lqs;B)I", line = 3)
    public final int method1201(class359[] arg0, byte arg1) {
        field2575++;
        if (arg1 != 32) {
            return -29;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2556; var4++) {
            class359 var5 = this.field2565[var4];
            for (class359 var6 = var5.field5243; var6 != var5; var6 = var6.field5243) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IJLqs;)V", line = 37)
    public final void method1202(int arg0, long arg1, class359 arg2) {
        field2564++;
        if (arg2.field5247 != null) {
            arg2.method2290((byte) 98);
        }
        class359 var5 = this.field2565[(int) ((long) (this.field2556 - 1) & arg1)];
        if (arg0 != -1) {
            this.method1206(-1);
        }
        arg2.field5243 = var5;
        arg2.field5247 = var5.field5247;
        arg2.field5247.field5243 = arg2;
        arg2.field5248 = arg1;
        arg2.field5243.field5247 = arg2;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)I", line = 58)
    public final int method1203(byte arg0) {
        if (arg0 != -58) {
            method1210(false);
        }
        field2566++;
        return this.field2556;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BJ)Lqs;", line = 69)
    public final class359 method1204(byte arg0, long arg1) {
        this.field2568 = arg1;
        field2560++;
        class359 var4 = this.field2565[(int) ((long) (this.field2556 - 1) & arg1)];
        if (arg0 > -59) {
            this.field2573 = null;
        }
        for (this.field2557 = var4.field5243; this.field2557 != var4; this.field2557 = this.field2557.field5243) {
            if (this.field2557.field5248 == arg1) {
                class359 var5 = this.field2557;
                this.field2557 = this.field2557.field5243;
                return var5;
            }
        }
        this.field2557 = null;
        return null;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)Z", line = 100)
    public static final boolean method1205(byte arg0) {
        if (arg0 > -16) {
            field2578 = 7;
        }
        field2558++;
        return class213.field2908 != 0 || class56.field642 >= 2;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 113)
    public final void method1206(int arg0) {
        int var2 = 0;
        int var3 = -87 % ((11 - arg0) / 45);
        while (this.field2556 > var2) {
            class359 var4 = this.field2565[var2];
            while (true) {
                class359 var5 = var4.field5243;
                if (var4 == var5) {
                    var2++;
                    break;
                }
                var5.method2290((byte) 98);
            }
        }
        field2572++;
        this.field2557 = null;
        this.field2573 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)Lqs;", line = 146)
    public final class359 method1207(boolean arg0) {
        field2559++;
        if (this.field2579 > 0 && this.field2565[this.field2579 - 1] != this.field2573) {
            class359 var2 = this.field2573;
            this.field2573 = var2.field5243;
            return var2;
        }
        while (this.field2556 > this.field2579) {
            class359 var3 = this.field2565[this.field2579++].field5243;
            if (this.field2565[this.field2579 - 1] != var3) {
                this.field2573 = var3.field5243;
                return var3;
            }
        }
        if (arg0) {
            method1213((byte) 83, -115);
        }
        return null;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I", line = 179)
    public final int method1208(int arg0) {
        field2563++;
        int var2 = 0;
        if (arg0 > -108) {
            this.field2557 = null;
        }
        for (int var3 = 0; var3 < this.field2556; var3++) {
            class359 var4 = this.field2565[var3];
            for (class359 var5 = var4.field5243; var5 != var4; var5 = var5.field5243) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)Lqs;", line = 210)
    public final class359 method1209(int arg0) {
        field2570++;
        if (this.field2557 == null) {
            return null;
        }
        class359 var2 = this.field2565[(int) ((long) (this.field2556 + arg0) & this.field2568)];
        while (this.field2557 != var2) {
            if (this.field2557.field5248 == this.field2568) {
                class359 var3 = this.field2557;
                this.field2557 = this.field2557.field5243;
                return var3;
            }
            this.field2557 = this.field2557.field5243;
        }
        this.field2557 = null;
        return null;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V", line = 240)
    public static void method1210(boolean arg0) {
        field2569 = null;
        field2576 = null;
        field2567 = null;
        field2571 = null;
        field2574 = null;
        if (!arg0) {
            method1210(true);
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)V", line = 261)
    public static final void method1211(boolean arg0) {
        class257.field3504.method933(class37.field363, class25.field245 ? class419.field6016 + 256 : -1);
        field2577++;
        if (arg0) {
            field2571 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)Lqs;", line = 272)
    public final class359 method1212(int arg0) {
        field2562++;
        this.field2579 = 0;
        if (arg0 > -14) {
            field2571 = null;
        }
        return this.method1207(false);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I)V", line = 295)
    public class189(int arg0) {
        this.field2565 = new class359[arg0];
        this.field2556 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class359 var3 = this.field2565[var2] = new class359();
            var3.field5247 = var3;
            var3.field5243 = var3;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BI)I", line = 346)
    public static final int method1213(byte arg0, int arg1) {
        if (arg0 >= -64) {
            field2561 = 56;
        }
        field2555++;
        return arg1 >>> 10;
    }
}
