import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class class380 extends class426 {

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "Lns;")
    public static class55 field5547 = new class55(12, 14);

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "Lns;")
    public static class55 field5553 = new class55(5, 7);

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "Liq;")
    public static class134 field5549;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "Llp;")
    public static class137 field5552;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILiq;)V")
    public static final void method2288(int arg0, class134 arg1) {
        if (arg0 >= -8) {
            field5547 = null;
        }
        class169.field2424 = arg1.method836(-1, "titlebg");
        field5551++;
        class338.field5047 = arg1.method836(-1, "logo");
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    public static final void method2289(int arg0, int arg1) {
        class301.field4545 = new int[arg1];
        class282.field4314 = new int[arg1];
        class170.field2630 = new int[arg1];
        if (arg0 > -27) {
            field5553 = null;
        }
        class383.field5589 = new int[arg1];
        field5550++;
        class150.field2078 = new int[arg1];
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfq;IIII)V")
    public static final void method2290(class85 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5545++;
        for (class71 var5 = (class71) class451.field6638.method2514((byte) 61); var5 != null; var5 = (class71) class451.field6638.method2511(-122)) {
            if (var5.field924 == arg1 && arg4 * 128 == var5.field923 && (arg2 * 128) == var5.field927 && var5.field920.field1156 == arg0.field1156) {
                if (var5.field919 != null) {
                    class267.field4077.method2135(var5.field919);
                    var5.field919 = null;
                }
                if (var5.field916 != null) {
                    class267.field4077.method2135(var5.field916);
                    var5.field916 = null;
                }
                var5.method625((byte) -50);
                return;
            }
        }
        if (arg3 != 128) {
            field5549 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)V")
    public static void method2291(byte arg0) {
        field5549 = null;
        field5552 = null;
        field5553 = null;
        if (arg0 == 122) {
            field5547 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method2292(int arg0, byte[] arg1, int arg2, int arg3) {
        field5546++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        if (arg0 != -1) {
            return null;
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class112.field1477[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2293(String arg0, int arg1) {
        field5548++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        if (arg1 != 31906) {
            return null;
        }
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class451.method2778(var6, -11076);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }
}
