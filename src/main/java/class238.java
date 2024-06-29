import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class238 implements class148 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field3618 = 127;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[Z")
    public static boolean[] field3621 = new boolean[100];

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Z")
    public static boolean field3622 = false;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field3625 = 0;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[I")
    public static int[] field3623;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLhb;)V", line = 6)
    public static final void method1658(byte arg0, class35 arg1) {
        if (arg0 > -18) {
            return;
        }
        for (int var2 = 0; var2 < class227.field3516; var2++) {
            int var3 = arg1.method241(0);
            int var4 = arg1.method300(-1394191632);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class12.field129[var3] != null) {
                class12.field129[var3].field3466 = var4;
            }
        }
        field3619++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lsa;ILlb;Llb;Llb;)Z", line = 39)
    public static final boolean method1659(class109 arg0, int arg1, class211 arg2, class211 arg3, class211 arg4) {
        if (arg1 != 11) {
            return false;
        }
        class213.field3383 = arg0;
        class96.field1421 = arg2;
        class4.field24 = arg3;
        class288.field4531 = arg4;
        field3617++;
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([IIJB)Ljava/lang/String;", line = 56)
    public final String method1101(int[] arg0, int arg1, long arg2, byte arg3) {
        field3624++;
        if (arg1 == 0) {
            class218 var6 = class163.method1169(arg3 ^ 0xFFFFFFB5, arg0[0]);
            return var6.method1556(false, (int) arg2);
        } else if (arg1 == 1 || arg1 == 10) {
            class274 var7 = class225.method1603((int) arg2, arg3 ^ 0x3A);
            return var7.field4149;
        } else if (arg3 == 58) {
            return arg1 == 6 || arg1 == 7 || arg1 == 11 ? class163.method1169(arg3 ^ 0xFFFFFFB8, arg0[0]).method1556(false, (int) arg2) : null;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 91)
    public static void method1660(byte arg0) {
        int var1 = -60 / ((arg0 + 70) / 35);
        field3621 = null;
        field3623 = null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V", line = 102)
    public static final void method1661(byte arg0) {
        if (arg0 >= -116) {
            field3621 = (boolean[]) null;
        }
        for (class152 var1 = (class152) class310.field4833.method986(false); var1 != null; var1 = (class152) class310.field4833.method982(14877)) {
            if (var1.field2284 > 0) {
                var1.field2284--;
            }
            if (var1.field2284 != 0) {
                if (var1.field2282 > 0) {
                    var1.field2282--;
                }
                if (var1.field2282 == 0 && var1.field2288 >= 1 && var1.field2285 >= 1 && var1.field2288 <= 102 && var1.field2285 <= 102 && (var1.field2292 < 0 || class173.method1262(var1.field2295, -6, var1.field2292))) {
                    class41.method365(var1.field2295, var1.field2297, var1.field2279, var1.field2286, var1.field2285, 0, var1.field2292, var1.field2288);
                    var1.field2282 = -1;
                    if (var1.field2292 == var1.field2280 && var1.field2280 == -1) {
                        var1.method1554((byte) -122);
                    } else if (var1.field2292 == var1.field2280 && var1.field2286 == var1.field2278 && var1.field2295 == var1.field2281) {
                        var1.method1554((byte) -98);
                    }
                }
            } else if (var1.field2280 < 0 || class173.method1262(var1.field2281, -6, var1.field2280)) {
                class41.method365(var1.field2281, var1.field2297, var1.field2279, var1.field2278, var1.field2285, 0, var1.field2280, var1.field2288);
                var1.method1554((byte) -121);
            }
        }
        field3620++;
    }
}
