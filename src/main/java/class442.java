import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class442 {

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    private int field6283 = -1;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Z")
    private boolean field6286 = true;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    private int field6287;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[Ljp;")
    private class251[] field6284;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    private int field6273;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    private int field6277;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    private int field6272;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[Ljp;")
    private class251[] field6278;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Ljp;")
    private class251 field6288;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lwk;")
    public static class155 field6276 = new class155(8);

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Lmo;")
    public static class336 field6289 = new class336(20);

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Z")
    public static boolean field6293;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    private int field6279;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    private int field6280;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lrn;")
    private class417 field6274;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Lnl;")
    public static class435 field6291;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILvc;IIIIIIII)V")
    public final void method2685(int arg0, class89 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6281++;
        int var11 = arg5 + arg7 & 0x3FFF;
        if (this.field6287 == -1) {
            arg1.method438(arg8, arg4, arg9, arg2, arg3, 0);
        } else {
            class308 var12 = class423.field5852.method1224((byte) 110, this.field6287);
            if (this.field6274 == null && class423.field5852.method1223(arg6 ^ 0xFFFF8B72, this.field6287)) {
                int[] var13 = var12.field4370 ? class423.field5852.method1231(this.field6287, this.field6279, this.field6279, false, arg6 - 22414, 0.7F) : class423.field5852.method1226(this.field6279, arg6 - 20, false, 0.7F, this.field6279, this.field6287);
                this.field6274 = arg1.method342(var13, 0, this.field6279, this.field6279, this.field6279);
            }
            if (!var12.field4370) {
                arg1.method438(arg8, arg4, arg9, arg2, arg3, 0);
            }
            if (this.field6274 != null) {
                int var14 = var12.field4370 ? 0 : 1;
                int var15 = arg0 * arg2 / -4096;
                int var16;
                for (var16 = arg2 * var11 / 4096 + (arg9 - arg2) / 2; var16 > arg2; var16 -= arg2) {
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (arg2 < var15) {
                    var15 -= arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg9; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field6274.method725(arg8 + var17, arg4 + var18, arg2, arg2, 0, 0, var14);
                    }
                }
            }
        }
        if (arg6 != 0) {
            this.field6283 = 61;
        }
        for (int var19 = this.field6280 - 1; var19 >= 0; var19--) {
            this.field6278[var19].method1720(arg1, arg8, arg4, arg9, arg2, arg0, var11);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method2686(int arg0) {
        if (this.field6284 != null) {
            for (int var2 = 0; var2 < this.field6284.length; var2++) {
                this.field6284[var2].method1719();
            }
        }
        if (arg0 != -1) {
            field6293 = false;
        }
        field6275++;
        this.field6274 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method2687(byte arg0) {
        class350.field4812.method460(62);
        field6282++;
        for (int var1 = 0; var1 < 32; var1++) {
            class297.field4203[var1] = 0L;
        }
        int var2 = 29 / ((-arg0 - 21) / 53);
        for (int var3 = 0; var3 < 32; var3++) {
            class124.field1687[var3] = 0L;
        }
        class102.field1432 = 0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lvc;IB)Z")
    public final boolean method2688(class89 arg0, int arg1, byte arg2) {
        if (this.field6283 != arg1) {
            this.field6283 = arg1;
            int var4 = class169.method1230(0, arg1);
            if (arg1 < var4) {
                var4 = class2.method10(-1, arg1);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field6279 != var4) {
                this.field6274 = null;
                this.field6279 = var4;
            }
            if (this.field6284 != null) {
                this.field6280 = 0;
                int[] var5 = new int[this.field6284.length];
                for (int var6 = 0; var6 < this.field6284.length; var6++) {
                    class251 var7 = this.field6284[var6];
                    if (var7.method1713(this.field6272, this.field6273, this.field6277, this.field6283)) {
                        var5[this.field6280] = var7.field3606;
                        this.field6278[this.field6280++] = var7;
                    }
                }
                class21.method151(59, this.field6280 - 1, 0, this.field6278, var5);
            }
            this.field6286 = true;
        }
        int var8 = 113 % ((-arg2 - 60) / 44);
        field6285++;
        boolean var9 = false;
        if (this.field6286) {
            this.field6286 = false;
            for (int var10 = this.field6280 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field6278[var10].method1717(arg0, this.field6288);
                this.field6286 |= !var11;
                var9 |= var11;
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
    public static void method2689(byte arg0) {
        field6291 = null;
        field6276 = null;
        int var1 = -7 / ((arg0 - 22) / 33);
        field6289 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I[Ljp;IIII)V")
    public class442(int arg0, class251[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6287 = arg0;
        this.field6284 = arg1;
        this.field6273 = arg4;
        this.field6277 = arg5;
        this.field6272 = arg3;
        if (arg1 == null) {
            this.field6278 = null;
            this.field6288 = null;
        } else {
            this.field6278 = new class251[arg1.length];
            this.field6288 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    static {
        new class151(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field6292 = -1;
        field6293 = false;
    }
}
