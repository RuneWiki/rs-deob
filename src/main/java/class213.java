import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class213 extends class171 {

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "[[I")
    public static int[][] field3517 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Lr;")
    public static class264 field3521 = null;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "[[S")
    public static short[][] field3520 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I", line = 4)
    public static final int method1591(int arg0, int arg1) {
        if (arg0 > -7) {
            return -116;
        } else {
            field3519++;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILr;IZ)V", line = 15)
    public static final void method1592(int arg0, class264 arg1, int arg2, boolean arg3) {
        field3524++;
        if (class45.field763 < 2 && class161.field2736 == 0 && !class272.field4668) {
            return;
        }
        class146 var4 = class135.method1001((byte) 41);
        if (arg1 == null) {
            int var6 = class39.field695.method217(var4, arg0 + 4, arg2 + 15, 16777215, 0, class310.field5266, class202.field3368);
            class112.method759(15, arg2, 8, var6 + class39.field695.method207(var4), arg0 + 4);
        } else {
            class30 var5 = arg1.method1919(class102.field1651, 52);
            if (var5 == null) {
                var5 = class39.field695;
            }
            var5.method204(var4, arg0, arg2, arg1.field4393, arg1.field4381, arg1.field4442, arg1.field4389, arg1.field4375, arg1.field4419, class310.field5266, class202.field3368, class55.field985);
            class112.method759(class55.field985[3], class55.field985[1], 8, class55.field985[2], class55.field985[0]);
        }
        if (!arg3) {
            field3520 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V", line = 54)
    public static void method1593(int arg0) {
        field3520 = (short[][]) null;
        if (arg0 != 0) {
            method1591(-45, -62);
        }
        field3517 = (int[][]) null;
        field3521 = null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(II)V", line = 95)
    public class213(int arg0, int arg1) {
        this.field3522 = arg1;
        this.field3518 = arg0;
    }
}
