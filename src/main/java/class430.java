import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class430 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "B")
    public byte field6113;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lfha;")
    public class401 field6116;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "S")
    public short field6117;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "B")
    public byte field6114;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lml;")
    public static class410 field6115 = new class410("", 14);

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Z")
    public static boolean field6119 = false;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "J")
    public static long field6120;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 11)
    public static void method2620(int arg0) {
        field6115 = null;
        if (arg0 != 14) {
            method2621(null, null, -11, false, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZB)V", line = 24)
    public static final void method2621(String arg0, String arg1, int arg2, boolean arg3, byte arg4) {
        class344.method2185(arg1, arg3, arg4 ^ 0x55, arg0, arg2, true, -1);
        if (arg4 != 85) {
            method2621(null, null, -76, false, (byte) 15);
        }
        field6118++;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lfha;III)V", line = 34)
    public class430(class401 arg0, int arg1, int arg2, int arg3) {
        this.field6113 = (byte) arg3;
        this.field6116 = arg0;
        this.field6117 = (short) arg1;
        this.field6114 = (byte) arg2;
    }
}
