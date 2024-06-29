import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class352 extends class395 implements class722 {

    @OriginalMember(owner = "client!bo", name = "lb", descriptor = "Z")
    private boolean field5089 = false;

    @OriginalMember(owner = "client!bo", name = "db", descriptor = "Ldj;")
    public class708 field5081;

    @OriginalMember(owner = "client!bo", name = "gb", descriptor = "Z")
    private boolean field5084;

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "Lmfa;")
    public static class409 field5071 = new class409(7500);

    @OriginalMember(owner = "client!bo", name = "pb", descriptor = "I")
    public static int field5093 = -1;

    @OriginalMember(owner = "client!bo", name = "ob", descriptor = "Ltha;")
    public static class372 field5092 = new class372();

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!bo", name = "V", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!bo", name = "W", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!bo", name = "X", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!bo", name = "Y", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!bo", name = "Z", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!bo", name = "ab", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!bo", name = "bb", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!bo", name = "cb", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!bo", name = "eb", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!bo", name = "fb", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!bo", name = "hb", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!bo", name = "ib", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!bo", name = "jb", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!bo", name = "mb", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!bo", name = "nb", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!bo", name = "qb", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!bo", name = "rb", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!bo", name = "kb", descriptor = "Liha;")
    private class613 field5088;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lha;Z)V")
    public final void method786(class548 arg0, boolean arg1) {
        ++field5067;
        if (!arg1) {
            field5092 = null;
        }
        this.field5081.method3978(arg0, -384);
    }

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "(I)V")
    public static void method2269(int arg0) {
        if (arg0 == 32087) {
            field5071 = null;
            field5092 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lha;B)V")
    public final void method792(class548 arg0, byte arg1) {
        if (arg1 >= -105) {
            this.method784(-79);
        }
        ++field5079;
        this.field5081.method3985(-5923, arg0);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLha;ZILuq;II)V")
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        ++field5086;
        if (arg0 >= -8) {
            field5071 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILha;IB)Z")
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        ++field5077;
        class284 var5 = this.field5081.method3988(false, false, -102, arg1, 131072);
        if (var5 == null) {
            return false;
        } else {
            class744 var6 = arg1.method1404();
            var6.method905(super.field4410, super.field4413, super.field4418);
            if (arg3 >= -58) {
                this.method792((class548) null, (byte) -3);
            }
            return !class301.field4261 ? var5.method1669(arg0, arg2, var6, false, 0) : var5.method1653(arg0, arg2, var6, false, 0, class3.field30);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)I")
    public final int method794(int arg0) {
        ++field5068;
        return arg0 < 92 ? -6 : this.field5081.field9889;
    }

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "(I)Z")
    public final boolean method785(int arg0) {
        ++field5095;
        if (arg0 > -117) {
            field5093 = -100;
        }
        return this.field5089;
    }

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "(I)V")
    public final void method641(int arg0) {
        if (arg0 <= 91) {
            this.method794(-53);
        }
        ++field5087;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLha;)V")
    public final void method659(boolean arg0, class548 arg1) {
        if (!arg0) {
            ++field5069;
            class284 var3 = this.field5081.method3988(true, true, -108, arg1, 262144);
            if (var3 != null) {
                class744 var4 = arg1.method1404();
                var4.method905(super.field4410, super.field4413, super.field4418);
                this.field5081.method3980(var4, super.field5679, super.field5683, var3, super.field5673, arg1, false, super.field5680, -20837);
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "(I)I")
    public final int method790(int arg0) {
        if (arg0 != -11692) {
            field5093 = -17;
        }
        ++field5075;
        return this.field5081.method3983(-48);
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lha;Lts;IIIIIZIIIIIII)V")
    public class352(class548 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field2932 == -2, class615.method3484(18109, arg13, arg12));
        this.field5081 = new class708(arg0, arg1, arg12, arg13, super.field4408, arg3, this, arg7, arg14);
        this.field5084 = ~arg1.field2948 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(Lha;B)Liha;")
    public final class613 method653(class548 arg0, byte arg1) {
        ++field5078;
        if (arg1 != 13) {
            this.field5088 = null;
        }
        return this.field5088;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
    public final void method795(int arg0) {
        if (arg0 <= 31) {
            field5093 = 37;
        }
        ++field5074;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lkea;Z)V")
    public final void method2270(class77 arg0, boolean arg1) {
        this.field5081.method3989(-31939, arg0);
        ++field5094;
        if (!arg1) {
            this.method660((class548) null, 2);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)I")
    public final int method784(int arg0) {
        if (arg0 != -4532) {
            field5093 = -8;
        }
        ++field5085;
        return this.field5081.field9879;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)I")
    public final int method793(byte arg0) {
        if (arg0 != -86) {
            this.method792((class548) null, (byte) 0);
        }
        ++field5070;
        return this.field5081.method3979(10);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lha;I)Lua;")
    public final class3 method660(class548 arg0, int arg1) {
        ++field5080;
        class284 var3 = this.field5081.method3988(true, false, -104, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class744 var4 = arg0.method1404();
            if (arg1 != -1) {
                return null;
            } else {
                var4.method905(super.field4410, super.field4413, super.field4418);
                class3 var5 = class682.method3841(1, this.field5084, 28389);
                this.field5081.method3980(var4, super.field5679, super.field5683, var3, super.field5673, arg0, true, super.field5680, -20837);
                if (class301.field4261) {
                    var3.method1682(var4, var5.field18[0], class3.field30, 0);
                } else {
                    var3.method1686(var4, var5.field18[0], 0);
                }
                if (this.field5081.field9885 != null) {
                    class100 var6 = this.field5081.field9885.method3895();
                    if (class301.field4261) {
                        arg0.method1479(var6, class3.field30);
                    } else {
                        arg0.method1413(var6);
                    }
                }
                this.field5089 = var3.method1673() || this.field5081.field9885 != null;
                if (this.field5088 != null) {
                    class507.method3047(super.field4410, super.field4418, -121, var3, super.field4413, this.field5088);
                } else {
                    this.field5088 = class491.method2980(super.field4418, 0, super.field4413, var3, super.field4410);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)Z")
    public final boolean method783(int arg0) {
        ++field5073;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I")
    public final int method782(byte arg0) {
        ++field5082;
        int var2 = 63 % ((-5 - arg0) / 54);
        return this.field5081.field9863;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
    public static final void method2271(int arg0, int arg1) {
        ++field5083;
        class329.field4660 = -1;
        if (arg0 != 37) {
            if (~arg0 != -51) {
                if (~arg0 == -76) {
                    class461.field6392 = 6.0F;
                } else if (~arg0 != -101) {
                    if (~arg0 == -201) {
                        class461.field6392 = 16.0F;
                    }
                } else {
                    class461.field6392 = 8.0F;
                }
            } else {
                class461.field6392 = 4.0F;
            }
        } else {
            class461.field6392 = 3.0F;
        }
        class329.field4660 = -1;
        if (arg1 != -32459) {
            field5071 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)Z")
    public final boolean method781(int arg0) {
        ++field5091;
        return arg0 >= -86 ? false : this.field5081.method3977((byte) -86);
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Z")
    public final boolean method642(byte arg0) {
        ++field5072;
        if (arg0 != 2) {
            field5071 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(III)Z")
    public static final boolean method2272(int arg0, int arg1, int arg2) {
        ++field5090;
        if (arg1 >= -67) {
            return true;
        } else {
            return (33 & arg2) != 0;
        }
    }
}
