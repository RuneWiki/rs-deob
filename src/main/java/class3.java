import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public abstract class class3 {

    @OriginalMember(owner = "mapview!b", name = "n", descriptor = "Z")
    private boolean field32;

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "Z")
    public boolean field21;

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "Lu;")
    public static class38 field25 = class28.method177("Kebab Seller", (byte) -84);

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Lu;")
    public static class38 field20 = class28.method177("Mining Site", (byte) -84);

    @OriginalMember(owner = "mapview!b", name = "o", descriptor = "Lu;")
    public static class38 field33 = class28.method177("Anvil", (byte) -84);

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "Lu;")
    public static class38 field29 = class28.method177("Loading )3)3)3", (byte) -84);

    @OriginalMember(owner = "mapview!b", name = "m", descriptor = "[[B")
    public static byte[][] field31 = new byte[50][];

    @OriginalMember(owner = "mapview!b", name = "w", descriptor = "Lu;")
    public static class38 field41 = class28.method177("Axe Shop", (byte) -84);

    @OriginalMember(owner = "mapview!b", name = "t", descriptor = "Lu;")
    public static class38 field38 = class28.method177("mapscene", (byte) -84);

    @OriginalMember(owner = "mapview!b", name = "y", descriptor = "Lu;")
    public static class38 field43 = class28.method177("u_pass", (byte) -84);

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "mapview!b", name = "p", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "mapview!b", name = "A", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "mapview!b", name = "z", descriptor = "Li;")
    private class17 field44;

    @OriginalMember(owner = "mapview!b", name = "r", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field36;

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "[B")
    public static byte[] field30;

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "[I")
    private int[] field22;

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "[I")
    private int[] field24;

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "[I")
    private int[] field27;

    @OriginalMember(owner = "mapview!b", name = "s", descriptor = "[I")
    public int[] field37;

    @OriginalMember(owner = "mapview!b", name = "x", descriptor = "[I")
    private int[] field42;

    @OriginalMember(owner = "mapview!b", name = "v", descriptor = "[Li;")
    private class17[] field40;

    @OriginalMember(owner = "mapview!b", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field35;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "[[I")
    private int[][] field19;

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "[[I")
    private int[][] field28;

    @OriginalMember(owner = "mapview!b", name = "u", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field39;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IBI)[B", line = 4)
    public final byte[] method15(int arg0, byte arg1, int arg2) {
        if (arg1 != -91) {
            this.field21 = true;
        }
        return this.method21(-1, null, arg2, arg0);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 25)
    public static final void method16(int arg0, Component arg1) {
        int var2 = 97 / ((42 - arg0) / 45);
        Method var3 = class39.field504;
        if (var3 != null) {
            try {
                var3.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        arg1.addKeyListener(class29.field364);
        arg1.addFocusListener(class29.field364);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(JI)V", line = 50)
    public static final void method17(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
            int var3 = -47 % ((68 - arg1) / 48);
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([III)Z", line = 67)
    private final boolean method18(int[] arg0, int arg1, int arg2) {
        if (this.field35[arg2] == null) {
            return false;
        }
        if (arg1 != -19219) {
            method25(-33);
        }
        int var4 = this.field24[arg2];
        int[] var5 = this.field28[arg2];
        Object[] var6 = this.field39[arg2];
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
        if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
            var9 = class25.method139((byte) -110, this.field35[arg2], false);
        } else {
            var9 = class25.method139((byte) 106, this.field35[arg2], true);
            class19 var10 = new class19(var9);
            var10.method111(-25850, 5, var10.field193.length, arg0);
        }
        byte[] var11;
        try {
            var11 = class8.method44(0, var9);
        } catch (RuntimeException var28) {
            throw class37.method215(var28, "T3 - " + (arg0 != null) + "," + arg2 + "," + var9.length + "," + class19.method118(var9.length, (byte) -35, var9) + "," + class19.method118(var9.length - 2, (byte) -44, var9) + "," + this.field42[arg2] + "," + this.field45);
        }
        if (this.field21) {
            this.field35[arg2] = null;
        }
        if (var4 > 1) {
            int[] var13 = new int[var4];
            int var14 = var11.length;
            int var29 = var14 - 1;
            int var15 = var11[var29] & 0xFF;
            int var16 = var29 - var15 * 4 * var4;
            class19 var17 = new class19(var11);
            var17.field196 = var16;
            for (int var18 = 0; var18 < var15; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var17.method117(false);
                    var13[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var13[var22]];
                var13[var22] = 0;
            }
            var17.field196 = var16;
            int var23 = 0;
            for (int var24 = 0; var24 < var15; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var17.method117(false);
                    class13.method63(var11, var23, var21[var26], var13[var26], var25);
                    var13[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field32) {
                    var6[var5[var27]] = var21[var27];
                } else {
                    var6[var5[var27]] = class17.method101((byte) -37, var21[var27], false);
                }
            }
        } else if (this.field32) {
            var6[var5[0]] = var11;
        } else {
            var6[var5[0]] = class17.method101((byte) 6, var11, false);
        }
        return true;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ZLu;Lu;)[B", line = 240)
    public final byte[] method19(boolean arg0, class38 arg1, class38 arg2) {
        if (arg0) {
            method17(-61L, -33);
        }
        class38 var4 = arg1.method241(0);
        class38 var5 = arg2.method241(0);
        int var6 = this.field44.method104(-118, var4.method225((byte) -112));
        int var7 = this.field40[var6].method104(18, var5.method225((byte) -101));
        return this.method15(var6, (byte) -91, var7);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Lu;B)I", line = 255)
    public final int method20(class38 arg0, byte arg1) {
        if (arg1 != 88) {
            field33 = null;
        }
        class38 var3 = arg0.method241(0);
        return this.field44.method104(-106, var3.method225((byte) -113));
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I[III)[B", line = 271)
    private final byte[] method21(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 < 0 || this.field39.length <= arg3 || this.field39[arg3] == null || arg2 < 0 || this.field39[arg3].length <= arg2) {
            return null;
        }
        if (this.field39[arg3][arg2] == null) {
            boolean var5 = this.method18(arg1, -19219, arg3);
            if (!var5) {
                this.method24(23, arg3);
                boolean var6 = this.method18(arg1, -19219, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg0 != -1) {
            field43 = null;
        }
        byte[] var7 = class25.method139((byte) -128, this.field39[arg3][arg2], false);
        if (this.field32) {
            this.field39[arg3][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IILu;)I", line = 336)
    public final int method22(int arg0, int arg1, class38 arg2) {
        class38 var4 = arg2.method241(0);
        return arg1 > -9 ? 107 : this.field40[arg0].method104(-32, var4.method225((byte) -128));
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 359)
    public static void method23(int arg0) {
        field36 = null;
        field25 = null;
        field30 = null;
        field43 = null;
        field38 = null;
        field33 = null;
        if (arg0 == 0) {
            field31 = null;
            field20 = null;
            field29 = null;
            field41 = null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(II)V", line = 380)
    private final void method24(int arg0, int arg1) {
        int var3 = 30 / ((arg0 + 61) / 56);
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(I)B", line = 397)
    public static final byte method25(int arg0) {
        if (arg0 != -1) {
            method16(98, null);
        }
        return class33.field413 == null ? 0 : class33.field413[class22.field213];
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([BI)V", line = 424)
    public final void method26(byte[] arg0, int arg1) {
        this.field45 = class19.method118(arg0.length, (byte) -71, arg0);
        class19 var3 = new class19(class8.method44(0, arg0));
        int var4 = var3.method115(arg1 ^ 0x1);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method117(false);
        }
        int var5 = var3.method115(-2);
        int var6 = -1;
        this.field23 = var3.method119((byte) 119);
        int var7 = 0;
        this.field37 = new int[this.field23];
        for (int var8 = 0; var8 < this.field23; var8++) {
            this.field37[var8] = var7 += var3.method119((byte) 119);
            if (var6 < this.field37[var8]) {
                var6 = this.field37[var8];
            }
        }
        this.field24 = new int[var6 + 1];
        this.field42 = new int[var6 + 1];
        this.field27 = new int[var6 + 1];
        this.field39 = new Object[var6 + 1][];
        this.field28 = new int[var6 + 1][];
        this.field35 = new Object[var6 + 1];
        if (~var5 != arg1) {
            this.field22 = new int[var6 + 1];
            for (int var9 = 0; var9 < var6 + 1; var9++) {
                this.field22[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field23; var10++) {
                this.field22[this.field37[var10]] = var3.method117(false);
            }
            this.field44 = new class17(this.field22);
        }
        for (int var11 = 0; var11 < this.field23; var11++) {
            this.field42[this.field37[var11]] = var3.method117(false);
        }
        for (int var12 = 0; var12 < this.field23; var12++) {
            this.field27[this.field37[var12]] = var3.method117(false);
        }
        for (int var13 = 0; var13 < this.field23; var13++) {
            this.field24[this.field37[var13]] = var3.method119((byte) 115);
        }
        for (int var14 = 0; var14 < this.field23; var14++) {
            int var15 = 0;
            int var16 = this.field37[var14];
            int var17 = this.field24[var16];
            this.field28[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field28[var16][var19] = var15 += var3.method119((byte) 122);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field39[var16] = new Object[var18 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field40 = new class17[var6 + 1];
        this.field19 = new int[var6 + 1][];
        for (int var21 = 0; var21 < this.field23; var21++) {
            int var22 = this.field37[var21];
            int var23 = this.field24[var22];
            this.field19[var22] = new int[this.field39[var22].length];
            for (int var24 = 0; var24 < this.field39[var22].length; var24++) {
                this.field19[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                this.field19[var22][this.field28[var22][var25]] = var3.method117(false);
            }
            this.field40[var22] = new class17(this.field19[var22]);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(ZZ)V", line = 583)
    public class3(boolean arg0, boolean arg1) {
        this.field32 = arg1;
        this.field21 = arg0;
    }
}
