import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class241 {

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3986 = -1;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Z")
    public static boolean field3998 = false;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
    public static boolean field3987 = true;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4000 = " has logged in.";

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4009 = "wave2:";

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lme;")
    public class105 field3995;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Lmo;")
    public static class447 field3994;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "[I")
    public int[] field3985;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "[I")
    public int[] field3997;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "[I")
    public int[] field4001;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "[I")
    public int[] field4003;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "[I")
    public int[] field4004;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "[I")
    public int[] field4007;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[Lme;")
    public class105[] field3992;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "[Lgl;")
    public static class356[] field4008;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[[I")
    public int[][] field3988;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[[I")
    public int[][] field3989;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "[[I")
    public static int[][] field3993;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[[Z")
    public static boolean[][] field3991;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 11)
    public static void method1697(int arg0) {
        field3993 = null;
        if (arg0 < 38) {
            field4000 = null;
        }
        field4008 = null;
        field4009 = null;
        field3991 = null;
        field4000 = null;
        field3994 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B[B)V", line = 58)
    private final void method1698(byte arg0, byte[] arg1) {
        field4005++;
        class186 var3 = new class186(class349.method2285((byte) -57, arg1));
        int var4 = var3.method1322(false);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4006 = var3.method1284(8388607);
        } else {
            this.field4006 = 0;
        }
        int var5 = var3.method1322(false);
        this.field3999 = var3.method1272((byte) -50);
        int var6 = 0;
        int var7 = -1;
        this.field3997 = new int[this.field3999];
        int var8 = 89 % ((arg0 - 7) / 56);
        for (int var9 = 0; var9 < this.field3999; var9++) {
            this.field3997[var9] = var6 += var3.method1272((byte) -60);
            if (var7 < this.field3997[var9]) {
                var7 = this.field3997[var9];
            }
        }
        this.field4002 = var7 + 1;
        this.field3985 = new int[this.field4002];
        this.field3989 = new int[this.field4002][];
        this.field4007 = new int[this.field4002];
        this.field4004 = new int[this.field4002];
        this.field4003 = new int[this.field4002];
        if (var5 != 0) {
            this.field4001 = new int[this.field4002];
            for (int var10 = 0; var10 < this.field4002; var10++) {
                this.field4001[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field3999; var11++) {
                this.field4001[this.field3997[var11]] = var3.method1284(8388607);
            }
            this.field3995 = new class105(this.field4001);
        }
        for (int var12 = 0; var12 < this.field3999; var12++) {
            this.field4007[this.field3997[var12]] = var3.method1284(8388607);
        }
        for (int var13 = 0; var13 < this.field3999; var13++) {
            this.field3985[this.field3997[var13]] = var3.method1284(8388607);
        }
        for (int var14 = 0; var14 < this.field3999; var14++) {
            this.field4003[this.field3997[var14]] = var3.method1272((byte) -64);
        }
        for (int var15 = 0; var15 < this.field3999; var15++) {
            int var22 = this.field3997[var15];
            int var23 = 0;
            int var24 = this.field4003[var22];
            this.field3989[var22] = new int[var24];
            int var25 = -1;
            for (int var26 = 0; var26 < var24; var26++) {
                int var27 = this.field3989[var22][var26] = var23 += var3.method1272((byte) -128);
                if (var25 < var27) {
                    var25 = var27;
                }
            }
            this.field4004[var22] = var25 + 1;
            if (var25 + 1 == var24) {
                this.field3989[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3988 = new int[var7 + 1][];
        this.field3992 = new class105[var7 + 1];
        for (int var16 = 0; var16 < this.field3999; var16++) {
            int var17 = this.field3997[var16];
            int var18 = this.field4003[var17];
            this.field3988[var17] = new int[this.field4004[var17]];
            for (int var19 = 0; var19 < this.field4004[var17]; var19++) {
                this.field3988[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field3989[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field3989[var17][var20];
                }
                this.field3988[var17][var21] = var3.method1284(8388607);
            }
            this.field3992[var17] = new class105(this.field3988[var17]);
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([BI)V", line = 229)
    public class241(byte[] arg0, int arg1) {
        this.field3996 = class323.method2141(arg0.length, (byte) 75, arg0);
        if (this.field3996 != arg1) {
            throw new RuntimeException();
        }
        this.method1698((byte) 71, arg0);
    }
}
