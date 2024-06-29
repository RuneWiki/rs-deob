import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class371 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field5065;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "[I")
    public static int[] field5066;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[B)Lbu;", line = 5)
    public static final class142 method2160(int arg0, byte[] arg1) {
        field5064++;
        class142 var2 = new class142();
        class115 var3 = new class115(arg1);
        var3.field1218 = var3.field1269.length - 2;
        int var4 = var3.method643((byte) -77);
        int var5 = var3.field1269.length - var4 - 12 - 2;
        var3.field1218 = var5;
        int var6 = var3.method631(false);
        var2.field1565 = var3.method643((byte) -77);
        var2.field1564 = var3.method643((byte) -77);
        if (arg0 > -87) {
            return null;
        }
        var2.field1569 = var3.method643((byte) -77);
        var2.field1573 = var3.method643((byte) -77);
        int var7 = var3.method620((byte) -126);
        if (var7 > 0) {
            var2.field1571 = new class661[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method643((byte) -77);
                class661 var10 = new class661(class553.method3138(1781323777, var9));
                var2.field1571[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method631(false);
                    int var12 = var3.method631(false);
                    var10.method3671(false, new class22(var12), (long) var11);
                }
            }
        }
        var3.field1218 = 0;
        var2.field1561 = var3.method613((byte) -18);
        var2.field1563 = new int[var6];
        var2.field1562 = new int[var6];
        var2.field1560 = new String[var6];
        int var13 = 0;
        while (var3.field1218 < var5) {
            int var14 = var3.method643((byte) -77);
            if (var14 == 3) {
                var2.field1560[var13] = var3.method626(88).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1562[var13] = var3.method620((byte) 41);
            } else {
                var2.field1562[var13] = var3.method631(false);
            }
            var2.field1563[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;", line = 89)
    public static final String method2161(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (!arg0) {
            method2161(true, 58, null, -96);
        }
        field5063++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg1;
        int var7 = arg1 + arg3;
        while (var7 > var6) {
            int var8 = arg2[var6++] & 0xFF;
            int var9;
            if (var8 < 128) {
                if (var8 == 0) {
                    var9 = 65533;
                } else {
                    var9 = var8;
                }
            } else if (var8 < 192) {
                var9 = 65533;
            } else if (var8 < 224) {
                if (var7 > var6 && (arg2[var6] & 0xC0) == 128) {
                    var9 = arg2[var6++] & 0x3F | var8 & 0x1F << 6;
                    if (var9 < 128) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 < 240) {
                if (var6 + 1 < var7 && (arg2[var6] & 0xC0) == 128 && (arg2[var6 + 1] & 0xC0) == 128) {
                    var9 = (var8 & 0xF) << 12 | (arg2[var6++] & 0x3F) << 6 | arg2[var6++] & 0x3F;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 >= 248) {
                var9 = 65533;
            } else if ((var6 + 2) < var7 && (arg2[var6] & 0xC0) == 128 && (arg2[var6 + 1] & 0xC0) == 128 && (arg2[var6 + 2] & 0xC0) == 128) {
                int var10 = (var8 & 0x7) << 18 | (arg2[var6++] & 0x3F) << 12 | (arg2[var6++] & 0x3F) << 6 | arg2[var6++] & 0x3F;
                if (var10 >= 65536 && var10 <= 1114111) {
                    var9 = 65533;
                } else {
                    var9 = 65533;
                }
            } else {
                var9 = 65533;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lrb;IIIII)V", line = 180)
    public static final void method2162(class383 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class612.field8618 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class122.field1369) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class247.field3058 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class499 var14 = class487.field7044[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class156.field1743[var11].method1608(var13, 840, var12) + class156.field1743[var11].method1608(var13, 840, var12 + 1) + class156.field1743[var11].method1608(var13 + 1, 840, var12) + class156.field1743[var11].method1608(var13 + 1, 840, var12 + 1)) / 4 - (class156.field1743[arg1].method1608(arg3, 840, arg2) + class156.field1743[arg1].method1608(arg3, 840, arg2 + 1) + class156.field1743[arg1].method1608(arg3 + 1, 840, arg2) + class156.field1743[arg1].method1608(arg3 + 1, 840, arg2 + 1)) / 4;
                                    class465 var16 = var14.field7218;
                                    class465 var17 = var14.field7223;
                                    if (var16 != null && var16.method183((byte) -91)) {
                                        arg0.method184(var15, (var12 - arg2) * class171.field1904 + (1 - arg4) * class291.field3640, 2, (var13 - arg3) * class171.field1904 + (1 - arg5) * class291.field3640, var16, class568.field8078, var6);
                                    }
                                    if (var17 != null && var17.method183((byte) 74)) {
                                        arg0.method184(var15, (var12 - arg2) * class171.field1904 + (1 - arg4) * class291.field3640, 2, (var13 - arg3) * class171.field1904 + (1 - arg5) * class291.field3640, var17, class568.field8078, var6);
                                    }
                                    for (class245 var18 = var14.field7215; var18 != null; var18 = var18.field3027) {
                                        class613 var19 = var18.field3029;
                                        if (var19 != null && var19.method183((byte) 124) && (var19.field8635 == var12 || var7 == var12) && (var19.field8627 == var13 || var9 == var13)) {
                                            int var20 = var19.field8634 + 1 - var19.field8635;
                                            int var21 = var19.field8630 + 1 - var19.field8627;
                                            arg0.method184(var15, (var19.field8635 - arg2) * class171.field1904 + (var20 - arg4) * class291.field3640, 2, (var19.field8627 - arg3) * class171.field1904 + (var21 - arg5) * class291.field3640, var19, class568.field8078, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 269)
    public static void method2163(int arg0) {
        if (arg0 == -28883) {
            field5065 = null;
            field5066 = null;
        }
    }
}
