import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class181 extends class64 {

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lcd;")
    public static class23 field3573 = class54.method414("<br>(X100(U(Y", -1);

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Lcd;")
    private static class23 field3576 = class54.method414("Ok", -1);

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Lcd;")
    public static class23 field3578 = field3576;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "Z")
    public static boolean field3575 = false;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lcd;")
    private static class23 field3583 = class54.method414("Your account is already logged in)3", -1);

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "[I")
    public static int[] field3577 = new int[5];

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "Lcd;")
    public static class23 field3585 = field3583;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "Lcd;")
    public static class23 field3587 = class54.method414("(U0a )2 in: ", -1);

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    private int field3572;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    private int field3588;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lug;")
    public static class186 field3582;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "Lkh;")
    public static class97 field3581;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static final void method1120(byte arg0) {
        if (arg0 != 72) {
            method1121(-116L, 16);
        }
        class73.field1668 = null;
        class166.field3319 = null;
        class69.field1625 = null;
        ++field3584;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
    private class181(int arg0) {
        super(0, false);
        this.method1124(arg0, 45);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field3590;
        int var4 = -128 / ((arg0 - 7) / 43);
        if (arg1 == 0) {
            this.method1124(arg2.method1177(true), -85);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        int[][] var3 = super.field1508.method846(7287, arg0);
        ++field3580;
        if (super.field1508.field2757) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; ~var7 > ~class168.field3367; ++var7) {
                var6[var7] = this.field3591;
                var4[var7] = this.field3588;
                var5[var7] = this.field3572;
            }
        }
        if (!arg1) {
            this.field3572 = -70;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JI)V")
    public static final void method1121(long arg0, int arg1) {
        ++field3589;
        if (~arg0 != -1L) {
            if (arg1 <= -42) {
                if (class157.field3145 >= 100) {
                    class107.method701(10945, class66.field1566, 0, class3.field33);
                } else {
                    class23 var3 = class39.method326(arg0, 110).method164(-12065);
                    for (int var4 = 0; ~var4 > ~class157.field3145; ++var4) {
                        if (~class189.field3758[var4] == ~arg0) {
                            class107.method701(10945, class66.field1566, 0, class3.method14(true, new class23[] { var3, class59.field1383 }));
                            return;
                        }
                    }
                    for (int var5 = 0; var5 < class82.field1780; ++var5) {
                        if (class17.field364[var5] == arg0) {
                            class107.method701(10945, class66.field1566, 0, class3.method14(true, new class23[] { class21.field438, var3, class89.field1927 }));
                            return;
                        }
                    }
                    if (var3.method161(5, class134.field2790.field1345)) {
                        class107.method701(10945, class66.field1566, 0, class17.field360);
                    } else {
                        ++class174.field3450;
                        class189.field3758[class157.field3145] = arg0;
                        class131.field2717[class157.field3145++] = class39.method326(arg0, -107);
                        class1.field7 = class13.field296;
                        class159.field3190.method631(46, -1);
                        class159.field3190.method1199(arg0, -1898826808);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Lcd;")
    public static final class23 method1122(int arg0, int arg1) {
        ++field3579;
        if (arg0 <= 76) {
            return null;
        } else {
            class23 var2 = new class23();
            var2.field480 = new byte[arg1];
            var2.field473 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class181() {
        this(0);
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
    public static void method1123(int arg0) {
        if (arg0 != 0) {
            method1120((byte) -83);
        }
        field3578 = null;
        field3577 = null;
        field3582 = null;
        field3583 = null;
        field3573 = null;
        field3576 = null;
        field3587 = null;
        field3581 = null;
        field3585 = null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
    private final void method1124(int arg0, int arg1) {
        this.field3591 = (16711680 & arg0) >> 12;
        this.field3588 = arg0 >> 4 & 4080;
        int var3 = -35 % ((arg1 - -22) / 38);
        ++field3586;
        this.field3572 = arg0 << 4 & 4080;
    }
}
