import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class284 {

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "F")
    public float field3597 = 0.25F;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "F")
    public float field3607 = 1.0F;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "F")
    public float field3604 = 1.0F;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "Lip;")
    public class662 field3598;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "F")
    public float field3596;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "F")
    public float field3603;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "F")
    public float field3592;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
    public static int field3600 = 0;

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZLvw;)Z", line = 9)
    public final boolean method1710(boolean arg0, class284 arg1) {
        if (!arg0) {
            this.field3597 = 1.1318748F;
        }
        field3605++;
        return this.field3594 == arg1.field3594 && this.field3596 == arg1.field3596 && this.field3603 == arg1.field3603 && this.field3592 == arg1.field3592 && this.field3597 == arg1.field3597 && this.field3607 == arg1.field3607 && this.field3604 == arg1.field3604 && this.field3591 == arg1.field3591 && this.field3601 == arg1.field3601 && this.field3598 == arg1.field3598;
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V", line = 62)
    public class284() {
        this.field3598 = class37.field543;
        this.field3602 = -60;
        this.field3606 = -50;
        this.field3596 = 1.1523438F;
        this.field3603 = 0.69921875F;
        this.field3599 = -50;
        this.field3594 = class35.field524;
        this.field3591 = class225.field2914;
        this.field3601 = 0;
        this.field3592 = 1.2F;
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lji;)V", line = 82)
    public class284(class572 arg0) {
        int var2 = arg0.method3097((byte) 12);
        if (class611.field8310.method3593(class628.field8526, (byte) -126) && class71.field919.method430() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3594 = class35.field524;
            } else {
                this.field3594 = arg0.method3064(-2031091464);
            }
            if ((var2 & 0x2) == 0) {
                this.field3596 = 1.1523438F;
            } else {
                this.field3596 = (float) arg0.method3031(-1) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3603 = 0.69921875F;
            } else {
                this.field3603 = (float) arg0.method3031(-1) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3592 = 1.2F;
            } else {
                this.field3592 = (float) arg0.method3031(-1) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3064(-2031091464);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3031(-1);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3031(-1);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3031(-1);
            }
            this.field3592 = 1.2F;
            this.field3596 = 1.1523438F;
            this.field3603 = 0.69921875F;
            this.field3594 = class35.field524;
        }
        if ((var2 & 0x10) == 0) {
            this.field3606 = -50;
            this.field3602 = -60;
            this.field3599 = -50;
        } else {
            this.field3599 = arg0.method3086(65280);
            this.field3602 = arg0.method3086(65280);
            this.field3606 = arg0.method3086(65280);
        }
        if ((var2 & 0x20) == 0) {
            this.field3591 = class225.field2914;
        } else {
            this.field3591 = arg0.method3064(-2031091464);
        }
        if ((var2 & 0x40) == 0) {
            this.field3601 = 0;
        } else {
            this.field3601 = arg0.method3031(-1);
        }
        if ((var2 & 0x80) == 0) {
            this.field3598 = class37.field543;
        } else {
            int var3 = arg0.method3031(-1);
            int var4 = arg0.method3031(-1);
            int var5 = arg0.method3031(-1);
            int var6 = arg0.method3031(-1);
            int var7 = arg0.method3031(-1);
            int var8 = arg0.method3031(-1);
            this.field3598 = class666.method3705(var6, var8, var3, 5179, var4, var7, var5);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lji;I)V", line = 32)
    public final void method1711(class572 arg0, int arg1) {
        this.field3607 = (float) (arg0.method3097((byte) 12) * 8) / 255.0F;
        field3595++;
        if (arg1 != -15350) {
            this.method1710(true, null);
        }
        this.field3597 = (float) (arg0.method3097((byte) 12) * 8) / 255.0F;
        this.field3604 = (float) (arg0.method3097((byte) 12) * 8) / 255.0F;
    }
}
