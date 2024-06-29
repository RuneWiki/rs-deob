import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class37 extends class78 {

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "C")
    private char field671;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "Ljava/lang/String;")
    public String field677;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "[I")
    public static int[] field670;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILpe;)V", line = 5)
    public final void method301(int arg0, class101 arg1) {
        field673++;
        while (true) {
            int var3 = arg1.method741(20);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.method301(-99, (class101) null);
                }
                return;
            }
            this.method302(arg1, var3, (byte) -97);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lpe;IB)V", line = 34)
    private final void method302(class101 arg0, int arg1, byte arg2) {
        if (arg2 > -56) {
            return;
        }
        if (arg1 == 1) {
            this.field671 = class220.method1590((byte) 47, arg0.method727((byte) 113));
        } else if (arg1 == 2) {
            this.field676 = arg0.method775(35);
        } else if (arg1 == 5) {
            this.field677 = arg0.method749((byte) -76);
        }
        field674++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 59)
    public static void method303(byte arg0) {
        if (arg0 > 120) {
            field670 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)Z", line = 73)
    public final boolean method304(boolean arg0) {
        if (!arg0) {
            this.field676 = -122;
        }
        field672++;
        return this.field671 == 's';
    }
}
