import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Lwia;")
    public static class791 field70;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V", line = 12)
    public static void method48(boolean arg0) {
        if (arg0) {
            field70 = null;
        }
        field70 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIZIIIIII)V", line = 33)
    public static final void method49(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3) {
            return;
        }
        field71++;
        if (arg5 == arg9 && arg0 == arg1 && arg2 == arg8 && arg4 == arg7) {
            class418.method2539(arg6, arg5, (byte) 48, arg2, arg7, arg0);
            return;
        }
        int var10 = arg5;
        int var11 = arg0;
        int var12 = arg5 * 3;
        int var13 = arg0 * 3;
        int var14 = arg9 * 3;
        int var15 = arg1 * 3;
        int var16 = arg8 * 3;
        int var17 = arg4 * 3;
        int var18 = arg2 + var14 - var16 - arg5;
        int var19 = arg7 - var17 - (-var15 - -arg0);
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var17 - var15 - (var15 - var13);
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var29 + var31 + var27 >> 12) + arg5;
            int var34 = (var28 + var30 + var32 >> 12) + arg0;
            class418.method2539(arg6, var10, (byte) 108, var33, var34, var11);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)I", line = 109)
    public static final int method50(int arg0) {
        field68++;
        if (arg0 != -3569) {
            return 100;
        }
        if (class265.field3871 == null) {
            if (!class626.field8777 && class694.field9692 != null) {
                return class694.field9692.field10334;
            }
            int var1 = class152.field2154.method2646(9);
            int var2 = class152.field2154.method2650((byte) -71);
            if (class378.field5223) {
                if (class109.field1608 < var1 && class54.field679 + class109.field1608 > var1) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class310.field4426; var4++) {
                        if (class463.field6530) {
                            int var8 = var4 * 16 + class407.field5549 + 33;
                            if (var2 > (var8 - 13) && var2 <= var8 + 3) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = var4 * 16 + class407.field5549 + 31;
                            if (var2 > var9 - 13 && var2 <= var9 + 3) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class774 var6 = new class774(class371.field5135);
                        for (class753 var7 = (class753) var6.method4266((byte) -128); var7 != null; var7 = (class753) var6.method4263(arg0 ^ 0x6A3)) {
                            if (var5++ == var3) {
                                return ((class746) var7.field10411.field923.field1600).field10334;
                            }
                        }
                    }
                } else if (class280.field4071 != null && var1 > class55.field705 && var1 < class55.field705 + class545.field7847) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class280.field4071.field10409; var11++) {
                        if (class463.field6530) {
                            int var16 = var11 * 16 + class724.field10026 + 33;
                            if (var16 - 13 < var2 && (var16 + 3) >= var2) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = var11 * 16 + class724.field10026 + 31;
                            if (var2 > var15 - 13 && (var15 + 3) >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class774 var13 = new class774(class280.field4071.field10411);
                        for (class746 var14 = (class746) var13.method4266((byte) -127); var14 != null; var14 = (class746) var13.method4263(-2900)) {
                            if (var10 == var12++) {
                                return var14.field10334;
                            }
                        }
                    }
                }
            } else if (class109.field1608 < var1 && var1 < (class109.field1608 + class54.field679)) {
                int var17 = -1;
                for (int var18 = 0; var18 < class618.field8644; var18++) {
                    if (class463.field6530) {
                        int var23 = class407.field5549 + ((class618.field8644 + -1 + -var18) * 16) + 33;
                        if ((var23 - 13) < var2 && var23 + 3 >= var2) {
                            var17 = var18;
                        }
                    } else {
                        int var22 = (class618.field8644 - var18 - 1) * 16 + class407.field5549 + 31;
                        if (var2 > var22 - 13 && var22 + 3 >= var2) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class226 var20 = new class226(class239.field3583);
                    for (class746 var21 = (class746) var20.method1543(-256); var21 != null; var21 = (class746) var20.method1544(false)) {
                        if (var17 == (var19++)) {
                            return var21.field10334;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 306)
    public static final int method51(int arg0, Random arg1, int arg2) {
        field69++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        }
        int var3 = -66 % ((60 - arg0) / 40);
        if (class262.method1704(arg2, 3)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        }
        int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
        int var5;
        do {
            var5 = arg1.nextInt();
        } while (var5 >= var4);
        return class37.method290(var5, arg2, -1365732769);
    }
}
