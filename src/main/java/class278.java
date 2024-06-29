import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class278 extends class417 {

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    private int field3892;

    @OriginalMember(owner = "client!pba", name = "t", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "I")
    private int field3896;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    private int field3890;

    @OriginalMember(owner = "client!pba", name = "u", descriptor = "I")
    private int field3901;

    @OriginalMember(owner = "client!pba", name = "y", descriptor = "I")
    private int field3905;

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!pba", name = "w", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!pba", name = "v", descriptor = "F")
    public static float field3902 = 1024.0F;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!pba", name = "r", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!pba", name = "s", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!pba", name = "x", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI[II)V")
    public final void method1740(byte arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 > -36) {
            this.field3905 = 89;
        }
        arg2[2] = this.field3896 + arg3 - this.field3906;
        arg2[0] = this.field3890;
        arg2[1] = this.field3901 + arg1 - this.field3900;
        field3904++;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIII)Z")
    public final boolean method1741(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 5450) {
            this.field3901 = -106;
        }
        field3891++;
        return this.field3890 == arg0 && arg1 >= this.field3901 && arg1 <= this.field3892 && this.field3896 <= arg3 && arg3 <= this.field3905;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BII)Z")
    public final boolean method1742(byte arg0, int arg1, int arg2) {
        if (arg0 >= -78) {
            this.field3895 = 44;
        }
        field3893++;
        return this.field3901 <= arg1 && this.field3892 >= arg1 && this.field3896 <= arg2 && arg2 <= this.field3905;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
    public static final void method1743(int arg0) {
        field3894++;
        if (class331.field4576 != 3 && class410.field5611.field5709 != -1) {
            class72.method585(125, class410.field5611.field5719, class410.field5611.field5709);
        }
        if (arg0 < 1) {
            field3899 = -85;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(II[II)V")
    public final void method1744(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[0] = 0;
        arg2[1] = arg3 + this.field3900 - this.field3901;
        field3898++;
        if (arg1 != 15874) {
            this.method1741(2, -38, -39, 5);
        }
        arg2[2] = this.field3906 + arg0 - this.field3896;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI)V")
    public static final void method1745(byte arg0, int arg1) {
        field3889++;
        class221 var2 = class65.method413(4, arg1, (byte) 93);
        if (arg0 > -103) {
            field3902 = 0.4784422F;
        }
        var2.method1432(0);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(III)Z")
    public final boolean method1746(int arg0, int arg1, int arg2) {
        field3897++;
        if (arg2 != 2) {
            this.method1741(87, 82, 15, -112);
        }
        return this.field3900 <= arg1 && this.field3895 >= arg1 && this.field3906 <= arg0 && arg0 <= this.field3903;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3892 = arg3;
        this.field3900 = arg5;
        this.field3896 = arg2;
        this.field3890 = arg0;
        this.field3901 = arg1;
        this.field3905 = arg4;
        this.field3906 = arg6;
        this.field3903 = arg8;
        this.field3895 = arg7;
    }
}
