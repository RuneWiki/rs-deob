import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class581 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lqe;")
    public static class469 field8251 = new class469(32, 6);

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[Lpr;")
    public static class448[] field8256 = new class448[2048];

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[Z")
    public static boolean[] field8258 = new boolean[200];

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field8250;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public int field8253;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field8254;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lsha;")
    public static class730 field8249;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Z")
    public static boolean field8252;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method3367(byte arg0) {
        if (arg0 != 69) {
            field8258 = null;
        }
        field8258 = null;
        field8256 = null;
        field8251 = null;
        field8249 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILaa;BLsca;IJII)V")
    public static final void method3368(int arg0, int arg1, class488 arg2, byte arg3, class46 arg4, int arg5, long arg6, int arg7, int arg8) {
        field8255++;
        if (arg3 != 5) {
            return;
        }
        int var10 = arg1 * arg1 + arg5 * arg5;
        if (arg6 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg4.field549 / 2, arg4.field574 / 2);
        if (var10 <= (var11 * var11)) {
            class260.method1688((byte) -96, arg2, arg1, arg7, arg4, class452.field6681[arg8], arg0, arg5);
            return;
        }
        var11 -= 10;
        int var12;
        if (class264.field3784 == 4) {
            var12 = (int) class255.field3659 & 0x3FFF;
        } else {
            var12 = (int) class255.field3659 + class748.field10464 & 0x3FFF;
        }
        int var13 = class373.field5548[var12];
        int var14 = class373.field5549[var12];
        if (class264.field3784 != 4) {
            var14 = var14 * 256 / (class305.field4322 + 256);
            var13 = var13 * 256 / (class305.field4322 + 256);
        }
        int var15 = arg1 * var13 + arg5 * var14 >> 14;
        int var16 = arg1 * var14 - (arg5 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class25.field253[arg8].method3147((float) arg4.field549 / 2.0F + (float) arg0 + (float) var19, (float) arg4.field574 / 2.0F + (float) arg7 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }
}
