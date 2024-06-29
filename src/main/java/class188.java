import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class188 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)I")
    public static final int method1306(int arg0, int arg1) {
        field2713++;
        return arg0 <= 51 ? 24 : arg1 >>> 10;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBII)V")
    public static final void method1307(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -109) {
            method1307(27, (byte) -21, -57, -20);
        }
        field2711++;
        if (arg2 == 1012) {
            class172.method1228(10, arg0, arg3);
        } else if (arg2 == 1007) {
            class172.method1228(11, arg0, arg3);
        } else if (arg2 == 1010) {
            class172.method1228(12, arg0, arg3);
        } else if (arg2 == 1003) {
            class172.method1228(13, arg0, arg3);
        } else if (arg2 == 1002) {
            class172.method1228(14, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)V")
    public static final void method1308(boolean arg0, int arg1) {
        field2712++;
        class56.field731 = arg0;
        if (arg1 != 26) {
            method1309(-17, -19, -66, -35, -79, -32, (byte) -35);
        }
        if (!class56.field731) {
            int var2 = class75.field1068.method2266(arg1 ^ 0xE5);
            int var3 = (class213.field2982 - class75.field1068.field5048) / 16;
            class122.field1833 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var16 = 0; var16 < 4; var16++) {
                    class122.field1833[var4][var16] = class75.field1068.method2258(1177515464);
                }
            }
            int var5 = class75.field1068.method2291(-15939);
            int var6 = class75.field1068.method2304(false);
            int var7 = class75.field1068.method2266(255);
            int var8 = class75.field1068.method2277((byte) 123);
            boolean var9 = class75.field1068.method2292(true) == 1;
            int var10 = class75.field1068.method2306((byte) 48);
            class300.method1825(var10, -1);
            class204.field2902 = new byte[var3][];
            class134.field2008 = new byte[var3][];
            class446.field6256 = null;
            class143.field2083 = new byte[var3][];
            class147.field2129 = null;
            class115.field1750 = new byte[var3][];
            class15.field209 = new int[var3];
            class171.field2413 = new int[var3];
            class415.field5756 = new int[var3];
            class140.field2048 = new int[var3];
            class66.field923 = new int[var3];
            boolean var11 = false;
            if ((var6 / 8 == 48 || var6 / 8 == 49) && var7 / 8 == 48) {
                var11 = true;
            }
            if ((var6 / 8) == 48 && var7 / 8 == 148) {
                var11 = true;
            }
            int var12 = 0;
            for (int var13 = (var6 - (class11.field107 >> 4)) / 8; var13 <= ((var6 + (class11.field107 >> 4)) / 8); var13++) {
                for (int var14 = (var7 - (class264.field3620 >> 4)) / 8; var14 <= (((class264.field3620 >> 4) + var7) / 8); var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class171.field2413[var12] = var15;
                        class15.field209[var12] = -1;
                        class415.field5756[var12] = -1;
                        class140.field2048[var12] = -1;
                        class66.field923[var12] = -1;
                    } else {
                        class171.field2413[var12] = var15;
                        class15.field209[var12] = class314.field4254.method1909(-1, "m" + var13 + "_" + var14);
                        class415.field5756[var12] = class314.field4254.method1909(-1, "l" + var13 + "_" + var14);
                        class140.field2048[var12] = class314.field4254.method1909(-1, "um" + var13 + "_" + var14);
                        class66.field923[var12] = class314.field4254.method1909(class267.method1701(arg1, -27), "ul" + var13 + "_" + var14);
                    }
                    var12++;
                }
            }
            class90.method716(var8, var5, var9, false, var7, -123, var6, var2);
            return;
        }
        int var17 = class75.field1068.method2259((byte) -100);
        int var18 = class75.field1068.method2297(13352);
        boolean var19 = class75.field1068.method2277((byte) 111) == 1;
        int var20 = class75.field1068.method2266(255);
        int var21 = class75.field1068.method2304(false);
        int var22 = class75.field1068.method2292(true);
        int var23 = class75.field1068.method2304(false);
        class300.method1825(var17, -1);
        class75.field1068.method1150(arg1 ^ 0x63);
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var39 = 0; var39 < class11.field107 >> 3; var39++) {
                for (int var40 = 0; var40 < class264.field3620 >> 3; var40++) {
                    int var41 = class75.field1068.method1146((byte) -104, 1);
                    if (var41 == 1) {
                        class22.field274[var24][var39][var40] = class75.field1068.method1146((byte) -128, 26);
                    } else {
                        class22.field274[var24][var39][var40] = -1;
                    }
                }
            }
        }
        class75.field1068.method1147((byte) -76);
        int var25 = (class213.field2982 - class75.field1068.field5048) / 16;
        class122.field1833 = new int[var25][4];
        for (int var26 = 0; var26 < var25; var26++) {
            for (int var38 = 0; var38 < 4; var38++) {
                class122.field1833[var26][var38] = class75.field1068.method2258(1177515464);
            }
        }
        class446.field6256 = null;
        class415.field5756 = new int[var25];
        class66.field923 = new int[var25];
        class204.field2902 = new byte[var25][];
        class171.field2413 = new int[var25];
        class140.field2048 = new int[var25];
        class115.field1750 = new byte[var25][];
        class143.field2083 = new byte[var25][];
        class134.field2008 = new byte[var25][];
        class15.field209 = new int[var25];
        class147.field2129 = null;
        int var27 = 0;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < class11.field107 >> 3; var29++) {
                for (int var30 = 0; var30 < (class264.field3620 >> 3); var30++) {
                    int var31 = class22.field274[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = var31 >> 14 & 0x3FF;
                        int var33 = (var31 & 0x3FF8) >> 3;
                        int var34 = (var32 / 8 << 8) + var33 / 8;
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class171.field2413[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            class171.field2413[var27] = var34;
                            int var36 = (var34 & 0xFF93) >> 8;
                            int var37 = var34 & 0xFF;
                            class15.field209[var27] = class314.field4254.method1909(-1, "m" + var36 + "_" + var37);
                            class415.field5756[var27] = class314.field4254.method1909(-1, "l" + var36 + "_" + var37);
                            class140.field2048[var27] = class314.field4254.method1909(-1, "um" + var36 + "_" + var37);
                            class66.field923[var27] = class314.field4254.method1909(-1, "ul" + var36 + "_" + var37);
                            var27++;
                        }
                    }
                }
            }
        }
        class90.method716(var22, var23, var19, false, var21, arg1 ^ 0xFFFFFF9A, var18, var20);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 <= 34) {
            method1309(-72, 35, -26, 96, 120, -121, (byte) 79);
        }
        field2714++;
        if (arg5 >= class80.field1119 && arg1 <= class430.field6003 && class143.field2090 <= arg0 && arg4 <= class42.field543) {
            if (arg2 == 1) {
                class361.method2222(arg5, 4096, arg1, arg4, arg3, arg0);
            } else {
                class117.method914(arg1, arg3, 24420, arg2, arg0, arg4, arg5);
            }
        } else if (arg2 == 1) {
            class220.method1460(-17336, arg3, arg1, arg0, arg4, arg5);
        } else {
            class453.method2826(arg1, arg4, arg2, -104, arg3, arg0, arg5);
        }
    }
}
