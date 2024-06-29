import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class139 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    private int field2529 = 0;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    private int field2541 = -1;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lgk;")
    private class157 field2533 = new class157();

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Z")
    public boolean field2550 = false;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    private int field2532;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[[[I")
    private int[][][] field2528;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    private int field2535;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[Lc;")
    private class106[] field2537;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[J")
    public static long[] field2545 = new long[100];

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field2543 = 0;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "[Lvd;")
    public static class4[] field2542 = new class4[50];

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Lid;")
    private static class149 field2536 = class60.method382("glow3:", (byte) 111);

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lid;")
    public static class149 field2534 = field2536;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lid;")
    public static class149 field2540 = field2536;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[[I")
    public final int[][] method965(int arg0, int arg1) {
        field2539++;
        if (arg1 < 22) {
            method970(88, (byte) -122, 35, 33, -121, -35, -70, -69);
        }
        if (this.field2535 == this.field2532) {
            this.field2550 = this.field2537[arg0] == null;
            this.field2537[arg0] = class286.field5078;
            return this.field2528[arg0];
        } else if (this.field2532 == 1) {
            this.field2550 = this.field2541 != arg0;
            this.field2541 = arg0;
            return this.field2528[0];
        } else {
            class106 var3 = this.field2537[arg0];
            if (var3 == null) {
                this.field2550 = true;
                if (this.field2529 >= this.field2532) {
                    class106 var4 = (class106) this.field2533.method1128((byte) 83);
                    var3 = new class106(arg0, var4.field1833);
                    this.field2537[var4.field1829] = null;
                    var4.method401((byte) -118);
                } else {
                    var3 = new class106(arg0, this.field2529);
                    this.field2529++;
                }
                this.field2537[arg0] = var3;
            } else {
                this.field2550 = false;
            }
            this.field2533.method1136(var3, (byte) -113);
            return this.field2528[var3.field1833];
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLid;)Z")
    public static final boolean method966(boolean arg0, class149 arg1) {
        field2548++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class49.field892; var2++) {
            if (arg1.method1048(78, class217.field3822[var2])) {
                return true;
            }
        }
        if (!arg0) {
            method968((byte) -98, (int[]) null, (int[]) null, (class127) null, (int[]) null);
        }
        return arg1.method1048(95, class77.field1449.field2243);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method967(int arg0) {
        field2545 = null;
        field2536 = null;
        field2540 = null;
        field2542 = null;
        if (arg0 < -87) {
            field2534 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B[I[ILpb;[I)V")
    public static final void method968(byte arg0, int[] arg1, int[] arg2, class127 arg3, int[] arg4) {
        int var5 = 0;
        int var6 = -58 % ((arg0 + 11) / 62);
        while (var5 < arg1.length) {
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            int var9 = arg4[var5];
            for (int var10 = 0; var9 != 0 && arg3.field2363.length > var10; var10++) {
                if ((var9 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg3.field2363[var10] = null;
                    } else {
                        class164 var11 = class69.method436(var7, -32);
                        int var12 = var11.field3030;
                        class242 var13 = arg3.field2363[var10];
                        if (var13 != null) {
                            if (var13.field4254 == var7) {
                                if (var12 == 0) {
                                    var13 = arg3.field2363[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field4255 = var8;
                                    var13.field4250 = 1;
                                    var13.field4263 = 0;
                                    var13.field4259 = 0;
                                    var13.field4253 = 0;
                                    class94.method686(var11, arg3.field2340, -106, arg3.field2347, class77.field1449 == arg3, 0);
                                } else if (var12 == 2) {
                                    var13.field4259 = 0;
                                }
                            } else if (var11.field3036 >= class69.method436(var13.field4254, -32).field3036) {
                                var13 = arg3.field2363[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class242 var14 = arg3.field2363[var10] = new class242();
                            var14.field4250 = 1;
                            var14.field4253 = 0;
                            var14.field4259 = 0;
                            var14.field4254 = var7;
                            var14.field4263 = 0;
                            var14.field4255 = var8;
                            class94.method686(var11, arg3.field2340, -127, arg3.field2347, class77.field1449 == arg3, 0);
                        }
                    }
                }
                var9 >>>= 0x1;
            }
            var5++;
        }
        field2538++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method969(byte arg0) {
        field2530++;
        if (arg0 != -18) {
            this.method971((byte) 7);
        }
        if (this.field2535 != this.field2532) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2532; var2++) {
            this.field2537[var2] = class286.field5078;
        }
        return this.field2528;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method970(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2531++;
        int var8 = class47.method303(arg5, class94.field1655, class224.field3940, 65535);
        int var9 = class47.method303(arg3, class94.field1655, class224.field3940, 65535);
        int var10 = class47.method303(arg6, class192.field3449, class257.field4496, 65535);
        int var11 = class47.method303(arg0, class192.field3449, class257.field4496, arg1 + 65636);
        if (arg1 != -101) {
            return;
        }
        int var12 = class47.method303(arg4 + arg5, class94.field1655, class224.field3940, 65535);
        int var13 = class47.method303(arg3 - arg4, class94.field1655, class224.field3940, 65535);
        for (int var14 = var8; var14 < var12; var14++) {
            class141.method987(arg1 ^ 0xFFFFFF99, var10, class15.field220[var14], var11, arg2);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class141.method987(2, var10, class15.field220[var15], var11, arg2);
        }
        int var16 = class47.method303(arg4 + arg6, class192.field3449, class257.field4496, 65535);
        int var17 = class47.method303(arg0 - arg4, class192.field3449, class257.field4496, 65535);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class15.field220[var18];
            class141.method987(2, var10, var19, var16, arg2);
            class141.method987(2, var16, var19, var17, arg7);
            class141.method987(2, var17, var19, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public final void method971(byte arg0) {
        field2549++;
        int var2 = 63 / ((-arg0 - 21) / 33);
        for (int var3 = 0; var3 < this.field2532; var3++) {
            this.field2528[var3][0] = null;
            this.field2528[var3][1] = null;
            this.field2528[var3][2] = null;
            this.field2528[var3] = null;
        }
        this.field2537 = null;
        this.field2528 = null;
        this.field2533.method1132((byte) 127);
        this.field2533 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZI)Lce;")
    public static final class216 method972(int arg0, boolean arg1, int arg2) {
        field2547++;
        class216 var3 = (class216) class87.field1580.method639((byte) -64, (long) arg0 | (long) arg2 << 32);
        if (arg1) {
            return null;
        }
        if (var3 == null) {
            var3 = new class216(arg2, arg0);
            class87.field1580.method638((byte) -89, var3, var3.field1148);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public static final void method973(int arg0) {
        class55.field985 &= 0x7FF;
        int var1 = class86.field1569 >> 7;
        if (class57.field1004 < 128) {
            class57.field1004 = 128;
        }
        field2544++;
        int var2 = arg0;
        if (class57.field1004 > 383) {
            class57.field1004 = 383;
        }
        int var3 = class75.field1351 >> 7;
        int var4 = class287.method1968(class277.field4948, class75.field1351, class86.field1569, (byte) 90);
        if (var3 > 3 && var1 > 3 && var3 < 100 && var1 < 100) {
            for (int var5 = var3 - 4; var5 <= (var3 + 4); var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class277.field4948;
                    if (var7 < 3 && (class69.field1215[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class60.field1080[var7][var5][var6] & 0xFF) * 8 + var4 - class189.field3393[var7][var5][var6];
                    if (var2 < var8) {
                        var2 = var8;
                    }
                }
            }
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class75.field1365 < var9) {
            class75.field1365 += (var9 - class75.field1365) / 24;
        } else if (class75.field1365 > var9) {
            class75.field1365 += (var9 - class75.field1365) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(III)V")
    public class139(int arg0, int arg1, int arg2) {
        this.field2532 = arg0;
        this.field2528 = new int[this.field2532][3][arg2];
        this.field2535 = arg1;
        this.field2537 = new class106[this.field2535];
    }
}
