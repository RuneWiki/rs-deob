import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class137 extends class67 {

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "Z")
    public boolean field2841 = false;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "Led;")
    public static class43 field2843 = class191.method1219("Unerwartete Antwort vom Anmelde)2Server", false);

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "[I")
    public static int[] field2838 = new int[5];

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "Led;")
    private static class43 field2849 = class191.method1219("Invalid loginserver requested)3", false);

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "[J")
    public static long[] field2840 = new long[32];

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Led;")
    public static class43 field2848 = field2849;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Lbf;")
    public static class17 field2839 = new class17(4096);

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "Led;")
    public static class43 field2852 = null;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "Lte;")
    public static class177 field2842;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "[Lnb;")
    public static class120[] field2837;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "[Lob;")
    public static class129[] field2847;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public static void method885(int arg0) {
        field2843 = null;
        if (arg0 < 99) {
            return;
        }
        field2852 = null;
        field2842 = null;
        field2840 = null;
        field2848 = null;
        field2837 = null;
        field2847 = null;
        field2849 = null;
        field2839 = null;
        field2838 = null;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public static final void method886(int arg0) {
        if (arg0 == 356421735) {
            field2851++;
            class9.field163 = false;
            class177.field3512 = false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I")
    public static final int method887(int arg0) {
        field2836++;
        if (arg0 != 30) {
            method890((byte) 126);
        }
        return class7.field133++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILed;I)V")
    public static final void method888(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        class129 var5 = class133.method858(-1, arg2, arg1);
        field2846++;
        if (var5 == null) {
            return;
        }
        if (var5.field2700 != null) {
            class115 var6 = new class115();
            var6.field2228 = arg3;
            var6.field2238 = var5.field2700;
            var6.field2252 = arg0;
            var6.field2249 = var5;
            class203.method1311(var6, 3538);
        }
        boolean var7 = true;
        if (var5.field2646 > 0) {
            var7 = class207.method1341(arg4 ^ 0xFFFFB153, var5);
        }
        if (!var7 || (arg4 != -20109 || !class145.method919(class193.method1231((byte) 127, var5), arg0 - 1, false))) {
            return;
        }
        if (arg0 == 1) {
            client.field541++;
            class29.field522.method338(253, 144);
            class29.field522.method581(arg2, -268435456);
            class29.field522.method546(false, arg1);
        }
        if (arg0 == 2) {
            class29.field522.method338(253, 119);
            class46.field900++;
            class29.field522.method581(arg2, -268435456);
            class29.field522.method546(false, arg1);
        }
        if (arg0 == 3) {
            class20.field349++;
            class29.field522.method338(253, 158);
            class29.field522.method581(arg2, arg4 - 268415347);
            class29.field522.method546(false, arg1);
        }
        if (arg0 == 4) {
            class29.field522.method338(253, 245);
            class48.field965++;
            class29.field522.method581(arg2, -268435456);
            class29.field522.method546(false, arg1);
        }
        if (arg0 == 5) {
            class124.field2466++;
            class29.field522.method338(253, 74);
            class29.field522.method581(arg2, -268435456);
            class29.field522.method546(false, arg1);
        }
        if (arg0 == 6) {
            class20.field345++;
            class29.field522.method338(253, 41);
            class29.field522.method581(arg2, -268435456);
            class29.field522.method546(false, arg1);
        }
        if (arg0 == 7) {
            class29.field522.method338(253, 30);
            class29.field522.method581(arg2, -268435456);
            class140.field2924++;
            class29.field522.method546(false, arg1);
        }
        if (arg0 == 8) {
            class200.field3937++;
            class29.field522.method338(253, 116);
            class29.field522.method581(arg2, arg4 ^ 0xFFFB173);
            class29.field522.method546(false, arg1);
        }
        if (arg0 == 9) {
            class29.field522.method338(253, 58);
            class29.field522.method581(arg2, -268435456);
            class29.field522.method546(false, arg1);
            class128.field2562++;
        }
        if (arg0 == 10) {
            class39.field751++;
            class29.field522.method338(253, 214);
            class29.field522.method581(arg2, arg4 - 268415347);
            class29.field522.method546(false, arg1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
    public static final void method889(int arg0) {
        field2845++;
        int var1 = class38.field723.method330((byte) 127, 8);
        if (arg0 != 1) {
            method885(-43);
        }
        if (class170.field3399 > var1) {
            for (int var2 = var1; var2 < class170.field3399; var2++) {
                class47.field947[class17.field278++] = class125.field2472[var2];
            }
        }
        if (var1 > class170.field3399) {
            throw new RuntimeException("gppov1");
        }
        class170.field3399 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class125.field2472[var3];
            class1 var5 = class12.field183[var4];
            int var6 = class38.field723.method330((byte) 75, 1);
            if (var6 == 0) {
                class125.field2472[class170.field3399++] = var4;
                var5.field2343 = client.field559;
            } else {
                int var7 = class38.field723.method330((byte) 47, 2);
                if (var7 == 0) {
                    class125.field2472[class170.field3399++] = var4;
                    var5.field2343 = client.field559;
                    class67.field1347[class115.field2241++] = var4;
                } else if (var7 == 1) {
                    class125.field2472[class170.field3399++] = var4;
                    var5.field2343 = client.field559;
                    int var8 = class38.field723.method330((byte) 87, 3);
                    var5.method764(false, var8, 0);
                    int var9 = class38.field723.method330((byte) 124, 1);
                    if (var9 == 1) {
                        class67.field1347[class115.field2241++] = var4;
                    }
                } else if (var7 == 2) {
                    class125.field2472[class170.field3399++] = var4;
                    var5.field2343 = client.field559;
                    int var10 = class38.field723.method330((byte) 95, 3);
                    var5.method764(true, var10, 0);
                    int var11 = class38.field723.method330((byte) 60, 3);
                    var5.method764(true, var11, arg0 - 1);
                    int var12 = class38.field723.method330((byte) 57, 1);
                    if (var12 == 1) {
                        class67.field1347[class115.field2241++] = var4;
                    }
                } else if (var7 == 3) {
                    class47.field947[class17.field278++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)I")
    public static final int method890(byte arg0) {
        field2844++;
        int var1 = class108.method668(class188.field3686, class184.field3617, -127, class93.field1839);
        if (var1 - class185.field3647 >= 800 || (class15.field232[class93.field1839][class184.field3617 >> 7][class188.field3686 >> 7] & 0x4) == 0) {
            if (arg0 != -1) {
                method889(-124);
            }
            return 3;
        } else {
            return class93.field1839;
        }
    }
}
