import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class46 {

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "Lsr;")
    public class165 field560;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "Z")
    public static boolean field559;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "[I")
    public int[] field551;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
    public int[] field554;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "[I")
    public int[] field558;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "[I")
    public int[] field562;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "[I")
    public int[] field563;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "[I")
    public int[] field565;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "[Lsr;")
    public class165[] field568;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "[[I")
    public int[][] field556;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "[[I")
    public int[][] field564;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)I")
    public static final int method423(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method423(-35, -75, -47);
        }
        field557++;
        return arg2 == 4 || arg2 == 5 ? class132.field1932[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[B)V")
    private final void method424(int arg0, byte[] arg1) {
        field561++;
        class391 var3 = new class391(class129.method894(arg1, (byte) -57));
        int var4 = var3.method2348(-2);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field552 = 0;
        } else {
            this.field552 = var3.method2361((byte) -56);
        }
        int var5 = var3.method2348(-2);
        this.field567 = var3.method2353((byte) 78);
        int var6 = 0;
        int var7 = -1;
        this.field565 = new int[this.field567];
        for (int var8 = arg0; var8 < this.field567; var8++) {
            this.field565[var8] = var6 += var3.method2353((byte) 70);
            if (var7 < this.field565[var8]) {
                var7 = this.field565[var8];
            }
        }
        this.field555 = var7 + 1;
        this.field556 = new int[this.field555][];
        this.field551 = new int[this.field555];
        this.field558 = new int[this.field555];
        this.field554 = new int[this.field555];
        this.field563 = new int[this.field555];
        if (var5 != 0) {
            this.field562 = new int[this.field555];
            for (int var9 = 0; var9 < this.field555; var9++) {
                this.field562[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field567; var10++) {
                this.field562[this.field565[var10]] = var3.method2361((byte) -56);
            }
            this.field560 = new class165(this.field562);
        }
        for (int var11 = 0; var11 < this.field567; var11++) {
            this.field558[this.field565[var11]] = var3.method2361((byte) -56);
        }
        for (int var12 = 0; var12 < this.field567; var12++) {
            this.field554[this.field565[var12]] = var3.method2361((byte) -56);
        }
        for (int var13 = 0; var13 < this.field567; var13++) {
            this.field563[this.field565[var13]] = var3.method2353((byte) 66);
        }
        for (int var14 = 0; var14 < this.field567; var14++) {
            int var21 = this.field565[var14];
            int var22 = this.field563[var21];
            int var23 = 0;
            int var24 = -1;
            this.field556[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field556[var21][var25] = var23 += var3.method2353((byte) 105);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field551[var21] = var24 + 1;
            if ((var24 + 1) == var22) {
                this.field556[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field568 = new class165[var7 + 1];
        this.field564 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field567; var15++) {
            int var16 = this.field565[var15];
            int var17 = this.field563[var16];
            this.field564[var16] = new int[this.field551[var16]];
            for (int var18 = 0; var18 < this.field551[var16]; var18++) {
                this.field564[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field556[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field556[var16][var19];
                }
                this.field564[var16][var20] = var3.method2361((byte) -56);
            }
            this.field568[var16] = new class165(this.field564[var16]);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZIII)I")
    public static final int method425(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field559 = true;
        }
        field553++;
        if (arg1 < arg3) {
            return arg3;
        } else if (arg1 <= arg2) {
            return arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([BI)V")
    public class46(byte[] arg0, int arg1) {
        this.field566 = class147.method986((byte) 62, arg0, arg0.length);
        if (this.field566 != arg1) {
            throw new RuntimeException();
        }
        this.method424(0, arg0);
    }
}
