import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class303 extends class224 {

    @OriginalMember(owner = "client!am", name = "R", descriptor = "I")
    private int field5101 = 1;

    @OriginalMember(owner = "client!am", name = "eb", descriptor = "I")
    private int field5114 = 1;

    @OriginalMember(owner = "client!am", name = "gb", descriptor = "I")
    private int field5116 = 204;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "B")
    public static byte field5102 = 0;

    @OriginalMember(owner = "client!am", name = "X", descriptor = "I")
    public static int field5107 = 0;

    @OriginalMember(owner = "client!am", name = "W", descriptor = "Z")
    public static boolean field5106 = false;

    @OriginalMember(owner = "client!am", name = "V", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!am", name = "Y", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!am", name = "ab", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!am", name = "cb", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!am", name = "bb", descriptor = "Ldk;")
    public static class241 field5111;

    @OriginalMember(owner = "client!am", name = "Z", descriptor = "Lfj;")
    public static class283 field5109;

    @OriginalMember(owner = "client!am", name = "T", descriptor = "[I")
    public static int[] field5103;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "[I")
    public static int[] field5104;

    @OriginalMember(owner = "client!am", name = "db", descriptor = "[I")
    public static int[] field5113;

    @OriginalMember(owner = "client!am", name = "fb", descriptor = "[[B")
    public static byte[][] field5115;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(IB)I", line = 4)
    public static final int method2059(int arg0, byte arg1) {
        if (arg1 != 110) {
            field5109 = (class283) null;
        }
        field5108++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V", line = 35)
    public static void method2060(int arg0) {
        field5115 = (byte[][]) null;
        field5103 = null;
        if (arg0 != 17278) {
            field5104 = (int[]) null;
        }
        field5104 = null;
        field5111 = null;
        field5109 = null;
        field5113 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZLj;)V", line = 53)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field5110++;
        if (arg0 == 0) {
            this.field5114 = arg2.method1042((byte) -81);
        } else if (arg0 == 1) {
            this.field5101 = arg2.method1042((byte) -15);
        } else if (arg0 == 2) {
            this.field5116 = arg2.method1069(113);
        }
        if (arg1) {
            field5102 = 60;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 105)
    public class303() {
        super(0, true);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIII)V", line = 116)
    public static final void method2061(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5112++;
        if (class18.method83((byte) -110, arg2) && arg5 == 16572) {
            client.method2014(class272.field4582[arg2], -1, arg0, arg7, arg6, arg1, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)[I", line = 145)
    public final int[] method18(byte arg0, int arg1) {
        field5105++;
        int[] var3 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            for (int var4 = 0; var4 < class187.field2961; var4++) {
                int var5 = class73.field979[var4];
                int var6 = this.field5114 * var5 >> 12;
                int var7 = field5103[arg1];
                int var8 = this.field5101 * var7 >> 12;
                int var9 = var5 % (4096 / this.field5114) * this.field5114;
                int var10 = var7 % (4096 / this.field5101) * this.field5101;
                if (this.field5116 > var10) {
                    for (var6 -= var8; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field5116) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field5116 > var9) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        int var12 = 88 / ((arg0 - 20) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lf;IIIII)V", line = 237)
    public static final void method2062(class231 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class300.field5087 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class117.field1821) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class244.field4160 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class127 var14 = class92.field1424[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class227.field3686[var11][var12 + 1][var13] + class227.field3686[var11][var12][var13] + class227.field3686[var11][var12][var13 + 1] + class227.field3686[var11][var12 + 1][var13 + 1]) / 4 - (class227.field3686[arg1][arg2 + 1][arg3] + class227.field3686[arg1][arg2][arg3] + class227.field3686[arg1][arg2][arg3 + 1] + class227.field3686[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class28 var16 = var14.field1981;
                                    if (var16 != null) {
                                        if (var16.field358.method670()) {
                                            arg0.method702(var16.field358, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field361 != null && var16.field361.method670()) {
                                            arg0.method702(var16.field361, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1970; var17++) {
                                        class91 var18 = var14.field1971[var17];
                                        if (var18 != null && var18.field1408.method670() && (var18.field1410 == var12 || var7 == var12) && (var18.field1412 == var13 || var9 == var13)) {
                                            int var19 = var18.field1406 + 1 - var18.field1410;
                                            int var20 = var18.field1400 + 1 - var18.field1412;
                                            arg0.method702(var18.field1408, (var18.field1410 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1412 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
