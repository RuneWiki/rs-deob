import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class135 extends class196 {

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2112 = 0;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Z")
    public static boolean field2113 = true;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)V")
    public static final void method905(int arg0, byte arg1) {
        field2115++;
        if (!class235.method1632(46, arg0)) {
            return;
        }
        class254[] var2 = class283.field4741[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class254 var4 = var2[var3];
            if (var4 != null) {
                var4.field4165 = 0;
                var4.field4033 = 0;
                var4.field4117 = 1;
            }
        }
        if (arg1 <= 27) {
            field2114 = -46;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public static final void method906(int arg0, int arg1, int arg2) {
        field2111++;
        class281 var3 = class239.field3780[class165.field2600][arg0][arg1];
        if (var3 == null) {
            class270.method1852(class165.field2600, arg0, arg1);
            return;
        }
        class310 var4 = null;
        class310 var5 = (class310) var3.method1959(205);
        int var6 = -99999999;
        while (var5 != null) {
            class132 var13 = class14.method92(var5.field5012.field1685, false);
            int var14 = var13.field2051;
            if (var13.field2050 == 1) {
                var14 = (var5.field5012.field1691 + 1) * var14;
            }
            if (var14 > var6) {
                var4 = var5;
                var6 = var14;
            }
            var5 = (class310) var3.method1956(79);
        }
        if (var4 == null) {
            class270.method1852(class165.field2600, arg0, arg1);
            return;
        }
        class111 var7 = null;
        var3.method1957(73, var4);
        class111 var8 = null;
        if (arg2 != -17521) {
            field2112 = 74;
        }
        for (class310 var9 = (class310) var3.method1959(arg2 + 17726); var9 != null; var9 = (class310) var3.method1956(arg2 ^ 0xFFFFBBDA)) {
            class111 var12 = var9.field5012;
            if (var4.field5012.field1685 != var12.field1685) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field1685 != var12.field1685 && var8 == null) {
                    var8 = var12;
                }
            }
        }
        long var10 = (long) (arg0 + (arg1 << 7) + 1610612736);
        class57.method343(class165.field2600, arg0, arg1, class12.method66(arg0 * 128 + 64, class165.field2600, arg1 * 128 + 64, 0), var4.field5012, var10, var7, var8);
    }
}
