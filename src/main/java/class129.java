import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class129 {

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field1854 = 0;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public int field1852 = 0;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Z")
    private boolean field1848 = false;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "[I")
    public static int[] field1858 = new int[128];

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static volatile int field1862 = -1;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field1853 = 2;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    private int field1844;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public int field1857;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "J")
    public long field1845;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[[B")
    public static byte[][] field1840;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method827(int arg0) {
        this.field1855 = class221.field3465[this.field1844];
        this.field1850 = (int) Math.sqrt((double) (this.field1861 * this.field1861 + this.field1846 * this.field1846 + (this.field1847 * this.field1847)));
        field1856++;
        if (this.field1859 == 0) {
            this.field1859 = 1;
        }
        if (arg0 != -3) {
            method829((byte) 11);
        }
        if (this.field1843 == 0) {
            this.field1845 = 2147483647L;
        } else if (this.field1843 == 1) {
            this.field1845 = (long) (this.field1850 * 8 / this.field1859);
            this.field1845 *= this.field1845;
        } else if (this.field1843 == 2) {
            this.field1845 = (long) (this.field1850 * 8 / this.field1859);
        }
        if (this.field1848) {
            this.field1850 *= -1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZLim;)V")
    private final void method828(int arg0, boolean arg1, class170 arg2) {
        if (arg1) {
            return;
        }
        field1841++;
        if (arg0 == 1) {
            this.field1844 = arg2.method1186((byte) -115);
        } else if (arg0 == 2) {
            arg2.method1218(116);
        } else if (arg0 == 3) {
            this.field1846 = arg2.method1190(6345);
            this.field1861 = arg2.method1190(6345);
            this.field1847 = arg2.method1190(6345);
        } else if (arg0 == 4) {
            this.field1843 = arg2.method1218(-45);
            this.field1859 = arg2.method1190(6345);
        } else if (arg0 == 6) {
            this.field1857 = arg2.method1218(-78);
        } else if (arg0 == 8) {
            this.field1852 = 1;
        } else if (arg0 == 9) {
            this.field1854 = 1;
        } else if (arg0 == 10) {
            this.field1848 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method829(byte arg0) {
        if (arg0 != -52) {
            field1860 = 66;
        }
        field1840 = null;
        field1858 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lim;B)V")
    public final void method830(class170 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1218(109);
            if (var3 == 0) {
                field1842++;
                if (arg1 != 101) {
                    this.method828(-128, false, (class170) null);
                    return;
                }
                return;
            }
            this.method828(var3, false, arg0);
        }
    }
}
