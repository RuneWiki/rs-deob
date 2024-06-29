import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class311 extends class285 {

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    private int field4850;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field4845;

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V", line = 6)
    public class311(int arg0) {
        super(0, true);
        this.field4850 = 4096;
        this.field4850 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)[I", line = 16)
    public final int[] method60(boolean arg0, int arg1) {
        field4852++;
        int[] var3 = this.field4573.method1116(97, arg1);
        if (this.field4573.field2420) {
            class9.method49(var3, 0, class287.field4599, this.field4850);
        }
        return arg0 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(ZI)I", line = 44)
    public static final int method2193(boolean arg0, int arg1) {
        if (!arg0) {
            field4845 = (String[]) null;
        }
        field4846++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 56)
    public class311() {
        this(4096);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLjj;I)V", line = 73)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4850 = (arg1.method286((byte) -113) << 12) / 255;
        }
        if (!arg0) {
            field4845 = (String[]) null;
        }
        field4847++;
    }

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "(I)V", line = 95)
    public static void method2194(int arg0) {
        field4845 = null;
        if (arg0 != 4096) {
            field4848 = 67;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)Z", line = 106)
    public static final boolean method2195(byte arg0, int arg1) {
        field4849++;
        if (arg1 >= 0 && arg1 < class258.field4142.length) {
            if (arg0 < 87) {
                field4845 = (String[]) null;
            }
            return class258.field4142[arg1];
        } else {
            return false;
        }
    }
}
