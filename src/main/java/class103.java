import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class103 extends class483 implements Runnable {

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public int field1311 = -1;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Z")
    private boolean field1308 = true;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lsi;")
    private class362 field1309;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "Z")
    public static boolean field1317 = false;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Lwf;")
    public static class79 field1307 = new class79(65, 3);

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "Z")
    public static boolean field1318 = false;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
    public static final String method577(boolean arg0, int arg1, int arg2, int arg3) {
        field1314++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            if (arg1 != -1) {
                return null;
            }
            int var5 = arg2 / arg3;
            while (var5 != 0) {
                var5 /= arg3;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg3;
                int var9 = var8 - (arg2 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public final void method578(int arg0) {
        field1310++;
        (new Thread(this, "a")).start();
        if (arg0 != 0) {
            method579((byte) 3, 16, -21, -55, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIII[I)V")
    public static final void method579(byte arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg0 != 115) {
            method577(false, -57, 103, -49);
        }
        field1316++;
        arg1--;
        int var8 = arg2 - 1;
        int var5 = var8 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg4[var6] = arg3;
            int var7 = var6 + 1;
            arg4[var7] = arg3;
            int var9 = var7 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg1 = var13 + 1;
            arg4[arg1] = arg3;
        }
        while (arg1 < var8) {
            arg1++;
            arg4[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
    public final void method580(int arg0) {
        if (arg0 != 1) {
            this.field1311 = 6;
        }
        this.field1308 = false;
        field1315++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1313++;
        if (class168.field2449 <= arg7 && class94.field1209 >= arg7 && arg1 >= class168.field2449 && arg1 <= class94.field1209 && arg2 >= class168.field2449 && arg2 <= class94.field1209 && arg4 >= class168.field2449 && arg4 <= class94.field1209 && arg9 >= class345.field5011 && class485.field6827 >= arg9 && arg6 >= class345.field5011 && class485.field6827 >= arg6 && class345.field5011 <= arg8 && class485.field6827 >= arg8 && arg3 >= class345.field5011 && arg3 <= class485.field6827) {
            class168.method1036(arg1, (byte) -1, arg7, arg9, arg3, arg5, arg6, arg8, arg4, arg2);
        } else {
            class332.method2097(arg7, (byte) 127, arg6, arg4, arg1, arg2, arg8, arg9, arg5, arg3);
        }
        if (arg0 != 3) {
            method582(74);
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public static void method582(int arg0) {
        field1307 = null;
        if (arg0 != 65) {
            field1317 = false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1308) {
            this.field1309.method2239(this, (byte) 80);
        }
        field1312++;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lsi;)V")
    public class103(class362 arg0) {
        this.field1309 = arg0;
    }
}
