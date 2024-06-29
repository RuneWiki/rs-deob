import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class326 extends class21 {

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    private int field4978 = 4;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    private int field4980 = 4;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    public static int field4988 = 0;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "[Lu;")
    public static class25[] field4990 = new class25[4];

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "Lh;")
    public static class107 field4986;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "Lbm;")
    public static class307 field4989;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "[[[Lmj;")
    public static class47[][][] field4975;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 6)
    public static final void method2255(int arg0) {
        class194.field3130 = null;
        field4987++;
        class327.method2261(-1, class134.field2257, 0, class158.field2580, 0, 0, class88.field1658, false, 0);
        if (arg0 == 3018 && class194.field3130 != null) {
            class203.method1360(class194.field3130, class327.field5004, 0, 0, class134.field2257, -1412584499, false, class1.field26.field1385, class15.field274, class88.field1658);
            class194.field3130 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)V", line = 27)
    public static final void method2256(boolean arg0) {
        field4976++;
        if (class104.field1803 == null) {
            return;
        }
        if (class196.field3152 < 10) {
            if (!class45.field937.method2049(class104.field1803.field5030, 4)) {
                class196.field3152 = class109.field1923.method2028(class104.field1803.field5030, true) / 10;
                return;
            }
            class116.method768(-5);
            class196.field3152 = 10;
        }
        if (class196.field3152 == 10) {
            class38.field734 = class104.field1803.field5023 >> 6 << 6;
            class163.field2629 = (class104.field1803.field5014 >> 6 << 6) + 64 - class38.field734;
            class17.field322 = class104.field1803.field5026 >> 6 << 6;
            class9.field199 = (class104.field1803.field5024 >> 6 << 6) + 64 - class17.field322;
            int[] var1 = class104.field1803.method2274((class66.field1265.field1872 >> 7) + class101.field1769, class289.field4438, class246.field3818 + (class66.field1265.field1869 >> 7), true);
            int var2 = -1;
            int var3 = -1;
            if (var1 != null) {
                var2 = var1[1] - class38.field734;
                var3 = class17.field322 + class9.field199 - var1[2] - 1;
            }
            if (var2 >= 0 && var2 < class163.field2629 && var3 >= 0 && var3 < class9.field199) {
                int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class318.field4808 = var4;
                class250.field3923 = var5;
            } else if (class201.field3200 == -1 || class223.field3524 == -1) {
                int[] var7 = class104.field1803.method2270(class104.field1803.field5018 >> 14 & 0x3FFF, class104.field1803.field5018 & 0x3FFF, (byte) 91);
                class250.field3923 = -var7[2] - (1 - class17.field322 - class9.field199);
                class318.field4808 = var7[1] - class38.field734;
            } else {
                int[] var6 = class104.field1803.method2270(class201.field3200, class223.field3524, (byte) 91);
                if (var6 != null) {
                    class250.field3923 = class9.field199 - (var6[2] + -class17.field322) - 1;
                    class318.field4808 = var6[1] - class38.field734;
                }
                class223.field3524 = -1;
                class201.field3200 = -1;
            }
            if (class104.field1803.field5013 == 37) {
                class244.field3799 = 3.0F;
                class248.field3867 = 3.0F;
            } else if (class104.field1803.field5013 == 50) {
                class244.field3799 = 4.0F;
                class248.field3867 = 4.0F;
            } else if (class104.field1803.field5013 == 75) {
                class244.field3799 = 6.0F;
                class248.field3867 = 6.0F;
            } else if (class104.field1803.field5013 == 100) {
                class244.field3799 = 8.0F;
                class248.field3867 = 8.0F;
            } else if (class104.field1803.field5013 == 200) {
                class244.field3799 = 16.0F;
                class248.field3867 = 16.0F;
            } else {
                class244.field3799 = 8.0F;
                class248.field3867 = 8.0F;
            }
            class264.method1760((byte) -12);
            int var8 = class163.field2629 >> 6;
            int var9 = class9.field199 >> 6;
            class94.field1686 = new int[class196.field3154 + 1];
            class169.field2704 = new byte[var8][var9][];
            class336.field5155 = new int[var8][var9][];
            class97.field1721 = new byte[var8][var9][];
            class51.field1021 = new byte[var8][var9][];
            class190.field3085 = new int[var8][var9][];
            class313.field4764 = new byte[var8][var9][];
            class103.field1781 = new byte[var8][var9][];
            int var10 = class187.field3030 >> 2 << 10;
            int var11 = class233.field3650 >> 1;
            class183.field2927 = new int[var8][var9][];
            class114.method737(19756, var10, var11);
            class196.field3152 = 20;
        } else if (class196.field3152 == 20) {
            class218.method1457((byte) 126, new class202(class45.field937.method2059(true, class104.field1803.field5030, "underlay")));
            class196.field3152 = 30;
            class37.method289(-943652756, true);
            class204.method1367(arg0);
        } else if (class196.field3152 == 30) {
            class341.method2366(new class202(class45.field937.method2059(!arg0, class104.field1803.field5030, "overlay")), 119);
            class196.field3152 = 40;
            class204.method1367(false);
        } else if (class196.field3152 == 40) {
            class291.method1958(new class202(class45.field937.method2059(!arg0, class104.field1803.field5030, "overlay2")), -3291);
            class196.field3152 = 50;
            class204.method1367(false);
        } else if (class196.field3152 == 50) {
            class166.method1059(-65, new class202(class45.field937.method2059(true, class104.field1803.field5030, "loc")));
            class196.field3152 = 60;
            class37.method289(-943652756, true);
            class204.method1367(false);
        } else if (class196.field3152 == 60) {
            if (class45.field937.method2034(class104.field1803.field5030 + "_labels", -116)) {
                if (!class45.field937.method2049(class104.field1803.field5030 + "_labels", 4)) {
                    return;
                }
                class222.field3517 = class146.method946(class104.field1803.field5030 + "_labels", class45.field937, true);
            } else {
                class222.field3517 = new class234(0);
            }
            class196.field3152 = 70;
            class204.method1367(arg0);
        } else if (class196.field3152 == 70) {
            class250.field3932 = new class257(11, true, class216.field3456);
            class196.field3152 = 73;
            class37.method289(-943652756, true);
            class204.method1367(false);
        } else if (class196.field3152 == 73) {
            class328.field5036 = new class257(12, true, class216.field3456);
            class196.field3152 = 76;
            class37.method289(-943652756, true);
            class204.method1367(false);
        } else if (class196.field3152 == 76) {
            class74.field1518 = new class257(14, true, class216.field3456);
            class196.field3152 = 79;
            class37.method289(-943652756, true);
            class204.method1367(false);
        } else if (class196.field3152 == 79) {
            class334.field5118 = new class257(17, true, class216.field3456);
            class196.field3152 = 82;
            class37.method289(-943652756, true);
            class204.method1367(arg0);
        } else if (class196.field3152 == 82) {
            class197.field3163 = new class257(19, true, class216.field3456);
            class196.field3152 = 85;
            class37.method289(-943652756, true);
            class204.method1367(false);
        } else if (class196.field3152 == 85) {
            class344.field5341 = new class257(22, true, class216.field3456);
            class196.field3152 = 88;
            class37.method289(-943652756, true);
            class204.method1367(false);
        } else if (class196.field3152 == 88) {
            class27.field527 = new class257(26, true, class216.field3456);
            class196.field3152 = 91;
            class37.method289(-943652756, true);
            class204.method1367(false);
        } else {
            if (arg0) {
                field4979 = 61;
            }
            class71.field1493 = new class257(30, true, class216.field3456);
            class196.field3152 = 100;
            class37.method289(-943652756, true);
            class204.method1367(false);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I", line = 274)
    public final int[] method177(int arg0, int arg1) {
        int var3 = 24 % ((33 - arg0) / 36);
        field4983++;
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int var5 = class147.field2421 / this.field4980;
            int var6 = class294.field4489 / this.field4978;
            int[] var8;
            if (var5 > 0) {
                int var7 = arg1 % var5;
                var8 = this.method171(0, -82, class147.field2421 * var7 / var5);
            } else {
                var8 = this.method171(0, -120, 0);
            }
            for (int var9 = 0; var9 < class294.field4489; var9++) {
                if (var6 > 0) {
                    int var10 = var9 % var6;
                    var4[var9] = var8[class294.field4489 * var10 / var6];
                } else {
                    var4[var9] = var8[0];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 325)
    public class326() {
        super(1, false);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)Lnf;", line = 329)
    public static final class59 method2257(int arg0, int arg1, int arg2) {
        class47 var3 = field4975[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class59 var4 = var3.field964;
            var3.field964 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IB)[[I", line = 345)
    public final int[][] method175(int arg0, byte arg1) {
        if (arg1 <= 16) {
            return (int[][]) ((int[][]) null);
        }
        field4984++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532) {
            int var4 = class294.field4489 / this.field4978;
            int var5 = class147.field2421 / this.field4980;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method173(0, 0, (byte) 114);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method173(0, class147.field2421 * var7 / var5, (byte) 86);
            }
            int[] var8 = var6[1];
            int[] var9 = var6[2];
            int[] var10 = var6[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var3[0];
            for (int var14 = 0; var14 < class294.field4489; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class294.field4489 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var13[var14] = var10[var16];
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILag;)V", line = 421)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            field4981 = 45;
        }
        field4977++;
        if (arg1 == 0) {
            this.field4978 = arg2.method1317((byte) -101);
        } else if (arg1 == 1) {
            this.field4980 = arg2.method1317((byte) -124);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V", line = 458)
    public static final void method2258(int arg0, boolean arg1) {
        class227.field3586.method1883(2047773287, arg0);
        if (arg1) {
            method2258(-116, false);
        }
        class216.field3453.method1883(2047773287, arg0);
        class114.field2026.method1883(2047773287, arg0);
        class293.field4478.method1883(2047773287, arg0);
        field4982++;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V", line = 472)
    public static void method2259(int arg0) {
        field4989 = null;
        field4986 = null;
        int var1 = 13 / ((-arg0 - 15) / 41);
        field4990 = null;
        field4975 = (class47[][][]) null;
    }
}
