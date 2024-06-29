import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class140 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lsc;")
    private static class181 field2263 = class149.method967(255, "");

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lsc;")
    public static class181 field2268 = field2263;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
    public static int[] field2272 = new int[200];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field2261 = 0;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Z")
    public static boolean field2270 = false;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Lsc;")
    public static class181 field2274 = class149.method967(255, ")4");

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Ldf;")
    public static class117 field2262;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILsc;)Z")
    public static final boolean method891(int arg0, class181 arg1) {
        if (arg0 != -4241) {
            field2270 = true;
        }
        field2271++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class221.field3815; var2++) {
            if (arg1.method1227(30093, class218.field3755[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)I")
    public static final int method892(int arg0, byte arg1, int arg2) {
        field2273++;
        int var3 = 25 % ((arg1 - 34) / 37);
        int var4 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var4 = arg2 * var4;
            }
            arg2 *= arg2;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg2 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
    public static final void method893(int arg0, byte arg1) {
        field2267++;
        class48 var2;
        if (class247.field4312 == null) {
            var2 = new class48(512, 512);
        } else {
            var2 = (class48) class247.field4312;
        }
        int[] var3 = var2.field747;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class70.field1129[arg0][var25][var6] & 0x18) == 0) {
                    class38.method276(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (class70.field1129[arg0 + 1][var25][var6] & 0x8) != 0) {
                    class38.method276(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        if (arg1 >= -26) {
            method896((byte) 94);
        }
        int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (-((int) (Math.random() * 20.0D)) + 10 + -238);
        var2.method325();
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class70.field1129[arg0][var23][var9] & 0x18) == 0) {
                    class21.method193((byte) 75, var9, arg0, var8, var23, var7);
                }
                if (arg0 < 3 && (class70.field1129[arg0 + 1][var23][var9] & 0x8) != 0) {
                    class21.method193((byte) -72, var9, arg0 + 1, var8, var23, var7);
                }
            }
        }
        class257.field4499 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class123.method800(class38.field581, var10, var11);
                if (var12 != 0L) {
                    class148 var14 = class62.method442((byte) 79, Integer.MAX_VALUE & (int) (var12 >>> 32));
                    int var15 = var14.field2457;
                    if (var14.field2446 != null) {
                        for (int var16 = 0; var16 < var14.field2446.length; var16++) {
                            if (var14.field2446[var16] != -1) {
                                class148 var17 = class62.method442((byte) 79, var14.field2446[var16]);
                                if (var17.field2457 >= 0) {
                                    var15 = var17.field2457;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class109.field1784[class38.field581].field142;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && (var10 - 3) < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && var10 + 3 > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && var11 - 3 < var19 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class43.field682[class257.field4499] = var14.field2431;
                        class82.field1318[class257.field4499] = var18;
                        class131.field2173[class257.field4499] = var19;
                        class257.field4499++;
                    }
                }
            }
        }
        class247.field4312 = var2;
        class90.field1438.method385(0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
    public static final void method894(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class26.field455; var3++) {
            for (int var4 = 0; var4 < class238.field4129; var4++) {
                for (int var5 = 0; var5 < class2.field47; var5++) {
                    class220 var6 = class221.field3820[var3][var4][var5];
                    if (var6 != null) {
                        class75 var7 = var6.field3801;
                        if (var7 != null && var7.field1203.method365()) {
                            class64.method452(var7.field1203, var3, var4, var5, 1, 1);
                            if (var7.field1212 != null && var7.field1212.method365()) {
                                class64.method452(var7.field1212, var3, var4, var5, 1, 1);
                                var7.field1203.method355(var7.field1212, 0, 0, 0, false);
                                var7.field1212 = var7.field1212.method371(arg0, arg1, arg2);
                            }
                            var7.field1203 = var7.field1203.method371(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3806; var8++) {
                            class100 var10 = var6.field3797[var8];
                            if (var10 != null && var10.field1681.method365()) {
                                class64.method452(var10.field1681, var3, var4, var5, var10.field1671 + 1 - var10.field1688, var10.field1676 - var10.field1672 + 1);
                                var10.field1681 = var10.field1681.method371(arg0, arg1, arg2);
                            }
                        }
                        class164 var9 = var6.field3805;
                        if (var9 != null && var9.field2795.method365()) {
                            class170.method1130(var9.field2795, var3, var4, var5);
                            var9.field2795 = var9.field2795.method371(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lwb;")
    public static final class91 method895(int arg0) {
        field2269++;
        if (arg0 < 102) {
            method891(73, (class181) null);
        }
        class91 var1 = (class91) class8.field151.method626((byte) -117);
        if (var1 != null) {
            var1.method290((byte) -48);
            var1.method1128((byte) 20);
            return var1;
        }
        class91 var2;
        do {
            var2 = (class91) class75.field1199.method626((byte) -117);
            if (var2 == null) {
                return null;
            }
            if (var2.method602(2) > class213.method1414(-9292)) {
                return null;
            }
            var2.method290((byte) -48);
            var2.method1128((byte) 20);
        } while ((var2.field2854 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method896(byte arg0) {
        field2274 = null;
        if (arg0 > 126) {
            field2262 = null;
            field2268 = null;
            field2263 = null;
            field2272 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
    public static final int method897(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljb;Ljb;Ljb;B)V")
    public static final void method898(class11 arg0, class11 arg1, class11 arg2, byte arg3) {
        class244.field4231 = arg2;
        class217.field3731 = arg1;
        field2265++;
        class38.field586 = arg0;
        if (arg3 != -18) {
            method895(-50);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(JIIILsc;II)V")
    public static final void method899(long arg0, int arg1, int arg2, int arg3, class181 arg4, int arg5, int arg6) {
        field2266++;
        class230 var8 = new class230(128);
        var8.method1538(10, (byte) 58);
        var8.method1534(0, (int) (Math.random() * 99999.0D));
        var8.method1534(0, 507);
        var8.method1511(false, arg0);
        var8.method1544((int) (Math.random() * 9.9999999E7D), -3165);
        var8.method1550(arg4, 115);
        var8.method1544((int) (Math.random() * 9.9999999E7D), -3165);
        var8.method1534(0, class264.field4584);
        var8.method1538(arg6, (byte) -88);
        var8.method1538(arg1, (byte) 63);
        var8.method1544((int) (Math.random() * 9.9999999E7D), -3165);
        var8.method1534(0, arg3);
        var8.method1534(arg5, arg2);
        var8.method1544((int) (Math.random() * 9.9999999E7D), -3165);
        var8.method1562(class95.field1518, class148.field2461, arg5 ^ 0x45);
        class141.field2275.field3933 = 0;
        class141.field2275.method1538(114, (byte) 56);
        class141.field2275.method1538(var8.field3933, (byte) -63);
        class141.field2275.method1564(var8.field3933, var8.field3977, (byte) 100, 0);
        class47.field743 = 1;
        class8.field157 = 0;
        class234.field4075 = -3;
        class123.field2011 = 0;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public static final void method900(int arg0) {
        field2264++;
        if (arg0 <= -63) {
            class87.field1376.method1790(0);
        }
    }
}
