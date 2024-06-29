import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class444 extends class502 {

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lgk;")
    public class444 field6078;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Lgk;")
    public class444 field6079;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "[I")
    public static int[] field6082;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "[I")
    public static int[] field6084;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 4)
    public final void method2504(int arg0) {
        field6083++;
        if (this.field6078 == null) {
            return;
        }
        this.field6078.field6079 = this.field6079;
        this.field6079.field6078 = this.field6078;
        this.field6078 = null;
        int var2 = 105 / ((arg0 - 40) / 44);
        this.field6079 = null;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)I", line = 22)
    public static final int method2505(int arg0) {
        if (arg0 == 26329) {
            field6081++;
            return class671.field9506;
        } else {
            return -29;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 41)
    public static void method2506(byte arg0) {
        if (arg0 != 11) {
            field6084 = null;
        }
        field6084 = null;
        field6082 = null;
    }
}
