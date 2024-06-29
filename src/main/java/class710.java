import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class710 extends class445 implements class310 {

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "Las;")
    public class142 field9914;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "Z")
    private boolean field9922;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "Ldr;")
    public static class675 field9920 = new class675(101, -2);

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
    public static int field9928 = 1337;

    @OriginalMember(owner = "client!ms", name = "H", descriptor = "I")
    public static int field9929 = 52;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "Lqt;")
    private class595 field9933;

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "[Lwh;")
    public static class137[] field9931;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Loa;BI)Lba;", line = 6)
    public final class359 method134(class650 arg0, byte arg1, int arg2) {
        if (arg1 < 80) {
            field9929 = -126;
        }
        ++field9917;
        return this.field9914.method891(arg2, arg0, (byte) -68, 0, false, 0, false);
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)Z", line = 18)
    public final boolean method137(int arg0) {
        if (arg0 > -30) {
            field9931 = null;
        }
        ++field9925;
        return false;
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)V", line = 36)
    public final void method140(byte arg0) {
        ++field9910;
        int var2 = -17 / ((-16 - arg0) / 40);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V", line = 52)
    public final void method132(int arg0) {
        if (arg0 == -13968) {
            ++field9926;
        }
    }

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "(I)V", line = 62)
    public static void method3906(int arg0) {
        if (arg0 != 0) {
            field9931 = null;
        }
        field9931 = null;
        field9920 = null;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(Loa;B)V", line = 73)
    public final void method7(class650 arg0, byte arg1) {
        ++field9918;
        if (arg1 != 98) {
            this.field9914 = null;
        }
        class359 var3 = this.field9914.method891(262144, arg0, (byte) -92, super.field5591, true, super.field5596, true);
        if (var3 != null) {
            int var4 = super.field5596 >> 9;
            int var5 = super.field5591 >> 9;
            class396 var6 = arg0.method470();
            var6.method591(super.field5596, super.field5590, super.field5591);
            this.field9914.method896(var6, false, var4, var3, var4, arg0, (byte) -93, var5, var5);
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(Loa;I)Lqt;", line = 98)
    public final class595 method6(class650 arg0, int arg1) {
        if (arg1 != -7459) {
            return null;
        } else {
            ++field9932;
            return this.field9933;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I", line = 111)
    public final int method131(byte arg0) {
        ++field9927;
        if (arg0 != -97) {
            this.method133(true);
        }
        return this.field9914.field1727;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)I", line = 123)
    public final int method138(int arg0) {
        ++field9913;
        if (arg0 != 8470) {
            this.method137(-54);
        }
        return this.field9914.field1719;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Loa;B)V", line = 134)
    public final void method130(class650 arg0, byte arg1) {
        if (arg1 >= -27) {
            this.field9922 = true;
        }
        ++field9930;
        this.field9914.method890(arg0, 119);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)I", line = 150)
    public final int method139(byte arg0) {
        if (arg0 <= 13) {
            field9929 = 4;
        }
        ++field9923;
        return this.field9914.field1705;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLoa;Lnt;IIII)V", line = 161)
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 12137) {
            this.method132(-72);
        }
        ++field9915;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILoa;)Lww;", line = 176)
    public final class686 method11(int arg0, class650 arg1) {
        ++field9921;
        class359 var3 = this.field9914.method891(2048, arg1, (byte) -118, super.field5591, false, super.field5596, true);
        if (var3 == null) {
            return null;
        } else {
            class396 var4 = arg1.method470();
            var4.method591(super.field5596, super.field5590, super.field5591);
            if (arg0 >= -89) {
                this.method134((class650) null, (byte) -107, -14);
            }
            class686 var5 = null;
            if (this.field9922) {
                var5 = class458.method2520(0, 1);
            }
            int var6 = super.field5596 >> 9;
            int var7 = super.field5591 >> 9;
            this.field9914.method896(var4, true, var6, var3, var6, arg1, (byte) -93, var7, var7);
            if (this.field9914.field1722 == null) {
                var3.method2049(var4, var5 != null ? var5.field9361[0] : null, 0);
            } else {
                class228 var8 = this.field9914.field1722.method105();
                arg1.method427(var3, var8, var4, var5 != null ? var5.field9361[0] : null, 0);
            }
            if (this.field9933 != null) {
                class236.method1423(var3, false, super.field5591, super.field5590, this.field9933, super.field5596);
            } else {
                this.field9933 = class280.method1688(var3, super.field5591, -1, super.field5590, super.field5596);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Loa;I)V", line = 228)
    public final void method136(class650 arg0, int arg1) {
        this.field9914.method893(false, arg0);
        int var3 = 62 / ((arg1 - -78) / 37);
        ++field9916;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BILoa;I)Z", line = 240)
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        ++field9919;
        int var5 = -121 / ((77 - arg0) / 40);
        class359 var6 = this.field9914.method891(131072, arg2, (byte) 77, super.field5591, false, super.field5596, false);
        if (var6 == null) {
            return false;
        } else {
            class396 var7 = arg2.method470();
            var7.method591(super.field5596, super.field5590, super.field5591);
            return var6.method2074(arg3, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Loa;Lpg;IIIIIZII)V", line = 260)
    public class710(class650 arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field9454, arg1.field9435, arg1.field9464);
        this.field9914 = new class142(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field9922 = ~arg1.field9382 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)Z", line = 271)
    public final boolean method133(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field9911;
            return this.field9914.method899(-1);
        }
    }
}
