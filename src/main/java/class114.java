import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class114 {

    @OriginalMember(owner = "client!rja", name = "k", descriptor = "F")
    public float field1739 = 1.0F;

    @OriginalMember(owner = "client!rja", name = "m", descriptor = "F")
    public float field1741 = 0.25F;

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "F")
    public float field1730 = 1.0F;

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!rja", name = "n", descriptor = "F")
    public float field1742;

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!rja", name = "l", descriptor = "F")
    public float field1740;

    @OriginalMember(owner = "client!rja", name = "p", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!rja", name = "h", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!rja", name = "o", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "F")
    public float field1732;

    @OriginalMember(owner = "client!rja", name = "q", descriptor = "Lqaa;")
    public class29 field1745;

    @OriginalMember(owner = "client!rja", name = "g", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!rja", name = "f", descriptor = "F")
    public static float field1734;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!rja", name = "i", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!rja", name = "j", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!rja", name = "r", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lso;I)V", line = 19)
    public final void method857(class494 arg0, int arg1) {
        field1737++;
        this.field1730 = (float) (arg0.method2964((byte) 112) * 8) / 255.0F;
        this.field1741 = (float) (arg1 * arg0.method2964((byte) 38)) / 255.0F;
        this.field1739 = (float) (arg0.method2964((byte) 109) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILrja;)Z", line = 31)
    public final boolean method858(int arg0, class114 arg1) {
        field1738++;
        if (arg0 == 4) {
            return this.field1743 == arg1.field1743 && this.field1742 == arg1.field1742 && this.field1740 == arg1.field1740 && this.field1732 == arg1.field1732 && this.field1741 == arg1.field1741 && this.field1730 == arg1.field1730 && this.field1739 == arg1.field1739 && this.field1731 == arg1.field1731 && this.field1735 == arg1.field1735 && this.field1745 == arg1.field1745;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rja", name = "<init>", descriptor = "()V", line = 83)
    public class114() {
        this.field1733 = -50;
        this.field1742 = 1.1523438F;
        this.field1731 = class251.field3707;
        this.field1740 = 0.69921875F;
        this.field1744 = -50;
        this.field1736 = -60;
        this.field1743 = class763.field10521;
        this.field1732 = 1.2F;
        this.field1745 = class528.field7541;
        this.field1735 = 0;
    }

    @OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(Lso;)V", line = 99)
    public class114(class494 arg0) {
        int var2 = arg0.method2964((byte) 87);
        if (class21.field353.field10080.method4366(-55) == 1 && class274.field3951.method535() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1743 = class763.field10521;
            } else {
                this.field1743 = arg0.method2976(-125);
            }
            if ((var2 & 0x2) == 0) {
                this.field1742 = 1.1523438F;
            } else {
                this.field1742 = (float) arg0.method2998(true) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1740 = 0.69921875F;
            } else {
                this.field1740 = (float) arg0.method2998(true) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1732 = 1.2F;
            } else {
                this.field1732 = (float) arg0.method2998(true) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2976(-128);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2998(true);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2998(true);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2998(true);
            }
            this.field1732 = 1.2F;
            this.field1742 = 1.1523438F;
            this.field1740 = 0.69921875F;
            this.field1743 = class763.field10521;
        }
        if ((var2 & 0x10) == 0) {
            this.field1736 = -60;
            this.field1744 = -50;
            this.field1733 = -50;
        } else {
            this.field1733 = arg0.method2988(-3);
            this.field1736 = arg0.method2988(-3);
            this.field1744 = arg0.method2988(-3);
        }
        if ((var2 & 0x20) == 0) {
            this.field1731 = class251.field3707;
        } else {
            this.field1731 = arg0.method2976(-126);
        }
        if ((var2 & 0x40) == 0) {
            this.field1735 = 0;
        } else {
            this.field1735 = arg0.method2998(true);
        }
        if ((var2 & 0x80) == 0) {
            this.field1745 = class528.field7541;
        } else {
            int var3 = arg0.method2998(true);
            int var4 = arg0.method2998(true);
            int var5 = arg0.method2998(true);
            int var6 = arg0.method2998(true);
            int var7 = arg0.method2998(true);
            int var8 = arg0.method2998(true);
            this.field1745 = class678.method3846(var5, var3, var4, var8, var7, var6, 1);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIBI)V", line = 48)
    public static final void method859(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 == 1006) {
            class379.method2352(class385.field5311, arg1, arg0);
        } else if (arg3 == 1003) {
            class379.method2352(class434.field5877, arg1, arg0);
        } else if (arg3 == 1007) {
            class379.method2352(class256.field3764, arg1, arg0);
        } else if (arg3 == 1008) {
            class379.method2352(class338.field4743, arg1, arg0);
        } else if (arg3 == 1002) {
            class379.method2352(class668.field9303, arg1, arg0);
        }
        if (arg2 > -43) {
            field1734 = 0.5591868F;
        }
        field1729++;
    }
}
