import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 extends class13 {

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "[Ljd;")
    public static class66[] field3264 = new class66[2048];

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Lec;")
    public static class32 field3260 = class73.method594("Ung-Ultiges Anmelde)2Paket)3", true);

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "Lja;")
    public static class63 field3271 = new class63(50);

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "Lec;")
    public static class32 field3273 = class73.method594("Lade Texturen )2 ", true);

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lec;")
    public static class32 field3276 = class73.method594("scrollbar", true);

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field3277 = 7759444;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "Lec;")
    public static class32 field3278 = class73.method594("::qa_op_test", true);

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field3279 = 0;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "Lec;")
    public static class32 field3280 = class73.method594("<img=0>", true);

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "[I")
    public static int[] field3281 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public int field3261;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "Lec;")
    public class32 field3263;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "Lb;")
    public static class8 field3275;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "[I")
    public int[] field3267;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "[I")
    public int[] field3272;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "[I")
    public static int[] field3274;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "[Lec;")
    public class32[] field3270;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -24253) {
            field3281 = null;
        }
        field3262++;
        int var7 = 2048 - arg5 & 0x7FF;
        int var8 = arg3;
        int var9 = 2048 - arg0 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        if (var7 != 0) {
            int var12 = class7.field113[var7];
            int var13 = class7.field121[var7];
            int var14 = var10 * var13 - arg3 * var12 >> 16;
            var8 = var10 * var12 + arg3 * var13 >> 16;
            var10 = var14;
        }
        if (var9 != 0) {
            int var15 = class7.field113[var9];
            int var16 = class7.field121[var9];
            int var17 = var8 * var15 + var11 * var16 >> 16;
            var8 = var8 * var16 - var11 * var15 >> 16;
            var11 = var17;
        }
        class73.field1720 = arg1 - var10;
        class105.field2496 = arg4 - var11;
        class48.field1127 = arg6 - var8;
        class115.field2720 = arg0;
        class45.field1050 = arg5;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field3273 = null;
        field3260 = null;
        field3274 = null;
        field3276 = null;
        field3281 = null;
        field3275 = null;
        if (arg0 == 22755) {
            field3264 = null;
            field3271 = null;
            field3278 = null;
            field3280 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1081(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = arg6 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg1;
            arg1 = var8;
        }
        field3268++;
        int var9 = 81 % ((-arg5 - 1) / 57);
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 1 + 7 - arg3 - arg4;
        } else {
            return 1 + 7 - arg1 - arg0;
        }
    }
}
