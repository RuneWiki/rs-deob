import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class296 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4758 = 0;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field4759 = 0;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field4764 = 0;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
    public static int[] field4766 = new int[32];

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field4763 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "B")
    public static byte field4757;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lhd;")
    public class161 field4765;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lwc;")
    public static class185 field4761;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Llb;")
    public class341 field4762;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lth;")
    public static class57 field4756;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 9)
    public static void method2124(byte arg0) {
        int var1 = 124 / ((-arg0 - 57) / 32);
        field4756 = null;
        field4761 = null;
        field4766 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZ)V", line = 46)
    public static final void method2125(byte arg0, boolean arg1) {
        if (arg0 != -105) {
            field4766 = (int[]) null;
        }
        class294.field4746 = arg1;
        field4760++;
        if (!class294.field4746) {
            int var2 = class29.field383.method1759(-26608);
            boolean var3 = class20.method113(true, class29.field383.method1750(17852));
            int var4 = class29.field383.method1759(-26608);
            int var5 = class29.field383.method1720((byte) -44);
            int var6 = class29.field383.method1759(-26608);
            int var7 = class29.field383.method1765(true);
            int var8 = (class223.field3706 - class29.field383.field3760) / 16;
            class300.field4827 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var10 = 0; var10 < 4; var10++) {
                    class300.field4827[var9][var10] = class29.field383.method1766(119);
                }
            }
            class121.field2079 = new int[var8];
            class310.field4951 = new int[var8];
            class24.field295 = (byte[][]) null;
            class227.field3786 = new byte[var8][];
            class137.field2275 = null;
            class46.field749 = new int[var8];
            class133.field2247 = new int[var8];
            class160.field2546 = new byte[var8][];
            class352.field5584 = new byte[var8][];
            boolean var11 = false;
            class340.field5434 = new int[var8];
            if (((var4 / 8) == 48 || (var4 / 8) == 49) && var7 / 8 == 48) {
                var11 = true;
            }
            class16.field190 = new byte[var8][];
            if ((var4 / 8) == 48 && var7 / 8 == 148) {
                var11 = true;
            }
            int var12 = 0;
            for (int var13 = (var4 - 6) / 8; var13 <= (var4 + 6) / 8; var13++) {
                for (int var14 = (var7 - 6) / 8; var14 <= ((var7 + 6) / 8); var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class121.field2079[var12] = var15;
                        class46.field749[var12] = -1;
                        class310.field4951[var12] = -1;
                        class340.field5434[var12] = -1;
                        class133.field2247[var12] = -1;
                    } else {
                        class121.field2079[var12] = var15;
                        class46.field749[var12] = class340.field5425.method483(-1, "m" + var13 + "_" + var14);
                        class310.field4951[var12] = class340.field5425.method483(class141.method1087(arg0, 104), "l" + var13 + "_" + var14);
                        class340.field5434[var12] = class340.field5425.method483(-1, "um" + var13 + "_" + var14);
                        class133.field2247[var12] = class340.field5425.method483(arg0 + 104, "ul" + var13 + "_" + var14);
                    }
                    var12++;
                }
            }
            class89.method705(var5, var2, var3, var4, -17690, var7, var6, false);
            return;
        }
        boolean var16 = class20.method113(true, class29.field383.method1748(3));
        int var17 = class29.field383.method1763((byte) 79);
        int var18 = class29.field383.method1762((byte) 17);
        int var19 = class29.field383.method1765(true);
        int var20 = class29.field383.method1763((byte) 73);
        class29.field383.method2231(-113);
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class29.field383.method2227(arg0 ^ 0x6BFD, 1);
                    if (var24 == 1) {
                        class267.field4476[var21][var22][var23] = class29.field383.method2227(-27542, 26);
                    } else {
                        class267.field4476[var21][var22][var23] = -1;
                    }
                }
            }
        }
        class29.field383.method2232(0);
        int var25 = (class223.field3706 - class29.field383.field3760) / 16;
        class300.field4827 = new int[var25][4];
        for (int var26 = 0; var26 < var25; var26++) {
            for (int var27 = 0; var27 < 4; var27++) {
                class300.field4827[var26][var27] = class29.field383.method1724(76);
            }
        }
        int var28 = class29.field383.method1765(true);
        class46.field749 = new int[var25];
        class160.field2546 = new byte[var25][];
        class121.field2079 = new int[var25];
        class227.field3786 = new byte[var25][];
        class16.field190 = new byte[var25][];
        class24.field295 = (byte[][]) null;
        class352.field5584 = new byte[var25][];
        class340.field5434 = new int[var25];
        class137.field2275 = null;
        class310.field4951 = new int[var25];
        class133.field2247 = new int[var25];
        int var29 = 0;
        for (int var30 = 0; var30 < 4; var30++) {
            for (int var31 = 0; var31 < 13; var31++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class267.field4476[var30][var31][var32];
                    if (var33 != -1) {
                        int var34 = (var33 & 0xFFF0E2) >> 14;
                        int var35 = (var33 & 0x3FFA) >> 3;
                        int var36 = (var34 / 8 << 8) + (var35 / 8);
                        for (int var37 = 0; var37 < var29; var37++) {
                            if (class121.field2079[var37] == var36) {
                                var36 = -1;
                                break;
                            }
                        }
                        if (var36 != -1) {
                            class121.field2079[var29] = var36;
                            int var38 = var36 >> 8 & 0xFF;
                            int var39 = var36 & 0xFF;
                            class46.field749[var29] = class340.field5425.method483(arg0 + 104, "m" + var38 + "_" + var39);
                            class310.field4951[var29] = class340.field5425.method483(arg0 + 104, "l" + var38 + "_" + var39);
                            class340.field5434[var29] = class340.field5425.method483(arg0 + 104, "um" + var38 + "_" + var39);
                            class133.field2247[var29] = class340.field5425.method483(-1, "ul" + var38 + "_" + var39);
                            var29++;
                        }
                    }
                }
            }
        }
        class89.method705(var18, var19, var16, var17, arg0 - 17585, var20, var28, false);
    }
}
