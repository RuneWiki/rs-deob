import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class362 {

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Z")
    public boolean field4643 = true;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "C")
    private char field4641;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field4644;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field4645;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Ljava/lang/String;")
    public String field4639;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lji;I)V")
    public final void method2097(class572 arg0, int arg1) {
        if (arg1 != 5042) {
            return;
        }
        field4644++;
        while (true) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 == 0) {
                return;
            }
            this.method2103(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method2098(Throwable arg0, byte arg1) throws IOException {
        field4633++;
        String var2;
        if ((arg0 instanceof class39)) {
            class39 var3 = (class39) arg0;
            arg0 = var3.field570;
            var2 = var3.field574 + " | ";
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
                String var18 = var2 + "| " + var8;
                if (arg1 != 109) {
                    return null;
                }
                return var18;
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

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method2099(int arg0, String arg1) {
        if (arg0 != 34167) {
            method2104(null, -33);
        }
        field4642++;
        return class697.method3855((byte) 82, field4645 == null ? (field4645 = method2105("qn")) : field4645, arg1);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Z")
    public final boolean method2100(byte arg0) {
        field4634++;
        if (arg0 <= 111) {
            return true;
        } else {
            return this.field4641 == 's';
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILhs;)I")
    public static final int method2101(int arg0, class304 arg1) {
        field4638++;
        if (arg0 != 34167) {
            return 96;
        } else if (class290.field3662 == arg1) {
            return 5890;
        } else if (class195.field2295 == arg1) {
            return 34167;
        } else if (class251.field3237 == arg1) {
            return 34168;
        } else if (class666.field9048 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2102(int arg0, int arg1, String[] arg2, byte arg3) {
        field4637++;
        if (arg3 > -98) {
            return null;
        } else if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg2[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILji;Z)V")
    private final void method2103(int arg0, class572 arg1, boolean arg2) {
        field4636++;
        if (!arg2) {
            return;
        }
        if (arg0 == 1) {
            this.field4641 = class171.method1030(arg1.method3083(255), true);
        } else if (arg0 == 2) {
            this.field4635 = arg1.method3064(-2031091464);
        } else if (arg0 == 4) {
            this.field4643 = false;
            return;
        } else if (arg0 == 5) {
            this.field4639 = arg1.method3072(255);
            return;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Loa;I)V")
    public static final void method2104(class650 arg0, int arg1) {
        class711.field9937 = class589.method3270(true, arg0, (byte) 127, class354.field4576);
        field4640++;
        class595.field7985 = class394.method2237(class354.field4576, arg0, 96);
        int var2 = -41 % ((78 - arg1) / 43);
        class616.field8348 = class589.method3270(true, arg0, (byte) 126, client.field3562);
        class321.field3994 = class394.method2237(client.field3562, arg0, 66);
        class336.field4143 = class589.method3270(true, arg0, (byte) 122, class303.field3837);
        class36.field540 = class394.method2237(class303.field3837, arg0, -72);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2105(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
