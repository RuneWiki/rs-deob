import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class443 {

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "Luq;")
    private class313 field6115;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "Lnk;")
    private class376 field6112;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public int field6119;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    private int field6122;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "[B")
    public byte[] field6118;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    private int field6110;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    private int field6117;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    private int field6121;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "Lsm;")
    public static class577 field6123;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "Z")
    public static boolean field6125;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "Lvt;")
    public static class344 field6127;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "Lim;")
    public static class353 field6128;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "[[B")
    public static byte[][] field6126;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "[[Lqs;")
    private class69[][] field6107;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILge;)Ljava/lang/String;")
    public static final String method2569(int arg0, class551 arg1) {
        if (arg0 != 1) {
            method2574(-36, 65, -10, -127, -17, -78, 21, -84, -53, null);
        }
        field6108++;
        return class310.method1869(arg1, 32767, 8624);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ[[ZIII)V")
    public final void method2570(int arg0, boolean arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        field6114++;
        this.field6115.method1930((byte) -101, false);
        this.field6115.method1949(false, (byte) 120);
        this.field6115.method1960(-2, arg5 ^ -20227);
        this.field6115.method1909(arg5 + 20128, 1);
        this.field6115.method1905(3042, 1);
        float var7 = 1.0F / (float) (this.field6115.field4200 * 128);
        if (arg5 != -20225) {
            this.field6107 = null;
        }
        if (arg1) {
            for (int var22 = 0; var22 < this.field6121; var22++) {
                int var23 = var22 << this.field6110;
                int var24 = var22 + 1 << this.field6110;
                label88: for (int var25 = 0; var25 < this.field6117; var25++) {
                    int var26 = var25 << this.field6110;
                    int var27 = var25 + 1 << this.field6110;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((-arg0) <= (var28 - arg3) && var28 - arg3 <= arg0) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((-arg0) <= (var29 - arg4) && (var29 - arg4) <= arg0 && arg2[arg0 + var28 - arg3][arg0 + var29 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6107[var25][var22].method396(75);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field6121; var8++) {
                int var9 = var8 << this.field6110;
                int var10 = var8 + 1 << this.field6110;
                for (int var11 = 0; var11 < this.field6117; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field6110;
                    int var14 = var11 + 1 << this.field6110;
                    class616 var15 = this.field6115.field4285;
                    var15.field7707 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (var16 - arg4 >= -arg0 && var16 - arg4 <= arg0) {
                            int var17 = this.field6112.field7581 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (-arg0 <= var18 - arg3 && (var18 - arg3) <= arg0 && arg2[var18 + arg0 - arg3][arg0 + var16 - arg4]) {
                                    short[] var19 = this.field6112.field5270[var17];
                                    if (var19 != null) {
                                        if (this.field6115.field4291) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method3042(var19[var21] & 0xFFFF, -102);
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method3094(true, var19[var20] & 0xFFFF);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field6107[var11][var8].method394(var15.field7693, 5123, var12, -3449);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method2571(int arg0) {
        field6116++;
        if (arg0 != -1) {
            method2574(13, -124, -113, -81, -41, -30, 7, -92, 16, null);
        }
        return class264.field3373 || class84.field1136 == null ? "" : class84.field1136.field3093;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lk;III[Z)Z")
    public static final boolean method2572(class88 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class501.field6947 != class353.field4949) {
            int var6 = class50.field672[arg1].method1040(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class544 var8 = class50.field672[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1040(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1034(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1037(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    public static void method2573(int arg0) {
        field6126 = null;
        if (arg0 != 759139619) {
            method2573(-2);
        }
        field6128 = null;
        field6123 = null;
        field6127 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIII[Ljq;)V")
    public static final void method2574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class447[] arg9) {
        field6124++;
        class301.field3918.method977(arg8, arg3, arg0, arg6);
        if (arg2 != 255) {
            return;
        }
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class447 var11 = arg9[var10];
            if (var11 != null && (var11.field6244 == arg1 || arg1 == -1412584499 && class15.field162 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class331.field4576[class161.field2051].setBounds(var11.field6335 + arg5, var11.field6270 + arg4, var11.field6330, var11.field6218);
                    var12 = class161.field2051++;
                } else {
                    var12 = arg7;
                }
                var11.field6233 = var12;
                var11.field6269 = class7.field61;
                if (!client.method3580(var11)) {
                    if (var11.field6325 != 0) {
                        class419.method2483(false, var11);
                    }
                    int var13 = var11.field6335 + arg5;
                    int var14 = var11.field6270 + arg4;
                    int var15 = var11.field6340;
                    if (class427.field5824 && (client.method3572(var11).field6885 != 0 || var11.field6336 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class15.field162 == var11) {
                        if (arg1 != -1412584499 && (class115.field1468 == var11.field6208 || class261.field3275 == var11.field6208)) {
                            class95.field1281 = arg5;
                            class215.field2765 = arg9;
                            class411.field5644 = arg4;
                            continue;
                        }
                        if (class496.field6917 && class475.field6702) {
                            int var16 = class343.field4760.method100((byte) -96);
                            int var17 = class343.field4760.method92(8);
                            int var18 = var16 - class624.field9002;
                            int var19 = var17 - class520.field7240;
                            if (var18 < class227.field2905) {
                                var18 = class227.field2905;
                            }
                            if (class384.field5356 > var19) {
                                var19 = class384.field5356;
                            }
                            if ((class227.field2905 + class254.field3157.field6330) < (var18 + var11.field6330)) {
                                var18 = class254.field3157.field6330 + class227.field2905 - var11.field6330;
                            }
                            var13 = var18;
                            if ((class384.field5356 + class254.field3157.field6218) < (var19 + var11.field6218)) {
                                var19 = class384.field5356 + class254.field3157.field6218 - var11.field6218;
                            }
                            var14 = var19;
                        }
                        if (class261.field3275 == var11.field6208) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field6336 == 2) {
                        var20 = arg0;
                        var21 = arg3;
                        var22 = arg8;
                        var23 = arg6;
                    } else {
                        int var24 = var13 + var11.field6330;
                        int var25 = var11.field6218 + var14;
                        if (var11.field6336 == 9) {
                            var25++;
                            var24++;
                        }
                        var22 = arg8 < var13 ? var13 : arg8;
                        var21 = arg3 >= var14 ? arg3 : var14;
                        var23 = arg6 <= var25 ? arg6 : var25;
                        var20 = arg0 > var24 ? var24 : arg0;
                    }
                    if (var20 > var22 && var21 < var23) {
                        if (var11.field6325 != 0) {
                            if (class548.field7627 == var11.field6325 || class10.field87 == var11.field6325) {
                                class594.method3425(var11.field6218, var13, false, var14, class10.field87 == var11.field6325, var11.field6330);
                                class99.field1326[var12] = true;
                                class301.field3918.method977(arg8, arg3, arg0, arg6);
                                continue;
                            }
                            if (class48.field658 == var11.field6325) {
                                if (var11.method2608(104, class301.field3918) != null) {
                                    class147.method802((byte) 49);
                                    class38.method222(true, var11, class301.field3918, var13, var14);
                                    class584.field8455[var12] = true;
                                    class301.field3918.method977(arg8, arg3, arg0, arg6);
                                }
                                continue;
                            }
                            if (class260.field3214 == var11.field6325) {
                                if (var11.method2608(-105, class301.field3918) != null) {
                                    class532.method2960(var13, var11, var14, 117);
                                    class584.field8455[var12] = true;
                                    class301.field3918.method977(arg8, arg3, arg0, arg6);
                                }
                                continue;
                            }
                            if (class209.field2715 == var11.field6325) {
                                class168.method999(class555.field7756, 30082, var13, var14, var11.field6330, var11.field6218, class301.field3918);
                                class99.field1326[var12] = true;
                                class301.field3918.method977(arg8, arg3, arg0, arg6);
                                continue;
                            }
                            if (class271.field3445 == var11.field6325) {
                                class74.method432(class301.field3918, var13, var11.field6330, var14, var11.field6218, -7790);
                                class99.field1326[var12] = true;
                                class301.field3918.method977(arg8, arg3, arg0, arg6);
                                continue;
                            }
                            if (class55.field742 == var11.field6325) {
                                if (!class248.field3119 && !class550.field7643) {
                                    continue;
                                }
                                int var26 = var13 + var11.field6330;
                                int var27 = var14 + 15;
                                if (class248.field3119) {
                                    int var28 = -256;
                                    if (class10.field92 < 20) {
                                        var28 = -65536;
                                    }
                                    class522.field7281.method1623(var28, 169, var27, -1, var26, "Fps:" + class10.field92);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                        if (class224.field2866) {
                                            class379.method2309((byte) -128);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class534.method2970("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", (byte) -76);
                                            }
                                        }
                                    }
                                    class522.field7281.method1623(var31, 169, var27, -1, var26, "Mem:" + var30 + "k");
                                    var27 += 15;
                                    class522.field7281.method1623(-256, 169, var27, -1, var26, "In:" + class282.field3693 + "B/s Out:" + class466.field6617 + "B/s");
                                    var27 += 15;
                                    int var33 = class301.field3918.method965() / 1024;
                                    class522.field7281.method1623(var33 > 65536 ? -65536 : -256, 169, var27, -1, var26, "Offheap:" + var33 + "k");
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 32; var37++) {
                                        var34 += class172.field2232[var37].method1460((byte) 99);
                                        var35 += class172.field2232[var37].method1454(24642);
                                        var36 += class172.field2232[var37].method1464(true);
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class249.method1526(true, (long) var39, 0, 0, 2) + "% (" + var38 + "%)";
                                    class332.field4584.method1623(-256, 169, var27, -1, var26, var40);
                                    var27 += 12;
                                }
                                if (class541.field7573 > 0) {
                                    class332.field4584.method1623(-256, 169, var27, -1, var26, "Particles: " + class86.field1163 + " / " + class541.field7573);
                                }
                                var27 += 12;
                                if (class550.field7643) {
                                    class332.field4584.method1623(-256, 169, var27, -1, var26, "Polys: " + class301.field3918.method946() + " Models: " + class301.field3918.method929());
                                    var27 += 12;
                                    class332.field4584.method1623(-256, 169, var27, -1, var26, "Ls: " + class585.field8458 + " La: " + class558.field7816 + " NPC: " + class80.field1086 + " Pl: " + class503.field7000);
                                    class19.method94(0);
                                    var27 += 12;
                                }
                                class99.field1326[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field6336 == 0) {
                            if (class575.field8025 == var11.field6325 && class301.field3918.method912()) {
                                class301.field3918.method959(var13, var14, var11.field6330, var11.field6218);
                            }
                            method2574(var20, var11.field6229, 255, var21, var14 - var11.field6280, var13 - var11.field6291, var23, var12, var22, arg9);
                            if (var11.field6194 != null) {
                                method2574(var20, var11.field6229, 255, var21, var14 - var11.field6280, -var11.field6291 + var13, var23, var12, var22, var11.field6194);
                            }
                            class496 var41 = (class496) class523.field7289.method3476((long) var11.field6229, (byte) 28);
                            if (var41 != null) {
                                class596.method3431(var13, 74, var21, var12, var23, var20, var41.field6914, var14, var22);
                            }
                            if (class575.field8025 == var11.field6325 && class301.field3918.method912()) {
                                class301.field3918.method911();
                                class60.field829 = true;
                            }
                            class301.field3918.method977(arg8, arg3, arg0, arg6);
                        }
                        if (class202.field2644[var12] || class3.field22 > 1) {
                            if (var11.field6336 == 3) {
                                if (var15 == 0) {
                                    if (var11.field6334) {
                                        class301.field3918.method997(var13, var14, var11.field6330, var11.field6218, var11.field6200, 0);
                                    } else {
                                        class301.field3918.method995(var13, var14, var11.field6330, var11.field6218, var11.field6200, 0);
                                    }
                                } else if (var11.field6334) {
                                    class301.field3918.method997(var13, var14, var11.field6330, var11.field6218, var11.field6200 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class301.field3918.method995(var13, var14, var11.field6330, var11.field6218, var11.field6200 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field6336 == 4) {
                                class262 var42 = var11.method2605(class301.field3918, (byte) 105);
                                if (var42 != null) {
                                    int var43 = var11.field6200;
                                    String var44 = var11.field6191;
                                    if (var11.field6263 != -1) {
                                        class456 var45 = class98.field1307.method3391(0, var11.field6263);
                                        var44 = var45.field6471;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field6477 == 1 || var11.field6324 != 1) && var11.field6324 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class463.method2674(var11.field6324, false);
                                        }
                                    }
                                    if (class168.field2123 == var11) {
                                        var44 = class466.field6614.method2157(class245.field3103, arg2 ^ 0xF15);
                                        var43 = var11.field6200;
                                    }
                                    if (class617.field8887) {
                                        class301.field3918.method939(var13, var14, var11.field6330 + var13, var11.field6218 + var14);
                                    }
                                    var42.method1612(255 - (var15 & 0xFF) << 24 | var43, 0, null, class44.field632, 0, var11.field6314, var11.field6327, (byte) 85, var11.field6330, var11.field6258, null, var11.field6218, var44, var11.field6176 ? 255 - (var15 & 0xFF) << 24 : -1, var13, var14, var11.field6198);
                                    if (class617.field8887) {
                                        class301.field3918.method977(arg8, arg3, arg0, arg6);
                                    }
                                } else if (class163.field2076) {
                                    class90.method501(var11, arg2 - 256);
                                }
                            } else if (var11.field6336 == 5) {
                                if (var11.field6192 >= 0) {
                                    var11.method2596((byte) -93, class369.field5136, class1.field5).method1987(var11.field6218, var11.field6187 << 3, -1, class301.field3918, var11.field6175 << 3, var14, var11.field6330, 0, 0, var13);
                                } else {
                                    class116 var47;
                                    if (var11.field6263 == -1) {
                                        var47 = var11.method2597(class301.field3918, (byte) 61);
                                    } else {
                                        class534 var46 = var11.field6254 ? class147.field1899.field274 : null;
                                        var47 = class98.field1307.method3387(class301.field3918, var11.field6263, var11.field6217, var11.field6262, var46, var11.field6324, -1751, -16777216 | var11.field6183);
                                    }
                                    if (var47 != null) {
                                        int var48 = var47.method627();
                                        int var49 = var47.method631();
                                        int var50 = (var11.field6200 == 0 ? 16777215 : var11.field6200 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field6214) {
                                            class301.field3918.method939(var13, var14, var11.field6330 + var13, var11.field6218 + var14);
                                            if (var11.field6272 != 0) {
                                                int var51 = (var11.field6330 + var48 - 1) / var48;
                                                int var52 = (var11.field6218 - (1 - var49)) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field6200 == 0) {
                                                            var47.method619((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field6272);
                                                        } else {
                                                            var47.method639((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field6272, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field6200 == 0 && var15 == 0) {
                                                var47.method629(var13, var14, var11.field6330, var11.field6218);
                                            } else {
                                                var47.method621(var13, var14, var11.field6330, var11.field6218, 0, var50, 1);
                                            }
                                            class301.field3918.method977(arg8, arg3, arg0, arg6);
                                        } else if (var11.field6200 == 0 && var15 == 0) {
                                            if (var11.field6272 != 0) {
                                                var47.method619((float) var11.field6330 / 2.0F + (float) var13, (float) var11.field6218 / 2.0F + (float) var14, var11.field6330 * 4096 / var48, var11.field6272);
                                            } else if (var11.field6330 == var48 && var11.field6218 == var49) {
                                                var47.method632(var13, var14);
                                            } else {
                                                var47.method638(var13, var14, var11.field6330, var11.field6218);
                                            }
                                        } else if (var11.field6272 != 0) {
                                            var47.method639((float) var11.field6330 / 2.0F + (float) var13, (float) var11.field6218 / 2.0F + (float) var14, var11.field6330 * 4096 / var48, var11.field6272, 0, var50, 1);
                                        } else if (var11.field6330 == var48 && var11.field6218 == var49) {
                                            var47.method633(var13, var14, 0, var50, 1);
                                        } else {
                                            var47.method625(var13, var14, var11.field6330, var11.field6218, 0, var50, 1);
                                        }
                                    } else if (class163.field2076) {
                                        class90.method501(var11, -1);
                                    }
                                }
                            } else if (var11.field6336 == 6) {
                                class10.method41((byte) -74);
                                class521 var55 = null;
                                int var56 = 0;
                                if (var11.field6263 != -1) {
                                    class456 var64 = class98.field1307.method3391(0, var11.field6263);
                                    if (var64 != null) {
                                        class456 var65 = var64.method2657(95, var11.field6324);
                                        class320 var66 = var11.field6259 == -1 ? null : class609.field8754.method535(var11.field6259, true);
                                        class534 var67 = var11.field6254 ? class147.field1899.field274 : null;
                                        var55 = var65.method2640(true, var67, 2048, var66, var11.field6234, var11.field6184, var11.field6212, class301.field3918, 1);
                                        if (var55 == null) {
                                            class90.method501(var11, -1);
                                        } else {
                                            var56 = -var55.method1579() >> 1;
                                        }
                                    }
                                } else if (var11.field6308 == 5) {
                                    int var57 = var11.field6193;
                                    if (var57 >= 0 && var57 < 2048) {
                                        class20 var58 = class364.field5092[var57];
                                        class320 var59 = var11.field6259 == -1 ? null : class609.field8754.method535(var11.field6259, true);
                                        if (var58 != null && (class182.field2335 == var57 || class60.method346((byte) 123, var58.field257) == var11.field6197)) {
                                            var55 = var58.field274.method2975(class301.field3918, var11.field6212, -1, class257.field3191, 0, class10.field104, var59, class217.field2772, null, null, class98.field1307, class609.field8754, arg2 ^ 0x88, 0, var11.field6184, class579.field8053, 2048, var11.field6234, true);
                                        }
                                    }
                                } else if (var11.field6308 == 8 || var11.field6308 == 9) {
                                    class164 var61 = class130.method695(false, var11.field6193, Integer.MIN_VALUE);
                                    class320 var62 = var11.field6259 == -1 ? null : class609.field8754.method535(var11.field6259, true);
                                    if (var61 != null) {
                                        class534 var63 = var11.field6254 ? class147.field1899.field274 : null;
                                        var55 = var61.method889(var11.field6184, var62, var11.field6212, 850, var11.field6234, class301.field3918, var63, 2048, var11.field6308 == 9, var11.field6197);
                                    }
                                } else if (var11.field6259 == -1) {
                                    var55 = var11.method2607(class609.field8754, class217.field2772, -1, -1, 2048, class301.field3918, class147.field1899.field274, 0, true, class10.field104, class579.field8053, class257.field3191, class98.field1307, null);
                                    if (var55 == null && class163.field2076) {
                                        class90.method501(var11, -1);
                                    }
                                } else {
                                    class320 var60 = class609.field8754.method535(var11.field6259, true);
                                    var55 = var11.method2607(class609.field8754, class217.field2772, var11.field6234, var11.field6184, 2048, class301.field3918, class147.field1899.field274, var11.field6212, true, class10.field104, class579.field8053, class257.field3191, class98.field1307, var60);
                                    if (var55 == null && class163.field2076) {
                                        class90.method501(var11, arg2 ^ 0xFFFFFF00);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field6295 > 0) {
                                        var68 = (var11.field6330 << 9) / var11.field6295;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69;
                                    if (var11.field6201 <= 0) {
                                        var69 = 512;
                                    } else {
                                        var69 = (var11.field6218 << 9) / var11.field6201;
                                    }
                                    int var70 = (var11.field6190 * var68 >> 9) + var11.field6330 / 2 + var13;
                                    int var71 = (var11.field6224 * var69 >> 9) + var14 + (var11.field6218 / 2);
                                    class643.field9335.method354();
                                    class301.field3918.method956(class643.field9335);
                                    class301.field3918.method961(var70, var71, var68, var69);
                                    class301.field3918.method926((float) (var11.field6230 << 2), var11.field6228 ? (float) (var11.field6203 << 2) : (float) (var11.field6203 << 2) * 1.5F);
                                    if (arg1 == -1412584499 || class60.field829) {
                                        class301.field3918.method962();
                                        class301.field3918.method996();
                                        class301.field3918.method977(arg8, arg3, arg0, arg6);
                                        class60.field829 = false;
                                    }
                                    if (var11.field6323) {
                                        class301.field3918.method983(false);
                                    }
                                    int var72 = (var11.field6174 << 2) * class310.field3966[var11.field6333 << 3] >> 14;
                                    int var73 = (var11.field6174 << 2) * class310.field3965[var11.field6333 << 3] >> 14;
                                    class82.field1116.method355(-var11.field6321 << 3);
                                    class82.field1116.method356(var11.field6305 << 3);
                                    class82.field1116.method365(var11.field6195 << 2, (var11.field6337 << 2) + var56 + var72, var73 - -(var11.field6337 << 2));
                                    class82.field1116.method358(var11.field6333 << 3);
                                    if (class617.field8887) {
                                        class301.field3918.method939(var13, var14, var11.field6330 + var13, var11.field6218 + var14);
                                    }
                                    if (var11.field6228) {
                                        var55.method1562(class82.field1116, null, var11.field6174 << 2, 1);
                                    } else {
                                        var55.method1595(class82.field1116, null, 1);
                                    }
                                    if (class617.field8887) {
                                        class301.field3918.method977(arg8, arg3, arg0, arg6);
                                    }
                                    if (var11.field6323) {
                                        class301.field3918.method983(true);
                                    }
                                    class301.field3918.method926(0.0F, 0.0F);
                                }
                            } else if (var11.field6336 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field6338) {
                                    var74 = var13;
                                    var75 = var13 + var11.field6330;
                                    var76 = var14;
                                    var77 = var14 + var11.field6218;
                                } else {
                                    var77 = var14;
                                    var76 = var14 + var11.field6218;
                                    var75 = var11.field6330 + var13;
                                    var74 = var13;
                                }
                                if (var11.field6246 == 1) {
                                    class301.field3918.method935(var74, var77, var75, var76, var11.field6200, 0);
                                } else {
                                    class301.field3918.method192(var74, var77, var75, var76, var11.field6200, var11.field6246, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
    public final void method2575(int arg0) {
        this.field6107 = new class69[this.field6117][this.field6121];
        field6111++;
        if (arg0 < 18) {
            field6125 = true;
        }
        for (int var2 = 0; var2 < this.field6121; var2++) {
            for (int var3 = 0; var3 < this.field6117; var3++) {
                this.field6107[var3][var2] = new class69(this.field6115, this, this.field6112, var3, var2, this.field6110, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZLk;)Z")
    public final boolean method2576(int arg0, int arg1, boolean arg2, class88 arg3) {
        field6120++;
        class17 var5 = (class17) arg3;
        int var6 = var5.field180 + arg0 + 1;
        int var7 = var5.field178 + arg1 + 1;
        int var8 = this.field6119 * var6 + var7;
        if (!arg2) {
            field6123 = null;
        }
        int var9 = var5.field179;
        int var10 = var5.field182;
        int var11 = this.field6119 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var6 = 1;
            var8 += this.field6119 * var12;
        }
        if ((var6 + var9) >= this.field6122) {
            int var13 = var9 + var6 + 1 - this.field6122;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var11 += var14;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field6119) {
            int var15 = var7 + var10 + 1 - this.field6119;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6119 + var11;
            return class508.method2843(this.field6118, var9, (byte) -101, var17, var16, var8, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BIIII)V")
    private final void method2577(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6109++;
        if (this.field6107 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg2 + arg3 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        if (arg0 > -115) {
            this.method2579(105, -75, null, (byte) -93);
        }
        int var9 = arg1 + arg4 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class69[] var11 = this.field6107[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field912 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILk;II)V")
    public final void method2578(int arg0, class88 arg1, int arg2, int arg3) {
        field6106++;
        class17 var5 = (class17) arg1;
        int var6 = var5.field178 + arg2 + 1;
        int var7 = var5.field180 + arg3 + 1;
        int var8 = this.field6119 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field179;
        int var11 = var5.field182;
        int var12 = this.field6119 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field6119 * var14;
            var9 += var11 * var14;
            var10 -= var14;
            var7 = 1;
        }
        if (arg0 > -66) {
            return;
        }
        if ((var7 + var10) >= this.field6122) {
            int var15 = var7 + var10 + 1 - this.field6122;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var6 = 1;
            var8 += var16;
            var12 += var16;
            var13 += var16;
            var11 -= var16;
        }
        if (this.field6119 <= (var6 + var11)) {
            int var17 = var11 + var6 + 1 - this.field6119;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class523.method2922(var12, var5.field175, var13, this.field6118, var10, var8, var9, var11, -85);
            this.method2577((byte) -125, var10, var11, var6, var7);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Luq;Lnk;)V")
    public class443(class313 arg0, class376 arg1) {
        this.field6115 = arg0;
        this.field6112 = arg1;
        this.field6119 = (this.field6112.field7582 * this.field6112.field7581 >> this.field6115.field4201) + 2;
        this.field6122 = (this.field6112.field7585 * this.field6112.field7582 >> this.field6115.field4201) + 2;
        this.field6118 = new byte[this.field6122 * this.field6119];
        this.field6110 = this.field6115.field4201 + 7 - this.field6112.field7583;
        this.field6117 = this.field6112.field7581 >> this.field6110;
        this.field6121 = this.field6112.field7585 >> this.field6110;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILk;B)V")
    public final void method2579(int arg0, int arg1, class88 arg2, byte arg3) {
        field6113++;
        class17 var5 = (class17) arg2;
        int var6 = var5.field178 + arg0 + 1;
        int var7 = var5.field180 + arg1 + 1;
        int var8 = this.field6119 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field179;
        int var11 = var5.field182;
        if (arg3 != -90) {
            return;
        }
        int var12 = this.field6119 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field6119 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field6122) {
            int var15 = var7 + var10 + 1 - this.field6122;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var11 -= var16;
            var6 = 1;
            var8 += var16;
            var12 += var16;
            var9 += var16;
        }
        if (this.field6119 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field6119;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class143.method774(this.field6118, var10, var14, var8, var9, var5.field175, var12, var11, (byte) -102);
            this.method2577((byte) -126, var10, var11, var6, var7);
        }
    }

    static {
        new class344("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field6123 = new class577();
        field6125 = false;
        field6127 = new class344("Drop", "Fallen lassen", "Poser", "Largar");
        field6128 = new class353(69, 1);
    }
}
