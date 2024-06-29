import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class253 extends class117 {

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "[Lhh;")
    public static class163[] field4432 = new class163[100];

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "Lhh;")
    private static class163 field4435 = class137.method1065("red:", 17);

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lhh;")
    public static class163 field4436 = field4435;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "Lhh;")
    public static class163 field4441 = class137.method1065("3D)2Softwarebibliothek gestartet)3", 17);

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "Lhh;")
    public static class163 field4438 = field4435;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "Lhh;")
    public static class163 field4440 = class137.method1065("Null", 17);

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "Lee;")
    public static class108 field4433;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "Lid;")
    public static class62 field4431;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "Lek;")
    public static class76 field4430;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)V")
    public static void method1720(int arg0) {
        field4435 = null;
        field4438 = null;
        field4436 = null;
        field4430 = null;
        field4431 = null;
        field4433 = null;
        field4432 = null;
        if (arg0 != -789221) {
            field4436 = null;
        }
        field4440 = null;
        field4441 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IZI)I")
    private final int method1721(int arg0, boolean arg1, int arg2) {
        ++field4434;
        int var4 = arg2 * 57 + arg0;
        if (arg1) {
            method1720(12);
        }
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * 15731 * var5 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field4437;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int var4 = class214.field3911[arg1];
            for (int var5 = 0; ~class143.field2702 < ~var5; ++var5) {
                var3[var5] = this.method1721(class26.field402[var5], false, var4) % 4096;
            }
        }
        return arg0 != -21393 ? null : var3;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class253() {
        super(0, true);
    }
}
