import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class146 {

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[Lal;")
    private class252[] field2337;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Lad;")
    public static class275 field2336 = new class275(64);

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2345 = 0;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "[I")
    public static int[] field2346 = new int[1000];

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Lad;")
    public static class275 field2347 = new class275(64);

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Lad;")
    public static class275 field2348 = new class275(64);

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2350 = "Loaded world list data";

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "J")
    private long field2339;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lhg;")
    public static class190 field2344;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lal;")
    private class252 field2341;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method994(int arg0) {
        field2347 = null;
        field2346 = null;
        field2336 = null;
        if (arg0 <= 72) {
            field2346 = null;
        }
        field2348 = null;
        field2344 = null;
        field2350 = null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)Lal;")
    public final class252 method995(int arg0) {
        field2338++;
        if (this.field2341 == null) {
            return null;
        }
        class252 var2 = this.field2337[(int) (this.field2339 & (long) (this.field2342 - 1))];
        while (this.field2341 != var2) {
            if (this.field2341.field4135 == this.field2339) {
                class252 var3 = this.field2341;
                this.field2341 = this.field2341.field4140;
                return var3;
            }
            this.field2341 = this.field2341.field4140;
        }
        this.field2341 = null;
        return arg0 == 40 ? null : null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IJ)Lal;")
    public final class252 method996(int arg0, long arg1) {
        field2343++;
        this.field2339 = arg1;
        class252 var4 = this.field2337[(int) ((long) (this.field2342 - arg0) & arg1)];
        for (this.field2341 = var4.field4140; this.field2341 != var4; this.field2341 = this.field2341.field4140) {
            if (this.field2341.field4135 == arg1) {
                class252 var5 = this.field2341;
                this.field2341 = this.field2341.field4140;
                return var5;
            }
        }
        this.field2341 = null;
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method997(int arg0, String arg1) {
        field2334++;
        for (int var2 = 0; var2 < class95.field1507.length; var2++) {
            if (class95.field1507[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        if (arg0 != -1) {
            field2350 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Lth;")
    public static final class119 method998(int arg0) {
        field2335++;
        if (class262.field4272 == null) {
            return null;
        } else if (arg0 == -1) {
            for (class119 var1 = (class119) class229.field3593.method1891(false); var1 != null; var1 = (class119) class229.field3593.method1891(false)) {
                class125 var2 = class223.method1550((byte) 72, var1.field1877);
                if (var2 != null && var2.field2014 && var2.method865(24525)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lal;IJ)V")
    public final void method999(class252 arg0, int arg1, long arg2) {
        field2333++;
        int var5 = 99 / ((-arg1 - 74) / 48);
        if (arg0.field4142 != null) {
            arg0.method1708((byte) 90);
        }
        class252 var6 = this.field2337[(int) ((long) (this.field2342 - 1) & arg2)];
        arg0.field4142 = var6.field4142;
        arg0.field4140 = var6;
        arg0.field4142.field4140 = arg0;
        arg0.field4135 = arg2;
        arg0.field4140.field4142 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
    public class146(int arg0) {
        this.field2342 = arg0;
        this.field2337 = new class252[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class252 var3 = this.field2337[var2] = new class252();
            var3.field4140 = var3;
            var3.field4142 = var3;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IS)Z")
    public static final boolean method1000(int arg0, short arg1) {
        field2340++;
        if (arg1 == 40 || arg1 == 41 || arg1 == 18 || arg1 == 57 || arg1 == 6 || arg1 == 10 || arg1 == 8 || arg1 == 43) {
            return true;
        }
        if (arg0 != 50) {
            field2349 = -112;
        }
        if (arg1 == 36 || arg1 == 33 || arg1 == 1010 || arg1 == 1005) {
            return true;
        } else if (arg1 == 32 || arg1 == 29 || arg1 == 1 || arg1 == 17 || arg1 == 2) {
            return true;
        } else {
            return arg1 == 28 || arg1 == 24 || arg1 == 37 || arg1 == 49 || arg1 == 50 || arg1 == 23;
        }
    }
}
