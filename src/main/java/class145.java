import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class145 extends class82 {

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    private int field1750 = 4096;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    private int field1751 = 0;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "Ldj;")
    public static class287 field1749;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class145() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)V")
    public static void method797(int arg0) {
        if (arg0 == -2) {
            field1749 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field1752;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field1750 = arg2.method2136(false);
            }
        } else {
            this.field1751 = arg2.method2136(false);
        }
        int var5 = 69 / ((arg1 - -69) / 42);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field1748;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int[] var4 = this.method489(false, 0, arg0);
            for (int var5 = 0; var5 < class629.field9033; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1751 && this.field1750 >= var6 ? 4096 : 0;
            }
        }
        if (arg1 != 12218) {
            this.method198(31, 9, (class374) null);
        }
        return var3;
    }

    static {
        new class180("Ok", "Okay", "OK", "Ok");
    }
}
