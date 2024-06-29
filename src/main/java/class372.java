import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class372 extends class95 {

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field5045;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "[S")
    public static short[] field5046 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Z")
    public static boolean field5053;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)Z", line = 4)
    public final boolean method532(int arg0) {
        field5050++;
        if (arg0 != 0) {
            method2199(-70, 9);
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 18)
    public final Object method531(byte arg0) {
        field5048++;
        if (arg0 != 26) {
            method2200(-103);
        }
        return this.field5045;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lfr;Ljava/lang/Object;I)V", line = 30)
    public class372(class284 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5045 = arg1;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)Z", line = 41)
    public static final boolean method2199(int arg0, int arg1) {
        field5052++;
        if (class260.field3494[arg1]) {
            return true;
        } else if (class186.field2420.method2145(arg1, 103)) {
            int var2 = class186.field2420.method2136(-61, arg1);
            if (var2 == 0) {
                class260.field3494[arg1] = true;
                return true;
            }
            if (class339.field4491[arg1] == null) {
                class339.field4491[arg1] = new class450[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class339.field4491[arg1][var3] == null) {
                    byte[] var5 = class186.field2420.method2130(arg1, var3, -111);
                    if (var5 != null) {
                        class450 var6 = class339.field4491[arg1][var3] = new class450();
                        var6.field6558 = (arg1 << 16) + var3;
                        if (var5[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var6.method2790(new class396(var5), 1);
                    }
                }
            }
            int var4 = -61 / ((18 - arg0) / 36);
            class260.field3494[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V", line = 103)
    public static void method2200(int arg0) {
        field5046 = null;
        if (arg0 != -21568) {
            field5051 = -53;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(FIFFILnk;II[BFIIFI)V", line = 113)
    public static final void method2201(float arg0, int arg1, float arg2, float arg3, int arg4, class505 arg5, int arg6, int arg7, byte[] arg8, float arg9, int arg10, int arg11, float arg12, int arg13) {
        field5049++;
        int var14 = arg4 * arg6;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg13; var16++) {
            int var19 = arg1;
            arg5.method1(arg6, arg4, 0, (byte) -105, arg9 / (float) arg7, arg7, arg12 * 127.0F, var15, arg0 / (float) arg4, arg11, arg2 / (float) arg6);
            arg12 = arg3 * arg12;
            for (int var20 = 0; var20 < var14; var20++) {
                arg8[var19] = (byte) ((int) ((float) arg8[var19] + var15[var20]));
                var19++;
            }
            arg0 *= 2.0F;
            arg2 *= 2.0F;
            arg9 *= 2.0F;
        }
        int var17 = arg1;
        int var18 = 0;
        if (arg10 != 2) {
            field5053 = false;
        }
        while (var18 < var14) {
            arg8[var17] = (byte) (arg8[var17] + 127);
            var17++;
            var18++;
        }
    }
}
