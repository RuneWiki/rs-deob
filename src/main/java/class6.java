import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class6 extends class195 {

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "I")
    private int field138 = 4;

    @OriginalMember(owner = "client!qi", name = "eb", descriptor = "I")
    private int field147 = 4;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "Lck;")
    public static class119 field137 = class298.method1987((byte) 39, ")1 ");

    @OriginalMember(owner = "client!qi", name = "db", descriptor = "Z")
    public static boolean field146 = true;

    @OriginalMember(owner = "client!qi", name = "fb", descriptor = "I")
    public static int field148 = -1;

    @OriginalMember(owner = "client!qi", name = "Z", descriptor = "[I")
    public static int[] field142 = new int[4096];

    @OriginalMember(owner = "client!qi", name = "gb", descriptor = "Ljc;")
    public static class147 field149;

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!qi", name = "ab", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!qi", name = "bb", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!qi", name = "cb", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)V", line = 5)
    public static final void method84(byte arg0, int arg1, int arg2) {
        if (arg0 >= -54) {
            return;
        }
        field140++;
        int var3 = arg1--;
        int var4 = class59.field965[arg1];
        int var5 = class296.field4931[arg1];
        if (var3 > 25) {
            var3 = 25;
        }
        if (arg2 == 0) {
            class36.field551++;
            field149.method966(0, 19);
            field149.method32(var3 + var3 + 3, (byte) -99);
        }
        if (arg2 == 1) {
            class162.field2562++;
            field149.method966(0, 98);
            field149.method32(var3 + var3 + 3 + 14, (byte) -99);
        }
        if (arg2 == 2) {
            field149.method966(0, 75);
            field149.method32(var3 + var3 + 3, (byte) -99);
            class187.field2941++;
        }
        field149.method51(-14912, class30.field421 + var4);
        field149.method32(class289.field4760[82] ? 1 : 0, (byte) -99);
        class244.field3952 = class59.field965[0];
        class68.field1059 = class296.field4931[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            field149.method16(class59.field965[arg1] - var4, (byte) 99);
            field149.method25(0, class296.field4931[arg1] - var5);
        }
        field149.method40(class189.field2995 + var5, 109);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lfj;II)V", line = 70)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field147 = arg0.method64((byte) 18);
        } else if (arg2 == 1) {
            this.field138 = arg0.method64((byte) -124);
        }
        if (arg1 > -117) {
            this.field147 = -34;
        }
        field144++;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field142[var0] = class256.method1643(6, var0);
        }
        field149 = new class147(5000);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)[I", line = 111)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            this.method11(92, true);
        }
        field139++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int var4 = class157.field2504 / this.field147;
            int var5 = class227.field3621 / this.field138;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1253(0, 86, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1253(0, 82, class227.field3621 * var7 / var5);
            }
            for (int var8 = 0; var8 < class157.field2504; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class157.field2504 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 170)
    public class6() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)[[I", line = 176)
    public final int[][] method9(byte arg0, int arg1) {
        int[][] var3 = this.field3126.method603(arg1, -128);
        field143++;
        if (arg0 != 3) {
            field137 = (class119) null;
        }
        if (this.field3126.field1372) {
            int var4 = class227.field3621 / this.field138;
            int var5 = class157.field2504 / this.field147;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg1 % var4;
                var7 = this.method1256(class227.field3621 * var6 / var4, 0, -10072);
            } else {
                var7 = this.method1256(0, 0, arg0 ^ 0xFFFFD8AB);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class157.field2504; var14++) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class157.field2504 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)V", line = 245)
    public static void method85(int arg0) {
        field142 = null;
        field137 = null;
        int var1 = -26 % ((46 - arg0) / 35);
        field149 = null;
    }
}
