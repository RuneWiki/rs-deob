import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class211 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3488 = 0;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lph;")
    public static class229 field3495 = class266.method1858("headicons_pk", 0);

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3490 = 0;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lph;")
    private static class229 field3493 = class266.method1858("Loading textures )2 ", 0);

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lph;")
    public static class229 field3494 = field3493;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lph;")
    public static class229 field3497 = class266.method1858("Wordpack geladen)3", 0);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIILrk;Lrk;IIJ)V", line = 8)
    public static final void method1484(int arg0, int arg1, int arg2, int arg3, class216 arg4, class216 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class207 var10 = new class207();
        var10.field3414 = arg8;
        var10.field3415 = arg1 * 128 + 64;
        var10.field3411 = arg2 * 128 + 64;
        var10.field3413 = arg3;
        var10.field3416 = arg4;
        var10.field3403 = arg5;
        var10.field3417 = arg6;
        var10.field3410 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class225.field3705[var11][arg1][arg2] == null) {
                class225.field3705[var11][arg1][arg2] = new class72(var11, arg1, arg2);
            }
        }
        class225.field3705[arg0][arg1][arg2].field1224 = var10;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V", line = 61)
    public static final void method1485(byte arg0, int arg1) {
        int var2 = 126 % ((62 - arg0) / 44);
        field3492++;
        class281 var3 = class135.method957(0, arg1, 8);
        var3.method1933(0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 79)
    public static final void method1486(int arg0) {
        if (arg0 != 0) {
            method1484(102, -88, 50, -93, (class216) null, (class216) null, -33, 67, -69L);
        }
        field3496++;
        class232.field3838.method1414(113);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 94)
    public static void method1487(byte arg0) {
        field3493 = null;
        if (arg0 <= -1) {
            field3497 = null;
            field3495 = null;
            field3494 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLhb;)V", line = 111)
    public static final void method1488(byte arg0, class164 arg1) {
        field3491++;
        if (arg0 != -5) {
            method1484(-116, -63, 75, 72, (class216) null, (class216) null, -81, 82, 45L);
        }
        byte[] var2 = new byte[24];
        if (class102.field1738 != null) {
            try {
                class102.field1738.method4(0L, 0);
                class102.field1738.method13(var2, -2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method1164(0, 24, true, var2);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 165)
    public static final void method1489(int arg0) {
        field3489++;
        try {
            if (class170.field2802 == 1) {
                int var1 = class224.field3685.method448((byte) -116);
                if (var1 > 0 && class224.field3685.method473((byte) -103)) {
                    int var2 = var1 - class124.field2076;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class224.field3685.method465(var2, 0);
                    return;
                }
                class224.field3685.method437(-113);
                class224.field3685.method445(100);
                class232.field3837 = null;
                class108.field1853 = null;
                if (class133.field2154 == null) {
                    class170.field2802 = 0;
                } else {
                    class170.field2802 = 2;
                }
            }
            if (arg0 >= -31) {
                method1485((byte) -38, 29);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class224.field3685.method437(-58);
            class232.field3837 = null;
            class133.field2154 = null;
            class108.field1853 = null;
            class170.field2802 = 0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIII)Z", line = 208)
    public static final boolean method1490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
