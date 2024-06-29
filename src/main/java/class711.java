import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class711 extends class395 {

    @OriginalMember(owner = "client!io", name = "S", descriptor = "Z")
    private boolean field9913 = true;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "I")
    private int field9910 = 0;

    @OriginalMember(owner = "client!io", name = "Y", descriptor = "I")
    private int field9919 = 0;

    @OriginalMember(owner = "client!io", name = "V", descriptor = "I")
    private int field9916 = -1;

    @OriginalMember(owner = "client!io", name = "bb", descriptor = "I")
    private int field9922 = 0;

    @OriginalMember(owner = "client!io", name = "X", descriptor = "Z")
    public boolean field9918 = false;

    @OriginalMember(owner = "client!io", name = "qb", descriptor = "I")
    private int field9937 = 0;

    @OriginalMember(owner = "client!io", name = "sb", descriptor = "I")
    private int field9939 = 0;

    @OriginalMember(owner = "client!io", name = "lb", descriptor = "I")
    private int field9932;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "I")
    public int field9912;

    @OriginalMember(owner = "client!io", name = "rb", descriptor = "Lpia;")
    private class57 field9938;

    @OriginalMember(owner = "client!io", name = "hb", descriptor = "Lkr;")
    public static class602 field9928 = new class602(43, 4);

    @OriginalMember(owner = "client!io", name = "tb", descriptor = "Z")
    public static boolean field9940 = false;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!io", name = "T", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!io", name = "U", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!io", name = "W", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!io", name = "Z", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!io", name = "ab", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!io", name = "cb", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!io", name = "db", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!io", name = "eb", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!io", name = "fb", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!io", name = "gb", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!io", name = "ib", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!io", name = "jb", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!io", name = "kb", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!io", name = "nb", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!io", name = "ob", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!io", name = "pb", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!io", name = "mb", descriptor = "Lnha;")
    private class689 field9933;

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 6)
    public class711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field9932 = arg0;
        this.field9937 = arg12;
        this.field9912 = arg1 + arg2;
        class46 var14 = class129.field1776.method4073(-7428, this.field9932);
        int var15 = var14.field596;
        if (~var15 != 0) {
            this.field9938 = class607.field8188.method3001(-12575, var15);
            this.field9918 = false;
        } else {
            this.field9918 = true;
        }
        if (this.field9912 == arg2) {
            class123.method765(this.field9939, this, this.field9938, false);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 43)
    public static void method3998(byte arg0) {
        field9928 = null;
        if (arg0 != -1) {
            field9928 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 55)
    public static final void method3999(int arg0) {
        if (arg0 != 0) {
            field9940 = true;
        }
        ++field9920;
        for (class558 var1 = (class558) class290.field4161.method3618(-95); var1 != null; var1 = (class558) class290.field4161.method3619(0)) {
            if (class321.method2070(arg0 ^ 30264, var1.field7754)) {
                class79.method578(var1, -97);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "m", descriptor = "(I)V", line = 77)
    public final void method641(int arg0) {
        if (arg0 > 91) {
            ++field9931;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILha;IB)Z", line = 88)
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        if (arg3 >= -58) {
            this.method660((class548) null, 115);
        }
        ++field9911;
        return false;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)Z", line = 111)
    public final boolean method642(byte arg0) {
        ++field9926;
        if (arg0 != 2) {
            this.method660((class548) null, -98);
        }
        return false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IILha;B)Lka;", line = 122)
    private final class284 method4000(int arg0, int arg1, class548 arg2, byte arg3) {
        ++field9930;
        class46 var5 = class129.field1776.method4073(-7428, arg0);
        if (arg3 != -120) {
            this.field9932 = 109;
        }
        class341 var6 = class550.field7649[super.field4408];
        class341 var7 = super.field4419 < 3 ? class550.field7649[super.field4419 + 1] : null;
        return this.field9918 ? var5.method254(super.field4418, arg1, -1, class607.field8188, true, super.field4410, -1, super.field4413, var7, arg2, var6, -128, 0) : var5.method254(super.field4418, arg1, this.field9939, class607.field8188, true, super.field4410, this.field9916, super.field4413, var7, arg2, var6, -112, this.field9910);
    }

    @OriginalMember(owner = "client!io", name = "l", descriptor = "(I)Z", line = 140)
    public final boolean method785(int arg0) {
        if (arg0 > -117) {
            this.method4003((class284) null, false, (class744) null, (class548) null);
        }
        ++field9934;
        return this.field9913;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V", line = 151)
    public final void method4001(int arg0, int arg1) {
        ++field9936;
        if (!this.field9918) {
            this.field9910 += arg1;
            if (arg0 == 0) {
                while (this.field9910 > this.field9938.field813[this.field9939]) {
                    this.field9910 -= this.field9938.field813[this.field9939];
                    ++this.field9939;
                    if (~this.field9939 <= ~this.field9938.field821.length) {
                        this.field9918 = true;
                        break;
                    }
                }
                if (!this.field9918) {
                    class123.method765(this.field9939, this, this.field9938, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "n", descriptor = "(I)I", line = 189)
    public final int method790(int arg0) {
        if (arg0 != -11692) {
            this.field9933 = null;
        }
        ++field9927;
        return this.field9922;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLha;)V", line = 201)
    public final void method659(boolean arg0, class548 arg1) {
        ++field9924;
        if (arg0) {
            this.field9918 = true;
        }
        class284 var3 = this.method4000(this.field9932, 0, arg1, (byte) -120);
        if (var3 != null) {
            class744 var4 = arg1.method1404();
            var4.method905(super.field4410, super.field4413, super.field4418);
            this.method4003(var3, true, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!io", name = "h", descriptor = "(I)Z", line = 222)
    public final boolean method783(int arg0) {
        if (arg0 != 0) {
            method3999(-4);
        }
        ++field9914;
        return false;
    }

    @OriginalMember(owner = "client!io", name = "finalize", descriptor = "()V", line = 235)
    protected final void finalize() {
        if (this.field9933 != null) {
            this.field9933.method3891();
        }
        ++field9929;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(B)I", line = 248)
    public final int method793(byte arg0) {
        if (arg0 != -86) {
            this.method783(-5);
        }
        ++field9923;
        return this.field9919;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Lha;B)Liha;", line = 261)
    public final class613 method653(class548 arg0, byte arg1) {
        if (arg1 != 13) {
            return null;
        } else {
            ++field9917;
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V", line = 272)
    public final void method4002(byte arg0) {
        if (arg0 == 27) {
            if (this.field9933 != null) {
                this.field9933.method3891();
            }
            ++field9921;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lka;ZLih;Lha;)V", line = 293)
    private final void method4003(class284 arg0, boolean arg1, class744 arg2, class548 arg3) {
        ++field9915;
        arg0.method1661(arg2);
        if (!arg1) {
            this.method644(-116, (class548) null, -51, (byte) -54);
        }
        class44[] var5 = arg0.method1662();
        class491[] var6 = arg0.method1688();
        if ((this.field9933 == null || this.field9933.field9588) && (var5 != null || var6 != null)) {
            this.field9933 = class689.method3884(class483.field6741, true);
        }
        if (this.field9933 != null) {
            this.field9933.method3882(arg3, (long) class483.field6741, var5, var6, false);
            this.field9933.method3892(super.field4408, super.field5680, super.field5683, super.field5673, super.field5679);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BLha;ZILuq;II)V", line = 318)
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        ++field9935;
        if (arg0 >= -8) {
            this.method641(91);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lha;I)Lua;", line = 330)
    public final class3 method660(class548 arg0, int arg1) {
        ++field9925;
        class284 var3 = this.method4000(this.field9932, (~this.field9937 != arg1 ? 5 : 0) | 2048, arg0, (byte) -120);
        if (var3 == null) {
            return null;
        } else {
            if (this.field9937 != 0) {
                var3.method1704(this.field9937 * 2048);
            }
            class744 var4 = arg0.method1404();
            var4.method905(super.field4410, super.field4413, super.field4418);
            this.method4003(var3, true, var4, arg0);
            class3 var5 = class682.method3841(1, false, 28389);
            if (!class301.field4261) {
                var3.method1686(var4, var5.field18[0], 0);
            } else {
                var3.method1682(var4, var5.field18[0], class3.field30, 0);
            }
            if (this.field9933 != null) {
                class100 var6 = this.field9933.method3895();
                if (class301.field4261) {
                    arg0.method1479(var6, class3.field30);
                } else {
                    arg0.method1413(var6);
                }
            }
            this.field9913 = var3.method1673();
            this.field9922 = var3.method1668();
            this.field9919 = var3.method1697();
            return var5;
        }
    }
}
