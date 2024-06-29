import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class394 extends class342 {

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "B")
    public byte field5809 = 5;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "Ljava/lang/String;")
    public static String field5805 = "";

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "Lsh;")
    public static class472 field5800 = new class472(86, -1);

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
    public int field5799;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    public int field5801;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    public int field5802;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "I")
    public int field5806;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "I")
    public int field5807;

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "I")
    public int field5810;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "[S")
    public static short[] field5804;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2377(int arg0, String arg1) {
        field5808++;
        if (class353.field5369 == null) {
            return;
        }
        class378.method2320(class227.field3322, (byte) 119);
        class131.field1821++;
        class230.field3390.method2619((byte) -126, class330.method2021((byte) 125, arg1));
        class230.field3390.method2597(arg1, (byte) -102);
        if (arg0 != -5007) {
            field5804 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
    public static void method2378(int arg0) {
        if (arg0 >= -69) {
            field5805 = null;
        }
        field5805 = null;
        field5800 = null;
        field5804 = null;
    }
}
