import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class355 extends class37 {

    @OriginalMember(owner = "client!o", name = "y", descriptor = "B")
    public byte field4560 = 5;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Lhb;")
    public static class250 field4561 = new class250(74, -1);

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Lpi;")
    public static class340 field4564 = new class340(95, 8);

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field4565 = 0;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public int field4553;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public int field4557;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "Z")
    public boolean field4559;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "[I")
    public static int[] field4566;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V", line = 3)
    public static void method2079(int arg0) {
        if (arg0 == -18139) {
            field4566 = null;
            field4561 = null;
            field4564 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(CI)B", line = 17)
    public static final byte method2080(char arg0, int arg1) {
        if (arg1 != -8219) {
            method2081(null, null, null, 35, -2, -125, null, 50);
        }
        field4563++;
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

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lv;Lqa;Ltn;IIILcc;I)V", line = 142)
    public static final void method2081(class455 arg0, class129 arg1, class429 arg2, int arg3, int arg4, int arg5, class343 arg6, int arg7) {
        int var8 = 116 % ((-arg7 - 60) / 38);
        field4554++;
        int var9 = arg6.field4364 - (arg4 / 2) - 5;
        int var10 = arg3 + 2;
        if (arg2.field5887 != 0) {
            arg1.method866(arg5 * arg0.method2700() + arg3 + 1 - var10, -5152, var9, arg4 + 10, var10, arg2.field5887);
        }
        if (arg2.field5920 != 0) {
            arg1.method902(arg2.field5920, var10, arg5 * arg0.method2700() + (arg3 - var10) + 1, arg4 + 10, var9, -125);
        }
        int var11 = arg2.field5894;
        if (arg6.field4362 && arg2.field5881 != -1) {
            var11 = arg2.field5881;
        }
        for (int var12 = 0; var12 < arg5; var12++) {
            String var13 = class431.field5942[var12];
            if (var12 < (arg5 - 1)) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg0.method2695(arg1, var13, arg6.field4364, arg3, var11, true);
            arg3 += arg0.method2700();
        }
    }
}
