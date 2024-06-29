import jaclib.memory.Buffer;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class240 extends class55 implements class463 {

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "Ldr;")
    private class629 field3468;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
    public final int method35(byte arg0) {
        ++field3463;
        return arg0 <= 71 ? 34 : super.method35((byte) 95);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lfc;Ldr;Z)V")
    public class240(class642 arg0, class629 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field3468 = arg1;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)V")
    public final void method602(int arg0, int arg1) {
        super.method602(arg0, this.field3468.field8914 * arg1);
        ++field3466;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method1440(boolean arg0, int arg1) {
        ++field3467;
        return arg1 != -15169 ? null : super.method603(arg0, 35040, super.field866.field9122);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Canvas;ILd;II)Lha;")
    public static final class475 method1608(Canvas arg0, int arg1, class103 arg2, int arg3, int arg4) {
        ++field3469;
        return arg1 < 112 ? null : new class680(arg0, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
    public final void method32(int arg0) {
        super.method32(arg0);
        ++field3464;
        if (arg0 != 16479) {
            this.field3468 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)Z")
    public final boolean method1441(int arg0) {
        if (arg0 != 32416) {
            return false;
        } else {
            ++field3470;
            return super.method604((byte) -22, super.field866.field9122);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Ldr;")
    public final class629 method1442(byte arg0) {
        if (arg0 > -28) {
            return null;
        } else {
            ++field3465;
            return this.field3468;
        }
    }
}
