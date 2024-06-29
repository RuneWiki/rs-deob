import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class99 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field1446 = 0;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "[[I")
    public static int[][] field1449 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "[I")
    public static int[] field1448;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V", line = 26)
    public static void method779(boolean arg0) {
        if (!arg0) {
            method782(41);
        }
        field1448 = null;
        field1449 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIII)V", line = 40)
    public static final void method780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1447++;
        class608 var8 = null;
        for (class608 var9 = (class608) class398.field5706.method679((byte) -86); var9 != null; var9 = (class608) class398.field5706.method681(-21)) {
            if (var9.field8215 == arg2 && var9.field8230 == arg0 && var9.field8232 == arg7 && var9.field8221 == arg3) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class608();
            var8.field8230 = arg0;
            var8.field8221 = arg3;
            var8.field8232 = arg7;
            var8.field8215 = arg2;
            if (arg0 >= 0 && arg7 >= 0 && class102.field1467 > arg0 && arg7 < class393.field5663) {
                class58.method366(0, var8);
            }
            class398.field5706.method689(var8, 114);
        }
        var8.field8225 = false;
        if (arg6 != -1) {
            method780(7, -66, -10, 91, 122, 113, 22, -47);
        }
        var8.field8231 = true;
        var8.field8226 = arg4;
        var8.field8220 = arg1;
        var8.field8228 = arg5;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Lcfa;", line = 86)
    public static final class180 method781(int arg0) {
        field1444++;
        return arg0 == 1 ? class283.method1843(1, (byte) -90) : null;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 97)
    public static final void method782(int arg0) {
        field1443++;
        if (class125.field1721.field5155.method591(43) == arg0 && class786.field10794 != class184.field2420) {
            class775.method4264((byte) -87, class559.field7668, false, class759.field10402, 11);
        } else {
            class497.method2916(class375.field5490, arg0 + 1177);
            if (class220.field2859 != class184.field2420) {
                class18.method99(arg0 - 114);
            }
        }
    }
}
