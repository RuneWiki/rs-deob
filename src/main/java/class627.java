import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class627 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    private int field8898 = 0;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "Ltq;")
    private class572 field8900;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Lhh;")
    public static class116 field8899 = new class116(1);

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field8903 = 0;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field8905 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "Lmu;")
    private class270 field8904;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Lxa;")
    public static class458 field8901;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "[I")
    public static int[] field8902;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Lmu;")
    public final class270 method3516(int arg0) {
        field8896++;
        this.field8898 = arg0;
        return this.method3517(-1);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)Lmu;")
    public final class270 method3517(int arg0) {
        field8897++;
        if (arg0 > ~this.field8898 && this.field8900.field8123[this.field8898 - 1] != this.field8904) {
            class270 var2 = this.field8904;
            this.field8904 = var2.field3394;
            return var2;
        }
        while (this.field8900.field8117 > this.field8898) {
            class270 var3 = this.field8900.field8123[this.field8898++].field3394;
            if (this.field8900.field8123[this.field8898 - 1] != var3) {
                this.field8904 = var3.field3394;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
    public static void method3518(byte arg0) {
        field8901 = null;
        int var1 = -47 % ((35 - arg0) / 42);
        field8902 = null;
        field8899 = null;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class627() {
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Ltq;)V")
    public class627(class572 arg0) {
        this.field8900 = arg0;
    }
}
