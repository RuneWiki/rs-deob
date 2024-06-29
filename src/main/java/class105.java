import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class105 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lpd;")
    public static class94 field2611 = class28.method249(41, "Ausw-=hlen");

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lpd;")
    public static class94 field2621 = class28.method249(-125, "(X100(U(Y");

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lpd;")
    private static class94 field2619 = class28.method249(-83, "flash2:");

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lpd;")
    public static class94 field2625 = field2619;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Lpd;")
    public static class94 field2614 = class28.method249(-96, "compass");

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lpd;")
    private static class94 field2617 = class28.method249(112, "Loading sprites )2 ");

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lpd;")
    public static class94 field2630 = class28.method249(83, "@red@");

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Lpd;")
    public static class94 field2634 = field2617;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2613 = -1;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2631 = 0;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[I")
    public static int[] field2629 = new int[128];

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public int field2618;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lbe;")
    public class12 field2620;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lbe;")
    public class12 field2624;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lbe;")
    public class12 field2628;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lla;")
    public static class66 field2622;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Z", line = 23)
    public static final boolean method774(boolean arg0) {
        field2635++;
        if (class1.field47 == null) {
            return false;
        }
        try {
            int var1 = class1.field47.method637(1);
            if (var1 == 0) {
                return false;
            }
            if (class90.field2336 == -1) {
                class1.field47.method642(-24993, 1, 0, class99.field2502.field3074);
                class99.field2502.field3047 = 0;
                class90.field2336 = class99.field2502.method320(-102);
                var1--;
                class95.field2443 = class10.field266[class90.field2336];
            }
            if (class95.field2443 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class1.field47.method642(-24993, 1, 0, class99.field2502.field3074);
                class95.field2443 = class99.field2502.field3074[0] & 0xFF;
                var1--;
            }
            if (class95.field2443 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class1.field47.method642(-24993, 2, 0, class99.field2502.field3074);
                var1 -= 2;
                class99.field2502.field3047 = 0;
                class95.field2443 = class99.field2502.method938((byte) 98);
            }
            if (var1 < class95.field2443) {
                return false;
            }
            class99.field2502.field3047 = 0;
            class1.field47.method642(-24993, class95.field2443, 0, class99.field2502.field3074);
            class90.field2338 = class90.field2335;
            class90.field2335 = class13.field320;
            class13.field320 = class90.field2336;
            class76.field1841 = 0;
            if (class90.field2336 == 53) {
                long var2 = class99.field2502.method918((byte) 1);
                class94 var4 = class67.method504(-127, class99.field2502).method714((byte) -85);
                class41.method311(6, class120.method900(var2, 0).method707(-14211), (byte) 77, var4);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 230) {
                int var5 = class99.field2502.method943(-1025);
                int var6 = class99.field2502.method943(-1025);
                int var7 = class99.field2502.method943(-1025);
                int var8 = class99.field2502.method943(-1025);
                class17.field443[var5] = true;
                class13.field314[var5] = var6;
                class136.field3341[var5] = var7;
                class97.field2475[var5] = var8;
                class43.field1087[var5] = 0;
                class90.field2336 = -1;
                return true;
            }
            if (arg0) {
                method777(false);
            }
            if (class90.field2336 == 237) {
                class92.field2361 = class99.field2502.method963(-15850);
                class135.field3323 = true;
                class121.field3033 = true;
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 161) {
                int var9 = class99.field2502.method961(-110);
                if (var9 == 65535) {
                    var9 = -1;
                }
                class97.method736(var9, (byte) -74);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 146) {
                int var10 = class99.field2502.method946(98);
                int var11 = class99.field2502.method938((byte) -116);
                if (var11 == 65535) {
                    var11 = -1;
                }
                class120.method907(var10, var11, (byte) 52);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 209) {
                int var12 = class99.field2502.method952(arg0);
                int var13 = class99.field2502.method921((byte) -95);
                class77 var14 = class63.method466((byte) -38, var12);
                var14.field1969 = 2;
                class90.field2336 = -1;
                var14.field1893 = var13;
                return true;
            }
            if (class90.field2336 == 206) {
                int var15 = class99.field2502.method938((byte) 97);
                int var16 = class99.field2502.method941(-957401312);
                class86.method634(-1, var15);
                if (var16 != -1) {
                    class86.method634(-1, var16);
                }
                if (class103.field2603 != -1) {
                    class52.method412(class103.field2603, (byte) -22);
                    class103.field2603 = -1;
                }
                if (class45.field1108 != -1) {
                    class52.method412(class45.field1108, (byte) -22);
                    class45.field1108 = -1;
                }
                if (class115.field2925 != -1) {
                    class52.method412(class115.field2925, (byte) -22);
                    class115.field2925 = -1;
                }
                if (class77.field1962 != var15) {
                    class52.method412(class77.field1962, (byte) -22);
                    class77.field1962 = var15;
                    class1.method6(false, 35);
                }
                if (class111.field2806 != var15) {
                    class52.method412(class111.field2806, (byte) -22);
                    class111.field2806 = var16;
                }
                class111.field2809 = -1;
                class110.field2741 = 0;
                class54.method430(class77.field1962, true);
                class54.method430(class111.field2806, true);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 3) {
                boolean var17 = class99.field2502.method942(false) == 1;
                int var18 = class99.field2502.method952(arg0);
                class77 var19 = class63.method466((byte) -38, var18);
                var19.field1897 = var17;
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 249) {
                class12.field312 = class99.field2502.method961(-86) * 30;
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 137) {
                class89.field2322 = class95.field2443 / 8;
                for (int var20 = 0; var20 < class89.field2322; var20++) {
                    class79.field2009[var20] = class99.field2502.method918((byte) 1);
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 114) {
                int var21 = class99.field2502.method920((byte) 60);
                if (class75.field1837 != var21) {
                    class52.method412(class75.field1837, (byte) -22);
                    class75.field1837 = var21;
                }
                class73.field1781 = true;
                class54.method430(class75.field1837, true);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 76) {
                class101.field2559 = true;
                class30.field847 = class99.field2502.method943(-1025);
                class14.field362 = class99.field2502.method943(-1025);
                class6.field129 = class99.field2502.method938((byte) 13);
                class107.field2666 = class99.field2502.method943(-1025);
                class38.field994 = class99.field2502.method943(-1025);
                if (class38.field994 >= 100) {
                    int var22 = class30.field847 * 128 + 64;
                    int var23 = class14.field362 * 128 + 64;
                    int var24 = class25.method226(class64.field1589, var23, var22, (byte) -56) - class6.field129;
                    int var25 = var22 - class20.field553;
                    int var26 = var24 - class103.field2596;
                    int var27 = var23 - field2615;
                    int var28 = (int) Math.sqrt((double) (var25 * var25 + var27 * var27));
                    class87.field2207 = (int) (Math.atan2((double) var26, (double) var28) * 325.949D) & 0x7FF;
                    class55.field1413 = (int) (-325.949D * Math.atan2((double) var25, (double) var27)) & 0x7FF;
                    if (class87.field2207 < 128) {
                        class87.field2207 = 128;
                    }
                    if (class87.field2207 > 383) {
                        class87.field2207 = 383;
                    }
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 155) {
                int var29 = class99.field2502.method928(true);
                class77 var30 = class63.method466((byte) -38, var29);
                for (int var31 = 0; var31 < var30.field1869.length; var31++) {
                    var30.field1869[var31] = -1;
                    var30.field1869[var31] = 0;
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 84) {
                int var32 = class99.field2502.method938((byte) -105);
                int var33 = class99.field2502.method952(false);
                int var34 = var32 >> 10 & 0x1F;
                int var35 = var32 >> 5 & 0x1F;
                int var36 = var32 & 0x1F;
                class77 var37 = class63.method466((byte) -38, var33);
                var37.field1876 = (var36 << 3) + (var34 << 19) + (var35 << 11);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 95) {
                for (int var38 = 0; var38 < class28.field801; var38++) {
                    class101 var39 = class95.method730(43, var38);
                    if (var39 != null && var39.field2545 == 0) {
                        class126.field3180[var38] = 0;
                        class37.field953[var38] = 0;
                    }
                }
                class135.field3323 = true;
                class90.field2336 = -1;
                if (class75.field1837 != -1) {
                    class73.field1781 = true;
                }
                return true;
            }
            if (class90.field2336 == 18 || class90.field2336 == 112 || class90.field2336 == 12 || class90.field2336 == 179 || class90.field2336 == 122 || class90.field2336 == 251 || class90.field2336 == 169 || class90.field2336 == 205 || class90.field2336 == 31 || class90.field2336 == 92 || class90.field2336 == 212) {
                class75.method556(false);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 235) {
                if (class115.field2925 != -1) {
                    class52.method412(class115.field2925, (byte) -22);
                    class115.field2925 = -1;
                }
                class8.field232 = class8.field230;
                class79.field1995 = false;
                class73.field1781 = true;
                class90.field2336 = -1;
                class110.field2741 = 2;
                return true;
            }
            if (class90.field2336 == 128) {
                if (class92.field2361 == 12) {
                    class135.field3323 = true;
                }
                client.field487 = class99.field2502.method957(1);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 1) {
                int var40 = class99.field2502.method942(arg0);
                int var41 = class99.field2502.method938((byte) 79);
                if (var41 == 65535) {
                    var41 = -1;
                }
                if (class42.field1065[var40] != var41) {
                    class52.method412(class42.field1065[var40], (byte) -22);
                    class42.field1065[var40] = var41;
                }
                class121.field3033 = true;
                class135.field3323 = true;
                class54.method430(class42.field1065[var40], true);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 224) {
                class94.method688(0);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 63) {
                int var42 = class99.field2502.method952(false);
                class77 var43 = class63.method466((byte) -38, var42);
                var43.field1969 = 3;
                var43.field1893 = class80.field2044.field2299.method526(27721);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 170) {
                class101.field2559 = false;
                for (int var44 = 0; var44 < 5; var44++) {
                    class17.field443[var44] = false;
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 178) {
                int var45 = class99.field2502.method961(-83);
                int var46 = class99.field2502.method953((byte) -125);
                int var47 = class99.field2502.method921((byte) -84);
                int var48 = class99.field2502.method938((byte) -107);
                class77 var49 = class63.method466((byte) -38, var46);
                var49.field1948 = var48;
                class90.field2336 = -1;
                var49.field1892 = var45;
                var49.field1875 = var47;
                return true;
            }
            if (class90.field2336 == 34) {
                class94.method712(false, true);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 115) {
                int var50 = class99.field2502.method920((byte) 61);
                if (var50 >= 0) {
                    class86.method634(-1, var50);
                }
                if (class55.field1384 != var50) {
                    class52.method412(class55.field1384, (byte) -22);
                    class55.field1384 = var50;
                }
                class54.method430(class55.field1384, true);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 98) {
                class90.field2336 = -1;
                class14.field355 = 0;
                return true;
            }
            if (class90.field2336 == 11) {
                int var51 = class99.field2502.method957(1);
                int var52 = class99.field2502.method953((byte) -125);
                int var53 = class99.field2502.method920((byte) 78);
                class77 var54 = class63.method466((byte) -38, var52);
                var54.field1961 = var54.field1908 + var53;
                class90.field2336 = -1;
                var54.field1878 = var54.field1889 + var51;
                return true;
            }
            if (class90.field2336 == 65) {
                class97.field2473 = class99.field2502.method943(-1025);
                class102.field2569 = class99.field2502.method943(-1025);
                class2.field58 = class99.field2502.method943(-1025);
                class90.field2336 = -1;
                class73.field1781 = true;
                class2.field54 = true;
                return true;
            }
            if (class90.field2336 == 19) {
                int var55 = class99.field2502.method928(true);
                int var56 = class99.field2502.method961(-116);
                class77 var57 = class63.method466((byte) -38, var55);
                var57.field1969 = 1;
                class90.field2336 = -1;
                var57.field1893 = var56;
                return true;
            }
            if (class90.field2336 == 225) {
                int var58 = class99.field2502.method941(-957401312);
                if (var58 == 65535) {
                    var58 = -1;
                }
                int var59 = class99.field2502.method928(!arg0);
                int var60 = class99.field2502.method928(true);
                class77 var61 = class63.method466((byte) -38, var59);
                if (var61.field1895) {
                    var61.field1956 = var58;
                    var61.field1883 = var60;
                } else if (var58 == -1) {
                    class90.field2336 = -1;
                    var61.field1969 = 0;
                    return true;
                } else {
                    class110 var62 = class39.method295(var58, 1);
                    var61.field1875 = var62.field2744;
                    var61.field1969 = 4;
                    var61.field1948 = var62.field2716 * 100 / var60;
                    var61.field1892 = var62.field2718;
                    var61.field1893 = var58;
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 202) {
                class66.field1629 = class99.field2502.method942(arg0);
                class90.field2336 = -1;
                if (class92.field2361 == class66.field1629) {
                    class135.field3323 = true;
                    if (class66.field1629 == 3) {
                        class92.field2361 = 1;
                    } else {
                        class92.field2361 = 3;
                    }
                }
                return true;
            }
            if (class90.field2336 == 94) {
                class135.field3323 = true;
                int var63 = class99.field2502.method952(false);
                int var64 = class99.field2502.method938((byte) 39);
                class77 var65;
                if (var63 < 0) {
                    var65 = null;
                } else {
                    var65 = class63.method466((byte) -38, var63);
                }
                if (var65 != null) {
                    for (int var66 = 0; var66 < var65.field1869.length; var66++) {
                        var65.field1869[var66] = 0;
                        var65.field1919[var66] = 0;
                    }
                }
                class97.method739(var64, -1);
                int var67 = class99.field2502.method938((byte) 13);
                for (int var68 = 0; var68 < var67; var68++) {
                    int var69 = class99.field2502.method961(-123);
                    int var70 = class99.field2502.method958((byte) -112);
                    if (var70 == 255) {
                        var70 = class99.field2502.method953((byte) -125);
                    }
                    if (var65 != null && var68 < var65.field1869.length) {
                        var65.field1869[var68] = var69;
                        var65.field1919[var68] = var70;
                    }
                    class136.method1069(var69 - 1, var64, var68, arg0, var70);
                }
                class90.field2336 = -1;
                class92.field2352 = class26.field699;
                return true;
            }
            if (class90.field2336 == 186) {
                int var71 = class99.field2502.method961(-112);
                class86.method634(-1, var71);
                if (class115.field2925 != -1) {
                    class52.method412(class115.field2925, (byte) -22);
                    class115.field2925 = -1;
                    class73.field1781 = true;
                }
                if (class77.field1962 != -1) {
                    class52.method412(class77.field1962, (byte) -22);
                    class77.field1962 = -1;
                    class1.method6(false, 30);
                }
                if (class111.field2806 != -1) {
                    class52.method412(class111.field2806, (byte) -22);
                    class111.field2806 = -1;
                }
                if (class103.field2603 != -1) {
                    class52.method412(class103.field2603, (byte) -22);
                    class103.field2603 = -1;
                }
                if (class45.field1108 != var71) {
                    class52.method412(class45.field1108, (byte) -22);
                    class45.field1108 = var71;
                }
                class111.field2809 = -1;
                class135.field3323 = true;
                class121.field3033 = true;
                if (class110.field2741 != 0) {
                    class73.field1781 = true;
                    class110.field2741 = 0;
                }
                class54.method430(class45.field1108, true);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 125) {
                int var72 = class99.field2502.method961(-81);
                byte var73 = class99.field2502.method915(-49);
                class126.field3180[var72] = var73;
                if (class37.field953[var72] != var73) {
                    class37.field953[var72] = var73;
                    class50.method402(125, var72);
                    class135.field3323 = true;
                    if (class75.field1837 != -1) {
                        class73.field1781 = true;
                    }
                }
                class90.field2336 = -1;
                class85.field2133 = class26.field699;
                return true;
            }
            if (class90.field2336 == 17) {
                int var74 = class99.field2502.method921((byte) -70);
                class63.method477(var74, false);
                class92.field2352 = class26.field699;
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 90) {
                class79.method585(-3761);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 141) {
                for (int var75 = 0; var75 < class85.field2138.length; var75++) {
                    if (class85.field2138[var75] != null) {
                        class85.field2138[var75].field210 = -1;
                    }
                }
                for (int var76 = 0; var76 < class28.field803.length; var76++) {
                    if (class28.field803[var76] != null) {
                        class28.field803[var76].field210 = -1;
                    }
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 60) {
                class94.method712(true, true);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 75) {
                class30.method261(class112.field2832, class99.field2502, class95.field2443, 10348);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 215) {
                for (int var77 = 0; var77 < class37.field953.length; var77++) {
                    if (class37.field953[var77] != class126.field3180[var77]) {
                        class37.field953[var77] = class126.field3180[var77];
                        class50.method402(126, var77);
                        class135.field3323 = true;
                    }
                }
                class85.field2133 = class26.field699;
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 88) {
                class94 var78 = class99.field2502.method937(1);
                int var79 = class99.field2502.method928(true);
                class77 var80 = class63.method466((byte) -38, var79);
                var80.field1905 = var78;
                if (var79 >> 16 == class42.field1065[class92.field2361]) {
                    class135.field3323 = true;
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 242) {
                class76.method564(false);
                class90.field2336 = -1;
                return false;
            }
            if (class90.field2336 == 160) {
                class52.field1303 = class99.field2502.method943(-1025);
                class90.field2336 = -1;
                class135.field3323 = true;
                return true;
            }
            if (class90.field2336 == 30) {
                class73.field1796 = class99.field2502.method921((byte) -120);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 13) {
                class134.field3262 = class99.field2502.method943(-1025);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 37) {
                long var81 = class99.field2502.method918((byte) 1);
                int var83 = class99.field2502.method938((byte) 92);
                class94 var84 = class120.method900(var81, 0).method707(-14211);
                for (int var85 = 0; var85 < class77.field1963; var85++) {
                    if (class10.field265[var85] == var81) {
                        if (class72.field1723[var85] != var83) {
                            class72.field1723[var85] = var83;
                            class135.field3323 = true;
                            if (var83 > 0) {
                                class41.method311(5, class8.field230, (byte) 86, class4.method20(new class94[] { var84, class95.field2451 }, true));
                            }
                            if (var83 == 0) {
                                class41.method311(5, class8.field230, (byte) 64, class4.method20(new class94[] { var84, class19.field510 }, true));
                            }
                        }
                        var84 = null;
                        break;
                    }
                }
                if (var84 != null && class77.field1963 < 200) {
                    class10.field265[class77.field1963] = var81;
                    class120.field3008[class77.field1963] = var84;
                    class72.field1723[class77.field1963] = var83;
                    class135.field3323 = true;
                    class77.field1963++;
                }
                boolean var86 = false;
                while (!var86) {
                    var86 = true;
                    for (int var87 = 0; var87 < class77.field1963 - 1; var87++) {
                        if (class72.field1723[var87] != class1.field36 && class72.field1723[var87 + 1] == class1.field36 || class72.field1723[var87] == 0 && class72.field1723[var87 + 1] != 0) {
                            int var88 = class72.field1723[var87];
                            class72.field1723[var87] = class72.field1723[var87 + 1];
                            var86 = false;
                            class72.field1723[var87 + 1] = var88;
                            class94 var89 = class120.field3008[var87];
                            class120.field3008[var87] = class120.field3008[var87 + 1];
                            class120.field3008[var87 + 1] = var89;
                            long var90 = class10.field265[var87];
                            class10.field265[var87] = class10.field265[var87 + 1];
                            class10.field265[var87 + 1] = var90;
                            class135.field3323 = true;
                        }
                    }
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 139) {
                if (class115.field2925 != -1) {
                    class52.method412(class115.field2925, (byte) -22);
                    class115.field2925 = -1;
                }
                class110.field2741 = 1;
                class8.field232 = class8.field230;
                class90.field2336 = -1;
                class79.field1995 = false;
                class73.field1781 = true;
                return true;
            }
            if (class90.field2336 == 218) {
                int var92 = class99.field2502.method938((byte) -91);
                int var93 = class99.field2502.method953((byte) -125);
                int var94 = class99.field2502.method941(-957401312);
                class77 var95 = class63.method466((byte) -38, var93);
                class90.field2336 = -1;
                var95.field1966 = (var94 << 16) + var92;
                return true;
            }
            if (class90.field2336 == 172) {
                class123.field3121 = class99.field2502.method943(-1025);
                class126.field3164 = class99.field2502.method942(false);
                for (int var96 = class126.field3164; var96 < class126.field3164 + 8; var96++) {
                    for (int var97 = class123.field3121; var97 < class123.field3121 + 8; var97++) {
                        if (class9.field243[class64.field1589][var96][var97] != null) {
                            class9.field243[class64.field1589][var96][var97] = null;
                            class90.method673(7928, var97, var96);
                        }
                    }
                }
                for (class37 var98 = (class37) class39.field1007.method895(-14156); var98 != null; var98 = (class37) class39.field1007.method893(true)) {
                    if (class126.field3164 <= var98.field967 && class126.field3164 + 8 > var98.field967 && class123.field3121 <= var98.field962 && class123.field3121 + 8 > var98.field962 && class64.field1589 == var98.field952) {
                        var98.field963 = 0;
                    }
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 39) {
                class94 var99 = class99.field2502.method937(1);
                if (var99.method722(class89.field2300, (byte) 112)) {
                    class94 var100 = var99.method706(var99.method711(-34, class54.field1369), (byte) 116, 0);
                    boolean var101 = false;
                    long var102 = var100.method709((byte) 53);
                    for (int var104 = 0; var104 < class89.field2322; var104++) {
                        if (class79.field2009[var104] == var102) {
                            var101 = true;
                            break;
                        }
                    }
                    if (!var101 && class54.field1327 == 0) {
                        class41.method311(4, var100, (byte) 67, class100.field2540);
                    }
                } else if (var99.method722(class119.field2965, (byte) 112)) {
                    boolean var105 = false;
                    class94 var106 = var99.method706(var99.method711(-34, class54.field1369), (byte) 116, 0);
                    long var107 = var106.method709((byte) 114);
                    for (int var109 = 0; var109 < class89.field2322; var109++) {
                        if (class79.field2009[var109] == var107) {
                            var105 = true;
                            break;
                        }
                    }
                    if (!var105 && class54.field1327 == 0) {
                        class41.method311(8, var106, (byte) 84, class102.field2587);
                    }
                } else if (var99.method722(class85.field2146, (byte) 112)) {
                    class94 var110 = var99.method706(var99.method711(-34, class54.field1369), (byte) 116, 0);
                    long var111 = var110.method709((byte) 60);
                    boolean var113 = false;
                    for (int var114 = 0; var114 < class89.field2322; var114++) {
                        if (class79.field2009[var114] == var111) {
                            var113 = true;
                            break;
                        }
                    }
                    if (!var113 && class54.field1327 == 0) {
                        class94 var115 = var99.method706(var99.method710(-123) - 9, (byte) 116, var99.method711(-34, class54.field1369) + 1);
                        class41.method311(8, var110, (byte) 112, var115);
                    }
                } else {
                    class41.method311(0, class8.field230, (byte) 117, var99);
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 180) {
                class135.field3323 = true;
                int var116 = class99.field2502.method952(arg0);
                int var117 = class99.field2502.method938((byte) -109);
                class77 var118;
                if (var116 >= 0) {
                    var118 = class63.method466((byte) -38, var116);
                } else {
                    var118 = null;
                }
                while (class99.field2502.field3047 < class95.field2443) {
                    int var119 = class99.field2502.method948(-64);
                    int var120 = 0;
                    int var121 = class99.field2502.method938((byte) -99);
                    if (var121 != 0) {
                        var120 = class99.field2502.method943(-1025);
                        if (var120 == 255) {
                            var120 = class99.field2502.method952(false);
                        }
                    }
                    if (var118 != null && var119 >= 0 && var119 < var118.field1869.length) {
                        var118.field1869[var119] = var121;
                        var118.field1919[var119] = var120;
                    }
                    class136.method1069(var121 - 1, var117, var119, false, var120);
                }
                class90.field2336 = -1;
                class92.field2352 = class26.field699;
                return true;
            }
            if (class90.field2336 == 102) {
                int var122 = class99.field2502.method938((byte) 79);
                int var123 = class99.field2502.method952(arg0);
                class77 var124 = class63.method466((byte) -38, var123);
                class90.field2336 = -1;
                if (var124 != null && var124.field1917 == 0) {
                    if (var122 < 0) {
                        var122 = 0;
                    }
                    if (var122 > var124.field1866 - var124.field1967) {
                        var122 = var124.field1866 - var124.field1967;
                    }
                    var124.field1915 = var122;
                }
                return true;
            }
            if (class90.field2336 == 82) {
                int var125 = class99.field2502.method938((byte) 18);
                class86.method634(-1, var125);
                if (class45.field1108 != -1) {
                    class52.method412(class45.field1108, (byte) -22);
                    class121.field3033 = true;
                    class45.field1108 = -1;
                    class135.field3323 = true;
                }
                if (class77.field1962 != -1) {
                    class52.method412(class77.field1962, (byte) -22);
                    class77.field1962 = -1;
                    class1.method6(false, 30);
                }
                if (class111.field2806 != -1) {
                    class52.method412(class111.field2806, (byte) -22);
                    class111.field2806 = -1;
                }
                if (class103.field2603 != -1) {
                    class52.method412(class103.field2603, (byte) -22);
                    class103.field2603 = -1;
                }
                if (class115.field2925 != var125) {
                    class52.method412(class115.field2925, (byte) -22);
                    class115.field2925 = var125;
                }
                class111.field2809 = -1;
                class54.method430(class115.field2925, true);
                class90.field2336 = -1;
                class73.field1781 = true;
                return true;
            }
            if (class90.field2336 == 105) {
                int var126 = class99.field2502.method961(-113);
                int var127 = class99.field2502.method928(true);
                class126.field3180[var126] = var127;
                if (class37.field953[var126] != var127) {
                    class37.field953[var126] = var127;
                    class50.method402(118, var126);
                    if (class75.field1837 != -1) {
                        class73.field1781 = true;
                    }
                    class135.field3323 = true;
                }
                class85.field2133 = class26.field699;
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 69) {
                int var128 = class99.field2502.method966(13800);
                int var129 = class99.field2502.method928(true);
                class77 var130 = class63.method466((byte) -38, var129);
                if (var130.field1931 != var128 || var128 == -1) {
                    var130.field1931 = var128;
                    var130.field1941 = 0;
                    var130.field1904 = 0;
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 231) {
                long var131 = class99.field2502.method918((byte) 1);
                long var133 = (long) class99.field2502.method938((byte) 66);
                long var135 = (long) class99.field2502.method935((byte) -128);
                int var137 = class99.field2502.method943(-1025);
                long var138 = (var133 << 32) + var135;
                boolean var140 = false;
                for (int var141 = 0; var141 < 100; var141++) {
                    if (class126.field3169[var141] == var138) {
                        var140 = true;
                        break;
                    }
                }
                if (var137 <= 1) {
                    for (int var142 = 0; var142 < class89.field2322; var142++) {
                        if (class79.field2009[var142] == var131) {
                            var140 = true;
                            break;
                        }
                    }
                }
                if (!var140 && class54.field1327 == 0) {
                    class126.field3169[class117.field2941] = var138;
                    class117.field2941 = (class117.field2941 + 1) % 100;
                    class94 var143 = class67.method504(-125, class99.field2502).method714((byte) 104);
                    if (var137 == 2 || var137 == 3) {
                        class41.method311(7, class4.method20(new class94[] { class46.field1122, class120.method900(var131, 0).method707(-14211) }, true), (byte) 86, var143);
                    } else if (var137 == 1) {
                        class41.method311(7, class4.method20(new class94[] { class17.field445, class120.method900(var131, 0).method707(-14211) }, true), (byte) 95, var143);
                    } else {
                        class41.method311(3, class120.method900(var131, 0).method707(-14211), (byte) 103, var143);
                    }
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 203) {
                int var144 = class99.field2502.method961(-71);
                class86.method634(-1, var144);
                if (class45.field1108 != -1) {
                    class52.method412(class45.field1108, (byte) -22);
                    class121.field3033 = true;
                    class45.field1108 = -1;
                    class135.field3323 = true;
                }
                if (class115.field2925 != -1) {
                    class52.method412(class115.field2925, (byte) -22);
                    class115.field2925 = -1;
                    class73.field1781 = true;
                }
                if (class77.field1962 != -1) {
                    class52.method412(class77.field1962, (byte) -22);
                    class77.field1962 = -1;
                    class1.method6(false, 30);
                }
                if (class111.field2806 != -1) {
                    class52.method412(class111.field2806, (byte) -22);
                    class111.field2806 = -1;
                }
                if (class103.field2603 != var144) {
                    class52.method412(class103.field2603, (byte) -22);
                    class103.field2603 = var144;
                }
                class111.field2809 = -1;
                if (class110.field2741 != 0) {
                    class73.field1781 = true;
                    class110.field2741 = 0;
                }
                class54.method430(class103.field2603, true);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 45) {
                class123.field3121 = class99.field2502.method943(-1025);
                class126.field3164 = class99.field2502.method942(false);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 152) {
                class135.field3323 = true;
                int var145 = class99.field2502.method942(false);
                int var146 = class99.field2502.method925(29943);
                int var147 = class99.field2502.method942(false);
                class73.field1787[var145] = var146;
                class4.field81[var145] = var147;
                class123.field3132[var145] = 1;
                for (int var148 = 0; var148 < 98; var148++) {
                    if (var146 >= class12.field294[var148]) {
                        class123.field3132[var145] = var148 + 2;
                    }
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 44) {
                int var149 = class99.field2502.method941(-957401312);
                int var150 = class99.field2502.method961(-86);
                if (class115.field2925 != -1) {
                    class52.method412(class115.field2925, (byte) -22);
                    class115.field2925 = -1;
                    class73.field1781 = true;
                }
                if (class77.field1962 != -1) {
                    class52.method412(class77.field1962, (byte) -22);
                    class77.field1962 = -1;
                    class1.method6(false, 30);
                }
                if (class111.field2806 != -1) {
                    class52.method412(class111.field2806, (byte) -22);
                    class111.field2806 = -1;
                }
                if (class103.field2603 != var150) {
                    class52.method412(class103.field2603, (byte) -22);
                    class103.field2603 = var150;
                }
                if (class45.field1108 != var149) {
                    class52.method412(class45.field1108, (byte) -22);
                    class45.field1108 = var149;
                }
                if (class110.field2741 != 0) {
                    class73.field1781 = true;
                    class110.field2741 = 0;
                }
                class111.field2809 = -1;
                class121.field3033 = true;
                class135.field3323 = true;
                class54.method430(class103.field2603, true);
                class54.method430(class45.field1108, true);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 52) {
                class25.field691 = class99.field2502.method943(-1025);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 189) {
                int var151 = class99.field2502.method942(false);
                int var152 = class99.field2502.method943(-1025);
                int var153 = class99.field2502.method943(-1025);
                class64.field1589 = var153 >> 1;
                class80.field2044.method46((var153 & 0x1) == 1, var152, 0, var151);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 239) {
                int var154 = class99.field2502.method963(-15850);
                class94 var155 = class99.field2502.method937(1);
                int var156 = class99.field2502.method943(-1025);
                if (var156 >= 1 && var156 <= 5) {
                    if (var155.method692(class8.field175, (byte) -38)) {
                        var155 = null;
                    }
                    class9.field248[var156 - 1] = var155;
                    class110.field2702[var156 - 1] = var154 == 0;
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 220) {
                if (class92.field2361 == 12) {
                    class135.field3323 = true;
                }
                class135.field3312 = class99.field2502.method943(-1025);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 49) {
                int var157 = class99.field2502.method938((byte) -86);
                int var158 = class99.field2502.method943(-1025);
                int var159 = class99.field2502.method938((byte) -105);
                class40.method305(var157, 0, var158, var159);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 89) {
                int var160 = class99.field2502.method925(29943);
                class12.field309 = class112.field2832.method64(var160, 10954);
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 40) {
                class101.field2559 = true;
                class55.field1387 = class99.field2502.method943(-1025);
                class84.field2122 = class99.field2502.method943(-1025);
                class20.field534 = class99.field2502.method938((byte) -103);
                class66.field1616 = class99.field2502.method943(-1025);
                class126.field3158 = class99.field2502.method943(-1025);
                if (class126.field3158 >= 100) {
                    class20.field553 = class55.field1387 * 128 + 64;
                    field2615 = class84.field2122 * 128 + 64;
                    class103.field2596 = class25.method226(class64.field1589, field2615, class20.field553, (byte) -45) - class20.field534;
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 91) {
                class103.field2605 = class99.field2502.method943(-1025);
                if (class103.field2605 == 1) {
                    class95.field2438 = class99.field2502.method938((byte) 86);
                }
                if (class103.field2605 >= 2 && class103.field2605 <= 6) {
                    if (class103.field2605 == 2) {
                        class21.field582 = 64;
                        class23.field594 = 64;
                    }
                    if (class103.field2605 == 3) {
                        class23.field594 = 64;
                        class21.field582 = 0;
                    }
                    if (class103.field2605 == 4) {
                        class23.field594 = 64;
                        class21.field582 = 128;
                    }
                    if (class103.field2605 == 5) {
                        class23.field594 = 0;
                        class21.field582 = 64;
                    }
                    if (class103.field2605 == 6) {
                        class21.field582 = 64;
                        class23.field594 = 128;
                    }
                    class103.field2605 = 2;
                    class90.field2346 = class99.field2502.method938((byte) 60);
                    class43.field1078 = class99.field2502.method938((byte) -110);
                    class113.field2888 = class99.field2502.method943(-1025);
                }
                if (class103.field2605 == 10) {
                    class17.field424 = class99.field2502.method938((byte) -105);
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 43) {
                class123.field3121 = class99.field2502.method958((byte) -103);
                class126.field3164 = class99.field2502.method958((byte) -119);
                while (class99.field2502.field3047 < class95.field2443) {
                    class90.field2336 = class99.field2502.method943(-1025);
                    class75.method556(false);
                }
                class90.field2336 = -1;
                return true;
            }
            if (class90.field2336 == 38) {
                if (class45.field1108 != -1) {
                    class52.method412(class45.field1108, (byte) -22);
                    class45.field1108 = -1;
                    class121.field3033 = true;
                    class135.field3323 = true;
                }
                if (class115.field2925 != -1) {
                    class52.method412(class115.field2925, (byte) -22);
                    class73.field1781 = true;
                    class115.field2925 = -1;
                }
                if (class77.field1962 != -1) {
                    class52.method412(class77.field1962, (byte) -22);
                    class77.field1962 = -1;
                    class1.method6(false, 30);
                }
                if (class111.field2806 != -1) {
                    class52.method412(class111.field2806, (byte) -22);
                    class111.field2806 = -1;
                }
                if (class103.field2603 != -1) {
                    class52.method412(class103.field2603, (byte) -22);
                    class103.field2603 = -1;
                }
                if (class110.field2741 != 0) {
                    class73.field1781 = true;
                    class110.field2741 = 0;
                }
                class90.field2336 = -1;
                class111.field2809 = -1;
                return true;
            }
            class81.method607("T1 - " + class90.field2336 + "," + class90.field2335 + "," + class90.field2338 + " - " + class95.field2443, null, (byte) 106);
            class76.method564(false);
        } catch (IOException var164) {
            class28.method248(-8455);
        } catch (Exception var165) {
            String var162 = "T2 - " + class90.field2336 + "," + class90.field2335 + "," + class90.field2338 + " - " + class95.field2443 + "," + (class80.field2044.field165[0] + class31.field891) + "," + (class45.field1117 + class80.field2044.field219[0]) + " - ";
            for (int var163 = 0; class95.field2443 > var163 && var163 < 50; var163++) {
                var162 = var162 + class99.field2502.field3074[var163] + ",";
            }
            class81.method607(var162, var165, (byte) 72);
            class76.method564(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)V", line = 1852)
    public static final void method775(int arg0, boolean arg1) {
        field2632++;
        int[] var2 = class89.field2292.field2933;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class108.field2679[arg0][var21][var5] & 0x18) == 0) {
                    class64.field1585.method204(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class108.field2679[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class64.field1585.method204(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 228;
        class89.field2292.method875();
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        if (!arg1) {
            return;
        }
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class108.field2679[arg0][var19][var8] & 0x18) == 0) {
                    class40.method304(arg0, var8, var7, -72, var6, var19);
                }
                if (arg0 < 3 && (class108.field2679[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class40.method304(arg0 + 1, var8, var7, -114, var6, var19);
                }
            }
        }
        class67.field1641 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class64.field1585.method198(class64.field1589, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class55.method440(var12, (byte) 76).field716;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class12.field311[class64.field1589].field2269;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var9 - 3 < var14 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var10 + 3 > var15 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class62.field1521[class67.field1641] = class41.field1044[var13];
                        class29.field845[class67.field1641] = var14;
                        class112.field2823[class67.field1641] = var15;
                        class67.field1641++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 2002)
    public static void method776(int arg0) {
        field2619 = null;
        field2630 = null;
        field2621 = null;
        field2625 = null;
        field2629 = null;
        field2611 = null;
        if (arg0 != -15552) {
            field2631 = 56;
        }
        field2634 = null;
        field2614 = null;
        field2622 = null;
        field2617 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 2032)
    public static final void method777(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class86.field2157 == 1) {
            if (class28.field788 >= 539 && class28.field788 <= 573 && class63.field1526 >= 169 && class63.field1526 < 205 && class42.field1065[0] != -1) {
                class121.field3033 = true;
                class92.field2361 = 0;
                class135.field3323 = true;
            }
            if (class28.field788 >= 569 && class28.field788 <= 599 && class63.field1526 >= 168 && class63.field1526 < 205 && class42.field1065[1] != -1) {
                class121.field3033 = true;
                class92.field2361 = 1;
                class135.field3323 = true;
            }
            if (class28.field788 >= 597 && class28.field788 <= 627 && class63.field1526 >= 168 && class63.field1526 < 205 && class42.field1065[2] != -1) {
                class121.field3033 = true;
                class92.field2361 = 2;
                class135.field3323 = true;
            }
            if (class28.field788 >= 625 && class28.field788 <= 669 && class63.field1526 >= 168 && class63.field1526 < 203 && class42.field1065[3] != -1) {
                class92.field2361 = 3;
                class121.field3033 = true;
                class135.field3323 = true;
            }
            if (class28.field788 >= 666 && class28.field788 <= 696 && class63.field1526 >= 168 && class63.field1526 < 205 && class42.field1065[4] != -1) {
                class135.field3323 = true;
                class121.field3033 = true;
                class92.field2361 = 4;
            }
            if (class28.field788 >= 694 && class28.field788 <= 724 && class63.field1526 >= 168 && class63.field1526 < 205 && class42.field1065[5] != -1) {
                class135.field3323 = true;
                class121.field3033 = true;
                class92.field2361 = 5;
            }
            if (class28.field788 >= 722 && class28.field788 <= 756 && class63.field1526 >= 169 && class63.field1526 < 205 && class42.field1065[6] != -1) {
                class121.field3033 = true;
                class135.field3323 = true;
                class92.field2361 = 6;
            }
            if (class28.field788 >= 540 && class28.field788 <= 574 && class63.field1526 >= 466 && class63.field1526 < 502 && class42.field1065[7] != -1) {
                class135.field3323 = true;
                class92.field2361 = 7;
                class121.field3033 = true;
            }
            if (class28.field788 >= 572 && class28.field788 <= 602 && class63.field1526 >= 466 && class63.field1526 < 503 && class42.field1065[8] != -1) {
                class92.field2361 = 8;
                class135.field3323 = true;
                class121.field3033 = true;
            }
            if (class28.field788 >= 599 && class28.field788 <= 629 && class63.field1526 >= 466 && class63.field1526 < 503 && class42.field1065[9] != -1) {
                class121.field3033 = true;
                class135.field3323 = true;
                class92.field2361 = 9;
            }
            if (class28.field788 >= 627 && class28.field788 <= 671 && class63.field1526 >= 467 && class63.field1526 < 502 && class42.field1065[10] != -1) {
                class121.field3033 = true;
                class135.field3323 = true;
                class92.field2361 = 10;
            }
            if (class28.field788 >= 669 && class28.field788 <= 699 && class63.field1526 >= 466 && class63.field1526 < 503 && class42.field1065[11] != -1) {
                class135.field3323 = true;
                class92.field2361 = 11;
                class121.field3033 = true;
            }
            if (class28.field788 >= 696 && class28.field788 <= 726 && class63.field1526 >= 466 && class63.field1526 < 503 && class42.field1065[12] != -1) {
                class121.field3033 = true;
                class92.field2361 = 12;
                class135.field3323 = true;
            }
            if (class28.field788 >= 724 && class28.field788 <= 758 && class63.field1526 >= 466 && class63.field1526 < 502 && class42.field1065[13] != -1) {
                class121.field3033 = true;
                class135.field3323 = true;
                class92.field2361 = 13;
            }
        }
        field2623++;
    }
}
