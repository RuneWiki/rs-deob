import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class191 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "[B")
    public static byte[] field2478 = new byte[520];

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Z")
    public static boolean field2480;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "[B")
    public static byte[] field2482;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Lpp;")
    public static class269 field2484;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "Lqn;")
    public static class47 field2483;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "Ljv;")
    public static class56 field2485;

    static {
        new class335("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field2480 = false;
        field2482 = new byte[2048];
        field2484 = new class269("RC", 1);
        field2486 = 0;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)I", line = 14)
    public static final int method1184(boolean arg0) {
        field2477++;
        if (class24.field347 != null) {
            return 3;
        } else if (arg0) {
            return -28;
        } else if (class57.field751) {
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Lpi;", line = 29)
    public static final class346 method1185(int arg0, int arg1) {
        field2479++;
        class346 var2 = (class346) class284.field3614.method1892((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class379.field4982.method481(arg0, 0, -82);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class346 var4 = class128.method907((byte) -117, var3);
            class284.field3614.method1894(var4, (long) arg0, 8690);
            int var5 = 22 / ((arg1 - 78) / 35);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 56)
    public static void method1186(int arg0) {
        field2483 = null;
        field2485 = null;
        field2482 = null;
        if (arg0 < 110) {
            method1185(53, -32);
        }
        field2484 = null;
        field2478 = null;
    }
}
