import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class30 extends class82 {

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "I")
    private int field540 = -1;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "Ldj;")
    public static class44 field536 = class89.method650(255, "<col=ffff00>");

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "[Z")
    public static boolean[] field531 = new boolean[5];

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "[Ldj;")
    public static class44[] field525 = new class44[500];

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "Ldj;")
    private static class44 field539 = class89.method650(255, "cyan:");

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "Ldj;")
    public static class44 field537 = field539;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "Ldj;")
    public static class44 field527 = field539;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public static volatile int field535 = 0;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "I")
    public static int field543 = 0;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "[I")
    private int[] field529;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "[[[B")
    public static byte[][][] field526;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "[[[B")
    public static byte[][][] field541;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        int[][] var3 = super.field1601.method548(arg1, true);
        ++field533;
        if (super.field1601.field1343 && this.method209((byte) -93)) {
            int var4 = (~client.field609 == ~this.field534 ? arg1 : this.field534 * arg1 / client.field609) * this.field532;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class129.field2287 == this.field532) {
                for (int var8 = 0; var8 < class129.field2287; ++var8) {
                    int var9 = this.field529[var4++];
                    var7[var8] = class29.method202(var9 << 4, 4080);
                    var6[var8] = class29.method202(65280, var9) >> 4;
                    var5[var8] = class29.method202(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~class129.field2287 < ~var10; ++var10) {
                    int var11 = this.field532 * var10 / class129.field2287;
                    int var12 = this.field529[var4 + var11];
                    var7[var10] = class29.method202(var12, 255) << 4;
                    var6[var10] = class29.method202(var12 >> 4, 4080);
                    var5[var10] = class29.method202(var12, 16711680) >> 12;
                }
            }
        }
        return arg0 > -59 ? null : var3;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
    public static void method208(int arg0) {
        field536 = null;
        field526 = null;
        if (arg0 != -20186) {
            field537 = null;
        }
        field527 = null;
        field539 = null;
        field531 = null;
        field525 = null;
        field537 = null;
        field541 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            this.method6(-96, -16);
        }
        if (~arg1 == -1) {
            this.field540 = arg0.method500(63);
        }
        ++field542;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class30() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Z")
    private final boolean method209(byte arg0) {
        if (arg0 != -93) {
            return false;
        } else {
            ++field538;
            if (this.field529 != null) {
                return true;
            } else if (this.field540 >= 0) {
                int var2 = class129.field2287;
                int var3 = client.field609;
                int var4 = class32.field552.method367((byte) -46, this.field540) ? 64 : 128;
                this.field529 = class32.field552.method366(-205, this.field540);
                this.field534 = var4;
                this.field532 = var4;
                class231.method1512(var2, -1, var3);
                return this.field529 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
    public final void method210(int arg0) {
        super.method210(arg0);
        ++field528;
        this.field529 = null;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I")
    public final int method211(int arg0) {
        if (arg0 != 20636) {
            this.method6(-111, 27);
        }
        ++field530;
        return this.field540;
    }
}
