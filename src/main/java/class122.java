import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class122 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Z")
    public boolean field1889;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Z")
    public boolean field1886;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "[S")
    public short[] field1892;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    private int field1896;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field1893 = -1;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Lqaa;")
    public static class27 field1898 = new class27(69, 1);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    private int field1883;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    private int field1899;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lbh;")
    public class36 field1891;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 6)
    public static final void method968(int arg0) {
        class543.field7662 = null;
        class594.field8505 = null;
        field1894++;
        class453.field6368 = null;
        if (arg0 != -7) {
            field1893 = -93;
        }
        class352.field4963 = null;
        class577.field8163 = false;
        class2.field15 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZB)V", line = 27)
    public final void method969(int arg0, boolean arg1, byte arg2) {
        field1890++;
        if (arg2 <= 21) {
            this.field1889 = false;
        }
        int var6;
        if (arg1) {
            var6 = 2048;
        } else {
            int var4 = this.field1887 * arg0 / 50 + this.field1896 & 0x7FF;
            int var5 = this.field1883;
            if (var5 == 1) {
                var6 = (class316.field4487[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class34.field457[var4] >> 1;
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
        this.field1891.method138((float) ((this.field1885 * var6 >> 11) + this.field1899) / 2048.0F, -2);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILha;III)V", line = 111)
    private final void method970(int arg0, int arg1, int arg2, class58 arg3, int arg4, int arg5, int arg6) {
        int var8 = -94 / ((arg5 - 51) / 45);
        this.field1891 = arg3.method577(arg6, arg0, arg4, arg2, arg1, 1.0F);
        field1884++;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 122)
    public static void method971(int arg0) {
        field1898 = null;
        if (arg0 < 115) {
            field1893 = -57;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIIII)V", line = 133)
    public final void method972(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1883 = arg1;
        field1895++;
        this.field1899 = arg3;
        this.field1885 = arg4;
        this.field1887 = arg2;
        if (arg0 < 32) {
            this.method972((byte) 24, 5, 44, 100, 12);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)V", line = 155)
    public static final void method973(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class478.field6819 != null) {
            class478.field6819[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class494.field7042 != null) {
            class494.field7042[arg0][arg1] = (short) arg3;
        }
        if (class128.field1929 != null) {
            class128.field1929[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 167)
    private final void method974(byte arg0) {
        int var2 = 19 / ((-arg0 - 43) / 47);
        int var3 = this.field1888;
        if (var3 == 2) {
            this.field1899 = 0;
            this.field1887 = 2048;
            this.field1885 = 2048;
            this.field1883 = 1;
        } else if (var3 == 3) {
            this.field1899 = 0;
            this.field1887 = 4096;
            this.field1885 = 2048;
            this.field1883 = 1;
        } else if (var3 == 4) {
            this.field1887 = 2048;
            this.field1885 = 2048;
            this.field1899 = 0;
            this.field1883 = 4;
        } else if (var3 == 5) {
            this.field1887 = 8192;
            this.field1899 = 0;
            this.field1883 = 4;
            this.field1885 = 2048;
        } else if (var3 == 12) {
            this.field1885 = 2048;
            this.field1883 = 2;
            this.field1887 = 2048;
            this.field1899 = 0;
        } else if (var3 == 13) {
            this.field1887 = 8192;
            this.field1885 = 2048;
            this.field1883 = 2;
            this.field1899 = 0;
        } else if (var3 == 10) {
            this.field1887 = 2048;
            this.field1883 = 3;
            this.field1885 = 512;
            this.field1899 = 1536;
        } else if (var3 == 11) {
            this.field1887 = 4096;
            this.field1883 = 3;
            this.field1885 = 512;
            this.field1899 = 1536;
        } else if (var3 == 6) {
            this.field1899 = 1280;
            this.field1885 = 768;
            this.field1887 = 2048;
            this.field1883 = 3;
        } else if (var3 == 7) {
            this.field1883 = 3;
            this.field1899 = 1280;
            this.field1887 = 4096;
            this.field1885 = 768;
        } else if (var3 == 8) {
            this.field1887 = 2048;
            this.field1883 = 3;
            this.field1885 = 1024;
            this.field1899 = 1024;
        } else if (var3 == 9) {
            this.field1887 = 4096;
            this.field1899 = 1024;
            this.field1883 = 3;
            this.field1885 = 1024;
        } else if (var3 == 14) {
            this.field1887 = 2048;
            this.field1883 = 1;
            this.field1885 = 768;
            this.field1899 = 1280;
        } else if (var3 == 15) {
            this.field1883 = 1;
            this.field1887 = 4096;
            this.field1885 = 512;
            this.field1899 = 1536;
        } else if (var3 == 16) {
            this.field1883 = 1;
            this.field1887 = 8192;
            this.field1899 = 1792;
            this.field1885 = 256;
        } else {
            this.field1885 = 2048;
            this.field1887 = 2048;
            this.field1899 = 0;
            this.field1883 = 0;
        }
        field1897++;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 366)
    protected class122() {
        if (class34.field457 == null) {
            class191.method1343(-18538);
        }
        this.method974((byte) -124);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lha;Lud;I)V", line = 376)
    public class122(class58 arg0, class35 arg1, int arg2) {
        if (class34.field457 == null) {
            class191.method1343(-18538);
        }
        this.field1882 = arg1.method273(255);
        this.field1889 = (this.field1882 & 0x10) != 0;
        this.field1886 = (this.field1882 & 0x8) != 0;
        this.field1882 &= 0x7;
        int var4 = arg1.method253(-13900) << arg2;
        int var5 = arg1.method253(-13900) << arg2;
        int var6 = arg1.method253(-13900) << arg2;
        int var7 = arg1.method273(255);
        int var8 = var7 * 2 + 1;
        this.field1892 = new short[var8];
        for (int var9 = 0; var9 < this.field1892.length; var9++) {
            short var13 = (short) arg1.method253(-13900);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field1892[var9] = (short) class164.method1221(var15, var14 << 8);
        }
        int var10 = (var7 << class440.field6142) + class252.field3600;
        int var11 = class412.field5695 == null ? class428.field5989[class440.method2643((byte) -101, arg1.method253(-13900)) & 0xFFFF] : class412.field5695[arg1.method253(-13900)];
        int var12 = arg1.method273(255);
        this.field1888 = var12 & 0x1F;
        this.field1896 = var12 & 0xE0 << 3;
        if (this.field1888 != 31) {
            this.method974((byte) -107);
        }
        this.method970(var6, var11, var10, arg0, var5, -87, var4);
    }
}
