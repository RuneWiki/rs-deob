import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class231 {

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "[B")
    private byte[] field3193;

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "Lem;")
    public static class206 field3198 = new class206(92, 8);

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "Lpg;")
    public class683 field3208;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "[I")
    public int[] field3192;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "[I")
    public int[] field3196;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "[I")
    public int[] field3199;

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "[I")
    public int[] field3201;

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "[I")
    public int[] field3206;

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "[I")
    public int[] field3209;

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "[Lpg;")
    public class683[] field3205;

    @OriginalMember(owner = "client!fga", name = "k", descriptor = "[[B")
    public byte[][] field3202;

    @OriginalMember(owner = "client!fga", name = "l", descriptor = "[[I")
    public int[][] field3203;

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "[[I")
    public int[][] field3207;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1454(boolean arg0) {
        if (arg0) {
            field3198 = null;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B[B)V", line = 32)
    private final void method1455(byte arg0, byte[] arg1) {
        field3197++;
        class501 var3 = new class501(class525.method2993(true, arg1));
        int var4 = var3.method2874((byte) -75);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3200 = 0;
        } else {
            this.field3200 = var3.method2840(false);
        }
        int var5 = var3.method2874((byte) -75);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field3195 = var3.method2845(-1);
        int var8 = 0;
        int var9 = -1;
        this.field3209 = new int[this.field3195];
        for (int var10 = 0; var10 < this.field3195; var10++) {
            this.field3209[var10] = var8 += var3.method2845(-1);
            if (this.field3209[var10] > var9) {
                var9 = this.field3209[var10];
            }
        }
        this.field3194 = var9 + 1;
        this.field3207 = new int[this.field3194][];
        if (arg0 >= -110) {
            this.field3204 = 86;
        }
        this.field3201 = new int[this.field3194];
        this.field3206 = new int[this.field3194];
        this.field3196 = new int[this.field3194];
        if (var7) {
            this.field3202 = new byte[this.field3194][];
        }
        this.field3199 = new int[this.field3194];
        if (var6) {
            this.field3192 = new int[this.field3194];
            for (int var11 = 0; var11 < this.field3194; var11++) {
                this.field3192[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field3195; var12++) {
                this.field3192[this.field3209[var12]] = var3.method2840(false);
            }
            this.field3208 = new class683(this.field3192);
        }
        for (int var13 = 0; var13 < this.field3195; var13++) {
            this.field3199[this.field3209[var13]] = var3.method2840(false);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field3195; var14++) {
                byte[] var15 = new byte[64];
                var3.method2857(var15, 64, (byte) 125, 0);
                this.field3202[this.field3209[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field3195; var16++) {
            this.field3201[this.field3209[var16]] = var3.method2840(false);
        }
        for (int var17 = 0; var17 < this.field3195; var17++) {
            this.field3196[this.field3209[var17]] = var3.method2845(-1);
        }
        for (int var18 = 0; var18 < this.field3195; var18++) {
            int var25 = this.field3209[var18];
            int var26 = 0;
            int var27 = this.field3196[var25];
            int var28 = -1;
            this.field3207[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field3207[var25][var29] = var26 += var3.method2845(-1);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field3206[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field3207[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field3205 = new class683[var9 + 1];
        this.field3203 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field3195; var19++) {
            int var20 = this.field3209[var19];
            int var21 = this.field3196[var20];
            this.field3203[var20] = new int[this.field3206[var20]];
            for (int var22 = 0; var22 < this.field3206[var20]; var22++) {
                this.field3203[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field3207[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field3207[var20][var23];
                }
                this.field3203[var20][var24] = var3.method2840(false);
            }
            this.field3205[var20] = new class683(this.field3203[var20]);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(JJ)J", line = 230)
    public static long method1456(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "([BI[B)V", line = 243)
    public class231(byte[] arg0, int arg1, byte[] arg2) {
        this.field3204 = class128.method911(-73, arg0.length, arg0);
        if (this.field3204 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field3193 = class171.method1205(arg0, 0, -121, arg0.length);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field3193[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method1455((byte) -115, arg0);
    }
}
