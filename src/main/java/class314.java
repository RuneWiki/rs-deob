import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class314 extends class68 {

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public int field5396 = 0;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Lce;")
    public static class126 field5376 = class206.method1445(-7923, "V-Brification des mises -9 jour )2 ");

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Lce;")
    public static class126 field5381 = class206.method1445(-7923, "ul");

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "Lce;")
    public static class126 field5395 = class206.method1445(-7923, "<col=ffffff>");

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "Z")
    public static boolean field5394 = false;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public int field5375;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public int field5377;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public int field5380;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public int field5384;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public int field5387;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public int field5389;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public int field5390;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public int field5399;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public int field5400;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public int field5402;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "Lte;")
    public class265 field5383;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "Lqf;")
    public class295 field5382;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "Lqf;")
    public class295 field5398;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "Lcj;")
    public class301 field5386;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Lui;")
    public class89 field5379;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "Z")
    public boolean field5391;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "[I")
    public int[] field5374;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "[[B")
    public static byte[][] field5388;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "[[I")
    public static int[][] field5392;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "[[I")
    public static int[][] field5393;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lcc;B)I", line = 7)
    public static final int method2191(class313 arg0, byte arg1) {
        field5397++;
        int var2 = 0;
        if (arg0.method2166(-28257, class23.field318)) {
            var2++;
        }
        if (arg0.method2166(arg1 - 28340, class251.field4195)) {
            var2++;
        }
        return arg1 == 83 ? var2 : -124;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 34)
    public static void method2192(int arg0) {
        field5388 = (byte[][]) null;
        field5393 = (int[][]) null;
        field5381 = null;
        field5392 = (int[][]) null;
        field5376 = null;
        field5395 = null;
        if (arg0 != 22142) {
            field5392 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBLcj;II)V", line = 50)
    public static final void method2193(int arg0, byte arg1, class301 arg2, int arg3, int arg4) {
        field5401++;
        if (class286.field4744 == arg2 || class173.field3067 >= 400) {
            return;
        }
        class126 var5;
        if (arg2.field4986 == 0) {
            boolean var6 = true;
            if (class286.field4744.field4982 != -1 && arg2.field4982 != -1) {
                int var7 = arg2.field4982 <= class286.field4744.field4982 ? arg2.field4982 : class286.field4744.field4982;
                int var8 = class286.field4744.field5020 > arg2.field5020 ? class286.field4744.field5020 : arg2.field5020;
                int var9 = var8 * 10 / 100 + var7 + 5;
                int var10 = class286.field4744.field5020 - arg2.field5020;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            class126 var11 = class23.field335 == 1 ? class226.field3800 : class28.field388;
            if (arg2.field5020 < arg2.field4991) {
                var5 = class12.method69(new class126[] { arg2.method2025(96), var6 ? class58.method399(14609, class286.field4744.field5020, arg2.field5020) : field5395, class194.field3303, var11, class195.method1386((byte) 20, arg2.field5020), class249.field4175, class195.method1386((byte) 20, arg2.field4991 - arg2.field5020), class15.field210 }, (byte) 123);
            } else {
                var5 = class12.method69(new class126[] { arg2.method2025(65), var6 ? class58.method399(14609, class286.field4744.field5020, arg2.field5020) : field5395, class194.field3303, var11, class195.method1386((byte) 20, arg2.field5020), class15.field210 }, (byte) 118);
            }
        } else {
            var5 = class12.method69(new class126[] { arg2.method2025(89), class194.field3303, class294.field4907, class195.method1386((byte) 20, arg2.field4986), class15.field210 }, (byte) 124);
        }
        if (class257.field4316 == 1) {
            class224.method1536(class12.method69(new class126[] { class279.field4640, class238.field4016, var5 }, (byte) 126), class286.field4731, -116, arg4, (short) 11, (long) arg0, class96.field1538, arg3);
            class315.field5408++;
        } else if (!class313.field5371) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class76.field1245[var12] != null) {
                    class139.field2521++;
                    short var13 = 0;
                    if (class23.field335 == 0 && class76.field1245[var12].method881(class13.field175, (byte) 92)) {
                        if (arg2.field5020 > class286.field4744.field5020) {
                            var13 = 2000;
                        }
                        if (class286.field4744.field4995 != 0 && arg2.field4995 != 0) {
                            if (class286.field4744.field4995 == arg2.field4995) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class313.field5343[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class125.field2110[var12];
                    short var16 = (short) (var13 + var15);
                    class224.method1536(class12.method69(new class126[] { field5395, var5 }, (byte) 118), class76.field1245[var12], -123, arg4, var16, (long) arg0, class212.field3618[var12], arg3);
                }
            }
        } else if ((class9.field105 & 0x8) == 8) {
            class224.method1536(class12.method69(new class126[] { class187.field3236, class238.field4016, var5 }, (byte) 118), class85.field1345, -119, arg4, (short) 43, (long) arg0, -1, arg3);
            class98.field1577++;
        }
        if (arg1 > -118) {
            field5395 = (class126) null;
        }
        for (int var17 = 0; var17 < class173.field3067; var17++) {
            if (class84.field1341[var17] == 32) {
                class214.field3636[var17] = class12.method69(new class126[] { field5395, var5 }, (byte) 123);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V", line = 203)
    public final void method2194(byte arg0) {
        field5385++;
        int var2 = this.field5387;
        if (this.field5383 != null) {
            class265 var3 = this.field5383.method1788(-1);
            if (var3 == null) {
                this.field5390 = 0;
                this.field5399 = 0;
                this.field5380 = 0;
                this.field5374 = null;
                this.field5387 = -1;
            } else {
                this.field5390 = var3.field4480;
                this.field5374 = var3.field4464;
                this.field5387 = var3.field4485;
                this.field5380 = var3.field4438 * 128;
                this.field5399 = var3.field4449;
            }
        } else if (this.field5379 != null) {
            int var4 = class253.method1716(true, this.field5379);
            if (var2 != var4) {
                this.field5387 = var4;
                class304 var5 = this.field5379.field1389;
                if (var5.field5059 != null) {
                    var5 = var5.method2038((byte) 106);
                }
                if (var5 == null) {
                    this.field5380 = 0;
                } else {
                    this.field5380 = var5.field5060 * 128;
                }
            }
        } else if (this.field5386 != null) {
            this.field5387 = class260.method1761((byte) 124, this.field5386);
            this.field5380 = this.field5386.field5023 * 128;
        }
        if (this.field5387 != var2 && this.field5382 != null) {
            class278.field4633.method562(this.field5382);
            this.field5382 = null;
        }
        if (arg0 != -101) {
            this.method2194((byte) -88);
        }
    }
}
