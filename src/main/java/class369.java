import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class369 extends class276 {

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "[B")
    public byte[] field5716;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field5717 = 0;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Llo;")
    public static class306 field5714 = new class306("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "F")
    public static float field5718;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 8)
    public static void method2338(byte arg0) {
        if (arg0 != -36) {
            method2339(122, -55);
        }
        field5714 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([B)V", line = 17)
    public class369(byte[] arg0) {
        this.field5716 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)V", line = 26)
    public static final void method2339(int arg0, int arg1) {
        field5715++;
        class266 var2 = class308.method1961(true, arg1, 9);
        int var3 = -75 / ((arg0 - 14) / 51);
        var2.method1778(17991);
    }
}
