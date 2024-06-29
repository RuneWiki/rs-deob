import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class185 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
    public static int[] field3604 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lob;")
    public static class141 field3602 = class175.method1195(40, "<)4col>");

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field3608 = 0;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Z")
    public static boolean field3606 = false;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lob;")
    public static class141 field3609 = class175.method1195(40, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lob;")
    public static class141 field3607 = null;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lob;")
    public static class141 field3611 = class175.method1195(40, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lpe;")
    public static class154 field3605;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lca;")
    public static class22 field3601;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)I")
    public static final int method1236(int arg0, int arg1, boolean arg2) {
        field3610++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            if (!arg2) {
                field3605 = null;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method1237(boolean arg0) {
        field3604 = null;
        field3602 = null;
        field3611 = null;
        field3601 = null;
        field3609 = null;
        if (arg0) {
            field3606 = true;
        }
        field3607 = null;
        field3605 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lfg;")
    public static final class58 method1238(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2923;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
    public static final void method1239(boolean arg0) {
        if (class150.field2889 != null) {
            class191 var1 = class150.field2889;
            synchronized (class150.field2889) {
                class150.field2889 = null;
            }
        }
        field3603++;
        if (arg0) {
            field3601 = null;
        }
    }
}
