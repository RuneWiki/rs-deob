import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class222 extends class139 {

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "F")
    private float field2573 = 0.0F;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Ltca;")
    private class161 field2584;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Lcga;")
    public static class449 field2571 = new class449(54, 2);

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Lpw;")
    public static class661 field2578 = new class661("", 12);

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Lhm;")
    public static class208 field2583 = new class208(8);

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Lqf;")
    public static class638 field2585 = new class638(7500);

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V", line = 3)
    public final void method884(int arg0) {
        if (~super.field1681.method1307(8) == -1) {
            class581 var2 = super.field1681.method1346((byte) -89);
            super.field1681.method1298(28397, 1);
            class581 var3 = super.field1681.method1336(0);
            var3.method583(var2);
            var3.method3217(1.0F, 0.125F, 0.125F, (byte) 125);
            var3.method3222(0.0F, 2, this.field2573, 0.0F);
            super.field1681.method1339(true, class95.field1227);
            super.field1681.method1298(28397, 0);
        }
        int var4 = 109 % ((arg0 - -72) / 54);
        ++field2575;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V", line = 27)
    public static void method1269(int arg0) {
        field2585 = null;
        field2583 = null;
        field2571 = null;
        if (arg0 <= 77) {
            method1270(-40, (class275) null, 39);
        }
        field2578 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILgl;)V", line = 40)
    public final void method150(byte arg0, int arg1, class562 arg2) {
        super.field1681.method1349(arg2, false);
        if (arg0 < 103) {
            this.method148(-109, 78, 1);
        }
        ++field2582;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V", line = 57)
    public final void method151(int arg0, boolean arg1) {
        ++field2572;
        if (arg0 != 43) {
            field2583 = null;
        }
        super.field1681.method1287(class291.field3672, (byte) 57, class607.field8276);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V", line = 68)
    public final void method148(int arg0, int arg1, int arg2) {
        ++field2581;
        super.field1681.method1298(28397, 1);
        if ((128 & arg2) != 0) {
            super.field1681.method1349((class562) null, false);
        } else if (~(arg1 & 1) == -2) {
            if (this.field2584.field1890) {
                this.field2573 = (float) (super.field1681.field2822 % 4000) / 4000.0F;
                super.field1681.method1349(this.field2584.field1891, false);
            } else {
                int var4 = super.field1681.field2822 % 4000 * 16 / 4000;
                super.field1681.method1349(this.field2584.field1896[var4], false);
            }
        } else if (!this.field2584.field1890) {
            super.field1681.method1349(this.field2584.field1896[0], false);
        } else {
            super.field1681.method1349(this.field2584.field1891, false);
        }
        if (arg0 != -2) {
            this.method152(-104);
        }
        super.field1681.method1298(28397, 0);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lkea;Ltca;)V", line = 114)
    public class222(class223 arg0, class161 arg1) {
        super(arg0);
        this.field2584 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 122)
    public final void method149(int arg0) {
        super.field1681.method1298(28397, 1);
        ++field2574;
        super.field1681.method1287(class607.field8276, (byte) 57, class607.field8276);
        super.field1681.method1274((byte) -95, class290.field3662, 0);
        super.field1681.method1304(class290.field3662, 0, (byte) -85);
        super.field1681.method376(1, 2285);
        super.field1681.method1349((class562) null, false);
        super.field1681.method1298(28397, 0);
        if (arg0 <= -4) {
            super.field1681.method1304(class290.field3662, 0, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILpfa;I)Ljv;", line = 140)
    public static final class74 method1270(int arg0, class275 arg1, int arg2) {
        ++field2577;
        if (arg2 > -65) {
            method1271((String) null, true, false, -102, (class476) null);
        }
        byte[] var3 = arg1.method1648(-63, arg0);
        return var3 == null ? null : new class74(var3);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;ZZILqj;)V", line = 161)
    public static final void method1271(String arg0, boolean arg1, boolean arg2, int arg3, class476 arg4) {
        if (arg3 >= 59) {
            ++field2580;
            if (!arg2) {
                class192.method1132(arg0, 22711, arg4, 3);
            } else {
                if (class476.field5927.startsWith("win") && arg4.field5919) {
                    String var5 = null;
                    if (class95.field1241 != null) {
                        var5 = class95.field1241.getParameter("haveie6");
                    }
                    if (var5 == null || !var5.equals("1")) {
                        class218 var6 = class192.method1132(arg0, 22711, arg4, 0);
                        class99.field1273 = var6;
                        class428.field5410 = arg0;
                        class289.field3651 = arg4;
                        return;
                    }
                }
                if (class476.field5927.startsWith("mac")) {
                    String var7 = null;
                    if (class95.field1241 != null) {
                        var7 = class95.field1241.getParameter("havefirefox");
                    }
                    if (var7 != null && var7.equals("1") && arg1) {
                        class192.method1132(arg0, 22711, arg4, 1);
                        return;
                    }
                }
                class192.method1132(arg0, 22711, arg4, 2);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V", line = 235)
    public final void method153(boolean arg0, int arg1) {
        ++field2579;
        super.field1681.method1298(28397, 1);
        super.field1681.method1287(class291.field3672, (byte) 57, class375.field4829);
        super.field1681.method390(true, class290.field3662, false, 0, arg1 ^ 262187);
        super.field1681.method1304(class251.field3237, 0, (byte) 127);
        super.field1681.method376(0, 2285);
        super.field1681.method1298(arg1 ^ 28358, 0);
        if (arg1 != 43) {
            field2571 = null;
        }
        super.field1681.method1341((byte) -123, -16777216);
        super.field1681.method1304(class666.field9048, 0, (byte) 12);
        this.method884(3);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z", line = 254)
    public final boolean method152(int arg0) {
        int var2 = 45 / ((50 - arg0) / 48);
        ++field2576;
        return this.field2584.method989(16);
    }
}
