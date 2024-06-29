import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class71 extends class152 {

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "Lhh;")
    public static class163 field1334 = null;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "Lhh;")
    public static class163 field1338 = class137.method1065("rot:", 17);

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "[[B")
    public static byte[][] field1351 = new byte[50][];

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
    public static final void method516(byte arg0) {
        field1346++;
        if (arg0 <= 69) {
            field1338 = null;
        }
        client.field2001.method111((byte) -52);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public abstract void method101(int arg0, int arg1);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)Lle;")
    public static final class234 method517(int arg0, int arg1) {
        field1343++;
        class234 var2 = (class234) class128.field2488.method326((long) arg1, (byte) -69);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 0) {
            field1347 = -34;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class125.field2406.method973(1, true, arg1);
        } else {
            var3 = class199.field3569.method973(1, true, arg1 & 0x7FFF);
        }
        class234 var4 = new class234();
        if (var3 != null) {
            var4.method1628(new class81(var3), arg0 + 30772);
        }
        if (arg1 >= 32768) {
            var4.method1627((byte) 119);
        }
        class128.field2488.method328(arg0 + 8690, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLpa;)V")
    public static final void method518(boolean arg0, class123 arg1) {
        class238.field4243 = class181.method1320((byte) 81, class73.field1376, 0, arg1);
        field1341++;
        class239.field4248 = new class242[class238.field4243.length];
        class64.field1080 = new class242[class238.field4243.length];
        class107.field2042 = new class242[class238.field4243.length];
        for (int var2 = 0; var2 < class238.field4243.length; var2++) {
            class238.field4243[var2].method1673();
            class239.field4248[var2] = class238.field4243[var2].method1671();
            class238.field4243[var2].method1673();
            class64.field1080[var2] = class238.field4243[var2].method1671();
            class238.field4243[var2].method1673();
            class107.field2042[var2] = class238.field4243[var2].method1671();
            class238.field4243[var2].method1673();
        }
        class89.field1642 = class73.method539(0, -1, arg1, class122.field2329);
        class262.field4576 = class252.method1719(class259.field4543, -17, 0, arg1);
        class8.field130 = class252.method1719(class93.field1760, -17, 0, arg1);
        class2.field32 = class252.method1719(class164.field3032, -17, 0, arg1);
        class143.field2711 = class252.method1719(class168.field3085, -17, 0, arg1);
        class243.field4303 = class211.method1509(arg0, 0, arg1, class177.field3226);
        class110.field2073 = class211.method1509(arg0, 0, arg1, class256.field4477);
        client.field2003 = class178.method1313(0, arg1, (byte) 104, class169.field3094);
        class11.field175 = class211.method1509(arg0, 0, arg1, class252.field4409);
        class186.field3410 = class211.method1509(arg0, 0, arg1, class203.field3685);
        class243.field4301 = class36.method265(arg1, class235.field4204, 0, -1);
        class72.field1354 = class36.method265(arg1, class253.field4439, 0, -1);
        class43.field739.method590(class72.field1354, (int[]) null);
        class12.field192.method590(class72.field1354, (int[]) null);
        class216.field3932.method590(class72.field1354, (int[]) null);
        class105 var3 = class127.method1004((byte) 4, arg1, 0, field1347);
        var3.method844();
        class231.field4133 = var3;
        class105[] var4 = class73.method539(0, -1, arg1, class145.field2749);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method844();
        }
        class192.field3515 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        for (int var10 = 0; var10 < class89.field1642.length; var10++) {
            class89.field1642[var10].method848(var6 + var8, var7 + var8, var8 + var9);
        }
        class238.field4243[0].method1674(var6 + var8, var7 + var8, var9 + var8);
        class183.field3370 = class89.field1642;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)V")
    public abstract void method519(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
    public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1340++;
        int var6 = this.field1339 << 3;
        if (arg3 != 0) {
            this.method103(95, -108, -107, 115, -68, 91);
        }
        int var7 = (arg0 << 4) + (var6 & 0xF);
        int var8 = this.field1345 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        this.method103(var6, var8, var7, var9, arg4, arg2);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBIIII)V")
    public static final void method521(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1350++;
        int var6 = arg5 - arg3;
        int var7 = arg2 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class250.method1707(arg3, arg5, arg4, -115, arg0);
            }
        } else if (var6 == 0) {
            class153.method1133(arg3, arg4, arg0, arg2, 31420);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (arg1 > -20) {
                field1338 = null;
            }
            if (var8) {
                int var9 = arg0;
                arg0 = arg3;
                int var10 = arg2;
                arg2 = arg5;
                arg5 = var10;
                arg3 = var9;
            }
            if (arg2 < arg0) {
                int var11 = arg0;
                arg0 = arg2;
                arg2 = var11;
                int var12 = arg3;
                arg3 = arg5;
                arg5 = var12;
            }
            int var13 = arg3;
            int var14 = arg2 - arg0;
            int var15 = -(var14 >> 1);
            int var16 = arg5 - arg3;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg3 < arg5 ? 1 : -1;
            if (var8) {
                for (int var18 = arg0; var18 <= arg2; var18++) {
                    var15 += var16;
                    class85.field1605[var18][var13] = arg4;
                    if (var15 > 0) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg2; var19++) {
                    var15 += var16;
                    class85.field1605[var13][var19] = arg4;
                    if (var15 > 0) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIII)V")
    public abstract void method522(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)V")
    public abstract void method106(int arg0, int arg1);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
    public abstract void method102(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZIIIZ)V")
    public static final void method523(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class103.field1983 = (short) arg2;
        field1342++;
        class33.field506 = (short) arg0;
        if (!arg5) {
            field1349 = 63;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIII)V")
    public abstract void method97(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
    public static void method524(byte arg0) {
        field1338 = null;
        field1334 = null;
        if (arg0 != 89) {
            field1351 = null;
        }
        field1351 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lpg;Lhh;B)I")
    public static final int method525(class81 arg0, class163 arg1, byte arg2) {
        if (arg2 != -37) {
            field1334 = null;
        }
        int var3 = arg0.field1541;
        field1335++;
        arg0.method648(arg1.field2990, false);
        arg0.field1541 += class174.field3171.method447(arg1.field3020, arg1.field2990, 0, (byte) 62, arg0.field1562, arg0.field1541);
        return arg0.field1541 - var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([IIIIII)V")
    public static final void method526(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class144 var6 = class259.field4542[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class29 var7 = var6.field2737;
        if (var7 != null) {
            int var8 = var7.field444;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class47 var10 = var6.field2733;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field780;
        int var12 = var10.field795;
        int var13 = var10.field797;
        int var14 = var10.field791;
        int[] var15 = class110.field2080[var11];
        int[] var16 = class97.field1829[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}
