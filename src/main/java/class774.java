import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class774 {

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    private int field11030 = -1;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "Z")
    private boolean field11038 = true;

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
    private int field11021;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "I")
    private int field11016;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
    private int field11023;

    @OriginalMember(owner = "client!pca", name = "H", descriptor = "[Lrga;")
    private class83[] field11040;

    @OriginalMember(owner = "client!pca", name = "I", descriptor = "I")
    private int field11018;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    private int field11027;

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "[Lrga;")
    private class83[] field11022;

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "Lrga;")
    private class83 field11050;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    private int field11019;

    @OriginalMember(owner = "client!pca", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field11053 = new String[] { method5581(method5580("\u0019lZt")), method5581(method5580("\f7\u00186o")), method5581(method5580("\u0007zW6W_")), method5581(method5580("\u0007zW6[_")), method5581(method5580("\u0007zW6T_")), method5581(method5580("\u0007zW6Y_")), method5581(method5580("\u0007zW6P_")), method5581(method5580("\u0007zW6S_")), method5581(method5580("\u0007zW6__")), method5581(method5580("\u0007zW6\\_")), method5581(method5580("\u0007zW6.\u001ew_l,_")), method5581(method5580("\u0007zW6Q_")), method5581(method5580("\u0007zW6V_")), method5581(method5580("\u0007zW6^_")), method5581(method5580("\u0007zW6U_")), method5581(method5580("\u0007zW6X_")), method5581(method5580("\u0007zW6Z_")) };

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "[I")
    public static int[] field11044 = new int[2];

    @OriginalMember(owner = "client!pca", name = "D", descriptor = "I")
    public static int field11020;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
    public static int field11024;

    @OriginalMember(owner = "client!pca", name = "B", descriptor = "I")
    private int field11026;

    @OriginalMember(owner = "client!pca", name = "A", descriptor = "I")
    public static int field11028;

    @OriginalMember(owner = "client!pca", name = "K", descriptor = "I")
    public static int field11029;

    @OriginalMember(owner = "client!pca", name = "E", descriptor = "I")
    public static int field11031;

    @OriginalMember(owner = "client!pca", name = "G", descriptor = "I")
    private int field11032;

    @OriginalMember(owner = "client!pca", name = "F", descriptor = "I")
    public static int field11033;

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "I")
    public static int field11034;

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
    public static int field11035;

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
    public static int field11036;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field11037;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    private int field11039;

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
    public static int field11041;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    public static int field11042;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    private int field11045;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    private int field11046;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
    private int field11047;

    @OriginalMember(owner = "client!pca", name = "J", descriptor = "I")
    private int field11049;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field11052;

    @OriginalMember(owner = "client!pca", name = "x", descriptor = "Ltb;")
    private class392 field11043;

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "Lka;")
    private class761 field11017;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "Lpca;")
    private class774 field11048;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "Z")
    private boolean field11051;

    @OriginalMember(owner = "client!pca", name = "C", descriptor = "[B")
    private byte[] field11025;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)Lpca;")
    public final class774 method5566(int arg0) {
        try {
            if (arg0 != 0) {
                method5573(null, 57, true);
            }
            field11024++;
            return this.field11048;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11053[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V")
    public final void method5567(int arg0, int arg1, int arg2) {
        try {
            this.field11045 = this.field11039 + ((arg1 - this.field11039) * arg2 / 255);
            field11041++;
            if (arg0 != 1) {
                this.field11030 = 62;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11053[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)V")
    public static void method5568(int arg0) {
        try {
            field11044 = null;
            if (arg0 != -6465) {
                field11044 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11053[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Z")
    public final boolean method5569(byte arg0) {
        try {
            if (arg0 == 31) {
                field11020++;
                return this.field11051;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11053[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lha;IIIIZIIIII)V")
    public final void method5570(class18 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            this.method5576(125, arg8, arg2, arg0, arg9, arg5, arg10, arg1, true, arg7, arg6, arg3, 0);
            field11035++;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field11053[2] + (arg0 == null ? field11053[0] : field11053[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)V")
    public final void method5571(int arg0) {
        try {
            field11052++;
            if (arg0 < 43) {
                this.field11019 = 14;
            }
            this.field11045 = 0;
            this.field11051 = false;
            this.field11048 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11053[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZLpca;)V")
    public final void method5572(boolean arg0, class774 arg1) {
        try {
            field11036++;
            if (this.field11051) {
                this.field11039 = this.field11045;
            } else if (arg1 != null && arg1.field11051) {
                this.field11039 = 255 - arg1.field11045;
            } else {
                this.field11039 = 0;
            }
            this.field11051 = arg0;
            this.field11045 = 0;
            this.field11048 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11053[15] + arg0 + ',' + (arg1 == null ? field11053[0] : field11053[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method5573(String arg0, int arg1, boolean arg2) {
        try {
            field11028++;
            String var15 = arg0.toLowerCase();
            short[] var3 = new short[16];
            int var4 = 0;
            int var5 = arg2 ? 32768 : 0;
            int var6 = (arg2 ? class591.field8501.field8980 : class591.field8501.field8979) + var5;
            for (int var7 = var5; var7 < var6; var7++) {
                class714 var8 = class591.field8501.method4619(var7, -380);
                if (var8.field10159 && var8.method5174(32768).toLowerCase().indexOf(var15) != -1) {
                    if (var4 >= 50) {
                        class14.field186 = -1;
                        class694.field9694 = null;
                        return;
                    }
                    if (var3.length <= var4) {
                        short[] var9 = new short[var3.length * 2];
                        for (int var10 = 0; var10 < var4; var10++) {
                            var9[var10] = var3[var10];
                        }
                        var3 = var9;
                    }
                    var3[var4++] = (short) var7;
                }
            }
            class694.field9694 = var3;
            class14.field186 = var4;
            class583.field8419 = 0;
            String[] var11 = new String[class14.field186];
            for (int var12 = 0; var12 < class14.field186; var12++) {
                var11[var12] = class591.field8501.method4619(var3[var12], -380).method5174(32768);
            }
            if (arg1 <= 67) {
                field11044 = null;
            }
            class714.method5173(-1457, class694.field9694, var11);
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field11053[6] + (arg0 == null ? field11053[0] : field11053[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIIZBLha;IIIIIZI)V")
    private final void method5574(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class18 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, int arg13) {
        try {
            field11031++;
            if (arg5 > 0) {
                int var15 = 255 - arg2;
                if (this.field11017 == null) {
                    arg3 = arg3 + arg10 & 0x3FFF;
                    arg6.method225();
                    if (this.field11027 == -1 || this.field11049 == 0) {
                        arg6.method237(arg11, arg8, arg7, arg1, var15 << 24 | arg13, 1);
                    } else {
                        class684 var16 = class62.field946.method4500(-23641, this.field11027);
                        if (this.field11043 == null && class62.field946.method4504(this.field11027, -31410)) {
                            int[] var17 = var16.field9584 == 2 ? class62.field946.method4499(this.field11049, this.field11049, -7994, false, 0.7F, this.field11027) : class62.field946.method4502(0.7F, this.field11049, -89, this.field11049, this.field11027, false);
                            this.field11032 = var17[0];
                            this.field11046 = var17[var17.length - 1];
                            this.field11043 = arg6.method201(this.field11049, this.field11049, var17, this.field11049, (byte) 126, 0);
                        }
                        int var18 = var15 == 255 ? (var16.field9584 == 2 ? 1 : 0) : 1;
                        if (var18 == 1 && arg4) {
                            arg6.method237(arg11, arg8, arg7, arg1, arg13, 0);
                        }
                        if (this.field11043 != null) {
                            int var19 = arg0 * arg1 / -4096;
                            int var20;
                            for (var20 = arg1 * arg3 / 4096 + (arg7 - arg1) / 2; var20 > arg1; var20 -= arg1) {
                            }
                            while (var20 < 0) {
                                var20 += arg1;
                            }
                            if (this.field11016 == 1) {
                                for (int var21 = var20 - arg1; var21 < arg7; var21 += arg1) {
                                    this.field11043.method3073(var21 + arg11, arg8 + var19, arg1, arg1, 0, var15 << 24 | 0xFFFFFF, var18);
                                }
                                if ((this.field11032 & 0xFF000000) != 0) {
                                    arg6.method121(arg7, 0, -44, var19 + arg8 + 1, this.field11032, 0);
                                }
                                if ((this.field11046 & 0xFF000000) != 0) {
                                    arg6.method121(arg7, 0, 60, arg1 - var19 - (arg8 + arg1), this.field11046, var19 + arg1 + arg8);
                                }
                            } else {
                                while (arg1 < var19) {
                                    var19 -= arg1;
                                }
                                while (var19 < 0) {
                                    var19 += arg1;
                                }
                                for (int var22 = var20 - arg1; var22 < arg7; var22 += arg1) {
                                    for (int var23 = var19 - arg1; var23 < arg1; var23 += arg1) {
                                        this.field11043.method3073(arg11 + var22, arg8 + var23, arg1, arg1, 0, var15 << 24 | 0xFFFFFF, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (arg4) {
                        arg6.method243(arg13);
                        arg6.method225();
                    }
                    this.method5575(arg6, arg9, arg0, arg2, 0, arg3);
                }
                for (int var24 = this.field11026 - 1; var24 >= 0; var24--) {
                    this.field11022[var24].method815(arg6, arg11, arg8, arg7, arg1, arg0, arg3, this.field11018, this.field11023, this.field11021, var15);
                }
                arg6.method225();
            }
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field11053[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field11053[0] : field11053[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lha;IIIII)V")
    private final void method5575(class18 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field11033++;
            class104 var7 = arg0.method129().method737();
            class104 var8 = arg0.method221();
            var8.method739(0, 0, arg4);
            var8.method736(arg5 & 0x3FFF);
            var8.method741(arg2 & 0x3FFF);
            var8.method724(arg1 & 0x3FFF);
            arg0.method204(var8);
            class104 var9 = arg0.method221();
            var9.method735();
            if (this.field11047 != arg3) {
                this.field11017.method404((byte) arg3, this.field11025);
                this.field11047 = arg3;
            }
            this.field11017.method415(var9, null, 0);
            arg0.method204(var7);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field11053[7] + (arg0 == null ? field11053[0] : field11053[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIILha;IZIIZIIII)V")
    public final void method5576(int arg0, int arg1, int arg2, class18 arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            if (arg0 < 119) {
                this.method5569((byte) 19);
            }
            field11037++;
            int var14 = 0;
            if (this.field11051) {
                var14 = this.field11045;
            }
            if (this.field11048 == null) {
                this.method5574(arg10, arg2, var14, arg4, arg8, (byte) 53, arg3, arg6, arg7, arg12, arg11, arg1, arg5, arg9);
            } else {
                class774 var15 = this;
                class774 var16 = this.field11048;
                if (this.hashCode() > var16.hashCode()) {
                    var14 = 255 - var14;
                    var16 = this;
                    var15 = this.field11048;
                }
                var15.method5574(arg10, arg2, var14, arg4, arg8, (byte) 21, arg3, arg6, arg7, arg12, arg11, arg1, arg5, arg9);
                var16.method5574(arg10, arg2, 255 - var14, arg4, false, (byte) 56, arg3, arg6, arg7, arg12, arg11, arg1, arg5, arg9);
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field11053[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field11053[0] : field11053[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILha;BI)Z")
    public final boolean method5577(int arg0, class18 arg1, byte arg2, int arg3) {
        try {
            field11029++;
            if (this.field11030 != arg0) {
                this.field11030 = arg0;
                int var5 = class482.method3720((byte) 41, arg0);
                if (var5 > 512) {
                    var5 = 512;
                }
                if (var5 <= 0) {
                    var5 = 1;
                }
                if (this.field11049 != var5) {
                    this.field11043 = null;
                    this.field11049 = var5;
                }
                if (this.field11040 != null) {
                    this.field11026 = 0;
                    int[] var6 = new int[this.field11040.length];
                    for (int var7 = 0; var7 < this.field11040.length; var7++) {
                        class83 var8 = this.field11040[var7];
                        if (var8.method816(this.field11018, this.field11023, this.field11021, this.field11030)) {
                            var6[this.field11026] = var8.field1156;
                            this.field11022[this.field11026++] = var8;
                        }
                    }
                    class135.method1183(this.field11026 - 1, var6, this.field11022, 0, (byte) -37);
                }
                this.field11038 = true;
            }
            boolean var9 = false;
            if (this.field11038) {
                this.field11038 = false;
                for (int var10 = this.field11026 - 1; var10 >= 0; var10--) {
                    boolean var11 = this.field11022[var10].method818(arg1, this.field11050);
                    this.field11038 |= !var11;
                    var9 |= var11;
                }
            }
            if (arg2 != -100) {
                this.method5575(null, 48, -106, 123, -103, 122);
            }
            if (arg3 == 0 || !arg1.method133()) {
                this.field11017 = null;
            } else if (this.field11017 == null && this.field11019 >= 0) {
                this.method5578(false, arg1);
            }
            if (this.field11048 != null && this.field11048 != this) {
                this.field11048.method5571(99);
                var9 |= this.field11048.method5577(arg0, arg1, (byte) -100, arg3);
            }
            return var9;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field11053[3] + arg0 + ',' + (arg1 == null ? field11053[0] : field11053[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZLha;)V")
    private final void method5578(boolean arg0, class18 arg1) {
        try {
            field11042++;
            try {
                if (arg0) {
                    this.field11022 = null;
                }
                class47 var3 = class716.field10205;
                boolean var4 = var3.method515(this.field11019, -1);
                if (var4) {
                    arg1.method235(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                    class60 var5 = class372.method2951(this.field11019, 0, (byte) -3, class716.field10205);
                    this.field11017 = arg1.method197(var5, 1099776, 0, 255, 1);
                    byte[] var6 = this.field11017.method407();
                    if (var6 == null) {
                        this.field11025 = null;
                    } else {
                        this.field11025 = new byte[var6.length];
                        class569.method4247(var6, 0, this.field11025, 0, var6.length);
                    }
                }
            } catch (Exception var8) {
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field11053[4] + arg0 + ',' + (arg1 == null ? field11053[0] : field11053[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILoba;)I")
    public static final int method5579(int arg0, class739 arg1) {
        try {
            if (arg0 != 34166) {
                method5579(-32, null);
            }
            field11034++;
            if (class784.field11325 == arg1) {
                return 5890;
            } else if (class801.field11657 == arg1) {
                return 34167;
            } else if (class514.field7551 == arg1) {
                return 34168;
            } else if (class659.field9335 == arg1) {
                return 34166;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11053[9] + arg0 + ',' + (arg1 == null ? field11053[0] : field11053[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(I[Lrga;IIIIII)V")
    public class774(int arg0, class83[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.field11021 = arg5;
            this.field11016 = arg6;
            this.field11023 = arg4;
            this.field11040 = arg1;
            this.field11018 = arg3;
            this.field11027 = arg0;
            if (arg1 == null) {
                this.field11022 = null;
                this.field11050 = null;
            } else {
                this.field11022 = new class83[arg1.length];
                this.field11050 = arg2 < 0 ? null : arg1[arg2];
            }
            this.field11019 = arg7;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field11053[10] + arg0 + ',' + (arg1 == null ? field11053[0] : field11053[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5580(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5581(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
