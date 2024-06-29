import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class206 extends class157 {

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field3622 = 0;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "Lmh;")
    public static class128 field3624 = class22.method156(127, "Sprites geladen)3");

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lmh;")
    public static class128 field3623 = class22.method156(125, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "[I")
    public static int[] field3625 = new int[256];

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "Ldj;")
    public static class314 field3628;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "[[[S")
    public static short[][][] field3626;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 9)
    public static void method1419(int arg0) {
        field3623 = null;
        field3624 = null;
        if (arg0 == -257) {
            field3628 = null;
            field3625 = null;
            field3626 = (short[][][]) null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3625[var0] = var1;
        }
        field3627 = 0;
        field3629 = 0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)V", line = 38)
    public static final void method1420(boolean arg0, int arg1) {
        field3621++;
        int var2 = -56 % ((arg1 + 55) / 32);
        class214.method1485(class196.field3433, class16.field420, class199.field3465, (byte) -6, arg0);
    }
}
