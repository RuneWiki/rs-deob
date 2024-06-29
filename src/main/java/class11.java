import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class11 {

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "[Lba;")
    private class4[] field123;

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "Lf;")
    public static class10 field116 = class23.method139("Fur Trader", (byte) -110);

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "Lf;")
    public static class10 field117 = class23.method139(" )2 ", (byte) -63);

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "Lf;")
    public static class10 field115 = class23.method139("Combat Training", (byte) -124);

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "Lf;")
    public static class10 field122 = class23.method139("-5bersicht", (byte) -77);

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "Lf;")
    public static class10 field125 = class23.method139("Helmet Shop", (byte) -86);

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "J")
    private long field121;

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Lba;")
    private class4 field119;

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "[B")
    public static byte[] field118;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)Lba;", line = 6)
    public final class4 method81(int arg0) {
        if (this.field119 == null) {
            return null;
        }
        if (arg0 < 35) {
            this.field119 = null;
        }
        class4 var2 = this.field123[(int) ((long) (this.field120 - 1) & this.field121)];
        while (this.field119 != var2) {
            if (this.field119.field23 == this.field121) {
                class4 var3 = this.field119;
                this.field119 = this.field119.field28;
                return var3;
            }
            this.field119 = this.field119.field28;
        }
        this.field119 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ZJ)Lba;", line = 51)
    public final class4 method82(boolean arg0, long arg1) {
        this.field121 = arg1;
        if (!arg0) {
            return (class4) null;
        }
        class4 var4 = this.field123[(int) (arg1 & (long) (this.field120 - 1))];
        for (this.field119 = var4.field28; this.field119 != var4; this.field119 = this.field119.field28) {
            if (this.field119.field23 == arg1) {
                class4 var5 = this.field119;
                this.field119 = this.field119.field28;
                return var5;
            }
        }
        this.field119 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(I)V", line = 95)
    public static void method83(int arg0) {
        if (arg0 < 112) {
            return;
        }
        field115 = null;
        field118 = null;
        field125 = null;
        field117 = null;
        field122 = null;
        field116 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 114)
    public static final byte[] method84(boolean arg0, Object arg1, int arg2) {
        if (arg2 <= 72) {
            return (byte[]) null;
        } else if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class33.method215(-122, var3) : var3;
        } else if (arg1 instanceof class8) {
            class8 var4 = (class8) arg1;
            return var4.method45(-88);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(JLba;Z)V", line = 159)
    public final void method85(long arg0, class4 arg1, boolean arg2) {
        if (arg1.field22 != null) {
            arg1.method18(arg2);
        }
        class4 var5 = this.field123[(int) ((long) (this.field120 - 1) & arg0)];
        arg1.field23 = arg0;
        arg1.field22 = var5.field22;
        arg1.field28 = var5;
        arg1.field22.field28 = arg1;
        if (!arg2) {
            method84(true, null, 23);
        }
        arg1.field28.field22 = arg1;
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "(I)V", line = 189)
    public class11(int arg0) {
        this.field123 = new class4[arg0];
        this.field120 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class4 var3 = this.field123[var2] = new class4();
            var3.field28 = var3;
            var3.field22 = var3;
        }
    }
}
