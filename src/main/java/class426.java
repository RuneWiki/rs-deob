import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class426 extends class161 {

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public int field6284;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public int field6280;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "[I")
    public int[] field6277;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "[I")
    public int[] field6278;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "[[I")
    public int[][] field6285;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "[Z")
    public boolean[] field6287;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "[Z")
    public static boolean[] field6276 = new boolean[8];

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field6281 = 0;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Lvd;")
    public static class26 field6283;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([Lne;IIZII)V", line = 8)
    public static final void method2638(class172[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = 0;
        if (arg5 >= -86) {
            field6281 = 108;
        }
        while (arg0.length > var6) {
            class172 var7 = arg0[var6];
            if (var7 != null && var7.field2735 == arg2) {
                class35.method229(10, arg3, var7, arg4, arg1);
                client.method1147(arg4, false, var7, arg1);
                if ((var7.field2799 - var7.field2705) < var7.field2791) {
                    var7.field2791 = var7.field2799 - var7.field2705;
                }
                if (var7.field2696 > var7.field2830 - var7.field2834) {
                    var7.field2696 = var7.field2830 - var7.field2834;
                }
                if (var7.field2791 < 0) {
                    var7.field2791 = 0;
                }
                if (var7.field2696 < 0) {
                    var7.field2696 = 0;
                }
                if (var7.field2707 == 0) {
                    class68.method431(1099639664, var7, arg3);
                }
            }
            var6++;
        }
        field6292++;
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)Z", line = 55)
    public static final boolean method2639(int arg0) {
        field6289++;
        if (arg0 < 12) {
            return true;
        }
        class190 var1 = class312.field4907;
        synchronized (class312.field4907) {
            if (class271.field4346 == class203.field3260) {
                return false;
            } else {
                class444.field6479 = class121.field1712[class271.field4346];
                class140.field2180 = class143.field2257[class271.field4346];
                class271.field4346 = class271.field4346 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)I", line = 83)
    public static final int method2640(int arg0, int arg1, int arg2) {
        field6286++;
        int var3 = arg2 >>> 24;
        if (arg0 != 2) {
            method2638((class172[]) null, 60, -71, true, 90, 9);
        }
        int var4 = 255 - var3;
        int var5 = ((arg2 & 0xFF00) * var3 & 0xFF0000 | (arg2 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V", line = 101)
    public static final void method2641(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class145.field2283 != arg2 && arg0 != 0 && class297.field4719 < 50 && arg4 != -1) {
            class92.field1133[class297.field4719] = arg4;
            class136.field2137[class297.field4719] = arg0;
            class185.field3009[class297.field4719] = arg1;
            class444.field6480[class297.field4719] = null;
            class84.field1048[class297.field4719] = 0;
            class331.field5187[class297.field4719] = arg3;
            class297.field4719++;
        }
        field6290++;
    }

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(I)V", line = 127)
    public static final void method2642(int arg0) {
        field6279++;
        class158.field2514.method2223(8);
        int var1 = class158.field2514.method2225(70, arg0);
        if (var1 == 0) {
            return;
        }
        int var2 = class158.field2514.method2225(arg0 + 119, 2);
        if (var2 == 0) {
            class208.field3349[class21.field274++] = 2047;
        } else if (var2 == 1) {
            int var3 = class158.field2514.method2225(64, 3);
            class261.field4201.method909(var3, 1, 29);
            int var4 = class158.field2514.method2225(84, 1);
            if (var4 == 1) {
                class208.field3349[class21.field274++] = 2047;
            }
        } else if (var2 == 2) {
            if (class158.field2514.method2225(-51, 1) == 1) {
                int var6 = class158.field2514.method2225(-101, 3);
                class261.field4201.method909(var6, 2, 67);
                int var7 = class158.field2514.method2225(arg0 ^ 0x76, 3);
                class261.field4201.method909(var7, 2, 23);
            } else {
                int var5 = class158.field2514.method2225(-59, 3);
                class261.field4201.method909(var5, 0, arg0 + 121);
            }
            int var8 = class158.field2514.method2225(65, 1);
            if (var8 == 1) {
                class208.field3349[class21.field274++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class158.field2514.method2225(-80, 7);
            int var10 = class158.field2514.method2225(61, 1);
            int var11 = class158.field2514.method2225(83, 1);
            if (var11 == 1) {
                class208.field3349[class21.field274++] = 2047;
            }
            int var12 = class158.field2514.method2225(123, 7);
            class266.field4286 = class158.field2514.method2225(-72, 2);
            class261.field4201.method1569(var12, var10 == 1, 14160, var9, class266.field4286);
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(I[B)V", line = 209)
    public class426(int arg0, byte[] arg1) {
        this.field6284 = arg0;
        class186 var3 = new class186(arg1);
        this.field6280 = var3.method1322(false);
        this.field6277 = new int[this.field6280];
        this.field6278 = new int[this.field6280];
        this.field6285 = new int[this.field6280][];
        this.field6287 = new boolean[this.field6280];
        for (int var4 = 0; var4 < this.field6280; var4++) {
            this.field6278[var4] = var3.method1322(false);
        }
        for (int var5 = 0; var5 < this.field6280; var5++) {
            this.field6287[var5] = var3.method1322(false) == 1;
        }
        for (int var6 = 0; var6 < this.field6280; var6++) {
            this.field6277[var6] = var3.method1272((byte) -96);
        }
        for (int var7 = 0; var7 < this.field6280; var7++) {
            this.field6285[var7] = new int[var3.method1322(false)];
        }
        for (int var8 = 0; var8 < this.field6280; var8++) {
            for (int var9 = 0; var9 < this.field6285[var8].length; var9++) {
                this.field6285[var8][var9] = var3.method1322(false);
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V", line = 269)
    public static final void method2643(byte arg0) {
        class135.field2117 = null;
        class47.field585 = null;
        class314.field4936 = null;
        class272.field4377 = null;
        field6291++;
        if (arg0 <= 14) {
            method2642(120);
        }
        class172.field2804 = null;
        class262.field4202 = null;
        class281.field4509 = null;
        class189.field3096 = null;
        class369.field5616 = null;
        class12.field176 = null;
        class325.field5100 = null;
        class256.field4147 = null;
    }

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "(I)V", line = 293)
    public static void method2644(int arg0) {
        field6276 = null;
        field6283 = null;
        if (arg0 >= -121) {
            method2641(-54, -105, -47, -60, -123);
        }
    }
}
