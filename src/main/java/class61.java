import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class61 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field1120 = 4;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[B")
    public static byte[] field1121 = new byte[520];

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
    public static int[] field1122 = new int[field1120];

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field1125 = 0;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lij;")
    public static class50 field1129 = class78.method578(123, ")3runescape)3com");

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
    public static int[] field1128 = new int[32];

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lij;")
    public static class50 field1123 = class78.method578(124, "<col=ff9040>");

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lij;")
    public static class50 field1126 = class78.method578(123, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[[Lba;")
    public static class255[][] field1131 = new class255[field1120][500];

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIILaa;IJZ)Z")
    public static final boolean method470(int arg0, int arg1, int arg2, int arg3, int arg4, class16 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class45.method342(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method471(int arg0) {
        field1129 = null;
        field1128 = null;
        field1123 = null;
        field1122 = null;
        if (arg0 <= 7) {
            field1124 = 101;
        }
        field1131 = null;
        field1126 = null;
        field1121 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static final void method472(boolean arg0) {
        field1132++;
        if (!class188.field3116) {
            return;
        }
        class10 var1 = class62.method475(class231.field3883, class63.field1214, -1);
        if (var1 != null && var1.field140 != null) {
            class93 var2 = new class93();
            var2.field1739 = var1.field140;
            var2.field1740 = var1;
            class214.method1422(var2, -15181);
        }
        class188.field3116 = arg0;
        class140.method979((byte) 117, var1);
    }
}
