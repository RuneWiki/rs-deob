import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class480 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public int field6862 = 0;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public int field6867 = 0;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "Lau;")
    private class692 field6870 = new class692(64);

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Ld;")
    private class88 field6871 = null;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lmv;")
    private class295 field6861;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Lmv;")
    private class295 field6864;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Z")
    public static boolean field6866 = false;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "Liba;")
    public static class211 field6869 = new class211(25, -1);

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Lks;")
    public static class421 field6872;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "[I")
    public static int[] field6863;

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(ILmv;Lmv;Ld;)V", line = 104)
    public class480(int arg0, class295 arg1, class295 arg2, class88 arg3) {
        this.field6861 = arg1;
        this.field6871 = arg3;
        this.field6864 = arg2;
        if (this.field6861 != null) {
            this.field6867 = this.field6861.method1845(1, true);
        }
        if (this.field6864 != null) {
            this.field6862 = this.field6864.method1845(1, true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lcq;[IJB)Ljava/lang/String;", line = 12)
    public final String method2748(class273 arg0, int[] arg1, long arg2, byte arg3) {
        field6865++;
        if (this.field6871 != null) {
            String var6 = this.field6871.method497((byte) 83, arg1, arg0, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg3 != 88) {
            method2750(-23);
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)Lmn;", line = 34)
    public final class212 method2749(int arg0, boolean arg1) {
        field6868++;
        if (arg1) {
            method2750(-69);
        }
        class212 var3 = (class212) this.field6870.method3901((long) arg0, -82);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field6864.method1844(1, 31330, arg0 & 0x7FFF);
        } else {
            var4 = this.field6861.method1844(1, 31330, arg0);
        }
        class212 var5 = new class212();
        var5.field2858 = this;
        if (var4 != null) {
            var5.method1350((byte) 41, new class540(var4));
        }
        if (arg0 >= 32768) {
            var5.method1344((byte) -78);
        }
        this.field6870.method3894(var5, (byte) 60, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 75)
    public static void method2750(int arg0) {
        field6872 = null;
        field6869 = null;
        field6863 = null;
        if (arg0 > -104) {
            field6863 = null;
        }
    }
}
