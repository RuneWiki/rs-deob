import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class54 extends class200 {

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    private int field971 = 0;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    private int field974 = 1;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    private int field983 = 0;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "Lid;")
    public static class149 field976 = class60.method382(":clan:", (byte) 112);

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "Lid;")
    public static class149 field972 = class60.method382("Titelbild geladen)3", (byte) 124);

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "[I")
    public static int[] field979 = new int[100];

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "Lid;")
    public static class149 field981;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "Lal;")
    public static class230 field968;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "[[[I")
    public static int[][][] field973;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field980;
        int var2 = -9 / ((-60 - arg0) / 62);
        class124.method871(-126);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field982;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field974 = arg0.method489((byte) 103);
                }
            } else {
                this.field971 = arg0.method489((byte) 116);
            }
        } else {
            this.field983 = arg0.method489((byte) -48);
        }
        if (!arg1) {
            field973 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lal;Lal;I)I")
    public static final int method345(class230 arg0, class230 arg1, int arg2) {
        ++field977;
        int var3 = 0;
        if (arg0.method1556(class216.field3810, true)) {
            ++var3;
        }
        if (arg0.method1556(class191.field3422, true)) {
            ++var3;
        }
        if (arg0.method1556(class155.field2839, true)) {
            ++var3;
        }
        if (arg1.method1556(class216.field3810, true)) {
            ++var3;
        }
        if (arg1.method1556(class191.field3422, true)) {
            ++var3;
        }
        if (arg1.method1556(class155.field2839, true)) {
            ++var3;
        }
        if (arg2 >= -106) {
            field968 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public static void method346(int arg0) {
        field973 = null;
        field972 = null;
        int var1 = -111 % ((58 - arg0) / 62);
        field968 = null;
        field981 = null;
        field976 = null;
        field979 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field975;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (arg1 != 55) {
            field968 = null;
        }
        if (super.field3638.field4887) {
            int var4 = class93.field1644[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; class137.field2515 > var6; ++var6) {
                int var7 = class73.field1263[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field983 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field974 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field974;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field971 != 0) {
                    if (this.field971 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class270.field4860[(var12 & 4082) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILal;II)[Lvc;")
    public static final class190[] method347(int arg0, class230 arg1, int arg2, int arg3) {
        ++field970;
        if (!class59.method371((byte) -77, arg3, arg0, arg1)) {
            return null;
        } else {
            return arg2 != 2048 ? null : class284.method1945((byte) -10);
        }
    }
}
