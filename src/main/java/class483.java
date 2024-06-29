import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class483 {

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "Lke;")
    public static class622 field6860 = new class622(57, 4);

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "Ljo;")
    public static class351 field6861 = new class351(27, 3);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public int field6858;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public int field6859;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Lda;")
    public static class67 field6862;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "Lab;")
    public static class696 field6864;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V", line = 4)
    public static void method2828(byte arg0) {
        field6862 = null;
        field6860 = null;
        field6861 = null;
        field6864 = null;
        if (arg0 != 113) {
            field6860 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BC)B", line = 18)
    public static final byte method2829(byte arg0, char arg1) {
        field6857++;
        if (arg0 != -83) {
            method2830(-125);
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

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 146)
    public static final void method2830(int arg0) {
        if (arg0 == 6169) {
            field6856++;
            class673.method3820((byte) -34);
            class607.field8578 = false;
        }
    }
}
