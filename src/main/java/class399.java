import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class399 extends class34 implements class620 {

    @OriginalMember(owner = "client!or", name = "z", descriptor = "B")
    private byte field5081;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "Z")
    private boolean field5078;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "Z")
    private boolean field5090;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "B")
    private byte field5076;

    @OriginalMember(owner = "client!or", name = "S", descriptor = "S")
    private short field5098;

    @OriginalMember(owner = "client!or", name = "T", descriptor = "Z")
    private boolean field5099;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "B")
    private byte field5086;

    @OriginalMember(owner = "client!or", name = "O", descriptor = "Z")
    private boolean field5094;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "Lw;")
    private class605 field5077;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "Lba;")
    public class107 field5091;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "Z")
    public static boolean field5084 = false;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!or", name = "M", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!or", name = "P", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!or", name = "Q", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!or", name = "R", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!or", name = "U", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!or", name = "V", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!or", name = "W", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!or", name = "X", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!or", name = "Y", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!or", name = "Z", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!or", name = "ab", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!or", name = "bb", descriptor = "Lcd;")
    private class564 field5107;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "[I")
    public static int[] field5092;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(Loa;I)V", line = 4)
    public final void method67(class43 arg0, int arg1) {
        ++field5085;
        if (arg1 != 2) {
            this.field5094 = false;
        }
    }

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(I)V", line = 17)
    public static void method2278(int arg0) {
        if (arg0 != 0) {
            field5084 = false;
        }
        field5092 = null;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I", line = 27)
    public final int method76(byte arg0) {
        if (arg0 > -92) {
            this.method73(20, 79, (class43) null, -69, (class274) null, false, -80);
        }
        ++field5105;
        return this.field5098 & 65535;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)Z", line = 43)
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            this.field5099 = false;
        }
        ++field5096;
        return this.field5099;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(Loa;I)Lcd;", line = 54)
    public final class564 method72(class43 arg0, int arg1) {
        if (arg1 != 21098) {
            return null;
        } else {
            if (this.field5107 == null) {
                this.field5107 = class240.method1519(super.field510, this.method2281(0, arg0, 0), super.field506, 1, super.field503);
            }
            ++field5083;
            return this.field5107;
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(B)V", line = 77)
    public final void method77(byte arg0) {
        ++field5097;
        this.field5099 = false;
        if (this.field5091 != null) {
            this.field5091.method825(-65537 & this.field5091.method796());
        }
        if (arg0 != 7) {
            this.field5098 = 113;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IILoa;I)Z", line = 91)
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        if (arg3 >= -98) {
            this.field5098 = 125;
        }
        ++field5089;
        class107 var5 = this.method2281(131072, arg2, 0);
        if (var5 != null) {
            class151 var6 = arg2.method402();
            var6.method146(super.field506, super.field510, super.field503);
            return var5.method832(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Loa;ZII)Lid;", line = 115)
    private final class390 method2279(class43 arg0, boolean arg1, int arg2, int arg3) {
        ++field5080;
        int var5 = -124 / ((23 - arg3) / 45);
        class698 var6 = class348.field4436.method1900(-127, this.field5098 & 65535);
        class88 var7;
        class88 var8;
        if (!this.field5090) {
            var7 = class353.field4540[this.field5081];
            if (~this.field5081 <= -4) {
                var8 = null;
            } else {
                var8 = class353.field4540[this.field5081 + 1];
            }
        } else {
            var8 = class353.field4540[0];
            var7 = class477.field6327[this.field5081];
        }
        return var6.method3811(arg1, var7, super.field503, super.field510, this.field5076 != 11 ? this.field5076 : 10, this.field5076 != 11 ? this.field5086 : this.field5086 + 4, arg0, arg2, var8, 96, super.field506);
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(B)I", line = 145)
    public final int method66(byte arg0) {
        if (arg0 != -42) {
            this.field5091 = null;
        }
        ++field5079;
        return this.field5076;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z", line = 156)
    public final boolean method75(int arg0) {
        int var2 = -113 % ((arg0 - 26) / 38);
        ++field5093;
        return this.field5094;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)I", line = 167)
    public final int method270(int arg0) {
        if (arg0 != 2495) {
            this.method70(true);
        }
        ++field5103;
        return this.field5091 == null ? 0 : this.field5091.method816();
    }

    @OriginalMember(owner = "client!or", name = "g", descriptor = "(I)I", line = 178)
    public final int method2280(int arg0) {
        ++field5087;
        if (arg0 != 19912) {
            this.method63((class43) null, 26, -37);
        }
        return this.field5091 != null ? this.field5091.method813() / 4 : 15;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Loa;B)Lpl;", line = 189)
    public final class215 method71(class43 arg0, byte arg1) {
        ++field5095;
        if (this.field5091 == null) {
            return null;
        } else {
            class151 var3 = arg0.method402();
            var3.method146(super.field506, super.field510, super.field503);
            class215 var4 = null;
            int var5 = 36 % ((arg1 - 12) / 41);
            if (this.field5078) {
                var4 = class207.method1331(true, 1);
            }
            this.field5091.method827(var3, var4 != null ? var4.field2770[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILoa;I)Lba;", line = 214)
    private final class107 method2281(int arg0, class43 arg1, int arg2) {
        ++field5101;
        if (this.field5091 != null && arg1.method377(this.field5091.method796(), arg0) == 0) {
            return this.field5091;
        } else {
            if (arg2 != 0) {
                field5100 = -35;
            }
            class390 var4 = this.method2279(arg1, false, arg0, arg2 + -108);
            return var4 == null ? null : var4.field4994;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Loa;I)V", line = 237)
    public final void method62(class43 arg0, int arg1) {
        ++field5104;
        Object var3 = null;
        class605 var5;
        if (this.field5077 == null && this.field5094) {
            class390 var4 = this.method2279(arg0, true, 262144, arg1 ^ -6444);
            var5 = var4 == null ? null : var4.field4995;
        } else {
            var5 = this.field5077;
            this.field5077 = null;
        }
        if (var5 != null) {
            class183.method1230(var5, this.field5081, super.field506, super.field503, (boolean[]) null);
        }
        if (arg1 != 6526) {
            this.method75(-7);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IILoa;ILcq;ZI)V", line = 265)
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        ++field5106;
        if (!(arg4 instanceof class188)) {
            if (arg4 instanceof class399) {
                class399 var8 = (class399) arg4;
                if (this.field5091 != null && var8.field5091 != null) {
                    this.field5091.method831(var8.field5091, arg3, arg1, arg0, arg5);
                }
            }
        } else {
            class188 var9 = (class188) arg4;
            if (this.field5091 != null && var9.field2389 != null) {
                this.field5091.method831(var9.field2389, arg3, arg1, arg0, arg5);
            }
        }
        if (arg6 > -2) {
            field5092 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 296)
    public final void method64(byte arg0) {
        ++field5075;
        if (this.field5091 != null) {
            this.field5091.method818();
        }
        int var2 = -42 % ((-71 - arg0) / 39);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Loa;Lsa;IIIIIZIIIIIIZ)V", line = 308)
    public class399(class43 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field9628 == -2, class89.method674(arg13, false, arg12));
        this.field5081 = (byte) arg3;
        this.field5078 = arg1.field9660 != 0 && !arg7;
        this.field5090 = arg7;
        this.field5076 = (byte) arg12;
        this.field5098 = (short) arg1.field9625;
        this.field5099 = arg14;
        this.field5086 = (byte) arg13;
        this.field5094 = arg0.method389() && arg1.field9591 && !this.field5090 && ~class260.field3509.method733(class364.field4697, (byte) -64) != -1;
        int var16 = 2048;
        if (this.field5099) {
            var16 |= 65536;
        }
        class390 var17 = this.method2279(arg0, this.field5094, var16, -64);
        if (var17 != null) {
            this.field5077 = var17.field4995;
            this.field5091 = var17.field4994;
            if (this.field5099) {
                this.field5091 = this.field5091.method479((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)I", line = 345)
    public final int method70(boolean arg0) {
        if (!arg0) {
            this.field5107 = null;
        }
        ++field5088;
        return this.field5086;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Loa;II)Lba;", line = 357)
    public final class107 method63(class43 arg0, int arg1, int arg2) {
        ++field5102;
        return arg2 != 25871 ? null : this.method2281(arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lcp;Lgn;)V", line = 378)
    public static final void method2282(class242 arg0, class530 arg1) {
        if (arg1.field6885) {
            short var2 = arg1.field6882;
            short var3 = arg1.field6888;
            byte var4 = arg1.field6889;
            byte var5 = arg1.field6897;
            int var6 = (var2 << class291.field3760) + class57.field768;
            int var7 = (var3 << class291.field3760) + class57.field768;
            class530[][] var8 = class483.field6438[var4];
            if (class477.field6327 == class392.field4997) {
                class273.field3602.method358(class353.field4540[0].method669(var6, var7), class601.method3270(var2, var3), class579.method3180(var2, var3), class557.method2986(var2, var3));
            }
            if (arg1.field6894) {
                if (class314.field4071) {
                    if (var4 > 0) {
                        class530 var9 = class483.field6438[var4 - 1][var2][var3];
                        if (var9 != null && var9.field6885) {
                            return;
                        }
                    }
                    if (var2 <= class658.field9175 && var2 > class603.field8119) {
                        class530 var10 = var8[var2 - 1][var3];
                        if (var10 != null && var10.field6885 && (var10.field6894 || (arg1.field6884 & 1) == 0)) {
                            return;
                        }
                    }
                    if (var2 >= class658.field9175 && var2 < class337.field4360 - 1) {
                        class530 var11 = var8[var2 + 1][var3];
                        if (var11 != null && var11.field6885 && (var11.field6894 || (arg1.field6884 & 4) == 0)) {
                            return;
                        }
                    }
                    if (var3 <= class659.field9178 && var3 > class244.field3272) {
                        class530 var12 = var8[var2][var3 - 1];
                        if (var12 != null && var12.field6885 && (var12.field6894 || (arg1.field6884 & 8) == 0)) {
                            return;
                        }
                    }
                    if (var3 >= class659.field9178 && var3 < class120.field1551 - 1) {
                        class530 var13 = var8[var2][var3 + 1];
                        if (var13 != null && var13.field6885 && (var13.field6894 || (arg1.field6884 & 2) == 0)) {
                            return;
                        }
                    }
                } else {
                    class314.field4071 = true;
                }
                arg1.field6894 = false;
                if (arg1.field6898 != null) {
                    class530 var14 = arg1.field6898;
                    if (!class207.method1332(var14.field6897, var2, var3)) {
                        class392.field4997[var14.field6897].method659(var2, var3);
                    }
                    class17 var15 = var14.field6879;
                    if (var15 != null) {
                        if (class52.field715) {
                            if ((var15.field188 & arg1.field6883) != 0) {
                                class86.method650(arg0, var15.field188, var5, var2, var3);
                            } else {
                                class110.method843(arg0, var4, var2, var3);
                            }
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        var15.method71(class273.field3602, (byte) -67);
                    }
                    for (class571 var16 = var14.field6887; var16 != null; var16 = var16.field7445) {
                        class34 var17 = var16.field7444;
                        if (var17 != null) {
                            if (class52.field715) {
                                class110.method843(arg0, var4, var2, var3);
                                class273.field3602.method412(arg0.field3251, arg0.field3254);
                            }
                            var17.method71(class273.field3602, (byte) 74);
                        }
                    }
                }
                boolean var18 = !class207.method1332(var5, var2, var3);
                if (var18) {
                    class392.field4997[var5].method659(var2, var3);
                    class152 var19 = arg1.field6878;
                    if (var19 != null && var19.field1940) {
                        if (class52.field715) {
                            class110.method843(arg0, var4, var2, var3);
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        class215 var20 = var19.method71(class273.field3602, (byte) -79);
                        if (var20 != null) {
                            var20.field2767 = var19;
                            var20.field2769 = var4;
                            var20.field2764 = var2;
                            var20.field2759 = var3;
                            class509.field6675.method2104((byte) -22, var20);
                        }
                    }
                }
                int var21 = 0;
                int var22 = 0;
                class17 var23 = arg1.field6879;
                class237 var24 = arg1.field6895;
                if (var23 != null || var24 != null) {
                    if (class658.field9175 == var2) {
                        ++var21;
                    } else if (class658.field9175 < var2) {
                        var21 += 2;
                    }
                    if (class659.field9178 == var3) {
                        var21 += 3;
                    } else if (class659.field9178 > var3) {
                        var21 += 6;
                    }
                    var22 = class640.field8904[var21];
                    arg1.field6883 = class37.field537[var21];
                }
                if (var23 != null) {
                    if ((var23.field188 & class93.field1233[var21]) != 0) {
                        if (var23.field188 == 16) {
                            arg1.field6881 = 3;
                            arg1.field6891 = class427.field5531[var21];
                            arg1.field6880 = (byte) (3 - arg1.field6891);
                        } else if (var23.field188 == 32) {
                            arg1.field6881 = 6;
                            arg1.field6891 = class628.field8774[var21];
                            arg1.field6880 = (byte) (6 - arg1.field6891);
                        } else if (var23.field188 == 64) {
                            arg1.field6881 = 12;
                            arg1.field6891 = class295.field3819[var21];
                            arg1.field6880 = (byte) (12 - arg1.field6891);
                        } else {
                            arg1.field6881 = 9;
                            arg1.field6891 = class518.field6790[var21];
                            arg1.field6880 = (byte) (9 - arg1.field6891);
                        }
                    } else {
                        arg1.field6881 = 0;
                    }
                    if ((var23.field188 & var22) != 0 && !class81.method632(var5, var2, var3, var23.field188)) {
                        if (class52.field715) {
                            class110.method843(arg0, var4, var2, var3);
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        class215 var25 = var23.method71(class273.field3602, (byte) 66);
                        if (var25 != null) {
                            var25.field2767 = var23;
                            var25.field2769 = var4;
                            var25.field2764 = var2;
                            var25.field2759 = var3;
                            class509.field6675.method2104((byte) -22, var25);
                        }
                    }
                    class17 var26 = arg1.field6886;
                    if (var26 != null && (var26.field188 & var22) != 0 && !class81.method632(var5, var2, var3, var26.field188)) {
                        if (class52.field715) {
                            class110.method843(arg0, var4, var2, var3);
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        class215 var27 = var26.method71(class273.field3602, (byte) -125);
                        if (var27 != null) {
                            var27.field2767 = var26;
                            var27.field2769 = var4;
                            var27.field2764 = var2;
                            var27.field2759 = var3;
                            class509.field6675.method2104((byte) -22, var27);
                        }
                    }
                }
                if (var24 != null && !class469.method2605(var5, var2, var3, var24.method1497(90))) {
                    class237 var28 = arg1.field6893;
                    if ((var24.field3191 & var22) != 0) {
                        if (class52.field715) {
                            class110.method843(arg0, var4, var2, var3);
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        class215 var29 = var24.method71(class273.field3602, (byte) -44);
                        if (var29 != null) {
                            var29.field2767 = var24;
                            var29.field2769 = var4;
                            var29.field2764 = var2;
                            var29.field2759 = var3;
                            class509.field6675.method2104((byte) -22, var29);
                        }
                    } else if (var24.field3191 == 256) {
                        int var30 = var24.field3195 - class77.field1049;
                        int var31 = var24.field3186 - class323.field4198;
                        int var32 = var24.field3200;
                        int var33;
                        if (var32 != 1 && var32 != 2) {
                            var33 = var30;
                        } else {
                            var33 = -var30;
                        }
                        int var34;
                        if (var32 != 2 && var32 != 3) {
                            var34 = var31;
                        } else {
                            var34 = -var31;
                        }
                        if (class52.field715) {
                            class110.method843(arg0, var4, var2, var3);
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        if (var34 < var33) {
                            class215 var35 = var24.method71(class273.field3602, (byte) -35);
                            if (var35 != null) {
                                var35.field2767 = var24;
                                var35.field2769 = var4;
                                var35.field2764 = var2;
                                var35.field2759 = var3;
                                class509.field6675.method2104((byte) -22, var35);
                            }
                        } else if (var28 != null) {
                            class215 var36 = var28.method71(class273.field3602, (byte) 94);
                            if (var36 != null) {
                                var36.field2767 = var28;
                                var36.field2769 = var4;
                                var36.field2764 = var2;
                                var36.field2759 = var3;
                                class509.field6675.method2104((byte) -22, var36);
                            }
                        }
                    }
                }
                if (var18) {
                    class152 var37 = arg1.field6878;
                    if (var37 != null && !var37.field1940) {
                        if (class52.field715) {
                            class110.method843(arg0, var4, var2, var3);
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        class215 var38 = var37.method71(class273.field3602, (byte) 120);
                        if (var38 != null) {
                            var38.field2767 = var37;
                            var38.field2769 = var4;
                            var38.field2764 = var2;
                            var38.field2759 = var3;
                            class509.field6675.method2104((byte) -22, var38);
                        }
                    }
                    class266 var39 = arg1.field6896;
                    if (var39 != null && !var39.field3556) {
                        if (class52.field715) {
                            class110.method843(arg0, var4, var2, var3);
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        class215 var40 = var39.method71(class273.field3602, (byte) 86);
                        if (var40 != null) {
                            var40.field2767 = var39;
                            var40.field2769 = var4;
                            var40.field2764 = var2;
                            var40.field2759 = var3;
                            class509.field6675.method2104((byte) -22, var40);
                        }
                    }
                }
                byte var41 = arg1.field6884;
                if (var41 != 0) {
                    if (var2 < class658.field9175 && (var41 & 4) != 0) {
                        class530 var42 = var8[var2 + 1][var3];
                        if (var42 != null && var42.field6885) {
                            class89.field1174.method883(var42, true);
                        }
                    }
                    if (var3 < class659.field9178 && (var41 & 2) != 0) {
                        class530 var43 = var8[var2][var3 + 1];
                        if (var43 != null && var43.field6885) {
                            class89.field1174.method883(var43, true);
                        }
                    }
                    if (var2 > class658.field9175 && (var41 & 1) != 0) {
                        class530 var44 = var8[var2 - 1][var3];
                        if (var44 != null && var44.field6885) {
                            class89.field1174.method883(var44, true);
                        }
                    }
                    if (var3 > class659.field9178 && (var41 & 8) != 0) {
                        class530 var45 = var8[var2][var3 - 1];
                        if (var45 != null && var45.field6885) {
                            class89.field1174.method883(var45, true);
                        }
                    }
                }
            }
            if (arg1.field6881 != 0) {
                boolean var46 = true;
                for (class571 var47 = arg1.field6887; var47 != null; var47 = var47.field7445) {
                    if (class655.field9110 != var47.field7444.field504 && (var47.field7443 & arg1.field6881) == arg1.field6891) {
                        var46 = false;
                        break;
                    }
                }
                if (var46) {
                    class17 var48 = arg1.field6879;
                    if (!class81.method632(var5, var2, var3, var48.field188)) {
                        if (class52.field715) {
                            label663: {
                                if (var48.field188 >= 16) {
                                    int var49 = var2 - class658.field9175;
                                    int var50 = var3 - class659.field9178;
                                    if (var48.field188 == 16) {
                                        int var51 = var49 - class57.field768;
                                        int var52 = class57.field768 + var50;
                                        if (var52 < var51 && var2 > 0 && var3 <= class151.field1933) {
                                            class110.method843(arg0, var4, var2 - 1, var3 + 1);
                                            break label663;
                                        }
                                    } else if (var48.field188 == 32) {
                                        int var53 = class57.field768 + var49;
                                        int var54 = class57.field768 + var50;
                                        if (var54 < -var53 && var2 < class590.field8010 && var3 < class151.field1933) {
                                            class110.method843(arg0, var4, var2 + 1, var3 + 1);
                                            break label663;
                                        }
                                    } else if (var48.field188 == 64) {
                                        int var55 = class57.field768 + var49;
                                        int var56 = var50 - class57.field768;
                                        if (var56 > var55 && var2 < class590.field8010 && var3 > 0) {
                                            class110.method843(arg0, var4, var2 + 1, var3 - 1);
                                            break label663;
                                        }
                                    } else if (var48.field188 == 128) {
                                        int var57 = var49 - class57.field768;
                                        int var58 = var50 - class57.field768;
                                        if (var58 > -var57 && var2 > 0 && var3 > 0) {
                                            class110.method843(arg0, var4, var2 - 1, var3 - 1);
                                            break label663;
                                        }
                                    }
                                }
                                class110.method843(arg0, var4, var2, var3);
                            }
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        class215 var59 = var48.method71(class273.field3602, (byte) 87);
                        if (var59 != null) {
                            var59.field2767 = var48;
                            var59.field2769 = var4;
                            var59.field2764 = var2;
                            var59.field2759 = var3;
                            class509.field6675.method2104((byte) -22, var59);
                        }
                    }
                    arg1.field6881 = 0;
                }
            }
            if (arg1.field6892) {
                try {
                    arg1.field6892 = false;
                    int var60 = 0;
                    label606: for (class571 var61 = arg1.field6887; var61 != null; var61 = var61.field7445) {
                        class34 var62 = var61.field7444;
                        if (class655.field9110 != var62.field504) {
                            for (int var63 = var62.field497; var63 <= var62.field501; ++var63) {
                                for (int var64 = var62.field502; var64 <= var62.field505; ++var64) {
                                    class530 var65 = var8[var63][var64];
                                    if (var65.field6894) {
                                        arg1.field6892 = true;
                                        continue label606;
                                    }
                                    if (var65.field6881 != 0) {
                                        int var66 = 0;
                                        if (var63 > var62.field497) {
                                            ++var66;
                                        }
                                        if (var63 < var62.field501) {
                                            var66 += 4;
                                        }
                                        if (var64 > var62.field502) {
                                            var66 += 8;
                                        }
                                        if (var64 < var62.field505) {
                                            var66 += 2;
                                        }
                                        if ((var66 & var65.field6881) == arg1.field6880) {
                                            arg1.field6892 = true;
                                            continue label606;
                                        }
                                    }
                                }
                            }
                            int var67 = class658.field9175 - var62.field497;
                            int var68 = var62.field501 - class658.field9175;
                            if (var68 > var67) {
                                var67 = var68;
                            }
                            int var69 = class659.field9178 - var62.field502;
                            int var70 = var62.field505 - class659.field9178;
                            if (var70 > var69) {
                                var69 = var70;
                            }
                            arg0.field3248[var60] = var62;
                            arg0.field3249[var60++] = var67 + var69;
                        }
                    }
                    while (var60 > 0) {
                        int var71 = -50;
                        int var72 = -1;
                        for (int var73 = 0; var73 < var60; ++var73) {
                            class34 var74 = arg0.field3248[var73];
                            if (class655.field9110 != var74.field504) {
                                int var75 = arg0.field3249[var73];
                                if (var75 > var71) {
                                    var71 = var75;
                                    var72 = var73;
                                } else if (var71 == var75) {
                                    int var76 = var74.field506 - class77.field1049;
                                    int var77 = var74.field503 - class323.field4198;
                                    int var78 = arg0.field3248[var72].field506 - class77.field1049;
                                    int var79 = arg0.field3248[var72].field503 - class323.field4198;
                                    if (var76 * var76 + var77 * var77 > var78 * var78 + var79 * var79) {
                                        var72 = var73;
                                    }
                                }
                            }
                        }
                        if (var72 == -1) {
                            break;
                        }
                        class34 var80 = arg0.field3248[var72];
                        var80.field504 = class655.field9110;
                        if (!class412.method2331(var5, var80.field497, var80.field501, var80.field502, var80.field505, var80.method270(2495))) {
                            if (class52.field715) {
                                if (var80.field511 != 0) {
                                    class110.method843(arg0, var4, var2, var3);
                                    int var81 = var2 - class658.field9175;
                                    int var82 = var3 - class659.field9178;
                                    if (var80.field511 == 2) {
                                        if (var82 > -var81) {
                                            class512.method2758(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                        } else {
                                            class512.method2758(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                        }
                                    } else if (var82 > var81) {
                                        class512.method2758(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                    } else {
                                        class512.method2758(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                    }
                                } else {
                                    class196.method1291(arg0, var4, var80.field497, var80.field502, var80.field501, var80.field505);
                                }
                                class273.field3602.method412(arg0.field3251, arg0.field3254);
                            }
                            class215 var83 = var80.method71(class273.field3602, (byte) 89);
                            if (var83 != null) {
                                var83.field2767 = var80;
                                var83.field2769 = var4;
                                var83.field2764 = var80.field497;
                                var83.field2759 = var80.field502;
                                class509.field6675.method2104((byte) -22, var83);
                            }
                        }
                        for (int var84 = var80.field497; var84 <= var80.field501; ++var84) {
                            for (int var85 = var80.field502; var85 <= var80.field505; ++var85) {
                                class530 var86 = var8[var84][var85];
                                if (var86.field6881 != 0) {
                                    class89.field1174.method883(var86, true);
                                } else if ((var2 != var84 || var3 != var85) && var86.field6885) {
                                    class89.field1174.method883(var86, true);
                                }
                            }
                        }
                    }
                    if (arg1.field6892) {
                        return;
                    }
                } catch (Exception var121) {
                    arg1.field6892 = false;
                }
            }
            if (arg1.field6890 != null && (byte) (class585.field7937 & 255) == arg1.field6899) {
                class282 var87 = arg1.field6890;
                int var88 = class392.field4997[var4].method668(var2, var3);
                int var89;
                if (var4 < class20.field223 - 1) {
                    var89 = class392.field4997[var4].method668(var2, var3) - class392.field4997[var4 + 1].method668(var2, var3);
                } else {
                    var89 = 8 << class291.field3760;
                }
                class315.field4080.method145(var6, var88, var7, arg0.field3250);
                int var90 = arg0.field3250[2];
                class315.field4080.method145(var6, var88 - var89, var7, arg0.field3250);
                int var91 = arg0.field3250[2];
                int var92 = var90;
                int var93 = var91;
                if (var90 > var91) {
                    var92 = var91;
                    var93 = var90;
                }
                int var94 = var92 - class77.field1045;
                int var95 = class77.field1045 + var93;
                var87.field3676 = var94;
                var87.field3674 = var95;
                var87.field3677 = true;
                class273.field3602.method326(var87);
            }
            if (arg1.field6885) {
                if (arg1.field6881 != 0) {
                    return;
                }
                if (var2 <= class658.field9175 && var2 > class603.field8119) {
                    class530 var96 = var8[var2 - 1][var3];
                    if (var96 != null && var96.field6885) {
                        return;
                    }
                }
                if (var2 >= class658.field9175 && var2 < class337.field4360 - 1) {
                    class530 var97 = var8[var2 + 1][var3];
                    if (var97 != null && var97.field6885) {
                        return;
                    }
                }
                if (var3 <= class659.field9178 && var3 > class244.field3272) {
                    class530 var98 = var8[var2][var3 - 1];
                    if (var98 != null && var98.field6885) {
                        return;
                    }
                }
                if (var3 >= class659.field9178 && var3 < class120.field1551 - 1) {
                    class530 var99 = var8[var2][var3 + 1];
                    if (var99 != null && var99.field6885) {
                        return;
                    }
                }
                arg1.field6885 = false;
                --class352.field4518;
                class266 var100 = arg1.field6896;
                if (var100 != null && var100.field3556) {
                    if (class52.field715) {
                        class110.method843(arg0, var4, var2, var3);
                        class273.field3602.method412(arg0.field3251, arg0.field3254);
                    }
                    class215 var101 = var100.method71(class273.field3602, (byte) -119);
                    if (var101 != null) {
                        var101.field2767 = var100;
                        var101.field2769 = var4;
                        var101.field2764 = var2;
                        var101.field2759 = var3;
                        class509.field6675.method2104((byte) -22, var101);
                    }
                }
                if (arg1.field6883 != 0) {
                    class237 var102 = arg1.field6895;
                    if (var102 != null && !class469.method2605(var5, var2, var3, var102.method1497(-39))) {
                        if ((var102.field3191 & arg1.field6883) != 0) {
                            if (class52.field715) {
                                class110.method843(arg0, var4, var2, var3);
                                class273.field3602.method412(arg0.field3251, arg0.field3254);
                            }
                            class215 var103 = var102.method71(class273.field3602, (byte) -81);
                            if (var103 != null) {
                                var103.field2767 = var102;
                                var103.field2769 = var4;
                                var103.field2764 = var2;
                                var103.field2759 = var3;
                                class509.field6675.method2104((byte) -22, var103);
                            }
                        } else if (var102.field3191 == 256) {
                            int var104 = var102.field3195 - class77.field1049;
                            int var105 = var102.field3186 - class323.field4198;
                            int var106 = var102.field3200;
                            int var107;
                            if (var106 != 1 && var106 != 2) {
                                var107 = var104;
                            } else {
                                var107 = -var104;
                            }
                            int var108;
                            if (var106 != 2 && var106 != 3) {
                                var108 = var105;
                            } else {
                                var108 = -var105;
                            }
                            if (class52.field715) {
                                class110.method843(arg0, var4, var2, var3);
                                class273.field3602.method412(arg0.field3251, arg0.field3254);
                            }
                            class237 var109 = arg1.field6893;
                            if (var108 > var107) {
                                class215 var110 = var102.method71(class273.field3602, (byte) 89);
                                if (var110 != null) {
                                    var110.field2767 = var102;
                                    var110.field2769 = var4;
                                    var110.field2764 = var2;
                                    var110.field2759 = var3;
                                    class509.field6675.method2104((byte) -22, var110);
                                }
                            } else if (var109 != null) {
                                class215 var111 = var109.method71(class273.field3602, (byte) -112);
                                if (var111 != null) {
                                    var111.field2767 = var109;
                                    var111.field2769 = var4;
                                    var111.field2764 = var2;
                                    var111.field2759 = var3;
                                    class509.field6675.method2104((byte) -22, var111);
                                }
                            }
                        }
                    }
                    class17 var112 = arg1.field6879;
                    class17 var113 = arg1.field6886;
                    if (var113 != null && (var113.field188 & arg1.field6883) != 0 && !class81.method632(var5, var2, var3, var113.field188)) {
                        if (class52.field715) {
                            class86.method650(arg0, var113.field188, var4, var2, var3);
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        class215 var114 = var113.method71(class273.field3602, (byte) 95);
                        if (var114 != null) {
                            var114.field2767 = var113;
                            var114.field2769 = var4;
                            var114.field2764 = var2;
                            var114.field2759 = var3;
                            class509.field6675.method2104((byte) -22, var114);
                        }
                    }
                    if (var112 != null && (var112.field188 & arg1.field6883) != 0 && !class81.method632(var5, var2, var3, var112.field188)) {
                        if (class52.field715) {
                            class86.method650(arg0, var112.field188, var4, var2, var3);
                            class273.field3602.method412(arg0.field3251, arg0.field3254);
                        }
                        class215 var115 = var112.method71(class273.field3602, (byte) -40);
                        if (var115 != null) {
                            var115.field2767 = var112;
                            var115.field2769 = var4;
                            var115.field2764 = var2;
                            var115.field2759 = var3;
                            class509.field6675.method2104((byte) -22, var115);
                        }
                    }
                }
                if (var4 < class20.field223 - 1) {
                    class530 var116 = class483.field6438[var4 + 1][var2][var3];
                    if (var116 != null && var116.field6885) {
                        class89.field1174.method878(116, var116);
                    }
                }
                if (var2 < class658.field9175) {
                    class530 var117 = var8[var2 + 1][var3];
                    if (var117 != null && var117.field6885) {
                        class89.field1174.method883(var117, true);
                    }
                }
                if (var3 < class659.field9178) {
                    class530 var118 = var8[var2][var3 + 1];
                    if (var118 != null && var118.field6885) {
                        class89.field1174.method883(var118, true);
                    }
                }
                if (var2 > class658.field9175) {
                    class530 var119 = var8[var2 - 1][var3];
                    if (var119 != null && var119.field6885) {
                        class89.field1174.method883(var119, true);
                    }
                }
                if (var3 > class659.field9178) {
                    class530 var120 = var8[var2][var3 - 1];
                    if (var120 != null && var120.field6885) {
                        class89.field1174.method883(var120, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Loa;I)V", line = 1475)
    public final void method65(class43 arg0, int arg1) {
        if (arg1 <= -121) {
            ++field5082;
            Object var3 = null;
            class605 var5;
            if (this.field5077 == null && this.field5094) {
                class390 var4 = this.method2279(arg0, true, 262144, -50);
                var5 = var4 != null ? var4.field4995 : null;
            } else {
                var5 = this.field5077;
                this.field5077 = null;
            }
            if (var5 != null) {
                class567.method3035(var5, this.field5081, super.field506, super.field503, (boolean[]) null);
            }
        }
    }
}
