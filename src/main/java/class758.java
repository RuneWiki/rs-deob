import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class758 {

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field10539 = -1;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "Lvfa;")
    public static class672 field10549 = null;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "Z")
    public static boolean field10552 = false;

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    public static int field10556 = -1;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "B")
    public byte field10535;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "B")
    public byte field10536;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "B")
    public byte field10537;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "B")
    public byte field10542;

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "B")
    public byte field10554;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "B")
    public byte field10555;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "B")
    public byte field10558;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
    public int field10541;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public int field10545;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    public int field10557;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "S")
    public short field10546;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "Z")
    public boolean field10534;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "Z")
    public boolean field10538;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "Z")
    public boolean field10543;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "Z")
    public boolean field10544;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "Z")
    public boolean field10547;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "Z")
    public boolean field10548;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "Z")
    public boolean field10550;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "Z")
    public boolean field10551;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "[J")
    public static long[] field10553;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZIIII)V")
    public static final void method4224(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field10540++;
        if (arg0) {
            return;
        }
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        class717.method4012(arg3, -69, arg4 - arg1, class690.field9616[arg2], arg1 + arg4);
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class690.field9616[arg2 + var6];
                int[] var10 = class690.field9616[arg2 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class717.method4012(arg3, -98, var12, var9, var11);
                class717.method4012(arg3, -69, var12, var10, var11);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class690.field9616[arg2 + var5];
            int[] var16 = class690.field9616[arg2 - var5];
            class717.method4012(arg3, -60, var14, var15, var13);
            class717.method4012(arg3, -62, var14, var16, var13);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V")
    public static void method4225(byte arg0) {
        field10553 = null;
        if (arg0 == -67) {
            field10549 = null;
        }
    }
}
