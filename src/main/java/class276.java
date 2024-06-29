import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class276 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    private int field4266 = 0;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    private int field4274 = -1;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lfk;")
    private class317 field4263 = new class317();

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Z")
    public boolean field4277 = false;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    private int field4265;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    private int field4264;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "[Lkh;")
    private class264[] field4273;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[[[I")
    private int[][][] field4267;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lug;")
    public static class25 field4261 = new class25(new byte[5000]);

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lfk;")
    public static class317 field4272 = new class317();

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
    public static int[] field4275 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)[[[I", line = 13)
    public final int[][][] method2023(byte arg0) {
        field4276++;
        if (this.field4265 != this.field4264) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 > -80) {
            return (int[][][]) ((int[][][]) null);
        } else {
            for (int var2 = 0; var2 < this.field4265; var2++) {
                this.field4273[var2] = class327.field5037;
            }
            return this.field4267;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V", line = 38)
    public static final void method2024(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4268++;
        if (arg2 >= class328.field5042 && class284.field4385 >= arg2) {
            int var5 = class268.method1965(arg1, class128.field2130, class43.field693, -117);
            int var6 = class268.method1965(arg3, class128.field2130, class43.field693, -70);
            class64.method635(var5, var6, arg4, arg2, true);
        }
        if (arg0 != 8) {
            method2028(-56, -69, -50, 89, 66, (class64) null, 114, 18L, true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III)V", line = 236)
    public class276(int arg0, int arg1, int arg2) {
        this.field4265 = arg0;
        this.field4264 = arg1;
        this.field4273 = new class264[this.field4264];
        this.field4267 = new int[this.field4265][3][arg2];
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)[[I", line = 67)
    public final int[][] method2025(boolean arg0, int arg1) {
        if (arg0) {
            this.field4264 = 0;
        }
        field4270++;
        if (this.field4265 == this.field4264) {
            this.field4277 = this.field4273[arg1] == null;
            this.field4273[arg1] = class327.field5037;
            return this.field4267[arg1];
        } else if (this.field4265 == 1) {
            this.field4277 = this.field4274 != arg1;
            this.field4274 = arg1;
            return this.field4267[0];
        } else {
            class264 var3 = this.field4273[arg1];
            if (var3 == null) {
                this.field4277 = true;
                if (this.field4266 >= this.field4265) {
                    class264 var4 = (class264) this.field4263.method2238((byte) 107);
                    var3 = new class264(arg1, var4.field4103);
                    this.field4273[var4.field4099] = null;
                    var4.method1357(947647010);
                } else {
                    var3 = new class264(arg1, this.field4266);
                    this.field4266++;
                }
                this.field4273[arg1] = var3;
            } else {
                this.field4277 = false;
            }
            this.field4263.method2237(true, var3);
            return this.field4267[var3.field4103];
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 134)
    public static final void method2026(int arg0) {
        field4269++;
        if (arg0 > -14) {
            return;
        }
        for (int var1 = -1; var1 < class66.field995; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class345.field5495[var1];
            }
            class171 var3 = class177.field2795[var2];
            if (var3 != null) {
                class353.method2488(var3.method808(5), var3, 11776);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 166)
    public static void method2027(int arg0) {
        field4272 = null;
        if (arg0 == 13050) {
            field4261 = null;
            field4275 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIILqf;IJZ)Z", line = 186)
    public static final boolean method2028(int arg0, int arg1, int arg2, int arg3, int arg4, class64 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class174.method1365(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V", line = 248)
    public final void method2029(int arg0) {
        field4262++;
        int var2 = 0;
        if (arg0 >= -84) {
            return;
        }
        while (var2 < this.field4265) {
            this.field4267[var2][0] = null;
            this.field4267[var2][1] = null;
            this.field4267[var2][2] = null;
            this.field4267[var2] = (int[][]) null;
            var2++;
        }
        this.field4267 = (int[][][]) null;
        this.field4273 = null;
        this.field4263.method2233(-119);
        this.field4263 = null;
    }
}
