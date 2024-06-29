import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class475 extends class24 {

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
    public static int[] field6608 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    private int field6613;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Ljava/lang/String;")
    private String field6612;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lke;I)V", line = 3)
    public final void method190(class625 arg0, int arg1) {
        if (arg1 == 5) {
            field6609++;
            arg0.method3429(-24303, this.field6612, this.field6613);
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(B)V", line = 17)
    public static void method2784(byte arg0) {
        field6608 = null;
        if (arg0 != 38) {
            method2784((byte) 39);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjp;)V", line = 28)
    public final void method191(int arg0, class376 arg1) {
        field6610++;
        this.field6613 = arg1.method2384(40);
        this.field6612 = arg1.method2379((byte) 85);
        if (arg0 >= -56) {
            this.field6612 = null;
        }
    }
}
