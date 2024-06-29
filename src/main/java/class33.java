import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class33 extends class112 {

    @OriginalMember(owner = "client!ih", name = "Pb", descriptor = "S")
    private short field609 = 0;

    @OriginalMember(owner = "client!ih", name = "Nb", descriptor = "I")
    public int field607 = 0;

    @OriginalMember(owner = "client!ih", name = "dc", descriptor = "I")
    public int field623 = 0;

    @OriginalMember(owner = "client!ih", name = "cc", descriptor = "S")
    private short field622 = 0;

    @OriginalMember(owner = "client!ih", name = "Qb", descriptor = "I")
    public int field610 = 0;

    @OriginalMember(owner = "client!ih", name = "Rb", descriptor = "I")
    public int field611 = -1;

    @OriginalMember(owner = "client!ih", name = "Xb", descriptor = "I")
    public int field617 = 0;

    @OriginalMember(owner = "client!ih", name = "nc", descriptor = "I")
    public int field633 = -1;

    @OriginalMember(owner = "client!ih", name = "Ub", descriptor = "I")
    public int field614 = -1;

    @OriginalMember(owner = "client!ih", name = "tc", descriptor = "I")
    public int field639 = 0;

    @OriginalMember(owner = "client!ih", name = "ec", descriptor = "I")
    public int field624 = -1;

    @OriginalMember(owner = "client!ih", name = "uc", descriptor = "I")
    public int field640 = 0;

    @OriginalMember(owner = "client!ih", name = "zc", descriptor = "Z")
    public boolean field645 = false;

    @OriginalMember(owner = "client!ih", name = "xc", descriptor = "I")
    public int field643 = 0;

    @OriginalMember(owner = "client!ih", name = "rc", descriptor = "I")
    public int field637 = -1;

    @OriginalMember(owner = "client!ih", name = "Ac", descriptor = "I")
    public int field646 = -1;

    @OriginalMember(owner = "client!ih", name = "Cc", descriptor = "I")
    private int field648 = 0;

    @OriginalMember(owner = "client!ih", name = "hc", descriptor = "Ljf;")
    private static class229 field627 = class212.method1457((byte) 99, "Started 3d Library");

    @OriginalMember(owner = "client!ih", name = "oc", descriptor = "Ljf;")
    public static class229 field634 = field627;

    @OriginalMember(owner = "client!ih", name = "qc", descriptor = "I")
    public static int field636 = 1;

    @OriginalMember(owner = "client!ih", name = "gc", descriptor = "Ljf;")
    public static class229 field626 = class212.method1457((byte) 108, ":");

    @OriginalMember(owner = "client!ih", name = "Mb", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ih", name = "Ob", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!ih", name = "Vb", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!ih", name = "Wb", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ih", name = "Yb", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ih", name = "Zb", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!ih", name = "ac", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ih", name = "fc", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!ih", name = "ic", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!ih", name = "jc", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!ih", name = "kc", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ih", name = "lc", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ih", name = "mc", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ih", name = "pc", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!ih", name = "sc", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ih", name = "vc", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ih", name = "wc", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ih", name = "Bc", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ih", name = "yc", descriptor = "Lek;")
    public static class185 field644;

    @OriginalMember(owner = "client!ih", name = "Sb", descriptor = "Lrl;")
    public class196 field612;

    @OriginalMember(owner = "client!ih", name = "Tb", descriptor = "Ldk;")
    public class214 field613;

    @OriginalMember(owner = "client!ih", name = "bc", descriptor = "Ljf;")
    public class229 field621;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)I", line = 22)
    public final int method299(boolean arg0) {
        field616++;
        if (this.field613 == null || this.field613.field3667 == -1) {
            if (!arg0) {
                this.field615 = -80;
            }
            return super.method299(true);
        } else {
            return class224.method1541((byte) 20, this.field613.field3667).field2952;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILrl;ILki;IIIIIIIIII)V", line = 48)
    private final void method300(int arg0, int arg1, class196 arg2, int arg3, class164 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field631++;
        int var16 = arg3 * arg3 + arg14 * arg14;
        if (var16 < 16 || var16 > 360000) {
            return;
        }
        int var17 = (int) (Math.atan2((double) arg14, (double) arg3) * 325.949D) & 0x7FF;
        class196 var18 = class185.method1287(var17, arg2, this.field1973, (byte) 43, this.field1983, arg12, this.field2028);
        if (arg13 != -384281296 || var18 == null) {
            return;
        }
        if (!class108.field1900) {
            var18.method190(0, arg7, arg6, arg11, arg1, arg9, arg0, arg10, -1L, arg8, arg4);
            return;
        }
        float var19 = class108.method755();
        float var20 = class108.method754();
        class108.method769();
        class108.method745(var19, var20 - 150.0F);
        var18.method190(0, arg7, arg6, arg11, arg1, arg9, arg0, arg10, -1L, arg8, arg4);
        class108.method767();
        class108.method745(var19, var20);
    }

    @OriginalMember(owner = "client!ih", name = "finalize", descriptor = "()V", line = 96)
    protected final void finalize() {
        field630++;
        if (this.field2035 != null) {
            this.field2035.method1114();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()I", line = 114)
    public final int method201() {
        field638++;
        return this.field2022;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZIZI)V", line = 125)
    public final void method301(boolean arg0, int arg1, boolean arg2, int arg3) {
        field641++;
        if (arg2) {
            field626 = (class229) null;
        }
        super.method795(arg0, (byte) 56, arg1, arg3, this.method299(true));
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)Z", line = 137)
    public final boolean method302(int arg0) {
        field647++;
        if (arg0 != 0) {
            field644 = (class185) null;
        }
        return this.field613 != null;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V", line = 154)
    public static void method303(int arg0) {
        field634 = null;
        field627 = null;
        field626 = null;
        field644 = null;
        if (arg0 != 0) {
            method303(-62);
        }
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)Ljf;", line = 175)
    public final class229 method304(int arg0) {
        field606++;
        if (arg0 != 24930) {
            this.finalize();
        }
        class229 var2 = this.field621;
        if (class104.field1813 != null) {
            var2 = class142.method989(new class229[] { class104.field1813[this.field648], var2 }, -96);
        }
        if (class96.field1710 != null) {
            var2 = class142.method989(new class229[] { var2, class96.field1710[this.field648] }, arg0 ^ 0xFFFF9EBD);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIJILki;)V", line = 216)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class164 arg10) {
        field632++;
        if (this.field613 == null) {
            return;
        }
        class194 var13 = this.field2000 != -1 && this.field2016 == 0 ? class280.method1965(this.field2000, -123) : null;
        class194 var14 = this.field2025 == -1 || this.field645 || this.field2025 == this.field1986 && var13 != null ? null : class280.method1965(this.field2025, 115);
        class196 var15 = this.field613.method1476(this.field1971, var13, var14, this.field1990, (byte) -70);
        if (var15 == null) {
            return;
        }
        this.field2022 = var15.method201();
        if (class45.field825 && (this.field613.field3667 == -1 || class224.method1541((byte) 20, this.field613.field3667).field2921)) {
            class196 var16 = class228.method1603(0, var14 == null ? this.field1990 : this.field1971, 0, 1, this.field1973, var15, this.field2028, var14 == null ? var13 : var14, 1, this.field1983, 160, this.field2034, arg0, 240);
            if (class108.field1900) {
                float var17 = class108.method755();
                float var18 = class108.method754();
                class108.method769();
                class108.method745(var17, var18 - 150.0F);
                var16.method190(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class164) null);
                class108.method767();
                class108.method745(var17, var18);
            } else {
                var16.method190(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class164) null);
            }
        }
        if (class301.field5124 == this) {
            for (int var19 = class279.field4777.length - 1; var19 >= 0; var19--) {
                class191 var20 = class279.field4777[var19];
                if (var20 != null && var20.field3309 != -1) {
                    if (var20.field3314 == 1 && var20.field3311 >= 0 && var20.field3311 < class331.field5637.length) {
                        class331 var21 = class331.field5637[var20.field3311];
                        if (var21 != null) {
                            int var22 = var21.field2028 / 32 - (class301.field5124.field2028 / 32);
                            int var23 = var21.field1983 / 32 - (class301.field5124.field1983 / 32);
                            this.method300(arg6, arg4, var15, var22, (class164) null, arg0, arg2, arg1, arg9, arg5, arg7, arg3, var20.field3309, -384281296, var23);
                        }
                    }
                    if (var20.field3314 == 2) {
                        int var24 = (var20.field3306 - class258.field4503) * 4 + 2 - (class301.field5124.field1983 / 32);
                        int var25 = (var20.field3320 - class213.field3649) * 4 + 2 - class301.field5124.field2028 / 32;
                        this.method300(arg6, arg4, var15, var25, (class164) null, arg0, arg2, arg1, arg9, arg5, arg7, arg3, var20.field3309, -384281296, var24);
                    }
                    if (var20.field3314 == 10 && var20.field3311 >= 0 && class192.field3334.length > var20.field3311) {
                        class33 var26 = class192.field3334[var20.field3311];
                        if (var26 != null) {
                            int var27 = var26.field1983 / 32 - (class301.field5124.field1983 / 32);
                            int var28 = var26.field2028 / 32 - (class301.field5124.field2028 / 32);
                            this.method300(arg6, arg4, var15, var28, (class164) null, arg0, arg2, arg1, arg9, arg5, arg7, arg3, var20.field3309, -384281296, var27);
                        }
                    }
                }
            }
        }
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        if (this.field622 != 0 && this.field609 != 0) {
            int var32 = class227.field3896[arg0];
            int var33 = class227.field3911[arg0];
            short var34 = this.field622;
            int var35 = -var34 / 2;
            short var36 = this.field609;
            int var37 = -var36 / 2;
            int var38 = var32 * var37 + var33 * var35 >> 16;
            int var39 = var33 * var37 - (var32 * var35) >> 16;
            int var40 = var34 / 2;
            int var41 = -var36 / 2;
            int var42 = var32 * var41 + var33 * var40 >> 16;
            int var43 = class282.method1984((byte) -126, this.field2028 + var39, this.field1983 + var38, class16.field254);
            int var44 = -var34 / 2;
            int var45 = var33 * var41 - (var32 * var40) >> 16;
            int var46 = class282.method1984((byte) -120, this.field2028 + var45, this.field1983 + var42, class16.field254);
            int var47 = var36 / 2;
            int var48 = var32 * var47 + var33 * var44 >> 16;
            int var49 = var33 * var47 - (var32 * var44) >> 16;
            int var50 = class282.method1984((byte) -114, this.field2028 + var49, this.field1983 + var48, class16.field254);
            int var51 = var34 / 2;
            int var52 = var36 / 2;
            int var53 = var32 * var52 + var33 * var51 >> 16;
            int var54 = var33 * var52 - (var32 * var51) >> 16;
            int var55 = var46 <= var43 ? var46 : var43;
            int var56 = class282.method1984((byte) -93, this.field2028 + var54, this.field1983 + var53, class16.field254);
            int var57 = var50 < var56 ? var50 : var56;
            int var58 = var56 <= var46 ? var56 : var46;
            var29 = (int) (Math.atan2((double) (var55 - var57), (double) var36) * 325.95D) & 0x7FF;
            int var59 = var43 + var56;
            if (var29 != 0) {
                var15.method286(var29);
            }
            int var60 = var43 >= var50 ? var50 : var43;
            var30 = (int) (Math.atan2((double) (var60 - var58), (double) var34) * 325.95D) & 0x7FF;
            if ((var46 + var50) < var59) {
                var59 = var46 + var50;
            }
            if (var30 != 0) {
                var15.method292(var30);
            }
            var31 = (var59 >> 1) - this.field1973;
            if (var31 != 0) {
                var15.method266(0, var31, 0);
            }
        }
        class196 var61 = null;
        if (!this.field645 && this.field1999 != -1 && this.field1968 != -1) {
            class224 var62 = class66.method492(8, this.field1999);
            var61 = var62.method1545(this.field1968, (byte) 103);
            if (var61 != null) {
                var61.method266(0, -this.field1991, 0);
                if (var62.field3816) {
                    if (var29 != 0) {
                        var61.method286(var29);
                    }
                    if (var30 != 0) {
                        var61.method292(var30);
                    }
                    if (var31 != 0) {
                        var61.method266(0, var31, 0);
                    }
                }
            }
        }
        class196 var63 = null;
        if (!this.field645 && this.field612 != null) {
            if (this.field639 <= class199.field3475) {
                this.field612 = null;
            }
            if (class199.field3475 >= this.field643 && this.field639 > class199.field3475) {
                var63 = this.field612;
                var63.method266(this.field628 - this.field1983, -this.field1973 + this.field635, this.field625 - this.field2028);
                if (this.field1964 == 512) {
                    var63.method267();
                } else if (this.field1964 == 1024) {
                    var63.method270();
                } else if (this.field1964 == 1536) {
                    var63.method281();
                }
            }
        }
        if (class108.field1900) {
            this.method798(-115, var15);
            var15.field3398 = true;
            var15.method190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2035);
            if (var61 != null) {
                if (this.field2035 != null) {
                    class239 var64 = (class239) var61;
                    this.field2035.method1122(var64.field4203, var64.field4191, true, var64.field4186, var64.field4192, var64.field4214);
                }
                var61.field3398 = true;
                var61.method190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2035);
            }
        } else {
            if (var61 != null) {
                var15 = ((class32) var15).method287(var61);
            }
            if (var63 != null) {
                var15 = ((class32) var15).method287(var63);
            }
            this.method798(-125, var15);
            var15.field3398 = true;
            var15.method190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2035);
        }
        if (var63 == null) {
            return;
        }
        if (this.field1964 == 512) {
            var63.method281();
        } else if (this.field1964 == 1024) {
            var63.method270();
        } else if (this.field1964 == 1536) {
            var63.method267();
        }
        var63.method266(this.field1983 - this.field628, this.field1973 - this.field635, this.field2028 - this.field625);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lkh;I)V", line = 540)
    public final void method305(class14 arg0, int arg1) {
        arg0.field195 = 0;
        int var3 = arg0.method93(false);
        boolean var4 = (var3 & 0x4) != 0;
        field642++;
        if ((var3 & 0x2) == 2) {
            this.field622 = (short) (arg0.method93(false) << 2);
            this.field609 = (short) (arg0.method93(false) << 2);
        } else {
            this.field609 = 0;
            this.field622 = 0;
        }
        int var5 = var3 & 0x1;
        int var6 = super.method299(true);
        int[] var7 = new int[12];
        int var8 = -1;
        this.method792((var3 >> 3 & 0x7) + 1, -21715);
        this.field648 = (var3 & 0xE8) >> 6;
        this.field1983 += (this.method299(true) - var6) * 64;
        this.field2028 += (this.method299(true) - var6) * 64;
        this.field633 = arg0.method98(true);
        this.field637 = arg0.method98(true);
        this.field607 = 0;
        int var9 = 0;
        if (arg1 != 32) {
            this.finalize();
        }
        while (var9 < 12) {
            int var10 = arg0.method93(false);
            if (var10 == 0) {
                var7[var9] = 0;
            } else {
                int var11 = arg0.method93(false);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var8 = arg0.method116(-1);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class245.field4361[var12 - 32768];
                    var7[var9] = class97.method665(1073741824, var13);
                    int var14 = class113.method799(var13, (byte) 50).field5329;
                    if (var14 != 0) {
                        this.field607 = var14;
                    }
                } else {
                    var7[var9] = class97.method665(var12 - 256, Integer.MIN_VALUE);
                }
            }
            var9++;
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method93(false);
            if (var17 < 0 || var17 >= class237.field4113[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field1986 = arg0.method116(-1);
        if (this.field1986 == 65535) {
            this.field1986 = -1;
        }
        this.field2027 = arg0.method116(-1);
        if (this.field2027 == 65535) {
            this.field2027 = -1;
        }
        this.field1994 = this.field2027;
        this.field1981 = arg0.method116(-1);
        if (this.field1981 == 65535) {
            this.field1981 = -1;
        }
        this.field2026 = arg0.method116(-1);
        if (this.field2026 == 65535) {
            this.field2026 = -1;
        }
        this.field2008 = arg0.method116(arg1 - 33);
        if (this.field2008 == 65535) {
            this.field2008 = -1;
        }
        this.field2030 = arg0.method116(-1);
        if (this.field2030 == 65535) {
            this.field2030 = -1;
        }
        this.field2019 = arg0.method116(-1);
        if (this.field2019 == 65535) {
            this.field2019 = -1;
        }
        long var18 = arg0.method132(arg1 ^ 0xFFFFFFDF);
        this.field621 = class252.method1800(false, var18).method1606((byte) 95);
        this.field623 = arg0.method93(false);
        if (var4) {
            this.field610 = arg0.method116(-1);
            this.field646 = -1;
            this.field617 = this.field623;
        } else {
            this.field610 = 0;
            this.field617 = arg0.method93(false);
            this.field646 = arg0.method93(false);
            if (this.field646 == 255) {
                this.field646 = -1;
            }
        }
        int var20 = this.field640;
        this.field640 = arg0.method93(false);
        if (this.field640 == 0) {
            class280.method1963(this, (byte) 86);
        } else {
            int var21 = this.field614;
            int var22 = this.field624;
            int var23 = this.field611;
            this.field624 = arg0.method116(-1);
            this.field614 = arg0.method116(-1);
            this.field611 = arg0.method116(-1);
            if (this.field640 != var20 || this.field624 != var22 || this.field614 != var21 || this.field611 != var23) {
                class277.method1953(this, (byte) -90);
            }
        }
        if (this.field613 == null) {
            this.field613 = new class214();
        }
        int var24 = this.field613.field3667;
        this.field613.method1468(var15, var7, var5 == 1, true, var8);
        if (var8 != var24) {
            this.field1983 = this.field2018[0] * 128 + (this.method299(true) * 64);
            this.field2028 = this.field2017[0] * 128 + (this.method299(true) * 64);
        }
        if (this.field2035 != null) {
            this.field2035.method1126();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V", line = 737)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field620++;
        if (!this.field1997) {
            if (this.field613 == null) {
                return;
            }
            class194 var6 = this.field2000 != -1 && this.field2016 == 0 ? class280.method1965(this.field2000, -83) : null;
            class194 var7 = this.field2025 == -1 || this.field645 || this.field2025 == this.field1986 && var6 != null ? null : class280.method1965(this.field2025, 48);
            class196 var8 = this.field613.method1476(this.field1971, var6, var7, this.field1990, (byte) -70);
            if (var8 == null) {
                return;
            }
            this.method798(-124, var8);
        }
        if (this.field2035 != null) {
            this.field2035.method1108(arg0, arg1, arg3, arg2, arg4);
        }
    }
}
