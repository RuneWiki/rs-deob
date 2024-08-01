import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jh")
public class class93 {

    @OriginalMember(owner = "jh", name = "q", descriptor = "I")
    private int field1920 = -1;

    @OriginalMember(owner = "jh", name = "i", descriptor = "I")
    private int field1912 = 0;

    @OriginalMember(owner = "jh", name = "e", descriptor = "Ltf;")
    private class181 field1908 = new class181();

    @OriginalMember(owner = "jh", name = "w", descriptor = "Z")
    public boolean field1926 = false;

    @OriginalMember(owner = "jh", name = "v", descriptor = "I")
    private int field1925;

    @OriginalMember(owner = "jh", name = "a", descriptor = "[[[I")
    private int[][][] field1904;

    @OriginalMember(owner = "jh", name = "r", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "jh", name = "p", descriptor = "[Ljg;")
    private class92[] field1919;

    @OriginalMember(owner = "jh", name = "g", descriptor = "[[I")
    public static int[][] field1910 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "jh", name = "k", descriptor = "I")
    public static int field1914 = 0;

    @OriginalMember(owner = "jh", name = "d", descriptor = "[Lhf;")
    public static class75[] field1907 = new class75[16];

    @OriginalMember(owner = "jh", name = "n", descriptor = "Llf;")
    public static class109 field1917 = class35.method275("Fertigkeit)2", 2);

    @OriginalMember(owner = "jh", name = "b", descriptor = "[[I")
    public static int[][] field1905 = new int[104][104];

    @OriginalMember(owner = "jh", name = "t", descriptor = "[I")
    public static int[] field1923 = new int[200];

    @OriginalMember(owner = "jh", name = "c", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "jh", name = "f", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "jh", name = "j", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "jh", name = "m", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "jh", name = "o", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "jh", name = "s", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "jh", name = "u", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "jh", name = "l", descriptor = "Ldb;")
    public static class33 field1915;

    @OriginalMember(owner = "jh", name = "h", descriptor = "[Lkf;")
    public static class100[] field1911;

    @OriginalMember(owner = "jh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method673(byte arg0, int arg1) {
        field1918++;
        if (arg0 >= -126) {
            return null;
        } else if (this.field1925 == this.field1921) {
            this.field1926 = this.field1919[arg1] == null;
            this.field1919[arg1] = class128.field2467;
            return this.field1904[arg1];
        } else if (this.field1921 == 1) {
            this.field1926 = this.field1920 != arg1;
            this.field1920 = arg1;
            return this.field1904[0];
        } else {
            class92 var3 = this.field1919[arg1];
            if (this.field1926 = var3 == null) {
                if (this.field1912 >= this.field1921) {
                    class92 var4 = (class92) this.field1908.method1226(119);
                    var3 = new class92(arg1, var4.field1892);
                    this.field1919[var4.field1887] = null;
                    var4.method452(true);
                } else {
                    var3 = new class92(arg1, this.field1912);
                    this.field1912++;
                }
                this.field1919[arg1] = var3;
            }
            this.field1908.method1227(var3, (byte) -69);
            return this.field1904[var3.field1892];
        }
    }

    @OriginalMember(owner = "jh", name = "a", descriptor = "(ZB)V")
    public static final void method674(boolean arg0, byte arg1) {
        field1922++;
        int var2 = -25 % ((-arg1 - 20) / 57);
        class6.field89 = arg0;
        if (!class6.field89) {
            int var3 = class95.field1934.method575(1440014816);
            int var4 = (class204.field4006 - class95.field1934.field1773) / 16;
            class24.field538 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class24.field538[var5][var15] = class95.field1934.method582(15);
                }
            }
            int var6 = class95.field1934.method575(1440014816);
            int var7 = class95.field1934.method590(28747);
            int var8 = class95.field1934.method569(true);
            int var9 = class95.field1934.method575(1440014816);
            class143.field2749 = new byte[var4][];
            boolean var10 = false;
            class49.field1013 = new int[var4];
            class103.field2037 = new int[var4];
            class84.field1700 = new byte[var4][];
            if ((var6 / 8 == 48 || var6 / 8 == 49) && (var3 / 8) == 48) {
                var10 = true;
            }
            if (var6 / 8 == 48 && var3 / 8 == 148) {
                var10 = true;
            }
            class77.field1494 = new int[var4];
            int var11 = 0;
            for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                for (int var13 = (var3 - 6) / 8; var13 <= (var3 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (!var10 || var13 != 49 && var13 != 149 && var13 != 147 && var12 != 50 && (var12 != 49 || var13 != 47)) {
                        class103.field2037[var11] = var14;
                        class49.field1013[var11] = class171.field3212.method151((byte) 106, class36.method279(new class109[] { class199.field3796, class52.method345((byte) 85, var12), class159.field2982, class52.method345((byte) 85, var13) }, -34));
                        class77.field1494[var11] = class171.field3212.method151((byte) 106, class36.method279(new class109[] { class146.field2817, class52.method345((byte) 85, var12), class159.field2982, class52.method345((byte) 85, var13) }, 119));
                        var11++;
                    }
                }
            }
            class65.method416((byte) 94, var3, var6, var8, var9, var7);
            return;
        }
        int var16 = class95.field1934.method569(true);
        int var17 = class95.field1934.method573(24263);
        int var18 = class95.field1934.method594(255);
        int var19 = class95.field1934.method569(true);
        class95.field1934.method1338(11045);
        for (int var20 = 0; var20 < 4; var20++) {
            for (int var36 = 0; var36 < 13; var36++) {
                for (int var37 = 0; var37 < 13; var37++) {
                    int var38 = class95.field1934.method1341((byte) 72, 1);
                    if (var38 == 1) {
                        class10.field164[var20][var36][var37] = class95.field1934.method1341((byte) 123, 26);
                    } else {
                        class10.field164[var20][var36][var37] = -1;
                    }
                }
            }
        }
        class95.field1934.method1337(true);
        int var21 = (class204.field4006 - class95.field1934.field1773) / 16;
        class24.field538 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var35 = 0; var35 < 4; var35++) {
                class24.field538[var22][var35] = class95.field1934.method579((byte) -24);
            }
        }
        int var23 = class95.field1934.method575(1440014816);
        class103.field2037 = new int[var21];
        class84.field1700 = new byte[var21][];
        class143.field2749 = new byte[var21][];
        class49.field1013 = new int[var21];
        class77.field1494 = new int[var21];
        int var24 = 0;
        for (int var25 = 0; var25 < 4; var25++) {
            for (int var26 = 0; var26 < 13; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    int var28 = class10.field164[var25][var26][var27];
                    if (var28 != -1) {
                        int var29 = var28 >> 14 & 0x3FF;
                        int var30 = var28 >> 3 & 0x7FF;
                        int var31 = (var29 / 8 << 8) + var30 / 8;
                        for (int var32 = 0; var32 < var24; var32++) {
                            if (class103.field2037[var32] == var31) {
                                var31 = -1;
                                break;
                            }
                        }
                        if (var31 != -1) {
                            int var33 = var31 >> 8 & 0xFF;
                            class103.field2037[var24] = var31;
                            int var34 = var31 & 0xFF;
                            class49.field1013[var24] = class171.field3212.method151((byte) 106, class36.method279(new class109[] { class199.field3796, class52.method345((byte) 85, var33), class159.field2982, class52.method345((byte) 85, var34) }, 115));
                            class77.field1494[var24] = class171.field3212.method151((byte) 106, class36.method279(new class109[] { class146.field2817, class52.method345((byte) 85, var33), class159.field2982, class52.method345((byte) 85, var34) }, 123));
                            var24++;
                        }
                    }
                }
            }
        }
        class65.method416((byte) 94, var18, var16, var23, var19, var17);
    }

    @OriginalMember(owner = "jh", name = "a", descriptor = "(I)V")
    public static void method675(int arg0) {
        field1923 = null;
        field1915 = null;
        field1907 = null;
        field1911 = null;
        field1917 = null;
        if (arg0 != 4) {
            field1910 = null;
        }
        field1905 = null;
        field1910 = null;
    }

    @OriginalMember(owner = "jh", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method676(byte arg0, KeyEvent arg1) {
        field1913++;
        if (arg0 != 117) {
            field1905 = null;
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "jh", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method677(byte arg0) {
        int var2 = 48 / ((39 - arg0) / 55);
        field1924++;
        if (this.field1925 != this.field1921) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field1921; var3++) {
            this.field1919[var3] = class128.field2467;
        }
        return this.field1904;
    }

    @OriginalMember(owner = "jh", name = "a", descriptor = "(Z)V")
    public final void method678(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field1921; var2++) {
            this.field1904[var2][0] = null;
            this.field1904[var2][1] = null;
            this.field1904[var2][2] = null;
            this.field1904[var2] = null;
        }
        this.field1919 = null;
        field1906++;
        this.field1904 = null;
        this.field1908.method1237(-15004);
        this.field1908 = null;
    }

    @OriginalMember(owner = "jh", name = "a", descriptor = "(III)I")
    public static final int method679(int arg0, int arg1, int arg2) {
        int var3 = -49 / ((arg2 + 65) / 48);
        field1916++;
        class106 var4 = (class106) class76.field1466.method337((long) arg0, (byte) -123);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field2096.length; var6++) {
                if (var4.field2103[var6] == arg1) {
                    var5 += var4.field2096[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "jh", name = "<init>", descriptor = "(III)V")
    public class93(int arg0, int arg1, int arg2) {
        this.field1925 = arg1;
        this.field1904 = new int[arg0][3][arg2];
        this.field1921 = arg0;
        this.field1919 = new class92[arg1];
    }
}
