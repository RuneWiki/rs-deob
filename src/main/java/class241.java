import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class241 {

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Z")
    public boolean field3604 = false;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
    public static boolean field3607 = false;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Z")
    public static boolean field3614 = false;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Z")
    public static boolean field3615 = false;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "F")
    public static float field3606;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public int field3603;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public int field3613;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "J")
    public long field3605;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Leh;")
    public class179 field3609;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Lfm;")
    public static class52 field3612;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[[I")
    public static int[][] field3608;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Lnj;", line = 5)
    public static final class241 method1705(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        return var3 == null || var3.field655 == null ? null : var3.field655;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V", line = 17)
    public static final void method1706(int arg0, int arg1, int arg2) {
        field3602++;
        if (arg1 != -1) {
            return;
        }
        for (int var3 = 0; var3 < class4.field115; var3++) {
            class183 var4 = class49.method411(var3, false);
            if (var4 != null) {
                int var5 = var4.field2898;
                if (var5 >= 0 && !class40.field614.method263(false, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field2897 >= 0) {
                    int var10 = var4.field2897;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + ((arg0 + var10 & 0xFC00) + var11);
                    var9 = class40.field606[class297.method2108((byte) -89, var12, 96)];
                } else if (var5 >= 0) {
                    var9 = class40.field606[class297.method2108((byte) 125, class40.field614.method251(false, var5), 96)];
                } else if (var4.field2903 == -1) {
                    var9 = -1;
                } else {
                    int var6 = var4.field2903;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class40.field606[class297.method2108((byte) 79, var8, 96)];
                }
                class107.field1755[var3 + 1] = var9;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 105)
    public static void method1707(byte arg0) {
        field3608 = (int[][]) null;
        if (arg0 <= 59) {
            field3610 = 126;
        }
        field3612 = null;
    }
}
