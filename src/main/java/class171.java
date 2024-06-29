import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class171 {

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Loa;")
    public static class99 field3039 = class221.method1463(2844, "::serverjs5drop");

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lgd;")
    public static class74 field3034 = new class74(64);

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[I")
    public static int[] field3044 = new int[50];

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field3043 = -1;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[I")
    public static int[] field3041;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[I")
    public static int[] field3042;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method1150(int arg0) {
        field3036++;
        class106.field1773.method1812(-126);
        if (arg0 != 10286) {
            field3039 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILmi;)V")
    public static final void method1151(int arg0, int arg1, class260 arg2) {
        field3038++;
        Object[] var3 = arg2.field4543;
        int var4 = (Integer) var3[0];
        class269 var5 = class187.method1284(var4, (byte) 95);
        if (var5 == null) {
            return;
        }
        if (arg0 > -72) {
            field3043 = 105;
        }
        int var6 = 0;
        class259.field4521 = 0;
        int var7 = 0;
        int[] var8 = var5.field4723;
        byte var9 = -1;
        int var10 = -1;
        int[] var11 = var5.field4738;
        try {
            class186.field3292 = new int[var5.field4721];
            class254.field4388 = new class99[var5.field4737];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field4541;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field4552;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field4553 == null ? -1 : arg2.field4553.field1873;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field4538;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field4553 == null ? -1 : arg2.field4553.field1922;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field4544 == null ? -1 : arg2.field4544.field1873;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field4544 == null ? -1 : arg2.field4544.field1922;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field4556;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field4551;
                    }
                    class186.field3292[var12++] = var16;
                } else if (var3[var14] instanceof class99) {
                    class99 var15 = (class99) var3[var14];
                    if (var15.method679((byte) 65, class2.field18)) {
                        var15 = arg2.field4539;
                    }
                    class254.field4388[var13++] = var15;
                }
            }
            int var17 = 0;
            label3770: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var494 = var8[var10];
                if (var494 < 100) {
                    if (var494 == 0) {
                        class245.field4228[var7++] = var11[var10];
                        continue;
                    }
                    if (var494 == 1) {
                        int var18 = var11[var10];
                        class245.field4228[var7++] = class43.field733[var18];
                        continue;
                    }
                    if (var494 == 2) {
                        int var19 = var11[var10];
                        var7--;
                        class193.method1307(class245.field4228[var7], (byte) 80, var19);
                        continue;
                    }
                    if (var494 == 3) {
                        class50.field814[var6++] = var5.field4734[var10];
                        continue;
                    }
                    if (var494 == 6) {
                        var10 += var11[var10];
                        continue;
                    }
                    if (var494 == 7) {
                        var7 -= 2;
                        if (class245.field4228[var7 + 1] != class245.field4228[var7]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var494 == 8) {
                        var7 -= 2;
                        if (class245.field4228[var7 + 1] == class245.field4228[var7]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var494 == 9) {
                        var7 -= 2;
                        if (class245.field4228[var7] < class245.field4228[var7 + 1]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var494 == 10) {
                        var7 -= 2;
                        if (class245.field4228[var7] > class245.field4228[var7 + 1]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var494 == 21) {
                        if (class259.field4521 == 0) {
                            return;
                        }
                        class289 var20 = class124.field2182[--class259.field4521];
                        class186.field3292 = var20.field5059;
                        var5 = var20.field5060;
                        var10 = var20.field5063;
                        var8 = var5.field4723;
                        var11 = var5.field4738;
                        class254.field4388 = var20.field5062;
                        continue;
                    }
                    if (var494 == 25) {
                        int var21 = var11[var10];
                        class245.field4228[var7++] = class259.method1682(var21, -1476899920);
                        continue;
                    }
                    if (var494 == 27) {
                        int var22 = var11[var10];
                        var7--;
                        class81.method559(11204, class245.field4228[var7], var22);
                        continue;
                    }
                    if (var494 == 31) {
                        var7 -= 2;
                        if (class245.field4228[var7 + 1] >= class245.field4228[var7]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var494 == 32) {
                        var7 -= 2;
                        if (class245.field4228[var7] >= class245.field4228[var7 + 1]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var494 == 33) {
                        class245.field4228[var7++] = class186.field3292[var11[var10]];
                        continue;
                    }
                    int var10001;
                    if (var494 == 34) {
                        var10001 = var11[var10];
                        var7--;
                        class186.field3292[var10001] = class245.field4228[var7];
                        continue;
                    }
                    if (var494 == 35) {
                        class50.field814[var6++] = class254.field4388[var11[var10]];
                        continue;
                    }
                    if (var494 == 36) {
                        var10001 = var11[var10];
                        var6--;
                        class254.field4388[var10001] = class50.field814[var6];
                        continue;
                    }
                    if (var494 == 37) {
                        int var23 = var11[var10];
                        var6 -= var23;
                        class99 var24 = class141.method954(var6, 0, var23, class50.field814);
                        class50.field814[var6++] = var24;
                        continue;
                    }
                    if (var494 == 38) {
                        var7--;
                        continue;
                    }
                    if (var494 == 39) {
                        var6--;
                        continue;
                    }
                    if (var494 == 40) {
                        int var25 = var11[var10];
                        class269 var26 = class187.method1284(var25, (byte) -52);
                        int[] var27 = new int[var26.field4721];
                        class99[] var28 = new class99[var26.field4737];
                        for (int var29 = 0; var29 < var26.field4725; var29++) {
                            var27[var29] = class245.field4228[var29 + var7 - var26.field4725];
                        }
                        for (int var30 = 0; var30 < var26.field4728; var30++) {
                            var28[var30] = class50.field814[var30 + var6 - var26.field4728];
                        }
                        var6 -= var26.field4728;
                        var7 -= var26.field4725;
                        class289 var31 = new class289();
                        var31.field5063 = var10;
                        var31.field5062 = class254.field4388;
                        var31.field5059 = class186.field3292;
                        var31.field5060 = var5;
                        if (class124.field2182.length <= class259.field4521) {
                            throw new RuntimeException();
                        }
                        var10 = -1;
                        var5 = var26;
                        class124.field2182[class259.field4521++] = var31;
                        var8 = var26.field4723;
                        class186.field3292 = var27;
                        var11 = var26.field4738;
                        class254.field4388 = var28;
                        continue;
                    }
                    if (var494 == 42) {
                        class245.field4228[var7++] = class117.field2070[var11[var10]];
                        continue;
                    }
                    if (var494 == 43) {
                        int var32 = var11[var10];
                        var7--;
                        class117.field2070[var32] = class245.field4228[var7];
                        class21.method126(false, var32);
                        continue;
                    }
                    if (var494 == 44) {
                        int var33 = var11[var10] & 0xFFFF;
                        var7--;
                        int var34 = class245.field4228[var7];
                        int var35 = var11[var10] >> 16;
                        if (var34 >= 0 && var34 <= 5000) {
                            class247.field4245[var35] = var34;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var34) {
                                    continue label3770;
                                }
                                class131.field2295[var35][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var494 == 45) {
                        int var38 = var11[var10];
                        var7--;
                        int var39 = class245.field4228[var7];
                        if (var39 >= 0 && var39 < class247.field4245[var38]) {
                            class245.field4228[var7++] = class131.field2295[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var494 == 46) {
                        int var40 = var11[var10];
                        var7 -= 2;
                        int var41 = class245.field4228[var7];
                        if (var41 >= 0 && var41 < class247.field4245[var40]) {
                            class131.field2295[var40][var41] = class245.field4228[var7 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var494 == 47) {
                        class99 var42 = class251.field4344[var11[var10]];
                        if (var42 == null) {
                            var42 = class262.field4628;
                        }
                        class50.field814[var6++] = var42;
                        continue;
                    }
                    if (var494 == 48) {
                        int var43 = var11[var10];
                        var6--;
                        class251.field4344[var43] = class50.field814[var6];
                        class38.method299(var43, 10124);
                        continue;
                    }
                    if (var494 == 51) {
                        class237 var44 = var5.field4739[var11[var10]];
                        var7--;
                        class208 var45 = (class208) var44.method1550(true, (long) class245.field4228[var7]);
                        if (var45 != null) {
                            var10 += var45.field3605;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var10] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var494 < 300) {
                    if (var494 == 100) {
                        var7 -= 3;
                        int var47 = class245.field4228[var7 + 2];
                        int var48 = class245.field4228[var7 + 1];
                        int var49 = class245.field4228[var7];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class107 var50 = class22.method131(var49, 1538872048);
                        if (var50.field1837 == null) {
                            var50.field1837 = new class107[var47 + 1];
                        }
                        if (var50.field1837.length <= var47) {
                            class107[] var51 = new class107[var47 + 1];
                            for (int var52 = 0; var52 < var50.field1837.length; var52++) {
                                var51[var52] = var50.field1837[var52];
                            }
                            var50.field1837 = var51;
                        }
                        if (var47 > 0 && var50.field1837[var47 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var47 - 1));
                        }
                        class107 var53 = new class107();
                        var53.field1814 = var48;
                        var53.field1801 = var53.field1873 = var50.field1873;
                        var53.field1915 = true;
                        var53.field1922 = var47;
                        var50.field1837[var47] = var53;
                        if (var46) {
                            class272.field4812 = var53;
                        } else {
                            class41.field700 = var53;
                        }
                        class238.method1555(var50, 10555);
                        continue;
                    }
                    if (var494 == 101) {
                        class107 var54 = var46 ? class272.field4812 : class41.field700;
                        if (var54.field1922 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class107 var55 = class22.method131(var54.field1873, 1538872048);
                        var55.field1837[var54.field1922] = null;
                        class238.method1555(var55, 10555);
                        continue;
                    }
                    if (var494 == 102) {
                        var7--;
                        class107 var56 = class22.method131(class245.field4228[var7], 1538872048);
                        var56.field1837 = null;
                        class238.method1555(var56, 10555);
                        continue;
                    }
                    if (var494 == 200) {
                        var7 -= 2;
                        int var57 = class245.field4228[var7];
                        int var58 = class245.field4228[var7 + 1];
                        class107 var59 = class127.method842((byte) -48, var58, var57);
                        if (var59 != null && var58 != -1) {
                            class245.field4228[var7++] = 1;
                            if (var46) {
                                class272.field4812 = var59;
                            } else {
                                class41.field700 = var59;
                            }
                            continue;
                        }
                        class245.field4228[var7++] = 0;
                        continue;
                    }
                    if (var494 == 201) {
                        var7--;
                        int var60 = class245.field4228[var7];
                        class107 var61 = class22.method131(var60, 1538872048);
                        if (var61 == null) {
                            class245.field4228[var7++] = 0;
                        } else {
                            class245.field4228[var7++] = 1;
                            if (var46) {
                                class272.field4812 = var61;
                            } else {
                                class41.field700 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var494 < 500) {
                    if (var494 == 403) {
                        var7 -= 2;
                        int var483 = class245.field4228[var7];
                        if (var483 >= 7) {
                            var483 -= 7;
                        }
                        int var484 = class245.field4228[var7 + 1];
                        class168.field3006.field3250.method244(var484, (byte) 93, var483);
                        continue;
                    }
                    if (var494 == 404) {
                        var7 -= 2;
                        int var485 = class245.field4228[var7];
                        int var486 = class245.field4228[var7 + 1];
                        class168.field3006.field3250.method235(938739256, var486, var485);
                        continue;
                    }
                    if (var494 == 410) {
                        var7--;
                        boolean var487 = class245.field4228[var7] != 0;
                        class168.field3006.field3250.method236((byte) 64, var487);
                        continue;
                    }
                } else if (var494 >= 1000 && var494 < 1100 || var494 >= 2000 && var494 < 2100) {
                    class107 var477;
                    if (var494 < 2000) {
                        var477 = var46 ? class272.field4812 : class41.field700;
                    } else {
                        var494 -= 1000;
                        var7--;
                        var477 = class22.method131(class245.field4228[var7], 1538872048);
                    }
                    if (var494 == 1000) {
                        var7 -= 4;
                        var477.field1916 = class245.field4228[var7];
                        var477.field1914 = class245.field4228[var7 + 1];
                        int var478 = class245.field4228[var7 + 2];
                        if (var478 < 0) {
                            var478 = 0;
                        } else if (var478 > 5) {
                            var478 = 5;
                        }
                        int var479 = class245.field4228[var7 + 3];
                        var477.field1887 = (byte) var478;
                        if (var479 < 0) {
                            var479 = 0;
                        } else if (var479 > 5) {
                            var479 = 5;
                        }
                        var477.field1932 = (byte) var479;
                        class238.method1555(var477, 10555);
                        class67.method440(var477, (byte) 1);
                        if (var477.field1922 == -1) {
                            class261.method1735(var477.field1873, (byte) -121);
                        }
                        continue;
                    }
                    if (var494 == 1001) {
                        var7 -= 4;
                        var477.field1825 = class245.field4228[var7];
                        var477.field1936 = class245.field4228[var7 + 1];
                        var477.field1816 = 0;
                        var477.field1880 = 0;
                        int var480 = class245.field4228[var7 + 2];
                        int var481 = class245.field4228[var7 + 3];
                        if (var481 < 0) {
                            var481 = 0;
                        } else if (var481 > 4) {
                            var481 = 4;
                        }
                        var477.field1809 = (byte) var481;
                        if (var480 < 0) {
                            var480 = 0;
                        } else if (var480 > 4) {
                            var480 = 4;
                        }
                        var477.field1918 = (byte) var480;
                        class238.method1555(var477, 10555);
                        class67.method440(var477, (byte) 1);
                        if (var477.field1814 == 0) {
                            class216.method1446(false, (byte) 84, var477);
                        }
                        continue;
                    }
                    if (var494 == 1003) {
                        var7--;
                        boolean var482 = class245.field4228[var7] == 1;
                        if (var482 != var477.field1934) {
                            var477.field1934 = var482;
                            class238.method1555(var477, 10555);
                        }
                        if (var477.field1922 == -1) {
                            class59.method399(var477.field1873, 7);
                        }
                        continue;
                    }
                    if (var494 == 1004) {
                        var7 -= 2;
                        var477.field1886 = class245.field4228[var7];
                        var477.field1904 = class245.field4228[var7 + 1];
                        class238.method1555(var477, 10555);
                        class67.method440(var477, (byte) 1);
                        if (var477.field1814 == 0) {
                            class216.method1446(false, (byte) 84, var477);
                        }
                        continue;
                    }
                } else if (!(var494 < 1100 || var494 >= 1200) || !(var494 < 2100 || var494 >= 2200)) {
                    class107 var62;
                    if (var494 >= 2000) {
                        var7--;
                        var62 = class22.method131(class245.field4228[var7], 1538872048);
                        var494 -= 1000;
                    } else {
                        var62 = var46 ? class272.field4812 : class41.field700;
                    }
                    if (var494 == 1100) {
                        var7 -= 2;
                        var62.field1871 = class245.field4228[var7];
                        if (var62.field1796 - var62.field1933 < var62.field1871) {
                            var62.field1871 = var62.field1796 - var62.field1933;
                        }
                        if (var62.field1871 < 0) {
                            var62.field1871 = 0;
                        }
                        var62.field1832 = class245.field4228[var7 + 1];
                        if (var62.field1832 > (var62.field1803 - var62.field1793)) {
                            var62.field1832 = var62.field1803 - var62.field1793;
                        }
                        if (var62.field1832 < 0) {
                            var62.field1832 = 0;
                        }
                        class238.method1555(var62, 10555);
                        if (var62.field1922 == -1) {
                            class256.method1655(var62.field1873, (byte) -124);
                        }
                        continue;
                    }
                    if (var494 == 1101) {
                        var7--;
                        var62.field1881 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        if (var62.field1922 == -1) {
                            class244.method1578(28462, var62.field1873);
                        }
                        continue;
                    }
                    if (var494 == 1102) {
                        var7--;
                        var62.field1833 = class245.field4228[var7] == 1;
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1103) {
                        var7--;
                        var62.field1919 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1104) {
                        var7--;
                        var62.field1844 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1105) {
                        var7--;
                        var62.field1798 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1106) {
                        var7--;
                        var62.field1935 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1107) {
                        var7--;
                        var62.field1895 = class245.field4228[var7] == 1;
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1108) {
                        var62.field1851 = 1;
                        var7--;
                        var62.field1939 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        if (var62.field1922 == -1) {
                            class17.method101(var62.field1873, (byte) 9);
                        }
                        continue;
                    }
                    if (var494 == 1109) {
                        var7 -= 6;
                        var62.field1804 = class245.field4228[var7];
                        var62.field1942 = class245.field4228[var7 + 1];
                        var62.field1788 = class245.field4228[var7 + 2];
                        var62.field1781 = class245.field4228[var7 + 3];
                        var62.field1917 = class245.field4228[var7 + 4];
                        var62.field1867 = class245.field4228[var7 + 5];
                        class238.method1555(var62, 10555);
                        if (var62.field1922 == -1) {
                            class205.method1377(-1453091696, var62.field1873);
                            class198.method1330((byte) 114, var62.field1873);
                        }
                        continue;
                    }
                    if (var494 == 1110) {
                        var7--;
                        int var63 = class245.field4228[var7];
                        if (var62.field1928 != var63) {
                            var62.field1911 = 0;
                            var62.field1929 = 0;
                            var62.field1928 = var63;
                            class238.method1555(var62, 10555);
                        }
                        if (var62.field1922 == -1) {
                            class132.method884(var62.field1873, 8);
                        }
                        continue;
                    }
                    if (var494 == 1111) {
                        var7--;
                        var62.field1838 = class245.field4228[var7] == 1;
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1112) {
                        var6--;
                        class99 var64 = class50.field814[var6];
                        if (!var64.method679((byte) -125, var62.field1847)) {
                            var62.field1847 = var64;
                            class238.method1555(var62, 10555);
                        }
                        if (var62.field1922 == -1) {
                            class50.method347(var62.field1873, (byte) -83);
                        }
                        continue;
                    }
                    if (var494 == 1113) {
                        var7--;
                        var62.field1818 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1114) {
                        var7 -= 3;
                        var62.field1794 = class245.field4228[var7];
                        var62.field1845 = class245.field4228[var7 + 1];
                        var62.field1829 = class245.field4228[var7 + 2];
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1115) {
                        var7--;
                        var62.field1898 = class245.field4228[var7] == 1;
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1116) {
                        var7--;
                        var62.field1908 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1117) {
                        var7--;
                        var62.field1815 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1118) {
                        var7--;
                        var62.field1865 = class245.field4228[var7] == 1;
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1119) {
                        var7--;
                        var62.field1861 = class245.field4228[var7] == 1;
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1120) {
                        var7 -= 2;
                        var62.field1796 = class245.field4228[var7];
                        var62.field1803 = class245.field4228[var7 + 1];
                        class238.method1555(var62, 10555);
                        if (var62.field1814 == 0) {
                            class216.method1446(false, (byte) 84, var62);
                        }
                        continue;
                    }
                    if (var494 == 1121) {
                        var7 -= 2;
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1122) {
                        var7--;
                        var62.field1780 = class245.field4228[var7] == 1;
                        class238.method1555(var62, 10555);
                        continue;
                    }
                    if (var494 == 1123) {
                        var7--;
                        var62.field1867 = class245.field4228[var7];
                        class238.method1555(var62, 10555);
                        if (var62.field1922 == -1) {
                            class205.method1377(-1453091696, var62.field1873);
                        }
                        continue;
                    }
                } else if (var494 >= 1200 && var494 < 1300 || var494 >= 2200 && var494 < 2300) {
                    class107 var473;
                    if (var494 >= 2000) {
                        var494 -= 1000;
                        var7--;
                        var473 = class22.method131(class245.field4228[var7], 1538872048);
                    } else {
                        var473 = var46 ? class272.field4812 : class41.field700;
                    }
                    class238.method1555(var473, 10555);
                    if (var494 == 1200 || var494 == 1205) {
                        var7 -= 2;
                        int var474 = class245.field4228[var7];
                        int var475 = class245.field4228[var7 + 1];
                        if (var473.field1922 == -1) {
                            class38.method298(var473.field1873, 82);
                            class205.method1377(-1453091696, var473.field1873);
                            class198.method1330((byte) 106, var473.field1873);
                        }
                        if (var474 == -1) {
                            var473.field1939 = -1;
                            var473.field1789 = -1;
                            var473.field1851 = 1;
                        } else {
                            var473.field1789 = var474;
                            var473.field1877 = var475;
                            class166 var476 = class222.method1468(1, var474);
                            var473.field1788 = var476.field2959;
                            var473.field1781 = var476.field2941;
                            if (var494 == 1205) {
                                var473.field1866 = false;
                            } else {
                                var473.field1866 = true;
                            }
                            var473.field1917 = var476.field2942;
                            var473.field1942 = var476.field2956;
                            var473.field1867 = var476.field2945;
                            var473.field1804 = var476.field2948;
                            if (var473.field1816 > 0) {
                                var473.field1867 = var473.field1867 * 32 / var473.field1816;
                            } else if (var473.field1825 > 0) {
                                var473.field1867 = var473.field1867 * 32 / var473.field1825;
                            }
                        }
                        continue;
                    }
                    if (var494 == 1201) {
                        var473.field1851 = 2;
                        var7--;
                        var473.field1939 = class245.field4228[var7];
                        if (var473.field1922 == -1) {
                            class17.method101(var473.field1873, (byte) 9);
                        }
                        continue;
                    }
                    if (var494 == 1202) {
                        var473.field1851 = 3;
                        var473.field1939 = class168.field3006.field3250.method240((byte) 90);
                        if (var473.field1922 == -1) {
                            class17.method101(var473.field1873, (byte) 9);
                        }
                        continue;
                    }
                    if (var494 == 1203) {
                        var473.field1851 = 6;
                        var7--;
                        var473.field1939 = class245.field4228[var7];
                        if (var473.field1922 == -1) {
                            class17.method101(var473.field1873, (byte) 9);
                        }
                        continue;
                    }
                    if (var494 == 1204) {
                        var473.field1851 = 5;
                        var7--;
                        var473.field1939 = class245.field4228[var7];
                        if (var473.field1922 == -1) {
                            class17.method101(var473.field1873, (byte) 9);
                        }
                        continue;
                    }
                } else if ((var494 < 1300 || var494 >= 1400) && (var494 < 2300 || var494 >= 2400)) {
                    if (var494 >= 1400 && var494 < 1500 || var494 >= 2400 && var494 < 2500) {
                        class107 var466;
                        if (var494 >= 2000) {
                            var7--;
                            var466 = class22.method131(class245.field4228[var7], 1538872048);
                            var494 -= 1000;
                        } else {
                            var466 = var46 ? class272.field4812 : class41.field700;
                        }
                        var6--;
                        class99 var467 = class50.field814[var6];
                        int[] var468 = null;
                        if (var467.method659(66) > 0 && var467.method655(var467.method659(101) - 1, (byte) -87) == 89) {
                            var7--;
                            int var469 = class245.field4228[var7];
                            if (var469 > 0) {
                                var468 = new int[var469];
                                while ((var469--) > 0) {
                                    var7--;
                                    var468[var469] = class245.field4228[var7];
                                }
                            }
                            var467 = var467.method693(var467.method659(118) - 1, 255, 0);
                        }
                        Object[] var470 = new Object[var467.method659(-106) + 1];
                        for (int var471 = var470.length - 1; var471 >= 1; var471--) {
                            if (var467.method655(var471 - 1, (byte) -78) == 115) {
                                var6--;
                                var470[var471] = class50.field814[var6];
                            } else {
                                var7--;
                                var470[var471] = Integer.valueOf(class245.field4228[var7]);
                            }
                        }
                        var7--;
                        int var472 = class245.field4228[var7];
                        if (var472 == -1) {
                            var470 = null;
                        } else {
                            var470[0] = Integer.valueOf(var472);
                        }
                        var466.field1827 = true;
                        if (var494 == 1400) {
                            var466.field1824 = var470;
                        } else if (var494 == 1401) {
                            var466.field1938 = var470;
                        } else if (var494 == 1402) {
                            var466.field1846 = var470;
                        } else if (var494 == 1403) {
                            var466.field1795 = var470;
                        } else if (var494 == 1404) {
                            var466.field1778 = var470;
                        } else if (var494 == 1405) {
                            var466.field1905 = var470;
                        } else if (var494 == 1406) {
                            var466.field1813 = var470;
                        } else if (var494 == 1407) {
                            var466.field1821 = var470;
                            var466.field1841 = var468;
                        } else if (var494 == 1408) {
                            var466.field1944 = var470;
                        } else if (var494 == 1409) {
                            var466.field1875 = var470;
                        } else if (var494 == 1410) {
                            var466.field1785 = var470;
                        } else if (var494 == 1411) {
                            var466.field1800 = var470;
                        } else if (var494 == 1412) {
                            var466.field1931 = var470;
                        } else if (var494 == 1414) {
                            var466.field1878 = var470;
                            var466.field1884 = var468;
                        } else if (var494 == 1415) {
                            var466.field1888 = var468;
                            var466.field1870 = var470;
                        } else if (var494 == 1416) {
                            var466.field1811 = var470;
                        } else if (var494 == 1417) {
                            var466.field1817 = var470;
                        } else if (var494 == 1418) {
                            var466.field1879 = var470;
                        } else if (var494 == 1419) {
                            var466.field1849 = var470;
                        } else if (var494 == 1420) {
                            var466.field1835 = var470;
                        } else if (var494 == 1421) {
                            var466.field1910 = var470;
                        } else if (var494 == 1422) {
                            var466.field1901 = var470;
                        } else if (var494 == 1423) {
                            var466.field1783 = var470;
                        } else if (var494 == 1424) {
                            var466.field1893 = var470;
                        } else if (var494 == 1425) {
                            var466.field1894 = var470;
                        } else if (var494 == 1426) {
                            var466.field1869 = var470;
                        } else if (var494 == 1427) {
                            var466.field1924 = var470;
                        } else if (var494 == 1428) {
                            var466.field1854 = var470;
                            var466.field1807 = var468;
                        } else if (var494 == 1429) {
                            var466.field1840 = var470;
                            var466.field1892 = var468;
                        }
                        continue;
                    }
                    if (var494 < 1600) {
                        class107 var69 = var46 ? class272.field4812 : class41.field700;
                        if (var494 == 1500) {
                            class245.field4228[var7++] = var69.field1921;
                            continue;
                        }
                        if (var494 == 1501) {
                            class245.field4228[var7++] = var69.field1856;
                            continue;
                        }
                        if (var494 == 1502) {
                            class245.field4228[var7++] = var69.field1933;
                            continue;
                        }
                        if (var494 == 1503) {
                            class245.field4228[var7++] = var69.field1793;
                            continue;
                        }
                        if (var494 == 1504) {
                            class245.field4228[var7++] = var69.field1934 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 1505) {
                            class245.field4228[var7++] = var69.field1801;
                            continue;
                        }
                    } else if (var494 < 1700) {
                        class107 var465 = var46 ? class272.field4812 : class41.field700;
                        if (var494 == 1600) {
                            class245.field4228[var7++] = var465.field1871;
                            continue;
                        }
                        if (var494 == 1601) {
                            class245.field4228[var7++] = var465.field1832;
                            continue;
                        }
                        if (var494 == 1602) {
                            class50.field814[var6++] = var465.field1847;
                            continue;
                        }
                        if (var494 == 1603) {
                            class245.field4228[var7++] = var465.field1796;
                            continue;
                        }
                        if (var494 == 1604) {
                            class245.field4228[var7++] = var465.field1803;
                            continue;
                        }
                        if (var494 == 1605) {
                            class245.field4228[var7++] = var465.field1867;
                            continue;
                        }
                        if (var494 == 1606) {
                            class245.field4228[var7++] = var465.field1788;
                            continue;
                        }
                        if (var494 == 1607) {
                            class245.field4228[var7++] = var465.field1917;
                            continue;
                        }
                        if (var494 == 1608) {
                            class245.field4228[var7++] = var465.field1781;
                            continue;
                        }
                        if (var494 == 1609) {
                            class245.field4228[var7++] = var465.field1919;
                            continue;
                        }
                        if (var494 == 1610) {
                            class245.field4228[var7++] = var465.field1804;
                            continue;
                        }
                        if (var494 == 1611) {
                            class245.field4228[var7++] = var465.field1942;
                            continue;
                        }
                    } else if (var494 < 1800) {
                        class107 var464 = var46 ? class272.field4812 : class41.field700;
                        if (var494 == 1700) {
                            class245.field4228[var7++] = var464.field1789;
                            continue;
                        }
                        if (var494 == 1701) {
                            if (var464.field1789 == -1) {
                                class245.field4228[var7++] = 0;
                            } else {
                                class245.field4228[var7++] = var464.field1877;
                            }
                            continue;
                        }
                        if (var494 == 1702) {
                            class245.field4228[var7++] = var464.field1922;
                            continue;
                        }
                    } else if (var494 < 1900) {
                        class107 var462 = var46 ? class272.field4812 : class41.field700;
                        if (var494 == 1800) {
                            class245.field4228[var7++] = class290.method1943((byte) -58, client.method1066(var462));
                            continue;
                        }
                        if (var494 == 1801) {
                            var7--;
                            int var463 = class245.field4228[var7];
                            int var496 = var463 - 1;
                            if (var462.field1779 != null && var462.field1779.length > var496 && var462.field1779[var496] != null) {
                                class50.field814[var6++] = var462.field1779[var496];
                                continue;
                            }
                            class50.field814[var6++] = class240.field4158;
                            continue;
                        }
                        if (var494 == 1802) {
                            if (var462.field1943 == null) {
                                class50.field814[var6++] = class240.field4158;
                            } else {
                                class50.field814[var6++] = var462.field1943;
                            }
                            continue;
                        }
                    } else if (var494 < 2600) {
                        var7--;
                        class107 var461 = class22.method131(class245.field4228[var7], 1538872048);
                        if (var494 == 2500) {
                            class245.field4228[var7++] = var461.field1921;
                            continue;
                        }
                        if (var494 == 2501) {
                            class245.field4228[var7++] = var461.field1856;
                            continue;
                        }
                        if (var494 == 2502) {
                            class245.field4228[var7++] = var461.field1933;
                            continue;
                        }
                        if (var494 == 2503) {
                            class245.field4228[var7++] = var461.field1793;
                            continue;
                        }
                        if (var494 == 2504) {
                            class245.field4228[var7++] = var461.field1934 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 2505) {
                            class245.field4228[var7++] = var461.field1801;
                            continue;
                        }
                    } else if (var494 < 2700) {
                        var7--;
                        class107 var70 = class22.method131(class245.field4228[var7], 1538872048);
                        if (var494 == 2600) {
                            class245.field4228[var7++] = var70.field1871;
                            continue;
                        }
                        if (var494 == 2601) {
                            class245.field4228[var7++] = var70.field1832;
                            continue;
                        }
                        if (var494 == 2602) {
                            class50.field814[var6++] = var70.field1847;
                            continue;
                        }
                        if (var494 == 2603) {
                            class245.field4228[var7++] = var70.field1796;
                            continue;
                        }
                        if (var494 == 2604) {
                            class245.field4228[var7++] = var70.field1803;
                            continue;
                        }
                        if (var494 == 2605) {
                            class245.field4228[var7++] = var70.field1867;
                            continue;
                        }
                        if (var494 == 2606) {
                            class245.field4228[var7++] = var70.field1788;
                            continue;
                        }
                        if (var494 == 2607) {
                            class245.field4228[var7++] = var70.field1917;
                            continue;
                        }
                        if (var494 == 2608) {
                            class245.field4228[var7++] = var70.field1781;
                            continue;
                        }
                        if (var494 == 2609) {
                            class245.field4228[var7++] = var70.field1919;
                            continue;
                        }
                        if (var494 == 2610) {
                            class245.field4228[var7++] = var70.field1804;
                            continue;
                        }
                        if (var494 == 2611) {
                            class245.field4228[var7++] = var70.field1942;
                            continue;
                        }
                    } else if (var494 < 2800) {
                        if (var494 == 2700) {
                            var7--;
                            class107 var451 = class22.method131(class245.field4228[var7], 1538872048);
                            class245.field4228[var7++] = var451.field1789;
                            continue;
                        }
                        if (var494 == 2701) {
                            var7--;
                            class107 var452 = class22.method131(class245.field4228[var7], 1538872048);
                            if (var452.field1789 == -1) {
                                class245.field4228[var7++] = 0;
                            } else {
                                class245.field4228[var7++] = var452.field1877;
                            }
                            continue;
                        }
                        if (var494 == 2702) {
                            var7--;
                            int var453 = class245.field4228[var7];
                            class2 var454 = (class2) class57.field959.method1550(true, (long) var453);
                            if (var454 == null) {
                                class245.field4228[var7++] = 0;
                            } else {
                                class245.field4228[var7++] = 1;
                            }
                            continue;
                        }
                        if (var494 == 2703) {
                            var7--;
                            class107 var455 = class22.method131(class245.field4228[var7], 1538872048);
                            if (var455.field1837 == null) {
                                class245.field4228[var7++] = 0;
                                continue;
                            }
                            int var456 = var455.field1837.length;
                            for (int var457 = 0; var457 < var455.field1837.length; var457++) {
                                if (var455.field1837[var457] == null) {
                                    var456 = var457;
                                    break;
                                }
                            }
                            class245.field4228[var7++] = var456;
                            continue;
                        }
                        if (var494 == 2704 || var494 == 2705) {
                            var7 -= 2;
                            int var458 = class245.field4228[var7 + 1];
                            int var459 = class245.field4228[var7];
                            class2 var460 = (class2) class57.field959.method1550(true, (long) var459);
                            if (var460 != null && var460.field12 == var458) {
                                class245.field4228[var7++] = 1;
                                continue;
                            }
                            class245.field4228[var7++] = 0;
                            continue;
                        }
                    } else if (var494 < 2900) {
                        var7--;
                        class107 var71 = class22.method131(class245.field4228[var7], 1538872048);
                        if (var494 == 2800) {
                            class245.field4228[var7++] = class290.method1943((byte) -97, client.method1066(var71));
                            continue;
                        }
                        if (var494 == 2801) {
                            var7--;
                            int var72 = class245.field4228[var7];
                            int var495 = var72 - 1;
                            if (var71.field1779 != null && var71.field1779.length > var495 && var71.field1779[var495] != null) {
                                class50.field814[var6++] = var71.field1779[var495];
                                continue;
                            }
                            class50.field814[var6++] = class240.field4158;
                            continue;
                        }
                        if (var494 == 2802) {
                            if (var71.field1943 == null) {
                                class50.field814[var6++] = class240.field4158;
                            } else {
                                class50.field814[var6++] = var71.field1943;
                            }
                            continue;
                        }
                    } else if (var494 < 3200) {
                        if (var494 == 3100) {
                            var6--;
                            class99 var436 = class50.field814[var6];
                            class259.method1678(class240.field4158, var436, (byte) -126, 0);
                            continue;
                        }
                        if (var494 == 3101) {
                            var7 -= 2;
                            class120.method801(class168.field3006, class245.field4228[var7 + 1], class245.field4228[var7], (byte) -112);
                            continue;
                        }
                        if (var494 == 3103) {
                            class57.method388((byte) 46);
                            continue;
                        }
                        if (var494 == 3104) {
                            class30.field551++;
                            int var437 = 0;
                            var6--;
                            class99 var438 = class50.field814[var6];
                            if (var438.method698(52)) {
                                var437 = var438.method677(true);
                            }
                            class131.field2277.method966((byte) 49, 131);
                            class131.field2277.method1701(var437, 4994);
                            continue;
                        }
                        if (var494 == 3105) {
                            var6--;
                            class99 var439 = class50.field814[var6];
                            class131.field2277.method966((byte) 49, 239);
                            class131.field2277.method1699(var439.method697(-23666), -8);
                            class264.field4672++;
                            continue;
                        }
                        if (var494 == 3106) {
                            class204.field3551++;
                            var6--;
                            class99 var440 = class50.field814[var6];
                            class131.field2277.method966((byte) 49, 181);
                            class131.field2277.method1691(var440.method659(-119) + 1, (byte) 53);
                            class131.field2277.method1725(var440, 126);
                            continue;
                        }
                        if (var494 == 3107) {
                            var7--;
                            int var441 = class245.field4228[var7];
                            var6--;
                            class99 var442 = class50.field814[var6];
                            class217.method1449(true, var441, var442);
                            continue;
                        }
                        if (var494 == 3108) {
                            var7 -= 3;
                            int var443 = class245.field4228[var7];
                            int var444 = class245.field4228[var7 + 1];
                            int var445 = class245.field4228[var7 + 2];
                            class107 var446 = class22.method131(var445, 1538872048);
                            class280.method1842(var444, var443, -129, var446);
                            continue;
                        }
                        if (var494 == 3109) {
                            var7 -= 2;
                            int var447 = class245.field4228[var7];
                            class107 var448 = var46 ? class272.field4812 : class41.field700;
                            int var449 = class245.field4228[var7 + 1];
                            class280.method1842(var449, var447, -129, var448);
                            continue;
                        }
                        if (var494 == 3110) {
                            var7--;
                            int var450 = class245.field4228[var7];
                            class131.field2277.method966((byte) 49, 142);
                            class131.field2277.method1745(var450, (byte) 5);
                            class127.field2210++;
                            continue;
                        }
                    } else if (var494 < 3300) {
                        if (var494 == 3200) {
                            var7 -= 3;
                            class169.method1145(class245.field4228[var7 + 2], 25112, class245.field4228[var7 + 1], class245.field4228[var7]);
                            continue;
                        }
                        if (var494 == 3201) {
                            var7--;
                            class207.method1386(class245.field4228[var7], 127);
                            continue;
                        }
                        if (var494 == 3202) {
                            var7 -= 2;
                            class181.method1210((byte) -3, class245.field4228[var7 + 1], class245.field4228[var7]);
                            continue;
                        }
                    } else if (var494 < 3400) {
                        if (var494 == 3300) {
                            class245.field4228[var7++] = class56.field926;
                            continue;
                        }
                        if (var494 == 3301) {
                            var7 -= 2;
                            int var73 = class245.field4228[var7];
                            int var74 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class249.method1615(var74, -126, var73);
                            continue;
                        }
                        if (var494 == 3302) {
                            var7 -= 2;
                            int var75 = class245.field4228[var7];
                            int var76 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class202.method1362(79, var75, var76);
                            continue;
                        }
                        if (var494 == 3303) {
                            var7 -= 2;
                            int var77 = class245.field4228[var7 + 1];
                            int var78 = class245.field4228[var7];
                            class245.field4228[var7++] = class33.method269(var78, var77, true);
                            continue;
                        }
                        if (var494 == 3304) {
                            var7--;
                            int var79 = class245.field4228[var7];
                            class245.field4228[var7++] = class204.method1371(94, var79).field4921;
                            continue;
                        }
                        if (var494 == 3305) {
                            var7--;
                            int var80 = class245.field4228[var7];
                            class245.field4228[var7++] = class149.field2625[var80];
                            continue;
                        }
                        if (var494 == 3306) {
                            var7--;
                            int var81 = class245.field4228[var7];
                            class245.field4228[var7++] = class290.field5093[var81];
                            continue;
                        }
                        if (var494 == 3307) {
                            var7--;
                            int var82 = class245.field4228[var7];
                            class245.field4228[var7++] = class277.field4875[var82];
                            continue;
                        }
                        if (var494 == 3308) {
                            int var83 = class255.field4407;
                            int var84 = (class168.field3006.field1301 >> 7) + class215.field3731;
                            int var85 = (class168.field3006.field1325 >> 7) + class280.field4910;
                            class245.field4228[var7++] = (var83 << 28) + ((var85 << 14) + var84);
                            continue;
                        }
                        if (var494 == 3309) {
                            var7--;
                            int var86 = class245.field4228[var7];
                            class245.field4228[var7++] = class71.method502(var86 >> 14, 16383);
                            continue;
                        }
                        if (var494 == 3310) {
                            var7--;
                            int var87 = class245.field4228[var7];
                            class245.field4228[var7++] = var87 >> 28;
                            continue;
                        }
                        if (var494 == 3311) {
                            var7--;
                            int var88 = class245.field4228[var7];
                            class245.field4228[var7++] = class71.method502(16383, var88);
                            continue;
                        }
                        if (var494 == 3312) {
                            class245.field4228[var7++] = class124.field2180 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3313) {
                            var7 -= 2;
                            int var89 = class245.field4228[var7] + 32768;
                            int var90 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class249.method1615(var90, 51, var89);
                            continue;
                        }
                        if (var494 == 3314) {
                            var7 -= 2;
                            int var91 = class245.field4228[var7] + 32768;
                            int var92 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class202.method1362(34, var91, var92);
                            continue;
                        }
                        if (var494 == 3315) {
                            var7 -= 2;
                            int var93 = class245.field4228[var7] + 32768;
                            int var94 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class33.method269(var93, var94, true);
                            continue;
                        }
                        if (var494 == 3316) {
                            if (class103.field1751 < 2) {
                                class245.field4228[var7++] = 0;
                            } else {
                                class245.field4228[var7++] = class103.field1751;
                            }
                            continue;
                        }
                        if (var494 == 3317) {
                            class245.field4228[var7++] = class77.field1364;
                            continue;
                        }
                        if (var494 == 3318) {
                            class245.field4228[var7++] = class33.field585;
                            continue;
                        }
                        if (var494 == 3321) {
                            class245.field4228[var7++] = class34.field619;
                            continue;
                        }
                        if (var494 == 3322) {
                            class245.field4228[var7++] = class65.field1087;
                            continue;
                        }
                        if (var494 == 3323) {
                            if (class291.field5115 >= 5 && class291.field5115 <= 9) {
                                class245.field4228[var7++] = 1;
                                continue;
                            }
                            class245.field4228[var7++] = 0;
                            continue;
                        }
                        if (var494 == 3324) {
                            if (class291.field5115 >= 5 && class291.field5115 <= 9) {
                                class245.field4228[var7++] = class291.field5115;
                                continue;
                            }
                            class245.field4228[var7++] = 0;
                            continue;
                        }
                        if (var494 == 3325) {
                            class245.field4228[var7++] = class214.field3717 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3326) {
                            class245.field4228[var7++] = class168.field3006.field3252;
                            continue;
                        }
                        if (var494 == 3327) {
                            class245.field4228[var7++] = class168.field3006.field3250.field520 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3328) {
                            class245.field4228[var7++] = class74.field1258 && !class105.field1763 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3329) {
                            class245.field4228[var7++] = class138.field2425 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3330) {
                            var7--;
                            int var95 = class245.field4228[var7];
                            class245.field4228[var7++] = class25.method189(var95, 0);
                            continue;
                        }
                        if (var494 == 3331) {
                            var7 -= 2;
                            int var96 = class245.field4228[var7];
                            int var97 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class90.method609(var97, 0, false, var96);
                            continue;
                        }
                        if (var494 == 3332) {
                            var7 -= 2;
                            int var98 = class245.field4228[var7];
                            int var99 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class90.method609(var99, 0, true, var98);
                            continue;
                        }
                        if (var494 == 3333) {
                            class245.field4228[var7++] = class80.field1401;
                            continue;
                        }
                        if (var494 == 3335) {
                            class245.field4228[var7++] = class184.field3271;
                            continue;
                        }
                    } else if (var494 < 3500) {
                        if (var494 == 3400) {
                            var7 -= 2;
                            int var419 = class245.field4228[var7];
                            int var420 = class245.field4228[var7 + 1];
                            class234 var421 = class229.method1504(-1, var419);
                            class50.field814[var6++] = var421.method1523(var420, 104);
                            continue;
                        }
                        if (var494 == 3408) {
                            var7 -= 4;
                            int var422 = class245.field4228[var7];
                            int var423 = class245.field4228[var7 + 1];
                            int var424 = class245.field4228[var7 + 2];
                            int var425 = class245.field4228[var7 + 3];
                            class234 var426 = class229.method1504(-1, var424);
                            if (var426.field4027 == var422 && var426.field4033 == var423) {
                                if (var423 == 115) {
                                    class50.field814[var6++] = var426.method1523(var425, 104);
                                } else {
                                    class245.field4228[var7++] = var426.method1532(false, var425);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var494 == 3409) {
                            var7 -= 3;
                            int var427 = class245.field4228[var7];
                            int var428 = class245.field4228[var7 + 1];
                            int var429 = class245.field4228[var7 + 2];
                            if (var428 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class234 var430 = class229.method1504(-1, var428);
                            if (var430.field4033 != var427) {
                                throw new RuntimeException("C3409-1");
                            }
                            class245.field4228[var7++] = var430.method1528(var429, -1) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3410) {
                            var7--;
                            int var431 = class245.field4228[var7];
                            var6--;
                            class99 var432 = class50.field814[var6];
                            if (var431 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class234 var433 = class229.method1504(-1, var431);
                            if (var433.field4033 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class245.field4228[var7++] = var433.method1533(-1, var432) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3411) {
                            var7--;
                            int var434 = class245.field4228[var7];
                            class234 var435 = class229.method1504(-1, var434);
                            class245.field4228[var7++] = var435.field4043.method1545(100);
                            continue;
                        }
                    } else if (var494 < 3700) {
                        if (var494 == 3600) {
                            if (class57.field943 == 0) {
                                class245.field4228[var7++] = -2;
                            } else if (class57.field943 == 1) {
                                class245.field4228[var7++] = -1;
                            } else {
                                class245.field4228[var7++] = class82.field1450;
                            }
                            continue;
                        }
                        if (var494 == 3601) {
                            var7--;
                            int var397 = class245.field4228[var7];
                            if (class57.field943 == 2 && class82.field1450 > var397) {
                                class50.field814[var6++] = class57.field955[var397];
                                continue;
                            }
                            class50.field814[var6++] = class240.field4158;
                            continue;
                        }
                        if (var494 == 3602) {
                            var7--;
                            int var398 = class245.field4228[var7];
                            if (class57.field943 == 2 && var398 < class82.field1450) {
                                class245.field4228[var7++] = class54.field891[var398];
                                continue;
                            }
                            class245.field4228[var7++] = 0;
                            continue;
                        }
                        if (var494 == 3603) {
                            var7--;
                            int var399 = class245.field4228[var7];
                            if (class57.field943 == 2 && var399 < class82.field1450) {
                                class245.field4228[var7++] = class269.field4735[var399];
                                continue;
                            }
                            class245.field4228[var7++] = 0;
                            continue;
                        }
                        if (var494 == 3604) {
                            var7--;
                            int var400 = class245.field4228[var7];
                            var6--;
                            class99 var401 = class50.field814[var6];
                            class210.method1412(var400, var401, (byte) -106);
                            continue;
                        }
                        if (var494 == 3605) {
                            var6--;
                            class99 var402 = class50.field814[var6];
                            class34.method281(12124, var402.method697(-23666));
                            continue;
                        }
                        if (var494 == 3606) {
                            var6--;
                            class99 var403 = class50.field814[var6];
                            class251.method1628(true, var403.method697(-23666));
                            continue;
                        }
                        if (var494 == 3607) {
                            var6--;
                            class99 var404 = class50.field814[var6];
                            class281.method1849(0, var404.method697(-23666));
                            continue;
                        }
                        if (var494 == 3608) {
                            var6--;
                            class99 var405 = class50.field814[var6];
                            class287.method1930(var405.method697(-23666), 0);
                            continue;
                        }
                        if (var494 == 3609) {
                            var6--;
                            class99 var406 = class50.field814[var6];
                            if (var406.method668(true, class191.field3363) || var406.method668(true, class156.field2810)) {
                                var406 = var406.method680((byte) 113, 7);
                            }
                            class245.field4228[var7++] = class53.method365(var406, true) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3610) {
                            var7--;
                            int var407 = class245.field4228[var7];
                            if (class57.field943 == 2 && class82.field1450 > var407) {
                                class50.field814[var6++] = class64.field1082[var407];
                                continue;
                            }
                            class50.field814[var6++] = class240.field4158;
                            continue;
                        }
                        if (var494 == 3611) {
                            if (class263.field4661 == null) {
                                class50.field814[var6++] = class240.field4158;
                            } else {
                                class50.field814[var6++] = class263.field4661.method690(87);
                            }
                            continue;
                        }
                        if (var494 == 3612) {
                            if (class263.field4661 == null) {
                                class245.field4228[var7++] = 0;
                            } else {
                                class245.field4228[var7++] = class142.field2503;
                            }
                            continue;
                        }
                        if (var494 == 3613) {
                            var7--;
                            int var408 = class245.field4228[var7];
                            if (class263.field4661 != null && var408 < class142.field2503) {
                                class50.field814[var6++] = class56.field917[var408].field1480.method690(119);
                                continue;
                            }
                            class50.field814[var6++] = class240.field4158;
                            continue;
                        }
                        if (var494 == 3614) {
                            var7--;
                            int var409 = class245.field4228[var7];
                            if (class263.field4661 != null && var409 < class142.field2503) {
                                class245.field4228[var7++] = class56.field917[var409].field1491;
                                continue;
                            }
                            class245.field4228[var7++] = 0;
                            continue;
                        }
                        if (var494 == 3615) {
                            var7--;
                            int var410 = class245.field4228[var7];
                            if (class263.field4661 != null && var410 < class142.field2503) {
                                class245.field4228[var7++] = class56.field917[var410].field1485;
                                continue;
                            }
                            class245.field4228[var7++] = 0;
                            continue;
                        }
                        if (var494 == 3616) {
                            class245.field4228[var7++] = class220.field3822;
                            continue;
                        }
                        if (var494 == 3617) {
                            var6--;
                            class99 var411 = class50.field814[var6];
                            class54.method372(var411, (byte) 25);
                            continue;
                        }
                        if (var494 == 3618) {
                            class245.field4228[var7++] = class58.field979;
                            continue;
                        }
                        if (var494 == 3619) {
                            var6--;
                            class99 var412 = class50.field814[var6];
                            class272.method1804((byte) -128, var412.method697(-23666));
                            continue;
                        }
                        if (var494 == 3620) {
                            class196.method1317(66);
                            continue;
                        }
                        if (var494 == 3621) {
                            if (class57.field943 == 0) {
                                class245.field4228[var7++] = -1;
                            } else {
                                class245.field4228[var7++] = class122.field2138;
                            }
                            continue;
                        }
                        if (var494 == 3622) {
                            var7--;
                            int var413 = class245.field4228[var7];
                            if (class57.field943 != 0 && class122.field2138 > var413) {
                                class50.field814[var6++] = class156.method1069(-98, class160.field2846[var413]).method690(54);
                                continue;
                            }
                            class50.field814[var6++] = class240.field4158;
                            continue;
                        }
                        if (var494 == 3623) {
                            var6--;
                            class99 var414 = class50.field814[var6];
                            if (var414.method668(true, class191.field3363) || var414.method668(true, class156.field2810)) {
                                var414 = var414.method680((byte) -45, 7);
                            }
                            class245.field4228[var7++] = class24.method184(var414, 0) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3624) {
                            var7--;
                            int var415 = class245.field4228[var7];
                            if (class56.field917 != null && var415 < class142.field2503 && class56.field917[var415].field1480.method706(class168.field3006.field3224, 124)) {
                                class245.field4228[var7++] = 1;
                                continue;
                            }
                            class245.field4228[var7++] = 0;
                            continue;
                        }
                        if (var494 == 3625) {
                            if (class146.field2586 == null) {
                                class50.field814[var6++] = class240.field4158;
                            } else {
                                class50.field814[var6++] = class146.field2586.method690(101);
                            }
                            continue;
                        }
                        if (var494 == 3626) {
                            var7--;
                            int var416 = class245.field4228[var7];
                            if (class263.field4661 != null && class142.field2503 > var416) {
                                class50.field814[var6++] = class56.field917[var416].field1479;
                                continue;
                            }
                            class50.field814[var6++] = class240.field4158;
                            continue;
                        }
                        if (var494 == 3627) {
                            var7--;
                            int var417 = class245.field4228[var7];
                            if (class57.field943 == 2 && var417 >= 0 && var417 < class82.field1450) {
                                class245.field4228[var7++] = class89.field1533[var417] ? 1 : 0;
                                continue;
                            }
                            class245.field4228[var7++] = 0;
                            continue;
                        }
                        if (var494 == 3628) {
                            var6--;
                            class99 var418 = class50.field814[var6];
                            if (var418.method668(true, class191.field3363) || var418.method668(true, class156.field2810)) {
                                var418 = var418.method680((byte) 85, 7);
                            }
                            class245.field4228[var7++] = class94.method633((byte) 45, var418);
                            continue;
                        }
                        if (var494 == 3629) {
                            class245.field4228[var7++] = class29.field541;
                            continue;
                        }
                    } else if (var494 < 4000) {
                        if (var494 == 3903) {
                            var7--;
                            int var100 = class245.field4228[var7];
                            class245.field4228[var7++] = class52.field852[var100].method1480(106);
                            continue;
                        }
                        if (var494 == 3904) {
                            var7--;
                            int var101 = class245.field4228[var7];
                            class245.field4228[var7++] = class52.field852[var101].field3902;
                            continue;
                        }
                        if (var494 == 3905) {
                            var7--;
                            int var102 = class245.field4228[var7];
                            class245.field4228[var7++] = class52.field852[var102].field3901;
                            continue;
                        }
                        if (var494 == 3906) {
                            var7--;
                            int var103 = class245.field4228[var7];
                            class245.field4228[var7++] = class52.field852[var103].field3900;
                            continue;
                        }
                        if (var494 == 3907) {
                            var7--;
                            int var104 = class245.field4228[var7];
                            class245.field4228[var7++] = class52.field852[var104].field3890;
                            continue;
                        }
                        if (var494 == 3908) {
                            var7--;
                            int var105 = class245.field4228[var7];
                            class245.field4228[var7++] = class52.field852[var105].field3891;
                            continue;
                        }
                        if (var494 == 3910) {
                            var7--;
                            int var106 = class245.field4228[var7];
                            int var107 = class52.field852[var106].method1479(7);
                            class245.field4228[var7++] = var107 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3911) {
                            var7--;
                            int var108 = class245.field4228[var7];
                            int var109 = class52.field852[var108].method1479(7);
                            class245.field4228[var7++] = var109 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3912) {
                            var7--;
                            int var110 = class245.field4228[var7];
                            int var111 = class52.field852[var110].method1479(7);
                            class245.field4228[var7++] = var111 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 3913) {
                            var7--;
                            int var112 = class245.field4228[var7];
                            int var113 = class52.field852[var112].method1479(7);
                            class245.field4228[var7++] = var113 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var494 < 4100) {
                        if (var494 == 4000) {
                            var7 -= 2;
                            int var352 = class245.field4228[var7 + 1];
                            int var353 = class245.field4228[var7];
                            class245.field4228[var7++] = var352 + var353;
                            continue;
                        }
                        if (var494 == 4001) {
                            var7 -= 2;
                            int var354 = class245.field4228[var7];
                            int var355 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = var354 - var355;
                            continue;
                        }
                        if (var494 == 4002) {
                            var7 -= 2;
                            int var356 = class245.field4228[var7];
                            int var357 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = var356 * var357;
                            continue;
                        }
                        if (var494 == 4003) {
                            var7 -= 2;
                            int var358 = class245.field4228[var7];
                            int var359 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = var358 / var359;
                            continue;
                        }
                        if (var494 == 4004) {
                            var7--;
                            int var360 = class245.field4228[var7];
                            class245.field4228[var7++] = (int) ((double) var360 * Math.random());
                            continue;
                        }
                        if (var494 == 4005) {
                            var7--;
                            int var361 = class245.field4228[var7];
                            class245.field4228[var7++] = (int) ((double) (var361 + 1) * Math.random());
                            continue;
                        }
                        if (var494 == 4006) {
                            var7 -= 5;
                            int var362 = class245.field4228[var7 + 1];
                            int var363 = class245.field4228[var7 + 2];
                            int var364 = class245.field4228[var7];
                            int var365 = class245.field4228[var7 + 4];
                            int var366 = class245.field4228[var7 + 3];
                            class245.field4228[var7++] = (var365 - var363) * (var362 - var364) / (var366 - var363) + var364;
                            continue;
                        }
                        if (var494 == 4007) {
                            var7 -= 2;
                            long var367 = (long) class245.field4228[var7];
                            long var369 = (long) class245.field4228[var7 + 1];
                            class245.field4228[var7++] = (int) (var367 * var369 / 100L + var367);
                            continue;
                        }
                        if (var494 == 4008) {
                            var7 -= 2;
                            int var371 = class245.field4228[var7];
                            int var372 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class179.method1194(0x1 << var372, var371);
                            continue;
                        }
                        if (var494 == 4009) {
                            var7 -= 2;
                            int var373 = class245.field4228[var7];
                            int var374 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class71.method502(-(0x1 << var374) - 1, var373);
                            continue;
                        }
                        if (var494 == 4010) {
                            var7 -= 2;
                            int var375 = class245.field4228[var7 + 1];
                            int var376 = class245.field4228[var7];
                            class245.field4228[var7++] = class71.method502(0x1 << var375, var376) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var494 == 4011) {
                            var7 -= 2;
                            int var377 = class245.field4228[var7];
                            int var378 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = var377 % var378;
                            continue;
                        }
                        if (var494 == 4012) {
                            var7 -= 2;
                            int var379 = class245.field4228[var7];
                            int var380 = class245.field4228[var7 + 1];
                            if (var379 == 0) {
                                class245.field4228[var7++] = 0;
                            } else {
                                class245.field4228[var7++] = (int) Math.pow((double) var379, (double) var380);
                            }
                            continue;
                        }
                        if (var494 == 4013) {
                            var7 -= 2;
                            int var381 = class245.field4228[var7 + 1];
                            int var382 = class245.field4228[var7];
                            if (var382 == 0) {
                                class245.field4228[var7++] = 0;
                            } else if (var381 == 0) {
                                class245.field4228[var7++] = Integer.MAX_VALUE;
                            } else {
                                class245.field4228[var7++] = (int) Math.pow((double) var382, 1.0D / (double) var381);
                            }
                            continue;
                        }
                        if (var494 == 4014) {
                            var7 -= 2;
                            int var383 = class245.field4228[var7];
                            int var384 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class71.method502(var383, var384);
                            continue;
                        }
                        if (var494 == 4015) {
                            var7 -= 2;
                            int var385 = class245.field4228[var7];
                            int var386 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = class179.method1194(var385, var386);
                            continue;
                        }
                        if (var494 == 4016) {
                            var7 -= 2;
                            int var387 = class245.field4228[var7 + 1];
                            int var388 = class245.field4228[var7];
                            class245.field4228[var7++] = var388 >= var387 ? var387 : var388;
                            continue;
                        }
                        if (var494 == 4017) {
                            var7 -= 2;
                            int var389 = class245.field4228[var7];
                            int var390 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = var389 <= var390 ? var390 : var389;
                            continue;
                        }
                        if (var494 == 4018) {
                            var7 -= 3;
                            long var391 = (long) class245.field4228[var7];
                            long var393 = (long) class245.field4228[var7 + 1];
                            long var395 = (long) class245.field4228[var7 + 2];
                            class245.field4228[var7++] = (int) (var391 * var395 / var393);
                            continue;
                        }
                    } else if (var494 < 4200) {
                        if (var494 == 4100) {
                            var6--;
                            class99 var300 = class50.field814[var6];
                            var7--;
                            int var301 = class245.field4228[var7];
                            class50.field814[var6++] = class198.method1332(114, new class99[] { var300, class198.method1333(-114, var301) });
                            continue;
                        }
                        if (var494 == 4101) {
                            var6 -= 2;
                            class99 var302 = class50.field814[var6 + 1];
                            class99 var303 = class50.field814[var6];
                            class50.field814[var6++] = class198.method1332(98, new class99[] { var303, var302 });
                            continue;
                        }
                        if (var494 == 4102) {
                            var6--;
                            class99 var304 = class50.field814[var6];
                            var7--;
                            int var305 = class245.field4228[var7];
                            class50.field814[var6++] = class198.method1332(59, new class99[] { var304, class251.method1626(var305, -1001, true) });
                            continue;
                        }
                        if (var494 == 4103) {
                            var6--;
                            class99 var306 = class50.field814[var6];
                            class50.field814[var6++] = var306.method686(-122);
                            continue;
                        }
                        if (var494 == 4104) {
                            var7--;
                            int var307 = class245.field4228[var7];
                            long var308 = (long) var307 * 86400000L + 1014768000000L;
                            class252.field4364.setTime(new Date(var308));
                            int var310 = class252.field4364.get(5);
                            int var311 = class252.field4364.get(2);
                            int var312 = class252.field4364.get(1);
                            class50.field814[var6++] = class198.method1332(75, new class99[] { class198.method1333(-109, var310), class24.field371, class232.field4015[var311], class24.field371, class198.method1333(-95, var312) });
                            continue;
                        }
                        if (var494 == 4105) {
                            var6 -= 2;
                            class99 var313 = class50.field814[var6];
                            class99 var314 = class50.field814[var6 + 1];
                            if (class168.field3006.field3250 != null && class168.field3006.field3250.field520) {
                                class50.field814[var6++] = var314;
                                continue;
                            }
                            class50.field814[var6++] = var313;
                            continue;
                        }
                        if (var494 == 4106) {
                            var7--;
                            int var315 = class245.field4228[var7];
                            class50.field814[var6++] = class198.method1333(-87, var315);
                            continue;
                        }
                        if (var494 == 4107) {
                            var6 -= 2;
                            class245.field4228[var7++] = class50.field814[var6].method685(15642, class50.field814[var6 + 1]);
                            continue;
                        }
                        if (var494 == 4108) {
                            var6--;
                            class99 var316 = class50.field814[var6];
                            var7 -= 2;
                            int var317 = class245.field4228[var7];
                            int var318 = class245.field4228[var7 + 1];
                            byte[] var319 = class276.field4860.method1242(0, var318, 6801);
                            class26 var320 = new class26(var319);
                            var320.method493(class95.field1607, (int[]) null);
                            class245.field4228[var7++] = var320.method489(var316, var317);
                            continue;
                        }
                        if (var494 == 4109) {
                            var6--;
                            class99 var321 = class50.field814[var6];
                            var7 -= 2;
                            int var322 = class245.field4228[var7];
                            int var323 = class245.field4228[var7 + 1];
                            byte[] var324 = class276.field4860.method1242(0, var323, 6801);
                            class26 var325 = new class26(var324);
                            var325.method493(class95.field1607, (int[]) null);
                            class245.field4228[var7++] = var325.method496(var321, var322);
                            continue;
                        }
                        if (var494 == 4110) {
                            var6 -= 2;
                            class99 var326 = class50.field814[var6 + 1];
                            class99 var327 = class50.field814[var6];
                            var7--;
                            if (class245.field4228[var7] == 1) {
                                class50.field814[var6++] = var327;
                            } else {
                                class50.field814[var6++] = var326;
                            }
                            continue;
                        }
                        if (var494 == 4111) {
                            var6--;
                            class99 var328 = class50.field814[var6];
                            class50.field814[var6++] = class70.method472(var328);
                            continue;
                        }
                        if (var494 == 4112) {
                            var6--;
                            class99 var329 = class50.field814[var6];
                            var7--;
                            int var330 = class245.field4228[var7];
                            if (var330 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class50.field814[var6++] = var329.method682((byte) -124, var330);
                            continue;
                        }
                        if (var494 == 4113) {
                            var7--;
                            int var331 = class245.field4228[var7];
                            class245.field4228[var7++] = class227.method1492(var331, 0) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4114) {
                            var7--;
                            int var332 = class245.field4228[var7];
                            class245.field4228[var7++] = class71.method500(var332, false) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4115) {
                            var7--;
                            int var333 = class245.field4228[var7];
                            class245.field4228[var7++] = class272.method1808(-123, var333) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4116) {
                            var7--;
                            int var334 = class245.field4228[var7];
                            class245.field4228[var7++] = class239.method1557(var334, -49) ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4117) {
                            var6--;
                            class99 var335 = class50.field814[var6];
                            if (var335 == null) {
                                class245.field4228[var7++] = 0;
                            } else {
                                class245.field4228[var7++] = var335.method659(-55);
                            }
                            continue;
                        }
                        if (var494 == 4118) {
                            var6--;
                            class99 var336 = class50.field814[var6];
                            var7 -= 2;
                            int var337 = class245.field4228[var7];
                            int var338 = class245.field4228[var7 + 1];
                            class50.field814[var6++] = var336.method693(var338, 255, var337);
                            continue;
                        }
                        if (var494 == 4119) {
                            var6--;
                            class99 var339 = class50.field814[var6];
                            class99 var340 = class28.method237(var339.method659(-87), 0);
                            boolean var341 = false;
                            for (int var342 = 0; var342 < var339.method659(118); var342++) {
                                int var343 = var339.method655(var342, (byte) -119);
                                if (var343 == 60) {
                                    var341 = true;
                                } else if (var343 == 62) {
                                    var341 = false;
                                } else if (!var341) {
                                    var340.method675((byte) 120, var343);
                                }
                            }
                            var340.method670(19541);
                            class50.field814[var6++] = var340;
                            continue;
                        }
                        if (var494 == 4120) {
                            var7 -= 2;
                            var6--;
                            class99 var344 = class50.field814[var6];
                            int var345 = class245.field4228[var7];
                            int var346 = class245.field4228[var7 + 1];
                            class245.field4228[var7++] = var344.method669(var345, 30316, var346);
                            continue;
                        }
                        if (var494 == 4121) {
                            var6 -= 2;
                            var7--;
                            int var347 = class245.field4228[var7];
                            class99 var348 = class50.field814[var6];
                            class99 var349 = class50.field814[var6 + 1];
                            class245.field4228[var7++] = var348.method694((byte) 109, var347, var349);
                            continue;
                        }
                        if (var494 == 4122) {
                            var7--;
                            int var350 = class245.field4228[var7];
                            class245.field4228[var7++] = class52.method360(90, var350);
                            continue;
                        }
                        if (var494 == 4123) {
                            var7--;
                            int var351 = class245.field4228[var7];
                            class245.field4228[var7++] = class192.method1302(159, var351);
                            continue;
                        }
                    } else if (var494 < 4300) {
                        if (var494 == 4200) {
                            var7--;
                            int var114 = class245.field4228[var7];
                            class50.field814[var6++] = class222.method1468(1, var114).field2963;
                            continue;
                        }
                        if (var494 == 4201) {
                            var7 -= 2;
                            int var115 = class245.field4228[var7];
                            int var116 = class245.field4228[var7 + 1];
                            class166 var117 = class222.method1468(1, var115);
                            if (var116 >= 1 && var116 <= 5 && var117.field2943[var116 - 1] != null) {
                                class50.field814[var6++] = var117.field2943[var116 - 1];
                                continue;
                            }
                            class50.field814[var6++] = class240.field4158;
                            continue;
                        }
                        if (var494 == 4202) {
                            var7 -= 2;
                            int var118 = class245.field4228[var7 + 1];
                            int var119 = class245.field4228[var7];
                            class166 var120 = class222.method1468(1, var119);
                            if (var118 >= 1 && var118 <= 5 && var120.field2931[var118 - 1] != null) {
                                class50.field814[var6++] = var120.field2931[var118 - 1];
                                continue;
                            }
                            class50.field814[var6++] = class240.field4158;
                            continue;
                        }
                        if (var494 == 4203) {
                            var7--;
                            int var121 = class245.field4228[var7];
                            class245.field4228[var7++] = class222.method1468(1, var121).field2947;
                            continue;
                        }
                        if (var494 == 4204) {
                            var7--;
                            int var122 = class245.field4228[var7];
                            class245.field4228[var7++] = class222.method1468(1, var122).field2920 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4205) {
                            var7--;
                            int var123 = class245.field4228[var7];
                            class166 var124 = class222.method1468(1, var123);
                            if (var124.field2904 == -1 && var124.field2925 >= 0) {
                                class245.field4228[var7++] = var124.field2925;
                                continue;
                            }
                            class245.field4228[var7++] = var123;
                            continue;
                        }
                        if (var494 == 4206) {
                            var7--;
                            int var125 = class245.field4228[var7];
                            class166 var126 = class222.method1468(1, var125);
                            if (var126.field2904 >= 0 && var126.field2925 >= 0) {
                                class245.field4228[var7++] = var126.field2925;
                                continue;
                            }
                            class245.field4228[var7++] = var125;
                            continue;
                        }
                        if (var494 == 4207) {
                            var7--;
                            int var127 = class245.field4228[var7];
                            class245.field4228[var7++] = class222.method1468(1, var127).field2968 ? 1 : 0;
                            continue;
                        }
                        if (var494 == 4208) {
                            var7 -= 2;
                            int var128 = class245.field4228[var7];
                            int var129 = class245.field4228[var7 + 1];
                            class212 var130 = class28.method245(var129, 98);
                            if (var130.method1415(11)) {
                                class50.field814[var6++] = class222.method1468(1, var128).method1125(37, var129, var130.field3675);
                            } else {
                                class245.field4228[var7++] = class222.method1468(1, var128).method1114(var129, var130.field3672, (byte) 107);
                            }
                            continue;
                        }
                        if (var494 == 4210) {
                            var6--;
                            class99 var131 = class50.field814[var6];
                            var7--;
                            int var132 = class245.field4228[var7];
                            class19.method111(var131, var132 == 1, -93);
                            class245.field4228[var7++] = class270.field4753;
                            continue;
                        }
                        if (var494 == 4211) {
                            if (class108.field1958 != null && class270.field4753 > class193.field3400) {
                                class245.field4228[var7++] = class71.method502(class108.field1958[class193.field3400++], 65535);
                                continue;
                            }
                            class245.field4228[var7++] = -1;
                            continue;
                        }
                        if (var494 == 4212) {
                            class193.field3400 = 0;
                            continue;
                        }
                    } else if (var494 < 4400) {
                        if (var494 == 4300) {
                            var7 -= 2;
                            int var133 = class245.field4228[var7];
                            int var134 = class245.field4228[var7 + 1];
                            class212 var135 = class28.method245(var134, 108);
                            if (var135.method1415(11)) {
                                class50.field814[var6++] = class50.method348(var133, -30026).method1663(var134, 78, var135.field3675);
                            } else {
                                class245.field4228[var7++] = class50.method348(var133, -30026).method1666(var134, -112, var135.field3672);
                            }
                            continue;
                        }
                        if (var494 == 4301) {
                            var7--;
                            int var136 = class245.field4228[var7];
                            class245.field4228[var7++] = class50.method348(var136, -30026).field4467;
                            continue;
                        }
                        if (var494 == 4302) {
                            var7--;
                            int var137 = class245.field4228[var7];
                            class245.field4228[var7++] = class50.method348(var137, -30026).field4457;
                            continue;
                        }
                        if (var494 == 4303) {
                            var7--;
                            int var138 = class245.field4228[var7];
                            class245.field4228[var7++] = class50.method348(var138, -30026).field4429;
                            continue;
                        }
                        if (var494 == 4304) {
                            var7--;
                            int var139 = class245.field4228[var7];
                            class245.field4228[var7++] = class50.method348(var139, -30026).field4474;
                            continue;
                        }
                        if (var494 == 4305) {
                            var7--;
                            int var140 = class245.field4228[var7];
                            class245.field4228[var7++] = class50.method348(var140, -30026).field4472;
                            continue;
                        }
                        if (var494 == 4306) {
                            var7--;
                            int var141 = class245.field4228[var7];
                            class245.field4228[var7++] = class50.method348(var141, -30026).field4484;
                            continue;
                        }
                        if (var494 == 4307) {
                            var7--;
                            int var142 = class245.field4228[var7];
                            class245.field4228[var7++] = class50.method348(var142, -30026).field4465;
                            continue;
                        }
                    } else if (var494 >= 4500) {
                        if (var494 < 4600) {
                            if (var494 == 4500) {
                                var7 -= 2;
                                int var143 = class245.field4228[var7 + 1];
                                int var144 = class245.field4228[var7];
                                class212 var145 = class28.method245(var143, 117);
                                if (var145.method1415(11)) {
                                    class50.field814[var6++] = class138.method940(26, var144).method1582(5095, var143, var145.field3675);
                                } else {
                                    class245.field4228[var7++] = class138.method940(26, var144).method1587(var145.field3672, var143, (byte) 22);
                                }
                                continue;
                            }
                        } else if (var494 < 5100) {
                            if (var494 == 5000) {
                                class245.field4228[var7++] = class36.field625;
                                continue;
                            }
                            if (var494 == 5001) {
                                class254.field4384++;
                                var7 -= 3;
                                class36.field625 = class245.field4228[var7];
                                class254.field4391 = class245.field4228[var7 + 1];
                                class112.field2023 = class245.field4228[var7 + 2];
                                class131.field2277.method966((byte) 49, 23);
                                class131.field2277.method1691(class36.field625, (byte) 53);
                                class131.field2277.method1691(class254.field4391, (byte) 53);
                                class131.field2277.method1691(class112.field2023, (byte) 53);
                                continue;
                            }
                            if (var494 == 5002) {
                                var7 -= 2;
                                int var232 = class245.field4228[var7];
                                class125.field2202++;
                                var6--;
                                class99 var233 = class50.field814[var6];
                                int var234 = class245.field4228[var7 + 1];
                                class131.field2277.method966((byte) 49, 107);
                                class131.field2277.method1699(var233.method697(-23666), -88);
                                class131.field2277.method1691(var232 - 1, (byte) 53);
                                class131.field2277.method1691(var234, (byte) 53);
                                continue;
                            }
                            if (var494 == 5003) {
                                var7--;
                                int var235 = class245.field4228[var7];
                                class99 var236 = null;
                                if (var235 < 100) {
                                    var236 = class83.field1454[var235];
                                }
                                if (var236 == null) {
                                    var236 = class240.field4158;
                                }
                                class50.field814[var6++] = var236;
                                continue;
                            }
                            if (var494 == 5004) {
                                var7--;
                                int var237 = class245.field4228[var7];
                                int var238 = -1;
                                if (var237 < 100 && class83.field1454[var237] != null) {
                                    var238 = class249.field4291[var237];
                                }
                                class245.field4228[var7++] = var238;
                                continue;
                            }
                            if (var494 == 5005) {
                                class245.field4228[var7++] = class254.field4391;
                                continue;
                            }
                            if (var494 == 5008) {
                                var6--;
                                class99 var239 = class50.field814[var6];
                                if (var239.method668(true, class143.field2526)) {
                                    class268.method1775(true, var239);
                                    continue;
                                }
                                if (class103.field1751 == 0 && (class74.field1258 && !class105.field1763 || class138.field2425)) {
                                    continue;
                                }
                                class153.field2720++;
                                class99 var240 = var239.method686(5);
                                byte var241 = 0;
                                byte var242 = 0;
                                if (var240.method668(true, class218.field3810)) {
                                    var242 = 0;
                                    var239 = var239.method680((byte) 121, class218.field3810.method659(125));
                                } else if (var240.method668(true, class263.field4662)) {
                                    var239 = var239.method680((byte) 105, class263.field4662.method659(-63));
                                    var242 = 1;
                                } else if (var240.method668(true, class41.field695)) {
                                    var242 = 2;
                                    var239 = var239.method680((byte) -113, class41.field695.method659(-119));
                                } else if (var240.method668(true, class183.field3217)) {
                                    var242 = 3;
                                    var239 = var239.method680((byte) -84, class183.field3217.method659(110));
                                } else if (var240.method668(true, class56.field924)) {
                                    var242 = 4;
                                    var239 = var239.method680((byte) -125, class56.field924.method659(-74));
                                } else if (var240.method668(true, class128.field2227)) {
                                    var239 = var239.method680((byte) 97, class128.field2227.method659(121));
                                    var242 = 5;
                                } else if (var240.method668(true, class165.field2894)) {
                                    var242 = 6;
                                    var239 = var239.method680((byte) -105, class165.field2894.method659(-39));
                                } else if (var240.method668(true, class218.field3807)) {
                                    var242 = 7;
                                    var239 = var239.method680((byte) -106, class218.field3807.method659(102));
                                } else if (var240.method668(true, class42.field714)) {
                                    var242 = 8;
                                    var239 = var239.method680((byte) 89, class42.field714.method659(-43));
                                } else if (var240.method668(true, class197.field3428)) {
                                    var239 = var239.method680((byte) 115, class197.field3428.method659(-60));
                                    var242 = 9;
                                } else if (var240.method668(true, class210.field3648)) {
                                    var239 = var239.method680((byte) 116, class210.field3648.method659(113));
                                    var242 = 10;
                                } else if (var240.method668(true, class139.field2470)) {
                                    var239 = var239.method680((byte) 78, class139.field2470.method659(-123));
                                    var242 = 11;
                                } else if (class184.field3271 != 0) {
                                    if (var240.method668(true, class218.field3787)) {
                                        var239 = var239.method680((byte) 95, class218.field3787.method659(-37));
                                        var242 = 0;
                                    } else if (var240.method668(true, class263.field4642)) {
                                        var242 = 1;
                                        var239 = var239.method680((byte) 104, class263.field4642.method659(-67));
                                    } else if (var240.method668(true, class41.field696)) {
                                        var239 = var239.method680((byte) 105, class41.field696.method659(118));
                                        var242 = 2;
                                    } else if (var240.method668(true, class183.field3220)) {
                                        var242 = 3;
                                        var239 = var239.method680((byte) 120, class183.field3220.method659(-114));
                                    } else if (var240.method668(true, class56.field915)) {
                                        var239 = var239.method680((byte) -112, class56.field915.method659(108));
                                        var242 = 4;
                                    } else if (var240.method668(true, class128.field2238)) {
                                        var242 = 5;
                                        var239 = var239.method680((byte) 126, class128.field2238.method659(-92));
                                    } else if (var240.method668(true, class165.field2893)) {
                                        var239 = var239.method680((byte) 106, class165.field2893.method659(-34));
                                        var242 = 6;
                                    } else if (var240.method668(true, class218.field3797)) {
                                        var239 = var239.method680((byte) 123, class218.field3797.method659(98));
                                        var242 = 7;
                                    } else if (var240.method668(true, class42.field713)) {
                                        var239 = var239.method680((byte) 90, class42.field713.method659(67));
                                        var242 = 8;
                                    } else if (var240.method668(true, class197.field3442)) {
                                        var239 = var239.method680((byte) -118, class197.field3442.method659(107));
                                        var242 = 9;
                                    } else if (var240.method668(true, class210.field3650)) {
                                        var239 = var239.method680((byte) -106, class210.field3650.method659(112));
                                        var242 = 10;
                                    } else if (var240.method668(true, class139.field2469)) {
                                        var242 = 11;
                                        var239 = var239.method680((byte) 121, class139.field2469.method659(65));
                                    }
                                }
                                class99 var243 = var239.method686(26);
                                if (var243.method668(true, class220.field3837)) {
                                    var239 = var239.method680((byte) -39, class220.field3837.method659(88));
                                    var241 = 1;
                                } else if (var243.method668(true, class230.field3971)) {
                                    var241 = 2;
                                    var239 = var239.method680((byte) 116, class230.field3971.method659(63));
                                } else if (var243.method668(true, class184.field3264)) {
                                    var241 = 3;
                                    var239 = var239.method680((byte) 105, class184.field3264.method659(-73));
                                } else if (var243.method668(true, class74.field1257)) {
                                    var241 = 4;
                                    var239 = var239.method680((byte) -63, class74.field1257.method659(-45));
                                } else if (var243.method668(true, class276.field4858)) {
                                    var239 = var239.method680((byte) 126, class276.field4858.method659(-42));
                                    var241 = 5;
                                } else if (class184.field3271 != 0) {
                                    if (var243.method668(true, class220.field3835)) {
                                        var241 = 1;
                                        var239 = var239.method680((byte) -75, class220.field3835.method659(120));
                                    } else if (var243.method668(true, class230.field3985)) {
                                        var239 = var239.method680((byte) -70, class230.field3985.method659(-119));
                                        var241 = 2;
                                    } else if (var243.method668(true, class184.field3262)) {
                                        var239 = var239.method680((byte) -92, class184.field3262.method659(71));
                                        var241 = 3;
                                    } else if (var243.method668(true, class74.field1237)) {
                                        var241 = 4;
                                        var239 = var239.method680((byte) 100, class74.field1237.method659(106));
                                    } else if (var243.method668(true, class276.field4863)) {
                                        var239 = var239.method680((byte) 97, class276.field4863.method659(-73));
                                        var241 = 5;
                                    }
                                }
                                class131.field2277.method966((byte) 49, 235);
                                class131.field2277.method1691(0, (byte) 53);
                                int var244 = class131.field2277.field4587;
                                class131.field2277.method1691(var242, (byte) 53);
                                class131.field2277.method1691(var241, (byte) 53);
                                class202.method1358(var239, 0, class131.field2277);
                                class131.field2277.method1724(class131.field2277.field4587 - var244, (byte) 86);
                                continue;
                            }
                            if (var494 == 5009) {
                                var6 -= 2;
                                class99 var245 = class50.field814[var6];
                                class99 var246 = class50.field814[var6 + 1];
                                if (class103.field1751 != 0 || (!class74.field1258 || class105.field1763) && !class138.field2425) {
                                    class96.field1626++;
                                    class131.field2277.method966((byte) 49, 218);
                                    class131.field2277.method1691(0, (byte) 53);
                                    int var247 = class131.field2277.field4587;
                                    class131.field2277.method1699(var245.method697(-23666), -47);
                                    class202.method1358(var246, 0, class131.field2277);
                                    class131.field2277.method1724(class131.field2277.field4587 - var247, (byte) 78);
                                }
                                continue;
                            }
                            if (var494 == 5010) {
                                var7--;
                                int var248 = class245.field4228[var7];
                                class99 var249 = null;
                                if (var248 < 100) {
                                    var249 = class158.field2822[var248];
                                }
                                if (var249 == null) {
                                    var249 = class240.field4158;
                                }
                                class50.field814[var6++] = var249;
                                continue;
                            }
                            if (var494 == 5011) {
                                var7--;
                                int var250 = class245.field4228[var7];
                                class99 var251 = null;
                                if (var250 < 100) {
                                    var251 = class239.field4121[var250];
                                }
                                if (var251 == null) {
                                    var251 = class240.field4158;
                                }
                                class50.field814[var6++] = var251;
                                continue;
                            }
                            if (var494 == 5012) {
                                var7--;
                                int var252 = class245.field4228[var7];
                                int var253 = -1;
                                if (var252 < 100) {
                                    var253 = class290.field5073[var252];
                                }
                                class245.field4228[var7++] = var253;
                                continue;
                            }
                            if (var494 == 5015) {
                                class99 var254;
                                if (class168.field3006 == null || class168.field3006.field3224 == null) {
                                    var254 = class20.field232;
                                } else {
                                    var254 = class168.field3006.method1257((byte) 31);
                                }
                                class50.field814[var6++] = var254;
                                continue;
                            }
                            if (var494 == 5016) {
                                class245.field4228[var7++] = class112.field2023;
                                continue;
                            }
                            if (var494 == 5017) {
                                class245.field4228[var7++] = class168.field3000;
                                continue;
                            }
                            if (var494 == 5050) {
                                var7--;
                                int var255 = class245.field4228[var7];
                                class50.field814[var6++] = class254.method1646(var255, 127).field3484;
                                continue;
                            }
                            if (var494 == 5051) {
                                var7--;
                                int var256 = class245.field4228[var7];
                                class201 var257 = class254.method1646(var256, 116);
                                if (var257.field3494 == null) {
                                    class245.field4228[var7++] = 0;
                                } else {
                                    class245.field4228[var7++] = var257.field3494.length;
                                }
                                continue;
                            }
                            if (var494 == 5052) {
                                var7 -= 2;
                                int var258 = class245.field4228[var7];
                                int var259 = class245.field4228[var7 + 1];
                                class201 var260 = class254.method1646(var258, 109);
                                int var261 = var260.field3494[var259];
                                class245.field4228[var7++] = var261;
                                continue;
                            }
                            if (var494 == 5053) {
                                var7--;
                                int var262 = class245.field4228[var7];
                                class201 var263 = class254.method1646(var262, 109);
                                if (var263.field3481 == null) {
                                    class245.field4228[var7++] = 0;
                                } else {
                                    class245.field4228[var7++] = var263.field3481.length;
                                }
                                continue;
                            }
                            if (var494 == 5054) {
                                var7 -= 2;
                                int var264 = class245.field4228[var7];
                                int var265 = class245.field4228[var7 + 1];
                                class245.field4228[var7++] = class254.method1646(var264, 125).field3481[var265];
                                continue;
                            }
                            if (var494 == 5055) {
                                var7--;
                                int var266 = class245.field4228[var7];
                                class50.field814[var6++] = class108.method745(var266, true).method412((byte) 101);
                                continue;
                            }
                            if (var494 == 5056) {
                                var7--;
                                int var267 = class245.field4228[var7];
                                class63 var268 = class108.method745(var267, true);
                                if (var268.field1058 == null) {
                                    class245.field4228[var7++] = 0;
                                } else {
                                    class245.field4228[var7++] = var268.field1058.length;
                                }
                                continue;
                            }
                            if (var494 == 5057) {
                                var7 -= 2;
                                int var269 = class245.field4228[var7 + 1];
                                int var270 = class245.field4228[var7];
                                class245.field4228[var7++] = class108.method745(var270, true).field1058[var269];
                                continue;
                            }
                            if (var494 == 5058) {
                                class208.field3607 = new class54();
                                var7--;
                                class208.field3607.field883 = class245.field4228[var7];
                                class208.field3607.field885 = class108.method745(class208.field3607.field883, true);
                                class208.field3607.field893 = new int[class208.field3607.field885.method420(100)];
                                continue;
                            }
                            if (var494 == 5059) {
                                class76.field1349++;
                                class131.field2277.method966((byte) 49, 112);
                                class131.field2277.method1691(0, (byte) 53);
                                int var271 = class131.field2277.field4587;
                                class131.field2277.method1691(0, (byte) 53);
                                class131.field2277.method1745(class208.field3607.field883, (byte) 5);
                                class208.field3607.field885.method414(class131.field2277, -88, class208.field3607.field893);
                                class131.field2277.method1724(class131.field2277.field4587 - var271, (byte) 71);
                                continue;
                            }
                            if (var494 == 5060) {
                                class180.field3127++;
                                var6--;
                                class99 var272 = class50.field814[var6];
                                class131.field2277.method966((byte) 49, 4);
                                class131.field2277.method1691(0, (byte) 53);
                                int var273 = class131.field2277.field4587;
                                class131.field2277.method1699(var272.method697(-23666), 95);
                                class131.field2277.method1745(class208.field3607.field883, (byte) 5);
                                class208.field3607.field885.method414(class131.field2277, -92, class208.field3607.field893);
                                class131.field2277.method1724(class131.field2277.field4587 - var273, (byte) 35);
                                continue;
                            }
                            if (var494 == 5061) {
                                class76.field1349++;
                                class131.field2277.method966((byte) 49, 112);
                                class131.field2277.method1691(0, (byte) 53);
                                int var274 = class131.field2277.field4587;
                                class131.field2277.method1691(1, (byte) 53);
                                class131.field2277.method1745(class208.field3607.field883, (byte) 5);
                                class208.field3607.field885.method414(class131.field2277, -107, class208.field3607.field893);
                                class131.field2277.method1724(class131.field2277.field4587 - var274, (byte) 101);
                                continue;
                            }
                            if (var494 == 5062) {
                                var7 -= 2;
                                int var275 = class245.field4228[var7];
                                int var276 = class245.field4228[var7 + 1];
                                class245.field4228[var7++] = class254.method1646(var275, 97).field3487[var276];
                                continue;
                            }
                            if (var494 == 5063) {
                                var7 -= 2;
                                int var277 = class245.field4228[var7 + 1];
                                int var278 = class245.field4228[var7];
                                class245.field4228[var7++] = class254.method1646(var278, 111).field3491[var277];
                                continue;
                            }
                            if (var494 == 5064) {
                                var7 -= 2;
                                int var279 = class245.field4228[var7];
                                int var280 = class245.field4228[var7 + 1];
                                if (var280 == -1) {
                                    class245.field4228[var7++] = -1;
                                } else {
                                    class245.field4228[var7++] = class254.method1646(var279, 124).method1348((byte) 103, var280);
                                }
                                continue;
                            }
                            if (var494 == 5065) {
                                var7 -= 2;
                                int var281 = class245.field4228[var7];
                                int var282 = class245.field4228[var7 + 1];
                                if (var282 == -1) {
                                    class245.field4228[var7++] = -1;
                                } else {
                                    class245.field4228[var7++] = class254.method1646(var281, 121).method1355(116, var282);
                                }
                                continue;
                            }
                            if (var494 == 5066) {
                                var7--;
                                int var283 = class245.field4228[var7];
                                class245.field4228[var7++] = class108.method745(var283, true).method420(94);
                                continue;
                            }
                            if (var494 == 5067) {
                                var7 -= 2;
                                int var284 = class245.field4228[var7 + 1];
                                int var285 = class245.field4228[var7];
                                int var286 = class108.method745(var285, true).method416(var284, (byte) 84);
                                class245.field4228[var7++] = var286;
                                continue;
                            }
                            if (var494 == 5068) {
                                var7 -= 2;
                                int var287 = class245.field4228[var7];
                                int var288 = class245.field4228[var7 + 1];
                                class208.field3607.field893[var287] = var288;
                                continue;
                            }
                            if (var494 == 5069) {
                                var7 -= 2;
                                int var289 = class245.field4228[var7];
                                int var290 = class245.field4228[var7 + 1];
                                class208.field3607.field893[var289] = var290;
                                continue;
                            }
                            if (var494 == 5070) {
                                var7 -= 3;
                                int var291 = class245.field4228[var7 + 1];
                                int var292 = class245.field4228[var7];
                                int var293 = class245.field4228[var7 + 2];
                                class63 var294 = class108.method745(var292, true);
                                if (var294.method416(var291, (byte) 84) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class245.field4228[var7++] = var294.method413(var293, (byte) -118, var291);
                                continue;
                            }
                            if (var494 == 5071) {
                                var6--;
                                class99 var295 = class50.field814[var6];
                                var7--;
                                boolean var296 = class245.field4228[var7] == 1;
                                class23.method148(true, var296, var295);
                                class245.field4228[var7++] = class270.field4753;
                                continue;
                            }
                            if (var494 == 5072) {
                                if (class108.field1958 != null && class270.field4753 > class193.field3400) {
                                    class245.field4228[var7++] = class71.method502(class108.field1958[class193.field3400++], 65535);
                                    continue;
                                }
                                class245.field4228[var7++] = -1;
                                continue;
                            }
                            if (var494 == 5073) {
                                class193.field3400 = 0;
                                continue;
                            }
                        } else if (var494 < 5200) {
                            if (var494 == 5100) {
                                if (class51.field839[86]) {
                                    class245.field4228[var7++] = 1;
                                } else {
                                    class245.field4228[var7++] = 0;
                                }
                                continue;
                            }
                            if (var494 == 5101) {
                                if (class51.field839[82]) {
                                    class245.field4228[var7++] = 1;
                                } else {
                                    class245.field4228[var7++] = 0;
                                }
                                continue;
                            }
                            if (var494 == 5102) {
                                if (class51.field839[81]) {
                                    class245.field4228[var7++] = 1;
                                } else {
                                    class245.field4228[var7++] = 0;
                                }
                                continue;
                            }
                        } else if (var494 < 5300) {
                            if (var494 == 5200) {
                                var7--;
                                class281.method1854(class245.field4228[var7], 0);
                                continue;
                            }
                            if (var494 == 5201) {
                                class245.field4228[var7++] = class214.method1436(-23605);
                                continue;
                            }
                            if (var494 == 5202) {
                                var7--;
                                class178.method1193(class245.field4228[var7], (byte) 18);
                                continue;
                            }
                            if (var494 == 5203) {
                                var6--;
                                class212.method1416(class50.field814[var6], 0);
                                continue;
                            }
                            if (var494 == 5204) {
                                class50.field814[var6 - 1] = class177.method1184(class50.field814[var6 - 1], (byte) -122);
                                continue;
                            }
                            if (var494 == 5205) {
                                var6--;
                                class247.method1597(true, class50.field814[var6]);
                                continue;
                            }
                            if (var494 == 5206) {
                                var7--;
                                int var211 = class245.field4228[var7];
                                class229 var212 = class78.method547(var211 & 0x3FFF, (var211 & 0xFFFE471) >> 14, -75);
                                if (var212 == null) {
                                    class50.field814[var6++] = class240.field4158;
                                } else {
                                    class50.field814[var6++] = var212.field3968;
                                }
                                continue;
                            }
                            if (var494 == 5207) {
                                var6--;
                                class229 var213 = class108.method747(false, class50.field814[var6]);
                                if (var213 != null && var213.field3966 != null) {
                                    class50.field814[var6++] = var213.field3966;
                                    continue;
                                }
                                class50.field814[var6++] = class240.field4158;
                                continue;
                            }
                            if (var494 == 5208) {
                                class245.field4228[var7++] = class47.field793;
                                class245.field4228[var7++] = class127.field2219;
                                continue;
                            }
                            if (var494 == 5209) {
                                class245.field4228[var7++] = class48.field802 + class217.field3775;
                                class245.field4228[var7++] = class230.field3983 + class112.field2026 - class119.field2102 - 1;
                                continue;
                            }
                            if (var494 == 5210) {
                                class229 var214 = class281.method1851(false);
                                if (var214 == null) {
                                    class245.field4228[var7++] = 0;
                                    class245.field4228[var7++] = 0;
                                } else {
                                    class245.field4228[var7++] = var214.field3960 * 64;
                                    class245.field4228[var7++] = var214.field3957 * 64;
                                }
                                continue;
                            }
                            if (var494 == 5211) {
                                class229 var215 = class281.method1851(false);
                                if (var215 == null) {
                                    class245.field4228[var7++] = 0;
                                    class245.field4228[var7++] = 0;
                                } else {
                                    class245.field4228[var7++] = var215.field3967 - var215.field3956;
                                    class245.field4228[var7++] = var215.field3965 - var215.field3962;
                                }
                                continue;
                            }
                            if (var494 == 5212) {
                                int var216 = class178.method1191(-84);
                                int var217 = 0;
                                class99 var218;
                                if (var216 == -1) {
                                    var218 = class240.field4158;
                                } else {
                                    var218 = class127.field2206.field1529[var216];
                                    var217 = class127.field2206.method603(false, var216);
                                }
                                class99 var219 = var218.method674(11097, class131.field2294, class245.field4224);
                                class50.field814[var6++] = var219;
                                class245.field4228[var7++] = var217;
                                continue;
                            }
                            if (var494 == 5213) {
                                int var220 = class100.method709((byte) -59);
                                int var221 = 0;
                                class99 var222;
                                if (var220 == -1) {
                                    var222 = class240.field4158;
                                } else {
                                    var222 = class127.field2206.field1529[var220];
                                    var221 = class127.field2206.method603(false, var220);
                                }
                                class99 var223 = var222.method674(11097, class131.field2294, class245.field4224);
                                class50.field814[var6++] = var223;
                                class245.field4228[var7++] = var221;
                                continue;
                            }
                            if (var494 == 5214) {
                                var7--;
                                int var224 = class245.field4228[var7];
                                class196.method1316(var224 & 0x3FFF, (byte) -109, var224 >> 14 & 0x3FFF);
                                continue;
                            }
                            if (var494 == 5215) {
                                var7--;
                                int var225 = class245.field4228[var7];
                                var6--;
                                class99 var226 = class50.field814[var6];
                                class197 var227 = class230.method1509(var225 & 0x3FFF, var225 >> 14 & 0x3FFF, (byte) 8);
                                boolean var228 = false;
                                for (class229 var229 = (class229) var227.method1325(66); var229 != null; var229 = (class229) var227.method1326(-99)) {
                                    if (var229.field3968.method706(var226, 123)) {
                                        var228 = true;
                                        break;
                                    }
                                }
                                if (var228) {
                                    class245.field4228[var7++] = 1;
                                } else {
                                    class245.field4228[var7++] = 0;
                                }
                                continue;
                            }
                            if (var494 == 5216) {
                                var7--;
                                int var230 = class245.field4228[var7];
                                class160.method1088(var230, false);
                                continue;
                            }
                            if (var494 == 5217) {
                                var7--;
                                int var231 = class245.field4228[var7];
                                if (class272.method1807(-8488, var231)) {
                                    class245.field4228[var7++] = 1;
                                } else {
                                    class245.field4228[var7++] = 0;
                                }
                                continue;
                            }
                        } else if (var494 < 5400) {
                            if (var494 == 5300) {
                                var7 -= 2;
                                class245.field4228[var7++] = 0;
                                continue;
                            }
                            if (var494 == 5301) {
                                continue;
                            }
                            if (var494 == 5302) {
                                class245.field4228[var7++] = 0;
                                continue;
                            }
                            if (var494 == 5303) {
                                var7--;
                                class245.field4228[var7++] = 0;
                                class245.field4228[var7++] = 0;
                                continue;
                            }
                            if (var494 == 5305) {
                                byte var208 = -1;
                                class245.field4228[var7++] = var208;
                                continue;
                            }
                            if (var494 == 5306) {
                                class245.field4228[var7++] = class143.method972(-3);
                                continue;
                            }
                            if (var494 == 5307) {
                                var7--;
                                int var209 = class245.field4228[var7];
                                if (var209 < 0 || var209 > 2) {
                                    var209 = 0;
                                }
                                class249.method1613(70, -1, false, -1, var209);
                                continue;
                            }
                            if (var494 == 5308) {
                                class245.field4228[var7++] = class36.field628;
                                continue;
                            }
                            if (var494 == 5309) {
                                var7--;
                                int var210 = class245.field4228[var7];
                                if (var210 < 0 || var210 > 2) {
                                    var210 = 0;
                                }
                                class36.field628 = var210;
                                class1.method8((byte) 34, class24.field368);
                                continue;
                            }
                        } else if (var494 < 5500) {
                            if (var494 == 5400) {
                                var6 -= 2;
                                class79.field1400++;
                                class99 var146 = class50.field814[var6];
                                class99 var147 = class50.field814[var6 + 1];
                                var7--;
                                int var148 = class245.field4228[var7];
                                class131.field2277.method966((byte) 49, 113);
                                class131.field2277.method1691(class3.method21(var146, 20987) + class3.method21(var147, 20987) + 1, (byte) 53);
                                class131.field2277.method1725(var146, 114);
                                class131.field2277.method1725(var147, 107);
                                class131.field2277.method1691(var148, (byte) 53);
                                continue;
                            }
                            if (var494 == 5401) {
                                var7 -= 2;
                                class264.field4676[class245.field4228[var7]] = (short) class79.method551((byte) 97, class245.field4228[var7 + 1]);
                                class288.method1938((byte) -99);
                                class199.method1337((byte) 110);
                                class185.method1267(-120);
                                class141.method956(false);
                                class106.method730(0);
                                continue;
                            }
                            if (var494 == 5405) {
                                var7 -= 2;
                                int var149 = class245.field4228[var7];
                                int var150 = class245.field4228[var7 + 1];
                                if (var149 >= 0 && var149 < 2) {
                                    class149.field2614[var149] = new int[var150 << 1][4];
                                }
                                continue;
                            }
                            if (var494 == 5406) {
                                var7 -= 7;
                                int var151 = class245.field4228[var7];
                                int var152 = class245.field4228[var7 + 2];
                                int var153 = class245.field4228[var7 + 1] << 1;
                                int var154 = class245.field4228[var7 + 3];
                                int var155 = class245.field4228[var7 + 4];
                                int var156 = class245.field4228[var7 + 5];
                                int var157 = class245.field4228[var7 + 6];
                                if (var151 >= 0 && var151 < 2 && class149.field2614[var151] != null && var153 >= 0 && class149.field2614[var151].length > var153) {
                                    class149.field2614[var151][var153] = new int[] { class71.method502(var152 >> 14, 16383) * 128, var154, class71.method502(var152, 16383) * 128, var157 };
                                    class149.field2614[var151][var153 + 1] = new int[] { (class71.method502(268429473, var155) >> 14) * 128, var156, class71.method502(var155, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var494 == 5407) {
                                var7--;
                                int var158 = class149.field2614[class245.field4228[var7]].length >> 1;
                                class245.field4228[var7++] = var158;
                                continue;
                            }
                            if (var494 == 5411) {
                                if (class75.field1281 == null) {
                                    class177.method1185(false, class239.method1558(true), (byte) 125);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var494 == 5419) {
                                class99 var159 = class240.field4158;
                                if (class101.field1725 != null) {
                                    var159 = class255.method1650(0, class101.field1725.field4847);
                                    try {
                                        if (class101.field1725.field4843 != null) {
                                            byte[] var160 = ((String) class101.field1725.field4843).getBytes("ISO-8859-1");
                                            var159 = class205.method1379(0, var160.length, var160, (byte) 126);
                                        }
                                    } catch (UnsupportedEncodingException var492) {
                                    }
                                }
                                class50.field814[var6++] = var159;
                                continue;
                            }
                            if (var494 == 5420) {
                                class245.field4228[var7++] = class87.field1494 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 5421) {
                                var6--;
                                class99 var161 = class50.field814[var6];
                                var7--;
                                boolean var162 = class245.field4228[var7] == 1;
                                class99 var163 = class198.method1332(100, new class99[] { class239.method1558(true), var161 });
                                if (class75.field1281 != null || var162 && class87.field1494 != 3 && class87.field1510.startsWith("win") && !class63.field1073) {
                                    class261.field4585 = var162;
                                    class193.field3401 = var163;
                                    class11.field96 = class24.field368.method587(new String(var163.method703((byte) 117), "ISO-8859-1"), 31310);
                                    continue;
                                }
                                class177.method1185(var162, var163, (byte) 108);
                                continue;
                            }
                            if (var494 == 5422) {
                                var6 -= 2;
                                class99 var164 = class50.field814[var6];
                                var7--;
                                int var165 = class245.field4228[var7];
                                class99 var166 = class50.field814[var6 + 1];
                                if (var164.method659(-34) > 0) {
                                    if (class174.field3073 == null) {
                                        class174.field3073 = new class99[class96.field1627[class34.field613]];
                                    }
                                    class174.field3073[var165] = var164;
                                }
                                if (var166.method659(112) > 0) {
                                    if (class89.field1532 == null) {
                                        class89.field1532 = new class99[class96.field1627[class34.field613]];
                                    }
                                    class89.field1532[var165] = var166;
                                }
                                continue;
                            }
                            if (var494 == 5423) {
                                var6--;
                                class50.field814[var6].method667((byte) -35);
                                continue;
                            }
                        } else if (var494 < 5600) {
                            if (var494 == 5500) {
                                var7 -= 4;
                                int var167 = class245.field4228[var7];
                                int var168 = class245.field4228[var7 + 1];
                                int var169 = class245.field4228[var7 + 3];
                                int var170 = class245.field4228[var7 + 2];
                                class13.method90(var170, (var167 & 0x3FFF) - class215.field3731, var168, false, var169, false, (var167 >> 14 & 0x3FFF) - class280.field4910);
                                continue;
                            }
                            if (var494 == 5501) {
                                var7 -= 4;
                                int var171 = class245.field4228[var7];
                                int var172 = class245.field4228[var7 + 2];
                                int var173 = class245.field4228[var7 + 3];
                                int var174 = class245.field4228[var7 + 1];
                                class18.method108(var174, true, (var171 & 0x3FFF) - class215.field3731, var173, var172, ((var171 & 0xFFFD7AE) >> 14) - class280.field4910);
                                continue;
                            }
                            if (var494 == 5502) {
                                var7 -= 6;
                                int var175 = class245.field4228[var7];
                                if (var175 >= 2) {
                                    throw new RuntimeException();
                                }
                                class24.field361 = var175;
                                int var176 = class245.field4228[var7 + 1];
                                if (class149.field2614[class24.field361].length >> 1 <= var176 + 1) {
                                    throw new RuntimeException();
                                }
                                class100.field1709 = 0;
                                class193.field3389 = var176;
                                class240.field4142 = class245.field4228[var7 + 2];
                                class149.field2617 = class245.field4228[var7 + 3];
                                int var177 = class245.field4228[var7 + 4];
                                if (var177 >= 2) {
                                    throw new RuntimeException();
                                }
                                class220.field3824 = var177;
                                int var178 = class245.field4228[var7 + 5];
                                if ((class149.field2614[class220.field3824].length >> 1) <= (var178 + 1)) {
                                    throw new RuntimeException();
                                }
                                class41.field694 = var178;
                                class141.field2481 = 3;
                                continue;
                            }
                            if (var494 == 5503) {
                                class199.method1336(false);
                                continue;
                            }
                            if (var494 == 5504) {
                                var7 -= 2;
                                class160.field2843 = class245.field4228[var7];
                                class239.field4129 = class245.field4228[var7 + 1];
                                class278.method1833(98);
                                continue;
                            }
                            if (var494 == 5505) {
                                class245.field4228[var7++] = class160.field2843;
                                continue;
                            }
                            if (var494 == 5506) {
                                class245.field4228[var7++] = class239.field4129;
                                continue;
                            }
                        } else if (var494 < 5700) {
                            if (var494 == 5600) {
                                var6 -= 2;
                                class99 var179 = class50.field814[var6];
                                class99 var180 = class50.field814[var6 + 1];
                                var7--;
                                int var181 = class245.field4228[var7];
                                if (class156.field2808 == 10 && class18.field192 == 0 && class78.field1386 == 0 && class236.field4073 == 0 && class103.field1752 == 0) {
                                    class182.method1249(var180, (byte) 43, var179, var181);
                                }
                                continue;
                            }
                            if (var494 == 5601) {
                                class31.method261(true);
                                continue;
                            }
                            if (var494 == 5602) {
                                if (class78.field1386 == 0) {
                                    class65.field1107 = -2;
                                }
                                continue;
                            }
                            if (var494 == 5603) {
                                var7 -= 4;
                                if (class156.field2808 == 10 && class18.field192 == 0 && class78.field1386 == 0 && class236.field4073 == 0 && class103.field1752 == 0) {
                                    class30.method257(class245.field4228[var7 + 1], 26534, class245.field4228[var7 + 3], class245.field4228[var7], class245.field4228[var7 + 2]);
                                }
                                continue;
                            }
                            if (var494 == 5604) {
                                var6--;
                                if (class156.field2808 == 10 && class18.field192 == 0 && class78.field1386 == 0 && class236.field4073 == 0 && class103.field1752 == 0) {
                                    class116.method785(class50.field814[var6].method697(-23666), 0);
                                }
                                continue;
                            }
                            if (var494 == 5605) {
                                var6 -= 2;
                                var7 -= 4;
                                if (class156.field2808 == 10 && class18.field192 == 0 && class78.field1386 == 0 && class236.field4073 == 0 && class103.field1752 == 0) {
                                    class118.method794(class245.field4228[var7 + 3], 99999999, class245.field4228[var7 + 1], class245.field4228[var7], class50.field814[var6 + 1], class50.field814[var6].method697(-23666), class245.field4228[var7 + 2]);
                                }
                                continue;
                            }
                            if (var494 == 5606) {
                                if (class236.field4073 == 0) {
                                    class118.field2099 = -2;
                                }
                                continue;
                            }
                            if (var494 == 5607) {
                                class245.field4228[var7++] = class65.field1107;
                                continue;
                            }
                            if (var494 == 5608) {
                                class245.field4228[var7++] = class251.field4338;
                                continue;
                            }
                            if (var494 == 5609) {
                                class245.field4228[var7++] = class118.field2099;
                                continue;
                            }
                            if (var494 == 5610) {
                                for (int var182 = 0; var182 < 5; var182++) {
                                    class50.field814[var6++] = var182 >= class80.field1412.length ? class240.field4158 : class80.field1412[var182].method690(69);
                                }
                                class80.field1412 = null;
                                continue;
                            }
                            if (var494 == 5611) {
                                class245.field4228[var7++] = class251.field4325;
                                continue;
                            }
                        } else if (var494 < 6100) {
                            if (var494 == 6001) {
                                var7--;
                                int var200 = class245.field4228[var7];
                                if (var200 < 1) {
                                    var200 = 1;
                                }
                                if (var200 > 4) {
                                    var200 = 4;
                                }
                                class264.field4669 = var200;
                                if (class264.field4669 == 1) {
                                    class134.method893(0.9F);
                                }
                                if (class264.field4669 == 2) {
                                    class134.method893(0.8F);
                                }
                                if (class264.field4669 == 3) {
                                    class134.method893(0.7F);
                                }
                                if (class264.field4669 == 4) {
                                    class134.method893(0.6F);
                                }
                                class199.method1337((byte) 13);
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6002) {
                                var7--;
                                class273.method1818(-126, ~class245.field4228[var7] == -2);
                                class124.method820((byte) 80);
                                class179.method1197(-108);
                                class187.method1286(false);
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6003) {
                                var7--;
                                class168.field3007 = class245.field4228[var7] == 1;
                                class187.method1286(false);
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6005) {
                                var7--;
                                class63.field1072 = class245.field4228[var7] == 1;
                                class179.method1197(104);
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6006) {
                                var7--;
                                class272.field4792 = class245.field4228[var7] == 1;
                                ((class145) class134.field2338).method985(!class272.field4792, (byte) -56);
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6007) {
                                var7--;
                                class164.field2876 = class245.field4228[var7] == 1;
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6008) {
                                var7--;
                                class32.field578 = class245.field4228[var7] == 1;
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6009) {
                                var7--;
                                class186.field3294 = class245.field4228[var7] == 1;
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6010) {
                                var7--;
                                class64.field1084 = class245.field4228[var7] == 1;
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6011) {
                                var7--;
                                int var201 = class245.field4228[var7];
                                if (var201 < 0 || var201 > 2) {
                                    var201 = 0;
                                }
                                class221.field3838 = var201;
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6012) {
                                var7--;
                                class42.field716 = class245.field4228[var7] == 1;
                                if (class264.field4669 == 1) {
                                    class134.method893(0.9F);
                                }
                                if (class264.field4669 == 2) {
                                    class134.method893(0.8F);
                                }
                                if (class264.field4669 == 3) {
                                    class134.method893(0.7F);
                                }
                                if (class264.field4669 == 4) {
                                    class134.method893(0.6F);
                                }
                                class179.method1197(-119);
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6014) {
                                var7--;
                                class242.field4197 = class245.field4228[var7] == 1;
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6015) {
                                var7--;
                                class120.field2123 = class245.field4228[var7] == 1;
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6016) {
                                var7--;
                                int var202 = class245.field4228[var7];
                                if (var202 < 0 || var202 > 2) {
                                    var202 = 0;
                                }
                                class65.field1102 = var202;
                                continue;
                            }
                            if (var494 == 6017) {
                                var7--;
                                class107.field1819 = class245.field4228[var7] == 1;
                                class139.method950(false);
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6018) {
                                var7--;
                                int var203 = class245.field4228[var7];
                                if (var203 < 0) {
                                    var203 = 0;
                                }
                                if (var203 > 127) {
                                    var203 = 127;
                                }
                                class262.field4636 = var203;
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6019) {
                                var7--;
                                int var204 = class245.field4228[var7];
                                if (var204 < 0) {
                                    var204 = 0;
                                }
                                if (var204 > 255) {
                                    var204 = 255;
                                }
                                if (class160.field2839 != var204) {
                                    if (class160.field2839 == 0 && class62.field1037 != -1) {
                                        class240.method1562(class62.field1037, class227.field3923, 0, var204, 1, false);
                                        class127.field2222 = false;
                                    } else if (var204 == 0) {
                                        class133.method889((byte) 89);
                                        class127.field2222 = false;
                                    } else {
                                        class187.method1279(0, var204);
                                    }
                                    class160.field2839 = var204;
                                }
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6020) {
                                var7--;
                                int var205 = class245.field4228[var7];
                                if (var205 < 0) {
                                    var205 = 0;
                                }
                                if (var205 > 127) {
                                    var205 = 127;
                                }
                                class92.field1550 = var205;
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6021) {
                                var7--;
                                class125.field2196 = class245.field4228[var7] == 1;
                                class187.method1286(false);
                                continue;
                            }
                            if (var494 == 6023) {
                                var7--;
                                int var206 = class245.field4228[var7];
                                if (var206 < 0) {
                                    var206 = 0;
                                }
                                if (var206 > 2) {
                                    var206 = 2;
                                }
                                class136.method924(var206);
                                class1.method8((byte) 34, class24.field368);
                                class58.field968 = false;
                                continue;
                            }
                            if (var494 == 6024) {
                                var7--;
                                int var207 = class245.field4228[var7];
                                if (var207 < 0 || var207 > 2) {
                                    var207 = 0;
                                }
                                class221.field3844 = var207;
                                class1.method8((byte) 34, class24.field368);
                                continue;
                            }
                        } else if (var494 < 6200) {
                            if (var494 == 6101) {
                                class245.field4228[var7++] = class264.field4669;
                                continue;
                            }
                            if (var494 == 6102) {
                                class245.field4228[var7++] = class139.method951(436421925) ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6103) {
                                class245.field4228[var7++] = class168.field3007 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6105) {
                                class245.field4228[var7++] = class63.field1072 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6106) {
                                class245.field4228[var7++] = class272.field4792 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6107) {
                                class245.field4228[var7++] = class164.field2876 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6108) {
                                class245.field4228[var7++] = class32.field578 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6109) {
                                class245.field4228[var7++] = class186.field3294 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6110) {
                                class245.field4228[var7++] = class64.field1084 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6111) {
                                class245.field4228[var7++] = class221.field3838;
                                continue;
                            }
                            if (var494 == 6112) {
                                class245.field4228[var7++] = class42.field716 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6114) {
                                class245.field4228[var7++] = class242.field4197 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6115) {
                                class245.field4228[var7++] = class120.field2123 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6116) {
                                class245.field4228[var7++] = class65.field1102;
                                continue;
                            }
                            if (var494 == 6117) {
                                class245.field4228[var7++] = class107.field1819 ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6118) {
                                class245.field4228[var7++] = class262.field4636;
                                continue;
                            }
                            if (var494 == 6119) {
                                class245.field4228[var7++] = class160.field2839;
                                continue;
                            }
                            if (var494 == 6120) {
                                class245.field4228[var7++] = class92.field1550;
                                continue;
                            }
                            if (var494 == 6121) {
                                class245.field4228[var7++] = 0;
                                continue;
                            }
                            if (var494 == 6123) {
                                class245.field4228[var7++] = class136.method929();
                                continue;
                            }
                            if (var494 == 6124) {
                                class245.field4228[var7++] = class221.field3844;
                                continue;
                            }
                        } else if (var494 < 6300) {
                            if (var494 == 6200) {
                                var7 -= 2;
                                class22.field271 = (short) class245.field4228[var7];
                                if (class22.field271 <= 0) {
                                    class22.field271 = 256;
                                }
                                class196.field3417 = (short) class245.field4228[var7 + 1];
                                if (class196.field3417 <= 0) {
                                    class196.field3417 = 205;
                                }
                                continue;
                            }
                            if (var494 == 6201) {
                                var7 -= 2;
                                class115.field2042 = (short) class245.field4228[var7];
                                if (class115.field2042 <= 0) {
                                    class115.field2042 = 256;
                                }
                                class190.field3343 = (short) class245.field4228[var7 + 1];
                                if (class190.field3343 <= 0) {
                                    class190.field3343 = 320;
                                }
                                continue;
                            }
                            if (var494 == 6202) {
                                var7 -= 4;
                                class34.field618 = (short) class245.field4228[var7];
                                if (class34.field618 <= 0) {
                                    class34.field618 = 1;
                                }
                                class43.field723 = (short) class245.field4228[var7 + 1];
                                if (class43.field723 <= 0) {
                                    class43.field723 = 32767;
                                } else if (class43.field723 < class34.field618) {
                                    class43.field723 = class34.field618;
                                }
                                class130.field2271 = (short) class245.field4228[var7 + 2];
                                if (class130.field2271 <= 0) {
                                    class130.field2271 = 1;
                                }
                                class32.field572 = (short) class245.field4228[var7 + 3];
                                if (class32.field572 <= 0) {
                                    class32.field572 = 32767;
                                } else if (class32.field572 < class130.field2271) {
                                    class32.field572 = class130.field2271;
                                }
                                continue;
                            }
                            if (var494 == 6203) {
                                class185.method1270(false, class28.field532.field1933, -2, 0, 0, class28.field532.field1793);
                                class245.field4228[var7++] = class118.field2094;
                                class245.field4228[var7++] = class177.field3095;
                                continue;
                            }
                            if (var494 == 6204) {
                                class245.field4228[var7++] = class115.field2042;
                                class245.field4228[var7++] = class190.field3343;
                                continue;
                            }
                            if (var494 == 6205) {
                                class245.field4228[var7++] = class22.field271;
                                class245.field4228[var7++] = class196.field3417;
                                continue;
                            }
                        } else if (var494 < 6400) {
                            if (var494 == 6300) {
                                class245.field4228[var7++] = (int) (class231.method1513(-52) / 60000L);
                                continue;
                            }
                            if (var494 == 6301) {
                                class245.field4228[var7++] = (int) (class231.method1513(64) / 86400000L) - 11745;
                                continue;
                            }
                            if (var494 == 6302) {
                                var7 -= 3;
                                int var183 = class245.field4228[var7];
                                int var184 = class245.field4228[var7 + 1];
                                int var185 = class245.field4228[var7 + 2];
                                class252.field4364.clear();
                                class252.field4364.set(11, 12);
                                class252.field4364.set(var185, var184, var183);
                                class245.field4228[var7++] = (int) (class252.field4364.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var494 == 6303) {
                                class252.field4364.clear();
                                class252.field4364.setTime(new Date(class231.method1513(78)));
                                class245.field4228[var7++] = class252.field4364.get(1);
                                continue;
                            }
                            if (var494 == 6304) {
                                var7--;
                                int var186 = class245.field4228[var7];
                                boolean var187 = true;
                                if (var186 < 0) {
                                    var187 = ((var186 + 1) % 4) == 0;
                                } else if (var186 < 1582) {
                                    var187 = (var186 % 4) == 0;
                                } else if ((var186 % 4) != 0) {
                                    var187 = false;
                                } else if (var186 % 100 != 0) {
                                    var187 = true;
                                } else if ((var186 % 400) != 0) {
                                    var187 = false;
                                }
                                class245.field4228[var7++] = var187 ? 1 : 0;
                                continue;
                            }
                        } else if (var494 < 6500) {
                            if (var494 == 6405) {
                                class245.field4228[var7++] = class156.method1072(20066) ? 1 : 0;
                                continue;
                            }
                            if (var494 == 6406) {
                                class245.field4228[var7++] = class167.method1133(true) ? 1 : 0;
                                continue;
                            }
                        } else if (var494 < 6600) {
                            if (var494 == 6500) {
                                if (class156.field2808 == 10 && class18.field192 == 0 && class78.field1386 == 0 && class236.field4073 == 0) {
                                    class245.field4228[var7++] = class165.method1108(122) == -1 ? 0 : 1;
                                    continue;
                                }
                                class245.field4228[var7++] = 1;
                                continue;
                            }
                            if (var494 == 6501) {
                                class144 var188 = class59.method397(false);
                                if (var188 == null) {
                                    class245.field4228[var7++] = -1;
                                    class245.field4228[var7++] = 0;
                                    class50.field814[var6++] = class240.field4158;
                                    class245.field4228[var7++] = 0;
                                    class50.field814[var6++] = class240.field4158;
                                    class245.field4228[var7++] = 0;
                                } else {
                                    class245.field4228[var7++] = var188.field2531;
                                    class245.field4228[var7++] = var188.field4895;
                                    class50.field814[var6++] = var188.field2532;
                                    class256 var189 = var188.method980((byte) -9);
                                    class245.field4228[var7++] = var189.field4423;
                                    class50.field814[var6++] = var189.field4421;
                                    class245.field4228[var7++] = var188.field4894;
                                }
                                continue;
                            }
                            if (var494 == 6502) {
                                class144 var190 = class19.method110(true);
                                if (var190 == null) {
                                    class245.field4228[var7++] = -1;
                                    class245.field4228[var7++] = 0;
                                    class50.field814[var6++] = class240.field4158;
                                    class245.field4228[var7++] = 0;
                                    class50.field814[var6++] = class240.field4158;
                                    class245.field4228[var7++] = 0;
                                } else {
                                    class245.field4228[var7++] = var190.field2531;
                                    class245.field4228[var7++] = var190.field4895;
                                    class50.field814[var6++] = var190.field2532;
                                    class256 var191 = var190.method980((byte) -9);
                                    class245.field4228[var7++] = var191.field4423;
                                    class50.field814[var6++] = var191.field4421;
                                    class245.field4228[var7++] = var190.field4894;
                                }
                                continue;
                            }
                            if (var494 == 6503) {
                                var7--;
                                int var192 = class245.field4228[var7];
                                if (class156.field2808 == 10 && class18.field192 == 0 && class78.field1386 == 0 && class236.field4073 == 0) {
                                    class245.field4228[var7++] = class214.method1437(var192, 50) ? 1 : 0;
                                    continue;
                                }
                                class245.field4228[var7++] = 0;
                                continue;
                            }
                            if (var494 == 6504) {
                                var7--;
                                class165.field2895 = class245.field4228[var7];
                                class1.method8((byte) 34, class24.field368);
                                continue;
                            }
                            if (var494 == 6505) {
                                class245.field4228[var7++] = class165.field2895;
                                continue;
                            }
                            if (var494 == 6506) {
                                var7--;
                                int var193 = class245.field4228[var7];
                                class144 var194 = class254.method1647(var193, (byte) -56);
                                if (var194 == null) {
                                    class245.field4228[var7++] = -1;
                                    class50.field814[var6++] = class240.field4158;
                                    class245.field4228[var7++] = 0;
                                    class50.field814[var6++] = class240.field4158;
                                    class245.field4228[var7++] = 0;
                                } else {
                                    class245.field4228[var7++] = var194.field4895;
                                    class50.field814[var6++] = var194.field2532;
                                    class256 var195 = var194.method980((byte) -9);
                                    class245.field4228[var7++] = var195.field4423;
                                    class50.field814[var6++] = var195.field4421;
                                    class245.field4228[var7++] = var194.field4894;
                                }
                                continue;
                            }
                            if (var494 == 6507) {
                                var7 -= 4;
                                int var196 = class245.field4228[var7];
                                boolean var197 = class245.field4228[var7 + 1] == 1;
                                int var198 = class245.field4228[var7 + 2];
                                boolean var199 = class245.field4228[var7 + 3] == 1;
                                class152.method1012(var197, (byte) -22, var199, var196, var198);
                                continue;
                            }
                        } else if (var494 < 6700) {
                            if (var494 == 6600) {
                                var7--;
                                class3.field34 = class245.field4228[var7] == 1;
                                class1.method8((byte) 34, class24.field368);
                                continue;
                            }
                            if (var494 == 6601) {
                                class245.field4228[var7++] = class3.field34 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var494 == 4400) {
                        var7 -= 2;
                        int var297 = class245.field4228[var7];
                        int var298 = class245.field4228[var7 + 1];
                        class212 var299 = class28.method245(var298, 123);
                        if (var299.method1415(11)) {
                            class50.field814[var6++] = class247.method1601(26012, var297).method1027(var299.field3675, var298, 10);
                        } else {
                            class245.field4228[var7++] = class247.method1601(26012, var297).method1028(var299.field3672, -19362, var298);
                        }
                        continue;
                    }
                } else {
                    class107 var65;
                    if (var494 >= 2000) {
                        var7--;
                        var65 = class22.method131(class245.field4228[var7], 1538872048);
                        var494 -= 1000;
                    } else {
                        var65 = var46 ? class272.field4812 : class41.field700;
                    }
                    if (var494 == 1300) {
                        var7--;
                        int var66 = class245.field4228[var7] - 1;
                        if (var66 >= 0 && var66 <= 9) {
                            var6--;
                            var65.method731(-1, var66, class50.field814[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var494 == 1301) {
                        var7 -= 2;
                        int var67 = class245.field4228[var7 + 1];
                        int var68 = class245.field4228[var7];
                        var65.field1810 = class127.method842((byte) -48, var67, var68);
                        continue;
                    }
                    if (var494 == 1302) {
                        var7--;
                        var65.field1822 = class245.field4228[var7] == 1;
                        continue;
                    }
                    if (var494 == 1303) {
                        var7--;
                        var65.field1857 = class245.field4228[var7];
                        continue;
                    }
                    if (var494 == 1304) {
                        var7--;
                        var65.field1792 = class245.field4228[var7];
                        continue;
                    }
                    if (var494 == 1305) {
                        var6--;
                        var65.field1943 = class50.field814[var6];
                        continue;
                    }
                    if (var494 == 1306) {
                        var6--;
                        var65.field1790 = class50.field814[var6];
                        continue;
                    }
                    if (var494 == 1307) {
                        var65.field1779 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var493) {
            if (var5.field4730 == null) {
                if (class161.field2856 != 0) {
                    class259.method1678(class240.field4158, class43.field737, (byte) -126, 0);
                }
                class196.method1315(false, var493, "CS2 - scr:" + var5.field2187 + " op:" + var9);
            } else {
                class99 var489 = class28.method237(30, 0);
                var489.method664(-1, class63.field1068).method664(-1, var5.field4730);
                for (int var490 = class259.field4521 - 1; var490 >= 0; var490--) {
                    var489.method664(-1, class288.field5046).method664(-1, class124.field2182[var490].field5060.field4730);
                }
                if (var9 == 40) {
                    int var491 = var11[var10];
                    var489.method664(-1, class287.field5019).method664(-1, class198.method1333(-110, var491));
                }
                if (class161.field2856 != 0) {
                    class259.method1678(class240.field4158, class198.method1332(63, new class99[] { class268.field4714, var5.field4730 }), (byte) -126, 0);
                }
                class196.method1315(false, var493, "CS2 - scr:" + var5.field2187 + " op:" + var9 + new String(var489.method703((byte) 122)));
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static final void method1152(int arg0) {
        class125.field2188 = new class107[class41.field701.method1234(arg0 + arg0)][];
        field3035++;
        class250.field4312 = new boolean[class41.field701.method1234(arg0)];
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method1153(byte arg0) {
        field3039 = null;
        if (arg0 != -82) {
            field3043 = -117;
        }
        field3044 = null;
        field3034 = null;
        field3042 = null;
        field3041 = null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public static final void method1154(int arg0) {
        class265.field4690 = class83.field1458;
        class59.field992 = class63.field1069;
        class218.field3797 = class280.field4904;
        class244.field4211 = class24.field360;
        class225.field3907 = class112.field2030;
        class118.field2082 = class262.field4627;
        class83.field1455 = class267.field4712;
        class187.field3314 = class210.field3645;
        class139.field2469 = class177.field3098;
        class190.field3344 = class260.field4555;
        class230.field3978 = class149.field2621;
        class192.field3376 = class239.field4131;
        class149.field2627 = class261.field4558;
        class191.field3365 = class287.field5024;
        class9.field82 = class81.field1433;
        class42.field713 = class280.field4907;
        class217.field3771 = class129.field2259;
        class110.field1975 = class25.field440;
        class199.field3469 = class83.field1452;
        class223.field3878 = class144.field2539;
        class230.field3985 = class182.field3201;
        field3033++;
        class110.field1967 = class271.field4779;
        class199.field3459 = class149.field2628;
        class82.field1447 = class124.field2181;
        class183.field3220 = class20.field226;
        class220.field3835 = class190.field3346;
        class50.field819 = class135.field2356;
        class250.field4323 = class173.field3059;
        class284.field4933 = class85.field1469;
        class82.field1448 = class103.field1739;
        class41.field696 = class144.field2542;
        class158.field2819 = class43.field763;
        class29.field544 = class268.field4715;
        class85.field1473 = class47.field785;
        class73.field1222 = class34.field611;
        class197.field3442 = class261.field4562;
        class288.field5047 = class118.field2100;
        class117.field2072 = class63.field1071;
        class168.field2999 = class100.field1714;
        class258.field4503 = class178.field3107;
        class204.field3544 = class145.field2562;
        class232.field4017 = class86.field1487;
        class74.field1237 = class112.field2018;
        class18.field190 = class111.field1989;
        class244.field4204 = class207.field3585;
        class96.field1625 = class182.field3187;
        if (arg0 <= 95) {
            method1152(32);
        }
        class110.field1979 = class35.field624;
        class85.field1470 = class47.field785;
        class210.field3652 = class248.field4286;
        class167.field2983 = class125.field2201;
        class237.field4097 = class160.field2835;
        class210.field3650 = class224.field3894;
        class276.field4863 = class12.field105;
        class218.field3787 = class237.field4110;
        class133.field2323 = class133.field2319;
        class221.field3848 = class135.field2354;
        class198.field3445 = class208.field3599;
        class151.field2655 = class165.field2891;
        class63.field1067 = class36.field627;
        class23.field333 = class40.field675;
        class48.field796 = class214.field3712;
        class199.field3461 = class183.field3211;
        class19.field208 = class262.field4638;
        class142.field2501 = class105.field1762;
        class259.field4526 = class145.field2569;
        class287.field5025 = class153.field2711;
        class22.field257 = class278.field4887;
        class65.field1105 = class142.field2505;
        class55.field901 = class256.field4418;
        class263.field4650 = class13.field116;
        class128.field2238 = class150.field2643;
        class156.field2807 = class137.field2418;
        class244.field4213 = class71.field1205;
        class184.field3262 = class60.field1004;
        class263.field4642 = class250.field4305;
        class98.field1639 = class17.field172;
        class251.field4324 = class167.field2987;
        class187.field3318 = class210.field3645;
        class131.field2281 = class258.field4500;
        class165.field2893 = class251.field4329;
        class59.field988 = class83.field1453;
        class56.field915 = class119.field2104;
        class244.field4214 = class24.field360;
        class103.field1753 = class133.field2325;
        class262.field4639 = class141.field2483;
        class146.field2587 = class12.field107;
        class123.field2157 = class243.field4202;
        class99.field1660 = class9.field79;
        class119.field2107 = class22.field258;
    }
}
