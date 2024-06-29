import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 {

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lwd;")
    public static class150 field1851 = class2.method9(true, "");

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lwd;")
    public static class150 field1853 = class2.method9(true, "@or2@");

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lwd;")
    private static class150 field1845 = class2.method9(true, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lwd;")
    public static class150 field1849 = class2.method9(true, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lwd;")
    public static class150 field1852 = field1845;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "[Lde;")
    public static class27[] field1857 = new class27[4];

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[J")
    public static long[] field1859 = new long[100];

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1858 = 0;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lwd;")
    private static class150 field1862 = class2.method9(true, "Enter name:");

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lwd;")
    public static class150 field1847 = field1862;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "[I")
    public static int[] field1855;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([BLpb;II)V")
    public static final void method556(byte[] arg0, class106 arg1, int arg2, int arg3) {
        class91 var4 = new class91();
        var4.field2228 = arg2;
        var4.field2133 = arg1;
        var4.field2122 = 0;
        field1854++;
        var4.field2123 = arg0;
        class103 var5 = class73.field1821;
        synchronized (class73.field1821) {
            class73.field1821.method711(var4, arg3);
        }
        class47.method356((byte) 90);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)I")
    public static final int method557(int arg0, byte arg1, int arg2) {
        field1861++;
        int var3 = 0;
        int var4 = -111 / ((-arg1 - 2) / 36);
        while (arg0 > 0) {
            arg0--;
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method558(byte arg0) {
        field1857 = null;
        field1847 = null;
        field1845 = null;
        field1852 = null;
        field1859 = null;
        field1862 = null;
        field1855 = null;
        int var1 = 96 % ((-arg0 - 28) / 35);
        field1853 = null;
        field1851 = null;
        field1849 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)I")
    public static final int method559(int arg0, boolean arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1) {
            field1853 = null;
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        field1850++;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lwd;Lff;Lwd;B)Lhb;")
    public static final class51 method560(class150 arg0, class42 arg1, class150 arg2, byte arg3) {
        field1860++;
        if (arg3 > -89) {
            field1862 = null;
        }
        int var4 = arg1.method310((byte) 14, arg0);
        int var5 = arg1.method323((byte) -10, var4, arg2);
        return class113.method795(arg1, var4, (byte) -118, var5);
    }
}
