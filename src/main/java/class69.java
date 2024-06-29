import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 extends class41 {

    @OriginalMember(owner = "client!k", name = "w", descriptor = "[I")
    public int[] field1692 = new int[] { -1 };

    @OriginalMember(owner = "client!k", name = "D", descriptor = "[I")
    public int[] field1698 = new int[1];

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field1695 = 0;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Lu;")
    public static class135 field1700 = class87.method676((byte) -57, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!k", name = "I", descriptor = "Lu;")
    public static class135 field1703 = class87.method676((byte) -45, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!k", name = "O", descriptor = "Z")
    public static boolean field1709 = false;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public static int field1704 = 0;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "[I")
    public static int[] field1706 = new int[500];

    @OriginalMember(owner = "client!k", name = "P", descriptor = "Lu;")
    private static class135 field1710 = class87.method676((byte) -62, "Loading game screen )2 ");

    @OriginalMember(owner = "client!k", name = "R", descriptor = "Lu;")
    public static class135 field1711 = field1710;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "Lu;")
    private static class135 field1707 = class87.method676((byte) -128, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!k", name = "C", descriptor = "Lu;")
    public static class135 field1697 = class87.method676((byte) -42, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!k", name = "S", descriptor = "Lu;")
    public static class135 field1712 = class87.method676((byte) -70, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!k", name = "T", descriptor = "Lu;")
    public static class135 field1713 = class87.method676((byte) -47, "gleiten:");

    @OriginalMember(owner = "client!k", name = "K", descriptor = "Lu;")
    public static class135 field1705 = field1707;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "[I")
    public static int[] field1696;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "[I")
    public static int[] field1701;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[[B")
    public static byte[][] field1691;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIII)V")
    public static final void method553(boolean arg0, int arg1, int arg2, int arg3) {
        field1693++;
        if (arg3 != -8245) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class95.field2315 = arg1;
        class138.field3361 = arg2;
        class125.field2990 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIB)V")
    public static final void method554(int arg0, int arg1, byte arg2) {
        class12.field284++;
        class152.field3751.method929(221, -14044);
        class152.field3751.method458(127, arg0);
        class152.field3751.method448(arg1, true);
        field1702++;
        if (arg2 < 61) {
            method556((byte) -101);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLba;I)V")
    public static final void method555(boolean arg0, class9 arg1, int arg2) {
        if (arg1.field208 > class126.field2998) {
            class49.method369(arg1, false);
        } else if (arg1.field226 >= class126.field2998) {
            class29.method238(arg1, (byte) 23);
        } else {
            class10.method56(arg1, (byte) 5);
        }
        field1699++;
        if (arg1.field173 < 128 || arg1.field172 < 128 || arg1.field173 >= 13184 || arg1.field172 >= 13184) {
            arg1.field173 = arg1.field192[0] * 128 + arg1.field210 * 64;
            arg1.field208 = 0;
            arg1.field172 = arg1.field162[0] * 128 + arg1.field210 * 64;
            arg1.field155 = -1;
            arg1.field226 = 0;
            arg1.field170 = -1;
            arg1.method41(-1);
        }
        if (class116.field2789 == arg1 && (arg1.field173 < 1536 || arg1.field172 < 1536 || arg1.field173 >= 11776 || arg1.field172 >= 11776)) {
            arg1.field226 = 0;
            arg1.field173 = arg1.field192[0] * 128 + arg1.field210 * 64;
            arg1.field172 = arg1.field162[0] * 128 + arg1.field210 * 64;
            arg1.field155 = -1;
            arg1.field208 = 0;
            arg1.field170 = -1;
            arg1.method41(-1);
        }
        class4.method17((byte) 54, arg1);
        if (!arg0) {
            method554(10, 8, (byte) 105);
        }
        class75.method607(arg1, (byte) 112);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
    public static void method556(byte arg0) {
        field1711 = null;
        field1700 = null;
        field1696 = null;
        field1697 = null;
        field1707 = null;
        int var1 = -74 % ((-arg0 - 79) / 36);
        field1712 = null;
        field1691 = null;
        field1701 = null;
        field1705 = null;
        field1706 = null;
        field1710 = null;
        field1713 = null;
        field1703 = null;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
    public static final void method557(int arg0) {
        class57.field1396.method234(arg0 - 2396);
        if (arg0 == -20270) {
            field1694++;
        }
    }
}
