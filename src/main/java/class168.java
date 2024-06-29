import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class168 {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lnj;")
    public static class415 field2094 = new class415(45, 3);

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lra;")
    public static class361 field2097 = new class361(17, 6);

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lra;")
    public static class361 field2099 = new class361(74, -2);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "F")
    public static float field2095;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "F")
    public static float field2098;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[[[Lgn;")
    public static class530[][][] field2096;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 3)
    public static void method1157(int arg0) {
        field2097 = null;
        field2094 = null;
        field2096 = null;
        field2099 = null;
        if (arg0 != 1) {
            field2097 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)I", line = 17)
    public static final int method1158(int arg0, byte arg1) {
        field2093++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else if (arg1 == 67) {
            throw new IllegalArgumentException("");
        } else {
            return 16;
        }
    }
}
