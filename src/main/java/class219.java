import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class219 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[[I")
    private int[][] field3502;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    private int field3505;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Z")
    public static volatile boolean field3506 = true;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[Z")
    public static boolean[] field3503 = new boolean[200];

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3508 = 0;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field3512 = 50;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Leh;")
    public static class137 field3511;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZIZB)V")
    public static final void method1549(boolean arg0, int arg1, boolean arg2, byte arg3) {
        int var10002;
        for (int var4 = 0; var4 < class134.field2122; var4++) {
            class200 var21 = class265.field4273[class11.field121[var4]];
            if (var21 != null && var21.method1400(67) && var21.field3166.method1307(7757)) {
                int var22 = var21.method1638(-6377);
                if (arg0) {
                    if (!var21.field3166.field3026) {
                        continue;
                    }
                } else if (var21.field3166.field2996 != arg2 || arg1 != 0 && arg1 != var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((var21.field3818 & 0x7F) == 64 && (var21.field3820 & 0x7F) == 64) {
                        int var23 = var21.field3820 >> 7;
                        int var24 = var21.field3818 >> 7;
                        if (var24 >= 0 && var24 < 104 && var23 >= 0 && var23 < 104) {
                            var10002 = class239.field3943[var24][var23]++;
                        }
                    }
                } else if (((var22 & 0x1) != 0 || (var21.field3818 & 0x7F) == 0 && (var21.field3820 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field3818 & 0x7F) == 64 && (var21.field3820 & 0x7F) == 64)) {
                    int var25 = var21.field3818 - var22 * 64 >> 7;
                    int var26 = var21.field3820 - (var22 * 64) >> 7;
                    int var27 = var21.method1638(-6377) + var25;
                    if (var27 > 104) {
                        var27 = 104;
                    }
                    int var28 = var26 + var21.method1638(-6377);
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    if (var28 > 104) {
                        var28 = 104;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    for (int var29 = var25; var29 < var27; var29++) {
                        for (int var30 = var26; var30 < var28; var30++) {
                            var10002 = class239.field3943[var29][var30]++;
                        }
                    }
                }
            }
        }
        field3501++;
        if (arg3 > -11) {
            return;
        }
        label220: for (int var5 = 0; var5 < class134.field2122; var5++) {
            class200 var6 = class265.field4273[class11.field121[var5]];
            long var7 = (long) class11.field121[var5] << 32 | 0x20000000L;
            if (var6 != null && var6.method1400(83) && var6.field3166.method1307(7757)) {
                int var9 = var6.method1638(-6377);
                if (arg0) {
                    if (!var6.field3166.field3026) {
                        continue;
                    }
                } else if (arg2 != var6.field3166.field2996 || arg1 != 0 && arg1 != var9) {
                    continue;
                }
                var6.field3825 = true;
                if (var9 == 1) {
                    if ((var6.field3818 & 0x7F) == 64 && (var6.field3820 & 0x7F) == 64) {
                        int var19 = var6.field3820 >> 7;
                        int var20 = var6.field3818 >> 7;
                        if (var20 < 0 || var20 >= 104 || var19 < 0 || var19 >= 104) {
                            continue;
                        }
                        if (class239.field3943[var20][var19] > 1) {
                            var10002 = class239.field3943[var20][var19]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var6.field3818 & 0x7F) == 0 && (var6.field3820 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var6.field3818 & 0x7F) == 64 && (var6.field3820 & 0x7F) == 64) {
                    int var10 = var6.field3818 - (var9 * 64) >> 7;
                    int var11 = var6.field3820 - (var9 * 64) >> 7;
                    int var12 = var9 + var11;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    boolean var13 = true;
                    int var14 = var9 + var10;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var14 > 104) {
                        var14 = 104;
                    }
                    for (int var15 = var10; var15 < var14; var15++) {
                        for (int var18 = var11; var18 < var12; var18++) {
                            if (class239.field3943[var15][var18] <= 1) {
                                var13 = false;
                                break;
                            }
                        }
                    }
                    if (var13) {
                        int var16 = var10;
                        while (true) {
                            if (var16 >= var14) {
                                continue label220;
                            }
                            for (int var17 = var11; var17 < var12; var17++) {
                                var10002 = class239.field3943[var16][var17]--;
                            }
                            var16++;
                        }
                    }
                }
                var6.field3825 = false;
                if (!var6.field3166.field3027) {
                    var7 |= Long.MIN_VALUE;
                }
                var6.field3753 = class166.method1148(class244.field4011, var6.field3818, var6.field3820, (byte) -100);
                class28.method165(class244.field4011, var6.field3818, var6.field3820, var6.field3753, (var9 - 1) * 64 + 60, var6, var6.field3751, var7, var6.field3758);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1550(int arg0, byte[] arg1) {
        if (arg0 != -32768) {
            this.field3505 = 90;
        }
        field3507++;
        if (this.field3502 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3500 / (long) this.field3505) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3502[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3500 + var6;
                int var14 = var13 / this.field3505;
                var6 = var13 - this.field3505 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V")
    public class219(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class47.method262(arg1, arg0, -2);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3502 = new int[var5][14];
            this.field3505 = var5;
            this.field3500 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field3502[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                double var11 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1551(int arg0) {
        field3503 = null;
        field3511 = null;
        if (arg0 != -10692) {
            method1551(-8);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
    public final int method1552(int arg0, int arg1) {
        if (arg1 >= -47) {
            return -67;
        }
        if (this.field3502 != null) {
            arg0 = (int) ((long) this.field3500 * (long) arg0 / (long) this.field3505) + 6;
        }
        field3509++;
        return arg0;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)I")
    public final int method1553(int arg0, int arg1) {
        if (arg1 != -2) {
            return -31;
        }
        field3510++;
        if (this.field3502 != null) {
            arg0 = (int) ((long) this.field3500 * (long) arg0 / (long) this.field3505);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Leh;I)V")
    public static final void method1554(class137 arg0, int arg1) {
        field3504++;
        if (arg1 != 20662) {
            field3508 = -89;
        }
        class163.field2596 = arg0;
    }
}
