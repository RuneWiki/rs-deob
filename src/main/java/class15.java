import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 extends class129 {

    @OriginalMember(owner = "client!cb", name = "pb", descriptor = "I")
    private int field285 = 0;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "Lmc;")
    private static class75 field265 = class30.method234(true, "Friends");

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "Lmc;")
    public static class75 field272 = class30.method234(true, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!cb", name = "nb", descriptor = "Z")
    public static boolean field283 = false;

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "[[[I")
    public static int[][][] field280 = new int[4][105][105];

    @OriginalMember(owner = "client!cb", name = "sb", descriptor = "Lmc;")
    private static class75 field288 = class30.method234(true, "Hide");

    @OriginalMember(owner = "client!cb", name = "mb", descriptor = "Lmc;")
    public static class75 field282 = field288;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "Lmc;")
    public static class75 field279 = class30.method234(true, " )2> @whi@");

    @OriginalMember(owner = "client!cb", name = "tb", descriptor = "[I")
    public static int[] field289 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "Lmc;")
    public static class75 field273 = field265;

    @OriginalMember(owner = "client!cb", name = "rb", descriptor = "Lmc;")
    private static class75 field287 = class30.method234(true, "Loading friend list");

    @OriginalMember(owner = "client!cb", name = "ob", descriptor = "Lmc;")
    public static class75 field284 = field287;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "Lmc;")
    private static class75 field277 = class30.method234(true, "Loading game screen )2 ");

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "Lmc;")
    public static class75 field264 = field277;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!cb", name = "qb", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!cb", name = "ub", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!cb", name = "vb", descriptor = "I")
    public static int field291;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cb", name = "wb", descriptor = "Ljava/lang/Class;")
    public static Class field292;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "[I")
    public static int[] field267;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method104(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)V", line = 7)
    public static final void method94(int arg0, int arg1) {
        field266++;
        class78.field1970 += arg0;
        while (class10.field221 <= class78.field1970) {
            class78.field1970 -= class10.field221;
            class45.field1098 -= class45.field1098 >> 2;
        }
        class45.field1098 -= arg0 * 1000;
        if (arg1 != 3) {
            field267 = null;
        }
        if (class45.field1098 < 0) {
            class45.field1098 = 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lka;IZ)V", line = 34)
    public final void method95(class61 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field280 = null;
        }
        while (true) {
            int var4 = arg0.method494(20471);
            if (var4 == 0) {
                field268++;
                return;
            }
            this.method96(arg1, var4, 4771, arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILka;)V", line = 56)
    private final void method96(int arg0, int arg1, int arg2, class61 arg3) {
        if (arg2 != 4771) {
            field279 = null;
        }
        if (arg1 == 1) {
            this.field285 = arg3.method510(-75);
        }
        field271++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLib;)V", line = 74)
    public static final void method97(int arg0, byte arg1, class50 arg2) {
        int var3 = -69 % ((arg1 + 37) / 37);
        field274++;
        if (arg2.field1233 < 128 || arg2.field1242 < 128 || arg2.field1233 >= 13184 || arg2.field1242 >= 13184) {
            arg2.field1216 = -1;
            arg2.field1247 = 0;
            arg2.field1200 = 0;
            arg2.field1265 = -1;
            arg2.field1233 = arg2.field1270[0] * 128 + arg2.field1263 * 64;
            arg2.field1242 = arg2.field1236[0] * 128 + arg2.field1263 * 64;
            arg2.method393(207);
        }
        if (class52.field1315 == arg2 && (arg2.field1233 < 1536 || arg2.field1242 < 1536 || arg2.field1233 >= 11776 || arg2.field1242 >= 11776)) {
            arg2.field1265 = -1;
            arg2.field1200 = 0;
            arg2.field1216 = -1;
            arg2.field1247 = 0;
            arg2.field1233 = arg2.field1270[0] * 128 + arg2.field1263 * 64;
            arg2.field1242 = arg2.field1236[0] * 128 + arg2.field1263 * 64;
            arg2.method393(207);
        }
        if (class34.field781 < arg2.field1200) {
            class58.method466(arg2, -116);
        } else if (class34.field781 > arg2.field1247) {
            class45.method344(arg2, (byte) -53);
        } else {
            class34.method273(arg2, 256);
        }
        class17.method114(arg2, -55);
        class74.method615((byte) 126, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)I", line = 127)
    public static final int method98(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field290++;
            long var3 = (long) ((arg2 << 16) + arg1);
            return class7.field112 != null && class7.field112.field1765 == var3 ? class109.field2764.field1556 * 99 / (class109.field2764.field1577.length - class7.field112.field2611) + 1 : 0;
        } else {
            return 71;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V", line = 149)
    public static final void method99(int arg0) {
        field262++;
        if (class52.field1321 == null) {
            return;
        }
        long var1 = System.currentTimeMillis();
        if (class31.field701 >= var1) {
            return;
        }
        class52.field1321.method296(var1);
        int var3 = (int) (var1 - class31.field701);
        class31.field701 = var1;
        synchronized (field292 == null ? (field292 = method104("ga")) : field292) {
            class45.field1098 += class10.field221 * var3;
            int var5 = (class45.field1098 - class10.field221 * 2000) / arg0;
            if (var5 > 0) {
                if (class64.field1699 != null) {
                    class64.field1699.method738(var5);
                }
                class45.field1098 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V", line = 198)
    private final void method100(int arg0, byte arg1) {
        double var3 = (double) (arg0 & 0xFF) / 256.0D;
        field275++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        if (var7 > var5) {
            var9 = var5;
        }
        double var11 = var7;
        double var13 = 0.0D;
        if (var7 < var5) {
            var11 = var5;
        }
        if (var3 < var9) {
            var9 = var3;
        }
        if (var3 > var11) {
            var11 = var3;
        }
        if (arg1 <= 111) {
            this.method95(null, -47, false);
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var7 == var11) {
                var13 = (var5 - var3) / (-var9 + var11);
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 2.0D;
            } else if (var3 == var11) {
                var13 = (var7 - var5) / (-var9 + var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field269 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field269 = (int) (var15 * var17 * 512.0D);
        }
        this.field281 = (int) (var15 * 256.0D);
        if (this.field269 < 1) {
            this.field269 = 1;
        }
        this.field263 = (int) (var17 * 256.0D);
        if (this.field263 < 0) {
            this.field263 = 0;
        } else if (this.field263 > 255) {
            this.field263 = 255;
        }
        double var19 = var13 / 6.0D;
        if (this.field281 < 0) {
            this.field281 = 0;
        } else if (this.field281 > 255) {
            this.field281 = 255;
        }
        this.field278 = (int) ((double) this.field269 * var19);
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V", line = 291)
    public final void method101(int arg0) {
        field276++;
        this.method100(this.field285, (byte) 116);
        if (arg0 > -41) {
            method102((byte) -109);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 306)
    public static final void method102(byte arg0) {
        class112.field2842++;
        class86.method718(true, true);
        class21.method144(true, true);
        class86.method718(true, false);
        field291++;
        class21.method144(true, false);
        class104.method861(101);
        class8.method39(false);
        if (!class129.field3152) {
            int var1 = class84.field2067 + class43.field1025 & 0x7FF;
            int var2 = class75.field1867;
            if (class55.field1402 / 256 > var2) {
                var2 = class55.field1402 / 256;
            }
            if (class40.field965[4] && class59.field1494[4] + 128 > var2) {
                var2 = class59.field1494[4] + 128;
            }
            class91.method758(var2, class129.field3145, class126.field3075, var1, 71, var2 * 3 + 600, class126.method1000(class52.field1315.field1242, class99.field2510, false, class52.field1315.field1233) + -50);
        }
        int var3;
        if (class129.field3152) {
            var3 = class114.method920(3);
        } else {
            var3 = class36.method282(-10370);
        }
        int var4 = class84.field2082;
        int var5 = class44.field1057;
        int var6 = class12.field235;
        int var7 = class37.field889;
        int var8 = class111.field2809;
        int var9 = -4 % ((55 - arg0) / 33);
        for (int var10 = 0; var10 < 5; var10++) {
            if (class40.field965[var10]) {
                int var11 = (int) ((double) -class55.field1410[var10] + (double) (class55.field1410[var10] * 2 + 1) * Math.random() + Math.sin((double) class42.field1011[var10] / 100.0D * (double) class64.field1702[var10]) * (double) class59.field1494[var10]);
                if (var10 == 2) {
                    class44.field1057 += var11;
                }
                if (var10 == 3) {
                    class111.field2809 = class111.field2809 + var11 & 0x7FF;
                }
                if (var10 == 1) {
                    class12.field235 += var11;
                }
                if (var10 == 4) {
                    class37.field889 += var11;
                    if (class37.field889 < 128) {
                        class37.field889 = 128;
                    }
                    if (class37.field889 > 383) {
                        class37.field889 = 383;
                    }
                }
                if (var10 == 0) {
                    class84.field2082 += var11;
                }
            }
        }
        class8.method46(-1);
        class93.field2334 = true;
        class93.field2341 = class45.field1104 - 4;
        class93.field2344 = class90.field2200 - 4;
        class93.field2353 = 0;
        class66.method575();
        class107.field2679.method182(class84.field2082, class12.field235, class44.field1057, class37.field889, class111.field2809, var3);
        class107.field2679.method197();
        class52.method401((byte) -116);
        class90.method744((byte) -43);
        ((class16) class49.field1192).method107(class71.field1802, false);
        class5.method26(0);
        if (class41.field994 && class70.method595(true, false, 0) == 0) {
            class41.field994 = false;
        }
        if (class41.field994) {
            class8.method46(-1);
            class66.method575();
            class26.method173(false, null, 126, class7.field96);
        }
        class85.method704(20427);
        class84.field2082 = var4;
        class111.field2809 = var8;
        class44.field1057 = var5;
        class12.field235 = var6;
        class37.field889 = var7;
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V", line = 452)
    public static void method103(int arg0) {
        field267 = null;
        field284 = null;
        field282 = null;
        field280 = null;
        if (arg0 >= -7) {
            method98(-92, -66, -44);
        }
        field273 = null;
        field287 = null;
        field272 = null;
        field289 = null;
        field279 = null;
        field265 = null;
        field288 = null;
        field277 = null;
        field264 = null;
    }
}
