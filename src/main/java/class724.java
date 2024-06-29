import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class724 extends class540 {

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
    public int field10148 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
    public int field10147 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
    public int field10151 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
    public int field10155 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
    public int field10153 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
    public int field10158 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sea", name = "u", descriptor = "I")
    public int field10159 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sea", name = "v", descriptor = "I")
    public int field10160 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "Loga;")
    public class497 field10157;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "Z")
    public static boolean field10150 = false;

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "I")
    public static int field10152;

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "I")
    public static int field10154;

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field10156;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "[[[B")
    public static byte[][][] field10149;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IBI)Z")
    public final boolean method4075(int arg0, byte arg1, int arg2) {
        field10154++;
        if (arg1 >= -68) {
            field10149 = null;
        }
        if (arg0 >= this.field10159 && this.field10160 >= arg0 && this.field10158 <= arg2 && this.field10148 >= arg2) {
            return true;
        } else {
            return this.field10155 <= arg0 && this.field10151 >= arg0 && this.field10153 <= arg2 && this.field10147 >= arg2;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
    public static void method4076(boolean arg0) {
        field10149 = null;
        if (arg0) {
            field10150 = true;
        }
        field10156 = null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIZIIBIIF)[[I")
    public static final int[][] method4077(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, float arg8) {
        field10152++;
        int[][] var9 = new int[arg0][arg6];
        class396 var10 = new class396();
        int var11 = 114 / ((-arg5 - 69) / 49);
        var10.field5612 = arg4;
        var10.field5624 = arg3;
        var10.field5613 = arg2;
        var10.field5626 = arg7;
        var10.field5620 = (int) (arg8 * 4096.0F);
        var10.method1454((byte) 127);
        class88.method628(-10452, arg0, arg6);
        for (int var12 = 0; var12 < arg0; var12++) {
            var10.method2417(var12, var9[var12], (byte) -93);
        }
        return var9;
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Loga;)V")
    public class724(class497 arg0) {
        this.field10157 = arg0;
    }
}
