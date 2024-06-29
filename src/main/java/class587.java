import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class587 {

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "Laf;")
    private class39 field8279 = new class39(64);

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "Lae;")
    private class283 field8283;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Lae;")
    private class283 field8282;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "Lsi;")
    public static class769 field8280 = new class769();

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public static void method3441(int arg0) {
        if (arg0 == 0) {
            field8280 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Lrn;")
    public final class675 method3442(int arg0, int arg1) {
        field8281++;
        class675 var3 = (class675) this.field8279.method312(0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field8283.method1849(arg1, (byte) -95, 0);
        } else {
            var4 = this.field8282.method1849(arg1 & 0x7FFF, (byte) 104, 0);
        }
        class675 var5 = new class675();
        if (var4 != null) {
            var5.method3846((byte) -128, new class511(var4));
        }
        if (arg0 <= arg1) {
            var5.method3845(24473);
        }
        this.field8279.method305(var5, (long) arg1, 18320);
        return var5;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(ILae;Lae;)V")
    public class587(int arg0, class283 arg1, class283 arg2) {
        this.field8283 = arg1;
        this.field8282 = arg2;
        if (this.field8283 != null) {
            this.field8283.method1867(0, (byte) 49);
        }
        if (this.field8282 != null) {
            this.field8282.method1867(0, (byte) 49);
        }
    }
}
