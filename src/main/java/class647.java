import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class class647 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lea;")
    public static class474 field9360 = new class474("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Z")
    public static boolean field9366 = false;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field9370 = 0;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "[I")
    public static int[] field9371 = new int[14];

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "F")
    public static float field9369;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "Lkea;")
    public static class203 field9367;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)Z", line = 8)
    public static final boolean method3706(byte arg0, int arg1) {
        if (arg0 > -36) {
            method3706((byte) -41, -102);
        }
        field9365++;
        return arg1 == 2 || arg1 == 6 || arg1 == 9;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Loa;Z)V", line = 20)
    public static final void method3707(class605 arg0, boolean arg1) {
        field9364++;
        if (!arg1 && class600.field8763 != class439.field6548.field1757 && class431.field6408 != null && class223.method1454(-94, arg0, class439.field6548.field1757)) {
            class600.field8763 = class439.field6548.field1757;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)V", line = 44)
    public static void method3708(boolean arg0) {
        field9371 = null;
        if (!arg0) {
            method3707(null, false);
        }
        field9367 = null;
        field9360 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z", line = 74)
    public static final boolean method3709(int arg0, int arg1, int arg2) {
        field9363++;
        if ((class443.field6617[1][arg0][arg1] & 0x2) == 0) {
            if (arg2 != -17206) {
                field9367 = null;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z", line = 98)
    public final boolean method3710(byte arg0) {
        field9362++;
        if (arg0 < 89) {
            return true;
        } else {
            return this.method782((byte) -5) || this.method785(96) || this.method781(127);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)Lhl;")
    public abstract class458 method780(boolean arg0);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Z")
    public abstract boolean method781(int arg0);

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
    public abstract void method787(int arg0);

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)Z")
    public abstract boolean method785(int arg0);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Z")
    public abstract boolean method782(byte arg0);

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)I")
    public abstract int method777(byte arg0);

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V")
    public abstract void method779(int arg0);

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)I")
    public abstract int method778(int arg0);
}
