import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class386 extends class20 {

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    private int field4944;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    private int field4940;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    private int field4950;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    private int field4955;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    private int field4953;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    private int field4941;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    private int field4945;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    private int field4943;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "Luh;")
    public static class141 field4956 = new class141();

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "[[B")
    public static byte[][] field4957 = new byte[250][];

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "[I")
    public static int[] field4958;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ltc;Z)V", line = 9)
    public static final void method2199(class477 arg0, boolean arg1) {
        ++field4949;
        if (~class689.field9423 == ~arg0.field6362) {
            class53.field719[arg0.field6351] = true;
        }
        if (arg1) {
            method2202(1, 27);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILoa;)V", line = 25)
    public static final void method2200(int arg0, class43 arg1) {
        class550.field7145 = new class435[class220.field2886.length];
        ++field4954;
        if (arg0 >= -55) {
            method2201((byte) 38, (class89) null);
        }
        for (int var2 = 0; class220.field2886.length > var2; ++var2) {
            int var3 = class220.field2886[var2];
            class547 var4 = class155.method1116(class169.field2101, true, var3);
            class597 var5 = arg1.method405(var4, class506.method2737(class284.field3695, var3), true);
            class550.field7145[var2] = new class435(var5, var4);
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 54)
    public class386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4944 = arg4;
        this.field4940 = arg7;
        this.field4950 = arg0;
        this.field4955 = arg1;
        this.field4953 = arg5;
        this.field4941 = arg6;
        this.field4945 = arg2;
        this.field4943 = arg3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLpw;)I", line = 70)
    public static final int method2201(byte arg0, class89 arg1) {
        ++field4946;
        if (arg0 <= 119) {
            field4957 = null;
        }
        if (class82.field1117 != arg1) {
            if (class135.field1774 != arg1) {
                if (class228.field3042 == arg1) {
                    return 6406;
                } else if (class368.field4744 != arg1) {
                    if (class395.field5023 != arg1) {
                        if (class282.field3675 == arg1) {
                            return 6145;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        return 6410;
                    }
                } else {
                    return 6409;
                }
            } else {
                return 6408;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Z", line = 105)
    public static final boolean method2202(int arg0, int arg1) {
        ++field4947;
        if (arg0 >= -43) {
            field4956 = null;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(III)V", line = 119)
    public final void method114(int arg0, int arg1, int arg2) {
        ++field4951;
        if (arg0 > -28) {
            method2201((byte) 87, (class89) null);
        }
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(III)Ltc;", line = 131)
    public static final class477 method2203(int arg0, int arg1, int arg2) {
        ++field4952;
        class477 var3 = class600.method3268(112, arg0);
        if (~arg2 == arg1) {
            return var3;
        } else {
            return var3 != null && var3.field6258 != null && arg2 < var3.field6258.length ? var3.field6258[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)V", line = 149)
    public final void method111(int arg0, int arg1, int arg2) {
        ++field4948;
        int var4 = this.field4950 * arg1 >> 12;
        int var5 = this.field4955 * arg0 >> 12;
        int var6 = this.field4945 * arg1 >> 12;
        int var7 = this.field4943 * arg0 >> 12;
        int var8 = this.field4944 * arg1 >> 12;
        int var9 = this.field4953 * arg0 >> 12;
        int var10 = this.field4941 * arg1 >> 12;
        if (arg2 == 52) {
            int var11 = this.field4940 * arg0 >> 12;
            class493.method2693(123, var6, var10, var4, var8, var9, var5, var11, var7, super.field222);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 177)
    public static void method2204(int arg0) {
        field4956 = null;
        if (arg0 == 5178) {
            field4958 = null;
            field4957 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(III)V", line = 194)
    public final void method115(int arg0, int arg1, int arg2) {
        ++field4942;
        if (arg0 < 123) {
            this.method114(72, -49, 36);
        }
    }
}
