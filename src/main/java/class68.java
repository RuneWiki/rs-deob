import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class68 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[S")
    public static short[] field991 = new short[256];

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static volatile int field992 = 0;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field989 = 1;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "F")
    public static float field993;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lco;", line = 14)
    public static final class298 method554(int arg0, int arg1) {
        field990++;
        class298 var2 = (class298) class261.field3891.method551(0, (long) arg0);
        int var3 = 71 / ((-arg1) / 37);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class93.field1293.method2520(5, arg0, (byte) -25);
        class298 var5 = new class298();
        if (var4 != null) {
            var5.method2115(new class190(var4), 0);
        }
        class261.field3891.method547((long) arg0, -1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 84)
    public static void method555(byte arg0) {
        field991 = null;
        if (arg0 <= 82) {
            method555((byte) 123);
        }
    }
}
