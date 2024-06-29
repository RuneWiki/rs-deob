import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class201 extends class81 {

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "Lqa;")
    public class107 field3593;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "Lsg;")
    public static class30 field3583 = class167.method1221((byte) 33, "Cabbage");

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Lsg;")
    public static class30 field3581 = null;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field3586 = 0;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "Lsg;")
    public static class30 field3584 = class167.method1221((byte) 33, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "Lmc;")
    public static class151 field3585;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "Lbj;")
    public static class44 field3589;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "[I")
    public static int[] field3592;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)Lbg;")
    public static final class168 method1425(int arg0, int arg1) {
        field3587++;
        class168 var2 = (class168) class146.field2802.method1644((byte) -42, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class160.field3011.method1115(class196.method1420(arg1, (byte) 83), (byte) -83, class232.method1643(arg1, (byte) -86));
        class168 var4 = new class168();
        var4.field3166 = arg1;
        if (var3 != null) {
            var4.method1228(false, new class8(var3));
        }
        var4.method1239((byte) -97);
        if (var4.field3105 != -1) {
            var4.method1240(method1425(69, var4.field3105), method1425(47, var4.field3116), -126);
        }
        if (var4.field3112 != -1) {
            var4.method1241(method1425(78, var4.field3112), method1425(106, var4.field3123), (byte) -88);
        }
        if (!class122.field2394 && var4.field3096) {
            var4.field3095 = null;
            var4.field3107 = false;
            var4.field3120 = 0;
            var4.field3090 = null;
            var4.field3162 = class228.field4078;
        }
        if (arg0 < 30) {
            field3583 = null;
        }
        class146.field2802.method1646((long) arg1, var4, -111);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILva;)I")
    public static final int method1426(int arg0, class120 arg1) {
        field3582++;
        int var2 = arg1.field2368;
        int var3 = -97 % ((-arg0 - 61) / 34);
        if (arg1.field1370 == arg1.field1362) {
            var2 = arg1.field2352;
        } else if (arg1.field1370 == arg1.field1359) {
            var2 = arg1.field2342;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static final void method1427(byte arg0) {
        field3591++;
        class139.field2714 = null;
        class97.field1974 = null;
        class138.field2708 = null;
        class148.field2833 = null;
        if (arg0 >= -104) {
            return;
        }
        class230.field4095 = 0;
        class223.field3996 = null;
        class246.field4386 = null;
        class252.field4444 = null;
        class101.field2061 = null;
        class262.field4630 = null;
        class14.field272 = null;
        class47.field1076 = null;
        class236.field4221.method480(58);
        class197.field3561 = null;
        class164.field3047 = null;
        class196.field3555 = null;
        class2.field26 = null;
        class149.field2836 = null;
        class197.field3562 = null;
        class29.field556 = null;
        class87.field1784 = null;
        class222.field3989 = null;
        class257.field4527 = null;
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)I")
    public static final int method1428(int arg0) {
        field3590++;
        if (class137.field2680) {
            return 0;
        } else if (arg0 != -30754) {
            return -76;
        } else if (class81.method703(-15861)) {
            return class238.field4243 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZII)V")
    public static final void method1429(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            field3584 = null;
        }
        for (int var5 = 0; var5 < class80.field1731; var5++) {
            if (arg0 < class9.field170[var5] + class256.field4509[var5] && class9.field170[var5] < arg0 + arg1 && arg3 < (class14.field296[var5] + class110.field2211[var5]) && (arg3 + arg4) > class14.field296[var5]) {
                class14.field288[var5] = true;
            }
        }
        field3588++;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lqa;)V")
    public class201(class107 arg0) {
        this.field3593 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public static void method1430(byte arg0) {
        field3583 = null;
        field3584 = null;
        field3589 = null;
        field3581 = null;
        field3585 = null;
        field3592 = null;
        if (arg0 >= -82) {
            field3586 = -61;
        }
    }
}
