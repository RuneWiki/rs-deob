import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class class684 {

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field9537 = 50;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "[I")
    public static int[] field9536 = new int[field9537];

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "[I")
    public static int[] field9531 = new int[field9537];

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "[I")
    public static int[] field9527 = new int[field9537];

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "[I")
    public static int[] field9538 = new int[field9537];

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "[I")
    public static int[] field9532 = new int[field9537];

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field9534 = new String[field9537];

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "[I")
    public static int[] field9526 = new int[field9537];

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field9533;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Lbl;")
    public static class651 field9529;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method3842(int arg0, Throwable arg1, String arg2) {
        field9528++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class644.method3616(arg1, false);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class347.method2005(arg0, var3);
            String var4 = class294.method1767(0, "%3a", var3, ":");
            String var5 = class294.method1767(0, "%40", var4, "@");
            String var6 = class294.method1767(0, "%26", var5, "&");
            String var7 = class294.method1767(arg0 ^ 0x1, "%23", var6, "#");
            if (class587.field8227 != null) {
                class181 var8 = class320.field4129.method2650(new URL(class587.field8227.getCodeBase(), "clienterror.ws?c=" + class755.field10536 + "&u=" + (class126.field1806 == null ? String.valueOf(class650.field9021) : class126.field1806) + "&v1=" + class465.field6245 + "&v2=" + class465.field6239 + "&e=" + var7), 122);
                while (var8.field2538 == 0) {
                    class149.method1052(1L, true);
                }
                if (var8.field2538 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2540;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static void method3843(byte arg0) {
        field9532 = null;
        field9531 = null;
        field9538 = null;
        field9529 = null;
        field9527 = null;
        int var1 = 54 % ((arg0 + 91) / 32);
        field9526 = null;
        field9536 = null;
        field9534 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B[BII)V")
    public abstract void method2306(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public abstract void method2307(int arg0);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[BI)I")
    public abstract int method2305(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public abstract void method2303(int arg0);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[BBI)Ljava/lang/String;")
    public static final String method3844(int arg0, byte[] arg1, byte arg2, int arg3) {
        field9535++;
        char[] var4 = new char[arg0];
        int var5 = -89 / ((90 - arg2) / 36);
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg0 + arg3;
        while (var7 < var8) {
            int var9 = arg1[var7++] & 0xFF;
            int var10;
            if (var9 >= 128) {
                if (var9 < 192) {
                    var10 = 65533;
                } else if (var9 < 224) {
                    if (var8 > var7 && (arg1[var7] & 0xC0) == 128) {
                        var10 = arg1[var7++] & 0x3F | (var9 & 0x1F) << 6;
                        if (var10 < 128) {
                            var10 = 65533;
                        }
                    } else {
                        var10 = 65533;
                    }
                } else if (var9 < 240) {
                    if (var8 > var7 + 1 && (arg1[var7] & 0xC0) == 128 && (arg1[var7 + 1] & 0xC0) == 128) {
                        var10 = arg1[var7++] & 0x3F << 6 | (var9 & 0xF) << 12 | arg1[var7++] & 0x3F;
                        if (var10 < 2048) {
                            var10 = 65533;
                        }
                    } else {
                        var10 = 65533;
                    }
                } else if (var9 >= 248) {
                    var10 = 65533;
                } else if (var8 > (var7 + 2) && (arg1[var7] & 0xC0) == 128 && (arg1[var7 + 1] & 0xC0) == 128 && (arg1[var7 + 2] & 0xC0) == 128) {
                    int var11 = (arg1[var7++] & 0x3F) << 12 | (var9 & 0x7) << 18 | (arg1[var7++] & 0x3F) << 6 | arg1[var7++] & 0x3F;
                    if (var11 >= 65536 && var11 <= 1114111) {
                        var10 = 65533;
                    } else {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 == 0) {
                var10 = 65533;
            } else {
                var10 = var9;
            }
            var4[var6++] = (char) var10;
        }
        return new String(var4, 0, var6);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)Z")
    public abstract boolean method2304(int arg0, int arg1) throws IOException;
}
