import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class704 extends class603 {

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field9950;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field9951;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field9952;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "I")
    public static int field9957;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    public static int field9958;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
    public static int field9961;

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "Ljn;")
    public static class668 field9963;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "Lf;")
    private class701 field9953;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "Lf;")
    private class701 field9954;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "Lf;")
    private class701 field9955;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "Lf;")
    private class701 field9956;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "Lf;")
    private class701 field9960;

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "Lf;")
    public class701 field9962;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZII)V", line = 9)
    public final void method755(int arg0, boolean arg1, int arg2, int arg3) {
        ++field9961;
        int var5 = this.field9954.method896() + arg2;
        int var6 = arg2 - (-super.field8689.field7540 - -this.field9956.method896());
        int var7 = this.field9953.method901() + arg3;
        int var8 = arg3 + super.field8689.field7528 + -this.field9960.method901();
        int var9 = var6 - var5;
        int var10 = -var7 + var8;
        int var11 = var9 * this.method3477(-11833) / 10000;
        int[] var12 = new int[4];
        class68.field1045.method251(var12);
        class68.field1045.method292(var5, var7, var5 + var11, var8);
        this.method1473(arg0 + 25001, var9, var10, var5, var7);
        class68.field1045.method292(var5 + var11, var7, var6, var8);
        this.field9955.method3923(var5, var7, var9, var10);
        class68.field1045.method292(var12[0], var12[arg0], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 38)
    public static void method3944(byte arg0) {
        field9963 = null;
        if (arg0 != 32) {
            field9963 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)V", line = 50)
    public void method1473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9962.method3923(arg3, arg4, arg1, arg2);
        if (arg0 != 25002) {
            this.field9955 = null;
        }
        ++field9958;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lvc;I)Z", line = 62)
    public static final boolean method3945(class289 arg0, int arg1) {
        ++field9959;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field3920) {
            return false;
        } else if (!arg0.method1718(class550.field7970, (byte) 98)) {
            return false;
        } else if (class207.field2527.method3678((long) arg0.field3923, -123) != null) {
            return false;
        } else {
            if (arg1 != -22236) {
                field9963 = null;
            }
            return class687.field9806.method3678((long) arg0.field3930, arg1 + 22112) == null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)V", line = 95)
    public static final void method3946(byte arg0, int arg1) {
        ++field9964;
        class233 var2 = class7.method44(arg1, 9, -1);
        var2.method1423(0);
        int var3 = -17 % ((71 - arg0) / 55);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)Z", line = 107)
    public final boolean method753(int arg0) {
        ++field9951;
        if (!super.method753(arg0)) {
            return false;
        } else {
            class567 var2 = (class567) super.field8689;
            if (!super.field8685.method3802(var2.field8287, (byte) -79)) {
                return false;
            } else if (!super.field8685.method3802(var2.field8288, (byte) -18)) {
                return false;
            } else if (!super.field8685.method3802(var2.field8286, (byte) -28)) {
                return false;
            } else if (!super.field8685.method3802(var2.field8291, (byte) 114)) {
                return false;
            } else if (!super.field8685.method3802(var2.field8293, (byte) 114)) {
                return false;
            } else {
                return super.field8685.method3802(var2.field8284, (byte) -66);
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V", line = 142)
    public final void method749(int arg0) {
        ++field9950;
        super.method749(arg0);
        class567 var2 = (class567) super.field8689;
        this.field9962 = class273.method1638((byte) -109, super.field8685, var2.field8287);
        this.field9955 = class273.method1638((byte) -127, super.field8685, var2.field8288);
        if (arg0 != 27471) {
            this.field9960 = null;
        }
        this.field9954 = class273.method1638((byte) -128, super.field8685, var2.field8286);
        this.field9956 = class273.method1638((byte) -125, super.field8685, var2.field8291);
        this.field9953 = class273.method1638((byte) -105, super.field8685, var2.field8293);
        this.field9960 = class273.method1638((byte) -120, super.field8685, var2.field8284);
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Ljn;Ljn;Llea;)V", line = 161)
    public class704(class668 arg0, class668 arg1, class567 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIZZ)V", line = 165)
    public final void method751(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field9957;
        if (arg2) {
            int[] var5 = new int[4];
            class68.field1045.method251(var5);
            class68.field1045.method292(arg0, arg1, super.field8689.field7540 + arg0, super.field8689.field7528 + arg1);
            int var6 = this.field9954.method896();
            int var7 = this.field9954.method901();
            int var8 = this.field9956.method896();
            int var9 = this.field9956.method901();
            this.field9954.method3924(arg0, (-var7 + super.field8689.field7528) / 2 + arg1);
            this.field9956.method3924(-var8 + arg0 - -super.field8689.field7540, (-var9 + super.field8689.field7528) / 2 + arg1);
            class68.field1045.method292(arg0, arg1, super.field8689.field7540 + arg0, this.field9953.method901() + arg1);
            this.field9953.method3923(arg0 + var6, arg1, -var8 + super.field8689.field7540 + -var6, super.field8689.field7528);
            int var10 = this.field9960.method901();
            class68.field1045.method292(arg0, arg1 - -super.field8689.field7528 + -var10, super.field8689.field7540 + arg0, arg1 - -super.field8689.field7528);
            this.field9960.method3923(arg0 + var6, super.field8689.field7528 + arg1 + -var10, -var8 + super.field8689.field7540 + -var6, super.field8689.field7528);
            class68.field1045.method292(var5[0], var5[1], var5[2], var5[3]);
        }
        if (!arg3) {
            this.field9960 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V", line = 200)
    public static final void method3947(byte arg0) {
        ++field9952;
        int var1 = -124 % ((-61 - arg0) / 34);
        class377.field5073.method273(class665.field9420, class221.field2851.field4170 ? class594.field8591 + 256 << 2 : -1, 0);
    }
}
