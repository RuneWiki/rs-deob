import java.awt.Canvas;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public abstract class class35 {

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Z")
    private boolean field463;

    @OriginalMember(owner = "mapview!s", name = "p", descriptor = "Z")
    public boolean field475;

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "Z")
    public static boolean field469 = false;

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "Lea;")
    public static class10 field471 = class3.method8("mapfunction", 116);

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "Lea;")
    public static class10 field468 = class3.method8("Cookery Shop", -93);

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Lea;")
    public static class10 field462 = class3.method8("Guide", -87);

    @OriginalMember(owner = "mapview!s", name = "w", descriptor = "[I")
    public static int[] field482 = new int[128];

    @OriginalMember(owner = "mapview!s", name = "n", descriptor = "Lea;")
    public static class10 field473 = class3.method8("Magic Shop", 114);

    @OriginalMember(owner = "mapview!s", name = "x", descriptor = "Lea;")
    public static class10 field483 = class3.method8("75(U", 117);

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Lea;")
    public static class10 field464 = class3.method8("overlay2)3dat", -66);

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "mapview!s", name = "u", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "mapview!s", name = "B", descriptor = "J")
    public static long field486;

    @OriginalMember(owner = "mapview!s", name = "y", descriptor = "Lea;")
    public static class10 field484;

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Lta;")
    private class38 field465;

    @OriginalMember(owner = "mapview!s", name = "t", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field479;

    @OriginalMember(owner = "mapview!s", name = "s", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field478;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "[I")
    private int[] field460;

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "[I")
    private int[] field470;

    @OriginalMember(owner = "mapview!s", name = "m", descriptor = "[I")
    private int[] field472;

    @OriginalMember(owner = "mapview!s", name = "v", descriptor = "[I")
    public int[] field481;

    @OriginalMember(owner = "mapview!s", name = "z", descriptor = "[I")
    private int[] field485;

    @OriginalMember(owner = "mapview!s", name = "r", descriptor = "[Lta;")
    private class38[] field477;

    @OriginalMember(owner = "mapview!s", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field476;

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "[[I")
    private int[][] field461;

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "[[I")
    private int[][] field466;

    @OriginalMember(owner = "mapview!s", name = "o", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field474;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(II)V", line = 7)
    private final void method233(int arg0, int arg1) {
        if (arg1 >= -34) {
            field462 = null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lea;ILea;)[B", line = 23)
    public final byte[] method234(class10 arg0, int arg1, class10 arg2) {
        class10 var4 = arg2.method53((byte) 65);
        if (arg1 != 2) {
            this.field480 = -65;
        }
        class10 var5 = arg0.method53((byte) 56);
        int var6 = this.field465.method249(var4.method65(77), 1);
        int var7 = this.field477[var6].method249(var5.method65(112), 1);
        return this.method237(-31985, var7, var6);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Z)V", line = 52)
    public static void method235(boolean arg0) {
        field478 = null;
        field464 = null;
        field479 = null;
        field482 = null;
        field471 = null;
        field473 = null;
        field462 = null;
        field483 = null;
        field468 = null;
        if (!arg0) {
            field484 = null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I[IZ)Z", line = 72)
    private final boolean method236(int arg0, int[] arg1, boolean arg2) {
        if (this.field476[arg0] == null) {
            return false;
        }
        int var4 = this.field485[arg0];
        Object[] var5 = this.field474[arg0];
        int[] var6 = this.field461[arg0];
        boolean var7 = arg2;
        for (int var8 = 0; var8 < var4; var8++) {
            if (var5[var6[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class22.method152(this.field476[arg0], false, 8353);
        } else {
            var9 = class22.method152(this.field476[arg0], true, 8353);
            class11 var10 = new class11(var9);
            var10.method80(arg1, 10270, 5, var10.field89.length);
        }
        byte[] var11;
        try {
            var11 = class21.method146(0, var9);
        } catch (RuntimeException var28) {
            throw class4.method15(var28, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class4.method16(var9.length, var9, -100) + "," + class4.method16(var9.length - 2, var9, -85) + "," + this.field472[arg0] + "," + this.field480);
        }
        if (this.field475) {
            this.field476[arg0] = null;
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int var15 = var29 - var4 * 4 * var14;
            int[] var16 = new int[var4];
            class11 var17 = new class11(var11);
            var17.field86 = var15;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var17.method83(1);
                    var16[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var16[var22]];
                var16[var22] = 0;
            }
            var17.field86 = var15;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var17.method83(1);
                    class26.method197(var11, var23, var21[var26], var16[var26], var25);
                    var16[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field463) {
                    var5[var6[var27]] = var21[var27];
                } else {
                    var5[var6[var27]] = class8.method35(false, var21[var27], (byte) -19);
                }
            }
        } else if (this.field463) {
            var5[var6[0]] = var11;
        } else {
            var5[var6[0]] = class8.method35(false, var11, (byte) -19);
        }
        return true;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(III)[B", line = 232)
    public final byte[] method237(int arg0, int arg1, int arg2) {
        return arg0 == -31985 ? this.method238(arg2, -1, arg1, null) : (byte[]) null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(III[I)[B", line = 247)
    private final byte[] method238(int arg0, int arg1, int arg2, int[] arg3) {
        if (~arg0 > arg1 || this.field474.length <= arg0 || this.field474[arg0] == null || arg2 < 0 || arg2 >= this.field474[arg0].length) {
            return null;
        }
        if (this.field474[arg0][arg2] == null) {
            boolean var5 = this.method236(arg0, arg3, true);
            if (!var5) {
                this.method233(arg0, -125);
                boolean var6 = this.method236(arg0, arg3, true);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class22.method152(this.field474[arg0][arg2], false, 8353);
        if (this.field463) {
            this.field474[arg0][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(Z)V", line = 300)
    public static final void method239(boolean arg0) {
        if (class22.field239[0][class17.field185][class21.field231] == null) {
            class6.field47 = null;
        } else {
            class6.field47 = class22.field239[0][class17.field185][class21.field231];
        }
        if (class22.field239[1][class17.field185][class21.field231] == null) {
            class14.field164 = null;
        } else {
            class14.field164 = class22.field239[1][class17.field185][class21.field231];
        }
        if (class22.field239[2][class17.field185][class21.field231] == null) {
            class33.field452 = null;
        } else {
            class33.field452 = class22.field239[2][class17.field185][class21.field231];
        }
        if (class22.field239[3][class17.field185][class21.field231] == null) {
            class13.field137 = null;
        } else {
            class13.field137 = class22.field239[3][class17.field185][class21.field231];
        }
        if (class22.field239[4][class17.field185][class21.field231] == null) {
            class40.field513 = null;
        } else {
            class40.field513 = class22.field239[4][class17.field185][class21.field231];
        }
        if (class1.field7[class17.field185][class21.field231] == null) {
            class13.field124 = null;
        } else {
            class13.field124 = class1.field7[class17.field185][class21.field231];
        }
        if (!arg0) {
            return;
        }
        if (class18.field186[class17.field185][class21.field231] == null) {
            class25.field389 = null;
        } else {
            class25.field389 = class18.field186[class17.field185][class21.field231];
        }
        if (class20.field214[class17.field185][class21.field231] == null) {
            class7.field60 = null;
        } else {
            class7.field60 = class20.field214[class17.field185][class21.field231];
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I[B)V", line = 391)
    public final void method240(int arg0, byte[] arg1) {
        this.field480 = class4.method16(arg1.length, arg1, -91);
        class11 var3 = new class11(class21.method146(0, arg1));
        int var4 = var3.method78(-106);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method83(arg0 ^ 0x1);
        }
        int var5 = var3.method78(-62);
        this.field467 = var3.method74((byte) -100);
        this.field481 = new int[this.field467];
        int var6 = -1;
        int var7 = 0;
        for (int var8 = arg0; var8 < this.field467; var8++) {
            this.field481[var8] = var7 += var3.method74((byte) -122);
            if (var6 < this.field481[var8]) {
                var6 = this.field481[var8];
            }
        }
        this.field476 = new Object[var6 + 1];
        this.field485 = new int[var6 + 1];
        this.field472 = new int[var6 + 1];
        this.field474 = new Object[var6 + 1][];
        this.field470 = new int[var6 + 1];
        this.field461 = new int[var6 + 1][];
        if (var5 != 0) {
            this.field460 = new int[var6 + 1];
            for (int var9 = 0; var9 < var6 + 1; var9++) {
                this.field460[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field467; var10++) {
                this.field460[this.field481[var10]] = var3.method83(1);
            }
            this.field465 = new class38(this.field460);
        }
        for (int var11 = 0; var11 < this.field467; var11++) {
            this.field472[this.field481[var11]] = var3.method83(1);
        }
        for (int var12 = 0; var12 < this.field467; var12++) {
            this.field470[this.field481[var12]] = var3.method83(1);
        }
        for (int var13 = 0; var13 < this.field467; var13++) {
            this.field485[this.field481[var13]] = var3.method74((byte) -80);
        }
        for (int var14 = 0; var14 < this.field467; var14++) {
            int var15 = 0;
            int var16 = -1;
            int var17 = this.field481[var14];
            int var18 = this.field485[var17];
            this.field461[var17] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field461[var17][var19] = var15 += var3.method74((byte) -128);
                if (var20 > var16) {
                    var16 = var20;
                }
            }
            this.field474[var17] = new Object[var16 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field477 = new class38[var6 + 1];
        this.field466 = new int[var6 + 1][];
        for (int var21 = 0; var21 < this.field467; var21++) {
            int var22 = this.field481[var21];
            int var23 = this.field485[var22];
            this.field466[var22] = new int[this.field474[var22].length];
            for (int var24 = 0; var24 < this.field474[var22].length; var24++) {
                this.field466[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                this.field466[var22][this.field461[var22][var25]] = var3.method83(1);
            }
            this.field477[var22] = new class38(this.field466[var22]);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(BLea;I)I", line = 557)
    public final int method241(byte arg0, class10 arg1, int arg2) {
        class10 var4 = arg1.method53((byte) 103);
        if (arg0 < 64) {
            this.method242(null, 102);
        }
        return this.field477[arg2].method249(var4.method65(108), 1);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lea;I)I", line = 576)
    public final int method242(class10 arg0, int arg1) {
        if (arg1 != 6) {
            this.method242(null, 13);
        }
        class10 var3 = arg0.method53((byte) 96);
        return this.field465.method249(var3.method65(84), arg1 ^ 0x7);
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "(ZZ)V", line = 587)
    public class35(boolean arg0, boolean arg1) {
        this.field463 = arg1;
        this.field475 = arg0;
    }
}
