import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class56 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Z")
    public boolean field1393 = true;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Ldd;")
    private static class35 field1400 = class180.method1196((byte) 127, "K");

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Ldd;")
    public static class35 field1394 = field1400;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Ldd;")
    public static class35 field1398 = class180.method1196((byte) -25, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Ldd;")
    private static class35 field1404 = class180.method1196((byte) 127, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Ldd;")
    public static class35 field1397 = field1400;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Ldd;")
    public static class35 field1405 = class180.method1196((byte) -29, "::fpsoff");

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Ldd;")
    public static class35 field1390 = class180.method1196((byte) -25, "::qa_op_test");

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Ldd;")
    public static class35 field1401 = class180.method1196((byte) 126, " )2>");

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Ldd;")
    public static class35 field1406 = field1404;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Ldd;")
    public static class35 field1410 = class180.method1196((byte) 127, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Ldd;")
    public static class35 field1408 = class180.method1196((byte) 126, "Titelbild geladen)3");

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lv;")
    public static class197 field1409;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
    public static int[] field1395;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)V")
    public static final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class113.field2536 * 128) {
            arg0 = class113.field2536 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class102.field2272 * 128) {
            arg2 = class102.field2272 * 128 - 1;
        }
        class101.field2232++;
        class1.field13 = class11.field211[arg3];
        class201.field4030 = class11.field201[arg3];
        class40.field889 = class11.field211[arg4];
        class137.field2922 = class11.field201[arg4];
        class101.field2219 = class168.field3387[(arg3 - 128) / 32][arg4 / 64];
        class4.field78 = arg0;
        class2.field22 = arg1;
        class29.field590 = arg2;
        class92.field2045 = arg0 / 128;
        class45.field975 = arg2 / 128;
        class88.field1966 = arg5;
        class8.field121 = class92.field2045 - class115.field2583;
        if (class8.field121 < 0) {
            class8.field121 = 0;
        }
        class118.field2617 = class45.field975 - class115.field2583;
        if (class118.field2617 < 0) {
            class118.field2617 = 0;
        }
        class115.field2575 = class92.field2045 + class115.field2583;
        if (class115.field2575 > class113.field2536) {
            class115.field2575 = class113.field2536;
        }
        class59.field1468 = class45.field975 + class115.field2583;
        if (class59.field1468 > class102.field2272) {
            class59.field1468 = class102.field2272;
        }
        class203.method1344();
        class125.field2735 = 0;
        for (int var6 = class88.field1969; var6 < class4.field66; var6++) {
            class54[][] var31 = class191.field3853[var6];
            for (int var32 = class8.field121; var32 < class115.field2575; var32++) {
                for (int var33 = class118.field2617; var33 < class59.field1468; var33++) {
                    class54 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field1213 <= arg5 && (class101.field2219[var32 + class115.field2583 - class92.field2045][var33 + class115.field2583 - class45.field975] || class126.field2746[var6][var32][var33] - arg1 >= 2000)) {
                            var34.field1221 = true;
                            var34.field1235 = true;
                            if (var34.field1218 > 0) {
                                var34.field1223 = true;
                            } else {
                                var34.field1223 = false;
                            }
                            class125.field2735++;
                        } else {
                            var34.field1221 = false;
                            var34.field1235 = false;
                            var34.field1222 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class88.field1969; var7 < class4.field66; var7++) {
            class54[][] var20 = class191.field3853[var7];
            for (int var21 = -class115.field2583; var21 <= 0; var21++) {
                int var22 = class92.field2045 + var21;
                int var23 = class92.field2045 - var21;
                if (var22 >= class8.field121 || var23 < class115.field2575) {
                    for (int var24 = -class115.field2583; var24 <= 0; var24++) {
                        int var25 = class45.field975 + var24;
                        int var26 = class45.field975 - var24;
                        if (var22 >= class8.field121) {
                            if (var25 >= class118.field2617) {
                                class54 var27 = var20[var22][var25];
                                if (var27 != null && var27.field1221) {
                                    class42.method398(var27, true);
                                }
                            }
                            if (var26 < class59.field1468) {
                                class54 var28 = var20[var22][var26];
                                if (var28 != null && var28.field1221) {
                                    class42.method398(var28, true);
                                }
                            }
                        }
                        if (var23 < class115.field2575) {
                            if (var25 >= class118.field2617) {
                                class54 var29 = var20[var23][var25];
                                if (var29 != null && var29.field1221) {
                                    class42.method398(var29, true);
                                }
                            }
                            if (var26 < class59.field1468) {
                                class54 var30 = var20[var23][var26];
                                if (var30 != null && var30.field1221) {
                                    class42.method398(var30, true);
                                }
                            }
                        }
                        if (class125.field2735 == 0) {
                            class80.field1865 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class88.field1969; var8 < class4.field66; var8++) {
            class54[][] var9 = class191.field3853[var8];
            for (int var10 = -class115.field2583; var10 <= 0; var10++) {
                int var11 = class92.field2045 + var10;
                int var12 = class92.field2045 - var10;
                if (var11 >= class8.field121 || var12 < class115.field2575) {
                    for (int var13 = -class115.field2583; var13 <= 0; var13++) {
                        int var14 = class45.field975 + var13;
                        int var15 = class45.field975 - var13;
                        if (var11 >= class8.field121) {
                            if (var14 >= class118.field2617) {
                                class54 var16 = var9[var11][var14];
                                if (var16 != null && var16.field1221) {
                                    class42.method398(var16, false);
                                }
                            }
                            if (var15 < class59.field1468) {
                                class54 var17 = var9[var11][var15];
                                if (var17 != null && var17.field1221) {
                                    class42.method398(var17, false);
                                }
                            }
                        }
                        if (var12 < class115.field2575) {
                            if (var14 >= class118.field2617) {
                                class54 var18 = var9[var12][var14];
                                if (var18 != null && var18.field1221) {
                                    class42.method398(var18, false);
                                }
                            }
                            if (var15 < class59.field1468) {
                                class54 var19 = var9[var12][var15];
                                if (var19 != null && var19.field1221) {
                                    class42.method398(var19, false);
                                }
                            }
                        }
                        if (class125.field2735 == 0) {
                            class80.field1865 = false;
                            return;
                        }
                    }
                }
            }
        }
        class80.field1865 = false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)J")
    public static final long method495(int arg0, int arg1, int arg2) {
        class54 var3 = class191.field3853[arg0][arg1][arg2];
        return var3 == null || var3.field1230 == null ? 0L : var3.field1230.field2747;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Z")
    public static final boolean method496(byte arg0, int arg1) {
        field1402++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else {
            if (arg0 >= -61) {
                method495(41, 64, 27);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method497(int arg0) {
        field1410 = null;
        field1408 = null;
        field1405 = null;
        field1400 = null;
        field1394 = null;
        field1409 = null;
        field1406 = null;
        if (arg0 != 11709) {
            method496((byte) 107, -122);
        }
        field1397 = null;
        field1398 = null;
        field1404 = null;
        field1401 = null;
        field1390 = null;
        field1395 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1403 = arg3;
        this.field1393 = arg6;
        this.field1411 = arg2;
        this.field1391 = arg1;
        this.field1396 = arg4;
        this.field1407 = arg0;
        this.field1399 = arg5;
    }
}
