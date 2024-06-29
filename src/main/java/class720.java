import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class720 extends class97 {

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Lifa;")
    private class450 field10110 = new class450();

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    private int field10118 = 256;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    private int field10117 = 256;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    private int field10119 = 0;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    private int field10101;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field10100;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field10105;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field10107;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field10111;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field10115;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    private int field10121;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lnh;")
    public static class778 field10112;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Ljava/lang/Object;")
    public static Object field10113;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "Z")
    private boolean field10120;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Z")
    private boolean field10122;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "[Ltf;")
    public static class312[] field10114;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()Loia;")
    public final class97 method745() {
        field10111++;
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)I")
    public final synchronized int method4071(int arg0) {
        field10098++;
        return arg0 > -101 ? -104 : this.field10119;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()Loia;")
    public final class97 method763() {
        field10102++;
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
    public final void method4072(byte arg0, int arg1) {
        this.field10118 = arg1;
        field10096++;
        int var3 = 124 % ((arg0 - 57) / 60);
        this.field10117 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lkka;Z)V")
    public final synchronized void method4073(class329 arg0, boolean arg1) {
        while (this.field10119 >= 100) {
            this.field10110.method2730(-31260);
            this.field10119--;
        }
        field10115++;
        if (arg1) {
            method4074(110);
        }
        this.field10110.method2732(arg0, 21939);
        this.field10119++;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static final void method4074(int arg0) {
        int var1 = -122 / ((23 - arg0) / 58);
        field10097++;
        if (class616.field8286 == null) {
            return;
        }
        class658[] var2 = class616.field8286;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class658 var4 = var2[var3];
            var4.method285(4088);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public final synchronized void method751(int arg0) {
        field10099++;
        if (this.field10122) {
            return;
        }
        while (true) {
            class329 var2 = this.method4081((byte) -103);
            if (var2 == null) {
                if (this.field10120) {
                    this.method2219(13630);
                    class318.field3919.method902((byte) 93);
                }
                return;
            }
            if (arg0 < (var2.field4064[0].length - this.field10121)) {
                this.field10121 += arg0;
                return;
            }
            arg0 -= var2.field4064[0].length - this.field10121;
            this.method4076((byte) 54);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method4075(byte arg0) {
        int var1 = -68 % ((-arg0 - 17) / 62);
        field10112 = null;
        field10113 = null;
        field10114 = null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    private final synchronized void method4076(byte arg0) {
        field10106++;
        class329 var2 = this.method4081((byte) -103);
        if (var2 == null) {
            return;
        }
        var2.method2219(13630);
        if (arg0 == 54) {
            this.field10119--;
            this.field10121 = 0;
            class318.field3919.method897(var2.method1953(arg0 - 54), var2, false);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IDB)Lkka;")
    public final class329 method4077(int arg0, double arg1, byte arg2) {
        if (arg2 > -104) {
            return null;
        }
        field10108++;
        long var5 = (long) (arg0 | this.field10101 << 0);
        class329 var7 = (class329) class318.field3919.method901(var5, 115);
        if (var7 == null) {
            var7 = new class329(new short[this.field10101][arg0], arg1);
        } else {
            var7.field4070 = arg1;
            class318.field3919.method898(true, var5);
        }
        return var7;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
    public final synchronized void method760(int[] arg0, int arg1, int arg2) {
        field10116++;
        if (this.field10122) {
            return;
        }
        if (this.method4081((byte) -103) != null) {
            int var4 = arg1 + arg2;
            if (class270.field3189) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field10101 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class329 var7 = this.method4081((byte) -103);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field4064;
                while (arg1 < var4 && var8[0].length > this.field10121) {
                    if (class270.field3189) {
                        arg0[arg1++] = var8[var5][this.field10121] * this.field10118;
                        arg0[arg1++] = var8[var6][this.field10121] * this.field10117;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field10121] * this.field10118 + var8[var6][this.field10121] * this.field10117;
                    }
                    this.field10121++;
                }
                if (var8[0].length <= this.field10121) {
                    this.method4076((byte) 54);
                }
            }
        } else if (this.field10120) {
            this.method2219(13630);
            class318.field3919.method902((byte) 20);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
    public final int method752() {
        field10104++;
        return 1;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)D")
    public final synchronized double method4078(int arg0) {
        field10107++;
        int var2 = 94 / ((90 - arg0) / 36);
        if (this.field10119 < 1) {
            return -1.0D;
        } else {
            class329 var3 = (class329) this.field10110.method2725(37);
            return var3 == null ? -1.0D : var3.field4070 - (double) ((float) var3.field4064[0].length / (float) class478.field6632);
        }
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
    public final synchronized void method4079(int arg0) {
        if (arg0 > -65) {
            this.field10117 = -126;
        }
        this.field10120 = true;
        field10100++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
    public final synchronized void method4080(int arg0, boolean arg1) {
        field10103++;
        this.field10122 = arg1;
        if (arg0 != -1) {
            this.field10120 = true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)Lkka;")
    private final synchronized class329 method4081(byte arg0) {
        field10109++;
        return arg0 == -103 ? (class329) this.field10110.method2725(37) : null;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
    public class720(int arg0) {
        this.field10101 = arg0;
    }
}
