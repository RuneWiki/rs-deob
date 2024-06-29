import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class269 extends class320 {

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[I")
    public static int[] field4302 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4304 = "wave2:";

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4300 = new String[200];

    @OriginalMember(owner = "client!f", name = "t", descriptor = "B")
    public byte field4307;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Ljava/lang/String;")
    public String field4301;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Ljava/lang/String;")
    public String field4308;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
    public static int[] field4306;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[Lwb;")
    public static class171[] field4305;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V", line = 29)
    public static void method1845(int arg0) {
        field4304 = null;
        field4306 = null;
        field4302 = null;
        if (arg0 != 0) {
            method1846(114, -37, 30);
        }
        field4300 = null;
        field4305 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Lw;", line = 45)
    public static final class297 method1846(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4146;
    }
}
