import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class148 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    private int field2569;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[[I")
    private int[][] field2568;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2567 = 0;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Lme;")
    public static final class44 method996(int arg0, int arg1, int arg2) {
        field2565++;
        class44 var3 = class221.method1456(arg0, (byte) -15);
        if (arg1 == arg2) {
            return var3;
        } else if (var3 == null || var3.field1015 == null || var3.field1015.length <= arg2) {
            return null;
        } else {
            return var3.field1015[arg2];
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[B)[B")
    public final byte[] method997(int arg0, byte[] arg1) {
        if (this.field2568 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2569 / (long) this.field2562) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2568[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2569 + var6;
                int var14 = var13 / this.field2562;
                var6 = var13 - this.field2562 * var14;
                var4 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        int var15 = -65 / ((75 - arg0) / 49);
        field2571++;
        return arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)I")
    public final int method998(boolean arg0, int arg1) {
        field2572++;
        if (arg0) {
            if (this.field2568 != null) {
                arg1 = (int) ((long) this.field2569 * (long) arg1 / (long) this.field2562) + 6;
            }
            return arg1;
        } else {
            return 104;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V")
    public static final void method999(byte arg0, int arg1) {
        field2564++;
        if (arg0 > -51) {
            method999((byte) 100, 44);
        }
        class75.field1462.method831(arg1, -125);
        class80.field1560.method831(arg1, -126);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(BI)I")
    public static final int method1000(byte arg0, int arg1) {
        field2563++;
        if (arg0 != -3) {
            return 113;
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xE2) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(II)V")
    public class148(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class87.method655(arg1, -32686, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field2562 = var5;
            this.field2569 = var4;
            this.field2568 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2568[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(ZI)I")
    public final int method1001(boolean arg0, int arg1) {
        if (arg0) {
            this.method1001(true, -96);
        }
        field2566++;
        if (this.field2568 != null) {
            arg1 = (int) ((long) this.field2569 * (long) arg1 / (long) this.field2562);
        }
        return arg1;
    }
}
