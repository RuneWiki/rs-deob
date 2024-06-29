import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class194 extends class123 {

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    private int field3261 = 0;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    private int field3267 = 0;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    private int field3257 = -32768;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Z")
    public boolean field3271 = false;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    private int field3283;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "Ls;")
    private class96 field3278;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lmh;")
    public static class62 field3255 = class201.method1405(true, ")3runescape)3com");

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[I")
    public static int[] field3264 = new int[2000];

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "[[I")
    public static int[][] field3270 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field3262 = 0;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lmh;")
    public static class62 field3258 = class201.method1405(true, "not yet implemented");

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "[I")
    public static int[] field3285 = new int[32];

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lhi;")
    public static class26 field3260;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Lhi;")
    public static class26 field3277;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)V", line = 7)
    public final void method1358(byte arg0, int arg1) {
        field3275++;
        if (this.field3271) {
            return;
        }
        this.field3261 += arg1;
        while (this.field3278.field1555[this.field3267] < this.field3261) {
            this.field3261 -= this.field3278.field1555[this.field3267];
            this.field3267++;
            if (this.field3278.field1586.length <= this.field3267) {
                this.field3271 = true;
                break;
            }
        }
        if (arg0 != 35) {
            this.field3283 = -82;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIII)V", line = 486)
    public class194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3268 = arg2;
        this.field3281 = arg5 + arg6;
        this.field3279 = arg4;
        this.field3283 = arg0;
        this.field3282 = arg3;
        this.field3274 = arg1;
        int var8 = class115.method895(93, this.field3283).field4611;
        if (var8 == -1) {
            this.field3271 = true;
        } else {
            this.field3271 = false;
            this.field3278 = class151.method1085(var8, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 57)
    public static final void method1359(int arg0) {
        field3266++;
        if (class260.field4377 > 0) {
            class41.method277(true);
            return;
        }
        class140.field2253 = class200.field3381;
        class200.field3381 = null;
        class276.method1889(-128, 40);
        if (arg0 <= 99) {
            field3255 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 78)
    public static final void method1360(byte arg0) {
        if (arg0 != -105) {
            return;
        }
        class105.field1713 = null;
        class159.field2559 = null;
        field3269++;
        class269.field4570 = null;
        class221.field3806 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLmh;)Lka;", line = 92)
    public static final class274 method1361(byte arg0, class62 arg1) {
        field3273++;
        if (arg0 >= -40) {
            method1359(34);
        }
        for (class274 var2 = (class274) class204.field3440.method334(-18673); var2 != null; var2 = (class274) class204.field3440.method335((byte) 104)) {
            if (var2.field4650.method446((byte) 70, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([Lsg;ZI)V", line = 114)
    public static final void method1362(class191[] arg0, boolean arg1, int arg2) {
        field3259++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class191 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3068 == 0) {
                    if (var4.field3180 != null) {
                        method1362(var4.field3180, true, arg2);
                    }
                    class146 var5 = (class146) class214.field3632.method311((byte) 114, (long) var4.field3142);
                    if (var5 != null) {
                        class108.method832(arg2, 0, var5.field2312);
                    }
                }
                if (arg2 == 0 && var4.field3138 != null) {
                    class161 var6 = new class161();
                    var6.field2598 = var4.field3138;
                    var6.field2597 = var4;
                    class262.method1818(var6, 109);
                }
                if (arg2 == 1 && var4.field3157 != null) {
                    if (var4.field3104 >= 0) {
                        class191 var7 = class1.method2(var4.field3142, (byte) -37);
                        if (var7 == null || var7.field3180 == null || var4.field3104 >= var7.field3180.length || var7.field3180[var4.field3104] != var4) {
                            continue;
                        }
                    }
                    class161 var8 = new class161();
                    var8.field2598 = var4.field3157;
                    var8.field2597 = var4;
                    class262.method1818(var8, -113);
                }
            }
        }
        if (!arg1) {
            method1361((byte) -119, (class62) null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILb;I)V", line = 192)
    public static final void method1363(int arg0, int arg1, int arg2, class275 arg3, int arg4) {
        field3256++;
        if (class195.field3293 >= 400) {
            return;
        }
        if (arg3.field4720 != null) {
            arg3 = arg3.method1878(false);
        }
        if (arg3 == null) {
            return;
        }
        if (arg1 < 29) {
            field3264 = (int[]) null;
        }
        if (!arg3.field4708) {
            return;
        }
        class62 var5 = arg3.field4695;
        if (arg3.field4709 != 0) {
            var5 = class254.method1772(new class62[] { var5, class262.method1811(3040, arg3.field4709, class268.field4551.field2441), class260.field4374, class91.field1460, class42.method284(arg3.field4709, -128), class101.field1667 }, 0);
        }
        if (class263.field4429 == 1) {
            class39.method268(true, arg0, arg4, class73.field1113, (short) 4, (long) arg2, class254.method1772(new class62[] { class216.field3671, class173.field2791, var5 }, 0));
            class268.field4562++;
        } else if (!class106.field1728) {
            class122.field2023++;
            class62[] var6 = arg3.field4657;
            if (class29.field383) {
                var6 = class113.method886(var6, (byte) -95);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class131.field2132 != 0 || !var6[var7].method436(class102.field1679, 32))) {
                        class87.field1396++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 57;
                        }
                        if (var7 == 1) {
                            var8 = 34;
                        }
                        if (var7 == 2) {
                            var8 = 31;
                        }
                        if (var7 == 3) {
                            var8 = 25;
                        }
                        if (var7 == 4) {
                            var8 = 16;
                        }
                        class39.method268(true, arg0, arg4, var6[var7], var8, (long) arg2, class254.method1772(new class62[] { class225.field3920, var5 }, 0));
                    }
                }
            }
            if (class131.field2132 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method436(class102.field1679, 32)) {
                        class248.field4220++;
                        short var10 = 0;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 57;
                        }
                        if (var9 == 1) {
                            var11 = 34;
                        }
                        if (arg3.field4709 > class268.field4551.field2441) {
                            var10 = 2000;
                        }
                        if (var9 == 2) {
                            var11 = 31;
                        }
                        if (var9 == 3) {
                            var11 = 25;
                        }
                        if (var9 == 4) {
                            var11 = 16;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class39.method268(true, arg0, arg4, var6[var9], var11, (long) arg2, class254.method1772(new class62[] { class225.field3920, var5 }, 0));
                    }
                }
            }
            class39.method268(true, arg0, arg4, class17.field164, (short) 1002, (long) arg2, class254.method1772(new class62[] { class225.field3920, var5 }, 0));
        } else if ((class141.field2271 & 0x2) == 2) {
            class309.field5297++;
            class39.method268(true, arg0, arg4, class121.field2015, (short) 43, (long) arg2, class254.method1772(new class62[] { class281.field4805, class173.field2791, var5 }, 0));
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIJ)V", line = 360)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3272++;
        class138 var11 = this.method1366(-109);
        if (var11 != null) {
            var11.method276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3257 = var11.method278();
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 387)
    public static void method1364(int arg0) {
        int var1 = 101 / ((5 - arg0) / 35);
        field3277 = null;
        field3270 = (int[][]) null;
        field3264 = null;
        field3260 = null;
        field3255 = null;
        field3258 = null;
        field3285 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()I", line = 402)
    public final int method278() {
        field3284++;
        return this.field3257;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 411)
    public static final void method1365(boolean arg0) {
        field3265++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class195.field3293 - 1; var2++) {
                if (class286.field4892[var2] < 1000 && class286.field4892[var2 + 1] > 1000) {
                    var1 = false;
                    class62 var3 = class244.field4151[var2];
                    class244.field4151[var2] = class244.field4151[var2 + 1];
                    class244.field4151[var2 + 1] = var3;
                    class62 var4 = class146.field2317[var2];
                    class146.field2317[var2] = class146.field2317[var2 + 1];
                    class146.field2317[var2 + 1] = var4;
                    int var5 = class212.field3557[var2];
                    class212.field3557[var2] = class212.field3557[var2 + 1];
                    class212.field3557[var2 + 1] = var5;
                    int var6 = class109.field1766[var2];
                    class109.field1766[var2] = class109.field1766[var2 + 1];
                    class109.field1766[var2 + 1] = var6;
                    short var7 = class286.field4892[var2];
                    class286.field4892[var2] = class286.field4892[var2 + 1];
                    class286.field4892[var2 + 1] = var7;
                    long var8 = class144.field2297[var2];
                    class144.field2297[var2] = class144.field2297[var2 + 1];
                    class144.field2297[var2 + 1] = var8;
                }
            }
        }
        if (!arg0) {
            method1360((byte) 96);
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Lab;", line = 464)
    private final class138 method1366(int arg0) {
        field3276++;
        class271 var2 = class115.method895(63, this.field3283);
        if (arg0 >= -75) {
            this.field3281 = 84;
        }
        class138 var3;
        if (this.field3271) {
            var3 = var2.method1862(true, -1);
        } else {
            var3 = var2.method1862(true, this.field3267);
        }
        return var3 == null ? null : var3;
    }
}
