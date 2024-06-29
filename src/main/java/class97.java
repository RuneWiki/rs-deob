import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class97 extends class217 {

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "[I")
    public static int[] field1437 = new int[14];

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field1446 = 0;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Llb;")
    public static class211 field1444;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(JI)V", line = 8)
    public static final void method768(long arg0, int arg1) {
        field1442++;
        if (arg0 <= 0L || arg1 < 35) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class227.method1616((byte) -112, arg0 - 1L);
            class227.method1616((byte) -112, 1L);
        } else {
            class227.method1616((byte) -112, arg0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lqb;IBIIIIII)V", line = 31)
    public static final void method769(class101 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg1 & 0x3;
        field1440++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg0.field1533;
            var11 = arg0.field1524;
        } else {
            var10 = arg0.field1524;
            var11 = arg0.field1533;
        }
        int var12;
        int var13;
        if (arg7 + var11 > 104) {
            var12 = arg7;
            var13 = arg7 + 1;
        } else {
            var12 = (var11 >> 1) + arg7;
            var13 = arg7 + (var11 + 1 >> 1);
        }
        int var14 = (arg8 << 7) + (var10 << 6);
        int var15;
        int var16;
        if ((arg8 + var10) > 104) {
            var15 = arg8 + 1;
            var16 = arg8;
        } else {
            var15 = (var10 + 1 >> 1) + arg8;
            var16 = (var10 >> 1) + arg8;
        }
        int var17 = (arg7 << 7) + (var11 << 6);
        int[][] var18 = class41.field612[arg3];
        int var19 = 0;
        if (arg2 != 96) {
            method768(-33L, -121);
        }
        int var20 = var18[var12][var16] + var18[var13][var16] + var18[var13][var15] + var18[var12][var15] >> 2;
        if (arg3 != 0) {
            int[][] var21 = class41.field612[0];
            var19 = var20 - (var21[var12][var16] + var21[var13][var15] + var21[var12][var15] + var21[var13][var16] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg3 < 3) {
            var22 = class41.field612[arg3 + 1];
        }
        class136 var23 = arg0.method792(var18, true, var20, (class70) null, var14, var22, var17, false, arg1, false, arg4);
        class247.method1719(var23.field2118, var17 - arg6, var19, var14 - arg5);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V", line = 116)
    public static final void method770(boolean arg0, int arg1) {
        client.method1774(-123);
        field1448++;
        if (class305.field4771 != 30 && class305.field4771 != 25) {
            return;
        }
        class132.field2085++;
        if (class132.field2085 < 50 && !arg0) {
            return;
        }
        class132.field2085 = 0;
        if (arg1 < 81) {
            field1446 = -107;
        }
        if (!class314.field4875 && class297.field4661 != null) {
            class310.field4834++;
            class159.field2372.method59(40, (byte) 73);
            try {
                class297.field4661.method920((byte) -76, class159.field2372.field437, 0, class159.field2372.field455);
                class159.field2372.field455 = 0;
            } catch (IOException var3) {
                class314.field4875 = true;
            }
        }
        client.method1774(-109);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 157)
    public static void method771(int arg0) {
        field1444 = null;
        if (arg0 != 1) {
            method769((class101) null, -68, (byte) 94, 124, 0, 27, -8, -84, -50);
        }
        field1437 = null;
    }
}
