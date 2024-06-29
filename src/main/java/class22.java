import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class22 extends class276 {

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "Lfr;")
    public static class231 field235 = new class231(8);

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "Lck;")
    public static class156 field239;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public static void method114(int arg0) {
        field235 = null;
        field239 = null;
        if (arg0 != 26593) {
            field235 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(II)Lec;")
    public static final class68 method115(int arg0, int arg1) {
        if (arg0 != 7521) {
            field235 = null;
        }
        field236++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class508.field7389[var2] == null || class508.field7389[var2][var3] == null) {
            boolean var4 = class468.method2782(var2, -24955);
            if (!var4) {
                return null;
            }
        }
        return class508.field7389[var2][var3];
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
    public class22() {
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(FIZFF)F")
    public static final float method116(float arg0, int arg1, boolean arg2, float arg3, float arg4) {
        field237++;
        float[] var5 = class451.field6733[arg1];
        if (!arg2) {
            method115(38, 16);
        }
        return var5[2] * arg3 + var5[0] * arg4 + var5[1] * arg0;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I)V")
    public class22(int arg0) {
        this.field238 = arg0;
    }
}
