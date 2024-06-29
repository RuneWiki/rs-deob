import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class22 extends class65 {

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Lrc;")
    private static class105 field519 = class43.method374(" is already on your ignore list", 0);

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lrc;")
    public static class105 field524 = class43.method374("Sprites geladen)3", 0);

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Lrc;")
    public static class105 field526 = field519;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field521 = new CRC32();

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[I")
    public static int[] field528 = new int[99];

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "Lrc;")
    private static class105 field533;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "Lrc;")
    public static class105 field531;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "Lle;")
    public static class71 field532;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lrc;")
    private static class105 field535;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "Lrc;")
    public static class105 field534;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "Lrc;")
    public static class105 field537;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "Lrc;")
    public static class105 field538;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "Lrc;")
    public static class105 field543;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "Lrc;")
    private static class105 field542;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lrc;")
    public static class105 field545;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "Lrc;")
    public static class105 field540;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "Lgd;")
    public static class40 field541;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "Lpb;")
    public static class92 field530;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[I")
    public int[] field516;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "[I")
    public int[] field525;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "[I")
    public int[] field529;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "[Lbd;")
    public static class11[] field539;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "[Lgd;")
    public class40[] field515;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "[Lgd;")
    public class40[] field518;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "[[[B")
    public byte[][][] field523;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field528[var1] = var0 / 4;
        }
        field533 = class43.method374("Too many incorrect logins from your address)3", 0);
        field531 = field533;
        field532 = new class71(64);
        field535 = class43.method374("Loaded sprites", 0);
        field534 = class43.method374("Der Server wird gerade aktualisiert)3", 0);
        field536 = 0;
        field537 = class43.method374("blinken3:", 0);
        field538 = class43.method374("headicons_pk", 0);
        field543 = class43.method374("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 0);
        field542 = class43.method374("To", 0);
        field545 = field542;
        field540 = field535;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 6)
    public static void method233(int arg0) {
        field535 = null;
        field521 = null;
        field542 = null;
        field545 = null;
        field526 = null;
        field519 = null;
        field530 = null;
        field537 = null;
        field538 = null;
        field534 = null;
        field539 = null;
        field528 = null;
        field524 = null;
        field532 = null;
        field543 = null;
        field541 = null;
        field533 = null;
        field531 = null;
        if (arg0 > 16) {
            field540 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)V", line = 42)
    public static final void method234(byte arg0, int arg1, int arg2) {
        class41.field941++;
        class66.field1472.method781(244, (byte) -59);
        if (arg0 >= -63) {
            field537 = null;
        }
        field527++;
        class66.field1472.method81(1872517936, arg2);
        class66.field1472.method111(arg1, -27867);
    }
}
