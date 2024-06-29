import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class265 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lqd;")
    public static class40 field4440 = class147.method1106("", (byte) -89);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lqd;")
    private static class40 field4439 = class147.method1106("Please wait )2 attempting to reestablish)3", (byte) -84);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lqd;")
    public static class40 field4435 = field4439;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lhi;")
    public static class282 field4445 = new class282();

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field4448 = 0;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field4447 = 0;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4449 = 0;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lqd;")
    public static class40 field4450 = class147.method1106("Mem:", (byte) -118);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "[S")
    public static short[] field4446;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[[B")
    public static byte[][] field4436;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[[B")
    public static byte[][] field4438;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZIII)V", line = 12)
    public static final void method1853(boolean arg0, int arg1, int arg2, int arg3) {
        field4444++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class25.field448 = arg1;
        class243.field4014 = arg3;
        class292.field4890 = arg0;
        if (arg2 != -587) {
            field4438 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I", line = 36)
    public static final int method1854(int arg0, int arg1) {
        field4442++;
        int var2 = arg0 & 0x3F;
        int var3 = -46 / ((arg1 - 19) / 37);
        int var4 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 85)
    public static void method1855(int arg0) {
        field4436 = (byte[][]) null;
        field4435 = null;
        field4439 = null;
        field4446 = null;
        if (arg0 != 2) {
            field4438 = (byte[][]) ((byte[][]) null);
        }
        field4438 = (byte[][]) null;
        field4440 = null;
        field4445 = null;
        field4450 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lke;I)[Log;", line = 105)
    public static final class197[] method1856(class107 arg0, int arg1) {
        if (arg1 != 4) {
            return (class197[]) null;
        }
        field4441++;
        if (!arg0.method801(1)) {
            return new class197[0];
        }
        class70 var2 = arg0.method804((byte) -118);
        while (var2.field1258 == 0) {
            class160.method1227(10L, false);
        }
        if (var2.field1258 == 2) {
            return new class197[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field1260);
        class197[] var4 = new class197[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class197 var6 = new class197();
            var4[var5] = var6;
            var6.field3162 = var3[var5 << 2];
            var6.field3163 = var3[(var5 << 2) + 1];
            var6.field3158 = var3[(var5 << 2) + 2];
            var6.field3165 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 159)
    public static final void method1857(boolean arg0) {
        class25.method188(0, class28.field596);
        field4443++;
        class293.field4930++;
        if (class163.field2714 && class49.field952) {
            int var1 = class48.field936;
            int var2 = var1 - class19.field313;
            if (var2 < class89.field1603) {
                var2 = class89.field1603;
            }
            if ((class89.field1603 + class6.field89.field3502) < (class28.field596.field3502 + var2)) {
                var2 = class6.field89.field3502 + class89.field1603 - class28.field596.field3502;
            }
            int var3 = class46.field893;
            int var4 = var3 - class225.field3722;
            int var5 = var2 - class151.field2528;
            if (var4 < class149.field2505) {
                var4 = class149.field2505;
            }
            int var6 = class28.field596.field3467;
            if (arg0) {
                if ((class28.field596.field3565 + var4) > (class149.field2505 + class6.field89.field3565)) {
                    var4 = class149.field2505 + class6.field89.field3565 - class28.field596.field3565;
                }
                int var7 = var4 - class169.field2784;
                int var8 = class6.field89.field3530 + var2 - class89.field1603;
                if (class28.field596.field3488 < class293.field4930 && (var6 < var5 || -var6 > var5 || var6 < var7 || var7 < (-var6))) {
                    class285.field4808 = true;
                }
                int var9 = class6.field89.field3583 + var4 - class149.field2505;
                if (class28.field596.field3552 != null && class285.field4808) {
                    class109 var10 = new class109();
                    var10.field1910 = class28.field596;
                    var10.field1900 = var8;
                    var10.field1904 = var9;
                    var10.field1908 = class28.field596.field3552;
                    class121.method912(var10, -121);
                }
                if (class244.field4030 == 0) {
                    if (class285.field4808) {
                        if (class28.field596.field3500 != null) {
                            class109 var11 = new class109();
                            var11.field1900 = var8;
                            var11.field1902 = class93.field1687;
                            var11.field1908 = class28.field596.field3500;
                            var11.field1904 = var9;
                            var11.field1910 = class28.field596;
                            class121.method912(var11, 96);
                        }
                        if (class93.field1687 != null && client.method1732(class28.field596) != null) {
                            class284.field4767++;
                            class19.field295.method1464(171, 0);
                            class19.field295.method221(class93.field1687.field3507, 255);
                            class19.field295.method200(class28.field596.field3507, (byte) -80);
                            class19.field295.method209(16711680, class93.field1687.field3494);
                            class19.field295.method202(class28.field596.field3494, 49);
                        }
                    } else if ((class246.field4073 == 1 || class73.method545(class255.field4252 - 1, -123)) && class255.field4252 > 2) {
                        class308.method2107((byte) 77);
                    } else if (class255.field4252 > 0) {
                        class26.method219(87);
                    }
                    class28.field596 = null;
                }
            }
        } else if (class293.field4930 > 1) {
            class28.field596 = null;
        }
    }
}
