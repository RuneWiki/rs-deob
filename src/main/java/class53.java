import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class53 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Z")
    public static boolean field756 = false;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lsh;")
    public static class472 field755 = new class472(90, 12);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILes;)Z", line = 4)
    public static final boolean method383(int arg0, class441 arg1) {
        if (arg0 > -1) {
            method384(117);
        }
        field759++;
        return class212.field3183 == arg1 || class318.field4777 == arg1 || class371.field5587 == arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 17)
    public static final void method384(int arg0) {
        if (arg0 != 22717) {
            return;
        }
        field754++;
        if (class316.field4752 == 10 || class316.field4752 == 28) {
            class43.method317(class200.field3027 >> 10, 5000, class68.field920 >> 10, 1);
        } else {
            int var1 = class472.field6622.field4675[0] >> 3;
            int var2 = class472.field6622.field4674[0] >> 3;
            if (var1 >= 0 && (class379.field5642 >> 3) > var1 && var2 >= 0 && (class456.field6477 >> 3) > var2) {
                class43.method317(var2, 5000, var1, 1);
            } else {
                class43.method317(class456.field6477 >> 4, 0, class379.field5642 >> 4, 1);
            }
        }
        class130.method901((byte) -74);
        class155.method1059(-23097);
        class58.method454((byte) 110);
        class154.method1053(4096);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 47)
    public static void method385(int arg0) {
        if (arg0 >= -83) {
            field756 = true;
        }
        field755 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILje;Ltq;IIILus;II)V", line = 66)
    public static final void method386(int arg0, class178 arg1, class63 arg2, int arg3, int arg4, int arg5, class401 arg6, int arg7, int arg8) {
        field757++;
        if (arg4 > -65) {
            field756 = true;
        }
        class94 var9 = class492.field6915.method1111(arg8, -13516);
        if (var9 == null || !var9.field1306 || !var9.method727(-1, class315.field4736)) {
            return;
        }
        if (var9.field1316 != null) {
            int[] var10 = new int[var9.field1316.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class469.field6596 == 4) {
                    var13 = (int) class384.field5682 & 0x3FFF;
                } else {
                    var13 = (int) class384.field5682 + class347.field5291 & 0x3FFF;
                }
                int var14 = class172.field2450[var13];
                int var15 = class172.field2456[var13];
                if (class469.field6596 != 4) {
                    var14 = var14 * 256 / (class358.field5437 + 256);
                    var15 = var15 * 256 / (class358.field5437 + 256);
                }
                var10[var11 * 2] = ((var9.field1316[var11 * 2] * 4 + arg5) * var15 + (var9.field1316[var11 * 2 + 1] * 4 + arg7) * var14 >> 15) + arg1.field2595 / 2 + arg3;
                var10[var11 * 2 + 1] = arg1.field2589 / 2 + arg0 - ((var9.field1316[var11 * 2 - -1] * 4 + arg7) * var15 + -((arg5 - -(var9.field1316[var11 * 2] * 4)) * var14) >> 15);
            }
            class405.method2423(arg2, var10, var9.field1298, arg1.field2608, arg1.field2602);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg2.method526(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field1290, 1, arg6, arg3, arg0);
            }
            arg2.method526(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field1290, 1, arg6, arg3, arg0);
        }
        class319 var16 = null;
        if (var9.field1293 != -1) {
            var16 = var9.method726(false, arg2, (byte) -114);
            if (var16 != null) {
                class109.method801(arg1, arg5, var16, arg6, arg0, arg3, arg7, 1);
            }
        }
        if (var9.field1333 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method796();
        }
        class229 var18 = class100.field1430;
        class1 var19 = class29.field401;
        if (var9.field1291 == 1) {
            var18 = class310.field4690;
            var19 = class267.field3960;
        }
        if (var9.field1291 == 2) {
            var19 = class131.field1828;
            var18 = class462.field6513;
        }
        class485.method2840(arg3, arg5, var9.field1333, var18, arg1, var19, arg7, arg6, 75, var9.field1335, arg0, var17);
        return;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V", line = 168)
    public static final void method387(int arg0, int arg1, int arg2) {
        if (arg1 < 126) {
            return;
        }
        field758++;
        class484 var3 = class401.field5864[arg0][arg2];
        if (var3 != null) {
            class389.field5725 = var3.field6789;
            class389.field5723 = var3.field6783;
            class422.field6046 = var3.field6799;
        }
        class155.method1059(-23097);
    }
}
