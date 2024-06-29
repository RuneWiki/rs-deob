import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class258 {

    @OriginalMember(owner = "client!om", name = "a", descriptor = "Lqv;")
    public static class316 field3821 = new class316(41, -1);

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Z")
    public static boolean field3827 = false;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field3828 = -1;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Lgw;")
    public static class118 field3829 = new class118();

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Ldh;")
    public static class216 field3830 = new class216(3, 3);

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Lbp;")
    public class268 field3824;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "[I")
    public int[] field3825;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I[BII)I", line = 3)
    public static final int method1662(int arg0, byte[] arg1, int arg2, int arg3) {
        field3823++;
        if (arg3 != 3198) {
            field3821 = null;
        }
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = class429.field6173[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 27)
    public static final long method1663(String arg0, int arg1) {
        field3826++;
        int var2 = arg0.length();
        long var3 = 0L;
        if (arg1 == -6567) {
            for (int var5 = 0; var5 < var2; var5++) {
                var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
            }
            return var3;
        } else {
            return -35L;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 54)
    public static void method1664(boolean arg0) {
        if (arg0) {
            field3828 = -81;
        }
        field3830 = null;
        field3821 = null;
        field3829 = null;
    }
}
