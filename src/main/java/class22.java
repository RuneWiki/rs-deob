import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class22 extends class331 implements class289 {

    @OriginalMember(owner = "client!et", name = "m", descriptor = "Lkd;")
    public class156 field198;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "Z")
    private boolean field211;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "Lcb;")
    public static class318 field207 = new class318(44, 4);

    @OriginalMember(owner = "client!et", name = "B", descriptor = "Ljj;")
    public static class398 field213 = new class398(34, 6);

    @OriginalMember(owner = "client!et", name = "G", descriptor = "Lcb;")
    public static class318 field217 = new class318(104, 6);

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!et", name = "C", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!et", name = "D", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "Lvg;")
    private class162 field206;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method122(boolean arg0) {
        ++field208;
        if (arg0) {
            this.method127(18);
        }
        return this.field198.method1042(121);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(BLoa;)V", line = 21)
    public final void method123(byte arg0, class689 arg1) {
        ++field203;
        class629 var3 = this.field198.method1039(true, 262144, super.field4847, super.field4845, 0, arg1, true);
        if (var3 != null) {
            int var4 = super.field4847 >> 9;
            int var5 = super.field4845 >> 9;
            class111 var6 = arg1.method1972();
            var6.method609(super.field4847, super.field4844, super.field4845);
            this.field198.method1040(arg1, var6, var4, var5, var3, var4, var5, (byte) -92, false);
        }
        if (arg0 <= 91) {
            field213 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILoa;)Lba;", line = 48)
    public final class629 method124(int arg0, int arg1, class689 arg2) {
        if (arg1 != 17925) {
            return null;
        } else {
            ++field205;
            return this.field198.method1039(false, arg0, 0, 0, arg1 ^ 17925, arg2, false);
        }
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)V", line = 60)
    public static void method125(int arg0) {
        field213 = null;
        field207 = null;
        field217 = null;
        if (arg0 != 98209161) {
            field217 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I", line = 72)
    public final int method126(int arg0) {
        ++field212;
        return arg0 != 20377 ? -10 : this.field198.field1961;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V", line = 83)
    public final void method127(int arg0) {
        ++field214;
        if (arg0 <= 118) {
            this.method127(-5);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I", line = 94)
    public final int method128(byte arg0) {
        if (arg0 <= 35) {
            return 9;
        } else {
            ++field199;
            return this.field198.field1952;
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(ILoa;)V", line = 105)
    public final void method129(int arg0, class689 arg1) {
        this.field198.method1041((byte) -91, arg1);
        ++field204;
        if (arg0 != 27921) {
            this.method131(-126, (class689) null);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I", line = 116)
    public final int method130(int arg0) {
        if (arg0 != -5582) {
            return -31;
        } else {
            ++field218;
            return this.field198.field1960;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILoa;)V", line = 127)
    public final void method131(int arg0, class689 arg1) {
        ++field210;
        this.field198.method1037(119, arg1);
        if (arg0 != -20929) {
            this.method126(-96);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V", line = 144)
    public final void method132(boolean arg0) {
        if (!arg0) {
            this.method128((byte) 118);
        }
        ++field209;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V", line = 155)
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field216;
        if (arg4 != -8763) {
            this.field211 = false;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Loa;Luca;IIIIIZII)V", line = 172)
    public class22(class689 arg0, class252 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field3481, arg1.field3430, arg1.field3484);
        this.field198 = new class156(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field211 = ~arg1.field3453 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BLoa;)Lvg;", line = 182)
    public final class162 method134(byte arg0, class689 arg1) {
        ++field200;
        if (arg0 < 121) {
            field213 = null;
        }
        return this.field206;
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)Z", line = 193)
    public final boolean method135(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field201;
            return false;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Loa;B)Llt;", line = 204)
    public final class95 method136(class689 arg0, byte arg1) {
        ++field202;
        class629 var3 = this.field198.method1039(true, 2048, super.field4847, super.field4845, 0, arg0, false);
        if (var3 == null) {
            return null;
        } else if (arg1 > -47) {
            return null;
        } else {
            class111 var4 = arg0.method1972();
            var4.method609(super.field4847, super.field4844, super.field4845);
            class95 var5 = null;
            if (this.field211) {
                var5 = class429.method2472(1, (byte) -104);
            }
            int var6 = super.field4847 >> 9;
            int var7 = super.field4845 >> 9;
            this.field198.method1040(arg0, var4, var6, var7, var3, var6, var7, (byte) -47, true);
            if (this.field198.field1943 != null) {
                class309 var8 = this.field198.field1943.method721();
                arg0.method1892(var3, var8, var4, var5 != null ? var5.field1175[0] : null, 0);
            } else {
                var3.method665(var4, var5 != null ? var5.field1175[0] : null, 0);
            }
            if (this.field206 != null) {
                class611.method3365(super.field4844, -82, super.field4847, var3, this.field206, super.field4845);
            } else {
                this.field206 = class440.method2525(255, var3, super.field4847, super.field4844, super.field4845);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIILoa;)Z", line = 250)
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        ++field215;
        class629 var5 = this.field198.method1039(false, 131072, super.field4847, super.field4845, 0, arg3, false);
        if (var5 == null) {
            return false;
        } else {
            class111 var6 = arg3.method1972();
            var6.method609(super.field4847, super.field4844, super.field4845);
            if (arg2 <= 117) {
                this.method128((byte) -128);
            }
            return var5.method695(arg0, arg1, var6, false);
        }
    }
}
