import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class103 extends class254 {

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "Z")
    public boolean field1980 = true;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "Z")
    public boolean field1998 = false;

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
    private int field2004 = 0;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "Lea;")
    public final class37 field1976;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Lmd;")
    public final class221 field1971;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "Lgb;")
    public class147 field1986;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "Lae;")
    public final class169 field1991;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "J")
    private long field1969;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field1974 = 0;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "[Lol;")
    public static class208[] field1973 = new class208[4];

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "S")
    public static short field1992 = 32767;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "[Lde;")
    public static class108[] field1993 = new class108[2048];

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "Lcc;")
    public static class209 field1989 = class95.method669(85, "floorshadows");

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    private int field1968;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    private int field1970;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    private int field1977;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    private int field1981;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    private int field1983;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    private int field1984;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    private int field1988;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    private int field1996;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    private int field2001;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
    private int field2003;

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Lsj;")
    public static class49 field1982;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIJIBZ)V")
    public final void method704(int arg0, int arg1, long arg2, int arg3, byte arg4, boolean arg5) {
        field2002++;
        if (this.field1998) {
            arg5 = false;
        } else if (class221.field4028 < this.field1991.field3078) {
            arg5 = false;
        } else if (this.field1994 == this.field1981 && this.field1994 == this.field1977 && this.field2003 == this.field1972 && this.field2003 == this.field1978 && this.field1999 == this.field1968 && this.field1999 == this.field1988) {
            arg5 = false;
        } else if (this.field1991.field3053 != -1) {
            int var8 = (int) (arg2 - this.field1969);
            if (this.field1991.field3073 || var8 <= this.field1991.field3053) {
                var8 %= this.field1991.field3053;
            } else {
                arg5 = false;
            }
            if (!this.field1991.field3091 && var8 < this.field1991.field3063) {
                arg5 = false;
            }
            if (this.field1991.field3091 && this.field1991.field3063 <= var8) {
                arg5 = false;
            }
        }
        if (arg5) {
            this.field2004 += (int) ((Math.random() * (double) (this.field1991.field3051 - this.field1991.field3042) + (double) this.field1991.field3042) * (double) arg1);
            if (this.field2004 > 63) {
                int var9 = this.field2004 >> 6;
                this.field2004 &= 0x3F;
                if (this.field1980) {
                    int var10 = this.field1994 - this.field1981;
                    int var11 = this.field2003 - this.field1972;
                    int var12 = this.field1977 - this.field1981;
                    int var13 = this.field1999 - this.field1968;
                    int var14 = this.field1978 - this.field1972;
                    int var15 = this.field1988 - this.field1968;
                    this.field1984 = var10 * var14 - (var11 * var12);
                    this.field1996 = var12 * var13 - (var10 * var15);
                    this.field2001 = var11 * var15 - var13 * var14;
                    while (true) {
                        if (this.field2001 <= 32767 && this.field1996 <= 32767 && this.field1984 <= 32767 && this.field2001 >= -32767 && this.field1996 >= -32767 && this.field1984 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field2001 * this.field2001 + this.field1996 * this.field1996 + (this.field1984 * this.field1984)));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field1984 = this.field1984 * 32767 / var16;
                            this.field1996 = this.field1996 * 32767 / var16;
                            this.field2001 = this.field2001 * 32767 / var16;
                            if (this.field1991.field3043 > 0 || this.field1991.field3055 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field1984, (double) this.field2001) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) (this.field2001 * this.field2001 + (this.field1984 * this.field1984)), (double) this.field1996) * 2047.0D / 6.283185307179586D);
                                this.field1970 = this.field1991.field3043 - this.field1991.field3097;
                                int var20 = var18 - this.field1971.field4036;
                                this.field1983 = this.field1991.field3097 + var20 - (this.field1970 / 2);
                                this.field2000 = this.field1991.field3055 - this.field1991.field3071;
                                this.field1997 = this.field1991.field3071 + var19 - this.field2000 / 2;
                            } else if (this.field1971.field4036 != 0) {
                                int var17 = this.field2001 * arg3 + this.field1984 * arg0 >> 16;
                                this.field1984 = this.field1984 * arg3 - (this.field2001 * arg0) >> 16;
                                this.field2001 = var17;
                            }
                            this.field1980 = false;
                            break;
                        }
                        this.field2001 >>= 0x1;
                        this.field1984 >>= 0x1;
                        this.field1996 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22 = this.field1996;
                    int var23 = this.field2001;
                    int var24 = this.field1984;
                    if (this.field1991.field3043 > 0 || this.field1991.field3055 > 0) {
                        int var25 = (int) ((double) this.field1970 * Math.random()) + this.field1983;
                        int var26 = var25 & 0x7FF;
                        int var27 = class15.field278[var26] >> 1;
                        int var28 = class15.field280[var26] >> 1;
                        int var29 = this.field1997 + (int) ((double) this.field2000 * Math.random());
                        int var30 = var29 & 0x3FF;
                        int var31 = class15.field278[var30] >> 1;
                        var24 = var27 * var31 >> 16;
                        var23 = var28 * var31 >> 16;
                        int var32 = class15.field280[var30] >> 1;
                        var22 = var32 * -1;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var33 - var35;
                    int var37 = this.field1981 * var33 + this.field1977 * var36 + (this.field1994 * var35) >> 8;
                    int var38 = this.field2003 * var35 + (this.field1972 * var33 + (this.field1978 * var36)) >> 8;
                    int var39 = this.field1968 * var33 + this.field1999 * var35 + this.field1988 * var36 >> 8;
                    if (this.field1971.field4036 != 0) {
                        int var40 = arg0 * var39 + (arg3 * var37) >> 16;
                        var39 = arg3 * var39 - (arg0 * var37) >> 16;
                        var37 = var40;
                    }
                    int var41 = (int) ((double) (this.field1991.field3061 - this.field1991.field3090) * Math.random()) + this.field1991.field3090;
                    int var42 = (int) ((double) (this.field1991.field3080 - this.field1991.field3039) * Math.random()) + this.field1991.field3039;
                    int var45;
                    if (this.field1991.field3047) {
                        double var43 = Math.random();
                        var45 = (int) ((double) this.field1991.field3096 * var43 + (double) this.field1991.field3044) << 24 | (int) ((double) this.field1991.field3079 * var43 + (double) this.field1991.field3098) << 16 | (int) ((double) this.field1991.field3054 * var43 + (double) this.field1991.field3074) << 8 | (int) ((double) this.field1991.field3038 * var43 + (double) this.field1991.field3049);
                    } else {
                        var45 = (int) ((double) this.field1991.field3098 + Math.random() * (double) this.field1991.field3079) << 16 | (int) ((double) this.field1991.field3074 + Math.random() * (double) this.field1991.field3054) << 8 | (int) ((double) this.field1991.field3049 + Math.random() * (double) this.field1991.field3038) | (int) (Math.random() * (double) this.field1991.field3096 + (double) this.field1991.field3044) << 24;
                    }
                    if (class221.field4021 == class221.field4012) {
                        new class225(this, this.field1971.field4044 + var37, this.field1971.field4037 - -var38, this.field1971.field4040 + var39, var23, var22, var24, var42, var41, var45);
                    } else {
                        class225 var46 = class221.field4017[class221.field4021];
                        class221.field4021 = class221.field4021 + 1 & 0x3FF;
                        var46.method1584(this, this.field1971.field4044 + var37, this.field1971.field4037 - -var38, this.field1971.field4040 + var39, var23, var22, var24, var42, var41, var45);
                    }
                }
            }
        }
        this.field2005 = 0;
        if (arg4 != -126) {
            this.field1972 = -115;
        }
        for (class225 var48 = (class225) this.field1986.method1026(true); var48 != null; var48 = (class225) this.field1986.method1020(arg4 ^ 0xFFFFED0B)) {
            var48.method1583(arg2, arg1);
            this.field2005++;
        }
        class221.field4025 += this.field2005;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method705(boolean arg0) {
        field1993 = null;
        field1982 = null;
        field1989 = null;
        field1973 = null;
        if (arg0) {
            method706((class49) null, (byte) -3, 85, 4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lsj;BII)[Ljb;")
    public static final class269[] method706(class49 arg0, byte arg1, int arg2, int arg3) {
        field1985++;
        if (arg1 != -81) {
            field1974 = 74;
        }
        return class117.method833(arg2, arg0, 896, arg3) ? class27.method219(0) : null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIBIIIII)V")
    public final void method707(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1972 = arg9;
        field1979++;
        int var11 = 39 / ((arg4 - 81) / 44);
        this.field1977 = arg6;
        this.field1988 = arg2;
        this.field1968 = arg0;
        this.field1978 = arg5;
        this.field1994 = arg7;
        this.field2003 = arg1;
        this.field1999 = arg8;
        this.field1981 = arg3;
        int var12 = (this.field1999 + this.field1968 + this.field1988) / 3 + this.field1971.field4040;
        int var13 = (this.field1972 - (-this.field2003 - this.field1978)) / 3 + this.field1971.field4037;
        int var14 = (this.field1994 + this.field1981 + this.field1977) / 3 + this.field1971.field4044;
        if (this.field1975 != var14 || this.field1966 != var13 || this.field1967 != var12) {
            this.field1975 = var14;
            this.field1967 = var12;
            this.field1966 = var13;
            this.field1980 = true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lea;Lmd;J)V")
    public class103(class37 arg0, class221 arg1, long arg2) {
        this.field1976 = arg0;
        this.field1971 = arg1;
        this.field1986 = new class147();
        this.field2004 = (int) ((double) this.field2004 + Math.random() * 64.0D);
        this.field1991 = this.field1976.field632;
        this.field1969 = arg2;
    }
}
