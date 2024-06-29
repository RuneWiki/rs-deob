import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class7 extends class199 {

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "[[B")
    public static byte[][] field88 = new byte[250][];

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field82 = -1;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field84 = -1;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "S")
    public static short field98 = 320;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field95 = 0;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "B")
    public static byte field97;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Lgd;")
    private class170 field96;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "[Lwj;")
    public static class270[] field93;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)I", line = 7)
    public final int method55(int arg0, int arg1, byte arg2) {
        field94++;
        if (this.field96 == null) {
            return arg1;
        }
        if (arg2 != -35) {
            field82 = 121;
        }
        class295 var4 = (class295) this.field96.method1222(0, (long) arg0);
        return var4 == null ? arg1 : var4.field4562;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 34)
    public static final void method56(byte arg0) {
        if (arg0 != 59) {
            method60(-114);
        }
        class320.field5001 = null;
        class306.field4757 = (byte[][]) null;
        class75.field1215 = null;
        class73.field1201 = null;
        class63.field1002 = null;
        field100++;
        class97.field1546 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 50)
    public static final String method57(int arg0, Throwable arg1) throws IOException {
        field87++;
        String var3;
        if (arg1 instanceof class274) {
            class274 var2 = (class274) arg1;
            var3 = var2.field4236 + " | ";
            arg1 = var2.field4242;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        if (arg0 != 0) {
            return (String) null;
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
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
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLkh;I)V", line = 126)
    private final void method58(boolean arg0, class166 arg1, int arg2) {
        if (arg0) {
            return;
        }
        if (arg2 == 249) {
            int var4 = arg1.method1178(0);
            if (this.field96 == null) {
                int var5 = class10.method73((byte) -75, var4);
                this.field96 = new class170(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1178(0) == 1;
                int var8 = arg1.method1156((byte) 94);
                class46 var9;
                if (var7) {
                    var9 = new class214(arg1.method1179((byte) -111));
                } else {
                    var9 = new class295(arg1.method1137(-123));
                }
                this.field96.method1227(var9, 0, (long) var8);
            }
        }
        field90++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V", line = 179)
    public static final void method59(int arg0, byte arg1) {
        if (arg1 < -96) {
            class338 var2 = class195.method1391(3, (byte) -92, arg0);
            var2.method2347(true);
            field89++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V", line = 202)
    public static void method60(int arg0) {
        field93 = null;
        if (arg0 != 0) {
            field98 = 52;
        }
        field88 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLkh;)V", line = 215)
    public final void method61(boolean arg0, class166 arg1) {
        field83++;
        if (arg0) {
            this.method61(false, (class166) null);
        }
        while (true) {
            int var3 = arg1.method1178(0);
            if (var3 == 0) {
                return;
            }
            this.method58(arg0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 235)
    public static final void method62(byte arg0) {
        field91++;
        class156.method1070((byte) -52);
        class89.method648(28);
        class267.method1846((byte) 65);
        class297.method2013((byte) 112);
        class11.method86((byte) 81);
        class103.method746((byte) -104);
        class106.method767((byte) 33);
        class212.method1489((byte) -66);
        class314.method2129(-122);
        class316.method2149(18266);
        class118.method866(4);
        class320.method2177(-106);
        class332.method2307(-7703);
        class299.method2023(-67);
        class116.method856(-42);
        class148.method1028((byte) -32);
        int var1 = -49 % ((arg0 + 52) / 32);
        class314.method2127(false);
        class299.method2026(-10);
        class65.method495(true);
        class65.method496((byte) 96);
        class278.field4288.method2174(-10385);
        class338.field5280.method2174(-10385);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 266)
    public final String method63(int arg0, int arg1, String arg2) {
        field99++;
        if (this.field96 == null) {
            return arg2;
        } else {
            class214 var4 = (class214) this.field96.method1222(arg0, (long) arg1);
            return var4 == null ? arg2 : var4.field3259;
        }
    }
}
