import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class141 {

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lmj;")
    private class144 field2344 = new class144(256);

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lmj;")
    private class144 field2353 = new class144(256);

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lsb;")
    private class124 field2348;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lsb;")
    private class124 field2349;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
    public static boolean field2343 = false;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[Lml;")
    public static class13[] field2352 = new class13[4];

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static final void method1047(int arg0) {
        class224.field3572.method1157(760);
        field2341++;
        if (arg0 != 64) {
            method1049((byte) 97);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method1048(int arg0) {
        field2350++;
        int var1 = -95 % ((arg0 - 49) / 50);
        if (class174.field2929 != null || class23.field365 != null) {
            return;
        }
        int var2 = class230.field3666;
        if (!class198.field3226) {
            if (var2 == 1 && class42.field776 > 0) {
                short var14 = class94.field1468[class42.field776 - 1];
                if (var14 == 41 || var14 == 22 || var14 == 25 || var14 == 37 || var14 == 29 || var14 == 58 || var14 == 51 || var14 == 57 || var14 == 10 || var14 == 4 || var14 == 17 || var14 == 1003) {
                    int var15 = class223.field3559[class42.field776 - 1];
                    int var16 = class15.field231[class42.field776 - 1];
                    class114 var17 = class8.method43(var16, (byte) 76);
                    class253 var18 = client.method1916(var17);
                    if (var18.method1690(true) || var18.method1684(1)) {
                        class160.field2600 = false;
                        class104.field1591 = 0;
                        if (class174.field2929 != null) {
                            class72.method556(0, class174.field2929);
                        }
                        class174.field2929 = class8.method43(var16, (byte) 107);
                        class66.field1089 = var15;
                        class185.field3043 = class269.field4320;
                        class208.field3340 = class111.field1707;
                        class72.method556(0, class174.field2929);
                        return;
                    }
                }
            }
            if (var2 == 1 && (class131.field2183 == 1 && class42.field776 > 2 || class170.method1215((byte) 17, class42.field776 - 1))) {
                var2 = 2;
            }
            if (var2 == 2 && class42.field776 > 0 || class254.field4055 == 1) {
                class270.method1837(27);
            }
            if ((var2 != 1 || class42.field776 <= 0) && class254.field4055 != 2) {
                return;
            }
            class89.method689(0);
            return;
        }
        if (var2 != 1) {
            int var3 = class165.field2719;
            int var4 = class269.field4311;
            if (var4 < class224.field3569 - 10 || var4 > class224.field3569 + class190.field3121 + 10 || class267.field4274 - 10 > var3 || var3 > (class66.field1088 + class267.field4274 + 10)) {
                class198.field3226 = false;
                class3.method19((byte) 88, class190.field3121, class267.field4274, class66.field1088, class224.field3569);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var5 = class224.field3569;
        int var6 = class267.field4274;
        int var7 = class190.field3121;
        int var8 = class269.field4320;
        int var9 = class111.field1707;
        int var10 = -1;
        for (int var11 = 0; var11 < class42.field776; var11++) {
            if (class38.field661) {
                int var13 = var6 + ((class42.field776 - var11 - 1) * 15) + 33;
                if (var5 < var8 && var8 < var5 + var7 && (var13 - 13) < var9 && (var13 + 3) > var9) {
                    var10 = var11;
                }
            } else {
                int var12 = (class42.field776 - var11 - 1) * 15 + (var6 + 31);
                if (var8 > var5 && (var5 + var7) > var8 && var9 > var12 - 13 && (var12 + 3) > var9) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            class56.method448((byte) -127, var10);
        }
        class198.field3226 = false;
        class3.method19((byte) 122, class190.field3121, class267.field4274, class66.field1088, class224.field3569);
        return;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method1049(byte arg0) {
        field2352 = null;
        if (arg0 >= -81) {
            field2343 = false;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public static final void method1050(int arg0, int arg1) {
        class3.field31.method1163(arg0, false);
        class3.field42.method1163(arg0, false);
        if (arg1 != 0) {
            method1049((byte) 53);
        }
        field2351++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[II)Lbe;")
    private final class86 method1051(int arg0, int arg1, int[] arg2, int arg3) {
        field2346++;
        int var5 = arg1 ^ (arg3 >>> 12 | arg3 << 4 & 0xFFFC);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class86 var9 = (class86) this.field2353.method1063((byte) -18, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class280 var10 = class280.method1881(this.field2348, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            if (arg0 != 12309) {
                this.method1056(92, (int[]) null, -74);
            }
            class86 var11 = var10.method1883();
            this.field2353.method1064(var11, var7, (byte) -122);
            if (arg2 != null) {
                arg2[0] -= var11.field1402.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILci;Lci;IIJ)V")
    public static final void method1052(int arg0, int arg1, int arg2, int arg3, class60 arg4, class60 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class128 var10 = new class128();
        var10.field2107 = arg8;
        var10.field2116 = arg1 * 128 + 64;
        var10.field2115 = arg2 * 128 + 64;
        var10.field2113 = arg3;
        var10.field2117 = arg4;
        var10.field2105 = arg5;
        var10.field2121 = arg6;
        var10.field2108 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class26.field455[var11][arg1][arg2] == null) {
                class26.field455[var11][arg1][arg2] = new class129(var11, arg1, arg2);
            }
        }
        class26.field455[arg0][arg1][arg2].field2144 = var10;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([III)Lbe;")
    public final class86 method1053(int[] arg0, int arg1, int arg2) {
        field2340++;
        if (~this.field2349.method905(-1) == arg1) {
            return this.method1054(0, 69, arg2, arg0);
        } else if (this.field2349.method891(0, arg2) == 1) {
            return this.method1054(arg2, -116, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[I)Lbe;")
    private final class86 method1054(int arg0, int arg1, int arg2, int[] arg3) {
        field2347++;
        int var5 = arg2 ^ ((arg0 & 0xF0000FFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        int var7 = 30 / ((-arg1 - 64) / 48);
        long var8 = (long) var6 ^ 0x100000000L;
        class86 var10 = (class86) this.field2353.method1063((byte) -47, var8);
        if (var10 != null) {
            return var10;
        } else if (arg3 == null || arg3[0] > 0) {
            class109 var11 = (class109) this.field2344.method1063((byte) -124, var8);
            if (var11 == null) {
                var11 = class109.method808(this.field2349, arg0, arg2);
                if (var11 == null) {
                    return null;
                }
                this.field2344.method1064(var11, var8, (byte) -127);
            }
            class86 var12 = var11.method811(arg3);
            if (var12 == null) {
                return null;
            } else {
                var11.method1074((byte) -122);
                this.field2353.method1064(var12, var8, (byte) -124);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
    public static final void method1055(int arg0, int arg1, int arg2, int arg3) {
        class23 var4 = class91.method694(arg3, arg2, -44);
        field2342++;
        var4.method190(0);
        var4.field349 = arg0;
        var4.field361 = arg1;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lsb;Lsb;)V")
    public class141(class124 arg0, class124 arg1) {
        this.field2348 = arg0;
        this.field2349 = arg1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[II)Lbe;")
    public final class86 method1056(int arg0, int[] arg1, int arg2) {
        field2339++;
        if (this.field2348.method905(-1) == 1) {
            return this.method1051(12309, arg0, arg1, 0);
        } else if (this.field2348.method891(0, arg0) == 1) {
            return this.method1051(12309, 0, arg1, arg0);
        } else {
            if (arg2 > -1) {
                this.field2344 = null;
            }
            throw new RuntimeException();
        }
    }
}
