import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class486 {

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Z")
    private boolean field7105 = true;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    private int field7106 = -1;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    private int field7116;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    private int field7118;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    private int field7119;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    private int field7113;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[Lgb;")
    private class120[] field7104;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[Lgb;")
    private class120[] field7110;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lgb;")
    private class120 field7108;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    private int field7107;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    private int field7117;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lo;")
    private class363 field7103;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lum;")
    public static class83 field7121;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method2935(int arg0) {
        field7121 = null;
        if (arg0 != -15511) {
            field7121 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static final void method2936(int arg0) {
        if (arg0 != 8137) {
            field7121 = null;
        }
        field7102++;
        int var1 = class40.field667.method418(arg0 ^ 0xFFFFE058, class108.field1631);
        if (var1 == 0) {
            class107.field1627 = null;
            class114.method876(1, 0);
        } else if (var1 == 1) {
            class23.method140(8607, (byte) 0);
            class114.method876(1, 512);
            if (class229.field3460 != null) {
                class481.method2905(false);
            }
        } else {
            class23.method140(arg0 ^ 0x3E56, (byte) (class334.field5036 - 4 & 0xFF));
            class114.method876(arg0 - 8136, 2);
        }
        class310.field4721 = class30.field370;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIILza;IIII)V")
    public final void method2937(int arg0, int arg1, int arg2, int arg3, int arg4, class299 arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg1 + arg2 & 0x3FFF;
        field7120++;
        if (this.field7113 == -1) {
            arg5.method506(arg9, arg0, arg7, arg8, arg3, 0);
        } else {
            class420 var12 = class285.field4433.method938(28923, this.field7113);
            if (this.field7103 == null && class285.field4433.method936(this.field7113, (byte) -119)) {
                int[] var13 = var12.field6168 ? class285.field4433.method937(this.field7113, -15746, this.field7117, false, this.field7117, 0.7F) : class285.field4433.method939(this.field7117, -8507, this.field7113, this.field7117, false, 0.7F);
                this.field7103 = arg5.method520(var13, 0, this.field7117, this.field7117, this.field7117);
            }
            if (var12.field6168) {
                arg5.method506(arg9, arg0, arg7, arg8, arg3, 0);
            }
            if (this.field7103 != null) {
                int var14 = var12.field6168 ? 1 : 0;
                int var15 = arg4 * arg8 / -4096;
                int var16;
                for (var16 = arg8 * var11 / 4096 + (arg7 - arg8) / 2; var16 > arg8; var16 -= arg8) {
                }
                while (var16 < 0) {
                    var16 += arg8;
                }
                while (arg8 < var15) {
                    var15 -= arg8;
                }
                while (var15 < 0) {
                    var15 += arg8;
                }
                for (int var17 = var16 - arg8; var17 < arg7; var17 += arg8) {
                    for (int var18 = var15 - arg8; var18 < arg8; var18 += arg8) {
                        this.field7103.method395(arg9 + var17, arg0 + var18, arg8, arg8, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field7107 - 1; var19 >= 0; var19--) {
            this.field7110[var19].method892(arg5, arg9, arg0, arg7, arg8, arg4, var11);
        }
        if (arg6 < 73) {
            this.field7103 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([[BLks;I)V")
    public static final void method2938(byte[][] arg0, class23 arg1, int arg2) {
        field7109++;
        int var3 = class347.field5175.length;
        int var4 = 0;
        if (arg2 != -14804) {
            return;
        }
        while (var4 < var3) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class277.field4348[var4] >> 8) * 64 - class422.field6201;
                int var7 = (class277.field4348[var4] & 0xFF) * 64 - class23.field273;
                class425.method2644(27576);
                arg1.method150(var5, var7, class376.field5542, class463.field6857, (byte) -72, var6);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public final void method2939(byte arg0) {
        if (arg0 < 104) {
            this.method2937(-50, 103, 102, 110, 6, null, 78, 8, -103, -87);
        }
        if (this.field7104 != null) {
            for (int var2 = 0; var2 < this.field7104.length; var2++) {
                this.field7104[var2].method894();
            }
        }
        field7111++;
        this.field7103 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class317.field4835[arg0][var8][var14] == -class532.field7772) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class295.field4543) + 1;
            int var10 = (arg3 << class295.field4543) + 2;
            int var11 = class407.field6024[arg0].method56(arg1, arg3) + arg5;
            if (!class288.method1935(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class295.field4543) - 1;
            if (!class288.method1935(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class295.field4543) - 1;
            if (!class288.method1935(var9, var11, var13)) {
                return false;
            } else if (class288.method1935(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class155.method1129(arg0, arg1, arg3)) {
            int var6 = arg1 << class295.field4543;
            int var7 = arg3 << class295.field4543;
            return class288.method1935(var6 + 1, class407.field6024[arg0].method56(arg1, arg3) + arg5, var7 + 1) && class288.method1935(class90.field1454 + var6 - 1, class407.field6024[arg0].method56(arg1 + 1, arg3) + arg5, var7 + 1) && class288.method1935(class90.field1454 + var6 - 1, class407.field6024[arg0].method56(arg1 + 1, arg3 + 1) + arg5, class90.field1454 + var7 - 1) && class288.method1935(var6 + 1, class407.field6024[arg0].method56(arg1, arg3 + 1) + arg5, class90.field1454 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public static final void method2941(int arg0, int arg1) {
        if (arg0 > -72) {
            method2936(-101);
        }
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        field7112++;
        class268.field4260 = arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lza;II)Z")
    public final boolean method2942(class299 arg0, int arg1, int arg2) {
        if (this.field7106 != arg2) {
            this.field7106 = arg2;
            int var4 = class187.method1301(arg2, false);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field7117 != var4) {
                this.field7103 = null;
                this.field7117 = var4;
            }
            if (this.field7104 != null) {
                this.field7107 = 0;
                int[] var5 = new int[this.field7104.length];
                for (int var6 = 0; var6 < this.field7104.length; var6++) {
                    class120 var7 = this.field7104[var6];
                    if (var7.method893(this.field7118, this.field7116, this.field7119, this.field7106)) {
                        var5[this.field7107] = var7.field1826;
                        this.field7110[this.field7107++] = var7;
                    }
                }
                class402.method2525(var5, this.field7110, (byte) 77, this.field7107 - 1, 0);
            }
            this.field7105 = true;
        }
        if (arg1 != -25455) {
            this.method2937(-92, -75, 47, 44, -53, null, -45, -63, -15, -21);
        }
        field7115++;
        boolean var8 = false;
        if (this.field7105) {
            this.field7105 = false;
            for (int var9 = this.field7107 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field7110[var9].method896(arg0, this.field7108);
                var8 |= var10;
                this.field7105 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I[Lgb;IIII)V")
    public class486(int arg0, class120[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7116 = arg4;
        this.field7118 = arg3;
        this.field7119 = arg5;
        this.field7113 = arg0;
        this.field7104 = arg1;
        if (arg1 == null) {
            this.field7108 = null;
            this.field7110 = null;
        } else {
            this.field7110 = new class120[arg1.length];
            this.field7108 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
