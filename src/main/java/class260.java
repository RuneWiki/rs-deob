import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class260 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4133 = 0;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4131 = "Loading textures - ";

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Z")
    public static boolean field4138 = false;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Leg;")
    public static class272 field4132 = new class272(32);

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "[Lfi;")
    public static class235[] field4141 = new class235[2048];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZCI)I")
    public static final int method1702(boolean arg0, char arg1, int arg2) {
        field4137++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return arg0 ? 14 : var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lhi;B)V")
    public static final void method1703(class264 arg0, byte arg1) {
        field4129++;
        int var2 = class136.field2264 >> 1;
        int var3 = class284.field4534 >> 2 << 10;
        if (arg1 > -51) {
            return;
        }
        byte[][] var4 = new byte[class183.field2927][class225.field3569];
        while (arg0.field4198.length > arg0.field4195) {
            int var33 = 0;
            int var34 = 0;
            boolean var35 = false;
            if (arg0.method1779(-75) == 1) {
                var35 = true;
                var33 = arg0.method1779(-120);
                var34 = arg0.method1779(-102);
            }
            int var36 = arg0.method1779(-68);
            int var37 = arg0.method1779(-107);
            int var38 = class73.field1002 + class225.field3569 - (var37 * 64) - 1;
            int var39 = var36 * 64 - class129.field2149;
            if (var39 >= 0 && var38 - 63 >= 0 && class183.field2927 > (var39 + 63) && class225.field3569 > var38) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var35 || var40 >= var33 * 8 && var40 < (var33 * 8 + 8) && var42 >= (var34 * 8) && var42 < var34 * 8 + 8) {
                            var41[var38 - var42] = arg0.method1767(16711680);
                        }
                    }
                }
            } else if (var35) {
                arg0.field4195 += 64;
            } else {
                arg0.field4195 += 4096;
            }
        }
        int var5 = class225.field3569;
        int[] var6 = new int[var5];
        int var7 = class183.field2927;
        int[] var8 = new int[var5];
        int[] var9 = new int[var5];
        int[] var10 = new int[var5];
        int[] var11 = new int[var5];
        for (int var12 = -5; var12 < var7; var12++) {
            for (int var13 = 0; var13 < var5; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var7) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class120 var29 = class248.method1641(var28 - 1, (byte) -104);
                        var6[var13] += var29.field2033;
                        var8[var13] += var29.field2028;
                        var9[var13] += var29.field2030;
                        var11[var13] += var29.field2017;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class120 var32 = class248.method1641(var31 - 1, (byte) -71);
                        var6[var13] -= var32.field2033;
                        var8[var13] -= var32.field2028;
                        var9[var13] -= var32.field2030;
                        var11[var13] -= var32.field2017;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class96.field1453[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var5; var20++) {
                    int var21 = var20 + 5;
                    int var22 = var20 - 5;
                    if (var5 > var21) {
                        var18 += var11[var21];
                        var16 += var9[var21];
                        var15 += var6[var21];
                        var17 += var8[var21];
                        var19 += var10[var21];
                    }
                    if (var22 >= 0) {
                        var16 -= var9[var22];
                        var19 -= var10[var22];
                        var18 -= var11[var22];
                        var15 -= var6[var22];
                        var17 -= var8[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class173.method1206(var16 / var19, var17 / var19, var15 * 256 / var18, 119);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var2;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var3 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[(class204.method1369(var20, 63) << 6) + class204.method1369(63, var12)] = class145.field2347[class198.method1338(96, -3, var26)];
                        } else if (var23 != null) {
                            var23[class204.method1369(63, var12) + (class204.method1369(var20, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILjj;I)Lwe;")
    public static final class43 method1704(int arg0, int arg1, class134 arg2, int arg3) {
        field4134++;
        if (arg0 == -104) {
            return class227.method1499((byte) 126, arg2, arg1, arg3) ? class174.method1207(arg0 ^ 0xFFFFFF67) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method1705(int arg0) {
        field4130++;
        class215.field3461.method458(32);
        class1.field8.method1631((byte) -119);
        if (arg0 > 85) {
            class7.field83.method1631((byte) -115);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLca;)Lca;")
    public abstract class86 method1247(byte arg0, class86 arg1);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([Lpi;[BZIIIIIIII)V")
    public static final void method1706(class281[] arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 != -104) {
            return;
        }
        field4142++;
        class264 var11 = new class264(arg1);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1753((byte) -69);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method1729(false);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var11.method1779(arg5 + 24);
                int var18 = var17 >> 2;
                int var19 = var14 >> 12;
                int var20 = var17 & 0x3;
                int var21 = var14 >> 6 & 0x3F;
                if (arg8 == var19 && arg6 <= var21 && var21 < arg6 + 8 && arg3 <= var16 && var16 < (arg3 + 8)) {
                    class94 var22 = class119.method842(arg5 + 115, var12);
                    int var23 = arg7 + class198.method1337(var22.field1340, var22.field1334, arg4, var21 & 0x7, arg5 - 23155, var20, var16 & 0x7);
                    int var24 = arg10 + class247.method1628(var21 & 0x7, var22.field1334, 122, var20, var22.field1340, arg4, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class281 var25 = null;
                        if (!arg2) {
                            int var26 = arg9;
                            if ((class134.field2251[1][var23][var24] & 0x2) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg0[var26];
                            }
                        }
                        class150.method1021(arg2, arg9, arg4 + var20 & 0x3, var24, !arg2, var23, 86, arg9, var12, var18, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILcb;ILjava/awt/Component;)Lic;")
    public static final class104 method1707(int arg0, int arg1, class255 arg2, int arg3, Component arg4) {
        field4143++;
        if (class29.field343 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class104 var5 = (class104) Class.forName("ta").getDeclaredConstructor().newInstance();
                var5.field1757 = arg0;
                var5.field1731 = new int[(class278.field4456 ? 2 : 1) * 256];
                var5.method414(arg4);
                var5.field1764 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field1764 > 16384) {
                    var5.field1764 = 16384;
                }
                var5.method412(var5.field1764);
                if (class77.field1045 > 0 && class178.field2894 == null) {
                    class178.field2894 = new class148();
                    class178.field2894.field2386 = arg2;
                    arg2.method1679(class178.field2894, arg1 ^ 0x2696, class77.field1045);
                }
                if (class178.field2894 != null) {
                    if (class178.field2894.field2383[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class178.field2894.field2383[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class53 var6 = new class53(arg2, arg3);
                    var6.field1757 = arg0;
                    var6.field1731 = new int[(class278.field4456 ? 2 : 1) * 256];
                    var6.method414(arg4);
                    var6.field1764 = 16384;
                    var6.method412(var6.field1764);
                    if (class77.field1045 > 0 && class178.field2894 == null) {
                        class178.field2894 = new class148();
                        class178.field2894.field2386 = arg2;
                        arg2.method1679(class178.field2894, -4, class77.field1045);
                    }
                    if (class178.field2894 != null) {
                        if (class178.field2894.field2383[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class178.field2894.field2383[arg3] = var6;
                    }
                    return arg1 == 9939 ? var6 : null;
                } catch (Throwable var7) {
                    return new class104();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V")
    public static final void method1708(boolean arg0, int arg1) {
        class242.method1595(class97.field1469, arg0, 113, class113.field1944, class107.field1856);
        if (arg1 > 47) {
            field4139++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BC)Z")
    public static final boolean method1709(byte arg0, char arg1) {
        field4136++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class208.field3402;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return arg0 > -40 ? false : false;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static final void method1710(byte arg0) {
        class286.method1916(arg0 + 114);
        field4140++;
        class72.method556((byte) -121);
        class29.method202(110);
        if (arg0 != 13) {
            return;
        }
        class94.method663(arg0 ^ 0x5B);
        class1.method5(arg0 ^ 0x41);
        class175.method1212(false);
        class254.method1664((byte) -117);
        class130.method903((byte) -103);
        class21.method139(-124);
        class1.method3(arg0 ^ 0xC);
        class259.method1698(arg0 ^ 0xFFFFFFAD);
        class143.method970((byte) -119);
        class16.method117((byte) 51);
        class259.method1701(false);
        class249.method1645(false);
        class233.method1537(100);
        class61.method464((byte) -120);
        class186.method1277(-122);
        if (class284.field4546 != 0) {
            for (int var1 = 0; var1 < class234.field3727.length; var1++) {
                class234.field3727[var1] = null;
            }
            class289.field4624 = 0;
        }
        class177.method1225((byte) 42);
        class240.method1585(arg0 ^ 0xFFFFFFF2);
        class272.field4398.method1834(0);
        ((class185) class145.field2350).method1265(255);
        class161.field2620.method1577(0);
        class104.field1751.method925(-5528);
        class115.field1964.method925(-5528);
        class3.field39.method925(-5528);
        class251.field4021.method925(arg0 - 5541);
        class250.field4004.method925(arg0 ^ 0xFFFFEA65);
        class198.field3188.method925(arg0 ^ 0xFFFFEA65);
        class46.field557.method925(-5528);
        class169.field2739.method925(-5528);
        class246.field3948.method925(arg0 - 5541);
        class263.field4169.method925(-5528);
        class223.field3543.method925(arg0 ^ 0xFFFFEA65);
        class83.field1150.method1834(0);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method1711(int arg0) {
        field4141 = null;
        if (arg0 != -29591) {
            field4133 = -121;
        }
        field4132 = null;
        field4131 = null;
    }
}
