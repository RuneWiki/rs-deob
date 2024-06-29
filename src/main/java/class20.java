import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class20 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field372 = null;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lnq;")
    public static class268 field375;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
    public static int[] field370;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lkh;B)Lcp;")
    public static final class432 method274(class11 arg0, byte arg1) {
        field371++;
        return arg1 == 40 ? new class432(arg0.method207(7124), arg0.method207(7124), arg0.method207(7124), arg0.method207(7124), arg0.method208(27308), arg0.method172((byte) 52)) : null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method275(boolean arg0) {
        field373++;
        if (class99.field1374 == 5 && !arg0) {
            class99.field1374 = 6;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method276(int arg0) {
        field375 = null;
        if (arg0 == 0) {
            field370 = null;
            field372 = null;
        }
    }
}
