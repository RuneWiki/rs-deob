import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class15 extends class170 {

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "Z")
    public static boolean field403 = true;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "Lvf;")
    public static class296 field405 = new class296();

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "Lmh;")
    public static class128 field408 = class22.method156(123, "welle2:");

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "Lmh;")
    public static class128 field410 = class22.method156(126, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "Z")
    public static boolean field411 = false;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "Lhf;")
    public static class191 field407;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lem;ZZ)V", line = 7)
    public static final void method112(class10 arg0, boolean arg1, boolean arg2) {
        field396++;
        int var3 = arg0.field349 == 0 ? arg0.field226 : arg0.field349;
        int var4 = arg0.field307 == 0 ? arg0.field260 : arg0.field307;
        class290.method2000(arg1, var4, var3, (byte) -95, arg0.field230, class200.field3508[arg0.field230 >> 16]);
        if (arg0.field348 != null) {
            class290.method2000(arg1, var4, var3, (byte) -83, arg0.field230, arg0.field348);
        }
        class88 var5 = (class88) class182.field3198.method728(arg2, (long) arg0.field230);
        if (var5 != null) {
            class214.method1485(var5.field1510, var3, var4, (byte) -6, arg1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V", line = 33)
    public static final void method113(int arg0) {
        class205.field3614 = null;
        class178.field3128 = null;
        if (arg0 <= 25) {
            method112((class10) null, true, true);
        }
        class125.field2106 = null;
        field397++;
        class151.field2607 = null;
        class266.field4603 = null;
        class157.field2690 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILbg;B)V", line = 50)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 == 13) {
            field400++;
            if (arg0 == 0) {
                this.field2970 = arg1.method1325(7627) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ldj;ZILdj;I)Lme;", line = 66)
    public static final class178 method114(class314 arg0, boolean arg1, int arg2, class314 arg3, int arg4) {
        field402++;
        boolean var5 = true;
        int[] var6 = arg3.method2145(arg4, 0);
        int var7 = 0;
        int var8 = -101 / ((49 - arg2) / 60);
        while (var6.length > var7) {
            byte[] var9 = arg3.method2163(arg4, var6[var7], 12689);
            if (var9 == null) {
                var5 = false;
            } else {
                int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
                byte[] var11;
                if (arg1) {
                    var11 = arg0.method2163(0, var10, 12689);
                } else {
                    var11 = arg0.method2163(var10, 0, 12689);
                }
                if (var11 == null) {
                    var5 = false;
                }
            }
            var7++;
        }
        if (!var5) {
            return null;
        }
        try {
            return new class178(arg3, arg0, arg4, arg1);
        } catch (Exception var13) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 118)
    public class15() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)[I", line = 127)
    public final int[] method69(byte arg0, int arg1) {
        field401++;
        if (arg0 != 85) {
            return (int[]) null;
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 0, arg1);
            int[] var5 = this.method1142((byte) 44, 1, arg1);
            int[] var6 = this.method1142((byte) 44, 2, arg1);
            for (int var7 = 0; var7 < class185.field3225; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLbg;)V", line = 190)
    public static final void method115(byte arg0, class194 arg1) {
        field404++;
        if (class310.field5257 != null) {
            try {
                class310.field5257.method348(0L, 0);
                class310.field5257.method347((byte) -103, arg1.field3380, 24, arg1.field3417);
            } catch (Exception var3) {
            }
        }
        if (arg0 >= -84) {
            field407 = (class191) null;
        }
        arg1.field3380 += 24;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(B)V", line = 210)
    public static void method116(byte arg0) {
        field405 = null;
        field407 = null;
        field408 = null;
        if (arg0 != -10) {
            field411 = true;
        }
        field410 = null;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V", line = 229)
    public static final void method117(int arg0) {
        field399++;
        if (class3.field64 > class143.field2438) {
            class143.field2438 = (float) ((double) class143.field2438 / 30.0D + (double) class143.field2438);
            if (class143.field2438 > class3.field64) {
                class143.field2438 = class3.field64;
            }
            class130.method874(-1);
        } else if (class3.field64 < class143.field2438) {
            class143.field2438 = (float) ((double) class143.field2438 - (double) class143.field2438 / 30.0D);
            if (class3.field64 > class143.field2438) {
                class143.field2438 = class3.field64;
            }
            class130.method874(-1);
        }
        if (arg0 > -122) {
            method116((byte) -114);
        }
        if (class30.field663 == -1 || class102.field1756 == -1) {
            return;
        }
        int var1 = class30.field663 - class143.field2441;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class143.field2441 += var1;
        int var2 = class102.field1756 - class310.field5255;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class310.field5255 += var2;
        if (var1 == 0 && var2 == 0) {
            class102.field1756 = -1;
            class30.field663 = -1;
        }
        class130.method874(-1);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I", line = 297)
    public final int[][] method62(int arg0, int arg1) {
        field398++;
        int[][] var3 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[] var4 = this.method1142((byte) 44, 2, arg0);
            int[][] var5 = this.method1139(0, arg0, 0);
            int[][] var6 = this.method1139(0, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var5[1];
            int[] var11 = var3[2];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class185.field3225; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var9[var16];
                    var8[var16] = var10[var16];
                    var11[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var11[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                    var11[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        int var19 = -20 / ((-arg1 - 24) / 46);
        return var3;
    }
}
