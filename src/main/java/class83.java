import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class83 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 10)
    public static final void method601(int[] arg0, Object[] arg1, int arg2) {
        field1186++;
        class247.method1667(arg0, arg1, (byte) -103, 0, arg0.length + arg2);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V", line = 18)
    public static final void method602(int arg0, byte arg1) {
        if (arg1 == -79) {
            class348.field4780 = arg0;
            field1190++;
            class243.field3449.method905((byte) 40);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)Lco;", line = 30)
    public static final class62 method603(byte arg0) {
        field1189++;
        if (arg0 != -102) {
            return null;
        } else if (class354.field4833 == null || class100.field1380 == null) {
            return null;
        } else {
            for (class62 var1 = (class62) class100.field1380.method2727((byte) 99); var1 != null; var1 = (class62) class100.field1380.method2727((byte) 125)) {
                class25 var2 = class328.method2113(var1.field851, (byte) -125);
                if (var2 != null && var2.field452 && var2.method298((byte) 31)) {
                    return var1;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 63)
    public static final byte[] method604(String arg0, byte arg1) {
        field1184++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != -100) {
            method601((int[]) null, (Object[]) null, -35);
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

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 201)
    public static final void method605(int arg0) {
        field1187++;
        for (int var1 = 0; var1 < 5; var1++) {
            class161.field2247[var1] = false;
        }
        int var2 = 78 % ((-arg0 - 5) / 56);
        class335.field4609 = 0;
        class18.field322 = -1;
        class211.field2955 = 0;
        class282.field3996 = -1;
        class128.field1807 = 1;
    }
}
