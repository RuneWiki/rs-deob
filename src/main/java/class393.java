import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class393 extends InputStream {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field5452 = 0;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field5455 = 0;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "J")
    public static long field5449;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Lij;")
    public static class316 field5456;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5454;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2436(int arg0) {
        field5458++;
        for (int var1 = 0; var1 < class149.field2168; var1++) {
            class56 var2 = class109.method841((byte) 81, var1);
            if (var2 != null && var2.field727 == 0) {
                class66.field924[var1] = 0;
                class13.field121[var1] = 0;
            }
        }
        if (arg0 < -102) {
            class366.field5073 = new class109(128);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 38)
    public static void method2437(byte arg0) {
        field5454 = null;
        field5456 = null;
        if (arg0 != -36) {
            field5454 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 49)
    public static final void method2438(int arg0) {
        field5459++;
        class146 var1 = class431.field6035;
        synchronized (class431.field6035) {
            class431.field6035.method1057(arg0 + arg0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "read", descriptor = "()I", line = 65)
    public final int read() {
        field5450++;
        class328.method1999(0, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 80)
    public static final void method2439(int arg0, int arg1) {
        class237.field3380 = arg1;
        field5451++;
        class408 var2 = class68.field965;
        synchronized (class68.field965) {
            class68.field965.method2530((byte) -106);
        }
        class408 var3 = class147.field2135;
        synchronized (class147.field2135) {
            class147.field2135.method2530((byte) -94);
            if (arg0 != 23896) {
                field5452 = -28;
            }
        }
        class408 var4 = class326.field4433;
        synchronized (class326.field4433) {
            class326.field4433.method2530((byte) -117);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjava/lang/String;)[B", line = 100)
    public static final byte[] method2440(boolean arg0, String arg1) {
        if (arg0) {
            return null;
        }
        field5453++;
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

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;BC)I", line = 243)
    public static final int method2441(String arg0, byte arg1, char arg2) {
        field5457++;
        int var3 = 0;
        int var4 = 122 / ((13 - arg1) / 49);
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6++) {
            if (arg0.charAt(var6) == arg2) {
                var3++;
            }
        }
        return var3;
    }
}
