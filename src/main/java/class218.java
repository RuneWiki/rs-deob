import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class218 {

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Luf;")
    public static class168 field3553 = class148.method1019(-1720, "hitmarks");

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "J")
    public static long field3552;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Z")
    public static boolean field3549;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([Lg;ZIIII)V", line = 11)
    public static final void method1509(class242[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 < arg0.length; var6++) {
            class242 var7 = arg0[var6];
            if (var7 != null && var7.field3977 == arg5) {
                class199.method1403(arg2, var7, arg1, arg4, true);
                class15.method62(arg4, -1, var7, arg2);
                if (var7.field4092 > (var7.field4105 - var7.field3989)) {
                    var7.field4092 = var7.field4105 - var7.field3989;
                }
                if ((var7.field4007 - var7.field4057) < var7.field4079) {
                    var7.field4079 = var7.field4007 - var7.field4057;
                }
                if (var7.field4092 < 0) {
                    var7.field4092 = 0;
                }
                if (var7.field4079 < 0) {
                    var7.field4079 = 0;
                }
                if (var7.field4073 == 0) {
                    class149.method1028(86, var7, arg1);
                }
            }
        }
        field3556++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 55)
    public static final void method1510(byte arg0) {
        class167.field2678 = new class76();
        if (arg0 != -13) {
            field3552 = -118L;
        }
        field3554++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Lll;", line = 72)
    public static final class125 method1511(byte arg0, int arg1) {
        field3551++;
        class125 var2 = (class125) class166.field2659.method185(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class38.field479.method1647(11, (byte) 120, arg1);
        class125 var4 = new class125();
        if (arg0 != -66) {
            return (class125) null;
        }
        if (var3 != null) {
            var4.method885((byte) 105, new class153(var3));
        }
        class166.field2659.method187(var4, (long) arg1, (byte) 10);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)V", line = 103)
    public static final void method1512(int arg0, int arg1, byte arg2) {
        field3555++;
        long var3 = (long) ((arg0 << 16) + arg1);
        if (arg2 == 57) {
            class221 var5 = (class221) class272.field4578.method493(var3, 100);
            if (var5 != null) {
                class5.field71.method1889(var5, arg2 - 181);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V", line = 127)
    public static void method1513(byte arg0) {
        if (arg0 < 43) {
            method1512(-70, -62, (byte) 124);
        }
        field3553 = null;
    }
}
