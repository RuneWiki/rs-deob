import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class48 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[I")
    public static int[] field949 = new int[5];

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field950 = -1;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Ldk;")
    public static class275 field951 = new class275(16);

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lpk;")
    public static class99 field948;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "[Lli;")
    public static class288[] field947;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II[Lqk;I)Lqk;")
    public static final class207 method361(int arg0, int arg1, class207[] arg2, int arg3) {
        field952++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg3 + var5] == null) {
                arg2[arg3 + var5] = class174.field3158;
            }
            var4 += arg2[arg3 + var5].field3663;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class207 var10 = arg2[arg3 + var8];
            class274.method1857(var10.field3652, 0, var6, var7, var10.field3663);
            var7 += var10.field3663;
        }
        class207 var9 = new class207();
        var9.field3652 = var6;
        var9.field3663 = var4;
        if (arg0 != 16) {
            method362(-49);
        }
        return var9;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method362(int arg0) {
        field948 = null;
        field947 = null;
        if (arg0 != -14079) {
            field947 = null;
        }
        field949 = null;
        field951 = null;
    }
}
