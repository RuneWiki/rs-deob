import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class165 {

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "J")
    public long field2521;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Ljava/lang/String;")
    public String field2518;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "Ljava/lang/String;")
    public String field2522;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "Lup;")
    public static class547 field2523 = new class547();

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public static int field2524 = 0;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
    public static void method1237(byte arg0) {
        field2523 = null;
        if (arg0 != 29) {
            method1237((byte) 106);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z[[I)V")
    public static final void method1238(boolean arg0, int[][] arg1) {
        if (!arg0) {
            field2524 = 43;
        }
        class74.field1144 = arg1;
        field2517++;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class165(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field2519 = arg2;
        this.field2521 = arg4;
        this.field2518 = arg1;
        this.field2522 = arg3;
        this.field2520 = arg0;
    }
}
