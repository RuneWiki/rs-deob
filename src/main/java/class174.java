import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class174 {

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "D")
    public static double field3152 = -1.0D;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    public static boolean field3149 = false;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "J")
    public static long field3145 = 0L;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Loc;")
    public static class151 field3156 = class137.method873(2, "<col=00ff80>");

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Loc;")
    private static class151 field3158 = class137.method873(2, "Service unavailable)3");

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Loc;")
    public static class151 field3159 = class137.method873(2, "gelb:");

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field3157 = 0;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Loc;")
    private static class151 field3155 = class137.method873(2, "Location");

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Loc;")
    public static class151 field3148 = field3158;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Loc;")
    public static class151 field3146 = field3155;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Lda;")
    public static class35 field3151;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[Loc;")
    public static class151[] field3153;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[[B")
    public static byte[][] field3147;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field3151 = null;
        field3158 = null;
        if (arg0 != 2) {
            method1110(false, null);
        }
        field3159 = null;
        field3155 = null;
        field3148 = null;
        field3147 = null;
        field3146 = null;
        field3153 = null;
        field3156 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIII)V")
    public static final void method1109(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 117) {
            method1111(71, 10, -36);
        }
        field3154++;
        if (arg3 <= arg0) {
            class55.method380(arg4, 108, class43.field887[arg2], arg0, arg3);
        } else {
            class55.method380(arg4, 114, class43.field887[arg2], arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLwd;)I")
    public static final int method1110(boolean arg0, class232 arg1) {
        if (!arg0) {
            field3146 = null;
        }
        field3160++;
        class170 var2 = (class170) class93.field1729.method1538(((long) arg1.field4261 << 32) + (long) arg1.field4174, (byte) 127);
        return var2 == null ? arg1.field4202 : var2.field3098;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
    public static final int method1111(int arg0, int arg1, int arg2) {
        field3150++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 != 11794) {
            field3149 = true;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)Llf;")
    public static final class124 method1112(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1397; var4++) {
            class124 var5 = var3.field1405[var4];
            if ((var5.field2230 >> 29 & 0x3L) == 2L && var5.field2224 == arg1 && var5.field2214 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
