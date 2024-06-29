import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class503 extends class544 {

    @OriginalMember(owner = "client!eba", name = "F", descriptor = "Z")
    public static boolean field6986 = false;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
    public int field6969;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    public int field6972;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    public int field6976;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!eba", name = "y", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "I")
    public int field6981;

    @OriginalMember(owner = "client!eba", name = "A", descriptor = "I")
    public int field6982;

    @OriginalMember(owner = "client!eba", name = "C", descriptor = "I")
    public int field6984;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "Let;")
    public class509 field6973;

    @OriginalMember(owner = "client!eba", name = "B", descriptor = "Let;")
    public class509 field6983;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "Lip;")
    public static class604 field6971;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "Ljava/lang/String;")
    public String field6977;

    @OriginalMember(owner = "client!eba", name = "E", descriptor = "Z")
    public boolean field6985;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field6975;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 7)
    public static void method2903(byte arg0) {
        field6971 = null;
        if (arg0 <= 80) {
            field6970 = -1;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IILet;)I", line = 25)
    public static final int method2904(int arg0, int arg1, class509 arg2) {
        if (arg0 != -17570) {
            return 47;
        }
        field6980++;
        if (!client.method1412(arg2).method1506(arg1, (byte) -128) && arg2.field7176 == null) {
            return -1;
        } else if (arg2.field7103 == null || arg2.field7103.length <= arg1) {
            return -1;
        } else {
            return arg2.field7103[arg1];
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;", line = 40)
    public static final String method2905(Throwable arg0, boolean arg1) throws IOException {
        field6974++;
        if (arg1) {
            method2904(-17, -71, null);
        }
        String var2;
        if ((arg0 instanceof class399)) {
            class399 var3 = (class399) arg0;
            arg0 = var3.field5254;
            var2 = var3.field5253 + " | ";
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

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZB)V", line = 116)
    public static final void method2906(boolean arg0, byte arg1) {
        field6968++;
        class93.method560(true);
        if (arg1 != 75 || !class524.method2978(class137.field1671, 119)) {
            return;
        }
        class472.field6609++;
        if (class472.field6609 < 50 && !arg0) {
            return;
        }
        class472.field6609 = 0;
        if (!class103.field1264 && class597.field8642 != null) {
            class578.field8434++;
            class418.method2378(17984, class61.field594);
            try {
                class597.field8642.method2264(0, 0, class136.field1663.field4929, class136.field1663.field4966);
                class136.field1663.field4966 = 0;
            } catch (IOException var2) {
                class103.field1264 = true;
            }
        }
        class93.method560(true);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(FIIIIIZI)[I", line = 159)
    public static final int[] method2907(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field6978++;
        int[] var8 = new int[arg2];
        class513 var9 = new class513();
        var9.field7238 = arg6;
        var9.field7246 = arg3;
        var9.field7250 = arg5;
        var9.field7248 = arg1;
        var9.field7239 = arg4;
        var9.field7242 = (int) (arg0 * 4096.0F);
        var9.method438(-2);
        if (arg7 != -28918) {
            field6970 = -40;
        }
        class218.method1257((byte) -5, arg2, 1);
        var9.method2947(var8, 0, arg7 ^ 0xFFFFA3D8);
        return var8;
    }
}
