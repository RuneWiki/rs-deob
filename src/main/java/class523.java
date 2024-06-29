import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class523 {

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public int field7258;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "[B")
    private byte[] field7272;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "F")
    public static float field7256 = 0.0F;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "[I")
    public static int[] field7266 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public int field7260;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public int field7263;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public int field7270;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "Lgp;")
    public static class561 field7265;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Llc;")
    public class629 field7269;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "[I")
    public int[] field7253;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[I")
    public int[] field7257;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "[I")
    public int[] field7259;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
    public int[] field7261;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "[I")
    public int[] field7262;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
    public int[] field7267;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "[Llc;")
    public class629[] field7254;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[[B")
    public byte[][] field7255;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "[[I")
    public int[][] field7252;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "[[I")
    public int[][] field7268;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static void method2947(int arg0) {
        field7266 = null;
        if (arg0 != 8041) {
            method2948(null, -76);
        }
        field7265 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lgp;I)V")
    public static final void method2948(class561 arg0, int arg1) {
        int var2 = 14 / ((arg1 - 15) / 52);
        class547.field7609 = arg0;
        field7264++;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[B)V")
    private final void method2949(int arg0, byte[] arg1) {
        field7271++;
        class268 var3 = new class268(class38.method326(0, arg1));
        int var4 = var3.method1738(255);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field7260 = var3.method1748(120);
        } else {
            this.field7260 = 0;
        }
        int var5 = var3.method1738(arg0 + 255);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field7270 = var3.method1745(arg0 + 32132);
        int var8 = 0;
        this.field7262 = new int[this.field7270];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field7270; var10++) {
            this.field7262[var10] = var8 += var3.method1745(32132);
            if (var9 < this.field7262[var10]) {
                var9 = this.field7262[var10];
            }
        }
        this.field7263 = var9 + 1;
        this.field7261 = new int[this.field7263];
        if (var7) {
            this.field7255 = new byte[this.field7263][];
        }
        this.field7268 = new int[this.field7263][];
        this.field7267 = new int[this.field7263];
        this.field7259 = new int[this.field7263];
        this.field7253 = new int[this.field7263];
        if (var6) {
            this.field7257 = new int[this.field7263];
            for (int var11 = 0; var11 < this.field7263; var11++) {
                this.field7257[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field7270; var12++) {
                this.field7257[this.field7262[var12]] = var3.method1748(class631.method3567(arg0, -74));
            }
            this.field7269 = new class629(this.field7257);
        }
        for (int var13 = 0; var13 < this.field7270; var13++) {
            this.field7267[this.field7262[var13]] = var3.method1748(-49);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field7270; var14++) {
                byte[] var15 = new byte[64];
                var3.method1695(var15, (byte) -52, 64, 0);
                this.field7255[this.field7262[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field7270; var16++) {
            this.field7253[this.field7262[var16]] = var3.method1748(-74);
        }
        for (int var17 = arg0; var17 < this.field7270; var17++) {
            this.field7261[this.field7262[var17]] = var3.method1745(32132);
        }
        for (int var18 = 0; var18 < this.field7270; var18++) {
            int var25 = this.field7262[var18];
            int var26 = 0;
            int var27 = this.field7261[var25];
            this.field7268[var25] = new int[var27];
            int var28 = -1;
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field7268[var25][var29] = var26 += var3.method1745(32132);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field7259[var25] = var28 + 1;
            if ((var28 + 1) == var27) {
                this.field7268[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field7252 = new int[var9 + 1][];
        this.field7254 = new class629[var9 + 1];
        for (int var19 = 0; var19 < this.field7270; var19++) {
            int var20 = this.field7262[var19];
            int var21 = this.field7261[var20];
            this.field7252[var20] = new int[this.field7259[var20]];
            for (int var22 = 0; var22 < this.field7259[var20]; var22++) {
                this.field7252[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field7268[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field7268[var20][var23];
                }
                this.field7252[var20][var24] = var3.method1748(110);
            }
            this.field7254[var20] = new class629(this.field7252[var20]);
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "([BI[B)V")
    public class523(byte[] arg0, int arg1, byte[] arg2) {
        this.field7258 = class51.method440(arg0.length, arg0, (byte) 81);
        if (this.field7258 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field7272 = class454.method2672(arg0.length, arg0, 0, 64);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field7272[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2949(0, arg0);
    }
}
