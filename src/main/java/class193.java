import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class193 extends class265 {

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "Ljava/lang/Object;")
    private Object field3494;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "Lcc;")
    public static class209 field3485 = class95.method669(98, "Weiter");

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field3493 = 0;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "Lp;")
    public static class285 field3488;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
    public static final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3492++;
        if (arg1 != 11053) {
            return;
        }
        for (int var5 = 0; var5 < class266.field4771; var5++) {
            if (arg0 < (class45.field900[var5] + class21.field400[var5]) && class45.field900[var5] < (arg0 + arg4) && (class163.field2958[var5] + class210.field3831[var5]) > arg3 && arg2 + arg3 > class163.field2958[var5]) {
                class31.field562[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "(I)V")
    public static void method1322(int arg0) {
        field3485 = null;
        field3488 = null;
        if (arg0 < 24) {
            method1323((byte) 101, 6);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V")
    public static final void method1323(byte arg0, int arg1) {
        field3490++;
        class285.field5025.method662(32768, arg1);
        if (arg0 == -48) {
            class37.field639.method662(32768, arg1);
            class93.field1848.method662(arg0 ^ 0xFFFF7FD0, arg1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "(I)Z")
    public final boolean method934(int arg0) {
        if (arg0 != -1) {
            field3485 = null;
        }
        field3489++;
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method935(int arg0) {
        if (arg0 < 30) {
            field3491 = -94;
        }
        field3495++;
        return this.field3494;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BZLsj;Lsj;Lte;)V")
    public static final void method1324(byte arg0, boolean arg1, class49 arg2, class49 arg3, class77 arg4) {
        field3486++;
        class185.field3338 = arg1;
        class33.field589 = arg2;
        class218.field3935 = arg3;
        int var5 = class33.field589.method359(69) - 1;
        class199.field3560 = var5 * 256 + class33.field589.method360(var5, 0);
        class67.field1281 = arg4;
        int var6 = -65 / ((-arg0 - 36) / 37);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class193(Object arg0) {
        this.field3494 = arg0;
    }
}
