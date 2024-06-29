import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class124 {

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1935 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Z")
    public static boolean field1940 = false;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lcc;")
    public static class320 field1939 = null;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1941 = "M";

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I", line = 4)
    public static int method893(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method894(int arg0, boolean arg1) {
        field1934++;
        byte[][] var2;
        byte var3;
        if (class117.field1817 && arg1) {
            var2 = class21.field262;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class304.field4631;
        }
        int var4 = -104 / ((arg0 + 68) / 42);
        for (int var5 = 0; var5 < var3; var5++) {
            class237.method1621(113);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class259.field3943[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 14 & 0x3FF;
                            int var11 = var8 >> 3 & 0x7FF;
                            int var12 = (var8 & 0x7) >> 1;
                            int var13 = (var10 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < client.field1947.length; var14++) {
                                if (client.field1947[var14] == var13 && var2[var14] != null) {
                                    class296.method2065(var9, var12, var6 * 8, var5, (var11 & 0x7) * 8, class325.field4896, -20080, var7 * 8, (var10 & 0x7) * 8, var2[var14], arg1);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 96)
    public static void method895(int arg0) {
        field1941 = null;
        if (arg0 != 8) {
            field1936 = 42;
        }
        field1935 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V", line = 116)
    public static final void method896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1942++;
        int var7 = class222.method1553(class166.field2494, (byte) -38, arg0, class185.field2769);
        if (arg5 != -8947) {
            field1935 = (String) null;
        }
        int var8 = class222.method1553(class166.field2494, (byte) -21, arg3, class185.field2769);
        int var9 = class222.method1553(class184.field2761, (byte) -121, arg6, class157.field2357);
        int var10 = class222.method1553(class184.field2761, (byte) -35, arg2, class157.field2357);
        int var11 = class222.method1553(class166.field2494, (byte) -127, arg0 + arg4, class185.field2769);
        int var12 = class222.method1553(class166.field2494, (byte) -121, arg3 - arg4, class185.field2769);
        for (int var13 = var7; var13 < var11; var13++) {
            class315.method2160(class40.field488[var13], arg1, var10, var9, 7);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class315.method2160(class40.field488[var14], arg1, var10, var9, 7);
        }
        int var15 = class222.method1553(class184.field2761, (byte) -51, arg4 + arg6, class157.field2357);
        int var16 = class222.method1553(class184.field2761, (byte) -41, arg2 - arg4, class157.field2357);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class40.field488[var17];
            class315.method2160(var18, arg1, var15, var9, 7);
            class315.method2160(var18, arg1, var10, var16, arg5 ^ 0xFFFFDD0A);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLlm;)V", line = 179)
    public static final void method897(byte arg0, class210 arg1) {
        field1938++;
        int var2 = 106 % ((arg0 + 19) / 63);
        class295.field4519 = arg1;
    }
}
