import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class235 {

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[Lct;")
    public static class369[] field3864 = new class369[75];

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!j", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3865++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZLgi;)V")
    public static final void method1662(boolean arg0, boolean arg1, class437 arg2) {
        field3866++;
        int var3 = arg2.field6693 == 0 ? arg2.field6615 : arg2.field6693;
        int var4 = arg2.field6647 == 0 ? arg2.field6730 : arg2.field6647;
        if (!arg0) {
            field3864 = null;
        }
        class101.method682(class433.field6540[arg2.field6751 >> 16], var4, -1, arg2.field6751, var3, arg1);
        if (arg2.field6675 != null) {
            class101.method682(arg2.field6675, var4, -1, arg2.field6751, var3, arg1);
        }
        class301 var5 = (class301) class423.field6414.method1122((byte) 59, (long) arg2.field6751);
        if (var5 != null) {
            class155.method945(arg1, var5.field4721, 340, var4, var3);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBII)V")
    public static final void method1663(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3869++;
        float var5 = (float) class194.field2894 / (float) class194.field2891;
        int var6 = arg1;
        if (arg2 >= -2) {
            return;
        }
        int var7 = arg0;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg4 - (arg1 - var6) / 2;
        int var9 = arg3 - (arg0 - var7) / 2;
        class6.field71 = -1;
        class297.field4679 = class194.field2894 - (class194.field2894 * var9 / var7);
        class201.field3060 = class194.field2891 * var8 / var6;
        class484.field7357 = -1;
        class100.method676(-61);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1664(int arg0) {
        if (arg0 != 75) {
            method1663(-88, -106, (byte) -107, -15, -95);
        }
        field3864 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class235(String arg0, int arg1) {
        this.field3868 = arg1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)I")
    public final int method1665(int arg0) {
        field3867++;
        if (arg0 != -1) {
            this.field3868 = -21;
        }
        return this.field3868;
    }
}
