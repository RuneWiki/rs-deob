import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class272 extends class38 {

    @OriginalMember(owner = "client!gia", name = "D", descriptor = "[I")
    public static int[] field3874 = null;

    @OriginalMember(owner = "client!gia", name = "E", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!gia", name = "F", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
    public class272() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field3875;
        int[] var3 = super.field397.method1376(arg1, (byte) -38);
        if (arg0 > -43) {
            return null;
        } else {
            if (super.field397.field3005) {
                class319.method2021(var3, 0, class729.field10216, class136.field1816[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)V")
    public static void method1727(int arg0) {
        if (arg0 != 0) {
            method1727(54);
        }
        field3874 = null;
    }
}
