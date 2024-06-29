import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class63 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    private int field1284 = 0;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    private int field1295 = -1;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Ldg;")
    private class317 field1299 = new class317();

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Z")
    public boolean field1304 = false;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "[[I")
    private int[][] field1291;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "[Loj;")
    private class322[] field1289;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lud;")
    public static class279 field1296 = class130.method1024(")2", 255);

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Lhc;")
    public static class171 field1297 = new class171(64);

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)[I", line = 7)
    public final int[] method549(int arg0, boolean arg1) {
        field1288++;
        if (!arg1) {
            this.field1304 = true;
        }
        if (this.field1290 == this.field1285) {
            this.field1304 = this.field1289[arg0] == null;
            this.field1289[arg0] = class50.field1039;
            return this.field1291[arg0];
        } else if (this.field1285 == 1) {
            this.field1304 = this.field1295 != arg0;
            this.field1295 = arg0;
            return this.field1291[0];
        } else {
            class322 var3 = this.field1289[arg0];
            if (var3 == null) {
                this.field1304 = true;
                if (this.field1284 < this.field1285) {
                    var3 = new class322(arg0, this.field1284);
                    this.field1284++;
                } else {
                    class322 var4 = (class322) this.field1299.method2245(-101);
                    var3 = new class322(arg0, var4.field5624);
                    this.field1289[var4.field5629] = null;
                    var4.method2221(true);
                }
                this.field1289[arg0] = var3;
            } else {
                this.field1304 = false;
            }
            this.field1299.method2249(var3, (byte) 100);
            return this.field1291[var3.field5624];
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)[[I", line = 75)
    public final int[][] method550(byte arg0) {
        field1292++;
        if (this.field1290 != this.field1285) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 < 5) {
            field1296 = (class279) null;
        }
        for (int var2 = 0; var2 < this.field1285; var2++) {
            this.field1289[var2] = class50.field1039;
        }
        return this.field1291;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 97)
    public static final void method551(int arg0) {
        if (class202.field3603 != null) {
            class202.field3603.method2024(-1);
            class202.field3603 = null;
        }
        field1301++;
        class152.method1203(false);
        class52.method435();
        for (int var1 = 0; var1 < 4; var1++) {
            class90.field1702[var1].method981(5);
        }
        class85.method733(false, -1);
        System.gc();
        class126.method1014(1, 2);
        class204.field3634 = false;
        class125.field2292 = -1;
        class140.method1081(true, 98);
        class12.field396 = 0;
        class112.field2058 = 0;
        class274.field4875 = 0;
        class64.field1312 = 0;
        class255.field4554 = false;
        for (int var2 = 0; var2 < class268.field4807.length; var2++) {
            class268.field4807[var2] = null;
        }
        class103.field1931 = 0;
        class26.field626 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class96.field1780[var3] = null;
            class249.field4450[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class122.field2196[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class276.field4890[var5][var6][var7] = null;
                }
            }
        }
        class84.method727(66);
        class230.field4021 = 0;
        if (arg0 > -40) {
            field1302 = 45;
        }
        class31.method291(0);
        class133.method1043(true, false);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 188)
    public static final void method552(int arg0, int arg1) {
        class191 var2 = class24.field619[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class191 var4 = class24.field619[var3][arg0][arg1] = class24.field619[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3458--;
                for (int var5 = 0; var5 < var4.field3451; var5++) {
                    class18 var6 = var4.field3455[var5];
                    if ((var6.field546 >> 29 & 0x3L) == 2L && var6.field560 == arg0 && var6.field564 == arg1) {
                        var6.field557--;
                    }
                }
            }
        }
        if (class24.field619[0][arg0][arg1] == null) {
            class24.field619[0][arg0][arg1] = new class191(0, arg0, arg1);
        }
        class24.field619[0][arg0][arg1].field3464 = var2;
        class24.field619[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V", line = 230)
    public static final void method553(byte arg0) {
        class8.field155.method1334((byte) -25);
        if (arg0 != 11) {
            field1296 = (class279) null;
        }
        field1287++;
        class169.field3058.method1334((byte) -25);
        class283.field5052.method1334((byte) -25);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(III)V", line = 555)
    public class63(int arg0, int arg1, int arg2) {
        this.field1285 = arg0;
        this.field1291 = new int[this.field1285][arg2];
        this.field1290 = arg1;
        this.field1289 = new class322[this.field1290];
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 251)
    public static void method554(int arg0) {
        field1297 = null;
        if (arg0 != -1) {
            field1296 = (class279) null;
        }
        field1296 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIII)V", line = 270)
    public static final void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class15.method135(-36, arg4);
        field1294++;
        int var7 = 0;
        int var8 = arg4 - arg1;
        if (var8 < arg3) {
            var8 = 0;
        }
        int var9 = -arg4;
        int var10 = arg4;
        int var11 = -1;
        int var12 = var8;
        int var13 = -var8;
        int[] var14 = class182.field3348[arg0];
        int var15 = -1;
        int var16 = arg5 + var8;
        int var17 = arg5 - var8;
        class152.method1208(arg5 - arg4, arg6, var17, var14, -7);
        class152.method1208(var17, arg2, var16, var14, arg3 ^ 0xFFFFFFF9);
        class152.method1208(var16, arg6, arg5 + arg4, var14, arg3 ^ 0xFFFFFFF9);
        while (var10 > var7) {
            var11 += 2;
            var9 += var11;
            var15 += 2;
            var13 += var15;
            if (var13 >= 0 && var12 >= 1) {
                class238.field4176[var12] = var7;
                var12--;
                var13 -= var12 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var10 >= var8) {
                    int[] var18 = class182.field3348[arg0 + var10];
                    int[] var19 = class182.field3348[arg0 - var10];
                    int var20 = arg5 - var7;
                    int var21 = arg5 + var7;
                    class152.method1208(var20, arg6, var21, var18, -7);
                    class152.method1208(var20, arg6, var21, var19, -7);
                } else {
                    int[] var22 = class182.field3348[arg0 + var10];
                    int var23 = class238.field4176[var10];
                    int[] var24 = class182.field3348[arg0 - var10];
                    int var25 = arg5 - var7;
                    int var26 = arg5 - var23;
                    class152.method1208(var25, arg6, var26, var22, -7);
                    int var27 = arg5 + var23;
                    class152.method1208(var26, arg2, var27, var22, -7);
                    int var28 = arg5 + var7;
                    class152.method1208(var27, arg6, var28, var22, -7);
                    class152.method1208(var25, arg6, var26, var24, -7);
                    class152.method1208(var26, arg2, var27, var24, -7);
                    class152.method1208(var27, arg6, var28, var24, -7);
                }
            }
            int[] var29 = class182.field3348[arg0 - var7];
            int[] var30 = class182.field3348[arg0 + var7];
            int var31 = arg5 - var10;
            int var32 = arg5 + var10;
            if (var8 <= var7) {
                class152.method1208(var31, arg6, var32, var30, -7);
                class152.method1208(var31, arg6, var32, var29, -7);
            } else {
                int var33 = var7 <= var12 ? var12 : class238.field4176[var7];
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class152.method1208(var31, arg6, var35, var30, arg3 ^ 0xFFFFFFF9);
                class152.method1208(var35, arg2, var34, var30, -7);
                class152.method1208(var34, arg6, var32, var30, arg3 ^ 0xFFFFFFF9);
                class152.method1208(var31, arg6, var35, var29, -7);
                class152.method1208(var35, arg2, var34, var29, -7);
                class152.method1208(var34, arg6, var32, var29, arg3 ^ 0xFFFFFFF9);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 394)
    public final void method556(int arg0) {
        field1286++;
        for (int var2 = 0; var2 < this.field1285; var2++) {
            this.field1291[var2] = null;
        }
        this.field1289 = null;
        this.field1291 = (int[][]) null;
        this.field1299.method2243(arg0 - 12432);
        this.field1299 = null;
        if (arg0 != 12536) {
            this.method549(112, false);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(JB)V", line = 419)
    public static final void method557(long arg0, byte arg1) {
        if (arg1 <= 40) {
            return;
        }
        field1293++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class194.field3498; var3++) {
            if (class59.field1250[var3] == arg0) {
                class184.field3378++;
                class194.field3498--;
                for (int var4 = var3; var4 < class194.field3498; var4++) {
                    class59.field1250[var4] = class59.field1250[var4 + 1];
                    class248.field4417[var4] = class248.field4417[var4 + 1];
                }
                class162.field2923 = class249.field4443;
                class314.field5534.method1634(209, 0);
                class314.field5534.method490(arg0, 14886);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)V", line = 476)
    public static final void method558(int arg0, byte arg1, int arg2) {
        field1300++;
        int var3 = -21 % ((arg1 - 28) / 55);
        class104 var4 = class293.method2085(12, arg0, false);
        var4.method879(0);
        var4.field1966 = arg2;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V", line = 490)
    public static final void method559(int arg0) {
        field1303++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class194.field3488 - 1; var2++) {
                if (class271.field4828[var2] < 1000 && class271.field4828[var2 + 1] > 1000) {
                    var1 = false;
                    class279 var3 = class184.field3373[var2];
                    class184.field3373[var2] = class184.field3373[var2 + 1];
                    class184.field3373[var2 + 1] = var3;
                    class279 var4 = class171.field3089[var2];
                    class171.field3089[var2] = class171.field3089[var2 + 1];
                    class171.field3089[var2 + 1] = var4;
                    int var5 = class212.field3722[var2];
                    class212.field3722[var2] = class212.field3722[var2 + 1];
                    class212.field3722[var2 + 1] = var5;
                    int var6 = class304.field5400[var2];
                    class304.field5400[var2] = class304.field5400[var2 + 1];
                    class304.field5400[var2 + 1] = var6;
                    int var7 = class75.field1469[var2];
                    class75.field1469[var2] = class75.field1469[var2 + 1];
                    class75.field1469[var2 + 1] = var7;
                    short var8 = class271.field4828[var2];
                    class271.field4828[var2] = class271.field4828[var2 + 1];
                    class271.field4828[var2 + 1] = var8;
                    long var9 = class154.field2790[var2];
                    class154.field2790[var2] = class154.field2790[var2 + 1];
                    class154.field2790[var2 + 1] = var9;
                }
            }
        }
        if (arg0 != 32483) {
            method554(-114);
        }
    }
}
