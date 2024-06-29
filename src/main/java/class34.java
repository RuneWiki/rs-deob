import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class34 {

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Z")
    public static boolean field414 = false;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Lvt;")
    public static class179 field413 = new class179(new byte[5000]);

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "Lsd;")
    public static class74 field416 = new class74(12, -2);

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "[I")
    public static int[] field417 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BC)Z")
    public static final boolean method173(byte arg0, char arg1) {
        field415++;
        if (arg0 == -2) {
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static void method174(byte arg0) {
        field417 = null;
        field416 = null;
        field413 = null;
        if (arg0 <= 71) {
            method174((byte) 77);
        }
    }
}
