import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class190 {

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field3454 = 0;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[[[B")
    public static byte[][][] field3449;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1349(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBI)V", line = 19)
    public static final void method1350(int arg0, int arg1, byte arg2, int arg3) {
        field3450++;
        class120 var4 = class248.method1704(9, 113, arg0);
        var4.method844((byte) -28);
        var4.field2066 = arg3;
        var4.field2067 = arg1;
        if (arg2 != 99) {
            field3453 = -28;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 38)
    public static void method1351(int arg0) {
        field3449 = (byte[][][]) null;
        if (arg0 > -123) {
            field3454 = 43;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZ)V", line = 68)
    public static final void method1352(boolean arg0, boolean arg1) {
        class304.field5277 = arg0;
        if (class304.field5277) {
            int var2 = class293.field5127.method1726(-17356);
            int var3 = class293.field5127.method1726(-17356);
            int var4 = class293.field5127.method1725(-96);
            int var5 = class293.field5127.method1755(!arg1);
            class293.field5127.method1429(false);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    for (int var8 = 0; var8 < 13; var8++) {
                        int var9 = class293.field5127.method1431((byte) -94, 1);
                        if (var9 == 1) {
                            class134.field2325[var6][var7][var8] = class293.field5127.method1431((byte) -94, 26);
                        } else {
                            class134.field2325[var6][var7][var8] = -1;
                        }
                    }
                }
            }
            class293.field5127.method1430(-21016);
            int var10 = (class191.field3471 - class293.field5127.field4314) / 16;
            class242.field4214 = new int[var10][4];
            for (int var11 = 0; var11 < var10; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    class242.field4214[var11][var12] = class293.field5127.method1738(-1756395344);
                }
            }
            int var13 = class293.field5127.method1752((byte) 80);
            class183.field3359 = new int[var10];
            class57.field838 = new int[var10];
            class251.field4376 = new byte[var10][];
            class322.field5505 = new int[var10];
            class129.field2216 = new byte[var10][];
            class186.field3425 = null;
            client.field4529 = (byte[][]) null;
            class322.field5513 = new byte[var10][];
            class144.field2539 = new byte[var10][];
            class242.field4208 = new int[var10];
            class237.field4152 = new int[var10];
            int var14 = 0;
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    for (int var17 = 0; var17 < 13; var17++) {
                        int var18 = class134.field2325[var15][var16][var17];
                        if (var18 != -1) {
                            int var19 = var18 >> 3 & 0x7FF;
                            int var20 = var18 >> 14 & 0x3FF;
                            int var21 = (var20 / 8 << 8) + var19 / 8;
                            for (int var22 = 0; var22 < var14; var22++) {
                                if (class57.field838[var22] == var21) {
                                    var21 = -1;
                                    break;
                                }
                            }
                            if (var21 != -1) {
                                class57.field838[var14] = var21;
                                int var23 = (var21 & 0xFF99) >> 8;
                                int var24 = var21 & 0xFF;
                                class322.field5505[var14] = class247.field4277.method1887(-1, class117.method833(new class108[] { class45.field652, class79.method518(false, var23), class131.field2247, class79.method518(false, var24) }, false));
                                class237.field4152[var14] = class247.field4277.method1887(-1, class117.method833(new class108[] { class141.field2479, class79.method518(arg1, var23), class131.field2247, class79.method518(false, var24) }, false));
                                class242.field4208[var14] = class247.field4277.method1887(-1, class117.method833(new class108[] { class135.field2334, class79.method518(false, var23), class131.field2247, class79.method518(arg1, var24) }, false));
                                class183.field3359[var14] = class247.field4277.method1887(-1, class117.method833(new class108[] { class233.field4131, class79.method518(false, var23), class131.field2247, class79.method518(false, var24) }, false));
                                var14++;
                            }
                        }
                    }
                }
            }
            class229.method1538(false, var13, 28353, var3, var2, var4, var5);
        } else {
            int var25 = class293.field5127.method1725(-125);
            int var26 = (class191.field3471 - class293.field5127.field4314) / 16;
            class242.field4214 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var28 = 0; var28 < 4; var28++) {
                    class242.field4214[var27][var28] = class293.field5127.method1717(-126);
                }
            }
            int var29 = class293.field5127.method1752((byte) 48);
            int var30 = class293.field5127.method1726(-17356);
            boolean var31 = false;
            int var32 = class293.field5127.method1755(!arg1);
            int var33 = class293.field5127.method1725(-110);
            class57.field838 = new int[var26];
            client.field4529 = (byte[][]) null;
            class129.field2216 = new byte[var26][];
            class237.field4152 = new int[var26];
            class144.field2539 = new byte[var26][];
            class322.field5505 = new int[var26];
            class322.field5513 = new byte[var26][];
            class186.field3425 = null;
            class242.field4208 = new int[var26];
            class183.field3359 = new int[var26];
            class251.field4376 = new byte[var26][];
            int var34 = 0;
            if ((var33 / 8 == 48 || (var33 / 8) == 49) && (var29 / 8) == 48) {
                var31 = true;
            }
            if ((var33 / 8) == 48 && (var29 / 8) == 148) {
                var31 = true;
            }
            for (int var35 = (var33 - 6) / 8; var35 <= ((var33 + 6) / 8); var35++) {
                for (int var36 = (var29 - 6) / 8; var36 <= ((var29 + 6) / 8); var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var31 && var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || !(var35 != 49 || var36 != 47)) {
                        class57.field838[var34] = var37;
                        class322.field5505[var34] = -1;
                        class237.field4152[var34] = -1;
                        class242.field4208[var34] = -1;
                        class183.field3359[var34] = -1;
                    } else {
                        class57.field838[var34] = var37;
                        class322.field5505[var34] = class247.field4277.method1887(-1, class117.method833(new class108[] { class45.field652, class79.method518(false, var35), class131.field2247, class79.method518(arg1, var36) }, false));
                        class237.field4152[var34] = class247.field4277.method1887(-1, class117.method833(new class108[] { class141.field2479, class79.method518(false, var35), class131.field2247, class79.method518(arg1, var36) }, false));
                        class242.field4208[var34] = class247.field4277.method1887(-1, class117.method833(new class108[] { class135.field2334, class79.method518(false, var35), class131.field2247, class79.method518(false, var36) }, false));
                        class183.field3359[var34] = class247.field4277.method1887(-1, class117.method833(new class108[] { class233.field4131, class79.method518(false, var35), class131.field2247, class79.method518(false, var36) }, false));
                    }
                    var34++;
                }
            }
            class229.method1538(false, var33, 28353, var29, var30, var25, var32);
        }
        if (arg1) {
            method1352(false, true);
        }
        field3451++;
    }
}
