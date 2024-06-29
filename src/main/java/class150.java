import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class150 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "F")
    public float field2458;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "F")
    public float field2468;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "F")
    public float field2472;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Ltl;")
    private static class59 field2459 = class85.method639("wave2:", 9588);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Ltl;")
    public static class59 field2455 = class85.method639(":duelfriend:", 9588);

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Ltl;")
    public static class59 field2461 = class85.method639(")4l=", 9588);

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Ltl;")
    public static class59 field2467 = class85.method639("Cache:", 9588);

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "[I")
    public static int[] field2471 = new int[5];

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Ltl;")
    public static class59 field2469 = class85.method639(" zuerst von Ihrer Freunde)2Liste(Q", 9588);

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "Ltl;")
    public static class59 field2473 = class85.method639("::rect_debug", 9588);

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Ltl;")
    public static class59 field2476 = class85.method639("welle2:", 9588);

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Ltl;")
    public static class59 field2477 = class85.method639("; Max)2Age=", 9588);

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Ltl;")
    public static class59 field2481 = field2459;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Ltl;")
    public static class59 field2478 = field2459;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lmb;")
    public static class171 field2463;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "[S")
    public static short[] field2460;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 4)
    public static void method1080(int arg0) {
        field2473 = null;
        field2469 = null;
        field2459 = null;
        field2471 = null;
        field2481 = null;
        field2476 = null;
        field2477 = null;
        field2463 = null;
        if (arg0 > -75) {
            field2481 = (class59) null;
        }
        field2460 = null;
        field2461 = null;
        field2467 = null;
        field2455 = null;
        field2478 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([[FI[[I[IILuf;[[FILam;[[FI)V", line = 58)
    public static final void method1081(float[][] arg0, int arg1, int[][] arg2, int[] arg3, int arg4, class211 arg5, float[][] arg6, int arg7, class136 arg8, float[][] arg9, int arg10) {
        field2464++;
        int[] var11 = new int[arg3.length / 2];
        if (arg4 != 1) {
            method1080(18);
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg3[var12 + var12 + 1];
            int var14 = arg3[var12 + var12];
            if (arg1 == 1) {
                int var16 = var14;
                var14 = var13;
                var13 = 128 - var16;
            } else if (arg1 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg1 == 3) {
                int var15 = var14;
                var14 = 128 - var13;
                var13 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var14 == 0 && var13 == 0) {
                var17 = arg6[arg10][arg7];
                var18 = arg0[arg10][arg7];
                var19 = arg9[arg10][arg7];
            } else if (var14 == 128 && var13 == 0) {
                var18 = arg0[arg10 + 1][arg7];
                var19 = arg9[arg10 + 1][arg7];
                var17 = arg6[arg10 + 1][arg7];
            } else if (var14 == 128 && var13 == 128) {
                var18 = arg0[arg10 + 1][arg7 + 1];
                var19 = arg9[arg10 + 1][arg7 + 1];
                var17 = arg6[arg10 + 1][arg7 + 1];
            } else if (var14 == 0 && var13 == 128) {
                var17 = arg6[arg10][arg7 + 1];
                var19 = arg9[arg10][arg7 + 1];
                var18 = arg0[arg10][arg7 + 1];
            } else {
                float var20 = arg9[arg10][arg7];
                float var21 = arg6[arg10][arg7];
                float var22 = arg0[arg10][arg7];
                float var23 = (float) var13 / 128.0F;
                float var24 = arg6[arg10][arg7 + 1];
                float var25 = (float) var14 / 128.0F;
                float var26 = (arg6[arg10 + 1][arg7 + 1] - var24) * var25 + var24;
                float var27 = (arg0[arg10 + 1][arg7] - var22) * var25 + var22;
                float var28 = (arg9[arg10 + 1][arg7] - var20) * var25 + var20;
                float var29 = (arg6[arg10 + 1][arg7] - var21) * var25 + var21;
                float var30 = arg0[arg10][arg7 + 1];
                float var31 = (arg0[arg10 + 1][arg7 + 1] - var30) * var25 + var30;
                var18 = (var31 - var27) * var23 + var27;
                float var32 = arg9[arg10][arg7 + 1];
                float var33 = (arg9[arg10 + 1][arg7 + 1] - var32) * var25 + var32;
                var19 = (var33 - var28) * var23 + var28;
                var17 = (var26 - var29) * var23 + var29;
            }
            int var34 = (arg10 << 7) + var14;
            int var35 = (arg7 << 7) + var13;
            int var36 = class207.method1460(arg2, arg10, 765189601, var14, var13, arg7);
            var11[var12] = arg8.method993(arg5, var34, var36, var35, var17, var19, var18);
        }
        arg8.method994(var11);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZLme;III)V", line = 173)
    public static final void method1082(int arg0, boolean arg1, class295 arg2, int arg3, int arg4, int arg5) {
        class212.field3471 = 1;
        if (arg0 < 2) {
            return;
        }
        class219.field3566 = arg3;
        class113.field1823 = 10000;
        class228.field3687 = arg1;
        class97.field1561 = arg4;
        class7.field92 = arg5;
        class149.field2442 = arg2;
        field2474++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BILwk;)V", line = 226)
    public static final void method1083(byte arg0, int arg1, class105 arg2) {
        field2457++;
        if (class30.field420 < arg2.field1780) {
            class132.method968(-69, arg2);
        } else if (class30.field420 > arg2.field1770) {
            class148.method1071(-10733, arg2);
        } else {
            class222.method1536(arg2, 64);
        }
        if (arg2.field1774 < 128 || arg2.field1769 < 128 || arg2.field1774 >= 13184 || arg2.field1769 >= 13184) {
            arg2.field1737 = -1;
            arg2.field1749 = -1;
            arg2.field1770 = 0;
            arg2.field1780 = 0;
            arg2.field1774 = arg2.field1729[0] * 128 + (arg2.method776(true) * 64);
            arg2.field1769 = arg2.field1773[0] * 128 + (arg2.method776(true) * 64);
            arg2.method795(false);
        }
        if (arg0 <= 115) {
            return;
        }
        if (class286.field4920 == arg2 && (arg2.field1774 < 1536 || arg2.field1769 < 1536 || arg2.field1774 >= 11776 || arg2.field1769 >= 11776)) {
            arg2.field1737 = -1;
            arg2.field1770 = 0;
            arg2.field1780 = 0;
            arg2.field1749 = -1;
            arg2.field1774 = arg2.field1729[0] * 128 + arg2.method776(true) * 64;
            arg2.field1769 = arg2.field1773[0] * 128 + arg2.method776(true) * 64;
            arg2.method795(false);
        }
        class156.method1111(arg2, (byte) 59);
        class154.method1101(arg2, true);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 291)
    public class150() {
        this.field2454 = -60;
        this.field2458 = 0.69921875F;
        this.field2468 = 1.1523438F;
        this.field2480 = -50;
        this.field2479 = class141.field2356;
        this.field2475 = -50;
        this.field2466 = 0;
        this.field2472 = 1.2F;
        this.field2465 = class141.field2354;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ls;)V", line = 306)
    public class150(class170 arg0) {
        int var2 = arg0.method1221(86);
        if ((var2 & 0x1) == 0) {
            this.field2479 = class141.field2356;
        } else {
            this.field2479 = arg0.method1233((byte) -77);
        }
        if ((var2 & 0x2) == 0) {
            this.field2468 = 1.1523438F;
        } else {
            this.field2468 = (float) arg0.method1214(-18254) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2458 = 0.69921875F;
        } else {
            this.field2458 = (float) arg0.method1214(-18254) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2472 = 1.2F;
        } else {
            this.field2472 = (float) arg0.method1214(-18254) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2475 = -50;
            this.field2454 = -60;
            this.field2480 = -50;
        } else {
            this.field2475 = arg0.method1210(-122);
            this.field2454 = arg0.method1210(-120);
            this.field2480 = arg0.method1210(-101);
        }
        if ((var2 & 0x20) == 0) {
            this.field2465 = class141.field2354;
        } else {
            this.field2465 = arg0.method1233((byte) -77);
        }
        if ((var2 & 0x40) == 0) {
            this.field2466 = 0;
        } else {
            this.field2466 = arg0.method1214(-18254);
        }
    }
}
