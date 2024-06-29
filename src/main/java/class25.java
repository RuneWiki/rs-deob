import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class25 {

    @OriginalMember(owner = "client!an", name = "e", descriptor = "Ljo;")
    public static class351 field368 = new class351(64, 6);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static void method191(byte arg0) {
        field368 = null;
        if (arg0 > -118) {
            method192(14, -4);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
    public static final void method192(int arg0, int arg1) {
        if (arg0 != 0) {
            method194(59, null, (byte) 57);
        }
        class265.field3746 = -1;
        class450.field6465 = arg1;
        field365++;
        class265.field3746 = -1;
        class79.method601(true);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([IIILts;)V")
    public static final void method193(int[] arg0, int arg1, int arg2, class559 arg3) {
        field366++;
        if (arg2 != 4891) {
            method191((byte) 88);
        }
        if (arg3.field6393 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field6393.length; var5++) {
                if (arg3.field6393[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field6404 != -1) {
                class129 var6 = class203.field2975.method1931((byte) -81, arg3.field6404);
                int var7 = var6.field1679;
                if (var7 == 1) {
                    arg3.field6352 = 1;
                    arg3.field6350 = 0;
                    arg3.field6354 = arg1;
                    arg3.field6409 = 0;
                    arg3.field6371 = 0;
                    if (!arg3.field6430) {
                        class524.method3048((byte) 17, arg3.field6409, arg3, var6);
                    }
                }
                if (var7 == 2) {
                    arg3.field6371 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg3.field6393 == null || arg3.field6393[var9] == -1 || class203.field2975.method1931((byte) -81, arg0[var9]).field1667 >= class203.field2975.method1931((byte) -81, arg3.field6393[var9]).field1667) {
                arg3.field6354 = arg1;
                arg3.field6393 = arg0;
                break;
            }
        }
        if (var8) {
            arg3.field6393 = arg0;
            arg3.field6354 = arg1;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILwq;B)I")
    public static final int method194(int arg0, class176 arg1, byte arg2) {
        if (arg2 <= 51) {
            method193(null, -67, -93, null);
        }
        field367++;
        if (!client.method2049(arg1).method3749(arg0, -101) && arg1.field2529 == null) {
            return -1;
        } else if (arg1.field2502 == null || arg1.field2502.length <= arg0) {
            return -1;
        } else {
            return arg1.field2502[arg0];
        }
    }
}
