import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class364 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "F")
    public float field4655 = 1.0F;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "F")
    public float field4660 = 0.25F;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "F")
    public float field4669 = 1.0F;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public int field4663;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Lcd;")
    public class22 field4664;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "F")
    public float field4658;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "F")
    public float field4665;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public int field4671;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "F")
    public float field4666;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public int field4654;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public int field4662;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field4657 = 999999;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLvj;)V")
    public final void method2043(byte arg0, class26 arg1) {
        field4661++;
        if (arg0 == -98) {
            this.field4655 = (float) (arg1.method194((byte) 119) * 8) / 255.0F;
            this.field4660 = (float) (arg1.method194((byte) 119) * 8) / 255.0F;
            this.field4669 = (float) (arg1.method194((byte) 119) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)Lei;")
    public static final class183 method2044(boolean arg0) {
        if (!arg0) {
            field4670 = -79;
        }
        field4657 = 0;
        field4667++;
        return class590.method3503(true);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lul;Z)Z")
    public final boolean method2045(class364 arg0, boolean arg1) {
        field4672++;
        if (arg1) {
            return false;
        } else {
            return this.field4671 == arg0.field4671 && this.field4666 == arg0.field4666 && this.field4658 == arg0.field4658 && this.field4665 == arg0.field4665 && this.field4660 == arg0.field4660 && this.field4655 == arg0.field4655 && this.field4669 == arg0.field4669 && this.field4653 == arg0.field4653 && this.field4656 == arg0.field4656 && this.field4664 == arg0.field4664;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Z")
    public static final boolean method2046(int arg0) {
        if (arg0 != -4507) {
            field4657 = -29;
        }
        field4668++;
        return class8.field81;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
    public class364() {
        this.field4663 = -60;
        this.field4664 = class560.field7963;
        this.field4658 = 0.69921875F;
        this.field4656 = 0;
        this.field4665 = 1.2F;
        this.field4653 = class56.field783;
        this.field4671 = class93.field1283;
        this.field4666 = 1.1523438F;
        this.field4654 = -50;
        this.field4662 = -50;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lvj;)V")
    public class364(class26 arg0) {
        int var2 = arg0.method194((byte) 119);
        if (class674.field9500.field5162.method1586(0) == 1 && class126.field1741.method2124() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field4671 = class93.field1283;
            } else {
                this.field4671 = arg0.method189(255);
            }
            if ((var2 & 0x2) == 0) {
                this.field4666 = 1.1523438F;
            } else {
                this.field4666 = (float) arg0.method193(2) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field4658 = 0.69921875F;
            } else {
                this.field4658 = (float) arg0.method193(2) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field4665 = 1.2F;
            } else {
                this.field4665 = (float) arg0.method193(2) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method189(255);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method193(2);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method193(2);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method193(2);
            }
            this.field4671 = class93.field1283;
            this.field4658 = 0.69921875F;
            this.field4665 = 1.2F;
            this.field4666 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field4663 = -60;
            this.field4662 = -50;
            this.field4654 = -50;
        } else {
            this.field4662 = arg0.method173(-3);
            this.field4663 = arg0.method173(-3);
            this.field4654 = arg0.method173(-3);
        }
        if ((var2 & 0x20) == 0) {
            this.field4653 = class56.field783;
        } else {
            this.field4653 = arg0.method189(255);
        }
        if ((var2 & 0x40) == 0) {
            this.field4656 = 0;
        } else {
            this.field4656 = arg0.method193(2);
        }
        if ((var2 & 0x80) == 0) {
            this.field4664 = class560.field7963;
        } else {
            int var3 = arg0.method193(2);
            int var4 = arg0.method193(2);
            int var5 = arg0.method193(2);
            int var6 = arg0.method193(2);
            int var7 = arg0.method193(2);
            int var8 = arg0.method193(2);
            this.field4664 = class447.method2665(var5, var8, (byte) 106, var3, var6, var4, var7);
        }
    }
}
