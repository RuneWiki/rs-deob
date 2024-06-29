import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class9 {

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Z")
    public boolean field195 = true;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field197 = 64;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "[I")
    public static int[] field201 = new int[32];

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Lgi;")
    public static class164 field198;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Lgi;")
    public static class164 field200;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BC)B")
    public static final byte method83(byte arg0, char arg1) {
        field193++;
        if (arg0 != -18) {
            return 54;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method84(byte arg0) {
        field200 = null;
        field198 = null;
        if (arg0 < 61) {
            field198 = null;
        }
        field201 = null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field195 = arg6;
        this.field192 = arg3;
        this.field190 = arg4;
        this.field196 = arg1;
        this.field191 = arg2;
        this.field194 = arg5;
        this.field199 = arg0;
    }
}
