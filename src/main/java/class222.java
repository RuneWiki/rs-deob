import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class222 extends class304 implements class106 {

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "Lnm;")
    public class304 field3370;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "Lwf;")
    public static class79 field3367 = new class79(80, -1);

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "Ldk;")
    public static class326 field3373 = new class326("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    public static int field3378 = 1;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "Lus;")
    public static class1 field3379 = new class1(66, 12);

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        field3371++;
        if (arg1 > -95) {
            field3378 = -3;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        field3375++;
        return arg0 > -40 ? false : false;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        field3377++;
        if (arg1 != -26920) {
            method1426(-119, -101, 120, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "(I)V")
    public static void method1424(int arg0) {
        field3373 = null;
        field3379 = null;
        field3367 = null;
        if (arg0 != 60) {
            field3380 = -68;
        }
    }

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "(I)I")
    public final int method323(int arg0) {
        if (arg0 != 0) {
            field3379 = null;
        }
        field3358++;
        return 0;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        field3354++;
        if (arg0 != 0) {
            field3367 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
    public static final int method1425(int arg0, int arg1, int arg2, int arg3) {
        field3368++;
        int var4 = arg3 / arg2;
        int var5 = arg3 & arg2 - 1;
        int var6 = arg0 / arg2;
        if (arg1 != 7563) {
            method1424(29);
        }
        int var7 = arg0 & arg2 - 1;
        int var8 = class367.method2257((byte) 10, var4, var6);
        int var9 = class367.method2257((byte) 10, var4 + 1, var6);
        int var10 = class367.method2257((byte) 10, var4, var6 + 1);
        int var11 = class367.method2257((byte) 10, var4 + 1, var6 + 1);
        int var12 = class269.method1651(var5, var8, 8192, var9, arg2);
        int var13 = class269.method1651(var5, var10, 8192, var11, arg2);
        return class269.method1651(var7, var12, arg1 ^ 0x3D8B, var13, arg2);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        if (arg0 == 12181) {
            field3363++;
            return 0;
        } else {
            return -20;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIB)Lbj;")
    public static final class146 method1426(int arg0, int arg1, int arg2, byte arg3) {
        field3357++;
        class88 var4 = class330.field4786[arg2][arg1][arg0];
        if (var4 == null) {
            return null;
        } else if (arg3 == -71) {
            class146 var5 = null;
            int var6 = -1;
            for (class93 var7 = var4.field1068; var7 != null; var7 = var7.field1178) {
                class304 var8 = var7.field1177;
                if (var8 instanceof class146) {
                    class146 var9 = (class146) var8;
                    int var10 = (var9.method918(false) - 1) * 64 + 60;
                    int var11 = var9.field4331 - var10 >> 7;
                    int var12 = var9.field4317 - var10 >> 7;
                    int var13 = var9.field4331 + var10 >> 7;
                    int var14 = var9.field4317 + var10 >> 7;
                    if (var11 <= arg1 && var12 <= arg0 && var13 >= arg1 && arg0 <= var14) {
                        int var15 = (var14 + 1 - arg0) * (var13 + 1 - arg1);
                        if (var6 < var15) {
                            var6 = var15;
                            var5 = var9;
                        }
                    }
                }
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        if (arg0 != 31249) {
            field3376 = -37;
        }
        field3360++;
        return 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BII)I")
    public static final int method1427(byte arg0, int arg1, int arg2) {
        int var3 = 102 / ((-arg0 - 48) / 59);
        field3366++;
        return arg2 == 1 || arg2 == 3 ? class492.field6938[arg1 & 0x3] : class334.field4848[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        if (arg0 >= -105) {
            return true;
        } else {
            field3364++;
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 != -1) {
            field3376 = 30;
        }
        field3359++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        field3355++;
        if (arg0 > -126) {
            field3379 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        field3356++;
        int var8 = -77 % ((arg4 - 20) / 38);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIIIIIIILnm;)V")
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class304 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class126.method795((byte) 51, arg1, arg0));
        this.field3370 = arg10;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        field3372++;
        if (arg0 < 13) {
            method1426(-124, -91, -20, (byte) 50);
        }
        return 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg1 <= 16) {
            return false;
        } else {
            field3362++;
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        if (arg1 <= 70) {
            return null;
        } else {
            field3374++;
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 > 56) {
            field3369++;
        }
    }
}
