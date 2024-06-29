import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class190 {

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field3167 = 0;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
    public static int[] field3164 = new int[100];

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "[I")
    public static int[] field3171 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field3172 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V", line = 7)
    public static final void method1434(int arg0, int arg1, int arg2) {
        field3173++;
        class156 var3 = class206.method1525(5, arg0 - 14130, arg1);
        if (arg0 != -18571) {
            field3163 = 28;
        }
        var3.method1183(true);
        var3.field2665 = arg2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lwa;B)V", line = 23)
    public static final void method1435(class75 arg0, byte arg1) {
        class115.method881(0);
        class259.method1852(arg0, true);
        field3166++;
        if (arg1 >= -61) {
            field3164 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lcb;Lcb;BLcb;Lml;)Z", line = 36)
    public static final boolean method1436(class267 arg0, class267 arg1, byte arg2, class267 arg3, class125 arg4) {
        field3165++;
        class207.field3493 = arg0;
        class156.field2668 = arg3;
        class279.field4841 = arg4;
        if (arg2 <= 71) {
            return false;
        } else {
            class236.field3985 = arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V", line = 58)
    public static final void method1437(int arg0, boolean arg1) {
        class156 var2 = class206.method1525(11, -32701, arg0);
        var2.method1184((byte) 87);
        if (!arg1) {
            field3170++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 75)
    public static final void method1438(int arg0) {
        field3168++;
        int var1 = class188.field3135;
        int var2 = class59.field985;
        if (arg0 != -94) {
            field3169 = -6;
        }
        int var3 = 6116423;
        int var4 = class269.field4653;
        int var5 = class270.field4677;
        class222.method1632(var1, var2, var4, var5, var3);
        class222.method1632(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class222.method1640(var1 + 1, var2 + 18, var4 - 2, var5 + -19, 0);
        class3.field28.method784(class69.field1187, var1 + 3, var2 + 14, var3, -1);
        int var6 = class26.field351;
        int var7 = class66.field1135;
        for (int var8 = 0; var8 < class126.field2188; var8++) {
            int var9 = (class126.field2188 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var7 > var1 && var7 < var1 + var4 && (var9 - 13) < var6 && (var9 + 3) > var6) {
                var10 = 16776960;
            }
            class3.field28.method784(class147.method1134(var8, (byte) -90), var1 + 3, var9, var10, 0);
        }
        class134.method1039(class269.field4653, 0, class188.field3135, class59.field985, class270.field4677);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 124)
    public static void method1439(int arg0) {
        field3164 = null;
        if (arg0 != 16605) {
            method1439(26);
        }
        field3171 = null;
    }
}
