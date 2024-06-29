import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class244 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lsl;")
    private class39 field3787 = new class39(256);

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lsl;")
    private class39 field3798 = new class39(256);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lbm;")
    private class307 field3786;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Lbm;")
    private class307 field3794;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "F")
    public static float field3799;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[[[I")
    public static int[][][] field3791;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI[I)Llj;", line = 5)
    public final class5 method1613(byte arg0, int arg1, int[] arg2) {
        if (arg0 <= 25) {
            field3799 = -0.3091074F;
        }
        field3796++;
        if (this.field3786.method2053((byte) -9) == 1) {
            return this.method1616((byte) 40, arg2, arg1, 0);
        } else if (this.field3786.method2056(arg1, -95) == 1) {
            return this.method1616((byte) -127, arg2, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)[Loj;", line = 31)
    public static final class283[] method1614(int arg0) {
        field3795++;
        class283[] var1 = new class283[class125.field2167];
        for (int var2 = 0; var2 < class125.field2167; var2++) {
            int var3 = class28.field537[var2] * class176.field2833[var2];
            byte[] var4 = class254.field3968[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class274.field4202[class61.method475(var4[var6], 255)];
            }
            if (class249.field3893) {
                var1[var2] = new class137(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], var5);
            } else {
                var1[var2] = new class206(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], var5);
            }
        }
        class97.method644((byte) 101);
        if (arg0 != 255) {
            method1614(-14);
        }
        return var1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([IIII)Llj;", line = 75)
    private final class5 method1615(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFF9) ^ arg2;
        int var6 = var5 | arg1 << 16;
        field3788++;
        long var7 = (long) var6;
        class5 var9 = (class5) this.field3798.method303(var7, (byte) 107);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg3 >= 0) {
                field3799 = -1.2538369F;
            }
            class76 var10 = class76.method568(this.field3794, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class5 var11 = var10.method566();
            this.field3798.method310(var7, var11, 25357);
            if (arg0 != null) {
                arg0[0] -= var11.field113.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B[III)Llj;", line = 115)
    private final class5 method1616(byte arg0, int[] arg1, int arg2, int arg3) {
        int var5 = 53 / ((arg0 + 36) / 54);
        field3797++;
        int var6 = (arg3 << 4 & 0xFFFA | arg3 >>> 12) ^ arg2;
        int var7 = var6 | arg3 << 16;
        long var8 = (long) var7 ^ 0x100000000L;
        class5 var10 = (class5) this.field3798.method303(var8, (byte) 109);
        if (var10 != null) {
            return var10;
        } else if (arg1 == null || arg1[0] > 0) {
            class57 var11 = (class57) this.field3787.method303(var8, (byte) 119);
            if (var11 == null) {
                var11 = class57.method438(this.field3786, arg3, arg2);
                if (var11 == null) {
                    return null;
                }
                this.field3787.method310(var8, var11, 25357);
            }
            class5 var12 = var11.method442(arg1);
            if (var12 == null) {
                return null;
            } else {
                var11.method278((byte) -105);
                this.field3798.method310(var8, var12, 25357);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 157)
    public static void method1617(int arg0) {
        if (arg0 != 0) {
            field3791 = (int[][][]) ((int[][][]) null);
        }
        field3791 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 167)
    public static final void method1618(String arg0, int arg1) {
        field3790++;
        if (arg1 >= -103) {
            field3791 = (int[][][]) ((int[][][]) null);
        }
        if (class29.field545 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class223.method1480(-1);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class42.method321("mem=" + var4 + "k", 0, 1, (String) null);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class223.method1480(-1);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class42.method321("Memory before cleanup=" + var7 + "k", 0, 1, (String) null);
                class29.method237(-21650);
                class223.method1480(-1);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class42.method321("Memory after cleanup=" + var9 + "k", 0, 1, (String) null);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class42.method321("Number of player models in cache:" + class125.method834(5), 0, 1, (String) null);
            }
            if (class249.field3893 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class258.field4010);
                System.out.println("oncard_2d:" + class258.field4011);
                System.out.println("oncard_texture:" + class258.field4014);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class142.method923(124);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class335.field5137.method1859((byte) 39);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class335.field5137.method1849((byte) -125);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class177.field2849.method808(0);
                class177.field2860.method612(5000);
                class335.field5137.method1858(false);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class104.field1796 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class9.method79((byte) -101, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class95.field1705 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class95.field1705 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class119.method777(false, (byte) 10, -1, 0, -1);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class119.method777(false, (byte) 80, -1, 1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class119.method777(false, (byte) 127, -1, 2, -1);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class119.method777(false, (byte) 62, 1024, 3, 768);
            }
            if (arg0.startsWith("::setba")) {
                class259.field4028 = class321.method2236(arg0.substring(8), 118);
                class271.method1824(127, class177.field2849);
                class1.field13 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class275.method1840(class321.method2236(arg0.substring(15), 125));
                class271.method1824(100, class177.field2849);
                class1.field13 = false;
            }
            if (arg0.startsWith("::fps ") && class260.field4068 != 0) {
                class241.method1596(class321.method2236(arg0.substring(6), 73), 0);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class79.field1567 = class321.method2236(arg0.substring(12).trim(), 54);
                class42.method321("rect_debug=" + class79.field1567, 0, 1, (String) null);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class29.field551 = true;
            }
            if (arg0.startsWith("::hdr") && class249.field3893 && !class321.method2234((byte) 126, !class195.method1249())) {
                class42.method321("Failed to enable hdr", 0, 1, (String) null);
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class194.field3131) {
                    class194.field3131 = false;
                    class42.method321("Forced tweening disabled.", 0, 1, (String) null);
                } else {
                    class194.field3131 = true;
                    class42.method321("Forced tweening ENABLED!", 0, 1, (String) null);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class185.field3015) {
                    System.out.println("Shift-click disabled.");
                    class185.field3015 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class185.field3015 = true;
                }
            }
        }
        class14.field263.method80(8, (byte) 125);
        class14.field263.method1311(arg0.length() - 1, 10964);
        class14.field263.method1309(84, arg0.substring(2));
        class72.field1498++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[II)Llj;", line = 378)
    public final class5 method1619(int arg0, int[] arg1, int arg2) {
        if (arg2 != 9798) {
            method1620(-87, 89, -94, 38, -116);
        }
        field3793++;
        if (this.field3794.method2053((byte) -9) == 1) {
            return this.method1615(arg1, 0, arg0, arg2 - 9836);
        } else if (this.field3794.method2056(arg0, -110) == 1) {
            return this.method1615(arg1, arg0, 0, -19);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V", line = 415)
    public static final void method1620(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0;
        int var6 = -82 / ((arg2 + 16) / 51);
        field3792++;
        int var7 = -arg0;
        int var8 = 0;
        int var9 = class8.method73(8, class259.field4024, class147.field2416, arg4 + arg0);
        int var10 = -1;
        int var11 = class8.method73(8, class259.field4024, class147.field2416, arg4 - arg0);
        class241.method1598(arg1, -7, class155.field2522[arg3], var9, var11);
        while (var5 > var8) {
            var10 += 2;
            var7 += var10;
            if (var7 > 0) {
                var5--;
                int var12 = arg3 - var5;
                var7 -= var5 << 1;
                int var13 = arg3 + var5;
                if (var13 >= class59.field1162 && var12 <= class186.field3028) {
                    int var14 = class8.method73(8, class259.field4024, class147.field2416, arg4 + var8);
                    int var15 = class8.method73(8, class259.field4024, class147.field2416, arg4 - var8);
                    if (var13 <= class186.field3028) {
                        class241.method1598(arg1, -7, class155.field2522[var13], var14, var15);
                    }
                    if (class59.field1162 <= var12) {
                        class241.method1598(arg1, -7, class155.field2522[var12], var14, var15);
                    }
                }
            }
            var8++;
            int var16 = arg3 - var8;
            int var17 = arg3 + var8;
            if (class59.field1162 <= var17 && class186.field3028 >= var16) {
                int var18 = class8.method73(8, class259.field4024, class147.field2416, arg4 + var5);
                int var19 = class8.method73(8, class259.field4024, class147.field2416, arg4 - var5);
                if (class186.field3028 >= var17) {
                    class241.method1598(arg1, -7, class155.field2522[var17], var18, var19);
                }
                if (var16 >= class59.field1162) {
                    class241.method1598(arg1, -7, class155.field2522[var16], var18, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lbm;Lbm;)V", line = 521)
    public class244(class307 arg0, class307 arg1) {
        this.field3786 = arg1;
        this.field3794 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILaj;)V", line = 497)
    public static final void method1621(int arg0, class198 arg1) {
        field3789++;
        arg1.field3176 = false;
        if (arg1.field3177 != null) {
            arg1.field3177.field2610 = 0;
        }
        if (arg0 != 0) {
            method1617(-63);
        }
        for (class198 var2 = arg1.method1234(); var2 != null; var2 = arg1.method1235()) {
            method1621(0, var2);
        }
    }
}
