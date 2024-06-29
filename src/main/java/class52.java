import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class52 extends class379 {

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "Z")
    public static boolean field710 = false;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "Z")
    public static boolean field712 = false;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "Lhu;")
    public static class143 field709;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)V")
    public static void method473(byte arg0) {
        if (arg0 == -14) {
            field709 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public static final void method474(int arg0) {
        field708++;
        if (arg0 != 25714) {
            field709 = null;
        }
        for (int var1 = 0; var1 < class707.field9936; var1++) {
            class228 var2 = class415.field5422[var1];
            if (var2.field2693 == 3) {
                if (var2.field2699 == null) {
                    var2.field2702 = Integer.MIN_VALUE;
                } else {
                    class783.field10811.method3257(var2.field2699);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method475(int arg0, int arg1, byte arg2) {
        int var3 = 112 / ((52 - arg2) / 32);
        field714++;
        return class473.method2827(arg1, arg0, -89) & class26.method255(arg0, false, arg1);
    }
}
