import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class30 extends class129 {

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field606 = 0;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Lrd;")
    public static class173 field610 = class133.method843("nav", -128);

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "Lrd;")
    private static class173 field615 = class133.method843("Please wait)3)3)3", 101);

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "Lrd;")
    public static class173 field613 = field615;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "[I")
    public static int[] field612 = new int[256];

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "Lrd;")
    public static class173 field618 = class133.method843("<)4col>", 107);

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Laf;")
    public static class7 field605 = new class7(100);

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "Lsa;")
    public static class180 field620;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Lci;")
    public class30 field608;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Lci;")
    public class30 field609;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "[I")
    public static int[] field622;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method232(int arg0, Component arg1) {
        field607++;
        Method var2 = class130.field2450;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class15.field343);
        arg1.addFocusListener(class15.field343);
        if (arg0 != 58) {
            field622 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIZIIIIBII)Z")
    public static final boolean method233(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        field621++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class91.field1728[var12][var36] = 0;
                class173.field3373[var12][var36] = 99999999;
            }
        }
        class91.field1728[arg8][arg2] = 99;
        int var13 = arg8;
        int var14 = arg2;
        class173.field3373[arg8][arg2] = 0;
        if (arg9 != -2) {
            return false;
        }
        byte var15 = 0;
        int var16 = 0;
        class22.field479[var15] = arg8;
        int var37 = var15 + 1;
        class189.field3684[var15] = arg2;
        boolean var17 = false;
        int var18 = class22.field479.length;
        int[][] var19 = class35.field760[class172.field3347].field3474;
        while (var37 != var16) {
            var13 = class22.field479[var16];
            var14 = class189.field3684[var16];
            var16 = (var16 + 1) % var18;
            if (arg3 == var13 && arg1 == var14) {
                var17 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class35.field760[class172.field3347].method1177(14055, arg11, var13, arg3, var14, arg6 - 1, arg1)) {
                    var17 = true;
                    break;
                }
                if (arg6 < 10 && class35.field760[class172.field3347].method1187(arg11, arg3, arg6 - 1, -67, var13, arg1, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg0 != 0 && class35.field760[class172.field3347].method1188(arg1, arg3, var13, arg0, 116, arg7, var14, arg10)) {
                var17 = true;
                break;
            }
            int var35 = class173.field3373[var13][var14] + 1;
            if (var13 > 0 && class91.field1728[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class22.field479[var37] = var13 - 1;
                class189.field3684[var37] = var14;
                var37 = (var37 + 1) % var18;
                class91.field1728[var13 - 1][var14] = 2;
                class173.field3373[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class91.field1728[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class22.field479[var37] = var13 + 1;
                class189.field3684[var37] = var14;
                class91.field1728[var13 + 1][var14] = 8;
                class173.field3373[var13 + 1][var14] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 > 0 && class91.field1728[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class22.field479[var37] = var13;
                class189.field3684[var37] = var14 - 1;
                class91.field1728[var13][var14 - 1] = 1;
                class173.field3373[var13][var14 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 < 103 && class91.field1728[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class22.field479[var37] = var13;
                class189.field3684[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class91.field1728[var13][var14 + 1] = 4;
                class173.field3373[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class91.field1728[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class22.field479[var37] = var13 - 1;
                class189.field3684[var37] = var14 - 1;
                class91.field1728[var13 - 1][var14 - 1] = 3;
                var37 = (var37 + 1) % var18;
                class173.field3373[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class91.field1728[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class22.field479[var37] = var13 + 1;
                class189.field3684[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class91.field1728[var13 + 1][var14 - 1] = 9;
                class173.field3373[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class91.field1728[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class22.field479[var37] = var13 - 1;
                class189.field3684[var37] = var14 + 1;
                class91.field1728[var13 - 1][var14 + 1] = 6;
                class173.field3373[var13 - 1][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && var14 < 103 && class91.field1728[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class22.field479[var37] = var13 + 1;
                class189.field3684[var37] = var14 + 1;
                class91.field1728[var13 + 1][var14 + 1] = 12;
                class173.field3373[var13 + 1][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
        }
        class129.field2445 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg3 - var21; var23 <= arg3 + var21; var23++) {
                for (int var24 = arg1 - var21; var24 <= arg1 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class173.field3373[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg3) {
                            var25 = arg3 - var23;
                        } else if (var23 > arg3 + arg10 - 1) {
                            var25 = var23 + 1 - arg3 - arg10;
                        }
                        int var26 = 0;
                        if (arg1 > var24) {
                            var26 = arg1 - var24;
                        } else if (var24 > arg0 + arg1 - 1) {
                            var26 = var24 + 1 - arg0 - arg1;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var22 > class173.field3373[var23][var24]) {
                            var13 = var23;
                            var22 = class173.field3373[var23][var24];
                            var14 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg2 == var14) {
                return false;
            }
            class129.field2445 = 1;
        }
        byte var28 = 0;
        class22.field479[var28] = var13;
        int var38 = var28 + 1;
        class189.field3684[var28] = var14;
        int var29;
        int var30 = var29 = class91.field1728[var13][var14];
        while (arg8 != var13 || arg2 != var14) {
            if (var29 != var30) {
                class22.field479[var38] = var13;
                class189.field3684[var38++] = var14;
                var29 = var30;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class91.field1728[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class189.field3684[var38];
            int var33 = class22.field479[var38];
            if (arg5 == 0) {
                class165.field3175.method1023(248, -21822);
                class165.field3175.method752(var31 + var31 + 3, (byte) -128);
                class158.field2964++;
            }
            if (arg5 == 1) {
                class165.field3175.method1023(165, -21822);
                class165.field3175.method752(var31 + var31 + 17, (byte) -128);
                class214.field4150++;
            }
            if (arg5 == 2) {
                class165.field3175.method1023(207, arg9 ^ 0x553C);
                class17.field370++;
                class165.field3175.method752(var31 + var31 + 3, (byte) -128);
            }
            class165.field3175.method750(class13.field208[82] ? 1 : 0, false);
            class193.field3759 = class189.field3684[0];
            class55.field1094 = class22.field479[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class165.field3175.method752(class22.field479[var38] - var33, (byte) -128);
                class165.field3175.method752(class189.field3684[var38] - var32, (byte) -128);
            }
            class165.field3175.method762(class43.field874 + var32, true);
            class165.field3175.method762(class108.field2024 + var33, true);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
    public static void method234(int arg0) {
        field615 = null;
        field618 = null;
        field605 = null;
        field620 = null;
        if (arg0 == 59) {
            field610 = null;
            field613 = null;
            field612 = null;
            field622 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public static final void method235(int arg0) {
        if (class130.field2456.toLowerCase().indexOf("microsoft") == -1) {
            class121.field2256[46] = 72;
            class121.field2256[59] = 57;
            class121.field2256[92] = 74;
            class121.field2256[91] = 42;
            class121.field2256[44] = 71;
            class121.field2256[61] = 27;
            class121.field2256[93] = 43;
            class121.field2256[45] = 26;
            class121.field2256[47] = 73;
            if (class130.field2450 == null) {
                class121.field2256[192] = 58;
                class121.field2256[222] = 59;
            } else {
                class121.field2256[520] = 59;
                class121.field2256[192] = 28;
                class121.field2256[222] = 58;
            }
        } else {
            class121.field2256[221] = 43;
            class121.field2256[223] = 28;
            class121.field2256[190] = 72;
            class121.field2256[187] = 27;
            class121.field2256[192] = 58;
            class121.field2256[220] = 74;
            class121.field2256[222] = 59;
            class121.field2256[186] = 57;
            class121.field2256[191] = 73;
            class121.field2256[219] = 42;
            class121.field2256[189] = 26;
            class121.field2256[188] = 71;
        }
        field604++;
        if (arg0 != 190) {
            method232(76, null);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
    public final void method236(byte arg0) {
        field617++;
        if (this.field609 == null) {
            return;
        }
        this.field609.field608 = this.field608;
        if (arg0 != 120) {
            field606 = -93;
        }
        this.field608.field609 = this.field609;
        this.field609 = null;
        this.field608 = null;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V")
    public static final void method237(byte arg0) {
        field616++;
        class217.field4198 = null;
        int var1 = 34 % ((36 - arg0) / 55);
        class158.field2962 = null;
        class194.field3771 = null;
        class23.field502 = null;
        class140.field2602 = null;
        class79.field1570 = null;
        class171.field3311 = null;
        class57.field1125 = null;
        class45.field938 = null;
        class126.field2384 = null;
        class208.field4054 = null;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(B)V")
    public static final void method238(byte arg0) {
        class195.field3786 = 0;
        field611++;
        int var1 = (class175.field3447.field2820 >> 7) + class108.field2024;
        if (arg0 <= 53) {
            field610 = null;
        }
        int var2 = (class175.field3447.field2801 >> 7) + class43.field874;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class195.field3786 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class195.field3786 = 1;
        }
        if (class195.field3786 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class195.field3786 = 0;
        }
    }
}
