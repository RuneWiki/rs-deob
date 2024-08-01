import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wg")
public class class209 {

    @OriginalMember(owner = "wg", name = "d", descriptor = "[I")
    private int[] field4066;

    @OriginalMember(owner = "wg", name = "j", descriptor = "[I")
    private int[] field4072;

    @OriginalMember(owner = "wg", name = "a", descriptor = "Lj;")
    private class85 field4063;

    @OriginalMember(owner = "wg", name = "f", descriptor = "Lj;")
    private class85 field4068;

    @OriginalMember(owner = "wg", name = "l", descriptor = "[Lj;")
    private class85[] field4074;

    @OriginalMember(owner = "wg", name = "m", descriptor = "Llf;")
    private static class109 field4075 = class35.method275("Checking for updates )2 ", 2);

    @OriginalMember(owner = "wg", name = "n", descriptor = "I")
    public static int field4076 = 0;

    @OriginalMember(owner = "wg", name = "e", descriptor = "Llf;")
    public static class109 field4067 = field4075;

    @OriginalMember(owner = "wg", name = "b", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "wg", name = "c", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "wg", name = "h", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "wg", name = "i", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "wg", name = "k", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "wg", name = "o", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "wg", name = "p", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "wg", name = "g", descriptor = "Lvg;")
    public static class200 field4069;

