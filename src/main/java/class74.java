import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class74 extends class4 {

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "Luv;")
    public static class3 field1018 = new class3(64, 3);

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "Z")
    public static boolean field1019 = false;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lqa;IIIII)V")
    public static final void method432(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -7790) {
            method433(28);
        }
        field1017++;
        arg0.method977(arg1, arg3, arg1 + arg2, arg3 - -arg4);
        arg0.method974(-16777216, 1, arg4, arg1, arg2, arg3);
        if (class345.field4777 < 100) {
            return;
        }
        float var6 = (float) class614.field8851 / (float) class614.field8856;
        int var7 = arg2;
        int var8 = arg4;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg2 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg2 - var7) / 2 + arg1;
        int var10 = (arg4 - var8) / 2 + arg3;
        if (class447.field6219 == null || class447.field6219.method637() != arg2 || arg4 != class447.field6219.method630()) {
            class614.method3511(class614.field8850, class614.field8851 + class614.field8848, class614.field8856 + class614.field8850, class614.field8848, var9, var10, var9 + var7, var8 + var10);
            class614.method3509(arg0);
            class447.field6219 = arg0.method969(var9, var10, var7, var8, false);
        }
        class447.field6219.method632(var9, var10);
        int var11 = class248.field3120 * var7 / class614.field8856;
        int var12 = class280.field3671 * var8 / class614.field8851;
        int var13 = class86.field1162 * var7 / class614.field8856 + var9;
        int var14 = var10 + var8 - class183.field2338 * var8 / class614.field8851 - var12;
        int var15 = -1996554240;
        if (class532.field7433 == class26.field453) {
            var15 = -1996488705;
        }
        arg0.method997(var13, var14, var11, var12, var15, 1);
        arg0.method995(var13, var14, var11, var12, var15, 0);
        if (class592.field8548 <= 0) {
            return;
        }
        int var16;
        if (class535.field7468 > 50) {
            var16 = 500 - (class535.field7468 * 5);
        } else {
            var16 = class535.field7468 * 5;
        }
        for (class625 var17 = (class625) class614.field8834.method3188((byte) -100); var17 != null; var17 = (class625) class614.field8834.method3182((byte) -32)) {
            class297 var18 = class614.field8823.method1544(36, var17.field9044);
            if (class195.method1256(true, var18)) {
                if (class35.field537 == var17.field9044) {
                    int var21 = var17.field9038 * var7 / class614.field8856 + var9;
                    int var22 = (class614.field8851 - var17.field9039) * var8 / class614.field8851 + var10;
                    arg0.method974(var16 << 24 | 0xFFFF00, 1, 4, var21 - 2, 4, var22 - 2);
                } else if (class145.field1888 != -1 && class145.field1888 == var18.field3859) {
                    int var19 = var17.field9038 * var7 / class614.field8856 + var9;
                    int var20 = (class614.field8851 - var17.field9039) * var8 / class614.field8851 + var10;
                    arg0.method974(var16 << 24 | 0xFFFF00, 1, 4, var19 - 2, 4, var20 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "(I)V")
    public static void method433(int arg0) {
        if (arg0 != 4) {
            method435((byte) -91, -118, 107, -78, 11, -20, -19, -67, -118, -77);
        }
        field1018 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        if (arg0 != 10) {
            method432(null, -73, -58, -28, 52, -121);
        }
        field1016++;
        return class66.field881;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
    public static final void method434(byte arg0) {
        class342.field4758.method373(arg0 - 158);
        field1014++;
        int var1 = class342.field4758.method377(8, 8);
        if (var1 < class551.field7652) {
            for (int var2 = var1; var2 < class551.field7652; var2++) {
                class60.field832[class435.field5921++] = class286.field3739[var2];
            }
        }
        if (class551.field7652 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class551.field7652 = 0;
        int var3 = 0;
        if (arg0 != 81) {
            return;
        }
        while (var1 > var3) {
            int var4 = class286.field3739[var3];
            class585 var5 = ((class480) class131.field1619.method3476((long) var4, (byte) 28)).field6729;
            int var6 = class342.field4758.method377(arg0 ^ 0x59, 1);
            if (var6 == 0) {
                class286.field3739[class551.field7652++] = var4;
                var5.field372 = class7.field61;
            } else {
                int var7 = class342.field4758.method377(8, 2);
                if (var7 == 0) {
                    class286.field3739[class551.field7652++] = var4;
                    var5.field372 = class7.field61;
                    class214.field2749[class387.field5383++] = var4;
                } else if (var7 == 1) {
                    class286.field3739[class551.field7652++] = var4;
                    var5.field372 = class7.field61;
                    int var8 = class342.field4758.method377(8, 3);
                    var5.method3377(var8, 1, 12967);
                    int var9 = class342.field4758.method377(8, 1);
                    if (var9 == 1) {
                        class214.field2749[class387.field5383++] = var4;
                    }
                } else if (var7 == 2) {
                    class286.field3739[class551.field7652++] = var4;
                    var5.field372 = class7.field61;
                    if (class342.field4758.method377(arg0 ^ 0x59, 1) == 1) {
                        int var10 = class342.field4758.method377(8, 3);
                        var5.method3377(var10, 2, 12967);
                        int var11 = class342.field4758.method377(8, 3);
                        var5.method3377(var11, 2, 12967);
                    } else {
                        int var12 = class342.field4758.method377(8, 3);
                        var5.method3377(var12, 0, arg0 ^ 0x32F6);
                    }
                    int var13 = class342.field4758.method377(8, 1);
                    if (var13 == 1) {
                        class214.field2749[class387.field5383++] = var4;
                    }
                } else if (var7 == 3) {
                    class60.field832[class435.field5921++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method435(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1013++;
        if (arg6 == arg9 && arg1 == arg4 && arg3 == arg8 && arg2 == arg5) {
            class56.method307(arg9, arg1, (byte) -62, arg2, arg8, arg7);
        } else {
            int var10 = arg9;
            int var11 = arg1;
            int var12 = arg9 * 3;
            int var13 = arg1 * 3;
            int var14 = arg6 * 3;
            int var15 = arg4 * 3;
            int var16 = arg3 * 3;
            int var17 = arg5 * 3;
            int var18 = arg8 + var14 - var16 - arg9;
            int var19 = var15 + arg2 - arg1 - var17;
            int var20 = var16 - (var14 - (var12 - var14));
            int var21 = var13 + var17 - var15 - var15;
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
                int var33 = (var29 + var31 + var27 >> 12) + arg9;
                int var34 = (var28 + var30 + var32 >> 12) + arg1;
                class56.method307(var10, var11, (byte) 53, var34, var33, arg7);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg0 != 124) {
            method432(null, -64, -89, -19, 31, 76);
        }
    }
}
