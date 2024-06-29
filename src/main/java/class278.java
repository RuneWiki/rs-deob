import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class278 {

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "Ljo;")
    public static class351 field3870 = new class351(81, 8);

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "[[[B")
    public static byte[][][] field3871;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(III)Lbq;", line = 8)
    public static final class303 method1804(int arg0, int arg1, int arg2) {
        class379 var3 = class378.field5427[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class303 var4 = var3.field5441;
            var3.field5441 = null;
            class257.method1692(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V", line = 28)
    public static void method1805(int arg0) {
        field3871 = null;
        field3870 = null;
        if (arg0 != -2930) {
            field3870 = null;
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lbg;I[[B)V", line = 41)
    public static final void method1806(class487 arg0, int arg1, byte[][] arg2) {
        field3869++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field5736; var4++) {
            class84.method611(-11);
            for (int var9 = 0; var9 < class109.field1314 >> 3; var9++) {
                for (int var10 = 0; var10 < class760.field10479 >> 3; var10++) {
                    int var11 = class626.field8833[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 0x3F77A59) >> 24;
                        if (!arg0.field5741 || var12 == 0) {
                            int var13 = var11 >> 1 & 0x3;
                            int var14 = (var11 & 0xFFE2DF) >> 14;
                            int var15 = (var11 & 0x3FFB) >> 3;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class96.field1236.length; var17++) {
                                if (class96.field1236[var17] == var16 && arg2[var17] != null) {
                                    class120 var18 = new class120(arg2[var17]);
                                    arg0.method2445(var13, -35, var9 * 8, var18, var4, class234.field3394, var12, var10 * 8, var15, var14);
                                    arg0.method2844(var9 * 8, var15, var13, var14, var3[0] == -1 ? var3 : null, var18, var4, class638.field8979, var10 * 8, -11519, var12);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg0.field5736; var5++) {
            class84.method611(1);
            for (int var6 = 0; var6 < (class109.field1314 >> 3); var6++) {
                for (int var7 = 0; var7 < (class760.field10479 >> 3); var7++) {
                    int var8 = class626.field8833[var5][var6][var7];
                    if (var8 == -1) {
                        arg0.method2451(true, var5, var7 * 8, 8, var6 * 8, 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class656.field9247 = class684.field9714.method3113(var3[0], var3[3], var3[2], class510.field7302, 29, var3[1]);
            class385.field5493 = var3[4];
        }
        if (arg1 <= 104) {
            field3871 = null;
        }
    }
}
