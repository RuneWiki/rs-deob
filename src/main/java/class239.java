import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class239 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field3975 = 0;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field3979 = 0;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[Z")
    public static boolean[] field3976 = new boolean[100];

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field3980 = 0;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lmo;I)V", line = 8)
    public static final void method1688(class447 arg0, int arg1) {
        class225.field3743 = arg0.method2791((byte) 89, "p11_full");
        field3982++;
        class187.field3082 = arg0.method2791((byte) -99, "p12_full");
        class349.field5409 = arg0.method2791((byte) 111, "b12_full");
        class189.field3100 = arg0.method2791((byte) 92, "hitmarks");
        class223.field3710 = arg0.method2791((byte) 69, "hitbar_default");
        class73.field933 = arg0.method2791((byte) -82, "timerbar_default");
        class21.field276 = arg0.method2791((byte) -69, "headicons_pk");
        if (arg1 != 8943) {
            method1690(true, -23, false, true, (class231) null, 70, (class231) null);
        }
        class328.field5143 = arg0.method2791((byte) 88, "headicons_prayer");
        class298.field4747 = arg0.method2791((byte) 114, "hint_headicons");
        class61.field800 = arg0.method2791((byte) -117, "hint_mapmarkers");
        class156.field2451 = arg0.method2791((byte) -124, "mapflag");
        class298.field4741 = arg0.method2791((byte) 66, "cross");
        class348.field5358 = arg0.method2791((byte) -127, "mapdots");
        class397.field5938 = arg0.method2791((byte) 57, "scrollbar");
        class74.field943 = arg0.method2791((byte) -115, "name_icons");
        class250.field4077 = arg0.method2791((byte) 49, "floorshadows");
        class50.field619 = arg0.method2791((byte) 77, "compass");
        class372.field5622 = arg0.method2791((byte) -78, "hint_mapedge");
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljr;Z)Z", line = 37)
    public static final boolean method1689(class57 arg0, boolean arg1) {
        boolean var2 = class364.field5542 == class275.field4396;
        int var3 = 0;
        arg0.method375(112);
        if (arg0.field726 < 0 || arg0.field720 < 0 || arg0.field710 >= class156.field2449 || arg0.field711 >= class361.field5513) {
            return false;
        }
        for (int var4 = arg0.field726; var4 <= arg0.field710; var4++) {
            for (int var7 = arg0.field720; var7 <= arg0.field711; var7++) {
                int var8 = 0;
                if (var4 > arg0.field726) {
                    var8++;
                }
                if (var4 < arg0.field710) {
                    var8 += 4;
                }
                if (var7 > arg0.field720) {
                    var8 += 8;
                }
                if (var7 < arg0.field711) {
                    var8 += 2;
                }
                class362.method2345(arg0.field714, var4, var7);
                class232 var9 = class423.field6252[arg0.field714][var4][var7];
                class247 var10 = class209.method1480(var8, arg0, 0);
                class247 var11 = var9.field3866;
                if (var11 == null) {
                    var9.field3866 = var10;
                } else {
                    while (var11.field4054 != null) {
                        var11 = var11.field4054;
                    }
                    var11.field4054 = var10;
                }
                var9.field3876 = (byte) (var9.field3876 | var8);
                if (var2 && class381.field5763[var4][var7] != 0) {
                    var3 = class381.field5763[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field726; var5 <= arg0.field710; var5++) {
                for (int var6 = arg0.field720; var6 <= arg0.field711; var6++) {
                    if (class381.field5763[var5][var6] == 0) {
                        class381.field5763[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class429.field6320[class422.field6233++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIZZLoh;ILoh;)I", line = 124)
    public static final int method1690(boolean arg0, int arg1, boolean arg2, boolean arg3, class231 arg4, int arg5, class231 arg6) {
        if (!arg3) {
            return -69;
        }
        field3977++;
        int var7 = class51.method323(arg0, arg1, (byte) 114, arg6, arg4);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class51.method323(arg2, arg5, (byte) 89, arg6, arg4);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 159)
    public static void method1691(int arg0) {
        field3976 = null;
        if (arg0 != 1) {
            field3980 = 0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Z", line = 173)
    public static final boolean method1692(int arg0, int arg1) {
        field3981++;
        if (arg0 == 13 || arg0 == 48 || arg0 == 60 || arg0 == 36 || arg0 == 1) {
            return true;
        } else {
            if (arg1 <= 28) {
                method1691(-107);
            }
            return arg0 == 39 || arg0 == 38 || arg0 == 1011;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V", line = 201)
    public static final void method1693(int arg0, int arg1) {
        field3978++;
        if (arg1 < 72) {
            method1694((class312) null, (class120) null, -16, 38, 107, -67, 19);
        }
        class160.field2528.method337(arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Le;Lhm;IIIII)V", line = 217)
    public static final void method1694(class312 arg0, class120 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class81.field1006 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class156.field2449) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class361.field5513 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class232 var15 = class423.field6252[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class275.field4396[var12].method779(var13, var14) + class275.field4396[var12].method779(var13 + 1, var14) + class275.field4396[var12].method779(var13, var14 + 1) + class275.field4396[var12].method779(var13 + 1, var14 + 1)) / 4 - (class275.field4396[arg2].method779(arg3, arg4) + class275.field4396[arg2].method779(arg3 + 1, arg4) + class275.field4396[arg2].method779(arg3, arg4 + 1) + class275.field4396[arg2].method779(arg3 + 1, arg4 + 1)) / 4;
                                    class89 var17 = var15.field3873;
                                    class89 var18 = var15.field3872;
                                    if (var17 != null && var17.method186(0)) {
                                        arg1.method184((var14 - arg4) * 128 + (1 - arg6) * 64, arg0, var16, 0, var7, var17, (var13 - arg3) * 128 + (1 - arg5) * 64);
                                    }
                                    if (var18 != null && var18.method186(0)) {
                                        arg1.method184((var14 - arg4) * 128 + (1 - arg6) * 64, arg0, var16, 0, var7, var18, (var13 - arg3) * 128 + (1 - arg5) * 64);
                                    }
                                    for (class247 var19 = var15.field3866; var19 != null; var19 = var19.field4054) {
                                        class57 var20 = var19.field4052;
                                        if (var20 != null && var20.method186(0) && (var20.field726 == var13 || var8 == var13) && (var20.field720 == var14 || var10 == var14)) {
                                            int var21 = var20.field710 + 1 - var20.field726;
                                            int var22 = var20.field711 + 1 - var20.field720;
                                            arg1.method184((var20.field720 - arg4) * 128 + (var22 - arg6) * 64, arg0, var16, 0, var7, var20, (var20.field726 - arg3) * 128 + (var21 - arg5) * 64);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }
}
