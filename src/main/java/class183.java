import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class183 extends class305 {

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    private int field2789 = 4096;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "[I")
    private int[] field2794 = new int[3];

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    private int field2800 = 4096;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    private int field2791 = 4096;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    private int field2797 = 409;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "[I")
    public static int[] field2798 = new int[1];

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "Ljp;")
    public static class55 field2796 = new class55(15, -2);

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "Lsc;")
    public static class270 field2803 = new class270(1, 2, 2, 0);

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "Ljp;")
    public static class55 field2804 = new class55(31, 6);

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "Lvg;")
    public static class56 field2805 = new class56(8);

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "Lpn;")
    public static class49 field2806 = new class49(78, -1);

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIB)V", line = 7)
    public static final void method1276(int arg0, int arg1, byte arg2) {
        ++field2799;
        if (arg2 <= -29) {
            class188 var3 = class10.method48((byte) 85, 1, arg0);
            var3.method1308(false);
            var3.field2873 = arg1;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)[[I", line = 21)
    public final int[][] method72(int arg0, byte arg1) {
        if (arg1 > -59) {
            return null;
        } else {
            ++field2792;
            int[][] var3 = super.field4674.method2206(-14, arg0);
            if (super.field4674.field5110) {
                int[][] var4 = this.method2015(true, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class91.field1471 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field2794[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~var13 < ~this.field2797) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field2794[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (this.field2797 < var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field2794[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field2797) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field2791 * var12 >> 12;
                                var9[var11] = this.field2789 * var14 >> 12;
                                var10[var11] = this.field2800 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B[B)[B", line = 116)
    public static final byte[] method1277(byte arg0, byte[] arg1) {
        ++field2790;
        if (arg0 != -113) {
            field2803 = null;
        }
        class194 var2 = new class194(arg1);
        int var3 = var2.method1337((byte) 17);
        int var4 = var2.method1401(arg0 ^ 53);
        if (~var4 <= -1 && (class129.field1920 == 0 || var4 <= class129.field1920)) {
            if (~var3 == -1) {
                byte[] var5 = new byte[var4];
                var2.method1338(0, var4, var5, 101);
                return var5;
            } else {
                int var6 = var2.method1401(127);
                if (~var6 <= -1 && (class129.field1920 == 0 || class129.field1920 >= var6)) {
                    byte[] var7 = new byte[var6];
                    if (~var3 != -2) {
                        class213.field3243.method2745(var7, true, var2);
                    } else {
                        class520.method3065(var7, var6, arg1, var4, 9);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILfh;B)V", line = 170)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 <= 76) {
            method1277((byte) -51, (byte[]) null);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg1.method1339(-32768);
                            this.field2794[2] = class307.method2028(var5, 255) >> 12;
                            this.field2794[1] = class307.method2028(var5 >> 4, 4080);
                            this.field2794[0] = class307.method2028(267386880, var5 << 4);
                        }
                    } else {
                        this.field2791 = arg1.method1396(-107);
                    }
                } else {
                    this.field2789 = arg1.method1396(-109);
                }
            } else {
                this.field2800 = arg1.method1396(46);
            }
        } else {
            this.field2797 = arg1.method1396(-7);
        }
        ++field2801;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V", line = 240)
    public static void method1278(int arg0) {
        field2804 = null;
        field2798 = null;
        field2805 = null;
        if (arg0 == 4096) {
            field2796 = null;
            field2806 = null;
            field2803 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 272)
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 281)
    public static final boolean method1279(int arg0, String arg1) {
        ++field2795;
        if (arg1 == null) {
            return false;
        } else {
            int var2 = -26 / ((arg0 - -42) / 53);
            for (int var3 = 0; ~var3 > ~class6.field80; ++var3) {
                if (arg1.equalsIgnoreCase(class265.field4229[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(class116.field1781.field7437);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(BII)Z", line = 311)
    public static final boolean method1280(byte arg0, int arg1, int arg2) {
        ++field2793;
        if (arg0 <= 34) {
            method1280((byte) 55, 3, -2);
        }
        return (arg1 & 2048) != 0 | class2.method12(arg1, 7963, arg2) || class229.method1555(arg1, arg2, (byte) 119);
    }
}
