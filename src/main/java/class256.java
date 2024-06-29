import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class256 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[B")
    private byte[] field3819;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Z")
    public static boolean field3816 = false;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[B")
    public static byte[] field3832 = new byte[2048];

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3820 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public static int field3835 = 0;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public int field3836;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lica;")
    public class693 field3817;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
    public int[] field3815;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
    public int[] field3821;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "[I")
    public int[] field3822;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "[I")
    public int[] field3825;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "[I")
    public int[] field3826;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "[I")
    public int[] field3830;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "[Lica;")
    public class693[] field3831;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "[[B")
    public byte[][] field3823;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[[I")
    public int[][] field3824;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "[[I")
    public int[][] field3834;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 6)
    public static void method1707(byte arg0) {
        int var1 = -123 / ((arg0 - 53) / 61);
        field3832 = null;
        field3820 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BI)V", line = 31)
    private final void method1708(byte[] arg0, int arg1) {
        field3833++;
        class376 var3 = new class376(class496.method2870(98, arg0));
        int var4 = var3.method2398(-1372747256);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3828 = var3.method2384(27);
        } else {
            this.field3828 = 0;
        }
        int var5 = var3.method2398(-1372747256);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field3836 = var3.method2359(-1);
        int var8 = 0;
        int var9 = -1;
        this.field3825 = new int[this.field3836];
        for (int var10 = 0; var10 < this.field3836; var10++) {
            this.field3825[var10] = var8 += var3.method2359(-1);
            if (var9 < this.field3825[var10]) {
                var9 = this.field3825[var10];
            }
        }
        int var11 = -82 % ((arg1 - 14) / 33);
        this.field3827 = var9 + 1;
        if (var7) {
            this.field3823 = new byte[this.field3827][];
        }
        this.field3821 = new int[this.field3827];
        this.field3822 = new int[this.field3827];
        this.field3830 = new int[this.field3827];
        this.field3834 = new int[this.field3827][];
        this.field3815 = new int[this.field3827];
        if (var6) {
            this.field3826 = new int[this.field3827];
            for (int var12 = 0; var12 < this.field3827; var12++) {
                this.field3826[var12] = -1;
            }
            for (int var13 = 0; var13 < this.field3836; var13++) {
                this.field3826[this.field3825[var13]] = var3.method2384(108);
            }
            this.field3817 = new class693(this.field3826);
        }
        for (int var14 = 0; var14 < this.field3836; var14++) {
            this.field3822[this.field3825[var14]] = var3.method2384(99);
        }
        if (var7) {
            for (int var15 = 0; var15 < this.field3836; var15++) {
                byte[] var16 = new byte[64];
                var3.method2389(0, 689125352, 64, var16);
                this.field3823[this.field3825[var15]] = var16;
            }
        }
        for (int var17 = 0; var17 < this.field3836; var17++) {
            this.field3830[this.field3825[var17]] = var3.method2384(121);
        }
        for (int var18 = 0; var18 < this.field3836; var18++) {
            this.field3815[this.field3825[var18]] = var3.method2359(-1);
        }
        for (int var19 = 0; var19 < this.field3836; var19++) {
            int var26 = this.field3825[var19];
            int var27 = this.field3815[var26];
            int var28 = 0;
            this.field3834[var26] = new int[var27];
            int var29 = -1;
            for (int var30 = 0; var30 < var27; var30++) {
                int var31 = this.field3834[var26][var30] = var28 += var3.method2359(-1);
                if (var29 < var31) {
                    var29 = var31;
                }
            }
            this.field3821[var26] = var29 + 1;
            if ((var29 + 1) == var27) {
                this.field3834[var26] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field3831 = new class693[var9 + 1];
        this.field3824 = new int[var9 + 1][];
        for (int var20 = 0; var20 < this.field3836; var20++) {
            int var21 = this.field3825[var20];
            int var22 = this.field3815[var21];
            this.field3824[var21] = new int[this.field3821[var21]];
            for (int var23 = 0; var23 < this.field3821[var21]; var23++) {
                this.field3824[var21][var23] = -1;
            }
            for (int var24 = 0; var24 < var22; var24++) {
                int var25;
                if (this.field3834[var21] == null) {
                    var25 = var24;
                } else {
                    var25 = this.field3834[var21][var24];
                }
                this.field3824[var21][var25] = var3.method2384(115);
            }
            this.field3831[var21] = new class693(this.field3824[var21]);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 248)
    public static final boolean method1709(String arg0, byte arg1) {
        if (arg1 != -96) {
            method1709(null, (byte) -45);
        }
        field3829++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class671.field9452; var2++) {
            if (arg0.equalsIgnoreCase(class42.field653[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class551.field7456.field1020);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([BI[B)V", line = 279)
    public class256(byte[] arg0, int arg1, byte[] arg2) {
        this.field3818 = class744.method4120((byte) -99, arg0.length, arg0);
        if (this.field3818 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field3819 = class537.method3069(-83, 0, arg0, arg0.length);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field3819[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method1708(arg0, 94);
    }
}
