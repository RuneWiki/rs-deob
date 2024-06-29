import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class493 extends class418 {

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Lnt;")
    private class220 field7017 = new class220();

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    private int field7028 = 0;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    private int field7029 = 256;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    private int field7035 = 256;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    private int field7023;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field7014 = -1;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    private int field7025;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "Z")
    private boolean field7026;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Z")
    private boolean field7033;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "[I")
    public static int[] field7032;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static void method2962(int arg0) {
        field7032 = null;
        if (arg0 != 1811643552) {
            field7032 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
    public final int method1673() {
        field7037++;
        return 1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lhga;")
    private final synchronized class172 method2963(boolean arg0) {
        if (arg0) {
            this.method1693();
        }
        field7036++;
        return (class172) this.field7017.method1522(true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
    public final synchronized void method1687(int[] arg0, int arg1, int arg2) {
        field7027++;
        if (this.field7026) {
            return;
        }
        if (this.method2963(false) != null) {
            int var4 = arg1 + arg2;
            if (class390.field5446) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field7023 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class172 var7 = this.method2963(false);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field2497;
                while (var4 > arg1 && var8[0].length > this.field7025) {
                    if (class390.field5446) {
                        arg0[arg1++] = var8[var5][this.field7025] * this.field7035;
                        arg0[arg1++] = var8[var6][this.field7025] * this.field7029;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field7025] * this.field7035 + var8[var6][this.field7025] * this.field7029;
                    }
                    this.field7025++;
                }
                if (this.field7025 >= var8[0].length) {
                    this.method2970(0);
                }
            }
        } else if (this.field7033) {
            this.method3617(1);
            class337.field4760.method3234(-26409);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()Lep;")
    public final class418 method1693() {
        field7015++;
        return null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public final synchronized void method2964(byte arg0) {
        this.field7033 = true;
        field7030++;
        if (arg0 > -77) {
            this.field7017 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public final synchronized void method1663(int arg0) {
        field7024++;
        if (this.field7026) {
            return;
        }
        while (true) {
            class172 var2 = this.method2963(false);
            if (var2 == null) {
                if (this.field7033) {
                    this.method3617(1);
                    class337.field4760.method3234(-26409);
                }
                return;
            }
            if (arg0 < var2.field2497[0].length - this.field7025) {
                this.field7025 += arg0;
                return;
            }
            arg0 -= var2.field2497[0].length - this.field7025;
            this.method2970(0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()Lep;")
    public final class418 method1696() {
        field7022++;
        return null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)V")
    public final synchronized void method2965(boolean arg0, int arg1) {
        if (arg1 < -12) {
            field7016++;
            this.field7026 = arg0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)V")
    public final void method2966(byte arg0, int arg1) {
        this.field7029 = arg1;
        field7034++;
        this.field7035 = arg1;
        if (arg0 != 22) {
            this.field7033 = false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)I")
    public final synchronized int method2967(byte arg0) {
        if (arg0 < 17) {
            return 19;
        } else {
            field7020++;
            return this.field7028;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)D")
    public final synchronized double method2968(int arg0) {
        field7031++;
        if (this.field7028 < 1) {
            return -1.0D;
        } else if (arg0 >= -108) {
            return 1.2172218235513175D;
        } else {
            class172 var2 = (class172) this.field7017.method1522(true);
            return var2 == null ? -1.0D : var2.field2496 - (double) ((float) var2.field2497[0].length / (float) class215.field3077);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lhga;I)V")
    public final synchronized void method2969(class172 arg0, int arg1) {
        field7019++;
        while (this.field7028 >= 100) {
            this.field7017.method1521(109);
            this.field7028--;
        }
        if (arg1 == 100) {
            this.field7017.method1526(arg0, 99);
            this.field7028++;
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
    private final synchronized void method2970(int arg0) {
        field7021++;
        class172 var2 = this.method2963(false);
        if (var2 != null) {
            var2.method3617(1);
            this.field7025 = arg0;
            this.field7028--;
            class337.field4760.method3237(var2.method1259(-761742816), var2, arg0 ^ 0x3F4D);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BID)Lhga;")
    public final class172 method2971(byte arg0, int arg1, double arg2) {
        field7018++;
        int var5 = 77 / ((arg0 - 25) / 51);
        long var6 = (long) (this.field7023 << 0 | arg1);
        class172 var8 = (class172) class337.field4760.method3236(var6, (byte) 107);
        if (var8 == null) {
            var8 = new class172(new short[this.field7023][arg1], arg2);
        } else {
            var8.field2496 = arg2;
            class337.field4760.method3235(false, var6);
        }
        return var8;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
    public class493(int arg0) {
        this.field7023 = arg0;
    }
}
