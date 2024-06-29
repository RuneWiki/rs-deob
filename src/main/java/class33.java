import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public abstract class class33 {

    @OriginalMember(owner = "mapview!v", name = "o", descriptor = "Z")
    private boolean field388;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "Z")
    private boolean field376;

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "Lt;")
    public static class31 field383 = class11.method64(-78, "u_pass");

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "Lt;")
    public static class31 field379 = class11.method64(-78, "Staff Shop");

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "Lt;")
    public static class31 field381 = class11.method64(122, "Platebody Shop");

    @OriginalMember(owner = "mapview!v", name = "p", descriptor = "Lt;")
    public static class31 field389 = class11.method64(-43, "Clothes Shop");

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "Lt;")
    public static class31 field385 = class11.method64(-61, "Food Shop");

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "mapview!v", name = "v", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "mapview!v", name = "u", descriptor = "Lia;")
    private class17 field394;

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "[I")
    private int[] field375;

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "[I")
    private int[] field377;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "[I")
    private int[] field378;

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "[I")
    private int[] field384;

    @OriginalMember(owner = "mapview!v", name = "q", descriptor = "[I")
    public static int[] field390;

    @OriginalMember(owner = "mapview!v", name = "t", descriptor = "[I")
    public int[] field393;

    @OriginalMember(owner = "mapview!v", name = "s", descriptor = "[Lia;")
    private class17[] field392;

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "[[B")
    public byte[][] field386;

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "[[I")
    private int[][] field382;

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "[[I")
    private int[][] field387;

    @OriginalMember(owner = "mapview!v", name = "r", descriptor = "[[[B")
    private byte[][][] field391;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 5)
    public static final void method187(byte arg0, Component arg1) {
        arg1.removeMouseListener(class27.field301);
        if (arg0 > -126) {
            method187((byte) -100, null);
        }
        arg1.removeMouseMotionListener(class27.field301);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Lt;BLt;)[B", line = 22)
    public final byte[] method188(class31 arg0, byte arg1, class31 arg2) {
        class31 var4 = arg2.method172(0);
        class31 var5 = arg0.method172(0);
        if (arg1 >= -55) {
            return (byte[]) null;
        } else {
            int var6 = this.field394.method101(var4.method162(-98), (byte) 87);
            int var7 = this.field392[var6].method101(var5.method162(-98), (byte) 87);
            return this.method192(var6, var7, (byte) 109);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "([IIII)[B", line = 42)
    private final byte[] method189(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 > arg2 || this.field391.length <= arg2 || this.field391[arg2] == null || arg1 < 0 || this.field391[arg2].length <= arg1) {
            return null;
        }
        if (this.field391[arg2][arg1] == null) {
            boolean var5 = this.method196(arg2, arg3, arg0);
            if (!var5) {
                this.method198(arg2, true);
                boolean var6 = this.method196(arg2, 0, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = this.field391[arg2][arg1];
        if (this.field376) {
            this.field391[arg2][arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)Lda;", line = 79)
    public static final class8 method190(int arg0) {
        if (arg0 != 1) {
            return (class8) null;
        }
        try {
            return (class8) Class.forName("e").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class32();
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 94)
    public static final void method191(int arg0, Component arg1) {
        arg1.removeKeyListener(class11.field186);
        arg1.removeFocusListener(class11.field186);
        if (arg0 != 0) {
            field390 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IIB)[B", line = 112)
    public final byte[] method192(int arg0, int arg1, byte arg2) {
        if (arg2 != 109) {
            this.field392 = null;
        }
        return this.method189(null, arg1, arg0, 0);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Lt;I)I", line = 150)
    public final int method193(class31 arg0, int arg1) {
        if (arg1 >= -78) {
            return 4;
        } else {
            class31 var3 = arg0.method172(0);
            return this.field394.method101(var3.method162(-98), (byte) 87);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "([BI)V", line = 162)
    public final void method194(byte[] arg0, int arg1) {
        this.field374 = class8.method56((byte) 71, arg0.length, arg0);
        class25 var3 = new class25(class25.method143(-1, arg0));
        int var4 = var3.method145(85);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method145(94);
        int var6 = -1;
        int var7 = 119 / ((arg1 + 5) / 44);
        int var8 = 0;
        this.field395 = var3.method142(true);
        this.field393 = new int[this.field395];
        for (int var9 = 0; var9 < this.field395; var9++) {
            this.field393[var9] = var8 += var3.method142(true);
            if (var6 < this.field393[var9]) {
                var6 = this.field393[var9];
            }
        }
        this.field391 = new byte[var6 + 1][][];
        this.field384 = new int[var6 + 1];
        this.field386 = new byte[var6 + 1][];
        this.field378 = new int[var6 + 1];
        this.field375 = new int[var6 + 1];
        this.field387 = new int[var6 + 1][];
        if (var5 != 0) {
            this.field377 = new int[var6 + 1];
            for (int var10 = 0; var10 < this.field395; var10++) {
                this.field377[this.field393[var10]] = var3.method144(98);
            }
            this.field394 = new class17(this.field377);
        }
        for (int var11 = 0; var11 < this.field395; var11++) {
            this.field384[this.field393[var11]] = var3.method144(126);
        }
        for (int var12 = 0; var12 < this.field395; var12++) {
            this.field378[this.field393[var12]] = var3.method144(121);
        }
        for (int var13 = 0; var13 < this.field395; var13++) {
            this.field375[this.field393[var13]] = var3.method142(true);
        }
        for (int var14 = 0; var14 < this.field395; var14++) {
            int var15 = 0;
            int var16 = this.field393[var14];
            int var17 = this.field375[var16];
            this.field387[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field387[var16][var19] = var15 += var3.method142(true);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field391[var16] = new byte[var18 + 1][];
        }
        if (var5 == 0) {
            return;
        }
        this.field382 = new int[var6 + 1][];
        this.field392 = new class17[var6 + 1];
        for (int var21 = 0; var21 < this.field395; var21++) {
            int var22 = this.field393[var21];
            int var23 = this.field375[var22];
            this.field382[var22] = new int[this.field391[var22].length];
            for (int var24 = 0; var24 < var23; var24++) {
                this.field382[var22][this.field387[var22][var24]] = var3.method144(70);
            }
            this.field392[var22] = new class17(this.field382[var22]);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Z)V", line = 303)
    public static void method195(boolean arg0) {
        if (!arg0) {
            field385 = null;
        }
        field379 = null;
        field381 = null;
        field385 = null;
        field389 = null;
        field390 = null;
        field383 = null;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(II[I)Z", line = 323)
    private final boolean method196(int arg0, int arg1, int[] arg2) {
        if (this.field386[arg0] == null) {
            return false;
        }
        int[] var4 = this.field387[arg0];
        int var5 = this.field375[arg0];
        boolean var6 = true;
        byte[][] var7 = this.field391[arg0];
        for (int var8 = arg1; var8 < var5; var8++) {
            if (var7[var4[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
            var9 = this.field386[arg0];
        } else {
            var9 = new byte[this.field386[arg0].length];
            class5.method47(this.field386[arg0], 0, var9, 0, var9.length);
            class25 var10 = new class25(var9);
            var10.method135(var10.field280.length, (byte) 122, arg2, 5);
        }
        byte[] var11;
        try {
            var11 = class25.method143(-1, var9);
        } catch (RuntimeException var26) {
            throw class1.method31(var26, "T3 - " + (arg2 != null) + "," + arg0 + "," + var9.length + "," + class8.method56((byte) 113, var9.length, var9) + "," + class8.method56((byte) 111, var9.length - 2, var9) + "," + this.field384[arg0] + "," + this.field374);
        }
        if (this.field388) {
            this.field386[arg0] = null;
        }
        if (var5 > 1) {
            int[] var13 = new int[var5];
            int var14 = var11.length;
            int var27 = var14 - 1;
            int var15 = var11[var27] & 0xFF;
            int var16 = var27 - var5 * var15 * 4;
            class25 var17 = new class25(var11);
            var17.field281 = var16;
            for (int var18 = 0; var18 < var15; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var5; var20++) {
                    var19 += var17.method144(96);
                    var13[var20] += var19;
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (var7[var4[var21]] == null) {
                    var7[var4[var21]] = new byte[var13[var21]];
                }
                var13[var21] = 0;
            }
            int var22 = 0;
            var17.field281 = var16;
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var5; var25++) {
                    var24 += var17.method144(75);
                    class5.method47(var11, var22, var7[var4[var25]], var13[var25], var24);
                    var13[var25] += var24;
                    var22 += var24;
                }
            }
        } else {
            var7[var4[0]] = var11;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Lt;IB)I", line = 468)
    public final int method197(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 15) {
            this.field374 = 53;
        }
        class31 var4 = arg0.method172(arg2 - 15);
        return this.field392[arg1].method101(var4.method162(-98), (byte) 87);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IZ)V", line = 488)
    private final void method198(int arg0, boolean arg1) {
        if (!arg1) {
            field385 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "(ZZ)V", line = 500)
    public class33(boolean arg0, boolean arg1) {
        this.field388 = arg0;
        this.field376 = arg1;
    }
}
