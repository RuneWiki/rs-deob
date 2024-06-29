import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class277 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    private int field4056;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[[I")
    private int[][] field4059;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    private int field4064;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field4060 = 0;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "[Z")
    public static boolean[] field4063 = new boolean[112];

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field4066 = 1;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Lir;")
    public static class185 field4061;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Ltj;")
    public static class298 field4058;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lpl;")
    public static class356 field4070;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "[[Z")
    public static boolean[][] field4069;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)I", line = 9)
    public final int method1819(boolean arg0, int arg1) {
        field4068++;
        if (arg0) {
            return -76;
        } else {
            if (this.field4059 != null) {
                arg1 = (int) ((long) this.field4064 * (long) arg1 / (long) this.field4056) + 6;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 30)
    public static void method1820(byte arg0) {
        field4063 = null;
        field4061 = null;
        field4070 = null;
        if (arg0 != 96) {
            method1821(false);
        }
        field4058 = null;
        field4069 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(II)V", line = 54)
    public class277(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class116.method854(arg0, arg1, -82);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field4056 = var4;
            this.field4059 = new int[var4][14];
            this.field4064 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field4059[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
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

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)I", line = 114)
    public static final int method1821(boolean arg0) {
        field4065++;
        if (arg0) {
            field4070 = null;
        }
        return ((class389.field5692 == 0 ? 0 : 1) << 22) + ((class227.field3128 == 0 ? 0 : 1) << 20) + ((class1.field10 ? 1 : 0) << 16) + ((class452.field6560 ? 1 : 0) << 15) + ((class330.field4863 & 0x3) << 11) + ((class423.field6169 ? 1 : 0) << 9) + ((class407.field5937 ? 1 : 0) << 8) + ((class397.field5799 ? 1 : 0) << 6) + ((class378.field5531 & 0x7) - -((class236.field3294 ? 1 : 0) << 3) + (((class232.field3223 ? 1 : 0) << 4) - -((class24.field434 ? 1 : 0) << 5) - (-((class354.field5256 ? 1 : 0) << 10) - (((class273.field4015 ? 1 : 0) << 13) + (class249.field3681 << 17) + ((class338.field4993 ? 1 : 0) << 19) + (((class154.field1961 == 0 ? 0 : 1) << 21) + (class190.method1265(23620) << 23) - -(class116.field1508 << 25))))) - (-((class257.field3775 ? 1 : 0) << 27) - (class325.field4817 << 28)));
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[B)[B", line = 125)
    public final byte[] method1822(int arg0, byte[] arg1) {
        if (this.field4059 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4064 / (long) this.field4056) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field4059[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4064 + var6;
                int var14 = var13 / this.field4056;
                var5 += var14;
                var6 = var13 - this.field4056 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field4057++;
        if (arg0 != 1109803458) {
            this.field4056 = 19;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I", line = 193)
    public final int method1823(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1819(false, -60);
        }
        if (this.field4059 != null) {
            arg1 = (int) ((long) this.field4064 * (long) arg1 / (long) this.field4056);
        }
        field4062++;
        return arg1;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Z", line = 211)
    public static final boolean method1824(int arg0, int arg1) {
        if (arg1 >= -84) {
            field4070 = null;
        }
        field4067++;
        if (arg0 == 8 || arg0 == 4 || arg0 == 47 || arg0 == 15 || arg0 == 30 || arg0 == 3 || arg0 == 21 || arg0 == 33) {
            return true;
        } else if (arg0 == 6 || arg0 == 51 || arg0 == 1002 || arg0 == 1008) {
            return true;
        } else if (arg0 == 1 || arg0 == 41 || arg0 == 60 || arg0 == 5 || arg0 == 13) {
            return true;
        } else {
            return arg0 == 22 || arg0 == 50 || arg0 == 11 || arg0 == 2 || arg0 == 26 || arg0 == 59;
        }
    }
}
