import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class89 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field1637 = -1;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Lhh;")
    public static class163 field1641 = class137.method1065("hitbar_default", 17);

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Loj;")
    public static class17 field1639 = new class17(64);

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[Lhh;")
    public static class163[] field1645 = new class163[1000];

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[Lhk;")
    public static class105[] field1642;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[Lhh;")
    public static class163[] field1643;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[Lhh;)[Lhh;")
    public static final class163[] method689(int arg0, class163[] arg1) {
        class163[] var2 = new class163[5];
        field1638++;
        if (arg0 != -6) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class145.method1101(0, new class163[] { class136.method1061(var3, (byte) 102), class36.field605 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class145.method1101(0, new class163[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)V")
    public static final void method690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1640++;
        for (int var5 = arg3; var5 < class52.field880; var5++) {
            if ((class252.field4416[var5] + class116.field2197[var5]) > arg0 && class116.field2197[var5] < (arg0 + arg2) && arg4 < (class236.field4216[var5] + class82.field1590[var5]) && arg1 + arg4 > class236.field4216[var5]) {
                class110.field2086[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method691(int arg0) {
        field1643 = null;
        field1645 = null;
        field1641 = null;
        field1639 = null;
        field1642 = null;
        if (arg0 > -103) {
            method691(-49);
        }
    }
}
