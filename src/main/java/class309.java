import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class309 {

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "[[I")
    private int[][] field4804;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    private int field4801;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    private int field4803;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field4802 = 2;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2108(int arg0) {
        if (arg0 > -118) {
            method2108(-56);
        }
        class307 var1 = class141.field2180;
        synchronized (class141.field2180) {
            class19.field258 = class1.field17;
            class137.field2166++;
            if (class279.field4303 >= 0) {
                while (class96.field1537 != class279.field4303) {
                    int var3 = class194.field2895[class96.field1537];
                    class96.field1537 = class96.field1537 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class53.field902[var3] = true;
                    } else {
                        class53.field902[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class53.field902[var2] = false;
                }
                class279.field4303 = class96.field1537;
            }
            class1.field17 = class195.field2919;
        }
        field4806++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)I", line = 51)
    public static final int method2109(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)I", line = 63)
    public final int method2110(int arg0, int arg1) {
        if (arg0 < 30) {
            field4802 = -21;
        }
        if (this.field4804 != null) {
            arg1 = (int) ((long) this.field4801 * (long) arg1 / (long) this.field4803);
        }
        field4800++;
        return arg1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[B)[B", line = 88)
    public final byte[] method2111(int arg0, byte[] arg1) {
        field4807++;
        if (this.field4804 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4801 / (long) this.field4803) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field4804[var5];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var6 + var10] += var9[var10] * var8;
                }
                int var11 = this.field4801 + var5;
                int var12 = var11 / this.field4803;
                var6 += var12;
                var5 = var11 - this.field4803 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        if (arg0 != -1280199728) {
            field4802 = -77;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V", line = 154)
    public class309(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class258.method1770((byte) 73, arg1, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field4804 = new int[var5][14];
            this.field4801 = var4;
            this.field4803 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4804[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
                }
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)I", line = 218)
    public final int method2112(int arg0, int arg1) {
        if (arg0 <= 47) {
            return 0;
        }
        if (this.field4804 != null) {
            arg1 = (int) ((long) this.field4801 * (long) arg1 / (long) this.field4803) + 6;
        }
        field4799++;
        return arg1;
    }
}
