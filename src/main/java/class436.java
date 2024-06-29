import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class436 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[B")
    private byte[] field6361;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field6372 = 0;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field6364 = -1;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public int field6357;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public int field6373;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public int field6375;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lcf;")
    public class395 field6362;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "[I")
    public int[] field6355;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[I")
    public static int[] field6358;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "[I")
    public int[] field6360;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "[I")
    public int[] field6363;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "[I")
    public int[] field6366;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "[I")
    public int[] field6370;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "[I")
    public int[] field6377;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "[Lcf;")
    public class395[] field6365;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "[[B")
    public byte[][] field6368;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "[[I")
    public int[][] field6367;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "[[I")
    public int[][] field6371;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 13)
    public static void method2693(int arg0) {
        field6358 = null;
        if (arg0 != -1) {
            method2694(2, -125, 7);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Z", line = 35)
    public static final boolean method2694(int arg0, int arg1, int arg2) {
        field6376++;
        if (arg2 != -1) {
            method2694(107, 65, 36);
        }
        return class635.method3597(arg1, arg0, 9943) || class476.method2888(11149, arg1, arg0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B[B)V", line = 52)
    private final void method2695(byte arg0, byte[] arg1) {
        field6369++;
        class301 var3 = new class301(class196.method1474(arg1, 0));
        int var4 = var3.method1987(-39);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field6375 = 0;
        } else {
            this.field6375 = var3.method1934(-2);
        }
        int var5 = var3.method1987(-71);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        if (arg0 <= 9) {
            method2694(59, -8, 119);
        }
        this.field6357 = var3.method1989((byte) -94);
        int var8 = 0;
        this.field6366 = new int[this.field6357];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field6357; var10++) {
            this.field6366[var10] = var8 += var3.method1989((byte) -90);
            if (var9 < this.field6366[var10]) {
                var9 = this.field6366[var10];
            }
        }
        this.field6373 = var9 + 1;
        this.field6377 = new int[this.field6373];
        this.field6363 = new int[this.field6373];
        this.field6355 = new int[this.field6373];
        this.field6360 = new int[this.field6373];
        this.field6367 = new int[this.field6373][];
        if (var7) {
            this.field6368 = new byte[this.field6373][];
        }
        if (var6) {
            this.field6370 = new int[this.field6373];
            for (int var11 = 0; var11 < this.field6373; var11++) {
                this.field6370[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field6357; var12++) {
                this.field6370[this.field6366[var12]] = var3.method1934(-2);
            }
            this.field6362 = new class395(this.field6370);
        }
        for (int var13 = 0; var13 < this.field6357; var13++) {
            this.field6355[this.field6366[var13]] = var3.method1934(-2);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field6357; var14++) {
                byte[] var15 = new byte[64];
                var3.method1936(0, 10046, 64, var15);
                this.field6368[this.field6366[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field6357; var16++) {
            this.field6363[this.field6366[var16]] = var3.method1934(-2);
        }
        for (int var17 = 0; var17 < this.field6357; var17++) {
            this.field6360[this.field6366[var17]] = var3.method1989((byte) -89);
        }
        for (int var18 = 0; var18 < this.field6357; var18++) {
            int var25 = this.field6366[var18];
            int var26 = this.field6360[var25];
            int var27 = 0;
            this.field6367[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field6367[var25][var29] = var27 += var3.method1989((byte) -74);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field6377[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field6367[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field6371 = new int[var9 + 1][];
        this.field6365 = new class395[var9 + 1];
        for (int var19 = 0; var19 < this.field6357; var19++) {
            int var20 = this.field6366[var19];
            int var21 = this.field6360[var20];
            this.field6371[var20] = new int[this.field6377[var20]];
            for (int var22 = 0; var22 < this.field6377[var20]; var22++) {
                this.field6371[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field6367[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field6367[var20][var23];
                }
                this.field6371[var20][var24] = var3.method1934(-2);
            }
            this.field6365[var20] = new class395(this.field6371[var20]);
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([BI[B)V", line = 248)
    public class436(byte[] arg0, int arg1, byte[] arg2) {
        this.field6356 = class172.method1359(arg0.length, false, arg0);
        if (this.field6356 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field6361 = class38.method313(arg0.length, 23863, 0, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field6361[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2695((byte) 104, arg0);
    }
}
