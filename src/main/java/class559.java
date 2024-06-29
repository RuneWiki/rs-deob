import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class559 {

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "F")
    public float field7299 = 1.0F;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "F")
    public float field7303 = 1.0F;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "F")
    public float field7305 = 0.25F;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "F")
    public float field7294;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public int field7301;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public int field7297;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "F")
    public float field7304;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field7287;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lkn;")
    public class307 field7290;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public int field7286;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "F")
    public float field7293;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field7291;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public int field7292;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "[I")
    public static int[] field7302 = new int[1000];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lme;")
    public static class668 field7285 = new class668(4);

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Lft;")
    public static class285 field7308 = new class285(11, 5);

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "F")
    public static float field7298;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method2988(int arg0) {
        field7308 = null;
        field7285 = null;
        field7302 = null;
        if (arg0 != 2103046438) {
            field7298 = -0.20833342F;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static final void method2989(byte arg0) {
        field7306++;
        class668 var1 = class207.field2671;
        synchronized (class207.field2671) {
            class207.field2671.method3656((byte) 0);
        }
        class668 var2 = class201.field2622;
        synchronized (class201.field2622) {
            class201.field2622.method3656((byte) 0);
        }
        if (arg0 != 30) {
            method2988(27);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILcda;)Z")
    public static final boolean method2990(int arg0, int arg1, class534 arg2) {
        field7288++;
        int var3 = arg2.method2845(2, 8);
        if (var3 == 0) {
            if (arg2.method2845(1, 8) != 0) {
                method2990(-125, arg1, arg2);
            }
            int var4 = arg2.method2845(6, 8);
            int var5 = arg2.method2845(6, 8);
            boolean var6 = arg2.method2845(1, 8) == 1;
            if (var6) {
                class651.field9061[class109.field1411++] = arg1;
            }
            if (class592.field8019[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class244 var7 = class528.field6869[arg1];
            class193 var8 = class592.field8019[arg1] = new class193();
            var8.field2960 = arg1;
            if (class122.field1564[arg1] != null) {
                var8.method1275(class122.field1564[arg1], 0);
            }
            var8.method1422(var7.field3270, -63, true);
            var8.field3001 = var7.field3271;
            int var9 = var7.field3265;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FEE18) >> 14;
            int var12 = var9 & 0xFF;
            var8.field2500 = var7.field3269;
            var8.field3032[0] = class324.field4210[arg1];
            var8.field508 = (byte) var10;
            var8.method1263((var11 << 6) + var4 - class100.field1326, (byte) 57, (var12 << 6) + var5 - class186.field2376);
            var8.field2512 = false;
            class528.field6869[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method2845(2, 8);
            int var14 = class528.field6869[arg1].field3265;
            class528.field6869[arg1].field3265 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method2845(5, 8);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class528.field6869[arg1].field3265;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FD994) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class528.field6869[arg1].field3265 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg2.method2845(18, 8);
            int var23 = var22 >> 16;
            if (arg0 >= -124) {
                field7308 = null;
            }
            int var24 = (var22 & 0xFFD6) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class528.field6869[arg1].field3265;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class528.field6869[arg1].field3265 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lfd;I)V")
    public final void method2991(class418 arg0, int arg1) {
        this.field7299 = (float) (arg0.method2396(91) * 8) / 255.0F;
        field7289++;
        this.field7305 = (float) (arg0.method2396(-112) * arg1) / 255.0F;
        this.field7303 = (float) (arg0.method2396(-123) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)Z")
    public static final boolean method2992(byte arg0, int arg1, int arg2) {
        field7307++;
        if (arg0 != -84) {
            method2990(-89, -68, null);
        }
        return (class376.method2153(-56, arg2, arg1) | class493.method2692(arg2, true, arg1) | class607.method3300(arg1, arg2, 52)) & class427.method2454((byte) 112, arg1, arg2);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILoi;)V")
    public static final void method2993(int arg0, int arg1, int arg2, class57 arg3) {
        field7295++;
        if (arg3 == null || class658.field9176.field4702 == arg3) {
            return;
        }
        int var4 = arg3.field778;
        int var5 = arg3.field777;
        int var6 = arg3.field776;
        int var7 = (int) arg3.field774;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg3.field774;
        if (var6 == 19) {
            class103.field1374 = 0;
            class203.field2643++;
            class352.field4517 = 1;
            class284.field3697 = arg1;
            class629.field8781 = arg2;
            class11 var10 = class130.method931(class649.field9035, (byte) 54, class266.field3558);
            var10.field114.method2386(class467.field6103, 1103587288);
            var10.field114.method2416(class634.field8832, 121);
            var10.field114.method2414(false, class34.field499);
            var10.field114.method2386(class100.field1326 + var4, 1103587288);
            var10.field114.method2414(false, class186.field2376 + var5);
            class100.method760(var10, 36);
            class367.method2112(0, -4, true, var5, var4, 1, 1, 0, true);
        }
        if (var6 == 1004) {
            class629.field8781 = arg2;
            class72.field976++;
            class103.field1374 = 0;
            class352.field4517 = 2;
            class284.field3697 = arg1;
            class11 var11 = class130.method931(class649.field9035, (byte) 54, class347.field4433);
            var11.field114.method2386(var7, arg0 + 1103609966);
            class100.method760(var11, -117);
        }
        if (var6 == 3) {
            if (class54.field741 > 0 && class390.field4990.method3168(256, 82) && class390.field4990.method3168(256, 81)) {
                class438.method2489(class100.field1326 + var4, -1011358554, class233.field3130.field508, class186.field2376 + var5);
            } else {
                class103.field1374 = 0;
                class284.field3697 = arg1;
                class352.field4517 = 1;
                class1.field2++;
                class629.field8781 = arg2;
                class11 var12 = class130.method931(class649.field9035, (byte) 54, class354.field4552);
                var12.field114.method2385(class100.field1326 + var4, -1540);
                var12.field114.method2386(class186.field2376 + var5, 1103587288);
                class100.method760(var12, arg0 + 22563);
            }
        }
        if (var6 == 6) {
            class193 var13 = class592.field8019[var7];
            if (var13 != null) {
                class284.field3697 = arg1;
                class629.field8781 = arg2;
                class9.field97++;
                class352.field4517 = 2;
                class103.field1374 = 0;
                class11 var14 = class130.method931(class649.field9035, (byte) 54, class380.field4884);
                var14.field114.method2386(class34.field499, 1103587288);
                var14.field114.method2395(var7, (byte) 120);
                var14.field114.method2404(128, class390.field4990.method3168(arg0 + 22934, 82) ? 1 : 0);
                var14.field114.method2353(class634.field8832, (byte) -28);
                var14.field114.method2395(class467.field6103, (byte) 97);
                class100.method760(var14, arg0 + 22674);
                class367.method2112(0, -2, true, var13.field3039[0], var13.field3030[0], var13.method1265(72), var13.method1265(arg0 + 22785), 0, true);
            }
        }
        if (var6 == 25) {
            class234 var15 = (class234) class505.field6640.method39((long) var7, 31750);
            if (var15 != null) {
                class193.field2510++;
                class103.field1374 = 0;
                class284.field3697 = arg1;
                class532 var16 = var15.field3131;
                class352.field4517 = 2;
                class629.field8781 = arg2;
                class11 var17 = class130.method931(class649.field9035, (byte) 54, class168.field2094);
                var17.field114.method2414(false, var7);
                var17.field114.method2404(128, class390.field4990.method3168(256, 82) ? 1 : 0);
                class100.method760(var17, arg0 ^ 0x58F5);
                class367.method2112(0, -2, true, var16.field3039[0], var16.field3030[0], var16.method1265(109), var16.method1265(89), 0, true);
            }
        }
        if (var6 == 1008 || var6 == 1010 || var6 == 1012 || var6 == 1011 || var6 == 1007) {
            class274.method1663(arg0 + 9562, var4, var7, var6);
        }
        if (var6 == 44) {
            class352.field4517 = 2;
            class629.field8781 = arg2;
            class416.field5340++;
            class284.field3697 = arg1;
            class103.field1374 = 0;
            class11 var18 = class130.method931(class649.field9035, (byte) 54, class135.field1785);
            var18.field114.method2404(arg0 ^ 0xFFFFA7EA, class390.field4990.method3168(256, 82) ? 1 : 0);
            var18.field114.method2395(var5 + class186.field2376, (byte) -35);
            var18.field114.method2395(class100.field1326 + var4, (byte) -32);
            var18.field114.method2385(var7, -1540);
            class100.method760(var18, 100);
            class51.method457(var5, (byte) -45, var4);
        }
        if (var6 == 22) {
            class234 var19 = (class234) class505.field6640.method39((long) var7, arg0 ^ 0xFFFFDB6C);
            if (var19 != null) {
                class532 var20 = var19.field3131;
                class352.field4517 = 2;
                class284.field3697 = arg1;
                class3.field21++;
                class103.field1374 = 0;
                class629.field8781 = arg2;
                class11 var21 = class130.method931(class649.field9035, (byte) 54, class414.field5326);
                var21.field114.method2385(var7, -1540);
                var21.field114.method2353(class634.field8832, (byte) -67);
                var21.field114.method2352(true, class390.field4990.method3168(arg0 ^ 0xFFFFA66A, 82) ? 1 : 0);
                var21.field114.method2414(false, class34.field499);
                var21.field114.method2414(false, class467.field6103);
                class100.method760(var21, -5);
                class367.method2112(0, -2, true, var20.field3039[0], var20.field3030[0], var20.method1265(104), var20.method1265(88), 0, true);
            }
        }
        if (var6 == 11 && class357.field4636 == null) {
            class276.method1674(var4, (byte) -116, var5);
            class357.field4636 = class386.method2203(var5, arg0 + 22678, var4);
            class386.method2199(class357.field4636, false);
        }
        if (var6 == 15 || var6 == 1003) {
            class619.method3378(var4, arg3.field770, var5, (byte) -68, var7);
        }
        if (var6 == 59) {
            class193 var22 = class592.field8019[var7];
            if (var22 != null) {
                class83.field1126++;
                class103.field1374 = 0;
                class284.field3697 = arg1;
                class352.field4517 = 2;
                class629.field8781 = arg2;
                class11 var23 = class130.method931(class649.field9035, (byte) 54, class485.field6463);
                var23.field114.method2386(var7, 1103587288);
                var23.field114.method2404(128, class390.field4990.method3168(256, 82) ? 1 : 0);
                class100.method760(var23, arg0 ^ 0xFFFFA73B);
                class367.method2112(0, -2, true, var22.field3039[0], var22.field3030[0], var22.method1265(106), var22.method1265(117), 0, true);
            }
        }
        if (arg0 != -22678) {
            field7308 = null;
        }
        if (var6 == 9) {
            class193 var24 = class592.field8019[var7];
            if (var24 != null) {
                class284.field3697 = arg1;
                class629.field8781 = arg2;
                class352.field4517 = 2;
                class103.field1374 = 0;
                class215.field2761++;
                class11 var25 = class130.method931(class649.field9035, (byte) 54, class691.field9447);
                var25.field114.method2414(false, var7);
                var25.field114.method2360(class390.field4990.method3168(256, 82) ? 1 : 0, arg0 + 22568);
                class100.method760(var25, 79);
                class367.method2112(0, -2, true, var24.field3039[0], var24.field3030[0], var24.method1265(71), var24.method1265(108), 0, true);
            }
        }
        if (var6 == 47) {
            class193 var26 = class592.field8019[var7];
            if (var26 != null) {
                class284.field3697 = arg1;
                class629.field8781 = arg2;
                class352.field4517 = 2;
                class275.field3608++;
                class103.field1374 = 0;
                class11 var27 = class130.method931(class649.field9035, (byte) 54, class692.field9462);
                var27.field114.method2414(false, var7);
                var27.field114.method2360(class390.field4990.method3168(256, 82) ? 1 : 0, -89);
                class100.method760(var27, -119);
                class367.method2112(0, -2, true, var26.field3039[0], var26.field3030[0], var26.method1265(arg0 + 22769), var26.method1265(97), 0, true);
            }
        }
        if (var6 == 1002) {
            class633.field8820++;
            class352.field4517 = 2;
            class103.field1374 = 0;
            class629.field8781 = arg2;
            class284.field3697 = arg1;
            class11 var28 = class130.method931(class649.field9035, (byte) 54, class710.field9935);
            var28.field114.method2386(var7, 1103587288);
            class100.method760(var28, -108);
        }
        if (var6 == 17) {
            class103.field1374 = 0;
            class9.field97++;
            class629.field8781 = arg2;
            class352.field4517 = 2;
            class284.field3697 = arg1;
            class11 var29 = class130.method931(class649.field9035, (byte) 54, class380.field4884);
            var29.field114.method2386(class34.field499, 1103587288);
            var29.field114.method2395(class233.field3130.field2960, (byte) -127);
            var29.field114.method2404(128, class390.field4990.method3168(256, 82) ? 1 : 0);
            var29.field114.method2353(class634.field8832, (byte) -35);
            var29.field114.method2395(class467.field6103, (byte) -42);
            class100.method760(var29, -111);
        }
        if (var6 == 60) {
            class351.field4499++;
            class284.field3697 = arg1;
            class352.field4517 = 2;
            class629.field8781 = arg2;
            class103.field1374 = 0;
            class11 var30 = class130.method931(class649.field9035, (byte) 54, class629.field8779);
            var30.field114.method2385((int) (var8 >>> 32) & Integer.MAX_VALUE, arg0 ^ 0x5E96);
            var30.field114.method2386(class100.field1326 + var4, 1103587288);
            var30.field114.method2385(class186.field2376 + var5, -1540);
            var30.field114.method2376((byte) -90, class634.field8832);
            var30.field114.method2352(true, class390.field4990.method3168(256, 82) ? 1 : 0);
            var30.field114.method2385(class467.field6103, -1540);
            var30.field114.method2395(class34.field499, (byte) 118);
            class100.method760(var30, -115);
            class692.method3770(var5, 8080, var4, var8);
        }
        if (var6 == 1006) {
            class629.field8781 = arg2;
            class229.field3052++;
            class284.field3697 = arg1;
            class103.field1374 = 0;
            class352.field4517 = 2;
            class11 var31 = class130.method931(class649.field9035, (byte) 54, class585.field7935);
            var31.field114.method2386((int) (var8 >>> 32) & Integer.MAX_VALUE, 1103587288);
            var31.field114.method2414(false, class100.field1326 + var4);
            var31.field114.method2395(class186.field2376 + var5, (byte) 86);
            var31.field114.method2404(128, class390.field4990.method3168(256, 82) ? 1 : 0);
            class100.method760(var31, arg0 + 22804);
            class692.method3770(var5, 8080, var4, var8);
        }
        if (var6 == 46) {
            class193 var32 = class592.field8019[var7];
            if (var32 != null) {
                class352.field4517 = 2;
                class629.field8781 = arg2;
                class284.field3697 = arg1;
                class88.field1167++;
                class103.field1374 = 0;
                class11 var33 = class130.method931(class649.field9035, (byte) 54, class679.field9365);
                var33.field114.method2361(class390.field4990.method3168(256, 82) ? 1 : 0, true);
                var33.field114.method2385(var7, -1540);
                class100.method760(var33, arg0 ^ 0x58FF);
                class367.method2112(0, -2, true, var32.field3039[0], var32.field3030[0], var32.method1265(arg0 ^ 0xFFFFA72D), var32.method1265(arg0 ^ 0xFFFFA700), 0, true);
            }
        }
        if (var6 == 12) {
            class193 var34 = class592.field8019[var7];
            if (var34 != null) {
                class103.field1374 = 0;
                class629.field8781 = arg2;
                class284.field3697 = arg1;
                class352.field4517 = 2;
                class32.field481++;
                class11 var35 = class130.method931(class649.field9035, (byte) 54, class289.field3742);
                var35.field114.method2386(var7, 1103587288);
                var35.field114.method2360(class390.field4990.method3168(256, 82) ? 1 : 0, 115);
                class100.method760(var35, -102);
                class367.method2112(0, -2, true, var34.field3039[0], var34.field3030[0], var34.method1265(90), var34.method1265(arg0 ^ 0xFFFFA731), 0, true);
            }
        }
        if (var6 == 58) {
            class193 var36 = class592.field8019[var7];
            if (var36 != null) {
                class352.field4517 = 2;
                class103.field1374 = 0;
                class62.field847++;
                class629.field8781 = arg2;
                class284.field3697 = arg1;
                class11 var37 = class130.method931(class649.field9035, (byte) 54, class275.field3612);
                var37.field114.method2360(class390.field4990.method3168(256, 82) ? 1 : 0, -75);
                var37.field114.method2395(var7, (byte) -16);
                class100.method760(var37, -100);
                class367.method2112(0, -2, true, var36.field3039[0], var36.field3030[0], var36.method1265(75), var36.method1265(123), 0, true);
            }
        }
        if (var6 == 49) {
            class629.field8781 = arg2;
            class284.field3697 = arg1;
            class352.field4517 = 2;
            field7296++;
            class103.field1374 = 0;
            class11 var38 = class130.method931(class649.field9035, (byte) 54, class656.field9159);
            var38.field114.method2360(class390.field4990.method3168(256, 82) ? 1 : 0, 67);
            var38.field114.method2395(var4 + class100.field1326, (byte) 112);
            var38.field114.method2385(Integer.MAX_VALUE & (int) (var8 >>> 32), -1540);
            var38.field114.method2414(false, class186.field2376 + var5);
            class100.method760(var38, 63);
            class692.method3770(var5, 8080, var4, var8);
        }
        if (var6 == 1001) {
            class284.field3697 = arg1;
            class352.field4517 = 2;
            class629.field8781 = arg2;
            class103.field1374 = 0;
            class234 var39 = (class234) class505.field6640.method39((long) var7, 31750);
            if (var39 != null) {
                class532 var40 = var39.field3131;
                class699 var41 = var40.field6914;
                if (var41.field9714 != null) {
                    var41 = var41.method3823(class397.field5054, -32574);
                }
                if (var41 != null) {
                    class33.field489++;
                    class11 var42 = class130.method931(class649.field9035, (byte) 54, class39.field556);
                    var42.field114.method2386(var41.field9691, 1103587288);
                    class100.method760(var42, arg0 + 22550);
                }
            }
        }
        if (var6 == 48) {
            class352.field4517 = 2;
            class629.field8781 = arg2;
            class507.field6663++;
            class284.field3697 = arg1;
            class103.field1374 = 0;
            class11 var43 = class130.method931(class649.field9035, (byte) 54, class492.field6516);
            var43.field114.method2385(class100.field1326 + var4, arg0 ^ 0x5E96);
            var43.field114.method2395(class186.field2376 + var5, (byte) 120);
            var43.field114.method2352(true, class390.field4990.method3168(256, 82) ? 1 : 0);
            var43.field114.method2395((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) -55);
            class100.method760(var43, -110);
            class692.method3770(var5, arg0 ^ 0xFFFFB8FA, var4, var8);
        }
        if (var6 == 57) {
            class69.field925++;
            class284.field3697 = arg1;
            class629.field8781 = arg2;
            class103.field1374 = 0;
            class352.field4517 = 2;
            class11 var44 = class130.method931(class649.field9035, (byte) 54, class228.field3045);
            var44.field114.method2395(class186.field2376 + var5, (byte) -52);
            var44.field114.method2414(false, class100.field1326 + var4);
            var44.field114.method2386((int) (var8 >>> 32) & Integer.MAX_VALUE, 1103587288);
            var44.field114.method2404(128, class390.field4990.method3168(256, 82) ? 1 : 0);
            class100.method760(var44, -116);
            class692.method3770(var5, arg0 ^ 0xFFFFB8FA, var4, var8);
        }
        if (var6 == 20) {
            class193 var45 = class592.field8019[var7];
            if (var45 != null) {
                class284.field3697 = arg1;
                class103.field1374 = 0;
                class352.field4517 = 2;
                class472.field6149++;
                class629.field8781 = arg2;
                class11 var46 = class130.method931(class649.field9035, (byte) 54, class160.field2002);
                var46.field114.method2360(class390.field4990.method3168(256, 82) ? 1 : 0, 79);
                var46.field114.method2386(var7, 1103587288);
                class100.method760(var46, 1);
                class367.method2112(0, -2, true, var45.field3039[0], var45.field3030[0], var45.method1265(77), var45.method1265(123), 0, true);
            }
        }
        if (var6 == 10) {
            class234 var47 = (class234) class505.field6640.method39((long) var7, 31750);
            if (var47 != null) {
                class51.field711++;
                class532 var48 = var47.field3131;
                class103.field1374 = 0;
                class629.field8781 = arg2;
                class284.field3697 = arg1;
                class352.field4517 = 2;
                class11 var49 = class130.method931(class649.field9035, (byte) 54, class557.field7278);
                var49.field114.method2395(var7, (byte) -22);
                var49.field114.method2361(class390.field4990.method3168(256, 82) ? 1 : 0, true);
                class100.method760(var49, -118);
                class367.method2112(0, -2, true, var48.field3039[0], var48.field3030[0], var48.method1265(124), var48.method1265(arg0 ^ 0xFFFFA71A), 0, true);
            }
        }
        if (var6 == 50) {
            class477 var50 = class386.method2203(var5, 0, var4);
            if (var50 != null) {
                class221.method1402((byte) 68, var50);
            }
        }
        if (var6 == 5) {
            class477 var51 = class386.method2203(var5, 0, var4);
            if (var51 != null) {
                class695.method3778((byte) 22);
                class162 var52 = client.method696(var51);
                class329.method1905(var52.method1142((byte) -124), var51, (byte) 31, var52.field2018);
                class295.field3842 = class355.method2043((byte) -92, var51);
                class542.field7044 = var51.field6315 + "<col=ffffff>";
                if (class295.field3842 == null) {
                    class295.field3842 = "Null";
                }
            }
            return;
        }
        if (var6 == 4) {
            class284.field3697 = arg1;
            class578.field7868++;
            class352.field4517 = 2;
            class629.field8781 = arg2;
            class103.field1374 = 0;
            class11 var53 = class130.method931(class649.field9035, (byte) 54, class72.field992);
            var53.field114.method2414(false, var7);
            var53.field114.method2385(class186.field2376 + var5, arg0 ^ 0x5E96);
            var53.field114.method2360(class390.field4990.method3168(arg0 + 22934, 82) ? 1 : 0, -77);
            var53.field114.method2395(var4 + class100.field1326, (byte) -87);
            class100.method760(var53, 37);
            class51.method457(var5, (byte) -45, var4);
        }
        if (var6 == 18) {
            class103.field1374 = 0;
            class130.field1668++;
            class352.field4517 = 2;
            class284.field3697 = arg1;
            class629.field8781 = arg2;
            class11 var54 = class130.method931(class649.field9035, (byte) 54, class344.field4402);
            var54.field114.method2352(true, class390.field4990.method3168(256, 82) ? 1 : 0);
            var54.field114.method2395(var5 + class186.field2376, (byte) 71);
            var54.field114.method2386(Integer.MAX_VALUE & (int) (var8 >>> 32), 1103587288);
            var54.field114.method2395(class100.field1326 + var4, (byte) 114);
            class100.method760(var54, -112);
            class692.method3770(var5, 8080, var4, var8);
        }
        if (var6 == 16) {
            class352.field4517 = 2;
            class103.field1374 = 0;
            class284.field3697 = arg1;
            class486.field6468++;
            class629.field8781 = arg2;
            class11 var55 = class130.method931(class649.field9035, (byte) 54, class427.field5533);
            var55.field114.method2395(var7, (byte) -33);
            var55.field114.method2352(true, class390.field4990.method3168(256, 82) ? 1 : 0);
            var55.field114.method2385(var4 + class100.field1326, -1540);
            var55.field114.method2414(false, class186.field2376 + var5);
            class100.method760(var55, 50);
            class51.method457(var5, (byte) -45, var4);
        }
        if (var6 == 2) {
            class193 var56 = class592.field8019[var7];
            if (var56 != null) {
                class103.field1374 = 0;
                class476.field6212++;
                class352.field4517 = 2;
                class284.field3697 = arg1;
                class629.field8781 = arg2;
                class11 var57 = class130.method931(class649.field9035, (byte) 54, class287.field3713);
                var57.field114.method2361(class390.field4990.method3168(256, 82) ? 1 : 0, true);
                var57.field114.method2385(var7, -1540);
                class100.method760(var57, -124);
                class367.method2112(0, -2, true, var56.field3039[0], var56.field3030[0], var56.method1265(78), var56.method1265(70), 0, true);
            }
        }
        if (var6 == 21) {
            class284.field3697 = arg1;
            class507.field6654++;
            class103.field1374 = 0;
            class629.field8781 = arg2;
            class352.field4517 = 2;
            class11 var58 = class130.method931(class649.field9035, (byte) 54, class282.field3680);
            var58.field114.method2385(var7, -1540);
            var58.field114.method2353(class634.field8832, (byte) -109);
            var58.field114.method2361(class390.field4990.method3168(256, 82) ? 1 : 0, true);
            var58.field114.method2385(class186.field2376 + var5, -1540);
            var58.field114.method2386(class34.field499, 1103587288);
            var58.field114.method2414(false, class467.field6103);
            var58.field114.method2414(false, class100.field1326 + var4);
            class100.method760(var58, arg0 + 22570);
            class51.method457(var5, (byte) -45, var4);
        }
        if (var6 == 30) {
            if (class54.field741 > 0 && class390.field4990.method3168(256, 82) && class390.field4990.method3168(256, 81)) {
                class438.method2489(class100.field1326 + var4, -1011358554, class233.field3130.field508, class186.field2376 + var5);
            } else {
                class11 var59 = class669.method3664(var4, var7, var5, arg0 ^ 0xFFFFA76A);
                if (var7 == 1) {
                    var59.field114.method2352(true, -1);
                    var59.field114.method2352(true, -1);
                    var59.field114.method2386((int) class141.field1859, 1103587288);
                    var59.field114.method2352(true, 57);
                    var59.field114.method2352(true, class7.field56);
                    var59.field114.method2352(true, class279.field3653);
                    var59.field114.method2352(true, 89);
                    var59.field114.method2386(class233.field3130.field506, 1103587288);
                    var59.field114.method2386(class233.field3130.field503, arg0 + 1103609966);
                    var59.field114.method2352(true, 63);
                } else {
                    class284.field3697 = arg1;
                    class103.field1374 = 0;
                    class352.field4517 = 1;
                    class629.field8781 = arg2;
                }
                class100.method760(var59, -128);
                class367.method2112(0, -4, true, var5, var4, 1, 1, 0, true);
            }
        }
        if (var6 == 8) {
            class234 var60 = (class234) class505.field6640.method39((long) var7, 31750);
            if (var60 != null) {
                class352.field4517 = 2;
                class103.field1374 = 0;
                class694.field9486++;
                class284.field3697 = arg1;
                class629.field8781 = arg2;
                class532 var61 = var60.field3131;
                class11 var62 = class130.method931(class649.field9035, (byte) 54, class445.field5726);
                var62.field114.method2352(true, class390.field4990.method3168(arg0 + 22934, 82) ? 1 : 0);
                var62.field114.method2395(var7, (byte) 86);
                class100.method760(var62, arg0 + 22550);
                class367.method2112(0, -2, true, var61.field3039[0], var61.field3030[0], var61.method1265(arg0 + 22767), var61.method1265(118), 0, true);
            }
        }
        if (var6 == 45) {
            class234 var63 = (class234) class505.field6640.method39((long) var7, 31750);
            if (var63 != null) {
                class352.field4517 = 2;
                class629.field8781 = arg2;
                class103.field1374 = 0;
                class284.field3697 = arg1;
                class532 var64 = var63.field3131;
                class701.field9800++;
                class11 var65 = class130.method931(class649.field9035, (byte) 54, class641.field8928);
                var65.field114.method2360(class390.field4990.method3168(arg0 + 22934, 82) ? 1 : 0, -83);
                var65.field114.method2414(false, var7);
                class100.method760(var65, 1);
                class367.method2112(0, -2, true, var64.field3039[0], var64.field3030[0], var64.method1265(125), var64.method1265(arg0 ^ 0xFFFFA708), 0, true);
            }
        }
        if (var6 == 13) {
            class234 var66 = (class234) class505.field6640.method39((long) var7, 31750);
            if (var66 != null) {
                class352.field4517 = 2;
                class79.field1082++;
                class284.field3697 = arg1;
                class103.field1374 = 0;
                class532 var67 = var66.field3131;
                class629.field8781 = arg2;
                class11 var68 = class130.method931(class649.field9035, (byte) 54, class278.field3648);
                var68.field114.method2395(var7, (byte) 92);
                var68.field114.method2404(arg0 ^ 0xFFFFA7EA, class390.field4990.method3168(256, 82) ? 1 : 0);
                class100.method760(var68, arg0 + 22802);
                class367.method2112(0, -2, true, var67.field3039[0], var67.field3030[0], var67.method1265(96), var67.method1265(82), 0, true);
            }
        }
        if (var6 == 23) {
            class699.field9724++;
            class352.field4517 = 2;
            class284.field3697 = arg1;
            class103.field1374 = 0;
            class629.field8781 = arg2;
            class11 var69 = class130.method931(class649.field9035, (byte) 54, class123.field1602);
            var69.field114.method2352(true, class390.field4990.method3168(256, 82) ? 1 : 0);
            var69.field114.method2386(var7, 1103587288);
            var69.field114.method2385(class186.field2376 + var5, -1540);
            var69.field114.method2385(class100.field1326 + var4, -1540);
            class100.method760(var69, 21);
            class51.method457(var5, (byte) -45, var4);
        }
        if (var6 == 51) {
            class217.field2852++;
            class284.field3697 = arg1;
            class352.field4517 = 2;
            class103.field1374 = 0;
            class629.field8781 = arg2;
            class11 var70 = class130.method931(class649.field9035, (byte) 54, class305.field4012);
            var70.field114.method2395(var7, (byte) 99);
            var70.field114.method2386(class100.field1326 + var4, 1103587288);
            var70.field114.method2360(class390.field4990.method3168(256, 82) ? 1 : 0, arg0 + 22768);
            var70.field114.method2386(class186.field2376 + var5, 1103587288);
            class100.method760(var70, 126);
            class51.method457(var5, (byte) -45, var4);
        }
        if (class499.field6560) {
            class695.method3778((byte) 22);
        }
        if (class255.field3465 != null && class224.field2918 == 0) {
            class386.method2199(class255.field3465, false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjd;)Z")
    public final boolean method2994(byte arg0, class559 arg1) {
        if (arg0 != -55) {
            this.field7305 = 0.062356584F;
        }
        field7300++;
        return this.field7297 == arg1.field7297 && this.field7304 == arg1.field7304 && this.field7293 == arg1.field7293 && this.field7294 == arg1.field7294 && this.field7305 == arg1.field7305 && this.field7299 == arg1.field7299 && this.field7303 == arg1.field7303 && this.field7292 == arg1.field7292 && this.field7291 == arg1.field7291 && this.field7290 == arg1.field7290;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class559() {
        this.field7294 = 1.2F;
        this.field7301 = -50;
        this.field7297 = class563.field7341;
        this.field7304 = 1.1523438F;
        this.field7287 = -50;
        this.field7290 = class215.field2772;
        this.field7286 = -60;
        this.field7293 = 0.69921875F;
        this.field7291 = 0;
        this.field7292 = class21.field234;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lfd;)V")
    public class559(class418 arg0) {
        int var2 = arg0.method2396(121);
        if (class260.field3509.method734((byte) 86, class364.field4697) && class408.field5286.method384() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field7297 = class563.field7341;
            } else {
                this.field7297 = arg0.method2355(88);
            }
            if ((var2 & 0x2) == 0) {
                this.field7304 = 1.1523438F;
            } else {
                this.field7304 = (float) arg0.method2393(-30727) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field7293 = 0.69921875F;
            } else {
                this.field7293 = (float) arg0.method2393(-30727) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field7294 = 1.2F;
            } else {
                this.field7294 = (float) arg0.method2393(-30727) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2355(100);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2393(-30727);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2393(-30727);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2393(-30727);
            }
            this.field7294 = 1.2F;
            this.field7293 = 0.69921875F;
            this.field7297 = class563.field7341;
            this.field7304 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field7286 = -60;
            this.field7301 = -50;
            this.field7287 = -50;
        } else {
            this.field7301 = arg0.method2383(65280);
            this.field7286 = arg0.method2383(65280);
            this.field7287 = arg0.method2383(65280);
        }
        if ((var2 & 0x20) == 0) {
            this.field7292 = class21.field234;
        } else {
            this.field7292 = arg0.method2355(118);
        }
        if ((var2 & 0x40) == 0) {
            this.field7291 = 0;
        } else {
            this.field7291 = arg0.method2393(-30727);
        }
        if ((var2 & 0x80) == 0) {
            this.field7290 = class215.field2772;
        } else {
            int var3 = arg0.method2393(-30727);
            int var4 = arg0.method2393(-30727);
            int var5 = arg0.method2393(-30727);
            int var6 = arg0.method2393(-30727);
            int var7 = arg0.method2393(-30727);
            int var8 = arg0.method2393(-30727);
            this.field7290 = class290.method1724(var4, var3, (byte) 126, var6, var5, var7, var8);
        }
    }
}
