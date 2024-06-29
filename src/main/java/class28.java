import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class113 {

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    private int field670 = 0;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "[I")
    public static int[] field667 = new int[200];

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Lu;")
    public static class135 field669 = class87.method676((byte) -82, "l");

    @OriginalMember(owner = "client!df", name = "sb", descriptor = "J")
    public static volatile long field682 = 0L;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "Lu;")
    private static class135 field674 = class87.method676((byte) -104, "Click to switch");

    @OriginalMember(owner = "client!df", name = "yb", descriptor = "Lu;")
    public static class135 field688 = field674;

    @OriginalMember(owner = "client!df", name = "ub", descriptor = "Lu;")
    public static class135 field684 = class87.method676((byte) -122, "null");

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "Lu;")
    private static class135 field671 = class87.method676((byte) -127, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!df", name = "xb", descriptor = "Lu;")
    private static class135 field687 = class87.method676((byte) -61, "slide:");

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "Lu;")
    public static class135 field675 = field687;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "Lu;")
    public static class135 field672 = field687;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "Lu;")
    public static class135 field666 = field671;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!df", name = "tb", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!df", name = "vb", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!df", name = "wb", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!df", name = "zb", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!df", name = "Ab", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "Lod;")
    public static class101 field679;

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "Lpe;")
    public static class109 field681;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "Lre;")
    public static class122 field677;

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "Lre;")
    public static class122 field678;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)Lve;")
    public static final class146 method227(int arg0, byte arg1, int arg2) {
        class146 var3 = class48.method360(-119, arg2);
        field673++;
        if (arg0 == -1) {
            return var3;
        } else {
            if (arg1 >= -69) {
                method227(69, (byte) -19, -122);
            }
            return var3 == null || var3.field3574 == null || var3.field3574.length <= arg0 ? null : var3.field3574[arg0];
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public final void method228(byte arg0) {
        field663++;
        if (arg0 >= 83) {
            this.method231(89, this.field670);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lic;IZI)V")
    private final void method229(class59 arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field665++;
            if (arg3 == 1) {
                this.field670 = arg0.method455(true);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLic;I)V")
    public final void method230(byte arg0, class59 arg1, int arg2) {
        field685++;
        int var4 = -119 / ((24 - arg0) / 62);
        while (true) {
            int var5 = arg1.method480(0);
            if (var5 == 0) {
                return;
            }
            this.method229(arg1, arg2, false, var5);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
    private final void method231(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        if (arg0 < 24) {
            field672 = null;
        }
        field689++;
        double var7 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        if (var7 > var3) {
            var9 = var3;
        }
        double var11 = var7;
        double var13 = 0.0D;
        if (var9 > var5) {
            var9 = var5;
        }
        double var15 = 0.0D;
        if (var3 > var7) {
            var11 = var3;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field662 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var7 == var11) {
                var15 = (var3 - var5) / (var11 - var9);
            } else if (var3 == var11) {
                var15 = (var5 - var7) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (-var9 + var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field686 = (int) (var13 * 256.0D);
        if (this.field662 < 0) {
            this.field662 = 0;
        } else if (this.field662 > 255) {
            this.field662 = 255;
        }
        if (var17 > 0.5D) {
            this.field680 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field680 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field686 < 0) {
            this.field686 = 0;
        } else if (this.field686 > 255) {
            this.field686 = 255;
        }
        double var19 = var15 / 6.0D;
        if (this.field680 < 1) {
            this.field680 = 1;
        }
        this.field683 = (int) ((double) this.field680 * var19);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lg;III)Lcc;")
    public static final class18 method232(class43 arg0, int arg1, int arg2, int arg3) {
        field664++;
        if (class79.method626((byte) -29, arg0, arg3, arg2)) {
            int var4 = -124 / ((arg1 + 58) / 43);
            return class50.method375((byte) -26);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
    public static void method233(int arg0) {
        field672 = null;
        field671 = null;
        field679 = null;
        field681 = null;
        if (arg0 <= 81) {
            method232(null, -3, 90, -97);
        }
        field677 = null;
        field675 = null;
        field688 = null;
        field678 = null;
        field666 = null;
        field669 = null;
        field684 = null;
        field667 = null;
        field687 = null;
        field674 = null;
    }
}
