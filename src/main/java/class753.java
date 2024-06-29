import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class753 {

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "[Lao;")
    public static class534[] field10380 = new class534[4];

    @OriginalMember(owner = "client!ika", name = "e", descriptor = "I")
    public static int field10383 = 0;

    @OriginalMember(owner = "client!ika", name = "f", descriptor = "Z")
    public static boolean field10384 = false;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "I")
    public static int field10379;

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "Ld;")
    public static class101 field10382;

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "[Lwp;")
    public static class455[] field10381;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(Z)V", line = 8)
    public static void method4159(boolean arg0) {
        field10380 = null;
        field10381 = null;
        field10382 = null;
        if (arg0) {
            field10380 = null;
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "([BB)[B", line = 20)
    public static final byte[] method4160(byte[] arg0, byte arg1) {
        field10379++;
        if (arg0 == null) {
            return null;
        }
        byte[] var2 = new byte[arg0.length];
        class335.method2118(arg0, 0, var2, 0, arg0.length);
        if (arg1 < 114) {
            field10381 = null;
        }
        return var2;
    }
}
