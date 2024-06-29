import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class12 {

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public int field239 = -1;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[B")
    public static byte[] field219 = new byte[32896];

    @OriginalMember(owner = "client!se", name = "r", descriptor = "[I")
    public static int[] field236;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lia;")
    public static class257 field234;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lia;")
    public static class257 field238;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lia;")
    public static class257 field240;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZILd;)V")
    public static final void method126(int arg0, int arg1, boolean arg2, int arg3, class198 arg4) {
        field225++;
        if (class199.field3407 >= 400) {
            return;
        }
        if (arg4.field3393 != null) {
            arg4 = arg4.method1324((byte) 125);
        }
        if (arg4 == null || !arg4.field3374) {
            return;
        }
        if (!arg2) {
            method130((byte) 103);
        }
        class257 var5 = arg4.field3376;
        if (arg4.field3362 != 0) {
            var5 = class233.method1528(new class257[] { var5, class159.method1109(class137.field2441.field3115, 3, arg4.field3362), class104.field1942, class156.field2737, class111.method808(10, arg4.field3362), class79.field1550 }, 0);
        }
        if (class31.field611 == 1) {
            class62.field1275++;
            class95.method694(class233.method1528(new class257[] { class181.field3142, class106.field1961, var5 }, 0), class200.field3414, arg1, 27360, arg0, (short) 5, (long) arg3);
        } else if (!class257.field4404) {
            class140.field2484++;
            class257[] var6 = arg4.field3378;
            if (class41.field839) {
                var6 = class144.method977(29212, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class87.field1675 != 0 || !var6[var7].method1681((byte) 33, class117.field2103))) {
                        class186.field3225++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 1;
                        }
                        if (var7 == 1) {
                            var8 = 10;
                        }
                        if (var7 == 2) {
                            var8 = 22;
                        }
                        if (var7 == 3) {
                            var8 = 6;
                        }
                        if (var7 == 4) {
                            var8 = 8;
                        }
                        class95.method694(class233.method1528(new class257[] { class79.field1555, var5 }, 0), var6[var7], arg1, 27360, arg0, var8, (long) arg3);
                    }
                }
            }
            if (class87.field1675 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1681((byte) -111, class117.field2103)) {
                        class114.field2064++;
                        short var10 = 0;
                        if (class137.field2441.field3115 < arg4.field3362) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 1;
                        }
                        if (var9 == 1) {
                            var11 = 10;
                        }
                        if (var9 == 2) {
                            var11 = 22;
                        }
                        if (var9 == 3) {
                            var11 = 6;
                        }
                        if (var9 == 4) {
                            var11 = 8;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class95.method694(class233.method1528(new class257[] { class79.field1555, var5 }, 0), var6[var9], arg1, 27360, arg0, var11, (long) arg3);
                    }
                }
            }
            class95.method694(class233.method1528(new class257[] { class79.field1555, var5 }, 0), class92.field1753, arg1, 27360, arg0, (short) 1002, (long) arg3);
        } else if ((class76.field1491 & 0x2) == 2) {
            class95.method694(class233.method1528(new class257[] { class72.field1405, class106.field1961, var5 }, 0), class181.field3143, arg1, 27360, arg0, (short) 44, (long) arg3);
            class16.field346++;
            return;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZBI)V")
    public static final void method127(int arg0, boolean arg1, byte arg2, int arg3) {
        field231++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class102.field1899 = arg1;
        class134.field2399 = arg3;
        int var4 = 26 % ((24 - arg2) / 61);
        class229.field3857 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static final void method128(int arg0) {
        field227++;
        for (int var1 = -1; var1 < class231.field3880; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class132.field2362[var1];
            }
            class180 var3 = class55.field1180[var2];
            if (var3 != null) {
                class39.method318(128, var3, var3.field4128);
            }
        }
        if (arg0 != 2047) {
            field236 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lmb;IIIIZI)V")
    public static final void method129(class178 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class55.field1179 = arg3;
        if (arg1 >= -120) {
            field234 = null;
        }
        field229++;
        class196.field3316 = arg6;
        class178.field3086 = arg2;
        class19.field405 = arg5;
        class244.field4242 = 1;
        class252.field4334 = arg0;
        class89.field1707 = arg4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method130(byte arg0) {
        field219 = null;
        field238 = null;
        field236 = null;
        if (arg0 <= -109) {
            field234 = null;
            field240 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILk;)Lbj;")
    public static final class243 method131(int arg0, class152 arg1) {
        int var2 = 21 / ((arg0 + 33) / 42);
        field226++;
        return new class243(arg1.method1075(-7903), arg1.method1075(-7903), arg1.method1075(-7903), arg1.method1075(-7903), arg1.method1075(-7903), arg1.method1075(-7903), arg1.method1075(-7903), arg1.method1075(-7903), arg1.method1064((byte) -95), arg1.method1051((byte) -98));
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public static final void method132(int arg0, int arg1, int arg2) {
        field228++;
        long var3 = (long) ((arg1 << 16) + arg2);
        if (arg0 != 1351464912) {
            method130((byte) 6);
        }
        class137 var5 = (class137) class248.field4289.method434((byte) -93, var3);
        if (var5 != null) {
            class85.field1658.method994((byte) -42, var5);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field219[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field236 = new int[500];
        field234 = class28.method234(-13, "Versteckt");
        field238 = class28.method234(110, "cookieprefix");
        field235 = 99;
        field240 = class28.method234(90, "Angreifen");
    }
}
