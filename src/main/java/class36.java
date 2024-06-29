import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public abstract class class36 {

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "Lt;")
    public static class35 field442 = class3.method28(false, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Lt;")
    public static class35 field443 = class3.method28(false, "Mace Shop");

    @OriginalMember(owner = "mapview!u", name = "j", descriptor = "Lt;")
    public static class35 field451 = class3.method28(false, "floorcol)3dat");

    @OriginalMember(owner = "mapview!u", name = "k", descriptor = "I")
    public static volatile int field452 = 0;

    @OriginalMember(owner = "mapview!u", name = "i", descriptor = "Lt;")
    public static class35 field450 = class3.method28(false, "50(U");

    @OriginalMember(owner = "mapview!u", name = "l", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field444;

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "[B")
    public static byte[] field445;

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "[I")
    public static int[] field448;

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "[I")
    public int[] field449;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)Lt;", line = 14)
    public static final class35 method228(int arg0, int arg1) {
        class35 var2 = new class35();
        var2.field434 = arg0;
        var2.field433 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 25)
    public static final String method229(Throwable arg0, int arg1) throws IOException {
        String var3;
        if (arg0 instanceof class24) {
            class24 var2 = (class24) arg0;
            var3 = var2.field270 + " | ";
            arg0 = var2.field267;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != 5) {
            method228(-102, -105);
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
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

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Z)V", line = 103)
    public static void method230(boolean arg0) {
        field445 = null;
        if (!arg0) {
            field453 = -33;
        }
        field442 = null;
        field448 = null;
        field451 = null;
        field450 = null;
        field443 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)V", line = 128)
    public final void method231(byte arg0) {
        int var2 = 40 % ((arg0 - 18) / 63);
        class37.method238(this.field449, this.field447, this.field446);
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "()V", line = 142)
    protected class36() {
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method31(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method27(Component arg0, int arg1, int arg2, int arg3);
}
