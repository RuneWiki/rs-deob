import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public abstract class class178 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Ldj;")
    private static class44 field3056 = class89.method650(255, "To create a new account you need to");

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Ldj;")
    public static class44 field3063 = class89.method650(255, "Benutzername: ");

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Z")
    public static boolean field3064 = false;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Ldj;")
    private static class44 field3057 = class89.method650(255, "Take");

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Ldj;")
    public static class44 field3065 = field3057;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Ldj;")
    public static class44 field3060 = field3056;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static final void method1124(int arg0) {
        if (arg0 < 6) {
            field3064 = false;
        }
        class71.field1357 = null;
        class120.field2143 = null;
        field3061++;
        class106.field1943 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
    public static final void method1125(int arg0, int arg1, int arg2) {
        field3062++;
        if (class87.field1667 != 0 && arg2 != -1) {
            method1128(class87.field1667, arg2, false, 10000, 0, class102.field1856);
            class197.field3490 = true;
        }
        if (arg1 <= 102) {
            field3060 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1126(Throwable arg0, int arg1) throws IOException {
        field3058++;
        if (arg1 != -1596) {
            method1124(-77);
        }
        String var3;
        if (arg0 instanceof class101) {
            class101 var2 = (class101) arg0;
            arg0 = var2.field1846;
            var3 = var2.field1841 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
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

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 32) {
            field3056 = null;
        }
        field3055++;
        if (arg1 < 1 || arg2 < 1 || arg1 > 102 || arg2 > 102) {
            return;
        }
        if (class33.field583 && class194.field3403 != arg5) {
            return;
        }
        int var8 = arg5;
        if (arg5 < 3 && (class47.field875[1][arg1][arg2] & 0x2) == 2) {
            var8 = arg5 + 1;
        }
        class139.method936(false, arg2, var8, arg1, class73.field1390[arg5], arg0, arg5);
        if (arg6 >= 0) {
            class53.method380(false, arg1, class73.field1390[arg5], arg7, -83, arg6, false, arg2, arg3, arg5, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B[B)V")
    public abstract void method967(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZIILve;)V")
    public static final void method1128(int arg0, int arg1, boolean arg2, int arg3, int arg4, class225 arg5) {
        class130.field2320 = arg1;
        class101.field1851 = 1;
        field3059++;
        class52.field940 = arg4;
        class19.field322 = arg0;
        class134.field2399 = arg5;
        class174.field3027 = arg2;
        class115.field2065 = arg3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method968(boolean arg0);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static void method1129(int arg0) {
        field3063 = null;
        field3065 = null;
        field3057 = null;
        field3056 = null;
        int var1 = -38 % ((-arg0 - 33) / 43);
        field3060 = null;
    }
}
