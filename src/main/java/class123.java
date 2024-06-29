import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class123 extends class72 {

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    private int field2679 = 128;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    private int field2676 = 0;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "[I")
    private int[] field2677 = new int[6];

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    private int field2665 = 128;

    @OriginalMember(owner = "client!vc", name = "nb", descriptor = "I")
    private int field2687 = 0;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "I")
    private int field2681 = 0;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public int field2668 = -1;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "[I")
    private int[] field2680 = new int[6];

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "Lec;")
    public static class28 field2671 = class28.method210(-46, "invback");

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "[[I")
    public static int[][] field2670 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "Lec;")
    public static class28 field2674 = class28.method210(-46, "It(Ws a ");

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "Lec;")
    public static class28 field2684 = class28.method210(-46, "glow1:");

    @OriginalMember(owner = "client!vc", name = "mb", descriptor = "I")
    public static int field2686 = 0;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lec;")
    public static class28 field2678 = class28.method210(-46, "Loaded wordpack");

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Lec;")
    public static class28 field2666 = class28.method210(-46, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    private int field2673;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "[[B")
    public static byte[][] field2682;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)Lfb;")
    public final class33 method948(int arg0, int arg1) {
        field2675++;
        class33 var3 = (class33) client.field386.method660(-2, (long) this.field2667);
        if (var3 == null) {
            var3 = class33.method285(class68.field1529, this.field2673, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field2680[0] != 0) {
                    var3.method270(this.field2680[var4], this.field2677[var4]);
                }
            }
            var3.method277();
            var3.method282(this.field2681 + 64, this.field2687 + 850, -30, -50, -30, true);
            client.field386.method666(false, var3, (long) this.field2667);
        }
        class33 var5;
        if (this.field2668 == -1 || arg0 == -1) {
            var5 = var3.method281(true);
        } else {
            var5 = class23.method166(0, this.field2668).method75(arg0, var3, (byte) -55);
        }
        if (this.field2679 != 128 || this.field2665 != 128) {
            var5.method259(this.field2679, this.field2665, this.field2679);
        }
        int var6 = -7 % ((arg1 + 37) / 42);
        if (this.field2676 != 0) {
            if (this.field2676 == 90) {
                var5.method284();
            }
            if (this.field2676 == 180) {
                var5.method284();
                var5.method284();
            }
            if (this.field2676 == 270) {
                var5.method284();
                var5.method284();
                var5.method284();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILud;)V")
    public final void method949(int arg0, class119 arg1) {
        field2664++;
        if (arg0 != -50) {
            return;
        }
        while (true) {
            int var3 = arg1.method879((byte) 45);
            if (var3 == 0) {
                return;
            }
            this.method952(arg1, arg0 ^ 0x61DB, var3);
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
    public static void method950(byte arg0) {
        field2670 = null;
        field2674 = null;
        field2684 = null;
        field2678 = null;
        int var1 = 103 % ((-arg0 - 27) / 37);
        field2682 = null;
        field2666 = null;
        field2671 = null;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(Z)V")
    public static final void method951(boolean arg0) {
        if (!arg0) {
            method951(true);
        }
        field2683++;
        if (class11.field185 != 0 || class40.field868 != 1) {
            return;
        }
        int var1 = class96.field2143 - 550 - 25;
        int var2 = class32.field680 - 5 - 4;
        if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
            return;
        }
        var1 -= 73;
        var2 -= 75;
        int var3 = class48.field1105 + class122.field2663 & 0x7FF;
        int var4 = class60.field1326[var3];
        int var5 = class60.field1323[var3];
        int var6 = (class74.field1637 + 256) * var4 >> 8;
        int var7 = (class74.field1637 + 256) * var5 >> 8;
        int var8 = var2 * var7 - var1 * var6 >> 11;
        int var9 = var1 * var7 + var2 * var6 >> 11;
        int var10 = class37.field848.field1501 - var8 >> 7;
        int var11 = class37.field848.field1446 + var9 >> 7;
        boolean var12 = class51.method416(true, 0, 0, -80, var10, 0, 1, class37.field848.field1487[0], 0, 0, class37.field848.field1466[0], var11);
        if (!var12) {
            return;
        }
        class5.field85.method888(var1, -108);
        class5.field85.method888(var2, 56);
        class5.field85.method876((byte) -48, class122.field2663);
        class5.field85.method888(57, 105);
        class5.field85.method888(class48.field1105, -124);
        class5.field85.method888(class74.field1637, -118);
        class5.field85.method888(89, -97);
        class5.field85.method876((byte) -48, class37.field848.field1446);
        class5.field85.method876((byte) -48, class37.field848.field1501);
        class5.field85.method888(class46.field1032, 69);
        class5.field85.method888(63, 82);
        return;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lud;II)V")
    private final void method952(class119 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2673 = arg0.method903(2);
        } else if (arg2 == 2) {
            this.field2668 = arg0.method903(2);
        } else if (arg2 == 4) {
            this.field2679 = arg0.method903(2);
        } else if (arg2 == 5) {
            this.field2665 = arg0.method903(arg1 + 25069);
        } else if (arg2 == 6) {
            this.field2676 = arg0.method903(2);
        } else if (arg2 == 7) {
            this.field2681 = arg0.method879((byte) 45);
        } else if (arg2 == 8) {
            this.field2687 = arg0.method879((byte) 45);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field2680[arg2 - 40] = arg0.method903(2);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field2677[arg2 - 50] = arg0.method903(2);
        }
        field2685++;
        if (arg1 != -25067) {
            this.method949(-35, null);
        }
    }
}
