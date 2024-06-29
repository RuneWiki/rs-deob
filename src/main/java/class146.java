import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class146 extends class170 {

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "[[Z")
    public static boolean[][] field2500 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "Lmh;")
    public static class128 field2501 = class22.method156(124, "rot:");

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    public static int field2504 = 0;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static volatile int field2499 = 0;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "I")
    public static int field2506 = 0;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "[[Lac;")
    public static class154[][] field2502;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIZ)I", line = 5)
    private final int method980(int arg0, int arg1, boolean arg2) {
        field2503++;
        if (arg2) {
            return 69;
        } else {
            int var4 = arg0 + (arg1 * 57);
            int var5 = var4 << 1 ^ var4;
            return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lcf;I)V", line = 26)
    public static final void method981(class123 arg0, int arg1) {
        field2505++;
        class3 var2 = (class3) class203.field3585.method728(false, arg0.field2079.method819((byte) 110));
        if (var2 == null) {
            class267.method1864(arg0.field450[0], (class38) null, 0, arg0, (class115) null, 0, class133.field2315, arg0.field422[0]);
        } else {
            var2.method16(26972);
        }
        int var3 = -86 / ((32 - arg1) / 43);
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V", line = 47)
    public static void method982(int arg0) {
        field2500 = (boolean[][]) null;
        field2501 = null;
        int var1 = -119 % ((-arg0 - 62) / 47);
        field2502 = (class154[][]) null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)[I", line = 62)
    public final int[] method69(byte arg0, int arg1) {
        field2507++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int var4 = class307.field5221[arg1];
            for (int var5 = 0; var5 < class185.field3225; var5++) {
                var3[var5] = this.method980(class118.field2002[var5], var4, false) % 4096;
            }
        }
        if (arg0 != 85) {
            method981((class123) null, 42);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 97)
    public class146() {
        super(0, true);
    }
}
