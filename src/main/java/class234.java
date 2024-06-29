import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class234 {

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lmh;")
    public static class62 field4036 = class201.method1405(true, "details");

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[Lmh;")
    public static class62[] field4034 = new class62[200];

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lmh;")
    public static class62 field4035 = class201.method1405(true, "settings=");

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "F")
    public static float field4033;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I", line = 10)
    public static int method1648(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 17)
    public static void method1649(boolean arg0) {
        field4034 = null;
        if (!arg0) {
            method1649(true);
        }
        field4036 = null;
        field4035 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)I", line = 38)
    public static final int method1650(byte arg0, int arg1) {
        if (arg0 <= 62) {
            return 42;
        } else {
            field4032++;
            return arg1 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 58)
    public static final String method1651(byte arg0, Throwable arg1) throws IOException {
        field4031++;
        String var2;
        if ((arg1 instanceof class21)) {
            class21 var3 = (class21) arg1;
            var2 = var3.field218 + " | ";
            arg1 = var3.field222;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        if (arg0 > -73) {
            field4034 = (class62[]) null;
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lhi;ILhi;Lhi;Lfg;)Z", line = 128)
    public static final boolean method1652(class26 arg0, int arg1, class26 arg2, class26 arg3, class74 arg4) {
        field4037++;
        class146.field2318 = arg3;
        class300.field5155 = arg0;
        if (arg1 != -1760300720) {
            field4035 = (class62) null;
        }
        class270.field4576 = arg2;
        class78.field1307 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lwj;IIILsg;IB)V", line = 161)
    public static final void method1653(class135 arg0, int arg1, int arg2, int arg3, class191 arg4, int arg5, byte arg6) {
        field4030++;
        if (arg0 == null) {
            return;
        }
        int var7 = class267.field4516 + class187.field2984 & 0x7FF;
        int var8 = Math.max(arg4.field3190 / 2, arg4.field3126 / 2) + 10;
        int var9 = arg3 * arg3 + arg5 * arg5;
        if (var9 > (var8 * var8)) {
            return;
        }
        int var10 = class23.field245[var7];
        int var11 = var10 * 256 / (class149.field2350 + 256);
        int var12 = class23.field254[var7];
        if (arg6 != 64) {
            field4033 = 0.14175373F;
        }
        int var13 = var12 * 256 / (class149.field2350 + 256);
        int var14 = arg3 * var13 - (arg5 * var11) >> 16;
        int var15 = arg3 * var11 + arg5 * var13 >> 16;
        ((class257) arg0).method1789(arg4.field3190 / 2 + arg2 + var15 - (arg0.field2205 / 2), arg4.field3126 / 2 + -var14 + -(arg0.field2199 / 2) + arg1, (class257) arg4.method1340(false, (byte) -106));
    }
}
