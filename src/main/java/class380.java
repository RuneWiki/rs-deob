import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class380 {

    @OriginalMember(owner = "client!at", name = "i", descriptor = "Lfc;")
    private class262 field5265 = new class262(64);

    @OriginalMember(owner = "client!at", name = "h", descriptor = "Lni;")
    private class522 field5264;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Lea;")
    public static class547 field5263 = new class547(15, -2);

    @OriginalMember(owner = "client!at", name = "j", descriptor = "Llga;")
    public static class712 field5266 = new class712(58, 8);

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIII)Ldi;")
    public static final class128 method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 5) {
            field5266 = null;
        }
        field5260++;
        long var7 = (long) arg2 * 76724863L ^ (long) arg1 * 986053L ^ (long) arg5 * 67481L ^ (long) arg6 * 97549L ^ (long) arg4 * 475427L ^ (long) arg3 * 32147369L;
        class128 var9 = (class128) class238.field3114.method1571(-122, var7);
        if (var9 == null) {
            class128 var10 = class395.field5617.method424(arg5, arg6, arg4, arg1, arg3, arg2);
            class238.field3114.method1574(var7, var10, (byte) -80);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V")
    public final void method2222(boolean arg0) {
        class262 var2 = this.field5265;
        synchronized (this.field5265) {
            this.field5265.method1575((byte) 96);
        }
        if (arg0) {
            field5258++;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)V")
    public static void method2223(boolean arg0) {
        if (arg0) {
            field5266 = null;
            field5263 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Loba;")
    public final class264 method2224(int arg0, int arg1) {
        field5257++;
        if (arg1 != -11180) {
            this.field5264 = null;
        }
        class262 var3 = this.field5265;
        class264 var4;
        synchronized (this.field5265) {
            var4 = (class264) this.field5265.method1571(-127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field5264;
        byte[] var6;
        synchronized (this.field5264) {
            var6 = this.field5264.method2885(arg0, 35, false);
        }
        class264 var7 = new class264();
        if (var6 != null) {
            var7.method1580((byte) -113, new class611(var6));
        }
        var7.method1583(-9639);
        class262 var8 = this.field5265;
        synchronized (this.field5265) {
            this.field5265.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public final void method2225(byte arg0) {
        if (arg0 != 68) {
            method2223(false);
        }
        field5267++;
        class262 var2 = this.field5265;
        synchronized (this.field5265) {
            this.field5265.method1563(93);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method2226(Throwable arg0, byte arg1) throws IOException {
        field5259++;
        String var2;
        if ((arg0 instanceof class194)) {
            class194 var3 = (class194) arg0;
            arg0 = var3.field2318;
            var2 = var3.field2322 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != -24) {
            field5263 = null;
        }
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

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(II)V")
    public final void method2227(int arg0, int arg1) {
        class262 var3 = this.field5265;
        synchronized (this.field5265) {
            this.field5265.method1569((byte) 62, arg1);
        }
        if (arg0 != 32) {
            field5266 = null;
        }
        field5261++;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(III)Z")
    public static final boolean method2228(int arg0, int arg1, int arg2) {
        if (arg0 != 8) {
            field5266 = null;
        }
        field5262++;
        return class153.method932(arg2, arg1, -18021) || class391.method2283(arg2, (byte) 117, arg1);
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lrga;ILni;)V")
    public class380(class242 arg0, int arg1, class522 arg2) {
        this.field5264 = arg2;
        if (this.field5264 != null) {
            this.field5264.method2901(0, 35);
        }
    }
}
