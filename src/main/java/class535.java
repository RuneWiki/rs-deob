import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class535 extends class4 {

    @OriginalMember(owner = "client!du", name = "L", descriptor = "I")
    private int field7472;

    @OriginalMember(owner = "client!du", name = "F", descriptor = "I")
    public static int field7467 = 0;

    @OriginalMember(owner = "client!du", name = "E", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!du", name = "H", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!du", name = "I", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!du", name = "J", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!du", name = "K", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
    public class535() {
        this(4096);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2978(int arg0, int arg1, boolean arg2) {
        ++field7471;
        if (arg2) {
            return true;
        } else {
            return class265.method1634((byte) -128, arg1, arg0) || class105.method578(arg0, true, arg1);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field7470;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            class205.method1315(var3, 0, class132.field1627, this.field7472);
        }
        if (arg0 != 10) {
            this.method13(-99, (class551) null, -87);
        }
        return var3;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(III)V")
    public static final void method2979(int arg0, int arg1, int arg2) {
        class118.method650(true, class320.field4426);
        if (arg2 != 0) {
            field7467 = -83;
        }
        ++class355.field4971;
        ++field7469;
        class272.field3457.method3042(arg1, 113);
        class272.field3457.method3071(arg2 ^ -103, arg0);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field7466;
        if (arg0 < -89) {
            if (arg2 == 0) {
                this.field7472 = (arg1.method3045(-127) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(I)V")
    public class535(int arg0) {
        super(0, true);
        this.field7472 = 4096;
        this.field7472 = arg0;
    }
}
