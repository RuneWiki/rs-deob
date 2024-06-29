import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class286 extends class71 {

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static int field5091 = -1;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "Lud;")
    public static class279 field5092 = class130.method1024("::shiftclick", 255);

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "Lud;")
    public static class279 field5097 = class130.method1024("Lade Wordpack )2 ", 255);

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "Lud;")
    public static class279 field5094 = class130.method1024("cookieprefix", 255);

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method2043(int arg0, int arg1, int arg2, int arg3) {
        field5096++;
        if (~(class257.field4573[arg2][arg0][arg3] & 0x8) == arg1) {
            return arg2 <= 0 || (class257.field4573[1][arg0][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V", line = 22)
    public static final void method2044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5093++;
        int var7 = class125.method1001(arg2, class108.field2002, false, class135.field2463);
        int var8 = class125.method1001(arg1, class108.field2002, false, class135.field2463);
        int var9 = class125.method1001(arg6, class44.field929, false, class249.field4449);
        int var10 = class125.method1001(arg4, class44.field929, false, class249.field4449);
        int var11 = class125.method1001(arg2 + arg3, class108.field2002, false, class135.field2463);
        int var12 = class125.method1001(arg1 - arg3, class108.field2002, false, class135.field2463);
        for (int var13 = var7; var13 < var11; var13++) {
            class152.method1208(var9, arg0, var10, class182.field3348[var13], -7);
        }
        int var14 = 62 / ((arg5 - 61) / 54);
        for (int var15 = var8; var15 > var12; var15--) {
            class152.method1208(var9, arg0, var10, class182.field3348[var15], -7);
        }
        int var16 = class125.method1001(arg3 + arg6, class44.field929, false, class249.field4449);
        int var17 = class125.method1001(arg4 - arg3, class44.field929, false, class249.field4449);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class182.field3348[var18];
            class152.method1208(var9, arg0, var16, var19, -7);
            class152.method1208(var17, arg0, var10, var19, -7);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V", line = 73)
    public static final void method2045(int arg0, int arg1) {
        class12 var2 = class166.field2993;
        synchronized (class166.field2993) {
            class7.field142 = arg1;
            if (arg0 != 41) {
                field5094 = (class279) null;
            }
        }
        field5095++;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V", line = 89)
    public static void method2046(byte arg0) {
        field5094 = null;
        field5097 = null;
        field5092 = null;
        if (arg0 != 66) {
            field5094 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 115)
    public class286() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 120)
    public static final String method2047(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class78) {
            class78 var2 = (class78) arg1;
            var3 = var2.field1498 + " | ";
            arg1 = var2.field1503;
        } else {
            var3 = "";
        }
        field5100++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg0 != -1) {
            field5091 = -54;
        }
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
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
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lvh;I)Lul;", line = 194)
    public static final class43 method2048(class53 arg0, int arg1) {
        class43 var2 = new class43(arg0.method467((byte) -16), arg0.method467((byte) -16), arg0.method468(28214), arg0.method468(28214), arg0.method453(1), arg0.method483(-107) == 1, arg0.method483(-106));
        int var3 = arg0.method483(-112);
        for (int var4 = arg1; var4 < var3; var4++) {
            var2.field890.method2246(true, new class62(arg0.method468(28214), arg0.method468(28214), arg0.method468(28214), arg0.method468(arg1 + 28214)));
        }
        field5099++;
        var2.method364((byte) 32);
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IB)[I", line = 217)
    public final int[] method199(int arg0, byte arg1) {
        field5098++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[][] var4 = this.method619(0, 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class215.field3787; var8++) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg1 > -69) {
            method2045(-17, 36);
        }
        return var3;
    }
}
