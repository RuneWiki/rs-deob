import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class170 extends class286 {

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    private int field2851 = 0;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    private int field2855 = 4096;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    private int field2858 = 8192;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    private int field2864 = 2048;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    private int field2866 = 0;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    private int field2857 = 2048;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "I")
    private int field2877 = 12288;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "Lbe;")
    public static class283 field2853 = class153.method941(-92, "leuchten3:");

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "Lbe;")
    public static class283 field2863 = class153.method941(126, "Card:");

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "Lbe;")
    public static class283 field2868 = class153.method941(12, ")4a=");

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "Lt;")
    public static class239 field2860 = new class239(32);

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "Lbe;")
    private static class283 field2871 = class153.method941(-31, "Sat");

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "Lbe;")
    private static class283 field2869 = class153.method941(126, "Tue");

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "Lbe;")
    private static class283 field2875 = class153.method941(125, "Mon");

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "Lbe;")
    private static class283 field2873 = class153.method941(126, "Sun");

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "Lbe;")
    private static class283 field2876 = class153.method941(126, "Wed");

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "Lbe;")
    private static class283 field2874 = class153.method941(127, "Thu");

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "Lbe;")
    private static class283 field2870 = class153.method941(126, "Fri");

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "[Lbe;")
    public static class283[] field2878 = new class283[] { field2873, field2875, field2869, field2876, field2874, field2870, field2871 };

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 5)
    public final void method276(int arg0) {
        if (arg0 != 3) {
            method1080((byte) 72);
        }
        class86.method555(arg0 ^ 0x1003);
        field2867++;
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)V", line = 17)
    public static final void method1078(int arg0) {
        if (class175.field3019 == 10) {
            class77.method506(28, -30354);
        }
        if (arg0 != 103) {
            method1083(-44);
        }
        field2859++;
        if (class175.field3019 == 30) {
            class77.method506(25, -30354);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 453)
    public class170() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V", line = 43)
    public static final void method1079(int arg0, int arg1) {
        field2856++;
        class204 var2 = new class204(512, 512);
        int[] var3 = var2.field3484;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class252.field4282[arg1][var8][var6] & 0x18) == 0) {
                    class298.method2020(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (class252.field4282[arg1 + 1][var8][var6] & 0x8) != 0) {
                    class298.method2020(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method1308();
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D)) + 228;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class252.field4282[arg1][var12][var11] & 0x18) == 0) {
                    class66.method424(var9, var10, (byte) -118, var11, var12, arg1);
                }
                if (arg1 < 3 && (class252.field4282[arg1 + 1][var12][var11] & 0x8) != 0) {
                    class66.method424(var9, var10, (byte) -50, var11, var12, arg1 + 1);
                }
            }
        }
        class31.field469 = 0;
        int var13 = 8 % ((arg0 + 10) / 55);
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                long var16 = class263.method1783(class61.field850, var14, var15);
                if (var16 != 0L) {
                    class281 var18 = class254.method1722(0, (int) (var16 >>> 32) & Integer.MAX_VALUE);
                    int var19 = var18.field4685;
                    if (var18.field4752 != null) {
                        for (int var20 = 0; var20 < var18.field4752.length; var20++) {
                            if (var18.field4752[var20] != -1) {
                                class281 var21 = class254.method1722(0, var18.field4752[var20]);
                                if (var21.field4685 >= 0) {
                                    var19 = var21.field4685;
                                    break;
                                }
                            }
                        }
                    }
                    if (var19 >= 0) {
                        int var22 = var14;
                        int var23 = var15;
                        if (var19 != 22 && var19 != 29 && var19 != 34 && var19 != 36 && var19 != 46 && var19 != 47 && var19 != 48) {
                            int[][] var24 = class180.field3102[class61.field850].field1765;
                            for (int var25 = 0; var25 < 10; var25++) {
                                int var26 = (int) (Math.random() * 4.0D);
                                if (var26 == 0 && var22 > 0 && var14 - 3 < var22 && (var24[var22 - 1][var23] & 0x12C0108) == 0) {
                                    var22--;
                                }
                                if (var26 == 1 && var22 < 103 && var22 < var14 + 3 && (var24[var22 + 1][var23] & 0x12C0180) == 0) {
                                    var22++;
                                }
                                if (var26 == 2 && var23 > 0 && (var15 - 3) < var23 && (var24[var22][var23 - 1] & 0x12C0102) == 0) {
                                    var23--;
                                }
                                if (var26 == 3 && var23 < 103 && var23 < (var15 + 3) && (var24[var22][var23 + 1] & 0x12C0120) == 0) {
                                    var23++;
                                }
                            }
                        }
                        class129.field2140[class31.field469] = var18.field4693;
                        class298.field5040[class31.field469] = var22;
                        class111.field1875[class31.field469] = var23;
                        class31.field469++;
                    }
                }
            }
        }
        for (int var27 = 0; var27 < var4; var27++) {
            if (var3[var27] == 0) {
                var3[var27] = 1;
            }
        }
        class119.field2009 = new class266(var2);
        class78.field1357 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lfe;ZI)V", line = 255)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field2864 = arg0.method1496(true);
        } else if (arg2 == 1) {
            this.field2866 = arg0.method1496(true);
        } else if (arg2 == 2) {
            this.field2851 = arg0.method1496(true);
        } else if (arg2 == 3) {
            this.field2857 = arg0.method1496(true);
        } else if (arg2 == 4) {
            this.field2877 = arg0.method1496(!arg1);
        } else if (arg2 == 5) {
            this.field2855 = arg0.method1496(!arg1);
        } else if (arg2 == 6) {
            this.field2858 = arg0.method1496(true);
        }
        if (arg1) {
            field2869 = (class283) null;
        }
        field2861++;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V", line = 316)
    public static void method1080(byte arg0) {
        field2873 = null;
        field2869 = null;
        field2863 = null;
        field2874 = null;
        field2878 = null;
        field2875 = null;
        field2860 = null;
        field2871 = null;
        field2868 = null;
        field2870 = null;
        field2876 = null;
        if (arg0 <= 104) {
            field2871 = (class283) null;
        }
        field2853 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZII)Z", line = 351)
    private final boolean method1081(boolean arg0, int arg1, int arg2) {
        int var4 = (arg2 - arg1) * this.field2877 >> 12;
        field2852++;
        if (arg0) {
            field2870 = (class283) null;
        }
        int var5 = class33.field490[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field2877;
        int var7 = (var6 << 12) / this.field2858;
        int var8 = this.field2855 * var7 >> 12;
        return var8 > arg1 + arg2 && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I", line = 390)
    public final int[] method14(int arg0, int arg1) {
        field2862++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (arg0 >= -52) {
            this.method19((class229) null, true, 107);
        }
        if (this.field4863.field3984) {
            int var4 = class153.field2509[arg1] - 2048;
            for (int var5 = 0; var5 < class27.field410; var5++) {
                int var6 = class174.field2978[var5] - 2048;
                int var7 = this.field2864 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = this.field2866 + var4;
                int var10 = var8 <= 2048 ? var8 : var8 - 4096;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = this.field2851 + var6;
                int var13 = var11 <= 2048 ? var11 : var11 - 4096;
                int var14 = this.field2857 + var4;
                int var15 = var12 >= -2048 ? var12 : var12 + 4096;
                int var16 = var14 < -2048 ? var14 + 4096 : var14;
                int var17 = var15 > 2048 ? var15 - 4096 : var15;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                var3[var5] = this.method1081(false, var10, var13) || this.method1082(4, var17, var18) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(III)Z", line = 436)
    private final boolean method1082(int arg0, int arg1, int arg2) {
        field2865++;
        if (arg0 != 4) {
            return true;
        }
        int var4 = (arg1 + arg2) * this.field2877 >> 12;
        int var5 = class33.field490[(var4 * 255 & 0xFF183) >> 12];
        int var6 = (var5 << 12) / this.field2877;
        int var7 = (var6 << 12) / this.field2858;
        int var8 = this.field2855 * var7 >> 12;
        return var8 > arg2 - arg1 && (arg2 - arg1) > (-var8);
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)V", line = 473)
    public static final void method1083(int arg0) {
        class254.field4298.method125((byte) -83);
        if (arg0 != 238) {
            method1083(-124);
        }
        class237.field3965 = 1;
        class220.field3709 = null;
        field2854++;
    }
}
