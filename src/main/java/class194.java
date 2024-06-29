import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class194 {

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    private int field2960 = 0;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "Lcja;")
    private class46 field2953;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "Lcq;")
    public static class494 field2959 = new class494();

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "Lwk;")
    private class154 field2958;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field2956;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Lwk;", line = 3)
    public final class154 method1406(byte arg0) {
        field2955++;
        this.field2960 = 0;
        return arg0 == 121 ? this.method1407((byte) -18) : null;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)Lwk;", line = 18)
    public final class154 method1407(byte arg0) {
        field2957++;
        if (this.field2960 > 0 && this.field2953.field721[this.field2960 - 1] != this.field2958) {
            class154 var2 = this.field2958;
            this.field2958 = var2.field2524;
            return var2;
        }
        if (arg0 != -18) {
            method1408(-117);
        }
        while (this.field2960 < this.field2953.field715) {
            class154 var3 = this.field2953.field721[this.field2960++].field2524;
            if (this.field2953.field721[this.field2960 - 1] != var3) {
                this.field2958 = var3.field2524;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 57)
    public static void method1408(int arg0) {
        field2959 = null;
        field2956 = null;
        if (arg0 != 1) {
            field2959 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V", line = 70)
    public class194() {
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lcja;)V", line = 72)
    public class194(class46 arg0) {
        this.field2953 = arg0;
    }
}
