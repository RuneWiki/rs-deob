import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class164 {

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    private int field2598;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "[[I")
    private int[][] field2599;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    private int field2600;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[I")
    public static int[] field2596 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Z")
    public static boolean field2595 = false;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Lok;")
    public static class41 field2594 = class137.method956(")2", 45);

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lol;")
    public static class118 field2597 = new class118(5000);

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2602 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field2606 = -1;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Lmh;")
    public static class65 field2605;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Ljava/lang/Thread;")
    public static Thread field2603;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)I", line = 5)
    public final int method1146(int arg0, boolean arg1) {
        field2587++;
        if (this.field2599 != null) {
            arg0 = (int) ((long) this.field2598 * (long) arg0 / (long) this.field2600) + 6;
        }
        return arg1 ? arg0 : 23;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 21)
    public static void method1147(int arg0) {
        field2597 = null;
        field2594 = null;
        field2605 = null;
        int var1 = 50 % ((arg0 - 16) / 52);
        field2603 = null;
        field2602 = null;
        field2596 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)I", line = 39)
    public final int method1148(int arg0, byte arg1) {
        field2592++;
        if (arg1 != 40) {
            method1151(-74, -58, 127, -15);
        }
        if (this.field2599 != null) {
            arg0 = (int) ((long) this.field2598 * (long) arg0 / (long) this.field2600);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)[Lel;", line = 54)
    public static final class83[] method1149(boolean arg0) {
        if (class223.field3566 == null) {
            class83[] var1 = class81.method576(126, class138.field2065);
            class83[] var2 = new class83[var1.length];
            int var3 = 0;
            label57: for (int var4 = 0; var4 < var1.length; var4++) {
                class83 var5 = var1[var4];
                if ((var5.field1207 <= 0 || var5.field1207 >= 24) && var5.field1209 >= 800 && var5.field1204 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class83 var7 = var2[var6];
                        if (var5.field1209 == var7.field1209 && var5.field1204 == var7.field1204) {
                            if (var5.field1207 > var7.field1207) {
                                var2[var6] = var5;
                            }
                            continue label57;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class223.field3566 = new class83[var3];
            class21.method141(var2, 0, class223.field3566, 0, var3);
            int[] var8 = new int[class223.field3566.length];
            for (int var9 = 0; var9 < class223.field3566.length; var9++) {
                class83 var10 = class223.field3566[var9];
                var8[var9] = var10.field1209 * var10.field1204;
            }
            class214.method1517(var8, (byte) 125, class223.field3566);
        }
        if (arg0) {
            field2602 = (Calendar) null;
        }
        field2593++;
        return class223.field3566;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([BI)[B", line = 139)
    public final byte[] method1150(byte[] arg0, int arg1) {
        if (this.field2599 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg0.length * (long) this.field2598 / (long) this.field2600) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var8 = this.field2599[var3];
                byte var9 = arg0[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var6[var4 + var10] += var8[var10] * var9;
                }
                int var11 = this.field2598 + var3;
                int var12 = var11 / this.field2600;
                var3 = var11 - this.field2600 * var12;
                var4 += var12;
            }
            arg0 = new byte[var5];
            for (int var13 = 0; var13 < var5; var13++) {
                int var14 = var6[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        field2591++;
        int var15 = 119 / ((44 - arg1) / 43);
        return arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)V", line = 210)
    public static final void method1151(int arg0, int arg1, int arg2, int arg3) {
        class46 var4 = class195.method1396(arg2, arg1, false);
        field2589++;
        var4.method337(arg2 ^ 0x9);
        var4.field719 = arg3;
        var4.field721 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(II)V", line = 231)
    public class164(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class314.method2171(arg0, arg1, (byte) -92);
            int var4 = arg1 / var3;
            this.field2598 = var4;
            int var5 = arg0 / var3;
            this.field2599 = new int[var5][14];
            this.field2600 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2599[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIZI)V", line = 302)
    public static final void method1152(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = arg0 - arg1;
        int var7 = arg3 - arg2;
        field2601++;
        if (var7 == 0) {
            if (var6 != 0) {
                class271.method1913(arg0, (byte) -118, arg2, arg1, arg5);
            }
        } else if (var6 == 0) {
            class223.method1604(-2238, arg3, arg1, arg2, arg5);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                int var10 = arg3;
                arg3 = arg0;
                arg0 = var10;
                arg2 = arg1;
                arg1 = var9;
            }
            if (arg3 < arg2) {
                int var11 = arg2;
                int var12 = arg1;
                arg2 = arg3;
                arg1 = arg0;
                arg3 = var11;
                arg0 = var12;
            }
            int var13 = arg1;
            int var14 = arg0 - arg1;
            int var15 = arg3 - arg2;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var16 = -(var15 >> 1);
            if (arg4) {
                method1152(27, -88, 105, 28, true, -74);
            }
            int var17 = arg1 >= arg0 ? -1 : 1;
            if (var8) {
                for (int var18 = arg2; var18 <= arg3; var18++) {
                    class239.field3829[var18][var13] = arg5;
                    var16 += var14;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg3; var19++) {
                    class239.field3829[var13][var19] = arg5;
                    var16 += var14;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            }
        }
    }
}
