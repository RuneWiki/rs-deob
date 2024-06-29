import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class73 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lsc;")
    public static class181 field1160 = class149.method967(255, "cross");

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Lsc;")
    public static class181 field1162 = class149.method967(255, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Ljd;")
    public static class265 field1164 = new class265(50);

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field1168 = -1;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Z")
    public static boolean field1170 = false;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Z")
    public static boolean field1166 = true;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lsc;")
    private static class181 field1172 = class149.method967(255, " more options");

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lsc;")
    public static class181 field1171 = field1172;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Ldf;")
    public static class117 field1167;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1161++;
        int var8 = 2048 - arg7 & 0x7FF;
        int var9 = arg0 & 2048 - arg1;
        int var10 = 0;
        int var11 = arg6;
        int var12 = 0;
        if (var9 != 0) {
            int var13 = class72.field1150[var9];
            var12 = -arg6 * var13 >> 16;
            int var14 = class72.field1145[var9];
            var11 = arg6 * var14 >> 16;
        }
        if (var8 != 0) {
            int var15 = class72.field1145[var8];
            int var16 = class72.field1150[var8];
            var10 = var11 * var16 >> 16;
            var11 = var11 * var15 >> 16;
        }
        class228.field3916 = arg4 - var12;
        class47.field734 = arg7;
        class86.field1370 = arg2 - var11;
        class208.field3559 = arg1;
        class127.field2100 = arg5 - var10;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method512(byte arg0) {
        field1172 = null;
        field1164 = null;
        if (arg0 != 1) {
            method512((byte) -43);
        }
        field1171 = null;
        field1162 = null;
        field1160 = null;
        field1167 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
    public static final boolean method513(int arg0, int arg1) {
        field1159++;
        if (arg0 != 981218288) {
            field1167 = null;
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLuc;Ljb;Ljb;I)V")
    public static final void method514(boolean arg0, class14 arg1, class11 arg2, class11 arg3, int arg4) {
        class122.field2004 = arg3;
        field1163++;
        class52.field834 = arg0;
        class39.field601 = arg2;
        int var5 = class39.field601.method95(-116) - 1;
        int var6 = -99 % ((-arg4 - 4) / 53);
        class188.field3325 = class39.field601.method102(var5, -23099) + var5 * 256;
        class157.field2652 = arg1;
    }
}
