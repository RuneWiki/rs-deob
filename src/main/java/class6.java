import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class6 {

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lqb;")
    public static class117 field67 = new class117(32);

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field69 = "Please wait...";

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field71 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
    public static int[] field72 = new int[] { 10, 0, 0, 15, 0, 0, 0, 0, 0, 12, 5, 0, 8, -1, 0, 0, -2, 0, 2, 8, 0, 8, 0, 0, -1, 6, 0, 0, -1, 0, 0, -2, 12, 2, 0, 0, 7, 0, 0, 0, 8, 0, -1, 0, -2, 0, 0, 0, 0, 0, 11, 3, 0, 0, 3, 0, 0, 6, 0, 0, 2, 6, 0, 7, 0, 0, 0, 0, 0, -2, 0, 0, -1, 6, 0, 0, 0, 0, 0, 0, 8, 0, 10, 0, 0, 0, 0, -2, 3, 0, 0, 4, 0, 6, 0, 0, 12, 0, 1, 0, 0, 14, -2, 0, 0, 0, -2, 3, 0, 0, 10, 0, 0, 0, -1, 1, 0, 5, 0, 2, 6, 5, 6, 0, 2, 12, -1, 15, 0, 0, -2, 0, 0, -1, 0, 4, 0, 0, 6, 0, 0, 0, 0, 0, -1, 0, 6, 0, 0, 7, 0, 0, -1, 2, 0, 0, 0, -1, 0, 3, 0, 0, -2, 0, 4, 0, 8, 0, 28, 0, 6, 0, 0, 0, 0, 0, -2, 0, 1, 0, 0, 0, 3, -1, -2, 10, 0, 0, 6, 20, 0, 0, 0, 8, 0, 0, 0, 0, 3, 1, 0, 0, 0, 9, 0, 17, 0, 0, -1, 0, 0, -2, 0, -2, 3, 0, 0, 0, 0, -1, 14, 0, 2, 4, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 2, 1, -1, 5, 3, 0, 0, 8, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field73 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "F")
    public static float field77;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lnk;")
    public static class16 field74;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "[[[Lwk;")
    public static class196[][][] field76;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I", line = 7)
    public static final int method36(int arg0) {
        field64++;
        try {
            if (class179.field2687 == 0) {
                if (class9.method57(arg0 - 14134) - 5000L < class43.field489) {
                    return 0;
                }
                class24.field282 = class156.field2451.method166((byte) -110, class185.field2792, class218.field3281);
                class266.field4192 = class9.method57(arg0 - 14134);
                class179.field2687 = 1;
            }
            if (class9.method57(arg0 ^ 0xFFFFC8CA) > class266.field4192 + 30000L) {
                return class128.method876(1000, true);
            }
            if (class179.field2687 == arg0) {
                if (class24.field282.field2419 == 2) {
                    return class128.method876(1001, true);
                }
                if (class24.field282.field2419 != 1) {
                    return -1;
                }
                int var1 = 0;
                class147.field2352 = new class220((Socket) class24.field282.field2421, class156.field2451);
                if (class115.field1602) {
                    var1 = class353.field5628;
                }
                class24.field282 = null;
                class328.field5282.field2295 = 0;
                class328.field5282.method1055(23, arg0 ^ 0x75);
                class328.field5282.method1052(var1, false);
                class147.field2352.method1532(class328.field5282.field2295, 0, 39, class328.field5282.field2260);
                if (class192.field2881 != null) {
                    class192.field2881.method1412(false);
                }
                if (class273.field4330 != null) {
                    class273.field4330.method1412(false);
                }
                int var2 = class147.field2352.method1528(arg0 ^ 0xFFFF8BD2);
                if (class192.field2881 != null) {
                    class192.field2881.method1412(false);
                }
                if (class273.field4330 != null) {
                    class273.field4330.method1412(false);
                }
                if (var2 != 0) {
                    return class128.method876(var2, true);
                }
                class179.field2687 = 2;
            }
            if (class179.field2687 == 2) {
                if (class147.field2352.method1531((byte) -42) < 2) {
                    return -1;
                }
                class45.field518 = class147.field2352.method1528(-29741);
                class45.field518 <<= 0x8;
                class45.field518 += class147.field2352.method1528(arg0 - 29742);
                class179.field2687 = 3;
                class292.field4601 = 0;
                class265.field4188 = new byte[class45.field518];
            }
            if (class179.field2687 != 3) {
                return -1;
            }
            int var3 = class147.field2352.method1531((byte) 123);
            if (var3 < 1) {
                return -1;
            }
            if ((class45.field518 - class292.field4601) < var3) {
                var3 = class45.field518 - class292.field4601;
            }
            class147.field2352.method1536(class292.field4601, var3, (byte) -57, class265.field4188);
            class292.field4601 += var3;
            if (class292.field4601 < class45.field518) {
                return -1;
            } else if (class301.method2125(-24, class265.field4188)) {
                class324.field5211 = new class122[class234.field3568];
                int var4 = 0;
                for (int var5 = class311.field4883; var5 <= class5.field60; var5++) {
                    class122 var6 = class73.method452(-3301, var5);
                    if (var6 != null) {
                        class324.field5211[var4++] = var6;
                    }
                }
                class147.field2352.method1527(121);
                class147.field2352 = null;
                class186.field2807 = 0;
                class179.field2687 = 0;
                class265.field4188 = null;
                class43.field489 = class9.method57(arg0 - 14134);
                return 0;
            } else {
                return class128.method876(1002, true);
            }
        } catch (IOException var8) {
            return class128.method876(1003, true);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 136)
    public static void method37(boolean arg0) {
        field69 = null;
        field76 = (class196[][][]) null;
        field74 = null;
        field72 = null;
        field67 = null;
        field73 = null;
        if (arg0) {
            field77 = 1.1579944F;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V", line = 152)
    public static final void method38(int arg0, int arg1) {
        class253.method1796(-116);
        class112.method727(-1308766868);
        field65++;
        int var2 = class244.method1727(-20258, arg1).field898;
        if (arg0 > -71) {
            method39(-105, -118);
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class255.field4041[arg1];
        if (var2 == 9) {
            class322.field5006 = var3;
        }
        if (var2 == 6) {
            class156.field2452 = var3;
        }
        if (var2 == 5) {
            class52.field602 = var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)Lhb;", line = 193)
    public static final class42 method39(int arg0, int arg1) {
        field63++;
        class42 var2 = (class42) class352.field5612.method380(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 112 / ((34 - arg0) / 56);
        byte[] var4 = class101.field1368.method100(33, arg1, (byte) -107);
        class42 var5 = new class42();
        if (var4 != null) {
            var5.method260(new class143(var4), 71, arg1);
        }
        class352.field5612.method377((long) arg1, var5, -1);
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII)V", line = 218)
    public static final void method40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        class61.method376(arg4, (byte) 124);
        field66++;
        int var8 = arg4 - arg1;
        int var9 = -arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = var8;
        int var11 = arg4;
        int var12 = -1;
        int var13 = -var8;
        if (arg2 >= class244.field3844 && arg2 <= class2.field22) {
            int[] var14 = class347.field5501[arg2];
            int var15 = class112.method728(arg0 - arg4, class337.field5389, class344.field5460, -115);
            int var16 = class112.method728(arg0 + arg4, class337.field5389, class344.field5460, -74);
            int var17 = class112.method728(arg0 - var8, class337.field5389, class344.field5460, -32);
            int var18 = class112.method728(arg0 + var8, class337.field5389, class344.field5460, arg6 - 72);
            class278.method1986(var15, var14, arg5, var17, (byte) -79);
            class278.method1986(var17, var14, arg3, var18, (byte) 95);
            class278.method1986(var18, var14, arg5, var16, (byte) -84);
        }
        int var19 = arg6;
        while (var7 < var11) {
            var19 += 2;
            var12 += 2;
            var9 += var12;
            var13 += var19;
            if (var13 >= 0 && var10 >= 1) {
                var10--;
                class180.field2694[var10] = var7;
                var13 -= var10 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var11--;
                int var20 = arg2 - var11;
                var9 -= var11 << 1;
                int var21 = arg2 + var11;
                if (class244.field3844 <= var21 && class2.field22 >= var20) {
                    if (var11 >= var8) {
                        int var22 = class112.method728(arg0 + var7, class337.field5389, class344.field5460, -64);
                        int var23 = class112.method728(arg0 - var7, class337.field5389, class344.field5460, -111);
                        if (var21 <= class2.field22) {
                            class278.method1986(var23, class347.field5501[var21], arg5, var22, (byte) -65);
                        }
                        if (class244.field3844 <= var20) {
                            class278.method1986(var23, class347.field5501[var20], arg5, var22, (byte) 104);
                        }
                    } else {
                        int var24 = class180.field2694[var11];
                        int var25 = class112.method728(arg0 + var7, class337.field5389, class344.field5460, -30);
                        int var26 = class112.method728(arg0 - var7, class337.field5389, class344.field5460, -113);
                        int var27 = class112.method728(arg0 + var24, class337.field5389, class344.field5460, -31);
                        int var28 = class112.method728(arg0 - var24, class337.field5389, class344.field5460, -29);
                        if (var21 <= class2.field22) {
                            int[] var29 = class347.field5501[var21];
                            class278.method1986(var26, var29, arg5, var28, (byte) 61);
                            class278.method1986(var28, var29, arg3, var27, (byte) 27);
                            class278.method1986(var27, var29, arg5, var25, (byte) 108);
                        }
                        if (class244.field3844 <= var20) {
                            int[] var30 = class347.field5501[var20];
                            class278.method1986(var26, var30, arg5, var28, (byte) 47);
                            class278.method1986(var28, var30, arg3, var27, (byte) -69);
                            class278.method1986(var27, var30, arg5, var25, (byte) -88);
                        }
                    }
                }
            }
            int var31 = arg2 + var7;
            int var32 = arg2 - var7;
            if (class244.field3844 <= var31 && class2.field22 >= var32) {
                int var33 = arg0 + var11;
                int var34 = arg0 - var11;
                if (class337.field5389 <= var33 && class344.field5460 >= var34) {
                    int var35 = class112.method728(var33, class337.field5389, class344.field5460, -56);
                    int var36 = class112.method728(var34, class337.field5389, class344.field5460, arg6 ^ 0x19);
                    if (var8 <= var7) {
                        if (class2.field22 >= var31) {
                            class278.method1986(var36, class347.field5501[var31], arg5, var35, (byte) -82);
                        }
                        if (var32 >= class244.field3844) {
                            class278.method1986(var36, class347.field5501[var32], arg5, var35, (byte) 68);
                        }
                    } else {
                        int var37 = var10 >= var7 ? var10 : class180.field2694[var7];
                        int var38 = class112.method728(arg0 + var37, class337.field5389, class344.field5460, -52);
                        int var39 = class112.method728(arg0 - var37, class337.field5389, class344.field5460, -87);
                        if (var31 <= class2.field22) {
                            int[] var40 = class347.field5501[var31];
                            class278.method1986(var36, var40, arg5, var39, (byte) 119);
                            class278.method1986(var39, var40, arg3, var38, (byte) 42);
                            class278.method1986(var38, var40, arg5, var35, (byte) -69);
                        }
                        if (class244.field3844 <= var32) {
                            int[] var41 = class347.field5501[var32];
                            class278.method1986(var36, var41, arg5, var39, (byte) -66);
                            class278.method1986(var39, var41, arg3, var38, (byte) -68);
                            class278.method1986(var38, var41, arg5, var35, (byte) 37);
                        }
                    }
                }
            }
        }
    }
}
