import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class300 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Ljd;")
    public static class408 field3891 = new class408(13, 0, 1, 0);

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lqa;JI)V")
    public static final void method1799(class129 arg0, long arg1, int arg2) {
        field3893++;
        class368.field4732 = class77.field983;
        if (arg2 != -21523) {
            field3891 = null;
        }
        class189.field2483 = 0;
        class77.field983 = 0;
        long var4 = class173.method1134(true);
        for (class330 var6 = (class330) class287.field3663.method2122(0); var6 != null; var6 = (class330) class287.field3663.method2129(arg2 + 21407)) {
            if (var6.method1967(arg0, arg1)) {
                class189.field2483++;
            }
        }
        if (class307.field3955 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class287.field3663.method2127(arg2 ^ 0xFFFFABED) + ", running: " + class189.field2483 + ". Particles: " + class77.field983 + ". Time taken: " + (class173.method1134(true) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static void method1800(boolean arg0) {
        field3891 = null;
        if (arg0) {
            method1802(-51, 5, 70, null, -49, -116, 46);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Z")
    public static final boolean method1801(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class118.field1648; var3++) {
            class504 var4 = class193.field2499[var3];
            if (var4.field7402 == 1) {
                int var5 = var4.field7416 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field7411 * var5 >> 8) + var4.field7413;
                    int var7 = (var4.field7417 * var5 >> 8) + var4.field7421;
                    int var8 = (var4.field7408 * var5 >> 8) + var4.field7418;
                    int var9 = (var4.field7409 * var5 >> 8) + var4.field7404;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field7402 == 2) {
                int var10 = arg0 - var4.field7416;
                if (var10 > 0) {
                    int var11 = (var4.field7411 * var10 >> 8) + var4.field7413;
                    int var12 = (var4.field7417 * var10 >> 8) + var4.field7421;
                    int var13 = (var4.field7408 * var10 >> 8) + var4.field7418;
                    int var14 = (var4.field7409 * var10 >> 8) + var4.field7404;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field7402 == 3) {
                int var15 = var4.field7413 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field7415 * var15 >> 8) + var4.field7416;
                    int var17 = (var4.field7412 * var15 >> 8) + var4.field7405;
                    int var18 = (var4.field7408 * var15 >> 8) + var4.field7418;
                    int var19 = (var4.field7409 * var15 >> 8) + var4.field7404;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field7402 == 4) {
                int var20 = arg2 - var4.field7413;
                if (var20 > 0) {
                    int var21 = (var4.field7415 * var20 >> 8) + var4.field7416;
                    int var22 = (var4.field7412 * var20 >> 8) + var4.field7405;
                    int var23 = (var4.field7408 * var20 >> 8) + var4.field7418;
                    int var24 = (var4.field7409 * var20 >> 8) + var4.field7404;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field7402 == 5) {
                int var25 = arg1 - var4.field7418;
                if (var25 > 0) {
                    int var26 = (var4.field7415 * var25 >> 8) + var4.field7416;
                    int var27 = (var4.field7412 * var25 >> 8) + var4.field7405;
                    int var28 = (var4.field7411 * var25 >> 8) + var4.field7413;
                    int var29 = (var4.field7417 * var25 >> 8) + var4.field7421;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method1802(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field3892++;
        int var7 = arg5 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg4 + arg6 - 1) / arg6);
        int var10 = -((arg6 + arg5 - 1) / arg6);
        if (arg1 != -4718) {
            field3891 = null;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg0] == 0) {
                    return true;
                }
                arg0 += arg6;
            }
            int var13 = arg0 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg2 + var13;
        }
        return false;
    }
}
