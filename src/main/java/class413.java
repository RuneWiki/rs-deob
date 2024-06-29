import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class413 {

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public static int field5414 = 0;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "Ltt;")
    public static class338 field5416 = new class338(42, 3);

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "[B")
    public byte[] field5417;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "[S")
    public short[] field5413;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "[S")
    public short[] field5415;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "[S")
    public short[] field5418;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "([Lf;I)V")
    public static final void method2339(class532[] arg0, int arg1) {
        class571.field7767 = arg0.length;
        field5420++;
        class196.field2683 = new class532[class571.field7767 + 10];
        class466.field6127 = new int[class571.field7767 + 10];
        class2.method7(arg0, 0, class196.field2683, 0, class571.field7767);
        for (int var2 = arg1; var2 < class571.field7767; var2++) {
            class466.field6127[var2] = class196.field2683[var2].method532();
        }
        for (int var3 = class571.field7767; var3 < class196.field2683.length; var3++) {
            class466.field6127[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
    public static void method2340(byte arg0) {
        if (arg0 == 86) {
            field5416 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZZ)V")
    public static final void method2341(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class402.field5325++;
            class358.method2102(0);
        }
        field5419++;
        if (arg1) {
            class366.field4829++;
            class680.method3873((byte) 74);
        }
        if (arg0 >= -68) {
            field5414 = 63;
        }
    }
}
