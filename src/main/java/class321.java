import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class321 extends class57 {

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    private int field5012 = 0;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    private int field5000 = -1;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
    private int field5027 = 0;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Z")
    public boolean field5001 = false;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    private int field5018 = -32768;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    private int field5016;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Lgn;")
    private class417 field5006;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field4999 = 0;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field5023 = " is already on your ignore list.";

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Lmo;")
    public static class447 field5002;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lpj;")
    private class78 field5007;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "[[B")
    public static byte[][] field5015;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Le;B)V")
    public final void method196(class312 arg0, byte arg1) {
        ++field5014;
        class348 var3 = this.method2132(0, -85, arg0);
        if (var3 != null) {
            this.method2136(var3, arg0, (byte) 114);
        }
        if (arg1 >= -66) {
            this.method196((class312) null, (byte) -22);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 > 65) {
            ++field5029;
            if (~class406.field6033 >= ~(-arg6 + arg5) && class185.field3005 >= arg5 - -arg6 && class99.field1378 <= -arg6 + arg2 && ~(arg2 + arg6) >= ~class396.field5925) {
                class179.method1229(arg2, arg0, true, arg5, arg6, arg3, arg1);
            } else {
                class367.method2357(arg5, arg2, arg0, arg6, arg1, arg3, (byte) -39);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)V")
    public static final void method2128(byte arg0, int arg1) {
        ++field5004;
        class33 var2 = (class33) class126.field1937.method1770(arg0 ^ 769, (long) arg1);
        if (var2 != null) {
            if (arg0 != -111) {
                method2135(-26, 48, -97);
            }
            var2.method1120(arg0 ^ -90);
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(BI)V")
    public final void method2129(byte arg0, int arg1) {
        ++field5003;
        if (!this.field5001) {
            if (arg0 == -103) {
                this.field5012 += arg1;
                while (this.field5012 > this.field5006.field6171[this.field5027]) {
                    this.field5012 -= this.field5006.field6171[this.field5027];
                    ++this.field5027;
                    if (this.field5027 >= this.field5006.field6177.length) {
                        this.field5001 = true;
                        break;
                    }
                }
                if (!this.field5001) {
                    class196.method1374(super.field722, (byte) -104, this.field5027, super.field724, false, this.field5006);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lkk;IIIII)V")
    public static final void method2130(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1422 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; ++var6) {
            label56: for (int var7 = arg3; var7 <= arg5; ++var7) {
                int var8 = class411.field6089[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 255;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class369 var11 = class27.field317[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field1422; ++var12) {
                            if (arg0.field1416[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field1416[arg0.field1422++] = var11;
                        if (arg0.field1422 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field1422; var13 < 4; ++var13) {
            arg0.field1416[var13] = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    public final void method193(int arg0) {
        ++field5011;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILe;IIZLhm;I)V")
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        if (arg3 == 0) {
            ++field5024;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public final void method2131(boolean arg0) {
        if (this.field5007 != null) {
            this.field5007.method497();
        }
        ++field5008;
        if (!arg0) {
            this.field5027 = 27;
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)I")
    public final int method314(int arg0) {
        if (arg0 != 27647) {
            return -11;
        } else {
            ++field5013;
            return this.field5018;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILe;)Lid;")
    private final class348 method2132(int arg0, int arg1, class312 arg2) {
        ++field5020;
        if (arg1 > -63) {
            field5017 = -76;
        }
        class379 var4 = class115.method839((byte) -57, this.field5016);
        return this.field5001 ? var4.method2415(-1, -1, arg0, -83, arg2, 0) : var4.method2415(this.field5000, this.field5027, arg0, -99, arg2, this.field5012);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljd;I)V")
    public static final void method2133(class124 arg0, int arg1) {
        if (arg1 == 25498) {
            ++field5021;
            int var2 = -class183.field2987 + arg0.field1840;
            int var3 = arg0.field1842 * 128 + arg0.method903(-40) * 64;
            int var4 = arg0.field1892 * 128 - -(arg0.method903(arg1 ^ -25535) * 64);
            arg0.field722 += (var4 - arg0.field722) / var2;
            arg0.field1903 = 0;
            arg0.field724 += (-arg0.field724 + var3) / var2;
            if (~arg0.field1895 == -1) {
                arg0.method904(8192, 1);
            }
            if (~arg0.field1895 == -2) {
                arg0.method904(12288, arg1 ^ 25499);
            }
            if (~arg0.field1895 == -3) {
                arg0.method904(0, 1);
            }
            if (arg0.field1895 == 3) {
                arg0.method904(4096, arg1 ^ 25499);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILe;)Z")
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field5010;
        return arg1 != 65536 ? false : false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Le;Z)Lum;")
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field5009;
        class348 var3 = this.method2132(1024, -87, arg0);
        if (var3 == null) {
            return null;
        } else {
            class435 var4 = arg0.method713();
            if (!arg1) {
                return null;
            } else {
                var4.method1984(super.field724, super.field721, super.field722);
                if (this.field5007 == null) {
                    var3.method26(var4, (class170) null, 0);
                } else {
                    class198 var5 = this.field5007.method489();
                    arg0.method561(var3, var5, var4, (class170) null, 0);
                }
                this.field5018 = var3.method57();
                this.method2136(var3, arg0, (byte) 82);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method2134(int arg0) {
        if (arg0 >= 0) {
            method2127(118, -34, -28, -127, -128, -114, 114);
        }
        field5002 = null;
        field5023 = null;
        field5015 = null;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Z")
    public final boolean method186(int arg0) {
        ++field5026;
        if (arg0 != 0) {
            field5015 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field5016 = arg0;
        this.field5019 = arg1 + arg2;
        int var12 = class115.method839((byte) -57, this.field5016).field5734;
        if (~var12 != 0) {
            this.field5001 = false;
            this.field5006 = class156.method1099(var12, 91);
        } else {
            this.field5001 = true;
        }
        if (this.field5019 == arg2) {
            class196.method1374(super.field722, (byte) -104, this.field5027, super.field724, false, this.field5006);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public static final void method2135(int arg0, int arg1, int arg2) {
        ++field5028;
        int var3 = class232.field3867 * arg0 >> 8;
        if (~arg2 == 0 && !class241.field3998) {
            class68.method430((byte) -36);
        } else if (~arg2 != 0 && (class160.field2533 != arg2 || !class402.method2529((byte) -125)) && ~var3 != -1 && !class241.field3998) {
            class221.method1585(class125.field1930, arg2, (byte) -88, var3, 2, false, 0);
        }
        if (arg1 != 255) {
            field5002 = null;
        }
        class160.field2533 = arg2;
    }

    @OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field5007 != null) {
            this.field5007.method497();
        }
        ++field5025;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lid;Le;B)V")
    private final void method2136(class348 arg0, class312 arg1, byte arg2) {
        ++field5022;
        if (arg2 > 54) {
            class11[] var4 = arg0.method7();
            class252[] var5 = arg0.method43();
            if ((this.field5007 == null || this.field5007.field973) && (var4 != null || var5 != null)) {
                this.field5007 = new class78(class183.field2987);
            }
            if (this.field5007 != null) {
                this.field5007.method488(arg1, (long) class183.field2987, var4, var5, false);
                this.field5007.method492(super.field714, super.field726, super.field710, super.field720, super.field711);
            }
        }
    }
}
