import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class694 extends class626 {

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "Lnt;")
    public class220 field9759 = new class220();

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "[I")
    public static int[] field9757 = new int[4];

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "I")
    public static int field9761 = 0;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "I")
    public static int field9753;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "Lgha;")
    public static class345 field9755;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public static void method3898(int arg0) {
        if (arg0 == -22760) {
            field9755 = null;
            field9757 = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
    public static final void method3899(boolean arg0) {
        field9760++;
        int var1 = class697.field9800.length;
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class697.field9800[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class621.field8958; var4++) {
                    if (class412.field5705[var2] == class377.field5271[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class377.field5271[class621.field8958] = class412.field5705[var2];
                    var3 = class621.field8958++;
                }
                class35 var5 = new class35(class697.field9800[var2]);
                int var6 = 0;
                while (class697.field9800[var2].length > var5.field469 && var6 < 511 && class152.field2290 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method253(-13900);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FF4) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class412.field5705[var2] >> 8) * 64 + var10 - class115.field1845;
                    int var13 = (class412.field5705[var2] & 0xFF) * 64 + var11 - class64.field1160;
                    class488 var14 = class134.field2102.method3038(var5.method253(-13900), (byte) -115);
                    class272 var15 = (class272) class758.field10539.method4203(arg0, (long) var7);
                    if (var15 == null && (var14.field6928 & 0x1) > 0 && class569.field8104 == var9 && var12 >= 0 && (var14.field6911 + var12) < class174.field2540 && var13 >= 0 && class716.field9999 > var14.field6911 + var13) {
                        class84 var16 = new class84();
                        var16.field931 = var7;
                        class272 var17 = new class272(var16);
                        class758.field10539.method4211(var17, (byte) 48, (long) var7);
                        class379.field5284[class130.field1948++] = var17;
                        class323.field4590[class152.field2290++] = var7;
                        var16.field933 = class605.field8787;
                        var16.method809(var14, -1);
                        var16.method470(var16.field1523.field6911, 0);
                        var16.field878 = var16.field1523.field6927 << 3;
                        var16.method462(var16.field1523.field6954 + 4 << 11 & 0x3DA7, true, -1);
                        var16.method805(var9, false, var12, var16.method482(false), true, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method3900(Throwable arg0, int arg1) throws IOException {
        if (arg1 != 0) {
            return null;
        }
        field9753++;
        String var2;
        if ((arg0 instanceof class143)) {
            class143 var3 = (class143) arg0;
            var2 = var3.field2192 + " | ";
            arg0 = var3.field2193;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
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

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(Z)I")
    public static final int method3901(boolean arg0) {
        field9756++;
        if (arg0) {
            field9761 = -95;
        }
        if ((double) class542.field7628 == 3.0D) {
            return 37;
        } else if ((double) class542.field7628 == 4.0D) {
            return 50;
        } else if ((double) class542.field7628 == 6.0D) {
            return 75;
        } else if ((double) class542.field7628 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
