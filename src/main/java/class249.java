import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class249 extends class61 {

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public int field4486 = 0;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public int field4489 = -1;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field4488 = 0;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Llc;")
    public static class143 field4498 = class66.method374("niveau ", -1);

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Llc;")
    public static class143 field4501 = class66.method374("Fichiers config charg-Bs", -1);

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field4493 = 0;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public int field4491;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lia;")
    public static class181 field4490;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static void method1658(boolean arg0) {
        field4501 = null;
        if (!arg0) {
            method1659(19, 58, true);
        }
        field4498 = null;
        field4490 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1659(int arg0, int arg1, boolean arg2) {
        field4499++;
        if (arg2) {
            method1659(99, 44, true);
        }
        return (arg1 >> arg0 + 1 & 0x1) != 0;
    }
}
