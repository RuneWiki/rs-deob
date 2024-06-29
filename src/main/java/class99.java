import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class99 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1563 = "Loading wordpack - ";

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1564 = "purple:";

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static final void method702(int arg0) {
        field1565++;
        class103.field1626.method1876((byte) 122);
        class218.field3422.method1876((byte) 125);
        if (arg0 >= 0) {
            method704(55, 71, -100, -63, 43, -117, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public static void method703(byte arg0) {
        int var1 = 42 / ((arg0 + 16) / 34);
        field1563 = null;
        field1564 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = 0;
        if (arg6 > -27) {
            method707(-27, true, (char) 65520);
        }
        class43[] var8 = class168.field2768;
        while (var8.length > var7) {
            class43 var9 = var8[var7];
            if (var9 != null && var9.field638 == 2) {
                class236.method1621(98, var9.field648 * 2, (var9.field644 - class145.field2327 << 7) + var9.field635, arg5 >> 1, arg0, (var9.field641 - class75.field1211 << 7) + var9.field639, arg2 >> 1, arg4);
                if (class292.field4792 > -1 && class274.field4472 % 20 < 10) {
                    class273.field4401[var9.field646].method451(arg3 - (12 - class292.field4792), arg1 + -28 - -class145.field2325);
                }
            }
            var7++;
        }
        field1567++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
    public static final void method705(short[] arg0, int arg1, String[] arg2) {
        field1569++;
        if (arg1 == -1550383356) {
            class180.method1262(arg1 - 1851258785, arg0, arg2, arg2.length - 1, 0);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V")
    public static final void method706(boolean arg0, int arg1) {
        if (arg0) {
            method702(-10);
        }
        field1570++;
        class291 var2 = class61.method389(arg1, 8, 0);
        var2.method2010(0);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZC)I")
    public static final int method707(int arg0, boolean arg1, char arg2) {
        int var3 = arg2 << 4;
        field1568++;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (!arg1) {
            field1563 = null;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }
}
