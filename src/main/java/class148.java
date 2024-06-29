import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class148 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lmb;")
    public static class96 field2615 = class243.method1708("underlay", (byte) 101);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field2616 = 0;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2617 = 0;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field2620 = 2;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field2622 = 0;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lff;")
    public static class3 field2618;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1091(int arg0) {
        field2615 = null;
        int var1 = 44 / ((arg0 - 48) / 48);
        field2618 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lw;ZZ)V")
    public static final void method1092(class107 arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            method1091(-114);
        }
        field2621++;
        int var3 = arg0.field1828 == 0 ? arg0.field1856 : arg0.field1828;
        int var4 = arg0.field1850 == 0 ? arg0.field1919 : arg0.field1850;
        class135.method1010(class100.field1704[arg0.field1896 >> 16], var4, arg1, arg0.field1896, (byte) -97, var3);
        if (arg0.field1842 != null) {
            class135.method1010(arg0.field1842, var4, arg1, arg0.field1896, (byte) -97, var3);
        }
        class168 var5 = (class168) class34.field606.method1081(0, (long) arg0.field1896);
        if (var5 != null) {
            class21.method154(-120, var3, var5.field2961, var4, arg1);
        }
    }
}
