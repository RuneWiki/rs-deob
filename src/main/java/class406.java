import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class406 {

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lda;")
    public class443 field5587 = null;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Lrt;")
    public class470 field5593 = null;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lsv;")
    public static class570 field5583 = new class570(81, 8);

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static final void method2401(byte arg0) {
        field5588++;
        int var1 = -114 % ((arg0 - 72) / 45);
        class180.method1313(false, 25932);
        if (class622.field8777 >= 0 && class622.field8777 != 0) {
            class636.method3625(false, class622.field8777, -84);
            class622.field8777 = -1;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method2402(int arg0) {
        if (arg0 <= 93) {
            field5589 = -77;
        }
        field5583 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Luf;IBLaa;IIILmq;)V")
    public static final void method2403(class519 arg0, int arg1, byte arg2, class88 arg3, int arg4, int arg5, int arg6, class85 arg7) {
        field5585++;
        if (arg7 == null) {
            return;
        }
        int var8;
        if (class783.field10725 == 4) {
            var8 = (int) class98.field1423 & 0x3FFF;
        } else {
            var8 = (int) class98.field1423 + class654.field9251 & 0x3FFF;
        }
        int var9 = Math.max(arg0.field7128 / 2, arg0.field7255 / 2) + 10;
        int var10 = arg5 * arg5 + arg6 * arg6;
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = -51 / ((arg2 + 27) / 44);
        int var12 = class253.field3634[var8];
        int var13 = class253.field3633[var8];
        if (class783.field10725 != 4) {
            var13 = var13 * 256 / (class592.field8487 + 256);
            var12 = var12 * 256 / (class592.field8487 + 256);
        }
        int var14 = arg5 * var12 + arg6 * var13 >> 14;
        int var15 = arg5 * var13 - arg6 * var12 >> 14;
        arg7.method9(arg0.field7128 / 2 + arg1 + var14 - (arg7.method11() / 2), -var15 + arg4 + (arg0.field7255 / 2 - arg7.method14() / 2), arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(CZ)B")
    public static final byte method2404(char arg0, boolean arg1) {
        field5584++;
        if (arg1) {
            return 75;
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

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)I")
    public static final int method2405(boolean arg0, byte arg1) {
        field5592++;
        if (class40.field468 == null) {
            return 0;
        } else if (arg0 || class208.field3039 == null) {
            int var2 = 0;
            if (arg1 != -117) {
                method2402(121);
            }
            for (int var3 = 0; var3 < class40.field468.length; var3++) {
                int var4 = class40.field468[var3];
                if (class651.field9226.method3005(var4, (byte) -69)) {
                    var2++;
                }
                if (class447.field6172.method3005(var4, (byte) -69)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class40.field468.length * 2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lda;)V")
    public class406(class443 arg0) {
        this.field5587 = arg0;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lda;Lrt;)V")
    public class406(class443 arg0, class470 arg1) {
        this.field5587 = arg0;
        this.field5593 = arg1;
    }
}
