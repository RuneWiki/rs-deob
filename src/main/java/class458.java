import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class458 {

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field6611 = -1;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "J")
    public static long field6609;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "[B")
    public byte[] field6608;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "[I")
    public static int[] field6612;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "[S")
    public short[] field6610;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "[S")
    public short[] field6613;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "[S")
    public short[] field6614;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Lvj;")
    public static final class439 method2792(int arg0) {
        field6607++;
        try {
            return new class324();
        } catch (Throwable var2) {
            try {
                return (class439) Class.forName("jea").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                if (arg0 > -48) {
                    field6612 = null;
                }
                return new class378();
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
    public static void method2793(byte arg0) {
        if (arg0 != -49) {
            method2796(-25, 63, -39, 67, 89, 2);
        }
        field6612 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Leq;II)Lkr;")
    public static final class743 method2794(class209 arg0, int arg1, int arg2) {
        if (arg2 >= -72) {
            method2796(-127, -9, 99, -1, 90, 127);
        }
        field6617++;
        class743 var3 = (class743) class545.field7692.method3054((byte) -124, (long) arg1);
        if (var3 == null) {
            if (class684.field9654) {
                var3 = class359.field5046.method637(class55.method496(arg0, arg1), true);
            } else {
                var3 = class532.method3131(arg0.method1478((byte) -72, arg1), (byte) -94);
            }
            class545.field7692.method3047(false, var3, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)V")
    public static final void method2795(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2794(null, 40, 2);
        }
        if (class77.field1455 != arg2) {
            class20.field261 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class20.field261[var3] = (var3 << 12) / arg2;
            }
            class439.field6131 = arg2 - 1;
            class77.field1455 = arg2;
            class416.field5843 = arg2 * 32;
        }
        field6616++;
        if (class694.field9758 == arg0) {
            return;
        }
        if (class77.field1455 == arg0) {
            class385.field5384 = class20.field261;
        } else {
            class385.field5384 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class385.field5384[var4] = (var4 << 12) / arg0;
            }
        }
        class694.field9758 = arg0;
        class77.field1453 = arg0 - 1;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIII)V")
    public static final void method2796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6618++;
        int var6 = arg0 - arg1;
        int var7 = arg3 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class422.method2579(true, arg5, arg0, arg1, arg2);
            }
        } else if (var6 == 0) {
            class454.method2780(arg5, arg1, (byte) -62, arg3, arg2);
        } else {
            if (~var7 > arg4) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                arg5 = arg1;
                int var10 = arg3;
                arg1 = var9;
                arg3 = arg0;
                arg0 = var10;
            }
            if (arg3 < arg5) {
                int var11 = arg5;
                int var12 = arg1;
                arg5 = arg3;
                arg1 = arg0;
                arg3 = var11;
                arg0 = var12;
            }
            int var13 = arg1;
            int var14 = arg3 - arg5;
            int var15 = arg0 - arg1;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg0 > arg1 ? 1 : -1;
            if (var8) {
                for (int var18 = arg5; var18 <= arg3; var18++) {
                    class329.field4651[var18][var13] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg3; var19++) {
                    var16 += var15;
                    class329.field4651[var13][var19] = arg2;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)Lgb;")
    public static final class212 method2797(int arg0) {
        if (arg0 >= -90) {
            return null;
        }
        field6615++;
        try {
            return (class212) Class.forName("wba").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
    public static final void method2798(boolean arg0) {
        if (!arg0) {
            field6609 = -32L;
        }
        if (class491.field7002 == null || class265.field3861 == null) {
            class265.field3861 = new int[256];
            class491.field7002 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class491.field7002[var1] = (int) (Math.sin(var2) * 4096.0D);
                class265.field3861[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field6606++;
    }
}
