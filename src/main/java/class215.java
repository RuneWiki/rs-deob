import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class215 extends class213 {

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Lob;")
    public static class141 field4103 = class175.method1195(40, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "[I")
    public static int[] field4105 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Lob;")
    public static class141 field4102 = class175.method1195(40, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "B")
    public byte field4098;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lob;")
    public class141 field4094;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Lob;")
    public class141 field4104;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    public static void method1400(int arg0) {
        field4102 = null;
        field4103 = null;
        if (arg0 != 3) {
            method1403(13, -69, 50, 66, 42, (byte) 112, 86, -95, -72, 75);
        }
        field4105 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIIII)V")
    public static final void method1401(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class92.field1852 == 1) {
            class177.field3506[class10.field208 / 100].method683(class97.field1921 - 8, class7.field98 + -8);
        }
        if (class92.field1852 == 2) {
            class177.field3506[class10.field208 / 100 + 4].method683(class97.field1921 - 8, class7.field98 + -8);
        }
        if (arg0 > -48) {
            method1405(-20, -17, 103, 59, 86, 75);
        }
        class19.method113(82);
        if (class116.field2233) {
            int var5 = arg4 + 512 - 5;
            int var6 = arg2 + 20;
            class125.field2409.method879(class220.method1422(new class141[] { class179.field3524, class78.method543((byte) 93, class40.field802) }, -3), var5, var6, 16776960, -1);
            Runtime var7 = Runtime.getRuntime();
            int var10 = var6 + 15;
            int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
            int var9 = 16776960;
            if (var8 > 32768 && class8.field128) {
                var9 = 16711680;
            }
            if (var8 > 65536 && !class8.field128) {
                var9 = 16711680;
            }
            class125.field2409.method879(class220.method1422(new class141[] { class210.field3995, class78.method543((byte) 93, var8), class59.field1151 }, -3), var5, var10, var9, -1);
            var6 = var10 + 15;
        }
        field4108++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method1402(int arg0, KeyEvent arg1) {
        field4107++;
        if (arg0 <= 109) {
            method1402(85, null);
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method1403(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 == arg9 && arg3 == arg6 && arg0 == arg1 && arg2 == arg8) {
            class210.method1372(arg4, arg3, arg8, (byte) 107, arg0, arg7);
        } else {
            int var10 = arg7;
            int var11 = arg7 * 3;
            int var12 = arg3 * 3;
            int var13 = arg3;
            int var14 = arg9 * 3;
            int var15 = arg6 * 3;
            int var16 = arg1 * 3;
            int var17 = arg2 * 3;
            int var18 = arg0 + var14 - var16 - arg7;
            int var19 = arg8 + var15 - arg3 - var17;
            int var20 = var17 + var12 - var15 - var15;
            int var21 = var16 + var11 - var14 - var14;
            int var22 = var14 - var11;
            int var23 = var15 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var22 * var24;
                int var31 = var21 * var25;
                int var32 = var23 * var24;
                int var33 = arg3 + (var28 + var29 + var32 >> 12);
                int var34 = (var27 + var31 + var30 >> 12) + arg7;
                class210.method1372(arg4, var13, var33, (byte) 107, var34, var10);
                var13 = var33;
                var10 = var34;
            }
        }
        if (arg5 <= 126) {
            field4103 = null;
        }
        field4100++;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public static final void method1404(int arg0) {
        field4101++;
        if (arg0 <= 91) {
            field4103 = null;
        }
        class8.field128 = true;
        class29.field565 = true;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIIII)V")
    public static final void method1405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class68.field1323 <= arg4 && class136.field2590 >= arg3 && arg1 >= class35.field698 && arg2 <= class130.field2470) {
            class78.method542(arg3, arg0, 94, arg1, arg4, arg2);
        } else {
            class213.method1389(255, arg2, arg4, arg0, arg1, arg3);
        }
        if (arg5 != 100) {
            method1404(-57);
        }
        field4097++;
    }
}
