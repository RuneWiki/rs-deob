import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class420 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lbn;")
    public static class160 field6081 = new class160(22, 3);

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field6085 = -1;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
    public static int[] field6084 = new int[2048];

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lbn;")
    public static class160 field6083 = new class160(21, 16);

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lbn;")
    public static class160 field6086 = new class160(71, 7);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lvq;")
    public static class24 field6087 = new class24(78, 6);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IC)B")
    public static final byte method2594(int arg0, char arg1) {
        field6080++;
        byte var2;
        if (arg1 > '\u0000' && arg1 < '\u0080' || arg1 >= ' ' && arg1 <= 'ÿ') {
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
        if (arg0 > -37) {
            method2597(true, (class104) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method2595(int arg0) {
        field6084 = null;
        field6086 = null;
        field6087 = null;
        if (arg0 == -1) {
            field6083 = null;
            field6081 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lmc;")
    public abstract class326 method2002(byte arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
    public abstract void method1999(byte arg0, int arg1);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
    public abstract int method2006(int arg0, int arg1);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public static final void method2596(int arg0, int arg1, int arg2) {
        field6082++;
        if ((class66.field853 < class66.field851)) {
            class66.field853 = (float) ((double) class66.field853 / 30.0D + (double) class66.field853);
            if (class66.field853 > class66.field851) {
                class66.field853 = class66.field851;
            }
            class132.method884(-1);
            class66.field858 = (int) class66.field853 >> 1;
            class66.field852 = class86.method582((byte) -39, class66.field858);
        } else if (class66.field851 < class66.field853) {
            class66.field853 = (float) ((double) class66.field853 - (double) class66.field853 / 30.0D);
            if (class66.field851 > class66.field853) {
                class66.field853 = class66.field851;
            }
            class132.method884(arg1 - 1);
            class66.field858 = (int) class66.field853 >> 1;
            class66.field852 = class86.method582((byte) -39, class66.field858);
        }
        if (class71.field929 != -1 && class4.field68 != -1) {
            int var3 = class71.field929 - class344.field5064;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class4.field68 - class134.field1843;
            class344.field5064 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (var3 == 0 && var4 == 0) {
                class71.field929 = -1;
                class4.field68 = -1;
            }
            class134.field1843 += var4;
            class132.method884(-1);
        }
        if (class151.field2052 <= arg1) {
            class178.field2538 = -1;
            class166.field2196 = -1;
        } else {
            class267.field3966--;
            if (class267.field3966 == 0) {
                class151.field2052--;
                class267.field3966 = 100;
            }
        }
        if (!class368.field5318 || class223.field3243 == null) {
            return;
        }
        for (class132 var5 = (class132) class223.field3243.method2478(arg1 ^ 0x643); var5 != null; var5 = (class132) class223.field3243.method2486((byte) -82)) {
            class110 var6 = class443.method2721(-12, var5.field1807.field5483);
            if (class196.field2780 == 0 && var5.method886(arg2, arg0, arg1 - 10546)) {
                if (var6.field1510 != null) {
                    if (var6.field1510[4] != null) {
                        class463.method2862(-1, 0, false, true, var6.field1510[4], (long) var5.field1807.field5483, var6.field1515, (byte) -117, 1012, var6.field1530);
                    }
                    if (var6.field1510[3] != null) {
                        class463.method2862(-1, 0, false, true, var6.field1510[3], (long) var5.field1807.field5483, var6.field1515, (byte) -128, 1007, var6.field1530);
                    }
                    if (var6.field1510[2] != null) {
                        class463.method2862(-1, 0, false, true, var6.field1510[2], (long) var5.field1807.field5483, var6.field1515, (byte) -120, 1009, var6.field1530);
                    }
                    if (var6.field1510[1] != null) {
                        class463.method2862(-1, 0, false, true, var6.field1510[1], (long) var5.field1807.field5483, var6.field1515, (byte) -98, 1003, var6.field1530);
                    }
                    if (var6.field1510[0] != null) {
                        class463.method2862(-1, 0, false, true, var6.field1510[0], (long) var5.field1807.field5483, var6.field1515, (byte) -121, 1008, var6.field1530);
                    }
                }
                if (!var5.field1807.field5486) {
                    var5.field1807.field5486 = true;
                    class107.method763(class423.field6111, var5.field1807.field5483, var6.field1530);
                }
                if (var5.field1807.field5486) {
                    class107.method763(class99.field1232, var5.field1807.field5483, var6.field1530);
                }
            } else if (var5.field1807.field5486) {
                var5.field1807.field5486 = false;
                class107.method763(class42.field561, var5.field1807.field5483, var6.field1530);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method2007(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLct;)V")
    public static final void method2597(boolean arg0, class104 arg1) {
        if (!arg0) {
            class416.field6020 = arg1;
            field6079++;
            class257.field3803 = class416.field6020.method734(69, 16);
        }
    }
}
