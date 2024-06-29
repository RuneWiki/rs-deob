import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class153 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lhc;")
    public static class171 field2771 = new class171(500);

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "[Lfg;")
    public static class211[] field2783 = new class211[14];

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Lud;")
    public static class279 field2784 = class130.method1024("", 255);

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[I")
    public static int[] field2785 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "J")
    public long field2780;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lsf;")
    public class108 field2778;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lsf;")
    public class108 field2779;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lsf;")
    public class108 field2782;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lom;")
    public static class70 field2781;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([BB)[B", line = 5)
    public static final byte[] method1210(byte[] arg0, byte arg1) {
        field2776++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class25.method219(arg0, 0, var3, 0, var2);
        int var4 = -120 / ((arg1 + 16) / 63);
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 24)
    public static final void method1211(int arg0, int arg1) {
        field2772++;
        if (arg0 == 2) {
            class249.field4427.method1339(arg1, 19326);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 44)
    public static void method1212(byte arg0) {
        field2771 = null;
        field2781 = null;
        field2785 = null;
        field2783 = null;
        field2784 = null;
        if (arg0 > -55) {
            method1211(72, -40);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V", line = 95)
    public static final void method1213(int arg0, byte arg1) {
        field2773++;
        if (arg0 >= 0 && class33.field740.length > arg0) {
            int var2 = -94 / ((-arg1 - 67) / 48);
            class33.field740[arg0] = !class33.field740[arg0];
        }
    }
}
