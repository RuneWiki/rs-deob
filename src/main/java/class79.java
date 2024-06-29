import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class79 extends class250 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Z")
    public boolean field1105 = false;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Z")
    public boolean field1110 = false;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lmd;")
    public static class364 field1108 = new class364(5000);

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lfg;", line = 5)
    public static final class79 method515(int arg0, int arg1, int arg2) {
        class468 var3 = class358.field5312[arg0][arg1][arg2];
        return var3 == null || var3.field6761 == null ? null : var3.field6761;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I", line = 14)
    public static final int method516(int arg0, int arg1) {
        field1109++;
        return arg1 == 37711432 ? arg0 >>> 8 : -11;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIIZZ)V", line = 49)
    public class79(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field1110 = arg3;
        this.field1106 = arg2;
        this.field1111 = arg0;
        this.field1105 = arg4;
        this.field1107 = arg1;
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V", line = 31)
    public static void method517(int arg0) {
        field1108 = null;
        if (arg0 != 5000) {
            field1108 = null;
        }
    }
}
