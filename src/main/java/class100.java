import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class100 extends class104 {

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Lkj;")
    public class187 field1313;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[Z")
    public static boolean[] field1317 = new boolean[100];

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "Z")
    public static boolean field1319 = false;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field1318 = 0;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1316 = 0;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "[I")
    public static int[] field1321 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V", line = 5)
    public static final void method602(int arg0) {
        class299.method2114();
        if (arg0 != 4) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class149.field2072[var1].method139(39);
        }
        System.gc();
        field1314++;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V", line = 28)
    public static void method603(byte arg0) {
        field1317 = null;
        int var1 = 108 % ((-arg0 - 61) / 61);
        field1321 = null;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lkj;)V", line = 47)
    public class100(class187 arg0) {
        this.field1313 = arg0;
    }
}
