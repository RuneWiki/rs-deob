import java.awt.Component;
import java.math.BigInteger;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class31 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lod;")
    public static class101 field792 = class46.method335(-108, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field797 = 0;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lod;")
    public static class101 field805 = class46.method335(-128, "::rect_debug");

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field801 = 0;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field794 = 0;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lod;")
    private static class101 field803 = class46.method335(78, "Location");

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lod;")
    public static class101 field793 = field803;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field798 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lod;")
    private static class101 field806 = class46.method335(78, "slide:");

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lod;")
    public static class101 field808 = class46.method335(-79, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lod;")
    private static class101 field809 = field806;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Lod;")
    public static class101 field807 = field806;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lrd;")
    public static class122 field800;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lt;")
    public static class132 field810;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLub;)V")
    public static final void method237(byte arg0, class141 arg1) {
        field799++;
        Object[] var2 = arg1.field3247;
        int var3 = (Integer) var2[0];
        class100 var4 = class93.method648(var3, arg0 ^ 0xFFFFFFB9);
        if (var4 == null) {
            return;
        }
        class112.field2397 = 0;
        int var5 = 0;
        byte var6 = -1;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var4.field2166;
        int[] var10 = var4.field2172;
        try {
            if (arg0 != -71) {
                field792 = null;
            }
            class153.field3485 = new class101[var4.field2159];
            class54.field1225 = new int[var4.field2169];
            int var11 = 0;
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var15 = (Integer) var2[var13];
                    if (var15 == -2147483647) {
                        var15 = arg1.field3250;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field3252;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field3238 == null ? -1 : arg1.field3238.field2780;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field3246;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field3238 == null ? -1 : arg1.field3238.field2807;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field3244 == null ? -1 : arg1.field3244.field2780;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field3244 == null ? -1 : arg1.field3244.field2807;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field3248;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field3256;
                    }
                    class54.field1225[var11++] = var15;
                } else if (var2[var13] instanceof class101) {
                    class101 var14 = (class101) var2[var13];
                    if (var14.method703(0, class135.field3088)) {
                        var14 = arg1.field3245;
                    }
                    class153.field3485[var12++] = var14;
                }
            }
            int var16 = 0;
            label1935: while (true) {
                var16++;
                if (var16 > 200000) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var269 = var10[var8];
                if (var269 < 100) {
                    if (var269 == 0) {
                        class127.field2885[var5++] = var9[var8];
                        continue;
                    }
                    if (var269 == 1) {
                        int var17 = var9[var8];
                        class127.field2885[var5++] = class63.field1388[var17];
                        continue;
                    }
                    if (var269 == 2) {
                        int var18 = var9[var8];
                        var5--;
                        class63.field1388[var18] = class127.field2885[var5];
                        continue;
                    }
                    if (var269 == 3) {
                        class65.field1486[var7++] = var4.field2171[var8];
                        continue;
                    }
                    if (var269 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var269 == 7) {
                        var5 -= 2;
                        if (class127.field2885[var5 + 1] != class127.field2885[var5]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var269 == 8) {
                        var5 -= 2;
                        if (class127.field2885[var5 + 1] == class127.field2885[var5]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var269 == 9) {
                        var5 -= 2;
                        if (class127.field2885[var5 + 1] > class127.field2885[var5]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var269 == 10) {
                        var5 -= 2;
                        if (class127.field2885[var5 + 1] < class127.field2885[var5]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var269 == 21) {
                        if (class112.field2397 == 0) {
                            return;
                        }
                        class2 var19 = class99.field2151[--class112.field2397];
                        var4 = var19.field36;
                        var10 = var4.field2172;
                        class153.field3485 = var19.field32;
                        var8 = var19.field30;
                        class54.field1225 = var19.field33;
                        var9 = var4.field2166;
                        continue;
                    }
                    if (var269 == 25) {
                        int var20 = var9[var8];
                        class127.field2885[var5++] = class73.method510(class39.method295(arg0, 85), var20);
                        continue;
                    }
                    if (var269 == 27) {
                        int var21 = var9[var8];
                        var5--;
                        class129.method998(var21, 57, class127.field2885[var5]);
                        continue;
                    }
                    if (var269 == 31) {
                        var5 -= 2;
                        if (class127.field2885[var5 + 1] >= class127.field2885[var5]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var269 == 32) {
                        var5 -= 2;
                        if (class127.field2885[var5 + 1] <= class127.field2885[var5]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var269 == 33) {
                        class127.field2885[var5++] = class54.field1225[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var269 == 34) {
                        var10001 = var9[var8];
                        var5--;
                        class54.field1225[var10001] = class127.field2885[var5];
                        continue;
                    }
                    if (var269 == 35) {
                        class65.field1486[var7++] = class153.field3485[var9[var8]];
                        continue;
                    }
                    if (var269 == 36) {
                        var10001 = var9[var8];
                        var7--;
                        class153.field3485[var10001] = class65.field1486[var7];
                        continue;
                    }
                    if (var269 == 37) {
                        int var22 = var9[var8];
                        var7 -= var22;
                        class101 var23 = class142.method1131(var22, class65.field1486, var7, (byte) 84);
                        class65.field1486[var7++] = var23;
                        continue;
                    }
                    if (var269 == 38) {
                        var5--;
                        continue;
                    }
                    if (var269 == 39) {
                        var7--;
                        continue;
                    }
                    if (var269 == 40) {
                        int var24 = var9[var8];
                        class100 var25 = class93.method648(var24, 0);
                        class101[] var26 = new class101[var25.field2159];
                        int[] var27 = new int[var25.field2169];
                        for (int var28 = 0; var28 < var25.field2157; var28++) {
                            var27[var28] = class127.field2885[var5 + var28 - var25.field2157];
                        }
                        for (int var29 = 0; var29 < var25.field2156; var29++) {
                            var26[var29] = class65.field1486[var29 + var7 - var25.field2156];
                        }
                        var5 -= var25.field2157;
                        var7 -= var25.field2156;
                        class2 var30 = new class2();
                        var30.field33 = class54.field1225;
                        var30.field36 = var4;
                        var30.field32 = class153.field3485;
                        var4 = var25;
                        var30.field30 = var8;
                        var8 = -1;
                        class99.field2151[class112.field2397++] = var30;
                        class54.field1225 = var27;
                        var9 = var25.field2166;
                        class153.field3485 = var26;
                        var10 = var25.field2172;
                        continue;
                    }
                    if (var269 == 42) {
                        class127.field2885[var5++] = class87.field1916[var9[var8]];
                        continue;
                    }
                    if (var269 == 43) {
                        var10001 = var9[var8];
                        var5--;
                        class87.field1916[var10001] = class127.field2885[var5];
                        continue;
                    }
                    if (var269 == 44) {
                        int var31 = var9[var8] >> 16;
                        int var32 = var9[var8] & 0xFFFF;
                        var5--;
                        int var33 = class127.field2885[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            class8.field126[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var33 <= var35) {
                                    continue label1935;
                                }
                                class20.field432[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var269 == 45) {
                        var5--;
                        int var36 = class127.field2885[var5];
                        int var37 = var9[var8];
                        if (var36 >= 0 && var36 < class8.field126[var37]) {
                            class127.field2885[var5++] = class20.field432[var37][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var269 == 46) {
                        var5 -= 2;
                        int var38 = var9[var8];
                        int var39 = class127.field2885[var5];
                        if (var39 >= 0 && var39 < class8.field126[var38]) {
                            class20.field432[var38][var39] = class127.field2885[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var269 == 47) {
                        class101 var40 = class156.field3597[var9[var8]];
                        if (var40 == null) {
                            var40 = class125.field2730;
                        }
                        class65.field1486[var7++] = var40;
                        continue;
                    }
                    if (var269 == 48) {
                        var10001 = var9[var8];
                        var7--;
                        class156.field3597[var10001] = class65.field1486[var7];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var8] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var269 < 1000) {
                    if (var269 == 100) {
                        var5 -= 3;
                        int var42 = class127.field2885[var5];
                        int var43 = class127.field2885[var5 + 1];
                        int var44 = class127.field2885[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class126 var45 = class78.method532(arg0 ^ 0xFFFFFFB9, var42);
                        if (var45.field2822 == null) {
                            var45.field2822 = new class126[var44 + 1];
                        }
                        if (var44 >= var45.field2822.length) {
                            class126[] var46 = new class126[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2822.length; var47++) {
                                var46[var47] = var45.field2822[var47];
                            }
                            var45.field2822 = var46;
                        }
                        if (var44 > 0 && var45.field2822[var44 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var44 - 1));
                        }
                        class126 var48 = new class126();
                        var48.field2782 = var43;
                        var48.field2788 = true;
                        var48.field2794 = var48.field2780 = var45.field2780;
                        var48.field2807 = var44;
                        var45.field2822[var44] = var48;
                        if (var41) {
                            class40.field968 = var48;
                        } else {
                            class1.field1 = var48;
                        }
                        class40.method300(false, var45);
                        continue;
                    }
                    if (var269 == 101) {
                        class126 var49 = var41 ? class40.field968 : class1.field1;
                        class126 var50 = class78.method532(0, var49.field2780);
                        var50.field2822[var49.field2807] = null;
                        class40.method300(false, var50);
                        continue;
                    }
                    if (var269 == 102) {
                        var5--;
                        class126 var51 = class78.method532(0, class127.field2885[var5]);
                        var51.field2822 = null;
                        class40.method300(false, var51);
                        continue;
                    }
                    if (var269 == 200) {
                        var5 -= 2;
                        int var52 = class127.field2885[var5];
                        int var53 = class127.field2885[var5 + 1];
                        class126 var54 = class63.method434(var52, var53, 258);
                        if (var54 != null && var53 != -1) {
                            class127.field2885[var5++] = 1;
                            if (var41) {
                                class40.field968 = var54;
                            } else {
                                class1.field1 = var54;
                            }
                            continue;
                        }
                        class127.field2885[var5++] = 0;
                        continue;
                    }
                } else {
                    int var10000;
                    if (var269 >= 1000 && var269 < 1100 || !(var269 < 2000 || var269 >= 2100)) {
                        class126 var262;
                        if (var269 < 2000) {
                            var262 = var41 ? class40.field968 : class1.field1;
                        } else {
                            var10000 = arg0 + 71;
                            var5--;
                            var262 = class78.method532(var10000, class127.field2885[var5]);
                            var269 -= 1000;
                        }
                        if (var269 == 1000) {
                            var5 -= 2;
                            var262.field2812 = class127.field2885[var5];
                            var262.field2752 = class127.field2885[var5 + 1];
                            class40.method300(false, var262);
                            continue;
                        }
                        if (var269 == 1001) {
                            var5 -= 2;
                            var262.field2785 = class127.field2885[var5];
                            var262.field2871 = class127.field2885[var5 + 1];
                            class40.method300(false, var262);
                            continue;
                        }
                        if (var269 == 1003) {
                            var5--;
                            boolean var263 = class127.field2885[var5] == 1;
                            if (var262.field2754 != var263) {
                                var262.field2754 = var263;
                                class40.method300(false, var262);
                            }
                            continue;
                        }
                    } else if (var269 >= 1100 && var269 < 1200 || !(var269 < 2100 || var269 >= 2200)) {
                        class126 var55;
                        if (var269 < 2000) {
                            var55 = var41 ? class40.field968 : class1.field1;
                        } else {
                            var5--;
                            var55 = class78.method532(0, class127.field2885[var5]);
                            var269 -= 1000;
                        }
                        if (var269 == 1100) {
                            var5 -= 2;
                            var55.field2833 = class127.field2885[var5];
                            if (var55.field2833 > var55.field2789 - var55.field2785) {
                                var55.field2833 = var55.field2789 - var55.field2785;
                            }
                            if (var55.field2833 < 0) {
                                var55.field2833 = 0;
                            }
                            var55.field2867 = class127.field2885[var5 + 1];
                            if (var55.field2867 > var55.field2791 - var55.field2871) {
                                var55.field2867 = var55.field2791 - var55.field2871;
                            }
                            if (var55.field2867 < 0) {
                                var55.field2867 = 0;
                            }
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1101) {
                            var5--;
                            var55.field2779 = class127.field2885[var5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1102) {
                            var5--;
                            var55.field2848 = class127.field2885[var5] == 1;
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1103) {
                            var5--;
                            var55.field2835 = class127.field2885[var5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1104) {
                            var5--;
                            var55.field2739 = class127.field2885[var5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1105) {
                            var5--;
                            var55.field2805 = class127.field2885[var5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1106) {
                            var5--;
                            var55.field2786 = class127.field2885[var5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1107) {
                            var5--;
                            var55.field2742 = class127.field2885[var5] == 1;
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1108) {
                            var55.field2741 = 1;
                            var5--;
                            var55.field2735 = class127.field2885[var5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1109) {
                            var5 -= 6;
                            var55.field2821 = class127.field2885[var5];
                            var55.field2845 = class127.field2885[var5 + 1];
                            var55.field2778 = class127.field2885[var5 + 2];
                            var55.field2748 = class127.field2885[var5 + 3];
                            var55.field2809 = class127.field2885[var5 + 4];
                            var55.field2825 = class127.field2885[var5 + 5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1110) {
                            var5--;
                            int var56 = class127.field2885[var5];
                            if (var55.field2776 != var56) {
                                var55.field2861 = 0;
                                var55.field2776 = var56;
                                var55.field2844 = 0;
                                class40.method300(false, var55);
                            }
                            continue;
                        }
                        if (var269 == 1111) {
                            var5--;
                            var55.field2761 = class127.field2885[var5] == 1;
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1112) {
                            var7--;
                            class101 var57 = class65.field1486[var7];
                            if (!var57.method703(0, var55.field2819)) {
                                var55.field2819 = var57;
                                class40.method300(false, var55);
                            }
                            continue;
                        }
                        if (var269 == 1113) {
                            var5--;
                            var55.field2811 = class127.field2885[var5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1114) {
                            var5 -= 3;
                            var55.field2784 = class127.field2885[var5];
                            var55.field2814 = class127.field2885[var5 + 1];
                            var55.field2747 = class127.field2885[var5 + 2];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1115) {
                            var5--;
                            var55.field2799 = class127.field2885[var5] == 1;
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1116) {
                            var5--;
                            var55.field2763 = class127.field2885[var5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1117) {
                            var5--;
                            var55.field2815 = class127.field2885[var5];
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1118) {
                            var5--;
                            var55.field2823 = class127.field2885[var5] == 1;
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1119) {
                            var5--;
                            var55.field2808 = class127.field2885[var5] == 1;
                            class40.method300(false, var55);
                            continue;
                        }
                        if (var269 == 1120) {
                            var5 -= 2;
                            var55.field2789 = class127.field2885[var5];
                            var55.field2791 = class127.field2885[var5 + 1];
                            class40.method300(false, var55);
                            continue;
                        }
                    } else if (var269 >= 1200 && var269 < 1300 || var269 >= 2200 && var269 < 2300) {
                        class126 var258;
                        if (var269 >= 2000) {
                            var269 -= 1000;
                            var5--;
                            var258 = class78.method532(0, class127.field2885[var5]);
                        } else {
                            var258 = var41 ? class40.field968 : class1.field1;
                        }
                        class40.method300(false, var258);
                        if (var269 == 1200) {
                            var5 -= 2;
                            int var259 = class127.field2885[var5 + 1];
                            int var260 = class127.field2885[var5];
                            var258.field2745 = var259;
                            var258.field2801 = var260;
                            class155 var261 = class137.method1045((byte) -43, var260);
                            var258.field2825 = var261.field3533;
                            var258.field2821 = var261.field3552;
                            if (var258.field2785 > 0) {
                                var258.field2825 = var258.field2825 * 32 / var258.field2785;
                            }
                            var258.field2845 = var261.field3556;
                            var258.field2748 = var261.field3546;
                            var258.field2809 = var261.field3538;
                            var258.field2778 = var261.field3577;
                            continue;
                        }
                        if (var269 == 1201) {
                            var258.field2741 = 2;
                            var5--;
                            var258.field2735 = class127.field2885[var5];
                            continue;
                        }
                        if (var269 == 1202) {
                            var258.field2741 = 3;
                            var258.field2735 = class82.field1778.field255.method595(-89);
                            continue;
                        }
                    } else if (var269 >= 1300 && var269 < 1400 || var269 >= 2300 && var269 < 2400) {
                        class126 var254;
                        if (var269 < 2000) {
                            var254 = var41 ? class40.field968 : class1.field1;
                        } else {
                            var5--;
                            var254 = class78.method532(0, class127.field2885[var5]);
                            var269 -= 1000;
                        }
                        if (var269 == 1300) {
                            var5--;
                            int var255 = class127.field2885[var5] - 1;
                            if (var255 >= 0 && var255 <= 9) {
                                var7--;
                                var254.method969(var255, -73, class65.field1486[var7]);
                                continue;
                            }
                            var7--;
                            continue;
                        }
                        if (var269 == 1301) {
                            var5 -= 2;
                            int var256 = class127.field2885[var5];
                            int var257 = class127.field2885[var5 + 1];
                            var254.field2790 = class63.method434(var256, var257, 258);
                            continue;
                        }
                        if (var269 == 1302) {
                            var5--;
                            var254.field2820 = class127.field2885[var5] == 1;
                            continue;
                        }
                        if (var269 == 1303) {
                            var5--;
                            var254.field2834 = class127.field2885[var5];
                            continue;
                        }
                        if (var269 == 1304) {
                            var5--;
                            var254.field2832 = class127.field2885[var5];
                            continue;
                        }
                        if (var269 == 1305) {
                            var7--;
                            var254.field2738 = class65.field1486[var7];
                            continue;
                        }
                        if (var269 == 1306) {
                            var7--;
                            var254.field2852 = class65.field1486[var7];
                            continue;
                        }
                        if (var269 == 1307) {
                            var254.field2865 = null;
                            continue;
                        }
                    } else {
                        if (var269 >= 1400 && var269 < 1500 || var269 >= 2400 && var269 < 2500) {
                            class126 var58;
                            if (var269 < 2000) {
                                var58 = var41 ? class40.field968 : class1.field1;
                            } else {
                                var10000 = arg0 ^ 0xFFFFFFB9;
                                var5--;
                                var58 = class78.method532(var10000, class127.field2885[var5]);
                                var269 -= 1000;
                            }
                            var7--;
                            class101 var59 = class65.field1486[var7];
                            int[] var60 = null;
                            if (var59.method737(0) > 0 && var59.method730(-114, var59.method737(0) - 1) == 89) {
                                var5--;
                                int var61 = class127.field2885[var5];
                                if (var61 > 0) {
                                    var60 = new int[var61];
                                    while (var61-- > 0) {
                                        var5--;
                                        var60[var61] = class127.field2885[var5];
                                    }
                                }
                                var59 = var59.method725(0, arg0 - 47, var59.method737(0) + -1);
                            }
                            Object[] var62 = new Object[var59.method737(arg0 ^ 0xFFFFFFB9) + 1];
                            for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                                if (var59.method730(arg0 ^ 0x2A, var63 - 1) == 115) {
                                    var7--;
                                    var62[var63] = class65.field1486[var7];
                                } else {
                                    var5--;
                                    var62[var63] = Integer.valueOf(class127.field2885[var5]);
                                }
                            }
                            var5--;
                            int var64 = class127.field2885[var5];
                            if (var64 == -1) {
                                var62 = null;
                            } else {
                                var62[0] = Integer.valueOf(var64);
                            }
                            if (var269 == 1408) {
                                var58.field2766 = var62;
                            }
                            var58.field2827 = true;
                            if (var269 == 1404) {
                                var58.field2771 = var62;
                            }
                            if (var269 == 1411) {
                                var58.field2802 = var62;
                            }
                            if (var269 == 1423) {
                                var58.field2813 = var62;
                            }
                            if (var269 == 1416) {
                                var58.field2816 = var62;
                            }
                            if (var269 == 1417) {
                                var58.field2777 = var62;
                            }
                            if (var269 == 1403) {
                                var58.field2817 = var62;
                            }
                            if (var269 == 1420) {
                                var58.field2828 = var62;
                            }
                            if (var269 == 1424) {
                                var58.field2868 = var62;
                            }
                            if (var269 == 1418) {
                                var58.field2797 = var62;
                            }
                            if (var269 == 1421) {
                                var58.field2737 = var62;
                            }
                            if (var269 == 1407) {
                                var58.field2769 = var62;
                                var58.field2864 = var60;
                            }
                            if (var269 == 1419) {
                                var58.field2758 = var62;
                            }
                            if (var269 == 1402) {
                                var58.field2759 = var62;
                            }
                            if (var269 == 1412) {
                                var58.field2734 = var62;
                            }
                            if (var269 == 1414) {
                                var58.field2846 = var62;
                                var58.field2774 = var60;
                            }
                            if (var269 == 1415) {
                                var58.field2760 = var62;
                                var58.field2857 = var60;
                            }
                            if (var269 == 1400) {
                                var58.field2837 = var62;
                            }
                            if (var269 == 1410) {
                                var58.field2800 = var62;
                            }
                            if (var269 == 1401) {
                                var58.field2764 = var62;
                            }
                            if (var269 == 1409) {
                                var58.field2740 = var62;
                            }
                            if (var269 == 1406) {
                                var58.field2757 = var62;
                            }
                            if (var269 == 1405) {
                                var58.field2858 = var62;
                            }
                            if (var269 == 1422) {
                                var58.field2750 = var62;
                            }
                            continue;
                        }
                        if (var269 < 1600) {
                            class126 var65 = var41 ? class40.field968 : class1.field1;
                            if (var269 == 1500) {
                                class127.field2885[var5++] = var65.field2812;
                                continue;
                            }
                            if (var269 == 1501) {
                                class127.field2885[var5++] = var65.field2752;
                                continue;
                            }
                            if (var269 == 1502) {
                                class127.field2885[var5++] = var65.field2785;
                                continue;
                            }
                            if (var269 == 1503) {
                                class127.field2885[var5++] = var65.field2871;
                                continue;
                            }
                            if (var269 == 1504) {
                                class127.field2885[var5++] = var65.field2754 ? 1 : 0;
                                continue;
                            }
                            if (var269 == 1505) {
                                class127.field2885[var5++] = var65.field2794;
                                continue;
                            }
                        } else if (var269 < 1700) {
                            class126 var253 = var41 ? class40.field968 : class1.field1;
                            if (var269 == 1600) {
                                class127.field2885[var5++] = var253.field2833;
                                continue;
                            }
                            if (var269 == 1601) {
                                class127.field2885[var5++] = var253.field2867;
                                continue;
                            }
                            if (var269 == 1602) {
                                class65.field1486[var7++] = var253.field2819;
                                continue;
                            }
                            if (var269 == 1603) {
                                class127.field2885[var5++] = var253.field2789;
                                continue;
                            }
                            if (var269 == 1604) {
                                class127.field2885[var5++] = var253.field2791;
                                continue;
                            }
                            if (var269 == 1605) {
                                class127.field2885[var5++] = var253.field2825;
                                continue;
                            }
                            if (var269 == 1606) {
                                class127.field2885[var5++] = var253.field2778;
                                continue;
                            }
                            if (var269 == 1607) {
                                class127.field2885[var5++] = var253.field2809;
                                continue;
                            }
                            if (var269 == 1608) {
                                class127.field2885[var5++] = var253.field2748;
                                continue;
                            }
                        } else if (var269 < 1800) {
                            class126 var252 = var41 ? class40.field968 : class1.field1;
                            if (var269 == 1700) {
                                class127.field2885[var5++] = var252.field2801;
                                continue;
                            }
                            if (var269 == 1701) {
                                if (var252.field2801 == -1) {
                                    class127.field2885[var5++] = 0;
                                } else {
                                    class127.field2885[var5++] = var252.field2745;
                                }
                                continue;
                            }
                            if (var269 == 1702) {
                                class127.field2885[var5++] = var252.field2807;
                                continue;
                            }
                        } else if (var269 < 1900) {
                            class126 var66 = var41 ? class40.field968 : class1.field1;
                            if (var269 == 1800) {
                                class127.field2885[var5++] = class48.method354(22782, class42.method313(var66, (byte) -34));
                                continue;
                            }
                            if (var269 == 1801) {
                                var5--;
                                int var67 = class127.field2885[var5];
                                int var270 = var67 - 1;
                                if (var66.field2865 != null && var270 < var66.field2865.length && var66.field2865[var270] != null) {
                                    class65.field1486[var7++] = var66.field2865[var270];
                                    continue;
                                }
                                class65.field1486[var7++] = class27.field725;
                                continue;
                            }
                            if (var269 == 1802) {
                                if (var66.field2738 == null) {
                                    class65.field1486[var7++] = class27.field725;
                                } else {
                                    class65.field1486[var7++] = var66.field2738;
                                }
                                continue;
                            }
                        } else if (var269 < 2600) {
                            var5--;
                            class126 var68 = class78.method532(0, class127.field2885[var5]);
                            if (var269 == 2500) {
                                class127.field2885[var5++] = var68.field2812;
                                continue;
                            }
                            if (var269 == 2501) {
                                class127.field2885[var5++] = var68.field2752;
                                continue;
                            }
                            if (var269 == 2502) {
                                class127.field2885[var5++] = var68.field2785;
                                continue;
                            }
                            if (var269 == 2503) {
                                class127.field2885[var5++] = var68.field2871;
                                continue;
                            }
                            if (var269 == 2504) {
                                class127.field2885[var5++] = var68.field2754 ? 1 : 0;
                                continue;
                            }
                            if (var269 == 2505) {
                                class127.field2885[var5++] = var68.field2794;
                                continue;
                            }
                        } else if (var269 < 2700) {
                            var10000 = arg0 + 71;
                            var5--;
                            class126 var251 = class78.method532(var10000, class127.field2885[var5]);
                            if (var269 == 2600) {
                                class127.field2885[var5++] = var251.field2833;
                                continue;
                            }
                            if (var269 == 2601) {
                                class127.field2885[var5++] = var251.field2867;
                                continue;
                            }
                            if (var269 == 2602) {
                                class65.field1486[var7++] = var251.field2819;
                                continue;
                            }
                            if (var269 == 2603) {
                                class127.field2885[var5++] = var251.field2789;
                                continue;
                            }
                            if (var269 == 2604) {
                                class127.field2885[var5++] = var251.field2791;
                                continue;
                            }
                            if (var269 == 2605) {
                                class127.field2885[var5++] = var251.field2825;
                                continue;
                            }
                            if (var269 == 2606) {
                                class127.field2885[var5++] = var251.field2778;
                                continue;
                            }
                            if (var269 == 2607) {
                                class127.field2885[var5++] = var251.field2809;
                                continue;
                            }
                            if (var269 == 2608) {
                                class127.field2885[var5++] = var251.field2748;
                                continue;
                            }
                        } else if (var269 < 2800) {
                            if (var269 == 2700) {
                                var10000 = arg0 ^ 0xFFFFFFB9;
                                var5--;
                                class126 var247 = class78.method532(var10000, class127.field2885[var5]);
                                class127.field2885[var5++] = var247.field2801;
                                continue;
                            }
                            if (var269 == 2701) {
                                var5--;
                                class126 var248 = class78.method532(0, class127.field2885[var5]);
                                if (var248.field2801 == -1) {
                                    class127.field2885[var5++] = 0;
                                } else {
                                    class127.field2885[var5++] = var248.field2745;
                                }
                                continue;
                            }
                            if (var269 == 2702) {
                                var5--;
                                int var249 = class127.field2885[var5];
                                class133 var250 = (class133) class96.field2092.method1141((long) var249, -1);
                                if (var250 == null) {
                                    class127.field2885[var5++] = 0;
                                } else {
                                    class127.field2885[var5++] = 1;
                                }
                                continue;
                            }
                        } else if (var269 < 2900) {
                            var10000 = arg0 ^ 0xFFFFFFB9;
                            var5--;
                            class126 var245 = class78.method532(var10000, class127.field2885[var5]);
                            if (var269 == 2800) {
                                class127.field2885[var5++] = class48.method354(22782, class42.method313(var245, (byte) -34));
                                continue;
                            }
                            if (var269 == 2801) {
                                var5--;
                                int var246 = class127.field2885[var5];
                                int var271 = var246 - 1;
                                if (var245.field2865 != null && var245.field2865.length > var271 && var245.field2865[var271] != null) {
                                    class65.field1486[var7++] = var245.field2865[var271];
                                    continue;
                                }
                                class65.field1486[var7++] = class27.field725;
                                continue;
                            }
                            if (var269 == 2802) {
                                if (var245.field2738 == null) {
                                    class65.field1486[var7++] = class27.field725;
                                } else {
                                    class65.field1486[var7++] = var245.field2738;
                                }
                                continue;
                            }
                        } else if (var269 < 3200) {
                            if (var269 == 3100) {
                                var7--;
                                class101 var69 = class65.field1486[var7];
                                class111.method818(0, class27.field725, 28960, var69);
                                continue;
                            }
                            if (var269 == 3101) {
                                var5 -= 2;
                                class101.method728(class127.field2885[var5], 0, class127.field2885[var5 + 1], class82.field1778);
                                continue;
                            }
                            if (var269 == 3103) {
                                class61.method423(arg0 ^ 0xFFFF8DFE);
                                continue;
                            }
                            if (var269 == 3104) {
                                class42.field1009++;
                                var7--;
                                class101 var70 = class65.field1486[var7];
                                int var71 = 0;
                                if (var70.method722(-2)) {
                                    var71 = var70.method716(arg0 ^ 0xFFFFE08A);
                                }
                                class17.field364.method419(230, (byte) 0);
                                class17.field364.method1090((byte) 38, var71);
                                continue;
                            }
                            if (var269 == 3105) {
                                var7--;
                                class101 var72 = class65.field1486[var7];
                                class17.field364.method419(97, (byte) 0);
                                class152.field3464++;
                                class17.field364.method1087(var72.method717(-96), -97);
                                continue;
                            }
                            if (var269 == 3106) {
                                class145.field3333++;
                                var7--;
                                class101 var73 = class65.field1486[var7];
                                class17.field364.method419(202, (byte) 0);
                                class17.field364.method1101(var73.method737(0) + 1, (byte) -32);
                                class17.field364.method1070(var73, true);
                                continue;
                            }
                            if (var269 == 3107) {
                                var5--;
                                int var74 = class127.field2885[var5];
                                var7--;
                                class101 var75 = class65.field1486[var7];
                                class39.method293(var74, (byte) 109, var75);
                                continue;
                            }
                            if (var269 == 3108) {
                                var5 -= 3;
                                int var76 = class127.field2885[var5];
                                int var77 = class127.field2885[var5 + 2];
                                int var78 = class127.field2885[var5 + 1];
                                class126 var79 = class78.method532(0, var77);
                                class36.method264(var76, (byte) 97, var79, var78);
                                continue;
                            }
                            if (var269 == 3109) {
                                var5 -= 2;
                                class126 var80 = var41 ? class40.field968 : class1.field1;
                                int var81 = class127.field2885[var5 + 1];
                                int var82 = class127.field2885[var5];
                                class36.method264(var82, (byte) 103, var80, var81);
                                continue;
                            }
                        } else if (var269 < 3300) {
                            if (var269 == 3200) {
                                var5 -= 3;
                                class135.method1043(class127.field2885[var5 + 2], class127.field2885[var5 + 1], class127.field2885[var5], 117);
                                continue;
                            }
                            if (var269 == 3201) {
                                var5--;
                                class132.method1016(class127.field2885[var5], 122);
                                continue;
                            }
                            if (var269 == 3202) {
                                var5 -= 2;
                                class130.method1002(class127.field2885[var5 + 1], class127.field2885[var5], 25095);
                                continue;
                            }
                        } else if (var269 < 3400) {
                            if (var269 == 3300) {
                                class127.field2885[var5++] = class143.field3305;
                                continue;
                            }
                            if (var269 == 3301) {
                                var5 -= 2;
                                int var83 = class127.field2885[var5 + 1];
                                int var84 = class127.field2885[var5];
                                class127.field2885[var5++] = class86.method619(class39.method295(arg0, -109), var84, var83);
                                continue;
                            }
                            if (var269 == 3302) {
                                var5 -= 2;
                                int var85 = class127.field2885[var5];
                                int var86 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = class43.method318(true, var85, var86);
                                continue;
                            }
                            if (var269 == 3303) {
                                var5 -= 2;
                                int var87 = class127.field2885[var5];
                                int var88 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = class130.method1004(var88, class39.method295(arg0, 70), var87);
                                continue;
                            }
                            if (var269 == 3304) {
                                var5--;
                                int var89 = class127.field2885[var5];
                                class127.field2885[var5++] = class141.method1126(-6897, var89).field2302;
                                continue;
                            }
                            if (var269 == 3305) {
                                var5--;
                                int var90 = class127.field2885[var5];
                                class127.field2885[var5++] = class121.field2666[var90];
                                continue;
                            }
                            if (var269 == 3306) {
                                var5--;
                                int var91 = class127.field2885[var5];
                                class127.field2885[var5++] = class46.field1092[var91];
                                continue;
                            }
                            if (var269 == 3307) {
                                var5--;
                                int var92 = class127.field2885[var5];
                                class127.field2885[var5++] = class8.field134[var92];
                                continue;
                            }
                            if (var269 == 3308) {
                                int var93 = class95.field2040;
                                int var94 = (class82.field1778.field1341 >> 7) + class56.field1260;
                                int var95 = (class82.field1778.field1298 >> 7) + class75.field1597;
                                class127.field2885[var5++] = (var94 << 14) + (var93 << 28) + var95;
                                continue;
                            }
                            if (var269 == 3309) {
                                var5--;
                                int var96 = class127.field2885[var5];
                                class127.field2885[var5++] = class41.method307(16383, var96 >> 14);
                                continue;
                            }
                            if (var269 == 3310) {
                                var5--;
                                int var97 = class127.field2885[var5];
                                class127.field2885[var5++] = var97 >> 28;
                                continue;
                            }
                            if (var269 == 3311) {
                                var5--;
                                int var98 = class127.field2885[var5];
                                class127.field2885[var5++] = class41.method307(16383, var98);
                                continue;
                            }
                            if (var269 == 3312) {
                                class127.field2885[var5++] = class32.field821 ? 1 : 0;
                                continue;
                            }
                            if (var269 == 3313) {
                                var5 -= 2;
                                int var99 = class127.field2885[var5 + 1];
                                int var100 = class127.field2885[var5] + 32768;
                                class127.field2885[var5++] = class86.method619(-34, var100, var99);
                                continue;
                            }
                            if (var269 == 3314) {
                                var5 -= 2;
                                int var101 = class127.field2885[var5 + 1];
                                int var102 = class127.field2885[var5] + 32768;
                                class127.field2885[var5++] = class43.method318(true, var102, var101);
                                continue;
                            }
                            if (var269 == 3315) {
                                var5 -= 2;
                                int var103 = class127.field2885[var5] + 32768;
                                int var104 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = class130.method1004(var104, -1, var103);
                                continue;
                            }
                            if (var269 == 3316) {
                                if (class142.field3277 >= 2) {
                                    class127.field2885[var5++] = class142.field3277;
                                } else {
                                    class127.field2885[var5++] = 0;
                                }
                                continue;
                            }
                            if (var269 == 3317) {
                                class127.field2885[var5++] = class20.field435;
                                continue;
                            }
                            if (var269 == 3318) {
                                class127.field2885[var5++] = class47.field1130;
                                continue;
                            }
                            if (var269 == 3321) {
                                class127.field2885[var5++] = class28.field750;
                                continue;
                            }
                            if (var269 == 3322) {
                                class127.field2885[var5++] = class133.field3050;
                                continue;
                            }
                            if (var269 == 3323) {
                                if (class142.field3277 == 1) {
                                    class127.field2885[var5++] = 1;
                                } else {
                                    class127.field2885[var5++] = 0;
                                }
                                continue;
                            }
                        } else if (var269 < 3500) {
                            if (var269 == 3400) {
                                var5 -= 2;
                                int var235 = class127.field2885[var5];
                                int var236 = class127.field2885[var5 + 1];
                                class23 var237 = class153.method1186(true, var235);
                                for (int var238 = 0; var238 < var237.field553; var238++) {
                                    if (var237.field558[var238] == var236) {
                                        class65.field1486[var7++] = var237.field554[var238];
                                        var237 = null;
                                        break;
                                    }
                                }
                                if (var237 != null) {
                                    class65.field1486[var7++] = var237.field535;
                                }
                                continue;
                            }
                            if (var269 == 3408) {
                                var5 -= 4;
                                int var239 = class127.field2885[var5];
                                int var240 = class127.field2885[var5 + 3];
                                int var241 = class127.field2885[var5 + 1];
                                int var242 = class127.field2885[var5 + 2];
                                class23 var243 = class153.method1186(true, var242);
                                if (var243.field556 == var239 && var243.field531 == var241) {
                                    for (int var244 = 0; var244 < var243.field553; var244++) {
                                        if (var243.field558[var244] == var240) {
                                            if (var241 == 115) {
                                                class65.field1486[var7++] = var243.field554[var244];
                                            } else {
                                                class127.field2885[var5++] = var243.field551[var244];
                                            }
                                            var243 = null;
                                            break;
                                        }
                                    }
                                    if (var243 != null) {
                                        if (var241 == 115) {
                                            class65.field1486[var7++] = var243.field535;
                                        } else {
                                            class127.field2885[var5++] = var243.field548;
                                        }
                                    }
                                    continue;
                                }
                                if (var241 == 115) {
                                    class65.field1486[var7++] = class125.field2730;
                                } else {
                                    class127.field2885[var5++] = 0;
                                }
                                continue;
                            }
                        } else if (var269 < 3700) {
                            if (var269 == 3600) {
                                if (class67.field1502 == 0) {
                                    class127.field2885[var5++] = -2;
                                } else if (class67.field1502 == 1) {
                                    class127.field2885[var5++] = -1;
                                } else {
                                    class127.field2885[var5++] = class101.field2205;
                                }
                                continue;
                            }
                            if (var269 == 3601) {
                                var5--;
                                int var105 = class127.field2885[var5];
                                if (class67.field1502 == 2 && class101.field2205 > var105) {
                                    class65.field1486[var7++] = class35.field899[var105];
                                    continue;
                                }
                                class65.field1486[var7++] = class27.field725;
                                continue;
                            }
                            if (var269 == 3602) {
                                var5--;
                                int var106 = class127.field2885[var5];
                                if (class67.field1502 == 2 && class101.field2205 > var106) {
                                    class127.field2885[var5++] = class78.field1623[var106];
                                    continue;
                                }
                                class127.field2885[var5++] = 0;
                                continue;
                            }
                            if (var269 == 3603) {
                                var5--;
                                int var107 = class127.field2885[var5];
                                if (class67.field1502 == 2 && class101.field2205 > var107) {
                                    class127.field2885[var5++] = class52.field1179[var107];
                                    continue;
                                }
                                class127.field2885[var5++] = 0;
                                continue;
                            }
                            if (var269 == 3604) {
                                var5--;
                                int var108 = class127.field2885[var5];
                                var7--;
                                class101 var109 = class65.field1486[var7];
                                class100.method695(-126, var108, var109);
                                continue;
                            }
                            if (var269 == 3605) {
                                var7--;
                                class101 var110 = class65.field1486[var7];
                                class23.method181((byte) 22, var110.method717(arg0 ^ 0x19));
                                continue;
                            }
                            if (var269 == 3606) {
                                var7--;
                                class101 var111 = class65.field1486[var7];
                                class48.method353(arg0 - 6, var111.method717(arg0 + -25));
                                continue;
                            }
                            if (var269 == 3607) {
                                var7--;
                                class101 var112 = class65.field1486[var7];
                                class126.method974(var112.method717(-96), arg0 + 180);
                                continue;
                            }
                            if (var269 == 3608) {
                                var7--;
                                class101 var113 = class65.field1486[var7];
                                class50.method369(86, var113.method717(-96));
                                continue;
                            }
                            if (var269 == 3609) {
                                var7--;
                                class101 var114 = class65.field1486[var7];
                                if (var114.method713(class142.field3265, -22411) || var114.method713(class12.field238, -22411)) {
                                    var114 = var114.method707((byte) 101, 7);
                                }
                                class127.field2885[var5++] = class154.method1191(90, var114) ? 1 : 0;
                                continue;
                            }
                            if (var269 == 3611) {
                                if (class156.field3587 == null) {
                                    class65.field1486[var7++] = class27.field725;
                                } else {
                                    class65.field1486[var7++] = class156.field3587;
                                }
                                continue;
                            }
                            if (var269 == 3612) {
                                if (class156.field3587 == null) {
                                    class127.field2885[var5++] = 0;
                                } else {
                                    class127.field2885[var5++] = class142.field3279;
                                }
                                continue;
                            }
                            if (var269 == 3613) {
                                var5--;
                                int var115 = class127.field2885[var5];
                                if (class156.field3587 != null && var115 < class142.field3279) {
                                    class65.field1486[var7++] = class119.field2631[var115].field707;
                                    continue;
                                }
                                class65.field1486[var7++] = class27.field725;
                                continue;
                            }
                            if (var269 == 3614) {
                                var5--;
                                int var116 = class127.field2885[var5];
                                if (class156.field3587 != null && var116 < class142.field3279) {
                                    class127.field2885[var5++] = class119.field2631[var116].field704;
                                    continue;
                                }
                                class127.field2885[var5++] = 0;
                                continue;
                            }
                            if (var269 == 3615) {
                                var5--;
                                int var117 = class127.field2885[var5];
                                if (class156.field3587 != null && var117 < class142.field3279) {
                                    class127.field2885[var5++] = class119.field2631[var117].field711;
                                    continue;
                                }
                                class127.field2885[var5++] = 0;
                                continue;
                            }
                            if (var269 == 3616) {
                                class127.field2885[var5++] = class54.field1224;
                                continue;
                            }
                            if (var269 == 3617) {
                                var5--;
                                int var118 = class127.field2885[var5];
                                class7.method35(0, var118);
                                continue;
                            }
                            if (var269 == 3618) {
                                class127.field2885[var5++] = class86.field1899;
                                continue;
                            }
                            if (var269 == 3619) {
                                var7--;
                                class101 var119 = class65.field1486[var7];
                                class42.method316(-18925, var119.method717(-96));
                                continue;
                            }
                            if (var269 == 3620) {
                                class141.method1127(-12304);
                                continue;
                            }
                            if (var269 == 3621) {
                                if (class67.field1502 == 0) {
                                    class127.field2885[var5++] = -1;
                                } else {
                                    class127.field2885[var5++] = class73.field1579;
                                }
                                continue;
                            }
                            if (var269 == 3622) {
                                var5--;
                                int var120 = class127.field2885[var5];
                                if (class67.field1502 != 0 && class73.field1579 > var120) {
                                    class65.field1486[var7++] = class67.method452(115, class29.field768[var120]).method714(-123);
                                    continue;
                                }
                                class65.field1486[var7++] = class27.field725;
                                continue;
                            }
                        } else if (var269 < 4100) {
                            if (var269 == 4000) {
                                var5 -= 2;
                                int var121 = class127.field2885[var5];
                                int var122 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = var121 + var122;
                                continue;
                            }
                            if (var269 == 4001) {
                                var5 -= 2;
                                int var123 = class127.field2885[var5];
                                int var124 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = var123 - var124;
                                continue;
                            }
                            if (var269 == 4002) {
                                var5 -= 2;
                                int var125 = class127.field2885[var5 + 1];
                                int var126 = class127.field2885[var5];
                                class127.field2885[var5++] = var125 * var126;
                                continue;
                            }
                            if (var269 == 4003) {
                                var5 -= 2;
                                int var127 = class127.field2885[var5];
                                int var128 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = var127 / var128;
                                continue;
                            }
                            if (var269 == 4004) {
                                var5--;
                                int var129 = class127.field2885[var5];
                                class127.field2885[var5++] = (int) ((double) var129 * Math.random());
                                continue;
                            }
                            if (var269 == 4005) {
                                var5--;
                                int var130 = class127.field2885[var5];
                                class127.field2885[var5++] = (int) ((double) (var130 + 1) * Math.random());
                                continue;
                            }
                            if (var269 == 4006) {
                                var5 -= 5;
                                int var131 = class127.field2885[var5];
                                int var132 = class127.field2885[var5 + 1];
                                int var133 = class127.field2885[var5 + 3];
                                int var134 = class127.field2885[var5 + 2];
                                int var135 = class127.field2885[var5 + 4];
                                class127.field2885[var5++] = (var135 - var134) * (-var131 + var132) / (var133 - var134) + var131;
                                continue;
                            }
                            if (var269 == 4007) {
                                var5 -= 2;
                                int var136 = class127.field2885[var5];
                                int var137 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = var136 * var137 / 100 + var136;
                                continue;
                            }
                            if (var269 == 4008) {
                                var5 -= 2;
                                int var138 = class127.field2885[var5 + 1];
                                int var139 = class127.field2885[var5];
                                class127.field2885[var5++] = class13.method96(0x1 << var138, var139);
                                continue;
                            }
                            if (var269 == 4009) {
                                var5 -= 2;
                                int var140 = class127.field2885[var5];
                                int var141 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = class41.method307(var140, -(0x1 << var141) - 1);
                                continue;
                            }
                            if (var269 == 4010) {
                                var5 -= 2;
                                int var142 = class127.field2885[var5];
                                int var143 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = class41.method307(var142, 0x1 << var143) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var269 == 4011) {
                                var5 -= 2;
                                int var144 = class127.field2885[var5];
                                int var145 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = var144 % var145;
                                continue;
                            }
                            if (var269 == 4012) {
                                var5 -= 2;
                                int var146 = class127.field2885[var5];
                                int var147 = class127.field2885[var5 + 1];
                                if (var146 == 0) {
                                    class127.field2885[var5++] = 0;
                                } else {
                                    class127.field2885[var5++] = (int) Math.pow((double) var146, (double) var147);
                                }
                                continue;
                            }
                            if (var269 == 4013) {
                                var5 -= 2;
                                int var148 = class127.field2885[var5];
                                int var149 = class127.field2885[var5 + 1];
                                if (var148 == 0) {
                                    class127.field2885[var5++] = 0;
                                } else if (var149 == 0) {
                                    class127.field2885[var5++] = Integer.MAX_VALUE;
                                } else {
                                    class127.field2885[var5++] = (int) Math.pow((double) var148, 1.0D / (double) var149);
                                }
                                continue;
                            }
                            if (var269 == 4014) {
                                var5 -= 2;
                                int var150 = class127.field2885[var5];
                                int var151 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = class41.method307(var151, var150);
                                continue;
                            }
                            if (var269 == 4015) {
                                var5 -= 2;
                                int var152 = class127.field2885[var5];
                                int var153 = class127.field2885[var5 + 1];
                                class127.field2885[var5++] = class13.method96(var152, var153);
                                continue;
                            }
                        } else if (var269 < 4200) {
                            if (var269 == 4100) {
                                var7--;
                                class101 var154 = class65.field1486[var7];
                                var5--;
                                int var155 = class127.field2885[var5];
                                class65.field1486[var7++] = class15.method101(arg0 - 8, new class101[] { var154, class82.method592(false, var155) });
                                continue;
                            }
                            if (var269 == 4101) {
                                var7 -= 2;
                                class101 var156 = class65.field1486[var7];
                                class101 var157 = class65.field1486[var7 + 1];
                                class65.field1486[var7++] = class15.method101(-27, new class101[] { var156, var157 });
                                continue;
                            }
                            if (var269 == 4102) {
                                var7--;
                                class101 var158 = class65.field1486[var7];
                                var5--;
                                int var159 = class127.field2885[var5];
                                class65.field1486[var7++] = class15.method101(-84, new class101[] { var158, class99.method688(var159, (byte) -20, true) });
                                continue;
                            }
                            if (var269 == 4103) {
                                var7--;
                                class101 var160 = class65.field1486[var7];
                                class65.field1486[var7++] = var160.method731(-5840);
                                continue;
                            }
                            if (var269 == 4104) {
                                var5--;
                                int var161 = class127.field2885[var5];
                                long var162 = (long) var161 * 86400000L + 1014768000000L;
                                class102.field2240.setTime(new Date(var162));
                                int var164 = class102.field2240.get(5);
                                int var165 = class102.field2240.get(2);
                                int var166 = class102.field2240.get(1);
                                class65.field1486[var7++] = class15.method101(75, new class101[] { class82.method592(false, var164), class115.field2565, class85.field1875[var165], class115.field2565, class82.method592(false, var166) });
                                continue;
                            }
                            if (var269 == 4105) {
                                var7 -= 2;
                                class101 var167 = class65.field1486[var7];
                                class101 var168 = class65.field1486[var7 + 1];
                                if (class82.field1778.field255 != null && class82.field1778.field255.field1802) {
                                    class65.field1486[var7++] = var168;
                                    continue;
                                }
                                class65.field1486[var7++] = var167;
                                continue;
                            }
                            if (var269 == 4106) {
                                var5--;
                                int var169 = class127.field2885[var5];
                                class65.field1486[var7++] = class82.method592(false, var169);
                                continue;
                            }
                            if (var269 == 4107) {
                                var7 -= 2;
                                class127.field2885[var5++] = class65.field1486[var7].method732((byte) -98, class65.field1486[var7 + 1]);
                                continue;
                            }
                            if (var269 == 4108) {
                                var5 -= 2;
                                var7--;
                                class101 var170 = class65.field1486[var7];
                                int var171 = class127.field2885[var5];
                                int var172 = class127.field2885[var5 + 1];
                                byte[] var173 = class153.field3478.method114((byte) 94, var172, 0);
                                class88 var174 = new class88(var173);
                                class127.field2885[var5++] = var174.method863(var170, var171);
                                continue;
                            }
                            if (var269 == 4109) {
                                var5 -= 2;
                                int var175 = class127.field2885[var5 + 1];
                                int var176 = class127.field2885[var5];
                                var7--;
                                class101 var177 = class65.field1486[var7];
                                byte[] var178 = class153.field3478.method114((byte) 127, var175, 0);
                                class88 var179 = new class88(var178);
                                class127.field2885[var5++] = var179.method868(var177, var176);
                                continue;
                            }
                            if (var269 == 4110) {
                                var7 -= 2;
                                class101 var180 = class65.field1486[var7 + 1];
                                class101 var181 = class65.field1486[var7];
                                var5--;
                                if (class127.field2885[var5] == 1) {
                                    class65.field1486[var7++] = var181;
                                } else {
                                    class65.field1486[var7++] = var180;
                                }
                                continue;
                            }
                            if (var269 == 4111) {
                                var7--;
                                class101 var182 = class65.field1486[var7];
                                class65.field1486[var7++] = class114.method848(var182);
                                continue;
                            }
                            if (var269 == 4112) {
                                var7--;
                                class101 var183 = class65.field1486[var7];
                                var5--;
                                int var184 = class127.field2885[var5];
                                class65.field1486[var7++] = var183.method715((byte) -81, var184);
                                continue;
                            }
                            if (var269 == 4113) {
                                var5--;
                                int var185 = class127.field2885[var5];
                                class127.field2885[var5++] = class48.method362(var185, (byte) -31) ? 1 : 0;
                                continue;
                            }
                            if (var269 == 4114) {
                                var5--;
                                int var186 = class127.field2885[var5];
                                class127.field2885[var5++] = class5.method28((byte) 111, var186) ? 1 : 0;
                                continue;
                            }
                            if (var269 == 4115) {
                                var5--;
                                int var187 = class127.field2885[var5];
                                class127.field2885[var5++] = class146.method1151(var187, 0) ? 1 : 0;
                                continue;
                            }
                            if (var269 == 4116) {
                                var5--;
                                int var188 = class127.field2885[var5];
                                class127.field2885[var5++] = class100.method692(var188, (byte) 125) ? 1 : 0;
                                continue;
                            }
                            if (var269 == 4117) {
                                var7--;
                                class101 var189 = class65.field1486[var7];
                                if (var189 == null) {
                                    class127.field2885[var5++] = 0;
                                } else {
                                    class127.field2885[var5++] = var189.method737(class39.method295(arg0, -71));
                                }
                                continue;
                            }
                            if (var269 == 4118) {
                                var5 -= 2;
                                var7--;
                                class101 var190 = class65.field1486[var7];
                                int var191 = class127.field2885[var5];
                                int var192 = class127.field2885[var5 + 1];
                                class65.field1486[var7++] = var190.method725(var191, -107, var192);
                                continue;
                            }
                            if (var269 == 4119) {
                                var7--;
                                class101 var193 = class65.field1486[var7];
                                class101 var194 = class132.method1024(true, var193.method737(arg0 ^ 0xFFFFFFB9));
                                boolean var195 = false;
                                for (int var196 = 0; var196 < var193.method737(0); var196++) {
                                    int var197 = var193.method730(-127, var196);
                                    if (var197 == 60) {
                                        var195 = true;
                                    } else if (var197 == 62) {
                                        var195 = false;
                                    } else if (!var195) {
                                        var194.method700(var197, (byte) -11);
                                    }
                                }
                                var194.method727(2);
                                class65.field1486[var7++] = var194;
                                continue;
                            }
                            if (var269 == 4120) {
                                var5--;
                                int var198 = class127.field2885[var5];
                                var7--;
                                class101 var199 = class65.field1486[var7];
                                class127.field2885[var5++] = var199.method702((byte) -35, var198);
                                continue;
                            }
                        } else if (var269 < 4300) {
                            if (var269 == 4200) {
                                var5--;
                                int var200 = class127.field2885[var5];
                                class65.field1486[var7++] = class137.method1045((byte) -98, var200).field3570;
                                continue;
                            }
                            if (var269 == 4201) {
                                var5 -= 2;
                                int var201 = class127.field2885[var5 + 1];
                                int var202 = class127.field2885[var5];
                                class155 var203 = class137.method1045((byte) -106, var202);
                                if (var201 >= 1 && var201 <= 5 && var203.field3523[var201 - 1] != null) {
                                    class65.field1486[var7++] = var203.field3523[var201 - 1];
                                    continue;
                                }
                                class65.field1486[var7++] = class27.field725;
                                continue;
                            }
                            if (var269 == 4202) {
                                var5 -= 2;
                                int var204 = class127.field2885[var5 + 1];
                                int var205 = class127.field2885[var5];
                                class155 var206 = class137.method1045((byte) -43, var205);
                                if (var204 >= 1 && var204 <= 5 && var206.field3540[var204 - 1] != null) {
                                    class65.field1486[var7++] = var206.field3540[var204 - 1];
                                    continue;
                                }
                                class65.field1486[var7++] = class27.field725;
                                continue;
                            }
                            if (var269 == 4203) {
                                var5--;
                                int var207 = class127.field2885[var5];
                                class127.field2885[var5++] = class137.method1045((byte) -128, var207).field3524;
                                continue;
                            }
                            if (var269 == 4204) {
                                var5--;
                                int var208 = class127.field2885[var5];
                                class127.field2885[var5++] = class137.method1045((byte) -108, var208).field3521 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var269 == 4205) {
                                var5--;
                                int var209 = class127.field2885[var5];
                                class155 var210 = class137.method1045((byte) -67, var209);
                                if (var210.field3517 == -1 && var210.field3572 >= 0) {
                                    class127.field2885[var5++] = var210.field3572;
                                    continue;
                                }
                                class127.field2885[var5++] = var209;
                                continue;
                            }
                            if (var269 == 4206) {
                                var5--;
                                int var211 = class127.field2885[var5];
                                class155 var212 = class137.method1045((byte) -103, var211);
                                if (var212.field3517 >= 0 && var212.field3572 >= 0) {
                                    class127.field2885[var5++] = var212.field3572;
                                    continue;
                                }
                                class127.field2885[var5++] = var211;
                                continue;
                            }
                            if (var269 == 4207) {
                                var5--;
                                int var213 = class127.field2885[var5];
                                class127.field2885[var5++] = class137.method1045((byte) -88, var213).field3558 ? 1 : 0;
                                continue;
                            }
                        } else if (var269 < 5100) {
                            if (var269 == 5000) {
                                class127.field2885[var5++] = class79.field1660;
                                continue;
                            }
                            if (var269 == 5001) {
                                var5 -= 3;
                                class79.field1660 = class127.field2885[var5];
                                class85.field1855++;
                                class48.field1139 = class127.field2885[var5 + 1];
                                class7.field103 = class127.field2885[var5 + 2];
                                class17.field364.method419(153, (byte) 0);
                                class17.field364.method1101(class79.field1660, (byte) -32);
                                class17.field364.method1101(class48.field1139, (byte) -32);
                                class17.field364.method1101(class7.field103, (byte) -32);
                                continue;
                            }
                            if (var269 == 5002) {
                                class134.field3057++;
                                var5 -= 2;
                                var7--;
                                class101 var214 = class65.field1486[var7];
                                int var215 = class127.field2885[var5];
                                int var216 = class127.field2885[var5 + 1];
                                class17.field364.method419(136, (byte) 0);
                                class17.field364.method1087(var214.method717(-96), -101);
                                class17.field364.method1101(var215 - 1, (byte) -32);
                                class17.field364.method1101(var216, (byte) -32);
                                continue;
                            }
                            if (var269 == 5003) {
                                var5--;
                                int var217 = class127.field2885[var5];
                                class101 var218 = null;
                                if (var217 < 100) {
                                    var218 = class79.field1653[var217];
                                }
                                if (var218 == null) {
                                    var218 = class27.field725;
                                }
                                class65.field1486[var7++] = var218;
                                continue;
                            }
                            if (var269 == 5004) {
                                var5--;
                                int var219 = class127.field2885[var5];
                                int var220 = -1;
                                if (var219 < 100 && class79.field1653[var219] != null) {
                                    var220 = class158.field3637[var219];
                                }
                                class127.field2885[var5++] = var220;
                                continue;
                            }
                            if (var269 == 5005) {
                                class127.field2885[var5++] = class48.field1139;
                                continue;
                            }
                            if (var269 == 5008) {
                                var7--;
                                class101 var221 = class65.field1486[var7];
                                if (var221.method713(class99.field2145, -22411)) {
                                    class62.method431(arg0 ^ 0xFF00B9, var221);
                                } else {
                                    class101 var222 = var221.method731(-5840);
                                    byte var223 = 0;
                                    if (var222.method713(class149.field3389, -22411)) {
                                        var223 = 0;
                                        var221 = var221.method707((byte) 101, class149.field3389.method737(0));
                                    } else if (var222.method713(class90.field1969, -22411)) {
                                        var223 = 1;
                                        var221 = var221.method707((byte) 101, class90.field1969.method737(arg0 ^ 0xFFFFFFB9));
                                    } else if (var222.method713(class47.field1102, -22411)) {
                                        var221 = var221.method707((byte) 101, class47.field1102.method737(0));
                                        var223 = 2;
                                    } else if (var222.method713(class78.field1622, arg0 ^ 0x57CC)) {
                                        var221 = var221.method707((byte) 101, class78.field1622.method737(0));
                                        var223 = 3;
                                    } else if (var222.method713(class120.field2644, arg0 - 22340)) {
                                        var223 = 4;
                                        var221 = var221.method707((byte) 101, class120.field2644.method737(0));
                                    } else if (var222.method713(class20.field437, -22411)) {
                                        var223 = 5;
                                        var221 = var221.method707((byte) 101, class20.field437.method737(0));
                                    } else if (var222.method713(class111.field2375, -22411)) {
                                        var223 = 6;
                                        var221 = var221.method707((byte) 101, class111.field2375.method737(0));
                                    } else if (var222.method713(class64.field1453, -22411)) {
                                        var221 = var221.method707((byte) 101, class64.field1453.method737(arg0 ^ 0xFFFFFFB9));
                                        var223 = 7;
                                    } else if (var222.method713(class7.field109, -22411)) {
                                        var221 = var221.method707((byte) 101, class7.field109.method737(arg0 ^ 0xFFFFFFB9));
                                        var223 = 8;
                                    } else if (var222.method713(class54.field1238, -22411)) {
                                        var221 = var221.method707((byte) 101, class54.field1238.method737(0));
                                        var223 = 9;
                                    } else if (var222.method713(class29.field769, -22411)) {
                                        var223 = 10;
                                        var221 = var221.method707((byte) 101, class29.field769.method737(0));
                                    } else if (var222.method713(class7.field106, -22411)) {
                                        var221 = var221.method707((byte) 101, class7.field106.method737(arg0 + 71));
                                        var223 = 11;
                                    } else if (class13.field287 != 0) {
                                        if (var222.method713(class149.field3392, arg0 - 22340)) {
                                            var223 = 0;
                                            var221 = var221.method707((byte) 101, class149.field3392.method737(0));
                                        } else if (var222.method713(class90.field1967, -22411)) {
                                            var223 = 1;
                                            var221 = var221.method707((byte) 101, class90.field1967.method737(0));
                                        } else if (var222.method713(class47.field1121, -22411)) {
                                            var221 = var221.method707((byte) 101, class47.field1121.method737(0));
                                            var223 = 2;
                                        } else if (var222.method713(class78.field1625, -22411)) {
                                            var223 = 3;
                                            var221 = var221.method707((byte) 101, class78.field1625.method737(0));
                                        } else if (var222.method713(class120.field2639, -22411)) {
                                            var221 = var221.method707((byte) 101, class120.field2639.method737(0));
                                            var223 = 4;
                                        } else if (var222.method713(class20.field445, -22411)) {
                                            var221 = var221.method707((byte) 101, class20.field445.method737(0));
                                            var223 = 5;
                                        } else if (var222.method713(class111.field2382, -22411)) {
                                            var221 = var221.method707((byte) 101, class111.field2382.method737(0));
                                            var223 = 6;
                                        } else if (var222.method713(class64.field1465, arg0 ^ 0x57CC)) {
                                            var221 = var221.method707((byte) 101, class64.field1465.method737(0));
                                            var223 = 7;
                                        } else if (var222.method713(class7.field112, -22411)) {
                                            var223 = 8;
                                            var221 = var221.method707((byte) 101, class7.field112.method737(0));
                                        } else if (var222.method713(class54.field1242, -22411)) {
                                            var221 = var221.method707((byte) 101, class54.field1242.method737(arg0 ^ 0xFFFFFFB9));
                                            var223 = 9;
                                        } else if (var222.method713(class29.field771, -22411)) {
                                            var221 = var221.method707((byte) 101, class29.field771.method737(0));
                                            var223 = 10;
                                        } else if (var222.method713(class7.field102, -22411)) {
                                            var223 = 11;
                                            var221 = var221.method707((byte) 101, class7.field102.method737(arg0 ^ 0xFFFFFFB9));
                                        }
                                    }
                                    class101 var224 = var221.method731(-5840);
                                    class125.field2722++;
                                    byte var225 = 0;
                                    if (var224.method713(class27.field731, -22411)) {
                                        var221 = var221.method707((byte) 101, class27.field731.method737(0));
                                        var225 = 1;
                                    } else if (var224.method713(class84.field1841, -22411)) {
                                        var225 = 2;
                                        var221 = var221.method707((byte) 101, class84.field1841.method737(arg0 ^ 0xFFFFFFB9));
                                    } else if (var224.method713(class79.field1663, -22411)) {
                                        var225 = 3;
                                        var221 = var221.method707((byte) 101, class79.field1663.method737(arg0 + 71));
                                    } else if (var224.method713(class11.field229, arg0 ^ 0x57CC)) {
                                        var221 = var221.method707((byte) 101, class11.field229.method737(arg0 ^ 0xFFFFFFB9));
                                        var225 = 4;
                                    } else if (var224.method713(field809, -22411)) {
                                        var225 = 5;
                                        var221 = var221.method707((byte) 101, field809.method737(0));
                                    } else if (class13.field287 != 0) {
                                        if (var224.method713(class27.field714, -22411)) {
                                            var221 = var221.method707((byte) 101, class27.field714.method737(arg0 + 71));
                                            var225 = 1;
                                        } else if (var224.method713(class84.field1844, -22411)) {
                                            var221 = var221.method707((byte) 101, class84.field1844.method737(0));
                                            var225 = 2;
                                        } else if (var224.method713(class79.field1665, -22411)) {
                                            var221 = var221.method707((byte) 101, class79.field1665.method737(0));
                                            var225 = 3;
                                        } else if (var224.method713(class11.field190, -22411)) {
                                            var225 = 4;
                                            var221 = var221.method707((byte) 101, class11.field190.method737(0));
                                        } else if (var224.method713(field807, -22411)) {
                                            var225 = 5;
                                            var221 = var221.method707((byte) 101, field807.method737(arg0 ^ 0xFFFFFFB9));
                                        }
                                    }
                                    class17.field364.method419(179, (byte) 0);
                                    class17.field364.method1101(0, (byte) -32);
                                    int var226 = class17.field364.field3175;
                                    class17.field364.method1101(var223, (byte) -32);
                                    class17.field364.method1101(var225, (byte) -32);
                                    class153.method1188(-67, class17.field364, var221);
                                    class17.field364.method1099(class17.field364.field3175 - var226, false);
                                }
                                continue;
                            }
                            if (var269 == 5009) {
                                var7 -= 2;
                                class131.field2989++;
                                class101 var227 = class65.field1486[var7 + 1];
                                class101 var228 = class65.field1486[var7];
                                class17.field364.method419(197, (byte) 0);
                                class17.field364.method1101(0, (byte) -32);
                                int var229 = class17.field364.field3175;
                                class17.field364.method1087(var228.method717(-96), -66);
                                class153.method1188(-72, class17.field364, var227);
                                class17.field364.method1099(class17.field364.field3175 - var229, false);
                                continue;
                            }
                            if (var269 == 5010) {
                                var5--;
                                int var230 = class127.field2885[var5];
                                class101 var231 = null;
                                if (var230 < 100) {
                                    var231 = class39.field932[var230];
                                }
                                if (var231 == null) {
                                    var231 = class27.field725;
                                }
                                class65.field1486[var7++] = var231;
                                continue;
                            }
                            if (var269 == 5011) {
                                var5--;
                                int var232 = class127.field2885[var5];
                                class101 var233 = null;
                                if (var232 < 100) {
                                    var233 = class95.field2054[var232];
                                }
                                if (var233 == null) {
                                    var233 = class27.field725;
                                }
                                class65.field1486[var7++] = var233;
                                continue;
                            }
                            if (var269 == 5015) {
                                class101 var234;
                                if (class82.field1778 == null || class82.field1778.field276 == null) {
                                    var234 = class85.field1856;
                                } else {
                                    var234 = class82.field1778.field276;
                                }
                                class65.field1486[var7++] = var234;
                                continue;
                            }
                            if (var269 == 5016) {
                                class127.field2885[var5++] = class7.field103;
                                continue;
                            }
                            if (var269 == 5017) {
                                class127.field2885[var5++] = class141.field3242;
                                continue;
                            }
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var268) {
            if (var4.field2162 == null) {
                if (class141.field3243 != 0) {
                    class111.method818(0, class27.field725, 28960, class64.field1437);
                }
                class142.method1130("CS2 - scr:" + var4.field2723 + " op:" + var6, var268, 7565);
            } else {
                class101 var265 = class132.method1024(true, 30);
                var265.method724(class24.field569, true).method724(var4.field2162, true);
                for (int var266 = class112.field2397 - 1; var266 >= 0; var266--) {
                    var265.method724(class89.field1931, true).method724(class99.field2151[var266].field36.field2162, true);
                }
                if (var6 == 40) {
                    int var267 = var9[var8];
                    var265.method724(class13.field274, true).method724(class82.method592(false, var267), true);
                }
                if (class141.field3243 != 0) {
                    class111.method818(0, class27.field725, 28960, class15.method101(-14, new class101[] { class11.field208, var4.field2162 }));
                }
                class142.method1130("CS2 - scr:" + var4.field2723 + " op:" + var6 + new String(var265.method712((byte) -27)), var268, 7565);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)I")
    public static final int method238(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -30142) {
            field806 = null;
        }
        int var4 = arg0 & 0x3;
        field804++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static final void method239(byte arg0) {
        if (!class15.field330) {
            class100.field2173[0] = 1005;
            class54.field1244 = 1;
            class98.field2129[0] = class144.field3327;
            class153.field3500[0] = class26.field672;
        }
        if (class62.field1382 != -1) {
            class118.method888(-1005, class62.field1382);
        }
        field795++;
        int var1 = -118 % ((-arg0 - 74) / 38);
        for (int var2 = 0; var2 < class157.field3626; var2++) {
            if (class129.field2938[var2]) {
                class132.field3021[var2] = true;
            }
            class78.field1626[var2] = class129.field2938[var2];
            class129.field2938[var2] = false;
        }
        class24.field627 = -1;
        class105.field2258 = -1;
        class90.field1966 = null;
        class158.field3636 = class143.field3305;
        if (class62.field1382 != -1) {
            class157.field3626 = 0;
            class142.method1134(0, class62.field1382, 0, (byte) 107, 503, -1, 0, 765, 0);
        }
        class38.method288();
        class52.method375((byte) 47);
        if (class15.field330) {
            class5.method22((byte) -20);
        } else if (class24.field627 != -1) {
            class8.method42((byte) 80, class105.field2258, class24.field627);
        }
        if (class135.field3096 == 3) {
            for (int var3 = 0; var3 < class157.field3626; var3++) {
                if (class78.field1626[var3]) {
                    class38.method284(class126.field2818[var3], class96.field2076[var3], class131.field2990[var3], class85.field1893[var3], 16711935, 128);
                } else if (class132.field3021[var3]) {
                    class38.method284(class126.field2818[var3], class96.field2076[var3], class131.field2990[var3], class85.field1893[var3], 16711680, 128);
                }
            }
        }
        class152.method1184(class95.field2040, class141.field3255, -101, class82.field1778.field1298, class82.field1778.field1341);
        class141.field3255 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method240(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
    public abstract int method241(int arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lsa;IB)V")
    public static final void method242(class126[] arg0, int arg1, byte arg2) {
        if (arg2 >= -118) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class126 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field2782 == 0) {
                    if (var4.field2822 != null) {
                        method242(var4.field2822, arg1, (byte) -121);
                    }
                    class133 var5 = (class133) class96.field2092.method1141((long) var4.field2780, -1);
                    if (var5 != null) {
                        class138.method1100(arg1, (byte) 121, var5.field3044);
                    }
                }
                if (arg1 == 0 && var4.field2813 != null) {
                    class141 var6 = new class141();
                    var6.field3247 = var4.field2813;
                    var6.field3238 = var4;
                    method237((byte) -71, var6);
                }
                if (arg1 == 1 && var4.field2868 != null) {
                    if (var4.field2807 >= 0) {
                        class126 var7 = class78.method532(0, var4.field2780);
                        if (var7 == null || var7.field2822 == null || var7.field2822.length <= var4.field2807 || var7.field2822[var4.field2807] != var4) {
                            continue;
                        }
                    }
                    class141 var8 = new class141();
                    var8.field3238 = var4;
                    var8.field3247 = var4.field2868;
                    method237((byte) -71, var8);
                }
            }
        }
        field802++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method243(int arg0) {
        field793 = null;
        field808 = null;
        field806 = null;
        field809 = null;
        field805 = null;
        if (arg0 != -1413) {
            method239((byte) 35);
        }
        field798 = null;
        field807 = null;
        field792 = null;
        field803 = null;
        field810 = null;
        field800 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method244(Component arg0, int arg1);
}
