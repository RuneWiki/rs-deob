import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class351 {

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "Z")
    public static boolean field4800 = true;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field4801;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mq", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field4802;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIII)V")
    public static final void method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class133.field1934 = arg5;
        class477.field6983 = arg3;
        class330.field4501 = arg2;
        class485.field7106 = arg4;
        class412.field6044 = arg1;
        field4796++;
        if (class330.field4501 >= 100) {
            int var6 = class412.field6044 * 128 + 64;
            int var7 = class133.field1934 * 128 + 64;
            int var8 = class186.method1118(var6, var7, 12840, class400.field5571) - class477.field6983;
            int var9 = var6 - class132.field1901;
            int var10 = var8 - class526.field7729;
            int var11 = var7 - class310.field4240;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class476.field6958 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class208.field2951 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class476.field6958 < 1024) {
                class476.field6958 = 1024;
            }
            class250.field3483 = 0;
            if (class476.field6958 > 3072) {
                class476.field6958 = 3072;
            }
        }
        if (arg0 == 6760) {
            class128.field1742 = 2;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1941(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4798++;
        int var8 = arg6 - arg2;
        int var9 = arg2 + arg7;
        for (int var10 = arg7; var10 < var9; var10++) {
            class419.method2511(class225.field3174[var10], arg3, arg4, arg5, 88);
        }
        int var11 = arg2 + arg3;
        if (arg1 >= -83) {
            return;
        }
        for (int var12 = arg6; var12 > var8; var12--) {
            class419.method2511(class225.field3174[var12], arg3, arg4, arg5, 90);
        }
        int var13 = arg5 - arg2;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class225.field3174[var14];
            class419.method2511(var15, arg3, arg4, var11, -32);
            class419.method2511(var15, var11, arg0, var13, -109);
            class419.method2511(var15, var13, arg4, arg5, -47);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public static final void method1942(int arg0) {
        try {
            if (arg0 != 0) {
                field4795 = 31;
            }
            Method var1 = (field4802 == null ? (field4802 = method1945("java.lang.Runtime")) : field4802).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class38.field520 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field4801++;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4797++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg6 - arg0;
        int var12 = arg3 - arg0;
        int var13 = arg6 * arg6;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 + arg5) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class225.field3174[arg2];
        class419.method2511(var39, arg4 - arg6, arg7, arg4 - var11, arg5 + -16);
        class419.method2511(var39, arg4 - var11, arg1, arg4 + var11, 93);
        class419.method2511(var39, arg4 + var11, arg7, arg4 + arg6, -71);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg4 + var8;
            int var44 = arg4 - var8;
            if (var40) {
                int var45 = arg4 + var10;
                int var46 = arg4 - var10;
                class419.method2511(class225.field3174[var41], var44, arg7, var46, -119);
                class419.method2511(class225.field3174[var41], var46, arg1, var45, arg5 - 126);
                class419.method2511(class225.field3174[var41], var45, arg7, var43, 105);
                class419.method2511(class225.field3174[var42], var44, arg7, var46, 77);
                class419.method2511(class225.field3174[var42], var46, arg1, var45, -78);
                class419.method2511(class225.field3174[var42], var45, arg7, var43, 89);
            } else {
                class419.method2511(class225.field3174[var41], var44, arg7, var43, 78);
                class419.method2511(class225.field3174[var42], var44, arg7, var43, arg5 + 122);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z[Ljava/lang/Object;[I)V")
    public static final void method1944(boolean arg0, Object[] arg1, int[] arg2) {
        class254.method1492(arg2, arg1, 0, 63, arg2.length - 1);
        if (arg0) {
            method1943(71, 112, -9, -92, -65, -59, 59, -82);
        }
        field4799++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1945(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
