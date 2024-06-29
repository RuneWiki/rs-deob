import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class634 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public int field8964;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "[B")
    private byte[] field8966;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8975 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public int field8962;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public int field8970;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public int field8973;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "Ljk;")
    public class586 field8969;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "[I")
    public int[] field8961;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "[I")
    public int[] field8963;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "[I")
    public int[] field8967;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "[I")
    public int[] field8976;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "[I")
    public int[] field8977;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "[I")
    public int[] field8978;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "[Ljk;")
    public class586[] field8971;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "[[B")
    public byte[][] field8968;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "[[I")
    public int[][] field8965;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "[[I")
    public int[][] field8972;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "[[[Lbt;")
    public static class40[][][] field8979;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[B)V")
    private final void method3538(int arg0, byte[] arg1) {
        field8974++;
        class695 var3 = new class695(class372.method2248(1, arg1));
        int var4 = var3.method3826(false);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field8962 = var3.method3880(8);
        } else {
            this.field8962 = 0;
        }
        int var5 = var3.method3826(false);
        boolean var6 = (var5 & 0x1) != 0;
        this.field8970 = var3.method3847((byte) 118);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field8977 = new int[this.field8970];
        for (int var10 = 0; var10 < this.field8970; var10++) {
            this.field8977[var10] = var8 += var3.method3847((byte) 118);
            if (this.field8977[var10] > var9) {
                var9 = this.field8977[var10];
            }
        }
        this.field8973 = var9 + 1;
        if (var7) {
            this.field8968 = new byte[this.field8973][];
        }
        this.field8967 = new int[this.field8973];
        if (arg0 != -31327) {
            return;
        }
        this.field8961 = new int[this.field8973];
        this.field8963 = new int[this.field8973];
        this.field8978 = new int[this.field8973];
        this.field8965 = new int[this.field8973][];
        if (var6) {
            this.field8976 = new int[this.field8973];
            for (int var11 = 0; var11 < this.field8973; var11++) {
                this.field8976[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field8970; var12++) {
                this.field8976[this.field8977[var12]] = var3.method3880(8);
            }
            this.field8969 = new class586(this.field8976);
        }
        for (int var13 = 0; var13 < this.field8970; var13++) {
            this.field8961[this.field8977[var13]] = var3.method3880(8);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field8970; var14++) {
                byte[] var15 = new byte[64];
                var3.method3876((byte) 127, var15, 0, 64);
                this.field8968[this.field8977[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field8970; var16++) {
            this.field8978[this.field8977[var16]] = var3.method3880(8);
        }
        for (int var17 = 0; var17 < this.field8970; var17++) {
            this.field8963[this.field8977[var17]] = var3.method3847((byte) 118);
        }
        for (int var18 = 0; var18 < this.field8970; var18++) {
            int var25 = this.field8977[var18];
            int var26 = 0;
            int var27 = this.field8963[var25];
            int var28 = -1;
            this.field8965[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field8965[var25][var29] = var26 += var3.method3847((byte) 118);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field8967[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field8965[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field8971 = new class586[var9 + 1];
        this.field8972 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field8970; var19++) {
            int var20 = this.field8977[var19];
            int var21 = this.field8963[var20];
            this.field8972[var20] = new int[this.field8967[var20]];
            for (int var22 = 0; var22 < this.field8967[var20]; var22++) {
                this.field8972[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field8965[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field8965[var20][var23];
                }
                this.field8972[var20][var24] = var3.method3880(class189.method1273(arg0, -31319));
            }
            this.field8971[var20] = new class586(this.field8972[var20]);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static void method3539(byte arg0) {
        field8979 = null;
        field8975 = null;
        if (arg0 <= 84) {
            field8975 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "([BI[B)V")
    public class634(byte[] arg0, int arg1, byte[] arg2) {
        this.field8964 = class686.method3784(-8, arg0.length, arg0);
        if (this.field8964 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field8966 = class234.method1604(arg0.length, arg0, 0, 128);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field8966[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3538(-31327, arg0);
    }
}
