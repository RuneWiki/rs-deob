import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class449 extends class403 {

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field6109 = 0;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6107 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "Lnj;")
    public static class148 field6111;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 7)
    public static final void method2640(int arg0) {
        field6108++;
        int var1 = 0;
        if (class488.field6789.field6696) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class491.method2864(var1, false);
        class1.field23.method927(var1, -31264);
        class175.field2385.method1563(-27, var1);
        class150.field2121.method790(true, var1);
        class302.field4030.method1399(1, var1);
        if (arg0 >= -41) {
            field6109 = 66;
        }
        class188.method1084(6143, var1);
        class318.method1745(var1, 0);
        class48.method344((byte) 119, var1);
        class357.method2190(-22420, var1);
        if (class18.field258 == 10) {
            class119.method746(28, (byte) -122);
        } else if (class18.field258 == 30) {
            class119.method746(25, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 45)
    public static final void method2641(int arg0, int arg1) {
        class90.field1315 = false;
        class148.field2106 = 1;
        class4.field55 = -1;
        if (arg0 != 2) {
            return;
        }
        class409.field5607 = null;
        class410.field5618 = -1;
        field6110++;
        class165.field2285 = 0;
        class425.field5747 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLbt;)Lvo;", line = 65)
    public static final class31 method2642(byte arg0, class32 arg1) {
        field6105++;
        if (arg0 != -29) {
            method2640(-24);
        }
        return new class31(arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method219(-116), arg1.method201((byte) -110));
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 78)
    public static final String method2643(int arg0, Throwable arg1) throws IOException {
        field6106++;
        String var2;
        if ((arg1 instanceof class59)) {
            class59 var3 = (class59) arg1;
            arg1 = var3.field787;
            var2 = var3.field785 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                if (arg0 != -1) {
                    return null;
                }
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

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 152)
    public static void method2644(int arg0) {
        field6111 = null;
        if (arg0 <= -101) {
            field6107 = null;
        }
    }
}
