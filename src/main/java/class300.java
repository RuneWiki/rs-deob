import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class300 {

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public int field4029 = -1;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "Z")
    public boolean field4034 = false;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public int field4026 = 99;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
    public int field4045 = -1;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
    public int field4043 = 2;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
    public int field4044 = -1;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    public int field4039 = -1;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "Z")
    public boolean field4040 = false;

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "Z")
    public boolean field4048 = false;

    @OriginalMember(owner = "client!gaa", name = "A", descriptor = "Z")
    public boolean field4051 = false;

    @OriginalMember(owner = "client!gaa", name = "G", descriptor = "I")
    public int field4056 = 5;

    @OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
    public int field4055 = -1;

    @OriginalMember(owner = "client!gaa", name = "I", descriptor = "Z")
    public static boolean field4057 = false;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "Loq;")
    public static class362 field4025 = new class362();

    @OriginalMember(owner = "client!gaa", name = "J", descriptor = "F")
    public static float field4058;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!gaa", name = "y", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!gaa", name = "C", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "Lme;")
    public class196 field4050;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "[I")
    public int[] field4028;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "[I")
    public int[] field4031;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "[I")
    public int[] field4033;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "[I")
    public int[] field4038;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "[I")
    public int[] field4042;

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "[I")
    private int[] field4054;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "[Z")
    public boolean[] field4035;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "[[I")
    public static int[][] field4036;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "[[I")
    public int[][] field4046;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIIIBLka;I)Lka;")
    public final class472 method1796(byte arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class472 arg6, int arg7) {
        if (arg5 <= 73) {
            return null;
        }
        field4041++;
        int var9 = this.field4033[arg2];
        int var10 = this.field4042[arg2];
        class452 var11 = this.field4050.method1091(2, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method241(arg0, arg3, true);
        }
        class452 var13 = null;
        if ((this.field4051 || class686.field9625) && arg4 != -1 && arg4 < this.field4042.length) {
            int var14 = this.field4042[arg4];
            var13 = this.field4050.method1091(2, var14 >> 16);
            arg4 = var14 & 0xFFFF;
        }
        if (this.field4040) {
            arg3 |= 0x200;
        }
        if (var11.method2529(var12, 31239)) {
            arg3 |= 0x80;
        }
        if (var11.method2527(false, var12)) {
            arg3 |= 0x100;
        }
        if (var11.method2525(var12, false)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2529(arg4, 31239)) {
                arg3 |= 0x80;
            }
            if (var13.method2527(false, arg4)) {
                arg3 |= 0x100;
            }
            if (var13.method2525(arg4, false)) {
                arg3 |= 0x400;
            }
        }
        int var15 = arg3 | 0x20;
        class472 var16 = arg6.method241(arg0, var15, true);
        var16.method2659(arg7 - 1, var11, var12, var13, this.field4040, arg1, -107, var9, arg4);
        return var16;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIILjava/lang/Class;)Llr;")
    public static final class752 method1797(int arg0, int arg1, int arg2, Class arg3) {
        class624 var4 = class77.field947[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class603 var5 = var4.field8729; var5 != null; var5 = var5.field8413) {
            class752 var6 = var5.field8410;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field10422 == arg1 && var6.field10421 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZIZI)I")
    public final int method1798(boolean arg0, int arg1, boolean arg2, int arg3) {
        field4047++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field4042[arg1];
        class452 var8 = null;
        class452 var9 = this.field4050.method1091(2, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        } else if (arg2) {
            if ((this.field4051 || class686.field9625) && arg3 != -1 && this.field4042.length > arg3) {
                int var11 = this.field4042[arg3];
                var8 = this.field4050.method1091(2, var11 >> 16);
                var6 = var11 & 0xFFFF;
            }
            if (this.field4040) {
                var5 |= 0x200;
            }
            if (var9.method2529(var10, 31239)) {
                var5 |= 0x80;
            }
            if (var9.method2527(false, var10)) {
                var5 |= 0x100;
            }
            if (var9.method2525(var10, false)) {
                var5 |= 0x400;
            }
            if (var8 != null) {
                if (var8.method2529(var6, 31239)) {
                    var5 |= 0x80;
                }
                if (var8.method2527(false, var6)) {
                    var5 |= 0x100;
                }
                if (var8.method2525(var6, false)) {
                    var5 |= 0x400;
                }
            }
            if (this.field4054 != null && arg0) {
                if (arg1 < this.field4054.length) {
                    int var12 = this.field4054[arg1];
                    if (var12 != 65535) {
                        class452 var13 = this.field4050.method1091(2, var12 >> 16);
                        int var14 = var12 & 0xFFFF;
                        if (var13 != null) {
                            if (var13.method2529(var14, 31239)) {
                                var5 |= 0x80;
                            }
                            if (var13.method2527(false, var14)) {
                                var5 |= 0x100;
                            }
                            if (var13.method2525(var14, false)) {
                                var5 |= 0x400;
                            }
                        }
                    }
                }
                if ((this.field4051 || class686.field9625) && arg3 != -1 && arg3 < this.field4054.length) {
                    int var15 = this.field4054[arg3];
                    if (var15 != 65535) {
                        class452 var16 = this.field4050.method1091(2, var15 >> 16);
                        int var17 = var15 & 0xFFFF;
                        if (var16 != null) {
                            if (var16.method2529(var17, 31239)) {
                                var5 |= 0x80;
                            }
                            if (var16.method2527(false, var17)) {
                                var5 |= 0x100;
                            }
                            if (var16.method2525(var17, false)) {
                                var5 |= 0x400;
                            }
                        }
                    }
                }
            }
            return var5 | 0x20;
        } else {
            return -128;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lji;I)V")
    public final void method1799(class611 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3428((byte) -99);
            if (var3 == 0) {
                field4027++;
                if (arg1 >= -92) {
                    this.method1804(-54);
                    return;
                }
                return;
            }
            this.method1805(var3, arg0, 14735);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public static void method1800(byte arg0) {
        field4025 = null;
        if (arg0 == -26) {
            field4036 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4053++;
        if (arg3 <= 45) {
            return false;
        }
        for (int var6 = arg2; var6 <= arg1; var6++) {
            for (int var7 = arg4; var7 <= arg0; var7++) {
                if (class397.field5634[var6][var7] == arg5 && class190.field2290[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)V")
    public static final void method1802(int arg0, int arg1) {
        if (arg1 != 1024) {
            return;
        }
        class625.field8745 = arg0;
        field4049++;
        class262 var2 = class70.field759;
        synchronized (class70.field759) {
            class70.field759.method1563(87);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIILka;I)Lka;")
    public final class472 method1803(int arg0, int arg1, int arg2, int arg3, class472 arg4, int arg5) {
        field4030++;
        int var7 = this.field4033[arg5];
        int var8 = this.field4042[arg5];
        class452 var9 = this.field4050.method1091(2, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method241((byte) 1, arg2, true);
        }
        class452 var11 = null;
        if ((this.field4051 || class686.field9625) && arg0 != -1 && this.field4042.length > arg0) {
            int var12 = this.field4042[arg0];
            var11 = this.field4050.method1091(2, var12 >> 16);
            arg0 = var12 & 0xFFFF;
        }
        class452 var13 = null;
        class452 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field4054 != null) {
            if (this.field4054.length > arg5) {
                var15 = this.field4054[arg5];
                if (var15 != 65535) {
                    var13 = this.field4050.method1091(2, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field4051 || class686.field9625) && arg0 != -1 && arg0 < this.field4054.length) {
                var16 = this.field4054[arg0];
                if (var16 != 65535) {
                    var14 = this.field4050.method1091(2, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field4040) {
            arg2 |= 0x200;
        }
        if (var9.method2529(var10, 31239)) {
            arg2 |= 0x80;
        }
        if (var9.method2527(false, var10)) {
            arg2 |= 0x100;
        }
        int var17 = -53 / ((arg3 - 6) / 32);
        if (var9.method2525(var10, false)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2529(var15, 31239)) {
                arg2 |= 0x80;
            }
            if (var13.method2527(false, var15)) {
                arg2 |= 0x100;
            }
            if (var13.method2525(var15, false)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2529(arg0, 31239)) {
                arg2 |= 0x80;
            }
            if (var11.method2527(false, arg0)) {
                arg2 |= 0x100;
            }
            if (var11.method2525(arg0, false)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2529(var16, 31239)) {
                arg2 |= 0x80;
            }
            if (var14.method2527(false, var16)) {
                arg2 |= 0x100;
            }
            if (var14.method2525(var16, false)) {
                arg2 |= 0x400;
            }
        }
        int var18 = arg2 | 0x20;
        class472 var19 = arg4.method241((byte) 1, var18, true);
        var19.method2659(arg1 - 1, var9, var10, var11, this.field4040, 0, 119, var7, arg0);
        if (var13 != null) {
            var19.method2659(arg1 - 1, var13, var15, var14, this.field4040, 0, -106, var7, var16);
        }
        return var19;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
    public final void method1804(int arg0) {
        if (this.field4045 == -1) {
            if (this.field4035 == null) {
                this.field4045 = 0;
            } else {
                this.field4045 = 2;
            }
        }
        int var2 = 79 / ((-arg0 - 52) / 50);
        field4032++;
        if (this.field4039 != -1) {
            return;
        }
        if (this.field4035 == null) {
            this.field4039 = 0;
        } else {
            this.field4039 = 2;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILji;I)V")
    private final void method1805(int arg0, class611 arg1, int arg2) {
        if (arg0 == 1) {
            int var4 = arg1.method3402((byte) 127);
            this.field4033 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4033[var5] = arg1.method3402((byte) 127);
            }
            this.field4042 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4042[var6] = arg1.method3402((byte) 127);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4042[var7] = (arg1.method3402((byte) 127) << 16) + this.field4042[var7];
            }
        } else if (arg0 == 2) {
            this.field4055 = arg1.method3402((byte) 127);
        } else if (arg0 == 3) {
            this.field4035 = new boolean[256];
            int var18 = arg1.method3428((byte) 33);
            for (int var19 = 0; var19 < var18; var19++) {
                this.field4035[arg1.method3428((byte) -119)] = true;
            }
        } else if (arg0 == 5) {
            this.field4056 = arg1.method3428((byte) -108);
        } else if (arg0 == 6) {
            this.field4044 = arg1.method3402((byte) 127);
        } else if (arg0 == 7) {
            this.field4029 = arg1.method3402((byte) 127);
        } else if (arg0 == 8) {
            this.field4026 = arg1.method3428((byte) 17);
        } else if (arg0 == 9) {
            this.field4045 = arg1.method3428((byte) 110);
        } else if (arg0 == 10) {
            this.field4039 = arg1.method3428((byte) 59);
        } else if (arg0 == 11) {
            this.field4043 = arg1.method3428((byte) -114);
        } else if (arg0 == 12) {
            int var15 = arg1.method3428((byte) 11);
            this.field4054 = new int[var15];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4054[var16] = arg1.method3402((byte) 127);
            }
            for (int var17 = 0; var17 < var15; var17++) {
                this.field4054[var17] = (arg1.method3402((byte) 127) << 16) + this.field4054[var17];
            }
        } else if (arg0 == 13) {
            int var11 = arg1.method3402((byte) 127);
            this.field4046 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg1.method3428((byte) 125);
                if (var13 > 0) {
                    this.field4046[var12] = new int[var13];
                    this.field4046[var12][0] = arg1.method3385(class158.method949(arg2, -14837));
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field4046[var12][var14] = arg1.method3402((byte) 127);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4040 = true;
        } else if (arg0 == 15) {
            this.field4051 = true;
        } else if (arg0 == 16) {
            this.field4048 = true;
        } else if (arg0 == 18) {
            this.field4034 = true;
        } else if (arg0 == 19) {
            if (this.field4028 == null) {
                this.field4028 = new int[this.field4046.length];
                for (int var10 = 0; var10 < this.field4046.length; var10++) {
                    this.field4028[var10] = 255;
                }
            }
            this.field4028[arg1.method3428((byte) 25)] = arg1.method3428((byte) -125);
        } else if (arg0 == 20) {
            if (this.field4031 == null || this.field4038 == null) {
                this.field4031 = new int[this.field4046.length];
                this.field4038 = new int[this.field4046.length];
                for (int var8 = 0; var8 < this.field4046.length; var8++) {
                    this.field4031[var8] = 256;
                    this.field4038[var8] = 256;
                }
            }
            int var9 = arg1.method3428((byte) -108);
            this.field4031[var9] = arg1.method3402((byte) 127);
            this.field4038[var9] = arg1.method3402((byte) 127);
        }
        if (arg2 != 14735) {
            this.method1804(-80);
        }
        field4037++;
    }
}
