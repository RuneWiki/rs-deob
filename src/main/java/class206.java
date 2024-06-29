import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class206 extends class359 {

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "Ljava/lang/String;")
    public String field2813;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "Z")
    public static boolean field2803 = false;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "Z")
    public static boolean field2805 = false;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2807 = "rating: ";

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "[I")
    public static int[] field2811 = new int[5];

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "Lsm;")
    public static class156 field2802;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)I")
    public static final int method1304(int arg0, int arg1) {
        if (arg1 <= 19) {
            field2805 = true;
        }
        field2809++;
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public static void method1305(int arg0) {
        int var1 = 86 / ((-arg0 - 36) / 49);
        field2807 = null;
        field2802 = null;
        field2811 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljf;ZI)I")
    public static final int method1306(class119 arg0, boolean arg1, int arg2) {
        field2808++;
        if (arg0.field1582 == null || arg0.field1582.length <= arg2) {
            return -2;
        }
        try {
            int[] var3 = arg0.field1582[arg2];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            if (!arg1) {
                return -121;
            }
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class423.field6068[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class215.field2931[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class143.field2028[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class119 var12 = class179.method1170(var11, 818041328);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class392.method2498(var13, -109).field3592 || class166.field2325)) {
                        for (int var14 = 0; var14 < var12.field1580.length; var14++) {
                            if (var13 + 1 == var12.field1580[var14]) {
                                var8 += var12.field1592[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class283.field3972[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class95.field1062[class215.field2931[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class283.field3972[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class390.field5715.field1827;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class155.field2207[var15]) {
                            var8 += class215.field2931[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class119 var18 = class179.method1170(var17, 818041328);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class392.method2498(var19, -108).field3592 || class166.field2325)) {
                        for (int var20 = 0; var20 < var18.field1580.length; var20++) {
                            if (var19 + 1 == var18.field1580[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class406.field5899;
                }
                if (var7 == 12) {
                    var8 = class267.field3743;
                }
                if (var7 == 13) {
                    int var21 = class283.field3972[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class16.method112(30673, var23);
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 18) {
                    var8 = (class390.field5715.field1304 >> 7) + class40.field427;
                }
                if (var7 == 19) {
                    var8 = (class390.field5715.field1311 >> 7) + class217.field2975;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(DI)V")
    public static final void method1307(double arg0, int arg1) {
        if (arg1 != 0) {
            field2806 = 84;
        }
        field2804++;
        if (class16.field165 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class323.field4552[var3] = var4 <= 255 ? var4 : 255;
        }
        class16.field165 = arg0;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)V")
    public static final void method1308(byte arg0) {
        class331 var1 = class424.field6079;
        synchronized (class424.field6079) {
            class424.field6079.method2043(-103);
        }
        int var2 = 64 / ((arg0 - 35) / 36);
        field2810++;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
    public class206() {
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class206(String arg0) {
        this.field2813 = arg0;
    }
}
