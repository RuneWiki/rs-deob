import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class100 implements class283 {

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lub;")
    public static class15 field1271 = new class15(64);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Z")
    public boolean field1265;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILaa;)Z")
    public final boolean method580(int arg0, class283 arg1) {
        field1270++;
        if (!(arg1 instanceof class100)) {
            return false;
        }
        class100 var3 = (class100) arg1;
        if (this.field1260 != var3.field1260) {
            return false;
        } else if (this.field1262 != var3.field1262) {
            return false;
        } else if (this.field1259 != var3.field1259) {
            return false;
        } else if (this.field1272 != var3.field1272) {
            return false;
        } else if (this.field1266 != var3.field1266) {
            return false;
        } else if (this.field1267 != var3.field1267) {
            return false;
        } else if (this.field1265 == var3.field1265) {
            if (arg0 != -12607) {
                this.field1267 = -88;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)J")
    public final long method581(int arg0) {
        field1268++;
        long[] var2 = class86.field1116;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field1260 ^ var3) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field1262 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field1262 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field1259 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        if (arg0 != -7351) {
            return 96L;
        }
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field1259 >> 16) ^ var11) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field1259 >> 8)) & 0xFFL)];
        long var17 = var2[(int) (((long) this.field1259 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) (((long) this.field1272 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field1266 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field1266 >> 16)) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field1266 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field1266 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field1267 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field1265 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZLtj;I)V")
    public static final void method582(int arg0, int arg1, int arg2, boolean arg3, class108 arg4, int arg5) {
        if (arg0 != 2) {
            field1271 = null;
        }
        class444.field6343 = 10000;
        class189.field2706 = arg3;
        class200.field2854 = arg1;
        class85.field1094 = arg5;
        field1264++;
        class20.field269 = arg4;
        class316.field4635 = arg2;
        class439.field6279 = 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lvq;IILbr;I)V")
    public static final void method583(class269 arg0, int arg1, int arg2, class223 arg3, int arg4) {
        if (arg2 >= -26) {
            field1271 = null;
        }
        field1263++;
        class226 var5 = arg3.method1567((byte) 122, arg0);
        if (var5 == null) {
            return;
        }
        arg0.method937(arg4, arg1, arg3.field3250 + arg4, arg3.field3282 + arg1);
        if (class259.field3833 == 2 || class259.field3833 == 5 || class332.field4831 == null) {
            arg0.method871(-16777216, var5, arg4, arg1);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class336.field4878 == 4) {
            var7 = 4096;
            var9 = (int) (-class358.field5176) & 0x3FFF;
            var8 = class165.field2348;
            var6 = class302.field4402;
        } else {
            var6 = class181.field2555.field4463;
            var7 = 4096 - (class261.field3863 * 16);
            var8 = class181.field2555.field4466;
            var9 = (int) (-class358.field5176) + class63.field842 & 0x3FFF;
        }
        int var10 = var6 / 32 + 48 + 208 - (class80.field1034 * 2);
        int var11 = class381.field5414 * 4 + 48 - ((class381.field5414 - 104) * 2) - (var8 / 32);
        class332.field4831.method1771((float) arg3.field3250 / 2.0F + (float) arg4, (float) arg3.field3282 / 2.0F + (float) arg1, (float) var10, (float) var11, var7, var9 << 2, var5, arg4, arg1);
        for (class24 var12 = (class24) class438.field6250.method2752(-51); var12 != null; var12 = (class24) class438.field6250.method2754(-1)) {
            int var50 = var12.field299;
            int var51 = (class24.field297.field366[var50] >> 14 & 0x3FFF) - class306.field4459;
            int var52 = (class24.field297.field366[var50] & 0x3FFF) - class342.field4959;
            int var53 = var51 * 4 + 2 - var6 / 32;
            int var54 = var52 * 4 + 2 - (var8 / 32);
            class253.method1762(arg4, var5, arg0, -28475, var53, arg1, class24.field297.field370[var50], var54, arg3);
        }
        for (int var13 = 0; var13 < class410.field5888; var13++) {
            int var47 = class21.field271[var13] * 4 + 2 - (var6 / 32);
            int var48 = class451.field6465[var13] * 4 + 2 - (var8 / 32);
            class282 var49 = class398.method2496(-121, class411.field5894[var13]);
            if (var49.field4115 != null) {
                var49 = var49.method1942(4096);
                if (var49 == null || var49.field4075 == -1) {
                    continue;
                }
            }
            class253.method1762(arg4, var5, arg0, -28475, var47, arg1, var49.field4075, var48, arg3);
        }
        for (class413 var14 = (class413) class338.field4904.method1383(-73); var14 != null; var14 = (class413) class338.field4904.method1378((byte) 98)) {
            int var44 = (int) (var14.field6070 >> 28 & 0x3L);
            if (class134.field2063 == var44) {
                int var45 = (int) (var14.field6070 & 0x3FFFL) * 4 + 2 - (var6 / 32);
                int var46 = (int) (var14.field6070 >> 14 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                class21.method118(var45, arg1, arg4, var5, arg3, class171.field2418[0], false, var46);
            }
        }
        for (int var15 = 0; var15 < class229.field3396; var15++) {
            class446 var40 = class442.field6317[class431.field6169[var15]];
            if (var40 != null && var40.method2782(150)) {
                class346 var41 = var40.field6375;
                if (var41 != null && var41.field5023 != null) {
                    var41 = var41.method2273(-1);
                }
                if (var41 != null && var41.field5029 && var41.field5020) {
                    int var42 = var40.field4463 / 32 - (var6 / 32);
                    int var43 = var40.field4466 / 32 - (var8 / 32);
                    if (var41.field5011 == -1) {
                        class21.method118(var42, arg1, arg4, var5, arg3, class171.field2418[1], false, var43);
                    } else {
                        class253.method1762(arg4, var5, arg0, -28475, var42, arg1, var41.field5011, var43, arg3);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class334.field4847; var16++) {
            class128 var32 = class243.field3596[class26.field323[var16]];
            if (var32 != null && var32.method782(150)) {
                int var33 = var32.field4463 / 32 - var6 / 32;
                int var34 = var32.field4466 / 32 - (var8 / 32);
                boolean var35 = false;
                for (int var36 = 0; var36 < class206.field2897; var36++) {
                    if (var32.field1790.equals(class56.field743[var36]) && class275.field3973[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class224.field3349; var38++) {
                    if (var32.field1790.equals(class428.field6093[var38].field4273)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class181.field2555.field1795 != 0 && var32.field1795 != 0 && class181.field2555.field1795 == var32.field1795) {
                    var39 = true;
                }
                if (var35) {
                    class21.method118(var33, arg1, arg4, var5, arg3, class171.field2418[3], false, var34);
                } else if (var37) {
                    class21.method118(var33, arg1, arg4, var5, arg3, class171.field2418[5], false, var34);
                } else if (var39) {
                    class21.method118(var33, arg1, arg4, var5, arg3, class171.field2418[4], false, var34);
                } else {
                    class21.method118(var33, arg1, arg4, var5, arg3, class171.field2418[2], false, var34);
                }
            }
        }
        class136[] var17 = class209.field2990;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class136 var21 = var17[var18];
            if (var21 != null && var21.field2097 != 0 && class34.field434 % 20 < 10) {
                if (var21.field2097 == 1 && var21.field2101 >= 0 && class442.field6317.length > var21.field2101) {
                    class446 var22 = class442.field6317[var21.field2101];
                    if (var22 != null) {
                        int var23 = var22.field4463 / 32 - (var6 / 32);
                        int var24 = var22.field4466 / 32 - (var8 / 32);
                        class190.method1367(var21.field2100, var24, arg3, arg1, var23, 360000, 1, var5, arg4);
                    }
                }
                if (var21.field2097 == 2) {
                    int var25 = (var21.field2102 - class306.field4459) * 4 + 2 - (var6 / 32);
                    int var26 = (var21.field2106 - class342.field4959) * 4 + 2 - (var8 / 32);
                    int var27 = var21.field2104 * 4;
                    int var28 = var27 * var27;
                    class190.method1367(var21.field2100, var26, arg3, arg1, var25, var28, 1, var5, arg4);
                }
                if (var21.field2097 == 10 && var21.field2101 >= 0 && class243.field3596.length > var21.field2101) {
                    class128 var29 = class243.field3596[var21.field2101];
                    if (var29 != null) {
                        int var30 = var29.field4463 / 32 - (var6 / 32);
                        int var31 = var29.field4466 / 32 - (var8 / 32);
                        class190.method1367(var21.field2100, var31, arg3, arg1, var30, 360000, 1, var5, arg4);
                    }
                }
            }
        }
        if (class336.field4878 == 4) {
            return;
        }
        if (class218.field3132 != 0) {
            int var19 = class218.field3132 * 4 + ((class181.field2555.method773((byte) 35) + -1) * 2) + 2 - (var6 / 32);
            int var20 = class72.field944 * 4 + class181.field2555.method773((byte) 77) * 2 + 2 - (var8 / 32) - 2;
            class21.method118(var19, arg1, arg4, var5, arg3, class376.field5356[class53.field690 ? 1 : 0], false, var20);
        }
        arg0.method1832(arg4 - (1 - (arg3.field3250 / 2)), -1, 3, 1, arg3.field3282 / 2 + arg1 - 1, 3);
        return;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method584(byte arg0, String arg1) {
        field1261++;
        int var2 = arg1.length();
        if (arg0 != 19) {
            field1271 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class73.method441(arg1.charAt(var4), (byte) 100) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method585(byte arg0) {
        field1271 = null;
        if (arg0 != -35) {
            method586((byte) -93, -80);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)Lhk;")
    public static final class54 method586(byte arg0, int arg1) {
        if (arg0 != 18) {
            field1271 = null;
        }
        field1269++;
        class54 var2 = (class54) class308.field4476.method1972((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class311.field4563.method643(arg1, 0, true);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class54 var4 = class200.method1413(-101, var3);
            class308.field4476.method1975(var4, (long) arg1, false);
            return var4;
        }
    }
}
