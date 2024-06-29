import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class72 extends class202 {

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
    public static int[] field1277 = new int[200];

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field1275 = 100;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field1283 = -1;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Z")
    public static boolean field1279;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
    public static int[] field1280;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z[B)Z", line = 13)
    public static final boolean method538(boolean arg0, byte[] arg1) {
        field1282++;
        class26 var2 = new class26(arg1);
        int var3 = var2.method226(255);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method226(255) == 1;
        if (var4) {
            class59.method502(28333, var2);
        }
        class11.method72(0, var2);
        return arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lke;IILjava/awt/Component;I)Lhm;", line = 38)
    public static final class19 method539(class107 arg0, int arg1, int arg2, Component arg3, int arg4) {
        field1274++;
        if (class25.field448 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class19 var5 = (class19) Class.forName("ah").getDeclaredConstructor().newInstance();
                if (arg2 != -5690) {
                    method539((class107) null, 124, 25, (Component) null, 11);
                }
                var5.field327 = arg1;
                var5.field294 = new int[(class292.field4890 ? 2 : 1) * 256];
                var5.method124(arg3);
                var5.field318 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field318 > 16384) {
                    var5.field318 = 16384;
                }
                var5.method110(var5.field318);
                if (class243.field4014 > 0 && class19.field323 == null) {
                    class19.field323 = new class271();
                    class19.field323.field4505 = arg0;
                    arg0.method800(-29, class19.field323, class243.field4014);
                }
                if (class19.field323 != null) {
                    if (class19.field323.field4512[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class19.field323.field4512[arg4] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class187 var7 = new class187(arg0, arg4);
                    var7.field294 = new int[(class292.field4890 ? 2 : 1) * 256];
                    var7.field327 = arg1;
                    var7.method124(arg3);
                    var7.field318 = 16384;
                    var7.method110(var7.field318);
                    if (class243.field4014 > 0 && class19.field323 == null) {
                        class19.field323 = new class271();
                        class19.field323.field4505 = arg0;
                        arg0.method800(-88, class19.field323, class243.field4014);
                    }
                    if (class19.field323 != null) {
                        if (class19.field323.field4512[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class19.field323.field4512[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class19();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Ljb;", line = 137)
    public static final class27 method540(int arg0, int arg1) {
        field1281++;
        class27 var2 = (class27) class122.field2126.method1345((long) arg1, arg0 + 28150);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class93.field1693.method1651(class81.method631(123, arg1), class159.method1225(arg1, (byte) -60), -1);
        class27 var4 = new class27();
        var4.field557 = arg1;
        if (var3 != null) {
            var4.method254(-122, new class26(var3));
        }
        var4.method259(-128);
        if (var4.field552) {
            var4.field588 = 0;
            var4.field570 = false;
        }
        if (!class55.field1074 && var4.field555) {
            var4.field542 = null;
        }
        class122.field2126.method1350(var4, (long) arg1, -57);
        if (arg0 != 0) {
            field1277 = (int[]) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 173)
    public static void method541(byte arg0) {
        field1277 = null;
        if (arg0 == -60) {
            field1280 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIZI)V", line = 191)
    public static final void method542(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1278++;
        if (class296.field4950 < 100) {
            class6.method29(!arg3);
        }
        if (class21.field350) {
            class111.method847(arg0, arg2, arg0 + arg4, arg1 + arg2);
        } else {
            class115.method870(arg0, arg2, arg0 + arg4, arg1 + arg2);
        }
        if (class296.field4950 < 100) {
            byte var14 = 20;
            int var15 = arg0 + (arg4 / 2);
            int var16 = arg1 / 2 + arg2 - var14 - 18;
            if (class21.field350) {
                class111.method846(arg0, arg2, arg4, arg1, 0);
                class111.method835(var15 - 152, var16, 304, 34, 9179409);
                class111.method835(var15 - 151, var16 + 1, 302, 32, 0);
                class111.method846(var15 - 150, var16 + 2, class296.field4950 * 3, 30, 9179409);
                class111.method846(var15 - (150 - class296.field4950 * 3), var16 + 2, 300 - (class296.field4950 * 3), 30, 0);
            } else {
                class115.method880(arg0, arg2, arg4, arg1, 0);
                class115.method881(var15 - 152, var16, 304, 34, 9179409);
                class115.method881(var15 - 151, var16 + 1, 302, 32, 0);
                class115.method880(var15 - 150, var16 - -2, class296.field4950 * 3, 30, 9179409);
                class115.method880(var15 - (150 - (class296.field4950 * 3)), var16 + 2, 300 - (class296.field4950 * 3), 30, 0);
            }
            class230.field3789.method1825(class73.field1289, var15, var14 + var16, 16777215, -1);
            return;
        }
        class244.field4031 = (int) ((float) (arg4 * 2) / class101.field1786);
        class195.field3142 = class110.field1931 - (int) ((float) arg4 / class101.field1786);
        class233.field3828 = (int) ((float) (arg1 * 2) / class101.field1786);
        class123.field2133 = class92.field1675 - ((int) ((float) arg1 / class101.field1786));
        int var5 = class110.field1931 - ((int) ((float) arg4 / class101.field1786));
        if (!arg3) {
            return;
        }
        int var6 = class92.field1675 - ((int) ((float) arg1 / class101.field1786));
        int var7 = (int) ((float) arg4 / class101.field1786) + class110.field1931;
        int var8 = (int) ((float) arg1 / class101.field1786) + class92.field1675;
        if (class21.field350) {
            if (class296.field4949 == null || class296.field4949.field2976 != arg4 || class296.field4949.field2981 != arg1) {
                class296.field4949 = null;
                class296.field4949 = new class141(arg4, arg1);
            }
            class115.method871(class296.field4949.field1761, arg4, arg1);
            class169.method1262(var6, var8, (byte) -48, arg1, var5, 0, 0, var7, arg4);
            class12.method78(var8, 0, 0, arg4, var7, 0, var6, var5, arg1);
            class134.method991(0, -1, var8, arg1, arg4, 0, var7, var6, var5);
            class296.field4949.method735(arg0, arg2);
        } else {
            class169.method1262(var6, var8, (byte) 77, arg1 + arg2, var5, arg2, arg0, var7, arg0 + arg4);
            class12.method78(var8, arg0, arg2, arg0 + arg4, var7, 0, var6, var5, arg1 + arg2);
            class134.method991(arg2, -1, var8, arg1 + arg2, arg0 - -arg4, arg0, var7, var6, var5);
        }
        if (class33.field668 > 0) {
            class33.field668--;
        }
        if (!class89.field1598) {
            return;
        }
        int var9 = arg0 + arg4 - 5;
        int var10 = arg2 + arg1 - 8;
        class146.field2428.method1835(class153.method1192(new class40[] { class277.field4636, class276.method1927((byte) -99, class81.field1422) }, (byte) 127), var9, var10, 16776960, -1);
        int var17 = var10 - 15;
        int var11 = 16776960;
        Runtime var12 = Runtime.getRuntime();
        int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var11 = 16711680;
        }
        class146.field2428.method1835(class153.method1192(new class40[] { class153.field2598, class276.method1927((byte) -115, var13), class208.field3323 }, (byte) -104), var9, var17, var11, -1);
        var10 = var17 - 15;
    }
}
