import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class776 extends class601 {

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "[I")
    public static int[] field10592 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "Z")
    public static boolean field10593 = false;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "[I")
    public static int[] field10598 = new int[25];

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
    public static int field10591;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
    public static int field10595;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field10596;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field10597;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILcja;)I", line = 5)
    public static final int method4251(int arg0, class83 arg1) {
        field10595++;
        if (arg0 > -110) {
            method4252((byte) 101);
        }
        if (class171.field2262 == arg1) {
            return 5890;
        } else if (class436.field5734 == arg1) {
            return 34167;
        } else if (class13.field134 == arg1) {
            return 34168;
        } else if (class324.field4001 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(B)V", line = 32)
    public static void method4252(byte arg0) {
        if (arg0 != -128) {
            field10598 = null;
        }
        field10592 = null;
        field10598 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[FI)[F", line = 44)
    public static final float[] method4253(int arg0, float[] arg1, int arg2) {
        field10591++;
        float[] var3 = new float[arg2];
        int var4 = 60 % ((arg0 + 57) / 39);
        class642.method3476(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V", line = 57)
    public class776() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIII)V", line = 60)
    public static final void method4254(int arg0, int arg1, int arg2, int arg3) {
        if ((short) arg0 == arg1) {
            class760.method4149(class351.field4286, arg3, arg2);
        } else if (arg1 == 1010) {
            class760.method4149(class790.field10819, arg3, arg2);
        } else if (arg1 == 1004) {
            class760.method4149(class296.field3753, arg3, arg2);
        } else if (arg1 == 1008) {
            class760.method4149(class337.field4104, arg3, arg2);
        } else if (arg1 == 1006) {
            class760.method4149(class754.field10265, arg3, arg2);
        }
        field10594++;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Luaa;I)V", line = 97)
    public static final void method4255(class391 arg0, int arg1) {
        if (arg1 != -1007) {
            method4255(null, 77);
        }
        if (class655.field8444 == arg0.field4989) {
            class454.field5919[arg0.field5109] = true;
        }
        field10597++;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)[I", line = 117)
    public final int[] method261(int arg0, byte arg1) {
        field10596++;
        return arg1 >= -76 ? null : class64.field839;
    }
}
