import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class154 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Z")
    public static boolean field2697 = true;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2699 = 0;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
    public static int[] field2698 = new int[4096];

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Z")
    public static boolean field2701;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Z")
    public static boolean field2704;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lhg;")
    public static class177 field2702;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method1100(byte arg0) {
        field2698 = null;
        if (arg0 > -21) {
            method1102(83, (byte) 30);
        }
        field2702 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lhg;I)V")
    public static final void method1101(class177 arg0, int arg1) {
        field2695++;
        class237.field4242 = arg0;
        if (arg1 != 0) {
            method1100((byte) 85);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I")
    public static final int method1102(int arg0, byte arg1) {
        field2696++;
        if (arg0 < 0) {
            return 0;
        }
        class249 var2 = (class249) class282.field5069.method135((long) arg0, true);
        if (arg1 != -96) {
            return 61;
        } else if (var2 == null) {
            return class206.method1458(false, arg0).field5064;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field4487.length; var4++) {
                if (var2.field4487[var4] == -1) {
                    var3++;
                }
            }
            return var3 + (class206.method1458(false, arg0).field5064 - var2.field4487.length);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2698[var0] = class176.method1251(var0, (byte) -114);
        }
        field2701 = false;
        field2704 = true;
    }
}
