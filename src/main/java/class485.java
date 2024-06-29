import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class485 extends class175 {

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field7096 = 1;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lvp;")
    public static class123 field7100 = new class123(2, 7);

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Z")
    public static boolean field7099;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method2895(byte arg0) {
        if (arg0 != 2) {
            field7096 = -11;
        }
        field7100 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)I")
    public static final int method2896(int arg0, int arg1) {
        if (class138.field2091 != null) {
            class138.field2091.method694(false);
            class138.field2091 = null;
        }
        field7101++;
        class258.field3722++;
        if (arg0 < class258.field3722) {
            class169.field2541 = 0;
            class258.field3722 = 0;
            return arg1;
        }
        class169.field2541 = 0;
        if (class447.field6546 == class310.field4445) {
            class310.field4445 = class291.field4173;
        } else {
            class310.field4445 = class447.field6546;
        }
        return -1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(FFIF)I")
    public static final int method2897(float arg0, float arg1, int arg2, float arg3) {
        field7098++;
        float var4 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var5 = ((float) arg2 > arg0) ? -arg0 : arg0;
        float var6 = arg1 < 0.0F ? -arg1 : arg1;
        if (var5 > var4 && var5 > var6) {
            return (arg0 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return (arg1 > 0.0F) ? 2 : 3;
        } else if ((arg3 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILna;)V")
    public static final void method2898(int arg0, class35 arg1) {
        class529.field7807[arg0] = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ltn;IBI)V")
    public static final void method2899(class58 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 15) {
            field7099 = true;
        }
        field7097++;
        if (class13.field221 != null || class314.field4487 || arg0 == null || class467.method2784(true, arg0) == null) {
            return;
        }
        class13.field221 = arg0;
        class216.field3103 = class467.method2784(true, arg0);
        class393.field5817 = 0;
        class516.field7584 = false;
        class95.field1556 = arg3;
        class442.field6484 = arg1;
    }
}
