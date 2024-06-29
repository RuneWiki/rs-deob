import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class256 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "[Lab;")
    public static class667[] field3132 = null;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Loh;")
    public static class404 field3124;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static final void method1523(int arg0) {
        if (arg0 != 6424) {
            field3132 = null;
        }
        class396.field5430 = false;
        field3133++;
        class486.method2933(true);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLtp;I)Ljava/lang/String;")
    public static final String method1524(boolean arg0, class532 arg1, int arg2) {
        if (!arg0) {
            method1528(7, 114, -32, 68, 18, 95, -80);
        }
        field3130++;
        if (!client.method1779(arg1).method4187(arg2, -113) && arg1.field7588 == null) {
            return null;
        } else if (arg1.field7545 == null || arg1.field7545.length <= arg2 || arg1.field7545[arg2] == null || arg1.field7545[arg2].trim().length() == 0) {
            return class19.field164 ? "Hidden-" + arg2 : null;
        } else {
            return arg1.field7545[arg2];
        }
    }

    @OriginalMember(owner = "client!se", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3129++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BIII)V")
    public static final void method1525(byte arg0, int arg1, int arg2, int arg3) {
        field3128++;
        int var4 = class464.field6624 + arg3;
        int var5 = 2 % ((arg0 + 68) / 37);
        int var6 = class181.field2144 + arg1;
        if (class638.field9170 == null || arg3 < 0 || arg1 < 0 || class489.field6976 <= arg3 || arg1 >= class153.field1677 || class654.field9334.field9858.method2982(-122) == 0 && class90.field937.field4628 != arg2) {
            return;
        }
        long var7 = (long) (var4 | arg2 << 28 | var6 << 14);
        class723 var9 = (class723) class450.field6490.method1754(false, var7);
        if (var9 == null) {
            class711.method3976(arg2, arg3, arg1);
            return;
        }
        class602 var10 = (class602) var9.field10131.method1719(65280);
        if (var10 == null) {
            class711.method3976(arg2, arg3, arg1);
            return;
        }
        class441 var11 = (class441) class711.method3976(arg2, arg3, arg1);
        if (var11 == null) {
            var11 = new class441(arg3 << 9, class504.field7120[arg2].method1671(arg1, arg3, (byte) 101), arg1 << 9, arg2, arg2);
        } else {
            var11.field6392 = var11.field6396 = -1;
        }
        var11.field6414 = var10.field8568;
        var11.field6410 = var10.field8567;
        label57: while (true) {
            class602 var12 = (class602) var9.field10131.method1723(-20665);
            if (var12 == null) {
                break;
            }
            if (var11.field6410 != var12.field8567) {
                var11.field6406 = var12.field8568;
                var11.field6392 = var12.field8567;
                while (true) {
                    class602 var13 = (class602) var9.field10131.method1723(-20665);
                    if (var13 == null) {
                        break label57;
                    }
                    if (var11.field6410 != var13.field8567 && var11.field6392 != var13.field8567) {
                        var11.field6402 = var13.field8568;
                        var11.field6396 = var13.field8567;
                    }
                }
            }
        }
        int var14 = class676.method3845((arg1 << 9) + 256, (arg3 << 9) + 256, 0, arg2);
        var11.field4628 = (byte) arg2;
        var11.field6398 = 0;
        var11.field4635 = arg3 << 9;
        var11.field4633 = (byte) arg2;
        var11.field4629 = arg1 << 9;
        var11.field4627 = var14;
        if (class728.method4056(arg1, arg3, (byte) 71)) {
            var11.field4633++;
        }
        class42.method249(arg2, arg3, arg1, var14, var11);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static void method1526(int arg0) {
        if (arg0 > -87) {
            method1526(33);
        }
        field3124 = null;
        field3132 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
    public class256(int arg0, int arg1) {
        this.field3126 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z")
    public static final boolean method1527(int arg0, int arg1) {
        field3131++;
        if (arg0 != 27848937) {
            method1527(122, -12);
        }
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 <= 35) {
            field3124 = null;
        }
        class291.field3582 = arg1;
        class342.field4439 = arg0;
        class686.field9683 = arg4;
        class211.field2487 = arg2;
        class80.field839 = arg3;
        class699.field9840 = arg5;
        field3125++;
    }
}
