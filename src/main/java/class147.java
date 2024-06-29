import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class147 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lqfa;")
    public static class98 field2111 = new class98(73, 6);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[Luu;")
    public static class285[] field2114 = new class285[4];

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2116 = -1;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Z")
    public static boolean field2115 = false;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 7)
    public static void method1017(int arg0) {
        field2111 = null;
        field2114 = null;
        if (arg0 != 0) {
            method1018(-115);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 22)
    public static final void method1018(int arg0) {
        class319.field4414 = (int) ((double) class336.field4683 * 34.46D);
        field2110++;
        class258.field3729 = 200;
        class319.field4414 <<= 0x2;
        if (class268.field3831.method462()) {
            class319.field4414 += 512;
        }
        int var1 = -40 / ((57 - arg0) / 34);
        class136.method966(false, (byte) 122);
    }
}
