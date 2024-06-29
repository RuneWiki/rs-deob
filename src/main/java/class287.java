import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class287 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    private int field5053;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    private int field5058;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "[[I")
    private int[][] field5059;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Leg;")
    public static class37 field5056 = class174.method1167("Chargement des sprites )2 ", -66);

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Leg;")
    public static class37 field5054 = class174.method1167("unzap", -94);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)I")
    public final int method1918(byte arg0, int arg1) {
        field5061++;
        if (this.field5059 != null) {
            arg1 = (int) ((long) this.field5053 * (long) arg1 / (long) this.field5058);
        }
        return arg0 == 22 ? arg1 : 66;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1919(int arg0, byte[] arg1) {
        field5055++;
        if (arg0 != 28159) {
            return null;
        }
        if (this.field5059 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5053 / (long) this.field5058) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field5059[var4];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5053 + var4;
                int var14 = var13 / this.field5058;
                var4 = var13 - this.field5058 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIII)V")
    public static final void method1920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5060++;
        if (arg3 != -1) {
            field5056 = null;
        }
        if (arg4 >= class178.field2972 && arg4 <= class217.field3741) {
            int var5 = class139.method975(class286.field5050, true, arg1, class96.field1507);
            int var6 = class139.method975(class286.field5050, true, arg2, class96.field1507);
            class1.method1(arg0, var6, var5, arg4, 119);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method1921(byte arg0) {
        field5056 = null;
        int var1 = -18 / ((-arg0 - 4) / 54);
        field5054 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I")
    public final int method1922(int arg0, int arg1) {
        if (arg0 > -75) {
            this.method1919(74, (byte[]) null);
        }
        if (this.field5059 != null) {
            arg1 = ((int) ((long) this.field5053 * (long) arg1 / (long) this.field5058)) + 6;
        }
        field5057++;
        return arg1;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(II)V")
    public class287(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class267.method1795(arg1, arg0, false);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field5053 = var5;
            this.field5058 = var4;
            this.field5059 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field5059[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var7 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
