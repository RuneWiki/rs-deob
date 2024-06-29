import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class class317 extends class205 {

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public int field4741;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "[I")
    public static int[] field4742;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZI)Z", line = 5)
    public static final boolean method2076(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2077(108);
        }
        field4744++;
        return (arg2 & 0x60000) != 0 | class367.method2346(arg2, arg0, false) || class496.method3008(arg0, 45056, arg2) || class135.method1086(0, arg2, arg0);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V", line = 16)
    public static void method2077(int arg0) {
        field4742 = null;
        if (arg0 != -11027) {
            method2079(-92);
        }
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)Z", line = 29)
    public static final boolean method2079(int arg0) {
        field4740++;
        return arg0 == -2420 ? class624.field8743 : false;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V", line = 42)
    public static final void method2081(boolean arg0, byte arg1) {
        field4743++;
        int var2 = class304.field4619;
        if (arg1 > -92) {
            return;
        }
        int var3 = class710.field10000;
        if (arg0 && class141.field2211) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class364.field5573.method223(var3, var2);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V", line = 67)
    public class317(int arg0) {
        this.field4741 = arg0;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2078(int arg0);

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)Z")
    public abstract boolean method2080(int arg0);
}
