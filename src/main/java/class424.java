import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class424 extends class118 {

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "Z")
    public static boolean field6235 = true;

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "Z")
    public static boolean field6237 = true;

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "Ljk;")
    public static class119 field6232 = new class119(5000);

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!qp", name = "O", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)V")
    public static void method2613(byte arg0) {
        int var1 = -92 / ((65 - arg0) / 60);
        field6232 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        field6238++;
        return arg0 == 1 ? class6.field73 : null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Liq;ILkb;Liq;)V")
    public static final void method2614(class134 arg0, int arg1, class124 arg2, class134 arg3) {
        class103.field1378 = arg0;
        if (arg1 != 1) {
            return;
        }
        class399.field5962 = arg2;
        field6234++;
        class55.field738 = arg3;
        if (class55.field738 != null) {
            class142.field1905 = class55.field738.method812(1, (byte) -41);
        }
        if (class103.field1378 != null) {
            class6.field72 = class103.field1378.method812(1, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)I")
    public static final int method2615(int arg0, int arg1) {
        return class246.field3684 == null ? 0 : class246.field3684[arg0][arg1] >>> 21 & 0x7F8;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZIII)V")
    public static final void method2616(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6236++;
        if (arg4 >= -42) {
            field6239 = 3;
        }
        if (class405.field6032 == 0) {
            class302.method1860(56, false);
        } else {
            class8.field86 = class405.field6032;
            class388.method2399(true, 0);
        }
        class95.field1325 = arg2;
        class154.field2109 = arg1;
        class54.field731 = arg3;
        class223.method1366(arg0);
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)I")
    public static final int method2617(int arg0, int arg1, int arg2) {
        field6233++;
        if (arg1 == 4 || arg1 == 5) {
            return class62.field787[arg0 & 0x3];
        } else if (arg2 == 3) {
            return 256;
        } else {
            return -106;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
    public class424() {
        super(0, true);
    }
}
