import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class6 {

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Lt;")
    public static class35 field101 = class3.method28(false, "Staff Shop");

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Lt;")
    public static class35 field105 = class3.method28(false, "codeversion");

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Lt;")
    public static class35 field106 = class3.method28(false, "Agility Training");

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "Lt;")
    public static class35 field108 = class3.method28(false, "Estate Agent");

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "Lt;")
    public static class35 field110 = class3.method28(false, "Kebab Seller");

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "B")
    public byte field104;

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "J")
    public static long field109;

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "Ln;")
    public static class26 field103;

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "Lu;")
    public static class36 field107;

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "[B")
    public byte[] field102;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V", line = 12)
    public static void method49(int arg0) {
        field105 = null;
        field107 = null;
        field103 = null;
        field108 = null;
        if (arg0 != 0) {
            method49(45);
        }
        field110 = null;
        field101 = null;
        field106 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Lpa;Lt;BLt;)[Lja;", line = 56)
    public static final class20[] method50(class31 arg0, class35 arg1, byte arg2, class35 arg3) {
        int var4 = arg0.method173(arg3, -31939);
        if (arg2 != 18) {
            method49(-9);
        }
        int var5 = arg0.method176(var4, true, arg1);
        return class27.method151(var4, var5, false, arg0);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Z)V", line = 81)
    public final void method51(boolean arg0) {
        boolean var2 = arg0;
        if (this.field102 == null) {
            return;
        }
        this.field104 = this.field102[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field102[var3] != this.field104) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field102 = null;
        }
    }
}
