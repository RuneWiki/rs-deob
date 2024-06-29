import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class81 extends class51 {

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "Z")
    private boolean field1602 = true;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    private int field1600 = 4096;

    @OriginalMember(owner = "client!ih", name = "ib", descriptor = "[Led;")
    public static class43[] field1609 = new class43[1000];

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field1601 = 0;

    @OriginalMember(owner = "client!ih", name = "jb", descriptor = "[S")
    public static short[] field1610 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ih", name = "lb", descriptor = "I")
    public static int field1612 = 0;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ih", name = "gb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ih", name = "hb", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ih", name = "kb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ih", name = "mb", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ih", name = "nb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lga;III)[Ltg;")
    public static final class179[] method498(class58 arg0, int arg1, int arg2, int arg3) {
        ++field1603;
        if (arg3 > -123) {
            field1601 = 112;
        }
        return !class184.method1185(arg1, arg2, 104, arg0) ? null : class97.method610(0);
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public static void method499(int arg0) {
        if (arg0 != 25238) {
            field1601 = 91;
        }
        field1609 = null;
        field1610 = null;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    public static final void method500(byte arg0) {
        ++field1604;
        class29.field522.method338(253, 129);
        ++class170.field3398;
        for (class137 var1 = (class137) class15.field227.method76(40); var1 != null; var1 = (class137) class15.field227.method79((byte) 76)) {
            if (var1.field2835 == 0) {
                class30.method158((byte) -111, var1, true);
            }
        }
        if (class107.field2052 != null) {
            class43.method265(false, class107.field2052);
            class107.field2052 = null;
        }
        if (arg0 != -47) {
            field1612 = 27;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field1606;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field1602 = ~arg0.method538((byte) 78) == -2;
            }
        } else {
            this.field1600 = arg0.method555(-1113627096);
        }
        if (arg1 != 0) {
            field1601 = -61;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
    public static final void method501(boolean arg0, int arg1) {
        ++field1613;
        if (arg1 == 753130416) {
            for (int var2 = 0; var2 < class95.field1864; ++var2) {
                class77 var3 = class172.field3433[class158.field3202[var2]];
                int var4 = (class158.field3202[var2] << 14) + 536870912;
                if (var3 != null && var3.method4(92) && !arg0 != var3.field1539.field1221 && var3.field1539.method373(false)) {
                    int var5 = var3.field2328 >> 7;
                    int var6 = var3.field2347 >> 7;
                    if (~var6 <= -1 && ~var6 > -105 && ~var5 <= -1 && var5 < 104) {
                        if (var3.field2327 == 1 && ~(127 & var3.field2347) == -65 && (var3.field2328 & 127) == 64) {
                            if (class59.field1220[var6][var5] == class115.field2256) {
                                continue;
                            }
                            class59.field1220[var6][var5] = class115.field2256;
                        }
                        if (!var3.field1539.field1190) {
                            var4 += Integer.MIN_VALUE;
                        }
                        var3.field2338 = class108.method668((var3.field2327 + -1) * 64 + var3.field2328, var3.field2347 - -((var3.field2327 + -1) * 64), -127, class93.field1839);
                        class137.field2842.method1154(class93.field1839, var3.field2347, var3.field2328, var3.field2338, var3.field2327 * 64 + 60 + -64, var3, var3.field2352, var4, var3.field2356);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLwf;IIII)V")
    public static final void method502(boolean arg0, class205 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1611;
        if (~class36.field650 > -51) {
            if (arg1.field3982 != null && ~arg1.field3982.length < ~arg3) {
                int var6 = arg1.field3982[arg3];
                if (~var6 != -1) {
                    int var7 = var6 >> 8;
                    int var8 = var6 & 15;
                    int var9 = (114 & var6) >> 4;
                    if (arg2 == 963) {
                        if (~var8 == -1) {
                            if (arg0) {
                                class189.method1201(0, var9, var7, (byte) 103);
                            }
                        } else if (class116.field2277 != 0) {
                            class20.field346[class36.field650] = var7;
                            class156.field3163[class36.field650] = var9;
                            int var10 = (arg4 + -64) / 128;
                            class76.field1503[class36.field650] = 0;
                            class49.field995[class36.field650] = null;
                            int var11 = (arg5 + -64) / 128;
                            class9.field168[class36.field650] = (var10 << 16) + var8 - -(var11 << 8);
                            ++class36.field650;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Z")
    public static final boolean method503(byte arg0, int arg1) {
        ++field1605;
        if (arg0 > -103) {
            return true;
        } else {
            return ~(-arg1 & arg1) == ~arg1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class81() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Led;Led;IB)V")
    public static final void method504(class43 arg0, class43 arg1, int arg2, byte arg3) {
        if (arg3 < 34) {
            field1612 = 95;
        }
        client.method150(arg0, (byte) -118, arg1, arg2, (class43) null);
        ++field1608;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        ++field1614;
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int[] var4 = this.method314(0, (byte) -103, arg0 + -1 & class71.field1407);
            int[] var5 = this.method314(0, (byte) -32, arg0);
            int[] var6 = this.method314(0, (byte) -112, arg0 - -1 & class71.field1407);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class122.field2442 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1600;
                int var12 = (var5[var10 + 1 & class108.field2080] + -var5[class108.field2080 & var10 - 1]) * this.field1600;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((var15 + 4096 + var16) / 4096)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                    var18 = 16777216 / var17;
                }
                if (this.field1602) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        if (arg1 != -94) {
            method499(30);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static final void method505(int arg0) {
        ++field1607;
        if (arg0 != 0) {
            method504((class43) null, (class43) null, 69, (byte) -29);
        }
        for (class138 var1 = (class138) class176.field3499.method753(-26703); var1 != null; var1 = (class138) class176.field3499.method755((byte) 115)) {
            if (~var1.field2865 == 0) {
                var1.field2863 = 0;
                class139.method898(var1, -1399461812);
            } else {
                var1.method417(-31);
            }
        }
    }
}
