import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class32 {

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lpd;")
    private class276 field653;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Lmf;")
    private class201 field656;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Li;")
    private class333 field655;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "J")
    public static long field657 = 0L;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[J")
    public static long[] field658 = new long[32];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lag;")
    private class202 field652;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[Lgd;")
    private class169[] field648;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLtl;Ltl;BI)Lgd;", line = 16)
    private final class169 method257(boolean arg0, class62 arg1, class62 arg2, byte arg3, int arg4) {
        field654++;
        if (arg3 <= 30) {
            return (class169) null;
        } else if (this.field652 == null) {
            throw new RuntimeException();
        } else {
            this.field652.field3249 = arg4 * 8 + 5;
            if (this.field652.field3249 >= this.field652.field3273.length) {
                throw new RuntimeException();
            } else if (this.field648[arg4] == null) {
                int var6 = this.field652.method1346(34);
                int var7 = this.field652.method1346(-126);
                class169 var8 = new class169(arg4, arg2, arg1, this.field653, this.field656, var6, var7, arg0);
                this.field648[arg4] = var8;
                return var8;
            } else {
                return this.field648[arg4];
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 57)
    public static void method258(int arg0) {
        field658 = null;
        int var1 = 92 / ((34 - arg0) / 34);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Z", line = 67)
    public final boolean method259(int arg0) {
        field649++;
        if (this.field652 != null) {
            return true;
        }
        if (arg0 != 30181) {
            this.field648 = (class169[]) null;
        }
        if (this.field655 == null) {
            if (this.field653.method1845(false)) {
                return false;
            }
            this.field655 = this.field653.method1860(true, 5416, (byte) 0, 255, 255);
        }
        if (this.field655.field239) {
            return false;
        } else {
            this.field652 = new class202(this.field655.method97(83));
            this.field648 = new class169[(this.field652.field3273.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V", line = 98)
    public final void method260(int arg0) {
        field651++;
        if (this.field648 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field648.length; var2++) {
            if (this.field648[var2] != null) {
                this.field648[var2].method1076((byte) 114);
            }
        }
        for (int var3 = 0; var3 < this.field648.length; var3++) {
            if (this.field648[var3] != null) {
                this.field648[var3].method1067(-1);
            }
        }
        if (arg0 > -106) {
            this.method261((class62) null, (class62) null, 126, false);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ltl;Ltl;IZ)Lgd;", line = 139)
    public final class169 method261(class62 arg0, class62 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method258(17);
        }
        field650++;
        return this.method257(true, arg1, arg0, (byte) 69, arg2);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lpd;Lmf;)V", line = 148)
    public class32(class276 arg0, class201 arg1) {
        this.field653 = arg0;
        this.field656 = arg1;
        if (!this.field653.method1845(false)) {
            this.field655 = this.field653.method1860(true, 5416, (byte) 0, 255, 255);
        }
    }
}
