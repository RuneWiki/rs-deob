import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class29 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
    public static boolean field604 = true;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lij;")
    public static class50 field606 = class78.method578(124, "Sprites geladen)3");

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lij;")
    public static class50 field613 = class78.method578(122, "<col=80ff00>");

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lij;")
    public static class50 field605 = class78.method578(126, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lij;")
    public static class50 field611 = class78.method578(127, ")1j");

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lce;")
    public static class10 field615;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "[I")
    public static int[] field616;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIZIZ)Ljd;")
    public static final class85 method256(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        field603++;
        if (!arg3) {
            field613 = null;
        }
        int var7 = (arg4 << 17) + (arg5 ? 65536 : 0) + (arg1 << 19) + arg2;
        long var8 = (long) arg0 * 3147483667L + ((long) var7 * 3849834839L);
        class85 var10 = (class85) class20.field416.method764((byte) 70, var8);
        if (var10 != null) {
            return var10;
        }
        class13.field317 = false;
        class85 var11 = class3.method19(arg1, arg2, false, (byte) 105, arg0, false, arg5, arg4);
        if (var11 != null && !class13.field317) {
            class20.field416.method765((byte) -128, var11, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZIII)V")
    public static final void method257(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class101.field1858 = (short) arg1;
        if (arg4 < 28) {
            field616 = null;
        }
        field614++;
        class200.field3292 = (short) arg3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public static final void method258(int arg0, int arg1, int arg2) {
        field610++;
        if (class136.field2368 < 2 && class114.field1992 == 0 && !class188.field3116) {
            return;
        }
        class50 var3;
        if (class114.field1992 == 1 && class136.field2368 < 2) {
            var3 = class80.method589(new class50[] { class220.field3686, class240.field4126, class19.field407, class231.field3886 }, 28743);
        } else if (class188.field3116 && class136.field2368 < 2) {
            var3 = class80.method589(new class50[] { class41.field766, class240.field4126, class18.field396, class231.field3886 }, 28743);
        } else {
            var3 = class79.method584(class136.field2368 - 1, -12022);
        }
        if (arg2 >= -42) {
            return;
        }
        if (class136.field2368 > 2) {
            var3 = class80.method589(new class50[] { var3, class27.field584, class78.method579(class136.field2368 - 2, -26225), class251.field4358 }, 28743);
        }
        int var4 = class57.field1029.method1079(var3, arg0 + 4, arg1 + 15, 16777215, 0, class41.field759, class59.field1086);
        class2.method12(15, -125, arg0 + 4, arg1, var4 + class57.field1029.method1081(var3));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method259(byte arg0) {
        boolean var1 = true;
        field609++;
        class225.method1538(false, (byte) 81);
        class203.field3375 = 0;
        for (int var2 = 0; var2 < class120.field2113.length; var2++) {
            if (class235.field3940[var2] != -1 && class120.field2113[var2] == null) {
                class120.field2113[var2] = class142.field2495.method190((byte) -18, 0, class235.field3940[var2]);
                if (class120.field2113[var2] == null) {
                    class203.field3375++;
                    var1 = false;
                }
            }
            if (class109.field1968[var2] != -1 && class148.field2548[var2] == null) {
                class148.field2548[var2] = class142.field2495.method166(0, arg0 + 1, class109.field1968[var2], class199.field3284[var2]);
                if (class148.field2548[var2] == null) {
                    class203.field3375++;
                    var1 = false;
                }
            }
            if (class40.field730 != null && class47.field858[var2] == null && class40.field730[var2] != -1) {
                class47.field858[var2] = class142.field2495.method166(0, class201.method1339(arg0, 1), class40.field730[var2], class199.field3284[var2]);
                if (class47.field858[var2] == null) {
                    class203.field3375++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class83.field1543 = 1;
            return;
        }
        class154.field2692 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class120.field2113.length; var4++) {
            byte[] var19 = class148.field2548[var4];
            if (var19 != null) {
                int var20 = (class252.field4371[var4] >> 8) * 64 - class61.field1124;
                int var21 = (class252.field4371[var4] & 0xFF) * 64 - class254.field4394;
                if (class163.field2783) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class252.method1710(var21, -3982, var19, var20);
            }
        }
        if (!var3) {
            class83.field1543 = 2;
            return;
        }
        if (class83.field1543 != 0) {
            class75.method564(-9117, true, class80.method589(new class50[] { class188.field3115, class154.field2693 }, 28743));
        }
        class244.method1665(0);
        class36.method289(-109);
        class51.method415();
        for (int var5 = 0; var5 < 4; var5++) {
            class45.field826[var5].method338(-22418);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class210.field3495[var6][var17][var18] = 0;
                }
            }
        }
        class200.method1335(64, false);
        class244.method1665(0);
        if (arg0 != 0) {
            return;
        }
        System.gc();
        class225.method1538(true, (byte) 81);
        class223.method1525(true, false);
        if (!class163.field2783) {
            class220.method1508(arg0 - 87, false);
            class225.method1538(true, (byte) 81);
            class126.method907((byte) -78, false);
            if (class47.field858 != null) {
                class125.method901((byte) -102);
            }
        }
        if (class163.field2783) {
            class95.method717(false, false);
            class225.method1538(true, (byte) 81);
            class80.method586(0, false);
        }
        class36.method289(106);
        class225.method1538(true, (byte) 81);
        class112.method819(class45.field826, (byte) -38, false);
        class225.method1538(true, (byte) 81);
        int var7 = class139.field2416;
        if (var7 > class201.field3312) {
            var7 = class201.field3312;
        }
        if (var7 < (class201.field3312 - 1)) {
            int var8 = class201.field3312 - 1;
        }
        if (class174.method1198(0)) {
            class76.method574(0);
        } else {
            class76.method574(class139.field2416);
        }
        class1.method1(-747);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class1.method2(var9, (byte) -35, var16);
            }
        }
        class244.method1665(arg0);
        class133.method936((byte) 94);
        class36.method289(-108);
        if (class251.field4357 != null && class148.field2547 != null && class25.field537 == 25) {
            class119.field2099++;
            class190.field3141.method1598((byte) -118, 97);
            class190.field3141.method1446(122, 1057001181);
        }
        if (!class163.field2783) {
            int var10 = (class31.field619 - 6) / 8;
            int var11 = (class20.field422 - 6) / 8;
            int var12 = (class31.field619 + 6) / 8;
            int var13 = (class20.field422 + 6) / 8;
            for (int var14 = var10 - 1; var14 <= (var12 + 1); var14++) {
                for (int var15 = var11 - 1; var15 <= var13 + 1; var15++) {
                    if (var14 < var10 || var14 > var12 || var11 > var15 || var15 > var13) {
                        class142.field2495.method182(class80.method589(new class50[] { class215.field3555, class78.method579(var14, arg0 - 26225), class188.field3117, class78.method579(var15, arg0 ^ 0xFFFF998F) }, arg0 + 28743), arg0);
                        class142.field2495.method182(class80.method589(new class50[] { class178.field2971, class78.method579(var14, arg0 - 26225), class188.field3117, class78.method579(var15, -26225) }, 28743), arg0);
                    }
                }
            }
        }
        if (class25.field537 == 28) {
            class120.method868(54, 10);
        } else {
            class120.method868(21, 30);
            if (class148.field2547 != null) {
                class190.field3141.method1598((byte) -128, 27);
            }
        }
        class244.method1665(0);
        class97.method733((byte) 33);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method260(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field617++;
        int var8 = -67 % ((-arg1 - 34) / 34);
        int var9 = class2.method10(class100.field1855, (byte) 97, arg7, class97.field1816);
        int var10 = class2.method10(class100.field1855, (byte) 97, arg0, class97.field1816);
        int var11 = class2.method10(class177.field2953, (byte) 97, arg2, class224.field3773);
        int var12 = class2.method10(class177.field2953, (byte) 97, arg3, class224.field3773);
        int var13 = class2.method10(class100.field1855, (byte) 97, arg6 + arg7, class97.field1816);
        int var14 = class2.method10(class100.field1855, (byte) 97, arg0 - arg6, class97.field1816);
        for (int var15 = var9; var15 < var13; var15++) {
            class155.method1090(class177.field2963[var15], var11, arg4, 160, var12);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class155.method1090(class177.field2963[var16], var11, arg4, 160, var12);
        }
        int var17 = class2.method10(class177.field2953, (byte) 97, arg2 + arg6, class224.field3773);
        int var18 = class2.method10(class177.field2953, (byte) 97, arg3 - arg6, class224.field3773);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class177.field2963[var19];
            class155.method1090(var20, var11, arg4, 160, var17);
            class155.method1090(var20, var17, arg5, 160, var18);
            class155.method1090(var20, var18, arg4, 160, var12);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I")
    public static int method261(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BI[IIIIIZIII)V")
    public static final void method262(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        int var11 = ((arg3 & 0xFF00) * arg9 & 0xFF0000) + ((arg3 & 0xFF00FF) * arg9 & 0xFF00FF00) >> 8;
        field608++;
        if (arg7) {
            return;
        }
        int var12 = 256 - arg9;
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg0[arg6++] == 0) {
                    arg10++;
                } else {
                    int var15 = arg2[arg10];
                    arg2[arg10++] = var11 + (class51.method413(16711680, var12 * class51.method413(var15, 65280)) + class51.method413(class51.method413(16711935, var15) * var12, -16711936) >> 8);
                }
            }
            arg10 += arg4;
            arg6 += arg1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method263(int arg0) {
        if (arg0 != 0) {
            field616 = null;
        }
        field613 = null;
        field615 = null;
        field616 = null;
        field605 = null;
        field611 = null;
        field606 = null;
    }
}
