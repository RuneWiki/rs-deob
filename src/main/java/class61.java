import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VMBJKBNJ")
public class class61 extends class55 {

    @OriginalMember(owner = "client!VMBJKBNJ", name = "j", descriptor = "Z")
    private static boolean field1491 = true;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "l", descriptor = "I")
    private static int field1493 = 12021;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "m", descriptor = "B")
    private static byte field1494 = -68;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "o", descriptor = "I")
    private static int field1496 = -39100;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "k", descriptor = "I")
    private static int field1492;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "r", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "s", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "t", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "u", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "v", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "w", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "x", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "y", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "z", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "n", descriptor = "Z")
    private static boolean field1495;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "p", descriptor = "Z")
    private static boolean field1497;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "A", descriptor = "Z")
    public static boolean field1508;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "q", descriptor = "[I")
    public static int[] field1498;

    @OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(III[I)V")
    public static void method542(int arg0, int arg1, int arg2, int[] arg3) {
        field1498 = arg3;
        field1499 = arg1;
        field1500 = arg0;
        method544(0, 0, arg1, 0, arg0);
        if (arg2 == -47390) {
            ;
        }
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(B)V")
    public static void method543(byte arg0) {
        field1503 = 0;
        if (arg0 != -87) {
            field1497 = !field1497;
        }
        field1501 = 0;
        field1504 = field1499;
        field1502 = field1500;
        field1505 = field1504 - 1;
        field1506 = field1504 / 2;
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIIII)V")
    public static void method544(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > field1499) {
            arg2 = field1499;
        }
        if (arg4 > field1500) {
            arg4 = field1500;
        }
        field1503 = arg3;
        field1501 = arg0;
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        field1504 = arg2;
        field1502 = arg4;
        field1505 = field1504 - 1;
        field1506 = field1504 / 2;
        field1507 = field1502 / 2;
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(I)V")
    public static void method545(int arg0) {
        int var1 = field1500 * field1499;
        if (arg0 != 2) {
            field1491 = !field1491;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            field1498[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIIIIZI)V")
    public static void method546(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 < field1503) {
            arg6 -= field1503 - arg3;
            arg3 = field1503;
        }
        if (arg0 < field1501) {
            arg2 -= field1501 - arg0;
            arg0 = field1501;
        }
        if (arg3 + arg6 > field1504) {
            arg6 = field1504 - arg3;
        }
        if (arg0 + arg2 > field1502) {
            arg2 = field1502 - arg0;
        }
        int var7 = 256 - arg1;
        int var8 = (arg4 >> 16 & 0xFF) * arg1;
        int var9 = (arg4 >> 8 & 0xFF) * arg1;
        int var10 = (arg4 & 0xFF) * arg1;
        if (arg5) {
            field1496 = -60;
        }
        int var11 = field1499 - arg6;
        int var12 = field1499 * arg0 + arg3;
        for (int var13 = 0; var13 < arg2; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = (field1498[var12] >> 16 & 0xFF) * var7;
                int var16 = (field1498[var12] >> 8 & 0xFF) * var7;
                int var17 = (field1498[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field1498[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIIIII)V")
    public static void method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < field1503) {
            arg0 -= field1503 - arg1;
            arg1 = field1503;
        }
        if (arg3 < field1501) {
            arg2 -= field1501 - arg3;
            arg3 = field1501;
        }
        if (arg0 + arg1 > field1504) {
            arg0 = field1504 - arg1;
        }
        if (arg2 + arg3 > field1502) {
            arg2 = field1502 - arg3;
        }
        int var6 = field1499 - arg0;
        int var7 = field1499 * arg3 + arg1;
        if (arg5 < 3 || arg5 > 3) {
            field1492 = -348;
        }
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg0; var9 < 0; var9++) {
                field1498[var7++] = arg4;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "b", descriptor = "(IIIIII)V")
    public static void method548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            field1497 = !field1497;
        }
        method550(arg2, 0, arg4, arg0, arg1);
        method550(arg2, 0, arg3 + arg4 - 1, arg0, arg1);
        method552(arg0, 12021, arg4, arg2, arg3);
        method552(arg0 + arg1 - 1, 12021, arg4, arg2, arg3);
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIIIIII)V")
    public static void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method551(arg2, arg1, 1, arg4, arg0, arg5);
        method551(arg2 + arg6 - 1, arg1, 1, arg4, arg0, arg5);
        if (arg3 != 4) {
            field1495 = !field1495;
        }
        if (arg6 >= 3) {
            method553(arg2 + 1, arg4, (byte) -29, arg6 - 2, arg5, arg0);
            method553(arg2 + 1, arg1 + arg4 - 1, (byte) -29, arg6 - 2, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "b", descriptor = "(IIIII)V")
    public static void method550(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < field1501 || arg2 >= field1502) {
            return;
        }
        if (arg3 < field1503) {
            arg4 -= field1503 - arg3;
            arg3 = field1503;
        }
        if (arg3 + arg4 > field1504) {
            arg4 = field1504 - arg3;
        }
        int var5 = field1499 * arg2 + arg3;
        if (arg1 != 0) {
            field1495 = !field1495;
        }
        for (int var6 = 0; var6 < arg4; var6++) {
            field1498[var5 + var6] = arg0;
        }
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "c", descriptor = "(IIIIII)V")
    public static void method551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1501 || arg0 >= field1502) {
            return;
        }
        if (arg3 < field1503) {
            arg1 -= field1503 - arg3;
            arg3 = field1503;
        }
        if (arg1 + arg3 > field1504) {
            arg1 = field1504 - arg3;
        }
        int var6 = 256 - arg4;
        int var7 = (arg5 >> 16 & 0xFF) * arg4;
        int var8 = (arg5 >> 8 & 0xFF) * arg4;
        int var9 = (arg5 & 0xFF) * arg4;
        int var10 = field1499 * arg0 + arg3;
        if (arg2 != 1) {
            return;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            int var12 = (field1498[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1498[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1498[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1498[var10++] = var15;
        }
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "c", descriptor = "(IIIII)V")
    public static void method552(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1503 || arg0 >= field1504) {
            return;
        }
        if (arg2 < field1501) {
            arg4 -= field1501 - arg2;
            arg2 = field1501;
        }
        if (arg2 + arg4 > field1502) {
            arg4 = field1502 - arg2;
        }
        int var5 = field1499 * arg2 + arg0;
        if (field1493 == arg1) {
            for (int var6 = 0; var6 < arg4; var6++) {
                field1498[field1499 * var6 + var5] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIBIII)V")
    public static void method553(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -29 || (arg1 < field1503 || arg1 >= field1504)) {
            return;
        }
        if (arg0 < field1501) {
            arg3 -= field1501 - arg0;
            arg0 = field1501;
        }
        if (arg0 + arg3 > field1502) {
            arg3 = field1502 - arg0;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1499 * arg0 + arg1;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field1498[var10] >> 16 & 0xFF) * var6;
            int var13 = (field1498[var10] >> 8 & 0xFF) * var6;
            int var14 = (field1498[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field1498[var10] = var15;
            var10 += field1499;
        }
    }
}
