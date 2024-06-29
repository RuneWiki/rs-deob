import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class579 extends class328 {

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "F")
    public static float field8256;

    @OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "I")
    public static int field8258;

    static {
        new class567("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "(I)V", line = 12)
    public static final void method3313(int arg0) {
        class173.field2512 = null;
        class399.field5940 = null;
        class359.field5104 = null;
        if (arg0 == 15731) {
            ++field8257;
            class371.field5363 = null;
            class173.field2513 = null;
            class69.field1306 = false;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)[I", line = 29)
    public final int[] method4(int arg0, int arg1) {
        ++field8254;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = -51 % ((arg1 - 48) / 56);
        if (super.field4720.field7109) {
            int var5 = class638.field9258[arg0];
            for (int var6 = 0; class449.field6539 > var6; ++var6) {
                var3[var6] = this.method3315(false, var5, class206.field2924[var6]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V", line = 62)
    public static final void method3314(String arg0, byte arg1, String arg2) {
        class490.field6891 = 1;
        class343.field4929 = -1;
        ++field8258;
        class480.method2765(false, 0, arg2, arg0);
        if (arg1 != -98) {
            method3316(88, -35);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZII)I", line = 76)
    private final int method3315(boolean arg0, int arg1, int arg2) {
        ++field8253;
        int var4 = arg1 * 57 + arg2;
        if (arg0) {
            this.method4(36, -46);
        }
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * 15731 * var5 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(II)Z", line = 90)
    public static final boolean method3316(int arg0, int arg1) {
        ++field8255;
        if (arg1 > -113) {
            return false;
        } else {
            for (class587 var2 = (class587) class432.field6356.method427(true); var2 != null; var2 = (class587) class432.field6356.method420(false)) {
                if (class393.method2383(-23131, var2.field8359) && (long) arg0 == var2.field8365) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V", line = 114)
    public class579() {
        super(0, true);
    }
}
