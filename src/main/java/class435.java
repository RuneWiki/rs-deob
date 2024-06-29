import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class class435 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "[I")
    public static int[] field6348 = new int[3];

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Z", line = 6)
    public static final boolean method2715(int arg0) {
        if (arg0 != 15194) {
            field6348 = null;
        }
        field6346++;
        return class446.field6457 == 0 ? class41.field465.method1376(99) : true;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 22)
    public static void method2716(byte arg0) {
        field6348 = null;
        if (arg0 != -105) {
            method2715(31);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "([BZI)V", line = 37)
    public static final void method2718(byte[] arg0, boolean arg1, int arg2) {
        if (class265.field3303 == null) {
            class265.field3303 = new class244(20000);
        }
        field6349++;
        if (arg2 != 4013) {
            method2716((byte) 44);
        }
        class265.field3303.method1430(arg0.length, (byte) 84, 0, arg0);
        if (!arg1) {
            return;
        }
        class262.method1573((byte) -89, class265.field3303.field2912);
        class476.field6778 = new class526[class267.field3327];
        int var3 = 0;
        for (int var4 = class647.field9257; var4 <= class85.field897; var4++) {
            class526 var5 = class710.method3969(var4, 0);
            if (var5 != null) {
                class476.field6778[var3++] = var5;
            }
        }
        class553.field7923 = false;
        class344.field4461 = class652.method3700(arg2 - 4014);
        class265.field3303 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lig;I)V", line = 82)
    public static final void method2719(class244 arg0, int arg1) {
        field6347++;
        byte[] var2 = new byte[arg1];
        if (class737.field10304 != null) {
            try {
                class737.field10304.method1583(0L, arg1 + 231);
                class737.field10304.method1586(arg1 ^ 0x77, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1430(24, (byte) 84, 0, var2);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IFFIIFI[FFII)V")
    public abstract void method2717(int arg0, float arg1, float arg2, int arg3, int arg4, float arg5, int arg6, float[] arg7, float arg8, int arg9, int arg10);
}
