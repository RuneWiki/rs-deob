import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class87 {

    @OriginalMember(owner = "client!an", name = "c", descriptor = "J")
    public static long field1485 = 0L;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "S")
    public static short field1497 = 205;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Ljl;")
    public static class332 field1490 = new class332(16);

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "J")
    public long field1496;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Lhd;")
    public class161 field1483;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Lhd;")
    public class161 field1488;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "Lhd;")
    public class161 field1494;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "[Lml;")
    public static class17[] field1487;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method697(boolean arg0) {
        class166.field2647++;
        if (!arg0) {
            method698((byte) 30);
        }
        field1498++;
        class36.field520.method2228(2, 16547);
        for (class259 var1 = (class259) class226.field3723.method1265(41); var1 != null; var1 = (class259) class226.field3723.method1277((byte) -122)) {
            if (var1.field4356 == 0) {
                class237.method1815(true, var1, (byte) 57);
            }
        }
        if (class187.field3005 != null) {
            class205.method1568(class187.field3005, (byte) 126);
            class187.field3005 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 50)
    public static void method698(byte arg0) {
        if (arg0 >= -40) {
            method698((byte) -95);
        }
        field1487 = null;
        field1490 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIIIII)V", line = 66)
    public static final void method699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg3 && arg7 == arg8 && arg4 == arg5 && arg0 == arg6) {
            class164.method1270(arg9, (byte) 110, arg4, arg1, arg8, arg6);
        } else {
            int var10 = arg1 * 3;
            int var11 = arg1;
            int var12 = arg8;
            int var13 = arg8 * 3;
            int var14 = arg5 * 3;
            int var15 = arg7 * 3;
            int var16 = arg3 * 3;
            int var17 = arg4 + var16 - arg1 - var14;
            int var18 = arg0 * 3;
            int var19 = arg6 + var15 - (arg8 + var18);
            int var20 = var10 + var14 - var16 - var16;
            int var21 = var18 + var13 - (var15 + var15);
            int var22 = var16 - var10;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var21 * var25;
                int var27 = var20 * var25;
                int var28 = var24 * var25 >> 12;
                int var29 = var22 * var24;
                int var30 = var19 * var28;
                int var31 = var17 * var28;
                int var32 = var23 * var24;
                int var33 = (var26 + var32 + var30 >> 12) + arg8;
                int var34 = (var27 + var29 + var31 >> 12) + arg1;
                class164.method1270(arg9, (byte) 62, var34, var11, var12, var33);
                var12 = var33;
                var11 = var34;
            }
        }
        int var35 = 75 % ((arg2 + 11) / 36);
        field1492++;
    }
}
