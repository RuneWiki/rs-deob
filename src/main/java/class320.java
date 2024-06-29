import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class320 {

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field5093 = 7759444;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
    public static int[] field5094 = new int[25];

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field5096 = -1;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lbi;")
    public static class73 field5092;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method2258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5091++;
        int var6 = class315.method2235(class273.field4522, arg4, class296.field4758, 120);
        int var7 = class315.method2235(class273.field4522, arg0, class296.field4758, 127);
        int var8 = class315.method2235(class355.field5640, arg1, class74.field1269, 126);
        int var9 = class315.method2235(class355.field5640, arg2, class74.field1269, 112);
        if (arg3 >= -18) {
            field5092 = (class73) null;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class161.method1253(var9, class353.field5599[var10], -1, arg5, var8);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 33)
    public static void method2259(byte arg0) {
        field5092 = null;
        if (arg0 <= -41) {
            field5094 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 46)
    public static final void method2260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field5095++;
        class216 var13 = new class216();
        var13.field3452 = arg8;
        if (arg7 != -11724) {
            return;
        }
        var13.field3466 = arg11;
        var13.field3468 = arg3;
        var13.field3459 = arg2;
        var13.field3450 = arg1;
        var13.field3462 = arg10;
        var13.field3453 = arg0;
        var13.field3451 = arg9;
        var13.field3449 = arg5;
        var13.field3464 = arg6;
        var13.field3460 = arg4;
        var13.field3455 = arg12;
        class272.field4512.method2302((byte) -72, var13);
    }
}
