import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class258 {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    private int field3815 = 0;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    private int field3820 = 4;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    private int field3818 = 4;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "[S")
    private short[] field3824 = new short[512];

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public int field3814 = 4;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    private int field3822 = 4;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field3819 = 0;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "[Lhs;")
    public static class178[] field3825 = new class178[29];

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Lub;")
    public static class15 field3826 = new class15(5);

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "[S")
    private short[] field3813;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1782(int arg0, int arg1, int arg2, Class arg3) {
        class74 var4 = class385.field5449[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class353 var5 = var4.field970; var5 != null; var5 = var5.field5127) {
            class306 var6 = var5.field5125;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4465 == arg1 && var6.field4462 == arg2) {
                class440.method2741(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public abstract void method1599(boolean arg0);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
    public abstract void method1604(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method1783(int arg0, int arg1, String arg2, String arg3) {
        class311.field4505 = arg3;
        field3817++;
        class323.field4707 = arg0;
        class410.field5881 = arg2;
        if (class311.field4505.equals("") || class410.field5881.equals("")) {
            class384.field5440 = 3;
        } else if (class426.field6087 == -1) {
            class359.field5186 = 0;
            class120.field1624 = 1;
            class384.field5440 = -3;
            class8.field97 = 0;
            class130 var4 = new class130(128);
            if (arg1 >= -77) {
                method1783(81, 25, (String) null, (String) null);
            }
            var4.method831(10, (byte) -126);
            var4.method849((int) (Math.random() * 9.9999999E7D), (byte) -107);
            var4.method832((byte) -61, class407.method2561(class311.field4505, 75));
            var4.method849((int) (Math.random() * 9.9999999E7D), (byte) -97);
            var4.method807((byte) 124, class410.field5881);
            var4.method849((int) (Math.random() * 9.9999999E7D), (byte) -90);
            var4.method833(class246.field3674, class15.field220, -127);
            class407.field5761.field1880 = 0;
            class407.field5761.method831(24, (byte) -16);
            class407.field5761.method831(var4.field1880 + 2, (byte) 113);
            class407.field5761.method799(566, 74);
            class407.field5761.method821(var4.field1880, -115, 0, var4.field1851);
        } else {
            class119.method732(-86);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method1784(int arg0) {
        field3826 = null;
        if (arg0 == 22802) {
            field3825 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public abstract void method1603(byte arg0);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
    private final void method1785(byte arg0) {
        field3821++;
        this.field3813 = new short[this.field3814];
        for (int var2 = 0; var2 < this.field3814; var2++) {
            this.field3813[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 >= -117) {
            this.method1785((byte) 83);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V")
    public final void method1786(int arg0, int arg1, int arg2, int arg3) {
        field3828++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg2];
        if (arg3 > -120) {
            return;
        }
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg1];
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var8[var10] = (var10 << 12) / arg1;
        }
        this.method1603((byte) -114);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field3814; var14++) {
                        int var15 = this.field3813[var14] << 12;
                        int var16 = this.field3822 * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field3818 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = this.field3820 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field3822 * var19;
                        int var23 = this.field3818 * var21;
                        int var24 = this.field3820 * var17;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var18 > var29) {
                            var33 = var29 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34;
                        if (var26 >= var16) {
                            var34 = 0;
                        } else {
                            var34 = var26 & 0xFF;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36 = var31 & 0xFF;
                        int var37;
                        if (var32 >= var20) {
                            var37 = 0;
                        } else {
                            var37 = var32 & 0xFF;
                        }
                        int var38 = var23 & 0xFFF;
                        int var39 = var24 & 0xFFF;
                        int var40 = var38 - 4096;
                        int var41 = class252.field3742[var35];
                        short var42 = this.field3824[var36];
                        int var43 = class252.field3742[var38];
                        short var44 = this.field3824[var37];
                        int var45 = var35 - 4096;
                        int var46 = var39 - 4096;
                        int var47 = class252.field3742[var39];
                        short var48 = this.field3824[var30 + var44];
                        short var49 = this.field3824[var33 + var44];
                        short var50 = this.field3824[var33 + var42];
                        short var51 = this.field3824[var30 + var42];
                        int var52 = class83.method490(var39, this.field3824[var28 + var51], (byte) 85, var38, var35);
                        int var53 = class83.method490(var39, this.field3824[var34 + var51], (byte) 95, var38, var45);
                        int var54 = var52 + ((var53 - var52) * var41 >> 12);
                        int var55 = class83.method490(var39, this.field3824[var28 + var50], (byte) 89, var40, var35);
                        int var56 = class83.method490(var39, this.field3824[var34 + var50], (byte) 35, var40, var45);
                        int var57 = var55 + ((var56 - var55) * var41 >> 12);
                        int var58 = ((var57 - var54) * var43 >> 12) + var54;
                        int var59 = class83.method490(var46, this.field3824[var28 + var48], (byte) 82, var38, var35);
                        int var60 = class83.method490(var46, this.field3824[var34 + var48], (byte) 89, var38, var45);
                        int var61 = ((var60 - var59) * var41 >> 12) + var59;
                        int var62 = class83.method490(var46, this.field3824[var28 + var49], (byte) 113, var40, var35);
                        int var63 = class83.method490(var46, this.field3824[var34 + var49], (byte) 45, var40, var45);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method1604(((var65 - var58) * var47 >> 12) + var58, var14, 16898);
                    }
                    this.method1599(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I")
    public static final int method1787(int arg0, int arg1) {
        if (arg0 > -114) {
            field3825 = null;
        }
        int var7 = arg1 - 1;
        field3827++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V")
    private final void method1788(byte arg0) {
        field3816++;
        Random var2 = new Random((long) this.field3815);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3824[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class445.method2775(var2, arg0 + 31217, var5);
            short var7 = this.field3824[var6];
            this.field3824[var6] = this.field3824[var5];
            this.field3824[var5] = this.field3824[var5 + 256] = var7;
        }
        if (arg0 != -39) {
            method1782(-21, 125, -121, (Class) null);
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIII)V")
    public class258(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3820 = arg4;
        this.field3814 = arg1;
        this.field3815 = arg0;
        this.field3822 = arg2;
        this.field3818 = arg3;
        this.method1785((byte) -128);
        this.method1788((byte) -39);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method1789(boolean arg0, String arg1, boolean arg2) {
        field3823++;
        if (class214.field3022 != 0 || class316.field4628 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg1.equalsIgnoreCase("fpson")) {
                    class59.field791 = true;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class59.field791 = false;
                }
                if (arg1.equalsIgnoreCase("cls")) {
                    class442.field6328 = 0;
                    class282.field4033 = 0;
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class113.field1457.method1083((byte) -81);
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class103.method606(-1);
                    for (int var3 = 0; var3 < 10; var3++) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class295.method1999((byte) -125, "mem=" + var5 + "k");
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class103.method606(-1);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class295.method1999((byte) -117, "Memory before cleanup=" + var8 + "k");
                    class442.method2749(0);
                    class103.method606(-1);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class295.method1999((byte) -118, "Memory after cleanup=" + var10 + "k");
                }
                if (arg1.equalsIgnoreCase("pcachesize")) {
                    class295.method1999((byte) -122, "Number of player models in cache:" + client.method1177(18));
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    if (class423.field6041 == 30) {
                        class371.method2383((byte) 102);
                    } else if (class423.field6041 == 25) {
                        class265.field3895 = true;
                    }
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class187.field2661.method508(arg0);
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class187.field2661.method507(48);
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class401.field5628.method1522(true);
                    class199.field2847.method1099(4);
                    class187.field2661.method512(4);
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class370.method2375((byte) -62);
                    class276.method1879((byte) 122);
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class240.method1641(-1, 1, false, -1, -4);
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class240.method1641(-1, 2, false, -1, -4);
                }
                if (arg1.equalsIgnoreCase("::wm3")) {
                    class240.method1641(768, 3, false, 1024, -4);
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class358.method2335((byte) 115, 0);
                    class374.field5319 = 0;
                    class415.method2612(class401.field5628, 101);
                    class315.field4627 = false;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class358.method2335((byte) 25, 1);
                    class374.field5319 = 1;
                    class415.method2612(class401.field5628, 118);
                    class315.field4627 = false;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class358.method2335((byte) 31, 2);
                    class374.field5319 = 2;
                    class415.method2612(class401.field5628, 121);
                    class315.field4627 = false;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class358.method2335((byte) 16, 3);
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class189.field2714 = !class189.field2714;
                    class415.method2612(class401.field5628, 122);
                    class315.field4627 = false;
                    class370.method2375((byte) -62);
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class324.field4717 = !class324.field4717;
                    class415.method2612(class401.field5628, 108);
                    class315.field4627 = false;
                    class370.method2375((byte) -62);
                }
                if (arg1.startsWith("shadows ")) {
                    class194.field2802 = class333.method2184(-1, arg1.substring(8));
                    class415.method2612(class401.field5628, 115);
                    class315.field4627 = false;
                    class370.method2375((byte) -62);
                }
                if (arg1.startsWith("setba")) {
                    class68.field910 = class333.method2184(-1, arg1.substring(6));
                    class415.method2612(class401.field5628, 126);
                    class315.field4627 = false;
                }
                if (arg1.startsWith("setparticles")) {
                    class230.method1595(-38, class333.method2184(-1, arg1.substring(13)));
                    class415.method2612(class401.field5628, 119);
                    class315.field4627 = false;
                }
                if (arg1.startsWith("fps ") && class214.field3022 != 0) {
                    class331.method2167((byte) -103, class333.method2184(-1, arg1.substring(4)));
                }
                if (arg1.startsWith("rect_debug")) {
                    class223.field3303 = class333.method2184(-1, arg1.substring(10).trim());
                    class295.method1999((byte) -113, "rect_debug=" + class223.field3303);
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class450.field6455 = true;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class147.field2200 = !class147.field2200;
                    class295.method1999((byte) -126, "clipcomponents=" + class147.field2200);
                }
                if (arg1.startsWith("bloom")) {
                    boolean var11 = class59.field786.method971();
                    if (!class410.method2597(!var11, arg0)) {
                        class295.method1999((byte) -125, "Failed to enable bloom");
                    } else if (var11) {
                        class295.method1999((byte) -114, "Bloom disabled");
                    } else {
                        class295.method1999((byte) -121, "Bloom enabled");
                    }
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (class333.field4837) {
                        class333.field4837 = false;
                        class295.method1999((byte) -118, "Forced tweening disabled.");
                    } else {
                        class333.field4837 = true;
                        class295.method1999((byte) -120, "Forced tweening ENABLED!");
                    }
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (class56.field746) {
                        class295.method1999((byte) -120, "Shift-click disabled.");
                        class56.field746 = false;
                    } else {
                        class295.method1999((byte) -124, "Shift-click ENABLED!");
                        class56.field746 = true;
                    }
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class295.method1999((byte) -118, "x:" + (class181.field2555.field4463 >> 7) + " z:" + (class181.field2555.field4466 >> 7));
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class295.method1999((byte) -121, "Height: " + class439.field6280[class158.field2302].method359(class181.field2555.field4463 >> 7, class181.field2555.field4466 >> 7));
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class15.field216.method659(106);
                    class15.field216.method658(true);
                    class5.method21(0);
                    class276.method1879((byte) 94);
                }
                if (arg1.startsWith("mc")) {
                    if (class59.field786.method964()) {
                        int var12 = Integer.parseInt(arg1.substring(3));
                        if (var12 < 1) {
                            var12 = 1;
                        } else if (var12 > 4) {
                            var12 = 4;
                        }
                        class287.field4169 = var12;
                        class59.field786.method936(class287.field4169);
                        class59.field786.method890(0);
                        class295.method1999((byte) -128, "Render cores now: " + class287.field4169);
                    } else {
                        class295.method1999((byte) -127, "Current toolkit doesn't support multiple cores");
                    }
                }
                if (arg1.startsWith("cachespace")) {
                    class295.method1999((byte) -115, "I(s): " + class25.field311.method100((byte) 47) + "/" + class25.field311.method97(false));
                    class295.method1999((byte) -125, "I(m): " + class109.field1413.method100((byte) 47) + "/" + class109.field1413.method97(false));
                    class295.method1999((byte) -122, "O(s): " + class356.field5154.method748(arg0) + "/" + class356.field5154.method745((byte) -77));
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class295.method1999((byte) -125, "Pos: " + class158.field2302 + "," + ((class386.field5469 >> 7) + class306.field4459 >> 6) + "," + ((class417.field5999 >> 7) + class342.field4959 >> 6) + "," + ((class386.field5469 >> 7) + class306.field4459 & 0x3F) + "," + ((class417.field5999 >> 7) + class342.field4959 & 0x3F) + " Height: " + (class452.method2820(class158.field2302, class417.field5999, !arg0, class386.field5469) - class249.field3707));
                    class295.method1999((byte) -118, "Look: " + class158.field2302 + "," + (class32.field397 + class306.field4459 >> 6) + "," + (class308.field4486 + class342.field4959 >> 6) + "," + (class32.field397 + class306.field4459 & 0x3F) + "," + (class342.field4959 + class308.field4486 & 0x3F) + " Height: " + (class452.method2820(class158.field2302, class308.field4486, false, class32.field397) - class365.field5228));
                }
                if (arg1.equals("showocc")) {
                    class140.field2141 = !class140.field2141;
                    class370.method2375((byte) -62);
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class58.field783 = !class58.field783;
                    class59.field786.method877(class58.field783);
                    class47.method305(0);
                }
                if (arg1.equals("nonpcs")) {
                    class403.field5650 = !class403.field5650;
                }
                if (arg1.equals("autoworld")) {
                    class386.method2453((byte) -100);
                }
                if (arg1.equals("heap")) {
                    class295.method1999((byte) -127, "Heap: " + class306.field4461 + "MB");
                }
                if (arg1.equals("savevarcs")) {
                    class365.method2358(-58);
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var13 = 0; var13 < class114.field1471.length; var13++) {
                        if (class442.field6334[var13]) {
                            class114.field1471[var13] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class114.field1471[var13] *= -1;
                            }
                        }
                    }
                    class365.method2358(-121);
                }
                if (arg1.equals("showcolmap")) {
                    class110.field1416 = true;
                    class276.method1879((byte) 35);
                }
                if (arg1.equals("hidecolmap")) {
                    class110.field1416 = false;
                    class276.method1879((byte) 95);
                }
                if (arg1.equals("resetcache")) {
                    class166.method1198(-22156);
                }
                if (arg1.equals("profilecpu")) {
                    class295.method1999((byte) -127, class245.method1709((byte) -127) + "ms");
                }
                if (arg1.startsWith("cpuusage")) {
                    int var14 = Integer.parseInt(arg1.substring(9));
                    if (var14 >= 0 && var14 <= 4) {
                        class70.field930 = var14;
                    }
                }
                if (class423.field6041 == 30) {
                    class249.field3709++;
                    class407.field5761.method2048(2040, 9);
                    class407.field5761.method831(arg1.length() + 2, (byte) -40);
                    class407.field5761.method831(arg2 ? 1 : 0, (byte) 127);
                    class407.field5761.method807((byte) 124, arg1);
                }
            } catch (Exception var15) {
                class295.method1999((byte) -121, "Whoops, something went wrong.");
            }
        }
        if (!arg0) {
            field3825 = null;
        }
    }
}
