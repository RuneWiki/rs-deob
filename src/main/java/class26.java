import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class26 extends class76 {

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    private int field498 = 0;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    private int field501 = 20;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    private int field502 = 0;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    private int field504 = 1365;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "Lw;")
    public static class82 field505 = new class82(64);

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "I")
    public static int field510 = -1;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "Lia;")
    private static class257 field514 = class28.method234(-25, "Select");

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lia;")
    public static class257 field509 = field514;

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
    public static int field513 = 255;

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "Lia;")
    public static class257 field508 = class28.method234(-119, "<img=0>");

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "Lia;")
    public static class257 field511;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        if (arg0 != -9351) {
            field511 = null;
        }
        ++field497;
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            for (int var4 = 0; class96.field1807 > var4; ++var4) {
                int var5 = (class137.field2457[var4] << 12) / this.field504 + this.field498;
                int var6 = var5;
                int var7 = (class10.field197[arg1] << 12) / this.field504 + this.field502;
                int var8 = var7;
                int var9 = var5;
                int var10 = var7;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                int var13 = var7 * var7 >> 12;
                while (~(var11 + var13) > -16385 && ~var12 > ~this.field501) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var13 + var11 + var6;
                    var13 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                    ++var12;
                }
                var3[var4] = ~var12 <= ~(this.field501 + -1) ? 0 : (var12 << 12) / this.field501;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field502 = arg0.method1063(-17162);
                    }
                } else {
                    this.field498 = arg0.method1063(-17162);
                }
            } else {
                this.field501 = arg0.method1063(-17162);
            }
        } else {
            this.field504 = arg0.method1063(-17162);
        }
        if (arg1 > -86) {
            this.field501 = -11;
        }
        ++field500;
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
    public static void method226(int arg0) {
        field509 = null;
        field508 = null;
        field505 = null;
        field511 = null;
        if (arg0 != -24539) {
            method227((byte) -116);
        }
        field514 = null;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    public static final void method227(byte arg0) {
        class44.field994.method833(0);
        class39.field783.method833(0);
        ++field503;
        class231.field3875.method833(0);
        if (arg0 < 89) {
            field514 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
    public static final void method228(byte arg0) {
        if (arg0 <= 89) {
            field513 = 86;
        }
        if (~class217.field3675 == -31) {
            class209.method1404((byte) -38, 25);
        }
        ++field499;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)Z")
    public static final boolean method229(int arg0, int arg1) {
        if (arg0 != 17431692) {
            method229(-108, 11);
        }
        ++field507;
        return (1 & arg1 >> 28) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method230(Throwable arg0, int arg1) throws IOException {
        String var3;
        if (arg0 instanceof class144) {
            class144 var2 = (class144) arg0;
            arg0 = var2.field2521;
            var3 = var2.field2520 + " | ";
        } else {
            var3 = "";
        }
        ++field506;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg1 != 40) {
            return null;
        } else {
            while (true) {
                while (true) {
                    String var9 = var7.readLine();
                    if (var9 == null) {
                        return var3 + "| " + var8;
                    }
                    int var10 = var9.indexOf(40);
                    int var11 = var9.indexOf(41, var10 + 1);
                    if (~var10 <= -1 && ~var11 <= -1) {
                        String var12 = var9.substring(var10 - -1, var11);
                        int var13 = var12.indexOf(".java:");
                        if (var13 >= 0) {
                            String var14 = var12.substring(0, var13) + var12.substring(var13 - -5);
                            var3 = var3 + var14 + ' ';
                            continue;
                        }
                        var9 = var9.substring(0, var10);
                    }
                    String var15 = var9.trim();
                    String var16 = var15.substring(1 + var15.lastIndexOf(32));
                    String var17 = var16.substring(var16.lastIndexOf(9) - -1);
                    var3 = var3 + var17 + ' ';
                }
            }
        }
    }
}
