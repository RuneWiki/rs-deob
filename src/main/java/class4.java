import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class4 extends class83 implements class116 {

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "Lmt;")
    public class83 field39;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Lpn;")
    public static class72 field45 = new class72(3, -1);

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field52 = -1;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "Lg;")
    public static class470 field51;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)I", line = 3)
    public final int method16(boolean arg0) {
        field34++;
        if (arg0) {
            field51 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)I", line = 14)
    public final int method17(int arg0) {
        field32++;
        if (arg0 != -8960) {
            method25(false, (String) null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(ILoj;)V", line = 25)
    public final void method18(int arg0, class280 arg1) {
        int var3 = 122 / ((arg0 - 62) / 63);
        field40++;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIIIILmt;)V", line = 34)
    public class4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class83 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class79.method399((byte) -16, arg1, arg0));
        this.field39 = arg10;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(ILoj;)Lmg;", line = 46)
    public final class451 method19(int arg0, class280 arg1) {
        field50++;
        if (arg0 <= 95) {
            this.field39 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILoj;)V", line = 57)
    public final void method20(int arg0, class280 arg1) {
        if (arg0 != 5744) {
            this.method26((byte) 104);
        }
        field43++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILoj;B)Lqh;", line = 69)
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        field36++;
        if (arg2 != -98) {
            this.field39 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)Z", line = 81)
    public final boolean method22(int arg0) {
        field33++;
        return arg0 > -32 ? false : false;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZLa;IBLoj;)V", line = 98)
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        field46++;
        if (arg5 != -65) {
            this.method18(-115, (class280) null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 109)
    public final void method24(int arg0) {
        if (arg0 <= 41) {
            this.method19(-101, (class280) null);
        }
        field49++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLjava/lang/String;)[B", line = 121)
    public static final byte[] method25(boolean arg0, String arg1) {
        if (arg0) {
            field52 = 55;
        }
        field38++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
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

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I", line = 259)
    public final int method26(byte arg0) {
        if (arg0 != 73) {
            field52 = 64;
        }
        field41++;
        return 0;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(ILoj;)V", line = 273)
    public final void method27(int arg0, class280 arg1) {
        field44++;
        if (arg0 != 0) {
            this.method31((byte) 102);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILoj;II)Z", line = 284)
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        if (arg3 != -6085) {
            field52 = -121;
        }
        field42++;
        return false;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V", line = 295)
    public static void method29(byte arg0) {
        if (arg0 <= 19) {
            method29((byte) -95);
        }
        field51 = null;
        field45 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLab;)Lab;", line = 306)
    public static final class256 method30(byte arg0, class256 arg1) {
        int var2 = 85 / ((44 - arg0) / 51);
        field47++;
        if (arg1.field3646 != -1) {
            return class399.method2387(arg1.field3646, -1857167024);
        }
        int var3 = arg1.field3659 >>> 16;
        class464 var4 = new class464(class369.field5270);
        for (class68 var5 = (class68) var4.method2731(0); var5 != null; var5 = (class68) var4.method2728(-1)) {
            if (var5.field850 == var3) {
                return class399.method2387((int) var5.field1776, -1857167024);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)I", line = 336)
    public final int method31(byte arg0) {
        field37++;
        int var2 = 52 % ((-arg0 - 23) / 35);
        return 0;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 347)
    public final void method32(int arg0) {
        field48++;
        if (arg0 != -2) {
            field52 = -61;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Z", line = 357)
    public final boolean method33(int arg0) {
        if (arg0 != 1957) {
            this.method16(true);
        }
        field35++;
        return false;
    }
}
