import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class337 {

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "B")
    public byte field5065 = 0;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "S")
    public short field5053;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "S")
    public short field5057;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "B")
    public byte field5064;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "B")
    public byte field5051;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "J")
    public static long field5043 = 0L;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "B")
    public byte field5048;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "B")
    public byte field5049;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "B")
    public byte field5056;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "B")
    public byte field5059;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lmp;")
    public class100 field5044;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lmp;")
    public class100 field5047;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lfc;")
    public static class239 field5042;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lim;")
    public class268 field5046;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Lgo;")
    public class287 field5050;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "Lgo;")
    public class287 field5058;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Lke;")
    public class337 field5062;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lkl;")
    public static class360 field5038;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lt;")
    public class367 field5055;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Ljc;")
    public class448 field5054;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "Lpq;")
    public class47 field5063;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "S")
    public short field5052;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Z")
    public boolean field5045;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Z")
    public boolean field5060;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Z")
    public boolean field5061;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIILtf;IIIIII)Z", line = 4)
    public static final boolean method2063(int arg0, int arg1, int arg2, int arg3, class491 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5041++;
        int var11 = arg0;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        class401.field5859[var13][var14] = 99;
        int var16 = arg7 - var14;
        class309.field4648[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class398.field5832[var17] = arg0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class40.field562[var10001] = arg7;
        int[][] var19 = arg4.field6890;
        if (arg1 != -1) {
            field5042 = null;
        }
        while (var26 != var18) {
            var11 = class398.field5832[var18];
            var12 = class40.field562[var18];
            int var20 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - arg4.field6898;
            int var23 = var12 - arg4.field6904;
            if (arg3 == -4) {
                if (arg8 == var11 && arg2 == var12) {
                    class270.field4001 = var11;
                    class379.field5639 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class146.method992(arg10, 2, arg8, 2, var11, var12, arg2, arg6, false)) {
                    class270.field4001 = var11;
                    class379.field5639 = var12;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg4.method2876(arg6, 2, var11, 2, var12, arg2, (byte) -38, arg5, arg10, arg8)) {
                    class270.field4001 = var11;
                    class379.field5639 = var12;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg4.method2874(arg6, arg5, arg10, arg8, var11, arg2, var12, 2, -25971)) {
                    class270.field4001 = var11;
                    class379.field5639 = var12;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg4.method2866(arg8, arg2, arg3, arg9, var12, 2883848, var11, 2)) {
                    class379.field5639 = var12;
                    class270.field4001 = var11;
                    return true;
                }
            } else if (arg4.method2861(arg8, arg1 ^ 0xFFFF9A5A, 2, arg3, var12, arg2, var11, arg9)) {
                class379.field5639 = var12;
                class270.field4001 = var11;
                return true;
            }
            int var25 = class309.field4648[var20][var21] + 1;
            if (var20 > 0 && class401.field5859[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class398.field5832[var26] = var11 - 1;
                class40.field562[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class401.field5859[var20 - 1][var21] = 2;
                class309.field4648[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class401.field5859[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class398.field5832[var26] = var11 + 1;
                class40.field562[var26] = var12;
                class401.field5859[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class309.field4648[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class401.field5859[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class398.field5832[var26] = var11;
                class40.field562[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class401.field5859[var20][var21 - 1] = 1;
                class309.field4648[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class401.field5859[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class398.field5832[var26] = var11;
                class40.field562[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class401.field5859[var20][var21 + 1] = 4;
                class309.field4648[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class401.field5859[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class398.field5832[var26] = var11 - 1;
                class40.field562[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class401.field5859[var20 - 1][var21 - 1] = 3;
                class309.field4648[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class401.field5859[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class398.field5832[var26] = var11 + 1;
                class40.field562[var26] = var12 - 1;
                class401.field5859[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class309.field4648[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class401.field5859[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class398.field5832[var26] = var11 - 1;
                class40.field562[var26] = var12 + 1;
                class401.field5859[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class309.field4648[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class401.field5859[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class398.field5832[var26] = var11 + 1;
                class40.field562[var26] = var12 + 1;
                class401.field5859[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class309.field4648[var20 + 1][var21 + 1] = var25;
            }
        }
        class270.field4001 = var11;
        class379.field5639 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 359)
    public final void method2064(int arg0) {
        if (arg0 != -5068) {
            this.field5052 = -78;
        }
        while (this.field5054 != null) {
            class448 var2 = this.field5054.field6340;
            this.field5054.method2647(false);
            this.field5054 = var2;
        }
        field5040++;
        this.field5065 = 0;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 379)
    public static void method2065(int arg0) {
        field5038 = null;
        if (arg0 != 1055) {
            field5042 = null;
        }
        field5042 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(III)V", line = 399)
    public class337(int arg0, int arg1, int arg2) {
        this.field5053 = (short) arg1;
        this.field5057 = (short) arg2;
        this.field5051 = this.field5064 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 426)
    public static final void method2066(int arg0) {
        field5037++;
        for (class425 var1 = (class425) class467.field6578.method2456(32101); var1 != null; var1 = (class425) class467.field6578.method2461(301)) {
            class200 var2 = var1.field6078;
            if (var2.field3023) {
                var1.method283(2);
                var2.method1353(0);
            } else if (class452.field6418 >= var2.field3014) {
                var2.method1358(class269.field3987, (byte) 78);
                if (var2.field3023) {
                    var1.method283(arg0 ^ 0x3);
                } else {
                    class204.method1394(var2, true);
                }
            }
        }
        if (arg0 != 1) {
            field5038 = null;
        }
    }
}
