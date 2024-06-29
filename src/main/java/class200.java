import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class200 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3146 = 0;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field3153 = 2;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field3157 = 1;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "F")
    public static float field3156;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILob;)I", line = 21)
    public static final int method1451(int arg0, int arg1, class292 arg2) {
        field3148++;
        if (!client.method1786(arg2).method342(arg0, 1) && arg2.field4452 == null) {
            return -1;
        } else {
            if (arg1 != 3852) {
                field3146 = -16;
            }
            return arg2.field4528 == null || arg0 >= arg2.field4528.length ? -1 : arg2.field4528[arg0];
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZIIII)V", line = 40)
    public static final void method1452(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3154++;
        int var6 = 0;
        int var7 = arg4 * arg4;
        int var8 = arg4;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        if (arg1) {
            method1454((Object[]) null, -54, 22, (int[]) null, 68);
        }
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var9 + var11;
        int var14 = var9 << 2;
        int var15 = var7 << 2;
        int var16 = ((var6 << 1) + 3) * var11;
        int var17 = ((arg4 << 1) - 3) * var10;
        int var18 = var7 - (var12 - 1) * var10;
        if (class188.field2995 <= arg0 && arg0 <= class195.field3108) {
            int var19 = class308.method2129(arg5 + arg3, class116.field1888, class319.field4965, 1252946087);
            int var20 = class308.method2129(arg5 - arg3, class116.field1888, class319.field4965, 1252946087);
            class86.method614(arg2, -24891, var19, var20, class102.field1729[arg0]);
        }
        int var21 = (arg4 - 1) * var14;
        int var22 = (var6 + 1) * var15;
        while (var8 > 0) {
            var8--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var16;
                    var18 += var22;
                    var16 += var15;
                    var22 += var15;
                }
            }
            if (var18 < 0) {
                var6++;
                var18 += var22;
                var13 += var16;
                var22 += var15;
                var16 += var15;
            }
            int var23 = arg0 - var8;
            var13 += -var21;
            var18 += -var17;
            var21 -= var14;
            int var24 = arg0 + var8;
            if (var24 >= class188.field2995 && class195.field3108 >= var23) {
                int var25 = class308.method2129(arg5 + var6, class116.field1888, class319.field4965, 1252946087);
                int var26 = class308.method2129(arg5 - var6, class116.field1888, class319.field4965, 1252946087);
                if (class188.field2995 <= var23) {
                    class86.method614(arg2, -24891, var25, var26, class102.field1729[var23]);
                }
                if (var24 <= class195.field3108) {
                    class86.method614(arg2, -24891, var25, var26, class102.field1729[var24]);
                }
            }
            var17 -= var14;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 142)
    public static final void method1453(String arg0, byte arg1) {
        System.out.println("Error: " + class220.method1589("%0a", 123, arg0, "\n"));
        field3152++;
        int var2 = -23 / ((62 - arg1) / 44);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 272)
    public class200() {
        new class43();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([Ljava/lang/Object;II[II)V", line = 164)
    public static final void method1454(Object[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if ((var9 & 0x1) + var7 > arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var8;
            method1454(arg0, var6 - 1, 107, arg3, arg4);
            method1454(arg0, arg1, 108, arg3, var6 + 1);
        }
        field3151++;
        if (arg2 < 2) {
            method1457(-15);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V", line = 222)
    public static final void method1455(boolean arg0, int arg1) {
        field3155++;
        if (arg0) {
            field3146 = 41;
        }
        class219.field3511.method1828(arg1, (byte) -128);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIII)V", line = 235)
    public static final void method1456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3150++;
        if (class213.method1543(25641, arg1)) {
            class213.method1544(class207.field3269[arg1], -1, arg4, arg0, arg2, arg3, -1, arg5, arg7, arg8);
            if (arg6 != 9385) {
                field3157 = 51;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class30.field502[var9] = true;
            }
        } else {
            class30.field502[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 288)
    public static final void method1457(int arg0) {
        field3147++;
        for (class162 var1 = (class162) class289.field4411.method1490(arg0 + 200); var1 != null; var1 = (class162) class289.field4411.method1487((byte) 117)) {
            class85 var2 = var1.field2539;
            if (class41.field734 != var2.field1273 || var2.field1275) {
                var1.method1701(-104);
            } else if (var2.field1271 <= class205.field3252) {
                var2.method611((byte) -111, class122.field1952);
                if (var2.field1275) {
                    var1.method1701(arg0 - 122);
                } else {
                    class293.method2063(var2.field1273, var2.field1270, var2.field1262, var2.field1263, 60, var2, 0, -1L, false);
                }
            }
        }
        if (arg0 != 0) {
            field3157 = 119;
        }
    }
}
