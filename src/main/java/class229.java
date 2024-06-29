import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class229 extends class224 {

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    private int field3696;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "Luf;")
    public static class168 field3694 = class148.method1019(-1720, "runes");

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "Luf;")
    public static class168 field3695 = class148.method1019(-1720, "Art");

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "Lj;")
    public static class153 field3700 = new class153(new byte[5000]);

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "[I")
    public static int[] field3703 = new int[4096];

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "J")
    public static long field3699;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "[Lha;")
    public static class49[] field3697;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZLj;)V", line = 6)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (!arg1) {
            if (arg0 == 0) {
                this.field3696 = (arg2.method1042((byte) -79) << 12) / 255;
            }
            field3702++;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I)V", line = 39)
    private class229(int arg0) {
        super(0, true);
        this.field3696 = 4096;
        this.field3696 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[I", line = 56)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = -98 % ((arg0 - 20) / 51);
        field3701++;
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            class185.method1309(var4, 0, class187.field2961, this.field3696);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 76)
    public class229() {
        this(4096);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3703[var0] = class198.method1397((byte) 85, var0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V", line = 98)
    public static void method1566(byte arg0) {
        if (arg0 > -79) {
            method1566((byte) -12);
        }
        field3694 = null;
        field3703 = null;
        field3695 = null;
        field3697 = null;
        field3700 = null;
    }
}
