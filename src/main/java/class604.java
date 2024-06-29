import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public abstract class class604 extends class202 {

    @OriginalMember(owner = "client!laa", name = "N", descriptor = "Z")
    public boolean field8667;

    @OriginalMember(owner = "client!laa", name = "I", descriptor = "S")
    public short field8661;

    @OriginalMember(owner = "client!laa", name = "O", descriptor = "S")
    public short field8666;

    @OriginalMember(owner = "client!laa", name = "J", descriptor = "S")
    public short field8663;

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "S")
    public short field8669;

    @OriginalMember(owner = "client!laa", name = "H", descriptor = "B")
    public byte field8664;

    @OriginalMember(owner = "client!laa", name = "R", descriptor = "[Ljava/lang/String;")
    private static final String[] field8672 = new String[] { method4467(method4466("\u0003jc>k\u0006ekdiG")), method4467(method4466("\u0001~n|")), method4467(method4466("\u0014%,>*")), method4467(method4466("\u0003jc>\u001f.#")), method4467(method4466("\u0003jc>\u0003.#")), method4467(method4466("\u0003jc>\u0010.#")), method4467(method4466("\u0003jc>\u0004.#")), method4467(method4466("\u0003jc>\u001e.#")) };

    @OriginalMember(owner = "client!laa", name = "K", descriptor = "I")
    public static int field8656 = 0;

    @OriginalMember(owner = "client!laa", name = "B", descriptor = "[[Ljava/lang/String;")
    public static String[][] field8670 = new String[][] { { method4467(method4466("%jl")), method4467(method4466(")n`")), method4467(method4466("\"jp")), method4467(method4466(".{p")), method4467(method4466("\"j{")), method4467(method4466("%~l")), method4467(method4466("%~n")), method4467(method4466(".~e")), method4467(method4466("<nr")), method4467(method4466(" hv")), method4467(method4466("!dt")), method4467(method4466("+na")) }, { method4467(method4466("%jl")), method4467(method4466(")n`")), method4467(method4466("\"ïp")), method4467(method4466(".{p")), method4467(method4466("\"jk")), method4467(method4466("%~l")), method4467(method4466("%~n")), method4467(method4466(".~e")), method4467(method4466("<nr")), method4467(method4466(" `v")), method4467(method4466("!dt")), method4467(method4466("+nx")) }, { method4467(method4466("\u0005jl")), method4467(method4466("\tât")), method4467(method4466("\u0002jpc")), method4467(method4466("\u000e}p")), method4467(method4466("\u0002jk")), method4467(method4466("\u0005~k~")), method4467(method4466("\u0005~k|")), method4467(method4466("\u000edùd")), method4467(method4466("\u001cnrd")), method4467(method4466("\u0000hv")), method4467(method4466("\u0001dt")), method4467(method4466("\u000bâa")) }, { method4467(method4466("\u0005jl")), method4467(method4466("\tnt")), method4467(method4466("\u0002jp")), method4467(method4466("\u000eip")), method4467(method4466("\u0002jk")), method4467(method4466("\u0005~l")), method4467(method4466("\u0005~n")), method4467(method4466("\u000elm")), method4467(method4466("\u001cnv")), method4467(method4466("\u0000~v")), method4467(method4466("\u0001dt")), method4467(method4466("\u000bnx")) }, { method4467(method4466("\u0005jl")), method4467(method4466("\tn`")), method4467(method4466("\u0002yv")), method4467(method4466("\u000e{p")), method4467(method4466("\u0002nk")), method4467(method4466("\u0005~l")), method4467(method4466("\u0005~n")), method4467(method4466("\u000e~e")), method4467(method4466("\u001cnr")), method4467(method4466("\u0000`v")), method4467(method4466("\u0001dt")), method4467(method4466("\u000bna")) } };

    @OriginalMember(owner = "client!laa", name = "Q", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!laa", name = "C", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "Lrj;")
    public static class252 field8660;

    @OriginalMember(owner = "client!laa", name = "L", descriptor = "Lbka;")
    public static class791 field8668;

    @OriginalMember(owner = "client!laa", name = "P", descriptor = "[I")
    public static int[] field8671;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)Z")
    public final boolean method43(byte arg0) {
        try {
            ++field8657;
            for (int var2 = this.field8663; ~var2 >= ~this.field8666; ++var2) {
                for (int var3 = this.field8669; ~var3 >= ~this.field8661; ++var3) {
                    int var4 = -class269.field3812 + var2 + class501.field7316;
                    if (var4 >= 0 && ~var4 > ~class30.field385.length) {
                        int var5 = -class98.field1331 + class501.field7316 + var3;
                        if (var5 >= 0 && ~var5 > ~class30.field385.length && class30.field385[var4][var5]) {
                            return true;
                        }
                    }
                }
            }
            int var6 = -37 % ((-37 - arg0) / 55);
            return false;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8672[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B[Lta;)I")
    public final int method41(byte arg0, class330[] arg1) {
        try {
            ++field8662;
            int var3 = 0;
            label134: for (int var4 = this.field8663; ~this.field8666 <= ~var4; ++var4) {
                label132: for (int var5 = this.field8669; ~this.field8661 <= ~var5; ++var5) {
                    long var6 = class502.field7334[super.field2981][var4][var5];
                    long var8 = 0L;
                    while (true) {
                        label127: while (true) {
                            if (~var8 < -49L) {
                                continue label132;
                            }
                            int var10 = (int) (65535L & var6 >>> (int) var8);
                            if (~var10 >= -1) {
                                continue label132;
                            }
                            class382 var11 = class678.field9526[var10 + -1];
                            for (int var12 = 0; var3 > var12; ++var12) {
                                if (arg1[var12] == var11.field5573) {
                                    var8 += 16L;
                                    continue label127;
                                }
                            }
                            arg1[var3++] = var11.field5573;
                            if (~var3 == -5) {
                                break label134;
                            }
                            var8 += 16L;
                        }
                    }
                }
            }
            int var13 = 119 % ((45 - arg0) / 33);
            for (int var14 = var3; ~var14 > -5; ++var14) {
                arg1[var14] = null;
            }
            if (this.field8664 != 0) {
                int var15 = this.field8663 - class269.field3812;
                int var16 = -class98.field1331 + this.field8669;
                short var17;
                short var18;
                int var19;
                int var20;
                if (this.field8664 != 1) {
                    if (~var16 >= ~(-var15)) {
                        var17 = this.field8663;
                        var18 = this.field8669;
                        var19 = this.field8669 + 1;
                        var20 = this.field8663 + 1;
                    } else {
                        var20 = this.field8663 + -1;
                        var18 = this.field8669;
                        var17 = this.field8663;
                        var19 = this.field8669 - 1;
                    }
                } else if (var15 >= var16) {
                    var17 = this.field8663;
                    var18 = this.field8669;
                    var20 = this.field8663 + -1;
                    var19 = this.field8669 + 1;
                } else {
                    var18 = this.field8669;
                    var20 = this.field8663 + 1;
                    var17 = this.field8663;
                    var19 = this.field8669 - 1;
                }
                label98: for (int var21 = 0; ~var21 > ~var3; ++var21) {
                    long var22 = class502.field7334[super.field2981][var17][var19];
                    while (var22 != 0L) {
                        class382 var24 = class678.field9526[(int) ((var22 & 65535L) - 1L)];
                        var22 >>>= 16;
                        if (arg1[var21] == var24.field5573) {
                            continue label98;
                        }
                    }
                    long var25 = class502.field7334[super.field2981][var20][var18];
                    while (~var25 != -1L) {
                        class382 var27 = class678.field9526[(int) ((65535L & var25) + -1L)];
                        var25 >>>= 16;
                        if (arg1[var21] == var27.field5573) {
                            continue label98;
                        }
                    }
                    for (int var28 = var21; ~(var3 + -1) < ~var28; ++var28) {
                        arg1[var28] = arg1[var28 + 1];
                    }
                    --var3;
                }
            }
            return var3;
        } catch (RuntimeException var30) {
            throw class665.method4799(var30, field8672[5] + arg0 + ',' + (arg1 != null ? field8672[2] : field8672[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(B)V")
    public void method1427(byte arg0) {
        try {
            ++field8659;
            int var2 = -27 % ((47 - arg0) / 56);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8672[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(B)V")
    public static void method4465(byte arg0) {
        try {
            field8670 = null;
            field8668 = null;
            if (arg0 >= -117) {
                field8668 = null;
            }
            field8671 = null;
            field8660 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8672[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        try {
            this.field8667 = arg9;
            super.field2971 = (byte) arg1;
            this.field8661 = (short) arg8;
            super.field2969 = arg2;
            super.field2981 = (byte) arg0;
            this.field8666 = (short) arg6;
            super.field2975 = arg3;
            this.field8663 = (short) arg5;
            this.field8669 = (short) arg7;
            this.field8664 = arg10;
            super.field2984 = arg4;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field8672[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lha;B)Z")
    public final boolean method45(class18 arg0, byte arg1) {
        try {
            ++field8665;
            return arg1 > -76 ? false : class347.method2778(this.field8663, super.field2971, -101, this.method587(arg0, (byte) 127), this.field8669, this.field8666, this.field8661);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8672[3] + (arg0 != null ? field8672[2] : field8672[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4466(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 87);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4467(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
