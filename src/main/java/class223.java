import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class223 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field3520 = 0;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3523 = null;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field3524 = -1;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;", line = 6)
    public static final String method1478(boolean arg0, Throwable arg1) throws IOException {
        String var2;
        if ((arg1 instanceof class61)) {
            class61 var3 = (class61) arg1;
            arg1 = var3.field1181;
            var2 = var3.field1175 + " | ";
        } else {
            var2 = "";
        }
        field3522++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (!arg0) {
            return (String) null;
        }
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var2 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var2 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lvj;", line = 77)
    public static final class103 method1479(byte arg0) {
        field3518++;
        class74.field1525 = 0;
        if (arg0 != 71) {
            method1480(-11);
        }
        return class204.method1368(16711680);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 89)
    public static final void method1480(int arg0) {
        class185.method1183(104);
        field3521++;
        class114.method745((byte) -123);
        class219.method1460(-101);
        class116.method770(-29977);
        class234.method1554((byte) -111);
        class15.method113(118);
        class325.method2251(-15005);
        class125.method832((byte) 102);
        class156.method1013(arg0 ^ 0xFFFFE7F6);
        class215.method1444(-51);
        class153.method998(true);
        class286.method1931(arg0);
        class58.method449(128);
        class24.method199(0);
        class160.method1032(8741);
        class154.method1000(arg0 ^ 0xFFFFFCFF);
        class293.method1965(true);
        class337.method2334((byte) -86);
        class216.method1448(-23189);
        class45.method360(16711680);
        class269.field4156.method1877(arg0 - 29701);
        class21.field445.method1877(-29702);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 123)
    public static void method1481(int arg0) {
        field3523 = null;
        if (arg0 != -17848) {
            field3523 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)I", line = 135)
    public static final int method1482(int arg0, byte arg1) {
        field3525++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        int var3 = 48 % ((8 - arg1) / 58);
        return arg0 + var2;
    }
}
