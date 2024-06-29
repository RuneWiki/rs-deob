import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class70 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field973 = "K";

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[S")
    public static short[] field971 = new short[] { 36, 49, 19, 35, 4, 23, 38, 60 };

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    public static int[] field975 = new int[14];

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[[[B")
    public static byte[][][] field974;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIIIILmm;I)Z", line = 7)
    public static final boolean method547(boolean arg0, int arg1, int arg2, int arg3, int arg4, class121 arg5, int arg6) {
        class205 var7 = class42.method341(arg5.field1723, 69);
        field977++;
        if (var7.field3243 == -1) {
            return true;
        }
        int var8;
        if (arg5.field1708) {
            int var9 = arg5.field1739 + arg1;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class201 var10 = var7.method1508(arg5.field1730, 119, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = arg5.field1734;
        int var12 = arg5.field1724;
        if ((var8 & 0x1) == 1) {
            var11 = arg5.field1724;
            var12 = arg5.field1734;
        }
        int var13 = var10.field284;
        int var14 = var10.field289;
        if (var7.field3246) {
            var14 = var11 * 4;
            var13 = var12 * 4;
        }
        if (var7.field3253 == 0) {
            var10.method1486(arg4 * 4 + 48, (-arg6 + -var11 + 104) * 4 + 48, var13, var14);
        } else {
            var10.method1496(arg4 * 4 + 48, 48 - -((-arg6 + -var11 + 104) * 4), var13, var14, var7.field3253);
        }
        if (arg0) {
            field974 = (byte[][][]) ((byte[][][]) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(JI)V", line = 68)
    public static final void method548(long arg0, int arg1) {
        field976++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = -126 / ((-arg1 - 20) / 59);
        for (int var4 = 0; var4 < class301.field4626; var4++) {
            if (class23.field352[var4] == arg0) {
                class273.field4231++;
                class301.field4626--;
                for (int var5 = var4; var5 < class301.field4626; var5++) {
                    class55.field768[var5] = class55.field768[var5 + 1];
                    class99.field1336[var5] = class99.field1336[var5 + 1];
                    class166.field2736[var5] = class166.field2736[var5 + 1];
                    class23.field352[var5] = class23.field352[var5 + 1];
                    class270.field4195[var5] = class270.field4195[var5 + 1];
                    class11.field202[var5] = class11.field202[var5 + 1];
                }
                class294.field4555 = class220.field3487;
                class183.field2965.method1947((byte) -59, 56);
                class183.field2965.method53((byte) 91, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 134)
    public static void method549(int arg0) {
        field971 = null;
        field973 = null;
        if (arg0 != -29273) {
            method549(-7);
        }
        field975 = null;
        field974 = (byte[][][]) null;
    }
}
