import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class99 {

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "[I")
    public static int[] field387 = new int[32];

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field390 = 0;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Lr;")
    public static class118 field388 = class153.method1136(121, "weiss:");

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Lge;")
    public static class47 field383 = new class47(50);

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field393 = -1;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lr;")
    public static class118 field394 = class153.method1136(90, "Sprites geladen)3");

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Lr;")
    private static class118 field396 = class153.method1136(109, "Loading textures )2 ");

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Lr;")
    public static class118 field398 = field396;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "Lr;")
    public static class118 field399 = class153.method1136(74, "leuchten3:");

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field392 = 3353893;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "Lr;")
    private static class118 field397 = class153.method1136(111, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!c", name = "K", descriptor = "Lr;")
    public static class118 field395 = field397;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "Lr;")
    public static class118 field400 = class153.method1136(87, "headicons_prayer");

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "[Lvd;")
    public static class150[] field391;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static final void method134(int arg0) {
        field381++;
        class26.method232((byte) 62, class95.field2249);
        class130.field2973++;
        if (class134.field3047 && class114.field2665) {
            int var1 = class33.field827;
            int var2 = var1 - class157.field3630;
            if (class33.field843 > var2) {
                var2 = class33.field843;
            }
            int var3 = class44.field1049;
            int var4 = var3 - class153.field3450;
            if (var4 < class139.field3170) {
                var4 = class139.field3170;
            }
            if (class95.field2249.field1779 + var2 > class33.field843 + class75.field1859.field1779) {
                var2 = class33.field843 + class75.field1859.field1779 - class95.field2249.field1779;
            }
            int var5 = var2 - class81.field1968;
            int var6 = class75.field1859.field1757 + var2 - class33.field843;
            if (class95.field2249.field1748 + var4 > class139.field3170 + class75.field1859.field1748) {
                var4 = class139.field3170 + class75.field1859.field1748 - class95.field2249.field1748;
            }
            int var7 = var4 - class2.field38;
            int var8 = class75.field1859.field1789 + var4 - class139.field3170;
            int var9 = class95.field2249.field1762;
            if (class130.field2973 > class95.field2249.field1715 && (var5 > var9 || -var9 > var5 || var9 < var7 || -var9 > var7)) {
                class103.field2380 = true;
            }
            if (class95.field2249.field1718 != null && class103.field2380) {
                class136 var10 = new class136();
                var10.field3066 = var8;
                var10.field3077 = class95.field2249;
                var10.field3072 = var6;
                var10.field3067 = class95.field2249.field1718;
                class83.method681(var10, (byte) -115);
            }
            if (arg0 != -173) {
                method136(true);
            }
            if (class9.field197 == 0) {
                if (class103.field2380) {
                    if (class95.field2249.field1708 != null) {
                        class136 var11 = new class136();
                        var11.field3066 = var8;
                        var11.field3077 = class95.field2249;
                        var11.field3067 = class95.field2249.field1708;
                        var11.field3071 = class4.field71;
                        var11.field3072 = var6;
                        class83.method681(var11, (byte) -94);
                    }
                    if (class4.field71 != null && class34.method284(class95.field2249, false) != null) {
                        class131.field2976++;
                        class1.field22.method722(105, (byte) 9);
                        class1.field22.method841(class4.field71.field1764, -82);
                        class1.field22.method806(0, class4.field71.field1703);
                        class1.field22.method811(class95.field2249.field1703, 2073135696);
                        class1.field22.method842(class95.field2249.field1764, (byte) 2);
                    }
                } else if ((class148.field3294 == 1 || class92.method734(class39.field950 - 1, (byte) -120)) && class39.field950 > 2) {
                    class11.method86(503);
                } else if (class39.field950 > 0) {
                    class22.method208(class39.field950 - 1, 120);
                }
                class95.field2249 = null;
            }
        } else if (class130.field2973 > 1) {
            class95.field2249 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method135(int arg0) {
        class130.field2963 = new int[33];
        field384++;
        class62.field1434 = new int[33];
        class37.field922 = new int[151];
        class113.field2633 = new int[151];
        for (int var1 = 0; var1 < 33; var1++) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class87.field2112.field2155[class87.field2112.field2159 * var1 + var8] == 0) {
                    if (var6 == 999) {
                        var6 = var8;
                    }
                } else if (var6 != 999) {
                    var7 = var8;
                    break;
                }
            }
            class62.field1434[var1] = var6;
            class130.field2963[var1] = var7 - var6;
        }
        for (int var2 = 5; var2 < 156; var2++) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class87.field2112.field2155[var5 + class87.field2112.field2159 * var2] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var3 == 999) {
                        var3 = var5;
                    }
                } else if (var3 != 999) {
                    var4 = var5;
                    break;
                }
            }
            class113.field2633[var2 - 5] = var3 - 25;
            class37.field922[var2 - 5] = var4 - var3;
        }
        if (arg0 <= 38) {
            field392 = 122;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method136(boolean arg0) {
        field396 = null;
        field400 = null;
        field391 = null;
        field387 = null;
        field395 = null;
        if (arg0) {
            return;
        }
        field399 = null;
        field398 = null;
        field394 = null;
        field383 = null;
        field388 = null;
        field397 = null;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)I")
    public static final int method137(int arg0) {
        int var1 = 112 / ((39 - arg0) / 62);
        int var2 = class46.method386(-15186, class106.field2468, class24.field580, class44.field1051);
        field385++;
        return var2 - class85.field2093 >= 800 || (class33.field830[class106.field2468][class24.field580 >> 7][class44.field1051 >> 7] & 0x4) == 0 ? 3 : class106.field2468;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class15() {
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
    public class15(int arg0) {
        this.field386 = arg0;
    }
}
