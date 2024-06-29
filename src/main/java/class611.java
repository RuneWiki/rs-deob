import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class611 {

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "Lgq;")
    private class476 field8687;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8685;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8690;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "Lrs;")
    private class605 field8688;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "Lnn;")
    private class381 field8697;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "Lde;")
    public static class492 field8692 = new class492(0, 0);

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "[I")
    public static int[] field8693 = new int[1];

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public static int field8698 = 0;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "Lie;")
    private class6 field8691;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "[Llh;")
    private class487[] field8695;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public final void method3556(int arg0) {
        if (arg0 != -31742) {
            return;
        }
        field8686++;
        if (this.field8695 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field8695.length; var2++) {
            if (this.field8695[var2] != null) {
                this.field8695[var2].method2985((byte) 19);
            }
        }
        for (int var3 = 0; var3 < this.field8695.length; var3++) {
            if (this.field8695[var3] != null) {
                this.field8695[var3].method2988(-105);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)Z")
    public final boolean method3557(int arg0) {
        field8689++;
        if (this.field8691 != null) {
            return true;
        }
        if (this.field8697 == null) {
            if (this.field8687.method2951(-6508)) {
                return false;
            }
            this.field8697 = this.field8687.method2957((byte) 76, 255, true, (byte) 0, 255);
        }
        if (this.field8697.field644) {
            return false;
        }
        class6 var2 = new class6(this.field8697.method552(false));
        if (arg0 < 14) {
            method3560(96, 51, 46, false, true, null);
        }
        var2.field57 = 5;
        int var3 = var2.method70(-9059);
        var2.field57 += var3 * 72;
        byte[] var4 = new byte[var2.field96.length - var2.field57];
        var2.method50(var4, 0, var4.length, (byte) 19);
        byte[] var7;
        if (this.field8690 == null || this.field8685 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field8690, this.field8685);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class275.method1931(var2.field96, var2.field57 - var4.length - 5, 5, 29654);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field8691 = var2;
        this.field8695 = new class487[var3];
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
    public static void method3558(boolean arg0) {
        field8693 = null;
        field8692 = null;
        if (arg0) {
            field8698 = -61;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lmu;ILmu;B)Llh;")
    public final class487 method3559(class275 arg0, int arg1, class275 arg2, byte arg3) {
        if (arg3 >= -125) {
            this.field8697 = null;
        }
        field8683++;
        return this.method3562((byte) -57, true, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIZZ[Lpca;)V")
    public static final void method3560(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, class665[] arg5) {
        field8681++;
        int var6 = 0;
        if (arg4) {
            return;
        }
        while (arg5.length > var6) {
            class665 var7 = arg5[var6];
            if (var7 != null && var7.field9401 == arg2) {
                class315.method2149(var7, !arg4, arg3, arg1, arg0);
                class391.method2537(arg1, -59, arg0, var7);
                if (var7.field9318 - var7.field9411 < var7.field9393) {
                    var7.field9393 = var7.field9318 - var7.field9411;
                }
                if ((var7.field9260 - var7.field9282) < var7.field9394) {
                    var7.field9394 = var7.field9260 - var7.field9282;
                }
                if (var7.field9393 < 0) {
                    var7.field9393 = 0;
                }
                if (var7.field9394 < 0) {
                    var7.field9394 = 0;
                }
                if (var7.field9309 == 0) {
                    class318.method2168((byte) 106, var7, arg3);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static final void method3561(byte arg0) {
        if (arg0 == 0) {
            class52.field693 = 0;
            field8682++;
            class307.field4831.method3474(22090);
            class453.field6808 = false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZILmu;Lmu;)Llh;")
    private final class487 method3562(byte arg0, boolean arg1, int arg2, class275 arg3, class275 arg4) {
        field8684++;
        if (this.field8691 == null) {
            throw new RuntimeException();
        } else if (arg2 < 0 || this.field8695.length <= arg2) {
            throw new RuntimeException();
        } else if (this.field8695[arg2] == null) {
            this.field8691.field57 = arg2 * 72 + 6;
            if (arg0 != -57) {
                this.field8697 = null;
            }
            int var6 = this.field8691.method72(-95);
            int var7 = this.field8691.method72(-42);
            byte[] var8 = new byte[64];
            this.field8691.method50(var8, 0, 64, (byte) 19);
            class487 var9 = new class487(arg2, arg4, arg3, this.field8687, this.field8688, var6, var8, var7, arg1);
            this.field8695[arg2] = var9;
            return var9;
        } else {
            return this.field8695[arg2];
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lgq;Lrs;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class611(class476 arg0, class605 arg1, BigInteger arg2, BigInteger arg3) {
        this.field8687 = arg0;
        this.field8685 = arg3;
        this.field8690 = arg2;
        this.field8688 = arg1;
        if (!this.field8687.method2951(-6508)) {
            this.field8697 = this.field8687.method2957((byte) -128, 255, true, (byte) 0, 255);
        }
    }
}
