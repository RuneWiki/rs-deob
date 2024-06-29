import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class74 {

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lpd;")
    private static class94 field1811 = class28.method249(37, "yellow:");

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static volatile int field1816 = -1;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lpd;")
    public static class94 field1815 = class28.method249(-91, "@whi@ )4 ");

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lpd;")
    public static class94 field1809 = class28.method249(-57, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lpd;")
    public static class94 field1820 = class28.method249(-106, "Aus");

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lpd;")
    public static class94 field1821 = field1811;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Z")
    public static boolean field1814 = false;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1822 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lad;")
    public static class5 field1806;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    public static int[] field1810;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILse;III)V", line = 4)
    public static final void method552(int arg0, class113 arg1, int arg2, int arg3, int arg4) {
        field1805++;
        if (class97.field2478 >= 400) {
            return;
        }
        if (arg1.field2850 != null) {
            arg1 = arg1.method836(-124);
        }
        if (arg1 == null) {
            return;
        }
        if (arg0 != -9913) {
            field1815 = null;
        }
        if (!arg1.field2844) {
            return;
        }
        class94 var5 = arg1.field2865;
        if (arg1.field2838 != 0) {
            var5 = class4.method20(new class94[] { var5, class66.method499(class80.field2044.field2307, -7, arg1.field2838), class25.field679, class54.field1339, class51.method403(arg1.field2838, true), class94.field2400 }, true);
        }
        if (class126.field3178 == 1) {
            class102.field2577++;
            class97.method738(arg4, arg3, class4.method20(new class94[] { class113.field2848, class100.field2538, var5 }, true), class99.field2492, arg2, 22, -30801);
        } else if (class31.field882 != 1) {
            class37.field971++;
            class94[] var6 = arg1.field2839;
            if (class4.field99) {
                var6 = class70.method511(var6, 5);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method692(class1.field8, (byte) -38)) {
                        byte var8 = 0;
                        class80.field2036++;
                        if (var7 == 0) {
                            var8 = 54;
                        }
                        if (var7 == 1) {
                            var8 = 44;
                        }
                        if (var7 == 2) {
                            var8 = 5;
                        }
                        if (var7 == 3) {
                            var8 = 1;
                        }
                        if (var7 == 4) {
                            var8 = 29;
                        }
                        class97.method738(arg4, arg3, class4.method20(new class94[] { class111.field2805, var5 }, true), var6[var7], arg2, var8, -30801);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method692(class1.field8, (byte) -38)) {
                        class90.field2342++;
                        short var10 = 0;
                        if (class80.field2044.field2307 < arg1.field2838) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 54;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 44;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 5;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 1;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 29;
                        }
                        class97.method738(arg4, arg3, class4.method20(new class94[] { class111.field2805, var5 }, true), var6[var9], arg2, var11, -30801);
                    }
                }
            }
            class97.method738(arg4, arg3, class4.method20(new class94[] { class111.field2805, var5 }, true), class70.field1701, arg2, 1001, -30801);
        } else if ((class67.field1647 & 0x2) == 2) {
            class97.method738(arg4, arg3, class4.method20(new class94[] { class66.field1632, class100.field2538, var5 }, true), class19.field526, arg2, 45, -30801);
            class113.field2855++;
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Ltc;", line = 154)
    public static final class116 method553(boolean arg0) {
        field1818++;
        if (!arg0) {
            return null;
        }
        class116 var1 = new class116();
        var1.field2928 = field1804;
        var1.field2931 = class51.field1274;
        var1.field2932 = class126.field3159[0];
        var1.field2934 = class21.field585[0];
        var1.field2929 = class17.field442[0];
        var1.field2930 = class100.field2543[0];
        int var2 = var1.field2930 * var1.field2929;
        byte[] var3 = class63.field1561[0];
        var1.field2933 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field2933[var4] = class13.field331[class81.method605(255, var3[var4])];
        }
        class1.method3(68);
        return var1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 195)
    public static void method554(int arg0) {
        field1810 = null;
        field1806 = null;
        field1815 = null;
        field1820 = null;
        field1809 = null;
        field1821 = null;
        field1811 = null;
        int var1 = -97 % ((arg0 - 57) / 34);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZI)Lpd;", line = 219)
    public static final class94 method555(byte arg0, boolean arg1, int arg2) {
        field1808++;
        return arg0 <= 86 ? null : class63.method472(arg2, 10, arg1, 0);
    }
}
