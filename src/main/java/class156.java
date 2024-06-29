import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class156 extends class504 {

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!cfa", name = "o", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!cfa", name = "q", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!cfa", name = "s", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!cfa", name = "t", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!cfa", name = "u", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!cfa", name = "v", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!cfa", name = "x", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!cfa", name = "y", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!cfa", name = "A", descriptor = "I")
    public int field2474;

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!cfa", name = "w", descriptor = "Lhh;")
    public static class118 field2470;

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "Lgw;")
    public class158 field2476;

    @OriginalMember(owner = "client!cfa", name = "p", descriptor = "Lec;")
    public class218 field2463;

    @OriginalMember(owner = "client!cfa", name = "r", descriptor = "Lfc;")
    public class241 field2465;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "Lin;")
    public class81 field2458;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(III)Z")
    public static final boolean method1091(int arg0, int arg1, int arg2) {
        if (arg1 != -28635) {
            method1093(null, (byte) -115);
        }
        field2475++;
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V")
    public static void method1092(int arg0) {
        if (arg0 == -1) {
            field2470 = null;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Leh;B)Lmaa;")
    public static final class440 method1093(class335 arg0, byte arg1) {
        if (arg1 > -72) {
            method1092(-99);
        }
        field2479++;
        class621 var2 = class578.method3176((byte) 126, arg0);
        int var3 = arg0.method1993(-756647768);
        return new class440(var2.field8235, var2.field8233, var2.field8238, var2.field8236, var2.field8237, var3);
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)V")
    public final void method1094(int arg0) {
        this.field2476 = null;
        this.field2458 = null;
        this.field2465 = null;
        if (arg0 < -56) {
            field2462++;
            this.field2463 = null;
        }
    }
}
