import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class463 {

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[I")
    private int[] field6470;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field6465 = 0;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Ljk;")
    public static class585 field6469 = new class585(9, -1);

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Z")
    public static boolean field6471 = false;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "[S")
    private static short[] field6475 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[S")
    private static short[] field6472 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "[S")
    private static short[] field6476 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[S")
    private static short[] field6477 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[[S")
    public static short[][] field6473 = new short[][] { field6476, field6475, field6472, field6477 };

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIII)V")
    public static final void method2724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == 967) {
            field6466++;
            for (int var6 = arg3; var6 <= arg0; var6++) {
                class359.method2018(class678.field9722[var6], arg2, arg1 - 862, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    public final int method2725(int arg0, int arg1) {
        field6468++;
        if (arg1 <= 23) {
            field6473 = null;
        }
        int var3 = (this.field6470.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field6470[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field6470[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljn;B)V")
    public static final void method2726(class668 arg0, byte arg1) {
        class285.field3861 = 0;
        field6474++;
        class551.field8013 = 0;
        class24.field580 = new class363();
        class275.field3765 = new class572[1024];
        class558.field8082 = new class684[class502.field7014[class561.field8107] + 1];
        class306.field4068 = 0;
        class649.field9208 = 0;
        class72.method636(arg0, -11694);
        class12.method137(1, arg0);
        if (arg1 < 42) {
            field6476 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method2727(int arg0) {
        field6476 = null;
        if (arg0 != 17474) {
            field6469 = null;
        }
        field6472 = null;
        field6475 = null;
        field6469 = null;
        field6477 = null;
        field6473 = null;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "([I)V")
    public class463(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field6470 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field6470[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field6470[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field6470[var5 + var5] = arg0[var4];
            this.field6470[var5 + var5 + 1] = var4++;
        }
    }
}
