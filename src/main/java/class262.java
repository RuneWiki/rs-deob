import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class262 {

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "Lcea;")
    public static class180 field3380 = new class180("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field3381 = 1407;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 3)
    public static void method1466(int arg0) {
        field3380 = null;
        if (arg0 != 1) {
            field3381 = -97;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIII)Z", line = 13)
    public static final boolean method1467(int arg0, int arg1, int arg2, int arg3) {
        if (!class544.method3186(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class362.field4756;
        int var5 = arg2 << class362.field4756;
        int var6 = class128.field1574[arg0].method855(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class362.field4756 - 7);
        int var8 = var6 - (0xE6 << class362.field4756 - 7);
        int var9 = var6 - (0xEE << class362.field4756 - 7);
        if (arg3 == 1) {
            if (var4 > class103.field1263) {
                if (!class497.method2868(var4, var6, var5)) {
                    return false;
                }
                if (!class497.method2868(var4, var6, class410.field5342 + var5)) {
                    return false;
                }
                if (!class497.method2868(var4, var6, class79.field929 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class497.method2868(var4, var7, var5)) {
                    return false;
                }
                if (!class497.method2868(var4, var7, class410.field5342 + var5)) {
                    return false;
                }
                if (!class497.method2868(var4, var7, class79.field929 + var5)) {
                    return false;
                }
            }
            if (!class497.method2868(var4, var8, var5)) {
                return false;
            } else if (class497.method2868(var4, var8, class410.field5342 + var5)) {
                return class497.method2868(var4, var8, class79.field929 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class76.field894) {
                if (!class497.method2868(var4, var6, class79.field929 + var5)) {
                    return false;
                }
                if (!class497.method2868(class410.field5342 + var4, var6, class79.field929 + var5)) {
                    return false;
                }
                if (!class497.method2868(class79.field929 + var4, var6, class79.field929 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class497.method2868(var4, var7, class79.field929 + var5)) {
                    return false;
                }
                if (!class497.method2868(class410.field5342 + var4, var7, class79.field929 + var5)) {
                    return false;
                }
                if (!class497.method2868(class79.field929 + var4, var7, class79.field929 + var5)) {
                    return false;
                }
            }
            if (!class497.method2868(var4, var8, class79.field929 + var5)) {
                return false;
            } else if (class497.method2868(class410.field5342 + var4, var8, class79.field929 + var5)) {
                return class497.method2868(class79.field929 + var4, var8, class79.field929 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class103.field1263) {
                if (!class497.method2868(class79.field929 + var4, var6, var5)) {
                    return false;
                }
                if (!class497.method2868(class79.field929 + var4, var6, class410.field5342 + var5)) {
                    return false;
                }
                if (!class497.method2868(class79.field929 + var4, var6, class79.field929 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class497.method2868(class79.field929 + var4, var7, var5)) {
                    return false;
                }
                if (!class497.method2868(class79.field929 + var4, var7, class410.field5342 + var5)) {
                    return false;
                }
                if (!class497.method2868(class79.field929 + var4, var7, class79.field929 + var5)) {
                    return false;
                }
            }
            if (!class497.method2868(class79.field929 + var4, var8, var5)) {
                return false;
            } else if (class497.method2868(class79.field929 + var4, var8, class410.field5342 + var5)) {
                return class497.method2868(class79.field929 + var4, var8, class79.field929 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class76.field894) {
                if (!class497.method2868(var4, var6, var5)) {
                    return false;
                }
                if (!class497.method2868(class410.field5342 + var4, var6, var5)) {
                    return false;
                }
                if (!class497.method2868(class79.field929 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class497.method2868(var4, var7, var5)) {
                    return false;
                }
                if (!class497.method2868(class410.field5342 + var4, var7, var5)) {
                    return false;
                }
                if (!class497.method2868(class79.field929 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class497.method2868(var4, var8, var5)) {
                return false;
            } else if (class497.method2868(class410.field5342 + var4, var8, var5)) {
                return class497.method2868(class79.field929 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class497.method2868(class410.field5342 + var4, var9, class410.field5342 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class497.method2868(var4, var8, class79.field929 + var5);
        } else if (arg3 == 32) {
            return class497.method2868(class79.field929 + var4, var8, class79.field929 + var5);
        } else if (arg3 == 64) {
            return class497.method2868(class79.field929 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class497.method2868(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([Ljava/lang/Object;II[II)V", line = 231)
    public static final void method1468(Object[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if ((var7 + (var10 & var9)) > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method1468(arg0, Integer.MIN_VALUE, var6 - 1, arg3, arg4);
            method1468(arg0, Integer.MIN_VALUE, arg2, arg3, var6 + 1);
        }
        field3382++;
        if (arg1 != Integer.MIN_VALUE) {
            method1466(15);
        }
    }
}
