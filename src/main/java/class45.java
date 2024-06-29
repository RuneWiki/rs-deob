import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class45 extends class259 {

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field589 = 0;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field592 = 0;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field590 = "purple:";

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "[Loe;")
    public static class76[] field609 = new class76[14];

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "Luk;")
    public class105 field611;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "Ltd;")
    public class184 field598;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "Lha;")
    public class25 field603;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "Lu;")
    public class33 field605;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "[S")
    public static short[] field610;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)Lem;")
    public static final class87 method270(byte arg0, int arg1) {
        field601++;
        if (arg1 == 0) {
            return new class166();
        } else if (arg1 == 1) {
            return new class85();
        } else if (arg1 == 2) {
            return new class218();
        } else if (arg1 == 3) {
            return new class200();
        } else if (arg1 == 4) {
            return new class246();
        } else if (arg1 == 5) {
            return new class24();
        } else if (arg1 == 6) {
            return new class30();
        } else if (arg1 == 7) {
            return new class209();
        } else if (arg1 == 8) {
            return new class40();
        } else if (arg1 == 9) {
            return new class281();
        } else if (arg1 == 10) {
            return new class63();
        } else if (arg1 == 11) {
            return new class44();
        } else if (arg1 == 12) {
            return new class86();
        } else if (arg1 == 13) {
            return new class291();
        } else if (arg1 == 14) {
            return new class69();
        } else if (arg1 == 15) {
            return new class121();
        } else if (arg1 == 16) {
            return new class212();
        } else if (arg1 == 17) {
            return new class38();
        } else if (arg1 == 18) {
            return new class160();
        } else if (arg1 == 19) {
            return new class20();
        } else if (arg1 == 20) {
            return new class243();
        } else if (arg1 == 21) {
            return new class220();
        } else if (arg1 == 22) {
            return new class128();
        } else if (arg1 == 23) {
            return new class169();
        } else if (arg1 == 24) {
            return new class287();
        } else if (arg1 == 25) {
            return new class264();
        } else if (arg1 == 26) {
            return new class191();
        } else if (arg1 == 27) {
            return new class71();
        } else if (arg1 == 28) {
            return new class180();
        } else if (arg1 == 29) {
            return new class282();
        } else if (arg1 == 30) {
            return new class119();
        } else if (arg1 == 31) {
            return new class7();
        } else if (arg1 == 32) {
            return new class280();
        } else if (arg1 == 33) {
            return new class36();
        } else if (arg1 == 34) {
            return new class199();
        } else if (arg1 == 35) {
            return new class254();
        } else if (arg1 == 36) {
            return new class110();
        } else if (arg1 == 37) {
            return new class161();
        } else if (arg1 == 38) {
            return new class237();
        } else if (arg1 == 39) {
            return new class195();
        } else if (arg0 == -12) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
    public static void method271(int arg0) {
        field610 = null;
        if (arg0 == 4) {
            field609 = null;
            field590 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V")
    public final void method272(int arg0) {
        field595++;
        if (arg0 == -25041) {
            this.field611 = null;
            this.field605 = null;
            this.field598 = null;
            this.field603 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method273(Throwable arg0, int arg1) throws IOException {
        field615++;
        String var2;
        if ((arg0 instanceof class17)) {
            class17 var3 = (class17) arg0;
            arg0 = var3.field182;
            var2 = var3.field177 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != 41) {
            return null;
        }
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
}
