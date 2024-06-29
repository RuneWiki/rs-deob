import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class256 extends class243 {

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    private int field4492;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "[I")
    public static int[] field4482 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lub;")
    public static class227 field4490 = class257.method1749(" ", 17263);

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "Lub;")
    private static class227 field4491 = class257.method1749("glow3:", 17263);

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "Lub;")
    public static class227 field4481 = field4491;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "Lub;")
    public static class227 field4483 = field4491;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "[I")
    public static int[] field4489;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
    private class256(int arg0) {
        super(0, true);
        this.field4492 = 4096;
        this.field4492 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static final void method1741(int arg0) {
        ++field4488;
        if (class102.field1793) {
            class102.field1793 = false;
            if (arg0 != 255) {
                method1743((byte) -105);
            }
            class179.field3063 = null;
            class60.field1115 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class256() {
        this(4096);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(Z)V")
    public static void method1742(boolean arg0) {
        field4490 = null;
        if (!arg0) {
            field4483 = null;
            field4481 = null;
            field4489 = null;
            field4491 = null;
            field4482 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field4492 = (arg0.method1471(255) << 12) / 255;
        }
        if (arg1) {
            method1742(true);
        }
        ++field4486;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)I")
    public static final int method1743(byte arg0) {
        ++field4484;
        return arg0 != -22 ? 79 : 2;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field4485;
        int var3 = -128 % ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            class68.method425(var4, 0, class212.field3586, this.field4492);
        }
        return var4;
    }
}
