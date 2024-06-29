import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class278 {

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lqia;")
    public static class547 field3517 = new class547();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field3520;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field3521;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3529;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 3)
    public static void method1664(byte arg0) {
        field3517 = null;
        if (arg0 != -117) {
            field3529 = null;
        }
        field3529 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(CB)B", line = 14)
    public static final byte method1665(char arg0, byte arg1) {
        field3523++;
        if (arg1 != 59) {
            field3517 = null;
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

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)V", line = 139)
    public static final void method1666(int arg0, byte arg1) {
        if (arg1 != -101) {
            return;
        }
        class495.field6999 = new int[arg0];
        class751.field10506 = new int[arg0];
        field3518++;
        class733.field10243 = new int[arg0];
        class613.field8589 = new int[arg0];
        class264.field3346 = new int[arg0];
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ll;I)Z", line = 171)
    public final boolean method1667(class278 arg0, int arg1) {
        field3513++;
        if (this.field3520 == arg0.field3520 && this.field3526 == arg0.field3526 && this.field3527 == arg0.field3527) {
            return true;
        } else {
            if (arg1 != 8221) {
                this.field3525 = 2;
            }
            return false;
        }
    }
}
