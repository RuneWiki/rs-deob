import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class95 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "B")
    private byte field1760;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lij;")
    public static class50 field1761 = class78.method578(126, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lij;")
    public static class50 field1765 = class78.method578(121, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lij;")
    private static class50 field1772 = class78.method578(124, "glow3:");

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lij;")
    public static class50 field1775 = field1772;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lij;")
    public static class50 field1769 = field1772;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "B")
    public static byte field1774;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZZ)V")
    public static final void method717(boolean arg0, boolean arg1) {
        field1759++;
        if (arg0) {
            field1772 = null;
        }
        byte var2 = 4;
        byte[][] var3 = class120.field2113;
        for (int var4 = 0; var4 < var2; var4++) {
            class244.method1665(0);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class76.field1437[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3889328) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0xFFC7DD) >> 14;
                            int var11 = var8 >> 1 & 0x3;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var10 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class252.field4371.length; var14++) {
                                if (class252.field4371[var14] == var13 && var3[var14] != null) {
                                    class118.method850((var12 & 0x7) * 8, var5 * 8, class45.field826, var4, var3[var14], arg1, (byte) -82, (var10 & 0x7) * 8, var9, var11, var6 * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class204.method1379(var4, var5 * 8, -1, 8, 8, var6 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
    public static final boolean method718(int arg0, int arg1) {
        field1762++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else if (arg1 < 49) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)I")
    public final int method719(byte arg0) {
        if (arg0 == -45) {
            field1766++;
            return this.field1760 & 0x7;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method720(int arg0) {
        field1775 = null;
        if (arg0 != -1) {
            method717(true, false);
        }
        field1761 = null;
        field1769 = null;
        field1772 = null;
        field1765 = null;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)I")
    public final int method721(byte arg0) {
        field1767++;
        int var2 = 126 % ((31 - arg0) / 62);
        return (this.field1760 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class95() {
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lwd;)V")
    public class95(class217 arg0) {
        this.field1760 = arg0.method1444((byte) -44);
        this.field1771 = arg0.method1441(71);
        this.field1763 = arg0.method1466((byte) -15);
        this.field1768 = arg0.method1466((byte) -15);
        this.field1773 = arg0.method1466((byte) -15);
        this.field1764 = arg0.method1466((byte) -15);
    }
}
