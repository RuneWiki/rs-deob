import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class154 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2539 = null;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[I")
    public static int[] field2542 = new int[4096];

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1141(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class62.field925 * arg0 + class114.field1651 * arg3 >> 16;
        int var6 = class62.field925 * arg3 - class114.field1651 * arg0 >> 16;
        int var7 = class86.field1251 * var6 + class265.field4298 * arg1 >> 16;
        int var8 = class86.field1251 * arg1 - class265.field4298 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class86.field1251 * var6 + class265.field4298 * arg2 >> 16;
        int var12 = class86.field1251 * arg2 - class265.field4298 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class126.field1857 && var13 < class126.field1857) {
            return false;
        } else if (var9 > class179.field2892 && var13 > class179.field2892) {
            return false;
        } else if (var10 < class260.field4253 && var14 < class260.field4253) {
            return false;
        } else {
            return var10 <= class123.field1800 || var14 <= class123.field1800;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method1142(int arg0) {
        field2542 = null;
        if (arg0 != 50) {
            field2539 = null;
        }
        field2539 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
    public static final void method1143(int arg0, int arg1, int arg2) {
        class82 var3 = class131.method945(arg2, 117);
        int var4 = var3.field1188;
        int var5 = var3.field1181;
        int var6 = var3.field1185;
        int var7 = class115.field1657[var6 - var5];
        if (arg0 < arg1 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        field2541++;
        class44.method334(var4, arg0 << var5 & var8 | ~var8 & class243.field3904[var4], (byte) -88);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 >= class272.field4374 && class211.field3386 >= arg1 && class207.field3328 <= arg6 && arg3 <= class228.field3657) {
            if (arg2 == 1) {
                class23.method171(arg4, arg0, (byte) 98, arg3, arg1, arg6);
            } else {
                class28.method199((byte) 82, arg6, arg4, arg0, arg1, arg2, arg3);
            }
        } else if (arg2 == 1) {
            class200.method1469(arg4, arg0, arg3, arg1, arg6, 1);
        } else {
            class166.method1225(-125, arg6, arg1, arg4, arg2, arg0, arg3);
        }
        field2538++;
        if (arg5 <= 115) {
            field2542 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)Lva;")
    public static final class35 method1145(byte arg0, int arg1) {
        class35 var2 = (class35) class168.field2703.method1553((long) arg1, (byte) -124);
        int var3 = 26 / ((arg0 + 53) / 40);
        field2545++;
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class125.field1827.method643(0, arg1, false);
        class35 var5 = new class35(var4);
        var5.method1267(class92.field1384, (int[]) null);
        class168.field2703.method1551(var5, 0, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg6 && arg0 == arg4 && arg5 == arg8 && arg3 == arg7) {
            class168.method1240(arg5, arg2, arg6, arg4, arg3, (byte) -56);
        } else {
            int var10 = arg4;
            int var11 = arg6;
            int var12 = arg6 * 3;
            int var13 = arg1 * 3;
            int var14 = arg4 * 3;
            int var15 = arg0 * 3;
            int var16 = arg8 * 3;
            int var17 = arg7 * 3;
            int var18 = var13 + arg5 - arg6 - var16;
            int var19 = arg3 + var15 - var17 - arg4;
            int var20 = var16 + var12 - var13 - var13;
            int var21 = var17 + var14 - var15 - var15;
            int var22 = var13 - var12;
            int var23 = var15 - var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var28 + var30 + var32 >> 12) + arg4;
                int var34 = (var27 + var31 + var29 >> 12) + arg6;
                class168.method1240(var34, arg2, var11, var10, var33, (byte) -56);
                var10 = var33;
                var11 = var34;
            }
        }
        field2544++;
        if (arg9 != 0) {
            method1142(-110);
        }
    }
}
