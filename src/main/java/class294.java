import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class294 {

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "Ltb;")
    private class450 field3641 = new class450(256);

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "Lqj;")
    private class548 field3642;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "Lfa;")
    private class526 field3645;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field3635 = -1;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field3640 = 0;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field3634 = 0;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "Laga;")
    public static class661 field3639;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "[Lfba;")
    public static class565[] field3644;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V", line = 5)
    public static void method1646(byte arg0) {
        int var1 = 89 % ((8 - arg0) / 47);
        field3644 = null;
        field3639 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V", line = 19)
    public final void method1647(int arg0) {
        field3643++;
        if (arg0 > 112) {
            this.field3641.method2411(true, 5);
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 30)
    public final void method1648(int arg0) {
        field3637++;
        this.field3641.method2406(arg0 + 11977);
        if (arg0 != 6408) {
            this.field3642 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V", line = 48)
    public static final void method1649(boolean arg0) {
        if (arg0) {
            method1646((byte) 121);
        }
        class453.field5813.method2406(18385);
        field3636++;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Lpm;", line = 70)
    public final class133 method1650(int arg0, int arg1) {
        field3638++;
        if (arg1 != 256) {
            this.method1647(-57);
        }
        Object var3 = this.field3641.method2418((long) arg0, (byte) 100);
        if (var3 != null) {
            return (class133) var3;
        } else if (this.field3645.method2480(false, arg0)) {
            class13 var4 = this.field3645.method2486(arg0, (byte) 86);
            int var5 = var4.field241 ? 64 : this.field3642.field7464;
            class133 var7;
            if (var4.field245 && this.field3642.method1006()) {
                float[] var6 = this.field3645.method2483(arg1 ^ 0x17F, var5, false, 0.7F, var5, arg0);
                var7 = new class133(this.field3642, 3553, 34842, var5, var5, var4.field232 != 0, var6, 6408);
            } else {
                int[] var8;
                if (!var4.field244 && class639.method3580(-30497, var4.field234)) {
                    var8 = this.field3645.method2481(arg0, 0.7F, true, var5, -5969, var5);
                } else {
                    var8 = this.field3645.method2488(0.7F, var5, (byte) 76, false, var5, arg0);
                }
                var7 = new class133(this.field3642, 3553, 6408, var5, var5, var4.field232 != 0, var8, false);
            }
            var7.method774(var4.field243, (byte) -91, var4.field238);
            this.field3641.method2409((long) arg0, var7, 1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lqj;Lfa;)V", line = 121)
    public class294(class548 arg0, class526 arg1) {
        this.field3642 = arg0;
        this.field3645 = arg1;
    }
}
