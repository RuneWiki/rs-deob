import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class98 extends class445 {

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "[Lfda;")
    public static class323[] field1369 = new class323[8];

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "Lkg;")
    public static class275 field1365 = new class275(79, 8);

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public static int field1368;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ps", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1370;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)Z")
    public static final boolean method783(boolean arg0, int arg1) {
        ++field1364;
        if (arg0) {
            field1365 = null;
        }
        return ~arg1 == -1 || arg1 == 1 || ~arg1 == -3;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method784(boolean arg0, Object arg1, int arg2) {
        ++field1366;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class302.method1802(var3, -19451) : var3;
        } else if (arg1 instanceof class287) {
            class287 var4 = (class287) arg1;
            return var4.method1709((byte) 127);
        } else {
            if (arg2 != 3544) {
                method785((byte) -69, true);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BZ)V")
    public static final void method785(byte arg0, boolean arg1) {
        if (class12.field143 != null) {
            class12.field143.method2307(-1884375310);
            class12.field143 = null;
        }
        ++field1362;
        class391.field4978 = 0;
        class660.method3714(0);
        class253.method1546();
        for (int var2 = 0; var2 < 4; ++var2) {
            class526.field7350[var2].method2253(true);
        }
        class67.method621(64, false);
        System.gc();
        class522.method3032(4, 2);
        class87.field1208 = false;
        class309.field4068 = -1;
        class638.method3575(-118);
        class94.method765(true, 99);
        class547.field7642 = 0;
        class365.field4710 = 0;
        class447.field5936 = 0;
        class21.field384 = 0;
        class409.field5196 = 0;
        class332.field4232 = 0;
        for (int var3 = 0; ~field1369.length < ~var3; ++var3) {
            field1369[var3] = null;
        }
        class609.method3422(false);
        for (int var4 = 0; ~var4 > -2049; ++var4) {
            class5.field49[var4] = null;
        }
        class646.field8947 = 0;
        class207.field2745.method1161(false);
        class54.field752 = 0;
        class342.field4322.method1161(false);
        class726.method4050((byte) 26);
        class332.field4238 = 0;
        class516.field7236.method2284(207);
        class431.method2465(-1);
        class682.method3839(21674);
        class643.field8911 = 0L;
        class176.field2459 = null;
        int var5 = -107 / ((-53 - arg0) / 63);
        if (!arg1) {
            class571.method3275(27461, 3);
            try {
                class568.method3263("loggedout", class64.field900, false);
            } catch (Throwable var6) {
            }
        } else {
            class571.method3275(27461, 12);
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V")
    public static void method786(int arg0) {
        field1365 = null;
        field1369 = null;
        if (arg0 <= 41) {
            field1365 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lnd;Lnd;Lufa;)V")
    public class98(class547 arg0, class547 arg1, class682 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIBI)V")
    public final void method787(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field1368;
        if (arg3 == -109) {
            int var6 = super.field5915.method142();
            int var7 = ((class682) super.field1627).field9510 * class287.method1708(255) / 10 % var6;
            super.field5915.method2766(arg4 + var7 + -var6, arg1, -var7 + arg2 + var6, arg0);
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V")
    public static final void method788(byte arg0) {
        ++field1363;
        if (arg0 <= 54) {
            method789(15, (byte[]) null, true, (byte[]) null, -96, -120, 65, -5, 109);
        }
        try {
            Method var1 = (field1370 != null ? field1370 : (field1370 = method790("java.lang.Runtime"))).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class701.field9761 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[BZ[BIIIII)V")
    public static final void method789(int arg0, byte[] arg1, boolean arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1367;
        int var9 = -(arg4 >> 2);
        int var10 = -(3 & arg4);
        for (int var11 = -arg7; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg0++;
                arg3[var10001] += arg1[arg6++];
                int var14 = arg0++;
                arg3[var14] += arg1[arg6++];
                int var15 = arg0++;
                arg3[var15] += arg1[arg6++];
                int var16 = arg0++;
                arg3[var16] += arg1[arg6++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg0++;
                arg3[var10001] += arg1[arg6++];
            }
            arg0 += arg8;
            arg6 += arg5;
        }
        if (arg2) {
            method784(true, (Object) null, 62);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method790(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
