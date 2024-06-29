import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class116 extends class256 {

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Z")
    public boolean field2219 = false;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Lri;")
    private class65 field2200;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Z")
    private boolean field2201;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "Z")
    private boolean field2218;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    private int field2209;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    private int field2206;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Ljd;")
    private static class86 field2208 = class122.method868("Sep", true);

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Ljd;")
    private static class86 field2205 = class122.method868("Oct", true);

    @OriginalMember(owner = "client!u", name = "L", descriptor = "Ljd;")
    private static class86 field2215 = class122.method868("Apr", true);

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Ljd;")
    public static class86 field2213 = class122.method868("http:)4)4", true);

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Z")
    public static boolean field2224 = true;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Ljd;")
    private static class86 field2223 = class122.method868("Mar", true);

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Ljd;")
    private static class86 field2210 = class122.method868("May", true);

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Ljd;")
    private static class86 field2214 = class122.method868("Jun", true);

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Ljd;")
    private static class86 field2212 = class122.method868("Nov", true);

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "Ljd;")
    private static class86 field2230 = class122.method868("Dec", true);

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "Ljd;")
    public static class86 field2231 = class122.method868("(U", true);

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Ljd;")
    private static class86 field2216 = class122.method868("Aug", true);

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field2217 = 0;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Ljd;")
    private static class86 field2225 = class122.method868("Feb", true);

    @OriginalMember(owner = "client!u", name = "X", descriptor = "Ljd;")
    private static class86 field2227 = class122.method868("Jul", true);

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "Ljd;")
    private static class86 field2229 = class122.method868("Jan", true);

    @OriginalMember(owner = "client!u", name = "A", descriptor = "[Ljd;")
    public static class86[] field2204 = new class86[] { field2229, field2225, field2223, field2215, field2210, field2214, field2227, field2216, field2208, field2205, field2212, field2230 };

    @OriginalMember(owner = "client!u", name = "S", descriptor = "F")
    private float field2222;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "[I")
    private int[] field2236;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "[[S")
    public static short[][] field2211;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "[[[B")
    public static byte[][][] field2207;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)V")
    public final void method816(byte arg0, int arg1) {
        field2226++;
        if (arg0 <= 40) {
            this.method822((byte) -22, false, (class28) null, (class151) null);
        }
        if (this.field2236 == null || this.field2206 == 0 && this.field2209 == 0) {
            return;
        }
        if (class114.field2190 == null || this.field2236.length > class114.field2190.length) {
            class114.field2190 = new int[this.field2236.length];
        }
        int var3 = this.field2236.length == 4096 ? 64 : 128;
        int var4 = this.field2209 * arg1;
        int var5 = this.field2236.length;
        int var6 = arg1 * var3 * this.field2206;
        int var7 = var3 - 1;
        int var8 = var5 - 1;
        for (int var9 = 0; var9 < var5; var9 += var3) {
            int var11 = var6 + var9 & var8;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var12 + var4 & var7) + var11;
                class114.field2190[var13] = this.field2236[var14];
            }
        }
        int[] var10 = this.field2236;
        this.field2236 = class114.field2190;
        class114.field2190 = var10;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLba;)V")
    public static final void method817(byte arg0, class162 arg1) {
        field2221++;
        if (arg0 != -125) {
            field2211 = null;
        }
        long var2 = 0L;
        int var4 = 0;
        int var5 = -1;
        if (arg1.field3052 == 0) {
            var2 = class5.method30(arg1.field3033, arg1.field3055, arg1.field3041);
        }
        int var6 = 0;
        if (arg1.field3052 == 1) {
            var2 = class139.method993(arg1.field3033, arg1.field3055, arg1.field3041);
        }
        if (arg1.field3052 == 2) {
            var2 = class215.method1525(arg1.field3033, arg1.field3055, arg1.field3041);
        }
        if (arg1.field3052 == 3) {
            var2 = class218.method1537(arg1.field3033, arg1.field3055, arg1.field3041);
        }
        if (var2 != 0L) {
            var6 = ((int) var2 & 0x7C6BC) >> 14;
            var4 = (int) var2 >> 20 & 0x3;
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg1.field3032 = var4;
        arg1.field3050 = var6;
        arg1.field3034 = var5;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Lh;")
    public static final class258 method818(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4433;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lbj;ILbe;)Z")
    public final boolean method819(class151 arg0, int arg1, class28 arg2) {
        field2232++;
        if (arg1 != 2) {
            field2215 = null;
        }
        return this.field2200.method464(arg2, (byte) -99, arg0);
    }

    @OriginalMember(owner = "client!u", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field2235++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lbj;ILbj;)V")
    public static final void method820(class151 arg0, int arg1, class151 arg2) {
        class255.field4535 = arg0;
        if (arg1 == 16752611) {
            field2233++;
            class115.field2195 = arg2;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lbe;Lbj;BZF)[I")
    public final int[] method821(class28 arg0, class151 arg1, byte arg2, boolean arg3, float arg4) {
        if (arg2 != 68) {
            method817((byte) 76, (class162) null);
        }
        field2220++;
        if (this.field2236 == null || this.field2222 != arg4) {
            if (!this.field2200.method464(arg0, (byte) -82, arg1)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field2236 = this.field2200.method460(var6, arg1, (double) arg4, arg0, (byte) 124, this.field2218, var6, true);
            this.field2222 = arg4;
            if (this.field2201) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var13 = var6 - 1;
                int var14 = var6 * var6;
                int var15 = var6;
                int var16 = var6;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var17; var34 >= 0; var34--) {
                        var15--;
                        int var35 = this.field2236[var15];
                        var8[var34] += class1.method5(var35, 16752611) >> 16;
                        var7[var34] += class1.method5(var35, 65433) >> 8;
                        var9[var34] += class1.method5(255, var35);
                    }
                    if (var15 == 0) {
                        var15 = var14;
                    }
                }
                int var19 = var14;
                for (int var20 = var13; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var21 += var7[var25];
                        var22 += var9[var25];
                        var23 += var8[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var17; var27 >= 0; var27--) {
                        var24--;
                        int var31 = var23 / 9;
                        var25--;
                        int var32 = var22 / 9;
                        int var33 = var21 / 9;
                        var19--;
                        var10[var19] = class49.method377(var32, class49.method377(var33 << 8, var31 << 16));
                        var23 += var8[var25] - var8[var24];
                        var21 += var7[var25] - var7[var24];
                        var22 += var9[var25] - var9[var24];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var28 = var17; var28 >= 0; var28--) {
                        var15--;
                        int var29 = this.field2236[var15];
                        var16--;
                        int var30 = this.field2236[var16];
                        var8[var28] += -class1.method5(255, var30 >> 16) + class1.method5(255, var29 >> 16);
                        var7[var28] += -(class1.method5(var30, 65382) >> 8) + (class1.method5(65391, var29) >> 8);
                        var9[var28] += class1.method5(255, var29) - class1.method5(255, var30);
                    }
                    if (var16 == 0) {
                        var16 = var14;
                    }
                    if (var15 == 0) {
                        var15 = var14;
                    }
                }
                this.field2236 = var10;
            }
        }
        return this.field2236;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BZLbe;Lbj;)[I")
    public final int[] method822(byte arg0, boolean arg1, class28 arg2, class151 arg3) {
        if (arg0 > -32) {
            this.field2209 = 115;
        }
        field2203++;
        if (this.field2200.method464(arg2, (byte) 121, arg3)) {
            int var5 = arg1 ? 64 : 128;
            return this.field2200.method460(var5, arg3, 1.0D, arg2, (byte) 100, this.field2218, var5, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lt;")
    public static final class191 method823(int arg0, int arg1) {
        field2228++;
        if (arg0 != 25147) {
            return null;
        }
        class191 var2 = (class191) class108.field2077.method395((long) arg1, (byte) 103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class109.field2082.method1084((byte) -121, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class191 var4 = new class191();
        class200 var5 = new class200(var3);
        var5.field3565 = var5.field3547.length - 2;
        int var6 = var5.method1410(-87);
        int var7 = var5.field3547.length - var6 - 2 - 12;
        var5.field3565 = var7;
        int var8 = var5.method1386(-4603);
        var4.field3388 = var5.method1410(-57);
        var4.field3386 = var5.method1410(arg0 - 25226);
        var4.field3378 = var5.method1410(arg0 - 25263);
        var4.field3377 = var5.method1410(arg0 ^ 0xFFFF9D8B);
        int var9 = var5.method1408((byte) -38);
        if (var9 > 0) {
            var4.field3382 = new class252[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1410(-68);
                class252 var12 = new class252(class156.method1139(var11, arg0 ^ 0xFFFF9DBF));
                var4.field3382[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1386(-4603);
                    int var14 = var5.method1386(-4603);
                    var12.method1699(-28407, new class2(var14), (long) var13);
                }
            }
        }
        var5.field3565 = 0;
        var4.field3387 = var5.method1403((byte) 110);
        var4.field3385 = new int[var8];
        int var15 = 0;
        var4.field3381 = new class86[var8];
        var4.field3379 = new int[var8];
        while (var7 > var5.field3565) {
            int var16 = var5.method1410(arg0 - 25227);
            if (var16 == 3) {
                var4.field3381[var15] = var5.method1376((byte) 24);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3379[var15] = var5.method1408((byte) -116);
            } else {
                var4.field3379[var15] = var5.method1386(class177.method1249(arg0, -29634));
            }
            var4.field3385[var15++] = var16;
        }
        class108.field2077.method398((long) arg1, (byte) 116, var4);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
    public static void method824(int arg0) {
        field2216 = null;
        field2207 = null;
        field2215 = null;
        field2212 = null;
        field2208 = null;
        field2204 = null;
        field2213 = null;
        field2205 = null;
        field2214 = null;
        field2225 = null;
        field2223 = null;
        if (arg0 != 3) {
            return;
        }
        field2230 = null;
        field2227 = null;
        field2211 = null;
        field2210 = null;
        field2229 = null;
        field2231 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lqk;)V")
    public class116(class200 arg0) {
        this.field2200 = new class65(arg0);
        this.field2201 = arg0.method1408((byte) -48) == 1;
        this.field2218 = arg0.method1408((byte) -39) == 1;
        arg0.method1408((byte) -110);
        arg0.method1408((byte) -39);
        int var2 = arg0.method1408((byte) -102) & 0x3;
        this.field2209 = arg0.method1412((byte) 120);
        this.field2206 = arg0.method1412((byte) 97);
        arg0.method1408((byte) -109);
        arg0.method1408((byte) -49);
    }
}
