import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class164 extends class435 {

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field2466 = 0;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2467 = "Loaded fonts";

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field2470 = 0;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field2473 = new String[200];

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "Ljava/lang/String;")
    public String field2465;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static final void method1269(int arg0) {
        field2469++;
        if (arg0 != 0) {
            field2470 = 79;
        }
        if (class42.field640 != null && class133.field2145 != null) {
            return;
        }
        class133.field2145 = new int[256];
        class42.field640 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class42.field640[var1] = (int) (Math.sin(var2) * 4096.0D);
            class133.field2145[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1270(int arg0, String arg1) {
        field2462++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public static final void method1271(int arg0) {
        class447.field6511.method112(0);
        field2463++;
        int var1 = 80 / ((arg0 - 52) / 43);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method1272(boolean arg0) {
        field2473 = null;
        if (!arg0) {
            field2467 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2474++;
        class32 var10 = null;
        for (class32 var11 = (class32) class346.field4881.method157((byte) -125); var11 != null; var11 = (class32) class346.field4881.method145(85)) {
            if (var11.field458 == arg8 && var11.field459 == arg7 && var11.field462 == arg3 && var11.field460 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class32();
            var10.field460 = arg6;
            var10.field459 = arg7;
            var10.field462 = arg3;
            var10.field458 = arg8;
            class91.method769(var10, 2);
            class346.field4881.method148((byte) 126, var10);
        }
        if (arg2 != 256) {
            method1271(-124);
        }
        var10.field451 = arg5;
        var10.field448 = arg9;
        var10.field446 = arg1;
        var10.field450 = arg0;
        var10.field454 = arg4;
    }
}
