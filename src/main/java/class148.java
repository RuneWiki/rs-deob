import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class148 extends class247 {

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field2731;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "F")
    public static float field2728;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "Lcc;")
    public static class313 field2729;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "[I")
    public static int[] field2732;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lce;I)I", line = 6)
    public static final int method1109(class126 arg0, int arg1) {
        int var2 = -99 % ((arg1 - 28) / 53);
        field2727++;
        if (class228.field3852 == null || arg0.method878((byte) 31) == 0) {
            return -1;
        }
        for (int var3 = 0; var3 < class228.field3852.field887; var3++) {
            if (class228.field3852.field885[var3].method863(class23.field322, class301.field4979, -126).method872(arg0, 0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 35)
    public final Object method1034(int arg0) {
        field2733++;
        return arg0 >= -38 ? (Object) null : this.field2731;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(B)Z", line = 53)
    public final boolean method1035(byte arg0) {
        field2730++;
        return arg0 != 46;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(B)V", line = 70)
    public static void method1110(byte arg0) {
        field2729 = null;
        if (arg0 == 71) {
            field2732 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 80)
    public class148(Object arg0) {
        this.field2731 = arg0;
    }
}
