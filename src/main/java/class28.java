import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class28 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field330 = 0;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    public static int[] field331 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "[I")
    public static int[] field336 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Ljava/lang/String;")
    public static String field341 = "Loaded title screen";

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "[[[I")
    public static int[][][] field337;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 10)
    public static final void method204(int arg0) {
        if (arg0 != 1024) {
            method207((byte) 35);
        }
        field338++;
        class238.field3655.method383((byte) -48);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZBZIILvj;Lvj;)I", line = 25)
    public static final int method205(boolean arg0, byte arg1, boolean arg2, int arg3, int arg4, class122 arg5, class122 arg6) {
        field340++;
        int var7 = class119.method777(3, arg6, arg4, arg5, arg0);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            if (arg1 <= 101) {
                field336 = (int[]) null;
            }
            int var8 = class119.method777(3, arg6, arg3, arg5, arg2);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 58)
    public static void method206(boolean arg0) {
        field341 = null;
        field337 = (int[][][]) null;
        if (arg0) {
            field336 = null;
            field331 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 82)
    public static final void method207(byte arg0) {
        class44.field508 = null;
        class96.field1317 = null;
        class250.field3948 = null;
        class276.field4352 = null;
        field329++;
        if (arg0 > -127) {
            field330 = -25;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(CLjava/lang/String;I)I", line = 95)
    public static final int method208(char arg0, String arg1, int arg2) {
        field333++;
        int var3 = 0;
        int var4 = arg1.length();
        int var5 = 0;
        if (arg2 != 21945) {
            method207((byte) -93);
        }
        while (var5 < var4) {
            if (arg0 == arg1.charAt(var5)) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V", line = 127)
    public static final void method209(byte arg0) {
        field339++;
        class245.field3860.method383((byte) -48);
        class293.field4614.method383((byte) -48);
        class112.field1558.method383((byte) -48);
        if (arg0 > -48) {
            method205(false, (byte) -66, false, -31, -98, (class122) null, (class122) null);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)Lso;", line = 140)
    public static final class127 method210(boolean arg0, int arg1) {
        field334++;
        class127 var2 = (class127) class154.field2434.method380(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            byte[] var3 = class48.field547.method100(0, arg1, (byte) -107);
            class127 var4 = new class127();
            if (var3 != null) {
                var4.method862(new class143(var3), true);
            }
            var4.method871(-1774976795);
            class154.field2434.method377((long) arg1, var4, -1);
            return var4;
        } else {
            return (class127) null;
        }
    }
}
