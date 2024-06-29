import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class161 extends class105 {

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field2937 = 0;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static volatile int field2942 = -1;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field2941 = 0;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "Lgk;")
    public static class6 field2943;

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field2938;
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            class194.method1346(var3, 0, class94.field1668, class219.field3951[arg1]);
        }
        if (arg0 != 8055) {
            field2943 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)V")
    public static final void method1069(boolean arg0) {
        ++field2939;
        class64.field1243.method1844((byte) -123);
        if (!arg0) {
            field2942 = -83;
        }
        class1.field13.method1155((byte) -29);
        class186.field3366.method1155((byte) -29);
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
    public static void method1070(int arg0) {
        if (arg0 == 4530) {
            field2943 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZBIZZ)Lfl;")
    public static final class192 method1071(boolean arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        ++field2940;
        class182 var5 = null;
        if (class172.field3108 != null) {
            var5 = new class182(arg2, class172.field3108, class166.field2992[arg2], 1000000);
        }
        class10.field356[arg2] = class81.field1535.method1375(class51.field1079, (byte) 82, var5, arg2);
        int var6 = 78 / ((43 - arg1) / 34);
        if (arg3) {
            class10.field356[arg2].method87((byte) -57);
        }
        return new class192(class10.field356[arg2], arg0, arg4);
    }
}
