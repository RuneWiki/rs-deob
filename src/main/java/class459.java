import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class459 extends class523 {

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public int field6738 = -1;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public int field6741 = -1;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field6742 = -1;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "Lui;")
    public static class375 field6736 = new class375("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public int field6733;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public int field6735;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public int field6737;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    public int field6740;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "[I")
    public static int[] field6743;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method2759(byte arg0) {
        field6736 = null;
        field6743 = null;
        int var1 = -105 % ((arg0 - 70) / 47);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field6739;
        class23 var5 = arg3.method1088();
        var5.method185(super.field7728, super.field7732, super.field7731);
        class201 var6 = class84.field1154.method2451(-1, this.field6733).method413(131072, (byte) -28, (class395) null, this.field6740, arg3, (class270) null, 0, 0, -1);
        if (var6 != null && var6.method310(arg0, arg2, var5, true)) {
            return true;
        } else {
            if (this.field6741 != -1) {
                class201 var7 = class84.field1154.method2451(arg1 ^ -4, this.field6741).method413(131072, (byte) -16, (class395) null, this.field6735, arg3, (class270) null, 0, 0, -1);
                if (var7 != null && var7.method310(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            if (this.field6738 != -1) {
                class201 var8 = class84.field1154.method2451(arg1 + -4, this.field6738).method413(131072, (byte) -74, (class395) null, this.field6737, arg3, (class270) null, 0, 0, -1);
                if (var8 != null && var8.method310(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            if (arg1 != 3) {
                method2759((byte) -54);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lqa;I)Lpj;")
    public final class507 method51(class496 arg0, int arg1) {
        ++field6745;
        class23 var3 = arg0.method1088();
        var3.method185(super.field7728, super.field7732, super.field7731);
        class507 var4 = class82.method527(3, 1761171873);
        if (~this.field6738 != 0) {
            class201 var5 = class84.field1154.method2451(arg1 ^ 149, this.field6738).method413(2048, (byte) 126, (class395) null, this.field6737, arg0, (class270) null, 0, 0, -1);
            if (var5 != null) {
                var5.method318(var3, var4.field7549[2], 0);
            }
        }
        if (this.field6741 != -1) {
            class201 var6 = class84.field1154.method2451(arg1 + 149, this.field6741).method413(2048, (byte) -122, (class395) null, this.field6735, arg0, (class270) null, 0, 0, -1);
            if (var6 != null) {
                var6.method318(var3, var4.field7549[1], 0);
            }
        }
        if (arg1 != -150) {
            return null;
        } else {
            class201 var7 = class84.field1154.method2451(arg1 ^ 149, this.field6733).method413(2048, (byte) 126, (class395) null, this.field6740, arg0, (class270) null, 0, 0, -1);
            if (var7 != null) {
                var7.method318(var3, var4.field7549[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(BLqa;)V")
    public final void method62(byte arg0, class496 arg1) {
        if (arg0 != -126) {
            field6736 = null;
        }
        ++field6744;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
    public static final void method2760(byte arg0) {
        ++field6734;
        class518.field7689 = true;
        int var1 = 33 % ((68 - arg0) / 33);
    }
}
