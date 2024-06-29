import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class210 extends class206 {

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
    public static int[] field3679 = new int[100];

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Loc;")
    public static class151 field3683 = class137.method873(2, "title)3jpg");

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3678 = 0;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Loc;")
    public static class151 field3681 = class137.method873(2, "(U5");

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Loc;")
    public static class151 field3686 = class137.method873(2, " <col=00ff80>");

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Loc;")
    private static class151 field3690 = class137.method873(2, "Loading config )2 ");

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Loc;")
    public static class151 field3685 = field3690;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BB)Loc;")
    public static final class151 method1307(int arg0, int arg1, byte[] arg2, byte arg3) {
        class151 var4 = new class151();
        var4.field2690 = 0;
        var4.field2736 = new byte[arg1];
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg2[var5] != 0) {
                var4.field2736[var4.field2690++] = arg2[var5];
            }
        }
        if (arg3 > -77) {
            method1310(92, 19);
        }
        field3687++;
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method1308(int arg0) {
        field3683 = null;
        field3681 = null;
        field3685 = null;
        int var1 = -98 / ((-arg0 - 4) / 61);
        field3679 = null;
        field3690 = null;
        field3686 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    public static final void method1309(int arg0, int arg1, int arg2) {
        field3688++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var3[0] = arg2;
        var4[0] = arg1;
        int var5 = -99 / ((arg0 - 79) / 34);
        int var6 = 1;
        for (int var7 = 0; var7 < 4; var7++) {
            if (class89.field1632[var7] != arg2) {
                var3[var6] = class89.field1632[var7];
                var4[var6] = class211.field3696[var7];
                var6++;
            }
        }
        class89.field1632 = var3;
        class211.field3696 = var4;
        class215.method1346(0, class211.field3696, class222.field3849.length - 1, class89.field1632, 121, class222.field3849);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
    public static final int method1310(int arg0, int arg1) {
        if (arg1 != 255) {
            field3685 = null;
        }
        field3680++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I")
    public static final int method1311(int arg0) {
        field3684++;
        if (class138.field2517 == 3.0D) {
            return 37;
        } else if (arg0 > -102) {
            return 41;
        } else if (class138.field2517 == 4.0D) {
            return 50;
        } else if (class138.field2517 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3682++;
        if ((arg2 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg3;
        } else if (arg1 == 12920) {
            return var8 == 2 ? 1 + 7 - arg0 - arg5 : 1 - (arg6 - (-arg3 + 7));
        } else {
            return 75;
        }
    }
}
