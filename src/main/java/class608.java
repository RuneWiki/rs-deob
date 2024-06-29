import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class608 extends class249 implements class289 {

    @OriginalMember(owner = "client!pfa", name = "y", descriptor = "Lkd;")
    public class156 field8289;

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "Z")
    private boolean field8290;

    @OriginalMember(owner = "client!pfa", name = "B", descriptor = "Lnj;")
    public static class436 field8292 = new class436(16);

    @OriginalMember(owner = "client!pfa", name = "v", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!pfa", name = "w", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!pfa", name = "x", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!pfa", name = "A", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!pfa", name = "C", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!pfa", name = "E", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!pfa", name = "G", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!pfa", name = "H", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!pfa", name = "I", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!pfa", name = "J", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!pfa", name = "K", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!pfa", name = "L", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!pfa", name = "M", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!pfa", name = "D", descriptor = "Lvg;")
    private class162 field8294;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(ILoa;)V", line = 5)
    public final void method129(int arg0, class689 arg1) {
        this.field8289.method1041((byte) -109, arg1);
        ++field8301;
        if (arg0 != 27921) {
            method3353((byte) 93);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(B)V", line = 16)
    public static void method3353(byte arg0) {
        int var1 = 21 % ((arg0 - 50) / 40);
        field8292 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIILoa;)Z", line = 26)
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        ++field8288;
        class629 var5 = this.field8289.method1039(false, 131072, super.field3343, super.field3350, 0, arg3, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 <= 117) {
                this.method130(-45);
            }
            class111 var6 = arg3.method1972();
            var6.method609(super.field3343 - -super.field3346, super.field3358, super.field3350 - -super.field3359);
            return var5.method695(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(BLoa;)V", line = 47)
    public final void method123(byte arg0, class689 arg1) {
        if (arg0 <= 91) {
            this.method137(120, -113, -68, (class689) null);
        }
        ++field8287;
        class629 var3 = this.field8289.method1039(true, 262144, super.field3343, super.field3350, 0, arg1, false);
        if (var3 != null) {
            int var4 = super.field3343 >> 9;
            int var5 = super.field3350 >> 9;
            class111 var6 = arg1.method1972();
            var6.method609(super.field3343, super.field3358, super.field3350);
            this.field8289.method1040(arg1, var6, var4, var5, var3, var4, var5, (byte) -57, false);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)I", line = 76)
    public final int method130(int arg0) {
        ++field8297;
        return arg0 != -5582 ? 9 : this.field8289.field1960;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Loa;B)Llt;", line = 88)
    public final class95 method136(class689 arg0, byte arg1) {
        ++field8296;
        class629 var3 = this.field8289.method1039(true, 2048, super.field3343, super.field3350, 0, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 >= -47) {
                this.field8290 = true;
            }
            class111 var4 = arg0.method1972();
            var4.method609(super.field3346 + super.field3343, super.field3358, super.field3350 - -super.field3359);
            class95 var5 = null;
            if (this.field8290) {
                var5 = class429.method2472(1, (byte) -71);
            }
            int var6 = super.field3343 >> 9;
            int var7 = super.field3350 >> 9;
            this.field8289.method1040(arg0, var4, var6, var7, var3, var6, var7, (byte) -111, true);
            if (this.field8289.field1943 != null) {
                class309 var8 = this.field8289.field1943.method721();
                arg0.method1892(var3, var8, var4, var5 != null ? var5.field1175[0] : null, 0);
            } else {
                var3.method665(var4, var5 == null ? null : var5.field1175[0], 0);
            }
            if (this.field8294 == null) {
                this.field8294 = class440.method2525(255, var3, super.field3343, super.field3358, super.field3350);
            } else {
                class611.method3365(super.field3358, -119, super.field3343, var3, this.field8294, super.field3350);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "(I)I", line = 134)
    public final int method522(int arg0) {
        ++field8295;
        return arg0 > -95 ? 21 : this.field8289.method1038((byte) 33);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILoa;)V", line = 147)
    public final void method131(int arg0, class689 arg1) {
        if (arg0 != -20929) {
            method3353((byte) -108);
        }
        ++field8286;
        this.field8289.method1037(104, arg1);
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Loa;Luca;IIIIIZIIIIII)V", line = 158)
    public class608(class689 arg0, class252 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class297.method1776(arg12, arg11, 5834));
        this.field8289 = new class156(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field8290 = arg1.field3453 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)Z", line = 167)
    public final boolean method122(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field8302;
            return this.field8289.method1042(96);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)I", line = 183)
    public final int method126(int arg0) {
        ++field8298;
        if (arg0 != 20377) {
            this.method132(false);
        }
        return this.field8289.field1961;
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(Z)V", line = 194)
    public final void method132(boolean arg0) {
        if (!arg0) {
            this.field8290 = true;
        }
        ++field8299;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IILoa;)Lba;", line = 204)
    public final class629 method124(int arg0, int arg1, class689 arg2) {
        ++field8291;
        return arg1 != 17925 ? null : this.field8289.method1039(false, arg0, 0, 0, 0, arg2, false);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)I", line = 218)
    public final int method128(byte arg0) {
        if (arg0 <= 35) {
            this.method136((class689) null, (byte) 21);
        }
        ++field8293;
        return this.field8289.field1952;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BLoa;)Lvg;", line = 230)
    public final class162 method134(byte arg0, class689 arg1) {
        ++field8300;
        if (arg0 < 121) {
            this.method122(true);
        }
        return this.field8294;
    }
}
