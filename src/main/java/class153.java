import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class153 {

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "[B")
    private byte[] field2070;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2062 = 0;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Luca;")
    public class538 field2076;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[I")
    public int[] field2061;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[I")
    public int[] field2064;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
    public int[] field2069;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "[I")
    public int[] field2074;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "[I")
    public int[] field2079;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "[I")
    public int[] field2080;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "[Luca;")
    public class538[] field2078;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "[[B")
    public byte[][] field2075;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "[[I")
    public int[][] field2072;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "[[I")
    public int[][] field2073;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ldt;Z)V", line = 15)
    public static final void method1067(class254 arg0, boolean arg1) {
        field2077++;
        if (arg0.field3789.length - arg0.field3725 < 1) {
            return;
        }
        int var2 = arg0.method1731((byte) 64);
        if (var2 < 0 || var2 > 1 || arg0.field3789.length - arg0.field3725 < 2) {
            return;
        }
        int var3 = arg0.method1728((byte) 9);
        if ((arg0.field3789.length - arg0.field3725) < (var3 * 6)) {
            return;
        }
        if (!arg1) {
            field2062 = -77;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method1728((byte) 54);
            int var6 = arg0.method1672(-16516);
            if (class138.field1865.length > var5 && class679.field9091[var5] && (class276.field3998.method2911(var5, false).field7266 != '1' || var6 >= -1 && var6 <= 1)) {
                class138.field1865[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILpja;II)V", line = 64)
    public static final void method1068(int arg0, int arg1, class43 arg2, int arg3, int arg4) {
        arg2.field457.method1686(arg0 ^ 0xFFFFFFC7, arg3);
        field2063++;
        if (arg0 == 0) {
            arg2.field457.method1697(arg4, true);
            arg2.field457.method1718((byte) -34, arg1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "([BI[B)V", line = 88)
    public class153(byte[] arg0, int arg1, byte[] arg2) {
        this.field2068 = class220.method1406(-119, arg0, arg0.length);
        if (this.field2068 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field2070 = class514.method3005(arg0, true, arg0.length, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field2070[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method1069(arg0, -119);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BI)V", line = 133)
    private final void method1069(byte[] arg0, int arg1) {
        field2065++;
        class254 var3 = new class254(class719.method3969((byte) 16, arg0));
        int var4 = var3.method1731((byte) 64);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2071 = 0;
        } else {
            this.field2071 = var3.method1672(-16516);
        }
        int var5 = var3.method1731((byte) 64);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field2066 = var3.method1728((byte) 84);
        int var8 = 0;
        int var9 = -1;
        this.field2079 = new int[this.field2066];
        for (int var10 = 0; var10 < this.field2066; var10++) {
            this.field2079[var10] = var8 += var3.method1728((byte) 28);
            if (var9 < this.field2079[var10]) {
                var9 = this.field2079[var10];
            }
        }
        this.field2067 = var9 + 1;
        if (var7) {
            this.field2075 = new byte[this.field2067][];
        }
        this.field2072 = new int[this.field2067][];
        this.field2064 = new int[this.field2067];
        this.field2080 = new int[this.field2067];
        this.field2074 = new int[this.field2067];
        this.field2069 = new int[this.field2067];
        if (var6) {
            this.field2061 = new int[this.field2067];
            for (int var11 = 0; var11 < this.field2067; var11++) {
                this.field2061[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field2066; var12++) {
                this.field2061[this.field2079[var12]] = var3.method1672(-16516);
            }
            this.field2076 = new class538(this.field2061);
        }
        for (int var13 = 0; var13 < this.field2066; var13++) {
            this.field2069[this.field2079[var13]] = var3.method1672(-16516);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field2066; var14++) {
                byte[] var15 = new byte[64];
                var3.method1735(0, 50, var15, 64);
                this.field2075[this.field2079[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field2066; var16++) {
            this.field2074[this.field2079[var16]] = var3.method1672(-16516);
        }
        for (int var17 = 0; var17 < this.field2066; var17++) {
            this.field2064[this.field2079[var17]] = var3.method1728((byte) 54);
        }
        if (arg1 >= -98) {
            this.method1069(null, 88);
        }
        for (int var18 = 0; var18 < this.field2066; var18++) {
            int var25 = this.field2079[var18];
            int var26 = this.field2064[var25];
            int var27 = 0;
            int var28 = -1;
            this.field2072[var25] = new int[var26];
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field2072[var25][var29] = var27 += var3.method1728((byte) 52);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field2080[var25] = var28 + 1;
            if (var28 + 1 == var26) {
                this.field2072[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field2078 = new class538[var9 + 1];
        this.field2073 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field2066; var19++) {
            int var20 = this.field2079[var19];
            int var21 = this.field2064[var20];
            this.field2073[var20] = new int[this.field2080[var20]];
            for (int var22 = 0; var22 < this.field2080[var20]; var22++) {
                this.field2073[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field2072[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field2072[var20][var23];
                }
                this.field2073[var20][var24] = var3.method1672(-16516);
            }
            this.field2078[var20] = new class538(this.field2073[var20]);
        }
    }
}
