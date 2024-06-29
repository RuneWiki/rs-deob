import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 {

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lic;")
    private static class59 field757 = class59.method433(0, "Loading fonts )2 ");

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lic;")
    public static class59 field758 = field757;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lic;")
    public static class59 field761 = class59.method433(0, "(U");

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lic;")
    public static class59 field765 = class59.method433(0, "Fallen lassen");

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field767 = 0;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[[I")
    public static int[][] field762 = new int[5][5000];

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
    public static boolean field768 = false;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Ldd;")
    public static class26 field766;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "[[S")
    public static short[][] field764;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method232(int arg0) {
        field755++;
        if (arg0 < 27) {
            field768 = false;
        }
        for (int var1 = 0; var1 < class106.field2526; var1++) {
            int var2 = class3.field62[var1];
            class49 var3 = class91.field2323[var2];
            int var4 = class10.field213.method1194(false);
            if ((var4 & 0x20) != 0) {
                var4 += class10.field213.method1194(false) << 8;
            }
            class51.method388(var2, var4, -34, var3);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method233(int arg0, Throwable arg1) throws IOException {
        if (arg0 != 9) {
            method236(113);
        }
        field756++;
        String var3;
        if (arg1 instanceof class100) {
            class100 var2 = (class100) arg1;
            var3 = var2.field2473 + " | ";
            arg1 = var2.field2469;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
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

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lwf;I)V")
    public static final void method234(class159 arg0, int arg1) {
        if (arg1 != -93772504) {
            field768 = true;
        }
        field760++;
        int var2 = arg0.field3610;
        if (var2 == 324) {
            if (class94.field2405 == -1) {
                class154.field3328 = arg0.field3645;
                class94.field2405 = arg0.field3602;
            }
            if (class159.field3618.field2232) {
                arg0.field3602 = class94.field2405;
            } else {
                arg0.field3602 = class154.field3328;
            }
        } else if (var2 == 325) {
            if (class94.field2405 == -1) {
                class154.field3328 = arg0.field3645;
                class94.field2405 = arg0.field3602;
            }
            if (class159.field3618.field2232) {
                arg0.field3602 = class154.field3328;
            } else {
                arg0.field3602 = class94.field2405;
            }
        } else if (var2 == 327) {
            arg0.field3536 = 150;
            arg0.field3641 = (int) (Math.sin((double) class23.field561 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3593 = 0;
            arg0.field3557 = 5;
        } else if (var2 == 328) {
            arg0.field3536 = 150;
            arg0.field3641 = (int) (Math.sin((double) class23.field561 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3557 = 5;
            arg0.field3593 = 1;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)J")
    public static final synchronized long method235(int arg0) {
        if (arg0 != -329) {
            field764 = null;
        }
        field763++;
        long var1 = System.currentTimeMillis();
        if (class31.field841 > var1) {
            class6.field123 += class31.field841 - var1;
        }
        class31.field841 = var1;
        return var1 + class6.field123;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public static void method236(int arg0) {
        field757 = null;
        field766 = null;
        if (arg0 != 0) {
            return;
        }
        field765 = null;
        field762 = null;
        field758 = null;
        field764 = null;
        field761 = null;
    }
}
