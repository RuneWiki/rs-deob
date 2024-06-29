import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class93 extends class98 {

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "[I")
    public static int[] field1124 = new int[13];

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)V")
    public static void method517(byte arg0) {
        field1124 = null;
        if (arg0 > -60) {
            method518(-13, 82, 23, (byte) -15, -51, 77, 118, 55, -127);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method518(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1122++;
        if (arg5 >= 1 && arg7 >= 1 && arg5 <= (class176.field2403 - 2) && (class383.field5395 - 2) >= arg7) {
            if (!class12.method93(1) && !class310.method2050(arg8, (byte) -77, arg7, class422.field6035, arg5)) {
                return;
            }
            if (class250.field3570 == null) {
                return;
            }
            int var9 = arg8;
            if (arg8 < 3 && class21.method157(arg7, 2, arg5)) {
                var9 = arg8 + 1;
            }
            class348.method2224(class151.field1873, arg1, arg7, 100, class102.field1247[arg8], arg5, arg8, var9);
            if (arg0 >= 0) {
                boolean var10 = class332.field4706;
                class332.field4706 = true;
                class311.method2052(arg2, (byte) 81, arg5, false, false, arg0, class102.field1247[arg8], arg8, arg6, var9, class151.field1873, arg4, arg7);
                class332.field4706 = var10;
            }
        }
        if (arg3 >= -8) {
            field1126 = -118;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        field1125++;
        if (arg0 != 0) {
            field1124 = null;
        }
        return class189.field2722;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)I")
    public static final int method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg1;
            arg1 = var7;
        }
        int var8 = arg0 & 0x3;
        if (arg3 != 8) {
            method517((byte) -6);
        }
        field1127++;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg5;
        } else if (var8 == 2) {
            return 8 - arg4 - arg6;
        } else {
            return 7 + 1 - arg5 - arg1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class93() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IC)Z")
    public static final boolean method520(int arg0, char arg1) {
        field1123++;
        if (arg0 == -7625) {
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return false;
        }
    }
}
