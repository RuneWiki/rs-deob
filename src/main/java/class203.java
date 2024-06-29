import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class203 extends class180 {

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "[J")
    private long[] field4053 = new long[10];

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    private int field4054 = 1;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    private int field4048 = 256;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    private int field4044 = 0;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "J")
    private long field4043 = class190.method1253((byte) 18);

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field4041 = 0;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "Ldd;")
    private static class35 field4047 = class180.method1196((byte) 127, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "Ldd;")
    public static class35 field4052 = field4047;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
    public static int[] field4046 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    private int field4042;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "Lag;")
    public static class8 field4051;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[[B")
    public static byte[][] field4039;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[IIB)I")
    public static final int method1340(int arg0, int[] arg1, int arg2, byte arg3) {
        if (arg3 <= 116) {
            method1340(-71, null, 3, (byte) 45);
        }
        field4040++;
        return arg1[0] * arg0 + arg1[1] * arg2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Z")
    public static final boolean method1341(int arg0, int arg1) {
        if (arg1 == 4) {
            field4045++;
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static void method1342(int arg0) {
        field4046 = null;
        if (arg0 == 8) {
            field4039 = null;
            field4047 = null;
            field4052 = null;
            field4051 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBI)I")
    public final int method1018(int arg0, byte arg1, int arg2) {
        int var4 = this.field4048;
        field4038++;
        this.field4048 = 300;
        int var5 = this.field4054;
        this.field4054 = 1;
        this.field4043 = class190.method1253((byte) 18);
        if (this.field4053[this.field4042] == 0L) {
            this.field4054 = var5;
            this.field4048 = var4;
        } else if (this.field4043 > this.field4053[this.field4042]) {
            this.field4048 = (int) ((long) (arg0 * 2560) / (this.field4043 - this.field4053[this.field4042]));
        }
        if (this.field4048 < 25) {
            this.field4048 = 25;
        }
        if (this.field4048 > 256) {
            this.field4048 = 256;
            this.field4054 = (int) ((long) arg0 - (this.field4043 - this.field4053[this.field4042]) / 10L);
        }
        if (arg0 < this.field4054) {
            this.field4054 = arg0;
        }
        this.field4053[this.field4042] = this.field4043;
        this.field4042 = (this.field4042 + 1) % 10;
        if (this.field4054 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4053[var6] != 0L) {
                    this.field4053[var6] += this.field4054;
                }
            }
        }
        int var7 = 0;
        if (arg2 > this.field4054) {
            this.field4054 = arg2;
        }
        class204.method1347((long) this.field4054, false);
        if (arg1 > -34) {
            return -39;
        }
        while (this.field4044 < 256) {
            this.field4044 += this.field4048;
            var7++;
        }
        this.field4044 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BI)Lae;")
    public static final class6 method1343(byte[] arg0, int arg1) {
        field4050++;
        if (arg0 == null) {
            return null;
        }
        class6 var2 = new class6(arg0, class207.field4119, class143.field3003, class15.field269, class118.field2623, class116.field2591, field4039);
        if (arg1 != 8) {
            method1343(null, -44);
        }
        class123.method878(-30);
        return var2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V")
    public static final void method1344() {
        int var0 = class137.field2923[class88.field1966];
        class79[] var1 = class137.field2932[class88.field1966];
        class196.field3898 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            class79 var3 = var1[var2];
            if (var3.field1841 == 1) {
                int var4 = var3.field1835 + class115.field2583 - class92.field2045;
                if (var4 >= 0 && var4 <= class115.field2583 + class115.field2583) {
                    int var5 = var3.field1832 + class115.field2583 - class45.field975;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field1839 + class115.field2583 - class45.field975;
                    if (var6 > class115.field2583 + class115.field2583) {
                        var6 = class115.field2583 + class115.field2583;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class101.field2219[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class4.field78 - var3.field1842;
                        if (var8 > 32) {
                            var3.field1844 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field1844 = 2;
                            var8 = -var8;
                        }
                        var3.field1852 = (var3.field1846 - class29.field590 << 8) / var8;
                        var3.field1834 = (var3.field1845 - class29.field590 << 8) / var8;
                        var3.field1840 = (var3.field1836 - class2.field22 << 8) / var8;
                        var3.field1847 = (var3.field1828 - class2.field22 << 8) / var8;
                        class39.field855[class196.field3898++] = var3;
                    }
                }
            } else if (var3.field1841 == 2) {
                int var9 = var3.field1832 + class115.field2583 - class45.field975;
                if (var9 >= 0 && var9 <= class115.field2583 + class115.field2583) {
                    int var10 = var3.field1835 + class115.field2583 - class92.field2045;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field1850 + class115.field2583 - class92.field2045;
                    if (var11 > class115.field2583 + class115.field2583) {
                        var11 = class115.field2583 + class115.field2583;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class101.field2219[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class29.field590 - var3.field1846;
                        if (var13 > 32) {
                            var3.field1844 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field1844 = 4;
                            var13 = -var13;
                        }
                        var3.field1831 = (var3.field1842 - class4.field78 << 8) / var13;
                        var3.field1833 = (var3.field1829 - class4.field78 << 8) / var13;
                        var3.field1840 = (var3.field1836 - class2.field22 << 8) / var13;
                        var3.field1847 = (var3.field1828 - class2.field22 << 8) / var13;
                        class39.field855[class196.field3898++] = var3;
                    }
                }
            } else if (var3.field1841 == 4) {
                int var14 = var3.field1836 - class2.field22;
                if (var14 > 128) {
                    int var15 = var3.field1832 + class115.field2583 - class45.field975;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field1839 + class115.field2583 - class45.field975;
                    if (var16 > class115.field2583 + class115.field2583) {
                        var16 = class115.field2583 + class115.field2583;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field1835 + class115.field2583 - class92.field2045;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field1850 + class115.field2583 - class92.field2045;
                        if (var18 > class115.field2583 + class115.field2583) {
                            var18 = class115.field2583 + class115.field2583;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; var20++) {
                            for (int var21 = var15; var21 <= var16; var21++) {
                                if (class101.field2219[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field1844 = 5;
                            var3.field1831 = (var3.field1842 - class4.field78 << 8) / var14;
                            var3.field1833 = (var3.field1829 - class4.field78 << 8) / var14;
                            var3.field1852 = (var3.field1846 - class29.field590 << 8) / var14;
                            var3.field1834 = (var3.field1845 - class29.field590 << 8) / var14;
                            class39.field855[class196.field3898++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public final void method1017(int arg0) {
        field4055++;
        int var2 = 0;
        if (arg0 > -114) {
            method1344();
        }
        while (var2 < 10) {
            this.field4053[var2] = 0L;
            var2++;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lfd;I)Z")
    public static final boolean method1345(class55 arg0, int arg1) {
        field4049++;
        if (class207.field4117) {
            if (class59.method508(arg0, (byte) 32) != 0) {
                return false;
            }
            if (arg0.field1355 == 0) {
                return false;
            }
        }
        if (arg1 != 256) {
            method1340(126, null, -9, (byte) 25);
        }
        return arg0.field1336;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class203() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4053[var1] = this.field4043;
        }
    }
}
