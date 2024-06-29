import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class106 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lqe;")
    public static class179 field1981 = class206.method1380("scape main", (byte) -128);

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Ldc;")
    public static class36 field1983 = new class36();

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lee;")
    public static class49 field1986;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method690(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg9 && arg3 == arg8 && arg0 == arg7 && arg4 == arg6) {
            class81.method520(arg9, arg0, arg1 ^ 0x20, arg8, arg4, arg2);
        } else {
            int var10 = arg9;
            int var11 = arg8;
            int var12 = arg9 * 3;
            int var13 = arg8 * 3;
            int var14 = arg5 * 3;
            int var15 = arg3 * 3;
            int var16 = arg6 * 3;
            int var17 = arg7 * 3;
            int var18 = arg0 + var14 - arg9 - var17;
            int var19 = var15 + arg4 - arg8 - var16;
            int var20 = var17 + var12 - var14 - var14;
            int var21 = var16 + var13 - var15 - var15;
            int var22 = var15 - var13;
            int var23 = var14 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var30 + var32 >> 12) + arg9;
                int var34 = (var28 + var29 + var31 >> 12) + arg8;
                class81.method520(var10, var33, 117, var11, var34, arg2);
                var10 = var33;
                var11 = var34;
            }
        }
        field1989++;
        if (arg1 != 113) {
            field1984 = 13;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -1412584499) {
            method691(-101, -115, -47, 73, -89, 16, 73, -27, 56);
        }
        field1988++;
        if (class152.method976(true, arg0)) {
            class206.field3843 = null;
            class176.method1113(arg8, arg1, arg6, arg5, class199.field3710[arg0], arg7, 32763, arg4, -1, arg2);
            if (class206.field3843 != null) {
                class176.method1113(arg8, arg1, class240.field4422, class114.field2135, class206.field3843, arg7, 32763, arg4, -1412584499, arg2);
                class206.field3843 = null;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class143.field2592[var9] = true;
            }
        } else {
            class143.field2592[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public static void method692(boolean arg0) {
        field1986 = null;
        if (arg0) {
            method693(64, -12);
        }
        field1983 = null;
        field1981 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Lag;")
    public static final class8 method693(int arg0, int arg1) {
        if (arg0 >= -127) {
            return null;
        }
        field1982++;
        class8 var2 = (class8) class131.field2375.method1299((byte) 23, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class152.field2763.method342(class193.method1295((byte) -54, arg1), class138.method877(arg1, (byte) 98), (byte) -40);
        class8 var4 = new class8();
        if (var3 != null) {
            var4.method52((byte) 64, new class185(var3));
        }
        class131.field2375.method1303(var4, (long) arg1, (byte) -92);
        return var4;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([BI)V")
    public static final void method694(byte[] arg0, int arg1) {
        int var2 = 0;
        field1987++;
        if (arg1 != -1) {
            return;
        }
        while (true) {
            while (arg0.length > var2) {
                int var3 = arg0[var2++] * 64 - class176.field3209;
                int var4 = arg0[var2++] * 64 - class66.field1350;
                if (var3 > 0 && var4 > 0 && class146.field2655 > var3 + 64 && class202.field3736 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = class202.field3736 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if ((var9 & 0x1) == 1) {
                                    byte var10 = arg0[var2++];
                                    if (class90.field1696[var5][var6] == null) {
                                        class90.field1696[var5][var6] = new byte[4096];
                                    }
                                    class90.field1696[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) var10;
                                }
                                if ((var9 & 0x2) == 2) {
                                    byte var11 = arg0[var2++];
                                    if (class188.field3502[var5][var6] == null) {
                                        class188.field3502[var5][var6] = new byte[4096];
                                    }
                                    class188.field3502[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) (var11 - 28);
                                }
                                if ((var9 & 0x4) == 4) {
                                    var2 += 3;
                                    int var12 = ((arg0[var2 - 2] & 0xFF) << 8) + ((arg0[var2 - 3] & 0xFF) << 16) + (arg0[var2 + -1] & 0xFF);
                                    if (class32.field687[var5][var6] == null) {
                                        class32.field687[var5][var6] = new int[4096];
                                    }
                                    var12--;
                                    class134 var13 = class114.method735((byte) -77, var12);
                                    if (var13.field2479 != null) {
                                        var13 = var13.method860(arg1 - 122);
                                        if (var13 == null || var13.field2423 == -1) {
                                            continue;
                                        }
                                    }
                                    class32.field687[var5][var6][(-(var8 + 1) << 6) + var7] = var13.field2461 + 1;
                                    class66 var14 = new class66();
                                    var14.field1338 = var13.field2423;
                                    var14.field1336 = class202.field3736 - var4;
                                    var14.field1351 = var3;
                                    field1983.method235(-72, var14);
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < 64; var15++) {
                        for (int var16 = -64; var16 < 0; var16++) {
                            byte var17 = arg0[var2++];
                            if (var17 != 0) {
                                if ((var17 & 0x1) == 1) {
                                    var2++;
                                }
                                if ((var17 & 0x2) == 2) {
                                    var2++;
                                }
                                if ((var17 & 0x4) == 4) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
