import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class145 extends class4 {

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "Z")
    public boolean field1991 = false;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    private int field1996 = 0;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "Z")
    public boolean field1986 = true;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Lte;")
    public class220 field1973;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "Leb;")
    public class35 field1987;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "Lhi;")
    public class26 field1980;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "J")
    private long field1981;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "Ltl;")
    public class255 field2004;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    public static int field2002 = 0;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "Llm;")
    public static class150 field1998 = new class150(64);

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field2008 = -1;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    private int field1976;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    private int field1977;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    private int field1979;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    private int field1982;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    private int field1984;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    private int field1985;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    private int field1988;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    private int field1989;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    private int field1995;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "Lnh;")
    public static class305 field2006;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "Lcb;")
    public static class34 field2007;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 1134303504) {
            this.method907(-47, true, -49L, 14, 82, 87);
        }
        field1992++;
        this.field1995 = arg6;
        this.field1997 = arg5;
        this.field1999 = arg8;
        this.field1988 = arg1;
        this.field1978 = arg9;
        this.field1982 = arg4;
        this.field1977 = arg3;
        int var11 = (this.field1999 + this.field1997 + this.field1988) / 3 + this.field1973.field3422;
        this.field1989 = arg7;
        int var12 = (this.field1989 + this.field1982 + this.field1995) / 3 + this.field1973.field3432;
        this.field1979 = arg0;
        int var13 = (this.field1977 + this.field1978 + this.field1979) / 3 + this.field1973.field3427;
        if (this.field2001 != var11 || this.field1974 != var12 || this.field1983 != var13) {
            this.field2001 = var11;
            this.field1983 = var13;
            this.field1986 = true;
            this.field1974 = var12;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(Z)V")
    public static void method906(boolean arg0) {
        field2006 = null;
        if (arg0) {
            field2007 = null;
            field1998 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZJIII)V")
    public final void method907(int arg0, boolean arg1, long arg2, int arg3, int arg4, int arg5) {
        field2003++;
        if (this.field1991) {
            arg1 = false;
        } else if (class220.field3414 < this.field2004.field3979) {
            arg1 = false;
        } else if (class230.field3602[class220.field3414] < class220.field3397) {
            arg1 = false;
        } else if (this.field1999 == this.field1988 && this.field1997 == this.field1988 && this.field1995 == this.field1989 && this.field1995 == this.field1982 && this.field1978 == this.field1977 && this.field1979 == this.field1978) {
            arg1 = false;
        } else if (this.field2004.field3969 != -1) {
            int var8 = (int) (arg2 - this.field1981);
            if (this.field2004.field3970 || this.field2004.field3969 >= var8) {
                var8 %= this.field2004.field3969;
            } else {
                arg1 = false;
            }
            if (!this.field2004.field4033 && var8 < this.field2004.field4013) {
                arg1 = false;
            }
            if (this.field2004.field4033 && this.field2004.field4013 <= var8) {
                arg1 = false;
            }
        }
        if (arg1) {
            this.field1996 += (int) (((double) this.field2004.field3995 + (double) (this.field2004.field4010 - this.field2004.field3995) * Math.random()) * (double) arg0);
            if (this.field1996 > 63) {
                int var9 = this.field1996 >> 6;
                this.field1996 &= 0x3F;
                if (this.field1986) {
                    int var10 = this.field1988 - this.field1999;
                    int var11 = this.field1995 - this.field1989;
                    int var12 = this.field1978 - this.field1977;
                    int var13 = this.field1997 - this.field1999;
                    int var14 = this.field1982 - this.field1989;
                    int var15 = this.field1979 - this.field1977;
                    this.field1984 = var10 * var14 - (var11 * var13);
                    this.field1976 = var12 * var13 - (var10 * var15);
                    this.field2000 = var11 * var15 - var12 * var14;
                    while (true) {
                        if (this.field2000 <= 32767 && this.field1976 <= 32767 && this.field1984 <= 32767 && this.field2000 >= -32767 && this.field1976 >= -32767 && this.field1984 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field2000 * this.field2000 + (this.field1976 * this.field1976 + (this.field1984 * this.field1984))));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field2000 = this.field2000 * 32767 / var16;
                            this.field1984 = this.field1984 * 32767 / var16;
                            this.field1976 = this.field1976 * 32767 / var16;
                            if (this.field2004.field3999 > 0 || this.field2004.field4023 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field1984, (double) this.field2000) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field1976, Math.sqrt((double) (this.field2000 * this.field2000 + (this.field1984 * this.field1984)))) * 2047.0D / 6.283185307179586D);
                                this.field1972 = this.field2004.field4023 - this.field2004.field4011;
                                this.field1994 = this.field2004.field3999 - this.field2004.field3974;
                                int var20 = var18 - this.field1973.field3421;
                                this.field1985 = var19 + this.field2004.field4011 - (this.field1972 / 2);
                                this.field1975 = this.field2004.field3974 + var20 - this.field1994 / 2;
                            } else if (this.field1973.field3421 != 0) {
                                int var17 = this.field2000 * arg3 + this.field1984 * arg5 >> 16;
                                this.field1984 = this.field1984 * arg3 - (this.field2000 * arg5) >> 16;
                                this.field2000 = var17;
                            }
                            this.field1986 = false;
                            break;
                        }
                        this.field2000 >>= 0x1;
                        this.field1984 >>= 0x1;
                        this.field1976 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field2004.field3999 <= 0 && this.field2004.field4023 <= 0) {
                        var22 = this.field2000;
                        var23 = this.field1976;
                        var24 = this.field1984;
                    } else {
                        int var25 = this.field1975 + ((int) ((double) this.field1994 * Math.random()));
                        int var26 = var25 & 0x7FF;
                        int var27 = class118.field1697[var26] >> 1;
                        int var28 = this.field1985 + (int) ((double) this.field1972 * Math.random());
                        int var29 = var28 & 0x3FF;
                        int var30 = class118.field1697[var29] >> 1;
                        int var31 = class118.field1690[var26] >> 1;
                        var24 = var27 * var30 >> 15;
                        var22 = var30 * var31 >> 15;
                        int var32 = class118.field1690[var29] >> 1;
                        var23 = var32 * -1;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var35 - var33;
                    int var37 = this.field1999 * var33 + (this.field1988 * var35 + (this.field1997 * var36)) >> 8;
                    int var38 = this.field1979 * var36 + this.field1978 * var35 + this.field1977 * var33 >> 8;
                    if (this.field1973.field3421 != 0) {
                        int var39 = arg3 * var37 + arg5 * var38 >> 16;
                        var38 = arg3 * var38 - (arg5 * var37) >> 16;
                        var37 = var39;
                    }
                    int var40 = this.field2004.field4029 + (int) (Math.random() * (double) (this.field2004.field4015 - this.field2004.field4029));
                    int var41 = (int) (Math.random() * (double) (this.field2004.field3972 - this.field2004.field4003)) + this.field2004.field4003;
                    int var42 = this.field1989 * var33 + this.field1995 * var35 + this.field1982 * var36 >> 8;
                    int var43;
                    if (this.field2004.field3994) {
                        double var44 = Math.random();
                        var43 = (int) ((double) this.field2004.field3983 * var44 + (double) this.field2004.field3986) << 24 | (int) ((double) this.field2004.field3993 * var44 + (double) this.field2004.field4032) | (int) ((double) this.field2004.field3975 * var44 + (double) this.field2004.field3978) << 16 | (int) ((double) this.field2004.field3990 * var44 + (double) this.field2004.field4021) << 8;
                    } else {
                        var43 = (int) (Math.random() * (double) this.field2004.field3983 + (double) this.field2004.field3986) << 24 | (int) ((double) this.field2004.field4032 + (double) this.field2004.field3993 * Math.random()) | (int) ((double) this.field2004.field4021 + (double) this.field2004.field3990 * Math.random()) << 8 | (int) ((double) this.field2004.field3978 + (double) this.field2004.field3975 * Math.random()) << 16;
                    }
                    if (class220.field3409 == class220.field3406) {
                        new class130(this, this.field1973.field3422 + var37, this.field1973.field3432 + var42, this.field1973.field3427 + var38, var22, var23, var24, var40, var41, var43);
                    } else {
                        class130 var47 = class220.field3404[class220.field3406];
                        class220.field3406 = class220.field3406 + 1 & 0x3FF;
                        var47.method829(this, this.field1973.field3422 + var37, this.field1973.field3432 + var42, this.field1973.field3427 + var38, var22, var23, var24, var40, var41, var43);
                    }
                }
            }
        }
        if (arg4 > -46) {
            return;
        }
        this.field1993 = 0;
        for (class130 var48 = (class130) this.field1980.method167(-16992); var48 != null; var48 = (class130) this.field1980.method170((byte) 28)) {
            var48.method830(arg2, arg0);
            this.field1993++;
        }
        class220.field3412 += this.field1993;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z")
    public static final boolean method908(int arg0) {
        field1990++;
        try {
            int var1 = 7 % ((arg0 + 48) / 61);
            if (class159.field2208 == 2) {
                if (class243.field3823 == null) {
                    class243.field3823 = class296.method1984(field2006, class209.field3112, class235.field3666);
                    if (class243.field3823 == null) {
                        return false;
                    }
                }
                if (class215.field3304 == null) {
                    class215.field3304 = new class164(class275.field4367, class176.field2488);
                }
                if (class138.field1903.method1863(22050, class215.field3304, (byte) 122, class189.field2865, class243.field3823)) {
                    class138.field1903.method1856(33);
                    class138.field1903.method1861((byte) -70, class186.field2825);
                    class138.field1903.method1862(class243.field3823, -3, class4.field31);
                    class215.field3304 = null;
                    class159.field2208 = 0;
                    field2006 = null;
                    class243.field3823 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class138.field1903.method1830(true);
            class215.field3304 = null;
            class243.field3823 = null;
            field2006 = null;
            class159.field2208 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Leb;Lte;J)V")
    public class145(class35 arg0, class220 arg1, long arg2) {
        this.field1973 = arg1;
        this.field1987 = arg0;
        this.field1980 = new class26();
        this.field1981 = arg2;
        this.field1996 = (int) ((double) this.field1996 + Math.random() * 64.0D);
        this.field2004 = this.field1987.field529;
    }
}
