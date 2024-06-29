import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class315 {

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "Z")
    public static boolean field4627 = true;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
    public static final void method2104(int arg0, int arg1) {
        field4625++;
        class15 var2 = class294.field4263;
        synchronized (class294.field4263) {
            class294.field4263.method91(4, arg1);
        }
        class15 var3 = class446.field6372;
        synchronized (class446.field6372) {
            class446.field6372.method91(4, arg1);
        }
        if (arg0 != 17343) {
            method2105((byte) 107);
        }
        class15 var4 = class287.field4179;
        synchronized (class287.field4179) {
            class287.field4179.method91(4, arg1);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public static final void method2105(byte arg0) {
        int var1 = -87 % ((arg0 + 27) / 59);
        field4626++;
        if (class189.field2710) {
            return;
        }
        class56.field744 = true;
        if (class24.field304) {
            class241.field3553 = (float) ((int) class241.field3553 - 17 & 0xFFFFFFF0);
        } else {
            class198.field2835 += (-12.0F - class198.field2835) / 2.0F;
        }
        class189.field2710 = true;
    }
}
