import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class135 extends class7 {

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    private int field2568;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "Z")
    public static boolean field2562 = false;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "Lob;")
    public static class141 field2564 = class175.method1195(40, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field2561 = 0;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "Lvc;")
    public static class212 field2572 = new class212(64);

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lob;")
    private static class141 field2575 = class175.method1195(40, "Loaded wordpack");

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "Lob;")
    public static class141 field2578 = field2575;

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "[Lob;")
    public static class141[] field2577 = new class141[1000];

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "Lpi;")
    public static class158 field2576 = new class158();

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "Lob;")
    private static class141 field2579 = class175.method1195(40, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "Lob;")
    public static class141 field2582 = class175.method1195(40, "null");

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "Lob;")
    public static class141 field2581 = field2579;

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "Lob;")
    public static class141 field2580 = class175.method1195(40, " weitere Optionen");

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "Lob;")
    public static class141 field2583 = class175.method1195(40, ":tradereq:");

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "[I")
    public static int[] field2566;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;")
    public static final Object method850(boolean arg0, boolean arg1, byte[] arg2) {
        ++field2560;
        if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class84.field1667) {
                try {
                    class46 var3 = (class46) Class.forName("lc").newInstance();
                    var3.method309(arg2, 0);
                    return var3;
                } catch (Throwable var4) {
                    class84.field1667 = true;
                }
            }
            if (!arg0) {
                return null;
            } else {
                return !arg1 ? arg2 : class19.method121(arg2, 16086);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lra;I)Z")
    public static final boolean method851(class170 arg0, int arg1) {
        ++field2563;
        if (arg0.field3373 == null) {
            return false;
        } else {
            for (int var2 = arg1; ~arg0.field3373.length < ~var2; ++var2) {
                int var3 = class93.method636(var2, arg0, arg1 + -31519);
                int var4 = arg0.field3403[var2];
                if (~arg0.field3373[var2] == -3) {
                    if (~var3 <= ~var4) {
                        return false;
                    }
                } else if (~arg0.field3373[var2] == -4) {
                    if (~var4 <= ~var3) {
                        return false;
                    }
                } else if (arg0.field3373[var2] != 4) {
                    if (var3 != var4) {
                        return false;
                    }
                } else if (var3 == var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(III)V")
    public static final void method852(int arg0, int arg1, int arg2) {
        ++field2573;
        int var3 = -91 / ((arg0 - -46) / 60);
        if (class14.field263 != 0 && arg2 != -1) {
            class4.method23(false, arg2, true, class164.field3174, 0, class14.field263);
            class118.field2305 = true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
    private class135(int arg0) {
        super(0, true);
        this.field2568 = 4096;
        this.field2568 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)V")
    public static void method853(int arg0) {
        field2580 = null;
        field2572 = null;
        field2576 = null;
        field2581 = null;
        field2564 = null;
        field2579 = null;
        field2577 = null;
        field2575 = null;
        field2582 = null;
        field2566 = null;
        field2578 = null;
        if (arg0 == -3) {
            field2583 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 <= 13) {
            method851((class170) null, 112);
        }
        int[] var3 = super.field100.method842(arg1, 12);
        ++field2570;
        if (super.field100.field2534) {
            class149.method1040(var3, 0, class117.field2272, this.field2568);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = 122 % ((arg1 - 66) / 57);
        if (arg0 == 0) {
            this.field2568 = (arg2.method991(255) << 12) / 255;
        }
        ++field2569;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class135() {
        this(4096);
    }
}
