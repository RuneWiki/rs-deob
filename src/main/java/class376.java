import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class376 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field5861 = new String[100];

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public int field5858;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public int field5859;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public int field5860;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(CI)B")
    public static final byte method2389(char arg0, int arg1) {
        field5864++;
        if (arg1 != 352) {
            field5861 = null;
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

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLia;)V")
    public final void method2390(boolean arg0, class23 arg1) {
        while (true) {
            int var3 = arg1.method126((byte) -74);
            if (var3 == 0) {
                field5862++;
                if (arg0) {
                    field5861 = null;
                    return;
                }
                return;
            }
            this.method2391(var3, arg1, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILia;B)V")
    private final void method2391(int arg0, class23 arg1, byte arg2) {
        field5863++;
        if (arg2 != -121) {
            this.method2391(98, null, (byte) -22);
        }
        if (arg0 == 1) {
            this.field5860 = arg1.method132(116);
            this.field5859 = arg1.method126((byte) -96);
            this.field5858 = arg1.method126((byte) -101);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method2392(byte arg0) {
        field5861 = null;
        if (arg0 != -25) {
            field5861 = null;
        }
    }
}
