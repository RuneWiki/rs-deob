import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class581 {

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field8255 = 1;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "Lpr;")
    public static class407 field8254 = new class407(63, 1);

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "Lpr;")
    public static class407 field8257 = new class407(69, 8);

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "Lvj;")
    public static class402 field8260 = new class402(4);

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "Ljo;")
    public static class303 field8259;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "[[Z")
    public static boolean[][] field8258;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)V")
    public static void method3267(boolean arg0) {
        field8259 = null;
        field8258 = null;
        if (!arg0) {
            field8254 = null;
            field8260 = null;
            field8257 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IB)Lhh;")
    public static final class116 method3268(int arg0, byte arg1) {
        field8256++;
        class116[] var2 = class553.method3116((byte) -87);
        int var3 = 0;
        if (arg1 != 121) {
            method3268(11, (byte) 6);
        }
        while (var2.length > var3) {
            class116 var4 = var2[var3];
            if (var4.field1343 == arg0) {
                return var4;
            }
            var3++;
        }
        return null;
    }
}
