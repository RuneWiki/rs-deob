import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class130 extends class43 {

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    private int field2400 = 4096;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    private int field2401 = 4096;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    private int field2403 = 409;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    private int field2405 = 4096;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "[I")
    private int[] field2410 = new int[3];

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "Lmb;")
    private static class132 field2406 = class166.method1092("Please wait )2 attempting to reestablish)3", 116);

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "Lmb;")
    public static class132 field2404 = field2406;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "Lkg;")
    public static class115 field2409 = new class115(64);

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "Lmb;")
    public static class132 field2412 = class166.method1092("mapflag", 124);

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "Lvi;")
    public static class233 field2411;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "Lga;")
    public static class68 field2397;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lha;)V")
    public static final void method854(class78 arg0) {
        for (int var1 = arg0.field1353; var1 <= arg0.field1358; ++var1) {
            for (int var2 = arg0.field1362; var2 <= arg0.field1360; ++var2) {
                class169 var3 = class101.field1900[arg0.field1361][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3096; ++var4) {
                        if (var3.field3103[var4] == arg0) {
                            --var3.field3096;
                            for (int var5 = var4; var5 < var3.field3096; ++var5) {
                                var3.field3103[var5] = var3.field3103[var5 + 1];
                                var3.field3092[var5] = var3.field3092[var5 + 1];
                            }
                            var3.field3103[var3.field3096] = null;
                            break;
                        }
                    }
                    var3.field3110 = 0;
                    for (int var6 = 0; var6 < var3.field3096; ++var6) {
                        var3.field3110 |= var3.field3092[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
    public static void method855(byte arg0) {
        field2397 = null;
        if (arg0 != 119) {
            field2406 = null;
        }
        field2406 = null;
        field2412 = null;
        field2409 = null;
        field2404 = null;
        field2411 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IJ)V")
    public static final void method856(int arg0, long arg1) {
        ++field2402;
        if (arg1 > 0L) {
            if (arg0 != 1) {
                method856(-13, -119L);
            }
            if (~(arg1 % 10L) == -1L) {
                class187.method1200((byte) -124, arg1 + -1L);
                class187.method1200((byte) -125, 1L);
            } else {
                class187.method1200((byte) -120, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class130() {
        super(1, false);
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    public static final void method857(int arg0) {
        ++field2408;
        if (class10.field116) {
            if (arg0 != 1) {
                field2409 = null;
            }
            class96 var1 = class102.method631((byte) 72, class231.field4172, class166.field3033);
            if (var1 != null && var1.field1718 != null) {
                class123 var2 = new class123();
                var2.field2310 = var1.field1718;
                var2.field2299 = var1;
                class155.method1010(var2, arg0 + 199999);
            }
            class10.field116 = false;
            class183.method1174(var1, arg0 + 16234);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            method854((class78) null);
        }
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (super.field764.field3960) {
            int[][] var4 = this.method301(arg1, (byte) -116, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class131.field2427 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field2410[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field2403) {
                    var7[var11] = var12;
                    var10[var11] = var6[var11];
                    var9[var11] = var8[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2410[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field2403) {
                        var7[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = -this.field2410[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field2403) {
                            var7[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var7[var11] = this.field2401 * var12 >> 12;
                            var10[var11] = this.field2405 * var14 >> 12;
                            var9[var11] = this.field2400 * var16 >> 12;
                        }
                    }
                }
            }
        }
        ++field2398;
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 == -73) {
            ++field2407;
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 == -5) {
                                int var5 = arg2.method718(false);
                                this.field2410[2] = class75.method450(255, var5) >> 12;
                                this.field2410[1] = class75.method450(var5, 65280) >> 4;
                                this.field2410[0] = class75.method450(var5, 16711680) << 4;
                            }
                        } else {
                            this.field2401 = arg2.method739(-15);
                        }
                    } else {
                        this.field2405 = arg2.method739(-126);
                    }
                } else {
                    this.field2400 = arg2.method739(74);
                }
            } else {
                this.field2403 = arg2.method739(0);
            }
        }
    }
}
