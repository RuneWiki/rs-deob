import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class126 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2017 = -1;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2019 = 10;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lpk;")
    public static class120 field2024;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Z")
    public static boolean field2018;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[[B")
    public static byte[][] field2020;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 9)
    public static void method992(boolean arg0) {
        if (arg0) {
            field2020 = (byte[][]) null;
            field2024 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/lang/String;)V", line = 20)
    public static final void method993(byte arg0, String arg1) {
        field2023++;
        if (class233.field3543 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class57.method476((byte) 47);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class129.method1003(0, "mem=" + var4 + "k", (String) null, -96);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class57.method476((byte) 47);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class129.method1003(0, "Memory before cleanup=" + var7 + "k", (String) null, -76);
                class101.method814(0);
                class57.method476((byte) 47);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class129.method1003(0, "Memory after cleanup=" + var9 + "k", (String) null, 110);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class129.method1003(0, "Number of player models in cache:" + class84.method665(false), (String) null, 118);
            }
            if (class162.field2623 && arg1.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class177.field2823);
                System.out.println("oncard_2d:" + class177.field2821);
                System.out.println("oncard_texture:" + class177.field2820);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class41.method379(40);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class53.field809.method2005(114);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class53.field809.method2009((byte) -32);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class92.field1484.method550((byte) -7);
                class319.field5005.method378((byte) -123);
                class53.field809.method1995(128);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class313.field4930 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class117.method921((byte) 37, 25);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class318.field4993 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class318.field4993 = false;
            }
            if (arg1.equalsIgnoreCase("::wm0")) {
                class184.method1342(-1, -1, -1, false, 0);
            }
            if (arg1.equalsIgnoreCase("::wm1")) {
                class184.method1342(-1, -1, -1, false, 1);
            }
            if (arg1.equalsIgnoreCase("::wm2")) {
                class184.method1342(-1, -1, -1, false, 2);
            }
            if (arg1.equalsIgnoreCase("::wm3")) {
                class184.method1342(-1, 1024, 768, false, 3);
            }
            if (arg1.startsWith("::setba")) {
                class144.field2326 = class299.method2119(arg1.substring(8), (byte) -126);
                class281.method1976(class92.field1484, -7136);
                class117.field1905 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class236.method1688(class299.method2119(arg1.substring(15), (byte) -125));
                class281.method1976(class92.field1484, -7136);
                class117.field1905 = false;
            }
            if (arg1.startsWith("::fps ") && class260.field3874 != 0) {
                class103.method837(class299.method2119(arg1.substring(6), (byte) -24), 10);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class16.field329 = class299.method2119(arg1.substring(12).trim(), (byte) 80);
                class129.method1003(0, "rect_debug=" + class16.field329, (String) null, -77);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class320.field5011 = true;
            }
            if (arg1.startsWith("::hdr") && class162.field2623 && !class237.method1691(!class54.method459(), 504172684)) {
                class129.method1003(0, "Failed to enable hdr", (String) null, -91);
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class197.field3039) {
                    class197.field3039 = false;
                    class129.method1003(0, "Forced tweening disabled.", (String) null, 113);
                } else {
                    class197.field3039 = true;
                    class129.method1003(0, "Forced tweening ENABLED!", (String) null, 56);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class281.field4404) {
                    System.out.println("Shift-click disabled.");
                    class281.field4404 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class281.field4404 = true;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class129.method1003(0, "x:" + (class345.field5363.field4671 >> 7) + " z:" + (class345.field5363.field4672 >> 7) + " groundh:" + class85.field1374[class75.field1153][class345.field5363.field4671 >> 7][class345.field5363.field4672 >> 7], (String) null, 53);
            }
        }
        int var10 = 113 / ((-arg0 - 42) / 35);
        class305.field4849++;
        class209.field3305.method1808((byte) -74, 206);
        class209.field3305.method21(-127, arg1.length() - 1);
        class209.field3305.method12(arg1.substring(2), (byte) -47);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Llk;I)V", line = 249)
    public static final void method994(class294 arg0, int arg1) {
        if (class307.field4869 == arg0.field4648 || arg0.field4660 == -1 || arg0.field4667 != 0 || arg0.field4687 + 1 > class63.method503(arg0.field4660, (byte) 97).field568[arg0.field4655]) {
            int var2 = arg0.field4648 - arg0.field4627;
            int var3 = class307.field4869 - arg0.field4627;
            int var4 = arg0.field4701 * 128 + (arg0.method738(-6421) * 64);
            int var5 = arg0.field4644 * 128 + arg0.method738(-6421) * 64;
            int var6 = arg0.field4690 * 128 + arg0.method738(-6421) * 64;
            int var7 = arg0.field4628 * 128 + arg0.method738(-6421) * 64;
            arg0.field4671 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field4672 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
        }
        if (arg0.field4608 == 0) {
            arg0.field4630 = 1024;
        }
        arg0.field4707 = 0;
        if (arg0.field4608 == 1) {
            arg0.field4630 = 1536;
        }
        if (arg1 > -57) {
            return;
        }
        field2021++;
        if (arg0.field4608 == 2) {
            arg0.field4630 = 0;
        }
        if (arg0.field4608 == 3) {
            arg0.field4630 = 512;
        }
        arg0.field4682 = arg0.field4630;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lhe;IIIIII)Z", line = 298)
    public static final boolean method995(class101 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2022++;
        if (arg2 < 11) {
            field2020 = (byte[][]) ((byte[][]) null);
        }
        class65 var7 = class113.method878(arg0.field1681, (byte) -99);
        if (var7.field949 == -1) {
            return true;
        }
        int var9;
        if (arg0.field1680) {
            int var8 = arg0.field1676 + arg6;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class186 var10 = var7.method521(true, arg0.field1627, var9);
        if (var10 == null) {
            return false;
        }
        int var11 = arg0.field1626;
        int var12 = arg0.field1623;
        if ((var9 & 0x1) == 1) {
            var11 = arg0.field1623;
            var12 = arg0.field1626;
        }
        int var13 = var10.field3066;
        int var14 = var10.field3070;
        if (var7.field959) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field957 == 0) {
            var10.method1357(arg5 * 4 + 48, 48 - -((-var12 + 104 - arg4) * 4), var13, var14);
        } else {
            var10.method1348(arg5 * 4 + 48, (-arg4 + 104 + -var12) * 4 + 48, var13, var14, var7.field957);
        }
        return true;
    }
}
