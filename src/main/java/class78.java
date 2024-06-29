import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class78 extends class5 {

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Ljava/lang/String;")
    public String field1144;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Z")
    public static boolean field1138 = false;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field1145 = -1;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "[I")
    public static int[] field1146 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field1140 = 0;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Lka;")
    public static class212 field1139;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "[[I")
    public static int[][] field1137;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "[[[B")
    public static byte[][][] field1142;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V", line = 10)
    public static final void method608(int arg0, boolean arg1) {
        field1141++;
        byte var2;
        byte[][] var3;
        if (class73.field1058 && arg1) {
            var2 = 1;
            var3 = class5.field67;
        } else {
            var3 = class137.field2069;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = arg0; var5 < var4; var5++) {
            int[] var6 = null;
            byte[] var7 = var3[var5];
            int var8 = class139.field2087[var5] & 0xFF;
            int var9 = class139.field2087[var5] >> 8;
            int var10 = var9 * 64 - class327.field5054;
            int var11 = var8 * 64 - class293.field4522;
            if (var7 != null) {
                class293.method2025((byte) 115);
                var6 = class52.method389(class327.field5054, var7, 103, var11, class91.field1323, var10, arg1, class293.field4522);
            }
            if (!arg1 && class305.field4773 / 8 == var9 && class234.field3559 / 8 == var8) {
                if (var6 == null) {
                    class277.field4292 = -1;
                } else {
                    class94.field1333 = var6[3];
                    class262.field4028 = var6[2];
                    class213.field3268 = var6[4];
                    class180.field2853 = var6[1];
                    class277.field4292 = var6[0];
                }
            }
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class139.field2087[var12] & 0xFF) * 64 - class293.field4522;
            int var14 = (class139.field2087[var12] >> 8) * 64 - class327.field5054;
            byte[] var15 = var3[var12];
            if (var15 == null && class234.field3559 < 800) {
                class293.method2025((byte) 88);
                for (int var16 = 0; var16 < var2; var16++) {
                    class40.method307(var16, 64, 64, var14, var13, 104);
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V", line = 106)
    public static void method609(byte arg0) {
        field1139 = null;
        field1146 = null;
        field1142 = (byte[][][]) null;
        field1137 = (int[][]) null;
        if (arg0 != -97) {
            method609((byte) -15);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;", line = 133)
    public static final String method610(boolean arg0, Throwable arg1) throws IOException {
        if (arg0) {
            return (String) null;
        }
        String var3;
        if (arg1 instanceof class12) {
            class12 var2 = (class12) arg1;
            arg1 = var2.field156;
            var3 = var2.field159 + " | ";
        } else {
            var3 = "";
        }
        field1148++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 203)
    public class78() {
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 208)
    public class78(String arg0) {
        this.field1144 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjd;Ljd;)V", line = 217)
    public static final void method611(byte arg0, class95 arg1, class95 arg2) {
        class153.field2327 = arg2;
        int var3 = -119 / ((32 - arg0) / 45);
        class49.field677 = arg1;
        field1147++;
    }
}
