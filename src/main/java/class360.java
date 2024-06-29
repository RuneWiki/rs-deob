import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class360 {

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field5055 = 0;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Leq;")
    public static class209 field5050;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[B")
    public byte[] field5049;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[S")
    public short[] field5053;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "[S")
    public short[] field5054;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[S")
    public short[] field5057;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static final void method2243(int arg0) {
        if (arg0 == 0) {
            if (class272.field3892 == 2) {
                class253.field3660[0].method3928(class497.field7092[0]);
                class253.field3660[1].method3928(class497.field7092[1]);
            } else if (class272.field3892 == 3) {
                class253.field3660[0].method3928(class497.field7092[0]);
                class253.field3660[1].method3928(class497.field7092[1]);
                class253.field3660[2].method3928(class497.field7092[2]);
            } else {
                class253.field3660[0].method3928(class497.field7092[0]);
                class253.field3660[1].method3928(class497.field7092[1]);
                class253.field3660[2].method3928(class497.field7092[2]);
                class253.field3660[3].method3928(class497.field7092[3]);
            }
        } else if (arg0 == 1) {
            if (class272.field3892 == 2) {
                class253.field3660[0].method3928(class497.field7092[2]);
            } else if (class272.field3892 == 3) {
                class253.field3660[0].method3928(class497.field7092[3]);
                class253.field3660[1].method3928(class497.field7092[4]);
            } else {
                class253.field3660[0].method3928(class497.field7092[4]);
                class253.field3660[1].method3928(class497.field7092[5]);
                class253.field3660[2].method3928(class497.field7092[6]);
            }
        } else if (arg0 == 2) {
            if (class272.field3892 == 2) {
                class253.field3660[0].method3928(class497.field7092[3]);
                return;
            }
            if (class272.field3892 == 3) {
                class253.field3660[0].method3928(class497.field7092[5]);
                return;
            }
            class253.field3660[0].method3928(class497.field7092[7]);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLbj;)I")
    public static final int method2244(byte arg0, class241 arg1) {
        if (arg0 > -125) {
            field5050 = null;
        }
        field5052++;
        String var2 = class181.method1299(80, arg1);
        return class419.field5896.method2068(-1, class698.field9810, var2);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static void method2245(int arg0) {
        field5050 = null;
        int var1 = -38 / ((arg0 - 24) / 40);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)I")
    public static final int method2246(byte arg0) {
        field5056++;
        return arg0 <= 31 ? 42 : 16;
    }
}
