import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class185 {

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    private int field2944 = 0;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lsa;")
    private class110 field2943;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[I")
    public static int[] field2939 = new int[2];

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field2950 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lfj;")
    private class240 field2946;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Luk;")
    public static class93 field2941;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method1386(byte arg0, int arg1) {
        field2949++;
        if (arg1 == -1 || !class12.field238[arg1]) {
            return;
        }
        class160.field2524.method481(arg1, 1);
        if (class207.field3269[arg1] == null || arg0 >= -126) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class207.field3269[arg1].length; var3++) {
            if (class207.field3269[arg1][var3] != null) {
                if (class207.field3269[arg1][var3].field4490 == 2) {
                    var2 = false;
                } else {
                    class207.field3269[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class207.field3269[arg1] = null;
        }
        class12.field238[arg1] = false;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lfj;", line = 50)
    public final class240 method1387(int arg0) {
        field2945++;
        if (this.field2944 > 0 && this.field2943.field1818[this.field2944 - 1] != this.field2946) {
            class240 var2 = this.field2946;
            this.field2946 = var2.field3739;
            return var2;
        }
        class240 var3;
        do {
            if (this.field2944 >= this.field2943.field1833) {
                if (arg0 != 3) {
                    method1390(-24, -9, (byte) -59, 36);
                }
                return null;
            }
            var3 = this.field2943.field1818[this.field2944++].field3739;
        } while (this.field2943.field1818[this.field2944 - 1] == var3);
        this.field2946 = var3.field3739;
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 83)
    public static final void method1388(int arg0) {
        class25.field417 = 0;
        class65.field1062 = 0;
        field2948++;
        class269.field4191.field1667 = 0;
        class243.field3760 = -1;
        class26.field435 = 0;
        class243.field3754 = false;
        class312.field4897 = -1;
        if (arg0 < 90) {
            method1394(-66);
        }
        class45.field779 = 0;
        class68.field1089 = -1;
        class165.field2558 = 0;
        class51.field813 = -1;
        class17.field331 = 0;
        class267.field4132.field1667 = 0;
        for (int var1 = 0; var1 < class82.field1228.length; var1++) {
            if (class82.field1228[var1] != null) {
                class82.field1228[var1].field1366 = -1;
            }
        }
        for (int var2 = 0; var2 < class138.field2196.length; var2++) {
            if (class138.field2196[var2] != null) {
                class138.field2196[var2].field1366 = -1;
            }
        }
        class139.method1057(29514);
        class62.field960 = 1;
        class320.method2196(30, 0);
        for (int var3 = 0; var3 < 100; var3++) {
            class30.field502[var3] = true;
        }
        class134.method1010(0);
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Lfj;", line = 143)
    public final class240 method1389(int arg0) {
        this.field2944 = 0;
        if (arg0 >= -126) {
            method1391((byte) 14);
        }
        field2937++;
        return this.method1387(3);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBI)I", line = 161)
    public static final int method1390(int arg0, int arg1, byte arg2, int arg3) {
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        if (arg2 != 75) {
            method1391((byte) -42);
        }
        field2938++;
        return (arg3 >> 2 << 10) + (arg0 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 192)
    public static final void method1391(byte arg0) {
        if (class98.field1622 > 0) {
            class98.field1622--;
        }
        if (class165.field2558 > 1) {
            class200.field3149 = class200.field3157;
            class165.field2558--;
        }
        field2940++;
        if (class248.field3834) {
            class248.field3834 = false;
            class323.method2211(-1);
            return;
        }
        for (int var1 = 0; var1 < 100 && class35.method250((byte) 118); var1++) {
        }
        if (class22.field394 != 30) {
            return;
        }
        class267.method1921(true, class269.field4191, 192);
        Object var2 = class53.field831.field835;
        synchronized (class53.field831.field835) {
            if (!class198.field3130) {
                class53.field831.field838 = 0;
            } else if (class152.field2452 != 0 || class53.field831.field838 >= 40) {
                class215.field3421++;
                class269.field4191.method246(false, 0);
                class269.field4191.method772((byte) -83, 0);
                int var3 = class269.field4191.field1667;
                int var4 = 0;
                for (int var5 = 0; var5 < class53.field831.field838 && class269.field4191.field1667 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class53.field831.field841[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class53.field831.field840[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class53.field831.field840[var5] == -1 && class53.field831.field841[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class277.field4291 != var6 || class23.field397 != var7) {
                        int var9 = var6 - class277.field4291;
                        class277.field4291 = var6;
                        int var10 = var7 - class23.field397;
                        class23.field397 = var7;
                        if (class157.field2493 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class269.field4191.method728((class157.field2493 << 12) + (var9 << 6) + var10, 1234856744);
                            class157.field2493 = 0;
                        } else if (class157.field2493 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class269.field4191.method772((byte) -126, class157.field2493 + 128);
                            class269.field4191.method728((var9 << 8) + var10, arg0 + 1234856759);
                            class157.field2493 = 0;
                        } else if (class157.field2493 >= 32) {
                            class269.field4191.method728(class157.field2493 + 57344, 1234856744);
                            if (var8) {
                                class269.field4191.method784(123, Integer.MIN_VALUE);
                            } else {
                                class269.field4191.method784(94, var7 << 16 | var6);
                            }
                            class157.field2493 = 0;
                        } else {
                            class269.field4191.method772((byte) -68, class157.field2493 + 192);
                            if (var8) {
                                class269.field4191.method784(arg0 + 120, Integer.MIN_VALUE);
                            } else {
                                class269.field4191.method784(83, var7 << 16 | var6);
                            }
                            class157.field2493 = 0;
                        }
                    } else if (class157.field2493 < 2047) {
                        class157.field2493++;
                    }
                }
                class269.field4191.method747(124, class269.field4191.field1667 - var3);
                if (class53.field831.field838 <= var4) {
                    class53.field831.field838 = 0;
                } else {
                    class53.field831.field838 -= var4;
                    for (int var11 = 0; var11 < class53.field831.field838; var11++) {
                        class53.field831.field841[var11] = class53.field831.field841[var4 + var11];
                        class53.field831.field840[var11] = class53.field831.field840[var4 + var11];
                    }
                }
            }
        }
        if (class152.field2452 != 0) {
            class2.field1++;
            long var13 = (class59.field929 - class109.field1808) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            class109.field1808 = class59.field929;
            int var15 = class223.field3569;
            int var16 = class267.field4136;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var17 = 0;
            int var18 = (int) var13;
            if (class152.field2452 == 2) {
                var17 = 1;
            }
            class269.field4191.method246(false, 7);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            class269.field4191.method773(-113, var15 | var16 << 16);
            class269.field4191.method739(var17 << 15 | var18, -75);
        }
        if (class168.field2601 > 0) {
            class168.field2601--;
        }
        if (class39.field707) {
            for (int var19 = 0; var19 < class279.field4325; var19++) {
                int var20 = class141.field2247[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class151.field2431 = true;
                    break;
                }
            }
        } else if (class108.field1795[96] || class108.field1795[97] || class108.field1795[98] || class108.field1795[99]) {
            class151.field2431 = true;
        }
        if (class151.field2431 && class168.field2601 <= 0) {
            class151.field2431 = false;
            class168.field2601 = 20;
            class281.field4338++;
            class269.field4191.method246(false, 248);
            class269.field4191.method728(class143.field2254, 1234856744);
            class269.field4191.method739(class248.field3833, -60);
        }
        if (class236.field3707 && !class176.field2768) {
            class16.field294++;
            class176.field2768 = true;
            class269.field4191.method246(false, 115);
            class269.field4191.method772((byte) -71, 1);
        }
        if (!class236.field3707 && class176.field2768) {
            class176.field2768 = false;
            class16.field294++;
            class269.field4191.method246(false, 115);
            class269.field4191.method772((byte) -116, 0);
        }
        if (!class70.field1104) {
            class269.field4191.method246(false, 218);
            class269.field4191.method745(class36.method292((byte) 103), (byte) 100);
            class76.field1163++;
            class70.field1104 = true;
        }
        class30.method197(69);
        if (class22.field394 != 30) {
            return;
        }
        class244.method1730((byte) -116);
        class176.method1314((byte) -96);
        class300.method2089((byte) 28);
        class26.field435++;
        if (class26.field435 > 750) {
            class323.method2211(-1);
            return;
        }
        class292.method2047((byte) -96);
        class219.method1586(arg0 - 1267385391);
        class52.method385(12228);
        if (class91.field1500 != null) {
            class40.method329((byte) -90);
        }
        for (int var21 = class222.method1611(true, 0); var21 != -1; var21 = class222.method1611(false, arg0 + 15)) {
            class141.method1076(var21, 5);
            class101.field1699[class280.method2001(class208.field3330++, 31)] = var21;
        }
        for (class4 var22 = class324.method2216(0); var22 != null; var22 = class324.method2216(0)) {
            int var23 = var22.method10(105);
            int var24 = var22.method12((byte) -124);
            if (var23 == 1) {
                class254.field3944[var24] = var22.field20;
                class176.field2772[class280.method2001(class13.field249++, 31)] = var24;
            } else if (var23 == 2) {
                class51.field814[var24] = var22.field29;
                class136.field2161[class280.method2001(31, class274.field4258++)] = var24;
            } else if (var23 == 3) {
                class292 var45 = class215.method1555((byte) -48, var24);
                if (!var22.field29.equals(var45.field4564)) {
                    var45.field4564 = var22.field29;
                    class143.method1091(var45, (byte) 100);
                }
            } else if (var23 == 4) {
                class292 var41 = class215.method1555((byte) -48, var24);
                int var42 = var22.field20;
                int var43 = var22.field15;
                int var44 = var22.field21;
                if (var41.field4500 != var42 || var41.field4513 != var43 || var41.field4594 != var44) {
                    var41.field4500 = var42;
                    var41.field4513 = var43;
                    var41.field4594 = var44;
                    class143.method1091(var41, (byte) 92);
                }
            } else if (var23 == 5) {
                class292 var40 = class215.method1555((byte) -48, var24);
                if (var22.field20 != var40.field4471 || var22.field20 == -1) {
                    var40.field4471 = var22.field20;
                    var40.field4484 = 1;
                    var40.field4565 = 0;
                    var40.field4479 = 0;
                    class143.method1091(var40, (byte) 50);
                }
            } else if (var23 == 6) {
                int var34 = var22.field20;
                int var35 = (var34 & 0x7F93) >> 10;
                int var36 = (var34 & 0x3FA) >> 5;
                int var37 = var34 & 0x1F;
                int var38 = (var35 << 19) + (var36 << 11) + (var37 << 3);
                class292 var39 = class215.method1555((byte) -48, var24);
                if (var39.field4538 != var38) {
                    var39.field4538 = var38;
                    class143.method1091(var39, (byte) 122);
                }
            } else if (var23 == 7) {
                class292 var25 = class215.method1555((byte) -48, var24);
                boolean var26 = var22.field20 == 1;
                if (var25.field4515 != var26) {
                    var25.field4515 = var26;
                    class143.method1091(var25, (byte) 84);
                }
            } else if (var23 == 8) {
                class292 var27 = class215.method1555((byte) -48, var24);
                if (var22.field20 != var27.field4509 || var22.field15 != var27.field4511 || var22.field21 != var27.field4522) {
                    var27.field4522 = var22.field21;
                    var27.field4509 = var22.field20;
                    if (var27.field4567 != -1) {
                        if (var27.field4521 > 0) {
                            var27.field4522 = var27.field4522 * 32 / var27.field4521;
                        } else if (var27.field4432 > 0) {
                            var27.field4522 = var27.field4522 * 32 / var27.field4432;
                        }
                    }
                    var27.field4511 = var22.field15;
                    class143.method1091(var27, (byte) 71);
                }
            } else if (var23 == 9) {
                class292 var28 = class215.method1555((byte) -48, var24);
                if (var22.field20 != var28.field4567 || var22.field15 != var28.field4544) {
                    var28.field4544 = var22.field15;
                    var28.field4567 = var22.field20;
                    class143.method1091(var28, (byte) 106);
                }
            } else if (var23 == 10) {
                class292 var29 = class215.method1555((byte) -48, var24);
                if (var22.field20 != var29.field4581 || var22.field15 != var29.field4468 || var22.field21 != var29.field4600) {
                    var29.field4600 = var22.field21;
                    var29.field4581 = var22.field20;
                    var29.field4468 = var22.field15;
                    class143.method1091(var29, (byte) 91);
                }
            } else if (var23 == 11) {
                class292 var30 = class215.method1555((byte) -48, var24);
                var30.field4458 = 0;
                var30.field4580 = var30.field4434 = var22.field20;
                var30.field4548 = 0;
                var30.field4605 = var30.field4547 = var22.field15;
                class143.method1091(var30, (byte) 43);
            } else if (var23 == 12) {
                class292 var31 = class215.method1555((byte) -48, var24);
                int var32 = var22.field20;
                if (var31 != null && var31.field4490 == 0) {
                    if ((var31.field4465 - var31.field4499) < var32) {
                        var32 = var31.field4465 - var31.field4499;
                    }
                    if (var32 < 0) {
                        var32 = 0;
                    }
                    if (var31.field4578 != var32) {
                        var31.field4578 = var32;
                        class143.method1091(var31, (byte) 38);
                    }
                }
            } else if (var23 == 13) {
                class292 var33 = class215.method1555((byte) -48, var24);
                var33.field4517 = var22.field20;
            }
        }
        class122.field1952++;
        if (class277.field4292 != 0) {
            class159.field2514 += 20;
            if (class159.field2514 >= 400) {
                class277.field4292 = 0;
            }
        }
        if (class270.field4207 != null) {
            class48.field805++;
            if (class48.field805 >= 15) {
                class143.method1091(class270.field4207, (byte) 73);
                class270.field4207 = null;
            }
        }
        if (class180.field2885 != null) {
            class143.method1091(class180.field2885, (byte) 78);
            if (class203.field3225 > class59.field926 + 5 || class59.field926 - 5 > class203.field3225 || class278.field4309 > class303.field4761 + 5 || (class303.field4761 - 5) > class278.field4309) {
                class102.field1721 = true;
            }
            class204.field3237++;
            if (class260.field4033 == 0) {
                if (class102.field1721 && class204.field3237 >= 5) {
                    if (class180.field2885 == class107.field1789 && class327.field5070 != class25.field421) {
                        class312.field4896++;
                        byte var46 = 0;
                        class292 var47 = class180.field2885;
                        if (class243.field3764 == 1 && var47.field4477 == 206) {
                            var46 = 1;
                        }
                        if (var47.field4439[class327.field5070] <= 0) {
                            var46 = 0;
                        }
                        if (client.method1786(var47).method337(-20818)) {
                            int var50 = class25.field421;
                            int var51 = class327.field5070;
                            var47.field4439[var51] = var47.field4439[var50];
                            var47.field4480[var51] = var47.field4480[var50];
                            var47.field4439[var50] = -1;
                            var47.field4480[var50] = 0;
                        } else if (var46 == 1) {
                            int var48 = class25.field421;
                            int var49 = class327.field5070;
                            while (var48 != var49) {
                                if (var48 > var49) {
                                    var47.method2049(var48 - 1, 0, var48);
                                    var48--;
                                } else if (var48 < var49) {
                                    var47.method2049(var48 + 1, arg0 ^ 0xFFFFFFF1, var48);
                                    var48++;
                                }
                            }
                        } else {
                            var47.method2049(class327.field5070, arg0 + 15, class25.field421);
                        }
                        class269.field4191.method246(false, 34);
                        class269.field4191.method726((byte) 38, var46);
                        class269.field4191.method737(class25.field421, arg0 ^ 0xFFFFFF9E);
                        class269.field4191.method728(class327.field5070, 1234856744);
                        class269.field4191.method745(class180.field2885.field4531, (byte) 94);
                    }
                } else if ((class76.field1170 == 1 || class19.method156(class65.field1062 - 1, 2000)) && class65.field1062 > 2) {
                    class282.method2006(89);
                } else if (class65.field1062 > 0) {
                    class148.method1145(81);
                }
                class48.field805 = 10;
                class152.field2452 = 0;
                class180.field2885 = null;
            }
        }
        class143.field2261 = false;
        class279.field4325 = 0;
        class79.field1203 = false;
        class63.field994 = null;
        class292 var52 = class193.field3076;
        class292 var53 = class169.field2637;
        class193.field3076 = null;
        class169.field2637 = null;
        while (class324.method2212(16) && class279.field4325 < 128) {
            class141.field2247[class279.field4325] = class86.field1308;
            class82.field1231[class279.field4325] = class123.field1969;
            class279.field4325++;
        }
        class91.field1500 = null;
        if (class122.field1950 != -1) {
            class78.method577(class180.field2880, class73.field1127, class122.field1950, 0, 0, (byte) 34, 0, 0);
        }
        class200.field3157++;
        while (true) {
            class88 var54;
            class292 var55;
            class292 var56;
            do {
                var54 = (class88) class159.field2509.method1496(-29960);
                if (var54 == null) {
                    while (true) {
                        class88 var57;
                        class292 var58;
                        class292 var59;
                        do {
                            var57 = (class88) class289.field4401.method1496(-29960);
                            if (var57 == null) {
                                while (true) {
                                    class88 var60;
                                    class292 var61;
                                    class292 var62;
                                    do {
                                        var60 = (class88) class143.field2250.method1496(-29960);
                                        if (var60 == null) {
                                            if (class91.field1500 == null) {
                                                class159.field2513 = 0;
                                            }
                                            if (class76.field1165 != null) {
                                                class52.method388(-127);
                                            }
                                            if (class235.field3699 > 0 && class108.field1795[82] && class108.field1795[81] && class56.field893 != 0) {
                                                int var63 = class41.field734 - class56.field893;
                                                if (var63 < 0) {
                                                    var63 = 0;
                                                } else if (var63 > 3) {
                                                    var63 = 3;
                                                }
                                                class183.method1374(var63, class91.field1485 + class19.field356.field1388[0], class19.field356.field1386[0] + class177.field2780, (byte) -108);
                                            }
                                            if (class235.field3699 > 0 && class108.field1795[82] && class108.field1795[81]) {
                                                if (class248.field3838 != -1) {
                                                    class183.method1374(class41.field734, class91.field1485 + class121.field1945, class248.field3838 + class177.field2780, (byte) -108);
                                                }
                                                class102.field1727 = 0;
                                                class109.field1806 = 0;
                                            } else if (class109.field1806 == 2) {
                                                if (class248.field3838 != -1) {
                                                    class259.field4013++;
                                                    class269.field4191.method246(false, 187);
                                                    class269.field4191.method739(class91.field1485 + class121.field1945, arg0 + -97);
                                                    class269.field4191.method737(class248.field3838 + class177.field2780, -121);
                                                    class269.field4191.method729((byte) 25, class233.field3692);
                                                    class269.field4191.method728(class30.field493, 1234856744);
                                                    class128.field2043 = class223.field3569;
                                                    class277.field4292 = 1;
                                                    class98.field1625 = class267.field4136;
                                                    class159.field2514 = 0;
                                                }
                                                class109.field1806 = 0;
                                            } else if (class102.field1727 == 2) {
                                                if (class248.field3838 != -1) {
                                                    class193.field3071++;
                                                    class269.field4191.method246(false, 153);
                                                    class269.field4191.method785(103, class91.field1485 + class121.field1945);
                                                    class269.field4191.method737(class248.field3838 + class177.field2780, 116);
                                                    class277.field4292 = 1;
                                                    class159.field2514 = 0;
                                                    class98.field1625 = class267.field4136;
                                                    class128.field2043 = class223.field3569;
                                                }
                                                class102.field1727 = 0;
                                            } else if (class248.field3838 != -1 && class109.field1806 == 0 && class102.field1727 == 0) {
                                                boolean var64 = class152.method1162(0, 0, class19.field356.field1388[0], 0, class248.field3838, true, class19.field356.field1386[0], 0, class121.field1945, true, 0, 0);
                                                if (var64) {
                                                    class277.field4292 = 1;
                                                    class159.field2514 = 0;
                                                    class98.field1625 = class267.field4136;
                                                    class128.field2043 = class223.field3569;
                                                }
                                            }
                                            class248.field3838 = -1;
                                            class65.method499((byte) -71);
                                            if (class193.field3076 != var52) {
                                                if (var52 != null) {
                                                    class143.method1091(var52, (byte) 115);
                                                }
                                                if (class193.field3076 != null) {
                                                    class143.method1091(class193.field3076, (byte) 48);
                                                }
                                            }
                                            if (class169.field2637 != var53 && class200.field3146 == class137.field2174) {
                                                if (var53 != null) {
                                                    class143.method1091(var53, (byte) 124);
                                                }
                                                if (class169.field2637 != null) {
                                                    class143.method1091(class169.field2637, (byte) 100);
                                                }
                                            }
                                            if (class169.field2637 == null) {
                                                if (class200.field3146 > 0) {
                                                    class200.field3146--;
                                                }
                                            } else if (class137.field2174 > class200.field3146) {
                                                class200.field3146++;
                                                if (class200.field3146 == class137.field2174) {
                                                    class143.method1091(class169.field2637, (byte) 70);
                                                }
                                            }
                                            if (class62.field960 == 1) {
                                                class305.method2113((byte) -10);
                                            } else if (class62.field960 == 2) {
                                                class128.method962(2);
                                            } else {
                                                class301.method2095(-26846);
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class261.field4047[var65]++;
                                            }
                                            int var66 = class229.method1662(113);
                                            if (arg0 != -15) {
                                                return;
                                            }
                                            int var67 = class136.method1044(2053);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class98.field1622 = 250;
                                                class195.field3100++;
                                                class52.method387(14500, (byte) 35);
                                                class269.field4191.method246(false, 40);
                                            }
                                            if (class48.field800 != null && class48.field800.field387 == 1) {
                                                if (class48.field800.field391 != null) {
                                                    class295.method2071((byte) 97, class95.field1571, class183.field2929);
                                                }
                                                class95.field1571 = null;
                                                class48.field800 = null;
                                                class183.field2929 = false;
                                            }
                                            class317.field4933++;
                                            class328.field5074++;
                                            class213.field3394++;
                                            if (class213.field3394 > 500) {
                                                class213.field3394 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class18.field353 += class200.field3153;
                                                }
                                                if ((var68 & 0x4) == 4) {
                                                    class75.field1151 += class123.field1967;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class275.field4271 += class319.field4985;
                                                }
                                            }
                                            if (class328.field5074 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                class328.field5074 = 0;
                                                if ((var69 & 0x2) == 2) {
                                                    class123.field1970 += class67.field1084;
                                                }
                                                if ((var69 & 0x1) == 1) {
                                                    class204.field3234 += class324.field5031;
                                                }
                                            }
                                            if (class204.field3234 < -60) {
                                                class324.field5031 = 2;
                                            }
                                            if (class204.field3234 > 60) {
                                                class324.field5031 = -2;
                                            }
                                            if (class18.field353 < -50) {
                                                class200.field3153 = 2;
                                            }
                                            if (class123.field1970 < -20) {
                                                class67.field1084 = 1;
                                            }
                                            if (class18.field353 > 50) {
                                                class200.field3153 = -2;
                                            }
                                            if (class275.field4271 < -55) {
                                                class319.field4985 = 2;
                                            }
                                            if (class75.field1151 < -40) {
                                                class123.field1967 = 1;
                                            }
                                            if (class75.field1151 > 40) {
                                                class123.field1967 = -1;
                                            }
                                            if (class123.field1970 > 10) {
                                                class67.field1084 = -1;
                                            }
                                            if (class275.field4271 > 55) {
                                                class319.field4985 = -2;
                                            }
                                            if (class317.field4933 > 50) {
                                                class273.field4249++;
                                                class269.field4191.method246(false, 213);
                                            }
                                            if (class157.field2494) {
                                                class33.method229(false);
                                                class157.field2494 = false;
                                            }
                                            try {
                                                if (class127.field2032 != null && class269.field4191.field1667 > 0) {
                                                    class127.field2032.method136(class269.field4191.field1667, class269.field4191.field1661, (byte) -4, 0);
                                                    class317.field4933 = 0;
                                                    class269.field4191.field1667 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class323.method2211(-1);
                                            }
                                            return;
                                        }
                                        var61 = var60.field1357;
                                        if (var61.field4536 < 0) {
                                            break;
                                        }
                                        var62 = class215.method1555((byte) -48, var61.field4587);
                                    } while (var62 == null || var62.field4553 == null || var62.field4553.length <= var61.field4536 || var62.field4553[var61.field4536] != var61);
                                    class228.method1656(var60, (byte) -77);
                                }
                            }
                            var58 = var57.field1357;
                            if (var58.field4536 < 0) {
                                break;
                            }
                            var59 = class215.method1555((byte) -48, var58.field4587);
                        } while (var59 == null || var59.field4553 == null || var58.field4536 >= var59.field4553.length || var59.field4553[var58.field4536] != var58);
                        class228.method1656(var57, (byte) -109);
                    }
                }
                var55 = var54.field1357;
                if (var55.field4536 < 0) {
                    break;
                }
                var56 = class215.method1555((byte) -48, var55.field4587);
            } while (var56 == null || var56.field4553 == null || var55.field4536 >= var56.field4553.length || var56.field4553[var55.field4536] != var55);
            class228.method1656(var54, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Lsg;", line = 1219)
    public static final class37 method1392(int arg0, int arg1) {
        field2947++;
        class37 var2 = (class37) class215.field3433.method2017(1022, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class77.field1179.method467(arg0, 94, arg1);
        class37 var4 = new class37();
        if (var3 != null) {
            var4.method301(0, new class101(var3));
        }
        class215.field3433.method2018((long) arg0, var4, -126);
        return var4;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z", line = 1241)
    public static final boolean method1393(String arg0, int arg1, int arg2, boolean arg3) {
        field2942++;
        if (arg1 >= -74) {
            method1391((byte) 58);
        }
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var5 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var5) {
                var11 = -var11;
            }
            int var10 = arg2 * var4 + var11;
            if ((var10 / arg2) != var4) {
                return false;
            }
            var6 = true;
            var4 = var10;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 1316)
    public static void method1394(int arg0) {
        field2939 = null;
        if (arg0 > -68) {
            method1391((byte) -117);
        }
        field2941 = null;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lsa;)V", line = 1328)
    public class185(class110 arg0) {
        this.field2943 = arg0;
    }
}
