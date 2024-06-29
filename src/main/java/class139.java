import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class139 {

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[B")
    public byte[] field2329;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[S")
    public short[] field2341;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[S")
    public short[] field2338;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "[Ldf;")
    public class51[] field2342;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
    public int[] field2328;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static volatile int field2330 = 0;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[I")
    public static int[] field2335 = new int[2000];

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
    public static int[] field2332 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Ldf;")
    private static class51 field2336 = class46.method233(" is already on your friend list)3", 100);

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Ldf;")
    public static class51 field2334 = field2336;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lu;")
    public static class111 field2343;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    public static int[] field2327;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method1007(byte arg0) {
        field2331++;
        if (arg0 >= 12 && class24.field364 == 5) {
            class24.field364 = 6;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static final void method1008(byte arg0) {
        field2339++;
        if (arg0 != -43) {
            method1007((byte) -72);
        }
        if (class78.field1246 != null || class136.field2257 != null) {
            return;
        }
        int var1 = class19.field269;
        if (class90.field1498) {
            if (var1 != 1) {
                int var2 = class89.field1482;
                int var3 = class90.field1504;
                if (class89.field1475 - 10 > var2 || var2 > (class92.field1531 + class89.field1475 + 10) || (class255.field4458 - 10) > var3 || var3 > class255.field4458 + class87.field1455 + 10) {
                    class90.field1498 = false;
                    class2.method6(class255.field4458, class89.field1475, 0, class92.field1531, class87.field1455);
                }
            }
            if (var1 == 1) {
                int var4 = class89.field1475;
                int var5 = class255.field4458;
                int var6 = class92.field1531;
                int var7 = class221.field3834;
                int var8 = class265.field4642;
                int var9 = -1;
                for (int var10 = 0; var10 < class39.field616; var10++) {
                    int var11 = (class39.field616 - var10 - 1) * 15 + var5 + 31;
                    if (var8 > var4 && (var4 + var6) > var8 && var7 > var11 - 13 && (var11 + 3) > var7) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class108.method779((byte) 124, var9);
                }
                class90.field1498 = false;
                class2.method6(class255.field4458, class89.field1475, arg0 ^ 0xFFFFFFD5, class92.field1531, class87.field1455);
                return;
            }
            return;
        }
        if (var1 == 1 && class39.field616 > 0) {
            short var12 = class67.field1103[class39.field616 - 1];
            if (var12 == 6 || var12 == 58 || var12 == 34 || var12 == 42 || var12 == 51 || var12 == 33 || var12 == 4 || var12 == 12 || var12 == 40 || var12 == 10 || var12 == 8 || var12 == 1006) {
                int var13 = class156.field2579[class39.field616 - 1];
                int var14 = class263.field4599[class39.field616 - 1];
                class213 var15 = class198.method1392(11823, var14);
                if (class177.method1239(client.method1061(var15), 525458370) || class60.method401(client.method1061(var15), (byte) 76)) {
                    class182.field3007 = 0;
                    class231.field4040 = false;
                    if (class78.field1246 != null) {
                        class25.method135(class78.field1246, -28014);
                    }
                    class78.field1246 = class198.method1392(11823, var14);
                    class157.field2595 = var13;
                    class132.field2205 = class221.field3834;
                    class163.field2680 = class265.field4642;
                    class25.method135(class78.field1246, -28014);
                    return;
                }
            }
        }
        if (var1 == 1 && (class46.field728 == 1 && class39.field616 > 2 || class63.method416(class39.field616 - 1, 16776960))) {
            var1 = 2;
        }
        if (var1 == 2 && class39.field616 > 0 || class19.field267 == 1) {
            class240.method1652((byte) 126);
        }
        if ((var1 != 1 || class39.field616 <= 0) && class19.field267 != 2) {
            return;
        }
        class4.method12(true);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lwc;BI)I")
    public static final int method1009(class213 arg0, byte arg1, int arg2) {
        field2344++;
        if (arg0.field3575 == null || arg0.field3575.length <= arg2) {
            return -2;
        }
        try {
            int var3 = -4 % ((arg1 - 37) / 51);
            int[] var4 = arg0.field3575[arg2];
            int var5 = 0;
            byte var6 = 0;
            int var7 = 0;
            while (true) {
                int var8 = 0;
                int var9 = var4[var7++];
                byte var10 = 0;
                if (var9 == 0) {
                    return var5;
                }
                if (var9 == 15) {
                    var10 = 1;
                }
                if (var9 == 16) {
                    var10 = 2;
                }
                if (var9 == 1) {
                    var8 = class246.field4264[var4[var7++]];
                }
                if (var9 == 2) {
                    var8 = class123.field2089[var4[var7++]];
                }
                if (var9 == 17) {
                    var10 = 3;
                }
                if (var9 == 3) {
                    var8 = class259.field4517[var4[var7++]];
                }
                if (var9 == 4) {
                    int var11 = var4[var7++] << 16;
                    int var12 = var11 + var4[var7++];
                    class213 var13 = class198.method1392(11823, var12);
                    int var14 = var4[var7++];
                    if (var14 != -1 && (!class219.method1508(var14, (byte) -27).field3914 || class44.field703)) {
                        for (int var15 = 0; var15 < var13.field3543.length; var15++) {
                            if ((var14 + 1) == var13.field3543[var15]) {
                                var8 += var13.field3587[var15];
                            }
                        }
                    }
                }
                if (var9 == 5) {
                    var8 = class30.field439[var4[var7++]];
                }
                if (var9 == 6) {
                    var8 = class264.field4609[class123.field2089[var4[var7++]] - 1];
                }
                if (var9 == 7) {
                    var8 = class30.field439[var4[var7++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var8 = class44.field706.field1697;
                }
                if (var9 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class264.field4613[var16]) {
                            var8 += class123.field2089[var16];
                        }
                    }
                }
                if (var9 == 10) {
                    int var17 = var4[var7++] << 16;
                    int var18 = var17 + var4[var7++];
                    class213 var19 = class198.method1392(11823, var18);
                    int var20 = var4[var7++];
                    if (var20 != -1 && (!class219.method1508(var20, (byte) -28).field3914 || class44.field703)) {
                        for (int var21 = 0; var21 < var19.field3543.length; var21++) {
                            if (var20 + 1 == var19.field3543[var21]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var8 = class84.field1405;
                }
                if (var9 == 12) {
                    var8 = class115.field1948;
                }
                if (var9 == 13) {
                    int var22 = class30.field439[var4[var7++]];
                    int var23 = var4[var7++];
                    var8 = (var22 & 0x1 << var23) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var24 = var4[var7++];
                    var8 = class149.method1078((byte) -79, var24);
                }
                if (var9 == 18) {
                    var8 = (class44.field706.field4319 >> 7) + class11.field160;
                }
                if (var9 == 19) {
                    var8 = (class44.field706.field4348 >> 7) + class241.field4179;
                }
                if (var9 == 20) {
                    var8 = var4[var7++];
                }
                if (var10 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var10;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Z")
    public final boolean method1010(int arg0, int arg1) {
        if (arg1 != -6) {
            field2327 = null;
        }
        field2340++;
        return (this.field2329[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2332 = null;
        field2343 = null;
        field2335 = null;
        if (arg0 > -78) {
            field2343 = null;
        }
        field2334 = null;
        field2336 = null;
        field2327 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)I")
    public final int method1012(int arg0, byte arg1) {
        field2333++;
        if (arg1 != -73) {
            this.method1010(-33, -16);
        }
        return this.field2329[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
    public class139(int arg0) {
        this.field2337 = arg0;
        this.field2329 = new byte[this.field2337];
        this.field2341 = new short[this.field2337];
        this.field2338 = new short[this.field2337];
        this.field2342 = new class51[this.field2337];
        this.field2328 = new int[this.field2337];
    }
}
