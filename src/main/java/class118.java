import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class118 {

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Z")
    public boolean field2217 = false;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public int field2219 = -1;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
    private int[] field2214 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    public static int[] field2205 = new int[5];

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "[Lmb;")
    public static class119[] field2213 = new class119[0];

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2206 = 0;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[I")
    public static int[] field2209;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
    private int[] field2218;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[S")
    private short[] field2204;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[S")
    private short[] field2212;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[S")
    private short[] field2222;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "[S")
    private short[] field2225;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Z")
    public final boolean method938(byte arg0) {
        field2221++;
        if (this.field2218 == null) {
            return true;
        }
        if (arg0 < 102) {
            field2205 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2218.length; var3++) {
            if (!class197.field3520.method1321(0, (byte) 61, this.field2218[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z")
    public final boolean method939(int arg0) {
        if (arg0 != -28739) {
            field2224 = 45;
        }
        boolean var2 = true;
        field2216++;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2214[var3] != -1 && !class197.field3520.method1321(0, (byte) 61, this.field2214[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
    public static final void method940(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2211++;
        int var5 = 0;
        int var6 = -1;
        int var7 = -arg3;
        int var8 = arg3;
        int var9 = class15.method77(arg4 + arg3, class135.field2445, class73.field1309, -80);
        if (arg0 != -5056) {
            method947(-36);
        }
        int var10 = class15.method77(arg4 - arg3, class135.field2445, class73.field1309, arg0 ^ 0x13C6);
        class24.method170((byte) 33, var10, class6.field100[arg1], var9, arg2);
        while (var8 > var5) {
            var6 += 2;
            var7 += var6;
            if (var7 > 0) {
                var8--;
                int var11 = arg1 - var8;
                var7 -= var8 << 1;
                int var12 = arg1 + var8;
                if (var12 >= class4.field70 && class70.field1205 >= var11) {
                    int var13 = class15.method77(arg4 + var5, class135.field2445, class73.field1309, -116);
                    int var14 = class15.method77(arg4 - var5, class135.field2445, class73.field1309, -39);
                    if (var12 <= class70.field1205) {
                        class24.method170((byte) 33, var14, class6.field100[var12], var13, arg2);
                    }
                    if (class4.field70 <= var11) {
                        class24.method170((byte) 33, var14, class6.field100[var11], var13, arg2);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class4.field70 && class70.field1205 >= var15) {
                int var17 = class15.method77(arg4 + var8, class135.field2445, class73.field1309, -84);
                int var18 = class15.method77(arg4 - var8, class135.field2445, class73.field1309, arg0 ^ 0x1384);
                if (class70.field1205 >= var16) {
                    class24.method170((byte) 33, var18, class6.field100[var16], var17, arg2);
                }
                if (class4.field70 <= var15) {
                    class24.method170((byte) 33, var18, class6.field100[var15], var17, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILwe;)V")
    private final void method941(int arg0, int arg1, class75 arg2) {
        field2210++;
        if (arg0 == 1) {
            this.field2219 = arg2.method558(1);
        } else if (arg0 == 2) {
            int var4 = arg2.method558(1);
            this.field2218 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2218[var5] = arg2.method545((byte) 88);
            }
        } else if (arg0 == 3) {
            this.field2217 = true;
        } else if (arg0 == 40) {
            int var8 = arg2.method558(1);
            this.field2204 = new short[var8];
            this.field2225 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2204[var9] = (short) arg2.method545((byte) 41);
                this.field2225[var9] = (short) arg2.method545((byte) -98);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method558(1);
            this.field2212 = new short[var6];
            this.field2222 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2212[var7] = (short) arg2.method545((byte) -95);
                this.field2222[var7] = (short) arg2.method545((byte) 61);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2214[arg0 - 60] = arg2.method545((byte) -77);
        }
        if (arg1 >= -33) {
            this.method939(108);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Ldd;")
    public final class67 method942(byte arg0) {
        field2208++;
        if (this.field2218 == null) {
            return null;
        }
        class67[] var2 = new class67[this.field2218.length];
        for (int var3 = 0; var3 < this.field2218.length; var3++) {
            var2[var3] = class67.method464(class197.field3520, this.field2218[var3], 0);
        }
        class67 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class67(var2, var2.length);
        }
        if (this.field2204 != null) {
            for (int var5 = 0; var5 < this.field2204.length; var5++) {
                var4.method480(this.field2204[var5], this.field2225[var5]);
            }
        }
        if (arg0 != 29) {
            this.method941(-53, 100, (class75) null);
        }
        if (this.field2212 != null) {
            for (int var6 = 0; var6 < this.field2212.length; var6++) {
                var4.method477(this.field2212[var6], this.field2222[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLwe;)V")
    public final void method943(boolean arg0, class75 arg1) {
        field2226++;
        if (arg0) {
            this.method943(false, (class75) null);
        }
        while (true) {
            int var3 = arg1.method558(1);
            if (var3 == 0) {
                return;
            }
            this.method941(var3, -42, arg1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
    public static final void method944(byte arg0) {
        field2203++;
        class236.field4171.method83(25216);
        if (arg0 <= 71) {
            field2206 = 122;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lpi;I)V")
    public static final void method945(class181 arg0, int arg1) {
        if (arg1 == 16205) {
            class8.field123 = arg0;
            field2220++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)I")
    public static final int method946(int arg0, boolean arg1) {
        field2215++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg1) {
            field2202 = -26;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static final void method947(int arg0) {
        field2207++;
        for (int var1 = arg0; var1 < class273.field4775; var1++) {
            int var10002 = class60.field998[var1]--;
            if (class60.field998[var1] >= -10) {
                class44 var3 = class188.field3364[var1];
                if (var3 == null) {
                    var3 = class44.method295(class181.field3250, class54.field926[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class60.field998[var1] += var3.method298();
                    class188.field3364[var1] = var3;
                }
                if (class60.field998[var1] < 0) {
                    int var4;
                    if (class50.field863[var1] == 0) {
                        var4 = class38.field668;
                    } else {
                        int var5 = (class50.field863[var1] & 0xFF) * 128;
                        int var6 = class50.field863[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class277.field4824.field2585;
                        int var8 = class50.field863[var1] >> 8 & 0xFF;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var8 * 128 + 64 - class277.field4824.field2546;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class60.field998[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class135.field2452 / var5;
                    }
                    if (var4 > 0) {
                        class224 var11 = var3.method296().method1538(class89.field1696);
                        class110 var12 = class110.method895(var11, 100, var4);
                        var12.method884(class180.field3205[var1] - 1);
                        class236.field4116.method1710(var12);
                    }
                    class60.field998[var1] = -100;
                }
            } else {
                class273.field4775--;
                for (int var2 = var1; var2 < class273.field4775; var2++) {
                    class54.field926[var2] = class54.field926[var2 + 1];
                    class188.field3364[var2] = class188.field3364[var2 + 1];
                    class180.field3205[var2] = class180.field3205[var2 + 1];
                    class60.field998[var2] = class60.field998[var2 + 1];
                    class50.field863[var2] = class50.field863[var2 + 1];
                }
                var1--;
            }
        }
        if (class29.field572 && !class26.method184(arg0 + 117)) {
            if (class205.field3685 != 0 && class51.field890 != -1) {
                class108.method840(class51.field890, arg0 ^ 0x1, false, class205.field3685, 0, class130.field2390);
            }
            class29.field572 = false;
        } else if (class205.field3685 != 0 && class51.field890 != -1 && !class26.method184(80)) {
            class116.field2199++;
            class58.field967.method285((byte) -90, 5);
            class58.field967.method581(true, class51.field890);
            class51.field890 = -1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
    public static void method948(byte arg0) {
        field2205 = null;
        field2213 = null;
        field2209 = null;
        int var1 = -113 % ((-arg0 - 66) / 53);
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)Ldd;")
    public final class67 method949(byte arg0) {
        field2223++;
        class67[] var2 = new class67[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2214[var4] != -1) {
                var2[var3++] = class67.method464(class197.field3520, this.field2214[var4], 0);
            }
        }
        class67 var5 = new class67(var2, var3);
        if (this.field2204 != null) {
            for (int var6 = 0; var6 < this.field2204.length; var6++) {
                var5.method480(this.field2204[var6], this.field2225[var6]);
            }
        }
        if (this.field2212 != null) {
            for (int var7 = 0; var7 < this.field2212.length; var7++) {
                var5.method477(this.field2212[var7], this.field2222[var7]);
            }
        }
        if (arg0 > -47) {
            this.field2212 = null;
        }
        return var5;
    }
}
