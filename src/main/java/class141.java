import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class141 extends class202 {

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Loh;")
    public static class263 field2576 = class253.method1681(-118, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Loh;")
    private static class263 field2579 = class253.method1681(-125, "Attack");

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Loh;")
    public static class263 field2584 = class253.method1681(-123, "blaugr-Un:");

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Loh;")
    public static class263 field2582 = class253.method1681(-122, "mapfunction");

    @OriginalMember(owner = "client!w", name = "G", descriptor = "Loh;")
    public static class263 field2581 = class253.method1681(-118, ":assist:");

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Loh;")
    public static class263 field2575 = field2579;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Llb;")
    public static class127 field2578 = new class127(30);

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Lti;")
    public static class5 field2587 = new class5(512);

    @OriginalMember(owner = "client!w", name = "R", descriptor = "Loh;")
    public static class263 field2591 = class253.method1681(-121, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!w", name = "O", descriptor = "[S")
    public static short[] field2589 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field2588 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "Loh;")
    public static class263 field2590 = class253.method1681(-120, "p12_full");

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static void method935(int arg0) {
        field2589 = null;
        field2584 = null;
        field2591 = null;
        field2581 = null;
        field2590 = null;
        field2578 = null;
        field2579 = null;
        field2575 = null;
        field2582 = null;
        field2587 = null;
        if (arg0 != 15) {
            method935(-123);
        }
        field2576 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V")
    public abstract void method919(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public abstract void method926(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI[B)I")
    public static final int method936(int arg0, byte arg1, int arg2, byte[] arg3) {
        field2586++;
        int var4 = -1;
        if (arg1 != -104) {
            field2575 = null;
        }
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = class118.field2197[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V")
    public abstract void method934(int arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V")
    public abstract void method929(int arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public abstract void method925(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
    public abstract void method922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZII)V")
    public final void method937(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2573++;
        int var6 = this.field2580 << 3;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        int var8 = this.field2574 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        if (arg2) {
            this.method937(103, 121, true, -99, 22);
        }
        this.method922(var8, var6, var9, var7, arg3, arg4);
    }
}
