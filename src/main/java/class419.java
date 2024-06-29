import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class419 {

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Z")
    private boolean field5893 = true;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    private int field5900 = -1;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    private int field5894;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[Lpm;")
    private class420[] field5891;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    private int field5892;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    private int field5899;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    private int field5911;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[Lpm;")
    private class420[] field5895;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Lpm;")
    private class420 field5910;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Leh;")
    public static class246 field5896 = new class246(74, 5);

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field5909 = 0;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    private int field5904;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    private int field5906;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lo;")
    private class24 field5903;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field5901;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILza;IIIIIIII)V")
    public final void method2479(int arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg6 + arg3 & 0x3FFF;
        field5905++;
        if (this.field5892 == -1) {
            arg1.method325(arg7, arg5, arg8, arg2, arg0, 0);
        } else {
            class222 var12 = class377.field5348.method83(this.field5892, 123);
            if (this.field5903 == null && class377.field5348.method82(this.field5892, -18226)) {
                int[] var13 = var12.field3185 ? class377.field5348.method79(false, this.field5906, this.field5892, this.field5906, 0.7F, -20550) : class377.field5348.method81((byte) 106, this.field5906, this.field5892, 0.7F, false, this.field5906);
                this.field5903 = arg1.method344(var13, 0, this.field5906, this.field5906, this.field5906);
            }
            if (var12.field3185) {
                arg1.method325(arg7, arg5, arg8, arg2, arg0, 0);
            }
            if (this.field5903 != null) {
                int var14 = var12.field3185 ? 1 : 0;
                int var15 = arg2 * arg9 / -4096;
                int var16;
                for (var16 = (arg8 - arg2) / 2 + (arg2 * var11 / 4096); var16 > arg2; var16 -= arg2) {
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (var15 > arg2) {
                    var15 -= arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg8; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field5903.method162(arg7 + var17, var18 - -arg5, arg2, arg2, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field5904 - 1; var19 >= 0; var19--) {
            this.field5895[var19].method2490(arg1, arg7, arg5, arg8, arg2, arg9, var11);
        }
        if (arg4 > -73) {
            this.field5911 = -128;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)B")
    public static final byte method2480(int arg0, int arg1, byte arg2) {
        if (arg2 != 93) {
            return 118;
        }
        field5908++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lza;II)Z")
    public final boolean method2481(class290 arg0, int arg1, int arg2) {
        field5897++;
        if (this.field5900 != arg2) {
            this.field5900 = arg2;
            int var4 = class372.method2180(-16744, arg2);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field5906 != var4) {
                this.field5906 = var4;
                this.field5903 = null;
            }
            if (this.field5891 != null) {
                this.field5904 = 0;
                int[] var5 = new int[this.field5891.length];
                for (int var6 = 0; var6 < this.field5891.length; var6++) {
                    class420 var7 = this.field5891[var6];
                    if (var7.method2492(this.field5911, this.field5899, this.field5894, this.field5900)) {
                        var5[this.field5904] = var7.field5922;
                        this.field5895[this.field5904++] = var7;
                    }
                }
                class330.method1984(this.field5895, var5, 0, true, this.field5904 - 1);
            }
            this.field5893 = true;
        }
        boolean var8 = false;
        if (arg1 != 2257) {
            method2484(null, -104, (byte) -114, -33, 110, 60, null, 115, -80L);
        }
        if (this.field5893) {
            this.field5893 = false;
            for (int var9 = this.field5904 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5895[var9].method2489(arg0, this.field5910);
                var8 |= var10;
                this.field5893 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method2482(int arg0) {
        if (arg0 != -25240) {
            method2480(57, 104, (byte) -1);
        }
        field5896 = null;
        field5901 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public final void method2483(byte arg0) {
        if (arg0 != -31) {
            method2480(2, -19, (byte) 82);
        }
        field5898++;
        if (this.field5891 != null) {
            for (int var2 = 0; var2 < this.field5891.length; var2++) {
                this.field5891[var2].method2491();
            }
        }
        this.field5903 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lta;IBIIILhm;IJ)V")
    public static final void method2484(class145 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class150 arg6, int arg7, long arg8) {
        field5902++;
        int var10 = arg3 * arg3 + (arg1 * arg1);
        if (arg8 < (long) var10) {
            return;
        }
        if (arg2 >= -98) {
            method2480(-89, -75, (byte) 30);
        }
        int var11 = Math.min(arg6.field2113 / 2, arg6.field2033 / 2);
        if (var11 * var11 >= var10) {
            class214.method1341(arg3, arg6, arg7, 0, arg0, class324.field4727[arg5], arg4, arg1);
            return;
        }
        var11 -= 10;
        int var12;
        if (class504.field7461 == 4) {
            var12 = (int) class153.field2204 & 0x3FFF;
        } else {
            var12 = (int) class153.field2204 + class460.field6441 & 0x3FFF;
        }
        int var13 = class95.field1242[var12];
        int var14 = class95.field1241[var12];
        if (class504.field7461 != 4) {
            var14 = var14 * 256 / (class98.field1304 + 256);
            var13 = var13 * 256 / (class98.field1304 + 256);
        }
        int var15 = arg1 * var13 + (arg3 * var14) >> 15;
        int var16 = arg1 * var14 - (arg3 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class149.field1976[arg5].method142((float) arg6.field2113 / 2.0F + (float) arg7 + (float) var19, (float) arg6.field2033 / 2.0F + (float) arg4 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I[Lpm;IIII)V")
    public class419(int arg0, class420[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5894 = arg5;
        this.field5891 = arg1;
        this.field5892 = arg0;
        this.field5899 = arg4;
        this.field5911 = arg3;
        if (arg1 == null) {
            this.field5910 = null;
            this.field5895 = null;
        } else {
            this.field5895 = new class420[arg1.length];
            this.field5910 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
