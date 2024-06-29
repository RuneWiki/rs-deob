import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class121 {

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "[B")
    public static byte[] field1818;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "Lob;")
    public static class521 field1825;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1829;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public static void method902(boolean arg0) {
        field1818 = null;
        field1825 = null;
        field1829 = null;
        if (!arg0) {
            method904(-86, 57);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IC)B")
    public static final byte method903(int arg0, char arg1) {
        if (arg0 != -8303) {
            method905(-67, -106, 94, (byte) 114, -76, -23);
        }
        field1814++;
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

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)Z")
    public static final boolean method904(int arg0, int arg1) {
        if (arg1 >= -108) {
            return false;
        } else {
            field1819++;
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIBII)V")
    public static final void method905(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1821++;
        int var6 = arg2 - arg5;
        int var7 = arg0 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class216.method1495(arg4, arg1, arg5, (byte) -109, arg2);
            }
        } else if (var6 == 0) {
            class346.method2155(arg5, arg0, arg1, arg4, -97);
        } else {
            if (arg3 <= 93) {
                field1827 = -106;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                int var10 = arg0;
                arg1 = arg5;
                arg0 = arg2;
                arg5 = var9;
                arg2 = var10;
            }
            if (arg1 > arg0) {
                int var11 = arg1;
                int var12 = arg5;
                arg1 = arg0;
                arg0 = var11;
                arg5 = arg2;
                arg2 = var12;
            }
            int var13 = arg5;
            int var14 = arg0 - arg1;
            int var15 = arg2 - arg5;
            int var16 = -(var14 >> 1);
            int var17 = arg2 <= arg5 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg1; var19 <= arg0; var19++) {
                    var16 += var15;
                    class416.field6200[var19][var13] = arg4;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg1; var18 <= arg0; var18++) {
                    class416.field6200[var13][var18] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)I")
    public static final int method906(int arg0, int arg1, int arg2) {
        field1824++;
        if (arg1 < 105) {
            field1818 = null;
        }
        return arg2 == 1 || arg2 == 3 ? class474.field6841[arg0 & 0x3] : class28.field334[arg0 & 0x3];
    }

    static {
        int var0 = 0;
        field1818 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1818[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field1825 = new class521(53, 8);
        field1826 = 20;
        field1829 = "";
        field1827 = 0;
    }
}
