import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class39 extends class106 {

    @OriginalMember(owner = "client!hl", name = "Fb", descriptor = "Z")
    public static boolean field662 = true;

    @OriginalMember(owner = "client!hl", name = "Hb", descriptor = "I")
    public static int field664 = 0;

    @OriginalMember(owner = "client!hl", name = "Ab", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!hl", name = "Bb", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!hl", name = "Cb", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!hl", name = "Db", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!hl", name = "Eb", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!hl", name = "Gb", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!hl", name = "Jb", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!hl", name = "Lb", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!hl", name = "Mb", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!hl", name = "Nb", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!hl", name = "Ib", descriptor = "Lh;")
    private class271 field665;

    @OriginalMember(owner = "client!hl", name = "Kb", descriptor = "Lsj;")
    public static class49 field667;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
    public final void method287(byte arg0, int arg1) {
        super.field2108[super.field2085++] = (byte) (this.field665.method1849(-90) + arg1);
        if (arg0 >= 117) {
            ++field668;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I)V")
    public class39(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "([BIII)V")
    public final void method288(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field661;
        int var5 = 0;
        int var6 = -78 / ((arg3 - 29) / 57);
        while (~arg1 < ~var5) {
            arg0[var5 - -arg2] = (byte) (super.field2108[super.field2085++] + -this.field665.method1849(118));
            ++var5;
        }
    }

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "(II)I")
    public final int method289(int arg0, int arg1) {
        int var3 = this.field663 >> 3;
        ++field659;
        int var4 = -(this.field663 & 7) + arg0;
        this.field663 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (class162.field2942[var4] & super.field2108[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field2108[var3] >> -arg1 + var4 & class162.field2942[arg1]) + var5;
        } else {
            var6 = (class162.field2942[var4] & super.field2108[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "(I)I")
    public final int method290(int arg0) {
        if (arg0 != 8) {
            this.method291(-53, -100);
        }
        ++field657;
        return 255 & super.field2108[super.field2085++] - this.field665.method1849(97);
    }

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "(II)I")
    public final int method291(int arg0, int arg1) {
        if (arg1 != -31508) {
            return 58;
        } else {
            ++field658;
            return arg0 * 8 + -this.field663;
        }
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "(I)V")
    public static void method292(int arg0) {
        field667 = null;
        int var1 = 68 / ((arg0 - -17) / 46);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Led;")
    public static final class181 method293(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class181 var4 = var3.field2218;
            var3.field2218 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "(I)V")
    public final void method294(int arg0) {
        if (arg0 < 52) {
            field664 = 16;
        }
        this.field663 = super.field2085 * 8;
        ++field666;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method295(int arg0, Random arg1, int arg2) {
        ++field669;
        if (~arg2 >= -1) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 != -61) {
                method293(-121, -52, 39);
            }
            if (class241.method1668(arg2, -126)) {
                return (int) ((long) arg2 * (4294967295L & (long) arg1.nextInt()) >> 32);
            } else {
                int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
                int var4;
                do {
                    var4 = arg1.nextInt();
                } while (~var4 <= ~var3);
                return class134.method936((byte) 51, arg2, var4);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([II)V")
    public final void method296(int[] arg0, int arg1) {
        if (arg1 <= -117) {
            this.field665 = new class271(arg0);
            ++field670;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V")
    public final void method297(boolean arg0) {
        super.field2085 = (this.field663 - -7) / 8;
        if (!arg0) {
            this.field665 = null;
        }
        ++field660;
    }
}
