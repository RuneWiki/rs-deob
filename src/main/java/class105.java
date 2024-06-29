import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class105 extends class190 {

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "[I")
    private int[] field1846 = new int[this.field3025];

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "Lsk;")
    public static class423 field1844 = new class423("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "[C")
    public static char[] field1853 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    private int field1850;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Luf;")
    public static class297 field1851;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "[B")
    private byte[] field1843;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "[I")
    public static int[] field1852;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "[Loa;")
    public static class471[] field1838;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field1855;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public final void method770(byte arg0) {
        ++field1845;
        this.field1847 = Math.abs(this.field1847);
        if (~this.field1847 <= -4097) {
            this.field1847 = 4095;
        }
        if (arg0 != -95) {
            field1852 = null;
        }
        this.method777(this.field1850++, 1811976897, (byte) (this.field1847 >> 4));
        this.field1847 = 0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)V")
    public static final void method771(int arg0, int arg1, int arg2, int arg3) {
        ++field1841;
        if (arg2 == 16711935) {
            class174 var4 = class152.field2427[arg3][arg1];
            class219.method1341(var4 == null ? class487.field7412 : var4, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public final void method772(int arg0) {
        this.field1850 = 0;
        this.field1847 = 0;
        ++field1839;
        if (arg0 != 1690691948) {
            this.field1847 = 62;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIF)V")
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field3025; ++var7) {
            this.field1846[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
    public final void method773(int arg0, int arg1, int arg2) {
        if (arg1 == -15478) {
            ++field1840;
            this.field1847 += this.field1846[arg2] * arg0 >> 12;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZ)I")
    public static final int method774(int arg0, int arg1, boolean arg2) {
        ++field1848;
        if (!arg2) {
            method776(97, 119, 9, -23, 104, 101);
        }
        int var3 = arg1 >>> 24;
        int var4 = -var3 + 255;
        int var5 = (16711680 & (65280 & arg1) * var3 | -16711936 & (16711935 & arg1) * var3) >>> 8;
        return (((arg0 & 65280) * var4 & 16711680 | -16711936 & (arg0 & 16711935) * var4) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
    public static void method775(byte arg0) {
        field1851 = null;
        field1853 = null;
        field1838 = null;
        field1855 = null;
        if (arg0 >= -37) {
            method775((byte) 89);
        }
        field1844 = null;
        field1852 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIII)V")
    public static final void method776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~class463.field7116.field2941 != -1 && arg1 != 0 && class255.field3888 < 50 && ~arg0 != 0) {
            class432.field6354[class255.field3888++] = new class456((byte) 1, arg0, arg1, arg3, arg5, arg4);
        }
        int var6 = -84 % ((arg2 - -75) / 41);
        ++field1849;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB)V")
    public void method777(int arg0, int arg1, byte arg2) {
        if (arg1 != 1811976897) {
            this.method770((byte) 55);
        }
        this.field1843[this.field1850++] = (byte) (class330.method2050(arg2 >> 1, 127) + 127);
        ++field1854;
    }
}
