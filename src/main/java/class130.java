import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class130 {

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[Lra;")
    public static class306[] field1865 = new class306[8];

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1863 = -2;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1867 = "Loading...";

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Lc;")
    public static class291 field1866;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLfe;Z)V")
    public static final void method831(byte arg0, class231 arg1, boolean arg2) {
        field1868++;
        int var3 = arg1.field3648 == 0 ? arg1.field3686 : arg1.field3648;
        int var4 = arg1.field3720 == 0 ? arg1.field3730 : arg1.field3720;
        if (arg0 < 35) {
            field1863 = -92;
        }
        class295.method1992(var3, arg1.field3595, class68.field1018[arg1.field3595 >> 16], false, arg2, var4);
        if (arg1.field3578 != null) {
            class295.method1992(var3, arg1.field3595, arg1.field3578, false, arg2, var4);
        }
        class104 var5 = (class104) class115.field1674.method1064(-1, (long) arg1.field3595);
        if (var5 != null) {
            class60.method383(var5.field1511, -114, var3, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIZI)V")
    public static final void method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field1869++;
        class183 var10 = null;
        for (class183 var11 = (class183) class192.field3051.method1548(0); var11 != null; var11 = (class183) class192.field3051.method1549(-126)) {
            if (var11.field2878 == arg7 && var11.field2870 == arg9 && var11.field2877 == arg4 && var11.field2879 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class183();
            var10.field2878 = arg7;
            var10.field2870 = arg9;
            var10.field2877 = arg4;
            var10.field2879 = arg6;
            class148.method1004((byte) 3, var10);
            class192.field3051.method1540(var10, (byte) -92);
        }
        var10.field2882 = arg3;
        if (arg8) {
            method831((byte) -32, (class231) null, true);
        }
        var10.field2886 = arg0;
        var10.field2871 = arg1;
        var10.field2884 = arg5;
        var10.field2887 = arg2;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1864++;
        if (arg3 > -109) {
            method831((byte) -62, (class231) null, false);
        }
        if (class56.field816 <= arg0 && arg4 <= class187.field2938 && arg2 >= class115.field1678 && class60.field882 >= arg6) {
            if (arg1 == 1) {
                class228.method1605(-13295, arg5, arg2, arg0, arg4, arg6);
            } else {
                class206.method1419(13270, arg5, arg0, arg1, arg6, arg4, arg2);
            }
        } else if (arg1 == 1) {
            class178.method1263(arg4, arg0, 117, arg5, arg2, arg6);
        } else {
            class184.method1302(arg5, arg2, arg0, arg6, arg1, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static final void method834(int arg0) {
        field1871++;
        if (arg0 == 17938) {
            class50.field636.method1511((byte) 127);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V")
    public static void method835(boolean arg0) {
        field1866 = null;
        field1867 = null;
        if (arg0) {
            method833(-93, 72, 22, 23, -93, -69, 96);
        }
        field1865 = null;
    }
}
