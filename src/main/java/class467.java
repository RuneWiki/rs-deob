import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class467 {

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    private int field7171;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[Lbp;")
    private class251[] field7162;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lsk;")
    public static class423 field7159 = new class423(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "F")
    public static float field7170;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "J")
    private long field7163;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lbp;")
    private class251 field7161;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Llt;")
    public static class458 field7166;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[Z")
    public static boolean[] field7164;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)Lbp;", line = 3)
    public final class251 method2824(long arg0, int arg1) {
        if (arg1 >= -54) {
            method2826(-40);
        }
        field7168++;
        this.field7163 = arg0;
        class251 var4 = this.field7162[(int) ((long) (this.field7171 - 1) & arg0)];
        for (this.field7161 = var4.field3842; this.field7161 != var4; this.field7161 = this.field7161.field3842) {
            if (this.field7161.field3839 == arg0) {
                class251 var5 = this.field7161;
                this.field7161 = this.field7161.field3842;
                return var5;
            }
        }
        this.field7161 = null;
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IC)B", line = 36)
    public static final byte method2825(int arg0, char arg1) {
        if (arg0 != 338) {
            method2826(55);
        }
        field7167++;
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

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 174)
    public static void method2826(int arg0) {
        field7166 = null;
        field7164 = null;
        field7159 = null;
        if (arg0 > -32) {
            field7166 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Lbp;", line = 193)
    public final class251 method2827(int arg0) {
        field7169++;
        if (this.field7161 == null) {
            return null;
        }
        class251 var2 = this.field7162[(int) ((long) (this.field7171 - 1) & this.field7163)];
        while (this.field7161 != var2) {
            if (this.field7161.field3839 == this.field7163) {
                class251 var3 = this.field7161;
                this.field7161 = this.field7161.field3842;
                return var3;
            }
            this.field7161 = this.field7161.field3842;
        }
        if (arg0 == 19408) {
            this.field7161 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 232)
    public static final void method2828(boolean arg0) {
        field7165++;
        if (class316.field4761) {
            return;
        }
        if (class463.field7116.field2961) {
            class23.field289 = ((int) class23.field289 + 191 & 0xFFFFFF80);
        } else {
            class407.field5917 += (24.0F - class407.field5917) / 2.0F;
        }
        class7.field81 = true;
        class316.field4761 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLbp;J)V", line = 254)
    public final void method2829(byte arg0, class251 arg1, long arg2) {
        if (arg1.field3837 != null) {
            arg1.method1512((byte) 123);
        }
        field7160++;
        class251 var5 = this.field7162[(int) (arg2 & (long) (this.field7171 - 1))];
        arg1.field3842 = var5;
        if (arg0 != -118) {
            field7159 = null;
        }
        arg1.field3837 = var5.field3837;
        arg1.field3837.field3842 = arg1;
        arg1.field3839 = arg2;
        arg1.field3842.field3837 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V", line = 276)
    public class467(int arg0) {
        this.field7171 = arg0;
        this.field7162 = new class251[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class251 var3 = this.field7162[var2] = new class251();
            var3.field3837 = var3;
            var3.field3842 = var3;
        }
    }
}
