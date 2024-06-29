import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class58 extends class59 {

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "B")
    public byte field843 = 5;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field833 = 0;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "[I")
    public static int[] field838 = new int[32];

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field837 = 0;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "[Ljava/awt/Color;")
    public static Color[] field846 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "[I")
    public static int[] field831;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
    public static final void method391(int arg0, int arg1) {
        if (arg0 != -1) {
            method393(-95, 28);
        }
        class392.field5892 = arg1;
        field841++;
        class24 var2 = class51.field755;
        synchronized (class51.field755) {
            class51.field755.method212(-119);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lnr;III)V")
    public static final void method392(class437 arg0, int arg1, int arg2, int arg3) {
        field845++;
        if (arg2 < 0 || arg1 < 0 || class161.field2105 == 0 || class188.field2554 == 0) {
            return;
        }
        arg0.method2074(class126.field1674, class78.field1074, class161.field2105, class188.field2554);
        arg0.method2155(class300.field4315, class77.field1056, class161.field2105, class188.field2554);
        if (arg3 != 127) {
            return;
        }
        class116 var4 = arg0.method2060();
        var4.method816(class263.field3837, class197.field2824, class318.field4541, class307.field4394, class335.field4950, class284.field4151);
        arg0.method2059(var4);
        if (class394.field5921 == 0 && class198.field2829 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method2182();
            int var8 = (arg2 - class126.field1674) * var7 / class161.field2105;
            int var9 = (arg1 - class78.field1074) * var7 / class188.field2554;
            int var10 = arg0.method2099();
            int var11 = (arg2 - class126.field1674) * var10 / class161.field2105;
            int var12 = (arg1 - class78.field1074) * var10 / class188.field2554;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method818(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method818(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class324.field4652 > var20 && var22 < class336.field4964) {
                    int var23 = class193.field2688;
                    if (var23 < 3 && (class37.field606[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class198.field2829[var23].method797(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + ((class100.field1350.method130((byte) -30) - 1) * 64) >> 7;
                        var6 = (class100.field1350.method130((byte) -64) - 1) * 64 + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class95.field1307 && (class168.field2212 & 0x40) != 0) {
                    class249 var24 = class358.method2355(class94.field1304, class300.field4307, (byte) -119);
                    if (var24 == null) {
                        class312.method1951(arg3 + 2751);
                    } else {
                        class169.method1048(class369.field5488, 0L, class191.field2667, -1, var5, " ->", var6, 50);
                    }
                } else {
                    if (class126.field1679 == 1) {
                        class169.method1048(-1, 0L, class34.field560, -1, var5, "", var6, 17);
                    }
                    class85.field1177++;
                    class169.method1048(-1, 0L, class205.field2968, -1, var5, "", var6, 57);
                }
            }
        }
        class146 var25 = class357.field5232;
        for (class433 var26 = (class433) var25.method976((byte) 42); var26 != null; var26 = (class433) var25.method979(-95)) {
            if (var26.method2750(arg0, (byte) 67, arg2, arg1) && class193.field2688 == var26.field6382) {
                if (var26.field6384 instanceof class194) {
                    class194 var27 = (class194) var26.field6384;
                    int var28 = var27.method130((byte) -118);
                    if ((var28 & 0x1) == 0 && (var27.field5284 & 0x7F) == 0 && (var27.field5298 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field5284 & 0x7F) == 64 && (var27.field5298 & 0x7F) == 64) {
                        int var29 = var27.field5284 - (var27.method130((byte) -51) * 64 - 64);
                        int var30 = var27.field5298 + 64 - (var27.method130((byte) -106) * 64);
                        for (int var31 = 0; var31 < class191.field2662; var31++) {
                            class129 var36 = class23.field408[class416.field6202[var31]];
                            if (var36 != null && class50.field698 != var36.field217 && var36.field268) {
                                int var37 = var36.field5284 + 64 - (var36.field1714.field5570 * 64);
                                int var38 = var36.field5298 + 64 - (var36.field1714.field5570 * 64);
                                if (var37 >= var29 && var36.field1714.field5570 <= (var27.method130((byte) -88) - (var37 - var29 >> 7)) && var30 <= var38 && var36.field1714.field5570 <= var27.method130((byte) -30) - (var38 - var30 >> 7)) {
                                    class38.method296(false, var36);
                                    var36.field217 = class50.field698;
                                }
                            }
                        }
                        for (int var32 = 0; var32 < class153.field2004; var32++) {
                            class194 var33 = class125.field1664[class66.field943[var32]];
                            if (var33 != null && class50.field698 != var33.field217 && var27 != var33 && var33.field268) {
                                int var34 = var33.field5284 + 64 - (var33.method130((byte) -32) * 64);
                                int var35 = var33.field5298 - ((var33.method130((byte) -112) - 1) * 64);
                                if (var29 <= var34 && var33.method130((byte) -31) <= (var27.method130((byte) -123) - (var34 - var29 >> 7)) && var30 <= var35 && var33.method130((byte) -69) <= (var27.method130((byte) -38) - (var35 - var30 >> 7))) {
                                    class73.method452(var33, 2223);
                                    var33.field217 = class50.field698;
                                }
                            }
                        }
                    }
                    if (class50.field698 == var27.field217) {
                        continue;
                    }
                    class73.method452(var27, 2223);
                    var27.field217 = class50.field698;
                }
                if (var26.field6384 instanceof class129) {
                    class129 var39 = (class129) var26.field6384;
                    if (var39.field1714 != null) {
                        if ((var39.field1714.field5570 & 0x1) == 0 && (var39.field5284 & 0x7F) == 0 && (var39.field5298 & 0x7F) == 0 || (var39.field1714.field5570 & 0x1) == 1 && (var39.field5284 & 0x7F) == 64 && (var39.field5298 & 0x7F) == 64) {
                            int var40 = var39.field5284 + 64 - (var39.field1714.field5570 * 64);
                            int var41 = var39.field5298 + 64 - (var39.field1714.field5570 * 64);
                            for (int var42 = 0; var42 < class191.field2662; var42++) {
                                class129 var47 = class23.field408[class416.field6202[var42]];
                                if (var47 != null && class50.field698 != var47.field217 && var39 != var47 && var47.field268) {
                                    int var48 = var47.field5284 - ((var47.field1714.field5570 - 1) * 64);
                                    int var49 = -(var47.field1714.field5570 * 64) - (-var47.field5298 - 64);
                                    if (var40 <= var48 && var47.field1714.field5570 <= (var39.field1714.field5570 - (var48 - var40 >> 7)) && var49 >= var41 && var47.field1714.field5570 <= var39.field1714.field5570 - (var49 - var41 >> 7)) {
                                        class38.method296(false, var47);
                                        var47.field217 = class50.field698;
                                    }
                                }
                            }
                            for (int var43 = 0; var43 < class153.field2004; var43++) {
                                class194 var44 = class125.field1664[class66.field943[var43]];
                                if (var44 != null && class50.field698 != var44.field217 && var44.field268) {
                                    int var45 = var44.field5284 - (var44.method130((byte) -99) * 64 - 64);
                                    int var46 = var44.field5298 - (var44.method130((byte) -109) * 64 - 64);
                                    if (var40 <= var45 && var44.method130((byte) -115) <= (var39.field1714.field5570 - (var45 - var40 >> 7)) && var46 >= var41 && var44.method130((byte) -127) <= (var39.field1714.field5570 - (var46 - var41 >> 7))) {
                                        class73.method452(var44, 2223);
                                        var44.field217 = class50.field698;
                                    }
                                }
                            }
                        }
                        if (class50.field698 == var39.field217) {
                            continue;
                        }
                        class38.method296(false, var39);
                        var39.field217 = class50.field698;
                    }
                }
                if (var26.field6384 instanceof class114) {
                    class281 var50 = (class281) class231.field3261.method954(73, (long) (var26.field6385 << 14 | var26.field6382 << 28 | var26.field6389));
                    if (var50 != null) {
                        for (class6 var51 = (class6) var50.field4135.method2659(0); var51 != null; var51 = (class6) var50.field4135.method2648(-5525)) {
                            class193 var52 = class166.method1031(var51.field57, false);
                            if (class394.field5921 == 1) {
                                field847++;
                                class169.method1048(class274.field4033, (long) var51.field57, class238.field3341, -1, var26.field6389, class66.field939 + " -> <col=ff9040>" + var52.field2729, var26.field6385, 32);
                            } else if (class95.field1307) {
                                class85 var53 = class86.field1206 == -1 ? null : class391.method2555(class86.field1206, true);
                                if ((class168.field2212 & 0x1) != 0 && (var53 == null || var52.method1208(arg3 - 13, var53.field1181, class86.field1206) != var53.field1181)) {
                                    class169.method1048(class369.field5488, (long) var51.field57, class191.field2667, -1, var26.field6389, class333.field4927 + " -> <col=ff9040>" + var52.field2729, var26.field6385, 7);
                                    class387.field5788++;
                                }
                            } else {
                                String[] var54 = var52.field2753;
                                for (int var55 = 4; var55 >= 0; var55--) {
                                    if (var54 != null && var54[var55] != null) {
                                        byte var56 = 0;
                                        if (var55 == 0) {
                                            var56 = 5;
                                        }
                                        int var57 = class358.field5245;
                                        if (var55 == 1) {
                                            var56 = 39;
                                        }
                                        if (var55 == 2) {
                                            var56 = 46;
                                        }
                                        if (var55 == 3) {
                                            var56 = 58;
                                        }
                                        if (var52.field2700 == var55) {
                                            var57 = var52.field2696;
                                        }
                                        if (var55 == 4) {
                                            var56 = 60;
                                        }
                                        if (var52.field2701 == var55) {
                                            var57 = var52.field2689;
                                        }
                                        class169.method1048(var57, (long) var51.field57, var54[var55], arg3 - 128, var26.field6389, "<col=ff9040>" + var52.field2729, var26.field6385, var56);
                                        class423.field6296++;
                                    }
                                }
                                class169.method1048(class196.field2803, (long) var51.field57, class166.field2173, -1, var26.field6389, "<col=ff9040>" + var52.field2729, var26.field6385, 1005);
                                class163.field2120++;
                            }
                        }
                    }
                }
                if (var26.field6384 instanceof class351) {
                    class351 var58 = (class351) var26.field6384;
                    class404 var59 = class165.method1020(var58.method150((byte) -120), -112);
                    if (var59.field5999 != null) {
                        var59 = var59.method2626(18);
                    }
                    if (var59 != null) {
                        if (class394.field5921 == 1) {
                            class169.method1048(class274.field4033, class157.method1002(var26.field6389, var58, (byte) -108, var26.field6385), class238.field3341, -1, var26.field6389, class66.field939 + " -> <col=00ffff>" + var59.field6075, var26.field6385, 12);
                            class152.field1995++;
                        } else if (class95.field1307) {
                            class85 var60 = class86.field1206 == -1 ? null : class391.method2555(class86.field1206, true);
                            if ((class168.field2212 & 0x4) != 0 && (var60 == null || var59.method2625(class86.field1206, false, var60.field1181) != var60.field1181)) {
                                class337.field4971++;
                                class169.method1048(class369.field5488, class157.method1002(var26.field6389, var58, (byte) -108, var26.field6385), class191.field2667, -1, var26.field6389, class333.field4927 + " -> <col=00ffff>" + var59.field6075, var26.field6385, 44);
                            }
                        } else {
                            String[] var61 = var59.field6028;
                            if (var61 != null) {
                                for (int var62 = 4; var62 >= 0; var62--) {
                                    if (var61[var62] != null) {
                                        short var63 = 0;
                                        int var64 = class358.field5245;
                                        if (var62 == 0) {
                                            var63 = 37;
                                        }
                                        if (var62 == 1) {
                                            var63 = 45;
                                        }
                                        if (var62 == 2) {
                                            var63 = 47;
                                        }
                                        if (var62 == 3) {
                                            var63 = 33;
                                        }
                                        if (var62 == 4) {
                                            var63 = 1011;
                                        }
                                        if (var59.field6058 == var62) {
                                            var64 = var59.field6005;
                                        }
                                        if (var59.field6040 == var62) {
                                            var64 = var59.field6082;
                                        }
                                        class169.method1048(var64, class157.method1002(var26.field6389, var58, (byte) -108, var26.field6385), var61[var62], arg3 - 128, var26.field6389, "<col=00ffff>" + var59.field6075, var26.field6385, var63);
                                        class10.field96++;
                                    }
                                }
                            }
                            class231.field3255++;
                            class169.method1048(class196.field2803, (long) var59.field6059, class166.field2173, -1, var26.field6389, "<col=00ffff>" + var59.field6075, var26.field6385, 1009);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V")
    public static final void method393(int arg0, int arg1) {
        class392.field5886.method215(arg1 ^ arg1, arg0);
        field834++;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
    public static void method394(int arg0) {
        field846 = null;
        field831 = null;
        if (arg0 == 32) {
            field838 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lim;Z)Z")
    public static final boolean method395(class351 arg0, boolean arg1) {
        field842++;
        class404 var2 = class165.method1020(arg0.method150((byte) -111), 40);
        if (arg1) {
            method391(-20, 72);
        }
        if (var2.field6054 == -1) {
            return true;
        } else {
            class57 var3 = class69.method441((byte) -110, var2.field6054);
            return var3.field816 == -1 ? true : var3.method388(-7748);
        }
    }
}
