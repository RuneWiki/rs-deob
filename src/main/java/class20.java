import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public abstract class class20 {

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "Z")
    private boolean field218;

    @OriginalMember(owner = "mapview!k", name = "q", descriptor = "Z")
    private boolean field223;

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "Ld;")
    public static class7 field214 = class38.method251((byte) -128, "Find");

    @OriginalMember(owner = "mapview!k", name = "o", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "mapview!k", name = "r", descriptor = "I")
    public static int field224 = 0;

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "Ld;")
    public static class7 field217 = class38.method251((byte) -77, " )2 ");

    @OriginalMember(owner = "mapview!k", name = "v", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "mapview!k", name = "w", descriptor = "Ld;")
    public static class7 field229 = class38.method251((byte) -95, "sprites");

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "mapview!k", name = "s", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "mapview!k", name = "u", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "mapview!k", name = "t", descriptor = "Lm;")
    private class24 field226;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "[I")
    private int[] field207;

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "[I")
    private int[] field211;

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "[I")
    private int[] field213;

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "[I")
    public static int[] field215;

    @OriginalMember(owner = "mapview!k", name = "m", descriptor = "[I")
    private int[] field219;

    @OriginalMember(owner = "mapview!k", name = "n", descriptor = "[I")
    public int[] field220;

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "[Lm;")
    private class24[] field210;

    @OriginalMember(owner = "mapview!k", name = "j", descriptor = "[Lna;")
    public static class27[] field216;

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field209;

    @OriginalMember(owner = "mapview!k", name = "p", descriptor = "[[I")
    private int[][] field222;

    @OriginalMember(owner = "mapview!k", name = "x", descriptor = "[[I")
    private int[][] field230;

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field212;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 9)
    public static final void method140(Component arg0, boolean arg1) {
        Method var2 = class3.field23;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class21.field236);
        arg0.addFocusListener(class21.field236);
        if (arg1) {
            method142(true);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ZILd;)I", line = 38)
    public final int method141(boolean arg0, int arg1, class7 arg2) {
        class7 var4 = arg2.method61(98);
        if (!arg0) {
            this.field222 = null;
        }
        return this.field210[arg1].method170(false, var4.method67(-108));
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Z)V", line = 50)
    public static final void method142(boolean arg0) {
        if (arg0) {
            method142(false);
        }
        if (class21.field236 != null) {
            class18 var1 = class21.field236;
            synchronized (class21.field236) {
                class21.field236 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ZII)[B", line = 95)
    public final byte[] method143(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field225 = -27;
        }
        return this.method149(null, arg1, 29581, arg2);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(BI)V", line = 105)
    private final void method144(byte arg0, int arg1) {
        if (arg0 <= 120) {
            this.field212 = null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(BLd;)I", line = 116)
    public final int method145(byte arg0, class7 arg1) {
        int var3 = -81 / (-arg0 / 36);
        class7 var4 = arg1.method61(34);
        return this.field226.method170(false, var4.method67(-110));
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ld;Ld;B)[B", line = 148)
    public final byte[] method146(class7 arg0, class7 arg1, byte arg2) {
        if (arg2 != -128) {
            field217 = null;
        }
        class7 var4 = arg0.method61(67);
        class7 var5 = arg1.method61(arg2 ^ 0xFFFFFF9F);
        int var6 = this.field226.method170(false, var4.method67(arg2 + 33));
        int var7 = this.field210[var6].method170(false, var5.method67(-101));
        return this.method143(true, var6, var7);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I[B)V", line = 172)
    public final void method147(int arg0, byte[] arg1) {
        this.field227 = class4.method24(arg1, arg1.length, (byte) -1);
        class35 var3 = new class35(class24.method165(false, arg1));
        int var4 = var3.method232(false);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method232(false);
        this.field208 = var3.method231(-887);
        int var6 = 0;
        int var7 = -1;
        this.field220 = new int[this.field208];
        for (int var8 = 0; var8 < this.field208; var8++) {
            this.field220[var8] = var6 += var3.method231(-887);
            if (var7 < this.field220[var8]) {
                var7 = this.field220[var8];
            }
        }
        this.field207 = new int[var7 + 1];
        this.field213 = new int[var7 + 1];
        this.field230 = new int[var7 + 1][];
        this.field219 = new int[var7 + 1];
        this.field212 = new Object[var7 + 1][];
        this.field209 = new Object[var7 + 1];
        if (var5 != 0) {
            this.field211 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field208; var9++) {
                this.field211[this.field220[var9]] = var3.method228((byte) -20);
            }
            this.field226 = new class24(this.field211);
        }
        for (int var10 = arg0; var10 < this.field208; var10++) {
            this.field213[this.field220[var10]] = var3.method228((byte) -20);
        }
        for (int var11 = 0; var11 < this.field208; var11++) {
            this.field207[this.field220[var11]] = var3.method228((byte) -20);
        }
        for (int var12 = 0; var12 < this.field208; var12++) {
            this.field219[this.field220[var12]] = var3.method231(-887);
        }
        for (int var13 = 0; var13 < this.field208; var13++) {
            int var14 = 0;
            int var15 = this.field220[var13];
            int var16 = this.field219[var15];
            this.field230[var15] = new int[var16];
            int var17 = -1;
            for (int var18 = 0; var18 < var16; var18++) {
                int var19 = this.field230[var15][var18] = var14 += var3.method231(-887);
                if (var19 > var17) {
                    var17 = var19;
                }
            }
            this.field212[var15] = new Object[var17 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field210 = new class24[var7 + 1];
        this.field222 = new int[var7 + 1][];
        for (int var20 = 0; var20 < this.field208; var20++) {
            int var21 = this.field220[var20];
            int var22 = this.field219[var21];
            this.field222[var21] = new int[this.field212[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field222[var21][this.field230[var21][var23]] = var3.method228((byte) -20);
            }
            this.field210[var21] = new class24(this.field222[var21]);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I[II)Z", line = 311)
    private final boolean method148(int arg0, int[] arg1, int arg2) {
        if (this.field209[arg0] == null) {
            return false;
        }
        int var4 = this.field219[arg0];
        Object[] var5 = this.field212[arg0];
        if (arg2 != -1) {
            return false;
        }
        boolean var6 = true;
        int[] var7 = this.field230[arg0];
        for (int var8 = 0; var8 < var4; var8++) {
            if (var5[var7[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class37.method239(false, (byte) 38, this.field209[arg0]);
        } else {
            var9 = class37.method239(true, (byte) 38, this.field209[arg0]);
            class35 var10 = new class35(var9);
            var10.method234((byte) -109, var10.field463.length, arg1, 5);
        }
        byte[] var11;
        try {
            var11 = class24.method165(false, var9);
        } catch (RuntimeException var28) {
            throw class8.method82(var28, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class4.method24(var9, var9.length, (byte) -1) + "," + class4.method24(var9, var9.length - 2, (byte) -1) + "," + this.field213[arg0] + "," + this.field227);
        }
        if (this.field223) {
            this.field209[arg0] = null;
        }
        if (var4 <= 1) {
            var5[var7[0]] = class28.method206(6, var11, false);
        } else {
            int var13 = var11.length;
            int[] var14 = new int[var4];
            int var29 = var13 - 1;
            int var15 = var11[var29] & 0xFF;
            class35 var16 = new class35(var11);
            int var17 = var29 - var4 * var15 * 4;
            var16.field470 = var17;
            for (int var18 = 0; var18 < var15; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var16.method228((byte) -20);
                    var14[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var14[var22]];
                var14[var22] = 0;
            }
            var16.field470 = var17;
            int var23 = 0;
            for (int var24 = 0; var24 < var15; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var16.method228((byte) -20);
                    class13.method107(var11, var23, var21[var26], var14[var26], var25);
                    var14[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                var5[var7[var27]] = class28.method206(6, var21[var27], false);
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([IIII)[B", line = 472)
    private final byte[] method149(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 || arg1 >= this.field212.length || this.field212[arg1] == null || arg3 < 0 || arg3 >= this.field212[arg1].length) {
            return null;
        }
        if (this.field212[arg1][arg3] == null) {
            boolean var5 = this.method148(arg1, arg0, arg2 - 29582);
            if (!var5) {
                this.method144((byte) 125, arg1);
                boolean var6 = this.method148(arg1, arg0, -1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class37.method239(false, (byte) 38, this.field212[arg1][arg3]);
        if (arg2 != 29581) {
            field225 = -115;
        }
        if (this.field218) {
            this.field212[arg1][arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(B)V", line = 518)
    public static void method150(byte arg0) {
        field217 = null;
        field229 = null;
        if (arg0 <= -13) {
            field216 = null;
            field215 = null;
            field214 = null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "(ZZ)V", line = 541)
    public class20(boolean arg0, boolean arg1) {
        this.field218 = arg1;
        this.field223 = arg0;
    }
}
