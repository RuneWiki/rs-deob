import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[[[B")
    public static byte[][][] field104 = new byte[4][104][104];

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static volatile int field108 = 0;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lea;")
    public static class38 field107 = class9.method46((byte) 119, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field103 = 0;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lea;")
    public static class38 field111 = class9.method46((byte) 111, "hel");

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lea;")
    private static class38 field109 = class9.method46((byte) 127, "Loaded wordpack");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lea;")
    public static class38 field98 = field109;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Lea;")
    public static class38 field113 = class9.method46((byte) 125, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lea;")
    public static class38 field112 = class9.method46((byte) 119, "leuchten1:");

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lef;")
    public static class43 field102;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lha;")
    public static class64 field100;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
    public static int[] field110;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field99++;
        if (arg6 >= -4) {
            field110 = null;
        }
        if (class53.method385(arg1, 27323)) {
            class65.method459(arg4, arg0, arg2, arg3, arg5, -1, (byte) -45, arg7, class168.field3461[arg1]);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ldd;IB)Lnc;")
    public static final class119 method16(class32 arg0, int arg1, byte arg2) {
        field105++;
        if (arg2 >= -20) {
            field103 = -117;
        }
        byte[] var3 = arg0.method195(arg1, (byte) 94);
        return var3 == null ? null : new class119(var3);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method17(int arg0) {
        field113 = null;
        field111 = null;
        field112 = null;
        field110 = null;
        field104 = null;
        field100 = null;
        if (arg0 != -1788) {
            field112 = null;
        }
        field107 = null;
        field98 = null;
        field102 = null;
        field109 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static final void method18(byte arg0) {
        if (arg0 >= -91) {
            field110 = null;
        }
        for (class45 var1 = (class45) class14.field298.method1020(0); var1 != null; var1 = (class45) class14.field298.method1027((byte) 44)) {
            if (var1.field1101 != null) {
                var1.method330(-870);
            }
        }
        field101++;
    }
}
