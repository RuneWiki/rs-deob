import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class265 {

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "Llga;")
    private class663 field3588 = new class663(256);

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "Lfa;")
    private class212 field3591;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Lnv;")
    private class382 field3587;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "F")
    public static float field3584;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Lf;")
    public static class702 field3585;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3590;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)Lcm;", line = 7)
    public final class679 method1614(int arg0, int arg1) {
        if (arg0 <= 69) {
            return null;
        }
        field3589++;
        Object var3 = this.field3588.method3747((byte) -66, (long) arg1);
        if (var3 != null) {
            return (class679) var3;
        } else if (this.field3591.method1367(arg1, false)) {
            class686 var4 = this.field3591.method1365(-17951, arg1);
            int var5 = var4.field9795 ? 64 : this.field3587.field5379;
            class679 var7;
            if (var4.field9786 && this.field3587.method120()) {
                float[] var6 = this.field3591.method1369(0.7F, var5, true, arg1, var5, false);
                var7 = this.field3587.method2198(class129.field1851, var5, var4.field9780 != 0, var5, true, var6);
            } else {
                int[] var8 = !var4.field9784 && class67.method562((byte) -18, var4.field9797) ? this.field3591.method1366(true, arg1, var5, 0.7F, var5, (byte) -115) : this.field3591.method1370(0.7F, false, var5, (byte) -16, var5, arg1);
                var7 = this.field3587.method2206(var4.field9780 != 0, var8, var5, var5, -12482);
            }
            var7.method2137(var4.field9781, 77, var4.field9792);
            this.field3588.method3748((long) arg1, var7, 12537);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 49)
    public final void method1615(int arg0) {
        this.field3588.method3754(5, true);
        if (arg0 != 24223) {
            this.field3591 = null;
        }
        field3593++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V", line = 64)
    public final void method1616(boolean arg0) {
        if (!arg0) {
            this.field3588 = null;
        }
        field3592++;
        this.field3588.method3749(7648);
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lnv;Lfa;)V", line = 91)
    public class265(class382 arg0, class212 arg1) {
        this.field3591 = arg1;
        this.field3587 = arg0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V", line = 78)
    public static void method1617(byte arg0) {
        field3590 = null;
        if (arg0 > 121) {
            field3585 = null;
        }
    }
}
