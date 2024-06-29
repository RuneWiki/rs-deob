import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class590 implements class346 {

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "Lnfa;")
    private class631 field8388;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field8384 = 0;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "[I")
    public static int[] field8385 = new int[4];

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public final void method587(int arg0) {
        if (arg0 == 22478) {
            field8383++;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Z")
    public final boolean method585(byte arg0) {
        field8387++;
        if (arg0 < 119) {
            this.method587(-85);
        }
        return true;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
    public static void method3447(int arg0) {
        if (arg0 == -16451) {
            field8385 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZI)V")
    public final void method1066(boolean arg0, int arg1) {
        if (arg0) {
            class627.field8857.method335(0, 0, class56.field732, class259.field4147, this.field8388.field8881, 0);
        }
        if (arg1 != -5506) {
            field8385 = null;
        }
        field8382++;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lnfa;)V")
    public class590(class631 arg0) {
        this.field8388 = arg0;
    }
}
