import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class391 extends class43 {

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "[I")
    public int[] field5332 = new int[1];

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "[I")
    public int[] field5330 = new int[] { -1 };

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "Lih;")
    public static class108 field5329 = new class108(64);

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public static final void method2428(int arg0) {
        if (arg0 == -679020920) {
            field5334++;
            class181.field2112 = null;
            class94.field1108 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z[I[IBI)J")
    private final long method2429(boolean arg0, int[] arg1, int[] arg2, byte arg3, int arg4) {
        field5326++;
        long[] var6 = class116.field1341;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg4 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg4 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg1[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)];
        }
        if (arg3 < 122) {
            field5329 = null;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
    public static final void method2430(byte arg0) {
        class259.method1637(25, (byte) 79);
        field5327++;
        class141.method902((byte) 0);
        if (arg0 == -88) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method2431(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5331++;
        int var9 = -117 % ((59 - arg0) / 59);
        if (class192.method1185(-3201, arg4)) {
            class201.method1239(arg8, -1, arg6, arg3, class362.field4903[arg4], -96, arg1, arg5, arg7, arg2);
        } else if (arg3 == -1) {
            for (int var10 = 0; var10 < 100; var10++) {
                class65.field786[var10] = true;
            }
        } else {
            class65.field786[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BILuo;IZIILbo;ILeq;)Lge;")
    public final class386 method2432(byte arg0, int arg1, class118 arg2, int arg3, boolean arg4, int arg5, int arg6, class156 arg7, int arg8, class434 arg9) {
        field5333++;
        class386 var11 = null;
        int var12 = arg8;
        class437 var13 = null;
        if (arg5 != -1) {
            var13 = class207.method1267(arg5, (byte) -109);
        }
        int[] var14 = this.field5330;
        if (var13 != null && var13.field5991 != null) {
            var14 = new int[var13.field5991.length];
            for (int var15 = 0; var15 < var13.field5991.length; var15++) {
                int var16 = var13.field5991[var15];
                if (var16 >= 0 && this.field5330.length > var16) {
                    var14[var15] = this.field5330[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = 68 / ((arg0 - 23) / 52);
        int var22 = -1;
        int var23 = 0;
        class140 var24 = null;
        class140 var25 = null;
        if (arg7 != null) {
            var12 = arg8 | 0x20;
            int var26 = arg7.field1821[arg3];
            int var27 = var26 >>> 16;
            var24 = class57.method320(-16, var27);
            var20 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method894(var20, 0);
                var17 |= var24.method900((byte) -116, var20);
                var19 |= arg7.field1807;
            }
            if ((arg7.field1816 || class338.field4610) && arg6 != -1 && arg7.field1821.length > arg6) {
                var23 = arg7.field1817[arg3];
                int var28 = arg7.field1821[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class57.method320(-16, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method894(var22, 0);
                    var17 |= var25.method900((byte) -126, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var30 = this.method2429(arg4, var14, arg9 == null ? null : arg9.field5924, (byte) 123, arg5);
        if (class424.field5810 != null) {
            var11 = (class386) class424.field5810.method2295(var30, (byte) 74);
        }
        if (var11 == null || arg2.method721(var11.method1465(), var12) != 0) {
            if (var11 != null) {
                var12 = arg2.method707(var12, var11.method1465());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class131.method843((byte) 5, var14[var34]).method337(arg4, 128)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class402[] var35 = new class402[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class131.method843((byte) 5, var14[var36]).method347((byte) -109, arg4);
                }
            }
            if (var13 != null && var13.field6004 != null) {
                for (int var37 = 0; var37 < var13.field6004.length; var37++) {
                    if (var13.field6004[var37] != null && var35[var37] != null) {
                        int var38 = var13.field6004[var37][0];
                        int var39 = var13.field6004[var37][1];
                        int var40 = var13.field6004[var37][2];
                        int var41 = var13.field6004[var37][3];
                        int var42 = var13.field6004[var37][4];
                        int var43 = var13.field6004[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2501(var42, var43, var41, 20863);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2516(0, var38, var39, var40);
                        }
                    }
                }
            }
            class402 var44 = new class402(var35, var35.length);
            if (arg9 != null) {
                var32 = var12 | 0x2000;
            }
            var11 = arg2.method701(var44, var32, class380.field5182, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg9.field5924[var45] < class50.field579[var45].length) {
                        var11.method1463(class184.field2127[var45], class50.field579[var45][arg9.field5924[var45]]);
                    }
                    if (arg9.field5924[var45] < class345.field4684[var45].length) {
                        var11.method1463(class423.field5793[var45], class345.field4684[var45][arg9.field5924[var45]]);
                    }
                }
            }
            if (class424.field5810 != null) {
                var11.method1460(var12);
                class424.field5810.method2294(var11, (byte) 82, var30);
            }
        }
        if (arg7 == null || var24 == null) {
            return var11;
        } else {
            class386 var46 = var11.method1459((byte) 1, var12, true);
            var46.method2405(var23, arg7.field1807, var24, 0, var25, var22, 65535, var20, arg1 - 1);
            return var46;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIIIZ)V")
    public static final void method2433(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5335++;
        if (class192.method1185(-3201, arg2)) {
            class115.method672(class362.field4903[arg2], arg0 ^ 0xFFFFFF85, arg3, arg1, -1, arg4);
            if (arg0 != -26) {
                method2428(-53);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Z)V")
    public static void method2434(boolean arg0) {
        if (!arg0) {
            method2434(true);
        }
        field5329 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V")
    public static final void method2435(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class285.field3722 = arg4;
        class393.field5357 = arg0;
        class226.field2867 = arg2;
        class399.field5409 = arg1;
        field5328++;
        if (arg3 <= 113) {
            method2431((byte) 85, 62, 76, -128, 54, 47, 29, -91, -18);
        }
    }
}
