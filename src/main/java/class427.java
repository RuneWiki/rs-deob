import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class427 {

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Z")
    public boolean field6013 = false;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "[I")
    public static int[] field6010 = new int[6];

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public int field6014;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lqia;")
    public static class23 field6004;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Liba;")
    public class553 field6005;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILrv;)V", line = 8)
    public final void method2541(int arg0, class120 arg1) {
        field6009++;
        if (arg0 != -1) {
            field6010 = null;
        }
        while (true) {
            int var3 = arg1.method842(2384);
            if (var3 == 0) {
                return;
            }
            this.method2542(var3, arg0 ^ 0xFFFFFFBE, arg1);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILrv;)V", line = 28)
    private final void method2542(int arg0, int arg1, class120 arg2) {
        if (arg0 == 1) {
            this.field6014 = arg2.method898((byte) -87);
        } else if (arg0 == 2) {
            this.field6008 = arg2.method833(-3);
        } else if (arg0 == 3) {
            this.field6013 = true;
        } else if (arg0 == 4) {
            this.field6014 = -1;
        }
        if (arg1 <= 39) {
            this.method2545(-85, -25, false, null);
        }
        field6011++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)V", line = 56)
    public static final void method2543(int arg0, boolean arg1) {
        class246.field3513 = 0;
        class664.field9319 = -1;
        class733.field10242 = null;
        class763.field10505 = arg0;
        class368.field5295 = null;
        class341.field5056 = -1;
        class611.field8622 = arg1;
        field6012++;
        class420.field5909 = 1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Z", line = 76)
    public final boolean method2544(int arg0) {
        if (arg0 >= -82) {
            field6004 = null;
        }
        field6006++;
        return this.field6005.field7869.method3131(100, this.field6014);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZLha;)Lqda;", line = 93)
    public final class112 method2545(int arg0, int arg1, boolean arg2, class66 arg3) {
        field6007++;
        long var5 = (long) (arg0 << 16 | this.field6014 | (arg2 ? 262144 : 0) | arg3.field884 << 19);
        class112 var7 = (class112) this.field6005.field7881.method2373(var5, 103);
        if (var7 != null) {
            return var7;
        } else if (this.field6005.field7869.method3131(arg1 + 101, this.field6014)) {
            class625 var8 = class625.method3580(this.field6005.field7869, this.field6014, arg1);
            if (var8 != null) {
                var8.field8821 = var8.field8826 = var8.field8824 = var8.field8825 = 0;
                if (arg2) {
                    var8.method3575();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method3577();
                }
            }
            class112 var10 = arg3.method482(var8, true);
            if (var10 != null) {
                this.field6005.field7881.method2362(var10, 0, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 141)
    public static void method2546(boolean arg0) {
        if (arg0) {
            field6004 = null;
        }
        field6010 = null;
        field6004 = null;
    }
}
