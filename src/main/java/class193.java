import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class193 extends class112 {

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    public static int field3159 = 1;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "Lsb;")
    public static class124 field3161;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "Ljava/lang/String;")
    public String field3165;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "[I")
    public static int[] field3155;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "[I")
    public int[] field3158;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "[I")
    public int[] field3166;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "[Lmj;")
    public class144[] field3163;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "[Lkd;")
    public static class228[] field3164;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field3160;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lmk;IIII)V")
    public static final void method1322(class213 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3162++;
        if (class48.field878 == arg0 || class42.field776 >= 400) {
            return;
        }
        String var11;
        if (arg0.field3401 == 0) {
            boolean var5 = true;
            if (class48.field878.field3403 != -1 && arg0.field3403 != -1) {
                int var6 = arg0.field3403 <= class48.field878.field3403 ? arg0.field3403 : class48.field878.field3403;
                int var7 = class48.field878.field3425 - arg0.field3425;
                if (var7 < 0) {
                    var7 = -var7;
                }
                int var8 = arg0.field3425 < class48.field878.field3425 ? class48.field878.field3425 : arg0.field3425;
                int var9 = var6 + (var8 * 10 / 100) + 5;
                if (var9 < var7) {
                    var5 = false;
                }
            }
            String var10 = class238.field3752 == 1 ? class19.field282 : class8.field93;
            if (arg0.field3440 <= arg0.field3425) {
                var11 = arg0.method1414((byte) -128) + (var5 ? class235.method1562(class48.field878.field3425, arg0.field3425, -4) : "<col=ffffff>") + " (" + var10 + arg0.field3425 + ")";
            } else {
                var11 = arg0.method1414((byte) 91) + (var5 ? class235.method1562(class48.field878.field3425, arg0.field3425, -4) : "<col=ffffff>") + " (" + var10 + arg0.field3425 + "+" + (arg0.field3440 - arg0.field3425) + ")";
            }
        } else {
            var11 = arg0.method1414((byte) -126) + " (" + class101.field1547 + arg0.field3401 + ")";
        }
        if (class219.field3514 == 1) {
            class107.method798((long) arg3, false, class286.field4556, (short) 59, arg1, class236.field3730 + " -> <col=ffffff>" + var11, class131.field2169, arg2);
            class61.field1035++;
        } else if (!class239.field3761) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class228.field3630[var12] != null) {
                    short var13 = 0;
                    class105.field1603++;
                    boolean var14 = false;
                    if (class238.field3752 == 0 && class228.field3630[var12].equalsIgnoreCase(class230.field3664)) {
                        if (arg0.field3425 > class48.field878.field3425) {
                            var13 = 2000;
                        }
                        if (class48.field878.field3441 != 0 && arg0.field3441 != 0) {
                            if (class48.field878.field3441 == arg0.field3441) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class104.field1596[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class129.field2129[var12];
                    short var16 = (short) (var13 + var15);
                    class107.method798((long) arg3, false, class28.field490[var12], var16, arg1, "<col=ffffff>" + var11, class228.field3630[var12], arg2);
                }
            }
        } else if ((class111.field1708 & 0x8) != 0) {
            class107.method798((long) arg3, false, class110.field1702, (short) 15, arg1, class20.field314 + " -> <col=ffffff>" + var11, class135.field2226, arg2);
            class113.field1746++;
        }
        for (int var17 = 0; var17 < class42.field776; var17++) {
            if (class94.field1468[var17] == 5) {
                class217.field3488[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
        int var18 = 23 / ((arg4 + 3) / 57);
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(Z)V")
    public static void method1323(boolean arg0) {
        field3161 = null;
        if (!arg0) {
            method1323(true);
        }
        field3155 = null;
        field3164 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class76.method602(arg1, arg2 + arg7, arg3 + arg6);
        field3154++;
        if (var8 != 0L) {
            int var10 = (int) var8 >> 14 & 0x1F;
            int var11 = (int) var8 >> 20 & 0x3;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class248 var13 = class46.method396(var12, (byte) 63);
            if (var13.field3903 == -1) {
                int var14 = arg5;
                int var15 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
                int[] var16 = class63.field1048;
                if (var8 > 0L) {
                    var14 = arg0;
                }
                if (var10 == 0 || var10 == 2) {
                    if (var11 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var11 == 1) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var11 == 2) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 3 + 512] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var11 == 3) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 2 + 1536] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var11 == 0) {
                        var16[var15] = var14;
                    } else if (var11 == 1) {
                        var16[var15 + 3] = var14;
                    } else if (var11 == 2) {
                        var16[var15 + 1536 + 3] = var14;
                    } else if (var11 == 3) {
                        var16[var15 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var11 == 3) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var11 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var11 == 1) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 512 + 3] = var14;
                        var16[var15 + 1024 + 3] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var11 == 2) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 2 + 1536] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    }
                }
            } else if (!class28.method250(arg2, 101, var13, var11, arg6, arg7, arg3)) {
                return false;
            }
        }
        long var17 = class38.method317(arg1, arg2 + arg7, arg3 + arg6);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3CD4B4) >> 20;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var17 >> 14 & 0x1F;
            class248 var22 = class46.method396(var20, (byte) 63);
            if (var22.field3903 == -1) {
                if (var21 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class63.field1048;
                    int var25 = arg2 * 4 + (52736 - (arg3 * 512)) * 4 + 24624;
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1025] = var23;
                        var24[var25 + 514] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 513] = var23;
                        var24[var25 + 2 + 1024] = var23;
                        var24[var25 + 1539] = var23;
                    }
                }
            } else if (!class28.method250(arg2, 102, var22, var19, arg6, arg7, arg3)) {
                return false;
            }
        }
        long var26 = class205.method1382(arg1, arg2 + arg7, arg3 + arg6);
        if (arg4 >= -97) {
            return true;
        }
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x3FEA0C) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class248 var30 = class46.method396(var29, (byte) 63);
            if (var30.field3903 != -1 && !class28.method250(arg2, 108, var30, var28, arg6, arg7, arg3)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    public static final int method1325(int arg0, int arg1) {
        field3153++;
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        if (arg1 == 3) {
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return -46;
        }
    }
}
