import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class243 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Z")
    public boolean field3761 = true;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field3762;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljb;")
    public static class276 field3763;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIBI)V")
    public static final void method1647(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class293.field4612 == 1) {
            class206.field3204[class297.field4687 / 100].method45(class265.field4226 - 8, class267.field4259 + -8);
        }
        if (arg3 > -21) {
            method1648((byte) -102, (class39) null);
        }
        field3765++;
        if (class293.field4612 == 2) {
            class206.field3204[class297.field4687 / 100 + 4].method45(class265.field4226 - 8, class267.field4259 + -8);
        }
        class35.method277((byte) -7);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLuc;)V")
    public static final void method1648(byte arg0, class39 arg1) {
        field3768++;
        class61.method486(-6766, 200000, arg1);
        if (arg0 <= 46) {
            method1650((byte) 48);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1649(int arg0, Throwable arg1) throws IOException {
        String var2;
        if ((arg1 instanceof class181)) {
            class181 var3 = (class181) arg1;
            arg1 = var3.field2700;
            var2 = var3.field2696 + " | ";
        } else {
            var2 = "";
        }
        field3770++;
        StringWriter var4 = new StringWriter();
        if (arg0 >= -65) {
            return null;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
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

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method1650(byte arg0) {
        field3763 = null;
        if (arg0 != 87) {
            field3763 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3767 = arg4;
        this.field3772 = arg5;
        this.field3771 = arg2;
        this.field3766 = arg0;
        this.field3762 = arg1;
        this.field3761 = arg6;
        this.field3769 = arg3;
    }
}
