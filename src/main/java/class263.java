import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class263 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public int field4171 = 0;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
    public int[] field4176 = new int[257];

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
    public int[] field4178 = new int[16];

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public int field4169 = 0;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "[[I")
    public int[][] field4189 = new int[6][258];

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "[B")
    public byte[] field4180 = new byte[4096];

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[[B")
    public byte[][] field4187 = new byte[6][258];

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "[Z")
    public boolean[] field4194 = new boolean[16];

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[[I")
    public int[][] field4173 = new int[6][258];

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "[B")
    public byte[] field4181 = new byte[18002];

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "[B")
    public byte[] field4199 = new byte[18002];

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[I")
    public int[] field4174 = new int[6];

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "[B")
    public byte[] field4202 = new byte[256];

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "[[I")
    public int[][] field4192 = new int[6][258];

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "[Z")
    public boolean[] field4205 = new boolean[256];

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
    public int[] field4190 = new int[256];

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4186 = 10;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field4193 = 0;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lvj;")
    public static class115 field4188 = new class115();

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4207 = "";

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "B")
    public byte field4191;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public int field4168;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field4182;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public int field4197;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public int field4200;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public int field4201;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[B")
    public byte[] field4184;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "[B")
    public byte[] field4198;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lml;)V")
    public static final void method1787(class289 arg0) {
        for (int var1 = arg0.field4567; var1 <= arg0.field4573; var1++) {
            for (int var2 = arg0.field4575; var2 <= arg0.field4571; var2++) {
                class134 var3 = class288.field4563[arg0.field4569][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2151; var4++) {
                        if (var3.field2153[var4] == arg0) {
                            var3.field2151--;
                            for (int var5 = var4; var5 < var3.field2151; var5++) {
                                var3.field2153[var5] = var3.field2153[var5 + 1];
                                var3.field2146[var5] = var3.field2146[var5 + 1];
                            }
                            var3.field2153[var3.field2151] = null;
                            break;
                        }
                    }
                    var3.field2145 = 0;
                    for (int var6 = 0; var6 < var3.field2151; var6++) {
                        var3.field2145 |= var3.field2146[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V")
    public static final void method1788(int arg0, byte arg1) {
        if ((class167.field2655.field3389 - ((class167.field2655.method278(0) - 1) * 64) >> 7) == class76.field1228 && (class167.field2655.field3341 - (class167.field2655.method278(0) - 1) * 64 >> 7) == class235.field3837) {
            class76.field1228 = 0;
        }
        int var2 = class155.field2514;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class33 var21;
            if (arg0 == 0) {
                var21 = class167.field2655;
            } else {
                var21 = class35.field548[class57.field973[var3]];
            }
            if (var21 != null && var21.method118((byte) 125)) {
                int var22 = var21.method278(0);
                if (arg0 == 0 || arg0 == var22) {
                    if (var22 == 1) {
                        if ((var21.field3389 & 0x7F) == 64 && (var21.field3341 & 0x7F) == 64) {
                            int var23 = var21.field3389 >> 7;
                            int var24 = var21.field3341 >> 7;
                            if (var23 >= 0 && var23 < 104 && var24 >= 0 && var24 < 104) {
                                var10002 = class105.field1682[var23][var24]++;
                            }
                        }
                    } else if (((var22 & 0x1) != 0 || (var21.field3389 & 0x7F) == 0 && (var21.field3341 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field3389 & 0x7F) == 64 && (var21.field3341 & 0x7F) == 64)) {
                        int var25 = var21.field3341 - (var22 * 64) >> 7;
                        int var26 = var21.field3389 - (var22 * 64) >> 7;
                        int var27 = var21.method278(0) + var26;
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        if (var26 < 0) {
                            var26 = 0;
                        }
                        int var28 = var25 + var21.method278(0);
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        if (var28 > 104) {
                            var28 = 104;
                        }
                        for (int var29 = var26; var29 < var27; var29++) {
                            for (int var30 = var25; var30 < var28; var30++) {
                                var10002 = class105.field1682[var29][var30]++;
                            }
                        }
                    }
                }
            }
        }
        int var4 = -115 % ((10 - arg1) / 52);
        field4170++;
        label218: for (int var5 = 0; var5 < var2; var5++) {
            long var6;
            class33 var8;
            if (arg0 == 0) {
                var6 = 8791798054912L;
                var8 = class167.field2655;
            } else {
                var6 = (long) class57.field973[var5] << 32;
                var8 = class35.field548[class57.field973[var5]];
            }
            if (var8 != null && var8.method118((byte) 125)) {
                int var9 = var8.method278(0);
                if (arg0 == 0 || arg0 == var9) {
                    var8.field3325 = true;
                    var8.field516 = false;
                    if ((class51.field893 && class155.field2514 > 200 || class155.field2514 > 50) && arg0 != 0 && var8.field3338 == var8.method1435(0).field3988) {
                        var8.field516 = true;
                    }
                    if (var9 == 1) {
                        if ((var8.field3389 & 0x7F) == 64 && (var8.field3341 & 0x7F) == 64) {
                            int var10 = var8.field3389 >> 7;
                            int var11 = var8.field3341 >> 7;
                            if (var10 < 0 || var10 >= 104 || var11 < 0 || var11 >= 104) {
                                continue;
                            }
                            if (class105.field1682[var10][var11] > 1) {
                                var10002 = class105.field1682[var10][var11]--;
                                continue;
                            }
                        }
                    } else if ((var9 & 0x1) == 0 && (var8.field3389 & 0x7F) == 0 && (var8.field3341 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var8.field3389 & 0x7F) == 64 && (var8.field3341 & 0x7F) == 0) {
                        int var12 = var8.field3341 - (var9 * 64) >> 7;
                        int var13 = var8.field3389 - (var9 * 64) >> 7;
                        int var14 = var13 + var9;
                        if (var13 < 0) {
                            var13 = 0;
                        }
                        int var15 = var9 + var12;
                        if (var12 < 0) {
                            var12 = 0;
                        }
                        if (var14 > 104) {
                            var14 = 104;
                        }
                        if (var15 > 104) {
                            var15 = 104;
                        }
                        boolean var16 = true;
                        for (int var17 = var13; var17 < var14; var17++) {
                            for (int var20 = var12; var20 < var15; var20++) {
                                if (class105.field1682[var17][var20] <= 1) {
                                    var16 = false;
                                    break;
                                }
                            }
                        }
                        if (var16) {
                            int var18 = var13;
                            while (true) {
                                if (var14 <= var18) {
                                    continue label218;
                                }
                                for (int var19 = var12; var19 < var15; var19++) {
                                    var10002 = class105.field1682[var18][var19]--;
                                }
                                var18++;
                            }
                        }
                    }
                    if (var8.field3391 == null || var8.field3398 > class222.field3682 || var8.field3319 <= class222.field3682) {
                        var8.field3325 = false;
                        var8.field3350 = class225.method1583(var8.field3341, var8.field3389, class250.field3980, 0);
                        class270.method1824(class250.field3980, var8.field3389, var8.field3341, var8.field3350, (var9 - 1) * 64 + 60, var8, var8.field3320, var6, var8.field3396);
                    } else {
                        var8.field3325 = false;
                        var8.field516 = false;
                        var8.field3350 = class225.method1583(var8.field3341, var8.field3389, class250.field3980, 0);
                        class253.method1723(class250.field3980, var8.field3389, var8.field3341, var8.field3350, var8, var8.field3320, var6, var8.field3314, var8.field3381, var8.field3369, var8.field3393);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Ld;")
    public static final class238 method1789(int arg0) {
        field4195++;
        int var1 = class236.field3847[0] * class148.field2385[0];
        byte[] var2 = class145.field2332[0];
        if (arg0 != -22163) {
            method1788(17, (byte) -39);
        }
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class194.field3113[class202.method1393(255, var2[var4])];
        }
        class37 var5 = new class37(class27.field432, class155.field2513, class152.field2464[0], class74.field1202[0], class148.field2385[0], class236.field3847[0], var3);
        class287.method1923(arg0 + 22163);
        return var5;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z")
    public static final boolean method1790(int arg0) {
        if (arg0 != 16) {
            method1789(19);
        }
        field4172++;
        class162 var1 = class72.field1188;
        synchronized (class72.field1188) {
            if (class229.field3777 == class138.field2270) {
                return false;
            } else {
                class203.field3257 = class132.field2118[class138.field2270];
                class200.field3194 = class195.field3119[class138.field2270];
                class138.field2270 = class138.field2270 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public static void method1791(int arg0) {
        if (arg0 != -15275) {
            field4206 = 114;
        }
        field4188 = null;
        field4207 = null;
    }
}
