import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class66 extends class177 {

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    private int field978 = 32768;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "Z")
    public static volatile boolean field973 = true;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "Lek;")
    public static class184 field976;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lhb;II)V", line = 7)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field975++;
        if (arg1 != -18061) {
            return;
        }
        if (arg2 == 0) {
            this.field978 = arg0.method300(arg1 - 1394173571) << 4;
        } else if (arg2 == 1) {
            this.field2649 = arg0.method273(65280) == 1;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLjava/util/Random;I)I", line = 45)
    public static final int method561(boolean arg0, Random arg1, int arg2) {
        field977++;
        if (!arg0) {
            field976 = (class184) null;
        }
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class141.method1066((byte) -60, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class318.method2180(var4, arg2, (byte) 88);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Llb;II)Lhh;", line = 78)
    public static final class210 method562(class211 arg0, int arg1, int arg2) {
        field972++;
        byte[] var3 = arg0.method1505(arg1 - 439599487, arg2);
        if (var3 == null) {
            return null;
        } else if (arg1 == 439599372) {
            return new class210(var3);
        } else {
            return (class210) null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 92)
    public class66() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)[I", line = 98)
    public final int[] method95(int arg0, int arg1) {
        field971++;
        if (arg0 > -52) {
            this.method99(32, 8);
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -58);
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(arg1, 1, false);
            int[] var5 = this.method1280(arg1, 2, false);
            for (int var6 = 0; var6 < class287.field4415; var6++) {
                int var7 = (var4[var6] & 0xFFE) >> 4;
                int var8 = var5[var6] * this.field978 >> 12;
                int var9 = class156.field2345[var7] * var8 >> 12;
                int var10 = class307.field4795[var7] * var8 >> 12;
                int var11 = class133.field2090 & (var9 >> 12) + var6;
                int var12 = class11.field120 & arg1 + (var10 >> 12);
                int[] var13 = this.method1280(var12, 0, false);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)[[I", line = 152)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != -23387) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        field970++;
        if (this.field2645.field3203) {
            int[] var4 = this.method1280(arg0, 1, false);
            int[] var5 = this.method1280(arg0, 2, false);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class287.field4415; var9++) {
                int var10 = (var4[var9] * 255 & 0xFFF27) >> 12;
                int var11 = var5[var9] * this.field978 >> 12;
                int var12 = class156.field2345[var10] * var11 >> 12;
                int var13 = class133.field2090 & (var12 >> 12) + var9;
                int var14 = class307.field4795[var10] * var11 >> 12;
                int var15 = class11.field120 & (var14 >> 12) + arg0;
                int[][] var16 = this.method1285(0, var15, 27847);
                var6[var9] = var16[0][var13];
                var8[var9] = var16[1][var13];
                var7[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V", line = 204)
    public static void method563(int arg0) {
        if (arg0 != -943968628) {
            field973 = false;
        }
        field976 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 217)
    public final void method465(int arg0) {
        int var2 = -8 % ((arg0 + 6) / 43);
        field974++;
        class308.method2137(-121);
    }
}
