import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class41 {

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field706 = 0;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field707;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Llj;IB)V")
    public final void method315(class25 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method189((byte) -103);
            if (var4 == 0) {
                field708++;
                if (arg2 != -82) {
                    method317((byte) 58);
                    return;
                }
                return;
            }
            this.method318(var4, arg1, arg0, 122);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method316(int arg0) {
        field699++;
        int var1 = 0;
        if (arg0 != -13732) {
            field706 = -97;
        }
        while (var1 < class112.field1845) {
            int var2 = class46.field767[var1];
            class61 var3 = class46.field756[var2];
            if (var3 != null) {
                class99.method693(var3, var3.field987.field4489, (byte) -124);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method317(byte arg0) {
        int var1 = -27 / ((arg0 - 63) / 63);
        field707 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILlj;I)V")
    private final void method318(int arg0, int arg1, class25 arg2, int arg3) {
        if (arg0 == 1) {
            this.field700 = arg2.method193((byte) 77);
        } else if (arg0 == 2) {
            this.field704 = arg2.method189((byte) -103);
            this.field701 = arg2.method189((byte) -103);
        }
        field705++;
        if (arg3 <= 27) {
            method316(19);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Lti;")
    public static final class5 method319(int arg0) {
        field702++;
        class5 var1 = new class5(class93.field1512, class221.field3828, class243.field4263[arg0], class124.field2172[0], class97.field1562[0], class57.field915[0], class182.field3178[0], class16.field309);
        class126.method868(arg0 - 15434);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method320(int arg0, Throwable arg1) throws IOException {
        field703++;
        String var3;
        if (arg1 instanceof class209) {
            class209 var2 = (class209) arg1;
            arg1 = var2.field3601;
            var3 = var2.field3605 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 != 40) {
            method316(-80);
        }
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

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Leg;")
    public final class223 method321(byte arg0) {
        field709++;
        if (arg0 != 13) {
            return null;
        }
        class223 var2 = (class223) class19.field349.method1480((byte) 50, (long) this.field700);
        if (var2 != null) {
            return var2;
        }
        class223 var3 = class16.method129(0, this.field700, (byte) -98, class236.field4109);
        if (var3 != null) {
            class19.field349.method1483((byte) -128, (long) this.field700, var3);
        }
        return var3;
    }
}
