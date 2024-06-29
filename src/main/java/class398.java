import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class398 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field5647 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
    public static boolean field5648 = false;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Z")
    public static boolean field5649 = false;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
    public static final boolean method2383(int arg0, int arg1, int arg2) {
        field5651++;
        if (!class19.field260) {
            return false;
        }
        int var3 = arg2 >> 16;
        if (arg1 > -16) {
            return false;
        }
        int var4 = arg2 & 0xFFFF;
        if (class112.field1421[var3] == null || class112.field1421[var3][var4] == null) {
            return false;
        }
        class145 var5 = class112.field1421[var3][var4];
        if (arg0 == -1 && var5.field2073 == 0) {
            for (class451 var6 = (class451) class160.field2365.method2843(1123227612); var6 != null; var6 = (class451) class160.field2365.method2842(1673506446)) {
                if (var6.field6245 == 12 || var6.field6245 == 1004 || var6.field6245 == 8 || var6.field6245 == 11 || var6.field6245 == 2) {
                    for (class145 var7 = class166.method1028(var6.field6234, 103); var7 != null; var7 = class157.method986(var7, -24360)) {
                        if (var5.field1933 == var7.field1933) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class451 var8 = (class451) class160.field2365.method2843(1123227612); var8 != null; var8 = (class451) class160.field2365.method2842(1673506446)) {
                if (var8.field6236 == arg0 && var5.field1933 == var8.field6234 && (var8.field6245 == 12 || var8.field6245 == 1004 || var8.field6245 == 8 || var8.field6245 == 11 || var8.field6245 == 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method2384(String arg0, int arg1) {
        field5652++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != 2) {
            return null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
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

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static final void method2385(byte arg0) {
        if (class141.field1878 != null) {
            class437.field6070.method1447(50);
            class428.method2513();
            class304.method1885(872);
            class276.method1751((byte) -114);
            class485.method2833(5);
            class61.method385(26353);
            if (class146.field2100 != null) {
                class146.field2100.method1459((byte) -49);
            }
            class377.method2298(-10989);
            class145.method905(1);
            class282.method1782((byte) -99);
            class363.method2247((byte) 68, false);
            class304.method1884(-16357);
            for (int var1 = 0; var1 < 2048; var1++) {
                class452 var5 = class124.field1559[var1];
                if (var5 != null) {
                    var5.field2167 = null;
                    for (int var6 = 0; var6 < var5.field2161.length; var6++) {
                        var5.field2161[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class139.field1851.length; var2++) {
                class216 var3 = class139.field1851[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2161.length; var4++) {
                        var3.field2161[var4] = null;
                    }
                }
            }
            class141.field1878.method1936((byte) 105);
            class141.field1878 = null;
        }
        if (arg0 <= 29) {
            method2385((byte) -7);
        }
        field5650++;
    }
}
