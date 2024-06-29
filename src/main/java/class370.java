import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class370 {

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    private int field5326 = -1;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "Z")
    private boolean field5340 = true;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    private int field5334;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    private int field5332;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[Lcfa;")
    private class186[] field5338;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    private int field5327;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    private int field5323;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "[Lcfa;")
    private class186[] field5330;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "Lcfa;")
    private class186 field5336;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "[I")
    public static int[] field5325 = new int[14];

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "Lqk;")
    public static class1 field5335 = new class1(24, -1);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    private int field5328;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    private int field5329;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Lho;")
    private class318 field5339;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "[[B")
    public static byte[][] field5341;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V", line = 7)
    public static void method2304(boolean arg0) {
        field5341 = null;
        if (!arg0) {
            field5335 = null;
            field5325 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIILha;IIII)V", line = 20)
    public final void method2305(int arg0, int arg1, int arg2, int arg3, int arg4, class473 arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg8 + arg9 & 0x3FFF;
        field5333++;
        if (this.field5327 == -1 || this.field5328 == 0) {
            arg5.method233(arg1, arg2, arg3, arg7, arg4, 0);
        } else {
            class744 var12 = class785.field10772.method581(arg0 ^ 0x54E3, this.field5327);
            if (this.field5339 == null && class785.field10772.method583(12101, this.field5327)) {
                int[] var13 = var12.field10258 == 2 ? class785.field10772.method579(this.field5327, 0.7F, false, 5084, this.field5328, this.field5328) : class785.field10772.method578(this.field5328, false, this.field5327, 0.7F, true, this.field5328);
                this.field5339 = arg5.method2815(var13, (byte) -39, this.field5328, this.field5328, this.field5328, 0);
            }
            if (var12.field10258 == 2) {
                arg5.method233(arg1, arg2, arg3, arg7, arg4, 0);
            }
            if (this.field5339 != null) {
                int var14 = var12.field10258 == 2 ? 1 : 0;
                int var15 = arg6 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg3 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (var15 > arg7) {
                    var15 -= arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg3; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field5339.method2028(arg1 + var17, arg2 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field5329 + arg0; var19 >= 0; var19--) {
            this.field5330[var19].method1160(arg5, arg1, arg2, arg3, arg7, arg6, var11);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lha;BI)Z", line = 94)
    public final boolean method2306(class473 arg0, byte arg1, int arg2) {
        field5331++;
        if (this.field5326 != arg2) {
            this.field5326 = arg2;
            int var4 = class47.method385(arg2, -114);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field5328 != var4) {
                this.field5339 = null;
                this.field5328 = var4;
            }
            if (this.field5338 != null) {
                this.field5329 = 0;
                int[] var5 = new int[this.field5338.length];
                for (int var6 = 0; var6 < this.field5338.length; var6++) {
                    class186 var7 = this.field5338[var6];
                    if (var7.method1164(this.field5332, this.field5334, this.field5323, this.field5326)) {
                        var5[this.field5329] = var7.field2327;
                        this.field5330[this.field5329++] = var7;
                    }
                }
                class546.method3231(this.field5330, 0, this.field5329 - 1, Integer.MAX_VALUE, var5);
            }
            this.field5340 = true;
        }
        boolean var8 = false;
        if (this.field5340) {
            this.field5340 = false;
            for (int var9 = this.field5329 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5330[var9].method1161(arg0, this.field5336);
                var8 |= var10;
                this.field5340 |= !var10;
            }
        }
        if (arg1 != 36) {
            this.field5327 = -45;
        }
        return var8;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 182)
    public final void method2307(byte arg0) {
        if (arg0 != 23) {
            this.method2305(3, 118, 30, 39, 2, null, -2, -92, 91, 79);
        }
        if (this.field5338 != null) {
            for (int var2 = 0; var2 < this.field5338.length; var2++) {
                this.field5338[var2].method1167();
            }
        }
        field5337++;
        this.field5339 = null;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(I[Lcfa;IIII)V", line = 236)
    public class370(int arg0, class186[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5334 = arg4;
        this.field5332 = arg3;
        this.field5338 = arg1;
        this.field5327 = arg0;
        this.field5323 = arg5;
        if (arg1 == null) {
            this.field5330 = null;
            this.field5336 = null;
        } else {
            this.field5330 = new class186[arg1.length];
            this.field5336 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V", line = 213)
    public static final void method2308(byte arg0) {
        if (arg0 != 11) {
            field5341 = null;
        }
        field5324++;
        if (!class590.field8317) {
            class590.field8317 = true;
            class256.field3781 += (-12.0F - class256.field3781) / 2.0F;
            class109.field1314 = true;
        }
    }
}
