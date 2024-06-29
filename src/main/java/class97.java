import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class97 extends class26 {

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1275 = "M";

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field1278 = 3353893;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "[I")
    public static int[] field1283 = new int[128];

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field1280 = 0;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lfg;IIIZILnb;Lho;)V", line = 5)
    public static final void method698(class352 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class65 arg6, class287 arg7) {
        class295 var8 = null;
        field1282++;
        if (arg5 != 0) {
            return;
        }
        if (arg7.field4119 == 0) {
            if ((double) class38.field463 == 3.0D) {
                var8 = class125.field1672;
            }
            if ((double) class38.field463 == 4.0D) {
                var8 = class282.field4021;
            }
            if ((double) class38.field463 == 6.0D) {
                var8 = class288.field4163;
            }
            if ((double) class38.field463 >= 8.0D) {
                var8 = class195.field2694;
            }
        } else if (arg7.field4119 == 1) {
            if ((double) class38.field463 == 3.0D) {
                var8 = class288.field4163;
            }
            if ((double) class38.field463 == 4.0D) {
                var8 = class195.field2694;
            }
            if ((double) class38.field463 == 6.0D) {
                var8 = class254.field3707;
            }
            if ((double) class38.field463 >= 8.0D) {
                var8 = class196.field2703;
            }
        } else if (arg7.field4119 == 2) {
            if ((double) class38.field463 == 3.0D) {
                var8 = class254.field3707;
            }
            if ((double) class38.field463 == 4.0D) {
                var8 = class196.field2703;
            }
            if ((double) class38.field463 == 6.0D) {
                var8 = class216.field3057;
            }
            if ((double) class38.field463 >= 8.0D) {
                var8 = class74.field976;
            }
        }
        if (var8 == null) {
            return;
        }
        int var9 = arg7.field4142;
        if (arg0.field5492 && arg7.field4143 != -1) {
            var9 = arg7.field4143;
        }
        int var10 = class327.field4771.method1919(arg7.field4136, (int[]) null, class356.field5571);
        int var11 = arg0.field5497;
        int var12;
        if (arg4) {
            var12 = var11 - var8.method2017() * var10 / 2;
        } else {
            var12 = var11 - (arg2 - (-((var10 - 1) * var8.method2021()) - (var8.method2017() / 2)));
        }
        int var13 = var12 - var8.method2017();
        int var14 = var12 + var8.method2017() / 2;
        int var15 = 0;
        for (int var16 = 0; var16 < var10; var16++) {
            String var17 = class356.field5571[var16];
            if ((var10 - 1) > var16) {
                var17 = var17.substring(0, var17.length() - 4);
            }
            int var18 = var8.method2015(var17);
            if (var15 < var18) {
                var15 = var18;
            }
        }
        arg6.field816 = arg1 + arg0.field5501 - (var15 / 2);
        arg6.field827 = var15 / 2 + arg0.field5501 + arg1;
        arg6.field824 = arg3 + var13;
        arg6.field825 = arg3 + var13 + var8.method2021() * var10;
        int var19 = var13 + 2;
        int var20 = arg0.field5501 - (var15 / 2) - 5;
        if (arg7.field4125 != 0) {
            class37.method239(var20, var19, var15 + 10, (var13 - -(var10 * var8.method2021()) - var19) + 1, arg7.field4125, arg7.field4125 >>> 24);
        }
        if (arg7.field4134 != 0) {
            class37.method247(var20, var19, var15 + 10, -var19 + var8.method2021() * var10 + var13 + 1, arg7.field4134, arg7.field4134 >>> 24);
        }
        for (int var21 = 0; var21 < var10; var21++) {
            String var22 = class356.field5571[var21];
            if ((var10 - 1) > var21) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method2015(var22);
            if (var15 < var23) {
                var15 = var23;
            }
            var8.method2019(var22, arg0.field5501, var14, var9, true);
            var14 += var8.method2021();
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 149)
    public static void method699(int arg0) {
        field1275 = null;
        field1283 = null;
        if (arg0 != 6530) {
            field1280 = -121;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZLrl;I)V", line = 167)
    public static final void method700(boolean arg0, class74 arg1, int arg2) {
        field1281++;
        int var3 = (int) arg1.field304;
        int var4 = arg1.field982;
        arg1.method179((byte) 51);
        if (arg0) {
            class131.method1005(-1, var4);
        }
        class206.method1493((byte) 42, var4);
        class333 var5 = class89.method644(-116, var3);
        if (var5 != null) {
            class142.method1097(44, var5);
        }
        int var6 = class66.field853;
        if (arg2 <= 117) {
            method699(97);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class274.method1861(96, class156.field2169[var7])) {
                class65.method476(false, var7);
            }
        }
        if (class66.field853 == 1) {
            class159.field2263 = false;
            class90.method648(class146.field2038, 0, class117.field1534, class209.field2967, class65.field815);
        } else {
            class90.method648(class146.field2038, 0, class117.field1534, class209.field2967, class65.field815);
            int var8 = class186.field2554.method1894(class75.field986);
            for (int var9 = 0; var9 < class66.field853; var9++) {
                int var10 = class186.field2554.method1894(class28.method184((byte) 122, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class117.field1534 = (class66.field846 ? 26 : 22) + class66.field853 * 15;
            class146.field2038 = var8 + 8;
        }
        if (class233.field3340 != -1) {
            class142.method1104(class233.field3340, 1, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(II)V", line = 247)
    public class97(int arg0, int arg1) {
        this.field1279 = arg0;
        this.field1276 = arg1;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B[B)Ljl;", line = 259)
    public static final class20 method701(byte arg0, byte[] arg1) {
        field1277++;
        class20 var2 = new class20();
        class299 var3 = new class299(arg1);
        var3.field4351 = var3.field4350.length - 2;
        int var4 = var3.method2083((byte) -87);
        int var5 = var3.field4350.length - var4 - 2 - 12;
        var3.field4351 = var5;
        int var6 = var3.method2062(-25795);
        var2.field230 = var3.method2083((byte) -28);
        var2.field228 = var3.method2083((byte) -95);
        var2.field225 = var3.method2083((byte) -109);
        var2.field219 = var3.method2083((byte) -88);
        int var7 = var3.method2096((byte) -122);
        if (var7 > 0) {
            var2.field224 = new class329[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2083((byte) -75);
                class329 var10 = new class329(class262.method1805(var9, (byte) 119));
                var2.field224[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2062(-25795);
                    int var12 = var3.method2062(-25795);
                    var10.method2275(new class7(var12), 124, (long) var11);
                }
            }
        }
        if (arg0 != 63) {
            return (class20) null;
        }
        int var13 = 0;
        var3.field4351 = 0;
        var2.field227 = var3.method2092((byte) -7);
        var2.field223 = new String[var6];
        var2.field222 = new int[var6];
        var2.field220 = new int[var6];
        while (var3.field4351 < var5) {
            int var14 = var3.method2083((byte) -20);
            if (var14 == 3) {
                var2.field223[var13] = var3.method2060(arg0 - 12545).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field220[var13] = var3.method2096((byte) -122);
            } else {
                var2.field220[var13] = var3.method2062(arg0 - 25858);
            }
            var2.field222[var13++] = var14;
        }
        return var2;
    }
}
