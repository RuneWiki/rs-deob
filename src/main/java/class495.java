import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class495 extends class263 {

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    private int field7351;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "Z")
    public static boolean field7347 = true;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "Z")
    public static boolean field7350 = false;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "Lok;")
    public static class74 field7353;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "[I")
    public static int[] field7349;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)[I", line = 6)
    public final int[] method33(int arg0, byte arg1) {
        if (arg1 < 40) {
            return null;
        } else {
            ++field7352;
            int[] var3 = super.field3917.method41(arg0, 1);
            if (super.field3917.field91) {
                class442.method2591(var3, 0, class367.field5597, this.field7351);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V", line = 28)
    public class495() {
        this(4096);
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V", line = 31)
    public static void method2943(int arg0) {
        if (arg0 != -3405) {
            method2943(-81);
        }
        field7349 = null;
        field7353 = null;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(I)V", line = 42)
    public class495(int arg0) {
        super(0, true);
        this.field7351 = 4096;
        this.field7351 = arg0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZLgk;)V", line = 65)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (!arg1) {
            field7347 = false;
        }
        ++field7348;
        if (arg0 == 0) {
            this.field7351 = (arg2.method2765(62) << 12) / 255;
        }
    }
}
