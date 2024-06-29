import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class165 {

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "B")
    public byte field2485 = 0;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "B")
    public byte field2488;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "B")
    public byte field2475;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "S")
    public short field2474;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "S")
    public short field2481;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2467 = 0;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2470 = 1401;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[Z")
    public static boolean[] field2473 = new boolean[100];

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Log;")
    public static class456 field2472 = new class456("WIP", 2);

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "B")
    public byte field2476;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "B")
    public byte field2483;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "B")
    public byte field2491;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "B")
    public byte field2496;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lkf;")
    public class165 field2477;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lkg;")
    public class177 field2482;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "Lkg;")
    public class177 field2493;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lqd;")
    public class311 field2487;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Leb;")
    public class438 field2489;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lgn;")
    public class492 field2478;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lnh;")
    public class524 field2480;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Lnh;")
    public class524 field2484;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Lmo;")
    public class525 field2490;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "S")
    public short field2494;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Z")
    public boolean field2486;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Z")
    public boolean field2492;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "Z")
    public boolean field2495;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public final void method1184(int arg0) {
        while (this.field2490 != null) {
            class525 var2 = this.field2490.field7716;
            this.field2490.method3105((byte) -69);
            this.field2490 = var2;
        }
        field2471++;
        this.field2485 = 0;
        if (arg0 <= 74) {
            field2472 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method1185(int arg0) {
        field2472 = null;
        int var1 = -31 % ((arg0 + 5) / 61);
        field2473 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(CZ)Z")
    public static final boolean method1186(char arg0, boolean arg1) {
        field2469++;
        if (!arg1) {
            field2473 = null;
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lhh;BLhh;)I")
    public static final int method1187(class84 arg0, byte arg1, class84 arg2) {
        if (arg1 > -24) {
            return -15;
        }
        field2468++;
        int var3 = 0;
        if (arg0.method682(0, class101.field1615)) {
            var3++;
        }
        if (arg0.method682(0, class490.field7147)) {
            var3++;
        }
        if (arg0.method682(0, class147.field2169)) {
            var3++;
        }
        if (arg2.method682(0, class101.field1615)) {
            var3++;
        }
        if (arg2.method682(0, class490.field7147)) {
            var3++;
        }
        if (arg2.method682(0, class147.field2169)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(III)V")
    public class165(int arg0, int arg1, int arg2) {
        this.field2475 = this.field2488 = (byte) arg0;
        this.field2474 = (short) arg1;
        this.field2481 = (short) arg2;
    }
}
