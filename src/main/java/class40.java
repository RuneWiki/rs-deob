import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class40 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
    private int[] field585;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "[I")
    private int[] field591;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
    public static int[] field584 = new int[2048];

    @OriginalMember(owner = "client!me", name = "l", descriptor = "[I")
    public static int[] field595 = new int[4];

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
    public static final void method259(int arg0, int arg1, int arg2, Object[] arg3, int[] arg4) {
        if (arg0 < 22) {
            method260(0, 20, (byte[]) null, 118);
        }
        if (arg1 < arg2) {
            int var5 = arg1;
            int var6 = (arg1 + arg2) / 2;
            int var7 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var7;
            Object var8 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (((var9 & 0x1) + var7) > arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5++] = var11;
                }
            }
            arg4[arg2] = arg4[var5];
            arg4[var5] = var7;
            arg3[arg2] = arg3[var5];
            arg3[var5] = var8;
            method259(94, arg1, var5 - 1, arg3, arg4);
            method259(40, var5 + 1, arg2, arg3, arg4);
        }
        field596++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method260(int arg0, int arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        field598++;
        if (arg3 > -37) {
            return true;
        }
        class162 var5 = new class162(arg2);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method1139(-5705);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1114((byte) -13);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = arg1 + var12;
                    int var14 = var8 & 0x3F;
                    int var15 = arg0 + var14;
                    int var16 = var5.method1133((byte) 53) >> 2;
                    if (var13 > 0 && var15 > 0 && var13 < 103 && var15 < 103) {
                        class158 var17 = class5.method29(var6, true);
                        if (var16 != 22 || class100.field1609 || var17.field2467 != 0 || var17.field2514 == 1 || var17.field2470) {
                            var9 = true;
                            if (!var17.method1088((byte) -123)) {
                                class150.field2337++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method1114((byte) -13);
                if (var10 == 0) {
                    break;
                }
                var5.method1133((byte) 53);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    private final void method261(int arg0) {
        this.field587 += ++this.field590;
        field588++;
        if (arg0 != 2) {
            method266(76);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field591[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field597 ^= this.field597 << 13;
                } else {
                    this.field597 ^= this.field597 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field597 ^= this.field597 << 2;
            } else {
                this.field597 ^= this.field597 >>> 16;
            }
            this.field597 += this.field591[var2 + 128 & 0xFF];
            int var4;
            this.field591[var2] = var4 = this.field597 + this.field591[class51.method359(255, var3 >> 2)] + this.field587;
            this.field585[var2] = this.field587 = var3 + this.field591[class51.method359(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method262(int arg0, String arg1) {
        field593++;
        if (class298.field4765 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class46.method329(arg0 + 19103);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class99.method673(true, "mem=" + var4 + "k");
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class46.method329(30771);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class99.method673(true, "Memory before cleanup=" + var7 + "k");
                class265.method1783((byte) -73);
                class46.method329(30771);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class99.method673(true, "Memory after cleanup=" + var9 + "k");
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class99.method673(true, "Number of player models in cache:" + class271.method1814(-1));
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class73.method499(-1);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class90.field1472.method428(28449);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class90.field1472.method434(0);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class268.field4323.method315((byte) -61);
                class208.field3298.method970((byte) 71);
                class90.field1472.method438(-1);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class43.field642 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class262.method1760(25, -103);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class119.field1908 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class119.field1908 = false;
            }
            if (arg1.startsWith("::setba")) {
                class312.field4979 = class277.method1868(arg1.substring(8), true);
                class56.method385(arg0 - 11733, class268.field4323);
                class134.field2127 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class171.method1243(class277.method1868(arg1.substring(15), true));
                class56.method385(121, class268.field4323);
                class134.field2127 = false;
            }
            if (arg1.startsWith("::fps ") && class225.field3652 != 0) {
                class4.method20(true, class277.method1868(arg1.substring(6), true));
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class158.field2505 = class277.method1868(arg1.substring(12).trim(), true);
                class99.method673(true, "rect_debug=" + class158.field2505);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class176.field2877 = true;
            }
            arg1.startsWith("::hdr");
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class174.field2846) {
                    class174.field2846 = false;
                    class99.method673(true, "Forced tweening disabled.");
                } else {
                    class174.field2846 = true;
                    class99.method673(true, "Forced tweening ENABLED!");
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class298.field4759) {
                    System.out.println("Shift-click disabled.");
                    class298.field4759 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class298.field4759 = true;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class99.method673(true, "x:" + (class239.field3829.field637 >> 7) + " z:" + (class239.field3829.field710 >> 7) + " groundh:" + class267.field4304[class56.field941][class239.field3829.field637 >> 7][class239.field3829.field710 >> 7]);
            }
            if (arg1.equalsIgnoreCase("::getheight")) {
                class99.method673(true, "Height: " + class267.field4304[class56.field941][class239.field3829.field637 >> 7][class239.field3829.field710 >> 7]);
            }
        }
        class314.field5061.method828(114, 66);
        class314.field5061.method1108(arg1.length() - 1, true);
        class2.field27++;
        if (arg0 != 11668) {
            field584 = null;
        }
        class314.field5061.method1148((byte) -99, arg1.substring(2));
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method263(int arg0) {
        if (arg0 != 219) {
            method259(-98, 97, 123, (Object[]) null, (int[]) null);
        }
        field584 = null;
        field595 = null;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    private final void method264(int arg0) {
        field592++;
        if (arg0 >= -46) {
            this.field590 = 12;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var5 + var63;
            int var66 = var7 + var64;
            int var67 = var66 ^ var64 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var4 + var67;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var63;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field585[var11 + 2] + var7;
            int var38 = this.field585[var11 + 5] + var4;
            int var39 = this.field585[var11 + 6] + var3;
            int var40 = this.field585[var11] + var9;
            int var41 = this.field585[var11 + 7] + var2;
            int var42 = this.field585[var11 + 1] + var8;
            int var43 = var40 ^ var42 << 11;
            int var44 = this.field585[var11 + 3] + var6;
            int var45 = var37 + var42;
            int var46 = this.field585[var11 + 4] + var5;
            int var47 = var43 + var44;
            int var48 = var45 ^ var37 >>> 2;
            int var49 = var46 + var48;
            int var50 = var37 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var38 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var39;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var41;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var43;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field591[var11] = var9;
            this.field591[var11 + 1] = var8;
            this.field591[var11 + 2] = var7;
            this.field591[var11 + 3] = var6;
            this.field591[var11 + 4] = var5;
            this.field591[var11 + 5] = var4;
            this.field591[var11 + 6] = var3;
            this.field591[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field591[var12 + 2] + var7;
            int var14 = this.field591[var12 + 6] + var3;
            int var15 = this.field591[var12 + 1] + var8;
            int var16 = this.field591[var12 + 5] + var4;
            int var17 = this.field591[var12 + 4] + var5;
            int var18 = this.field591[var12 + 3] + var6;
            int var19 = this.field591[var12] + var9;
            int var20 = var19 ^ var15 << 11;
            int var21 = var13 + var15;
            int var22 = var18 + var20;
            int var23 = var21 ^ var13 >>> 2;
            int var24 = var13 + var22;
            int var25 = this.field591[var12 + 7] + var2;
            int var26 = var24 ^ var22 << 8;
            int var27 = var16 + var26;
            int var28 = var17 + var23;
            int var29 = var22 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var27 + var28;
            int var31 = var6 + var14;
            var5 = var30 ^ var27 << 10;
            int var32 = var5 + var25;
            int var33 = var27 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var20;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var23;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var26;
            var9 = var8 + var35;
            this.field591[var12] = var9;
            this.field591[var12 + 1] = var8;
            this.field591[var12 + 2] = var7;
            this.field591[var12 + 3] = var6;
            this.field591[var12 + 4] = var5;
            this.field591[var12 + 5] = var4;
            this.field591[var12 + 6] = var3;
            this.field591[var12 + 7] = var2;
        }
        this.method261(2);
        this.field586 = 256;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    private class40() {
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([I)V")
    public class40(int[] arg0) {
        this.field585 = new int[256];
        this.field591 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field585[var2] = arg0[var2];
        }
        this.method264(-110);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)I")
    public final int method265(int arg0) {
        field594++;
        if (arg0 == this.field586--) {
            this.method261(arg0 + 2);
            this.field586 = 255;
        }
        return this.field585[this.field586];
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static final void method266(int arg0) {
        if (class45.field754.toLowerCase().indexOf("microsoft") == -1) {
            class268.field4310[46] = 72;
            class268.field4310[93] = 43;
            class268.field4310[59] = 57;
            class268.field4310[92] = 74;
            class268.field4310[91] = 42;
            class268.field4310[45] = 26;
            class268.field4310[44] = 71;
            class268.field4310[47] = 73;
            if (class45.field764 == null) {
                class268.field4310[192] = 58;
                class268.field4310[222] = 59;
            } else {
                class268.field4310[222] = 58;
                class268.field4310[520] = 59;
                class268.field4310[192] = 28;
            }
            class268.field4310[61] = 27;
        } else {
            class268.field4310[192] = 58;
            class268.field4310[222] = 59;
            class268.field4310[191] = 73;
            class268.field4310[186] = 57;
            class268.field4310[188] = 71;
            class268.field4310[221] = 43;
            class268.field4310[219] = 42;
            class268.field4310[187] = 27;
            class268.field4310[220] = 74;
            class268.field4310[190] = 72;
            class268.field4310[189] = 26;
            class268.field4310[223] = 28;
        }
        if (arg0 == -277381177) {
            field589++;
        }
    }
}
