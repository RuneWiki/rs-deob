import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class345 {

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "[I")
    public static int[] field4993;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "[Lqp;")
    public static class450[] field4994;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method2077(byte arg0) {
        field4994 = null;
        if (arg0 != -118) {
            method2078(-126);
        }
        field4993 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
    public abstract int method2038(int arg0);

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)Z")
    public abstract boolean method2045(int arg0);

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public static final void method2078(int arg0) {
        field4992++;
        class332 var1 = (class332) class156.field1989.method242(false);
        if (arg0 == 5) {
            while (var1 != null) {
                var1.method2001();
                var1 = (class332) class156.field1989.method244((byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZII)V")
    public static final void method2079(boolean arg0, int arg1, int arg2) {
        field4996++;
        class384 var3 = new class384(16);
        if (!arg0) {
            method2079(true, -50, -81);
        }
        for (class414 var4 = (class414) class473.field6838.method2316(4999); var4 != null; var4 = (class414) class473.field6838.method2308((byte) 113)) {
            var4.method536(false);
            int var5 = (int) (var4.field1177 >> 28);
            int var6 = (int) (var4.field1177 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field1177 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && class362.field5442 > var7 && class203.field2813 > var6) {
                var3.method2317(-1, (long) (var7 | var6 << 14 | var5 << 28), var4);
            }
        }
        class473.field6838 = var3;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    public abstract void method2034(int arg0);

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)Z")
    public abstract boolean method2036(int arg0);

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)Z")
    public abstract boolean method2043(byte arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method2080(boolean arg0, Throwable arg1) throws IOException {
        field4995++;
        String var2;
        if ((arg1 instanceof class501)) {
            class501 var3 = (class501) arg1;
            var2 = var3.field7659 + " | ";
            arg1 = var3.field7657;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (!arg0) {
            return null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
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
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)Lrm;")
    public abstract class270 method2039(int arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V")
    public static final void method2081(int arg0, int arg1, int arg2, int arg3) {
        field4991++;
        if (arg1 > 27) {
            class338 var4 = class380.method2294((byte) 127, arg0, 9);
            var4.method2052((byte) 88);
            var4.field4924 = arg2;
            var4.field4930 = arg3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)I")
    public abstract int method2044(byte arg0);

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)V")
    public abstract void method2046(byte arg0);

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)Z")
    public final boolean method2082(int arg0) {
        field4990++;
        if (arg0 != 1878308764) {
            this.method2044((byte) 70);
        }
        return this.method2043((byte) -60) || this.method2045(16383) || this.method2036(arg0 ^ 0x6FF4B7FF);
    }

    static {
        new class194("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field4993 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
        field4994 = new class450[0];
    }
}
