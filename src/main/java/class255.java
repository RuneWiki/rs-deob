import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class255 extends class170 {

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "I")
    private int field4397;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "Lmh;")
    private static class128 field4389 = class22.method156(125, "Loaded update list");

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "Lmh;")
    public static class128 field4390 = class22.method156(124, "Okay");

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "[I")
    public static int[] field4396 = new int[50];

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    public static int field4392 = 0;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "Lmh;")
    public static class128 field4393 = field4389;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILbg;B)V", line = 11)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field4394++;
        if (arg0 == 0) {
            this.field4397 = (arg1.method1325(arg2 + 7614) << 12) / 255;
        }
        if (arg2 != 13) {
            field4396 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)[I", line = 44)
    public final int[] method69(byte arg0, int arg1) {
        field4395++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (arg0 != 85) {
            field4396 = (int[]) null;
        }
        if (this.field2977.field4552) {
            class224.method1543(var3, 0, class185.field3225, this.field4397);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V", line = 67)
    public static final void method1801(int arg0) {
        field4388++;
        if (arg0 != 0) {
            field4393 = (class128) null;
        }
        class118.field1996.method1834(17);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 89)
    public class255() {
        this(4096);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V", line = 96)
    private class255(int arg0) {
        super(0, true);
        this.field4397 = 4096;
        this.field4397 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V", line = 115)
    public static void method1802(int arg0) {
        field4396 = null;
        field4393 = null;
        field4390 = null;
        if (arg0 == 50) {
            field4389 = null;
        }
    }
}
