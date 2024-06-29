import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class79 extends class550 {

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    private int field1158 = 0;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field1160 = 0;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "F")
    public static float field1159;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lla;Lji;)V")
    public class79(class422 arg0, class80 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZ)V")
    public final void method575(boolean arg0, boolean arg1) {
        if (!arg0) {
            field1159 = -1.4496737F;
        }
        ++field1156;
        int var3 = super.field7840.field4133.method3824(class335.field4917, (byte) -78, super.field7838.method177()) - -super.field7840.field4134;
        int var4 = super.field7840.field4141.method2088(super.field7838.method184(), (byte) -118, class614.field8651) - -super.field7840.field4142;
        super.field7838.method176((float) (var3 + super.field7838.method177() / 2), (float) (super.field7838.method184() / 2 + var4), 4096, this.field1158);
        this.field1158 += ((class80) super.field7840).field1162;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILla;)V")
    public static final void method719(int arg0, class422 arg1) {
        ++field1157;
        class72.field1094 = arg1;
        if (arg0 != 0) {
            field1159 = 1.117433F;
        }
    }
}
