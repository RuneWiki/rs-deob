import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class160 extends class305 {

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "Lqi;")
    public class301 field2609;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "[S")
    public static short[] field2606 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "[[[B")
    public static byte[][][] field2607;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 4)
    public static void method1031(int arg0) {
        field2606 = null;
        field2607 = (byte[][][]) null;
        if (arg0 <= 95) {
            field2606 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V", line = 21)
    public static final void method1032(int arg0) {
        class125.field2161.method1877(-29702);
        field2608++;
        if (arg0 != 8741) {
            field2606 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method1033(byte arg0, int arg1) {
        class23.field458 = arg1;
        field2605++;
        class134.method875(3, -116);
        class134.method875(4, -116);
        int var2 = 84 / ((arg0 + 62) / 34);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lqi;)V", line = 53)
    public class160(class301 arg0) {
        this.field2609 = arg0;
    }
}
