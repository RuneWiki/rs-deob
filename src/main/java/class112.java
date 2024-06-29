import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class112 extends class183 {

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1530 = " ";

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1532 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field1537 = 0;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "B")
    public byte field1528;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Ljava/lang/String;")
    public String field1535;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Ljava/lang/String;")
    public String field1536;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "[I")
    public static int[] field1531;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[B", line = 13)
    public static final byte[] method825(int arg0, int arg1) {
        class135 var2 = (class135) class143.field1960.method365((long) arg0, 35);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class175.method1217((byte) 122, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class135(var3);
            class143.field1960.method369(0, var2, (long) arg0);
        }
        int var10 = -106 / ((arg1 - 5) / 62);
        field1538++;
        return var2.field1860;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 63)
    public static final void method826(int arg0) {
        class269.field3997 = null;
        class141.field1935 = null;
        class216.field3090 = null;
        class37.field426 = null;
        class312.field4716 = null;
        class332.field4999 = null;
        class286.field4252 = null;
        class6.field53 = null;
        field1533++;
        class63.field819 = null;
        class293.field4360 = null;
        class241.field3438 = null;
        class77.field1089 = null;
        class35.field406 = null;
        if (arg0 != 25212) {
            method827((byte[]) null, -12, (class72[]) null, -70, (byte) 115, -85, false, 64);
        }
        class148.field2056 = null;
        class208.field2998 = null;
        class109.field1480 = null;
        class153.field2127 = null;
        class289.field4312 = null;
        class204.field2946 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BI[Lla;IBIZI)[I", line = 103)
    public static final int[] method827(byte[] arg0, int arg1, class72[] arg2, int arg3, byte arg4, int arg5, boolean arg6, int arg7) {
        if (!arg6) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg7 + var9 > 0 && (arg7 + var9) < 103 && (arg1 + var10) > 0 && (arg1 + var10) < 103) {
                            arg2[var8].field988[arg7 + var9][arg1 + var10] = class47.method303(arg2[var8].field988[arg7 + var9][arg1 + var10], -2097153);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg6) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        field1534++;
        class316 var12 = new class316(arg0);
        int var13 = arg5 + arg7;
        if (arg4 <= 94) {
            method825(-120, -101);
        }
        int var14 = arg1 + arg3;
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class252.method1716(0, 0, false, true, arg7 + var16, var13 + var16, var14 + var17, arg1 + var17, var12, 0, arg6, var15);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var12.field4777 < var12.field4798.length) {
            int var20 = var12.method2219(16448);
            if (var20 == 128) {
                class201.field2862[0] = var12.method2220((byte) 96);
                var18 = true;
                class201.field2862[1] = var12.method2161(28984);
                class201.field2862[2] = var12.method2161(28984);
                class201.field2862[3] = var12.method2161(28984);
                class201.field2862[4] = var12.method2220((byte) 59);
            } else {
                if (var20 != 129) {
                    var12.field4777--;
                    break;
                }
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method2192(3);
                    if (var22 == 0) {
                        int var32 = arg7;
                        if (arg7 < 0) {
                            var32 = 0;
                        } else if (arg7 >= 104) {
                            var32 = 104;
                        }
                        int var33 = arg1;
                        int var34 = arg7 + 64;
                        if (var34 < 0) {
                            var34 = 0;
                        } else if (var34 >= 104) {
                            var34 = 104;
                        }
                        if (arg1 < 0) {
                            var33 = 0;
                        } else if (arg1 >= 104) {
                            var33 = 104;
                        }
                        int var35 = arg1 + 64;
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        while (var34 > var32) {
                            while (var33 < var35) {
                                class307.field4599[var21][var32][var33] = 0;
                                var33++;
                            }
                            var32++;
                        }
                    } else if (var22 == 1) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            for (int var24 = 0; var24 < 64; var24 += 4) {
                                byte var25 = var12.method2192(3);
                                for (int var26 = arg7 + var23; var26 < arg7 + var23 + 4; var26++) {
                                    for (int var27 = var24 + arg1; var27 < arg1 + var24 + 4; var27++) {
                                        if (var26 >= 0 && var26 < 104 && var27 >= 0 && var27 < 104) {
                                            class307.field4599[var21][var26][var27] = var25;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var28 = arg7;
                        int var29 = arg7 + 64;
                        int var30 = arg1;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        if (arg7 < 0) {
                            var28 = 0;
                        } else if (arg7 >= 104) {
                            var28 = 104;
                        }
                        if (arg1 < 0) {
                            var30 = 0;
                        } else if (arg1 >= 104) {
                            var30 = 104;
                        }
                        int var31 = arg1 + 64;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        while (var29 > var28) {
                            while (var31 > var30) {
                                class307.field4599[var21][var28][var30] = class307.field4599[var21 - 1][var28][var30];
                                var30++;
                            }
                            var28++;
                        }
                    }
                }
                var19 = true;
            }
        }
        if (class67.field908 && !arg6) {
            class85 var36 = null;
            label294: while (true) {
                int var38;
                label287: do {
                    while (true) {
                        while (var12.field4798.length > var12.field4777) {
                            int var37 = var12.method2219(16448);
                            if (var37 == 0) {
                                var36 = new class85(var12);
                            } else {
                                if (var37 == 1) {
                                    var38 = var12.method2219(16448);
                                    continue label287;
                                }
                                if (var37 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var36 == null) {
                                    var36 = new class85();
                                }
                                var36.method660(var12, -25667);
                            }
                        }
                        if (var36 == null) {
                            var36 = new class85();
                        }
                        for (int var44 = 0; var44 < 8; var44++) {
                            for (int var45 = 0; var45 < 8; var45++) {
                                int var46 = (arg7 >> 3) + var44;
                                int var47 = (arg1 >> 3) + var45;
                                if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                                    class181.field2431[var46][var47] = var36;
                                }
                            }
                        }
                        break label294;
                    }
                } while (var38 <= 0);
                for (int var39 = 0; var39 < var38; var39++) {
                    class270 var40 = new class270(var12);
                    if (var40.field4019 == 31) {
                        class141 var41 = class243.method1672(var12.method2220((byte) 82), 31);
                        var40.method1856(-1870576501, var41.field1934, var41.field1925, var41.field1932, var41.field1923);
                    }
                    var40.field4025 += arg7 << 7;
                    int var42 = var40.field4025 >> 7;
                    var40.field4008 += arg1 << 7;
                    int var43 = var40.field4008 >> 7;
                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                        var40.field4029 = (class240.field3406[1][var42][var43] & 0x2) != 0;
                        var40.field4000 = class333.field5020[var40.field4010][var42][var43] - var40.field4000;
                        class147.method1071(var40);
                    }
                }
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg7 >> 2) + var49;
                        int var52 = (arg1 >> 2) + var50;
                        if (var51 >= 0 && var51 < 26 && var52 >= 0 && var52 < 26) {
                            class307.field4599[var48][var51][var52] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class201.field2862 : null;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)V", line = 521)
    public static void method828(byte arg0) {
        field1530 = null;
        int var1 = -106 % ((-arg0 - 43) / 57);
        field1531 = null;
        field1532 = null;
    }
}
