import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class384 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field5356 = -1;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
    public static int[] field5359 = new int[14];

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[[S")
    public static short[][] field5358;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
    public static final void method2328(byte arg0, int arg1) {
        field5357++;
        class632 var2 = class641.method3699(arg0 ^ 0x28, 3, arg1);
        if (arg0 == -84) {
            var2.method3655(0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method2329(byte arg0) {
        field5359 = null;
        field5358 = null;
        int var1 = 77 / ((-arg0 - 29) / 56);
    }
}
