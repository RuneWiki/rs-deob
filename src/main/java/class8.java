import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ag")
public class class8 {

    @OriginalMember(owner = "ag", name = "e", descriptor = "Llf;")
    public static class109 field113 = class35.method275(" loggt sich ein)3", 2);

    @OriginalMember(owner = "ag", name = "g", descriptor = "[I")
    public static int[] field115 = new int[1000];

    @OriginalMember(owner = "ag", name = "h", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "ag", name = "i", descriptor = "Llf;")
    public static class109 field117 = class35.method275("Verbinde mit Server)3)3)3", 2);

    @OriginalMember(owner = "ag", name = "j", descriptor = "Llf;")
    public static class109 field118 = class35.method275("headicons_hint", 2);

    @OriginalMember(owner = "ag", name = "c", descriptor = "Lrc;")
    public static class160 field111 = new class160(20);

    @OriginalMember(owner = "ag", name = "k", descriptor = "I")
    public static int field119 = -1;

    @OriginalMember(owner = "ag", name = "a", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "ag", name = "b", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "ag", name = "d", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "ag", name = "f", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "ag", name = "a", descriptor = "(IIII)V")
    public static final void method36(int arg0, int arg1, int arg2, int arg3) {
        field114++;
        if (class10.field162 != 0 && arg0 != 0 && class92.field1890 < 50 && arg1 != -1) {
            class72.field1396[class92.field1890] = arg1;
            class164.field3094[class92.field1890] = arg0;
            class149.field2873[class92.field1890] = arg3;
            class132.field2545[class92.field1890] = null;
            class31.field740[class92.field1890] = 0;
            class92.field1890++;
        }
        if (arg2 != 0) {
            method36(55, -38, 52, -96);
        }
    }

    @OriginalMember(owner = "ag", name = "a", descriptor = "(ILvg;)Llf;")
    public static final class109 method37(int arg0, class200 arg1) {
        field112++;
        if (class30.method243(-125, class126.method918(arg1, arg0 + 101)) == arg0) {
            return null;
        } else if (arg1.field3848 == null || arg1.field3848.method774((byte) 62).method786(arg0 ^ 0xFFFF887F) == 0) {
            return class158.field2973 ? class53.field1076 : null;
        } else {
            return arg1.field3848;
        }
    }

    @OriginalMember(owner = "ag", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class206.field4051[arg0][var8][var14] == -class102.field2020) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class29.field623[arg0][arg1][arg3] + arg5;
            if (!class1.method1(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class1.method1(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class1.method1(var9, var11, var13)) {
                return false;
            } else if (class1.method1(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class201.method1327(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class1.method1(var6 + 1, class29.field623[arg0][arg1][arg3] + arg5, var7 + 1) && class1.method1(var6 + 128 - 1, class29.field623[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class1.method1(var6 + 128 - 1, class29.field623[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class1.method1(var6 + 1, class29.field623[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ag", name = "a", descriptor = "(I)V")
    public static void method39(int arg0) {
        field113 = null;
        field111 = null;
        field118 = null;
        if (arg0 != -1) {
            method39(58);
        }
        field117 = null;
        field115 = null;
    }
}
