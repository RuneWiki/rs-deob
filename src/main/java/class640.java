import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class640 extends class586 {

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    private int field8990;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    private int field8997;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    private int field9002;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Llba;")
    private class223 field9001;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    private int field8999;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    private int field8994;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    private int field8993;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field8992 = 0;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "S")
    public static short field9003 = 205;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lv;")
    public static class165 field9000 = new class165();

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Lfp;")
    private class596 field8991;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
    public static void method3677(int arg0) {
        int var1 = -5 / ((arg0 - 34) / 56);
        field9000 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lfp;")
    public final class596 method3440(int arg0) {
        field8996++;
        if (arg0 > -114) {
            method3677(-76);
        }
        if (this.field8991 == null) {
            class638.field8976[5] = this.field8997;
            class638.field8976[2] = this.field8999;
            class638.field8976[1] = this.field8993;
            class638.field8976[0] = this.field8994;
            class638.field8976[3] = this.field8990;
            class101 var2 = this.field9001.field6556;
            class638.field8976[4] = this.field9002;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method583(12101, class638.field8976[var5])) {
                    return null;
                }
                class744 var7 = var2.method581(-21732, class638.field8976[var5]);
                int var8 = var7.field10265 ? 64 : 128;
                if (var7.field10270 > 0) {
                    var3 = 1;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class675.field9467[var6] = var2.method578(var4, false, class638.field8976[var6], 1.0F, true, var4);
            }
            this.field8991 = this.field9001.method1385(var3 != 0, var4, (byte) -50, class675.field9467);
        }
        return this.field8991;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIZII)V")
    public static final void method3678(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field8998++;
        if (!arg3) {
            method3677(109);
        }
        if (arg2 >= class177.field2236 && class627.field8783 >= arg4 && class727.field10060 <= arg1 && arg5 <= class474.field6576) {
            class607.method3507(arg1, arg5, (byte) 1, arg2, arg0, arg4);
        } else {
            class268.method1749(arg2, arg5, 95, arg1, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method3679(Throwable arg0, int arg1) throws IOException {
        if (arg1 != 20217) {
            return null;
        }
        field8995++;
        String var2;
        if ((arg0 instanceof class704)) {
            class704 var3 = (class704) arg0;
            var2 = var3.field9797 + " | ";
            arg0 = var3.field9800;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
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

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Llba;IIIIII)V")
    public class640(class223 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8990 = arg4;
        this.field8997 = arg6;
        this.field9002 = arg5;
        this.field9001 = arg0;
        this.field8999 = arg3;
        this.field8994 = arg1;
        this.field8993 = arg2;
    }
}
