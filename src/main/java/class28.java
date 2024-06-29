import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class28 {

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Lj;")
    public static class17 field365 = class30.method190(-106, "Platebody Shop");

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "Lj;")
    public static class17 field363 = class30.method190(-108, "Skirt Shop");

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "Lm;")
    public static class23 field364 = new class23();

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "Lj;")
    public static class17 field368 = class30.method190(-115, "100(U");

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "Z")
    public static volatile boolean field369 = true;

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "Laa;")
    public static class2 field367 = new class2();

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "Z")
    public static boolean field370 = false;

    @OriginalMember(owner = "mapview!oa", name = "k", descriptor = "Lj;")
    public static class17 field372 = class30.method190(-109, "Archery Shop");

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "Lj;")
    public static class17 field371 = class30.method190(-99, "Jewellery");

    @OriginalMember(owner = "mapview!oa", name = "l", descriptor = "Lj;")
    public static class17 field373 = class30.method190(-126, "_");

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "B")
    public byte field362;

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "[B")
    public byte[] field366;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V", line = 4)
    public static void method182(int arg0) {
        field368 = null;
        field365 = null;
        field373 = null;
        field367 = null;
        field364 = null;
        if (arg0 != 0) {
            method182(89);
        }
        field363 = null;
        field371 = null;
        field372 = null;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(B)V", line = 53)
    public final void method183(byte arg0) {
        boolean var2 = true;
        if (this.field366 != null) {
            this.field362 = this.field366[0];
            for (int var3 = 0; var3 < 4096; var3++) {
                if (this.field366[var3] != this.field362) {
                    var2 = false;
                    break;
                }
            }
            if (var2) {
                this.field366 = null;
            }
        }
        int var4 = -107 % ((-arg0 - 80) / 37);
    }
}
