import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class135 extends class532 {

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "Z")
    private boolean field1696 = false;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "Lhj;")
    public static class596 field1691 = new class596(83, 0);

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "[[Z")
    public static boolean[][] field1695 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
    public static boolean field1699 = false;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIZII)V")
    public static final void method998(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field1693;
        int var5 = -111 / ((-25 - arg3) / 60);
        if (class647.method3652(arg4, 0)) {
            class707.method4012(arg1, 0, arg0, -1, arg2, class316.field3880[arg4]);
        }
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V")
    public static void method999(int arg0) {
        if (arg0 > 82) {
            field1695 = null;
            field1691 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lwg;)V")
    public class135(class449 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V")
    public final void method707(boolean arg0, int arg1) {
        ++field1689;
        super.field7494.method2716(class75.field1039, 80, class269.field3180);
        if (arg1 != 30902) {
            this.method700(35, (byte) 94, 106);
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)Z")
    public final boolean method703(byte arg0) {
        ++field1698;
        return arg0 <= 126 ? true : true;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZILgaa;)V")
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        if (!arg0) {
            field1691 = null;
        }
        ++field1694;
        super.field7494.method2643(-2, arg2);
        super.field7494.method2649((byte) 126, arg1);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBI)V")
    public final void method700(int arg0, byte arg1, int arg2) {
        ++field1697;
        if (arg1 != 94) {
            this.method703((byte) -39);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
    public final void method699(boolean arg0) {
        if (arg0) {
            field1691 = null;
        }
        ++field1692;
        if (!this.field1696) {
            super.field7494.method2703(class507.field7214, (byte) -109, 0);
        } else {
            super.field7494.method2691(false, 1);
            super.field7494.method59(class204.field2443, 231);
            super.field7494.method2716(class269.field3180, 41, class269.field3180);
            super.field7494.method2694((byte) -49, 2, class555.field7718);
            super.field7494.method2703(class507.field7214, (byte) 32, 0);
            super.field7494.method2671(89);
            super.field7494.method2643(-2, (class315) null);
            super.field7494.method2691(arg0, 0);
            this.field1696 = false;
        }
        super.field7494.method2716(class269.field3180, 50, class269.field3180);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZB)V")
    public final void method702(boolean arg0, byte arg1) {
        ++field1690;
        if (arg1 != -10) {
            this.method702(true, (byte) 100);
        }
        class69 var3 = super.field7494.method2676(0);
        if (var3 != null && arg0) {
            super.field7494.method2691(false, 1);
            super.field7494.method2643(-2, var3);
            super.field7494.method59(class244.field2876, 231);
            super.field7494.method2691(false, 1);
            super.field7494.method2716(class75.field1039, 39, class8.field135);
            super.field7494.method4(class616.field8291, true, (byte) 95, false, 2);
            super.field7494.method2703(class606.field8160, (byte) -105, 0);
            class256 var4 = super.field7494.method2710(-64);
            var4.method1531(super.field7494.method2661(arg1 + 13155), 0);
            super.field7494.method2720(class444.field5955, (byte) 49);
            super.field7494.method2691(false, 0);
            this.field1696 = true;
        } else {
            super.field7494.method2703(class606.field8160, (byte) 20, 0);
        }
    }
}
