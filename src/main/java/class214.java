import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class214 {

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
    public static int[] field2652 = new int[14];

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lkp;")
    public static class507 field2655 = null;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "[I")
    public static int[] field2668 = new int[2];

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lwp;")
    public static class453 field2666 = new class453(27, -1);

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Lqg;")
    public class214 field2665;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lq;")
    public class491 field2667;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lqg;", line = 4)
    public final class214 method1267(int arg0, byte arg1) {
        field2659++;
        if (arg1 < 38) {
            this.field2663 = 84;
        }
        return new class214(this.field2658, arg0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 19)
    public static void method1268(int arg0) {
        field2666 = null;
        field2652 = null;
        field2655 = null;
        field2668 = null;
        if (arg0 != 2) {
            method1268(115);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method1269(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1272(84, -120);
        }
        field2656++;
        return class167.method956((byte) 67, arg2, arg1) & class65.method390(arg0 + 35044, arg2, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Lvj;", line = 46)
    public final class422 method1270(int arg0) {
        field2662++;
        int var2 = 92 % ((arg0 - 90) / 33);
        return class119.method644(this.field2658, false);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Llo;)V", line = 56)
    public static final void method1271(class488 arg0) {
        class590.field8291.method991(arg0.field6461, arg0.field6458 + (arg0.method71(47) >> 1), arg0.field6464, class383.field4829);
        arg0.field6462 = class383.field4829[0];
        arg0.field6463 = class383.field4829[1];
        arg0.field6455 = class383.field4829[2];
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I", line = 75)
    public static final int method1272(int arg0, int arg1) {
        field2654++;
        if (arg1 != 7836) {
            method1272(-43, -76);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(II)V", line = 93)
    public class214(int arg0, int arg1) {
        this.field2658 = arg0;
        this.field2653 = arg1;
    }
}
