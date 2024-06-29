import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class22 extends class287 {

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "[I")
    public int[] field294 = new int[] { 0 };

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "[I")
    public int[] field297 = new int[] { -1 };

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "[I")
    public static int[] field291 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "Ltl;")
    public static class59 field292 = class85.method639("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 9588);

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "Ltl;")
    public static class59 field296 = class85.method639("<col=c0ff00>", 9588);

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "[J")
    public static long[] field295 = new long[256];

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 9)
    public static void method142(byte arg0) {
        field295 = null;
        field291 = null;
        field296 = null;
        int var1 = 108 % ((26 - arg0) / 62);
        field292 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Z", line = 22)
    public static final boolean method143(int arg0, byte arg1) {
        if (arg1 <= 74) {
            method144(-87);
        }
        field288++;
        return ((arg0 & 0x72BE914B) >> 30) != 0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field295[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V", line = 45)
    public static final void method144(int arg0) {
        class12.field155 = null;
        class280.field4819 = null;
        class94.field1467 = (byte[][][]) null;
        class1.field3 = (int[][][]) null;
        if (arg0 != 256) {
            field295 = (long[]) null;
        }
        class123.field2027 = (byte[][][]) null;
        class78.field1250 = (byte[][][]) null;
        class38.field578 = null;
        class230.field3780 = (byte[][][]) null;
        class249.field4145 = (byte[][][]) null;
        field290++;
        class195.field3230 = null;
        class138.field2274 = null;
    }
}
