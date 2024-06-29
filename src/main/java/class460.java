import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class460 {

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "Lkr;")
    public static class602 field6378 = new class602(115, -2);

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIJ)Ljava/lang/String;", line = 4)
    public static final String method2802(byte arg0, int arg1, long arg2) {
        class569.method3335(25856, arg2);
        if (arg0 != 71) {
            field6378 = null;
        }
        field6377++;
        int var4 = class614.field8252.get(5);
        int var5 = class614.field8252.get(2) + 1;
        int var6 = class614.field8252.get(1);
        int var7 = class614.field8252.get(11);
        int var8 = class614.field8252.get(12);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V", line = 30)
    public static void method2803(int arg0) {
        field6378 = null;
        if (arg0 != 10) {
            field6378 = null;
        }
    }
}
