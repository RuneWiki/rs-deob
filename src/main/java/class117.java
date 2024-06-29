import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class117 {

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "B")
    public byte field1550;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "S")
    public short field1555;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "S")
    public short field1547;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "B")
    public byte field1545;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "S")
    public short field1546;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "Z")
    public boolean field1552;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "Z")
    public static boolean field1551 = false;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "[[[I")
    public static int[][][] field1548;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILsba;)Ljava/lang/String;", line = 21)
    public static final String method771(int arg0, class218 arg1) {
        field1549++;
        if (client.method1835(arg1).method3967(arg0) == 0) {
            return null;
        } else if (arg1.field2672 == null || arg1.field2672.trim().length() == 0) {
            return class116.field1519 ? "Hidden-use" : null;
        } else {
            return arg1.field2672;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V", line = 45)
    public static void method772(byte arg0) {
        if (arg0 != 13) {
            field1551 = true;
        }
        field1548 = null;
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 54)
    public class117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field1550 = (byte) arg8;
        this.field1555 = (short) arg4;
        this.field1547 = (short) arg6;
        this.field1545 = (byte) arg7;
        this.field1554 = arg10;
        this.field1546 = (short) arg5;
        this.field1553 = arg0;
        this.field1552 = arg9;
    }
}
