import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class191 extends class132 {

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Lvd;")
    public static class222 field3513 = class212.method1357("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", 10731);

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field3518 = 0;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field3519 = 0;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public int field3520;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lba;")
    public class13 field3515;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Lba;")
    public class13 field3521;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Lvb;")
    public static class220 field3524;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lvd;")
    public class222 field3516;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Ld;")
    public static class33 field3509;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field3510;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Leh;")
    public static final class52 method1190(byte arg0, int arg1) {
        field3512++;
        class52 var2 = (class52) class201.field3680.method601((long) arg1, 43);
        if (arg0 != 18) {
            field3518 = -56;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1807.method33(arg0 ^ 0xFFFF8C42, 16, arg1);
        class52 var4 = new class52();
        if (var3 != null) {
            var4.method380(-92, new class109(var3));
        }
        class201.field3680.method593((long) arg1, var4, (byte) -12);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Z")
    public static final boolean method1191(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class39.field871; var3++) {
            class156 var4 = class55.field1041[var3];
            if (var4.field2979 == 1) {
                int var5 = var4.field2967 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2977 * var5 >> 8) + var4.field2984;
                    int var7 = (var4.field2968 * var5 >> 8) + var4.field2965;
                    int var8 = (var4.field2988 * var5 >> 8) + var4.field2985;
                    int var9 = (var4.field2990 * var5 >> 8) + var4.field2966;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2979 == 2) {
                int var10 = arg0 - var4.field2967;
                if (var10 > 0) {
                    int var11 = (var4.field2977 * var10 >> 8) + var4.field2984;
                    int var12 = (var4.field2968 * var10 >> 8) + var4.field2965;
                    int var13 = (var4.field2988 * var10 >> 8) + var4.field2985;
                    int var14 = (var4.field2990 * var10 >> 8) + var4.field2966;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2979 == 3) {
                int var15 = var4.field2984 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2989 * var15 >> 8) + var4.field2967;
                    int var17 = (var4.field2969 * var15 >> 8) + var4.field2971;
                    int var18 = (var4.field2988 * var15 >> 8) + var4.field2985;
                    int var19 = (var4.field2990 * var15 >> 8) + var4.field2966;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2979 == 4) {
                int var20 = arg2 - var4.field2984;
                if (var20 > 0) {
                    int var21 = (var4.field2989 * var20 >> 8) + var4.field2967;
                    int var22 = (var4.field2969 * var20 >> 8) + var4.field2971;
                    int var23 = (var4.field2988 * var20 >> 8) + var4.field2985;
                    int var24 = (var4.field2990 * var20 >> 8) + var4.field2966;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2979 == 5) {
                int var25 = arg1 - var4.field2985;
                if (var25 > 0) {
                    int var26 = (var4.field2989 * var25 >> 8) + var4.field2967;
                    int var27 = (var4.field2969 * var25 >> 8) + var4.field2971;
                    int var28 = (var4.field2977 * var25 >> 8) + var4.field2984;
                    int var29 = (var4.field2968 * var25 >> 8) + var4.field2965;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lab;Z)V")
    public static final void method1192(class3 arg0, boolean arg1) {
        field3511++;
        class97.field1807 = arg0;
        if (arg1) {
            method1193((byte) 96);
        }
        class92.field1735 = class97.field1807.method38(5, 16);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method1193(byte arg0) {
        field3513 = null;
        if (arg0 < -31) {
            field3509 = null;
            field3524 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
    public static final void method1194(int arg0, byte arg1) {
        field3525++;
        class208 var2 = (class208) class78.field1505.method1520((long) arg0, arg1 + 1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field3868.length; var3++) {
            var2.field3868[var3] = -1;
            var2.field3865[var3] = 0;
        }
        if (arg1 != 91) {
            field3509 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method1195(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 >= class112.field2107 && arg2 <= class127.field2448 && class112.field2107 <= arg4 && class127.field2448 >= arg4 && class112.field2107 <= arg6 && class127.field2448 >= arg6 && class112.field2107 <= arg5 && class127.field2448 >= arg5 && arg9 >= class129.field2514 && arg9 <= class230.field4322 && class129.field2514 <= arg7 && arg7 <= class230.field4322 && arg3 >= class129.field2514 && arg3 <= class230.field4322 && arg1 >= class129.field2514 && class230.field4322 >= arg1) {
            class20.method183(arg5, arg2, arg7, arg4, (byte) 102, arg3, arg1, arg8, arg6, arg9);
        } else {
            class211.method1344(10, arg2, arg8, arg3, arg5, arg6, arg9, arg1, arg4, arg7);
        }
        field3514++;
        if (arg0 <= 102) {
            field3518 = 14;
        }
    }
}
