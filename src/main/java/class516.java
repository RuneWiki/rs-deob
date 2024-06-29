import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class516 extends class35 {

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    private int field7287 = 0;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)V")
    public static final void method2951(byte arg0, int arg1) {
        int var2 = -24 / ((arg0 - 14) / 49);
        if (~class460.field6579 != -2) {
            if (class460.field6579 == 2 || ~class460.field6579 == -4) {
                class508.field7174 = arg1;
            }
        } else {
            class227.field3187 = arg1;
        }
        ++field7289;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)V")
    public final void method421(byte arg0, boolean arg1) {
        ++field7285;
        int var3 = super.field616.field6534.method860(class245.field3815, super.field608.method931(), (byte) 45) - -super.field616.field6530;
        int var4 = 116 % ((arg0 - 7) / 56);
        int var5 = super.field616.field6535.method3509(class544.field7651, (byte) 55, super.field608.method936()) - -super.field616.field6529;
        super.field608.method3912((float) (super.field608.method931() / 2 + var3), (float) (var5 - -(super.field608.method936() / 2)), 4096, this.field7287);
        this.field7287 += ((class304) super.field616).field4530;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lpu;Lon;)V")
    public class516(class522 arg0, class304 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I")
    public static final int method2952(int arg0, int arg1) {
        if (arg0 != 0) {
            method2951((byte) -68, 98);
        }
        ++field7288;
        return 255 & arg1;
    }
}
