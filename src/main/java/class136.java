import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class136 extends class23 {

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "Lve;")
    public static class255 field2264 = class87.method607(114, "(U(Y");

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Z")
    public static boolean field2262 = true;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "Lve;")
    public static class255 field2266 = class87.method607(91, "0(U");

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "Lve;")
    public static class255 field2261 = class87.method607(124, "null");

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field2263 = 2;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Lve;")
    public static class255 field2267 = class87.method607(44, "mapflag");

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "[J")
    public static long[] field2260 = new long[32];

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field2272 = 0;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "Z")
    public static boolean field2273 = false;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Z")
    public static boolean field2259 = true;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "Lve;")
    private static class255 field2274 = class87.method607(82, "Loading title screen )2 ");

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "Lve;")
    public static class255 field2258 = field2274;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 4)
    public static void method1018(int arg0) {
        field2266 = null;
        if (arg0 != 64) {
            field2263 = -52;
        }
        field2261 = null;
        field2260 = null;
        field2267 = null;
        field2258 = null;
        field2264 = null;
        field2274 = null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(ZI)I", line = 26)
    public static final int method1019(boolean arg0, int arg1) {
        field2271++;
        if (!arg0) {
            method1024(99, -70);
        }
        if (arg1 < 0) {
            return 0;
        }
        class262 var2 = (class262) class68.field1008.method280((long) arg1, 29153);
        if (var2 == null) {
            return class16.method76((byte) -105, arg1).field4460;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field4448.length; var4++) {
            if (var2.field4448[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class16.method76((byte) -110, arg1).field4460 - var2.field4448.length);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)V", line = 60)
    public static final void method1020(int arg0, int arg1) {
        class231 var2 = class107.field1810;
        synchronized (class107.field1810) {
            class265.field4491 = arg1;
            if (arg0 < 86) {
                method1022(-107, 50);
            }
        }
        field2268++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lpb;I)V", line = 97)
    public static final void method1021(class70 arg0, int arg1) {
        if (arg1 != 0) {
            method1024(75, 31);
        }
        field2265++;
        while (true) {
            while (arg0.field1066.length > arg0.field1068) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method481(0) == 1) {
                    var3 = arg0.method481(0);
                    var2 = true;
                    var4 = arg0.method481(arg1 ^ 0x0);
                }
                int var5 = arg0.method481(0);
                int var6 = arg0.method481(0);
                int var7 = var5 * 64 - class225.field3768;
                int var8 = class297.field5084 + (class41.field636 - 1) - (var6 * 64);
                if (var7 >= 0 && (var8 - 63) >= 0 && class282.field4846 > (var7 + 63) && var8 < class41.field636) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < var3 * 8 + 8 && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method466((byte) -84);
                                if (var13 != 0) {
                                    if (class160.field2700[var9][var10] == null) {
                                        class160.field2700[var9][var10] = new byte[4096];
                                    }
                                    class160.field2700[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method466((byte) -25);
                                    if (class149.field2514[var9][var10] == null) {
                                        class149.field2514[var9][var10] = new byte[4096];
                                    }
                                    class149.field2514[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method466((byte) -93);
                        if (var16 != 0) {
                            arg0.field1068++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)V", line = 198)
    public static final void method1022(int arg0, int arg1) {
        if (class20.field336 == null || arg1 > class20.field336.length) {
            class20.field336 = new int[arg1];
        }
        int var2 = 30 / ((arg0 + 53) / 41);
        field2257++;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V", line = 229)
    public static final void method1023(int arg0) {
        class255.field4318.method1523(22260, 190);
        class255.field4318.method463(false, class261.method1820((byte) 68));
        class67.field998++;
        field2270++;
        class255.field4318.method462(class210.field3589, (byte) -61);
        if (arg0 != 7498) {
            field2266 = (class255) null;
        }
        class255.field4318.method462(class201.field3479, (byte) -61);
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(II)I", line = 254)
    public static final int method1024(int arg0, int arg1) {
        field2269++;
        if (arg1 != -829745880) {
            method1024(41, -20);
        }
        return arg0 >>> 8;
    }
}
