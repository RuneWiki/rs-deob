import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class55 {

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field821 = "Loaded title screen";

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field824 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Llb;")
    public static class211 field820;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BZIIIII)V", line = 12)
    public static final void method485(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field823++;
        if (class263.field3940 == arg3 && class290.field4569 == arg6 && class167.field2507 == arg2 || class252.method1753(-8090)) {
            return;
        }
        class167.field2507 = arg2;
        class290.field4569 = arg6;
        class263.field3940 = arg3;
        if (class252.method1753(-8090)) {
            class167.field2507 = 0;
        }
        if (arg1) {
            class113.method889(107, 28);
        } else {
            class113.method889(108, 25);
        }
        class47.method421(class107.field1646, true, (byte) 79);
        int var7 = class110.field1744;
        class110.field1744 = arg6 * 8 - 48;
        int var8 = class302.field4735;
        class302.field4735 = (arg3 - 6) * 8;
        class228.field3527 = class210.method1496(1, class290.field4569 * 8, class263.field3940 * 8);
        class12.field133 = null;
        int var9 = class302.field4735 - var8;
        int var10 = class302.field4735;
        int var11 = class110.field1744 - var7;
        int var12 = class110.field1744;
        if (arg1) {
            class122.field1923 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class45 var14 = class161.field2394[var13];
                if (var14 != null) {
                    var14.field4496 -= var11 * 128;
                    var14.field4507 -= var9 * 128;
                    if (var14.field4507 >= 0 && var14.field4507 <= 13184 && var14.field4496 >= 0 && var14.field4496 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field4477[var15] -= var9;
                            var14.field4470[var15] -= var11;
                        }
                        class126.field1995[class122.field1923++] = var13;
                    } else {
                        class161.field2394[var13].method412((class183) null, true);
                        class161.field2394[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class45 var17 = class161.field2394[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field4477[var18] -= var9;
                        var17.field4470[var18] -= var11;
                    }
                    var17.field4507 -= var9 * 128;
                    var17.field4496 -= var11 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class121 var20 = class319.field4964[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field4477[var21] -= var9;
                    var20.field4470[var21] -= var11;
                }
                var20.field4507 -= var9 * 128;
                var20.field4496 -= var11 * 128;
            }
        }
        class50.field775 = arg2;
        class235.field3602.method932((byte) 72, arg5, arg4, false);
        byte var22 = 104;
        byte var23 = 0;
        byte var24 = 0;
        byte var25 = 1;
        if (var9 < 0) {
            var25 = -1;
            var23 = 103;
            var22 = -1;
        }
        byte var26 = 104;
        byte var27 = 1;
        if (var11 < 0) {
            var26 = -1;
            var27 = -1;
            var24 = 103;
        }
        if (arg0 != -90) {
            return;
        }
        for (int var28 = var23; var28 != var22; var28 += var25) {
            for (int var29 = var24; var29 != var26; var29 += var27) {
                int var30 = var9 + var28;
                int var31 = var11 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class281.field4336[var32][var28][var29] = class281.field4336[var32][var30][var31];
                    } else {
                        class281.field4336[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class152 var33 = (class152) class310.field4833.method986(false); var33 != null; var33 = (class152) class310.field4833.method982(arg0 ^ 0xFFFFC5BB)) {
            var33.field2288 -= var9;
            var33.field2285 -= var11;
            if (var33.field2288 < 0 || var33.field2285 < 0 || var33.field2288 >= 104 || var33.field2285 >= 104) {
                var33.method1554((byte) -72);
            }
        }
        if (arg1) {
            class311.field4845 -= var11 * 128;
            class220.field3455 -= var9 * 128;
            class329.field5086 -= var11;
            class110.field1745 -= var9;
            class53.field802 -= var11;
            class51.field791 -= var9;
        } else {
            class78.field1104 = 1;
        }
        class111.field1754 = 0;
        if (class327.field5075 != 0) {
            class261.field3868 -= var11;
            class327.field5075 -= var9;
        }
        if (class36.field534 && arg1 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class32.method227((byte) 121);
        }
        class222.field3471 = -1;
        class159.field2376.method980(arg0 + 91);
        class184.field2801.method980(arg0 ^ 0xFFFFFFA7);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 265)
    public static void method486(int arg0) {
        if (arg0 != 103) {
            method485((byte) 70, false, 113, -105, -88, -49, 39);
        }
        field821 = null;
        field820 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)I", line = 288)
    public static final int method487(int arg0, int arg1, int arg2) {
        field822++;
        if (arg2 != -1) {
            field820 = (class211) null;
        }
        int var3 = class180.method1306(arg0 + 91923, 4, -1237, arg1 + 45365) - (-(class180.method1306(arg0 + 37821, 2, -1237, arg1 + 10294) - 128 >> 1) - (class180.method1306(arg0, 1, -1237, arg1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 315)
    public class55() {
        new class308();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 331)
    public static final void method488(String arg0, int arg1) {
        field819++;
        if (class287.field4421 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class71.method593(false);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class38.method352(false, 0, "mem=" + var4 + "k", (String) null);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class71.method593(false);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class38.method352(false, 0, "Memory before cleanup=" + var7 + "k", (String) null);
                class152.method1121((byte) 99);
                class71.method593(false);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class38.method352(false, 0, "Memory after cleanup=" + var9 + "k", (String) null);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class38.method352(false, 0, "Number of player models in cache:" + class230.method1634(25), (String) null);
            }
            if (class36.field534 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class166.field2500);
                System.out.println("oncard_2d:" + class166.field2495);
                System.out.println("oncard_texture:" + class166.field2499);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class198.method1440((byte) 22);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class110.field1746.method53(false);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class110.field1746.method46((byte) -30);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class301.field4715.method171(false);
                class297.field4661.method914(-1);
                class110.field1746.method43(0);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class79.field1114 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class113.method889(arg1 ^ 0x7DA4, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class87.field1285 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class87.field1285 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class94.method743(0, -1, arg1 ^ 0x7DA4, -1, false);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class94.method743(1, -1, 110, -1, false);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class94.method743(2, -1, 125, -1, false);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class94.method743(3, 768, 126, 1024, false);
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class90.field1309[var10].field5037[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.startsWith("::setparticles")) {
                class254.method1779(class28.method194(arg0.substring(15), arg1 - 32207));
                class128.method987(arg1 ^ 0x7DD9, class301.field4715);
                class253.field3771 = false;
            }
            if (arg0.startsWith("::fps ") && class20.field222 != 0) {
                class128.method976(-6588, class28.method194(arg0.substring(6), 10));
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class301.field4718 = class28.method194(arg0.substring(12).trim(), 10);
                class38.method352(false, 0, "rect_debug=" + class301.field4718, (String) null);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class199.field3147 = true;
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class16.field188) {
                    class16.field188 = false;
                    class38.method352(false, 0, "Forced tweening disabled.", (String) null);
                } else {
                    class16.field188 = true;
                    class38.method352(false, 0, "Forced tweening ENABLED!", (String) null);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class11.field116) {
                    System.out.println("Shift-click disabled.");
                    class11.field116 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class11.field116 = true;
                }
            }
        }
        class176.field2625++;
        if (arg1 != 32217) {
            method486(-47);
        }
        class159.field2372.method59(8, (byte) 73);
        class159.field2372.method262((byte) 81, arg0.length() - 1);
        class159.field2372.method277(arg0.substring(2), arg1 - 27444);
    }
}
