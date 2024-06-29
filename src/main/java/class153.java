import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class153 extends class117 {

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    private int field2861 = 4096;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "[I")
    public static int[] field2857 = new int[256];

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field2862 = 0;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "Lhh;")
    private static class163 field2871;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "Lhh;")
    private static class163 field2868;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "Lhh;")
    private static class163 field2869;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "Lhh;")
    public static class163 field2875;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "Lhh;")
    private static class163 field2866;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "Lhh;")
    private static class163 field2873;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "Lhh;")
    private static class163 field2874;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "Lhh;")
    private static class163 field2872;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "[Lhh;")
    private static class163[] field2870;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 == arg1) {
            this.field2861 = arg2.method658(-111);
        }
        ++field2858;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class153() {
        super(1, true);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IJ)Lhh;")
    public static final class163 method1131(int arg0, long arg1) {
        class178.field3246.setTime(new Date(arg1));
        ++field2864;
        int var3 = class178.field3246.get(7);
        int var4 = class178.field3246.get(5);
        int var5 = class178.field3246.get(2);
        int var6 = class178.field3246.get(1);
        int var7 = class178.field3246.get(11);
        int var8 = class178.field3246.get(12);
        int var9 = class178.field3246.get(arg0);
        return class145.method1101(arg0 + -13, new class163[] { field2870[var3 - 1], class23.field372, class136.method1061(var4 / 10, (byte) 101), class136.method1061(var4 % 10, (byte) 126), class196.field3544, class212.field3859[var5], class196.field3544, class136.method1061(var6, (byte) 106), class119.field2244, class136.method1061(var7 / 10, (byte) 126), class136.method1061(var7 % 10, (byte) 108), class20.field320, class136.method1061(var8 / 10, (byte) 114), class136.method1061(var8 % 10, (byte) 127), class20.field320, class136.method1061(var9 / 10, (byte) 109), class136.method1061(var9 % 10, (byte) 127), class9.field157 });
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field2863;
        int[] var3 = super.field2218.method1044(arg1, arg0 ^ arg0);
        if (super.field2218.field2587) {
            int[] var4 = this.method932(arg1 + -1 & class258.field4520, false, 0);
            int[] var5 = this.method932(arg1, false, 0);
            int[] var6 = this.method932(class258.field4520 & arg1 + 1, false, 0);
            for (int var7 = 0; var7 < class143.field2702; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2861;
                int var9 = (var5[class54.field884 & var7 - -1] + -var5[var7 + -1 & class54.field884]) * this.field2861;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 - -var12 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
    public static final void method1132(int arg0, int arg1) {
        ++field2859;
        class105 var2;
        if (class254.field4448 != null) {
            var2 = (class105) class254.field4448;
        } else {
            var2 = new class105(512, 512);
        }
        int[] var3 = var2.field2012;
        int var4 = var3.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            var3[var5] = 1;
        }
        int var6 = 1;
        if (arg1 != 24628) {
            method1132(-15, 11);
        }
        while (var6 < 103) {
            int var24 = (-var6 + 103) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if (~(class123.field2344[arg0][var25][var6] & 24) == -1) {
                    class71.method526(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && ~(8 & class123.field2344[arg0 + 1][var25][var6]) != -1) {
                    class71.method526(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
            ++var6;
        }
        var2.method858();
        int var7 = (int) (20.0D * Math.random()) + 238 - (10 - ((int) (20.0D * Math.random()) + 228 << 8)) + (228 + (int) (Math.random() * 20.0D) << 16);
        int var8 = 228 + (int) (Math.random() * 20.0D) << 16;
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if (~(24 & class123.field2344[arg0][var23][var9]) == -1) {
                    class37.method270(var7, var23, var8, var9, arg0, 2);
                }
                if (arg0 < 3 && ~(class123.field2344[arg0 + 1][var23][var9] & 8) != -1) {
                    class37.method270(var7, var23, var8, var9, arg0 + 1, 2);
                }
            }
        }
        class237.field4220 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; ~var11 > -105; ++var11) {
                long var12 = class219.method1553(class20.field323, var10, var11);
                if (~var12 != -1L) {
                    class35 var14 = class9.method64(false, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                    int var15 = var14.field580;
                    if (var14.field577 != null) {
                        for (int var16 = 0; var16 < var14.field577.length; ++var16) {
                            if (~var14.field577[var16] != 0) {
                                class35 var17 = class9.method64(false, var14.field577[var16]);
                                if (~var17.field580 <= -1) {
                                    var15 = var17.field580;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (~var15 != -23 && ~var15 != -30 && var15 != 34 && var15 != 36 && ~var15 != -47 && ~var15 != -48 && var15 != 48) {
                            int[][] var20 = class140.field2670[class20.field323].field11;
                            for (int var21 = 0; ~var21 > -11; ++var21) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (~var22 == -1 && var18 > 0 && ~var18 < ~(var10 - 3) && ~(19661064 & var20[var18 + -1][var19]) == -1) {
                                    --var18;
                                }
                                if (var22 == 1 && var18 < 103 && var18 < var10 + 3 && ~(19661184 & var20[var18 + 1][var19]) == -1) {
                                    ++var18;
                                }
                                if (var22 == 2 && var19 > 0 && ~var19 < ~(var11 + -3) && (var20[var18][var19 + -1] & 19661058) == 0) {
                                    --var19;
                                }
                                if (~var22 == -4 && var19 < 103 && var19 < var11 + 3 && ~(var20[var18][var19 + 1] & 19661088) == -1) {
                                    ++var19;
                                }
                            }
                        }
                        class178.field3243[class237.field4220] = var14.field538;
                        class30.field477[class237.field4220] = var18;
                        class19.field293[class237.field4220] = var19;
                        ++class237.field4220;
                    }
                }
            }
        }
        class254.field4448 = var2;
        class128.field2496.method700(101);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
    public static final void method1133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 31420) {
            method1132(36, -127);
        }
        if (arg3 >= arg2) {
            class227.method1585(arg2, (byte) -66, arg1, class85.field1605[arg0], arg3);
        } else {
            class227.method1585(arg3, (byte) -66, arg1, class85.field1605[arg0], arg2);
        }
        ++field2860;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
    public static void method1134(byte arg0) {
        field2872 = null;
        field2874 = null;
        field2873 = null;
        field2870 = null;
        field2868 = null;
        field2866 = null;
        field2875 = null;
        field2857 = null;
        if (arg0 != 95) {
            field2875 = null;
        }
        field2869 = null;
        field2871 = null;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if (~(1 & var1) != -2) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -306674912;
                }
            }
            field2857[var0] = var1;
        }
        field2871 = class137.method1065("Sat", 17);
        field2868 = class137.method1065("Tue", 17);
        field2869 = class137.method1065("Fri", 17);
        field2875 = class137.method1065(")2", 17);
        field2866 = class137.method1065("Mon", 17);
        field2873 = class137.method1065("Wed", 17);
        field2874 = class137.method1065("Sun", 17);
        field2872 = class137.method1065("Thu", 17);
        field2870 = new class163[] { field2874, field2866, field2868, field2873, field2872, field2869, field2871 };
    }
}
