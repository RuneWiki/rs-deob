import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class304 extends class577 {

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "[I")
    public static int[] field4388 = new int[250];

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "I")
    public int field4379;

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "Lwia;")
    public static class791 field4387;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "[I")
    public int[] field4380;

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "[I")
    public int[] field4383;

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "[I")
    public int[] field4384;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "[Lhu;")
    public class141[] field4377;

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "[Lhu;")
    public class141[] field4385;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "[[[B")
    public byte[][][] field4382;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(II)I")
    public static final int method1971(int arg0, int arg1) {
        if (arg0 != 0) {
            method1971(6, -39);
        }
        field4386++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BLnq;)Z")
    public static final boolean method1972(byte arg0, class484 arg1) {
        field4378++;
        int var2 = 63 % ((arg0 + 45) / 39);
        class282 var3 = class277.field4038.method3919(true, arg1.method1483(24853));
        if (var3.field4108 == -1) {
            return true;
        } else {
            class784 var4 = class618.field8642.method4326(34, var3.field4108);
            return var4.field10763 == -1 ? true : var4.method4301((byte) -128);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
    public static void method1973(int arg0) {
        field4388 = null;
        field4387 = null;
        if (arg0 != -1) {
            method1973(87);
        }
    }
}
