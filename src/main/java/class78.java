import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class78 extends class12 {

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "[B")
    public byte[] field1481;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Leh;")
    public static class53 field1482 = new class53(260);

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Z")
    public static boolean field1487 = false;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lvb;")
    public static class232 field1479;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Lvb;")
    public static class232 field1483;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "Lvb;")
    public static class232 field1486;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "Lch;")
    public static class31 field1485;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "[Lr;")
    public static class186[] field1484;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
    public static void method545(byte arg0) {
        field1485 = null;
        int var1 = -60 / ((-arg0 - 82) / 40);
        field1482 = null;
        field1486 = null;
        field1483 = null;
        field1484 = null;
        field1479 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([[II)V")
    public static final void method546(int[][] arg0, int arg1) {
        class167.field3030 = arg0;
        field1480++;
        if (arg1 != 260) {
            method546(null, 66);
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
    public class78(byte[] arg0) {
        this.field1481 = arg0;
    }
}
