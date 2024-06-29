import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class class27 extends class631 {

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "Llg;")
    public static class32 field382 = new class32(1, 2, 2, 0);

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "Leba;")
    public static class550 field394 = new class550(80, 6);

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "Leba;")
    public static class550 field395 = new class550(112, 19);

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "J")
    public static long field399 = -1L;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "Z")
    public static boolean field401 = false;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "Lsr;")
    public static class468 field400 = null;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "B")
    public byte field385;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "B")
    public byte field386;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "Z")
    public boolean field389;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "[I")
    public static int[] field392;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILwv;Lua;BIILf;)V")
    public static final void method160(int arg0, int arg1, class423 arg2, class596 arg3, byte arg4, int arg5, int arg6, class532 arg7) {
        if (arg4 <= 43) {
            field392 = null;
        }
        field387++;
        if (arg7 == null) {
            return;
        }
        int var8;
        if (class311.field4200 == 4) {
            var8 = (int) class565.field7707 & 0x3FFF;
        } else {
            var8 = (int) class565.field7707 + class478.field6651 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field5561 / 2, arg2.field5672 / 2) + 10;
        int var10 = arg1 * arg1 + arg5 * arg5;
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class240.field3176[var8];
        int var12 = class240.field3177[var8];
        if (class311.field4200 != 4) {
            var11 = var11 * 256 / (class424.field5716 + 256);
            var12 = var12 * 256 / (class424.field5716 + 256);
        }
        int var13 = arg1 * var11 + arg5 * var12 >> 14;
        int var14 = arg1 * var12 - (arg5 * var11) >> 14;
        arg7.method219(arg2.field5561 / 2 + arg6 - (-var13 + arg7.method523() / 2), -var14 + arg2.field5672 / 2 + arg0 + -(arg7.method532() / 2), arg3, arg6, arg0);
    }

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)Z")
    public abstract boolean method161(int arg0);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method162(int arg0, Throwable arg1) throws IOException {
        field393++;
        String var2;
        if ((arg1 instanceof class614)) {
            class614 var3 = (class614) arg1;
            arg1 = var3.field8509;
            var2 = var3.field8508 + " | ";
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
                if (arg0 < 115) {
                    field395 = null;
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

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "(I)V")
    public static final void method163(int arg0) {
        int var1 = -35 / ((10 - arg0) / 62);
        field391++;
        class440.field5830.method2168((byte) -89);
    }

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)Z")
    public abstract boolean method164(int arg0);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLr;)Lqw;")
    public abstract class329 method165(byte arg0, class562 arg1);

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "(I)Z")
    public abstract boolean method166(int arg0);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZLr;II)Z")
    public abstract boolean method167(boolean arg0, class562 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "(I)Z")
    public abstract boolean method168(int arg0);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILir;ZILr;IB)V")
    public abstract void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([Lqea;B)I")
    public abstract int method170(class392[] arg0, byte arg1);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)Z")
    public abstract boolean method171(boolean arg0);

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "(I)V")
    public static void method172(int arg0) {
        field382 = null;
        field392 = null;
        if (arg0 == -1) {
            field394 = null;
            field395 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "(I)I")
    public abstract int method173(int arg0);

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Lr;I)Lcu;")
    public abstract class475 method174(class562 arg0, int arg1);

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)V")
    public abstract void method175(byte arg0);

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(B)I")
    public abstract int method176(byte arg0);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lr;Z)V")
    public abstract void method177(class562 arg0, boolean arg1);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[Lqea;II)I")
    public final int method178(int arg0, class392[] arg1, int arg2, int arg3) {
        field396++;
        if (arg2 != 1) {
            return 35;
        }
        long var5 = class257.field3366[this.field385][arg0][arg3];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg1[var9++] = class141.field1915[var10 - 1].field8687;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }
}
