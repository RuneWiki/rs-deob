import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class25 {

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "Z")
    public boolean field450 = false;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "Z")
    public boolean field457 = false;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public int field454 = -1;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public int field452 = 1;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
    public int field455 = 2;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    public int field465 = 64;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public int field460 = 64;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "Lhg;")
    public static class693 field464 = new class693(37, 1);

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZI)V", line = 7)
    public static final void method169(boolean arg0, int arg1) {
        field459++;
        if (class14.field273 == null) {
            class97.method780(false);
        }
        if (arg1 != 2) {
            method173(-58, 41, null);
        }
        if (arg0) {
            class14.field273.method1090(100);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIII)Z", line = 25)
    public static final boolean method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field456++;
        if (arg0 > -119) {
            method177(-5, (byte) 18, 71);
        }
        int var7 = arg3 + arg6;
        int var8 = arg1 + arg5;
        int var9 = arg2 + arg4;
        if (!class116.method907(var7, var9, var8, arg3, arg3, var9, var8, arg2, (byte) 42, var8)) {
            return false;
        } else if (class116.method907(var7, var9, var8, arg3, var7, arg2, var8, arg2, (byte) 60, var8)) {
            if (arg3 < class358.field4625) {
                if (!class116.method907(arg3, var9, var8, arg3, arg3, arg2, var8, var9, (byte) 53, arg1)) {
                    return false;
                }
                if (!class116.method907(arg3, arg2, arg1, arg3, arg3, arg2, var8, var9, (byte) 84, arg1)) {
                    return false;
                }
            } else if (!class116.method907(var7, var9, var8, var7, var7, arg2, var8, var9, (byte) 127, arg1)) {
                return false;
            } else if (!class116.method907(var7, arg2, arg1, var7, var7, arg2, var8, var9, (byte) 116, arg1)) {
                return false;
            }
            if (class305.field4002 > arg2) {
                if (!class116.method907(var7, arg2, var8, arg3, arg3, arg2, var8, arg2, (byte) 69, arg1)) {
                    return false;
                }
                if (!class116.method907(var7, arg2, arg1, arg3, var7, arg2, var8, arg2, (byte) 65, arg1)) {
                    return false;
                }
            } else if (!class116.method907(var7, var9, var8, arg3, arg3, var9, var8, var9, (byte) 36, arg1)) {
                return false;
            } else if (!class116.method907(var7, var9, arg1, arg3, var7, var9, var8, var9, (byte) 53, arg1)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILsl;I)V", line = 96)
    public final void method171(int arg0, class461 arg1, int arg2) {
        field451++;
        if (arg0 > -115) {
            method169(false, -58);
        }
        while (true) {
            int var4 = arg1.method2600((byte) -123);
            if (var4 == 0) {
                return;
            }
            this.method174(var4, arg2, -16444, arg1);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lsl;I)Lie;", line = 118)
    public static final class6 method172(class461 arg0, int arg1) {
        field462++;
        if (arg1 != -982) {
            field464 = null;
        }
        int var2 = arg0.method2622(-539564808);
        return new class6(var2);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILjava/lang/String;)V", line = 131)
    public static final void method173(int arg0, int arg1, String arg2) {
        field458++;
        class89.field1236++;
        if (arg0 > -127) {
            return;
        }
        class589 var3 = class514.method2994(-29488, class760.field10605, class249.field3202);
        var3.field8251.method2578(class747.method4155(-1, arg2) + 1, -1221492240);
        var3.field8251.method2597(arg2, (byte) 92);
        var3.field8251.method2572(arg1, (byte) 122);
        class737.method4107(var3, 7);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIILsl;)V", line = 150)
    private final void method174(int arg0, int arg1, int arg2, class461 arg3) {
        if (arg0 == 1) {
            this.field454 = arg3.method2566(-2);
            if (this.field454 == 65535) {
                this.field454 = -1;
            }
        } else if (arg0 == 2) {
            this.field460 = arg3.method2566(-2) + 1;
            this.field465 = arg3.method2566(-2) + 1;
        } else if (arg0 == 3) {
            arg3.method2601(arg2 + 16444);
        } else if (arg0 == 4) {
            this.field455 = arg3.method2600((byte) -123);
        } else if (arg0 == 5) {
            this.field452 = arg3.method2600((byte) -124);
        } else if (arg0 == 6) {
            this.field450 = true;
        } else if (arg0 == 7) {
            this.field457 = true;
        }
        field461++;
        if (arg2 != -16444) {
            this.field452 = 71;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V", line = 204)
    public static void method175(byte arg0) {
        field464 = null;
        if (arg0 < 97) {
            method172(null, -23);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V", line = 215)
    public static final void method176(int arg0) {
        class136.field1949++;
        field453++;
        class589 var1 = class514.method2994(arg0 ^ 0xFFFF8CD3, class760.field10605, class746.field10404);
        var1.field8251.method2620(class332.field4238, false);
        class737.method4107(var1, 7);
        if (arg0 != 3) {
            field464 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBI)V", line = 244)
    public static final void method177(int arg0, byte arg1, int arg2) {
        field463++;
        class37 var3 = class636.method3571(7, arg2, -70);
        var3.method232(-3);
        if (arg1 >= 108) {
            var3.field579 = arg0;
        }
    }
}
