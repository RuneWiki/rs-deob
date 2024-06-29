import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 extends class40 {

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "Lec;")
    public static class28 field1892 = class28.method210(-46, ")3");

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field1888 = 0;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Lec;")
    public static class28 field1897 = class28.method210(-46, "@yel@ days of*6nmember credit remaining)3*6n*6n@lre@Credit low(Q Renew now*6n@lre@to avoid losing members)3");

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "[Z")
    public static boolean[] field1896 = new boolean[5];

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "Lec;")
    public static class28 field1895 = class28.method210(-46, "M");

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lpa;")
    public static class91 field1882 = new class91(10);

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Lec;")
    public static class28 field1904 = class28.method210(-46, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public int field1890;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public int field1891;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    public int[] field1881;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[I")
    public int[] field1885;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "[I")
    public static int[] field1898;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "[I")
    public int[] field1903;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[Lqb;")
    public class97[] field1886;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "[Lqb;")
    public class97[] field1887;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[[[B")
    public byte[][][] field1883;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lnd;Ljava/awt/Component;I)V")
    public static final void method630(class82 arg0, Component arg1, int arg2) {
        field1893++;
        try {
            class71 var3 = (class71) Class.forName("oa").getDeclaredConstructor().newInstance();
            var3.method554(arg0, 2048);
            class43.field949 = var3;
            if (arg2 == 17853) {
                ;
            }
        } catch (Throwable var6) {
            try {
                class43.field949 = new class113(arg0, arg1);
            } catch (Throwable var5) {
                if (class82.field1867.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class43.field949 = new class104();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class43.field949 = new class88(8000);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method631(int arg0) {
        field1897 = null;
        field1904 = null;
        field1895 = null;
        field1882 = null;
        field1896 = null;
        if (arg0 != 0) {
            method633(-120, -43, -112, -27, 91, 9, 42, -51);
        }
        field1898 = null;
        field1892 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z[Lec;)[Lec;")
    public static final class28[] method632(boolean arg0, class28[] arg1) {
        field1902++;
        if (arg0) {
            return null;
        }
        class28[] var2 = new class28[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class68.method537(1, new class28[] { class5.method25(6366, var3), class2.field17 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class68.method537(1, new class28[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 10773) {
            method631(18);
        }
        field1900++;
        if (arg3 < 1 || arg0 < 1 || arg3 > 102 || arg0 > 102) {
            return;
        }
        if (class72.field1591 && class122.field2657 != arg5) {
            return;
        }
        boolean var8 = true;
        int var9 = 0;
        if (arg4 == 0) {
            var9 = class11.field179.method783(arg5, arg3, arg0);
        }
        boolean var10 = false;
        boolean var11 = false;
        if (arg4 == 1) {
            var9 = class11.field179.method767(arg5, arg3, arg0);
        }
        if (arg4 == 2) {
            var9 = class11.field179.method796(arg5, arg3, arg0);
        }
        if (arg4 == 3) {
            var9 = class11.field179.method774(arg5, arg3, arg0);
        }
        if (var9 != 0) {
            int var12 = var9 >> 14 & 0x7FFF;
            int var13 = class11.field179.method795(arg5, arg3, arg0, var9);
            int var14 = var13 >> 6 & 0x3;
            int var15 = var13 & 0x1F;
            if (arg4 == 0) {
                class11.field179.method802(arg5, arg3, arg0);
                class45 var16 = class72.method566(var12, arg6 - 10826);
                if (var16.field980) {
                    class43.field922[arg5].method842(arg3, false, var14, var16.field976, arg0, var15);
                }
            }
            if (arg4 == 1) {
                class11.field179.method764(arg5, arg3, arg0);
            }
            if (arg4 == 2) {
                class11.field179.method800(arg5, arg3, arg0);
                class45 var17 = class72.method566(var12, -76);
                if (arg3 + var17.field1002 > 103 || var17.field1002 + arg0 > 103 || var17.field979 + arg3 > 103 || arg0 + var17.field979 > 103) {
                    return;
                }
                if (var17.field980) {
                    class43.field922[arg5].method844(var17.field976, var17.field979, arg6 ^ 0xFFFFD5EA, arg3, var17.field1002, var14, arg0);
                }
            }
            if (arg4 == 3) {
                class11.field179.method775(arg5, arg3, arg0);
                class45 var18 = class72.method566(var12, -50);
                if (var18.field980 && var18.field977 == 1) {
                    class43.field922[arg5].method832(arg3, arg0, (byte) -53);
                }
            }
        }
        if (arg1 < 0) {
            return;
        }
        int var19 = arg5;
        if (arg5 < 3 && (class47.field1080[1][arg3][arg0] & 0x2) == 2) {
            var19 = arg5 + 1;
        }
        class32.method254(class11.field179, arg1, arg0, arg5, var19, arg2, false, class43.field922[arg5], arg3, arg7);
        return;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static final void method634(int arg0) {
        int var1 = -69 % ((-arg0 - 5) / 37);
        class111.field2340 = false;
        field1889++;
        class72.field1591 = false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZI)Z")
    public static final boolean method635(int arg0, int arg1, boolean arg2, int arg3) {
        field1894++;
        int var4 = arg0 >> 14 & 0x7FFF;
        int var5 = class11.field179.method795(class122.field2657, arg3, arg1, arg0);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class45 var8 = class72.method566(var4, -127);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field979;
                var9 = var8.field1002;
            } else {
                var9 = var8.field979;
                var10 = var8.field1002;
            }
            int var11 = var8.field993;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class51.method416(true, 0, var11, -105, arg1, var10, 2, class37.field848.field1487[0], var9, 0, class37.field848.field1466[0], arg3);
        } else {
            class51.method416(true, var6 + 1, 0, -120, arg1, 0, 2, class37.field848.field1487[0], 0, var7, class37.field848.field1466[0], arg3);
        }
        class125.field2722 = 0;
        class119.field2584 = 2;
        class105.field2227 = class32.field680;
        if (!arg2) {
            field1897 = null;
        }
        class76.field1695 = class96.field2143;
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static final void method636(byte arg0) {
        class129.method985(true, class37.field854);
        field1901++;
        if (class2.field19 != -1) {
            class129.method985(true, class2.field19);
        }
        if (arg0 != 57) {
            field1904 = null;
        }
        class12.field197 = 0;
        class90.field1984.method92((byte) -4);
        class87.field1935 = class60.method491(class87.field1935);
        class120.method906();
        class18.method111(0, arg0 ^ 0xFFFFFFC6, class37.field854, 0, 0, 503, 765, 0, -1);
        if (class2.field19 != -1) {
            class18.method111(0, -1, class2.field19, 0, 0, 503, 765, 0, -1);
        }
        if (class13.field243) {
            class105.method729(false);
        } else {
            class21.method149(-1);
            class9.method54(arg0 - 42);
        }
        class90.field1984.method91(0, class117.field2493, 11675, 0);
    }
}
