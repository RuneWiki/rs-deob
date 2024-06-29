import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class132 extends class51 {

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    private int field2753 = 0;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
    private int field2757 = 1365;

    @OriginalMember(owner = "client!oe", name = "qb", descriptor = "I")
    private int field2765 = 0;

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
    private int field2761 = 20;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "Led;")
    public static class43 field2750 = class191.method1219("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", false);

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "Led;")
    public static class43 field2755 = class191.method1219("Bitte geben Sie Ihr Passwort ein)3", false);

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "Led;")
    public static class43 field2749 = class191.method1219("Lade Wordpack )2 ", false);

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "[Led;")
    public static class43[] field2760 = new class43[100];

    @OriginalMember(owner = "client!oe", name = "ob", descriptor = "Led;")
    public static class43 field2763 = class191.method1219("Anmelde)2Zeitlimit -Uberschritten)3", false);

    @OriginalMember(owner = "client!oe", name = "pb", descriptor = "I")
    public static int field2764 = 0;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "Lpe;")
    public static class141 field2756;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "Lpe;")
    public static class141 field2758;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
    public static final void method853(int arg0) {
        ++field2752;
        class82.field1615 = new byte[4][104][104];
        class39.field749 = new byte[4][104][104];
        class12.field182 = new int[104];
        class26.field473 = new int[104];
        class49.field987 = new int[104];
        class175.field3477 = new int[104];
        class7.field145 = 99;
        class161.field3256 = new int[4][105][105];
        class159.field3213 = new int[104];
        if (arg0 < -38) {
            class67.field1351 = new byte[4][105][105];
            class201.field3955 = new byte[4][104][104];
            class172.field3435 = new byte[4][104][104];
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            this.method27(-22, -9);
        }
        ++field2748;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            for (int var4 = 0; ~class122.field2442 < ~var4; ++var4) {
                int var5 = (class95.field1855[var4] << 12) / this.field2757 - -this.field2753;
                int var6 = (class40.field771[arg1] << 12) / this.field2757 + this.field2765;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = var6;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; ~(var10 + var12) > -16385 && ~var13 > ~this.field2761; ++var13) {
                    var11 = (var9 * var11 >> 12) * 2 - -var8;
                    var9 = -var12 + var7 + var10;
                    var10 = var9 * var9 >> 12;
                    var12 = var11 * var11 >> 12;
                }
                var3[var4] = this.field2761 + -1 > var13 ? (var13 << 12) / this.field2761 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class132() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field2759;
        if (arg1 != 0) {
            method854(-8);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field2765 = arg0.method555(arg1 ^ -1113627096);
                    }
                } else {
                    this.field2753 = arg0.method555(-1113627096);
                }
            } else {
                this.field2761 = arg0.method555(-1113627096);
            }
        } else {
            this.field2757 = arg0.method555(-1113627096);
        }
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
    public static void method854(int arg0) {
        field2750 = null;
        field2749 = null;
        field2763 = null;
        field2756 = null;
        field2755 = null;
        int var1 = -74 / ((arg0 - -54) / 43);
        field2758 = null;
        field2760 = null;
    }
}
