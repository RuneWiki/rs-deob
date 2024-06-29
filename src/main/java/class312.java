import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class312 {

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    private int field4403 = -1;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Z")
    private boolean field4402 = true;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[Lhe;")
    private class370[] field4412;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    private int field4405;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    private int field4399;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    private int field4408;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    private int field4398;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[Lhe;")
    private class370[] field4400;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Lhe;")
    private class370 field4410;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[Lvr;")
    public static class135[] field4406 = new class135[300];

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4397 = -1;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    private int field4413;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    private int field4414;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lkr;")
    private class743 field4395;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 5)
    public final void method2018(int arg0) {
        field4411++;
        if (this.field4412 != null) {
            for (int var2 = 0; var2 < this.field4412.length; var2++) {
                this.field4412[var2].method2318();
            }
        }
        this.field4395 = null;
        if (arg0 < 25) {
            method2020(-35, null, 94);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 34)
    public static void method2019(byte arg0) {
        if (arg0 >= -79) {
            method2020(4, null, 56);
        }
        field4406 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/io/File;I)[B", line = 55)
    public static final byte[] method2020(int arg0, File arg1, int arg2) {
        field4394++;
        try {
            if (arg2 != 22711) {
                field4397 = 90;
            }
            byte[] var3 = new byte[arg0];
            class710.method3966(arg0, arg1, arg2 ^ 0x58F6, var3);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I[Lhe;IIII)V", line = 259)
    public class312(int arg0, class370[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4412 = arg1;
        this.field4405 = arg0;
        this.field4399 = arg3;
        this.field4408 = arg5;
        this.field4398 = arg4;
        if (arg1 == null) {
            this.field4410 = null;
            this.field4400 = null;
        } else {
            this.field4400 = new class370[arg1.length];
            this.field4410 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIILha;III)V", line = 82)
    public final void method2021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class58 arg6, int arg7, int arg8, int arg9) {
        if (arg1 != -22449) {
            method2020(93, null, 127);
        }
        field4407++;
        int var11 = arg5 + arg7 & 0x3FFF;
        if (this.field4405 == -1 || this.field4413 == 0) {
            arg6.method630(arg9, arg0, arg4, arg2, arg8, 0);
        } else {
            class546 var12 = class264.field3851.method1154(-116, this.field4405);
            if (this.field4395 == null && class264.field3851.method1152(this.field4405, 99)) {
                int[] var13 = var12.field7708 == 2 ? class264.field3851.method1155(this.field4413, false, this.field4405, (byte) 79, 0.7F, this.field4413) : class264.field3851.method1151(0.7F, this.field4413, false, arg1 ^ 0x1F13, this.field4405, this.field4413);
                this.field4395 = arg6.method561(this.field4413, var13, 0, this.field4413, 125, this.field4413);
            }
            if (var12.field7708 == 2) {
                arg6.method630(arg9, arg0, arg4, arg2, arg8, 0);
            }
            if (this.field4395 != null) {
                int var14 = var12.field7708 == 2 ? 1 : 0;
                int var15 = arg2 * arg3 / -4096;
                int var16;
                for (var16 = arg2 * var11 / 4096 + (arg4 - arg2) / 2; var16 > arg2; var16 -= arg2) {
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
                for (int var17 = var16 - arg2; var17 < arg4; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field4395.method4143(arg9 + var17, var18 - -arg0, arg2, arg2, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field4414 - 1; var19 >= 0; var19--) {
            this.field4400[var19].method2320(arg6, arg9, arg0, arg4, arg2, arg3, var11);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V", line = 158)
    public static final void method2022(int arg0, int arg1) {
        field4396++;
        class386.field5405 = arg0;
        class510 var2 = class620.field8954;
        synchronized (class620.field8954) {
            class620.field8954.method3048(false);
        }
        if (arg1 != 0) {
            method2019((byte) 10);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILha;I)Z", line = 172)
    public final boolean method2023(int arg0, class58 arg1, int arg2) {
        if (this.field4403 != arg0) {
            this.field4403 = arg0;
            int var4 = class271.method1797(2864, arg0);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field4413 != var4) {
                this.field4395 = null;
                this.field4413 = var4;
            }
            if (this.field4412 != null) {
                this.field4414 = 0;
                int[] var5 = new int[this.field4412.length];
                for (int var6 = 0; var6 < this.field4412.length; var6++) {
                    class370 var7 = this.field4412[var6];
                    if (var7.method2326(this.field4399, this.field4398, this.field4408, this.field4403)) {
                        var5[this.field4414] = var7.field5194;
                        this.field4400[this.field4414++] = var7;
                    }
                }
                class64.method684((byte) 118, var5, this.field4414 - 1, this.field4400, 0);
            }
            this.field4402 = true;
        }
        field4404++;
        boolean var8 = false;
        if (this.field4402) {
            this.field4402 = false;
            for (int var9 = this.field4414 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4400[var9].method2321(arg1, this.field4410);
                var8 |= var10;
                this.field4402 |= !var10;
            }
        }
        if (arg2 != 0) {
            field4409 = -77;
        }
        return var8;
    }
}
