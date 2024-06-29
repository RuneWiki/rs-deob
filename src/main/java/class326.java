import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class326 extends class447 {

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Loh;")
    public class232 field4449;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "Lng;")
    public static class190 field4447 = new class190(50);

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field4452 = 0;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field4455 = 0;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field4453 = 3;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "[I")
    public static int[] field4457 = new int[2];

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Lwe;")
    public static class233 field4451;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static void method2049(int arg0) {
        field4457 = null;
        field4451 = null;
        field4447 = null;
        if (arg0 != 128) {
            method2051(51, -111);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Z")
    public static final boolean method2050(int arg0, int arg1, int arg2) {
        int var3 = class28.field445[arg0][arg1][arg2];
        if (-class352.field4922 == var3) {
            return false;
        } else if (class352.field4922 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class431.method2709(var4 + 1, class249.field3456[arg0].method275(arg1, arg2), var5 + 1) && class431.method2709(var4 + 128 - 1, class249.field3456[arg0].method275(arg1 + 1, arg2), var5 + 1) && class431.method2709(var4 + 128 - 1, class249.field3456[arg0].method275(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class431.method2709(var4 + 1, class249.field3456[arg0].method275(arg1, arg2 + 1), var5 + 128 - 1)) {
                class28.field445[arg0][arg1][arg2] = class352.field4922;
                return true;
            } else {
                class28.field445[arg0][arg1][arg2] = -class352.field4922;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Lbl;")
    public static final class387 method2051(int arg0, int arg1) {
        field4456++;
        class190 var2 = class362.field5084;
        class387 var3;
        synchronized (class362.field5084) {
            if (arg0 < 71) {
                method2050(127, -121, -5);
            }
            var3 = (class387) class362.field5084.method1246((byte) -40, (long) arg1);
            if (var3 == null) {
                var3 = new class387(arg1);
                class362.field5084.method1247((long) arg1, (byte) 66, var3);
            }
        }
        synchronized (var3) {
            return var3.method2529(true) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Loh;)V")
    public class326(class232 arg0) {
        this.field4449 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2052(boolean arg0, int arg1) {
        field4458++;
        if (arg0) {
            field4450 = -128;
        }
        if (arg1 == 51 || arg1 == 6 || arg1 == 60 || arg1 == 48 || arg1 == 1006) {
            return true;
        } else {
            return arg1 == 23 || arg1 == 29 || arg1 == 1008;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(CI)Z")
    public static final boolean method2053(char arg0, int arg1) {
        field4448++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class141.method963(arg0, false)) {
            return true;
        } else {
            char[] var2 = class16.field189;
            for (int var3 = arg1; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class6.field87;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V")
    public static final void method2054(int arg0, int arg1) {
        if (arg0 >= -80) {
            return;
        }
        class234.field3190 = arg1;
        field4454++;
        class190 var2 = class132.field1834;
        synchronized (class132.field1834) {
            class132.field1834.method1249(1);
        }
    }
}
