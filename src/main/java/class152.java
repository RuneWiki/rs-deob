import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class152 {

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lsb;")
    public static class127 field3495 = new class127(512);

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Lsc;")
    public static class128 field3503 = class129.method1017(false, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Lje;")
    public static class67 field3502 = new class67(5000);

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "J")
    public static volatile long field3505 = 0L;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field3506 = 0;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Lsc;")
    private static class128 field3508 = class129.method1017(false, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Lsc;")
    public static class128 field3510 = class129.method1017(false, "mapback");

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "[I")
    public static int[] field3509 = new int[25];

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Lsc;")
    private static class128 field3512 = class129.method1017(false, "New User");

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Lsc;")
    public static class128 field3507 = field3508;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lsc;")
    public static class128 field3504 = field3512;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Lsc;")
    private static class128 field3511 = class129.method1017(false, "Please enter your username)3");

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Lsc;")
    public static class128 field3513 = field3511;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Lb;")
    public static class8 field3514;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1203(int arg0, int arg1) {
        field3492++;
        if (arg0 == 100 && class156.field3573 > 0) {
            byte[] var2 = class108.field2448[--class156.field3573];
            class108.field2448[class156.field3573] = null;
            return var2;
        } else if (arg0 == 5000 && class128.field2937 > 0) {
            byte[] var3 = class149.field3437[--class128.field2937];
            class149.field3437[class128.field2937] = null;
            return var3;
        } else if (arg0 == 30000 && class63.field1361 > 0) {
            byte[] var4 = class97.field2258[--class63.field1361];
            class97.field2258[class63.field1361] = null;
            return var4;
        } else {
            if (arg1 >= -96) {
                field3505 = 123L;
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method1204(int arg0) {
        field3509 = null;
        field3507 = null;
        field3504 = null;
        field3512 = null;
        field3495 = null;
        field3508 = null;
        field3503 = null;
        int var1 = 110 % ((arg0 + 13) / 49);
        field3514 = null;
        field3513 = null;
        field3510 = null;
        field3511 = null;
        field3502 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLsf;Lsf;)V")
    public static final void method1205(byte arg0, class131 arg1, class131 arg2) {
        class93.field2129 = arg2;
        if (arg0 == 62) {
            class44.field831 = arg1;
            field3493++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)I")
    public static final int method1206(int arg0, int arg1, byte arg2) {
        if (arg2 > -13) {
            method1209(-75, true);
        }
        field3498++;
        int var3 = class89.method700(arg0 + 45365, 1, 4, arg1 + 91923) + (class89.method700(arg0 - -10294, 1, 2, arg1 + 37821) - 128 >> 1) + (class89.method700(arg0, 1, 1, arg1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIZII)Lb;")
    public static final class8 method1207(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3490++;
        long var6 = ((long) arg4 << 38) + ((long) arg2 << 16) + ((long) arg5 << 40) + (long) arg1;
        if (!arg3) {
            class8 var8 = (class8) class112.field2540.method917(var6, -1);
            if (var8 != null) {
                return var8;
            }
        }
        class64 var9 = class27.method230((byte) -44, arg1);
        if (arg2 > 1 && var9.field1386 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg2 >= var9.field1399[var11] && var9.field1399[var11] != 0) {
                    var10 = var9.field1386[var11];
                }
            }
            if (var10 != -1) {
                var9 = class27.method230((byte) -44, var10);
            }
        }
        class78 var12 = var9.method483(1, -22577);
        if (var12 == null) {
            return null;
        }
        class8 var13 = null;
        if (var9.field1371 != -1) {
            var13 = method1207(94, var9.field1403, 10, true, 1, 0);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class138.field3254;
        int var15 = class138.field3248;
        int var16 = class138.field3253;
        int[] var17 = new int[4];
        class138.method1133(var17);
        class8 var18 = new class8(36, 32);
        class138.method1140(var18.field127, 36, 32);
        class138.method1129();
        class114.method879();
        class114.method871(16, 16);
        int var19 = var9.field1417;
        if (arg3) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg4 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class114.field2563 = false;
        int var20 = class114.field2564[var9.field1391] * var19 >> 16;
        int var21 = class114.field2557[var9.field1391] * var19 >> 16;
        var12.method584();
        var12.method591(0, var9.field1379, var9.field1423, var9.field1391, var9.field1410, var20 + var12.field3593 / 2 + var9.field1368, var21 - -var9.field1368);
        if (arg4 >= 1) {
            var18.method46(1);
        }
        if (arg4 >= 2) {
            var18.method46(16777215);
        }
        if (arg5 != 0) {
            var18.method62(arg5);
        }
        class138.method1140(var18.field127, 36, 32);
        if (var9.field1371 != -1) {
            var13.method64(0, 0);
        }
        if (!arg3 && (var9.field1381 == 1 || arg2 != 1) && arg2 != -1) {
            class120.field2729.method1078(class157.method1227(false, arg2), 0, 9, 16776960, 1);
        }
        if (!arg3) {
            class112.field2540.method913(var6, var18, (byte) -45);
        }
        class138.method1140(var14, var15, var16);
        int var22 = 9 % ((2 - arg0) / 40);
        class138.method1143(var17);
        class114.method879();
        class114.field2563 = true;
        return var18;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1208(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != 0) {
            return 32;
        }
        if ((arg1 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg6;
            arg6 = var7;
        }
        field3501++;
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 8 - arg3 - arg4;
        } else {
            return 7 + 1 - arg0 - arg6;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
    public static final void method1209(int arg0, boolean arg1) {
        field3494++;
        if (!class65.method488((byte) 120, arg0) || arg1) {
            return;
        }
        class54[] var2 = class123.field2791[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class54 var4 = var2[var3];
            if (var4 != null) {
                var4.field1151 = 0;
                var4.field1182 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZI)Lhe;")
    public static final class54 method1210(int arg0, boolean arg1, int arg2) {
        field3499++;
        class54 var3 = class46.method338(arg0, 78);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field1100 == null || var3.field1100.length <= arg2) {
            return null;
        } else {
            if (arg1) {
                method1206(119, -2, (byte) -77);
            }
            return var3.field1100[arg2];
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static final void method1211(int arg0) {
        if (arg0 < 24) {
            method1205((byte) -10, null, null);
        }
        field3491++;
        for (int var1 = -1; var1 < class134.field3151; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class65.field1441[var1];
            }
            class53 var3 = class106.field2421[var2];
            if (var3 != null) {
                class142.method1159(1, 128, var3);
            }
        }
    }
}
