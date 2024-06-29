import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class149 {

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "[[I")
    private int[][] field2570;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    private int field2573;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Le;")
    private static class191 field2565 = class54.method368("Examine", 2047);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Le;")
    public static class191 field2563 = field2565;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[I")
    public static int[] field2562 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Le;")
    private static class191 field2571 = class54.method368(" from your friend list first)3", 2047);

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Le;")
    public static class191 field2568 = field2571;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Lef;")
    public static class175 field2577 = new class175();

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "Lef;")
    public static class175 field2578 = new class175();

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lod;")
    public static class181 field2579 = new class181();

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[I")
    public static int[] field2567;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([BI)[B")
    public final byte[] method1012(byte[] arg0, int arg1) {
        field2564++;
        if (arg1 != -5141) {
            this.method1018(-88, -67);
        }
        if (this.field2570 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2573 / (long) this.field2572) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field2570[var5];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field2573 + var5;
                int var14 = var13 / this.field2572;
                var5 = var13 - this.field2572 * var14;
                var6 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method1013(int arg0) {
        field2563 = null;
        field2562 = null;
        field2568 = null;
        field2579 = null;
        field2567 = null;
        field2578 = null;
        if (arg0 != 4478) {
            method1014(-52, -28, 69, -106, (class16) null, -27L, (class16) null, (class16) null);
        }
        field2577 = null;
        field2571 = null;
        field2565 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIILbe;JLbe;Lbe;)V")
    public static final void method1014(int arg0, int arg1, int arg2, int arg3, class16 arg4, long arg5, class16 arg6, class16 arg7) {
        class269 var9 = new class269();
        var9.field4749 = arg4;
        var9.field4740 = arg1 * 128 + 64;
        var9.field4746 = arg2 * 128 + 64;
        var9.field4744 = arg3;
        var9.field4745 = arg5;
        var9.field4738 = arg6;
        var9.field4741 = arg7;
        int var10 = 0;
        class199 var11 = class201.field3608[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3550; var12++) {
                class12 var13 = var11.field3549[var12];
                if ((var13.field136 & 0x400000L) == 4194304L) {
                    int var14 = var13.field155.method126();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4739 = -var10;
        if (class201.field3608[arg0][arg1][arg2] == null) {
            class201.field3608[arg0][arg1][arg2] = new class199(arg0, arg1, arg2);
        }
        class201.field3608[arg0][arg1][arg2].field3553 = var9;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZII)I")
    public static final int method1015(boolean arg0, int arg1, int arg2) {
        field2566++;
        class34 var3 = (class34) class91.field1475.method612((long) arg1, true);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field638.length; var5++) {
                if (var3.field634[var5] == arg2) {
                    var4 += var3.field638[var5];
                }
            }
            if (arg0) {
                field2571 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
    public final int method1016(int arg0, int arg1) {
        if (arg1 != 0) {
            return 47;
        }
        field2576++;
        if (this.field2570 != null) {
            arg0 = (int) ((long) this.field2573 * (long) arg0 / (long) this.field2572) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)I")
    public static final int method1017(int arg0) {
        if (arg0 == 0) {
            field2574++;
            return 0;
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)I")
    public final int method1018(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method1012((byte[]) null, 9);
        }
        if (this.field2570 != null) {
            arg1 = (int) ((long) this.field2573 * (long) arg1 / (long) this.field2572);
        }
        field2569++;
        return arg1;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(II)V")
    public class149(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class45.method313(arg0, arg1, 127);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field2570 = new int[var5][14];
            this.field2573 = var4;
            this.field2572 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2570[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
