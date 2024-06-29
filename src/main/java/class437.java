import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class437 extends class388 {

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
    public static boolean field5996;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public int field5990;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public int field5992;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public int field5993;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lit;")
    public class455 field5988;

    static {
        new class304("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        new class304(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field5996 = false;
        new class304("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 3)
    public static final void method2510(int arg0) {
        field5995++;
        int var1 = class154.field2244.method1849(class166.field2414, (byte) -120);
        if (arg0 != -1975902942) {
            method2512((byte) -37);
        }
        if (var1 == 0) {
            class99.field1482 = null;
            class379.method2235(arg0 ^ 0x8A3A1D32, 0);
        } else if (var1 == 1) {
            class297.method1734(4, (byte) 0);
            class379.method2235(arg0 ^ 0x8A3A1D32, 512);
            if (class117.field1677 != null) {
                class96.method691(false);
            }
        } else {
            class297.method1734(4, (byte) (class33.field531 - 4 & 0xFF));
            class379.method2235(16, 2);
        }
        class288.field3770 = class411.field5656;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)I", line = 43)
    public static final int method2511(byte arg0, int arg1) {
        field5989++;
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        if (arg0 <= 44) {
            method2512((byte) 55);
        }
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 66)
    public static final void method2512(byte arg0) {
        if (arg0 != 1) {
            field5997 = -59;
        }
        class285.field3723 = true;
        field5994++;
    }
}
