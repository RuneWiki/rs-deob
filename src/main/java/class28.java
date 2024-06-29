import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class28 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[J")
    public static long[] field392 = new long[32];

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[Z")
    public static boolean[] field395 = new boolean[100];

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Ldq;")
    public static class493 field394 = new class493(66, 2);

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lkg;")
    public static class179 field396 = new class179(16, 0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 5)
    public static final void method215(int arg0, int arg1) {
        class38.field496 = arg0;
        field391++;
        class179.field2366 = arg1;
        class179.field2366 = -1;
        class95.method729(0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 26)
    public static void method217(int arg0) {
        field394 = null;
        field392 = null;
        int var1 = -72 % ((arg0 - 57) / 44);
        field396 = null;
        field395 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V", line = 40)
    public static final void method218() {
        for (int var0 = 0; var0 < class201.field2618; var0++) {
            class205 var1 = class250.field3208[var0];
            class257.method1544(var1);
            class250.field3208[var0] = null;
        }
        class201.field2618 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lcv;I)Lcv;")
    public abstract class401 method216(class401 arg0, int arg1);
}
