import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class318 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[Ldc;")
    public static class109[] field4943 = new class109[50];

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Z")
    public static boolean field4946 = false;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4944 = new CRC32();

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "F")
    public static float field4948;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 9)
    public static final void method2180(String arg0, boolean arg1) {
        if (arg1) {
            method2183(54);
        }
        field4949++;
        if (class235.field3699 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class140.method1073((byte) 78);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class252.method1782("mem=" + var4 + "k", 0, (String) null, false);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class140.method1073((byte) 78);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class252.method1782("Memory before cleanup=" + var7 + "k", 0, (String) null, false);
                class279.method1992(32130);
                class140.method1073((byte) 78);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class252.method1782("Memory after cleanup=" + var9 + "k", 0, (String) null, false);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class252.method1782("Number of player models in cache:" + class93.method668((byte) -113), 0, (String) null, arg1);
            }
            if (class265.field4126 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class214.field3406);
                System.out.println("oncard_2d:" + class214.field3411);
                System.out.println("oncard_texture:" + class214.field3410);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class323.method2211(-1);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class275.field4276.method699(0);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class275.field4276.method697((byte) 35);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class83.field1235.method2228(-111);
                class127.field2032.method134((byte) -14);
                class275.field4276.method686(0);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class132.field2112 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class320.method2196(25, 0);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class4.field28 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class4.field28 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class240.method1705(-1, 0, -1, false, -1);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class240.method1705(-1, 1, -1, false, -1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class240.method1705(-1, 2, -1, false, -1);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class240.method1705(-1, 3, 768, false, 1024);
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class244.field3772[var10].field879[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.startsWith("::setparticles")) {
                class47.method370(class294.method2067(arg0.substring(15), (byte) 125));
                class41.method334(class83.field1235, true);
                class70.field1104 = false;
            }
            if (arg0.startsWith("::fps ") && class76.field1162 != 0) {
                class75.method562((byte) -50, class294.method2067(arg0.substring(6), (byte) -28));
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class274.field4261 = class294.method2067(arg0.substring(12).trim(), (byte) 126);
                class252.method1782("rect_debug=" + class274.field4261, 0, (String) null, arg1);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class31.field523 = true;
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class68.field1094) {
                    class68.field1094 = false;
                    class252.method1782("Forced tweening disabled.", 0, (String) null, false);
                } else {
                    class68.field1094 = true;
                    class252.method1782("Forced tweening ENABLED!", 0, (String) null, false);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class277.field4288) {
                    System.out.println("Shift-click disabled.");
                    class277.field4288 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class277.field4288 = true;
                }
            }
        }
        class79.field1201++;
        class269.field4191.method246(arg1, 132);
        class269.field4191.method772((byte) -60, arg0.length() - 1);
        class269.field4191.method754((byte) 92, arg0.substring(2));
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIIZII)Z", line = 228)
    public static final boolean method2181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field4945++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class125.field1997[var12][var13] = 0;
                class86.field1321[var12][var13] = 99999999;
            }
        }
        class125.field1997[arg2][arg1] = 99;
        class86.field1321[arg2][arg1] = 0;
        int var14 = arg2;
        int var15 = 0;
        int var16 = arg1;
        byte var17 = 0;
        class217.field3470[var17] = arg2;
        boolean var18 = false;
        int var32 = var17 + 1;
        class297.field4688[var17] = arg1;
        int[][] var19 = class244.field3772[class41.field734].field879;
        while (var15 != var32) {
            var14 = class217.field3470[var15];
            var16 = class297.field4688[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg3 == var14 && arg10 == var16) {
                var18 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class244.field3772[class41.field734].method422(arg3, arg10, (byte) -120, var16, arg6 - 1, arg0, var14, 1)) {
                    var18 = true;
                    break;
                }
                if (arg6 < 10 && class244.field3772[class41.field734].method410(arg3, (byte) 97, arg6 - 1, var16, arg10, 1, var14, arg0)) {
                    var18 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg5 != 0 && class244.field3772[class41.field734].method425(arg7, var16, -40, var14, 1, arg4, arg3, arg5, arg10)) {
                var18 = true;
                break;
            }
            int var20 = class86.field1321[var14][var16] + 1;
            if (var14 > 0 && class125.field1997[var14 - 1][var16] == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0) {
                class217.field3470[var32] = var14 - 1;
                class297.field4688[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14 - 1][var16] = 2;
                class86.field1321[var14 - 1][var16] = var20;
            }
            if (var14 < 103 && class125.field1997[var14 + 1][var16] == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0) {
                class217.field3470[var32] = var14 + 1;
                class297.field4688[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14 + 1][var16] = 8;
                class86.field1321[var14 + 1][var16] = var20;
            }
            if (var16 > 0 && class125.field1997[var14][var16 - 1] == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class217.field3470[var32] = var14;
                class297.field4688[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14][var16 - 1] = 1;
                class86.field1321[var14][var16 - 1] = var20;
            }
            if (var16 < 103 && class125.field1997[var14][var16 + 1] == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class217.field3470[var32] = var14;
                class297.field4688[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14][var16 + 1] = 4;
                class86.field1321[var14][var16 + 1] = var20;
            }
            if (var14 > 0 && var16 > 0 && class125.field1997[var14 - 1][var16 - 1] == 0 && (var19[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class217.field3470[var32] = var14 - 1;
                class297.field4688[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14 - 1][var16 - 1] = 3;
                class86.field1321[var14 - 1][var16 - 1] = var20;
            }
            if (var14 < 103 && var16 > 0 && class125.field1997[var14 + 1][var16 - 1] == 0 && (var19[var14 + 1][var16 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class217.field3470[var32] = var14 + 1;
                class297.field4688[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14 + 1][var16 - 1] = 9;
                class86.field1321[var14 + 1][var16 - 1] = var20;
            }
            if (var14 > 0 && var16 < 103 && class125.field1997[var14 - 1][var16 + 1] == 0 && (var19[var14 - 1][var16 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class217.field3470[var32] = var14 - 1;
                class297.field4688[var32] = var16 + 1;
                class125.field1997[var14 - 1][var16 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class86.field1321[var14 - 1][var16 + 1] = var20;
            }
            if (var14 < 103 && var16 < 103 && class125.field1997[var14 + 1][var16 + 1] == 0 && (var19[var14 + 1][var16 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class217.field3470[var32] = var14 + 1;
                class297.field4688[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field1997[var14 + 1][var16 + 1] = 12;
                class86.field1321[var14 + 1][var16 + 1] = var20;
            }
        }
        class122.field1951 = 0;
        if (!var18) {
            if (!arg9) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg3 - var22; var24 <= arg3 + var22; var24++) {
                for (int var25 = arg10 - var22; var25 <= (arg10 + var22); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class86.field1321[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg3) {
                            var26 = arg3 - var24;
                        } else if (var24 > arg3 + arg7 - 1) {
                            var26 = var24 - arg3 - (arg7 - 1);
                        }
                        int var27 = 0;
                        if (var25 < arg10) {
                            var27 = arg10 - var25;
                        } else if (var25 > arg5 + arg10 - 1) {
                            var27 = -arg10 - (arg5 - var25 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var23 > class86.field1321[var24][var25]) {
                            var21 = var28;
                            var16 = var25;
                            var14 = var24;
                            var23 = class86.field1321[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg2 == var14 && arg1 == var16) {
                return false;
            }
            class122.field1951 = 1;
        }
        class217.field3470[arg8] = var14;
        int var29 = arg8 + 1;
        class297.field4688[arg8] = var16;
        int var30;
        int var31 = var30 = class125.field1997[var14][var16];
        while (arg2 != var14 || arg1 != var16) {
            if (var30 != var31) {
                var30 = var31;
                class217.field3470[var29] = var14;
                class297.field4688[var29++] = var16;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            var31 = class125.field1997[var14][var16];
        }
        if (var29 > 0) {
            class303.method2108(arg11, var29, 1);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 514)
    public static void method2182(int arg0) {
        field4943 = null;
        if (arg0 != 0) {
            method2182(-24);
        }
        field4944 = null;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 539)
    public static final void method2183(int arg0) {
        class143.field2253 = class121.method929(35, 8, 8, true, 4096, 0.4F, 2048, 4);
        if (arg0 <= 41) {
            method2182(-124);
        }
        field4947++;
    }
}
