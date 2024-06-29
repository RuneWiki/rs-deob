import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class189 extends class443 {

    @OriginalMember(owner = "client!be", name = "w", descriptor = "[B")
    public byte[] field2718;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "[I")
    public static int[] field2716 = new int[500];

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field2717 = 0;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLps;)V", line = 7)
    public static final void method1259(byte arg0, class427 arg1) {
        if (arg0 <= 20) {
            method1259((byte) -70, null);
        }
        if (arg1.field6236 != null) {
            arg1.field6236.field3482 = 0;
        }
        field2715++;
        arg1.field6239 = false;
        for (class427 var2 = arg1.method45(); var2 != null; var2 = arg1.method36()) {
            method1259((byte) 75, var2);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 34)
    public static void method1260(int arg0) {
        field2716 = null;
        if (arg0 != 500) {
            field2717 = 1;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "([B)V", line = 44)
    public class189(byte[] arg0) {
        this.field2718 = arg0;
    }
}
