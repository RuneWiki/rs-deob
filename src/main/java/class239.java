import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class239 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Z")
    private boolean field4015 = false;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    private int field4038 = 32;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "J")
    private long field4032 = class188.method1355(113);

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    private int field4042 = 0;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "Z")
    private boolean field4043 = true;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "J")
    private long field4047 = 0L;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    private int field4044 = 0;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "J")
    private long field4048 = 0L;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    private int field4040 = 0;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "[Lnk;")
    private class102[] field4046 = new class102[8];

    @OriginalMember(owner = "client!va", name = "K", descriptor = "[Lnk;")
    private class102[] field4051 = new class102[8];

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    private int field4050 = 0;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[B")
    public static byte[] field4019 = new byte[520];

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[I")
    public static int[] field4020 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public int field4041;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    private int field4049;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Lnk;")
    private class102 field4025;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Laj;")
    public static class151 field4021;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "[I")
    public int[] field4037;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()I")
    public int method1165() throws Exception {
        field4023++;
        return this.field4041;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public void method1164(int arg0) throws Exception {
        field4030++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
    private final void method1708(int arg0, int arg1) {
        field4035++;
        if (arg0 > -95) {
            return;
        }
        this.field4050 -= arg1;
        if (this.field4050 < 0) {
            this.field4050 = 0;
        }
        if (this.field4025 != null) {
            this.field4025.method112(arg1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static final void method1709(boolean arg0) {
        if (arg0) {
            method1714(false);
        }
        field4018++;
        if (class189.field3017 == 5) {
            class189.field3017 = 6;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIII[Lhg;I)V")
    public static final void method1710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class207[] arg8, int arg9) {
        field4027++;
        class211.method1488(arg4, arg9, arg5, arg0);
        class128.method948();
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class207 var11 = arg8[var10];
            if (var11 != null && (var11.field3465 == arg2 || arg2 == -1412584499 && class162.field2635 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class180.field2877[class215.field3631] = var11.field3368 + arg1;
                    class298.field4867[class215.field3631] = var11.field3424 + arg6;
                    class17.field348[class215.field3631] = var11.field3484;
                    class159.field2607[class215.field3631] = var11.field3481;
                    var12 = class215.field3631++;
                } else {
                    var12 = arg7;
                }
                var11.field3508 = class275.field4598;
                var11.field3471 = var12;
                if (!var11.field3446 || !client.method733(var11)) {
                    if (var11.field3495 > 0) {
                        class189.method1365(var11, -7394);
                    }
                    int var13 = var11.field3368 + arg1;
                    int var14 = var11.field3424 + arg6;
                    int var15 = var11.field3355;
                    if (class45.field701 && (client.method732(var11).field371 != 0 || var11.field3376 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class162.field2635 == var11) {
                        if (arg2 != -1412584499 && !var11.field3420) {
                            class90.field1494 = arg1;
                            class300.field4901 = arg8;
                            class219.field3696 = arg6;
                            continue;
                        }
                        if (class232.field3936 && class313.field5049) {
                            int var16 = class87.field1448;
                            int var17 = class96.field1558;
                            int var18 = var16 - class205.field3285;
                            int var19 = var17 - class73.field1280;
                            if (client.field1627 > var19) {
                                var19 = client.field1627;
                            }
                            if (var19 + var11.field3484 > client.field1627 + class78.field1324.field3484) {
                                var19 = client.field1627 + class78.field1324.field3484 - var11.field3484;
                            }
                            if (class311.field5005 > var18) {
                                var18 = class311.field5005;
                            }
                            var13 = var19;
                            if ((class311.field5005 + class78.field1324.field3481) < (var11.field3481 + var18)) {
                                var18 = class311.field5005 + class78.field1324.field3481 - var11.field3481;
                            }
                            var14 = var18;
                        }
                        if (!var11.field3420) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3376 == 2) {
                        var20 = arg0;
                        var21 = arg9;
                        var22 = arg5;
                        var23 = arg4;
                    } else {
                        var23 = arg4 < var13 ? var13 : arg4;
                        int var24 = var11.field3481 + var14;
                        var21 = arg9 >= var14 ? arg9 : var14;
                        int var25 = var13 + var11.field3484;
                        if (var11.field3376 == 9) {
                            var25++;
                            var24++;
                        }
                        var22 = var25 < arg5 ? var25 : arg5;
                        var20 = arg0 > var24 ? var24 : arg0;
                    }
                    if (!var11.field3446 || var23 < var22 && var20 > var21) {
                        if (var11.field3495 != 0) {
                            if (var11.field3495 == 1337 || var11.field3495 == 1403) {
                                class159.field2603 = var11;
                                class124.field2095 = var13;
                                class73.field1281 = var14;
                                class68.method466((byte) -94, var14, var11.field3495 == 1403, var11.field3481, var11.field3484, var13);
                                class143.field2351[var12] = true;
                                class211.method1488(arg4, arg9, arg5, arg0);
                                continue;
                            }
                            if (var11.field3495 == 1338) {
                                if (!var11.method1452((byte) 67)) {
                                    continue;
                                }
                                class91.method634(var12, var14, var11, var13, (byte) -40);
                                class211.method1488(arg4, arg9, arg5, arg0);
                                if (class292.field4791 != 0 && class292.field4791 != 3 || class259.field4360 || var23 > class289.field4764 || var21 > class115.field1959 || class289.field4764 >= var22 || class115.field1959 >= var20) {
                                    continue;
                                }
                                int var26 = class289.field4764 - var13;
                                int var27 = class115.field1959 - var14;
                                int var28 = var11.field3363[var27];
                                if (var28 > var26 || var26 > var28 + var11.field3359[var27]) {
                                    continue;
                                }
                                int var29 = var26 - var11.field3484 / 2;
                                int var30 = var27 - var11.field3481 / 2;
                                int var31;
                                if (class169.field2739 == 4) {
                                    var31 = (int) class265.field4432 & 0x7FF;
                                } else {
                                    var31 = (int) class265.field4432 + class314.field5060 & 0x7FF;
                                }
                                int var32 = class128.field2130[var31];
                                int var33 = class128.field2133[var31];
                                if (class169.field2739 != 4) {
                                    var33 = (class286.field4738 + 256) * var33 >> 8;
                                    var32 = (class286.field4738 + 256) * var32 >> 8;
                                }
                                int var34 = var29 * var32 + var30 * var33 >> 11;
                                int var35 = var30 * var32 - (var29 * var33) >> 11;
                                int var36;
                                int var37;
                                if (class169.field2739 == 4) {
                                    var36 = class138.field2264 + var34 >> 7;
                                    var37 = class54.field958 - var35 >> 7;
                                } else {
                                    var36 = class16.field314.field715 - (-var34 - 64) - class16.field314.method294((byte) -113) * 64 >> 7;
                                    var37 = class16.field314.field771 + (64 - var35 - class16.field314.method294((byte) -119) * 64) >> 7;
                                }
                                if (class302.field4918 && (class30.field497 & 0x40) != 0) {
                                    class207 var38 = class107.method798(class173.field2785, class42.field646, (byte) -71);
                                    if (var38 == null) {
                                        class118.method895(arg3 + 59);
                                    } else {
                                        class289.method2009(var36, " ->", true, 1L, var37, class169.field2741, class238.field4011, (short) 14);
                                    }
                                    continue;
                                }
                                if (class43.field659 == 1) {
                                    class289.method2009(var36, "", true, 1L, var37, -1, class132.field2178, (short) 18);
                                }
                                class289.method2009(var36, "", true, 1L, var37, -1, class13.field271, (short) 48);
                                continue;
                            }
                            if (var11.field3495 == 1339) {
                                if (var11.method1452((byte) -97)) {
                                    class152.method1159(var14, var13, arg3 + 8312, var11, var12);
                                    class211.method1488(arg4, arg9, arg5, arg0);
                                }
                                continue;
                            }
                            if (var11.field3495 == 1400) {
                                class259.method1851(var11.field3484, var14, var13, 0, var11.field3481);
                                class143.field2351[var12] = true;
                                class236.field3988[var12] = true;
                                class211.method1488(arg4, arg9, arg5, arg0);
                                continue;
                            }
                            if (var11.field3495 == 1401) {
                                class63.method431(var11.field3481, var13, arg3 ^ 0xFFFF92F9, var14, var11.field3484);
                                class143.field2351[var12] = true;
                                class236.field3988[var12] = true;
                                class211.method1488(arg4, arg9, arg5, arg0);
                                continue;
                            }
                            if (var11.field3495 == 1402) {
                                class141.method1053(var14, (byte) 28, var13);
                                class143.field2351[var12] = true;
                                class236.field3988[var12] = true;
                                continue;
                            }
                            if (var11.field3495 == 1405) {
                                if (!class121.field2032) {
                                    continue;
                                }
                                int var39 = var11.field3484 + var13;
                                int var40 = var14 + 15;
                                class169.field2732.method1212("Fps:" + class306.field4957, var39, var40, 16776960, -1);
                                int var129 = var40 + 15;
                                Runtime var41 = Runtime.getRuntime();
                                int var42 = 16776960;
                                int var43 = (int) ((var41.totalMemory() - var41.freeMemory()) / 1024L);
                                if (var43 > 65536) {
                                    var42 = 16711680;
                                }
                                int var44 = 0;
                                class169.field2732.method1212("Mem:" + var43 + "k", var39, var129, var42, -1);
                                int var45 = 16776960;
                                var40 = var129 + 15;
                                int var46 = 0;
                                int var47 = 0;
                                for (int var48 = 0; var48 < 29; var48++) {
                                    var44 += class312.field5024[var48].method1356(-120);
                                    var46 += class312.field5024[var48].method1366((byte) 43);
                                    var47 += class312.field5024[var48].method1358((byte) -55);
                                }
                                int var49 = var47 * 100 / var44;
                                int var50 = var46 * 10000 / var44;
                                String var51 = "Cache:" + class208.method1461(0, 2, arg3 + 119, true, (long) var50) + "% (" + var49 + "%)";
                                class25.field450.method1212(var51, var39, var40, var45, -1);
                                var40 += 12;
                                if (class139.field2272 > 0) {
                                    class25.field450.method1212("Particles: " + class139.field2266 + " / " + class139.field2272, var39, var40, var45, -1);
                                }
                                var40 += 12;
                                class143.field2351[var12] = true;
                                class236.field3988[var12] = true;
                                continue;
                            }
                            if (var11.field3495 == 1406) {
                                class118.field1983 = var14;
                                class147.field2423 = var11;
                                class173.field2788 = var13;
                                continue;
                            }
                        }
                        if (!class259.field4360) {
                            if (var11.field3376 == 0 && var11.field3335 && var23 <= class289.field4764 && var21 <= class115.field1959 && var22 > class289.field4764 && class115.field1959 < var20 && !class45.field701) {
                                class100.field1588[0] = class221.field3718;
                                class63.field1065[0] = class271.field4492;
                                class195.field3154[0] = 1001;
                                class287.field4747 = 1;
                                class184.field2932[0] = "";
                            }
                            if (var23 <= class289.field4764 && var21 <= class115.field1959 && var22 > class289.field4764 && class115.field1959 < var20) {
                                class111.method830(class115.field1959 - var14, -var13 + class289.field4764, var11, -16190);
                            }
                        }
                        if (var11.field3376 == 0) {
                            if (!var11.field3446 && client.method733(var11) && class70.field1169 != var11) {
                                continue;
                            }
                            if (!var11.field3446) {
                                if ((var11.field3344 - var11.field3481) < var11.field3374) {
                                    var11.field3374 = var11.field3344 - var11.field3481;
                                }
                                if (var11.field3374 < 0) {
                                    var11.field3374 = 0;
                                }
                            }
                            method1710(var20, var13 - var11.field3450, var11.field3405, -1, var23, var22, var14 - var11.field3374, var12, arg8, var21);
                            if (var11.field3462 != null) {
                                method1710(var20, var13 - var11.field3450, var11.field3405, -1, var23, var22, var14 - var11.field3374, var12, var11.field3462, var21);
                            }
                            class278 var52 = (class278) class306.field4952.method987(-124, (long) var11.field3405);
                            if (var52 != null) {
                                if (var52.field4623 == 0 && !class259.field4360 && class289.field4764 >= var23 && class115.field1959 >= var21 && var22 > class289.field4764 && var20 > class115.field1959 && !class45.field701) {
                                    class195.field3154[0] = 1001;
                                    class63.field1065[0] = class271.field4492;
                                    class287.field4747 = 1;
                                    class100.field1588[0] = class221.field3718;
                                    class184.field2932[0] = "";
                                }
                                class310.method2086(var22, var23, var14, var20, var13, var12, var52.field4622, (byte) 71, var21);
                            }
                            class211.method1488(arg4, arg9, arg5, arg0);
                            class128.method948();
                        }
                        if (class13.field283[var12] || class227.field3842 > 1) {
                            if (var11.field3376 == 0 && !var11.field3446 && var11.field3481 < var11.field3344) {
                                class141.method1050(var14, var11.field3374, false, var11.field3484 + var13, var11.field3481, var11.field3344);
                            }
                            if (var11.field3376 != 1) {
                                if (var11.field3376 == 2) {
                                    int var53 = 0;
                                    for (int var54 = 0; var54 < var11.field3386; var54++) {
                                        for (int var55 = 0; var55 < var11.field3480; var55++) {
                                            int var56 = (var11.field3466 + 32) * var54 + var14;
                                            int var57 = var13 + ((var11.field3457 + 32) * var55);
                                            if (var53 < 20) {
                                                var57 += var11.field3361[var53];
                                                var56 += var11.field3463[var53];
                                            }
                                            if (var11.field3421[var53] > 0) {
                                                boolean var59 = false;
                                                boolean var60 = false;
                                                int var61 = var11.field3421[var53] - 1;
                                                if (arg4 < var57 + 32 && arg5 > var57 && arg9 < (var56 + 32) && var56 < arg0 || class274.field4582 == var11 && class78.field1320 == var53) {
                                                    class273 var62;
                                                    if (class272.field4554 == 1 && class10.field189 == var53 && class170.field2751 == var11.field3405) {
                                                        var62 = class136.method1012(var11.field3408, 0, var61, (class284) null, 2, -58, var11.field3354[var53]);
                                                    } else {
                                                        var62 = class136.method1012(var11.field3408, 3153952, var61, (class284) null, 1, -42, var11.field3354[var53]);
                                                    }
                                                    if (class128.field2142) {
                                                        class143.field2351[var12] = true;
                                                    }
                                                    if (var62 == null) {
                                                        class206.method1441(~arg3, var11);
                                                    } else if (class274.field4582 == var11 && class78.field1320 == var53) {
                                                        int var63 = class96.field1558 - class11.field192;
                                                        int var64 = class87.field1448 - class61.field1053;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        if (var63 < 5 && var63 > -5) {
                                                            var63 = 0;
                                                        }
                                                        if (class36.field572 < 5) {
                                                            var64 = 0;
                                                            var63 = 0;
                                                        }
                                                        var62.method642(var57 + var63, var56 - -var64, 128);
                                                        if (arg2 != -1) {
                                                            class207 var65 = arg8[arg2 & 0xFFFF];
                                                            int var66 = class211.field3554;
                                                            int var67 = class211.field3550;
                                                            if ((var56 + var64) < var67 && var65.field3374 > 0) {
                                                                int var68 = (var67 - var56 - var64) * class19.field356 / 3;
                                                                if ((class19.field356 * 10) < var68) {
                                                                    var68 = class19.field356 * 10;
                                                                }
                                                                if (var65.field3374 < var68) {
                                                                    var68 = var65.field3374;
                                                                }
                                                                class61.field1053 += var68;
                                                                var65.field3374 -= var68;
                                                                class206.method1441(0, var65);
                                                            }
                                                            if (var66 < (var56 + var64 + 32) && (var65.field3344 - var65.field3481) > var65.field3374) {
                                                                int var69 = (var64 + var56 + 32 - var66) * class19.field356 / 3;
                                                                if (class19.field356 * 10 < var69) {
                                                                    var69 = class19.field356 * 10;
                                                                }
                                                                if (var69 > var65.field3344 - var65.field3481 - var65.field3374) {
                                                                    var69 = var65.field3344 - var65.field3481 - var65.field3374;
                                                                }
                                                                var65.field3374 += var69;
                                                                class61.field1053 -= var69;
                                                                class206.method1441(0, var65);
                                                            }
                                                        }
                                                    } else if (class104.field1692 == var11 && class273.field4576 == var53) {
                                                        var62.method642(var57, var56, 128);
                                                    } else {
                                                        var62.method652(var57, var56);
                                                    }
                                                }
                                            } else if (var11.field3459 != null && var53 < 20) {
                                                class273 var58 = var11.method1454(arg3 ^ 0x3504, var53);
                                                if (var58 != null) {
                                                    var58.method652(var57, var56);
                                                } else if (class125.field2102) {
                                                    class206.method1441(0, var11);
                                                }
                                            }
                                            var53++;
                                        }
                                    }
                                } else if (var11.field3376 == 3) {
                                    int var70;
                                    if (class223.method1581(arg3 ^ 0xFFFFFFC2, var11)) {
                                        var70 = var11.field3343;
                                        if (class70.field1169 == var11 && var11.field3509 != 0) {
                                            var70 = var11.field3509;
                                        }
                                    } else {
                                        var70 = var11.field3403;
                                        if (class70.field1169 == var11 && var11.field3478 != 0) {
                                            var70 = var11.field3478;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3358) {
                                            class211.method1483(var13, var14, var11.field3484, var11.field3481, var70);
                                        } else {
                                            class211.method1477(var13, var14, var11.field3484, var11.field3481, var70);
                                        }
                                    } else if (var11.field3358) {
                                        class211.method1480(var13, var14, var11.field3484, var11.field3481, var70, 256 - (var15 & 0xFF));
                                    } else {
                                        class211.method1484(var13, var14, var11.field3484, var11.field3481, var70, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3376 == 4) {
                                    class165 var71 = var11.method1446(0, class57.field1000);
                                    if (var71 != null) {
                                        String var72 = var11.field3346;
                                        int var73;
                                        if (class223.method1581(109, var11)) {
                                            var73 = var11.field3343;
                                            if (class70.field1169 == var11 && var11.field3509 != 0) {
                                                var73 = var11.field3509;
                                            }
                                            if (var11.field3394.length() > 0) {
                                                var72 = var11.field3394;
                                            }
                                        } else {
                                            var73 = var11.field3403;
                                            if (class70.field1169 == var11 && var11.field3478 != 0) {
                                                var73 = var11.field3478;
                                            }
                                        }
                                        if (var11.field3446 && var11.field3454 != -1) {
                                            class71 var74 = class13.method75(false, var11.field3454);
                                            var72 = var74.field1209;
                                            if (var72 == null) {
                                                var72 = "null";
                                            }
                                            if ((var74.field1183 == 1 || var11.field3434 != 1) && var11.field3434 != -1) {
                                                var72 = "<col=ff9040>" + var72 + "</col> x" + class183.method1328(var11.field3434, false);
                                            }
                                        }
                                        if (class6.field133 == var11) {
                                            var73 = var11.field3403;
                                            var72 = class31.field516;
                                        }
                                        if (!var11.field3446) {
                                            var72 = class208.method1460((byte) -97, var11, var72);
                                        }
                                        var71.method1214(var72, var13, var14, var11.field3484, var11.field3481, var73, var11.field3378 ? 0 : -1, var11.field3456, var11.field3409, var11.field3431);
                                    } else if (class125.field2102) {
                                        class206.method1441(~arg3, var11);
                                    }
                                } else if (var11.field3376 == 5) {
                                    if (!var11.field3446) {
                                        class273 var75 = var11.method1451(class223.method1581(116, var11), true);
                                        if (var75 != null) {
                                            var75.method652(var13, var14);
                                        } else if (class125.field2102) {
                                            class206.method1441(~arg3, var11);
                                        }
                                    } else if (var11.field3398 >= 0) {
                                        class14 var84 = var11.method1449(127);
                                        var84.method81(0, var13, var14, var11.field3484, var11.field3481, var11.field3353, var11.field3511, 0);
                                    } else {
                                        class273 var76;
                                        if (var11.field3454 == -1) {
                                            var76 = var11.method1451(false, true);
                                        } else if (var11.field3499 && class16.field314.field2081 != null) {
                                            var76 = class136.method1012(var11.field3408, var11.field3362, var11.field3454, class16.field314.field2081, var11.field3500, -98, var11.field3434);
                                        } else {
                                            var76 = class136.method1012(var11.field3408, var11.field3362, var11.field3454, (class284) null, var11.field3500, -85, var11.field3434);
                                        }
                                        if (var76 != null) {
                                            int var77 = var76.field4565;
                                            int var78 = var76.field4567;
                                            if (var11.field3406) {
                                                int var80 = (var11.field3481 + var78 - 1) / var78;
                                                int var81 = (var77 + var11.field3484 - 1) / var77;
                                                class211.method1487(var13, var14, var11.field3484 + var13, var11.field3481 + var14);
                                                for (int var82 = 0; var82 < var81; var82++) {
                                                    for (int var83 = 0; var83 < var80; var83++) {
                                                        if (var11.field3388 != 0) {
                                                            var76.method1927(-28, 4096, var11.field3388, var77 * var82 + var13 + (var77 / 2), var78 / 2 + var14 - -(var78 * var83));
                                                        } else if (var15 == 0) {
                                                            var76.method652(var77 * var82 + var13, var78 * var83 + var14);
                                                        } else {
                                                            var76.method642(var13 + (var77 * var82), var78 * var83 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class211.method1488(arg4, arg9, arg5, arg0);
                                            } else {
                                                int var79 = var11.field3484 * 4096 / var77;
                                                if (var11.field3388 != 0) {
                                                    var76.method1927(-94, var79, var11.field3388, var11.field3484 / 2 + var13, var14 - -(var11.field3481 / 2));
                                                } else if (var15 != 0) {
                                                    var76.method659(var13, var14, var11.field3484, var11.field3481, 256 - (var15 & 0xFF));
                                                } else if (var11.field3484 == var77 && var11.field3481 == var78) {
                                                    var76.method652(var13, var14);
                                                } else {
                                                    var76.method661(var13, var14, var11.field3484, var11.field3481);
                                                }
                                            }
                                        } else if (class125.field2102) {
                                            class206.method1441(0, var11);
                                        }
                                    }
                                } else if (var11.field3376 == 6) {
                                    class242 var85 = null;
                                    int var86 = 0;
                                    boolean var87 = class223.method1581(58, var11);
                                    int var88;
                                    if (var87) {
                                        var88 = var11.field3461;
                                    } else {
                                        var88 = var11.field3501;
                                    }
                                    if (var11.field3454 != -1) {
                                        class71 var93 = class13.method75(false, var11.field3454);
                                        if (var93 != null) {
                                            class71 var94 = var93.method492(-110, var11.field3434);
                                            class163 var95 = var88 == -1 ? null : class34.method211(var88, 3);
                                            if (var11.field3499 && class16.field314.field2081 != null) {
                                                var85 = var94.method496(class16.field314.field2081, 1, var95, var11.field3365, true, var11.field3512, var11.field3445);
                                            } else {
                                                var85 = var94.method496((class284) null, 1, var95, var11.field3365, true, var11.field3512, var11.field3445);
                                            }
                                            if (var85 == null) {
                                                class206.method1441(0, var11);
                                            } else {
                                                var86 = -var85.method860() / 2;
                                            }
                                        }
                                    } else if (var11.field3393 == 5) {
                                        if (var11.field3381 == -1) {
                                            var85 = class250.field4232.method1989((class313[]) null, (class163) null, 12, true, -1, false, 0, -1, -1, -1, 0, (class163) null);
                                        } else {
                                            int var89 = var11.field3381;
                                            class123 var90;
                                            if (class297.field4860 == var89) {
                                                var90 = class16.field314;
                                            } else {
                                                var90 = class15.field300[var89];
                                            }
                                            class163 var91 = var88 == -1 ? null : class34.method211(var88, arg3 + 4);
                                            if (var90 != null && (var89 == 2047 || class37.method230((byte) 32, var90.field2069) == var11.field3453)) {
                                                var85 = var90.field2081.method1989((class313[]) null, var91, arg3 + 13, true, var11.field3512, false, 0, -1, 0, -1, 0, (class163) null);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var85 = var11.method1447(-1, (class163) null, 0, var87, class16.field314.field2081, (byte) -78, -1);
                                        if (var85 == null && class125.field2102) {
                                            class206.method1441(~arg3, var11);
                                        }
                                    } else {
                                        class163 var92 = class34.method211(var88, 3);
                                        var85 = var11.method1447(var11.field3512, var92, var11.field3365, var87, class16.field314.field2081, (byte) -78, var11.field3445);
                                        if (var85 == null && class125.field2102) {
                                            class206.method1441(0, var11);
                                        }
                                    }
                                    if (var85 != null) {
                                        int var96;
                                        if (var11.field3332 <= 0) {
                                            var96 = 256;
                                        } else {
                                            var96 = (var11.field3484 << 8) / var11.field3332;
                                        }
                                        int var97 = (var11.field3503 * var96 >> 8) + var11.field3484 / 2 + var13;
                                        int var98;
                                        if (var11.field3411 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field3481 << 8) / var11.field3411;
                                        }
                                        int var99 = (var11.field3341 * var98 >> 8) + var11.field3481 / 2 + var14;
                                        class128.method964(var97, var99);
                                        int var100 = class128.field2133[var11.field3370] * var11.field3352 >> 16;
                                        int var101 = class128.field2130[var11.field3370] * var11.field3352 >> 16;
                                        if (!var11.field3446) {
                                            var85.method869(0, var11.field3366, 0, var11.field3370, 0, var100, var101, -1L);
                                        } else if (var11.field3342) {
                                            ((class112) var85).method864(0, var11.field3366, var11.field3387, var11.field3370, var11.field3429, var100 + var86 + var11.field3372, var101 - -var11.field3372, var11.field3352);
                                        } else {
                                            var85.method869(0, var11.field3366, var11.field3387, var11.field3370, var11.field3429, var86 + var100 + var11.field3372, var101 - -var11.field3372, -1L);
                                        }
                                        class128.method956();
                                    }
                                } else {
                                    if (var11.field3376 == 7) {
                                        class165 var102 = var11.method1446(0, class57.field1000);
                                        if (var102 == null) {
                                            if (class125.field2102) {
                                                class206.method1441(0, var11);
                                            }
                                            continue;
                                        }
                                        int var103 = 0;
                                        for (int var104 = 0; var104 < var11.field3386; var104++) {
                                            for (int var105 = 0; var105 < var11.field3480; var105++) {
                                                if (var11.field3421[var103] > 0) {
                                                    class71 var106 = class13.method75(false, var11.field3421[var103] - 1);
                                                    String var107;
                                                    if (var106.field1183 != 1 && var11.field3354[var103] == 1) {
                                                        var107 = "<col=ff9040>" + var106.field1209 + "</col>";
                                                    } else {
                                                        var107 = "<col=ff9040>" + var106.field1209 + "</col> x" + class183.method1328(var11.field3354[var103], false);
                                                    }
                                                    int var108 = var14 + ((var11.field3466 + 12) * var104);
                                                    int var109 = (var11.field3457 + 115) * var105 + var13;
                                                    if (var11.field3456 == 0) {
                                                        var102.method1234(var107, var109, var108, var11.field3403, var11.field3378 ? 0 : -1);
                                                    } else if (var11.field3456 == 1) {
                                                        var102.method1222(var107, var109 + 57, var108, var11.field3403, var11.field3378 ? 0 : -1);
                                                    } else {
                                                        var102.method1212(var107, var109 + 115 - 1, var108, var11.field3403, var11.field3378 ? 0 : -1);
                                                    }
                                                }
                                                var103++;
                                            }
                                        }
                                    }
                                    if (var11.field3376 == 8 && class163.field2655 == var11 && class61.field1056 == class241.field4068) {
                                        int var110 = 0;
                                        class165 var111 = class169.field2732;
                                        int var112 = 0;
                                        String var113 = var11.field3346;
                                        String var114 = class208.method1460((byte) -97, var11, var113);
                                        while (var114.length() > 0) {
                                            int var122 = var114.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var114;
                                                var114 = "";
                                            } else {
                                                var123 = var114.substring(0, var122);
                                                var114 = var114.substring(var122 + 4);
                                            }
                                            int var124 = var111.method1229(var123);
                                            var112 += var111.field2675 + 1;
                                            if (var110 < var124) {
                                                var110 = var124;
                                            }
                                        }
                                        int var115 = var11.field3481 + var14 + 5;
                                        var110 += 6;
                                        int var116 = var11.field3484 + var13 - (var110 + 5);
                                        var112 += 7;
                                        if ((var112 + var115) > arg0) {
                                            var115 = arg0 - var112;
                                        }
                                        if (var13 + 5 > var116) {
                                            var116 = var13 + 5;
                                        }
                                        if (arg5 < (var110 + var116)) {
                                            var116 = arg5 - var110;
                                        }
                                        class211.method1483(var116, var115, var110, var112, 16777120);
                                        class211.method1477(var116, var115, var110, var112, 0);
                                        int var117 = var111.field2675 + var115 + 2;
                                        String var118 = var11.field3346;
                                        String var119 = class208.method1460((byte) -97, var11, var118);
                                        while (var119.length() > 0) {
                                            int var120 = var119.indexOf("<br>");
                                            String var121;
                                            if (var120 == -1) {
                                                var121 = var119;
                                                var119 = "";
                                            } else {
                                                var121 = var119.substring(0, var120);
                                                var119 = var119.substring(var120 + 4);
                                            }
                                            var111.method1234(var121, var116 + 3, var117, 0, -1);
                                            var117 += var111.field2675 + 1;
                                        }
                                    }
                                    if (var11.field3376 == 9) {
                                        int var125;
                                        int var126;
                                        int var127;
                                        int var128;
                                        if (var11.field3467) {
                                            var125 = var11.field3481 + var14;
                                            var126 = var14;
                                            var127 = var13;
                                            var128 = var13 + var11.field3484;
                                        } else {
                                            var128 = var13 + var11.field3484;
                                            var126 = var11.field3481 + var14;
                                            var127 = var13;
                                            var125 = var14;
                                        }
                                        if (var11.field3348 == 1) {
                                            class211.method1475(var127, var125, var128, var126, var11.field3403);
                                        } else {
                                            class211.method1498(var127, var125, var128, var126, var11.field3403, var11.field3348);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != -1) {
            field4021 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([II)V")
    private final void method1711(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class54.field970) {
            var3 = arg1 << 1;
        }
        class75.method533(arg0, 0, var3);
        this.field4050 -= arg1;
        if (this.field4025 != null && this.field4050 <= 0) {
            this.field4050 += class142.field2343 >> 4;
            class176.method1293(this.field4025, 0);
            this.method1716(this.field4025.method416(), this.field4025, (byte) -91);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class102 var10 = null;
                        class102 var11 = this.field4051[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class257 var12 = var11.field1642;
                                if (var12 == null || var12.field4333 <= var8) {
                                    var11.field1641 = true;
                                    int var13 = var11.method111();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4333 += var13;
                                    }
                                    if (var4 >= this.field4038) {
                                        break label107;
                                    }
                                    class102 var14 = var11.method105();
                                    if (var14 != null) {
                                        int var15 = var11.field1639;
                                        while (var14 != null) {
                                            this.method1716(var15 * var14.method416() >> 8, var14, (byte) -80);
                                            var14 = var11.method109();
                                        }
                                    }
                                    class102 var16 = var11.field1640;
                                    var11.field1640 = null;
                                    if (var10 == null) {
                                        this.field4051[var7] = var16;
                                    } else {
                                        var10.field1640 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4046[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1640;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class102 var18 = this.field4051[var17];
                this.field4051[var17] = this.field4046[var17] = null;
                while (var18 != null) {
                    class102 var19 = var18.field1640;
                    var18.field1640 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4050 < 0) {
            this.field4050 = 0;
        }
        if (this.field4025 != null) {
            this.field4025.method110(arg0, 0, arg1);
        }
        this.field4032 = class188.method1355(104);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1168(Component arg0) throws Exception {
        field4033++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILnk;)V")
    public final synchronized void method1712(int arg0, class102 arg1) {
        this.field4025 = arg1;
        field4024++;
        if (arg0 <= 71) {
            this.field4032 = 48L;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V")
    public void method1169() throws Exception {
        field4029++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public final synchronized void method1713(byte arg0) {
        this.field4043 = true;
        try {
            this.method1166();
            if (arg0 != -30) {
                this.field4050 = 80;
            }
        } catch (Exception var2) {
            this.method1167();
            this.field4047 = class188.method1355(54) + 2000L;
        }
        field4026++;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
    public static void method1714(boolean arg0) {
        field4020 = null;
        if (arg0) {
            method1714(false);
        }
        field4021 = null;
        field4019 = null;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()V")
    public void method1167() {
        field4016++;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public final void method1715(int arg0) {
        if (arg0 == 2) {
            field4031++;
            this.field4043 = true;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILnk;B)V")
    private final void method1716(int arg0, class102 arg1, byte arg2) {
        int var4 = arg0 >> 5;
        field4034++;
        class102 var5 = this.field4046[var4];
        if (var5 == null) {
            this.field4051[var4] = arg1;
        } else {
            var5.field1640 = arg1;
        }
        this.field4046[var4] = arg1;
        arg1.field1639 = arg0;
        if (arg2 >= -67) {
            this.field4043 = false;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public final synchronized void method1717(int arg0) {
        field4017++;
        if (this.field4015) {
            return;
        }
        long var2 = class188.method1355(-79);
        if (arg0 != -6) {
            return;
        }
        try {
            if (var2 > (this.field4032 + 500000L)) {
                this.field4032 = var2 - 500000L;
            }
            while (var2 > (this.field4032 + 5000L)) {
                this.method1708(-97, 256);
                this.field4032 += (long) (256000 / class142.field2343);
            }
        } catch (Exception var7) {
            this.field4032 = var2;
        }
        if (this.field4037 == null) {
            return;
        }
        try {
            if (this.field4047 != 0L) {
                if (var2 < this.field4047) {
                    return;
                }
                this.method1164(this.field4041);
                this.field4043 = true;
                this.field4047 = 0L;
            }
            int var4 = this.method1165();
            if (this.field4042 < this.field4040 - var4) {
                this.field4042 = this.field4040 - var4;
            }
            int var5 = this.field4049 + this.field4045;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field4041) {
                var4 = 0;
                this.field4041 += 1024;
                if (this.field4041 > 16384) {
                    this.field4041 = 16384;
                }
                this.method1167();
                this.method1164(this.field4041);
                if ((var5 + 256) > this.field4041) {
                    var5 = this.field4041 - 256;
                    this.field4049 = var5 - this.field4045;
                }
                this.field4043 = true;
            }
            while (var4 < var5) {
                var4 += 256;
                this.method1711(this.field4037, 256);
                this.method1169();
            }
            if (this.field4048 < var2) {
                if (this.field4043) {
                    this.field4043 = false;
                } else if (this.field4042 == 0 && this.field4044 == 0) {
                    this.method1167();
                    this.field4047 = var2 + 2000L;
                    return;
                } else {
                    this.field4049 = Math.min(this.field4044, this.field4042);
                    this.field4044 = this.field4042;
                }
                this.field4042 = 0;
                this.field4048 = var2 + 2000L;
            }
            this.field4040 = var4;
        } catch (Exception var6) {
            this.method1167();
            this.field4047 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()V")
    public void method1166() throws Exception {
        field4022++;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    public final synchronized void method1718(int arg0) {
        if (arg0 != -1407) {
            this.method1717(117);
        }
        if (class24.field437 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class24.field437.field2112[var3] == this) {
                    class24.field437.field2112[var3] = null;
                }
                if (class24.field437.field2112[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class24.field437.field2122 = true;
                while (class24.field437.field2111) {
                    class28.method182(50L, true);
                }
                class24.field437 = null;
            }
        }
        this.method1167();
        this.field4015 = true;
        this.field4037 = null;
        field4039++;
    }
}
