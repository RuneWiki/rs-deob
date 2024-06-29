import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class608 {

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public int field8797;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "[B")
    private byte[] field8792;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "Liba;")
    public static class211 field8800 = new class211(10, 3);

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field8809 = 0;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public int field8788;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public int field8791;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public int field8802;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "Ljs;")
    public class262 field8798;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "[I")
    public int[] field8789;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "[I")
    public int[] field8790;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "[I")
    public int[] field8801;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "[I")
    public int[] field8803;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "[I")
    public int[] field8806;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "[I")
    public int[] field8807;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "[Ljs;")
    public class262[] field8799;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "[[B")
    public byte[][] field8808;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "[[I")
    public int[][] field8796;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "[[I")
    public int[][] field8805;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 8)
    public static void method3474(byte arg0) {
        if (arg0 == -112) {
            field8800 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)I", line = 19)
    public static final int method3475(int arg0, int arg1, int arg2) {
        if (arg2 != -27274) {
            return 12;
        }
        field8794++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)I", line = 57)
    public static final int method3476(byte arg0, int arg1) {
        if (arg0 != -114) {
            field8809 = -61;
        }
        field8795++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[B)V", line = 81)
    private final void method3477(int arg0, byte[] arg1) {
        field8793++;
        class540 var3 = new class540(class685.method3843(arg1, (byte) -124));
        int var4 = var3.method3115(arg0 + 29866);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field8791 = var3.method3160(false);
        } else {
            this.field8791 = 0;
        }
        int var5 = var3.method3115(29871);
        boolean var6 = (var5 & 0x1) != 0;
        this.field8802 = var3.method3169(26488);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field8801 = new int[this.field8802];
        if (arg0 != 5) {
            this.method3477(-86, null);
        }
        for (int var10 = 0; var10 < this.field8802; var10++) {
            this.field8801[var10] = var8 += var3.method3169(26488);
            if (this.field8801[var10] > var9) {
                var9 = this.field8801[var10];
            }
        }
        this.field8788 = var9 + 1;
        this.field8789 = new int[this.field8788];
        this.field8807 = new int[this.field8788];
        this.field8790 = new int[this.field8788];
        this.field8803 = new int[this.field8788];
        if (var7) {
            this.field8808 = new byte[this.field8788][];
        }
        this.field8805 = new int[this.field8788][];
        if (var6) {
            this.field8806 = new int[this.field8788];
            for (int var11 = 0; var11 < this.field8788; var11++) {
                this.field8806[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field8802; var12++) {
                this.field8806[this.field8801[var12]] = var3.method3160(false);
            }
            this.field8798 = new class262(this.field8806);
        }
        for (int var13 = 0; var13 < this.field8802; var13++) {
            this.field8803[this.field8801[var13]] = var3.method3160(false);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field8802; var14++) {
                byte[] var15 = new byte[64];
                var3.method3155(64, 0, var15, 0);
                this.field8808[this.field8801[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field8802; var16++) {
            this.field8789[this.field8801[var16]] = var3.method3160(false);
        }
        for (int var17 = 0; var17 < this.field8802; var17++) {
            this.field8807[this.field8801[var17]] = var3.method3169(arg0 + 26483);
        }
        for (int var18 = 0; var18 < this.field8802; var18++) {
            int var25 = this.field8801[var18];
            int var26 = this.field8807[var25];
            int var27 = 0;
            this.field8805[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field8805[var25][var29] = var27 += var3.method3169(arg0 + 26483);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field8790[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field8805[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field8799 = new class262[var9 + 1];
        this.field8796 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field8802; var19++) {
            int var20 = this.field8801[var19];
            int var21 = this.field8807[var20];
            this.field8796[var20] = new int[this.field8790[var20]];
            for (int var22 = 0; var22 < this.field8790[var20]; var22++) {
                this.field8796[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field8805[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field8805[var20][var23];
                }
                this.field8796[var20][var24] = var3.method3160(false);
            }
            this.field8799[var20] = new class262(this.field8796[var20]);
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([BI[B)V", line = 282)
    public class608(byte[] arg0, int arg1, byte[] arg2) {
        this.field8797 = class261.method1569(arg0, arg0.length, -51);
        if (this.field8797 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field8792 = class86.method492(arg0.length, 0, (byte) 18, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field8792[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3477(5, arg0);
    }
}
