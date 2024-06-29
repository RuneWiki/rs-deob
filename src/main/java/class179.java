import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class179 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[I")
    public static int[] field3151 = new int[32];

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[I")
    public static int[] field3154;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "[I")
    public static int[] field3157;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lfe;")
    public static class15 field3158;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lgf;")
    public static class173 field3156;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[I")
    public static int[] field3152;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[[[B")
    public static byte[][][] field3155;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIZI)I")
    public static final int method1179(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            field3156 = null;
        }
        field3150++;
        int var5 = 65536 - class248.field4301[arg4 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)I")
    public static final int method1180(int arg0, int arg1, int arg2, int arg3) {
        field3149++;
        if ((class205.field3561[arg2][arg3][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class205.field3561[1][arg3][arg1] & 0x2) == 0) {
            if (arg0 != -5552) {
                field3153 = 110;
            }
            return arg2;
        } else {
            return arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILoe;)I")
    public static final int method1181(int arg0, class256 arg1) {
        int var2 = 0;
        if (arg1.method1692(class33.field416, 0)) {
            var2++;
        }
        if (arg0 <= 36) {
            field3157 = null;
        }
        if (arg1.method1692(class93.field1466, 0)) {
            var2++;
        }
        field3148++;
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field3152 = null;
        if (arg0 < 55) {
            method1181(-84, null);
        }
        field3154 = null;
        field3151 = null;
        field3156 = null;
        field3155 = null;
        field3157 = null;
        field3158 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3151[var1] = var0 - 1;
            var0 += var0;
        }
        field3154 = new int[25];
        field3153 = 0;
        field3157 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
    }
}
