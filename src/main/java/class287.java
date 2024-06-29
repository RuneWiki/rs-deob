import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class287 extends class1 {

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "[Leb;")
    public static class247[] field4286 = new class247[14];

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "[I")
    public static int[] field4296 = new int[5];

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Lik;")
    public static class267 field4298 = new class267(64);

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "Z")
    public static volatile boolean field4302 = false;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    public static int field4303 = 0;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "Ljava/lang/String;")
    public String field4289;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "[C")
    public char[] field4287;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "[C")
    public char[] field4299;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "[I")
    public int[] field4288;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "[I")
    public int[] field4294;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IC)I")
    public final int method1884(int arg0, char arg1) {
        field4285++;
        if (this.field4294 == null) {
            return -1;
        }
        if (arg0 != 10565) {
            this.field4289 = null;
        }
        for (int var3 = 0; var3 < this.field4294.length; var3++) {
            if (this.field4299[var3] == arg1) {
                return this.field4294[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILfl;B)V")
    private final void method1885(int arg0, class248 arg1, byte arg2) {
        field4291++;
        if (arg0 == 1) {
            this.field4289 = arg1.method1597((byte) 124);
        } else if (arg0 == 2) {
            int var7 = arg1.method1593((byte) 27);
            this.field4288 = new int[var7];
            this.field4287 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4288[var8] = arg1.method1575(false);
                byte var9 = arg1.method1604(4);
                this.field4287[var8] = var9 == 0 ? 0 : class129.method809(var9, (byte) 95);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1593((byte) 27);
            this.field4294 = new int[var4];
            this.field4299 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4294[var5] = arg1.method1575(false);
                byte var6 = arg1.method1604(4);
                this.field4299[var5] = var6 == 0 ? 0 : class129.method809(var6, (byte) 95);
            }
        }
        if (arg2 <= 90) {
            this.field4287 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1886(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4290++;
        int var8 = 85 / ((31 - arg0) / 60);
        if (arg1 == arg2) {
            class256.method1692(arg5, arg7, arg1, arg3, arg4, -50, arg6);
        } else if (class248.field3765 <= arg6 - arg1 && (arg1 + arg6) <= class163.field2505 && (arg3 - arg2) >= class243.field3635 && class118.field1782 >= (arg2 + arg3)) {
            class191.method1197(arg3, arg7, arg6, arg2, arg1, -1, arg5, arg4);
        } else {
            class173.method1066(arg1, arg7, arg3, arg4, arg2, true, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lfl;B)V")
    public final void method1887(class248 arg0, byte arg1) {
        if (arg1 <= 14) {
            return;
        }
        field4300++;
        while (true) {
            int var3 = arg0.method1593((byte) 27);
            if (var3 == 0) {
                return;
            }
            this.method1885(var3, arg0, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(B)V")
    public final void method1888(byte arg0) {
        if (arg0 != 25) {
            field4302 = true;
        }
        if (this.field4294 != null) {
            for (int var2 = 0; var2 < this.field4294.length; var2++) {
                this.field4294[var2] = class63.method428(this.field4294[var2], 32768);
            }
        }
        if (this.field4288 != null) {
            for (int var3 = 0; var3 < this.field4288.length; var3++) {
                this.field4288[var3] = class63.method428(this.field4288[var3], 32768);
            }
        }
        field4301++;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIIIII)Z")
    public static final boolean method1889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -17755) {
            field4296 = null;
        }
        field4293++;
        long var8 = class154.method939(arg6, arg0 + arg5, arg2 + arg3);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x3C9389) >> 20;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class288 var13 = class274.method1816(55, var12);
            if (var13.field4316 == -1) {
                int var14 = arg1;
                int[] var15 = class111.field1716;
                if (var8 > 0L) {
                    var14 = arg7;
                }
                int var16 = (103 - arg2) * 4 * 512 + arg0 * 4 + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 515] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
            } else if (!class157.method947(arg3, var10, arg5, var13, arg4 + 17675, arg0, arg2)) {
                return false;
            }
        }
        long var17 = class268.method1794(arg6, arg0 + arg5, arg2 + arg3);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x395277) >> 20;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = ((int) var17 & 0x7C1B8) >> 14;
            class288 var22 = class274.method1816(60, var20);
            if (var22.field4316 == -1) {
                if (var21 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class111.field1716;
                    int var25 = 24624 - (-(arg0 * 4) - (52736 - arg2 * 512) * 4);
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 514] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 1026] = var23;
                        var24[var25 + 1536 + 3] = var23;
                    }
                }
            } else if (!class157.method947(arg3, var19, arg5, var22, -75, arg0, arg2)) {
                return false;
            }
        }
        long var26 = class92.method590(arg6, arg0 + arg5, arg2 + arg3);
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x3A19E6) >> 20;
            int var29 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class288 var30 = class274.method1816(arg4 ^ 0xFFFFBAF4, var29);
            if (var30.field4316 != -1 && !class157.method947(arg3, var28, arg5, var30, arg4 ^ 0x4574, arg0, arg2)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLpf;)V")
    public static final void method1890(boolean arg0, class294 arg1) {
        field4297++;
        class71.field1132 = class100.method647(class27.field336, arg1, -2007);
        class67.field1065 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class262.field3972[var2] & 0xFF0000) >> 16);
            int var5 = (class262.field3972[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            int var7 = (class262.field3972[var2 + 1] & 0xFF00) >> 8;
            float var8 = (float) ((class262.field3972[var2] & 0xFF00) >> 8);
            float var9 = ((float) var7 - var8) / 64.0F;
            float var10 = (float) (class262.field3972[var2] & 0xFF);
            int var11 = class262.field3972[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class67.field1065[var2 * 64 + var13] = class63.method428((int) var10, class63.method428((int) var8 << 8, (int) var4 << 16));
                var8 += var9;
                var10 += var12;
                var4 += var6;
            }
        }
        if (arg0) {
            method1886(21, 42, -64, 125, 11, 84, 27, -89);
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class67.field1065[var3] = class262.field3972[3];
        }
        class1.field10 = new int[32768];
        class267.field4020 = new int[32768];
        class152.method921(-31320, (class179) null);
        class1.field4 = new int[32768];
        class92.field1451 = new int[32768];
        class61.field974 = new class201(128, 254);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IC)I")
    public final int method1891(int arg0, char arg1) {
        field4295++;
        if (arg0 < 87) {
            this.field4299 = null;
        }
        if (this.field4288 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4288.length; var3++) {
            if (this.field4287[var3] == arg1) {
                return this.field4288[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
    public static void method1892(int arg0) {
        field4286 = null;
        field4296 = null;
        field4298 = null;
        if (arg0 != -29100) {
            method1890(true, (class294) null);
        }
    }
}
