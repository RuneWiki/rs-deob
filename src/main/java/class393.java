import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class393 extends class43 {

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field5725;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "[[I")
    public static int[][] field5721 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field5727 = 64;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "Ljava/lang/String;")
    public static String field5728 = "Starting 3d Library";

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lir;IIB)Ld;")
    public static final class9 method2524(class185 arg0, int arg1, int arg2, byte arg3) {
        field5722++;
        byte[] var4 = arg0.method1235(arg2, false, arg1);
        if (var4 == null) {
            return null;
        } else if (arg3 >= -22) {
            return null;
        } else {
            return new class9(var4);
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
    public static void method2525(int arg0) {
        field5728 = null;
        field5721 = null;
        if (arg0 != 10) {
            field5727 = 73;
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)Z")
    public final boolean method307(byte arg0) {
        field5724++;
        if (arg0 <= 42) {
            field5720 = -91;
        }
        return false;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
    public static final void method2526(int arg0) {
        class305.field4560.method372(119);
        if (arg0 == 2) {
            field5723++;
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method303(byte arg0) {
        if (arg0 >= -104) {
            return null;
        } else {
            field5729++;
            return this.field5725;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIIIII)V")
    public static final void method2527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5726++;
        class191.field2662 = arg5;
        field5720 = arg4;
        class124.field1614 = arg0;
        class424.field6192 = arg2;
        class432.field6283 = arg3;
        if (arg1 < 67) {
            method2528((class238) null, 120, -103, (byte) 12);
        }
        if (class432.field6283 >= 100) {
            int var6 = class191.field2662 * 128 + 64;
            int var7 = class424.field6192 * 128 + 64;
            int var8 = class248.method1621(var6, var7, -13853, class268.field3973) - field5720;
            int var9 = var6 - class326.field4829;
            int var10 = var8 - class289.field4331;
            int var11 = var7 - class279.field4099;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class47.field716 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class7.field88 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class47.field716 < 1024) {
                class47.field716 = 1024;
            }
            if (class47.field716 > 3072) {
                class47.field716 = 3072;
            }
        }
        class212.field2884 = 2;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lso;IIB)V")
    public static final void method2528(class238 arg0, int arg1, int arg2, byte arg3) {
        field5719++;
        if (arg3 > 57) {
            class144.field1829[arg2][arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class393(Object arg0) {
        this.field5725 = arg0;
    }
}
