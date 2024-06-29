import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class266 {

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "B")
    private byte field4130;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public int field4117;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public int field4118;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field4126 = 0;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Lrn;")
    public static class18 field4128;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Lrn;")
    public static class18 field4129;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I", line = 5)
    public final int method1958(int arg0) {
        field4119++;
        return arg0 == 7 ? this.field4130 & 0x7 : 67;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I", line = 27)
    public final int method1959(int arg0) {
        if (arg0 == -8) {
            field4125++;
            return (this.field4130 & 0x8) == 8 ? 1 : 0;
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[II[I)V", line = 45)
    public static final void method1960(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg3 <= 5) {
            field4126 = -71;
        }
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if (arg4[var9] > (var9 & 0x1) + var7) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method1960(arg0, var6 - 1, arg2, 68, arg4);
            method1960(var6 + 1, arg1, arg2, 38, arg4);
        }
        field4121++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 99)
    public static void method1961(byte arg0) {
        if (arg0 < 39) {
            field4129 = (class18) null;
        }
        field4128 = null;
        field4129 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 113)
    public static final String method1962(byte arg0, Throwable arg1) throws IOException {
        field4120++;
        String var3;
        if (arg1 instanceof class9) {
            class9 var2 = (class9) arg1;
            arg1 = var2.field124;
            var3 = var2.field131 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg0 != -73) {
            return (String) null;
        }
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 187)
    public class266() {
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lug;)V", line = 189)
    public class266(class25 arg0) {
        this.field4130 = arg0.method286((byte) 111);
        this.field4117 = arg0.method314((byte) 76);
        this.field4123 = arg0.method262((byte) 117);
        this.field4124 = arg0.method262((byte) 116);
        this.field4127 = arg0.method262((byte) 80);
        this.field4118 = arg0.method262((byte) 50);
    }
}
