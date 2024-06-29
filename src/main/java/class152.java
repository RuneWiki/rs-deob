import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class152 extends class252 {

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "I")
    private int field2592 = -1;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "Lve;")
    public static class184 field2585 = new class184(20);

    @OriginalMember(owner = "client!gi", name = "hb", descriptor = "Ljd;")
    public static class85 field2596 = class221.method1499("M", (byte) -80);

    @OriginalMember(owner = "client!gi", name = "kb", descriptor = "J")
    public static long field2599 = 0L;

    @OriginalMember(owner = "client!gi", name = "gb", descriptor = "Ljd;")
    public static class85 field2595 = class221.method1499("Lade Texturen )2 ", (byte) 117);

    @OriginalMember(owner = "client!gi", name = "lb", descriptor = "I")
    public static int field2600 = 0;

    @OriginalMember(owner = "client!gi", name = "pb", descriptor = "I")
    public static int field2604 = 0;

    @OriginalMember(owner = "client!gi", name = "mb", descriptor = "Ljd;")
    public static class85 field2601 = class221.method1499("Ausw-=hlen", (byte) -93);

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!gi", name = "fb", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!gi", name = "jb", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!gi", name = "nb", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!gi", name = "ob", descriptor = "Lge;")
    public static class68 field2603;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "[I")
    public int[] field2584;

    @OriginalMember(owner = "client!gi", name = "ib", descriptor = "[I")
    public static int[] field2597;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
    public static void method1000(int arg0) {
        if (arg0 != 0) {
            field2599 = -22L;
        }
        field2601 = null;
        field2595 = null;
        field2603 = null;
        field2585 = null;
        field2596 = null;
        field2597 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)[[I")
    public int[][] method89(int arg0, byte arg1) {
        ++field2588;
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338 && this.method1005(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field2590 * (~class140.field2422 == ~this.field2583 ? arg0 : this.field2583 * arg0 / class140.field2422);
            if (class5.field63 == this.field2590) {
                for (int var8 = 0; var8 < class5.field63; ++var8) {
                    int var9 = this.field2584[var7++];
                    var6[var8] = class135.method899(var9 << 4, 4080);
                    var5[var8] = class135.method899(var9, 65280) >> 4;
                    var4[var8] = class135.method899(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; ~class5.field63 < ~var10; ++var10) {
                    int var11 = this.field2590 * var10 / class5.field63;
                    int var12 = this.field2584[var7 + var11];
                    var6[var10] = class135.method899(4080, var12 << 4);
                    var5[var10] = class135.method899(65280, var12) >> 4;
                    var4[var10] = class135.method899(16711680, var12) >> 12;
                }
            }
        }
        if (arg1 != -123) {
            field2603 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg2 == -99) {
            if (arg1 == 0) {
                this.field2592 = arg0.method1694((byte) -100);
            }
            ++field2593;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLik;)Llc;")
    public static final class82 method1001(byte arg0, class247 arg1) {
        ++field2591;
        class82 var2 = new class82(arg1.method1692(109), arg1.method1692(108), arg1.method1694((byte) -100), arg1.method1694((byte) -100), arg1.method1712(6357), arg1.method1711((byte) -67) == 1);
        if (arg0 >= -24) {
            method1002(-115);
        }
        int var3 = arg1.method1711((byte) -67);
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            var2.field1491.method116((byte) -121, new class3(arg1.method1694((byte) -100), arg1.method1694((byte) -100), arg1.method1694((byte) -100), arg1.method1694((byte) -100)));
        }
        var2.method567(234);
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public final void method94(byte arg0) {
        super.method94(arg0);
        this.field2584 = null;
        ++field2594;
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)V")
    public static final void method1002(int arg0) {
        class95.field1747 = arg0;
        for (int var1 = 0; var1 < class122.field2140; ++var1) {
            for (int var2 = 0; var2 < class202.field3521; ++var2) {
                if (class99.field1780[arg0][var1][var2] == null) {
                    class99.field1780[arg0][var1][var2] = new class208(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class152() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Lge;B)V")
    public static final void method1003(class68 arg0, byte arg1) {
        ++field2587;
        if (!class32.field487) {
            class179.method1209();
            class183.field3131 = class85.method591(0, arg0, class210.field3694);
            int var2 = class154.field2662;
            int var3 = var2 * 956 / 503;
            class183.field3131.method99((class154.field2664 - var3) / 2, 0, var3, var2);
            class252.field4348 = class181.method1245(class72.field1346, arg0, -1);
            class252.field4348.method713(class154.field2664 / 2 + -(class252.field4348.field4003 / 2), 18);
            class32.field487 = true;
            if (arg1 != -10) {
                method1000(-38);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)I")
    public final int method1004(byte arg0) {
        int var2 = 16 % ((-24 - arg0) / 46);
        ++field2589;
        return this.field2592;
    }

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "(I)Z")
    public final boolean method1005(int arg0) {
        ++field2586;
        if (this.field2584 != null) {
            return true;
        } else if (arg0 >= ~this.field2592) {
            class266 var2 = class223.method1514(class244.field4175, (byte) 105, this.field2592);
            var2.method1829();
            this.field2584 = var2.field4745;
            this.field2590 = var2.field184;
            this.field2583 = var2.field183;
            return true;
        } else {
            return false;
        }
    }
}
