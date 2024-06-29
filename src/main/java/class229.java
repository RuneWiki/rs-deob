import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class229 {

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field4125 = 0;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static volatile int field4126 = 0;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lvb;")
    public static class67 field4128 = new class67();

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static final void method1593(int arg0) {
        field4124++;
        if (class253.field4431 != null) {
            class253.field4431.method430(-19683);
        }
        if (class59.field973 != null) {
            class59.field973.method430(-19683);
        }
        if (arg0 > -103) {
            method1594(-56, (class163) null);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILhh;)I")
    public static final int method1594(int arg0, class163 arg1) {
        field4127++;
        if (arg1.method1221(arg0 ^ 0xFFFFA5C8) == 0) {
            return -1;
        }
        for (int var2 = arg0; var2 < class127.field2469.field4096; var2++) {
            if (class127.field2469.field4098[var2].method1185(-115, arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILpg;IZIIII)V")
    public static final void method1595(int arg0, int arg1, class81 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field4123++;
        if (arg5 != -3781) {
            field4128 = null;
        }
        if (arg3 < 0 || arg3 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var11 = arg2.method622(true);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg2.method622(true);
                    return;
                }
                if (var11 <= 49) {
                    arg2.method622(true);
                }
            }
        }
        if (!arg4) {
            class123.field2344[arg1][arg3][arg0] = 0;
        }
        while (true) {
            int var9 = arg2.method622(true);
            if (var9 == 0) {
                if (arg4) {
                    class228.field4107[0][arg3][arg0] = class161.field2958[0][arg3][arg0];
                    return;
                } else if (arg1 == 0) {
                    class228.field4107[0][arg3][arg0] = -class223.method1577(arg3 + arg8 + 932731, arg7 + 556238 - -arg0, 10) * 8;
                    return;
                } else {
                    class228.field4107[arg1][arg3][arg0] = class228.field4107[arg1 - 1][arg3][arg0] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg2.method622(true);
                if (!arg4) {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg1 == 0) {
                        class228.field4107[0][arg3][arg0] = -var10 * 8;
                        return;
                    }
                    class228.field4107[arg1][arg3][arg0] = class228.field4107[arg1 - 1][arg3][arg0] - (var10 * 8);
                    return;
                }
                class228.field4107[0][arg3][arg0] = var10 * 8 + class161.field2958[0][arg3][arg0];
                return;
            }
            if (var9 <= 49) {
                class222.field4048[arg1][arg3][arg0] = arg2.method635(91);
                class234.field4180[arg1][arg3][arg0] = (byte) ((var9 - 2) / 4);
                class58.field959[arg1][arg3][arg0] = (byte) class7.method50(3, var9 + arg6 - 2);
            } else if (var9 > 81) {
                class116.field2206[arg1][arg3][arg0] = (byte) (var9 - 81);
            } else if (!arg4) {
                class123.field2344[arg1][arg3][arg0] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    public static final int method1596(int arg0, int arg1) {
        field4122++;
        if (arg1 < 0) {
            return 0;
        }
        if (arg0 != -16145) {
            method1594(-96, (class163) null);
        }
        class197 var2 = (class197) class76.field1427.method1743((long) arg1, false);
        if (var2 == null) {
            return class164.method1234(arg1, (byte) 90).field222;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3557.length; var4++) {
            if (var2.field3557[var4] == -1) {
                var3++;
            }
        }
        return var3 + class164.method1234(arg1, (byte) 90).field222 - var2.field3557.length;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1597(byte arg0) {
        field4128 = null;
        if (arg0 != -75) {
            field4128 = null;
        }
    }
}
