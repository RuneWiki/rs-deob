import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class406 extends class164 {

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Z")
    public boolean field5762 = true;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Lwo;")
    public static class690 field5751 = new class690(8, 8);

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Lrq;")
    public class321 field5752;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Lf;")
    public static class701 field5747;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
    public int[] field5745;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
    private int[] field5750;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field5753;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "[[I")
    private int[][] field5760;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public static final void method2453(int arg0) {
        field5755++;
        if (class527.field7715) {
            return;
        }
        if (arg0 != -20643) {
            field5747 = null;
        }
        class527.field7715 = true;
        class447.field6335 = true;
        if (class221.field2851.field4141) {
            class115.field1495 = ((int) class115.field1495 - 65 & 0xFFFFFF80);
        } else {
            class16.field311 += (-24.0F - class16.field311) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lun;I)V")
    public final void method2454(class389 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2229(255);
            if (var3 == 0) {
                field5758++;
                if (arg1 < 19) {
                    this.field5745 = null;
                    return;
                }
                return;
            }
            this.method2460((byte) -110, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Lun;I)Ljava/lang/String;")
    public final String method2455(class389 arg0, int arg1) {
        field5761++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5750 != null) {
            for (int var4 = 0; var4 < this.field5750.length; var4++) {
                var3.append(this.field5753[var4]);
                var3.append(this.field5752.method1867(arg0.method2254((byte) -120, class460.method2716(this.field5750[var4], 121).field9867), arg1 ^ 0xFFFFFFFC, this.field5760[var4], this.method2458((byte) -63, var4)));
            }
        }
        var3.append(this.field5753[this.field5753.length + arg1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
    public final int method2456(byte arg0) {
        field5748++;
        if (arg0 != 24) {
            this.method2459((byte) -46, -111, 48);
        }
        return this.field5750 == null ? 0 : this.field5750.length;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[ILun;)V")
    public final void method2457(int arg0, int[] arg1, class389 arg2) {
        field5757++;
        if (arg0 != -1) {
            field5751 = null;
        }
        if (this.field5750 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field5750.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method2458((byte) -63, var4).field9864;
            if (var5 > 0) {
                arg2.method2246(8, (long) arg1[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Lgfa;")
    public final class696 method2458(byte arg0, int arg1) {
        if (arg0 != -63) {
            this.field5753 = null;
        }
        field5754++;
        return this.field5750 == null || arg1 < 0 || arg1 > this.field5750.length ? null : class460.method2716(this.field5750[arg1], 123);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)I")
    public final int method2459(byte arg0, int arg1, int arg2) {
        if (arg0 != 63) {
            return -32;
        }
        field5746++;
        if (this.field5750 == null || arg2 < 0 || arg2 > this.field5750.length) {
            return -1;
        } else if (this.field5760[arg2] == null || arg1 < 0 || this.field5760[arg2].length < arg1) {
            return -1;
        } else {
            return this.field5760[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILun;)V")
    private final void method2460(byte arg0, int arg1, class389 arg2) {
        if (arg0 != -110) {
            return;
        }
        field5763++;
        if (arg1 == 1) {
            this.field5753 = class72.method637('<', false, arg2.method2244((byte) -56));
        } else if (arg1 == 2) {
            int var4 = arg2.method2229(255);
            this.field5745 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5745[var5] = arg2.method2260(-29);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method2229(255);
            this.field5750 = new int[var6];
            this.field5760 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method2260(-103);
                class696 var9 = class460.method2716(var8, arg0 + 236);
                if (var9 != null) {
                    this.field5750[var7] = var8;
                    this.field5760[var7] = new int[var9.field9861];
                    for (int var10 = 0; var10 < var9.field9861; var10++) {
                        this.field5760[var7][var10] = arg2.method2260(-102);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field5762 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
    public final void method2461(byte arg0) {
        if (arg0 != 98) {
            this.method2457(15, null, null);
        }
        field5749++;
        if (this.field5745 != null) {
            for (int var2 = 0; var2 < this.field5745.length; var2++) {
                this.field5745[var2] = class242.method1474(this.field5745[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILrda;Ldc;I)V")
    public static final void method2462(int arg0, int arg1, class613 arg2, class5 arg3, int arg4) {
        if (arg0 != -65536) {
            method2462(11, -120, null, null, -36);
        }
        field5759++;
        byte var5 = -1;
        if ((arg4 & 0x400) != 0) {
            var5 = arg3.method2276(128);
        }
        if ((arg4 & 0x40) != 0) {
            int var6 = arg3.method2271(arg0 + 65428);
            byte[] var7 = new byte[var6];
            class389 var8 = new class389(var7);
            arg3.method2218(0, var7, var6, 0);
            class69.field1062[arg1] = var8;
            arg2.method3517(var8, (byte) 65);
        }
        if ((arg4 & 0x1) != 0) {
            class468.field6541[arg1] = arg3.method2249((byte) -70);
        }
        if ((arg4 & 0x10) != 0) {
            arg2.field8796 = arg3.method2274((byte) 94);
            if (arg2.field2683 == 0) {
                arg2.method1295(-1, arg2.field8796);
                arg2.field8796 = -1;
            }
        }
        if ((arg4 & 0x2000) != 0) {
            arg2.field2602 = arg3.method2249((byte) -70);
            arg2.field2650 = arg3.method2276(128);
            arg2.field2631 = arg3.method2276(128);
            arg2.field2600 = arg3.method2276(128);
            arg2.field2653 = arg3.method2260(-123) + class543.field7882;
            arg2.field2638 = arg3.method2260(-28) + class543.field7882;
            arg2.field2622 = arg3.method2262(true);
            if (arg2.field8783) {
                arg2.field2602 += arg2.field8789;
                arg2.field2683 = 0;
                arg2.field2650 += arg2.field8781;
                arg2.field2631 += arg2.field8789;
                arg2.field2600 += arg2.field8781;
            } else {
                arg2.field2631 += arg2.field2689[0];
                arg2.field2683 = 1;
                arg2.field2602 += arg2.field2689[0];
                arg2.field2600 += arg2.field2686[0];
                arg2.field2650 += arg2.field2686[0];
            }
            arg2.field2680 = 0;
        }
        if ((arg4 & 0x4) != 0) {
            int[] var9 = new int[4];
            for (int var10 = 0; var10 < 4; var10++) {
                var9[var10] = arg3.method2279((byte) -120);
                if (var9[var10] == 65535) {
                    var9[var10] = -1;
                }
            }
            int var11 = arg3.method2240((byte) 119);
            class382.method2203(var11, arg2, var9, (byte) -99);
        }
        if ((arg4 & 0x10000) != 0) {
            int var12 = arg3.method2271(-107);
            int[] var13 = new int[var12];
            int[] var14 = new int[var12];
            for (int var15 = 0; var15 < var12; var15++) {
                int var16 = arg3.method2274((byte) 80);
                if ((var16 & 0xC000) == 49152) {
                    int var17 = arg3.method2247(24565);
                    var13[var15] = class242.method1474(var16 << 16, var17);
                } else {
                    var13[var15] = var16;
                }
                var14[var15] = arg3.method2260(-58);
            }
            arg2.method1288(-111, var14, var13);
        }
        if ((arg4 & 0x20) != 0) {
            int var18 = arg3.method2274((byte) 61);
            if (var18 == 65535) {
                var18 = -1;
            }
            arg2.field2628 = var18;
        }
        if ((arg4 & 0x8000) != 0) {
            arg2.field8782 = arg3.method2271(-123) == 1;
        }
        if ((arg4 & 0x100) != 0) {
            int var19 = arg3.method2229(255);
            int[] var20 = new int[var19];
            int[] var21 = new int[var19];
            int[] var22 = new int[var19];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = arg3.method2274((byte) 68);
                if (var24 == 65535) {
                    var24 = -1;
                }
                var20[var23] = var24;
                var21[var23] = arg3.method2271(-116);
                var22[var23] = arg3.method2274((byte) 69);
            }
            class99.method744(-1, arg2, var22, var20, var21);
        }
        if ((arg4 & 0x200) != 0) {
            int var25 = arg3.method2247(arg0 + 90101);
            arg2.field2635 = arg3.method2229(arg0 + 65791);
            arg2.field2673 = arg3.method2240((byte) 113);
            arg2.field2586 = var25 & 0x7FFF;
            arg2.field2633 = (var25 & 0x8000) != 0;
            arg2.field2669 = class543.field7882 + arg2.field2635 + arg2.field2586;
        }
        if ((arg4 & 0x800) != 0) {
            arg2.field2639 = arg3.method2244((byte) -97);
            if (arg2.field2639.charAt(0) == '~') {
                arg2.field2639 = arg2.field2639.substring(1);
                class301.method1786(arg2.field8786, arg2.field2639, arg2.method3521(true, (byte) -90), arg2.method3511(-1, false), -1, 2, 0);
            } else if (class206.field2472 == arg2) {
                class301.method1786(arg2.field8786, arg2.field2639, arg2.method3521(true, (byte) -112), arg2.method3511(-1, false), -1, 2, 0);
            }
            arg2.field2621 = 150;
            arg2.field2576 = 0;
            arg2.field2658 = 0;
        }
        if ((arg4 & 0x2) != 0) {
            int var26 = arg3.method2266((byte) 110);
            int var27 = arg3.method2229(arg0 + 65791);
            arg2.method1290(class543.field7882, false, var27, var26);
            arg2.field2674 = class543.field7882 + 300;
            arg2.field2607 = arg3.method2240((byte) 117);
        }
        if ((arg4 & 0x1000) != 0) {
            int var28 = arg3.method2247(24565);
            int var29 = arg3.method2255(arg0 ^ 0xFFFF00FF);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var30 = arg3.method2262(true);
            arg2.method1287(var29, var28, -1, var30, true);
        }
        if ((arg4 & 0x8) != 0) {
            int var31 = arg3.method2260(-37);
            if (var31 == 65535) {
                var31 = -1;
            }
            int var32 = arg3.method2255(255);
            int var33 = arg3.method2240((byte) 110);
            arg2.method1287(var32, var31, -1, var33, false);
        }
        if ((arg4 & 0x40000) != 0) {
            arg2.field2603 = arg3.method2249((byte) -70);
            arg2.field2660 = arg3.method2277((byte) -52);
            arg2.field2666 = arg3.method2277((byte) -52);
            arg2.field2583 = (byte) arg3.method2240((byte) 109);
            arg2.field2595 = class543.field7882 + arg3.method2274((byte) 95);
            arg2.field2645 = class543.field7882 + arg3.method2279((byte) -126);
        }
        if ((arg4 & 0x20000) != 0) {
            int var34 = class543.field7882;
            int var35 = arg3.method2266((byte) 110);
            int var36 = arg3.method2262(true);
            arg2.method1290(var34, false, var36, var35);
        }
        if (!arg2.field8783) {
            return;
        }
        if (var5 == 127) {
            arg2.method3515((byte) -59, arg2.field8781, arg2.field8789);
            return;
        }
        byte var37;
        if (var5 == -1) {
            var37 = class468.field6541[arg1];
        } else {
            var37 = var5;
        }
        arg2.method3516(125, arg2.field8781, arg2.field8789, var37);
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public static void method2463(int arg0) {
        field5747 = null;
        field5751 = null;
        if (arg0 != 22606) {
            method2462(8, -111, null, null, -77);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public final String method2464(boolean arg0) {
        field5756++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5753 == null) {
            return "";
        }
        var2.append(this.field5753[0]);
        if (!arg0) {
            return null;
        }
        for (int var3 = 1; var3 < this.field5753.length; var3++) {
            var2.append("...");
            var2.append(this.field5753[var3]);
        }
        return var2.toString();
    }
}
