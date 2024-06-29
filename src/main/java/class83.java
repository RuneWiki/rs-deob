import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class83 {

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lsb;")
    private static class98 field1459 = class47.method368("Loaded update list", 0);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lsb;")
    public static class98 field1465 = field1459;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
    public static int[] field1460 = new int[32];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lnj;")
    public static class82 field1461;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILhk;)V")
    public static final void method620(int arg0, class30 arg1) {
        if (arg1.field547 != null) {
            arg1.field547.field4559 = 0;
        }
        if (arg0 != 6562) {
            method624(true, 64, -125, -105, 7, 6, 118);
        }
        field1457++;
        arg1.field546 = false;
        for (class30 var2 = arg1.method72(); var2 != null; var2 = arg1.method88()) {
            method620(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lsb;I)V")
    public static final void method621(class98 arg0, int arg1) {
        if (arg1 != 220983719) {
            method625((byte) 105);
        }
        field1462++;
        if (class130.field2312 >= 2) {
            if (arg0.method731((byte) -126, class105.field1861)) {
                class265.method1804((byte) 10);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class176.method1228((class98) null, class186.method1288(new class98[] { class131.field2333, class125.method930(25904, var4), class26.field509 }, 31618), (byte) -49, 0);
            }
            if (arg0.method731((byte) 112, class44.field739)) {
                class139.method1050(arg1 ^ 0xF2D40E34);
            }
            if (arg0.method731((byte) -126, class16.field325)) {
                class220.method1521(25, 0);
            }
            if (arg0.method731((byte) 113, class118.field2115)) {
                class82.field1447 = true;
            }
            if (arg0.method731((byte) -112, class25.field487)) {
                class82.field1447 = false;
            }
            if (arg0.method731((byte) 107, class147.field2580)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class110.field1961[var5].field1175[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method708(class206.field3523, -119) && class132.field2346 != 0) {
                class51.method389(arg0.method740(6, true).method733(arg1 - 221015524), 1000);
            }
            if (arg0.method731((byte) -92, class8.field161) && class132.field2346 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method708(class180.field3102, -89)) {
                class36.field601 = arg0.method740(12, true).method723(255).method733(-31805);
                class176.method1228((class98) null, class186.method1288(new class98[] { class8.field118, class125.method930(25904, class36.field601) }, 31618), (byte) -49, 0);
            }
            if (arg0.method731((byte) -43, class218.field3758)) {
                class186.field3207 = true;
            }
        }
        class237.field4084.method490(182, -87);
        class9.field209++;
        class237.field4084.method1477(arg0.method724((byte) 25) - 1, arg1 + -221010474);
        class237.field4084.method1459(arg0.method740(2, true), (byte) 78);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZB)V")
    public static final void method622(boolean arg0, byte arg1) {
        if (arg1 != 40) {
            method624(true, 112, 2, -37, -59, 99, -68);
        }
        field1456++;
        int var2 = class97.field1671;
        if ((class163.field2943.field4492 >> 7) == class250.field4387 && (class163.field2943.field4466 >> 7) == class95.field1646) {
            class250.field4387 = 0;
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class192 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class163.field2943;
            } else {
                var4 = (long) class51.field831[var3] << 32;
                var6 = class141.field2499[class51.field831[var3]];
            }
            if (var6 != null && var6.method823(true)) {
                var6.field3336 = false;
                int var7 = var6.field4492 >> 7;
                if ((class199.field3423 && class97.field1671 > 200 || class97.field1671 > 50) && !arg0 && var6.field4510 == var6.field4479) {
                    var6.field3336 = true;
                }
                int var8 = var6.field4466 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field3350 == null || class236.field4071 < var6.field3329 || var6.field3327 <= class236.field4071) {
                        if (var6.field4486 == 1 && (var6.field4492 & 0x7F) == 64 && (var6.field4466 & 0x7F) == 64) {
                            if (class229.field3934[var7][var8] == class202.field3444) {
                                continue;
                            }
                            class229.field3934[var7][var8] = class202.field3444;
                        }
                        var6.field4475 = class70.method480(class265.field4640, (byte) 126, var6.field4492, var6.field4466);
                        class191.method1319(class265.field4640, var6.field4492, var6.field4466, var6.field4475, (var6.field4486 - 1) * 64 + 60, var6, var6.field4527, var4, var6.field4468);
                    } else {
                        var6.field3336 = false;
                        var6.field4475 = class70.method480(class265.field4640, (byte) 126, var6.field4492, var6.field4466);
                        class200.method1361(class265.field4640, var6.field4492, var6.field4466, var6.field4475, var6, var6.field4527, var4, var6.field3331, var6.field3326, var6.field3341, var6.field3340);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static final void method623(int arg0) {
        class85 var1 = class197.field3394;
        synchronized (class197.field3394) {
            class8.field188++;
            class147.field2573 = class200.field3428;
            if (arg0 <= 36) {
                method622(true, (byte) 105);
            }
            if (class153.field2803 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class107.field1915[var2] = false;
                }
                class153.field2803 = class36.field604;
            } else {
                while (class36.field604 != class153.field2803) {
                    int var3 = class154.field2819[class36.field604];
                    class36.field604 = class36.field604 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class107.field1915[var3] = true;
                    } else {
                        class107.field1915[~var3] = false;
                    }
                }
            }
            class200.field3428 = class161.field2909;
        }
        field1463++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method624(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1458++;
        int var7 = arg4 + arg5;
        int var8 = arg6 - arg4;
        if (arg0) {
            method623(-56);
        }
        for (int var9 = arg5; var9 < var7; var9++) {
            class37.method305(-7, class43.field721[var9], arg6, arg2, arg1);
        }
        int var10 = arg1 + arg4;
        int var11 = arg3 - arg4;
        for (int var12 = arg3; var12 > var11; var12--) {
            class37.method305(-7, class43.field721[var12], arg6, arg2, arg1);
        }
        for (int var13 = var7; var13 <= var11; var13++) {
            int[] var14 = class43.field721[var13];
            class37.method305(-7, var14, var10, arg2, arg1);
            class37.method305(-7, var14, arg6, arg2, var8);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method625(byte arg0) {
        if (arg0 > -12) {
            method622(true, (byte) 75);
        }
        field1460 = null;
        field1461 = null;
        field1465 = null;
        field1459 = null;
    }
}
