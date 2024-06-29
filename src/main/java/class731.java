import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class731 extends class379 {

    @OriginalMember(owner = "client!no", name = "l", descriptor = "S")
    public short field10239;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "[Lml;")
    public static class408[] field10237 = new class408[5];

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field10235;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Ljia;")
    public static class645 field10241;

    static {
        for (int var0 = 0; var0 < field10237.length; var0++) {
            field10237[var0] = new class408();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)I", line = 3)
    public static final int method4128(int arg0, boolean arg1) {
        field10238++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (!arg1) {
            method4129(105);
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)[Lde;", line = 20)
    public static final class558[] method4129(int arg0) {
        if (arg0 != 31251) {
            field10241 = null;
        }
        field10235++;
        return new class558[] { class446.field6003, class454.field6402, class553.field7698, class18.field342, class616.field8277, class393.field5089, class769.field10571 };
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 34)
    public static void method4130(int arg0) {
        field10241 = null;
        if (arg0 > 122) {
            field10237 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIZI)V", line = 46)
    public static final void method4131(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 != (arg5 ? class118.field1503.field10637.method1581(arg0) : class118.field1503.field10666.method1581(0)) && arg3 != 0 && class707.field9936 < 50 && arg4 != -1) {
            class415.field5422[class707.field9936++] = new class228((byte) (arg5 ? 3 : 2), arg4, arg3, arg6, arg2, 0, arg1, null);
        }
        field10236++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZZ)V", line = 61)
    public static final void method4132(boolean arg0, boolean arg1) {
        if (class691.field9417 == null) {
            class603.method3438(arg1);
        }
        field10240++;
        if (!arg1) {
            method4132(false, true);
        }
        if (arg0) {
            class691.field9417.method3646((byte) 116);
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V", line = 95)
    public class731() {
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(S)V", line = 97)
    public class731(short arg0) {
        this.field10239 = arg0;
    }
}
