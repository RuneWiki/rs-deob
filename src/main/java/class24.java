import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class24 {

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "[I")
    public static int[] field259 = new int[128];

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "Lf;")
    public static class10 field263 = class23.method139("Farming shop", (byte) -94);

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Lf;")
    public static class10 field260 = class23.method139("Overview", (byte) -96);

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "Lf;")
    public static class10 field265 = class23.method139("General Store", (byte) -58);

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "B")
    public byte field264;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "[B")
    public static byte[] field258;

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "[B")
    public byte[] field261;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "[I")
    public static int[] field257;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V", line = 12)
    public static void method140(int arg0) {
        field257 = null;
        field265 = null;
        field258 = null;
        field263 = null;
        field259 = null;
        if (arg0 == -10716) {
            field260 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I[B)Lg;", line = 28)
    public static final class12 method141(int arg0, byte[] arg1) {
        if (arg1 == null) {
            return null;
        } else if (arg0 == 1) {
            class12 var2 = new class12(arg1, class19.field180, class31.field425, class33.field470, class1.field10, class41.field539, class35.field490);
            class18.method113(arg0 - 2);
            return var2;
        } else {
            return (class12) null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IJ)V", line = 71)
    public static final void method142(int arg0, long arg1) {
        if (arg0 < 103) {
            method140(-28);
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class10.method59((byte) 113, arg1 - 1L);
            class10.method59((byte) 113, 1L);
        } else {
            class10.method59((byte) 113, arg1);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I)V", line = 101)
    public final void method143(int arg0) {
        if (arg0 != 6310) {
            return;
        }
        boolean var2 = true;
        if (this.field261 == null) {
            return;
        }
        this.field264 = this.field261[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field261[var3] != this.field264) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field261 = null;
        }
    }
}
