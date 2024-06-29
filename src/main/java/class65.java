import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class65 {

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    public static int[] field890 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ltj;Z)V", line = 7)
    public static final void method413(class108 arg0, boolean arg1) {
        if (arg1) {
            class70.field929 = arg0;
            field888++;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lbr;ZLvq;)V", line = 18)
    public static final void method414(class223 arg0, boolean arg1, class269 arg2) {
        field887++;
        if (arg1) {
            boolean var3 = class382.method2434(arg0.field3332 | 0xFF000000, false, arg0.field3277 ? class181.field2555.field1778 : null, arg0.field3314, arg0.field3293, arg0.field3304, arg2, arg0.field3248) == null;
            if (var3) {
                class356.field5156.method2756(54, new class114(arg0.field3304, arg0.field3314, arg0.field3293, arg0.field3332 | 0xFF000000, arg0.field3248, arg0.field3277));
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 38)
    public static void method415(boolean arg0) {
        if (!arg0) {
            method413((class108) null, false);
        }
        field890 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 48)
    public static final void method416(int arg0) {
        class431.field6174 = null;
        class451.field6467 = null;
        class15.field235 = null;
        class70.field928 = null;
        class32.field409 = null;
        class154.field2285 = null;
        class120.field1622 = null;
        field889++;
        class374.field5322 = null;
        class3.field50 = null;
        class419.field6012 = null;
        class366.field5235 = null;
        if (arg0 != -16777216) {
            field891 = -51;
        }
        class171.field2418 = null;
        class252.field3740 = null;
        class402.field5648 = null;
        class376.field5356 = null;
        class425.field6080 = null;
        class358.field5177 = null;
    }
}
