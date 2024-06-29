import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ta")
public class class37 {

    @OriginalMember(owner = "mapview!ta", name = "k", descriptor = "[Lpa;")
    private class29[] field489;

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "Lv;")
    public static class40 field479 = class24.method170("???", (byte) -74);

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "Lv;")
    public static class40 field482 = class24.method170("Helmet Shop", (byte) 67);

    @OriginalMember(owner = "mapview!ta", name = "g", descriptor = "I")
    public static volatile int field485 = -1;

    @OriginalMember(owner = "mapview!ta", name = "i", descriptor = "Lv;")
    public static class40 field487 = class24.method170("Saw Mill", (byte) 35);

    @OriginalMember(owner = "mapview!ta", name = "j", descriptor = "Lv;")
    public static class40 field488 = class24.method170("Kebab Seller", (byte) -124);

    @OriginalMember(owner = "mapview!ta", name = "f", descriptor = "Lv;")
    public static class40 field484 = class24.method170("Switch to ", (byte) -92);

    @OriginalMember(owner = "mapview!ta", name = "e", descriptor = "J")
    private long field483;

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "Lpa;")
    private class29 field480;

    @OriginalMember(owner = "mapview!ta", name = "h", descriptor = "[I")
    public static int[] field486;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(B)V", line = 10)
    public static void method221(byte arg0) {
        field487 = null;
        field482 = null;
        if (arg0 < 73) {
            method228(-98, null, null, (byte) -32);
        }
        field486 = null;
        field479 = null;
        field488 = null;
        field484 = null;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(II[BI)Lv;", line = 31)
    public static final class40 method222(int arg0, int arg1, byte[] arg2, int arg3) {
        class40 var4 = new class40();
        var4.field510 = 0;
        var4.field511 = new byte[arg3];
        int var5 = -119 % ((arg0 - 48) / 62);
        for (int var6 = arg1; var6 < arg1 + arg3; var6++) {
            if (arg2[var6] != 0) {
                var4.field511[var4.field510++] = arg2[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(JB)Lpa;", line = 55)
    public final class29 method223(long arg0, byte arg1) {
        this.field483 = arg0;
        class29 var4 = this.field489[(int) ((long) (this.field481 - 1) & arg0)];
        for (this.field480 = var4.field417; this.field480 != var4; this.field480 = this.field480.field417) {
            if (this.field480.field420 == arg0) {
                class29 var5 = this.field480;
                this.field480 = this.field480.field417;
                return var5;
            }
        }
        if (arg1 >= -26) {
            return (class29) null;
        } else {
            this.field480 = null;
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I)Lpa;", line = 97)
    public final class29 method224(int arg0) {
        if (this.field480 == null) {
            return null;
        }
        class29 var2 = this.field489[(int) ((long) (this.field481 - 1) & this.field483)];
        while (this.field480 != var2) {
            if (this.field480.field420 == this.field483) {
                class29 var3 = this.field480;
                this.field480 = this.field480.field417;
                return var3;
            }
            this.field480 = this.field480.field417;
        }
        if (arg0 != 25938) {
            field484 = null;
        }
        this.field480 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(I)I", line = 134)
    public static final int method225(int arg0) {
        if (arg0 != 0) {
            field488 = null;
        }
        if (class27.field412 == null) {
            return 0;
        } else if (class27.field412.field264 == null) {
            return class8.field103[class27.field412.field263 & 0xFF];
        } else {
            return class8.field103[class27.field412.field264[class20.field213] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(IJ)V", line = 157)
    public static final void method226(int arg0, long arg1) {
        if (arg0 != 303) {
            method228(98, null, null, (byte) -79);
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class1.method1(arg1 - 1L, (byte) -79);
            class1.method1(1L, (byte) -101);
        } else {
            class1.method1(arg1, (byte) 117);
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(JILpa;)V", line = 183)
    public final void method227(long arg0, int arg1, class29 arg2) {
        if (arg2.field419 != null) {
            arg2.method195(1);
        }
        class29 var5 = this.field489[(int) ((long) (this.field481 - 1) & arg0)];
        arg2.field420 = arg0;
        arg2.field417 = var5;
        arg2.field419 = var5.field419;
        arg2.field419.field417 = arg2;
        int var6 = 94 / ((arg1 - 48) / 53);
        arg2.field417.field419 = arg2;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(ILjava/awt/Color;Lv;B)V", line = 214)
    public static final void method228(int arg0, Color arg1, class40 arg2, byte arg3) {
        try {
            Graphics var4 = class40.field509.getGraphics();
            if (class25.field380 == null) {
                class25.field380 = new Font("Helvetica", 1, 13);
                class6.field77 = class40.field509.getFontMetrics(class25.field380);
            }
            if (class40.field525) {
                class40.field525 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class19.field201, class5.field61);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class40.field522 == null) {
                    class40.field522 = class40.field509.createImage(304, 34);
                }
                Graphics var5 = class40.field522.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                if (arg3 < 24) {
                    return;
                }
                var5.setFont(class25.field380);
                var5.setColor(Color.white);
                arg2.method244((304 - arg2.method249(-20, class6.field77)) / 2, (byte) 79, 22, var5);
                var4.drawImage(class40.field522, class19.field201 / 2 - 152, class5.field61 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class5.field61 / 2 - 18;
                int var8 = class19.field201 / 2 - 152;
                var4.setColor(arg1);
                var4.drawRect(var8, var7, 303, 33);
                var4.fillRect(var8 + 2, var7 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var7 - -1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class25.field380);
                var4.setColor(Color.white);
                arg2.method244(var8 + (304 - arg2.method249(-108, class6.field77)) / 2, (byte) 90, var7 + 22, var4);
            }
        } catch (Exception var11) {
            class40.field509.repaint();
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 285)
    public static final String method229(Throwable arg0, byte arg1) throws IOException {
        String var3;
        if (arg0 instanceof class27) {
            class27 var2 = (class27) arg0;
            arg0 = var2.field415;
            var3 = var2.field409 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        int var5 = -91 % ((14 - arg1) / 39);
        PrintWriter var6 = new PrintWriter(var4);
        arg0.printStackTrace(var6);
        var6.close();
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var3 + "| " + var9;
                }
                int var12 = var10.indexOf(40);
                int var13 = var10.indexOf(41, var12 + 1);
                if (var12 >= 0 && var13 >= 0) {
                    String var14 = var10.substring(var12 + 1, var13);
                    int var15 = var14.indexOf(".java:");
                    if (var15 >= 0) {
                        String var16 = var14.substring(0, var15) + var14.substring(var15 + 5);
                        var3 = var3 + var16 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var12);
                }
                String var17 = var10.trim();
                String var18 = var17.substring(var17.lastIndexOf(32) + 1);
                String var19 = var18.substring(var18.lastIndexOf(9) + 1);
                var3 = var3 + var19 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "<init>", descriptor = "(I)V", line = 350)
    public class37(int arg0) {
        this.field489 = new class29[arg0];
        this.field481 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class29 var3 = this.field489[var2] = new class29();
            var3.field419 = var3;
            var3.field417 = var3;
        }
    }
}
