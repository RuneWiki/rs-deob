import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class335 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "[I")
    public static int[] field5122 = new int[5];

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5125 = " from your friend list first.";

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "[I")
    public static int[] field5126 = new int[32];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[[I")
    public static int[][] field5123;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z[BI[Lrk;II)V", line = 14)
    public static final void method2355(boolean arg0, byte[] arg1, int arg2, class290[] arg3, int arg4, int arg5) {
        class25 var6 = new class25(arg1);
        field5121++;
        int var7 = -1;
        if (arg2 != 16884) {
            field5125 = (String) null;
        }
        while (true) {
            int var8 = var6.method308((byte) -67);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method270(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 >> 6 & 0x3F;
                int var14 = var6.method281(27);
                int var15 = var14 & 0x3;
                int var16 = var14 >> 2;
                int var17 = arg5 + var13;
                int var18 = arg4 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class290 var19 = null;
                    if (!arg0) {
                        int var20 = var12;
                        if ((class146.field2386[1][var17][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class204.method1525(arg2 + 2446, var7, var16, !arg0, var18, var12, var12, var17, arg0, var15, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 88)
    public static final void method2356(int arg0) {
        field5124++;
        if (class129.field2139 == 0) {
            return;
        }
        if (arg0 <= 30) {
            method2355(false, (byte[]) null, 54, (class290[]) null, -69, 57);
        }
        try {
            if ((++class150.field2455) > 2000) {
                if (class188.field2950 != null) {
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                }
                if (class113.field1738 >= 1) {
                    class135.field2261 = -5;
                    class129.field2139 = 0;
                    return;
                }
                class113.field1738++;
                if (class301.field4681 == class207.field3188) {
                    class301.field4681 = class66.field1011;
                } else {
                    class301.field4681 = class207.field3188;
                }
                class129.field2139 = 1;
                class150.field2455 = 0;
            }
            if (class129.field2139 == 1) {
                class207.field3180 = class340.field5234.method2288(class166.field2643, class301.field4681, -125);
                class129.field2139 = 2;
            }
            if (class129.field2139 == 2) {
                if (class207.field3180.field1447 == 2) {
                    throw new IOException();
                }
                if (class207.field3180.field1447 != 1) {
                    return;
                }
                class188.field2950 = new class344((Socket) class207.field3180.field1446, class340.field5234);
                class207.field3180 = null;
                class188.field2950.method2426(0, -28332, class99.field1491.field448, class99.field1491.field397);
                if (class94.field1434 != null) {
                    class94.field1434.method1874(0);
                }
                if (class68.field1048 != null) {
                    class68.field1048.method1874(0);
                }
                int var1 = class188.field2950.method2423(false);
                if (class94.field1434 != null) {
                    class94.field1434.method1874(0);
                }
                if (class68.field1048 != null) {
                    class68.field1048.method1874(0);
                }
                if (var1 != 21) {
                    class129.field2139 = 0;
                    class135.field2261 = var1;
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                    return;
                }
                class129.field2139 = 3;
            }
            if (class129.field2139 == 3) {
                if (class188.field2950.method2424((byte) 21) < 1) {
                    return;
                }
                class36.field538 = new String[class188.field2950.method2423(false)];
                class129.field2139 = 4;
            }
            if (class129.field2139 == 4) {
                if (class188.field2950.method2424((byte) 21) < class36.field538.length * 8) {
                    return;
                }
                class244.field3803.field397 = 0;
                class188.field2950.method2428(class36.field538.length * 8, class244.field3803.field448, (byte) 69, 0);
                for (int var2 = 0; var2 < class36.field538.length; var2++) {
                    class36.field538[var2] = class233.method1744(class244.field3803.method266(46), (byte) -86);
                }
                class129.field2139 = 0;
                class135.field2261 = 21;
                class188.field2950.method2429(false);
                class188.field2950 = null;
                return;
            }
        } catch (IOException var4) {
            if (class188.field2950 != null) {
                class188.field2950.method2429(false);
                class188.field2950 = null;
            }
            if (class113.field1738 >= 1) {
                class135.field2261 = -4;
                class129.field2139 = 0;
            } else {
                class150.field2455 = 0;
                if (class301.field4681 == class207.field3188) {
                    class301.field4681 = class66.field1011;
                } else {
                    class301.field4681 = class207.field3188;
                }
                class113.field1738++;
                class129.field2139 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 245)
    public static void method2357(byte arg0) {
        field5126 = null;
        field5123 = (int[][]) null;
        field5122 = null;
        if (arg0 > -93) {
            field5123 = (int[][]) ((int[][]) null);
        }
        field5125 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILbg;ZIZ)V", line = 278)
    public static final void method2358(int arg0, int arg1, class93 arg2, boolean arg3, int arg4, boolean arg5) {
        field5127++;
        if (class181.field2851 >= 50 || arg2 == null || arg2.field1418 == null || arg1 >= arg2.field1418.length || arg2.field1418[arg1] == null) {
            return;
        }
        int var6 = arg2.field1418[arg1][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 5 & 0x7;
        if (arg2.field1418[arg1].length > 1) {
            int var9 = (int) (Math.random() * (double) arg2.field1418[arg1].length);
            if (var9 > 0) {
                var7 = arg2.field1418[arg1][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg3) {
                class62.method621(var8, 0, var7, 255, 0);
            }
        } else if (class287.field4454 != 0) {
            if (!arg5) {
                field5125 = (String) null;
            }
            class173.field2745[class181.field2851] = var7;
            int var11 = (arg0 - 64) / 128;
            class192.field3023[class181.field2851] = var8;
            class228.field3557[class181.field2851] = 0;
            class201.field3108[class181.field2851] = null;
            class43.field694[class181.field2851] = 255;
            int var12 = (arg4 - 64) / 128;
            class297.field4618[class181.field2851] = (var11 << 16) - (-(var12 << 8) - var10);
            class181.field2851++;
        }
    }
}
