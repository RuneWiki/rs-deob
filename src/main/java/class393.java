import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class class393 {

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "[Z")
    public static boolean[] field5652 = new boolean[8];

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "D")
    public static double field5651;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "Lla;")
    public static class423 field5648;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "[Ljw;")
    public static class280[] field5647;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([Ljw;II)V", line = 3)
    public static final void method2396(class280[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class280 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field3926;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field3926 > (var7 & 0x1) + var6) {
                class280 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2396(arg0, arg1, var4 - 1);
        method2396(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V", line = 47)
    public static final void method2397(byte arg0) {
        class247.method1681(class243.field3580.field7974.method1117(false), 1541132643);
        field5650++;
        int var1 = (class518.field7473 >> 12) + (class41.field693 >> 3);
        int var2 = (class71.field1085 >> 3) + (class123.field1698 >> 12);
        class687.field9758 = class108.field1536.field3920 = 0;
        class108.field1536.method3687(8, 28, 8);
        byte var3 = 18;
        class645.field9289 = new byte[var3][];
        class269.field3822 = new int[var3];
        class397.field5685 = new byte[var3][];
        class672.field9577 = new int[var3];
        class629.field8917 = new int[var3];
        class132.field1823 = new int[var3];
        class667.field9528 = new byte[var3][];
        class658.field9419 = new byte[var3][];
        class429.field6176 = new byte[var3][];
        class491.field7065 = new int[var3][4];
        class284.field3961 = new int[var3];
        class236.field3543 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class184.field2546 >> 4)) / 8; var5 <= ((class184.field2546 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class240.field3555 >> 4)) / 8; var8 <= (((class240.field3555 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class284.field3961[var4] = var9;
                class269.field3822[var4] = class275.field3876.method2602((byte) -124, "m" + var5 + "_" + var8);
                class629.field8917[var4] = class275.field3876.method2602((byte) -120, "l" + var5 + "_" + var8);
                class132.field1823[var4] = class275.field3876.method2602((byte) -123, "n" + var5 + "_" + var8);
                class236.field3543[var4] = class275.field3876.method2602((byte) -120, "um" + var5 + "_" + var8);
                class672.field9577[var4] = class275.field3876.method2602((byte) -121, "ul" + var5 + "_" + var8);
                if (class132.field1823[var4] == -1) {
                    class269.field3822[var4] = -1;
                    class629.field8917[var4] = -1;
                    class236.field3543[var4] = -1;
                    class672.field9577[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class132.field1823.length; var6++) {
            class132.field1823[var6] = -1;
            class269.field3822[var6] = -1;
            class629.field8917[var6] = -1;
            class236.field3543[var6] = -1;
            class672.field9577[var6] = -1;
        }
        byte var7;
        if (class369.field5392 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class426.method2648(var2, var7, -1070116028, var1, false);
        if (arg0 <= 45) {
            method2396(null, -66, 95);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 137)
    public static void method2398(int arg0) {
        field5648 = null;
        if (arg0 != 4) {
            method2397((byte) 127);
        }
        field5647 = null;
        field5652 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 151)
    public static final String method2399(Throwable arg0, int arg1) throws IOException {
        field5649++;
        String var3;
        if (arg0 instanceof class91) {
            class91 var2 = (class91) arg0;
            arg0 = var2.field1298;
            var3 = var2.field1296 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 < 106) {
            field5648 = null;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
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

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)I")
    public abstract int method1595(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
    public abstract void method1598(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1600(int arg0, int arg1);

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Lm;")
    public abstract class475 method1597(int arg0);
}
