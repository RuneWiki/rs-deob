import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class583 extends class392 {

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "Lbn;")
    public static class517 field8378 = new class517("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "[Lgf;")
    public static class74[] field8379;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)I", line = 7)
    public final int method3420(int arg0) {
        ++field8383;
        if (arg0 != 17539) {
            field8379 = null;
        }
        return super.field5452;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)I", line = 18)
    public final int method292(boolean arg0) {
        ++field8380;
        if (!arg0) {
            field8379 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(Z)[Lpd;", line = 30)
    public static final class646[] method3421(boolean arg0) {
        ++field8382;
        if (arg0) {
            field8378 = null;
        }
        return new class646[] { class717.field10011, class245.field3508, class371.field5231 };
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(Z)V", line = 41)
    public final void method291(boolean arg0) {
        if (!arg0) {
            if (super.field5454.field9469.method2838(30861) && ~super.field5452 == -3) {
                super.field5452 = 1;
            }
            ++field8384;
            if (super.field5452 < 0 || super.field5452 > 2) {
                super.field5452 = this.method292(true);
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V", line = 59)
    public static void method3422(int arg0) {
        field8378 = null;
        if (arg0 != 1) {
            field8379 = null;
        }
        field8379 = null;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lw;)V", line = 72)
    public class583(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)I", line = 78)
    public final int method290(int arg0, int arg1) {
        if (arg1 > -124) {
            return -40;
        } else {
            ++field8381;
            return 1;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)V", line = 89)
    public final void method286(byte arg0, int arg1) {
        ++field8385;
        super.field5452 = arg1;
        int var3 = -92 / ((arg0 - -80) / 38);
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(ILw;)V", line = 100)
    public class583(int arg0, class675 arg1) {
        super(arg0, arg1);
    }
}
