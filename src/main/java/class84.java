import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class84 extends class51 {

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    private int field1643 = 4096;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    private int field1642 = 4096;

    @OriginalMember(owner = "client!jb", name = "lb", descriptor = "I")
    private int field1654 = 4096;

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "[[I")
    public static int[][] field1652 = new int[104][104];

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "Led;")
    private static class43 field1651 = class191.method1219("glow3:", false);

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "Led;")
    public static class43 field1644 = field1651;

    @OriginalMember(owner = "client!jb", name = "mb", descriptor = "Led;")
    public static class43 field1655 = field1651;

    @OriginalMember(owner = "client!jb", name = "nb", descriptor = "Led;")
    private static class43 field1656 = class191.method1219(" is already on your friend list)3", false);

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "Led;")
    private static class43 field1650 = class191.method1219("New User", false);

    @OriginalMember(owner = "client!jb", name = "kb", descriptor = "Led;")
    public static class43 field1653 = field1656;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "Led;")
    public static class43 field1646 = field1650;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!jb", name = "ob", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lga;")
    public static class58 field1649;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lga;Led;Led;B)[Ltg;")
    public static final class179[] method512(class58 arg0, class43 arg1, class43 arg2, byte arg3) {
        ++field1648;
        int var4 = arg0.method347(arg1, (byte) -68);
        int var5 = arg0.method362(arg2, arg3, var4);
        return class81.method498(arg0, var4, var5, -128);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1654 = arg0.method555(-1113627096);
                }
            } else {
                this.field1643 = arg0.method555(-1113627096);
            }
        } else {
            this.field1642 = arg0.method555(-1113627096);
        }
        ++field1647;
        if (arg1 != 0) {
            method512((class58) null, (class43) null, (class43) null, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public static void method513(int arg0) {
        field1650 = null;
        field1653 = null;
        field1652 = null;
        field1651 = null;
        field1656 = null;
        field1646 = null;
        field1655 = null;
        field1649 = null;
        if (arg0 == 0) {
            field1644 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        if (arg1 != -94) {
            this.method24((class89) null, 22, -108);
        }
        ++field1645;
        int[][] var3 = super.field1027.method1087(arg0, arg1 + 92);
        if (super.field1027.field3428) {
            int[][] var4 = this.method306(0, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class122.field2442; ++var11) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field1642 * var12 >> 12;
                    var9[var11] = this.field1643 * var13 >> 12;
                    var10[var11] = this.field1654 * var14 >> 12;
                } else {
                    var8[var11] = this.field1642;
                    var9[var11] = this.field1643;
                    var10[var11] = this.field1654;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILed;Led;Led;)V")
    public static final void method514(int arg0, class43 arg1, class43 arg2, class43 arg3) {
        int var4 = -127 / ((-23 - arg0) / 32);
        class68.field1361 = arg2;
        ++field1657;
        class68.field1358 = arg1;
        class68.field1371 = arg3;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class84() {
        super(1, false);
    }
}
