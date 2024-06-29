import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class264 {

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Z")
    public boolean field4108 = false;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "J")
    public static long field4110 = 0L;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "[[[B")
    public static byte[][][] field4104;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V", line = 15)
    public static final void method1799(int arg0, int arg1) {
        field4103++;
        class137 var2 = (class137) class281.field4320.method1222(arg0, (long) arg1);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field2158.length; var3++) {
                var2.field2158[var3] = -1;
                var2.field2159[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZBI)Lin;", line = 39)
    public final class168 method1800(boolean arg0, byte arg1, int arg2) {
        field4112++;
        class168 var4 = (class168) class257.field4031.method2179(false, (long) ((arg0 ? 262144 : 0) | this.field4102 | arg2 << 16));
        if (var4 != null) {
            return var4;
        }
        class279.field4304.method956(this.field4102, true);
        class168 var5 = class213.method1500(class279.field4304, 101, 0, this.field4102);
        if (var5 != null) {
            var5.method1213(class20.field277, class173.field2620, class201.field3011);
            var5.field3975 = var5.field3980;
            var5.field3977 = var5.field3972;
            if (arg0) {
                var5.method1207();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1203();
            }
            class257.field4031.method2173(var5, true, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field4102));
        }
        if (arg1 >= -52) {
            this.field4109 = -94;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ll;ILte;Ll;Z)V", line = 75)
    public static final void method1801(class133 arg0, int arg1, class124 arg2, class133 arg3, boolean arg4) {
        if (arg1 != -15596) {
            method1801((class133) null, 82, (class124) null, (class133) null, false);
        }
        class71.field1173 = arg0;
        field4100++;
        class71.field1171 = arg3;
        class344.field5338 = arg4;
        int var5 = class71.field1171.method981((byte) -64) - 1;
        class186.field2786 = class71.field1171.method954(-24001, var5) + var5 * 256;
        class181.field2735 = arg2;
        class37.field572 = new String[] { null, null, null, null, class213.field3254 };
        class75.field1208 = new String[] { null, null, class258.field4050, null, null };
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 100)
    public static void method1802(byte arg0) {
        if (arg0 >= 104) {
            field4104 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BIILkh;)V", line = 110)
    private final void method1803(byte arg0, int arg1, int arg2, class166 arg3) {
        if (arg0 > -120) {
            return;
        }
        if (arg1 == 1) {
            this.field4102 = arg3.method1151(-126);
        } else if (arg1 == 2) {
            this.field4109 = arg3.method1156((byte) 115);
        } else if (arg1 == 3) {
            this.field4108 = true;
        } else if (arg1 == 4) {
            this.field4102 = -1;
        }
        field4101++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILkh;B)V", line = 141)
    public final void method1804(int arg0, class166 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method1178(arg2 - 109);
            if (var4 == 0) {
                field4111++;
                if (arg2 != 109) {
                    this.method1800(true, (byte) 59, 22);
                }
                return;
            }
            this.method1803((byte) -127, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 160)
    public static final void method1805(int arg0, String arg1, int arg2) {
        field4107++;
        class338 var3 = class195.method1391(2, (byte) -92, arg0);
        if (arg2 != -1) {
            field4098 = -88;
        }
        var3.method2352((byte) 127);
        var3.field5293 = arg1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 185)
    public static final byte[] method1806(byte arg0, String arg1) {
        int var2 = arg1.length();
        field4106++;
        byte[] var3 = new byte[var2];
        if (arg0 >= -127) {
            method1806((byte) 78, (String) null);
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

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZII)V", line = 324)
    public static final void method1807(boolean arg0, int arg1, int arg2) {
        field4099++;
        class30.field443 = (float) arg1;
        if (class178.field2692 == 2) {
            class194.field2897 = arg1;
            class218.field3323 = arg2;
        }
        class259.field4063 = (float) arg2;
        class108.method795((byte) 115);
        class232.field3672 = arg0;
    }
}
