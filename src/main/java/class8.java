import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Llc;")
    public static class143 field149 = class66.method374("M", -1);

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field158 = 0;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lq;")
    public static class81 field152;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field155;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field150++;
        if (class175.field3132 == 0) {
            int var7 = class140.field2450;
            class158.field2852++;
            int var8 = class92.field1654;
            int var9 = class119.field2109;
            int var10 = class5.field79;
            int var11 = (arg3 - arg4) * (var9 - var7) / arg0 + var7;
            int var12 = (arg1 - arg5) * (var10 - var8) / arg6 + var8;
            if (class71.field1351 && (class106.field1864 & 0x40) == 64) {
                class43 var13 = class185.method1211(-82, class58.field1113, class254.field4564);
                if (var13 == null) {
                    class7.method49(22461);
                } else {
                    class75.method432((short) 12, class55.field1067, var11, true, class179.field3204, var12, 0L);
                }
            } else {
                if (class153.field2764 == 1) {
                    class75.method432((short) 50, class64.field1210, var11, true, class21.field342, var12, 0L);
                }
                class75.method432((short) 46, class33.field556, var11, true, class21.field342, var12, 0L);
            }
        }
        if (arg2 >= -34) {
            field151 = -114;
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class70.field1326; var16++) {
            long var17 = class143.field2524[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3F83) >> 7;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class192.method1300(class170.field3044, var19, var20, var17)) {
                    class209 var23 = class34.method232(167, var22);
                    if (var23.field3868 != null) {
                        var23 = var23.method1467((byte) -127);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class175.field3132 == 1) {
                        class130.field2313++;
                        class75.method432((short) 30, class254.field4549, var19, true, class25.method179(0, new class143[] { class210.field3904, class194.field3597, var23.field3845 }), var20, var17);
                    } else if (!class71.field1351) {
                        class143[] var24 = var23.field3839;
                        if (class258.field4635) {
                            var24 = class72.method415(var24, true);
                        }
                        class169.field3022++;
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class128.field2256++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 18;
                                    }
                                    if (var25 == 1) {
                                        var26 = 58;
                                    }
                                    if (var25 == 2) {
                                        var26 = 43;
                                    }
                                    if (var25 == 3) {
                                        var26 = 40;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1003;
                                    }
                                    class75.method432(var26, var24[var25], var19, true, class25.method179(0, new class143[] { class230.field4210, var23.field3845 }), var20, var17);
                                }
                            }
                        }
                        class75.method432((short) 1001, class118.field2101, var19, true, class25.method179(0, new class143[] { class230.field4210, var23.field3845 }), var20, (long) var23.field3879);
                    } else if ((class106.field1864 & 0x4) == 4) {
                        class75.method432((short) 10, class55.field1067, var19, true, class25.method179(0, new class143[] { class226.field4085, class194.field3597, var23.field3845 }), var20, var17);
                        class70.field1330++;
                    }
                }
                if (var21 == 1) {
                    class187 var27 = class259.field4648[var22];
                    if (var27.field3384.field1531 == 1 && (var27.field4178 & 0x7F) == 64 && (var27.field4108 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class212.field3945; var28++) {
                            class187 var31 = class259.field4648[class56.field1093[var28]];
                            if (var31 != null && var27 != var31 && var31.field3384.field1531 == 1 && var27.field4178 == var31.field4178 && var27.field4108 == var31.field4108) {
                                class252.method1671(class56.field1093[var28], -9747, var20, var31.field3384, var19);
                            }
                        }
                        for (int var29 = 0; var29 < class107.field1889; var29++) {
                            class32 var30 = class6.field97[class30.field467[var29]];
                            if (var30 != null && var27.field4178 == var30.field4178 && var27.field4108 == var30.field4108) {
                                class278.method1839(var20, (byte) 122, var19, class30.field467[var29], var30);
                            }
                        }
                    }
                    class252.method1671(var22, -9747, var20, var27.field3384, var19);
                }
                if (var21 == 0) {
                    class32 var32 = class6.field97[var22];
                    if ((var32.field4178 & 0x7F) == 64 && (var32.field4108 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class212.field3945; var33++) {
                            class187 var36 = class259.field4648[class56.field1093[var33]];
                            if (var36 != null && var36.field3384.field1531 == 1 && var32.field4178 == var36.field4178 && var32.field4108 == var36.field4108) {
                                class252.method1671(class56.field1093[var33], -9747, var20, var36.field3384, var19);
                            }
                        }
                        for (int var34 = 0; var34 < class107.field1889; var34++) {
                            class32 var35 = class6.field97[class30.field467[var34]];
                            if (var35 != null && var32 != var35 && var32.field4178 == var35.field4178 && var32.field4108 == var35.field4108) {
                                class278.method1839(var20, (byte) 122, var19, class30.field467[var34], var35);
                            }
                        }
                    }
                    class278.method1839(var20, (byte) 122, var19, var22, var32);
                }
                if (var21 == 3) {
                    class191 var37 = class130.field2306[class170.field3044][var19][var20];
                    if (var37 != null) {
                        for (class21 var38 = (class21) var37.method1296(111); var38 != null; var38 = (class21) var37.method1289(false)) {
                            int var39 = var38.field332.field4629;
                            class148 var40 = class262.method1743(var39, 17366);
                            if (class175.field3132 == 1) {
                                class268.field4807++;
                                class75.method432((short) 4, class254.field4549, var19, true, class25.method179(0, new class143[] { class210.field3904, class7.field128, var40.field2681 }), var20, (long) var39);
                            } else if (!class71.field1351) {
                                class159.field2870++;
                                class143[] var41 = var40.field2700;
                                if (class258.field4635) {
                                    var41 = class72.method415(var41, true);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class238.field4308++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 32;
                                        }
                                        if (var42 == 1) {
                                            var43 = 37;
                                        }
                                        if (var42 == 2) {
                                            var43 = 59;
                                        }
                                        if (var42 == 3) {
                                            var43 = 15;
                                        }
                                        if (var42 == 4) {
                                            var43 = 41;
                                        }
                                        class75.method432(var43, var41[var42], var19, true, class25.method179(0, new class143[] { class245.field4390, var40.field2681 }), var20, (long) var39);
                                    } else if (var42 == 2) {
                                        class56.field1092++;
                                        class75.method432((short) 59, class64.field1204, var19, true, class25.method179(0, new class143[] { class245.field4390, var40.field2681 }), var20, (long) var39);
                                    }
                                }
                                class75.method432((short) 1005, class118.field2101, var19, true, class25.method179(0, new class143[] { class245.field4390, var40.field2681 }), var20, (long) var39);
                            } else if ((class106.field1864 & 0x1) == 1) {
                                class149.field2736++;
                                class75.method432((short) 23, class55.field1067, var19, true, class25.method179(0, new class143[] { class226.field4085, class7.field128, var40.field2681 }), var20, (long) var39);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method65(byte arg0) {
        field149 = null;
        if (arg0 >= 66) {
            field152 = null;
            field155 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)J")
    public static final long method66(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        return var3 == null || var3.field2124 == null ? 0L : var3.field2124.field1191;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)Z")
    public static final boolean method67(byte arg0) {
        field157++;
        if (arg0 != -6) {
            return true;
        }
        try {
            return class118.method724(true);
        } catch (IOException var4) {
            class287.method1877(0);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class53.field1038 + "," + class70.field1341 + "," + class167.field2988 + " - " + class42.field708 + "," + (class229.field4195.field4148[0] + class148.field2733) + "," + (class229.field4195.field4115[0] + class141.field2466) + " - ";
            for (int var3 = 0; class42.field708 > var3 && var3 < 50; var3++) {
                var2 = var2 + class161.field2902.field3465[var3] + ",";
            }
            class255.method1689(85, var2, var5);
            class39.method252((byte) -125);
            return true;
        }
    }
}
