import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class122 {

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lae;")
    private static class6 field3011 = class64.method474(115, "The server is being updated)3");

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lae;")
    public static class6 field3016 = class64.method474(109, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lae;")
    public static class6 field3006 = class64.method474(120, "Handel akzeptieren");

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lae;")
    private static class6 field3017 = class64.method474(116, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lae;")
    public static class6 field3015 = field3017;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lae;")
    private static class6 field3009 = class64.method474(104, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Lae;")
    public static class6 field3019 = field3011;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3005 = 0;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Z")
    public static boolean field3013 = false;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lae;")
    public static class6 field3008 = field3009;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "[Lq;")
    public static class101[] field3003;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1002(boolean arg0) {
        field3000++;
        class88.method748(-5794);
        class111.method936(-15825);
        class133.method1092(256);
        class79.method680(3090);
        class69.method506((byte) 112);
        class20.method189(true);
        class137.method1109(-46);
        class60.method450(arg0);
        class123.method1010(84);
        class64.method472(false);
        class77.method623(3);
        class38.method331(arg0);
        ((class108) class29.field691).method914(94);
        class82.field1998.method129(27392);
        class77.field1822.method140(0);
        class24.field605.method140(0);
        class68.field1507.method140(0);
        class68.field1499.method140(0);
        class21.field518.method140(0);
        class41.field913.method140(0);
        class82.field2020.method140(0);
        class47.field1074.method140(0);
        class121.field2930.method140(0);
        class133.field3248.method140(0);
        class62.field1368.method140(0);
        class57.field1249.method140(0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 41)
    public static final void method1003(byte arg0) {
        if (arg0 != 22) {
            field3008 = null;
        }
        field3014++;
        if (class100.field2341 == null) {
            return;
        }
        class121 var1 = class100.field2341;
        class121 var2 = class81.method693(var1, (byte) -123);
        if (var2 == null) {
            class100.field2341 = null;
            return;
        }
        class109.field2646++;
        int[] var3 = class130.method1051(-6622, var2);
        int[] var4 = class130.method1051(arg0 ^ 0xFFFFE634, var1);
        int var5 = class117.field2771 - class22.field576;
        int var6 = class57.field1244 - class129.field3143;
        if (var1.field2923 >= var5 && var5 >= -var1.field2923 && var1.field2923 >= var6 && var6 >= -var1.field2923 && !class67.field1474) {
            var6 = 0;
            var5 = 0;
        } else if (var1.field2863 < class109.field2646 || class67.field1474) {
            class67.field1474 = true;
        } else {
            var6 = 0;
            var5 = 0;
        }
        int var7 = var4[0] + var5 - var3[0];
        int var8 = var4[1] + var6 - var3[1];
        if (var8 < 0) {
            var8 = 0;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (var2.field2872 < var1.field2872 + var8) {
            var8 = var2.field2872 - var1.field2872;
        }
        if (var2.field2984 < var7 + var1.field2984) {
            var7 = var2.field2984 - var1.field2984;
        }
        if (class100.field2341.field2875 != null && class67.field1474) {
            class76.method612(0, var1.field2875, null, arg0 - 63, var7, var1, var8);
        }
        if (class54.field1198 != 0) {
            return;
        }
        if (class67.field1474) {
            int var9 = class57.field1244 - var3[1];
            int var10 = class117.field2771 - var3[0];
            if (var9 < 0) {
                var9 = 0;
            }
            if (var10 < 0) {
                var10 = 0;
            }
            if (var10 > var2.field2984 - 1) {
                var10 = var2.field2984 - 1;
            }
            if (var9 > var2.field2872 - 1) {
                var9 = var2.field2872 - 1;
            }
            class121 var11 = class49.method394(var10, var9, arg0 - 22, var1, var2);
            if (class100.field2341.field2964 != null) {
                class76.method612(0, var1.field2964, var11, 122, var7, var1, var8);
            }
            if (var11 != null && var1.method993((byte) 120) != null) {
                class134.field3292++;
                class111.field2660.method938((byte) 63, 46);
                class111.field2660.method632(-21994, var11.field2980);
                class111.field2660.method632(-21994, var1.field2980);
                class111.field2660.method625(var11.field2960, -242288600);
                class111.field2660.method663(var1.field2960, -334352184);
            }
        } else {
            if (class100.field2341.field2974 != null) {
                class76.method612(0, var1.field2974, null, 126, var7, var1, var8);
            }
            if ((class82.field2018 == 1 || class57.method427(class85.field2058 - 1, (byte) -128)) && class85.field2058 > 2) {
                class64.method475(701);
            } else if (class85.field2058 > 0) {
                class38.method332(class85.field2058 - 1, 1);
            }
        }
        class100.field2341 = null;
        return;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V", line = 168)
    public static final void method1004(byte arg0) {
        field3002++;
        for (int var1 = -1; var1 < class47.field1065; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class4.field47[var1];
            }
            class66 var6 = class20.field387[var5];
            if (var6 != null && var6.field1730 > 0) {
                var6.field1730--;
                if (var6.field1730 == 0) {
                    var6.field1775 = null;
                }
            }
        }
        int var2 = 0;
        if (arg0 <= 53) {
            field3019 = null;
        }
        while (class138.field3365 > var2) {
            int var3 = class42.field967[var2];
            class2 var4 = class49.field1097[var3];
            if (var4 != null && var4.field1730 > 0) {
                var4.field1730--;
                if (var4.field1730 == 0) {
                    var4.field1775 = null;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V", line = 224)
    public static final void method1005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3018++;
        int var7 = 126 / ((21 - arg4) / 47);
        if (class21.method208(0, arg1)) {
            class117.method958(-1, arg2, 1, 0, class35.field828[arg1], arg0, arg6, 0, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Lqd;", line = 250)
    public static final class102 method1006(int arg0, byte arg1) {
        if (arg1 <= 78) {
            field3013 = false;
        }
        class102 var2 = (class102) class51.field1148.method128((byte) 125, (long) arg0);
        field3001++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class22.field572.method160(30605, 4, arg0);
        class102 var4 = new class102();
        if (var3 != null) {
            var4.method875(-1, new class77(var3), arg0);
        }
        var4.method873((byte) -125);
        class51.field1148.method130(var4, (long) arg0, (byte) -55);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Ltc;", line = 299)
    public static final class118 method1007(int arg0, int arg1) {
        field2999++;
        class118 var2 = (class118) class90.field2152.method128((byte) -38, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        int var3 = 42 % ((18 - arg1) / 40);
        byte[] var4 = class50.field1127.method160(30605, 16, arg0);
        class118 var5 = new class118();
        if (var4 != null) {
            var5.method967(new class77(var4), (byte) -67);
        }
        class90.field2152.method130(var5, (long) arg0, (byte) 120);
        return var5;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)I", line = 324)
    public static final int method1008(int arg0, int arg1, int arg2) {
        int var3 = class56.method423(4, 113, arg1 + 45365, arg0 + 91923) + (class56.method423(2, 54, arg1 + 10294, arg0 - -37821) - 128 >> 1) + (class56.method423(arg2, arg2 + 85, arg1, arg0) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        field3012++;
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V", line = 342)
    public static void method1009(int arg0) {
        field3009 = null;
        field3016 = null;
        if (arg0 > -8) {
            method1007(25, -38);
        }
        field3008 = null;
        field3006 = null;
        field3015 = null;
        field3011 = null;
        field3017 = null;
        field3019 = null;
        field3003 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public abstract void method362(int arg0);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public abstract void method365(boolean arg0);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BBZ)V")
    public abstract void method361(int arg0, byte[] arg1, byte arg2, boolean arg3);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)V")
    public abstract void method363(int arg0, byte arg1);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public abstract void method364(int arg0);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    public abstract void method360(int arg0, int arg1, int arg2);
}
