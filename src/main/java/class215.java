import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class215 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "S")
    public static short field3259 = 32767;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Lnk;")
    public static class16 field3261;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILnk;Lnk;)I", line = 12)
    public static final int method1498(int arg0, class16 arg1, class16 arg2) {
        field3260++;
        int var3 = 0;
        if (arg1.method125(class16.field162, 70)) {
            var3++;
        }
        if (arg1.method125(class285.field4526, 59)) {
            var3++;
        }
        if (arg0 <= 100) {
            method1498(-51, (class16) null, (class16) null);
        }
        if (arg1.method125(class73.field913, 87)) {
            var3++;
        }
        if (arg2.method125(class16.field162, -64)) {
            var3++;
        }
        if (arg2.method125(class285.field4526, -118)) {
            var3++;
        }
        if (arg2.method125(class73.field913, 101)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)J", line = 51)
    public static final long method1499(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        return var3 == null || var3.field3003 == null ? 0L : var3.field3003.field5699;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 60)
    public static void method1500(int arg0) {
        field3261 = null;
        if (arg0 != 0) {
            method1499(102, -6, 127);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZIIIZ)V", line = 74)
    public static final void method1501(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3262++;
        class91.method570(0, arg2, arg0, false, arg3, arg4, class324.field5211.length - 1);
        int var5 = -74 / ((47 - arg1) / 32);
    }
}
