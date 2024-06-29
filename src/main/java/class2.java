import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public abstract class class2 {

    @OriginalMember(owner = "mapview!aa", name = "k", descriptor = "Z")
    private boolean field90;

    @OriginalMember(owner = "mapview!aa", name = "s", descriptor = "Z")
    private boolean field98;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "Lh;")
    public static class15 field84 = class26.method190(true, "POH Portal");

    @OriginalMember(owner = "mapview!aa", name = "r", descriptor = "I")
    public static volatile int field97 = 0;

    @OriginalMember(owner = "mapview!aa", name = "n", descriptor = "Lh;")
    public static class15 field93 = class26.method190(true, "Silver Shop");

    @OriginalMember(owner = "mapview!aa", name = "v", descriptor = "Lh;")
    public static class15 field101 = class26.method190(true, "Mining Shop");

    @OriginalMember(owner = "mapview!aa", name = "w", descriptor = "Lh;")
    public static class15 field102 = class26.method190(true, "Axe Shop");

    @OriginalMember(owner = "mapview!aa", name = "y", descriptor = "Lh;")
    public static class15 field104 = class26.method190(true, "General Store");

    @OriginalMember(owner = "mapview!aa", name = "u", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "mapview!aa", name = "l", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Li;")
    private class17 field81;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "[I")
    private int[] field80;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "[I")
    public static int[] field87;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "[I")
    private int[] field89;

    @OriginalMember(owner = "mapview!aa", name = "m", descriptor = "[I")
    private int[] field92;

    @OriginalMember(owner = "mapview!aa", name = "p", descriptor = "[I")
    public int[] field95;

    @OriginalMember(owner = "mapview!aa", name = "t", descriptor = "[I")
    private int[] field99;

    @OriginalMember(owner = "mapview!aa", name = "x", descriptor = "[Lg;")
    public static class13[] field103;

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "[Li;")
    private class17[] field86;

    @OriginalMember(owner = "mapview!aa", name = "o", descriptor = "[[B")
    public byte[][] field94;

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "[[I")
    private int[][] field85;

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "[[I")
    private int[][] field88;

    @OriginalMember(owner = "mapview!aa", name = "q", descriptor = "[[[B")
    private byte[][][] field96;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(B)V", line = 4)
    public static void method32(byte arg0) {
        field101 = null;
        field102 = null;
        field104 = null;
        field84 = null;
        field103 = null;
        field87 = null;
        field93 = null;
        if (arg0 >= -12) {
            field101 = null;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 22)
    public static final String method33(int arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class4) {
            class4 var3 = (class4) arg1;
            arg1 = var3.field120;
            var2 = var3.field121 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 >= -96) {
            return (String) null;
        }
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
                    return var2 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var2 = var2 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var2 = var2 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I)I", line = 95)
    public static final int method34(int arg0) {
        if (arg0 != -1) {
            method44(117L, (byte) 15);
        }
        return class30.field402 == null ? 0 : class30.field402[class35.field442];
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I[IZ)Z", line = 129)
    private final boolean method35(int arg0, int[] arg1, boolean arg2) {
        if (this.field94[arg0] == null) {
            return false;
        }
        int var4 = this.field92[arg0];
        int[] var5 = this.field85[arg0];
        byte[][] var6 = this.field96[arg0];
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            if (var6[var5[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = this.field94[arg0];
        } else {
            var9 = new byte[this.field94[arg0].length];
            class34.method234(this.field94[arg0], 0, var9, 0, var9.length);
            class18 var10 = new class18(var9);
            var10.method152(5, var10.field288.length, arg1, (byte) -60);
        }
        byte[] var11;
        try {
            var11 = class3.method56((byte) 122, var9);
        } catch (RuntimeException var26) {
            throw class3.method49(var26, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class9.method79(var9.length, var9, (byte) 103) + "," + class9.method79(var9.length - 2, var9, (byte) 93) + "," + this.field99[arg0] + "," + this.field100);
        }
        if (this.field90) {
            this.field94[arg0] = null;
        }
        if (arg2) {
            this.method35(-50, null, true);
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var27 = var13 - 1;
            int var14 = var11[var27] & 0xFF;
            class18 var15 = new class18(var11);
            int[] var16 = new int[var4];
            int var17 = var27 - var4 * var14 * 4;
            var15.field286 = var17;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var15.method156(127);
                    var16[var20] += var19;
                }
            }
            for (int var21 = 0; var21 < var4; var21++) {
                if (var6[var5[var21]] == null) {
                    var6[var5[var21]] = new byte[var16[var21]];
                }
                var16[var21] = 0;
            }
            var15.field286 = var17;
            int var22 = 0;
            for (int var23 = 0; var23 < var14; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var4; var25++) {
                    var24 += var15.method156(127);
                    class34.method234(var11, var22, var6[var5[var25]], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
        } else {
            var6[var5[0]] = var11;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I[III)[B", line = 288)
    private final byte[] method36(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 < 0 || arg3 >= this.field96.length || this.field96[arg3] == null || arg2 < 0 || this.field96[arg3].length <= arg2) {
            return null;
        }
        if (this.field96[arg3][arg2] == null) {
            boolean var5 = this.method35(arg3, arg1, false);
            if (!var5) {
                this.method41(arg3, -8470);
                boolean var6 = this.method35(arg3, arg1, false);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg0 > -20) {
            this.method38(null, 104, 79);
        }
        byte[] var7 = this.field96[arg3][arg2];
        if (this.field98) {
            this.field96[arg3][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(IBLjava/awt/Component;I)Lca;", line = 342)
    public static final class6 method37(int arg0, byte arg1, Component arg2, int arg3) {
        try {
            if (arg1 >= -3) {
                field101 = null;
            }
            Class var4 = Class.forName("r");
            class6 var5 = (class6) var4.getDeclaredConstructor().newInstance();
            var5.method72(arg3, arg2, -127, arg0);
            return var5;
        } catch (Throwable var8) {
            class7 var7 = new class7();
            var7.method72(arg3, arg2, -127, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Lh;II)I", line = 368)
    public final int method38(class15 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field81 = null;
        }
        class15 var4 = arg0.method115((byte) 73);
        return this.field86[arg1].method146(-6372, var4.method124(arg2 - 39));
    }

    @OriginalMember(owner = "mapview!aa", name = "<init>", descriptor = "(ZZ)V", line = 385)
    public class2(boolean arg0, boolean arg1) {
        this.field90 = arg0;
        this.field98 = arg1;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(III[B)I", line = 396)
    public static final int method39(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class17.field273[(var4 ^ arg3[var5]) & 0xFF];
        }
        int var6 = ~var4;
        return arg1 == -24337880 ? var6 : -121;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(III)[B", line = 419)
    public final byte[] method40(int arg0, int arg1, int arg2) {
        int var4 = -74 / ((-arg2 - 71) / 51);
        return this.method36(-93, null, arg0, arg1);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(II)V", line = 427)
    private final void method41(int arg0, int arg1) {
        if (arg1 != -8470) {
            field93 = null;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(BLh;Lh;)[B", line = 438)
    public final byte[] method42(byte arg0, class15 arg1, class15 arg2) {
        if (arg0 != 21) {
            this.field85 = null;
        }
        class15 var4 = arg2.method115((byte) 73);
        class15 var5 = arg1.method115((byte) 73);
        int var6 = this.field81.method146(-6372, var4.method124(-18));
        int var7 = this.field86[var6].method146(arg0 - 6393, var5.method124(-93));
        return this.method40(var7, var6, -126);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Lh;B)I", line = 463)
    public final int method43(class15 arg0, byte arg1) {
        if (arg1 == 45) {
            class15 var3 = arg0.method115((byte) 73);
            return this.field81.method146(arg1 - 6417, var3.method124(-89));
        } else {
            return 28;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(JB)V", line = 482)
    public static final void method44(long arg0, byte arg1) {
        if (arg1 < 8) {
            method44(81L, (byte) -76);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "([BI)V", line = 501)
    public final void method45(byte[] arg0, int arg1) {
        this.field100 = class9.method79(arg0.length, arg0, (byte) 94);
        class18 var3 = new class18(class3.method56((byte) 120, arg0));
        int var4 = var3.method148((byte) 125);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method148((byte) 97);
        this.field83 = var3.method157(-1);
        this.field95 = new int[this.field83];
        int var6 = -1;
        int var7 = 0;
        if (arg1 >= -3) {
            return;
        }
        for (int var8 = 0; var8 < this.field83; var8++) {
            this.field95[var8] = var7 += var3.method157(-1);
            if (this.field95[var8] > var6) {
                var6 = this.field95[var8];
            }
        }
        this.field85 = new int[var6 + 1][];
        this.field96 = new byte[var6 + 1][][];
        this.field80 = new int[var6 + 1];
        this.field94 = new byte[var6 + 1][];
        this.field99 = new int[var6 + 1];
        this.field92 = new int[var6 + 1];
        if (var5 != 0) {
            this.field89 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field83; var9++) {
                this.field89[this.field95[var9]] = var3.method156(127);
            }
            this.field81 = new class17(this.field89);
        }
        for (int var10 = 0; var10 < this.field83; var10++) {
            this.field99[this.field95[var10]] = var3.method156(127);
        }
        for (int var11 = 0; var11 < this.field83; var11++) {
            this.field80[this.field95[var11]] = var3.method156(127);
        }
        for (int var12 = 0; var12 < this.field83; var12++) {
            this.field92[this.field95[var12]] = var3.method157(-1);
        }
        for (int var13 = 0; var13 < this.field83; var13++) {
            int var14 = 0;
            int var15 = this.field95[var13];
            int var16 = -1;
            int var17 = this.field92[var15];
            this.field85[var15] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                int var19 = this.field85[var15][var18] = var14 += var3.method157(-1);
                if (var16 < var19) {
                    var16 = var19;
                }
            }
            this.field96[var15] = new byte[var16 + 1][];
        }
        if (var5 == 0) {
            return;
        }
        this.field86 = new class17[var6 + 1];
        this.field88 = new int[var6 + 1][];
        for (int var20 = 0; var20 < this.field83; var20++) {
            int var21 = this.field95[var20];
            int var22 = this.field92[var21];
            this.field88[var21] = new int[this.field96[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field88[var21][this.field85[var21][var23]] = var3.method156(127);
            }
            this.field86[var21] = new class17(this.field88[var21]);
        }
    }
}
