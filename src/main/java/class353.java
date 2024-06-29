import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class353 extends class694 implements class624 {

    @OriginalMember(owner = "client!tu", name = "nb", descriptor = "Z")
    private boolean field4981 = false;

    @OriginalMember(owner = "client!tu", name = "hb", descriptor = "Ljh;")
    public class161 field4975;

    @OriginalMember(owner = "client!tu", name = "mb", descriptor = "Z")
    private boolean field4980;

    @OriginalMember(owner = "client!tu", name = "Y", descriptor = "Lkaa;")
    public static class47 field4966 = new class47(17, 7);

    @OriginalMember(owner = "client!tu", name = "O", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!tu", name = "P", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!tu", name = "Q", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!tu", name = "S", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!tu", name = "T", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!tu", name = "U", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!tu", name = "V", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!tu", name = "W", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!tu", name = "X", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!tu", name = "Z", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!tu", name = "ab", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!tu", name = "bb", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!tu", name = "cb", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!tu", name = "db", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!tu", name = "eb", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!tu", name = "fb", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!tu", name = "ib", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!tu", name = "jb", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!tu", name = "kb", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!tu", name = "lb", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!tu", name = "gb", descriptor = "Lpt;")
    public static class531 field4974;

    @OriginalMember(owner = "client!tu", name = "R", descriptor = "Lck;")
    private class642 field4959;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2111(int arg0, String arg1) {
        ++field4973;
        if (arg0 != -16337) {
            return 50L;
        } else {
            long var2 = 0L;
            int var4 = arg1.length();
            for (int var5 = 0; var5 < var4; ++var5) {
                var2 *= 37L;
                char var6 = arg1.charAt(var5);
                if (~var6 <= -66 && ~var6 >= -91) {
                    var2 += (long) (var6 + -64);
                } else if (var6 >= 'a' && ~var6 >= -123) {
                    var2 += (long) (var6 + 1 + -97);
                } else if (~var6 <= -49 && ~var6 >= -58) {
                    var2 += (long) (var6 + 27 + -48);
                }
                if (var2 >= 177917621779460413L) {
                    break;
                }
            }
            while (var2 % 37L == 0L && var2 != 0L) {
                var2 /= 37L;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lha;B)V")
    public final void method792(class59 arg0, byte arg1) {
        ++field4956;
        class475 var3 = this.field4975.method1152(arg0, true, 262144, -21385, false);
        if (arg1 <= 121) {
            field4974 = null;
        }
        if (var3 != null) {
            int var4 = super.field3505 >> 9;
            int var5 = super.field3502 >> 9;
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            this.field4975.method1160(false, var5, var6, var4, var3, arg0, var4, var5, false);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(ILha;)Lww;")
    public final class733 method800(int arg0, class59 arg1) {
        ++field4978;
        class475 var3 = this.field4975.method1152(arg1, true, 2048, -21385, false);
        if (var3 == null) {
            return null;
        } else {
            class333 var4 = arg1.method451();
            var4.method1727(super.field9660 + super.field3505, super.field3510, super.field3502 - -super.field9651);
            class733 var5 = class397.method2338(this.field4980, (byte) 123, 1);
            if (arg0 != -1) {
                return null;
            } else {
                int var6 = super.field3505 >> 9;
                int var7 = super.field3502 >> 9;
                this.field4975.method1160(false, var7, var4, var6, var3, arg1, var6, var7, true);
                if (!class540.field7159) {
                    var3.method155(var4, var5.field10150[0], 0);
                } else {
                    var3.method160(var4, var5.field10150[0], class100.field1358, 0);
                }
                if (this.field4975.field2423 != null) {
                    class388 var8 = this.field4975.field2423.method131();
                    if (class540.field7159) {
                        arg1.method407(var8, class100.field1358);
                    } else {
                        arg1.method508(var8);
                    }
                }
                this.field4981 = var3.method159() || this.field4975.field2423 != null;
                if (this.field4959 != null) {
                    class735.method4107(this.field4959, super.field3510, var3, super.field3502, arg0 ^ -116, super.field3505);
                } else {
                    this.field4959 = class549.method3072(super.field3502, super.field3505, super.field3510, 544, var3);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lha;IIB)Z")
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 103) {
            return false;
        } else {
            ++field4960;
            class475 var5 = this.field4975.method1152(arg0, false, 131072, -21385, false);
            if (var5 == null) {
                return false;
            } else {
                class333 var6 = arg0.method451();
                var6.method1727(super.field9660 + super.field3505, super.field3510, super.field3502 - -super.field9651);
                return !class540.field7159 ? var5.method158(arg2, arg1, var6, false, 0) : var5.method203(arg2, arg1, var6, false, 0, class100.field1358);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLha;)Lck;")
    public final class642 method808(byte arg0, class59 arg1) {
        if (arg0 > -86) {
            this.field4980 = true;
        }
        ++field4957;
        return this.field4959;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
    public final void method1754(boolean arg0) {
        if (!arg0) {
            method2111(36, (String) null);
        }
        ++field4969;
    }

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "(I)V")
    public static void method2112(int arg0) {
        int var1 = 91 / ((arg0 - -85) / 32);
        field4974 = null;
        field4966 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([FI[III[FIIIIII[I)V")
    public static final void method2113(float[] arg0, int arg1, int[] arg2, int arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12) {
        ++field4970;
        int var13 = arg6 * arg9 + arg4;
        int var14 = arg7 * arg10 + arg11;
        if (arg8 != 0) {
            method2114(97, -64, -128);
        }
        int var15 = -arg1 + arg9;
        int var16 = -arg1 + arg10;
        if (arg12 == null) {
            for (int var17 = 0; ~var17 > ~arg3; ++var17) {
                int var18 = var13 - -arg1;
                while (~var18 < ~var13) {
                    arg0[var14++] = arg5[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else if (arg5 != null) {
            for (int var19 = 0; arg3 > var19; ++var19) {
                int var20 = arg1 + var13;
                while (var20 > var13) {
                    arg2[var14] = arg12[var13];
                    arg0[var14++] = arg5[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else {
            for (int var21 = 0; arg3 > var21; ++var21) {
                int var22 = var13 - -arg1;
                while (var22 > var13) {
                    arg2[var14++] = arg12[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILha;)V")
    public final void method1758(int arg0, class59 arg1) {
        ++field4968;
        if (arg0 != 6120) {
            this.method1756(true, (class59) null);
        }
        this.field4975.method1148(arg1, 20087);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(III)I")
    public static final int method2114(int arg0, int arg1, int arg2) {
        ++field4977;
        if (arg1 != -429911713) {
            return 110;
        } else {
            int var3 = arg2 >> 31 & arg0 - 1;
            return (arg2 - -(arg2 >>> 31)) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "(I)I")
    public final int method789(int arg0) {
        if (arg0 != -32768) {
            return 72;
        } else {
            ++field4958;
            return this.field4975.method1154(1);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Z")
    public final boolean method1761(int arg0) {
        ++field4979;
        if (arg0 != -28823) {
            this.method806((byte) -80);
        }
        return this.field4975.method1151((byte) -127);
    }

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "(B)Z")
    public final boolean method806(byte arg0) {
        ++field4976;
        int var2 = 87 % ((14 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)I")
    public final int method1759(byte arg0) {
        ++field4964;
        if (arg0 <= 63) {
            field4966 = null;
        }
        return this.field4975.field2404;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)Z")
    public final boolean method801(boolean arg0) {
        if (arg0) {
            this.method1759((byte) 97);
        }
        ++field4972;
        return this.field4981;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lha;Lqfa;IIIIIZIIIII)V")
    public class353(class59 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field4975 = new class161(arg0, arg1, arg10, arg11, super.field3508, arg3, this, arg7, arg12);
        this.field4980 = arg1.field1363 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)I")
    public final int method1757(byte arg0) {
        ++field4967;
        int var2 = 53 / ((arg0 - -57) / 53);
        return this.field4975.field2405;
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(B)I")
    public final int method791(byte arg0) {
        ++field4961;
        if (arg0 < 81) {
            field4974 = null;
        }
        return this.field4975.method1150(-1);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)I")
    public final int method1752(byte arg0) {
        ++field4971;
        return arg0 != -111 ? 54 : this.field4975.field2437;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZLha;)V")
    public final void method1756(boolean arg0, class59 arg1) {
        if (arg0) {
            this.field4975.method1159((byte) 39, arg1);
            ++field4965;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLbk;)V")
    public final void method2115(byte arg0, class379 arg1) {
        this.field4975.method1157(arg1, 0);
        if (arg0 > -100) {
            field4974 = null;
        }
        ++field4962;
    }
}
