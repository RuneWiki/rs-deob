import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class39 {

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Lpca;")
    public static class653 field423 = new class653(32);

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "[I")
    public static int[] field424 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Loh;")
    public static class368 field425 = new class368();

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V")
    public static final void method203(int arg0, int arg1, int arg2) {
        class287 var3 = class97.field1074[arg0][arg1][arg2];
        if (var3 != null && var3.field3686 != null) {
            var3.field3686 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZIZLva;)V")
    public static final void method204(boolean arg0, int arg1, boolean arg2, class454 arg3) {
        field422++;
        int var4 = arg3.field6291;
        int var5 = (int) arg3.field3405;
        arg3.method1519((byte) 121);
        if (arg0) {
            class63.method425(-794, var4);
        }
        class421.method2280(24918, var4);
        class382 var6 = class505.method2903(var5, arg1 ^ 0xFFFF707E);
        if (var6 != null) {
            class567.method3207((byte) -69, var6);
        }
        class150.method820(82);
        if (!arg2 && class397.field5320 != -1) {
            class62.method422((byte) -127, class397.field5320, 1);
        }
        class627 var7 = new class627(class234.field2982);
        class454 var8 = (class454) var7.method3516(0);
        if (arg1 != -28799) {
            method203(47, -17, 110);
        }
        while (var8 != null) {
            if (!var8.method1520(-50)) {
                var8 = (class454) var7.method3516(0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6297 == 3) {
                int var9 = (int) var8.field3405;
                if (var9 >>> 16 == var4) {
                    method204(true, arg1, arg2, var8);
                }
            }
            var8 = (class454) var7.method3517(-1);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public static void method205(int arg0) {
        field424 = null;
        field425 = null;
        field423 = null;
        if (arg0 != -13378) {
            method206(-57, null);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILoh;)I")
    public static final int method206(int arg0, class368 arg1) {
        field421++;
        if (class676.field9584 == arg1) {
            return 7681;
        } else if (class193.field2323 == arg1) {
            return 8448;
        } else if (class471.field6575 == arg1) {
            return 34165;
        } else if (class250.field3212 == arg1) {
            return 260;
        } else if (field425 == arg1) {
            return 34023;
        } else {
            if (arg0 != 7939) {
                method203(-97, 105, 107);
            }
            throw new IllegalArgumentException();
        }
    }
}
