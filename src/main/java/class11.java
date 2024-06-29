import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public abstract class class11 {

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "Z")
    private boolean field117;

    @OriginalMember(owner = "mapview!fa", name = "p", descriptor = "Z")
    public boolean field130;

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Lta;")
    public static class37 field119 = class20.method87(-110, "mapscene");

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Lta;")
    public static class37 field123 = class20.method87(-117, "Clothes Shop");

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "mapview!fa", name = "m", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "mapview!fa", name = "o", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "mapview!fa", name = "q", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Lu;")
    private class38 field118;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "[I")
    private int[] field116;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "[I")
    public static int[] field121;

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "[I")
    public int[] field122;

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "[I")
    private int[] field124;

    @OriginalMember(owner = "mapview!fa", name = "n", descriptor = "[I")
    private int[] field128;

    @OriginalMember(owner = "mapview!fa", name = "t", descriptor = "[I")
    private int[] field134;

    @OriginalMember(owner = "mapview!fa", name = "r", descriptor = "[Lu;")
    private class38[] field132;

    @OriginalMember(owner = "mapview!fa", name = "l", descriptor = "[Ljava/lang/Object;")
    public Object[] field126;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "[[I")
    private int[][] field115;

    @OriginalMember(owner = "mapview!fa", name = "s", descriptor = "[[I")
    private int[][] field133;

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field125;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lta;B)I", line = 6)
    public final int method43(class37 arg0, byte arg1) {
        class37 var3 = arg0.method228(false);
        if (arg1 != -66) {
            this.method47(-42, 21, 15);
        }
        return this.field118.method251(arg1 + 182, var3.method239((byte) 96));
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lta;ILta;)[B", line = 25)
    public final byte[] method44(class37 arg0, int arg1, class37 arg2) {
        class37 var4 = arg2.method228(false);
        class37 var5 = arg0.method228(false);
        if (arg1 != -28255) {
            this.field133 = null;
        }
        int var6 = this.field118.method251(arg1 ^ 0xFFFF91DD, var4.method239((byte) 110));
        int var7 = this.field132[var6].method251(117, var5.method239((byte) 80));
        return this.method47(48, var7, var6);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ZI)V", line = 44)
    private final void method45(boolean arg0, int arg1) {
        if (!arg0) {
            this.method43(null, (byte) 73);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(BLba;Ljava/lang/Object;)V", line = 54)
    public static final void method46(byte arg0, class3 arg1, Object arg2) {
        if (arg1.field32 == null) {
            return;
        }
        if (arg0 >= -105) {
            field131 = -43;
        }
        for (int var3 = 0; var3 < 50 && arg1.field32.peekEvent() != null; var3++) {
            class30.method183(1L, 1000);
        }
        if (arg2 != null) {
            arg1.field32.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(III)[B", line = 113)
    public final byte[] method47(int arg0, int arg1, int arg2) {
        int var4 = 119 / ((-arg0 - 2) / 45);
        return this.method53(arg1, null, arg2, -32201);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "([BI)V", line = 147)
    public final void method48(byte[] arg0, int arg1) {
        this.field120 = class20.method88(arg0.length, arg0, (byte) 31);
        class21 var3 = new class21(class6.method26((byte) -122, arg0));
        int var4 = var3.method96(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method100(-51);
        }
        int var5 = var3.method96(255);
        this.field129 = var3.method98(-2);
        this.field122 = new int[this.field129];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field129; var8++) {
            this.field122[var8] = var6 += var3.method98(-2);
            if (this.field122[var8] > var7) {
                var7 = this.field122[var8];
            }
        }
        this.field125 = new Object[var7 + 1][];
        this.field134 = new int[var7 + 1];
        this.field115 = new int[var7 + 1][];
        this.field126 = new Object[var7 + 1];
        this.field128 = new int[var7 + 1];
        this.field116 = new int[var7 + 1];
        if (var5 != 0) {
            this.field124 = new int[var7 + 1];
            for (int var9 = 0; var9 < var7 + 1; var9++) {
                this.field124[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field129; var10++) {
                this.field124[this.field122[var10]] = var3.method100(-77);
            }
            this.field118 = new class38(this.field124);
        }
        for (int var11 = 0; var11 < this.field129; var11++) {
            this.field128[this.field122[var11]] = var3.method100(-99);
        }
        for (int var12 = 0; var12 < this.field129; var12++) {
            this.field134[this.field122[var12]] = var3.method100(-63);
        }
        for (int var13 = 0; var13 < this.field129; var13++) {
            this.field116[this.field122[var13]] = var3.method98(-2);
        }
        int var14 = 88 % ((arg1 + 86) / 40);
        for (int var15 = 0; var15 < this.field129; var15++) {
            int var16 = 0;
            int var17 = this.field122[var15];
            int var18 = this.field116[var17];
            int var19 = -1;
            this.field115[var17] = new int[var18];
            for (int var20 = 0; var20 < var18; var20++) {
                int var21 = this.field115[var17][var20] = var16 += var3.method98(-2);
                if (var21 > var19) {
                    var19 = var21;
                }
            }
            if (var19 + 1 == var18) {
                this.field115[var17] = null;
            }
            this.field125[var17] = new Object[var19 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field133 = new int[var7 + 1][];
        this.field132 = new class38[var7 + 1];
        for (int var22 = 0; var22 < this.field129; var22++) {
            int var23 = this.field122[var22];
            int var24 = this.field116[var23];
            this.field133[var23] = new int[this.field125[var23].length];
            for (int var25 = 0; var25 < this.field125[var23].length; var25++) {
                this.field133[var23][var25] = -1;
            }
            for (int var26 = 0; var26 < var24; var26++) {
                int var27;
                if (this.field115[var23] == null) {
                    var27 = var26;
                } else {
                    var27 = this.field115[var23][var26];
                }
                this.field133[var23][var27] = var3.method100(114);
            }
            this.field132[var23] = new class38(this.field133[var23]);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 321)
    public static void method49(int arg0) {
        field119 = null;
        field121 = null;
        field123 = null;
        if (arg0 <= 84) {
            field121 = null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ZLta;I)I", line = 334)
    public final int method50(boolean arg0, class37 arg1, int arg2) {
        if (arg0) {
            class37 var4 = arg1.method228(false);
            return this.field132[arg2].method251(122, var4.method239((byte) 74));
        } else {
            return 24;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lfa;Lfa;III)Loa;", line = 351)
    public static final class29 method51(class11 arg0, class11 arg1, int arg2, int arg3, int arg4) {
        if (class30.method175(arg2, arg0, arg3 + 1, arg4)) {
            if (arg3 != -1) {
                method51(null, null, -79, -5, 71);
            }
            return class5.method18((byte) -73, arg1.method47(-58, arg4, arg2));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(II[I)Z", line = 364)
    private final boolean method52(int arg0, int arg1, int[] arg2) {
        if (this.field126[arg1] == null) {
            return false;
        }
        int var4 = this.field116[arg1];
        int[] var5 = this.field115[arg1];
        boolean var6 = true;
        Object[] var7 = this.field125[arg1];
        for (int var8 = arg0; var8 < var4; var8++) {
            int var9;
            if (var5 == null) {
                var9 = var8;
            } else {
                var9 = var5[var8];
            }
            if (var7[var9] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var10;
        if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
            var10 = class40.method262(this.field126[arg1], arg0 + 760, false);
        } else {
            var10 = class40.method262(this.field126[arg1], arg0 + 760, true);
            class21 var11 = new class21(var10);
            var11.method101(-105, var11.field234.length, arg2, 5);
        }
        byte[] var12;
        try {
            var12 = class6.method26((byte) -122, var10);
        } catch (RuntimeException var31) {
            throw class8.method35(var31, "T3 - " + (arg2 != null) + "," + arg1 + "," + var10.length + "," + class20.method88(var10.length, var10, (byte) 31) + "," + class20.method88(var10.length - 2, var10, (byte) 31) + "," + this.field128[arg1] + "," + this.field120);
        }
        if (this.field130) {
            this.field126[arg1] = null;
        }
        if (var4 > 1) {
            int var14 = var12.length;
            int[] var15 = new int[var4];
            int var32 = var14 - 1;
            int var16 = var12[var32] & 0xFF;
            class21 var17 = new class21(var12);
            int var18 = var32 - var4 * 4 * var16;
            var17.field235 = var18;
            for (int var19 = 0; var19 < var16; var19++) {
                int var20 = 0;
                for (int var21 = 0; var21 < var4; var21++) {
                    var20 += var17.method100(-72);
                    if (var5 != null) {
                    }
                    var15[var21] += var20;
                }
            }
            byte[][] var22 = new byte[var4][];
            for (int var23 = 0; var23 < var4; var23++) {
                var22[var23] = new byte[var15[var23]];
                var15[var23] = 0;
            }
            var17.field235 = var18;
            int var24 = 0;
            for (int var25 = 0; var25 < var16; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var4; var27++) {
                    var26 += var17.method100(-114);
                    class32.method190(var12, var24, var22[var27], var15[var27], var26);
                    var24 += var26;
                    var15[var27] += var26;
                }
            }
            for (int var28 = 0; var28 < var4; var28++) {
                int var29;
                if (var5 == null) {
                    var29 = var28;
                } else {
                    var29 = var5[var28];
                }
                if (this.field117) {
                    var7[var29] = var22[var28];
                } else {
                    var7[var29] = class31.method189(false, var22[var28], 48);
                }
            }
        } else {
            int var30;
            if (var5 == null) {
                var30 = 0;
            } else {
                var30 = var5[0];
            }
            if (this.field117) {
                var7[var30] = var12;
            } else {
                var7[var30] = class31.method189(false, var12, -123);
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I[III)[B", line = 548)
    private final byte[] method53(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 < 0 || this.field125.length <= arg2 || this.field125[arg2] == null || arg0 < 0 || arg0 >= this.field125[arg2].length) {
            return null;
        }
        if (this.field125[arg2][arg0] == null) {
            boolean var5 = this.method52(arg3 + 32201, arg2, arg1);
            if (!var5) {
                this.method45(true, arg2);
                boolean var6 = this.method52(arg3 ^ 0xFFFF8237, arg2, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class40.method262(this.field125[arg2][arg0], 760, false);
        if (this.field117) {
            this.field125[arg2][arg0] = null;
        }
        if (arg3 != -32201) {
            this.field128 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "(ZZ)V", line = 591)
    public class11(boolean arg0, boolean arg1) {
        this.field117 = arg1;
        this.field130 = arg0;
    }
}
