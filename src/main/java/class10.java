import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class10 extends class206 {

    @OriginalMember(owner = "client!em", name = "w", descriptor = "Lwa;")
    public class75 field130;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Lwa;")
    private static class75 field123 = class66.method560(" ", false);

    @OriginalMember(owner = "client!em", name = "s", descriptor = "[Lul;")
    public static class39[] field126 = new class39[27];

    @OriginalMember(owner = "client!em", name = "z", descriptor = "[I")
    public static int[] field133 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Lwa;")
    public static class75 field128 = field123;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "F")
    public static float field127;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "J")
    public static long field132;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)Z", line = 5)
    public static final boolean method48(int arg0, boolean arg1) {
        if (!arg1) {
            return false;
        }
        field129++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class99.field1646[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1007;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Llj;ILcb;Lcb;)V", line = 30)
    public static final void method49(class46 arg0, int arg1, class267 arg2, class267 arg3) {
        class54.field901 = arg0;
        class158.field2707 = arg3;
        if (arg1 != 841) {
            field132 = 18L;
        }
        field131++;
        class172.field2896 = arg2;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)V", line = 51)
    public static final void method50(int arg0) {
        field134++;
        if (class26.field346 > 0) {
            class67.method574((byte) 120);
            return;
        }
        class292.field5024 = class35.field513;
        class35.field513 = null;
        class52.method380(80, 40);
        if (arg0 != 1) {
            field126 = (class39[]) null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([FB)[F", line = 86)
    public static final float[] method51(float[] arg0, byte arg1) {
        field124++;
        if (arg1 >= -75) {
            method48(98, true);
        }
        if (arg0 == null) {
            return null;
        } else {
            float[] var2 = new float[arg0.length];
            class231.method1686(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 109)
    public static void method52(byte arg0) {
        field123 = null;
        field126 = null;
        if (arg0 >= 21) {
            field133 = null;
            field128 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 131)
    public class10() {
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lwa;I)V", line = 133)
    public class10(class75 arg0, int arg1) {
        this.field130 = arg0;
    }
}
