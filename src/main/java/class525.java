import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class525 implements class570 {

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lkfa;")
    public static class549 field7508 = new class549(33, 11);

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field7509 = 52;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Le;")
    public static class486 field7510;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 3)
    public static void method2990(byte arg0) {
        if (arg0 >= 55) {
            field7508 = null;
            field7510 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(JBLfv;[I)Ljava/lang/String;", line = 14)
    public final String method2991(long arg0, byte arg1, class108 arg2, int[] arg3) {
        field7507++;
        int var6 = 25 % ((-arg1 - 72) / 48);
        if (class414.field5500 == arg2) {
            class678 var7 = class281.field3563.method1112(arg3[0], 106);
            return var7.method3783((int) arg0, 4634);
        } else if (class571.field8094 == arg2 || class166.field1988 == arg2) {
            class537 var8 = class472.field6588.method1903((int) arg0, (byte) -118);
            return var8.field7677;
        } else if (class146.field1641 == arg2 || class394.field5248 == arg2 || class663.field9431 == arg2) {
            return class281.field3563.method1112(arg3[0], 97).method3783((int) arg0, 4634);
        } else {
            return null;
        }
    }
}
