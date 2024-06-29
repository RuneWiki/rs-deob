import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class589 {

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "[I")
    public static int[] field8085 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public int field8083;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public int field8088;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public int field8089;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public int field8090;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public int field8091;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public int field8092;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Lpq;")
    public static class159 field8086;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Lwda;", line = 13)
    public static final class142 method3287(int arg0, int arg1, int arg2) {
        class651 var3 = class145.field1841[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9224;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 20)
    public static void method3288(byte arg0) {
        field8086 = null;
        field8085 = null;
        if (arg0 != -92) {
            field8086 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method3289(byte arg0, int arg1) {
        field8087++;
        if (arg0 != -101) {
            field8084 = -17;
        }
        class19 var2 = class364.method2236(1248116640, arg1, 12);
        var2.method104(arg0 + 111);
    }
}
