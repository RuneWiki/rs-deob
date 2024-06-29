import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class225 {

    @OriginalMember(owner = "client!w", name = "q", descriptor = "J")
    public long field4039 = 0L;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lsg;")
    public static class30 field4026 = class167.method1221((byte) 33, "blinken2:");

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lsg;")
    public static class30 field4028 = class167.method1221((byte) 33, "(U2");

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lsg;")
    private static class30 field4035 = class167.method1221((byte) 33, "");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lsg;")
    public static class30 field4024 = field4035;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lsg;")
    public static class30 field4037 = class167.method1221((byte) 33, "floorshadows");

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field4038;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lni;")
    public class20 field4029;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lni;")
    public class20 field4031;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1610(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class209.field3759 * 128) {
            arg0 = class209.field3759 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class44.field1050 * 128) {
            arg2 = class44.field1050 * 128 - 1;
        }
        class149.field2837 = class213.field3849[arg3];
        class14.field273 = class213.field3846[arg3];
        class53.field1186 = class213.field3849[arg4];
        class273.field4795 = class213.field3846[arg4];
        class254.field4478 = arg0;
        class21.field382 = arg1;
        class108.field2177 = arg2;
        class57.field1258 = arg0 / 128;
        class15.field320 = arg2 / 128;
        class4.field58 = class57.field1258 - class76.field1674;
        if (class4.field58 < 0) {
            class4.field58 = 0;
        }
        class91.field1841 = class15.field320 - class76.field1674;
        if (class91.field1841 < 0) {
            class91.field1841 = 0;
        }
        class150.field2850 = class76.field1674 + class57.field1258;
        if (class150.field2850 > class209.field3759) {
            class150.field2850 = class209.field3759;
        }
        class88.field1804 = class76.field1674 + class15.field320;
        if (class88.field1804 > class44.field1050) {
            class88.field1804 = class44.field1050;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class76.field1674 + class76.field1674 + 2; var16++) {
            for (int var19 = 0; var19 < class76.field1674 + class76.field1674 + 2; var19++) {
                int var20 = (var16 - class76.field1674 << 7) - (class254.field4478 & 0x7F);
                int var21 = (var19 - class76.field1674 << 7) - (class108.field2177 & 0x7F);
                int var22 = class57.field1258 + var16 - class76.field1674;
                int var23 = class15.field320 + var19 - class76.field1674;
                if (var22 >= 0 && var23 >= 0 && var22 < class209.field3759 && var23 < class44.field1050) {
                    int var24;
                    if (class87.field1790 == null) {
                        var24 = class177.field3289[0][var22][var23] + 128 - class21.field382;
                    } else {
                        var24 = class87.field1790[0][var22][var23] + 128 - class21.field382;
                    }
                    int var25 = class177.field3289[3][var22][var23] - class21.field382 - 1000;
                    class168.field3094[var16][var19] = class159.method1185(var20, var25, var24, var21, var15);
                } else {
                    class168.field3094[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class76.field1674 + class76.field1674 + 1; var17++) {
            for (int var18 = 0; var18 < class76.field1674 + class76.field1674 + 1; var18++) {
                class155.field2948[var17][var18] = class168.field3094[var17][var18] || class168.field3094[var17 + 1][var18] || class168.field3094[var17][var18 + 1] || class168.field3094[var17 + 1][var18 + 1];
            }
        }
        class269.field4735 = arg6;
        class182.field3352 = arg7;
        class254.field4476 = arg8;
        class117.field2311 = arg9;
        class232.field4139 = arg10;
        class157.method1175();
        if (class147.field2809 != null) {
            class74.method677(true);
            class238.method1689(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class74.method677(false);
        }
        class238.method1689(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Lfg;")
    public static final class177 method1611(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class177 var4 = var3.field3520;
            var3.field3520 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILgj;)V")
    public static final void method1612(int arg0, class192 arg1) {
        if (arg0 != 1) {
            method1611(-115, 81, -53);
        }
        field4027++;
        short var2 = 256;
        for (int var3 = 0; var3 < class241.field4271.length; var3++) {
            class241.field4271[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class241.field4271[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class262.field4637[var15] = (class241.field4271[var15 + 128] + class241.field4271[var15 - 128] + class241.field4271[var15 - -1] + class241.field4271[var15 + -1]) / 4;
                }
            }
            int[] var13 = class241.field4271;
            class241.field4271 = class262.field4637;
            class262.field4637 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field4673; var7++) {
            for (int var8 = 0; var8 < arg1.field4679; var8++) {
                if (arg1.field3481[var6++] != 0) {
                    int var9 = arg1.field4676 + var8 + 16;
                    int var10 = var7 - (-arg1.field4680 - 16);
                    int var11 = var9 + (var10 << 7);
                    class241.field4271[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
    public static final int method1613(int arg0, int arg1) {
        field4033++;
        if (arg0 != -100596213) {
            field4037 = null;
        }
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)I")
    public static final int method1614(boolean arg0, int arg1) {
        field4034++;
        if (!(arg1 < 65 || arg1 > 90) || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        }
        if (!arg0) {
            method1613(30, 79);
        }
        if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1615(int arg0) {
        field4028 = null;
        field4035 = null;
        if (arg0 == 5000) {
            field4037 = null;
            field4024 = null;
            field4026 = null;
        }
    }
}
