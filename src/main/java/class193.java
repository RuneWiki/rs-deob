import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class193 {

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[[I")
    public static int[][] field3807 = new int[104][104];

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static volatile int field3810 = -1;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Lsg;")
    public static class169 field3812 = class165.method1060("mapscene", 1536);

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field3813 = 0;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    public static int[] field3811 = new int[256];

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lsg;")
    public static class169 field3816 = class165.method1060("Einloggen", 1536);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lqb;")
    public static class146 field3804;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3808;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "[[B")
    public static byte[][] field3814;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZLke;Lke;I)Lkf;")
    public static final class96 method1274(boolean arg0, boolean arg1, class95 arg2, class95 arg3, int arg4) {
        field3809++;
        boolean var5 = true;
        if (arg1) {
            method1278(-11);
        }
        int[] var6 = arg3.method564(arg4, -2);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method569(-1, var6[var7], arg4);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg2.method569(-1, var9, 0);
                } else {
                    var10 = arg2.method569(-1, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class96(arg3, arg2, arg4, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V")
    public static final void method1275(int arg0, byte arg1) {
        field3806++;
        if (!class44.method280(arg0, true)) {
            return;
        }
        class150[] var2 = class142.field2647[arg0];
        int var3 = 28 % ((77 - arg1) / 32);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class150 var5 = var2[var4];
            if (var5 != null) {
                var5.field2846 = 0;
                var5.field2874 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static final void method1276(boolean arg0) {
        class60 var1 = class95.field1781;
        synchronized (class95.field1781) {
            class32.field684 = class25.field521;
            if (!arg0) {
                method1274(false, true, null, null, 70);
            }
            class22.field459 = class87.field1593;
            class150.field2806 = field3810;
            class56.field1040 = class90.field1651;
            class178.field3480 = class162.field3112;
            class42.field796 = class16.field342;
            class131.field2433 = class202.field3963;
            class90.field1651 = 0;
        }
        field3805++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lqf;II)I")
    public static final int method1277(class150 arg0, int arg1, int arg2) {
        field3803++;
        if (arg0.field2890 == null || arg1 >= arg0.field2890.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field2890[arg1];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 1) {
                    var9 = class167.field3195[var3[var4++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 2) {
                    var9 = class89.field1618[var3[var4++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 3) {
                    var9 = class128.field2397[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class150 var12 = class62.method385((byte) 41, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class180.method1196(var13, 0).field1347 || class175.field3398)) {
                        for (int var14 = 0; var14 < var12.field2782.length; var14++) {
                            if (var13 + 1 == var12.field2782[var14]) {
                                var9 += var12.field2870[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class6.field119[var3[var4++]];
                }
                if (var7 == 6) {
                    var9 = class112.field2037[class89.field1618[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class6.field119[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class4.field79.field3866;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class66.field1236[var15]) {
                            var9 += class89.field1618[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class150 var18 = class62.method385((byte) 41, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class180.method1196(var19, 0).field1347 || class175.field3398)) {
                        for (int var20 = 0; var20 < var18.field2782.length; var20++) {
                            if (var19 + 1 == var18.field2782[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class184.field3574;
                }
                if (var7 == 12) {
                    var9 = class93.field1746;
                }
                if (var7 == 13) {
                    int var21 = class6.field119[var3[var4++]];
                    int var22 = var3[var4++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var9 = class60.method374((byte) 10, var23);
                }
                if (var7 == 18) {
                    var9 = (class4.field79.field3698 >> 7) + class179.field3489;
                }
                if (var7 == 19) {
                    var9 = (class4.field79.field3679 >> 7) + class191.field3761;
                }
                if (var7 == 20) {
                    var9 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var6 += var9;
                    }
                    if (var5 == 1) {
                        var6 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var6 /= var9;
                    }
                    if (var5 == 3) {
                        var6 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return arg2 == -2701 ? -1 : 113;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field3812 = null;
        field3808 = null;
        field3807 = null;
        field3804 = null;
        if (arg0 == 17) {
            field3814 = null;
            field3816 = null;
            field3811 = null;
        }
    }
}
