import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class12 {

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "[I")
    private int[] field122;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "I")
    public static int field128 = 0;

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Ll;")
    public static class22 field130 = class33.method229("Axe Shop", -85);

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Ll;")
    public static class22 field126 = class33.method229("map", -56);

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "I")
    public static volatile int field131 = -1;

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "Ll;")
    public static class22 field124 = class33.method229("Dungeon", -127);

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "Ln;")
    public static class26 field129;

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field125;

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "([I)V", line = 16)
    public class12(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field122 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field122[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field122[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field122[var5 + var5] = arg0[var4];
            this.field122[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I[Ll;II)Ll;", line = 54)
    public static final class22 method60(int arg0, class22[] arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg1[arg2 + var5] == null) {
                arg1[arg2 + var5] = class19.field192;
            }
            var4 += arg1[arg2 + var5].field213;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg3 != -1799) {
            field126 = null;
        }
        for (int var8 = 0; var8 < arg0; var8++) {
            class22 var9 = arg1[arg2 + var8];
            class7.method34(var9.field215, 0, var6, var7, var9.field213);
            var7 += var9.field213;
        }
        class22 var10 = new class22();
        var10.field213 = var4;
        var10.field215 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)V", line = 99)
    public static void method61(byte arg0) {
        field124 = null;
        field130 = null;
        if (arg0 == -116) {
            field126 = null;
            field125 = null;
            field129 = null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 126)
    public static final String method62(Throwable arg0, int arg1) throws IOException {
        String var2;
        if (arg0 instanceof class21) {
            class21 var3 = (class21) arg0;
            var2 = var3.field205 + " | ";
            arg0 = var3.field203;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        if (arg1 != -1) {
            return (String) null;
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var2 = var2 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var2 = var2 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(B)V", line = 200)
    public static final void method63(byte arg0) {
        if (class34.field460[0][class13.field144][class29.field373] == null) {
            class2.field18 = null;
        } else {
            class2.field18 = class34.field460[0][class13.field144][class29.field373];
        }
        if (class34.field460[1][class13.field144][class29.field373] == null) {
            class3.field22 = null;
        } else {
            class3.field22 = class34.field460[1][class13.field144][class29.field373];
        }
        if (arg0 != -61) {
            field125 = null;
        }
        if (class34.field460[2][class13.field144][class29.field373] == null) {
            class29.field396 = null;
        } else {
            class29.field396 = class34.field460[2][class13.field144][class29.field373];
        }
        if (class34.field460[3][class13.field144][class29.field373] == null) {
            class1.field3 = null;
        } else {
            class1.field3 = class34.field460[3][class13.field144][class29.field373];
        }
        if (class34.field460[4][class13.field144][class29.field373] == null) {
            class25.field247 = null;
        } else {
            class25.field247 = class34.field460[4][class13.field144][class29.field373];
        }
        if (class27.field364[class13.field144][class29.field373] == null) {
            class2.field12 = null;
        } else {
            class2.field12 = class27.field364[class13.field144][class29.field373];
        }
        if (class34.field463[class13.field144][class29.field373] == null) {
            class2.field10 = null;
        } else {
            class2.field10 = class34.field463[class13.field144][class29.field373];
        }
        if (class13.field134[class13.field144][class29.field373] == null) {
            class38.field508 = null;
        } else {
            class38.field508 = class13.field134[class13.field144][class29.field373];
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(II)I", line = 251)
    public static int method64(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IB)I", line = 259)
    public final int method65(int arg0, byte arg1) {
        if (arg1 > -66) {
            field125 = null;
        }
        int var3 = this.field122.length - 2;
        int var4 = var3 & arg0 << 1;
        while (true) {
            int var5 = this.field122[var4];
            if (arg0 == var5) {
                return this.field122[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }
}
