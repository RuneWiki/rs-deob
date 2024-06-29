import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class113 extends class59 {

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    private int field1918 = 3072;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    private int field1925 = 1024;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    private int field1928 = 2048;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "Lpd;")
    public static class205 field1916 = new class205(0, 0);

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Lph;")
    public static class229 field1924 = class266.method1858("<col=ff3000>", 0);

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field1923 = 0;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "[I")
    public static int[] field1926 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "[I")
    public static int[] field1921 = new int[100];

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "Lph;")
    public static class229 field1927 = class266.method1858("gr-Un:", 0);

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V", line = 9)
    public final void method65(int arg0) {
        this.field1928 = this.field1918 - this.field1925;
        field1919++;
        if (arg0 <= 110) {
            this.field1925 = -67;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[[I", line = 25)
    public final int[][] method116(int arg0, int arg1) {
        field1913++;
        if (arg1 != 4588) {
            method859(-104);
        }
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int[][] var4 = this.method397(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class293.field4789; var11++) {
                var8[var11] = this.field1925 + (var5[var11] * this.field1928 >> 12);
                var9[var11] = (var6[var11] * this.field1928 >> 12) + this.field1925;
                var10[var11] = (var7[var11] * this.field1928 >> 12) + this.field1925;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZB)V", line = 73)
    public static final void method857(boolean arg0, byte arg1) {
        field1915++;
        byte[][] var2;
        byte var3;
        if (class99.field1675 && arg0) {
            var2 = class36.field590;
            var3 = 1;
        } else {
            var2 = class131.field2132;
            var3 = 4;
        }
        int var4 = 0;
        if (arg1 != 80) {
            method859(15);
        }
        while (var3 > var4) {
            class53.method364(14874);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class276.field4598[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 14 & 0x3FF;
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = (var7 & 0x3FF9) >> 3;
                            int var12 = (var9 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class287.field4723.length; var13++) {
                                if (class287.field4723[var13] == var12 && var2[var13] != null) {
                                    class110.method839(var8, var5 * 8, class160.field2592, var2[var13], (var9 & 0x7) * 8, (var11 & 0x7) * 8, var6 * 8, -89, arg0, var10, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BILhb;)V", line = 157)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field1922++;
        if (arg0 != 115) {
            return;
        }
        if (arg1 == 0) {
            this.field1925 = arg2.method1161(true);
        } else if (arg1 == 1) {
            this.field1918 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field841 = arg2.method1178(8) == 1;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)V", line = 204)
    public static final void method858(int arg0, int arg1, int arg2) {
        field1914++;
        class281 var3 = class135.method957(0, arg0, 12);
        var3.method1932(0);
        var3.field4660 = arg1;
        if (arg2 != 24187) {
            method858(36, -45, -122);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)[I", line = 225)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        field1912++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(arg1, 0, (byte) 124);
            for (int var5 = 0; var5 < class293.field4789; var5++) {
                var3[var5] = (var4[var5] * this.field1928 >> 12) + this.field1925;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 259)
    public class113() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)V", line = 264)
    public static void method859(int arg0) {
        field1924 = null;
        if (arg0 == -1837) {
            field1916 = null;
            field1927 = null;
            field1926 = null;
            field1921 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIZ)V", line = 280)
    public static final void method860(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class88.field1504 = arg1;
        class129.field2114 = arg2;
        class202.field3339 = arg3;
        class277.field4604 = new class72[arg0][class88.field1504][class129.field2114];
        class103.field1753 = new int[arg0][class88.field1504 + 1][class129.field2114 + 1];
        if (class99.field1675) {
            class37.field600 = new class264[4][];
        }
        if (arg4) {
            class324.field5533 = new class72[1][class88.field1504][class129.field2114];
            class39.field622 = new int[class88.field1504][class129.field2114];
            class203.field3346 = new int[1][class88.field1504 + 1][class129.field2114 + 1];
            if (class99.field1675) {
                class132.field2142 = new class264[1][];
            }
        } else {
            class324.field5533 = (class72[][][]) null;
            class39.field622 = (int[][]) null;
            class203.field3346 = (int[][][]) null;
            class132.field2142 = (class264[][]) null;
        }
        class110.method840(false);
        class75.field1268 = new class149[500];
        class103.field1755 = 0;
        class68.field1084 = new class149[500];
        class207.field3412 = 0;
        class316.field5370 = new int[arg0][class88.field1504 + 1][class129.field2114 + 1];
        class24.field312 = new class152[5000];
        class45.field688 = 0;
        class167.field2720 = new class152[100];
        class119.field2000 = new boolean[class202.field3339 + class202.field3339 + 1][class202.field3339 + class202.field3339 + 1];
        class230.field3819 = new boolean[class202.field3339 + class202.field3339 + 2][class202.field3339 + class202.field3339 + 2];
        class149.field2415 = new byte[arg0][class88.field1504][class129.field2114];
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBLjava/util/Random;)I", line = 327)
    public static final int method861(int arg0, byte arg1, Random arg2) {
        field1920++;
        if (arg1 != -24) {
            method859(96);
        }
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class114.method869(arg1 - 78, arg0)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class277.method1911((byte) 115, arg0, var4);
        }
    }
}
