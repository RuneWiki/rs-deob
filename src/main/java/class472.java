import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class472 {

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "F")
    public float field6688 = 1.0F;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "F")
    public float field6696 = 0.25F;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "F")
    public float field6700 = 1.0F;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public int field6698;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "F")
    public float field6687;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public int field6699;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "Ljs;")
    public class304 field6689;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public int field6692;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "F")
    public float field6691;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public int field6695;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public int field6694;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    public int field6697;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "F")
    public float field6693;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILqh;)V")
    public final void method2832(int arg0, class61 arg1) {
        this.field6688 = (float) (arg1.method732(-559537960) * 8) / 255.0F;
        field6690++;
        if (arg0 != 23948) {
            this.method2832(87, null);
        }
        this.field6696 = (float) (arg1.method732(arg0 ^ 0xDEA67D54) * 8) / 255.0F;
        this.field6700 = (float) (arg1.method732(-559537960) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLmq;)Z")
    public final boolean method2833(boolean arg0, class472 arg1) {
        if (arg0) {
            return true;
        } else {
            field6686++;
            return this.field6697 == arg1.field6697 && this.field6691 == arg1.field6691 && this.field6687 == arg1.field6687 && this.field6693 == arg1.field6693 && this.field6696 == arg1.field6696 && this.field6688 == arg1.field6688 && this.field6700 == arg1.field6700 && this.field6699 == arg1.field6699 && this.field6698 == arg1.field6698 && this.field6689 == arg1.field6689;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
    public class472() {
        this.field6698 = 0;
        this.field6687 = 0.69921875F;
        this.field6699 = class205.field3144;
        this.field6689 = class614.field8933;
        this.field6692 = -50;
        this.field6691 = 1.1523438F;
        this.field6695 = -60;
        this.field6694 = -50;
        this.field6697 = class540.field7551;
        this.field6693 = 1.2F;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lqh;)V")
    public class472(class61 arg0) {
        int var2 = arg0.method732(-559537960);
        if (class527.field7429.method1204((byte) 121, class90.field1654) && class140.field2463.method151() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field6697 = class540.field7551;
            } else {
                this.field6697 = arg0.method730(-125);
            }
            if ((var2 & 0x2) == 0) {
                this.field6691 = 1.1523438F;
            } else {
                this.field6691 = (float) arg0.method723((byte) -25) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field6687 = 0.69921875F;
            } else {
                this.field6687 = (float) arg0.method723((byte) -25) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field6693 = 1.2F;
            } else {
                this.field6693 = (float) arg0.method723((byte) -25) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method730(-121);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method723((byte) -25);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method723((byte) -25);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method723((byte) -25);
            }
            this.field6693 = 1.2F;
            this.field6697 = class540.field7551;
            this.field6691 = 1.1523438F;
            this.field6687 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field6692 = -50;
            this.field6695 = -60;
            this.field6694 = -50;
        } else {
            this.field6694 = arg0.method721(-461515024);
            this.field6695 = arg0.method721(-461515024);
            this.field6692 = arg0.method721(-461515024);
        }
        if ((var2 & 0x20) == 0) {
            this.field6699 = class205.field3144;
        } else {
            this.field6699 = arg0.method730(-50);
        }
        if ((var2 & 0x40) == 0) {
            this.field6698 = 0;
        } else {
            this.field6698 = arg0.method723((byte) -25);
        }
        if ((var2 & 0x80) == 0) {
            this.field6689 = class614.field8933;
        } else {
            int var3 = arg0.method723((byte) -25);
            int var4 = arg0.method723((byte) -25);
            int var5 = arg0.method723((byte) -25);
            int var6 = arg0.method723((byte) -25);
            int var7 = arg0.method723((byte) -25);
            int var8 = arg0.method723((byte) -25);
            this.field6689 = class473.method2835(var4, (byte) 94, var7, var8, var6, var3, var5);
        }
    }
}
