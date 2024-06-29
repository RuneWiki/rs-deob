import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class87 {

    @OriginalMember(owner = "client!be", name = "d", descriptor = "[Z")
    public static boolean[] field1375 = new boolean[200];

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field1378 = -2;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
    public static int[] field1379;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)Laa;", line = 17)
    public static final class33 method651(byte arg0, int arg1) {
        field1374++;
        class33 var2 = (class33) class200.field3317.method1006((long) arg1, 1);
        if (arg0 != 98) {
            return (class33) null;
        } else if (var2 == null) {
            byte[] var3 = class264.field4570.method2042(class92.method675(arg1, 123), class71.method576(arg1, 113), (byte) -128);
            class33 var4 = new class33();
            if (var3 != null) {
                var4.method217(new class170(var3), -74);
            }
            class200.field3317.method1008(var4, (long) arg1, 0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)[B", line = 42)
    public static final synchronized byte[] method652(byte arg0, int arg1) {
        field1373++;
        if (arg1 == 100 && class281.field4850 > 0) {
            byte[] var2 = class25.field329[--class281.field4850];
            class25.field329[class281.field4850] = null;
            return var2;
        } else if (arg1 == 5000 && class290.field4969 > 0) {
            byte[] var3 = class90.field1414[--class290.field4969];
            class90.field1414[class290.field4969] = null;
            return var3;
        } else {
            if (arg0 >= -12) {
                field1375 = (boolean[]) null;
            }
            if (arg1 == 30000 && class80.field1276 > 0) {
                byte[] var4 = class193.field3212[--class80.field1276];
                class193.field3212[class80.field1276] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 77)
    public static void method653(byte arg0) {
        if (arg0 < 103) {
            field1375 = (boolean[]) null;
        }
        field1379 = null;
        field1375 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILme;Lme;Lgm;Lme;)Z", line = 90)
    public static final boolean method654(int arg0, class295 arg1, class295 arg2, class229 arg3, class295 arg4) {
        class19.field256 = arg2;
        class84.field1316 = arg3;
        if (arg0 != 100) {
            method655(48);
        }
        field1377++;
        class183.field3068 = arg1;
        class176.field2885 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 119)
    public static final void method655(int arg0) {
        class130.field2152.method1484(false);
        if (arg0 > 80) {
            field1372++;
        }
    }
}
