import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class156 extends class170 {

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    private int field2680 = 204;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    private int field2681 = 1;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    private int field2678 = 1;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Ls;")
    public static class261 field2676 = new class261(30);

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "Lvf;")
    public static class296 field2679 = new class296();

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public static int field2685 = 2;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "Z")
    public static boolean field2688 = false;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field2684 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V", line = 5)
    public static final void method1031(boolean arg0) {
        if (arg0) {
            class182.field3184 = class260.field4495;
            class250.field4334 = class308.field5227;
            class112.field1885 = class146.field2502;
        } else {
            class182.field3184 = class96.field1632;
            class250.field4334 = class267.field4626;
            class112.field1885 = class38.field762;
        }
        class130.field2271 = class182.field3184.length;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V", line = 26)
    public static final void method1032(boolean arg0, int arg1) {
        field2683++;
        class229 var2 = class241.method1638(10, 109, arg1);
        var2.method1566((byte) -3);
        if (!arg0) {
            field2679 = (class296) null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V", line = 39)
    public static void method1033(int arg0) {
        if (arg0 == 1) {
            field2679 = null;
            field2676 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 49)
    public class156() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILbg;B)V", line = 58)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field2686++;
        if (arg0 == 0) {
            this.field2678 = arg1.method1325(arg2 + 7614);
        } else if (arg0 == 1) {
            this.field2681 = arg1.method1325(7627);
        } else if (arg0 == 2) {
            this.field2680 = arg1.method1308(arg2 ^ 0xFFFFFF9A);
        }
        if (arg2 != 13) {
            method1034(-39, 27, 66, 93, 4, -33, -49, 119, -12, 62, 95, 99, -20, -66, 63, -35, -52, 93, -73, -46);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 102)
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class56 var20 = new class56(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class182.field3184[var21][arg1][arg2] == null) {
                    class182.field3184[var21][arg1][arg2] = new class150(var21, arg1, arg2);
                }
            }
            class182.field3184[arg0][arg1][arg2].field2581 = var20;
        } else if (arg3 == 1) {
            class56 var22 = new class56(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class182.field3184[var23][arg1][arg2] == null) {
                    class182.field3184[var23][arg1][arg2] = new class150(var23, arg1, arg2);
                }
            }
            class182.field3184[arg0][arg1][arg2].field2581 = var22;
        } else {
            class48 var24 = new class48(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class182.field3184[var25][arg1][arg2] == null) {
                    class182.field3184[var25][arg1][arg2] = new class150(var25, arg1, arg2);
                }
            }
            class182.field3184[arg0][arg1][arg2].field2587 = var24;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)[I", line = 154)
    public final int[] method69(byte arg0, int arg1) {
        field2677++;
        if (arg0 != 85) {
            this.method69((byte) -95, -14);
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            for (int var4 = 0; var4 < class185.field3225; var4++) {
                int var5 = class118.field2002[var4];
                int var6 = class307.field5221[arg1];
                int var7 = this.field2678 * var5 >> 12;
                int var8 = this.field2681 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2678) * this.field2678;
                int var10 = var6 % (4096 / this.field2681) * this.field2681;
                if (var10 < this.field2680) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field2680) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field2680) {
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

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLca;)V", line = 245)
    public static final void method1035(byte arg0, class91 arg1) {
        int var2 = -57 % ((7 - arg0) / 59);
        field2687++;
        class263.field4554 = arg1;
    }
}
