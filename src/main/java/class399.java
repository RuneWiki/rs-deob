import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class399 {

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "S")
    public short field5623;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "Lew;")
    public class458 field5629;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "B")
    public byte field5630;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "B")
    public byte field5633;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "[I")
    public static int[] field5627 = new int[1];

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "Lbb;")
    public static class304 field5624;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "[Li;")
    public static class37[] field5631;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method2412(Throwable arg0, int arg1) throws IOException {
        field5625++;
        String var3;
        if (arg0 instanceof class56) {
            class56 var2 = (class56) arg0;
            arg0 = var2.field890;
            var3 = var2.field891 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg1 <= 61) {
            field5631 = null;
        }
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

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(III)I")
    public static final int method2413(int arg0, int arg1, int arg2) {
        field5628++;
        if (arg0 < 72) {
            field5627 = null;
        }
        int var3 = arg2 - 1 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method2414(String arg0, boolean arg1) {
        field5632++;
        if (arg0 == null) {
            return null;
        }
        if (arg1) {
            field5624 = null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class571.method3342(-67, arg0.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class571.method3342(-88, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class322.method1871(var7, -39)) {
                char var8 = class370.method2140(var7, 107);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public static void method2415(byte arg0) {
        field5627 = null;
        if (arg0 == -34) {
            field5631 = null;
            field5624 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public static final void method2416(int arg0) {
        field5626++;
        if (class127.field1619 == -1) {
            return;
        }
        int var1 = class478.field6713.method1349(18);
        int var2 = class478.field6713.method1338(arg0 ^ 0x1);
        class471 var3 = (class471) class404.field5707.method1132((byte) -99);
        if (var3 != null) {
            var1 = var3.method1729(false);
            var2 = var3.method1733((byte) 69);
        }
        class94.method730(class300.field4038, 0, 0, 0, arg0, var1, arg0 + 90, var2, class467.field6533, class127.field1619);
        if (class112.field1431 != null) {
            class702.method3934(var2, (byte) -125, var1);
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lew;III)V")
    public class399(class458 arg0, int arg1, int arg2, int arg3) {
        this.field5623 = (short) arg1;
        this.field5629 = arg0;
        this.field5630 = (byte) arg2;
        this.field5633 = (byte) arg3;
    }
}
