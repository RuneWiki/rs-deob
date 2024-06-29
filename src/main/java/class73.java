import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 extends class47 {

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Loc;")
    private static class99 field1842 = class48.method402((byte) -104, "From");

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Loc;")
    public static class99 field1843 = field1842;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Loc;")
    public static class99 field1845 = class48.method402((byte) -104, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lr;")
    public static class118 field1847 = new class118(64);

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lr;")
    public static class118 field1850 = new class118(128);

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lr;")
    public static class118 field1851 = new class118(200);

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "[I")
    public static int[] field1852 = new int[32];

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "Loc;")
    public static class99 field1853 = class48.method402((byte) -104, "Weiter");

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "Loc;")
    public static class99 field1856;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Loc;")
    public static class99 field1857;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Loc;")
    public static class99 field1858;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "[I")
    public static int[] field1855;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "[I")
    public static int[] field1854;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Ldf;")
    public static class28 field1849;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
    public static final void method663(int arg0, byte arg1) {
        field1848++;
        if (class66.field1699 == arg0) {
            return;
        }
        if (class66.field1699 == 0) {
            class81.method704((byte) 120);
        }
        if (arg0 == 20 || arg0 == 40) {
            class35.field894 = 0;
            class18.field481 = 0;
            class12.field265 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class35.field886 != null) {
            class35.field886.method1215(false);
            class35.field886 = null;
        }
        if (class66.field1699 == 25 || class66.field1699 == 40) {
            class5.method28(arg1 ^ 0x43);
            class96.method787();
        }
        if (class66.field1699 == 25) {
            class100.field2438 = 1;
            class68.field1759 = 0;
            class14.field326 = 0;
            class135.field3364 = 0;
            class100.field2443 = 1;
        }
        if (arg0 == 0 || arg0 == 35) {
            class122.method1017(4);
            class5.method34(arg1 ^ 0xFFFFFFA0);
            if (class46.field1129 == null) {
                class46.field1129 = class59.method531(503, false, 765, class5.field99);
            }
        }
        if (arg1 != 52) {
            method665(4, 15, -126, -112, null);
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class46.field1129 = null;
            class122.method1017(4);
            class69.method606((byte) -95, class5.field99, class144.field3603, class61.field1633);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class46.field1129 = null;
            class5.method34(arg1 ^ 0xFFFFFFA0);
            class53.method442(class144.field3603, false, class5.field99);
        }
        class66.field1699 = arg0;
        class80.field1971 = true;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public static void method664(byte arg0) {
        field1843 = null;
        field1849 = null;
        field1854 = null;
        field1842 = null;
        field1850 = null;
        field1858 = null;
        field1855 = null;
        field1857 = null;
        field1856 = null;
        field1852 = null;
        field1845 = null;
        field1853 = null;
        field1851 = null;
        if (arg0 != 68) {
            method663(11, (byte) 21);
        }
        field1847 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIILle;)V")
    public static final void method665(int arg0, int arg1, int arg2, int arg3, class81 arg4) {
        field1844++;
        if (class31.field748 >= 50 || class81.field2013 == 0 || (arg4.field1995 == null || arg2 >= arg4.field1995.length)) {
            return;
        }
        int var5 = arg4.field1995[arg2];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class2.field41[class31.field748] = var6;
        int var7 = var5 & 0xF;
        int var8 = var5 >> 4 & 0x7;
        int var9 = (arg0 - 64) / 128;
        int var10 = (arg1 - 64) / 128;
        class53.field1262[class31.field748] = var8;
        class67.field1709[class31.field748] = arg3;
        class59.field1561[class31.field748] = null;
        class79.field1953[class31.field748] = (var9 << 16) + (var10 << 8) + var7;
        class31.field748++;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class73() {
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    public static final int method666(int arg0, int arg1, int arg2) {
        field1846++;
        if (arg1 != 11181) {
            field1847 = null;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
    public class73(int arg0) {
        this.field1841 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1852[var1] = var0 - 1;
            var0 += var0;
        }
        field1856 = class48.method402((byte) -104, "redstone1");
        field1857 = class48.method402((byte) -104, "Willkommen auf RuneScape");
        field1858 = class48.method402((byte) -104, "bevor Sie die (WRegelversto-8 melden(W Option benutzen");
        field1855 = new int[25];
        field1854 = new int[500];
        field1859 = 0;
    }
}
