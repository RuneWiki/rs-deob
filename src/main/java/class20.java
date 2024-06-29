import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class20 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    private int field451 = 32;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "J")
    private long field471 = class135.method849(true);

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    private int field477 = 0;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Z")
    private boolean field476 = true;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    private int field484 = 0;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "J")
    private long field479 = 0L;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "J")
    private long field483 = 0L;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "[Ljc;")
    private class100[] field489 = new class100[8];

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    private int field480 = 0;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    private int field482 = 0;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "[Ljc;")
    private class100[] field488 = new class100[8];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field452 = -1;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Lvd;")
    private static class222 field472 = class212.method1357("Close", 10731);

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Lvd;")
    private static class222 field481 = class212.method1357("level)2", 10731);

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Lvd;")
    public static class222 field465 = field472;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "Lvd;")
    public static class222 field478 = field481;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Ljc;")
    private class100 field458;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Lme;")
    public static class133 field466;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "[I")
    public int[] field474;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public final synchronized void method182(boolean arg0) {
        field454++;
        this.field476 = true;
        try {
            this.method196();
        } catch (Exception var2) {
            this.method197();
            this.field479 = class135.method849(!arg0) + 2000L;
        }
        if (arg0) {
            field473 = -53;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method183(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 < 83) {
            return;
        }
        if (arg1 == arg3 && arg2 == arg9 && arg0 == arg8 && arg5 == arg6) {
            class66.method453(arg0, arg9, arg6, arg1, arg7, 1866);
        } else {
            int var10 = arg1;
            int var11 = arg9;
            int var12 = arg1 * 3;
            int var13 = arg3 * 3;
            int var14 = arg9 * 3;
            int var15 = arg2 * 3;
            int var16 = arg8 * 3;
            int var17 = arg5 * 3;
            int var18 = arg0 + var13 - var16 - arg1;
            int var19 = arg6 + var15 - arg9 - var17;
            int var20 = var12 + var16 - var13 - var13;
            int var21 = var17 + var14 - var15 - var15;
            int var22 = var13 - var12;
            int var23 = var15 - var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var25;
                int var29 = var19 * var26;
                int var30 = var21 * var25;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var27 + var28 + var32 >> 12) + arg1;
                int var34 = (var29 + var30 + var31 >> 12) + arg9;
                class66.method453(var33, var11, var34, var10, arg7, 1866);
                var10 = var33;
                var11 = var34;
            }
        }
        field470++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZ)V")
    public static final void method184(int arg0, int arg1, boolean arg2) {
        field461++;
        if (!arg2) {
            field466 = null;
        }
        class115[] var3 = class128.field2471;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class115 var5 = var3[var4];
            if (var5 != null && var5.field2187 == 2) {
                class174.method1099((var5.field2184 - class151.field2931 << 7) + var5.field2190, var5.field2189 * 2, (var5.field2191 - class110.field2064 << 7) + var5.field2188, -421473367);
                if (class26.field597 > -1 && class175.field3280 % 20 < 10) {
                    class91.field1709[var5.field2185].method163(arg0 + class26.field597 - 12, class10.field199 + arg1 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljc;IB)V")
    private final void method185(class100 arg0, int arg1, byte arg2) {
        field456++;
        int var4 = arg1 >> 5;
        if (arg2 != -2) {
            return;
        }
        class100 var5 = this.field489[var4];
        if (var5 == null) {
            this.field488[var4] = arg0;
        } else {
            var5.field1869 = arg0;
        }
        this.field489[var4] = arg0;
        arg0.field1872 = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public final void method186(byte arg0) {
        if (arg0 != 114) {
            field481 = null;
        }
        field464++;
        this.field476 = true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)V")
    private final void method187(int arg0, boolean arg1) {
        this.field484 -= arg0;
        if (!arg1) {
            return;
        }
        if (this.field484 < 0) {
            this.field484 = 0;
        }
        field460++;
        if (this.field458 != null) {
            this.field458.method570(arg0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static final void method188(int arg0) {
        field453++;
        class110.field2060.method596(false);
        class227.field4256.method1072((byte) -124);
        if (arg0 != -16876) {
            field472 = null;
        }
        class13.field275.method1072((byte) -123);
        class62.field1148.method1072((byte) -61);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
    public void method189() throws Exception {
        field455++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
    public final synchronized void method190(boolean arg0) {
        if (class24.field554 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class24.field554.field2242[var3] == this) {
                    class24.field554.field2242[var3] = null;
                }
                if (class24.field554.field2242[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class24.field554.field2240 = true;
                while (class24.field554.field2233) {
                    class225.method1471(50L, -23364);
                }
                class24.field554 = null;
            }
        }
        field475++;
        this.method197();
        if (arg0) {
            this.field480 = -96;
        }
        this.field474 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
    public static final void method191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class214.field3979 == 0 && !class79.field1522) {
            class172.field3228++;
            class127.method803(0L, class29.field646, (byte) 44, arg4 - arg2, -arg3 + arg0, (short) 4, class197.field3605);
        }
        if (arg1 != 4) {
            field472 = null;
        }
        field467++;
        long var5 = -1L;
        for (int var7 = 0; var7 < class205.field3829; var7++) {
            long var8 = class39.field870[var7];
            int var10 = (int) var8 & 0x7F;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            int var12 = (int) var8 >> 7 & 0x7F;
            int var13 = (int) var8 >> 29 & 0x3;
            if (var5 != var8) {
                var5 = var8;
                if (var13 == 2 && class139.method872(class217.field4036, var10, var12, var8)) {
                    class65 var14 = class174.method1102(var11, arg1 ^ 0x4);
                    if (var14.field1197 != null) {
                        var14 = var14.method439((byte) 125);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (class214.field3979 == 1) {
                        class78.field1499++;
                        class127.method803(var8, class234.method1531(new class222[] { class211.field3931, class112.field2104, var14.field1193 }, -10949), (byte) 44, var10, var12, (short) 58, class153.field2946);
                    } else if (!class79.field1522) {
                        class221.field4102++;
                        class222[] var15 = var14.field1207;
                        if (class113.field2128) {
                            var15 = class79.method522(var15, (byte) -124);
                        }
                        if (var15 != null) {
                            for (int var16 = 4; var16 >= 0; var16--) {
                                if (var15[var16] != null) {
                                    short var17 = 0;
                                    if (var16 == 0) {
                                        var17 = 9;
                                    }
                                    class84.field1597++;
                                    if (var16 == 1) {
                                        var17 = 51;
                                    }
                                    if (var16 == 2) {
                                        var17 = 16;
                                    }
                                    if (var16 == 3) {
                                        var17 = 11;
                                    }
                                    if (var16 == 4) {
                                        var17 = 1005;
                                    }
                                    class127.method803(var8, class234.method1531(new class222[] { class97.field1808, var14.field1193 }, -10949), (byte) 44, var10, var12, var17, var15[var16]);
                                }
                            }
                        }
                        class127.method803((long) var14.field1179, class234.method1531(new class222[] { class97.field1808, var14.field1193 }, -10949), (byte) 44, var10, var12, (short) 1003, class22.field529);
                    } else if ((class22.field522 & 0x4) == 4) {
                        class127.method803(var8, class234.method1531(new class222[] { class17.field429, class112.field2104, var14.field1193 }, -10949), (byte) 44, var10, var12, (short) 17, class55.field1038);
                        class166.field3173++;
                    }
                }
                if (var13 == 1) {
                    class193 var18 = class202.field3696[var11];
                    if (var18.field3558.field2151 == 1 && (var18.field1353 & 0x7F) == 64 && (var18.field1360 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < class173.field3263; var19++) {
                            class193 var22 = class202.field3696[class113.field2123[var19]];
                            if (var22 != null && var18 != var22 && var22.field3558.field2151 == 1 && var18.field1353 == var22.field1353 && var18.field1360 == var22.field1360) {
                                class113.method735(var10, var22.field3558, 4, var12, class113.field2123[var19]);
                            }
                        }
                        for (int var20 = 0; var20 < class38.field859; var20++) {
                            class38 var21 = class54.field1024[class122.field2328[var20]];
                            if (var21 != null && var18.field1353 == var21.field1353 && var18.field1360 == var21.field1360) {
                                class168.method1085(var12, var10, (byte) -90, var21, class122.field2328[var20]);
                            }
                        }
                    }
                    class113.method735(var10, var18.field3558, 4, var12, var11);
                }
                if (var13 == 0) {
                    class38 var23 = class54.field1024[var11];
                    if ((var23.field1353 & 0x7F) == 64 && (var23.field1360 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < class173.field3263; var24++) {
                            class193 var27 = class202.field3696[class113.field2123[var24]];
                            if (var27 != null && var27.field3558.field2151 == 1 && var23.field1353 == var27.field1353 && var23.field1360 == var27.field1360) {
                                class113.method735(var10, var27.field3558, 4, var12, class113.field2123[var24]);
                            }
                        }
                        for (int var25 = 0; var25 < class38.field859; var25++) {
                            class38 var26 = class54.field1024[class122.field2328[var25]];
                            if (var26 != null && var23 != var26 && var23.field1353 == var26.field1353 && var23.field1360 == var26.field1360) {
                                class168.method1085(var12, var10, (byte) -90, var26, class122.field2328[var25]);
                            }
                        }
                    }
                    class168.method1085(var12, var10, (byte) -90, var23, var11);
                }
                if (var13 == 3) {
                    class28 var28 = class237.field4408[class217.field4036][var10][var12];
                    if (var28 != null) {
                        for (class27 var29 = (class27) var28.method246(0); var29 != null; var29 = (class27) var28.method242(1)) {
                            int var30 = var29.field598.field911;
                            class204 var31 = class112.method728(var30, (byte) 63);
                            if (class214.field3979 == 1) {
                                class127.method803((long) var30, class234.method1531(new class222[] { class211.field3931, class227.field4262, var31.field3777 }, -10949), (byte) 44, var10, var12, (short) 20, class153.field2946);
                                class124.field2373++;
                            } else if (!class79.field1522) {
                                class29.field634++;
                                class222[] var32 = var31.field3736;
                                if (class113.field2128) {
                                    var32 = class79.method522(var32, (byte) -124);
                                }
                                for (int var33 = 4; var33 >= 0; var33--) {
                                    if (var32 != null && var32[var33] != null) {
                                        class10.field191++;
                                        byte var34 = 0;
                                        if (var33 == 0) {
                                            var34 = 1;
                                        }
                                        if (var33 == 1) {
                                            var34 = 32;
                                        }
                                        if (var33 == 2) {
                                            var34 = 28;
                                        }
                                        if (var33 == 3) {
                                            var34 = 34;
                                        }
                                        if (var33 == 4) {
                                            var34 = 19;
                                        }
                                        class127.method803((long) var30, class234.method1531(new class222[] { class108.field1992, var31.field3777 }, -10949), (byte) 44, var10, var12, var34, var32[var33]);
                                    } else if (var33 == 2) {
                                        class57.field1072++;
                                        class127.method803((long) var30, class234.method1531(new class222[] { class108.field1992, var31.field3777 }, arg1 ^ 0xFFFFD53F), (byte) 44, var10, var12, (short) 28, class118.field2238);
                                    }
                                }
                                class127.method803((long) var30, class234.method1531(new class222[] { class108.field1992, var31.field3777 }, -10949), (byte) 44, var10, var12, (short) 1002, class22.field529);
                            } else if ((class22.field522 & 0x1) == 1) {
                                class87.field1649++;
                                class127.method803((long) var30, class234.method1531(new class222[] { class17.field429, class227.field4262, var31.field3777 }, -10949), (byte) 44, var10, var12, (short) 37, class55.field1038);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([II)V")
    private final void method192(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class168.field3201) {
            var3 = arg1 << 1;
        }
        class163.method1024(arg0, 0, var3);
        this.field484 -= arg1;
        if (this.field458 != null && this.field484 <= 0) {
            this.field484 += class106.field1956 >> 4;
            class87.method562(-121, this.field458);
            this.method185(this.field458, this.field458.method622(), (byte) -2);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class100 var10 = null;
                        class100 var11 = this.field488[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class169 var12 = var11.field1871;
                                if (var12 == null || var12.field3212 <= var8) {
                                    var11.field1870 = true;
                                    int var13 = var11.method564();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3212 += var13;
                                    }
                                    if (var4 >= this.field451) {
                                        break label107;
                                    }
                                    class100 var14 = var11.method572();
                                    if (var14 != null) {
                                        int var15 = var11.field1872;
                                        while (var14 != null) {
                                            this.method185(var14, var15 * var14.method622() >> 8, (byte) -2);
                                            var14 = var11.method568();
                                        }
                                    }
                                    class100 var16 = var11.field1869;
                                    var11.field1869 = null;
                                    if (var10 == null) {
                                        this.field488[var7] = var16;
                                    } else {
                                        var10.field1869 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field489[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1869;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class100 var18 = this.field488[var17];
                this.field488[var17] = this.field489[var17] = null;
                while (var18 != null) {
                    class100 var19 = var18.field1869;
                    var18.field1869 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field484 < 0) {
            this.field484 = 0;
        }
        if (this.field458 != null) {
            this.field458.method567(arg0, 0, arg1);
        }
        this.field471 = class135.method849(true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method193(Component arg0) throws Exception {
        field457++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public void method194(int arg0) throws Exception {
        field485++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljc;Z)V")
    public final synchronized void method195(class100 arg0, boolean arg1) {
        if (arg1) {
            field466 = null;
        }
        this.field458 = arg0;
        field463++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
    public void method196() throws Exception {
        field459++;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()V")
    public void method197() {
        field468++;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static void method198(int arg0) {
        field466 = null;
        field478 = null;
        if (arg0 != -1860) {
            field472 = null;
        }
        field481 = null;
        field472 = null;
        field465 = null;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()I")
    public int method199() throws Exception {
        field469++;
        return this.field486;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public final synchronized void method200(int arg0) {
        field462++;
        if (this.field474 == null) {
            return;
        }
        long var2 = class135.method849(true);
        try {
            if (this.field479 != 0L) {
                if (var2 < this.field479) {
                    return;
                }
                this.method194(this.field486);
                this.field476 = true;
                this.field479 = 0L;
            }
            if (arg0 > -27) {
                this.field477 = 92;
            }
            int var4 = this.method199();
            int var5 = this.field490 + this.field487;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field482 - var4 > this.field477) {
                this.field477 = this.field482 - var4;
            }
            if (this.field486 < var5 + 256) {
                this.field486 += 1024;
                var4 = 0;
                if (this.field486 > 16384) {
                    this.field486 = 16384;
                }
                this.method197();
                this.method194(this.field486);
                if (var5 + 256 > this.field486) {
                    var5 = this.field486 - 256;
                    this.field487 = var5 - this.field490;
                }
                this.field476 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method192(this.field474, 256);
                this.method189();
            }
            if (var2 > this.field483) {
                if (this.field476) {
                    this.field476 = false;
                } else if (this.field477 == 0 && this.field480 == 0) {
                    this.method197();
                    this.field479 = var2 + 2000L;
                    return;
                } else {
                    this.field487 = Math.min(this.field480, this.field477);
                    this.field480 = this.field477;
                }
                this.field483 = var2 + 2000L;
                this.field477 = 0;
            }
            this.field482 = var4;
        } catch (Exception var7) {
            this.method197();
            this.field479 = var2 + 2000L;
        }
        try {
            if (this.field471 + 500000L < var2) {
                var2 = this.field471;
            }
            while (var2 > this.field471 + 5000L) {
                this.method187(256, true);
                this.field471 += 256000 / class106.field1956;
            }
        } catch (Exception var6) {
            this.field471 = var2;
        }
    }
}
