import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class688 {

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "Z")
    public static boolean field9381 = false;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "[I")
    public static int[] field9379;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lkq;IB)I", line = 12)
    public static final int method3842(class620 arg0, int arg1, byte arg2) {
        if (arg2 != -112) {
            field9381 = true;
        }
        field9382++;
        if (!client.method1882(arg0).method2320(arg1, (byte) -116) && arg0.field8434 == null) {
            return -1;
        } else if (arg0.field8507 == null || arg1 >= arg0.field8507.length) {
            return -1;
        } else {
            return arg0.field8507[arg1];
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method3843(int arg0, int arg1, int arg2) {
        int var3 = -99 % ((-arg0 - 9) / 50);
        field9383++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!sv", name = "toString", descriptor = "()Ljava/lang/String;", line = 40)
    public final String toString() {
        field9380++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Z", line = 48)
    public final boolean method3844(int arg0) {
        if (arg0 == 25596) {
            field9384++;
            return class276.field3240 == this | class324.field4022 == this;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V", line = 59)
    public static void method3845(int arg0) {
        if (arg0 == 0) {
            field9379 = null;
        }
    }
}
