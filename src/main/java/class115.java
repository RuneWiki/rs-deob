import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 extends class84 {

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "Z")
    private boolean field2535 = false;

    @OriginalMember(owner = "client!qd", name = "sb", descriptor = "I")
    private int field2547 = 0;

    @OriginalMember(owner = "client!qd", name = "vb", descriptor = "I")
    private int field2550 = 0;

    @OriginalMember(owner = "client!qd", name = "qb", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!qd", name = "Lb", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!qd", name = "Kb", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    private int field2533;

    @OriginalMember(owner = "client!qd", name = "ob", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!qd", name = "Gb", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!qd", name = "wb", descriptor = "I")
    private int field2551;

    @OriginalMember(owner = "client!qd", name = "pb", descriptor = "I")
    private int field2544;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    private int field2530;

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
    private int field2540;

    @OriginalMember(owner = "client!qd", name = "ub", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lae;")
    private class6 field2531;

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "I")
    public static int field2541 = 0;

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
    public static int field2538 = 0;

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "J")
    public static long field2539 = 0L;

    @OriginalMember(owner = "client!qd", name = "Hb", descriptor = "Lkc;")
    public static class72 field2562 = new class72();

    @OriginalMember(owner = "client!qd", name = "Ob", descriptor = "Lpe;")
    public static class109 field2569 = class141.method1120("Bitte versuchen Sie)1", 0);

    @OriginalMember(owner = "client!qd", name = "Mb", descriptor = "Lpe;")
    public static class109 field2567 = class141.method1120(" )2> <col=ffff00>", 0);

    @OriginalMember(owner = "client!qd", name = "Pb", descriptor = "Lpe;")
    public static class109 field2570 = class141.method1120("welle:", 0);

    @OriginalMember(owner = "client!qd", name = "Nb", descriptor = "[S")
    public static short[] field2568 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "D")
    private double field2534;

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "D")
    private double field2536;

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "D")
    private double field2542;

    @OriginalMember(owner = "client!qd", name = "xb", descriptor = "D")
    private double field2552;

    @OriginalMember(owner = "client!qd", name = "Bb", descriptor = "D")
    public double field2556;

    @OriginalMember(owner = "client!qd", name = "Db", descriptor = "D")
    public double field2558;

    @OriginalMember(owner = "client!qd", name = "Fb", descriptor = "D")
    private double field2560;

    @OriginalMember(owner = "client!qd", name = "Jb", descriptor = "D")
    public double field2564;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!qd", name = "rb", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!qd", name = "yb", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!qd", name = "zb", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!qd", name = "Ab", descriptor = "I")
    private int field2555;

    @OriginalMember(owner = "client!qd", name = "Cb", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!qd", name = "Eb", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!qd", name = "Ib", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!qd", name = "tb", descriptor = "[[I")
    public static int[][] field2548;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lwf;ZLwf;)V")
    public static final void method949(class159 arg0, boolean arg1, class159 arg2) {
        field2559++;
        if (class79.field1660) {
            method954(-74, arg0, arg2);
            return;
        }
        if (class153.field3373 == 0 || class153.field3373 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg0.method545(class19.field489, 382, 245 - var3, 16777215, -1);
            class140.method1115(230, var4, 304, 34, 9179409);
            class140.method1115(231, var4 + 1, 302, 32, 0);
            class140.method1118(232, var4 + 2, class11.field248 * 3, 30, 9179409);
            class140.method1118(class11.field248 * 3 + 232, var4 + 2, 300 - class11.field248 * 3, 30, 0);
            arg0.method545(class72.field1460, 382, 276 - var3, 16777215, -1);
        }
        if (class153.field3373 == 20) {
            class124.field2750.method539(382 - class124.field2750.field1386 / 2, -(class124.field2750.field1382 / 2) + 271);
            short var5 = 211;
            arg0.method545(class72.field1456, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method545(class72.field1477, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method545(class72.field1475, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method558(class44.method405(new class109[] { class49.field1022, class70.method550(class72.field1468) }, (byte) -74), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg0.method558(class44.method405(new class109[] { class109.field2313, class72.field1478.method899(-111) }, (byte) -74), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class153.field3373 == 10) {
            class124.field2750.method539(202, 171);
            if (class145.field3187 == 0) {
                short var6 = 251;
                short var7 = 291;
                short var8 = 302;
                arg0.method545(class114.field2507, 382, var6, 16776960, 0);
                class1.field2.method539(var8 - 73, var7 + -20);
                arg0.method564(class75.field1515, var8 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                int var27 = var6 + 30;
                short var9 = 462;
                class1.field2.method539(var9 - 73, var7 + -20);
                arg0.method564(class104.field2205, var9 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class145.field3187 == 2) {
                short var10 = 211;
                arg0.method545(class72.field1456, 382, var10, 16776960, 0);
                int var30 = var10 + 15;
                short var11 = 302;
                short var12 = 321;
                arg0.method545(class72.field1477, 382, var30, 16776960, 0);
                int var31 = var30 + 15;
                arg0.method545(class72.field1475, 382, var31, 16776960, 0);
                int var32 = var31 + 15;
                int var33 = var32 + 10;
                arg0.method558(class44.method405(new class109[] { class49.field1022, class70.method550(class72.field1468), class123.field2715 == 0 & class12.field264 % 40 < 20 ? class41.field849 : class72.field1473 }, (byte) -74), 272, var33, 16777215, 0);
                int var34 = var33 + 15;
                arg0.method558(class44.method405(new class109[] { class109.field2313, class72.field1478.method899(-50), class123.field2715 == 1 & class12.field264 % 40 < 20 ? class41.field849 : class72.field1473 }, (byte) -74), 274, var34, 16777215, 0);
                int var35 = var34 + 15;
                class1.field2.method539(var11 - 73, var12 + -20);
                arg0.method545(class57.field1157, var11, var12 + 5, 16777215, 0);
                short var13 = 462;
                class1.field2.method539(var13 - 73, var12 + -20);
                arg0.method545(class125.field2773, var13, var12 + 5, 16777215, 0);
            } else if (class145.field3187 == 3) {
                arg0.method545(class100.field2096, 382, 211, 16776960, 0);
                short var14 = 382;
                short var15 = 236;
                arg0.method545(class43.field923, 382, var15, 16777215, 0);
                short var16 = 321;
                int var36 = var15 + 15;
                arg0.method545(class61.field1181, 382, var36, 16777215, 0);
                int var37 = var36 + 15;
                arg0.method545(class85.field1816, 382, var37, 16777215, 0);
                int var38 = var37 + 15;
                arg0.method545(class46.field960, 382, var38, 16777215, 0);
                int var39 = var38 + 15;
                class1.field2.method539(var14 - 73, var16 + -20);
                arg0.method545(class125.field2773, var14, var16 + 5, 16777215, 0);
            }
        }
        if (class146.field3195 != 1) {
            if (class126.field2804 > 0) {
                class148.method1158(class126.field2804, -8259);
                class126.field2804 = 0;
            }
            class89.method734(false);
        }
        class145.field3183[class43.field903 ? 1 : 0].method539(725, 463);
        if (class153.field3373 > 5 && class86.field1833 != 2 && class89.field1887 == 0) {
            if (class45.field945 == null) {
                class45.field945 = class71.method575(class18.field453, class72.field1473, class92.field1978, -48);
            } else {
                byte var17 = 5;
                short var18 = 463;
                byte var19 = 100;
                class45.field945.method539(var17, var18);
                byte var20 = 35;
                arg0.method545(class44.method405(new class109[] { class42.field881, class148.field3233, class143.method1132(class19.field474, 126) }, (byte) -74), var19 / 2 + var17, var20 / 2 + var18 + -2, 16777215, 0);
                if (class125.field2756 == null) {
                    arg2.method545(class154.field3510, var17 + var19 / 2, var20 / 2 + var18 + 12, 16777215, 0);
                } else {
                    arg2.method545(class67.field1358, var17 + var19 / 2, var18 - -(var20 / 2) + 12, 16777215, 0);
                }
            }
        }
        try {
            if (!arg1) {
                method949(null, false, null);
            }
            Graphics var21 = class137.field2980.getGraphics();
            class75.field1510.method73(var21, -126, 0, 0);
        } catch (Exception var22) {
            class137.field2980.repaint();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static void method950(boolean arg0) {
        field2570 = null;
        field2569 = null;
        if (!arg0) {
            method950(true);
        }
        field2568 = null;
        field2562 = null;
        field2567 = null;
        field2548 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lna;I)V")
    public static final void method951(class91 arg0, int arg1) {
        if (arg1 == 15) {
            field2557++;
            class60.field1163 = arg0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
    public final void method952(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2563++;
        if (!this.field2535) {
            double var6 = (double) (arg3 - this.field2544);
            double var8 = (double) (arg1 - this.field2540);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2558 = (double) this.field2533 * var6 / var10 + (double) this.field2544;
            this.field2564 = (double) this.field2533 * var8 / var10 + (double) this.field2540;
            this.field2556 = this.field2530;
        }
        double var12 = (double) (this.field2561 + 1 - arg0);
        this.field2542 = ((double) arg1 - this.field2564) / var12;
        this.field2560 = ((double) arg3 - this.field2558) / var12;
        this.field2536 = Math.sqrt(this.field2560 * this.field2560 + this.field2542 * this.field2542);
        if (!this.field2535) {
            this.field2534 = -this.field2536 * Math.tan((double) this.field2551 * 0.02454369D);
        }
        if (arg4 == 0) {
            this.field2552 = ((double) arg2 - this.field2556 - this.field2534 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Lwb;")
    public final class155 method16(int arg0) {
        field2537++;
        if (arg0 != 9698) {
            this.field2547 = 99;
        }
        class85 var2 = class85.method716((byte) 94, this.field2543);
        class155 var3 = var2.method712(this.field2550, 115);
        if (var3 == null) {
            return null;
        } else {
            var3.method1216(this.field2555);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
    public final void method953(int arg0, int arg1) {
        this.field2535 = true;
        this.field2556 += this.field2552 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2534;
        if (arg1 != 11329) {
            method950(true);
        }
        this.field2564 += (double) arg0 * this.field2542;
        field2554++;
        this.field2534 += (double) arg0 * this.field2552;
        this.field2558 += (double) arg0 * this.field2560;
        this.field2532 = (int) (Math.atan2(this.field2560, this.field2542) * 325.949D) + 1024 & 0x7FF;
        this.field2555 = (int) (Math.atan2(this.field2534, this.field2536) * 325.949D) & 0x7FF;
        if (this.field2531 == null) {
            return;
        }
        this.field2547 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2547 <= this.field2531.field164[this.field2550]) {
                        return;
                    }
                    this.field2547 -= this.field2531.field164[this.field2550];
                    this.field2550++;
                } while (this.field2531.field144.length > this.field2550);
                this.field2550 -= this.field2531.field134;
            } while (this.field2550 >= 0 && this.field2531.field144.length > this.field2550);
            this.field2550 = 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILwf;Lwf;)V")
    private static final void method954(int arg0, class159 arg1, class159 arg2) {
        field2546++;
        if (class137.field2990 == null) {
            class137.field2990 = class139.method1097(class14.field373, -21104, class72.field1473, class18.field453);
        }
        if (class47.field983 == null) {
            class47.field983 = class50.method427(class18.field453, class13.field313, class72.field1473, 110);
        }
        if (arg0 > -64) {
            method949(null, false, null);
        }
        if (class101.field2123 == null) {
            class101.field2123 = class50.method427(class18.field453, class139.field3027, class72.field1473, 97);
        }
        if (class27.field637 == null) {
            class27.field637 = class50.method427(class18.field453, class7.field177, class72.field1473, 117);
        }
        class140.method1118(0, 23, 765, 480, 0);
        class140.method1103(0, 0, 125, 23, 12425273, 9135624);
        class140.method1103(125, 0, 640, 23, 5197647, 2697513);
        arg1.method545(class3.field56, 62, 15, 0, -1);
        if (class27.field637 != null) {
            class27.field637[1].method539(140, 1);
            arg2.method558(class119.field2647, 152, 10, 16777215, -1);
            class27.field637[0].method539(140, 12);
            arg2.method558(class67.field1345, 152, 21, 16777215, -1);
        }
        if (class101.field2123 != null) {
            short var3 = 280;
            if (class125.field2771[0] == 0 && class71.field1439[0] == 0) {
                class101.field2123[2].method539(var3, 4);
            } else {
                class101.field2123[0].method539(var3, 4);
            }
            short var4 = 390;
            short var5 = 610;
            if (class125.field2771[0] == 0 && class71.field1439[0] == 1) {
                class101.field2123[3].method539(var3 + 15, 4);
            } else {
                class101.field2123[1].method539(var3 + 15, 4);
            }
            short var6 = 500;
            arg1.method558(class42.field878, var3 + 32, 17, 16777215, -1);
            if (class125.field2771[0] == 1 && class71.field1439[0] == 0) {
                class101.field2123[2].method539(var4, 4);
            } else {
                class101.field2123[0].method539(var4, 4);
            }
            if (class125.field2771[0] == 1 && class71.field1439[0] == 1) {
                class101.field2123[3].method539(var4 + 15, 4);
            } else {
                class101.field2123[1].method539(var4 + 15, 4);
            }
            arg1.method558(class137.field2987, var4 + 32, 17, 16777215, -1);
            if (class125.field2771[0] == 2 && class71.field1439[0] == 0) {
                class101.field2123[2].method539(var6, 4);
            } else {
                class101.field2123[0].method539(var6, 4);
            }
            if (class125.field2771[0] == 2 && class71.field1439[0] == 1) {
                class101.field2123[3].method539(var6 + 15, 4);
            } else {
                class101.field2123[1].method539(var6 + 15, 4);
            }
            arg1.method558(class139.field3037, var6 + 32, 17, 16777215, -1);
            if (class125.field2771[0] == 3 && class71.field1439[0] == 0) {
                class101.field2123[2].method539(var5, 4);
            } else {
                class101.field2123[0].method539(var5, 4);
            }
            if (class125.field2771[0] == 3 && class71.field1439[0] == 1) {
                class101.field2123[3].method539(var5 + 15, 4);
            } else {
                class101.field2123[1].method539(var5 + 15, 4);
            }
            arg1.method558(class55.field1113, var5 + 32, 17, 16777215, -1);
        }
        class140.method1118(708, 4, 50, 16, 0);
        arg2.method545(class125.field2773, 733, 16, 16777215, -1);
        class48.field989 = -1;
        if (class137.field2990 != null) {
            byte var7 = 19;
            byte var8 = 88;
            int var9 = 480 / (var7 + 1);
            int var10 = 765 / (var8 + 1);
            int var11;
            int var12;
            do {
                var11 = var9;
                var12 = var10;
                if ((var10 - 1) * var9 >= class46.field958) {
                    var10--;
                }
                if (class46.field958 <= (var9 - 1) * var10) {
                    var9--;
                }
                if (class46.field958 <= (var9 - 1) * var10) {
                    var9--;
                }
            } while (var9 != var11 || var10 != var12);
            int var13 = (765 - var8 * var10) / (var10 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (480 - var7 * var9) / (var9 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (765 - var8 * var10 - (var10 + -1) * var13) / 2;
            int var16 = 0;
            int var17 = var15;
            int var18 = (480 - (var9 - 1) * var14 - var7 * var9) / 2;
            int var19 = var18 + 23;
            for (int var20 = 0; var20 < class46.field958; var20++) {
                class144 var21 = class55.field1126[var20];
                boolean var22 = true;
                class109 var23 = class143.method1132(var21.field3167, 109);
                if (var21.field3167 == -1) {
                    var23 = class71.field1453;
                    var22 = false;
                } else if (var21.field3167 > 1980) {
                    var22 = false;
                    var23 = class119.field2630;
                }
                if (var17 <= class82.field1754 && var19 <= class48.field992 && class82.field1754 < var17 + var8 && var7 + var19 > class48.field992 && var22) {
                    class48.field989 = var20;
                    class137.field2990[var21.field3157 ? 1 : 0].method258(var17, var19, 128, 16777215);
                } else {
                    class137.field2990[var21.field3157 ? 1 : 0].method264(var17, var19);
                }
                if (class47.field983 != null) {
                    class47.field983[(var21.field3157 ? 8 : 0) + var21.field3163].method539(var17 + 29, var19);
                }
                arg1.method545(class143.method1132(var21.field3161, 87), var17 + 15, var7 / 2 + var19 + 5, 0, -1);
                arg2.method545(var23, var17 + 60, var19 - -(var7 / 2) + 5, 268435455, -1);
                var19 += var7 + var14;
                var16++;
                if (var16 >= var9) {
                    var19 = var18 + 23;
                    var16 = 0;
                    var17 += var8 + var13;
                }
            }
        }
        try {
            Graphics var24 = class137.field2980.getGraphics();
            class75.field1510.method73(var24, -119, 0, 0);
        } catch (Exception var25) {
            class137.field2980.repaint();
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2545 = arg9;
        this.field2566 = arg1;
        this.field2565 = arg5;
        this.field2533 = arg8;
        this.field2543 = arg0;
        this.field2561 = arg6;
        this.field2551 = arg7;
        this.field2544 = arg2;
        this.field2530 = arg4;
        this.field2540 = arg3;
        this.field2535 = false;
        this.field2549 = arg10;
        int var12 = class85.method716((byte) 69, this.field2543).field1821;
        if (var12 == -1) {
            this.field2531 = null;
        } else {
            this.field2531 = class27.method238(8, var12);
        }
    }
}
