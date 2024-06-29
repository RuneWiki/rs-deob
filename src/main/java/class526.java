import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class526 extends class381 {

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[B")
    public byte[] field7478;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lvg;")
    public static class622 field7477 = new class622(84, 6);

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "D")
    public static double field7479 = -1.0D;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field7481 = 2;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lfv;")
    public static class623 field7480;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method2982(byte arg0) {
        field7477 = null;
        field7480 = null;
        if (arg0 != 116) {
            field7480 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
    public class526(byte[] arg0) {
        this.field7478 = arg0;
    }
}
