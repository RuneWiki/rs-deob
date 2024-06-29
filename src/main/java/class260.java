import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class260 {

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public int field4035 = 5;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public int field4039 = -1;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "Z")
    public boolean field4042 = false;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public int field4058 = -1;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "Z")
    public boolean field4060 = false;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public int field4038 = 2;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public int field4054 = 99;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "Z")
    public boolean field4051 = false;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public int field4063 = -1;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Z")
    public boolean field4061 = false;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public int field4057 = -1;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public int field4069 = -1;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "[Lha;")
    public static class209[] field4049 = new class209[6];

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static volatile int field4047 = -1;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public static int field4055 = 20;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "Lrf;")
    public static class79 field4052 = new class79();

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    public static int field4066 = 0;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field4068 = 0;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "Lbm;")
    public static class307 field4059;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "Lbm;")
    public static class307 field4067;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "[I")
    private int[] field4037;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "[I")
    public int[] field4041;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "[I")
    public int[] field4044;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "[Z")
    public boolean[] field4036;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "[[I")
    public int[][] field4070;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 6)
    public static void method1740(byte arg0) {
        field4049 = null;
        if (arg0 >= -88) {
            method1748(92);
        }
        field4067 = null;
        field4052 = null;
        field4059 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILbg;III)Lbg;", line = 27)
    public final class309 method1741(int arg0, int arg1, class309 arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -364) {
            this.field4063 = 0;
        }
        field4065++;
        int var7 = this.field4041[arg5];
        int var8 = this.field4044[arg5];
        class294 var9 = class87.method615(arg4 + 364, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method168(true, true, true);
        }
        class294 var11 = null;
        int var12 = arg3 & 0x3;
        if ((this.field4061 || class194.field3131) && arg0 != -1 && arg0 < this.field4044.length) {
            int var13 = this.field4044[arg0];
            var11 = class87.method615(arg4 + 364, var13 >> 16);
            arg0 = var13 & 0xFFFF;
        }
        class309 var14;
        if (var11 == null) {
            var14 = arg2.method168(!var9.method1971(113, var10), !var9.method1970(var10, false), !this.field4042);
        } else {
            var14 = arg2.method168(!var9.method1971(arg4 ^ 0x179, var10) & !var11.method1971(-39, arg0), !var9.method1970(var10, false) & !var11.method1970(arg0, false), !this.field4042);
        }
        if (this.field4042 && class249.field3893) {
            if (var12 == 1) {
                ((class184) var14).method1154();
            } else if (var12 == 2) {
                ((class184) var14).method1152();
            } else if (var12 == 3) {
                ((class184) var14).method1177();
            }
        } else if (var12 == 1) {
            var14.method149();
        } else if (var12 == 2) {
            var14.method157();
        } else if (var12 == 3) {
            var14.method131();
        }
        var14.method2068(var9, var10, var11, arg0, arg1 - 1, var7, this.field4042);
        if (this.field4042 && class249.field3893) {
            if (var12 == 1) {
                ((class184) var14).method1177();
            } else if (var12 == 2) {
                ((class184) var14).method1152();
            } else if (var12 == 3) {
                ((class184) var14).method1154();
            }
        } else if (var12 == 1) {
            var14.method131();
        } else if (var12 == 2) {
            var14.method157();
        } else if (var12 == 3) {
            var14.method149();
        }
        return var14;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLag;)V", line = 141)
    public final void method1742(byte arg0, class202 arg1) {
        while (true) {
            int var3 = arg1.method1317((byte) -86);
            if (var3 == 0) {
                field4048++;
                if (arg0 != 3) {
                    field4047 = 71;
                }
                return;
            }
            this.method1749(-3, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIBLbg;II)Lbg;", line = 160)
    public final class309 method1743(int arg0, int arg1, byte arg2, class309 arg3, int arg4, int arg5) {
        int var7 = this.field4041[arg1];
        int var8 = this.field4044[arg1];
        class294 var9 = class87.method615(0, var8 >> 16);
        field4043++;
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method135(true, true, true);
        }
        int var11 = arg0 & 0x3;
        if (arg2 <= 41) {
            this.field4061 = true;
        }
        class294 var12 = null;
        if ((this.field4061 || class194.field3131) && arg4 != -1 && this.field4044.length > arg4) {
            int var13 = this.field4044[arg4];
            var12 = class87.method615(0, var13 >> 16);
            arg4 = var13 & 0xFFFF;
        }
        class309 var14;
        if (var12 == null) {
            var14 = arg3.method135(!var9.method1971(-73, var10), !var9.method1970(var10, false), !this.field4042);
        } else {
            var14 = arg3.method135(!var9.method1971(-39, var10) & !var12.method1971(-25, arg4), !var9.method1970(var10, false) & !var12.method1970(arg4, false), !this.field4042);
        }
        if (class249.field3893 && this.field4042) {
            if (var11 == 1) {
                ((class184) var14).method1154();
            } else if (var11 == 2) {
                ((class184) var14).method1152();
            } else if (var11 == 3) {
                ((class184) var14).method1177();
            }
        } else if (var11 == 1) {
            var14.method149();
        } else if (var11 == 2) {
            var14.method157();
        } else if (var11 == 3) {
            var14.method131();
        }
        var14.method2068(var9, var10, var12, arg4, arg5 - 1, var7, this.field4042);
        if (class249.field3893 && this.field4042) {
            if (var11 == 1) {
                ((class184) var14).method1177();
            } else if (var11 == 2) {
                ((class184) var14).method1152();
            } else if (var11 == 3) {
                ((class184) var14).method1154();
            }
        } else if (var11 == 1) {
            var14.method131();
        } else if (var11 == 2) {
            var14.method157();
        } else if (var11 == 3) {
            var14.method149();
        }
        return var14;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 262)
    public final void method1744(int arg0) {
        field4034++;
        if (this.field4057 == -1) {
            if (this.field4036 == null) {
                this.field4057 = 0;
            } else {
                this.field4057 = 2;
            }
        }
        if (arg0 != 1 || this.field4063 != -1) {
            return;
        }
        if (this.field4036 == null) {
            this.field4063 = 0;
        } else {
            this.field4063 = 2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIBI)V", line = 295)
    public static final void method1745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 < 17) {
            field4066 = -109;
        }
        field4062++;
        if (arg7 < 1 || arg0 < 1 || arg7 > 102 || arg0 > 102) {
            return;
        }
        if (!class19.method127(-111) && (class99.field1749[0][arg7][arg0] & 0x2) == 0) {
            int var8 = arg3;
            if ((class99.field1749[arg3][arg7][arg0] & 0x8) != 0) {
                var8 = 0;
            }
            if (class290.field4454 != var8) {
                return;
            }
        }
        int var9 = arg3;
        if (arg3 < 3 && (class99.field1749[1][arg7][arg0] & 0x2) == 2) {
            var9 = arg3 + 1;
        }
        class200.method1277(-371909580, arg0, arg2, var9, class326.field4990[arg3], arg7, arg3);
        if (arg5 >= 0) {
            boolean var10 = class64.field1227;
            class64.field1227 = true;
            class209.method1417(var9, class326.field4990[arg3], arg0, arg5, arg7, false, arg1, (byte) 4, false, arg3, arg4);
            class64.field1227 = var10;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lbg;BIII)Lbg;", line = 355)
    public final class309 method1746(class309 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4050++;
        int var6 = this.field4044[arg2];
        int var7 = this.field4041[arg2];
        if (arg1 <= 20) {
            this.field4036 = (boolean[]) null;
        }
        class294 var8 = class87.method615(0, var6 >> 16);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg0.method168(true, true, true);
        }
        class294 var10 = null;
        if ((this.field4061 || class194.field3131) && arg3 != -1 && arg3 < this.field4044.length) {
            int var11 = this.field4044[arg3];
            var10 = class87.method615(0, var11 >> 16);
            arg3 = var11 & 0xFFFF;
        }
        class294 var12 = null;
        class294 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field4037 != null) {
            if (arg2 < this.field4037.length) {
                var15 = this.field4037[arg2];
                if (var15 != 65535) {
                    var12 = class87.method615(0, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field4061 || class194.field3131) && arg3 != -1 && this.field4037.length > arg3) {
                var14 = this.field4037[arg3];
                if (var14 != 65535) {
                    var13 = class87.method615(0, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1971(-66, var9);
        boolean var17 = !var8.method1970(var9, false);
        if (var12 != null) {
            var16 &= !var12.method1971(115, var15);
            var17 &= !var12.method1970(var15, false);
        }
        if (var10 != null) {
            var16 &= !var10.method1971(115, arg3);
            var17 &= !var10.method1970(arg3, false);
        }
        if (var13 != null) {
            var16 &= !var13.method1971(-58, var14);
            var17 &= !var13.method1970(var14, false);
        }
        class309 var18 = arg0.method168(var16, var17, !this.field4042);
        var18.method2068(var8, var9, var10, arg3, arg4 - 1, var7, this.field4042);
        if (var12 != null) {
            var18.method2068(var12, var15, var13, var14, arg4 - 1, var7, this.field4042);
        }
        return var18;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIBLbg;)Lbg;", line = 466)
    public final class309 method1747(int arg0, int arg1, int arg2, byte arg3, class309 arg4) {
        int var6 = -9 % ((-arg3) / 62);
        int var7 = this.field4041[arg2];
        int var8 = this.field4044[arg2];
        field4056++;
        class294 var9 = class87.method615(0, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method144(true, true, true);
        }
        class294 var11 = null;
        if ((this.field4061 || class194.field3131) && arg1 != -1 && this.field4044.length > arg1) {
            int var12 = this.field4044[arg1];
            var11 = class87.method615(0, var12 >> 16);
            arg1 = var12 & 0xFFFF;
        }
        class309 var13;
        if (var11 == null) {
            var13 = arg4.method144(!var9.method1971(-97, var10), !var9.method1970(var10, false), !this.field4042);
        } else {
            var13 = arg4.method144(!var9.method1971(107, var10) & !var11.method1971(-121, arg1), !var9.method1970(var10, false) & !var11.method1970(arg1, false), !this.field4042);
        }
        var13.method2068(var9, var10, var11, arg1, arg0 - 1, var7, this.field4042);
        return var13;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V", line = 509)
    public static final void method1748(int arg0) {
        field4045++;
        class148 var1 = class277.field4249;
        synchronized (class277.field4249) {
            class119.field2074 = class283.field4378;
            class31.field569++;
            if (class280.field4312 < arg0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class342.field5317[var2] = false;
                }
                class280.field4312 = class235.field3703;
            } else {
                while (class280.field4312 != class235.field3703) {
                    int var3 = class164.field2656[class235.field3703];
                    class235.field3703 = class235.field3703 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class342.field5317[var3] = true;
                    } else {
                        class342.field5317[~var3] = false;
                    }
                }
            }
            class283.field4378 = class136.field2280;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILag;)V", line = 558)
    private final void method1749(int arg0, int arg1, class202 arg2) {
        field4064++;
        if (arg1 == 1) {
            int var4 = arg2.method1315(14289);
            this.field4041 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4041[var5] = arg2.method1315(arg0 + 14292);
            }
            this.field4044 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4044[var6] = arg2.method1315(class331.method2296(arg0, -14292));
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4044[var7] += arg2.method1315(14289) << 16;
            }
        } else if (arg1 == 2) {
            this.field4039 = arg2.method1315(arg0 + 14292);
        } else if (arg1 == 3) {
            this.field4036 = new boolean[256];
            int var15 = arg2.method1317((byte) -87);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4036[arg2.method1317((byte) -91)] = true;
            }
        } else if (arg1 == 4) {
            this.field4051 = true;
        } else if (arg1 == 5) {
            this.field4035 = arg2.method1317((byte) -109);
        } else if (arg1 == 6) {
            this.field4069 = arg2.method1315(14289);
        } else if (arg1 == 7) {
            this.field4058 = arg2.method1315(14289);
        } else if (arg1 == 8) {
            this.field4054 = arg2.method1317((byte) -120);
        } else if (arg1 == 9) {
            this.field4057 = arg2.method1317((byte) -107);
        } else if (arg1 == 10) {
            this.field4063 = arg2.method1317((byte) -119);
        } else if (arg1 == 11) {
            this.field4038 = arg2.method1317((byte) -101);
        } else if (arg1 == 12) {
            int var8 = arg2.method1317((byte) -123);
            this.field4037 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4037[var9] = arg2.method1315(14289);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field4037[var10] += arg2.method1315(14289) << 16;
            }
        } else if (arg1 == 13) {
            int var11 = arg2.method1315(14289);
            this.field4070 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg2.method1317((byte) -96);
                if (var13 > 0) {
                    this.field4070[var12] = new int[var13];
                    this.field4070[var12][0] = arg2.method1352((byte) -56);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field4070[var12][var14] = arg2.method1315(14289);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4042 = true;
        } else if (arg1 == 15) {
            this.field4061 = true;
        } else if (arg1 == 16) {
            this.field4060 = true;
        }
        if (arg0 != -3) {
            this.field4037 = (int[]) null;
        }
    }
}
