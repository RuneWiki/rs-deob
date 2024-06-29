import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class53 extends class267 implements class423 {

    @OriginalMember(owner = "client!da", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field445 = new String[8];

    @OriginalMember(owner = "client!da", name = "G", descriptor = "J")
    public static long field449 = 0L;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lbs;")
    public static class587 field446 = new class587(8);

    @OriginalMember(owner = "client!da", name = "H", descriptor = "Lcea;")
    public static class180 field450 = new class180("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Luw;")
    public static class352 field451 = new class352();

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Los;Z)Lhk;")
    public static final class84 method300(class374 arg0, boolean arg1) {
        ++field447;
        if (!arg1) {
            field445 = null;
        }
        return new class84(arg0.method2089(true), arg0.method2089(arg1), arg0.method2089(true), arg0.method2089(true), arg0.method2089(true), arg0.method2089(true), arg0.method2089(arg1), arg0.method2089(true), arg0.method2128(true), arg0.method2129(-63));
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method301(int arg0) {
        field451 = null;
        field445 = null;
        int var1 = -25 % ((arg0 - -21) / 52);
        field446 = null;
        field450 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)I")
    public static final int method302(byte arg0, int arg1) {
        ++field443;
        if (~arg1 != -6407) {
            if (~arg1 == -6410) {
                return 1;
            } else if (arg1 == 32841) {
                return 1;
            } else if (arg1 == 6410) {
                return 2;
            } else if (arg1 != 6407) {
                if (~arg1 == -6409) {
                    return 4;
                } else if (arg0 > -122) {
                    return 27;
                } else {
                    throw new IllegalArgumentException("");
                }
            } else {
                return 3;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ltm;IZ[[I)V")
    public class53(class327 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class10.field80, class160.field1932, arg1 * 6 * arg1, arg2);
        super.field3489.method2459(71, this);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method1497((byte) 76), arg1, arg1, 0, class354.method1986(-73, super.field3465), super.field3489.field4261, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method1493(var6 + 34069, arg1, (byte) 124, arg3[var6], arg1);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[[I)V")
    public static final void method303(int arg0, int[][] arg1) {
        if (arg0 != -7783) {
            method300((class374) null, true);
        }
        ++field444;
        class328.field4287 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIZII)V")
    public static final void method304(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field448;
        if (class383.field5070 == null) {
            class210.field2560.method1118(-16777216, (byte) 99, arg2, arg4, arg1, arg5);
        } else if (~class103.field1265.field8661 <= -1 && class103.field1265.field8661 < class106.field1289 * 128 && ~class103.field1265.field8652 <= -1 && class422.field5452 * 128 > class103.field1265.field8652) {
            ++class631.field9087;
            if (class103.field1265 != null && ~(class103.field1265.field8661 + 64 + -(class103.field1265.method2694(28146) * 64) >> 7) == ~class469.field6549 && ~(class103.field1265.field8652 - (-64 + class103.field1265.method2694(28146) * 64) >> 7) == ~class136.field1666) {
                class469.field6549 = -1;
                class136.field1666 = -1;
                class351.method1956(-9046);
            }
            class307.method1695(3);
            if (!arg3) {
                class513.method2945(-1);
            }
            class389.method2235(false);
            class493.method2847(arg5, true, arg1, arg2, 127, arg4);
            int var6 = class116.field1459;
            int var7 = class265.field3447;
            int var8 = class535.field7503;
            int var9 = class50.field426;
            if (class617.field8931 != 1) {
                if (class617.field8931 != 4) {
                    if (class617.field8931 == 5) {
                        class471.method2746(var8, (byte) 103);
                    }
                } else {
                    int var10 = (int) class588.field8527;
                    if (class87.field1049 >> 8 > var10) {
                        var10 = class87.field1049 >> 8;
                    }
                    if (class637.field9150[4] && class520.field7309[4] + 128 > var10) {
                        var10 = class520.field7309[4] + 128;
                    }
                    int var11 = 16383 & (int) class558.field8223;
                    class618.method3554(var11, var8, class485.field6788, var10, class426.method2400(-1, class449.field6219, class429.field5826, class442.field6099) + -50, class381.field5051, (var10 >> 3) * 3 + 600 << 0, true);
                }
            } else {
                int var12 = (int) class588.field8527;
                if (class87.field1049 >> 8 > var12) {
                    var12 = class87.field1049 >> 8;
                }
                if (class637.field9150[4] && class520.field7309[4] - -128 > var12) {
                    var12 = class520.field7309[4] + 128;
                }
                int var13 = 16383 & (int) class558.field8223 + class330.field4305;
                class618.method3554(var13, var8, class485.field6788, var12, class426.method2400(-1, class103.field1265.field8652, class103.field1265.field8661, class442.field6099) + -50, class381.field5051, (var12 >> 3) * 3 + 600 << 0, true);
            }
            int var14 = class286.field3729;
            if (arg0 < -121) {
                int var15 = class521.field7321;
                int var16 = class39.field303;
                int var17 = class482.field6748;
                int var18 = class168.field2055;
                for (int var19 = 0; ~var19 > -6; ++var19) {
                    if (class637.field9150[var19]) {
                        int var22 = (int) ((double) (class457.field6294[var19] * 2 + 1) * Math.random() - (double) class457.field6294[var19] + Math.sin((double) class637.field9155[var19] / 100.0D * (double) class547.field8052[var19]) * (double) class520.field7309[var19]);
                        if (~var19 == -5) {
                            class482.field6748 += var22;
                            if (class482.field6748 < 1024) {
                                class482.field6748 = 1024;
                            } else if (class482.field6748 > 3072) {
                                class482.field6748 = 3072;
                            }
                        }
                        if (var19 == 0) {
                            class286.field3729 += var22;
                        }
                        if (~var19 == -4) {
                            class168.field2055 = class168.field2055 + var22 & 16383;
                        }
                        if (var19 == 2) {
                            class39.field303 += var22;
                        }
                        if (~var19 == -2) {
                            class521.field7321 += var22;
                        }
                    }
                }
                if (~class286.field3729 > -1) {
                    class286.field3729 = 0;
                }
                if (class286.field3729 > (class238.field2985 << 7) + -1) {
                    class286.field3729 = (class238.field2985 << 7) + -1;
                }
                if (class39.field303 < 0) {
                    class39.field303 = 0;
                }
                if ((class548.field8061 << 7) + -1 < class39.field303) {
                    class39.field303 = (class548.field8061 << 7) + -1;
                }
                class470.method2741(103);
                class643.method3717((byte) -3);
                class210.field2560.method1107(var7, var9, var6 + var7, var8 + var9);
                class210.field2560.method1166();
                int var20 = class357.field4693;
                if (class259.field3340 == null) {
                    class210.field2560.method1156(var20);
                } else {
                    class259.field3340.method3465(0, class482.field6748, var8, class168.field2055, var20, class210.field2560, var9, field452 << 3, var6, var7);
                }
                class93.method560(true);
                class138.field1681.method669(class286.field3729, class521.field7321, class39.field303, -class482.field6748 & 16383, -class168.field2055 & 16383, -class263.field3390 & 16383);
                class210.field2560.method1160(class138.field1681);
                class210.field2560.method1179(var6 / 2 + var7, var8 / 2 + var9, class244.field3141 << 1, class244.field3141 << 1);
                class632.method3636(111, class244.field3141 << 1, var8 / 2 + var9, var6 / 2 + var7, class244.field3141 << 1);
                class13.method106(class286.field3729, 16383 & -class482.field6748, 16383 & -class263.field3390, 16383 & -class168.field2055, (byte) -90, class39.field303, class521.field7321);
                byte var21 = class565.field8299.method3587((byte) 22, class529.field7429) != 2 ? 1 : (byte) class631.field9087;
                class82.method483(class210.field2560, class335.field4358, class230.field2854, class138.field1681, class286.field3729, class521.field7321, class39.field303, class250.field3223, class7.field60, class462.field6375, class318.field4053, class329.field4301, class194.field2351, class103.field1265.field8660 + 1, var21, class103.field1265.field8661 >> 7, class103.field1265.field8652 >> 7, !class565.field8299.field2197);
                class93.method560(true);
                if (class137.field1671 == 9) {
                    class482.method2800(var6, 256, var7, var9, 256, var8, 29741);
                    class461.method2686(var9, var7, var6, var8, -43, 256, 256);
                    class301.method1665(256, 256, var6, var7, -12, var8, var9);
                    class478.method2787(-8, var8, var7, var9, var6);
                }
                class129.method732();
                class482.field6748 = var17;
                class39.field303 = var16;
                class286.field3729 = var14;
                class521.field7321 = var15;
                class168.field2055 = var18;
                if (class124.field1527 && ~class232.field2861.method2532((byte) -29) == -1) {
                    class124.field1527 = false;
                }
                if (class124.field1527) {
                    class210.field2560.method1118(-16777216, (byte) 81, var6, var7, var9, var8);
                    class164.method893(class326.field4163.method987(class31.field247, 22), false, class137.field1673, 19206);
                }
            }
        } else {
            class210.field2560.method1118(-16777216, (byte) 60, arg2, arg4, arg1, arg5);
        }
    }
}
