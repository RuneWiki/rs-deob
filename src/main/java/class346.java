import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class346 extends class673 {

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    private int field4541;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    private int field4536;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    private int field4537;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    private int field4546;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "Lwaa;")
    public static class652 field4539 = new class652(16);

    @OriginalMember(owner = "client!at", name = "t", descriptor = "Lhu;")
    public static class115 field4545 = new class115("", 17);

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public static int field4548 = 0;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "I")
    public static int field4551 = 1;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "[[B")
    public static byte[][] field4549;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1979(boolean arg0) {
        if (arg0) {
            field4545 = null;
        }
        if (class600.field8656 != null) {
            class600.field8656.method1486(2);
        }
        ++field4544;
        if (class247.field3389 != null) {
            class247.field3389.method1486(2);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIB)V", line = 21)
    public final void method695(int arg0, int arg1, byte arg2) {
        ++field4540;
        int var4 = this.field4536 * arg0 >> 12;
        int var5 = this.field4546 * arg0 >> 12;
        if (arg2 == 48) {
            int var6 = this.field4537 * arg1 >> 12;
            int var7 = this.field4541 * arg1 >> 12;
            class176.method1106(var4, var7, (byte) -113, super.field9670, var6, var5);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BZLmt;)V", line = 40)
    public static final void method1980(byte arg0, boolean arg1, class364 arg2) {
        class600.field8656.method1490(arg2, 0);
        ++field4547;
        if (arg1) {
            class431.method2590(class600.field8656, 0, class153.field1890, arg2, class538.field7834, class166.field2040);
        }
        if (arg0 != -125) {
            method1982(-43);
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(IIB)Ln;", line = 54)
    public static final class17 method1981(int arg0, int arg1, byte arg2) {
        ++field4538;
        if (arg2 >= -105) {
            return null;
        } else {
            class17 var3 = class400.method2420((byte) -115, arg0);
            if (~arg1 == 0) {
                return var3;
            } else {
                return var3 != null && var3.field429 != null && var3.field429.length > arg1 ? var3.field429[arg1] : null;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIZ)V", line = 78)
    public final void method693(int arg0, int arg1, boolean arg2) {
        ++field4543;
        if (!arg2) {
            this.field4537 = -84;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIIIII)V", line = 97)
    public class346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4541 = arg3;
        this.field4536 = arg0;
        this.field4537 = arg1;
        this.field4546 = arg2;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(III)V", line = 108)
    public final void method694(int arg0, int arg1, int arg2) {
        ++field4542;
        int var4 = this.field4536 * arg1 >> 12;
        int var5 = this.field4546 * arg1 >> 12;
        int var6 = this.field4537 * arg0 >> 12;
        int var7 = this.field4541 * arg0 >> 12;
        class149.method967(var7, super.field9670, super.field9668, var6, arg2 ^ -18651, var4, super.field9672, var5);
        if (arg2 != -3) {
            method1979(true);
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V", line = 127)
    public static void method1982(int arg0) {
        if (arg0 != 403053836) {
            field4545 = null;
        }
        field4545 = null;
        field4539 = null;
        field4549 = null;
    }
}
