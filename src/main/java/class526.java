import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class526 extends class232 {

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    private int field7626;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    private int field7629;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Ltu;")
    private class294 field7628;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    private int field7635;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    private int field7634;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    private int field7637;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    private int field7630;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "[Leda;")
    public static class85[] field7632 = new class85[50];

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "Lkca;")
    public static class73 field7627 = new class73(71, 2);

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
    public static int field7638 = -1;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "Lwn;")
    private class627 field7636;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBIIIIILvi;III)Z")
    public static final boolean method3095(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class468 arg7, int arg8, int arg9, int arg10) {
        field7631++;
        int var11 = arg8;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        if (arg1 >= -33) {
            method3096(17);
        }
        int var15 = arg8 - var13;
        int var16 = arg3 - var14;
        class464.field6901[var13][var14] = 99;
        class223.field3137[var13][var14] = 0;
        byte var17 = 0;
        class110.field1357[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class448.field6691[var10001] = arg3;
        int[][] var19 = arg7.field6941;
        while (var26 != var18) {
            var11 = class110.field1357[var18];
            var12 = class448.field6691[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var12 - arg7.field6943;
            int var22 = var11 - arg7.field6949;
            int var23 = var11 - var15;
            if (arg4 == -4) {
                if (arg0 == var11 && arg2 == var12) {
                    class327.field4721 = var12;
                    class52.field545 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class170.method980(arg0, 10, 1, var12, arg9, arg2, var11, arg5, 1)) {
                    class52.field545 = var11;
                    class327.field4721 = var12;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg7.method2859(var11, 1, arg5, arg10, arg2, arg0, var12, (byte) -70, arg9, 1)) {
                    class327.field4721 = var12;
                    class52.field545 = var11;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg7.method2860(arg9, var12, (byte) 52, arg5, arg2, arg0, var11, arg10, 1)) {
                    class327.field4721 = var12;
                    class52.field545 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg7.method2873(arg4, 78, arg6, arg0, arg2, var12, var11, 1)) {
                    class327.field4721 = var12;
                    class52.field545 = var11;
                    return true;
                }
            } else if (arg7.method2872(arg0, (byte) -23, var12, var11, arg4, 1, arg2, arg6)) {
                class52.field545 = var11;
                class327.field4721 = var12;
                return true;
            }
            int var25 = class223.field3137[var23][var20] + 1;
            if (var23 > 0 && class464.field6901[var23 - 1][var20] == 0 && (var19[var22 - 1][var21] & 0x42240000) == 0) {
                class110.field1357[var26] = var11 - 1;
                class448.field6691[var26] = var12;
                class464.field6901[var23 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class223.field3137[var23 - 1][var20] = var25;
            }
            if (var23 < 127 && class464.field6901[var23 + 1][var20] == 0 && (var19[var22 + 1][var21] & 0x60240000) == 0) {
                class110.field1357[var26] = var11 + 1;
                class448.field6691[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class464.field6901[var23 + 1][var20] = 8;
                class223.field3137[var23 + 1][var20] = var25;
            }
            if (var20 > 0 && class464.field6901[var23][var20 - 1] == 0 && (var19[var22][var21 - 1] & 0x40A40000) == 0) {
                class110.field1357[var26] = var11;
                class448.field6691[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class464.field6901[var23][var20 - 1] = 1;
                class223.field3137[var23][var20 - 1] = var25;
            }
            if (var20 < 127 && class464.field6901[var23][var20 + 1] == 0 && (var19[var22][var21 + 1] & 0x48240000) == 0) {
                class110.field1357[var26] = var11;
                class448.field6691[var26] = var12 + 1;
                class464.field6901[var23][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class223.field3137[var23][var20 + 1] = var25;
            }
            if (var23 > 0 && var20 > 0 && class464.field6901[var23 - 1][var20 - 1] == 0 && (var19[var22 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var21] & 0x42240000) == 0 && (var19[var22][var21 - 1] & 0x40A40000) == 0) {
                class110.field1357[var26] = var11 - 1;
                class448.field6691[var26] = var12 - 1;
                class464.field6901[var23 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class223.field3137[var23 - 1][var20 - 1] = var25;
            }
            if (var23 < 127 && var20 > 0 && class464.field6901[var23 + 1][var20 - 1] == 0 && (var19[var22 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var21] & 0x60240000) == 0 && (var19[var22][var21 - 1] & 0x40A40000) == 0) {
                class110.field1357[var26] = var11 + 1;
                class448.field6691[var26] = var12 - 1;
                class464.field6901[var23 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class223.field3137[var23 + 1][var20 - 1] = var25;
            }
            if (var23 > 0 && var20 < 127 && class464.field6901[var23 - 1][var20 + 1] == 0 && (var19[var22 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var21] & 0x42240000) == 0 && (var19[var22][var21 + 1] & 0x48240000) == 0) {
                class110.field1357[var26] = var11 - 1;
                class448.field6691[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class464.field6901[var23 - 1][var20 + 1] = 6;
                class223.field3137[var23 - 1][var20 + 1] = var25;
            }
            if (var23 < 127 && var20 < 127 && class464.field6901[var23 + 1][var20 + 1] == 0 && (var19[var22 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var21] & 0x60240000) == 0 && (var19[var22][var21 + 1] & 0x48240000) == 0) {
                class110.field1357[var26] = var11 + 1;
                class448.field6691[var26] = var12 + 1;
                class464.field6901[var23 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class223.field3137[var23 + 1][var20 + 1] = var25;
            }
        }
        class52.field545 = var11;
        class327.field4721 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
    public static void method3096(int arg0) {
        if (arg0 != -5781) {
            method3095(-6, (byte) -50, 15, 12, 5, -7, 119, null, 121, 33, 56);
        }
        field7627 = null;
        field7632 = null;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Ltu;IIIIII)V")
    public class526(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7626 = arg1;
        this.field7629 = arg4;
        this.field7628 = arg0;
        this.field7635 = arg2;
        this.field7634 = arg6;
        this.field7637 = arg5;
        this.field7630 = arg3;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)Lwn;")
    public final class627 method1491(int arg0) {
        field7633++;
        if (arg0 > -69) {
            field7627 = null;
        }
        if (this.field7636 == null) {
            class462 var2 = this.field7628.field8852;
            class461.field6878[2] = this.field7630;
            class461.field6878[0] = this.field7626;
            class461.field6878[4] = this.field7637;
            class461.field6878[3] = this.field7629;
            class461.field6878[5] = this.field7634;
            class461.field6878[1] = this.field7635;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method436(class461.field6878[var5], -5686)) {
                    return null;
                }
                class614 var7 = var2.method438(94, class461.field6878[var5]);
                int var8 = var7.field8944 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field8940 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class201.field2691[var6] = var2.method432(var4, 1.0F, class461.field6878[var6], var4, -18170, false);
            }
            this.field7636 = this.field7628.method1537(var3, var4, class201.field2691, false);
        }
        return this.field7636;
    }
}
