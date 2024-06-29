import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class313 extends class16 {

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    private int field4871 = 1;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    private int field4879 = 1;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    private int field4869 = 204;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "[Lao;")
    public static class194[] field4873 = new class194[29];

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "Z")
    public static boolean field4874 = false;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field4876 = new String[5];

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
    public static int field4882 = 0;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "Lva;")
    public static class156 field4867;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)V", line = 10)
    public static void method2176(int arg0) {
        field4867 = null;
        int var1 = -31 / ((arg0 + 55) / 62);
        field4873 = null;
        field4876 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLim;I)V", line = 25)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            return;
        }
        field4875++;
        if (arg2 == 0) {
            this.field4871 = arg1.method1399(-1172389784);
        } else if (arg2 == 1) {
            this.field4879 = arg1.method1399(-1172389784);
        } else if (arg2 == 2) {
            this.field4869 = arg1.method1396(arg0 - 67);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BIIII)V", line = 73)
    public static final void method2177(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4878++;
        for (class197 var5 = (class197) class114.field1709.method1807((byte) 127); var5 != null; var5 = (class197) class114.field1709.method1808(18051)) {
            class239.method1696(0, arg1, arg3, var5, arg4, arg2);
        }
        for (class197 var6 = (class197) class287.field4526.method1807((byte) 98); var6 != null; var6 = (class197) class287.field4526.method1808(18051)) {
            byte var7 = 1;
            class206 var8 = var6.field3244.method899(true);
            if (var6.field3244.field1994 == var8.field3354) {
                var7 = 0;
            } else if (var6.field3244.field1994 == var8.field3347 || var6.field3244.field1994 == var8.field3351 || var6.field3244.field1994 == var8.field3374 || var6.field3244.field1994 == var8.field3377) {
                var7 = 2;
            } else if (var6.field3244.field1994 == var8.field3380 || var6.field3244.field1994 == var8.field3356 || var6.field3244.field1994 == var8.field3360 || var6.field3244.field1994 == var8.field3349) {
                var7 = 3;
            }
            if (var6.field3222 != var7) {
                int var9 = class113.method780(127, var6.field3244);
                if (var6.field3236 != var9) {
                    if (var6.field3232 != null) {
                        class107.field1622.method739(var6.field3232);
                        var6.field3232 = null;
                    }
                    var6.field3236 = var9;
                }
                var6.field3222 = var7;
            }
            var6.field3226 = var6.field3244.field1980;
            var6.field3239 = var6.field3244.field1980 + (var6.field3244.method910(-1) * 64);
            var6.field3225 = var6.field3244.field1944;
            var6.field3229 = var6.field3244.field1944 + var6.field3244.method910(-1) * 64;
            class239.method1696(arg0 - 7, arg1, arg3, var6, arg4, arg2);
        }
        if (arg0 != 7) {
            method2179(85, -12, 39, 6);
        }
        for (class197 var10 = (class197) class55.field722.method1746((byte) -33); var10 != null; var10 = (class197) class55.field722.method1749((byte) 124)) {
            byte var11 = 1;
            class206 var12 = var10.field3234.method899(true);
            if (var10.field3234.field1994 == var12.field3354) {
                var11 = 0;
            } else if (var10.field3234.field1994 == var12.field3347 || var10.field3234.field1994 == var12.field3351 || var10.field3234.field1994 == var12.field3374 || var10.field3234.field1994 == var12.field3377) {
                var11 = 2;
            } else if (var10.field3234.field1994 == var12.field3380 || var10.field3234.field1994 == var12.field3356 || var10.field3234.field1994 == var12.field3360 || var10.field3234.field1994 == var12.field3349) {
                var11 = 3;
            }
            if (var10.field3222 != var11) {
                int var13 = class340.method2347((byte) 87, var10.field3234);
                if (var10.field3236 != var13) {
                    if (var10.field3232 != null) {
                        class107.field1622.method739(var10.field3232);
                        var10.field3232 = null;
                    }
                    var10.field3236 = var13;
                }
                var10.field3222 = var11;
            }
            var10.field3226 = var10.field3234.field1980;
            var10.field3239 = var10.field3234.field1980 + var10.field3234.method910(-1) * 64;
            var10.field3225 = var10.field3234.field1944;
            var10.field3229 = var10.field3234.field1944 + (var10.field3234.method910(-1) * 64);
            class239.method1696(0, arg1, arg3, var10, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 449)
    public class313() {
        super(0, true);
    }

    @OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V", line = 197)
    public static final void method2178(int arg0) {
        field4868++;
        if (class7.field85) {
            return;
        }
        class7.field85 = true;
        int var1 = 26 % ((arg0 - 59) / 35);
        client.field4231 = true;
        if (class325.field5079) {
            class312.field4862 = (float) ((int) class312.field4862 - 65 & 0xFFFFFF80);
        } else {
            class144.field2156 += (-24.0F - class144.field2156) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(IIII)I", line = 221)
    public static final int method2179(int arg0, int arg1, int arg2, int arg3) {
        field4877++;
        if (arg1 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg0;
        int var5 = ((arg1 & -16711936) >>> 7) * arg0 + ((arg3 & -16711936) >>> 7) * var4 & 0xFF00FF00;
        int var6 = (arg1 & 0xFF00FF) * arg0 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00;
        if (arg2 != 3) {
            method2180(-78, 113, 75, 62, 54, 95);
        }
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(ZI)[I", line = 243)
    public final int[] method8(boolean arg0, int arg1) {
        field4880++;
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            for (int var4 = 0; var4 < class276.field4376; var4++) {
                int var5 = class27.field396[var4];
                int var6 = class130.field1921[arg1];
                int var7 = this.field4871 * var5 >> 12;
                int var8 = this.field4879 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4871) * this.field4871;
                int var10 = var6 % (4096 / this.field4879) * this.field4879;
                if (var10 < this.field4869) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field4869 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field4869) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)V", line = 335)
    public static final void method2180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4866++;
        if (arg4 != 64) {
            field4876 = (String[]) null;
        }
        if (arg3 > class235.field3735 || class233.field3721 > arg1) {
            return;
        }
        boolean var6;
        if (class224.field3575 > arg5) {
            arg5 = class224.field3575;
            var6 = false;
        } else if (arg5 > class231.field3697) {
            arg5 = class231.field3697;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class224.field3575 > arg0) {
            arg0 = class224.field3575;
            var7 = false;
        } else if (arg0 > class231.field3697) {
            var7 = false;
            arg0 = class231.field3697;
        } else {
            var7 = true;
        }
        if (arg3 >= class233.field3721) {
            class245.method1738(48, class310.field4841[arg3++], arg5, arg0, arg2);
        } else {
            arg3 = class233.field3721;
        }
        if (arg1 > class235.field3735) {
            arg1 = class235.field3735;
        } else {
            class245.method1738(arg4 - 16, class310.field4841[arg1--], arg5, arg0, arg2);
        }
        if (var7 && var6) {
            for (int var8 = arg3; var8 <= arg1; var8++) {
                int[] var9 = class310.field4841[var8];
                var9[arg0] = var9[arg5] = arg2;
            }
        } else if (var7) {
            for (int var10 = arg3; var10 <= arg1; var10++) {
                class310.field4841[var10][arg0] = arg2;
            }
        } else if (var6) {
            for (int var11 = arg3; var11 <= arg1; var11++) {
                class310.field4841[var11][arg5] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BILim;)Ljava/lang/String;", line = 453)
    public static final String method2181(byte arg0, int arg1, class192 arg2) {
        field4872++;
        try {
            int var3 = arg2.method1362(127);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field3129 += class147.field2198.method386(var4, (byte) -103, arg2.field3128, var3, 0, arg2.field3129);
            String var5 = class229.method1660(var4, var3, 0, true);
            return arg0 >= -112 ? (String) null : var5;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }
}
