import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class449 {

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "[I")
    public static int[] field6277 = new int[14];

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Loa;")
    public static class638 field6276;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lmh;IIIII)V")
    public static final void method2577(class577 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field7757 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field7752[var6] != null) {
                arg0.field7757++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field7757; var7++) {
            long var8 = class185.field2716[arg1][arg2][arg3];
            while (var8 != 0L) {
                class517 var14 = class324.field4793[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field7752[var7] == var14.field7053) {
                    continue label50;
                }
            }
            long var10 = class185.field2716[arg1][arg4][arg5];
            while (var10 != 0L) {
                class517 var13 = class324.field4793[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field7752[var7] == var13.field7053) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field7757 - 1; var12++) {
                arg0.field7752[var12] = arg0.field7752[var12 + 1];
            }
            arg0.field7757--;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZLkw;)I")
    public static final int method2578(boolean arg0, class225 arg1) {
        field6275++;
        class161 var2 = arg1.field3245;
        if (var2.field2409 != null) {
            var2 = var2.method1114(class195.field2888, 0);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0) {
            method2578(false, null);
        }
        int var3 = var2.field2449;
        class308 var4 = arg1.method2636((byte) 80);
        if (arg1.field6428) {
            var3 = var2.field2426;
        } else if (arg1.field6464 == var4.field4602 || arg1.field6464 == var4.field4586 || arg1.field6464 == var4.field4575 || arg1.field6464 == var4.field4565) {
            var3 = var2.field2445;
        } else if (arg1.field6464 == var4.field4583 || arg1.field6464 == var4.field4564 || arg1.field6464 == var4.field4594 || arg1.field6464 == var4.field4578) {
            var3 = var2.field2437;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
    public static void method2579(boolean arg0) {
        field6276 = null;
        field6277 = null;
        if (!arg0) {
            field6277 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILfaa;)V")
    public static final void method2580(int arg0, class140 arg1) {
        if (arg1.field2023 == 5 && arg1.field1969 != -1) {
            class379.method2195((byte) 126, arg1, class630.field8790);
        }
        field6274++;
        if (arg0 != 0) {
            field6276 = null;
        }
    }
}
