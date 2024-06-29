import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class788 extends class264 {

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "Lwq;")
    public static class176 field10825 = null;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "I")
    public static int field10830 = -1;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "F")
    public static float field10828;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "I")
    public static int field10821;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "I")
    public static int field10822;

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
    public static int field10823;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
    public static int field10826;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
    public static int field10827;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
    public static int field10829;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "I")
    public static int field10831;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "Lqb;")
    public static class233 field10824;

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(ILmfa;)V")
    public class788(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)V")
    public static void method4315(int arg0) {
        field10824 = null;
        field10825 = null;
        if (arg0 >= -110) {
            field10828 = -0.39295697F;
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field10821;
        int var2 = -111 / ((1 - arg0) / 41);
        if (super.field3733 != 1 && super.field3733 != 0) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field10822;
        if (arg0 != -38) {
            this.method660(76);
        }
        return 1;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)Z")
    public static final boolean method4316(boolean arg0) {
        ++field10829;
        if (class777.field10722) {
            try {
                if ((Boolean) class150.method1035(-19253, "showingVideoAd", class535.field7544)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return !arg0;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        super.field3733 = arg1;
        ++field10826;
        if (arg0 >= -114) {
            method4315(-29);
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lmfa;)V")
    public class788(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field10823;
        if (arg0 != 112) {
            field10828 = 0.25515297F;
        }
        return 1;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)I")
    public final int method4317(byte arg0) {
        if (arg0 > -31) {
            field10828 = -0.58380425F;
        }
        ++field10831;
        return super.field3733;
    }
}
