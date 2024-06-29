import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class130 {

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "Z")
    public boolean field1856;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "Z")
    public boolean field1865;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "[S")
    public short[] field1863;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    private int field1861;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    public int field1871;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "J")
    public static long field1860 = 0L;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "Lem;")
    public static class206 field1866 = new class206(50, 6);

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "[Lnm;")
    public static class437[] field1873 = new class437[50];

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "[Z")
    public static boolean[] field1872 = new boolean[100];

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    private int field1855;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    private int field1857;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    private int field1859;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "Ltw;")
    public class186 field1852;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "Ljava/awt/Frame;")
    public static Frame field1868;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILr;IIIII)V", line = 4)
    private final void method920(int arg0, class166 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1867++;
        if (arg5 >= 126) {
            this.field1852 = arg1.method108(arg0, arg2, arg4, arg6, arg3, 1.0F);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)I", line = 19)
    public static final int method921(int arg0, int arg1) {
        return class523.field7099 == null ? 0 : class523.field7099[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 22)
    private final void method922(int arg0) {
        if (arg0 != 16) {
            return;
        }
        field1853++;
        int var2 = this.field1871;
        if (var2 == 2) {
            this.field1869 = 2048;
            this.field1859 = 0;
            this.field1857 = 1;
            this.field1855 = 2048;
        } else if (var2 == 3) {
            this.field1869 = 2048;
            this.field1857 = 1;
            this.field1859 = 0;
            this.field1855 = 4096;
        } else if (var2 == 4) {
            this.field1859 = 0;
            this.field1869 = 2048;
            this.field1857 = 4;
            this.field1855 = 2048;
        } else if (var2 == 5) {
            this.field1855 = 8192;
            this.field1857 = 4;
            this.field1859 = 0;
            this.field1869 = 2048;
        } else if (var2 == 12) {
            this.field1869 = 2048;
            this.field1859 = 0;
            this.field1857 = 2;
            this.field1855 = 2048;
        } else if (var2 == 13) {
            this.field1855 = 8192;
            this.field1857 = 2;
            this.field1859 = 0;
            this.field1869 = 2048;
        } else if (var2 == 10) {
            this.field1857 = 3;
            this.field1869 = 512;
            this.field1859 = 1536;
            this.field1855 = 2048;
        } else if (var2 == 11) {
            this.field1859 = 1536;
            this.field1855 = 4096;
            this.field1869 = 512;
            this.field1857 = 3;
        } else if (var2 == 6) {
            this.field1859 = 1280;
            this.field1855 = 2048;
            this.field1857 = 3;
            this.field1869 = 768;
        } else if (var2 == 7) {
            this.field1857 = 3;
            this.field1859 = 1280;
            this.field1869 = 768;
            this.field1855 = 4096;
        } else if (var2 == 8) {
            this.field1869 = 1024;
            this.field1855 = 2048;
            this.field1859 = 1024;
            this.field1857 = 3;
        } else if (var2 == 9) {
            this.field1869 = 1024;
            this.field1857 = 3;
            this.field1855 = 4096;
            this.field1859 = 1024;
        } else if (var2 == 14) {
            this.field1857 = 1;
            this.field1859 = 1280;
            this.field1869 = 768;
            this.field1855 = 2048;
        } else if (var2 == 15) {
            this.field1869 = 512;
            this.field1859 = 1536;
            this.field1855 = 4096;
            this.field1857 = 1;
        } else if (var2 == 16) {
            this.field1855 = 8192;
            this.field1869 = 256;
            this.field1857 = 1;
            this.field1859 = 1792;
        } else {
            this.field1859 = 0;
            this.field1869 = 2048;
            this.field1855 = 2048;
            this.field1857 = 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)V", line = 227)
    public final void method923(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1859 = arg4;
        this.field1855 = arg3;
        this.field1869 = arg2;
        field1858++;
        if (arg0 != -17371) {
            field1866 = null;
        }
        this.field1857 = arg1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIB)V", line = 244)
    public final void method924(boolean arg0, int arg1, byte arg2) {
        field1854++;
        int var4 = 75 / ((arg2 - 35) / 57);
        int var5;
        if (arg0) {
            var5 = 2048;
        } else {
            int var6 = this.field1855 * arg1 / 50 + this.field1861 & 0x7FF;
            int var7 = this.field1857;
            if (var7 == 1) {
                var5 = (class597.field8342[var6 << 3] >> 4) + 1024;
            } else if (var7 == 3) {
                var5 = class242.field3302[var6] >> 1;
            } else if (var7 == 4) {
                var5 = var6 >> 10 << 11;
            } else if (var7 == 2) {
                var5 = var6;
            } else if (var7 == 5) {
                var5 = (var6 < 1024 ? var6 : 2048 - var6) << 1;
            } else {
                var5 = 2048;
            }
        }
        this.field1852.method73((float) ((this.field1869 * var5 >> 11) + this.field1859) / 2048.0F, (byte) -111);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V", line = 321)
    public static void method925(int arg0) {
        field1868 = null;
        field1872 = null;
        field1873 = null;
        if (arg0 != -22054) {
            method925(90);
        }
        field1866 = null;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V", line = 353)
    protected class130() {
        if (class242.field3302 == null) {
            class613.method3431(13661);
        }
        this.method922(16);
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lr;Lac;I)V", line = 365)
    public class130(class166 arg0, class501 arg1, int arg2) {
        if (class242.field3302 == null) {
            class613.method3431(13661);
        }
        this.field1870 = arg1.method2874((byte) -75);
        this.field1856 = (this.field1870 & 0x8) != 0;
        this.field1865 = (this.field1870 & 0x10) != 0;
        this.field1870 &= 0x7;
        int var4 = arg1.method2845(-1) << arg2;
        int var5 = arg1.method2845(-1) << arg2;
        int var6 = arg1.method2845(-1) << arg2;
        int var7 = arg1.method2874((byte) -75);
        int var8 = var7 * 2 + 1;
        this.field1863 = new short[var8];
        for (int var9 = 0; var9 < this.field1863.length; var9++) {
            short var13 = (short) arg1.method2845(-1);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field1863[var9] = (short) class647.method3617(var15, var14 << 8);
        }
        int var10 = (var7 << class588.field8259) + class265.field3586;
        int var11 = class78.field1186 == null ? class244.field3322[class199.method1317(arg1.method2845(-1), 2124276899) & 0xFFFF] : class78.field1186[arg1.method2845(-1)];
        int var12 = arg1.method2874((byte) -75);
        this.field1861 = (var12 & 0xE0) << 3;
        this.field1871 = var12 & 0x1F;
        if (this.field1871 != 31) {
            this.method922(16);
        }
        this.method920(var4, arg0, var6, var11, var5, 127, var10);
    }
}
