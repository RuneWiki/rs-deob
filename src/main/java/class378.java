import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class378 implements class187 {

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "Ldt;")
    private class184 field5351 = new class184(256);

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "Lfc;")
    private class343 field5346;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "Lfc;")
    private class343 field5349;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "[Lpt;")
    private class192[] field5337;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "[I")
    public static int[] field5342 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "J")
    public static long field5343 = -1L;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5345 = new String[100];

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "Lbg;")
    public static class317 field5344;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 5)
    public static final String method2252(Throwable arg0, int arg1) throws IOException {
        field5350++;
        String var2;
        if ((arg0 instanceof class435)) {
            class435 var3 = (class435) arg0;
            var2 = var3.field5975 + " | ";
            arg0 = var3.field5971;
        } else {
            var2 = "";
        }
        if (arg1 >= -67) {
            method2254((class23) null, -106);
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

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V", line = 79)
    public static void method2253(int arg0) {
        if (arg0 <= 91) {
            field5343 = 116L;
        }
        field5345 = null;
        field5342 = null;
        field5344 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZIFIII)[I", line = 91)
    public final int[] method1219(boolean arg0, int arg1, float arg2, int arg3, int arg4, int arg5) {
        field5352++;
        if (arg5 < 8) {
            this.method1215(-27, 54);
        }
        return this.method2255(arg3, (byte) -118).method934(this.field5346, this.field5337[arg3].field2746, arg0, arg4, (double) arg2, arg1, this, (byte) -28);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIZFII)[F", line = 103)
    public final float[] method1216(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        field5340++;
        int var7 = 64 / (-arg4 / 46);
        return this.method2255(arg0, (byte) -121).method932(this.field5346, (byte) -109, this, this.field5337[arg0].field2746, arg5, arg1);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Z", line = 113)
    public final boolean method1215(int arg0, int arg1) {
        if (arg0 == 14455) {
            field5339++;
            class154 var3 = this.method2255(arg1, (byte) -128);
            return var3 != null && var3.method938(this.field5346, this, -9377);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lqr;I)V", line = 126)
    public static final void method2254(class23 arg0, int arg1) {
        if (arg1 >= -60) {
            field5343 = 52L;
        }
        field5336++;
        class462 var2 = (class462) class78.field1184.method2614((long) arg0.field1119, 86);
        if (var2 == null) {
            class167.method1024(arg0, (class196) null, 128, arg0.field6766, arg0.field1144[0], 0, (class475) null, arg0.field1140[0]);
        } else {
            var2.method2733(0);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IFIIBZ)[I", line = 147)
    public final int[] method1217(int arg0, float arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field5353++;
        return arg4 > -125 ? null : this.method2255(arg2, (byte) -120).method931(arg0, this, (double) arg1, arg3, this.field5346, this.field5337[arg2].field2746, 27330);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)Lrq;", line = 159)
    private final class154 method2255(int arg0, byte arg1) {
        field5338++;
        class117 var3 = this.field5351.method1209(false, (long) arg0);
        if (var3 != null) {
            return (class154) var3;
        }
        byte[] var4 = this.field5349.method2038((byte) -58, arg0);
        if (var4 == null) {
            return null;
        }
        if (arg1 > -117) {
            this.method1216(81, -34, true, -1.0521071F, 57, 102);
        }
        class154 var5 = new class154(new class425(var4));
        this.field5351.method1207(-1, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V", line = 191)
    public static final void method2256(byte arg0) {
        class38.field660.method656(117);
        field5347++;
        if (arg0 != -111) {
            method2256((byte) 79);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)Lpt;", line = 205)
    public final class192 method1218(int arg0, boolean arg1) {
        field5348++;
        if (arg1) {
            this.method2255(11, (byte) 46);
        }
        return this.field5337[arg0];
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lfc;Lfc;Lfc;)V", line = 232)
    public class378(class343 arg0, class343 arg1, class343 arg2) {
        this.field5346 = arg2;
        this.field5349 = arg1;
        class425 var4 = new class425(arg0.method2029(0, 0, 0));
        int var5 = var4.method2508(true);
        this.field5337 = new class192[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2503(true) == 1) {
                this.field5337[var6] = new class192();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field5337[var7] != null) {
                this.field5337[var7].field2739 = var4.method2503(true) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field5337[var8] != null) {
                this.field5337[var8].field2734 = var4.method2503(true) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field5337[var9] != null) {
                this.field5337[var9].field2730 = var4.method2503(true) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field5337[var10] != null) {
                this.field5337[var10].field2738 = var4.method2503(true) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field5337[var11] != null) {
                this.field5337[var11].field2742 = var4.method2480(-8315);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field5337[var12] != null) {
                this.field5337[var12].field2733 = var4.method2480(-8315);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field5337[var13] != null) {
                this.field5337[var13].field2729 = var4.method2480(-8315);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field5337[var14] != null) {
                this.field5337[var14].field2731 = var4.method2480(-8315);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field5337[var15] != null) {
                this.field5337[var15].field2732 = (short) var4.method2508(true);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field5337[var16] != null) {
                this.field5337[var16].field2747 = var4.method2480(-8315);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field5337[var17] != null) {
                this.field5337[var17].field2741 = var4.method2480(-8315);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field5337[var18] != null) {
                this.field5337[var18].field2735 = var4.method2503(true) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field5337[var19] != null) {
                this.field5337[var19].field2746 = var4.method2503(true) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field5337[var20] != null) {
                this.field5337[var20].field2748 = var4.method2480(-8315);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field5337[var21] != null) {
                this.field5337[var21].field2744 = var4.method2503(true) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field5337[var22] != null) {
                this.field5337[var22].field2745 = var4.method2503(true) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field5337[var23] != null) {
                this.field5337[var23].field2736 = var4.method2503(true) == 1;
            }
        }
    }
}
