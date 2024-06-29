import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class27 {

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "Lta;")
    public static class37 field433 = class20.method87(-99, "Find");

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "Lta;")
    public static class37 field435 = class20.method87(-97, " ");

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "Z")
    public static boolean field440 = false;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Lta;")
    public static class37 field437 = class20.method87(-116, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "B")
    public byte field439;

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "J")
    public static long field436;

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "[B")
    public static byte[] field434;

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "[B")
    public byte[] field441;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Z)[Lga;", line = 25)
    public static final class13[] method171(boolean arg0) {
        class13[] var1 = new class13[class2.field19];
        int var2 = 0;
        if (arg0) {
            return (class13[]) null;
        }
        while (class2.field19 > var2) {
            class13 var3 = new class13();
            var3.field148 = class37.field507[var2];
            var3.field149 = class11.field121[var2];
            var3.field150 = class12.field138[var2];
            var3.field146 = class20.field231[var2];
            int var4 = var3.field150 * var3.field146;
            byte[] var5 = class38.field517[var2];
            var3.field147 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field147[var6] = class7.field78[class10.method40(255, var5[var6])];
            }
            var1[var2] = var3;
            var2++;
        }
        class33.method193((byte) -107);
        return var1;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)V", line = 70)
    public static void method172(int arg0) {
        field435 = null;
        field437 = null;
        field434 = null;
        if (arg0 != 14556) {
            method171(false);
        }
        field433 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)V", line = 93)
    public final void method173(byte arg0) {
        if (arg0 < 31) {
            return;
        }
        boolean var2 = true;
        if (this.field441 == null) {
            return;
        }
        this.field439 = this.field441[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field441[var3] != this.field439) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field441 = null;
        }
    }
}
