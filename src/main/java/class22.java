import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 extends class17 {

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public int field534 = 0;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public int field544 = -1;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Lke;")
    public static class65 field526 = class1.method17("blinken1:", -115);

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Lke;")
    public static class65 field531 = class1.method17("Bitte benutzen Sie eine andere Welt)3", -127);

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Lke;")
    public static class65 field529 = class1.method17("Bitte entfernen Sie ", -112);

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lke;")
    private static class65 field521 = class1.method17("No matching objects found)1 please shorten search", -119);

    @OriginalMember(owner = "client!d", name = "A", descriptor = "Lke;")
    public static class65 field525 = class1.method17("Hier klicken)1 um fortzufahren)3)3)3", -126);

    @OriginalMember(owner = "client!d", name = "W", descriptor = "Lke;")
    private static class65 field545 = class1.method17("No reply from loginserver)3", -124);

    @OriginalMember(owner = "client!d", name = "N", descriptor = "Lke;")
    public static class65 field537 = field521;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Lke;")
    public static class65 field532 = field545;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "Lke;")
    private static class65 field549 = class1.method17("We suspect someone knows your password)3", -122);

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lke;")
    public static class65 field542 = field549;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "Luc;")
    public static class119 field538;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Luc;")
    public static class119 field539;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "Lpa;")
    public static class90 field535;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 40)
    public static void method174(boolean arg0) {
        field539 = null;
        if (!arg0) {
            return;
        }
        field549 = null;
        field545 = null;
        field525 = null;
        field542 = null;
        field537 = null;
        field535 = null;
        field529 = null;
        field521 = null;
        field538 = null;
        field526 = null;
        field531 = null;
        field532 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 70)
    public static final String method175(byte arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class116) {
            class116 var3 = (class116) arg1;
            var2 = var3.field2913 + " | ";
            arg1 = var3.field2911;
        } else {
            var2 = "";
        }
        field533++;
        if (arg0 <= 18) {
            return null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
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
}
