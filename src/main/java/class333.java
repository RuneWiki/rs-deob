import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class333 extends class183 {

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "[I")
    public static int[] field5009 = new int[100];

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
    public static int[] field5008 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field5021 = 0;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Z")
    public static boolean field5034 = false;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lqc;")
    public static class99 field5014 = new class99(100);

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public int field5006;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public int field5007;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public int field5011;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public int field5012;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public int field5013;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public int field5015;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public int field5022;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public int field5023;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public int field5024;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public int field5025;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public int field5028;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public int field5031;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public int field5032;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public int field5035;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lb;")
    public class100 field5004;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lek;")
    public class220 field5003;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "Ljf;")
    public class47 field5018;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Lcc;")
    public class87 field5019;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "[[[I")
    public static int[][][] field5020;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V", line = 11)
    public static void method2314(byte arg0) {
        if (arg0 > 98) {
            field5009 = null;
            field5008 = null;
            field5020 = (int[][][]) null;
            field5014 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z", line = 23)
    public static final boolean method2315(int arg0, int arg1, int arg2, int arg3) {
        if (class343.method2363(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class143.method1030(var4 + 1, field5020[arg0][arg1][arg2] + arg3, var5 + 1) && class143.method1030(var4 + 128 - 1, field5020[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class143.method1030(var4 + 128 - 1, field5020[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class143.method1030(var4 + 1, field5020[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)V", line = 41)
    public final void method2316(byte arg0) {
        int var2 = 56 / ((arg0 + 64) / 60);
        field5016++;
        this.field5003 = null;
        this.field5004 = null;
        this.field5018 = null;
        this.field5019 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lcg;II)Ljava/lang/String;", line = 65)
    public static final String method2317(class316 arg0, int arg1, int arg2) {
        field5029++;
        try {
            int var3 = arg0.method2193(49152);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field4777 += class128.field1760.method1477(arg0.field4798, 0, arg0.field4777, var4, var3, -100);
            String var5 = class21.method132(var3, var4, -1, 0);
            return arg2 > -68 ? (String) null : var5;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V", line = 101)
    public static final void method2318(boolean arg0, int arg1) {
        field5033++;
        byte var2;
        byte[][] var3;
        if (class67.field908 && arg0) {
            var2 = 1;
            var3 = class71.field964;
        } else {
            var3 = class37.field425;
            var2 = 4;
        }
        if (arg1 != 4495) {
            return;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var2; var5++) {
            class15.method98(-102);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class199.field2840[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x368A642) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 14 & 0x3FF;
                            int var12 = var9 >> 3 & 0x7FF;
                            int var13 = var9 >> 1 & 0x3;
                            int var14 = (var11 / 8 << 8) + var12 / 8;
                            for (int var15 = 0; var15 < class256.field3702.length; var15++) {
                                if (class256.field3702[var15] == var14 && var3[var15] != null) {
                                    int[] var16 = class163.method1171(arg1 ^ 0x118F, var5, class312.field4714, var13, var7 * 8, var3[var15], arg0, var10, var6 * 8, var12, var11);
                                    var8 = true;
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class145.method1045(var5, 8, 8, var6 * 8, arg1 ^ 0xFFFFEE1E, var7 * 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class266.field3879 = -1;
            return;
        }
        class71.field965 = var4[2];
        class266.field3879 = var4[0];
        class92.field1270 = var4[3];
        class324.field4911 = var4[1];
        class48.field592 = var4[4];
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILkm;I)[Lpn;", line = 216)
    public static final class170[] method2319(int arg0, int arg1, class133 arg2, int arg3) {
        if (arg3 == 0) {
            field5026++;
            return class129.method931(arg0, arg1, arg2, (byte) 90) ? class276.method1897(false) : null;
        } else {
            return (class170[]) null;
        }
    }
}
