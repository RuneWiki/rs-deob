import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class242 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lpf;")
    public static class294 field3630;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    public static final void method1528(int arg0, int arg1) {
        if (arg1 < 80) {
            field3630 = null;
        }
        if (class282.field4211 == 0) {
            class86.field1383.method263(arg0, (byte) 78);
        } else {
            class45.field708 = arg0;
        }
        field3631++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI)V")
    public static final void method1529(boolean arg0, int arg1) {
        class241.field3604.method1780(arg1, arg0);
        field3633++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method1530(String arg0, int arg1) {
        field3628++;
        int var2 = arg0.length();
        int var3 = 45 % ((86 - arg1) / 36);
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var4[var5] = (byte) var6;
            } else if (var6 == '€') {
                var4[var5] = -128;
            } else if (var6 == '‚') {
                var4[var5] = -126;
            } else if (var6 == 'ƒ') {
                var4[var5] = -125;
            } else if (var6 == '„') {
                var4[var5] = -124;
            } else if (var6 == '…') {
                var4[var5] = -123;
            } else if (var6 == '†') {
                var4[var5] = -122;
            } else if (var6 == '‡') {
                var4[var5] = -121;
            } else if (var6 == 'ˆ') {
                var4[var5] = -120;
            } else if (var6 == '‰') {
                var4[var5] = -119;
            } else if (var6 == 'Š') {
                var4[var5] = -118;
            } else if (var6 == '‹') {
                var4[var5] = -117;
            } else if (var6 == 'Œ') {
                var4[var5] = -116;
            } else if (var6 == 'Ž') {
                var4[var5] = -114;
            } else if (var6 == '‘') {
                var4[var5] = -111;
            } else if (var6 == '’') {
                var4[var5] = -110;
            } else if (var6 == '“') {
                var4[var5] = -109;
            } else if (var6 == '”') {
                var4[var5] = -108;
            } else if (var6 == '•') {
                var4[var5] = -107;
            } else if (var6 == '–') {
                var4[var5] = -106;
            } else if (var6 == '—') {
                var4[var5] = -105;
            } else if (var6 == '˜') {
                var4[var5] = -104;
            } else if (var6 == '™') {
                var4[var5] = -103;
            } else if (var6 == 'š') {
                var4[var5] = -102;
            } else if (var6 == '›') {
                var4[var5] = -101;
            } else if (var6 == 'œ') {
                var4[var5] = -100;
            } else if (var6 == 'ž') {
                var4[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method1531(int arg0) {
        field3630 = null;
        if (arg0 != -161) {
            method1531(-102);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Lje;")
    public static final class187 method1532(byte arg0) {
        if (arg0 > -127) {
            field3630 = null;
        }
        field3632++;
        class187 var1 = (class187) class272.field4089.method367(101);
        if (var1 != null) {
            var1.method538(117);
            var1.method4((byte) -55);
            return var1;
        }
        class187 var2;
        do {
            var2 = (class187) class32.field468.method367(97);
            if (var2 == null) {
                return null;
            }
            if (var2.method1159(28965) > class263.method1754(123)) {
                return null;
            }
            var2.method538(118);
            var2.method4((byte) -55);
        } while ((var2.field15 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
