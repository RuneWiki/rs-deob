import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "J")
    public long field338 = 0L;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lhi;")
    public static class282 field334 = new class282();

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lqd;")
    public static class40 field348 = class147.method1106("welle:", (byte) -104);

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "S")
    public static short field341 = 320;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lbg;")
    public class196 field335;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lbg;")
    public class196 field343;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Ldl;")
    public static class35 field339;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 4)
    public static final void method125(byte arg0) {
        if (arg0 != -16) {
            field341 = -55;
        }
        class228.field3768.method1347(arg0 ^ 0xFFFFFFF0);
        class156.field2616.method1347(0);
        class28.field604.method1347(0);
        field347++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 24)
    public static void method126(int arg0) {
        field348 = null;
        field334 = null;
        field339 = null;
        if (arg0 != -18210) {
            method126(80);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I", line = 38)
    public static final int method127(int arg0, int arg1, int arg2) {
        field331++;
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        if (arg0 != 0) {
            method125((byte) -8);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lpi;", line = 70)
    public static final class300 method128(int arg0, int arg1) {
        field336++;
        class300 var2 = (class300) class263.field4394.method1345((long) arg1, 28150);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 47) {
            return (class300) null;
        } else {
            byte[] var3 = class199.field3179.method1651(class68.method530(441739911, arg1), class42.method390(-5, arg1), -1);
            class300 var4 = new class300();
            if (var3 != null) {
                var4.method2049(true, new class26(var3));
            }
            var4.method2051(117);
            class263.field4394.method1350(var4, (long) arg1, -109);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lom;Z)V", line = 99)
    public static final void method129(class65 arg0, boolean arg1) {
        long var2 = 0L;
        field345++;
        if (!arg1) {
            return;
        }
        int var4 = -1;
        int var5 = 0;
        if (arg0.field1219 == 0) {
            var2 = class56.method478(arg0.field1224, arg0.field1205, arg0.field1228);
        }
        int var6 = 0;
        if (arg0.field1219 == 1) {
            var2 = class65.method522(arg0.field1224, arg0.field1205, arg0.field1228);
        }
        if (arg0.field1219 == 2) {
            var2 = class14.method84(arg0.field1224, arg0.field1205, arg0.field1228);
        }
        if (arg0.field1219 == 3) {
            var2 = class310.method2122(arg0.field1224, arg0.field1205, arg0.field1228);
        }
        if (var2 != 0L) {
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = ((int) var2 & 0x35F4A1) >> 20;
            var5 = ((int) var2 & 0x7DEC4) >> 14;
        }
        arg0.field1217 = var4;
        arg0.field1213 = var5;
        arg0.field1203 = var6;
    }
}
