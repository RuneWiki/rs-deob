import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class111 {

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field1728 = 0;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "[I")
    public static int[] field1732 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[Lwj;")
    public static class270[] field1721;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I", line = 4)
    public static final int method825(byte arg0) {
        if (arg0 < 115) {
            return 49;
        } else {
            field1727++;
            return ((class289.field4502 == 0 ? 0 : 1) << 21) + ((class300.field4691 ? 1 : 0) << 15) + ((class208.field3191 ? 1 : 0) << 13) + (class289.field4509 & 0x3 << 11) + ((class217.field3303 ? 1 : 0) << 10) + ((class232.field3674 ? 1 : 0) << 9) + (((class274.field4244 ? 1 : 0) << 8) + ((class260.field4071 ? 1 : 0) << 5) + ((class242.field3876 ? 1 : 0) << 3) + (class289.field4507 & 0x7) + ((class289.field4503 ? 1 : 0) << 4) - (-((class59.field962 ? 1 : 0) << 6) - ((class170.field2565 ? 1 : 0) << 7)) - (-((class152.field2291 ? 1 : 0) << 16) - ((class331.field5144 << 17) + ((class188.field2815 ? 1 : 0) << 19) + ((class1.field20 == 0 ? 0 : 1) << 20)) - (((class201.field3016 == 0 ? 0 : 1) << 22) - -(class64.method488() << 23))));
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V", line = 15)
    public static final void method826(int arg0, int arg1, int arg2) {
        field1730++;
        if (arg1 == 23150) {
            class338 var3 = class195.method1391(6, (byte) -92, arg0);
            var3.method2352((byte) 126);
            var3.field5279 = arg2;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIILjava/lang/String;I[B)I", line = 34)
    public static final int method827(int arg0, int arg1, int arg2, String arg3, int arg4, byte[] arg5) {
        field1723++;
        int var6 = arg2 - arg0;
        if (arg1 != -8226) {
            method828(75, true, -32, -85, 62, -80, 16, 1.3604107F, (byte) -79);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg4 + var7] = -97;
            } else {
                arg5[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIIIIIFB)[[I", line = 176)
    public static final int[][] method828(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, byte arg8) {
        field1726++;
        if (arg8 < 28) {
            method827(19, -59, -75, (String) null, 127, (byte[]) null);
        }
        int[][] var9 = new int[arg3][arg6];
        class331 var10 = new class331();
        var10.field5149 = arg1;
        var10.field5142 = arg2;
        var10.field5138 = arg5;
        var10.field5150 = (int) (arg7 * 4096.0F);
        var10.field5155 = arg0;
        var10.method381(83);
        class80.method577(arg3, 0, arg6);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method2295(false, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 217)
    public static void method829(int arg0) {
        field1732 = null;
        field1721 = null;
        if (arg0 != 1) {
            field1728 = -15;
        }
    }
}
