import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class503 extends class64 {

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "Lfca;")
    public static class93 field6869 = new class93(1350);

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "Ljia;")
    public static class645 field6872 = new class645();

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V", line = 5)
    public static void method2875(byte arg0) {
        field6872 = null;
        field6869 = null;
        if (arg0 >= -123) {
            method2876(true, null);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLha;)V", line = 20)
    public static final void method2876(boolean arg0, class66 arg1) {
        field6871++;
        class788 var2 = (class788) class450.field6170.method1597((byte) 98);
        if (!arg0) {
            field6869 = null;
        }
        while (var2 != null) {
            if (var2.field10818) {
                var2.method4294(arg1);
            }
            var2 = (class788) class450.field6170.method1601(118);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 45)
    public static final byte[] method2877(String arg0, int arg1) {
        field6870++;
        int var2 = arg0.length();
        if (arg1 < 75) {
            field6869 = null;
        }
        byte[] var3 = new byte[var2];
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
}
