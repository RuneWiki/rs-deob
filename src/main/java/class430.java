import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class430 extends class98 {

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lga;")
    private class420 field6114 = new class420();

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    private int field6133 = 256;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    private int field6134 = 256;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    private int field6139 = 0;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    private int field6121;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field6113 = 0;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field6131 = 1;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "Lga;")
    public static class420 field6138 = new class420();

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    private int field6140;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "Z")
    private boolean field6132;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "Z")
    private boolean field6137;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()Leha;")
    public final class98 method687() {
        field6127++;
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public final synchronized void method686(int arg0) {
        field6130++;
        if (this.field6132) {
            return;
        }
        while (true) {
            class646 var2 = this.method2585(5781);
            if (var2 == null) {
                if (this.field6137) {
                    this.method3117((byte) -2);
                    class144.field1842.method217(true);
                }
                return;
            }
            if (arg0 < (var2.field9105[0].length - this.field6140)) {
                this.field6140 += arg0;
                return;
            }
            arg0 -= var2.field9105[0].length - this.field6140;
            this.method2581(127);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lof;Z)V")
    public final synchronized void method2580(class646 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        while (this.field6139 >= 100) {
            this.field6114.method2507(-86);
            this.field6139--;
        }
        field6129++;
        this.field6114.method2510(arg0, false);
        this.field6139++;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    private final synchronized void method2581(int arg0) {
        field6128++;
        if (arg0 < 115) {
            return;
        }
        class646 var2 = this.method2585(5781);
        if (var2 != null) {
            var2.method3117((byte) 60);
            this.field6139--;
            this.field6140 = 0;
            class144.field1842.method221(var2, false, var2.method3694((byte) -124));
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([III)V")
    public final synchronized void method689(int[] arg0, int arg1, int arg2) {
        field6120++;
        if (this.field6132) {
            return;
        }
        if (this.method2585(5781) != null) {
            int var4 = arg1 + arg2;
            if (class488.field6909) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field6121 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class646 var7 = this.method2585(5781);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field9105;
                while (arg1 < var4 && this.field6140 < var8[0].length) {
                    if (class488.field6909) {
                        arg0[arg1++] = var8[var5][this.field6140] * this.field6133;
                        arg0[arg1++] = var8[var6][this.field6140] * this.field6134;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field6140] * this.field6133 + var8[var6][this.field6140] * this.field6134;
                    }
                    this.field6140++;
                }
                if (var8[0].length <= this.field6140) {
                    this.method2581(123);
                }
            }
        } else if (this.field6137) {
            this.method3117((byte) -1);
            class144.field1842.method217(true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IDZ)Lof;")
    public final class646 method2582(int arg0, double arg1, boolean arg2) {
        field6119++;
        long var5 = (long) (arg0 | this.field6121 << 0);
        class646 var7 = (class646) class144.field1842.method220(var5, 0);
        if (var7 == null) {
            var7 = new class646(new short[this.field6121][arg0], arg1);
        } else {
            var7.field9102 = arg1;
            class144.field1842.method218((byte) 65, var5);
        }
        return arg2 ? var7 : null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()Leha;")
    public final class98 method688() {
        field6117++;
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()I")
    public final int method691() {
        field6126++;
        return 1;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)D")
    public final synchronized double method2583(int arg0) {
        if (arg0 != 20) {
            return -0.6953223301455745D;
        }
        field6116++;
        if (this.field6139 < 1) {
            return -1.0D;
        } else {
            class646 var2 = (class646) this.field6114.method2508((byte) 117);
            return var2 == null ? -1.0D : (double) (-((float) var2.field9105[0].length / (float) class110.field1367)) + var2.field9102;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILd;IILha;)V")
    public static final void method2584(int arg0, int arg1, int arg2, class159 arg3, int arg4, int arg5, class66 arg6) {
        field6123++;
        if (class261.field3682 < 100) {
            class786.method4307(arg6, arg3, (byte) 116);
        }
        arg6.method455(arg0, arg2, arg0 + arg5, arg2 + arg4);
        if (class261.field3682 < 100) {
            byte var7 = 20;
            int var8 = arg5 / 2 + arg0;
            arg6.method474(arg0, arg2, arg5, arg4, -16777216, 0);
            int var9 = arg4 / 2 + arg2 - var7 - 18;
            arg6.method457(var8 - 152, var9, 304, 34, class120.field1527[class108.field1311].getRGB(), 0);
            arg6.method474(var8 - 150, var9 + 2, class261.field3682 * 3, 30, class185.field2786[class108.field1311].getRGB(), 0);
            class546.field7704.method523(class358.field5206[class108.field1311].getRGB(), var8, class674.field9569.method3825((byte) -10, class526.field7494), var7 + var9, true, -1);
            return;
        }
        int var10 = class459.field6580 - ((int) ((float) arg5 / class436.field6216));
        if (arg1 <= 77) {
            field6113 = -88;
        }
        int var11 = class450.field6465 + ((int) ((float) arg4 / class436.field6216));
        int var12 = (int) ((float) arg5 / class436.field6216) + class459.field6580;
        class259.field3646 = class450.field6465 - (int) ((float) arg4 / class436.field6216);
        class360.field5233 = (int) ((float) (arg4 * 2) / class436.field6216);
        class656.field9251 = class459.field6580 - ((int) ((float) arg5 / class436.field6216));
        class779.field10741 = (int) ((float) (arg5 * 2) / class436.field6216);
        int var13 = class450.field6465 - ((int) ((float) arg4 / class436.field6216));
        class436.method2625(class436.field6239 + var10, class436.field6233 + var11, class436.field6239 + var12, class436.field6233 + var13, arg0, arg2, arg0 + arg5, arg2 + arg4 - -1);
        class436.method2620(arg6);
        class420 var14 = class436.method2621(arg6);
        class423.method2524(0, 0, arg6, (byte) -84, var14);
        if (class22.field334 > 0) {
            class668.field9392--;
            if (class668.field9392 == 0) {
                class668.field9392 = 20;
                class22.field334--;
            }
        }
        if (!class558.field7931) {
            return;
        }
        int var15 = arg0 + arg5 - 5;
        int var16 = arg2 + arg4 - 8;
        class564.field8008.method527("Fps:" + class100.field1260, -1, 16776960, var16, 101, var15);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class564.field8008.method527("Mem:" + var18 + "k", -1, var19, var20, 110, var15);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)Lof;")
    private final synchronized class646 method2585(int arg0) {
        field6118++;
        if (arg0 != 5781) {
            method2584(-89, 39, -15, null, -121, -50, null);
        }
        return (class646) this.field6114.method2508((byte) -90);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static void method2586(boolean arg0) {
        if (!arg0) {
            method2590(-74, -73);
        }
        field6138 = null;
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)I")
    public final synchronized int method2587(int arg0) {
        if (arg0 < 85) {
            return -20;
        } else {
            field6115++;
            return this.field6139;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
    public final synchronized void method2588(boolean arg0, int arg1) {
        field6125++;
        this.field6132 = arg0;
        if (arg1 != 0) {
            this.field6133 = -109;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public final synchronized void method2589(byte arg0) {
        field6135++;
        if (arg0 <= -18) {
            this.field6137 = true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    public static final void method2590(int arg0, int arg1) {
        field6124++;
        class678 var2 = class630.method3597(29636, arg1, (long) arg0);
        var2.method3836((byte) -38);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)Z")
    public static final boolean method2591(boolean arg0) {
        if (!arg0) {
            method2584(-68, 43, -85, null, 123, 37, null);
        }
        field6122++;
        return class420.field5909 != 0;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
    public final void method2592(int arg0, int arg1) {
        this.field6133 = arg0;
        if (arg1 == -12484) {
            this.field6134 = arg0;
            field6136++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
    public class430(int arg0) {
        this.field6121 = arg0;
    }
}
