import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class190 {

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public int field3367 = -1;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public int field3370 = 0;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public int field3369 = -1;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Z")
    public boolean field3371 = true;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Ljd;")
    public static class86 field3368 = class122.method868(":assist:", true);

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[S")
    public static short[] field3372 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field3373 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[Ljd;")
    public static class86[] field3376;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static void method1303(boolean arg0) {
        field3368 = null;
        field3376 = null;
        field3372 = null;
        if (!arg0) {
            method1303(true);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z")
    public static final boolean method1304(int arg0, int arg1) {
        field3364++;
        if (arg0 <= 26) {
            method1308(-69, 84, 32);
        }
        return (arg1 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBLqk;I)V")
    private final void method1305(int arg0, byte arg1, class200 arg2, int arg3) {
        field3374++;
        if (arg3 == 1) {
            this.field3370 = class17.method145(arg1 - 94, arg2.method1405(-3));
        } else if (arg3 == 2) {
            this.field3367 = arg2.method1408((byte) -38);
        } else if (arg3 == 3) {
            this.field3367 = arg2.method1410(-89);
            if (this.field3367 == 65535) {
                this.field3367 = -1;
            }
        } else if (arg3 == 5) {
            this.field3371 = false;
        } else if (arg3 == 7) {
            this.field3369 = class17.method145(-97, arg2.method1405(-3));
        } else if (arg3 == 8) {
            class127.field2446 = arg0;
        } else if (arg3 == 9) {
            arg2.method1410(arg1 - 59);
        } else if (arg3 != 10) {
            if (arg3 == 11) {
                arg2.method1408((byte) -104);
            } else if (arg3 != 12) {
                if (arg3 == 13) {
                    arg2.method1405(-3);
                } else if (arg3 == 14) {
                    arg2.method1408((byte) -114);
                }
            }
        }
        if (arg1 != -9) {
            method1304(-78, 10);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3365++;
        if (arg4 == arg5) {
            class147.method1056(arg1, arg5, arg0, arg3, arg2 ^ 0x1293);
            return;
        }
        if (class49.field1044 <= arg3 - arg5 && class129.field2473 >= arg3 + arg5 && arg0 - arg4 >= class50.field1050 && (arg0 + arg4) <= class56.field1143) {
            class244.method1662(arg3, (byte) -36, arg1, arg4, arg0, arg5);
        } else {
            class107.method763(arg4, arg1, arg5, 0, arg3, arg0);
        }
        if (arg2 != -1) {
            field3373 = 24;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILqk;)V")
    public final void method1307(int arg0, int arg1, class200 arg2) {
        if (arg0 < 3) {
            field3372 = null;
        }
        while (true) {
            int var4 = arg2.method1408((byte) -86);
            if (var4 == 0) {
                field3366++;
                return;
            }
            this.method1305(arg1, (byte) -9, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lde;")
    public static final class107 method1308(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class107 var4 = var3.field4437;
            var3.field4437 = null;
            return var4;
        }
    }
}
