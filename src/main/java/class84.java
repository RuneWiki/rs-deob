import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class84 extends class161 {

    @OriginalMember(owner = "client!vh", name = "Mb", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!vh", name = "Nb", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!vh", name = "Ob", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!vh", name = "Pb", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!vh", name = "Rb", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!vh", name = "Sb", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!vh", name = "Tb", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!vh", name = "Ub", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!vh", name = "Vb", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!vh", name = "Wb", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!vh", name = "Xb", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!vh", name = "Yb", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!vh", name = "Zb", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!vh", name = "ac", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!vh", name = "Qb", descriptor = "Loh;")
    private class401 field1202;

    @OriginalMember(owner = "client!vh", name = "bc", descriptor = "Lua;")
    public static class408 field1213;

    static {
        new class151("Ok", "Okay", "OK", "Ok");
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([II)V", line = 3)
    public final void method708(int[] arg0, int arg1) {
        if (arg1 != 20620) {
            this.method713((byte) -127, 124);
        }
        ++field1205;
        this.field1202 = new class401(arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BIII)V", line = 18)
    public final void method709(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 255) {
            field1213 = null;
        }
        ++field1211;
        for (int var5 = 0; arg1 > var5; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field2262[super.field2298++] + -this.field1202.method2417(class134.method993(arg3, -142)));
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(Z)V", line = 35)
    public final void method710(boolean arg0) {
        this.field1200 = super.field2298 * 8;
        if (arg0) {
            this.field1200 = 43;
        }
        ++field1210;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(Z)V", line = 46)
    public static void method711(boolean arg0) {
        if (!arg0) {
            field1213 = null;
        }
        field1213 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)I", line = 62)
    public final int method712(boolean arg0, int arg1) {
        ++field1207;
        int var3 = this.field1200 >> 3;
        int var4 = 8 - (7 & this.field1200);
        int var5 = 0;
        this.field1200 += arg1;
        while (var4 < arg1) {
            var5 += (class475.field6742[var4] & super.field2262[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        if (arg0) {
            this.field1200 = 79;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field2262[var3] & class475.field6742[var4]) + var5;
        } else {
            var6 = (super.field2262[var3] >> -arg1 + var4 & class475.field6742[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(BI)V", line = 93)
    public final void method713(byte arg0, int arg1) {
        super.field2262[super.field2298++] = (byte) (this.field1202.method2417(-67) + arg1);
        if (arg0 == -29) {
            ++field1212;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)I", line = 105)
    public static final int method714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1199;
        if (class340.field4692 == null) {
            return 0;
        } else if (arg2 >= -103) {
            return -98;
        } else {
            if (~arg4 > -4) {
                int var6 = arg3 >> 7;
                int var7 = arg0 >> 7;
                if (~arg5 > -1 || arg1 < 0 || ~(class36.field388 - 1) > ~arg5 || class68.field998 + -1 < arg1) {
                    return 0;
                }
                if (~var6 > -2 || ~var7 > -2 || ~var6 < ~(class36.field388 + -1) || var7 > class68.field998 - 1) {
                    return 0;
                }
                boolean var8 = ~(2 & class372.field5120[1][arg3 >> 7][arg0 >> 7]) != -1;
                if (~(127 & arg3) == -1) {
                    boolean var9 = ~(class372.field5120[1][var6 + -1][arg0 >> 7] & 2) != -1;
                    boolean var10 = ~(class372.field5120[1][var6][arg0 >> 7] & 2) != -1;
                    if (!var9 == var10) {
                        var8 = (class372.field5120[1][arg5][arg1] & 2) != 0;
                    }
                }
                if ((127 & arg0) == 0) {
                    boolean var11 = (2 & class372.field5120[1][arg3 >> 7][var7 + -1]) != 0;
                    boolean var12 = (class372.field5120[1][arg3 >> 7][var7] & 2) != 0;
                    if (!var12 == var11) {
                        var8 = (2 & class372.field5120[1][arg5][arg1]) != 0;
                    }
                }
                if (var8) {
                    ++arg4;
                }
            }
            return class340.field4692[arg4].method590(arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "(B)V", line = 168)
    public final void method715(byte arg0) {
        ++field1203;
        if (arg0 >= 119) {
            super.field2298 = (this.field1200 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(IB)I", line = 181)
    public final int method716(int arg0, byte arg1) {
        ++field1198;
        if (arg1 < 97) {
            this.field1200 = -16;
        }
        return arg0 * 8 + -this.field1200;
    }

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "(I)Z", line = 193)
    public final boolean method717(int arg0) {
        ++field1208;
        int var2 = 255 & super.field2262[super.field2298] - this.field1202.method2418(-15001);
        return var2 >= arg0;
    }

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "(II)Ljd;", line = 211)
    public static final class383 method718(int arg0, int arg1) {
        ++field1201;
        if (arg0 != 29670) {
            field1213 = null;
        }
        class383[] var2 = class435.method2660(0);
        for (int var3 = 0; var2.length > var3; ++var3) {
            class383 var4 = var2[var3];
            if (~var4.field5257 == ~arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V", line = 239)
    public class84(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)J", line = 247)
    public static final long method719(int arg0, String arg1) {
        ++field1209;
        long var2 = 0L;
        int var4 = arg1.length();
        if (arg0 != 37) {
            method711(false);
        }
        for (int var5 = 0; var5 < var4; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (~var6 <= -66 && var6 <= 'Z') {
                var2 += (long) (var6 + -65 + 1);
            } else if (~var6 <= -98 && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && ~var6 >= -58) {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && ~var2 != -1L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "(I)I", line = 296)
    public final int method720(int arg0) {
        if (arg0 < 51) {
            this.method712(false, -50);
        }
        ++field1204;
        int var2 = super.field2262[super.field2298++] + -this.field1202.method2417(-110) & 255;
        return ~var2 > -129 ? var2 : (super.field2262[super.field2298++] + -this.field1202.method2417(-88) & 255) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "(II)I", line = 318)
    public static final int method721(int arg0, int arg1) {
        int var2 = 59 / ((arg0 - 10) / 51);
        ++field1206;
        return arg1 >>> 7;
    }
}
