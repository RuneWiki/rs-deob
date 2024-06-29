import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class147 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[[I")
    public static int[][] field2558 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2559 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lp;")
    public static class280 field2557 = class18.method140((byte) -117, "<col=ffff00>");

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2560 = -1;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lib;")
    public static class153 field2562;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lp;")
    public static class280 field2561;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method1023(byte arg0) {
        field2562 = null;
        field2558 = null;
        if (arg0 != -20) {
            field2560 = 19;
        }
        field2561 = null;
        field2557 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILtg;Ltg;Ltg;)V")
    public static final void method1024(int arg0, class180 arg1, class180 arg2, class180 arg3) {
        class112.field1852 = arg2;
        if (arg0 == 9) {
            field2565++;
            class204.field3548 = arg3;
            class177.field3077 = arg1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZ)V")
    public static final void method1025(int arg0, int arg1, boolean arg2) {
        field2563++;
        class90 var3 = class165.field2896[class231.field4013][arg0][arg1];
        if (var3 == null) {
            class251.method1692(class231.field4013, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class60 var5 = null;
        for (class60 var6 = (class60) var3.method651(12916); var6 != null; var6 = (class60) var3.method643(11066)) {
            class220 var13 = class23.method177((byte) -77, var6.field968.field1326);
            int var14 = var13.field3783;
            if (var13.field3805 == 1) {
                var14 = (var6.field968.field1329 + 1) * var14;
            }
            if (var14 > var4) {
                var5 = var6;
                var4 = var14;
            }
        }
        if (var5 == null) {
            class251.method1692(class231.field4013, arg0, arg1);
            return;
        }
        class81 var7 = null;
        var3.method645(56, var5);
        class60 var8 = (class60) var3.method651(12916);
        class81 var9 = null;
        while (var8 != null) {
            class81 var12 = var8.field968;
            if (var5.field968.field1326 != var12.field1326) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field1326 != var12.field1326 && var7 == null) {
                    var7 = var12;
                }
            }
            var8 = (class60) var3.method643(11066);
        }
        if (arg2) {
            long var10 = (long) ((arg1 << 7) + arg0 + 1610612736);
            class236.method1585(class231.field4013, arg0, arg1, class158.method1123(class231.field4013, arg0 * 128 + 64, -6230, arg1 * 128 + 64), var5.field968, var10, var9, var7);
        }
    }
}
