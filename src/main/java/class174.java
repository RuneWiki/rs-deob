import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class174 extends class117 {

    @OriginalMember(owner = "client!we", name = "S", descriptor = "Lhh;")
    public static class163 field3163 = class137.method1065("::qa_op_test", 17);

    @OriginalMember(owner = "client!we", name = "X", descriptor = "[[B")
    public static byte[][] field3168 = new byte[1000][];

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "Lhh;")
    public static class163 field3173 = class137.method1065("hint_mapedge", 17);

    @OriginalMember(owner = "client!we", name = "db", descriptor = "[Lkh;")
    public static class135[] field3174 = new class135[4];

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "Z")
    public static boolean field3172 = false;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "I")
    private int field3176;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "Ljj;")
    public static class64 field3171;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 != 0) {
            method1288(-15, 47);
        }
        ++field3175;
        if (arg1 == 0) {
            this.method1289(arg2.method615(-95), 0);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        if (!arg1) {
            method1287(-78, 78, -54, -73, -126, (class165) null, 18, 44L, true);
        }
        ++field3177;
        int[][] var3 = super.field2228.method1304(arg0, (byte) -65);
        if (super.field2228.field3221) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class143.field2702; ++var7) {
                var4[var7] = this.field3176;
                var5[var7] = this.field3170;
                var6[var7] = this.field3169;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIILta;IJZ)Z")
    public static final boolean method1287(int arg0, int arg1, int arg2, int arg3, int arg4, class165 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
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
            return class152.method1128(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Lwj;")
    public static final class187 method1288(int arg0, int arg1) {
        ++field3167;
        class187 var2 = (class187) class171.field3130.method326((long) arg1, (byte) -70);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class16.field225.method973(arg0, true, arg1);
            class187 var4 = new class187();
            if (var3 != null) {
                var4.method1380(new class81(var3), 0);
            }
            class171.field3130.method328(arg0 ^ 8680, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class174() {
        this(0);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)V")
    private final void method1289(int arg0, int arg1) {
        ++field3162;
        if (arg1 == 0) {
            this.field3169 = (255 & arg0) << 4;
            this.field3170 = (65280 & arg0) >> 4;
            this.field3176 = 4080 & arg0 >> 12;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I)V")
    private class174(int arg0) {
        super(0, false);
        this.method1289(arg0, 0);
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public static void method1290(int arg0) {
        field3171 = null;
        field3163 = null;
        field3174 = null;
        field3168 = null;
        if (arg0 == -11) {
            field3173 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(II)La;")
    public static final class114 method1291(int arg0, int arg1) {
        ++field3166;
        class114 var2 = (class114) class39.field653.method326((long) arg1, (byte) -73);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class165.field3050.method973(arg1, true, arg0);
            if (var3 == null) {
                return null;
            } else {
                class114 var4 = new class114();
                class81 var5 = new class81(var3);
                var5.field1541 = var5.field1562.length - 2;
                int var6 = var5.method658(arg0 + 115);
                int var7 = var5.field1562.length - var6 + -14;
                var5.field1541 = var7;
                int var8 = var5.method620((byte) -82);
                var4.field2135 = var5.method658(-100);
                var4.field2137 = var5.method658(arg0 ^ 67);
                var4.field2139 = var5.method658(68);
                var4.field2133 = var5.method658(72);
                int var9 = var5.method622(true);
                if (~var9 < -1) {
                    var4.field2136 = new class258[var9];
                    for (int var10 = 0; ~var10 > ~var9; ++var10) {
                        int var11 = var5.method658(110);
                        class258 var12 = new class258(class96.method762((byte) -27, var11));
                        var4.field2136[var10] = var12;
                        while (var11-- > 0) {
                            int var13 = var5.method620((byte) -82);
                            int var14 = var5.method620((byte) -82);
                            var12.method1741(new class129(var14), false, (long) var13);
                        }
                    }
                }
                var5.field1541 = 0;
                int var15 = 0;
                var4.field2140 = var5.method660(812408648);
                var4.field2138 = new class163[var8];
                var4.field2144 = new int[var8];
                var4.field2142 = new int[var8];
                while (~var5.field1541 > ~var7) {
                    int var16 = var5.method658(104);
                    if (~var16 != -4) {
                        if (~var16 > -101 && var16 != 21 && var16 != 38 && ~var16 != -40) {
                            var4.field2144[var15] = var5.method620((byte) -82);
                        } else {
                            var4.field2144[var15] = var5.method622(true);
                        }
                    } else {
                        var4.field2138[var15] = var5.method605(true);
                    }
                    var4.field2142[var15++] = var16;
                }
                class39.field653.method328(arg0 + 8690, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IZ)V")
    public static final void method1292(int arg0, boolean arg1) {
        ++field3165;
        if (~class262.field4583 != ~arg0) {
            if (~class262.field4583 == -1) {
                class208.method1498((byte) 52);
            }
            if (arg0 == 40) {
                class76.method559(class170.field3119, class170.field3115, class140.field2683, 3);
            }
            if (arg0 != 40 && class20.field322 != null) {
                class20.field322.method1724(true);
                class20.field322 = null;
            }
            boolean var2 = ~arg0 == -6 || ~arg0 == -11 || arg0 == 28;
            if (arg0 == 25 || arg0 == 28) {
                class231.field4154 = 0;
                class111.field2106 = 0;
                class92.field1698 = 1;
                class236.field4211 = 0;
                class176.field3223 = 1;
                class48.method345(false);
            }
            if (arg0 == 5) {
                class171.method1268(79, class94.field1786);
            } else {
                class129.method1023((byte) 107);
            }
            boolean var3 = class262.field4583 == 5 || class262.field4583 == 10 || ~class262.field4583 == -29;
            if (!var2 != !var3) {
                if (var2) {
                    client.field1987 = class171.field3126;
                    if (class77.field1453 == 0) {
                        class259.method1751(2, 1);
                    } else {
                        class126.method1002(false, class171.field3126, 0, class59.field969, 80, 2, 255);
                    }
                    class26.method168((byte) -127, false);
                } else {
                    class259.method1751(2, 1);
                    class26.method168((byte) -99, true);
                }
            }
            if (!arg1) {
                field3174 = null;
            }
            class262.field4583 = arg0;
        }
    }
}
