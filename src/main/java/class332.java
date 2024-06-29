import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class class332 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method2174(String arg0, byte arg1) {
        field4769++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != 59) {
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

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLw;)Lw;")
    public abstract class234 method1060(boolean arg0, class234 arg1);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILri;)I")
    public static final int method2175(int arg0, class98 arg1) {
        int var2 = 94 / ((arg0 + 45) / 33);
        field4766++;
        class11 var3 = arg1.field1545;
        if (var3.field135 != null) {
            var3 = var3.method75(0);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field162;
        class419 var5 = arg1.method2476((byte) 60);
        if (arg1.field5661) {
            var4 = var3.field190;
        } else if (arg1.field5642 == var5.field6081 || arg1.field5642 == var5.field6096 || arg1.field5642 == var5.field6116 || arg1.field5642 == var5.field6098) {
            var4 = var3.field178;
        } else if (arg1.field5642 == var5.field6103 || arg1.field5642 == var5.field6117 || arg1.field5642 == var5.field6086 || arg1.field5642 == var5.field6076) {
            var4 = var3.field124;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)I")
    public static final int method2176(boolean arg0) {
        field4767++;
        if ((double) class272.field4082 == 3.0D) {
            return 37;
        } else if ((double) class272.field4082 == 4.0D) {
            return 50;
        } else if ((double) class272.field4082 == 6.0D) {
            return 75;
        } else if ((double) class272.field4082 == 8.0D) {
            return 100;
        } else if (arg0) {
            return -7;
        } else {
            return 200;
        }
    }
}
