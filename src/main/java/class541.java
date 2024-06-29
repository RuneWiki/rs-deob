import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class541 extends class540 {

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "Lga;")
    public class420 field7586 = new class420();

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "Lke;")
    public static class622 field7587 = new class622(30, 6);

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "[Lqda;")
    public static class112[] field7591;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "[Lib;")
    public static class162[] field7585;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
    public static final boolean method3118(int arg0, int arg1, int arg2) {
        field7589++;
        if (arg1 != -3056) {
            method3120(null, -59);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method3119(int arg0) {
        field7587 = null;
        int var1 = -53 / ((arg0 - 41) / 32);
        field7585 = null;
        field7591 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lts;I)I")
    public static final int method3120(class559 arg0, int arg1) {
        field7588++;
        int var2 = arg0.field7938;
        class607 var3 = arg0.method2708(117);
        if (arg0.field6383 == arg1 || arg0.field6358) {
            var2 = arg0.field7963;
        } else if (arg0.field6383 == var3.field8544 || arg0.field6383 == var3.field8577 || arg0.field6383 == var3.field8562 || arg0.field6383 == var3.field8546) {
            var2 = arg0.field7964;
        } else if (arg0.field6383 == var3.field8569 || arg0.field6383 == var3.field8566 || arg0.field6383 == var3.field8550 || arg0.field6383 == var3.field8535) {
            var2 = arg0.field7974;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZBLst;)V")
    public static final void method3121(boolean arg0, byte arg1, class455 arg2) {
        field7590++;
        if (arg1 != 39) {
            field7591 = null;
        }
        if (arg2.field6532) {
            if (arg2.field6526 < 0 || class144.method993(arg2.field6538, arg2.field6526, 20110)) {
                if (arg0) {
                    class729.method4090(arg2.field6529, arg2.field6523, arg2.field6525, arg2.field6524, -2, null);
                } else {
                    class437.method2633(arg2.field6538, (byte) 69, arg2.field6537, -1, arg2.field6529, arg2.field6523, arg2.field6524, arg2.field6525, arg2.field6526);
                }
                arg2.method3117((byte) 7);
            }
        } else if (arg2.field6528 && arg2.field6529 >= 1 && arg2.field6523 >= 1 && (class109.field1314 - 2) >= arg2.field6529 && (class760.field10479 - 2) >= arg2.field6523 && arg2.field6527 < 0 || class144.method993(arg2.field6531, arg2.field6527, 20110)) {
            if (arg0) {
                class729.method4090(arg2.field6529, arg2.field6523, arg2.field6525, arg2.field6524, -2, arg2.field6530);
            } else {
                class437.method2633(arg2.field6531, (byte) 69, arg2.field6533, -1, arg2.field6529, arg2.field6523, arg2.field6524, arg2.field6525, arg2.field6527);
            }
            arg2.field6528 = false;
            if (arg0 || arg2.field6527 != arg2.field6526 || arg2.field6526 != -1) {
                if (!arg0 && arg2.field6527 == arg2.field6526 && arg2.field6537 == arg2.field6533 && arg2.field6538 == arg2.field6531) {
                    arg2.method3117((byte) 105);
                    return;
                }
                return;
            }
            arg2.method3117((byte) -121);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I")
    public static final int method3122(int arg0, int arg1) {
        return class135.field1748 == null ? 0 : class135.field1748[arg0][arg1] & 0xFFFF;
    }
}
