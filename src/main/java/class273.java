import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class273 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field4190 = 50;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)Lma;", line = 7)
    public static final class5 method1927(byte arg0) {
        field4192++;
        int var1 = -41 % ((16 - arg0) / 46);
        try {
            return (class5) Class.forName("r").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILlm;)V", line = 30)
    public static final void method1928(int arg0, class210 arg1) {
        field4191++;
        class316.field4774 = arg1.method1448((byte) 10, "runes");
        if (arg0 != 50) {
            field4190 = -128;
        }
    }
}
