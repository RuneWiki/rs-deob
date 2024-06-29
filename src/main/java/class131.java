import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class131 {

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Z")
    public boolean field1824;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "Z")
    public boolean field1841;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "[S")
    public short[] field1838;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    private int field1833;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "Z")
    public static boolean field1839 = false;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Lbaa;")
    public static class130 field1826 = new class130(4);

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "Lst;")
    public static class335 field1844 = new class335(15, -1);

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    private int field1827;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    private int field1829;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    private int field1831;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    private int field1835;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "J")
    public static long field1832;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "Lkda;")
    public static class65 field1846;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "Ltj;")
    public class687 field1842;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public static void method823(int arg0) {
        field1844 = null;
        if (arg0 != 2048) {
            method825(-123, -28);
        }
        field1826 = null;
        field1846 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILha;IIII)V")
    private final void method824(int arg0, int arg1, class548 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1842 = arg2.method1476(arg0, arg1, arg5, arg3, arg6, 1.0F);
        if (arg4 <= 70) {
            this.field1824 = false;
        }
        field1840++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)Z")
    public static final boolean method825(int arg0, int arg1) {
        field1828++;
        if (arg0 != 501) {
            method825(83, -21);
        }
        if (arg1 == 3 || arg1 == 17 || arg1 == 10 || arg1 == 45 || arg1 == 9) {
            return true;
        } else {
            return arg1 == 22 || arg1 == 1007;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZZ)V")
    public final void method826(int arg0, boolean arg1, boolean arg2) {
        field1830++;
        if (arg1) {
            field1844 = null;
        }
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field1831 * arg0 / 50 + this.field1833 & 0x7FF;
            int var5 = this.field1835;
            if (var5 == 1) {
                var6 = (class24.field312[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class176.field2415[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field1842.method1730((float) (this.field1827 + (this.field1829 * var6 >> 11)) / 2048.0F, (byte) -111);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
    private final void method827(int arg0) {
        field1834++;
        int var2 = this.field1825;
        if (var2 == 2) {
            this.field1827 = 0;
            this.field1829 = 2048;
            this.field1835 = 1;
            this.field1831 = 2048;
        } else if (var2 == 3) {
            this.field1827 = 0;
            this.field1835 = 1;
            this.field1831 = 4096;
            this.field1829 = 2048;
        } else if (var2 == 4) {
            this.field1827 = 0;
            this.field1835 = 4;
            this.field1829 = 2048;
            this.field1831 = 2048;
        } else if (var2 == 5) {
            this.field1831 = 8192;
            this.field1827 = 0;
            this.field1835 = 4;
            this.field1829 = 2048;
        } else if (var2 == 12) {
            this.field1829 = 2048;
            this.field1831 = 2048;
            this.field1835 = 2;
            this.field1827 = 0;
        } else if (var2 == 13) {
            this.field1831 = 8192;
            this.field1827 = 0;
            this.field1829 = 2048;
            this.field1835 = 2;
        } else if (var2 == 10) {
            this.field1831 = 2048;
            this.field1827 = 1536;
            this.field1835 = 3;
            this.field1829 = 512;
        } else if (var2 == 11) {
            this.field1827 = 1536;
            this.field1835 = 3;
            this.field1831 = 4096;
            this.field1829 = 512;
        } else if (var2 == 6) {
            this.field1835 = 3;
            this.field1827 = 1280;
            this.field1829 = 768;
            this.field1831 = 2048;
        } else if (var2 == 7) {
            this.field1827 = 1280;
            this.field1835 = 3;
            this.field1829 = 768;
            this.field1831 = 4096;
        } else if (var2 == 8) {
            this.field1831 = 2048;
            this.field1829 = 1024;
            this.field1835 = 3;
            this.field1827 = 1024;
        } else if (var2 == 9) {
            this.field1835 = 3;
            this.field1829 = 1024;
            this.field1827 = 1024;
            this.field1831 = 4096;
        } else if (var2 == 14) {
            this.field1827 = 1280;
            this.field1835 = 1;
            this.field1831 = 2048;
            this.field1829 = 768;
        } else if (var2 == 15) {
            this.field1829 = 512;
            this.field1827 = 1536;
            this.field1831 = 4096;
            this.field1835 = 1;
        } else if (var2 == 16) {
            this.field1835 = 1;
            this.field1829 = 256;
            this.field1827 = 1792;
            this.field1831 = 8192;
        } else {
            this.field1827 = 0;
            this.field1829 = 2048;
            this.field1831 = 2048;
            this.field1835 = 0;
        }
        if (arg0 != 4) {
            this.method827(-67);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII)V")
    public final void method828(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 19928) {
            method823(69);
        }
        this.field1831 = arg1;
        this.field1835 = arg2;
        this.field1829 = arg0;
        field1843++;
        this.field1827 = arg3;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
    protected class131() {
        if (class176.field2415 == null) {
            class454.method2782((byte) 58);
        }
        this.method827(4);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lha;Ldc;I)V")
    public class131(class548 arg0, class63 arg1, int arg2) {
        if (class176.field2415 == null) {
            class454.method2782((byte) 116);
        }
        this.field1836 = arg1.method505((byte) -119);
        this.field1824 = (this.field1836 & 0x10) != 0;
        this.field1841 = (this.field1836 & 0x8) != 0;
        this.field1836 &= 0x7;
        int var4 = arg1.method482(-772591672) << arg2;
        int var5 = arg1.method482(-772591672) << arg2;
        int var6 = arg1.method482(-772591672) << arg2;
        int var7 = arg1.method505((byte) -119);
        int var8 = var7 * 2 + 1;
        this.field1838 = new short[var8];
        for (int var9 = 0; var9 < this.field1838.length; var9++) {
            short var13 = (short) arg1.method482(-772591672);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field1838[var9] = (short) class678.method3817(var14 << 8, var15);
        }
        int var10 = (var7 << class371.field5241) + class292.field4190;
        int var11 = class577.field7932 == null ? class320.field4444[class454.method2781(10295, arg1.method482(-772591672)) & 0xFFFF] : class577.field7932[arg1.method482(-772591672)];
        int var12 = arg1.method505((byte) -119);
        this.field1825 = var12 & 0x1F;
        this.field1833 = (var12 & 0xE0) << 3;
        if (this.field1825 != 31) {
            this.method827(4);
        }
        this.method824(var4, var6, arg0, var10, 117, var5, var11);
    }
}
