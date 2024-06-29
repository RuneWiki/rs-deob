import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class205 extends class117 {

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Z")
    public boolean field2667;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "S")
    public short field2670;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "S")
    public short field2671;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "S")
    public short field2673;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "B")
    public byte field2668;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "S")
    public short field2681;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "B")
    public byte field2676;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public int field2666;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "Ldq;")
    public static class493 field2674 = new class493(41, 4);

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field2682 = 0;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)I")
    public abstract int method733(int arg0);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BII)Z")
    public static final boolean method1282(byte arg0, int arg1, int arg2) {
        if (arg0 <= 66) {
            return true;
        } else {
            field2678++;
            return class532.method3155(arg1, -1, arg2) || class370.method2112(arg1, -95, arg2);
        }
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
    public void method1129(int arg0) {
        field2669++;
        if (arg0 != 1) {
            this.field2672 = 55;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)V")
    public static void method1283(byte arg0) {
        field2674 = null;
        if (arg0 != 65) {
            method1283((byte) 114);
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field2667 = arg8;
        this.field2670 = (short) arg7;
        this.field2671 = (short) arg6;
        this.field2672 = arg2;
        this.field2677 = arg3;
        this.field2673 = (short) arg4;
        this.field2668 = arg9;
        this.field2681 = (short) arg5;
        this.field2676 = (byte) arg0;
        this.field2666 = arg1;
    }
}
