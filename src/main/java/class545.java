import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class545 implements class432 {

    @OriginalMember(owner = "client!hha", name = "i", descriptor = "Luq;")
    private class172 field7537;

    @OriginalMember(owner = "client!hha", name = "h", descriptor = "Ljava/lang/String;")
    private String field7536;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7534 = null;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "Ljb;")
    public static class519 field7531 = new class519(6, -2);

    @OriginalMember(owner = "client!hha", name = "j", descriptor = "Laka;")
    public static class86 field7538 = new class86("RC", 1);

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "F")
    public static float field7532;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!hha", name = "k", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "[Lhh;")
    public static class140[] field7530;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V")
    public static void method3140(int arg0) {
        field7530 = null;
        if (arg0 == -8483) {
            field7531 = null;
            field7534 = null;
            field7538 = null;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IC)B")
    public static final byte method3141(int arg0, char arg1) {
        field7533++;
        if (arg0 <= 87) {
            method3141(-45, '\u0017');
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

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)I")
    public final int method1777(boolean arg0) {
        field7539++;
        if (!arg0) {
            this.method1777(false);
        }
        return this.field7537.method1159(this.field7536, (byte) 127) ? 100 : this.field7537.method1172(this.field7536, 122);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)Lkt;")
    public final class168 method1775(int arg0) {
        field7535++;
        if (arg0 <= 85) {
            method3142(-23, 50, -73, true, -101, -1, (byte) -109);
        }
        return class168.field2211;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIIZIIB)V")
    public static final void method3142(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        class342.field4791 = arg2;
        class351.field5123 = arg1;
        class324.field4607 = arg0;
        field7529++;
        class10.field110 = arg5;
        class278.field4013 = arg4;
        if (arg3 && class324.field4607 >= 100) {
            class223.field2892 = class278.field4013 * 512 + 256;
            class435.field6273 = class342.field4791 * 512 + 256;
            class269.field3926 = class778.method4273(class223.field2892, (byte) -105, class435.field6273, class184.field2420) - class351.field5123;
        }
        class609.field8242 = -1;
        class702.field9303 = -1;
        class697.field9252 = 2;
        if (arg6 <= 17) {
            method3140(104);
        }
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Luq;Ljava/lang/String;)V")
    public class545(class172 arg0, String arg1) {
        this.field7537 = arg0;
        this.field7536 = arg1;
    }
}
