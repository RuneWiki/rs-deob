import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class280 {

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lfd;")
    private class365 field4097;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "J")
    public long field4098;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[I")
    public static int[] field4093 = new int[1000];

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lho;")
    public static class102 field4095 = new class102(1, 2, 2, 0);

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "B")
    public static byte field4100;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 3)
    public static void method1794(int arg0) {
        field4093 = null;
        field4095 = null;
        if (arg0 != 0) {
            method1795(null, (byte) 100, null);
        }
    }

    @OriginalMember(owner = "client!wl", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() throws Throwable {
        field4099++;
        this.field4097.method2256(-34844, this.field4098);
        super.finalize();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Let;BLjava/awt/Frame;)V", line = 30)
    public static final void method1795(class419 arg0, byte arg1, Frame arg2) {
        while (true) {
            class449 var3 = arg0.method2550((byte) -64, arg2);
            while (var3.field6617 == 0) {
                class213.method1462(10L, -5184);
            }
            if (var3.field6617 == 1) {
                field4094++;
                arg2.setVisible(false);
                if (arg1 != -62) {
                    field4095 = null;
                }
                arg2.dispose();
                return;
            }
            class213.method1462(100L, -5184);
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lfd;JI)V", line = 58)
    public class280(class365 arg0, long arg1, int arg2) {
        this.field4097 = arg0;
        this.field4098 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIII)V", line = 77)
    public static final void method1796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class289.field4153 = arg3;
        class372.field5533 = arg0;
        class224.field3281 = arg4;
        class380.field5616 = arg1;
        class122.field1788 = arg2;
        if (arg6 < 70) {
            method1796(114, 61, 22, 8, -106, -13, -93);
        }
        class236.field3462 = arg5;
        field4102++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)Lsd;", line = 94)
    public static final class62 method1797(byte arg0, int arg1, int arg2) {
        field4096++;
        class62 var3 = new class62();
        var3.field728 = -1;
        var3.field722 = arg1 + 1 + 5;
        var3.field729 = arg2 + 1 + 5;
        if (arg0 > -117) {
            return null;
        } else {
            var3.field733 = -1;
            var3.field721 = new int[var3.field729][var3.field722];
            var3.method566(-51);
            return var3;
        }
    }
}
