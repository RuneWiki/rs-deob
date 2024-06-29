import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class471 extends class577 {

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public int field6612 = 0;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Lmf;")
    private class439 field6610;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Lpj;")
    private class156 field6607;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public int field6602;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[I")
    private int[] field6606;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public int field6605;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public int field6600;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public int field6601;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "F")
    public float field6604;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field6608 = 0;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    private static int field6616 = 1409;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Lhl;")
    private class553 field6597;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Lwia;")
    public static class791 field6609;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6619;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6611;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method2798(int arg0, int arg1, int arg2, int arg3) {
        this.field6606[this.field6610.field4289 * arg2 + arg1] = class746.method4158(this.field6606[this.field6610.field4289 * arg2 + arg1], 0x1 << arg3);
        if (arg0 != 22764) {
            this.method2799(null, -58, 92);
        }
        field6603++;
        this.field6612++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([III)V", line = 19)
    public final void method2799(int[] arg0, int arg1, int arg2) {
        field6620++;
        class535 var4 = this.field6607.method1116((byte) -109, this.field6612 * 3);
        Buffer var5 = var4.method605((byte) -35, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field6607.method1190(arg1 ^ arg1, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3953()) {
            label123: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                int var12 = this.field6606[var11];
                short[] var13 = this.field6610.field5942[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label123;
                            }
                            if ((0x1 << var14++ & var12) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    var6.method3947(var17);
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label98: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                short[] var21 = this.field6610.field5942[var20];
                int var22 = this.field6606[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var21.length <= var24) {
                                continue label98;
                            }
                            if ((var22 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    var6.method3954(var26);
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3945();
        if (!var4.method601(-62) || var7 <= 0) {
            return;
        }
        this.field6607.method1073((this.field6610.field5922 & 0x7) != 0, this.field6605, (this.field6610.field5922 & 0x8) != 0, -1);
        if (this.field6607.field2409) {
            this.field6607.method526(Integer.MAX_VALUE, this.field6601, this.field6600, this.field6602);
        }
        class385 var19 = this.field6607.method1161(256);
        var19.method2398(1.0F / this.field6604, 1.0F / this.field6604, 1.0F, 0);
        this.field6607.method1152(123, class448.field6129);
        this.field6607.method1178(1, (byte) 67, this.field6597);
        this.field6607.method1111((byte) 117, this.field6610.field5962);
        this.field6607.method1091(var7, var4, var8, 0, var9 + 1 - var8, class207.field3204, (byte) -29);
        this.field6607.method1182((byte) 104);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIB[Lmea;ZII)V", line = 174)
    public static final void method2800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class451[] arg7, boolean arg8, int arg9, int arg10) {
        class37.field491.method434(arg10, arg9, arg0, arg2);
        field6617++;
        for (int var11 = 0; var11 < arg7.length; var11++) {
            class451 var12 = arg7[var11];
            if (var12 != null && (var12.field6233 == arg5 || arg5 == -1412584499 && class265.field3871 == var12)) {
                int var13 = var12.field6333 + arg1;
                int var14 = var12.field6242 + arg3;
                int var15 = var13 + var12.field6290 + 1;
                int var16 = var12.field6288 + var14 + 1;
                int var17;
                if (arg4 == -1) {
                    class663.field9227[class470.field6596].setBounds(var12.field6333 + arg1, var12.field6242 - -arg3, var12.field6290, var12.field6288);
                    var17 = class470.field6596++;
                } else {
                    var17 = arg4;
                }
                var12.field6291 = class192.field2961;
                var12.field6251 = var17;
                if (!client.method2034(var12)) {
                    if (var12.field6271 != 0) {
                        class581.method3405(var12, 150);
                    }
                    int var18 = var12.field6333 + arg1;
                    int var19 = var12.field6242 + arg3;
                    int var20 = 0;
                    int var21 = 0;
                    if (class195.field2997) {
                        var20 = class493.method2933((byte) -41);
                        var21 = class242.method1613(8220);
                    }
                    int var22 = var12.field6307;
                    if (class81.field901 && (client.method2046(var12).field441 != 0 || var12.field6210 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class265.field3871 == var12) {
                        if (arg5 != -1412584499 && (class254.field3745 == var12.field6272 || class479.field6741 == var12.field6272)) {
                            class599.field8413 = arg7;
                            class252.field3715 = arg3;
                            class262.field3837 = arg1;
                            continue;
                        }
                        if (class556.field7933 && class394.field5429) {
                            int var23 = var20 + class152.field2154.method2646(9);
                            int var24 = var21 + class152.field2154.method2650((byte) -109);
                            int var25 = var23 - class180.field2796;
                            int var26 = var24 - class603.field8441;
                            if (var25 < class422.field5782) {
                                var25 = class422.field5782;
                            }
                            if ((var12.field6290 + var25) > (class422.field5782 + class226.field3479.field6290)) {
                                var25 = class422.field5782 + class226.field3479.field6290 - var12.field6290;
                            }
                            if (class157.field2527 > var26) {
                                var26 = class157.field2527;
                            }
                            if ((class157.field2527 + class226.field3479.field6288) < (var12.field6288 + var26)) {
                                var26 = class226.field3479.field6288 + class157.field2527 - var12.field6288;
                            }
                            var18 = var25;
                            var19 = var26;
                        }
                        if (class479.field6741 == var12.field6272) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field6210 == 2) {
                        var31 = arg2;
                        var30 = arg10;
                        var32 = arg0;
                        var29 = arg9;
                    } else {
                        int var27 = var12.field6290 + var18;
                        int var28 = var12.field6288 + var19;
                        if (var12.field6210 == 9) {
                            var28++;
                            var27++;
                        }
                        var29 = var19 > arg9 ? var19 : arg9;
                        var30 = var18 <= arg10 ? arg10 : var18;
                        var31 = var28 < arg2 ? var28 : arg2;
                        var32 = var27 < arg0 ? var27 : arg0;
                    }
                    if (var32 > var30 && var31 > var29) {
                        if (var12.field6271 != 0) {
                            if (class256.field3762 == var12.field6271 || class190.field2938 == var12.field6271) {
                                class440.method2622(var12, 72, var19, var18);
                                if (!class195.field2997) {
                                    class8.method56(27690, var12.field6290, var19, var18, class190.field2938 == var12.field6271, var12.field6288);
                                    class37.field491.method434(arg10, arg9, arg0, arg2);
                                }
                                class698.field9719[var17] = true;
                                continue;
                            }
                            if (class6.field58 == var12.field6271) {
                                if (var12.method2685(class37.field491, (byte) -49) != null) {
                                    class265.method1722(arg6 ^ 0xFFFFC129);
                                    class324.method2084(var19, var12, var18, class37.field491, 30780);
                                    class744.field10313[var17] = true;
                                    class37.field491.method434(arg10, arg9, arg0, arg2);
                                    if (class195.field2997) {
                                        if (arg8) {
                                            class33.method272(var13, var14, var16, false, var15);
                                        } else {
                                            class702.method3982(var13, var16, var14, var15, 0);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class643.field8992 == var12.field6271) {
                                class768.method4242(var18, class37.field491, 73, var12, var19);
                                continue;
                            }
                            if (field6616 == var12.field6271) {
                                class269.method1747(var18, (byte) -20, var12.field6304 % 64, var12, var19, class37.field491);
                                continue;
                            }
                            if (class356.field5013 == var12.field6271) {
                                if (var12.method2685(class37.field491, (byte) -52) != null) {
                                    class533.method3214((byte) -119, var19, var12, var18);
                                    class744.field10313[var17] = true;
                                    class37.field491.method434(arg10, arg9, arg0, arg2);
                                    if (class195.field2997) {
                                        if (arg8) {
                                            class33.method272(var13, var14, var16, false, var15);
                                        } else {
                                            class702.method3982(var13, var16, var14, var15, 0);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class192.field2964 == var12.field6271) {
                                class590.method3438(var19, var12.field6288, class37.field491, class204.field3175, var18, var12.field6290, 29441);
                                class698.field9719[var17] = true;
                                class37.field491.method434(arg10, arg9, arg0, arg2);
                                continue;
                            }
                            if (class790.field10831 == var12.field6271) {
                                class119.method897(var19, var18, var12.field6288, var12.field6290, class37.field491, 27911);
                                class698.field9719[var17] = true;
                                class37.field491.method434(arg10, arg9, arg0, arg2);
                                continue;
                            }
                            if (class517.field7307 == var12.field6271) {
                                if (!class216.field3351 && !class404.field5531) {
                                    continue;
                                }
                                int var33 = var12.field6290 + var18;
                                int var34 = var19 + 15;
                                if (class195.field2997) {
                                    if (arg8) {
                                        class33.method272(var13, var14, var16, false, var15);
                                    } else {
                                        class702.method3982(var13, var16, var14, var15, 0);
                                    }
                                }
                                if (class216.field3351) {
                                    int var35 = -256;
                                    if (class694.field9696 < 20) {
                                        var35 = -65536;
                                    }
                                    class449.field6148.method567(var35, 0, var33, var34, -1, "Fps:" + class694.field9696);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        if (class120.field1872) {
                                            class245.method1622(-3);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class227.method1550((byte) -67, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                        var38 = -65536;
                                    }
                                    class449.field6148.method567(var38, 0, var33, var34, -1, "Mem:" + var37 + "k");
                                    var34 += 15;
                                    class449.field6148.method567(-256, 0, var33, var34, -1, "In:" + class694.field9695 + "B/s Out:" + class771.field10589 + "B/s");
                                    var34 += 15;
                                    int var40 = class37.field491.method433() / 1024;
                                    class449.field6148.method567(var40 > 65536 ? -65536 : -256, 0, var33, var34, -1, "Offheap:" + var40 + "k");
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class695.field9712[var44] != null) {
                                            var41 += class695.field9712[var44].method3482(arg6 + 118);
                                            var42 += class695.field9712[var44].method3479(-38);
                                            var43 += class695.field9712[var44].method3483((byte) -34);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class784.method4293(0, true, true, 2, (long) var46) + "% (" + var45 + "%)";
                                    class718.field9945.method567(-256, 0, var33, var34, -1, var47);
                                    var34 += 12;
                                }
                                if (class96.field1097 > 0) {
                                    class718.field9945.method567(-256, 0, var33, var34, -1, "Particles: " + class767.field10555 + " / " + class96.field1097);
                                }
                                var34 += 12;
                                if (class404.field5531) {
                                    class718.field9945.method567(-256, arg6 ^ -120, var33, var34, -1, "Polys: " + class37.field491.method476() + " Models: " + class37.field491.method538());
                                    var34 += 12;
                                    class718.field9945.method567(-256, 0, var33, var34, -1, "Ls: " + class774.field10640 + " La: " + class371.field5139 + " NPC: " + class442.field6032 + " Pl: " + class739.field10186);
                                    class784.method4299(46);
                                    var34 += 12;
                                }
                                class698.field9719[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field6210 == 0) {
                            if (class577.field8127 == var12.field6271 && class37.field491.method451()) {
                                class37.field491.method448(var18, var19, var12.field6290, var12.field6288);
                            }
                            method2800(var32, var18 - var12.field6292, var31, var19 - var12.field6173, var17, var12.field6222, (byte) -120, arg7, arg8, var29, var30);
                            if (var12.field6270 != null) {
                                method2800(var32, var18 - var12.field6292, var31, var19 - var12.field6173, var17, var12.field6222, (byte) -120, var12.field6270, arg8, var29, var30);
                            }
                            class744 var48 = (class744) class11.field217.method2242((long) var12.field6222, arg6 + 119);
                            if (var48 != null) {
                                class389.method2419(var17, var32, var18, var48.field10314, var31, var30, var29, -122, var19);
                            }
                            if (class577.field8127 == var12.field6271 && class37.field491.method451()) {
                                class37.field491.method506();
                            }
                            class37.field491.method434(arg10, arg9, arg0, arg2);
                        }
                        if (class466.field6553[var17] || class42.field545 > 1) {
                            if (var12.field6210 == 3) {
                                if (var22 == 0) {
                                    if (var12.field6343) {
                                        class37.field491.method495(var18, var19, var12.field6290, var12.field6288, var12.field6304, 0);
                                    } else {
                                        class37.field491.method520(var18, var19, var12.field6290, var12.field6288, var12.field6304, 0);
                                    }
                                } else if (var12.field6343) {
                                    class37.field491.method495(var18, var19, var12.field6290, var12.field6288, var12.field6304 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                } else {
                                    class37.field491.method520(var18, var19, var12.field6290, var12.field6288, 255 - (var22 & 0xFF) << 24 | var12.field6304 & 0xFFFFFF, 1);
                                }
                                if (class195.field2997) {
                                    if (arg8) {
                                        class33.method272(var13, var14, var16, false, var15);
                                    } else {
                                        class702.method3982(var13, var16, var14, var15, 0);
                                    }
                                }
                            } else if (var12.field6210 == 4) {
                                class66 var49 = var12.method2681(class37.field491, (byte) 48);
                                if (var49 != null) {
                                    int var50 = var12.field6304;
                                    String var51 = var12.field6241;
                                    if (var12.field6183 != -1) {
                                        class689 var52 = class313.field4456.method1681(var12.field6183, arg6 ^ 0xFFFFFFDC);
                                        var51 = var52.field9565;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field9573 == 1 || var12.field6268 != 1) && var12.field6268 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class235.method1577((byte) -80, var12.field6268);
                                        }
                                    }
                                    if (var12.field6236 != -1) {
                                        var51 = class497.method3021(-103, var12.field6236);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class274.field3954 == var12) {
                                        var51 = class620.field8692.method3580(class140.field2081, arg6 ^ 0xFFFFFF84);
                                        var50 = var12.field6304;
                                    }
                                    if (class378.field5215) {
                                        class37.field491.method453(var18, var19, var12.field6290 + var18, var19 - -var12.field6288);
                                    }
                                    var49.method565(var12.field6194, var12.field6225, 119, var12.field6290, var18, var50 | 255 - (var22 & 0xFF) << 24, 0, null, var12.field6288, class459.field6425, var51, 0, var12.field6237, null, var19, var12.field6205 ? 255 - (var22 & 0xFF) << 24 : -1, var12.field6249);
                                    if (class378.field5215) {
                                        class37.field491.method434(arg10, arg9, arg0, arg2);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class378.field5215) {
                                            class6 var53 = class447.method2664(class37.field491, (byte) -124, var12.field6266);
                                            int var54 = var53.method39(class459.field6425, var51, var12.field6290, (byte) -27);
                                            int var55 = var53.method47(var12.field6290, class459.field6425, var51, arg6 ^ 0xFFFFFFF9, var12.field6194);
                                            if (class195.field2997) {
                                                if (arg8) {
                                                    class33.method272(var18, var19, var19 + var55, false, var18 + var54);
                                                } else {
                                                    class702.method3982(var18, var19 + var55, var19, var18 + var54, arg6 + 120);
                                                }
                                            }
                                        } else if (class195.field2997) {
                                            if (arg8) {
                                                class33.method272(var13, var14, var16, false, var15);
                                            } else {
                                                class702.method3982(var13, var16, var14, var15, 0);
                                            }
                                        }
                                    }
                                } else if (class564.field8004) {
                                    class564.method3329(var12, 8195);
                                }
                            } else if (var12.field6210 == 5) {
                                if (var12.field6316 >= 0) {
                                    var12.method2684(8, class107.field1602, class316.field4491).method3122(var12.field6290, (byte) -119, var12.field6170 << 3, class37.field491, 0, 0, var18, var12.field6288, var12.field6178 << 3, var19);
                                } else {
                                    class241 var56;
                                    if (var12.field6183 != -1) {
                                        class190 var57 = var12.field6204 ? class210.field3250.field9765 : null;
                                        var56 = class313.field4456.method1676(var57, arg6 ^ 0xFFFFFFA0, var12.field6183, var12.field6303, class37.field491, var12.field6268, var12.field6318, var12.field6282 | 0xFF000000);
                                    } else if (var12.field6236 == -1) {
                                        var56 = var12.method2700(true, class37.field491);
                                    } else {
                                        var56 = class791.method4345(var12.field6236, class37.field491, arg6 + 176);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method1507();
                                        int var59 = var56.method1505();
                                        int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field6304 == 0 ? 16777215 : var12.field6304 & 0xFFFFFF);
                                        if (var12.field6322) {
                                            class37.field491.method453(var18, var19, var18 + var12.field6290, var12.field6288 + var19);
                                            if (var12.field6218 != 0) {
                                                int var61 = (var58 + var12.field6290 - 1) / var58;
                                                int var62 = (var59 + var12.field6288 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field6304 == 0) {
                                                            var56.method1612((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field6218);
                                                        } else {
                                                            var56.method1605((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field6218, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field6304 == 0 && var22 == 0) {
                                                var56.method1610(var18, var19, var12.field6290, var12.field6288);
                                            } else {
                                                var56.method1510(var18, var19, var12.field6290, var12.field6288, 0, var60, 1);
                                            }
                                            class37.field491.method434(arg10, arg9, arg0, arg2);
                                        } else if (var12.field6304 == 0 && var22 == 0) {
                                            if (var12.field6218 != 0) {
                                                var56.method1612((float) var12.field6290 / 2.0F + (float) var18, (float) var12.field6288 / 2.0F + (float) var19, var12.field6290 * 4096 / var58, var12.field6218);
                                            } else if (var12.field6290 == var58 && var12.field6288 == var59) {
                                                var56.method1604(var18, var19);
                                            } else {
                                                var56.method1607(var18, var19, var12.field6290, var12.field6288);
                                            }
                                        } else if (var12.field6218 != 0) {
                                            var56.method1605((float) var12.field6290 / 2.0F + (float) var18, (float) var12.field6288 / 2.0F + (float) var19, var12.field6290 * 4096 / var58, var12.field6218, 0, var60, 1);
                                        } else if (var12.field6290 == var58 && var12.field6288 == var59) {
                                            var56.method364(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method1603(var18, var19, var12.field6290, var12.field6288, 0, var60, 1);
                                        }
                                    } else if (class564.field8004) {
                                        class564.method3329(var12, 8195);
                                    }
                                }
                                if (class195.field2997) {
                                    if (arg8) {
                                        class33.method272(var13, var14, var16, false, var15);
                                    } else {
                                        class702.method3982(var13, var16, var14, var15, 0);
                                    }
                                }
                            } else if (var12.field6210 == 6) {
                                class738.method4107(0);
                                Object var65 = null;
                                class496 var66 = null;
                                int var67 = 0;
                                if (var12.field6183 != -1) {
                                    class689 var68 = class313.field4456.method1681(var12.field6183, 120);
                                    if (var68 != null) {
                                        class689 var69 = var68.method3895((byte) 0, var12.field6268);
                                        class607 var70 = var12.field6167 == -1 ? null : class563.field7993.method651(var12.field6167, (byte) 102);
                                        class190 var71 = var12.field6204 ? class210.field3250.field9765 : null;
                                        var66 = var69.method3892(var12.field6228, var71, var70, arg6 + 115, class37.field491, 2048, var12.field6324, var12.field6339, 1);
                                        if (var66 == null) {
                                            class564.method3329(var12, 8195);
                                        } else {
                                            var67 = -var66.method118() >> 1;
                                        }
                                    }
                                } else if (var12.field6248 == 5) {
                                    int var72 = var12.field6239;
                                    if (var72 >= 0 && var72 < 2048) {
                                        class702 var73 = class767.field10560[var72];
                                        class607 var74 = var12.field6167 == -1 ? null : class563.field7993.method651(var12.field6167, (byte) 125);
                                        if (var73 != null && (class250.field3689 == var72 || class248.method1638(var73.field9768, (byte) -72) == var12.field6188)) {
                                            var66 = var73.field9765.method1328(var12.field6228, class541.field7792, null, 0, null, var12.field6339, class37.field491, class575.field8103, class563.field7993, -1, var74, true, 2048, 0, class537.field7727, class386.field5352, 0, null, class313.field4456, 0, var12.field6324);
                                        }
                                    }
                                } else if (var12.field6248 == 8 || var12.field6248 == 9) {
                                    class787 var76 = class447.method2666(var12.field6239, Integer.MIN_VALUE, false);
                                    class607 var77 = var12.field6167 == -1 ? null : class563.field7993.method651(var12.field6167, (byte) 94);
                                    if (var76 != null) {
                                        class190 var78 = var12.field6204 ? class210.field3250.field9765 : null;
                                        var66 = var76.method4309(var77, class37.field491, var78, var12.field6324, var12.field6188, var12.field6248 == 9, var12.field6228, 2048, var12.field6339, -27);
                                    }
                                } else if (var12.field6167 == -1) {
                                    var66 = var12.method2701(13171, null, 0, class537.field7727, class37.field491, class386.field5352, class541.field7792, -1, class563.field7993, (class688) var65, -1, class313.field4456, class210.field3250.field9765, class575.field8103, 2048);
                                    if (var66 == null && class564.field8004) {
                                        class564.method3329(var12, arg6 ^ 0xFFFFDF8B);
                                    }
                                } else {
                                    class607 var75 = class563.field7993.method651(var12.field6167, (byte) 96);
                                    var66 = var12.method2701(13171, var75, var12.field6324, class537.field7727, class37.field491, class386.field5352, class541.field7792, var12.field6339, class563.field7993, (class688) var65, var12.field6228, class313.field4456, class210.field3250.field9765, class575.field8103, 2048);
                                    if (var66 == null && class564.field8004) {
                                        class564.method3329(var12, 8195);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field6243 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field6290 << 9) / var12.field6243;
                                    }
                                    int var80;
                                    if (var12.field6267 <= 0) {
                                        var80 = 512;
                                    } else {
                                        var80 = (var12.field6288 << 9) / var12.field6267;
                                    }
                                    int var81 = var12.field6290 / 2 + var18;
                                    int var82 = var12.field6288 / 2 + var19;
                                    if (!var12.field6334) {
                                        var81 += var12.field6196 * var79 >> 9;
                                        var82 += var12.field6206 * var80 >> 9;
                                    }
                                    class494.field7044.method1873();
                                    class37.field491.method550(class494.field7044);
                                    class37.field491.method503(var81, var82, var79, var80);
                                    class37.field491.method518();
                                    if (var12.field6319) {
                                        class37.field491.method544(false);
                                    }
                                    if (var12.field6334) {
                                        class500.field7104.method1888(var12.field6172);
                                        class500.field7104.method1871(var12.field6258);
                                        class500.field7104.method1895(var12.field6208);
                                        class500.field7104.method1878(var12.field6196, var12.field6206, var12.field6274);
                                    } else {
                                        int var83 = (var12.field6299 << 2) * class376.field5186[var12.field6172 << 3] >> 14;
                                        int var84 = (var12.field6299 << 2) * class376.field5188[var12.field6172 << 3] >> 14;
                                        class500.field7104.method1882(-var12.field6208 << 3);
                                        class500.field7104.method1871(var12.field6258 << 3);
                                        class500.field7104.method1878(var12.field6273 << 2, (var12.field6199 << 2) + var67 + var83, var84 - -(var12.field6199 << 2));
                                        class500.field7104.method1877(var12.field6172 << 3);
                                    }
                                    var12.method2694(class500.field7104, false, class37.field491, class192.field2961, var66);
                                    if (class378.field5215) {
                                        class37.field491.method453(var18, var19, var12.field6290 + var18, var12.field6288 + var19);
                                    }
                                    if (var12.field6334) {
                                        if (var12.field6185) {
                                            var66.method106(class500.field7104, null, var12.field6299, 1);
                                        } else {
                                            var66.method88(class500.field7104, null, 1);
                                            if (var12.field6223 != null) {
                                                class37.field491.method504(var12.field6223.method3456());
                                            }
                                        }
                                    } else if (var12.field6185) {
                                        var66.method106(class500.field7104, null, var12.field6299 << 2, 1);
                                    } else {
                                        var66.method88(class500.field7104, null, 1);
                                        if (var12.field6223 != null) {
                                            class37.field491.method504(var12.field6223.method3456());
                                        }
                                    }
                                    if (class378.field5215) {
                                        class37.field491.method434(arg10, arg9, arg0, arg2);
                                    }
                                    if (var12.field6319) {
                                        class37.field491.method544(true);
                                    }
                                }
                                if (class195.field2997) {
                                    if (arg8) {
                                        class33.method272(var13, var14, var16, false, var15);
                                    } else {
                                        class702.method3982(var13, var16, var14, var15, 0);
                                    }
                                }
                            } else if (var12.field6210 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field6201) {
                                    var85 = var19;
                                    var86 = var18 + var12.field6290;
                                    var87 = var12.field6288 + var19;
                                    var88 = var18;
                                } else {
                                    var85 = var19 + var12.field6288;
                                    var88 = var18;
                                    var86 = var12.field6290 + var18;
                                    var87 = var19;
                                }
                                if (var12.field6193 == 1) {
                                    class37.field491.method487(var88, var87, var86, var85, var12.field6304, 0);
                                } else {
                                    class37.field491.method466(var88, var87, var86, var85, var12.field6304, var12.field6193, 0);
                                }
                                if (class195.field2997) {
                                    if (arg8) {
                                        class33.method272(var13, var14, var16, false, var15);
                                    } else {
                                        class702.method3982(var13, var16, var14, var15, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg6 != -120) {
            method2803(32, 19, -99);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 1037)
    public static void method2801(int arg0) {
        field6609 = null;
        int var1 = -41 / ((arg0 + 29) / 32);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IFIII)V", line = 1046)
    public final void method2802(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field6605 != -1) {
            class467 var6 = this.field6607.field774.method1208((byte) 47, this.field6605);
            int var7 = var6.field6582 & 0xFF;
            if (var7 != 0 && var6.field6567 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00) * var7 + ((arg4 & 0xFF00) * var10) & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field6579 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg4 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var13 & 0xFF00) + (var14 >> 8) + (var12 << 8 & 0xFF0017);
            }
        }
        field6615++;
        if (arg1 != 1.0F) {
            int var15 = (arg4 & 0xFF3ADE) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            int var19 = (int) ((float) var16 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var18 << 16 | var19 << 8 | var20;
        }
        this.field6619.method3948(arg0 * 4);
        if (this.field6607.field2443 == 0) {
            this.field6619.method3955((byte) arg4);
            this.field6619.method3955((byte) (arg4 >> 8));
            this.field6619.method3955((byte) (arg4 >> 16));
        } else {
            this.field6619.method3955((byte) (arg4 >> 16));
            this.field6619.method3955((byte) (arg4 >> 8));
            this.field6619.method3955((byte) arg4);
        }
        if (arg2 > -57) {
            this.method2799(null, 5, -7);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 1170)
    public static final void method2803(int arg0, int arg1, int arg2) {
        class46 var3 = class767.field10562[arg0][arg1][arg2];
        if (var3 != null) {
            class393.method2434(var3.field587);
            if (var3.field587 != null) {
                var3.field587 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILvn;)V", line = 1182)
    public static final void method2804(int arg0, class330 arg1) {
        if (arg0 < 33) {
            field6616 = 70;
        }
        field6598++;
        if ((arg1 instanceof class665)) {
            class665 var3 = (class665) arg1;
            if (var3.field9240 == null) {
                return;
            }
            class242.method1616(var3, class210.field3250.field5755 != var3.field5755, 108);
        } else if (arg1 instanceof class702) {
            class702 var2 = (class702) arg1;
            class34.method280(class210.field3250.field5755 != var2.field5755, (byte) -20, var2);
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V", line = 1223)
    public final void method2805(int arg0, byte arg1) {
        this.field6611 = this.field6607.method1154(true, arg0 * 4, 116);
        field6618++;
        if (arg1 == -15) {
            this.field6619 = new Stream(this.field6611, 0, arg0 * 4);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V", line = 1235)
    public final void method2806(byte arg0, int arg1) {
        this.field6619.method3948(arg1 * 4 + 3);
        field6599++;
        this.field6619.method3955(-1);
        if (arg0 >= -72) {
            this.method2806((byte) 69, 45);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V", line = 1250)
    public final void method2807(int arg0, int arg1) {
        field6614++;
        this.field6619.method3945();
        this.field6597 = this.field6607.method1074((byte) 46, false);
        this.field6597.method680(arg1, 112, this.field6611, arg0 * 4);
        this.field6619 = null;
        this.field6611 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lmf;IIIII)V", line = 1271)
    public class471(class439 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6610 = arg0;
        this.field6607 = this.field6610.field5939;
        this.field6602 = arg5;
        this.field6606 = new int[this.field6610.field4290 * this.field6610.field4289];
        this.field6605 = arg1;
        this.field6600 = arg4;
        this.field6601 = arg3;
        this.field6604 = arg2;
    }
}
