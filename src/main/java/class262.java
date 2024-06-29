import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class262 {

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
    public static int[] field4246 = new int[25];

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field4249 = -2;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Lul;")
    public static class51 field4247 = new class51(50);

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Lc;")
    public static class331 field4251 = new class331();

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4252 = "wave:";

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lcg;")
    public static class49 field4248;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIILlg;II)V", line = 9)
    public static final void method1807(int arg0, int arg1, int arg2, int arg3, int arg4, class137 arg5, int arg6, int arg7) {
        if (class35.field507) {
            class124.field2150 = 32;
        } else {
            class124.field2150 = 0;
        }
        class35.field507 = false;
        if (class204.field3467 != 0) {
            if (arg7 >= arg4 && arg7 < arg4 + 16 && arg6 <= arg2 && (arg6 + 16) > arg2) {
                arg5.field2531 -= 4;
                class258.method1793(arg5, 0);
            } else if (arg7 >= arg4 && arg4 + 16 > arg7 && arg6 + arg0 - 16 <= arg2 && (arg0 + arg6) > arg2) {
                arg5.field2531 += 4;
                class258.method1793(arg5, 0);
            } else if (arg7 >= arg4 - class124.field2150 && (class124.field2150 + arg4 + 16) > arg7 && arg2 >= arg6 + 16 && arg2 < (arg0 + arg6 - 16)) {
                int var8 = (arg0 - 32) * arg0 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - arg6 - (var8 / 2) - 16;
                int var10 = arg0 - var8 - 32;
                arg5.field2531 = (arg3 - arg0) * var9 / var10;
                class258.method1793(arg5, 0);
                class35.field507 = true;
            }
        }
        if (arg1 > -86) {
            field4246 = (int[]) null;
        }
        field4240++;
        if (class99.field1612 == 0) {
            return;
        }
        int var11 = arg5.field2533;
        if (arg4 - var11 <= arg7 && arg6 <= arg2 && (arg4 + 16) > arg7 && arg2 <= (arg0 + arg6)) {
            arg5.field2531 += class99.field1612 * 45;
            class258.method1793(arg5, 0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Z", line = 74)
    public static final boolean method1808(int arg0) throws IOException {
        field4242++;
        if (class279.field4426 == null) {
            return false;
        }
        int var1 = class279.field4426.method175(-21329);
        if (var1 == 0) {
            return false;
        }
        if (class40.field592 == -1) {
            class279.field4426.method179(class276.field4398.field5342, 0, 1, 9395);
            var1--;
            class276.field4398.field5353 = 0;
            class40.field592 = class276.field4398.method36(53);
            class308.field4906 = class52.field814[class40.field592];
        }
        if (class308.field4906 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class279.field4426.method179(class276.field4398.field5342, 0, 1, 9395);
            var1--;
            class308.field4906 = class276.field4398.field5342[0] & 0xFF;
        }
        if (class308.field4906 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class279.field4426.method179(class276.field4398.field5342, 0, 2, 9395);
            class276.field4398.field5353 = 0;
            class308.field4906 = class276.field4398.method2339((byte) -46);
        }
        if (class308.field4906 > var1) {
            return false;
        }
        class276.field4398.field5353 = 0;
        class279.field4426.method179(class276.field4398.field5342, 0, class308.field4906, 9395);
        class207.field3514 = 0;
        class35.field509 = class338.field5410;
        class338.field5410 = class128.field2224;
        class128.field2224 = class40.field592;
        if (class40.field592 == 61) {
            int var390 = class276.field4398.method2375(arg0 + 4034);
            String var391 = class276.field4398.method2365(100);
            int var392 = class276.field4398.method2362(102);
            if (class246.method1726(true, var392)) {
                class254.method1769(var390, var391, (byte) -47);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 67) {
            class242.field3956 = class276.field4398.method2363(64);
            class320.field5069 = class276.field4398.method2363(66);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 93) {
            int var387 = class276.field4398.method2339((byte) -46);
            int var388 = class276.field4398.method2338((byte) 36);
            if (class246.method1726(true, var387)) {
                class228 var389 = (class228) class172.field2972.method732((long) var388, true);
                if (var389 != null) {
                    class58.method529(true, var389, 50);
                }
                if (class107.field1783 != null) {
                    class258.method1793(class107.field1783, arg0 ^ 0x9);
                    class107.field1783 = null;
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 119) {
            class83.method754((byte) 114);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 54) {
            class330.method2289(149, true);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 217) {
            class341.field5436 = class276.field4398.method2364(-9069);
            class40.field592 = -1;
            class51.field809 = class99.field1606;
            return true;
        } else if (class40.field592 == 35) {
            if (class311.field4933 != -1) {
                class291.method1991(class311.field4933, -28554, 0);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 153) {
            int var2 = class276.field4398.method2339((byte) -46);
            int var3 = class276.field4398.method2364(-9069);
            if (var2 == 65535) {
                var2 = -1;
            }
            int var4 = class276.field4398.method2339((byte) -46);
            int var5 = class276.field4398.method2364(-9069);
            class286.method1956(var5, 0, var2, var4, var3);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 45) {
            int var6 = class276.field4398.method2348(255);
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = class255.field4112[var7];
            int var10 = class276.field4398.method2350(false);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = class276.field4398.method2375(4043);
            int var12 = var11 >> 28 & 0x3;
            int var13 = var11 & 0x3FFF;
            int var14 = var11 >> 14 & 0x3FFF;
            int var15 = var13 - class34.field484;
            int var16 = var14 - class24.field345;
            class284.method1938(var7, var15, var8, var9, var12, var16, var10, 29067);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 207) {
            class316.field5008 = class276.field4398.method2364(-9069);
            class40.field592 = -1;
            return true;
        } else if (arg0 != 9) {
            return true;
        } else if (class40.field592 == 39) {
            int var383 = class276.field4398.method2312(-24506);
            int var384 = class276.field4398.method2350(false);
            int var385 = class276.field4398.method2322(-128);
            int var386 = class276.field4398.method2338((byte) 19);
            if (class246.method1726(true, var384)) {
                class38.method328(var386, var385, 100, var383);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 255) {
            long var17 = class276.field4398.method2367((byte) 122);
            class276.field4398.method2323(-54);
            long var19 = class276.field4398.method2367((byte) -45);
            long var21 = (long) class276.field4398.method2339((byte) -46);
            long var23 = (long) class276.field4398.method2317(21803);
            int var25 = class276.field4398.method2364(-9069);
            long var26 = (var21 << 32) + var23;
            boolean var28 = false;
            int var29 = 0;
            label1264: while (true) {
                if (var29 >= 100) {
                    if (var25 <= 1) {
                        if ((!class37.field537 || class331.field5268) && !class330.field5256) {
                            for (int var30 = 0; var30 < class200.field3424; var30++) {
                                if (class20.field305[var30] == var17) {
                                    var28 = true;
                                    break label1264;
                                }
                            }
                        } else {
                            var28 = true;
                        }
                    }
                    break;
                }
                if (class172.field2977[var29] == var26) {
                    var28 = true;
                    break;
                }
                var29++;
            }
            if (!var28 && class134.field2348 == 0) {
                class172.field2977[class44.field688] = var26;
                class44.field688 = (class44.field688 + 1) % 100;
                String var31 = class323.method2229(class30.method280(class170.method1343(32767, class276.field4398), -23587));
                if (var25 == 2 || var25 == 3) {
                    class104.method895(9, "<img=1>" + class8.method48(var17, true), class8.method48(var19, true), var31, -75);
                } else if (var25 == 1) {
                    class104.method895(9, "<img=0>" + class8.method48(var17, true), class8.method48(var19, true), var31, arg0 ^ 0xFFFFFFC7);
                } else {
                    class104.method895(9, class8.method48(var17, true), class8.method48(var19, true), var31, 96);
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 241) {
            class330.method2289(149, false);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 36) {
            int var32 = class276.field4398.method2350(false);
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = class276.field4398.method2355(18113);
            class4.method24(true, var33, var32);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 103) {
            int var34 = class276.field4398.method2328((byte) 127);
            int var35 = class276.field4398.method2348(255);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var36 = class276.field4398.method2317(arg0 + 21794);
            class107.method920(var34, (byte) 69, var35, var36);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 15) {
            int var37 = class276.field4398.method2362(125);
            int var38 = class276.field4398.method2328((byte) 121);
            String var39 = class276.field4398.method2365(arg0 ^ 0x6E);
            if (class246.method1726(true, var38)) {
                class175.method1357(var37, var39, 20192);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 10) {
            if (class120.field2076 != null) {
                class282.method1923(false, arg0 - 74, class69.field1133, -1, -1);
            }
            byte[] var40 = new byte[class308.field4906];
            class276.field4398.method28(class308.field4906, var40, 0, 0);
            String var41 = class71.method684(-123, 0, var40, class308.field4906);
            if (class271.field4321 == null && class59.field915 == 3 || !class59.field913.startsWith("win") || class277.field4405) {
                class128.method1068(true, var41, false);
            } else {
                class37.field542 = var41;
                class53.field824 = true;
                class328.field5226 = class85.field1369.method543(true, var41);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 166) {
            int var42 = class276.field4398.method2350(false);
            if (var42 == 65535) {
                var42 = -1;
            }
            int var43 = class276.field4398.method2348(255);
            String var44 = class276.field4398.method2365(arg0 ^ 0x6C);
            int var45 = class276.field4398.method2348(255);
            if (var43 >= 1 && var43 <= 8) {
                if (var44.equalsIgnoreCase("null")) {
                    var44 = null;
                }
                class227.field3820[var43 - 1] = var44;
                class121.field2098[var43 - 1] = var42;
                class71.field1193[var43 - 1] = var45 == 0;
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 96) {
            int var46 = class276.field4398.method2369(true);
            int var47 = class276.field4398.method2369(true);
            int var48 = class276.field4398.method2328((byte) 125);
            if (class246.method1726(true, var48)) {
                class228 var49 = (class228) class172.field2972.method732((long) var47, true);
                class228 var50 = (class228) class172.field2972.method732((long) var46, true);
                if (var50 != null) {
                    class58.method529(var49 == null || var49.field3833 != var50.field3833, var50, arg0 + 41);
                }
                if (var49 != null) {
                    var49.method2195(-1);
                    class172.field2972.method725((long) var46, var49, 1);
                }
                class137 var51 = class146.method1167(arg0 + 1169843623, var47);
                if (var51 != null) {
                    class258.method1793(var51, 0);
                }
                class137 var52 = class146.method1167(1169843632, var46);
                if (var52 != null) {
                    class258.method1793(var52, 0);
                    class185.method1425(var52, 117, true);
                }
                if (class311.field4933 != -1) {
                    class291.method1991(class311.field4933, -28554, 1);
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 211) {
            if (class308.field4906 == 0) {
                class79.field1276 = class352.field5568;
            } else {
                class79.field1276 = class276.field4398.method2365(arg0 + 104);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 72) {
            class163.method1296((byte) 105);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 123) {
            int var379 = class276.field4398.method2339((byte) -46);
            int var380 = class276.field4398.method2363(arg0 ^ 0x2A);
            int var381 = class276.field4398.method2350(false);
            if (class246.method1726(true, var381)) {
                if (var380 == 2) {
                    class113.method963(25);
                }
                class311.field4933 = var379;
                class81.method741(var379, (byte) -120);
                class84.method762(false, 28406);
                class86.method769(class311.field4933, (byte) 55);
                for (int var382 = 0; var382 < 100; var382++) {
                    class272.field4337[var382] = true;
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 120) {
            int var374 = class276.field4398.method2339((byte) -46);
            String var375 = class276.field4398.method2365(arg0 + 104);
            Object[] var376 = new Object[var375.length() + 1];
            for (int var377 = var375.length() - 1; var377 >= 0; var377--) {
                if (var375.charAt(var377) == 's') {
                    var376[var377 + 1] = class276.field4398.method2365(class289.method1969(arg0, 97));
                } else {
                    var376[var377 + 1] = Integer.valueOf(class276.field4398.method2338((byte) 113));
                }
            }
            var376[0] = Integer.valueOf(class276.field4398.method2338((byte) 70));
            if (class246.method1726(true, var374)) {
                class258 var378 = new class258();
                var378.field4173 = var376;
                class179.method1376(var378, false);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 186) {
            class27.method248(arg0 - 111);
            class176.field2996 = class276.field4398.method2326(66);
            class110.field1867 = class99.field1606;
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 193) {
            String var355 = "";
            boolean var356 = true;
            long var357 = class276.field4398.method2367((byte) -83);
            int var359 = class276.field4398.method2339((byte) -46);
            if (var357 < 0L) {
                var357 &= Long.MAX_VALUE;
                var356 = false;
            }
            int var360 = class276.field4398.method2364(-9069);
            if (var359 > 0) {
                var355 = class276.field4398.method2365(102);
            }
            String var361 = class8.method48(var357, true);
            for (int var362 = 0; var362 < class352.field5570; var362++) {
                if (class339.field5414[var362] == var357) {
                    if (class67.field1077[var362] != var359) {
                        class67.field1077[var362] = var359;
                        if (var359 > 0) {
                            class170.method1339(5, var361 + class283.field4478, "", (byte) -98);
                        }
                        if (var359 == 0) {
                            class170.method1339(5, var361 + class70.field1142, "", (byte) -98);
                        }
                    }
                    class269.field4300[var362] = var355;
                    class259.field4199[var362] = var360;
                    class344.field5477[var362] = var356;
                    var361 = null;
                    break;
                }
            }
            if (var361 != null && class352.field5570 < 200) {
                class339.field5414[class352.field5570] = var357;
                class98.field1601[class352.field5570] = var361;
                class67.field1077[class352.field5570] = var359;
                class269.field4300[class352.field5570] = var355;
                class259.field4199[class352.field5570] = var360;
                class344.field5477[class352.field5570] = var356;
                class352.field5570++;
            }
            class51.field809 = class99.field1606;
            boolean var363 = false;
            int var364 = class352.field5570;
            while (var364 > 0) {
                var364--;
                boolean var365 = true;
                for (int var366 = 0; var366 < var364; var366++) {
                    if (class67.field1077[var366] != class120.field2082 && class67.field1077[var366 + 1] == class120.field2082 || class67.field1077[var366] == 0 && class67.field1077[var366 + 1] != 0) {
                        var365 = false;
                        int var367 = class67.field1077[var366];
                        class67.field1077[var366] = class67.field1077[var366 + 1];
                        class67.field1077[var366 + 1] = var367;
                        String var368 = class269.field4300[var366];
                        class269.field4300[var366] = class269.field4300[var366 + 1];
                        class269.field4300[var366 + 1] = var368;
                        String var369 = class98.field1601[var366];
                        class98.field1601[var366] = class98.field1601[var366 + 1];
                        class98.field1601[var366 + 1] = var369;
                        long var370 = class339.field5414[var366];
                        class339.field5414[var366] = class339.field5414[var366 + 1];
                        class339.field5414[var366 + 1] = var370;
                        int var372 = class259.field4199[var366];
                        class259.field4199[var366] = class259.field4199[var366 + 1];
                        class259.field4199[var366 + 1] = var372;
                        boolean var373 = class344.field5477[var366];
                        class344.field5477[var366] = class344.field5477[var366 + 1];
                        class344.field5477[var366 + 1] = var373;
                    }
                }
                if (var365) {
                    break;
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 116) {
            class40.field592 = -1;
            class338.field5408 = 0;
            return true;
        } else if (class40.field592 == 137) {
            int var347 = class276.field4398.method2338((byte) 94);
            int var348 = class276.field4398.method2339((byte) -46);
            class137 var349;
            if (var347 >= 0) {
                var349 = class146.method1167(1169843632, var347);
            } else {
                var349 = null;
            }
            if (var349 != null) {
                for (int var350 = 0; var350 < var349.field2379.length; var350++) {
                    var349.field2379[var350] = 0;
                    var349.field2461[var350] = 0;
                }
            }
            if (var347 < -70000) {
                var348 += 32768;
            }
            class126.method1051(var348, -5946);
            int var351 = class276.field4398.method2339((byte) -46);
            for (int var352 = 0; var352 < var351; var352++) {
                int var353 = class276.field4398.method2363(106);
                if (var353 == 255) {
                    var353 = class276.field4398.method2375(4043);
                }
                int var354 = class276.field4398.method2339((byte) -46);
                if (var349 != null && var349.field2379.length > var352) {
                    var349.field2379[var352] = var354;
                    var349.field2461[var352] = var353;
                }
                class18.method184(var354 - 1, var353, var352, 0, var348);
            }
            if (var349 != null) {
                class258.method1793(var349, 0);
            }
            class27.method248(arg0 ^ 0x1B);
            class239.field3913[class36.method319(31, class194.field3251++)] = class36.method319(32767, var348);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 230) {
            int var53 = class276.field4398.method2339((byte) -46);
            if (class246.method1726(true, var53)) {
                class289.method1970((byte) 40);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 139) {
            int var54 = class276.field4398.method2338((byte) 75);
            int var55 = class276.field4398.method2338((byte) 36);
            int var56 = class276.field4398.method2362(124);
            int var57 = class276.field4398.method2328((byte) 123);
            if (var56 == 65535) {
                var56 = -1;
            }
            int var58 = class276.field4398.method2350(false);
            if (var58 == 65535) {
                var58 = -1;
            }
            if (class246.method1726(true, var57)) {
                for (int var59 = var58; var59 <= var56; var59++) {
                    long var60 = ((long) var54 << 32) + (long) var59;
                    class57 var62 = (class57) class215.field3606.method732(var60, true);
                    class57 var63;
                    if (var62 != null) {
                        var63 = new class57(var55, var62.field889);
                        var62.method2195(arg0 - 10);
                    } else if (var59 == -1) {
                        var63 = new class57(var55, class146.method1167(1169843632, var54).field2368.field889);
                    } else {
                        var63 = new class57(var55, -1);
                    }
                    class215.field3606.method725(var60, var63, 1);
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 172) {
            int var64 = class276.field4398.method2339((byte) -46);
            class137.method1126((byte) -86, var64);
            class239.field3913[class36.method319(31, class194.field3251++)] = class36.method319(32767, var64);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 228 || class40.field592 == 73 || class40.field592 == 224 || class40.field592 == 149 || class40.field592 == 225 || class40.field592 == 138 || class40.field592 == 191 || class40.field592 == 81 || class40.field592 == 109 || class40.field592 == 199 || class40.field592 == 122 || class40.field592 == 30 || class40.field592 == 17 || class40.field592 == 78) {
            class211.method1567(-1);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 21) {
            class242.field3956 = class276.field4398.method2363(64);
            class320.field5069 = class276.field4398.method2348(255);
            for (int var65 = class242.field3956; var65 < class242.field3956 + 8; var65++) {
                for (int var66 = class320.field5069; var66 < class320.field5069 + 8; var66++) {
                    if (class214.field3591[class205.field3497][var65][var66] != null) {
                        class214.field3591[class205.field3497][var65][var66] = null;
                        class107.method936(var66, arg0 - 9, var65);
                    }
                }
            }
            for (class287 var67 = (class287) class203.field3460.method2297(14204); var67 != null; var67 = (class287) class203.field3460.method2291(-82)) {
                if (var67.field4578 >= class242.field3956 && var67.field4578 < class242.field3956 + 8 && var67.field4566 >= class320.field5069 && (class320.field5069 + 8) > var67.field4566 && class205.field3497 == var67.field4580) {
                    var67.field4568 = 0;
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 144) {
            int var68 = class276.field4398.method2369(true);
            int var69 = class276.field4398.method2362(85);
            int var70 = class276.field4398.method2350(false);
            int var71 = class276.field4398.method2362(arg0 ^ 0x71);
            if (var68 >> 30 != 0) {
                int var72 = var68 >> 28 & 0x3;
                int var73 = (var68 & 0x3FFF) - class34.field484;
                int var74 = (var68 >> 14 & 0x3FFF) - class24.field345;
                if (var74 >= 0 && var73 >= 0 && var74 < 104 && var73 < 104) {
                    int var75 = var73 * 128 + 64;
                    int var76 = var74 * 128 + 64;
                    class316 var77 = new class316(var69, var72, var76, var75, class223.method1627((byte) -120, var75, var76, var72) - var71, var70, class181.field3045);
                    class238.field3897.method2303((byte) -124, new class239(var77));
                }
            } else if ((var68 >> 29) != 0) {
                int var90 = var68 & 0xFFFF;
                class278 var91 = class320.field5071[var90];
                if (var91 != null) {
                    if (var69 == 65535) {
                        var69 = -1;
                    }
                    boolean var92 = true;
                    if (var69 != -1 && var91.field1980 != -1) {
                        if (var91.field1980 == var69) {
                            class158 var97 = class271.method1851(var69, 0);
                            if (var97.field2803 && var97.field2793 != -1) {
                                class285 var98 = class346.method2428(var97.field2793, (byte) -24);
                                int var99 = var98.field4532;
                                if (var99 == 1) {
                                    var91.field2031 = 0;
                                    var91.field2024 = class181.field3045 + var70;
                                    var91.field1967 = 1;
                                    var92 = false;
                                    var91.field1968 = 0;
                                    var91.field1966 = 0;
                                    class20.method199(false, var91.field1985, var98, var91.field2036, var91.field1966, true);
                                } else if (var99 == 2) {
                                    var91.field2002 = 0;
                                    var92 = false;
                                }
                            }
                        } else {
                            class158 var93 = class271.method1851(var69, 0);
                            class158 var94 = class271.method1851(var91.field1980, 0);
                            if (var93.field2793 != -1 && var94.field2793 != -1) {
                                class285 var95 = class346.method2428(var93.field2793, (byte) -24);
                                class285 var96 = class346.method2428(var94.field2793, (byte) -24);
                                if (var96.field4517 > var95.field4517) {
                                    var92 = false;
                                }
                            }
                        }
                    }
                    if (var92) {
                        var91.field1966 = 0;
                        var91.field1967 = 1;
                        var91.field1968 = 0;
                        var91.field1980 = var69;
                        var91.field2024 = class181.field3045 + var70;
                        var91.field1997 = var71;
                        if (var91.field2024 > class181.field3045) {
                            var91.field1966 = -1;
                        }
                        if (var91.field1980 != -1 && class181.field3045 == var91.field2024) {
                            int var100 = class271.method1851(var91.field1980, 0).field2793;
                            if (var100 != -1) {
                                class285 var101 = class346.method2428(var100, (byte) -24);
                                if (var101 != null && var101.field4531 != null) {
                                    class20.method199(false, var91.field1985, var101, var91.field2036, 0, true);
                                }
                            }
                        }
                    }
                }
            } else if (var68 >> 28 != 0) {
                int var78 = var68 & 0xFFFF;
                class205 var79;
                if (class316.field5010 == var78) {
                    var79 = class218.field3632;
                } else {
                    var79 = class135.field2359[var78];
                }
                if (var79 != null) {
                    if (var69 == 65535) {
                        var69 = -1;
                    }
                    boolean var80 = true;
                    if (var69 != -1 && var79.field1980 != -1) {
                        if (var79.field1980 == var69) {
                            class158 var81 = class271.method1851(var69, 0);
                            if (var81.field2803 && var81.field2793 != -1) {
                                class285 var82 = class346.method2428(var81.field2793, (byte) -24);
                                int var83 = var82.field4532;
                                if (var83 == 1) {
                                    var79.field2024 = class181.field3045 + var70;
                                    var79.field2031 = 0;
                                    var79.field1966 = 0;
                                    var79.field1968 = 0;
                                    var80 = false;
                                    var79.field1967 = 1;
                                    class20.method199(false, var79.field1985, var82, var79.field2036, var79.field1966, true);
                                } else if (var83 == 2) {
                                    var80 = false;
                                    var79.field2002 = 0;
                                }
                            }
                        } else {
                            class158 var84 = class271.method1851(var69, 0);
                            class158 var85 = class271.method1851(var79.field1980, 0);
                            if (var84.field2793 != -1 && var85.field2793 != -1) {
                                class285 var86 = class346.method2428(var84.field2793, (byte) -24);
                                class285 var87 = class346.method2428(var85.field2793, (byte) -24);
                                if (var86.field4517 < var87.field4517) {
                                    var80 = false;
                                }
                            }
                        }
                    }
                    if (var80) {
                        var79.field1966 = 0;
                        var79.field1967 = 1;
                        var79.field1980 = var69;
                        if (var79.field1980 == 65535) {
                            var79.field1980 = -1;
                        }
                        var79.field1968 = 0;
                        var79.field1997 = var71;
                        var79.field2024 = class181.field3045 + var70;
                        if (class181.field3045 < var79.field2024) {
                            var79.field1966 = -1;
                        }
                        if (var79.field1980 != -1 && class181.field3045 == var79.field2024) {
                            int var88 = class271.method1851(var79.field1980, 0).field2793;
                            if (var88 != -1) {
                                class285 var89 = class346.method2428(var88, (byte) -24);
                                if (var89 != null && var89.field4531 != null) {
                                    class20.method199(class218.field3632 == var79, var79.field1985, var89, var79.field2036, 0, true);
                                }
                            }
                        }
                    }
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 79) {
            int var342 = class276.field4398.method2350(false);
            int var343 = class276.field4398.method2362(arg0 ^ 0x6D);
            int var344 = class276.field4398.method2339((byte) -46);
            int var345 = class276.field4398.method2375(arg0 ^ 0xFC2);
            int var346 = class276.field4398.method2362(85);
            if (class246.method1726(true, var344)) {
                class341.method2395(var345, var342, 7, arg0 + 90, var346 | var343 << 16);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 132) {
            for (int var340 = 0; var340 < class135.field2359.length; var340++) {
                if (class135.field2359[var340] != null) {
                    class135.field2359[var340].field1998 = -1;
                }
            }
            for (int var341 = 0; var341 < class320.field5071.length; var341++) {
                if (class320.field5071[var341] != null) {
                    class320.field5071[var341].field1998 = -1;
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 212) {
            int var102 = class276.field4398.method2375(4043);
            int var103 = class276.field4398.method2339((byte) -46);
            class133.method1092(var102, var103, -60);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 100) {
            String var299 = class276.field4398.method2365(101);
            if (var299.endsWith(":tradereq:")) {
                String var300 = var299.substring(0, var299.indexOf(":"));
                long var301 = class142.method1151(var300, arg0 - 129);
                boolean var303 = false;
                for (int var304 = 0; var304 < class200.field3424; var304++) {
                    if (class20.field305[var304] == var301) {
                        var303 = true;
                        break;
                    }
                }
                if (!var303 && class134.field2348 == 0) {
                    class170.method1339(4, class353.field5582, var300, (byte) -98);
                }
            } else if (var299.endsWith(":chalreq:")) {
                String var305 = var299.substring(0, var299.indexOf(":"));
                long var306 = class142.method1151(var305, -75);
                boolean var308 = false;
                for (int var309 = 0; var309 < class200.field3424; var309++) {
                    if (class20.field305[var309] == var306) {
                        var308 = true;
                        break;
                    }
                }
                if (!var308 && class134.field2348 == 0) {
                    String var310 = var299.substring(var299.indexOf(":") + 1, var299.length() + -9);
                    class170.method1339(8, var310, var305, (byte) -98);
                }
            } else if (var299.endsWith(":assistreq:")) {
                String var311 = var299.substring(0, var299.indexOf(":"));
                long var312 = class142.method1151(var311, -60);
                boolean var314 = false;
                for (int var315 = 0; var315 < class200.field3424; var315++) {
                    if (class20.field305[var315] == var312) {
                        var314 = true;
                        break;
                    }
                }
                if (!var314 && class134.field2348 == 0) {
                    class170.method1339(10, "", var311, (byte) -98);
                }
            } else if (var299.endsWith(":clan:")) {
                String var339 = var299.substring(0, var299.indexOf(":clan:"));
                class170.method1339(11, var339, "", (byte) -98);
            } else if (var299.endsWith(":trade:")) {
                String var316 = var299.substring(0, var299.indexOf(":trade:"));
                if (class134.field2348 == 0) {
                    class170.method1339(12, var316, "", (byte) -98);
                }
            } else if (var299.endsWith(":assist:")) {
                String var317 = var299.substring(0, var299.indexOf(":assist:"));
                if (class134.field2348 == 0) {
                    class170.method1339(13, var317, "", (byte) -98);
                }
            } else if (var299.endsWith(":duelstake:")) {
                String var334 = var299.substring(0, var299.indexOf(":"));
                long var335 = class142.method1151(var334, -54);
                boolean var337 = false;
                for (int var338 = 0; var338 < class200.field3424; var338++) {
                    if (class20.field305[var338] == var335) {
                        var337 = true;
                        break;
                    }
                }
                if (!var337 && class134.field2348 == 0) {
                    class170.method1339(14, "", var334, (byte) -98);
                }
            } else if (var299.endsWith(":duelfriend:")) {
                String var329 = var299.substring(0, var299.indexOf(":"));
                long var330 = class142.method1151(var329, -97);
                boolean var332 = false;
                for (int var333 = 0; var333 < class200.field3424; var333++) {
                    if (class20.field305[var333] == var330) {
                        var332 = true;
                        break;
                    }
                }
                if (!var332 && class134.field2348 == 0) {
                    class170.method1339(15, "", var329, (byte) -98);
                }
            } else if (var299.endsWith(":clanreq:")) {
                boolean var318 = false;
                String var319 = var299.substring(0, var299.indexOf(":"));
                long var320 = class142.method1151(var319, arg0 ^ 0xFFFFFFA3);
                for (int var322 = 0; var322 < class200.field3424; var322++) {
                    if (class20.field305[var322] == var320) {
                        var318 = true;
                        break;
                    }
                }
                if (!var318 && class134.field2348 == 0) {
                    class170.method1339(16, "", var319, (byte) -98);
                }
            } else if (var299.endsWith(":allyreq:")) {
                boolean var323 = false;
                String var324 = var299.substring(0, var299.indexOf(":"));
                long var325 = class142.method1151(var324, -79);
                for (int var327 = 0; var327 < class200.field3424; var327++) {
                    if (class20.field305[var327] == var325) {
                        var323 = true;
                        break;
                    }
                }
                if (!var323 && class134.field2348 == 0) {
                    String var328 = var299.substring(var299.indexOf(":") + 1, var299.length() - 9);
                    class170.method1339(21, var328, var324, (byte) -98);
                }
            } else {
                class170.method1339(0, var299, "", (byte) -98);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 206) {
            class214.field3599 = class99.field1606;
            long var287 = class276.field4398.method2367((byte) 124);
            if (var287 == 0L) {
                class253.field4071 = null;
                class40.field592 = -1;
                class295.field4720 = null;
                class298.field4746 = 0;
                class33.field481 = null;
                return true;
            }
            long var289 = class276.field4398.method2367((byte) 127);
            class33.field481 = class195.method1467(var289, -11026);
            class253.field4071 = class195.method1467(var287, -11026);
            class264.field4265 = class276.field4398.method2323(-80);
            int var291 = class276.field4398.method2364(-9069);
            if (var291 == 255) {
                class40.field592 = -1;
                return true;
            }
            class298.field4746 = var291;
            class269[] var292 = new class269[100];
            for (int var293 = 0; var293 < class298.field4746; var293++) {
                var292[var293] = new class269();
                var292[var293].field5062 = class276.field4398.method2367((byte) 127);
                var292[var293].field4308 = class195.method1467(var292[var293].field5062, -11026);
                var292[var293].field4299 = class276.field4398.method2339((byte) -46);
                var292[var293].field4307 = class276.field4398.method2323(-91);
                var292[var293].field4301 = class276.field4398.method2365(126);
                if (class38.field550 == var292[var293].field5062) {
                    class201.field3428 = var292[var293].field4307;
                }
            }
            int var294 = class298.field4746;
            boolean var295 = false;
            while (var294 > 0) {
                var294--;
                boolean var296 = true;
                for (int var297 = 0; var297 < var294; var297++) {
                    if (var292[var297].field4308.compareTo(var292[var297 + 1].field4308) > 0) {
                        var296 = false;
                        class269 var298 = var292[var297];
                        var292[var297] = var292[var297 + 1];
                        var292[var297 + 1] = var298;
                    }
                }
                if (var296) {
                    break;
                }
            }
            class295.field4720 = var292;
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 157) {
            int var284 = class276.field4398.method2362(arg0 + 102);
            int var285 = class276.field4398.method2369(true);
            int var286 = class276.field4398.method2350(false);
            if (class246.method1726(true, var284)) {
                class257.method1781(var285, var286, -120);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 233) {
            long var104 = class276.field4398.method2367((byte) -103);
            String var106 = class323.method2229(class30.method280(class170.method1343(32767, class276.field4398), arg0 ^ 0xFFFFA3D4));
            class170.method1339(6, var106, class8.method48(var104, true), (byte) -98);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 245) {
            int var283 = class276.field4398.method2375(4043);
            class113.field1887 = class85.field1369.method537((byte) -68, var283);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 151) {
            class276.field4398.field5353 += 28;
            if (class276.field4398.method2368(true)) {
                class98.method844((byte) -92, class276.field4398, class276.field4398.field5353 - 28);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 196) {
            class110.method953(class276.field4398.method2365(122), -1);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 38) {
            int var278 = class276.field4398.method2328((byte) 112);
            int var279 = class276.field4398.method2339((byte) -46);
            int var280 = class276.field4398.method2338((byte) 75);
            int var281 = class276.field4398.method2339((byte) -46);
            int var282 = class276.field4398.method2328((byte) 124);
            if (class246.method1726(true, var282)) {
                class32.method295(var280, var279, var278, 8, var281);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 216) {
            class222.method1620(arg0 + 7);
            class27.method248(35);
            class155.field2749 += 32;
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 28) {
            int var274 = class276.field4398.method2328((byte) 111);
            int var275 = class276.field4398.method2328((byte) 126);
            int var276 = class276.field4398.method2355(18113);
            class278 var277 = class320.field5071[var274];
            if (var277 != null) {
                class124.method1041(var277, arg0 - 8, var276, var275);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 174) {
            for (int var107 = 0; var107 < class116.field2006.length; var107++) {
                if (class334.field5302[var107] != class116.field2006[var107]) {
                    class116.field2006[var107] = class334.field5302[var107];
                    class300.method2073(123, var107);
                    class166.field2897[class36.method319(31, class155.field2749++)] = var107;
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 108) {
            int var108 = class276.field4398.method2338((byte) 32);
            int var109 = class276.field4398.method2339((byte) -46);
            if (var108 < -70000) {
                var109 += 32768;
            }
            class137 var110;
            if (var108 < 0) {
                var110 = null;
            } else {
                var110 = class146.method1167(arg0 + 1169843623, var108);
            }
            while (class276.field4398.field5353 < class308.field4906) {
                int var111 = class276.field4398.method2314((byte) 95);
                int var112 = class276.field4398.method2339((byte) -46);
                int var113 = 0;
                if (var112 != 0) {
                    var113 = class276.field4398.method2364(arg0 - 9078);
                    if (var113 == 255) {
                        var113 = class276.field4398.method2338((byte) 108);
                    }
                }
                if (var110 != null && var111 >= 0 && var111 < var110.field2379.length) {
                    var110.field2379[var111] = var112;
                    var110.field2461[var111] = var113;
                }
                class18.method184(var112 - 1, var113, var111, arg0 ^ 0x9, var109);
            }
            if (var110 != null) {
                class258.method1793(var110, 0);
            }
            class27.method248(-96);
            class239.field3913[class36.method319(31, class194.field3251++)] = class36.method319(var109, 32767);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 165) {
            int var114 = class276.field4398.method2328((byte) 123);
            int var115 = class276.field4398.method2364(-9069);
            class133.method1092(var115, var114, -60);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 23) {
            long var116 = class276.field4398.method2367((byte) -74);
            int var118 = class276.field4398.method2339((byte) -46);
            String var119 = class202.method1518(var118, 0).method665(0, class276.field4398);
            class263.method1815(class8.method48(var116, true), var119, true, (String) null, var118, 19);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 184) {
            int var120 = class276.field4398.method2350(false);
            int var121 = class276.field4398.method2339((byte) -46);
            int var122 = class276.field4398.method2328((byte) 127);
            if (class246.method1726(true, var122)) {
                class134.method1108((byte) -15, var120, var121);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 124) {
            int var123 = class276.field4398.method2328((byte) 118);
            int var124 = class276.field4398.method2375(4043);
            int var125 = class276.field4398.method2328((byte) 115);
            if (var125 == 65535) {
                var125 = -1;
            }
            if (class246.method1726(true, var123)) {
                class341.method2395(var124, -1, 1, 99, var125);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 126) {
            int var269 = class276.field4398.method2340(2);
            int var270 = class276.field4398.method2364(-9069);
            int var271 = class276.field4398.method2328((byte) 111);
            int var272 = class276.field4398.method2339((byte) -46);
            if (class246.method1726(true, var271)) {
                class228 var273 = (class228) class172.field2972.method732((long) var269, true);
                if (var273 != null) {
                    class58.method529(var273.field3833 != var272, var273, 50);
                }
                class89.method784(var272, var270, (byte) -108, var269);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 197) {
            int var266 = class276.field4398.method2363(arg0 ^ 0x7A);
            int var267 = class276.field4398.method2350(false);
            int var268 = class276.field4398.method2340(2);
            if (class246.method1726(true, var267)) {
                class226.method1647(var268, var266, 123);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 146) {
            int var126 = class276.field4398.method2339((byte) -46);
            if (class246.method1726(true, var126)) {
                class248.method1745(arg0 + 94);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 198) {
            class344.method2408((byte) 116);
            class40.field592 = -1;
            return false;
        } else if (class40.field592 == 104) {
            int var260 = class276.field4398.method2339((byte) -46);
            int var261 = class276.field4398.method2364(arg0 - 9078);
            int var262 = class276.field4398.method2364(-9069);
            int var263 = class276.field4398.method2339((byte) -46);
            int var264 = class276.field4398.method2364(-9069);
            int var265 = class276.field4398.method2364(-9069);
            if (class246.method1726(true, var260)) {
                method1809(arg0 ^ 0xFFFFFFB3, var261, var263, var264, var265, var262);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 18) {
            int var257 = class276.field4398.method2339((byte) -46);
            String var258 = class276.field4398.method2365(arg0 + 109);
            int var259 = class276.field4398.method2362(arg0 ^ 0x74);
            if (class246.method1726(true, var257)) {
                class175.method1357(var259, var258, arg0 + 20183);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 55) {
            int var127 = class276.field4398.method2362(103);
            int var128 = class276.field4398.method2328((byte) 123);
            int var129 = class276.field4398.method2369(true);
            int var130 = class276.field4398.method2362(arg0 + 110);
            if (class246.method1726(true, var128)) {
                class11.method106(var129, (byte) -39, (var127 << 16) + var130);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 176) {
            long var244 = class276.field4398.method2367((byte) 124);
            long var246 = (long) class276.field4398.method2339((byte) -46);
            boolean var248 = false;
            long var249 = (long) class276.field4398.method2317(21803);
            int var251 = class276.field4398.method2364(-9069);
            long var252 = (var246 << 32) + var249;
            int var254 = 0;
            label1520: while (true) {
                if (var254 >= 100) {
                    if (var251 <= 1) {
                        if ((!class37.field537 || class331.field5268) && !class330.field5256) {
                            for (int var255 = 0; var255 < class200.field3424; var255++) {
                                if (class20.field305[var255] == var244) {
                                    var248 = true;
                                    break label1520;
                                }
                            }
                        } else {
                            var248 = true;
                        }
                    }
                    break;
                }
                if (class172.field2977[var254] == var252) {
                    var248 = true;
                    break;
                }
                var254++;
            }
            if (!var248 && class134.field2348 == 0) {
                class172.field2977[class44.field688] = var252;
                class44.field688 = (class44.field688 + 1) % 100;
                String var256 = class323.method2229(class30.method280(class170.method1343(arg0 + 32758, class276.field4398), arg0 - 23596));
                if (var251 == 2 || var251 == 3) {
                    class170.method1339(7, var256, "<img=1>" + class8.method48(var244, true), (byte) -98);
                } else if (var251 == 1) {
                    class170.method1339(7, var256, "<img=0>" + class8.method48(var244, true), (byte) -98);
                } else {
                    class170.method1339(3, var256, class8.method48(var244, true), (byte) -98);
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 208) {
            class27.method248(arg0 + 78);
            class78.field1259 = class276.field4398.method2364(-9069);
            class40.field592 = -1;
            class110.field1867 = class99.field1606;
            return true;
        } else if (class40.field592 == 102) {
            int var131 = class276.field4398.method2339((byte) -46);
            if (var131 == 65535) {
                var131 = -1;
            }
            int var132 = class276.field4398.method2340(2);
            int var133 = class276.field4398.method2328((byte) 124);
            if (class246.method1726(true, var133)) {
                class341.method2395(var132, -1, 2, 99, var131);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 235) {
            int var242 = class276.field4398.method2340(arg0 - 7);
            int var243 = class276.field4398.method2328((byte) 124);
            class86.method768(false, var243, var242);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 49) {
            class27.method248(-109);
            int var134 = class276.field4398.method2348(255);
            int var135 = class276.field4398.method2364(-9069);
            int var136 = class276.field4398.method2369(true);
            class75.field1230[var134] = var136;
            class212.field3575[var134] = var135;
            field4246[var134] = 1;
            for (int var137 = 0; var137 < 98; var137++) {
                if (var136 >= class341.field5432[var137]) {
                    field4246[var134] = var137 + 2;
                }
            }
            class162.field2868[class36.method319(31, class248.field4034++)] = var134;
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 110) {
            long var226 = class276.field4398.method2367((byte) 123);
            class276.field4398.method2323(123);
            long var228 = class276.field4398.method2367((byte) 120);
            long var230 = (long) class276.field4398.method2339((byte) -46);
            long var232 = (long) class276.field4398.method2317(21803);
            int var234 = class276.field4398.method2364(-9069);
            int var235 = class276.field4398.method2339((byte) -46);
            boolean var236 = false;
            long var237 = (var230 << 32) + var232;
            int var239 = 0;
            label1457: while (true) {
                if (var239 < 100) {
                    if (class172.field2977[var239] != var237) {
                        var239++;
                        continue;
                    }
                    var236 = true;
                    break;
                }
                if (var234 <= 1) {
                    for (int var240 = 0; var240 < class200.field3424; var240++) {
                        if (class20.field305[var240] == var226) {
                            var236 = true;
                            break label1457;
                        }
                    }
                }
                break;
            }
            if (!var236 && class134.field2348 == 0) {
                class172.field2977[class44.field688] = var237;
                class44.field688 = (class44.field688 + 1) % 100;
                String var241 = class202.method1518(var235, arg0 ^ 0x9).method665(0, class276.field4398);
                if (var234 == 2 || var234 == 3) {
                    class263.method1815("<img=1>" + class8.method48(var226, true), var241, true, class8.method48(var228, true), var235, 20);
                } else if (var234 == 1) {
                    class263.method1815("<img=0>" + class8.method48(var226, true), var241, true, class8.method48(var228, true), var235, 20);
                } else {
                    class263.method1815(class8.method48(var226, true), var241, true, class8.method48(var228, true), var235, 20);
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 97) {
            int var138 = class276.field4398.method2364(-9069);
            int var139 = class276.field4398.method2328((byte) 111);
            if (class246.method1726(true, var139)) {
                class334.field5295 = var138;
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 86) {
            long var140 = class276.field4398.method2367((byte) 126);
            int var142 = class276.field4398.method2339((byte) -46);
            boolean var143 = false;
            byte var144 = class276.field4398.method2323(120);
            if ((Long.MIN_VALUE & var140) != 0L) {
                var143 = true;
            }
            if (var143) {
                if (class298.field4746 == 0) {
                    class40.field592 = -1;
                    return true;
                }
                long var145 = var140 & Long.MAX_VALUE;
                boolean var147 = false;
                int var148;
                for (var148 = 0; var148 < class298.field4746 && (class295.field4720[var148].field5062 != var145 || class295.field4720[var148].field4299 != var142); var148++) {
                }
                if (var148 < class298.field4746) {
                    while (class298.field4746 - 1 > var148) {
                        class295.field4720[var148] = class295.field4720[var148 + 1];
                        var148++;
                    }
                    class298.field4746--;
                    class295.field4720[class298.field4746] = null;
                }
            } else {
                String var149 = class276.field4398.method2365(arg0 + 91);
                class269 var150 = new class269();
                var150.field5062 = var140;
                var150.field4308 = class195.method1467(var150.field5062, -11026);
                var150.field4301 = var149;
                var150.field4299 = var142;
                var150.field4307 = var144;
                int var151;
                for (var151 = class298.field4746 - 1; var151 >= 0; var151--) {
                    int var152 = class295.field4720[var151].field4308.compareTo(var150.field4308);
                    if (var152 == 0) {
                        class295.field4720[var151].field4299 = var142;
                        class295.field4720[var151].field4307 = var144;
                        class295.field4720[var151].field4301 = var149;
                        class214.field3599 = class99.field1606;
                        if (class38.field550 == var140) {
                            class201.field3428 = var144;
                        }
                        class40.field592 = -1;
                        return true;
                    }
                    if (var152 < 0) {
                        break;
                    }
                }
                if (class298.field4746 >= class295.field4720.length) {
                    class40.field592 = -1;
                    return true;
                }
                for (int var153 = class298.field4746 - 1; var153 > var151; var153--) {
                    class295.field4720[var153 + 1] = class295.field4720[var153];
                }
                if (class298.field4746 == 0) {
                    class295.field4720 = new class269[100];
                }
                class295.field4720[var151 + 1] = var150;
                class298.field4746++;
                if (class38.field550 == var140) {
                    class201.field3428 = var144;
                }
            }
            class214.field3599 = class99.field1606;
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 117) {
            int var223 = class276.field4398.method2375(4043);
            int var224 = class276.field4398.method2350(false);
            if (class246.method1726(true, var224)) {
                int var225 = 0;
                if (class218.field3632.field3477 != null) {
                    var225 = class218.field3632.field3477.method2008(105);
                }
                class341.method2395(var223, -1, 3, 99, var225);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 181) {
            class241.method1693(class85.field1369, class308.field4906, class276.field4398, (byte) -74);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 248) {
            int var222 = class276.field4398.method2364(arg0 - 9078);
            if (class276.field4398.method2364(-9069) == 0) {
                class75.field1227[var222] = new class72();
            } else {
                class276.field4398.field5353--;
                class75.field1227[var222] = new class72(class276.field4398);
            }
            class194.field3253 = class99.field1606;
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 7) {
            int var154 = class276.field4398.method2364(-9069);
            int var155 = var154 >> 5;
            int var156 = var154 & 0x1F;
            if (var156 == 0) {
                class311.field4922[var155] = null;
                class40.field592 = -1;
                return true;
            }
            class156 var157 = new class156();
            var157.field2764 = var156;
            var157.field2761 = class276.field4398.method2364(-9069);
            if (var157.field2761 >= 0 && class4.field63.length > var157.field2761) {
                if (var157.field2764 == 1 || var157.field2764 == 10) {
                    var157.field2765 = class276.field4398.method2339((byte) -46);
                    class276.field4398.field5353 += 5;
                } else if (var157.field2764 >= 2 && var157.field2764 <= 6) {
                    if (var157.field2764 == 2) {
                        var157.field2763 = 64;
                        var157.field2775 = 64;
                    }
                    if (var157.field2764 == 3) {
                        var157.field2763 = 0;
                        var157.field2775 = 64;
                    }
                    if (var157.field2764 == 4) {
                        var157.field2763 = 128;
                        var157.field2775 = 64;
                    }
                    if (var157.field2764 == 5) {
                        var157.field2775 = 0;
                        var157.field2763 = 64;
                    }
                    if (var157.field2764 == 6) {
                        var157.field2763 = 64;
                        var157.field2775 = 128;
                    }
                    var157.field2764 = 2;
                    var157.field2766 = class276.field4398.method2339((byte) -46);
                    var157.field2770 = class276.field4398.method2339((byte) -46);
                    var157.field2769 = class276.field4398.method2364(arg0 - 9078);
                    var157.field2772 = class276.field4398.method2339((byte) -46);
                }
                var157.field2771 = class276.field4398.method2339((byte) -46);
                if (var157.field2771 == 65535) {
                    var157.field2771 = -1;
                }
                class311.field4922[var155] = var157;
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 88) {
            int var158 = class276.field4398.method2338((byte) 26);
            int var159 = class276.field4398.method2339((byte) -46);
            int var160 = class276.field4398.method2339((byte) -46);
            if (class246.method1726(true, var160)) {
                class351.method2445(var159, true, var158);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 247) {
            int var219 = class276.field4398.method2369(true);
            class137 var220 = class146.method1167(arg0 + 1169843623, var219);
            for (int var221 = 0; var221 < var220.field2379.length; var221++) {
                var220.field2379[var221] = -1;
                var220.field2379[var221] = 0;
            }
            class258.method1793(var220, 0);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 231) {
            int var213 = class276.field4398.method2339((byte) -46);
            int var214 = class276.field4398.method2364(-9069);
            int var215 = class276.field4398.method2364(-9069);
            int var216 = class276.field4398.method2364(-9069);
            int var217 = class276.field4398.method2364(-9069);
            int var218 = class276.field4398.method2339((byte) -46);
            if (class246.method1726(true, var213)) {
                class104.field1745[var214] = true;
                class329.field5243[var214] = var215;
                class42.field623[var214] = var216;
                class250.field4057[var214] = var217;
                class48.field734[var214] = var218;
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 74) {
            int var203 = class276.field4398.method2339((byte) -46);
            if (var203 == 65535) {
                var203 = -1;
            }
            int var204 = class276.field4398.method2350(false);
            int var205 = class276.field4398.method2328((byte) 118);
            int var206 = class276.field4398.method2339((byte) -46);
            if (var206 == 65535) {
                var206 = -1;
            }
            int var207 = class276.field4398.method2340(2);
            if (class246.method1726(true, var205)) {
                for (int var208 = var206; var208 <= var203; var208++) {
                    long var209 = ((long) var207 << 32) + (long) var208;
                    class57 var211 = (class57) class215.field3606.method732(var209, true);
                    class57 var212;
                    if (var211 != null) {
                        var212 = new class57(var211.field891, var204);
                        var211.method2195(-1);
                    } else if (var208 == -1) {
                        var212 = new class57(class146.method1167(1169843632, var207).field2368.field891, var204);
                    } else {
                        var212 = new class57(0, var204);
                    }
                    class215.field3606.method725(var209, var212, 1);
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 62) {
            int var161 = class276.field4398.method2339((byte) -46);
            int var162 = class276.field4398.method2375(4043);
            int var163 = class276.field4398.method2322(arg0 ^ 0xFFFFFF89);
            if (class246.method1726(true, var161)) {
                class20.method203(var162, var163, 28);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 90) {
            int var197 = class276.field4398.method2339((byte) -46);
            int var198 = class276.field4398.method2364(arg0 - 9078);
            int var199 = class276.field4398.method2364(-9069);
            int var200 = class276.field4398.method2339((byte) -46);
            int var201 = class276.field4398.method2364(-9069);
            int var202 = class276.field4398.method2364(-9069);
            if (class246.method1726(true, var197)) {
                class283.method1930(var201, var198, (byte) 79, var199, true, var202, var200);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 20) {
            int var164 = class276.field4398.method2348(255);
            int var165 = class276.field4398.method2355(18113);
            int var166 = class276.field4398.method2348(255);
            class205.field3497 = var165 >> 1;
            class218.field3632.method1536(var166, (var165 & 0x1) == 1, var164, (byte) 101);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 246) {
            int var167 = class276.field4398.method2369(true);
            int var168 = class276.field4398.method2339((byte) -46);
            int var169 = class276.field4398.method2350(false);
            if (class246.method1726(true, var169)) {
                class204.method1529(var167, var168, (byte) -21);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 6) {
            long var170 = class276.field4398.method2367((byte) 120);
            long var172 = (long) class276.field4398.method2339((byte) -46);
            long var174 = (long) class276.field4398.method2317(arg0 ^ 0x5522);
            int var176 = class276.field4398.method2364(-9069);
            int var177 = class276.field4398.method2339((byte) -46);
            long var178 = (var172 << 32) + var174;
            boolean var180 = false;
            int var181 = 0;
            label1370: while (true) {
                if (var181 >= 100) {
                    if (var176 <= 1) {
                        for (int var182 = 0; var182 < class200.field3424; var182++) {
                            if (class20.field305[var182] == var170) {
                                var180 = true;
                                break label1370;
                            }
                        }
                    }
                    break;
                }
                if (class172.field2977[var181] == var178) {
                    var180 = true;
                    break;
                }
                var181++;
            }
            if (!var180 && class134.field2348 == 0) {
                class172.field2977[class44.field688] = var178;
                class44.field688 = (class44.field688 + 1) % 100;
                String var183 = class202.method1518(var177, 0).method665(0, class276.field4398);
                if (var176 == 2) {
                    class263.method1815("<img=1>" + class8.method48(var170, true), var183, true, (String) null, var177, 18);
                } else if (var176 == 1) {
                    class263.method1815("<img=0>" + class8.method48(var170, true), var183, true, (String) null, var177, 18);
                } else {
                    class263.method1815(class8.method48(var170, true), var183, true, (String) null, var177, 18);
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 5) {
            class240.field3917 = class276.field4398.method2364(arg0 ^ 0xFFFFDC9A);
            class226.field3813 = class276.field4398.method2364(-9069);
            class330.field5261 = class276.field4398.method2364(-9069);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 121) {
            int var195 = class276.field4398.method2350(false);
            byte var196 = class276.field4398.method2323(105);
            class86.method768(false, var195, var196);
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 243) {
            class200.field3424 = class308.field4906 / 8;
            for (int var194 = 0; var194 < class200.field3424; var194++) {
                class20.field305[var194] = class276.field4398.method2367((byte) 44);
                class264.field4270[var194] = class26.method244(1, class20.field305[var194]);
                class322.field5121[var194] = false;
            }
            class51.field809 = class99.field1606;
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 31) {
            byte var191 = class276.field4398.method2373((byte) -44);
            int var192 = class276.field4398.method2339((byte) -46);
            int var193 = class276.field4398.method2350(false);
            if (class246.method1726(true, var192)) {
                class351.method2445(var193, true, var191);
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 214) {
            class144.field2628 = class276.field4398.method2362(117) * 30;
            class110.field1867 = class99.field1606;
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 2) {
            int var184 = class276.field4398.method2375(4043);
            int var185 = class276.field4398.method2362(arg0 ^ 0x55);
            int var186 = class276.field4398.method2369(true);
            int var187 = class276.field4398.method2350(false);
            if (var187 == 65535) {
                var187 = -1;
            }
            if (class246.method1726(true, var185)) {
                class137 var188 = class146.method1167(1169843632, var184);
                if (var188.field2402) {
                    class123.method1035(var184, (byte) -98, var186, var187);
                    class134 var189 = class5.method31(-1731690365, var187);
                    class32.method295(var184, var189.field2326, var189.field2294, 8, var189.field2287);
                    class21.method210(var189.field2307, var189.field2321, 0, var184, var189.field2299);
                } else if (var187 == -1) {
                    class40.field592 = -1;
                    var188.field2389 = 0;
                    return true;
                } else {
                    class134 var190 = class5.method31(-1731690365, var187);
                    var188.field2502 = var190.field2294 * 100 / var186;
                    var188.field2430 = var190.field2326;
                    var188.field2389 = 4;
                    var188.field2367 = var190.field2287;
                    var188.field2382 = var187;
                    class258.method1793(var188, 0);
                }
            }
            class40.field592 = -1;
            return true;
        } else if (class40.field592 == 44) {
            class320.field5069 = class276.field4398.method2355(18113);
            class242.field3956 = class276.field4398.method2364(-9069);
            while (class276.field4398.field5353 < class308.field4906) {
                class40.field592 = class276.field4398.method2364(-9069);
                class211.method1567(-1);
            }
            class40.field592 = -1;
            return true;
        } else {
            class88.method775((Throwable) null, "T1 - " + class40.field592 + "," + class338.field5410 + "," + class35.field509 + " - " + class308.field4906, true);
            class344.method2408((byte) 116);
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII)V", line = 2967)
    public static final void method1809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class286.field4550 = arg4;
        class248.field4028 = arg5;
        class303.field4789 = arg3;
        field4245++;
        class168.field2930 = arg1;
        class349.field5544 = arg2;
        if (class286.field4550 >= 100) {
            int var6 = class168.field2930 * 128 + 64;
            int var7 = class248.field4028 * 128 + 64;
            int var8 = class223.method1627((byte) -125, var7, var6, class205.field3497) - class349.field5544;
            int var9 = var8 - class139.field2563;
            int var10 = var7 - class32.field454;
            int var11 = var6 - class269.field4309;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class141.field2592 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class311.field4924 = (int) (Math.atan2((double) var11, (double) var10) * -325.949D) & 0x7FF;
            if (class141.field2592 < 128) {
                class141.field2592 = 128;
            }
            if (class141.field2592 > 383) {
                class141.field2592 = 383;
            }
        }
        int var13 = -103 % ((-arg0 - 19) / 49);
        class191.field3194 = 2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 3012)
    public static void method1810(boolean arg0) {
        field4251 = null;
        field4248 = null;
        if (arg0) {
            field4246 = (int[]) null;
        }
        field4246 = null;
        field4247 = null;
        field4252 = null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V", line = 3026)
    public static final void method1811(boolean arg0) {
        field4244++;
        if (client.field4377 != null) {
            class36 var1 = new class36();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    client.field4377[var2][var3] = var1;
                }
            }
        }
        if (!arg0) {
            field4249 = -14;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILcg;Lcg;)V", line = 3063)
    public static final void method1812(int arg0, class49 arg1, class49 arg2) {
        if (arg0 <= 101) {
            field4247 = (class51) null;
        }
        class213.field3585 = arg1;
        field4241++;
        class318.field5050 = arg2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([BB)Ljc;", line = 3077)
    public static final class323 method1813(byte[] arg0, byte arg1) {
        field4250++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 17) {
            method1811(false);
        }
        class323 var2;
        if (class43.field680) {
            var2 = new class231(arg0, class352.field5575, class104.field1743, class39.field585, class123.field2138, class191.field3205);
        } else {
            var2 = new class244(arg0, class352.field5575, class104.field1743, class39.field585, class123.field2138, class191.field3205);
        }
        class15.method151(0);
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIIILve;II)Lwb;", line = 3106)
    public static final class171 method1814(boolean arg0, int arg1, int arg2, int arg3, class293 arg4, int arg5, int arg6) {
        if (arg3 != -7550) {
            method1812(79, (class49) null, (class49) null);
        }
        field4243++;
        int var8 = (arg5 << 19) + ((arg0 ? 65536 : 0) + arg2 + (arg1 << 17));
        long var9 = (long) arg6 * 3147483667L + (long) var8 * 3849834839L;
        class171 var11 = (class171) class253.field4069.method467(true, var9);
        if (var11 != null) {
            return var11;
        }
        class62.field949 = false;
        class171 var12 = class135.method1113(arg2, arg5, arg1, false, -1, arg4, arg0, false, arg6);
        if (var12 != null && !class62.field949) {
            class253.field4069.method465(var12, var9, (byte) 34);
        }
        return var12;
    }
}
