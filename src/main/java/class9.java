import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Lcs;")
    private class225 field106 = new class225();

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    private int field93;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lbj;")
    private class159 field84;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[Z")
    public static boolean[] field83 = new boolean[100];

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Z")
    public static boolean field86 = false;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[I")
    public static int[] field90 = new int[25];

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 3)
    public final Object method56(long arg0, int arg1) {
        field97++;
        class117 var4 = (class117) this.field84.method979((byte) 28, arg0);
        if (arg1 < 31) {
            field100 = -28;
        }
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method212(false);
        if (var5 == null) {
            var4.method2946(-99);
            var4.method581(4);
            this.field93 += var4.field1576;
            return null;
        }
        if (var4.method213(10535)) {
            class58 var6 = new class58(var5, var4.field1576);
            this.field84.method990(var4.field7342, (byte) 37, var6);
            this.field106.method1335(-571093627, var6);
            var6.field1140 = 0L;
            var4.method2946(-102);
            var4.method581(4);
        } else {
            this.field106.method1335(-571093627, var4);
            var4.field1140 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lvh;Lqa;Lvh;Z)V", line = 56)
    public static final void method57(class240 arg0, class162 arg1, class240 arg2, boolean arg3) {
        field105++;
        class483.field7097 = class456.method2689(0, (byte) -115, class316.field4390, arg0);
        class176.field2505 = arg1.method519(class483.field7097, class531.method3129(arg2, class316.field4390, 0), true);
        class68.field987 = class456.method2689(0, (byte) -47, class483.field7100, arg0);
        class117.field1579 = arg1.method519(class68.field987, class531.method3129(arg2, class483.field7100, 0), arg3);
        class105.field1430 = class456.method2689(0, (byte) -72, class171.field2448, arg0);
        class34.field487 = arg1.method519(class105.field1430, class531.method3129(arg2, class171.field2448, 0), true);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 70)
    public final Object method58(int arg0) {
        field101++;
        class117 var2 = (class117) this.field84.method981(arg0 + arg0);
        while (var2 != null) {
            Object var3 = var2.method212(false);
            if (var3 != null) {
                return var3;
            }
            class117 var4 = var2;
            var2 = (class117) this.field84.method989(arg0);
            var4.method2946(-127);
            var4.method581(arg0 ^ 0x4);
            this.field93 += var2.field1576;
        }
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILsq;)V", line = 106)
    private final void method59(int arg0, class117 arg1) {
        if (arg1 != null) {
            arg1.method2946(arg0 + 2040);
            arg1.method581(4);
            this.field93 += arg1.field1576;
        }
        if (arg0 != -2157) {
            field83 = null;
        }
        field102++;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 125)
    public final Object method60(int arg0) {
        if (arg0 != -7681) {
            this.field93 = 64;
        }
        field95++;
        class117 var2 = (class117) this.field84.method989(0);
        while (var2 != null) {
            Object var3 = var2.method212(false);
            if (var3 != null) {
                return var3;
            }
            class117 var4 = var2;
            var2 = (class117) this.field84.method989(0);
            var4.method2946(-110);
            var4.method581(4);
            this.field93 += var2.field1576;
        }
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V", line = 156)
    public final void method61(byte arg0, int arg1) {
        if (arg0 != -67) {
            this.method65(true);
        }
        if (class53.field708 != null) {
            for (class117 var3 = (class117) this.field106.method1328((byte) -52); var3 != null; var3 = (class117) this.field106.method1330(arg0 ^ 0xFFFFFF7D)) {
                if (var3.method213(10535)) {
                    if (var3.method212(false) == null) {
                        var3.method2946(-115);
                        var3.method581(4);
                        this.field93++;
                    }
                } else if (++var3.field1140 > (long) arg1) {
                    class117 var4 = class53.field708.method579(var3, (byte) -47);
                    this.field84.method990(var3.field7342, (byte) 82, var4);
                    class287.method1638(var3, var4, -6809);
                    var3.method2946(arg0 ^ 0x27);
                    var3.method581(4);
                }
            }
        }
        field85++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILqa;)V", line = 205)
    public static final void method62(int arg0, class162 arg1) {
        field99++;
        if (class171.field2445.method3064((byte) 15) == 0) {
            return;
        }
        if (class278.field3761 == 0) {
            for (class464 var4 = (class464) class171.field2445.method3072((byte) 64); var4 != null; var4 = (class464) class171.field2445.method3066(2)) {
                class75.field1097.method827(var4.field6739, false, var4.field6743, var4.field6738, var4.field6742, arg1, class176.field2505, false, var4.field6741, arg1, false, var4.field6744 ? class75.field1089.field2741 : null);
                var4.method2946(-121);
            }
            class242.method1428((byte) 88);
        } else {
            if (class174.field2490 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class174.field2490 = class162.method1004(arg0, class282.field3804, 0, var2, 0, class456.field6677);
                class501.field7361 = class174.field2490.method519(class456.method2689(0, (byte) -22, class316.field4390, class103.field1412), class531.method3129(class192.field2735, class316.field4390, 0), true);
            }
            for (class464 var3 = (class464) class171.field2445.method3072((byte) 21); var3 != null; var3 = (class464) class171.field2445.method3066(2)) {
                class75.field1097.method827(var3.field6739, false, var3.field6743, var3.field6738, var3.field6742, class174.field2490, class501.field7361, false, var3.field6741, arg1, false, var3.field6744 ? class75.field1089.field2741 : null);
                var3.method2946(-122);
            }
        }
        if (arg0 != 0) {
            field86 = false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JB)V", line = 258)
    private final void method63(long arg0, byte arg1) {
        field88++;
        if (arg1 < 106) {
            this.field84 = null;
        }
        class117 var4 = (class117) this.field84.method979((byte) 28, arg0);
        this.method59(-2157, var4);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIII)V", line = 280)
    public static final void method64(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 19) {
            field86 = false;
        }
        field103++;
        if (arg3 == 1004) {
            class475.method2790(class217.field3070, arg2, arg1);
        } else if (arg3 == 1001) {
            class475.method2790(class420.field6140, arg2, arg1);
        } else if (arg3 == 1007) {
            class475.method2790(class159.field2281, arg2, arg1);
        } else if (arg3 == 1006) {
            class475.method2790(class3.field39, arg2, arg1);
        } else if (arg3 == 1002) {
            class475.method2790(class347.field4756, arg2, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 311)
    public final void method65(boolean arg0) {
        field104++;
        if (arg0) {
            field86 = false;
        }
        for (class117 var2 = (class117) this.field106.method1328((byte) -64); var2 != null; var2 = (class117) this.field106.method1330(192)) {
            if (var2.method213(10535)) {
                var2.method2946(-127);
                var2.method581(4);
                this.field93 += var2.field1576;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Z", line = 340)
    public static final boolean method66(int arg0, int arg1, int arg2) {
        if (arg0 != -5595) {
            method57(null, null, null, true);
        }
        field108++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V", line = 351)
    public final void method67(int arg0) {
        field98++;
        this.field106.method1333(-94);
        int var2 = -15 / ((-arg0 - 32) / 61);
        this.field84.method992(-15728);
        this.field93 = this.field91;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJLjava/lang/Object;Z)V", line = 366)
    private final void method68(int arg0, long arg1, Object arg2, boolean arg3) {
        field94++;
        if (arg0 > this.field91) {
            throw new IllegalStateException("s>cs");
        }
        this.method63(arg1, (byte) 110);
        this.field93 -= arg0;
        while (this.field93 < 0) {
            class117 var7 = (class117) this.field106.method1334(112);
            this.method59(-2157, var7);
        }
        class58 var6 = new class58(arg2, arg0);
        this.field84.method990(arg1, (byte) 72, var6);
        this.field106.method1335(-571093627, var6);
        var6.field1140 = 0L;
        if (arg3) {
            this.field91 = -55;
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V", line = 397)
    public static void method69(int arg0) {
        field83 = null;
        field90 = null;
        if (arg0 != 0) {
            method62(26, null);
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)I", line = 408)
    public final int method70(int arg0) {
        if (arg0 == 0) {
            field107++;
            return this.field93;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)I", line = 421)
    public final int method71(int arg0) {
        if (arg0 == 0) {
            field92++;
            return this.field91;
        } else {
            return 96;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V", line = 469)
    public class9(int arg0) {
        this.field93 = arg0;
        this.field91 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field84 = new class159(var2);
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)I", line = 435)
    public final int method72(int arg0) {
        field96++;
        int var2 = 0;
        for (class117 var3 = (class117) this.field106.method1328((byte) -90); var3 != null; var3 = (class117) this.field106.method1330(192)) {
            if (!var3.method213(10535)) {
                var2++;
            }
        }
        if (arg0 <= 20) {
            this.field106 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 459)
    public final void method73(long arg0, Object arg1, int arg2) {
        if (arg2 != 26425) {
            this.method68(4, -124L, null, true);
        }
        field87++;
        this.method68(1, arg0, arg1, false);
    }
}
