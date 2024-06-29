import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class415 {

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    private int field5897;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    private int field5894;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "[[I")
    private int[][] field5900;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field5903 = 0;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)I", line = 6)
    public final int method2500(byte arg0, int arg1) {
        if (arg0 >= -41) {
            return 1;
        }
        if (this.field5900 != null) {
            arg1 = (int) ((long) this.field5897 * (long) arg1 / (long) this.field5894) + 6;
        }
        field5902++;
        return arg1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[B)[B", line = 21)
    public final byte[] method2501(int arg0, byte[] arg1) {
        if (arg0 >= -31) {
            this.method2501(85, null);
        }
        if (this.field5900 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5897 / (long) this.field5894) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field5900[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5897 + var6;
                int var14 = var13 / this.field5894;
                var6 = var13 - this.field5894 * var14;
                var5 += var14;
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
        field5896++;
        return arg1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIZ)Z", line = 89)
    public static final boolean method2502(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field5903 = 29;
        }
        field5899++;
        return (arg1 & 0x800) != 0 | class363.method2286(arg0, arg1, 542) || class26.method116(-100, arg1, arg0);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)[I", line = 102)
    public static final int[] method2503(int arg0) {
        field5893++;
        if (arg0 < 77) {
            field5903 = -31;
        }
        return new int[] { class505.field7348, class555.field8066, class265.field3791 };
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(BI)I", line = 117)
    public final int method2504(byte arg0, int arg1) {
        int var3 = -14 / ((arg0 + 22) / 48);
        if (this.field5900 != null) {
            arg1 = (int) ((long) this.field5897 * (long) arg1 / (long) this.field5894);
        }
        field5901++;
        return arg1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V", line = 132)
    public static final void method2505(boolean arg0) {
        class253.field3661.method2782(0);
        field5895++;
        class535.field7789.method2458(16291);
        class660.field9437.method1572(-1);
        class95.field1383.setBackground(Color.black);
        class112.field1585 = -1;
        class253.field3661 = class140.method994(class95.field1383, !arg0);
        class535.field7789 = class26.method109(class95.field1383, 12566, arg0);
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(II)V", line = 146)
    public class415(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class201.method1425((byte) -117, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field5897 = var5;
            this.field5894 = var4;
            this.field5900 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5900[var6];
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

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[S)[S", line = 210)
    public final short[] method2506(int arg0, short[] arg1) {
        if (arg0 != 30130) {
            this.method2500((byte) 12, 119);
        }
        if (this.field5900 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5897 / (long) this.field5894) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field5900[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field5897 + var6;
                int var14 = var13 / this.field5894;
                var6 = var13 - this.field5894 * var14;
                var5 += var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 > 32767) {
                    arg1[var8] = 32767;
                } else {
                    arg1[var8] = (short) var9;
                }
            }
        }
        field5898++;
        return arg1;
    }
}
