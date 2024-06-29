import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class424 {

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "[F")
    public static float[] field6230 = new float[2];

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "Ltm;")
    public static class334 field6231 = new class334(55, 17);

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "Ltm;")
    public static class334 field6235 = new class334(42, 6);

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "Ltm;")
    public static class334 field6233;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2648(int arg0, int arg1, int arg2) {
        field6232++;
        if (arg0 == -18044) {
            return (arg2 & 0x10000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(B)V", line = 25)
    public static void method2649(byte arg0) {
        field6235 = null;
        field6233 = null;
        field6230 = null;
        int var1 = 1 % ((59 - arg0) / 59);
        field6231 = null;
    }
}
