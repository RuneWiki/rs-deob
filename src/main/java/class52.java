import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class52 {

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "Lsu;")
    public static class192 field744 = new class192();

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Lfc;")
    public static class235 field747 = new class235(19, 14);

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "[I")
    public static int[] field749 = new int[500];

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "Luc;")
    public static class27 field748 = new class27(37, -1);

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "Luc;")
    public static class27 field751 = new class27(14, 4);

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "Luc;")
    public static class27 field752 = new class27(61, 2);

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field750;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)Ldu;", line = 4)
    public static final class324 method370(int arg0, int arg1) {
        field746++;
        class324[] var2 = class227.method1451((byte) 125);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class324 var5 = var2[var3];
            if (var5.field4789 == arg0) {
                return var5;
            }
        }
        int var4 = -74 % ((-arg1 - 68) / 43);
        return null;
    }

    @OriginalMember(owner = "client!fw", name = "toString", descriptor = "()Ljava/lang/String;", line = 30)
    public final String toString() {
        field743++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IBI)I", line = 40)
    public final int method371(int arg0, byte arg1, int arg2) {
        field742++;
        int var4 = class547.field7412 > arg2 ? class547.field7412 : arg2;
        if (class385.field5384 == this) {
            return 0;
        } else if (class546.field7400 == this) {
            return var4 - arg0;
        } else if (class345.field4986 == this) {
            return (var4 - arg0) / 2;
        } else if (arg1 > -106) {
            return -105;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)[Lof;", line = 66)
    public static final class568[] method372(int arg0) {
        field745++;
        if (arg0 > -2) {
            method373((byte) -55);
        }
        return new class568[] { class184.field2712, class650.field9205, class580.field7908, class694.field9743, class399.field5541, class605.field8435, class362.field5166, class364.field5198, class644.field9149, class106.field1427, class240.field3449, class673.field9479, class662.field9336, class45.field668, class583.field8122, class421.field5947 };
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V", line = 80)
    public static void method373(byte arg0) {
        field752 = null;
        field744 = null;
        field747 = null;
        field750 = null;
        field751 = null;
        field748 = null;
        field749 = null;
        int var1 = 17 % ((80 - arg0) / 37);
    }
}
