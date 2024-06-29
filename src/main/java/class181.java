import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class181 {

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public int field2842 = -1;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public int field2850 = -1;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field2835 = -1;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public int field2843 = -1;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public int field2851 = 99;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Z")
    public boolean field2846 = false;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Z")
    public boolean field2830 = false;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public int field2847 = 2;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public int field2855 = 5;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
    public boolean field2856 = false;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Z")
    public boolean field2845 = false;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public int field2858 = -1;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[I")
    public int[] field2836;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[I")
    private int[] field2837;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[I")
    public int[] field2848;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[Z")
    public boolean[] field2857;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[[I")
    public int[][] field2838;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final void method1226(int arg0) {
        if (arg0 != 2) {
            this.method1230(-69, (class221) null);
        }
        field2832++;
        if (this.field2842 == -1) {
            if (this.field2857 == null) {
                this.field2842 = 0;
            } else {
                this.field2842 = 2;
            }
        }
        if (this.field2843 != -1) {
            return;
        }
        if (this.field2857 == null) {
            this.field2843 = 0;
        } else {
            this.field2843 = 2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static final void method1227(int arg0) {
        field2839++;
        if (arg0 == 1502) {
            class133.field2122.method472((byte) -63);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBLoi;II)Loi;")
    public final class80 method1228(int arg0, int arg1, byte arg2, class80 arg3, int arg4, int arg5) {
        field2853++;
        int var7 = this.field2836[arg4];
        int var8 = this.field2848[arg4];
        class129 var9 = class186.method1264(var8 >> 16, true);
        int var10 = var8 & 0xFFFF;
        if (arg2 > -47) {
            this.field2857 = null;
        }
        if (var9 == null) {
            return arg3.method576(true, true, true);
        }
        int var11 = arg5 & 0x3;
        class129 var12 = null;
        if ((this.field2845 || class106.field1690) && arg1 != -1 && arg1 < this.field2848.length) {
            int var13 = this.field2848[arg1];
            var12 = class186.method1264(var13 >> 16, true);
            arg1 = var13 & 0xFFFF;
        }
        class80 var14;
        if (var12 == null) {
            var14 = arg3.method576(!var9.method913(-110, var10), !var9.method920(var10, (byte) 91), !this.field2830);
        } else {
            var14 = arg3.method576(!var9.method913(-105, var10) & !var12.method913(-122, arg1), !var9.method920(var10, (byte) 108) & !var12.method920(arg1, (byte) 103), !this.field2830);
        }
        if (var11 == 1) {
            var14.method581();
        } else if (var11 == 2) {
            var14.method575();
        } else if (var11 == 3) {
            var14.method561();
        }
        var14.method566(var9, var10, var12, arg1, arg0 - 1, var7, this.field2830);
        if (var11 == 1) {
            var14.method561();
        } else if (var11 == 2) {
            var14.method575();
        } else if (var11 == 3) {
            var14.method581();
        }
        return var14;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIILoi;)Loi;")
    public final class80 method1229(int arg0, int arg1, int arg2, int arg3, class80 arg4) {
        field2841++;
        int var6 = this.field2836[arg3];
        int var7 = this.field2848[arg3];
        class129 var8 = class186.method1264(var7 >> 16, true);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method574(true, true, true);
        }
        class129 var10 = null;
        if ((this.field2845 || class106.field1690) && arg0 != -1 && this.field2848.length > arg0) {
            int var11 = this.field2848[arg0];
            var10 = class186.method1264(var11 >> 16, true);
            arg0 = var11 & 0xFFFF;
        }
        class129 var12 = null;
        class129 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field2837 != null) {
            if (this.field2837.length > arg3) {
                var15 = this.field2837[arg3];
                if (var15 != 65535) {
                    var12 = class186.method1264(var15 >> 16, true);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2845 || class106.field1690) && arg0 != -1 && arg0 < this.field2837.length) {
                var14 = this.field2837[arg0];
                if (var14 != 65535) {
                    var13 = class186.method1264(var14 >> 16, true);
                    var14 &= 0xFFFF;
                }
            }
        }
        if (arg2 != -10611) {
            return null;
        }
        boolean var16 = !var8.method913(-89, var9);
        boolean var17 = !var8.method920(var9, (byte) 109);
        if (var12 != null) {
            var16 &= !var12.method913(-93, var15);
            var17 &= !var12.method920(var15, (byte) 109);
        }
        if (var10 != null) {
            var16 &= !var10.method913(-86, arg0);
            var17 &= !var10.method920(arg0, (byte) 100);
        }
        if (var13 != null) {
            var16 &= !var13.method913(-93, var14);
            var17 &= !var13.method920(var14, (byte) 115);
        }
        class80 var18 = arg4.method574(var16, var17, !this.field2830);
        var18.method566(var8, var9, var10, arg0, arg1 - 1, var6, this.field2830);
        if (var12 != null) {
            var18.method566(var12, var15, var13, var14, arg1 - 1, var6, this.field2830);
        }
        return var18;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILog;)V")
    public final void method1230(int arg0, class221 arg1) {
        if (arg0 <= 44) {
            return;
        }
        while (true) {
            int var3 = arg1.method1517((byte) -96);
            if (var3 == 0) {
                field2834++;
                return;
            }
            this.method1232(108, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILoi;III)Loi;")
    public final class80 method1231(int arg0, class80 arg1, int arg2, int arg3, int arg4) {
        field2844++;
        int var6 = this.field2836[arg3];
        int var7 = this.field2848[arg3];
        class129 var8 = class186.method1264(var7 >> 16, true);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method572(true, true, true);
        }
        if (arg0 != 356782832) {
            this.field2850 = -77;
        }
        class129 var10 = null;
        if ((this.field2845 || class106.field1690) && arg4 != -1 && arg4 < this.field2848.length) {
            int var11 = this.field2848[arg4];
            var10 = class186.method1264(var11 >> 16, true);
            arg4 = var11 & 0xFFFF;
        }
        class80 var12;
        if (var10 == null) {
            var12 = arg1.method572(!var8.method913(-107, var9), !var8.method920(var9, (byte) 115), !this.field2830);
        } else {
            var12 = arg1.method572(!var8.method913(-106, var9) & !var10.method913(-128, arg4), !var8.method920(var9, (byte) 124) & !var10.method920(arg4, (byte) 97), !this.field2830);
        }
        var12.method566(var8, var9, var10, arg4, arg2 - 1, var6, this.field2830);
        return var12;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILog;)V")
    private final void method1232(int arg0, int arg1, class221 arg2) {
        if (arg1 == 1) {
            int var13 = arg2.method1521((byte) 113);
            this.field2836 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2836[var14] = arg2.method1521((byte) 113);
            }
            this.field2848 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2848[var15] = arg2.method1521((byte) 113);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2848[var16] += arg2.method1521((byte) 113) << 16;
            }
        } else if (arg1 == 2) {
            this.field2858 = arg2.method1521((byte) 113);
        } else if (arg1 == 3) {
            this.field2857 = new boolean[256];
            int var4 = arg2.method1517((byte) -96);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2857[arg2.method1517((byte) -96)] = true;
            }
        } else if (arg1 == 4) {
            this.field2856 = true;
        } else if (arg1 == 5) {
            this.field2855 = arg2.method1517((byte) -96);
        } else if (arg1 == 6) {
            this.field2850 = arg2.method1521((byte) 113);
        } else if (arg1 == 7) {
            this.field2835 = arg2.method1521((byte) 113);
        } else if (arg1 == 8) {
            this.field2851 = arg2.method1517((byte) -96);
        } else if (arg1 == 9) {
            this.field2842 = arg2.method1517((byte) -96);
        } else if (arg1 == 10) {
            this.field2843 = arg2.method1517((byte) -96);
        } else if (arg1 == 11) {
            this.field2847 = arg2.method1517((byte) -96);
        } else if (arg1 == 12) {
            int var10 = arg2.method1517((byte) -96);
            this.field2837 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2837[var11] = arg2.method1521((byte) 113);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2837[var12] += arg2.method1521((byte) 113) << 16;
            }
        } else if (arg1 == 13) {
            int var6 = arg2.method1521((byte) 113);
            this.field2838 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1517((byte) -96);
                if (var8 > 0) {
                    this.field2838[var7] = new int[var8];
                    this.field2838[var7][0] = arg2.method1531(65280);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field2838[var7][var9] = arg2.method1521((byte) 113);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2830 = true;
        } else if (arg1 == 15) {
            this.field2845 = true;
        } else if (arg1 == 16) {
            this.field2846 = true;
        }
        field2852++;
        if (arg0 < 40) {
            method1227(-55);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2831++;
        if (class255.field4055 <= arg0 && arg1 <= class9.field128 && arg5 >= class161.field2561 && class51.field896 >= arg3) {
            class204.method1410(arg3, 36, arg1, arg5, arg2, arg0);
        } else {
            class231.method1614(arg0, (byte) -107, arg5, arg3, arg1, arg2);
        }
        if (arg4 != 3) {
            field2849 = 91;
        }
    }
}
