import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class91 {

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lae;")
    private class282 field1667 = new class282();

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lqd;")
    private class44 field1669 = new class44();

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    private int field1672;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lui;")
    private class268 field1671;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Ljf;")
    public static class229 field1663 = class212.method1457((byte) 95, "overlay");

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Ljf;")
    public static class229 field1668 = class212.method1457((byte) 126, "mem=");

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "[[[B")
    public static byte[][][] field1666;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lae;JI)V", line = 8)
    public final void method640(class282 arg0, long arg1, int arg2) {
        if (arg2 != 24179) {
            return;
        }
        field1661++;
        if (this.field1672 == 0) {
            class282 var5 = this.field1669.method372(3791);
            var5.method1747((byte) -118);
            var5.method1986((byte) 86);
            if (this.field1667 == var5) {
                class282 var6 = this.field1669.method372(3791);
                var6.method1747((byte) -110);
                var6.method1986((byte) 86);
            }
        } else {
            this.field1672--;
        }
        this.field1671.method1885(arg1, arg0, (byte) -77);
        this.field1669.method375(arg2 - 24137, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Lfj;", line = 47)
    public final class242 method641(byte arg0) {
        if (arg0 > -80) {
            this.method643(-79L, 63);
        }
        field1657++;
        return this.field1671.method1884((byte) -44);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I", line = 58)
    public static final int method642(byte arg0) {
        if (arg0 != 78) {
            field1663 = (class229) null;
        }
        field1662++;
        return ((class27.field487 == 0 ? 0 : 1) << 21) + ((class298.field5083 == 0 ? 0 : 1) << 20) + ((class201.field3527 ? 1 : 0) << 16) + ((class98.field1750 ? 1 : 0) << 15) + ((class45.field825 ? 1 : 0) << 10) + ((class329.field5605 ? 1 : 0) << 8) + ((class302.field5140 ? 1 : 0) << 6) + ((class320.field5415 ? 1 : 0) << 4) + ((class130.field2307 ? 1 : 0) << 3) + ((class281.field4822 & 0x7) - (-((class41.field735 ? 1 : 0) << 5) - ((class308.field5212 ? 1 : 0) << 7)) + (((class38.field713 ? 1 : 0) << 9) - -((class243.field4293 & 0x3) << 11)) - -((class329.field5607 ? 1 : 0) << 13) - (-((class15.field218 ? 1 : 0) << 19) - (((class31.field531 == 0 ? 0 : 1) << 22) + (class164.method1112() << 23))));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(JI)Lae;", line = 69)
    public final class282 method643(long arg0, int arg1) {
        field1659++;
        if (arg1 != 1649232044) {
            return (class282) null;
        }
        class282 var4 = (class282) this.field1671.method1890(arg0, -109);
        if (var4 != null) {
            this.field1669.method375(arg1 - 1649232002, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 98)
    public final void method644(int arg0) {
        this.field1669.method378(true);
        if (arg0 != 1) {
            this.method643(-68L, -82);
        }
        field1664++;
        this.field1671.method1892((byte) -127);
        this.field1667 = new class282();
        this.field1672 = this.field1670;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 112)
    public static void method645(int arg0) {
        field1663 = null;
        if (arg0 == -21846) {
            field1666 = (byte[][][]) null;
            field1668 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Lfj;", line = 142)
    public final class242 method646(int arg0) {
        field1665++;
        if (arg0 != 1) {
            method647(18, (byte) -21);
        }
        return this.field1671.method1886(arg0 - 127);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I", line = 161)
    public static final int method647(int arg0, byte arg1) {
        field1660++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 < 72) {
            field1668 = (class229) null;
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V", line = 190)
    public class91(int arg0) {
        this.field1672 = arg0;
        this.field1670 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1671 = new class268(var2);
    }
}
