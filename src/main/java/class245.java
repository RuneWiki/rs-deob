import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class245 {

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[I")
    public static int[] field4307 = new int[5];

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lp;")
    public static class280 field4309 = class18.method140((byte) -125, "d-Broulement:");

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static volatile int field4310 = 0;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lsb;")
    public static class221 field4305 = new class221(500);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "J")
    public long field4303;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lrk;")
    public class265 field4301;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/Object;Lug;I)V")
    public static final void method1664(Object arg0, class198 arg1, int arg2) {
        if (arg2 < 6) {
            method1665((byte) -116);
        }
        field4302++;
        if (arg1.field3468 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field3468.peekEvent() != null; var3++) {
            class159.method1130(1L, 0);
        }
        if (arg0 != null) {
            arg1.field3468.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method1665(byte arg0) {
        field4305 = null;
        field4309 = null;
        field4307 = null;
        if (arg0 != 30) {
            field4307 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static final void method1666(byte arg0) {
        field4304++;
        int var1 = -99 % ((-arg0 - 33) / 46);
        class232.field4055.method42(110);
        class253.field4441 = 1;
        class268.field4707 = null;
    }
}
