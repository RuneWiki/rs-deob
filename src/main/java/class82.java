import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 {

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Llc;")
    public static class69 field1857 = class69.method470((byte) -122, "@bla@ from: @red@");

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Llc;")
    public static class69 field1860 = class69.method470((byte) -104, "");

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lme;")
    public static class77 field1854 = null;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[Lw;")
    public static class125[] field1850 = new class125[5];

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field1853 = 0;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Llc;")
    public static class69 field1864 = class69.method470((byte) -96, "@gr3@");

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "J")
    public static long field1847;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lcb;")
    public static class15 field1859;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lda;")
    public static class20 field1848;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lhc;")
    public static class45 field1861;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Loa;")
    public static class85 field1858;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field1865;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static final void method592(boolean arg0) {
        if (class106.field2298 != null) {
            class106.field2298.method564(1);
        }
        class106.field2298 = null;
        class64.method408(96);
        class120.field2562.method970();
        if (!arg0) {
            method594(87);
        }
        field1845++;
        for (int var1 = 0; var1 < 4; var1++) {
            class91.field1997[var1].method902(-5148);
        }
        System.gc();
        class93.method663(10, true);
        class87.field1910 = -1;
        class26.field565 = 0;
        class89.method626(10, (byte) 112);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
    public static void method593(boolean arg0) {
        field1850 = null;
        field1859 = null;
        if (arg0) {
            field1864 = null;
        }
        field1864 = null;
        field1857 = null;
        field1858 = null;
        field1848 = null;
        field1860 = null;
        field1861 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static final void method594(int arg0) {
        class68.method448((byte) 10);
        field1849++;
        if (class23.field489 == 1) {
            class10.field201[class17.field321 / 100].method139(class83.field1871 - 8 - 4, class55.field1170 + -8 + -4);
        }
        if (class23.field489 == 2) {
            class10.field201[class17.field321 / 100 + 4].method139(class83.field1871 - 4 - 8, class55.field1170 + -8 + -4);
        }
        if (class56.field1183 != -1) {
            class24.method159(14762, class56.field1183);
            class4.method17(4, 0, -1, 512, false, 0, class56.field1183, 334, 0);
        }
        if (class53.field1144 != -1) {
            class24.method159(14762, class53.field1144);
            class4.method17(0, 0, -1, 512, false, 0, class53.field1144, 334, 0);
        }
        class33.method209((byte) -85);
        if (!class127.field2738) {
            class61.method369(-20836);
            class114.method833((byte) 104);
        } else if (class77.field1718 == 0) {
            class23.method156(-13309);
        }
        if (arg0 != 29069) {
            field1859 = null;
        }
        if (class35.field708 == 1) {
            class49.field994.method139(472, 296);
        }
        if (class18.field371) {
            byte var1 = 20;
            short var2 = 507;
            int var3 = 16776960;
            if (class49.field1014 < 30 && class13.field264) {
                var3 = 16711680;
            }
            if (class49.field1014 < 20 && !class13.field264) {
                var3 = 16711680;
            }
            class119.field2552.method289(class46.method305(20025, new class69[] { class16.field287, class106.method791(class49.field1014, (byte) -128) }), var2, var1, var3);
            Runtime var4 = Runtime.getRuntime();
            int var5 = 16776960;
            int var6 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var6 > 32768 && class13.field264) {
                var5 = 16711680;
            }
            if (var6 > 65536 && !class13.field264) {
                var5 = 16711680;
            }
            int var10 = var1 + 15;
            class119.field2552.method289(class46.method305(20025, new class69[] { class104.field2268, class106.method791(var6, (byte) -60), class4.field81 }), var2, var10, var5);
            var10 += 15;
            if (class89.field1940) {
                class119.field2552.method289(class102.field2212, var2, var10, 16711680);
                var10 += 15;
                class89.field1940 = false;
            }
            if (class101.field2194) {
                class119.field2552.method289(class122.field2657, var2, var10, 16711680);
                var10 += 15;
                class101.field2194 = false;
            }
            if (class106.field2307) {
                class119.field2552.method289(class79.field1785, var2, var10, 16711680);
                var10 += 15;
                class106.field2307 = false;
            }
        }
        if (class25.field539 == 0) {
            return;
        }
        int var7 = class25.field539 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 < 10) {
            class119.field2552.method291(class46.method305(arg0 - 9044, new class69[] { class35.field704, class106.method791(var8, (byte) -84), class98.field2147, class106.method791(var9, (byte) -120) }), 4, 329, 16776960);
        } else {
            class119.field2552.method291(class46.method305(20025, new class69[] { class35.field704, class106.method791(var8, (byte) -99), class9.field145, class106.method791(var9, (byte) -71) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method595(byte arg0) {
        field1851++;
        if (class3.field70 == null) {
            return;
        }
        long var1 = System.currentTimeMillis();
        if (arg0 < 50) {
            method594(-78);
        }
        if (var1 <= class68.field1467) {
            return;
        }
        class3.field70.method767(var1);
        int var3 = (int) (var1 - class68.field1467);
        class68.field1467 = var1;
        synchronized (field1865 == null ? (field1865 = method596("ra")) : field1865) {
            class27.field569 += class35.field710 * var3;
            int var5 = (class27.field569 - class35.field710 * 2000) / 1000;
            if (var5 > 0) {
                if (class75.field1692 != null) {
                    class75.field1692.method202(var5);
                }
                class27.field569 -= var5 * 1000;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method596(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
