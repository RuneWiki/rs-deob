import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class115 {

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Luc;")
    private class39 field1868 = new class39(256);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Luc;")
    private class39 field1876 = new class39(256);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lhc;")
    private class235 field1873;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lhc;")
    private class235 field1866;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[S")
    public static short[] field1871 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Loh;")
    public static class281 field1872 = new class281(64);

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "Z")
    public static boolean field1878 = false;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "[I")
    public static int[] field1879 = new int[100];

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1882 = "Started 3d Library";

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Z")
    public static boolean field1877 = true;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field1883 = 0;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "[I")
    public static int[] field1881 = new int[1000];

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Lhc;")
    public static class235 field1880;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[II)Lah;")
    private final class285 method809(int arg0, int arg1, int[] arg2, int arg3) {
        field1863++;
        int var5 = -122 % ((arg1 + 13) / 58);
        int var6 = (arg3 << 4 & 0xFFFC | arg3 >>> 12) ^ arg0;
        int var7 = var6 | arg3 << 16;
        long var8 = (long) var7;
        class285 var10 = (class285) this.field1876.method285(var8, 13821);
        if (var10 != null) {
            return var10;
        } else if (arg2 == null || arg2[0] > 0) {
            class92 var11 = class92.method699(this.field1873, arg3, arg0);
            if (var11 == null) {
                return null;
            }
            class285 var12 = var11.method698();
            this.field1876.method281(1, var8, var12);
            if (arg2 != null) {
                arg2[0] -= var12.field4512.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static final void method810(int arg0) {
        class82.method591(class205.field3205, false);
        field1865++;
        class187.field2898++;
        if (class163.field2567 && class71.field1148) {
            int var1 = class79.field1323;
            int var2 = field1883;
            int var3 = var1 - class280.field4427;
            if (arg0 != 1) {
                field1872 = null;
            }
            if (class142.field2165 > var3) {
                var3 = class142.field2165;
            }
            if ((class142.field2165 + class78.field1293.field3574) < (class205.field3205.field3574 + var3)) {
                var3 = class142.field2165 + class78.field1293.field3574 - class205.field3205.field3574;
            }
            int var4 = var2 - class180.field2805;
            if (var4 < class237.field3844) {
                var4 = class237.field3844;
            }
            int var5 = var3 - class145.field2303;
            if ((class237.field3844 + class78.field1293.field3625) < (class205.field3205.field3625 + var4)) {
                var4 = class237.field3844 + class78.field1293.field3625 - class205.field3205.field3625;
            }
            int var6 = var4 - class168.field2629;
            int var7 = class78.field1293.field3606 + var3 - class142.field2165;
            int var8 = class205.field3205.field3492;
            if (class187.field2898 > class205.field3205.field3501 && (var5 > var8 || (-var8) > var5 || var8 < var6 || -var8 > var6)) {
                class37.field530 = true;
            }
            int var9 = var4 + class78.field1293.field3523 - class237.field3844;
            if (class205.field3205.field3645 != null && class37.field530) {
                class116 var10 = new class116();
                var10.field1884 = var9;
                var10.field1895 = class205.field3205.field3645;
                var10.field1892 = class205.field3205;
                var10.field1888 = var7;
                class44.method322(var10, 200000);
            }
            if (class160.field2485 == 0) {
                if (class37.field530) {
                    if (class205.field3205.field3529 != null) {
                        class116 var11 = new class116();
                        var11.field1892 = class205.field3205;
                        var11.field1895 = class205.field3205.field3529;
                        var11.field1888 = var7;
                        var11.field1884 = var9;
                        var11.field1885 = class278.field4421;
                        class44.method322(var11, arg0 + 199999);
                    }
                    if (class278.field4421 != null && client.method1047(class205.field3205) != null) {
                        client.field2435.method536((byte) -104, 66);
                        class281.field4434++;
                        client.field2435.method678(class278.field4421.field3480, true);
                        client.field2435.method681(arg0 ^ 0x2, class205.field3205.field3480);
                        client.field2435.method663(class205.field3205.field3551, 124);
                        client.field2435.method634(class278.field4421.field3551, arg0 ^ 0x5F);
                    }
                } else if ((class37.field524 == 1 || class173.method1177(class128.field2018 - 1, (byte) -123)) && class128.field2018 > 2) {
                    class180.method1220((byte) -82);
                } else if (class128.field2018 > 0) {
                    class93.method704(0);
                }
                class205.field3205 = null;
            }
        } else if (class187.field2898 > 1) {
            class205.field3205 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[I)Lah;")
    public final class285 method811(int arg0, int arg1, int[] arg2) {
        field1861++;
        if (this.field1866.method1618(arg0 ^ arg0) == 1) {
            return this.method816(arg1, arg2, 0, arg0);
        } else if (this.field1866.method1616(arg1, -12772) == 1) {
            return this.method816(0, arg2, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([III)Lah;")
    public final class285 method812(int[] arg0, int arg1, int arg2) {
        field1867++;
        if (this.field1873.method1618(0) == 1) {
            return this.method809(arg1, -73, arg0, 0);
        } else if (this.field1873.method1616(arg1, arg2 ^ 0x7DB7) == 1) {
            return this.method809(0, -116, arg0, arg1);
        } else {
            if (arg2 != -19541) {
                field1880 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static void method813(int arg0) {
        field1882 = null;
        field1879 = null;
        field1881 = null;
        field1880 = null;
        field1871 = null;
        field1872 = null;
        if (arg0 != 2846) {
            field1871 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Z")
    public static final boolean method814(int arg0) {
        field1862++;
        if (class174.field2741) {
            try {
                if ((Boolean) class215.method1453(class179.field2788.field479, 126, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 > -69) {
            field1882 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public static final void method815(int arg0) {
        class167.field2617.method1898((byte) 87);
        field1869++;
        if (arg0 >= 56) {
            class150.field2361.method1898((byte) -117);
            class268.field4281.method1898((byte) -98);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[III)Lah;")
    private final class285 method816(int arg0, int[] arg1, int arg2, int arg3) {
        field1864++;
        int var5 = (arg2 >>> 12 | (arg2 & 0x70000FFF) << 4) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class285 var9 = (class285) this.field1876.method285(var7, 13821);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class172 var10 = (class172) this.field1868.method285(var7, 13821);
            if (var10 == null) {
                var10 = class172.method1166(this.field1866, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field1868.method281(1, var7, var10);
            }
            class285 var11 = var10.method1162(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1123(arg3);
                this.field1876.method281(1, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
    public static final void method817(int arg0) {
        class161.field2510 = -1;
        class256.field4091 = -1;
        class47.field687 = false;
        class133.field2086 = 0;
        class66.field1105 = -1;
        class128.field2018 = 0;
        field1875++;
        class283.field4463 = 0;
        class52.field761 = -1;
        class53.field806 = 0;
        client.field2435.field1535 = 0;
        class53.field804 = 0;
        class167.field2620 = 0;
        class236.field3814.field1535 = 0;
        for (int var1 = 0; var1 < class210.field3267.length; var1++) {
            if (class210.field3267[var1] != null) {
                class210.field3267[var1].field2223 = -1;
            }
        }
        for (int var2 = 0; var2 < class255.field4082.length; var2++) {
            if (class255.field4082[var2] != null) {
                class255.field4082[var2].field2223 = -1;
            }
        }
        class160.method1082((byte) 116);
        class259.field4130 = 1;
        client.method1042(false, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class25.field335[var3] = true;
        }
        if (arg0 <= 1) {
            field1878 = false;
        }
        class41.method299((byte) -10);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg5 & 0x3;
        field1874++;
        if (var8 == 0) {
            return arg3;
        }
        if (arg2 > -30) {
            method813(35);
        }
        if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 1 - (arg1 + arg3 - 7);
        } else {
            return 8 - arg4 - arg0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lhc;Lhc;)V")
    public class115(class235 arg0, class235 arg1) {
        this.field1873 = arg0;
        this.field1866 = arg1;
    }
}
