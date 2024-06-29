import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class172 implements Runnable {

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "[Ltc;")
    public volatile class144[] field3038 = new class144[2];

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Z")
    public volatile boolean field3047 = false;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "Z")
    public volatile boolean field3052 = false;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "[Lce;")
    public static class126[] field3034 = new class126[100];

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[S")
    public static short[] field3042 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lce;")
    public static class126 field3037 = class206.method1445(-7923, " x ");

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field3045 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Lce;")
    public static class126 field3044 = class206.method1445(-7923, "Jeter");

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "Lvh;")
    public class147 field3051;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "[[S")
    public static short[][] field3049;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "[[[B")
    public static byte[][][] field3048;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method1248(int arg0, byte arg1) {
        field3033++;
        int var2 = -22 % ((arg1 + 80) / 42);
        return arg0 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 15)
    public static void method1249(int arg0) {
        field3042 = null;
        field3048 = (byte[][][]) null;
        field3044 = null;
        field3049 = (short[][]) null;
        if (arg0 == 4400) {
            field3037 = null;
            field3034 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "run", descriptor = "()V", line = 41)
    public final void run() {
        field3046++;
        this.field3052 = true;
        try {
            while (!this.field3047) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class144 var2 = this.field3038[var1];
                    if (var2 != null) {
                        var2.method1056((byte) -90);
                    }
                }
                class313.method2158(10L, true);
                class187.method1349((byte) 84, this.field3051, (Object) null);
            }
        } catch (Exception var7) {
            class54.method345((String) null, -109, var7);
        } finally {
            this.field3052 = false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BIIIIII)V", line = 78)
    public static final void method1250(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -47) {
            return;
        }
        field3041++;
        if (class321.field5489 <= arg3 && class52.field795 >= arg2 && class197.field3372 <= arg5 && class194.field3302 >= arg6) {
            if (arg4 == 1) {
                class95.method653(arg3, arg5, arg6, (byte) -94, arg1, arg2);
            } else {
                class203.method1432(arg2, arg5, arg6, arg4, arg1, arg3, true);
            }
        } else if (arg4 == 1) {
            class252.method1709(arg2, arg3, (byte) -106, arg5, arg6, arg1);
        } else {
            class32.method159(arg0 + 177, arg4, arg3, arg6, arg5, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 117)
    public static final void method1251(int arg0) {
        field3053++;
        class81.field1309.method1178(-114);
        if (arg0 < 75) {
            field3044 = (class126) null;
        }
        class160.field2889.method1178(-93);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Lqk;", line = 134)
    public static final class8 method1252(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        return var3 == null || var3.field52 == null ? null : var3.field52;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZLfh;)V", line = 157)
    public static final void method1253(int arg0, boolean arg1, class282 arg2) {
        field3050++;
        Object[] var3 = arg2.field4699;
        int var4 = (Integer) var3[0];
        class267 var5 = class40.method254(var4, (byte) 118);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        class11.field146 = 0;
        int[] var9 = var5.field4521;
        int[] var10 = var5.field4527;
        byte var11 = -1;
        try {
            if (!arg1) {
                method1248(-70, (byte) 26);
            }
            class70.field1156 = new class126[var5.field4520];
            class264.field4398 = new int[var5.field4524];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field4685;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field4696;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field4697 == null ? -1 : arg2.field4697.field1833;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field4686;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field4697 == null ? -1 : arg2.field4697.field1875;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field4689 == null ? -1 : arg2.field4689.field1833;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field4689 == null ? -1 : arg2.field4689.field1875;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field4694;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field4687;
                    }
                    class264.field4398[var12++] = var16;
                } else if (var3[var14] instanceof class126) {
                    class126 var15 = (class126) var3[var14];
                    if (var15.method872(class97.field1565, 0)) {
                        var15 = arg2.field4688;
                    }
                    class70.field1156[var13++] = var15;
                }
            }
            int var17 = 0;
            label4301: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var514 = var9[var8];
                if (var514 < 100) {
                    if (var514 == 0) {
                        class151.field2765[var7++] = var10[var8];
                        continue;
                    }
                    if (var514 == 1) {
                        int var18 = var10[var8];
                        class151.field2765[var7++] = class138.field2462[var18];
                        continue;
                    }
                    if (var514 == 2) {
                        int var19 = var10[var8];
                        var7--;
                        class287.method1910(var19, -9554, class151.field2765[var7]);
                        continue;
                    }
                    if (var514 == 3) {
                        class220.field3701[var6++] = var5.field4525[var8];
                        continue;
                    }
                    if (var514 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var514 == 7) {
                        var7 -= 2;
                        if (class151.field2765[var7 + 1] != class151.field2765[var7]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var514 == 8) {
                        var7 -= 2;
                        if (class151.field2765[var7 + 1] == class151.field2765[var7]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var514 == 9) {
                        var7 -= 2;
                        if (class151.field2765[var7] < class151.field2765[var7 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var514 == 10) {
                        var7 -= 2;
                        if (class151.field2765[var7 + 1] < class151.field2765[var7]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var514 == 21) {
                        if (class11.field146 == 0) {
                            return;
                        }
                        class183 var20 = class14.field192[--class11.field146];
                        class264.field4398 = var20.field3186;
                        var5 = var20.field3185;
                        var9 = var5.field4521;
                        class70.field1156 = var20.field3187;
                        var10 = var5.field4527;
                        var8 = var20.field3190;
                        continue;
                    }
                    if (var514 == 25) {
                        int var21 = var10[var8];
                        class151.field2765[var7++] = class64.method468((byte) -47, var21);
                        continue;
                    }
                    if (var514 == 27) {
                        int var22 = var10[var8];
                        var7--;
                        class322.method2235(class151.field2765[var7], -26374, var22);
                        continue;
                    }
                    if (var514 == 31) {
                        var7 -= 2;
                        if (class151.field2765[var7 + 1] >= class151.field2765[var7]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var514 == 32) {
                        var7 -= 2;
                        if (class151.field2765[var7] >= class151.field2765[var7 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var514 == 33) {
                        class151.field2765[var7++] = class264.field4398[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var514 == 34) {
                        var10001 = var10[var8];
                        var7--;
                        class264.field4398[var10001] = class151.field2765[var7];
                        continue;
                    }
                    if (var514 == 35) {
                        class220.field3701[var6++] = class70.field1156[var10[var8]];
                        continue;
                    }
                    if (var514 == 36) {
                        var10001 = var10[var8];
                        var6--;
                        class70.field1156[var10001] = class220.field3701[var6];
                        continue;
                    }
                    if (var514 == 37) {
                        int var23 = var10[var8];
                        var6 -= var23;
                        class126 var24 = class153.method1137((byte) -73, var23, var6, class220.field3701);
                        class220.field3701[var6++] = var24;
                        continue;
                    }
                    if (var514 == 38) {
                        var7--;
                        continue;
                    }
                    if (var514 == 39) {
                        var6--;
                        continue;
                    }
                    if (var514 == 40) {
                        int var25 = var10[var8];
                        class267 var26 = class40.method254(var25, (byte) 115);
                        int[] var27 = new int[var26.field4524];
                        class126[] var28 = new class126[var26.field4520];
                        for (int var29 = 0; var29 < var26.field4532; var29++) {
                            var27[var29] = class151.field2765[var7 + var29 - var26.field4532];
                        }
                        for (int var30 = 0; var30 < var26.field4528; var30++) {
                            var28[var30] = class220.field3701[var6 + var30 - var26.field4528];
                        }
                        var7 -= var26.field4532;
                        var6 -= var26.field4528;
                        class183 var31 = new class183();
                        var31.field3185 = var5;
                        var31.field3187 = class70.field1156;
                        var31.field3186 = class264.field4398;
                        var31.field3190 = var8;
                        if (class11.field146 >= class14.field192.length) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        var8 = -1;
                        class14.field192[class11.field146++] = var31;
                        var10 = var26.field4527;
                        class264.field4398 = var27;
                        var9 = var26.field4521;
                        class70.field1156 = var28;
                        continue;
                    }
                    if (var514 == 42) {
                        class151.field2765[var7++] = class116.field1959[var10[var8]];
                        continue;
                    }
                    if (var514 == 43) {
                        int var32 = var10[var8];
                        var7--;
                        class116.field1959[var32] = class151.field2765[var7];
                        class98.method667(var32, -1);
                        continue;
                    }
                    if (var514 == 44) {
                        int var33 = var10[var8] >> 16;
                        var7--;
                        int var34 = class151.field2765[var7];
                        int var35 = var10[var8] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class219.field3679[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var34 <= var37) {
                                    continue label4301;
                                }
                                class111.field1733[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 45) {
                        int var38 = var10[var8];
                        var7--;
                        int var39 = class151.field2765[var7];
                        if (var39 >= 0 && var39 < class219.field3679[var38]) {
                            class151.field2765[var7++] = class111.field1733[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 46) {
                        int var40 = var10[var8];
                        var7 -= 2;
                        int var41 = class151.field2765[var7];
                        if (var41 >= 0 && var41 < class219.field3679[var40]) {
                            class111.field1733[var40][var41] = class151.field2765[var7 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 47) {
                        class126 var42 = class35.field512[var10[var8]];
                        if (var42 == null) {
                            var42 = class214.field3643;
                        }
                        class220.field3701[var6++] = var42;
                        continue;
                    }
                    if (var514 == 48) {
                        int var43 = var10[var8];
                        var6--;
                        class35.field512[var43] = class220.field3701[var6];
                        class303.method2031(var43, 2);
                        continue;
                    }
                    if (var514 == 51) {
                        class237 var44 = var5.field4531[var10[var8]];
                        var7--;
                        class27 var45 = (class27) var44.method1631(false, (long) class151.field2765[var7]);
                        if (var45 != null) {
                            var8 += var45.field383;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var514 < 300) {
                    if (var514 == 100) {
                        var7 -= 3;
                        int var47 = class151.field2765[var7];
                        int var48 = class151.field2765[var7 + 1];
                        int var49 = class151.field2765[var7 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class112 var50 = class252.method1706(5157, var47);
                        if (var50.field1810 == null) {
                            var50.field1810 = new class112[var49 + 1];
                        }
                        if (var49 >= var50.field1810.length) {
                            class112[] var51 = new class112[var49 + 1];
                            for (int var52 = 0; var52 < var50.field1810.length; var52++) {
                                var51[var52] = var50.field1810[var52];
                            }
                            var50.field1810 = var51;
                        }
                        if (var49 > 0 && var50.field1810[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class112 var53 = new class112();
                        var53.field1780 = var48;
                        var53.field1916 = true;
                        var53.field1865 = var53.field1833 = var50.field1833;
                        var53.field1875 = var49;
                        var50.field1810[var49] = var53;
                        if (var46) {
                            class82.field1326 = var53;
                        } else {
                            class243.field4120 = var53;
                        }
                        class23.method114(var50, (byte) 94);
                        continue;
                    }
                    if (var514 == 101) {
                        class112 var54 = var46 ? class82.field1326 : class243.field4120;
                        if (var54.field1875 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class112 var55 = class252.method1706(5157, var54.field1833);
                        var55.field1810[var54.field1875] = null;
                        class23.method114(var55, (byte) 94);
                        continue;
                    }
                    if (var514 == 102) {
                        var7--;
                        class112 var56 = class252.method1706(5157, class151.field2765[var7]);
                        var56.field1810 = null;
                        class23.method114(var56, (byte) 94);
                        continue;
                    }
                    if (var514 == 200) {
                        var7 -= 2;
                        int var57 = class151.field2765[var7];
                        int var58 = class151.field2765[var7 + 1];
                        class112 var59 = class53.method337((byte) -127, var57, var58);
                        if (var59 != null && var58 != -1) {
                            class151.field2765[var7++] = 1;
                            if (var46) {
                                class82.field1326 = var59;
                            } else {
                                class243.field4120 = var59;
                            }
                            continue;
                        }
                        class151.field2765[var7++] = 0;
                        continue;
                    }
                    if (var514 == 201) {
                        var7--;
                        int var60 = class151.field2765[var7];
                        class112 var61 = class252.method1706(5157, var60);
                        if (var61 == null) {
                            class151.field2765[var7++] = 0;
                        } else {
                            class151.field2765[var7++] = 1;
                            if (var46) {
                                class82.field1326 = var61;
                            } else {
                                class243.field4120 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var514 < 500) {
                    if (var514 == 403) {
                        var7 -= 2;
                        int var62 = class151.field2765[var7];
                        int var63 = class151.field2765[var7 + 1];
                        if (var62 >= 7) {
                            var62 -= 7;
                        }
                        class286.field4744.field5004.method1663(var63, -1, var62);
                        continue;
                    }
                    if (var514 == 404) {
                        var7 -= 2;
                        int var64 = class151.field2765[var7];
                        int var65 = class151.field2765[var7 + 1];
                        class286.field4744.field5004.method1654(var64, (byte) -52, var65);
                        continue;
                    }
                    if (var514 == 410) {
                        var7--;
                        boolean var66 = class151.field2765[var7] != 0;
                        class286.field4744.field5004.method1664(var66, 15);
                        continue;
                    }
                } else if (!(var514 < 1000 || var514 >= 1100) || !(var514 < 2000 || var514 >= 2100)) {
                    class112 var67;
                    if (var514 < 2000) {
                        var67 = var46 ? class82.field1326 : class243.field4120;
                    } else {
                        var514 -= 1000;
                        var7--;
                        var67 = class252.method1706(5157, class151.field2765[var7]);
                    }
                    if (var514 == 1000) {
                        var7 -= 4;
                        var67.field1769 = class151.field2765[var7];
                        var67.field1830 = class151.field2765[var7 + 1];
                        int var68 = class151.field2765[var7 + 2];
                        int var69 = class151.field2765[var7 + 3];
                        if (var68 < 0) {
                            var68 = 0;
                        } else if (var68 > 5) {
                            var68 = 5;
                        }
                        var67.field1834 = (byte) var68;
                        if (var69 < 0) {
                            var69 = 0;
                        } else if (var69 > 5) {
                            var69 = 5;
                        }
                        var67.field1811 = (byte) var69;
                        class23.method114(var67, (byte) 94);
                        class143.method1041(var67, 78);
                        if (var67.field1875 == -1) {
                            class32.method173((byte) -31, var67.field1833);
                        }
                        continue;
                    }
                    if (var514 == 1001) {
                        var7 -= 4;
                        var67.field1831 = class151.field2765[var7];
                        var67.field1850 = class151.field2765[var7 + 1];
                        var67.field1897 = 0;
                        var67.field1806 = 0;
                        int var70 = class151.field2765[var7 + 2];
                        int var71 = class151.field2765[var7 + 3];
                        if (var71 < 0) {
                            var71 = 0;
                        } else if (var71 > 4) {
                            var71 = 4;
                        }
                        if (var70 < 0) {
                            var70 = 0;
                        } else if (var70 > 4) {
                            var70 = 4;
                        }
                        var67.field1819 = (byte) var71;
                        var67.field1781 = (byte) var70;
                        class23.method114(var67, (byte) 94);
                        class143.method1041(var67, 85);
                        if (var67.field1780 == 0) {
                            class304.method2039(false, (byte) 67, var67);
                        }
                        continue;
                    }
                    if (var514 == 1003) {
                        var7--;
                        boolean var72 = class151.field2765[var7] == 1;
                        if (var72 != var67.field1776) {
                            var67.field1776 = var72;
                            class23.method114(var67, (byte) 94);
                        }
                        if (var67.field1875 == -1) {
                            class88.method620(var67.field1833, (byte) -110);
                        }
                        continue;
                    }
                    if (var514 == 1004) {
                        var7 -= 2;
                        var67.field1868 = class151.field2765[var7];
                        var67.field1809 = class151.field2765[var7 + 1];
                        class23.method114(var67, (byte) 94);
                        class143.method1041(var67, 110);
                        if (var67.field1780 == 0) {
                            class304.method2039(false, (byte) 75, var67);
                        }
                        continue;
                    }
                    if (var514 == 1005) {
                        var7--;
                        var67.field1892 = class151.field2765[var7] == 1;
                        continue;
                    }
                } else if (var514 >= 1100 && var514 < 1200 || var514 >= 2100 && var514 < 2200) {
                    class112 var505;
                    if (var514 >= 2000) {
                        var514 -= 1000;
                        var7--;
                        var505 = class252.method1706(5157, class151.field2765[var7]);
                    } else {
                        var505 = var46 ? class82.field1326 : class243.field4120;
                    }
                    if (var514 == 1100) {
                        var7 -= 2;
                        var505.field1880 = class151.field2765[var7];
                        if (var505.field1814 - var505.field1766 < var505.field1880) {
                            var505.field1880 = var505.field1814 - var505.field1766;
                        }
                        if (var505.field1880 < 0) {
                            var505.field1880 = 0;
                        }
                        var505.field1827 = class151.field2765[var7 + 1];
                        if (var505.field1827 > (var505.field1791 - var505.field1753)) {
                            var505.field1827 = var505.field1791 - var505.field1753;
                        }
                        if (var505.field1827 < 0) {
                            var505.field1827 = 0;
                        }
                        class23.method114(var505, (byte) 94);
                        if (var505.field1875 == -1) {
                            class138.method1010(-65, var505.field1833);
                        }
                        continue;
                    }
                    if (var514 == 1101) {
                        var7--;
                        var505.field1877 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        if (var505.field1875 == -1) {
                            class53.method335(var505.field1833, -60);
                        }
                        continue;
                    }
                    if (var514 == 1102) {
                        var7--;
                        var505.field1854 = class151.field2765[var7] == 1;
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1103) {
                        var7--;
                        var505.field1884 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1104) {
                        var7--;
                        var505.field1860 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1105) {
                        var7--;
                        var505.field1795 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1106) {
                        var7--;
                        var505.field1862 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1107) {
                        var7--;
                        var505.field1906 = class151.field2765[var7] == 1;
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1108) {
                        var505.field1800 = 1;
                        var7--;
                        var505.field1774 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        if (var505.field1875 == -1) {
                            class173.method1257(var505.field1833, (byte) 46);
                        }
                        continue;
                    }
                    if (var514 == 1109) {
                        var7 -= 6;
                        var505.field1902 = class151.field2765[var7];
                        var505.field1878 = class151.field2765[var7 + 1];
                        var505.field1843 = class151.field2765[var7 + 2];
                        var505.field1891 = class151.field2765[var7 + 3];
                        var505.field1794 = class151.field2765[var7 + 4];
                        var505.field1770 = class151.field2765[var7 + 5];
                        class23.method114(var505, (byte) 94);
                        if (var505.field1875 == -1) {
                            class169.method1235(var505.field1833, 126);
                            class253.method1714(var505.field1833, 26206);
                        }
                        continue;
                    }
                    if (var514 == 1110) {
                        var7--;
                        int var506 = class151.field2765[var7];
                        if (var505.field1824 != var506) {
                            var505.field1824 = var506;
                            var505.field1764 = 0;
                            var505.field1793 = 0;
                            class23.method114(var505, (byte) 94);
                        }
                        if (var505.field1875 == -1) {
                            class185.method1340(-118, var505.field1833);
                        }
                        continue;
                    }
                    if (var514 == 1111) {
                        var7--;
                        var505.field1883 = class151.field2765[var7] == 1;
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1112) {
                        var6--;
                        class126 var507 = class220.field3701[var6];
                        if (!var507.method872(var505.field1802, 0)) {
                            var505.field1802 = var507;
                            class23.method114(var505, (byte) 94);
                        }
                        if (var505.field1875 == -1) {
                            class68.method497(var505.field1833, 3);
                        }
                        continue;
                    }
                    if (var514 == 1113) {
                        var7--;
                        var505.field1913 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1114) {
                        var7 -= 3;
                        var505.field1851 = class151.field2765[var7];
                        var505.field1840 = class151.field2765[var7 + 1];
                        var505.field1905 = class151.field2765[var7 + 2];
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1115) {
                        var7--;
                        var505.field1821 = class151.field2765[var7] == 1;
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1116) {
                        var7--;
                        var505.field1759 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1117) {
                        var7--;
                        var505.field1907 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1118) {
                        var7--;
                        var505.field1903 = class151.field2765[var7] == 1;
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1119) {
                        var7--;
                        var505.field1895 = class151.field2765[var7] == 1;
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1120) {
                        var7 -= 2;
                        var505.field1814 = class151.field2765[var7];
                        var505.field1791 = class151.field2765[var7 + 1];
                        class23.method114(var505, (byte) 94);
                        if (var505.field1780 == 0) {
                            class304.method2039(false, (byte) 92, var505);
                        }
                        continue;
                    }
                    if (var514 == 1121) {
                        var7 -= 2;
                        var505.field1836 = (short) class151.field2765[var7];
                        var505.field1826 = (short) class151.field2765[var7 + 1];
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1122) {
                        var7--;
                        var505.field1844 = class151.field2765[var7] == 1;
                        class23.method114(var505, (byte) 94);
                        continue;
                    }
                    if (var514 == 1123) {
                        var7--;
                        var505.field1770 = class151.field2765[var7];
                        class23.method114(var505, (byte) 94);
                        if (var505.field1875 == -1) {
                            class169.method1235(var505.field1833, 101);
                        }
                        continue;
                    }
                } else if (var514 >= 1200 && var514 < 1300 || var514 >= 2200 && var514 < 2300) {
                    class112 var73;
                    if (var514 < 2000) {
                        var73 = var46 ? class82.field1326 : class243.field4120;
                    } else {
                        var514 -= 1000;
                        var7--;
                        var73 = class252.method1706(5157, class151.field2765[var7]);
                    }
                    class23.method114(var73, (byte) 94);
                    if (var514 == 1200 || var514 == 1205) {
                        var7 -= 2;
                        int var74 = class151.field2765[var7];
                        int var75 = class151.field2765[var7 + 1];
                        if (var73.field1875 == -1) {
                            class193.method1369(var73.field1833, 9);
                            class169.method1235(var73.field1833, 102);
                            class253.method1714(var73.field1833, 26206);
                        }
                        if (var74 == -1) {
                            var73.field1774 = -1;
                            var73.field1803 = -1;
                            var73.field1800 = 1;
                        } else {
                            var73.field1803 = var74;
                            var73.field1775 = var75;
                            class137 var76 = class68.method498(73, var74);
                            if (var514 == 1205) {
                                var73.field1920 = false;
                            } else {
                                var73.field1920 = true;
                            }
                            var73.field1770 = var76.field2423;
                            var73.field1794 = var76.field2401;
                            var73.field1891 = var76.field2420;
                            var73.field1902 = var76.field2398;
                            var73.field1878 = var76.field2421;
                            var73.field1843 = var76.field2365;
                            if (var73.field1806 > 0) {
                                var73.field1770 = var73.field1770 * 32 / var73.field1806;
                            } else if (var73.field1831 > 0) {
                                var73.field1770 = var73.field1770 * 32 / var73.field1831;
                            }
                        }
                        continue;
                    }
                    if (var514 == 1201) {
                        var73.field1800 = 2;
                        var7--;
                        var73.field1774 = class151.field2765[var7];
                        if (var73.field1875 == -1) {
                            class173.method1257(var73.field1833, (byte) 19);
                        }
                        continue;
                    }
                    if (var514 == 1202) {
                        var73.field1800 = 3;
                        var73.field1774 = class286.field4744.field5004.method1648((byte) -41);
                        if (var73.field1875 == -1) {
                            class173.method1257(var73.field1833, (byte) 39);
                        }
                        continue;
                    }
                    if (var514 == 1203) {
                        var73.field1800 = 6;
                        var7--;
                        var73.field1774 = class151.field2765[var7];
                        if (var73.field1875 == -1) {
                            class173.method1257(var73.field1833, (byte) 67);
                        }
                        continue;
                    }
                    if (var514 == 1204) {
                        var73.field1800 = 5;
                        var7--;
                        var73.field1774 = class151.field2765[var7];
                        if (var73.field1875 == -1) {
                            class173.method1257(var73.field1833, (byte) 107);
                        }
                        continue;
                    }
                } else if ((var514 < 1300 || var514 >= 1400) && (var514 < 2300 || var514 >= 2400)) {
                    if (var514 >= 1400 && var514 < 1500 || var514 >= 2400 && var514 < 2500) {
                        int[] var83 = null;
                        class112 var84;
                        if (var514 >= 2000) {
                            var514 -= 1000;
                            var7--;
                            var84 = class252.method1706(5157, class151.field2765[var7]);
                        } else {
                            var84 = var46 ? class82.field1326 : class243.field4120;
                        }
                        var6--;
                        class126 var85 = class220.field3701[var6];
                        if (var85.method878((byte) -50) > 0 && var85.method843(var85.method878((byte) 115) - 1, (byte) -90) == 89) {
                            var7--;
                            int var86 = class151.field2765[var7];
                            if (var86 > 0) {
                                var83 = new int[var86];
                                while (var86-- > 0) {
                                    var7--;
                                    var83[var86] = class151.field2765[var7];
                                }
                            }
                            var85 = var85.method859(var85.method878((byte) 111) - 1, 39, 0);
                        }
                        Object[] var87 = new Object[var85.method878((byte) -77) + 1];
                        for (int var88 = var87.length - 1; var88 >= 1; var88--) {
                            if (var85.method843(var88 - 1, (byte) -108) == 115) {
                                var6--;
                                var87[var88] = class220.field3701[var6];
                            } else {
                                var7--;
                                var87[var88] = Integer.valueOf(class151.field2765[var7]);
                            }
                        }
                        var7--;
                        int var89 = class151.field2765[var7];
                        if (var89 == -1) {
                            var87 = null;
                        } else {
                            var87[0] = Integer.valueOf(var89);
                        }
                        var84.field1857 = true;
                        if (var514 == 1400) {
                            var84.field1852 = var87;
                        } else if (var514 == 1401) {
                            var84.field1847 = var87;
                        } else if (var514 == 1402) {
                            var84.field1914 = var87;
                        } else if (var514 == 1403) {
                            var84.field1853 = var87;
                        } else if (var514 == 1404) {
                            var84.field1785 = var87;
                        } else if (var514 == 1405) {
                            var84.field1779 = var87;
                        } else if (var514 == 1406) {
                            var84.field1861 = var87;
                        } else if (var514 == 1407) {
                            var84.field1855 = var87;
                            var84.field1866 = var83;
                        } else if (var514 == 1408) {
                            var84.field1915 = var87;
                        } else if (var514 == 1409) {
                            var84.field1782 = var87;
                        } else if (var514 == 1410) {
                            var84.field1904 = var87;
                        } else if (var514 == 1411) {
                            var84.field1889 = var87;
                        } else if (var514 == 1412) {
                            var84.field1845 = var87;
                        } else if (var514 == 1414) {
                            var84.field1896 = var83;
                            var84.field1822 = var87;
                        } else if (var514 == 1415) {
                            var84.field1767 = var87;
                            var84.field1823 = var83;
                        } else if (var514 == 1416) {
                            var84.field1881 = var87;
                        } else if (var514 == 1417) {
                            var84.field1787 = var87;
                        } else if (var514 == 1418) {
                            var84.field1879 = var87;
                        } else if (var514 == 1419) {
                            var84.field1893 = var87;
                        } else if (var514 == 1420) {
                            var84.field1890 = var87;
                        } else if (var514 == 1421) {
                            var84.field1909 = var87;
                        } else if (var514 == 1422) {
                            var84.field1761 = var87;
                        } else if (var514 == 1423) {
                            var84.field1828 = var87;
                        } else if (var514 == 1424) {
                            var84.field1792 = var87;
                        } else if (var514 == 1425) {
                            var84.field1760 = var87;
                        } else if (var514 == 1426) {
                            var84.field1832 = var87;
                        } else if (var514 == 1427) {
                            var84.field1863 = var87;
                        } else if (var514 == 1428) {
                            var84.field1918 = var83;
                            var84.field1841 = var87;
                        } else if (var514 == 1429) {
                            var84.field1864 = var87;
                            var84.field1763 = var83;
                        }
                        continue;
                    }
                    if (var514 < 1600) {
                        class112 var90 = var46 ? class82.field1326 : class243.field4120;
                        if (var514 == 1500) {
                            class151.field2765[var7++] = var90.field1919;
                            continue;
                        }
                        if (var514 == 1501) {
                            class151.field2765[var7++] = var90.field1784;
                            continue;
                        }
                        if (var514 == 1502) {
                            class151.field2765[var7++] = var90.field1766;
                            continue;
                        }
                        if (var514 == 1503) {
                            class151.field2765[var7++] = var90.field1753;
                            continue;
                        }
                        if (var514 == 1504) {
                            class151.field2765[var7++] = var90.field1776 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 1505) {
                            class151.field2765[var7++] = var90.field1865;
                            continue;
                        }
                    } else if (var514 < 1700) {
                        class112 var504 = var46 ? class82.field1326 : class243.field4120;
                        if (var514 == 1600) {
                            class151.field2765[var7++] = var504.field1880;
                            continue;
                        }
                        if (var514 == 1601) {
                            class151.field2765[var7++] = var504.field1827;
                            continue;
                        }
                        if (var514 == 1602) {
                            class220.field3701[var6++] = var504.field1802;
                            continue;
                        }
                        if (var514 == 1603) {
                            class151.field2765[var7++] = var504.field1814;
                            continue;
                        }
                        if (var514 == 1604) {
                            class151.field2765[var7++] = var504.field1791;
                            continue;
                        }
                        if (var514 == 1605) {
                            class151.field2765[var7++] = var504.field1770;
                            continue;
                        }
                        if (var514 == 1606) {
                            class151.field2765[var7++] = var504.field1843;
                            continue;
                        }
                        if (var514 == 1607) {
                            class151.field2765[var7++] = var504.field1794;
                            continue;
                        }
                        if (var514 == 1608) {
                            class151.field2765[var7++] = var504.field1891;
                            continue;
                        }
                        if (var514 == 1609) {
                            class151.field2765[var7++] = var504.field1884;
                            continue;
                        }
                        if (var514 == 1610) {
                            class151.field2765[var7++] = var504.field1902;
                            continue;
                        }
                        if (var514 == 1611) {
                            class151.field2765[var7++] = var504.field1878;
                            continue;
                        }
                        if (var514 == 1612) {
                            class151.field2765[var7++] = var504.field1795;
                            continue;
                        }
                    } else if (var514 < 1800) {
                        class112 var91 = var46 ? class82.field1326 : class243.field4120;
                        if (var514 == 1700) {
                            class151.field2765[var7++] = var91.field1803;
                            continue;
                        }
                        if (var514 == 1701) {
                            if (var91.field1803 == -1) {
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var91.field1775;
                            }
                            continue;
                        }
                        if (var514 == 1702) {
                            class151.field2765[var7++] = var91.field1875;
                            continue;
                        }
                    } else if (var514 < 1900) {
                        class112 var502 = var46 ? class82.field1326 : class243.field4120;
                        if (var514 == 1800) {
                            class151.field2765[var7++] = class37.method203(client.method804(var502), -7622);
                            continue;
                        }
                        if (var514 == 1801) {
                            var7--;
                            int var503 = class151.field2765[var7];
                            int var516 = var503 - 1;
                            if (var502.field1922 != null && var502.field1922.length > var516 && var502.field1922[var516] != null) {
                                class220.field3701[var6++] = var502.field1922[var516];
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 1802) {
                            if (var502.field1894 == null) {
                                class220.field3701[var6++] = class122.field2050;
                            } else {
                                class220.field3701[var6++] = var502.field1894;
                            }
                            continue;
                        }
                    } else if (var514 < 2600) {
                        var7--;
                        class112 var92 = class252.method1706(5157, class151.field2765[var7]);
                        if (var514 == 2500) {
                            class151.field2765[var7++] = var92.field1919;
                            continue;
                        }
                        if (var514 == 2501) {
                            class151.field2765[var7++] = var92.field1784;
                            continue;
                        }
                        if (var514 == 2502) {
                            class151.field2765[var7++] = var92.field1766;
                            continue;
                        }
                        if (var514 == 2503) {
                            class151.field2765[var7++] = var92.field1753;
                            continue;
                        }
                        if (var514 == 2504) {
                            class151.field2765[var7++] = var92.field1776 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 2505) {
                            class151.field2765[var7++] = var92.field1865;
                            continue;
                        }
                    } else if (var514 < 2700) {
                        var7--;
                        class112 var501 = class252.method1706(5157, class151.field2765[var7]);
                        if (var514 == 2600) {
                            class151.field2765[var7++] = var501.field1880;
                            continue;
                        }
                        if (var514 == 2601) {
                            class151.field2765[var7++] = var501.field1827;
                            continue;
                        }
                        if (var514 == 2602) {
                            class220.field3701[var6++] = var501.field1802;
                            continue;
                        }
                        if (var514 == 2603) {
                            class151.field2765[var7++] = var501.field1814;
                            continue;
                        }
                        if (var514 == 2604) {
                            class151.field2765[var7++] = var501.field1791;
                            continue;
                        }
                        if (var514 == 2605) {
                            class151.field2765[var7++] = var501.field1770;
                            continue;
                        }
                        if (var514 == 2606) {
                            class151.field2765[var7++] = var501.field1843;
                            continue;
                        }
                        if (var514 == 2607) {
                            class151.field2765[var7++] = var501.field1794;
                            continue;
                        }
                        if (var514 == 2608) {
                            class151.field2765[var7++] = var501.field1891;
                            continue;
                        }
                        if (var514 == 2609) {
                            class151.field2765[var7++] = var501.field1884;
                            continue;
                        }
                        if (var514 == 2610) {
                            class151.field2765[var7++] = var501.field1902;
                            continue;
                        }
                        if (var514 == 2611) {
                            class151.field2765[var7++] = var501.field1878;
                            continue;
                        }
                        if (var514 == 2612) {
                            class151.field2765[var7++] = var501.field1795;
                            continue;
                        }
                    } else if (var514 < 2800) {
                        if (var514 == 2700) {
                            var7--;
                            class112 var491 = class252.method1706(5157, class151.field2765[var7]);
                            class151.field2765[var7++] = var491.field1803;
                            continue;
                        }
                        if (var514 != 2701) {
                            if (var514 == 2702) {
                                var7--;
                                int var493 = class151.field2765[var7];
                                class65 var494 = (class65) class16.field222.method1631(!arg1, (long) var493);
                                if (var494 == null) {
                                    class151.field2765[var7++] = 0;
                                } else {
                                    class151.field2765[var7++] = 1;
                                }
                                continue;
                            }
                            if (var514 == 2703) {
                                var7--;
                                class112 var495 = class252.method1706(5157, class151.field2765[var7]);
                                if (var495.field1810 == null) {
                                    class151.field2765[var7++] = 0;
                                    continue;
                                }
                                int var496 = var495.field1810.length;
                                for (int var497 = 0; var497 < var495.field1810.length; var497++) {
                                    if (var495.field1810[var497] == null) {
                                        var496 = var497;
                                        break;
                                    }
                                }
                                class151.field2765[var7++] = var496;
                                continue;
                            }
                            if (var514 != 2704 && var514 != 2705) {
                                throw new IllegalStateException();
                            }
                            var7 -= 2;
                            int var498 = class151.field2765[var7];
                            int var499 = class151.field2765[var7 + 1];
                            class65 var500 = (class65) class16.field222.method1631(false, (long) var498);
                            if (var500 != null && var500.field1097 == var499) {
                                class151.field2765[var7++] = 1;
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        var7--;
                        class112 var492 = class252.method1706(5157, class151.field2765[var7]);
                        if (var492.field1803 == -1) {
                            class151.field2765[var7++] = 0;
                        } else {
                            class151.field2765[var7++] = var492.field1775;
                        }
                        continue;
                    } else if (var514 < 2900) {
                        var7--;
                        class112 var489 = class252.method1706(5157, class151.field2765[var7]);
                        if (var514 == 2800) {
                            class151.field2765[var7++] = class37.method203(client.method804(var489), -7622);
                            continue;
                        }
                        if (var514 == 2801) {
                            var7--;
                            int var490 = class151.field2765[var7];
                            int var515 = var490 - 1;
                            if (var489.field1922 != null && var515 < var489.field1922.length && var489.field1922[var515] != null) {
                                class220.field3701[var6++] = var489.field1922[var515];
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 2802) {
                            if (var489.field1894 == null) {
                                class220.field3701[var6++] = class122.field2050;
                            } else {
                                class220.field3701[var6++] = var489.field1894;
                            }
                            continue;
                        }
                    } else if (var514 < 3200) {
                        if (var514 == 3100) {
                            var6--;
                            class126 var474 = class220.field3701[var6];
                            class73.method530(class122.field2050, (byte) 87, 0, var474);
                            continue;
                        }
                        if (var514 == 3101) {
                            var7 -= 2;
                            class150.method1118(-1, class151.field2765[var7 + 1], class286.field4744, class151.field2765[var7]);
                            continue;
                        }
                        if (var514 == 3103) {
                            class234.method1591(true);
                            continue;
                        }
                        if (var514 == 3104) {
                            class296.field4929++;
                            var6--;
                            class126 var475 = class220.field3701[var6];
                            int var476 = 0;
                            if (var475.method841(-22923)) {
                                var476 = var475.method836(31252);
                            }
                            class103.field1645.method1238(119, 116);
                            class103.field1645.method947(var476, (byte) 98);
                            continue;
                        }
                        if (var514 == 3105) {
                            class162.field2917++;
                            var6--;
                            class126 var477 = class220.field3701[var6];
                            class103.field1645.method1238(29, 125);
                            class103.field1645.method962(-122, var477.method845((byte) -125));
                            continue;
                        }
                        if (var514 == 3106) {
                            class224.field3773++;
                            var6--;
                            class126 var478 = class220.field3701[var6];
                            class103.field1645.method1238(108, 111);
                            class103.field1645.method933(-3, var478.method878((byte) -93) + 1);
                            class103.field1645.method980(var478, true);
                            continue;
                        }
                        if (var514 == 3107) {
                            var7--;
                            int var479 = class151.field2765[var7];
                            var6--;
                            class126 var480 = class220.field3701[var6];
                            class214.method1485((byte) -86, var480, var479);
                            continue;
                        }
                        if (var514 == 3108) {
                            var7 -= 3;
                            int var481 = class151.field2765[var7];
                            int var482 = class151.field2765[var7 + 2];
                            int var483 = class151.field2765[var7 + 1];
                            class112 var484 = class252.method1706(5157, var482);
                            class185.method1341(var481, -102, var484, var483);
                            continue;
                        }
                        if (var514 == 3109) {
                            var7 -= 2;
                            int var485 = class151.field2765[var7];
                            class112 var486 = var46 ? class82.field1326 : class243.field4120;
                            int var487 = class151.field2765[var7 + 1];
                            class185.method1341(var485, 11, var486, var487);
                            continue;
                        }
                        if (var514 == 3110) {
                            var7--;
                            int var488 = class151.field2765[var7];
                            class186.field3227++;
                            class103.field1645.method1238(183, 117);
                            class103.field1645.method959(-89, var488);
                            continue;
                        }
                    } else if (var514 < 3300) {
                        if (var514 == 3200) {
                            var7 -= 3;
                            class221.method1517(class151.field2765[var7 + 1], class151.field2765[var7], 566320496, class151.field2765[var7 + 2]);
                            continue;
                        }
                        if (var514 == 3201) {
                            var7--;
                            class69.method506(2, class151.field2765[var7]);
                            continue;
                        }
                        if (var514 == 3202) {
                            var7 -= 2;
                            class34.method190(class151.field2765[var7], class151.field2765[var7 + 1], 0);
                            continue;
                        }
                    } else if (var514 < 3400) {
                        if (var514 == 3300) {
                            class151.field2765[var7++] = class249.field4174;
                            continue;
                        }
                        if (var514 == 3301) {
                            var7 -= 2;
                            int var93 = class151.field2765[var7];
                            int var94 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class280.method1877((byte) 77, var94, var93);
                            continue;
                        }
                        if (var514 == 3302) {
                            var7 -= 2;
                            int var95 = class151.field2765[var7 + 1];
                            int var96 = class151.field2765[var7];
                            class151.field2765[var7++] = class217.method1492((byte) -81, var96, var95);
                            continue;
                        }
                        if (var514 == 3303) {
                            var7 -= 2;
                            int var97 = class151.field2765[var7];
                            int var98 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class313.method2186(var97, 1, var98);
                            continue;
                        }
                        if (var514 == 3304) {
                            var7--;
                            int var99 = class151.field2765[var7];
                            class151.field2765[var7++] = class118.method774(var99, -23393).field4823;
                            continue;
                        }
                        if (var514 == 3305) {
                            var7--;
                            int var100 = class151.field2765[var7];
                            class151.field2765[var7++] = class116.field1956[var100];
                            continue;
                        }
                        if (var514 == 3306) {
                            var7--;
                            int var101 = class151.field2765[var7];
                            class151.field2765[var7++] = class231.field3882[var101];
                            continue;
                        }
                        if (var514 == 3307) {
                            var7--;
                            int var102 = class151.field2765[var7];
                            class151.field2765[var7++] = class182.field3174[var102];
                            continue;
                        }
                        if (var514 == 3308) {
                            int var103 = class131.field2250;
                            int var104 = (class286.field4744.field2461 >> 7) + class58.field914;
                            int var105 = (class286.field4744.field2487 >> 7) + class138.field2473;
                            class151.field2765[var7++] = (var103 << 28) - (-(var104 << 14) - var105);
                            continue;
                        }
                        if (var514 == 3309) {
                            var7--;
                            int var106 = class151.field2765[var7];
                            class151.field2765[var7++] = class47.method289(268425736, var106) >> 14;
                            continue;
                        }
                        if (var514 == 3310) {
                            var7--;
                            int var107 = class151.field2765[var7];
                            class151.field2765[var7++] = var107 >> 28;
                            continue;
                        }
                        if (var514 == 3311) {
                            var7--;
                            int var108 = class151.field2765[var7];
                            class151.field2765[var7++] = class47.method289(var108, 16383);
                            continue;
                        }
                        if (var514 == 3312) {
                            class151.field2765[var7++] = class107.field1686 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3313) {
                            var7 -= 2;
                            int var109 = class151.field2765[var7 + 1];
                            int var110 = class151.field2765[var7] + 32768;
                            class151.field2765[var7++] = class280.method1877((byte) 77, var109, var110);
                            continue;
                        }
                        if (var514 == 3314) {
                            var7 -= 2;
                            int var111 = class151.field2765[var7 + 1];
                            int var112 = class151.field2765[var7] + 32768;
                            class151.field2765[var7++] = class217.method1492((byte) -85, var112, var111);
                            continue;
                        }
                        if (var514 == 3315) {
                            var7 -= 2;
                            int var113 = class151.field2765[var7] + 32768;
                            int var114 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class313.method2186(var113, 1, var114);
                            continue;
                        }
                        if (var514 == 3316) {
                            if (class73.field1172 >= 2) {
                                class151.field2765[var7++] = class73.field1172;
                            } else {
                                class151.field2765[var7++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 3317) {
                            class151.field2765[var7++] = class293.field4869;
                            continue;
                        }
                        if (var514 == 3318) {
                            class151.field2765[var7++] = class91.field1422;
                            continue;
                        }
                        if (var514 == 3321) {
                            class151.field2765[var7++] = class297.field4945;
                            continue;
                        }
                        if (var514 == 3322) {
                            class151.field2765[var7++] = class189.field3246;
                            continue;
                        }
                        if (var514 == 3323) {
                            if (class41.field669 >= 5 && class41.field669 <= 9) {
                                class151.field2765[var7++] = 1;
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        if (var514 == 3324) {
                            if (class41.field669 >= 5 && class41.field669 <= 9) {
                                class151.field2765[var7++] = class41.field669;
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        if (var514 == 3325) {
                            class151.field2765[var7++] = class4.field31 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3326) {
                            class151.field2765[var7++] = class286.field4744.field5020;
                            continue;
                        }
                        if (var514 == 3327) {
                            class151.field2765[var7++] = class286.field4744.field5004.field4060 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3328) {
                            class151.field2765[var7++] = class239.field4038 && !class162.field2920 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3329) {
                            class151.field2765[var7++] = class242.field4099 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3330) {
                            var7--;
                            int var115 = class151.field2765[var7];
                            class151.field2765[var7++] = class144.method1055(false, var115);
                            continue;
                        }
                        if (var514 == 3331) {
                            var7 -= 2;
                            int var116 = class151.field2765[var7 + 1];
                            int var117 = class151.field2765[var7];
                            class151.field2765[var7++] = class46.method288(false, var116, false, var117);
                            continue;
                        }
                        if (var514 == 3332) {
                            var7 -= 2;
                            int var118 = class151.field2765[var7 + 1];
                            int var119 = class151.field2765[var7];
                            class151.field2765[var7++] = class46.method288(false, var118, true, var119);
                            continue;
                        }
                        if (var514 == 3333) {
                            class151.field2765[var7++] = class132.field2270;
                            continue;
                        }
                        if (var514 == 3335) {
                            class151.field2765[var7++] = class226.field3813;
                            continue;
                        }
                        if (var514 == 3336) {
                            var7 -= 4;
                            int var120 = class151.field2765[var7];
                            int var121 = class151.field2765[var7 + 1];
                            int var122 = class151.field2765[var7 + 3];
                            int var123 = (var121 << 14) + var120;
                            int var124 = class151.field2765[var7 + 2];
                            int var125 = (var124 << 28) + var123;
                            int var126 = var122 + var125;
                            class151.field2765[var7++] = var126;
                            continue;
                        }
                        if (var514 == 3337) {
                            class151.field2765[var7++] = class126.field2121;
                            continue;
                        }
                    } else if (var514 < 3500) {
                        if (var514 == 3400) {
                            var7 -= 2;
                            int var457 = class151.field2765[var7];
                            int var458 = class151.field2765[var7 + 1];
                            class319 var459 = class305.method2049(var457, (byte) 117);
                            if (var459.field5476 != 115) {
                            }
                            class220.field3701[var6++] = var459.method2221(var458, 94);
                            continue;
                        }
                        if (var514 == 3408) {
                            var7 -= 4;
                            int var460 = class151.field2765[var7 + 1];
                            int var461 = class151.field2765[var7];
                            int var462 = class151.field2765[var7 + 3];
                            int var463 = class151.field2765[var7 + 2];
                            class319 var464 = class305.method2049(var463, (byte) 126);
                            if (var464.field5470 == var461 && var464.field5476 == var460) {
                                if (var460 == 115) {
                                    class220.field3701[var6++] = var464.method2221(var462, 121);
                                } else {
                                    class151.field2765[var7++] = var464.method2218((byte) 18, var462);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var514 == 3409) {
                            var7 -= 3;
                            int var465 = class151.field2765[var7];
                            int var466 = class151.field2765[var7 + 1];
                            int var467 = class151.field2765[var7 + 2];
                            if (var466 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class319 var468 = class305.method2049(var466, (byte) 110);
                            if (var468.field5476 != var465) {
                                throw new RuntimeException("C3409-1");
                            }
                            class151.field2765[var7++] = var468.method2217(var467, -1) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3410) {
                            var7--;
                            int var469 = class151.field2765[var7];
                            var6--;
                            class126 var470 = class220.field3701[var6];
                            if (var469 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class319 var471 = class305.method2049(var469, (byte) 108);
                            if (var471.field5476 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class151.field2765[var7++] = var471.method2220((byte) 41, var470) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3411) {
                            var7--;
                            int var472 = class151.field2765[var7];
                            class319 var473 = class305.method2049(var472, (byte) 114);
                            class151.field2765[var7++] = var473.field5462.method1635((byte) 55);
                            continue;
                        }
                    } else if (var514 < 3700) {
                        if (var514 == 3600) {
                            if (class20.field270 == 0) {
                                class151.field2765[var7++] = -2;
                            } else if (class20.field270 == 1) {
                                class151.field2765[var7++] = -1;
                            } else {
                                class151.field2765[var7++] = class14.field197;
                            }
                            continue;
                        }
                        if (var514 == 3601) {
                            var7--;
                            int var435 = class151.field2765[var7];
                            if (class20.field270 == 2 && class14.field197 > var435) {
                                class220.field3701[var6++] = class298.field4953[var435];
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 3602) {
                            var7--;
                            int var436 = class151.field2765[var7];
                            if (class20.field270 == 2 && var436 < class14.field197) {
                                class151.field2765[var7++] = class262.field4381[var436];
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        if (var514 == 3603) {
                            var7--;
                            int var437 = class151.field2765[var7];
                            if (class20.field270 == 2 && var437 < class14.field197) {
                                class151.field2765[var7++] = class200.field3404[var437];
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        if (var514 == 3604) {
                            var6--;
                            class126 var438 = class220.field3701[var6];
                            var7--;
                            int var439 = class151.field2765[var7];
                            class90.method628(120, var438, var439);
                            continue;
                        }
                        if (var514 == 3605) {
                            var6--;
                            class126 var440 = class220.field3701[var6];
                            class232.method1585(var440.method845((byte) -126), 0);
                            continue;
                        }
                        if (var514 == 3606) {
                            var6--;
                            class126 var441 = class220.field3701[var6];
                            class226.method1543(108, var441.method845((byte) -121));
                            continue;
                        }
                        if (var514 == 3607) {
                            var6--;
                            class126 var442 = class220.field3701[var6];
                            class59.method408(var442.method845((byte) -121), (byte) -51);
                            continue;
                        }
                        if (var514 == 3608) {
                            var6--;
                            class126 var443 = class220.field3701[var6];
                            class19.method103(-117, var443.method845((byte) -126));
                            continue;
                        }
                        if (var514 == 3609) {
                            var6--;
                            class126 var444 = class220.field3701[var6];
                            if (var444.method883(0, class127.field2186) || var444.method883(0, class280.field4661)) {
                                var444 = var444.method879(-14178, 7);
                            }
                            class151.field2765[var7++] = class9.method51(-25847, var444) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3610) {
                            var7--;
                            int var445 = class151.field2765[var7];
                            if (class20.field270 == 2 && var445 < class14.field197) {
                                class220.field3701[var6++] = class87.field1372[var445];
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 3611) {
                            if (class227.field3835 == null) {
                                class220.field3701[var6++] = class122.field2050;
                            } else {
                                class220.field3701[var6++] = class227.field3835.method869(124);
                            }
                            continue;
                        }
                        if (var514 == 3612) {
                            if (class227.field3835 == null) {
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = class78.field1276;
                            }
                            continue;
                        }
                        if (var514 == 3613) {
                            var7--;
                            int var446 = class151.field2765[var7];
                            if (class227.field3835 != null && class78.field1276 > var446) {
                                class220.field3701[var6++] = class159.field2865[var446].field1321.method869(11);
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 3614) {
                            var7--;
                            int var447 = class151.field2765[var7];
                            if (class227.field3835 != null && var447 < class78.field1276) {
                                class151.field2765[var7++] = class159.field2865[var447].field1317;
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        if (var514 == 3615) {
                            var7--;
                            int var448 = class151.field2765[var7];
                            if (class227.field3835 != null && var448 < class78.field1276) {
                                class151.field2765[var7++] = class159.field2865[var448].field1316;
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        if (var514 == 3616) {
                            class151.field2765[var7++] = class36.field539;
                            continue;
                        }
                        if (var514 == 3617) {
                            var6--;
                            class126 var449 = class220.field3701[var6];
                            class322.method2237(var449, (byte) 20);
                            continue;
                        }
                        if (var514 == 3618) {
                            class151.field2765[var7++] = class31.field437;
                            continue;
                        }
                        if (var514 == 3619) {
                            var6--;
                            class126 var450 = class220.field3701[var6];
                            class39.method245(-104, var450.method845((byte) -122));
                            continue;
                        }
                        if (var514 == 3620) {
                            class239.method1643(true);
                            continue;
                        }
                        if (var514 == 3621) {
                            if (class20.field270 == 0) {
                                class151.field2765[var7++] = -1;
                            } else {
                                class151.field2765[var7++] = class116.field1961;
                            }
                            continue;
                        }
                        if (var514 == 3622) {
                            var7--;
                            int var451 = class151.field2765[var7];
                            if (class20.field270 != 0 && class116.field1961 > var451) {
                                class220.field3701[var6++] = class250.method1696(false, class163.field2922[var451]).method869(127);
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 3623) {
                            var6--;
                            class126 var452 = class220.field3701[var6];
                            if (var452.method883(0, class127.field2186) || var452.method883(0, class280.field4661)) {
                                var452 = var452.method879(-14178, 7);
                            }
                            class151.field2765[var7++] = class69.method501((byte) 84, var452) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3624) {
                            var7--;
                            int var453 = class151.field2765[var7];
                            if (class159.field2865 != null && class78.field1276 > var453 && class159.field2865[var453].field1321.method881(class286.field4744.field5019, (byte) 92)) {
                                class151.field2765[var7++] = 1;
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        if (var514 == 3625) {
                            if (class36.field524 == null) {
                                class220.field3701[var6++] = class122.field2050;
                            } else {
                                class220.field3701[var6++] = class36.field524.method869(-34);
                            }
                            continue;
                        }
                        if (var514 == 3626) {
                            var7--;
                            int var454 = class151.field2765[var7];
                            if (class227.field3835 != null && var454 < class78.field1276) {
                                class220.field3701[var6++] = class159.field2865[var454].field1323;
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 3627) {
                            var7--;
                            int var455 = class151.field2765[var7];
                            if (class20.field270 == 2 && var455 >= 0 && var455 < class14.field197) {
                                class151.field2765[var7++] = class132.field2265[var455] ? 1 : 0;
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        if (var514 == 3628) {
                            var6--;
                            class126 var456 = class220.field3701[var6];
                            if (var456.method883(0, class127.field2186) || var456.method883(0, class280.field4661)) {
                                var456 = var456.method879(-14178, 7);
                            }
                            class151.field2765[var7++] = class41.method263(var456, (byte) 127);
                            continue;
                        }
                        if (var514 == 3629) {
                            class151.field2765[var7++] = class90.field1415;
                            continue;
                        }
                    } else if (var514 < 4000) {
                        if (var514 == 3903) {
                            var7--;
                            int var421 = class151.field2765[var7];
                            class151.field2765[var7++] = class173.field3056[var421].method789(8);
                            continue;
                        }
                        if (var514 == 3904) {
                            var7--;
                            int var422 = class151.field2765[var7];
                            class151.field2765[var7++] = class173.field3056[var422].field2015;
                            continue;
                        }
                        if (var514 == 3905) {
                            var7--;
                            int var423 = class151.field2765[var7];
                            class151.field2765[var7++] = class173.field3056[var423].field2017;
                            continue;
                        }
                        if (var514 == 3906) {
                            var7--;
                            int var424 = class151.field2765[var7];
                            class151.field2765[var7++] = class173.field3056[var424].field2011;
                            continue;
                        }
                        if (var514 == 3907) {
                            var7--;
                            int var425 = class151.field2765[var7];
                            class151.field2765[var7++] = class173.field3056[var425].field2021;
                            continue;
                        }
                        if (var514 == 3908) {
                            var7--;
                            int var426 = class151.field2765[var7];
                            class151.field2765[var7++] = class173.field3056[var426].field2014;
                            continue;
                        }
                        if (var514 == 3910) {
                            var7--;
                            int var427 = class151.field2765[var7];
                            int var428 = class173.field3056[var427].method788((byte) -66);
                            class151.field2765[var7++] = var428 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3911) {
                            var7--;
                            int var429 = class151.field2765[var7];
                            int var430 = class173.field3056[var429].method788((byte) -66);
                            class151.field2765[var7++] = var430 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3912) {
                            var7--;
                            int var431 = class151.field2765[var7];
                            int var432 = class173.field3056[var431].method788((byte) -66);
                            class151.field2765[var7++] = var432 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3913) {
                            var7--;
                            int var433 = class151.field2765[var7];
                            int var434 = class173.field3056[var433].method788((byte) -66);
                            class151.field2765[var7++] = var434 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var514 < 4100) {
                        if (var514 == 4000) {
                            var7 -= 2;
                            int var127 = class151.field2765[var7];
                            int var128 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = var127 + var128;
                            continue;
                        }
                        if (var514 == 4001) {
                            var7 -= 2;
                            int var129 = class151.field2765[var7];
                            int var130 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = var129 - var130;
                            continue;
                        }
                        if (var514 == 4002) {
                            var7 -= 2;
                            int var131 = class151.field2765[var7];
                            int var132 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = var131 * var132;
                            continue;
                        }
                        if (var514 == 4003) {
                            var7 -= 2;
                            int var133 = class151.field2765[var7];
                            int var134 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = var133 / var134;
                            continue;
                        }
                        if (var514 == 4004) {
                            var7--;
                            int var135 = class151.field2765[var7];
                            class151.field2765[var7++] = (int) ((double) var135 * Math.random());
                            continue;
                        }
                        if (var514 == 4005) {
                            var7--;
                            int var136 = class151.field2765[var7];
                            class151.field2765[var7++] = (int) (Math.random() * (double) (var136 + 1));
                            continue;
                        }
                        if (var514 == 4006) {
                            var7 -= 5;
                            int var137 = class151.field2765[var7];
                            int var138 = class151.field2765[var7 + 2];
                            int var139 = class151.field2765[var7 + 1];
                            int var140 = class151.field2765[var7 + 3];
                            int var141 = class151.field2765[var7 + 4];
                            class151.field2765[var7++] = var137 + ((var141 - var138) * (var139 - var137) / (var140 - var138));
                            continue;
                        }
                        if (var514 == 4007) {
                            var7 -= 2;
                            long var142 = (long) class151.field2765[var7 + 1];
                            long var144 = (long) class151.field2765[var7];
                            class151.field2765[var7++] = (int) (var142 * var144 / 100L + var144);
                            continue;
                        }
                        if (var514 == 4008) {
                            var7 -= 2;
                            int var146 = class151.field2765[var7 + 1];
                            int var147 = class151.field2765[var7];
                            class151.field2765[var7++] = class221.method1516(0x1 << var146, var147);
                            continue;
                        }
                        if (var514 == 4009) {
                            var7 -= 2;
                            int var148 = class151.field2765[var7];
                            int var149 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class47.method289(-(0x1 << var149) - 1, var148);
                            continue;
                        }
                        if (var514 == 4010) {
                            var7 -= 2;
                            int var150 = class151.field2765[var7];
                            int var151 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class47.method289(var150, 0x1 << var151) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var514 == 4011) {
                            var7 -= 2;
                            int var152 = class151.field2765[var7 + 1];
                            int var153 = class151.field2765[var7];
                            class151.field2765[var7++] = var153 % var152;
                            continue;
                        }
                        if (var514 == 4012) {
                            var7 -= 2;
                            int var154 = class151.field2765[var7];
                            int var155 = class151.field2765[var7 + 1];
                            if (var154 == 0) {
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = (int) Math.pow((double) var154, (double) var155);
                            }
                            continue;
                        }
                        if (var514 == 4013) {
                            var7 -= 2;
                            int var156 = class151.field2765[var7];
                            int var157 = class151.field2765[var7 + 1];
                            if (var156 == 0) {
                                class151.field2765[var7++] = 0;
                            } else if (var157 == 0) {
                                class151.field2765[var7++] = Integer.MAX_VALUE;
                            } else {
                                class151.field2765[var7++] = (int) Math.pow((double) var156, 1.0D / (double) var157);
                            }
                            continue;
                        }
                        if (var514 == 4014) {
                            var7 -= 2;
                            int var158 = class151.field2765[var7 + 1];
                            int var159 = class151.field2765[var7];
                            class151.field2765[var7++] = class47.method289(var158, var159);
                            continue;
                        }
                        if (var514 == 4015) {
                            var7 -= 2;
                            int var160 = class151.field2765[var7];
                            int var161 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class221.method1516(var160, var161);
                            continue;
                        }
                        if (var514 == 4016) {
                            var7 -= 2;
                            int var162 = class151.field2765[var7 + 1];
                            int var163 = class151.field2765[var7];
                            class151.field2765[var7++] = var162 <= var163 ? var162 : var163;
                            continue;
                        }
                        if (var514 == 4017) {
                            var7 -= 2;
                            int var164 = class151.field2765[var7];
                            int var165 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = var164 <= var165 ? var165 : var164;
                            continue;
                        }
                        if (var514 == 4018) {
                            var7 -= 3;
                            long var166 = (long) class151.field2765[var7];
                            long var168 = (long) class151.field2765[var7 + 2];
                            long var170 = (long) class151.field2765[var7 + 1];
                            class151.field2765[var7++] = (int) (var166 * var168 / var170);
                            continue;
                        }
                    } else if (var514 < 4200) {
                        if (var514 == 4100) {
                            var7--;
                            int var172 = class151.field2765[var7];
                            var6--;
                            class126 var173 = class220.field3701[var6];
                            class220.field3701[var6++] = class12.method69(new class126[] { var173, class195.method1386((byte) 20, var172) }, (byte) 115);
                            continue;
                        }
                        if (var514 == 4101) {
                            var6 -= 2;
                            class126 var174 = class220.field3701[var6];
                            class126 var175 = class220.field3701[var6 + 1];
                            class220.field3701[var6++] = class12.method69(new class126[] { var174, var175 }, (byte) 119);
                            continue;
                        }
                        if (var514 == 4102) {
                            var6--;
                            class126 var176 = class220.field3701[var6];
                            var7--;
                            int var177 = class151.field2765[var7];
                            class220.field3701[var6++] = class12.method69(new class126[] { var176, class280.method1874((byte) 43, var177, true) }, (byte) 127);
                            continue;
                        }
                        if (var514 == 4103) {
                            var6--;
                            class126 var178 = class220.field3701[var6];
                            class220.field3701[var6++] = var178.method838((byte) -97);
                            continue;
                        }
                        if (var514 == 4104) {
                            var7--;
                            int var179 = class151.field2765[var7];
                            long var180 = ((long) var179 + 11745L) * 86400000L;
                            class251.field4192.setTime(new Date(var180));
                            int var182 = class251.field4192.get(5);
                            int var183 = class251.field4192.get(2);
                            int var184 = class251.field4192.get(1);
                            class220.field3701[var6++] = class12.method69(new class126[] { class195.method1386((byte) 20, var182), class226.field3808, class219.field3681[var183], class226.field3808, class195.method1386((byte) 20, var184) }, (byte) 118);
                            continue;
                        }
                        if (var514 == 4105) {
                            var6 -= 2;
                            class126 var185 = class220.field3701[var6];
                            class126 var186 = class220.field3701[var6 + 1];
                            if (class286.field4744.field5004 != null && class286.field4744.field5004.field4060) {
                                class220.field3701[var6++] = var186;
                                continue;
                            }
                            class220.field3701[var6++] = var185;
                            continue;
                        }
                        if (var514 == 4106) {
                            var7--;
                            int var187 = class151.field2765[var7];
                            class220.field3701[var6++] = class195.method1386((byte) 20, var187);
                            continue;
                        }
                        if (var514 == 4107) {
                            var6 -= 2;
                            class151.field2765[var7++] = class220.field3701[var6].method865(48, class220.field3701[var6 + 1]);
                            continue;
                        }
                        if (var514 == 4108) {
                            var7 -= 2;
                            int var188 = class151.field2765[var7];
                            int var189 = class151.field2765[var7 + 1];
                            var6--;
                            class126 var190 = class220.field3701[var6];
                            class151.field2765[var7++] = class76.method550(var189, 123).method2133(var190, var188);
                            continue;
                        }
                        if (var514 == 4109) {
                            var7 -= 2;
                            var6--;
                            class126 var191 = class220.field3701[var6];
                            int var192 = class151.field2765[var7 + 1];
                            int var193 = class151.field2765[var7];
                            class151.field2765[var7++] = class76.method550(var192, 126).method2149(var191, var193);
                            continue;
                        }
                        if (var514 == 4110) {
                            var6 -= 2;
                            class126 var194 = class220.field3701[var6 + 1];
                            class126 var195 = class220.field3701[var6];
                            var7--;
                            if (class151.field2765[var7] == 1) {
                                class220.field3701[var6++] = var195;
                            } else {
                                class220.field3701[var6++] = var194;
                            }
                            continue;
                        }
                        if (var514 == 4111) {
                            var6--;
                            class126 var196 = class220.field3701[var6];
                            class220.field3701[var6++] = class312.method2150(var196);
                            continue;
                        }
                        if (var514 == 4112) {
                            var7--;
                            int var197 = class151.field2765[var7];
                            var6--;
                            class126 var198 = class220.field3701[var6];
                            if (var197 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class220.field3701[var6++] = var198.method852(var197, (byte) 99);
                            continue;
                        }
                        if (var514 == 4113) {
                            var7--;
                            int var199 = class151.field2765[var7];
                            class151.field2765[var7++] = class126.method854(false, var199) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4114) {
                            var7--;
                            int var200 = class151.field2765[var7];
                            class151.field2765[var7++] = class168.method1226(var200, -116) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4115) {
                            var7--;
                            int var201 = class151.field2765[var7];
                            class151.field2765[var7++] = class112.method742(var201, true) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4116) {
                            var7--;
                            int var202 = class151.field2765[var7];
                            class151.field2765[var7++] = class286.method1907(var202, (byte) 121) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4117) {
                            var6--;
                            class126 var203 = class220.field3701[var6];
                            if (var203 == null) {
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var203.method878((byte) -106);
                            }
                            continue;
                        }
                        if (var514 == 4118) {
                            var6--;
                            class126 var204 = class220.field3701[var6];
                            var7 -= 2;
                            int var205 = class151.field2765[var7];
                            int var206 = class151.field2765[var7 + 1];
                            class220.field3701[var6++] = var204.method859(var206, 15, var205);
                            continue;
                        }
                        if (var514 == 4119) {
                            var6--;
                            class126 var207 = class220.field3701[var6];
                            class126 var208 = class161.method1191(var207.method878((byte) -125), (byte) -127);
                            boolean var209 = false;
                            for (int var210 = 0; var207.method878((byte) 84) > var210; var210++) {
                                int var211 = var207.method843(var210, (byte) -123);
                                if (var211 == 60) {
                                    var209 = true;
                                } else if (var211 == 62) {
                                    var209 = false;
                                } else if (!var209) {
                                    var208.method867((byte) 124, var211);
                                }
                            }
                            var208.method850(false);
                            class220.field3701[var6++] = var208;
                            continue;
                        }
                        if (var514 == 4120) {
                            var7 -= 2;
                            var6--;
                            class126 var212 = class220.field3701[var6];
                            int var213 = class151.field2765[var7];
                            int var214 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = var212.method862(var213, -1, var214);
                            continue;
                        }
                        if (var514 == 4121) {
                            var6 -= 2;
                            class126 var215 = class220.field3701[var6 + 1];
                            var7--;
                            int var216 = class151.field2765[var7];
                            class126 var217 = class220.field3701[var6];
                            class151.field2765[var7++] = var217.method839(var215, (byte) -113, var216);
                            continue;
                        }
                        if (var514 == 4122) {
                            var7--;
                            int var218 = class151.field2765[var7];
                            class151.field2765[var7++] = class26.method125(14319, var218);
                            continue;
                        }
                        if (var514 == 4123) {
                            var7--;
                            int var219 = class151.field2765[var7];
                            class151.field2765[var7++] = class192.method1365(-36, var219);
                            continue;
                        }
                        if (var514 == 4124) {
                            var7--;
                            boolean var220 = class151.field2765[var7] != 0;
                            var7--;
                            int var221 = class151.field2765[var7];
                            class220.field3701[var6++] = class52.method328((byte) 27, class226.field3813, 0, (long) var221, var220);
                            continue;
                        }
                    } else if (var514 < 4300) {
                        if (var514 == 4200) {
                            var7--;
                            int var402 = class151.field2765[var7];
                            class220.field3701[var6++] = class68.method498(37, var402).field2396;
                            continue;
                        }
                        if (var514 == 4201) {
                            var7 -= 2;
                            int var403 = class151.field2765[var7];
                            int var404 = class151.field2765[var7 + 1];
                            class137 var405 = class68.method498(109, var403);
                            if (var404 >= 1 && var404 <= 5 && var405.field2430[var404 - 1] != null) {
                                class220.field3701[var6++] = var405.field2430[var404 - 1];
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 4202) {
                            var7 -= 2;
                            int var406 = class151.field2765[var7];
                            int var407 = class151.field2765[var7 + 1];
                            class137 var408 = class68.method498(109, var406);
                            if (var407 >= 1 && var407 <= 5 && var408.field2405[var407 - 1] != null) {
                                class220.field3701[var6++] = var408.field2405[var407 - 1];
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 4203) {
                            var7--;
                            int var409 = class151.field2765[var7];
                            class151.field2765[var7++] = class68.method498(43, var409).field2427;
                            continue;
                        }
                        if (var514 == 4204) {
                            var7--;
                            int var410 = class151.field2765[var7];
                            class151.field2765[var7++] = class68.method498(76, var410).field2407 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4205) {
                            var7--;
                            int var411 = class151.field2765[var7];
                            class137 var412 = class68.method498(27, var411);
                            if (var412.field2368 == -1 && var412.field2436 >= 0) {
                                class151.field2765[var7++] = var412.field2436;
                                continue;
                            }
                            class151.field2765[var7++] = var411;
                            continue;
                        }
                        if (var514 == 4206) {
                            var7--;
                            int var413 = class151.field2765[var7];
                            class137 var414 = class68.method498(107, var413);
                            if (var414.field2368 >= 0 && var414.field2436 >= 0) {
                                class151.field2765[var7++] = var414.field2436;
                                continue;
                            }
                            class151.field2765[var7++] = var413;
                            continue;
                        }
                        if (var514 == 4207) {
                            var7--;
                            int var415 = class151.field2765[var7];
                            class151.field2765[var7++] = class68.method498(89, var415).field2387 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4208) {
                            var7 -= 2;
                            int var416 = class151.field2765[var7 + 1];
                            int var417 = class151.field2765[var7];
                            class199 var418 = class286.method1903(var416, (byte) 118);
                            if (var418.method1409(4)) {
                                class220.field3701[var6++] = class68.method498(93, var417).method1005(false, var418.field3393, var416);
                            } else {
                                class151.field2765[var7++] = class68.method498(120, var417).method993(1229, var416, var418.field3399);
                            }
                            continue;
                        }
                        if (var514 == 4210) {
                            var7--;
                            int var419 = class151.field2765[var7];
                            var6--;
                            class126 var420 = class220.field3701[var6];
                            class54.method343(0, var419 == 1, var420);
                            class151.field2765[var7++] = class240.field4048;
                            continue;
                        }
                        if (var514 == 4211) {
                            if (class73.field1176 != null && class240.field4048 > class73.field1175) {
                                class151.field2765[var7++] = class47.method289(65535, class73.field1176[class73.field1175++]);
                                continue;
                            }
                            class151.field2765[var7++] = -1;
                            continue;
                        }
                        if (var514 == 4212) {
                            class73.field1175 = 0;
                            continue;
                        }
                    } else if (var514 < 4400) {
                        if (var514 == 4300) {
                            var7 -= 2;
                            int var222 = class151.field2765[var7];
                            int var223 = class151.field2765[var7 + 1];
                            class199 var224 = class286.method1903(var223, (byte) 112);
                            if (var224.method1409(4)) {
                                class220.field3701[var6++] = class54.method344(var222, (byte) 81).method2037(var223, var224.field3393, (byte) -96);
                            } else {
                                class151.field2765[var7++] = class54.method344(var222, (byte) -127).method2042(var223, var224.field3399, -1);
                            }
                            continue;
                        }
                        if (var514 == 4301) {
                            var7--;
                            int var225 = class151.field2765[var7];
                            class151.field2765[var7++] = class54.method344(var225, (byte) -125).field5115;
                            continue;
                        }
                        if (var514 == 4302) {
                            var7--;
                            int var226 = class151.field2765[var7];
                            class151.field2765[var7++] = class54.method344(var226, (byte) 98).field5086;
                            continue;
                        }
                        if (var514 == 4303) {
                            var7--;
                            int var227 = class151.field2765[var7];
                            class151.field2765[var7++] = class54.method344(var227, (byte) -121).field5068;
                            continue;
                        }
                        if (var514 == 4304) {
                            var7--;
                            int var228 = class151.field2765[var7];
                            class151.field2765[var7++] = class54.method344(var228, (byte) 106).field5084;
                            continue;
                        }
                        if (var514 == 4305) {
                            var7--;
                            int var229 = class151.field2765[var7];
                            class151.field2765[var7++] = class54.method344(var229, (byte) 38).field5066;
                            continue;
                        }
                        if (var514 == 4306) {
                            var7--;
                            int var230 = class151.field2765[var7];
                            class151.field2765[var7++] = class54.method344(var230, (byte) -117).field5056;
                            continue;
                        }
                        if (var514 == 4307) {
                            var7--;
                            int var231 = class151.field2765[var7];
                            class151.field2765[var7++] = class54.method344(var231, (byte) -123).field5054;
                            continue;
                        }
                    } else if (var514 < 4500) {
                        if (var514 == 4400) {
                            var7 -= 2;
                            int var232 = class151.field2765[var7];
                            int var233 = class151.field2765[var7 + 1];
                            class199 var234 = class286.method1903(var233, (byte) 122);
                            if (var234.method1409(4)) {
                                class220.field3701[var6++] = class185.method1338(var232, -7153).method1790(var233, var234.field3393, (byte) -99);
                            } else {
                                class151.field2765[var7++] = class185.method1338(var232, -7153).method1782(var233, -68, var234.field3399);
                            }
                            continue;
                        }
                    } else if (var514 < 4600) {
                        if (var514 == 4500) {
                            var7 -= 2;
                            int var235 = class151.field2765[var7];
                            int var236 = class151.field2765[var7 + 1];
                            class199 var237 = class286.method1903(var236, (byte) 106);
                            if (var237.method1409(4)) {
                                class220.field3701[var6++] = class31.method149(26, var235).method250(27015, var237.field3393, var236);
                            } else {
                                class151.field2765[var7++] = class31.method149(26, var235).method251((byte) 40, var237.field3399, var236);
                            }
                            continue;
                        }
                    } else if (var514 < 5100) {
                        if (var514 == 5000) {
                            class151.field2765[var7++] = class241.field4084;
                            continue;
                        }
                        if (var514 == 5001) {
                            class25.field358++;
                            var7 -= 3;
                            class241.field4084 = class151.field2765[var7];
                            class15.field204 = class151.field2765[var7 + 1];
                            class169.field3018 = class151.field2765[var7 + 2];
                            class103.field1645.method1238(245, 74);
                            class103.field1645.method933(-3, class241.field4084);
                            class103.field1645.method933(-3, class15.field204);
                            class103.field1645.method933(-3, class169.field3018);
                            continue;
                        }
                        if (var514 == 5002) {
                            class250.field4179++;
                            var6--;
                            class126 var337 = class220.field3701[var6];
                            var7 -= 2;
                            int var338 = class151.field2765[var7];
                            int var339 = class151.field2765[var7 + 1];
                            class103.field1645.method1238(238, 65);
                            class103.field1645.method962(-127, var337.method845((byte) -118));
                            class103.field1645.method933(-3, var338 - 1);
                            class103.field1645.method933(-3, var339);
                            continue;
                        }
                        if (var514 == 5003) {
                            var7--;
                            int var340 = class151.field2765[var7];
                            class126 var341 = null;
                            if (var340 < 100) {
                                var341 = class169.field3005[var340];
                            }
                            if (var341 == null) {
                                var341 = class122.field2050;
                            }
                            class220.field3701[var6++] = var341;
                            continue;
                        }
                        if (var514 == 5004) {
                            int var342 = -1;
                            var7--;
                            int var343 = class151.field2765[var7];
                            if (var343 < 100 && class169.field3005[var343] != null) {
                                var342 = class122.field2040[var343];
                            }
                            class151.field2765[var7++] = var342;
                            continue;
                        }
                        if (var514 == 5005) {
                            class151.field2765[var7++] = class15.field204;
                            continue;
                        }
                        if (var514 == 5008) {
                            var6--;
                            class126 var344 = class220.field3701[var6];
                            if (!var344.method883(0, class234.field3948)) {
                                if (class73.field1172 == 0 && (class239.field4038 && !class162.field2920 || class242.field4099)) {
                                    continue;
                                }
                                class283.field4701++;
                                class126 var345 = var344.method838((byte) -95);
                                byte var346 = 0;
                                if (var345.method883(0, class59.field934)) {
                                    var346 = 0;
                                    var344 = var344.method879(-14178, class59.field934.method878((byte) 103));
                                } else if (var345.method883(0, class206.field3537)) {
                                    var346 = 1;
                                    var344 = var344.method879(-14178, class206.field3537.method878((byte) -101));
                                } else if (var345.method883(0, class23.field334)) {
                                    var344 = var344.method879(-14178, class23.field334.method878((byte) 83));
                                    var346 = 2;
                                } else if (var345.method883(0, class186.field3214)) {
                                    var346 = 3;
                                    var344 = var344.method879(-14178, class186.field3214.method878((byte) 99));
                                } else if (var345.method883(0, class190.field3259)) {
                                    var344 = var344.method879(-14178, class190.field3259.method878((byte) -55));
                                    var346 = 4;
                                } else if (var345.method883(0, class176.field3106)) {
                                    var344 = var344.method879(-14178, class176.field3106.method878((byte) 108));
                                    var346 = 5;
                                } else if (var345.method883(0, class186.field3207)) {
                                    var344 = var344.method879(-14178, class186.field3207.method878((byte) -47));
                                    var346 = 6;
                                } else if (var345.method883(0, class33.field482)) {
                                    var344 = var344.method879(-14178, class33.field482.method878((byte) 39));
                                    var346 = 7;
                                } else if (var345.method883(0, class193.field3286)) {
                                    var344 = var344.method879(-14178, class193.field3286.method878((byte) 95));
                                    var346 = 8;
                                } else if (var345.method883(0, class290.field4808)) {
                                    var344 = var344.method879(-14178, class290.field4808.method878((byte) 64));
                                    var346 = 9;
                                } else if (var345.method883(0, class116.field1967)) {
                                    var346 = 10;
                                    var344 = var344.method879(-14178, class116.field1967.method878((byte) 47));
                                } else if (var345.method883(0, class186.field3210)) {
                                    var346 = 11;
                                    var344 = var344.method879(-14178, class186.field3210.method878((byte) 120));
                                } else if (class226.field3813 != 0) {
                                    if (var345.method883(0, class59.field938)) {
                                        var344 = var344.method879(-14178, class59.field938.method878((byte) 31));
                                        var346 = 0;
                                    } else if (var345.method883(0, class206.field3526)) {
                                        var344 = var344.method879(-14178, class206.field3526.method878((byte) -86));
                                        var346 = 1;
                                    } else if (var345.method883(0, class23.field339)) {
                                        var346 = 2;
                                        var344 = var344.method879(-14178, class23.field339.method878((byte) -68));
                                    } else if (var345.method883(0, class186.field3220)) {
                                        var346 = 3;
                                        var344 = var344.method879(-14178, class186.field3220.method878((byte) -84));
                                    } else if (var345.method883(0, class190.field3271)) {
                                        var344 = var344.method879(-14178, class190.field3271.method878((byte) -81));
                                        var346 = 4;
                                    } else if (var345.method883(0, class176.field3100)) {
                                        var344 = var344.method879(-14178, class176.field3100.method878((byte) 37));
                                        var346 = 5;
                                    } else if (var345.method883(0, class186.field3226)) {
                                        var344 = var344.method879(-14178, class186.field3226.method878((byte) 93));
                                        var346 = 6;
                                    } else if (var345.method883(0, class33.field478)) {
                                        var346 = 7;
                                        var344 = var344.method879(-14178, class33.field478.method878((byte) -76));
                                    } else if (var345.method883(0, class193.field3297)) {
                                        var344 = var344.method879(-14178, class193.field3297.method878((byte) 60));
                                        var346 = 8;
                                    } else if (var345.method883(0, class290.field4812)) {
                                        var344 = var344.method879(-14178, class290.field4812.method878((byte) -103));
                                        var346 = 9;
                                    } else if (var345.method883(0, class116.field1957)) {
                                        var346 = 10;
                                        var344 = var344.method879(-14178, class116.field1957.method878((byte) 64));
                                    } else if (var345.method883(0, class186.field3208)) {
                                        var346 = 11;
                                        var344 = var344.method879(-14178, class186.field3208.method878((byte) -55));
                                    }
                                }
                                byte var347 = 0;
                                class126 var348 = var344.method838((byte) -125);
                                if (var348.method883(0, class269.field4540)) {
                                    var344 = var344.method879(-14178, class269.field4540.method878((byte) -93));
                                    var347 = 1;
                                } else if (var348.method883(0, class26.field365)) {
                                    var344 = var344.method879(-14178, class26.field365.method878((byte) 57));
                                    var347 = 2;
                                } else if (var348.method883(0, class122.field2048)) {
                                    var347 = 3;
                                    var344 = var344.method879(-14178, class122.field2048.method878((byte) -61));
                                } else if (var348.method883(0, class8.field92)) {
                                    var344 = var344.method879(-14178, class8.field92.method878((byte) 97));
                                    var347 = 4;
                                } else if (var348.method883(0, class4.field22)) {
                                    var344 = var344.method879(-14178, class4.field22.method878((byte) 126));
                                    var347 = 5;
                                } else if (class226.field3813 != 0) {
                                    if (var348.method883(0, class269.field4546)) {
                                        var347 = 1;
                                        var344 = var344.method879(-14178, class269.field4546.method878((byte) -70));
                                    } else if (var348.method883(0, class26.field370)) {
                                        var344 = var344.method879(-14178, class26.field370.method878((byte) 41));
                                        var347 = 2;
                                    } else if (var348.method883(0, class122.field2044)) {
                                        var344 = var344.method879(-14178, class122.field2044.method878((byte) 120));
                                        var347 = 3;
                                    } else if (var348.method883(0, class8.field100)) {
                                        var344 = var344.method879(-14178, class8.field100.method878((byte) -96));
                                        var347 = 4;
                                    } else if (var348.method883(0, class4.field20)) {
                                        var344 = var344.method879(-14178, class4.field20.method878((byte) -71));
                                        var347 = 5;
                                    }
                                }
                                class103.field1645.method1238(176, 122);
                                class103.field1645.method933(-3, 0);
                                int var349 = class103.field1645.field2299;
                                class103.field1645.method933(-3, var346);
                                class103.field1645.method933(-3, var347);
                                class237.method1634(class103.field1645, -57, var344);
                                class103.field1645.method952(class103.field1645.field2299 - var349, 92);
                                continue;
                            }
                            class303.method2033(var344, (byte) 127);
                            continue;
                        }
                        if (var514 == 5009) {
                            var6 -= 2;
                            class126 var350 = class220.field3701[var6 + 1];
                            class126 var351 = class220.field3701[var6];
                            if (class73.field1172 != 0 || (!class239.field4038 || class162.field2920) && !class242.field4099) {
                                class165.field2940++;
                                class103.field1645.method1238(159, 127);
                                class103.field1645.method933(-3, 0);
                                int var352 = class103.field1645.field2299;
                                class103.field1645.method962(-124, var351.method845((byte) -127));
                                class237.method1634(class103.field1645, -52, var350);
                                class103.field1645.method952(class103.field1645.field2299 - var352, 114);
                            }
                            continue;
                        }
                        if (var514 == 5010) {
                            var7--;
                            int var353 = class151.field2765[var7];
                            class126 var354 = null;
                            if (var353 < 100) {
                                var354 = class48.field744[var353];
                            }
                            if (var354 == null) {
                                var354 = class122.field2050;
                            }
                            class220.field3701[var6++] = var354;
                            continue;
                        }
                        if (var514 == 5011) {
                            var7--;
                            int var355 = class151.field2765[var7];
                            class126 var356 = null;
                            if (var355 < 100) {
                                var356 = field3034[var355];
                            }
                            if (var356 == null) {
                                var356 = class122.field2050;
                            }
                            class220.field3701[var6++] = var356;
                            continue;
                        }
                        if (var514 == 5012) {
                            int var357 = -1;
                            var7--;
                            int var358 = class151.field2765[var7];
                            if (var358 < 100) {
                                var357 = class290.field4814[var358];
                            }
                            class151.field2765[var7++] = var357;
                            continue;
                        }
                        if (var514 == 5015) {
                            class126 var359;
                            if (class286.field4744 == null || class286.field4744.field5019 == null) {
                                var359 = class224.field3784;
                            } else {
                                var359 = class286.field4744.method2025(55);
                            }
                            class220.field3701[var6++] = var359;
                            continue;
                        }
                        if (var514 == 5016) {
                            class151.field2765[var7++] = class169.field3018;
                            continue;
                        }
                        if (var514 == 5017) {
                            class151.field2765[var7++] = class234.field3953;
                            continue;
                        }
                        if (var514 == 5050) {
                            var7--;
                            int var360 = class151.field2765[var7];
                            class220.field3701[var6++] = class151.method1126(var360, 80).field3057;
                            continue;
                        }
                        if (var514 == 5051) {
                            var7--;
                            int var361 = class151.field2765[var7];
                            class173 var362 = class151.method1126(var361, -35);
                            if (var362.field3054 == null) {
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var362.field3054.length;
                            }
                            continue;
                        }
                        if (var514 == 5052) {
                            var7 -= 2;
                            int var363 = class151.field2765[var7];
                            int var364 = class151.field2765[var7 + 1];
                            class173 var365 = class151.method1126(var363, 70);
                            int var366 = var365.field3054[var364];
                            class151.field2765[var7++] = var366;
                            continue;
                        }
                        if (var514 == 5053) {
                            var7--;
                            int var367 = class151.field2765[var7];
                            class173 var368 = class151.method1126(var367, 112);
                            if (var368.field3058 == null) {
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var368.field3058.length;
                            }
                            continue;
                        }
                        if (var514 == 5054) {
                            var7 -= 2;
                            int var369 = class151.field2765[var7];
                            int var370 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class151.method1126(var369, 114).field3058[var370];
                            continue;
                        }
                        if (var514 == 5055) {
                            var7--;
                            int var371 = class151.field2765[var7];
                            class220.field3701[var6++] = class241.method1665(var371, (byte) -53).method1511(0);
                            continue;
                        }
                        if (var514 == 5056) {
                            var7--;
                            int var372 = class151.field2765[var7];
                            class220 var373 = class241.method1665(var372, (byte) -53);
                            if (var373.field3703 == null) {
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var373.field3703.length;
                            }
                            continue;
                        }
                        if (var514 == 5057) {
                            var7 -= 2;
                            int var374 = class151.field2765[var7];
                            int var375 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class241.method1665(var374, (byte) -53).field3703[var375];
                            continue;
                        }
                        if (var514 == 5058) {
                            class64.field1080 = new class85();
                            var7--;
                            class64.field1080.field1348 = class151.field2765[var7];
                            class64.field1080.field1346 = class241.method1665(class64.field1080.field1348, (byte) -53);
                            class64.field1080.field1351 = new int[class64.field1080.field1346.method1505(true)];
                            continue;
                        }
                        if (var514 == 5059) {
                            class123.field2088++;
                            class103.field1645.method1238(70, 123);
                            class103.field1645.method933(-3, 0);
                            int var376 = class103.field1645.field2299;
                            class103.field1645.method933(-3, 0);
                            class103.field1645.method959(69, class64.field1080.field1348);
                            class64.field1080.field1346.method1504(95, class64.field1080.field1351, class103.field1645);
                            class103.field1645.method952(class103.field1645.field2299 - var376, 109);
                            continue;
                        }
                        if (var514 == 5060) {
                            class96.field1549++;
                            var6--;
                            class126 var377 = class220.field3701[var6];
                            class103.field1645.method1238(193, 95);
                            class103.field1645.method933(-3, 0);
                            int var378 = class103.field1645.field2299;
                            class103.field1645.method962(-121, var377.method845((byte) -117));
                            class103.field1645.method959(-116, class64.field1080.field1348);
                            class64.field1080.field1346.method1504(69, class64.field1080.field1351, class103.field1645);
                            class103.field1645.method952(class103.field1645.field2299 - var378, 125);
                            continue;
                        }
                        if (var514 == 5061) {
                            class123.field2088++;
                            class103.field1645.method1238(70, 113);
                            class103.field1645.method933(-3, 0);
                            int var379 = class103.field1645.field2299;
                            class103.field1645.method933(-3, 1);
                            class103.field1645.method959(-63, class64.field1080.field1348);
                            class64.field1080.field1346.method1504(-121, class64.field1080.field1351, class103.field1645);
                            class103.field1645.method952(class103.field1645.field2299 - var379, 107);
                            continue;
                        }
                        if (var514 == 5062) {
                            var7 -= 2;
                            int var380 = class151.field2765[var7];
                            int var381 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class151.method1126(var380, -48).field3055[var381];
                            continue;
                        }
                        if (var514 == 5063) {
                            var7 -= 2;
                            int var382 = class151.field2765[var7];
                            int var383 = class151.field2765[var7 + 1];
                            class151.field2765[var7++] = class151.method1126(var382, -56).field3061[var383];
                            continue;
                        }
                        if (var514 == 5064) {
                            var7 -= 2;
                            int var384 = class151.field2765[var7 + 1];
                            int var385 = class151.field2765[var7];
                            if (var384 == -1) {
                                class151.field2765[var7++] = -1;
                            } else {
                                class151.field2765[var7++] = class151.method1126(var385, -97).method1259(-121, var384);
                            }
                            continue;
                        }
                        if (var514 == 5065) {
                            var7 -= 2;
                            int var386 = class151.field2765[var7 + 1];
                            int var387 = class151.field2765[var7];
                            if (var386 == -1) {
                                class151.field2765[var7++] = -1;
                            } else {
                                class151.field2765[var7++] = class151.method1126(var387, 95).method1263(var386, 32768);
                            }
                            continue;
                        }
                        if (var514 == 5066) {
                            var7--;
                            int var388 = class151.field2765[var7];
                            class151.field2765[var7++] = class241.method1665(var388, (byte) -53).method1505(true);
                            continue;
                        }
                        if (var514 == 5067) {
                            var7 -= 2;
                            int var389 = class151.field2765[var7 + 1];
                            int var390 = class151.field2765[var7];
                            int var391 = class241.method1665(var390, (byte) -53).method1510(var389, false);
                            class151.field2765[var7++] = var391;
                            continue;
                        }
                        if (var514 == 5068) {
                            var7 -= 2;
                            int var392 = class151.field2765[var7];
                            int var393 = class151.field2765[var7 + 1];
                            class64.field1080.field1351[var392] = var393;
                            continue;
                        }
                        if (var514 == 5069) {
                            var7 -= 2;
                            int var394 = class151.field2765[var7];
                            int var395 = class151.field2765[var7 + 1];
                            class64.field1080.field1351[var394] = var395;
                            continue;
                        }
                        if (var514 == 5070) {
                            var7 -= 3;
                            int var396 = class151.field2765[var7];
                            int var397 = class151.field2765[var7 + 1];
                            int var398 = class151.field2765[var7 + 2];
                            class220 var399 = class241.method1665(var396, (byte) -53);
                            if (var399.method1510(var397, false) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class151.field2765[var7++] = var399.method1509(var397, var398, -26);
                            continue;
                        }
                        if (var514 == 5071) {
                            var6--;
                            class126 var400 = class220.field3701[var6];
                            var7--;
                            boolean var401 = class151.field2765[var7] == 1;
                            class16.method90(3574, var401, var400);
                            class151.field2765[var7++] = class240.field4048;
                            continue;
                        }
                        if (var514 == 5072) {
                            if (class73.field1176 != null && class240.field4048 > class73.field1175) {
                                class151.field2765[var7++] = class47.method289(65535, class73.field1176[class73.field1175++]);
                                continue;
                            }
                            class151.field2765[var7++] = -1;
                            continue;
                        }
                        if (var514 == 5073) {
                            class73.field1175 = 0;
                            continue;
                        }
                    } else if (var514 < 5200) {
                        if (var514 == 5100) {
                            if (class217.field3655[86]) {
                                class151.field2765[var7++] = 1;
                            } else {
                                class151.field2765[var7++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 5101) {
                            if (class217.field3655[82]) {
                                class151.field2765[var7++] = 1;
                            } else {
                                class151.field2765[var7++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 5102) {
                            if (class217.field3655[81]) {
                                class151.field2765[var7++] = 1;
                            } else {
                                class151.field2765[var7++] = 0;
                            }
                            continue;
                        }
                    } else if (var514 < 5300) {
                        if (var514 == 5200) {
                            var7--;
                            class158.method1155((byte) 119, class151.field2765[var7]);
                            continue;
                        }
                        if (var514 == 5201) {
                            class151.field2765[var7++] = class34.method189(-120);
                            continue;
                        }
                        if (var514 == 5202) {
                            var7--;
                            class57.method390(false, class151.field2765[var7]);
                            continue;
                        }
                        if (var514 == 5203) {
                            var6--;
                            class59.method404(class220.field3701[var6], -23956);
                            continue;
                        }
                        if (var514 == 5204) {
                            class220.field3701[var6 - 1] = class193.method1373(class220.field3701[var6 - 1], 0);
                            continue;
                        }
                        if (var514 == 5205) {
                            var6--;
                            class170.method1245(class220.field3701[var6], true);
                            continue;
                        }
                        if (var514 == 5206) {
                            var7--;
                            int var238 = class151.field2765[var7];
                            class229 var239 = class119.method785(var238 & 0x3FFF, var238 >> 14 & 0x3FFF, 93);
                            if (var239 == null) {
                                class220.field3701[var6++] = class122.field2050;
                            } else {
                                class220.field3701[var6++] = var239.field3859;
                            }
                            continue;
                        }
                        if (var514 == 5207) {
                            var6--;
                            class229 var240 = class116.method760(class220.field3701[var6], (byte) 78);
                            if (var240 != null && var240.field3868 != null) {
                                class220.field3701[var6++] = var240.field3868;
                                continue;
                            }
                            class220.field3701[var6++] = class122.field2050;
                            continue;
                        }
                        if (var514 == 5208) {
                            class151.field2765[var7++] = class226.field3805;
                            class151.field2765[var7++] = class286.field4738;
                            continue;
                        }
                        if (var514 == 5209) {
                            class151.field2765[var7++] = class220.field3702 + class139.field2522;
                            class151.field2765[var7++] = class143.field2602 + class306.field5140 - class253.field4249 - 1;
                            continue;
                        }
                        if (var514 == 5210) {
                            class229 var241 = class281.method1878(-23429);
                            if (var241 == null) {
                                class151.field2765[var7++] = 0;
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var241.field3867 * 64;
                                class151.field2765[var7++] = var241.field3865 * 64;
                            }
                            continue;
                        }
                        if (var514 == 5211) {
                            class229 var242 = class281.method1878(-23429);
                            if (var242 == null) {
                                class151.field2765[var7++] = 0;
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var242.field3853 - var242.field3871;
                                class151.field2765[var7++] = var242.field3866 - var242.field3862;
                            }
                            continue;
                        }
                        if (var514 == 5212) {
                            int var243 = class158.method1162((byte) 59);
                            int var244 = 0;
                            class126 var245;
                            if (var243 == -1) {
                                var245 = class122.field2050;
                            } else {
                                var245 = class228.field3852.field885[var243];
                                var244 = class228.field3852.method394(!arg1, var243);
                            }
                            class126 var246 = var245.method863(class4.field29, class291.field4824, -126);
                            class220.field3701[var6++] = var246;
                            class151.field2765[var7++] = var244;
                            continue;
                        }
                        if (var514 == 5213) {
                            int var247 = class119.method786((byte) -13);
                            int var248 = 0;
                            class126 var249;
                            if (var247 == -1) {
                                var249 = class122.field2050;
                            } else {
                                var249 = class228.field3852.field885[var247];
                                var248 = class228.field3852.method394(!arg1, var247);
                            }
                            class126 var250 = var249.method863(class4.field29, class291.field4824, -128);
                            class220.field3701[var6++] = var250;
                            class151.field2765[var7++] = var248;
                            continue;
                        }
                        if (var514 == 5214) {
                            var7--;
                            int var251 = class151.field2765[var7];
                            class307.method2089(-21706, (var251 & 0xFFFE6EA) >> 14, var251 & 0x3FFF);
                            continue;
                        }
                        if (var514 == 5215) {
                            var7--;
                            int var252 = class151.field2765[var7];
                            var6--;
                            class126 var253 = class220.field3701[var6];
                            class181 var254 = class41.method266((var252 & 0xFFFFF4E) >> 14, var252 & 0x3FFF, -2294);
                            boolean var255 = false;
                            for (class229 var256 = (class229) var254.method1292(true); var256 != null; var256 = (class229) var254.method1293(2)) {
                                if (var256.field3859.method881(var253, (byte) 92)) {
                                    var255 = true;
                                    break;
                                }
                            }
                            if (var255) {
                                class151.field2765[var7++] = 1;
                            } else {
                                class151.field2765[var7++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 5216) {
                            var7--;
                            int var257 = class151.field2765[var7];
                            class143.method1042((byte) 115, var257);
                            continue;
                        }
                        if (var514 == 5217) {
                            var7--;
                            int var258 = class151.field2765[var7];
                            if (class195.method1378(13889, var258)) {
                                class151.field2765[var7++] = 1;
                            } else {
                                class151.field2765[var7++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 5218) {
                            class229 var259 = class281.method1878(-23429);
                            if (var259 == null) {
                                class151.field2765[var7++] = -1;
                            } else {
                                class151.field2765[var7++] = var259.field3874;
                            }
                            continue;
                        }
                        if (var514 == 5219) {
                            var6--;
                            class193.method1372(class220.field3701[var6], 16777216);
                            continue;
                        }
                    } else if (var514 < 5400) {
                        if (var514 == 5300) {
                            var7 -= 2;
                            int var260 = class151.field2765[var7 + 1];
                            int var261 = class151.field2765[var7];
                            class152.method1134(var261, 3, var260, false, -1);
                            class151.field2765[var7++] = class45.field693 == null ? 0 : 1;
                            continue;
                        }
                        if (var514 == 5301) {
                            if (class45.field693 != null) {
                                class152.method1134(-1, class189.field3242, -1, false, -1);
                            }
                            continue;
                        }
                        if (var514 == 5302) {
                            class161[] var262 = class224.method1538((byte) 25);
                            class151.field2765[var7++] = var262.length;
                            continue;
                        }
                        if (var514 == 5303) {
                            var7--;
                            int var263 = class151.field2765[var7];
                            class161[] var264 = class224.method1538((byte) 25);
                            class151.field2765[var7++] = var264[var263].field2911;
                            class151.field2765[var7++] = var264[var263].field2906;
                            continue;
                        }
                        if (var514 == 5305) {
                            int var265 = class95.field1503;
                            int var266 = class212.field3613;
                            int var267 = -1;
                            class161[] var268 = class224.method1538((byte) 25);
                            for (int var269 = 0; var269 < var268.length; var269++) {
                                class161 var270 = var268[var269];
                                if (var270.field2911 == var265 && var270.field2906 == var266) {
                                    var267 = var269;
                                    break;
                                }
                            }
                            class151.field2765[var7++] = var267;
                            continue;
                        }
                        if (var514 == 5306) {
                            class151.field2765[var7++] = class45.method282(-82);
                            continue;
                        }
                        if (var514 == 5307) {
                            var7--;
                            int var271 = class151.field2765[var7];
                            if (var271 < 0 || var271 > 2) {
                                var271 = 0;
                            }
                            class152.method1134(-1, var271, -1, false, -1);
                            continue;
                        }
                        if (var514 == 5308) {
                            class151.field2765[var7++] = class189.field3242;
                            continue;
                        }
                        if (var514 == 5309) {
                            var7--;
                            int var272 = class151.field2765[var7];
                            if (var272 < 0 || var272 > 2) {
                                var272 = 0;
                            }
                            class189.field3242 = var272;
                            class123.method823(-21165, class161.field2907);
                            continue;
                        }
                    } else if (var514 < 5500) {
                        if (var514 == 5400) {
                            class219.field3689++;
                            var6 -= 2;
                            class126 var273 = class220.field3701[var6];
                            class126 var274 = class220.field3701[var6 + 1];
                            var7--;
                            int var275 = class151.field2765[var7];
                            class103.field1645.method1238(37, 87);
                            class103.field1645.method933(-3, class281.method1882((byte) -100, var273) + class281.method1882((byte) -100, var274) + 1);
                            class103.field1645.method980(var273, arg1);
                            class103.field1645.method980(var274, true);
                            class103.field1645.method933(-3, var275);
                            continue;
                        }
                        if (var514 == 5401) {
                            var7 -= 2;
                            class119.field1997[class151.field2765[var7]] = (short) class127.method885(class151.field2765[var7 + 1], true);
                            class255.method1725((byte) 60);
                            class163.method1196(-1);
                            class193.method1374(true);
                            class117.method767(-17863);
                            class241.method1652((byte) 34);
                            continue;
                        }
                        if (var514 == 5405) {
                            var7 -= 2;
                            int var276 = class151.field2765[var7 + 1];
                            int var277 = class151.field2765[var7];
                            if (var277 >= 0 && var277 < 2) {
                                class177.field3121[var277] = new int[var276 << 1][4];
                            }
                            continue;
                        }
                        if (var514 == 5406) {
                            var7 -= 7;
                            int var278 = class151.field2765[var7 + 1] << 1;
                            int var279 = class151.field2765[var7];
                            int var280 = class151.field2765[var7 + 3];
                            int var281 = class151.field2765[var7 + 4];
                            int var282 = class151.field2765[var7 + 2];
                            int var283 = class151.field2765[var7 + 5];
                            int var284 = class151.field2765[var7 + 6];
                            if (var279 >= 0 && var279 < 2 && class177.field3121[var279] != null && var278 >= 0 && class177.field3121[var279].length > var278) {
                                class177.field3121[var279][var278] = new int[] { (class47.method289(268434006, var282) >> 14) * 128, var280, class47.method289(var282, 16383) * 128, var284 };
                                class177.field3121[var279][var278 + 1] = new int[] { class47.method289(var281 >> 14, 16383) * 128, var283, class47.method289(16383, var281) * 128 };
                            }
                            continue;
                        }
                        if (var514 == 5407) {
                            var7--;
                            int var285 = class177.field3121[class151.field2765[var7]].length >> 1;
                            class151.field2765[var7++] = var285;
                            continue;
                        }
                        if (var514 == 5411) {
                            if (class45.field693 != null) {
                                class152.method1134(-1, class189.field3242, -1, false, -1);
                            }
                            if (class253.field4250 == null) {
                                class315.method2196((byte) 105, false, class181.method1300((byte) 122));
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var514 == 5419) {
                            class126 var286 = class122.field2050;
                            if (class32.field470 != null) {
                                var286 = class140.method1030(class32.field470.field969, -44);
                                try {
                                    if (class32.field470.field967 != null) {
                                        byte[] var287 = ((String) class32.field470.field967).getBytes("ISO-8859-1");
                                        var286 = class301.method2021(0, var287.length, var287, false);
                                    }
                                } catch (UnsupportedEncodingException var512) {
                                }
                            }
                            class220.field3701[var6++] = var286;
                            continue;
                        }
                        if (var514 == 5420) {
                            class151.field2765[var7++] = class147.field2708 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 5421) {
                            if (class45.field693 != null) {
                                class152.method1134(-1, class189.field3242, -1, false, -1);
                            }
                            var6--;
                            class126 var289 = class220.field3701[var6];
                            var7--;
                            boolean var290 = class151.field2765[var7] == 1;
                            class126 var291 = class12.method69(new class126[] { class181.method1300((byte) 126), var289 }, (byte) 127);
                            if (class253.field4250 != null || var290 && class147.field2708 != 3 && class147.field2715.startsWith("win") && !class111.field1746) {
                                class207.field3549 = var291;
                                class5.field63 = var290;
                                class257.field4317 = class161.field2907.method1102(0, new String(var291.method860((byte) -49), "ISO-8859-1"));
                                continue;
                            }
                            class315.method2196((byte) 111, var290, var291);
                            continue;
                        }
                        if (var514 == 5422) {
                            var6 -= 2;
                            class126 var292 = class220.field3701[var6];
                            class126 var293 = class220.field3701[var6 + 1];
                            var7--;
                            int var294 = class151.field2765[var7];
                            if (var292.method878((byte) 65) > 0) {
                                if (class95.field1505 == null) {
                                    class95.field1505 = new class126[class309.field5246[class23.field335]];
                                }
                                class95.field1505[var294] = var292;
                            }
                            if (var293.method878((byte) 110) > 0) {
                                if (class21.field282 == null) {
                                    class21.field282 = new class126[class309.field5246[class23.field335]];
                                }
                                class21.field282[var294] = var293;
                            }
                            continue;
                        }
                        if (var514 == 5423) {
                            var6--;
                            class220.field3701[var6].method837(2);
                            continue;
                        }
                        if (var514 == 5424) {
                            var7 -= 11;
                            class74.field1199 = class151.field2765[var7];
                            class31.field428 = class151.field2765[var7 + 1];
                            class264.field4413 = class151.field2765[var7 + 2];
                            class192.field3284 = class151.field2765[var7 + 3];
                            class313.field5341 = class151.field2765[var7 + 4];
                            class285.field4728 = class151.field2765[var7 + 5];
                            class182.field3179 = class151.field2765[var7 + 6];
                            class138.field2470 = class151.field2765[var7 + 7];
                            class100.field1625 = class151.field2765[var7 + 8];
                            class24.field341 = class151.field2765[var7 + 9];
                            class102.field1642 = class151.field2765[var7 + 10];
                            class127.field2170.method2166(-28257, class313.field5341);
                            class127.field2170.method2166(-28257, class285.field4728);
                            class127.field2170.method2166(-28257, class182.field3179);
                            class127.field2170.method2166(-28257, class138.field2470);
                            class127.field2170.method2166(-28257, class100.field1625);
                            class202.field3453 = true;
                            continue;
                        }
                        if (var514 == 5425) {
                            class283.method1891(0);
                            class202.field3453 = false;
                            continue;
                        }
                        if (var514 == 5426) {
                            var7--;
                            class192.field3285 = class151.field2765[var7];
                            continue;
                        }
                        if (var514 == 5427) {
                            var7 -= 2;
                            class96.field1538 = class151.field2765[var7];
                            class265.field4442 = class151.field2765[var7 + 1];
                            continue;
                        }
                    } else if (var514 < 5600) {
                        if (var514 == 5500) {
                            var7 -= 4;
                            int var325 = class151.field2765[var7 + 1];
                            int var326 = class151.field2765[var7];
                            int var327 = class151.field2765[var7 + 2];
                            int var328 = class151.field2765[var7 + 3];
                            class289.method1919(var327, 0, (var326 & 0x3FFF) - class138.field2473, false, var325, (var326 >> 14 & 0x3FFF) - class58.field914, var328);
                            continue;
                        }
                        if (var514 == 5501) {
                            var7 -= 4;
                            int var329 = class151.field2765[var7 + 2];
                            int var330 = class151.field2765[var7];
                            int var331 = class151.field2765[var7 + 1];
                            int var332 = class151.field2765[var7 + 3];
                            class5.method32((var330 & 0x3FFF) - class138.field2473, var329, (var330 >> 14 & 0x3FFF) - class58.field914, var332, 6164, var331);
                            continue;
                        }
                        if (var514 == 5502) {
                            var7 -= 6;
                            int var333 = class151.field2765[var7];
                            if (var333 >= 2) {
                                throw new RuntimeException();
                            }
                            class163.field2927 = var333;
                            int var334 = class151.field2765[var7 + 1];
                            if (var334 + 1 >= class177.field3121[class163.field2927].length >> 1) {
                                throw new RuntimeException();
                            }
                            class290.field4810 = var334;
                            class243.field4115 = 0;
                            class35.field513 = class151.field2765[var7 + 2];
                            class47.field734 = class151.field2765[var7 + 3];
                            int var335 = class151.field2765[var7 + 4];
                            if (var335 >= 2) {
                                throw new RuntimeException();
                            }
                            class26.field372 = var335;
                            int var336 = class151.field2765[var7 + 5];
                            if ((var336 + 1) >= (class177.field3121[class26.field372].length >> 1)) {
                                throw new RuntimeException();
                            }
                            class288.field4783 = var336;
                            class254.field4261 = 3;
                            continue;
                        }
                        if (var514 == 5503) {
                            class54.method342(-6);
                            continue;
                        }
                        if (var514 == 5504) {
                            var7 -= 2;
                            class292.field4832 = class151.field2765[var7];
                            class144.field2618 = class151.field2765[var7 + 1];
                            if (class254.field4261 == 2) {
                                class29.field404 = class144.field2618;
                                class102.field1640 = class292.field4832;
                            }
                            class234.method1592((byte) -107);
                            continue;
                        }
                        if (var514 == 5505) {
                            class151.field2765[var7++] = class292.field4832;
                            continue;
                        }
                        if (var514 == 5506) {
                            class151.field2765[var7++] = class144.field2618;
                            continue;
                        }
                    } else if (var514 < 5700) {
                        if (var514 == 5600) {
                            var6 -= 2;
                            class126 var321 = class220.field3701[var6 + 1];
                            var7--;
                            int var322 = class151.field2765[var7];
                            class126 var323 = class220.field3701[var6];
                            if (class280.field4662 == 10 && class232.field3900 == 0 && class281.field4680 == 0 && class267.field4522 == 0 && class69.field1143 == 0) {
                                class13.method76(var322, var323, var321, (byte) -119);
                            }
                            continue;
                        }
                        if (var514 == 5601) {
                            class303.method2036((byte) 49);
                            continue;
                        }
                        if (var514 == 5602) {
                            if (class281.field4680 == 0) {
                                class289.field4792 = -2;
                            }
                            continue;
                        }
                        if (var514 == 5603) {
                            var7 -= 4;
                            if (class280.field4662 == 10 && class232.field3900 == 0 && class281.field4680 == 0 && class267.field4522 == 0 && class69.field1143 == 0) {
                                class281.method1881((byte) -90, class151.field2765[var7 + 3], class151.field2765[var7], class151.field2765[var7 + 2], class151.field2765[var7 + 1]);
                            }
                            continue;
                        }
                        if (var514 == 5604) {
                            var6--;
                            if (class280.field4662 == 10 && class232.field3900 == 0 && class281.field4680 == 0 && class267.field4522 == 0 && class69.field1143 == 0) {
                                class226.method1542(class220.field3701[var6].method845((byte) -126), 115);
                            }
                            continue;
                        }
                        if (var514 == 5605) {
                            var7 -= 4;
                            var6 -= 2;
                            if (class280.field4662 == 10 && class232.field3900 == 0 && class281.field4680 == 0 && class267.field4522 == 0 && class69.field1143 == 0) {
                                class306.method2053(class220.field3701[var6 + 1], class151.field2765[var7 + 3], class151.field2765[var7], class220.field3701[var6].method845((byte) -125), class151.field2765[var7 + 2], (byte) 63, class151.field2765[var7 + 1]);
                            }
                            continue;
                        }
                        if (var514 == 5606) {
                            if (class267.field4522 == 0) {
                                class287.field4773 = -2;
                            }
                            continue;
                        }
                        if (var514 == 5607) {
                            class151.field2765[var7++] = class289.field4792;
                            continue;
                        }
                        if (var514 == 5608) {
                            class151.field2765[var7++] = class223.field3764;
                            continue;
                        }
                        if (var514 == 5609) {
                            class151.field2765[var7++] = class287.field4773;
                            continue;
                        }
                        if (var514 == 5610) {
                            for (int var324 = 0; var324 < 5; var324++) {
                                class220.field3701[var6++] = var324 >= class20.field273.length ? class122.field2050 : class20.field273[var324].method869(123);
                            }
                            class20.field273 = null;
                            continue;
                        }
                        if (var514 == 5611) {
                            class151.field2765[var7++] = class85.field1347;
                            continue;
                        }
                    } else if (var514 < 6100) {
                        if (var514 == 6001) {
                            var7--;
                            int var312 = class151.field2765[var7];
                            if (var312 < 1) {
                                var312 = 1;
                            }
                            if (var312 > 4) {
                                var312 = 4;
                            }
                            class287.field4776 = var312;
                            if (!class56.field846 || !class249.field4166) {
                                if (class287.field4776 == 1) {
                                    class236.method1614(0.9F);
                                }
                                if (class287.field4776 == 2) {
                                    class236.method1614(0.8F);
                                }
                                if (class287.field4776 == 3) {
                                    class236.method1614(0.7F);
                                }
                                if (class287.field4776 == 4) {
                                    class236.method1614(0.6F);
                                }
                            }
                            if (class56.field846) {
                                class180.method1291(4064);
                                if (!class249.field4166) {
                                    class227.method1546(-128);
                                }
                            }
                            class163.method1196(-1);
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6002) {
                            var7--;
                            class182.method1306(class151.field2765[var7] == 1, true);
                            class293.method1942((byte) 63);
                            class227.method1546(-128);
                            class136.method990(255);
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6003) {
                            var7--;
                            class301.field5016 = class151.field2765[var7] == 1;
                            class136.method990(255);
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6005) {
                            var7--;
                            class44.field677 = class151.field2765[var7] == 1;
                            class227.method1546(-127);
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6006) {
                            var7--;
                            class214.field3644 = class151.field2765[var7] == 1;
                            ((class232) class236.field3987).method1580(!class214.field3644, -126);
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6007) {
                            var7--;
                            class94.field1474 = class151.field2765[var7] == 1;
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6008) {
                            var7--;
                            class74.field1200 = class151.field2765[var7] == 1;
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6009) {
                            var7--;
                            class44.field684 = class151.field2765[var7] == 1;
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6010) {
                            var7--;
                            class32.field472 = class151.field2765[var7] == 1;
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6011) {
                            var7--;
                            int var313 = class151.field2765[var7];
                            if (var313 < 0 || var313 > 2) {
                                var313 = 0;
                            }
                            class55.field836 = var313;
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6012) {
                            if (class56.field846) {
                                class51.method325(0, 0, 26604);
                            }
                            var7--;
                            class249.field4166 = class151.field2765[var7] == 1;
                            if (class56.field846 && class249.field4166) {
                                class236.method1614(0.7F);
                            } else {
                                if (class287.field4776 == 1) {
                                    class236.method1614(0.9F);
                                }
                                if (class287.field4776 == 2) {
                                    class236.method1614(0.8F);
                                }
                                if (class287.field4776 == 3) {
                                    class236.method1614(0.7F);
                                }
                                if (class287.field4776 == 4) {
                                    class236.method1614(0.6F);
                                }
                            }
                            class227.method1546(-123);
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6014) {
                            var7--;
                            class40.field640 = class151.field2765[var7] == 1;
                            if (class56.field846) {
                                class227.method1546(-124);
                            }
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6015) {
                            var7--;
                            class13.field172 = class151.field2765[var7] == 1;
                            if (class56.field846) {
                                class180.method1291(4064);
                            }
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6016) {
                            var7--;
                            int var314 = class151.field2765[var7];
                            if (var314 < 0 || var314 > 2) {
                                var314 = 0;
                            }
                            if (class56.field846) {
                                class139.field2538 = true;
                            }
                            class22.field300 = var314;
                            continue;
                        }
                        if (var514 == 6017) {
                            var7--;
                            class280.field4660 = class151.field2765[var7] == 1;
                            class125.method833(false);
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6018) {
                            var7--;
                            int var315 = class151.field2765[var7];
                            if (var315 < 0) {
                                var315 = 0;
                            }
                            if (var315 > 127) {
                                var315 = 127;
                            }
                            class69.field1144 = var315;
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6019) {
                            var7--;
                            int var316 = class151.field2765[var7];
                            if (var316 < 0) {
                                var316 = 0;
                            }
                            if (var316 > 255) {
                                var316 = 255;
                            }
                            if (class159.field2866 != var316) {
                                if (class159.field2866 == 0 && class200.field3412 != -1) {
                                    class257.method1743(false, class4.field28, 0, class200.field3412, var316, 2);
                                    class51.field785 = false;
                                } else if (var316 == 0) {
                                    class176.method1273((byte) 122);
                                    class51.field785 = false;
                                } else {
                                    class118.method780(-108, var316);
                                }
                                class159.field2866 = var316;
                            }
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6020) {
                            var7--;
                            int var317 = class151.field2765[var7];
                            if (var317 < 0) {
                                var317 = 0;
                            }
                            if (var317 > 127) {
                                var317 = 127;
                            }
                            class205.field3523 = var317;
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            continue;
                        }
                        if (var514 == 6021) {
                            var7--;
                            class124.field2097 = class151.field2765[var7] == 1;
                            class136.method990(255);
                            continue;
                        }
                        if (var514 == 6023) {
                            var7--;
                            int var318 = class151.field2765[var7];
                            boolean var319 = false;
                            if (var318 < 0) {
                                var318 = 0;
                            }
                            if (var318 > 2) {
                                var318 = 2;
                            }
                            if (class283.field4716 < 96) {
                                var318 = 0;
                                var319 = true;
                            }
                            class211.method1475(var318);
                            class123.method823(-21165, class161.field2907);
                            class253.field4255 = false;
                            class151.field2765[var7++] = var319 ? 0 : 1;
                            continue;
                        }
                        if (var514 == 6024) {
                            var7--;
                            int var320 = class151.field2765[var7];
                            if (var320 < 0 || var320 > 2) {
                                var320 = 0;
                            }
                            class226.field3814 = var320;
                            class123.method823(-21165, class161.field2907);
                            continue;
                        }
                        if (var514 == 6028) {
                            var7--;
                            class297.field4942 = class151.field2765[var7] != 0;
                            class123.method823(-21165, class161.field2907);
                            continue;
                        }
                    } else if (var514 < 6200) {
                        if (var514 == 6101) {
                            class151.field2765[var7++] = class287.field4776;
                            continue;
                        }
                        if (var514 == 6102) {
                            class151.field2765[var7++] = class22.method109(4096) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6103) {
                            class151.field2765[var7++] = class301.field5016 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6105) {
                            class151.field2765[var7++] = class44.field677 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6106) {
                            class151.field2765[var7++] = class214.field3644 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6107) {
                            class151.field2765[var7++] = class94.field1474 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6108) {
                            class151.field2765[var7++] = class74.field1200 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6109) {
                            class151.field2765[var7++] = class44.field684 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6110) {
                            class151.field2765[var7++] = class32.field472 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6111) {
                            class151.field2765[var7++] = class55.field836;
                            continue;
                        }
                        if (var514 == 6112) {
                            class151.field2765[var7++] = class249.field4166 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6114) {
                            class151.field2765[var7++] = class40.field640 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6115) {
                            class151.field2765[var7++] = class13.field172 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6116) {
                            class151.field2765[var7++] = class22.field300;
                            continue;
                        }
                        if (var514 == 6117) {
                            class151.field2765[var7++] = class280.field4660 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6118) {
                            class151.field2765[var7++] = class69.field1144;
                            continue;
                        }
                        if (var514 == 6119) {
                            class151.field2765[var7++] = class159.field2866;
                            continue;
                        }
                        if (var514 == 6120) {
                            class151.field2765[var7++] = class205.field3523;
                            continue;
                        }
                        if (var514 == 6121) {
                            if (class56.field846) {
                                class151.field2765[var7++] = class56.field859 ? 1 : 0;
                            } else {
                                class151.field2765[var7++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 6123) {
                            class151.field2765[var7++] = class211.method1473();
                            continue;
                        }
                        if (var514 == 6124) {
                            class151.field2765[var7++] = class226.field3814;
                            continue;
                        }
                        if (var514 == 6128) {
                            class151.field2765[var7++] = class297.field4942 ? 1 : 0;
                            continue;
                        }
                    } else if (var514 < 6300) {
                        if (var514 == 6200) {
                            var7 -= 2;
                            class107.field1690 = (short) class151.field2765[var7];
                            if (class107.field1690 <= 0) {
                                class107.field1690 = 256;
                            }
                            class11.field152 = (short) class151.field2765[var7 + 1];
                            if (class11.field152 <= 0) {
                                class11.field152 = 205;
                            }
                            continue;
                        }
                        if (var514 == 6201) {
                            var7 -= 2;
                            class194.field3307 = (short) class151.field2765[var7];
                            if (class194.field3307 <= 0) {
                                class194.field3307 = 256;
                            }
                            class255.field4286 = (short) class151.field2765[var7 + 1];
                            if (class255.field4286 <= 0) {
                                class255.field4286 = 320;
                            }
                            continue;
                        }
                        if (var514 == 6202) {
                            var7 -= 4;
                            class192.field3282 = (short) class151.field2765[var7];
                            if (class192.field3282 <= 0) {
                                class192.field3282 = 1;
                            }
                            class255.field4296 = (short) class151.field2765[var7 + 1];
                            if (class255.field4296 <= 0) {
                                class255.field4296 = 32767;
                            } else if (class255.field4296 < class192.field3282) {
                                class255.field4296 = class192.field3282;
                            }
                            class50.field780 = (short) class151.field2765[var7 + 2];
                            if (class50.field780 <= 0) {
                                class50.field780 = 1;
                            }
                            class76.field1238 = (short) class151.field2765[var7 + 3];
                            if (class76.field1238 <= 0) {
                                class76.field1238 = 32767;
                            } else if (class50.field780 > class76.field1238) {
                                class76.field1238 = class50.field780;
                            }
                            continue;
                        }
                        if (var514 == 6203) {
                            class46.method283((byte) 126, 0, class46.field717.field1753, class46.field717.field1766, false, 0);
                            class151.field2765[var7++] = class157.field2823;
                            class151.field2765[var7++] = class255.field4291;
                            continue;
                        }
                        if (var514 == 6204) {
                            class151.field2765[var7++] = class194.field3307;
                            class151.field2765[var7++] = class255.field4286;
                            continue;
                        }
                        if (var514 == 6205) {
                            class151.field2765[var7++] = class107.field1690;
                            class151.field2765[var7++] = class11.field152;
                            continue;
                        }
                    } else if (var514 < 6400) {
                        if (var514 == 6300) {
                            class151.field2765[var7++] = (int) (class261.method1765(16299) / 60000L);
                            continue;
                        }
                        if (var514 == 6301) {
                            class151.field2765[var7++] = (int) (class261.method1765(16299) / 86400000L) - 11745;
                            continue;
                        }
                        if (var514 == 6302) {
                            var7 -= 3;
                            int var295 = class151.field2765[var7];
                            int var296 = class151.field2765[var7 + 1];
                            int var297 = class151.field2765[var7 + 2];
                            class251.field4192.clear();
                            class251.field4192.set(11, 12);
                            class251.field4192.set(var297, var296, var295);
                            class151.field2765[var7++] = (int) (class251.field4192.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var514 == 6303) {
                            class251.field4192.clear();
                            class251.field4192.setTime(new Date(class261.method1765(16299)));
                            class151.field2765[var7++] = class251.field4192.get(1);
                            continue;
                        }
                        if (var514 == 6304) {
                            boolean var298 = true;
                            var7--;
                            int var299 = class151.field2765[var7];
                            if (var299 < 0) {
                                var298 = (var299 + 1) % 4 == 0;
                            } else if (var299 < 1582) {
                                var298 = (var299 % 4) == 0;
                            } else if (var299 % 4 != 0) {
                                var298 = false;
                            } else if (var299 % 100 != 0) {
                                var298 = true;
                            } else if ((var299 % 400) != 0) {
                                var298 = false;
                            }
                            class151.field2765[var7++] = var298 ? 1 : 0;
                            continue;
                        }
                    } else if (var514 < 6500) {
                        if (var514 == 6405) {
                            class151.field2765[var7++] = class7.method40((byte) 62) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6406) {
                            class151.field2765[var7++] = class199.method1407((byte) -107) ? 1 : 0;
                            continue;
                        }
                    } else if (var514 < 6600) {
                        if (var514 == 6500) {
                            if (class280.field4662 == 10 && class232.field3900 == 0 && class281.field4680 == 0 && class267.field4522 == 0) {
                                class151.field2765[var7++] = class117.method768(true) == -1 ? 0 : 1;
                                continue;
                            }
                            class151.field2765[var7++] = 1;
                            continue;
                        }
                        if (var514 == 6501) {
                            class88 var300 = class250.method1694(102);
                            if (var300 == null) {
                                class151.field2765[var7++] = -1;
                                class151.field2765[var7++] = 0;
                                class220.field3701[var6++] = class122.field2050;
                                class151.field2765[var7++] = 0;
                                class220.field3701[var6++] = class122.field2050;
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var300.field1386;
                                class151.field2765[var7++] = var300.field480;
                                class220.field3701[var6++] = var300.field1382;
                                class45 var301 = var300.method618(7);
                                class151.field2765[var7++] = var301.field702;
                                class220.field3701[var6++] = var301.field691;
                                class151.field2765[var7++] = var300.field479;
                            }
                            continue;
                        }
                        if (var514 == 6502) {
                            class88 var302 = class17.method94(107);
                            if (var302 == null) {
                                class151.field2765[var7++] = -1;
                                class151.field2765[var7++] = 0;
                                class220.field3701[var6++] = class122.field2050;
                                class151.field2765[var7++] = 0;
                                class220.field3701[var6++] = class122.field2050;
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var302.field1386;
                                class151.field2765[var7++] = var302.field480;
                                class220.field3701[var6++] = var302.field1382;
                                class45 var303 = var302.method618(7);
                                class151.field2765[var7++] = var303.field702;
                                class220.field3701[var6++] = var303.field691;
                                class151.field2765[var7++] = var302.field479;
                            }
                            continue;
                        }
                        if (var514 == 6503) {
                            var7--;
                            int var304 = class151.field2765[var7];
                            if (class280.field4662 == 10 && class232.field3900 == 0 && class281.field4680 == 0 && class267.field4522 == 0) {
                                class151.field2765[var7++] = class231.method1572((byte) -71, var304) ? 1 : 0;
                                continue;
                            }
                            class151.field2765[var7++] = 0;
                            continue;
                        }
                        if (var514 == 6504) {
                            var7--;
                            class143.field2607 = class151.field2765[var7];
                            class123.method823(-21165, class161.field2907);
                            continue;
                        }
                        if (var514 == 6505) {
                            class151.field2765[var7++] = class143.field2607;
                            continue;
                        }
                        if (var514 == 6506) {
                            var7--;
                            int var305 = class151.field2765[var7];
                            class88 var306 = class122.method799((byte) 103, var305);
                            if (var306 == null) {
                                class151.field2765[var7++] = -1;
                                class220.field3701[var6++] = class122.field2050;
                                class151.field2765[var7++] = 0;
                                class220.field3701[var6++] = class122.field2050;
                                class151.field2765[var7++] = 0;
                            } else {
                                class151.field2765[var7++] = var306.field480;
                                class220.field3701[var6++] = var306.field1382;
                                class45 var307 = var306.method618(7);
                                class151.field2765[var7++] = var307.field702;
                                class220.field3701[var6++] = var307.field691;
                                class151.field2765[var7++] = var306.field479;
                            }
                            continue;
                        }
                        if (var514 == 6507) {
                            var7 -= 4;
                            int var308 = class151.field2765[var7];
                            boolean var309 = class151.field2765[var7 + 3] == 1;
                            int var310 = class151.field2765[var7 + 2];
                            boolean var311 = class151.field2765[var7 + 1] == 1;
                            class290.method1925(var310, var309, false, var308, var311);
                            continue;
                        }
                    } else if (var514 < 6700) {
                        if (var514 == 6600) {
                            var7--;
                            class68.field1121 = class151.field2765[var7] == 1;
                            class123.method823(-21165, class161.field2907);
                            continue;
                        }
                        if (var514 == 6601) {
                            class151.field2765[var7++] = class68.field1121 ? 1 : 0;
                            continue;
                        }
                    }
                } else {
                    class112 var77;
                    if (var514 < 2000) {
                        var77 = var46 ? class82.field1326 : class243.field4120;
                    } else {
                        var7--;
                        var77 = class252.method1706(5157, class151.field2765[var7]);
                        var514 -= 1000;
                    }
                    if (var514 == 1300) {
                        var7--;
                        int var78 = class151.field2765[var7] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method752(var78, (byte) 113, class220.field3701[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var514 == 1301) {
                        var7 -= 2;
                        int var79 = class151.field2765[var7 + 1];
                        int var80 = class151.field2765[var7];
                        var77.field1842 = class53.method337((byte) -127, var80, var79);
                        continue;
                    }
                    if (var514 == 1302) {
                        var7--;
                        var77.field1801 = class151.field2765[var7] == 1;
                        continue;
                    }
                    if (var514 == 1303) {
                        var7--;
                        var77.field1765 = class151.field2765[var7];
                        continue;
                    }
                    if (var514 == 1304) {
                        var7--;
                        var77.field1837 = class151.field2765[var7];
                        continue;
                    }
                    if (var514 == 1305) {
                        var6--;
                        var77.field1894 = class220.field3701[var6];
                        continue;
                    }
                    if (var514 == 1306) {
                        var6--;
                        var77.field1777 = class220.field3701[var6];
                        continue;
                    }
                    if (var514 == 1307) {
                        var77.field1922 = null;
                        continue;
                    }
                    if (var514 == 1309) {
                        var7--;
                        int var81 = class151.field2765[var7];
                        var7--;
                        int var82 = class151.field2765[var7];
                        if (var82 >= 1 && var82 <= 10) {
                            var77.method751(var82 - 1, 1, var81);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var513) {
            if (var5.field4523 == null) {
                if (class194.field3305 != 0) {
                    class73.method530(class122.field2050, (byte) 81, 0, class241.field4093);
                }
                class54.method345("CS2 - scr:" + var5.field1117 + " op:" + var11, -128, var513);
            } else {
                class126 var509 = class161.method1191(30, (byte) -119);
                var509.method835(class10.field133, (byte) -10).method835(var5.field4523, (byte) -10);
                for (int var510 = class11.field146 - 1; var510 >= 0; var510--) {
                    var509.method835(class10.field131, (byte) -10).method835(class14.field192[var510].field3185.field4523, (byte) -10);
                }
                if (var11 == 40) {
                    int var511 = var10[var8];
                    var509.method835(class119.field1995, (byte) -10).method835(class195.method1386((byte) 20, var511), (byte) -10);
                }
                if (class194.field3305 != 0) {
                    class73.method530(class122.field2050, (byte) 85, 0, class12.method69(new class126[] { class166.field2963, var5.field4523 }, (byte) 117));
                }
                class54.method345("CS2 - scr:" + var5.field1117 + " op:" + var11 + new String(var509.method860((byte) -49)), -100, var513);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIZB)Ljk;", line = 6459)
    public static final class273 method1254(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        field3043++;
        int var7 = (arg1 << 17) + (arg3 << 19) + (arg4 ? 65536 : 0) + arg0;
        long var8 = (long) arg2 * 3147483667L + (long) var7 * 3849834839L;
        class273 var10 = (class273) class223.field3763.method1173(-19839, var8);
        if (var10 != null) {
            return var10;
        }
        if (arg5 != -59) {
            method1248(-123, (byte) 61);
        }
        class236.field3977 = false;
        class273 var11 = class59.method405(arg3, arg2, arg1, false, arg4, false, (byte) -124, arg0);
        if (var11 != null && !class236.field3977) {
            class223.field3763.method1179(var11, var8, (byte) -72);
        }
        return var11;
    }
}
