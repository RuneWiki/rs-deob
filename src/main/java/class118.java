import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 extends class46 {

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    private int field2667 = 0;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "Lsc;")
    public static class128 field2668 = class129.method1017(false, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "Lsc;")
    private static class128 field2671 = class129.method1017(false, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!r", name = "db", descriptor = "I")
    public static int field2672 = 0;

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "Lsc;")
    public static class128 field2678 = field2671;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "Z")
    public static boolean field2674 = false;

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "Lsc;")
    public static class128 field2680 = class129.method1017(false, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "Lsc;")
    public static class128 field2677 = class129.method1017(false, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public int field2666;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!r", name = "ob", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!r", name = "nb", descriptor = "[I")
    public static int[] field2682;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILmc;B)V")
    public final void method901(int arg0, class86 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method646(-15447);
            if (var4 == 0) {
                if (arg2 <= 22) {
                    return;
                }
                field2676++;
                return;
            }
            this.method903(arg0, (byte) -30, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public final void method902(int arg0) {
        this.method904(255, this.field2667);
        if (arg0 != 256) {
            method905((byte) -106);
        }
        field2683++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLmc;I)V")
    private final void method903(int arg0, byte arg1, class86 arg2, int arg3) {
        if (arg1 != -30) {
            this.field2667 = 19;
        }
        field2673++;
        if (arg3 == 1) {
            this.field2667 = arg2.method671(110);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
    private final void method904(int arg0, int arg1) {
        field2679++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        if (var3 > var5) {
            var7 = var5;
        }
        double var9 = (double) (arg0 & arg1) / 256.0D;
        double var11 = var3;
        if (var9 < var7) {
            var7 = var9;
        }
        if (var5 > var3) {
            var11 = var5;
        }
        if (var9 > var11) {
            var11 = var9;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var3 == var11) {
                var15 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var15 = (var9 - var3) / (-var7 + var11) + 2.0D;
            } else if (var9 == var11) {
                var15 = (var3 - var5) / (-var7 + var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        this.field2666 = (int) (var13 * 256.0D);
        if (var17 > 0.5D) {
            this.field2681 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field2681 = (int) (var13 * var17 * 512.0D);
        }
        this.field2670 = (int) (var17 * 256.0D);
        double var19 = var15 / 6.0D;
        if (this.field2666 < 0) {
            this.field2666 = 0;
        } else if (this.field2666 > 255) {
            this.field2666 = 255;
        }
        if (this.field2681 < 1) {
            this.field2681 = 1;
        }
        this.field2665 = (int) ((double) this.field2681 * var19);
        if (this.field2670 < 0) {
            this.field2670 = 0;
        } else if (this.field2670 > 255) {
            this.field2670 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    public static void method905(byte arg0) {
        field2677 = null;
        field2668 = null;
        field2678 = null;
        field2680 = null;
        if (arg0 != 106) {
            field2671 = null;
        }
        field2682 = null;
        field2671 = null;
    }
}
