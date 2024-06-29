import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class182 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3594 = 0;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lnd;")
    public static class122 field3590 = new class122();

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lkb;")
    private static class93 field3600 = class76.method390("Please remove ", 0);

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lkb;")
    public static class93 field3601 = class76.method390("p12_full", 0);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3598 = 0;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lkb;")
    public static class93 field3599 = field3600;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3597 = 0;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lkb;")
    public static class93 field3602 = class76.method390("::noclip", 0);

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lkb;")
    public static class93 field3604 = field3600;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lkb;")
    public static class93 field3605 = class76.method390("Bitte geben Sie Ihr Passwort ein)3", 0);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "[I")
    public static int[] field3603;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z")
    public static final boolean method1184(int arg0, int arg1) {
        field3592++;
        if (arg1 != 0) {
            field3600 = null;
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static final void method1185(boolean arg0) {
        class161.field3222 = 0;
        field3593++;
        class124.field2313 = 0;
        class135.method853(2);
        class204.method1326(1);
        class139.method869(2047);
        class61.method319(arg0);
        for (int var1 = 0; var1 < class161.field3222; var1++) {
            int var3 = class171.field3397[var1];
            if (class21.field338 != class206.field4035[var3].field2073) {
                class206.field4035[var3] = null;
            }
        }
        if (class157.field3109 != class59.field942.field3153) {
            throw new RuntimeException("gpp1 pos:" + class59.field942.field3153 + " psize:" + class157.field3109);
        }
        for (int var2 = 0; var2 < class205.field3966; var2++) {
            if (class206.field4035[class144.field2818[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class205.field3966);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method1186(byte arg0) {
        field3595++;
        if (arg0 > -84) {
            field3602 = null;
        }
        class134.field2576 = true;
        class82.field1515 = true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field3601 = null;
        field3605 = null;
        if (arg0 != -7093) {
            field3604 = null;
        }
        field3603 = null;
        field3590 = null;
        field3604 = null;
        field3602 = null;
        field3600 = null;
        field3599 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
    public static final void method1188(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class207.field4063 == arg1) {
            class204.field3951[class25.field387 / 100].method737(class13.field216 - 8, class4.field71 + -8);
        }
        field3588++;
        if (class207.field4063 == 2) {
            class204.field3951[class25.field387 / 100 + 4].method737(class13.field216 - 8, class4.field71 - 8);
        }
        class53.method289(arg1 ^ 0xFFFFF408);
        if (!class186.field3663) {
            return;
        }
        int var5 = arg0 + 512 - 5;
        int var6 = arg4 + 20;
        class26.field410.method1004(class203.method1321(new class93[] { class75.field1357, class67.method357((byte) -109, field3598) }, -97), var5, var6, 16776960, -1);
        Runtime var7 = Runtime.getRuntime();
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var9 = 16776960;
        if (var8 > 32768 && class82.field1515) {
            var9 = 16711680;
        }
        var6 += 15;
        if (var8 > 65536 && !class82.field1515) {
            var9 = 16711680;
        }
        class26.field410.method1004(class203.method1321(new class93[] { class77.field1383, class67.method357((byte) -116, var8), class115.field2161 }, -91), var5, var6, var9, -1);
        var6 += 15;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static final void method1189(byte arg0) {
        field3589++;
        if (!class121.field2241) {
            class100.field1841 = 1;
            class171.field3391[0] = class32.field530;
            class152.field2944[0] = 1003;
            class35.field575[0] = class43.field712;
        }
        if (class97.field1824 != -1) {
            class189.method1225(class97.field1824, (byte) -111);
        }
        for (int var1 = 0; var1 < class23.field357; var1++) {
            if (class203.field3927[var1]) {
                class88.field1600[var1] = true;
            }
            class151.field2934[var1] = class203.field3927[var1];
            class203.field3927[var1] = false;
        }
        class29.field482 = class21.field338;
        if (arg0 != -112) {
            method1186((byte) 124);
        }
        class29.field472 = null;
        class102.field1880 = -1;
        class64.field1023 = -1;
        if (class97.field1824 != -1) {
            class23.field357 = 0;
            class127.method720(0, 765, 0, -1, class97.field1824, 0, 0, 503, true);
        }
        class118.method661();
        class24.method139((byte) 29);
        if (class121.field2241) {
            class161.method1097((byte) 46);
        } else if (class102.field1880 != -1) {
            class200.method1311(117, class102.field1880, class64.field1023);
        }
        if (class144.field2797 == 3) {
            for (int var2 = 0; var2 < class23.field357; var2++) {
                if (class151.field2934[var2]) {
                    class118.method654(class136.field2645[var2], class36.field592[var2], class49.field783[var2], class64.field1024[var2], 16711935, 128);
                } else if (class88.field1600[var2]) {
                    class118.method654(class136.field2645[var2], class36.field592[var2], class49.field783[var2], class64.field1024[var2], 16711680, 128);
                }
            }
        }
        class159.method1088(class106.field1940.field2045, class114.field2145, class106.field1940.field2032, class24.field363, true);
        class24.field363 = 0;
    }
}
