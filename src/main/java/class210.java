import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class210 {

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public int field2696 = -1;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field2710 = 0;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "[I")
    public static int[] field2697 = new int[4096];

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    private int field2712;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "J")
    private long field2694;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "J")
    private long field2701;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "Z")
    public boolean field2706;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "[I")
    private int[] field2709;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "[I")
    public int[] field2714;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[[I")
    private int[][] field2705;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static void method1342(int arg0) {
        field2697 = null;
        if (arg0 != 5) {
            field2697 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)I")
    public static final int method1343(int arg0, int arg1, int arg2) {
        field2695++;
        if (arg1 != 16) {
            method1343(5, -44, -60);
        }
        int var3 = class333.method1921((byte) 91, arg0 - 1, arg2 + -1) + class333.method1921((byte) 127, arg0 + 1, arg2 + -1) - (-class333.method1921((byte) 89, arg0 + -1, arg2 - -1) - class333.method1921((byte) 119, arg0 + 1, arg2 + 1));
        int var4 = class333.method1921((byte) 123, arg0 - 1, arg2) + (class333.method1921((byte) 89, arg0 + 1, arg2) + class333.method1921((byte) 105, arg0, arg2 - 1) + class333.method1921((byte) 100, arg0, arg2 + 1));
        int var5 = class333.method1921((byte) 100, arg0, arg2);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lse;BLoa;Laf;Ljq;IILie;Lbb;Lgf;II)Lba;")
    public final class107 method1344(class4 arg0, byte arg1, class43 arg2, class33 arg3, class348 arg4, int arg5, int arg6, class567 arg7, class196 arg8, class61 arg9, int arg10, int arg11) {
        field2703++;
        if (this.field2696 != -1) {
            return arg9.method519(this.field2696, 0).method3829(arg0, arg2, arg4, arg11, arg5, arg10, 88, arg7, arg6);
        }
        int var13 = arg6;
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg4.field4463[arg11];
            var13 = arg6 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class63 var25 = arg7.method3034(-98, var23);
            if (var25 != null) {
                var15 |= var25.method530(var24, 94);
                var14 |= var25.method532(var24, (byte) 89);
                var17 |= var25.method531(5858, var24);
                var16 |= arg4.field4448;
            }
            if ((arg4.field4459 || class673.field9330) && arg10 != -1 && arg4.field4463.length > arg10) {
                int var26 = arg4.field4463[arg10];
                int var27 = var26 >>> 16;
                class63 var28 = var23 == var27 ? var25 : arg7.method3034(-24, var27);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method530(var29, 100);
                    var14 |= var28.method532(var29, (byte) 118);
                    var17 |= var28.method531(5858, var29);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class668 var30 = class201.field2622;
        class107 var31;
        synchronized (class201.field2622) {
            var31 = (class107) class201.field2622.method3655(-111, this.field2701);
        }
        if (var31 == null || arg2.method377(var31.method796(), var13) != 0) {
            if (var31 != null) {
                var13 = arg2.method370(var13, var31.method796());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field2709[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg3.method263((byte) -124, var35 & 0x3FFFFFFF).method2775(81)) {
                        var33 = true;
                    }
                } else if (!arg8.method1292(0, var35 & 0x3FFFFFFF).method3780(118, this.field2706)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class645[] var36 = new class645[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field2709[var38];
                if ((var39 & 0x40000000) != 0) {
                    class645 var40 = arg8.method1292(0, var39 & 0x3FFFFFFF).method3786(12, this.field2706);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class645 var41 = arg3.method263((byte) -90, var39 & 0x3FFFFFFF).method2777(2);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class645 var42 = new class645(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg2.method410(var42, var43, class636.field8867, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class432.field5579.length; var45++) {
                    if (class432.field5579[var45][var44].length > this.field2714[var44]) {
                        var31.method829(class524.field6828[var45][var44], class432.field5579[var45][var44][this.field2714[var44]]);
                    }
                }
            }
            var31.method825(var13);
            class668 var46 = class201.field2622;
            synchronized (class201.field2622) {
                class201.field2622.method3650(this.field2701, -103, var31);
            }
        }
        if (arg4 == null) {
            return var31;
        } else {
            var31.method479((byte) 4, var13, true);
            return arg1 < 102 ? null : arg4.method2004(arg5, arg11, (byte) 118, arg10, arg6, var31);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)V")
    public final void method1345(byte arg0, int arg1, int arg2) {
        int var4 = -76 % ((arg0 + 54) / 57);
        field2704++;
        this.field2714[arg1] = arg2;
        this.method1348(true);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILjq;Lie;IIIILoa;ILaf;I)Lba;")
    public final class107 method1346(int arg0, int arg1, class348 arg2, class567 arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8, int arg9, class33 arg10, int arg11) {
        field2700++;
        int var13 = arg0;
        if (arg2 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg0 | 0x20;
            Object var21 = null;
            int var22 = arg2.field4463[arg6];
            int var23 = var22 >>> 16;
            class63 var24 = arg3.method3034(-44, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method530(var25, 112);
                var14 |= var24.method532(var25, (byte) 102);
                var17 |= var24.method531(5858, var25);
                var16 |= arg2.field4448;
            }
            if ((arg2.field4459 || class673.field9330) && arg9 != -1 && arg2.field4463.length > arg9) {
                int var26 = arg2.field4463[arg9];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class63 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg3.method3034(-26, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method530(var28, 102);
                    var14 |= var29.method532(var28, (byte) 105);
                    var17 |= var29.method531(5858, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg5 | (long) (arg4 << 16) | (long) arg7 << 32;
        class668 var32 = class201.field2622;
        class107 var33;
        synchronized (class201.field2622) {
            var33 = (class107) class201.field2622.method3655(-111, var30);
        }
        if (var33 == null || arg8.method377(var33.method796(), var13) != 0) {
            if (var33 != null) {
                var13 = arg8.method370(var13, var33.method796());
            }
            class645[] var35 = new class645[3];
            int var36 = 0;
            if (!arg10.method263((byte) -124, arg5).method2775(98) || !arg10.method263((byte) 123, arg4).method2775(90) || !arg10.method263((byte) -67, arg7).method2775(80)) {
                return null;
            }
            class645 var37 = arg10.method263((byte) 104, arg5).method2777(2);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class645 var38 = arg10.method263((byte) -103, arg4).method2777(2);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class645 var39 = arg10.method263((byte) -86, arg7).method2777(2);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class645 var41 = new class645(var35, var36);
            var33 = arg8.method410(var41, var40, class636.field8867, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class432.field5579.length; var43++) {
                    if (this.field2714[var42] < class432.field5579[var43][var42].length) {
                        var33.method829(class524.field6828[var43][var42], class432.field5579[var43][var42][this.field2714[var42]]);
                    }
                }
            }
            var33.method825(var13);
            class668 var44 = class201.field2622;
            synchronized (class201.field2622) {
                class201.field2622.method3650(var30, -108, var33);
            }
        }
        if (arg2 == null) {
            return var33;
        } else {
            class107 var45 = var33.method479((byte) 4, var13, true);
            class107 var46 = arg2.method2004(arg11, arg6, (byte) 118, arg9, arg0, var45);
            int var47 = 50 % ((49 - arg1) / 58);
            return var46;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI[I[IIB)V")
    public final void method1347(boolean arg0, int arg1, int[] arg2, int[] arg3, int arg4, byte arg5) {
        if (this.field2712 != arg4) {
            this.field2705 = null;
            this.field2712 = arg4;
        }
        this.field2709 = arg3;
        this.field2706 = arg0;
        this.field2714 = arg2;
        field2702++;
        int var7 = -68 % ((-arg5 - 43) / 48);
        this.field2696 = arg1;
        this.method1348(true);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
    private final void method1348(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2699++;
        this.field2701 = -1L;
        long[] var2 = class64.field878;
        this.field2701 = this.field2701 >>> 8 ^ var2[(int) ((this.field2701 ^ (long) (this.field2712 >> 8)) & 0xFFL)];
        this.field2701 = var2[(int) ((this.field2701 ^ (long) this.field2712) & 0xFFL)] ^ this.field2701 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field2701 = this.field2701 >>> 8 ^ var2[(int) ((this.field2701 ^ (long) (this.field2709[var3] >> 24)) & 0xFFL)];
            this.field2701 = var2[(int) ((this.field2701 ^ (long) (this.field2709[var3] >> 16)) & 0xFFL)] ^ this.field2701 >>> 8;
            this.field2701 = this.field2701 >>> 8 ^ var2[(int) ((this.field2701 ^ (long) (this.field2709[var3] >> 8)) & 0xFFL)];
            this.field2701 = var2[(int) ((this.field2701 ^ (long) this.field2709[var3]) & 0xFFL)] ^ this.field2701 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field2701 = this.field2701 >>> 8 ^ var2[(int) (((long) this.field2714[var4] ^ this.field2701) & 0xFFL)];
        }
        this.field2701 = this.field2701 >>> 8 ^ var2[(int) ((this.field2701 ^ (long) (this.field2706 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([Lmq;ILjq;Loa;ILjq;Lse;ILaf;Lkv;IILie;IZIILgf;Lbb;)Lba;")
    public final class107 method1349(class71[] arg0, int arg1, class348 arg2, class43 arg3, int arg4, class348 arg5, class4 arg6, int arg7, class33 arg8, class16 arg9, int arg10, int arg11, class567 arg12, int arg13, boolean arg14, int arg15, int arg16, class61 arg17, class196 arg18) {
        field2713++;
        if (this.field2696 != -1) {
            return arg17.method519(this.field2696, 0).method3824(arg5, arg7, arg1, arg11, arg15, arg3, arg12, arg2, arg13, arg16, (byte) -54, arg6, arg0, arg10, arg9);
        }
        int var20 = arg7;
        long var21 = this.field2701;
        int[] var23 = this.field2709;
        if (arg2 != null && (arg2.field4450 >= 0 || arg2.field4442 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field2709[var24];
            }
            if (arg2.field4450 >= 0) {
                if (arg2.field4450 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class131.method954(arg2.field4450, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg2.field4442 >= 0) {
                if (arg2.field4442 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class131.method954(arg2.field4442, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg2 != null || arg5 != null;
        int var29 = arg0 == null ? 0 : arg0.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class374.field4790[var30] = null;
            if (arg0[var30] != null) {
                class348 var31 = arg12.method3031(arg4 ^ 0x73DBD854, arg0[var30].field968);
                if (var31.field4463 != null) {
                    var28 = true;
                    class600.field8095[var30] = var31;
                    int var32 = arg0[var30].field962;
                    int var33 = arg0[var30].field960;
                    int var34 = var31.field4463[var32];
                    class374.field4790[var30] = arg12.method3034(-50, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class594.field8030[var30] = var35;
                    if (class374.field4790[var30] != null) {
                        var26 |= class374.field4790[var30].method530(var35, arg4 + 1943787612);
                        var25 |= class374.field4790[var30].method532(var35, (byte) 99);
                        var27 |= class374.field4790[var30].method531(arg4 ^ 0x8C24310C, var35);
                    }
                    if ((var31.field4459 || class673.field9330) && var33 != -1 && var31.field4463.length > var33) {
                        class638.field8888[var30] = var31.field4453[var32];
                        class159.field1988[var30] = arg0[var30].field969;
                        int var36 = var31.field4463[var33];
                        class419.field5425[var30] = arg12.method3034(-95, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class366.field4728[var30] = var37;
                        if (class419.field5425[var30] != null) {
                            var26 |= class419.field5425[var30].method530(var37, 54);
                            var25 |= class419.field5425[var30].method532(var37, (byte) 94);
                            var27 |= class419.field5425[var30].method531(5858, var37);
                        }
                    } else {
                        class638.field8888[var30] = 0;
                        class159.field1988[var30] = 0;
                        class419.field5425[var30] = null;
                        class366.field4728[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        if (arg4 != -1943787538) {
            return null;
        }
        int var40 = 0;
        class63 var41 = null;
        class63 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class63 var46 = null;
        class63 var47 = null;
        if (var28) {
            if (arg2 != null) {
                int var48 = arg2.field4463[arg10];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg12.method3034(-92, var49);
                if (var41 != null) {
                    var26 |= var41.method530(var38, 77);
                    var25 |= var41.method532(var38, (byte) 91);
                    var27 |= var41.method531(5858, var38);
                }
                if ((arg2.field4459 || class673.field9330) && arg13 != -1 && arg13 < arg2.field4463.length) {
                    var40 = arg2.field4453[arg10];
                    int var50 = arg2.field4463[arg13];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg12.method3034(-120, var51);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method530(var39, 83);
                        var25 |= var42.method532(var39, (byte) 125);
                        var27 |= var42.method531(5858, var39);
                    }
                }
            }
            var20 = arg7 | 0x20;
            if (arg5 != null) {
                int var52 = arg5.field4463[arg1];
                int var53 = var52 >>> 16;
                var46 = arg12.method3034(-22, var53);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method530(var43, arg4 + 1943787635);
                    var25 |= var46.method532(var43, (byte) 98);
                    var27 |= var46.method531(arg4 ^ 0x8C24310C, var43);
                }
                if ((arg5.field4459 || class673.field9330) && arg11 != -1 && arg11 < arg5.field4463.length) {
                    int var54 = arg5.field4463[arg11];
                    var45 = arg5.field4453[arg1];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg12.method3034(-109, var55);
                    if (var47 != null) {
                        var26 |= var47.method530(var44, arg4 + 1943787639);
                        var25 |= var47.method532(var44, (byte) 121);
                        var27 |= var47.method531(arg4 + 1943793396, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class668 var56 = class207.field2671;
        class107 var57;
        synchronized (class207.field2671) {
            var57 = (class107) class207.field2671.method3655(-126, var21);
        }
        class501 var58 = null;
        if (this.field2712 != -1) {
            var58 = arg9.method92(this.field2712, (byte) 24);
        }
        if (var57 == null || arg3.method377(var57.method796(), var20) != 0 || var58 != null && var58.field6614 != null && this.field2705 == null) {
            if (var57 != null) {
                var20 = arg3.method370(var20, var57.method796());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg8.method263((byte) 126, var62 & 0x3FFFFFFF).method2773(false)) {
                        var60 = true;
                    }
                } else if (!arg18.method1292(0, var62 & 0x3FFFFFFF).method3785(43, this.field2706)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field2694 != -1L) {
                    class668 var89 = class207.field2671;
                    synchronized (class207.field2671) {
                        var57 = (class107) class207.field2671.method3655(-127, this.field2694);
                    }
                }
                if (var57 == null || arg3.method377(var57.method796(), var20) != 0 || var58 != null && var58.field6614 != null && this.field2705 == null) {
                    return null;
                }
            } else {
                class645[] var63 = new class645[12];
                for (int var64 = 0; var64 < 12; var64++) {
                    int var65 = var23[var64];
                    if ((var65 & 0x40000000) != 0) {
                        class645 var66 = arg18.method1292(0, var65 & 0x3FFFFFFF).method3789(this.field2706, arg4 + 1943806320);
                        if (var66 != null) {
                            var63[var64] = var66;
                        }
                    } else if ((Integer.MIN_VALUE & var65) != 0) {
                        class645 var67 = arg8.method263((byte) 127, var65 & 0x3FFFFFFF).method2772((byte) -110);
                        if (var67 != null) {
                            var63[var64] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field6614 != null) {
                    for (int var68 = 0; var68 < var58.field6614.length; var68++) {
                        if (var58.field6614[var68] != null && var63[var68] != null) {
                            int var69 = var58.field6614[var68][0];
                            int var70 = var58.field6614[var68][1];
                            int var71 = var58.field6614[var68][2];
                            int var72 = var58.field6614[var68][3] << 3;
                            int var73 = var58.field6614[var68][4] << 3;
                            int var74 = var58.field6614[var68][5] << 3;
                            if (this.field2705 == null) {
                                this.field2705 = new int[var58.field6614.length][];
                            }
                            if (this.field2705[var68] == null) {
                                int[] var75 = this.field2705[var68] = new int[15];
                                if (var72 == 0 && var73 == 0 && var74 == 0) {
                                    var75[12] = -var69;
                                    var75[0] = var75[4] = var75[8] = 32768;
                                    var75[13] = -var70;
                                    var75[14] = -var71;
                                } else {
                                    int var76 = class237.field3196[var72];
                                    int var77 = class237.field3193[var72];
                                    int var78 = class237.field3196[var73];
                                    int var79 = class237.field3193[var73];
                                    int var80 = class237.field3196[var74];
                                    int var81 = class237.field3193[var74];
                                    int var82 = var77 * var80 + 8192 >> 14;
                                    int var83 = var77 * var81 + 8192 >> 14;
                                    var75[3] = var76 * var81 + 8192 >> 14;
                                    var75[7] = var78 * var82 + (-var79 * -var81 + 8192) >> 14;
                                    var75[4] = var76 * var80 + 8192 >> 14;
                                    var75[8] = var76 * var78 + 8192 >> 14;
                                    var75[6] = -var79 * var80 + var78 * var83 + 8192 >> 14;
                                    var75[2] = var76 * var79 + 8192 >> 14;
                                    var75[5] = -var77;
                                    var75[1] = -var81 * var78 + var79 * var82 + 8192 >> 14;
                                    var75[0] = var78 * var80 + var79 * var83 + 8192 >> 14;
                                    var75[14] = var75[8] * -var71 + (var75[2] * -var69 + (var75[5] * -var70)) + 8192 >> 14;
                                    var75[13] = var75[7] * -var71 + (var75[1] * -var69 - (-(var75[4] * -var70) - 8192)) >> 14;
                                    var75[12] = var75[0] * -var69 + var75[6] * -var71 + var75[3] * -var70 + 8192 >> 14;
                                }
                                var75[11] = var71;
                                var75[10] = var70;
                                var75[9] = var69;
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var63[var68].method3554(var73, var74, true, var72);
                            }
                            if (var69 != 0 || var70 != 0 || var71 != 0) {
                                var63[var68].method3541(var69, true, var71, var70);
                            }
                        }
                    }
                }
                class645 var84 = new class645(var63, var63.length);
                int var85 = var20 | 0x4000;
                var57 = arg3.method410(var84, var85, class636.field8867, 64, 850);
                for (int var86 = 0; var86 < 5; var86++) {
                    for (int var87 = 0; var87 < class432.field5579.length; var87++) {
                        if (this.field2714[var86] < class432.field5579[var87][var86].length) {
                            var57.method829(class524.field6828[var87][var86], class432.field5579[var87][var86][this.field2714[var86]]);
                        }
                    }
                }
                if (arg14) {
                    var57.method825(var20);
                    class668 var88 = class207.field2671;
                    synchronized (class207.field2671) {
                        class207.field2671.method3650(var21, arg4 + 1943787435, var57);
                    }
                    this.field2694 = var21;
                }
            }
        }
        class107 var90 = var57.method479((byte) 4, var20, true);
        if (!var28) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var91 < var29) {
            if (class374.field4790[var91] != null) {
                var90.method834(false, class374.field4790[var91], (byte) 103, class638.field8888[var91], var92, class419.field5425[var91], this.field2705 == null ? null : this.field2705[var91], 0, class594.field8030[var91], class159.field1988[var91] - 1, class366.field4728[var91]);
            }
            var92 <<= 0x1;
            var91++;
        }
        if (var41 != null && var46 != null) {
            var90.method801(false, var45, arg2.field4451, arg15 - 1, (byte) -42, var43, var42, var47, arg16 - 1, var39, var46, var38, var41, var40, var44);
        } else if (var41 != null) {
            var90.method791(false, var42, var39, arg15 - 1, var38, 0, arg4 ^ 0x8C240EB1, var41, var40);
        } else if (var46 != null) {
            var90.method791(false, var47, var44, arg16 - 1, var43, 0, 10591, var46, var45);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class374.field4790[var93] = null;
            class419.field5425[var93] = null;
            class600.field8095[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILaf;)V")
    public final void method1350(int arg0, int arg1, int arg2, class33 arg3) {
        field2707++;
        int var5 = class431.field5571[arg2];
        if (arg3.method263((byte) 108, arg1) != null) {
            this.field2709[var5] = class131.method954(arg0, arg1);
            this.method1348(true);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILbb;I)V")
    public final void method1351(int arg0, int arg1, class196 arg2, int arg3) {
        if (arg3 != 1073741824) {
            return;
        }
        field2698++;
        if (arg0 == -1) {
            this.field2709[arg1] = 0;
        } else if (arg2.method1292(arg3 - 1073741824, arg0) != null) {
            this.field2709[arg1] = class131.method954(1073741824, arg0);
            this.method1348(true);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BZ)V")
    public final void method1352(byte arg0, boolean arg1) {
        this.field2706 = arg1;
        field2711++;
        this.method1348(true);
        if (arg0 != -13) {
            this.field2709 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V")
    public static final void method1353(int arg0, int arg1, int arg2, int arg3) {
        field2708++;
        int var4 = class100.field1326 + arg1;
        int var5 = class186.field2376 + arg0;
        if (class483.field6438 == null || arg1 < 0 || arg0 < 0 || arg1 >= class611.field8258 || arg0 >= class656.field9155) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg3 << 28 | var4);
        class37 var8 = (class37) class197.field2589.method39(var6, 31750);
        if (var8 == null) {
            class119.method897(arg3, arg1, arg0);
            return;
        }
        class558 var9 = (class558) var8.field542.method2090(true);
        if (var9 == null) {
            class119.method897(arg3, arg1, arg0);
            return;
        }
        class376 var10 = (class376) class119.method897(arg3, arg1, arg0);
        if (var10 == null) {
            var10 = new class376();
        } else {
            var10.field4825 = var10.field4823 = -1;
        }
        var10.field4816 = var9.field7284;
        var10.field4821 = var9.field7283;
        label51: while (true) {
            class558 var11 = (class558) var8.field542.method2088(-152);
            if (var11 == null) {
                break;
            }
            if (var10.field4821 != var11.field7283) {
                var10.field4825 = var11.field7283;
                var10.field4824 = var11.field7284;
                while (true) {
                    class558 var12 = (class558) var8.field542.method2088(-152);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field4821 != var12.field7283 && var10.field4825 != var12.field7283) {
                        var10.field4817 = var12.field7284;
                        var10.field4823 = var12.field7283;
                    }
                }
            }
        }
        if (arg2 == 65535) {
            int var13 = class332.method1916(1218445319, (arg0 << 9) + 256, arg3, (arg1 << 9) + 256);
            class101.method767(arg3, arg1, arg0, var13, var10);
        }
    }
}
