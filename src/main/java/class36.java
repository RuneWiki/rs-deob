import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class36 {

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lij;")
    public static class50 field693 = class78.method578(125, "0(U");

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field686 = 0;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[Lij;")
    public static class50[] field691 = new class50[500];

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[Lme;")
    public static class141[] field707 = new class141[4];

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static volatile int field708 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Le;")
    public static class86 field685 = new class86();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "J")
    private long field688;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "J")
    private long field700;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Lqj;")
    public static class152 field711;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Z")
    public boolean field697;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[I")
    private int[] field687;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "[I")
    public static int[] field701;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIILig;)Lwg;")
    public final class98 method283(int arg0, int arg1, int arg2, int arg3, class186 arg4) {
        field699++;
        long var6 = (long) arg1 << 32 | (long) (arg0 << 16) | (long) arg1;
        class98 var8 = (class98) class209.field3473.method764((byte) 70, var6);
        if (var8 == null) {
            class202[] var9 = new class202[2];
            int var10 = 0;
            if (!class66.method506((byte) -97, arg1).method861(false) || !class66.method506((byte) -91, arg0).method861(false)) {
                return null;
            }
            class202 var11 = class66.method506((byte) -100, arg1).method864((byte) 13);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class202 var12 = class66.method506((byte) -121, arg0).method864((byte) 13);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class202 var13 = new class202(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class132.field2312[var14].length > this.field687[var14]) {
                    var13.method1358(class220.field3682[var14], class132.field2312[var14][this.field687[var14]]);
                }
                if (class141.field2480[var14].length > this.field687[var14]) {
                    var13.method1358(class136.field2366[var14], class141.field2480[var14][this.field687[var14]]);
                }
            }
            var8 = var13.method1362(64, 768, -50, -10, -50);
            class209.field3473.method765((byte) -126, var8, var6);
        }
        if (arg4 != null) {
            var8 = arg4.method1258(var8, arg2, arg3);
        }
        if (arg2 != 0) {
            method289(108);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIIII)V")
    public static final void method284(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field710++;
        if (arg0 >= -10) {
            field711 = null;
        }
        long var6 = class176.method1212(arg2, arg4, arg1);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x7DC8B) >> 14;
            int var9 = arg3;
            int var10 = (int) var6 >> 20 & 0x3;
            if (var6 > 0L) {
                var9 = arg5;
            }
            int[] var11 = class158.field2729;
            int var12 = (arg4 * 4) + ((103 - arg1) * 4 * 512) + 24624;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class243 var14 = class53.method426((byte) -90, var13);
            if (var14.field4220 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var10 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var10 == 1) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var10 == 2) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 3 + 512] = var9;
                        var11[var12 + 3 + 1024] = var9;
                        var11[var12 + 1536 + 3] = var9;
                    } else if (var10 == 3) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1537] = var9;
                        var11[var12 + 1536 + 2] = var9;
                        var11[var12 + 1539] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var10 == 0) {
                        var11[var12] = var9;
                    } else if (var10 == 1) {
                        var11[var12 + 3] = var9;
                    } else if (var10 == 2) {
                        var11[var12 + 3 + 1536] = var9;
                    } else if (var10 == 3) {
                        var11[var12 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var10 == 3) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var10 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var10 == 1) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 3 + 512] = var9;
                        var11[var12 + 1027] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    } else if (var10 == 2) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1536 + 1] = var9;
                        var11[var12 + 1536 + 2] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    }
                }
            } else {
                class67 var15 = class28.field601[var14.field4220];
                if (var15 != null) {
                    int var16 = (var14.field4223 * 4 - var15.field3431) / 2;
                    int var17 = (var14.field4235 * 4 - var15.field3426) / 2;
                    var15.method516(arg4 * 4 + var16 + 48, (-arg1 + 104 + -var14.field4235) * 4 + var17 + 48);
                }
            }
        }
        long var18 = class2.method5(arg2, arg4, arg1);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class243 var23 = class53.method426((byte) -90, var22);
            if (var23.field4220 != -1) {
                class67 var24 = class28.field601[var23.field4220];
                if (var24 != null) {
                    int var25 = (var23.field4223 * 4 - var24.field3431) / 2;
                    int var26 = (var23.field4235 * 4 - var24.field3426) / 2;
                    var24.method516((arg4 * 4) + var25 + 48, 48 - -((-var23.field4235 + -arg1 + 104) * 4) - -var26);
                }
            } else if (var21 == 9) {
                int[] var27 = class158.field2729;
                int var28 = arg4 * 4 + (((103 - arg1) * 512 * 4) + 24624);
                int var29 = 15658734;
                if (var18 > 0L) {
                    var29 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var27[var28 + 1536] = var29;
                    var27[var28 + 1 + 1024] = var29;
                    var27[var28 + 512 + 2] = var29;
                    var27[var28 + 3] = var29;
                } else {
                    var27[var28] = var29;
                    var27[var28 + 513] = var29;
                    var27[var28 + 1024 + 2] = var29;
                    var27[var28 + 1536 + 3] = var29;
                }
            }
        }
        long var30 = class17.method132(arg2, arg4, arg1);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class243 var33 = class53.method426((byte) -90, var32);
        if (var33.field4220 == -1) {
            return;
        }
        class67 var34 = class28.field601[var33.field4220];
        if (var34 != null) {
            int var35 = (var33.field4223 * 4 - var34.field3431) / 2;
            int var36 = (var33.field4235 * 4 - var34.field3426) / 2;
            var34.method516(var35 + (arg4 * 4) + 48, 48 - -((-arg1 + 104 + -var33.field4235) * 4) + var36);
            return;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
    public final void method285(boolean arg0, int arg1) {
        field696++;
        this.field697 = arg0;
        this.method296(-8417);
        int var3 = 42 % ((arg1 - 26) / 53);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static void method286(boolean arg0) {
        field707 = null;
        field693 = null;
        field691 = null;
        field685 = null;
        if (!arg0) {
            field711 = null;
        }
        field711 = null;
        field701 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
    public static final void method287(boolean arg0) {
        if (arg0) {
            method286(true);
        }
        for (int var1 = 0; var1 < class6.field77; var1++) {
            int var2 = class153.field2678[var1];
            class53 var3 = class41.field764[var2];
            if (var3 != null) {
                class103.method784(0, var3, var3.field959.field1138);
            }
        }
        field698++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BB)V")
    public static final void method288(byte[] arg0, byte arg1) {
        if (arg1 >= -46) {
            field693 = null;
        }
        field683++;
        int var2 = 0;
        while (true) {
            while (var2 < arg0.length) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class90.field1714;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class46.field847;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class155.field2701 && var4 + 64 < class140.field2460) {
                    int var5 = var3 >> 6;
                    int var6 = class140.field2460 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class84.field1624[var5][var6] == null) {
                                    class84.field1624[var5][var6] = new byte[4096];
                                }
                                class84.field1624[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class161.field2766[var5][var6] == null) {
                                    class161.field2766[var5][var6] = new byte[4096];
                                }
                                class161.field2766[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method289(int arg0) {
        field702++;
        class108.method802(true);
        class119.method866(2);
        class71.method538((byte) -123);
        class178.method1220(-48);
        int var1 = 74 % ((arg0 + 23) / 56);
        class120.method873(true);
        class115.method826(110);
        class170.method1184(-126);
        class112.method818(4);
        class87.method696(5);
        class106.method798(2);
        class260.method1750(-1);
        class139.method969((byte) 60);
        class14.method107(1);
        class96.method727((byte) 88);
        ((class220) class13.field309).method1510(-126);
        class141.field2475.method911(-16079);
        class10.field179.method171((byte) 109);
        class219.field3653.method171((byte) 109);
        class71.field1365.method171((byte) 109);
        class124.field2181.method171((byte) 109);
        class142.field2495.method171((byte) 109);
        class56.field1014.method171((byte) 109);
        class97.field1809.method171((byte) 109);
        class24.field530.method171((byte) 109);
        class140.field2451.method171((byte) 109);
        class66.field1264.method171((byte) 109);
        class245.field4265.method171((byte) 109);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
    public final int method290(byte arg0) {
        field706++;
        int var2 = -37 % ((-arg0 - 8) / 55);
        return this.field709 == -1 ? (this.field689[11] << 5) + ((this.field687[4] << 20) + (this.field687[0] << 25) + (this.field689[0] << 15)) - (-(this.field689[8] << 10) - this.field689[1]) : class8.method48(-21178, this.field709).field1142 + 305419896;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILig;I)Lwg;")
    public final class98 method291(int arg0, class186 arg1, int arg2) {
        field703++;
        if (this.field709 != -1) {
            return class8.method48(-21178, this.field709).method482(110, arg1, arg0);
        }
        class98 var4 = (class98) class209.field3473.method764((byte) 70, this.field688);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field689[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class66.method506((byte) -96, var15 & 0x3FFFFFFF).method861(false)) {
                        var5 = true;
                    }
                } else if (!class15.method111(var15 & 0x3FFFFFFF, false).method1622(this.field697, 0)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class202[] var7 = new class202[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field689[var9];
                if ((var12 & 0x40000000) != 0) {
                    class202 var14 = class15.method111(var12 & 0x3FFFFFFF, false).method1619((byte) 107, this.field697);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class202 var13 = class66.method506((byte) -92, var12 & 0x3FFFFFFF).method864((byte) 13);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
            }
            class202 var10 = new class202(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class132.field2312[var11].length > this.field687[var11]) {
                    var10.method1358(class220.field3682[var11], class132.field2312[var11][this.field687[var11]]);
                }
                if (this.field687[var11] < class141.field2480[var11].length) {
                    var10.method1358(class136.field2366[var11], class141.field2480[var11][this.field687[var11]]);
                }
            }
            var4 = var10.method1362(64, 768, -50, -10, -50);
            class209.field3473.method765((byte) -124, var4, this.field688);
        }
        if (arg2 >= -12) {
            this.field697 = false;
        }
        if (arg1 != null) {
            var4 = arg1.method1258(var4, 0, arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI[IZ[I)V")
    public final void method292(boolean arg0, int arg1, int[] arg2, boolean arg3, int[] arg4) {
        if (arg0) {
            this.field687 = null;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class173.field2881; var7++) {
                    class119 var8 = class66.method506((byte) -110, var7);
                    if (var8 != null && !var8.field2097 && var8.field2094 == var6 + (arg3 ? 7 : 0)) {
                        arg4[class54.field966[var6]] = class29.method261(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field709 = arg1;
        this.field697 = arg3;
        field692++;
        this.field687 = arg2;
        this.field689 = arg4;
        this.method296(-8417);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
    public final void method293(int arg0, int arg1, int arg2) {
        if (arg2 != -24163) {
            method284((byte) -108, 99, 105, 107, 113, -110);
        }
        this.field687[arg1] = arg0;
        field694++;
        this.method296(-8417);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
    public final void method294(int arg0, int arg1, int arg2) {
        field705++;
        int var4 = class54.field966[arg0];
        if (this.field689[var4] != 0 && class66.method506((byte) -111, arg1) != null && arg2 == 768) {
            this.field689[var4] = class29.method261(Integer.MIN_VALUE, arg1);
            this.method296(-8417);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILig;Lig;I)Lwg;")
    public final class98 method295(int arg0, int arg1, class186 arg2, class186 arg3, int arg4) {
        field690++;
        if (this.field709 != -1) {
            return class8.method48(-21178, this.field709).method478(arg4, arg3, arg2, arg1, 32);
        }
        long var6 = this.field688;
        int var8 = -99 / (arg0 / 61);
        int[] var9 = this.field689;
        if (arg3 != null && (arg3.field3032 >= 0 || arg3.field3042 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field689[var10];
            }
            if (arg3.field3032 >= 0) {
                if (arg3.field3032 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var9[5] = 0;
                } else {
                    var9[5] = class29.method261(arg3.field3032, 1073741824);
                    var6 ^= (long) var9[5] << 32;
                }
            }
            if (arg3.field3042 >= 0) {
                if (arg3.field3042 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var9[3] = 0;
                } else {
                    var9[3] = class29.method261(1073741824, arg3.field3042);
                    var6 ^= (long) var9[3];
                }
            }
        }
        class98 var11 = (class98) class45.field822.method764((byte) 70, var6);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var31 = var9[var13];
                if ((var31 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var31) != 0 && !class66.method506((byte) -113, var31 & 0x3FFFFFFF).method859(0)) {
                        var12 = true;
                    }
                } else if (!class15.method111(var31 & 0x3FFFFFFF, false).method1616(false, this.field697)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field700 != -1L) {
                    var11 = (class98) class45.field822.method764((byte) 70, this.field700);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                class202[] var14 = new class202[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var28 = var9[var16];
                    if ((var28 & 0x40000000) != 0) {
                        class202 var29 = class15.method111(var28 & 0x3FFFFFFF, false).method1630(this.field697, (byte) -94);
                        if (var29 != null) {
                            var14[var15++] = var29;
                        }
                    } else if ((Integer.MIN_VALUE & var28) != 0) {
                        class202 var30 = class66.method506((byte) -100, var28 & 0x3FFFFFFF).method857(0);
                        if (var30 != null) {
                            var14[var15++] = var30;
                        }
                    }
                }
                int var17 = var9[0];
                if ((var17 & 0x40000000) != 0) {
                    class239 var18 = class15.method111(var17 & 0x3FFFFFFF, false);
                    if (var18.field4100 != null) {
                        for (int var19 = 0; var19 < var18.field4100.length; var19++) {
                            if (var18.field4100[var19] != null && var14[var19 + 1] != null) {
                                int var20 = var18.field4100[var19][0];
                                int var21 = var18.field4100[var19][1];
                                int var22 = var18.field4100[var19][4];
                                int var23 = var18.field4100[var19][3];
                                int var24 = var18.field4100[var19][2];
                                int var25 = var18.field4100[var19][5];
                                var14[var19 + 1].method1371(var20, var21, var24);
                                var14[var19 + 1].method1345(var23, var22, var25);
                            }
                        }
                    }
                }
                class202 var26 = new class202(var14, var15);
                for (int var27 = 0; var27 < 5; var27++) {
                    if (this.field687[var27] < class132.field2312[var27].length) {
                        var26.method1358(class220.field3682[var27], class132.field2312[var27][this.field687[var27]]);
                    }
                    if (this.field687[var27] < class141.field2480[var27].length) {
                        var26.method1358(class136.field2366[var27], class141.field2480[var27][this.field687[var27]]);
                    }
                }
                var11 = var26.method1362(64, 850, -30, -50, -30);
                class45.field822.method765((byte) -125, var11, var6);
                this.field700 = var6;
            }
        }
        if (arg3 == null && arg2 == null) {
            return var11;
        }
        class98 var32;
        if (arg3 != null && arg2 != null) {
            var32 = arg3.method1259(arg4, arg1, var11, arg2, (byte) -72);
        } else if (arg3 == null) {
            var32 = arg2.method1252(1994376368, var11, arg4);
        } else {
            var32 = arg3.method1252(1994376368, var11, arg1);
        }
        return var32;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    private final void method296(int arg0) {
        if (arg0 != -8417) {
            field704 = 37;
        }
        long[] var2 = class90.field1715;
        long var3 = this.field688;
        this.field688 = -1L;
        field695++;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field688 = var2[(int) (((long) (this.field689[var5] >> 24) ^ this.field688) & 0xFFL)] ^ this.field688 >>> 8;
            this.field688 = var2[(int) (((long) (this.field689[var5] >> 16) ^ this.field688) & 0xFFL)] ^ this.field688 >>> 8;
            this.field688 = var2[(int) ((this.field688 ^ (long) (this.field689[var5] >> 8)) & 0xFFL)] ^ this.field688 >>> 8;
            this.field688 = this.field688 >>> 8 ^ var2[(int) ((this.field688 ^ (long) this.field689[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field688 = this.field688 >>> 8 ^ var2[(int) (((long) this.field687[var6] ^ this.field688) & 0xFFL)];
        }
        this.field688 = var2[(int) ((this.field688 ^ (long) (this.field697 ? 1 : 0)) & 0xFFL)] ^ this.field688 >>> 8;
        if (var3 != 0L && this.field688 != var3) {
            class45.field822.method761(-62, var3);
        }
    }
}
