import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class169 extends class45 {

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2270 = "Checking for updates - ";

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public int field2276;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Llm;")
    public static class347 field2272;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lcq;")
    public static class67 field2269;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[I")
    public static int[] field2271;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V", line = 5)
    public static final void method1043(int arg0) {
        field2274++;
        if (arg0 != -403272665 || class312.method2113(21410) != 2) {
            return;
        }
        byte var1 = (byte) (class236.field3139 - 4 & 0xFF);
        int var2 = class236.field3139 % class192.field2574;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class364.field5262; var16++) {
                class12.field184[var3][var2][var16] = var1;
            }
        }
        if (class227.field2981 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class11.field169[var4] = -1000000;
            class205.field2772[var4] = 1000000;
            class363.field5235[var4] = 0;
            class156.field2118[var4] = 1000000;
            class17.field246[var4] = 0;
        }
        if (class346.field4979 != 1) {
            int var15 = class52.method359((byte) -116, class179.field2371, class400.field5971, class227.field2981);
            if ((var15 - class201.field2667) >= 800 || (class103.field1430[class227.field2981][class400.field5971 >> 7][class179.field2371 >> 7] & 0x4) == 0) {
                return;
            }
            class92.method643(class213.field2852, arg0 + 403272586, class400.field5971 >> 7, 1, class179.field2371 >> 7, false);
            return;
        }
        if ((class103.field1430[class227.field2981][class227.field2988.field740 >> 7][class227.field2988.field734 >> 7] & 0x4) != 0) {
            class92.method643(class213.field2852, arg0 ^ 0xE7F68C05, class227.field2988.field740 >> 7, 0, class227.field2988.field734 >> 7, false);
        }
        if (class415.field6101 >= 2560) {
            return;
        }
        int var5 = class400.field5971 >> 7;
        int var6 = class179.field2371 >> 7;
        int var7 = class227.field2988.field740 >> 7;
        int var8 = class227.field2988.field734 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && -class192.field2574 < var9 && class192.field2574 > var9 && var10 > (-class364.field5262) && class364.field5262 > var10) {
            if (var10 >= var9) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class103.field1430[class227.field2981][var5][var6] & 0x4) != 0) {
                        class92.method643(class213.field2852, 84, var5, 1, var6, false);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var7 > var5) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        var12 -= 65536;
                        if ((class103.field1430[class227.field2981][var5][var6] & 0x4) != 0) {
                            class92.method643(class213.field2852, 126, var5, 1, var6, false);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var7 > var5) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                if ((class103.field1430[class227.field2981][var5][var6] & 0x4) != 0) {
                    class92.method643(class213.field2852, -62, var5, 1, var6, false);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class103.field1430[class227.field2981][var5][var6] & 0x4) != 0) {
                        class92.method643(class213.field2852, -101, var5, 1, var6, false);
                        return;
                    }
                }
            }
            return;
        }
        class248.method1494("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class7.field138 + "," + class200.field2660, arg0 ^ 0xE7F68C40, (Throwable) null);
        return;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V", line = 212)
    public static void method1044(int arg0) {
        field2271 = null;
        field2272 = null;
        field2270 = null;
        field2269 = null;
        if (arg0 != 0) {
            method1043(-48);
        }
    }
}
