import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public abstract class class222 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Z")
    public static boolean field3539 = false;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ljg;")
    public static class271 field3531;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Lra;")
    public static final class291 method1469(int arg0, int arg1) {
        field3529++;
        class291 var2 = (class291) class185.field2959.method1839((byte) 84, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -13124) {
            byte[] var3 = class39.field474.method940((byte) 42, arg0, 33);
            class291 var4 = new class291();
            if (var3 != null) {
                var4.method1945(17371, new class264(var3), arg0);
            }
            class185.field2959.method1830((long) arg0, -45, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljj;BLjava/lang/String;)Lpc;")
    public static final class79 method1470(class134 arg0, byte arg1, String arg2) {
        field3538++;
        int var3 = arg0.method947(-24925, arg2);
        if (var3 == -1) {
            return new class79(0);
        }
        int[] var4 = arg0.method919(arg1 ^ 0x47, var3);
        class79 var5 = new class79(var4.length);
        if (arg1 != -54) {
            field3533 = 106;
        }
        for (int var6 = 0; var6 < var5.field1086; var6++) {
            class264 var7 = new class264(arg0.method940((byte) 35, var4[var6], var3));
            var5.field1083[var6] = var7.method1750((byte) -98);
            var5.field1084[var6] = var7.method1767(16711680);
            var5.field1088[var6] = var7.method1765((byte) 98);
            var5.field1087[var6] = var7.method1765((byte) 96);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static final void method1471(byte arg0) {
        class93.field1326.method775(2430);
        field3534++;
        int var1 = -26 % ((arg0 - 73) / 48);
        class130.field2178 = 1;
        class110.field1899 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class44.field521[arg0][var8][var14] == -class136.field2263) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class229.field3641[arg0][arg1][arg3] + arg5;
            if (!class93.method651(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class93.method651(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class93.method651(var9, var11, var13)) {
                return false;
            } else if (class93.method651(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class54.method418(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class93.method651(var6 + 1, class229.field3641[arg0][arg1][arg3] + arg5, var7 + 1) && class93.method651(var6 + 128 - 1, class229.field3641[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class93.method651(var6 + 128 - 1, class229.field3641[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class93.method651(var6 + 1, class229.field3641[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method1473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            method1475(113);
        }
        if (class153.field2469 != 0 && arg2 != 0 && class104.field1750 < 50 && arg4 != -1) {
            class97.field1467[class104.field1750] = arg4;
            class54.field772[class104.field1750] = arg2;
            class116.field1982[class104.field1750] = arg1;
            class275.field4435[class104.field1750] = null;
            class164.field2665[class104.field1750] = 0;
            class197.field3181[class104.field1750] = arg3;
            class104.field1750++;
        }
        field3537++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ[Leb;)V")
    public static final void method1474(int arg0, boolean arg1, class103[] arg2) {
        field3536++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class103 var4 = arg2[var3];
            if (var4 != null && var4.field1602 == arg0 && (!var4.field1603 || !client.method1506(var4))) {
                if (var4.field1655 == 0) {
                    if (!var4.field1603 && client.method1506(var4) && class268.field4348 != var4) {
                        continue;
                    }
                    method1474(var4.field1659, arg1, arg2);
                    if (var4.field1624 != null) {
                        method1474(var4.field1659, false, var4.field1624);
                    }
                    class128 var5 = (class128) class294.field4656.method457((long) var4.field1659, (byte) -115);
                    if (var5 != null) {
                        class138.method955((byte) -127, var5.field2135);
                    }
                }
                if (var4.field1655 == 6) {
                    if (var4.field1632 != -1 || var4.field1700 != -1) {
                        boolean var6 = class268.method1819(var4, -3);
                        int var7;
                        if (var6) {
                            var7 = var4.field1700;
                        } else {
                            var7 = var4.field1632;
                        }
                        if (var7 != -1) {
                            class21 var8 = class267.method1812((byte) 89, var7);
                            if (var8 != null) {
                                var4.field1633 += class221.field3524;
                                while (var4.field1633 > var8.field240[var4.field1594]) {
                                    var4.field1633 -= var8.field240[var4.field1594];
                                    var4.field1594++;
                                    if (var4.field1594 >= var8.field237.length) {
                                        var4.field1594 -= var8.field248;
                                        if (var4.field1594 < 0 || var8.field237.length <= var4.field1594) {
                                            var4.field1594 = 0;
                                        }
                                    }
                                    var4.field1712 = var4.field1594 + 1;
                                    if (var4.field1712 >= var8.field237.length) {
                                        var4.field1712 -= var8.field248;
                                        if (var4.field1712 < 0 || var4.field1712 >= var8.field237.length) {
                                            var4.field1712 = -1;
                                        }
                                    }
                                    class45.method346((byte) 46, var4);
                                }
                            }
                        }
                    }
                    if (var4.field1549 != 0 && !var4.field1603) {
                        int var9 = var4.field1549 >> 16;
                        int var10 = class221.field3524 * var9;
                        int var11 = var4.field1549 << 16 >> 16;
                        var4.field1683 = var4.field1683 + var10 & 0x7FF;
                        int var12 = class221.field3524 * var11;
                        var4.field1605 = var4.field1605 + var12 & 0x7FF;
                        class45.method346((byte) 108, var4);
                    }
                }
            }
        }
        if (arg1) {
            method1471((byte) -68);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1475(int arg0) {
        field3531 = null;
        int var1 = 20 % ((48 - arg0) / 43);
    }
}
