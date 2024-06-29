import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class453 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public int field5895;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "[B")
    private byte[] field5908;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lra;")
    public static class361 field5912 = new class361(37, 8);

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lra;")
    public static class361 field5916 = new class361(59, 12);

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public int field5897;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field5899;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lki;")
    public static class364 field5907;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lkfa;")
    public class382 field5904;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
    public int[] field5900;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[I")
    public int[] field5903;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[I")
    public int[] field5906;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "[I")
    public int[] field5909;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "[I")
    public int[] field5911;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "[I")
    public int[] field5913;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[Lkfa;")
    public class382[] field5896;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "[[B")
    public byte[][] field5898;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "[[I")
    public int[][] field5901;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "[[I")
    public int[][] field5915;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2553(byte arg0, String arg1) {
        field5910++;
        for (int var2 = 0; var2 < class249.field3370.length; var2++) {
            if (class249.field3370[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        if (arg0 != -126) {
            method2553((byte) -4, null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method2554(int arg0) {
        int var1 = 60 % ((arg0 + 66) / 46);
        field5907 = null;
        field5912 = null;
        field5916 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BI)V")
    private final void method2555(byte[] arg0, int arg1) {
        field5902++;
        class418 var3 = new class418(class376.method2152((byte) 58, arg0));
        int var4 = var3.method2396(-107);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (arg1 <= 59) {
            this.field5915 = null;
        }
        if (var4 < 6) {
            this.field5914 = 0;
        } else {
            this.field5914 = var3.method2355(85);
        }
        int var5 = var3.method2396(14);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field5897 = var3.method2393(-30727);
        int var8 = 0;
        this.field5906 = new int[this.field5897];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field5897; var10++) {
            this.field5906[var10] = var8 += var3.method2393(-30727);
            if (this.field5906[var10] > var9) {
                var9 = this.field5906[var10];
            }
        }
        this.field5899 = var9 + 1;
        this.field5911 = new int[this.field5899];
        if (var7) {
            this.field5898 = new byte[this.field5899][];
        }
        this.field5900 = new int[this.field5899];
        this.field5909 = new int[this.field5899];
        this.field5901 = new int[this.field5899][];
        this.field5903 = new int[this.field5899];
        if (var6) {
            this.field5913 = new int[this.field5899];
            for (int var11 = 0; var11 < this.field5899; var11++) {
                this.field5913[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field5897; var12++) {
                this.field5913[this.field5906[var12]] = var3.method2355(39);
            }
            this.field5904 = new class382(this.field5913);
        }
        for (int var13 = 0; var13 < this.field5897; var13++) {
            this.field5903[this.field5906[var13]] = var3.method2355(71);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field5897; var14++) {
                byte[] var15 = new byte[64];
                var3.method2398(var15, 0, 118, 64);
                this.field5898[this.field5906[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field5897; var16++) {
            this.field5911[this.field5906[var16]] = var3.method2355(63);
        }
        for (int var17 = 0; var17 < this.field5897; var17++) {
            this.field5900[this.field5906[var17]] = var3.method2393(-30727);
        }
        for (int var18 = 0; var18 < this.field5897; var18++) {
            int var25 = this.field5906[var18];
            int var26 = 0;
            int var27 = this.field5900[var25];
            int var28 = -1;
            this.field5901[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field5901[var25][var29] = var26 += var3.method2393(-30727);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field5909[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field5901[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field5915 = new int[var9 + 1][];
        this.field5896 = new class382[var9 + 1];
        for (int var19 = 0; var19 < this.field5897; var19++) {
            int var20 = this.field5906[var19];
            int var21 = this.field5900[var20];
            this.field5915[var20] = new int[this.field5909[var20]];
            for (int var22 = 0; var22 < this.field5909[var20]; var22++) {
                this.field5915[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field5901[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field5901[var20][var23];
                }
                this.field5915[var20][var24] = var3.method2355(30);
            }
            this.field5896[var20] = new class382(this.field5915[var20]);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static final void method2556(byte arg0) {
        if (arg0 < 107) {
            method2553((byte) -27, null);
        }
        field5905++;
        if (class520.field6799.method344()) {
            class520.field6799.method407(class524.field6827);
            class368.method2118((byte) 20);
            class520.field6799.method336(class524.field6827);
            class520.field6799.method374(class524.field6827);
        } else {
            class11.method58(class364.field4697, -94);
        }
        class211.method1355(-21784);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([BI[B)V")
    public class453(byte[] arg0, int arg1, byte[] arg2) {
        this.field5895 = class365.method2099(arg0, 3228, arg0.length);
        if (this.field5895 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field5908 = class422.method2431(true, arg0.length, arg0, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field5908[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2555(arg0, 66);
    }
}
