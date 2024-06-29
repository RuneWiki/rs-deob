import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class36 {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lte;")
    public static class244 field463 = new class244(64);

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lte;")
    public static class244 field466 = new class244(2);

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[Z")
    public static boolean[] field467 = new boolean[112];

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lwb;")
    public static class123 field461;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
    public static int[] field468;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lug;B)V")
    public static final void method191(class220 arg0, byte arg1) {
        field462++;
        long var2 = 0L;
        if (arg0.field3519 == 0) {
            var2 = class62.method363(arg0.field3527, arg0.field3517, arg0.field3523);
        }
        if (arg0.field3519 == 1) {
            var2 = class19.method108(arg0.field3527, arg0.field3517, arg0.field3523);
        }
        int var4 = -89 / ((arg1 + 14) / 44);
        int var5 = 0;
        int var6 = -1;
        if (arg0.field3519 == 2) {
            var2 = class286.method1929(arg0.field3527, arg0.field3517, arg0.field3523);
        }
        if (arg0.field3519 == 3) {
            var2 = class291.method1960(arg0.field3527, arg0.field3517, arg0.field3523);
        }
        int var7 = 0;
        if (var2 != 0L) {
            var5 = (int) var2 >> 14 & 0x1F;
            var7 = ((int) var2 & 0x3C3211) >> 20;
            var6 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field3513 = var6;
        arg0.field3518 = var7;
        arg0.field3529 = var5;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public static final void method192(int arg0, int arg1) {
        field464++;
        class238.field3928 = (class148) class170.field2693.method708((long) arg1, 123);
        if (arg0 != -15066) {
            method193((byte) 71);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method193(byte arg0) {
        field467 = null;
        field461 = null;
        field466 = null;
        field468 = null;
        field463 = null;
        if (arg0 >= -124) {
            field467 = null;
        }
    }
}
