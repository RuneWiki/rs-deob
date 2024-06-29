import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class112 {

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[I")
    public static int[] field1889 = new int[5];

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field1891 = 0;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[[I")
    public static int[][] field1900 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lve;")
    public static class255 field1899 = class87.method607(24, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[J")
    public static long[] field1893 = new long[32];

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Z")
    public static boolean field1902 = false;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lba;")
    public class156 field1890;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "[I")
    public int[] field1881;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[I")
    public int[] field1884;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "[I")
    public int[] field1886;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "[I")
    public int[] field1887;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "[I")
    public int[] field1894;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[I")
    public int[] field1903;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "[Lba;")
    public class156[] field1892;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[[I")
    public int[][] field1885;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[[I")
    public int[][] field1888;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lfi;)V", line = 13)
    public static final void method852(class250 arg0) {
        for (int var1 = arg0.field4212; var1 <= arg0.field4207; var1++) {
            for (int var2 = arg0.field4216; var2 <= arg0.field4208; var2++) {
                class249 var3 = class118.field1984[arg0.field4211][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4188; var4++) {
                        if (var3.field4182[var4] == arg0) {
                            var3.field4188--;
                            for (int var5 = var4; var5 < var3.field4188; var5++) {
                                var3.field4182[var5] = var3.field4182[var5 + 1];
                                var3.field4199[var5] = var3.field4199[var5 + 1];
                            }
                            var3.field4182[var3.field4188] = null;
                            break;
                        }
                    }
                    var3.field4194 = 0;
                    for (int var6 = 0; var6 < var3.field4188; var6++) {
                        var3.field4194 |= var3.field4199[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 76)
    public static void method853(byte arg0) {
        field1900 = (int[][]) null;
        field1893 = null;
        field1899 = null;
        field1889 = null;
        if (arg0 != 71) {
            field1893 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([BI)V", line = 91)
    private final void method854(byte[] arg0, int arg1) {
        class70 var3 = new class70(class64.method386(arg0, arg1 - 385));
        field1895++;
        int var4 = var3.method481(0);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = -1;
        int var6 = 0;
        if (var4 < 6) {
            this.field1898 = 0;
        } else {
            this.field1898 = var3.method469(104);
        }
        int var7 = var3.method481(0);
        this.field1896 = var3.method423(arg1 - 129);
        this.field1887 = new int[this.field1896];
        for (int var8 = 0; var8 < this.field1896; var8++) {
            this.field1887[var8] = var6 += var3.method423(class127.method943(arg1, 383));
            if (var5 < this.field1887[var8]) {
                var5 = this.field1887[var8];
            }
        }
        this.field1883 = var5 + 1;
        this.field1886 = new int[this.field1883];
        this.field1885 = new int[this.field1883][];
        this.field1894 = new int[this.field1883];
        this.field1884 = new int[this.field1883];
        this.field1881 = new int[this.field1883];
        if (var7 != 0) {
            this.field1903 = new int[this.field1883];
            for (int var9 = 0; var9 < this.field1883; var9++) {
                this.field1903[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1896; var10++) {
                this.field1903[this.field1887[var10]] = var3.method469(94);
            }
            this.field1890 = new class156(this.field1903);
        }
        for (int var11 = 0; var11 < this.field1896; var11++) {
            this.field1894[this.field1887[var11]] = var3.method469(123);
        }
        if (arg1 != 384) {
            return;
        }
        for (int var12 = 0; var12 < this.field1896; var12++) {
            this.field1886[this.field1887[var12]] = var3.method469(99);
        }
        for (int var13 = 0; var13 < this.field1896; var13++) {
            this.field1881[this.field1887[var13]] = var3.method423(255);
        }
        for (int var14 = 0; var14 < this.field1896; var14++) {
            int var15 = 0;
            int var16 = this.field1887[var14];
            int var17 = -1;
            int var18 = this.field1881[var16];
            this.field1885[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field1885[var16][var19] = var15 += var3.method423(255);
                if (var20 > var17) {
                    var17 = var20;
                }
            }
            this.field1884[var16] = var17 + 1;
            if ((var17 + 1) == var18) {
                this.field1885[var16] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field1888 = new int[var5 + 1][];
        this.field1892 = new class156[var5 + 1];
        for (int var21 = 0; var21 < this.field1896; var21++) {
            int var22 = this.field1887[var21];
            int var23 = this.field1881[var22];
            this.field1888[var22] = new int[this.field1884[var22]];
            for (int var24 = 0; var24 < this.field1884[var22]; var24++) {
                this.field1888[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field1885[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field1885[var22][var25];
                }
                this.field1888[var22][var26] = var3.method469(90);
            }
            this.field1892[var22] = new class156(this.field1888[var22]);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 264)
    public static final void method855(int arg0) {
        if (arg0 != 640) {
            field1899 = (class255) null;
        }
        class115.field1954 = null;
        class275.field4733 = null;
        class15.field220 = null;
        class24.field368 = null;
        class271.field4681 = null;
        class59.field899 = null;
        class314.field5317 = null;
        field1880++;
        class102.field1719 = null;
        class7.field103 = null;
        class194.field3200 = null;
        class187.field3007 = null;
        class6.field82 = null;
        class277.field4761 = null;
        class172.field2847 = null;
        class43.field671 = null;
        class276.field4735 = null;
        class60.field928 = null;
        class37.field569 = null;
        class252.field4245 = null;
        class81.field1313 = null;
        class44.field681 = null;
        class127.field2095 = null;
        class59.field894 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILme;IJZ)Z", line = 300)
    public static final boolean method856(int arg0, int arg1, int arg2, int arg3, int arg4, class177 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class314.method2166(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 355)
    public static final void method857(int arg0) {
        field1882++;
        if (!class42.field653) {
            return;
        }
        class197 var1 = class91.method685(class168.field2823, (byte) -109, class46.field694);
        if (arg0 != -7) {
            field1893 = (long[]) null;
        }
        if (var1 != null && var1.field3293 != null) {
            class26 var2 = new class26();
            var2.field424 = var1;
            var2.field414 = var1.field3293;
            class114.method873(-112, var2);
        }
        class42.field653 = false;
        class108.method834((byte) 49, var1);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "([BI)V", line = 401)
    public class112(byte[] arg0, int arg1) {
        this.field1897 = class160.method1165(arg0, arg0.length, (byte) -68);
        if (this.field1897 != arg1) {
            throw new RuntimeException();
        }
        this.method854(arg0, 384);
    }
}
