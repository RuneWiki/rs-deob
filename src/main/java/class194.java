import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class194 extends class28 {

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "[J")
    private long[] field2794 = new long[10];

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    private int field2791 = 256;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    private int field2796 = 0;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    private int field2789 = 1;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "J")
    private long field2783 = class287.method1928(27332);

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field2784 = 0;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field2781 = -1;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2787 = "Loading wordpack - ";

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "[Lde;")
    public static class53[] field2777 = new class53[2048];

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "[I")
    public static int[] field2780 = new int[5];

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "J")
    public static volatile long field2793 = 0L;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2795 = "Opened title screen";

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    private int field2792;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Lij;")
    public static class69 field2790;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V")
    public static final void method1242(int arg0, int arg1, int arg2) {
        int var3 = arg2--;
        if (var3 > arg1) {
            var3 = 25;
        }
        field2779++;
        int var4 = class1.field19[arg2];
        int var5 = class51.field755[arg2];
        if (arg0 == 0) {
            class95.field1451.method522(244, arg1 + 28702);
            class95.field1451.method775(var3 + var3 + 3, -118);
            class137.field1976++;
        }
        if (arg0 == 1) {
            class195.field2802++;
            class95.field1451.method522(146, 28727);
            class95.field1451.method775(var3 + var3 + 3 + 14, arg1 ^ 0xFFFFFF9C);
        }
        if (arg0 == 2) {
            class95.field1451.method522(156, 28727);
            class90.field1369++;
            class95.field1451.method775(var3 - (-var3 - 3), -120);
        }
        class95.field1451.method794(class113.field1615 + var5, (byte) -95);
        class95.field1451.method766(113, class19.field267[82] ? 1 : 0);
        class214.field3091 = class1.field19[0];
        class103.field1539 = class51.field755[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class95.field1451.method771(class51.field755[arg2] - var5, -1);
            class95.field1451.method751(class1.field19[arg2] - var4, (byte) 120);
        }
        class95.field1451.method784(true, class95.field1445 + var4);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public final void method208(byte arg0) {
        if (arg0 > 110) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field2794[var2] = 0L;
            }
            field2776++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
    public static void method1243(byte arg0) {
        if (arg0 >= -69) {
            return;
        }
        field2790 = null;
        field2795 = null;
        field2780 = null;
        field2777 = null;
        field2787 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
    public final int method207(int arg0, int arg1, int arg2) {
        field2785++;
        int var4 = this.field2789;
        int var5 = this.field2791;
        this.field2789 = 1;
        this.field2791 = 300;
        this.field2783 = class287.method1928(arg2 + 27332);
        if (this.field2794[this.field2792] == 0L) {
            this.field2789 = var4;
            this.field2791 = var5;
        } else if (this.field2794[this.field2792] < this.field2783) {
            this.field2791 = (int) ((long) (arg0 * 2560) / (this.field2783 - this.field2794[this.field2792]));
        }
        if (this.field2791 < 25) {
            this.field2791 = 25;
        }
        if (this.field2791 > 256) {
            this.field2791 = 256;
            this.field2789 = (int) ((long) arg0 - (this.field2783 - this.field2794[this.field2792]) / 10L);
        }
        if (arg0 < this.field2789) {
            this.field2789 = arg0;
        }
        this.field2794[this.field2792] = this.field2783;
        this.field2792 = (this.field2792 + 1) % 10;
        if (this.field2789 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2794[var6] != 0L) {
                    this.field2794[var6] += (long) this.field2789;
                }
            }
        }
        if (this.field2789 < arg1) {
            this.field2789 = arg1;
        }
        class98.method660((long) this.field2789, -70);
        int var7 = arg2;
        while (this.field2796 < 256) {
            this.field2796 += this.field2791;
            var7++;
        }
        this.field2796 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    public static final void method1244(int arg0, int arg1) {
        if ((class55.field847.field45 + 64 - (class55.field847.method57(0) * 64) >> 7) == class103.field1539 && (class55.field847.field94 + (64 - (class55.field847.method57(0) * 64)) >> 7) == class214.field3091) {
            class103.field1539 = 0;
        }
        int var2 = class193.field2770;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class53 var20;
            if (arg0 == 0) {
                var20 = class55.field847;
            } else {
                var20 = field2777[class110.field1589[var3]];
            }
            if (var20 != null && var20.method71(false)) {
                int var21 = var20.method57(0);
                if (arg0 == 0 || arg0 == var21) {
                    if (var21 == 1) {
                        if ((var20.field45 & 0x7F) == 64 && (var20.field94 & 0x7F) == 64) {
                            int var22 = var20.field45 >> 7;
                            int var23 = var20.field94 >> 7;
                            if (var22 >= 0 && var22 < 104 && var23 >= 0 && var23 < 104) {
                                var10002 = class180.field2575[var22][var23]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field45 & 0x7F) == 0 && (var20.field94 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field45 & 0x7F) == 64 && (var20.field94 & 0x7F) == 64)) {
                        int var24 = var20.field45 - (var21 * 64) >> 7;
                        int var25 = var20.field94 - var21 * 64 >> 7;
                        int var26 = var24 + var20.method57(0);
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        int var27 = var20.method57(0) + var25;
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        for (int var28 = var24; var28 < var26; var28++) {
                            for (int var29 = var25; var29 < var27; var29++) {
                                var10002 = class180.field2575[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        field2786++;
        int var4 = 0;
        if (arg1 <= 6) {
            field2780 = null;
        }
        while (var2 > var4) {
            long var5;
            class53 var7;
            if (arg0 == 0) {
                var5 = 8791798054912L;
                var7 = class55.field847;
            } else {
                var5 = (long) class110.field1589[var4] << 32;
                var7 = field2777[class110.field1589[var4]];
            }
            if (var7 != null && var7.method71(false)) {
                int var8 = var7.method57(0);
                if (arg0 == 0 || arg0 == var8) {
                    label282: {
                        var7.field89 = true;
                        var7.field781 = false;
                        if ((class242.field3626 && class193.field2770 > 200 || class193.field2770 > 50) && arg0 != 0 && var7.field112 == var7.method73((byte) -44).field531) {
                            var7.field781 = true;
                        }
                        if (var8 == 1) {
                            if ((var7.field45 & 0x7F) == 64 && (var7.field94 & 0x7F) == 64) {
                                int var18 = var7.field45 >> 7;
                                int var19 = var7.field94 >> 7;
                                if (var18 < 0 || var18 >= 104 || var19 < 0 || var19 >= 104) {
                                    break label282;
                                }
                                if (class180.field2575[var18][var19] > 1) {
                                    var10002 = class180.field2575[var18][var19]--;
                                    break label282;
                                }
                            }
                        } else if ((var8 & 0x1) == 0 && (var7.field45 & 0x7F) == 0 && (var7.field94 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var7.field45 & 0x7F) == 64 && (var7.field94 & 0x7F) == 0) {
                            int var9 = var7.field45 - var8 * 64 >> 7;
                            int var10 = var7.field94 - (var8 * 64) >> 7;
                            boolean var11 = true;
                            int var12 = var8 + var10;
                            if (var12 > 104) {
                                var12 = 104;
                            }
                            int var13 = var8 + var9;
                            if (var10 < 0) {
                                var10 = 0;
                            }
                            if (var9 < 0) {
                                var9 = 0;
                            }
                            if (var13 > 104) {
                                var13 = 104;
                            }
                            for (int var14 = var9; var14 < var13; var14++) {
                                for (int var17 = var10; var17 < var12; var17++) {
                                    if (class180.field2575[var14][var17] <= 1) {
                                        var11 = false;
                                        break;
                                    }
                                }
                            }
                            if (var11) {
                                int var15 = var9;
                                while (true) {
                                    if (var15 >= var13) {
                                        break label282;
                                    }
                                    for (int var16 = var10; var16 < var12; var16++) {
                                        var10002 = class180.field2575[var15][var16]--;
                                    }
                                    var15++;
                                }
                            }
                        }
                        if (var7.field65 == null || class82.field1267 < var7.field64 || class82.field1267 >= var7.field78) {
                            var7.field89 = false;
                            var7.field113 = class81.method542(var7.field45, -1, class163.field2364, var7.field94);
                            class43.method294(class163.field2364, var7.field45, var7.field94, var7.field113, var8 * 64 + 60 - 64, var7, var7.field104, var5, var7.field83);
                        } else {
                            var7.field89 = false;
                            var7.field781 = false;
                            var7.field113 = class81.method542(var7.field45, -1, class163.field2364, var7.field94);
                            class107.method704(class163.field2364, var7.field45, var7.field94, var7.field113, var7, var7.field104, var5, var7.field129, var7.field68, var7.field131, var7.field73);
                        }
                    }
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)I")
    public static final int method1245(int arg0, boolean arg1) {
        if (arg1) {
            return -51;
        } else {
            field2778++;
            return arg0 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class194() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2794[var1] = this.field2783;
        }
    }
}
