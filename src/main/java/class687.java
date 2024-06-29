import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class687 extends class735 {

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "Lpja;")
    public static class43 field9553 = new class43(10);

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    private int field9546;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    private int field9547;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    private int field9550;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
    private int field9552;

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "Lgj;")
    public static class662 field9554;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "[Lel;")
    public static class574[] field9555;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(CB)B", line = 3)
    public static final byte method3863(char arg0, byte arg1) {
        field9551++;
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
        int var3 = -61 / ((arg1 + 37) / 48);
        return var2;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILfca;)V", line = 127)
    public final void method627(int arg0, class93 arg1) {
        field9549++;
        this.field9546 = arg1.method773(3);
        this.field9550 = arg1.method773(arg0 - 2);
        this.field9552 = arg1.method793((byte) 113);
        this.field9547 = arg1.method793((byte) 115);
        if (arg0 != 5) {
            method3863((char) 65507, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lrh;Z)V", line = 146)
    public final void method624(class280 arg0, boolean arg1) {
        field9548++;
        if (arg1) {
            method3863((char) 65410, (byte) -61);
        }
        arg0.method1803(this.field9552, this.field9547, this.field9546, this.field9550, -32088);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 161)
    public static void method3864(int arg0) {
        field9553 = null;
        field9554 = null;
        field9555 = null;
        if (arg0 != -22271) {
            method3864(75);
        }
    }
}
