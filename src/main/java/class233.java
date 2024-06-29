import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class233 extends class431 {

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "Lsu;")
    public static class143 field3759 = new class143();

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "[I")
    public static int[] field3770 = new int[2];

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "Lhn;")
    public static class509 field3769 = new class509(97, 3);

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "[I")
    public int[] field3760;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "[I")
    public int[] field3761;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "[I")
    public int[] field3767;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "[Lam;")
    public class449[] field3758;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "[Lam;")
    public class449[] field3766;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "[[[B")
    public byte[][][] field3757;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
    public static void method1630(boolean arg0) {
        field3769 = null;
        if (arg0) {
            field3770 = null;
            field3759 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZIB)V")
    public static final void method1631(int arg0, boolean arg1, int arg2, byte arg3) {
        field3763++;
        if (arg3 != -87) {
            field3769 = null;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class40.field540 = arg2;
        class147.field2236 = arg0;
        class368.field5405 = arg1;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public static final void method1632(int arg0) {
        field3764++;
        if (~class136.field2074 > arg0) {
            class136.field2074 = 0;
            class334.field4988 = -1;
            class108.field1510 = -1;
        }
        if (class136.field2074 > class7.field108) {
            class136.field2074 = class7.field108;
            class334.field4988 = -1;
            class108.field1510 = -1;
        }
        if (class319.field4810 < 0) {
            class319.field4810 = 0;
            class334.field4988 = -1;
            class108.field1510 = -1;
        }
        if (class319.field4810 > class7.field104) {
            class319.field4810 = class7.field104;
            class108.field1510 = -1;
            class334.field4988 = -1;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1633(int arg0, String arg1) {
        field3771++;
        if (arg1 == null) {
            return -1;
        } else if (arg0 == 2760) {
            for (int var2 = 0; var2 < class64.field785; var2++) {
                if (arg1.equalsIgnoreCase(class221.field3622[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -77;
        }
    }
}
