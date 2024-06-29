import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class232 {

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "[[I")
    private int[][] field3704;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    private int field3700;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    private int field3697;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field3696 = 0;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)I")
    public final int method1553(int arg0, byte arg1) {
        if (arg1 >= -87) {
            this.field3697 = 67;
        }
        if (this.field3704 != null) {
            arg0 = (int) ((long) this.field3697 * (long) arg0 / (long) this.field3700) + 6;
        }
        field3703++;
        return arg0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([BB)[B")
    public final byte[] method1554(byte[] arg0, byte arg1) {
        if (this.field3704 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3697 / (long) this.field3700) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3704[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3697 + var6;
                int var14 = var13 / this.field3700;
                var5 += var14;
                var6 = var13 - this.field3700 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field3699++;
        if (arg1 >= -117) {
            this.method1553(-73, (byte) 17);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        if (arg9 > -98) {
            return;
        }
        if (arg8 >= class223.field3423 && class148.field2338 >= arg8 && class223.field3423 <= arg2 && arg2 <= class148.field2338 && arg0 >= class223.field3423 && arg0 <= class148.field2338 && class223.field3423 <= arg4 && class148.field2338 >= arg4 && arg7 >= class90.field1568 && arg7 <= class266.field4247 && arg5 >= class90.field1568 && arg5 <= class266.field4247 && class90.field1568 <= arg3 && class266.field4247 >= arg3 && arg6 >= class90.field1568 && class266.field4247 >= arg6) {
            class190.method1277(arg1, arg3, arg7, arg4, arg6, arg5, arg0, 3, arg2, arg8);
        } else {
            class133.method919(arg8, arg3, arg0, arg4, arg5, arg2, arg6, arg7, -118, arg1);
        }
        field3701++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)V")
    public static final void method1556(int arg0, byte arg1, int arg2) {
        field3698++;
        class41 var3 = class221.method1492((byte) -42, arg2, 13);
        var3.method301(8792);
        if (arg1 < 103) {
            field3696 = 82;
        }
        var3.field584 = arg0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)I")
    public final int method1557(byte arg0, int arg1) {
        if (arg0 >= -109) {
            this.method1557((byte) 125, 73);
        }
        if (this.field3704 != null) {
            arg1 = (int) ((long) this.field3697 * (long) arg1 / (long) this.field3700);
        }
        field3695++;
        return arg1;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(II)V")
    public class232(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class295.method1976(arg1, arg0, 0);
            int var4 = arg0 / var3;
            this.field3704 = new int[var4][14];
            this.field3700 = var4;
            int var5 = arg1 / var3;
            this.field3697 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field3704[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
