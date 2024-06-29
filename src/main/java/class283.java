import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class283 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lfd;")
    public static class194 field3873;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lam;")
    public static class286 field3875;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lnj;", line = 8)
    public static final class228 method1668(int arg0, int arg1) {
        if (arg0 > -58) {
            field3873 = null;
        }
        field3874++;
        class228 var2 = (class228) class162.field2073.method616(121, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class213.field2884.method1687(arg1, 36, 255);
        class228 var4 = new class228();
        var4.field3135 = arg1;
        if (var3 != null) {
            var4.method1241(new class250(var3), 77);
        }
        var4.method1235(true);
        class162.field2073.method615((byte) -117, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 38)
    public static void method1669(byte arg0) {
        field3873 = null;
        field3875 = null;
        int var1 = 55 % ((arg0 + 39) / 63);
    }
}
