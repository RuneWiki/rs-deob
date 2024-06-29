import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1137 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Loc;")
    private static class99 field1139 = class48.method402((byte) -104, "cyan:");

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Loc;")
    public static class99 field1151 = class48.method402((byte) -104, "nav");

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1143 = 0;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Loc;")
    private static class99 field1154 = class48.method402((byte) -104, "Add ignore");

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Loc;")
    public static class99 field1155 = field1154;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[I")
    public static int[] field1148 = new int[5];

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Loc;")
    public static class99 field1140 = field1139;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Loc;")
    public static class99 field1147 = field1139;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "J")
    public long field1138;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lpc;")
    public static class105 field1144;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lpc;")
    public static class105 field1156;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lub;")
    public static class134 field1142;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Ldf;")
    public static class28 field1149;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lge;")
    public class47 field1145;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lge;")
    public class47 field1146;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public final void method394(byte arg0) {
        field1153++;
        if (this.field1145 == null) {
            return;
        }
        this.field1145.field1146 = this.field1146;
        this.field1146.field1145 = this.field1145;
        int var2 = -118 / ((24 - arg0) / 47);
        this.field1146 = null;
        this.field1145 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static void method395(boolean arg0) {
        field1154 = null;
        field1151 = null;
        field1155 = null;
        field1144 = null;
        if (arg0) {
            return;
        }
        field1156 = null;
        field1148 = null;
        field1139 = null;
        field1140 = null;
        field1142 = null;
        field1149 = null;
        field1147 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z")
    public final boolean method396(int arg0) {
        field1152++;
        if (this.field1145 == null) {
            return false;
        } else {
            if (arg0 != -1) {
                method395(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static final void method397(int arg0) {
        if (arg0 != -17132) {
            field1140 = null;
        }
        field1141++;
        for (class148 var1 = (class148) class105.field2546.method722(115); var1 != null; var1 = (class148) class105.field2546.method716(true)) {
            if (var1.field3662 > 0) {
                var1.field3662--;
            }
            if (var1.field3662 != 0) {
                if (var1.field3651 > 0) {
                    var1.field3651--;
                }
                if (var1.field3651 == 0 && var1.field3655 >= 1 && var1.field3668 >= 1 && var1.field3655 <= 102 && var1.field3668 <= 102 && (var1.field3660 < 0 || class52.method436(var1.field3673, (byte) -128, var1.field3660))) {
                    class87.method739(arg0 ^ 0xFFFFBD68, var1.field3673, var1.field3668, var1.field3676, var1.field3677, var1.field3655, var1.field3682, var1.field3660);
                    var1.field3651 = -1;
                    if (var1.field3660 == var1.field3654 && var1.field3654 == -1) {
                        var1.method394((byte) 77);
                    } else if (var1.field3660 == var1.field3654 && var1.field3682 == var1.field3669 && var1.field3673 == var1.field3672) {
                        var1.method394((byte) -33);
                    }
                }
            } else if (var1.field3654 < 0 || class52.method436(var1.field3672, (byte) -128, var1.field3654)) {
                class87.method739(103, var1.field3672, var1.field3668, var1.field3676, var1.field3677, var1.field3655, var1.field3669, var1.field3654);
                var1.method394((byte) 86);
            }
        }
    }
}
