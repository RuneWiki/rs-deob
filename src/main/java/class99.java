import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class99 {

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "J")
    public long field1464 = 0L;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1449 = "Loading title screen - ";

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1450 = "Loaded fonts";

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field1452 = 0;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
    public static boolean field1461 = false;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lwg;")
    public class178 field1458;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Lwg;")
    public class178 field1466;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Llc;")
    public static class86 field1454;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method756(byte arg0) {
        int var1 = 10 / ((arg0 - 28) / 40);
        class226.field3630.method1558(-99);
        field1460++;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public static void method757(byte arg0) {
        field1450 = null;
        if (arg0 <= 71) {
            method757((byte) 28);
        }
        field1454 = null;
        field1449 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lce;")
    public static final class223 method758(int arg0) {
        field1451++;
        class161.field2637 = arg0;
        return class256.method1810((byte) -103);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
    public static final int method759(int arg0, int arg1) {
        field1455++;
        if (arg1 != 255) {
            field1454 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg4 && arg1 == arg2 && arg0 == arg5 && arg6 == arg7) {
            class156.method1154(arg2, arg4, -1347847572, arg6, arg9, arg5);
        } else {
            int var10 = arg4;
            int var11 = arg2;
            int var12 = arg2 * 3;
            int var13 = arg4 * 3;
            int var14 = arg3 * 3;
            int var15 = arg1 * 3;
            int var16 = arg0 * 3;
            int var17 = arg7 * 3;
            int var18 = arg5 + var14 - var16 - arg4;
            int var19 = arg6 + var15 - var17 - arg2;
            int var20 = var16 + var13 - var14 - var14;
            int var21 = var14 - var13;
            int var22 = var17 + var12 - var15 - var15;
            int var23 = var15 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var23 * var24;
                int var29 = var20 * var25;
                int var30 = var18 * var26;
                int var31 = var21 * var24;
                int var32 = var22 * var25;
                int var33 = (var30 + var31 + var29 >> 12) + arg4;
                int var34 = arg2 + (var28 + var32 + var27 >> 12);
                class156.method1154(var11, var10, -1347847572, var34, arg9, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg8 >= 92) {
            field1456++;
        }
    }
}
