import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class667 {

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public int field9314;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public int field9310;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field9309 = 2;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "[I")
    public static int[] field9312 = new int[8];

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Z")
    public static boolean field9319 = false;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field9317 = 0;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public int field9307;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public int field9308;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public int field9316;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "Lq;")
    public class490 field9313;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Lqr;")
    public class667 field9315;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static void method3695(int arg0) {
        field9312 = null;
        if (arg0 < 26) {
            field9319 = false;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
    public static final byte[] method3696(int arg0, int arg1, int arg2, Object arg3) {
        if (arg2 < 54) {
            method3695(78);
        }
        field9306++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class203.method1211(-72, var4, arg1, arg0);
        } else if (arg3 instanceof class277) {
            class277 var5 = (class277) arg3;
            return var5.method1616((byte) 80, arg0, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IB)Lqr;")
    public final class667 method3697(int arg0, byte arg1) {
        field9311++;
        if (arg1 != -122) {
            this.field9310 = -57;
        }
        return new class667(this.field9314, arg0);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Luca;")
    public final class695 method3698(boolean arg0) {
        if (!arg0) {
            this.field9313 = null;
        }
        field9318++;
        return class87.method454(16, this.field9314);
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(II)V")
    public class667(int arg0, int arg1) {
        this.field9314 = arg0;
        this.field9310 = arg1;
    }
}
