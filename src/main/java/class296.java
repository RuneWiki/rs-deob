import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class296 extends class86 {

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    private int field4587 = 1;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    private int field4589 = 1;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "Lim;")
    public static class193 field4595 = new class193();

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "Lcn;")
    public static class37 field4598 = new class37(16);

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "[[S")
    public static short[][] field4596;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 4)
    public static final void method2133(String arg0, byte arg1) {
        field4588++;
        if (class270.field4168 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class68.method664(160);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class101.method882(-1, "mem=" + var4 + "k");
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class68.method664(160);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class101.method882(-1, "Memory before cleanup=" + var7 + "k");
                class285.method2067(-77);
                class68.method664(160);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class101.method882(-1, "Memory after cleanup=" + var9 + "k");
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class101.method882(-1, "Number of player models in cache:" + class280.method2047(5000));
            }
            if (class240.field3737 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class28.field454);
                System.out.println("oncard_2d:" + class28.field458);
                System.out.println("oncard_texture:" + class28.field459);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class184.method1423((byte) 113);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class160.field2553.method1719(20);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class160.field2553.method1707(127);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class340.field5234.method2273(-82);
                class188.field2950.method2420(0);
                class160.field2553.method1708(true);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class309.field4776 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class175.method1370(25, (byte) -83);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class116.field1783 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class116.field1783 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class207.method1543(-1, 121, false, -1, 0);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class207.method1543(-1, 95, false, -1, 1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class207.method1543(-1, 91, false, -1, 2);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class207.method1543(768, 81, false, 1024, 3);
            }
            if (arg0.startsWith("::setba")) {
                class64.field989 = class343.method2418(125, arg0.substring(8));
                class235.method1756(false, class340.field5234);
                class258.field3951 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class273.method1998(class343.method2418(-86, arg0.substring(15)));
                class235.method1756(false, class340.field5234);
                class258.field3951 = false;
            }
            if (arg0.startsWith("::fps ") && class353.field5636 != 0) {
                class58.method576((byte) -38, class343.method2418(-119, arg0.substring(6)));
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class284.field4398 = class343.method2418(107, arg0.substring(12).trim());
                class101.method882(-1, "rect_debug=" + class284.field4398);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class18.field290 = true;
            }
            if (arg0.startsWith("::hdr") && class240.field3737 && !class326.method2310(!class357.method2506(), 3)) {
                class101.method882(-1, "Failed to enable hdr");
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class170.field2683) {
                    class170.field2683 = false;
                    class101.method882(-1, "Forced tweening disabled.");
                } else {
                    class170.field2683 = true;
                    class101.method882(-1, "Forced tweening ENABLED!");
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class208.field3205) {
                    System.out.println("Shift-click disabled.");
                    class208.field3205 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class208.field3205 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class101.method882(-1, "x:" + (class173.field2746.field1359 >> 7) + " z:" + (class173.field2746.field1286 >> 7) + " groundh:" + class277.field4290[class119.field1826][class173.field2746.field1359 >> 7][class173.field2746.field1286 >> 7]);
            }
            if (arg0.equalsIgnoreCase("::getheight")) {
                class101.method882(-1, "Height: " + class277.field4290[class119.field1826][class173.field2746.field1359 >> 7][class173.field2746.field1286 >> 7]);
            }
        }
        class99.field1491.method1628((byte) -112, 137);
        class66.field1007++;
        class99.field1491.method273(0, arg0.length() - 1);
        if (arg1 >= -85) {
            method2135((String) null, 61);
        }
        class99.field1491.method280(-18345, arg0.substring(2));
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 230)
    public class296() {
        super(1, false);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZLug;)V", line = 238)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field4586++;
        if (arg1) {
            field4596 = (short[][]) ((short[][]) null);
        }
        if (arg0 == 0) {
            this.field4587 = arg2.method281(-127);
        } else if (arg0 == 1) {
            this.field4589 = arg2.method281(73);
        } else if (arg0 == 2) {
            this.field1228 = arg2.method281(8) == 1;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[I", line = 286)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 < 7) {
            this.field4589 = -70;
        }
        field4585++;
        int[] var3 = this.field1225.method1914(arg0, 112);
        if (this.field1225.field3995) {
            int var4 = this.field4589 + this.field4589 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4587 + this.field4587 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field4589; var9 <= (this.field4589 + arg0); var9++) {
                int[] var10 = this.method774(0, class280.field4324 & var9, 0);
                int[] var11 = new int[class93.field1424];
                int var12 = 0;
                for (int var13 = -this.field4587; var13 <= this.field4587; var13++) {
                    var12 += var10[class313.field4848 & var13];
                }
                int var14 = 0;
                while (var14 < class93.field1424) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field4587 & class313.field4848];
                    var14++;
                    var12 = var10[class313.field4848 & this.field4587 + var14] + var15;
                }
                var8[var9 + this.field4589 - arg0] = var11;
            }
            for (int var16 = 0; var16 < class93.field1424; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V", line = 373)
    public static void method2134(int arg0) {
        if (arg0 < 3) {
            method2134(-80);
        }
        field4595 = null;
        field4598 = null;
        field4596 = (short[][]) null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 387)
    public static final int method2135(String arg0, int arg1) {
        field4592++;
        int var2 = 0;
        int var3 = arg0.length();
        int var4 = 0;
        if (arg1 != 560166149) {
            method2136((byte) -34);
        }
        while (var4 < var3) {
            var2 = class74.method692(arg1 ^ 0xDE9C8A9A, arg0.charAt(var4)) + (var2 << 5) - var2;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 414)
    public static final void method2136(byte arg0) {
        if (arg0 == -38) {
            class186.field2905.method655(-1);
            field4593++;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)[[I", line = 427)
    public final int[][] method156(int arg0, byte arg1) {
        field4594++;
        if (arg1 > -126) {
            method2133((String) null, (byte) -78);
        }
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int var4 = this.field4589 + this.field4589 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4587 + this.field4587 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field4589; var9 <= (this.field4589 + arg0); var9++) {
                int[][] var10 = this.method782(class280.field4324 & var9, 0, 1);
                int[][] var11 = new int[3][class93.field1424];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field4587; var18 <= this.field4587; var18++) {
                    int var19 = var18 & class313.field4848;
                    var14 += var17[var19];
                    var13 += var16[var19];
                    var12 += var15[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class93.field1424 > var23) {
                    var20[var23] = var7 * var12 >> 16;
                    var21[var23] = var7 * var13 >> 16;
                    var22[var23] = var7 * var14 >> 16;
                    int var24 = class313.field4848 & var23 - this.field4587;
                    var23++;
                    int var25 = var14 - var17[var24];
                    int var26 = var12 - var15[var24];
                    int var27 = var13 - var16[var24];
                    int var28 = class313.field4848 & this.field4587 + var23;
                    var13 = var16[var28] + var27;
                    var12 = var15[var28] + var26;
                    var14 = var17[var28] + var25;
                }
                var8[var9 + this.field4589 - arg0] = var11;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[2];
            int[] var31 = var3[0];
            for (int var32 = 0; var32 < class93.field1424; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var33 += var37[0][var32];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                }
                var31[var32] = var5 * var33 >> 16;
                var29[var32] = var5 * var34 >> 16;
                var30[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }
}
