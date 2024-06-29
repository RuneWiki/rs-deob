import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class312 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lnea;")
    public static class664 field4616 = null;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[Z")
    public static boolean[] field4620 = new boolean[100];

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field4621 = 0;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)Z", line = 14)
    public static final boolean method1978(boolean arg0, int arg1) {
        field4615++;
        if (class518.field7302[arg1]) {
            return true;
        } else if (class261.field3971.method2982((byte) 95, arg1)) {
            int var2 = class261.field3971.method2988(75, arg1);
            if (var2 == 0) {
                class518.field7302[arg1] = true;
                return true;
            }
            if (class181.field2558[arg1] == null) {
                class181.field2558[arg1] = new class49[var2];
            }
            if (arg0) {
                method1979((byte) -50);
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class181.field2558[arg1][var3] == null) {
                    byte[] var4 = class261.field3971.method3007(arg1, var3, 5);
                    if (var4 != null) {
                        class49 var5 = class181.field2558[arg1][var3] = new class49();
                        var5.field977 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method564(new class695(var4), true);
                    }
                }
            }
            class518.field7302[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 78)
    public static void method1979(byte arg0) {
        field4616 = null;
        field4620 = null;
        if (arg0 >= -117) {
            method1978(true, 102);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([Lrga;II)V", line = 92)
    public static final void method1980(class215[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class215 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field3026;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field3026 < (var7 & 0x1) + var6) {
                class215 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1980(arg0, arg1, var4 - 1);
        method1980(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IFIFI[FIIFFI)V")
    public abstract void method1789(int arg0, float arg1, int arg2, float arg3, int arg4, float[] arg5, int arg6, int arg7, float arg8, float arg9, int arg10);
}
