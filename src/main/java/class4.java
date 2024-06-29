import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class4 extends class422 implements class438 {

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Loh;")
    public class443 field53;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Z")
    private boolean field61;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Lvq;")
    public static class24 field58 = new class24(71, 7);

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field68 = -1;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "[I")
    public static int[] field69 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lct;")
    public static class104 field67;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(ILfp;)V", line = 6)
    public final void method14(int arg0, class9 arg1) {
        ++field64;
        class143 var3 = this.field53.method2718(true, super.field6098, true, super.field6099, arg1, 131072, false);
        if (var3 != null) {
            this.field53.method2720(super.field6099 >> 7, (byte) 122, super.field6099 >> 7, super.field6098 >> 7, false, arg1, var3, super.field6098 >> 7);
        }
        if (arg0 != -7561) {
            field66 = 43;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I", line = 24)
    public final int method6(int arg0) {
        ++field56;
        if (arg0 != -20839) {
            this.method10((class9) null, false);
        }
        return this.field53.field6462;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lfp;II)Lbi;", line = 35)
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        ++field63;
        if (arg2 != -23109) {
            field68 = 94;
        }
        return this.field53.method2718(false, 0, false, 0, arg0, arg1, false);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lfp;III)Z", line = 51)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -754) {
            this.method33(-46);
        }
        ++field49;
        class143 var5 = this.field53.method2718(false, super.field6098, false, super.field6099, arg0, 65536, false);
        if (var5 == null) {
            return false;
        } else {
            class187 var6 = arg0.method145();
            var6.method831(super.field6098, super.field6100, super.field6099);
            return var5.method988(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 75)
    public static void method31(int arg0) {
        field67 = null;
        field58 = null;
        if (arg0 != 2) {
            method31(37);
        }
        field69 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I", line = 87)
    public final int method9(byte arg0) {
        if (arg0 <= 102) {
            this.method9((byte) 120);
        }
        ++field54;
        return this.field53.field6453;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lfp;Lje;ZIIII)V", line = 99)
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field52;
        if (arg5 > -31) {
            field69 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I", line = 110)
    public final int method1(int arg0) {
        if (arg0 > -72) {
            return -75;
        } else {
            ++field57;
            return this.field53.field6465;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 121)
    public final void method33(int arg0) {
        if (arg0 > 109) {
            ++field62;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILfp;)Luq;", line = 132)
    public final class241 method2(int arg0, class9 arg1) {
        ++field60;
        class143 var3 = this.field53.method2718(false, super.field6098, true, super.field6099, arg1, 1024, false);
        if (var3 == null) {
            return null;
        } else {
            class187 var4 = arg1.method145();
            if (arg0 > -125) {
                field58 = null;
            }
            var4.method831(super.field6098, super.field6100, super.field6099);
            class241 var5 = null;
            if (this.field61) {
                var5 = class395.method2485(-29083, 1);
            }
            if (this.field53.field6437 != null) {
                class400 var6 = this.field53.field6437.method2076();
                arg1.method166(var3, var6, var4, var5 == null ? null : var5.field3578[0], 0);
            } else {
                var3.method947(var4, var5 != null ? var5.field3578[0] : null, 0);
            }
            this.field53.method2720(super.field6099 >> 7, (byte) 80, super.field6099 >> 7, super.field6098 >> 7, true, arg1, var3, super.field6098 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lfp;Lgn;IIIIIIIZI)V", line = 169)
    public class4(class9 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class358.method2279(arg3, arg2, 127));
        this.field53 = new class443(arg0, arg1, arg2, arg3, arg4, arg5, super.field6098, super.field6099, arg9, arg10);
        this.field61 = arg1.field2479 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)Z", line = 179)
    public final boolean method34(byte arg0) {
        ++field65;
        int var2 = -32 / ((-19 - arg0) / 44);
        return false;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(B)V", line = 190)
    public static final void method35(byte arg0) {
        ++field47;
        if (!class106.field1427) {
            int var1 = -3 % ((-29 - arg0) / 50);
            if (!class400.field5790) {
                class164.field2166 += (-class164.field2166 + 24.0F) / 2.0F;
            } else {
                class1.field19 = (float) ((int) class1.field19 - -191 & -128);
            }
            class373.field5455 = true;
            class106.field1427 = true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(B)V", line = 213)
    public static final void method36(byte arg0) {
        ++field50;
        if (!class242.field3594) {
            class373.field5455 = true;
            class242.field3594 = true;
            if (arg0 == 65) {
                if (!class400.field5790) {
                    class299.field4361 += (-class299.field4361 + -12.0F) / 2.0F;
                } else {
                    class170.field2220 = (float) (-16 & (int) class170.field2220 + -17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 240)
    public final void method4(int arg0) {
        if (arg0 != -27030) {
            this.field53 = null;
        }
        ++field55;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lfp;Z)V", line = 251)
    public final void method10(class9 arg0, boolean arg1) {
        this.field53.method2726(18143, arg0);
        if (arg1) {
            this.method5((class9) null, 93, 116, 21);
        }
        ++field48;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Z", line = 266)
    public final boolean method15(boolean arg0) {
        ++field59;
        if (!arg0) {
            field58 = null;
        }
        return this.field53.method2729(65);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lfp;I)V", line = 281)
    public final void method7(class9 arg0, int arg1) {
        if (arg1 <= 98) {
            field58 = null;
        }
        this.field53.method2724(arg0, 96);
        ++field51;
    }
}
