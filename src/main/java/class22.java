import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class22 extends class191 {

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "Ljava/lang/Object;")
    private Object field333;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "Lda;")
    public static class275 field332 = class255.method1672(119, "_labels");

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Lrg;")
    public static class84 field336 = new class84();

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)V")
    public static final void method135(boolean arg0, int arg1) {
        class160.method1116(true);
        field335++;
        if (class200.field3427 != 30 && class200.field3427 != 25) {
            return;
        }
        class152.field2659++;
        if (class152.field2659 < 50 && !arg0) {
            return;
        }
        if (arg1 >= -15) {
            method135(true, -97);
        }
        class152.field2659 = 0;
        if (!class189.field3264 && class52.field866 != null) {
            class210.field3565++;
            class149.field2597.method526((byte) -84, 173);
            try {
                class52.field866.method1400(class149.field2597.field1381, 0, 5000, class149.field2597.field1392);
                class149.field2597.field1392 = 0;
            } catch (IOException var2) {
                class189.field3264 = true;
            }
        }
        class160.method1116(true);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Z")
    public final boolean method136(byte arg0) {
        if (arg0 > -109) {
            this.field333 = null;
        }
        field331++;
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V")
    public static void method137(int arg0) {
        field332 = null;
        if (arg0 < 37) {
            field336 = null;
        }
        field336 = null;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method138(int arg0) {
        field338++;
        if (arg0 != 50) {
            this.method138(109);
        }
        return this.field333;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lhd;B)V")
    public static final void method139(class95 arg0, byte arg1) {
        class31.field474 = arg0;
        if (arg1 < -64) {
            field330++;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class22(Object arg0) {
        this.field333 = arg0;
    }
}
