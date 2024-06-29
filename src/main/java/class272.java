import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class272 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field4466 = 0;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lvh;")
    public static class212 field4469 = new class212(16);

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4475 = 0;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "[Lqf;")
    public static class267[] field4473 = new class267[4];

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "[I")
    public static int[] field4471 = new int[50];

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4474 = 0;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static volatile int field4476 = -1;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lmd;")
    public static class88 field4477;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1797(int arg0) {
        field4467++;
        try {
            if (class207.field3303 == null) {
                class207.field3303 = new class289(class220.field3533, class170.method1074(new class119[] { class246.method1599((byte) 120), class87.field1327 }, -106).method766((byte) 37));
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class207.field3303 = null;
        }
        int var2 = -98 / ((-arg0 - 26) / 63);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZB)V", line = 29)
    public static final void method1798(boolean arg0, byte arg1) {
        class36.field540 = arg0;
        if (class36.field540) {
            int var2 = class22.field333.method63((byte) 1);
            int var3 = class22.field333.method23(-58);
            int var4 = class22.field333.method45((byte) -126);
            int var5 = class22.field333.method54(31935);
            class22.field333.method962(8);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    for (int var8 = 0; var8 < 13; var8++) {
                        int var9 = class22.field333.method961(-105, 1);
                        if (var9 == 1) {
                            class103.field1567[var6][var7][var8] = class22.field333.method961(-105, 26);
                        } else {
                            class103.field1567[var6][var7][var8] = -1;
                        }
                    }
                }
            }
            class22.field333.method959(-89);
            int var10 = (class4.field123 - class22.field333.field44) / 16;
            class277.field4544 = new int[var10][4];
            for (int var11 = 0; var11 < var10; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    class277.field4544[var11][var12] = class22.field333.method76(true);
                }
            }
            int var13 = class22.field333.method63((byte) 1);
            class254.field4091 = null;
            class226.field3611 = new int[var10];
            class59.field960 = new int[var10];
            class150.field2382 = new int[var10];
            class49.field748 = (byte[][]) null;
            class142.field2274 = new byte[var10][];
            class204.field3240 = new byte[var10][];
            class146.field2352 = new byte[var10][];
            class1.field22 = new int[var10];
            class109.field1665 = new int[var10];
            class293.field4877 = new byte[var10][];
            int var14 = 0;
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    for (int var17 = 0; var17 < 13; var17++) {
                        int var18 = class103.field1567[var15][var16][var17];
                        if (var18 != -1) {
                            int var19 = var18 >> 3 & 0x7FF;
                            int var20 = var18 >> 14 & 0x3FF;
                            int var21 = (var20 / 8 << 8) + var19 / 8;
                            for (int var22 = 0; var22 < var14; var22++) {
                                if (class150.field2382[var22] == var21) {
                                    var21 = -1;
                                    break;
                                }
                            }
                            if (var21 != -1) {
                                class150.field2382[var14] = var21;
                                int var23 = var21 >> 8 & 0xFF;
                                int var24 = var21 & 0xFF;
                                class226.field3611[var14] = class196.field3152.method285(class170.method1074(new class119[] { class164.field2582, class234.method1506(var23, (byte) -79), class94.field1454, class234.method1506(var24, (byte) -79) }, -78), true);
                                class59.field960[var14] = class196.field3152.method285(class170.method1074(new class119[] { class193.field3091, class234.method1506(var23, (byte) -79), class94.field1454, class234.method1506(var24, (byte) -79) }, -116), true);
                                class1.field22[var14] = class196.field3152.method285(class170.method1074(new class119[] { class176.field2814, class234.method1506(var23, (byte) -79), class94.field1454, class234.method1506(var24, (byte) -79) }, -120), true);
                                class109.field1665[var14] = class196.field3152.method285(class170.method1074(new class119[] { class208.field3311, class234.method1506(var23, (byte) -79), class94.field1454, class234.method1506(var24, (byte) -79) }, -120), true);
                                var14++;
                            }
                        }
                    }
                }
            }
            class10.method105(var13, var4, var2, var3, 104, var5, false);
        } else {
            int var25 = class22.field333.method15((byte) 108);
            int var26 = (class4.field123 - class22.field333.field44) / 16;
            class277.field4544 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var28 = 0; var28 < 4; var28++) {
                    class277.field4544[var27][var28] = class22.field333.method57(-8);
                }
            }
            int var29 = class22.field333.method23(-19);
            int var30 = class22.field333.method54(31935);
            int var31 = class22.field333.method68((byte) -122);
            int var32 = class22.field333.method63((byte) 1);
            class254.field4091 = null;
            class226.field3611 = new int[var26];
            class49.field748 = (byte[][]) null;
            class1.field22 = new int[var26];
            class293.field4877 = new byte[var26][];
            class146.field2352 = new byte[var26][];
            class109.field1665 = new int[var26];
            class59.field960 = new int[var26];
            class150.field2382 = new int[var26];
            class204.field3240 = new byte[var26][];
            class142.field2274 = new byte[var26][];
            boolean var33 = false;
            int var34 = 0;
            if (((var30 / 8) == 48 || (var30 / 8) == 49) && var32 / 8 == 48) {
                var33 = true;
            }
            if (var30 / 8 == 48 && (var32 / 8) == 148) {
                var33 = true;
            }
            for (int var35 = (var30 - 6) / 8; var35 <= (var30 + 6) / 8; var35++) {
                for (int var36 = (var32 - 6) / 8; var36 <= ((var32 + 6) / 8); var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var33 && (var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || var35 == 49 && var36 == 47)) {
                        class150.field2382[var34] = var37;
                        class226.field3611[var34] = -1;
                        class59.field960[var34] = -1;
                        class1.field22[var34] = -1;
                        class109.field1665[var34] = -1;
                    } else {
                        class150.field2382[var34] = var37;
                        class226.field3611[var34] = class196.field3152.method285(class170.method1074(new class119[] { class164.field2582, class234.method1506(var35, (byte) -79), class94.field1454, class234.method1506(var36, (byte) -79) }, -90), true);
                        class59.field960[var34] = class196.field3152.method285(class170.method1074(new class119[] { class193.field3091, class234.method1506(var35, (byte) -79), class94.field1454, class234.method1506(var36, (byte) -79) }, -115), true);
                        class1.field22[var34] = class196.field3152.method285(class170.method1074(new class119[] { class176.field2814, class234.method1506(var35, (byte) -79), class94.field1454, class234.method1506(var36, (byte) -79) }, -75), true);
                        class109.field1665[var34] = class196.field3152.method285(class170.method1074(new class119[] { class208.field3311, class234.method1506(var35, (byte) -79), class94.field1454, class234.method1506(var36, (byte) -79) }, -70), true);
                    }
                    var34++;
                }
            }
            class10.method105(var30, var31, var32, var29, 104, var25, false);
        }
        field4465++;
        int var38 = 122 % ((arg1 + 73) / 50);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[B", line = 292)
    public static final byte[] method1799(int arg0, int arg1) {
        field4470++;
        if (arg0 != 20291) {
            method1798(true, (byte) -43);
        }
        class168 var2 = (class168) class96.field1468.method524((byte) 118, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class44.method342(var7, var4, arg0 - 20291);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class168(var3);
            class96.field1468.method527((long) arg1, var2, 0);
        }
        return var2.field2646;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lfj;B)Lih;", line = 356)
    public static final class74 method1800(class3 arg0, byte arg1) {
        if (arg1 != -58) {
            field4476 = -27;
        }
        field4472++;
        return new class74(arg0.method59((byte) -68), arg0.method59((byte) -68), arg0.method59((byte) -68), arg0.method59((byte) -68), arg0.method48(arg1 + 122), arg0.method48(64), arg0.method64((byte) 72));
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)I", line = 376)
    public static final int method1801(byte arg0, int arg1) {
        class68 var2 = class252.method1622(arg1, (byte) -124);
        int var3 = var2.field1055;
        field4468++;
        int var4 = var2.field1052;
        int var5 = var2.field1053;
        if (arg0 == -120) {
            int var6 = class198.field3169[var4 - var5];
            return var6 & class106.field1641[var3] >> var5;
        } else {
            return 112;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 407)
    public static void method1802(byte arg0) {
        field4471 = null;
        field4477 = null;
        if (arg0 < 19) {
            field4476 = 76;
        }
        field4469 = null;
        field4473 = null;
    }
}
