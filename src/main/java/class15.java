import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class15 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Laa;")
    public static class39 field222 = new class39();

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "[I")
    public static int[] field228 = new int[2];

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field227 = 1;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lge;")
    public static class235 field226 = new class235(16);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)I")
    public static final int method77(int arg0, int arg1, int arg2, int arg3) {
        field225++;
        if (arg3 > -33) {
            field224 = 80;
        }
        if (arg0 < arg1) {
            return arg1;
        } else if (arg2 >= arg0) {
            return arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Lha;")
    public static final class46 method78(int arg0) {
        int var1 = -7 / ((1 - arg0) / 59);
        field223++;
        class46 var2 = class85.field1613;
        class46 var3 = class86.field1636;
        if (class216.field3821 != 0) {
            var3 = class251.field4423;
        }
        if (class237.field4197 != null) {
            var2 = class109.method855(0, new class46[] { class111.field2086, class237.field4197 });
        }
        return class109.method855(0, new class46[] { class166.field2929, var3, class149.field2673, class115.method932(false, class135.field2443), class63.field1060, class115.method932(false, class51.field889), var2, class271.field4733 });
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method79(byte arg0) {
        field226 = null;
        int var1 = 101 / ((42 - arg0) / 55);
        field228 = null;
        field222 = null;
    }
}
