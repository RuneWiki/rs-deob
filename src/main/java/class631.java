import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class631 {

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Laf;")
    private class39 field8831 = new class39(64);

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lae;")
    private class283 field8830;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[I")
    public static int[] field8828 = new int[2];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "J")
    public static long field8829;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Lgh;")
    public final class504 method3619(int arg0, int arg1) {
        field8827++;
        class39 var3 = this.field8831;
        class504 var4;
        synchronized (this.field8831) {
            var4 = (class504) this.field8831.method312(0, (long) arg0);
            if (arg1 < 44) {
                this.method3619(-44, -69);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field8830;
        byte[] var6;
        synchronized (this.field8830) {
            var6 = this.field8830.method1849(arg0, (byte) 25, 5);
        }
        class504 var7 = new class504();
        if (var6 != null) {
            var7.method2943(new class511(var6), true);
        }
        class39 var8 = this.field8831;
        synchronized (this.field8831) {
            this.field8831.method305(var7, (long) arg0, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method3620(int arg0) {
        field8828 = null;
        if (arg0 != -17279) {
            field8828 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static final void method3621(byte arg0) {
        field8825++;
        if (arg0 != 108) {
            method3621((byte) 113);
        }
        if (class129.field1674.field10576 && class499.field6841.field8306 != -1) {
            class535.method3180(class499.field6841.field8299, 34, class499.field6841.field8306);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Llaa;I)Ljava/lang/String;")
    public static final String method3622(class498 arg0, int arg1) {
        if (arg1 == -3104) {
            field8826++;
            return arg0.field6827 + " <col=ffffff>>";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ljk;ILae;)V")
    public class631(class788 arg0, int arg1, class283 arg2) {
        this.field8830 = arg2;
        this.field8830.method1867(5, (byte) 49);
    }
}
