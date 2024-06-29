import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class249 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lcd;")
    private static class64 field4332 = class44.method335((byte) 71, "Loading fonts )2 ");

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4333 = 2;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[S")
    public static short[] field4330 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lcd;")
    public static class64 field4329 = class44.method335((byte) 71, "hint_mapedge");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[Z")
    public static boolean[] field4328 = new boolean[100];

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lcd;")
    public static class64 field4334 = field4332;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 18)
    public static void method1793(int arg0) {
        field4328 = null;
        field4334 = null;
        if (arg0 != -6327) {
            field4328 = (boolean[]) null;
        }
        field4332 = null;
        field4329 = null;
        field4330 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)I")
    public abstract int method740(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public abstract void method736(byte arg0);
}
