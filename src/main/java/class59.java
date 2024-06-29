import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class59 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field704 = -1;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Z")
    public static boolean field711 = false;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field709;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method375(int arg0, String arg1) {
        field705++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 >= -48) {
            method378(124, (byte) -47);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method376(int arg0) {
        if (arg0 == -29281) {
            field709 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lqa;Ldda;BLdda;)V")
    public static final void method377(class167 arg0, class597 arg1, byte arg2, class597 arg3) {
        field706++;
        class63.field735 = class510.method3046(class94.field1171, arg3, 0, -6724);
        class463.field6700 = arg0.method998(class63.field735, class610.method3547(arg1, class94.field1171, 0), true);
        class519.field7716 = class510.method3046(class297.field4346, arg3, 0, arg2 - 6732);
        class259.field3800 = arg0.method998(class519.field7716, class610.method3547(arg1, class297.field4346, 0), true);
        class511.field7585 = class510.method3046(class264.field3927, arg3, 0, -6724);
        class179.field2757 = arg0.method998(class511.field7585, class610.method3547(arg1, class264.field3927, 0), true);
        if (arg2 != 8) {
            method375(-26, null);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
    public static final void method378(int arg0, byte arg1) {
        field707++;
        if (arg0 == -1 || !class43.field521[arg0]) {
            return;
        }
        if (arg1 <= 27) {
            method375(-128, null);
        }
        class145.field1879.method3480(true, arg0);
        class251.field3650[arg0] = null;
        class14.field123[arg0] = null;
        class43.field521[arg0] = false;
    }
}