    @OriginalMember(owner = "wg", name = "a", descriptor = "(ILaa;Lbg;)Z")
    public final boolean method1360(int arg0, class2 arg1, class18 arg2) {
        field4065++;
        for (int var4 = arg0; var4 < this.field4072.length; var4++) {
            if (!arg2.method163(-5526, this.field4072[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field4066.length; var5++) {
            if (!arg1.method5(this.field4066[var5], arg0 ^ 0xFFFFBAF2)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "wg", name = "a", descriptor = "(I)V")
    public static void method1361(int arg0) {
        field4067 = null;
        field4075 = null;
        if (arg0 != 0) {
            method1363(-120, null, -11);
        }
        field4069 = null;
    }

    @OriginalMember(owner = "wg", name = "a", descriptor = "(BI)V")
    public static final void method1362(byte arg0, int arg1) {
        field4073++;
        if (arg0 != -64) {
            method1361(121);
        }
        for (class117 var2 = (class117) class194.field3715.method338((byte) 99); var2 != null; var2 = (class117) class194.field3715.method335(1)) {
            if ((var2.field1381 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method452(true);
            }
        }
    }

    @OriginalMember(owner = "wg", name = "a", descriptor = "(I[Lvg;I)V")
    public static final void method1363(int arg0, class200[] arg1, int arg2) {
        field4077++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class200 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field3875 == 0) {
                    if (var4.field3898 != null) {
                        method1363(-4019, var4.field3898, arg2);
                    }
                    class60 var5 = (class60) class113.field2236.method337((long) var4.field3866, (byte) -85);
                    if (var5 != null) {
                        class26.method218(arg2, arg0 ^ 0xFFFFF065, var5.field1174);
                    }
                }
                if (arg2 == 0 && var4.field3915 != null) {
                    class82 var6 = new class82();
                    var6.field1608 = var4;
                    var6.field1613 = var4.field3915;
                    class42.method305(arg0 + 28106, var6);
                }
                if (arg2 == 1 && var4.field3934 != null) {
                    if (var4.field3900 >= 0) {
                        class200 var7 = class158.method1078(var4.field3866, (byte) 115);
                        if (var7 == null || var7.field3898 == null || var7.field3898.length <= var4.field3900 || var7.field3898[var4.field3900] != var4) {
                            continue;
                        }
                    }
                    class82 var8 = new class82();
                    var8.field1608 = var4;
                    var8.field1613 = var4.field3934;
                    class42.method305(24087, var8);
                }
            }
        }
        if (arg0 != -4019) {
            field4075 = null;
        }
    }

    @OriginalMember(owner = "wg", name = "<init>", descriptor = "()V")
    public class209() {
        this.field4066 = new int[0];
        this.field4072 = new int[0];
        this.field4063 = new class158();
        this.field4068 = new class158();
        this.field4074 = new class85[] { this.field4063, this.field4068 };
    }

    @OriginalMember(owner = "wg", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1364(byte arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class153) {
            class153 var3 = (class153) arg1;
            arg1 = var3.field2916;
            var2 = var3.field2915 + " | ";
        } else {
            var2 = "";
        }
        field4064++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg0 > -34) {
            field4069 = null;
        }
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "wg", name = "a", descriptor = "(DIIIZLbg;Laa;)[I")
    public final int[] method1365(double arg0, int arg1, int arg2, int arg3, boolean arg4, class18 arg5, class2 arg6) {
        class113.field2248 = arg6;
        class168.field3113 = arg5;
        class164.method1114(arg2, 1669028716, arg3);
        field4078++;
        int[] var9 = new int[arg2 * arg3];
        for (int var10 = 0; var10 < this.field4074.length; var10++) {
            this.field4074[var10].method546((byte) 24, arg3, arg2);
        }
        int var11;
        int var12;
        byte var13;
        if (arg4) {
            var13 = -1;
            var12 = arg3 - 1;
            var11 = -1;
        } else {
            var11 = arg3;
            var12 = 0;
            var13 = 1;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg2; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4063.field1726) {
                int[] var21 = this.field4063.method87(-108, var15);
                var20 = var21;
                var18 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field4063.method29(var15, 2177);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var12; var22 != var11; var22 += var13) {
                double var23 = Math.pow((double) var20[var22] / 4096.0D, arg0);
                double var25 = Math.pow((double) var19[var22] / 4096.0D, arg0);
                int var27 = (int) (var23 * 256.0D);
                if (var27 > 255) {
                    var27 = 255;
                }
                double var28 = Math.pow((double) var18[var22] / 4096.0D, arg0);
                int var30 = (int) (var25 * 256.0D);
                if (var30 > 255) {
                    var30 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var31 = (int) (var28 * 256.0D);
                if (var30 < 0) {
                    var30 = 0;
                }
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                var9[var14++] = (var27 << 16) + (var30 << 8) + var31;
            }
        }
        for (int var16 = arg1; var16 < this.field4074.length; var16++) {
            this.field4074[var16].method548((byte) -113);
        }
        return var9;
    }

    @OriginalMember(owner = "wg", name = "<init>", descriptor = "(Lja;)V")
    public class209(class86 arg0) {
        int var2 = arg0.method598((byte) 69);
        class49 var3 = new class49(64);
        class49 var4 = new class49(64);
        class49 var5 = new class49(64);
        int[][] var6 = new int[var2][];
        this.field4074 = new class85[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class85 var21 = class139.method993(-93, arg0);
            int var22 = var21.method547(-1);
            int var23 = var21.method545(24649);
            if (var22 >= 0 && var22 >= 0 && var4.method337((long) var22, (byte) -120) == null) {
                var4.method339((long) var22, false, new class117(var22));
            }
            if (var23 >= 0 && var23 >= 0 && var5.method337((long) var23, (byte) -82) == null) {
                var5.method339((long) var23, false, new class117(var23));
            }
            int var26 = var21.field1735.length;
            var6[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var6[var7][var27] = arg0.method598((byte) 71);
            }
            var3.method339((long) var21.field1730, false, var21);
            this.field4074[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class85 var17 = this.field4074[var8];
            int var18 = var17.field1735.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class85 var20 = (class85) var3.method337((long) var6[var8][var19], (byte) -97);
                var17.field1735[var19] = var20;
            }
            var6[var8] = null;
        }
        this.field4063 = (class85) var3.method337((long) arg0.method598((byte) 79), (byte) -92);
        Object var9 = null;
        this.field4068 = (class85) var3.method337((long) arg0.method598((byte) 101), (byte) -86);
        Object var10 = null;
        this.field4072 = new int[var4.method336(0)];
        this.field4066 = new int[var5.method336(0)];
        class71[] var11 = new class71[var4.method336(0)];
        class71[] var12 = new class71[var5.method336(0)];
        var4.method334(var11, 102);
        Object var13 = null;
        var5.method334(var12, 104);
        Object var14 = null;
        for (int var15 = 0; var15 < var11.length; var15++) {
            this.field4072[var15] = ((class117) var11[var15]).field2310;
        }
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field4066[var16] = ((class117) var12[var16]).field2310;
        }
    }
}
