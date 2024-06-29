import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class138 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lqf;")
    public static class117 field3278 = class72.method514(121, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lqf;")
    public static class117 field3280 = class72.method514(102, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lqf;")
    public static class117 field3277 = class72.method514(114, "<col=ffff00>*V");

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lqf;")
    public static class117 field3283 = class72.method514(121, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[I")
    public static int[] field3288 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lqf;")
    public static class117 field3282 = class72.method514(120, ":duelreq:");

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lqf;")
    private static class117 field3284 = class72.method514(123, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lqf;")
    public static class117 field3292 = class72.method514(107, "::clientdrop");

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lqf;")
    public static class117 field3289 = field3284;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[I")
    public static int[] field3290 = new int[1000];

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lha;")
    public static class50 field3285;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Ljb;")
    public static class64 field3281;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I")
    public static int method1074(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method1075(byte arg0) {
        field3287++;
        if (arg0 == 101) {
            class53.field1101.method214(8);
            class126.field2996.method951(0, 0);
            class12.method95();
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method1076(int arg0, int arg1) {
        field3286++;
        if (arg1 > -41) {
            field3280 = null;
        }
        if (arg0 == 100 && class27.field535 > 0) {
            byte[] var2 = class153.field3772[--class27.field535];
            class153.field3772[class27.field535] = null;
            return var2;
        } else if (arg0 == 5000 && class90.field2169 > 0) {
            byte[] var3 = class78.field1777[--class90.field2169];
            class78.field1777[class90.field2169] = null;
            return var3;
        } else if (arg0 == 30000 && class19.field307 > 0) {
            byte[] var4 = class13.field193[--class19.field307];
            class13.field193[class19.field307] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
    public static final void method1077(boolean arg0, int arg1) {
        field3293++;
        if (class126.field2977 == null) {
            return;
        }
        if (arg1 < 65) {
            method1078(-81);
        }
        try {
            class77 var2 = new class77(4);
            var2.method571(arg0 ? 2 : 3, -11124);
            var2.method568(0, 990);
            class126.field2977.method736((byte) 42, var2.field1748, 4, 0);
        } catch (IOException var4) {
            try {
                class126.field2977.method738(1);
            } catch (Exception var3) {
            }
            class126.field2977 = null;
            class129.field3072++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1078(int arg0) {
        field3290 = null;
        field3288 = null;
        field3278 = null;
        field3289 = null;
        field3292 = null;
        field3285 = null;
        field3282 = null;
        if (arg0 != 4) {
            method1079((byte) 119);
        }
        field3277 = null;
        field3281 = null;
        field3284 = null;
        field3280 = null;
        field3283 = null;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static final void method1079(byte arg0) {
        field3291++;
        class120.method964(1);
        class87.method692((byte) -60);
        if (class78.field1765 == 2 || class78.field1765 == 5) {
            byte[] var41 = class117.field2826.field2833;
            int[] var42 = class49.field1032;
            int var43 = var41.length;
            for (int var44 = 0; var44 < var43; var44++) {
                if (var41[var44] == 0) {
                    var42[var44] = 0;
                }
            }
            if (class78.field1765 < 3) {
                class79.field1811.method656(0, 0, 33, 33, 25, 25, class128.field3035, 256, class103.field2501, class128.field3025);
            }
            class129.method1011((byte) 125);
            return;
        }
        int var1 = class141.field3395.field1998 / 32 + 48;
        int var2 = class128.field3035 + class48.field967 & 0x7FF;
        int var3 = 464 - class141.field3395.field1960 / 32;
        class18.field285.method656(25, 5, 146, 151, var1, var3, var2, class53.field1096 + 256, class19.field295, class42.field849);
        for (int var4 = 0; var4 < class110.field2606; var4++) {
            int var39 = class97.field2365[var4] * 4 + 2 - class141.field3395.field1998 / 32;
            int var40 = class87.field2011[var4] * 4 + 2 - class141.field3395.field1960 / 32;
            class140.method1088(var40, false, class110.field2609[var4], var39);
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var35 = 0; var35 < 104; var35++) {
                class5 var36 = class43.field858[class140.field3344][var5][var35];
                if (var36 != null) {
                    int var37 = var35 * 4 + 2 - class141.field3395.field1960 / 32;
                    int var38 = var5 * 4 + 2 - class141.field3395.field1998 / 32;
                    class140.method1088(var37, false, class25.field496[0], var38);
                }
            }
        }
        for (int var6 = 0; var6 < class25.field483; var6++) {
            class58 var31 = class72.field1533[class150.field3724[var6]];
            if (var31 != null && var31.method162(true)) {
                class134 var32 = var31.field1172;
                if (var32 != null && var32.field3163 != null) {
                    var32 = var32.method1037(122);
                }
                if (var32 != null && var32.field3175 && var32.field3162) {
                    int var33 = var31.field1960 / 32 - class141.field3395.field1960 / 32;
                    int var34 = var31.field1998 / 32 - class141.field3395.field1998 / 32;
                    class140.method1088(var33, false, class25.field496[1], var34);
                }
            }
        }
        if (arg0 > -118) {
            field3292 = null;
        }
        for (int var7 = 0; var7 < class66.field1387; var7++) {
            class21 var23 = class149.field3709[class20.field326[var7]];
            if (var23 != null && var23.method162(true)) {
                int var24 = var23.field1960 / 32 - class141.field3395.field1960 / 32;
                boolean var25 = false;
                int var26 = var23.field1998 / 32 - class141.field3395.field1998 / 32;
                long var27 = var23.field356.method942((byte) 11);
                for (int var29 = 0; var29 < class75.field1651; var29++) {
                    if (class101.field2439[var29] == var27 && class50.field1063[var29] != 0) {
                        var25 = true;
                        break;
                    }
                }
                boolean var30 = false;
                if (class141.field3395.field365 != 0 && var23.field365 != 0 && class141.field3395.field365 == var23.field365) {
                    var30 = true;
                }
                if (var25) {
                    class140.method1088(var24, false, class25.field496[3], var26);
                } else if (var30) {
                    class140.method1088(var24, false, class25.field496[4], var26);
                } else {
                    class140.method1088(var24, false, class25.field496[2], var26);
                }
            }
        }
        if (class132.field3119 != 0 && class43.field856 % 20 < 10) {
            if (class132.field3119 == 1 && class120.field2875 >= 0 && class72.field1533.length > class120.field2875) {
                class58 var8 = class72.field1533[class120.field2875];
                if (var8 != null) {
                    int var9 = var8.field1960 / 32 - class141.field3395.field1960 / 32;
                    int var10 = var8.field1998 / 32 - class141.field3395.field1998 / 32;
                    class18.method149(class144.field3545[1], var9, var10, 3603);
                }
            }
            if (class132.field3119 == 2) {
                int var11 = (class141.field3405 - class19.field312) * 4 + 2 - class141.field3395.field1960 / 32;
                int var12 = (class130.field3109 - class133.field3153) * 4 + 2 - class141.field3395.field1998 / 32;
                class18.method149(class144.field3545[1], var11, var12, 3603);
            }
            if (class132.field3119 == 10 && class146.field3574 >= 0 && class146.field3574 < class149.field3709.length) {
                class21 var13 = class149.field3709[class146.field3574];
                if (var13 != null) {
                    int var14 = var13.field1998 / 32 - class141.field3395.field1998 / 32;
                    int var15 = var13.field1960 / 32 - class141.field3395.field1960 / 32;
                    class18.method149(class144.field3545[1], var15, var14, 3603);
                }
            }
        }
        if (class94.field2287 != 0) {
            int var16 = class94.field2287 * 4 + 2 - class141.field3395.field1998 / 32;
            int var17 = class40.field802 * 4 + 2 - class141.field3395.field1960 / 32;
            class140.method1088(var17, false, class144.field3545[0], var16);
        }
        class49.method360(97, 78, 3, 3, 16777215);
        if (class78.field1765 < 3) {
            class79.field1811.method656(0, 0, 33, 33, 25, 25, class128.field3035, 256, class103.field2501, class128.field3025);
        } else {
            int[] var18 = class49.field1032;
            byte[] var19 = class117.field2826.field2833;
            for (int var20 = 0; var20 <= 33; var20++) {
                int var21 = class117.field2826.field2835 * var20;
                for (int var22 = 0; var22 <= 33; var22++) {
                    if (var19[var21 + var22] == 0) {
                        var18[var21 + var22] = 0;
                    }
                }
            }
        }
        class129.method1011((byte) 127);
    }
}
