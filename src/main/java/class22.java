import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 extends class34 {

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "[Lgl;")
    public class210[] field420;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[B")
    public byte[] field407;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "[I")
    private int[] field418;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "[S")
    public short[] field416;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "[B")
    public byte[] field415;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "[B")
    public byte[] field421;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "[Lsh;")
    public class212[] field408;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lcc;")
    public static class209 field410 = class95.method669(127, "Atteindre");

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Lbd;")
    public static class185 field419 = new class185(64);

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "J")
    public static long field424;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[[[Lfi;")
    public static class109[][][] field412;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public final void method187(int arg0) {
        field425++;
        if (arg0 > -125) {
            this.method190((class67) null, (int[]) null, (byte[]) null, -119);
        }
        this.field418 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Llk;B)V")
    public static final void method188(class81 arg0, byte arg1) {
        arg0.field1551 = arg0.field1549;
        field411++;
        if (arg0.field1510 == 0) {
            arg0.field1554 = 0;
            return;
        }
        if (arg0.field1541 != -1 && arg0.field1539 == 0) {
            class241 var2 = class245.method1706(arg0.field1541, (byte) 120);
            if (arg0.field1573 > 0 && var2.field4345 == 0) {
                arg0.field1554++;
                return;
            }
            if (arg0.field1573 <= 0 && var2.field4350 == 0) {
                arg0.field1554++;
                return;
            }
        }
        int var3 = arg0.field1571;
        int var4 = arg0.field1534;
        int var5 = arg0.field1548[arg0.field1510 - 1] * 128 + (arg0.method577((byte) -44) * 64);
        int var6 = arg0.field1567[arg0.field1510 - 1] * 128 + (arg0.method577((byte) 55) * 64);
        if (var5 - var3 > 256 || (var5 - var3) < -256 || (var6 - var4) > 256 || (var6 - var4) < -256) {
            arg0.field1534 = var6;
            arg0.field1571 = var5;
            return;
        }
        if (var3 < var5) {
            if (var6 > var4) {
                arg0.field1570 = 1280;
            } else if (var6 < var4) {
                arg0.field1570 = 1792;
            } else {
                arg0.field1570 = 1536;
            }
        } else if (var3 > var5) {
            if (var4 < var6) {
                arg0.field1570 = 768;
            } else if (var4 <= var6) {
                arg0.field1570 = 512;
            } else {
                arg0.field1570 = 256;
            }
        } else if (var6 > var4) {
            arg0.field1570 = 1024;
        } else if (var4 > var6) {
            arg0.field1570 = 0;
        }
        int var7 = arg0.field1570 - arg0.field1504 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1544;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1561;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1543;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1520;
        }
        if (var8 == -1) {
            var8 = arg0.field1561;
        }
        arg0.field1551 = var8;
        boolean var10 = true;
        if (arg0 instanceof class163) {
            var10 = ((class163) arg0).field2969.field4241;
        }
        if (var10) {
            if (arg0.field1570 != arg0.field1504 && arg0.field1559 == -1 && arg0.field1516 != 0) {
                var9 = 2;
            }
            if (arg0.field1510 > 2) {
                var9 = 6;
            }
            if (arg0.field1510 > 3) {
                var9 = 8;
            }
            if (arg0.field1554 > 0 && arg0.field1510 > 1) {
                var9 = 8;
                arg0.field1554--;
            }
        } else {
            if (arg0.field1510 > 1) {
                var9 = 6;
            }
            if (arg0.field1510 > 2) {
                var9 = 8;
            }
            if (arg0.field1554 > 0 && arg0.field1510 > 1) {
                arg0.field1554--;
                var9 = 8;
            }
        }
        if (arg0.field1574[arg0.field1510 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var4) {
            arg0.field1534 += var9;
            if (var6 < arg0.field1534) {
                arg0.field1534 = var6;
            }
        } else if (var4 > var6) {
            arg0.field1534 -= var9;
            if (arg0.field1534 < var6) {
                arg0.field1534 = var6;
            }
        }
        if (var9 >= 8 && arg0.field1561 == arg0.field1551 && arg0.field1513 != -1) {
            arg0.field1551 = arg0.field1513;
        }
        if (arg1 < 90) {
            field410 = null;
        }
        if (var5 > var3) {
            arg0.field1571 += var9;
            if (arg0.field1571 > var5) {
                arg0.field1571 = var5;
            }
        } else if (var5 < var3) {
            arg0.field1571 -= var9;
            if (var5 > arg0.field1571) {
                arg0.field1571 = var5;
            }
        }
        if (arg0.field1571 != var5 || arg0.field1534 != var6) {
            return;
        }
        arg0.field1510--;
        if (arg0.field1573 > 0) {
            arg0.field1573--;
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
    public static void method189(int arg0) {
        if (arg0 == -2000) {
            field410 = null;
            field412 = null;
            field419 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lrc;[I[BI)Z")
    public final boolean method190(class67 arg0, int[] arg1, byte[] arg2, int arg3) {
        boolean var5 = true;
        int var6 = 0;
        field414++;
        class212 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field418[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method497(arg1, true, var9 >> 2);
                        } else {
                            var7 = arg0.method487(arg1, false, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field408[var8] = var7;
                        this.field418[var8] = 0;
                    }
                }
            }
        }
        if (arg3 < 101) {
            field424 = 3L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[Lji;IIIIIII)V")
    public static final void method191(int arg0, int arg1, class42[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field413++;
        class4.method32(arg4, arg3, arg8, arg1);
        class15.method129();
        int var10 = 0;
        if (arg6 <= 57) {
            method189(-118);
        }
        while (arg2.length > var10) {
            class42 var11 = arg2[var10];
            if (var11 != null && (var11.field710 == arg7 || arg7 == -1412584499 && class207.field3691 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class45.field900[class266.field4771] = var11.field801 + arg9;
                    class163.field2958[class266.field4771] = var11.field756 + arg0;
                    class21.field400[class266.field4771] = var11.field789;
                    class210.field3831[class266.field4771] = var11.field758;
                    var12 = class266.field4771++;
                } else {
                    var12 = arg5;
                }
                var11.field766 = class163.field2968;
                var11.field722 = var12;
                if (!var11.field795 || !client.method1078(var11)) {
                    label867: {
                        if (var11.field715 > 0) {
                            class268.method1825(var11, (byte) 110);
                        }
                        int var13 = var11.field756 + arg0;
                        int var14 = var11.field801 + arg9;
                        int var15 = var11.field765;
                        if (class70.field1332 && (client.method1070(var11) != 0 || var11.field810 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class207.field3691 == var11) {
                            if (arg7 != -1412584499 && !var11.field785) {
                                class84.field1673 = arg0;
                                class73.field1388 = arg9;
                                class234.field4216 = arg2;
                                break label867;
                            }
                            if (!var11.field785) {
                                var15 = 128;
                            }
                            if (class246.field4457 && class278.field4888) {
                                int var16 = class150.field2735;
                                int var17 = class126.field2435;
                                int var18 = var17 - class218.field3925;
                                if (var18 < class94.field1864) {
                                    var18 = class94.field1864;
                                }
                                int var19 = var16 - class93.field1845;
                                if (class94.field1864 + class178.field3242.field758 < var11.field758 + var18) {
                                    var18 = class94.field1864 + class178.field3242.field758 - var11.field758;
                                }
                                if (class262.field4726 > var19) {
                                    var19 = class262.field4726;
                                }
                                var13 = var18;
                                if ((class262.field4726 + class178.field3242.field789) < (var19 + var11.field789)) {
                                    var19 = class262.field4726 + class178.field3242.field789 - var11.field789;
                                }
                                var14 = var19;
                            }
                        }
                        int var20;
                        int var21;
                        int var24;
                        int var25;
                        if (var11.field810 == 2) {
                            var21 = arg3;
                            var25 = arg8;
                            var20 = arg4;
                            var24 = arg1;
                        } else {
                            var20 = var14 > arg4 ? var14 : arg4;
                            var21 = arg3 >= var13 ? arg3 : var13;
                            int var22 = var14 + var11.field789;
                            int var23 = var11.field758 + var13;
                            if (var11.field810 == 9) {
                                var23++;
                                var22++;
                            }
                            var24 = var23 < arg1 ? var23 : arg1;
                            var25 = arg8 > var22 ? var22 : arg8;
                        }
                        if (!var11.field795 || var20 < var25 && var21 < var24) {
                            label877: {
                                if (var11.field715 != 0) {
                                    if (var11.field715 == 1337) {
                                        class51.field1021 = var11;
                                        class190.field3443 = var13;
                                        class62.field1231 = var14;
                                        class124.method901(var14, var13, var11.field789, var11.field758, var11.field715 == 1403, -120);
                                        class4.method32(arg4, arg3, arg8, arg1);
                                        break label877;
                                    }
                                    if (var11.field715 == 1338) {
                                        if (!var11.method319(-17765)) {
                                            break label877;
                                        }
                                        class44.method329(var14, 32133, var12, var11, var13);
                                        class4.method32(arg4, arg3, arg8, arg1);
                                        if (class8.field158 != 0 && class8.field158 != 3 || class244.field4418 || class231.field4200 < var20 || var21 > class56.field1161 || var25 <= class231.field4200 || class56.field1161 >= var24) {
                                            break label877;
                                        }
                                        int var26 = class231.field4200 - var14;
                                        int var27 = class56.field1161 - var13;
                                        int var28 = var11.field838[var27];
                                        if (var26 < var28 || var26 > var11.field757[var27] + var28) {
                                            break label877;
                                        }
                                        int var29 = var26 - var11.field789 / 2;
                                        int var30 = var27 - var11.field758 / 2;
                                        int var31 = class54.field1066 + class253.field4565 & 0x7FF;
                                        int var32 = class15.field278[var31];
                                        int var33 = class15.field280[var31];
                                        int var34 = (class132.field2523 + 256) * var32 >> 8;
                                        int var35 = (class132.field2523 + 256) * var33 >> 8;
                                        int var36 = var30 * var35 - var29 * var34 >> 11;
                                        int var37 = class223.field4069.field1534 - var36 >> 7;
                                        int var38 = var29 * var35 + var30 * var34 >> 11;
                                        int var39 = class223.field4069.field1571 + var38 >> 7;
                                        if (class260.field4689 && (class49.field948 & 0x40) != 0) {
                                            class42 var40 = class116.method827(class172.field3147, (byte) 64, class222.field4053);
                                            if (var40 == null) {
                                                class70.method514((byte) 110);
                                            } else {
                                                class252.method1740(1L, (byte) 90, class184.field3318, var37, (short) 16, class40.field684, var39);
                                            }
                                            break label877;
                                        }
                                        if (class218.field3936 == 1) {
                                            class252.method1740(1L, (byte) 90, class126.field2449, var37, (short) 23, class246.field4451, var39);
                                        }
                                        class252.method1740(1L, (byte) 90, class74.field1394, var37, (short) 31, class246.field4451, var39);
                                        break label877;
                                    }
                                    if (var11.field715 == 1339) {
                                        if (var11.method319(-17765)) {
                                            class86.method620(var11, var12, var13, 3, var14);
                                            class4.method32(arg4, arg3, arg8, arg1);
                                        }
                                        break label877;
                                    }
                                    if (var11.field715 == 1400) {
                                        class90.method641(var11.field789, (byte) 4, var11.field758, var14, var13);
                                        class129.field2476[var12] = true;
                                        class31.field562[var12] = true;
                                        class4.method32(arg4, arg3, arg8, arg1);
                                        break label877;
                                    }
                                    if (var11.field715 == 1401) {
                                        class82.method595(var14, (byte) 75, var11.field789, var11.field758, var13);
                                        class129.field2476[var12] = true;
                                        class31.field562[var12] = true;
                                        class4.method32(arg4, arg3, arg8, arg1);
                                        break label877;
                                    }
                                    if (var11.field715 == 1402) {
                                        class175.method1202(var13, var14, (byte) 47);
                                        class129.field2476[var12] = true;
                                        class31.field562[var12] = true;
                                        break label877;
                                    }
                                    if (var11.field715 == 1405) {
                                        if (!class266.field4777) {
                                            break label877;
                                        }
                                        int var41 = var13 + 15;
                                        int var42 = var11.field789 + var14;
                                        class256.field4623.method1292(class229.method1604(new class209[] { class136.field2554, class66.method485(class30.field549, (byte) 8) }, (byte) 42), var42, var41, 16776960, -1);
                                        int var130 = var41 + 15;
                                        Runtime var43 = Runtime.getRuntime();
                                        int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                        int var45 = 16776960;
                                        if (var44 > 65536) {
                                            var45 = 16711680;
                                        }
                                        class256.field4623.method1292(class229.method1604(new class209[] { class62.field1229, class66.method485(var44, (byte) 43), class28.field510 }, (byte) 85), var42, var130, var45, -1);
                                        int var46 = 0;
                                        int var47 = 0;
                                        var41 = var130 + 15;
                                        int var48 = 0;
                                        for (int var49 = 0; var49 < 28; var49++) {
                                            var46 += class81.field1533[var49].method559((byte) 73);
                                            var47 += class81.field1533[var49].method551(true);
                                            var48 += class81.field1533[var49].method558(-13104);
                                        }
                                        int var50 = 16776960;
                                        int var51 = var47 * 10000 / var46;
                                        int var52 = var48 * 100 / var46;
                                        class209 var53 = class229.method1604(new class209[] { class136.field2560, class231.method1611(0, true, 2, (long) var51, 86), class280.field4932, class66.method485(var52, (byte) 47), class99.field1931 }, (byte) 127);
                                        class66.field1270.method1292(var53, var42, var41, var50, -1);
                                        var41 += 12;
                                        if (class221.field4025 > 0) {
                                            class66.field1270.method1292(class229.method1604(new class209[] { class28.field505, class66.method485(class221.field4019, (byte) 84), class9.field173, class66.method485(class221.field4025, (byte) 37) }, (byte) 55), var42, var41, var50, -1);
                                        }
                                        var41 += 12;
                                        class129.field2476[var12] = true;
                                        class31.field562[var12] = true;
                                        break label877;
                                    }
                                    if (var11.field715 == 1406) {
                                        class70.field1330 = var11;
                                        class174.field3176 = var14;
                                        class204.field3647 = var13;
                                        break label877;
                                    }
                                }
                                if (!class244.field4418) {
                                    if (var11.field810 == 0 && var11.field788 && class231.field4200 >= var20 && var21 <= class56.field1161 && class231.field4200 < var25 && class56.field1161 < var24 && !class70.field1332) {
                                        class219.field3993[0] = class76.field1408;
                                        class98.field1912 = 1;
                                        class40.field680[0] = 1001;
                                        class20.field391[0] = class246.field4451;
                                    }
                                    if (class231.field4200 >= var20 && class56.field1161 >= var21 && class231.field4200 < var25 && var24 > class56.field1161) {
                                        class142.method989(class56.field1161 - var13, -1, class231.field4200 - var14, var11);
                                    }
                                }
                                if (var11.field810 == 0) {
                                    if (!var11.field795 && client.method1078(var11) && class85.field1695 != var11) {
                                        break label877;
                                    }
                                    if (!var11.field795) {
                                        if (var11.field782 - var11.field758 < var11.field819) {
                                            var11.field819 = var11.field782 - var11.field758;
                                        }
                                        if (var11.field819 < 0) {
                                            var11.field819 = 0;
                                        }
                                    }
                                    method191(var13 - var11.field819, var24, arg2, var21, var20, var12, 114, var11.field779, var25, var14 - var11.field696);
                                    if (var11.field762 != null) {
                                        method191(var13 - var11.field819, var24, var11.field762, var21, var20, var12, 110, var11.field779, var25, var14 - var11.field696);
                                    }
                                    class97 var54 = (class97) class114.field2288.method1755((long) var11.field779, (byte) -101);
                                    if (var54 != null) {
                                        if (var54.field1888 == 0 && !class244.field4418 && class231.field4200 >= var20 && var21 <= class56.field1161 && var25 > class231.field4200 && class56.field1161 < var24 && !class70.field1332) {
                                            class219.field3993[0] = class76.field1408;
                                            class98.field1912 = 1;
                                            class40.field680[0] = 1001;
                                            class20.field391[0] = class246.field4451;
                                        }
                                        class246.method1717(false, var13, var24, var12, var54.field1895, var20, var25, var14, var21);
                                    }
                                    class4.method32(arg4, arg3, arg8, arg1);
                                    class15.method129();
                                }
                                if (class47.field917[var12] || class13.field251 > 1) {
                                    if (var11.field810 == 0 && !var11.field795 && var11.field782 > var11.field758) {
                                        class238.method1654((byte) -78, var11.field758, var13, var11.field819, var11.field782, var11.field789 + var14);
                                    }
                                    if (var11.field810 != 1) {
                                        if (var11.field810 == 2) {
                                            int var55 = 0;
                                            for (int var56 = 0; var56 < var11.field853; var56++) {
                                                for (int var57 = 0; var57 < var11.field808; var57++) {
                                                    int var58 = (var11.field828 + 32) * var56 + var13;
                                                    int var59 = (var11.field797 + 32) * var57 + var14;
                                                    if (var55 < 20) {
                                                        var58 += var11.field759[var55];
                                                        var59 += var11.field698[var55];
                                                    }
                                                    if (var11.field778[var55] > 0) {
                                                        boolean var61 = false;
                                                        int var62 = var11.field778[var55] - 1;
                                                        boolean var63 = false;
                                                        if (arg4 < (var59 + 32) && arg8 > var59 && var58 + 32 > arg3 && var58 < arg1 || class159.field2891 == var11 && class92.field1824 == var55) {
                                                            class231 var64;
                                                            if (class25.field445 == 1 && class83.field1657 == var55 && class156.field2854 == var11.field779) {
                                                                var64 = class265.method1813(var11.field856[var55], 2, (byte) -101, var62, 0, var11.field833);
                                                            } else {
                                                                var64 = class265.method1813(var11.field856[var55], 1, (byte) -101, var62, 3153952, var11.field833);
                                                            }
                                                            if (class15.field279) {
                                                                class129.field2476[var12] = true;
                                                            }
                                                            if (var64 == null) {
                                                                class126.method907(var11, 0);
                                                            } else if (class159.field2891 == var11 && class92.field1824 == var55) {
                                                                int var65 = class150.field2735 - class213.field3855;
                                                                int var66 = class126.field2435 - class47.field910;
                                                                if (var65 < 5 && var65 > -5) {
                                                                    var65 = 0;
                                                                }
                                                                if (var66 < 5 && var66 > -5) {
                                                                    var66 = 0;
                                                                }
                                                                if (class206.field3686 < 5) {
                                                                    var65 = 0;
                                                                    var66 = 0;
                                                                }
                                                                var64.method225(var59 + var65, var58 + var66, 128);
                                                                if (arg7 != -1) {
                                                                    class42 var67 = arg2[arg7 & 0xFFFF];
                                                                    int var68 = class4.field54;
                                                                    int var69 = class4.field56;
                                                                    if (var68 > var58 + var66 && var67.field819 > 0) {
                                                                        int var70 = (var68 - var58 - var66) * class122.field2402 / 3;
                                                                        if (class122.field2402 * 10 < var70) {
                                                                            var70 = class122.field2402 * 10;
                                                                        }
                                                                        if (var67.field819 < var70) {
                                                                            var70 = var67.field819;
                                                                        }
                                                                        class47.field910 += var70;
                                                                        var67.field819 -= var70;
                                                                        class126.method907(var67, 0);
                                                                    }
                                                                    if ((var58 + var66 + 32) > var69 && var67.field819 < (var67.field782 - var67.field758)) {
                                                                        int var71 = (var66 + var58 + 32 - var69) * class122.field2402 / 3;
                                                                        if (var71 > (class122.field2402 * 10)) {
                                                                            var71 = class122.field2402 * 10;
                                                                        }
                                                                        if (var67.field782 - var67.field819 - var67.field758 < var71) {
                                                                            var71 = var67.field782 - var67.field819 - var67.field758;
                                                                        }
                                                                        class47.field910 -= var71;
                                                                        var67.field819 += var71;
                                                                        class126.method907(var67, 0);
                                                                    }
                                                                }
                                                            } else if (class12.field232 == var11 && class45.field899 == var55) {
                                                                var64.method225(var59, var58, 128);
                                                            } else {
                                                                var64.method232(var59, var58);
                                                            }
                                                        }
                                                    } else if (var11.field844 != null && var55 < 20) {
                                                        class231 var60 = var11.method313(var55, (byte) -120);
                                                        if (var60 != null) {
                                                            var60.method232(var59, var58);
                                                        } else if (class117.field2343) {
                                                            class126.method907(var11, 0);
                                                        }
                                                    }
                                                    var55++;
                                                }
                                            }
                                        } else if (var11.field810 == 3) {
                                            int var72;
                                            if (class82.method580(-5078, var11)) {
                                                var72 = var11.field827;
                                                if (class85.field1695 == var11 && var11.field832 != 0) {
                                                    var72 = var11.field832;
                                                }
                                            } else {
                                                var72 = var11.field727;
                                                if (class85.field1695 == var11 && var11.field697 != 0) {
                                                    var72 = var11.field697;
                                                }
                                            }
                                            if (var15 == 0) {
                                                if (var11.field718) {
                                                    class4.method39(var14, var13, var11.field789, var11.field758, var72);
                                                } else {
                                                    class4.method41(var14, var13, var11.field789, var11.field758, var72);
                                                }
                                            } else if (var11.field718) {
                                                class4.method20(var14, var13, var11.field789, var11.field758, var72, 256 - (var15 & 0xFF));
                                            } else {
                                                class4.method31(var14, var13, var11.field789, var11.field758, var72, 256 - (var15 & 0xFF));
                                            }
                                        } else if (var11.field810 == 4) {
                                            class188 var73 = var11.method318(16165, class234.field4218);
                                            if (var73 != null) {
                                                class209 var74 = var11.field820;
                                                int var75;
                                                if (class82.method580(-5078, var11)) {
                                                    var75 = var11.field827;
                                                    if (class85.field1695 == var11 && var11.field832 != 0) {
                                                        var75 = var11.field832;
                                                    }
                                                    if (var11.field749.method1486(5) > 0) {
                                                        var74 = var11.field749;
                                                    }
                                                } else {
                                                    var75 = var11.field727;
                                                    if (class85.field1695 == var11 && var11.field697 != 0) {
                                                        var75 = var11.field697;
                                                    }
                                                }
                                                if (var11.field795 && var11.field699 != -1) {
                                                    class82 var76 = class249.method1728(var11.field699, true);
                                                    var74 = var76.field1629;
                                                    if (var74 == null) {
                                                        var74 = class191.field3468;
                                                    }
                                                    if ((var76.field1583 == 1 || var11.field818 != 1) && var11.field818 != -1) {
                                                        var74 = class229.method1604(new class209[] { class35.field608, var74, class90.field1769, class79.method556(var11.field818, 124) }, (byte) 117);
                                                    }
                                                }
                                                if (class86.field1699 == var11) {
                                                    var75 = var11.field727;
                                                    var74 = class53.field1035;
                                                }
                                                if (!var11.field795) {
                                                    var74 = class20.method181(var11, -15808, var74);
                                                }
                                                var73.method1282(var74, var14, var13, var11.field789, var11.field758, var75, var11.field742 ? 0 : -1, var11.field767, var11.field694, var11.field847);
                                            } else if (class117.field2343) {
                                                class126.method907(var11, 0);
                                            }
                                        } else if (var11.field810 == 5) {
                                            if (var11.field795) {
                                                class231 var78;
                                                if (var11.field699 == -1) {
                                                    var78 = var11.method322(1, false);
                                                } else {
                                                    var78 = class265.method1813(var11.field818, var11.field812, (byte) -101, var11.field699, var11.field851, var11.field833);
                                                }
                                                if (var78 != null) {
                                                    int var79 = var78.field4198;
                                                    int var80 = var78.field4201;
                                                    if (var11.field846) {
                                                        int var81 = (var80 + var11.field758 - 1) / var80;
                                                        int var82 = (var79 + var11.field789 - 1) / var79;
                                                        class4.method40(var14, var13, var11.field789 + var14, var11.field758 + var13);
                                                        int var83 = 0;
                                                        while (true) {
                                                            if (var82 <= var83) {
                                                                class4.method32(arg4, arg3, arg8, arg1);
                                                                break;
                                                            }
                                                            for (int var84 = 0; var84 < var81; var84++) {
                                                                if (var11.field840 != 0) {
                                                                    var78.method1613(var80 / 2 + var80 * var84 + var13, var11.field840, 4096, var79 / 2 + var79 * var83 + var14, (byte) 74);
                                                                } else if (var15 == 0) {
                                                                    var78.method232(var79 * var83 + var14, var80 * var84 + var13);
                                                                } else {
                                                                    var78.method225(var79 * var83 + var14, var80 * var84 + var13, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                            var83++;
                                                        }
                                                    } else {
                                                        int var85 = var11.field789 * 4096 / var79;
                                                        if (var11.field840 != 0) {
                                                            var78.method1613(var11.field758 / 2 + var13, var11.field840, var85, var14 + (var11.field789 / 2), (byte) 74);
                                                        } else if (var15 != 0) {
                                                            var78.method224(var14, var13, var11.field789, var11.field758, 256 - (var15 & 0xFF));
                                                        } else if (var11.field789 == var79 && var11.field758 == var80) {
                                                            var78.method232(var14, var13);
                                                        } else {
                                                            var78.method235(var14, var13, var11.field789, var11.field758);
                                                        }
                                                    }
                                                } else if (class117.field2343) {
                                                    class126.method907(var11, 0);
                                                }
                                            } else {
                                                class231 var77 = var11.method322(1, class82.method580(-5078, var11));
                                                if (var77 != null) {
                                                    var77.method232(var14, var13);
                                                } else if (class117.field2343) {
                                                    class126.method907(var11, 0);
                                                }
                                            }
                                        } else if (var11.field810 == 6) {
                                            boolean var86 = class82.method580(-5078, var11);
                                            int var87;
                                            if (var86) {
                                                var87 = var11.field790;
                                            } else {
                                                var87 = var11.field850;
                                            }
                                            int var88 = 0;
                                            class189 var89 = null;
                                            if (var11.field699 != -1) {
                                                class82 var90 = class249.method1728(var11.field699, true);
                                                if (var90 != null) {
                                                    class82 var91 = var90.method598(22556, var11.field818);
                                                    class241 var92 = var87 == -1 ? null : class245.method1706(var87, (byte) 122);
                                                    var89 = var91.method600(var92, var11.field815, 1, (byte) 76);
                                                    if (var89 == null) {
                                                        class126.method907(var11, 0);
                                                    } else {
                                                        var88 = -var89.method216() / 2;
                                                    }
                                                }
                                            } else if (var11.field769 == 5) {
                                                if (var11.field798 == -1) {
                                                    var89 = class88.field1742.method961(-1, (class241) null, (class241) null, -1, 0);
                                                } else {
                                                    int var93 = var11.field798 & 0x7FF;
                                                    if (class174.field3179 == var93) {
                                                        var93 = 2047;
                                                    }
                                                    class108 var94 = class103.field1993[var93];
                                                    class241 var95 = var87 == -1 ? null : class245.method1706(var87, (byte) 126);
                                                    if (var94 != null && (int) var94.field2140.method1448(true) << 11 == (var11.field798 & 0xFFFFF800)) {
                                                        var89 = var94.field2142.method961(0, (class241) null, var95, var11.field815, 0);
                                                    }
                                                }
                                            } else if (var87 == -1) {
                                                var89 = var11.method324(var86, (class241) null, 32538, -1, class223.field4069.field2142);
                                                if (var89 == null && class117.field2343) {
                                                    class126.method907(var11, 0);
                                                }
                                            } else {
                                                class241 var96 = class245.method1706(var87, (byte) 118);
                                                var89 = var11.method324(var86, var96, 32538, var11.field815, class223.field4069.field2142);
                                                if (var89 == null && class117.field2343) {
                                                    class126.method907(var11, 0);
                                                }
                                            }
                                            if (var89 != null) {
                                                int var97;
                                                if (var11.field716 > 0) {
                                                    var97 = (var11.field789 << 8) / var11.field716;
                                                } else {
                                                    var97 = 256;
                                                }
                                                int var98;
                                                if (var11.field728 <= 0) {
                                                    var98 = 256;
                                                } else {
                                                    var98 = (var11.field758 << 8) / var11.field728;
                                                }
                                                int var99 = (var11.field764 * var98 >> 8) + var13 + (var11.field758 / 2);
                                                int var100 = (var11.field843 * var97 >> 8) + var11.field789 / 2 + var14;
                                                class15.method117(var100, var99);
                                                int var101 = class15.field278[var11.field773] * var11.field712 >> 16;
                                                int var102 = class15.field280[var11.field773] * var11.field712 >> 16;
                                                if (!var11.field795) {
                                                    var89.method423(0, var11.field748, 0, var11.field773, 0, var101, var102, -1L);
                                                } else if (var11.field841) {
                                                    ((class55) var89).method411(0, var11.field748, var11.field837, var11.field773, var11.field802, var88 + var101 + var11.field817, var11.field817 + var102, var11.field712);
                                                } else {
                                                    var89.method423(0, var11.field748, var11.field837, var11.field773, var11.field802, var88 + var101 + var11.field817, var11.field817 + var102, -1L);
                                                }
                                                class15.method115();
                                            }
                                        } else {
                                            label856: {
                                                if (var11.field810 == 7) {
                                                    class188 var103 = var11.method318(16165, class234.field4218);
                                                    if (var103 == null) {
                                                        if (class117.field2343) {
                                                            class126.method907(var11, 0);
                                                        }
                                                        break label856;
                                                    }
                                                    int var104 = 0;
                                                    for (int var105 = 0; var105 < var11.field853; var105++) {
                                                        for (int var106 = 0; var106 < var11.field808; var106++) {
                                                            if (var11.field778[var104] > 0) {
                                                                class82 var107 = class249.method1728(var11.field778[var104] - 1, true);
                                                                class209 var108;
                                                                if (var107.field1583 != 1 && var11.field856[var104] == 1) {
                                                                    var108 = class229.method1604(new class209[] { class35.field608, var107.field1629, class13.field249 }, (byte) 92);
                                                                } else {
                                                                    var108 = class229.method1604(new class209[] { class35.field608, var107.field1629, class90.field1769, class79.method556(var11.field856[var104], -101) }, (byte) 70);
                                                                }
                                                                int var109 = var14 + ((var11.field797 + 115) * var106);
                                                                int var110 = (var11.field828 + 12) * var105 + var13;
                                                                if (var11.field767 == 0) {
                                                                    var103.method1295(var108, var109, var110, var11.field727, var11.field742 ? 0 : -1);
                                                                } else if (var11.field767 == 1) {
                                                                    var103.method1291(var108, var109 + 57, var110, var11.field727, var11.field742 ? 0 : -1);
                                                                } else {
                                                                    var103.method1292(var108, var109 + 114, var110, var11.field727, var11.field742 ? 0 : -1);
                                                                }
                                                            }
                                                            var104++;
                                                        }
                                                    }
                                                }
                                                if (var11.field810 == 8 && class177.field3239 == var11 && class129.field2480 == class104.field2017) {
                                                    class188 var111 = class256.field4623;
                                                    int var112 = 0;
                                                    int var113 = 0;
                                                    class209 var114 = var11.field820;
                                                    class209 var115 = class20.method181(var11, -15808, var114);
                                                    while (var115.method1486(5) > 0) {
                                                        int var123 = var115.method1443(true, class195.field3500);
                                                        class209 var124;
                                                        if (var123 == -1) {
                                                            var124 = var115;
                                                            var115 = class246.field4451;
                                                        } else {
                                                            var124 = var115.method1466(126, var123, 0);
                                                            var115 = var115.method1461(-42, var123 + 4);
                                                        }
                                                        int var125 = var111.method1298(var124);
                                                        if (var112 < var125) {
                                                            var112 = var125;
                                                        }
                                                        var113 += var111.field3418 + 1;
                                                    }
                                                    var112 += 6;
                                                    int var116 = var11.field758 + var13 + 5;
                                                    var113 += 7;
                                                    if ((var113 + var116) > arg1) {
                                                        var116 = arg1 - var113;
                                                    }
                                                    int var117 = var11.field789 + var14 - var112 - 5;
                                                    if ((var14 + 5) > var117) {
                                                        var117 = var14 + 5;
                                                    }
                                                    if (arg8 < (var117 + var112)) {
                                                        var117 = arg8 - var112;
                                                    }
                                                    class4.method39(var117, var116, var112, var113, 16777120);
                                                    class4.method41(var117, var116, var112, var113, 0);
                                                    class209 var118 = var11.field820;
                                                    int var119 = var111.field3418 + var116 + 2;
                                                    class209 var120 = class20.method181(var11, -15808, var118);
                                                    while (var120.method1486(5) > 0) {
                                                        int var121 = var120.method1443(true, class195.field3500);
                                                        class209 var122;
                                                        if (var121 == -1) {
                                                            var122 = var120;
                                                            var120 = class246.field4451;
                                                        } else {
                                                            var122 = var120.method1466(122, var121, 0);
                                                            var120 = var120.method1461(-26, var121 + 4);
                                                        }
                                                        var111.method1295(var122, var117 + 3, var119, 0, -1);
                                                        var119 += var111.field3418 + 1;
                                                    }
                                                }
                                                if (var11.field810 == 9) {
                                                    int var126;
                                                    int var127;
                                                    int var128;
                                                    int var129;
                                                    if (var11.field752) {
                                                        var126 = var11.field758 + var13;
                                                        var127 = var14;
                                                        var128 = var11.field789 + var14;
                                                        var129 = var13;
                                                    } else {
                                                        var129 = var13 + var11.field758;
                                                        var127 = var14;
                                                        var128 = var11.field789 + var14;
                                                        var126 = var13;
                                                    }
                                                    if (var11.field704 == 1) {
                                                        class4.method37(var127, var126, var128, var129, var11.field727);
                                                    } else {
                                                        class4.method25(var127, var126, var128, var129, var11.field727, var11.field704);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class22() {
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
    public class22(byte[] arg0) {
        this.field420 = new class210[128];
        this.field407 = new byte[128];
        this.field418 = new int[128];
        this.field416 = new short[128];
        int var2 = 0;
        this.field415 = new byte[128];
        this.field421 = new byte[128];
        this.field408 = new class212[128];
        class106 var3 = new class106(arg0);
        while (var3.field2108[var3.field2085 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method777(88);
        }
        var3.field2085++;
        int var6 = 0;
        int var7 = var3.field2085;
        var2++;
        var3.field2085 += var2;
        while (var3.field2108[var3.field2085 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method777(104);
        }
        var6++;
        var3.field2085++;
        int var10 = var3.field2085;
        var3.field2085 += var6;
        int var11;
        for (var11 = 0; var3.field2108[var3.field2085 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method777(90);
        }
        var11++;
        var3.field2085++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method774((byte) 123);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class210[] var18 = new class210[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class210 var102 = var18[var19] = new class210();
            int var103 = var3.method774((byte) 87);
            if (var103 > 0) {
                var102.field3825 = new byte[var103 * 2];
            }
            int var104 = var3.method774((byte) 100);
            if (var104 > 0) {
                var102.field3820 = new byte[var104 * 2 + 2];
                var102.field3820[1] = 64;
            }
        }
        int var20 = var3.method774((byte) 126);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method774((byte) 102);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var3.field2108[var3.field2085 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method777(73);
        }
        var3.field2085++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method774((byte) 97);
            this.field416[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method774((byte) 89);
            this.field416[var30] = (short) (this.field416[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var33) {
                    var31 = var25[var33++];
                } else {
                    var31 = -1;
                }
                var32 = var3.method772((byte) -96);
            }
            this.field416[var34] = (short) (this.field416[var34] + class27.method220(var32 - 1 << 14, 32768));
            this.field418[var34] = var32;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field418[var38] != 0) {
                if (var36 == 0) {
                    var37 = var3.field2108[var7++] - 1;
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field421[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field418[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field2108[var10++] + 16 << 2;
                    if (var8.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                }
                this.field407[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class210 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field418[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field420[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length <= var48) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field418[var50] > 0) {
                    var49 = var3.method774((byte) 119) + 1;
                }
            }
            var47--;
            this.field415[var50] = (byte) var49;
        }
        this.field409 = var3.method774((byte) 84) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class210 var99 = var18[var51];
            if (var99.field3825 != null) {
                for (int var100 = 1; var100 < var99.field3825.length; var100 += 2) {
                    var99.field3825[var100] = var3.method777(75);
                }
            }
            if (var99.field3820 != null) {
                for (int var101 = 3; var101 < var99.field3820.length - 2; var101 += 2) {
                    var99.field3820[var101] = var3.method777(101);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method777(92);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method777(111);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class210 var96 = var18[var54];
            if (var96.field3820 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3820.length; var98 += 2) {
                    var97 = var3.method774((byte) 86) + (var97 + 1);
                    var96.field3820[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class210 var93 = var18[var55];
            if (var93.field3825 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3825.length; var95 += 2) {
                    var94 += var3.method774((byte) 103) + 1;
                    var93.field3825[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method774((byte) 75);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var3.method774((byte) 98) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field415[var60] = (byte) (this.field415[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class95.method666(-125, var64 - var58, var66);
                    var66 += var65 - var59;
                    this.field415[var67] = (byte) (this.field415[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field415[var62] = (byte) (this.field415[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method774((byte) 96);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var3.method774((byte) 97) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field407[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field407[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                int var78 = var23[var74 + 1] << 1;
                byte var79 = var23[var74];
                int var80 = (var79 - var71) / 2 + (var79 - var71) * var72;
                for (int var81 = var71; var81 < var79; var81++) {
                    int var82 = class95.method666(-124, var79 - var71, var80);
                    int var83 = (this.field407[var81] & 0xFF) + var82;
                    var80 += var78 - var72;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field407[var81] = (byte) var83;
                }
                var74 += 2;
                var71 = var79;
                var72 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field407[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field407[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3824 = var3.method774((byte) 87);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class210 var92 = var18[var86];
            if (var92.field3825 != null) {
                var92.field3818 = var3.method774((byte) 93);
            }
            if (var92.field3820 != null) {
                var92.field3819 = var3.method774((byte) 84);
            }
            if (var92.field3824 > 0) {
                var92.field3829 = var3.method774((byte) 113);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3826 = var3.method774((byte) 86);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class210 var91 = var18[var88];
            if (var91.field3826 > 0) {
                var91.field3828 = var3.method774((byte) 105);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class210 var90 = var18[var89];
            if (var90.field3828 > 0) {
                var90.field3832 = var3.method774((byte) 108);
            }
        }
    }
}
