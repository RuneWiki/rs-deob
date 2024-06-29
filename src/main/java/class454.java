import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class454 {

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field6572 = 0;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field6570 = -1;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "Lclient;")
    public static client field6574;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2670(int arg0, boolean arg1) {
        if (!arg1) {
            method2673(-64);
        }
        field6569++;
        return arg0 == 0 || arg0 == 1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2671(int arg0, int arg1, byte arg2) {
        if (arg2 == -15) {
            field6573++;
            return class8.method34(arg1, arg0, (byte) -128) || class155.method1097((byte) -121, arg0, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method2672(int arg0, byte[] arg1, int arg2, int arg3) {
        field6571++;
        byte[] var4;
        if (arg2 <= 0) {
            var4 = arg1;
        } else {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg1[arg2 + var5];
            }
        }
        class604 var6 = new class604();
        var6.method3445(8);
        if (arg3 != 64) {
            field6572 = 121;
        }
        var6.method3443((long) (arg0 * 8), arg3 + 191, var4);
        byte[] var7 = new byte[64];
        var6.method3444(var7, 512, 0);
        return var7;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method2673(int arg0) {
        field6574 = null;
        if (arg0 > -94) {
            method2671(-29, 76, (byte) -4);
        }
    }
}
