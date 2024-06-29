import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 {

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "B")
    public byte field548;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Lrg;")
    public class453 field546;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "B")
    public byte field550;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "S")
    public short field545;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lff;")
    public static class9 field549 = new class9(85, -1);

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "Lff;")
    public static class9 field551 = null;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field552 = -1;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static void method264(int arg0) {
        field551 = null;
        field549 = null;
        int var1 = -79 % ((arg0 - 61) / 60);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method265(int arg0, byte[] arg1) {
        field547++;
        if (arg0 >= -17) {
            method265(-55, null);
        }
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class254.method1529(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lbo;Lrg;III)V")
    public class34(class511 arg0, class453 arg1, int arg2, int arg3, int arg4) {
        this.field548 = (byte) arg4;
        this.field546 = arg1;
        this.field550 = (byte) arg3;
        this.field545 = (short) arg2;
    }
}
