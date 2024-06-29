import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class267 {

    @OriginalMember(owner = "client!js", name = "f", descriptor = "Lrb;")
    public static class379 field3494 = new class379("RC", 1);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Ldf;")
    public static class595 field3489;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "[Ldh;")
    public static class346[] field3491;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)I", line = 8)
    public static final int method1594(int arg0, int arg1, int arg2, int arg3) {
        field3490++;
        if (arg3 != -15763) {
            return -4;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(CII)I", line = 41)
    public static final int method1595(char arg0, int arg1, int arg2) {
        field3492++;
        if (arg1 != 20932) {
            return 106;
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V", line = 61)
    public static final void method1596(byte arg0) {
        class386.field5153.method2619((byte) 13);
        field3493++;
        class420.method2373(98);
        if (arg0 != 49) {
            method1596((byte) -60);
        }
        class220.field2872 = 0;
        class315.field4223 = null;
        class97.field1175 = null;
        class289.field3807.field2219 = 0;
        class630.field8724 = null;
        class422.field5543 = 0;
        class116.method680((byte) -68);
        class226.field2935 = null;
        field3491 = null;
        class354.field4728 = 0;
        class94.field1142 = 0;
        class427.field5757 = 0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 100)
    public static void method1597(int arg0) {
        field3494 = null;
        field3491 = null;
        field3489 = null;
        if (arg0 < 64) {
            method1596((byte) -24);
        }
    }
}
