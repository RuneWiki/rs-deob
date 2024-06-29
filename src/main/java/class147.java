import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class147 extends class43 {

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2715 = Calendar.getInstance();

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "Lkg;")
    public static class115 field2719 = new class115(16);

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "[Z")
    public static boolean[] field2720 = new boolean[8];

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    public static int field2721 = 0;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(Z)V")
    public static void method982(boolean arg0) {
        if (!arg0) {
            field2720 = null;
            field2719 = null;
            field2715 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)I")
    public static final int method983(boolean arg0, int arg1) {
        ++field2717;
        if ((~arg1 > -66 || arg1 > 90) && (~arg1 > -193 || ~arg1 < -223 || ~arg1 == -216)) {
            if (~arg1 == -160) {
                return 255;
            } else if (arg1 == 140) {
                return 156;
            } else {
                if (!arg0) {
                    method983(true, 113);
                }
                return arg1;
            }
        } else {
            return arg1 + 32;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class147() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
    public static final void method984(int arg0) {
        if (arg0 <= 109) {
            field2721 = 57;
        }
        ++field2714;
        class43.field770 = 0;
        class220.field4003 = 0;
        class187.method1196(-23940);
        class37.method266(0);
        class151.method997(29127);
        class19.method118(-1333036600);
        for (int var1 = 0; class43.field770 > var1; ++var1) {
            int var3 = class122.field2291[var1];
            if (~class30.field460 != ~class68.field1120[var3].field669) {
                class68.field1120[var3] = null;
            }
        }
        if (~class39.field630 != ~class118.field2241.field2133) {
            throw new RuntimeException("gpp1 pos:" + class118.field2241.field2133 + " psize:" + class39.field630);
        } else {
            for (int var2 = 0; class160.field2906 > var2; ++var2) {
                if (class68.field1120[class33.field527[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class160.field2906);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field2718;
        int[] var3 = super.field768.method1123(arg1 + arg1, arg0);
        if (super.field768.field3219) {
            class80.method493(var3, 0, class131.field2427, class2.field35[arg0]);
        }
        return var3;
    }
}
