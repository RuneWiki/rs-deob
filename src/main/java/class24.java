import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HWTUYSNT")
public class class24 {

    @OriginalMember(owner = "HWTUYSNT", name = "a", descriptor = "I")
    private int field857 = 1914;

    @OriginalMember(owner = "HWTUYSNT", name = "b", descriptor = "Z")
    private boolean field858 = false;

    @OriginalMember(owner = "HWTUYSNT", name = "c", descriptor = "I")
    private int field859;

    @OriginalMember(owner = "HWTUYSNT", name = "d", descriptor = "[LJJVWTXNE;")
    private class30[] field860;

    @OriginalMember(owner = "HWTUYSNT", name = "<init>", descriptor = "(II)V")
    public class24(int arg0, int arg1) {
        this.field859 = arg0;
        this.field860 = new class30[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class30 var4 = this.field860[var3] = new class30();
            var4.field985 = var4;
            var4.field986 = var4;
        }
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "HWTUYSNT", name = "a", descriptor = "(J)LJJVWTXNE;")
    public class30 method303(long arg0) {
        class30 var3 = this.field860[(int) (arg0 & (long) (this.field859 - 1))];
        for (class30 var4 = var3.field985; var4 != var3; var4 = var4.field985) {
            if (var4.field984 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "HWTUYSNT", name = "a", descriptor = "(IJLJJVWTXNE;)V")
    public void method304(int arg0, long arg1, class30 arg2) {
        if (arg2.field986 != null) {
            arg2.method334();
        }
        class30 var5 = this.field860[(int) (arg1 & (long) (this.field859 - 1))];
        arg2.field986 = var5.field986;
        if (arg0 >= 0) {
            this.field857 = -282;
        }
        arg2.field985 = var5;
        arg2.field986.field985 = arg2;
        arg2.field985.field986 = arg2;
        arg2.field984 = arg1;
    }
}
