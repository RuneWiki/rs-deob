import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class177 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Z")
    public boolean field2844 = true;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    private int field2847 = 0;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field2848 = -1;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public int field2851 = 128;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[I")
    public static int[] field2862 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lte;")
    public static class124 field2849;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lql;")
    public static class87 field2860;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Ljava/awt/Frame;")
    public static Frame field2866;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method1111(int arg0, boolean arg1) {
        field2850++;
        if (!arg1) {
            field2849 = (class124) null;
        }
        if (class322.field4897 == null || class322.field4897.length < arg0) {
            class322.field4897 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Lem;", line = 24)
    public static final class271 method1112(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field969; var4++) {
            class271 var5 = var3.field974[var4];
            if ((var5.field4191 >> 29 & 0x3L) == 2L && var5.field4180 == arg1 && var5.field4187 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZLag;)V", line = 50)
    public final void method1113(int arg0, boolean arg1, class202 arg2) {
        if (arg1) {
            return;
        }
        while (true) {
            int var4 = arg2.method1317((byte) -115);
            if (var4 == 0) {
                field2863++;
                return;
            }
            this.method1114(var4, arg0, arg2, -32405);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILag;I)V", line = 74)
    private final void method1114(int arg0, int arg1, class202 arg2, int arg3) {
        if (arg0 == 1) {
            this.field2847 = arg2.method1352((byte) 123);
            this.method1116(255, this.field2847);
        } else if (arg0 == 2) {
            this.field2848 = arg2.method1315(14289);
            if (this.field2848 == 65535) {
                this.field2848 = -1;
            }
        } else if (arg0 == 3) {
            this.field2851 = arg2.method1315(14289);
        } else if (arg0 == 4) {
            this.field2844 = false;
        }
        field2861++;
        if (arg3 != -32405) {
            this.method1113(-15, true, (class202) null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIILkl;)V", line = 112)
    public static final void method1115(byte arg0, int arg1, int arg2, class68 arg3) {
        field2854++;
        if (class289.field4445 != null || class290.field4459 || arg3 == null || class197.method1265((byte) -27, arg3) == null) {
            return;
        }
        class289.field4445 = arg3;
        class1.field26 = class197.method1265((byte) -27, arg3);
        class21.field451 = arg2;
        class136.field2289 = false;
        class212.field3412 = 0;
        if (arg0 == -4) {
            class159.field2603 = arg1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V", line = 138)
    private final void method1116(int arg0, int arg1) {
        field2865++;
        double var3 = (double) (arg1 >> 8 & arg0) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        if (var5 < var3) {
            var7 = var3;
        }
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        if (var9 > var7) {
            var7 = var9;
        }
        double var11 = var5;
        if (var3 < var5) {
            var11 = var3;
        }
        double var13 = 0.0D;
        if (var11 > var9) {
            var11 = var9;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        this.field2867 = (int) (var17 * 256.0D);
        if (this.field2867 < 0) {
            this.field2867 = 0;
        } else if (this.field2867 > 255) {
            this.field2867 = 255;
        }
        if (var7 != var11) {
            if (var5 == var7) {
                var13 = (var3 - var9) / (var7 - var11);
            } else if (var3 == var7) {
                var13 = (var9 - var5) / (var7 - var11) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var5 - var3) / (var7 - var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var7 - var11) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var7 - var11) / (2.0D - var7 - var11);
            }
        }
        this.field2859 = (int) (var15 * 256.0D);
        if (this.field2859 < 0) {
            this.field2859 = 0;
        } else if (this.field2859 > 255) {
            this.field2859 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field2858 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2858 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2858 < 1) {
            this.field2858 = 1;
        }
        double var19 = var13 / 6.0D;
        this.field2845 = (int) ((double) this.field2858 * var19);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V", line = 227)
    public static final void method1117(int arg0, int arg1) {
        class147.field2402 = null;
        class204.field3340 = 0;
        class112.field1976 = -1;
        field2856++;
        field2846 = arg0;
        if (arg1 <= -24) {
            class291.field4472 = false;
            class38.field731 = -1;
            class18.field327 = 1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 249)
    public static void method1118(boolean arg0) {
        field2849 = null;
        field2862 = null;
        field2866 = null;
        if (!arg0) {
            field2862 = (int[]) null;
        }
        field2860 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZBZ)V", line = 275)
    public static final void method1119(int arg0, boolean arg1, byte arg2, boolean arg3) {
        int var10002;
        for (int var4 = 0; var4 < class285.field4417; var4++) {
            class255 var5 = class8.field179[class131.field2226[var4]];
            if (var5 != null && var5.method701(-7080) && var5.field3991.method327(57941647)) {
                int var6 = var5.method710(-1);
                if (arg3) {
                    if (!var5.field3991.field835) {
                        continue;
                    }
                } else if (arg1 != var5.field3991.field836 || arg0 != 0 && arg0 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field1869 & 0x7F) == 64 && (var5.field1872 & 0x7F) == 64) {
                        int var7 = var5.field1872 >> 7;
                        int var8 = var5.field1869 >> 7;
                        if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                            var10002 = class67.field1274[var8][var7]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field1869 & 0x7F) == 0 && (var5.field1872 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field1869 & 0x7F) == 64 && (var5.field1872 & 0x7F) == 64)) {
                    int var9 = var5.field1869 - (var6 * 64) >> 7;
                    int var10 = var5.field1872 - var6 * 64 >> 7;
                    int var11 = var5.method710(-1) + var9;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    int var12 = var5.method710(-1) + var10;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    for (int var13 = var9; var13 < var11; var13++) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            var10002 = class67.field1274[var13][var14]++;
                        }
                    }
                }
            }
        }
        field2855++;
        int var15 = 0;
        if (arg2 != -67) {
            return;
        }
        while (var15 < class285.field4417) {
            long var16 = (long) class131.field2226[var15] << 32 | 0x20000000L;
            class255 var18 = class8.field179[class131.field2226[var15]];
            if (var18 != null && var18.method701(-7080) && var18.field3991.method327(57941647)) {
                label267: {
                    int var19 = var18.method710(-1);
                    if (arg3) {
                        if (!var18.field3991.field835) {
                            break label267;
                        }
                    } else if (arg1 != var18.field3991.field836 || arg0 != 0 && arg0 != var19) {
                        break label267;
                    }
                    var18.field1866 = true;
                    if (var19 == 1) {
                        if ((var18.field1869 & 0x7F) == 64 && (var18.field1872 & 0x7F) == 64) {
                            int var29 = var18.field1872 >> 7;
                            int var30 = var18.field1869 >> 7;
                            if (var30 < 0 || var30 >= 104 || var29 < 0 || var29 >= 104) {
                                break label267;
                            }
                            if (class67.field1274[var30][var29] > 1) {
                                var10002 = class67.field1274[var30][var29]--;
                                break label267;
                            }
                        }
                    } else if ((var19 & 0x1) == 0 && (var18.field1869 & 0x7F) == 0 && (var18.field1872 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var18.field1869 & 0x7F) == 64 && (var18.field1872 & 0x7F) == 64) {
                        int var20 = var18.field1869 - (var19 * 64) >> 7;
                        int var21 = var18.field1872 - (var19 * 64) >> 7;
                        int var22 = var19 + var20;
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        if (var22 > 104) {
                            var22 = 104;
                        }
                        int var23 = var19 + var21;
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        boolean var24 = true;
                        for (int var25 = var20; var25 < var22; var25++) {
                            for (int var26 = var21; var26 < var23; var26++) {
                                if (class67.field1274[var25][var26] <= 1) {
                                    var24 = false;
                                    break;
                                }
                            }
                        }
                        if (var24) {
                            int var27 = var20;
                            while (true) {
                                if (var22 <= var27) {
                                    break label267;
                                }
                                for (int var28 = var21; var28 < var23; var28++) {
                                    var10002 = class67.field1274[var27][var28]--;
                                }
                                var27++;
                            }
                        }
                    }
                    var18.field1866 = false;
                    if (!var18.field3991.field838) {
                        var16 |= Long.MIN_VALUE;
                    }
                    var18.field1898 = class325.method2250(var18.field1872, 22771, class289.field4438, var18.field1869);
                    class50.method380(class289.field4438, var18.field1869, var18.field1872, var18.field1898, (var19 - 1) * 64 + 60, var18, var18.field1927, var16, var18.field1891);
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIB)V", line = 522)
    public static final void method1120(int arg0, int arg1, int arg2, byte arg3) {
        if (arg1 == 0) {
            class119.field2069++;
            class14.field263.method80(110, (byte) 102);
            class14.field263.method1311(5, 10964);
        }
        if (arg3 > -120) {
            method1119(102, false, (byte) 20, true);
        }
        if (arg1 == 1) {
            class14.field263.method80(40, (byte) 108);
            class232.field3636++;
            class14.field263.method1311(19, 10964);
        }
        field2853++;
        class14.field263.method1324(class246.field3818 + arg2, 1734336648);
        class14.field263.method1349(class342.field5317[82] ? 1 : 0, 7701);
        class14.field263.method1313(class101.field1769 + arg0, -376480);
        class224.field3532 = arg2;
        class6.field129 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lmg;", line = 555)
    public static final class113 method1121(int arg0) {
        field2857++;
        class113 var1 = new class113(class194.field3127, class321.field4891, class80.field1572[0], class27.field530[arg0], class28.field537[0], class176.field2833[0], class254.field3968[0], class274.field4202);
        class97.method644((byte) 111);
        return var1;
    }
}
