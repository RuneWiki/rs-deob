import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class134 extends class108 {

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "Lce;")
    public static class10 field2340;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "Lda;")
    public static class22 field2341;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        int[][] var3 = super.field2920.method117(arg0, (byte) -95);
        if (super.field2920.field356 && this.method805(arg1 ^ 20839)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field1940 * super.field1940;
            for (int var8 = 0; var8 < class211.field3514; ++var8) {
                int var9 = super.field1930[var8 % super.field1927 + var7];
                var6[var8] = class51.method413(255, var9) << 4;
                var5[var8] = class51.method413(4080, var9 >> 4);
                var4[var8] = class51.method413(var9 >> 12, 4080);
            }
        }
        ++field2338;
        return arg1 != -20740 ? null : var3;
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V")
    public static void method938(int arg0) {
        field2340 = null;
        field2341 = null;
        if (arg0 != -27839) {
            method939(true, 88, true, false, false);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIZZZ)Lwi;")
    public static final class21 method939(boolean arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        ++field2339;
        if (!arg0) {
            field2340 = null;
        }
        class47 var5 = null;
        if (class241.field4147 != null) {
            var5 = new class47(arg1, class241.field4147, class17.field377[arg1], 1000000);
        }
        return new class21(var5, class162.field2779, arg1, arg3, arg4, arg2);
    }
}
