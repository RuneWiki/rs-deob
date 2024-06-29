import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class386 {

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
    private int field5130;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "[[I")
    private int[][] field5128;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    private int field5127;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
    public static int field5134 = 0;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "Lxa;")
    public static class468 field5133;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)I", line = 4)
    public final int method2240(int arg0, int arg1) {
        if (arg1 != 6) {
            return 42;
        }
        field5135++;
        if (this.field5128 != null) {
            arg0 = (int) ((long) this.field5127 * (long) arg0 / (long) this.field5130);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V", line = 22)
    public static void method2241(int arg0) {
        if (arg0 < 70) {
            method2245(74, (byte) -59, (char) 65499);
        }
        field5133 = null;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(II)I", line = 34)
    public final int method2242(int arg0, int arg1) {
        if (this.field5128 != null) {
            arg1 = (int) ((long) this.field5127 * (long) arg1 / (long) this.field5130) + 6;
        }
        if (arg0 == 6) {
            field5132++;
            return arg1;
        } else {
            return 57;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "([BI)[B", line = 49)
    public final byte[] method2243(byte[] arg0, int arg1) {
        if (arg1 != 4) {
            return null;
        }
        field5129++;
        if (this.field5128 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field5127 / (long) this.field5130) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field5128[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5127 + var6;
                int var14 = var13 / this.field5130;
                var6 = var13 - this.field5130 * var14;
                var5 += var14;
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

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ldw;IIIII)V", line = 116)
    public static final void method2244(class673 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field9523 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field9524[var6] != null) {
                arg0.field9523++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field9523; var7++) {
            long var8 = class510.field6812[arg1][arg2][arg3];
            while (var8 != 0L) {
                class225 var14 = class350.field4791[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field9524[var7] == var14.field3173) {
                    continue label50;
                }
            }
            long var10 = class510.field6812[arg1][arg4][arg5];
            while (var10 != 0L) {
                class225 var13 = class350.field4791[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field9524[var7] == var13.field3173) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field9523 - 1; var12++) {
                arg0.field9524[var12] = arg0.field9524[var12 + 1];
            }
            arg0.field9523--;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBC)I", line = 170)
    public static final int method2245(int arg0, byte arg1, char arg2) {
        field5131++;
        if (arg1 <= 4) {
            method2241(-64);
        }
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(II)V", line = 190)
    public class386(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class634.method3504(arg0, -1, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field5130 = var5;
            this.field5128 = new int[var5][14];
            this.field5127 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field5128[var6];
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
                while (var10 < var11) {
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
