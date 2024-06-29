import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public abstract class class3 {

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "Z")
    private boolean field117;

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "Z")
    public boolean field118;

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "Z")
    public static boolean field116 = false;

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "[[B")
    public static byte[][] field108 = new byte[1000][];

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "Lna;")
    public static class26 field111 = class30.method205((byte) 60, "labels)3dat");

    @OriginalMember(owner = "mapview!b", name = "q", descriptor = "Lna;")
    public static class26 field123 = class30.method205((byte) 84, "download");

    @OriginalMember(owner = "mapview!b", name = "u", descriptor = "Lna;")
    public static class26 field127 = class30.method205((byte) 111, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Lna;")
    public static class26 field112 = class30.method205((byte) 42, "Farming shop");

    @OriginalMember(owner = "mapview!b", name = "x", descriptor = "Lna;")
    public static class26 field130 = class30.method205((byte) 119, "Staff Shop");

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "mapview!b", name = "v", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Lia;")
    private class17 field114;

    @OriginalMember(owner = "mapview!b", name = "m", descriptor = "Lna;")
    public static class26 field119;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "[I")
    public int[] field107;

    @OriginalMember(owner = "mapview!b", name = "p", descriptor = "[I")
    private int[] field122;

    @OriginalMember(owner = "mapview!b", name = "r", descriptor = "[I")
    private int[] field124;

    @OriginalMember(owner = "mapview!b", name = "s", descriptor = "[I")
    private int[] field125;

    @OriginalMember(owner = "mapview!b", name = "t", descriptor = "[I")
    private int[] field126;

    @OriginalMember(owner = "mapview!b", name = "w", descriptor = "[Lia;")
    private class17[] field129;

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field109;

    @OriginalMember(owner = "mapview!b", name = "n", descriptor = "[[I")
    private int[][] field120;

    @OriginalMember(owner = "mapview!b", name = "o", descriptor = "[[I")
    private int[][] field121;

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field110;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I[B)V", line = 12)
    public final void method30(int arg0, byte[] arg1) {
        this.field113 = class13.method83(arg1, arg0 ^ 0xFFFF9EC3, arg1.length);
        class4 var3 = new class4(class15.method99(arg1, (byte) 24));
        int var4 = var3.method49((byte) 113);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method43((byte) -127);
        }
        int var5 = 0;
        int var6 = var3.method49((byte) 107);
        this.field128 = var3.method47((byte) 93);
        this.field107 = new int[this.field128];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field128; var8++) {
            this.field107[var8] = var5 += var3.method47((byte) 107);
            if (this.field107[var8] > var7) {
                var7 = this.field107[var8];
            }
        }
        this.field109 = new Object[var7 + 1];
        this.field121 = new int[var7 + 1][];
        this.field122 = new int[var7 + 1];
        this.field126 = new int[var7 + 1];
        this.field124 = new int[var7 + 1];
        if (arg0 != 24892) {
            return;
        }
        this.field110 = new Object[var7 + 1][];
        if (var6 != 0) {
            this.field125 = new int[var7 + 1];
            for (int var9 = 0; var9 < var7 + 1; var9++) {
                this.field125[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field128; var10++) {
                this.field125[this.field107[var10]] = var3.method43((byte) -123);
            }
            this.field114 = new class17(this.field125);
        }
        for (int var11 = 0; var11 < this.field128; var11++) {
            this.field126[this.field107[var11]] = var3.method43((byte) -111);
        }
        for (int var12 = 0; var12 < this.field128; var12++) {
            this.field124[this.field107[var12]] = var3.method43((byte) -88);
        }
        for (int var13 = 0; var13 < this.field128; var13++) {
            this.field122[this.field107[var13]] = var3.method47((byte) 73);
        }
        for (int var14 = 0; var14 < this.field128; var14++) {
            int var15 = 0;
            int var16 = this.field107[var14];
            int var17 = this.field122[var16];
            this.field121[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field121[var16][var19] = var15 += var3.method47((byte) 119);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field110[var16] = new Object[var18 + 1];
        }
        if (var6 == 0) {
            return;
        }
        this.field120 = new int[var7 + 1][];
        this.field129 = new class17[var7 + 1];
        for (int var21 = 0; var21 < this.field128; var21++) {
            int var22 = this.field107[var21];
            int var23 = this.field122[var22];
            this.field120[var22] = new int[this.field110[var22].length];
            for (int var24 = 0; var24 < this.field110[var22].length; var24++) {
                this.field120[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                this.field120[var22][this.field121[var22][var25]] = var3.method43((byte) -116);
            }
            this.field129[var22] = new class17(this.field120[var22]);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILna;B)I", line = 173)
    public final int method31(int arg0, class26 arg1, byte arg2) {
        class26 var4 = arg1.method176(false);
        int var5 = -108 / ((24 - arg2) / 53);
        return this.field129[arg0].method110(var4.method168(false), (byte) -4);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILna;)I", line = 198)
    public final int method32(int arg0, class26 arg1) {
        if (arg0 == -1) {
            class26 var3 = arg1.method176(false);
            return this.field114.method110(var3.method168(false), (byte) -4);
        } else {
            return 107;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ZII)[B", line = 218)
    public final byte[] method33(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field118 = false;
        }
        return this.method39(arg2, true, arg1, null);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lua;", line = 242)
    public static final class39 method34(Throwable arg0, String arg1) {
        class39 var2;
        if (arg0 instanceof class39) {
            var2 = (class39) arg0;
            var2.field492 = var2.field492 + ' ' + arg1;
        } else {
            var2 = new class39(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(II)V", line = 261)
    private final void method35(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method33(false, -37, -33);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 280)
    public static void method36(int arg0) {
        field112 = null;
        field111 = null;
        field108 = null;
        field127 = null;
        if (arg0 < 78) {
            field130 = null;
        }
        field119 = null;
        field130 = null;
        field123 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([III)Z", line = 307)
    private final boolean method37(int[] arg0, int arg1, int arg2) {
        if (this.field109[arg2] == null) {
            return false;
        }
        int[] var4 = this.field121[arg2];
        int var5 = this.field122[arg2];
        Object[] var6 = this.field110[arg2];
        boolean var7 = true;
        for (int var8 = arg1; var8 < var5; var8++) {
            if (var6[var4[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
            var9 = class20.method126(false, true, this.field109[arg2]);
        } else {
            var9 = class20.method126(true, true, this.field109[arg2]);
            class4 var10 = new class4(var9);
            var10.method48(true, arg0, 5, var10.field138.length);
        }
        byte[] var11;
        try {
            var11 = class15.method99(var9, (byte) 87);
        } catch (RuntimeException var28) {
            throw method34(var28, "T3 - " + (arg0 != null) + "," + arg2 + "," + var9.length + "," + class13.method83(var9, -1, var9.length) + "," + class13.method83(var9, -1, var9.length - 2) + "," + this.field126[arg2] + "," + this.field113);
        }
        if (this.field118) {
            this.field109[arg2] = null;
        }
        if (var5 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int var15 = var29 - var5 * var14 * 4;
            int[] var16 = new int[var5];
            class4 var17 = new class4(var11);
            var17.field132 = var15;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var5; var20++) {
                    var19 += var17.method43((byte) -93);
                    var16[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var5][];
            for (int var22 = 0; var22 < var5; var22++) {
                var21[var22] = new byte[var16[var22]];
                var16[var22] = 0;
            }
            int var23 = 0;
            var17.field132 = var15;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var5; var26++) {
                    var25 += var17.method43((byte) -102);
                    class11.method79(var11, var23, var21[var26], var16[var26], var25);
                    var16[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var5; var27++) {
                if (this.field117) {
                    var6[var4[var27]] = var21[var27];
                } else {
                    var6[var4[var27]] = class35.method226(false, var21[var27], arg1 + 136);
                }
            }
        } else if (this.field117) {
            var6[var4[0]] = var11;
        } else {
            var6[var4[0]] = class35.method226(false, var11, 136);
        }
        return true;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILna;Lna;)[B", line = 473)
    public final byte[] method38(int arg0, class26 arg1, class26 arg2) {
        class26 var4 = arg1.method176(false);
        class26 var5 = arg2.method176(false);
        if (arg0 != -2109) {
            this.field121 = null;
        }
        int var6 = this.field114.method110(var4.method168(false), (byte) -4);
        int var7 = this.field129[var6].method110(var5.method168(false), (byte) -4);
        return this.method33(true, var7, var6);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IZI[I)[B", line = 502)
    private final byte[] method39(int arg0, boolean arg1, int arg2, int[] arg3) {
        if (arg0 < 0 || this.field110.length <= arg0 || this.field110[arg0] == null || arg2 < 0 || this.field110[arg0].length <= arg2) {
            return null;
        }
        if (this.field110[arg0][arg2] == null) {
            boolean var5 = this.method37(arg3, 0, arg0);
            if (!var5) {
                this.method35(arg0, 1);
                boolean var6 = this.method37(arg3, 0, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (!arg1) {
            field108 = null;
        }
        byte[] var7 = class20.method126(false, arg1, this.field110[arg0][arg2]);
        if (this.field117) {
            this.field110[arg0][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(ZZ)V", line = 549)
    public class3(boolean arg0, boolean arg1) {
        this.field117 = arg1;
        this.field118 = arg0;
    }
}
