import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class257 {

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3849 = 3;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3850 = -1;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "F")
    public static float field3844 = 0.0F;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3851 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lln;")
    public static class118 field3846;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIB)I", line = 5)
    public static final int method1889(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 65) {
            method1892(71);
        }
        field3847++;
        if (arg0 == arg1) {
            return arg1;
        } else {
            int var4 = 128 - arg2;
            int var5 = (arg0 >>> 7 & 0x1FE01FE) * arg2 + (arg1 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
            int var6 = (arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)Z", line = 25)
    public static final boolean method1890(int arg0, int arg1, int arg2, int arg3) {
        if (class362.method2547(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class175.method1224(var4 + 1, class132.field1930[arg0][arg1][arg2] + arg3, var5 + 1) && class175.method1224(var4 + 128 - 1, class132.field1930[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class175.method1224(var4 + 128 - 1, class132.field1930[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class175.method1224(var4 + 1, class132.field1930[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lqf;I)Lqf;", line = 41)
    public static final class359 method1891(class359 arg0, int arg1) {
        field3848++;
        if (arg0.field5638 != -1) {
            return class231.method1719(arg0.field5638, 121);
        }
        int var2 = arg0.field5521 >>> 16;
        if (arg1 != 2) {
            return (class359) null;
        }
        class336 var3 = new class336(class288.field4360);
        for (class98 var4 = (class98) var3.method2370(-82); var4 != null; var4 = (class98) var3.method2369(false)) {
            if (var4.field1393 == var2) {
                return class231.method1719((int) var4.field1656, 118);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 80)
    public static void method1892(int arg0) {
        field3846 = null;
        if (arg0 <= 110) {
            field3850 = -79;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIILqf;)V", line = 90)
    public static final void method1893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class359 arg6) {
        field3843++;
        if (arg5 != -12193) {
            method1892(90);
        }
        class200 var7 = class349.method2447(arg1, (byte) -9);
        if (var7 == null || !var7.field2917 || !var7.method1455(119)) {
            return;
        }
        if (var7.field2932 != null) {
            int[] var8 = new int[var7.field2932.length];
            for (int var9 = 0; var9 < var8.length / 2; var9++) {
                int var10;
                if (class86.field1208 == 4) {
                    var10 = (int) class36.field535 & 0x7FF;
                } else {
                    var10 = (int) class36.field535 + class298.field4460 & 0x7FF;
                }
                int var11 = class345.field5343[var10];
                int var12 = class345.field5339[var10];
                if (class86.field1208 != 4) {
                    var12 = var12 * 256 / (class281.field4271 + 256);
                    var11 = var11 * 256 / (class281.field4271 + 256);
                }
                var8[var9 * 2] = arg6.field5506 / 2 + ((var7.field2932[var9 * 2] * 4 + arg3) * var11 + (var7.field2932[var9 * 2 + 1] * 4 + arg4) * var12 >> 16) + arg0;
                var8[var9 * 2 + 1] = arg6.field5560 / 2 + arg2 - ((var7.field2932[var9 * 2 + 1] * 4 + arg4) * var11 - (var7.field2932[var9 * 2] * 4 + arg3) * var12 >> 16);
            }
            if (class141.field2031) {
                class34.method252(var8, var7.field2911, var7.field2911 >>> 24, arg6.field5570, arg6.field5591);
            } else {
                class328.method2273(var8, var7.field2911, var7.field2911 >>> 24, arg6.field5570, arg6.field5591);
            }
            for (int var13 = 0; var13 < (var8.length / 2 - 1); var13++) {
                if (class141.field2031) {
                    class205.method1496(var8[var13 * 2], var8[var13 * 2 + 1], var8[var13 * 2 + 2], var8[var13 * 2 + 2 + 1], var7.field2925, var7.field2925 >>> 24, (class325) arg6.method2493(123, false));
                } else {
                    class44.method337(var8[var13 * 2], var8[var13 * 2 + 1], var8[(var13 + 1) * 2], var8[(var13 + 1) * 2 + 1], var7.field2925, var7.field2925 >>> 24, arg6.field5570, arg6.field5591);
                }
            }
            if (class141.field2031) {
                class205.method1496(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field2925, var7.field2925 >>> 24, (class325) arg6.method2493(arg5 + 12317, false));
            } else {
                class44.method337(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field2925, var7.field2925 >>> 24, arg6.field5570, arg6.field5591);
            }
        }
        class250 var14 = null;
        if (var7.field2916 != -1) {
            var14 = var7.method1460(false, (byte) -53, false);
            if (var14 != null) {
                class332.method2336(arg4, (byte) -66, arg3, arg6, arg2, arg0, var14);
            }
        }
        if (var7.field2920 == null) {
            return;
        }
        int var15 = 0;
        if (var14 != null) {
            var15 = var14.field3716;
        }
        class29 var16 = class229.field3473;
        if (var7.field2922 == 1) {
            var16 = class99.field1425;
        }
        if (var7.field2922 == 2) {
            var16 = class126.field1846;
        }
        class247.method1816(arg4, var7.field2931, var15, var7.field2920, arg0, var16, arg3, arg6, arg2, true);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lqf;IIIILin;I)V", line = 193)
    public static final void method1894(class359 arg0, int arg1, int arg2, int arg3, int arg4, class177 arg5, int arg6) {
        field3845++;
        if (arg5 == null) {
            return;
        }
        int var7;
        if (class86.field1208 == 4) {
            var7 = (int) class36.field535 & 0x7FF;
        } else {
            var7 = (int) class36.field535 + class298.field4460 & 0x7FF;
        }
        int var8 = Math.max(arg0.field5506 / 2, arg0.field5560 / 2) + 10;
        int var9 = arg3 * arg3 + arg6 * arg6;
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class345.field5339[var7];
        int var11 = class345.field5343[var7];
        if (arg2 != -256) {
            field3851 = 66;
        }
        if (class86.field1208 != 4) {
            var10 = var10 * 256 / (class281.field4271 + 256);
            var11 = var11 * 256 / (class281.field4271 + 256);
        }
        int var12 = arg3 * var10 + arg6 * var11 >> 16;
        int var13 = arg3 * var11 - (arg6 * var10) >> 16;
        if (class141.field2031) {
            ((class325) arg5).method2246(arg4 + (arg0.field5506 / 2) + var12 - (arg5.field2555 / 2), arg0.field5560 / 2 + -(arg5.field2549 / 2) + arg1 + -var13, (class325) arg0.method2493(arg2 ^ 0xFFFFFF7F, false));
        } else {
            ((class118) arg5).method886(arg4 - ((arg5.field2555 / 2) - (arg0.field5506 / 2) - var12), arg0.field5560 / 2 + -(arg5.field2549 / 2) + arg1 - var13, arg0.field5570, arg0.field5591);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILmn;I)V", line = 246)
    public static final void method1895(int arg0, class110 arg1, int arg2) {
        class294.field4429 = 0;
        int var3 = 0;
        int var4 = -1;
        field3842++;
        int var5 = 0;
        int[] var6 = arg1.field1596;
        int[] var7 = arg1.field1606;
        byte var8 = -1;
        try {
            if (arg2 != 4) {
                method1889(-34, 43, 89, (byte) 97);
            }
            int var9 = 0;
            label4553: while (true) {
                var9++;
                if (arg0 < var9) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var549 = var6[var4];
                if (var549 < 100) {
                    if (var549 == 0) {
                        class142.field2062[var3++] = var7[var4];
                        continue;
                    }
                    if (var549 == 1) {
                        int var10 = var7[var4];
                        class142.field2062[var3++] = class227.field3423[var10];
                        continue;
                    }
                    if (var549 == 2) {
                        int var11 = var7[var4];
                        var3--;
                        class186.method1291(class142.field2062[var3], (byte) 32, var11);
                        continue;
                    }
                    if (var549 == 3) {
                        class62.field909[var5++] = arg1.field1610[var4];
                        continue;
                    }
                    if (var549 == 6) {
                        var4 += var7[var4];
                        continue;
                    }
                    if (var549 == 7) {
                        var3 -= 2;
                        if (class142.field2062[var3 + 1] != class142.field2062[var3]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var549 == 8) {
                        var3 -= 2;
                        if (class142.field2062[var3 + 1] == class142.field2062[var3]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var549 == 9) {
                        var3 -= 2;
                        if (class142.field2062[var3] < class142.field2062[var3 + 1]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var549 == 10) {
                        var3 -= 2;
                        if (class142.field2062[var3] > class142.field2062[var3 + 1]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var549 == 21) {
                        if (class294.field4429 == 0) {
                            return;
                        }
                        class54 var12 = class286.field4319[--class294.field4429];
                        arg1 = var12.field792;
                        class191.field2780 = var12.field794;
                        class318.field4791 = var12.field797;
                        var7 = arg1.field1606;
                        var4 = var12.field796;
                        var6 = arg1.field1596;
                        continue;
                    }
                    if (var549 == 25) {
                        int var13 = var7[var4];
                        class142.field2062[var3++] = class144.method1033(1, var13);
                        continue;
                    }
                    if (var549 == 27) {
                        int var14 = var7[var4];
                        var3--;
                        class248.method1830(0, var14, class142.field2062[var3]);
                        continue;
                    }
                    if (var549 == 31) {
                        var3 -= 2;
                        if (class142.field2062[var3] <= class142.field2062[var3 + 1]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var549 == 32) {
                        var3 -= 2;
                        if (class142.field2062[var3] >= class142.field2062[var3 + 1]) {
                            var4 += var7[var4];
                        }
                        continue;
                    }
                    if (var549 == 33) {
                        class142.field2062[var3++] = class191.field2780[var7[var4]];
                        continue;
                    }
                    int var10001;
                    if (var549 == 34) {
                        var10001 = var7[var4];
                        var3--;
                        class191.field2780[var10001] = class142.field2062[var3];
                        continue;
                    }
                    if (var549 == 35) {
                        class62.field909[var5++] = class318.field4791[var7[var4]];
                        continue;
                    }
                    if (var549 == 36) {
                        var10001 = var7[var4];
                        var5--;
                        class318.field4791[var10001] = class62.field909[var5];
                        continue;
                    }
                    if (var549 == 37) {
                        int var15 = var7[var4];
                        var5 -= var15;
                        String var16 = class276.method2016(14651, var15, class62.field909, var5);
                        class62.field909[var5++] = var16;
                        continue;
                    }
                    if (var549 == 38) {
                        var3--;
                        continue;
                    }
                    if (var549 == 39) {
                        var5--;
                        continue;
                    }
                    if (var549 == 40) {
                        int var17 = var7[var4];
                        class110 var18 = class335.method2361(var17, -2);
                        String[] var19 = new String[var18.field1604];
                        int[] var20 = new int[var18.field1598];
                        for (int var21 = 0; var21 < var18.field1607; var21++) {
                            var20[var21] = class142.field2062[var3 + var21 - var18.field1607];
                        }
                        for (int var22 = 0; var22 < var18.field1603; var22++) {
                            var19[var22] = class62.field909[var5 + var22 - var18.field1603];
                        }
                        var5 -= var18.field1603;
                        var3 -= var18.field1607;
                        class54 var23 = new class54();
                        var23.field792 = arg1;
                        var23.field794 = class191.field2780;
                        var23.field797 = class318.field4791;
                        var23.field796 = var4;
                        if (class286.field4319.length <= class294.field4429) {
                            throw new RuntimeException();
                        }
                        var4 = -1;
                        arg1 = var18;
                        class286.field4319[class294.field4429++] = var23;
                        var6 = var18.field1596;
                        class318.field4791 = var19;
                        var7 = var18.field1606;
                        class191.field2780 = var20;
                        continue;
                    }
                    if (var549 == 42) {
                        class142.field2062[var3++] = class308.field4605[var7[var4]];
                        continue;
                    }
                    if (var549 == 43) {
                        int var24 = var7[var4];
                        var3--;
                        class308.field4605[var24] = class142.field2062[var3];
                        class72.method601(var24, 22);
                        continue;
                    }
                    if (var549 == 44) {
                        int var25 = var7[var4] & 0xFFFF;
                        int var26 = var7[var4] >> 16;
                        var3--;
                        int var27 = class142.field2062[var3];
                        if (var27 >= 0 && var27 <= 5000) {
                            class120.field1691[var26] = var27;
                            byte var28 = -1;
                            if (var25 == 105) {
                                var28 = 0;
                            }
                            int var29 = 0;
                            while (true) {
                                if (var27 <= var29) {
                                    continue label4553;
                                }
                                class250.field3718[var26][var29] = var28;
                                var29++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var549 == 45) {
                        var3--;
                        int var30 = class142.field2062[var3];
                        int var31 = var7[var4];
                        if (var30 >= 0 && var30 < class120.field1691[var31]) {
                            class142.field2062[var3++] = class250.field3718[var31][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var549 == 46) {
                        var3 -= 2;
                        int var32 = class142.field2062[var3];
                        int var33 = var7[var4];
                        if (var32 >= 0 && class120.field1691[var33] > var32) {
                            class250.field3718[var33][var32] = class142.field2062[var3 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var549 == 47) {
                        String var34 = class21.field330[var7[var4]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class62.field909[var5++] = var34;
                        continue;
                    }
                    if (var549 == 48) {
                        int var35 = var7[var4];
                        var5--;
                        class21.field330[var35] = class62.field909[var5];
                        class47.method407(var35, 2);
                        continue;
                    }
                    if (var549 == 51) {
                        class196 var36 = arg1.field1592[var7[var4]];
                        var3--;
                        class35 var37 = (class35) var36.method1405((long) class142.field2062[var3], false);
                        if (var37 != null) {
                            var4 += var37.field515;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (var7[var4] == 1) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                if (var549 < 300) {
                    if (var549 == 100) {
                        var3 -= 3;
                        int var39 = class142.field2062[var3];
                        int var40 = class142.field2062[var3 + 1];
                        int var41 = class142.field2062[var3 + 2];
                        if (var40 == 0) {
                            throw new RuntimeException();
                        }
                        class359 var42 = class231.method1719(var39, 116);
                        if (var42.field5579 == null) {
                            var42.field5579 = new class359[var41 + 1];
                        }
                        if (var42.field5579.length <= var41) {
                            class359[] var43 = new class359[var41 + 1];
                            for (int var44 = 0; var44 < var42.field5579.length; var44++) {
                                var43[var44] = var42.field5579[var44];
                            }
                            var42.field5579 = var43;
                        }
                        if (var41 > 0 && var42.field5579[var41 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var41 - 1));
                        }
                        class359 var45 = new class359();
                        var45.field5638 = var45.field5521 = var42.field5521;
                        var45.field5500 = true;
                        var45.field5554 = var40;
                        var45.field5620 = var41;
                        var42.field5579[var41] = var45;
                        if (var38) {
                            class160.field2324 = var45;
                        } else {
                            class235.field3536 = var45;
                        }
                        class83.method676(var42, (byte) 93);
                        continue;
                    }
                    if (var549 == 101) {
                        class359 var46 = var38 ? class160.field2324 : class235.field3536;
                        if (var46.field5620 == -1) {
                            if (!var38) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class359 var47 = class231.method1719(var46.field5521, arg2 + 52);
                        var47.field5579[var46.field5620] = null;
                        class83.method676(var47, (byte) 126);
                        continue;
                    }
                    if (var549 == 102) {
                        var3--;
                        class359 var48 = class231.method1719(class142.field2062[var3], arg2 + 83);
                        var48.field5579 = null;
                        class83.method676(var48, (byte) 101);
                        continue;
                    }
                    if (var549 == 200) {
                        var3 -= 2;
                        int var49 = class142.field2062[var3 + 1];
                        int var50 = class142.field2062[var3];
                        class359 var51 = class165.method1172(var49, arg2 - 5, var50);
                        if (var51 != null && var49 != -1) {
                            class142.field2062[var3++] = 1;
                            if (var38) {
                                class160.field2324 = var51;
                            } else {
                                class235.field3536 = var51;
                            }
                            continue;
                        }
                        class142.field2062[var3++] = 0;
                        continue;
                    }
                    if (var549 == 201) {
                        var3--;
                        int var52 = class142.field2062[var3];
                        class359 var53 = class231.method1719(var52, 85);
                        if (var53 == null) {
                            class142.field2062[var3++] = 0;
                        } else {
                            class142.field2062[var3++] = 1;
                            if (var38) {
                                class160.field2324 = var53;
                            } else {
                                class235.field3536 = var53;
                            }
                        }
                        continue;
                    }
                } else if (var549 < 500) {
                    if (var549 == 403) {
                        var3 -= 2;
                        int var537 = class142.field2062[var3];
                        int var538 = class142.field2062[var3 + 1];
                        for (int var539 = 0; var539 < class216.field3185.length; var539++) {
                            if (class216.field3185[var539] == var537) {
                                class1.field55.field3445.method1877(2, var538, var539);
                                continue label4553;
                            }
                        }
                        int var540 = 0;
                        while (true) {
                            if (var540 >= class135.field1967.length) {
                                continue label4553;
                            }
                            if (class135.field1967[var540] == var537) {
                                class1.field55.field3445.method1877(2, var538, var540);
                                continue label4553;
                            }
                            var540++;
                        }
                    }
                    if (var549 == 404) {
                        var3 -= 2;
                        int var541 = class142.field2062[var3 + 1];
                        int var542 = class142.field2062[var3];
                        class1.field55.field3445.method1879(-5971, var542, var541);
                        continue;
                    }
                    if (var549 == 410) {
                        var3--;
                        boolean var543 = class142.field2062[var3] != 0;
                        class1.field55.field3445.method1884(var543, 48);
                        continue;
                    }
                } else if (var549 >= 1000 && var549 < 1100 || var549 >= 2000 && var549 < 2100) {
                    class359 var531;
                    if (var549 < 2000) {
                        var531 = var38 ? class160.field2324 : class235.field3536;
                    } else {
                        var3--;
                        var531 = class231.method1719(class142.field2062[var3], 121);
                        var549 -= 1000;
                    }
                    if (var549 == 1000) {
                        var3 -= 4;
                        var531.field5630 = class142.field2062[var3];
                        var531.field5577 = class142.field2062[var3 + 1];
                        int var532 = class142.field2062[var3 + 3];
                        if (var532 < 0) {
                            var532 = 0;
                        } else if (var532 > 5) {
                            var532 = 5;
                        }
                        int var533 = class142.field2062[var3 + 2];
                        var531.field5489 = (byte) var532;
                        if (var533 < 0) {
                            var533 = 0;
                        } else if (var533 > 5) {
                            var533 = 5;
                        }
                        var531.field5566 = (byte) var533;
                        class83.method676(var531, (byte) -48);
                        class134.method962((byte) 66, var531);
                        if (var531.field5620 == -1) {
                            class8.method52((byte) 59, var531.field5521);
                        }
                        continue;
                    }
                    if (var549 == 1001) {
                        var3 -= 4;
                        var531.field5524 = class142.field2062[var3];
                        var531.field5599 = class142.field2062[var3 + 1];
                        var531.field5611 = 0;
                        var531.field5509 = 0;
                        int var534 = class142.field2062[var3 + 2];
                        int var535 = class142.field2062[var3 + 3];
                        if (var535 < 0) {
                            var535 = 0;
                        } else if (var535 > 4) {
                            var535 = 4;
                        }
                        if (var534 < 0) {
                            var534 = 0;
                        } else if (var534 > 4) {
                            var534 = 4;
                        }
                        var531.field5661 = (byte) var534;
                        var531.field5505 = (byte) var535;
                        class83.method676(var531, (byte) 110);
                        class134.method962((byte) 66, var531);
                        if (var531.field5554 == 0) {
                            class143.method1031(false, var531, -1);
                        }
                        continue;
                    }
                    if (var549 == 1003) {
                        var3--;
                        boolean var536 = class142.field2062[var3] == 1;
                        if (var531.field5658 != var536) {
                            var531.field5658 = var536;
                            class83.method676(var531, (byte) -75);
                        }
                        if (var531.field5620 == -1) {
                            class321.method2233(true, var531.field5521);
                        }
                        continue;
                    }
                    if (var549 == 1004) {
                        var3 -= 2;
                        var531.field5604 = class142.field2062[var3];
                        var531.field5574 = class142.field2062[var3 + 1];
                        class83.method676(var531, (byte) 78);
                        class134.method962((byte) 66, var531);
                        if (var531.field5554 == 0) {
                            class143.method1031(false, var531, -1);
                        }
                        continue;
                    }
                    if (var549 == 1005) {
                        var3--;
                        var531.field5550 = class142.field2062[var3] == 1;
                        continue;
                    }
                } else if (!(var549 < 1100 || var549 >= 1200) || !(var549 < 2100 || var549 >= 2200)) {
                    class359 var526;
                    if (var549 < 2000) {
                        var526 = var38 ? class160.field2324 : class235.field3536;
                    } else {
                        var3--;
                        var526 = class231.method1719(class142.field2062[var3], 78);
                        var549 -= 1000;
                    }
                    if (var549 == 1100) {
                        var3 -= 2;
                        var526.field5496 = class142.field2062[var3];
                        if (var526.field5642 - var526.field5506 < var526.field5496) {
                            var526.field5496 = var526.field5642 - var526.field5506;
                        }
                        if (var526.field5496 < 0) {
                            var526.field5496 = 0;
                        }
                        var526.field5641 = class142.field2062[var3 + 1];
                        if (var526.field5641 > (var526.field5580 - var526.field5560)) {
                            var526.field5641 = var526.field5580 - var526.field5560;
                        }
                        if (var526.field5641 < 0) {
                            var526.field5641 = 0;
                        }
                        class83.method676(var526, (byte) 45);
                        if (var526.field5620 == -1) {
                            class109.method834((byte) 76, var526.field5521);
                        }
                        continue;
                    }
                    if (var549 == 1101) {
                        var3--;
                        var526.field5646 = class142.field2062[var3];
                        class83.method676(var526, (byte) 46);
                        if (var526.field5620 == -1) {
                            class89.method714(var526.field5521, arg2 ^ 0x7B);
                        }
                        continue;
                    }
                    if (var549 == 1102) {
                        var3--;
                        var526.field5543 = class142.field2062[var3] == 1;
                        class83.method676(var526, (byte) 66);
                        continue;
                    }
                    if (var549 == 1103) {
                        var3--;
                        var526.field5561 = class142.field2062[var3];
                        class83.method676(var526, (byte) -110);
                        continue;
                    }
                    if (var549 == 1104) {
                        var3--;
                        var526.field5674 = class142.field2062[var3];
                        class83.method676(var526, (byte) 104);
                        continue;
                    }
                    if (var549 == 1105) {
                        var3--;
                        int var527 = class142.field2062[var3];
                        if (var526.field5618 != var527) {
                            var526.field5618 = var527;
                            class83.method676(var526, (byte) 127);
                        }
                        if (var526.field5620 == -1) {
                            class313.method2189(14, var526.field5521);
                        }
                        continue;
                    }
                    if (var549 == 1106) {
                        var3--;
                        var526.field5538 = class142.field2062[var3];
                        class83.method676(var526, (byte) 73);
                        continue;
                    }
                    if (var549 == 1107) {
                        var3--;
                        var526.field5673 = class142.field2062[var3] == 1;
                        class83.method676(var526, (byte) 86);
                        continue;
                    }
                    if (var549 == 1108) {
                        var526.field5623 = 1;
                        var3--;
                        var526.field5595 = class142.field2062[var3];
                        class83.method676(var526, (byte) -77);
                        if (var526.field5620 == -1) {
                            class196.method1408(var526.field5521, -112);
                        }
                        continue;
                    }
                    if (var549 == 1109) {
                        var3 -= 6;
                        var526.field5502 = class142.field2062[var3];
                        var526.field5667 = class142.field2062[var3 + 1];
                        var526.field5517 = class142.field2062[var3 + 2];
                        var526.field5609 = class142.field2062[var3 + 3];
                        var526.field5653 = class142.field2062[var3 + 4];
                        var526.field5544 = class142.field2062[var3 + 5];
                        class83.method676(var526, (byte) -52);
                        if (var526.field5620 == -1) {
                            class287.method2075(var526.field5521, 0);
                            class47.method406(var526.field5521, -30407);
                        }
                        continue;
                    }
                    if (var549 == 1110) {
                        var3--;
                        int var528 = class142.field2062[var3];
                        if (var526.field5547 != var528) {
                            var526.field5593 = 0;
                            var526.field5519 = 0;
                            var526.field5547 = var528;
                            var526.field5621 = 1;
                            class83.method676(var526, (byte) -123);
                        }
                        if (var526.field5620 == -1) {
                            class321.method2229(var526.field5521, true);
                        }
                        continue;
                    }
                    if (var549 == 1111) {
                        var3--;
                        var526.field5633 = class142.field2062[var3] == 1;
                        class83.method676(var526, (byte) 50);
                        continue;
                    }
                    if (var549 == 1112) {
                        var5--;
                        String var529 = class62.field909[var5];
                        if (!var529.equals(var526.field5635)) {
                            var526.field5635 = var529;
                            class83.method676(var526, (byte) 104);
                        }
                        if (var526.field5620 == -1) {
                            class303.method2135(var526.field5521, -32768);
                        }
                        continue;
                    }
                    if (var549 == 1113) {
                        var3--;
                        var526.field5660 = class142.field2062[var3];
                        class83.method676(var526, (byte) 118);
                        continue;
                    }
                    if (var549 == 1114) {
                        var3 -= 3;
                        var526.field5655 = class142.field2062[var3];
                        var526.field5657 = class142.field2062[var3 + 1];
                        var526.field5612 = class142.field2062[var3 + 2];
                        class83.method676(var526, (byte) -82);
                        continue;
                    }
                    if (var549 == 1115) {
                        var3--;
                        var526.field5584 = class142.field2062[var3] == 1;
                        class83.method676(var526, (byte) -85);
                        continue;
                    }
                    if (var549 == 1116) {
                        var3--;
                        var526.field5531 = class142.field2062[var3];
                        class83.method676(var526, (byte) 62);
                        continue;
                    }
                    if (var549 == 1117) {
                        var3--;
                        var526.field5576 = class142.field2062[var3];
                        class83.method676(var526, (byte) -79);
                        continue;
                    }
                    if (var549 == 1118) {
                        var3--;
                        var526.field5540 = class142.field2062[var3] == 1;
                        class83.method676(var526, (byte) -74);
                        continue;
                    }
                    if (var549 == 1119) {
                        var3--;
                        var526.field5603 = class142.field2062[var3] == 1;
                        class83.method676(var526, (byte) -71);
                        continue;
                    }
                    if (var549 == 1120) {
                        var3 -= 2;
                        var526.field5642 = class142.field2062[var3];
                        var526.field5580 = class142.field2062[var3 + 1];
                        class83.method676(var526, (byte) 96);
                        if (var526.field5554 == 0) {
                            class143.method1031(false, var526, -1);
                        }
                        continue;
                    }
                    if (var549 == 1121) {
                        var3 -= 2;
                        var526.field5529 = (short) class142.field2062[var3];
                        var526.field5586 = (short) class142.field2062[var3 + 1];
                        class83.method676(var526, (byte) 73);
                        continue;
                    }
                    if (var549 == 1122) {
                        var3--;
                        var526.field5639 = class142.field2062[var3] == 1;
                        class83.method676(var526, (byte) -64);
                        continue;
                    }
                    if (var549 == 1123) {
                        var3--;
                        var526.field5544 = class142.field2062[var3];
                        class83.method676(var526, (byte) 122);
                        if (var526.field5620 == -1) {
                            class287.method2075(var526.field5521, 0);
                        }
                        continue;
                    }
                    if (var549 == 1124) {
                        var3--;
                        int var530 = class142.field2062[var3];
                        var526.field5634 = var530 == 1;
                        class83.method676(var526, (byte) 63);
                        continue;
                    }
                } else if (var549 >= 1200 && var549 < 1300 || var549 >= 2200 && var549 < 2300) {
                    class359 var54;
                    if (var549 >= 2000) {
                        var549 -= 1000;
                        var3--;
                        var54 = class231.method1719(class142.field2062[var3], 60);
                    } else {
                        var54 = var38 ? class160.field2324 : class235.field3536;
                    }
                    class83.method676(var54, (byte) 76);
                    if (var549 == 1200 || var549 == 1205 || var549 == 1208 || var549 == 1209) {
                        var3 -= 2;
                        int var55 = class142.field2062[var3 + 1];
                        int var56 = class142.field2062[var3];
                        if (var54.field5620 == -1) {
                            class4.method30(var54.field5521, false);
                            class287.method2075(var54.field5521, 0);
                            class47.method406(var54.field5521, arg2 ^ 0xFFFF893D);
                        }
                        if (var56 == -1) {
                            var54.field5623 = 1;
                            var54.field5615 = -1;
                            var54.field5595 = -1;
                            continue;
                        }
                        var54.field5615 = var56;
                        if (var549 == 1208 || var549 == 1209) {
                            var54.field5558 = true;
                        } else {
                            var54.field5558 = false;
                        }
                        var54.field5503 = var55;
                        class122 var57 = class175.method1228((byte) 54, var56);
                        var54.field5517 = var57.field1731;
                        if (var549 == 1205) {
                            var54.field5498 = false;
                        } else {
                            var54.field5498 = true;
                        }
                        var54.field5502 = var57.field1752;
                        var54.field5544 = var57.field1717;
                        var54.field5653 = var57.field1725;
                        var54.field5609 = var57.field1774;
                        var54.field5667 = var57.field1786;
                        if (var54.field5611 > 0) {
                            var54.field5544 = var54.field5544 * 32 / var54.field5611;
                        } else if (var54.field5524 > 0) {
                            var54.field5544 = var54.field5544 * 32 / var54.field5524;
                        }
                        continue;
                    }
                    if (var549 == 1201) {
                        var54.field5623 = 2;
                        var3--;
                        var54.field5595 = class142.field2062[var3];
                        if (var54.field5620 == -1) {
                            class196.method1408(var54.field5521, -101);
                        }
                        continue;
                    }
                    if (var549 == 1202) {
                        var54.field5623 = 3;
                        var54.field5595 = class1.field55.field3445.method1880(false);
                        if (var54.field5620 == -1) {
                            class196.method1408(var54.field5521, -118);
                        }
                        continue;
                    }
                    if (var549 == 1203) {
                        var54.field5623 = 6;
                        var3--;
                        var54.field5595 = class142.field2062[var3];
                        if (var54.field5620 == -1) {
                            class196.method1408(var54.field5521, arg2 - 93);
                        }
                        continue;
                    }
                    if (var549 == 1204) {
                        var54.field5623 = 5;
                        var3--;
                        var54.field5595 = class142.field2062[var3];
                        if (var54.field5620 == -1) {
                            class196.method1408(var54.field5521, -108);
                        }
                        continue;
                    }
                    if (var549 == 1206) {
                        var3 -= 4;
                        var54.field5542 = class142.field2062[var3];
                        var54.field5563 = class142.field2062[var3 + 1];
                        var54.field5614 = class142.field2062[var3 + 2];
                        var54.field5601 = class142.field2062[var3 + 3];
                        class83.method676(var54, (byte) -54);
                        continue;
                    }
                    if (var549 == 1207) {
                        var3 -= 2;
                        var54.field5571 = class142.field2062[var3];
                        var54.field5569 = class142.field2062[var3 + 1];
                        class83.method676(var54, (byte) -111);
                        continue;
                    }
                    if (var549 == 1211) {
                        var54.field5606 = 0;
                        var54.field5623 = 5;
                        var54.field5595 = 2047;
                        if (var54.field5620 == -1) {
                            class196.method1408(var54.field5521, -91);
                        }
                        continue;
                    }
                } else if (var549 >= 1300 && var549 < 1400 || var549 >= 2300 && var549 < 2400) {
                    class359 var520;
                    if (var549 >= 2000) {
                        var549 -= 1000;
                        var3--;
                        var520 = class231.method1719(class142.field2062[var3], 85);
                    } else {
                        var520 = var38 ? class160.field2324 : class235.field3536;
                    }
                    if (var549 == 1300) {
                        var3--;
                        int var521 = class142.field2062[var3] - 1;
                        if (var521 >= 0 && var521 <= 9) {
                            var5--;
                            var520.method2496((byte) -114, class62.field909[var5], var521);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var549 == 1301) {
                        var3 -= 2;
                        int var522 = class142.field2062[var3];
                        int var523 = class142.field2062[var3 + 1];
                        var520.field5568 = class165.method1172(var523, -1, var522);
                        continue;
                    }
                    if (var549 == 1302) {
                        var3--;
                        var520.field5589 = class142.field2062[var3] == 1;
                        continue;
                    }
                    if (var549 == 1303) {
                        var3--;
                        var520.field5608 = class142.field2062[var3];
                        continue;
                    }
                    if (var549 == 1304) {
                        var3--;
                        var520.field5551 = class142.field2062[var3];
                        continue;
                    }
                    if (var549 == 1305) {
                        var5--;
                        var520.field5564 = class62.field909[var5];
                        continue;
                    }
                    if (var549 == 1306) {
                        var5--;
                        var520.field5528 = class62.field909[var5];
                        continue;
                    }
                    if (var549 == 1307) {
                        var520.field5493 = null;
                        continue;
                    }
                    if (var549 == 1308) {
                        var3--;
                        var520.field5582 = class142.field2062[var3];
                        var3--;
                        var520.field5602 = class142.field2062[var3];
                        continue;
                    }
                    if (var549 == 1309) {
                        var3--;
                        int var524 = class142.field2062[var3];
                        var3--;
                        int var525 = class142.field2062[var3];
                        if (var525 >= 1 && var525 <= 10) {
                            var520.method2499((byte) -110, var525 - 1, var524);
                        }
                        continue;
                    }
                    if (var549 == 1310) {
                        var5--;
                        var520.field5581 = class62.field909[var5];
                        continue;
                    }
                } else {
                    if (var549 >= 1400 && var549 < 1500 || var549 >= 2400 && var549 < 2500) {
                        class359 var58;
                        if (var549 >= 2000) {
                            var549 -= 1000;
                            var3--;
                            var58 = class231.method1719(class142.field2062[var3], 71);
                        } else {
                            var58 = var38 ? class160.field2324 : class235.field3536;
                        }
                        var5--;
                        String var59 = class62.field909[var5];
                        int[] var60 = null;
                        if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                            var3--;
                            int var61 = class142.field2062[var3];
                            if (var61 > 0) {
                                var60 = new int[var61];
                                while ((var61--) > 0) {
                                    var3--;
                                    var60[var61] = class142.field2062[var3];
                                }
                            }
                            var59 = var59.substring(0, var59.length() - 1);
                        }
                        Object[] var62 = new Object[var59.length() + 1];
                        for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                            if (var59.charAt(var63 - 1) == 's') {
                                var5--;
                                var62[var63] = class62.field909[var5];
                            } else {
                                var3--;
                                var62[var63] = Integer.valueOf(class142.field2062[var3]);
                            }
                        }
                        var3--;
                        int var64 = class142.field2062[var3];
                        if (var64 == -1) {
                            var62 = null;
                        } else {
                            var62[0] = Integer.valueOf(var64);
                        }
                        if (var549 == 1400) {
                            var58.field5619 = var62;
                        } else if (var549 == 1401) {
                            var58.field5613 = var62;
                        } else if (var549 == 1402) {
                            var58.field5672 = var62;
                        } else if (var549 == 1403) {
                            var58.field5492 = var62;
                        } else if (var549 == 1404) {
                            var58.field5587 = var62;
                        } else if (var549 == 1405) {
                            var58.field5530 = var62;
                        } else if (var549 == 1406) {
                            var58.field5671 = var62;
                        } else if (var549 == 1407) {
                            var58.field5526 = var60;
                            var58.field5578 = var62;
                        } else if (var549 == 1408) {
                            var58.field5553 = var62;
                        } else if (var549 == 1409) {
                            var58.field5670 = var62;
                        } else if (var549 == 1410) {
                            var58.field5594 = var62;
                        } else if (var549 == 1411) {
                            var58.field5512 = var62;
                        } else if (var549 == 1412) {
                            var58.field5650 = var62;
                        } else if (var549 == 1414) {
                            var58.field5536 = var62;
                            var58.field5664 = var60;
                        } else if (var549 == 1415) {
                            var58.field5626 = var60;
                            var58.field5541 = var62;
                        } else if (var549 == 1416) {
                            var58.field5662 = var62;
                        } else if (var549 == 1417) {
                            var58.field5494 = var62;
                        } else if (var549 == 1418) {
                            var58.field5666 = var62;
                        } else if (var549 == 1419) {
                            var58.field5636 = var62;
                        } else if (var549 == 1420) {
                            var58.field5617 = var62;
                        } else if (var549 == 1421) {
                            var58.field5572 = var62;
                        } else if (var549 == 1422) {
                            var58.field5501 = var62;
                        } else if (var549 == 1423) {
                            var58.field5546 = var62;
                        } else if (var549 == 1424) {
                            var58.field5616 = var62;
                        } else if (var549 == 1425) {
                            var58.field5669 = var62;
                        } else if (var549 == 1426) {
                            var58.field5583 = var62;
                        } else if (var549 == 1427) {
                            var58.field5573 = var62;
                        } else if (var549 == 1428) {
                            var58.field5557 = var62;
                            var58.field5637 = var60;
                        } else if (var549 == 1429) {
                            var58.field5622 = var60;
                            var58.field5627 = var62;
                        }
                        var58.field5663 = true;
                        continue;
                    }
                    if (var549 < 1600) {
                        class359 var519 = var38 ? class160.field2324 : class235.field3536;
                        if (var549 == 1500) {
                            class142.field2062[var3++] = var519.field5495;
                            continue;
                        }
                        if (var549 == 1501) {
                            class142.field2062[var3++] = var519.field5585;
                            continue;
                        }
                        if (var549 == 1502) {
                            class142.field2062[var3++] = var519.field5506;
                            continue;
                        }
                        if (var549 == 1503) {
                            class142.field2062[var3++] = var519.field5560;
                            continue;
                        }
                        if (var549 == 1504) {
                            class142.field2062[var3++] = var519.field5658 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 1505) {
                            class142.field2062[var3++] = var519.field5638;
                            continue;
                        }
                    } else if (var549 < 1700) {
                        class359 var518 = var38 ? class160.field2324 : class235.field3536;
                        if (var549 == 1600) {
                            class142.field2062[var3++] = var518.field5496;
                            continue;
                        }
                        if (var549 == 1601) {
                            class142.field2062[var3++] = var518.field5641;
                            continue;
                        }
                        if (var549 == 1602) {
                            class62.field909[var5++] = var518.field5635;
                            continue;
                        }
                        if (var549 == 1603) {
                            class142.field2062[var3++] = var518.field5642;
                            continue;
                        }
                        if (var549 == 1604) {
                            class142.field2062[var3++] = var518.field5580;
                            continue;
                        }
                        if (var549 == 1605) {
                            class142.field2062[var3++] = var518.field5544;
                            continue;
                        }
                        if (var549 == 1606) {
                            class142.field2062[var3++] = var518.field5517;
                            continue;
                        }
                        if (var549 == 1607) {
                            class142.field2062[var3++] = var518.field5653;
                            continue;
                        }
                        if (var549 == 1608) {
                            class142.field2062[var3++] = var518.field5609;
                            continue;
                        }
                        if (var549 == 1609) {
                            class142.field2062[var3++] = var518.field5561;
                            continue;
                        }
                        if (var549 == 1610) {
                            class142.field2062[var3++] = var518.field5502;
                            continue;
                        }
                        if (var549 == 1611) {
                            class142.field2062[var3++] = var518.field5667;
                            continue;
                        }
                        if (var549 == 1612) {
                            class142.field2062[var3++] = var518.field5618;
                            continue;
                        }
                    } else if (var549 < 1800) {
                        class359 var517 = var38 ? class160.field2324 : class235.field3536;
                        if (var549 == 1700) {
                            class142.field2062[var3++] = var517.field5615;
                            continue;
                        }
                        if (var549 == 1701) {
                            if (var517.field5615 == -1) {
                                class142.field2062[var3++] = 0;
                            } else {
                                class142.field2062[var3++] = var517.field5503;
                            }
                            continue;
                        }
                        if (var549 == 1702) {
                            class142.field2062[var3++] = var517.field5620;
                            continue;
                        }
                    } else if (var549 < 1900) {
                        class359 var65 = var38 ? class160.field2324 : class235.field3536;
                        if (var549 == 1800) {
                            class142.field2062[var3++] = client.method347(var65).method1442(true);
                            continue;
                        }
                        if (var549 == 1801) {
                            var3--;
                            int var66 = class142.field2062[var3];
                            int var550 = var66 - 1;
                            if (var65.field5493 != null && var65.field5493.length > var550 && var65.field5493[var550] != null) {
                                class62.field909[var5++] = var65.field5493[var550];
                                continue;
                            }
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 1802) {
                            if (var65.field5564 == null) {
                                class62.field909[var5++] = "";
                            } else {
                                class62.field909[var5++] = var65.field5564;
                            }
                            continue;
                        }
                    } else if (var549 < 2600) {
                        var3--;
                        class359 var516 = class231.method1719(class142.field2062[var3], arg2 ^ 0x5E);
                        if (var549 == 2500) {
                            class142.field2062[var3++] = var516.field5495;
                            continue;
                        }
                        if (var549 == 2501) {
                            class142.field2062[var3++] = var516.field5585;
                            continue;
                        }
                        if (var549 == 2502) {
                            class142.field2062[var3++] = var516.field5506;
                            continue;
                        }
                        if (var549 == 2503) {
                            class142.field2062[var3++] = var516.field5560;
                            continue;
                        }
                        if (var549 == 2504) {
                            class142.field2062[var3++] = var516.field5658 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 2505) {
                            class142.field2062[var3++] = var516.field5638;
                            continue;
                        }
                    } else if (var549 < 2700) {
                        var3--;
                        class359 var67 = class231.method1719(class142.field2062[var3], arg2 ^ 0x64);
                        if (var549 == 2600) {
                            class142.field2062[var3++] = var67.field5496;
                            continue;
                        }
                        if (var549 == 2601) {
                            class142.field2062[var3++] = var67.field5641;
                            continue;
                        }
                        if (var549 == 2602) {
                            class62.field909[var5++] = var67.field5635;
                            continue;
                        }
                        if (var549 == 2603) {
                            class142.field2062[var3++] = var67.field5642;
                            continue;
                        }
                        if (var549 == 2604) {
                            class142.field2062[var3++] = var67.field5580;
                            continue;
                        }
                        if (var549 == 2605) {
                            class142.field2062[var3++] = var67.field5544;
                            continue;
                        }
                        if (var549 == 2606) {
                            class142.field2062[var3++] = var67.field5517;
                            continue;
                        }
                        if (var549 == 2607) {
                            class142.field2062[var3++] = var67.field5653;
                            continue;
                        }
                        if (var549 == 2608) {
                            class142.field2062[var3++] = var67.field5609;
                            continue;
                        }
                        if (var549 == 2609) {
                            class142.field2062[var3++] = var67.field5561;
                            continue;
                        }
                        if (var549 == 2610) {
                            class142.field2062[var3++] = var67.field5502;
                            continue;
                        }
                        if (var549 == 2611) {
                            class142.field2062[var3++] = var67.field5667;
                            continue;
                        }
                        if (var549 == 2612) {
                            class142.field2062[var3++] = var67.field5618;
                            continue;
                        }
                    } else if (var549 < 2800) {
                        if (var549 == 2700) {
                            var3--;
                            class359 var506 = class231.method1719(class142.field2062[var3], arg2 + 90);
                            class142.field2062[var3++] = var506.field5615;
                            continue;
                        }
                        if (var549 == 2701) {
                            var3--;
                            class359 var507 = class231.method1719(class142.field2062[var3], 77);
                            if (var507.field5615 == -1) {
                                class142.field2062[var3++] = 0;
                            } else {
                                class142.field2062[var3++] = var507.field5503;
                            }
                            continue;
                        }
                        if (var549 == 2702) {
                            var3--;
                            int var508 = class142.field2062[var3];
                            class98 var509 = (class98) class288.field4360.method1405((long) var508, false);
                            if (var509 == null) {
                                class142.field2062[var3++] = 0;
                            } else {
                                class142.field2062[var3++] = 1;
                            }
                            continue;
                        }
                        if (var549 == 2703) {
                            var3--;
                            class359 var510 = class231.method1719(class142.field2062[var3], 58);
                            if (var510.field5579 == null) {
                                class142.field2062[var3++] = 0;
                                continue;
                            }
                            int var511 = var510.field5579.length;
                            for (int var512 = 0; var512 < var510.field5579.length; var512++) {
                                if (var510.field5579[var512] == null) {
                                    var511 = var512;
                                    break;
                                }
                            }
                            class142.field2062[var3++] = var511;
                            continue;
                        }
                        if (var549 == 2704 || var549 == 2705) {
                            var3 -= 2;
                            int var513 = class142.field2062[var3];
                            int var514 = class142.field2062[var3 + 1];
                            class98 var515 = (class98) class288.field4360.method1405((long) var513, false);
                            if (var515 != null && var515.field1393 == var514) {
                                class142.field2062[var3++] = 1;
                                continue;
                            }
                            class142.field2062[var3++] = 0;
                            continue;
                        }
                    } else if (var549 < 2900) {
                        var3--;
                        class359 var68 = class231.method1719(class142.field2062[var3], arg2 + 112);
                        if (var549 == 2800) {
                            class142.field2062[var3++] = client.method347(var68).method1442(true);
                            continue;
                        }
                        if (var549 == 2801) {
                            var3--;
                            int var69 = class142.field2062[var3];
                            int var551 = var69 - 1;
                            if (var68.field5493 != null && var68.field5493.length > var551 && var68.field5493[var551] != null) {
                                class62.field909[var5++] = var68.field5493[var551];
                                continue;
                            }
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 2802) {
                            if (var68.field5564 == null) {
                                class62.field909[var5++] = "";
                            } else {
                                class62.field909[var5++] = var68.field5564;
                            }
                            continue;
                        }
                    } else if (var549 < 3200) {
                        if (var549 == 3100) {
                            var5--;
                            String var70 = class62.field909[var5];
                            class28.method177(var70, -19420);
                            continue;
                        }
                        if (var549 == 3101) {
                            var3 -= 2;
                            class344.method2406(class142.field2062[var3 + 1], class142.field2062[var3], (byte) -125, class1.field55);
                            continue;
                        }
                        if (var549 == 3103) {
                            class270.method1994(true);
                            continue;
                        }
                        if (var549 == 3104) {
                            var5--;
                            String var71 = class62.field909[var5];
                            class207.field3025++;
                            int var72 = 0;
                            if (class287.method2072(8, var71)) {
                                var72 = class28.method176((byte) 28, var71);
                            }
                            class107.field1533.method1915(true, 86);
                            class107.field1533.method1354(var72, (byte) 110);
                            continue;
                        }
                        if (var549 == 3105) {
                            var5--;
                            String var73 = class62.field909[var5];
                            class132.field1931++;
                            class107.field1533.method1915(true, 123);
                            class107.field1533.method1355((byte) -111, var73.length() + 1);
                            class107.field1533.method1343(var73, 0);
                            continue;
                        }
                        if (var549 == 3106) {
                            var5--;
                            String var74 = class62.field909[var5];
                            class313.field4656++;
                            class107.field1533.method1915(true, 107);
                            class107.field1533.method1355((byte) -113, var74.length() + 1);
                            class107.field1533.method1343(var74, 0);
                            continue;
                        }
                        if (var549 == 3107) {
                            var5--;
                            String var75 = class62.field909[var5];
                            var3--;
                            int var76 = class142.field2062[var3];
                            class191.method1377(var76, var75, 0);
                            continue;
                        }
                        if (var549 == 3108) {
                            var3 -= 3;
                            int var77 = class142.field2062[var3];
                            int var78 = class142.field2062[var3 + 1];
                            int var79 = class142.field2062[var3 + 2];
                            class359 var80 = class231.method1719(var79, 51);
                            class313.method2190(var80, var78, var77, true);
                            continue;
                        }
                        if (var549 == 3109) {
                            var3 -= 2;
                            int var81 = class142.field2062[var3];
                            int var82 = class142.field2062[var3 + 1];
                            class359 var83 = var38 ? class160.field2324 : class235.field3536;
                            class313.method2190(var83, var82, var81, true);
                            continue;
                        }
                        if (var549 == 3110) {
                            var3--;
                            int var84 = class142.field2062[var3];
                            class232.field3501++;
                            class107.field1533.method1915(true, 191);
                            class107.field1533.method1361(var84, (byte) 125);
                            continue;
                        }
                    } else if (var549 < 3300) {
                        if (var549 == 3200) {
                            var3 -= 3;
                            class67.method548(class142.field2062[var3], class142.field2062[var3 + 2], 255, (byte) 27, class142.field2062[var3 + 1]);
                            continue;
                        }
                        if (var549 == 3201) {
                            var3--;
                            class175.method1232(-23, class142.field2062[var3], 255);
                            continue;
                        }
                        if (var549 == 3202) {
                            var3 -= 2;
                            class296.method2112(-1, 255, class142.field2062[var3], class142.field2062[var3 + 1]);
                            continue;
                        }
                    } else if (var549 < 3400) {
                        if (var549 == 3300) {
                            class142.field2062[var3++] = class304.field4560;
                            continue;
                        }
                        if (var549 == 3301) {
                            var3 -= 2;
                            int var85 = class142.field2062[var3];
                            int var86 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class172.method1211(false, var86, var85);
                            continue;
                        }
                        if (var549 == 3302) {
                            var3 -= 2;
                            int var87 = class142.field2062[var3 + 1];
                            int var88 = class142.field2062[var3];
                            class142.field2062[var3++] = class48.method410(var88, var87, 0);
                            continue;
                        }
                        if (var549 == 3303) {
                            var3 -= 2;
                            int var89 = class142.field2062[var3];
                            int var90 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class73.method607(var90, (byte) -55, var89);
                            continue;
                        }
                        if (var549 == 3304) {
                            var3--;
                            int var91 = class142.field2062[var3];
                            class142.field2062[var3++] = class68.method554(var91, 72).field4455;
                            continue;
                        }
                        if (var549 == 3305) {
                            var3--;
                            int var92 = class142.field2062[var3];
                            class142.field2062[var3++] = class275.field4174[var92];
                            continue;
                        }
                        if (var549 == 3306) {
                            var3--;
                            int var93 = class142.field2062[var3];
                            class142.field2062[var3++] = class259.field3859[var93];
                            continue;
                        }
                        if (var549 == 3307) {
                            var3--;
                            int var94 = class142.field2062[var3];
                            class142.field2062[var3++] = class9.field157[var94];
                            continue;
                        }
                        if (var549 == 3308) {
                            int var95 = class321.field4835;
                            int var96 = (class1.field55.field5137 >> 7) + class272.field4123;
                            int var97 = (class1.field55.field5165 >> 7) + class202.field2968;
                            class142.field2062[var3++] = (var95 << 28) + (var96 << 14) + var97;
                            continue;
                        }
                        if (var549 == 3309) {
                            var3--;
                            int var98 = class142.field2062[var3];
                            class142.field2062[var3++] = class287.method2076(268429318, var98) >> 14;
                            continue;
                        }
                        if (var549 == 3310) {
                            var3--;
                            int var99 = class142.field2062[var3];
                            class142.field2062[var3++] = var99 >> 28;
                            continue;
                        }
                        if (var549 == 3311) {
                            var3--;
                            int var100 = class142.field2062[var3];
                            class142.field2062[var3++] = class287.method2076(16383, var100);
                            continue;
                        }
                        if (var549 == 3312) {
                            class142.field2062[var3++] = class189.field2692 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3313) {
                            var3 -= 2;
                            int var101 = class142.field2062[var3] + 32768;
                            int var102 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class172.method1211(false, var102, var101);
                            continue;
                        }
                        if (var549 == 3314) {
                            var3 -= 2;
                            int var103 = class142.field2062[var3 + 1];
                            int var104 = class142.field2062[var3] + 32768;
                            class142.field2062[var3++] = class48.method410(var104, var103, 0);
                            continue;
                        }
                        if (var549 == 3315) {
                            var3 -= 2;
                            int var105 = class142.field2062[var3] + 32768;
                            int var106 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class73.method607(var106, (byte) -124, var105);
                            continue;
                        }
                        if (var549 == 3316) {
                            if (class111.field1619 >= 2) {
                                class142.field2062[var3++] = class111.field1619;
                            } else {
                                class142.field2062[var3++] = 0;
                            }
                            continue;
                        }
                        if (var549 == 3317) {
                            class142.field2062[var3++] = class302.field4516;
                            continue;
                        }
                        if (var549 == 3318) {
                            class142.field2062[var3++] = class15.field227;
                            continue;
                        }
                        if (var549 == 3321) {
                            class142.field2062[var3++] = class281.field4263;
                            continue;
                        }
                        if (var549 == 3322) {
                            class142.field2062[var3++] = class359.field5610;
                            continue;
                        }
                        if (var549 == 3323) {
                            if (class292.field4421 >= 5 && class292.field4421 <= 9) {
                                class142.field2062[var3++] = 1;
                                continue;
                            }
                            class142.field2062[var3++] = 0;
                            continue;
                        }
                        if (var549 == 3324) {
                            if (class292.field4421 >= 5 && class292.field4421 <= 9) {
                                class142.field2062[var3++] = class292.field4421;
                                continue;
                            }
                            class142.field2062[var3++] = 0;
                            continue;
                        }
                        if (var549 == 3325) {
                            class142.field2062[var3++] = class98.field1381 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3326) {
                            class142.field2062[var3++] = class1.field55.field3459;
                            continue;
                        }
                        if (var549 == 3327) {
                            class142.field2062[var3++] = class1.field55.field3445.field3836 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3328) {
                            class142.field2062[var3++] = class251.field3727 && !class216.field3182 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3329) {
                            class142.field2062[var3++] = class296.field4451 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3330) {
                            var3--;
                            int var107 = class142.field2062[var3];
                            class142.field2062[var3++] = class139.method979(var107, 0);
                            continue;
                        }
                        if (var549 == 3331) {
                            var3 -= 2;
                            int var108 = class142.field2062[var3];
                            int var109 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class351.method2450(var108, (byte) -13, var109, false);
                            continue;
                        }
                        if (var549 == 3332) {
                            var3 -= 2;
                            int var110 = class142.field2062[var3];
                            int var111 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class351.method2450(var110, (byte) -13, var111, true);
                            continue;
                        }
                        if (var549 == 3333) {
                            class142.field2062[var3++] = class20.field311;
                            continue;
                        }
                        if (var549 == 3335) {
                            class142.field2062[var3++] = class54.field789;
                            continue;
                        }
                        if (var549 == 3336) {
                            var3 -= 4;
                            int var112 = class142.field2062[var3 + 1];
                            int var113 = class142.field2062[var3 + 3];
                            int var114 = class142.field2062[var3];
                            int var115 = class142.field2062[var3 + 2];
                            int var116 = (var112 << 14) + var114;
                            int var117 = (var115 << 28) + var116;
                            int var118 = var113 + var117;
                            class142.field2062[var3++] = var118;
                            continue;
                        }
                        if (var549 == 3337) {
                            class142.field2062[var3++] = class177.field2543;
                            continue;
                        }
                    } else if (var549 < 3500) {
                        if (var549 == 3400) {
                            var3 -= 2;
                            int var489 = class142.field2062[var3];
                            int var490 = class142.field2062[var3 + 1];
                            class76 var491 = class315.method2197(var489, 51);
                            if (var491.field1106 == 's') {
                            }
                            class62.field909[var5++] = var491.method622((byte) -77, var490);
                            continue;
                        }
                        if (var549 == 3408) {
                            var3 -= 4;
                            int var492 = class142.field2062[var3 + 1];
                            int var493 = class142.field2062[var3 + 2];
                            int var494 = class142.field2062[var3 + 3];
                            int var495 = class142.field2062[var3];
                            class76 var496 = class315.method2197(var493, arg2 + 18);
                            if (var496.field1100 == var495 && var496.field1106 == var492) {
                                if (var492 == 115) {
                                    class62.field909[var5++] = var496.method622((byte) -78, var494);
                                } else {
                                    class142.field2062[var3++] = var496.method618(var494, arg2 - 62);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var549 == 3409) {
                            var3 -= 3;
                            int var497 = class142.field2062[var3];
                            int var498 = class142.field2062[var3 + 2];
                            int var499 = class142.field2062[var3 + 1];
                            if (var499 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class76 var500 = class315.method2197(var499, 87);
                            if (var500.field1106 != var497) {
                                throw new RuntimeException("C3409-1");
                            }
                            class142.field2062[var3++] = var500.method621(var498, true) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3410) {
                            var3--;
                            int var501 = class142.field2062[var3];
                            var5--;
                            String var502 = class62.field909[var5];
                            if (var501 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class76 var503 = class315.method2197(var501, 2);
                            if (var503.field1106 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class142.field2062[var3++] = var503.method620(true, var502) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3411) {
                            var3--;
                            int var504 = class142.field2062[var3];
                            class76 var505 = class315.method2197(var504, 53);
                            class142.field2062[var3++] = var505.field1114.method1409(class228.method1706(arg2, 4));
                            continue;
                        }
                    } else if (var549 < 3700) {
                        if (var549 == 3600) {
                            if (class180.field2586 == 0) {
                                class142.field2062[var3++] = -2;
                            } else if (class180.field2586 == 1) {
                                class142.field2062[var3++] = -1;
                            } else {
                                class142.field2062[var3++] = class110.field1608;
                            }
                            continue;
                        }
                        if (var549 == 3601) {
                            var3--;
                            int var463 = class142.field2062[var3];
                            if (class180.field2586 == 2 && class110.field1608 > var463) {
                                class62.field909[var5++] = class109.field1585[var463];
                                if (class50.field761[var463] == null) {
                                    class62.field909[var5++] = "";
                                } else {
                                    class62.field909[var5++] = class50.field761[var463];
                                }
                                continue;
                            }
                            class62.field909[var5++] = "";
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 3602) {
                            var3--;
                            int var464 = class142.field2062[var3];
                            if (class180.field2586 == 2 && class110.field1608 > var464) {
                                class142.field2062[var3++] = class284.field4294[var464];
                                continue;
                            }
                            class142.field2062[var3++] = 0;
                            continue;
                        }
                        if (var549 == 3603) {
                            var3--;
                            int var465 = class142.field2062[var3];
                            if (class180.field2586 == 2 && class110.field1608 > var465) {
                                class142.field2062[var3++] = class32.field459[var465];
                                continue;
                            }
                            class142.field2062[var3++] = 0;
                            continue;
                        }
                        if (var549 == 3604) {
                            var3--;
                            int var466 = class142.field2062[var3];
                            var5--;
                            String var467 = class62.field909[var5];
                            class20.method125((byte) -102, var466, var467);
                            continue;
                        }
                        if (var549 == 3605) {
                            var5--;
                            String var468 = class62.field909[var5];
                            class143.method1027(arg2 - 4, var468);
                            continue;
                        }
                        if (var549 == 3606) {
                            var5--;
                            String var469 = class62.field909[var5];
                            class262.method1942(var469, (byte) 125);
                            continue;
                        }
                        if (var549 == 3607) {
                            var5--;
                            String var470 = class62.field909[var5];
                            class229.method1712((byte) -115, var470, false);
                            continue;
                        }
                        if (var549 == 3608) {
                            var5--;
                            String var471 = class62.field909[var5];
                            class351.method2453(var471, (byte) -4);
                            continue;
                        }
                        if (var549 == 3609) {
                            var5--;
                            String var472 = class62.field909[var5];
                            if (var472.startsWith("<img=0>") || var472.startsWith("<img=1>")) {
                                var472 = var472.substring(7);
                            }
                            class142.field2062[var3++] = class330.method2308(var472, (byte) -104) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3610) {
                            var3--;
                            int var473 = class142.field2062[var3];
                            if (class180.field2586 == 2 && class110.field1608 > var473) {
                                class62.field909[var5++] = class119.field1684[var473];
                                continue;
                            }
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 3611) {
                            if (class321.field4842 == null) {
                                class62.field909[var5++] = "";
                            } else {
                                class62.field909[var5++] = class239.method1765(class321.field4842, true);
                            }
                            continue;
                        }
                        if (var549 == 3612) {
                            if (class321.field4842 == null) {
                                class142.field2062[var3++] = 0;
                            } else {
                                class142.field2062[var3++] = class256.field3832;
                            }
                            continue;
                        }
                        if (var549 == 3613) {
                            var3--;
                            int var474 = class142.field2062[var3];
                            if (class321.field4842 != null && class256.field3832 > var474) {
                                class62.field909[var5++] = class132.field1942[var474].field2127;
                                continue;
                            }
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 3614) {
                            var3--;
                            int var475 = class142.field2062[var3];
                            if (class321.field4842 != null && class256.field3832 > var475) {
                                class142.field2062[var3++] = class132.field1942[var475].field2131;
                                continue;
                            }
                            class142.field2062[var3++] = 0;
                            continue;
                        }
                        if (var549 == 3615) {
                            var3--;
                            int var476 = class142.field2062[var3];
                            if (class321.field4842 != null && class256.field3832 > var476) {
                                class142.field2062[var3++] = class132.field1942[var476].field2122;
                                continue;
                            }
                            class142.field2062[var3++] = 0;
                            continue;
                        }
                        if (var549 == 3616) {
                            class142.field2062[var3++] = class14.field210;
                            continue;
                        }
                        if (var549 == 3617) {
                            var5--;
                            String var477 = class62.field909[var5];
                            class109.method833((byte) 85, var477);
                            continue;
                        }
                        if (var549 == 3618) {
                            class142.field2062[var3++] = class362.field5748;
                            continue;
                        }
                        if (var549 == 3619) {
                            var5--;
                            String var478 = class62.field909[var5];
                            class213.method1537(64, var478);
                            continue;
                        }
                        if (var549 == 3620) {
                            class197.method1418(arg2 - 109);
                            continue;
                        }
                        if (var549 == 3621) {
                            if (class180.field2586 == 0) {
                                class142.field2062[var3++] = -1;
                            } else {
                                class142.field2062[var3++] = class255.field3810;
                            }
                            continue;
                        }
                        if (var549 == 3622) {
                            var3--;
                            int var479 = class142.field2062[var3];
                            if (class180.field2586 != 0 && class255.field3810 > var479) {
                                class62.field909[var5++] = class192.field2806[var479];
                                if (class170.field2455[var479] == null) {
                                    class62.field909[var5++] = "";
                                } else {
                                    class62.field909[var5++] = class170.field2455[var479];
                                }
                                continue;
                            }
                            class62.field909[var5++] = "";
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 3623) {
                            var5--;
                            String var480 = class62.field909[var5];
                            if (var480.startsWith("<img=0>") || var480.startsWith("<img=1>")) {
                                var480 = var480.substring(7);
                            }
                            class142.field2062[var3++] = class103.method793(48, var480) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3624) {
                            var3--;
                            int var481 = class142.field2062[var3];
                            if (class132.field1942 != null && class256.field3832 > var481 && class132.field1942[var481].field2126.equalsIgnoreCase(class1.field55.field3453)) {
                                class142.field2062[var3++] = 1;
                                continue;
                            }
                            class142.field2062[var3++] = 0;
                            continue;
                        }
                        if (var549 == 3625) {
                            if (class71.field1027 == null) {
                                class62.field909[var5++] = "";
                            } else {
                                class62.field909[var5++] = class71.field1027;
                            }
                            continue;
                        }
                        if (var549 == 3626) {
                            var3--;
                            int var482 = class142.field2062[var3];
                            if (class321.field4842 != null && class256.field3832 > var482) {
                                class62.field909[var5++] = class132.field1942[var482].field2125;
                                continue;
                            }
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 3627) {
                            var3--;
                            int var483 = class142.field2062[var3];
                            if (class180.field2586 == 2 && var483 >= 0 && var483 < class110.field1608) {
                                class142.field2062[var3++] = class313.field4661[var483] ? 1 : 0;
                                continue;
                            }
                            class142.field2062[var3++] = 0;
                            continue;
                        }
                        if (var549 == 3628) {
                            var5--;
                            String var484 = class62.field909[var5];
                            if (var484.startsWith("<img=0>") || var484.startsWith("<img=1>")) {
                                var484 = var484.substring(7);
                            }
                            class142.field2062[var3++] = class158.method1138(var484, arg2 - 21161);
                            continue;
                        }
                        if (var549 == 3629) {
                            class142.field2062[var3++] = class129.field1873;
                            continue;
                        }
                        if (var549 == 3630) {
                            var5--;
                            String var485 = class62.field909[var5];
                            class229.method1712((byte) -122, var485, true);
                            continue;
                        }
                        if (var549 == 3631) {
                            var3--;
                            int var486 = class142.field2062[var3];
                            class142.field2062[var3++] = class333.field5161[var486] ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3632) {
                            var3--;
                            int var487 = class142.field2062[var3];
                            if (class321.field4842 != null && class256.field3832 > var487) {
                                class62.field909[var5++] = class132.field1942[var487].field2126;
                                continue;
                            }
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 3633) {
                            var3--;
                            int var488 = class142.field2062[var3];
                            if (class180.field2586 != 0 && var488 < class255.field3810) {
                                class62.field909[var5++] = class225.field3387[var488];
                                continue;
                            }
                            class62.field909[var5++] = "";
                            continue;
                        }
                    } else if (var549 < 4000) {
                        if (var549 == 3903) {
                            var3--;
                            int var119 = class142.field2062[var3];
                            class142.field2062[var3++] = class302.field4506[var119].method540(33);
                            continue;
                        }
                        if (var549 == 3904) {
                            var3--;
                            int var120 = class142.field2062[var3];
                            class142.field2062[var3++] = class302.field4506[var120].field962;
                            continue;
                        }
                        if (var549 == 3905) {
                            var3--;
                            int var121 = class142.field2062[var3];
                            class142.field2062[var3++] = class302.field4506[var121].field960;
                            continue;
                        }
                        if (var549 == 3906) {
                            var3--;
                            int var122 = class142.field2062[var3];
                            class142.field2062[var3++] = class302.field4506[var122].field963;
                            continue;
                        }
                        if (var549 == 3907) {
                            var3--;
                            int var123 = class142.field2062[var3];
                            class142.field2062[var3++] = class302.field4506[var123].field965;
                            continue;
                        }
                        if (var549 == 3908) {
                            var3--;
                            int var124 = class142.field2062[var3];
                            class142.field2062[var3++] = class302.field4506[var124].field957;
                            continue;
                        }
                        if (var549 == 3910) {
                            var3--;
                            int var125 = class142.field2062[var3];
                            int var126 = class302.field4506[var125].method539((byte) -87);
                            class142.field2062[var3++] = var126 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3911) {
                            var3--;
                            int var127 = class142.field2062[var3];
                            int var128 = class302.field4506[var127].method539((byte) -87);
                            class142.field2062[var3++] = var128 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3912) {
                            var3--;
                            int var129 = class142.field2062[var3];
                            int var130 = class302.field4506[var129].method539((byte) -87);
                            class142.field2062[var3++] = var130 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3913) {
                            var3--;
                            int var131 = class142.field2062[var3];
                            int var132 = class302.field4506[var131].method539((byte) -87);
                            class142.field2062[var3++] = var132 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var549 < 4100) {
                        if (var549 == 4000) {
                            var3 -= 2;
                            int var418 = class142.field2062[var3 + 1];
                            int var419 = class142.field2062[var3];
                            class142.field2062[var3++] = var418 + var419;
                            continue;
                        }
                        if (var549 == 4001) {
                            var3 -= 2;
                            int var420 = class142.field2062[var3];
                            int var421 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = var420 - var421;
                            continue;
                        }
                        if (var549 == 4002) {
                            var3 -= 2;
                            int var422 = class142.field2062[var3];
                            int var423 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = var422 * var423;
                            continue;
                        }
                        if (var549 == 4003) {
                            var3 -= 2;
                            int var424 = class142.field2062[var3];
                            int var425 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = var424 / var425;
                            continue;
                        }
                        if (var549 == 4004) {
                            var3--;
                            int var426 = class142.field2062[var3];
                            class142.field2062[var3++] = (int) (Math.random() * (double) var426);
                            continue;
                        }
                        if (var549 == 4005) {
                            var3--;
                            int var427 = class142.field2062[var3];
                            class142.field2062[var3++] = (int) ((double) (var427 + 1) * Math.random());
                            continue;
                        }
                        if (var549 == 4006) {
                            var3 -= 5;
                            int var428 = class142.field2062[var3];
                            int var429 = class142.field2062[var3 + 2];
                            int var430 = class142.field2062[var3 + 1];
                            int var431 = class142.field2062[var3 + 3];
                            int var432 = class142.field2062[var3 + 4];
                            class142.field2062[var3++] = (var432 - var429) * (var430 - var428) / (var431 - var429) + var428;
                            continue;
                        }
                        if (var549 == 4007) {
                            var3 -= 2;
                            long var433 = (long) class142.field2062[var3 + 1];
                            long var435 = (long) class142.field2062[var3];
                            class142.field2062[var3++] = (int) (var433 * var435 / 100L + var435);
                            continue;
                        }
                        if (var549 == 4008) {
                            var3 -= 2;
                            int var437 = class142.field2062[var3];
                            int var438 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class81.method666(0x1 << var438, var437);
                            continue;
                        }
                        if (var549 == 4009) {
                            var3 -= 2;
                            int var439 = class142.field2062[var3];
                            int var440 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class287.method2076(-(0x1 << var440) - 1, var439);
                            continue;
                        }
                        if (var549 == 4010) {
                            var3 -= 2;
                            int var441 = class142.field2062[var3 + 1];
                            int var442 = class142.field2062[var3];
                            class142.field2062[var3++] = class287.method2076(0x1 << var441, var442) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var549 == 4011) {
                            var3 -= 2;
                            int var443 = class142.field2062[var3 + 1];
                            int var444 = class142.field2062[var3];
                            class142.field2062[var3++] = var444 % var443;
                            continue;
                        }
                        if (var549 == 4012) {
                            var3 -= 2;
                            int var445 = class142.field2062[var3];
                            int var446 = class142.field2062[var3 + 1];
                            if (var445 == 0) {
                                class142.field2062[var3++] = 0;
                            } else {
                                class142.field2062[var3++] = (int) Math.pow((double) var445, (double) var446);
                            }
                            continue;
                        }
                        if (var549 == 4013) {
                            var3 -= 2;
                            int var447 = class142.field2062[var3];
                            int var448 = class142.field2062[var3 + 1];
                            if (var447 == 0) {
                                class142.field2062[var3++] = 0;
                            } else if (var448 == 0) {
                                class142.field2062[var3++] = Integer.MAX_VALUE;
                            } else {
                                class142.field2062[var3++] = (int) Math.pow((double) var447, 1.0D / (double) var448);
                            }
                            continue;
                        }
                        if (var549 == 4014) {
                            var3 -= 2;
                            int var449 = class142.field2062[var3];
                            int var450 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class287.method2076(var450, var449);
                            continue;
                        }
                        if (var549 == 4015) {
                            var3 -= 2;
                            int var451 = class142.field2062[var3];
                            int var452 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class81.method666(var451, var452);
                            continue;
                        }
                        if (var549 == 4016) {
                            var3 -= 2;
                            int var453 = class142.field2062[var3];
                            int var454 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = var453 < var454 ? var453 : var454;
                            continue;
                        }
                        if (var549 == 4017) {
                            var3 -= 2;
                            int var455 = class142.field2062[var3];
                            int var456 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = var455 <= var456 ? var456 : var455;
                            continue;
                        }
                        if (var549 == 4018) {
                            var3 -= 3;
                            long var457 = (long) class142.field2062[var3 + 1];
                            long var459 = (long) class142.field2062[var3];
                            long var461 = (long) class142.field2062[var3 + 2];
                            class142.field2062[var3++] = (int) (var459 * var461 / var457);
                            continue;
                        }
                    } else if (var549 < 4200) {
                        if (var549 == 4100) {
                            var3--;
                            int var133 = class142.field2062[var3];
                            var5--;
                            String var134 = class62.field909[var5];
                            class62.field909[var5++] = var134 + var133;
                            continue;
                        }
                        if (var549 == 4101) {
                            var5 -= 2;
                            String var135 = class62.field909[var5];
                            String var136 = class62.field909[var5 + 1];
                            class62.field909[var5++] = var135 + var136;
                            continue;
                        }
                        if (var549 == 4102) {
                            var5--;
                            String var137 = class62.field909[var5];
                            var3--;
                            int var138 = class142.field2062[var3];
                            class62.field909[var5++] = var137 + class338.method2378(-1, var138, true);
                            continue;
                        }
                        if (var549 == 4103) {
                            var5--;
                            String var139 = class62.field909[var5];
                            class62.field909[var5++] = var139.toLowerCase();
                            continue;
                        }
                        if (var549 == 4104) {
                            var3--;
                            int var140 = class142.field2062[var3];
                            long var141 = (long) var140 * 86400000L + 1014768000000L;
                            class200.field2943.setTime(new Date(var141));
                            int var143 = class200.field2943.get(5);
                            int var144 = class200.field2943.get(2);
                            int var145 = class200.field2943.get(1);
                            class62.field909[var5++] = var143 + "-" + class173.field2498[var144] + "-" + var145;
                            continue;
                        }
                        if (var549 == 4105) {
                            var5 -= 2;
                            String var146 = class62.field909[var5];
                            String var147 = class62.field909[var5 + 1];
                            if (class1.field55.field3445 != null && class1.field55.field3445.field3836) {
                                class62.field909[var5++] = var147;
                                continue;
                            }
                            class62.field909[var5++] = var146;
                            continue;
                        }
                        if (var549 == 4106) {
                            var3--;
                            int var148 = class142.field2062[var3];
                            class62.field909[var5++] = Integer.toString(var148);
                            continue;
                        }
                        if (var549 == 4107) {
                            var5 -= 2;
                            class142.field2062[var3++] = class335.method2365(class333.method2346(class54.field789, class62.field909[var5], arg2 - 5, class62.field909[var5 + 1]), (byte) -83);
                            continue;
                        }
                        if (var549 == 4108) {
                            var3 -= 2;
                            int var149 = class142.field2062[var3 + 1];
                            int var150 = class142.field2062[var3];
                            var5--;
                            String var151 = class62.field909[var5];
                            class142.field2062[var3++] = class202.method1467(var149, 0).method207(var151, var150);
                            continue;
                        }
                        if (var549 == 4109) {
                            var3 -= 2;
                            var5--;
                            String var152 = class62.field909[var5];
                            int var153 = class142.field2062[var3];
                            int var154 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = class202.method1467(var154, 0).method185(var152, var153);
                            continue;
                        }
                        if (var549 == 4110) {
                            var5 -= 2;
                            String var155 = class62.field909[var5];
                            String var156 = class62.field909[var5 + 1];
                            var3--;
                            if (class142.field2062[var3] == 1) {
                                class62.field909[var5++] = var155;
                            } else {
                                class62.field909[var5++] = var156;
                            }
                            continue;
                        }
                        if (var549 == 4111) {
                            var5--;
                            String var157 = class62.field909[var5];
                            class62.field909[var5++] = class29.method196(var157);
                            continue;
                        }
                        if (var549 == 4112) {
                            var5--;
                            String var158 = class62.field909[var5];
                            var3--;
                            int var159 = class142.field2062[var3];
                            if (var159 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class62.field909[var5++] = var158 + (char) var159;
                            continue;
                        }
                        if (var549 == 4113) {
                            var3--;
                            int var160 = class142.field2062[var3];
                            class142.field2062[var3++] = class166.method1181((char) var160, (byte) -67) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4114) {
                            var3--;
                            int var161 = class142.field2062[var3];
                            class142.field2062[var3++] = class51.method425(57, (char) var161) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4115) {
                            var3--;
                            int var162 = class142.field2062[var3];
                            class142.field2062[var3++] = class196.method1414(48, (char) var162) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4116) {
                            var3--;
                            int var163 = class142.field2062[var3];
                            class142.field2062[var3++] = class17.method108((byte) -89, (char) var163) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4117) {
                            var5--;
                            String var164 = class62.field909[var5];
                            if (var164 == null) {
                                class142.field2062[var3++] = 0;
                            } else {
                                class142.field2062[var3++] = var164.length();
                            }
                            continue;
                        }
                        if (var549 == 4118) {
                            var3 -= 2;
                            int var165 = class142.field2062[var3];
                            var5--;
                            String var166 = class62.field909[var5];
                            int var167 = class142.field2062[var3 + 1];
                            class62.field909[var5++] = var166.substring(var165, var167);
                            continue;
                        }
                        if (var549 == 4119) {
                            var5--;
                            String var168 = class62.field909[var5];
                            boolean var169 = false;
                            StringBuffer var170 = new StringBuffer(var168.length());
                            for (int var171 = 0; var171 < var168.length(); var171++) {
                                char var172 = var168.charAt(var171);
                                if (var172 == '<') {
                                    var169 = true;
                                } else if (var172 == '>') {
                                    var169 = false;
                                } else if (!var169) {
                                    var170.append(var172);
                                }
                            }
                            class62.field909[var5++] = var170.toString();
                            continue;
                        }
                        if (var549 == 4120) {
                            var3 -= 2;
                            int var173 = class142.field2062[var3];
                            var5--;
                            String var174 = class62.field909[var5];
                            int var175 = class142.field2062[var3 + 1];
                            class142.field2062[var3++] = var174.indexOf(var173, var175);
                            continue;
                        }
                        if (var549 == 4121) {
                            var5 -= 2;
                            String var176 = class62.field909[var5];
                            String var177 = class62.field909[var5 + 1];
                            var3--;
                            int var178 = class142.field2062[var3];
                            class142.field2062[var3++] = var176.indexOf(var177, var178);
                            continue;
                        }
                        if (var549 == 4122) {
                            var3--;
                            int var179 = class142.field2062[var3];
                            class142.field2062[var3++] = Character.toLowerCase((char) var179);
                            continue;
                        }
                        if (var549 == 4123) {
                            var3--;
                            int var180 = class142.field2062[var3];
                            class142.field2062[var3++] = Character.toUpperCase((char) var180);
                            continue;
                        }
                        if (var549 == 4124) {
                            var3--;
                            boolean var181 = class142.field2062[var3] != 0;
                            var3--;
                            int var182 = class142.field2062[var3];
                            class62.field909[var5++] = class33.method246(var181, -3194, 0, (long) var182, class54.field789);
                            continue;
                        }
                    } else if (var549 < 4300) {
                        if (var549 == 4200) {
                            var3--;
                            int var183 = class142.field2062[var3];
                            class62.field909[var5++] = class175.method1228((byte) 54, var183).field1742;
                            continue;
                        }
                        if (var549 == 4201) {
                            var3 -= 2;
                            int var184 = class142.field2062[var3];
                            int var185 = class142.field2062[var3 + 1];
                            class122 var186 = class175.method1228((byte) 54, var184);
                            if (var185 >= 1 && var185 <= 5 && var186.field1737[var185 - 1] != null) {
                                class62.field909[var5++] = var186.field1737[var185 - 1];
                                continue;
                            }
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 4202) {
                            var3 -= 2;
                            int var187 = class142.field2062[var3 + 1];
                            int var188 = class142.field2062[var3];
                            class122 var189 = class175.method1228((byte) 54, var188);
                            if (var187 >= 1 && var187 <= 5 && var189.field1727[var187 - 1] != null) {
                                class62.field909[var5++] = var189.field1727[var187 - 1];
                                continue;
                            }
                            class62.field909[var5++] = "";
                            continue;
                        }
                        if (var549 == 4203) {
                            var3--;
                            int var190 = class142.field2062[var3];
                            class142.field2062[var3++] = class175.method1228((byte) 54, var190).field1713;
                            continue;
                        }
                        if (var549 == 4204) {
                            var3--;
                            int var191 = class142.field2062[var3];
                            class142.field2062[var3++] = class175.method1228((byte) 54, var191).field1745 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4205) {
                            var3--;
                            int var192 = class142.field2062[var3];
                            class122 var193 = class175.method1228((byte) 54, var192);
                            if (var193.field1758 == -1 && var193.field1741 >= 0) {
                                class142.field2062[var3++] = var193.field1741;
                                continue;
                            }
                            class142.field2062[var3++] = var192;
                            continue;
                        }
                        if (var549 == 4206) {
                            var3--;
                            int var194 = class142.field2062[var3];
                            class122 var195 = class175.method1228((byte) 54, var194);
                            if (var195.field1758 >= 0 && var195.field1741 >= 0) {
                                class142.field2062[var3++] = var195.field1741;
                                continue;
                            }
                            class142.field2062[var3++] = var194;
                            continue;
                        }
                        if (var549 == 4207) {
                            var3--;
                            int var196 = class142.field2062[var3];
                            class142.field2062[var3++] = class175.method1228((byte) 54, var196).field1771 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4208) {
                            var3 -= 2;
                            int var197 = class142.field2062[var3];
                            int var198 = class142.field2062[var3 + 1];
                            class343 var199 = class275.method2009(0, var198);
                            if (var199.method2394(true)) {
                                class62.field909[var5++] = class175.method1228((byte) 54, var197).method909((byte) 108, var198, var199.field5301);
                            } else {
                                class142.field2062[var3++] = class175.method1228((byte) 54, var197).method916(var198, var199.field5307, (byte) 126);
                            }
                            continue;
                        }
                        if (var549 == 4210) {
                            var5--;
                            String var200 = class62.field909[var5];
                            var3--;
                            int var201 = class142.field2062[var3];
                            class51.method431(var200, 122, var201 == 1);
                            class142.field2062[var3++] = class334.field5205;
                            continue;
                        }
                        if (var549 == 4211) {
                            if (class262.field3981 != null && class130.field1882 < class334.field5205) {
                                class142.field2062[var3++] = class287.method2076(65535, class262.field3981[class130.field1882++]);
                                continue;
                            }
                            class142.field2062[var3++] = -1;
                            continue;
                        }
                        if (var549 == 4212) {
                            class130.field1882 = 0;
                            continue;
                        }
                    } else if (var549 >= 4400) {
                        if (var549 >= 4500) {
                            if (var549 < 4600) {
                                if (var549 == 4500) {
                                    var3 -= 2;
                                    int var202 = class142.field2062[var3];
                                    int var203 = class142.field2062[var3 + 1];
                                    class343 var204 = class275.method2009(0, var203);
                                    if (var204.method2394(true)) {
                                        class62.field909[var5++] = class302.method2134(29, var202).method1159(arg2 + 6, var203, var204.field5301);
                                    } else {
                                        class142.field2062[var3++] = class302.method2134(class228.method1706(arg2, -76), var202).method1163(arg2 - 3, var203, var204.field5307);
                                    }
                                    continue;
                                }
                            } else if (var549 < 5100) {
                                if (var549 == 5000) {
                                    class142.field2062[var3++] = class241.field3595;
                                    continue;
                                }
                                if (var549 == 5001) {
                                    class17.field280++;
                                    var3 -= 3;
                                    class241.field3595 = class142.field2062[var3];
                                    class14.field211 = class142.field2062[var3 + 1];
                                    class201.field2946 = class142.field2062[var3 + 2];
                                    class107.field1533.method1915(true, 52);
                                    class107.field1533.method1355((byte) -118, class241.field3595);
                                    class107.field1533.method1355((byte) -121, class14.field211);
                                    class107.field1533.method1355((byte) -126, class201.field2946);
                                    continue;
                                }
                                if (var549 == 5002) {
                                    var3 -= 2;
                                    var5--;
                                    String var205 = class62.field909[var5];
                                    class185.field2660++;
                                    int var206 = class142.field2062[var3];
                                    int var207 = class142.field2062[var3 + 1];
                                    class107.field1533.method1915(true, 116);
                                    class107.field1533.method1355((byte) -118, class225.method1646(-51, var205) + 2);
                                    class107.field1533.method1343(var205, 0);
                                    class107.field1533.method1355((byte) -122, var206 - 1);
                                    class107.field1533.method1355((byte) -125, var207);
                                    continue;
                                }
                                if (var549 == 5003) {
                                    var3--;
                                    int var208 = class142.field2062[var3];
                                    String var209 = null;
                                    if (var208 < 100) {
                                        var209 = class143.field2074[var208];
                                    }
                                    if (var209 == null) {
                                        var209 = "";
                                    }
                                    class62.field909[var5++] = var209;
                                    continue;
                                }
                                if (var549 == 5004) {
                                    var3--;
                                    int var210 = class142.field2062[var3];
                                    int var211 = -1;
                                    if (var210 < 100 && class143.field2074[var210] != null) {
                                        var211 = class213.field3073[var210];
                                    }
                                    class142.field2062[var3++] = var211;
                                    continue;
                                }
                                if (var549 == 5005) {
                                    class142.field2062[var3++] = class14.field211;
                                    continue;
                                }
                                if (var549 == 5008) {
                                    var5--;
                                    String var212 = class62.field909[var5];
                                    if (!var212.startsWith("::")) {
                                        if (class111.field1619 == 0 && (class251.field3727 && !class216.field3182 || class296.field4451)) {
                                            continue;
                                        }
                                        String var213 = var212.toLowerCase();
                                        byte var214 = 0;
                                        class214.field3130++;
                                        if (var213.startsWith(class92.field1285)) {
                                            var214 = 0;
                                            var212 = var212.substring(class92.field1285.length());
                                        } else if (var213.startsWith(class83.field1185)) {
                                            var214 = 1;
                                            var212 = var212.substring(class83.field1185.length());
                                        } else if (var213.startsWith(class312.field4643)) {
                                            var212 = var212.substring(class312.field4643.length());
                                            var214 = 2;
                                        } else if (var213.startsWith(class202.field2958)) {
                                            var212 = var212.substring(class202.field2958.length());
                                            var214 = 3;
                                        } else if (var213.startsWith(class40.field584)) {
                                            var212 = var212.substring(class40.field584.length());
                                            var214 = 4;
                                        } else if (var213.startsWith(class249.field3701)) {
                                            var214 = 5;
                                            var212 = var212.substring(class249.field3701.length());
                                        } else if (var213.startsWith(class320.field4810)) {
                                            var214 = 6;
                                            var212 = var212.substring(class320.field4810.length());
                                        } else if (var213.startsWith(class206.field3020)) {
                                            var212 = var212.substring(class206.field3020.length());
                                            var214 = 7;
                                        } else if (var213.startsWith(class358.field5487)) {
                                            var212 = var212.substring(class358.field5487.length());
                                            var214 = 8;
                                        } else if (var213.startsWith(class270.field4109)) {
                                            var214 = 9;
                                            var212 = var212.substring(class270.field4109.length());
                                        } else if (var213.startsWith(class333.field5112)) {
                                            var212 = var212.substring(class333.field5112.length());
                                            var214 = 10;
                                        } else if (var213.startsWith(class259.field3869)) {
                                            var214 = 11;
                                            var212 = var212.substring(class259.field3869.length());
                                        } else if (class54.field789 != 0) {
                                            if (var213.startsWith(class5.field130)) {
                                                var214 = 0;
                                                var212 = var212.substring(class5.field130.length());
                                            } else if (var213.startsWith(class123.field1788)) {
                                                var212 = var212.substring(class123.field1788.length());
                                                var214 = 1;
                                            } else if (var213.startsWith(class312.field4640)) {
                                                var214 = 2;
                                                var212 = var212.substring(class312.field4640.length());
                                            } else if (var213.startsWith(class276.field4185)) {
                                                var214 = 3;
                                                var212 = var212.substring(class276.field4185.length());
                                            } else if (var213.startsWith(class55.field801)) {
                                                var214 = 4;
                                                var212 = var212.substring(class55.field801.length());
                                            } else if (var213.startsWith(class88.field1242)) {
                                                var214 = 5;
                                                var212 = var212.substring(class88.field1242.length());
                                            } else if (var213.startsWith(class202.field2964)) {
                                                var212 = var212.substring(class202.field2964.length());
                                                var214 = 6;
                                            } else if (var213.startsWith(class306.field4582)) {
                                                var212 = var212.substring(class306.field4582.length());
                                                var214 = 7;
                                            } else if (var213.startsWith(class261.field3935)) {
                                                var212 = var212.substring(class261.field3935.length());
                                                var214 = 8;
                                            } else if (var213.startsWith(class192.field2798)) {
                                                var214 = 9;
                                                var212 = var212.substring(class192.field2798.length());
                                            } else if (var213.startsWith(class52.field777)) {
                                                var212 = var212.substring(class52.field777.length());
                                                var214 = 10;
                                            } else if (var213.startsWith(class51.field771)) {
                                                var212 = var212.substring(class51.field771.length());
                                                var214 = 11;
                                            }
                                        }
                                        byte var215 = 0;
                                        String var216 = var212.toLowerCase();
                                        if (var216.startsWith(class131.field1910)) {
                                            var212 = var212.substring(class131.field1910.length());
                                            var215 = 1;
                                        } else if (var216.startsWith(class58.field851)) {
                                            var215 = 2;
                                            var212 = var212.substring(class58.field851.length());
                                        } else if (var216.startsWith(class51.field768)) {
                                            var212 = var212.substring(class51.field768.length());
                                            var215 = 3;
                                        } else if (var216.startsWith(class333.field5093)) {
                                            var215 = 4;
                                            var212 = var212.substring(class333.field5093.length());
                                        } else if (var216.startsWith(class287.field4348)) {
                                            var212 = var212.substring(class287.field4348.length());
                                            var215 = 5;
                                        } else if (class54.field789 != 0) {
                                            if (var216.startsWith(class109.field1582)) {
                                                var215 = 1;
                                                var212 = var212.substring(class109.field1582.length());
                                            } else if (var216.startsWith(class332.field5070)) {
                                                var215 = 2;
                                                var212 = var212.substring(class332.field5070.length());
                                            } else if (var216.startsWith(class139.field1996)) {
                                                var212 = var212.substring(class139.field1996.length());
                                                var215 = 3;
                                            } else if (var216.startsWith(class252.field3764)) {
                                                var215 = 4;
                                                var212 = var212.substring(class252.field3764.length());
                                            } else if (var216.startsWith(class150.field2177)) {
                                                var215 = 5;
                                                var212 = var212.substring(class150.field2177.length());
                                            }
                                        }
                                        class107.field1533.method1915(true, 144);
                                        class107.field1533.method1355((byte) -123, 0);
                                        int var217 = class107.field1533.field2776;
                                        class107.field1533.method1355((byte) -127, var214);
                                        class107.field1533.method1355((byte) -115, var215);
                                        class54.method448(var212, class107.field1533, arg2 ^ 0x51);
                                        class107.field1533.method1374(23107, class107.field1533.field2776 - var217);
                                        continue;
                                    }
                                    class98.method772(-86, var212);
                                    continue;
                                }
                                if (var549 == 5009) {
                                    var5 -= 2;
                                    String var218 = class62.field909[var5];
                                    String var219 = class62.field909[var5 + 1];
                                    if (class111.field1619 != 0 || (!class251.field3727 || class216.field3182) && !class296.field4451) {
                                        class290.field4394++;
                                        class107.field1533.method1915(true, 76);
                                        class107.field1533.method1355((byte) -115, 0);
                                        int var220 = class107.field1533.field2776;
                                        class107.field1533.method1343(var218, arg2 ^ 0x4);
                                        class54.method448(var219, class107.field1533, 75);
                                        class107.field1533.method1374(arg2 + 23103, class107.field1533.field2776 - var220);
                                    }
                                    continue;
                                }
                                if (var549 == 5010) {
                                    String var221 = null;
                                    var3--;
                                    int var222 = class142.field2062[var3];
                                    if (var222 < 100) {
                                        var221 = class146.field2102[var222];
                                    }
                                    if (var221 == null) {
                                        var221 = "";
                                    }
                                    class62.field909[var5++] = var221;
                                    continue;
                                }
                                if (var549 == 5011) {
                                    var3--;
                                    int var223 = class142.field2062[var3];
                                    String var224 = null;
                                    if (var223 < 100) {
                                        var224 = class15.field221[var223];
                                    }
                                    if (var224 == null) {
                                        var224 = "";
                                    }
                                    class62.field909[var5++] = var224;
                                    continue;
                                }
                                if (var549 == 5012) {
                                    int var225 = -1;
                                    var3--;
                                    int var226 = class142.field2062[var3];
                                    if (var226 < 100) {
                                        var225 = class209.field3049[var226];
                                    }
                                    class142.field2062[var3++] = var225;
                                    continue;
                                }
                                if (var549 == 5015) {
                                    String var227;
                                    if (class1.field55 == null || class1.field55.field3452 == null) {
                                        var227 = class32.field458;
                                    } else {
                                        var227 = class1.field55.method1707(-102, true);
                                    }
                                    class62.field909[var5++] = var227;
                                    continue;
                                }
                                if (var549 == 5018) {
                                    var3--;
                                    int var228 = class142.field2062[var3];
                                    int var229 = 0;
                                    if (var228 < 100 && class143.field2074[var228] != null) {
                                        var229 = class213.field3073[var228];
                                    }
                                    class142.field2062[var3++] = var229;
                                    continue;
                                }
                                if (var549 == 5019) {
                                    String var230 = null;
                                    var3--;
                                    int var231 = class142.field2062[var3];
                                    if (var231 < 100) {
                                        var230 = class259.field3862[var231];
                                    }
                                    if (var230 == null) {
                                        var230 = "";
                                    }
                                    class62.field909[var5++] = var230;
                                    continue;
                                }
                                if (var549 == 5016) {
                                    class142.field2062[var3++] = class201.field2946;
                                    continue;
                                }
                                if (var549 == 5017) {
                                    class142.field2062[var3++] = class20.field318;
                                    continue;
                                }
                                if (var549 == 5050) {
                                    var3--;
                                    int var232 = class142.field2062[var3];
                                    class62.field909[var5++] = class197.method1417(var232, -16267).field2531;
                                    continue;
                                }
                                if (var549 == 5051) {
                                    var3--;
                                    int var233 = class142.field2062[var3];
                                    class175 var234 = class197.method1417(var233, arg2 - 16271);
                                    if (var234.field2528 == null) {
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class142.field2062[var3++] = var234.field2528.length;
                                    }
                                    continue;
                                }
                                if (var549 == 5052) {
                                    var3 -= 2;
                                    int var235 = class142.field2062[var3];
                                    int var236 = class142.field2062[var3 + 1];
                                    class175 var237 = class197.method1417(var235, -16267);
                                    int var238 = var237.field2528[var236];
                                    class142.field2062[var3++] = var238;
                                    continue;
                                }
                                if (var549 == 5053) {
                                    var3--;
                                    int var239 = class142.field2062[var3];
                                    class175 var240 = class197.method1417(var239, -16267);
                                    if (var240.field2525 == null) {
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class142.field2062[var3++] = var240.field2525.length;
                                    }
                                    continue;
                                }
                                if (var549 == 5054) {
                                    var3 -= 2;
                                    int var241 = class142.field2062[var3];
                                    int var242 = class142.field2062[var3 + 1];
                                    class142.field2062[var3++] = class197.method1417(var241, -16267).field2525[var242];
                                    continue;
                                }
                                if (var549 == 5055) {
                                    var3--;
                                    int var243 = class142.field2062[var3];
                                    class62.field909[var5++] = class192.method1385(85, var243).method2162((byte) 121);
                                    continue;
                                }
                                if (var549 == 5056) {
                                    var3--;
                                    int var244 = class142.field2062[var3];
                                    class308 var245 = class192.method1385(66, var244);
                                    if (var245.field4600 == null) {
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class142.field2062[var3++] = var245.field4600.length;
                                    }
                                    continue;
                                }
                                if (var549 == 5057) {
                                    var3 -= 2;
                                    int var246 = class142.field2062[var3];
                                    int var247 = class142.field2062[var3 + 1];
                                    class142.field2062[var3++] = class192.method1385(32, var246).field4600[var247];
                                    continue;
                                }
                                if (var549 == 5058) {
                                    class50.field751 = new class225();
                                    var3--;
                                    class50.field751.field3390 = class142.field2062[var3];
                                    class50.field751.field3394 = class192.method1385(45, class50.field751.field3390);
                                    class50.field751.field3388 = new int[class50.field751.field3394.method2165(arg2 ^ 0x6E)];
                                    continue;
                                }
                                if (var549 == 5059) {
                                    class194.field2817++;
                                    class107.field1533.method1915(true, 172);
                                    class107.field1533.method1355((byte) -127, 0);
                                    int var248 = class107.field1533.field2776;
                                    class107.field1533.method1355((byte) -123, 0);
                                    class107.field1533.method1361(class50.field751.field3390, (byte) 125);
                                    class50.field751.field3394.method2169(class50.field751.field3388, class107.field1533, true);
                                    class107.field1533.method1374(23107, class107.field1533.field2776 - var248);
                                    continue;
                                }
                                if (var549 == 5060) {
                                    var5--;
                                    String var249 = class62.field909[var5];
                                    class314.field4674++;
                                    class107.field1533.method1915(true, 106);
                                    class107.field1533.method1355((byte) -119, 0);
                                    int var250 = class107.field1533.field2776;
                                    class107.field1533.method1343(var249, 0);
                                    class107.field1533.method1361(class50.field751.field3390, (byte) 123);
                                    class50.field751.field3394.method2169(class50.field751.field3388, class107.field1533, true);
                                    class107.field1533.method1374(23107, class107.field1533.field2776 - var250);
                                    continue;
                                }
                                if (var549 == 5061) {
                                    class194.field2817++;
                                    class107.field1533.method1915(true, 172);
                                    class107.field1533.method1355((byte) -123, 0);
                                    int var251 = class107.field1533.field2776;
                                    class107.field1533.method1355((byte) -110, 1);
                                    class107.field1533.method1361(class50.field751.field3390, (byte) 123);
                                    class50.field751.field3394.method2169(class50.field751.field3388, class107.field1533, true);
                                    class107.field1533.method1374(23107, class107.field1533.field2776 - var251);
                                    continue;
                                }
                                if (var549 == 5062) {
                                    var3 -= 2;
                                    int var252 = class142.field2062[var3 + 1];
                                    int var253 = class142.field2062[var3];
                                    class142.field2062[var3++] = class197.method1417(var253, -16267).field2522[var252];
                                    continue;
                                }
                                if (var549 == 5063) {
                                    var3 -= 2;
                                    int var254 = class142.field2062[var3 + 1];
                                    int var255 = class142.field2062[var3];
                                    class142.field2062[var3++] = class197.method1417(var255, -16267).field2526[var254];
                                    continue;
                                }
                                if (var549 == 5064) {
                                    var3 -= 2;
                                    int var256 = class142.field2062[var3];
                                    int var257 = class142.field2062[var3 + 1];
                                    if (var257 == -1) {
                                        class142.field2062[var3++] = -1;
                                    } else {
                                        class142.field2062[var3++] = class197.method1417(var256, -16267).method1230((char) var257, 8);
                                    }
                                    continue;
                                }
                                if (var549 == 5065) {
                                    var3 -= 2;
                                    int var258 = class142.field2062[var3];
                                    int var259 = class142.field2062[var3 + 1];
                                    if (var259 == -1) {
                                        class142.field2062[var3++] = -1;
                                    } else {
                                        class142.field2062[var3++] = class197.method1417(var258, -16267).method1231((char) var259, -1);
                                    }
                                    continue;
                                }
                                if (var549 == 5066) {
                                    var3--;
                                    int var260 = class142.field2062[var3];
                                    class142.field2062[var3++] = class192.method1385(28, var260).method2165(69);
                                    continue;
                                }
                                if (var549 == 5067) {
                                    var3 -= 2;
                                    int var261 = class142.field2062[var3];
                                    int var262 = class142.field2062[var3 + 1];
                                    int var263 = class192.method1385(arg2 + 12, var261).method2161(var262, (byte) -19);
                                    class142.field2062[var3++] = var263;
                                    continue;
                                }
                                if (var549 == 5068) {
                                    var3 -= 2;
                                    int var264 = class142.field2062[var3];
                                    int var265 = class142.field2062[var3 + 1];
                                    class50.field751.field3388[var264] = var265;
                                    continue;
                                }
                                if (var549 == 5069) {
                                    var3 -= 2;
                                    int var266 = class142.field2062[var3 + 1];
                                    int var267 = class142.field2062[var3];
                                    class50.field751.field3388[var267] = var266;
                                    continue;
                                }
                                if (var549 == 5070) {
                                    var3 -= 3;
                                    int var268 = class142.field2062[var3];
                                    int var269 = class142.field2062[var3 + 1];
                                    int var270 = class142.field2062[var3 + 2];
                                    class308 var271 = class192.method1385(49, var268);
                                    if (var271.method2161(var269, (byte) -19) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class142.field2062[var3++] = var271.method2163(var270, var269, true);
                                    continue;
                                }
                                if (var549 == 5071) {
                                    var5--;
                                    String var272 = class62.field909[var5];
                                    var3--;
                                    boolean var273 = class142.field2062[var3] == 1;
                                    class299.method2123(var273, (byte) 61, var272);
                                    class142.field2062[var3++] = class334.field5205;
                                    continue;
                                }
                                if (var549 == 5072) {
                                    if (class262.field3981 != null && class130.field1882 < class334.field5205) {
                                        class142.field2062[var3++] = class287.method2076(class262.field3981[class130.field1882++], 65535);
                                        continue;
                                    }
                                    class142.field2062[var3++] = -1;
                                    continue;
                                }
                                if (var549 == 5073) {
                                    class130.field1882 = 0;
                                    continue;
                                }
                            } else if (var549 < 5200) {
                                if (var549 == 5100) {
                                    if (class236.field3549[86]) {
                                        class142.field2062[var3++] = 1;
                                    } else {
                                        class142.field2062[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 5101) {
                                    if (class236.field3549[82]) {
                                        class142.field2062[var3++] = 1;
                                    } else {
                                        class142.field2062[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 5102) {
                                    if (class236.field3549[81]) {
                                        class142.field2062[var3++] = 1;
                                    } else {
                                        class142.field2062[var3++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var549 < 5300) {
                                if (var549 == 5200) {
                                    var3--;
                                    class236.method1757(100, class142.field2062[var3]);
                                    continue;
                                }
                                if (var549 == 5201) {
                                    class142.field2062[var3++] = class60.method475(-80);
                                    continue;
                                }
                                if (var549 == 5205) {
                                    var3--;
                                    class186.method1290(-1, -1, false, (byte) 106, class142.field2062[var3]);
                                    continue;
                                }
                                if (var549 == 5206) {
                                    var3--;
                                    int var274 = class142.field2062[var3];
                                    class281 var275 = class105.method805((var274 & 0xFFFC3A9) >> 14, var274 & 0x3FFF);
                                    if (var275 == null) {
                                        class142.field2062[var3++] = -1;
                                    } else {
                                        class142.field2062[var3++] = var275.field4276;
                                    }
                                    continue;
                                }
                                if (var549 == 5207) {
                                    var3--;
                                    class281 var276 = class105.method812(class142.field2062[var3]);
                                    if (var276 != null && var276.field4259 != null) {
                                        class62.field909[var5++] = var276.field4259;
                                        continue;
                                    }
                                    class62.field909[var5++] = "";
                                    continue;
                                }
                                if (var549 == 5208) {
                                    class142.field2062[var3++] = class306.field4586;
                                    class142.field2062[var3++] = class133.field1943;
                                    continue;
                                }
                                if (var549 == 5209) {
                                    class142.field2062[var3++] = class147.field2114 + class105.field1498;
                                    class142.field2062[var3++] = class105.field1503 + class105.field1497 - (1 - -class124.field1810);
                                    continue;
                                }
                                if (var549 == 5210) {
                                    var3--;
                                    int var277 = class142.field2062[var3];
                                    class281 var278 = class105.method812(var277);
                                    if (var278 == null) {
                                        class142.field2062[var3++] = 0;
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class142.field2062[var3++] = class287.method2076(var278.field4255 >> 14, 16383);
                                        class142.field2062[var3++] = class287.method2076(16383, var278.field4255);
                                    }
                                    continue;
                                }
                                if (var549 == 5211) {
                                    var3--;
                                    int var279 = class142.field2062[var3];
                                    class281 var280 = class105.method812(var279);
                                    if (var280 == null) {
                                        class142.field2062[var3++] = 0;
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class142.field2062[var3++] = var280.field4256 - var280.field4269;
                                        class142.field2062[var3++] = var280.field4277 - var280.field4264;
                                    }
                                    continue;
                                }
                                if (var549 == 5212) {
                                    class287 var281 = class51.method427(50);
                                    if (var281 == null) {
                                        class142.field2062[var3++] = -1;
                                        class142.field2062[var3++] = -1;
                                    } else {
                                        class142.field2062[var3++] = var281.field4350;
                                        int var282 = var281.field4344 << 28 | class105.field1498 + var281.field4342 << 14 | class105.field1503 + class105.field1497 - var281.field4338 - 1;
                                        class142.field2062[var3++] = var282;
                                    }
                                    continue;
                                }
                                if (var549 == 5213) {
                                    class287 var283 = class236.method1762(-10201);
                                    if (var283 == null) {
                                        class142.field2062[var3++] = -1;
                                        class142.field2062[var3++] = -1;
                                    } else {
                                        class142.field2062[var3++] = var283.field4350;
                                        int var284 = class105.field1503 + class105.field1497 - var283.field4338 - 1 | class105.field1498 + var283.field4342 << 14 | var283.field4344 << 28;
                                        class142.field2062[var3++] = var284;
                                    }
                                    continue;
                                }
                                if (var549 == 5214) {
                                    var3--;
                                    int var285 = class142.field2062[var3];
                                    class281 var286 = class18.method113(-100);
                                    if (var286 != null) {
                                        boolean var287 = var286.method2051(-126, (var285 & 0xFFFEEAE) >> 14, class239.field3559, var285 & 0x3FFF, var285 >> 28 & 0x3);
                                        if (var287) {
                                            class344.method2411(false, class239.field3559[2], class239.field3559[1]);
                                        }
                                    }
                                    continue;
                                }
                                if (var549 == 5215) {
                                    var3 -= 2;
                                    int var288 = class142.field2062[var3 + 1];
                                    int var289 = class142.field2062[var3];
                                    class342 var290 = class105.method807(var289 >> 14 & 0x3FFF, var289 & 0x3FFF);
                                    boolean var291 = false;
                                    for (class281 var292 = (class281) var290.method2386((byte) -88); var292 != null; var292 = (class281) var290.method2388((byte) -92)) {
                                        if (var292.field4276 == var288) {
                                            var291 = true;
                                            break;
                                        }
                                    }
                                    if (var291) {
                                        class142.field2062[var3++] = 1;
                                    } else {
                                        class142.field2062[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 5218) {
                                    var3--;
                                    int var293 = class142.field2062[var3];
                                    class281 var294 = class105.method812(var293);
                                    if (var294 == null) {
                                        class142.field2062[var3++] = -1;
                                    } else {
                                        class142.field2062[var3++] = var294.field4275;
                                    }
                                    continue;
                                }
                                if (var549 == 5220) {
                                    class142.field2062[var3++] = class96.field1364 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 5221) {
                                    var3--;
                                    int var295 = class142.field2062[var3];
                                    class344.method2411(false, var295 & 0x3FFF, var295 >> 14 & 0x3FFF);
                                    continue;
                                }
                                if (var549 == 5222) {
                                    class281 var296 = class18.method113(arg2 - 74);
                                    if (var296 == null) {
                                        class142.field2062[var3++] = -1;
                                        class142.field2062[var3++] = -1;
                                    } else {
                                        boolean var297 = var296.method2055(class147.field2114 + class105.field1498, 24558, class239.field3559, class105.field1503 - (class124.field1810 + 1 - class105.field1497));
                                        if (var297) {
                                            class142.field2062[var3++] = class239.field3559[1];
                                            class142.field2062[var3++] = class239.field3559[2];
                                        } else {
                                            class142.field2062[var3++] = -1;
                                            class142.field2062[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var549 == 5223) {
                                    var3 -= 2;
                                    int var298 = class142.field2062[var3];
                                    int var299 = class142.field2062[var3 + 1];
                                    class186.method1290(var299 & 0x3FFF, var299 >> 14 & 0x3FFF, false, (byte) -26, var298);
                                    continue;
                                }
                                if (var549 == 5224) {
                                    var3--;
                                    int var300 = class142.field2062[var3];
                                    class281 var301 = class18.method113(-94);
                                    if (var301 == null) {
                                        class142.field2062[var3++] = -1;
                                        class142.field2062[var3++] = -1;
                                    } else {
                                        boolean var302 = var301.method2051(-125, (var300 & 0xFFFDAC1) >> 14, class239.field3559, var300 & 0x3FFF, var300 >> 28 & 0x3);
                                        if (var302) {
                                            class142.field2062[var3++] = class239.field3559[1];
                                            class142.field2062[var3++] = class239.field3559[2];
                                        } else {
                                            class142.field2062[var3++] = -1;
                                            class142.field2062[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var549 == 5225) {
                                    var3--;
                                    int var303 = class142.field2062[var3];
                                    class281 var304 = class18.method113(arg2 - 106);
                                    if (var304 == null) {
                                        class142.field2062[var3++] = -1;
                                        class142.field2062[var3++] = -1;
                                    } else {
                                        boolean var305 = var304.method2055(var303 >> 14 & 0x3FFF, 24558, class239.field3559, var303 & 0x3FFF);
                                        if (var305) {
                                            class142.field2062[var3++] = class239.field3559[1];
                                            class142.field2062[var3++] = class239.field3559[2];
                                        } else {
                                            class142.field2062[var3++] = -1;
                                            class142.field2062[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var549 == 5226) {
                                    var3--;
                                    class158.method1142(class142.field2062[var3], (byte) 119);
                                    continue;
                                }
                                if (var549 == 5227) {
                                    var3 -= 2;
                                    int var306 = class142.field2062[var3];
                                    int var307 = class142.field2062[var3 + 1];
                                    class186.method1290(var307 & 0x3FFF, var307 >> 14 & 0x3FFF, true, (byte) 105, var306);
                                    continue;
                                }
                                if (var549 == 5228) {
                                    var3--;
                                    class265.field4054 = class142.field2062[var3] == 1;
                                    continue;
                                }
                                if (var549 == 5229) {
                                    class142.field2062[var3++] = class265.field4054 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 5230) {
                                    var3--;
                                    int var308 = class142.field2062[var3];
                                    class16.method103(var308, 1);
                                    continue;
                                }
                                if (var549 == 5231) {
                                    var3 -= 2;
                                    int var309 = class142.field2062[var3];
                                    boolean var310 = class142.field2062[var3 + 1] == 1;
                                    if (class278.field4227 == null) {
                                        continue;
                                    }
                                    class117 var311 = class278.field4227.method1405((long) var309, false);
                                    if (var311 != null && !var310) {
                                        var311.method876(arg2 ^ 0xC);
                                        continue;
                                    }
                                    if (var311 == null && var310) {
                                        class117 var312 = new class117();
                                        class278.field4227.method1400((long) var309, 118, var312);
                                    }
                                    continue;
                                }
                                if (var549 == 5232) {
                                    var3--;
                                    int var313 = class142.field2062[var3];
                                    if (class278.field4227 == null) {
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class117 var314 = class278.field4227.method1405((long) var313, false);
                                        class142.field2062[var3++] = var314 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var549 == 5233) {
                                    var3 -= 2;
                                    int var315 = class142.field2062[var3];
                                    boolean var316 = class142.field2062[var3 + 1] == 1;
                                    if (class33.field477 == null) {
                                        continue;
                                    }
                                    class117 var317 = class33.field477.method1405((long) var315, false);
                                    if (var317 != null && !var316) {
                                        var317.method876(arg2 ^ 0xC);
                                        continue;
                                    }
                                    if (var317 == null && var316) {
                                        class117 var318 = new class117();
                                        class33.field477.method1400((long) var315, 107, var318);
                                    }
                                    continue;
                                }
                                if (var549 == 5234) {
                                    var3--;
                                    int var319 = class142.field2062[var3];
                                    if (class33.field477 == null) {
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class117 var320 = class33.field477.method1405((long) var319, false);
                                        class142.field2062[var3++] = var320 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var549 == 5235) {
                                    class142.field2062[var3++] = class105.field1500 == null ? -1 : class105.field1500.field4276;
                                    continue;
                                }
                            } else if (var549 < 5400) {
                                if (var549 == 5300) {
                                    var3 -= 2;
                                    int var399 = class142.field2062[var3];
                                    int var400 = class142.field2062[var3 + 1];
                                    class348.method2443(var400, false, (byte) -128, var399, 3);
                                    class142.field2062[var3++] = class124.field1809 == null ? 0 : 1;
                                    continue;
                                }
                                if (var549 == 5301) {
                                    if (class124.field1809 != null) {
                                        class348.method2443(-1, false, (byte) -122, -1, class135.field1971);
                                    }
                                    continue;
                                }
                                if (var549 == 5302) {
                                    class267[] var401 = class352.method2457((byte) -117);
                                    class142.field2062[var3++] = var401.length;
                                    continue;
                                }
                                if (var549 == 5303) {
                                    var3--;
                                    int var402 = class142.field2062[var3];
                                    class267[] var403 = class352.method2457((byte) -97);
                                    class142.field2062[var3++] = var403[var402].field4075;
                                    class142.field2062[var3++] = var403[var402].field4073;
                                    continue;
                                }
                                if (var549 == 5305) {
                                    int var404 = class96.field1365;
                                    int var405 = -1;
                                    int var406 = class285.field4298;
                                    class267[] var407 = class352.method2457((byte) -108);
                                    for (int var408 = 0; var408 < var407.length; var408++) {
                                        class267 var409 = var407[var408];
                                        if (var409.field4075 == var404 && var409.field4073 == var406) {
                                            var405 = var408;
                                            break;
                                        }
                                    }
                                    class142.field2062[var3++] = var405;
                                    continue;
                                }
                                if (var549 == 5306) {
                                    class142.field2062[var3++] = class89.method706(class228.method1706(arg2, -12307));
                                    continue;
                                }
                                if (var549 == 5307) {
                                    var3--;
                                    int var410 = class142.field2062[var3];
                                    if (var410 < 0 || var410 > 2) {
                                        var410 = 0;
                                    }
                                    class348.method2443(-1, false, (byte) -117, -1, var410);
                                    continue;
                                }
                                if (var549 == 5308) {
                                    class142.field2062[var3++] = class135.field1971;
                                    continue;
                                }
                                if (var549 == 5309) {
                                    var3--;
                                    int var411 = class142.field2062[var3];
                                    if (var411 < 0 || var411 > 2) {
                                        var411 = 0;
                                    }
                                    class135.field1971 = var411;
                                    class309.method2176(class54.field787, false);
                                    continue;
                                }
                            } else if (var549 < 5500) {
                                if (var549 == 5400) {
                                    var5 -= 2;
                                    String var321 = class62.field909[var5 + 1];
                                    var3--;
                                    int var322 = class142.field2062[var3];
                                    String var323 = class62.field909[var5];
                                    class349.field5385++;
                                    class107.field1533.method1915(true, 201);
                                    class107.field1533.method1355((byte) -127, class225.method1646(-43, var323) + (class225.method1646(arg2 - 27, var321) + 1));
                                    class107.field1533.method1343(var323, 0);
                                    class107.field1533.method1343(var321, arg2 ^ 0x4);
                                    class107.field1533.method1355((byte) -119, var322);
                                    continue;
                                }
                                if (var549 == 5401) {
                                    var3 -= 2;
                                    class122.field1722[class142.field2062[var3]] = (short) class361.method2524(7100, class142.field2062[var3 + 1]);
                                    client.method354((byte) 97);
                                    class121.method904(-3);
                                    class335.method2368((byte) 117);
                                    class89.method708(0);
                                    class244.method1790((byte) 68);
                                    continue;
                                }
                                if (var549 == 5405) {
                                    var3 -= 2;
                                    int var324 = class142.field2062[var3];
                                    int var325 = class142.field2062[var3 + 1];
                                    if (var324 >= 0 && var324 < 2) {
                                        class213.field3076[var324] = new int[var325 << 1][4];
                                    }
                                    continue;
                                }
                                if (var549 == 5406) {
                                    var3 -= 7;
                                    int var326 = class142.field2062[var3 + 1] << 1;
                                    int var327 = class142.field2062[var3 + 2];
                                    int var328 = class142.field2062[var3];
                                    int var329 = class142.field2062[var3 + 3];
                                    int var330 = class142.field2062[var3 + 4];
                                    int var331 = class142.field2062[var3 + 6];
                                    int var332 = class142.field2062[var3 + 5];
                                    if (var328 >= 0 && var328 < 2 && class213.field3076[var328] != null && var326 >= 0 && var326 < class213.field3076[var328].length) {
                                        class213.field3076[var328][var326] = new int[] { (class287.method2076(268426171, var327) >> 14) * 128, var329, class287.method2076(16383, var327) * 128, var331 };
                                        class213.field3076[var328][var326 + 1] = new int[] { class287.method2076(var330 >> 14, 16383) * 128, var332, class287.method2076(var330, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var549 == 5407) {
                                    var3--;
                                    int var333 = class213.field3076[class142.field2062[var3]].length >> 1;
                                    class142.field2062[var3++] = var333;
                                    continue;
                                }
                                if (var549 == 5411) {
                                    if (class124.field1809 != null) {
                                        class348.method2443(-1, false, (byte) -49, -1, class135.field1971);
                                    }
                                    if (class131.field1905 == null) {
                                        class256.method1883(arg2 + 116, class136.method969(242093644), false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var549 == 5419) {
                                    String var334 = "";
                                    if (class255.field3806 != null) {
                                        if (class255.field3806.field3058 == null) {
                                            var334 = class332.method2339(false, class255.field3806.field3057);
                                        } else {
                                            var334 = (String) class255.field3806.field3058;
                                        }
                                    }
                                    class62.field909[var5++] = var334;
                                    continue;
                                }
                                if (var549 == 5420) {
                                    class142.field2062[var3++] = class61.field890 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 5421) {
                                    if (class124.field1809 != null) {
                                        class348.method2443(-1, false, (byte) -107, -1, class135.field1971);
                                    }
                                    var5--;
                                    String var335 = class62.field909[var5];
                                    var3--;
                                    boolean var336 = class142.field2062[var3] == 1;
                                    String var337 = class136.method969(242093644) + var335;
                                    if (class131.field1905 != null || var336 && class61.field890 != 3 && class61.field887.startsWith("win") && !class299.field4468) {
                                        class2.field83 = var336;
                                        class252.field3765 = var337;
                                        class154.field2202 = class54.field787.method480(116, var337);
                                        continue;
                                    }
                                    class256.method1883(40, var337, var336);
                                    continue;
                                }
                                if (var549 == 5422) {
                                    var5 -= 2;
                                    String var338 = class62.field909[var5];
                                    String var339 = class62.field909[var5 + 1];
                                    var3--;
                                    int var340 = class142.field2062[var3];
                                    if (var338.length() > 0) {
                                        if (class236.field3548 == null) {
                                            class236.field3548 = new String[class124.field1806[class164.field2335]];
                                        }
                                        class236.field3548[var340] = var338;
                                    }
                                    if (var339.length() > 0) {
                                        if (class347.field5365 == null) {
                                            class347.field5365 = new String[class124.field1806[class164.field2335]];
                                        }
                                        class347.field5365[var340] = var339;
                                    }
                                    continue;
                                }
                                if (var549 == 5423) {
                                    var5--;
                                    System.out.println(class62.field909[var5]);
                                    continue;
                                }
                                if (var549 == 5424) {
                                    var3 -= 11;
                                    class120.field1689 = class142.field2062[var3];
                                    class227.field3420 = class142.field2062[var3 + 1];
                                    class230.field3475 = class142.field2062[var3 + 2];
                                    class263.field4032 = class142.field2062[var3 + 3];
                                    class139.field2002 = class142.field2062[var3 + 4];
                                    class302.field4520 = class142.field2062[var3 + 5];
                                    class199.field2900 = class142.field2062[var3 + 6];
                                    class353.field5430 = class142.field2062[var3 + 7];
                                    class116.field1652 = class142.field2062[var3 + 8];
                                    class160.field2315 = class142.field2062[var3 + 9];
                                    class292.field4419 = class142.field2062[var3 + 10];
                                    class216.field3184.method2514((byte) 48, class139.field2002);
                                    class216.field3184.method2514((byte) 111, class302.field4520);
                                    class216.field3184.method2514((byte) 125, class199.field2900);
                                    class216.field3184.method2514((byte) 107, class353.field5430);
                                    class216.field3184.method2514((byte) 18, class116.field1652);
                                    class304.field4564 = true;
                                    continue;
                                }
                                if (var549 == 5425) {
                                    class281.method2052(arg2 ^ 0x3661);
                                    class304.field4564 = false;
                                    continue;
                                }
                                if (var549 == 5426) {
                                    var3--;
                                    class110.field1613 = class142.field2062[var3];
                                    continue;
                                }
                                if (var549 == 5427) {
                                    var3 -= 2;
                                    class15.field231 = class142.field2062[var3];
                                    class137.field1986 = class142.field2062[var3 + 1];
                                    continue;
                                }
                                if (var549 == 5428) {
                                    var3 -= 2;
                                    int var341 = class142.field2062[var3 + 1];
                                    int var342 = class142.field2062[var3];
                                    class142.field2062[var3++] = class110.method841(var342, (byte) 103, var341) ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 5600) {
                                if (var549 == 5500) {
                                    var3 -= 4;
                                    int var382 = class142.field2062[var3];
                                    int var383 = class142.field2062[var3 + 1];
                                    int var384 = class142.field2062[var3 + 2];
                                    int var385 = class142.field2062[var3 + 3];
                                    class62.method505((var382 & 0x3FFF) - class202.field2968, -26453, var385, var383, false, var384, (var382 >> 14 & 0x3FFF) - class272.field4123);
                                    continue;
                                }
                                if (var549 == 5501) {
                                    var3 -= 4;
                                    int var386 = class142.field2062[var3];
                                    int var387 = class142.field2062[var3 + 1];
                                    int var388 = class142.field2062[var3 + 2];
                                    int var389 = class142.field2062[var3 + 3];
                                    class112.method849(var388, (byte) 109, var387, var389, (var386 >> 14 & 0x3FFF) - class272.field4123, (var386 & 0x3FFF) + -class202.field2968);
                                    continue;
                                }
                                if (var549 == 5502) {
                                    var3 -= 6;
                                    int var390 = class142.field2062[var3];
                                    if (var390 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class261.field3949 = var390;
                                    int var391 = class142.field2062[var3 + 1];
                                    if (var391 + 1 >= class213.field3076[class261.field3949].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class75.field1099 = var391;
                                    class296.field4449 = 0;
                                    class160.field2311 = class142.field2062[var3 + 2];
                                    class177.field2535 = class142.field2062[var3 + 3];
                                    int var392 = class142.field2062[var3 + 4];
                                    if (var392 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class174.field2507 = var392;
                                    int var393 = class142.field2062[var3 + 5];
                                    if ((class213.field3076[class174.field2507].length >> 1) <= (var393 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class86.field1208 = 3;
                                    class332.field5083 = var393;
                                    continue;
                                }
                                if (var549 == 5503) {
                                    class177.method1237(true);
                                    continue;
                                }
                                if (var549 == 5504) {
                                    var3 -= 2;
                                    class307.method2159(class142.field2062[var3], false, class142.field2062[var3 + 1]);
                                    continue;
                                }
                                if (var549 == 5505) {
                                    class142.field2062[var3++] = (int) class103.field1476;
                                    continue;
                                }
                                if (var549 == 5506) {
                                    class142.field2062[var3++] = (int) class36.field535;
                                    continue;
                                }
                                if (var549 == 5507) {
                                    class99.method784(58);
                                    continue;
                                }
                                if (var549 == 5508) {
                                    class30.method210((byte) 40);
                                    continue;
                                }
                                if (var549 == 5509) {
                                    class154.method1106(159);
                                    continue;
                                }
                                if (var549 == 5510) {
                                    class93.method728(57);
                                    continue;
                                }
                                if (var549 == 5511) {
                                    var3--;
                                    int var394 = class142.field2062[var3];
                                    int var395 = (var394 & 0xFFFCA92) >> 14;
                                    int var396 = var394 & 0x3FFF;
                                    int var397 = var395 - class272.field4123;
                                    class86.field1208 = 4;
                                    int var398 = var396 - class202.field2968;
                                    if (var398 < 0) {
                                        var398 = 0;
                                    } else if (var398 >= 104) {
                                        var398 = 104;
                                    }
                                    if (var397 < 0) {
                                        var397 = 0;
                                    } else if (var397 >= 104) {
                                        var397 = 104;
                                    }
                                    class194.field2823 = var398 * 128 + 64;
                                    class259.field3864 = var397 * 128 + 64;
                                    continue;
                                }
                                if (var549 == 5512) {
                                    class178.method1241(-88);
                                    continue;
                                }
                            } else if (var549 < 5700) {
                                if (var549 == 5600) {
                                    var5 -= 2;
                                    String var378 = class62.field909[var5];
                                    String var379 = class62.field909[var5 + 1];
                                    var3--;
                                    int var380 = class142.field2062[var3];
                                    if (class194.field2819 == 10 && class56.field819 == 0 && class289.field4378 == 0 && class9.field156 == 0 && class315.field4682 == 0) {
                                        class62.method507(10866, var379, var378, var380);
                                    }
                                    continue;
                                }
                                if (var549 == 5601) {
                                    class248.method1821(6);
                                    continue;
                                }
                                if (var549 == 5602) {
                                    if (class289.field4378 == 0) {
                                        class158.field2278 = -2;
                                    }
                                    continue;
                                }
                                if (var549 == 5603) {
                                    var3 -= 4;
                                    if (class194.field2819 == 10 && class56.field819 == 0 && class289.field4378 == 0 && class9.field156 == 0 && class315.field4682 == 0) {
                                        class112.method852(class142.field2062[var3], class142.field2062[var3 + 1], class142.field2062[var3 + 3], true, class142.field2062[var3 + 2]);
                                    }
                                    continue;
                                }
                                if (var549 == 5604) {
                                    var5--;
                                    if (class194.field2819 == 10 && class56.field819 == 0 && class289.field4378 == 0 && class9.field156 == 0 && class315.field4682 == 0) {
                                        class54.method445((byte) -74, class248.method1827(false, class62.field909[var5]));
                                    }
                                    continue;
                                }
                                if (var549 == 5605) {
                                    var3 -= 7;
                                    var5 -= 3;
                                    if (class194.field2819 == 10 && class56.field819 == 0 && class289.field4378 == 0 && class9.field156 == 0 && class315.field4682 == 0) {
                                        class179.method1244(class142.field2062[var3], 115, class142.field2062[var3 + 5] == 1, class142.field2062[var3 + 4] == 1, class62.field909[var5 + 1], class142.field2062[var3 + 1], class142.field2062[var3 + 2], class142.field2062[var3 + 3], class62.field909[var5 + 2], class248.method1827(false, class62.field909[var5]), class142.field2062[var3 + 6] == 1);
                                    }
                                    continue;
                                }
                                if (var549 == 5606) {
                                    if (class9.field156 == 0) {
                                        class121.field1710 = -2;
                                    }
                                    continue;
                                }
                                if (var549 == 5607) {
                                    class142.field2062[var3++] = class158.field2278;
                                    continue;
                                }
                                if (var549 == 5608) {
                                    class142.field2062[var3++] = class272.field4126;
                                    continue;
                                }
                                if (var549 == 5609) {
                                    class142.field2062[var3++] = class121.field1710;
                                    continue;
                                }
                                if (var549 == 5610) {
                                    for (int var381 = 0; var381 < 5; var381++) {
                                        class62.field909[var5++] = class62.field907.length <= var381 ? "" : class239.method1765(class62.field907[var381], true);
                                    }
                                    class62.field907 = null;
                                    continue;
                                }
                                if (var549 == 5611) {
                                    class142.field2062[var3++] = class279.field4243;
                                    continue;
                                }
                            } else if (var549 < 6100) {
                                if (var549 == 6001) {
                                    var3--;
                                    int var368 = class142.field2062[var3];
                                    if (var368 < 1) {
                                        var368 = 1;
                                    }
                                    if (var368 > 4) {
                                        var368 = 4;
                                    }
                                    field3849 = var368;
                                    if (!class141.field2031 || !class98.field1379) {
                                        if (field3849 == 1) {
                                            class345.method2430(0.9F);
                                        }
                                        if (field3849 == 2) {
                                            class345.method2430(0.8F);
                                        }
                                        if (field3849 == 3) {
                                            class345.method2430(0.7F);
                                        }
                                        if (field3849 == 4) {
                                            class345.method2430(0.6F);
                                        }
                                    }
                                    if (class141.field2031) {
                                        class110.method844(6242);
                                        if (!class98.field1379) {
                                            class58.method467(-16385);
                                        }
                                    }
                                    class121.method904(-3);
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6002) {
                                    var3--;
                                    class331.method2325(false, class142.field2062[var3] == 1);
                                    class172.method1210(arg2 + 75);
                                    class58.method467(arg2 ^ 0xFFFFBFFB);
                                    class292.method2101((byte) 34);
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6003) {
                                    var3--;
                                    class197.field2863 = class142.field2062[var3] == 1;
                                    class292.method2101((byte) 34);
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6005) {
                                    var3--;
                                    class229.field3472 = class142.field2062[var3] == 1;
                                    class58.method467(-16385);
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6006) {
                                    var3--;
                                    class299.field4475 = class142.field2062[var3] == 1;
                                    ((class71) class345.field5336).method589(!class299.field4475, 70);
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6007) {
                                    var3--;
                                    class86.field1219 = class142.field2062[var3] == 1;
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6008) {
                                    var3--;
                                    class324.field4888 = class142.field2062[var3] == 1;
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6009) {
                                    var3--;
                                    class291.field4410 = class142.field2062[var3] == 1;
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6010) {
                                    var3--;
                                    class221.field3304 = class142.field2062[var3] == 1;
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6011) {
                                    var3--;
                                    int var369 = class142.field2062[var3];
                                    if (var369 < 0 || var369 > 2) {
                                        var369 = 0;
                                    }
                                    class173.field2497 = var369;
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6012) {
                                    if (class141.field2031) {
                                        class2.method9(0, 10691, 0);
                                    }
                                    var3--;
                                    class98.field1379 = class142.field2062[var3] == 1;
                                    if (class141.field2031 && class98.field1379) {
                                        class345.method2430(0.7F);
                                    } else {
                                        if (field3849 == 1) {
                                            class345.method2430(0.9F);
                                        }
                                        if (field3849 == 2) {
                                            class345.method2430(0.8F);
                                        }
                                        if (field3849 == 3) {
                                            class345.method2430(0.7F);
                                        }
                                        if (field3849 == 4) {
                                            class345.method2430(0.6F);
                                        }
                                    }
                                    class58.method467(-16385);
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6014) {
                                    var3--;
                                    class267.field4078 = class142.field2062[var3] == 1;
                                    if (class141.field2031) {
                                        class58.method467(-16385);
                                    }
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6015) {
                                    var3--;
                                    class128.field1862 = class142.field2062[var3] == 1;
                                    if (class141.field2031) {
                                        class110.method844(arg2 ^ 0x1866);
                                    }
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6016) {
                                    var3--;
                                    int var370 = class142.field2062[var3];
                                    if (var370 < 0 || var370 > 2) {
                                        var370 = 0;
                                    }
                                    if (class141.field2031) {
                                        class11.field178 = true;
                                    }
                                    class304.field4559 = var370;
                                    continue;
                                }
                                if (var549 == 6017) {
                                    var3--;
                                    class177.field2547 = class142.field2062[var3] == 1;
                                    class250.method1835(48);
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6018) {
                                    var3--;
                                    int var371 = class142.field2062[var3];
                                    if (var371 < 0) {
                                        var371 = 0;
                                    }
                                    if (var371 > 127) {
                                        var371 = 127;
                                    }
                                    class38.field565 = var371;
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6019) {
                                    var3--;
                                    int var372 = class142.field2062[var3];
                                    if (var372 < 0) {
                                        var372 = 0;
                                    }
                                    if (var372 > 255) {
                                        var372 = 255;
                                    }
                                    if (class267.field4077 != var372) {
                                        if (class267.field4077 == 0 && class150.field2187 != -1) {
                                            class20.method124(class150.field2187, 0, false, var372, class332.field5085, -105);
                                            class65.field958 = false;
                                        } else if (var372 == 0) {
                                            class208.method1522((byte) -39);
                                            class65.field958 = false;
                                        } else {
                                            class7.method44(var372, 30654);
                                        }
                                        class267.field4077 = var372;
                                    }
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6020) {
                                    var3--;
                                    int var373 = class142.field2062[var3];
                                    if (var373 < 0) {
                                        var373 = 0;
                                    }
                                    if (var373 > 127) {
                                        var373 = 127;
                                    }
                                    class207.field3035 = var373;
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    continue;
                                }
                                if (var549 == 6021) {
                                    var3--;
                                    class240.field3566 = class142.field2062[var3] == 1;
                                    class292.method2101((byte) 34);
                                    continue;
                                }
                                if (var549 == 6023) {
                                    var3--;
                                    int var374 = class142.field2062[var3];
                                    if (var374 < 0) {
                                        var374 = 0;
                                    }
                                    if (var374 > 2) {
                                        var374 = 2;
                                    }
                                    boolean var375 = false;
                                    if (class243.field3620 < 96) {
                                        var375 = true;
                                        var374 = 0;
                                    }
                                    class155.method1120(var374);
                                    class309.method2176(class54.field787, false);
                                    class56.field821 = false;
                                    class142.field2062[var3++] = var375 ? 0 : 1;
                                    continue;
                                }
                                if (var549 == 6024) {
                                    var3--;
                                    int var376 = class142.field2062[var3];
                                    if (var376 < 0 || var376 > 2) {
                                        var376 = 0;
                                    }
                                    class149.field2173 = var376;
                                    class309.method2176(class54.field787, false);
                                    continue;
                                }
                                if (var549 == 6027) {
                                    var3--;
                                    int var377 = class142.field2062[var3];
                                    if (!class141.field2031) {
                                        continue;
                                    }
                                    if (var377 < 0 || var377 > 1) {
                                        var377 = 0;
                                    }
                                    class281.method2043((byte) 120, var377 == 1);
                                    continue;
                                }
                                if (var549 == 6028) {
                                    var3--;
                                    class123.field1795 = class142.field2062[var3] != 0;
                                    class309.method2176(class54.field787, false);
                                    continue;
                                }
                            } else if (var549 < 6200) {
                                if (var549 == 6101) {
                                    class142.field2062[var3++] = field3849;
                                    continue;
                                }
                                if (var549 == 6102) {
                                    class142.field2062[var3++] = class3.method15((byte) 93) ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6103) {
                                    class142.field2062[var3++] = class197.field2863 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6105) {
                                    class142.field2062[var3++] = class229.field3472 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6106) {
                                    class142.field2062[var3++] = class299.field4475 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6107) {
                                    class142.field2062[var3++] = class86.field1219 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6108) {
                                    class142.field2062[var3++] = class324.field4888 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6109) {
                                    class142.field2062[var3++] = class291.field4410 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6110) {
                                    class142.field2062[var3++] = class221.field3304 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6111) {
                                    class142.field2062[var3++] = class173.field2497;
                                    continue;
                                }
                                if (var549 == 6112) {
                                    class142.field2062[var3++] = class98.field1379 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6114) {
                                    class142.field2062[var3++] = class267.field4078 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6115) {
                                    class142.field2062[var3++] = class128.field1862 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6116) {
                                    class142.field2062[var3++] = class304.field4559;
                                    continue;
                                }
                                if (var549 == 6117) {
                                    class142.field2062[var3++] = class177.field2547 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6118) {
                                    class142.field2062[var3++] = class38.field565;
                                    continue;
                                }
                                if (var549 == 6119) {
                                    class142.field2062[var3++] = class267.field4077;
                                    continue;
                                }
                                if (var549 == 6120) {
                                    class142.field2062[var3++] = class207.field3035;
                                    continue;
                                }
                                if (var549 == 6121) {
                                    if (class141.field2031) {
                                        class142.field2062[var3++] = class141.field2047 ? 1 : 0;
                                    } else {
                                        class142.field2062[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 6123) {
                                    class142.field2062[var3++] = class155.method1114();
                                    continue;
                                }
                                if (var549 == 6124) {
                                    class142.field2062[var3++] = class149.field2173;
                                    continue;
                                }
                                if (var549 == 6126) {
                                    if (class141.field2031) {
                                        class142.field2062[var3++] = class233.method1725() ? 1 : 0;
                                    } else {
                                        class142.field2062[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 6127) {
                                    class142.field2062[var3++] = class133.field1948 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6128) {
                                    class142.field2062[var3++] = class123.field1795 ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 6300) {
                                if (var549 == 6200) {
                                    var3 -= 2;
                                    class265.field4055 = (short) class142.field2062[var3];
                                    if (class265.field4055 <= 0) {
                                        class265.field4055 = 256;
                                    }
                                    class54.field798 = (short) class142.field2062[var3 + 1];
                                    if (class54.field798 <= 0) {
                                        class54.field798 = 205;
                                    }
                                    continue;
                                }
                                if (var549 == 6201) {
                                    var3 -= 2;
                                    class136.field1977 = (short) class142.field2062[var3];
                                    if (class136.field1977 <= 0) {
                                        class136.field1977 = 256;
                                    }
                                    class89.field1254 = (short) class142.field2062[var3 + 1];
                                    if (class89.field1254 <= 0) {
                                        class89.field1254 = 320;
                                    }
                                    continue;
                                }
                                if (var549 == 6202) {
                                    var3 -= 4;
                                    class323.field4867 = (short) class142.field2062[var3];
                                    if (class323.field4867 <= 0) {
                                        class323.field4867 = 1;
                                    }
                                    class299.field4470 = (short) class142.field2062[var3 + 1];
                                    if (class299.field4470 <= 0) {
                                        class299.field4470 = 32767;
                                    } else if (class323.field4867 > class299.field4470) {
                                        class299.field4470 = class323.field4867;
                                    }
                                    class256.field3827 = (short) class142.field2062[var3 + 2];
                                    if (class256.field3827 <= 0) {
                                        class256.field3827 = 1;
                                    }
                                    class306.field4587 = (short) class142.field2062[var3 + 3];
                                    if (class306.field4587 <= 0) {
                                        class306.field4587 = 32767;
                                    } else if (class256.field3827 > class306.field4587) {
                                        class306.field4587 = class256.field3827;
                                    }
                                    continue;
                                }
                                if (var549 == 6203) {
                                    class286.method2069(0, class189.field2702.field5560, false, 64, 0, class189.field2702.field5506);
                                    class142.field2062[var3++] = class109.field1584;
                                    class142.field2062[var3++] = class40.field580;
                                    continue;
                                }
                                if (var549 == 6204) {
                                    class142.field2062[var3++] = class136.field1977;
                                    class142.field2062[var3++] = class89.field1254;
                                    continue;
                                }
                                if (var549 == 6205) {
                                    class142.field2062[var3++] = class265.field4055;
                                    class142.field2062[var3++] = class54.field798;
                                    continue;
                                }
                            } else if (var549 < 6400) {
                                if (var549 == 6300) {
                                    class142.field2062[var3++] = (int) (class176.method1234(arg2 + 5570) / 60000L);
                                    continue;
                                }
                                if (var549 == 6301) {
                                    class142.field2062[var3++] = (int) (class176.method1234(arg2 + 5570) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var549 == 6302) {
                                    var3 -= 3;
                                    int var363 = class142.field2062[var3];
                                    int var364 = class142.field2062[var3 + 1];
                                    int var365 = class142.field2062[var3 + 2];
                                    class200.field2943.clear();
                                    class200.field2943.set(11, 12);
                                    class200.field2943.set(var365, var364, var363);
                                    class142.field2062[var3++] = (int) (class200.field2943.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var549 == 6303) {
                                    class200.field2943.clear();
                                    class200.field2943.setTime(new Date(class176.method1234(5574)));
                                    class142.field2062[var3++] = class200.field2943.get(1);
                                    continue;
                                }
                                if (var549 == 6304) {
                                    boolean var366 = true;
                                    var3--;
                                    int var367 = class142.field2062[var3];
                                    if (var367 < 0) {
                                        var366 = (var367 + 1) % 4 == 0;
                                    } else if (var367 < 1582) {
                                        var366 = var367 % 4 == 0;
                                    } else if (var367 % 4 != 0) {
                                        var366 = false;
                                    } else if (var367 % 100 != 0) {
                                        var366 = true;
                                    } else if ((var367 % 400) != 0) {
                                        var366 = false;
                                    }
                                    class142.field2062[var3++] = var366 ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 6500) {
                                if (var549 == 6405) {
                                    class142.field2062[var3++] = class85.method694(class228.method1706(arg2, -19769)) ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6406) {
                                    class142.field2062[var3++] = class275.method2012((byte) 81) ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 6600) {
                                if (var549 == 6500) {
                                    if (class194.field2819 == 10 && class56.field819 == 0 && class289.field4378 == 0 && class9.field156 == 0) {
                                        class142.field2062[var3++] = class18.method112((byte) -96) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class142.field2062[var3++] = 1;
                                    continue;
                                }
                                if (var549 == 6501) {
                                    class316 var351 = class181.method1253((byte) -54);
                                    if (var351 == null) {
                                        class142.field2062[var3++] = -1;
                                        class142.field2062[var3++] = 0;
                                        class62.field909[var5++] = "";
                                        class142.field2062[var3++] = 0;
                                        class62.field909[var5++] = "";
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class142.field2062[var3++] = var351.field4686;
                                        class142.field2062[var3++] = var351.field4061;
                                        class62.field909[var5++] = var351.field4696;
                                        class324 var352 = var351.method2203(-1);
                                        class142.field2062[var3++] = var352.field4881;
                                        class62.field909[var5++] = var352.field4882;
                                        class142.field2062[var3++] = var351.field4059;
                                    }
                                    continue;
                                }
                                if (var549 == 6502) {
                                    class316 var353 = class108.method826(arg2 + 4092);
                                    if (var353 == null) {
                                        class142.field2062[var3++] = -1;
                                        class142.field2062[var3++] = 0;
                                        class62.field909[var5++] = "";
                                        class142.field2062[var3++] = 0;
                                        class62.field909[var5++] = "";
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class142.field2062[var3++] = var353.field4686;
                                        class142.field2062[var3++] = var353.field4061;
                                        class62.field909[var5++] = var353.field4696;
                                        class324 var354 = var353.method2203(-1);
                                        class142.field2062[var3++] = var354.field4881;
                                        class62.field909[var5++] = var354.field4882;
                                        class142.field2062[var3++] = var353.field4059;
                                    }
                                    continue;
                                }
                                if (var549 == 6503) {
                                    var3--;
                                    int var355 = class142.field2062[var3];
                                    if (class194.field2819 == 10 && class56.field819 == 0 && class289.field4378 == 0 && class9.field156 == 0) {
                                        class142.field2062[var3++] = class323.method2241(1, var355) ? 1 : 0;
                                        continue;
                                    }
                                    class142.field2062[var3++] = 0;
                                    continue;
                                }
                                if (var549 == 6504) {
                                    var3--;
                                    class249.field3703 = class142.field2062[var3];
                                    class309.method2176(class54.field787, false);
                                    continue;
                                }
                                if (var549 == 6505) {
                                    class142.field2062[var3++] = class249.field3703;
                                    continue;
                                }
                                if (var549 == 6506) {
                                    var3--;
                                    int var356 = class142.field2062[var3];
                                    class316 var357 = class206.method1506(var356, -69);
                                    if (var357 == null) {
                                        class142.field2062[var3++] = -1;
                                        class62.field909[var5++] = "";
                                        class142.field2062[var3++] = 0;
                                        class62.field909[var5++] = "";
                                        class142.field2062[var3++] = 0;
                                    } else {
                                        class142.field2062[var3++] = var357.field4061;
                                        class62.field909[var5++] = var357.field4696;
                                        class324 var358 = var357.method2203(-1);
                                        class142.field2062[var3++] = var358.field4881;
                                        class62.field909[var5++] = var358.field4882;
                                        class142.field2062[var3++] = var357.field4059;
                                    }
                                    continue;
                                }
                                if (var549 == 6507) {
                                    var3 -= 4;
                                    int var359 = class142.field2062[var3 + 2];
                                    int var360 = class142.field2062[var3];
                                    boolean var361 = class142.field2062[var3 + 1] == 1;
                                    boolean var362 = class142.field2062[var3 + 3] == 1;
                                    class152.method1100((byte) -48, var361, var359, var362, var360);
                                    continue;
                                }
                            } else if (var549 < 6700) {
                                if (var549 == 6600) {
                                    var3--;
                                    class274.field4156 = class142.field2062[var3] == 1;
                                    class309.method2176(class54.field787, false);
                                    continue;
                                }
                                if (var549 == 6601) {
                                    class142.field2062[var3++] = class274.field4156 ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 6900) {
                                if (var549 == 6800) {
                                    var3--;
                                    int var343 = class142.field2062[var3];
                                    class200 var344 = class349.method2447(var343, (byte) -9);
                                    if (var344.field2920 == null) {
                                        class62.field909[var5++] = "";
                                    } else {
                                        class62.field909[var5++] = var344.field2920;
                                    }
                                    continue;
                                }
                                if (var549 == 6801) {
                                    var3--;
                                    int var345 = class142.field2062[var3];
                                    class200 var346 = class349.method2447(var345, (byte) -9);
                                    class142.field2062[var3++] = var346.field2916;
                                    continue;
                                }
                                if (var549 == 6802) {
                                    var3--;
                                    int var347 = class142.field2062[var3];
                                    class200 var348 = class349.method2447(var347, (byte) -9);
                                    class142.field2062[var3++] = var348.field2922;
                                    continue;
                                }
                                if (var549 == 6803) {
                                    var3--;
                                    int var349 = class142.field2062[var3];
                                    class200 var350 = class349.method2447(var349, (byte) -9);
                                    class142.field2062[var3++] = var350.field2915;
                                    continue;
                                }
                            }
                        } else if (var549 == 4400) {
                            var3 -= 2;
                            int var412 = class142.field2062[var3];
                            int var413 = class142.field2062[var3 + 1];
                            class343 var414 = class275.method2009(0, var413);
                            if (var414.method2394(true)) {
                                class62.field909[var5++] = class30.method212(0, var412).method1928(var414.field5301, var413, (byte) 96);
                            } else {
                                class142.field2062[var3++] = class30.method212(0, var412).method1922(var413, class228.method1706(arg2, 5), var414.field5307);
                            }
                            continue;
                        }
                    } else if (var549 == 4300) {
                        var3 -= 2;
                        int var415 = class142.field2062[var3 + 1];
                        int var416 = class142.field2062[var3];
                        class343 var417 = class275.method2009(0, var415);
                        if (var417.method2394(true)) {
                            class62.field909[var5++] = class343.method2393((byte) -27, var416).method1547(var415, var417.field5301, (byte) -65);
                        } else {
                            class142.field2062[var3++] = class343.method2393((byte) -27, var416).method1543(var415, var417.field5307, -32435);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var548) {
            if (arg1.field1612 == null) {
                if (class14.field214 != 0) {
                    class28.method177("Clientscript error - check log for details", -19420);
                }
                class343.method2402("CS2 - scr:" + arg1.field1656 + " op:" + var8, var548, -2);
            } else {
                StringBuffer var545 = new StringBuffer(30);
                var545.append("%0a - in: ").append(arg1.field1612);
                for (int var546 = class294.field4429 - 1; var546 >= 0; var546--) {
                    var545.append("%0a - via: ").append(class286.field4319[var546].field792.field1612);
                }
                if (var8 == 40) {
                    int var547 = var7[var4];
                    var545.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var547));
                }
                if (class14.field214 != 0) {
                    class28.method177("Clientscript error in: " + arg1.field1612, -19420);
                }
                class343.method2402("CS2 - scr:" + arg1.field1656 + " op:" + var8 + var545.toString(), var548, arg2 ^ 0xFFFFFFFA);
            }
        }
    }
}
