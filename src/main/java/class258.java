import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class258 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[Lgb;")
    public static class49[] field4136 = new class49[6];

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "J")
    public static long field4139 = 0L;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lck;")
    public static class119 field4135 = class298.method1987((byte) 114, ":");

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Lck;")
    public static class119 field4138 = class298.method1987((byte) 33, "blinken1:");

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 12)
    public static void method1653(int arg0) {
        field4136 = null;
        field4135 = null;
        if (arg0 < -28) {
            field4138 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 58)
    protected class258() {
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public abstract void method1651(int arg0, byte arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);
}
