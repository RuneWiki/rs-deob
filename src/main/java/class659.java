import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class659 extends class66 {

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public int field9177 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public int field9175 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public int field9173 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public int field9182 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public int field9181 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public int field9180 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public int field9174 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public int field9184 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Lkt;")
    public class143 field9179;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Z")
    public static boolean field9185 = false;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Lhga;")
    public static class158 field9178 = new class158(52, 7);

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "S")
    public static short field9187 = 32767;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field9186 = 0;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IBII)V")
    public static final void method3782(int arg0, byte arg1, int arg2, int arg3) {
        field9176++;
        class413 var4 = class674.method3852(9, arg3, 125);
        var4.method2633(arg1 ^ 0xFFFFAB);
        var4.field6337 = arg0;
        var4.field6333 = arg2;
        if (arg1 != 84) {
            method3782(42, (byte) 78, -97, 122);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
    public final boolean method3783(int arg0, int arg1, int arg2) {
        if (arg0 != Integer.MIN_VALUE) {
            this.field9179 = null;
        }
        field9183++;
        if (this.field9181 <= arg1 && arg1 <= this.field9180 && this.field9173 <= arg2 && this.field9177 >= arg2) {
            return true;
        } else {
            return arg1 >= this.field9175 && arg1 <= this.field9184 && this.field9174 <= arg2 && arg2 <= this.field9182;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method3784(int arg0) {
        int var1 = -20 % ((-arg0 - 45) / 59);
        field9178 = null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lkt;)V")
    public class659(class143 arg0) {
        this.field9179 = arg0;
    }
}
