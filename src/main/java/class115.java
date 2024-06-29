import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 implements class26 {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lrc;")
    private class121 field2581 = new class121();

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    private int field2593 = 128;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "D")
    private double field2596 = 1.0D;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    private int field2595 = 0;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Lsf;")
    private class131 field2602;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[Ldf;")
    private class28[] field2587;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lsc;")
    private static class128 field2588 = class129.method1017(false, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lsc;")
    public static class128 field2578 = class129.method1017(false, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lsc;")
    public static class128 field2580 = class129.method1017(false, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lsc;")
    private static class128 field2589 = class129.method1017(false, "Click to switch");

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Lsc;")
    public static class128 field2594 = field2588;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lsc;")
    public static class128 field2575 = field2589;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lrb;")
    public static class120 field2582 = new class120(64);

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "Lsc;")
    private static class128 field2599 = class129.method1017(false, "Players");

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "Lsc;")
    public static class128 field2601 = field2599;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Lhe;")
    public static class54 field2603;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Li;")
    public static class56 field2600;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Li;")
    public static class56 field2604;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field2577;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[I")
    public static int[] field2590;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[Lb;")
    public static class8[] field2585;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[I")
    public final int[] method226(int arg0, int arg1) {
        field2584++;
        class28 var3 = this.field2587[arg0];
        if (var3 != null) {
            if (var3.field539 != null) {
                this.field2581.method927(var3, true);
                var3.field541 = true;
                return var3.field539;
            }
            boolean var4 = var3.method234(this.field2596, this.field2593, this.field2602);
            if (var4) {
                if (this.field2595 == 0) {
                    class28 var5 = (class28) this.field2581.method930((byte) -59);
                    var5.method232();
                } else {
                    this.field2595--;
                }
                this.field2581.method927(var3, true);
                var3.field541 = true;
                return var3.field539;
            }
        }
        return arg1 == 19570 ? null : null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method887(int arg0) {
        field2585 = null;
        field2589 = null;
        field2594 = null;
        field2588 = null;
        field2575 = null;
        field2580 = null;
        field2582 = null;
        field2577 = null;
        field2578 = null;
        field2601 = null;
        field2599 = null;
        field2600 = null;
        field2590 = null;
        if (arg0 != 0) {
            method892(true, -43);
        }
        field2604 = null;
        field2603 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lha;B)V")
    public static final void method888(class50 arg0, byte arg1) {
        field2586++;
        int var2 = arg0.field949 - class29.field554;
        arg0.field995 = 0;
        int var3 = arg0.field971 * 128 + arg0.field960 * 64;
        if (arg1 != -86) {
            method888(null, (byte) -95);
        }
        if (arg0.field988 == 0) {
            arg0.field985 = 1024;
        }
        if (arg0.field988 == 1) {
            arg0.field985 = 1536;
        }
        if (arg0.field988 == 2) {
            arg0.field985 = 0;
        }
        if (arg0.field988 == 3) {
            arg0.field985 = 512;
        }
        arg0.field975 += (var3 - arg0.field975) / var2;
        int var4 = arg0.field969 * 128 + arg0.field960 * 64;
        arg0.field987 += (var4 - arg0.field987) / var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Z")
    public final boolean method227(int arg0, byte arg1) {
        if (arg1 > -50) {
            return true;
        } else {
            field2583++;
            return this.field2593 == 64;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
    public final void method889(int arg0, int arg1) {
        if (arg1 > -48) {
            return;
        }
        field2574++;
        for (int var3 = 0; var3 < this.field2587.length; var3++) {
            class28 var4 = this.field2587[var3];
            if (var4 != null && var4.field544 != 0 && var4.field541) {
                var4.method233(arg0);
                var4.field541 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public final void method890(int arg0) {
        field2576++;
        int var2 = 0;
        int var3 = -64 % (-arg0 / 46);
        while (this.field2587.length > var2) {
            if (this.field2587[var2] != null) {
                this.field2587[var2].method232();
            }
            var2++;
        }
        this.field2581 = new class121();
        this.field2595 = this.field2597;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(DB)V")
    public final void method891(double arg0, byte arg1) {
        int var4 = -50 / ((arg1 - 20) / 49);
        this.field2596 = arg0;
        field2573++;
        this.method890(-109);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)I")
    public final int method228(boolean arg0, int arg1) {
        field2592++;
        if (arg0) {
            field2582 = null;
        }
        return this.field2587[arg1] == null ? 0 : this.field2587[arg1].field536;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Z")
    public final boolean method229(int arg0, int arg1) {
        field2591++;
        if (arg0 > -28) {
            this.field2602 = null;
        }
        return this.field2587[arg1].field543;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(ZI)Z")
    public static final boolean method892(boolean arg0, int arg1) {
        if (arg0) {
            field2598++;
            return (arg1 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lsf;Lsf;IDI)V")
    public class115(class131 arg0, class131 arg1, int arg2, double arg3, int arg4) {
        this.field2593 = arg4;
        this.field2602 = arg1;
        this.field2597 = arg2;
        this.field2596 = arg3;
        this.field2595 = this.field2597;
        int[] var7 = arg0.method1043(0, -76);
        int var8 = var7.length;
        this.field2587 = new class28[arg0.method1022(85, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class86 var10 = new class86(arg0.method1023(var7[var9], 0, (byte) -35));
            this.field2587[var7[var9]] = new class28(var10);
        }
    }
}
