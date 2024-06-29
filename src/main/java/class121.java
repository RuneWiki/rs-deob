import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 extends class5 {

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Lhe;")
    public static class54 field2806 = class6.method58("T", false);

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "Lhe;")
    public static class54 field2810 = class6.method58("Keine Antwort vom Anmelde)2Server)3", false);

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field2812 = 1;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Lrc;")
    public class121 field2809;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "Lrc;")
    public class121 field2813;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "Lm;")
    public static class83 field2817;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public static void method932(boolean arg0) {
        field2817 = null;
        if (arg0) {
            field2806 = null;
            field2810 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZZIZ)Leb;")
    public static final class31 method933(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        field2802++;
        if (arg0 != 1) {
            return null;
        }
        class17 var5 = null;
        if (class95.field2414 != null) {
            var5 = new class17(arg3, class95.field2414, class49.field1174[arg3], 1000000);
        }
        return new class31(var5, class18.field523, arg3, arg4, arg1, arg2);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method934(int arg0) {
        field2815++;
        if (arg0 != 14931) {
            return;
        }
        for (int var1 = 0; var1 < class158.field3598; var1++) {
            int var2 = class58.field1480[var1];
            class120 var3 = class111.field2679[var2];
            if (var3 != null) {
                client.method177(var3.field2788.field252, 4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIZIIIII)Z")
    public static final boolean method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2804++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class16.field472[var12][var36] = 0;
                class15.field454[var12][var36] = 99999999;
            }
        }
        class16.field472[arg11][arg1] = 99;
        class15.field454[arg11][arg1] = 0;
        int var13 = arg11;
        int var14 = arg1;
        byte var15 = 0;
        class91.field2224[var15] = arg11;
        int var37 = var15 + 1;
        class62.field1514[var15] = arg1;
        int var16 = arg9;
        boolean var17 = false;
        int var18 = class91.field2224.length;
        int[][] var19 = class111.field2652[class157.field3573].field117;
        while (var37 != var16) {
            var14 = class62.field1514[var16];
            var13 = class91.field2224[var16];
            var16 = (var16 + 1) % var18;
            if (arg3 == var13 && arg2 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class111.field2652[class157.field3573].method40(arg2, (byte) 105, arg5 - 1, arg3, var13, arg8, var14)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && class111.field2652[class157.field3573].method26(arg2, arg9 - 97, arg5 + -1, arg3, var14, arg8, var13)) {
                    var17 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg0 != 0 && class111.field2652[class157.field3573].method27(arg0, var14, arg4, var13, arg3, true, arg2, arg10)) {
                var17 = true;
                break;
            }
            int var35 = class15.field454[var13][var14] + 1;
            if (var13 > 0 && class16.field472[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class91.field2224[var37] = var13 - 1;
                class62.field1514[var37] = var14;
                class16.field472[var13 - 1][var14] = 2;
                var37 = (var37 + 1) % var18;
                class15.field454[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class16.field472[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class91.field2224[var37] = var13 + 1;
                class62.field1514[var37] = var14;
                var37 = (var37 + 1) % var18;
                class16.field472[var13 + 1][var14] = 8;
                class15.field454[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class16.field472[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class91.field2224[var37] = var13;
                class62.field1514[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class16.field472[var13][var14 - 1] = 1;
                class15.field454[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class16.field472[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class91.field2224[var37] = var13;
                class62.field1514[var37] = var14 + 1;
                class16.field472[var13][var14 + 1] = 4;
                class15.field454[var13][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var14 > 0 && class16.field472[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class91.field2224[var37] = var13 - 1;
                class62.field1514[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class16.field472[var13 - 1][var14 - 1] = 3;
                class15.field454[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class16.field472[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class91.field2224[var37] = var13 + 1;
                class62.field1514[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class16.field472[var13 + 1][var14 - 1] = 9;
                class15.field454[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class16.field472[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class91.field2224[var37] = var13 - 1;
                class62.field1514[var37] = var14 + 1;
                class16.field472[var13 - 1][var14 + 1] = 6;
                class15.field454[var13 - 1][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && var14 < 103 && class16.field472[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class91.field2224[var37] = var13 + 1;
                class62.field1514[var37] = var14 + 1;
                class16.field472[var13 + 1][var14 + 1] = 12;
                class15.field454[var13 + 1][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
        }
        class9.field277 = 0;
        if (!var17) {
            if (!arg6) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg3 - var22; var23 <= arg3 + var22; var23++) {
                for (int var24 = arg2 - var22; var24 <= arg2 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class15.field454[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg3 > var23) {
                            var25 = arg3 - var23;
                        } else if (arg3 + arg4 - 1 < var23) {
                            var25 = var23 + 1 - arg4 - arg3;
                        }
                        if (var24 < arg2) {
                            var26 = arg2 - var24;
                        } else if (var24 > arg2 + arg0 - 1) {
                            var26 = var24 + 1 - arg2 - arg0;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var21 || var21 == var27 && var20 > class15.field454[var23][var24]) {
                            var14 = var24;
                            var20 = class15.field454[var23][var24];
                            var13 = var23;
                            var21 = var27;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg11 == var13 && arg1 == var14) {
                return false;
            }
            class9.field277 = 1;
        }
        byte var28 = 0;
        class91.field2224[var28] = var13;
        int var38 = var28 + 1;
        class62.field1514[var28] = var14;
        int var29;
        int var30 = var29 = class16.field472[var13][var14];
        while (arg11 != var13 || arg1 != var14) {
            if (var29 != var30) {
                class91.field2224[var38] = var13;
                class62.field1514[var38++] = var14;
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
            var30 = class16.field472[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38--;
            int var32 = class91.field2224[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            int var33 = class62.field1514[var38];
            if (arg7 == 0) {
                class141.field3208++;
                class131.field2969.method454(50, -88);
                class131.field2969.method649((byte) -27, var31 + var31 + 3);
            }
            if (arg7 == 1) {
                class18.field529++;
                class131.field2969.method454(143, -25);
                class131.field2969.method649((byte) -27, var31 + var31 + 3 + 14);
            }
            if (arg7 == 2) {
                class131.field2969.method454(36, 117);
                class131.field2969.method649((byte) -27, var31 + var31 + 3);
                class89.field2201++;
            }
            class131.field2969.method632(class114.field2707[82] ? 1 : 0, 128);
            class131.field2969.method646(13421, var33 + class67.field1648);
            class131.field2969.method640(112, var32 + class11.field323);
            class134.field3035 = class62.field1514[0];
            class1.field15 = class91.field2224[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class131.field2969.method632(class91.field2224[var38] - var32, arg9 ^ 0x80);
                class131.field2969.method632(class62.field1514[var38] - var33, 128);
            }
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public final void method936(int arg0) {
        field2808++;
        if (this.field2809 != null && arg0 == -1) {
            this.field2809.field2813 = this.field2813;
            this.field2813.field2809 = this.field2809;
            this.field2809 = null;
            this.field2813 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILef;)Lqb;")
    public static final class113 method937(int arg0, int arg1, int arg2, class35 arg3) {
        field2805++;
        if (class107.method814(-30384, arg0, arg1, arg3)) {
            return arg2 == -1 ? class38.method290((byte) -59) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)Lnc;")
    public static final class93 method938(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        int var2 = arg1 >> 16;
        field2816++;
        int var3 = arg1 & 0xFFFF;
        if (class59.field1481[var2] == null || class59.field1481[var2][var3] == null) {
            boolean var4 = class86.method691((byte) 116, var2);
            if (!var4) {
                return null;
            }
        }
        return class59.field1481[var2][var3];
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lqb;IIBII)V")
    public static final void method939(class113 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2814++;
        int var6 = arg5 * arg5 + arg2 * arg2;
        int var7 = 44 / ((60 - arg3) / 36);
        if (var6 <= 4225 || var6 >= 90000) {
            class75.method575(arg5, arg2, (byte) 118, arg0, arg1, arg4);
            return;
        }
        int var8 = class91.field2220 + class63.field1533 & 0x7FF;
        int var9 = class152.field3416[var8];
        int var10 = var9 * 256 / (class40.field1050 + 256);
        int var11 = class152.field3420[var8];
        int var12 = var11 * 256 / (class40.field1050 + 256);
        int var13 = arg2 * var12 - arg5 * var10 >> 16;
        int var14 = arg2 * var10 + arg5 * var12 >> 16;
        double var15 = Math.atan2((double) var14, (double) var13);
        int var17 = (int) (Math.sin(var15) * 63.0D);
        int var18 = (int) (Math.cos(var15) * 57.0D);
        class132.field2983.method850(var17 + arg4 + 94 - 6, -var18 + -20 + 83 + arg1, 20, 20, 15, 15, var15, 256);
    }
}
