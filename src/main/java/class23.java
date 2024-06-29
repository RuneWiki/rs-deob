import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class23 extends class215 {

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Ltl;")
    public static class222 field335 = new class222(64);

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[Lij;")
    public static class90[] field336 = new class90[14];

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "F")
    public static float field334;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lkb;")
    public static class39 field337;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 4)
    public static void method145(int arg0) {
        field335 = null;
        field337 = null;
        field336 = null;
        if (arg0 <= 55) {
            method146(false, false, (byte) -23, 15);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZBI)V", line = 23)
    public static final void method146(boolean arg0, boolean arg1, byte arg2, int arg3) {
        int var10002;
        for (int var4 = 0; var4 < class176.field2875; var4++) {
            class196 var5 = class297.field4657[class128.field1906[var4]];
            if (var5 != null && var5.method911(-72) && var5.field3210.method818((byte) 62)) {
                int var6 = var5.method910(-1);
                if (arg0) {
                    if (!var5.field3210.field1793) {
                        continue;
                    }
                } else if (var5.field3210.field1802 != arg1 || arg3 != 0 && arg3 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field1980 & 0x7F) == 64 && (var5.field1944 & 0x7F) == 64) {
                        int var7 = var5.field1980 >> 7;
                        int var8 = var5.field1944 >> 7;
                        if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                            var10002 = class132.field2000[var7][var8]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field1980 & 0x7F) == 0 && (var5.field1944 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field1980 & 0x7F) == 64 && (var5.field1944 & 0x7F) == 64)) {
                    int var9 = var5.field1944 - (var6 * 64) >> 7;
                    int var10 = var5.field1980 - (var6 * 64) >> 7;
                    int var11 = var5.method910(-1) + var10;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    int var12 = var5.method910(-1) + var9;
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    for (int var13 = var10; var13 < var11; var13++) {
                        for (int var14 = var9; var14 < var12; var14++) {
                            var10002 = class132.field2000[var13][var14]++;
                        }
                    }
                }
            }
        }
        field333++;
        int var15 = 0;
        if (arg2 != 21) {
            method145(52);
        }
        while (var15 < class176.field2875) {
            class196 var16 = class297.field4657[class128.field1906[var15]];
            long var17 = (long) class128.field1906[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method911(arg2 ^ 0x7D) && var16.field3210.method818((byte) -81)) {
                label256: {
                    int var19 = var16.method910(-1);
                    if (arg0) {
                        if (!var16.field3210.field1793) {
                            break label256;
                        }
                    } else if (var16.field3210.field1802 != arg1 || arg3 != 0 && arg3 != var19) {
                        break label256;
                    }
                    var16.field2017 = true;
                    if (var19 == 1) {
                        if ((var16.field1980 & 0x7F) == 64 && (var16.field1944 & 0x7F) == 64) {
                            int var29 = var16.field1980 >> 7;
                            int var30 = var16.field1944 >> 7;
                            if (var29 < 0 || var29 >= 104 || var30 < 0 || var30 >= 104) {
                                break label256;
                            }
                            if (class132.field2000[var29][var30] > 1) {
                                var10002 = class132.field2000[var29][var30]--;
                                break label256;
                            }
                        }
                    } else if ((var19 & 0x1) == 0 && (var16.field1980 & 0x7F) == 0 && (var16.field1944 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field1980 & 0x7F) == 64 && (var16.field1944 & 0x7F) == 64) {
                        int var20 = var16.field1944 - (var19 * 64) >> 7;
                        int var21 = var19 + var20;
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        if (var21 > 104) {
                            var21 = 104;
                        }
                        boolean var22 = true;
                        int var23 = var16.field1980 - (var19 * 64) >> 7;
                        int var24 = var19 + var23;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        for (int var25 = var23; var25 < var24; var25++) {
                            for (int var26 = var20; var26 < var21; var26++) {
                                if (class132.field2000[var25][var26] <= 1) {
                                    var22 = false;
                                    break;
                                }
                            }
                        }
                        if (var22) {
                            int var27 = var23;
                            while (true) {
                                if (var24 <= var27) {
                                    break label256;
                                }
                                for (int var28 = var20; var28 < var21; var28++) {
                                    var10002 = class132.field2000[var27][var28]--;
                                }
                                var27++;
                            }
                        }
                    }
                    if (!var16.field3210.field1792) {
                        var17 |= Long.MIN_VALUE;
                    }
                    var16.field2017 = false;
                    var16.field1943 = class227.method1653(var16.field1980, var16.field1944, -12282, class148.field2209);
                    class290.method2033(class148.field2209, var16.field1980, var16.field1944, var16.field1943, var19 * 64 - 4, var16, var16.field2037, var17, var16.field1965);
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 270)
    public static final void method147(byte arg0) {
        class98.field1495.method1615(77);
        int var1 = -37 / ((arg0 + 48) / 51);
        field332++;
    }
}
