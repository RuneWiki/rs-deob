import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class254 extends class88 {

    @OriginalMember(owner = "client!al", name = "U", descriptor = "S")
    public static short field3710 = 32767;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "[I")
    public static int[] field3701 = new int[50];

    @OriginalMember(owner = "client!al", name = "X", descriptor = "I")
    public static int field3713 = 3;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "Lll;")
    public static class54 field3705 = new class54();

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "Lfm;")
    public class179 field3714;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "Lkk;")
    public static class295 field3707;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "[B")
    public byte[] field3709;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "[Luj;")
    public static class158[] field3708;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "[[I")
    public static int[][] field3712;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V", line = 4)
    public static void method1769(int arg0) {
        field3712 = (int[][]) null;
        field3707 = null;
        if (arg0 <= -23) {
            field3708 = null;
            field3705 = null;
            field3701 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V", line = 22)
    public static final void method1770(int arg0, byte arg1, int arg2) {
        if (arg1 != -68) {
            method1769(77);
        }
        field3715++;
        class360.field5638[arg0] = arg2;
        class132 var3 = (class132) class322.field4726.method2279((long) arg0, arg1 ^ 0x3F);
        if (var3 == null) {
            class132 var4 = new class132(4611686018427387905L);
            class322.field4726.method2275(var4, arg1 + 158, (long) arg0);
        } else if (var3.field1794 != 4611686018427387905L) {
            var3.field1794 = class6.method37(arg1 ^ 0xFFFFD5F0) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)I", line = 58)
    public final int method638(int arg0) {
        field3716++;
        int var2 = -27 / ((59 - arg0) / 39);
        return this.field1109 ? 0 : 100;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZZZ)V", line = 72)
    public static final void method1771(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        field3704++;
        int var10002;
        for (int var4 = 0; var4 < class257.field3747; var4++) {
            class169 var5 = class251.field3688[class305.field4455[var4]];
            if (var5 != null && var5.method1251(0) && var5.field2345.method1200(15835)) {
                int var6 = var5.method1699(-1);
                if (arg3) {
                    if (!var5.field2345.field2242) {
                        continue;
                    }
                } else if (var5.field2345.field2180 != arg2 || arg0 != 0 && arg0 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field4855 & 0x7F) == 64 && (var5.field4893 & 0x7F) == 64) {
                        int var13 = var5.field4893 >> 7;
                        int var14 = var5.field4855 >> 7;
                        if (var14 >= 0 && var14 < 104 && var13 >= 0 && var13 < 104) {
                            var10002 = field3712[var14][var13]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field4855 & 0x7F) == 0 && (var5.field4893 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field4855 & 0x7F) == 64 && (var5.field4893 & 0x7F) == 64)) {
                    int var7 = var5.field4855 - var6 * 64 >> 7;
                    int var8 = var5.field4893 - var6 * 64 >> 7;
                    int var9 = var5.method1699(-1) + var7;
                    if (var9 > 104) {
                        var9 = 104;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var10 = var8 + var5.method1699(-1);
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    for (int var11 = var7; var11 < var9; var11++) {
                        for (int var12 = var8; var12 < var10; var12++) {
                            var10002 = field3712[var11][var12]++;
                        }
                    }
                }
            }
        }
        if (!arg1) {
            method1772(-87, false, 104, (byte) 105);
        }
        label209: for (int var15 = 0; var15 < class257.field3747; var15++) {
            class169 var16 = class251.field3688[class305.field4455[var15]];
            long var17 = (long) class305.field4455[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method1251(0) && var16.field2345.method1200(15835)) {
                int var19 = var16.method1699(-1);
                if (arg3) {
                    if (!var16.field2345.field2242) {
                        continue;
                    }
                } else if (var16.field2345.field2180 != arg2 || arg0 != 0 && arg0 != var19) {
                    continue;
                }
                var16.field4884 = true;
                if (var19 == 1) {
                    if ((var16.field4855 & 0x7F) == 64 && (var16.field4893 & 0x7F) == 64) {
                        int var20 = var16.field4855 >> 7;
                        int var21 = var16.field4893 >> 7;
                        if (var20 < 0 || var20 >= 104 || var21 < 0 || var21 >= 104) {
                            continue;
                        }
                        if (field3712[var20][var21] > 1) {
                            var10002 = field3712[var20][var21]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var16.field4855 & 0x7F) == 0 && (var16.field4893 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field4855 & 0x7F) == 64 && (var16.field4893 & 0x7F) == 64) {
                    int var22 = var16.field4855 - var19 * 64 >> 7;
                    int var23 = var16.field4893 - (var19 * 64) >> 7;
                    int var24 = var19 + var22;
                    int var25 = var19 + var23;
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    boolean var26 = true;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    for (int var27 = var22; var27 < var24; var27++) {
                        for (int var28 = var23; var28 < var25; var28++) {
                            if (field3712[var27][var28] <= 1) {
                                var26 = false;
                                break;
                            }
                        }
                    }
                    if (var26) {
                        int var29 = var22;
                        while (true) {
                            if (var29 >= var24) {
                                continue label209;
                            }
                            for (int var30 = var23; var30 < var25; var30++) {
                                var10002 = field3712[var29][var30]--;
                            }
                            var29++;
                        }
                    }
                }
                if (!var16.field2345.field2217) {
                    var17 |= Long.MIN_VALUE;
                }
                var16.field4884 = false;
                var16.field4898 = class271.method1847(var16.field4893, true, var16.field4855, class56.field724);
                class192.method1392(class56.field724, var16.field4855, var16.field4893, var16.field4898, var19 * 64 + 60 - 64, var16, var16.field4926, var17, var16.field4894);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZIB)V", line = 327)
    public static final void method1772(int arg0, boolean arg1, int arg2, byte arg3) {
        field3711++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class255.field3736 = arg0;
        class82.field1059 = arg1;
        class85.field1091 = arg2;
        int var4 = -88 % ((-arg3 - 54) / 39);
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(B)[B", line = 352)
    public final byte[] method636(byte arg0) {
        if (arg0 != -90) {
            return (byte[]) null;
        }
        field3706++;
        if (this.field1109) {
            throw new RuntimeException();
        }
        return this.field3709;
    }
}
