import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class31 extends class45 {

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public int field433 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public int field430 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public int field436 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public int field438 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public int field441 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public int field439 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public int field435 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public int field442 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Llv;")
    public class694 field429;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "[Z")
    public static boolean[] field431 = new boolean[8];

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "[[[B")
    public static byte[][][] field440;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method190(int arg0) {
        class413.field5414 = 0;
        if (arg0 == Integer.MAX_VALUE) {
            field432++;
            class67.field824 = new class480[50];
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z", line = 16)
    public final boolean method191(int arg0, int arg1, int arg2) {
        if (arg2 != -30474) {
            this.method191(76, 15, 54);
        }
        field434++;
        if (this.field430 <= arg1 && arg1 <= this.field441 && this.field436 <= arg0 && arg0 <= this.field435) {
            return true;
        } else {
            return arg1 >= this.field438 && arg1 <= this.field439 && arg0 >= this.field442 && this.field433 >= arg0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Llv;)V", line = 117)
    public class31(class694 arg0) {
        this.field429 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 59)
    public static void method192(int arg0) {
        if (arg0 != 95) {
            method193((byte) 75, false, -100);
        }
        field440 = null;
        field431 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BZI)I", line = 77)
    public static final int method193(byte arg0, boolean arg1, int arg2) {
        field437++;
        if (arg1) {
            return 0;
        }
        class16 var3 = class351.method2078(0, arg1, arg2);
        if (var3 == null) {
            return class504.field6946.method2255((byte) -88, arg2).field6118;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field213.length; var5++) {
            if (var3.field213[var5] == -1) {
                var4++;
            }
        }
        int var6 = var4 + class504.field6946.method2255((byte) -88, arg2).field6118 - var3.field213.length;
        if (arg0 == 6) {
            return var6;
        } else {
            return -19;
        }
    }
}
