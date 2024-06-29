import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class145 {

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "Z")
    public boolean field347 = false;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "[S")
    private short[] field354 = new short[6];

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "I")
    public int field361 = -1;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "[I")
    private int[] field362 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "[S")
    private short[] field365 = new short[6];

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    public static int field355 = -1;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public static int field359 = 2301979;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "Ltd;")
    public static class136 field357 = class145.method1172(" ", 45);

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
    public static int field360 = 0;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "Ltd;")
    public static class136 field353 = class145.method1172("huffman", 45);

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "Lc;")
    public static class15 field363 = new class15(8);

    @OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
    public static int field368 = 0;

    @OriginalMember(owner = "client!cc", name = "rb", descriptor = "I")
    public static int field369 = 0;

    @OriginalMember(owner = "client!cc", name = "sb", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!cc", name = "tb", descriptor = "[I")
    public static int[] field371 = new int[2000];

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "Lld;")
    public static class80 field367;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "Z")
    public static boolean field350;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "[I")
    private int[] field349;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Z")
    public final boolean method124(int arg0) {
        field352++;
        if (this.field349 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field349.length; var3++) {
            if (!class63.field1359.method647(arg0, 0, this.field349[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)Z")
    public final boolean method125(byte arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field362[var3] != -1 && !class63.field1359.method647(0, 0, this.field362[var3])) {
                var2 = false;
            }
        }
        field366++;
        if (arg0 > -107) {
            return false;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)Lsa;")
    public final class126 method126(byte arg0) {
        class126[] var2 = new class126[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field362[var4] != -1) {
                var2[var3++] = class126.method974(class63.field1359, this.field362[var4], 0);
            }
        }
        if (arg0 != -16) {
            this.field347 = true;
        }
        class126 var5 = new class126(var2, var3);
        field356++;
        for (int var6 = 0; var6 < 6 && this.field354[var6] != 0; var6++) {
            var5.method973(this.field354[var6], this.field365[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIB)I")
    public static final int method127(int arg0, int arg1, int arg2, byte arg3) {
        field358++;
        if (arg3 >= -107) {
            return -109;
        } else {
            int var4 = 256 - arg2;
            return ((arg1 & 0xFF00FF) * var4 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lsb;I)V")
    public final void method128(class127 arg0, int arg1) {
        field351++;
        while (true) {
            int var3 = arg0.method1011(105);
            if (var3 == 0) {
                int var4 = -58 / ((-arg1 - 73) / 37);
                return;
            }
            this.method130(var3, arg0, -128);
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public static void method129(int arg0) {
        field367 = null;
        if (arg0 != 2974) {
            method127(-34, -84, -45, (byte) -95);
        }
        field371 = null;
        field357 = null;
        field353 = null;
        field363 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILsb;I)V")
    private final void method130(int arg0, class127 arg1, int arg2) {
        if (arg2 >= -56) {
            return;
        }
        if (arg0 == 1) {
            this.field361 = arg1.method1011(36);
        } else if (arg0 == 2) {
            int var4 = arg1.method1011(74);
            this.field349 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field349[var5] = arg1.method1020(false);
            }
        } else if (arg0 == 3) {
            this.field347 = true;
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field354[arg0 - 40] = (short) arg1.method1020(false);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field365[arg0 - 50] = (short) arg1.method1020(false);
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field362[arg0 - 60] = arg1.method1020(false);
        }
        field346++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIII)V")
    public static final void method131(boolean arg0, int arg1, int arg2, int arg3) {
        class21.method155(110);
        class114.method902(arg1, arg3, arg1 + class35.field806.field2170, class35.field806.field2163 + arg3);
        field364++;
        if (class147.field3416 == 2 || class147.field3416 == 5) {
            class114.method894(arg1 + 25, arg3 + 5, 0, class71.field1491, class91.field2157);
        } else {
            int var4 = class151.field3467 + class141.field3269 & 0x7FF;
            int var5 = 464 - class24.field555.field3578 / 32;
            int var6 = class24.field555.field3580 / 32 + 48;
            class124.field2886.method64(arg1 + 25, arg3 + 5, 146, 151, var6, var5, var4, class109.field2572 + 256, class71.field1491, class91.field2157);
            for (int var7 = 0; var7 < class106.field2502; var7++) {
                int var37 = class55.field1258[var7] * 4 + 2 - class24.field555.field3580 / 32;
                int var38 = class80.field1894[var7] * 4 + 2 - class24.field555.field3578 / 32;
                class24.method213(class106.field2500[var7], arg1, !arg0, var38, var37, arg3);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class69 var34 = class93.field2197[class62.field1331][var8][var33];
                    if (var34 != null) {
                        int var35 = var33 * 4 + 2 - class24.field555.field3578 / 32;
                        int var36 = var8 * 4 + 2 - class24.field555.field3580 / 32;
                        class24.method213(class88.field2084[0], arg1, false, var35, var36, arg3);
                    }
                }
            }
            for (int var9 = 0; var9 < class51.field1145; var9++) {
                class67 var29 = class122.field2846[class139.field3237[var9]];
                if (var29 != null && var29.method91(107)) {
                    class96 var30 = var29.field1428;
                    if (var30 != null && var30.field2258 != null) {
                        var30 = var30.method732((byte) -114);
                    }
                    if (var30 != null && var30.field2286 && var30.field2270) {
                        int var31 = var29.field3580 / 32 - class24.field555.field3580 / 32;
                        int var32 = var29.field3578 / 32 - class24.field555.field3578 / 32;
                        class24.method213(class88.field2084[1], arg1, false, var32, var31, arg3);
                    }
                }
            }
            for (int var10 = 0; var10 < class55.field1255; var10++) {
                class13 var21 = class154.field3518[class24.field564[var10]];
                if (var21 != null && var21.method91(72)) {
                    int var22 = var21.field3580 / 32 - class24.field555.field3580 / 32;
                    int var23 = var21.field3578 / 32 - class24.field555.field3578 / 32;
                    boolean var24 = false;
                    long var25 = var21.field249.method1117(118);
                    for (int var27 = 0; var27 < class1.field14; var27++) {
                        if (class11.field196[var27] == var25 && class61.field1297[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class24.field555.field252 != 0 && var21.field252 != 0 && class24.field555.field252 == var21.field252) {
                        var28 = true;
                    }
                    if (var24) {
                        class24.method213(class88.field2084[3], arg1, false, var23, var22, arg3);
                    } else if (var28) {
                        class24.method213(class88.field2084[4], arg1, !arg0, var23, var22, arg3);
                    } else {
                        class24.method213(class88.field2084[2], arg1, false, var23, var22, arg3);
                    }
                }
            }
            if (class153.field3494 != 0 && class44.field1013 % 20 < 10) {
                if (class153.field3494 == 1 && class93.field2191 >= 0 && class93.field2191 < class122.field2846.length) {
                    class67 var11 = class122.field2846[class93.field2191];
                    if (var11 != null) {
                        int var12 = var11.field3580 / 32 - class24.field555.field3580 / 32;
                        int var13 = var11.field3578 / 32 - class24.field555.field3578 / 32;
                        class15.method110(var12, var13, class84.field1985[1], arg1, arg3, (byte) -123);
                    }
                }
                if (class153.field3494 == 2) {
                    int var14 = (class52.field1172 - class91.field2145) * 4 + 2 - class24.field555.field3580 / 32;
                    int var15 = (class81.field1938 - class52.field1176) * 4 + 2 - class24.field555.field3578 / 32;
                    class15.method110(var14, var15, class84.field1985[1], arg1, arg3, (byte) -96);
                }
                if (class153.field3494 == 10 && class77.field1743 >= 0 && class77.field1743 < class154.field3518.length) {
                    class13 var16 = class154.field3518[class77.field1743];
                    if (var16 != null) {
                        int var17 = var16.field3580 / 32 - class24.field555.field3580 / 32;
                        int var18 = var16.field3578 / 32 - class24.field555.field3578 / 32;
                        class15.method110(var17, var18, class84.field1985[1], arg1, arg3, (byte) -83);
                    }
                }
            }
            if (field369 != 0) {
                int var19 = class108.field2554 * 4 + 2 - class24.field555.field3578 / 32;
                int var20 = field369 * 4 + 2 - class24.field555.field3580 / 32;
                class24.method213(class84.field1985[0], arg1, false, var19, var20, arg3);
            }
            class114.method891(arg1 + 93 + 4, arg3 - 4 + 82, 3, 3, 16777215);
        }
        if (class147.field3416 >= 3) {
            class114.method894(arg1, arg3, 0, class24.field570, class53.field1180);
        } else {
            class73.field1530.method64(arg1, arg3, 33, 33, 25, 25, class151.field3467, 256, class24.field570, class53.field1180);
        }
        if (class94.field2206[arg2]) {
            class35.field806.method693(arg1, arg3);
        }
        class38.field879[arg2] = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)Lsa;")
    public final class126 method132(int arg0) {
        field348++;
        if (this.field349 == null) {
            return null;
        }
        if (arg0 != 32) {
            field371 = null;
        }
        class126[] var2 = new class126[this.field349.length];
        for (int var3 = 0; var3 < this.field349.length; var3++) {
            var2[var3] = class126.method974(class63.field1359, this.field349[var3], 0);
        }
        class126 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class126(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field354[var5] != 0; var5++) {
            var4.method973(this.field354[var5], this.field365[var5]);
        }
        return var4;
    }
}
