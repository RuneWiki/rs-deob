import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class712 {

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "Lbu;")
    public static class21 field9880 = new class21(41, 6);

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "Lbu;")
    public static class21 field9881 = new class21(36, 1);

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "J")
    public static long field9882 = 0L;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "Z")
    public static boolean field9883 = false;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "[Z")
    public static boolean[] field9884 = new boolean[200];

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IFFFZ)F")
    public static final float method4005(int arg0, float arg1, float arg2, float arg3, boolean arg4) {
        if (arg4) {
            return 2.6878273F;
        } else {
            field9878++;
            float[] var5 = class764.field10528[arg0];
            return var5[2] * arg3 + var5[1] * arg2 + var5[0] * arg1;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public static void method4006(int arg0) {
        field9884 = null;
        if (arg0 > 74) {
            field9881 = null;
            field9880 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Lnu;")
    public static final class617 method4007(int arg0, int arg1, int arg2) {
        class46 var3 = class767.field10562[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class617 var4 = var3.field591;
            var3.field591 = null;
            class393.method2434(var4);
            return var4;
        }
    }
}
