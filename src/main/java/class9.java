import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Loh;")
    private class281 field87 = new class281();

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Z")
    private boolean field91 = false;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public int field92 = 0;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field93;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
    public static int[] field85 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "[I")
    public static int[] field86 = new int[5];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
    public static int[] field79;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[[[B")
    public static byte[][][] field80;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method55(byte arg0) {
        field80 = null;
        field86 = null;
        field79 = null;
        field85 = null;
        if (arg0 < 32) {
            field86 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        this.field91 = true;
        field81++;
        class281 var2 = this.field87;
        synchronized (this.field87) {
            this.field87.notifyAll();
        }
        try {
            this.field93.join();
        } catch (InterruptedException var3) {
        }
        this.field93 = null;
        if (arg0 != 15) {
            this.method61((class54) null, 52, (byte) 69);
        }
    }

    @OriginalMember(owner = "client!ig", name = "run", descriptor = "()V")
    public final void run() {
        field78++;
        while (!this.field91) {
            class281 var1 = this.field87;
            class19 var2;
            synchronized (this.field87) {
                var2 = (class19) this.field87.method1880(0);
                if (var2 == null) {
                    try {
                        this.field87.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field92--;
            }
            try {
                if (var2.field271 == 2) {
                    var2.field278.method336(var2.field279, (int) var2.field1148, (byte) 22, var2.field279.length);
                } else if (var2.field271 == 3) {
                    var2.field279 = var2.field278.method337((int) var2.field1148, true);
                }
            } catch (Exception var6) {
                class221.method1426((String) null, -1, var6);
            }
            var2.field1519 = false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILff;)V")
    private final void method57(int arg0, class19 arg1) {
        if (arg0 != 1) {
            this.method59((byte[]) null, (byte) -74, -110, (class54) null);
        }
        class281 var3 = this.field87;
        synchronized (this.field87) {
            this.field87.method1890(arg1, arg0 - 1);
            this.field92++;
            this.field87.notifyAll();
        }
        field88++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(JI)V")
    public static final void method58(long arg0, int arg1) {
        field89++;
        if (class51.field734 == 1 || class51.field734 == 5) {
            class122.method804(arg0, 255);
        } else if (class51.field734 == 2) {
            class179.method1172((byte) -8);
        } else {
            class217.method1409(-31671);
        }
        if (!class15.field146) {
            class285.field4468[0] = class122.field1704;
            class227.field3444[0] = class172.field2399;
            class41.field612[0] = "";
            class68.field925 = 1;
            if (class297.field4687 != 0) {
                class193.field2678 = class178.field2494;
                class203.field2830 = class176.field2475;
            } else if (class202.field2798 == 0) {
                class193.field2678 = class287.field4543;
                class203.field2830 = class12.field124;
            } else {
                class203.field2830 = class27.field344;
                class193.field2678 = class81.field1112;
            }
            class221.field3306[0] = 1007;
        }
        if (class212.field3193 != -1) {
            class208.method1322(class212.field3193, (byte) -45);
        }
        for (int var3 = 0; var3 < class265.field3979; var3++) {
            if (class42.field640[var3]) {
                class293.field4607[var3] = true;
            }
            class73.field999[var3] = class42.field640[var3];
            class42.field640[var3] = false;
        }
        class131.field1843 = null;
        class248.field3798 = null;
        class136.field1907 = class52.field740;
        if (arg1 >= -22) {
            return;
        }
        class154.field2152 = -1;
        class79.field1101 = -1;
        if (class212.field3193 != -1) {
            class265.field3979 = 0;
            class77.method493((byte) 41);
        }
        class64.method392();
        class89.method569(1);
        if (class15.field146) {
            if (class137.field1925) {
                class63.method384(false);
            } else {
                class174.method1137((byte) 83);
            }
        } else if (class248.field3798 != null) {
            class198.method1265(class143.field1987, class248.field3798, class28.field369, 83);
        } else if (class79.field1101 != -1) {
            class198.method1265(class79.field1101, (class211) null, class154.field2152, 118);
        }
        int var4 = class15.field146 ? -1 : class206.method1308((byte) -38);
        if (var4 == -1) {
            var4 = class219.field3293;
        }
        class118.method789(var4, false);
        if (class96.field1355 == 1) {
            class96.field1355 = 2;
        }
        if (class54.field781 == 1) {
            class54.field781 = 2;
        }
        if (class193.field2669 == 3) {
            for (int var5 = 0; var5 < class265.field3979; var5++) {
                if (class73.field999[var5]) {
                    class64.method395(class118.field1670[var5], class101.field1420[var5], class123.field1713[var5], class150.field2074[var5], 16711935, 128);
                } else if (class293.field4607[var5]) {
                    class64.method395(class118.field1670[var5], class101.field1420[var5], class123.field1713[var5], class150.field2074[var5], 16711680, 128);
                }
            }
        }
        class49.method318(class217.field3280.field4019, class225.field3409, 83, class217.field3280.field4085, class295.field4642);
        class225.field3409 = 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([BBILkb;)Lff;")
    public final class19 method59(byte[] arg0, byte arg1, int arg2, class54 arg3) {
        field83++;
        class19 var5 = new class19();
        var5.field278 = arg3;
        var5.field271 = 2;
        var5.field1148 = (long) arg2;
        var5.field279 = arg0;
        var5.field1517 = false;
        this.method57(1, var5);
        int var6 = 40 % ((arg1 - 72) / 45);
        return var5;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lkb;IB)Lff;")
    public final class19 method60(class54 arg0, int arg1, byte arg2) {
        field76++;
        class19 var4 = new class19();
        var4.field278 = arg0;
        var4.field1517 = false;
        var4.field1148 = (long) arg1;
        var4.field271 = 3;
        this.method57(1, var4);
        if (arg2 > -74) {
            field79 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lkb;IB)Lff;")
    public final class19 method61(class54 arg0, int arg1, byte arg2) {
        field77++;
        class19 var4 = new class19();
        var4.field271 = 1;
        class281 var5 = this.field87;
        synchronized (this.field87) {
            if (arg2 != -70) {
                return null;
            }
            class19 var7 = (class19) this.field87.method1887((byte) -108);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if ((long) arg1 == var7.field1148 && var7.field278 == arg0 && var7.field271 == 2) {
                    var4.field279 = var7.field279;
                    var4.field1519 = false;
                    return var4;
                }
                var7 = (class19) this.field87.method1886(-123);
            }
        }
        var4.field279 = arg0.method337(arg1, true);
        var4.field1517 = true;
        var4.field1519 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIZIBIIII[I)V")
    public static final void method62(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        field90++;
        int var11 = arg7;
        if (arg7 >= class64.field873) {
            return;
        }
        if (class64.field877 > arg7) {
            var11 = class64.field877;
        }
        int var12 = arg7 + arg8;
        if (var12 <= class64.field877) {
            return;
        }
        if (class64.field873 < var12) {
            var12 = class64.field873;
        }
        int var13 = arg2;
        if (arg2 >= class64.field878) {
            return;
        }
        if (arg2 < class64.field876) {
            var13 = class64.field876;
        }
        int var14 = arg2 + arg0;
        if (class64.field876 >= var14) {
            return;
        }
        if (class64.field878 < var14) {
            var14 = class64.field878;
        }
        int var15 = class64.field879 + var11 - var12;
        int var16 = var12 - arg7;
        int var17 = var14 - arg2;
        int var18 = class64.field879 * var13 + var11;
        int var19 = var13 - arg2;
        if (arg4 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg4 = 1;
        }
        int var20 = arg8 - var16;
        int var21 = var11 - arg7;
        if (arg4 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg4 = 8;
        }
        int var22 = arg0 - var17;
        int var23 = arg8 - var21;
        int var24 = arg0 - var19;
        if (arg4 == 1) {
            if (arg9 == 0) {
                for (int var25 = var19; var25 < var17; var25++) {
                    for (int var26 = var21; var26 < var16; var26++) {
                        if (var26 <= var25) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 1) {
                for (int var27 = var24 - 1; var27 >= var22; var27--) {
                    for (int var28 = var21; var28 < var16; var28++) {
                        if (var28 <= var27) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 2) {
                for (int var29 = var19; var29 < var17; var29++) {
                    for (int var30 = var21; var30 < var16; var30++) {
                        if (var30 >= var29) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 3) {
                for (int var31 = var24 - 1; var31 >= var22; var31--) {
                    for (int var32 = var21; var32 < var16; var32++) {
                        if (var31 <= var32) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg4 == 2) {
            if (arg9 == 0) {
                for (int var33 = var24 - 1; var33 >= var22; var33--) {
                    for (int var34 = var21; var34 < var16; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 1) {
                for (int var35 = var19; var35 < var17; var35++) {
                    for (int var36 = var21; var36 < var16; var36++) {
                        if (var18 >= 0 && arg10.length > var18) {
                            if (var36 >= var35 << 1) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        } else {
                            var18++;
                        }
                    }
                    var18 += var15;
                }
            } else if (arg9 == 2) {
                for (int var37 = var19; var37 < var17; var37++) {
                    for (int var38 = var23 - 1; var38 >= var20; var38--) {
                        if (var38 <= var37 >> 1) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 3) {
                for (int var39 = var24 - 1; var39 >= var22; var39--) {
                    for (int var40 = var23 - 1; var40 >= var20; var40--) {
                        if ((var39 << 1) <= var40) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg4 == 3) {
            if (arg9 == 0) {
                for (int var41 = var24 - 1; var41 >= var22; var41--) {
                    for (int var42 = var23 - 1; var42 >= var20; var42--) {
                        if (var41 >> 1 >= var42) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 1) {
                for (int var43 = var24 - 1; var43 >= var22; var43--) {
                    for (int var44 = var21; var44 < var16; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 2) {
                for (int var45 = var19; var45 < var17; var45++) {
                    for (int var46 = var21; var46 < var16; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 3) {
                for (int var47 = var19; var47 < var17; var47++) {
                    for (int var48 = var23 - 1; var48 >= var20; var48--) {
                        if (var47 << 1 <= var48) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg4 == 4) {
            if (arg9 == 0) {
                for (int var49 = var24 - 1; var49 >= var22; var49--) {
                    for (int var50 = var21; var50 < var16; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 1) {
                for (int var51 = var19; var51 < var17; var51++) {
                    for (int var52 = var21; var52 < var16; var52++) {
                        if (var52 <= var51 << 1) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 2) {
                for (int var53 = var19; var53 < var17; var53++) {
                    for (int var54 = var23 - 1; var54 >= var20; var54--) {
                        if (var54 >= var53 >> 1) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg9 == 3) {
                for (int var55 = var24 - 1; var55 >= var22; var55--) {
                    for (int var56 = var23 - 1; var56 >= var20; var56--) {
                        if (var55 << 1 >= var56) {
                            arg10[var18] = arg1;
                        } else if (arg3) {
                            arg10[var18] = arg6;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg9 == 0) {
                    for (int var65 = var19; var65 < var17; var65++) {
                        for (int var66 = var21; var66 < var16; var66++) {
                            if (var66 <= (arg8 / 2)) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var67 = var19; var67 < var17; var67++) {
                        for (int var68 = var21; var68 < var16; var68++) {
                            if (arg0 / 2 >= var67) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var69 = var19; var69 < var17; var69++) {
                        for (int var70 = var21; var70 < var16; var70++) {
                            if ((arg8 / 2) <= var70) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var71 = var19; var71 < var17; var71++) {
                        for (int var72 = var21; var72 < var16; var72++) {
                            if ((arg0 / 2) <= var71) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg9 == 0) {
                    for (int var73 = var19; var73 < var17; var73++) {
                        for (int var74 = var21; var74 < var16; var74++) {
                            if (var74 <= (var73 - arg0 / 2)) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var75 = var24 - 1; var75 >= var22; var75--) {
                        for (int var76 = var21; var76 < var16; var76++) {
                            if (var76 <= (var75 - (arg0 / 2))) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var77 = var24 - 1; var77 >= var22; var77--) {
                        for (int var78 = var23 - 1; var78 >= var20; var78--) {
                            if (var78 <= var77 - (arg0 / 2)) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var79 = var19; var79 < var17; var79++) {
                        for (int var80 = var23 - 1; var80 >= var20; var80--) {
                            if (var80 <= (var79 - (arg0 / 2))) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg9 == 0) {
                    for (int var81 = var19; var81 < var17; var81++) {
                        for (int var82 = var21; var82 < var16; var82++) {
                            if (var82 >= (var81 - (arg0 / 2))) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var83 = var24 - 1; var83 >= var22; var83--) {
                        for (int var84 = var21; var84 < var16; var84++) {
                            if (var84 >= var83 - (arg0 / 2)) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var85 = var24 - 1; var85 >= var22; var85--) {
                        for (int var86 = var23 - 1; var86 >= var20; var86--) {
                            if (var85 - (arg0 / 2) <= var86) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var87 = var19; var87 < var17; var87++) {
                        for (int var88 = var23 - 1; var88 >= var20; var88--) {
                            if (var88 >= (var87 - (arg0 / 2))) {
                                arg10[var18] = arg1;
                            } else if (arg3) {
                                arg10[var18] = arg6;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
            if (arg5 <= 89) {
                method58(-122L, 71);
            }
        } else if (arg9 == 0) {
            for (int var57 = var24 - 1; var57 >= var22; var57--) {
                for (int var58 = var23 - 1; var58 >= var20; var58--) {
                    if (var58 >= var57 >> 1) {
                        arg10[var18] = arg1;
                    } else if (arg3) {
                        arg10[var18] = arg6;
                    }
                    var18++;
                }
                var18 += var15;
            }
        } else if (arg9 == 1) {
            for (int var59 = var24 - 1; var59 >= var22; var59--) {
                for (int var60 = var21; var60 < var16; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg10[var18] = arg1;
                    } else if (arg3) {
                        arg10[var18] = arg6;
                    }
                    var18++;
                }
                var18 += var15;
            }
        } else if (arg9 == 2) {
            for (int var61 = var19; var61 < var17; var61++) {
                for (int var62 = var21; var62 < var16; var62++) {
                    if ((var61 >> 1) <= var62) {
                        arg10[var18] = arg1;
                    } else if (arg3) {
                        arg10[var18] = arg6;
                    }
                    var18++;
                }
                var18 += var15;
            }
        } else if (arg9 == 3) {
            for (int var63 = var19; var63 < var17; var63++) {
                for (int var64 = var23 - 1; var64 >= var20; var64--) {
                    if (var63 << 1 >= var64) {
                        arg10[var18] = arg1;
                    } else if (arg3) {
                        arg10[var18] = arg6;
                    }
                    var18++;
                }
                var18 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class9() {
        class117 var1 = class200.field2784.method1638(2, this, 5);
        while (var1.field1663 == 0) {
            class28.method182(10L, 125);
        }
        if (var1.field1663 == 2) {
            throw new RuntimeException();
        }
        this.field93 = (Thread) var1.field1665;
    }
}
