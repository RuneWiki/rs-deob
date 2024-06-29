import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class49 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lwo;")
    public static class690 field823 = new class690(106, 8);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!vg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field824++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(CZ)B")
    public static final byte method545(char arg0, boolean arg1) {
        field825++;
        if (!arg1) {
            field823 = null;
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method546(int arg0) {
        if (arg0 != -13022) {
            method545('w', true);
        }
        field823 = null;
    }
}
