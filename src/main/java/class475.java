import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class475 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public int field6747;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "[B")
    private byte[] field6760;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lqp;")
    public static class715 field6761 = new class715(32);

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field6766 = 1401;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field6768 = 1403;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Lgr;")
    public static class530 field6765 = new class530(21, 8);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public int field6750;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field6758;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field6759;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lkk;")
    public class41 field6755;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
    public int[] field6749;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
    public int[] field6751;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "[I")
    public int[] field6752;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "[I")
    public int[] field6756;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "[I")
    public int[] field6757;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "[I")
    public int[] field6767;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[Lkk;")
    public class41[] field6762;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "[[B")
    public byte[][] field6763;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[[I")
    public int[][] field6746;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "[[I")
    public int[][] field6753;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 13)
    public static void method2846(int arg0) {
        field6761 = null;
        if (arg0 < 120) {
            method2846(-101);
        }
        field6765 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B[B)V", line = 27)
    private final void method2847(byte arg0, byte[] arg1) {
        field6748++;
        class479 var3 = new class479(class677.method3853(-109, arg1));
        int var4 = var3.method2886(true);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field6750 = var3.method2868(-109);
        } else {
            this.field6750 = 0;
        }
        int var5 = var3.method2886(true);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field6759 = var3.method2882(arg0 - 103);
        int var8 = 0;
        this.field6767 = new int[this.field6759];
        int var9 = -1;
        if (arg0 != 102) {
            method2846(4);
        }
        for (int var10 = 0; var10 < this.field6759; var10++) {
            this.field6767[var10] = var8 += var3.method2882(arg0 - 103);
            if (var9 < this.field6767[var10]) {
                var9 = this.field6767[var10];
            }
        }
        this.field6758 = var9 + 1;
        if (var7) {
            this.field6763 = new byte[this.field6758][];
        }
        this.field6756 = new int[this.field6758];
        this.field6751 = new int[this.field6758];
        this.field6746 = new int[this.field6758][];
        this.field6752 = new int[this.field6758];
        this.field6757 = new int[this.field6758];
        if (var6) {
            this.field6749 = new int[this.field6758];
            for (int var11 = 0; var11 < this.field6758; var11++) {
                this.field6749[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field6759; var12++) {
                this.field6749[this.field6767[var12]] = var3.method2868(-59);
            }
            this.field6755 = new class41(this.field6749);
        }
        for (int var13 = 0; var13 < this.field6759; var13++) {
            this.field6752[this.field6767[var13]] = var3.method2868(-84);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field6759; var14++) {
                byte[] var15 = new byte[64];
                var3.method2867(-290150072, var15, 64, 0);
                this.field6763[this.field6767[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field6759; var16++) {
            this.field6756[this.field6767[var16]] = var3.method2868(class639.method3689(arg0, -59));
        }
        for (int var17 = 0; var17 < this.field6759; var17++) {
            this.field6751[this.field6767[var17]] = var3.method2882(arg0 - 103);
        }
        for (int var18 = 0; var18 < this.field6759; var18++) {
            int var25 = this.field6767[var18];
            int var26 = 0;
            int var27 = this.field6751[var25];
            this.field6746[var25] = new int[var27];
            int var28 = -1;
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field6746[var25][var29] = var26 += var3.method2882(-1);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field6757[var25] = var28 + 1;
            if ((var28 + 1) == var27) {
                this.field6746[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field6753 = new int[var9 + 1][];
        this.field6762 = new class41[var9 + 1];
        for (int var19 = 0; var19 < this.field6759; var19++) {
            int var20 = this.field6767[var19];
            int var21 = this.field6751[var20];
            this.field6753[var20] = new int[this.field6757[var20]];
            for (int var22 = 0; var22 < this.field6757[var20]; var22++) {
                this.field6753[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field6746[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field6746[var20][var23];
                }
                this.field6753[var20][var24] = var3.method2868(arg0 - 209);
            }
            this.field6762[var20] = new class41(this.field6753[var20]);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)V", line = 228)
    public static final void method2848(byte arg0, int arg1) {
        field6754++;
        class172.method1216(50560);
        int var2 = class600.field8526.method904(arg1, 16).field10254;
        if (var2 == 0) {
            return;
        }
        if (arg0 != -60) {
            method2848((byte) -113, 28);
        }
        int var3 = class226.field3372.field6[arg1];
        if (var2 == 5) {
            class316.field4268 = var3;
        }
        if (var2 == 6) {
            class132.field1837 = var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "([BI[B)V", line = 262)
    public class475(byte[] arg0, int arg1, byte[] arg2) {
        this.field6747 = class43.method440(arg0, arg0.length, -35);
        if (this.field6747 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field6760 = class616.method3578(arg0.length, arg0, 0, (byte) -117);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field6760[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2847((byte) 102, arg0);
    }
}
