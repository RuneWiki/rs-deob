import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class452 extends class142 implements class289 {

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "Lkd;")
    public class156 field6172;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "Z")
    private boolean field6164;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "Lnj;")
    public static class436 field6159 = new class436(32);

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "Ljj;")
    public static class398 field6175 = new class398(61, 4);

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "Lvg;")
    private class162 field6169;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(BLoa;)V")
    public final void method123(byte arg0, class689 arg1) {
        ++field6166;
        if (arg0 <= 91) {
            this.method134((byte) -30, (class689) null);
        }
        class629 var3 = this.field6172.method1039(true, 262144, super.field1805, super.field1803, 0, arg1, true);
        if (var3 != null) {
            int var4 = super.field1805 >> 9;
            int var5 = super.field1803 >> 9;
            class111 var6 = arg1.method1972();
            var6.method609(super.field1805, super.field1804, super.field1803);
            this.field6172.method1040(arg1, var6, var4, var5, var3, var4, var5, (byte) -122, false);
        }
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(B)V")
    public static void method2572(byte arg0) {
        field6159 = null;
        field6175 = null;
        int var1 = -120 / ((arg0 - -25) / 52);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(Z)V")
    public final void method132(boolean arg0) {
        if (arg0) {
            ++field6173;
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)I")
    public final int method130(int arg0) {
        ++field6158;
        if (arg0 != -5582) {
            this.method134((byte) -109, (class689) null);
        }
        return this.field6172.field1960;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loa;B)Llt;")
    public final class95 method136(class689 arg0, byte arg1) {
        ++field6171;
        class629 var3 = this.field6172.method1039(true, 2048, super.field1805, super.field1803, 0, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 > -47) {
                this.method133((class631) null, -43, (class689) null, -63, 73, 44, true);
            }
            class111 var4 = arg0.method1972();
            var4.method609(super.field1805, super.field1804, super.field1803);
            class95 var5 = null;
            if (this.field6164) {
                var5 = class429.method2472(1, (byte) -87);
            }
            int var6 = super.field1805 >> 9;
            int var7 = super.field1803 >> 9;
            this.field6172.method1040(arg0, var4, var6, var7, var3, var6, var7, (byte) -82, true);
            if (this.field6172.field1943 == null) {
                var3.method665(var4, var5 == null ? null : var5.field1175[0], 0);
            } else {
                class309 var8 = this.field6172.field1943.method721();
                arg0.method1892(var3, var8, var4, var5 == null ? null : var5.field1175[0], 0);
            }
            if (this.field6169 == null) {
                this.field6169 = class440.method2525(255, var3, super.field1805, super.field1804, super.field1803);
            } else {
                class611.method3365(super.field1804, -75, super.field1805, var3, this.field6169, super.field1803);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)I")
    public final int method128(byte arg0) {
        ++field6170;
        if (arg0 <= 35) {
            method2572((byte) 85);
        }
        return this.field6172.field1952;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIILoa;)Z")
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        ++field6161;
        class629 var5 = this.field6172.method1039(false, 131072, super.field1805, super.field1803, 0, arg3, false);
        if (var5 == null) {
            return false;
        } else {
            class111 var6 = arg3.method1972();
            var6.method609(super.field1805, super.field1804, super.field1803);
            if (arg2 < 117) {
                this.method126(81);
            }
            return var5.method695(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BLoa;)Lvg;")
    public final class162 method134(byte arg0, class689 arg1) {
        if (arg0 <= 121) {
            return null;
        } else {
            ++field6165;
            return this.field6169;
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(ILoa;)V")
    public final void method129(int arg0, class689 arg1) {
        ++field6174;
        if (arg0 != 27921) {
            field6175 = null;
        }
        this.field6172.method1041((byte) -101, arg1);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V")
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field6162;
        if (arg4 != -8763) {
            this.method123((byte) 48, (class689) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)I")
    public static final int method2573(int arg0) {
        ++field6160;
        if (class376.field5407 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                field6175 = null;
            }
            return class376.field5407.length * 2;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)Z")
    public final boolean method122(boolean arg0) {
        if (arg0) {
            field6175 = null;
        }
        ++field6167;
        return this.field6172.method1042(96);
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Loa;Luca;IIIIIZIII)V")
    public class452(class689 arg0, class252 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class96.method529(arg8, 11330, arg9));
        this.field6172 = new class156(arg0, arg1, arg8, arg9, arg2, arg3, super.field1805, super.field1803, arg7, arg10);
        this.field6164 = arg1.field3453 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILoa;)V")
    public final void method131(int arg0, class689 arg1) {
        if (arg0 != -20929) {
            this.method124(69, 81, (class689) null);
        }
        ++field6163;
        this.field6172.method1037(124, arg1);
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (arg0 < 118) {
            this.field6164 = true;
        }
        ++field6168;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
    public final int method126(int arg0) {
        ++field6155;
        if (arg0 != 20377) {
            this.method124(-51, 41, (class689) null);
        }
        return this.field6172.field1961;
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)Z")
    public final boolean method135(int arg0) {
        ++field6157;
        if (arg0 != 0) {
            this.field6169 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILoa;)Lba;")
    public final class629 method124(int arg0, int arg1, class689 arg2) {
        ++field6156;
        if (arg1 != 17925) {
            this.method133((class631) null, 58, (class689) null, 103, 56, 54, true);
        }
        return this.field6172.method1039(false, arg0, 0, 0, 0, arg2, false);
    }
}
