import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class401 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "S")
    public static short field5603 = 1;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5604 = "flash3:";

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[B")
    public static byte[] field5602;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field5605;

    static {
        int var0 = 0;
        field5602 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5602[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field5606 = -1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 7)
    public static void method2457(int arg0) {
        field5602 = null;
        field5604 = null;
        if (arg0 != 0) {
            method2458((class139) null, false, (byte) 22, 86, -93);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lbi;ZBII)V", line = 23)
    public static final void method2458(class139 arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        if (arg2 > -10) {
            return;
        }
        field5600++;
        int var5 = arg0.field2027;
        if (arg0.field2111 == 0) {
            arg0.field2027 = arg0.field1956;
        } else if (arg0.field2111 == 1) {
            arg0.field2027 = arg3 - arg0.field1956;
        } else if (arg0.field2111 == 2) {
            arg0.field2027 = arg0.field1956 * arg3 >> 14;
        } else if (arg0.field2111 == 3) {
            if (arg0.field2023 == 2) {
                arg0.field2027 = arg0.field1956 * 32 + ((arg0.field1956 - 1) * arg0.field2056);
            } else if (arg0.field2023 == 7) {
                arg0.field2027 = (arg0.field1956 - 1) * arg0.field2056 + arg0.field1956 * 115;
            }
        }
        int var6 = arg0.field2011;
        if (arg0.field1989 == 0) {
            arg0.field2011 = arg0.field2020;
        } else if (arg0.field1989 == 1) {
            arg0.field2011 = arg4 - arg0.field2020;
        } else if (arg0.field1989 == 2) {
            arg0.field2011 = arg0.field2020 * arg4 >> 14;
        } else if (arg0.field1989 == 3) {
            if (arg0.field2023 == 2) {
                arg0.field2011 = arg0.field2020 * 32 + ((arg0.field2020 - 1) * arg0.field1966);
            } else if (arg0.field2023 == 7) {
                arg0.field2011 = arg0.field2020 * 12 + ((arg0.field2020 - 1) * arg0.field1966);
            }
        }
        if (arg0.field2111 == 4) {
            arg0.field2027 = arg0.field2126 * arg0.field2011 / arg0.field1964;
        }
        if (arg0.field1989 == 4) {
            arg0.field2011 = arg0.field2027 * arg0.field1964 / arg0.field2126;
        }
        if (class339.field4624 && (client.method1648(arg0).field1767 != 0 || arg0.field2023 == 0)) {
            if (arg0.field2011 < 5 && arg0.field2027 < 5) {
                arg0.field2027 = 5;
                arg0.field2011 = 5;
            } else {
                if (arg0.field2011 <= 0) {
                    arg0.field2011 = 5;
                }
                if (arg0.field2027 <= 0) {
                    arg0.field2027 = 5;
                }
            }
        }
        if (arg0.field2108 == 1337) {
            class358.field4860 = arg0;
        }
        if (arg1 && arg0.field2133 != null && arg0.field2027 != var5 || arg0.field2011 != var6) {
            class361 var7 = new class361();
            var7.field4903 = arg0;
            var7.field4905 = arg0.field2133;
            class204.field2869.method1249(var7, (byte) -115);
        }
    }
}
