import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class80 {

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field891 = 12;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field893 = new String[100];

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([[BZLbl;Lbl;IILvm;[[B[[BZ[[II[[B)V")
    public static final void method441(byte[][] arg0, boolean arg1, class54 arg2, class54 arg3, int arg4, int arg5, class322 arg6, byte[][] arg7, byte[][] arg8, boolean arg9, int[][] arg10, int arg11, byte[][] arg12) {
        if (!arg1) {
            method443(-3);
        }
        field888++;
        for (int var13 = 0; var13 < arg5; var13++) {
            for (int var14 = 0; var14 < arg4; var14++) {
                if (class138.method758(-10762) || class230.method1249(var14, arg11, class351.field4891, var13, -99)) {
                    byte var15 = arg7[var13][var14];
                    byte var16 = arg8[var13][var14];
                    int var17 = arg12[var13][var14] & 0xFF;
                    int var18 = arg0[var13][var14] & 0xFF;
                    class191 var19 = var17 == 0 ? null : class247.method1317((byte) 97, var17 - 1);
                    class262 var20 = var18 == 0 ? null : class405.method2536((byte) 90, var18 - 1);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var21 = var20 == null ? 0 : class164.field2090[var15];
                        var22 = var19 == null ? 0 : class441.field6441[var15];
                    } else if (var19 != null) {
                        var22 = class441.field6441[var15];
                    } else if (var20 != null) {
                        var21 = class441.field6441[var15];
                    }
                    int var23 = var21 + var22;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 != null && (var19.field2417 != -1 || var19.field2413 != -1 || var19.field2412 != -1)) {
                            int var30 = arg6.method1562() ? var19.field2412 : var19.field2404;
                            if (!class2.field19) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field2419;
                                if (var19.field2417 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field2417;
                                }
                                if (var19.field2413 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var26[var24] = var19.field2413;
                                    var29 = true;
                                }
                                var24++;
                            }
                            if (!arg9 && arg11 == 0) {
                                class38.method183(var13, var14, var19.field2408, var19.field2414 * 8);
                            }
                        } else {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var35 = 0; var35 < var21; var35++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var33 = var20.field3570;
                            if (!class2.field19) {
                                var33 = -1;
                            }
                            for (int var34 = 0; var34 < var21; var34++) {
                                var27[var24] = var33;
                                var28[var24] = var20.field3579;
                                var25[var24] = arg10[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class317.field4230.length;
                        int[] var37 = arg9 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class317.field4230[var40];
                            int var49 = class296.field4038[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg9 && class248.field3350[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg3.method265(var52, var53) - arg2.method265(var52, var53);
                            }
                        }
                        int var41 = arg2.method271(var13, var14);
                        int var42 = arg2.method271(var13 + 1, var14);
                        int var43 = arg2.method271(var13 + 1, var14 + 1);
                        int var44 = arg2.method271(var13, var14 + 1);
                        if (arg11 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field2415) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class398.field5751[arg11][var13][var14] = (byte) class392.method2441(class398.field5751[arg11][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg9) {
                            var46 = class7.method36(var13, var14);
                            var47 = class114.method608(var13, var14);
                        }
                        arg2.method267(var13, var14, var38, var37, var39, class418.field6017[var15], class27.field256[var15], class430.field6310[var15], var25, var26, var27, var28, var46, var47, false);
                        class307.method1807(arg11, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method442(int arg0) {
        field893 = null;
        if (arg0 != -7155) {
            field887 = -86;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static final void method443(int arg0) {
        field890++;
        class383.method2371(0);
        class138.method756(85);
        class67.method376(arg0 ^ 0xFFFFFB19);
        class414.method2571((byte) -36);
        class420.method2616(arg0 - 23654);
        class112.method602(true);
        class87.method471(95);
        class428.method2648(22);
        class233.method1260(-2);
        class209.method1136(arg0 ^ arg0);
        class145.method787(arg0 - 23578);
        class138.method754(16704);
        class188.method1014(126);
        class220.method1193(arg0 - 23474);
        class278.method1532(-16236);
        class301.method1783((byte) -80);
        class409.method2552(0);
        class246.method1314(true);
        class195.method1056((byte) 79);
        class169.method893(arg0 - 23572);
        class410.method2558(64);
        class99.method539((byte) -49);
        if (class14.field131 != 0) {
            for (int var1 = 0; var1 < class441.field6442.length; var1++) {
                class441.field6442[var1] = null;
            }
            class359.field5079 = 0;
        }
        class155.method835((byte) -51);
        class252.method1403(119);
        class234.method1270((byte) -111);
        class386.method2396(60);
        class21.method118(2);
        class277.field3758.method613(true);
        class88.field1003.method1623();
        class256.field3500.method220(-1);
        class374.method2248((byte) 93);
        class232.field3209.method1684((byte) -112);
        class30.field292.method1684((byte) -122);
        class262.field3582.method1684((byte) -104);
        class388.field5540.method1684((byte) -91);
        class321.field4297.method1684((byte) -82);
        class371.field5195.method1684((byte) -94);
        class283.field3875.method1684((byte) -91);
        class382.field5449.method1684((byte) -122);
        class72.field797.method1684((byte) -92);
        class275.field3712.method1684((byte) -80);
        class132.field1701.method1684((byte) -75);
        class125.field1599.method1684((byte) -104);
        class211.field2868.method1684((byte) -84);
        class199.field2662.method1684((byte) -102);
        class119.field1490.method1684((byte) -101);
        class72.field794.method1684((byte) -87);
        class243.field3318.method1684((byte) -58);
        class366.field5120.method1684((byte) -84);
        class183.field2331.method1684((byte) -97);
        class211.field2866.method1684((byte) -53);
        class63.field646.method1684((byte) -50);
        class267.field3641.method1684((byte) -82);
        class222.field2974.method1684((byte) -97);
        class183.field2329.method1684((byte) -66);
        class341.field4565.method1684((byte) -63);
        class270.field3660.method1684((byte) -48);
        class312.field4202.method1684((byte) -72);
        class108.field1330.method1684((byte) -55);
        class127.field1649.method1684((byte) -44);
        class422.field6190.method613(true);
        class115.field1433.method613(true);
        client.field3468.method613(true);
        class398.field5730.method613(true);
    }
}
