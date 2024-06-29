import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class299 extends class110 {

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    private int field4561 = 1024;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    private int field4571 = 2048;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    private int field4574 = 3072;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "[I")
    public static int[] field4564 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4562 = "K";

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[[S")
    public static short[][] field4573 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4570 = " ";

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "[S")
    public static short[] field4560 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "[I")
    public static int[] field4575 = new int[14];

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 3)
    public class299() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)V", line = 13)
    public static final void method2080(int arg0) {
        if (arg0 != 12) {
            method2080(17);
        }
        field4563++;
        class246.field3666.method2182(false);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILre;I)V", line = 34)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field4561 = arg1.method1830((byte) -77);
        } else if (arg0 == 1) {
            this.field4574 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field1705 = arg1.method1787(false) == 1;
        }
        if (arg2 >= -37) {
            this.field4574 = -68;
        }
        field4569++;
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)V", line = 67)
    public static final void method2081(int arg0) {
        class42.field516.method2176((byte) -60);
        if (arg0 != -9317) {
            method2081(7);
        }
        field4565++;
        class223.field3396.method2176((byte) -76);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V", line = 86)
    public static void method2082(byte arg0) {
        field4573 = (short[][]) null;
        field4562 = null;
        field4575 = null;
        field4560 = null;
        if (arg0 != 70) {
            field4575 = (int[]) null;
        }
        field4570 = null;
        field4564 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V", line = 111)
    public static final void method2083(int arg0, byte arg1) {
        if (arg1 != -61) {
            field4562 = (String) null;
        }
        field4566++;
        class149.field2244.method2174(-12634, arg0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[I", line = 123)
    public final int[] method46(int arg0, int arg1) {
        field4568++;
        if (arg0 != 1) {
            this.method44(6, (class263) null, -43);
        }
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int[] var4 = this.method764(0, true, arg1);
            for (int var5 = 0; var5 < class124.field1936; var5++) {
                var3[var5] = (var4[var5] * this.field4571 >> 12) + this.field4561;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V", line = 160)
    public final void method47(int arg0) {
        if (arg0 != -9) {
            field4560 = (short[]) null;
        }
        this.field4571 = this.field4574 - this.field4561;
        field4567++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)[[I", line = 178)
    public final int[][] method445(int arg0, boolean arg1) {
        field4572++;
        if (arg1) {
            field4573 = (short[][]) ((short[][]) null);
        }
        int[][] var3 = this.field1701.method1477((byte) 84, arg0);
        if (this.field1701.field3255) {
            int[][] var4 = this.method770(arg0, (byte) 84, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class124.field1936; var11++) {
                var7[var11] = (var6[var11] * this.field4571 >> 12) + this.field4561;
                var9[var11] = (var5[var11] * this.field4571 >> 12) + this.field4561;
                var10[var11] = (var8[var11] * this.field4571 >> 12) + this.field4561;
            }
        }
        return var3;
    }
}
