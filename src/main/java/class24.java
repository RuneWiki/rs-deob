import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class24 {

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "[I")
    private int[] field253;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Z")
    public static boolean field255 = true;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Lp;")
    public static class30 field254 = new class30();

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "Z")
    public static boolean field261 = true;

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "I")
    public static int field262 = 0;

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "Ld;")
    public static class7 field258 = class38.method251((byte) 114, "map");

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Lc;")
    public static class5 field257;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "[B")
    public static byte[] field256;

    @OriginalMember(owner = "mapview!m", name = "k", descriptor = "[B")
    public static byte[] field263;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "[I")
    public static int[] field259;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Z[B)[B", line = 17)
    public static final byte[] method165(boolean arg0, byte[] arg1) {
        if (arg0) {
            method165(false, null);
        }
        class35 var2 = new class35(arg1);
        int var3 = var2.method232(false);
        int var4 = var2.method228((byte) -20);
        if (var4 < 0 || class4.field43 != 0 && var4 > class4.field43) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var9 = new byte[var4];
            var2.method235(0, var4, var9, (byte) -114);
            return var9;
        } else {
            int var5 = var2.method228((byte) -20);
            if (var5 < 0 || class4.field43 != 0 && class4.field43 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class6.method52(var6, var5, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var7.readFully(var6);
                    var7.close();
                } catch (IOException var10) {
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V", line = 81)
    public static void method166(int arg0) {
        if (arg0 != -1) {
            method166(-110);
        }
        field257 = null;
        field258 = null;
        field263 = null;
        field259 = null;
        field254 = null;
        field256 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Ld;Ljava/awt/Color;BI)V", line = 98)
    public static final void method167(class7 arg0, Color arg1, byte arg2, int arg3) {
        try {
            if (arg2 != -2) {
                return;
            }
            Graphics var4 = class21.field237.getGraphics();
            if (class21.field233 == null) {
                class21.field233 = new Font("Helvetica", 1, 13);
                class14.field149 = class21.field237.getFontMetrics(class21.field233);
            }
            if (class18.field194) {
                class18.field194 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class23.field248, class35.field465);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class17.field190 == null) {
                    class17.field190 = class21.field237.createImage(304, 34);
                }
                Graphics var5 = class17.field190.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class21.field233);
                var5.setColor(Color.white);
                arg0.method59(var5, 22, (304 - arg0.method60((byte) 22, class14.field149)) / 2, 0);
                var4.drawImage(class17.field190, class23.field248 / 2 - 152, class35.field465 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class35.field465 / 2 - 18;
                int var8 = class23.field248 / 2 - 152;
                var4.setColor(arg1);
                var4.drawRect(var8, var7, 303, 33);
                var4.fillRect(var8 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var8 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class21.field233);
                var4.setColor(Color.white);
                arg0.method59(var4, var7 + 22, var8 + (-arg0.method60((byte) 22, class14.field149) + 304) / 2, arg2 + 2);
            }
        } catch (Exception var11) {
            class21.field237.repaint();
        }
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I)B", line = 162)
    public static final byte method168(int arg0) {
        if (arg0 != 40) {
            method166(-119);
        }
        return field256 == null ? 0 : field256[class2.field10];
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 177)
    public static final String method169(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class12) {
            class12 var2 = (class12) arg1;
            var3 = var2.field137 + " | ";
            arg1 = var2.field143;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 != 2) {
            method165(true, null);
        }
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "([I)V", line = 249)
    public class24(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field253 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field253[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field253[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field253[var5 + var5] = arg0[var4];
            this.field253[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ZI)I", line = 321)
    public final int method170(boolean arg0, int arg1) {
        if (arg0) {
            field262 = 47;
        }
        int var3 = this.field253.length - 2;
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field253[var4];
            if (arg1 == var5) {
                return this.field253[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }
}
