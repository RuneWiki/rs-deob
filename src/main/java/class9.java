import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 {

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    private int field275 = 0;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "[[I")
    public int[][] field300;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Ljd;")
    public static class86 field280 = class122.method868("<col=ff7000>", true);

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Ljd;")
    private static class86 field281 = class122.method868("Loaded sprites", true);

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Ljd;")
    public static class86 field278 = field281;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Ljd;")
    private static class86 field288 = class122.method868(" has logged in)3", true);

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "[Z")
    public static boolean[] field295 = new boolean[112];

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "Ljd;")
    public static class86 field296 = field288;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Lbj;")
    public static class151 field284;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZIII)V")
    public final void method56(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field272;
        field293++;
        int var8 = arg4 - this.field275;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method63(true, 128, var7, var8);
                this.method63(true, 8, var7 - 1, var8);
            }
            if (arg5 == 1) {
                this.method63(true, 2, var7, var8);
                this.method63(true, 32, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method63(true, 8, var7, var8);
                this.method63(true, 128, var7 + 1, var8);
            }
            if (arg5 == 3) {
                this.method63(true, 32, var7, var8);
                this.method63(true, 2, var7, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method63(true, 1, var7, var8);
                this.method63(true, 16, var7 - 1, var8 - -1);
            }
            if (arg5 == 1) {
                this.method63(true, 4, var7, var8);
                this.method63(true, 64, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method63(true, 16, var7, var8);
                this.method63(true, 1, var7 + 1, var8 + -1);
            }
            if (arg5 == 3) {
                this.method63(true, 64, var7, var8);
                this.method63(true, 4, var7 - 1, var8 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method63(true, 130, var7, var8);
                this.method63(true, 8, var7 - 1, var8);
                this.method63(true, 32, var7, var8 + 1);
            }
            if (arg5 == 1) {
                this.method63(true, 10, var7, var8);
                this.method63(true, 32, var7, var8 + 1);
                this.method63(true, 128, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method63(true, 40, var7, var8);
                this.method63(true, 128, var7 + 1, var8);
                this.method63(true, 2, var7, var8 - 1);
            }
            if (arg5 == 3) {
                this.method63(true, 160, var7, var8);
                this.method63(true, 2, var7, var8 - 1);
                this.method63(true, 8, var7 - 1, var8);
            }
        }
        if (arg1 != 10) {
            method74(-66);
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method63(true, 65536, var7, var8);
                this.method63(true, 4096, var7 - 1, var8);
            }
            if (arg5 == 1) {
                this.method63(true, 1024, var7, var8);
                this.method63(true, 16384, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method63(true, 4096, var7, var8);
                this.method63(true, 65536, var7 + 1, var8);
            }
            if (arg5 == 3) {
                this.method63(true, 16384, var7, var8);
                this.method63(true, 1024, var7, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method63(true, 512, var7, var8);
                this.method63(true, 8192, var7 - 1, var8 - -1);
            }
            if (arg5 == 1) {
                this.method63(true, 2048, var7, var8);
                this.method63(true, 32768, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method63(true, 8192, var7, var8);
                this.method63(true, 512, var7 + 1, var8 + -1);
            }
            if (arg5 == 3) {
                this.method63(true, 32768, var7, var8);
                this.method63(true, 2048, var7 - 1, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method63(true, 66560, var7, var8);
            this.method63(true, 4096, var7 - 1, var8);
            this.method63(true, 16384, var7, var8 + 1);
        }
        if (arg5 == 1) {
            this.method63(true, 5120, var7, var8);
            this.method63(true, 16384, var7, var8 + 1);
            this.method63(true, 65536, var7 + 1, var8);
        }
        if (arg5 == 2) {
            this.method63(true, 20480, var7, var8);
            this.method63(true, 65536, var7 + 1, var8);
            this.method63(true, 1024, var7, var8 - 1);
        }
        if (arg5 == 3) {
            this.method63(true, 81920, var7, var8);
            this.method63(true, 1024, var7, var8 - 1);
            this.method63(true, 4096, var7 - 1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lqk;B)Log;")
    public static final class210 method57(class200 arg0, byte arg1) {
        field270++;
        class210 var2 = new class210(arg0.method1376((byte) 24), arg0.method1376((byte) 24), arg0.method1410(-125), arg0.method1410(-103), arg0.method1386(-4603), arg0.method1408((byte) -16) == 1);
        int var3 = arg0.method1408((byte) -96);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3800.method1731(-95, new class248(arg0.method1410(-68), arg0.method1410(-128), arg0.method1410(-81), arg0.method1410(-124)));
        }
        if (arg1 > -7) {
            return null;
        } else {
            var2.method1490((byte) 32);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjd;Ljd;BLjd;I)V")
    public static final void method58(int arg0, class86 arg1, class86 arg2, byte arg3, class86 arg4, int arg5) {
        field279++;
        for (int var6 = 99; var6 > 0; var6--) {
            class189.field3346[var6] = class189.field3346[var6 - 1];
            class13.field406[var6] = class13.field406[var6 - 1];
            class122.field2367[var6] = class122.field2367[var6 - 1];
            class96.field1904[var6] = class96.field1904[var6 - 1];
            class157.field2960[var6] = class157.field2960[var6 - 1];
        }
        class201.field3615++;
        class189.field3346[0] = arg5;
        class92.field1874 = class27.field621;
        class13.field406[0] = arg2;
        class157.field2960[0] = arg0;
        class122.field2367[0] = arg4;
        if (arg3 < -47) {
            class96.field1904[0] = arg1;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIZIII)V")
    public final void method59(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field272;
        int var9 = arg0 - this.field275;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg1;
            arg1 = arg5;
            arg5 = var10;
        }
        int var11 = 256;
        field285++;
        if (arg3) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < (arg1 + var8); var12++) {
            if (var12 >= 0 && var12 < this.field267) {
                for (int var13 = var9; var13 < var9 + arg5; var13++) {
                    if (var13 >= 0 && var13 < this.field283) {
                        this.method67(var12, true, var11, var13);
                    }
                }
            }
        }
        if (arg6 != 0) {
            this.field267 = -59;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZII)V")
    public static final void method60(boolean arg0, int arg1, int arg2) {
        field290++;
        if (class176.field3200 != arg1) {
            class114.field2184 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class114.field2184[var3] = (var3 << 12) / arg1;
            }
            class138.field2625 = arg1 == 64 ? 2048 : 4096;
            class90.field1844 = arg1 - 1;
            class176.field3200 = arg1;
        }
        if (!arg0) {
            field281 = null;
        }
        if (class96.field1896 == arg2) {
            return;
        }
        if (class176.field3200 == arg2) {
            class143.field2711 = class114.field2184;
        } else {
            class143.field2711 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class143.field2711[var4] = (var4 << 12) / arg2;
            }
        }
        class274.field4808 = arg2 - 1;
        class96.field1896 = arg2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field282++;
        if (arg3 + arg5 <= arg6 || arg6 + arg8 <= arg3) {
            return false;
        } else if (arg1 + arg2 > arg0 && arg0 + arg7 > arg2) {
            return arg4 < 95 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)V")
    public final void method62(int arg0, byte arg1, int arg2) {
        if (arg1 >= -123) {
            this.method62(18, (byte) 65, -74);
        }
        int var4 = arg2 - this.field272;
        field298++;
        int var5 = arg0 - this.field275;
        this.field300[var4][var5] = class49.method377(this.field300[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZIII)V")
    private final void method63(boolean arg0, int arg1, int arg2, int arg3) {
        field299++;
        this.field300[arg2][arg3] = class49.method377(this.field300[arg2][arg3], arg1);
        if (!arg0) {
            this.method69(81, -77, 119);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZIIIII)V")
    public final void method64(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field272;
        if (arg5 != -1) {
            return;
        }
        int var8 = 256;
        int var9 = arg3 - this.field275;
        if (arg0) {
            var8 += 131072;
        }
        for (int var10 = var7; var10 < (arg1 + var7); var10++) {
            if (var10 >= 0 && var10 < this.field267) {
                for (int var11 = var9; var11 < (arg4 + var9); var11++) {
                    if (var11 >= 0 && var11 < this.field283) {
                        this.method63(true, var8, var10, var11);
                    }
                }
            }
        }
        field291++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZIBII)V")
    public final void method65(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field275;
        int var8 = arg0 - this.field272;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method67(var8, true, 128, var7);
                this.method67(var8 - 1, true, 8, var7);
            }
            if (arg5 == 1) {
                this.method67(var8, true, 2, var7);
                this.method67(var8, true, 32, var7 + 1);
            }
            if (arg5 == 2) {
                this.method67(var8, true, 8, var7);
                this.method67(var8 + 1, true, 128, var7);
            }
            if (arg5 == 3) {
                this.method67(var8, true, 32, var7);
                this.method67(var8, true, 2, var7 - 1);
            }
        }
        field297++;
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method67(var8, true, 1, var7);
                this.method67(var8 - 1, true, 16, var7 + 1);
            }
            if (arg5 == 1) {
                this.method67(var8, true, 4, var7);
                this.method67(var8 + 1, true, 64, var7 + 1);
            }
            if (arg5 == 2) {
                this.method67(var8, true, 16, var7);
                this.method67(var8 + 1, true, 1, var7 - 1);
            }
            if (arg5 == 3) {
                this.method67(var8, true, 64, var7);
                this.method67(var8 - 1, true, 4, var7 - 1);
            }
        }
        if (arg3 != 57) {
            this.field267 = -14;
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method67(var8, true, 130, var7);
                this.method67(var8 - 1, true, 8, var7);
                this.method67(var8, true, 32, var7 + 1);
            }
            if (arg5 == 1) {
                this.method67(var8, true, 10, var7);
                this.method67(var8, true, 32, var7 + 1);
                this.method67(var8 + 1, true, 128, var7);
            }
            if (arg5 == 2) {
                this.method67(var8, true, 40, var7);
                this.method67(var8 + 1, true, 128, var7);
                this.method67(var8, true, 2, var7 - 1);
            }
            if (arg5 == 3) {
                this.method67(var8, true, 160, var7);
                this.method67(var8, true, 2, var7 - 1);
                this.method67(var8 - 1, true, 8, var7);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method67(var8, true, 65536, var7);
                this.method67(var8 - 1, true, 4096, var7);
            }
            if (arg5 == 1) {
                this.method67(var8, true, 1024, var7);
                this.method67(var8, true, 16384, var7 + 1);
            }
            if (arg5 == 2) {
                this.method67(var8, true, 4096, var7);
                this.method67(var8 + 1, true, 65536, var7);
            }
            if (arg5 == 3) {
                this.method67(var8, true, 16384, var7);
                this.method67(var8, true, 1024, var7 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method67(var8, true, 512, var7);
                this.method67(var8 - 1, true, 8192, var7 + 1);
            }
            if (arg5 == 1) {
                this.method67(var8, true, 2048, var7);
                this.method67(var8 + 1, true, 32768, var7 + 1);
            }
            if (arg5 == 2) {
                this.method67(var8, true, 8192, var7);
                this.method67(var8 + 1, true, 512, var7 - 1);
            }
            if (arg5 == 3) {
                this.method67(var8, true, 32768, var7);
                this.method67(var8 - 1, true, 2048, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method67(var8, true, 66560, var7);
            this.method67(var8 - 1, true, 4096, var7);
            this.method67(var8, true, 16384, var7 + 1);
        }
        if (arg5 == 1) {
            this.method67(var8, true, 5120, var7);
            this.method67(var8, true, 16384, var7 + 1);
            this.method67(var8 + 1, true, 65536, var7);
        }
        if (arg5 == 2) {
            this.method67(var8, true, 20480, var7);
            this.method67(var8 + 1, true, 65536, var7);
            this.method67(var8, true, 1024, var7 - 1);
        }
        if (arg5 == 3) {
            this.method67(var8, true, 81920, var7);
            this.method67(var8, true, 1024, var7 - 1);
            this.method67(var8 - 1, true, 4096, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIZIII)Z")
    public final boolean method66(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field294++;
        if (arg1 == 1) {
            if (arg0 == arg6 && arg5 == arg7) {
                return true;
            }
        } else if (arg6 >= arg0 && arg0 + arg1 - 1 >= arg6 && arg5 >= arg5 && arg5 <= arg1 + arg5 - 1) {
            return true;
        }
        int var9 = arg6 - this.field272;
        int var10 = arg0 - this.field272;
        int var11 = arg7 - this.field275;
        int var12 = arg5 - this.field275;
        if (!arg4) {
            this.field300 = null;
        }
        if (arg1 == 1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field300[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field300[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field300[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field300[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field300[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field300[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                    if (var9 - 1 == var10 && var11 == var12 && (this.field300[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field300[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field300[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field300[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field300[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field300[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field300[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field300[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field300[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field300[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field300[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field300[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var10 && var11 == var12 && (this.field300[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field300[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg1 - 1;
            int var14 = arg1 + var11 - 1;
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var9 - arg1 == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var12 + 1 == var11 && (this.field300[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 - arg1 == var11 && (this.field300[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 - arg1) == var10 && var12 >= var11 && var14 >= var12 && (this.field300[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field300[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 + 1 == var11 && (this.field300[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 - arg1) == var11 && (this.field300[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 <= var9 && var13 >= var9 && var12 - arg1 == var11) {
                        return true;
                    }
                    if ((var9 - arg1) == var10 && var11 <= var12 && var14 >= var12 && (this.field300[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14 && (this.field300[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var9 - arg1 == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field300[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var12 - arg1) == var11 && (this.field300[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - arg1) == var10 && var12 >= var11 && var14 >= var12 && (this.field300[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 - arg1 == var11 && (this.field300[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - arg1) == var10 && var12 >= var11 && var14 >= var12 && (this.field300[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11 && (this.field300[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var12 - arg1 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - arg1 == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 + 1 == var11 && (this.field300[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field300[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 - arg1) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 <= var9 && var13 >= var9 && (var12 + 1) == var11 && (this.field300[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 >= var10 && var9 <= var13 && (var12 - arg1) == var11 && (this.field300[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg1 == var10 && var11 <= var12 && var12 <= var14 && (this.field300[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field300[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZII)V")
    private final void method67(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field288 = null;
        }
        this.field300[arg0][arg3] = class1.method5(this.field300[arg0][arg3], ~arg2);
        field266++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)V")
    public static final void method68(byte arg0, int arg1) {
        if (arg0 != 118) {
            field280 = null;
        }
        class270.field4747 = arg1;
        field301++;
        class25.field603 = 50;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public final void method69(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field275;
        int var5 = arg2 - this.field272;
        field271++;
        this.field300[var5][var4] = class49.method377(this.field300[var5][var4], 262144);
        if (arg0 != 8192) {
            field280 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBIIIIII)Z")
    public final boolean method70(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field277++;
        if (arg0 == 1) {
            if (arg4 == arg7 && arg2 == arg5) {
                return true;
            }
        } else if (arg4 <= arg7 && arg7 <= arg0 + arg4 - 1 && arg5 <= arg5 && arg0 + arg5 - 1 >= arg5) {
            return true;
        }
        int var9 = arg4 - this.field272;
        int var10 = arg5 - this.field275;
        if (arg1 != 18) {
            return true;
        }
        int var11 = arg2 - this.field275;
        int var12 = arg7 - this.field272;
        if (arg0 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field300[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field300[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field300[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field300[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field300[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field300[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field300[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field300[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field300[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field300[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field300[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field300[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg0 - 1;
            int var14 = var11 + arg0 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var12 + 1) == var9 && var11 <= var10 && var14 >= var10 && (this.field300[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var10 - arg0) == var11 && (this.field300[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - arg0) == var9 && var11 <= var10 && var10 <= var14 && (this.field300[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var10 - arg0) == var11 && (this.field300[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - arg0 == var9 && var10 >= var11 && var14 >= var10 && (this.field300[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 + 1 == var11 && (this.field300[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 + 1) == var9 && var11 <= var10 && var10 <= var14 && (this.field300[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var10 + 1) == var11 && (this.field300[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var12 >= var9 && var13 >= var12 && (var10 + 1) == var11 && (this.field300[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var9 && var12 <= var13 && var10 - arg0 == var11 && (this.field300[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg0 == var9 && var11 <= var10 && var10 <= var14 && (this.field300[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field300[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method71(byte arg0) {
        field284 = null;
        field280 = null;
        field288 = null;
        int var1 = 92 % ((-arg0 - 52) / 33);
        field296 = null;
        field281 = null;
        field295 = null;
        field278 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method72(int arg0) {
        if (arg0 <= 0) {
            field281 = null;
        }
        field276++;
        if (class178.field3225 != -1) {
            class105.method755(-113, class178.field3225);
        }
        for (int var1 = 0; var1 < class51.field1062; var1++) {
            if (class21.field540[var1]) {
                class204.field3686[var1] = true;
            }
            class215.field3886[var1] = class21.field540[var1];
            class21.field540[var1] = false;
        }
        class229.field4154 = -1;
        class66.field1299 = -1;
        class224.field4055 = null;
        class227.field4116 = class236.field4265;
        if (class178.field3225 != -1) {
            class51.field1062 = 0;
            class91.method676(0, true, -1, class248.field4414, 0, class178.field3225, 0, class4.field53, 0);
        }
        class131.method925();
        class194.field3474 = 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field289++;
        if (arg7 != 27558) {
            this.method59(79, 124, 38, false, -72, -47, 74);
        }
        int var11 = arg3 + arg4;
        int var12 = arg9 + arg1;
        int var13 = arg2 + arg0;
        int var14 = arg5 + arg6;
        if (arg4 >= arg2 && var13 > arg4) {
            if (arg5 == var12 && (arg8 & 0x4) == 0) {
                int var15 = arg4;
                int var16 = var13 >= var11 ? var11 : var13;
                while (var16 > var15) {
                    if ((this.field300[var15 - this.field272][var12 - this.field275 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg9 == var14 && (arg8 & 0x1) == 0) {
                int var17 = var11 > var13 ? var13 : var11;
                for (int var18 = arg4; var18 < var17; var18++) {
                    if ((this.field300[var18 - this.field272][arg9 - this.field275] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (var11 > arg2 && var13 >= var11) {
            if (arg5 == var12 && (arg8 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var11; var19++) {
                    if ((this.field300[var19 - this.field272][var12 - this.field275 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var14 && (arg8 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var11; var20++) {
                    if ((this.field300[var20 - this.field272][arg9 - this.field275] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg5 <= arg9 && arg9 < var14) {
            if (arg2 == var11 && (arg8 & 0x8) == 0) {
                int var21 = arg9;
                int var22 = var14 >= var12 ? var12 : var14;
                while (var21 < var22) {
                    if ((this.field300[var11 - this.field272 - 1][var21 - this.field275] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg4 == var13 && (arg8 & 0x2) == 0) {
                int var23 = arg9;
                int var24 = var14 < var12 ? var14 : var12;
                while (var23 < var24) {
                    if ((this.field300[arg4 - this.field272][var23 - this.field275] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var12 > arg5 && var14 >= var12) {
            if (arg2 == var11 && (arg8 & 0x8) == 0) {
                for (int var25 = arg5; var25 < var12; var25++) {
                    if ((this.field300[var11 - this.field272 - 1][var25 - this.field275] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var13 && (arg8 & 0x2) == 0) {
                for (int var26 = arg5; var26 < var12; var26++) {
                    if ((this.field300[arg4 - this.field272][var26 - this.field275] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method74(int arg0) {
        field287++;
        if (class248.field4415 != null) {
            class248.field4415.method207((byte) 107);
            class248.field4415 = null;
        }
        class17.method135(false);
        class61.method436();
        for (int var1 = 0; var1 < 4; var1++) {
            class122.field2388[var1].method76(false);
        }
        class63.method452((byte) 64);
        System.gc();
        class60.method431((byte) -85, 2);
        class91.field1854 = false;
        class39.field909 = -1;
        class165.method1191(true, -105);
        class79.field1554 = 0;
        class214.field3867 = false;
        class252.field4481 = 0;
        for (int var2 = 0; var2 < class180.field3247.length; var2++) {
            class180.field3247[var2] = null;
        }
        class209.field3786 = 0;
        class61.field1207 = 0;
        if (arg0 < 122) {
            field274 = 68;
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            class186.field3294[var3] = null;
            class69.field1367[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class233.field4217[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class238.field4284[var5][var6][var7] = null;
                }
            }
        }
        class206.method1469(false);
        class84.field1643 = 0;
        class139.method997(5604, true);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)V")
    public final void method75(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field275;
        int var5 = arg0 - this.field272;
        this.field300[var5][var4] = class1.method5(this.field300[var5][var4], arg2);
        field292++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public final void method76(boolean arg0) {
        field286++;
        for (int var2 = 0; var2 < this.field267; var2++) {
            for (int var3 = 0; var3 < this.field283; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field267 - 5 || var3 >= this.field283 - 5) {
                    this.field300[var2][var3] = 16777215;
                } else {
                    this.field300[var2][var3] = 16777216;
                }
            }
        }
        if (arg0) {
            this.method73(78, -61, -81, -6, -80, 121, 117, -55, 46, 65);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILqk;)V")
    public static final void method77(int arg0, class200 arg1) {
        field269++;
        if (arg0 != -1) {
            method68((byte) -44, 101);
        }
        for (int var2 = 0; var2 < class122.field2359; var2++) {
            int var3 = arg1.method1402(20740);
            int var4 = arg1.method1410(-109);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class232.field4203[var3] != null) {
                class232.field4203[var3].field1730 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZIIIIIII)Z")
    public final boolean method78(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field268++;
        if (arg7 > 1) {
            return this.method61(arg5, arg4, arg0, arg6, 101, arg3, arg8, arg7, arg7) ? true : this.method73(arg3, arg7, arg6, arg7, arg8, arg0, arg4, 27558, arg2, arg5);
        }
        int var10 = arg3 + arg6 - 1;
        int var11 = arg0 + arg4 - 1;
        if (arg6 <= arg8 && var10 >= arg8 && arg5 >= arg0 && arg5 <= var11) {
            return true;
        } else if (arg1) {
            return true;
        } else if ((arg6 - 1) == arg8 && arg0 <= arg5 && var11 >= arg5 && (this.field300[arg8 - this.field272][arg5 - this.field275] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg8 && arg0 <= arg5 && arg5 <= var11 && (this.field300[arg8 - this.field272][arg5 - this.field275] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if ((arg0 - 1) == arg5 && arg8 >= arg6 && arg8 <= var10 && (this.field300[arg8 - this.field272][arg5 - this.field275] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg8 >= arg6 && var10 >= arg8 && (this.field300[arg8 - this.field272][arg5 - this.field275] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
    public static final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field273++;
        if (arg0 != -18170) {
            field280 = null;
        }
        if (class49.field1044 <= arg5 && arg6 <= class129.field2473 && arg1 >= class50.field1050 && arg4 <= class56.field1143) {
            if (arg2 == 1) {
                class203.method1454(arg6, arg3, true, arg5, arg1, arg4);
            } else {
                class273.method1865(arg1, arg5, false, arg3, arg6, arg2, arg4);
            }
        } else if (arg2 == 1) {
            class171.method1229(arg5, arg4, arg1, arg6, arg3, (byte) 80);
        } else {
            class147.method1052(arg0 + 18169, arg3, arg1, arg4, arg2, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(II)V")
    public class9(int arg0, int arg1) {
        this.field283 = arg1;
        this.field272 = 0;
        this.field267 = arg0;
        this.field300 = new int[this.field267][this.field283];
        this.method76(false);
    }
}
