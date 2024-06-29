import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class386 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public int field5630;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field5638;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public int field5639;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Ljs;")
    public class219 field5631;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[I")
    public int[] field5629;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    public int[] field5632;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    public int[] field5636;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[I")
    public int[] field5641;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[I")
    public int[] field5642;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
    public int[] field5644;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[Ljs;")
    public class219[] field5637;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[[B")
    public static byte[][] field5634;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[[I")
    public int[][] field5633;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[[I")
    public int[][] field5635;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg4 && arg2 == arg9 && arg5 == arg8 && arg1 == arg7) {
            class355.method2194(arg9, arg3, (byte) -40, arg5, arg1, arg0);
        } else {
            int var10 = arg3;
            int var11 = arg9;
            int var12 = arg3 * 3;
            int var13 = arg9 * 3;
            int var14 = arg4 * 3;
            int var15 = arg2 * 3;
            int var16 = arg8 * 3;
            int var17 = arg7 * 3;
            int var18 = arg5 + var14 - (arg3 + var16);
            int var19 = var15 + arg1 - arg9 - var17;
            int var20 = var16 - (var14 + var14 - var12);
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg3;
                int var34 = (var28 + var32 + var30 >> 12) + arg9;
                class355.method2194(var11, var10, (byte) -40, var33, var34, arg0);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg6 != -1) {
            method2366(41);
        }
        field5643++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method2366(int arg0) {
        if (arg0 != -10907) {
            field5634 = null;
        }
        field5634 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B[B)V")
    private final void method2367(byte arg0, byte[] arg1) {
        field5640++;
        class289 var3 = new class289(class359.method2212(-127, arg1));
        int var4 = var3.method1858(-3256);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field5645 = var3.method1815((byte) -80);
        } else {
            this.field5645 = 0;
        }
        int var5 = var3.method1858(-3256);
        this.field5638 = var3.method1841((byte) -124);
        int var6 = 0;
        this.field5644 = new int[this.field5638];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field5638; var8++) {
            this.field5644[var8] = var6 += var3.method1841((byte) 54);
            if (this.field5644[var8] > var7) {
                var7 = this.field5644[var8];
            }
        }
        this.field5639 = var7 + 1;
        this.field5629 = new int[this.field5639];
        this.field5642 = new int[this.field5639];
        int var9 = -86 % ((arg0 + 77) / 47);
        this.field5635 = new int[this.field5639][];
        this.field5636 = new int[this.field5639];
        this.field5641 = new int[this.field5639];
        if (var5 != 0) {
            this.field5632 = new int[this.field5639];
            for (int var10 = 0; var10 < this.field5639; var10++) {
                this.field5632[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field5638; var11++) {
                this.field5632[this.field5644[var11]] = var3.method1815((byte) -59);
            }
            this.field5631 = new class219(this.field5632);
        }
        for (int var12 = 0; var12 < this.field5638; var12++) {
            this.field5642[this.field5644[var12]] = var3.method1815((byte) -88);
        }
        for (int var13 = 0; var13 < this.field5638; var13++) {
            this.field5636[this.field5644[var13]] = var3.method1815((byte) -81);
        }
        for (int var14 = 0; var14 < this.field5638; var14++) {
            this.field5629[this.field5644[var14]] = var3.method1841((byte) 104);
        }
        for (int var15 = 0; var15 < this.field5638; var15++) {
            int var22 = this.field5644[var15];
            int var23 = 0;
            int var24 = this.field5629[var22];
            this.field5635[var22] = new int[var24];
            int var25 = -1;
            for (int var26 = 0; var26 < var24; var26++) {
                int var27 = this.field5635[var22][var26] = var23 += var3.method1841((byte) -125);
                if (var27 > var25) {
                    var25 = var27;
                }
            }
            this.field5641[var22] = var25 + 1;
            if ((var25 + 1) == var24) {
                this.field5635[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field5633 = new int[var7 + 1][];
        this.field5637 = new class219[var7 + 1];
        for (int var16 = 0; var16 < this.field5638; var16++) {
            int var17 = this.field5644[var16];
            int var18 = this.field5629[var17];
            this.field5633[var17] = new int[this.field5641[var17]];
            for (int var19 = 0; var19 < this.field5641[var17]; var19++) {
                this.field5633[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field5635[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field5635[var17][var20];
                }
                this.field5633[var17][var21] = var3.method1815((byte) -128);
            }
            this.field5637[var17] = new class219(this.field5633[var17]);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([BI)V")
    public class386(byte[] arg0, int arg1) {
        this.field5630 = class331.method2089(arg0.length, (byte) 52, arg0);
        if (this.field5630 != arg1) {
            throw new RuntimeException();
        }
        this.method2367((byte) 42, arg0);
    }
}
