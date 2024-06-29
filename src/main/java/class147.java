import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class147 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field2321 = -1;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Luj;")
    public static class169 field2320;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lgi;")
    public static class310 field2322;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 6)
    public static void method1081(byte arg0) {
        field2320 = null;
        if (arg0 == 94) {
            field2322 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILjava/lang/String;)V", line = 21)
    public static final void method1082(int arg0, int arg1, String arg2) {
        field2323++;
        class34 var3 = class91.method656(arg1, -2, 2);
        var3.method307(-19063);
        if (arg0 == 28580) {
            var3.field504 = arg2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 36)
    public static final void method1083(int arg0) {
        field2315++;
        if (class62.field914 || class6.field109 == 2) {
            return;
        }
        try {
            class209.method1531("tbrefresh", 48, class96.field1266);
            int var1 = 65 / ((arg0 - 3) / 39);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIBIIII)V", line = 62)
    public static final void method1084(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 + arg6;
        if (arg2 >= -98) {
            method1085(-43);
        }
        for (int var8 = arg6; var8 < var7; var8++) {
            class256.method1853(class284.field4402[var8], arg3, arg5, arg0, 0);
        }
        int var9 = arg3 + arg4;
        int var10 = arg1 - arg4;
        field2317++;
        int var11 = arg0 - arg4;
        for (int var12 = arg1; var12 > var10; var12--) {
            class256.method1853(class284.field4402[var12], arg3, arg5, arg0, 0);
        }
        for (int var13 = var7; var13 <= var10; var13++) {
            int[] var14 = class284.field4402[var13];
            class256.method1853(var14, arg3, arg5, var9, 0);
            class256.method1853(var14, var11, arg5, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 110)
    public static final void method1085(int arg0) {
        class263.field4114 = (byte[][][]) null;
        class24.field360 = (byte[][][]) null;
        if (arg0 != -1) {
            field2319 = 76;
        }
        class66.field943 = (byte[][][]) null;
        class135.field1979 = null;
        class39.field550 = null;
        class70.field974 = (byte[][][]) null;
        class253.field3964 = null;
        field2316++;
        class314.field4919 = (byte[][][]) null;
        class175.field2868 = (int[][][]) null;
        class329.field5151 = null;
        class63.field922 = null;
        class10.field194 = null;
    }
}
