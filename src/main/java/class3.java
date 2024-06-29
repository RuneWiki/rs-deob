import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class141 {

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field161 = 0;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Lpe;")
    public class109 field158;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "Lua;")
    public class137 field167;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "[B")
    public byte[] field166;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method19(int arg0) {
        if (arg0 != 0) {
            method19(127);
        }
        field169++;
        for (class132 var1 = (class132) class112.field2790.method514((byte) -79); var1 != null; var1 = (class132) class112.field2790.method517(arg0 ^ 0xFFFFFF94)) {
            if (var1.field3312 == -1) {
                var1.field3324 = 0;
                class123.method1048((byte) -86, var1);
            } else {
                var1.method1147((byte) -96);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILq;Lkd;Lkd;)[Lde;")
    public static final class27[] method20(int arg0, class111 arg1, class73 arg2, class73 arg3) {
        field164++;
        int var4 = arg1.method905(arg2, (byte) -72);
        if (arg0 != 40) {
            method21(-100, null);
        }
        int var5 = arg1.method902(0, var4, arg3);
        return class139.method1132(var5, arg0 ^ 0x30, arg1, var4);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method21(int arg0, byte[] arg1) {
        field163++;
        class114 var2 = new class114(arg1);
        int var3 = var2.method957((byte) 8);
        int var4 = var2.method973(-122);
        if (arg0 <= 84) {
            field161 = 1;
        }
        if (var4 < 0 || class2.field140 != 0 && class2.field140 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method955(0, -122, var7, var4);
            return var7;
        } else {
            int var5 = var2.method973(-124);
            if (var5 < 0 || class2.field140 != 0 && class2.field140 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class69.method575(var6, var5, arg1, var4, 9);
            } else {
                class126.field3225.method1032(var2, var6, 10);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
    public static final int method22(int arg0, int arg1, int arg2) {
        field160++;
        if (arg1 < 2) {
            if (arg0 >= -55) {
                method19(-41);
            }
            return arg1 == 1 ? arg2 : 1;
        }
        int var3 = method22(-99, arg1 >> 1, arg2 * arg2);
        if ((arg1 & 0x1) != 0) {
            var3 = arg2 * var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method23(int arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class94) {
            class94 var3 = (class94) arg1;
            arg1 = var3.field2388;
            var2 = var3.field2399 + " | ";
        } else {
            var2 = "";
        }
        field168++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 != -22286) {
            field159 = -86;
        }
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
}
