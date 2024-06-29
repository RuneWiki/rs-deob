import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class35 extends class80 {

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field517 = 0;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lr;")
    public static class66 field520 = class93.method641(43, "Abbrechen");

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field521 = 0;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field526 = 0;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "F")
    public static float field527;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field518;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "[I")
    public int[] field523;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "[I")
    public int[] field524;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "[I")
    public int[] field528;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "[Lei;")
    public class232[] field529;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "[Lei;")
    public class232[] field533;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "[[Z")
    public static boolean[][] field522;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "[[[B")
    public byte[][][] field516;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBII)I")
    public static final int method195(int arg0, byte arg1, int arg2, int arg3) {
        field531++;
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        if (arg1 >= -41) {
            field522 = null;
        }
        return (arg3 >> 2 << 10) + (arg2 >> 1) + (arg0 >> 5 << 7);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V")
    public static final void method196(boolean arg0, int arg1) {
        for (int var2 = 0; var2 < class160.field2869; var2++) {
            class37 var3 = class178.field3112[class49.field877[var2]];
            long var4 = (long) class49.field877[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method204(109) && arg0 == var3.field548.field3530 && var3.field548.method1341(8937)) {
                int var6 = var3.field2077 >> 7;
                int var7 = var3.field2053 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field2060 == 1 && (var3.field2077 & 0x7F) == 64 && (var3.field2053 & 0x7F) == 64) {
                        if (class127.field2372[var6][var7] == class214.field3683) {
                            continue;
                        }
                        class127.field2372[var6][var7] = class214.field3683;
                    }
                    if (!var3.field548.field3543) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field2098 = class45.method327(var3.field2077, class196.field3401, var3.field2053, false);
                    class159.method1084(class196.field3401, var3.field2077, var3.field2053, var3.field2098, (var3.field2060 - 1) * 64 + 60, var3, var3.field2064, var4, var3.field2099);
                }
            }
        }
        if (arg1 >= -124) {
            method196(false, -2);
        }
        field534++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZZB)I")
    public static final int method197(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 != 71) {
            return 84;
        }
        field530++;
        int var3 = 0;
        if (arg0) {
            var3 += class87.field1707 + class175.field3076;
        }
        if (arg1) {
            var3 += class167.field3008 + class110.field2123;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public static void method198(int arg0) {
        field522 = null;
        field520 = null;
        field518 = null;
        if (arg0 != -19267) {
            field522 = null;
        }
    }
}
