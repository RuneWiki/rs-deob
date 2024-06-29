import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class609 {

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field8964 = 0;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "Lkp;")
    public static class464 field8962 = new class464();

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "Lqu;")
    public static class364 field8965 = new class364(58, 7);

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "Lnj;")
    public static class487 field8966 = new class487("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "Ldw;")
    public static class122 field8967;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
    public static void method3541(int arg0) {
        field8965 = null;
        field8966 = null;
        if (arg0 < 36) {
            field8966 = null;
        }
        field8962 = null;
        field8967 = null;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)I")
    public static final int method3542(int arg0) {
        if (arg0 != 14) {
            method3543(-9, null);
        }
        field8961++;
        return 14;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILdda;)V")
    public static final void method3543(int arg0, class597 arg1) {
        class463.field6690 = arg1;
        field8963++;
        if (arg0 != 16893) {
            method3542(63);
        }
    }
}
