import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class3 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[Ltr;")
    public static class160[] field25 = new class160[4];

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field24 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field27 = -1;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lgj;")
    public static class381 field26;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method13(int arg0) {
        field29++;
        if (!class279.field3951) {
            return;
        }
        class184 var1 = class341.method2186(class408.field5883, (byte) 21, class188.field2714);
        if (var1 != null && var1.field2617 != null) {
            class272 var2 = new class272();
            var2.field3848 = var1.field2617;
            var2.field3851 = var1;
            class201.method1332(var2);
        }
        class5.field81 = -1;
        class279.field3951 = false;
        class297.field4161 = -1;
        if (var1 != null) {
            class186.method1277(var1, (byte) 102);
        }
        if (arg0 != -11372) {
            method14(true);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 37)
    public static void method14(boolean arg0) {
        if (!arg0) {
            method13(-12);
        }
        field25 = null;
        field26 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lqm;ILjh;IIILqr;I)V", line = 50)
    public static final void method15(class77 arg0, int arg1, class88 arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        field28++;
        if (arg3 > -73) {
            method13(-87);
        }
        class435 var8 = new class435();
        var8.field6255 = arg5 * 128;
        var8.field6246 = arg7 * 128;
        var8.field6257 = arg1;
        if (arg2 != null) {
            var8.field6267 = arg2;
            int var9 = arg2.field1008;
            int var10 = arg2.field1029;
            if (arg4 == 1 || arg4 == 3) {
                var9 = arg2.field1029;
                var10 = arg2.field1008;
            }
            var8.field6269 = (arg5 + var10) * 128;
            var8.field6248 = arg2.field1010;
            var8.field6249 = arg2.field1070;
            var8.field6247 = (arg7 + var9) * 128;
            var8.field6243 = arg2.field1048;
            var8.field6262 = arg2.field994;
            var8.field6259 = arg2.field1027;
            var8.field6245 = arg2.field997 * 128;
            if (arg2.field1068 != null) {
                var8.field6264 = true;
                var8.method2725((byte) 121);
            }
            if (var8.field6248 != null) {
                var8.field6260 = var8.field6259 + ((int) (Math.random() * (double) (var8.field6262 - var8.field6259)));
            }
            class273.field3872.method509((byte) 104, var8);
        } else if (arg0 != null) {
            var8.field6265 = arg0;
            class135 var11 = arg0.field912;
            if (var11.field1655 != null) {
                var8.field6264 = true;
                var11 = var11.method836((byte) -80);
            }
            if (var11 != null) {
                var8.field6269 = (arg5 + var11.field1697) * 128;
                var8.field6247 = (var11.field1697 + arg7) * 128;
                var8.field6249 = class217.method1452(arg0, (byte) -111);
                var8.field6245 = var11.field1689 * 128;
                var8.field6243 = var11.field1696;
            }
            class138.field1713.method509((byte) 103, var8);
        } else if (arg6 != null) {
            var8.field6256 = arg6;
            var8.field6247 = (arg6.method242(-30129) + arg7) * 128;
            var8.field6269 = (arg6.method242(-30129) + arg5) * 128;
            var8.field6249 = class130.method808(arg6, (byte) 72);
            var8.field6243 = arg6.field469;
            var8.field6245 = arg6.field471 * 128;
            class11.field150.method1886(var8, (long) arg6.field5620, 1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 152)
    public static final int method16(String arg0, int arg1) {
        if (arg1 != -6607) {
            field25 = null;
        }
        field22++;
        for (int var2 = 0; var2 < class293.field4093.length; var2++) {
            if (class293.field4093[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }
}
