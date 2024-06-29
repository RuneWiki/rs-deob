import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class177 {

    @OriginalMember(owner = "client!op", name = "d", descriptor = "Z")
    private boolean field2715 = true;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    private int field2726 = -1;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    private int field2721;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "[Ltda;")
    private class596[] field2730;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    private int field2717;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    private int field2712;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    private int field2718;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "Ltda;")
    private class596 field2729;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "[Ltda;")
    private class596[] field2719;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Ldb;")
    public static class298 field2722 = new class298(0, 0);

    @OriginalMember(owner = "client!op", name = "p", descriptor = "F")
    public static float field2727;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    private int field2716;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    private int field2725;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Lxa;")
    private class468 field2713;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILoa;B)Z")
    public final boolean method1189(int arg0, class651 arg1, byte arg2) {
        field2714++;
        if (this.field2726 != arg0) {
            this.field2726 = arg0;
            int var4 = class132.method996(arg0, -91);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field2716 != var4) {
                this.field2713 = null;
                this.field2716 = var4;
            }
            if (this.field2730 != null) {
                this.field2725 = 0;
                int[] var5 = new int[this.field2730.length];
                for (int var6 = 0; var6 < this.field2730.length; var6++) {
                    class596 var7 = this.field2730[var6];
                    if (var7.method3282(this.field2712, this.field2717, this.field2718, this.field2726)) {
                        var5[this.field2725] = var7.field7878;
                        this.field2719[this.field2725++] = var7;
                    }
                }
                class127.method975(var5, false, 0, this.field2725 - 1, this.field2719);
            }
            this.field2715 = true;
        }
        if (arg2 < 45) {
            method1194((byte) -3, 23);
        }
        boolean var8 = false;
        if (this.field2715) {
            this.field2715 = false;
            for (int var9 = this.field2725 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field2719[var9].method3287(arg1, this.field2729);
                var8 |= var10;
                this.field2715 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static final void method1190(int arg0) {
        field2724++;
        class488 var1 = null;
        try {
            var1 = class519.method2890("2", -88);
            class335 var2 = new class335(class100.field1501 * 6 + 3);
            var2.method1980(-345277664, 1);
            var2.method2031((byte) 54, class100.field1501);
            for (int var3 = arg0; var3 < class476.field6352.length; var3++) {
                if (class690.field9711[var3]) {
                    var2.method2031((byte) 54, var3);
                    var2.method1982(class476.field6352[var3], (byte) 63);
                }
            }
            var1.method2730(0, var2.field4600, var2.field4619, -1);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2729((byte) -89);
            }
        } catch (Exception var4) {
        }
        class615.field8139 = class681.method3802(arg0 ^ 0xFFFFA3D0);
        class193.field2825 = false;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILoa;IIIIIIII)V")
    public final void method1191(int arg0, class651 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg3 + arg6 & 0x3FFF;
        field2731++;
        if (this.field2721 == -1) {
            arg1.method415(arg0, arg5, arg9, arg4, arg7, 0);
        } else {
            class364 var12 = class508.field6776.method2760(this.field2721, 21351);
            if (this.field2713 == null && class508.field6776.method2759(arg2 + 32701, this.field2721)) {
                int[] var13 = var12.field4931 ? class508.field6776.method2762(0.7F, this.field2716, false, this.field2721, 7814, this.field2716) : class508.field6776.method2761((byte) 98, this.field2716, false, this.field2721, 0.7F, this.field2716);
                this.field2713 = arg1.method374(var13, 0, this.field2716, this.field2716, this.field2716);
            }
            if (var12.field4931) {
                arg1.method415(arg0, arg5, arg9, arg4, arg7, 0);
            }
            if (this.field2713 != null) {
                int var14 = var12.field4931 ? 1 : 0;
                int var15 = arg4 * arg8 / -4096;
                int var16;
                for (var16 = (arg9 - arg4) / 2 + (arg4 * var11 / 4096); var16 > arg4; var16 -= arg4) {
                }
                while (var16 < 0) {
                    var16 += arg4;
                }
                while (arg4 < var15) {
                    var15 -= arg4;
                }
                while (var15 < 0) {
                    var15 += arg4;
                }
                for (int var17 = var16 - arg4; var17 < arg9; var17 += arg4) {
                    for (int var18 = var15 - arg4; var18 < arg4; var18 += arg4) {
                        this.field2713.method274(var17 + arg0, arg5 + var18, arg4, arg4, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field2725 + arg2; var19 >= 0; var19--) {
            this.field2719[var19].method3289(arg1, arg0, arg5, arg9, arg4, arg8, var11);
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public final void method1192(int arg0) {
        field2728++;
        if (this.field2730 != null) {
            for (int var2 = 0; var2 < this.field2730.length; var2++) {
                this.field2730[var2].method3284();
            }
        }
        if (arg0 != 1) {
            this.field2715 = false;
        }
        this.field2713 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method1193(byte arg0) {
        if (arg0 < -87) {
            field2722 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)Z")
    public static final boolean method1194(byte arg0, int arg1) {
        int var2 = 86 / ((arg0 + 2) / 61);
        field2720++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I[Ltda;IIII)V")
    public class177(int arg0, class596[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2721 = arg0;
        this.field2730 = arg1;
        this.field2717 = arg4;
        this.field2712 = arg3;
        this.field2718 = arg5;
        if (arg1 == null) {
            this.field2729 = null;
            this.field2719 = null;
        } else {
            this.field2719 = new class596[arg1.length];
            this.field2729 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
