import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class77 {

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
    public static int field1452 = 0;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!dha", name = "g", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!dha", name = "h", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!dha", name = "f", descriptor = "[I")
    public static int[] field1456;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V", line = 8)
    public static void method770(int arg0) {
        field1456 = null;
        if (arg0 > -19) {
            field1455 = -81;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIB)V", line = 19)
    public static final void method771(int arg0, int arg1, int arg2, byte arg3) {
        field1451++;
        class354 var4 = class501.method3012(arg2, 11, 2145997216);
        var4.method2222(-87);
        int var5 = 39 / ((arg3 + 79) / 40);
        var4.field4980 = arg1;
        var4.field4990 = arg0;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(II)V", line = 34)
    public static final void method772(int arg0, int arg1) {
        class595.field8697 = arg1;
        class683.field9617 = 2;
        field1458++;
        long var2 = 0L;
        if (class443.field6167 == null) {
            class552.method3231((byte) 109, 35);
            return;
        }
        class35 var4 = new class35(class311.method2016(class526.method3118(0, class443.field6167), 1));
        long var5 = var4.method246(19271);
        class552.field7730 = var4.method246(19271);
        class592.method3398(true, class198.method1389(var5, (byte) 82), "", (byte) 53);
        int var7 = -21 / ((arg0 + 10) / 62);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(III[IIIII)V", line = 70)
    public static final void method773(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field1457++;
        if (arg5 > 0 && !class278.method1826((byte) 122, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class278.method1826((byte) 118, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            int var8 = 0;
            int var9 = arg1 > arg5 ? arg5 : arg1;
            int var10 = arg5 >> 1;
            int var11 = arg1 >> 1;
            int[] var12 = arg3;
            int var13 = -124 / ((arg0 + 79) / 32);
            int[] var14 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var8, arg7, arg5, arg1, 0, arg6, arg2, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg5 + var16;
                int[] var18 = var14;
                for (int var19 = 0; var19 < var11; var19++) {
                    for (int var20 = 0; var20 < var10; var20++) {
                        int var21 = var12[var16++];
                        int var22 = var12[var17++];
                        int var23 = var12[var16++];
                        int var24 = var12[var17++];
                        int var25 = (var21 & 0xFFC634) >> 16;
                        int var26 = var21 & 0xFF;
                        int var27 = (var21 & 0xFF01) >> 8;
                        int var28 = var21 >> 24 & 0xFF;
                        int var29 = (var23 >> 24 & 0xFF) + var28;
                        int var30 = ((var23 & 0xFFD6B0) >> 16) + var25;
                        int var31 = ((var23 & 0xFF6A) >> 8) + var27;
                        int var32 = (var23 & 0xFF) + var26;
                        int var33 = (var22 & 0xFF) + var32;
                        int var34 = (var22 >> 8 & 0xFF) + var31;
                        int var35 = (var22 >> 24 & 0xFF) + var29;
                        int var36 = (var22 >> 16 & 0xFF) + var30;
                        int var37 = ((var24 & 0xFF5F) >> 8) + var34;
                        int var38 = (var24 & 0xFF) + var33;
                        int var39 = (var24 >> 16 & 0xFF) + var36;
                        int var40 = (var24 >> 24 & 0xFF) + var35;
                        var14[var15++] = class164.method1221(class164.method1221(class555.method3246(65280, var37 << 6), class164.method1221(class555.method3246(1020, var40) << 22, class555.method3246(1020, var39) << 14)), class555.method3246(var38, 1020) >> 2);
                    }
                    var16 += arg5;
                    var17 += arg5;
                }
                var14 = var12;
                var12 = var18;
                arg1 = var11;
                arg5 = var10;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I[[I)V", line = 179)
    public static final void method774(int arg0, int[][] arg1) {
        field1454++;
        if (arg0 >= -68) {
            field1452 = -63;
        }
        class329.field4651 = arg1;
    }
}
