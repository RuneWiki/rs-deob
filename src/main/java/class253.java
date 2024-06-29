import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class253 extends class105 {

    @OriginalMember(owner = "client!l", name = "S", descriptor = "[I")
    public static int[] field4351 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!l", name = "P", descriptor = "Lvf;")
    public static class265 field4348 = class87.method582(-46, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!l", name = "M", descriptor = "Lvf;")
    public static class265 field4345 = class87.method582(-46, " GMT");

    @OriginalMember(owner = "client!l", name = "R", descriptor = "Lvf;")
    public static class265 field4350 = class87.method582(-46, "welle:");

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "Lvf;")
    public static class265 field4358 = class87.method582(-46, "<)4col>");

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field4352 = -1;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    private int field4356;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    private int field4357;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "Lgb;")
    public static class143 field4347;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "Z")
    public static boolean field4359;

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class253() {
        this(0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1672(int arg0, int arg1, int arg2, long arg3) {
        class137 var5 = class200.field3577[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2518 != null && var5.field2518.field2683 == arg3) {
            return true;
        } else if (var5.field2510 != null && var5.field2510.field3565 == arg3) {
            return true;
        } else if (var5.field2501 != null && var5.field2501.field266 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2502; ++var6) {
                if (var5.field2506[var6].field2720 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg0 == 0) {
            this.method1674(arg1 + -129, arg2.method909(-917770352));
        }
        if (arg1 != 255) {
            this.method1674(61, 18);
        }
        ++field4346;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field4354;
        int[][] var3 = super.field1870.method569((byte) -97, arg0);
        if (super.field1870.field1567) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class94.field1668; ++var7) {
                var5[var7] = this.field4349;
                var4[var7] = this.field4356;
                var6[var7] = this.field4357;
            }
        }
        return arg1 >= -110 ? null : var3;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
    public static void method1673(int arg0) {
        field4345 = null;
        field4358 = null;
        if (arg0 != 31957) {
            field4348 = null;
        }
        field4347 = null;
        field4348 = null;
        field4350 = null;
        field4351 = null;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)V")
    private final void method1674(int arg0, int arg1) {
        this.field4357 = (255 & arg1) << 4;
        this.field4349 = 4080 & arg1 >> 12;
        ++field4355;
        this.field4356 = arg1 >> 4 & 4080;
        if (arg0 <= 119) {
            field4351 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
    private class253(int arg0) {
        super(0, false);
        this.method1674(122, arg0);
    }
}
