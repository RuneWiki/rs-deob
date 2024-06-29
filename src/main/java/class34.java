import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class34 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lqj;")
    public static class196 field409 = class80.method502("(U2", -48);

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lqj;")
    public static class196 field412 = class80.method502("<col=80ff00>", -48);

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lqj;")
    public static class196 field411 = class80.method502("settings=", -48);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[J")
    public static long[] field410 = new long[500];

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lbk;")
    public static class136 field414;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[S")
    public static short[] field413;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)[B")
    public abstract byte[] method177(int arg0);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static void method178(boolean arg0) {
        field409 = null;
        field413 = null;
        field410 = null;
        if (arg0) {
            field412 = null;
        }
        field414 = null;
        field411 = null;
        field412 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[B)V")
    public abstract void method179(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Lhh;")
    public static final class159 method180(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class159 var4 = var3.field839;
            var3.field839 = null;
            return var4;
        }
    }
}
