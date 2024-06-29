import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class483 {

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "F")
    public float field6830 = 0.25F;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "F")
    public float field6835 = 1.0F;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "F")
    public float field6829 = 1.0F;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public int field6838;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field6823;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Lrp;")
    public class419 field6839;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "F")
    public float field6836;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "F")
    public float field6832;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field6827;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public int field6828;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public int field6834;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public int field6837;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "F")
    public float field6825;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field6826 = 0;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    public static int[] field6824 = new int[32];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjf;)Z", line = 3)
    public final boolean method2844(int arg0, class483 arg1) {
        if (arg0 != 22137) {
            method2847(-126, 56);
        }
        field6831++;
        return this.field6834 == arg1.field6834 && this.field6825 == arg1.field6825 && this.field6836 == arg1.field6836 && this.field6832 == arg1.field6832 && this.field6830 == arg1.field6830 && this.field6829 == arg1.field6829 && this.field6835 == arg1.field6835 && this.field6827 == arg1.field6827 && this.field6823 == arg1.field6823 && this.field6839 == arg1.field6839;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 21)
    public static void method2845(int arg0) {
        int var1 = 115 % ((72 - arg0) / 52);
        field6824 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILkk;)V", line = 31)
    public final void method2846(int arg0, class161 arg1) {
        field6822++;
        this.field6829 = (float) (arg1.method1172((byte) -119) * 8) / 255.0F;
        this.field6830 = (float) (arg1.method1172((byte) 58) * 8) / 255.0F;
        this.field6835 = (float) (arg0 * arg1.method1172((byte) -117)) / 255.0F;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V", line = 41)
    public static final void method2847(int arg0, int arg1) {
        if (arg0 < -95) {
            field6833++;
            class334 var2 = class352.method2172(arg1, 1, 16711935);
            var2.method2099(true);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 81)
    public class483() {
        this.field6838 = -60;
        this.field6823 = 0;
        this.field6839 = class394.field5437;
        this.field6836 = 0.69921875F;
        this.field6832 = 1.2F;
        this.field6827 = class428.field5969;
        this.field6828 = -50;
        this.field6834 = class450.field6409;
        this.field6837 = -50;
        this.field6825 = 1.1523438F;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lkk;)V", line = 97)
    public class483(class161 arg0) {
        int var2 = arg0.method1172((byte) 106);
        if (class62.field913 && class266.field3835.method403() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field6834 = class450.field6409;
            } else {
                this.field6834 = arg0.method1168(255);
            }
            if ((var2 & 0x2) == 0) {
                this.field6825 = 1.1523438F;
            } else {
                this.field6825 = (float) arg0.method1134(-16848) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field6836 = 0.69921875F;
            } else {
                this.field6836 = (float) arg0.method1134(-16848) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field6832 = 1.2F;
            } else {
                this.field6832 = (float) arg0.method1134(-16848) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1168(255);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1134(-16848);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1134(-16848);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1134(-16848);
            }
            this.field6836 = 0.69921875F;
            this.field6825 = 1.1523438F;
            this.field6832 = 1.2F;
            this.field6834 = class450.field6409;
        }
        if ((var2 & 0x10) == 0) {
            this.field6828 = -50;
            this.field6838 = -60;
            this.field6837 = -50;
        } else {
            this.field6837 = arg0.method1163(9988);
            this.field6838 = arg0.method1163(9988);
            this.field6828 = arg0.method1163(9988);
        }
        if ((var2 & 0x20) == 0) {
            this.field6827 = class428.field5969;
        } else {
            this.field6827 = arg0.method1168(255);
        }
        if ((var2 & 0x40) == 0) {
            this.field6823 = 0;
        } else {
            this.field6823 = arg0.method1134(-16848);
        }
        if ((var2 & 0x80) == 0) {
            this.field6839 = class394.field5437;
        } else {
            this.field6839 = class314.method2000(arg0.method1134(-16848), arg0.method1134(-16848), arg0.method1134(-16848), (byte) -124, arg0.method1134(-16848), arg0.method1134(-16848), arg0.method1134(-16848));
        }
    }
}
