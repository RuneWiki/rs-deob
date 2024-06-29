import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 {

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "[Lt;")
    private class36[] field134;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "I")
    public static int field125 = 0;

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "Lr;")
    public static class33 field130 = class29.method192("b12_full", (byte) 126);

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Lr;")
    public static class33 field127 = class29.method192("Fishing Shop", (byte) 126);

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Lr;")
    public static class33 field133 = class29.method192("", (byte) 126);

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "Lr;")
    public static class33 field131 = class29.method192("Rare Trees", (byte) 126);

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "Lr;")
    public static class33 field136 = class29.method192("Overview", (byte) 126);

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Lr;")
    public static class33 field126 = class29.method192("sprites", (byte) 126);

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "Lr;")
    public static class33 field135 = class29.method192("mapscene", (byte) 126);

    @OriginalMember(owner = "mapview!ea", name = "m", descriptor = "Lr;")
    public static class33 field137 = class29.method192("Requesting", (byte) 126);

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "J")
    private long field129;

    @OriginalMember(owner = "mapview!ea", name = "n", descriptor = "Lt;")
    private class36 field138;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 13)
    public static final String method58(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class37) {
            class37 var2 = (class37) arg1;
            arg1 = var2.field503;
            var3 = var2.field502 + " | ";
        } else {
            var3 = "";
        }
        if (arg0 != -9479) {
            field135 = null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([Lr;IIZ)Lr;", line = 89)
    public static final class33 method59(class33[] arg0, int arg1, int arg2, boolean arg3) {
        int var4 = 0;
        if (!arg3) {
            field133 = null;
        }
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class11.field141;
            }
            var4 += arg0[arg1 + var5].field470;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg2; var8++) {
            class33 var9 = arg0[arg1 + var8];
            class34.method234(var9.field465, 0, var7, var6, var9.field470);
            var6 += var9.field470;
        }
        class33 var10 = new class33();
        var10.field465 = var7;
        var10.field470 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IJ)Lt;", line = 134)
    public final class36 method60(int arg0, long arg1) {
        this.field129 = arg1;
        class36 var4 = this.field134[(int) (arg1 & (long) (this.field128 - 1))];
        for (this.field138 = var4.field492; this.field138 != var4; this.field138 = this.field138.field492) {
            if (this.field138.field493 == arg1) {
                class36 var5 = this.field138;
                this.field138 = this.field138.field492;
                return var5;
            }
        }
        if (arg0 != -16091) {
            method62((byte) -37, null);
        }
        this.field138 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/String;B)Lr;", line = 170)
    public static final class33 method61(String arg0, byte arg1) {
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        if (arg1 > -41) {
            method59(null, 92, 113, true);
        }
        class33 var4 = new class33();
        var4.field465 = var2;
        var4.field470 = 0;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field470++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 203)
    public static final void method62(byte arg0, Component arg1) {
        if (arg0 != -4) {
            method62((byte) -49, null);
        }
        arg1.removeKeyListener(class35.field483);
        arg1.removeFocusListener(class35.field483);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B[Lr;)V", line = 215)
    public static final void method63(byte arg0, class33[] arg1) {
        int var2 = -66 / ((61 - arg0) / 42);
        class6.method39(arg1.length, 0, (byte) 54, arg1);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Lt;ZJ)V", line = 233)
    public final void method64(class36 arg0, boolean arg1, long arg2) {
        if (arg0.field497 != null) {
            arg0.method245((byte) 25);
        }
        class36 var5 = this.field134[(int) (arg2 & (long) (this.field128 - 1))];
        arg0.field492 = var5;
        arg0.field493 = arg2;
        if (!arg1) {
            arg0.field497 = var5.field497;
            arg0.field497.field492 = arg0;
            arg0.field492.field497 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)V", line = 252)
    public static void method65(int arg0) {
        field127 = null;
        field126 = null;
        field137 = null;
        field130 = null;
        field136 = null;
        field135 = null;
        field131 = null;
        field133 = null;
        int var1 = -104 % ((arg0 + 4) / 34);
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(I)Lt;", line = 286)
    public final class36 method66(int arg0) {
        if (this.field138 == null) {
            return null;
        }
        class36 var2 = this.field134[(int) ((long) (this.field128 - 1) & this.field129)];
        if (arg0 != 32) {
            return (class36) null;
        }
        while (this.field138 != var2) {
            if (this.field138.field493 == this.field129) {
                class36 var3 = this.field138;
                this.field138 = this.field138.field492;
                return var3;
            }
            this.field138 = this.field138.field492;
        }
        this.field138 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(I)B", line = 328)
    public static final byte method67(int arg0) {
        if (arg0 <= 13) {
            method59(null, 19, -102, false);
        }
        return class36.field495 == null ? 0 : class36.field495[class26.field396];
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(I)V", line = 365)
    public class10(int arg0) {
        this.field134 = new class36[arg0];
        this.field128 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class36 var3 = this.field134[var2] = new class36();
            var3.field497 = var3;
            var3.field492 = var3;
        }
    }
}
