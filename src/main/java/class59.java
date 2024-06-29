import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class59 {

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    private int field1068 = -1;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    private int field1077 = 0;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lij;")
    private class175 field1069 = new class175();

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
    public boolean field1080 = false;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[Lqj;")
    private class211[] field1061;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "[[[I")
    private int[][][] field1074;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[I")
    public static int[] field1063 = new int[32];

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[I")
    public static int[] field1065 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lke;")
    public static class256 field1070;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lvm;")
    public static class297 field1071;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lke;")
    public static class256 field1076;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static volatile int field1075;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "Llj;")
    public static class261 field1078;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lil;IIIIIIZ)V", line = 8)
    public static final void method461(class3 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field43.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field43[var9] - class310.field5346;
            int var11 = arg0.field45[var9] - field1079;
            int var12 = arg0.field39[var9] - class271.field4623;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field35 != null) {
                class3.field34[var9] = var13;
                class3.field41[var9] = var16;
                class3.field50[var9] = var17;
            }
            class3.field36[var9] = (var13 << 9) / var17 + class136.field2375;
            class3.field40[var9] = (var16 << 9) / var17 + class136.field2374;
        }
        class136.field2377 = 0;
        int var19 = arg0.field42.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field42[var20];
            int var22 = arg0.field46[var20];
            int var23 = arg0.field48[var20];
            int var24 = class3.field36[var21];
            int var25 = class3.field36[var22];
            int var26 = class3.field36[var23];
            int var27 = class3.field40[var21];
            int var28 = class3.field40[var22];
            int var29 = class3.field40[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class14.field187 && class5.method42(class136.field2375 + class135.field2353, class303.field5244 + class136.field2374, var27, var28, var29, var24, var25, var26)) {
                    class91.field1666 = arg5;
                    class160.field2847 = arg6;
                }
                if (!class253.field4323 && !arg7) {
                    class136.field2365 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class136.field2360 || var25 > class136.field2360 || var26 > class136.field2360) {
                        class136.field2365 = true;
                    }
                    if (arg0.field35 == null || arg0.field35[var20] == -1) {
                        if (arg0.field44[var20] != 12345678) {
                            class136.method971(var27, var28, var29, var24, var25, var26, arg0.field44[var20], arg0.field32[var20], arg0.field49[var20]);
                        }
                    } else if (!class11.field165) {
                        int var30 = class136.field2373.method190(arg0.field35[var20], 65535);
                        class136.method971(var27, var28, var29, var24, var25, var26, class285.method1998(var30, arg0.field44[var20]), class285.method1998(var30, arg0.field32[var20]), class285.method1998(var30, arg0.field49[var20]));
                    } else if (arg0.field47) {
                        class136.method979(var27, var28, var29, var24, var25, var26, arg0.field44[var20], arg0.field32[var20], arg0.field49[var20], class3.field34[0], class3.field34[1], class3.field34[3], class3.field41[0], class3.field41[1], class3.field41[3], class3.field50[0], class3.field50[1], class3.field50[3], arg0.field35[var20]);
                    } else {
                        class136.method979(var27, var28, var29, var24, var25, var26, arg0.field44[var20], arg0.field32[var20], arg0.field49[var20], class3.field34[var21], class3.field34[var22], class3.field34[var23], class3.field41[var21], class3.field41[var22], class3.field41[var23], class3.field50[var21], class3.field50[var22], class3.field50[var23], arg0.field35[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 120)
    public static void method462(int arg0) {
        field1078 = null;
        field1065 = null;
        if (arg0 != -4664) {
            field1070 = (class256) null;
        }
        field1071 = null;
        field1070 = null;
        field1063 = null;
        field1076 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1063[var1] = var0 - 1;
            var0 += var0;
        }
        field1070 = class316.method2202("Lade Schrifts-=tze )2 ", 27626);
        field1071 = new class297(260);
        field1076 = class316.method2202("M", 27626);
        field1075 = -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[[I", line = 151)
    public final int[][] method463(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method465((byte) 54);
        }
        field1073++;
        if (this.field1064 == this.field1060) {
            this.field1080 = this.field1061[arg0] == null;
            this.field1061[arg0] = class273.field4679;
            return this.field1074[arg0];
        } else if (this.field1064 == 1) {
            this.field1080 = this.field1068 != arg0;
            this.field1068 = arg0;
            return this.field1074[0];
        } else {
            class211 var3 = this.field1061[arg0];
            if (var3 == null) {
                this.field1080 = true;
                if (this.field1077 >= this.field1064) {
                    class211 var4 = (class211) this.field1069.method1272(true);
                    var3 = new class211(arg0, var4.field3797);
                    this.field1061[var4.field3798] = null;
                    var4.method1199(21966);
                } else {
                    var3 = new class211(arg0, this.field1077);
                    this.field1077++;
                }
                this.field1061[arg0] = var3;
            } else {
                this.field1080 = false;
            }
            this.field1069.method1273(19402, var3);
            return this.field1074[var3.field3797];
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)[[[I", line = 237)
    public final int[][][] method464(int arg0) {
        field1066++;
        if (this.field1064 != this.field1060) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != -31281) {
            method462(82);
        }
        while (this.field1064 > var2) {
            this.field1061[var2] = class273.field4679;
            var2++;
        }
        return this.field1074;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 265)
    public final void method465(byte arg0) {
        if (arg0 != 14) {
            field1065 = (int[]) null;
        }
        for (int var2 = 0; var2 < this.field1064; var2++) {
            this.field1074[var2][0] = null;
            this.field1074[var2][1] = null;
            this.field1074[var2][2] = null;
            this.field1074[var2] = (int[][]) null;
        }
        this.field1061 = null;
        this.field1074 = (int[][][]) null;
        field1072++;
        this.field1069.method1275((byte) -98);
        this.field1069 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(III)V", line = 350)
    public class59(int arg0, int arg1, int arg2) {
        this.field1064 = arg0;
        this.field1060 = arg1;
        this.field1061 = new class211[this.field1060];
        this.field1074 = new int[this.field1064][3][arg2];
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 293)
    public static final void method466(boolean arg0) {
        class167 var1 = class129.field2261;
        synchronized (class129.field2261) {
            class31.field500++;
            class287.field4978 = class15.field195;
            class286.field4963 = field1075;
            class208.field3762 = class86.field1544;
            class83.field1503 = class292.field5048;
            if (arg0) {
                method461((class3) null, -52, -96, 24, -65, 93, -17, false);
            }
            class311.field5365 = client.field2141;
            class160.field2855 = class155.field2767;
            class21.field282 = class101.field1824;
            class292.field5048 = 0;
        }
        field1062++;
    }
}
