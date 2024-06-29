import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class71 {

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    private int field1082 = 0;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[Ls;")
    public class381[] field1068;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field1066 = 0;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1073 = "Loaded interfaces";

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field1075 = -13423323;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "J")
    private long field1079;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lfi;")
    public static class166 field1081;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Ls;")
    private class381 field1080;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Ls;")
    private class381 field1083;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Lie;")
    public static class53 field1078;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Ls;", line = 5)
    public final class381 method605(int arg0) {
        field1072++;
        if (this.field1080 == null) {
            return null;
        }
        int var2 = -56 / ((arg0 - 8) / 33);
        class381 var3 = this.field1068[(int) ((long) (this.field1071 - 1) & this.field1079)];
        while (this.field1080 != var3) {
            if (this.field1080.field5349 == this.field1079) {
                class381 var4 = this.field1080;
                this.field1080 = this.field1080.field5346;
                return var4;
            }
            this.field1080 = this.field1080.field5346;
        }
        this.field1080 = null;
        return null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Ls;", line = 37)
    public final class381 method606(byte arg0) {
        field1074++;
        if (this.field1082 > 0 && this.field1068[this.field1082 - 1] != this.field1083) {
            class381 var2 = this.field1083;
            this.field1083 = var2.field5346;
            return var2;
        }
        if (arg0 <= 37) {
            method609(49);
        }
        while (this.field1082 < this.field1071) {
            class381 var3 = this.field1068[this.field1082++].field5346;
            if (this.field1068[this.field1082 - 1] != var3) {
                this.field1083 = var3.field5346;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 71)
    public final void method607(int arg0) {
        for (int var2 = arg0; var2 < this.field1071; var2++) {
            class381 var3 = this.field1068[var2];
            while (true) {
                class381 var4 = var3.field5346;
                if (var3 == var4) {
                    break;
                }
                var4.method2367(5);
            }
        }
        field1069++;
        this.field1080 = null;
        this.field1083 = null;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)Ls;", line = 107)
    public final class381 method608(int arg0) {
        field1070++;
        this.field1082 = 0;
        int var2 = 37 / ((25 - arg0) / 45);
        return this.method606((byte) 110);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V", line = 119)
    public static void method609(int arg0) {
        field1073 = null;
        if (arg0 == -22758) {
            field1078 = null;
            field1081 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)I", line = 132)
    public final int method610(int arg0) {
        field1065++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -2036) {
            return -98;
        }
        while (this.field1071 > var3) {
            class381 var4 = this.field1068[var3];
            for (class381 var5 = var4.field5346; var5 != var4; var5 = var5.field5346) {
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[Ls;)I", line = 166)
    public final int method611(byte arg0, class381[] arg1) {
        field1076++;
        if (arg0 <= 23) {
            this.method607(-99);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1071; var4++) {
            class381 var5 = this.field1068[var4];
            for (class381 var6 = var5.field5346; var6 != var5; var6 = var6.field5346) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(JILs;)V", line = 203)
    public final void method612(long arg0, int arg1, class381 arg2) {
        if (arg2.field5348 != null) {
            arg2.method2367(5);
        }
        field1064++;
        class381 var5 = this.field1068[(int) ((long) (this.field1071 + arg1) & arg0)];
        arg2.field5346 = var5;
        arg2.field5348 = var5.field5348;
        arg2.field5348.field5346 = arg2;
        arg2.field5346.field5348 = arg2;
        arg2.field5349 = arg0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)Luf;", line = 225)
    public static final class282 method613(int arg0, byte arg1) {
        field1067++;
        class410 var2 = class348.field4722;
        class282 var4;
        synchronized (class348.field4722) {
            if (arg1 > -67) {
                return null;
            }
            var4 = (class282) class348.field4722.method2537(-72, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class288.field3856.method2633(class7.method38(false, arg0), -1, class385.method2390(74, arg0));
        class282 var6 = new class282();
        var6.field3761 = arg0;
        if (var5 != null) {
            var6.method1781(0, new class289(var5));
        }
        class410 var7 = class348.field4722;
        synchronized (class348.field4722) {
            class348.field4722.method2542(var6, (byte) -125, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IJ)Ls;", line = 259)
    public final class381 method614(int arg0, long arg1) {
        field1077++;
        this.field1079 = arg1;
        class381 var4 = this.field1068[(int) (arg1 & (long) (this.field1071 - 1))];
        for (this.field1080 = var4.field5346; this.field1080 != var4; this.field1080 = this.field1080.field5346) {
            if (this.field1080.field5349 == arg1) {
                class381 var5 = this.field1080;
                this.field1080 = this.field1080.field5346;
                return var5;
            }
        }
        if (arg0 > -75) {
            return null;
        } else {
            this.field1080 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V", line = 292)
    public class71(int arg0) {
        this.field1071 = arg0;
        this.field1068 = new class381[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class381 var3 = this.field1068[var2] = new class381();
            var3.field5346 = var3;
            var3.field5348 = var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)I", line = 313)
    public final int method615(boolean arg0) {
        if (arg0) {
            this.field1083 = null;
        }
        field1063++;
        return this.field1071;
    }
}
