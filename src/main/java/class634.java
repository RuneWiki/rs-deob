import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class634 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Lpr;")
    public static class407 field8976 = new class407(102, -1);

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field8978 = 0;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 3)
    public static void method3543(int arg0) {
        if (arg0 != 7) {
            field8978 = 92;
        }
        field8976 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V", line = 16)
    public static final void method3544(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field8974++;
            class530 var3 = class242.method1402(-83, 16, arg0);
            var3.method3025((byte) -69);
            var3.field7593 = arg2;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 33)
    public static final void method3545(int arg0, int arg1, int arg2, Class arg3) {
        class287 var4 = class97.field1074[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class60 var5 = var4.field3680; var5 != null; var5 = var5.field623) {
            class354 var6 = var5.field625;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4642 == arg1 && var6.field4648 == arg2) {
                class393.method2143(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIBI)I", line = 59)
    public static final int method3546(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field8977++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            if (arg2 != 68) {
                field8976 = null;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIBIII)V", line = 92)
    public static final void method3547(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field8975++;
        int var9 = arg1 + 1;
        class445.method2463(arg3, 107, arg5, arg0, class156.field1755[arg1]);
        int var10 = arg4 - 1;
        class445.method2463(arg3, 97, arg5, arg0, class156.field1755[arg4]);
        if (arg2 != -74) {
            method3543(76);
        }
        for (int var6 = var9; var6 <= var10; var6++) {
            int[] var7 = class156.field1755[var6];
            var7[arg3] = var7[arg5] = arg0;
        }
    }
}
