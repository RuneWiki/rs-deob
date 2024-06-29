import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class135 extends class503 {

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    private int field1980 = 0;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "Z")
    public boolean field1986 = false;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "Loi;")
    public class79 field1987 = new class79();

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "Loi;")
    private class79 field1991 = new class79();

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "Z")
    private boolean field1992 = false;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Lsp;")
    public class663 field1981;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "Lcba;")
    public class577 field1982;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "J")
    private long field1984;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "Lnd;")
    public class571 field1990;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "Lvl;")
    public class15 field1979;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "F")
    public static float field1974 = 0.0F;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    private int field1993;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    private int field1995;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "I")
    private int field1996;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
    private int field1998;

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V", line = 3)
    public final void method1059(byte arg0) {
        this.field1987.field1121 = this.field1982.field7733;
        this.field1987.field1131 = this.field1982.field7738;
        this.field1987.field1135 = this.field1982.field7747;
        this.field1987.field1130 = this.field1982.field7730;
        field1985++;
        if (arg0 >= -68) {
            this.field1990 = null;
        }
        this.field1987.field1129 = this.field1982.field7731;
        this.field1987.field1132 = this.field1982.field7739;
        this.field1987.field1125 = this.field1982.field7748;
        this.field1987.field1137 = this.field1982.field7734;
        this.field1987.field1127 = this.field1982.field7750;
        if (this.field1987.field1132 == this.field1987.field1131 && this.field1987.field1132 == this.field1987.field1129 && this.field1987.field1130 == this.field1987.field1121 && this.field1987.field1135 == this.field1987.field1130 && this.field1987.field1137 == this.field1987.field1125 && this.field1987.field1127 == this.field1987.field1125) {
            this.field1992 = true;
        } else if (this.field1992) {
            this.field1991.field1132 = this.field1987.field1132;
            this.field1991.field1131 = this.field1987.field1131;
            this.field1991.field1125 = this.field1987.field1125;
            this.field1991.field1135 = this.field1987.field1135;
            this.field1991.field1121 = this.field1987.field1121;
            this.field1991.field1127 = this.field1987.field1127;
            this.field1991.field1130 = this.field1987.field1130;
            this.field1991.field1137 = this.field1987.field1137;
            this.field1991.field1129 = this.field1987.field1129;
            this.field1992 = false;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIII)I", line = 46)
    public static final int method1060(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        int var8 = arg1 & 0x3;
        field1976++;
        if (var8 == 0) {
            return arg5;
        }
        if (arg2 != -64) {
            method1061((byte) -113, 70, 14);
        }
        if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg5 - arg4;
        } else {
            return 1 + 7 - arg3 - arg6;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BII)Z", line = 77)
    public static final boolean method1061(byte arg0, int arg1, int arg2) {
        field1975++;
        if (arg0 <= 29) {
            field1974 = -1.2847389F;
        }
        return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BJLha;)V", line = 98)
    public final void method1062(byte arg0, long arg1, class65 arg2) {
        for (class336 var5 = (class336) this.field1979.method109(0); var5 != null; var5 = (class336) this.field1979.method115((byte) 12)) {
            var5.method2133(arg2, arg1);
        }
        if (arg0 > -104) {
            this.method1059((byte) -58);
        }
        field1977++;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lha;IIJZ)V", line = 117)
    public final void method1063(class65 arg0, int arg1, int arg2, long arg3, boolean arg4) {
        if (this.field1986) {
            arg4 = false;
        } else if (this.field1990.field7612 > class786.field10820) {
            arg4 = false;
        } else if (class26.field390[class786.field10820] < class650.field9021) {
            arg4 = false;
        } else if (this.field1992) {
            arg4 = false;
        } else if (this.field1990.field7643 != -1) {
            int var7 = (int) (arg3 - this.field1984);
            if (this.field1990.field7640 || this.field1990.field7643 >= var7) {
                var7 %= this.field1990.field7643;
            } else {
                arg4 = false;
            }
            if (!this.field1990.field7627 && var7 < this.field1990.field7624) {
                arg4 = false;
            }
            if (this.field1990.field7627 && this.field1990.field7624 <= var7) {
                arg4 = false;
            }
        }
        field1978++;
        if (arg4) {
            class114.field1555++;
            int var8 = (this.field1987.field1132 + this.field1987.field1131 + this.field1987.field1129) / 3;
            int var9 = (this.field1987.field1130 + this.field1987.field1121 + this.field1987.field1135) / 3;
            int var10 = (this.field1987.field1137 + this.field1987.field1125 + this.field1987.field1127) / 3;
            if (this.field1987.field1134 != var8 || this.field1987.field1123 != var9 || this.field1987.field1133 != var10) {
                this.field1987.field1123 = var9;
                this.field1987.field1133 = var10;
                this.field1987.field1134 = var8;
                int var11 = this.field1987.field1132 - this.field1987.field1131;
                int var12 = this.field1987.field1130 - this.field1987.field1121;
                int var13 = this.field1987.field1125 - this.field1987.field1137;
                int var14 = this.field1987.field1129 - this.field1987.field1131;
                int var15 = this.field1987.field1135 - this.field1987.field1121;
                int var16 = this.field1987.field1127 - this.field1987.field1137;
                this.field1993 = var12 * var16 - (var13 * var15);
                this.field1998 = var13 * var14 - var11 * var16;
                this.field1996 = var11 * var15 - (var12 * var14);
                while (true) {
                    if (this.field1993 <= 32767 && this.field1998 <= 32767 && this.field1996 <= 32767 && this.field1993 >= -32767 && this.field1998 >= -32767 && this.field1996 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field1996 * this.field1996 + this.field1998 * this.field1998 + this.field1993 * this.field1993));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field1993 = this.field1993 * 32767 / var17;
                        this.field1996 = this.field1996 * 32767 / var17;
                        this.field1998 = this.field1998 * 32767 / var17;
                        if (this.field1990.field7621 > 0 || this.field1990.field7602 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field1996, (double) this.field1993) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field1998, Math.sqrt((double) (this.field1996 * this.field1996 + this.field1993 * this.field1993))) * 2607.5945876176133D);
                            this.field1994 = this.field1990.field7621 - this.field1990.field7647;
                            this.field1999 = this.field1990.field7602 - this.field1990.field7660;
                            this.field1995 = this.field1990.field7647 + var18 - (this.field1994 >> 1);
                            this.field1997 = var19 + this.field1990.field7660 - (this.field1999 >> 1);
                        }
                        break;
                    }
                    this.field1993 >>= 0x1;
                    this.field1996 >>= 0x1;
                    this.field1998 >>= 0x1;
                }
            }
            this.field1980 += (int) ((Math.random() * (double) (this.field1990.field7600 - this.field1990.field7611) + (double) this.field1990.field7611) * (double) arg1);
            if (this.field1980 > 63) {
                int var20 = this.field1980 >> 6;
                this.field1980 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field1990.field7621 <= 0 && this.field1990.field7602 <= 0) {
                        var22 = this.field1998;
                        var23 = this.field1996;
                        var24 = this.field1993;
                    } else {
                        int var25 = this.field1995 + ((int) (Math.random() * (double) this.field1994));
                        int var26 = var25 & 0x3FFF;
                        int var27 = class749.field10324[var26];
                        int var28 = class749.field10316[var26];
                        int var29 = (int) (Math.random() * (double) this.field1999) + this.field1997;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class749.field10324[var30];
                        int var32 = class749.field10316[var30];
                        byte var33 = 13;
                        var22 = (var32 << 1) * -1;
                        var24 = var28 * var31 >> var33;
                        var23 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field1987.field1129 * var36 + (float) this.field1987.field1132 * var35 + (float) this.field1987.field1131 * var34);
                    int var38 = (int) ((float) this.field1987.field1135 * var36 + (float) this.field1987.field1130 * var35 + (float) this.field1987.field1121 * var34);
                    int var39 = (int) ((float) this.field1987.field1127 * var36 + (float) this.field1987.field1137 * var34 + (float) this.field1987.field1125 * var35);
                    int var40 = (int) ((float) this.field1991.field1129 * var36 + (float) this.field1991.field1132 * var35 + (float) this.field1991.field1131 * var34);
                    int var41 = (int) ((float) this.field1991.field1135 * var36 + (float) this.field1991.field1130 * var35 + (float) this.field1991.field1121 * var34);
                    int var42 = (int) ((float) this.field1991.field1127 * var36 + (float) this.field1991.field1137 * var34 + (float) this.field1991.field1125 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + (double) var43 * Math.random());
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var45 * Math.random() + (double) var42);
                    int var49 = (int) (Math.random() * (double) (this.field1990.field7601 - this.field1990.field7655)) + this.field1990.field7655;
                    int var50 = (int) ((double) (this.field1990.field7649 - this.field1990.field7628) * Math.random()) + this.field1990.field7628;
                    int var51 = this.field1990.field7617 + ((int) ((double) (this.field1990.field7635 - this.field1990.field7617) * Math.random()));
                    int var54;
                    if (this.field1990.field7604) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field1990.field7652 + (double) this.field1990.field7614 * Math.random()) << 24 | (int) ((double) this.field1990.field7629 * var52 + (double) this.field1990.field7625) | (int) ((double) this.field1990.field7620 * var52 + (double) this.field1990.field7616) << 8 | (int) ((double) this.field1990.field7605 * var52 + (double) this.field1990.field7634) << 16;
                    } else {
                        var54 = (int) ((double) this.field1990.field7629 * Math.random() + (double) this.field1990.field7625) | (int) ((double) this.field1990.field7605 * Math.random() + (double) this.field1990.field7634) << 16 | (int) (Math.random() * (double) this.field1990.field7620 + (double) this.field1990.field7616) << 8 | (int) (Math.random() * (double) this.field1990.field7614 + (double) this.field1990.field7652) << 24;
                    }
                    int var55 = this.field1990.field7622;
                    if (!arg0.method513() && !this.field1990.field7610) {
                        var55 = -1;
                    }
                    if (class461.field6389 == class418.field6007) {
                        new class336(this, var46, var47, var48, var24, var22, var23, var49, var50, var54, var51, var55, this.field1990.field7650, this.field1990.field7595);
                    } else {
                        class336 var57 = class592.field7969[class418.field6007];
                        class418.field6007 = class418.field6007 + 1 & 0x3FF;
                        var57.method2136(this, var46, var47, var48, var24, var22, var23, var49, var50, var54, var51, var55, this.field1990.field7650, this.field1990.field7595);
                    }
                }
            }
        }
        if (!this.field1987.method675(this.field1991, (byte) -91)) {
            class79 var58 = this.field1991;
            this.field1991 = this.field1987;
            this.field1987 = var58;
            this.field1987.field1127 = this.field1982.field7750;
            this.field1987.field1137 = this.field1982.field7734;
            this.field1987.field1134 = this.field1991.field1134;
            this.field1987.field1125 = this.field1982.field7748;
            this.field1987.field1131 = this.field1982.field7738;
            this.field1987.field1121 = this.field1982.field7733;
            this.field1987.field1130 = this.field1982.field7730;
            this.field1987.field1123 = this.field1991.field1123;
            this.field1987.field1135 = this.field1982.field7747;
            this.field1987.field1133 = this.field1991.field1133;
            this.field1987.field1129 = this.field1982.field7731;
            this.field1987.field1132 = this.field1982.field7739;
        }
        this.field1989 = 0;
        for (class336 var59 = (class336) this.field1979.method109(0); var59 != null; var59 = (class336) this.field1979.method115((byte) 3)) {
            var59.method2135(arg3, arg1);
            this.field1989++;
        }
        if (arg2 == -80863512) {
            class491.field6814 += this.field1989;
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lha;Lcba;Lsp;J)V", line = 412)
    public class135(class65 arg0, class577 arg1, class663 arg2, long arg3) {
        this.field1981 = arg2;
        this.field1982 = arg1;
        this.field1984 = arg3;
        this.field1990 = this.field1982.method3218(false);
        if (!arg0.method513() && this.field1990.field7631 != -1) {
            this.field1990 = class440.method2648(this.field1990.field7631, false);
        }
        this.field1979 = new class15();
        this.field1980 = (int) ((double) this.field1980 + Math.random() * 64.0D);
        this.method1059((byte) -80);
        this.field1991.field1132 = this.field1987.field1132;
        this.field1991.field1121 = this.field1987.field1121;
        this.field1991.field1131 = this.field1987.field1131;
        this.field1991.field1127 = this.field1987.field1127;
        this.field1991.field1130 = this.field1987.field1130;
        this.field1991.field1125 = this.field1987.field1125;
        this.field1991.field1135 = this.field1987.field1135;
        this.field1991.field1137 = this.field1987.field1137;
        this.field1991.field1129 = this.field1987.field1129;
    }
}
