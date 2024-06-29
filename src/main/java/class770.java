import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class770 extends class230 {

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "S")
    public short field10593;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "S")
    public short field10592;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field10591;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field10595;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field10596;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field10597;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "Ljava/lang/Object;")
    public static Object field10598;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)V")
    public static void method4251(int arg0) {
        if (arg0 == -16802) {
            field10598 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z[Lsca;)I")
    public final int method1526(boolean arg0, class251[] arg1) {
        ++field10600;
        if (arg0) {
            field10598 = null;
        }
        return this.method1527((byte) -32, arg1, super.field3460 >> class732.field10110, super.field3470 >> class732.field10110);
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)Z")
    public final boolean method1534(int arg0) {
        if (arg0 != 382) {
            this.method73((class230) null, -69, true, 11, (class473) null, -94, 34);
        }
        ++field10595;
        return class592.field8338[(super.field3470 >> class732.field10110) + -class591.field8336 + class270.field3904][(super.field3460 >> class732.field10110) - class112.field1363 + class270.field3904];
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Loq;IZILha;II)V")
    public final void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6) {
        if (arg6 <= 96) {
            method4251(-104);
        }
        ++field10597;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V")
    public final void method81(byte arg0) {
        ++field10591;
        if (arg0 == 29) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)V")
    public static final void method4252(int arg0) {
        if (arg0 != 13593) {
            method4252(-96);
        }
        if (class409.field5750 != null) {
            class409.field5750.method962(false);
        }
        ++field10599;
        if (class308.field4451 != null) {
            while (true) {
                try {
                    class308.field4451.join();
                    return;
                } catch (InterruptedException var1) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIIIII)V")
    public class770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field10593 = (short) arg5;
        super.field3470 = arg0;
        super.field3469 = (byte) arg4;
        this.field10592 = (short) arg6;
        super.field3460 = arg2;
        super.field3464 = arg1;
        super.field3467 = (byte) arg3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method1525(class473 arg0, byte arg1) {
        ++field10596;
        return arg1 != -127 ? true : class438.method2631(super.field3469, this.method78((byte) -44), super.field3460 >> class732.field10110, (byte) 14, super.field3470 >> class732.field10110);
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(Z)Z")
    public final boolean method83(boolean arg0) {
        ++field10594;
        if (arg0) {
            field10598 = null;
        }
        return false;
    }
}
