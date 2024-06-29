import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class67 extends class288 {

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field946 = 0;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field951 = 0;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "[[B")
    public static byte[][] field948;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
    public static void method529(int arg0) {
        if (arg0 == 0) {
            field948 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)I")
    public static final int method530(int arg0, byte arg1) {
        ++field947;
        if (arg0 == 16711935) {
            return -1;
        } else {
            int var2 = 18 % ((arg1 - -77) / 49);
            return class218.method1447(arg0, -5641);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field949;
        if (arg0 != 0) {
            field948 = null;
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            class56.method430(var3, 0, class186.field2986, class1.field15[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class67() {
        super(0, true);
    }
}
