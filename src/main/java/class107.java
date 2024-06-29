import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class107 extends class89 {

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    private int field1987 = 0;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    private int field1988 = 0;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
    private int field2002 = 0;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "Lha;")
    private static class46 field1984 = class271.method1828("Loaded interfaces", -46);

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "Lha;")
    public static class46 field1992 = class271.method1828("Benutzen", -46);

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "Lha;")
    public static class46 field1999 = class271.method1828("mapscene", -46);

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "Lha;")
    public static class46 field1981 = class271.method1828("overlay", -46);

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "Lha;")
    public static class46 field1985 = field1984;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    private int field1979;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    private int field1986;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    private int field1998;

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "I")
    private int field2001;

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!uc", name = "qb", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "Lpi;")
    public static class181 field1982;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "[I")
    public static int[] field1980;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "[I")
    public static int[] field1993;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "[Lp;")
    public static class97[] field2000;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
    private final void method831(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 <= arg2 ? arg3 : arg2;
        int var6 = ~var5 < ~arg0 ? arg0 : var5;
        ++field1991;
        int var7 = ~arg2 < ~arg3 ? arg2 : arg3;
        int var8 = ~var7 > ~arg0 ? arg0 : var7;
        int var9 = var8 - var6;
        this.field1994 = (var6 - -var8) / 2;
        if (arg1 == 20480) {
            if (~var9 >= -1) {
                this.field1997 = 0;
            } else {
                int var10 = (-arg2 + var8 << 12) / var9;
                int var11 = (-arg3 + var8 << 12) / var9;
                int var12 = (-arg0 + var8 << 12) / var9;
                if (arg2 == var8) {
                    this.field1997 = arg3 != var6 ? 4096 - var11 : var12 + 20480;
                } else if (~arg3 == ~var8) {
                    this.field1997 = arg0 != var6 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field1997 = ~arg2 == ~var6 ? var11 + 12288 : 20480 - var10;
                }
                this.field1997 /= 6;
            }
            if (~this.field1994 < -1 && ~this.field1994 > -4097) {
                this.field1998 = (var9 << 12) / (~this.field1994 >= -2049 ? this.field1994 * 2 : -(this.field1994 * 2) + 8192);
            } else {
                this.field1998 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIII)V")
    private final void method832(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 > 2048 ? arg1 - (arg1 * arg2 >> 12) + arg2 : (4096 - -arg2) * arg1 >> 12;
        ++field2003;
        if (arg3 == 1743927372) {
            if (var5 <= 0) {
                this.field1979 = this.field1986 = this.field2001 = arg1;
            } else {
                int var6 = arg0 * 6;
                int var7 = var6 >> 12;
                int var8 = arg1 - var5 + arg1;
                int var9 = (-var8 + var5 << 12) / var5;
                int var10 = -(var7 << 12) + var6;
                int var12 = var9 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = -var13 + var5;
                int var15 = var8 + var13;
                if (var7 != 0) {
                    if (~var7 != -2) {
                        if (var7 != 2) {
                            if (var7 != 3) {
                                if (var7 != 4) {
                                    if (var7 == 5) {
                                        this.field1979 = var5;
                                        this.field2001 = var14;
                                        this.field1986 = var8;
                                    }
                                } else {
                                    this.field2001 = var5;
                                    this.field1986 = var8;
                                    this.field1979 = var15;
                                }
                            } else {
                                this.field1986 = var14;
                                this.field1979 = var8;
                                this.field2001 = var5;
                            }
                        } else {
                            this.field2001 = var15;
                            this.field1986 = var5;
                            this.field1979 = var8;
                        }
                    } else {
                        this.field2001 = var8;
                        this.field1979 = var14;
                        this.field1986 = var5;
                    }
                } else {
                    this.field1979 = var5;
                    this.field1986 = var15;
                    this.field2001 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field1983;
        if (arg1 != 25) {
            return null;
        } else {
            int[][] var3 = super.field1695.method843((byte) -25, arg0);
            if (super.field1695.field2028) {
                int[][] var4 = this.method689((byte) 95, 0, arg0);
                int[] var5 = var4[2];
                int[] var6 = var3[2];
                int[] var7 = var4[0];
                int[] var8 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var3[0];
                for (int var11 = 0; ~var11 > ~class241.field4284; ++var11) {
                    this.method831(var5[var11], arg1 ^ 20505, var7[var11], var8[var11]);
                    this.field1998 += this.field1987;
                    if (this.field1998 < 0) {
                        this.field1998 = 0;
                    }
                    this.field1997 += this.field1988;
                    if (this.field1998 > 4096) {
                        this.field1998 = 4096;
                    }
                    this.field1994 += this.field2002;
                    if (~this.field1994 > -1) {
                        this.field1994 = 0;
                    }
                    if (this.field1994 > 4096) {
                        this.field1994 = 4096;
                    }
                    while (~this.field1997 > -1) {
                        this.field1997 += 4096;
                    }
                    while (this.field1997 > 4096) {
                        this.field1997 -= 4096;
                    }
                    this.method832(this.field1997, this.field1994, this.field1998, 1743927372);
                    var10[var11] = this.field1979;
                    var9[var11] = this.field1986;
                    var6[var11] = this.field2001;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(IB)Lti;")
    public static final class129 method833(int arg0, byte arg1) {
        class129 var2 = (class129) class257.field4477.method1364((long) arg0, -21987);
        ++field2004;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class126.field2312.method1293(arg0, 26, (byte) -83);
            class129 var4 = new class129();
            if (var3 != null) {
                var4.method1002(-115, new class75(var3));
            }
            class257.field4477.method1366(true, var4, (long) arg0);
            if (arg1 != 56) {
                field1981 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 != -641641492) {
            method833(76, (byte) -19);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2002 = (arg0.method569((byte) -110) << 12) / 100;
                }
            } else {
                this.field1987 = (arg0.method569((byte) -110) << 12) / 100;
            }
        } else {
            this.field1988 = arg0.method591(true);
        }
        ++field1995;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z")
    public static final boolean method834(int arg0, int arg1) {
        class119 var2 = class177.method1266(57, arg0);
        ++field1990;
        if (var2 == null) {
            return false;
        } else if (class9.field160 != 1 && ~class9.field160 != -3 && ~class216.field3821 != -3) {
            class46 var4 = class240.field4275;
            if (class216.field3821 != 0) {
                var4 = class109.method855(0, new class46[] { class111.field2114, class115.method932(false, var2.field2240 + 7000) });
            }
            class46 var5 = class240.field4275;
            if (class237.field4197 != null) {
                var5 = class109.method855(0, new class46[] { class73.field1298, class237.field4197 });
            }
            if (arg1 > -32) {
                method833(92, (byte) -113);
            }
            class46 var6 = class109.method855(0, new class46[] { class86.field1645, var2.field2230, var4, class199.field3567, class115.method932(false, class135.field2443), class108.field2021, class115.method932(false, class51.field889), var5, class257.field4479, class3.field59 ? class69.field1202 : class219.field3859, class205.field3674, class10.field176 ? class69.field1202 : class219.field3859, class236.field4099, !class26.field518 ? class219.field3859 : class69.field1202 });
            try {
                class42.field710.getAppletContext().showDocument(var6.method323(-69), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        } else {
            byte[] var3 = var2.field2230.method311(0);
            class269.field4672 = new String(var3, 0, var3.length);
            class97.field1808 = var2.field2240;
            if (~class216.field3821 != -1) {
                class82.field1578 = 50000 - -class97.field1808;
                class129.field2363 = class97.field1808 + 40000;
                class227.field3973 = class129.field2363;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class107() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Z")
    public static final boolean method835(int arg0, int arg1) {
        ++field1989;
        if (arg0 != 0) {
            return false;
        } else {
            return (arg1 & 675740566) >> 29 != 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V")
    public static void method836(byte arg0) {
        field1992 = null;
        field1993 = null;
        field1985 = null;
        field2000 = null;
        int var1 = 96 / ((-42 - arg0) / 41);
        field1981 = null;
        field1984 = null;
        field1999 = null;
        field1982 = null;
        field1980 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
    public static final void method837(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= 63) {
            if (~class135.field2445 >= ~(-arg2 + arg3) && arg3 - -arg2 <= class73.field1309 && ~(-arg2 + arg1) <= ~class4.field70 && arg1 + arg2 <= class70.field1205) {
                class147.method1094(arg1, arg2, -16365, arg4, arg3);
            } else {
                class118.method940(-5056, arg1, arg4, arg2, arg3);
            }
            ++field1996;
        }
    }
}
