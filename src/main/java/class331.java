import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class331 extends class112 {

    @OriginalMember(owner = "client!bf", name = "Vb", descriptor = "[Lbf;")
    public static class331[] field5637 = new class331[32768];

    @OriginalMember(owner = "client!bf", name = "Sb", descriptor = "Ljf;")
    public static class229 field5634 = class212.method1457((byte) 126, "loginscreen");

    @OriginalMember(owner = "client!bf", name = "Wb", descriptor = "Ljf;")
    public static class229 field5638 = class212.method1457((byte) 87, "");

    @OriginalMember(owner = "client!bf", name = "Nb", descriptor = "Ljf;")
    public static class229 field5629 = field5638;

    @OriginalMember(owner = "client!bf", name = "ec", descriptor = "Ljf;")
    public static class229 field5646 = class212.method1457((byte) 78, "ul");

    @OriginalMember(owner = "client!bf", name = "Yb", descriptor = "Ljf;")
    public static class229 field5640 = class212.method1457((byte) 116, ")2");

    @OriginalMember(owner = "client!bf", name = "Zb", descriptor = "Ljf;")
    public static class229 field5641 = field5638;

    @OriginalMember(owner = "client!bf", name = "Mb", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!bf", name = "Ob", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!bf", name = "Qb", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!bf", name = "Rb", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!bf", name = "Tb", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!bf", name = "Ub", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!bf", name = "Xb", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!bf", name = "ac", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!bf", name = "bc", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!bf", name = "cc", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!bf", name = "dc", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!bf", name = "fc", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!bf", name = "gc", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!bf", name = "Pb", descriptor = "Leh;")
    public class169 field5631;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V", line = 5)
    public static void method2254(int arg0) {
        field5640 = null;
        if (arg0 != 19522) {
            method2259(-91, 67);
        }
        field5641 = null;
        field5634 = null;
        field5637 = null;
        field5638 = null;
        field5646 = null;
        field5629 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I", line = 22)
    public final int method201() {
        field5636++;
        return this.field2022;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z", line = 33)
    public final boolean method302(int arg0) {
        field5647++;
        if (this.field5631 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method201();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V", line = 51)
    public static final void method2255(byte arg0, int arg1, int arg2) {
        field5648++;
        class122 var3 = class323.method2175(7, arg1, -25873);
        var3.method862(-29044);
        if (arg0 <= 38) {
            field5640 = (class229) null;
        }
        var3.field2144 = arg2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLeh;)V", line = 65)
    public final void method2256(byte arg0, class169 arg1) {
        this.field5631 = arg1;
        if (this.field2035 != null) {
            this.field2035.method1126();
        }
        field5644++;
        if (arg0 > -28) {
            method2257((byte) 32);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I", line = 81)
    public static final int method2257(byte arg0) {
        class173.field3017 = 0;
        if (arg0 < 38) {
            method2259(66, -38);
        }
        field5630++;
        return class140.method982(1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V", line = 94)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5632++;
        if (this.field5631 == null) {
            return;
        }
        if (!this.field1997) {
            class194 var6 = this.field2000 != -1 && this.field2016 == 0 ? class280.method1965(this.field2000, 11) : null;
            class194 var7 = this.field2025 == -1 || this.field2025 == this.field1986 && var6 != null ? null : class280.method1965(this.field2025, 87);
            class196 var8 = this.field5631.method1155(this.field1990, var7, -95, var6, this.field1971);
            if (var8 == null) {
                return;
            }
            this.method798(-111, var8);
        }
        if (this.field2035 != null) {
            this.field2035.method1108(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!bf", name = "finalize", descriptor = "()V", line = 127)
    protected final void finalize() {
        field5628++;
        if (this.field2035 != null) {
            this.field2035.method1114();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJILki;)V", line = 140)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class164 arg10) {
        field5642++;
        if (this.field5631 == null) {
            return;
        }
        class194 var13 = this.field2000 != -1 && this.field2016 == 0 ? class280.method1965(this.field2000, 87) : null;
        class194 var14 = this.field2025 == -1 || this.field2025 == this.field1986 && var13 != null ? null : class280.method1965(this.field2025, -96);
        class196 var15 = this.field5631.method1155(this.field1990, var14, 117, var13, this.field1971);
        if (var15 == null) {
            return;
        }
        this.field2022 = var15.method201();
        class169 var16 = this.field5631;
        if (var16.field2950 != null) {
            var16 = var16.method1154((byte) -116);
        }
        if (class45.field825 && var16.field2921) {
            class196 var17 = class228.method1603(this.field5631.field2886, var14 == null ? this.field1990 : this.field1971, this.field5631.field2928, 1, this.field1973, var15, this.field2028, var14 == null ? var13 : var14, this.field5631.field2952, this.field1983, this.field5631.field2906, this.field2034, arg0, this.field5631.field2936);
            if (class108.field1900) {
                float var18 = class108.method755();
                float var19 = class108.method754();
                class108.method769();
                class108.method745(var18, var19 - 150.0F);
                var17.method190(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field2035);
                class108.method767();
                class108.method745(var18, var19);
            } else {
                var17.method190(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field2035);
            }
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (this.field5631.field2958 != 0 || this.field5631.field2955 != 0) {
            int var23 = class227.field3896[arg0];
            short var24 = this.field5631.field2958;
            int var25 = class227.field3911[arg0];
            short var26 = this.field5631.field2955;
            int var27 = -var26 / 2;
            int var28 = -var24 / 2;
            int var29 = var23 * var27 + var25 * var28 >> 16;
            int var30 = var25 * var27 - (var23 * var28) >> 16;
            int var31 = -var26 / 2;
            int var32 = var24 / 2;
            int var33 = class282.method1984((byte) -77, this.field2028 + var30, this.field1983 + var29, class16.field254);
            int var34 = var25 * var31 - (var23 * var32) >> 16;
            int var35 = -var24 / 2;
            int var36 = var23 * var31 + var25 * var32 >> 16;
            int var37 = class282.method1984((byte) -100, this.field2028 + var34, this.field1983 + var36, class16.field254);
            int var38 = var26 / 2;
            int var39 = var23 * var38 + var25 * var35 >> 16;
            int var40 = var25 * var38 - (var23 * var35) >> 16;
            int var41 = class282.method1984((byte) -96, this.field2028 + var40, this.field1983 - -var39, class16.field254);
            int var42 = var24 / 2;
            int var43 = var26 / 2;
            int var44 = var23 * var43 + (var25 * var42) >> 16;
            int var45 = var25 * var43 - (var23 * var42) >> 16;
            int var46 = class282.method1984((byte) -109, this.field2028 + var45, this.field1983 - -var44, class16.field254);
            int var47 = var33 + var46;
            if (var37 + var41 < var47) {
                var47 = var37 + var41;
            }
            int var48 = var37 <= var33 ? var37 : var33;
            int var49 = var46 <= var37 ? var46 : var37;
            int var50 = var41 > var33 ? var33 : var41;
            int var51 = var41 >= var46 ? var46 : var41;
            if (var26 != 0) {
                var20 = (int) (Math.atan2((double) (var48 - var51), (double) var26) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var15.method286(var20);
                }
            }
            if (var24 != 0) {
                var21 = (int) (Math.atan2((double) (var50 - var49), (double) var24) * 325.95D) & 0x7FF;
                if (var21 != 0) {
                    var15.method292(var21);
                }
            }
            var22 = (var47 >> 1) - this.field1973;
            if (var22 != 0) {
                var15.method266(0, var22, 0);
            }
        }
        class196 var52 = null;
        if (this.field1999 != -1 && this.field1968 != -1) {
            class224 var53 = class66.method492(8, this.field1999);
            var52 = var53.method1545(this.field1968, (byte) 103);
            if (var52 != null) {
                var52.method266(0, -this.field1991, 0);
                if (var53.field3816) {
                    if (var20 != 0) {
                        var52.method286(var20);
                    }
                    if (var21 != 0) {
                        var52.method292(var21);
                    }
                    if (var22 != 0) {
                        var52.method266(0, var22, 0);
                    }
                }
            }
        }
        if (!class108.field1900) {
            if (var52 != null) {
                var15 = ((class32) var15).method287(var52);
            }
            this.method798(-128, var15);
            if (this.field5631.field2952 == 1) {
                var15.field3398 = true;
            }
            var15.method190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2035);
            return;
        }
        this.method798(-117, var15);
        if (this.field5631.field2952 == 1) {
            var15.field3398 = true;
        }
        var15.method190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2035);
        if (var52 == null) {
            return;
        }
        if (this.field5631.field2952 == 1) {
            var52.field3398 = true;
        }
        if (this.field2035 != null) {
            class239 var54 = (class239) var52;
            this.field2035.method1122(var54.field4203, var54.field4191, true, var54.field4186, var54.field4192, var54.field4214);
        }
        var52.method190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2035);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lih;I)I", line = 355)
    public static final int method2258(class33 arg0, int arg1) {
        field5633++;
        int var2 = arg0.field614;
        if (arg1 != 0) {
            field5641 = (class229) null;
        }
        if (arg0.field2025 == arg0.field1986) {
            var2 = arg0.field624;
        } else if (arg0.field2025 == arg0.field2019) {
            var2 = arg0.field611;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V", line = 377)
    public static final void method2259(int arg0, int arg1) {
        class122 var2 = class323.method2175(7, arg0, -25873);
        var2.method865(-115);
        int var3 = 28 % ((-arg1) / 54);
        field5645++;
    }
}
