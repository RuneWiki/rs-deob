import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public abstract class class598 {

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field8403 = 0;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "Lrga;")
    public static class280 field8404 = new class280(2, -1);

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "Ldt;")
    public static class223 field8405;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Z")
    public static boolean field8399;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public abstract void method455(byte arg0);

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)Z")
    public abstract boolean method448(byte arg0, int arg1);

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BC)B")
    public static final byte method3286(byte arg0, char arg1) {
        if (arg0 != 99) {
            method3286((byte) 86, '\u000f');
        }
        field8400++;
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

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)V")
    public static void method3287(byte arg0) {
        field8405 = null;
        if (arg0 == -123) {
            field8404 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)V")
    public abstract void method451(byte arg0);

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IB)V")
    public static final void method3288(int arg0, byte arg1) {
        if (arg0 == 37) {
            class656.field9248 = 3.0F;
        } else if (arg0 == 50) {
            class656.field9248 = 4.0F;
        } else if (arg0 == 75) {
            class656.field9248 = 6.0F;
        } else if (arg0 == 100) {
            class656.field9248 = 8.0F;
        } else if (arg0 == 200) {
            class656.field9248 = 16.0F;
        }
        if (arg1 == -123) {
            class330.field4217 = -1;
            field8402++;
            class330.field4217 = -1;
        }
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(B)Lau;")
    public abstract class521 method456(byte arg0);
}
