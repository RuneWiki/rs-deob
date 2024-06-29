import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class22 extends class291 {

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "Lfb;")
    public static class265 field281 = new class265(0, 0);

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "Leg;")
    private static class37 field283 = class174.method1167("Take", 60);

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "[Lpf;")
    public static class225[] field284 = new class225[6];

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "Leg;")
    public static class37 field285 = field283;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "[Leg;")
    public static class37[] field289 = new class37[200];

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "Leg;")
    private static class37 field286 = class174.method1167("Started 3d Library", 81);

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "Leg;")
    public static class37 field287 = field286;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!mk", name = "X", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!mk", name = "Y", descriptor = "Ljl;")
    public static class101 field291;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static void method134(byte arg0) {
        field283 = null;
        if (arg0 >= -77) {
            method134((byte) 109);
        }
        field287 = null;
        field281 = null;
        field285 = null;
        field284 = null;
        field286 = null;
        field291 = null;
        field289 = null;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)V")
    public static final void method135(byte arg0) {
        field282++;
        if (class73.field1155 == null) {
            return;
        }
        if (class78.field1216 < 10) {
            if (!class190.field3263.method678(class73.field1155.field114, 0)) {
                class78.field1216 = class215.field3714.method657(-25325, class73.field1155.field114) / 10;
                return;
            }
            class237.method1631(-1);
            class78.field1216 = 10;
        }
        if (class78.field1216 == 10) {
            class79.field1229 = 8.0F;
            class19.field252 = 8.0F;
            class13.field205 = class73.field1155.field113 >> 6 << 6;
            class228.field3921 = class73.field1155.field117 >> 6 << 6;
            class118.field2004 = (class73.field1155.field116 >> 6 << 6) + 64 - class228.field3921;
            int var1 = (class82.field1285.field1799 >> 7) + (class40.field642 - class13.field205);
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class228.field3921 + class118.field2004 - (class82.field1285.field1793 >> 7) - class144.field2456 - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            class243.field4368 = (class73.field1155.field120 >> 6 << 6) + 64 - class13.field205;
            if (var2 >= 0 && var2 < class243.field4368 && var4 >= 0 && class118.field2004 > var4) {
                class28.field414 = var4;
                class217.field3738 = var2;
            } else {
                class28.field414 = class228.field3921 + class118.field2004 - class73.field1155.field110 * 64 - 1;
                class217.field3738 = class73.field1155.field126 * 64 - class13.field205;
            }
            class78.method530(-1);
            class177.field2961 = new int[class271.field4759 + 1];
            int var5 = class243.field4368 >> 6;
            int var6 = class118.field2004 >> 6;
            class260.field4607 = new byte[var5][var6][];
            class186.field3120 = new byte[var5][var6][];
            class265.field4649 = new int[var5][var6][];
            class190.field3265 = new byte[var5][var6][];
            class107.field1676 = new short[var5][var6][];
            int var7 = class186.field3114 >> 1;
            class27.field390 = new byte[var5][var6][];
            int var8 = class223.field3832 >> 2 << 10;
            class201.field3408 = new byte[var5][var6][];
            class74.field1163 = new int[var5][var6][];
            class177.method1179(var8, var7, 64512);
            class78.field1216 = 20;
        } else if (class78.field1216 == 20) {
            class252.method1717((byte) -39, new class187(class190.field3263.method660(class73.field1155.field114, (byte) -118, class228.field3915)));
            class78.field1216 = 30;
            class248.method1713((byte) -94, true);
            class18.method122(0);
        } else if (class78.field1216 == 30) {
            class139.method983(-25093, new class187(class190.field3263.method660(class73.field1155.field114, (byte) -101, class225.field3867)));
            class78.field1216 = 40;
            class18.method122(0);
        } else if (class78.field1216 == 40) {
            class123.method888((byte) 36, new class187(class190.field3263.method660(class73.field1155.field114, (byte) -111, class107.field1675)));
            class78.field1216 = 50;
            class18.method122(0);
        } else if (class78.field1216 == 50) {
            class252.method1722(63, new class187(class190.field3263.method660(class73.field1155.field114, (byte) -119, class138.field2358)));
            class78.field1216 = 60;
            class248.method1713((byte) -91, true);
            class18.method122(0);
        } else if (class78.field1216 == 60) {
            if (class190.field3263.method680(1, class156.method1061((byte) 101, new class37[] { class73.field1155.field114, class49.field772 }))) {
                if (!class190.field3263.method678(class156.method1061((byte) -127, new class37[] { class73.field1155.field114, class49.field772 }), 0)) {
                    return;
                }
                class146.field2477 = client.method794(class156.method1061((byte) -122, new class37[] { class73.field1155.field114, class49.field772 }), 24021, class190.field3263);
            } else {
                class146.field2477 = new class4(0);
            }
            class78.field1216 = 70;
            class18.method122(0);
        } else if (class78.field1216 == 70) {
            class78.field1213 = new class11(11, true, class93.field1466);
            class78.field1216 = 73;
            class248.method1713((byte) -94, true);
            class18.method122(0);
        } else if (class78.field1216 == 73) {
            class242.field4356 = new class11(12, true, class93.field1466);
            class78.field1216 = 76;
            class248.method1713((byte) -100, true);
            class18.method122(0);
        } else if (class78.field1216 == 76) {
            class241.field4310 = new class11(14, true, class93.field1466);
            class78.field1216 = 79;
            class248.method1713((byte) -125, true);
            class18.method122(0);
        } else if (class78.field1216 == 79) {
            class7.field119 = new class11(17, true, class93.field1466);
            class78.field1216 = 82;
            class248.method1713((byte) -126, true);
            class18.method122(0);
        } else if (class78.field1216 == 82) {
            class2.field39 = new class11(19, true, class93.field1466);
            class78.field1216 = 85;
            class248.method1713((byte) -94, true);
            class18.method122(0);
        } else if (class78.field1216 == 85) {
            class85.field1330 = new class11(22, true, class93.field1466);
            class78.field1216 = 88;
            class248.method1713((byte) -100, true);
            class18.method122(0);
        } else if (class78.field1216 == 88) {
            class60.field984 = new class11(26, true, class93.field1466);
            class78.field1216 = 91;
            class248.method1713((byte) -93, true);
            class18.method122(0);
        } else {
            class108.field1686 = new class11(30, true, class93.field1466);
            class78.field1216 = 100;
            class248.method1713((byte) -90, true);
            int var9 = 115 / ((arg0 - 14) / 39);
            class18.method122(0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)Z")
    public abstract boolean method129(byte arg0);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)V")
    public static final void method136(int arg0, int arg1) {
        field279++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class56.field908 += arg0 * 128;
        if (class123.field2059.length < class56.field908) {
            class56.field908 -= class123.field2059.length;
            int var3 = (int) (Math.random() * 12.0D);
            class84.method560(class119.field2014[var3], (byte) 92);
        }
        int var4 = arg0 * 128;
        int var5 = (var2 - arg0) * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var26 = class10.field178[var4 + var6] - class123.field2059[class56.field908 + var6 & class123.field2059.length + -1] * arg0 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class10.field178[var6++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class10.field178[var23 + var24] = 255;
                } else {
                    class10.field178[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class32.field469[var9] = class32.field469[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class32.field469[var10] = (int) (Math.sin((double) class146.field2480 / 14.0D) * 16.0D + Math.sin((double) class146.field2480 / 15.0D) * 14.0D + Math.sin((double) class146.field2480 / 16.0D) * 12.0D);
            class146.field2480++;
        }
        class104.field1615 += arg0;
        int var11 = ((arg1 & class72.field1146) + arg0) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class104.field1615; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class10.field178[(var22 << 7) + var21] = 192;
        }
        class104.field1615 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = var13 * 128;
            int var19 = 0;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var19 += class10.field178[var20 + var18 + var11];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var19 -= class10.field178[var18 + var20 - var11 - 1];
                }
                if (var20 >= 0) {
                    class189.field3246[var18 + var20] = var19 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if ((var11 + var16) < var2) {
                    var15 += class189.field3246[var14 + var17 + (var11 * 128)];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class189.field3246[var14 + var17 - var11 * 128 - 128];
                }
                if (var16 >= 0) {
                    class10.field178[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method133(int arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class217.field3738 = class243.field4368 * arg4 / arg2;
        if (arg1 != 11855) {
            return;
        }
        class28.field414 = class118.field2004 * arg0 / arg3;
        field280++;
        class82.field1291 = -1;
        class153.field2572 = -1;
        class78.method530(arg1 ^ 0xFFFFD1B0);
    }
}
