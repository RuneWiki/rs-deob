import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class311 {

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field4833 = 127;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4832 = new String[500];

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "[I")
    public static int[] field4835 = new int[5];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Lgi;")
    public static class310 field4834;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Ljd;")
    public static class95 field4829;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lrj;")
    public static class269[] field4828;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 12)
    public static void method2132(int arg0) {
        int var1 = 59 / ((arg0 + 14) / 58);
        field4835 = null;
        field4834 = null;
        field4828 = null;
        field4832 = null;
        field4829 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 27)
    public static final void method2133(byte arg0) {
        class153.field2311.method750((byte) 126);
        if (arg0 <= 115) {
            field4829 = (class95) null;
        }
        field4836++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)[Lhk;", line = 39)
    public static final class42[] method2134(int arg0) {
        field4831++;
        if (arg0 != 5) {
            method2132(109);
        }
        class42[] var1 = new class42[class131.field2005];
        for (int var2 = 0; var2 < class131.field2005; var2++) {
            var1[var2] = new class42(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], class220.field3362[var2], class82.field1212);
        }
        class245.method1684(arg0 ^ 0xFA);
        return var1;
    }
}
