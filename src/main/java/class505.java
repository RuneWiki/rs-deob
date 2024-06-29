import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class505 extends class354 {

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    private int field7441;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(BI)[I", line = 4)
    public final int[] method270(byte arg0, int arg1) {
        if (arg0 > -74) {
            this.method272((class164) null, -121, -49);
        }
        ++field7443;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            class192.method1300(var3, 0, class531.field7814, this.field7441);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 27)
    public class505() {
        this(4096);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lnj;II)V", line = 31)
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field7444;
        if (arg2 == 1638) {
            if (arg1 == 0) {
                this.field7441 = (arg0.method1087(false) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V", line = 62)
    public class505(int arg0) {
        super(0, true);
        this.field7441 = 4096;
        this.field7441 = arg0;
    }
}
