import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class262 {

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "F")
    public float field3817 = 1.0F;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "F")
    public float field3824 = 0.25F;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "F")
    public float field3815 = 1.0F;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "Lj;")
    public class269 field3810;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "F")
    public float field3821;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "F")
    public float field3825;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "F")
    public float field3826;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Lqj;")
    public static class238 field3811;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lpp;B)Z")
    public final boolean method1643(class262 arg0, byte arg1) {
        field3813++;
        if (arg1 != -7) {
            this.field3809 = -32;
        }
        return this.field3809 == arg0.field3809 && this.field3825 == arg0.field3825 && this.field3826 == arg0.field3826 && this.field3821 == arg0.field3821 && this.field3824 == arg0.field3824 && this.field3817 == arg0.field3817 && this.field3815 == arg0.field3815 && this.field3816 == arg0.field3816 && this.field3818 == arg0.field3818 && this.field3810 == arg0.field3810;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILil;)V")
    public final void method1644(int arg0, class265 arg1) {
        this.field3817 = (float) (arg1.method1697(112) * 8) / 255.0F;
        field3823++;
        this.field3824 = (float) (arg1.method1697(-122) * 8) / 255.0F;
        this.field3815 = (float) (arg1.method1697(123) * arg0) / 255.0F;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)I")
    public static final int method1645(byte arg0) {
        if (arg0 != 21) {
            method1645((byte) -11);
        }
        field3819++;
        return 6;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method1646(int arg0) {
        field3811 = null;
        if (arg0 < 71) {
            method1645((byte) -24);
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
    public class262() {
        this.field3820 = -60;
        this.field3814 = -50;
        this.field3816 = class124.field1656;
        this.field3812 = -50;
        this.field3810 = class300.field4316;
        this.field3821 = 1.2F;
        this.field3825 = 1.1523438F;
        this.field3818 = 0;
        this.field3809 = class53.field793;
        this.field3826 = 0.69921875F;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lil;)V")
    public class262(class265 arg0) {
        int var2 = arg0.method1697(122);
        if (class417.field6217 && class24.field417.method2110() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3809 = class53.field793;
            } else {
                this.field3809 = arg0.method1666(-2);
            }
            if ((var2 & 0x2) == 0) {
                this.field3825 = 1.1523438F;
            } else {
                this.field3825 = (float) arg0.method1685(8104) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3826 = 0.69921875F;
            } else {
                this.field3826 = (float) arg0.method1685(8104) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3821 = 1.2F;
            } else {
                this.field3821 = (float) arg0.method1685(8104) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1666(-2);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1685(8104);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1685(8104);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1685(8104);
            }
            this.field3821 = 1.2F;
            this.field3826 = 0.69921875F;
            this.field3809 = class53.field793;
            this.field3825 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3812 = -50;
            this.field3820 = -60;
            this.field3814 = -50;
        } else {
            this.field3812 = arg0.method1698(1625554944);
            this.field3820 = arg0.method1698(1625554944);
            this.field3814 = arg0.method1698(1625554944);
        }
        if ((var2 & 0x20) == 0) {
            this.field3816 = class124.field1656;
        } else {
            this.field3816 = arg0.method1666(-2);
        }
        if ((var2 & 0x40) == 0) {
            this.field3818 = 0;
        } else {
            this.field3818 = arg0.method1685(8104);
        }
        if ((var2 & 0x80) == 0) {
            this.field3810 = class300.field4316;
        } else {
            this.field3810 = class258.method1624((byte) -17, arg0.method1685(8104), arg0.method1685(8104), arg0.method1685(8104), arg0.method1685(8104), arg0.method1685(8104), arg0.method1685(8104));
        }
    }
}
