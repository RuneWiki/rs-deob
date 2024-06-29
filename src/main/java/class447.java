import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class447 extends class437 {

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    private int field6438;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    private int field6434;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    private int field6443;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    private int field6431;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Ljava/lang/String;")
    public static String field6427 = "Discard";

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "Ljava/lang/String;")
    public static String field6435 = "Loaded title screen";

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field6429 = 0;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "J")
    public static volatile long field6428 = 0L;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "Ljava/lang/String;")
    public static String field6444 = "Attack";

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)V", line = 12)
    public final void method295(int arg0, int arg1, int arg2) {
        if (arg2 != -11654) {
            this.field6438 = -18;
        }
        ++field6424;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(III)V", line = 22)
    public final void method290(int arg0, int arg1, int arg2) {
        ++field6432;
        int var4 = this.field6443 * arg2 >> 12;
        int var5 = this.field6434 * arg2 >> 12;
        int var6 = this.field6431 * arg0 >> 12;
        int var7 = this.field6438 * arg0 >> 12;
        if (arg1 != 8224) {
            this.field6438 = -95;
        }
        class39.method293(var4, var5, super.field6349, (byte) 88, var6, var7);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 50)
    public static final String method2772(Throwable arg0, int arg1) throws IOException {
        if (arg1 != 1) {
            method2775((class185) null, (byte) -28);
        }
        ++field6440;
        String var2;
        if (!(arg0 instanceof class125)) {
            var2 = "";
        } else {
            class125 var3 = (class125) arg0;
            arg0 = var3.field1620;
            var2 = var3.field1624 + " | ";
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
            String var15 = var14.substring(var14.lastIndexOf(9) - -1);
            String var16 = var2 + var15;
            if (var10 != -1 && ~var11 != 0) {
                int var17 = var9.indexOf(".java:", var10);
                if (~var17 <= -1) {
                    var16 = var16 + var9.substring(var17 - -5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;ZBLos;)V", line = 138)
    public static final void method2773(String arg0, boolean arg1, byte arg2, class129 arg3) {
        ++field6426;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        if (arg2 != -41) {
            field6429 = -38;
        }
        int var7 = class298.field4504.method2700((class315[]) null, (byte) -21, arg0, 250);
        int var8 = 13 * class298.field4504.method2694(250, arg0, (class315[]) null, -72);
        class126.field1647.method435(-var4 + var5, -var4 + var6, var7 - (-var4 + -var4), var8 - (-var4 + -var4), -16777216, 0);
        class126.field1647.method511(-var4 + var5, var6 - var4, var4 + var4 + var7, var8 - -var4 + var4, -1, 0);
        arg3.method916(var5, 16, var8, 0, -1, arg0, (class421) null, var6, 0, 1, (int[]) null, 1, (class315[]) null, -1, var7, 0);
        class435.method2723(var4 + var8 + var4, (byte) -111, var4 + var4 + var7, -var4 + var6, -var4 + var5);
        if (arg1) {
            class126.field1647.method471();
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V", line = 168)
    public final void method294(int arg0, int arg1, int arg2) {
        ++field6437;
        if (arg0 != 352) {
            method2777(28, -40, 46);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIII)V", line = 179)
    public class447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6438 = arg3;
        this.field6434 = arg2;
        this.field6443 = arg0;
        this.field6431 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V", line = 190)
    public static final void method2774(byte arg0) {
        class51 var1 = class195.field2699;
        synchronized (class195.field2699) {
            if (arg0 >= -13) {
                field6435 = null;
            }
            class195.field2699.method366(-74);
        }
        ++field6439;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lir;B)V", line = 203)
    public static final void method2775(class185 arg0, byte arg1) {
        class435.field6307 = arg0;
        ++field6441;
        if (arg1 < 94) {
            method2776(-116);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 222)
    public static void method2776(int arg0) {
        field6444 = null;
        field6427 = null;
        if (arg0 != 0) {
            field6430 = -112;
        }
        field6435 = null;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(III)Z", line = 234)
    public static final boolean method2777(int arg0, int arg1, int arg2) {
        ++field6425;
        if (!class165.field2244) {
            return false;
        } else {
            int var3 = arg0 >> 16;
            if (arg2 < 53) {
                method2774((byte) 28);
            }
            int var4 = arg0 & 65535;
            if (class4.field71[var3] != null && class4.field71[var3][var4] != null) {
                class248 var5 = class4.field71[var3][var4];
                if (arg1 == -1 && var5.field3555 == 0) {
                    for (class138 var6 = (class138) class186.field2547.method1575(0); var6 != null; var6 = (class138) class186.field2547.method1573((byte) -128)) {
                        if (~var6.field1777 == -52 || ~var6.field1777 == -1009 || ~var6.field1777 == -51 || var6.field1777 == 6 || var6.field1777 == 59) {
                            for (class248 var7 = class27.method224(65535, var6.field1781); var7 != null; var7 = class372.method2446(-14263, var7)) {
                                if (~var5.field3636 == ~var7.field3636) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class138 var8 = (class138) class186.field2547.method1575(0); var8 != null; var8 = (class138) class186.field2547.method1573((byte) -128)) {
                        if (~var8.field1782 == ~arg1 && var5.field3636 == var8.field1781 && (var8.field1777 == 51 || ~var8.field1777 == -1009 || var8.field1777 == 50 || var8.field1777 == 6 || ~var8.field1777 == -60)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }
}
