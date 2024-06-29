import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public abstract class class284 {

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public static int field3763 = 0;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "[[I")
    public static int[][] field3767;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)[Lse;")
    public static final class162[] method1697(int arg0) {
        field3765++;
        if (arg0 != -9564) {
            method1697(-110);
        }
        return new class162[] { class241.field3353, class241.field3356, class241.field3357, class241.field3358, class241.field3359, class241.field3360, class241.field3361, class241.field3362, class241.field3363, class241.field3364, class241.field3365, class241.field3366, class241.field3367, class241.field3368 };
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)I")
    public abstract int method805(int arg0);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)Z")
    public final boolean method1698(boolean arg0) {
        field3766++;
        if (arg0) {
            this.method811(-63);
        }
        return this.method815(-127) || this.method811(-4943) || this.method808((byte) -65);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)V")
    public static void method1699(byte arg0) {
        if (arg0 == -51) {
            field3767 = null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Z")
    public abstract boolean method808(byte arg0);

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V")
    public abstract void method807(int arg0);

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(B)Lfi;")
    public abstract class12 method802(byte arg0);

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "(I)V")
    public abstract void method809(int arg0);

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "(I)Z")
    public abstract boolean method815(int arg0);

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "(B)V")
    public static final void method1700(byte arg0) {
        field3761++;
        int var1 = 45 / ((75 - arg0) / 33);
        if (!class627.field8949) {
            class627.field8949 = true;
            class263.field3586 = true;
            class675.field9508 += (-class675.field9508 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "(I)Z")
    public abstract boolean method811(int arg0);

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "(I)I")
    public abstract int method806(int arg0);
}
