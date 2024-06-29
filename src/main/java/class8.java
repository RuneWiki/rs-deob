import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class494 {

    @OriginalMember(owner = "client!to", name = "V", descriptor = "I")
    private int field67 = -1;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    private int field63 = 0;

    @OriginalMember(owner = "client!to", name = "Db", descriptor = "I")
    private int field101 = 0;

    @OriginalMember(owner = "client!to", name = "Hb", descriptor = "Z")
    private boolean field105 = false;

    @OriginalMember(owner = "client!to", name = "zb", descriptor = "Z")
    private boolean field97 = false;

    @OriginalMember(owner = "client!to", name = "Kb", descriptor = "I")
    private int field108 = 0;

    @OriginalMember(owner = "client!to", name = "U", descriptor = "I")
    private int field66 = 0;

    @OriginalMember(owner = "client!to", name = "tb", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!to", name = "T", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!to", name = "Mb", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!to", name = "yb", descriptor = "Z")
    private boolean field96;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!to", name = "rb", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!to", name = "sb", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!to", name = "Nb", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client!to", name = "hb", descriptor = "I")
    private int field79;

    @OriginalMember(owner = "client!to", name = "Lb", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!to", name = "nb", descriptor = "I")
    private int field85;

    @OriginalMember(owner = "client!to", name = "bb", descriptor = "Lhg;")
    private class691 field73;

    @OriginalMember(owner = "client!to", name = "vb", descriptor = "I")
    public static int field93 = -1;

    @OriginalMember(owner = "client!to", name = "Ib", descriptor = "D")
    private double field106;

    @OriginalMember(owner = "client!to", name = "Jb", descriptor = "D")
    private double field107;

    @OriginalMember(owner = "client!to", name = "Ob", descriptor = "D")
    private double field112;

    @OriginalMember(owner = "client!to", name = "X", descriptor = "D")
    private double field69;

    @OriginalMember(owner = "client!to", name = "jb", descriptor = "D")
    private double field81;

    @OriginalMember(owner = "client!to", name = "kb", descriptor = "D")
    private double field82;

    @OriginalMember(owner = "client!to", name = "Ab", descriptor = "D")
    private double field98;

    @OriginalMember(owner = "client!to", name = "Bb", descriptor = "D")
    private double field99;

    @OriginalMember(owner = "client!to", name = "Cb", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!to", name = "Eb", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!to", name = "Fb", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!to", name = "Gb", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!to", name = "Pb", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!to", name = "W", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!to", name = "Y", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!to", name = "Z", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!to", name = "ab", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!to", name = "cb", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!to", name = "db", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!to", name = "fb", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!to", name = "gb", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!to", name = "ib", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!to", name = "lb", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!to", name = "mb", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!to", name = "ob", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!to", name = "pb", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!to", name = "qb", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!to", name = "ub", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!to", name = "wb", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!to", name = "xb", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!to", name = "eb", descriptor = "Luj;")
    private class385 field76;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(Lha;I)V")
    public final void method31(class59 arg0, int arg1) {
        ++field77;
        class472 var3 = this.method47(0, arg0, (byte) 127);
        if (var3 != null) {
            if (arg1 >= -125) {
                this.field64 = 56;
            }
            class661 var4 = arg0.method322();
            var4.method749(this.field94);
            var4.method774(this.field84);
            var4.method752((int) this.field106, (int) this.field82, (int) this.field69);
            this.field108 = var3.method486();
            this.field66 = var3.method513();
            this.method36(var4, var3, arg0, -2393);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BIIII)V")
    public final void method32(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field105) {
            double var6 = (double) (-super.field5922 + arg4);
            double var8 = (double) (-super.field5933 + arg2);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field106 = (double) this.field91 * var6 / var10 + (double) super.field5922;
            this.field69 = (double) this.field91 * var8 / var10 + (double) super.field5933;
            if (!this.field96) {
                this.field82 = (double) super.field5927;
            } else {
                this.field82 = (double) (class197.method1403((int) this.field106, super.field5926, 11219, (int) this.field69) - this.field111);
            }
        }
        ++field103;
        if (arg0 != -103) {
            this.field79 = 104;
        }
        double var12 = (double) (this.field90 + 1 + -arg3);
        this.field112 = ((double) arg2 - this.field69) / var12;
        this.field99 = ((double) arg4 - this.field106) / var12;
        this.field98 = Math.sqrt(this.field99 * this.field99 + this.field112 * this.field112);
        if (~this.field79 != 0) {
            if (!this.field105) {
                this.field107 = -this.field98 * Math.tan((double) this.field79 * 0.02454369D);
            }
            this.field81 = ((double) arg1 - this.field82 - this.field107 * var12) * 2.0D / (var12 * var12);
        } else {
            this.field107 = ((double) arg1 - this.field82) / var12;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lha;IZLga;IBI)V")
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        if (arg5 > -106) {
            this.method39((byte) 11);
        }
        ++field113;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!to", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field88;
        if (this.field76 != null) {
            this.field76.method2428();
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public final void method34(int arg0) {
        if (this.field76 != null) {
            this.field76.method2428();
        }
        ++field102;
        if (arg0 != -2159) {
            this.field97 = false;
        }
    }

    @OriginalMember(owner = "client!to", name = "j", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        ++field72;
        if (arg0 >= -65) {
            this.field99 = -1.299791202228721D;
        }
        return false;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lbca;Lka;Lha;I)V")
    private final void method36(class661 arg0, class472 arg1, class59 arg2, int arg3) {
        ++field104;
        arg1.method523(arg0);
        class417[] var5 = arg1.method494();
        class755[] var6 = arg1.method525();
        if ((this.field76 == null || this.field76.field5582) && (var5 != null || var6 != null)) {
            this.field76 = class385.method2420(class641.field8810, true);
        }
        if (this.field76 != null) {
            this.field76.method2430(arg2, (long) class641.field8810, var5, var6, false);
            this.field76.method2427(super.field5926, super.field6831, super.field6839, super.field6838, super.field6835);
        }
        if (arg3 != -2393) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!to", name = "i", descriptor = "(I)I")
    public final int method37(int arg0) {
        if (arg0 != -25675) {
            return -92;
        } else {
            ++field83;
            return this.field66;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(Z)I")
    public final int method38(boolean arg0) {
        ++field70;
        return !arg0 ? 99 : this.field108;
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(B)V")
    public final void method39(byte arg0) {
        ++field92;
        if (!this.field105) {
            if (arg0 == 121) {
                if (~this.field85 != -1) {
                    class390 var2 = null;
                    if (~this.field85 > -1) {
                        int var3 = -this.field85 + -1;
                        if (~class561.field7752 == ~var3) {
                            var2 = class58.field1147;
                        } else {
                            var2 = class49.field1040[var3];
                        }
                    } else {
                        int var4 = this.field85 + -1;
                        class751 var5 = (class751) class86.field1546.method1465((long) var4, -6008);
                        if (var5 != null) {
                            var2 = var5.field10510;
                        }
                    }
                    if (var2 != null) {
                        super.field5933 = var2.field5933;
                        super.field5922 = var2.field5922;
                        super.field5927 = class197.method1403(var2.field5922, super.field5926, 11219, var2.field5933) + -this.field111;
                        if (this.field65 >= 0) {
                            class399 var6 = var2.method2445((byte) 72);
                            int var7 = 0;
                            int var8 = 0;
                            if (var6.field5883 != null && var6.field5883[this.field65] != null) {
                                var7 += var6.field5883[this.field65][0];
                                var8 += var6.field5883[this.field65][2];
                            }
                            if (var6.field5854 != null && var6.field5854[this.field65] != null) {
                                var8 += var6.field5854[this.field65][2];
                                var7 += var6.field5854[this.field65][0];
                            }
                            if (~var7 != -1 || ~var8 != -1) {
                                int var9 = var2.field5643.method1611((byte) -91);
                                int var10 = var9;
                                if (var2.field5722 != null && ~var2.field5722[this.field65] != 0) {
                                    var10 = var2.field5722[this.field65];
                                }
                                int var11 = 16383 & -var9 + var10;
                                int var12 = class255.field3698[var11];
                                int var13 = class255.field3695[var11];
                                int var14 = var7 * var13 + var8 * var12 >> 14;
                                int var15 = var8 * var13 + -(var7 * var12) >> 14;
                                super.field5922 += var14;
                                super.field5933 += var15;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lha;I)Lhw;")
    public final class132 method40(class59 arg0, int arg1) {
        if (arg1 != 7) {
            this.field105 = true;
        }
        ++field74;
        return null;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(ILha;)Ljda;")
    public final class228 method41(int arg0, class59 arg1) {
        ++field95;
        class472 var3 = this.method47(2048, arg1, (byte) 127);
        if (var3 == null) {
            return null;
        } else {
            class661 var4 = arg1.method322();
            var4.method749(this.field94);
            var4.method774(this.field84);
            var4.method752((int) this.field106, (int) this.field82, (int) this.field69);
            this.method36(var4, var3, arg1, -2393);
            class228 var5 = class345.method2171(arg0, false, false);
            if (!class458.field6459) {
                var3.method521(var4, var5.field3313[0], 0);
            } else {
                var3.method497(var4, var5.field3313[0], class58.field1146, 0);
            }
            if (this.field76 != null) {
                class266 var6 = this.field76.method2419();
                if (class458.field6459) {
                    arg1.method295(var6, class58.field1146);
                } else {
                    arg1.method208(var6);
                }
            }
            this.field97 = var3.method488();
            this.field108 = var3.method486();
            this.field66 = var3.method513();
            return var5;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return true;
        } else {
            ++field78;
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)V")
    public final void method43(byte arg0, int arg1) {
        this.field105 = true;
        ++field86;
        this.field106 += (double) arg1 * this.field99;
        this.field69 += (double) arg1 * this.field112;
        if (this.field96) {
            this.field82 = (double) (class197.method1403((int) this.field106, super.field5926, 11219, (int) this.field69) + -this.field111);
        } else if (~this.field79 == 0) {
            this.field82 += (double) arg1 * this.field107;
        } else {
            this.field82 += this.field81 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field107;
            this.field107 += (double) arg1 * this.field81;
        }
        this.field84 = 16383 & 8192 + (int) (Math.atan2(this.field99, this.field112) * 2607.5945876176133D);
        this.field94 = (int) (Math.atan2(this.field107, this.field98) * 2607.5945876176133D) & 16383;
        if (arg0 <= 33) {
            this.method37(-27);
        }
        if (this.field73 != null) {
            this.field101 += arg1;
            while (true) {
                do {
                    do {
                        if (~this.field101 >= ~this.field73.field9357[this.field63]) {
                            return;
                        }
                        this.field101 -= this.field73.field9357[this.field63];
                        ++this.field63;
                        if (~this.field73.field9327.length >= ~this.field63) {
                            this.field63 -= this.field73.field9328;
                            if (~this.field63 > -1 || this.field63 >= this.field73.field9327.length) {
                                this.field63 = 0;
                            }
                        }
                        this.field67 = this.field63 - -1;
                    } while (this.field73.field9327.length > this.field67);
                    this.field67 -= this.field73.field9328;
                } while (this.field67 >= 0 && ~this.field73.field9327.length < ~this.field67);
                this.field67 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        if (!arg0) {
            this.field109 = -29;
        }
        ++field100;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        super(arg1, arg2, arg3, class197.method1403(arg3, arg1, 11219, arg4) + -arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
        this.field91 = arg9;
        this.field65 = arg14;
        this.field110 = arg11;
        this.field96 = arg13;
        this.field105 = false;
        this.field64 = arg12;
        this.field89 = arg0;
        this.field90 = arg7;
        this.field111 = arg5;
        this.field79 = arg8;
        this.field109 = arg6;
        this.field85 = arg10;
        int var16 = class104.field1840.method3016((byte) 72, this.field89).field8980;
        if (var16 != -1) {
            this.field73 = class456.field6436.method1021(var16, 7);
        } else {
            this.field73 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        if (arg0 >= -12) {
            return false;
        } else {
            ++field71;
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(B)V")
    public final void method46(byte arg0) {
        super.field6831 = super.field6839 = (short) ((int) (this.field106 / 512.0D));
        super.field6838 = super.field6835 = (short) ((int) (this.field69 / 512.0D));
        if (arg0 > -109) {
            this.method41(47, (class59) null);
        }
        ++field68;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILha;B)Lka;")
    private final class472 method47(int arg0, class59 arg1, byte arg2) {
        ++field75;
        class654 var4 = class104.field1840.method3016((byte) 75, this.field89);
        if (arg2 < 126) {
            this.field76 = null;
        }
        return var4.method3694(this.field63, arg1, this.field101, arg0, this.field67, class456.field6436, (byte) 121);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method48(String arg0, String arg1, byte arg2, int arg3, String arg4, String arg5, int arg6, int arg7, String arg8) {
        ++field80;
        class649 var9 = class42.field977[99];
        for (int var10 = 99; ~var10 < -1; --var10) {
            class42.field977[var10] = class42.field977[var10 + -1];
        }
        if (var9 == null) {
            var9 = new class649(arg6, arg7, arg4, arg0, arg8, arg5, arg3, arg1);
        } else {
            var9.method3676(arg6, arg7, arg8, arg0, arg5, -18691, arg3, arg4, arg1);
        }
        class42.field977[0] = var9;
        class587.field8005 = class253.field3660;
        if (arg2 <= -109) {
            ++class599.field8217;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z")
    public final boolean method49(byte arg0) {
        ++field87;
        if (arg0 != 122) {
            this.field76 = null;
        }
        return this.field97;
    }
}
