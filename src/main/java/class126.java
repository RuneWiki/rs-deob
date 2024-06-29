import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class126 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lri;")
    public static class301 field2098 = null;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lph;")
    private static class229 field2097 = class266.method1858("Connection lost)3", 0);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lph;")
    private static class229 field2099 = class266.method1858("Please wait )2 attempting to reestablish)3", 0);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lph;")
    public static class229 field2103 = class266.method1858("K", 0);

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lph;")
    public static class229 field2101 = field2097;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[I")
    public static int[] field2100 = new int[5];

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lph;")
    public static class229 field2108 = field2099;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[[[B")
    public static byte[][][] field2104;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLsi;)V", line = 13)
    public static final void method925(boolean arg0, class66 arg1) {
        class263.field4393 = arg1;
        if (arg0) {
            method925(true, (class66) null);
        }
        field2105++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIZ)V", line = 33)
    public static final void method926(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2102++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg0 != 334) {
            field2104 = (byte[][][]) ((byte[][][]) null);
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (class99.field1675) {
            int var6 = arg1 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class186.field3030 - class129.field2115) * var6 / 100 + class129.field2115;
            if (class311.field5219 > var7) {
                var7 = class311.field5219;
            } else if (class57.field813 < var7) {
                var7 = class57.field813;
            }
            int var8 = var7 * 512 * arg1 / (arg3 * 334);
            if (var8 < class219.field3609) {
                short var12 = class219.field3609;
                var7 = arg3 * var12 * 334 / (arg1 * 512);
                if (var7 > class57.field813) {
                    var7 = class57.field813;
                    int var13 = var7 * 512 * arg1 / (var12 * 334);
                    int var14 = (arg3 - var13) / 2;
                    if (arg5) {
                        class212.method1498();
                        class212.method1494(arg4, arg2, var14, arg1, 0);
                        class212.method1494(arg4 + arg3 - var14, arg2, var14, arg1, 0);
                    }
                    arg4 += var14;
                    arg3 -= var14 * 2;
                }
            } else if (var8 > class175.field2875) {
                short var9 = class175.field2875;
                var7 = arg3 * var9 * 334 / (arg1 * 512);
                if (var7 < class311.field5219) {
                    var7 = class311.field5219;
                    int var10 = arg3 * 334 * var9 / (var7 * 512);
                    int var11 = (arg1 - var10) / 2;
                    if (arg5) {
                        class212.method1498();
                        class212.method1494(arg4, arg2, arg3, var11, 0);
                        class212.method1494(arg4, arg2 + arg1 - var11, arg3, var11, 0);
                    }
                    arg2 += var11;
                    arg1 -= var11 * 2;
                }
            }
            class227.field3716 = arg1 * var7 / 334;
        }
        class142.field2299 = arg2;
        class133.field2163 = (short) arg1;
        class43.field671 = (short) arg3;
        class115.field1954 = arg4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 146)
    public static final void method927(int arg0) {
        field2106++;
        if (arg0 == 31315 && class299.field4868 != null) {
            class250.method1757(class299.field4868, (byte) -101);
            class299.field4868 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 163)
    public static final void method928(boolean arg0) {
        field2107++;
        for (class332 var1 = (class332) class75.field1266.method1580((byte) -39); var1 != null; var1 = (class332) class75.field1266.method1579((byte) 28)) {
            if (var1.field5658) {
                var1.method2271(0);
            }
        }
        if (!arg0) {
            method928(false);
        }
        for (class332 var2 = (class332) class299.field4866.method1580((byte) -39); var2 != null; var2 = (class332) class299.field4866.method1579((byte) 28)) {
            if (var2.field5658) {
                var2.method2271(0);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V", line = 203)
    public static void method929(boolean arg0) {
        field2108 = null;
        field2099 = null;
        field2097 = null;
        field2103 = null;
        if (arg0) {
            method925(true, (class66) null);
        }
        field2098 = null;
        field2100 = null;
        field2104 = (byte[][][]) null;
        field2101 = null;
    }
}
