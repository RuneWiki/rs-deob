import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class645 {

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public int field8577 = 16777215;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public int field8576 = 8;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public int field8569;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public int field8571;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public int field8572;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public int field8578;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    public int field8580;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "Z")
    public boolean field8575;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3532(byte arg0) {
        for (class236 var1 = (class236) class592.field7703.method4051(896); var1 != null; var1 = (class236) class592.field7703.method4049(true)) {
            if (var1.field3323 > 1) {
                var1.field3323 = 0;
                class525.field6962.method556((byte) 0, ((class433) var1.field3322.field10032.field5748).field5958, var1);
                var1.field3322.method4055((byte) -74);
            }
        }
        field8570++;
        class181.field2730 = 0;
        class172.field2634 = 0;
        if (arg0 >= 52) {
            class446.field6126.method23(10);
            class76.field925.method2138(-1);
            class592.field7703.method4055((byte) -74);
            class148.method1111(class200.field3008, 52);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lee;I)V", line = 36)
    public final void method3533(class677 arg0, int arg1) {
        field8579++;
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method3821((byte) -39);
            if (var3 == 0) {
                return;
            }
            this.method3536(arg0, -97, var3);
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V", line = 59)
    public static final void method3534(byte arg0) {
        field8568++;
        class466 var1 = (class466) class334.field4747.method21(2);
        boolean var2 = class137.field2182 != null || class211.field3105 > 0;
        int var3 = var1.method1098(-15204);
        int var4 = var1.method1099((byte) -125);
        if (var2) {
            class30.field479 = 1;
        }
        if (arg0 != 117) {
            method3534((byte) 62);
        }
        if (var2) {
            class348.field4895 = class218.field3147;
        } else {
            class75.method608(false, var4, var3, class218.field3147);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIIIIIII)V", line = 87)
    public static final void method3535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg5 && arg3 == arg8 && arg0 == arg7 && arg6 == arg9) {
            class258.method1565(arg8, arg0, arg2 ^ 0x5287, arg4, arg6, arg5);
        } else {
            int var10 = arg5;
            int var11 = arg8;
            int var12 = arg5 * 3;
            int var13 = arg8 * 3;
            int var14 = arg1 * 3;
            int var15 = arg3 * 3;
            int var16 = arg7 * 3;
            int var17 = arg9 * 3;
            int var18 = arg0 + var14 - var16 - arg5;
            int var19 = arg6 + var15 - var17 - arg8;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg5;
                int var34 = (var28 - (-var30 - var32) >> 12) + arg8;
                class258.method1565(var11, var33, -21125, arg4, var34, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg2 == -4) {
            field8573++;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lee;II)V", line = 172)
    private final void method3536(class677 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field8576 = arg0.method3807(-1);
        } else if (arg2 == 2) {
            this.field8575 = true;
        } else if (arg2 == 3) {
            this.field8569 = arg0.method3771((byte) -10);
            this.field8578 = arg0.method3771((byte) -10);
            this.field8572 = arg0.method3771((byte) -10);
        } else if (arg2 == 4) {
            this.field8580 = arg0.method3821((byte) -87);
        } else if (arg2 == 5) {
            this.field8571 = arg0.method3807(-1);
        } else if (arg2 == 6) {
            this.field8577 = arg0.method3833(255);
        }
        if (arg1 >= -66) {
            this.field8575 = false;
        }
        field8574++;
    }
}
