import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class156 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2505 = new CRC32();

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2507 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Ljj;")
    public static class134 field2508;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[[[Lpk;")
    public static class99[][][] field2506;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method1046(int arg0) {
        while (class121.field2039 >= 2048.0F) {
            class121.field2039 -= 2048.0F;
        }
        field2502++;
        if (client.field3605 < 128.0F) {
            client.field3605 = 128.0F;
        }
        if (client.field3605 > 383.0F) {
            client.field3605 = 383.0F;
        }
        while (class121.field2039 < 0.0F) {
            class121.field2039 += 2048.0F;
        }
        int var1 = class291.field4635 >> 7;
        int var2 = class140.field2296 >> 7;
        int var3 = class220.method1461(class291.field4635, class28.field336, class140.field2296, 31);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class28.field336;
                    if (var7 < 3 && (class134.field2251[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class79.field1091[var7][var5][var6] & 0xFF) * 8 + var3 - class229.field3641[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        if (arg0 < 41) {
            method1047(-28, -28, -42, -103, -70, -86, 123, 0);
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class138.field2280) {
            class138.field2280 += (var9 - class138.field2280) / 24;
        } else if (var9 < class138.field2280) {
            class138.field2280 += (var9 - class138.field2280) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= 0 && arg4 >= 0 && arg0 < 103 && arg4 < 103) {
            if (arg1 == 0) {
                class233 var8 = class87.method615(arg5, arg0, arg4);
                if (var8 != null) {
                    int var9 = (int) (var8.field3719 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 2) {
                        var8.field3709 = new class287(var9, 2, arg7 + 4, arg5, arg0, arg4, arg6, false, var8.field3709);
                        var8.field3716 = new class287(var9, 2, arg7 + 1 & 0x3, arg5, arg0, arg4, arg6, false, var8.field3716);
                    } else {
                        var8.field3709 = new class287(var9, arg3, arg7, arg5, arg0, arg4, arg6, false, var8.field3709);
                    }
                }
            }
            if (arg1 == 1) {
                class195 var10 = class278.method1861(arg5, arg0, arg4);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field3157 >>> 32);
                    if (arg3 == 4 || arg3 == 5) {
                        var10.field3149 = new class287(var11, 4, arg7, arg5, arg0, arg4, arg6, false, var10.field3149);
                    } else if (arg3 == 6) {
                        var10.field3149 = new class287(var11, 4, arg7 + 4, arg5, arg0, arg4, arg6, false, var10.field3149);
                    } else if (arg3 == 7) {
                        var10.field3149 = new class287(var11, 4, (arg7 + 2 & 0x3) + 4, arg5, arg0, arg4, arg6, false, var10.field3149);
                    } else if (arg3 == 8) {
                        var10.field3149 = new class287(var11, 4, arg7 + 4, arg5, arg0, arg4, arg6, false, var10.field3149);
                        var10.field3159 = new class287(var11, 4, (arg7 + 2 & 0x3) + 4, arg5, arg0, arg4, arg6, false, var10.field3159);
                    }
                }
            }
            if (arg1 == 2) {
                class138 var12 = class175.method1209(arg5, arg0, arg4);
                if (arg3 == 11) {
                    arg3 = 10;
                }
                if (var12 != null) {
                    var12.field2291 = new class287(Integer.MAX_VALUE & (int) (var12.field2275 >>> 32), arg3, arg7, arg5, arg0, arg4, arg6, false, var12.field2291);
                }
            }
            if (arg1 == 3) {
                class16 var13 = class267.method1808(arg5, arg0, arg4);
                if (var13 != null) {
                    var13.field185 = new class287((int) (var13.field187 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg5, arg0, arg4, arg6, false, var13.field185);
                }
            }
        }
        field2504++;
        if (arg2 != 22) {
            method1047(-11, 3, -115, 19, 62, -12, 99, 4);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILjg;ILeb;IB)V")
    public static final void method1048(int arg0, int arg1, class271 arg2, int arg3, class103 arg4, int arg5, byte arg6) {
        field2503++;
        if (arg2 == null) {
            return;
        }
        int var7 = (int) class121.field2039 + class93.field1330 & 0x7FF;
        int var8 = Math.max(arg4.field1691 / 2, arg4.field1693 / 2) + 10;
        int var9 = arg0 * arg0 + arg3 * arg3;
        if (arg6 != 41) {
            method1049(-7);
        }
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class145.field2348[var7];
        int var11 = var10 * 256 / (class77.field1050 + 256);
        int var12 = class145.field2338[var7];
        int var13 = var12 * 256 / (class77.field1050 + 256);
        int var14 = arg0 * var13 + arg3 * var11 >> 16;
        int var15 = arg0 * var11 - (arg3 * var13) >> 16;
        ((class43) arg2).method333(arg5 + (arg4.field1691 / 2) + var14 - (arg2.field4371 / 2), arg4.field1693 / 2 + arg1 + -var15 + -(arg2.field4384 / 2), arg4.field1711, arg4.field1617);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method1049(int arg0) {
        if (arg0 == 11663) {
            field2506 = null;
            field2505 = null;
            field2508 = null;
        }
    }
}
