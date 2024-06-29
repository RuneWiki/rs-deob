import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class238 extends class573 {

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "[J")
    public static long[] field3525 = new long[32];

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    private int field3526;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    private int field3530;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    private int field3531;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "Z")
    public static boolean field3527;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field3524;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (arg0 >= -116) {
            this.field3526 = -113;
        }
        if (super.field8320.field3295) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class540.field7555 > var7; ++var7) {
                var4[var7] = this.field3530;
                var5[var7] = this.field3531;
                var6[var7] = this.field3526;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V")
    public static void method1582(int arg0) {
        if (arg0 != 0) {
            method1582(-45);
        }
        field3525 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
    private final void method1583(boolean arg0, int arg1) {
        this.field3526 = (arg1 & 255) << 4;
        this.field3531 = arg1 >> 4 & 4080;
        ++field3523;
        this.field3530 = (16711680 & arg1) >> 12;
        if (!arg0) {
            field3527 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
    private class238(int arg0) {
        super(0, false);
        this.method1583(true, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1584(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3529;
        if (arg1 == arg7) {
            class646.method3685(arg3, 20052, arg2, arg4, arg5, arg7, arg6);
        } else {
            if (arg2 - arg7 >= class704.field9911 && ~(arg2 + arg7) >= ~class379.field5612 && class309.field4556 <= -arg1 + arg4 && ~client.field4115 <= ~(arg1 + arg4)) {
                class471.method2825(-113, arg5, arg2, arg6, arg3, arg1, arg7, arg4);
            } else {
                class328.method2111(arg7, arg3, arg5, arg6, arg1, arg2, arg4, 0);
            }
            if (arg0 < 10) {
                field3527 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.method1583(true, arg0.method740((byte) 124));
        }
        if (arg2 != 3) {
            method1584((byte) 83, 35, -105, -40, -69, -106, 3, 95);
        }
        ++field3528;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class238() {
        this(0);
    }
}
