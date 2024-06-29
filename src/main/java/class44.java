import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class44 {

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public int field520 = 0;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public int field526 = 0;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Lwf;")
    private class117 field524 = new class117(64);

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "Ljv;")
    private class70 field533 = null;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "Lkda;")
    private class328 field528;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "Lkda;")
    private class328 field527;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "[I")
    public static int[] field529 = new int[14];

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Lmo;")
    public static class638 field518 = new class638();

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "[[F")
    public static float[][] field530 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Lkda;")
    public static class328 field519;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(JILtda;[I)Ljava/lang/String;")
    public final String method274(long arg0, int arg1, class546 arg2, int[] arg3) {
        if (arg1 >= -118) {
            method279((byte) -87);
        }
        field521++;
        if (this.field533 != null) {
            String var6 = this.field533.method550(arg2, arg3, (byte) -46, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Lqaa;")
    public final class26 method275(int arg0, int arg1) {
        field531++;
        class26 var3 = (class26) this.field524.method842(arg1 ^ arg1, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field527.method1966(arg0, 1, true);
        } else {
            var4 = this.field528.method1966(arg0 & 0x7FFF, 1, true);
        }
        class26 var5 = new class26();
        var5.field268 = this;
        if (var4 != null) {
            var5.method164(new class148(var4), arg1 ^ 0x55);
        }
        if (arg0 >= 32768) {
            var5.method157(-36);
        }
        this.field524.method835((byte) 126, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public static void method276(int arg0) {
        field530 = null;
        field519 = null;
        field529 = null;
        if (arg0 == 0) {
            field518 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method277(int arg0, Throwable arg1) throws IOException {
        if (arg0 != -1) {
            return null;
        }
        field523++;
        String var2;
        if ((arg1 instanceof class514)) {
            class514 var3 = (class514) arg1;
            arg1 = var3.field7339;
            var2 = var3.field7341 + " | ";
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

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lvp;B)V")
    public static final void method278(class162 arg0, byte arg1) {
        field532++;
        int var2 = 34 % ((arg1 - 82) / 39);
        if (class488.field6954 != arg0.field2476) {
            return;
        }
        if (class541.field8119.field5138 == null) {
            arg0.field2509 = 0;
            arg0.field2532 = 0;
            return;
        }
        arg0.field2409 = 150;
        arg0.field2468 = (int) (Math.sin((double) class617.field9123 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field2529 = 5;
        arg0.field2532 = class183.field2758;
        arg0.field2509 = class65.method414(-122, class541.field8119.field5138);
        arg0.field2506 = class541.field8119.field1914;
        arg0.field2438 = class541.field8119.field1876;
        arg0.field2489 = class541.field8119.field1898;
        arg0.field2528 = 0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static final void method279(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class345.field4750[var1] = false;
        }
        if (arg0 != -47) {
            method279((byte) 1);
        }
        field522++;
        class625.field9211 = -1;
        class531.field7929 = 1;
        class613.field9074 = 0;
        class100.field1461 = -1;
        class354.field4818 = 0;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(ILkda;Lkda;Ljv;)V")
    public class44(int arg0, class328 arg1, class328 arg2, class70 arg3) {
        this.field528 = arg2;
        this.field533 = arg3;
        this.field527 = arg1;
        if (this.field527 != null) {
            this.field520 = this.field527.method1975(67, 1);
        }
        if (this.field528 != null) {
            this.field526 = this.field528.method1975(51, 1);
        }
    }
}
