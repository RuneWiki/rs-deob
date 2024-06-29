import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class293 {

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Z")
    public static boolean field4652 = false;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4648 = "";

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Leh;")
    public static class137 field4647;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lpb;")
    public class264 field4650;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[[B")
    public static byte[][] field4645;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(JB[II)Ljava/lang/String;")
    public static final String method1966(long arg0, byte arg1, int[] arg2, int arg3) {
        field4644++;
        if (class262.field4238 != null) {
            String var5 = class262.field4238.method614(arg2, arg0, arg3, (byte) 71);
            if (var5 != null) {
                return var5;
            }
        }
        int var6 = -82 % ((arg1 + 67) / 47);
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method1967(int arg0) {
        field4645 = null;
        field4648 = null;
        if (arg0 == 0) {
            field4647 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILwb;I)V")
    public static final void method1968(int arg0, int arg1, int arg2, class123 arg3, int arg4) {
        if (class211.field3399 >= 3) {
            class217.method1523(arg1, arg0, 0, arg3.field1839, arg3.field1799);
        } else {
            ((class227) class155.field2491).method371(arg1, arg0, arg3.field1879, arg3.field1809, class155.field2491.field720 / 2, class155.field2491.field719 / 2, (int) class226.field3639, 256, arg3.field1839, arg3.field1799);
        }
        class103.field1386[arg2] = true;
        field4646++;
        if (arg4 != 7182) {
            method1967(-121);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Z")
    public static final boolean method1969(int arg0, int arg1) {
        field4651++;
        byte var2 = 0;
        byte var3 = 0;
        if (class173.field2747 == null) {
            if (class81.field1000 == null) {
                class173.field2747 = new class227(512, 512);
            } else {
                class173.field2747 = (class227) class81.field1000;
            }
            int[] var4 = class173.field2747.field3640;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 103 - var3; var7++) {
                int var21 = (103 - (var7 - var3)) * 512 * 4 + 24628;
                for (int var22 = var2 + 1; var22 < (104 - var2 - 1); var22++) {
                    if ((class117.field1664[arg1][var22][var7] & 0x18) == 0) {
                        class181.method1265(var4, var21, 512, arg1, var22, var7);
                    }
                    if (arg1 < 3 && (class117.field1664[arg1 + 1][var22][var7] & 0x8) != 0) {
                        class181.method1265(var4, var21, 512, arg1 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class128.field2052 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class291.method1960(class244.field4011, var2 + var8, var3 + var9);
                    if (var10 != 0L) {
                        class228 var12 = class256.method1749((int) (var10 >>> 32) & Integer.MAX_VALUE, 0);
                        int var13 = var12.field3695;
                        if (var12.field3641 != null) {
                            for (int var14 = 0; var14 < var12.field3641.length; var14++) {
                                if (var12.field3641[var14] != -1) {
                                    class228 var15 = class256.method1749(var12.field3641[var14], arg0 ^ 0x7E);
                                    if (var15.field3695 >= 0) {
                                        var13 = var15.field3695;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var2 + var8;
                            int var17 = var3 + var9;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class187.field2975[class244.field4011].field2272;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var16 > 0 && var16 > var8 - 3 && (var18[var16 - 1][var17] & 0x2C0108) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 1 && var16 < 103 && var8 + 3 > var16 && (var18[var16 + 1][var17] & 0x2C0180) == 0) {
                                        var16++;
                                    }
                                    if (var20 == 2 && var17 > 0 && var17 > (var9 - 3) && (var18[var16][var17 - 1] & 0x2C0102) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 3 && var17 < 103 && var17 < var9 + 3 && (var18[var16][var17 + 1] & 0x2C0120) == 0) {
                                        var17++;
                                    }
                                }
                            }
                            class221.field3548[class128.field2052] = var12.field3697;
                            class246.field4061[class128.field2052] = var16 - var2;
                            class179.field2849[class128.field2052] = var17 - var3;
                            class128.field2052++;
                        }
                    }
                }
            }
        }
        class173.field2747.method1614();
        int var23 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - (-((int) (Math.random() * 20.0D)) + 10);
        int var24 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class117.field1664[arg1][var26 + var2][var3 + var25] & 0x18) == 0 && !class211.method1481(var23, var26, var3, var2, arg0 ^ 0x24, var24, var25, arg1)) {
                    class52.field673.method1118(63);
                    return false;
                }
                if (arg1 < 3 && (class117.field1664[arg1 + 1][var2 + var26][var3 + var25] & 0x8) != 0 && !class211.method1481(var23, var26, var3, var2, 114, var24, var25, arg1 + 1)) {
                    class52.field673.method1118(arg0 - 63);
                    return false;
                }
            }
        }
        class81.field1000 = class173.field2747;
        if (arg0 != 126) {
            field4652 = false;
        }
        class52.field673.method1118(63);
        class173.field2747 = null;
        return true;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)I")
    public static final int method1970(int arg0, int arg1, byte arg2) {
        field4649++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 >= -98) {
            method1969(-54, 17);
        }
        return (arg1 & 0xFF80) + var3;
    }
}
