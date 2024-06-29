import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class508 {

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Z")
    public static boolean field7011 = true;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lsk;")
    public static class452 field7012 = new class452(2);

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field7014 = 1400;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lnq;")
    public static class650 field7015 = null;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field7013 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 3)
    public static void method2884(int arg0) {
        if (arg0 == -13395) {
            field7012 = null;
            field7015 = null;
            field7013 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBI)Z", line = 21)
    public static final boolean method2885(int arg0, byte arg1, int arg2) {
        int var3 = 4 % ((36 - arg1) / 49);
        field7009++;
        return (arg2 & 0x70000) != 0 | class339.method1983(true, arg2, arg0) || class400.method2291(6410, arg2, arg0);
    }
}
