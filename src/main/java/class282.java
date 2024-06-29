import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class282 {

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "Lbaa;")
    public class579 field3673 = new class579();

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "Z")
    public boolean field3677 = false;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "Z")
    public static boolean field3678 = false;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "Lpw;")
    public static class89 field3675 = new class89(1);

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "Lra;")
    public static class361 field3679 = new class361(64, -1);

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "Lnj;")
    public static class415 field3680 = new class415(11, 15);

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V", line = 5)
    public static void method1689(int arg0) {
        field3675 = null;
        int var1 = -91 % ((arg0 - 55) / 53);
        field3680 = null;
        field3679 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 25)
    public static final void method1690(byte arg0) {
        class152.field1939++;
        field3672++;
        if (arg0 != -95) {
            method1690((byte) 111);
        }
        class11 var1 = class130.method931(class649.field9035, (byte) 54, class5.field33);
        var1.field114.method2352(true, 0);
        class100.method760(var1, -101);
    }
}
