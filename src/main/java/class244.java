import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class244 {

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Lwa;")
    public static class75 field4108 = class66.method560("mapscene", false);

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "[Lwa;")
    public static class75[] field4114 = new class75[100];

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Lwa;")
    public static class75 field4118 = class66.method560("mapflag", false);

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lwa;")
    private static class75 field4109 = class66.method560("Use", false);

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lwa;")
    public static class75 field4110 = field4109;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "F")
    public static float field4117;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Lcb;")
    public static class267 field4107;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 7)
    public static void method1768(int arg0) {
        field4107 = null;
        field4109 = null;
        field4118 = null;
        field4110 = null;
        field4114 = null;
        if (arg0 < 88) {
            method1768(110);
        }
        field4108 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIILpk;II)V", line = 23)
    public static final void method1769(int arg0, int arg1, int arg2, int arg3, class104 arg4, int arg5, int arg6) {
        if (arg5 >= -26) {
            field4118 = (class75) null;
        }
        boolean var7 = true;
        field4116++;
        long var8 = 0L;
        if (arg2 == 0) {
            var8 = class230.method1684(arg3, arg1, arg0);
        } else if (arg2 == 1) {
            var8 = class237.method1720(arg3, arg1, arg0);
        } else if (arg2 == 2) {
            var8 = class237.method1719(arg3, arg1, arg0);
        } else if (arg2 == 3) {
            var8 = class196.method1463(arg3, arg1, arg0);
        }
        boolean var10 = false;
        int var11 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
        int var12 = ((int) var8 & 0x34A755) >> 20;
        class108 var13 = class3.method14((byte) 83, var11);
        if (var13.method841((byte) -112)) {
            class108.method840(arg0, arg1, var13, 45, arg3);
        }
        boolean var14 = false;
        int var15 = ((int) var8 & 0x7CEEE) >> 14;
        if (var8 == 0L) {
            return;
        }
        class171 var16 = null;
        class171 var17 = null;
        if (arg2 == 0) {
            class167 var18 = class140.method1082(arg3, arg1, arg0);
            if (var18 != null) {
                var16 = var18.field2815;
                var17 = var18.field2809;
            }
            if (var13.field1820 != 0) {
                arg4.method810(var15, (byte) -109, var13.field1836, arg1, arg0, var12);
            }
        } else if (arg2 == 1) {
            class235 var21 = class104.method811(arg3, arg1, arg0);
            if (var21 != null) {
                var16 = var21.field3977;
                var17 = var21.field3963;
            }
        } else if (arg2 == 2) {
            class285 var20 = class246.method1774(arg3, arg1, arg0);
            if (var20 != null) {
                var16 = var20.field4898;
            }
            if (var13.field1820 != 0 && (var13.field1856 + arg1) < 104 && arg0 + var13.field1856 < 104 && var13.field1837 + arg1 < 104 && (var13.field1837 + arg0) < 104) {
                arg4.method824(var13.field1836, 48, arg1, arg0, var12, var13.field1856, var13.field1837);
            }
        } else if (arg2 == 3) {
            class217 var19 = class130.method1020(arg3, arg1, arg0);
            if (var19 != null) {
                var16 = var19.field3707;
            }
            if (var13.field1820 == 1) {
                arg4.method813(arg1, arg0, (byte) 58);
            }
        }
        if (!var13.field1840) {
            return;
        }
        if (var15 == 2) {
            if ((var16 instanceof class214)) {
                ((class214) var16).method1574(-127);
            } else {
                class72.method599(-13873, var15, 0, var13, arg6, var12 + 4, arg1, arg0, 0);
            }
            if ((var17 instanceof class214)) {
                ((class214) var17).method1574(18);
            } else {
                class72.method599(-13873, var15, 0, var13, arg6, var12 + 1 & 0x3, arg1, arg0, 0);
            }
        } else if (var15 == 5) {
            if ((var16 instanceof class214)) {
                ((class214) var16).method1574(82);
            } else {
                class72.method599(-13873, 4, class10.field133[var12] * 8, var13, arg6, var12, arg1, arg0, class232.field3926[var12] * 8);
            }
        } else if (var15 == 6) {
            if (var16 instanceof class214) {
                ((class214) var16).method1574(113);
            } else {
                class72.method599(-13873, 4, class276.field4750[var12] * 8, var13, arg6, var12 + 4, arg1, arg0, class12.field163[var12] * 8);
            }
        } else if (var15 == 7) {
            if ((var16 instanceof class214)) {
                ((class214) var16).method1574(32);
            } else {
                class72.method599(-13873, 4, 0, var13, arg6, (var12 + 2 & 0x3) + 4, arg1, arg0, 0);
            }
        } else if (var15 == 8) {
            if ((var16 instanceof class214)) {
                ((class214) var16).method1574(-120);
            } else {
                class72.method599(-13873, 4, class276.field4750[var12] * 8, var13, arg6, var12 + 4, arg1, arg0, class12.field163[var12] * 8);
            }
            if ((var17 instanceof class214)) {
                ((class214) var17).method1574(-124);
            } else {
                class72.method599(-13873, 4, class276.field4750[var12] * 8, var13, arg6, (var12 + 2 & 0x3) + 4, arg1, arg0, class12.field163[var12] * 8);
            }
        } else if (var15 == 11) {
            if ((var16 instanceof class214)) {
                ((class214) var16).method1574(-126);
            } else {
                class72.method599(-13873, 10, 0, var13, arg6, var12 + 4, arg1, arg0, 0);
            }
        } else if (var16 instanceof class214) {
            ((class214) var16).method1574(68);
        } else {
            class72.method599(-13873, var15, 0, var13, arg6, var12, arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILre;B)V", line = 224)
    public static final void method1770(int arg0, int arg1, int arg2, class262 arg3, byte arg4) {
        int var5 = 81 % ((arg4 + 54) / 38);
        field4113++;
        class54.method393((byte) 43);
        class222.method1638(arg2, arg1, arg3.field4531 + arg2, arg3.field4517 + arg1);
        if (class217.field3718 == 2 || class217.field3718 == 5 || class63.field1098 == null) {
            class258 var58 = arg3.method1868(false, false);
            if (var58 != null) {
                var58.method157(arg2, arg1);
            }
        } else {
            int var6 = class279.field4831.field3259 / 32 + 48;
            int var7 = class290.field4981 + class249.field4191 & 0x7FF;
            int var8 = 464 - (class279.field4831.field3218 / 32);
            ((class277) class63.field1098).method1970(arg2, arg1, arg3.field4531, arg3.field4517, var6, var8, var7, class14.field191 + 256, (class277) arg3.method1868(false, false));
            if (class13.field179 != null) {
                for (int var9 = 0; var9 < class13.field179.field2344; var9++) {
                    if (class13.field179.method1051(true, var9)) {
                        int var10 = (class13.field179.field2341[var9] - class275.field4737) * 4 + 2 - (class279.field4831.field3259 / 32);
                        int var11 = (class13.field179.field2352[var9] - class175.field2939) * 4 + 2 - (class279.field4831.field3218 / 32);
                        int var12 = class21.field288[var7];
                        int var13 = var12 * 256 / (class14.field191 + 256);
                        int var14 = class21.field286[var7];
                        int var15 = var14 * 256 / (class14.field191 + 256);
                        int var16 = var10 * var15 + var11 * var13 >> 16;
                        int var17 = var11 * var15 - var10 * var13 >> 16;
                        class101 var18 = class132.field2280;
                        if (class13.field179.method1049(var9, (byte) 103) == 1) {
                            var18 = class269.field4654;
                        }
                        if (class13.field179.method1049(var9, (byte) 103) == 2) {
                            var18 = class3.field28;
                        }
                        int var19 = var18.method789(class13.field179.field2350[var9], 100);
                        int var20 = var16 - var19 / 2;
                        if (var20 >= -arg3.field4531 && var20 <= arg3.field4531 && (-arg3.field4517) <= var17 && arg3.field4517 >= var17) {
                            int var21 = 16777215;
                            if (class13.field179.field2340[var9] != -1) {
                                var21 = class13.field179.field2340[var9];
                            }
                            class222.method1627((class277) arg3.method1868(false, false));
                            var18.method775(class13.field179.field2350[var9], arg3.field4531 / 2 + arg2 + var20, -var17 + arg1 - -(arg3.field4517 / 2), var19, 50, var21, 0, 256, 1, 0, 0);
                            class222.method1636();
                        }
                    }
                }
            }
            for (int var22 = 0; var22 < class267.field4634; var22++) {
                int var23 = class166.field2791[var22] * 4 + 2 - class279.field4831.field3259 / 32;
                int var24 = class7.field97[var22] * 4 + 2 - (class279.field4831.field3218 / 32);
                class108 var25 = class3.method14((byte) 83, class54.field898[var22]);
                if (var25.field1812 != null) {
                    var25 = var25.method849(true);
                    if (var25 == null || var25.field1855 == -1) {
                        continue;
                    }
                }
                class263.method1880(arg1, 1926111120, arg3, arg2, var24, class196.field3295[var25.field1855], var23);
            }
            for (int var26 = 0; var26 < 104; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    class170 var28 = class130.field2245[class67.field1174][var26][var27];
                    if (var28 != null) {
                        int var29 = var27 * 4 + 2 - (class279.field4831.field3218 / 32);
                        int var30 = var26 * 4 + 2 - (class279.field4831.field3259 / 32);
                        class263.method1880(arg1, 1926111120, arg3, arg2, var29, class246.field4156[0], var30);
                    }
                }
            }
            for (int var31 = 0; var31 < class121.field2031; var31++) {
                class295 var32 = class35.field521[class132.field2281[var31]];
                if (var32 != null && var32.method744((byte) -115)) {
                    class229 var33 = var32.field5070;
                    if (var33 != null && var33.field3868 != null) {
                        var33 = var33.method1673(false);
                    }
                    if (var33 != null && var33.field3839 && var33.field3887) {
                        int var34 = var32.field3259 / 32 - (class279.field4831.field3259 / 32);
                        int var35 = var32.field3218 / 32 - (class279.field4831.field3218 / 32);
                        class263.method1880(arg1, 1926111120, arg3, arg2, var35, class246.field4156[1], var34);
                    }
                }
            }
            for (int var36 = 0; var36 < class229.field3894; var36++) {
                class96 var37 = class169.field2842[class65.field1131[var36]];
                if (var37 != null && var37.method744((byte) -108)) {
                    int var38 = var37.field3259 / 32 - (class279.field4831.field3259 / 32);
                    boolean var39 = false;
                    int var40 = var37.field3218 / 32 - (class279.field4831.field3218 / 32);
                    long var41 = var37.field1561.method630(-79);
                    for (int var43 = 0; var43 < class40.field628; var43++) {
                        if (class120.field2026[var43] == var41 && class173.field2930[var43] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class279.field4831.field1560 != 0 && var37.field1560 != 0 && class279.field4831.field1560 == var37.field1560) {
                        var44 = true;
                    }
                    if (var39) {
                        class263.method1880(arg1, 1926111120, arg3, arg2, var40, class246.field4156[3], var38);
                    } else if (var44) {
                        class263.method1880(arg1, 1926111120, arg3, arg2, var40, class246.field4156[4], var38);
                    } else {
                        class263.method1880(arg1, 1926111120, arg3, arg2, var40, class246.field4156[2], var38);
                    }
                }
            }
            class51[] var45 = class219.field3747;
            for (int var46 = 0; var46 < var45.length; var46++) {
                class51 var47 = var45[var46];
                if (var47 != null && var47.field839 != 0 && class143.field2463 % 20 < 10) {
                    if (var47.field839 == 1 && var47.field851 >= 0 && var47.field851 < class35.field521.length) {
                        class295 var48 = class35.field521[var47.field851];
                        if (var48 != null) {
                            int var49 = var48.field3259 / 32 - (class279.field4831.field3259 / 32);
                            int var50 = var48.field3218 / 32 - (class279.field4831.field3218 / 32);
                            class187.method1414(var50, var49, arg1, var47.field846, arg2, arg3, -35);
                        }
                    }
                    if (var47.field839 == 2) {
                        int var51 = (var47.field835 - class275.field4737) * 4 + 2 - (class279.field4831.field3259 / 32);
                        int var52 = (var47.field831 - class175.field2939) * 4 + 2 - (class279.field4831.field3218 / 32);
                        class187.method1414(var52, var51, arg1, var47.field846, arg2, arg3, 101);
                    }
                    if (var47.field839 == 10 && var47.field851 >= 0 && var47.field851 < class169.field2842.length) {
                        class96 var53 = class169.field2842[var47.field851];
                        if (var53 != null) {
                            int var54 = var53.field3259 / 32 - (class279.field4831.field3259 / 32);
                            int var55 = var53.field3218 / 32 - class279.field4831.field3218 / 32;
                            class187.method1414(var55, var54, arg1, var47.field846, arg2, arg3, 126);
                        }
                    }
                }
            }
            if (class158.field2719 != 0) {
                int var56 = class91.field1497 * 4 + 2 - class279.field4831.field3218 / 32;
                int var57 = class158.field2719 * 4 + 2 - class279.field4831.field3259 / 32;
                class263.method1880(arg1, 1926111120, arg3, arg2, var56, class66.field1144, var57);
            }
            class222.method1632(arg3.field4531 / 2 + arg2 - 1, arg3.field4517 / 2 + arg1 + -1, 3, 3, 16777215);
        }
        class226.field3815[arg0] = true;
        class219.field3743[arg0] = true;
    }
}
