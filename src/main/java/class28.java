import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class28 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
    public static int[] field480 = new int[2];

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[I")
    public static int[] field487 = new int[50];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
    public static int[] field484;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lrc;")
    public static final class219 method178(int arg0, int arg1) {
        field486++;
        class219 var2 = (class219) class15.field305.method99((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class171.field2768.method1149(16, (byte) 30, arg0);
        class219 var4 = new class219();
        if (var3 != null) {
            var4.method1560((byte) 64, new class249(var3));
        }
        if (arg1 != 250) {
            method179(-29, -33);
        }
        class15.field305.method100((long) arg0, var4, 113);
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
    public static final void method179(int arg0, int arg1) {
        if (arg0 >= 47) {
            field483++;
            class190.field3074.method98(1, arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method180(int arg0) {
        int var1 = -125 % ((1 - arg0) / 59);
        field487 = null;
        field484 = null;
        field480 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IC)C")
    public static final char method181(int arg0, char arg1) {
        field478++;
        int var2 = 70 % ((-arg0 - 38) / 51);
        if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == '-') {
            return '\u0000';
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else if (arg1 == ' ' || arg1 == ' ') {
            return '_';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(JZ)V")
    public static final void method182(long arg0, boolean arg1) {
        if (!arg1) {
            method178(32, -26);
        }
        field482++;
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class110.method821(-21304, arg0 - 1L);
            class110.method821(-21304, 1L);
        } else {
            class110.method821(-21304, arg0);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILek;Lhg;III)V")
    public static final void method183(int arg0, int arg1, class250 arg2, class207 arg3, int arg4, int arg5, int arg6) {
        field485++;
        if (arg2 == null) {
            return;
        }
        int var7;
        if (class169.field2739 == 4) {
            var7 = (int) class265.field4432 & 0x7FF;
        } else {
            var7 = (int) class265.field4432 + class314.field5060 & 0x7FF;
        }
        int var8 = Math.max(arg3.field3484 / 2, arg3.field3481 / 2) + 10;
        int var9 = arg0 * arg0 + arg4 * arg4;
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = 116 / ((16 - arg5) / 55);
        int var11 = class128.field2133[var7];
        int var12 = class128.field2130[var7];
        if (class169.field2739 != 4) {
            var11 = var11 * 256 / (class286.field4738 + 256);
            var12 = var12 * 256 / (class286.field4738 + 256);
        }
        int var13 = arg0 * var11 + arg4 * var12 >> 16;
        int var14 = arg0 * var12 - arg4 * var11 >> 16;
        ((class230) arg2).method1649(arg3.field3484 / 2 + arg1 + var13 - arg2.field4226 / 2, arg6 - -(arg3.field3481 / 2) - var14 + -(arg2.field4230 / 2), arg3.field3363, arg3.field3359);
    }
}
