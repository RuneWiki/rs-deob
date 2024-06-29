import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 {

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field1853 = 0;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lic;")
    public static class59 field1846 = class59.method433(0, "Fps:");

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lic;")
    public static class59 field1854 = class59.method433(0, ":");

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field1851 = -1;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
    public static int[] field1855 = new int[50];

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Llf;")
    public static class82 field1842 = new class82(64);

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
    public static int[] field1857 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lic;")
    public static class59 field1859 = class59.method433(0, ")1p");

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Lic;")
    public static class59 field1860 = class59.method433(0, "leuchten2:");

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field1848;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lmd;")
    public static class87 field1856;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "[I")
    public static int[] field1858;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lce;B)V")
    public static final void method625(class20 arg0, byte arg1) {
        int var2 = 94 / ((arg1 + 70) / 48);
        field1843++;
        short var3 = 256;
        for (int var4 = 0; var4 < class89.field2254.length; var4++) {
            class89.field2254[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; var5++) {
            int var17 = (int) ((double) var3 * Math.random() * 128.0D);
            class89.field2254[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var13 = 1; var13 < var3 - 1; var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = (var13 << 7) + var15;
                    field1858[var16] = (class89.field2254[var16 - 1] + class89.field2254[var16 + 1] + class89.field2254[var16 - 128] + class89.field2254[var16 + 128]) / 4;
                }
            }
            int[] var14 = class89.field2254;
            class89.field2254 = field1858;
            field1858 = var14;
        }
        if (arg0 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.field442; var8++) {
            for (int var9 = 0; var9 < arg0.field440; var9++) {
                if (arg0.field437[var7++] != 0) {
                    int var10 = arg0.field438 + var9 + 16;
                    int var11 = arg0.field443 + var8 + 16;
                    int var12 = var10 + (var11 << 7);
                    class89.field2254[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method626(int arg0) {
        if (arg0 != 4931) {
            return;
        }
        for (class86 var1 = (class86) class61.field1561.method682(0); var1 != null; var1 = (class86) class61.field1561.method684((byte) -65)) {
            if (var1.field2156 != null) {
                var1.method708((byte) -73);
            }
        }
        field1841++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method627(int arg0) {
        field1856 = null;
        field1860 = null;
        field1854 = null;
        field1846 = null;
        field1858 = null;
        field1842 = null;
        field1857 = null;
        if (arg0 < -9) {
            field1855 = null;
            field1859 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ldd;I)V")
    public static final void method628(class26 arg0, int arg1) {
        int var2 = 59 % ((arg1 - 37) / 62);
        field1844++;
        class41.field1057 = arg0;
    }
}
