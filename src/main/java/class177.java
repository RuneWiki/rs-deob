import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class177 extends class15 {

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "[B")
    public byte[] field3124;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Lce;")
    private static class126 field3119 = class206.method1445(-7923, "Loaded config");

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field3120 = 0;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "[[[I")
    public static int[][][] field3121 = new int[2][][];

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "Lce;")
    public static class126 field3123 = field3119;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "[[[I")
    public static int[][][] field3122;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V", line = 30)
    public static void method1283(byte arg0) {
        if (arg0 <= 73) {
            method1283((byte) -89);
        }
        field3123 = null;
        field3119 = null;
        field3122 = (int[][][]) null;
        field3121 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V", line = 51)
    public class177(byte[] arg0) {
        this.field3124 = arg0;
    }
}
