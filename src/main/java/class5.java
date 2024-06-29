import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "B")
    public static byte field95 = 0;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lke;")
    public static class65 field94 = class1.method17("", -114);

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lke;")
    private static class65 field97 = class1.method17("Loaded interfaces", -121);

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Z")
    public static volatile boolean field90 = true;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "[Lne;")
    public static class83[] field99 = new class83[4];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lke;")
    public static class65 field88 = class1.method17("und loggen sich dann erneut ein)3", -122);

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[Lke;")
    public static class65[] field101 = new class65[100];

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lke;")
    public static class65 field92 = field97;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
    public static int[] field100 = new int[128];

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lke;")
    public static class65 field104 = class1.method17(" x ", -121);

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lg;")
    public static class39 field98;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
    public static boolean field93;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
    public static int[] field89;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[I")
    public static int[] field91;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
    public static int[] field96;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lnb;", line = 23)
    public static final class79 method36(int arg0, int arg1) {
        field103++;
        class79 var2 = (class79) class92.field2427.method833((byte) -53, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -121) {
            method38((byte) -29);
        }
        byte[] var3 = class70.field1821.method477(13, (byte) 127, arg0);
        class79 var4 = new class79();
        var4.field2103 = arg0;
        if (var3 != null) {
            var4.method694(new class39(var3), (byte) 44);
        }
        class92.field2427.method836((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I", line = 55)
    public static int method37(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 82)
    public static void method38(byte arg0) {
        field92 = null;
        field94 = null;
        field104 = null;
        field96 = null;
        if (arg0 != -110) {
            method38((byte) -7);
        }
        field91 = null;
        field88 = null;
        field99 = null;
        field98 = null;
        field97 = null;
        field89 = null;
        field101 = null;
        field100 = null;
    }
}
