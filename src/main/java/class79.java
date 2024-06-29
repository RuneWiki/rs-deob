import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class79 extends class17 implements class620 {

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "Lmda;")
    public class587 field1095;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "Z")
    private boolean field1084;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "Lcd;")
    private class564 field1090;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(B)[Lan;")
    public static final class169[] method627(byte arg0) {
        if (class336.field4352 == null) {
            class169[] var1 = class105.method783((byte) 124, class688.field9413);
            class169[] var2 = new class169[var1.length];
            int var3 = 0;
            int var4 = class260.field3509.method1589(class364.field4697, (byte) 103);
            label74: for (int var5 = 0; var5 < var1.length; ++var5) {
                class169 var9 = var1[var5];
                if ((var9.field2102 <= 0 || var9.field2102 >= 24) && ~var9.field2105 <= -801 && var9.field2103 >= 600 && (~var4 != -3 || ~var9.field2105 >= -801 && ~var9.field2103 >= -601) && (var4 != 1 || ~var9.field2105 >= -1025 && var9.field2103 <= 768)) {
                    for (int var10 = 0; var10 < var3; ++var10) {
                        class169 var11 = var2[var10];
                        if (var9.field2105 == var11.field2105 && ~var9.field2103 == ~var11.field2103) {
                            if (~var11.field2102 > ~var9.field2102) {
                                var2[var10] = var9;
                            }
                            continue label74;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class336.field4352 = new class169[var3];
            class443.method2512(var2, 0, class336.field4352, 0, var3);
            int[] var6 = new int[class336.field4352.length];
            for (int var7 = 0; ~class336.field4352.length < ~var7; ++var7) {
                class169 var8 = class336.field4352[var7];
                var6[var7] = var8.field2105 * var8.field2103;
            }
            class585.method3195(var6, class336.field4352, true);
        }
        ++field1096;
        return arg0 != -96 ? null : class336.field4352;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)Z")
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            this.method76((byte) -36);
        }
        ++field1085;
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Loa;Lsa;IIIIIZIII)V")
    public class79(class43 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class37.method299(arg8, arg9, (byte) -12));
        this.field1095 = new class587(arg0, arg1, arg8, arg9, arg2, arg3, super.field195, super.field191, arg7, arg10);
        this.field1084 = ~arg1.field9660 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)I")
    public final int method70(boolean arg0) {
        ++field1076;
        if (!arg0) {
            this.field1095 = null;
        }
        return this.field1095.field7959;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V")
    public static final void method628(int arg0, int arg1, int arg2) {
        ++field1091;
        if (!(class706.field9836 > class706.field9835)) {
            if (class706.field9835 > class706.field9836) {
                class706.field9835 = (float) ((double) class706.field9835 - (double) class706.field9835 / 30.0D);
                if (class706.field9835 < class706.field9836) {
                    class706.field9835 = class706.field9836;
                }
                class109.method840((byte) -100);
                class706.field9843 = (int) class706.field9835 >> 1;
                class706.field9842 = class679.method3732(class706.field9843, (byte) -126);
            }
        } else {
            class706.field9835 = (float) ((double) class706.field9835 / 30.0D + (double) class706.field9835);
            if (class706.field9836 < class706.field9835) {
                class706.field9835 = class706.field9836;
            }
            class109.method840((byte) -66);
            class706.field9843 = (int) class706.field9835 >> 1;
            class706.field9842 = class679.method3732(class706.field9843, (byte) -125);
        }
        if (arg0 == 1007) {
            if (~class82.field1112 != 0 && class693.field9478 != -1) {
                int var3 = -class556.field7274 + class82.field1112;
                if (var3 < 2 || ~var3 < -3) {
                    var3 /= 8;
                }
                int var4 = -class527.field6862 + class693.field9478;
                class556.field7274 += var3;
                if (~var4 > -3 || ~var4 < -3) {
                    var4 /= 8;
                }
                class527.field6862 += var4;
                if (~var3 == -1 && ~var4 == -1) {
                    class693.field9478 = -1;
                    class82.field1112 = -1;
                }
                class109.method840((byte) -95);
            }
            if (class414.field5328 > 0) {
                --class273.field3599;
                if (class273.field3599 == 0) {
                    --class414.field5328;
                    class273.field3599 = 100;
                }
            } else {
                class215.field2773 = -1;
                class513.field6721 = -1;
            }
            if (class150.field1929 && class453.field5907 != null) {
                for (class123 var5 = (class123) class453.field5907.method2090(true); var5 != null; var5 = (class123) class453.field5907.method2088(-152)) {
                    class576 var6 = class706.field9833.method2291((byte) 125, var5.field1596.field9761);
                    if (!var5.method912(Integer.MAX_VALUE, arg1, arg2)) {
                        if (var5.field1596.field9766) {
                            var5.field1596.field9766 = false;
                            class709.method3893(class465.field6066, var5.field1596.field9761, var6.field7831);
                        }
                    } else {
                        if (var6.field7834 != null) {
                            if (var6.field7834[4] != null) {
                                class47.method433(0, var6.field7837, (long) var5.field1596.field9761, var6.field7834[4], 1007, -1, false, -1, var6.field7831, true, (byte) 121);
                            }
                            if (var6.field7834[3] != null) {
                                class47.method433(0, var6.field7837, (long) var5.field1596.field9761, var6.field7834[3], 1011, -1, false, -1, var6.field7831, true, (byte) 127);
                            }
                            if (var6.field7834[2] != null) {
                                class47.method433(0, var6.field7837, (long) var5.field1596.field9761, var6.field7834[2], 1012, -1, false, -1, var6.field7831, true, (byte) 127);
                            }
                            if (var6.field7834[1] != null) {
                                class47.method433(0, var6.field7837, (long) var5.field1596.field9761, var6.field7834[1], 1010, -1, false, -1, var6.field7831, true, (byte) 122);
                            }
                            if (var6.field7834[0] != null) {
                                class47.method433(0, var6.field7837, (long) var5.field1596.field9761, var6.field7834[0], 1008, -1, false, -1, var6.field7831, true, (byte) 126);
                            }
                        }
                        if (!var5.field1596.field9766) {
                            var5.field1596.field9766 = true;
                            class709.method3893(class165.field2053, var5.field1596.field9761, var6.field7831);
                        }
                        if (var5.field1596.field9766) {
                            class709.method3893(class26.field321, var5.field1596.field9761, var6.field7831);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(Loa;I)V")
    public final void method65(class43 arg0, int arg1) {
        this.field1095.method3210(true, arg0);
        ++field1087;
        if (arg1 >= -121) {
            this.field1090 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Loa;B)Lpl;")
    public final class215 method71(class43 arg0, byte arg1) {
        ++field1089;
        class107 var3 = this.field1095.method3207(arg0, super.field191, true, 2048, false, 28869, super.field195);
        if (var3 == null) {
            return null;
        } else {
            class151 var4 = arg0.method402();
            var4.method146(super.field195, super.field192, super.field191);
            int var5 = -65 / ((12 - arg1) / 41);
            class215 var6 = null;
            if (this.field1084) {
                var6 = class207.method1331(true, 1);
            }
            int var7 = super.field195 >> 9;
            int var8 = super.field191 >> 9;
            this.field1095.method3201(var8, arg0, var7, var4, -124, var8, true, var3, var7);
            if (this.field1095.field7979 == null) {
                var3.method827(var4, var6 == null ? null : var6.field2770[0], 0);
            } else {
                class282 var9 = this.field1095.field7979.method1468();
                arg0.method365(var3, var9, var4, var6 != null ? var6.field2770[0] : null, 0);
            }
            if (this.field1090 != null) {
                class434.method2480(7065, super.field191, this.field1090, super.field195, var3, super.field192);
            } else {
                this.field1090 = class240.method1519(super.field192, var3, super.field195, 1, super.field191);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(Loa;I)Lcd;")
    public final class564 method72(class43 arg0, int arg1) {
        if (arg1 != 21098) {
            this.field1095 = null;
        }
        ++field1086;
        return this.field1090;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)I")
    public final int method66(byte arg0) {
        ++field1094;
        if (arg0 != -42) {
            this.method75(91);
        }
        return this.field1095.field7976;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public final void method64(byte arg0) {
        int var2 = -50 / ((-71 - arg0) / 39);
        ++field1092;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(Loa;I)V")
    public final void method67(class43 arg0, int arg1) {
        ++field1080;
        if (arg1 == 2) {
            class107 var3 = this.field1095.method3207(arg0, super.field191, true, 262144, true, arg1 ^ 28871, super.field195);
            if (var3 != null) {
                int var4 = super.field195 >> 9;
                int var5 = super.field191 >> 9;
                class151 var6 = arg0.method402();
                var6.method146(super.field195, super.field192, super.field191);
                this.field1095.method3201(var5, arg0, var4, var6, -89, var5, false, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILoa;ILcq;ZI)V")
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        ++field1083;
        if (arg6 >= -2) {
            this.field1084 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Loa;I)V")
    public final void method62(class43 arg0, int arg1) {
        if (arg1 == 6526) {
            ++field1078;
            this.field1095.method3205(arg1 + 1705, arg0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z")
    public final boolean method75(int arg0) {
        ++field1079;
        int var2 = 76 % ((arg0 - 26) / 38);
        return this.field1095.method3200(-52);
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)I")
    public final int method76(byte arg0) {
        if (arg0 >= -92) {
            this.method74(-109, -74, (class43) null, 96);
        }
        ++field1081;
        return this.field1095.field7955;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        ++field1088;
        if (arg3 > -98) {
            this.method63((class43) null, -117, 101);
        }
        class107 var5 = this.field1095.method3207(arg2, super.field191, false, 131072, false, 28869, super.field195);
        if (var5 == null) {
            return false;
        } else {
            class151 var6 = arg2.method402();
            var6.method146(super.field195, super.field192, super.field191);
            return var5.method832(arg1, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(B)V")
    public final void method77(byte arg0) {
        if (arg0 != 7) {
            this.field1095 = null;
        }
        ++field1097;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[Ljava/lang/Object;II[I)V")
    public static final void method629(int arg0, Object[] arg1, int arg2, int arg3, int[] arg4) {
        ++field1093;
        if (arg3 != 24) {
            method627((byte) 96);
        }
        if (~arg0 > ~arg2) {
            int var5 = (arg0 - -arg2) / 2;
            int var6 = arg0;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
            for (int var10 = arg0; var10 < arg2; ++var10) {
                if (~((var9 & var10) + var7) < ~arg4[var10]) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method629(arg0, arg1, var6 + -1, 24, arg4);
            method629(var6 + 1, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Loa;II)Lba;")
    public final class107 method63(class43 arg0, int arg1, int arg2) {
        ++field1077;
        if (arg2 != 25871) {
            this.method63((class43) null, -69, -107);
        }
        return this.field1095.method3207(arg0, 0, false, arg1, false, 28869, 0);
    }
}
