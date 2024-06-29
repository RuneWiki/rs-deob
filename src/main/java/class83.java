import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class83 extends class435 {

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Leda;")
    public static class116 field1263 = new class116(86, 20);

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[[I")
    public static int[][] field1265 = new int[128][128];

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "[I")
    public static int[] field1267 = new int[32];

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 17)
    public class83() {
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(I)V", line = 22)
    public class83(int arg0) {
        this.field1264 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 30)
    public static void method636(byte arg0) {
        field1263 = null;
        if (arg0 > 0) {
            method636((byte) 18);
        }
        field1267 = null;
        field1265 = null;
    }
}
