import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class75 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lrd;")
    public static class307 field990 = class183.method1258(false);

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Z")
    public static boolean field991 = false;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method582(String arg0, int arg1) {
        field987++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != 8217) {
            field991 = true;
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

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method583(int arg0) {
        int var1 = 100 % ((arg0 + 55) / 34);
        field990 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZIIB)V")
    public static final void method584(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        class620.field8619 = 0L;
        field988++;
        int var5 = class317.method1913(1);
        if (arg2 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class334.field4506.method87()) {
            arg1 = true;
        }
        class555.method3113(arg0, arg2, var5, 24779, arg1, arg3);
        int var6 = 124 / ((arg4 + 3) / 56);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lfa;Ljava/awt/Canvas;B)Lr;")
    public static final class166 method585(class212 arg0, Canvas arg1, byte arg2) {
        field986++;
        if (arg2 > -31) {
            field990 = null;
        }
        return new class18(arg1, arg0);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lir;")
    public static final class25 method586(int arg0, int arg1) {
        field989++;
        class25 var2 = (class25) class383.field5424.method3543((long) arg0, -24045);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class221.field3091.method3654(-15615, arg0, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class25 var4;
        try {
            var4 = class457.method2607(var3, -25614);
        } catch (Exception var7) {
            throw new RuntimeException(var7.getMessage() + " S: " + arg0);
        }
        class383.field5424.method3548((long) arg0, 7, var4);
        int var6 = 29 % ((21 - arg1) / 59);
        return var4;
    }
}
